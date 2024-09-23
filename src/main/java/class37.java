import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LLYASRTI")
public class class37 implements Runnable {

    @OriginalMember(owner = "LLYASRTI", name = "a", descriptor = "I")
    private int field1099 = 49942;

    @OriginalMember(owner = "LLYASRTI", name = "b", descriptor = "I")
    private int field1100 = -630;

    @OriginalMember(owner = "LLYASRTI", name = "f", descriptor = "Z")
    private boolean field1104 = false;

    @OriginalMember(owner = "LLYASRTI", name = "k", descriptor = "Z")
    private boolean field1109 = false;

    @OriginalMember(owner = "LLYASRTI", name = "l", descriptor = "Z")
    private boolean field1110 = false;

    @OriginalMember(owner = "LLYASRTI", name = "g", descriptor = "LQNTDRCTM;")
    public class45 field1105;

    @OriginalMember(owner = "LLYASRTI", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field1103;

    @OriginalMember(owner = "LLYASRTI", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field1101;

    @OriginalMember(owner = "LLYASRTI", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1102;

    @OriginalMember(owner = "LLYASRTI", name = "i", descriptor = "I")
    private int field1107;

    @OriginalMember(owner = "LLYASRTI", name = "j", descriptor = "I")
    private int field1108;

    @OriginalMember(owner = "LLYASRTI", name = "h", descriptor = "[B")
    private byte[] field1106;

    @OriginalMember(owner = "LLYASRTI", name = "<init>", descriptor = "(Ljava/net/Socket;ZLQNTDRCTM;)V")
    public class37(Socket arg0, boolean arg1, class45 arg2) throws IOException {
        this.field1105 = arg2;
        this.field1103 = arg0;
        if (!arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1103.setSoTimeout(30000);
        this.field1103.setTcpNoDelay(true);
        this.field1101 = this.field1103.getInputStream();
        this.field1102 = this.field1103.getOutputStream();
    }

    @OriginalMember(owner = "LLYASRTI", name = "a", descriptor = "()V")
    public void method351() {
        this.field1104 = true;
        try {
            if (this.field1101 != null) {
                this.field1101.close();
            }
            if (this.field1102 != null) {
                this.field1102.close();
            }
            if (this.field1103 != null) {
                this.field1103.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1109 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1106 = null;
    }

    @OriginalMember(owner = "LLYASRTI", name = "b", descriptor = "()I")
    public int method352() throws IOException {
        return this.field1104 ? 0 : this.field1101.read();
    }

    @OriginalMember(owner = "LLYASRTI", name = "c", descriptor = "()I")
    public int method353() throws IOException {
        return this.field1104 ? 0 : this.field1101.available();
    }

    @OriginalMember(owner = "LLYASRTI", name = "a", descriptor = "([BII)V")
    public void method354(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1104) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1101.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "LLYASRTI", name = "a", descriptor = "(III[B)V")
    public void method355(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field1104) {
            return;
        }
        if (this.field1110) {
            this.field1110 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1106 == null) {
            this.field1106 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field1106[this.field1108] = arg3[arg0 + var6];
                this.field1108 = (this.field1108 + 1) % 5000;
                if ((this.field1107 + 4900) % 5000 == this.field1108) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1109) {
                this.field1109 = true;
                this.field1105.method102(this, 3);
            }
            this.notify();
        }
        if (arg2 != 0) {
            this.field1100 = 364;
        }
    }

    @OriginalMember(owner = "LLYASRTI", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1109) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1108 == this.field1107) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1109) {
                    return;
                }
                var2 = this.field1107;
                if (this.field1108 >= this.field1107) {
                    var3 = this.field1108 - this.field1107;
                } else {
                    var3 = 5000 - this.field1107;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1102.write(this.field1106, var2, var3);
                } catch (IOException var7) {
                    this.field1110 = true;
                }
                this.field1107 = (this.field1107 + var3) % 5000;
                try {
                    if (this.field1108 == this.field1107) {
                        this.field1102.flush();
                    }
                } catch (IOException var6) {
                    this.field1110 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "LLYASRTI", name = "a", descriptor = "(I)V")
    public void method356(int arg0) {
        System.out.println("dummy:" + this.field1104);
        System.out.println("tcycl:" + this.field1107);
        System.out.println("tnum:" + this.field1108);
        System.out.println("writer:" + this.field1109);
        if (arg0 != 0) {
            this.field1099 = -116;
        }
        System.out.println("ioerror:" + this.field1110);
        try {
            System.out.println("available:" + this.method353());
        } catch (IOException var2) {
        }
    }
}
