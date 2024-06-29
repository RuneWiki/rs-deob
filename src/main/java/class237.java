import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class237 extends class233 {

    @OriginalMember(owner = "client!im", name = "G", descriptor = "I")
    private int field3733;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "I")
    private int field3718;

    @OriginalMember(owner = "client!im", name = "D", descriptor = "I")
    private int field3730;

    @OriginalMember(owner = "client!im", name = "B", descriptor = "I")
    private int field3728;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    private int field3716;

    @OriginalMember(owner = "client!im", name = "x", descriptor = "I")
    private int field3724;

    @OriginalMember(owner = "client!im", name = "y", descriptor = "I")
    private int field3725;

    @OriginalMember(owner = "client!im", name = "E", descriptor = "I")
    private int field3731;

    @OriginalMember(owner = "client!im", name = "w", descriptor = "[I")
    public static int[] field3723 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!im", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3721 = "Started 3d Library";

    @OriginalMember(owner = "client!im", name = "C", descriptor = "Z")
    public static boolean field3729 = false;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!im", name = "t", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!im", name = "v", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!im", name = "A", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!im", name = "F", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!im", name = "z", descriptor = "[I")
    public static int[] field3726;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(III)V")
    public final void method279(int arg0, int arg1, int arg2) {
        if (arg0 < -121) {
            ++field3719;
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3733 = arg1;
        this.field3718 = arg0;
        this.field3730 = arg7;
        this.field3728 = arg2;
        this.field3716 = arg4;
        this.field3724 = arg6;
        this.field3725 = arg3;
        this.field3731 = arg5;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IBI)V")
    public final void method281(int arg0, byte arg1, int arg2) {
        ++field3715;
        int var4 = this.field3718 * arg2 >> 12;
        int var5 = this.field3725 * arg0 >> 12;
        int var6 = this.field3733 * arg0 >> 12;
        int var7 = this.field3728 * arg2 >> 12;
        int var8 = this.field3716 * arg2 >> 12;
        int var9 = this.field3731 * arg0 >> 12;
        int var10 = 34 % ((-43 - arg1) / 49);
        int var11 = this.field3730 * arg0 >> 12;
        int var12 = this.field3724 * arg2 >> 12;
        class134.method913(var9, var6, var12, var7, true, super.field3641, var11, var5, var8, var4);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ZILge;)V")
    public static final void method1625(boolean arg0, int arg1, class73 arg2) {
        if (arg0) {
            int var3 = class195.field3161;
            int var4 = var3 * 956 / 503;
            class148.field2373.method450((-var4 + class154.field2463) / 2, 0, var4, var3);
            class287.field4641.method13(class154.field2463 / 2 + -(class287.field4641.field3179 / 2), 18);
        }
        arg2.method510(class106.field1656 != 1 ? class134.field2176 : class48.field703, class154.field2463 / 2, class195.field3161 / 2 + -26, 16777215, -1);
        ++field3720;
        int var5 = class195.field3161 / 2 + -18;
        class94.method670(class154.field2463 / 2 + -152, var5, 304, 34, 9179409);
        class94.method670(class154.field2463 / 2 + -151, var5 - -1, 302, 32, 0);
        class94.method660(class154.field2463 / arg1 - 150, var5 + 2, class137.field2215 * 3, 30, 9179409);
        class94.method660(class154.field2463 / 2 - -(class137.field2215 * 3) + -150, var5 - -2, 300 - class137.field2215 * 3, 30, 0);
        arg2.method510(class13.field269, class154.field2463 / 2, class195.field3161 / 2 - -4, 16777215, -1);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
    public static final void method1626(byte arg0) {
        class168.field2765.method1876((byte) 120);
        class292.field4790.method1876((byte) 118);
        ++field3717;
        class186.field3076.method1876((byte) 120);
        if (arg0 != -77) {
            field3721 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)V")
    public static void method1627(boolean arg0) {
        if (arg0) {
            field3723 = null;
        }
        field3723 = null;
        field3726 = null;
        field3721 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIZ)V")
    public final void method282(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method281(-37, (byte) 106, 89);
        }
        ++field3722;
    }
}
