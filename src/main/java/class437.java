import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class437 extends class155 {

    @OriginalMember(owner = "client!qq", name = "N", descriptor = "[I")
    public static int[] field6164 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!qq", name = "O", descriptor = "I")
    public static int field6165 = 1;

    @OriginalMember(owner = "client!qq", name = "Q", descriptor = "Luc;")
    public static class27 field6167 = new class27(39, 3);

    @OriginalMember(owner = "client!qq", name = "U", descriptor = "[Lct;")
    public static class131[] field6171 = new class131[14];

    @OriginalMember(owner = "client!qq", name = "T", descriptor = "F")
    public static float field6170;

    @OriginalMember(owner = "client!qq", name = "I", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!qq", name = "L", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!qq", name = "M", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!qq", name = "P", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!qq", name = "R", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!qq", name = "S", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(III[[ZZ)V", line = 6)
    public final void method271(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field6161;
        class193 var6 = super.field2350.field1439;
        super.field2353 = -1;
        super.field2348 = var6.field2856;
        super.field2339 = var6.field2847;
        super.field2333 = var6.field2848;
        super.field2340 = var6.field2855;
        super.field2349 = var6.field2845;
        super.field2343 = var6.field2849;
        super.field2347 = var6.field2854;
        super.field2346 = var6.field2851;
        super.field2344 = var6.field2853;
        super.field2334 = var6.field2850;
        super.field2335 = var6.field2846;
        super.field2341 = var6.field2852;
        for (int var7 = 0; ~(arg2 - -arg2) < ~var7; ++var7) {
            for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
                if (arg3[var7][var8]) {
                    int var9 = -arg2 - -var7 + arg0;
                    int var10 = arg1 - arg2 + var8;
                    if (~var9 <= -1 && super.field1918 > var9 && ~var10 <= -1 && var10 < super.field1916) {
                        this.method280(var9, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIII[[Z)V", line = 58)
    public final void method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field6160;
        class85 var9 = (class85) super.field2350.method392(Thread.currentThread());
        class56 var10 = var9.field1175;
        var10.field789 = false;
        var10.field801 = 0;
        super.field2350.method344();
        if (super.field2336 == null) {
            if (super.field2338 != null) {
                this.method2510((byte) 6, arg1, arg0, var9.field472, arg6, arg2, var9.field495, arg3, arg7, arg4, var10, arg5);
                return;
            }
        } else {
            this.method2506(arg2, var9.field472, arg0, -15984, arg5, arg6, var9.field495, var10, arg1, arg3, arg4, arg7);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)V", line = 81)
    public final void method280(int arg0, int arg1) {
        ++field6162;
        class85 var3 = (class85) super.field2350.method392(Thread.currentThread());
        var3.field1175.field801 = 0;
        if (super.field2336 != null) {
            this.method2508(var3.field467, var3.field495, arg0, var3.field1175, var3.field477, arg1, 255, var3.field472, super.field2350.field1467);
        } else if (super.field2338 != null) {
            this.method2509(var3.field495, var3.field1175, arg0, (byte) 102, arg1, var3.field477, var3.field472, var3.field467);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[IIIII[ILbd;III[[Z)V", line = 98)
    private final void method2506(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, class56 arg7, int arg8, int arg9, int arg10, boolean[][] arg11) {
        ++field6159;
        int var13 = (-arg10 + arg5) * arg0 / 256;
        int var14 = arg0 >> 8;
        boolean var15 = ((class581) super.field2350).field8117;
        super.field2350.method387(false);
        arg7.field796 = false;
        arg7.field798 = false;
        if (arg3 != -15984) {
            field6170 = 1.5138034F;
        }
        int var16 = arg2;
        int var17 = arg8 + var13;
        for (int var18 = arg9; ~var18 > ~arg4; ++var18) {
            for (int var19 = arg10; ~arg5 < ~var19; ++var19) {
                if (arg11[-arg9 + var18][-arg10 + var19]) {
                    if (super.field2336[var18][var19] != null) {
                        class567 var34 = super.field2336[var18][var19];
                        if (~var34.field7633 != 0 && ~(var34.field7643 & 2) == -1 && var34.field7635 == 0) {
                            int var35 = super.field2350.method811(var34.field7633);
                            arg7.method494(-var14 + var17, -var14 + var17, var17, var16 - -var14, var16, var14 + var16, 100, 100, 100, class643.method3580(var34.field7638, var35, 0), class643.method3580(var34.field7636, var35, 0), class643.method3580(var34.field7641, var35, 0));
                            arg7.method494(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class643.method3580(var34.field7637, var35, 0), class643.method3580(var34.field7641, var35, 0), class643.method3580(var34.field7636, var35, 0));
                        } else if (var34.field7635 != 0) {
                            int var36 = var34.field7635;
                            arg7.method489(-var14 + var17, -var14 + var17, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class683.method3766(-16777216 & var34.field7638, var36, (byte) -101), class683.method3766(-16777216 & var34.field7636, var36, (byte) -118), class683.method3766(var34.field7641 & -16777216, var36, (byte) -125));
                            arg7.method489(var17, var17, -var14 + var17, var16, var16 - -var14, var16, 100, 100, 100, class683.method3766(-16777216 & var34.field7637, var36, (byte) -124), class683.method3766(-16777216 & var34.field7641, var36, (byte) -121), class683.method3766(-16777216 & var34.field7636, var36, (byte) -124));
                        } else {
                            arg7.method489(-var14 + var17, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var34.field7638, var34.field7636, var34.field7641);
                            arg7.method489(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var34.field7637, var34.field7641, var34.field7636);
                        }
                    } else if (super.field2337[var18][var19] != null) {
                        class593 var20 = super.field2337[var18][var19];
                        for (int var21 = 0; var21 < var20.field8250; ++var21) {
                            arg1[var21] = var20.field8252[var21] * var14 / super.field1919 + var16;
                            arg6[var21] = var17 - var20.field8256[var21] * var14 / super.field1919;
                        }
                        for (int var22 = 0; var22 < var20.field8254; ++var22) {
                            int var23 = var22 * 3;
                            int var24 = var23 + 1;
                            int var25 = var24 + 1;
                            int var26 = arg1[var23];
                            int var27 = arg1[var24];
                            int var28 = arg1[var25];
                            int var29 = arg6[var23];
                            int var30 = arg6[var24];
                            int var31 = arg6[var25];
                            if (var20.field8251 != null && var20.field8251[var22] != 0 && (var20.field8255 == null || var20.field8255 != null && ~var20.field8255[var22] == 0)) {
                                int var32 = var20.field8251[var22];
                                arg7.method489(var29, var30, var31, var26, var27, var28, 100, 100, 100, class683.method3766(-(-16777216 & var20.field8258[var23]) + -16777216, var32, (byte) -112), class683.method3766(-(-16777216 & var20.field8258[var24]) + -16777216, var32, (byte) -124), class683.method3766(-(var20.field8258[var25] & -16777216) + -16777216, var32, (byte) -98));
                            } else if (var20.field8255 != null && ~var20.field8255[var22] != 0) {
                                int var33 = super.field2350.method811(var20.field8255[var22]);
                                arg7.method494(var29, var30, var31, var26, var27, var28, 100, 100, 100, var33, var33, var33);
                            } else {
                                arg7.method489(var29, var30, var31, var26, var27, var28, 100, 100, 100, var20.field8258[var23], var20.field8258[var24], var20.field8258[var25]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var16 += var14;
            var17 = arg8 + var13;
        }
        arg7.field796 = true;
        super.field2350.method387(var15);
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lfv;IIII[[I[[II)V", line = 243)
    public class437(class107 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(II)Llaa;", line = 247)
    public static final class106 method2507(int arg0, int arg1) {
        ++field6166;
        class106[] var2 = class286.method1721(-1);
        for (int var3 = arg0; ~var3 > ~var2.length; ++var3) {
            if (~var2[var3].field1423 == ~arg1) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "([I[IILbd;[III[IZ)V", line = 269)
    private final void method2508(int[] arg0, int[] arg1, int arg2, class56 arg3, int[] arg4, int arg5, int arg6, int[] arg7, boolean arg8) {
        ++field6163;
        class567 var10 = super.field2336[arg2][arg5];
        if (arg6 != 255) {
            this.method2508((int[]) null, (int[]) null, -68, (class56) null, (int[]) null, 32, -39, (int[]) null, false);
        }
        if (var10 != null) {
            if ((2 & var10.field7643) == 0) {
                int var11 = super.field1919 * arg2;
                int var12 = super.field1919 + var11;
                int var13 = super.field1919 * arg5;
                int var14 = super.field1919 + var13;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var20;
                int var21;
                int var22;
                int var23;
                int var30;
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
                int var46;
                if (~(var10.field7643 & 1) != -1 && !arg8) {
                    int var19 = super.field2352[arg2][arg5];
                    if (~super.field2353 != 0) {
                        var20 = super.field2353;
                        var21 = super.field2353;
                        var22 = super.field2353;
                        var23 = super.field2353;
                    } else {
                        int var24 = super.field2341 * var19;
                        var23 = super.field2340 - -(super.field2348 * var11 + super.field2343 * var13 + var24 >> 14);
                        if (~super.field2350.field1452 <= ~var23) {
                            return;
                        }
                        var22 = (super.field2343 * var13 + super.field2348 * var12 + var24 >> 14) + super.field2340;
                        if (~super.field2350.field1452 <= ~var22) {
                            return;
                        }
                        var21 = super.field2340 - -(super.field2343 * var14 + super.field2348 * var12 + var24 >> 14);
                        if (~super.field2350.field1452 <= ~var21) {
                            return;
                        }
                        var20 = super.field2340 - -(super.field2348 * var11 + super.field2343 * var14 + var24 >> 14);
                        if (super.field2350.field1452 >= var20) {
                            return;
                        }
                    }
                    if (super.field2350.field1463) {
                        int var25 = -super.field2350.field1464 + var23;
                        if (~var25 < -1) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = -super.field2350.field1464 + var22;
                        if (~var26 < -1) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = -super.field2350.field1464 + var21;
                        if (~var27 < -1) {
                            var17 = var27;
                            if (~var27 < -256) {
                                var17 = 255;
                            }
                        }
                        int var28 = -super.field2350.field1464 + var20;
                        if (var28 > 0) {
                            var18 = var28;
                            if (~var28 < -256) {
                                var18 = 255;
                            }
                        }
                    }
                    int var29 = super.field2344 * var19;
                    var30 = super.field2339 - -(super.field2347 * var13 + (super.field2346 * var11 - -var29) >> 14);
                    int var31 = super.field2333 * var19;
                    var32 = super.field2335 - -(super.field2349 * var11 + super.field2334 * var13 + var31 >> 14);
                    var33 = super.field2350.field1466 * var30 / var23 + arg3.field793;
                    var34 = arg3.field794 - -(super.field2350.field1461 * var32 / var23);
                    var35 = super.field2339 - -(super.field2346 * var12 + var29 - -(super.field2347 * var13) >> 14);
                    var36 = (super.field2349 * var12 + (var31 - -(super.field2334 * var13)) >> 14) + super.field2335;
                    var37 = super.field2350.field1466 * var35 / var22 + arg3.field793;
                    var38 = arg3.field794 - -(super.field2350.field1461 * var36 / var22);
                    var39 = super.field2339 - -(super.field2346 * var12 + super.field2347 * var14 + var29 >> 14);
                    var40 = super.field2350.field1466 * var39 / var21 + arg3.field793;
                    var41 = (super.field2349 * var12 - (-var31 - super.field2334 * var14) >> 14) + super.field2335;
                    var42 = super.field2350.field1461 * var41 / var21 + arg3.field794;
                    var43 = (super.field2346 * var11 + super.field2347 * var14 + var29 >> 14) + super.field2339;
                    var44 = (super.field2349 * var11 + super.field2334 * var14 + var31 >> 14) + super.field2335;
                    var45 = super.field2350.field1466 * var43 / var20 + arg3.field793;
                    var46 = super.field2350.field1461 * var44 / var20 + arg3.field794;
                } else {
                    int var47 = super.field2352[arg2][arg5];
                    int var48 = super.field2352[arg2 - -1][arg5];
                    int var49 = super.field2352[arg2 - -1][arg5 - -1];
                    int var50 = super.field2352[arg2][arg5 + 1];
                    if (~super.field2353 != 0) {
                        var20 = super.field2353;
                        var21 = super.field2353;
                        var22 = super.field2353;
                        var23 = super.field2353;
                    } else {
                        var23 = (super.field2348 * var11 - (-(super.field2341 * var47) - super.field2343 * var13) >> 14) + super.field2340;
                        if (var23 <= super.field2350.field1452) {
                            return;
                        }
                        var22 = (super.field2348 * var12 + super.field2343 * var13 + super.field2341 * var48 >> 14) + super.field2340;
                        if (~var22 >= ~super.field2350.field1452) {
                            return;
                        }
                        var21 = (super.field2343 * var14 + super.field2348 * var12 + super.field2341 * var49 >> 14) + super.field2340;
                        if (~var21 >= ~super.field2350.field1452) {
                            return;
                        }
                        var20 = super.field2340 - -(super.field2348 * var11 + super.field2341 * var50 - -(super.field2343 * var14) >> 14);
                        if (~super.field2350.field1452 <= ~var20) {
                            return;
                        }
                    }
                    if (!arg8) {
                        if (super.field2350.field1463) {
                            int var51 = -super.field2350.field1464 + var23;
                            if (var51 > 0) {
                                var15 = var51;
                                if (var51 > 255) {
                                    var15 = 255;
                                }
                            }
                            int var52 = -super.field2350.field1464 + var22;
                            if (var52 > 0) {
                                var16 = var52;
                                if (var52 > 255) {
                                    var16 = 255;
                                }
                            }
                            int var53 = -super.field2350.field1464 + var21;
                            if (~var53 < -1) {
                                var17 = var53;
                                if (~var53 < -256) {
                                    var17 = 255;
                                }
                            }
                            int var54 = var20 - super.field2350.field1464;
                            if (var54 > 0) {
                                var18 = var54;
                                if (var54 > 255) {
                                    var18 = 255;
                                }
                            }
                        }
                    } else {
                        int var55 = -super.field2350.field1464 + var23;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var15 = var55;
                            int var56 = var10.field7642 * var55 / 255;
                            if (var56 > 0) {
                                var47 -= var56;
                            }
                        }
                        int var57 = var22 - super.field2350.field1464;
                        if (~var57 < -256) {
                            var57 = 255;
                        }
                        if (~var57 < -1) {
                            var16 = var57;
                            int var58 = var10.field7634 * var57 / 255;
                            if (var58 > 0) {
                                var48 -= var58;
                            }
                        }
                        int var59 = -super.field2350.field1464 + var21;
                        if (~var59 < -256) {
                            var59 = 255;
                        }
                        if (~var59 < -1) {
                            var17 = var59;
                            int var60 = var10.field7640 * var59 / 255;
                            if (var60 > 0) {
                                var49 -= var60;
                            }
                        }
                        int var61 = -super.field2350.field1464 + var20;
                        if (~var61 < -256) {
                            var61 = 255;
                        }
                        if (~var61 < -1) {
                            var18 = var61;
                            int var62 = var10.field7639 * var61 / 255;
                            if (var62 > 0) {
                                var50 -= var62;
                            }
                        }
                    }
                    var30 = (super.field2346 * var11 + super.field2344 * var47 - -(super.field2347 * var13) >> 14) + super.field2339;
                    var33 = arg3.field793 - -(super.field2350.field1466 * var30 / var23);
                    var32 = (super.field2334 * var13 + super.field2349 * var11 + super.field2333 * var47 >> 14) + super.field2335;
                    var34 = super.field2350.field1461 * var32 / var23 + arg3.field794;
                    var35 = (super.field2346 * var12 + super.field2347 * var13 + super.field2344 * var48 >> 14) + super.field2339;
                    var36 = (super.field2333 * var48 + (super.field2349 * var12 - -(super.field2334 * var13)) >> 14) + super.field2335;
                    var37 = arg3.field793 - -(super.field2350.field1466 * var35 / var22);
                    var39 = (super.field2347 * var14 + super.field2346 * var12 - -(super.field2344 * var49) >> 14) + super.field2339;
                    var38 = arg3.field794 - -(super.field2350.field1461 * var36 / var22);
                    var41 = (super.field2349 * var12 + super.field2334 * var14 - -(super.field2333 * var49) >> 14) + super.field2335;
                    var40 = arg3.field793 - -(super.field2350.field1466 * var39 / var21);
                    var43 = (super.field2346 * var11 + super.field2347 * var14 + super.field2344 * var50 >> 14) + super.field2339;
                    var42 = arg3.field794 - -(super.field2350.field1461 * var41 / var21);
                    var45 = super.field2350.field1466 * var43 / var20 + arg3.field793;
                    var44 = (super.field2334 * var14 + super.field2349 * var11 + super.field2333 * var50 >> 14) + super.field2335;
                    var46 = super.field2350.field1461 * var44 / var20 + arg3.field794;
                }
                boolean var63 = ~var10.field7633 != 0 && this.method1087(super.field2350.field9050.method588(-26679, var10.field7633).field3803);
                int var64 = var16 + var18 + var17;
                if ((-var45 + var40) * (-var46 + var38) + -((-var45 + var37) * (-var46 + var42)) > 0) {
                    arg3.field789 = var40 < 0 || var45 < 0 || ~var37 > -1 || ~var40 < ~arg3.field787 || arg3.field787 < var45 || var37 > arg3.field787;
                    if (~var64 <= -766) {
                        arg3.method483(var42, var46, var38, var40, var45, var37, var21, var20, var22, super.field2350.field1455);
                    } else {
                        if (var63) {
                            arg3.field801 = 100;
                        }
                        if (~var64 < -1) {
                            if (var10.field7633 >= 0) {
                                arg3.method498(var42, var46, var38, var40, var45, var37, var21, var20, var22, super.field2350.field1455, var17, var18, var16, var10.field7638, var10.field7636, var10.field7641, var39, var43, var35, var41, var44, var36, var21, var20, var22, var10.field7633);
                            } else {
                                arg3.method489(var42, var46, var38, var40, var45, var37, var21, var20, var22, class683.method3766(var17 << 24 | super.field2350.field1455, var10.field7638, (byte) -104), class683.method3766(var18 << 24 | super.field2350.field1455, var10.field7636, (byte) -108), class683.method3766(var16 << 24 | super.field2350.field1455, var10.field7641, (byte) -100));
                            }
                        } else if (~var10.field7633 > -1) {
                            arg3.method489(var42, var46, var38, var40, var45, var37, var21, var20, var22, var10.field7638, var10.field7636, var10.field7641);
                        } else {
                            arg3.method495(var42, var46, var38, var40, var45, var37, var21, var20, var22, var10.field7638, var10.field7636, var10.field7641, var39, var43, var35, var41, var44, var36, var21, var20, var22, var10.field7633);
                        }
                        arg3.field801 = 0;
                    }
                }
                int var65 = var15 + var16 + var18;
                if ((-var37 + var33) * (-var38 + var46) + -((var45 - var37) * (-var38 + var34)) > 0) {
                    arg3.field789 = ~var33 > -1 || var37 < 0 || var45 < 0 || arg3.field787 < var33 || var37 > arg3.field787 || var45 > arg3.field787;
                    if (var65 < 765) {
                        if (var63) {
                            arg3.field801 = 100;
                        }
                        if (var65 > 0) {
                            if (~var10.field7633 > -1) {
                                arg3.method489(var34, var38, var46, var33, var37, var45, var23, var22, var20, class683.method3766(super.field2350.field1455 | var15 << 24, var10.field7637, (byte) -124), class683.method3766(super.field2350.field1455 | var16 << 24, var10.field7641, (byte) -100), class683.method3766(var18 << 24 | super.field2350.field1455, var10.field7636, (byte) -98));
                            } else {
                                arg3.method498(var34, var38, var46, var33, var37, var45, var23, var22, var20, super.field2350.field1455, var15, var16, var18, var10.field7637, var10.field7641, var10.field7636, var30, var35, var43, var32, var36, var44, var23, var22, var20, var10.field7633);
                            }
                        } else if (var10.field7633 >= 0) {
                            arg3.method495(var34, var38, var46, var33, var37, var45, var23, var22, var20, var10.field7637, var10.field7641, var10.field7636, var30, var35, var43, var32, var36, var44, var23, var22, var20, var10.field7633);
                        } else {
                            arg3.method489(var34, var38, var46, var33, var37, var45, var23, var22, var20, var10.field7637, var10.field7641, var10.field7636);
                        }
                        arg3.field801 = 0;
                        return;
                    }
                    arg3.method483(var34, var38, var46, var33, var37, var45, var23, var22, var20, super.field2350.field1455);
                }
            }
        } else {
            class593 var66 = super.field2337[arg2][arg5];
            if (var66 != null) {
                if (~super.field2353 != 0) {
                    for (int var67 = 0; ~var67 > ~var66.field8250; ++var67) {
                        int var68 = var66.field8252[var67] - -(arg2 << super.field1921);
                        int var69 = var66.field8257[var67];
                        int var70 = var66.field8256[var67] - -(arg5 << super.field1921);
                        arg4[var67] = 0;
                        if (arg8) {
                            int var71 = -super.field2350.field1464 + super.field2353;
                            if (var71 > 255) {
                                var71 = 255;
                            }
                            if (var71 > 0) {
                                arg4[var67] = var71;
                                int var72 = var66.field8259[var67] * var71 / 255;
                                if (~var72 < -1) {
                                    var69 -= var72;
                                }
                            }
                        } else if (super.field2350.field1463) {
                            int var73 = -super.field2350.field1464 + super.field2353;
                            if (var73 > 0) {
                                arg4[var67] = var73;
                                if (arg4[var67] > 255) {
                                    arg4[var67] = 255;
                                }
                            }
                        }
                        int var74 = (super.field2349 * var68 - (-(super.field2333 * var69) - super.field2334 * var70) >> 14) + super.field2335;
                        int var75 = super.field2339 - -(super.field2346 * var68 + super.field2344 * var69 - -(super.field2347 * var70) >> 14);
                        arg7[var67] = super.field2350.field1466 * var75 / super.field2353 + arg3.field793;
                        arg1[var67] = super.field2350.field1461 * var74 / super.field2353 + arg3.field794;
                        arg0[var67] = super.field2353;
                    }
                } else {
                    for (int var76 = 0; var66.field8250 > var76; ++var76) {
                        int var116 = (arg2 << super.field1921) + var66.field8252[var76];
                        int var117 = var66.field8257[var76];
                        int var118 = (arg5 << super.field1921) + var66.field8256[var76];
                        int var119 = (super.field2348 * var116 + super.field2343 * var118 + super.field2341 * var117 >> 14) + super.field2340;
                        if (var119 <= super.field2350.field1452) {
                            return;
                        }
                        arg4[var76] = 0;
                        if (arg8) {
                            int var120 = -super.field2350.field1464 + var119;
                            if (var120 > 255) {
                                var120 = 255;
                            }
                            if (~var120 < -1) {
                                arg4[var76] = var120;
                                int var121 = var66.field8259[var76] * var120 / 255;
                                if (var121 > 0) {
                                    var117 -= var121;
                                }
                            }
                        } else if (super.field2350.field1463) {
                            int var122 = -super.field2350.field1464 + var119;
                            if (var122 > 0) {
                                arg4[var76] = var122;
                                if (~arg4[var76] < -256) {
                                    arg4[var76] = 255;
                                }
                            }
                        }
                        int var123 = super.field2335 - -(super.field2349 * var116 + super.field2333 * var117 - -(super.field2334 * var118) >> 14);
                        int var124 = (super.field2344 * var117 + (super.field2346 * var116 - -(super.field2347 * var118)) >> 14) + super.field2339;
                        arg7[var76] = super.field2350.field1466 * var124 / var119 + arg3.field793;
                        arg1[var76] = super.field2350.field1461 * var123 / var119 + arg3.field794;
                        arg0[var76] = var119;
                    }
                }
                if (var66.field8255 == null) {
                    for (int var77 = 0; ~var66.field8254 < ~var77; ++var77) {
                        int var78 = var77 * 3;
                        int var79 = var78 - -1;
                        int var80 = var79 + 1;
                        int var81 = arg7[var78];
                        int var82 = arg7[var79];
                        int var83 = arg7[var80];
                        int var84 = arg1[var78];
                        int var85 = arg1[var79];
                        int var86 = arg1[var80];
                        int var87 = arg4[var79] + arg4[var80] + arg4[var78];
                        if (~((var86 - var85) * (-var82 + var81) + -((var83 - var82) * (-var85 + var84))) < -1) {
                            arg3.field789 = var81 < 0 || var82 < 0 || var83 < 0 || ~arg3.field787 > ~var81 || ~arg3.field787 > ~var82 || ~arg3.field787 > ~var83;
                            if (var87 >= 765) {
                                arg3.method483(var84, var85, var86, var81, var82, var83, arg0[var78], arg0[var79], arg0[var80], super.field2350.field1455);
                            } else if (~var87 >= -1) {
                                if ((16777215 & var66.field8258[var78]) != 0) {
                                    arg3.method489(var84, var85, var86, var81, var82, var83, arg0[var78], arg0[var79], arg0[var80], var66.field8258[var78], var66.field8258[var79], var66.field8258[var80]);
                                }
                            } else if (~(16777215 & var66.field8258[var78]) != -1) {
                                arg3.method489(var84, var85, var86, var81, var82, var83, arg0[var78], arg0[var79], arg0[var80], class653.method3634(var66.field8258[var78], 112, super.field2350.field1455, arg4[var78]), class653.method3634(var66.field8258[var79], 38, super.field2350.field1455, arg4[var79]), class653.method3634(var66.field8258[var80], 117, super.field2350.field1455, arg4[var80]));
                            }
                        }
                    }
                } else {
                    int var88 = super.field2352[arg2][arg5];
                    int var89 = super.field2352[arg2 + 1][arg5];
                    int var90 = super.field2352[arg2][arg5 + 1];
                    int var91 = super.field1919 * arg2;
                    int var92 = super.field1919 + var91;
                    int var93 = super.field1919 * arg5;
                    int var94 = super.field1919 + var93;
                    int var95 = (super.field2346 * var91 + super.field2347 * var93 + super.field2344 * var88 >> 14) + super.field2339;
                    int var96 = super.field2335 - -(super.field2349 * var91 - (-(super.field2334 * var93) + -(super.field2333 * var88)) >> 14);
                    int var97 = (super.field2343 * var93 + super.field2348 * var91 + super.field2341 * var88 >> 14) + super.field2340;
                    int var98 = (super.field2347 * var93 + super.field2346 * var92 + super.field2344 * var89 >> 14) + super.field2339;
                    int var99 = (super.field2349 * var92 + super.field2334 * var93 + super.field2333 * var89 >> 14) + super.field2335;
                    int var100 = super.field2340 - -(super.field2341 * var89 + (super.field2348 * var92 - -(super.field2343 * var93)) >> 14);
                    int var101 = (super.field2347 * var94 + (super.field2346 * var91 - -(super.field2344 * var90)) >> 14) + super.field2339;
                    int var102 = (super.field2333 * var90 + (super.field2349 * var91 - -(super.field2334 * var94)) >> 14) + super.field2335;
                    int var103 = super.field2340 - -(super.field2343 * var94 + super.field2348 * var91 + super.field2341 * var90 >> 14);
                    for (int var104 = 0; ~var104 > ~var66.field8254; ++var104) {
                        int var105 = var104 * 3;
                        int var106 = var105 - -1;
                        int var107 = var106 - -1;
                        int var108 = arg7[var105];
                        int var109 = arg7[var106];
                        int var110 = arg7[var107];
                        int var111 = arg1[var105];
                        int var112 = arg1[var106];
                        int var113 = arg1[var107];
                        int var114 = arg4[var105] + arg4[var107] + arg4[var106];
                        if ((-var109 + var108) * (-var112 + var113) - (-var109 + var110) * (-var112 + var111) > 0) {
                            arg3.field789 = ~var108 > -1 || var109 < 0 || ~var110 > -1 || arg3.field787 < var108 || var109 > arg3.field787 || var110 > arg3.field787;
                            short var115 = var66.field8255[var104];
                            if (var114 >= 765) {
                                arg3.method483(var111, var112, var113, var108, var109, var110, arg0[var105], arg0[var106], arg0[var107], super.field2350.field1455);
                            } else {
                                if (var115 != -1 && this.method1087(super.field2350.field9050.method588(-26679, var115).field3803)) {
                                    arg3.field801 = 100;
                                }
                                if (var114 <= 0) {
                                    if (var115 == -1) {
                                        if ((16777215 & var66.field8258[var105]) != 0) {
                                            arg3.method489(var111, var112, var113, var108, var109, var110, arg0[var105], arg0[var106], arg0[var107], var66.field8258[var105], var66.field8258[var106], var66.field8258[var107]);
                                        }
                                    } else {
                                        arg3.method495(var111, var112, var113, var108, var109, var110, arg0[var105], arg0[var106], arg0[var107], var66.field8258[var105], var66.field8258[var106], var66.field8258[var107], var95, var98, var101, var96, var99, var102, var97, var100, var103, var115);
                                    }
                                } else if (var115 != -1) {
                                    arg3.method498(var111, var112, var113, var108, var109, var110, arg0[var105], arg0[var106], arg0[var107], super.field2350.field1455, arg4[var105], arg4[var106], arg4[var107], var66.field8258[var105], var66.field8258[var106], var66.field8258[var107], var95, var98, var101, var96, var99, var102, var97, var100, var103, var115);
                                } else if (~(16777215 & var66.field8258[var105]) != -1) {
                                    arg3.method489(var111, var112, var113, var108, var109, var110, arg0[var105], arg0[var106], arg0[var107], class683.method3766(super.field2350.field1455 | arg4[var105] << 24, var66.field8258[var105], (byte) -109), class683.method3766(super.field2350.field1455 | arg4[var106] << 24, var66.field8258[var106], (byte) -105), class683.method3766(arg4[var107] << 24 | super.field2350.field1455, var66.field8258[var107], (byte) -99));
                                }
                                arg3.field801 = 0;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "([ILbd;IBI[I[I[I)V", line = 954)
    private final void method2509(int[] arg0, class56 arg1, int arg2, byte arg3, int arg4, int[] arg5, int[] arg6, int[] arg7) {
        ++field6169;
        int var9 = -25 / ((-32 - arg3) / 61);
        class596 var10 = super.field2338[arg2][arg4];
        if (var10 != null) {
            if (~(var10.field8280 & 2) == -1) {
                int var11 = super.field1919 * arg2;
                int var12 = var11 - -super.field1919;
                int var13 = super.field1919 * arg4;
                int var14 = super.field1919 + var13;
                int var16;
                int var17;
                int var18;
                int var19;
                int var22;
                int var24;
                int var25;
                int var26;
                int var27;
                int var28;
                int var29;
                int var30;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                if (~(1 & var10.field8280) != -1) {
                    int var15 = super.field2352[arg2][arg4];
                    if (super.field2353 != -1) {
                        var16 = super.field2353;
                        var17 = super.field2353;
                        var18 = super.field2353;
                        var19 = super.field2353;
                    } else {
                        int var20 = super.field2341 * var15;
                        var19 = (super.field2348 * var11 - (-(super.field2343 * var13) + -var20) >> 14) + super.field2340;
                        if (var19 <= super.field2350.field1452) {
                            return;
                        }
                        var18 = (super.field2343 * var13 + super.field2348 * var12 + var20 >> 14) + super.field2340;
                        if (var18 <= super.field2350.field1452) {
                            return;
                        }
                        var17 = super.field2340 - -(super.field2348 * var12 + super.field2343 * var14 - -var20 >> 14);
                        if (var17 <= super.field2350.field1452) {
                            return;
                        }
                        var16 = (super.field2348 * var11 - -var20 - -(super.field2343 * var14) >> 14) + super.field2340;
                        if (~super.field2350.field1452 <= ~var16) {
                            return;
                        }
                    }
                    int var21 = super.field2344 * var15;
                    var22 = super.field2339 - -(super.field2346 * var11 - (-var21 - super.field2347 * var13) >> 14);
                    int var23 = super.field2333 * var15;
                    var24 = (super.field2334 * var13 + super.field2349 * var11 + var23 >> 14) + super.field2335;
                    var25 = super.field2350.field1466 * var22 / var19 + arg1.field793;
                    var26 = (super.field2346 * var12 - (-(super.field2347 * var13) + -var21) >> 14) + super.field2339;
                    var27 = super.field2350.field1461 * var24 / var19 + arg1.field794;
                    var28 = arg1.field793 - -(super.field2350.field1466 * var26 / var18);
                    var29 = super.field2335 - -(super.field2349 * var12 + super.field2334 * var13 + var23 >> 14);
                    var30 = arg1.field794 - -(super.field2350.field1461 * var29 / var18);
                    int var31 = (super.field2347 * var14 + super.field2346 * var12 - -var21 >> 14) + super.field2339;
                    int var32 = (super.field2349 * var12 + super.field2334 * var14 + var23 >> 14) + super.field2335;
                    var33 = arg1.field793 - -(super.field2350.field1466 * var31 / var17);
                    var34 = super.field2339 - -(super.field2347 * var14 + super.field2346 * var11 + var21 >> 14);
                    var35 = super.field2350.field1461 * var32 / var17 + arg1.field794;
                    var36 = (super.field2334 * var14 + super.field2349 * var11 + var23 >> 14) + super.field2335;
                    var37 = super.field2350.field1466 * var34 / var16 + arg1.field793;
                    var38 = super.field2350.field1461 * var36 / var16 + arg1.field794;
                } else {
                    int var39 = super.field2352[arg2][arg4];
                    int var40 = super.field2352[arg2 - -1][arg4];
                    int var41 = super.field2352[arg2 - -1][arg4 + 1];
                    int var42 = super.field2352[arg2][arg4 + 1];
                    if (super.field2353 != -1) {
                        var16 = super.field2353;
                        var17 = super.field2353;
                        var18 = super.field2353;
                        var19 = super.field2353;
                    } else {
                        var19 = (super.field2343 * var13 + super.field2348 * var11 + super.field2341 * var39 >> 14) + super.field2340;
                        if (~var19 >= ~super.field2350.field1452) {
                            return;
                        }
                        var18 = (super.field2348 * var12 - (-(super.field2341 * var40) - super.field2343 * var13) >> 14) + super.field2340;
                        if (~super.field2350.field1452 <= ~var18) {
                            return;
                        }
                        var17 = super.field2340 - -(super.field2343 * var14 + (super.field2348 * var12 - -(super.field2341 * var41)) >> 14);
                        if (~super.field2350.field1452 <= ~var17) {
                            return;
                        }
                        var16 = super.field2340 - -(super.field2343 * var14 + (super.field2348 * var11 - -(super.field2341 * var42)) >> 14);
                        if (~var16 >= ~super.field2350.field1452) {
                            return;
                        }
                    }
                    var22 = (super.field2344 * var39 + (super.field2346 * var11 - -(super.field2347 * var13)) >> 14) + super.field2339;
                    var25 = super.field2350.field1466 * var22 / var19 + arg1.field793;
                    var24 = super.field2335 - -(super.field2334 * var13 + super.field2349 * var11 + super.field2333 * var39 >> 14);
                    var26 = (super.field2347 * var13 + super.field2346 * var12 + super.field2344 * var40 >> 14) + super.field2339;
                    var27 = arg1.field794 - -(super.field2350.field1461 * var24 / var19);
                    var28 = arg1.field793 - -(super.field2350.field1466 * var26 / var18);
                    var29 = (super.field2349 * var12 + super.field2334 * var13 + super.field2333 * var40 >> 14) + super.field2335;
                    int var43 = (super.field2347 * var14 + super.field2346 * var12 + super.field2344 * var41 >> 14) + super.field2339;
                    var30 = super.field2350.field1461 * var29 / var18 + arg1.field794;
                    var33 = arg1.field793 - -(super.field2350.field1466 * var43 / var17);
                    int var44 = (super.field2349 * var12 + super.field2333 * var41 - -(super.field2334 * var14) >> 14) + super.field2335;
                    var34 = super.field2339 - -(super.field2347 * var14 + super.field2346 * var11 - -(super.field2344 * var42) >> 14);
                    var35 = super.field2350.field1461 * var44 / var17 + arg1.field794;
                    var37 = super.field2350.field1466 * var34 / var16 + arg1.field793;
                    var36 = (super.field2334 * var14 + super.field2349 * var11 + super.field2333 * var42 >> 14) + super.field2335;
                    var38 = arg1.field794 - -(super.field2350.field1461 * var36 / var16);
                }
                if ((var30 - var38) * (-var37 + var33) + -((-var37 + var28) * (-var38 + var35)) > 0) {
                    arg1.field789 = var33 < 0 || var37 < 0 || ~var28 > -1 || ~arg1.field787 > ~var33 || ~var37 < ~arg1.field787 || ~var28 < ~arg1.field787;
                    if (var10.field8278 >= 0) {
                        if (this.method1087(super.field2350.field9050.method588(-26679, var10.field8278).field3803)) {
                            arg1.field801 = 100;
                        }
                        arg1.method495(var35, var38, var30, var33, var37, var28, var17, var16, var18, 65535 & var10.field8276, var10.field8277 & 65535, var10.field8275 & 65535, var22, var26, var34, var24, var29, var36, var19, var18, var16, var10.field8278);
                        arg1.field801 = 0;
                    } else {
                        arg1.method494(var35, var38, var30, var33, var37, var28, var17, var16, var18, 65535 & var10.field8276, 65535 & var10.field8277, var10.field8275 & 65535);
                    }
                }
                if (~((var38 - var30) * (-var28 + var25) + -((-var28 + var37) * (-var30 + var27))) < -1) {
                    arg1.field789 = ~var25 > -1 || ~var28 > -1 || ~var37 > -1 || ~var25 < ~arg1.field787 || ~var28 < ~arg1.field787 || ~var37 < ~arg1.field787;
                    if (~var10.field8278 > -1) {
                        arg1.method494(var27, var30, var38, var25, var28, var37, var19, var18, var16, var10.field8279 & 65535, var10.field8275 & 65535, 65535 & var10.field8277);
                        return;
                    }
                    if (this.method1087(super.field2350.field9050.method588(-26679, var10.field8278).field3803)) {
                        arg1.field801 = 100;
                    }
                    arg1.method495(var27, var30, var38, var25, var28, var37, var19, var18, var16, var10.field8279 & 65535, var10.field8275 & 65535, var10.field8277 & 65535, var22, var26, var34, var24, var29, var36, var19, var18, var16, var10.field8278);
                    arg1.field801 = 0;
                }
            }
        } else {
            class254 var45 = super.field2332[arg2][arg4];
            if (var45 != null) {
                if (super.field2353 == -1) {
                    for (int var46 = 0; var46 < var45.field3579; ++var46) {
                        int var47 = (arg2 << super.field1921) + var45.field3578[var46];
                        short var48 = var45.field3589[var46];
                        int var49 = (arg4 << super.field1921) + var45.field3586[var46];
                        int var50 = (super.field2348 * var47 - -(super.field2341 * var48) - -(super.field2343 * var49) >> 14) + super.field2340;
                        if (~var50 >= ~super.field2350.field1452) {
                            return;
                        }
                        int var51 = (super.field2349 * var47 - (-(super.field2333 * var48) - super.field2334 * var49) >> 14) + super.field2335;
                        int var52 = (super.field2344 * var48 + super.field2347 * var49 + super.field2346 * var47 >> 14) + super.field2339;
                        arg6[var46] = arg1.field793 - -(super.field2350.field1466 * var52 / var50);
                        arg0[var46] = super.field2350.field1461 * var51 / var50 + arg1.field794;
                        arg7[var46] = var50;
                    }
                } else {
                    for (int var53 = 0; var53 < var45.field3579; ++var53) {
                        int var93 = (arg2 << super.field1921) + var45.field3578[var53];
                        short var94 = var45.field3589[var53];
                        int var95 = var45.field3586[var53] - -(arg4 << super.field1921);
                        int var96 = (super.field2344 * var94 + super.field2347 * var95 + super.field2346 * var93 >> 14) + super.field2339;
                        int var97 = (super.field2334 * var95 + super.field2349 * var93 + super.field2333 * var94 >> 14) + super.field2335;
                        arg6[var53] = super.field2350.field1466 * var96 / super.field2353 + arg1.field793;
                        arg0[var53] = super.field2350.field1461 * var97 / super.field2353 + arg1.field794;
                        arg7[var53] = super.field2353;
                    }
                }
                if (var45.field3583 != null) {
                    int var54 = super.field2352[arg2][arg4];
                    int var55 = super.field2352[arg2 + 1][arg4];
                    int var56 = super.field2352[arg2][arg4 + 1];
                    int var57 = super.field1919 * arg2;
                    int var58 = super.field1919 + var57;
                    int var59 = super.field1919 * arg4;
                    int var60 = super.field1919 + var59;
                    int var61 = (super.field2347 * var59 + super.field2346 * var57 + super.field2344 * var54 >> 14) + super.field2339;
                    int var62 = super.field2335 - -(super.field2349 * var57 + super.field2334 * var59 - -(super.field2333 * var54) >> 14);
                    int var63 = super.field2340 - -(super.field2348 * var57 + super.field2343 * var59 - -(super.field2341 * var54) >> 14);
                    int var64 = super.field2339 - -(super.field2347 * var59 + super.field2346 * var58 + super.field2344 * var55 >> 14);
                    int var65 = super.field2335 - -(super.field2349 * var58 + super.field2334 * var59 - -(super.field2333 * var55) >> 14);
                    int var66 = (super.field2343 * var59 + super.field2348 * var58 + super.field2341 * var55 >> 14) + super.field2340;
                    int var67 = (super.field2347 * var60 + super.field2346 * var57 + super.field2344 * var56 >> 14) + super.field2339;
                    int var68 = (super.field2333 * var56 + (super.field2349 * var57 - -(super.field2334 * var60)) >> 14) + super.field2335;
                    int var69 = (super.field2343 * var60 + (super.field2348 * var57 - -(super.field2341 * var56)) >> 14) + super.field2340;
                    for (int var70 = 0; ~var70 > ~var45.field3587; ++var70) {
                        short var71 = var45.field3584[var70];
                        short var72 = var45.field3585[var70];
                        short var73 = var45.field3580[var70];
                        int var74 = arg6[var71];
                        int var75 = arg6[var72];
                        int var76 = arg6[var73];
                        int var77 = arg0[var71];
                        int var78 = arg0[var72];
                        int var79 = arg0[var73];
                        if (~((var74 - var75) * (-var78 + var79) + -((-var75 + var76) * (-var78 + var77))) < -1) {
                            arg1.field789 = var74 < 0 || var75 < 0 || var76 < 0 || arg1.field787 < var74 || arg1.field787 < var75 || ~arg1.field787 > ~var76;
                            short var80 = var45.field3583[var70];
                            if (~var80 == 0) {
                                int var81 = var45.field3581[var70];
                                if (var81 != -1) {
                                    arg1.method494(var77, var78, var79, var74, var75, var76, arg7[var71], arg7[var72], arg7[var73], class643.method3580(var45.field3582[var71], var81, 0), class643.method3580(var45.field3582[var72], var81, 0), class643.method3580(var45.field3582[var73], var81, 0));
                                }
                            } else {
                                if (this.method1087(super.field2350.field9050.method588(-26679, var80).field3803)) {
                                    arg1.field801 = 100;
                                }
                                arg1.method495(var77, var78, var79, var74, var75, var76, arg7[var71], arg7[var72], arg7[var73], var45.field3582[var71], var45.field3582[var72], var45.field3582[var73], var61, var64, var67, var62, var65, var68, var63, var66, var69, var80);
                                arg1.field801 = 0;
                            }
                        }
                    }
                } else {
                    for (int var82 = 0; var82 < var45.field3587; ++var82) {
                        short var83 = var45.field3584[var82];
                        short var84 = var45.field3585[var82];
                        short var85 = var45.field3580[var82];
                        int var86 = arg6[var83];
                        int var87 = arg6[var84];
                        int var88 = arg6[var85];
                        int var89 = arg0[var83];
                        int var90 = arg0[var84];
                        int var91 = arg0[var85];
                        if ((-var87 + var86) * (-var90 + var91) + -((var89 - var90) * (-var87 + var88)) > 0) {
                            int var92 = var45.field3581[var82];
                            if (var92 != -1) {
                                arg1.field789 = ~var86 > -1 || ~var87 > -1 || var88 < 0 || arg1.field787 < var86 || ~var87 < ~arg1.field787 || arg1.field787 < var88;
                                arg1.method494(var89, var90, var91, var86, var87, var88, arg7[var83], arg7[var84], arg7[var85], class643.method3580(var45.field3582[var83], var92, 0), class643.method3580(var45.field3582[var84], var92, 0), class643.method3580(var45.field3582[var85], var92, 0));
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BII[III[II[[ZILbd;I)V", line = 1331)
    private final void method2510(byte arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int[] arg6, int arg7, boolean[][] arg8, int arg9, class56 arg10, int arg11) {
        ++field6168;
        int var13 = (-arg9 + arg4) * arg5 / 256;
        if (arg0 != 6) {
            this.method2506(28, (int[]) null, -12, 57, 6, 1, (int[]) null, (class56) null, -55, 98, 112, (boolean[][]) null);
        }
        int var14 = arg5 >> 8;
        boolean var15 = ((class581) super.field2350).field8117;
        super.field2350.method387(false);
        arg10.field798 = false;
        arg10.field796 = false;
        int var16 = arg2;
        int var17 = arg1 + var13;
        for (int var18 = arg7; ~arg11 < ~var18; ++var18) {
            for (int var19 = arg9; arg4 > var19; ++var19) {
                if (arg8[-arg7 + var18][-arg9 + var19]) {
                    if (super.field2338[var18][var19] != null) {
                        class596 var20 = super.field2338[var18][var19];
                        if (var20.field8278 != -1 && (2 & var20.field8280) == 0 && var20.field8281 == -1) {
                            int var21 = super.field2350.method811(var20.field8278);
                            arg10.method494(var17 - var14, -var14 + var17, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class643.method3580(var20.field8276 & 65535, var21, arg0 + -6), class643.method3580(var20.field8277 & 65535, var21, arg0 + -6), class643.method3580(var20.field8275 & 65535, var21, 0));
                            arg10.method494(var17, var17, -var14 + var17, var16, var14 + var16, var16, 100, 100, 100, class643.method3580(65535 & var20.field8279, var21, 0), class643.method3580(var20.field8275 & 65535, var21, 0), class643.method3580(var20.field8277 & 65535, var21, 0));
                        } else if (var20.field8281 == -1) {
                            arg10.method494(-var14 + var17, -var14 + var17, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field8276 & 65535, var20.field8277 & 65535, var20.field8275 & 65535);
                            arg10.method494(var17, var17, -var14 + var17, var16, var14 + var16, var16, 100, 100, 100, var20.field8279 & 65535, var20.field8275 & 65535, 65535 & var20.field8277);
                        } else {
                            int var22 = var20.field8281;
                            arg10.method494(-var14 + var17, var17 - var14, var17, var16 - -var14, var16, var16 - -var14, 100, 100, 100, var22, var22, var22);
                            arg10.method494(var17, var17, -var14 + var17, var16, var14 + var16, var16, 100, 100, 100, var22, var22, var22);
                        }
                    } else if (super.field2332[var18][var19] != null) {
                        class254 var23 = super.field2332[var18][var19];
                        for (int var24 = 0; var24 < var23.field3579; ++var24) {
                            arg3[var24] = var23.field3578[var24] * var14 / super.field1919 + var16;
                            arg6[var24] = -(var23.field3586[var24] * var14 / super.field1919) + var17;
                        }
                        for (int var25 = 0; ~var23.field3587 < ~var25; ++var25) {
                            short var26 = var23.field3584[var25];
                            short var27 = var23.field3585[var25];
                            short var28 = var23.field3580[var25];
                            int var29 = arg3[var26];
                            int var30 = arg3[var27];
                            int var31 = arg3[var28];
                            int var32 = arg6[var26];
                            int var33 = arg6[var27];
                            int var34 = arg6[var28];
                            if (var23.field3588 != null && var23.field3588[var25] != -1) {
                                int var35 = var23.field3588[var25];
                                arg10.method494(var32, var33, var34, var29, var30, var31, 100, 100, 100, class643.method3580(var23.field3582[var26], var35, 0), class643.method3580(var23.field3582[var27], var35, 0), class643.method3580(var23.field3582[var28], var35, 0));
                            } else if (var23.field3583 != null && ~var23.field3583[var25] != 0) {
                                int var36 = super.field2350.method811(var23.field3583[var25]);
                                arg10.method494(var32, var33, var34, var29, var30, var31, 100, 100, 100, class643.method3580(var23.field3582[var26], var36, 0), class643.method3580(var23.field3582[var27], var36, 0), class643.method3580(var23.field3582[var28], var36, 0));
                            } else {
                                int var37 = var23.field3581[var25];
                                arg10.method494(var32, var33, var34, var29, var30, var31, 100, 100, 100, class643.method3580(var23.field3582[var26], var37, arg0 ^ 6), class643.method3580(var23.field3582[var27], var37, arg0 ^ 6), class643.method3580(var23.field3582[var28], var37, 0));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var16 += var14;
            var17 = arg1 + var13;
        }
        arg10.field796 = true;
        super.field2350.method387(var15);
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)V", line = 1477)
    public static void method2511(int arg0) {
        field6164 = null;
        if (arg0 < 114) {
            field6165 = -127;
        }
        field6171 = null;
        field6167 = null;
    }
}
