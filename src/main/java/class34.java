import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LJVKCVYD")
public class class34 implements Runnable {

    @OriginalMember(owner = "LJVKCVYD", name = "d", descriptor = "Z")
    private boolean field962 = false;

    @OriginalMember(owner = "LJVKCVYD", name = "i", descriptor = "Z")
    private boolean field967 = false;

    @OriginalMember(owner = "LJVKCVYD", name = "j", descriptor = "Z")
    private boolean field968 = false;

    @OriginalMember(owner = "LJVKCVYD", name = "e", descriptor = "LAYIVJZQQ;")
    public class3 field963;

    @OriginalMember(owner = "LJVKCVYD", name = "c", descriptor = "Ljava/net/Socket;")
    private Socket field961;

    @OriginalMember(owner = "LJVKCVYD", name = "a", descriptor = "Ljava/io/InputStream;")
    private InputStream field959;

    @OriginalMember(owner = "LJVKCVYD", name = "b", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field960;

    @OriginalMember(owner = "LJVKCVYD", name = "g", descriptor = "I")
    private int field965;

    @OriginalMember(owner = "LJVKCVYD", name = "h", descriptor = "I")
    private int field966;

    @OriginalMember(owner = "LJVKCVYD", name = "f", descriptor = "[B")
    private byte[] field964;

    @OriginalMember(owner = "LJVKCVYD", name = "<init>", descriptor = "(LAYIVJZQQ;Ljava/net/Socket;I)V")
    public class34(class3 arg0, Socket arg1, int arg2) throws IOException {
        this.field963 = arg0;
        this.field961 = arg1;
        this.field961.setSoTimeout(30000);
        this.field961.setTcpNoDelay(true);
        this.field959 = this.field961.getInputStream();
        int var4 = 14 / arg2;
        this.field960 = this.field961.getOutputStream();
    }

    @OriginalMember(owner = "LJVKCVYD", name = "a", descriptor = "()V")
    public void method351() {
        this.field962 = true;
        try {
            if (this.field959 != null) {
                this.field959.close();
            }
            if (this.field960 != null) {
                this.field960.close();
            }
            if (this.field961 != null) {
                this.field961.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field967 = false;
        synchronized (this) {
            this.notify();
        }
        this.field964 = null;
    }

    @OriginalMember(owner = "LJVKCVYD", name = "b", descriptor = "()I")
    public int method352() throws IOException {
        return this.field962 ? 0 : this.field959.read();
    }

    @OriginalMember(owner = "LJVKCVYD", name = "c", descriptor = "()I")
    public int method353() throws IOException {
        return this.field962 ? 0 : this.field959.available();
    }

    @OriginalMember(owner = "LJVKCVYD", name = "a", descriptor = "([BII)V")
    public void method354(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field962) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field959.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "LJVKCVYD", name = "a", descriptor = "([BIII)V")
    public void method355(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg2 != 11369 || this.field962) {
            return;
        }
        if (this.field968) {
            this.field968 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field964 == null) {
            this.field964 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field964[this.field966] = arg0[arg3 + var6];
                this.field966 = (this.field966 + 1) % 5000;
                if ((this.field965 + 4900) % 5000 == this.field966) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field967) {
                this.field967 = true;
                this.field963.method25(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "LJVKCVYD", name = "run", descriptor = "()V")
    public void run() {
        while (this.field967) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field966 == this.field965) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field967) {
                    return;
                }
                var2 = this.field965;
                if (this.field966 >= this.field965) {
                    var3 = this.field966 - this.field965;
                } else {
                    var3 = 5000 - this.field965;
                }
            }
            if (var3 > 0) {
                try {
                    this.field960.write(this.field964, var2, var3);
                } catch (IOException var7) {
                    this.field968 = true;
                }
                this.field965 = (this.field965 + var3) % 5000;
                try {
                    if (this.field966 == this.field965) {
                        this.field960.flush();
                    }
                } catch (IOException var6) {
                    this.field968 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "LJVKCVYD", name = "a", descriptor = "(I)V")
    public void method356(int arg0) {
        System.out.println("dummy:" + this.field962);
        System.out.println("tcycl:" + this.field965);
        System.out.println("tnum:" + this.field966);
        System.out.println("writer:" + this.field967);
        if (arg0 != 40926) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        System.out.println("ioerror:" + this.field968);
        try {
            System.out.println("available:" + this.method353());
        } catch (IOException var3) {
        }
    }
}
