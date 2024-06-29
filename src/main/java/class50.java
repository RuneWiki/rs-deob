import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class50 extends class179 {

    @OriginalMember(owner = "client!u", name = "m", descriptor = "J")
    public long field763;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "[I")
    public static int[] field764 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Lke;")
    public static class407 field762 = new class407(16);

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIILfn;IIIIIIIZLcd;BLqq;)Lcd;", line = 3)
    public static final class198 method354(int arg0, int arg1, int arg2, class87 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11, class198 arg12, byte arg13, class318 arg14) {
        field760++;
        if (arg12 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg3 != null) {
            int var16 = var15 | arg3.method615((byte) 17, -1, arg6, false);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg0 << 48) + ((long) arg4 << 32) + (long) ((arg10 << 16) + (arg2 << 24) + arg5);
        class288 var19 = class475.field7250;
        class198 var20;
        synchronized (class475.field7250) {
            var20 = (class198) class475.field7250.method1752(0, var17);
        }
        if (var20 == null || arg14.method1944(var20.method489(), var15) != 0) {
            if (var20 != null) {
                var15 = arg14.method1951(var15, var20.method489());
            }
            byte var21;
            if (arg5 == 1) {
                var21 = 9;
            } else if (arg5 == 2) {
                var21 = 12;
            } else if (arg5 == 3) {
                var21 = 15;
            } else if (arg5 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class303 var24 = new class303(var21 * var22 + 1, var21 * var22 * 2 + -var21, 0);
            int var25 = var24.method1826(0, 0, 0, (byte) 116);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class195.field3075[var31] * var28 >> 15;
                    int var33 = class195.field3077[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method1826(0, var33, var32, (byte) 123);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg2 * var35 + arg10 * var36 >> 8);
                short var38 = (short) (((arg0 & 0x380) * var35 + (arg4 & 0x380) * var36 & 0x38000) + ((arg0 & 0xFC00) * var35 + (arg4 & 0xFC00) * var36 & 0xFC0000) + ((arg0 & 0x7F) * var35 + (arg4 & 0x7F) * var36 & 0x7F00) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method1827(var38, var37, var26[0][(var39 + 1) % var21], var26[0][var39], (byte) 94, var25, (byte) 1, (byte) -1, (short) -1);
                    } else {
                        var24.method1827(var38, var37, var26[var34 - 1][(var39 + 1) % var21], var26[var34][(var39 + 1) % var21], (byte) 92, var26[var34 - 1][var39], (byte) 1, (byte) -1, (short) -1);
                        var24.method1827(var38, var37, var26[var34][(var39 + 1) % var21], var26[var34][var39], (byte) 104, var26[var34 - 1][var39], (byte) 1, (byte) -1, (short) -1);
                    }
                }
            }
            var20 = arg14.method1908(var24, var15, class494.field7521, 64, 768);
            class288 var40 = class475.field7250;
            synchronized (class475.field7250) {
                class475.field7250.method1758(1, var20, var17);
            }
        }
        int var41 = (arg5 << 6) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg11) {
            if (arg7 > 5120 && arg7 < 11264) {
                var45 = var41 + 128;
            }
            if (arg7 > 9216 && arg7 < 15360) {
                var44 = var41 + 128;
            }
            if (arg7 > 13312 || arg7 < 3072) {
                var43 -= 128;
            }
            if (arg7 > 1024 && arg7 < 7168) {
                var42 -= 128;
            }
        }
        int var46 = arg12.method483();
        if (arg13 > -99) {
            return null;
        }
        int var47 = arg12.method490();
        int var48 = arg12.method466();
        if (var46 < var42) {
            var46 = var42;
        }
        if (var44 < var47) {
            var47 = var44;
        }
        if (var43 > var48) {
            var48 = var43;
        }
        int var49 = arg12.method510();
        if (var45 < var49) {
            var49 = var45;
        }
        class312 var50 = null;
        if (arg3 != null) {
            int var51 = arg3.field1512[arg6];
            var50 = class429.field6302.method108(var51 >> 16, 3);
            arg6 = var51 & 0xFFFF;
        }
        class198 var52;
        if (var50 == null) {
            var52 = var20.method511((byte) 3, var15, true);
            var52.method487(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method508(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method511((byte) 3, var15, true);
            var52.method487(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method508(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method1234(var50, arg6, -22224);
        }
        if (arg9 != 0) {
            var52.method470(arg9);
        }
        if (arg8 != 0) {
            var52.method467(arg8);
        }
        if (arg1 != 0) {
            var52.method508(0, arg1, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)V", line = 217)
    public static void method355(boolean arg0) {
        if (arg0) {
            field762 = null;
        }
        field764 = null;
        field762 = null;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V", line = 229)
    public class50() {
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(J)V", line = 231)
    public class50(long arg0) {
        this.field763 = arg0;
    }
}
