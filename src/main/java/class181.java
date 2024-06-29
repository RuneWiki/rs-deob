import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class181 extends class73 {

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field3317 = 0;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "Z")
    public static volatile boolean field3324 = true;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "Lli;")
    public static class185 field3326 = class245.method1649("Cache:", -55);

    @OriginalMember(owner = "client!i", name = "t", descriptor = "Lli;")
    public static class185 field3323 = class245.method1649("niveau ", 125);

    @OriginalMember(owner = "client!i", name = "z", descriptor = "Lli;")
    public static class185 field3329 = class245.method1649("Lade Wordpack )2 ", 124);

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public static int field3327 = 0;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "Lli;")
    public static class185 field3333 = class245.method1649("<)4col>", 127);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static volatile int field3319 = -1;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "Lli;")
    public static class185 field3332 = class245.method1649("<col=c0ff00>", 123);

    @OriginalMember(owner = "client!i", name = "H", descriptor = "Lli;")
    private static class185 field3337 = class245.method1649("Loading title screen )2 ", -65);

    @OriginalMember(owner = "client!i", name = "A", descriptor = "Lli;")
    public static class185 field3330 = field3337;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "I")
    public static int field3335 = -1;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "J")
    public long field3318;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Li;")
    public class181 field3320;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "Li;")
    public class181 field3322;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "Lhi;")
    public static class250 field3325;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public final void method1276(byte arg0) {
        field3331++;
        if (this.field3322 == null) {
            return;
        }
        if (arg0 != 82) {
            field3333 = null;
        }
        this.field3322.field3320 = this.field3320;
        this.field3320.field3322 = this.field3322;
        this.field3320 = null;
        this.field3322 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILpa;IIIZIIIIIIBLic;)Lic;")
    public static final class98 method1277(int arg0, class2 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, byte arg12, class98 arg13) {
        field3328++;
        long var14 = ((long) arg2 << 32) + ((long) arg7 << 48) + (long) ((arg0 << 16) + (arg11 - -(arg9 << 24)));
        class98 var16 = (class98) class165.field3078.method82(-89, var14);
        if (var16 == null) {
            byte var17 = 3;
            byte var18;
            if (arg11 == 1) {
                var18 = 9;
            } else if (arg11 == 2) {
                var18 = 12;
            } else if (arg11 == 3) {
                var18 = 15;
            } else if (arg11 == 4) {
                var18 = 18;
            } else {
                var18 = 21;
            }
            int[] var19 = new int[] { 64, 96, 128 };
            class4 var20 = new class4((var17 * var18) + 1, var17 * var18 * 2 - var18, 0);
            int[][] var21 = new int[var17][var18];
            int var22 = var20.method52(0, 0, 0);
            for (int var23 = 0; var23 < var17; var23++) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; var32 < var18; var32++) {
                    int var33 = (var32 << 11) / var18;
                    int var34 = class167.field3110[var33] * var30 + arg4 >> 16;
                    int var35 = class167.field3112[var33] * var31 + arg8 >> 16;
                    var21[var23][var32] = var20.method52(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var17; var24++) {
                int var25 = (var24 * 256 + 128) / var17;
                int var26 = 256 - var25;
                byte var27 = (byte) (arg0 * var26 + arg9 * var25 >> 8);
                short var28 = (short) (((arg2 & 0x380) * var26 + (arg7 & 0x380) * var25 & 0x38000) + ((arg2 & 0x7F) * var26 + (arg7 & 0x7F) * var25 & 0x7F00) + ((arg2 & 0xFC00) * var26 + (arg7 & 0xFC00) * var25 & 0xFC0000) >> 8);
                for (int var29 = 0; var29 < var18; var29++) {
                    if (var24 == 0) {
                        var20.method55(var22, var21[0][(var29 + 1) % var18], var21[0][var29], (byte) 1, var28, var27);
                    } else {
                        var20.method55(var21[var24 - 1][var29], var21[var24 - 1][(var29 + 1) % var18], var21[var24][(var29 + 1) % var18], (byte) 1, var28, var27);
                        var20.method55(var21[var24 - 1][var29], var21[var24][(var29 + 1) % var18], var21[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var20.method64(64, 768, -50, -10, -50);
            class165.field3078.method84(121, var14, var16);
        }
        int var36 = arg11 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = -var36;
        int var40 = arg13.method645();
        int var41 = var36;
        if (arg5) {
            if (arg10 > 1664 || arg10 < 384) {
                var37 -= 128;
            }
            if (arg10 > 128 && arg10 < 896) {
                var39 -= 128;
            }
            if (arg10 > 1152 && arg10 < 1920) {
                var41 = var36 + 128;
            }
            if (arg10 > 640 && arg10 < 1408) {
                var38 = var36 + 128;
            }
        }
        if (var39 > var40) {
            var40 = var39;
        }
        int var42 = arg13.method640();
        class105 var43 = null;
        int var44 = arg13.method633();
        if (var44 < var37) {
            var44 = var37;
        }
        if (var41 < var42) {
            var42 = var41;
        }
        int var45 = arg13.method636();
        if (arg1 != null) {
            int var46 = arg1.field37[arg6];
            var43 = class166.method1187(var46 >> 16, 18553);
            arg6 = var46 & 0xFFFF;
        }
        if (var38 < var45) {
            var45 = var38;
        }
        class98 var47;
        if (var43 == null) {
            var47 = var16.method639(true, true);
            var47.method642((var42 - var40) / 2, 128, (var45 - var44) / 2);
            var47.method628((var40 + var42) / 2, 0, (var44 + var45) / 2);
        } else {
            var47 = var16.method639(!var43.method739(arg6, 255), true);
            var47.method642((var42 - var40) / 2, 128, (var45 - var44) / 2);
            var47.method628((var40 + var42) / 2, 0, (var44 + var45) / 2);
            var47.method641(var43, arg6);
        }
        if (arg10 != 0) {
            var47.method643(arg10);
        }
        int var48 = -53 % ((arg12 - 69) / 38);
        class222 var49 = (class222) var47;
        if (arg3 != class236.method1606(82, arg8 + var44, arg4 + var40, class265.field4703) || class236.method1606(36, arg8 + var45, arg4 - -var42, class265.field4703) != arg3) {
            for (int var50 = 0; var50 < var49.field4028; var50++) {
                var49.field4027[var50] += class236.method1606(62, var49.field4035[var50] + arg8, var49.field4032[var50] - -arg4, class265.field4703) - arg3;
            }
            var49.field4034 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
    public static void method1278(int arg0) {
        if (arg0 != -3) {
            method1277(82, (class2) null, -35, 10, -112, false, 92, 41, -67, 9, 59, 64, (byte) 83, (class98) null);
        }
        field3323 = null;
        field3333 = null;
        field3330 = null;
        field3326 = null;
        field3329 = null;
        field3337 = null;
        field3332 = null;
        field3325 = null;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V")
    public static final void method1279(int arg0) {
        field3334++;
        if (arg0 != -31909) {
            field3326 = null;
        }
        class5.field126.method86(0);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(IB)I")
    public static final int method1280(int arg0, byte arg1) {
        field3336++;
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xD2) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        if (arg1 < 89) {
            field3330 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[I)[I")
    public static final int[] method1281(int arg0, int[] arg1) {
        if (arg0 != -20207) {
            field3333 = null;
        }
        field3321++;
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class190.method1369(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }
}
