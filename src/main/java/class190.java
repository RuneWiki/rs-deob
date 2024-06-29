import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class190 extends class252 {

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "[I")
    private int[] field3252 = new int[257];

    @OriginalMember(owner = "client!mc", name = "bb", descriptor = "Ljd;")
    public static class85 field3258 = class221.method1499(" )2> ", (byte) -60);

    @OriginalMember(owner = "client!mc", name = "eb", descriptor = "Ljd;")
    public static class85 field3261 = class221.method1499(" <col=00ff80>", (byte) -126);

    @OriginalMember(owner = "client!mc", name = "kb", descriptor = "[Ljd;")
    public static class85[] field3267 = new class85[200];

    @OriginalMember(owner = "client!mc", name = "fb", descriptor = "I")
    public static int field3262 = (int) (33.0D * Math.random()) - 16;

    @OriginalMember(owner = "client!mc", name = "ab", descriptor = "[J")
    public static long[] field3257 = new long[32];

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!mc", name = "Z", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!mc", name = "cb", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!mc", name = "db", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!mc", name = "hb", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!mc", name = "ib", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!mc", name = "jb", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!mc", name = "lb", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!mc", name = "mb", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!mc", name = "ob", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!mc", name = "gb", descriptor = "Ljd;")
    public static class85 field3263;

    @OriginalMember(owner = "client!mc", name = "nb", descriptor = "[[I")
    private int[][] field3270;

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    public class190() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(IIBII)V")
    public static final void method1302(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (~class217.field3802 >= ~(arg1 - arg0) && ~(arg1 - -arg0) >= ~class83.field1513 && ~class34.field522 >= ~(-arg0 + arg3) && ~class1.field6 <= ~(arg0 + arg3)) {
            class57.method383(arg3, arg0, true, arg4, arg1);
        } else {
            class207.method1416(arg0, arg3, -8259, arg4, arg1);
        }
        if (arg2 <= 82) {
            field3261 = null;
        }
        ++field3265;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)I")
    public static final int method1303(int arg0, int arg1) {
        ++field3254;
        int var2 = -43 / ((arg0 - 33) / 60);
        if (~class128.field2249 != -2) {
            if (~class128.field2249 == -3) {
                return 20;
            } else if (arg1 != 15) {
                if (~arg1 != -17) {
                    if (~arg1 != -23) {
                        if (arg1 != 31) {
                            if (arg1 != 38) {
                                if (~arg1 != -44) {
                                    if (~arg1 != -49) {
                                        if (arg1 != 58) {
                                            if (arg1 != 69) {
                                                if (~arg1 != -75) {
                                                    if (~arg1 != -78) {
                                                        if (~arg1 != -102) {
                                                            if (~arg1 != -104) {
                                                                if (~arg1 != -153) {
                                                                    if (arg1 != 161) {
                                                                        if (~arg1 != -163) {
                                                                            if (~arg1 != -167) {
                                                                                if (~arg1 != -180) {
                                                                                    return ~arg1 == -192 ? 5 : 0;
                                                                                } else {
                                                                                    return 18;
                                                                                }
                                                                            } else {
                                                                                return 10;
                                                                            }
                                                                        } else {
                                                                            return 9;
                                                                        }
                                                                    } else {
                                                                        return 4;
                                                                    }
                                                                } else {
                                                                    return 16;
                                                                }
                                                            } else {
                                                                return 19;
                                                            }
                                                        } else {
                                                            return 12;
                                                        }
                                                    } else {
                                                        return 1;
                                                    }
                                                } else {
                                                    return 20;
                                                }
                                            } else {
                                                return 6;
                                            }
                                        } else {
                                            return 11;
                                        }
                                    } else {
                                        return 17;
                                    }
                                } else {
                                    return 15;
                                }
                            } else {
                                return 2;
                            }
                        } else {
                            return 14;
                        }
                    } else {
                        return 8;
                    }
                } else {
                    return 3;
                }
            } else {
                return 13;
            }
        } else {
            return 7;
        }
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V")
    public final void method230(int arg0) {
        ++field3256;
        if (this.field3270 == null) {
            this.method1309(3, 1);
        }
        this.method1304((byte) -108);
        if (arg0 != 3906) {
            this.method89(-110, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V")
    private final void method1304(byte arg0) {
        ++field3269;
        int var2 = this.field3270.length;
        int var3 = 43 % ((-8 - arg0) / 33);
        if (~var2 < -1) {
            for (int var4 = 0; ~var4 > -258; ++var4) {
                int var5 = 0;
                int var6 = var4 << 4;
                for (int var7 = 0; var7 < var2 && this.field3270[var7][0] <= var6; ++var7) {
                    ++var5;
                }
                int var12;
                int var13;
                int var14;
                if (var5 < var2) {
                    int[] var8 = this.field3270[var5];
                    if (~var5 < -1) {
                        int[] var9 = this.field3270[var5 + -1];
                        int var10 = (-var9[0] + var6 << 12) / (var8[0] - var9[0]);
                        int var11 = 4096 - var10;
                        var12 = var8[3] * var10 + var9[3] * var11 >> 12;
                        var13 = var8[2] * var10 - -(var9[2] * var11) >> 12;
                        var14 = var8[1] * var10 - -(var9[1] * var11) >> 12;
                    } else {
                        var12 = var8[3];
                        var13 = var8[2];
                        var14 = var8[1];
                    }
                } else {
                    int[] var15 = this.field3270[var2 + -1];
                    var12 = var15[3];
                    var14 = var15[1];
                    var13 = var15[2];
                }
                int var16 = var12 >> 4;
                int var17 = var14 >> 4;
                if (var17 >= 0) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                int var18 = var13 >> 4;
                if (~var18 > -1) {
                    var18 = 0;
                } else if (var18 > 255) {
                    var18 = 255;
                }
                if (~var16 > -1) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                this.field3252[var4] = class75.method528(var16, class75.method528(var17 << 16, var18 << 8));
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IBIIII)V")
    public static final void method1305(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3271;
        class211.field3706 = arg0;
        class249.field4289 = arg4;
        class11.field181 = arg3;
        class160.field2750 = arg2;
        class117.field2099 = arg5;
        if (class211.field3706 >= 100) {
            int var6 = class160.field2750 * 128 + 64;
            int var7 = class11.field181 * 128 + 64;
            int var8 = class246.method1660(604124551, var6, class116.field2066, var7) + -class117.field2099;
            int var9 = -class267.field4762 + var6;
            int var10 = var8 - class231.field3987;
            int var11 = var7 - class272.field4809;
            int var12 = (int) Math.sqrt((double) (var9 * var9 - -(var11 * var11)));
            class252.field4347 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 2047;
            class35.field547 = 2047 & (int) (Math.atan2((double) var9, (double) var11) * -325.949D);
            if (~class252.field4347 > -129) {
                class252.field4347 = 128;
            }
            if (~class252.field4347 < -384) {
                class252.field4347 = 383;
            }
        }
        if (arg1 > -52) {
            method1308((class44) null, (byte) 61);
        }
        class273.field4825 = 2;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)V")
    public static void method1306(byte arg0) {
        field3261 = null;
        field3263 = null;
        field3267 = null;
        field3257 = null;
        if (arg0 != 43) {
            field3257 = null;
        }
        field3258 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        ++field3260;
        if (arg1 != -123) {
            method1306((byte) -121);
        }
        int[][] var3 = super.field4350.method155(arg0, false);
        if (super.field4350.field338) {
            int[] var4 = this.method1742((byte) 8, 0, arg0);
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            for (int var8 = 0; class5.field63 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field3252[var9];
                var7[var8] = class135.method899(var10, 16711680) >> 12;
                var6[var8] = class135.method899(var10 >> 4, 4080);
                var5[var8] = class135.method899(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        ++field3259;
        if (arg2 != -99) {
            field3262 = 116;
        }
        if (~arg1 == -1) {
            int var4 = arg0.method1711((byte) -67);
            if (var4 != 0) {
                this.method1309(arg2 ^ -98, var4);
            } else {
                this.field3270 = new int[arg0.method1711((byte) -67)][4];
                for (int var5 = 0; ~var5 > ~this.field3270.length; ++var5) {
                    this.field3270[var5][0] = arg0.method1694((byte) -100);
                    this.field3270[var5][1] = arg0.method1711((byte) -67) << 4;
                    this.field3270[var5][2] = arg0.method1711((byte) -67) << 4;
                    this.field3270[var5][3] = arg0.method1711((byte) -67) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)Lqa;")
    public static final class147 method1307(int arg0) {
        ++field3253;
        try {
            if (arg0 != 6068) {
                field3267 = null;
            }
            return (class147) Class.forName("oh").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lrh;B)V")
    public static final void method1308(class44 arg0, byte arg1) {
        ++field3266;
        class185 var2 = (class185) class31.field472.method1398(1, arg0.field762.method624(false));
        if (arg1 < 39) {
            field3262 = -4;
        }
        if (var2 != null) {
            if (var2.field3182 != null) {
                class247.field4249.method954(var2.field3182);
                var2.field3182 = null;
            }
            var2.method1753(137);
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)V")
    private final void method1309(int arg0, int arg1) {
        ++field3251;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field3270 = new int[4][4];
                                this.field3270[0][2] = 4096;
                                this.field3270[0][1] = 0;
                                this.field3270[0][3] = 0;
                                this.field3270[1][2] = 4096;
                                this.field3270[2][2] = 4096;
                                this.field3270[3][2] = 0;
                                this.field3270[1][3] = 0;
                                this.field3270[0][0] = 2048;
                                this.field3270[2][3] = 0;
                                this.field3270[1][1] = 4096;
                                this.field3270[3][3] = 0;
                                this.field3270[1][0] = 2867;
                                this.field3270[2][0] = 3276;
                                this.field3270[3][0] = 4096;
                                this.field3270[2][1] = 4096;
                                this.field3270[3][1] = 4096;
                            } else {
                                this.field3270 = new int[16][4];
                                this.field3270[0][0] = 0;
                                this.field3270[0][2] = 192;
                                this.field3270[0][1] = 80;
                                this.field3270[1][2] = 449;
                                this.field3270[1][1] = 321;
                                this.field3270[1][0] = 155;
                                this.field3270[0][3] = 321;
                                this.field3270[2][0] = 389;
                                this.field3270[1][3] = 562;
                                this.field3270[3][0] = 671;
                                this.field3270[2][2] = 690;
                                this.field3270[2][1] = 578;
                                this.field3270[2][3] = 803;
                                this.field3270[3][3] = 1140;
                                this.field3270[4][3] = 1509;
                                this.field3270[3][2] = 995;
                                this.field3270[4][2] = 1397;
                                this.field3270[5][3] = 1413;
                                this.field3270[5][2] = 1429;
                                this.field3270[6][2] = 1461;
                                this.field3270[3][1] = 947;
                                this.field3270[4][1] = 1285;
                                this.field3270[7][2] = 1525;
                                this.field3270[6][3] = 1333;
                                this.field3270[5][1] = 1525;
                                this.field3270[6][1] = 1734;
                                this.field3270[8][2] = 1590;
                                this.field3270[7][1] = 1413;
                                this.field3270[8][1] = 1108;
                                this.field3270[7][3] = 1702;
                                this.field3270[9][2] = 2056;
                                this.field3270[9][1] = 1766;
                                this.field3270[10][1] = 2409;
                                this.field3270[4][0] = 897;
                                this.field3270[8][3] = 2056;
                                this.field3270[5][0] = 1175;
                                this.field3270[6][0] = 1368;
                                this.field3270[7][0] = 1507;
                                this.field3270[10][2] = 2586;
                                this.field3270[9][3] = 2666;
                                this.field3270[11][1] = 3116;
                                this.field3270[12][1] = 3806;
                                this.field3270[10][3] = 3276;
                                this.field3270[11][3] = 3228;
                                this.field3270[8][0] = 1736;
                                this.field3270[12][3] = 3196;
                                this.field3270[13][1] = 3437;
                                this.field3270[14][1] = 3116;
                                this.field3270[15][1] = 2377;
                                this.field3270[11][2] = 3148;
                                this.field3270[12][2] = 3710;
                                this.field3270[13][2] = 3421;
                                this.field3270[9][0] = 2088;
                                this.field3270[13][3] = 3019;
                                this.field3270[14][3] = 3228;
                                this.field3270[15][3] = 2746;
                                this.field3270[14][2] = 3148;
                                this.field3270[10][0] = 2355;
                                this.field3270[11][0] = 2691;
                                this.field3270[12][0] = 3031;
                                this.field3270[13][0] = 3522;
                                this.field3270[14][0] = 3727;
                                this.field3270[15][2] = 2505;
                                this.field3270[15][0] = 4096;
                            }
                        } else {
                            this.field3270 = new int[6][4];
                            this.field3270[0][1] = 0;
                            this.field3270[0][2] = 0;
                            this.field3270[0][0] = 0;
                            this.field3270[1][1] = 0;
                            this.field3270[1][0] = 1843;
                            this.field3270[0][3] = 0;
                            this.field3270[2][0] = 2457;
                            this.field3270[1][3] = 1493;
                            this.field3270[2][3] = 2939;
                            this.field3270[1][2] = 0;
                            this.field3270[3][0] = 2781;
                            this.field3270[2][2] = 0;
                            this.field3270[3][3] = 3565;
                            this.field3270[3][2] = 1124;
                            this.field3270[4][3] = 4031;
                            this.field3270[5][3] = 4096;
                            this.field3270[2][1] = 0;
                            this.field3270[3][1] = 0;
                            this.field3270[4][2] = 3084;
                            this.field3270[5][2] = 4096;
                            this.field3270[4][0] = 3481;
                            this.field3270[4][1] = 546;
                            this.field3270[5][0] = 4096;
                            this.field3270[5][1] = 4096;
                        }
                    } else {
                        this.field3270 = new int[7][4];
                        this.field3270[0][0] = 0;
                        this.field3270[1][0] = 663;
                        this.field3270[0][1] = 0;
                        this.field3270[1][1] = 0;
                        this.field3270[2][0] = 1363;
                        this.field3270[0][2] = 0;
                        this.field3270[3][0] = 2048;
                        this.field3270[0][3] = 4096;
                        this.field3270[2][1] = 0;
                        this.field3270[1][3] = 4096;
                        this.field3270[4][0] = 2727;
                        this.field3270[2][3] = 0;
                        this.field3270[3][1] = 4096;
                        this.field3270[4][1] = 4096;
                        this.field3270[1][2] = 4096;
                        this.field3270[2][2] = 4096;
                        this.field3270[5][0] = 3411;
                        this.field3270[5][1] = 4096;
                        this.field3270[3][3] = 0;
                        this.field3270[6][1] = 0;
                        this.field3270[3][2] = 4096;
                        this.field3270[4][3] = 0;
                        this.field3270[6][0] = 4096;
                        this.field3270[4][2] = 0;
                        this.field3270[5][2] = 0;
                        this.field3270[5][3] = 4096;
                        this.field3270[6][3] = 4096;
                        this.field3270[6][2] = 0;
                    }
                } else {
                    this.field3270 = new int[8][4];
                    this.field3270[0][1] = 2650;
                    this.field3270[0][0] = 0;
                    this.field3270[0][2] = 2602;
                    this.field3270[1][0] = 2867;
                    this.field3270[0][3] = 2361;
                    this.field3270[1][2] = 1799;
                    this.field3270[2][0] = 3072;
                    this.field3270[1][3] = 1558;
                    this.field3270[1][1] = 2313;
                    this.field3270[2][2] = 1734;
                    this.field3270[2][1] = 2618;
                    this.field3270[3][1] = 2296;
                    this.field3270[3][2] = 1220;
                    this.field3270[2][3] = 1413;
                    this.field3270[3][3] = 947;
                    this.field3270[4][2] = 963;
                    this.field3270[4][1] = 2072;
                    this.field3270[5][1] = 2730;
                    this.field3270[5][2] = 2152;
                    this.field3270[3][0] = 3276;
                    this.field3270[4][0] = 3481;
                    this.field3270[6][1] = 2232;
                    this.field3270[6][2] = 1060;
                    this.field3270[7][2] = 1413;
                    this.field3270[7][1] = 1686;
                    this.field3270[5][0] = 3686;
                    this.field3270[4][3] = 722;
                    this.field3270[6][0] = 3891;
                    this.field3270[5][3] = 1766;
                    this.field3270[6][3] = 915;
                    this.field3270[7][3] = 1140;
                    this.field3270[7][0] = 4096;
                }
            } else {
                this.field3270 = new int[2][4];
                this.field3270[0][3] = 0;
                this.field3270[0][0] = 0;
                this.field3270[1][3] = 4096;
                this.field3270[1][0] = 4096;
                this.field3270[0][2] = 0;
                this.field3270[1][2] = 4096;
                this.field3270[0][1] = 0;
                this.field3270[1][1] = 4096;
            }
        }
        if (arg0 != 3) {
            method1303(-44, -93);
        }
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)V")
    public static final void method1310(byte arg0) {
        ++field3255;
        class54.field950.method1262(17244);
        int var1 = -97 / ((arg0 - 28) / 56);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(JI)V")
    public static final void method1311(long arg0, int arg1) {
        ++field3264;
        if (~arg0 < -1L) {
            if (arg1 == 1) {
                if (~(arg0 % 10L) == -1L) {
                    class74.method524(arg0 + -1L, 0);
                    class74.method524(1L, 0);
                } else {
                    class74.method524(arg0, arg1 + -1);
                }
            }
        }
    }
}
