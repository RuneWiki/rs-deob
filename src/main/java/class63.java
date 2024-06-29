import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class63 extends class87 {

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "[I")
    private int[] field951 = new int[257];

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "[I")
    public static int[] field957 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "Llf;")
    public static class94 field964;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "[Lpb;")
    public static class277[] field952;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "[[I")
    private int[][] field956;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(I)V")
    public final void method136(int arg0) {
        if (this.field956 == null) {
            this.method479((byte) 111, 1);
        }
        ++field955;
        if (arg0 != 0) {
            field952 = null;
        }
        this.method482((byte) 81);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)[[I")
    public final int[][] method143(int arg0, int arg1) {
        ++field961;
        if (arg1 != 6) {
            field964 = null;
        }
        int[][] var3 = super.field1390.method1902(-124, arg0);
        if (super.field1390.field4428) {
            int[] var4 = this.method642(0, arg0, true);
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            for (int var8 = 0; ~class206.field3032 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field951[var9];
                var7[var8] = class301.method2056(var10, 16711680) >> 12;
                var5[var8] = class301.method2056(var10 >> 4, 4080);
                var6[var8] = class301.method2056(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lmh;I)V")
    public static final void method476(class263 arg0, int arg1) {
        if (~class12.field139 == ~arg0.field4227) {
            class91.field1452[arg0.field4200] = true;
        }
        if (arg1 != 14105) {
            method477(51, -59, -37, -7, -104, -117, -41, -77);
        }
        ++field950;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field958;
        int var8 = arg1;
        int var9 = -arg7 + arg3;
        int var10 = 0;
        int var11 = arg1 - arg7;
        int var12 = 0;
        int var13 = arg3 * arg3;
        int var14 = var9 * var9;
        int var15 = arg1 * arg1;
        int var16 = var11 * var11;
        int var17 = var15 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = arg1 << 1;
        int var21 = var14 << 1;
        int var22 = var11 << 1;
        int var23 = (-var20 + 1) * var13 + var17;
        int var24 = -((var20 + -1) * var18) + var15;
        int var25 = (1 - var22) * var14 + var19;
        int var26 = var16 - (var22 + -1) * var21;
        int var27 = var15 << 2;
        int var28 = var13 << 2;
        int var29 = var14 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var20 + -3) * var18;
        int var33 = (var22 + -3) * var21;
        if (arg4 == 14) {
            int var34 = (arg1 - 1) * var28;
            int var35 = var27;
            int var36 = var19 * 3;
            int var37 = var30;
            int var38 = (var11 - 1) * var29;
            int[] var39 = class104.field1795[arg0];
            class89.method669(var39, arg2, -var9 + arg5, -arg3 + arg5, (byte) -123);
            class89.method669(var39, arg6, arg5 - -var9, -var9 + arg5, (byte) -124);
            class89.method669(var39, arg2, arg5 - -arg3, arg5 + var9, (byte) -127);
            while (~var8 < -1) {
                if (var23 < 0) {
                    while (~var23 > -1) {
                        ++var10;
                        var24 += var35;
                        var35 += var27;
                        var23 += var31;
                        var31 += var27;
                    }
                }
                boolean var40 = var11 >= var8;
                --var8;
                if (var40) {
                    if (~var25 > -1) {
                        while (var25 < 0) {
                            var26 += var37;
                            ++var12;
                            var25 += var36;
                            var36 += var30;
                            var37 += var30;
                        }
                    }
                    if (~var26 > -1) {
                        var25 += var36;
                        var36 += var30;
                        ++var12;
                        var26 += var37;
                        var37 += var30;
                    }
                    var26 += -var33;
                    var25 += -var38;
                    var33 -= var29;
                    var38 -= var29;
                }
                if (var24 < 0) {
                    var24 += var35;
                    var35 += var27;
                    var23 += var31;
                    ++var10;
                    var31 += var27;
                }
                var23 += -var34;
                var24 += -var32;
                var34 -= var28;
                int var41 = arg0 - var8;
                var32 -= var28;
                int var42 = arg5 + var10;
                int var43 = arg0 + var8;
                int var44 = -var10 + arg5;
                if (!var40) {
                    class89.method669(class104.field1795[var41], arg2, var42, var44, (byte) -127);
                    class89.method669(class104.field1795[var43], arg2, var42, var44, (byte) -123);
                } else {
                    int var45 = -var12 + arg5;
                    int var46 = arg5 - -var12;
                    class89.method669(class104.field1795[var41], arg2, var45, var44, (byte) -128);
                    class89.method669(class104.field1795[var41], arg6, var46, var45, (byte) -124);
                    class89.method669(class104.field1795[var41], arg2, var42, var46, (byte) -124);
                    class89.method669(class104.field1795[var43], arg2, var45, var44, (byte) -123);
                    class89.method669(class104.field1795[var43], arg6, var46, var45, (byte) -128);
                    class89.method669(class104.field1795[var43], arg2, var42, var46, (byte) -126);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "(I)V")
    public static void method478(int arg0) {
        field964 = null;
        if (arg0 != 4) {
            method477(-7, 72, -81, 14, 36, -8, 66, 98);
        }
        field952 = null;
        field957 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            int var4 = arg0.method366(arg2 + -42150);
            if (var4 == 0) {
                this.field956 = new int[arg0.method366(arg2 ^ -9302)][4];
                for (int var5 = 0; var5 < this.field956.length; ++var5) {
                    this.field956[var5][0] = arg0.method331(class224.method1553(arg2, -25627));
                    this.field956[var5][1] = arg0.method366(-16505) << 4;
                    this.field956[var5][2] = arg0.method366(arg2 + -42150) << 4;
                    this.field956[var5][3] = arg0.method366(-16505) << 4;
                }
            } else {
                this.method479((byte) 111, var4);
            }
        }
        if (arg2 == 25645) {
            ++field959;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)V")
    private final void method479(byte arg0, int arg1) {
        ++field962;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field956 = new int[4][4];
                                this.field956[0][3] = 0;
                                this.field956[1][3] = 0;
                                this.field956[0][1] = 0;
                                this.field956[1][1] = 4096;
                                this.field956[0][0] = 2048;
                                this.field956[1][0] = 2867;
                                this.field956[2][1] = 4096;
                                this.field956[0][2] = 4096;
                                this.field956[3][1] = 4096;
                                this.field956[1][2] = 4096;
                                this.field956[2][2] = 4096;
                                this.field956[3][2] = 0;
                                this.field956[2][3] = 0;
                                this.field956[2][0] = 3276;
                                this.field956[3][0] = 4096;
                                this.field956[3][3] = 0;
                            } else {
                                this.field956 = new int[16][4];
                                this.field956[0][0] = 0;
                                this.field956[0][1] = 80;
                                this.field956[1][0] = 155;
                                this.field956[0][3] = 321;
                                this.field956[2][0] = 389;
                                this.field956[0][2] = 192;
                                this.field956[1][3] = 562;
                                this.field956[2][3] = 803;
                                this.field956[3][3] = 1140;
                                this.field956[1][1] = 321;
                                this.field956[3][0] = 671;
                                this.field956[2][1] = 578;
                                this.field956[4][0] = 897;
                                this.field956[1][2] = 449;
                                this.field956[3][1] = 947;
                                this.field956[4][1] = 1285;
                                this.field956[4][3] = 1509;
                                this.field956[5][0] = 1175;
                                this.field956[6][0] = 1368;
                                this.field956[7][0] = 1507;
                                this.field956[8][0] = 1736;
                                this.field956[9][0] = 2088;
                                this.field956[5][1] = 1525;
                                this.field956[2][2] = 690;
                                this.field956[5][3] = 1413;
                                this.field956[6][3] = 1333;
                                this.field956[10][0] = 2355;
                                this.field956[7][3] = 1702;
                                this.field956[8][3] = 2056;
                                this.field956[3][2] = 995;
                                this.field956[9][3] = 2666;
                                this.field956[4][2] = 1397;
                                this.field956[5][2] = 1429;
                                this.field956[10][3] = 3276;
                                this.field956[6][1] = 1734;
                                this.field956[11][0] = 2691;
                                this.field956[12][0] = 3031;
                                this.field956[11][3] = 3228;
                                this.field956[6][2] = 1461;
                                this.field956[7][2] = 1525;
                                this.field956[12][3] = 3196;
                                this.field956[8][2] = 1590;
                                this.field956[7][1] = 1413;
                                this.field956[9][2] = 2056;
                                this.field956[8][1] = 1108;
                                this.field956[10][2] = 2586;
                                this.field956[11][2] = 3148;
                                this.field956[9][1] = 1766;
                                this.field956[10][1] = 2409;
                                this.field956[12][2] = 3710;
                                this.field956[13][2] = 3421;
                                this.field956[11][1] = 3116;
                                this.field956[12][1] = 3806;
                                this.field956[13][0] = 3522;
                                this.field956[14][2] = 3148;
                                this.field956[13][1] = 3437;
                                this.field956[14][0] = 3727;
                                this.field956[15][0] = 4096;
                                this.field956[13][3] = 3019;
                                this.field956[15][2] = 2505;
                                this.field956[14][3] = 3228;
                                this.field956[15][3] = 2746;
                                this.field956[14][1] = 3116;
                                this.field956[15][1] = 2377;
                            }
                        } else {
                            this.field956 = new int[6][4];
                            this.field956[0][2] = 0;
                            this.field956[1][2] = 0;
                            this.field956[2][2] = 0;
                            this.field956[0][1] = 0;
                            this.field956[1][1] = 0;
                            this.field956[0][0] = 0;
                            this.field956[3][2] = 1124;
                            this.field956[2][1] = 0;
                            this.field956[3][1] = 0;
                            this.field956[0][3] = 0;
                            this.field956[1][0] = 1843;
                            this.field956[4][2] = 3084;
                            this.field956[2][0] = 2457;
                            this.field956[3][0] = 2781;
                            this.field956[5][2] = 4096;
                            this.field956[1][3] = 1493;
                            this.field956[4][0] = 3481;
                            this.field956[4][1] = 546;
                            this.field956[5][1] = 4096;
                            this.field956[2][3] = 2939;
                            this.field956[5][0] = 4096;
                            this.field956[3][3] = 3565;
                            this.field956[4][3] = 4031;
                            this.field956[5][3] = 4096;
                        }
                    } else {
                        this.field956 = new int[7][4];
                        this.field956[0][0] = 0;
                        this.field956[0][1] = 0;
                        this.field956[1][0] = 663;
                        this.field956[0][3] = 4096;
                        this.field956[0][2] = 0;
                        this.field956[1][1] = 0;
                        this.field956[2][0] = 1363;
                        this.field956[3][0] = 2048;
                        this.field956[2][1] = 0;
                        this.field956[1][3] = 4096;
                        this.field956[3][1] = 4096;
                        this.field956[4][0] = 2727;
                        this.field956[5][0] = 3411;
                        this.field956[6][0] = 4096;
                        this.field956[1][2] = 4096;
                        this.field956[4][1] = 4096;
                        this.field956[5][1] = 4096;
                        this.field956[6][1] = 0;
                        this.field956[2][3] = 0;
                        this.field956[2][2] = 4096;
                        this.field956[3][2] = 4096;
                        this.field956[3][3] = 0;
                        this.field956[4][3] = 0;
                        this.field956[4][2] = 0;
                        this.field956[5][2] = 0;
                        this.field956[5][3] = 4096;
                        this.field956[6][3] = 4096;
                        this.field956[6][2] = 0;
                    }
                } else {
                    this.field956 = new int[8][4];
                    this.field956[0][2] = 2602;
                    this.field956[1][2] = 1799;
                    this.field956[0][0] = 0;
                    this.field956[0][3] = 2361;
                    this.field956[1][0] = 2867;
                    this.field956[0][1] = 2650;
                    this.field956[1][1] = 2313;
                    this.field956[2][0] = 3072;
                    this.field956[1][3] = 1558;
                    this.field956[2][2] = 1734;
                    this.field956[2][3] = 1413;
                    this.field956[3][2] = 1220;
                    this.field956[3][3] = 947;
                    this.field956[4][2] = 963;
                    this.field956[3][0] = 3276;
                    this.field956[5][2] = 2152;
                    this.field956[2][1] = 2618;
                    this.field956[3][1] = 2296;
                    this.field956[4][0] = 3481;
                    this.field956[4][3] = 722;
                    this.field956[5][0] = 3686;
                    this.field956[5][3] = 1766;
                    this.field956[4][1] = 2072;
                    this.field956[6][3] = 915;
                    this.field956[6][2] = 1060;
                    this.field956[7][2] = 1413;
                    this.field956[5][1] = 2730;
                    this.field956[6][0] = 3891;
                    this.field956[7][0] = 4096;
                    this.field956[6][1] = 2232;
                    this.field956[7][3] = 1140;
                    this.field956[7][1] = 1686;
                }
            } else {
                this.field956 = new int[2][4];
                this.field956[0][0] = 0;
                this.field956[0][1] = 0;
                this.field956[1][1] = 4096;
                this.field956[0][2] = 0;
                this.field956[1][2] = 4096;
                this.field956[0][3] = 0;
                this.field956[1][0] = 4096;
                this.field956[1][3] = 4096;
            }
        }
        if (arg0 != 111) {
            method480(false);
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    public class63() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    public static final void method480(boolean arg0) {
        ++field963;
        for (int var1 = 0; ~var1 > -6; ++var1) {
            class223.field3274[var1] = false;
        }
        class268.field4304 = -1;
        class139.field2263 = 0;
        class182.field2732 = -1;
        if (arg0) {
            field952 = null;
        }
        class119.field1931 = 1;
        class234.field3421 = 0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(JIIILjava/lang/String;SILjava/lang/String;)V")
    public static final void method481(long arg0, int arg1, int arg2, int arg3, String arg4, short arg5, int arg6, String arg7) {
        ++field960;
        if (!class191.field2823) {
            if (~class147.field2360 > -501) {
                class121.field1988[class147.field2360] = arg4;
                class221.field3219[class147.field2360] = arg7;
                class149.field2385[class147.field2360] = arg2 != -1 ? arg2 : class212.field3119;
                class204.field3009[class147.field2360] = arg5;
                class303.field4910[class147.field2360] = arg0;
                class141.field2277[class147.field2360] = arg3;
                class131.field2173[class147.field2360] = arg1;
                ++class147.field2360;
            }
            if (arg6 != -1) {
                field964 = null;
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)V")
    private final void method482(byte arg0) {
        ++field954;
        if (arg0 > 56) {
            int var2 = this.field956.length;
            if (var2 > 0) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var6 < var2 && ~var5 <= ~this.field956[var6][0]; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (~var2 < ~var4) {
                        int[] var7 = this.field956[var4];
                        if (~var4 >= -1) {
                            var8 = var7[3];
                            var9 = var7[1];
                            var10 = var7[2];
                        } else {
                            int[] var11 = this.field956[var4 + -1];
                            int var12 = (var5 - var11[0] << 12) / (var7[0] + -var11[0]);
                            int var13 = -var12 + 4096;
                            var9 = var7[1] * var12 + var11[1] * var13 >> 12;
                            var8 = var7[3] * var12 - -(var11[3] * var13) >> 12;
                            var10 = var7[2] * var12 - -(var11[2] * var13) >> 12;
                        }
                    } else {
                        int[] var14 = this.field956[var2 + -1];
                        var9 = var14[1];
                        var8 = var14[3];
                        var10 = var14[2];
                    }
                    int var15 = var10 >> 4;
                    if (var15 >= 0) {
                        if (~var15 < -256) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    int var16 = var9 >> 4;
                    if (var16 >= 0) {
                        if (~var16 < -256) {
                            var16 = 255;
                        }
                    } else {
                        var16 = 0;
                    }
                    int var17 = var8 >> 4;
                    if (var17 >= 0) {
                        if (var17 > 255) {
                            var17 = 255;
                        }
                    } else {
                        var17 = 0;
                    }
                    this.field951[var3] = class200.method1408(var17, class200.method1408(var16 << 16, var15 << 8));
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZIIZIZI)V")
    public static final void method483(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        ++field953;
        if (arg5) {
            field957 = null;
        }
        if (arg2 < arg4) {
            int var7 = (arg2 + arg4) / 2;
            int var8 = arg2;
            class229 var9 = class290.field4625[var7];
            class290.field4625[var7] = class290.field4625[arg4];
            class290.field4625[arg4] = var9;
            for (int var10 = arg2; arg4 > var10; ++var10) {
                if (class66.method493(var9, class290.field4625[var10], arg0, arg6, arg1, (byte) -61, arg3) <= 0) {
                    class229 var11 = class290.field4625[var10];
                    class290.field4625[var10] = class290.field4625[var8];
                    class290.field4625[var8++] = var11;
                }
            }
            class290.field4625[arg4] = class290.field4625[var8];
            class290.field4625[var8] = var9;
            method483(arg0, arg1, arg2, arg3, var8 + -1, false, arg6);
            method483(arg0, arg1, var8 + 1, arg3, arg4, false, arg6);
        }
    }
}
