import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class426 {

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "Lxa;")
    public static class458 field5656;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)V", line = 8)
    public static void method2297(boolean arg0) {
        field5656 = null;
        if (arg0) {
            field5656 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILba;III)Lgr;", line = 20)
    public static final class396 method2298(int arg0, class350 arg1, int arg2, int arg3, int arg4) {
        field5658++;
        if (arg1 == null) {
            return null;
        } else if (arg2 == 12409) {
            return new class396(arg0, arg4, arg3, arg1.method875(), arg1.method912(), arg1.method876(), arg1.method864(), arg1.method913(), arg1.method880(), arg1.method872());
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILjo;Ljava/awt/Canvas;BLe;)Loa;", line = 37)
    public static final class635 method2299(int arg0, class303 arg1, Canvas arg2, byte arg3, class486 arg4) {
        field5657++;
        if (arg3 != -125) {
            method2301(19);
        }
        if (!class176.method1025(arg3 + 9)) {
            throw new RuntimeException("");
        } else if (class527.method2998("jaggl", (byte) 14)) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg2, 8, 8, 8, 24, 0, arg0);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class621 var8 = new class621(var5, arg2, var6, arg4, arg1, arg0);
            var8.method2751(9);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIILoa;ILba;IILam;IIII)Lba;", line = 66)
    public static final class350 method2300(int arg0, int arg1, int arg2, int arg3, int arg4, class635 arg5, int arg6, class350 arg7, int arg8, int arg9, class576 arg10, int arg11, int arg12, int arg13, int arg14) {
        field5659++;
        if (arg7 == null) {
            return null;
        }
        if (arg13 > -43) {
            method2300(24, -37, -62, 54, -26, null, -6, null, 13, -16, null, 23, 127, -72, -61);
        }
        int var15 = 2055;
        if (arg10 != null) {
            int var16 = var15 | arg10.method3255(arg6, 9306, false, -1);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = (long) ((arg12 << 24) + (arg4 << 16) + arg3) - (-((long) arg1 << 32) - ((long) arg8 << 48));
        class653 var19 = class39.field423;
        class350 var20;
        synchronized (class39.field423) {
            var20 = (class350) class39.field423.method3690((byte) 122, var17);
        }
        if (var20 == null || arg5.method312(var20.method902(), var15) != 0) {
            if (var20 != null) {
                var15 = arg5.method372(var15, var20.method902());
            }
            byte var21;
            if (arg3 == 1) {
                var21 = 9;
            } else if (arg3 == 2) {
                var21 = 12;
            } else if (arg3 == 3) {
                var21 = 15;
            } else if (arg3 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class90 var24 = new class90(var21 * var22 + 1, var21 * 2 * var22 - var21, 0);
            int var25 = var24.method569(-106, 0, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class285.field3655[var31] * var28 >> 14;
                    int var33 = class285.field3656[var31] * var29 >> 14;
                    var26[var27][var30] = var24.method569(-55, var33, 0, var32);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg4 * var36 + arg12 * var35 >> 8);
                short var38 = (short) (((arg1 & 0x7F) * var36 + (arg8 & 0x7F) * var35 & 0x7F00) + ((arg1 & 0xFC00) * var36 + (arg8 & 0xFC00) * var35 & 0xFC0000) + ((arg1 & 0x380) * var36 + (arg8 & 0x380) * var35 & 0x38000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method566(1, var26[0][var39], (short) -1, (byte) -1, var26[0][(var39 + 1) % var21], var38, var37, var25, (byte) 1);
                    } else {
                        var24.method566(1, var26[var34][(var39 + 1) % var21], (short) -1, (byte) -1, var26[var34 - 1][(var39 + 1) % var21], var38, var37, var26[var34 - 1][var39], (byte) 1);
                        var24.method566(1, var26[var34][var39], (short) -1, (byte) -1, var26[var34][(var39 + 1) % var21], var38, var37, var26[var34 - 1][var39], (byte) 1);
                    }
                }
            }
            var20 = arg5.method375(var24, var15, class423.field5633, 64, 768);
            class653 var40 = class39.field423;
            synchronized (class39.field423) {
                class39.field423.method3683(var20, (byte) -17, var17);
            }
        }
        int var41 = (arg3 << 8) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg14 != 0) {
            if ((arg14 & 0x4) != 0) {
                var44 = var41 + 512;
            }
            if ((arg14 & 0x2) != 0) {
                var43 -= 512;
            }
            if ((arg14 & 0x1) != 0) {
                var45 = var41 + 512;
            }
            if ((arg14 & 0x8) != 0) {
                var42 -= 512;
            }
        }
        int var46 = arg7.method912();
        int var47 = arg7.method876();
        int var48 = arg7.method880();
        if (var42 > var46) {
            var46 = var42;
        }
        if (var43 > var48) {
            var48 = var43;
        }
        if (var44 < var47) {
            var47 = var44;
        }
        int var49 = arg7.method872();
        if (var49 > var45) {
            var49 = var45;
        }
        class2 var50 = null;
        if (arg10 != null) {
            int var51 = arg10.field8216[arg6];
            var50 = class618.field8696.method131(var51 >> 16, true);
            arg6 = var51 & 0xFFFF;
        }
        class350 var52;
        if (var50 == null) {
            var52 = var20.method602((byte) 3, var15, true);
            var52.method860(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method862(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method602((byte) 3, var15, true);
            var52.method860(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method862(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method1942(var50, 16383, arg6);
        }
        if (arg2 != 0) {
            var52.method865(arg2);
        }
        if (arg11 != 0) {
            var52.method870(arg11);
        }
        if (arg0 != 0) {
            var52.method862(0, arg0, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V", line = 278)
    public static final void method2301(int arg0) {
        class526.method2994(arg0 + 48972, false);
        if (arg0 != -16842) {
            method2300(-106, -103, -107, 100, 87, null, -91, null, -114, -52, null, -11, 127, -87, 0);
        }
        field5655++;
        if (class190.field2301 >= 0 && class190.field2301 != 0) {
            class466.method2646(8000, class190.field2301);
            class190.field2301 = -1;
        }
    }
}
