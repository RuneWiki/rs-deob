import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LBXRBQZX")
public class class29 implements Runnable {

    @OriginalMember(owner = "client!LBXRBQZX", name = "a", descriptor = "I")
    private int field967 = -161;

    @OriginalMember(owner = "client!LBXRBQZX", name = "b", descriptor = "Z")
    private boolean field968 = true;

    @OriginalMember(owner = "client!LBXRBQZX", name = "f", descriptor = "Z")
    private boolean field972 = false;

    @OriginalMember(owner = "client!LBXRBQZX", name = "k", descriptor = "Z")
    private boolean field977 = false;

    @OriginalMember(owner = "client!LBXRBQZX", name = "l", descriptor = "Z")
    private boolean field978 = false;

    @OriginalMember(owner = "client!LBXRBQZX", name = "g", descriptor = "LRMDQJLZZ;")
    public class47 field973;

    @OriginalMember(owner = "client!LBXRBQZX", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field971;

    @OriginalMember(owner = "client!LBXRBQZX", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field969;

    @OriginalMember(owner = "client!LBXRBQZX", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field970;

    @OriginalMember(owner = "client!LBXRBQZX", name = "i", descriptor = "I")
    private int field975;

    @OriginalMember(owner = "client!LBXRBQZX", name = "j", descriptor = "I")
    private int field976;

    @OriginalMember(owner = "client!LBXRBQZX", name = "h", descriptor = "[B")
    private byte[] field974;

    @OriginalMember(owner = "client!LBXRBQZX", name = "<init>", descriptor = "(Ljava/net/Socket;LRMDQJLZZ;Z)V")
    public class29(Socket arg0, class47 arg1, boolean arg2) throws IOException {
        this.field973 = arg1;
        this.field971 = arg0;
        if (!arg2) {
            this.field968 = !this.field968;
        }
        this.field971.setSoTimeout(30000);
        this.field971.setTcpNoDelay(true);
        this.field969 = this.field971.getInputStream();
        this.field970 = this.field971.getOutputStream();
    }

    @OriginalMember(owner = "client!LBXRBQZX", name = "a", descriptor = "()V")
    public void method273() {
        this.field972 = true;
        try {
            if (this.field969 != null) {
                this.field969.close();
            }
            if (this.field970 != null) {
                this.field970.close();
            }
            if (this.field971 != null) {
                this.field971.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field977 = false;
        synchronized (this) {
            this.notify();
        }
        this.field974 = null;
    }

    @OriginalMember(owner = "client!LBXRBQZX", name = "b", descriptor = "()I")
    public int method274() throws IOException {
        return this.field972 ? 0 : this.field969.read();
    }

    @OriginalMember(owner = "client!LBXRBQZX", name = "c", descriptor = "()I")
    public int method275() throws IOException {
        return this.field972 ? 0 : this.field969.available();
    }

    @OriginalMember(owner = "client!LBXRBQZX", name = "a", descriptor = "([BII)V")
    public void method276(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field972) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field969.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "client!LBXRBQZX", name = "a", descriptor = "(IBI[B)V")
    public void method277(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 != 5) {
            this.field968 = !this.field968;
        }
        if (this.field972) {
            return;
        }
        if (this.field978) {
            this.field978 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field974 == null) {
            this.field974 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field974[this.field976] = arg3[arg2 + var6];
                this.field976 = (this.field976 + 1) % 5000;
                if ((this.field975 + 4900) % 5000 == this.field976) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field977) {
                this.field977 = true;
                this.field973.method108(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "client!LBXRBQZX", name = "run", descriptor = "()V")
    public void run() {
        while (this.field977) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field976 == this.field975) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field977) {
                    return;
                }
                var2 = this.field975;
                if (this.field976 >= this.field975) {
                    var3 = this.field976 - this.field975;
                } else {
                    var3 = 5000 - this.field975;
                }
            }
            if (var3 > 0) {
                try {
                    this.field970.write(this.field974, var2, var3);
                } catch (IOException var7) {
                    this.field978 = true;
                }
                this.field975 = (this.field975 + var3) % 5000;
                try {
                    if (this.field976 == this.field975) {
                        this.field970.flush();
                    }
                } catch (IOException var6) {
                    this.field978 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!LBXRBQZX", name = "a", descriptor = "(I)V")
    public void method278(int arg0) {
        System.out.println("dummy:" + this.field972);
        if (arg0 != 0) {
            return;
        }
        System.out.println("tcycl:" + this.field975);
        System.out.println("tnum:" + this.field976);
        System.out.println("writer:" + this.field977);
        System.out.println("ioerror:" + this.field978);
        try {
            System.out.println("available:" + this.method275());
        } catch (IOException var2) {
        }
    }
}
