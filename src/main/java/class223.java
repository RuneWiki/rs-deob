import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class223 extends class155 {

    @OriginalMember(owner = "client!cca", name = "M", descriptor = "[I")
    public static int[] field3218 = new int[1];

    @OriginalMember(owner = "client!cca", name = "I", descriptor = "Lfc;")
    public static class235 field3214 = new class235(68, 12);

    @OriginalMember(owner = "client!cca", name = "J", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!cca", name = "K", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!cca", name = "L", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!cca", name = "N", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!cca", name = "O", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!cca", name = "P", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!cca", name = "Q", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lfv;IIII[[I[[II)V", line = 6)
    public class223(class107 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "([III[[ZLjf;ZIII[III)V", line = 9)
    private final void method1426(int[] arg0, int arg1, int arg2, boolean[][] arg3, class197 arg4, boolean arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10, int arg11) {
        ++field3220;
        int var13 = (-arg7 + arg1) * arg11 / 256;
        arg4.field2914 = arg5;
        arg4.field2921 = false;
        int var14 = arg11 >> 8;
        int var15 = arg6;
        int var16 = arg8 + var13;
        for (int var17 = arg2; ~arg10 < ~var17; ++var17) {
            for (int var18 = arg7; ~var18 > ~arg1; ++var18) {
                if (arg3[-arg2 + var17][-arg7 + var18]) {
                    if (super.field2336[var17][var18] != null) {
                        class567 var19 = super.field2336[var17][var18];
                        if (~var19.field7633 != 0 && (2 & var19.field7643) == 0 && var19.field7635 == 0) {
                            int var20 = super.field2350.method811(var19.field7633);
                            arg4.method1329(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var15 - -var14, class643.method3580(var19.field7638, var20, 0), class643.method3580(var19.field7636, var20, 0), class643.method3580(var19.field7641, var20, 0));
                            arg4.method1329(var16, var16, -var14 + var16, var15, var14 + var15, var15, class643.method3580(var19.field7637, var20, 0), class643.method3580(var19.field7641, var20, 0), class643.method3580(var19.field7636, var20, 0));
                        } else if (~var19.field7635 != -1) {
                            int var21 = var19.field7635;
                            arg4.method1336(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, class683.method3766(-16777216 & var19.field7638, var21, (byte) -102), class683.method3766(var19.field7636 & -16777216, var21, (byte) -112), class683.method3766(var19.field7641 & -16777216, var21, (byte) -115));
                            arg4.method1336(var16, var16, -var14 + var16, var15, var15 - -var14, var15, class683.method3766(var19.field7637 & -16777216, var21, (byte) -112), class683.method3766(-16777216 & var19.field7641, var21, (byte) -110), class683.method3766(var19.field7636 & -16777216, var21, (byte) -118));
                        } else {
                            arg4.method1336(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, var19.field7638, var19.field7636, var19.field7641);
                            arg4.method1336(var16, var16, -var14 + var16, var15, var14 + var15, var15, var19.field7637, var19.field7641, var19.field7636);
                        }
                    } else if (super.field2337[var17][var18] != null) {
                        class593 var22 = super.field2337[var17][var18];
                        for (int var23 = 0; var23 < var22.field8250; ++var23) {
                            arg0[var23] = var22.field8252[var23] * var14 / super.field1919 + var15;
                            arg9[var23] = -(var22.field8256[var23] * var14 / super.field1919) + var16;
                        }
                        for (int var24 = 0; ~var22.field8254 < ~var24; ++var24) {
                            int var25 = var24 * 3;
                            int var26 = var25 + 1;
                            int var27 = var26 - -1;
                            int var28 = arg0[var25];
                            int var29 = arg0[var26];
                            int var30 = arg0[var27];
                            int var31 = arg9[var25];
                            int var32 = arg9[var26];
                            int var33 = arg9[var27];
                            if (var22.field8251 != null && var22.field8251[var24] != 0 && (var22.field8255 == null || var22.field8255 != null && ~var22.field8255[var24] == 0)) {
                                int var34 = var22.field8251[var24];
                                arg4.method1336(var31, var32, var33, var28, var29, var30, class683.method3766(-(-16777216 & var22.field8258[var25]) + -16777216, var34, (byte) -120), class683.method3766(-16777216 - (-16777216 & var22.field8258[var26]), var34, (byte) -101), class683.method3766(-(var22.field8258[var27] & -16777216) + -16777216, var34, (byte) -126));
                            } else if (var22.field8255 != null && var22.field8255[var24] != -1) {
                                int var35 = super.field2350.method811(var22.field8255[var24]);
                                arg4.method1329(var31, var32, var33, var28, var29, var30, var35, var35, var35);
                            } else {
                                arg4.method1336(var31, var32, var33, var28, var29, var30, var22.field8258[var25], var22.field8258[var26], var22.field8258[var27]);
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var16 = arg8 - -var13;
            var15 += var14;
        }
        arg4.field2914 = true;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "()V", line = 145)
    public static final void method1427() {
        if (class368.field5264 != null) {
            for (int var0 = 0; var0 < class368.field5264.length; ++var0) {
                for (int var1 = 0; var1 < class137.field1931; ++var1) {
                    for (int var2 = 0; var2 < class22.field308; ++var2) {
                        if (class368.field5264[var0][var1][var2] != null) {
                            class368.field5264[var0][var1][var2].method2739((byte) 91);
                        }
                        class368.field5264[var0][var1][var2] = null;
                    }
                }
            }
        }
        class368.field5264 = null;
        class31.field369 = null;
        if (class690.field9701 != null) {
            for (int var3 = 0; var3 < class690.field9701.length; ++var3) {
                for (int var4 = 0; var4 < class137.field1931; ++var4) {
                    for (int var5 = 0; var5 < class22.field308; ++var5) {
                        if (class690.field9701[var3][var4][var5] != null) {
                            class690.field9701[var3][var4][var5].method2739((byte) 91);
                        }
                        class690.field9701[var3][var4][var5] = null;
                    }
                }
            }
        }
        class690.field9701 = null;
        class581.field8114 = null;
        class658.field9266 = null;
        class144.field2149 = null;
        class160.field2390 = 0;
        if (class398.field5527 != null) {
            for (int var6 = 0; var6 < class160.field2390; ++var6) {
                class398.field5527[var6] = null;
            }
        }
        if (class376.field5329 != null) {
            for (int var7 = 0; var7 < class589.field8211; ++var7) {
                class376.field5329[var7] = null;
            }
            class589.field8211 = 0;
        }
        if (class324.field4793 != null) {
            for (int var8 = 0; var8 < class68.field935; ++var8) {
                class324.field4793[var8] = null;
            }
            for (int var9 = 0; var9 < class552.field7467; ++var9) {
                for (int var10 = 0; var10 < class137.field1931; ++var10) {
                    for (int var11 = 0; var11 < class22.field308; ++var11) {
                        class185.field2716[var9][var10][var11] = 0L;
                    }
                }
            }
            class68.field935 = 0;
        }
        class397.field5523 = null;
        class174.method1195(0);
        class91.field1210.method3683(14962);
        class198.field2927 = null;
        class326.field4815 = null;
        class144.field2144 = null;
        class220.field3196 = null;
        class161.field2478 = null;
        class449.field6276 = null;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IILjf;[I[IZ[I)V", line = 288)
    private final void method1428(int arg0, int arg1, class197 arg2, int[] arg3, int[] arg4, boolean arg5, int[] arg6) {
        if (arg5) {
            ++field3215;
            class596 var8 = super.field2338[arg0][arg1];
            if (var8 != null) {
                if ((2 & var8.field8280) == 0) {
                    int var9 = super.field1919 * arg0;
                    int var10 = super.field1919 + var9;
                    int var11 = super.field1919 * arg1;
                    int var12 = super.field1919 + var11;
                    int var17;
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    int var26;
                    int var27;
                    int var28;
                    int var31;
                    int var32;
                    int var33;
                    int var34;
                    int var35;
                    int var36;
                    if ((var8.field8280 & 1) == 0) {
                        int var13 = super.field2352[arg0][arg1];
                        int var14 = super.field2352[arg0 + 1][arg1];
                        int var15 = super.field2352[arg0 + 1][arg1 - -1];
                        int var16 = super.field2352[arg0][arg1 + 1];
                        int var18;
                        if (super.field2353 != -1) {
                            var17 = super.field2353;
                            var18 = super.field2353;
                            var19 = super.field2353;
                            var20 = super.field2353;
                        } else {
                            var20 = (super.field2343 * var11 + super.field2348 * var9 + super.field2341 * var13 >> 14) + super.field2340;
                            if (super.field2350.field1452 >= var20) {
                                return;
                            }
                            var19 = (super.field2343 * var11 + super.field2348 * var10 + super.field2341 * var14 >> 14) + super.field2340;
                            if (~var19 >= ~super.field2350.field1452) {
                                return;
                            }
                            var18 = (super.field2341 * var15 + (super.field2348 * var10 - -(super.field2343 * var12)) >> 14) + super.field2340;
                            if (~super.field2350.field1452 <= ~var18) {
                                return;
                            }
                            var17 = (super.field2348 * var9 + super.field2343 * var12 - -(super.field2341 * var16) >> 14) + super.field2340;
                            if (~var17 >= ~super.field2350.field1452) {
                                return;
                            }
                        }
                        var21 = super.field2339 - -(super.field2347 * var11 + (super.field2346 * var9 - -(super.field2344 * var13)) >> 14);
                        var22 = arg2.field2911 - -(super.field2350.field1466 * var21 / var20);
                        var23 = (super.field2349 * var9 - (-(super.field2334 * var11) + -(super.field2333 * var13)) >> 14) + super.field2335;
                        var24 = super.field2350.field1461 * var23 / var20 + arg2.field2917;
                        var25 = (super.field2344 * var14 + super.field2347 * var11 + super.field2346 * var10 >> 14) + super.field2339;
                        var26 = (super.field2334 * var11 + super.field2349 * var10 + super.field2333 * var14 >> 14) + super.field2335;
                        var27 = super.field2350.field1466 * var25 / var19 + arg2.field2911;
                        var28 = super.field2350.field1461 * var26 / var19 + arg2.field2917;
                        int var29 = (super.field2344 * var15 + (super.field2346 * var10 - -(super.field2347 * var12)) >> 14) + super.field2339;
                        int var30 = (super.field2334 * var12 + super.field2349 * var10 + super.field2333 * var15 >> 14) + super.field2335;
                        var31 = super.field2350.field1466 * var29 / var18 + arg2.field2911;
                        var32 = super.field2350.field1461 * var30 / var18 + arg2.field2917;
                        var33 = super.field2339 - -(super.field2346 * var9 + (super.field2344 * var16 - -(super.field2347 * var12)) >> 14);
                        var34 = super.field2350.field1466 * var33 / var17 + arg2.field2911;
                        var35 = (super.field2334 * var12 + super.field2349 * var9 + super.field2333 * var16 >> 14) + super.field2335;
                        var36 = super.field2350.field1461 * var35 / var17 + arg2.field2917;
                    } else {
                        int var37 = super.field2352[arg0][arg1];
                        int var39;
                        if (super.field2353 == -1) {
                            int var38 = super.field2341 * var37;
                            var20 = (super.field2348 * var9 + var38 - -(super.field2343 * var11) >> 14) + super.field2340;
                            if (super.field2350.field1452 >= var20) {
                                return;
                            }
                            var19 = (super.field2343 * var11 + (super.field2348 * var10 - -var38) >> 14) + super.field2340;
                            if (var19 <= super.field2350.field1452) {
                                return;
                            }
                            var39 = super.field2340 - -(super.field2343 * var12 + super.field2348 * var10 + var38 >> 14);
                            if (var39 <= super.field2350.field1452) {
                                return;
                            }
                            var17 = (super.field2348 * var9 + super.field2343 * var12 - -var38 >> 14) + super.field2340;
                            if (var17 <= super.field2350.field1452) {
                                return;
                            }
                        } else {
                            var17 = super.field2353;
                            var39 = super.field2353;
                            var19 = super.field2353;
                            var20 = super.field2353;
                        }
                        int var40 = super.field2344 * var37;
                        int var41 = super.field2333 * var37;
                        var21 = (super.field2346 * var9 + super.field2347 * var11 + var40 >> 14) + super.field2339;
                        var23 = (super.field2334 * var11 + super.field2349 * var9 + var41 >> 14) + super.field2335;
                        var22 = arg2.field2911 - -(super.field2350.field1466 * var21 / var20);
                        var25 = super.field2339 - -(super.field2347 * var11 + super.field2346 * var10 + var40 >> 14);
                        var24 = super.field2350.field1461 * var23 / var20 + arg2.field2917;
                        var26 = super.field2335 - -(super.field2349 * var10 + (var41 - -(super.field2334 * var11)) >> 14);
                        var27 = super.field2350.field1466 * var25 / var19 + arg2.field2911;
                        int var42 = (super.field2346 * var10 + var40 - -(super.field2347 * var12) >> 14) + super.field2339;
                        var28 = super.field2350.field1461 * var26 / var19 + arg2.field2917;
                        var31 = super.field2350.field1466 * var42 / var39 + arg2.field2911;
                        int var43 = super.field2335 - -(super.field2349 * var10 + super.field2334 * var12 + var41 >> 14);
                        var33 = (super.field2347 * var12 + super.field2346 * var9 + var40 >> 14) + super.field2339;
                        var32 = arg2.field2917 - -(super.field2350.field1461 * var43 / var39);
                        var35 = (super.field2349 * var9 + super.field2334 * var12 + var41 >> 14) + super.field2335;
                        var34 = super.field2350.field1466 * var33 / var17 + arg2.field2911;
                        var36 = super.field2350.field1461 * var35 / var17 + arg2.field2917;
                    }
                    if ((-var34 + var31) * (-var36 + var28) - (-var34 + var27) * (-var36 + var32) > 0) {
                        arg2.field2908 = var31 < 0 || var34 < 0 || ~var27 > -1 || arg2.field2909 < var31 || var34 > arg2.field2909 || ~arg2.field2909 > ~var27;
                        if (var8.field8278 >= 0) {
                            if (this.method1087(super.field2350.field9050.method588(-26679, var8.field8278).field3803)) {
                                arg2.field2910 = 100;
                            }
                            arg2.method1332(var32, var36, var28, var31, var34, var27, 65535 & var8.field8276, 65535 & var8.field8277, var8.field8275 & 65535, var21, var25, var33, var23, var26, var35, var20, var19, var17, var8.field8278);
                            arg2.field2910 = 0;
                        } else {
                            arg2.method1329(var32, var36, var28, var31, var34, var27, 65535 & var8.field8276, 65535 & var8.field8277, var8.field8275 & 65535);
                        }
                    }
                    if (~((var22 - var27) * (-var28 + var36) + -((var24 - var28) * (-var27 + var34))) < -1) {
                        arg2.field2908 = ~var22 > -1 || ~var27 > -1 || var34 < 0 || ~arg2.field2909 > ~var22 || var27 > arg2.field2909 || arg2.field2909 < var34;
                        if (var8.field8278 >= 0) {
                            if (this.method1087(super.field2350.field9050.method588(-26679, var8.field8278).field3803)) {
                                arg2.field2910 = 100;
                            }
                            arg2.method1332(var24, var28, var36, var22, var27, var34, var8.field8279 & 65535, var8.field8275 & 65535, var8.field8277 & 65535, var21, var25, var33, var23, var26, var35, var20, var19, var17, var8.field8278);
                            arg2.field2910 = 0;
                            return;
                        }
                        arg2.method1329(var24, var28, var36, var22, var27, var34, var8.field8279 & 65535, 65535 & var8.field8275, 65535 & var8.field8277);
                    }
                }
            } else {
                class254 var44 = super.field2332[arg0][arg1];
                if (var44 != null) {
                    if (~super.field2353 != 0) {
                        for (int var45 = 0; ~var45 > ~var44.field3579; ++var45) {
                            int var46 = (arg0 << super.field1921) + var44.field3578[var45];
                            short var47 = var44.field3589[var45];
                            int var48 = var44.field3586[var45] - -(arg1 << super.field1921);
                            int var49 = (super.field2333 * var47 + (super.field2349 * var46 - -(super.field2334 * var48)) >> 14) + super.field2335;
                            int var50 = super.field2339 - -(super.field2347 * var48 + (super.field2346 * var46 - -(super.field2344 * var47)) >> 14);
                            arg3[var45] = super.field2350.field1466 * var50 / super.field2353 + arg2.field2911;
                            arg6[var45] = arg2.field2917 - -(super.field2350.field1461 * var49 / super.field2353);
                        }
                    } else {
                        for (int var51 = 0; var51 < var44.field3579; ++var51) {
                            int var91 = var44.field3578[var51] - -(arg0 << super.field1921);
                            short var92 = var44.field3589[var51];
                            int var93 = (arg1 << super.field1921) + var44.field3586[var51];
                            int var94 = (super.field2343 * var93 + super.field2348 * var91 + super.field2341 * var92 >> 14) + super.field2340;
                            if (~var94 >= ~super.field2350.field1452) {
                                return;
                            }
                            int var95 = (super.field2344 * var92 + super.field2347 * var93 + super.field2346 * var91 >> 14) + super.field2339;
                            int var96 = (super.field2334 * var93 + super.field2349 * var91 + super.field2333 * var92 >> 14) + super.field2335;
                            arg3[var51] = arg2.field2911 - -(super.field2350.field1466 * var95 / var94);
                            arg6[var51] = super.field2350.field1461 * var96 / var94 + arg2.field2917;
                        }
                    }
                    if (var44.field3583 == null) {
                        for (int var52 = 0; var44.field3587 > var52; ++var52) {
                            short var53 = var44.field3584[var52];
                            short var54 = var44.field3585[var52];
                            short var55 = var44.field3580[var52];
                            int var56 = arg3[var53];
                            int var57 = arg3[var54];
                            int var58 = arg3[var55];
                            int var59 = arg6[var53];
                            int var60 = arg6[var54];
                            int var61 = arg6[var55];
                            if (~((var61 - var60) * (-var57 + var56) + -((var59 - var60) * (-var57 + var58))) < -1) {
                                int var62 = var44.field3581[var52];
                                if (var62 != -1) {
                                    arg2.field2908 = ~var56 > -1 || var57 < 0 || var58 < 0 || ~var56 < ~arg2.field2909 || ~arg2.field2909 > ~var57 || ~arg2.field2909 > ~var58;
                                    arg2.method1329(var59, var60, var61, var56, var57, var58, class643.method3580(var44.field3582[var53], var62, 0), class643.method3580(var44.field3582[var54], var62, 0), class643.method3580(var44.field3582[var55], var62, 0));
                                }
                            }
                        }
                    } else {
                        int var63 = super.field2352[arg0][arg1];
                        int var64 = super.field2352[arg0 + 1][arg1];
                        int var65 = super.field2352[arg0][arg1 + 1];
                        int var66 = super.field1919 * arg0;
                        int var67 = super.field1919 + var66;
                        int var68 = super.field1919 * arg1;
                        int var69 = var68 - -super.field1919;
                        int var70 = super.field2339 - -(super.field2347 * var68 + super.field2346 * var66 + super.field2344 * var63 >> 14);
                        int var71 = (super.field2349 * var66 + super.field2334 * var68 + super.field2333 * var63 >> 14) + super.field2335;
                        int var72 = (super.field2348 * var66 + super.field2343 * var68 - -(super.field2341 * var63) >> 14) + super.field2340;
                        int var73 = super.field2339 - -(super.field2344 * var64 + super.field2347 * var68 + super.field2346 * var67 >> 14);
                        int var74 = (super.field2349 * var67 + super.field2334 * var68 + super.field2333 * var64 >> 14) + super.field2335;
                        int var75 = super.field2340 - -(super.field2348 * var67 - (-(super.field2343 * var68) + -(super.field2341 * var64)) >> 14);
                        int var76 = super.field2339 - -(super.field2346 * var66 + super.field2347 * var69 + super.field2344 * var65 >> 14);
                        int var77 = (super.field2349 * var66 + super.field2333 * var65 - -(super.field2334 * var69) >> 14) + super.field2335;
                        int var78 = super.field2340 - -(super.field2341 * var65 + super.field2348 * var66 + super.field2343 * var69 >> 14);
                        for (int var79 = 0; var44.field3587 > var79; ++var79) {
                            short var80 = var44.field3584[var79];
                            short var81 = var44.field3585[var79];
                            short var82 = var44.field3580[var79];
                            int var83 = arg3[var80];
                            int var84 = arg3[var81];
                            int var85 = arg3[var82];
                            int var86 = arg6[var80];
                            int var87 = arg6[var81];
                            int var88 = arg6[var82];
                            if ((var83 - var84) * (var88 - var87) + -((-var84 + var85) * (-var87 + var86)) > 0) {
                                arg2.field2908 = var83 < 0 || ~var84 > -1 || var85 < 0 || ~arg2.field2909 > ~var83 || var84 > arg2.field2909 || arg2.field2909 < var85;
                                short var89 = var44.field3583[var79];
                                if (var89 != -1) {
                                    if (this.method1087(super.field2350.field9050.method588(-26679, var89).field3803)) {
                                        arg2.field2910 = 100;
                                    }
                                    arg2.method1332(var86, var87, var88, var83, var84, var85, var44.field3582[var80], var44.field3582[var81], var44.field3582[var82], var70, var73, var76, var71, var74, var77, var72, var75, var78, var89);
                                    arg2.field2910 = 0;
                                } else {
                                    int var90 = var44.field3581[var79];
                                    if (var90 != -1) {
                                        arg2.method1329(var86, var87, var88, var83, var84, var85, class643.method3580(var44.field3582[var80], var90, 0), class643.method3580(var44.field3582[var81], var90, 0), class643.method3580(var44.field3582[var82], var90, 0));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "([IIZLjf;[IIB[I)V", line = 663)
    private final void method1429(int[] arg0, int arg1, boolean arg2, class197 arg3, int[] arg4, int arg5, byte arg6, int[] arg7) {
        ++field3217;
        class567 var9 = super.field2336[arg5][arg1];
        if (var9 != null) {
            if (~(2 & var9.field7643) == -1) {
                int var10 = super.field1919 * arg5;
                int var11 = super.field1919 + var10;
                int var12 = super.field1919 * arg1;
                int var13 = super.field1919 + var12;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var20;
                int var21;
                int var22;
                int var23;
                int var30;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var44;
                int var45;
                if ((var9.field7643 & 1) != 0 && !arg2) {
                    int var18 = super.field2352[arg5][arg1];
                    if (super.field2353 == -1) {
                        int var19 = super.field2341 * var18;
                        var20 = (super.field2348 * var10 + super.field2343 * var12 + var19 >> 14) + super.field2340;
                        if (var20 <= super.field2350.field1452) {
                            return;
                        }
                        var21 = super.field2340 - -(super.field2348 * var11 + super.field2343 * var12 + var19 >> 14);
                        if (~var21 >= ~super.field2350.field1452) {
                            return;
                        }
                        var22 = (super.field2343 * var13 + super.field2348 * var11 + var19 >> 14) + super.field2340;
                        if (var22 <= super.field2350.field1452) {
                            return;
                        }
                        var23 = (super.field2348 * var10 - (-(super.field2343 * var13) + -var19) >> 14) + super.field2340;
                        if (~var23 >= ~super.field2350.field1452) {
                            return;
                        }
                    } else {
                        var23 = super.field2353;
                        var22 = super.field2353;
                        var21 = super.field2353;
                        var20 = super.field2353;
                    }
                    if (super.field2350.field1463) {
                        int var24 = -super.field2350.field1464 + var20;
                        if (~var24 < -1) {
                            var14 = var24;
                            if (~var24 < -256) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - super.field2350.field1464;
                        if (~var25 < -1) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - super.field2350.field1464;
                        if (~var26 < -1) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = -super.field2350.field1464 + var23;
                        if (var27 > 0) {
                            var17 = var27;
                            if (~var27 < -256) {
                                var17 = 255;
                            }
                        }
                    }
                    int var28 = super.field2344 * var18;
                    int var29 = super.field2333 * var18;
                    var30 = (super.field2346 * var10 - (-(super.field2347 * var12) + -var28) >> 14) + super.field2339;
                    var31 = super.field2350.field1466 * var30 / var20 + arg3.field2911;
                    var32 = (super.field2334 * var12 + super.field2349 * var10 + var29 >> 14) + super.field2335;
                    var33 = (super.field2347 * var12 + super.field2346 * var11 + var28 >> 14) + super.field2339;
                    var34 = super.field2350.field1461 * var32 / var20 + arg3.field2917;
                    var35 = (super.field2349 * var11 + super.field2334 * var12 + var29 >> 14) + super.field2335;
                    var36 = super.field2350.field1466 * var33 / var21 + arg3.field2911;
                    var37 = (super.field2347 * var13 + super.field2346 * var11 + var28 >> 14) + super.field2339;
                    var38 = super.field2350.field1461 * var35 / var21 + arg3.field2917;
                    var39 = (super.field2349 * var11 + super.field2334 * var13 + var29 >> 14) + super.field2335;
                    var40 = super.field2350.field1466 * var37 / var22 + arg3.field2911;
                    var41 = (super.field2346 * var10 + super.field2347 * var13 + var28 >> 14) + super.field2339;
                    var42 = arg3.field2917 - -(super.field2350.field1461 * var39 / var22);
                    var43 = (super.field2349 * var10 + super.field2334 * var13 + var29 >> 14) + super.field2335;
                    var44 = arg3.field2911 - -(super.field2350.field1466 * var41 / var23);
                    var45 = arg3.field2917 - -(super.field2350.field1461 * var43 / var23);
                } else {
                    int var46 = super.field2352[arg5][arg1];
                    int var47 = super.field2352[arg5 - -1][arg1];
                    int var48 = super.field2352[arg5 + 1][arg1 + 1];
                    int var49 = super.field2352[arg5][arg1 + 1];
                    if (super.field2353 != -1) {
                        var23 = super.field2353;
                        var22 = super.field2353;
                        var21 = super.field2353;
                        var20 = super.field2353;
                    } else {
                        var20 = (super.field2343 * var12 + super.field2348 * var10 + super.field2341 * var46 >> 14) + super.field2340;
                        if (var20 <= super.field2350.field1452) {
                            return;
                        }
                        var21 = (super.field2343 * var12 + (super.field2348 * var11 - -(super.field2341 * var47)) >> 14) + super.field2340;
                        if (~super.field2350.field1452 <= ~var21) {
                            return;
                        }
                        var22 = (super.field2343 * var13 + (super.field2348 * var11 - -(super.field2341 * var48)) >> 14) + super.field2340;
                        if (super.field2350.field1452 >= var22) {
                            return;
                        }
                        var23 = super.field2340 - -(super.field2348 * var10 + super.field2341 * var49 - -(super.field2343 * var13) >> 14);
                        if (var23 <= super.field2350.field1452) {
                            return;
                        }
                    }
                    if (arg2) {
                        int var50 = -super.field2350.field1464 + var20;
                        if (var50 > 255) {
                            var50 = 255;
                        }
                        if (~var50 < -1) {
                            var14 = var50;
                            int var51 = var9.field7642 * var50 / 255;
                            if (~var51 < -1) {
                                var46 -= var51;
                            }
                        }
                        int var52 = -super.field2350.field1464 + var21;
                        if (~var52 < -256) {
                            var52 = 255;
                        }
                        if (var52 > 0) {
                            var15 = var52;
                            int var53 = var9.field7634 * var52 / 255;
                            if (var53 > 0) {
                                var47 -= var53;
                            }
                        }
                        int var54 = var22 - super.field2350.field1464;
                        if (~var54 < -256) {
                            var54 = 255;
                        }
                        if (var54 > 0) {
                            var16 = var54;
                            int var55 = var9.field7640 * var54 / 255;
                            if (~var55 < -1) {
                                var48 -= var55;
                            }
                        }
                        int var56 = -super.field2350.field1464 + var23;
                        if (var56 > 255) {
                            var56 = 255;
                        }
                        if (var56 > 0) {
                            var17 = var56;
                            int var57 = var9.field7639 * var56 / 255;
                            if (var57 > 0) {
                                var49 -= var57;
                            }
                        }
                    } else if (super.field2350.field1463) {
                        int var58 = -super.field2350.field1464 + var20;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = -super.field2350.field1464 + var21;
                        if (~var59 < -1) {
                            var15 = var59;
                            if (~var59 < -256) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - super.field2350.field1464;
                        if (~var60 < -1) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                        int var61 = var23 - super.field2350.field1464;
                        if (~var61 < -1) {
                            var17 = var61;
                            if (~var61 < -256) {
                                var17 = 255;
                            }
                        }
                    }
                    var30 = super.field2339 - -(super.field2347 * var12 + super.field2346 * var10 + super.field2344 * var46 >> 14);
                    var31 = super.field2350.field1466 * var30 / var20 + arg3.field2911;
                    var32 = (super.field2333 * var46 + (super.field2349 * var10 - -(super.field2334 * var12)) >> 14) + super.field2335;
                    var33 = (super.field2346 * var11 + super.field2347 * var12 + super.field2344 * var47 >> 14) + super.field2339;
                    var34 = arg3.field2917 - -(super.field2350.field1461 * var32 / var20);
                    var36 = super.field2350.field1466 * var33 / var21 + arg3.field2911;
                    var35 = super.field2335 - -(super.field2349 * var11 - (-(super.field2333 * var47) - super.field2334 * var12) >> 14);
                    var38 = super.field2350.field1461 * var35 / var21 + arg3.field2917;
                    var37 = super.field2339 - -(super.field2344 * var48 + super.field2347 * var13 + super.field2346 * var11 >> 14);
                    var39 = (super.field2349 * var11 - (-(super.field2334 * var13) + -(super.field2333 * var48)) >> 14) + super.field2335;
                    var40 = super.field2350.field1466 * var37 / var22 + arg3.field2911;
                    var41 = (super.field2344 * var49 + super.field2347 * var13 + super.field2346 * var10 >> 14) + super.field2339;
                    var42 = super.field2350.field1461 * var39 / var22 + arg3.field2917;
                    var43 = (super.field2334 * var13 + super.field2349 * var10 + super.field2333 * var49 >> 14) + super.field2335;
                    var44 = super.field2350.field1466 * var41 / var23 + arg3.field2911;
                    var45 = arg3.field2917 - -(super.field2350.field1461 * var43 / var23);
                }
                boolean var62 = ~var9.field7633 != 0 && this.method1087(super.field2350.field9050.method588(-26679, var9.field7633).field3803);
                int var63 = var16 + var17 + var15;
                if (~((var38 - var45) * (-var44 + var40) + -((var36 - var44) * (-var45 + var42))) < -1) {
                    arg3.field2908 = var40 < 0 || ~var44 > -1 || ~var36 > -1 || var40 > arg3.field2909 || var44 > arg3.field2909 || ~arg3.field2909 > ~var36;
                    if (var63 >= 765) {
                        arg3.method1327(var42, var45, var38, var40, var44, var36, super.field2350.field1455);
                    } else {
                        if (var62) {
                            arg3.field2910 = 100;
                        }
                        if (var63 > 0) {
                            if (~var9.field7633 > -1) {
                                arg3.method1336(var42, var45, var38, var40, var44, var36, class683.method3766(super.field2350.field1455 | var16 << 24, var9.field7638, (byte) -122), class683.method3766(super.field2350.field1455 | var17 << 24, var9.field7636, (byte) -118), class683.method3766(super.field2350.field1455 | var15 << 24, var9.field7641, (byte) -116));
                            } else {
                                arg3.method1328(var42, var45, var38, var40, var44, var36, super.field2350.field1455, var16, var17, var15, var9.field7638, var9.field7636, var9.field7641, var37, var41, var33, var39, var43, var35, var22, var23, var21, var9.field7633);
                            }
                        } else if (~var9.field7633 > -1) {
                            arg3.method1336(var42, var45, var38, var40, var44, var36, var9.field7638, var9.field7636, var9.field7641);
                        } else {
                            arg3.method1332(var42, var45, var38, var40, var44, var36, var9.field7638, var9.field7636, var9.field7641, var37, var41, var33, var39, var43, var35, var22, var23, var21, var9.field7633);
                        }
                        arg3.field2910 = 0;
                    }
                }
                int var64 = var14 + var17 + var15;
                if (~((var45 - var38) * (-var36 + var31) - (-var36 + var44) * (-var38 + var34)) < -1) {
                    arg3.field2908 = var31 < 0 || ~var36 > -1 || var44 < 0 || ~var31 < ~arg3.field2909 || arg3.field2909 < var36 || ~var44 < ~arg3.field2909;
                    if (~var64 > -766) {
                        if (var62) {
                            arg3.field2910 = 100;
                        }
                        if (var64 > 0) {
                            if (~var9.field7633 <= -1) {
                                arg3.method1328(var34, var38, var45, var31, var36, var44, super.field2350.field1455, var14, var15, var17, var9.field7637, var9.field7641, var9.field7636, var30, var33, var41, var32, var35, var43, var20, var21, var23, var9.field7633);
                            } else {
                                arg3.method1336(var34, var38, var45, var31, var36, var44, class683.method3766(super.field2350.field1455 | var14 << 24, var9.field7637, (byte) -118), class683.method3766(super.field2350.field1455 | var15 << 24, var9.field7641, (byte) -121), class683.method3766(var17 << 24 | super.field2350.field1455, var9.field7636, (byte) -127));
                            }
                        } else if (var9.field7633 < 0) {
                            arg3.method1336(var34, var38, var45, var31, var36, var44, var9.field7637, var9.field7641, var9.field7636);
                        } else {
                            arg3.method1332(var34, var38, var45, var31, var36, var44, var9.field7637, var9.field7641, var9.field7636, var30, var33, var41, var32, var35, var43, var20, var21, var23, var9.field7633);
                        }
                        arg3.field2910 = 0;
                        return;
                    }
                    arg3.method1327(var34, var38, var45, var31, var36, var44, super.field2350.field1455);
                }
            }
        } else if (arg6 > 11) {
            class593 var65 = super.field2337[arg5][arg1];
            if (var65 != null) {
                if (~super.field2353 == 0) {
                    for (int var66 = 0; var65.field8250 > var66; ++var66) {
                        int var67 = (arg5 << super.field1921) + var65.field8252[var66];
                        int var68 = var65.field8257[var66];
                        int var69 = var65.field8256[var66] - -(arg1 << super.field1921);
                        int var70 = (super.field2341 * var68 + (super.field2348 * var67 - -(super.field2343 * var69)) >> 14) + super.field2340;
                        if (var70 <= super.field2350.field1452) {
                            return;
                        }
                        arg4[var66] = 0;
                        if (!arg2) {
                            if (super.field2350.field1463) {
                                int var71 = -super.field2350.field1464 + var70;
                                if (~var71 < -1) {
                                    arg4[var66] = var71;
                                    if (~arg4[var66] < -256) {
                                        arg4[var66] = 255;
                                    }
                                }
                            }
                        } else {
                            int var72 = -super.field2350.field1464 + var70;
                            if (~var72 < -256) {
                                var72 = 255;
                            }
                            if (~var72 < -1) {
                                arg4[var66] = var72;
                                int var73 = var65.field8259[var66] * var72 / 255;
                                if (var73 > 0) {
                                    var68 -= var73;
                                }
                            }
                        }
                        int var74 = (super.field2347 * var69 + super.field2346 * var67 + super.field2344 * var68 >> 14) + super.field2339;
                        int var75 = (super.field2333 * var68 + (super.field2349 * var67 - -(super.field2334 * var69)) >> 14) + super.field2335;
                        arg0[var66] = super.field2350.field1466 * var74 / var70 + arg3.field2911;
                        arg7[var66] = super.field2350.field1461 * var75 / var70 + arg3.field2917;
                    }
                } else {
                    for (int var76 = 0; ~var76 > ~var65.field8250; ++var76) {
                        int var116 = (arg5 << super.field1921) + var65.field8252[var76];
                        int var117 = var65.field8257[var76];
                        int var118 = (arg1 << super.field1921) + var65.field8256[var76];
                        arg4[var76] = 0;
                        if (arg2) {
                            int var119 = -super.field2350.field1464 + super.field2353;
                            if (~var119 < -256) {
                                var119 = 255;
                            }
                            if (var119 > 0) {
                                arg4[var76] = var119;
                                int var120 = var65.field8259[var76] * var119 / 255;
                                if (~var120 < -1) {
                                    var117 -= var120;
                                }
                            }
                        } else if (super.field2350.field1463) {
                            int var121 = -super.field2350.field1464 + super.field2353;
                            if (~var121 < -1) {
                                arg4[var76] = var121;
                                if (~arg4[var76] < -256) {
                                    arg4[var76] = 255;
                                }
                            }
                        }
                        int var122 = super.field2339 - -(super.field2347 * var118 + super.field2346 * var116 + super.field2344 * var117 >> 14);
                        int var123 = (super.field2333 * var117 + super.field2349 * var116 + super.field2334 * var118 >> 14) + super.field2335;
                        arg0[var76] = arg3.field2911 - -(super.field2350.field1466 * var122 / super.field2353);
                        arg7[var76] = super.field2350.field1461 * var123 / super.field2353 + arg3.field2917;
                    }
                }
                if (var65.field8255 != null) {
                    int var77 = super.field2352[arg5][arg1];
                    int var78 = super.field2352[arg5 + 1][arg1];
                    int var79 = super.field2352[arg5][arg1 + 1];
                    int var80 = super.field1919 * arg5;
                    int var81 = super.field1919 + var80;
                    int var82 = super.field1919 * arg1;
                    int var83 = var82 - -super.field1919;
                    int var84 = super.field2339 - -(super.field2347 * var82 + super.field2346 * var80 + super.field2344 * var77 >> 14);
                    int var85 = (super.field2349 * var80 - (-(super.field2333 * var77) - super.field2334 * var82) >> 14) + super.field2335;
                    int var86 = (super.field2343 * var82 + super.field2348 * var80 + super.field2341 * var77 >> 14) + super.field2340;
                    int var87 = (super.field2346 * var81 + super.field2347 * var82 + super.field2344 * var78 >> 14) + super.field2339;
                    int var88 = super.field2335 - -(super.field2349 * var81 + super.field2334 * var82 + super.field2333 * var78 >> 14);
                    int var89 = (super.field2348 * var81 + super.field2343 * var82 - -(super.field2341 * var78) >> 14) + super.field2340;
                    int var90 = (super.field2347 * var83 + super.field2346 * var80 - -(super.field2344 * var79) >> 14) + super.field2339;
                    int var91 = (super.field2334 * var83 + super.field2349 * var80 + super.field2333 * var79 >> 14) + super.field2335;
                    int var92 = super.field2340 - -(super.field2341 * var79 + super.field2348 * var80 + super.field2343 * var83 >> 14);
                    for (int var93 = 0; ~var93 > ~var65.field8254; ++var93) {
                        int var94 = var93 * 3;
                        int var95 = var94 - -1;
                        int var96 = var95 + 1;
                        int var97 = arg0[var94];
                        int var98 = arg0[var95];
                        int var99 = arg0[var96];
                        int var100 = arg7[var94];
                        int var101 = arg7[var95];
                        int var102 = arg7[var96];
                        int var103 = arg4[var94] + arg4[var95] + arg4[var96];
                        if (~((var97 - var98) * (-var101 + var102) - (var100 - var101) * (-var98 + var99)) < -1) {
                            arg3.field2908 = ~var97 > -1 || var98 < 0 || var99 < 0 || ~var97 < ~arg3.field2909 || var98 > arg3.field2909 || ~arg3.field2909 > ~var99;
                            short var104 = var65.field8255[var93];
                            if (~var103 <= -766) {
                                arg3.method1327(var100, var101, var102, var97, var98, var99, super.field2350.field1455);
                            } else {
                                if (~var104 != 0 && this.method1087(super.field2350.field9050.method588(-26679, var104).field3803)) {
                                    arg3.field2910 = 100;
                                }
                                if (~var103 < -1) {
                                    if (~var104 != 0) {
                                        arg3.method1328(var100, var101, var102, var97, var98, var99, super.field2350.field1455, arg4[var94], arg4[var95], arg4[var96], var65.field8258[var94], var65.field8258[var95], var65.field8258[var96], var84, var87, var90, var85, var88, var91, var86, var89, var92, var104);
                                    } else if ((16777215 & var65.field8258[var94]) != 0) {
                                        arg3.method1336(var100, var101, var102, var97, var98, var99, class683.method3766(super.field2350.field1455 | arg4[var94] << 24, var65.field8258[var94], (byte) -108), class683.method3766(arg4[var95] << 24 | super.field2350.field1455, var65.field8258[var95], (byte) -111), class683.method3766(super.field2350.field1455 | arg4[var96] << 24, var65.field8258[var96], (byte) -127));
                                    }
                                } else if (var104 != -1) {
                                    arg3.method1332(var100, var101, var102, var97, var98, var99, var65.field8258[var94], var65.field8258[var95], var65.field8258[var96], var84, var87, var90, var85, var88, var91, var86, var89, var92, var104);
                                } else if (~(var65.field8258[var94] & 16777215) != -1) {
                                    arg3.method1336(var100, var101, var102, var97, var98, var99, var65.field8258[var94], var65.field8258[var95], var65.field8258[var96]);
                                }
                                arg3.field2910 = 0;
                            }
                        }
                    }
                } else {
                    for (int var105 = 0; var105 < var65.field8254; ++var105) {
                        int var106 = var105 * 3;
                        int var107 = var106 + 1;
                        int var108 = var107 - -1;
                        int var109 = arg0[var106];
                        int var110 = arg0[var107];
                        int var111 = arg0[var108];
                        int var112 = arg7[var106];
                        int var113 = arg7[var107];
                        int var114 = arg7[var108];
                        int var115 = arg4[var106] + arg4[var107] + arg4[var108];
                        if ((-var110 + var109) * (-var113 + var114) + -((var111 - var110) * (-var113 + var112)) > 0) {
                            arg3.field2908 = ~var109 > -1 || var110 < 0 || var111 < 0 || ~var109 < ~arg3.field2909 || arg3.field2909 < var110 || arg3.field2909 < var111;
                            if (var115 < 765) {
                                if (~var115 >= -1) {
                                    if (~(16777215 & var65.field8258[var106]) != -1) {
                                        arg3.method1336(var112, var113, var114, var109, var110, var111, var65.field8258[var106], var65.field8258[var107], var65.field8258[var108]);
                                    }
                                } else if ((var65.field8258[var106] & 16777215) != 0) {
                                    arg3.method1336(var112, var113, var114, var109, var110, var111, class653.method3634(var65.field8258[var106], 114, super.field2350.field1455, arg4[var106]), class653.method3634(var65.field8258[var107], 84, super.field2350.field1455, arg4[var107]), class653.method3634(var65.field8258[var108], 42, super.field2350.field1455, arg4[var108]));
                                }
                            } else {
                                arg3.method1327(var112, var113, var114, var109, var110, var111, super.field2350.field1455);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(II)V", line = 1341)
    public final void method280(int arg0, int arg1) {
        ++field3222;
        class359 var3 = (class359) super.field2350.method392(Thread.currentThread());
        var3.field5139.field2910 = 0;
        if (super.field2336 == null) {
            if (super.field2338 != null) {
                this.method1428(arg0, arg1, var3.field5139, var3.field472, var3.field477, true, var3.field495);
                return;
            }
        } else {
            this.method1429(var3.field472, arg1, super.field2350.field1467, var3.field5139, var3.field477, arg0, (byte) 104, var3.field495);
        }
    }

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "(I)V", line = 1359)
    public static void method1430(int arg0) {
        if (arg0 != -1) {
            method1431(-118, 36, 53, 126, false, -118, -45, 125, -63, -23);
        }
        field3218 = null;
        field3214 = null;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1371)
    public final void method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3219;
        class359 var9 = (class359) super.field2350.method392(Thread.currentThread());
        class197 var10 = var9.field5139;
        var10.field2910 = 0;
        var10.field2908 = false;
        if (super.field2336 != null) {
            this.method1426(var9.field472, arg6, arg3, arg7, var10, false, arg0, arg4, arg1, var9.field495, arg5, arg2);
        } else if (super.field2338 != null) {
            this.method1432(arg6, 256, arg4, var10, arg2, var9.field495, arg0, arg7, arg1, var9.field472, arg3, arg5);
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIIIZIIIII)V", line = 1393)
    public static final void method1431(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field3216;
        if (~arg3 <= -513 && arg8 >= 512 && arg3 <= (class86.field1185 - 2) * 512 && class526.field7212 * 512 + -1024 >= arg8) {
            int var10 = class203.method1355(arg8, arg3, 4, arg9) - arg5;
            class37.field500.method1285(arg6, 0, 0);
            class630.field8790.method446(class37.field500);
            class630.field8790.method443(arg3, var10, arg8, class399.field5548);
            class37.field500.method1285(-arg6, 0, 0);
            class630.field8790.method446(class37.field500);
            if (arg4) {
                field3214 = null;
            }
        } else {
            class399.field5548[0] = class399.field5548[1] = -1;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIILjf;I[II[[ZI[III)V", line = 1426)
    private final void method1432(int arg0, int arg1, int arg2, class197 arg3, int arg4, int[] arg5, int arg6, boolean[][] arg7, int arg8, int[] arg9, int arg10, int arg11) {
        ++field3221;
        int var13 = (-arg2 + arg0) * arg4 / arg1;
        arg3.field2921 = false;
        arg3.field2914 = false;
        int var14 = arg4 >> 8;
        int var15 = arg6;
        int var16 = arg8 + var13;
        for (int var17 = arg10; arg11 > var17; ++var17) {
            for (int var18 = arg2; ~var18 > ~arg0; ++var18) {
                if (arg7[var17 - arg10][-arg2 + var18]) {
                    if (super.field2338[var17][var18] != null) {
                        class596 var34 = super.field2338[var17][var18];
                        if (~var34.field8278 != 0 && ~(2 & var34.field8280) == -1 && ~var34.field8281 == 0) {
                            int var35 = super.field2350.method811(var34.field8278);
                            arg3.method1329(var16 - var14, var16 - var14, var16, var14 + var15, var15, var14 + var15, class643.method3580(65535 & var34.field8276, var35, 0), class643.method3580(65535 & var34.field8277, var35, 0), class643.method3580(var34.field8275 & 65535, var35, 0));
                            arg3.method1329(var16, var16, -var14 + var16, var15, var14 + var15, var15, class643.method3580(var34.field8279 & 65535, var35, 0), class643.method3580(var34.field8275 & 65535, var35, 0), class643.method3580(var34.field8277 & 65535, var35, 0));
                        } else if (var34.field8281 == -1) {
                            arg3.method1329(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, var34.field8276 & 65535, 65535 & var34.field8277, var34.field8275 & 65535);
                            arg3.method1329(var16, var16, -var14 + var16, var15, var15 - -var14, var15, var34.field8279 & 65535, 65535 & var34.field8275, var34.field8277 & 65535);
                        } else {
                            int var36 = var34.field8281;
                            arg3.method1329(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var15 - -var14, var36, var36, var36);
                            arg3.method1329(var16, var16, -var14 + var16, var15, var15 - -var14, var15, var36, var36, var36);
                        }
                    } else if (super.field2332[var17][var18] != null) {
                        class254 var19 = super.field2332[var17][var18];
                        for (int var20 = 0; ~var19.field3579 < ~var20; ++var20) {
                            arg9[var20] = var15 - -(var19.field3578[var20] * var14 / super.field1919);
                            arg5[var20] = var16 - var19.field3586[var20] * var14 / super.field1919;
                        }
                        for (int var21 = 0; var19.field3587 > var21; ++var21) {
                            short var22 = var19.field3584[var21];
                            short var23 = var19.field3585[var21];
                            short var24 = var19.field3580[var21];
                            int var25 = arg9[var22];
                            int var26 = arg9[var23];
                            int var27 = arg9[var24];
                            int var28 = arg5[var22];
                            int var29 = arg5[var23];
                            int var30 = arg5[var24];
                            if (var19.field3588 != null && var19.field3588[var21] != -1) {
                                int var31 = var19.field3588[var21];
                                arg3.method1329(var28, var29, var30, var25, var26, var27, class643.method3580(var19.field3582[var22], var31, arg1 ^ 256), class643.method3580(var19.field3582[var23], var31, 0), class643.method3580(var19.field3582[var24], var31, 0));
                            } else if (var19.field3583 != null && var19.field3583[var21] != -1) {
                                int var32 = super.field2350.method811(var19.field3583[var21]);
                                arg3.method1329(var28, var29, var30, var25, var26, var27, class643.method3580(var19.field3582[var22], var32, 0), class643.method3580(var19.field3582[var23], var32, 0), class643.method3580(var19.field3582[var24], var32, arg1 + -256));
                            } else {
                                int var33 = var19.field3581[var21];
                                arg3.method1329(var28, var29, var30, var25, var26, var27, class643.method3580(var19.field3582[var22], var33, 0), class643.method3580(var19.field3582[var23], var33, arg1 ^ 256), class643.method3580(var19.field3582[var24], var33, 0));
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var15 += var14;
            var16 = arg8 + var13;
        }
        arg3.field2914 = true;
    }
}
