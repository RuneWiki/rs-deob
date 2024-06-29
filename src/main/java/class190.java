import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class190 extends class337 {

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "[B")
    public byte[] field2800;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "Ltc;")
    public static class233 field2803;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "Lst;")
    public static class296 field2802;

    static {
        new class475("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        field2803 = new class233(0, 0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V", line = 3)
    public static void method1295(boolean arg0) {
        field2803 = null;
        field2802 = null;
        if (arg0) {
            method1296(95, 25, -13, 84, null, 55, 108, null, null, false, 29, (byte) -42, -78, -90, 48);
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "([B)V", line = 15)
    public class190(byte[] arg0) {
        this.field2800 = arg0;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII[IIILvb;[IZIBIII)I", line = 25)
    public static final int method1296(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, class130 arg7, int[] arg8, boolean arg9, int arg10, byte arg11, int arg12, int arg13, int arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class402.field6048[var15][var35] = 0;
                class230.field3438[var15][var35] = 99999999;
            }
        }
        field2804++;
        boolean var16;
        if (arg10 == 1) {
            var16 = class93.method537(false, arg5, arg12, arg14, arg0, arg7, arg1, arg3, arg2, arg6, arg13);
        } else if (arg10 == 2) {
            var16 = class415.method2496(arg2, (byte) -82, arg6, arg5, arg12, arg1, arg13, arg7, arg14, arg3, arg0);
        } else {
            var16 = class357.method2224(arg6, arg3, arg11 - 25931, arg14, arg13, arg5, arg10, arg2, arg7, arg1, arg0, arg12);
        }
        int var17 = arg1 - 64;
        int var18 = arg5 - 64;
        int var19 = class170.field2531;
        int var20 = class70.field1055;
        if (!var16) {
            if (!arg9) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= (arg2 + var23); var24++) {
                for (int var25 = arg6 - var23; var25 <= arg6 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class230.field3438[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg2 > var24) {
                            var28 = arg2 - var24;
                        } else if (var24 > (arg2 + arg14 - 1)) {
                            var28 = -arg14 - (arg2 - var24 - 1);
                        }
                        int var29 = 0;
                        if (arg6 > var25) {
                            var29 = arg6 - var25;
                        } else if (arg6 - (1 - arg12) < var25) {
                            var29 = var25 + 1 - arg12 - arg6;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && var22 > class230.field3438[var26][var27]) {
                            var21 = var30;
                            var22 = class230.field3438[var26][var27];
                            var19 = var24;
                            var20 = var25;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg1 == var19 && arg5 == var20) {
            return 0;
        } else if (arg11 == -96) {
            byte var31 = 0;
            class199.field2885[var31] = var19;
            int var37 = var31 + 1;
            class315.field4499[var31] = var20;
            int var32;
            int var33 = var32 = class402.field6048[var19 - var17][var20 - var18];
            while (arg1 != var19 || arg5 != var20) {
                if (var32 != var33) {
                    class199.field2885[var37] = var19;
                    var32 = var33;
                    class315.field4499[var37++] = var20;
                }
                if ((var33 & 0x2) != 0) {
                    var19++;
                } else if ((var33 & 0x8) != 0) {
                    var19--;
                }
                if ((var33 & 0x1) != 0) {
                    var20++;
                } else if ((var33 & 0x4) != 0) {
                    var20--;
                }
                var33 = class402.field6048[var19 - var17][var20 - var18];
            }
            int var34 = 0;
            while (var37-- > 0) {
                arg4[var34] = class199.field2885[var37];
                arg8[var34++] = class315.field4499[var37];
                if (arg4.length <= var34) {
                    break;
                }
            }
            return var34;
        } else {
            return -107;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)V", line = 200)
    public static final void method1297(boolean arg0) {
        if (arg0) {
            class411.field6178.method1242(2);
            field2801++;
            class150.field2232 = 1;
            class197.field2869 = null;
        }
    }
}
