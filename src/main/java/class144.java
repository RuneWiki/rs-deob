import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class144 {

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field2267 = 0;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field2269 = 0;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "Le;")
    public static class312 field2271;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public static void method1045(byte arg0) {
        int var1 = -21 / ((25 - arg0) / 46);
        field2271 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLmo;Lmo;)V")
    public static final void method1046(byte arg0, class447 arg1, class447 arg2) {
        int var3 = 88 % ((arg0 + 77) / 45);
        class217.field3546 = arg2;
        field2268++;
        class205.field3300 = arg1;
        class303.field4796 = class205.field3300.method2758(3, 14535);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lid;ILe;IIIILgn;IZIIIIB)Lid;")
    public static final class348 method1047(class348 arg0, int arg1, class312 arg2, int arg3, int arg4, int arg5, int arg6, class417 arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, byte arg14) {
        field2272++;
        if (arg0 == null) {
            return null;
        }
        int var15 = 1031;
        if (arg7 != null) {
            int var16 = var15 | arg7.method2606(false, 96, -1, arg12);
            var15 = var16 & 0xFFFFFDFF;
        }
        if (arg14 != 1) {
            method1046((byte) -24, (class447) null, (class447) null);
        }
        long var17 = ((long) arg11 << 48) + ((long) arg10 << 32) + (long) ((arg6 << 24) + (arg8 << 16) + arg1);
        class52 var19 = class410.field6080;
        class348 var20;
        synchronized (class410.field6080) {
            var20 = (class348) class410.field6080.method331((byte) 69, var17);
        }
        if (var20 == null || arg2.method579(var20.method44(), var15) != 0) {
            if (var20 != null) {
                var15 = arg2.method720(var15, var20.method44());
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
            class86 var24 = new class86(var21 * var22 + 1, var21 * 2 * var22 - var21, 0);
            int var25 = var24.method522(0, 0, 0, (byte) -28);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class258.field4177[var31] * var28 >> 15;
                    int var33 = class258.field4173[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method522(var33, 0, var32, (byte) -28);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg6 * var35 + arg8 * var36 >> 8);
                short var38 = (short) (((arg10 & 0x380) * var36 + (arg11 & 0x380) * var35 & 0x38000) + ((arg10 & 0x7F) * var36 + (arg11 & 0x7F) * var35 & 0x7F00) + ((arg10 & 0xFC00) * var36 + (arg11 & 0xFC00) * var35 & 0xFC0000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method532(var25, (short) -1, 15499, var38, var26[0][(var39 + 1) % var21], (byte) 1, var26[0][var39], (byte) -1, var37);
                    } else {
                        var24.method532(var26[var34 - 1][var39], (short) -1, 15499, var38, var26[var34 - 1][(var39 + 1) % var21], (byte) 1, var26[var34][(var39 + 1) % var21], (byte) -1, var37);
                        var24.method532(var26[var34 - 1][var39], (short) -1, 15499, var38, var26[var34][(var39 + 1) % var21], (byte) 1, var26[var34][var39], (byte) -1, var37);
                    }
                }
            }
            var20 = arg2.method639(var24, var15, class397.field5939, 64, 768);
            class52 var40 = class410.field6080;
            synchronized (class410.field6080) {
                class410.field6080.method341(95, var17, var20);
            }
        }
        int var41 = arg1 * 64 - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg9) {
            if (arg13 > 1024 && arg13 < 7168) {
                var42 -= 128;
            }
            if (arg13 > 13312 || arg13 < 3072) {
                var43 -= 128;
            }
            if (arg13 > 5120 && arg13 < 11264) {
                var45 = var41 + 128;
            }
            if (arg13 > 9216 && arg13 < 15360) {
                var44 = var41 + 128;
            }
        }
        int var46 = arg0.method56();
        int var47 = arg0.method54();
        int var48 = arg0.method21();
        int var49 = arg0.method13();
        if (var43 > var48) {
            var48 = var43;
        }
        if (var46 < var42) {
            var46 = var42;
        }
        if (var44 < var47) {
            var47 = var44;
        }
        if (var45 < var49) {
            var49 = var45;
        }
        class209 var50 = null;
        if (arg7 != null) {
            int var51 = arg7.field6177[arg12];
            var50 = class452.method2825(var51 >> 16, -30741);
            arg12 = var51 & 0xFFFF;
        }
        class348 var52;
        if (var50 == null) {
            var52 = var20.method15((byte) 3, var15, true);
            var52.method12((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method51((var46 + var47) / 2, 0, (var48 + var49) / 2);
        } else {
            var52 = var20.method15((byte) 3, var15, true);
            var52.method12((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method51((var46 + var47) / 2, 0, (var48 + var49) / 2);
            var52.method2267(-105, var50, arg12);
        }
        if (arg5 != 0) {
            var52.method42(arg5);
        }
        if (arg3 != 0) {
            var52.method18(arg3);
        }
        if (arg4 != 0) {
            var52.method51(0, arg4, 0);
        }
        return var52;
    }
}
