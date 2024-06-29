import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class398 extends class666 {

    @OriginalMember(owner = "client!rp", name = "J", descriptor = "Lkfa;")
    public static class549 field5326 = new class549(81, 2);

    @OriginalMember(owner = "client!rp", name = "F", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!rp", name = "H", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!rp", name = "I", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!rp", name = "K", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!rp", name = "L", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!rp", name = "M", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!rp", name = "E", descriptor = "Z")
    public static boolean field5321;

    @OriginalMember(owner = "client!rp", name = "G", descriptor = "[[I")
    public static int[][] field5323;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "(III)V")
    private final void method2179(int arg0, int arg1, int arg2) {
        ++field5327;
        if (arg0 != -2048) {
            field5323 = null;
        }
        int var4 = class579.field8246[arg1];
        int var5 = class476.field6935[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class488.field7085 = arg1;
            class10.field98 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class10.field98 = arg1;
            class488.field7085 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class488.field7085 = class501.field7222 - arg2;
            class10.field98 = arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class10.field98 = -arg2 + class567.field8041;
            class488.field7085 = arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class10.field98 = -arg2 + class567.field8041;
            class488.field7085 = -arg1 + class501.field7222;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class10.field98 = class567.field8041 - arg1;
            class488.field7085 = -arg2 + class501.field7222;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class488.field7085 = arg2;
            class10.field98 = -arg1 + class567.field8041;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class10.field98 = arg2;
            class488.field7085 = -arg1 + class501.field7222;
        }
        class488.field7085 &= class507.field7299;
        class10.field98 &= class515.field7357;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class32 var7 = new class32();
        var7.field366 = arg1 >> class8.field70;
        var7.field377 = arg2 >> class8.field70;
        var7.field359 = arg3 >> class8.field70;
        var7.field367 = arg4 >> class8.field70;
        var7.field379 = arg0;
        var7.field374 = arg1;
        var7.field373 = arg2;
        var7.field376 = arg3;
        var7.field375 = arg4;
        var7.field370 = arg5;
        var7.field371 = arg6;
        class295.field3873[class80.field849++] = var7;
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(Z)V")
    public static void method2181(boolean arg0) {
        field5323 = null;
        if (!arg0) {
            field5326 = null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IB)[[I")
    public final int[][] method1251(int arg0, byte arg1) {
        ++field5322;
        int[][] var3 = super.field9471.method3639(106, arg0);
        if (arg1 != 98) {
            field5323 = null;
        }
        if (super.field9471.field9180) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class501.field7222; ++var7) {
                this.method2179(-2048, var7, arg0);
                int[][] var8 = this.method3737(class10.field98, 0, arg1 + -95);
                var4[var7] = var8[0][class488.field7085];
                var5[var7] = var8[1][class488.field7085];
                var6[var7] = var8[2][class488.field7085];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILiaa;Z)V")
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (arg2) {
            if (~arg0 == -1) {
                super.field9465 = arg1.method2541(102) == 1;
            }
            ++field5324;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIBIII)I")
    public static final int method2182(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field5328;
        if (~(1 & arg4) == -2) {
            int var7 = arg2;
            arg2 = arg5;
            arg5 = var7;
        }
        if (arg3 != 23) {
            return 9;
        } else {
            int var8 = arg0 & 3;
            if (~var8 == -1) {
                return arg1;
            } else if (~var8 == -2) {
                return arg6;
            } else {
                return ~var8 == -3 ? -arg2 - -1 + -arg1 + 7 : -arg5 - (-1 - -arg6) + 7;
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V")
    public class398() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(IIII)V")
    public static final void method2183(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -28751) {
            method2182(-105, 115, -41, (byte) -54, 91, 61, 126);
        }
        ++field5329;
        class530 var4 = class242.method1402(arg1 + 28709, 11, arg2);
        var4.method3025((byte) -69);
        var4.field7589 = arg3;
        var4.field7593 = arg0;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)[I")
    public final int[] method122(int arg0, int arg1) {
        ++field5325;
        if (arg0 >= -21) {
            return null;
        } else {
            int[] var3 = super.field9466.method1811(arg1, 120);
            if (super.field9466.field4172) {
                for (int var4 = 0; ~var4 > ~class501.field7222; ++var4) {
                    this.method2179(-2048, var4, arg1);
                    int[] var5 = this.method3739(0, -122, class10.field98);
                    var3[var4] = var5[class488.field7085];
                }
            }
            return var3;
        }
    }
}
