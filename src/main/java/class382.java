import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class382 {

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "Lss;")
    public static class213 field5862 = new class213("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "[Lo;")
    public static class139[] field5865;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lbd;Lbd;Z)V")
    public static final void method2468(class334 arg0, class334 arg1, boolean arg2) {
        field5863++;
        if (arg1.field5228 != null) {
            arg1.method2219(0);
        }
        if (!arg2) {
            arg1.field5228 = arg0;
            arg1.field5224 = arg0.field5224;
            arg1.field5228.field5224 = arg1;
            arg1.field5224.field5228 = arg1;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
    public static void method2469(int arg0) {
        field5865 = null;
        field5862 = null;
        if (arg0 != -16431) {
            field5865 = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIIIIIILe;IIIILhg;Lza;)Le;")
    public static final class536 method2470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class536 arg8, int arg9, int arg10, int arg11, int arg12, class363 arg13, class497 arg14) {
        field5864++;
        if (arg8 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg13 != null) {
            int var16 = var15 | arg13.method2391(-1, 256, arg9, false);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg6 << 48) + ((long) arg11 << 32) + (long) ((arg3 << 24) + (arg10 << 16) + arg4);
        class328 var19 = class473.field7252;
        class536 var20;
        synchronized (class473.field7252) {
            var20 = (class536) class473.field7252.method2191((byte) -73, var17);
        }
        if (var20 == null || arg14.method1299(var20.method308(), var15) != 0) {
            if (var20 != null) {
                var15 = arg14.method1294(var15, var20.method308());
            }
            byte var21;
            if (arg4 == 1) {
                var21 = 9;
            } else if (arg4 == 2) {
                var21 = 12;
            } else if (arg4 == 3) {
                var21 = 15;
            } else if (arg4 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class438 var24 = new class438(var21 * var22 + 1, var21 * 2 * var22 - var21, 0);
            int var25 = var24.method2776(0, 0, 102, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class147.field1988[var31] * var28 >> 15;
                    int var33 = class147.field1986[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method2776(var32, var33, -57, 0);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg3 * var35 + arg10 * var36 >> 8);
                short var38 = (short) (((arg6 & 0xFC00) * var35 + (arg11 & 0xFC00) * var36 & 0xFC0000) + ((arg6 & 0x380) * var35 + (arg11 & 0x380) * var36 & 0x38000) + ((arg6 & 0x7F) * var35 + (arg11 & 0x7F) * var36 & 0x7F00) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method2771((short) -1, (byte) -1, var26[0][(var39 + 1) % var21], var38, var25, (byte) 1, var26[0][var39], var37, (byte) 55);
                    } else {
                        var24.method2771((short) -1, (byte) -1, var26[var34 - 1][(var39 + 1) % var21], var38, var26[var34 - 1][var39], (byte) 1, var26[var34][(var39 + 1) % var21], var37, (byte) 36);
                        var24.method2771((short) -1, (byte) -1, var26[var34][(var39 + 1) % var21], var38, var26[var34 - 1][var39], (byte) 1, var26[var34][var39], var37, (byte) 118);
                    }
                }
            }
            var20 = arg14.method1337(var24, var15, class306.field4803, 64, 768);
            class328 var40 = class473.field7252;
            synchronized (class473.field7252) {
                class473.field7252.method2188(-128, var17, var20);
            }
        }
        int var41 = (arg4 << 6) - 1;
        int var42 = -var41;
        int var43 = -var41;
        if (arg12 <= 51) {
            field5862 = null;
        }
        int var44 = var41;
        int var45 = var41;
        if (arg7 != 0) {
            if ((arg7 & 0x4) != 0) {
                var44 = var41 + 128;
            }
            if ((arg7 & 0x2) != 0) {
                var43 -= 128;
            }
            if ((arg7 & 0x1) != 0) {
                var45 = var41 + 128;
            }
            if ((arg7 & 0x8) != 0) {
                var42 -= 128;
            }
        }
        int var46 = arg8.method279();
        int var47 = arg8.method270();
        int var48 = arg8.method314();
        int var49 = arg8.method310();
        if (var42 > var46) {
            var46 = var42;
        }
        if (var44 < var47) {
            var47 = var44;
        }
        if (var43 > var48) {
            var48 = var43;
        }
        if (var49 > var45) {
            var49 = var45;
        }
        class249 var50 = null;
        if (arg13 != null) {
            int var51 = arg13.field5623[arg9];
            var50 = class388.field5915.method1695(var51 >> 16, true);
            arg9 = var51 & 0xFFFF;
        }
        class536 var52;
        if (var50 == null) {
            var52 = var20.method329((byte) 3, var15, true);
            var52.method269(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method325(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method329((byte) 3, var15, true);
            var52.method269(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method325(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method3174(arg9, var50, true);
        }
        if (arg5 != 0) {
            var52.method278(arg5);
        }
        if (arg1 != 0) {
            var52.method319(arg1);
        }
        if (arg0 != 0) {
            var52.method325(0, arg0, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BLmn;Ll;)V")
    public static final void method2471(byte arg0, class162 arg1, class199 arg2) {
        class148.field1993 = arg2;
        class332.field5194 = arg1;
        field5861++;
        if (arg0 != 1) {
            field5862 = null;
        }
    }
}
