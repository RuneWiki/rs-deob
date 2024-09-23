import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ABBBHPCA")
public class class1 implements Runnable {

    @OriginalMember(owner = "ABBBHPCA", name = "a", descriptor = "B")
    private byte field1 = 1;

    @OriginalMember(owner = "ABBBHPCA", name = "b", descriptor = "Z")
    private boolean field2 = false;

    @OriginalMember(owner = "ABBBHPCA", name = "f", descriptor = "Z")
    private boolean field6 = false;

    @OriginalMember(owner = "ABBBHPCA", name = "k", descriptor = "Z")
    private boolean field11 = false;

    @OriginalMember(owner = "ABBBHPCA", name = "l", descriptor = "Z")
    private boolean field12 = false;

    @OriginalMember(owner = "ABBBHPCA", name = "g", descriptor = "LAUOBNYCU;")
    public class4 field7;

    @OriginalMember(owner = "ABBBHPCA", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field5;

    @OriginalMember(owner = "ABBBHPCA", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field3;

    @OriginalMember(owner = "ABBBHPCA", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4;

    @OriginalMember(owner = "ABBBHPCA", name = "j", descriptor = "I")
    private int field10;

    @OriginalMember(owner = "ABBBHPCA", name = "i", descriptor = "I")
    private int field9;

    @OriginalMember(owner = "ABBBHPCA", name = "h", descriptor = "[B")
    private byte[] field8;

    @OriginalMember(owner = "ABBBHPCA", name = "<init>", descriptor = "(ILAUOBNYCU;Ljava/net/Socket;)V")
    public class1(int arg0, class4 arg1, Socket arg2) throws IOException {
        this.field7 = arg1;
        this.field5 = arg2;
        this.field5.setSoTimeout(30000);
        this.field5.setTcpNoDelay(true);
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        this.field3 = this.field5.getInputStream();
        this.field4 = this.field5.getOutputStream();
    }

    @OriginalMember(owner = "ABBBHPCA", name = "a", descriptor = "()V")
    public void method1() {
        this.field6 = true;
        try {
            if (this.field3 != null) {
                this.field3.close();
            }
            if (this.field4 != null) {
                this.field4.close();
            }
            if (this.field5 != null) {
                this.field5.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field11 = false;
        synchronized (this) {
            this.notify();
        }
        this.field8 = null;
    }

    @OriginalMember(owner = "ABBBHPCA", name = "b", descriptor = "()I")
    public int method2() throws IOException {
        return this.field6 ? 0 : this.field3.read();
    }

    @OriginalMember(owner = "ABBBHPCA", name = "c", descriptor = "()I")
    public int method3() throws IOException {
        return this.field6 ? 0 : this.field3.available();
    }

    @OriginalMember(owner = "ABBBHPCA", name = "a", descriptor = "([BII)V")
    public void method4(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field6) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field3.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "ABBBHPCA", name = "a", descriptor = "(I[BIB)V")
    public void method5(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        if (this.field1 == arg3) {
            boolean var5 = false;
        } else {
            this.field2 = !this.field2;
        }
        if (this.field6) {
            return;
        }
        if (this.field12) {
            this.field12 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field8 == null) {
            this.field8 = new byte[5000];
        }
        synchronized (this) {
            for (int var7 = 0; var7 < arg2; var7++) {
                this.field8[this.field10] = arg1[arg0 + var7];
                this.field10 = (this.field10 + 1) % 5000;
                if ((this.field9 + 4900) % 5000 == this.field10) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field11) {
                this.field11 = true;
                this.field7.method23(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "ABBBHPCA", name = "run", descriptor = "()V")
    public void run() {
        while (this.field11) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field9 == this.field10) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field11) {
                    return;
                }
                var2 = this.field9;
                if (this.field10 >= this.field9) {
                    var3 = this.field10 - this.field9;
                } else {
                    var3 = 5000 - this.field9;
                }
            }
            if (var3 > 0) {
                try {
                    this.field4.write(this.field8, var2, var3);
                } catch (IOException var7) {
                    this.field12 = true;
                }
                this.field9 = (this.field9 + var3) % 5000;
                try {
                    if (this.field9 == this.field10) {
                        this.field4.flush();
                    }
                } catch (IOException var6) {
                    this.field12 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "ABBBHPCA", name = "a", descriptor = "(B)V")
    public void method6(byte arg0) {
        System.out.println("dummy:" + this.field6);
        System.out.println("tcycl:" + this.field9);
        System.out.println("tnum:" + this.field10);
        System.out.println("writer:" + this.field11);
        if (arg0 != -34) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        System.out.println("ioerror:" + this.field12);
        try {
            System.out.println("available:" + this.method3());
        } catch (IOException var3) {
        }
    }
}
