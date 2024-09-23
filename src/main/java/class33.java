import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KVLMMBSC")
public class class33 implements Runnable {

    @OriginalMember(owner = "KVLMMBSC", name = "a", descriptor = "Z")
    private boolean field1118 = false;

    @OriginalMember(owner = "KVLMMBSC", name = "f", descriptor = "Z")
    private boolean field1123 = false;

    @OriginalMember(owner = "KVLMMBSC", name = "k", descriptor = "Z")
    private boolean field1128 = false;

    @OriginalMember(owner = "KVLMMBSC", name = "l", descriptor = "Z")
    private boolean field1129 = false;

    @OriginalMember(owner = "KVLMMBSC", name = "g", descriptor = "LOGVKVTJB;")
    public class38 field1124;

    @OriginalMember(owner = "KVLMMBSC", name = "b", descriptor = "I")
    private int field1119;

    @OriginalMember(owner = "KVLMMBSC", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field1122;

    @OriginalMember(owner = "KVLMMBSC", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field1120;

    @OriginalMember(owner = "KVLMMBSC", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1121;

    @OriginalMember(owner = "KVLMMBSC", name = "i", descriptor = "I")
    private int field1126;

    @OriginalMember(owner = "KVLMMBSC", name = "j", descriptor = "I")
    private int field1127;

    @OriginalMember(owner = "KVLMMBSC", name = "h", descriptor = "[B")
    private byte[] field1125;

    @OriginalMember(owner = "KVLMMBSC", name = "<init>", descriptor = "(Ljava/net/Socket;ZLOGVKVTJB;)V")
    public class33(Socket arg0, boolean arg1, class38 arg2) throws IOException {
        this.field1124 = arg2;
        if (!arg1) {
            this.field1119 = -373;
        }
        this.field1122 = arg0;
        this.field1122.setSoTimeout(30000);
        this.field1122.setTcpNoDelay(true);
        this.field1120 = this.field1122.getInputStream();
        this.field1121 = this.field1122.getOutputStream();
    }

    @OriginalMember(owner = "KVLMMBSC", name = "a", descriptor = "()V")
    public void method398() {
        this.field1123 = true;
        try {
            if (this.field1120 != null) {
                this.field1120.close();
            }
            if (this.field1121 != null) {
                this.field1121.close();
            }
            if (this.field1122 != null) {
                this.field1122.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1128 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1125 = null;
    }

    @OriginalMember(owner = "KVLMMBSC", name = "b", descriptor = "()I")
    public int method399() throws IOException {
        return this.field1123 ? 0 : this.field1120.read();
    }

    @OriginalMember(owner = "KVLMMBSC", name = "c", descriptor = "()I")
    public int method400() throws IOException {
        return this.field1123 ? 0 : this.field1120.available();
    }

    @OriginalMember(owner = "KVLMMBSC", name = "a", descriptor = "([BII)V")
    public void method401(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1123) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1120.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "KVLMMBSC", name = "a", descriptor = "(II[BI)V")
    public void method402(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field1123) {
            return;
        }
        if (this.field1129) {
            this.field1129 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1125 == null) {
            this.field1125 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field1125[this.field1127] = arg2[arg0 + var6];
                this.field1127 = (this.field1127 + 1) % 5000;
                if ((this.field1126 + 4900) % 5000 == this.field1127) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1128) {
                this.field1128 = true;
                this.field1124.method102(this, 3);
            }
            this.notify();
        }
        if (arg3 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "KVLMMBSC", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1128) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1127 == this.field1126) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1128) {
                    return;
                }
                var2 = this.field1126;
                if (this.field1127 >= this.field1126) {
                    var3 = this.field1127 - this.field1126;
                } else {
                    var3 = 5000 - this.field1126;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1121.write(this.field1125, var2, var3);
                } catch (IOException var7) {
                    this.field1129 = true;
                }
                this.field1126 = (this.field1126 + var3) % 5000;
                try {
                    if (this.field1127 == this.field1126) {
                        this.field1121.flush();
                    }
                } catch (IOException var6) {
                    this.field1129 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "KVLMMBSC", name = "a", descriptor = "(I)V")
    public void method403(int arg0) {
        System.out.println("dummy:" + this.field1123);
        System.out.println("tcycl:" + this.field1126);
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        System.out.println("tnum:" + this.field1127);
        System.out.println("writer:" + this.field1128);
        System.out.println("ioerror:" + this.field1129);
        try {
            System.out.println("available:" + this.method400());
        } catch (IOException var3) {
        }
    }
}
