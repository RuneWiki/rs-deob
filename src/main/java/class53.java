import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class53 extends class196 {

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "[I")
    private int[] field913 = new int[257];

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "Ldf;")
    public static class51 field905 = class46.method233("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 100);

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "Ldf;")
    public static class51 field912 = class46.method233("Schrifts-=tze geladen)3", 100);

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "Ldf;")
    public static class51 field906 = class46.method233("Stufe)2", 100);

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "[[I")
    private int[][] field904;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "[[[Lqg;")
    public static class97[][][] field897;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(BI)[[I")
    public final int[][] method46(byte arg0, int arg1) {
        if (arg0 != 11) {
            this.field904 = null;
        }
        ++field898;
        int[][] var3 = super.field3285.method1548(arg1, (byte) -63);
        if (super.field3285.field3963) {
            int[] var4 = this.method1390(arg1, 0, -81);
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            for (int var8 = 0; ~class49.field767 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field913[var9];
                var6[var8] = class191.method1366(4080, var10 >> 12);
                var7[var8] = class191.method1366(var10, 65280) >> 4;
                var5[var8] = class191.method1366(var10 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field911;
        class157[] var7 = class135.field2250;
        for (int var8 = 0; ~var8 > ~var7.length; ++var8) {
            class157 var10 = var7[var8];
            if (var10 != null && var10.field2592 == 2) {
                class249.method1694(arg2 >> 1, arg1 >> 1, arg3, (var10.field2590 - class241.field4179 << 7) + var10.field2599, (-class11.field160 + var10.field2586 << 7) + var10.field2587, var10.field2601 * 2, arg0, (byte) -64);
                if (class205.field3424 > -1 && ~(class179.field2960 % 20) > -11) {
                    class116.field1968[var10.field2597].method1103(arg5 - (-class205.field3424 - -12), arg6 - -class176.field2887 + -28);
                }
            }
        }
        int var9 = 58 / ((arg4 - -23) / 44);
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V")
    private final void method336(int arg0) {
        ++field908;
        if (arg0 != 3) {
            field905 = null;
        }
        int var2 = this.field904.length;
        if (var2 > 0) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && var5 >= this.field904[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var4 <= ~var2) {
                    int[] var7 = this.field904[var2 + -1];
                    var8 = var7[3];
                    var9 = var7[2];
                    var10 = var7[1];
                } else {
                    int[] var11 = this.field904[var4];
                    if (~var4 < -1) {
                        int[] var12 = this.field904[var4 - 1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] - var12[0]);
                        int var14 = 4096 - var13;
                        var10 = var11[1] * var13 + var12[1] * var14 >> 12;
                        var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var8 = var11[3] * var13 + var12[3] * var14 >> 12;
                    } else {
                        var10 = var11[1];
                        var8 = var11[3];
                        var9 = var11[2];
                    }
                }
                int var15 = var10 >> 4;
                int var16 = var8 >> 4;
                if (~var15 > -1) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                int var17 = var9 >> 4;
                if (~var17 > -1) {
                    var17 = 0;
                } else if (~var17 < -256) {
                    var17 = 255;
                }
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                this.field913[var3] = class82.method642(var16, class82.method642(var17 << 8, var15 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(IIIIIII)V")
    public static final void method337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field910;
        int var7 = class149.method1074(102, class175.field2867, class36.field542, arg6);
        int var8 = class149.method1074(-52, class175.field2867, class36.field542, arg1);
        int var9 = class149.method1074(-95, class115.field1954, class28.field408, arg5);
        int var10 = class149.method1074(110, class115.field1954, class28.field408, arg2);
        int var11 = class149.method1074(-40, class175.field2867, class36.field542, arg4 + arg6);
        int var12 = class149.method1074(-48, class175.field2867, class36.field542, -arg4 + arg1);
        for (int var13 = var7; ~var13 > ~var11; ++var13) {
            class242.method1660((byte) -79, class80.field1324[var13], arg0, var10, var9);
        }
        for (int var14 = var8; ~var12 > ~var14; --var14) {
            class242.method1660((byte) -79, class80.field1324[var14], arg0, var10, var9);
        }
        if (arg3 >= 70) {
            int var15 = class149.method1074(101, class115.field1954, class28.field408, arg4 + arg5);
            int var16 = class149.method1074(-59, class115.field1954, class28.field408, arg2 - arg4);
            for (int var17 = var11; var17 <= var12; ++var17) {
                int[] var18 = class80.field1324[var17];
                class242.method1660((byte) -79, var18, arg0, var15, var9);
                class242.method1660((byte) -79, var18, arg0, var10, var16);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(II)V")
    private final void method338(int arg0, int arg1) {
        if (arg0 == 26268) {
            ++field902;
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        if (arg1 != 3) {
                            if (arg1 != 4) {
                                if (arg1 != 5) {
                                    if (arg1 == 6) {
                                        this.field904 = new int[4][4];
                                        this.field904[0][2] = 4096;
                                        this.field904[0][0] = 2048;
                                        this.field904[0][1] = 0;
                                        this.field904[1][2] = 4096;
                                        this.field904[1][0] = 2867;
                                        this.field904[1][1] = 4096;
                                        this.field904[2][1] = 4096;
                                        this.field904[3][1] = 4096;
                                        this.field904[0][3] = 0;
                                        this.field904[2][0] = 3276;
                                        this.field904[3][0] = 4096;
                                        this.field904[1][3] = 0;
                                        this.field904[2][3] = 0;
                                        this.field904[2][2] = 4096;
                                        this.field904[3][3] = 0;
                                        this.field904[3][2] = 0;
                                    } else {
                                        throw new RuntimeException("Invalid gradient preset");
                                    }
                                } else {
                                    this.field904 = new int[16][4];
                                    this.field904[0][3] = 321;
                                    this.field904[0][0] = 0;
                                    this.field904[1][3] = 562;
                                    this.field904[0][2] = 192;
                                    this.field904[2][3] = 803;
                                    this.field904[1][2] = 449;
                                    this.field904[2][2] = 690;
                                    this.field904[3][2] = 995;
                                    this.field904[1][0] = 155;
                                    this.field904[4][2] = 1397;
                                    this.field904[3][3] = 1140;
                                    this.field904[2][0] = 389;
                                    this.field904[0][1] = 80;
                                    this.field904[5][2] = 1429;
                                    this.field904[4][3] = 1509;
                                    this.field904[5][3] = 1413;
                                    this.field904[6][3] = 1333;
                                    this.field904[7][3] = 1702;
                                    this.field904[8][3] = 2056;
                                    this.field904[9][3] = 2666;
                                    this.field904[10][3] = 3276;
                                    this.field904[1][1] = 321;
                                    this.field904[11][3] = 3228;
                                    this.field904[12][3] = 3196;
                                    this.field904[13][3] = 3019;
                                    this.field904[2][1] = 578;
                                    this.field904[3][0] = 671;
                                    this.field904[3][1] = 947;
                                    this.field904[14][3] = 3228;
                                    this.field904[6][2] = 1461;
                                    this.field904[15][3] = 2746;
                                    this.field904[4][1] = 1285;
                                    this.field904[4][0] = 897;
                                    this.field904[7][2] = 1525;
                                    this.field904[5][0] = 1175;
                                    this.field904[6][0] = 1368;
                                    this.field904[5][1] = 1525;
                                    this.field904[7][0] = 1507;
                                    this.field904[8][0] = 1736;
                                    this.field904[8][2] = 1590;
                                    this.field904[9][0] = 2088;
                                    this.field904[9][2] = 2056;
                                    this.field904[6][1] = 1734;
                                    this.field904[10][0] = 2355;
                                    this.field904[10][2] = 2586;
                                    this.field904[11][0] = 2691;
                                    this.field904[7][1] = 1413;
                                    this.field904[12][0] = 3031;
                                    this.field904[13][0] = 3522;
                                    this.field904[8][1] = 1108;
                                    this.field904[14][0] = 3727;
                                    this.field904[9][1] = 1766;
                                    this.field904[10][1] = 2409;
                                    this.field904[11][1] = 3116;
                                    this.field904[11][2] = 3148;
                                    this.field904[15][0] = 4096;
                                    this.field904[12][2] = 3710;
                                    this.field904[13][2] = 3421;
                                    this.field904[12][1] = 3806;
                                    this.field904[14][2] = 3148;
                                    this.field904[15][2] = 2505;
                                    this.field904[13][1] = 3437;
                                    this.field904[14][1] = 3116;
                                    this.field904[15][1] = 2377;
                                }
                            } else {
                                this.field904 = new int[6][4];
                                this.field904[0][3] = 0;
                                this.field904[1][3] = 1493;
                                this.field904[2][3] = 2939;
                                this.field904[0][2] = 0;
                                this.field904[3][3] = 3565;
                                this.field904[4][3] = 4031;
                                this.field904[0][1] = 0;
                                this.field904[5][3] = 4096;
                                this.field904[1][1] = 0;
                                this.field904[1][2] = 0;
                                this.field904[2][1] = 0;
                                this.field904[2][2] = 0;
                                this.field904[3][2] = 1124;
                                this.field904[3][1] = 0;
                                this.field904[0][0] = 0;
                                this.field904[4][1] = 546;
                                this.field904[1][0] = 1843;
                                this.field904[5][1] = 4096;
                                this.field904[4][2] = 3084;
                                this.field904[2][0] = 2457;
                                this.field904[5][2] = 4096;
                                this.field904[3][0] = 2781;
                                this.field904[4][0] = 3481;
                                this.field904[5][0] = 4096;
                            }
                        } else {
                            this.field904 = new int[7][4];
                            this.field904[0][0] = 0;
                            this.field904[0][1] = 0;
                            this.field904[0][2] = 0;
                            this.field904[0][3] = 4096;
                            this.field904[1][2] = 4096;
                            this.field904[1][1] = 0;
                            this.field904[1][3] = 4096;
                            this.field904[1][0] = 663;
                            this.field904[2][3] = 0;
                            this.field904[3][3] = 0;
                            this.field904[2][2] = 4096;
                            this.field904[2][1] = 0;
                            this.field904[4][3] = 0;
                            this.field904[5][3] = 4096;
                            this.field904[3][1] = 4096;
                            this.field904[6][3] = 4096;
                            this.field904[3][2] = 4096;
                            this.field904[4][1] = 4096;
                            this.field904[4][2] = 0;
                            this.field904[5][2] = 0;
                            this.field904[6][2] = 0;
                            this.field904[2][0] = 1363;
                            this.field904[3][0] = 2048;
                            this.field904[4][0] = 2727;
                            this.field904[5][1] = 4096;
                            this.field904[6][1] = 0;
                            this.field904[5][0] = 3411;
                            this.field904[6][0] = 4096;
                        }
                    } else {
                        this.field904 = new int[8][4];
                        this.field904[0][3] = 2361;
                        this.field904[1][3] = 1558;
                        this.field904[0][0] = 0;
                        this.field904[0][2] = 2602;
                        this.field904[2][3] = 1413;
                        this.field904[1][2] = 1799;
                        this.field904[0][1] = 2650;
                        this.field904[2][2] = 1734;
                        this.field904[1][1] = 2313;
                        this.field904[3][3] = 947;
                        this.field904[1][0] = 2867;
                        this.field904[2][1] = 2618;
                        this.field904[3][2] = 1220;
                        this.field904[4][2] = 963;
                        this.field904[5][2] = 2152;
                        this.field904[4][3] = 722;
                        this.field904[2][0] = 3072;
                        this.field904[6][2] = 1060;
                        this.field904[3][0] = 3276;
                        this.field904[7][2] = 1413;
                        this.field904[3][1] = 2296;
                        this.field904[4][0] = 3481;
                        this.field904[5][0] = 3686;
                        this.field904[4][1] = 2072;
                        this.field904[5][1] = 2730;
                        this.field904[6][1] = 2232;
                        this.field904[6][0] = 3891;
                        this.field904[5][3] = 1766;
                        this.field904[6][3] = 915;
                        this.field904[7][3] = 1140;
                        this.field904[7][0] = 4096;
                        this.field904[7][1] = 1686;
                    }
                } else {
                    this.field904 = new int[2][4];
                    this.field904[0][3] = 0;
                    this.field904[0][0] = 0;
                    this.field904[0][2] = 0;
                    this.field904[1][2] = 4096;
                    this.field904[0][1] = 0;
                    this.field904[1][0] = 4096;
                    this.field904[1][3] = 4096;
                    this.field904[1][1] = 4096;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class53() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLlb;)Lsh;")
    public static final class196 method339(byte arg0, class121 arg1) {
        arg1.method897(121);
        int var2 = 103 % ((arg0 - -14) / 36);
        int var3 = arg1.method897(-65);
        class196 var4 = class49.method250(74, var3);
        ++field901;
        var4.field3277 = arg1.method897(-94);
        int var5 = arg1.method897(114);
        for (int var6 = 0; var6 < var5; ++var6) {
            int var7 = arg1.method897(-15);
            var4.method44(var7, arg1, (byte) 82);
        }
        var4.method73((byte) -59);
        return var4;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
    public static void method340(boolean arg0) {
        field912 = null;
        if (!arg0) {
            method337(104, -77, 31, -101, -106, 12, -76);
        }
        field897 = null;
        field906 = null;
        field905 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILja;Lbf;I)V")
    public static final void method341(int arg0, class55 arg1, class188 arg2, int arg3) {
        ++field907;
        byte[] var4 = null;
        class252 var5 = class14.field207;
        synchronized (class14.field207) {
            for (class124 var6 = (class124) class14.field207.method1720(true); var6 != null; var6 = (class124) class14.field207.method1712((byte) 112)) {
                if ((long) arg3 == var6.field1760 && var6.field2102 == arg2 && ~var6.field2107 == -1) {
                    var4 = var6.field2098;
                    break;
                }
            }
        }
        if (arg0 < 105) {
            method337(61, 97, -72, 71, -76, 33, -88);
        }
        if (var4 != null) {
            arg1.method349(arg2, arg3, var4, true, -86);
        } else {
            byte[] var7 = arg2.method1340(arg3, (byte) 94);
            arg1.method349(arg2, arg3, var7, true, -94);
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(IIIIIII)I")
    public static final int method342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 & 3;
        ++field900;
        if (~(arg0 & 1) == -2) {
            int var8 = arg2;
            arg2 = arg6;
            arg6 = var8;
        }
        if (~var7 == -1) {
            return arg3;
        } else if (var7 == 1) {
            return arg4;
        } else {
            return arg1 == var7 ? -arg2 + 1 + -arg3 + 7 : -arg6 - -1 + 7 + -arg4;
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)V")
    public final void method73(byte arg0) {
        ++field899;
        int var2 = 18 / ((43 - arg0) / 41);
        if (this.field904 == null) {
            this.method338(26268, 1);
        }
        this.method336(3);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (~arg0 == -1) {
            int var4 = arg1.method897(116);
            if (var4 == 0) {
                this.field904 = new int[arg1.method897(-105)][4];
                for (int var5 = 0; var5 < this.field904.length; ++var5) {
                    this.field904[var5][0] = arg1.method876(false);
                    this.field904[var5][1] = arg1.method897(arg2 + 27) << 4;
                    this.field904[var5][2] = arg1.method897(arg2 + -188) << 4;
                    this.field904[var5][3] = arg1.method897(arg2 + -156) << 4;
                }
            } else {
                this.method338(26268, var4);
            }
        }
        if (arg2 != 82) {
            this.method46((byte) -17, 83);
        }
        ++field909;
    }
}
