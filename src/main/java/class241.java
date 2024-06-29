import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class241 implements Runnable {

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
    private int field3067 = 0;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    private int field3072 = 0;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3071;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
    private int field3070;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "[B")
    private byte[] field3061;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field3064;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public static int field3063 = 0;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "Lba;")
    public static class607 field3066 = new class607(64);

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "Ljava/io/IOException;")
    private IOException field3074;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
    public static final void method1497(int arg0) {
        field3068++;
        if (arg0 >= -21) {
            field3063 = 49;
        }
        if (class288.field3759 != null) {
            class288.field3759.method335(-118);
        }
        if (class226.field2891 != null) {
            class226.field2891.method335(-113);
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
    public final void method1498(int arg0) {
        this.field3071 = new class506();
        if (arg0 == 64) {
            field3062++;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
    public final void method1499(byte arg0) {
        field3069++;
        synchronized (this) {
            if (this.field3074 == null) {
                this.field3074 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3064.join();
        } catch (InterruptedException var4) {
        }
        int var3 = 53 / ((arg0 - 45) / 57);
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V")
    public static void method1500(int arg0) {
        if (arg0 != 1) {
            field3066 = null;
        }
        field3066 = null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(III[B)V")
    public final void method1501(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3075++;
        if (arg0 < 0 || arg2 < 0 || arg3.length < (arg0 + arg2)) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            if (this.field3074 != null) {
                throw new IOException(this.field3074.toString());
            }
            if (arg1 != -1) {
                this.field3064 = null;
            }
            int var6;
            if (this.field3072 <= this.field3067) {
                var6 = this.field3070 + this.field3072 - this.field3067 - 1;
            } else {
                var6 = this.field3072 - this.field3067 - 1;
            }
            if (var6 < arg0) {
                throw new IOException("");
            }
            if (this.field3070 < this.field3067 + arg0) {
                int var7 = this.field3070 - this.field3067;
                class205.method1311(arg3, arg2, this.field3061, this.field3067, var7);
                class205.method1311(arg3, arg2 + var7, this.field3061, 0, arg0 - var7);
            } else {
                class205.method1311(arg3, arg2, this.field3061, this.field3067, arg0);
            }
            this.field3067 = (this.field3067 + arg0) % this.field3070;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ko", name = "run", descriptor = "()V")
    public final void run() {
        field3065++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3074 != null) {
                        return;
                    }
                    if (this.field3067 >= this.field3072) {
                        var2 = this.field3067 - this.field3072;
                    } else {
                        var2 = this.field3070 + this.field3067 - this.field3072;
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
            try {
                if (this.field3070 >= this.field3072 + var2) {
                    this.field3071.write(this.field3061, this.field3072, var2);
                } else {
                    int var3 = this.field3070 - this.field3072;
                    this.field3071.write(this.field3061, this.field3072, var3);
                    this.field3071.write(this.field3061, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field3074 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field3072 = (this.field3072 + var2) % this.field3070;
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)V")
    public static final void method1502(boolean arg0) {
        class634.field9227.method2002(120);
        field3076++;
        class343.field4760.method89(true);
        class123.field1540.method415(-19900);
        class141.field1806.setBackground(Color.black);
        class334.field4666 = -1;
        class634.field9227 = class141.method765(124, class141.field1806);
        class343.field4760 = class281.method1753(arg0, 2, class141.field1806);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)Z")
    public static final boolean method1503(int arg0, int arg1, int arg2) {
        field3073++;
        if (arg2 != 0) {
            field3066 = null;
        }
        return class359.method2230(arg0, arg1, arg2) & class48.method261(true, arg1, arg0);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IFFF)F")
    public static final float method1504(int arg0, float arg1, float arg2, float arg3) {
        if (arg0 == 0) {
            field3060++;
            return (arg3 - arg2) * arg1 + arg2;
        } else {
            return 0.6684846F;
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class241(OutputStream arg0, int arg1) {
        this.field3071 = arg0;
        this.field3070 = arg1 + 1;
        this.field3061 = new byte[this.field3070];
        this.field3064 = new Thread(this);
        this.field3064.setDaemon(true);
        this.field3064.start();
    }
}
