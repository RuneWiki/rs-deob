import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class470 extends class281 {

    @OriginalMember(owner = "client!so", name = "r", descriptor = "I")
    private int field6501 = -1;

    @OriginalMember(owner = "client!so", name = "y", descriptor = "Ljf;")
    private class217 field6508;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "I")
    private int field6495;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "[[B")
    private byte[][] field6496;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "[[B")
    private byte[][] field6498;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "F")
    private float field6494;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "F")
    private float field6499;

    @OriginalMember(owner = "client!so", name = "s", descriptor = "F")
    private float field6502;

    @OriginalMember(owner = "client!so", name = "t", descriptor = "F")
    private float field6503;

    @OriginalMember(owner = "client!so", name = "w", descriptor = "F")
    private float field6506;

    @OriginalMember(owner = "client!so", name = "x", descriptor = "F")
    private float field6507;

    @OriginalMember(owner = "client!so", name = "z", descriptor = "F")
    private float field6509;

    @OriginalMember(owner = "client!so", name = "A", descriptor = "F")
    private float field6510;

    @OriginalMember(owner = "client!so", name = "D", descriptor = "F")
    private float field6512;

    @OriginalMember(owner = "client!so", name = "E", descriptor = "F")
    private float field6513;

    @OriginalMember(owner = "client!so", name = "F", descriptor = "F")
    private float field6514;

    @OriginalMember(owner = "client!so", name = "G", descriptor = "F")
    private float field6515;

    @OriginalMember(owner = "client!so", name = "v", descriptor = "[[Lhq;")
    private class160[][] field6505;

    @OriginalMember(owner = "client!so", name = "u", descriptor = "[[Lub;")
    private class20[][] field6504;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "[[Lro;")
    private class2[][] field6497;

    @OriginalMember(owner = "client!so", name = "C", descriptor = "[[Lmn;")
    private class370[][] field6511;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "[[Luba;")
    private class433[][] field6500;

    @OriginalMember(owner = "client!so", name = "ka", descriptor = "(III)V")
    public final void method1528(int arg0, int arg1, int arg2) {
        if (this.field6498[arg0][arg1] < arg2) {
            this.field6498[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class606 var9 = this.field6508.method1216(Thread.currentThread());
        class154 var10 = var9.field8443;
        var10.field1967 = 0;
        var10.field1965 = true;
        this.field6508.method370();
        if (this.field6511 == null && this.field6505 == null) {
            if (this.field6504 != null) {
                this.method2641(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field8471, var9.field8464);
            }
        } else {
            this.method2648(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field8471, var9.field8464);
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Ljf;IIII[[I[[II)V")
    public class470(class217 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field6508 = arg0;
        this.field6495 = arg2;
        this.field6496 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field6508.field2660 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field6508.field2644 * var18 + this.field6508.field2659 * var17 + this.field6508.field2625 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field6496[var11][var10] = (byte) var20;
            }
        }
        this.field6498 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!so", name = "fa", descriptor = "(IILr;)Lr;")
    public final class184 method1540(int arg0, int arg1, class184 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIIII[[ZLou;Las;[I[I)V")
    private final void method2641(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class606 arg8, class154 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field8438;
        this.field6508.method350(false);
        arg9.field1964 = false;
        arg9.field1960 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field6504[var18][var19] != null) {
                        class20 var20 = this.field6504[var18][var19];
                        if (var20.field139 != -1 && (var20.field135 & 2) == 0 && var20.field138 == -1) {
                            int var21 = this.field6508.method1221(var20.field139);
                            arg9.method946((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class267.method1600(var20.field140 & 65535, (byte) 118, var21), (float) class267.method1600(var20.field137 & 65535, (byte) 118, var21), (float) class267.method1600(var20.field134 & 65535, (byte) 118, var21));
                            arg9.method946((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class267.method1600(var20.field136 & 65535, (byte) 118, var21), (float) class267.method1600(var20.field134 & 65535, (byte) 118, var21), (float) class267.method1600(var20.field137 & 65535, (byte) 118, var21));
                        } else if (var20.field138 == -1) {
                            arg9.method946((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) (var20.field140 & 65535), (float) (var20.field137 & 65535), (float) (var20.field134 & 65535));
                            arg9.method946((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var20.field136 & 65535), (float) (var20.field134 & 65535), (float) (var20.field137 & 65535));
                        } else {
                            int var22 = var20.field138;
                            arg9.method946((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                            arg9.method946((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                        }
                    } else if (this.field6500[var18][var19] != null) {
                        class433 var23 = this.field6500[var18][var19];
                        for (int var24 = 0; var24 < var23.field6090; ++var24) {
                            arg10[var24] = var23.field6097[var24] * var14 / super.field3730 + var16;
                            arg11[var24] = var17 - var23.field6099[var24] * var14 / super.field3730;
                        }
                        for (int var25 = 0; var25 < var23.field6088; ++var25) {
                            short var26 = var23.field6100[var25];
                            short var27 = var23.field6093[var25];
                            short var28 = var23.field6101[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field6098 != null && var23.field6098[var25] != -1) {
                                int var35 = var23.field6098[var25];
                                arg9.method946((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class267.method1600(var23.field6092[var26], (byte) 118, var35), (float) class267.method1600(var23.field6092[var27], (byte) 118, var35), (float) class267.method1600(var23.field6092[var28], (byte) 118, var35));
                            } else if (var23.field6094 != null && var23.field6094[var25] != -1) {
                                int var36 = this.field6508.method1221(var23.field6094[var25]);
                                arg9.method946((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class267.method1600(var23.field6092[var26], (byte) 118, var36), (float) class267.method1600(var23.field6092[var27], (byte) 118, var36), (float) class267.method1600(var23.field6092[var28], (byte) 118, var36));
                            } else {
                                int var37 = var23.field6091[var25];
                                arg9.method946((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class267.method1600(var23.field6092[var26], (byte) 118, var37), (float) class267.method1600(var23.field6092[var27], (byte) 118, var37), (float) class267.method1600(var23.field6092[var28], (byte) 118, var37));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field1964 = true;
        this.field6508.method350(var15);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lcba;[I)V")
    public final void method1538(class551 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIZLou;Las;[I[I[I[II)V")
    private final void method2642(int arg0, int arg1, boolean arg2, class606 arg3, class154 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class160 var11 = this.field6505[arg0][arg1];
        if (arg9 == 0 || (arg9 & 2) == 0) {
            if (var11 != null) {
                if (this.field6501 == -1) {
                    for (int var12 = 0; var12 < var11.field2012; ++var12) {
                        int var13 = (arg0 << super.field3722) + var11.field2013[var12];
                        int var14 = var11.field2014[var12];
                        int var15 = (arg1 << super.field3722) + var11.field2010[var12];
                        float var16 = (float) var15 * this.field6502 + (float) var13 * this.field6499 + (float) var14 * this.field6509 + this.field6513;
                        if (var16 <= (float) this.field6508.field2646) {
                            return;
                        }
                        arg8[var12] = 0;
                        if (arg2) {
                            int var17 = (int) (var16 - (float) arg3.field8437);
                            if (var17 > 255) {
                                var17 = 255;
                            }
                            if (var17 > 0) {
                                arg8[var12] = var17;
                                int var18 = var11.field2011[var12] * var17 / 255;
                                if (var18 > 0) {
                                    var14 -= var18;
                                }
                            }
                        } else if (arg3.field8434) {
                            int var19 = (int) (var16 - (float) arg3.field8437);
                            if (var19 > 0) {
                                arg8[var12] = var19;
                                if (arg8[var12] > 255) {
                                    arg8[var12] = 255;
                                }
                            }
                        }
                        float var20 = (float) var15 * this.field6515 + (float) var13 * this.field6514 + (float) var14 * this.field6510 + this.field6507;
                        float var21 = (float) var15 * this.field6506 + (float) var13 * this.field6503 + (float) var14 * this.field6512 + this.field6494;
                        arg5[var12] = (int) ((float) this.field6508.field2658 * var20 / var16) + arg4.field1966;
                        arg6[var12] = (int) ((float) this.field6508.field2634 * var21 / var16) + arg4.field1958;
                        arg7[var12] = (int) var16;
                    }
                } else {
                    for (int var22 = 0; var22 < var11.field2012; ++var22) {
                        int var36 = (arg0 << super.field3722) + var11.field2013[var22];
                        int var37 = var11.field2014[var22];
                        int var38 = (arg1 << super.field3722) + var11.field2010[var22];
                        float var39 = (float) var38 * this.field6502 + (float) var36 * this.field6499 + (float) var37 * this.field6509 + this.field6513;
                        arg8[var22] = 0;
                        if (arg2) {
                            int var40 = this.field6501 - arg3.field8437;
                            if (var40 > 255) {
                                var40 = 255;
                            }
                            if (var40 > 0) {
                                arg8[var22] = var40;
                                int var41 = var11.field2011[var22] * var40 / 255;
                                if (var41 > 0) {
                                    var37 -= var41;
                                }
                            }
                        } else if (arg3.field8434) {
                            int var42 = this.field6501 - arg3.field8437;
                            if (var42 > 0) {
                                arg8[var22] = var42;
                                if (arg8[var22] > 255) {
                                    arg8[var22] = 255;
                                }
                            }
                        }
                        float var43 = (float) var38 * this.field6515 + (float) var36 * this.field6514 + (float) var37 * this.field6510 + this.field6507;
                        float var44 = (float) var38 * this.field6506 + (float) var36 * this.field6503 + (float) var37 * this.field6512 + this.field6494;
                        arg5[var22] = (int) ((float) this.field6508.field2658 * var43 / (float) this.field6501) + arg4.field1966;
                        arg6[var22] = (int) ((float) this.field6508.field2634 * var44 / (float) this.field6501) + arg4.field1958;
                        arg7[var22] = (int) var39;
                    }
                }
                float var23 = (float) super.field3730;
                for (int var24 = 0; var24 < var11.field2009; ++var24) {
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
                        arg4.field1965 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field1971 || var29 > arg4.field1971 || var30 > arg4.field1971;
                        if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                            int var34 = arg0 << super.field3722;
                            int var35 = arg1 << super.field3722;
                            if ((var11.field2017[var25] & 16777215) != 0) {
                                if (var11.field2016[var25] == var11.field2016[var26] && var11.field2016[var25] == var11.field2016[var27] && var11.field2008[var25] == var11.field2008[var26] && var11.field2008[var25] == var11.field2008[var27]) {
                                    arg4.method942((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field2013[var25] + var34) / (float) var11.field2008[var25], (float) (var11.field2013[var26] + var34) / (float) var11.field2008[var26], (float) (var11.field2013[var27] + var34) / (float) var11.field2008[var27], (float) (var11.field2010[var25] + var35) / (float) var11.field2008[var25], (float) (var11.field2010[var26] + var35) / (float) var11.field2008[var26], (float) (var11.field2010[var27] + var35) / (float) var11.field2008[var27], var11.field2017[var25], var11.field2017[var26], var11.field2017[var27], arg3.field8439, arg8[var25], arg8[var26], arg8[var27], var11.field2016[var25]);
                                } else {
                                    arg4.method939((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field2013[var25] + var34) / var23, (float) (var11.field2013[var26] + var34) / var23, (float) (var11.field2013[var27] + var34) / var23, (float) (var11.field2010[var25] + var35) / var23, (float) (var11.field2010[var26] + var35) / var23, (float) (var11.field2010[var27] + var35) / var23, var11.field2017[var25], var11.field2017[var26], var11.field2017[var27], arg3.field8439, arg8[var25], arg8[var26], arg8[var27], var11.field2016[var25], var23 / (float) var11.field2008[var25], var11.field2016[var26], var23 / (float) var11.field2008[var26], var11.field2016[var27], var23 / (float) var11.field2008[var27]);
                                }
                            }
                        } else {
                            arg4.method938((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], arg3.field8439);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(II)I")
    private static final int method2643(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!so", name = "YA", descriptor = "()V")
    public final void method1542() {
        this.field6496 = null;
        this.field6498 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IILas;[I[I[I[II)V")
    private final void method2644(int arg0, int arg1, class154 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
        class20 var9 = this.field6504[arg0][arg1];
        if (var9 != null) {
            if ((var9.field135 & 2) == 0) {
                if (arg7 != 0) {
                    if ((var9.field135 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                int var10 = super.field3730 * arg0;
                int var11 = super.field3730 + var10;
                int var12 = super.field3730 * arg1;
                int var13 = super.field3730 + var12;
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
                if ((var9.field135 & 1) != 0) {
                    int var14 = super.field3723[arg0][arg1];
                    float var15 = (float) var14 * this.field6509;
                    if (this.field6501 == -1) {
                        var16 = (float) var12 * this.field6502 + (float) var10 * this.field6499 + var15 + this.field6513;
                        if (var16 <= (float) this.field6508.field2646) {
                            return;
                        }
                        var17 = (float) var12 * this.field6502 + (float) var11 * this.field6499 + var15 + this.field6513;
                        if (var17 <= (float) this.field6508.field2646) {
                            return;
                        }
                        var18 = (float) var13 * this.field6502 + (float) var11 * this.field6499 + var15 + this.field6513;
                        if (var18 <= (float) this.field6508.field2646) {
                            return;
                        }
                        var19 = (float) var13 * this.field6502 + (float) var10 * this.field6499 + var15 + this.field6513;
                        if (var19 <= (float) this.field6508.field2646) {
                            return;
                        }
                    } else {
                        var16 = (float) var12 * this.field6502 + (float) var10 * this.field6499 + var15 + this.field6513;
                        var17 = (float) var12 * this.field6502 + (float) var11 * this.field6499 + var15 + this.field6513;
                        var18 = (float) var13 * this.field6502 + (float) var11 * this.field6499 + var15 + this.field6513;
                        var19 = (float) var13 * this.field6502 + (float) var10 * this.field6499 + var15 + this.field6513;
                    }
                    float var20 = (float) var14 * this.field6510;
                    float var21 = (float) var14 * this.field6512;
                    if (this.field6501 == -1) {
                        float var22 = (float) var12 * this.field6515 + (float) var10 * this.field6514 + var20 + this.field6507;
                        var23 = (int) ((float) this.field6508.field2658 * var22 / var16) + arg2.field1966;
                        float var24 = (float) var12 * this.field6506 + (float) var10 * this.field6503 + var21 + this.field6494;
                        var25 = (int) ((float) this.field6508.field2634 * var24 / var16) + arg2.field1958;
                        float var26 = (float) var12 * this.field6515 + (float) var11 * this.field6514 + var20 + this.field6507;
                        var27 = (int) ((float) this.field6508.field2658 * var26 / var17) + arg2.field1966;
                        float var28 = (float) var12 * this.field6506 + (float) var11 * this.field6503 + var21 + this.field6494;
                        var29 = (int) ((float) this.field6508.field2634 * var28 / var17) + arg2.field1958;
                        float var30 = (float) var13 * this.field6515 + (float) var11 * this.field6514 + var20 + this.field6507;
                        var31 = (int) ((float) this.field6508.field2658 * var30 / var18) + arg2.field1966;
                        float var32 = (float) var13 * this.field6506 + (float) var11 * this.field6503 + var21 + this.field6494;
                        var33 = (int) ((float) this.field6508.field2634 * var32 / var18) + arg2.field1958;
                        float var34 = (float) var13 * this.field6515 + (float) var10 * this.field6514 + var20 + this.field6507;
                        var35 = (int) ((float) this.field6508.field2658 * var34 / var19) + arg2.field1966;
                        float var36 = (float) var13 * this.field6506 + (float) var10 * this.field6503 + var21 + this.field6494;
                        var37 = (int) ((float) this.field6508.field2634 * var36 / var19) + arg2.field1958;
                    } else {
                        float var38 = (float) var12 * this.field6515 + (float) var10 * this.field6514 + var20 + this.field6507;
                        var23 = (int) ((float) this.field6508.field2658 * var38 / (float) this.field6501) + arg2.field1966;
                        float var39 = (float) var12 * this.field6506 + (float) var10 * this.field6503 + var21 + this.field6494;
                        var25 = (int) ((float) this.field6508.field2634 * var39 / (float) this.field6501) + arg2.field1958;
                        float var40 = (float) var12 * this.field6515 + (float) var11 * this.field6514 + var20 + this.field6507;
                        var27 = (int) ((float) this.field6508.field2658 * var40 / (float) this.field6501) + arg2.field1966;
                        float var41 = (float) var12 * this.field6506 + (float) var11 * this.field6503 + var21 + this.field6494;
                        var29 = (int) ((float) this.field6508.field2634 * var41 / (float) this.field6501) + arg2.field1958;
                        float var42 = (float) var13 * this.field6515 + (float) var11 * this.field6514 + var20 + this.field6507;
                        var31 = (int) ((float) this.field6508.field2658 * var42 / (float) this.field6501) + arg2.field1966;
                        float var43 = (float) var13 * this.field6506 + (float) var11 * this.field6503 + var21 + this.field6494;
                        var33 = (int) ((float) this.field6508.field2634 * var43 / (float) this.field6501) + arg2.field1958;
                        float var44 = (float) var13 * this.field6515 + (float) var10 * this.field6514 + var20 + this.field6507;
                        var35 = (int) ((float) this.field6508.field2658 * var44 / (float) this.field6501) + arg2.field1966;
                        float var45 = (float) var13 * this.field6506 + (float) var10 * this.field6503 + var21 + this.field6494;
                        var37 = (int) ((float) this.field6508.field2634 * var45 / (float) this.field6501) + arg2.field1958;
                    }
                } else {
                    int var46 = super.field3723[arg0][arg1];
                    int var47 = super.field3723[arg0 + 1][arg1];
                    int var48 = super.field3723[arg0 + 1][arg1 + 1];
                    int var49 = super.field3723[arg0][arg1 + 1];
                    if (this.field6501 == -1) {
                        var16 = (float) var12 * this.field6502 + (float) var10 * this.field6499 + (float) var46 * this.field6509 + this.field6513;
                        if (var16 <= (float) this.field6508.field2646) {
                            return;
                        }
                        var17 = (float) var12 * this.field6502 + (float) var11 * this.field6499 + (float) var47 * this.field6509 + this.field6513;
                        if (var17 <= (float) this.field6508.field2646) {
                            return;
                        }
                        var18 = (float) var13 * this.field6502 + (float) var11 * this.field6499 + (float) var48 * this.field6509 + this.field6513;
                        if (var18 <= (float) this.field6508.field2646) {
                            return;
                        }
                        var19 = (float) var13 * this.field6502 + (float) var10 * this.field6499 + (float) var49 * this.field6509 + this.field6513;
                        if (var19 <= (float) this.field6508.field2646) {
                            return;
                        }
                        float var50 = (float) var12 * this.field6515 + (float) var10 * this.field6514 + (float) var46 * this.field6510 + this.field6507;
                        var23 = (int) ((float) this.field6508.field2658 * var50 / var16) + arg2.field1966;
                        float var51 = (float) var12 * this.field6506 + (float) var10 * this.field6503 + (float) var46 * this.field6512 + this.field6494;
                        var25 = (int) ((float) this.field6508.field2634 * var51 / var16) + arg2.field1958;
                        float var52 = (float) var12 * this.field6515 + (float) var11 * this.field6514 + (float) var47 * this.field6510 + this.field6507;
                        var27 = (int) ((float) this.field6508.field2658 * var52 / var17) + arg2.field1966;
                        float var53 = (float) var12 * this.field6506 + (float) var11 * this.field6503 + (float) var47 * this.field6512 + this.field6494;
                        var29 = (int) ((float) this.field6508.field2634 * var53 / var17) + arg2.field1958;
                        float var54 = (float) var13 * this.field6515 + (float) var11 * this.field6514 + (float) var48 * this.field6510 + this.field6507;
                        var31 = (int) ((float) this.field6508.field2658 * var54 / var18) + arg2.field1966;
                        float var55 = (float) var13 * this.field6506 + (float) var11 * this.field6503 + (float) var48 * this.field6512 + this.field6494;
                        var33 = (int) ((float) this.field6508.field2634 * var55 / var18) + arg2.field1958;
                        float var56 = (float) var13 * this.field6515 + (float) var10 * this.field6514 + (float) var49 * this.field6510 + this.field6507;
                        var35 = (int) ((float) this.field6508.field2658 * var56 / var19) + arg2.field1966;
                        float var57 = (float) var13 * this.field6506 + (float) var10 * this.field6503 + (float) var49 * this.field6512 + this.field6494;
                        var37 = (int) ((float) this.field6508.field2634 * var57 / var19) + arg2.field1958;
                    } else {
                        var16 = (float) var12 * this.field6502 + (float) var10 * this.field6499 + (float) var46 * this.field6509 + this.field6513;
                        var17 = (float) var12 * this.field6502 + (float) var11 * this.field6499 + (float) var47 * this.field6509 + this.field6513;
                        var18 = (float) var13 * this.field6502 + (float) var11 * this.field6499 + (float) var48 * this.field6509 + this.field6513;
                        var19 = (float) var13 * this.field6502 + (float) var10 * this.field6499 + (float) var49 * this.field6509 + this.field6513;
                        float var58 = (float) var12 * this.field6515 + (float) var10 * this.field6514 + (float) var46 * this.field6510 + this.field6507;
                        var23 = (int) ((float) this.field6508.field2658 * var58 / (float) this.field6501) + arg2.field1966;
                        float var59 = (float) var12 * this.field6506 + (float) var10 * this.field6503 + (float) var46 * this.field6512 + this.field6494;
                        var25 = (int) ((float) this.field6508.field2634 * var59 / (float) this.field6501) + arg2.field1958;
                        float var60 = (float) var12 * this.field6515 + (float) var11 * this.field6514 + (float) var47 * this.field6510 + this.field6507;
                        var27 = (int) ((float) this.field6508.field2658 * var60 / (float) this.field6501) + arg2.field1966;
                        float var61 = (float) var12 * this.field6506 + (float) var11 * this.field6503 + (float) var47 * this.field6512 + this.field6494;
                        var29 = (int) ((float) this.field6508.field2634 * var61 / (float) this.field6501) + arg2.field1958;
                        float var62 = (float) var13 * this.field6515 + (float) var11 * this.field6514 + (float) var48 * this.field6510 + this.field6507;
                        var31 = (int) ((float) this.field6508.field2658 * var62 / (float) this.field6501) + arg2.field1966;
                        float var63 = (float) var13 * this.field6506 + (float) var11 * this.field6503 + (float) var48 * this.field6512 + this.field6494;
                        var33 = (int) ((float) this.field6508.field2634 * var63 / (float) this.field6501) + arg2.field1958;
                        float var64 = (float) var13 * this.field6515 + (float) var10 * this.field6514 + (float) var49 * this.field6510 + this.field6507;
                        var35 = (int) ((float) this.field6508.field2658 * var64 / (float) this.field6501) + arg2.field1966;
                        float var65 = (float) var13 * this.field6506 + (float) var10 * this.field6503 + (float) var49 * this.field6512 + this.field6494;
                        var37 = (int) ((float) this.field6508.field2634 * var65 / (float) this.field6501) + arg2.field1958;
                    }
                }
                if (this.field6501 == -1) {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field1965 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field1971 || var35 > arg2.field1971 || var27 > arg2.field1971;
                        if (var9.field139 >= 0) {
                            arg2.method942((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class120.field1575[var9.field140 & 65535] & 16777215, -16777216 | class120.field1575[var9.field137 & 65535] & 16777215, -16777216 | class120.field1575[var9.field134 & 65535] & 16777215, 0, 0, 0, 0, var9.field139);
                        } else {
                            arg2.method946((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field140 & 65535), (float) (var9.field137 & 65535), (float) (var9.field134 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field1965 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field1971 || var27 > arg2.field1971 || var35 > arg2.field1971;
                        if (var9.field139 >= 0) {
                            arg2.method942((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class120.field1575[var9.field136 & 65535] & 16777215, -16777216 | class120.field1575[var9.field134 & 65535] & 16777215, -16777216 | class120.field1575[var9.field137 & 65535] & 16777215, 0, 0, 0, 0, var9.field139);
                            return;
                        }
                        arg2.method946((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field136 & 65535), (float) (var9.field134 & 65535), (float) (var9.field137 & 65535));
                        return;
                    }
                } else {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field1965 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field1971 || var35 > arg2.field1971 || var27 > arg2.field1971;
                        if (var9.field139 >= 0) {
                            arg2.method942((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class120.field1575[var9.field140 & 65535] & 16777215, -16777216 | class120.field1575[var9.field137 & 65535] & 16777215, -16777216 | class120.field1575[var9.field134 & 65535] & 16777215, 0, 0, 0, 0, var9.field139);
                        } else {
                            arg2.method946((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field140 & 65535), (float) (var9.field137 & 65535), (float) (var9.field134 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field1965 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field1971 || var27 > arg2.field1971 || var35 > arg2.field1971;
                        if (var9.field139 >= 0) {
                            arg2.method942((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class120.field1575[var9.field136 & 65535] & 16777215, -16777216 | class120.field1575[var9.field134 & 65535] & 16777215, -16777216 | class120.field1575[var9.field137 & 65535] & 16777215, 0, 0, 0, 0, var9.field139);
                            return;
                        }
                        arg2.method946((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field136 & 65535), (float) (var9.field134 & 65535), (float) (var9.field137 & 65535));
                    }
                }
            }
        } else {
            class433 var66 = this.field6500[arg0][arg1];
            if (var66 != null) {
                if (arg7 != 0) {
                    if ((var66.field6089 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                if (this.field6501 == -1) {
                    for (int var67 = 0; var67 < var66.field6090; ++var67) {
                        int var68 = (arg0 << super.field3722) + var66.field6097[var67];
                        short var69 = var66.field6096[var67];
                        int var70 = (arg1 << super.field3722) + var66.field6099[var67];
                        float var71 = (float) var70 * this.field6502 + (float) var68 * this.field6499 + (float) var69 * this.field6509 + this.field6513;
                        if (var71 <= (float) this.field6508.field2646) {
                            return;
                        }
                        float var72 = (float) var70 * this.field6515 + (float) var68 * this.field6514 + (float) var69 * this.field6510 + this.field6507;
                        float var73 = (float) var70 * this.field6506 + (float) var68 * this.field6503 + (float) var69 * this.field6512 + this.field6494;
                        arg3[var67] = (int) ((float) this.field6508.field2658 * var72 / var71) + arg2.field1966;
                        arg4[var67] = (int) ((float) this.field6508.field2634 * var73 / var71) + arg2.field1958;
                        arg5[var67] = (int) var71;
                    }
                } else {
                    for (int var74 = 0; var74 < var66.field6090; ++var74) {
                        int var110 = (arg0 << super.field3722) + var66.field6097[var74];
                        short var111 = var66.field6096[var74];
                        int var112 = (arg1 << super.field3722) + var66.field6099[var74];
                        float var113 = (float) var112 * this.field6502 + (float) var110 * this.field6499 + (float) var111 * this.field6509 + this.field6513;
                        float var114 = (float) var112 * this.field6515 + (float) var110 * this.field6514 + (float) var111 * this.field6510 + this.field6507;
                        float var115 = (float) var112 * this.field6506 + (float) var110 * this.field6503 + (float) var111 * this.field6512 + this.field6494;
                        arg3[var74] = (int) ((float) this.field6508.field2658 * var114 / (float) this.field6501) + arg2.field1966;
                        arg4[var74] = (int) ((float) this.field6508.field2634 * var115 / (float) this.field6501) + arg2.field1958;
                        arg5[var74] = (int) var113;
                    }
                }
                if (var66.field6094 != null) {
                    if (this.field6501 == -1) {
                        for (int var75 = 0; var75 < var66.field6088; ++var75) {
                            short var76 = var66.field6100[var75];
                            short var77 = var66.field6093[var75];
                            short var78 = var66.field6101[var75];
                            int var79 = arg3[var76];
                            int var80 = arg3[var77];
                            int var81 = arg3[var78];
                            int var82 = arg4[var76];
                            int var83 = arg4[var77];
                            int var84 = arg4[var78];
                            if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                                arg2.field1965 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field1971 || var80 > arg2.field1971 || var81 > arg2.field1971;
                                short var85 = var66.field6094[var75];
                                if (var85 != -1) {
                                    arg2.method942((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) var66.field6097[var76] / (float) super.field3730, (float) var66.field6097[var77] / (float) super.field3730, (float) var66.field6097[var78] / (float) super.field3730, (float) var66.field6099[var76] / (float) super.field3730, (float) var66.field6099[var77] / (float) super.field3730, (float) var66.field6099[var78] / (float) super.field3730, -16777216 | class120.field1575[var66.field6092[var76] & 65535] & 16777215, -16777216 | class120.field1575[var66.field6092[var77] & 65535] & 16777215, -16777216 | class120.field1575[var66.field6092[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                                } else {
                                    int var86 = var66.field6091[var75];
                                    if (var86 != -1) {
                                        arg2.method946((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) class267.method1600(var66.field6092[var76], (byte) 118, var86), (float) class267.method1600(var66.field6092[var77], (byte) 118, var86), (float) class267.method1600(var66.field6092[var78], (byte) 118, var86));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var87 = 0; var87 < var66.field6088; ++var87) {
                        short var88 = var66.field6100[var87];
                        short var89 = var66.field6093[var87];
                        short var90 = var66.field6101[var87];
                        int var91 = arg3[var88];
                        int var92 = arg3[var89];
                        int var93 = arg3[var90];
                        int var94 = arg4[var88];
                        int var95 = arg4[var89];
                        int var96 = arg4[var90];
                        if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                            arg2.field1965 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field1971 || var92 > arg2.field1971 || var93 > arg2.field1971;
                            short var97 = var66.field6094[var87];
                            if (var97 != -1) {
                                arg2.method942((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) var66.field6097[var88] / (float) super.field3730, (float) var66.field6097[var89] / (float) super.field3730, (float) var66.field6097[var90] / (float) super.field3730, (float) var66.field6099[var88] / (float) super.field3730, (float) var66.field6099[var89] / (float) super.field3730, (float) var66.field6099[var90] / (float) super.field3730, -16777216 | class120.field1575[var66.field6092[var88] & 65535] & 16777215, -16777216 | class120.field1575[var66.field6092[var89] & 65535] & 16777215, -16777216 | class120.field1575[var66.field6092[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                            } else {
                                int var98 = var66.field6091[var87];
                                if (var98 != -1) {
                                    arg2.method946((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) class267.method1600(var66.field6092[var88], (byte) 118, var98), (float) class267.method1600(var66.field6092[var89], (byte) 118, var98), (float) class267.method1600(var66.field6092[var90], (byte) 118, var98));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var99 = 0; var99 < var66.field6088; ++var99) {
                    short var100 = var66.field6100[var99];
                    short var101 = var66.field6093[var99];
                    short var102 = var66.field6101[var99];
                    int var103 = arg3[var100];
                    int var104 = arg3[var101];
                    int var105 = arg3[var102];
                    int var106 = arg4[var100];
                    int var107 = arg4[var101];
                    int var108 = arg4[var102];
                    if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                        int var109 = var66.field6091[var99];
                        if (var109 != -1) {
                            arg2.field1965 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field1971 || var104 > arg2.field1971 || var105 > arg2.field1971;
                            arg2.method946((float) var106, (float) var107, (float) var108, (float) var103, (float) var104, (float) var105, (float) arg5[var100], (float) arg5[var101], (float) arg5[var102], (float) class267.method1600(var66.field6092[var100], (byte) 118, var109), (float) class267.method1600(var66.field6092[var101], (byte) 118, var109), (float) class267.method1600(var66.field6092[var102], (byte) 118, var109));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1534(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)Z")
    private final boolean method2645(int arg0) {
        if ((this.field6495 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(II)V")
    public final void method1543(int arg0, int arg1) {
        this.method2647(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!so", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1544(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        boolean var15 = (this.field6495 & 32) == 0;
        if (this.field6511 == null && !var15) {
            this.field6511 = new class370[super.field3727][super.field3728];
            this.field6497 = new class2[super.field3727][super.field3728];
        } else if (this.field6505 == null && var15) {
            this.field6505 = new class160[super.field3727][super.field3728];
        } else if (this.field6504 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var16 = 0; var16 < arg6.length; ++var16) {
                if (arg6[var16] == -1) {
                    arg6[var16] = 0;
                } else {
                    arg6[var16] = class120.field1575[class151.method921(arg6[var16], -67) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var17 = 0; var17 < arg7.length; ++var17) {
                    if (arg7[var17] == -1) {
                        arg7[var17] = 0;
                    } else {
                        arg7[var17] = class120.field1575[class151.method921(arg7[var17], 57) & 65535] << 8 | 255;
                    }
                }
            }
            if (var15) {
                class160 var18 = new class160();
                var18.field2012 = (short) arg2.length;
                var18.field2009 = (short) (arg2.length / 3);
                var18.field2013 = new short[var18.field2012];
                var18.field2014 = new short[var18.field2012];
                var18.field2010 = new short[var18.field2012];
                var18.field2017 = new int[var18.field2012];
                var18.field2016 = new short[var18.field2012];
                var18.field2008 = new short[var18.field2012];
                var18.field2018 = new byte[var18.field2012];
                if (arg5 != null) {
                    var18.field2011 = new short[var18.field2012];
                }
                for (int var19 = 0; var19 < var18.field2012; ++var19) {
                    int var22 = arg2[var19];
                    int var23 = arg4[var19];
                    boolean var24 = false;
                    int var25;
                    if (var22 == 0 && var23 == 0) {
                        var25 = this.field6496[arg0][arg1] - this.field6498[arg0][arg1];
                    } else if (var22 == 0 && super.field3730 == var23) {
                        var25 = this.field6496[arg0][arg1 + 1] - this.field6498[arg0][arg1 + 1];
                    } else if (super.field3730 == var22 && super.field3730 == var23) {
                        var25 = this.field6496[arg0 + 1][arg1 + 1] - this.field6498[arg0 + 1][arg1 + 1];
                    } else if (super.field3730 == var22 && var23 == 0) {
                        var25 = this.field6496[arg0 + 1][arg1] - this.field6498[arg0 + 1][arg1];
                    } else {
                        int var26 = (this.field6496[arg0 + 1][arg1] - this.field6498[arg0 + 1][arg1]) * var22 + (this.field6496[arg0][arg1] - this.field6498[arg0][arg1]) * (super.field3730 - var22);
                        int var27 = (this.field6496[arg0 + 1][arg1 + 1] - this.field6498[arg0 + 1][arg1 + 1]) * var22 + (this.field6496[arg0][arg1 + 1] - this.field6498[arg0][arg1 + 1]) * (super.field3730 - var22);
                        var25 = (super.field3730 - var23) * var26 + var23 * var27 >> super.field3722 * 2;
                    }
                    int var28 = (arg0 << super.field3722) + var22;
                    int var29 = (arg1 << super.field3722) + var23;
                    var18.field2013[var19] = (short) var22;
                    var18.field2010[var19] = (short) var23;
                    var18.field2014[var19] = (short) (this.method1683(var28, var29, true) + (arg3 != null ? arg3[var19] : 0));
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (arg6[var19] == 0) {
                        var18.field2017[var19] = 0;
                        if (arg7 != null) {
                            var18.field2018[var19] = (byte) var25;
                        }
                    } else {
                        int var30 = 0;
                        if (arg5 != null) {
                            short var31 = var18.field2011[var19] = (short) arg5[var19];
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
                        if (arg8[var19] != -1 && this.method2645(this.field6508.field636.method925(arg8[var19], -28755).field4522)) {
                            var32 = -1694498816;
                        }
                        var18.field2017[var19] = var32 | class406.method2346(127, var30, method2643(arg6[var19] >> 8, var25), arg10);
                        if (arg7 != null) {
                            var18.field2018[var19] = (byte) var25;
                        }
                    }
                    var18.field2016[var19] = (short) arg8[var19];
                    var18.field2008[var19] = (short) arg9[var19];
                }
                if (arg7 != null) {
                    var18.field2015 = new int[var18.field2009];
                }
                for (int var20 = 0; var20 < var18.field2009; ++var20) {
                    int var21 = var20 * 3;
                    if (arg7 != null && arg7[var21] != 0) {
                        var18.field2015[var20] = -16777216 | arg7[var21] >> 8;
                    }
                }
                this.field6505[arg0][arg1] = var18;
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
                        } else if (arg2[var38] == super.field3730 && arg4[var38] == 0) {
                            if (var35 != -1 && arg6[var35] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var35 = var38;
                        } else if (arg2[var38] == super.field3730 && arg4[var38] == super.field3730) {
                            if (var36 != -1 && arg6[var36] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var36 = var38;
                        } else if (arg2[var38] == 0 && arg4[var38] == super.field3730) {
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
                                if (arg2[var40] != arg2[0] && arg2[0] + super.field3730 != arg2[var40] && arg2[0] - super.field3730 != arg2[var40]) {
                                    var33 = false;
                                    break;
                                }
                                if (arg4[var40] != arg4[0] && arg4[0] + super.field3730 != arg4[var40] && arg4[0] - super.field3730 != arg4[var40]) {
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
                    class370 var41 = new class370();
                    int var42 = arg6[0];
                    int var43 = arg8[0];
                    if (arg7 != null) {
                        var41.field5186 = arg7[0] >> 8;
                        if (var42 == 0) {
                            var41.field5184 = (byte) (var41.field5184 | 2);
                        }
                    } else if (var42 == 0) {
                        return;
                    }
                    if (super.field3723[arg0 + 1][arg1] == super.field3723[arg0][arg1] && super.field3723[arg0 + 1][arg1 + 1] == super.field3723[arg0][arg1] && super.field3723[arg0][arg1 + 1] == super.field3723[arg0][arg1]) {
                        var41.field5184 = (byte) (var41.field5184 | 1);
                    }
                    if (var43 != -1 && (var41.field5184 & 2) == 0 && !this.field6508.field636.method925(var43, -28755).field4527) {
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
                        var41.field5182 = class406.method2346(127, var44, method2643(arg6[var34] >> 8, this.field6496[arg0][arg1] - this.field6498[arg0][arg1]), arg10);
                        if (var41.field5186 != 0) {
                            var41.field5182 |= 255 - (this.field6496[arg0][arg1] - this.field6498[arg0][arg1]) << 25;
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
                        var41.field5183 = class406.method2346(126, var45, method2643(arg6[var35] >> 8, this.field6496[arg0 + 1][arg1] - this.field6498[arg0 + 1][arg1]), arg10);
                        if (var41.field5186 != 0) {
                            var41.field5183 |= 255 - (this.field6496[arg0 + 1][arg1] - this.field6498[arg0 + 1][arg1]) << 25;
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
                        var41.field5185 = class406.method2346(127, var46, method2643(arg6[var36] >> 8, this.field6496[arg0 + 1][arg1 + 1] - this.field6498[arg0 + 1][arg1 + 1]), arg10);
                        if (var41.field5186 != 0) {
                            var41.field5185 |= 255 - (this.field6496[arg0 + 1][arg1 + 1] - this.field6498[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field5176 = class406.method2346(126, var47, method2643(arg6[var37] >> 8, this.field6496[arg0][arg1 + 1] - this.field6498[arg0][arg1 + 1]), arg10);
                        var41.field5179 = (short) var43;
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
                        var41.field5182 = class406.method2346(126, var48, method2643(arg6[var34] >> 8, this.field6496[arg0][arg1] - this.field6498[arg0][arg1]), arg10);
                        if (var41.field5186 != 0) {
                            var41.field5182 |= 255 - (this.field6496[arg0][arg1] - this.field6498[arg0][arg1]) << 25;
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
                        var41.field5183 = class406.method2346(126, var49, method2643(arg6[var35] >> 8, this.field6496[arg0 + 1][arg1] - this.field6498[arg0 + 1][arg1]), arg10);
                        if (var41.field5186 != 0) {
                            var41.field5183 |= 255 - (this.field6496[arg0 + 1][arg1] - this.field6498[arg0 + 1][arg1]) << 25;
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
                        var41.field5185 = class406.method2346(126, var50, method2643(arg6[var36] >> 8, this.field6496[arg0 + 1][arg1 + 1] - this.field6498[arg0 + 1][arg1 + 1]), arg10);
                        if (var41.field5186 != 0) {
                            var41.field5185 |= 255 - (this.field6496[arg0 + 1][arg1 + 1] - this.field6498[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field5176 = class406.method2346(127, var51, method2643(arg6[var37] >> 8, this.field6496[arg0][arg1 + 1] - this.field6498[arg0][arg1 + 1]), arg10);
                        if (var41.field5186 != 0) {
                            var41.field5176 |= 255 - (this.field6496[arg0][arg1 + 1] - this.field6498[arg0][arg1 + 1]) << 25;
                        }
                        var41.field5179 = -1;
                    }
                    if (arg5 != null) {
                        var41.field5178 = (short) arg5[var36];
                        var41.field5180 = (short) arg5[var37];
                        var41.field5177 = (short) arg5[var35];
                        var41.field5181 = (short) arg5[var34];
                    }
                    this.field6511[arg0][arg1] = var41;
                } else {
                    class2 var52 = new class2();
                    var52.field16 = (short) arg2.length;
                    var52.field13 = (short) (arg2.length / 3);
                    var52.field18 = new short[var52.field16];
                    var52.field21 = new short[var52.field16];
                    var52.field12 = new short[var52.field16];
                    var52.field15 = new int[var52.field16];
                    if (arg5 != null) {
                        var52.field20 = new short[var52.field16];
                    }
                    for (int var53 = 0; var53 < var52.field16; ++var53) {
                        int var68 = arg2[var53];
                        int var69 = arg4[var53];
                        boolean var70 = false;
                        int var71;
                        if (var68 == 0 && var69 == 0) {
                            var71 = this.field6496[arg0][arg1] - this.field6498[arg0][arg1];
                        } else if (var68 == 0 && super.field3730 == var69) {
                            var71 = this.field6496[arg0][arg1 + 1] - this.field6498[arg0][arg1 + 1];
                        } else if (super.field3730 == var68 && super.field3730 == var69) {
                            var71 = this.field6496[arg0 + 1][arg1 + 1] - this.field6498[arg0 + 1][arg1 + 1];
                        } else if (super.field3730 == var68 && var69 == 0) {
                            var71 = this.field6496[arg0 + 1][arg1] - this.field6498[arg0 + 1][arg1];
                        } else {
                            int var72 = (this.field6496[arg0 + 1][arg1] - this.field6498[arg0 + 1][arg1]) * var68 + (this.field6496[arg0][arg1] - this.field6498[arg0][arg1]) * (super.field3730 - var68);
                            int var73 = (this.field6496[arg0 + 1][arg1 + 1] - this.field6498[arg0 + 1][arg1 + 1]) * var68 + (this.field6496[arg0][arg1 + 1] - this.field6498[arg0][arg1 + 1]) * (super.field3730 - var68);
                            var71 = (super.field3730 - var69) * var72 + var69 * var73 >> super.field3722 * 2;
                        }
                        int var74 = (arg0 << super.field3722) + var68;
                        int var75 = (arg1 << super.field3722) + var69;
                        var52.field18[var53] = (short) var68;
                        var52.field12[var53] = (short) var69;
                        var52.field21[var53] = (short) (this.method1683(var74, var75, true) + (arg3 != null ? arg3[var53] : 0));
                        if (var71 < 0) {
                            var71 = 0;
                        }
                        if (arg6[var53] == 0) {
                            if (arg7 != null) {
                                var52.field15[var53] = var71 << 25;
                            } else {
                                var52.field15[var53] = 0;
                            }
                        } else {
                            int var76 = 0;
                            if (arg5 != null) {
                                short var77 = var52.field20[var53] = (short) arg5[var53];
                                if (arg11 != 0) {
                                    var76 = var77 * 255 / arg11;
                                    if (var76 < 0) {
                                        var76 = 0;
                                    } else if (var76 > 255) {
                                        var76 = 255;
                                    }
                                }
                            }
                            var52.field15[var53] = class406.method2346(126, var76, method2643(arg6[var53] >> 8, var71), arg10);
                            if (arg7 != null) {
                                var52.field15[var53] |= var71 << 25;
                            }
                        }
                    }
                    boolean var54 = false;
                    for (int var55 = 0; var55 < var52.field13; ++var55) {
                        if (arg8[var55 * 3] != -1 && !this.field6508.field636.method925(arg8[var55 * 3], -28755).field4527) {
                            var54 = true;
                        }
                    }
                    if (arg7 != null) {
                        var52.field17 = new int[var52.field13];
                    }
                    if (var54) {
                        var52.field11 = new short[var52.field13];
                        var52.field19 = new short[var52.field13];
                    }
                    for (int var56 = 0; var56 < var52.field13; ++var56) {
                        int var57 = var56 * 3;
                        if (arg7 != null && arg7[var57] != 0) {
                            var52.field17[var56] = arg7[var57] >> 8;
                        }
                        if (var54) {
                            int var58 = var57 + 1;
                            int var59 = var58 + 1;
                            boolean var60 = false;
                            boolean var61 = true;
                            int var62 = arg8[var57];
                            if (var62 != -1 && !this.field6508.field636.method925(var62, -28755).field4527) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var63 = arg8[var58];
                            if (var63 != -1 && !this.field6508.field636.method925(var63, -28755).field4527) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var64 = arg8[var59];
                            if (var64 != -1 && !this.field6508.field636.method925(var64, -28755).field4527) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            if (var61) {
                                var52.field11[var56] = (short) var64;
                                var52.field19[var56] = (short) arg9[var57];
                            } else {
                                if (var60) {
                                    int var65 = arg8[var57];
                                    if (var65 != -1 && !this.field6508.field636.method925(var65, -28755).field4527) {
                                        var52.field15[var57] = class120.field1575[class151.method921(this.field6508.field636.method925(var65, -28755).field4535 & 65535, 109) & 65535];
                                    }
                                    int var66 = arg8[var58];
                                    if (var66 != -1 && !this.field6508.field636.method925(var66, -28755).field4527) {
                                        var52.field15[var58] = class120.field1575[class151.method921(this.field6508.field636.method925(var66, -28755).field4535 & 65535, -51) & 65535];
                                    }
                                    int var67 = arg8[var59];
                                    if (var67 != -1 && !this.field6508.field636.method925(var67, -28755).field4527) {
                                        var52.field15[var59] = class120.field1575[class151.method921(this.field6508.field636.method925(var67, -28755).field4535 & 65535, 115) & 65535];
                                    }
                                }
                                var52.field11[var56] = -1;
                            }
                        }
                    }
                    this.field6497[arg0][arg1] = var52;
                }
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(IIZLou;Las;[I[I[I[II)V")
    private final void method2646(int arg0, int arg1, boolean arg2, class606 arg3, class154 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class370 var11 = this.field6511[arg0][arg1];
        if (var11 != null) {
            if ((var11.field5184 & 2) == 0) {
                if (arg9 != 0) {
                    if ((var11.field5184 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                int var12 = super.field3730 * arg0;
                int var13 = super.field3730 + var12;
                int var14 = super.field3730 * arg1;
                int var15 = super.field3730 + var14;
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
                if ((var11.field5184 & 1) != 0 && !arg2) {
                    int var20 = super.field3723[arg0][arg1];
                    float var21 = (float) var20 * this.field6509;
                    if (this.field6501 == -1) {
                        var22 = (float) var14 * this.field6502 + (float) var12 * this.field6499 + var21 + this.field6513;
                        if (var22 <= (float) this.field6508.field2646) {
                            return;
                        }
                        var23 = (float) var14 * this.field6502 + (float) var13 * this.field6499 + var21 + this.field6513;
                        if (var23 <= (float) this.field6508.field2646) {
                            return;
                        }
                        var24 = (float) var15 * this.field6502 + (float) var13 * this.field6499 + var21 + this.field6513;
                        if (var24 <= (float) this.field6508.field2646) {
                            return;
                        }
                        var25 = (float) var15 * this.field6502 + (float) var12 * this.field6499 + var21 + this.field6513;
                        if (var25 <= (float) this.field6508.field2646) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field6502 + (float) var12 * this.field6499 + var21 + this.field6513;
                        var23 = (float) var14 * this.field6502 + (float) var13 * this.field6499 + var21 + this.field6513;
                        var24 = (float) var15 * this.field6502 + (float) var13 * this.field6499 + var21 + this.field6513;
                        var25 = (float) var15 * this.field6502 + (float) var12 * this.field6499 + var21 + this.field6513;
                    }
                    if (arg3.field8434) {
                        int var26 = (int) (var22 - (float) arg3.field8437);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field8437);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field8437);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                        int var29 = (int) (var25 - (float) arg3.field8437);
                        if (var29 > 0) {
                            var19 = var29;
                            if (var29 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    float var30 = (float) var20 * this.field6510;
                    float var31 = (float) var20 * this.field6512;
                    if (this.field6501 == -1) {
                        float var32 = (float) var14 * this.field6515 + (float) var12 * this.field6514 + var30 + this.field6507;
                        var33 = (int) ((float) this.field6508.field2658 * var32 / var22) + arg4.field1966;
                        float var34 = (float) var14 * this.field6506 + (float) var12 * this.field6503 + var31 + this.field6494;
                        var35 = (int) ((float) this.field6508.field2634 * var34 / var22) + arg4.field1958;
                        float var36 = (float) var14 * this.field6515 + (float) var13 * this.field6514 + var30 + this.field6507;
                        var37 = (int) ((float) this.field6508.field2658 * var36 / var23) + arg4.field1966;
                        float var38 = (float) var14 * this.field6506 + (float) var13 * this.field6503 + var31 + this.field6494;
                        var39 = (int) ((float) this.field6508.field2634 * var38 / var23) + arg4.field1958;
                        float var40 = (float) var15 * this.field6515 + (float) var13 * this.field6514 + var30 + this.field6507;
                        var41 = (int) ((float) this.field6508.field2658 * var40 / var24) + arg4.field1966;
                        float var42 = (float) var15 * this.field6506 + (float) var13 * this.field6503 + var31 + this.field6494;
                        var43 = (int) ((float) this.field6508.field2634 * var42 / var24) + arg4.field1958;
                        float var44 = (float) var15 * this.field6515 + (float) var12 * this.field6514 + var30 + this.field6507;
                        var45 = (int) ((float) this.field6508.field2658 * var44 / var25) + arg4.field1966;
                        float var46 = (float) var15 * this.field6506 + (float) var12 * this.field6503 + var31 + this.field6494;
                        var47 = (int) ((float) this.field6508.field2634 * var46 / var25) + arg4.field1958;
                    } else {
                        float var48 = (float) var14 * this.field6515 + (float) var12 * this.field6514 + var30 + this.field6507;
                        var33 = (int) ((float) this.field6508.field2658 * var48 / (float) this.field6501) + arg4.field1966;
                        float var49 = (float) var14 * this.field6506 + (float) var12 * this.field6503 + var31 + this.field6494;
                        var35 = (int) ((float) this.field6508.field2634 * var49 / (float) this.field6501) + arg4.field1958;
                        float var50 = (float) var14 * this.field6515 + (float) var13 * this.field6514 + var30 + this.field6507;
                        var37 = (int) ((float) this.field6508.field2658 * var50 / (float) this.field6501) + arg4.field1966;
                        float var51 = (float) var14 * this.field6506 + (float) var13 * this.field6503 + var31 + this.field6494;
                        var39 = (int) ((float) this.field6508.field2634 * var51 / (float) this.field6501) + arg4.field1958;
                        float var52 = (float) var15 * this.field6515 + (float) var13 * this.field6514 + var30 + this.field6507;
                        var41 = (int) ((float) this.field6508.field2658 * var52 / (float) this.field6501) + arg4.field1966;
                        float var53 = (float) var15 * this.field6506 + (float) var13 * this.field6503 + var31 + this.field6494;
                        var43 = (int) ((float) this.field6508.field2634 * var53 / (float) this.field6501) + arg4.field1958;
                        float var54 = (float) var15 * this.field6515 + (float) var12 * this.field6514 + var30 + this.field6507;
                        var45 = (int) ((float) this.field6508.field2658 * var54 / (float) this.field6501) + arg4.field1966;
                        float var55 = (float) var15 * this.field6506 + (float) var12 * this.field6503 + var31 + this.field6494;
                        var47 = (int) ((float) this.field6508.field2634 * var55 / (float) this.field6501) + arg4.field1958;
                    }
                } else {
                    int var56 = super.field3723[arg0][arg1];
                    int var57 = super.field3723[arg0 + 1][arg1];
                    int var58 = super.field3723[arg0 + 1][arg1 + 1];
                    int var59 = super.field3723[arg0][arg1 + 1];
                    if (this.field6501 == -1) {
                        var22 = (float) var14 * this.field6502 + (float) var12 * this.field6499 + (float) var56 * this.field6509 + this.field6513;
                        if (var22 <= (float) this.field6508.field2646) {
                            return;
                        }
                        var23 = (float) var14 * this.field6502 + (float) var13 * this.field6499 + (float) var57 * this.field6509 + this.field6513;
                        if (var23 <= (float) this.field6508.field2646) {
                            return;
                        }
                        var24 = (float) var15 * this.field6502 + (float) var13 * this.field6499 + (float) var58 * this.field6509 + this.field6513;
                        if (var24 <= (float) this.field6508.field2646) {
                            return;
                        }
                        var25 = (float) var15 * this.field6502 + (float) var12 * this.field6499 + (float) var59 * this.field6509 + this.field6513;
                        if (var25 <= (float) this.field6508.field2646) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field6502 + (float) var12 * this.field6499 + (float) var56 * this.field6509 + this.field6513;
                        var23 = (float) var14 * this.field6502 + (float) var13 * this.field6499 + (float) var57 * this.field6509 + this.field6513;
                        var24 = (float) var15 * this.field6502 + (float) var13 * this.field6499 + (float) var58 * this.field6509 + this.field6513;
                        var25 = (float) var15 * this.field6502 + (float) var12 * this.field6499 + (float) var59 * this.field6509 + this.field6513;
                    }
                    if (arg2) {
                        int var60 = (int) (var22 - (float) arg3.field8437);
                        if (var60 > 255) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var16 = var60;
                            int var61 = var11.field5181 * var60 / 255;
                            if (var61 > 0) {
                                var56 -= var61;
                            }
                        }
                        int var62 = (int) (var23 - (float) arg3.field8437);
                        if (var62 > 255) {
                            var62 = 255;
                        }
                        if (var62 > 0) {
                            var17 = var62;
                            int var63 = var11.field5177 * var62 / 255;
                            if (var63 > 0) {
                                var57 -= var63;
                            }
                        }
                        int var64 = (int) (var24 - (float) arg3.field8437);
                        if (var64 > 255) {
                            var64 = 255;
                        }
                        if (var64 > 0) {
                            var18 = var64;
                            int var65 = var11.field5178 * var64 / 255;
                            if (var65 > 0) {
                                var58 -= var65;
                            }
                        }
                        int var66 = (int) (var25 - (float) arg3.field8437);
                        if (var66 > 255) {
                            var66 = 255;
                        }
                        if (var66 > 0) {
                            var19 = var66;
                            int var67 = var11.field5180 * var66 / 255;
                            if (var67 > 0) {
                                var59 -= var67;
                            }
                        }
                    } else if (arg3.field8434) {
                        int var68 = (int) (var22 - (float) arg3.field8437);
                        if (var68 > 0) {
                            var16 = var68;
                            if (var68 > 255) {
                                var16 = 255;
                            }
                        }
                        int var69 = (int) (var23 - (float) arg3.field8437);
                        if (var69 > 0) {
                            var17 = var69;
                            if (var69 > 255) {
                                var17 = 255;
                            }
                        }
                        int var70 = (int) (var24 - (float) arg3.field8437);
                        if (var70 > 0) {
                            var18 = var70;
                            if (var70 > 255) {
                                var18 = 255;
                            }
                        }
                        int var71 = (int) (var25 - (float) arg3.field8437);
                        if (var71 > 0) {
                            var19 = var71;
                            if (var71 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    if (this.field6501 == -1) {
                        float var72 = (float) var14 * this.field6515 + (float) var12 * this.field6514 + (float) var56 * this.field6510 + this.field6507;
                        var33 = (int) ((float) this.field6508.field2658 * var72 / var22) + arg4.field1966;
                        float var73 = (float) var14 * this.field6506 + (float) var12 * this.field6503 + (float) var56 * this.field6512 + this.field6494;
                        var35 = (int) ((float) this.field6508.field2634 * var73 / var22) + arg4.field1958;
                        float var74 = (float) var14 * this.field6515 + (float) var13 * this.field6514 + (float) var57 * this.field6510 + this.field6507;
                        var37 = (int) ((float) this.field6508.field2658 * var74 / var23) + arg4.field1966;
                        float var75 = (float) var14 * this.field6506 + (float) var13 * this.field6503 + (float) var57 * this.field6512 + this.field6494;
                        var39 = (int) ((float) this.field6508.field2634 * var75 / var23) + arg4.field1958;
                        float var76 = (float) var15 * this.field6515 + (float) var13 * this.field6514 + (float) var58 * this.field6510 + this.field6507;
                        var41 = (int) ((float) this.field6508.field2658 * var76 / var24) + arg4.field1966;
                        float var77 = (float) var15 * this.field6506 + (float) var13 * this.field6503 + (float) var58 * this.field6512 + this.field6494;
                        var43 = (int) ((float) this.field6508.field2634 * var77 / var24) + arg4.field1958;
                        float var78 = (float) var15 * this.field6515 + (float) var12 * this.field6514 + (float) var59 * this.field6510 + this.field6507;
                        var45 = (int) ((float) this.field6508.field2658 * var78 / var25) + arg4.field1966;
                        float var79 = (float) var15 * this.field6506 + (float) var12 * this.field6503 + (float) var59 * this.field6512 + this.field6494;
                        var47 = (int) ((float) this.field6508.field2634 * var79 / var25) + arg4.field1958;
                    } else {
                        float var80 = (float) var14 * this.field6515 + (float) var12 * this.field6514 + (float) var56 * this.field6510 + this.field6507;
                        var33 = (int) ((float) this.field6508.field2658 * var80 / (float) this.field6501) + arg4.field1966;
                        float var81 = (float) var14 * this.field6506 + (float) var12 * this.field6503 + (float) var56 * this.field6512 + this.field6494;
                        var35 = (int) ((float) this.field6508.field2634 * var81 / (float) this.field6501) + arg4.field1958;
                        float var82 = (float) var14 * this.field6515 + (float) var13 * this.field6514 + (float) var57 * this.field6510 + this.field6507;
                        var37 = (int) ((float) this.field6508.field2658 * var82 / (float) this.field6501) + arg4.field1966;
                        float var83 = (float) var14 * this.field6506 + (float) var13 * this.field6503 + (float) var57 * this.field6512 + this.field6494;
                        var39 = (int) ((float) this.field6508.field2634 * var83 / (float) this.field6501) + arg4.field1958;
                        float var84 = (float) var15 * this.field6515 + (float) var13 * this.field6514 + (float) var58 * this.field6510 + this.field6507;
                        var41 = (int) ((float) this.field6508.field2658 * var84 / (float) this.field6501) + arg4.field1966;
                        float var85 = (float) var15 * this.field6506 + (float) var13 * this.field6503 + (float) var58 * this.field6512 + this.field6494;
                        var43 = (int) ((float) this.field6508.field2634 * var85 / (float) this.field6501) + arg4.field1958;
                        float var86 = (float) var15 * this.field6515 + (float) var12 * this.field6514 + (float) var59 * this.field6510 + this.field6507;
                        var45 = (int) ((float) this.field6508.field2658 * var86 / (float) this.field6501) + arg4.field1966;
                        float var87 = (float) var15 * this.field6506 + (float) var12 * this.field6503 + (float) var59 * this.field6512 + this.field6494;
                        var47 = (int) ((float) this.field6508.field2634 * var87 / (float) this.field6501) + arg4.field1958;
                    }
                }
                boolean var88 = var11.field5179 != -1 && this.method2645(this.field6508.field636.method925(var11.field5179, -28755).field4522);
                if (this.field6501 == -1) {
                    int var89 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field1965 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field1971 || var45 > arg4.field1971 || var37 > arg4.field1971;
                        if (var89 < 765) {
                            if (var89 > 0) {
                                if (var11.field5179 >= 0) {
                                    int var90 = -16777216;
                                    if (var88) {
                                        var90 = -1694498816;
                                    }
                                    arg4.method942((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field5185 & 16777215, var90 | var11.field5176 & 16777215, var90 | var11.field5183 & 16777215, arg3.field8439, var18, var19, var17, var11.field5179);
                                } else {
                                    if (var88) {
                                        arg4.field1967 = 100;
                                    }
                                    arg4.method936((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class532.method2945(var18 << 24 | arg3.field8439, (byte) 104, var11.field5185), class532.method2945(var19 << 24 | arg3.field8439, (byte) 109, var11.field5176), class532.method2945(var17 << 24 | arg3.field8439, (byte) 107, var11.field5183));
                                    arg4.field1967 = 0;
                                }
                            } else if (var11.field5179 >= 0) {
                                int var91 = -16777216;
                                if (var88) {
                                    var91 = -1694498816;
                                }
                                arg4.method942((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field5185 & 16777215, var91 | var11.field5176 & 16777215, var91 | var11.field5183 & 16777215, 0, 0, 0, 0, var11.field5179);
                            } else {
                                if (var88) {
                                    arg4.field1967 = 100;
                                }
                                arg4.method936((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field5185, var11.field5176, var11.field5183);
                                arg4.field1967 = 0;
                            }
                        } else {
                            arg4.method938((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field8439);
                        }
                    }
                    int var92 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field1965 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field1971 || var37 > arg4.field1971 || var45 > arg4.field1971;
                        if (var92 < 765) {
                            if (var88) {
                                arg4.field1967 = -1694498816;
                            }
                            if (var92 > 0) {
                                if (var11.field5179 >= 0) {
                                    int var93 = -16777216;
                                    if (var88) {
                                        var93 = -1694498816;
                                    }
                                    arg4.method942((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field5182 & 16777215, var93 | var11.field5183 & 16777215, var93 | var11.field5176 & 16777215, arg3.field8439, var16, var17, var19, var11.field5179);
                                    return;
                                }
                                if (var88) {
                                    arg4.field1967 = 100;
                                }
                                arg4.method936((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class532.method2945(var16 << 24 | arg3.field8439, (byte) 112, var11.field5182), class532.method2945(var17 << 24 | arg3.field8439, (byte) 122, var11.field5183), class532.method2945(var19 << 24 | arg3.field8439, (byte) 121, var11.field5176));
                                arg4.field1967 = 0;
                                return;
                            }
                            if (var11.field5179 >= 0) {
                                int var94 = -16777216;
                                if (var88) {
                                    var94 = -1694498816;
                                }
                                arg4.method942((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field5182 & 16777215, var94 | var11.field5183 & 16777215, var94 | var11.field5176 & 16777215, 0, 0, 0, 0, var11.field5179);
                                return;
                            }
                            if (var88) {
                                arg4.field1967 = 100;
                            }
                            arg4.method936((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field5182, var11.field5183, var11.field5176);
                            arg4.field1967 = 0;
                            return;
                        }
                        arg4.method938((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field8439);
                        return;
                    }
                } else {
                    int var95 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field1965 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field1971 || var45 > arg4.field1971 || var37 > arg4.field1971;
                        if (var95 < 765) {
                            if (var88) {
                                arg4.field1967 = -1694498816;
                            }
                            if (var95 > 0) {
                                if (var11.field5179 >= 0) {
                                    int var96 = -16777216;
                                    if (var88) {
                                        var96 = -1694498816;
                                    }
                                    arg4.method942((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field5185 & 16777215, var96 | var11.field5176 & 16777215, var96 | var11.field5183 & 16777215, arg3.field8439, var18, var19, var17, var11.field5179);
                                } else {
                                    if (var88) {
                                        arg4.field1967 = 100;
                                    }
                                    arg4.method936((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class532.method2945(var18 << 24 | arg3.field8439, (byte) 127, var11.field5185), class532.method2945(var19 << 24 | arg3.field8439, (byte) 124, var11.field5176), class532.method2945(var17 << 24 | arg3.field8439, (byte) 114, var11.field5183));
                                    arg4.field1967 = 0;
                                }
                            } else if (var11.field5179 >= 0) {
                                int var97 = -16777216;
                                if (var88) {
                                    var97 = -1694498816;
                                }
                                arg4.method942((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field5185 & 16777215, var97 | var11.field5176 & 16777215, var97 | var11.field5183 & 16777215, 0, 0, 0, 0, var11.field5179);
                            } else {
                                if (var88) {
                                    arg4.field1967 = 100;
                                }
                                arg4.method936((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field5185, var11.field5176, var11.field5183);
                                arg4.field1967 = 0;
                            }
                        } else {
                            arg4.method938((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field8439);
                        }
                    }
                    int var98 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field1965 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field1971 || var37 > arg4.field1971 || var45 > arg4.field1971;
                        if (var98 < 765) {
                            if (var88) {
                                arg4.field1967 = -1694498816;
                            }
                            if (var98 > 0) {
                                if (var11.field5179 >= 0) {
                                    int var99 = -16777216;
                                    if (var88) {
                                        var99 = -1694498816;
                                    }
                                    arg4.method942((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field5182 & 16777215, var99 | var11.field5183 & 16777215, var99 | var11.field5176 & 16777215, arg3.field8439, var16, var17, var19, var11.field5179);
                                    return;
                                }
                                if (var88) {
                                    arg4.field1967 = 100;
                                }
                                arg4.method936((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class532.method2945(var16 << 24 | arg3.field8439, (byte) 105, var11.field5182), class532.method2945(var17 << 24 | arg3.field8439, (byte) 118, var11.field5183), class532.method2945(var19 << 24 | arg3.field8439, (byte) 105, var11.field5176));
                                arg4.field1967 = 0;
                                return;
                            }
                            if (var11.field5179 >= 0) {
                                int var100 = -16777216;
                                if (var88) {
                                    var100 = -1694498816;
                                }
                                arg4.method942((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field5182 & 16777215, var100 | var11.field5183 & 16777215, var100 | var11.field5176 & 16777215, 0, 0, 0, 0, var11.field5179);
                                return;
                            }
                            if (var88) {
                                arg4.field1967 = 100;
                            }
                            arg4.method936((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field5182, var11.field5183, var11.field5176);
                            arg4.field1967 = 0;
                            return;
                        }
                        arg4.method938((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field8439);
                    }
                }
            }
        } else {
            class2 var101 = this.field6497[arg0][arg1];
            if (var101 != null) {
                if (arg9 != 0) {
                    if ((var101.field14 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                if (this.field6501 == -1) {
                    for (int var102 = 0; var102 < var101.field16; ++var102) {
                        int var103 = (arg0 << super.field3722) + var101.field18[var102];
                        int var104 = var101.field21[var102];
                        int var105 = (arg1 << super.field3722) + var101.field12[var102];
                        float var106 = (float) var105 * this.field6502 + (float) var103 * this.field6499 + (float) var104 * this.field6509 + this.field6513;
                        if (var106 <= (float) this.field6508.field2646) {
                            return;
                        }
                        arg8[var102] = 0;
                        if (arg2) {
                            int var107 = (int) (var106 - (float) arg3.field8437);
                            if (var107 > 255) {
                                var107 = 255;
                            }
                            if (var107 > 0) {
                                arg8[var102] = var107;
                                int var108 = var101.field20[var102] * var107 / 255;
                                if (var108 > 0) {
                                    var104 -= var108;
                                }
                            }
                        } else if (arg3.field8434) {
                            int var109 = (int) (var106 - (float) arg3.field8437);
                            if (var109 > 0) {
                                arg8[var102] = var109;
                                if (arg8[var102] > 255) {
                                    arg8[var102] = 255;
                                }
                            }
                        }
                        float var110 = (float) var105 * this.field6515 + (float) var103 * this.field6514 + (float) var104 * this.field6510 + this.field6507;
                        float var111 = (float) var105 * this.field6506 + (float) var103 * this.field6503 + (float) var104 * this.field6512 + this.field6494;
                        arg5[var102] = (int) ((float) this.field6508.field2658 * var110 / var106) + arg4.field1966;
                        arg6[var102] = (int) ((float) this.field6508.field2634 * var111 / var106) + arg4.field1958;
                        arg7[var102] = (int) var106;
                    }
                } else {
                    for (int var112 = 0; var112 < var101.field16; ++var112) {
                        int var152 = (arg0 << super.field3722) + var101.field18[var112];
                        int var153 = var101.field21[var112];
                        int var154 = (arg1 << super.field3722) + var101.field12[var112];
                        float var155 = (float) var154 * this.field6502 + (float) var152 * this.field6499 + (float) var153 * this.field6509 + this.field6513;
                        arg8[var112] = 0;
                        if (arg2) {
                            int var156 = this.field6501 - arg3.field8437;
                            if (var156 > 255) {
                                var156 = 255;
                            }
                            if (var156 > 0) {
                                arg8[var112] = var156;
                                int var157 = var101.field20[var112] * var156 / 255;
                                if (var157 > 0) {
                                    var153 -= var157;
                                }
                            }
                        } else if (arg3.field8434) {
                            int var158 = this.field6501 - arg3.field8437;
                            if (var158 > 0) {
                                arg8[var112] = var158;
                                if (arg8[var112] > 255) {
                                    arg8[var112] = 255;
                                }
                            }
                        }
                        float var159 = (float) var154 * this.field6515 + (float) var152 * this.field6514 + (float) var153 * this.field6510 + this.field6507;
                        float var160 = (float) var154 * this.field6506 + (float) var152 * this.field6503 + (float) var153 * this.field6512 + this.field6494;
                        arg5[var112] = (int) ((float) this.field6508.field2658 * var159 / (float) this.field6501) + arg4.field1966;
                        arg6[var112] = (int) ((float) this.field6508.field2634 * var160 / (float) this.field6501) + arg4.field1958;
                        arg7[var112] = (int) var155;
                    }
                }
                if (var101.field11 != null) {
                    if (this.field6501 == -1) {
                        for (int var113 = 0; var113 < var101.field13; ++var113) {
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
                                arg4.field1965 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field1971 || var118 > arg4.field1971 || var119 > arg4.field1971;
                                short var124 = var101.field11[var113];
                                if (var123 < 765) {
                                    if (var123 > 0) {
                                        if (var124 != -1) {
                                            int var125 = -16777216;
                                            if (var124 != -1 && this.method2645(this.field6508.field636.method925(var124, -28755).field4522)) {
                                                var125 = -1694498816;
                                            }
                                            arg4.method942((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field18[var114] / (float) super.field3730, (float) var101.field18[var115] / (float) super.field3730, (float) var101.field18[var116] / (float) super.field3730, (float) var101.field12[var114] / (float) super.field3730, (float) var101.field12[var115] / (float) super.field3730, (float) var101.field12[var116] / (float) super.field3730, var125 | var101.field15[var114] & 16777215, var125 | var101.field15[var115] & 16777215, var125 | var101.field15[var116] & 16777215, arg3.field8439, arg8[var114], arg8[var115], arg8[var116], var124);
                                        } else if ((var101.field15[var114] & 16777215) != 0) {
                                            if (var124 != -1 && this.method2645(this.field6508.field636.method925(var124, -28755).field4522)) {
                                                arg4.field1967 = -1694498816;
                                            }
                                            arg4.method936((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], class532.method2945(arg8[var114] << 24 | arg3.field8439, (byte) 119, var101.field15[var114]), class532.method2945(arg8[var115] << 24 | arg3.field8439, (byte) 120, var101.field15[var115]), class532.method2945(arg8[var116] << 24 | arg3.field8439, (byte) 122, var101.field15[var116]));
                                            arg4.field1967 = 0;
                                        }
                                    } else if (var124 != -1) {
                                        int var126 = -16777216;
                                        if (var124 != -1 && this.method2645(this.field6508.field636.method925(var124, -28755).field4522)) {
                                            var126 = -1694498816;
                                        }
                                        arg4.method942((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field18[var114] / (float) super.field3730, (float) var101.field18[var115] / (float) super.field3730, (float) var101.field18[var116] / (float) super.field3730, (float) var101.field12[var114] / (float) super.field3730, (float) var101.field12[var115] / (float) super.field3730, (float) var101.field12[var116] / (float) super.field3730, var126 | var101.field15[var114] & 16777215, var126 | var101.field15[var115] & 16777215, var126 | var101.field15[var116] & 16777215, 0, 0, 0, 0, var124);
                                    } else if ((var101.field15[var114] & 16777215) != 0) {
                                        if (var124 != -1 && this.method2645(this.field6508.field636.method925(var124, -28755).field4522)) {
                                            arg4.field1967 = -1694498816;
                                        }
                                        arg4.method936((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], var101.field15[var114], var101.field15[var115], var101.field15[var116]);
                                        arg4.field1967 = 0;
                                    }
                                } else {
                                    arg4.method938((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], arg3.field8439);
                                }
                            }
                        }
                        return;
                    }
                    for (int var127 = 0; var127 < var101.field13; ++var127) {
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
                            arg4.field1965 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field1971 || var132 > arg4.field1971 || var133 > arg4.field1971;
                            short var138 = var101.field11[var127];
                            if (var137 < 765) {
                                if (var138 != -1 && this.method2645(this.field6508.field636.method925(var138, -28755).field4522)) {
                                    arg4.field1967 = -1694498816;
                                }
                                if (var137 > 0) {
                                    if (var138 != -1) {
                                        int var139 = -16777216;
                                        if (var138 != -1 && this.method2645(this.field6508.field636.method925(var138, -28755).field4522)) {
                                            var139 = -1694498816;
                                        }
                                        arg4.method942((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field18[var128] / (float) super.field3730, (float) var101.field18[var129] / (float) super.field3730, (float) var101.field18[var130] / (float) super.field3730, (float) var101.field12[var128] / (float) super.field3730, (float) var101.field12[var129] / (float) super.field3730, (float) var101.field12[var130] / (float) super.field3730, var139 | var101.field15[var128] & 16777215, var139 | var101.field15[var129] & 16777215, var139 | var101.field15[var130] & 16777215, arg3.field8439, arg8[var128], arg8[var129], arg8[var130], var138);
                                    } else if ((var101.field15[var128] & 16777215) != 0) {
                                        if (var138 != -1 && this.method2645(this.field6508.field636.method925(var138, -28755).field4522)) {
                                            arg4.field1967 = -1694498816;
                                        }
                                        arg4.method936((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], class532.method2945(arg8[var128] << 24 | arg3.field8439, (byte) 117, var101.field15[var128]), class532.method2945(arg8[var129] << 24 | arg3.field8439, (byte) 104, var101.field15[var129]), class532.method2945(arg8[var130] << 24 | arg3.field8439, (byte) 123, var101.field15[var130]));
                                        arg4.field1967 = 0;
                                    }
                                } else if (var138 != -1) {
                                    int var140 = -16777216;
                                    if (var138 != -1 && this.method2645(this.field6508.field636.method925(var138, -28755).field4522)) {
                                        var140 = -1694498816;
                                    }
                                    arg4.method942((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field18[var128] / (float) super.field3730, (float) var101.field18[var129] / (float) super.field3730, (float) var101.field18[var130] / (float) super.field3730, (float) var101.field12[var128] / (float) super.field3730, (float) var101.field12[var129] / (float) super.field3730, (float) var101.field12[var130] / (float) super.field3730, var140 | var101.field15[var128] & 16777215, var140 | var101.field15[var129] & 16777215, var140 | var101.field15[var130] & 16777215, 0, 0, 0, 0, var138);
                                } else if ((var101.field15[var128] & 16777215) != 0) {
                                    if (var138 != -1 && this.method2645(this.field6508.field636.method925(var138, -28755).field4522)) {
                                        arg4.field1967 = -1694498816;
                                    }
                                    arg4.method936((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], var101.field15[var128], var101.field15[var129], var101.field15[var130]);
                                    arg4.field1967 = 0;
                                }
                                arg4.field1967 = 0;
                            } else {
                                arg4.method938((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], arg3.field8439);
                            }
                        }
                    }
                    return;
                }
                for (int var141 = 0; var141 < var101.field13; ++var141) {
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
                        arg4.field1965 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field1971 || var146 > arg4.field1971 || var147 > arg4.field1971;
                        if (var151 < 765) {
                            if (var151 > 0) {
                                if ((var101.field15[var142] & 16777215) != 0) {
                                    arg4.method936((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], class406.method2346(126, arg8[var142], var101.field15[var142], arg3.field8439), class406.method2346(126, arg8[var143], var101.field15[var143], arg3.field8439), class406.method2346(127, arg8[var144], var101.field15[var144], arg3.field8439));
                                }
                            } else if ((var101.field15[var142] & 16777215) != 0) {
                                arg4.method936((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], var101.field15[var142], var101.field15[var143], var101.field15[var144]);
                            }
                        } else {
                            arg4.method938((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], arg3.field8439);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1548(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class151 var7 = this.field6508.field2657;
        this.field6501 = -1;
        this.field6514 = var7.field1943;
        this.field6510 = var7.field1940;
        this.field6515 = var7.field1920;
        this.field6507 = var7.field1933;
        this.field6503 = var7.field1925;
        this.field6512 = var7.field1917;
        this.field6506 = var7.field1932;
        this.field6494 = var7.field1922;
        this.field6499 = var7.field1928;
        this.field6509 = var7.field1939;
        this.field6502 = var7.field1930;
        this.field6513 = var7.field1918;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field3727 && var11 >= 0 && var11 < super.field3728) {
                        this.method2647(var10, var11, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(III)V")
    private final void method2647(int arg0, int arg1, int arg2) {
        class606 var4 = this.field6508.method1216(Thread.currentThread());
        var4.field8443.field1967 = 0;
        if (this.field6511 != null) {
            this.method2646(arg0, arg1, var4.field8435, var4, var4.field8443, var4.field8471, var4.field8464, var4.field8460, var4.field8457, arg2);
        } else if (this.field6504 != null) {
            this.method2644(arg0, arg1, var4.field8443, var4.field8471, var4.field8464, var4.field8460, var4.field8457, arg2);
        } else {
            if (this.field6505 != null) {
                this.method2642(arg0, arg1, var4.field8435, var4, var4.field8443, var4.field8471, var4.field8464, var4.field8460, var4.field8457, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1541(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        class151 var8 = this.field6508.field2657;
        this.field6501 = arg5;
        this.field6514 = var8.field1943;
        this.field6510 = var8.field1940;
        this.field6515 = var8.field1920;
        this.field6507 = var8.field1933;
        this.field6503 = var8.field1925;
        this.field6512 = var8.field1917;
        this.field6506 = var8.field1932;
        this.field6494 = var8.field1922;
        this.field6499 = var8.field1928;
        this.field6509 = var8.field1939;
        this.field6502 = var8.field1930;
        this.field6513 = var8.field1918;
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field3727 && var12 >= 0 && var12 < super.field3728) {
                        this.method2647(var11, var12, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1530(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field6504 == null) {
            this.field6504 = new class20[super.field3727][super.field3728];
            this.field6500 = new class433[super.field3727][super.field3728];
        } else if (this.field6511 != null || this.field6505 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field3730 != var20 || var21 != 0 && super.field3730 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class433 var22 = new class433();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field6090 = var23;
            var22.field6092 = new short[var23];
            var22.field6097 = new short[var23];
            var22.field6096 = new short[var23];
            var22.field6099 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var32 = arg2[var25];
                int var33 = arg4[var25];
                if (var32 == 0 && var33 == 0) {
                    var22.field6092[var25] = (short) (this.field6496[arg0][arg1] - this.field6498[arg0][arg1]);
                } else if (var32 == 0 && super.field3730 == var33) {
                    var22.field6092[var25] = (short) (this.field6496[arg0][arg1 + 1] - this.field6498[arg0][arg1 + 1]);
                } else if (super.field3730 == var32 && super.field3730 == var33) {
                    var22.field6092[var25] = (short) (this.field6496[arg0 + 1][arg1 + 1] - this.field6498[arg0 + 1][arg1 + 1]);
                } else if (super.field3730 == var32 && var33 == 0) {
                    var22.field6092[var25] = (short) (this.field6496[arg0 + 1][arg1] - this.field6498[arg0 + 1][arg1]);
                } else {
                    int var34 = (this.field6496[arg0 + 1][arg1] - this.field6498[arg0 + 1][arg1]) * var32 + (this.field6496[arg0][arg1] - this.field6498[arg0][arg1]) * (super.field3730 - var32);
                    int var35 = (this.field6496[arg0 + 1][arg1 + 1] - this.field6498[arg0 + 1][arg1 + 1]) * var32 + (this.field6496[arg0][arg1 + 1] - this.field6498[arg0][arg1 + 1]) * (super.field3730 - var32);
                    var22.field6092[var25] = (short) ((super.field3730 - var33) * var34 + var33 * var35 >> super.field3722 * 2);
                }
                int var36 = (arg0 << super.field3722) + var32;
                int var37 = (arg1 << super.field3722) + var33;
                var22.field6097[var25] = (short) var32;
                var22.field6099[var25] = (short) var33;
                var22.field6096[var25] = (short) (this.method1683(var36, var37, true) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field6092[var25] < 2) {
                    var22.field6092[var25] = 2;
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
                    class335 var31 = this.field6508.field636.method925(var30, -28755);
                    if (!var31.field4527) {
                        var26 = true;
                        if (this.method2645(var31.field4522) || var31.field4525 != 0 || var31.field4542 != 0) {
                            var22.field6089 = (byte) (var22.field6089 | 4);
                        }
                    }
                }
            }
            var22.field6091 = new int[var27];
            if (arg10 != null) {
                var22.field6098 = new int[var27];
            }
            var22.field6100 = new short[var27];
            var22.field6093 = new short[var27];
            var22.field6101 = new short[var27];
            if (var26) {
                var22.field6094 = new short[var27];
                var22.field6095 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field6091[var22.field6088] = class151.method921(arg9[var29], -107);
                    } else {
                        var22.field6091[var22.field6088] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field6098[var22.field6088] = class151.method921(arg10[var29], 110);
                        } else {
                            var22.field6098[var22.field6088] = -1;
                        }
                    }
                    var22.field6100[var22.field6088] = (short) arg6[var29];
                    var22.field6093[var22.field6088] = (short) arg7[var29];
                    var22.field6101[var22.field6088] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field6508.field636.method925(arg11[var29], -28755).field4527) {
                            var22.field6094[var22.field6088] = (short) arg11[var29];
                            var22.field6095[var22.field6088] = (short) arg12[var29];
                        } else {
                            var22.field6094[var22.field6088] = -1;
                        }
                    }
                    ++var22.field6088;
                }
            }
            this.field6500[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class20 var38 = new class20();
                int var39 = arg9[0];
                int var40 = arg11[0];
                if (arg10 != null) {
                    var38.field138 = class267.method1600(this.field6496[arg0][arg1] - this.field6498[arg0][arg1], (byte) 118, class151.method921(arg10[0], -112));
                    if (var39 == -1) {
                        var38.field135 = (byte) (var38.field135 | 2);
                    }
                }
                if (super.field3723[arg0 + 1][arg1] == super.field3723[arg0][arg1] && super.field3723[arg0 + 1][arg1 + 1] == super.field3723[arg0][arg1] && super.field3723[arg0][arg1 + 1] == super.field3723[arg0][arg1]) {
                    var38.field135 = (byte) (var38.field135 | 1);
                }
                class335 var41 = null;
                if (var40 != -1) {
                    var41 = this.field6508.field636.method925(var40, -28755);
                }
                if (var41 != null && (var38.field135 & 2) == 0 && !var41.field4527) {
                    var38.field136 = (short) (this.field6496[arg0][arg1] - this.field6498[arg0][arg1]);
                    var38.field134 = (short) (this.field6496[arg0 + 1][arg1] - this.field6498[arg0 + 1][arg1]);
                    var38.field140 = (short) (this.field6496[arg0 + 1][arg1 + 1] - this.field6498[arg0 + 1][arg1 + 1]);
                    var38.field137 = (short) (this.field6496[arg0][arg1 + 1] - this.field6498[arg0][arg1 + 1]);
                    var38.field139 = (short) var40;
                    if (this.method2645(var41.field4522) || var41.field4525 != 0 || var41.field4542 != 0) {
                        var38.field135 = (byte) (var38.field135 | 4);
                    }
                } else {
                    short var42 = class151.method921(var39, -105);
                    var38.field136 = (short) class267.method1600(this.field6496[arg0][arg1] - this.field6498[arg0][arg1], (byte) 118, var42);
                    var38.field134 = (short) class267.method1600(this.field6496[arg0 + 1][arg1] - this.field6498[arg0 + 1][arg1], (byte) 118, var42);
                    var38.field140 = (short) class267.method1600(this.field6496[arg0 + 1][arg1 + 1] - this.field6498[arg0 + 1][arg1 + 1], (byte) 118, var42);
                    var38.field137 = (short) class267.method1600(this.field6496[arg0][arg1 + 1] - this.field6498[arg0][arg1 + 1], (byte) 118, var42);
                    var38.field139 = -1;
                }
                this.field6504[arg0][arg1] = var38;
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1529(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(IIIIIII[[ZLou;Las;[I[I)V")
    private final void method2648(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class606 arg8, class154 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field8438;
        this.field6508.method350(false);
        arg9.field1964 = false;
        arg9.field1960 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field6511 != null) {
                        if (this.field6511[var18][var19] != null) {
                            class370 var20 = this.field6511[var18][var19];
                            if (var20.field5179 != -1 && (var20.field5184 & 2) == 0 && var20.field5186 == 0) {
                                int var21 = this.field6508.method1221(var20.field5179);
                                arg9.method946((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class267.method1600(var20.field5185, (byte) 118, var21), (float) class267.method1600(var20.field5176, (byte) 118, var21), (float) class267.method1600(var20.field5183, (byte) 118, var21));
                                arg9.method946((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class267.method1600(var20.field5182, (byte) 118, var21), (float) class267.method1600(var20.field5183, (byte) 118, var21), (float) class267.method1600(var20.field5176, (byte) 118, var21));
                            } else if (var20.field5186 == 0) {
                                arg9.method936((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, var20.field5185, var20.field5176, var20.field5183);
                                arg9.method936((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, var20.field5182, var20.field5183, var20.field5176);
                            } else {
                                int var22 = var20.field5186;
                                arg9.method936((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, class532.method2945(var20.field5185 & -16777216, (byte) 105, var22), class532.method2945(var20.field5176 & -16777216, (byte) 120, var22), class532.method2945(var20.field5183 & -16777216, (byte) 120, var22));
                                arg9.method936((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, class532.method2945(var20.field5182 & -16777216, (byte) 117, var22), class532.method2945(var20.field5183 & -16777216, (byte) 115, var22), class532.method2945(var20.field5176 & -16777216, (byte) 113, var22));
                            }
                        } else if (this.field6497[var18][var19] != null) {
                            class2 var23 = this.field6497[var18][var19];
                            for (int var24 = 0; var24 < var23.field16; ++var24) {
                                arg10[var24] = var23.field18[var24] * var14 / super.field3730 + var16;
                                arg11[var24] = var17 - var23.field12[var24] * var14 / super.field3730;
                            }
                            for (int var25 = 0; var25 < var23.field13; ++var25) {
                                int var26 = var25 * 3;
                                int var27 = var26 + 1;
                                int var28 = var27 + 1;
                                int var29 = arg10[var26];
                                int var30 = arg10[var27];
                                int var31 = arg10[var28];
                                int var32 = arg11[var26];
                                int var33 = arg11[var27];
                                int var34 = arg11[var28];
                                if (var23.field17 != null && var23.field17[var25] != 0 && (var23.field11 == null || var23.field11 != null && var23.field11[var25] == -1)) {
                                    int var35 = var23.field17[var25];
                                    arg9.method936((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, class532.method2945(-16777216 - (var23.field15[var26] & -16777216), (byte) 125, var35), class532.method2945(-16777216 - (var23.field15[var27] & -16777216), (byte) 124, var35), class532.method2945(-16777216 - (var23.field15[var28] & -16777216), (byte) 111, var35));
                                } else if (var23.field11 != null && var23.field11[var25] != -1) {
                                    int var36 = this.field6508.method1221(var23.field11[var25]);
                                    arg9.method946((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) var36, (float) var36, (float) var36);
                                } else {
                                    arg9.method936((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, var23.field15[var26], var23.field15[var27], var23.field15[var28]);
                                }
                            }
                        }
                    } else if (this.field6505[var18][var19] != null) {
                        class160 var37 = this.field6505[var18][var19];
                        for (int var38 = 0; var38 < var37.field2012; ++var38) {
                            arg10[var38] = var37.field2013[var38] * var14 / super.field3730 + var16;
                            arg11[var38] = var17 - var37.field2010[var38] * var14 / super.field3730;
                        }
                        for (int var39 = 0; var39 < var37.field2009; ++var39) {
                            int var40 = var39 * 3;
                            int var41 = var40 + 1;
                            int var42 = var41 + 1;
                            int var43 = arg10[var40];
                            int var44 = arg10[var41];
                            int var45 = arg10[var42];
                            int var46 = arg11[var40];
                            int var47 = arg11[var41];
                            int var48 = arg11[var42];
                            if (var37.field2015 != null && var37.field2015[var39] != 0) {
                                int var49 = var37.field2015[var39];
                                arg9.method936((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                            } else {
                                arg9.method936((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var37.field2017[var40], var37.field2017[var41], var37.field2017[var42]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field1964 = true;
        this.field6508.method350(var15);
    }

    @OriginalMember(owner = "client!so", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1535(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }
}
