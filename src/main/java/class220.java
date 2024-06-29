import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class220 extends class292 {

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
    private int field3083;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    private int field3077;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    private int field3071;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    private int field3072;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    public static int field3073 = 0;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "I")
    public static int field3080 = -1;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "[I")
    public static int[] field3078 = new int[] { 25000, 2000 };

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "Z")
    public static boolean field3087 = false;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
    private int field3085;

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    private int field3086;

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "I")
    private int field3088;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "I")
    private int field3089;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "Ljava/lang/Object;")
    public static Object field3081;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "[B")
    private byte[] field3075;

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(IIIIIFFF)V", line = 4)
    public class220(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3083 = (int) (arg7 * 4096.0F);
        this.field3077 = (int) (arg6 * 4096.0F);
        this.field3072 = this.field3071 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V", line = 14)
    public final void method1086(int arg0) {
        if (arg0 < 52) {
            method1399(12);
        }
        field3082++;
        this.field3072 = this.field3071;
        this.field3085 >>= 0x4;
        if (this.field3085 < 0) {
            this.field3085 = 0;
        } else if (this.field3085 > 255) {
            this.field3085 = 255;
        }
        this.method513((byte) 115, this.field3086++, (byte) this.field3085);
        this.field3085 = 0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BIB)V", line = 36)
    public void method513(byte arg0, int arg1, byte arg2) {
        if (arg0 != 115) {
            method1399(-77);
        }
        this.field3075[arg1] = arg2;
        field3076++;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 47)
    public final void method1080(int arg0) {
        this.field3085 = 0;
        if (arg0 < 116) {
            this.method1083(true, 104, 115);
        }
        this.field3086 = 0;
        field3084++;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V", line = 69)
    public static void method1399(int arg0) {
        field3078 = null;
        field3081 = null;
        if (arg0 != -20851) {
            field3073 = 3;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZII)V", line = 88)
    public final void method1083(boolean arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3089 = this.field3077 - (arg1 >= 0 ? arg1 : -arg1);
            this.field3088 = 4096;
            this.field3089 = this.field3089 * this.field3089 >> 12;
            this.field3085 = this.field3089;
        } else {
            this.field3088 = this.field3089 * this.field3083 >> 12;
            this.field3089 = this.field3077 - (arg1 >= 0 ? arg1 : -arg1);
            if (this.field3088 < 0) {
                this.field3088 = 0;
            } else if (this.field3088 > 4096) {
                this.field3088 = 4096;
            }
            this.field3089 = this.field3089 * this.field3089 >> 12;
            this.field3089 = this.field3089 * this.field3088 >> 12;
            this.field3085 += this.field3089 * this.field3072 >> 12;
            this.field3072 = this.field3072 * this.field3071 >> 12;
        }
        if (arg0) {
            field3074++;
        }
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V", line = 129)
    public static final void method1400(int arg0) {
        field3070++;
        class124.field1793 = -1;
        class76.field997 = 1;
        long var1 = 0L;
        if (class650.field9030 == null) {
            class31.method295(2, 35);
            return;
        }
        class501 var3 = new class501(class340.method1991((byte) -82, class465.method2627(class650.field9030, arg0 - 32282)));
        long var4 = var3.method2849(-2);
        class130.field1860 = var3.method2849(-2);
        if (arg0 == 32397) {
            class72.method577(class155.method1107(var4, 0), -95, true, "");
        }
    }
}
