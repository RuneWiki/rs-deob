import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PTISUREQ")
public class class46 implements Runnable {

    @OriginalMember(owner = "client!PTISUREQ", name = "a", descriptor = "Z")
    private boolean field1257 = false;

    @OriginalMember(owner = "client!PTISUREQ", name = "e", descriptor = "Z")
    private boolean field1261 = false;

    @OriginalMember(owner = "client!PTISUREQ", name = "j", descriptor = "Z")
    private boolean field1266 = false;

    @OriginalMember(owner = "client!PTISUREQ", name = "k", descriptor = "Z")
    private boolean field1267 = false;

    @OriginalMember(owner = "client!PTISUREQ", name = "f", descriptor = "LVTYHSWDE;")
    public class59 field1262;

    @OriginalMember(owner = "client!PTISUREQ", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field1260;

    @OriginalMember(owner = "client!PTISUREQ", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field1258;

    @OriginalMember(owner = "client!PTISUREQ", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1259;

    @OriginalMember(owner = "client!PTISUREQ", name = "h", descriptor = "I")
    private int field1264;

    @OriginalMember(owner = "client!PTISUREQ", name = "i", descriptor = "I")
    private int field1265;

    @OriginalMember(owner = "client!PTISUREQ", name = "g", descriptor = "[B")
    private byte[] field1263;

    @OriginalMember(owner = "client!PTISUREQ", name = "<init>", descriptor = "(ILVTYHSWDE;Ljava/net/Socket;)V")
    public class46(int arg0, class59 arg1, Socket arg2) throws IOException {
        this.field1262 = arg1;
        this.field1260 = arg2;
        this.field1260.setSoTimeout(30000);
        this.field1260.setTcpNoDelay(true);
        this.field1258 = this.field1260.getInputStream();
        if (arg0 != 20196) {
            this.field1257 = !this.field1257;
        }
        this.field1259 = this.field1260.getOutputStream();
    }

    @OriginalMember(owner = "client!PTISUREQ", name = "a", descriptor = "()V")
    public void method407() {
        this.field1261 = true;
        try {
            if (this.field1258 != null) {
                this.field1258.close();
            }
            if (this.field1259 != null) {
                this.field1259.close();
            }
            if (this.field1260 != null) {
                this.field1260.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1266 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1263 = null;
    }

    @OriginalMember(owner = "client!PTISUREQ", name = "b", descriptor = "()I")
    public int method408() throws IOException {
        return this.field1261 ? 0 : this.field1258.read();
    }

    @OriginalMember(owner = "client!PTISUREQ", name = "c", descriptor = "()I")
    public int method409() throws IOException {
        return this.field1261 ? 0 : this.field1258.available();
    }

    @OriginalMember(owner = "client!PTISUREQ", name = "a", descriptor = "([BII)V")
    public void method410(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1261) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1258.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "client!PTISUREQ", name = "a", descriptor = "(BII[B)V")
    public void method411(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 != -32) {
            this.field1257 = !this.field1257;
        }
        if (this.field1261) {
            return;
        }
        if (this.field1267) {
            this.field1267 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1263 == null) {
            this.field1263 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field1263[this.field1265] = arg3[arg1 + var6];
                this.field1265 = (this.field1265 + 1) % 5000;
                if ((this.field1264 + 4900) % 5000 == this.field1265) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1266) {
                this.field1266 = true;
                this.field1262.method87(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "client!PTISUREQ", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1266) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1265 == this.field1264) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1266) {
                    return;
                }
                var2 = this.field1264;
                if (this.field1265 >= this.field1264) {
                    var3 = this.field1265 - this.field1264;
                } else {
                    var3 = 5000 - this.field1264;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1259.write(this.field1263, var2, var3);
                } catch (IOException var7) {
                    this.field1267 = true;
                }
                this.field1264 = (this.field1264 + var3) % 5000;
                try {
                    if (this.field1265 == this.field1264) {
                        this.field1259.flush();
                    }
                } catch (IOException var6) {
                    this.field1267 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!PTISUREQ", name = "a", descriptor = "(B)V")
    public void method412(byte arg0) {
        System.out.println("dummy:" + this.field1261);
        System.out.println("tcycl:" + this.field1264);
        System.out.println("tnum:" + this.field1265);
        if (arg0 != 7) {
            return;
        }
        System.out.println("writer:" + this.field1266);
        System.out.println("ioerror:" + this.field1267);
        try {
            System.out.println("available:" + this.method409());
        } catch (IOException var2) {
        }
    }
}
