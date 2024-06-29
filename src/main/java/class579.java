import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class579 extends class5 {

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "[I")
    public static int[] field8116 = new int[3];

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "Z")
    public static boolean field8113 = false;

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!cm", name = "J", descriptor = "I")
    public static int field8112;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
    public static int field8114;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method44(int arg0, boolean arg1) {
        ++field8111;
        if (!arg1) {
            field8116 = null;
        }
        int[][] var3 = super.field135.method2706(arg0, -16);
        if (super.field135.field6667) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class657.field9287 > var7; ++var7) {
                this.method3199(arg0, (byte) 92, var7);
                int[][] var8 = this.method45(0, class561.field7790, 0);
                var4[var7] = var8[0][class635.field8901];
                var5[var7] = var8[1][class635.field8901];
                var6[var7] = var8[2][class635.field8901];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
    public static void method3197(boolean arg0) {
        field8116 = null;
        if (arg0) {
            method3198(-68, -120, -69, (byte) 125, 83, 1, -44, 107, -29, 51);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        int var3 = 1 % ((arg0 - 81) / 36);
        ++field8112;
        int[] var4 = super.field126.method3280(arg1, true);
        if (super.field126.field8392) {
            for (int var5 = 0; class657.field9287 > var5; ++var5) {
                this.method3199(arg1, (byte) 92, var5);
                int[] var6 = this.method49(class561.field7790, false, 0);
                var4[var5] = var6[class635.field8901];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIBIIIIII)V")
    public static final void method3198(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class263.field3294 <= arg0 && class314.field4052 >= arg0 && ~class263.field3294 >= ~arg8 && class314.field4052 >= arg8 && arg1 >= class263.field3294 && ~class314.field4052 <= ~arg1 && arg7 >= class263.field3294 && ~arg7 >= ~class314.field4052 && arg2 >= class289.field3595 && class159.field2063 >= arg2 && ~class289.field3595 >= ~arg5 && ~class159.field2063 <= ~arg5 && arg9 >= class289.field3595 && ~arg9 >= ~class159.field2063 && ~arg6 <= ~class289.field3595 && ~arg6 >= ~class159.field2063) {
            class291.method1637(arg2, arg4, arg5, arg9, arg0, (byte) -127, arg1, arg6, arg8, arg7);
        } else {
            class182.method1140(arg2, arg5, arg7, arg8, arg4, arg1, 0, arg6, arg9, arg0);
        }
        if (arg3 != 42) {
            field8113 = true;
        }
        ++field8115;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(IBI)V")
    private final void method3199(int arg0, byte arg1, int arg2) {
        ++field8110;
        int var4 = class269.field3405[arg2];
        int var5 = class272.field3439[arg0];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class561.field7790 = arg0;
            class635.field8901 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class561.field7790 = arg2;
            class635.field8901 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class561.field7790 = arg2;
            class635.field8901 = -arg0 + class657.field9287;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class635.field8901 = arg2;
            class561.field7790 = class622.field8706 - arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class635.field8901 = -arg2 + class657.field9287;
            class561.field7790 = -arg0 + class622.field8706;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class635.field8901 = class657.field9287 - arg0;
            class561.field7790 = -arg2 + class622.field8706;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class561.field7790 = class622.field8706 - arg2;
            class635.field8901 = arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class561.field7790 = arg0;
            class635.field8901 = -arg2 + class657.field9287;
        }
        class561.field7790 &= class669.field9431;
        if (arg1 != 92) {
            method3197(true);
        }
        class635.field8901 &= class194.field2440;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
    public class579() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILes;I)V")
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (arg0 == 1) {
            if (arg2 == 0) {
                super.field120 = ~arg1.method3501(-9268) == -2;
            }
            ++field8114;
        }
    }
}
