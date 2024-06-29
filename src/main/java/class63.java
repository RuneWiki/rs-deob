import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class63 extends class396 {

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "Ldr;")
    public class426 field724;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "Z")
    public static boolean field727 = false;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "Ljava/lang/String;")
    public static String field725 = "cyan:";

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "[I")
    public static int[] field726;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIBLbb;IZILen;IIIIILmj;)Lmj;")
    public static final class393 method384(int arg0, int arg1, int arg2, byte arg3, class182 arg4, int arg5, boolean arg6, int arg7, class174 arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class393 arg14) {
        field728++;
        if (arg14 == null) {
            return null;
        }
        int var15 = 1031;
        if (arg4 != null) {
            int var16 = var15 | arg4.method1182(arg12, -1, false, 128);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg10 << 48) + ((long) ((arg5 << 16) + (arg11 << 24) + arg2) + ((long) arg7 << 32));
        class331 var19 = class83.field936;
        class393 var20;
        synchronized (class83.field936) {
            if (arg3 > -14) {
                method385(113);
            }
            var20 = (class393) class83.field936.method2049(-62, var17);
        }
        if (var20 == null || arg8.method1016(var20.method720(), var15) != 0) {
            if (var20 != null) {
                var15 = arg8.method1013(var15, var20.method720());
            }
            byte var21;
            if (arg2 == 1) {
                var21 = 9;
            } else if (arg2 == 2) {
                var21 = 12;
            } else if (arg2 == 3) {
                var21 = 15;
            } else if (arg2 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class200 var24 = new class200((var21 * var22) + 1, var21 * 2 * var22 + -var21, 0);
            int var25 = var24.method1285(0, 0, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class286.field4025[var31] * var28 >> 15;
                    int var33 = class286.field4035[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method1285(0, 0, var33, var32);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg5 * var36 + arg11 * var35 >> 8);
                short var38 = (short) (((arg7 & 0x380) * var36 + (arg10 & 0x380) * var35 & 0x38000) + ((arg7 & 0xFC00) * var36 + (arg10 & 0xFC00) * var35 & 0xFC0000) + ((arg7 & 0x7F) * var36 + (arg10 & 0x7F) * var35 & 0x7F00) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method1279(var37, var26[0][var39], (byte) -61, var38, var25, (byte) -1, (short) -1, (byte) 1, var26[0][(var39 + 1) % var21]);
                    } else {
                        var24.method1279(var37, var26[var34][(var39 + 1) % var21], (byte) -61, var38, var26[var34 - 1][var39], (byte) -1, (short) -1, (byte) 1, var26[var34 - 1][(var39 + 1) % var21]);
                        var24.method1279(var37, var26[var34][var39], (byte) -61, var38, var26[var34 - 1][var39], (byte) -1, (short) -1, (byte) 1, var26[var34][(var39 + 1) % var21]);
                    }
                }
            }
            var20 = arg8.method991(var24, var15, class290.field4152, 64, 768);
            class331 var40 = class83.field936;
            synchronized (class83.field936) {
                class83.field936.method2046(var17, 0, var20);
            }
        }
        int var41 = arg2 * 64 - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg6) {
            if (arg1 > 5120 && arg1 < 11264) {
                var45 = var41 + 128;
            }
            if (arg1 > 13312 || arg1 < 3072) {
                var43 -= 128;
            }
            if (arg1 > 9216 && arg1 < 15360) {
                var44 = var41 + 128;
            }
            if (arg1 > 1024 && arg1 < 7168) {
                var42 -= 128;
            }
        }
        int var46 = arg14.method749();
        int var47 = arg14.method764();
        int var48 = arg14.method735();
        if (var44 < var47) {
            var47 = var44;
        }
        if (var42 > var46) {
            var46 = var42;
        }
        int var49 = arg14.method715();
        if (var43 > var48) {
            var48 = var43;
        }
        if (var45 < var49) {
            var49 = var45;
        }
        class152 var50 = null;
        if (arg4 != null) {
            int var51 = arg4.field2493[arg12];
            var50 = class158.method1040(var51 >> 16, false);
            arg12 = var51 & 0xFFFF;
        }
        class393 var52;
        if (var50 == null) {
            var52 = var20.method717((byte) 3, var15, true);
            var52.method736((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method758((var46 + var47) / 2, 0, (var48 + var49) / 2);
        } else {
            var52 = var20.method717((byte) 3, var15, true);
            var52.method736((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method758((var46 + var47) / 2, 0, (var48 + var49) / 2);
            var52.method2513(var50, (byte) -93, arg12);
        }
        if (arg9 != 0) {
            var52.method737(arg9);
        }
        if (arg0 != 0) {
            var52.method767(arg0);
        }
        if (arg13 != 0) {
            var52.method758(0, arg13, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Ldr;)V")
    public class63(class426 arg0) {
        this.field724 = arg0;
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(I)V")
    public static void method385(int arg0) {
        field725 = null;
        if (arg0 != -4535) {
            method384(-51, -58, -41, (byte) -34, (class182) null, 81, true, 47, (class174) null, 73, -110, 71, 111, 33, (class393) null);
        }
        field726 = null;
    }
}
