import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SFXLZPAR")
public class class47 implements Runnable {

    @OriginalMember(owner = "SFXLZPAR", name = "a", descriptor = "Z")
    private boolean field1233 = true;

    @OriginalMember(owner = "SFXLZPAR", name = "e", descriptor = "Z")
    private boolean field1237 = false;

    @OriginalMember(owner = "SFXLZPAR", name = "j", descriptor = "Z")
    private boolean field1242 = false;

    @OriginalMember(owner = "SFXLZPAR", name = "k", descriptor = "Z")
    private boolean field1243 = false;

    @OriginalMember(owner = "SFXLZPAR", name = "f", descriptor = "LMUZNSFEY;")
    public class35 field1238;

    @OriginalMember(owner = "SFXLZPAR", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field1236;

    @OriginalMember(owner = "SFXLZPAR", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field1234;

    @OriginalMember(owner = "SFXLZPAR", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1235;

    @OriginalMember(owner = "SFXLZPAR", name = "h", descriptor = "I")
    private int field1240;

    @OriginalMember(owner = "SFXLZPAR", name = "i", descriptor = "I")
    private int field1241;

    @OriginalMember(owner = "SFXLZPAR", name = "g", descriptor = "[B")
    private byte[] field1239;

    @OriginalMember(owner = "SFXLZPAR", name = "<init>", descriptor = "(ZLMUZNSFEY;Ljava/net/Socket;)V")
    public class47(boolean arg0, class35 arg1, Socket arg2) throws IOException {
        this.field1238 = arg1;
        this.field1236 = arg2;
        this.field1236.setSoTimeout(30000);
        this.field1236.setTcpNoDelay(true);
        this.field1234 = this.field1236.getInputStream();
        this.field1235 = this.field1236.getOutputStream();
        if (arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "SFXLZPAR", name = "a", descriptor = "()V")
    public void method397() {
        this.field1237 = true;
        try {
            if (this.field1234 != null) {
                this.field1234.close();
            }
            if (this.field1235 != null) {
                this.field1235.close();
            }
            if (this.field1236 != null) {
                this.field1236.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1242 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1239 = null;
    }

    @OriginalMember(owner = "SFXLZPAR", name = "b", descriptor = "()I")
    public int method398() throws IOException {
        return this.field1237 ? 0 : this.field1234.read();
    }

    @OriginalMember(owner = "SFXLZPAR", name = "c", descriptor = "()I")
    public int method399() throws IOException {
        return this.field1237 ? 0 : this.field1234.available();
    }

    @OriginalMember(owner = "SFXLZPAR", name = "a", descriptor = "([BII)V")
    public void method400(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1237) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1234.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "SFXLZPAR", name = "a", descriptor = "(III[B)V")
    public void method401(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field1237) {
            return;
        }
        if (this.field1243) {
            this.field1243 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1239 == null) {
            this.field1239 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field1239[this.field1241] = arg3[arg2 + var6];
                this.field1241 = (this.field1241 + 1) % 5000;
                if ((this.field1240 + 4900) % 5000 == this.field1241) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1242) {
                this.field1242 = true;
                this.field1238.method141(this, 3);
            }
            this.notify();
        }
        if (arg1 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "SFXLZPAR", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1242) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1241 == this.field1240) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1242) {
                    return;
                }
                var2 = this.field1240;
                if (this.field1241 >= this.field1240) {
                    var3 = this.field1241 - this.field1240;
                } else {
                    var3 = 5000 - this.field1240;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1235.write(this.field1239, var2, var3);
                } catch (IOException var7) {
                    this.field1243 = true;
                }
                this.field1240 = (this.field1240 + var3) % 5000;
                try {
                    if (this.field1241 == this.field1240) {
                        this.field1235.flush();
                    }
                } catch (IOException var6) {
                    this.field1243 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "SFXLZPAR", name = "a", descriptor = "(I)V")
    public void method402(int arg0) {
        System.out.println("dummy:" + this.field1237);
        if (arg0 != 0) {
            return;
        }
        System.out.println("tcycl:" + this.field1240);
        System.out.println("tnum:" + this.field1241);
        System.out.println("writer:" + this.field1242);
        System.out.println("ioerror:" + this.field1243);
        try {
            System.out.println("available:" + this.method399());
        } catch (IOException var2) {
        }
    }
}
