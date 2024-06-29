import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class547 extends class751 {

    @OriginalMember(owner = "client!tda", name = "J", descriptor = "I")
    private int field8019 = -1;

    @OriginalMember(owner = "client!tda", name = "C", descriptor = "Led;")
    private class59 field8009;

    @OriginalMember(owner = "client!tda", name = "q", descriptor = "I")
    private int field8003;

    @OriginalMember(owner = "client!tda", name = "G", descriptor = "[[B")
    private byte[][] field8018;

    @OriginalMember(owner = "client!tda", name = "z", descriptor = "[[B")
    private byte[][] field7999;

    @OriginalMember(owner = "client!tda", name = "u", descriptor = "F")
    private float field8000;

    @OriginalMember(owner = "client!tda", name = "s", descriptor = "F")
    private float field8002;

    @OriginalMember(owner = "client!tda", name = "E", descriptor = "F")
    private float field8004;

    @OriginalMember(owner = "client!tda", name = "w", descriptor = "F")
    private float field8005;

    @OriginalMember(owner = "client!tda", name = "o", descriptor = "F")
    private float field8006;

    @OriginalMember(owner = "client!tda", name = "v", descriptor = "F")
    private float field8007;

    @OriginalMember(owner = "client!tda", name = "D", descriptor = "F")
    private float field8010;

    @OriginalMember(owner = "client!tda", name = "A", descriptor = "F")
    private float field8011;

    @OriginalMember(owner = "client!tda", name = "t", descriptor = "F")
    private float field8013;

    @OriginalMember(owner = "client!tda", name = "H", descriptor = "F")
    private float field8014;

    @OriginalMember(owner = "client!tda", name = "F", descriptor = "F")
    private float field8015;

    @OriginalMember(owner = "client!tda", name = "B", descriptor = "F")
    private float field8020;

    @OriginalMember(owner = "client!tda", name = "K", descriptor = "[[Lpia;")
    private class370[][] field8017;

    @OriginalMember(owner = "client!tda", name = "r", descriptor = "[[Lok;")
    private class548[][] field8012;

    @OriginalMember(owner = "client!tda", name = "p", descriptor = "[[Lbc;")
    private class664[][] field8001;

    @OriginalMember(owner = "client!tda", name = "x", descriptor = "[[Lth;")
    private class704[][] field8008;

    @OriginalMember(owner = "client!tda", name = "y", descriptor = "[[Lib;")
    private class75[][] field8016;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIIIIII[[ZLnda;Ldj;[I[I)V", line = 5)
    private final void method4110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class536 arg8, class187 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field7773;
        this.field8009.method119(false);
        arg9.field2446 = false;
        arg9.field2439 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field8017[var18][var19] != null) {
                        class370 var20 = this.field8017[var18][var19];
                        if (var20.field5351 != -1 && (var20.field5350 & 2) == 0 && var20.field5352 == -1) {
                            int var21 = this.field8009.method634(var20.field5351);
                            arg9.method1544((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class738.method5355(2, var21, var20.field5354 & 65535), (float) class738.method5355(2, var21, var20.field5348 & 65535), (float) class738.method5355(2, var21, var20.field5349 & 65535));
                            arg9.method1544((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class738.method5355(2, var21, var20.field5353 & 65535), (float) class738.method5355(2, var21, var20.field5349 & 65535), (float) class738.method5355(2, var21, var20.field5348 & 65535));
                        } else if (var20.field5352 == -1) {
                            arg9.method1544((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) (var20.field5354 & 65535), (float) (var20.field5348 & 65535), (float) (var20.field5349 & 65535));
                            arg9.method1544((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var20.field5353 & 65535), (float) (var20.field5349 & 65535), (float) (var20.field5348 & 65535));
                        } else {
                            int var22 = var20.field5352;
                            arg9.method1544((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                            arg9.method1544((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                        }
                    } else if (this.field8008[var18][var19] != null) {
                        class704 var23 = this.field8008[var18][var19];
                        for (int var24 = 0; var24 < var23.field9846; ++var24) {
                            arg10[var24] = var23.field9835[var24] * var14 / super.field10690 + var16;
                            arg11[var24] = var17 - var23.field9841[var24] * var14 / super.field10690;
                        }
                        for (int var25 = 0; var25 < var23.field9839; ++var25) {
                            short var26 = var23.field9842[var25];
                            short var27 = var23.field9843[var25];
                            short var28 = var23.field9837[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field9836 != null && var23.field9836[var25] != -1) {
                                int var35 = var23.field9836[var25];
                                arg9.method1544((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class738.method5355(2, var35, var23.field9838[var26]), (float) class738.method5355(2, var35, var23.field9838[var27]), (float) class738.method5355(2, var35, var23.field9838[var28]));
                            } else if (var23.field9833 != null && var23.field9833[var25] != -1) {
                                int var36 = this.field8009.method634(var23.field9833[var25]);
                                arg9.method1544((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class738.method5355(2, var36, var23.field9838[var26]), (float) class738.method5355(2, var36, var23.field9838[var27]), (float) class738.method5355(2, var36, var23.field9838[var28]));
                            } else {
                                int var37 = var23.field9834[var25];
                                arg9.method1544((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class738.method5355(2, var37, var23.field9838[var26]), (float) class738.method5355(2, var37, var23.field9838[var27]), (float) class738.method5355(2, var37, var23.field9838[var28]));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field2446 = true;
        this.field8009.method119(var15);
    }

    @OriginalMember(owner = "client!tda", name = "ka", descriptor = "(III)V", line = 145)
    public final void method2478(int arg0, int arg1, int arg2) {
        if (this.field7999[arg0][arg1] < arg2) {
            this.field7999[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(III[[ZZI)V", line = 152)
    public final void method2476(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class660 var7 = this.field8009.field863;
        this.field8019 = -1;
        this.field8002 = var7.field9340;
        this.field8006 = var7.field9345;
        this.field8005 = var7.field9342;
        this.field8010 = var7.field9348;
        this.field8020 = var7.field9349;
        this.field8011 = var7.field9363;
        this.field8015 = var7.field9353;
        this.field8013 = var7.field9359;
        this.field8004 = var7.field9360;
        this.field8014 = var7.field9357;
        this.field8000 = var7.field9362;
        this.field8007 = var7.field9347;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field10701 && var11 >= 0 && var11 < super.field10703) {
                        this.method4112(var10, var11, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(III[[ZZII)V", line = 199)
    public final void method2471(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        class660 var8 = this.field8009.field863;
        this.field8019 = arg5;
        this.field8002 = var8.field9340;
        this.field8006 = var8.field9345;
        this.field8005 = var8.field9342;
        this.field8010 = var8.field9348;
        this.field8020 = var8.field9349;
        this.field8011 = var8.field9363;
        this.field8015 = var8.field9353;
        this.field8013 = var8.field9359;
        this.field8004 = var8.field9360;
        this.field8014 = var8.field9357;
        this.field8000 = var8.field9362;
        this.field8007 = var8.field9347;
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field10701 && var12 >= 0 && var12 < super.field10703) {
                        this.method4112(var11, var12, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(IIIIIII[[ZLnda;Ldj;[I[I)V", line = 244)
    private final void method4111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class536 arg8, class187 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field7773;
        this.field8009.method119(false);
        arg9.field2446 = false;
        arg9.field2439 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field8016 != null) {
                        if (this.field8016[var18][var19] != null) {
                            class75 var20 = this.field8016[var18][var19];
                            if (var20.field1077 != -1 && (var20.field1078 & 2) == 0 && var20.field1073 == 0) {
                                int var21 = this.field8009.method634(var20.field1077);
                                arg9.method1544((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class738.method5355(2, var21, var20.field1072), (float) class738.method5355(2, var21, var20.field1080), (float) class738.method5355(2, var21, var20.field1075));
                                arg9.method1544((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class738.method5355(2, var21, var20.field1071), (float) class738.method5355(2, var21, var20.field1075), (float) class738.method5355(2, var21, var20.field1080));
                            } else if (var20.field1073 == 0) {
                                arg9.method1562((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, var20.field1072, var20.field1080, var20.field1075);
                                arg9.method1562((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, var20.field1071, var20.field1075, var20.field1080);
                            } else {
                                int var22 = var20.field1073;
                                arg9.method1562((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, class13.method86(true, var22, var20.field1072 & -16777216), class13.method86(true, var22, var20.field1080 & -16777216), class13.method86(true, var22, var20.field1075 & -16777216));
                                arg9.method1562((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, class13.method86(true, var22, var20.field1071 & -16777216), class13.method86(true, var22, var20.field1075 & -16777216), class13.method86(true, var22, var20.field1080 & -16777216));
                            }
                        } else if (this.field8012[var18][var19] != null) {
                            class548 var23 = this.field8012[var18][var19];
                            for (int var24 = 0; var24 < var23.field8028; ++var24) {
                                arg10[var24] = var23.field8031[var24] * var14 / super.field10690 + var16;
                                arg11[var24] = var17 - var23.field8024[var24] * var14 / super.field10690;
                            }
                            for (int var25 = 0; var25 < var23.field8023; ++var25) {
                                int var26 = var25 * 3;
                                int var27 = var26 + 1;
                                int var28 = var27 + 1;
                                int var29 = arg10[var26];
                                int var30 = arg10[var27];
                                int var31 = arg10[var28];
                                int var32 = arg11[var26];
                                int var33 = arg11[var27];
                                int var34 = arg11[var28];
                                if (var23.field8022 != null && var23.field8022[var25] != 0 && (var23.field8026 == null || var23.field8026 != null && var23.field8026[var25] == -1)) {
                                    int var35 = var23.field8022[var25];
                                    arg9.method1562((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, class13.method86(true, var35, -16777216 - (var23.field8027[var26] & -16777216)), class13.method86(true, var35, -16777216 - (var23.field8027[var27] & -16777216)), class13.method86(true, var35, -16777216 - (var23.field8027[var28] & -16777216)));
                                } else if (var23.field8026 != null && var23.field8026[var25] != -1) {
                                    int var36 = this.field8009.method634(var23.field8026[var25]);
                                    arg9.method1544((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) var36, (float) var36, (float) var36);
                                } else {
                                    arg9.method1562((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, var23.field8027[var26], var23.field8027[var27], var23.field8027[var28]);
                                }
                            }
                        }
                    } else if (this.field8001[var18][var19] != null) {
                        class664 var37 = this.field8001[var18][var19];
                        for (int var38 = 0; var38 < var37.field9383; ++var38) {
                            arg10[var38] = var37.field9385[var38] * var14 / super.field10690 + var16;
                            arg11[var38] = var17 - var37.field9387[var38] * var14 / super.field10690;
                        }
                        for (int var39 = 0; var39 < var37.field9381; ++var39) {
                            int var40 = var39 * 3;
                            int var41 = var40 + 1;
                            int var42 = var41 + 1;
                            int var43 = arg10[var40];
                            int var44 = arg10[var41];
                            int var45 = arg10[var42];
                            int var46 = arg11[var40];
                            int var47 = arg11[var41];
                            int var48 = arg11[var42];
                            if (var37.field9388 != null && var37.field9388[var39] != 0) {
                                int var49 = var37.field9388[var39];
                                arg9.method1562((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                            } else {
                                arg9.method1562((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var37.field9382[var40], var37.field9382[var41], var37.field9382[var42]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field2446 = true;
        this.field8009.method119(var15);
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(III)V", line = 438)
    private final void method4112(int arg0, int arg1, int arg2) {
        class536 var4 = this.field8009.method633(Thread.currentThread());
        var4.field7805.field2443 = 0;
        if (this.field8016 != null) {
            this.method4114(arg0, arg1, var4.field7787, var4, var4.field7805, var4.field7789, var4.field7816, var4.field7819, var4.field7795, arg2);
        } else if (this.field8017 != null) {
            this.method4117(arg0, arg1, var4.field7805, var4.field7789, var4.field7816, var4.field7819, var4.field7795, arg2);
        } else {
            if (this.field8001 != null) {
                this.method4116(arg0, arg1, var4.field7787, var4, var4.field7805, var4.field7789, var4.field7816, var4.field7819, var4.field7795, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(I)Z", line = 454)
    private final boolean method4113(int arg0) {
        if ((this.field8003 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIIIIII[[Z)V", line = 470)
    public final void method2477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class536 var9 = this.field8009.method633(Thread.currentThread());
        class187 var10 = var9.field7805;
        var10.field2443 = 0;
        var10.field2450 = true;
        this.field8009.method225();
        if (this.field8016 == null && this.field8001 == null) {
            if (this.field8017 != null) {
                this.method4110(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field7789, var9.field7816);
            }
        } else {
            this.method4111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field7789, var9.field7816);
        }
    }

    @OriginalMember(owner = "client!tda", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 485)
    public final void method2479(class412 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(II)V", line = 490)
    public final void method2470(int arg0, int arg1) {
        this.method4112(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Led;IIII[[I[[II)V", line = 496)
    public class547(class59 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field8009 = arg0;
        this.field8003 = arg2;
        this.field8018 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field8009.field864 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field8009.field848 * var18 + this.field8009.field855 * var17 + this.field8009.field853 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field8018[var11][var10] = (byte) var20;
            }
        }
        this.field7999 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!tda", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 547)
    public final void method2480(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        boolean var15 = (this.field8003 & 32) == 0;
        if (this.field8016 == null && !var15) {
            this.field8016 = new class75[super.field10701][super.field10703];
            this.field8012 = new class548[super.field10701][super.field10703];
        } else if (this.field8001 == null && var15) {
            this.field8001 = new class664[super.field10701][super.field10703];
        } else if (this.field8017 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var16 = 0; var16 < arg6.length; ++var16) {
                if (arg6[var16] == -1) {
                    arg6[var16] = 0;
                } else {
                    arg6[var16] = class552.field8055[class750.method5429(100, arg6[var16]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var17 = 0; var17 < arg7.length; ++var17) {
                    if (arg7[var17] == -1) {
                        arg7[var17] = 0;
                    } else {
                        arg7[var17] = class552.field8055[class750.method5429(-89, arg7[var17]) & 65535] << 8 | 255;
                    }
                }
            }
            if (var15) {
                class664 var18 = new class664();
                var18.field9383 = (short) arg2.length;
                var18.field9381 = (short) (arg2.length / 3);
                var18.field9385 = new short[var18.field9383];
                var18.field9384 = new short[var18.field9383];
                var18.field9387 = new short[var18.field9383];
                var18.field9382 = new int[var18.field9383];
                var18.field9386 = new short[var18.field9383];
                var18.field9390 = new short[var18.field9383];
                var18.field9389 = new byte[var18.field9383];
                if (arg5 != null) {
                    var18.field9380 = new short[var18.field9383];
                }
                for (int var19 = 0; var19 < var18.field9383; ++var19) {
                    int var22 = arg2[var19];
                    int var23 = arg4[var19];
                    boolean var24 = false;
                    int var25;
                    if (var22 == 0 && var23 == 0) {
                        var25 = this.field8018[arg0][arg1] - this.field7999[arg0][arg1];
                    } else if (var22 == 0 && super.field10690 == var23) {
                        var25 = this.field8018[arg0][arg1 + 1] - this.field7999[arg0][arg1 + 1];
                    } else if (super.field10690 == var22 && super.field10690 == var23) {
                        var25 = this.field8018[arg0 + 1][arg1 + 1] - this.field7999[arg0 + 1][arg1 + 1];
                    } else if (super.field10690 == var22 && var23 == 0) {
                        var25 = this.field8018[arg0 + 1][arg1] - this.field7999[arg0 + 1][arg1];
                    } else {
                        int var26 = (this.field8018[arg0 + 1][arg1] - this.field7999[arg0 + 1][arg1]) * var22 + (this.field8018[arg0][arg1] - this.field7999[arg0][arg1]) * (super.field10690 - var22);
                        int var27 = (this.field8018[arg0 + 1][arg1 + 1] - this.field7999[arg0 + 1][arg1 + 1]) * var22 + (this.field8018[arg0][arg1 + 1] - this.field7999[arg0][arg1 + 1]) * (super.field10690 - var22);
                        var25 = (super.field10690 - var23) * var26 + var23 * var27 >> super.field10692 * 2;
                    }
                    int var28 = (arg0 << super.field10692) + var22;
                    int var29 = (arg1 << super.field10692) + var23;
                    var18.field9385[var19] = (short) var22;
                    var18.field9387[var19] = (short) var23;
                    var18.field9384[var19] = (short) (this.method5440((byte) 15, var28, var29) + (arg3 != null ? arg3[var19] : 0));
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (arg6[var19] == 0) {
                        var18.field9382[var19] = 0;
                        if (arg7 != null) {
                            var18.field9389[var19] = (byte) var25;
                        }
                    } else {
                        int var30 = 0;
                        if (arg5 != null) {
                            short var31 = var18.field9380[var19] = (short) arg5[var19];
                            if (arg11 != 0) {
                                var30 = var31 * 255 / arg11;
                                if (var30 < 0) {
                                    var30 = 0;
                                } else if (var30 > 255) {
                                    var30 = 255;
                                }
                            }
                        }
                        int var32 = -16777216;
                        if (arg8[var19] != -1 && this.method4113(this.field8009.field237.method4500(-23641, arg8[var19]).field9605)) {
                            var32 = -1694498816;
                        }
                        var18.field9382[var19] = var32 | class130.method1143(method4115(arg6[var19] >> 8, var25), 124, var30, arg10);
                        if (arg7 != null) {
                            var18.field9389[var19] = (byte) var25;
                        }
                    }
                    var18.field9386[var19] = (short) arg8[var19];
                    var18.field9390[var19] = (short) arg9[var19];
                }
                if (arg7 != null) {
                    var18.field9388 = new int[var18.field9381];
                }
                for (int var20 = 0; var20 < var18.field9381; ++var20) {
                    int var21 = var20 * 3;
                    if (arg7 != null && arg7[var21] != 0) {
                        var18.field9388[var20] = -16777216 | arg7[var21] >> 8;
                    }
                }
                this.field8001[arg0][arg1] = var18;
            } else {
                boolean var33 = true;
                int var34 = -1;
                int var35 = -1;
                int var36 = -1;
                int var37 = -1;
                if (arg2.length == 6) {
                    for (int var38 = 0; var38 < 6; ++var38) {
                        if (arg2[var38] == 0 && arg4[var38] == 0) {
                            if (var34 != -1 && arg6[var34] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var34 = var38;
                        } else if (arg2[var38] == super.field10690 && arg4[var38] == 0) {
                            if (var35 != -1 && arg6[var35] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var35 = var38;
                        } else if (arg2[var38] == super.field10690 && arg4[var38] == super.field10690) {
                            if (var36 != -1 && arg6[var36] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var36 = var38;
                        } else if (arg2[var38] == 0 && arg4[var38] == super.field10690) {
                            if (var37 != -1 && arg6[var37] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var37 = var38;
                        }
                    }
                    if (var34 == -1 || var35 == -1 || var36 == -1 || var37 == -1) {
                        var33 = false;
                    }
                    if (var33) {
                        if (arg3 != null) {
                            for (int var39 = 0; var39 < 4; ++var39) {
                                if (arg3[var39] != 0) {
                                    var33 = false;
                                    break;
                                }
                            }
                        }
                        if (var33) {
                            for (int var40 = 1; var40 < 4; ++var40) {
                                if (arg2[var40] != arg2[0] && arg2[0] + super.field10690 != arg2[var40] && arg2[0] - super.field10690 != arg2[var40]) {
                                    var33 = false;
                                    break;
                                }
                                if (arg4[var40] != arg4[0] && arg4[0] + super.field10690 != arg4[var40] && arg4[0] - super.field10690 != arg4[var40]) {
                                    var33 = false;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    var33 = false;
                }
                if (var33) {
                    class75 var41 = new class75();
                    int var42 = arg6[0];
                    int var43 = arg8[0];
                    if (arg7 != null) {
                        var41.field1073 = arg7[0] >> 8;
                        if (var42 == 0) {
                            var41.field1078 = (byte) (var41.field1078 | 2);
                        }
                    } else if (var42 == 0) {
                        return;
                    }
                    if (super.field10693[arg0 + 1][arg1] == super.field10693[arg0][arg1] && super.field10693[arg0 + 1][arg1 + 1] == super.field10693[arg0][arg1] && super.field10693[arg0][arg1 + 1] == super.field10693[arg0][arg1]) {
                        var41.field1078 = (byte) (var41.field1078 | 1);
                    }
                    if (var43 != -1 && (var41.field1078 & 2) == 0 && !this.field8009.field237.method4500(-23641, var43).field9583) {
                        int var44;
                        if (arg5 != null && arg11 != 0) {
                            var44 = arg5[var34] * 255 / arg11;
                            if (var44 < 0) {
                                var44 = 0;
                            } else if (var44 > 255) {
                                var44 = 255;
                            }
                        } else {
                            var44 = 0;
                        }
                        var41.field1071 = class130.method1143(method4115(arg6[var34] >> 8, this.field8018[arg0][arg1] - this.field7999[arg0][arg1]), 82, var44, arg10);
                        if (var41.field1073 != 0) {
                            var41.field1071 |= 255 - (this.field8018[arg0][arg1] - this.field7999[arg0][arg1]) << 25;
                        }
                        int var45;
                        if (arg5 != null && arg11 != 0) {
                            var45 = arg5[var35] * 255 / arg11;
                            if (var45 < 0) {
                                var45 = 0;
                            } else if (var45 > 255) {
                                var45 = 255;
                            }
                        } else {
                            var45 = 0;
                        }
                        var41.field1075 = class130.method1143(method4115(arg6[var35] >> 8, this.field8018[arg0 + 1][arg1] - this.field7999[arg0 + 1][arg1]), 124, var45, arg10);
                        if (var41.field1073 != 0) {
                            var41.field1075 |= 255 - (this.field8018[arg0 + 1][arg1] - this.field7999[arg0 + 1][arg1]) << 25;
                        }
                        int var46;
                        if (arg5 != null && arg11 != 0) {
                            var46 = arg5[var36] * 255 / arg11;
                            if (var46 < 0) {
                                var46 = 0;
                            } else if (var46 > 255) {
                                var46 = 255;
                            }
                        } else {
                            var46 = 0;
                        }
                        var41.field1072 = class130.method1143(method4115(arg6[var36] >> 8, this.field8018[arg0 + 1][arg1 + 1] - this.field7999[arg0 + 1][arg1 + 1]), 31, var46, arg10);
                        if (var41.field1073 != 0) {
                            var41.field1072 |= 255 - (this.field8018[arg0 + 1][arg1 + 1] - this.field7999[arg0 + 1][arg1 + 1]) << 25;
                        }
                        int var47;
                        if (arg5 != null && arg11 != 0) {
                            var47 = arg5[var37] * 255 / arg11;
                            if (var47 < 0) {
                                var47 = 0;
                            } else if (var47 > 255) {
                                var47 = 255;
                            }
                        } else {
                            var47 = 0;
                        }
                        var41.field1080 = class130.method1143(method4115(arg6[var37] >> 8, this.field8018[arg0][arg1 + 1] - this.field7999[arg0][arg1 + 1]), 38, var47, arg10);
                        var41.field1077 = (short) var43;
                    } else {
                        int var48;
                        if (arg5 != null && arg11 != 0) {
                            var48 = arg5[var34] * 255 / arg11;
                            if (var48 < 0) {
                                var48 = 0;
                            } else if (var48 > 255) {
                                var48 = 255;
                            }
                        } else {
                            var48 = 0;
                        }
                        var41.field1071 = class130.method1143(method4115(arg6[var34] >> 8, this.field8018[arg0][arg1] - this.field7999[arg0][arg1]), 63, var48, arg10);
                        if (var41.field1073 != 0) {
                            var41.field1071 |= 255 - (this.field8018[arg0][arg1] - this.field7999[arg0][arg1]) << 25;
                        }
                        int var49;
                        if (arg5 != null && arg11 != 0) {
                            var49 = arg5[var35] * 255 / arg11;
                            if (var49 < 0) {
                                var49 = 0;
                            } else if (var49 > 255) {
                                var49 = 255;
                            }
                        } else {
                            var49 = 0;
                        }
                        var41.field1075 = class130.method1143(method4115(arg6[var35] >> 8, this.field8018[arg0 + 1][arg1] - this.field7999[arg0 + 1][arg1]), -109, var49, arg10);
                        if (var41.field1073 != 0) {
                            var41.field1075 |= 255 - (this.field8018[arg0 + 1][arg1] - this.field7999[arg0 + 1][arg1]) << 25;
                        }
                        int var50;
                        if (arg5 != null && arg11 != 0) {
                            var50 = arg5[var36] * 255 / arg11;
                            if (var50 < 0) {
                                var50 = 0;
                            } else if (var50 > 255) {
                                var50 = 255;
                            }
                        } else {
                            var50 = 0;
                        }
                        var41.field1072 = class130.method1143(method4115(arg6[var36] >> 8, this.field8018[arg0 + 1][arg1 + 1] - this.field7999[arg0 + 1][arg1 + 1]), 120, var50, arg10);
                        if (var41.field1073 != 0) {
                            var41.field1072 |= 255 - (this.field8018[arg0 + 1][arg1 + 1] - this.field7999[arg0 + 1][arg1 + 1]) << 25;
                        }
                        int var51;
                        if (arg5 != null && arg11 != 0) {
                            var51 = arg5[var37] * 255 / arg11;
                            if (var51 < 0) {
                                var51 = 0;
                            } else if (var51 > 255) {
                                var51 = 255;
                            }
                        } else {
                            var51 = 0;
                        }
                        var41.field1080 = class130.method1143(method4115(arg6[var37] >> 8, this.field8018[arg0][arg1 + 1] - this.field7999[arg0][arg1 + 1]), 90, var51, arg10);
                        if (var41.field1073 != 0) {
                            var41.field1080 |= 255 - (this.field8018[arg0][arg1 + 1] - this.field7999[arg0][arg1 + 1]) << 25;
                        }
                        var41.field1077 = -1;
                    }
                    if (arg5 != null) {
                        var41.field1079 = (short) arg5[var36];
                        var41.field1074 = (short) arg5[var37];
                        var41.field1081 = (short) arg5[var35];
                        var41.field1076 = (short) arg5[var34];
                    }
                    this.field8016[arg0][arg1] = var41;
                } else {
                    class548 var52 = new class548();
                    var52.field8028 = (short) arg2.length;
                    var52.field8023 = (short) (arg2.length / 3);
                    var52.field8031 = new short[var52.field8028];
                    var52.field8029 = new short[var52.field8028];
                    var52.field8024 = new short[var52.field8028];
                    var52.field8027 = new int[var52.field8028];
                    if (arg5 != null) {
                        var52.field8025 = new short[var52.field8028];
                    }
                    for (int var53 = 0; var53 < var52.field8028; ++var53) {
                        int var68 = arg2[var53];
                        int var69 = arg4[var53];
                        boolean var70 = false;
                        int var71;
                        if (var68 == 0 && var69 == 0) {
                            var71 = this.field8018[arg0][arg1] - this.field7999[arg0][arg1];
                        } else if (var68 == 0 && super.field10690 == var69) {
                            var71 = this.field8018[arg0][arg1 + 1] - this.field7999[arg0][arg1 + 1];
                        } else if (super.field10690 == var68 && super.field10690 == var69) {
                            var71 = this.field8018[arg0 + 1][arg1 + 1] - this.field7999[arg0 + 1][arg1 + 1];
                        } else if (super.field10690 == var68 && var69 == 0) {
                            var71 = this.field8018[arg0 + 1][arg1] - this.field7999[arg0 + 1][arg1];
                        } else {
                            int var72 = (this.field8018[arg0 + 1][arg1] - this.field7999[arg0 + 1][arg1]) * var68 + (this.field8018[arg0][arg1] - this.field7999[arg0][arg1]) * (super.field10690 - var68);
                            int var73 = (this.field8018[arg0 + 1][arg1 + 1] - this.field7999[arg0 + 1][arg1 + 1]) * var68 + (this.field8018[arg0][arg1 + 1] - this.field7999[arg0][arg1 + 1]) * (super.field10690 - var68);
                            var71 = (super.field10690 - var69) * var72 + var69 * var73 >> super.field10692 * 2;
                        }
                        int var74 = (arg0 << super.field10692) + var68;
                        int var75 = (arg1 << super.field10692) + var69;
                        var52.field8031[var53] = (short) var68;
                        var52.field8024[var53] = (short) var69;
                        var52.field8029[var53] = (short) (this.method5440((byte) 15, var74, var75) + (arg3 != null ? arg3[var53] : 0));
                        if (var71 < 0) {
                            var71 = 0;
                        }
                        if (arg6[var53] == 0) {
                            if (arg7 != null) {
                                var52.field8027[var53] = var71 << 25;
                            } else {
                                var52.field8027[var53] = 0;
                            }
                        } else {
                            int var76 = 0;
                            if (arg5 != null) {
                                short var77 = var52.field8025[var53] = (short) arg5[var53];
                                if (arg11 != 0) {
                                    var76 = var77 * 255 / arg11;
                                    if (var76 < 0) {
                                        var76 = 0;
                                    } else if (var76 > 255) {
                                        var76 = 255;
                                    }
                                }
                            }
                            var52.field8027[var53] = class130.method1143(method4115(arg6[var53] >> 8, var71), -127, var76, arg10);
                            if (arg7 != null) {
                                var52.field8027[var53] |= var71 << 25;
                            }
                        }
                    }
                    boolean var54 = false;
                    for (int var55 = 0; var55 < var52.field8023; ++var55) {
                        if (arg8[var55 * 3] != -1 && !this.field8009.field237.method4500(-23641, arg8[var55 * 3]).field9583) {
                            var54 = true;
                        }
                    }
                    if (arg7 != null) {
                        var52.field8022 = new int[var52.field8023];
                    }
                    if (var54) {
                        var52.field8026 = new short[var52.field8023];
                        var52.field8030 = new short[var52.field8023];
                    }
                    for (int var56 = 0; var56 < var52.field8023; ++var56) {
                        int var57 = var56 * 3;
                        if (arg7 != null && arg7[var57] != 0) {
                            var52.field8022[var56] = arg7[var57] >> 8;
                        }
                        if (var54) {
                            int var58 = var57 + 1;
                            int var59 = var58 + 1;
                            boolean var60 = false;
                            boolean var61 = true;
                            int var62 = arg8[var57];
                            if (var62 != -1 && !this.field8009.field237.method4500(-23641, var62).field9583) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var63 = arg8[var58];
                            if (var63 != -1 && !this.field8009.field237.method4500(-23641, var63).field9583) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var64 = arg8[var59];
                            if (var64 != -1 && !this.field8009.field237.method4500(-23641, var64).field9583) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            if (var61) {
                                var52.field8026[var56] = (short) var64;
                                var52.field8030[var56] = (short) arg9[var57];
                            } else {
                                if (var60) {
                                    int var65 = arg8[var57];
                                    if (var65 != -1 && !this.field8009.field237.method4500(-23641, var65).field9583) {
                                        var52.field8027[var57] = class552.field8055[class750.method5429(-124, this.field8009.field237.method4500(-23641, var65).field9596 & 65535) & 65535];
                                    }
                                    int var66 = arg8[var58];
                                    if (var66 != -1 && !this.field8009.field237.method4500(-23641, var66).field9583) {
                                        var52.field8027[var58] = class552.field8055[class750.method5429(100, this.field8009.field237.method4500(-23641, var66).field9596 & 65535) & 65535];
                                    }
                                    int var67 = arg8[var59];
                                    if (var67 != -1 && !this.field8009.field237.method4500(-23641, var67).field9583) {
                                        var52.field8027[var59] = class552.field8055[class750.method5429(-43, this.field8009.field237.method4500(-23641, var67).field9596 & 65535) & 65535];
                                    }
                                }
                                var52.field8026[var56] = -1;
                            }
                        }
                    }
                    this.field8012[arg0][arg1] = var52;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(IIZLnda;Ldj;[I[I[I[II)V", line = 1250)
    private final void method4114(int arg0, int arg1, boolean arg2, class536 arg3, class187 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class75 var11 = this.field8016[arg0][arg1];
        if (var11 != null) {
            if ((var11.field1078 & 2) == 0) {
                if (arg9 != 0) {
                    if ((var11.field1078 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                int var12 = super.field10690 * arg0;
                int var13 = super.field10690 + var12;
                int var14 = super.field10690 * arg1;
                int var15 = super.field10690 + var14;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                float var22;
                float var23;
                float var24;
                float var25;
                int var33;
                int var35;
                int var37;
                int var39;
                int var41;
                int var43;
                int var45;
                int var47;
                if ((var11.field1078 & 1) != 0 && !arg2) {
                    int var20 = super.field10693[arg0][arg1];
                    float var21 = (float) var20 * this.field8014;
                    if (this.field8019 == -1) {
                        var22 = (float) var14 * this.field8000 + (float) var12 * this.field8004 + var21 + this.field8007;
                        if (var22 <= (float) this.field8009.field842) {
                            return;
                        }
                        var23 = (float) var14 * this.field8000 + (float) var13 * this.field8004 + var21 + this.field8007;
                        if (var23 <= (float) this.field8009.field842) {
                            return;
                        }
                        var24 = (float) var15 * this.field8000 + (float) var13 * this.field8004 + var21 + this.field8007;
                        if (var24 <= (float) this.field8009.field842) {
                            return;
                        }
                        var25 = (float) var15 * this.field8000 + (float) var12 * this.field8004 + var21 + this.field8007;
                        if (var25 <= (float) this.field8009.field842) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field8000 + (float) var12 * this.field8004 + var21 + this.field8007;
                        var23 = (float) var14 * this.field8000 + (float) var13 * this.field8004 + var21 + this.field8007;
                        var24 = (float) var15 * this.field8000 + (float) var13 * this.field8004 + var21 + this.field8007;
                        var25 = (float) var15 * this.field8000 + (float) var12 * this.field8004 + var21 + this.field8007;
                    }
                    if (arg3.field7779) {
                        int var26 = (int) (var22 - (float) arg3.field7778);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field7778);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field7778);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                        int var29 = (int) (var25 - (float) arg3.field7778);
                        if (var29 > 0) {
                            var19 = var29;
                            if (var29 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    float var30 = (float) var20 * this.field8006;
                    float var31 = (float) var20 * this.field8011;
                    if (this.field8019 == -1) {
                        float var32 = (float) var14 * this.field8005 + (float) var12 * this.field8002 + var30 + this.field8010;
                        var33 = (int) ((float) this.field8009.field839 * var32 / var22) + arg4.field2442;
                        float var34 = (float) var14 * this.field8015 + (float) var12 * this.field8020 + var31 + this.field8013;
                        var35 = (int) ((float) this.field8009.field859 * var34 / var22) + arg4.field2452;
                        float var36 = (float) var14 * this.field8005 + (float) var13 * this.field8002 + var30 + this.field8010;
                        var37 = (int) ((float) this.field8009.field839 * var36 / var23) + arg4.field2442;
                        float var38 = (float) var14 * this.field8015 + (float) var13 * this.field8020 + var31 + this.field8013;
                        var39 = (int) ((float) this.field8009.field859 * var38 / var23) + arg4.field2452;
                        float var40 = (float) var15 * this.field8005 + (float) var13 * this.field8002 + var30 + this.field8010;
                        var41 = (int) ((float) this.field8009.field839 * var40 / var24) + arg4.field2442;
                        float var42 = (float) var15 * this.field8015 + (float) var13 * this.field8020 + var31 + this.field8013;
                        var43 = (int) ((float) this.field8009.field859 * var42 / var24) + arg4.field2452;
                        float var44 = (float) var15 * this.field8005 + (float) var12 * this.field8002 + var30 + this.field8010;
                        var45 = (int) ((float) this.field8009.field839 * var44 / var25) + arg4.field2442;
                        float var46 = (float) var15 * this.field8015 + (float) var12 * this.field8020 + var31 + this.field8013;
                        var47 = (int) ((float) this.field8009.field859 * var46 / var25) + arg4.field2452;
                    } else {
                        float var48 = (float) var14 * this.field8005 + (float) var12 * this.field8002 + var30 + this.field8010;
                        var33 = (int) ((float) this.field8009.field839 * var48 / (float) this.field8019) + arg4.field2442;
                        float var49 = (float) var14 * this.field8015 + (float) var12 * this.field8020 + var31 + this.field8013;
                        var35 = (int) ((float) this.field8009.field859 * var49 / (float) this.field8019) + arg4.field2452;
                        float var50 = (float) var14 * this.field8005 + (float) var13 * this.field8002 + var30 + this.field8010;
                        var37 = (int) ((float) this.field8009.field839 * var50 / (float) this.field8019) + arg4.field2442;
                        float var51 = (float) var14 * this.field8015 + (float) var13 * this.field8020 + var31 + this.field8013;
                        var39 = (int) ((float) this.field8009.field859 * var51 / (float) this.field8019) + arg4.field2452;
                        float var52 = (float) var15 * this.field8005 + (float) var13 * this.field8002 + var30 + this.field8010;
                        var41 = (int) ((float) this.field8009.field839 * var52 / (float) this.field8019) + arg4.field2442;
                        float var53 = (float) var15 * this.field8015 + (float) var13 * this.field8020 + var31 + this.field8013;
                        var43 = (int) ((float) this.field8009.field859 * var53 / (float) this.field8019) + arg4.field2452;
                        float var54 = (float) var15 * this.field8005 + (float) var12 * this.field8002 + var30 + this.field8010;
                        var45 = (int) ((float) this.field8009.field839 * var54 / (float) this.field8019) + arg4.field2442;
                        float var55 = (float) var15 * this.field8015 + (float) var12 * this.field8020 + var31 + this.field8013;
                        var47 = (int) ((float) this.field8009.field859 * var55 / (float) this.field8019) + arg4.field2452;
                    }
                } else {
                    int var56 = super.field10693[arg0][arg1];
                    int var57 = super.field10693[arg0 + 1][arg1];
                    int var58 = super.field10693[arg0 + 1][arg1 + 1];
                    int var59 = super.field10693[arg0][arg1 + 1];
                    if (this.field8019 == -1) {
                        var22 = (float) var14 * this.field8000 + (float) var12 * this.field8004 + (float) var56 * this.field8014 + this.field8007;
                        if (var22 <= (float) this.field8009.field842) {
                            return;
                        }
                        var23 = (float) var14 * this.field8000 + (float) var13 * this.field8004 + (float) var57 * this.field8014 + this.field8007;
                        if (var23 <= (float) this.field8009.field842) {
                            return;
                        }
                        var24 = (float) var15 * this.field8000 + (float) var13 * this.field8004 + (float) var58 * this.field8014 + this.field8007;
                        if (var24 <= (float) this.field8009.field842) {
                            return;
                        }
                        var25 = (float) var15 * this.field8000 + (float) var12 * this.field8004 + (float) var59 * this.field8014 + this.field8007;
                        if (var25 <= (float) this.field8009.field842) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field8000 + (float) var12 * this.field8004 + (float) var56 * this.field8014 + this.field8007;
                        var23 = (float) var14 * this.field8000 + (float) var13 * this.field8004 + (float) var57 * this.field8014 + this.field8007;
                        var24 = (float) var15 * this.field8000 + (float) var13 * this.field8004 + (float) var58 * this.field8014 + this.field8007;
                        var25 = (float) var15 * this.field8000 + (float) var12 * this.field8004 + (float) var59 * this.field8014 + this.field8007;
                    }
                    if (arg2) {
                        int var60 = (int) (var22 - (float) arg3.field7778);
                        if (var60 > 255) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var16 = var60;
                            int var61 = var11.field1076 * var60 / 255;
                            if (var61 > 0) {
                                var56 -= var61;
                            }
                        }
                        int var62 = (int) (var23 - (float) arg3.field7778);
                        if (var62 > 255) {
                            var62 = 255;
                        }
                        if (var62 > 0) {
                            var17 = var62;
                            int var63 = var11.field1081 * var62 / 255;
                            if (var63 > 0) {
                                var57 -= var63;
                            }
                        }
                        int var64 = (int) (var24 - (float) arg3.field7778);
                        if (var64 > 255) {
                            var64 = 255;
                        }
                        if (var64 > 0) {
                            var18 = var64;
                            int var65 = var11.field1079 * var64 / 255;
                            if (var65 > 0) {
                                var58 -= var65;
                            }
                        }
                        int var66 = (int) (var25 - (float) arg3.field7778);
                        if (var66 > 255) {
                            var66 = 255;
                        }
                        if (var66 > 0) {
                            var19 = var66;
                            int var67 = var11.field1074 * var66 / 255;
                            if (var67 > 0) {
                                var59 -= var67;
                            }
                        }
                    } else if (arg3.field7779) {
                        int var68 = (int) (var22 - (float) arg3.field7778);
                        if (var68 > 0) {
                            var16 = var68;
                            if (var68 > 255) {
                                var16 = 255;
                            }
                        }
                        int var69 = (int) (var23 - (float) arg3.field7778);
                        if (var69 > 0) {
                            var17 = var69;
                            if (var69 > 255) {
                                var17 = 255;
                            }
                        }
                        int var70 = (int) (var24 - (float) arg3.field7778);
                        if (var70 > 0) {
                            var18 = var70;
                            if (var70 > 255) {
                                var18 = 255;
                            }
                        }
                        int var71 = (int) (var25 - (float) arg3.field7778);
                        if (var71 > 0) {
                            var19 = var71;
                            if (var71 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    if (this.field8019 == -1) {
                        float var72 = (float) var14 * this.field8005 + (float) var12 * this.field8002 + (float) var56 * this.field8006 + this.field8010;
                        var33 = (int) ((float) this.field8009.field839 * var72 / var22) + arg4.field2442;
                        float var73 = (float) var14 * this.field8015 + (float) var12 * this.field8020 + (float) var56 * this.field8011 + this.field8013;
                        var35 = (int) ((float) this.field8009.field859 * var73 / var22) + arg4.field2452;
                        float var74 = (float) var14 * this.field8005 + (float) var13 * this.field8002 + (float) var57 * this.field8006 + this.field8010;
                        var37 = (int) ((float) this.field8009.field839 * var74 / var23) + arg4.field2442;
                        float var75 = (float) var14 * this.field8015 + (float) var13 * this.field8020 + (float) var57 * this.field8011 + this.field8013;
                        var39 = (int) ((float) this.field8009.field859 * var75 / var23) + arg4.field2452;
                        float var76 = (float) var15 * this.field8005 + (float) var13 * this.field8002 + (float) var58 * this.field8006 + this.field8010;
                        var41 = (int) ((float) this.field8009.field839 * var76 / var24) + arg4.field2442;
                        float var77 = (float) var15 * this.field8015 + (float) var13 * this.field8020 + (float) var58 * this.field8011 + this.field8013;
                        var43 = (int) ((float) this.field8009.field859 * var77 / var24) + arg4.field2452;
                        float var78 = (float) var15 * this.field8005 + (float) var12 * this.field8002 + (float) var59 * this.field8006 + this.field8010;
                        var45 = (int) ((float) this.field8009.field839 * var78 / var25) + arg4.field2442;
                        float var79 = (float) var15 * this.field8015 + (float) var12 * this.field8020 + (float) var59 * this.field8011 + this.field8013;
                        var47 = (int) ((float) this.field8009.field859 * var79 / var25) + arg4.field2452;
                    } else {
                        float var80 = (float) var14 * this.field8005 + (float) var12 * this.field8002 + (float) var56 * this.field8006 + this.field8010;
                        var33 = (int) ((float) this.field8009.field839 * var80 / (float) this.field8019) + arg4.field2442;
                        float var81 = (float) var14 * this.field8015 + (float) var12 * this.field8020 + (float) var56 * this.field8011 + this.field8013;
                        var35 = (int) ((float) this.field8009.field859 * var81 / (float) this.field8019) + arg4.field2452;
                        float var82 = (float) var14 * this.field8005 + (float) var13 * this.field8002 + (float) var57 * this.field8006 + this.field8010;
                        var37 = (int) ((float) this.field8009.field839 * var82 / (float) this.field8019) + arg4.field2442;
                        float var83 = (float) var14 * this.field8015 + (float) var13 * this.field8020 + (float) var57 * this.field8011 + this.field8013;
                        var39 = (int) ((float) this.field8009.field859 * var83 / (float) this.field8019) + arg4.field2452;
                        float var84 = (float) var15 * this.field8005 + (float) var13 * this.field8002 + (float) var58 * this.field8006 + this.field8010;
                        var41 = (int) ((float) this.field8009.field839 * var84 / (float) this.field8019) + arg4.field2442;
                        float var85 = (float) var15 * this.field8015 + (float) var13 * this.field8020 + (float) var58 * this.field8011 + this.field8013;
                        var43 = (int) ((float) this.field8009.field859 * var85 / (float) this.field8019) + arg4.field2452;
                        float var86 = (float) var15 * this.field8005 + (float) var12 * this.field8002 + (float) var59 * this.field8006 + this.field8010;
                        var45 = (int) ((float) this.field8009.field839 * var86 / (float) this.field8019) + arg4.field2442;
                        float var87 = (float) var15 * this.field8015 + (float) var12 * this.field8020 + (float) var59 * this.field8011 + this.field8013;
                        var47 = (int) ((float) this.field8009.field859 * var87 / (float) this.field8019) + arg4.field2452;
                    }
                }
                boolean var88 = var11.field1077 != -1 && this.method4113(this.field8009.field237.method4500(-23641, var11.field1077).field9605);
                if (this.field8019 == -1) {
                    int var89 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field2450 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field2445 || var45 > arg4.field2445 || var37 > arg4.field2445;
                        if (var89 < 765) {
                            if (var89 > 0) {
                                if (var11.field1077 >= 0) {
                                    int var90 = -16777216;
                                    if (var88) {
                                        var90 = -1694498816;
                                    }
                                    arg4.method1549((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field1072 & 16777215, var90 | var11.field1080 & 16777215, var90 | var11.field1075 & 16777215, arg3.field7775, var18, var19, var17, var11.field1077);
                                } else {
                                    if (var88) {
                                        arg4.field2443 = 100;
                                    }
                                    arg4.method1562((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class13.method86(true, var11.field1072, var18 << 24 | arg3.field7775), class13.method86(true, var11.field1080, var19 << 24 | arg3.field7775), class13.method86(true, var11.field1075, var17 << 24 | arg3.field7775));
                                    arg4.field2443 = 0;
                                }
                            } else if (var11.field1077 >= 0) {
                                int var91 = -16777216;
                                if (var88) {
                                    var91 = -1694498816;
                                }
                                arg4.method1549((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field1072 & 16777215, var91 | var11.field1080 & 16777215, var91 | var11.field1075 & 16777215, 0, 0, 0, 0, var11.field1077);
                            } else {
                                if (var88) {
                                    arg4.field2443 = 100;
                                }
                                arg4.method1562((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field1072, var11.field1080, var11.field1075);
                                arg4.field2443 = 0;
                            }
                        } else {
                            arg4.method1547((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field7775);
                        }
                    }
                    int var92 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field2450 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field2445 || var37 > arg4.field2445 || var45 > arg4.field2445;
                        if (var92 < 765) {
                            if (var88) {
                                arg4.field2443 = -1694498816;
                            }
                            if (var92 > 0) {
                                if (var11.field1077 >= 0) {
                                    int var93 = -16777216;
                                    if (var88) {
                                        var93 = -1694498816;
                                    }
                                    arg4.method1549((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field1071 & 16777215, var93 | var11.field1075 & 16777215, var93 | var11.field1080 & 16777215, arg3.field7775, var16, var17, var19, var11.field1077);
                                    return;
                                }
                                if (var88) {
                                    arg4.field2443 = 100;
                                }
                                arg4.method1562((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class13.method86(true, var11.field1071, var16 << 24 | arg3.field7775), class13.method86(true, var11.field1075, var17 << 24 | arg3.field7775), class13.method86(true, var11.field1080, var19 << 24 | arg3.field7775));
                                arg4.field2443 = 0;
                                return;
                            }
                            if (var11.field1077 >= 0) {
                                int var94 = -16777216;
                                if (var88) {
                                    var94 = -1694498816;
                                }
                                arg4.method1549((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field1071 & 16777215, var94 | var11.field1075 & 16777215, var94 | var11.field1080 & 16777215, 0, 0, 0, 0, var11.field1077);
                                return;
                            }
                            if (var88) {
                                arg4.field2443 = 100;
                            }
                            arg4.method1562((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field1071, var11.field1075, var11.field1080);
                            arg4.field2443 = 0;
                            return;
                        }
                        arg4.method1547((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field7775);
                        return;
                    }
                } else {
                    int var95 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field2450 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field2445 || var45 > arg4.field2445 || var37 > arg4.field2445;
                        if (var95 < 765) {
                            if (var88) {
                                arg4.field2443 = -1694498816;
                            }
                            if (var95 > 0) {
                                if (var11.field1077 >= 0) {
                                    int var96 = -16777216;
                                    if (var88) {
                                        var96 = -1694498816;
                                    }
                                    arg4.method1549((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field1072 & 16777215, var96 | var11.field1080 & 16777215, var96 | var11.field1075 & 16777215, arg3.field7775, var18, var19, var17, var11.field1077);
                                } else {
                                    if (var88) {
                                        arg4.field2443 = 100;
                                    }
                                    arg4.method1562((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class13.method86(true, var11.field1072, var18 << 24 | arg3.field7775), class13.method86(true, var11.field1080, var19 << 24 | arg3.field7775), class13.method86(true, var11.field1075, var17 << 24 | arg3.field7775));
                                    arg4.field2443 = 0;
                                }
                            } else if (var11.field1077 >= 0) {
                                int var97 = -16777216;
                                if (var88) {
                                    var97 = -1694498816;
                                }
                                arg4.method1549((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field1072 & 16777215, var97 | var11.field1080 & 16777215, var97 | var11.field1075 & 16777215, 0, 0, 0, 0, var11.field1077);
                            } else {
                                if (var88) {
                                    arg4.field2443 = 100;
                                }
                                arg4.method1562((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field1072, var11.field1080, var11.field1075);
                                arg4.field2443 = 0;
                            }
                        } else {
                            arg4.method1547((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field7775);
                        }
                    }
                    int var98 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field2450 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field2445 || var37 > arg4.field2445 || var45 > arg4.field2445;
                        if (var98 < 765) {
                            if (var88) {
                                arg4.field2443 = -1694498816;
                            }
                            if (var98 > 0) {
                                if (var11.field1077 >= 0) {
                                    int var99 = -16777216;
                                    if (var88) {
                                        var99 = -1694498816;
                                    }
                                    arg4.method1549((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field1071 & 16777215, var99 | var11.field1075 & 16777215, var99 | var11.field1080 & 16777215, arg3.field7775, var16, var17, var19, var11.field1077);
                                    return;
                                }
                                if (var88) {
                                    arg4.field2443 = 100;
                                }
                                arg4.method1562((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class13.method86(true, var11.field1071, var16 << 24 | arg3.field7775), class13.method86(true, var11.field1075, var17 << 24 | arg3.field7775), class13.method86(true, var11.field1080, var19 << 24 | arg3.field7775));
                                arg4.field2443 = 0;
                                return;
                            }
                            if (var11.field1077 >= 0) {
                                int var100 = -16777216;
                                if (var88) {
                                    var100 = -1694498816;
                                }
                                arg4.method1549((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field1071 & 16777215, var100 | var11.field1075 & 16777215, var100 | var11.field1080 & 16777215, 0, 0, 0, 0, var11.field1077);
                                return;
                            }
                            if (var88) {
                                arg4.field2443 = 100;
                            }
                            arg4.method1562((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field1071, var11.field1075, var11.field1080);
                            arg4.field2443 = 0;
                            return;
                        }
                        arg4.method1547((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field7775);
                    }
                }
            }
        } else {
            class548 var101 = this.field8012[arg0][arg1];
            if (var101 != null) {
                if (arg9 != 0) {
                    if ((var101.field8021 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                if (this.field8019 == -1) {
                    for (int var102 = 0; var102 < var101.field8028; ++var102) {
                        int var103 = (arg0 << super.field10692) + var101.field8031[var102];
                        int var104 = var101.field8029[var102];
                        int var105 = (arg1 << super.field10692) + var101.field8024[var102];
                        float var106 = (float) var105 * this.field8000 + (float) var103 * this.field8004 + (float) var104 * this.field8014 + this.field8007;
                        if (var106 <= (float) this.field8009.field842) {
                            return;
                        }
                        arg8[var102] = 0;
                        if (arg2) {
                            int var107 = (int) (var106 - (float) arg3.field7778);
                            if (var107 > 255) {
                                var107 = 255;
                            }
                            if (var107 > 0) {
                                arg8[var102] = var107;
                                int var108 = var101.field8025[var102] * var107 / 255;
                                if (var108 > 0) {
                                    var104 -= var108;
                                }
                            }
                        } else if (arg3.field7779) {
                            int var109 = (int) (var106 - (float) arg3.field7778);
                            if (var109 > 0) {
                                arg8[var102] = var109;
                                if (arg8[var102] > 255) {
                                    arg8[var102] = 255;
                                }
                            }
                        }
                        float var110 = (float) var105 * this.field8005 + (float) var103 * this.field8002 + (float) var104 * this.field8006 + this.field8010;
                        float var111 = (float) var105 * this.field8015 + (float) var103 * this.field8020 + (float) var104 * this.field8011 + this.field8013;
                        arg5[var102] = (int) ((float) this.field8009.field839 * var110 / var106) + arg4.field2442;
                        arg6[var102] = (int) ((float) this.field8009.field859 * var111 / var106) + arg4.field2452;
                        arg7[var102] = (int) var106;
                    }
                } else {
                    for (int var112 = 0; var112 < var101.field8028; ++var112) {
                        int var152 = (arg0 << super.field10692) + var101.field8031[var112];
                        int var153 = var101.field8029[var112];
                        int var154 = (arg1 << super.field10692) + var101.field8024[var112];
                        float var155 = (float) var154 * this.field8000 + (float) var152 * this.field8004 + (float) var153 * this.field8014 + this.field8007;
                        arg8[var112] = 0;
                        if (arg2) {
                            int var156 = this.field8019 - arg3.field7778;
                            if (var156 > 255) {
                                var156 = 255;
                            }
                            if (var156 > 0) {
                                arg8[var112] = var156;
                                int var157 = var101.field8025[var112] * var156 / 255;
                                if (var157 > 0) {
                                    var153 -= var157;
                                }
                            }
                        } else if (arg3.field7779) {
                            int var158 = this.field8019 - arg3.field7778;
                            if (var158 > 0) {
                                arg8[var112] = var158;
                                if (arg8[var112] > 255) {
                                    arg8[var112] = 255;
                                }
                            }
                        }
                        float var159 = (float) var154 * this.field8005 + (float) var152 * this.field8002 + (float) var153 * this.field8006 + this.field8010;
                        float var160 = (float) var154 * this.field8015 + (float) var152 * this.field8020 + (float) var153 * this.field8011 + this.field8013;
                        arg5[var112] = (int) ((float) this.field8009.field839 * var159 / (float) this.field8019) + arg4.field2442;
                        arg6[var112] = (int) ((float) this.field8009.field859 * var160 / (float) this.field8019) + arg4.field2452;
                        arg7[var112] = (int) var155;
                    }
                }
                if (var101.field8026 != null) {
                    if (this.field8019 == -1) {
                        for (int var113 = 0; var113 < var101.field8023; ++var113) {
                            int var114 = var113 * 3;
                            int var115 = var114 + 1;
                            int var116 = var115 + 1;
                            int var117 = arg5[var114];
                            int var118 = arg5[var115];
                            int var119 = arg5[var116];
                            int var120 = arg6[var114];
                            int var121 = arg6[var115];
                            int var122 = arg6[var116];
                            int var123 = arg8[var114] + arg8[var115] + arg8[var116];
                            if ((var117 - var118) * (var122 - var121) - (var119 - var118) * (var120 - var121) > 0) {
                                arg4.field2450 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field2445 || var118 > arg4.field2445 || var119 > arg4.field2445;
                                short var124 = var101.field8026[var113];
                                if (var123 < 765) {
                                    if (var123 > 0) {
                                        if (var124 != -1) {
                                            int var125 = -16777216;
                                            if (var124 != -1 && this.method4113(this.field8009.field237.method4500(-23641, var124).field9605)) {
                                                var125 = -1694498816;
                                            }
                                            arg4.method1549((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field8031[var114] / (float) super.field10690, (float) var101.field8031[var115] / (float) super.field10690, (float) var101.field8031[var116] / (float) super.field10690, (float) var101.field8024[var114] / (float) super.field10690, (float) var101.field8024[var115] / (float) super.field10690, (float) var101.field8024[var116] / (float) super.field10690, var125 | var101.field8027[var114] & 16777215, var125 | var101.field8027[var115] & 16777215, var125 | var101.field8027[var116] & 16777215, arg3.field7775, arg8[var114], arg8[var115], arg8[var116], var124);
                                        } else if ((var101.field8027[var114] & 16777215) != 0) {
                                            if (var124 != -1 && this.method4113(this.field8009.field237.method4500(-23641, var124).field9605)) {
                                                arg4.field2443 = -1694498816;
                                            }
                                            arg4.method1562((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], class13.method86(true, var101.field8027[var114], arg8[var114] << 24 | arg3.field7775), class13.method86(true, var101.field8027[var115], arg8[var115] << 24 | arg3.field7775), class13.method86(true, var101.field8027[var116], arg8[var116] << 24 | arg3.field7775));
                                            arg4.field2443 = 0;
                                        }
                                    } else if (var124 != -1) {
                                        int var126 = -16777216;
                                        if (var124 != -1 && this.method4113(this.field8009.field237.method4500(-23641, var124).field9605)) {
                                            var126 = -1694498816;
                                        }
                                        arg4.method1549((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field8031[var114] / (float) super.field10690, (float) var101.field8031[var115] / (float) super.field10690, (float) var101.field8031[var116] / (float) super.field10690, (float) var101.field8024[var114] / (float) super.field10690, (float) var101.field8024[var115] / (float) super.field10690, (float) var101.field8024[var116] / (float) super.field10690, var126 | var101.field8027[var114] & 16777215, var126 | var101.field8027[var115] & 16777215, var126 | var101.field8027[var116] & 16777215, 0, 0, 0, 0, var124);
                                    } else if ((var101.field8027[var114] & 16777215) != 0) {
                                        if (var124 != -1 && this.method4113(this.field8009.field237.method4500(-23641, var124).field9605)) {
                                            arg4.field2443 = -1694498816;
                                        }
                                        arg4.method1562((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], var101.field8027[var114], var101.field8027[var115], var101.field8027[var116]);
                                        arg4.field2443 = 0;
                                    }
                                } else {
                                    arg4.method1547((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], arg3.field7775);
                                }
                            }
                        }
                        return;
                    }
                    for (int var127 = 0; var127 < var101.field8023; ++var127) {
                        int var128 = var127 * 3;
                        int var129 = var128 + 1;
                        int var130 = var129 + 1;
                        int var131 = arg5[var128];
                        int var132 = arg5[var129];
                        int var133 = arg5[var130];
                        int var134 = arg6[var128];
                        int var135 = arg6[var129];
                        int var136 = arg6[var130];
                        int var137 = arg8[var128] + arg8[var129] + arg8[var130];
                        if ((var131 - var132) * (var136 - var135) - (var133 - var132) * (var134 - var135) > 0) {
                            arg4.field2450 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field2445 || var132 > arg4.field2445 || var133 > arg4.field2445;
                            short var138 = var101.field8026[var127];
                            if (var137 < 765) {
                                if (var138 != -1 && this.method4113(this.field8009.field237.method4500(-23641, var138).field9605)) {
                                    arg4.field2443 = -1694498816;
                                }
                                if (var137 > 0) {
                                    if (var138 != -1) {
                                        int var139 = -16777216;
                                        if (var138 != -1 && this.method4113(this.field8009.field237.method4500(-23641, var138).field9605)) {
                                            var139 = -1694498816;
                                        }
                                        arg4.method1549((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field8031[var128] / (float) super.field10690, (float) var101.field8031[var129] / (float) super.field10690, (float) var101.field8031[var130] / (float) super.field10690, (float) var101.field8024[var128] / (float) super.field10690, (float) var101.field8024[var129] / (float) super.field10690, (float) var101.field8024[var130] / (float) super.field10690, var139 | var101.field8027[var128] & 16777215, var139 | var101.field8027[var129] & 16777215, var139 | var101.field8027[var130] & 16777215, arg3.field7775, arg8[var128], arg8[var129], arg8[var130], var138);
                                    } else if ((var101.field8027[var128] & 16777215) != 0) {
                                        if (var138 != -1 && this.method4113(this.field8009.field237.method4500(-23641, var138).field9605)) {
                                            arg4.field2443 = -1694498816;
                                        }
                                        arg4.method1562((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], class13.method86(true, var101.field8027[var128], arg8[var128] << 24 | arg3.field7775), class13.method86(true, var101.field8027[var129], arg8[var129] << 24 | arg3.field7775), class13.method86(true, var101.field8027[var130], arg8[var130] << 24 | arg3.field7775));
                                        arg4.field2443 = 0;
                                    }
                                } else if (var138 != -1) {
                                    int var140 = -16777216;
                                    if (var138 != -1 && this.method4113(this.field8009.field237.method4500(-23641, var138).field9605)) {
                                        var140 = -1694498816;
                                    }
                                    arg4.method1549((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field8031[var128] / (float) super.field10690, (float) var101.field8031[var129] / (float) super.field10690, (float) var101.field8031[var130] / (float) super.field10690, (float) var101.field8024[var128] / (float) super.field10690, (float) var101.field8024[var129] / (float) super.field10690, (float) var101.field8024[var130] / (float) super.field10690, var140 | var101.field8027[var128] & 16777215, var140 | var101.field8027[var129] & 16777215, var140 | var101.field8027[var130] & 16777215, 0, 0, 0, 0, var138);
                                } else if ((var101.field8027[var128] & 16777215) != 0) {
                                    if (var138 != -1 && this.method4113(this.field8009.field237.method4500(-23641, var138).field9605)) {
                                        arg4.field2443 = -1694498816;
                                    }
                                    arg4.method1562((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], var101.field8027[var128], var101.field8027[var129], var101.field8027[var130]);
                                    arg4.field2443 = 0;
                                }
                                arg4.field2443 = 0;
                            } else {
                                arg4.method1547((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], arg3.field7775);
                            }
                        }
                    }
                    return;
                }
                for (int var141 = 0; var141 < var101.field8023; ++var141) {
                    int var142 = var141 * 3;
                    int var143 = var142 + 1;
                    int var144 = var143 + 1;
                    int var145 = arg5[var142];
                    int var146 = arg5[var143];
                    int var147 = arg5[var144];
                    int var148 = arg6[var142];
                    int var149 = arg6[var143];
                    int var150 = arg6[var144];
                    int var151 = arg8[var142] + arg8[var143] + arg8[var144];
                    if ((var145 - var146) * (var150 - var149) - (var147 - var146) * (var148 - var149) > 0) {
                        arg4.field2450 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field2445 || var146 > arg4.field2445 || var147 > arg4.field2445;
                        if (var151 < 765) {
                            if (var151 > 0) {
                                if ((var101.field8027[var142] & 16777215) != 0) {
                                    arg4.method1562((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], class130.method1143(var101.field8027[var142], 30, arg8[var142], arg3.field7775), class130.method1143(var101.field8027[var143], 65, arg8[var143], arg3.field7775), class130.method1143(var101.field8027[var144], 90, arg8[var144], arg3.field7775));
                                }
                            } else if ((var101.field8027[var142] & 16777215) != 0) {
                                arg4.method1562((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], var101.field8027[var142], var101.field8027[var143], var101.field8027[var144]);
                            }
                        } else {
                            arg4.method1547((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], arg3.field7775);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 2237)
    public final void method2472(class412 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(II)I", line = 2242)
    private static final int method4115(int arg0, int arg1) {
        int var2 = (arg0 & 16711680) * arg1 >> 23;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 253) {
            var2 = 253;
        }
        int var3 = (arg0 & 65280) * arg1 >> 15;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 253) {
            var3 = 253;
        }
        int var4 = (arg0 & 255) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 253) {
            var4 = 253;
        }
        return var2 << 16 | var3 << 8 | var4;
    }

    @OriginalMember(owner = "client!tda", name = "fa", descriptor = "(IILr;)Lr;", line = 2271)
    public final class412 method2475(int arg0, int arg1, class412 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 2274)
    public final boolean method2473(class412 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 2278)
    public final void method2474(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field8017 == null) {
            this.field8017 = new class370[super.field10701][super.field10703];
            this.field8008 = new class704[super.field10701][super.field10703];
        } else if (this.field8016 != null || this.field8001 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field10690 != var20 || var21 != 0 && super.field10690 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class704 var22 = new class704();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field9846 = var23;
            var22.field9838 = new short[var23];
            var22.field9835 = new short[var23];
            var22.field9840 = new short[var23];
            var22.field9841 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var32 = arg2[var25];
                int var33 = arg4[var25];
                if (var32 == 0 && var33 == 0) {
                    var22.field9838[var25] = (short) (this.field8018[arg0][arg1] - this.field7999[arg0][arg1]);
                } else if (var32 == 0 && super.field10690 == var33) {
                    var22.field9838[var25] = (short) (this.field8018[arg0][arg1 + 1] - this.field7999[arg0][arg1 + 1]);
                } else if (super.field10690 == var32 && super.field10690 == var33) {
                    var22.field9838[var25] = (short) (this.field8018[arg0 + 1][arg1 + 1] - this.field7999[arg0 + 1][arg1 + 1]);
                } else if (super.field10690 == var32 && var33 == 0) {
                    var22.field9838[var25] = (short) (this.field8018[arg0 + 1][arg1] - this.field7999[arg0 + 1][arg1]);
                } else {
                    int var34 = (this.field8018[arg0 + 1][arg1] - this.field7999[arg0 + 1][arg1]) * var32 + (this.field8018[arg0][arg1] - this.field7999[arg0][arg1]) * (super.field10690 - var32);
                    int var35 = (this.field8018[arg0 + 1][arg1 + 1] - this.field7999[arg0 + 1][arg1 + 1]) * var32 + (this.field8018[arg0][arg1 + 1] - this.field7999[arg0][arg1 + 1]) * (super.field10690 - var32);
                    var22.field9838[var25] = (short) ((super.field10690 - var33) * var34 + var33 * var35 >> super.field10692 * 2);
                }
                int var36 = (arg0 << super.field10692) + var32;
                int var37 = (arg1 << super.field10692) + var33;
                var22.field9835[var25] = (short) var32;
                var22.field9841[var25] = (short) var33;
                var22.field9840[var25] = (short) (this.method5440((byte) 15, var36, var37) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field9838[var25] < 2) {
                    var22.field9838[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                int var30 = arg11[var28];
                if (var30 != -1) {
                    class684 var31 = this.field8009.field237.method4500(-23641, var30);
                    if (!var31.field9583) {
                        var26 = true;
                        if (this.method4113(var31.field9605) || var31.field9598 != 0 || var31.field9592 != 0) {
                            var22.field9844 = (byte) (var22.field9844 | 4);
                        }
                    }
                }
            }
            var22.field9834 = new int[var27];
            if (arg10 != null) {
                var22.field9836 = new int[var27];
            }
            var22.field9842 = new short[var27];
            var22.field9843 = new short[var27];
            var22.field9837 = new short[var27];
            if (var26) {
                var22.field9833 = new short[var27];
                var22.field9845 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field9834[var22.field9839] = class750.method5429(120, arg9[var29]);
                    } else {
                        var22.field9834[var22.field9839] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field9836[var22.field9839] = class750.method5429(-56, arg10[var29]);
                        } else {
                            var22.field9836[var22.field9839] = -1;
                        }
                    }
                    var22.field9842[var22.field9839] = (short) arg6[var29];
                    var22.field9843[var22.field9839] = (short) arg7[var29];
                    var22.field9837[var22.field9839] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field8009.field237.method4500(-23641, arg11[var29]).field9583) {
                            var22.field9833[var22.field9839] = (short) arg11[var29];
                            var22.field9845[var22.field9839] = (short) arg12[var29];
                        } else {
                            var22.field9833[var22.field9839] = -1;
                        }
                    }
                    ++var22.field9839;
                }
            }
            this.field8008[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class370 var38 = new class370();
                int var39 = arg9[0];
                int var40 = arg11[0];
                if (arg10 != null) {
                    var38.field5352 = class738.method5355(2, class750.method5429(-23, arg10[0]), this.field8018[arg0][arg1] - this.field7999[arg0][arg1]);
                    if (var39 == -1) {
                        var38.field5350 = (byte) (var38.field5350 | 2);
                    }
                }
                if (super.field10693[arg0 + 1][arg1] == super.field10693[arg0][arg1] && super.field10693[arg0 + 1][arg1 + 1] == super.field10693[arg0][arg1] && super.field10693[arg0][arg1 + 1] == super.field10693[arg0][arg1]) {
                    var38.field5350 = (byte) (var38.field5350 | 1);
                }
                class684 var41 = null;
                if (var40 != -1) {
                    var41 = this.field8009.field237.method4500(-23641, var40);
                }
                if (var41 != null && (var38.field5350 & 2) == 0 && !var41.field9583) {
                    var38.field5353 = (short) (this.field8018[arg0][arg1] - this.field7999[arg0][arg1]);
                    var38.field5349 = (short) (this.field8018[arg0 + 1][arg1] - this.field7999[arg0 + 1][arg1]);
                    var38.field5354 = (short) (this.field8018[arg0 + 1][arg1 + 1] - this.field7999[arg0 + 1][arg1 + 1]);
                    var38.field5348 = (short) (this.field8018[arg0][arg1 + 1] - this.field7999[arg0][arg1 + 1]);
                    var38.field5351 = (short) var40;
                    if (this.method4113(var41.field9605) || var41.field9598 != 0 || var41.field9592 != 0) {
                        var38.field5350 = (byte) (var38.field5350 | 4);
                    }
                } else {
                    short var42 = class750.method5429(103, var39);
                    var38.field5353 = (short) class738.method5355(2, var42, this.field8018[arg0][arg1] - this.field7999[arg0][arg1]);
                    var38.field5349 = (short) class738.method5355(2, var42, this.field8018[arg0 + 1][arg1] - this.field7999[arg0 + 1][arg1]);
                    var38.field5354 = (short) class738.method5355(2, var42, this.field8018[arg0 + 1][arg1 + 1] - this.field7999[arg0 + 1][arg1 + 1]);
                    var38.field5348 = (short) class738.method5355(2, var42, this.field8018[arg0][arg1 + 1] - this.field7999[arg0][arg1 + 1]);
                    var38.field5351 = -1;
                }
                this.field8017[arg0][arg1] = var38;
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lta;[I)V", line = 2525)
    public final void method2481(class330 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIZLnda;Ldj;[I[I[I[II)V", line = 2530)
    private final void method4116(int arg0, int arg1, boolean arg2, class536 arg3, class187 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class664 var11 = this.field8001[arg0][arg1];
        if (arg9 == 0 || (arg9 & 2) == 0) {
            if (var11 != null) {
                if (this.field8019 == -1) {
                    for (int var12 = 0; var12 < var11.field9383; ++var12) {
                        int var13 = (arg0 << super.field10692) + var11.field9385[var12];
                        int var14 = var11.field9384[var12];
                        int var15 = (arg1 << super.field10692) + var11.field9387[var12];
                        float var16 = (float) var15 * this.field8000 + (float) var13 * this.field8004 + (float) var14 * this.field8014 + this.field8007;
                        if (var16 <= (float) this.field8009.field842) {
                            return;
                        }
                        arg8[var12] = 0;
                        if (arg2) {
                            int var17 = (int) (var16 - (float) arg3.field7778);
                            if (var17 > 255) {
                                var17 = 255;
                            }
                            if (var17 > 0) {
                                arg8[var12] = var17;
                                int var18 = var11.field9380[var12] * var17 / 255;
                                if (var18 > 0) {
                                    var14 -= var18;
                                }
                            }
                        } else if (arg3.field7779) {
                            int var19 = (int) (var16 - (float) arg3.field7778);
                            if (var19 > 0) {
                                arg8[var12] = var19;
                                if (arg8[var12] > 255) {
                                    arg8[var12] = 255;
                                }
                            }
                        }
                        float var20 = (float) var15 * this.field8005 + (float) var13 * this.field8002 + (float) var14 * this.field8006 + this.field8010;
                        float var21 = (float) var15 * this.field8015 + (float) var13 * this.field8020 + (float) var14 * this.field8011 + this.field8013;
                        arg5[var12] = (int) ((float) this.field8009.field839 * var20 / var16) + arg4.field2442;
                        arg6[var12] = (int) ((float) this.field8009.field859 * var21 / var16) + arg4.field2452;
                        arg7[var12] = (int) var16;
                    }
                } else {
                    for (int var22 = 0; var22 < var11.field9383; ++var22) {
                        int var36 = (arg0 << super.field10692) + var11.field9385[var22];
                        int var37 = var11.field9384[var22];
                        int var38 = (arg1 << super.field10692) + var11.field9387[var22];
                        float var39 = (float) var38 * this.field8000 + (float) var36 * this.field8004 + (float) var37 * this.field8014 + this.field8007;
                        arg8[var22] = 0;
                        if (arg2) {
                            int var40 = this.field8019 - arg3.field7778;
                            if (var40 > 255) {
                                var40 = 255;
                            }
                            if (var40 > 0) {
                                arg8[var22] = var40;
                                int var41 = var11.field9380[var22] * var40 / 255;
                                if (var41 > 0) {
                                    var37 -= var41;
                                }
                            }
                        } else if (arg3.field7779) {
                            int var42 = this.field8019 - arg3.field7778;
                            if (var42 > 0) {
                                arg8[var22] = var42;
                                if (arg8[var22] > 255) {
                                    arg8[var22] = 255;
                                }
                            }
                        }
                        float var43 = (float) var38 * this.field8005 + (float) var36 * this.field8002 + (float) var37 * this.field8006 + this.field8010;
                        float var44 = (float) var38 * this.field8015 + (float) var36 * this.field8020 + (float) var37 * this.field8011 + this.field8013;
                        arg5[var22] = (int) ((float) this.field8009.field839 * var43 / (float) this.field8019) + arg4.field2442;
                        arg6[var22] = (int) ((float) this.field8009.field859 * var44 / (float) this.field8019) + arg4.field2452;
                        arg7[var22] = (int) var39;
                    }
                }
                float var23 = (float) super.field10690;
                for (int var24 = 0; var24 < var11.field9381; ++var24) {
                    int var25 = var24 * 3;
                    int var26 = var25 + 1;
                    int var27 = var26 + 1;
                    int var28 = arg5[var25];
                    int var29 = arg5[var26];
                    int var30 = arg5[var27];
                    int var31 = arg6[var25];
                    int var32 = arg6[var26];
                    int var33 = arg6[var27];
                    if ((var28 - var29) * (var33 - var32) - (var30 - var29) * (var31 - var32) > 0) {
                        arg4.field2450 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field2445 || var29 > arg4.field2445 || var30 > arg4.field2445;
                        if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                            int var34 = arg0 << super.field10692;
                            int var35 = arg1 << super.field10692;
                            if ((var11.field9382[var25] & 16777215) != 0) {
                                if (var11.field9386[var25] == var11.field9386[var26] && var11.field9386[var25] == var11.field9386[var27] && var11.field9390[var25] == var11.field9390[var26] && var11.field9390[var25] == var11.field9390[var27]) {
                                    arg4.method1549((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field9385[var25] + var34) / (float) var11.field9390[var25], (float) (var11.field9385[var26] + var34) / (float) var11.field9390[var26], (float) (var11.field9385[var27] + var34) / (float) var11.field9390[var27], (float) (var11.field9387[var25] + var35) / (float) var11.field9390[var25], (float) (var11.field9387[var26] + var35) / (float) var11.field9390[var26], (float) (var11.field9387[var27] + var35) / (float) var11.field9390[var27], var11.field9382[var25], var11.field9382[var26], var11.field9382[var27], arg3.field7775, arg8[var25], arg8[var26], arg8[var27], var11.field9386[var25]);
                                } else {
                                    arg4.method1555((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field9385[var25] + var34) / var23, (float) (var11.field9385[var26] + var34) / var23, (float) (var11.field9385[var27] + var34) / var23, (float) (var11.field9387[var25] + var35) / var23, (float) (var11.field9387[var26] + var35) / var23, (float) (var11.field9387[var27] + var35) / var23, var11.field9382[var25], var11.field9382[var26], var11.field9382[var27], arg3.field7775, arg8[var25], arg8[var26], arg8[var27], var11.field9386[var25], var23 / (float) var11.field9390[var25], var11.field9386[var26], var23 / (float) var11.field9390[var26], var11.field9386[var27], var23 / (float) var11.field9390[var27]);
                                }
                            }
                        } else {
                            arg4.method1547((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], arg3.field7775);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IILdj;[I[I[I[II)V", line = 2723)
    private final void method4117(int arg0, int arg1, class187 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
        class370 var9 = this.field8017[arg0][arg1];
        if (var9 != null) {
            if ((var9.field5350 & 2) == 0) {
                if (arg7 != 0) {
                    if ((var9.field5350 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                int var10 = super.field10690 * arg0;
                int var11 = super.field10690 + var10;
                int var12 = super.field10690 * arg1;
                int var13 = super.field10690 + var12;
                float var16;
                float var17;
                float var18;
                float var19;
                int var23;
                int var25;
                int var27;
                int var29;
                int var31;
                int var33;
                int var35;
                int var37;
                if ((var9.field5350 & 1) != 0) {
                    int var14 = super.field10693[arg0][arg1];
                    float var15 = (float) var14 * this.field8014;
                    if (this.field8019 == -1) {
                        var16 = (float) var12 * this.field8000 + (float) var10 * this.field8004 + var15 + this.field8007;
                        if (var16 <= (float) this.field8009.field842) {
                            return;
                        }
                        var17 = (float) var12 * this.field8000 + (float) var11 * this.field8004 + var15 + this.field8007;
                        if (var17 <= (float) this.field8009.field842) {
                            return;
                        }
                        var18 = (float) var13 * this.field8000 + (float) var11 * this.field8004 + var15 + this.field8007;
                        if (var18 <= (float) this.field8009.field842) {
                            return;
                        }
                        var19 = (float) var13 * this.field8000 + (float) var10 * this.field8004 + var15 + this.field8007;
                        if (var19 <= (float) this.field8009.field842) {
                            return;
                        }
                    } else {
                        var16 = (float) var12 * this.field8000 + (float) var10 * this.field8004 + var15 + this.field8007;
                        var17 = (float) var12 * this.field8000 + (float) var11 * this.field8004 + var15 + this.field8007;
                        var18 = (float) var13 * this.field8000 + (float) var11 * this.field8004 + var15 + this.field8007;
                        var19 = (float) var13 * this.field8000 + (float) var10 * this.field8004 + var15 + this.field8007;
                    }
                    float var20 = (float) var14 * this.field8006;
                    float var21 = (float) var14 * this.field8011;
                    if (this.field8019 == -1) {
                        float var22 = (float) var12 * this.field8005 + (float) var10 * this.field8002 + var20 + this.field8010;
                        var23 = (int) ((float) this.field8009.field839 * var22 / var16) + arg2.field2442;
                        float var24 = (float) var12 * this.field8015 + (float) var10 * this.field8020 + var21 + this.field8013;
                        var25 = (int) ((float) this.field8009.field859 * var24 / var16) + arg2.field2452;
                        float var26 = (float) var12 * this.field8005 + (float) var11 * this.field8002 + var20 + this.field8010;
                        var27 = (int) ((float) this.field8009.field839 * var26 / var17) + arg2.field2442;
                        float var28 = (float) var12 * this.field8015 + (float) var11 * this.field8020 + var21 + this.field8013;
                        var29 = (int) ((float) this.field8009.field859 * var28 / var17) + arg2.field2452;
                        float var30 = (float) var13 * this.field8005 + (float) var11 * this.field8002 + var20 + this.field8010;
                        var31 = (int) ((float) this.field8009.field839 * var30 / var18) + arg2.field2442;
                        float var32 = (float) var13 * this.field8015 + (float) var11 * this.field8020 + var21 + this.field8013;
                        var33 = (int) ((float) this.field8009.field859 * var32 / var18) + arg2.field2452;
                        float var34 = (float) var13 * this.field8005 + (float) var10 * this.field8002 + var20 + this.field8010;
                        var35 = (int) ((float) this.field8009.field839 * var34 / var19) + arg2.field2442;
                        float var36 = (float) var13 * this.field8015 + (float) var10 * this.field8020 + var21 + this.field8013;
                        var37 = (int) ((float) this.field8009.field859 * var36 / var19) + arg2.field2452;
                    } else {
                        float var38 = (float) var12 * this.field8005 + (float) var10 * this.field8002 + var20 + this.field8010;
                        var23 = (int) ((float) this.field8009.field839 * var38 / (float) this.field8019) + arg2.field2442;
                        float var39 = (float) var12 * this.field8015 + (float) var10 * this.field8020 + var21 + this.field8013;
                        var25 = (int) ((float) this.field8009.field859 * var39 / (float) this.field8019) + arg2.field2452;
                        float var40 = (float) var12 * this.field8005 + (float) var11 * this.field8002 + var20 + this.field8010;
                        var27 = (int) ((float) this.field8009.field839 * var40 / (float) this.field8019) + arg2.field2442;
                        float var41 = (float) var12 * this.field8015 + (float) var11 * this.field8020 + var21 + this.field8013;
                        var29 = (int) ((float) this.field8009.field859 * var41 / (float) this.field8019) + arg2.field2452;
                        float var42 = (float) var13 * this.field8005 + (float) var11 * this.field8002 + var20 + this.field8010;
                        var31 = (int) ((float) this.field8009.field839 * var42 / (float) this.field8019) + arg2.field2442;
                        float var43 = (float) var13 * this.field8015 + (float) var11 * this.field8020 + var21 + this.field8013;
                        var33 = (int) ((float) this.field8009.field859 * var43 / (float) this.field8019) + arg2.field2452;
                        float var44 = (float) var13 * this.field8005 + (float) var10 * this.field8002 + var20 + this.field8010;
                        var35 = (int) ((float) this.field8009.field839 * var44 / (float) this.field8019) + arg2.field2442;
                        float var45 = (float) var13 * this.field8015 + (float) var10 * this.field8020 + var21 + this.field8013;
                        var37 = (int) ((float) this.field8009.field859 * var45 / (float) this.field8019) + arg2.field2452;
                    }
                } else {
                    int var46 = super.field10693[arg0][arg1];
                    int var47 = super.field10693[arg0 + 1][arg1];
                    int var48 = super.field10693[arg0 + 1][arg1 + 1];
                    int var49 = super.field10693[arg0][arg1 + 1];
                    if (this.field8019 == -1) {
                        var16 = (float) var12 * this.field8000 + (float) var10 * this.field8004 + (float) var46 * this.field8014 + this.field8007;
                        if (var16 <= (float) this.field8009.field842) {
                            return;
                        }
                        var17 = (float) var12 * this.field8000 + (float) var11 * this.field8004 + (float) var47 * this.field8014 + this.field8007;
                        if (var17 <= (float) this.field8009.field842) {
                            return;
                        }
                        var18 = (float) var13 * this.field8000 + (float) var11 * this.field8004 + (float) var48 * this.field8014 + this.field8007;
                        if (var18 <= (float) this.field8009.field842) {
                            return;
                        }
                        var19 = (float) var13 * this.field8000 + (float) var10 * this.field8004 + (float) var49 * this.field8014 + this.field8007;
                        if (var19 <= (float) this.field8009.field842) {
                            return;
                        }
                        float var50 = (float) var12 * this.field8005 + (float) var10 * this.field8002 + (float) var46 * this.field8006 + this.field8010;
                        var23 = (int) ((float) this.field8009.field839 * var50 / var16) + arg2.field2442;
                        float var51 = (float) var12 * this.field8015 + (float) var10 * this.field8020 + (float) var46 * this.field8011 + this.field8013;
                        var25 = (int) ((float) this.field8009.field859 * var51 / var16) + arg2.field2452;
                        float var52 = (float) var12 * this.field8005 + (float) var11 * this.field8002 + (float) var47 * this.field8006 + this.field8010;
                        var27 = (int) ((float) this.field8009.field839 * var52 / var17) + arg2.field2442;
                        float var53 = (float) var12 * this.field8015 + (float) var11 * this.field8020 + (float) var47 * this.field8011 + this.field8013;
                        var29 = (int) ((float) this.field8009.field859 * var53 / var17) + arg2.field2452;
                        float var54 = (float) var13 * this.field8005 + (float) var11 * this.field8002 + (float) var48 * this.field8006 + this.field8010;
                        var31 = (int) ((float) this.field8009.field839 * var54 / var18) + arg2.field2442;
                        float var55 = (float) var13 * this.field8015 + (float) var11 * this.field8020 + (float) var48 * this.field8011 + this.field8013;
                        var33 = (int) ((float) this.field8009.field859 * var55 / var18) + arg2.field2452;
                        float var56 = (float) var13 * this.field8005 + (float) var10 * this.field8002 + (float) var49 * this.field8006 + this.field8010;
                        var35 = (int) ((float) this.field8009.field839 * var56 / var19) + arg2.field2442;
                        float var57 = (float) var13 * this.field8015 + (float) var10 * this.field8020 + (float) var49 * this.field8011 + this.field8013;
                        var37 = (int) ((float) this.field8009.field859 * var57 / var19) + arg2.field2452;
                    } else {
                        var16 = (float) var12 * this.field8000 + (float) var10 * this.field8004 + (float) var46 * this.field8014 + this.field8007;
                        var17 = (float) var12 * this.field8000 + (float) var11 * this.field8004 + (float) var47 * this.field8014 + this.field8007;
                        var18 = (float) var13 * this.field8000 + (float) var11 * this.field8004 + (float) var48 * this.field8014 + this.field8007;
                        var19 = (float) var13 * this.field8000 + (float) var10 * this.field8004 + (float) var49 * this.field8014 + this.field8007;
                        float var58 = (float) var12 * this.field8005 + (float) var10 * this.field8002 + (float) var46 * this.field8006 + this.field8010;
                        var23 = (int) ((float) this.field8009.field839 * var58 / (float) this.field8019) + arg2.field2442;
                        float var59 = (float) var12 * this.field8015 + (float) var10 * this.field8020 + (float) var46 * this.field8011 + this.field8013;
                        var25 = (int) ((float) this.field8009.field859 * var59 / (float) this.field8019) + arg2.field2452;
                        float var60 = (float) var12 * this.field8005 + (float) var11 * this.field8002 + (float) var47 * this.field8006 + this.field8010;
                        var27 = (int) ((float) this.field8009.field839 * var60 / (float) this.field8019) + arg2.field2442;
                        float var61 = (float) var12 * this.field8015 + (float) var11 * this.field8020 + (float) var47 * this.field8011 + this.field8013;
                        var29 = (int) ((float) this.field8009.field859 * var61 / (float) this.field8019) + arg2.field2452;
                        float var62 = (float) var13 * this.field8005 + (float) var11 * this.field8002 + (float) var48 * this.field8006 + this.field8010;
                        var31 = (int) ((float) this.field8009.field839 * var62 / (float) this.field8019) + arg2.field2442;
                        float var63 = (float) var13 * this.field8015 + (float) var11 * this.field8020 + (float) var48 * this.field8011 + this.field8013;
                        var33 = (int) ((float) this.field8009.field859 * var63 / (float) this.field8019) + arg2.field2452;
                        float var64 = (float) var13 * this.field8005 + (float) var10 * this.field8002 + (float) var49 * this.field8006 + this.field8010;
                        var35 = (int) ((float) this.field8009.field839 * var64 / (float) this.field8019) + arg2.field2442;
                        float var65 = (float) var13 * this.field8015 + (float) var10 * this.field8020 + (float) var49 * this.field8011 + this.field8013;
                        var37 = (int) ((float) this.field8009.field859 * var65 / (float) this.field8019) + arg2.field2452;
                    }
                }
                if (this.field8019 == -1) {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field2450 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field2445 || var35 > arg2.field2445 || var27 > arg2.field2445;
                        if (var9.field5351 >= 0) {
                            arg2.method1549((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class552.field8055[var9.field5354 & 65535] & 16777215, -16777216 | class552.field8055[var9.field5348 & 65535] & 16777215, -16777216 | class552.field8055[var9.field5349 & 65535] & 16777215, 0, 0, 0, 0, var9.field5351);
                        } else {
                            arg2.method1544((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field5354 & 65535), (float) (var9.field5348 & 65535), (float) (var9.field5349 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field2450 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field2445 || var27 > arg2.field2445 || var35 > arg2.field2445;
                        if (var9.field5351 >= 0) {
                            arg2.method1549((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class552.field8055[var9.field5353 & 65535] & 16777215, -16777216 | class552.field8055[var9.field5349 & 65535] & 16777215, -16777216 | class552.field8055[var9.field5348 & 65535] & 16777215, 0, 0, 0, 0, var9.field5351);
                            return;
                        }
                        arg2.method1544((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field5353 & 65535), (float) (var9.field5349 & 65535), (float) (var9.field5348 & 65535));
                        return;
                    }
                } else {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field2450 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field2445 || var35 > arg2.field2445 || var27 > arg2.field2445;
                        if (var9.field5351 >= 0) {
                            arg2.method1549((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class552.field8055[var9.field5354 & 65535] & 16777215, -16777216 | class552.field8055[var9.field5348 & 65535] & 16777215, -16777216 | class552.field8055[var9.field5349 & 65535] & 16777215, 0, 0, 0, 0, var9.field5351);
                        } else {
                            arg2.method1544((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field5354 & 65535), (float) (var9.field5348 & 65535), (float) (var9.field5349 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field2450 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field2445 || var27 > arg2.field2445 || var35 > arg2.field2445;
                        if (var9.field5351 >= 0) {
                            arg2.method1549((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class552.field8055[var9.field5353 & 65535] & 16777215, -16777216 | class552.field8055[var9.field5349 & 65535] & 16777215, -16777216 | class552.field8055[var9.field5348 & 65535] & 16777215, 0, 0, 0, 0, var9.field5351);
                            return;
                        }
                        arg2.method1544((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field5353 & 65535), (float) (var9.field5349 & 65535), (float) (var9.field5348 & 65535));
                    }
                }
            }
        } else {
            class704 var66 = this.field8008[arg0][arg1];
            if (var66 != null) {
                if (arg7 != 0) {
                    if ((var66.field9844 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                if (this.field8019 == -1) {
                    for (int var67 = 0; var67 < var66.field9846; ++var67) {
                        int var68 = (arg0 << super.field10692) + var66.field9835[var67];
                        short var69 = var66.field9840[var67];
                        int var70 = (arg1 << super.field10692) + var66.field9841[var67];
                        float var71 = (float) var70 * this.field8000 + (float) var68 * this.field8004 + (float) var69 * this.field8014 + this.field8007;
                        if (var71 <= (float) this.field8009.field842) {
                            return;
                        }
                        float var72 = (float) var70 * this.field8005 + (float) var68 * this.field8002 + (float) var69 * this.field8006 + this.field8010;
                        float var73 = (float) var70 * this.field8015 + (float) var68 * this.field8020 + (float) var69 * this.field8011 + this.field8013;
                        arg3[var67] = (int) ((float) this.field8009.field839 * var72 / var71) + arg2.field2442;
                        arg4[var67] = (int) ((float) this.field8009.field859 * var73 / var71) + arg2.field2452;
                        arg5[var67] = (int) var71;
                    }
                } else {
                    for (int var74 = 0; var74 < var66.field9846; ++var74) {
                        int var110 = (arg0 << super.field10692) + var66.field9835[var74];
                        short var111 = var66.field9840[var74];
                        int var112 = (arg1 << super.field10692) + var66.field9841[var74];
                        float var113 = (float) var112 * this.field8000 + (float) var110 * this.field8004 + (float) var111 * this.field8014 + this.field8007;
                        float var114 = (float) var112 * this.field8005 + (float) var110 * this.field8002 + (float) var111 * this.field8006 + this.field8010;
                        float var115 = (float) var112 * this.field8015 + (float) var110 * this.field8020 + (float) var111 * this.field8011 + this.field8013;
                        arg3[var74] = (int) ((float) this.field8009.field839 * var114 / (float) this.field8019) + arg2.field2442;
                        arg4[var74] = (int) ((float) this.field8009.field859 * var115 / (float) this.field8019) + arg2.field2452;
                        arg5[var74] = (int) var113;
                    }
                }
                if (var66.field9833 != null) {
                    if (this.field8019 == -1) {
                        for (int var75 = 0; var75 < var66.field9839; ++var75) {
                            short var76 = var66.field9842[var75];
                            short var77 = var66.field9843[var75];
                            short var78 = var66.field9837[var75];
                            int var79 = arg3[var76];
                            int var80 = arg3[var77];
                            int var81 = arg3[var78];
                            int var82 = arg4[var76];
                            int var83 = arg4[var77];
                            int var84 = arg4[var78];
                            if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                                arg2.field2450 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field2445 || var80 > arg2.field2445 || var81 > arg2.field2445;
                                short var85 = var66.field9833[var75];
                                if (var85 != -1) {
                                    arg2.method1549((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) var66.field9835[var76] / (float) super.field10690, (float) var66.field9835[var77] / (float) super.field10690, (float) var66.field9835[var78] / (float) super.field10690, (float) var66.field9841[var76] / (float) super.field10690, (float) var66.field9841[var77] / (float) super.field10690, (float) var66.field9841[var78] / (float) super.field10690, -16777216 | class552.field8055[var66.field9838[var76] & 65535] & 16777215, -16777216 | class552.field8055[var66.field9838[var77] & 65535] & 16777215, -16777216 | class552.field8055[var66.field9838[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                                } else {
                                    int var86 = var66.field9834[var75];
                                    if (var86 != -1) {
                                        arg2.method1544((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) class738.method5355(2, var86, var66.field9838[var76]), (float) class738.method5355(2, var86, var66.field9838[var77]), (float) class738.method5355(2, var86, var66.field9838[var78]));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var87 = 0; var87 < var66.field9839; ++var87) {
                        short var88 = var66.field9842[var87];
                        short var89 = var66.field9843[var87];
                        short var90 = var66.field9837[var87];
                        int var91 = arg3[var88];
                        int var92 = arg3[var89];
                        int var93 = arg3[var90];
                        int var94 = arg4[var88];
                        int var95 = arg4[var89];
                        int var96 = arg4[var90];
                        if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                            arg2.field2450 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field2445 || var92 > arg2.field2445 || var93 > arg2.field2445;
                            short var97 = var66.field9833[var87];
                            if (var97 != -1) {
                                arg2.method1549((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) var66.field9835[var88] / (float) super.field10690, (float) var66.field9835[var89] / (float) super.field10690, (float) var66.field9835[var90] / (float) super.field10690, (float) var66.field9841[var88] / (float) super.field10690, (float) var66.field9841[var89] / (float) super.field10690, (float) var66.field9841[var90] / (float) super.field10690, -16777216 | class552.field8055[var66.field9838[var88] & 65535] & 16777215, -16777216 | class552.field8055[var66.field9838[var89] & 65535] & 16777215, -16777216 | class552.field8055[var66.field9838[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                            } else {
                                int var98 = var66.field9834[var87];
                                if (var98 != -1) {
                                    arg2.method1544((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) class738.method5355(2, var98, var66.field9838[var88]), (float) class738.method5355(2, var98, var66.field9838[var89]), (float) class738.method5355(2, var98, var66.field9838[var90]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var99 = 0; var99 < var66.field9839; ++var99) {
                    short var100 = var66.field9842[var99];
                    short var101 = var66.field9843[var99];
                    short var102 = var66.field9837[var99];
                    int var103 = arg3[var100];
                    int var104 = arg3[var101];
                    int var105 = arg3[var102];
                    int var106 = arg4[var100];
                    int var107 = arg4[var101];
                    int var108 = arg4[var102];
                    if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                        int var109 = var66.field9834[var99];
                        if (var109 != -1) {
                            arg2.field2450 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field2445 || var104 > arg2.field2445 || var105 > arg2.field2445;
                            arg2.method1544((float) var106, (float) var107, (float) var108, (float) var103, (float) var104, (float) var105, (float) arg5[var100], (float) arg5[var101], (float) arg5[var102], (float) class738.method5355(2, var109, var66.field9838[var100]), (float) class738.method5355(2, var109, var66.field9838[var101]), (float) class738.method5355(2, var109, var66.field9838[var102]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "YA", descriptor = "()V", line = 3199)
    public final void method2469() {
        this.field8018 = null;
        this.field7999 = null;
    }
}
