import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OAGIEZRU")
public class class42 implements Runnable {

    @OriginalMember(owner = "OAGIEZRU", name = "a", descriptor = "Z")
    private boolean field1229 = true;

    @OriginalMember(owner = "OAGIEZRU", name = "e", descriptor = "Z")
    private boolean field1233 = false;

    @OriginalMember(owner = "OAGIEZRU", name = "j", descriptor = "Z")
    private boolean field1238 = false;

    @OriginalMember(owner = "OAGIEZRU", name = "k", descriptor = "Z")
    private boolean field1239 = false;

    @OriginalMember(owner = "OAGIEZRU", name = "f", descriptor = "LKISFBCOP;")
    public class27 field1234;

    @OriginalMember(owner = "OAGIEZRU", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field1232;

    @OriginalMember(owner = "OAGIEZRU", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field1230;

    @OriginalMember(owner = "OAGIEZRU", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1231;

    @OriginalMember(owner = "OAGIEZRU", name = "h", descriptor = "I")
    private int field1236;

    @OriginalMember(owner = "OAGIEZRU", name = "i", descriptor = "I")
    private int field1237;

    @OriginalMember(owner = "OAGIEZRU", name = "g", descriptor = "[B")
    private byte[] field1235;

    @OriginalMember(owner = "OAGIEZRU", name = "<init>", descriptor = "(LKISFBCOP;BLjava/net/Socket;)V")
    public class42(class27 arg0, byte arg1, Socket arg2) throws IOException {
        this.field1234 = arg0;
        this.field1232 = arg2;
        this.field1232.setSoTimeout(30000);
        this.field1232.setTcpNoDelay(true);
        this.field1230 = this.field1232.getInputStream();
        if (arg1 != 5) {
            this.field1229 = !this.field1229;
        }
        this.field1231 = this.field1232.getOutputStream();
    }

    @OriginalMember(owner = "OAGIEZRU", name = "a", descriptor = "()V")
    public void method378() {
        this.field1233 = true;
        try {
            if (this.field1230 != null) {
                this.field1230.close();
            }
            if (this.field1231 != null) {
                this.field1231.close();
            }
            if (this.field1232 != null) {
                this.field1232.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1238 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1235 = null;
    }

    @OriginalMember(owner = "OAGIEZRU", name = "b", descriptor = "()I")
    public int method379() throws IOException {
        return this.field1233 ? 0 : this.field1230.read();
    }

    @OriginalMember(owner = "OAGIEZRU", name = "c", descriptor = "()I")
    public int method380() throws IOException {
        return this.field1233 ? 0 : this.field1230.available();
    }

    @OriginalMember(owner = "OAGIEZRU", name = "a", descriptor = "([BII)V")
    public void method381(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1233) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1230.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "OAGIEZRU", name = "a", descriptor = "(B[BII)V")
    public void method382(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 != 55 || this.field1233) {
            return;
        }
        if (this.field1239) {
            this.field1239 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1235 == null) {
            this.field1235 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field1235[this.field1237] = arg1[arg2 + var6];
                this.field1237 = (this.field1237 + 1) % 5000;
                if ((this.field1236 + 4900) % 5000 == this.field1237) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1238) {
                this.field1238 = true;
                this.field1234.method86(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "OAGIEZRU", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1238) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1237 == this.field1236) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1238) {
                    return;
                }
                var2 = this.field1236;
                if (this.field1237 >= this.field1236) {
                    var3 = this.field1237 - this.field1236;
                } else {
                    var3 = 5000 - this.field1236;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1231.write(this.field1235, var2, var3);
                } catch (IOException var7) {
                    this.field1239 = true;
                }
                this.field1236 = (this.field1236 + var3) % 5000;
                try {
                    if (this.field1237 == this.field1236) {
                        this.field1231.flush();
                    }
                } catch (IOException var6) {
                    this.field1239 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "OAGIEZRU", name = "a", descriptor = "(Z)V")
    public void method383(boolean arg0) {
        System.out.println("dummy:" + this.field1233);
        System.out.println("tcycl:" + this.field1236);
        System.out.println("tnum:" + this.field1237);
        System.out.println("writer:" + this.field1238);
        System.out.println("ioerror:" + this.field1239);
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        try {
            System.out.println("available:" + this.method380());
        } catch (IOException var3) {
        }
    }
}
