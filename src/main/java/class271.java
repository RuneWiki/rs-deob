import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class271 {

    @OriginalMember(owner = "client!co", name = "d", descriptor = "Lqu;")
    public static class364 field4007 = new class364(34, 3);

    @OriginalMember(owner = "client!co", name = "g", descriptor = "Lno;")
    public static class483 field4010;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "Ldt;")
    public static class209 field4008;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "Lp;")
    public static class233 field4009;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIILqa;Lr;IILaba;IIIII)Lr;")
    public static final class520 method1719(int arg0, int arg1, int arg2, int arg3, int arg4, class167 arg5, class520 arg6, int arg7, int arg8, class224 arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field4004++;
        if (arg6 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg9 != null) {
            int var16 = var15 | arg9.method1475((byte) 96, false, arg7, -1);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg13 << 48) + ((long) arg4 << 32) + (long) ((arg8 << 16) + arg10 - -(arg2 << 24));
        class325 var19 = class203.field3028;
        class520 var20;
        synchronized (class203.field3028) {
            var20 = (class520) class203.field3028.method2025(var17, 2);
        }
        if (var20 == null || arg5.method1026(var20.method1950(), var15) != 0) {
            if (var20 != null) {
                var15 = arg5.method978(var15, var20.method1950());
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
            class114 var24 = new class114(var21 * var22 + 1, var22 * 2 * var21 - var21, 0);
            int var25 = var24.method700((byte) -80, 0, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class14.field129[var31] * var28 >> 15;
                    int var33 = class14.field130[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method700((byte) -7, 0, var33, var32);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg2 * var35 + arg8 * var36 >> 8);
                short var38 = (short) (((arg4 & 0x7F) * var36 + (arg13 & 0x7F) * var35 & 0x7F00) + ((arg4 & 0xFC00) * var36 + (arg13 & 0xFC00) * var35 & 0xFC0000) + ((arg4 & 0x380) * var36 + (arg13 & 0x380) * var35 & 0x38000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method693(var26[0][(var39 + 1) % var21], (byte) 1, false, var37, var38, (short) -1, (byte) -1, var26[0][var39], var25);
                    } else {
                        var24.method693(var26[var34 - 1][(var39 + 1) % var21], (byte) 1, false, var37, var38, (short) -1, (byte) -1, var26[var34][(var39 + 1) % var21], var26[var34 - 1][var39]);
                        var24.method693(var26[var34][(var39 + 1) % var21], (byte) 1, false, var37, var38, (short) -1, (byte) -1, var26[var34][var39], var26[var34 - 1][var39]);
                    }
                }
            }
            var20 = arg5.method954(var24, var15, class629.field9213, 64, 768);
            class325 var40 = class203.field3028;
            synchronized (class203.field3028) {
                class203.field3028.method2029(false, var20, var17);
            }
        }
        int var41 = (arg10 << 6) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg14 != 0) {
            if ((arg14 & 0x8) != 0) {
                var42 -= 128;
            }
            if ((arg14 & 0x1) != 0) {
                var45 = var41 + 128;
            }
            if ((arg14 & 0x2) != 0) {
                var43 -= 128;
            }
            if ((arg14 & 0x4) != 0) {
                var44 = var41 + 128;
            }
        }
        int var46 = arg6.method1982();
        int var47 = arg6.method1968();
        int var48 = arg6.method1981();
        if (var44 < var47) {
            var47 = var44;
        }
        if (var42 > var46) {
            var46 = var42;
        }
        int var49 = arg6.method1971();
        if (var43 > var48) {
            var48 = var43;
        }
        if (var49 > var45) {
            var49 = var45;
        }
        class433 var50 = null;
        if (arg9 != null) {
            int var51 = arg9.field3296[arg7];
            var50 = class470.field7205.method3500(var51 >> 16, -105);
            arg7 = var51 & 0xFFFF;
        }
        class520 var52;
        if (var50 == null) {
            var52 = var20.method369((byte) 3, var15, true);
            var52.method1974(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method1984(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method369((byte) 3, var15, true);
            var52.method1974(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method1984(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method3086(var50, arg7, (byte) 28);
        }
        if (arg0 != 0) {
            var52.method1966(arg0);
        }
        if (arg12 != 0) {
            var52.method1972(arg12);
        }
        if (arg1 != arg11) {
            var52.method1984(0, arg1, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
    public static void method1720(boolean arg0) {
        if (arg0) {
            field4010 = null;
            field4008 = null;
            field4009 = null;
            field4007 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BII)Z")
    public static final boolean method1721(byte arg0, int arg1, int arg2) {
        if (arg0 <= 58) {
            field4008 = null;
        }
        field4005++;
        return (arg1 & 0x800) != 0;
    }

    static {
        new class487("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field4010 = new class483(5000);
    }
}
