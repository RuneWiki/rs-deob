import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class47 extends class502 {

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    private int field865;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    private int field870;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    private int field862;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    private int field871;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public static int field864 = -2;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    private int field861;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    private int field863;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    private int field867;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    private int field873;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "Lmq;")
    public static class350 field876;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wc", name = "I", descriptor = "Ljava/lang/Class;")
    public static Class field877;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "[B")
    private byte[] field869;

    // $FF: synthetic method
    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method451(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(IIIIIFFF)V", line = 3)
    public class47(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field865 = (int) (arg6 * 4096.0F);
        this.field870 = (int) (arg7 * 4096.0F);
        this.field871 = this.field862 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V", line = 14)
    public final void method444(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.field867 = this.field865 - (arg1 >= 0 ? arg1 : -arg1);
            this.field863 = 4096;
            this.field867 = this.field867 * this.field867 >> 12;
            this.field861 = this.field867;
        } else {
            this.field863 = this.field870 * this.field867 >> 12;
            this.field867 = this.field865 - (arg1 < 0 ? -arg1 : arg1);
            if (this.field863 < 0) {
                this.field863 = 0;
            } else if (this.field863 > 4096) {
                this.field863 = 4096;
            }
            this.field867 = this.field867 * this.field867 >> 12;
            this.field867 = this.field867 * this.field863 >> 12;
            this.field861 += this.field871 * this.field867 >> 12;
            this.field871 = this.field871 * this.field862 >> 12;
        }
        if (arg2 > 15) {
            field875++;
        }
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V", line = 55)
    public static final void method445(int arg0) {
        if (arg0 != 4096) {
            field876 = null;
        }
        class140.field2229 = null;
        class307.field4694 = false;
        field860++;
        class511.method3061(arg0 ^ 0x493B);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lgu;B)V", line = 70)
    public static final void method446(class408 arg0, byte arg1) {
        field872++;
        if (class380.field5761 == null) {
            return;
        }
        if (arg1 <= 70) {
            field864 = 56;
        }
        class248 var2 = null;
        if (arg0.field6115 == 0) {
            var2 = (class248) class310.method2028(arg0.field6124, arg0.field6126, arg0.field6119);
        }
        if (arg0.field6115 == 1) {
            var2 = (class248) class462.method2745(arg0.field6124, arg0.field6126, arg0.field6119);
        }
        if (arg0.field6115 == 2) {
            var2 = (class248) class367.method2294(arg0.field6124, arg0.field6126, arg0.field6119, field877 == null ? (field877 = method451("pa")) : field877);
        }
        if (arg0.field6115 == 3) {
            var2 = (class248) class412.method2496(arg0.field6124, arg0.field6126, arg0.field6119);
        }
        if (var2 == null) {
            arg0.field6116 = -1;
            arg0.field6122 = 0;
            arg0.field6128 = 0;
        } else {
            arg0.field6116 = var2.method17((byte) -18);
            arg0.field6128 = var2.method12(3765);
            arg0.field6122 = var2.method19((byte) -69);
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V", line = 118)
    public final void method447(int arg0) {
        this.field861 = 0;
        field866++;
        this.field873 = 0;
        if (arg0 != 4) {
            this.method450(62);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BBI)V", line = 130)
    public void method448(byte arg0, byte arg1, int arg2) {
        field868++;
        if (arg0 == -24) {
            this.field869[arg2] = arg1;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 141)
    public static void method449(byte arg0) {
        field876 = null;
        int var1 = -82 / ((14 - arg0) / 38);
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V", line = 153)
    public final void method450(int arg0) {
        this.field871 = this.field862;
        this.field861 >>= 0x4;
        field874++;
        if (this.field861 < 0) {
            this.field861 = 0;
        } else if (this.field861 > 255) {
            this.field861 = 255;
        }
        this.method448((byte) -24, (byte) this.field861, this.field873++);
        if (arg0 == -1) {
            this.field861 = 0;
        }
    }
}
