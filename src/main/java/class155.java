import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class155 extends class23 {

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "I")
    public static int field2915 = 2;

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "Ldc;")
    public static class37 field2918 = class185.method1233((byte) 86, "Mem:");

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "Ldc;")
    public static class37 field2920 = class185.method1233((byte) 86, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1051(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2925;
        int var9 = arg7 - arg1;
        int var10 = (-arg0 + arg8 << 16) / var9;
        if (~arg7 > ~class190.field3528) {
            ++var9;
        }
        int var11 = -arg4 + arg5;
        int var12 = (-arg6 + arg2 << 16) / var11;
        if (arg5 < class150.field2848) {
            ++var11;
        }
        for (int var13 = 0; var13 < var11; ++var13) {
            int var30 = var12 * var13 >> 16;
            int var31 = (var13 + 1) * var12 >> 16;
            int var32 = -var30 + var31;
            if (~var32 < -1) {
                int var33 = arg4 + var13 >> 6;
                int var34 = arg6 + var31;
                int var35 = arg6 + var30;
                byte[][] var36 = class120.field2153[var33];
                byte[][] var37 = class30.field558[var33];
                byte[][] var38 = class228.field4193[var33];
                int[][] var39 = class235.field4283[var33];
                byte[][] var40 = class107.field1872[var33];
                byte[][] var41 = class184.field3394[var33];
                for (int var42 = 0; var42 < var9; ++var42) {
                    int var43 = var10 * var42 >> 16;
                    int var44 = (var42 + 1) * var10 >> 16;
                    int var45 = -var43 + var44;
                    if (~var45 < -1) {
                        int var46 = arg0 + var44;
                        int var47 = arg0 + var43;
                        int var48 = 63 & arg1 + var42;
                        int var49 = arg4 + var13 & 63;
                        int var50 = var42 - -arg1 >> 6;
                        int var51 = (var48 << 6) - -var49;
                        int var52;
                        if (var39[var50] != null) {
                            var52 = var39[var50][var51];
                        } else {
                            int var53 = var13 - -arg4 & 4;
                            int var54 = var42 - -arg1 & 4;
                            if ((~var53 <= -3 || var54 <= 2) && (~var53 >= -3 || ~var54 <= -3)) {
                                var52 = class38.field792[class39.field812 + 1];
                            } else {
                                var52 = 4936552;
                            }
                        }
                        int var55 = var36[var50] != null ? class38.field792[255 & var36[var50][var51]] : 0;
                        int var56 = var38[var50] == null ? 0 : class38.field792[var38[var50][var51] & 255];
                        if (var55 == 0 && ~var56 == -1) {
                            class48.method420(var35, var47, var32, var45, var52);
                        } else {
                            if (~var55 != -1) {
                                if (~var55 == 0) {
                                    var55 = 1;
                                }
                                byte var57 = var37[var50] == null ? 0 : var37[var50][var51];
                                int var58 = var57 & 252;
                                if (var58 != 0 && var32 > 1 && var45 > 1) {
                                    class200.method1320(3 & var57, var47, 124, var35, var55, var45, var52, class48.field955, var58 >> 2, var32, true);
                                } else {
                                    class48.method420(var35, var47, var32, var45, var55);
                                }
                            }
                            if (var56 != 0) {
                                byte var59 = var40[var50][var51];
                                if (var56 == -1) {
                                    var56 = var52;
                                }
                                int var60 = 252 & var59;
                                if (var60 == 0 || ~var32 >= -2 || ~var45 >= -2) {
                                    class48.method420(var35, var47, var32, var45, var56);
                                }
                                class200.method1320(var59 & 3, var47, arg3 ^ 99, var35, var56, var45, 0, class48.field955, var60 >> 2, var32, ~var55 == -1);
                            }
                        }
                        if (var41[var50] != null) {
                            int var61 = var41[var50][var51] & 255;
                            if (~var61 != -1) {
                                int var62;
                                if (~var45 == -2) {
                                    var62 = var47;
                                } else {
                                    var62 = var46 - 1;
                                }
                                int var63 = 13421772;
                                if (var61 >= 5 && ~var61 >= -9 || var61 >= 13 && ~var61 >= -17 || ~var61 <= -22 && var61 <= 24 || var61 == 27 || ~var61 == -29) {
                                    var63 = 13369344;
                                    var61 -= 4;
                                }
                                int var64;
                                if (~var32 == -2) {
                                    var64 = var35;
                                } else {
                                    var64 = var34 + -1;
                                }
                                if (var61 == 1) {
                                    class48.method409(var35, var47, var45, var63);
                                } else if (~var61 == -3) {
                                    class48.method405(var35, var47, var32, var63);
                                } else if (var61 != 3) {
                                    if (var61 != 4) {
                                        if (var61 == 9) {
                                            class48.method409(var35, var47, var45, 16777215);
                                            class48.method405(var35, var47, var32, var63);
                                        } else if (var61 == 10) {
                                            class48.method409(var64, var47, var45, 16777215);
                                            class48.method405(var35, var47, var32, var63);
                                        } else if (var61 != 11) {
                                            if (~var61 == -13) {
                                                class48.method409(var35, var47, var45, 16777215);
                                                class48.method405(var35, var62, var32, var63);
                                            } else if (~var61 != -18) {
                                                if (~var61 != -19) {
                                                    if (var61 == 19) {
                                                        class48.method405(var64, var62, 1, var63);
                                                    } else if (~var61 == -21) {
                                                        class48.method405(var35, var62, 1, var63);
                                                    } else if (~var61 != -26) {
                                                        if (~var61 == -27) {
                                                            for (int var65 = 0; var65 < var45; ++var65) {
                                                                class48.method405(var35 - -var65, var47 + var65, 1, var63);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var66 = 0; ~var45 < ~var66; ++var66) {
                                                            class48.method405(var35 + var66, var62 - var66, 1, var63);
                                                        }
                                                    }
                                                } else {
                                                    class48.method405(var64, var47, 1, var63);
                                                }
                                            } else {
                                                class48.method405(var35, var47, 1, var63);
                                            }
                                        } else {
                                            class48.method409(var64, var47, var45, 16777215);
                                            class48.method405(var35, var62, var32, var63);
                                        }
                                    } else {
                                        class48.method405(var35, var62, var32, var63);
                                    }
                                } else {
                                    class48.method409(var64, var47, var45, var63);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg3 != 1) {
            method1054((Component) null, false, -89, 66);
        }
        for (int var14 = 0; ~var14 > ~var11; ++var14) {
            int var15 = (var14 - -1) * var12 >> 16;
            int var16 = var12 * var14 >> 16;
            int var17 = -var16 + var15;
            if (var17 > 0) {
                int var18 = arg6 + var16;
                byte[][] var19 = class72.field1286[arg4 + var14 >> 6];
                int var10000 = arg6 + var15;
                for (int var21 = 0; var21 < var9; ++var21) {
                    int var22 = var10 * var21 >> 16;
                    int var23 = (var21 - -1) * var10 >> 16;
                    int var24 = var23 - var22;
                    if (~var24 < -1) {
                        int var25 = arg1 + var21 >> 6;
                        int var26 = arg0 + var22;
                        int var27 = ((63 & arg1 + var21) << 6) + (arg4 + var14 & 63);
                        var10000 = arg0 + var23;
                        if (var19[var25] != null) {
                            int var29 = var19[var25][var27] & 255;
                            if (var29 != 0) {
                                if (~var29 != -48 && ~var29 != -54) {
                                    class217.field4042[var29 + -1].method1021(-(var17 / 2) + var18, -(var24 / 2) + var26, var17 * 2, var24 * 2);
                                } else {
                                    class217.field4042[var29 + -1].method1021(var18, var26, var17 * 2 - -1, var24 * 2 + 1);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        ++field2921;
        int[] var3 = super.field405.method1461(arg1, (byte) -109);
        if (arg0 != 0) {
            method1053((class238) null, true, 100);
        }
        if (super.field405.field4114) {
            int[] var4 = this.method162(arg1, 0, (byte) 18);
            int[] var5 = this.method162(arg1, 1, (byte) 18);
            int[] var6 = this.method162(arg1, 2, (byte) 18);
            for (int var7 = 0; ~class199.field3705 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V")
    public static final void method1052(int arg0) {
        if (arg0 <= -109) {
            class29.field537.method93(0);
            ++field2919;
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class155() {
        super(3, false);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method36(int arg0, byte arg1) {
        int[][] var3 = super.field398.method1522(-29659, arg0);
        if (super.field398.field4303) {
            int[] var4 = this.method162(arg0, 2, (byte) 18);
            int[][] var5 = this.method159(0, (byte) -60, arg0);
            int[][] var6 = this.method159(1, (byte) -121, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var6[0];
            int[] var13 = var5[2];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class199.field3705 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var13[var16];
                } else if (~var17 == -1) {
                    var7[var16] = var12[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 - -(var12[var16] * var18) >> 12;
                    var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                    var9[var16] = var13[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        ++field2922;
        if (arg1 != 9) {
            method1052(-28);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lwa;ZI)[Lng;")
    public static final class148[] method1053(class238 arg0, boolean arg1, int arg2) {
        if (arg1) {
            return null;
        } else {
            ++field2917;
            return !class128.method906(arg0, arg2, 3) ? null : class23.method164(111);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/Component;ZII)Lpj;")
    public static final class173 method1054(Component arg0, boolean arg1, int arg2, int arg3) {
        ++field2923;
        try {
            Class var4 = Class.forName("ea");
            class173 var5 = (class173) var4.newInstance();
            var5.method392(arg0, arg3, arg2, 0);
            if (arg1) {
                method1054((Component) null, true, -113, -46);
            }
            return var5;
        } catch (Throwable var7) {
            class170 var6 = new class170();
            var6.method392(arg0, arg3, arg2, 0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            super.field407 = arg0.method215(-1797813752) == 1;
        }
        ++field2916;
        if (arg2 != 1000) {
            field2915 = 6;
        }
    }

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "(I)V")
    public static void method1055(int arg0) {
        field2918 = null;
        if (arg0 != 5864) {
            field2918 = null;
        }
        field2920 = null;
    }
}
