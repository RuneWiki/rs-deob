import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class412 extends class59 {

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public int field6191 = -1;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "[I")
    public static int[] field6188 = new int[13];

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Lki;")
    public static class498 field6190 = new class498(40, 3);

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field6198 = 0;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "S")
    public static short field6197 = 1;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field6196 = 0;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public int field6189;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "Ljava/lang/String;")
    public String field6192;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "Ljava/lang/String;")
    public String field6193;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
    public static void method2479(int arg0) {
        if (arg0 <= 116) {
            method2481((class329) null, (class162) null, 85, -34, (class121) null, true, -17, (byte) 13, -44, 66, -88, -10, 23, 108, -89);
        }
        field6188 = null;
        field6190 = null;
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)Lcu;")
    public final class145 method2480(int arg0) {
        if (arg0 != 23093) {
            return null;
        } else {
            ++field6194;
            return class178.field2630[super.field882];
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lnm;Lqa;IILc;ZIBIIIIIII)Lc;")
    public static final class121 method2481(class329 arg0, class162 arg1, int arg2, int arg3, class121 arg4, boolean arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        ++field6195;
        if (arg4 == null) {
            return null;
        } else {
            int var15 = 2055;
            if (arg0 != null) {
                int var16 = var15 | arg0.method2019(arg9, -1, false, arg7 + -65511);
                var15 = var16 & -513;
            }
            long var17 = ((long) arg11 << 48) + ((long) arg6 << 32) + (long) ((arg12 << 16) + (arg14 << 24) + arg3);
            class226 var19 = class263.field3855;
            class121 var20;
            synchronized (class263.field3855) {
                var20 = (class121) class263.field3855.method1536(var17, 0);
            }
            if (var20 == null || arg1.method1122(var20.method738(), var15) != 0) {
                if (var20 != null) {
                    var15 = arg1.method1051(var15, var20.method738());
                }
                byte var21;
                if (arg3 != 1) {
                    if (~arg3 != -3) {
                        if (~arg3 != -4) {
                            if (~arg3 != -5) {
                                var21 = 21;
                            } else {
                                var21 = 18;
                            }
                        } else {
                            var21 = 15;
                        }
                    } else {
                        var21 = 12;
                    }
                } else {
                    var21 = 9;
                }
                byte var22 = 3;
                int[] var23 = new int[] { 64, 96, 128 };
                class521 var24 = new class521(var21 * var22 + 1, var21 * var22 * 2 + -var21, 0);
                int var25 = var24.method3090(0, 0, 0, arg7 ^ 24);
                int[][] var26 = new int[var22][var21];
                for (int var27 = 0; ~var22 < ~var27; ++var27) {
                    int var28 = var23[var27];
                    int var29 = var23[var27];
                    for (int var30 = 0; var30 < var21; ++var30) {
                        int var31 = (var30 << 14) / var21;
                        int var32 = class457.field6760[var31] * var28 >> 15;
                        int var33 = class457.field6759[var31] * var29 >> 15;
                        var26[var27][var30] = var24.method3090(var33, 0, var32, -1);
                    }
                }
                for (int var34 = 0; ~var34 > ~var22; ++var34) {
                    int var35 = (var34 * 256 + 128) / var22;
                    int var36 = -var35 + 256;
                    byte var37 = (byte) (arg12 * var36 + arg14 * var35 >> 8);
                    short var38 = (short) ((32512 & (arg6 & 127) * var36 + (127 & arg11) * var35) + (229376 & (896 & arg6) * var36 + (896 & arg11) * var35) + (16515072 & (64512 & arg6) * var36 + (64512 & arg11) * var35) >> 8);
                    for (int var39 = 0; var21 > var39; ++var39) {
                        if (var34 != 0) {
                            var24.method3078(var37, var26[var34][(var39 - -1) % var21], (short) -1, (byte) -1, var26[var34 + -1][var39], var26[var34 + -1][(var39 - -1) % var21], (byte) 1, arg7 ^ 231, var38);
                            var24.method3078(var37, var26[var34][var39], (short) -1, (byte) -1, var26[var34 + -1][var39], var26[var34][(var39 + 1) % var21], (byte) 1, -256, var38);
                        } else {
                            var24.method3078(var37, var26[0][var39], (short) -1, (byte) -1, var25, var26[0][(var39 - -1) % var21], (byte) 1, -256, var38);
                        }
                    }
                }
                var20 = arg1.method1118(var24, var15, class455.field6739, 64, 768);
                class226 var40 = class263.field3855;
                synchronized (class263.field3855) {
                    class263.field3855.method1542(var20, (byte) 112, var17);
                }
            }
            int var41 = (arg3 << 6) + -1;
            if (arg7 != -25) {
                method2479(70);
            }
            int var42 = -var41;
            int var43 = -var41;
            int var44 = var41;
            int var45 = var41;
            if (arg5) {
                if (arg8 > 1024 && ~arg8 > -7169) {
                    var42 -= 128;
                }
                if (~arg8 < -5121 && ~arg8 > -11265) {
                    var45 = var41 + 128;
                }
                if (arg8 > 13312 || arg8 < 3072) {
                    var43 -= 128;
                }
                if (arg8 > 9216 && ~arg8 > -15361) {
                    var44 = var41 + 128;
                }
            }
            int var46 = arg4.method746();
            int var47 = arg4.method698();
            int var48 = arg4.method717();
            if (~var42 < ~var46) {
                var46 = var42;
            }
            if (var47 > var44) {
                var47 = var44;
            }
            if (~var43 < ~var48) {
                var48 = var43;
            }
            int var49 = arg4.method694();
            if (var49 > var45) {
                var49 = var45;
            }
            class528 var50 = null;
            if (arg0 != null) {
                int var51 = arg0.field4670[arg9];
                var50 = class84.field1295.method1184(108, var51 >> 16);
                arg9 = var51 & 65535;
            }
            class121 var52;
            if (var50 == null) {
                var52 = var20.method723((byte) 3, var15, true);
                var52.method705(-var46 + var47 >> 1, 128, -var48 + var49 >> 1);
                var52.method739(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            } else {
                var52 = var20.method723((byte) 3, var15, true);
                var52.method705(-var46 + var47 >> 1, 128, var49 - var48 >> 1);
                var52.method739(var46 - -var47 >> 1, 0, var48 + var49 >> 1);
                var52.method791(arg9, arg7 + 129, var50);
            }
            if (~arg13 != -1) {
                var52.method735(arg13);
            }
            if (arg10 != 0) {
                var52.method700(arg10);
            }
            if (~arg2 != -1) {
                var52.method739(0, arg2, 0);
            }
            return var52;
        }
    }
}
