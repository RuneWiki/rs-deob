import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class215 implements Runnable {

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    private int field3075 = 0;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    private int field3078 = 0;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field3070;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    private int field3074;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "[B")
    private byte[] field3072;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field3076;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "Ljava/io/IOException;")
    private IOException field3071;

    @OriginalMember(owner = "client!tg", name = "run", descriptor = "()V")
    public final void run() {
        field3077++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3071 != null) {
                        return;
                    }
                    if (this.field3078 == 0) {
                        var2 = this.field3074 - this.field3075 - 1;
                    } else if (this.field3075 <= this.field3078) {
                        var2 = this.field3078 - this.field3075 - 1;
                    } else {
                        var2 = this.field3074 - this.field3075;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            int var3;
            try {
                var3 = this.field3070.read(this.field3072, this.field3075, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field3071 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field3075 = (this.field3075 + var3) % this.field3074;
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public final void method1372(int arg0) {
        if (arg0 != -1) {
            this.field3078 = 100;
        }
        field3079++;
        synchronized (this) {
            if (this.field3071 == null) {
                this.field3071 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3076.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public final void method1373(byte arg0) {
        this.field3070 = new class643();
        if (arg0 >= 111) {
            field3073++;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)V")
    public static final void method1374(int arg0, byte arg1) {
        field3080++;
        if (arg1 <= 56) {
            method1374(-119, (byte) 73);
        }
        class666 var2 = class603.field8015;
        synchronized (class603.field8015) {
            class603.field8015.method3740((byte) 60, arg0);
        }
        class666 var3 = class174.field2680;
        synchronized (class174.field2680) {
            class174.field2680.method3740((byte) 60, arg0);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III[B)I")
    public final int method1375(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3069++;
        if (arg2 < 27) {
            method1374(-118, (byte) -60);
        }
        if (arg1 < 0 || arg0 < 0 || arg3.length < (arg0 + arg1)) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field3075 < this.field3078) {
                var6 = this.field3075 + this.field3074 - this.field3078;
            } else {
                var6 = this.field3075 - this.field3078;
            }
            if (arg1 > var6) {
                arg1 = var6;
            }
            if (arg1 == 0 && this.field3071 != null) {
                throw new IOException(this.field3071.toString());
            }
            if (this.field3078 + arg1 <= this.field3074) {
                class83.method686(this.field3072, this.field3078, arg3, arg0, arg1);
            } else {
                int var7 = this.field3074 - this.field3078;
                class83.method686(this.field3072, this.field3078, arg3, arg0, var7);
                class83.method686(this.field3072, 0, arg3, arg0 + var7, arg1 - var7);
            }
            this.field3078 = (this.field3078 + arg1) % this.field3074;
            this.notifyAll();
            return arg1;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Z")
    public final boolean method1376(int arg0, int arg1) throws IOException {
        field3068++;
        if (arg1 <= 0 || this.field3074 <= arg1) {
            throw new IOException();
        }
        synchronized (this) {
            if (arg0 < 115) {
                return false;
            }
            int var5;
            if (this.field3075 < this.field3078) {
                var5 = this.field3074 + this.field3075 - this.field3078;
            } else {
                var5 = this.field3075 - this.field3078;
            }
            if (arg1 <= var5) {
                return true;
            } else if (this.field3071 == null) {
                return false;
            } else {
                throw new IOException(this.field3071.toString());
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class215(InputStream arg0, int arg1) {
        this.field3070 = arg0;
        this.field3074 = arg1 + 1;
        this.field3072 = new byte[this.field3074];
        this.field3076 = new Thread(this);
        this.field3076.setDaemon(true);
        this.field3076.start();
    }
}
