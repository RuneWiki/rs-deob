import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public abstract class class29 {

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "[Z")
    public static boolean[] field366 = new boolean[200];

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "I")
    public static int field365 = 0;

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(BJ)I")
    public abstract int method280(byte arg0, long arg1);

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IJ)I")
    public final int method281(int arg0, long arg1) {
        field367++;
        if (arg0 >= -62) {
            method282(40, (byte) -90, 21, null);
        }
        long var4 = this.method283((byte) 127);
        if (var4 > 0L) {
            class519.method2960(-124, var4);
        }
        return this.method280((byte) -100, arg1);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IBILsea;)Lnba;")
    public static final class270 method282(int arg0, byte arg1, int arg2, class648 arg3) {
        field369++;
        int var4 = 7 % ((80 - arg1) / 43);
        byte[] var5 = arg3.method3654(-15615, arg2, arg0);
        return var5 == null ? null : new class270(var5);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)J")
    public abstract long method283(byte arg0);

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(B)J")
    public abstract long method284(byte arg0);

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(III[IIIIILnn;IIZ[III)I")
    public static final int method285(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, class380 arg8, int arg9, int arg10, boolean arg11, int[] arg12, int arg13, int arg14) {
        field368++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class675.field9527[var15][var35] = 0;
                class182.field2634[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg0 == 1) {
            var16 = class631.method3535(arg2, arg1, arg8, arg6, arg14, arg5, arg13, -1, arg9, arg7, arg4);
        } else if (arg0 == 2) {
            var16 = class589.method3347(arg14, arg9, arg1, arg8, arg13, arg7, arg5, arg6, -100, arg2, arg4);
        } else {
            var16 = class6.method20(arg6, arg4, arg14, arg2, arg1, arg13, arg9, arg8, 24157, arg5, arg7, arg0);
        }
        if (arg10 != -6863) {
            field366 = null;
        }
        int var17 = arg5 - 64;
        int var18 = arg2 - 64;
        int var19 = class185.field2683;
        int var20 = class16.field166;
        if (!var16) {
            if (!arg11) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg14 - var23; var24 <= arg14 + var23; var24++) {
                for (int var25 = arg9 - var23; var25 <= arg9 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class182.field2634[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg14 > var24) {
                            var28 = arg14 - var24;
                        } else if (arg14 + arg13 - 1 < var24) {
                            var28 = var24 + 1 - (arg13 + arg14);
                        }
                        int var29 = 0;
                        if (var25 < arg9) {
                            var29 = arg9 - var25;
                        } else if (var25 > (arg4 + arg9 - 1)) {
                            var29 = var25 + 1 - arg9 - arg4;
                        }
                        int var30 = var28 * var28 + (var29 * var29);
                        if (var30 < var21 || var21 == var30 && var22 > class182.field2634[var26][var27]) {
                            var20 = var25;
                            var21 = var30;
                            var19 = var24;
                            var22 = class182.field2634[var26][var27];
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg5 == var19 && arg2 == var20) {
            return 0;
        }
        byte var31 = 0;
        class341.field4577[var31] = var19;
        int var37 = var31 + 1;
        class72.field957[var31] = var20;
        int var32;
        int var33 = var32 = class675.field9527[var19 - var17][var20 - var18];
        while (arg5 != var19 || arg2 != var20) {
            if (var32 != var33) {
                class341.field4577[var37] = var19;
                var32 = var33;
                class72.field957[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class675.field9527[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg12[var34] = class341.field4577[var37];
            arg3[var34++] = class72.field957[var37];
            if (var34 >= arg12.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)V")
    public static void method286(int arg0) {
        field366 = null;
        if (arg0 != 4) {
            field365 = -91;
        }
    }

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "(B)V")
    public abstract void method287(byte arg0);
}
