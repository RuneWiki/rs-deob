import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ABEJMBLI")
public class class1 implements Runnable {

    @OriginalMember(owner = "ABEJMBLI", name = "a", descriptor = "Z")
    private boolean field1 = true;

    @OriginalMember(owner = "ABEJMBLI", name = "b", descriptor = "Z")
    private boolean field2 = false;

    @OriginalMember(owner = "ABEJMBLI", name = "f", descriptor = "Z")
    private boolean field6 = false;

    @OriginalMember(owner = "ABEJMBLI", name = "k", descriptor = "Z")
    private boolean field11 = false;

    @OriginalMember(owner = "ABEJMBLI", name = "l", descriptor = "Z")
    private boolean field12 = false;

    @OriginalMember(owner = "ABEJMBLI", name = "g", descriptor = "LGYSHSTYO;")
    public class23 field7;

    @OriginalMember(owner = "ABEJMBLI", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field5;

    @OriginalMember(owner = "ABEJMBLI", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field3;

    @OriginalMember(owner = "ABEJMBLI", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4;

    @OriginalMember(owner = "ABEJMBLI", name = "j", descriptor = "I")
    private int field10;

    @OriginalMember(owner = "ABEJMBLI", name = "i", descriptor = "I")
    private int field9;

    @OriginalMember(owner = "ABEJMBLI", name = "h", descriptor = "[B")
    private byte[] field8;

    @OriginalMember(owner = "ABEJMBLI", name = "<init>", descriptor = "(Ljava/net/Socket;LGYSHSTYO;Z)V")
    public class1(Socket arg0, class23 arg1, boolean arg2) throws IOException {
        if (arg2) {
            throw new NullPointerException();
        }
        this.field7 = arg1;
        this.field5 = arg0;
        this.field5.setSoTimeout(30000);
        this.field5.setTcpNoDelay(true);
        this.field3 = this.field5.getInputStream();
        this.field4 = this.field5.getOutputStream();
    }

    @OriginalMember(owner = "ABEJMBLI", name = "a", descriptor = "()V")
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

    @OriginalMember(owner = "ABEJMBLI", name = "b", descriptor = "()I")
    public int method2() throws IOException {
        return this.field6 ? 0 : this.field3.read();
    }

    @OriginalMember(owner = "ABEJMBLI", name = "c", descriptor = "()I")
    public int method3() throws IOException {
        return this.field6 ? 0 : this.field3.available();
    }

    @OriginalMember(owner = "ABEJMBLI", name = "a", descriptor = "([BII)V")
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

    @OriginalMember(owner = "ABEJMBLI", name = "a", descriptor = "(I[BII)V")
    public void method5(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 != -33359) {
            this.field1 = !this.field1;
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
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field8[this.field10] = arg1[arg2 + var6];
                this.field10 = (this.field10 + 1) % 5000;
                if ((this.field9 + 4900) % 5000 == this.field10) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field11) {
                this.field11 = true;
                this.field7.method93(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "ABEJMBLI", name = "run", descriptor = "()V")
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

    @OriginalMember(owner = "ABEJMBLI", name = "a", descriptor = "(B)V")
    public void method6(byte arg0) {
        System.out.println("dummy:" + this.field6);
        System.out.println("tcycl:" + this.field9);
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            this.field2 = !this.field2;
        }
        System.out.println("tnum:" + this.field10);
        System.out.println("writer:" + this.field11);
        System.out.println("ioerror:" + this.field12);
        try {
            System.out.println("available:" + this.method3());
        } catch (IOException var3) {
        }
    }
}
