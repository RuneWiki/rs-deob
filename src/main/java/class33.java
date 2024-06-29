import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class33 {

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "Ljc;")
    public static class305 field335 = new class305("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
    public static int field341 = -1;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "Lao;")
    public static class191 field342 = new class191(106, -2);

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "[[[B")
    public static byte[][][] field339;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILoj;IIILza;IILe;IIIII)Le;")
    public static final class373 method183(int arg0, int arg1, class260 arg2, int arg3, int arg4, int arg5, class287 arg6, int arg7, int arg8, class373 arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field340++;
        if (arg9 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg2 != null) {
            int var16 = var15 | arg2.method1604(arg10, false, -1, (byte) 125);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg14 << 32) + (long) ((arg12 << 16) + arg0 + (arg11 << 24)) + ((long) arg1 << 48);
        class509 var19 = class374.field5067;
        class373 var20;
        synchronized (class374.field5067) {
            var20 = (class373) class374.field5067.method3032(3589, var17);
        }
        if (var20 == null || arg6.method1191(var20.method2025(), var15) != 0) {
            if (var20 != null) {
                var15 = arg6.method1211(var15, var20.method2025());
            }
            byte var21;
            if (arg0 == 1) {
                var21 = 9;
            } else if (arg0 == 2) {
                var21 = 12;
            } else if (arg0 == 3) {
                var21 = 15;
            } else if (arg0 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class131 var24 = new class131((var21 * var22) + 1, var21 * 2 * var22 + -var21, 0);
            int var25 = var24.method798(true, 0, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class456.field6812[var31] * var28 >> 15;
                    int var33 = class456.field6811[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method798(true, var32, var33, 0);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg11 * var35 + arg12 * var36 >> 8);
                short var38 = (short) (((arg1 & 0xFC00) * var35 + (arg14 & 0xFC00) * var36 & 0xFC0000) + ((arg1 & 0x380) * var35 + (arg14 & 0x380) * var36 & 0x38000) + ((arg1 & 0x7F) * var35 + (arg14 & 0x7F) * var36 & 0x7F00) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method785(var25, (byte) -1, var26[0][(var39 + 1) % var21], var38, (byte) 1, var26[0][var39], var37, (short) -1, -88);
                    } else {
                        var24.method785(var26[var34 - 1][var39], (byte) -1, var26[var34 - 1][(var39 + 1) % var21], var38, (byte) 1, var26[var34][(var39 + 1) % var21], var37, (short) -1, -35);
                        var24.method785(var26[var34 - 1][var39], (byte) -1, var26[var34][(var39 + 1) % var21], var38, (byte) 1, var26[var34][var39], var37, (short) -1, -101);
                    }
                }
            }
            var20 = arg6.method1213(var24, var15, class142.field1893, 64, 768);
            class509 var40 = class374.field5067;
            synchronized (class374.field5067) {
                class374.field5067.method3046(var17, var20, 1);
            }
        }
        int var41 = (arg0 << 6) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg7 != 0) {
            if ((arg7 & 0x8) != 0) {
                var42 -= 128;
            }
            if ((arg7 & 0x1) != 0) {
                var45 = var41 + 128;
            }
            if ((arg7 & 0x2) != 0) {
                var43 -= 128;
            }
            if ((arg7 & 0x4) != 0) {
                var44 = var41 + 128;
            }
        }
        if (arg3 <= 36) {
            return null;
        }
        int var46 = arg9.method2043();
        int var47 = arg9.method2019();
        int var48 = arg9.method2048();
        int var49 = arg9.method2024();
        if (var47 > var44) {
            var47 = var44;
        }
        if (var48 < var43) {
            var48 = var43;
        }
        if (var46 < var42) {
            var46 = var42;
        }
        if (var45 < var49) {
            var49 = var45;
        }
        class516 var50 = null;
        if (arg2 != null) {
            int var51 = arg2.field3474[arg10];
            var50 = class7.field97.method2953(15, var51 >> 16);
            arg10 = var51 & 0xFFFF;
        }
        class373 var52;
        if (var50 == null) {
            var52 = var20.method2027((byte) 3, var15, true);
            var52.method2035(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method2044(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method2027((byte) 3, var15, true);
            var52.method2035(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method2044(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method2209(0, arg10, var50);
        }
        if (arg4 != 0) {
            var52.method2022(arg4);
        }
        if (arg5 != 0) {
            var52.method2039(arg5);
        }
        if (arg8 != 0) {
            var52.method2044(0, arg8, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLjk;)Z")
    public static final boolean method184(byte arg0, class450 arg1) {
        field337++;
        if (class333.field4406 == arg1.field6679) {
            class447.field6519 = 250;
            return true;
        } else {
            return arg0 != -37;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)[B")
    public static final byte[] method185(int arg0, byte arg1) {
        field338++;
        class203 var2 = (class203) class257.field3430.method324((long) arg0, -59);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class477.method2908((byte) -127, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class203(var3);
            class257.field3430.method322((long) arg0, var2, (byte) -127);
        }
        if (arg1 != -1) {
            method186(-56);
        }
        return var2.field2689;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
    public static void method186(int arg0) {
        field339 = null;
        if (arg0 != 0) {
            field341 = -70;
        }
        field335 = null;
        field342 = null;
    }
}
