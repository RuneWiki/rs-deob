import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class518 extends class417 {

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "Z")
    public static boolean field7388 = false;

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "Lh;")
    public static class572 field7387 = new class572("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!qs", name = "x", descriptor = "Llu;")
    public static class610 field7391 = new class610(32, -1);

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "I")
    public int field7379;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public int field7381;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
    public int field7382;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "I")
    public int field7385;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
    public int field7386;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "I")
    public int field7390;

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!qs", name = "A", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "Lvp;")
    public class162 field7376;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "Lvp;")
    public class162 field7384;

    @OriginalMember(owner = "client!qs", name = "y", descriptor = "Liba;")
    public static class453 field7392;

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "Ljava/lang/String;")
    public String field7389;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "Z")
    public boolean field7380;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "[Ljava/lang/Object;")
    public Object[] field7383;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V", line = 3)
    public static void method3065(byte arg0) {
        field7387 = null;
        field7391 = null;
        field7392 = null;
        if (arg0 != 49) {
            method3067(null, (byte) 17);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILr;ILtt;IIIIIIILqa;IZI)Lr;", line = 29)
    public static final class159 method3066(int arg0, class159 arg1, int arg2, class78 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class208 arg11, int arg12, boolean arg13, int arg14) {
        field7393++;
        if (arg1 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg3 != null) {
            int var16 = var15 | arg3.method600(false, -1, arg0, false);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg12 << 32) + ((long) ((arg5 << 16) + arg10 + (arg4 << 24)) + ((long) arg8 << 48));
        if (!arg13) {
            return null;
        }
        class117 var19 = class348.field4770;
        class159 var20;
        synchronized (class348.field4770) {
            var20 = (class159) class348.field4770.method842(0, var17);
        }
        if (var20 == null || arg11.method528(var20.method90(), var15) != 0) {
            if (var20 != null) {
                var15 = arg11.method478(var15, var20.method90());
            }
            byte var21;
            if (arg10 == 1) {
                var21 = 9;
            } else if (arg10 == 2) {
                var21 = 12;
            } else if (arg10 == 3) {
                var21 = 15;
            } else if (arg10 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class451 var24 = new class451((var21 * var22) + 1, var21 * 2 * var22 - var21, 0);
            int var25 = var24.method2740((byte) 101, 0, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class589.field8742[var31] * var28 >> 15;
                    int var33 = class589.field8735[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method2740((byte) 111, var33, var32, 0);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg4 * var35 + arg5 * var36 >> 8);
                short var38 = (short) (((arg8 & 0x7F) * var35 + (arg12 & 0x7F) * var36 & 0x7F00) + ((arg8 & 0x380) * var35 + (arg12 & 0x380) * var36 & 0x38000) + ((arg8 & 0xFC00) * var35 + (arg12 & 0xFC00) * var36 & 0xFC0000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method2741(var26[0][var39], (short) -1, var38, (byte) 1, -1, (byte) -1, var25, var37, var26[0][(var39 + 1) % var21]);
                    } else {
                        var24.method2741(var26[var34][(var39 + 1) % var21], (short) -1, var38, (byte) 1, -1, (byte) -1, var26[var34 - 1][var39], var37, var26[var34 - 1][(var39 + 1) % var21]);
                        var24.method2741(var26[var34][var39], (short) -1, var38, (byte) 1, -1, (byte) -1, var26[var34 - 1][var39], var37, var26[var34][(var39 + 1) % var21]);
                    }
                }
            }
            var20 = arg11.method491(var24, var15, class433.field5796, 64, 768);
            class117 var40 = class348.field4770;
            synchronized (class348.field4770) {
                class348.field4770.method835((byte) 124, var17, var20);
            }
        }
        int var41 = (arg10 << 6) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg2 != 0) {
            if ((arg2 & 0x1) != 0) {
                var45 = var41 + 128;
            }
            if ((arg2 & 0x2) != 0) {
                var43 -= 128;
            }
            if ((arg2 & 0x4) != 0) {
                var44 = var41 + 128;
            }
            if ((arg2 & 0x8) != 0) {
                var42 -= 128;
            }
        }
        int var46 = arg1.method85();
        int var47 = arg1.method58();
        int var48 = arg1.method81();
        if (var47 > var44) {
            var47 = var44;
        }
        int var49 = arg1.method68();
        if (var48 < var43) {
            var48 = var43;
        }
        if (var46 < var42) {
            var46 = var42;
        }
        if (var49 > var45) {
            var49 = var45;
        }
        class106 var50 = null;
        if (arg3 != null) {
            int var51 = arg3.field1035[arg0];
            var50 = class463.field6521.method2982(var51 >> 16, 67);
            arg0 = var51 & 0xFFFF;
        }
        class159 var52;
        if (var50 == null) {
            var52 = var20.method94((byte) 3, var15, true);
            var52.method76(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method82(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method94((byte) 3, var15, true);
            var52.method76(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method82(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method1144(19258, var50, arg0);
        }
        if (arg14 != 0) {
            var52.method84(arg14);
        }
        if (arg6 != 0) {
            var52.method77(arg6);
        }
        if (arg9 != 0) {
            var52.method82(0, arg9, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lgw;B)Ljava/lang/String;", line = 258)
    public static final String method3067(class148 arg0, byte arg1) {
        field7377++;
        int var2 = -9 % ((arg1 - 51) / 61);
        return class177.method1242(32767, arg0, -7188);
    }
}
