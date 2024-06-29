import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class200 extends class119 {

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    private int field2888;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    private int field2886;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    private int field2891;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    private int field2887;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "Z")
    public static boolean field2884 = false;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public static int field2894 = 0;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field2883 = 0;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "Luk;")
    public static class78 field2890;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V")
    public final void method310(int arg0, int arg1, int arg2) {
        if (arg2 == -11777) {
            ++field2897;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIIILfc;ZLpa;IBII)Lpa;")
    public static final class2 method1297(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class196 arg7, boolean arg8, class2 arg9, int arg10, byte arg11, int arg12, int arg13) {
        ++field2889;
        long var14 = ((long) arg1 << 32) + (long) (arg10 - (-(arg5 << 16) - (arg4 << 24))) - -((long) arg13 << 48);
        if (arg11 != 47) {
            return null;
        } else {
            class2 var16 = (class2) class228.field3418.method263((byte) 123, var14);
            if (var16 == null) {
                byte var17;
                if (arg10 != 1) {
                    if (arg10 != 2) {
                        if (~arg10 != -4) {
                            if (~arg10 == -5) {
                                var17 = 18;
                            } else {
                                var17 = 21;
                            }
                        } else {
                            var17 = 15;
                        }
                    } else {
                        var17 = 12;
                    }
                } else {
                    var17 = 9;
                }
                byte var18 = 3;
                int[] var19 = new int[] { 64, 96, 128 };
                class127 var20 = new class127(var17 * var18 + 1, var18 * 2 * var17 - var17, 0);
                int var21 = var20.method875(0, 0, 0);
                int[][] var22 = new int[var18][var17];
                for (int var23 = 0; var23 < var18; ++var23) {
                    int var30 = var19[var23];
                    int var31 = var19[var23];
                    for (int var32 = 0; var32 < var17; ++var32) {
                        int var33 = (var32 << 11) / var17;
                        int var34 = arg3 - -(class18.field261[var33] * var30) >> 16;
                        int var35 = class18.field259[var33] * var31 + arg2 >> 16;
                        var22[var23][var32] = var20.method875(var34, 0, var35);
                    }
                }
                for (int var24 = 0; var18 > var24; ++var24) {
                    int var25 = (var24 * 256 + 128) / var18;
                    int var26 = 256 - var25;
                    byte var27 = (byte) (arg4 * var25 + arg5 * var26 >> 8);
                    short var28 = (short) (((896 & arg1) * var26 + (896 & arg13) * var25 & 229376) + ((arg1 & 64512) * var26 + (arg13 & 64512) * var25 & 16515072) + ((127 & arg1) * var26 + (127 & arg13) * var25 & 32512) >> 8);
                    for (int var29 = 0; var29 < var17; ++var29) {
                        if (~var24 == -1) {
                            var20.method880(var21, var22[0][(var29 + 1) % var17], var22[0][var29], (byte) 1, var28, var27);
                        } else {
                            var20.method880(var22[var24 + -1][var29], var22[var24 - 1][(var29 + 1) % var17], var22[var24][(var29 + 1) % var17], (byte) 1, var28, var27);
                            var20.method880(var22[var24 + -1][var29], var22[var24][(var29 + 1) % var17], var22[var24][var29], (byte) 1, var28, var27);
                        }
                    }
                }
                var16 = var20.method863(64, 768, -50, -10, -50);
                class228.field3418.method255(var14, var16, (byte) -128);
            }
            int var36 = arg10 * 64 - 1;
            int var37 = -var36;
            int var38 = -var36;
            int var39 = var36;
            int var40 = var36;
            if (arg8) {
                if (~arg0 < -641 && ~arg0 > -1409) {
                    var40 = var36 + 128;
                }
                if (~arg0 < -1665 || arg0 < 384) {
                    var38 -= 128;
                }
                if (arg0 > 1152 && arg0 < 1920) {
                    var39 = var36 + 128;
                }
                if (~arg0 < -129 && ~arg0 > -897) {
                    var37 -= 128;
                }
            }
            int var41 = arg9.method28();
            int var42 = arg9.method16();
            class246 var43 = null;
            if (var37 > var41) {
                var41 = var37;
            }
            if (~var39 > ~var42) {
                var42 = var39;
            }
            int var44 = arg9.method13();
            int var45 = arg9.method38();
            if (~var40 > ~var45) {
                var45 = var40;
            }
            if (var44 < var38) {
                var44 = var38;
            }
            if (arg7 != null) {
                int var46 = arg7.field2818[arg6];
                var43 = class172.method1134(false, var46 >> 16);
                arg6 = var46 & 65535;
            }
            class2 var47;
            if (var43 == null) {
                var47 = var16.method15(true, true, true);
                var47.method37((-var41 + var42) / 2, 128, (-var44 + var45) / 2);
                var47.method22((var41 - -var42) / 2, 0, (var44 + var45) / 2);
            } else {
                var47 = var16.method15(!var43.method1609((byte) 120, arg6), !var43.method1611(arg11 + -43, arg6), true);
                var47.method37((var42 - var41) / 2, 128, (-var44 + var45) / 2);
                var47.method22((var41 - -var42) / 2, 0, (var44 + var45) / 2);
                var47.method31(var43, arg6);
            }
            if (arg0 != 0) {
                var47.method19(arg0);
            }
            class215 var48 = (class215) var47;
            if (arg12 != class81.method542(arg3 + var41, -1, class163.field2364, arg2 + var44) || arg12 != class81.method542(arg3 + var42, -1, class163.field2364, arg2 + var45)) {
                for (int var49 = 0; var48.field3111 > var49; ++var49) {
                    var48.field3128[var49] += class81.method542(var48.field3097[var49] + arg3, arg11 + -48, class163.field2364, var48.field3093[var49] + arg2) + -arg12;
                }
                var48.field3105 = false;
            }
            return var47;
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(IIIIII)V")
    public class200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2888 = arg3;
        this.field2886 = arg1;
        this.field2891 = arg2;
        this.field2887 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public static void method1298(byte arg0) {
        field2890 = null;
        int var1 = -57 / ((arg0 - -33) / 57);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZIIII)V")
    public static final void method1299(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        class270 var5 = class190.method1213(25702, arg3, 4);
        ++field2895;
        var5.method1808((byte) 62);
        var5.field4226 = arg1;
        if (!arg0) {
            method1297(83, -118, -25, 60, -31, -60, 19, (class196) null, true, (class2) null, 114, (byte) 28, -15, -7);
        }
        var5.field4230 = arg2;
        var5.field4233 = arg4;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(III)V")
    public final void method313(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            ++field2885;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBI)V")
    public final void method311(int arg0, byte arg1, int arg2) {
        int var4 = this.field2891 * arg0 >> 12;
        int var5 = this.field2887 * arg0 >> 12;
        ++field2892;
        int var6 = this.field2886 * arg2 >> 12;
        if (arg1 != 122) {
            method1298((byte) 4);
        }
        int var7 = this.field2888 * arg2 >> 12;
        class129.method893(var5, var4, var6, var7, (byte) -107, super.field1749);
    }
}
