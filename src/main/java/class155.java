import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class155 extends class311 {

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "Ljm;")
    public static class162 field2207 = new class162();

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "Lka;")
    public static class408 field2210 = new class408(64);

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "F")
    public float field2209;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "I")
    public int field2203;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
    public int field2204;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
    public int field2205;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
    public int field2206;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILts;Li;ZZIIILea;IIIII)Lts;")
    public static final class116 method1131(int arg0, int arg1, class116 arg2, class83 arg3, boolean arg4, boolean arg5, int arg6, int arg7, int arg8, class58 arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field2211++;
        if (arg2 == null) {
            return null;
        }
        int var15 = 1031;
        if (arg3 != null) {
            int var16 = var15 | arg3.method668(arg8, 0, false, -1);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg11 << 32) + ((long) ((arg12 << 16) + (arg14 << 24) + arg1) + ((long) arg10 << 48));
        class408 var19 = class142.field2082;
        class116 var20;
        synchronized (class142.field2082) {
            var20 = (class116) class142.field2082.method2529(0, var17);
        }
        if (var20 == null || arg9.method187(var20.method866(), var15) != 0) {
            if (var20 != null) {
                var15 = arg9.method213(var15, var20.method866());
            }
            byte var21;
            if (arg1 == 1) {
                var21 = 9;
            } else if (arg1 == 2) {
                var21 = 12;
            } else if (arg1 == 3) {
                var21 = 15;
            } else if (arg1 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class98 var24 = new class98(var21 * var22 + 1, var22 * 2 * var21 - var21, 0);
            int var25 = var24.method757(0, 0, 100, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class136.field2021[var31] * var28 >> 15;
                    int var33 = class136.field2020[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method757(0, var33, 110, var32);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg12 * var36 + arg14 * var35 >> 8);
                short var38 = (short) (((arg10 & 0x7F) * var35 + (arg11 & 0x7F) * var36 & 0x7F00) + ((arg10 & 0x380) * var35 + (arg11 & 0x380) * var36 & 0x38000) + ((arg10 & 0xFC00) * var35 + (arg11 & 0xFC00) * var36 & 0xFC0000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method761(var26[0][var39], (byte) -1, var25, var37, (byte) 1, (short) -1, var26[0][(var39 + 1) % var21], var38, false);
                    } else {
                        var24.method761(var26[var34][(var39 + 1) % var21], (byte) -1, var26[var34 - 1][var39], var37, (byte) 1, (short) -1, var26[var34 - 1][(var39 + 1) % var21], var38, false);
                        var24.method761(var26[var34][var39], (byte) -1, var26[var34 - 1][var39], var37, (byte) 1, (short) -1, var26[var34][(var39 + 1) % var21], var38, arg5);
                    }
                }
            }
            var20 = arg9.method254(var24, var15, class67.field943, 64, 768);
            class408 var40 = class142.field2082;
            synchronized (class142.field2082) {
                class142.field2082.method2527(108, var17, var20);
            }
        }
        int var41 = arg1 * 64 - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg4) {
            if (arg0 > 1024 && arg0 < 7168) {
                var42 -= 128;
            }
            if (arg0 > 5120 && arg0 < 11264) {
                var45 = var41 + 128;
            }
            if (arg0 > 9216 && arg0 < 15360) {
                var44 = var41 + 128;
            }
            if (arg0 > 13312 || arg0 < 3072) {
                var43 -= 128;
            }
        }
        int var46 = arg2.method868();
        if (arg5) {
            method1132(-101);
        }
        int var47 = arg2.method884();
        int var48 = arg2.method863();
        if (var48 < var43) {
            var48 = var43;
        }
        if (var47 > var44) {
            var47 = var44;
        }
        int var49 = arg2.method899();
        if (var42 > var46) {
            var46 = var42;
        }
        if (var49 > var45) {
            var49 = var45;
        }
        class182 var50 = null;
        if (arg3 != null) {
            int var51 = arg3.field1145[arg8];
            var50 = class25.method153(0, var51 >> 16);
            arg8 = var51 & 0xFFFF;
        }
        class116 var52;
        if (var50 == null) {
            var52 = var20.method907((byte) 3, var15, true);
            var52.method890((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method882((var46 + var47) / 2, 0, (var48 + var49) / 2);
        } else {
            var52 = var20.method907((byte) 3, var15, true);
            var52.method890((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method882((var46 + var47) / 2, 0, (var48 + var49) / 2);
            var52.method876(arg8, var50, 111);
        }
        if (arg13 != 0) {
            var52.method910(arg13);
        }
        if (arg6 != 0) {
            var52.method873(arg6);
        }
        if (arg7 != 0) {
            var52.method882(0, arg7, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
    public static void method1132(int arg0) {
        field2207 = null;
        field2210 = null;
        if (arg0 >= -43) {
            field2210 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)V")
    public static final void method1133(int arg0, int arg1) {
        if (arg0 <= 50) {
            method1131(-115, 76, (class116) null, (class83) null, true, true, 27, -74, 43, (class58) null, -73, 122, 109, 78, -71);
        }
        field2208++;
        if (class387.method2400(arg1, 176)) {
            class260.method1677(-1, class103.field1425[arg1], -4735);
        }
    }
}
