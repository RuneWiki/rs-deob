import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SRCZZRYO")
public class class54 implements Runnable {

    @OriginalMember(owner = "client!SRCZZRYO", name = "a", descriptor = "I")
    private int field1412 = 9;

    @OriginalMember(owner = "client!SRCZZRYO", name = "b", descriptor = "I")
    private int field1413 = 6187;

    @OriginalMember(owner = "client!SRCZZRYO", name = "c", descriptor = "Z")
    private boolean field1414 = false;

    @OriginalMember(owner = "client!SRCZZRYO", name = "g", descriptor = "Z")
    private boolean field1418 = false;

    @OriginalMember(owner = "client!SRCZZRYO", name = "l", descriptor = "Z")
    private boolean field1423 = false;

    @OriginalMember(owner = "client!SRCZZRYO", name = "m", descriptor = "Z")
    private boolean field1424 = false;

    @OriginalMember(owner = "client!SRCZZRYO", name = "h", descriptor = "LEOQQYERM;")
    public class10 field1419;

    @OriginalMember(owner = "client!SRCZZRYO", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field1417;

    @OriginalMember(owner = "client!SRCZZRYO", name = "d", descriptor = "Ljava/io/InputStream;")
    private InputStream field1415;

    @OriginalMember(owner = "client!SRCZZRYO", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1416;

    @OriginalMember(owner = "client!SRCZZRYO", name = "j", descriptor = "I")
    private int field1421;

    @OriginalMember(owner = "client!SRCZZRYO", name = "k", descriptor = "I")
    private int field1422;

    @OriginalMember(owner = "client!SRCZZRYO", name = "i", descriptor = "[B")
    private byte[] field1420;

    @OriginalMember(owner = "client!SRCZZRYO", name = "<init>", descriptor = "(Ljava/net/Socket;ILEOQQYERM;)V")
    public class54(Socket arg0, int arg1, class10 arg2) throws IOException {
        this.field1419 = arg2;
        if (arg1 != 34706) {
            this.field1414 = !this.field1414;
        }
        this.field1417 = arg0;
        this.field1417.setSoTimeout(30000);
        this.field1417.setTcpNoDelay(true);
        this.field1415 = this.field1417.getInputStream();
        this.field1416 = this.field1417.getOutputStream();
    }

    @OriginalMember(owner = "client!SRCZZRYO", name = "a", descriptor = "()V")
    public void method456() {
        this.field1418 = true;
        try {
            if (this.field1415 != null) {
                this.field1415.close();
            }
            if (this.field1416 != null) {
                this.field1416.close();
            }
            if (this.field1417 != null) {
                this.field1417.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1423 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1420 = null;
    }

    @OriginalMember(owner = "client!SRCZZRYO", name = "b", descriptor = "()I")
    public int method457() throws IOException {
        return this.field1418 ? 0 : this.field1415.read();
    }

    @OriginalMember(owner = "client!SRCZZRYO", name = "c", descriptor = "()I")
    public int method458() throws IOException {
        return this.field1418 ? 0 : this.field1415.available();
    }

    @OriginalMember(owner = "client!SRCZZRYO", name = "a", descriptor = "([BII)V")
    public void method459(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1418) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1415.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "client!SRCZZRYO", name = "a", descriptor = "(II[BI)V")
    public void method460(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field1413 != arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (this.field1418) {
            return;
        }
        if (this.field1424) {
            this.field1424 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1420 == null) {
            this.field1420 = new byte[5000];
        }
        synchronized (this) {
            for (int var7 = 0; var7 < arg0; var7++) {
                this.field1420[this.field1422] = arg2[arg3 + var7];
                this.field1422 = (this.field1422 + 1) % 5000;
                if ((this.field1421 + 4900) % 5000 == this.field1422) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1423) {
                this.field1423 = true;
                this.field1419.method107(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "client!SRCZZRYO", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1423) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1422 == this.field1421) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1423) {
                    return;
                }
                var2 = this.field1421;
                if (this.field1422 >= this.field1421) {
                    var3 = this.field1422 - this.field1421;
                } else {
                    var3 = 5000 - this.field1421;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1416.write(this.field1420, var2, var3);
                } catch (IOException var7) {
                    this.field1424 = true;
                }
                this.field1421 = (this.field1421 + var3) % 5000;
                try {
                    if (this.field1422 == this.field1421) {
                        this.field1416.flush();
                    }
                } catch (IOException var6) {
                    this.field1424 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!SRCZZRYO", name = "a", descriptor = "(B)V")
    public void method461(byte arg0) {
        System.out.println("dummy:" + this.field1418);
        System.out.println("tcycl:" + this.field1421);
        System.out.println("tnum:" + this.field1422);
        System.out.println("writer:" + this.field1423);
        System.out.println("ioerror:" + this.field1424);
        if (arg0 == -36) {
            try {
                System.out.println("available:" + this.method458());
            } catch (IOException var2) {
            }
        }
    }
}
