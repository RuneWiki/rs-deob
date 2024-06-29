import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class69 extends class170 {

    @OriginalMember(owner = "client!ge", name = "gb", descriptor = "[I")
    private int[] field1230 = new int[257];

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "S")
    public static short field1220 = 32767;

    @OriginalMember(owner = "client!ge", name = "bb", descriptor = "Lc;")
    public static class105 field1225 = new class105(64);

    @OriginalMember(owner = "client!ge", name = "nb", descriptor = "[Lqk;")
    public static class207[] field1237 = null;

    @OriginalMember(owner = "client!ge", name = "lb", descriptor = "J")
    public static long field1235 = 0L;

    @OriginalMember(owner = "client!ge", name = "mb", descriptor = "Lbf;")
    public static class199 field1236 = new class199(200);

    @OriginalMember(owner = "client!ge", name = "rb", descriptor = "[I")
    public static int[] field1241 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ge", name = "ob", descriptor = "Lqk;")
    public static class207 field1238 = class24.method212(255, "null");

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!ge", name = "cb", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!ge", name = "db", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!ge", name = "fb", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!ge", name = "hb", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!ge", name = "ib", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!ge", name = "jb", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!ge", name = "kb", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!ge", name = "qb", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!ge", name = "pb", descriptor = "[I")
    public static int[] field1239;

    @OriginalMember(owner = "client!ge", name = "eb", descriptor = "[[I")
    private int[][] field1228;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method32(int arg0, boolean arg1) {
        ++field1226;
        if (arg1) {
            method502(-8);
        }
        int[][] var3 = super.field3002.method427(arg0, 239);
        if (super.field3002.field1077) {
            int[] var4 = this.method1226(0, arg0, -49);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class88.field1595; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1230[var9];
                var5[var8] = class121.method860(16711680, var10) >> 12;
                var6[var8] = class121.method860(4080, var10 >> 4);
                var7[var8] = class121.method860(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lqk;Z)V")
    public static final void method496(class207 arg0, boolean arg1) {
        ++field1227;
        if (class105.field1859 != null) {
            int var2 = 0;
            long var3 = arg0.method1428(0);
            if (var3 != 0L) {
                while (~class105.field1859.length < ~var2 && class105.field1859[var2].field3407 != var3) {
                    ++var2;
                }
                if (!arg1) {
                    method500((class286) null, false, -92);
                }
                if (~class105.field1859.length < ~var2 && class105.field1859[var2] != null) {
                    class261.field4645.method767(200, (byte) 58);
                    ++class162.field2871;
                    class261.field4645.method1048((byte) 102, class105.field1859[var2].field3407);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V")
    public final void method50(int arg0) {
        if (arg0 <= 14) {
            method499(-75);
        }
        if (this.field1228 == null) {
            this.method504(101, 1);
        }
        ++field1234;
        this.method498(9413);
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    public class69() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZIIILri;)V")
    public static final void method497(int arg0, boolean arg1, int arg2, int arg3, int arg4, class65 arg5) {
        ++field1222;
        if (class242.field4404 < 50) {
            if (arg5.field1157 != null && arg5.field1157.length > arg2 && arg5.field1157[arg2] != null) {
                int var6 = arg5.field1157[arg2][0];
                if (arg3 > -19) {
                    method502(-97);
                }
                int var7 = var6 >> 8;
                if (arg5.field1157[arg2].length > 1) {
                    int var8 = (int) ((double) arg5.field1157[arg2].length * Math.random());
                    if (var8 > 0) {
                        var7 = arg5.field1157[arg2][var8];
                    }
                }
                int var9 = (224 & var6) >> 5;
                int var10 = 31 & var6;
                if (var10 == 0) {
                    if (arg1) {
                        class197.method1368(0, var9, true, var7);
                    }
                } else if (~class167.field2927 != -1) {
                    class162.field2868[class242.field4404] = var7;
                    int var11 = (arg4 + -64) / 128;
                    int var12 = (arg0 + -64) / 128;
                    class245.field4435[class242.field4404] = var9;
                    class73.field1344[class242.field4404] = 0;
                    class261.field4656[class242.field4404] = null;
                    class285.field5004[class242.field4404] = (var11 << 8) + (var12 << 16) + var10;
                    ++class242.field4404;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "(I)V")
    private final void method498(int arg0) {
        ++field1232;
        int var2 = this.field1228.length;
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && ~var5 <= ~this.field1228[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var2 <= var4) {
                    int[] var7 = this.field1228[var2 + -1];
                    var8 = var7[1];
                    var9 = var7[2];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field1228[var4];
                    if (var4 > 0) {
                        int[] var12 = this.field1228[var4 + -1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] - var12[0]);
                        int var14 = -var13 + 4096;
                        var8 = var11[1] * var13 + var12[1] * var14 >> 12;
                        var10 = var11[3] * var13 - -(var12[3] * var14) >> 12;
                        var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                    } else {
                        var9 = var11[2];
                        var8 = var11[1];
                        var10 = var11[3];
                    }
                }
                int var15 = var8 >> 4;
                int var16 = var9 >> 4;
                if (~var16 > -1) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                if (~var15 <= -1) {
                    if (var15 > 255) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                int var17 = var10 >> 4;
                if (~var17 > -1) {
                    var17 = 0;
                } else if (~var17 < -256) {
                    var17 = 255;
                }
                this.field1230[var3] = class281.method1906(class281.method1906(var15 << 16, var16 << 8), var17);
            }
        }
        if (arg0 != 9413) {
            method502(41);
        }
    }

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "(I)V")
    public static final void method499(int arg0) {
        ++field1224;
        if (arg0 != 6) {
            field1237 = null;
        }
        class102.field1843.method1382(31346);
        class56.field1041.method1382(31346);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Llh;ZI)V")
    public static final void method500(class286 arg0, boolean arg1, int arg2) {
        if (~class160.field2844 <= ~arg0.field5038) {
            if (arg0.field5086 >= class160.field2844) {
                class55.method413(arg0, (byte) 100);
            } else {
                class32.method245(arg0, 290);
            }
        } else {
            class242.method1711(arg0, (byte) 42);
        }
        ++field1229;
        if (arg0.field5104 < 128 || arg0.field5072 < 128 || ~arg0.field5104 <= -13185 || ~arg0.field5072 <= -13185) {
            arg0.field5086 = 0;
            arg0.field5052 = -1;
            arg0.field5105 = -1;
            arg0.field5038 = 0;
            arg0.field5104 = arg0.field5022[0] * 128 - -(arg0.method83(true) * 64);
            arg0.field5072 = arg0.field5074[0] * 128 - -(64 * arg0.method83(true));
            arg0.method1949(10317);
        }
        if (class202.field3565 == arg0 && (~arg0.field5104 > -1537 || ~arg0.field5072 > -1537 || ~arg0.field5104 <= -11777 || ~arg0.field5072 <= -11777)) {
            arg0.field5038 = 0;
            arg0.field5105 = -1;
            arg0.field5086 = 0;
            arg0.field5052 = -1;
            arg0.field5104 = arg0.field5022[0] * 128 + 64 * arg0.method83(!arg1);
            arg0.field5072 = arg0.field5074[0] * 128 + 64 * arg0.method83(!arg1);
            arg0.method1949(10317);
        }
        class199.method1388(arg0, (byte) 108);
        class199.method1380(arg0, (byte) 47);
        if (arg1) {
            method499(41);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        ++field1221;
        if (arg2 == 0) {
            int var4 = arg0.method1045((byte) 107);
            if (var4 == 0) {
                this.field1228 = new int[arg0.method1045((byte) -104)][4];
                for (int var5 = 0; this.field1228.length > var5; ++var5) {
                    this.field1228[var5][0] = arg0.method1050(arg1 + 1272000691);
                    this.field1228[var5][1] = arg0.method1045((byte) 104) << 4;
                    this.field1228[var5][2] = arg0.method1045((byte) -76) << 4;
                    this.field1228[var5][3] = arg0.method1045((byte) -88) << 4;
                }
            } else {
                this.method504(118, var4);
            }
        }
        if (arg1 != 5877) {
            field1239 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILnb;)V")
    public static final void method501(int arg0, class206 arg1) {
        class10.method59(false, 200000, arg1);
        int var2 = -45 / ((arg0 - -1) / 60);
        ++field1231;
    }

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "(I)V")
    public static void method502(int arg0) {
        field1225 = null;
        if (arg0 == -3132) {
            field1237 = null;
            field1239 = null;
            field1236 = null;
            field1241 = null;
            field1238 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(BI)V")
    public static final void method503(byte arg0, int arg1) {
        if (arg0 != -18) {
            field1235 = 98L;
        }
        class90 var2 = class221.method1575(10, arg1, arg0 ^ -1651481970);
        ++field1233;
        var2.method651(-27655);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
    private final void method504(int arg0, int arg1) {
        ++field1223;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1228 = new int[4][4];
                                this.field1228[0][0] = 2048;
                                this.field1228[0][3] = 0;
                                this.field1228[1][0] = 2867;
                                this.field1228[2][0] = 3276;
                                this.field1228[3][0] = 4096;
                                this.field1228[0][2] = 4096;
                                this.field1228[1][3] = 0;
                                this.field1228[2][3] = 0;
                                this.field1228[1][2] = 4096;
                                this.field1228[3][3] = 0;
                                this.field1228[0][1] = 0;
                                this.field1228[2][2] = 4096;
                                this.field1228[1][1] = 4096;
                                this.field1228[3][2] = 0;
                                this.field1228[2][1] = 4096;
                                this.field1228[3][1] = 4096;
                            } else {
                                this.field1228 = new int[16][4];
                                this.field1228[0][0] = 0;
                                this.field1228[0][1] = 80;
                                this.field1228[1][1] = 321;
                                this.field1228[1][0] = 155;
                                this.field1228[0][3] = 321;
                                this.field1228[2][0] = 389;
                                this.field1228[2][1] = 578;
                                this.field1228[3][0] = 671;
                                this.field1228[3][1] = 947;
                                this.field1228[4][1] = 1285;
                                this.field1228[1][3] = 562;
                                this.field1228[2][3] = 803;
                                this.field1228[0][2] = 192;
                                this.field1228[4][0] = 897;
                                this.field1228[3][3] = 1140;
                                this.field1228[5][0] = 1175;
                                this.field1228[6][0] = 1368;
                                this.field1228[1][2] = 449;
                                this.field1228[2][2] = 690;
                                this.field1228[4][3] = 1509;
                                this.field1228[5][1] = 1525;
                                this.field1228[7][0] = 1507;
                                this.field1228[8][0] = 1736;
                                this.field1228[9][0] = 2088;
                                this.field1228[6][1] = 1734;
                                this.field1228[10][0] = 2355;
                                this.field1228[7][1] = 1413;
                                this.field1228[5][3] = 1413;
                                this.field1228[3][2] = 995;
                                this.field1228[6][3] = 1333;
                                this.field1228[11][0] = 2691;
                                this.field1228[4][2] = 1397;
                                this.field1228[7][3] = 1702;
                                this.field1228[12][0] = 3031;
                                this.field1228[8][1] = 1108;
                                this.field1228[9][1] = 1766;
                                this.field1228[8][3] = 2056;
                                this.field1228[10][1] = 2409;
                                this.field1228[11][1] = 3116;
                                this.field1228[5][2] = 1429;
                                this.field1228[9][3] = 2666;
                                this.field1228[13][0] = 3522;
                                this.field1228[14][0] = 3727;
                                this.field1228[10][3] = 3276;
                                this.field1228[15][0] = 4096;
                                this.field1228[11][3] = 3228;
                                this.field1228[12][1] = 3806;
                                this.field1228[13][1] = 3437;
                                this.field1228[6][2] = 1461;
                                this.field1228[14][1] = 3116;
                                this.field1228[15][1] = 2377;
                                this.field1228[7][2] = 1525;
                                this.field1228[8][2] = 1590;
                                this.field1228[9][2] = 2056;
                                this.field1228[10][2] = 2586;
                                this.field1228[11][2] = 3148;
                                this.field1228[12][3] = 3196;
                                this.field1228[12][2] = 3710;
                                this.field1228[13][3] = 3019;
                                this.field1228[14][3] = 3228;
                                this.field1228[15][3] = 2746;
                                this.field1228[13][2] = 3421;
                                this.field1228[14][2] = 3148;
                                this.field1228[15][2] = 2505;
                            }
                        } else {
                            this.field1228 = new int[6][4];
                            this.field1228[0][0] = 0;
                            this.field1228[0][2] = 0;
                            this.field1228[1][2] = 0;
                            this.field1228[1][0] = 1843;
                            this.field1228[0][1] = 0;
                            this.field1228[0][3] = 0;
                            this.field1228[2][0] = 2457;
                            this.field1228[3][0] = 2781;
                            this.field1228[2][2] = 0;
                            this.field1228[1][3] = 1493;
                            this.field1228[3][2] = 1124;
                            this.field1228[4][2] = 3084;
                            this.field1228[4][0] = 3481;
                            this.field1228[5][2] = 4096;
                            this.field1228[1][1] = 0;
                            this.field1228[2][1] = 0;
                            this.field1228[5][0] = 4096;
                            this.field1228[3][1] = 0;
                            this.field1228[4][1] = 546;
                            this.field1228[5][1] = 4096;
                            this.field1228[2][3] = 2939;
                            this.field1228[3][3] = 3565;
                            this.field1228[4][3] = 4031;
                            this.field1228[5][3] = 4096;
                        }
                    } else {
                        this.field1228 = new int[7][4];
                        this.field1228[0][3] = 4096;
                        this.field1228[0][1] = 0;
                        this.field1228[0][2] = 0;
                        this.field1228[1][1] = 0;
                        this.field1228[0][0] = 0;
                        this.field1228[1][2] = 4096;
                        this.field1228[2][1] = 0;
                        this.field1228[3][1] = 4096;
                        this.field1228[1][3] = 4096;
                        this.field1228[1][0] = 663;
                        this.field1228[2][2] = 4096;
                        this.field1228[2][3] = 0;
                        this.field1228[4][1] = 4096;
                        this.field1228[3][3] = 0;
                        this.field1228[4][3] = 0;
                        this.field1228[2][0] = 1363;
                        this.field1228[5][1] = 4096;
                        this.field1228[3][0] = 2048;
                        this.field1228[4][0] = 2727;
                        this.field1228[3][2] = 4096;
                        this.field1228[4][2] = 0;
                        this.field1228[5][0] = 3411;
                        this.field1228[5][3] = 4096;
                        this.field1228[6][1] = 0;
                        this.field1228[6][3] = 4096;
                        this.field1228[6][0] = 4096;
                        this.field1228[5][2] = 0;
                        this.field1228[6][2] = 0;
                    }
                } else {
                    this.field1228 = new int[8][4];
                    this.field1228[0][0] = 0;
                    this.field1228[0][3] = 2361;
                    this.field1228[1][3] = 1558;
                    this.field1228[1][0] = 2867;
                    this.field1228[2][0] = 3072;
                    this.field1228[0][2] = 2602;
                    this.field1228[0][1] = 2650;
                    this.field1228[1][1] = 2313;
                    this.field1228[2][3] = 1413;
                    this.field1228[2][1] = 2618;
                    this.field1228[3][1] = 2296;
                    this.field1228[4][1] = 2072;
                    this.field1228[3][3] = 947;
                    this.field1228[4][3] = 722;
                    this.field1228[1][2] = 1799;
                    this.field1228[2][2] = 1734;
                    this.field1228[3][2] = 1220;
                    this.field1228[3][0] = 3276;
                    this.field1228[4][2] = 963;
                    this.field1228[5][1] = 2730;
                    this.field1228[6][1] = 2232;
                    this.field1228[5][2] = 2152;
                    this.field1228[6][2] = 1060;
                    this.field1228[7][2] = 1413;
                    this.field1228[4][0] = 3481;
                    this.field1228[5][3] = 1766;
                    this.field1228[6][3] = 915;
                    this.field1228[7][3] = 1140;
                    this.field1228[7][1] = 1686;
                    this.field1228[5][0] = 3686;
                    this.field1228[6][0] = 3891;
                    this.field1228[7][0] = 4096;
                }
            } else {
                this.field1228 = new int[2][4];
                this.field1228[0][1] = 0;
                this.field1228[0][2] = 0;
                this.field1228[0][0] = 0;
                this.field1228[1][2] = 4096;
                this.field1228[1][1] = 4096;
                this.field1228[1][0] = 4096;
                this.field1228[0][3] = 0;
                this.field1228[1][3] = 4096;
            }
        }
        if (arg0 <= 66) {
            this.method498(109);
        }
    }
}
