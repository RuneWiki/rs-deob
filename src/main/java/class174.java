import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class174 extends class33 {

    @OriginalMember(owner = "client!re", name = "R", descriptor = "Lrd;")
    public static class173 field3426 = class133.method843("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", 45);

    @OriginalMember(owner = "client!re", name = "U", descriptor = "Lrd;")
    private static class173 field3429 = class133.method843("Loading fonts )2 ", 92);

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "Lrd;")
    public static class173 field3425 = field3429;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "Lrd;")
    public static class173 field3430 = class133.method843("gelb:", 16);

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "Lrd;")
    public static class173 field3433 = class133.method843(")1 ", 17);

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "Z")
    public static boolean field3435 = false;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "Lmb;")
    public static class121 field3427 = new class121(8);

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "Lrc;")
    public static class172 field3436 = null;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!re", name = "W", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!re", name = "X", descriptor = "[[I")
    private int[][] field3432;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V")
    public static void method1162(byte arg0) {
        field3430 = null;
        field3429 = null;
        field3433 = null;
        field3425 = null;
        field3427 = null;
        field3426 = null;
        if (arg0 > -30) {
            method1164(-47);
        }
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(B)V")
    public static final void method1163(byte arg0) {
        for (int var1 = 0; var1 < class36.field783; ++var1) {
            int var2 = class4.field97[var1];
            class212 var3 = class183.field3600[var2];
            int var4 = class70.field1358.method751((byte) -87);
            if (~(var4 & 1) != -1) {
                var4 += class70.field1358.method751((byte) 117) << 8;
            }
            class207.method1374(var2, 8, var3, var4);
        }
        if (arg0 > -12) {
            field3427 = null;
        }
        ++field3421;
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
    public static final void method1164(int arg0) {
        class157 var1 = (class157) client.field637.method684((byte) -76);
        if (arg0 >= 7) {
            while (var1 != null) {
                int var2 = var1.field2940;
                if (class212.method1389(-116, var2)) {
                    boolean var3 = true;
                    class165[] var4 = class63.field1232[var2];
                    for (int var5 = 0; var4.length > var5; ++var5) {
                        if (var4[var5] != null) {
                            var3 = var4[var5].field3108;
                            break;
                        }
                    }
                    if (!var3) {
                        int var6 = (int) var1.field2437;
                        class165 var7 = class103.method639(var6, true);
                        if (var7 != null) {
                            class209.method1379(1, var7);
                        }
                    }
                }
                var1 = (class157) client.field637.method678(false);
            }
            ++field3424;
        }
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
    public final void method179(int arg0) {
        if (arg0 != -1) {
            field3425 = null;
        }
        ++field3423;
        if (this.field3432 == null) {
            this.method1165(1, 15);
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(II)V")
    private final void method1165(int arg0, int arg1) {
        if (arg1 == 15) {
            ++field3431;
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 != -3) {
                        if (arg0 != 3) {
                            if (arg0 != 4) {
                                if (arg0 != 5) {
                                    if (arg0 == 6) {
                                        this.field3432 = new int[4][4];
                                        this.field3432[0][2] = 4096;
                                        this.field3432[0][1] = 0;
                                        this.field3432[1][2] = 4096;
                                        this.field3432[0][3] = 0;
                                        this.field3432[2][2] = 4096;
                                        this.field3432[0][0] = 2048;
                                        this.field3432[1][0] = 2867;
                                        this.field3432[3][2] = 0;
                                        this.field3432[1][3] = 0;
                                        this.field3432[2][0] = 3276;
                                        this.field3432[3][0] = 4096;
                                        this.field3432[2][3] = 0;
                                        this.field3432[1][1] = 4096;
                                        this.field3432[2][1] = 4096;
                                        this.field3432[3][1] = 4096;
                                        this.field3432[3][3] = 0;
                                    } else {
                                        throw new RuntimeException("Invalid gradient preset");
                                    }
                                } else {
                                    this.field3432 = new int[16][4];
                                    this.field3432[0][3] = 321;
                                    this.field3432[0][1] = 80;
                                    this.field3432[0][0] = 0;
                                    this.field3432[0][2] = 192;
                                    this.field3432[1][1] = 321;
                                    this.field3432[1][3] = 562;
                                    this.field3432[2][1] = 578;
                                    this.field3432[1][2] = 449;
                                    this.field3432[1][0] = 155;
                                    this.field3432[2][0] = 389;
                                    this.field3432[3][1] = 947;
                                    this.field3432[2][2] = 690;
                                    this.field3432[2][3] = 803;
                                    this.field3432[3][0] = 671;
                                    this.field3432[3][3] = 1140;
                                    this.field3432[3][2] = 995;
                                    this.field3432[4][1] = 1285;
                                    this.field3432[4][0] = 897;
                                    this.field3432[4][3] = 1509;
                                    this.field3432[5][1] = 1525;
                                    this.field3432[5][0] = 1175;
                                    this.field3432[5][3] = 1413;
                                    this.field3432[6][1] = 1734;
                                    this.field3432[4][2] = 1397;
                                    this.field3432[5][2] = 1429;
                                    this.field3432[7][1] = 1413;
                                    this.field3432[6][3] = 1333;
                                    this.field3432[6][0] = 1368;
                                    this.field3432[6][2] = 1461;
                                    this.field3432[7][2] = 1525;
                                    this.field3432[7][3] = 1702;
                                    this.field3432[7][0] = 1507;
                                    this.field3432[8][0] = 1736;
                                    this.field3432[8][3] = 2056;
                                    this.field3432[9][3] = 2666;
                                    this.field3432[10][3] = 3276;
                                    this.field3432[9][0] = 2088;
                                    this.field3432[10][0] = 2355;
                                    this.field3432[8][1] = 1108;
                                    this.field3432[11][0] = 2691;
                                    this.field3432[9][1] = 1766;
                                    this.field3432[11][3] = 3228;
                                    this.field3432[12][0] = 3031;
                                    this.field3432[12][3] = 3196;
                                    this.field3432[13][3] = 3019;
                                    this.field3432[14][3] = 3228;
                                    this.field3432[15][3] = 2746;
                                    this.field3432[10][1] = 2409;
                                    this.field3432[13][0] = 3522;
                                    this.field3432[11][1] = 3116;
                                    this.field3432[12][1] = 3806;
                                    this.field3432[13][1] = 3437;
                                    this.field3432[14][1] = 3116;
                                    this.field3432[8][2] = 1590;
                                    this.field3432[14][0] = 3727;
                                    this.field3432[9][2] = 2056;
                                    this.field3432[15][1] = 2377;
                                    this.field3432[10][2] = 2586;
                                    this.field3432[11][2] = 3148;
                                    this.field3432[12][2] = 3710;
                                    this.field3432[13][2] = 3421;
                                    this.field3432[14][2] = 3148;
                                    this.field3432[15][0] = 4096;
                                    this.field3432[15][2] = 2505;
                                }
                            } else {
                                this.field3432 = new int[6][4];
                                this.field3432[0][3] = 0;
                                this.field3432[0][2] = 0;
                                this.field3432[1][3] = 1493;
                                this.field3432[0][0] = 0;
                                this.field3432[1][0] = 1843;
                                this.field3432[1][2] = 0;
                                this.field3432[0][1] = 0;
                                this.field3432[2][2] = 0;
                                this.field3432[2][0] = 2457;
                                this.field3432[3][0] = 2781;
                                this.field3432[3][2] = 1124;
                                this.field3432[2][3] = 2939;
                                this.field3432[3][3] = 3565;
                                this.field3432[4][0] = 3481;
                                this.field3432[4][2] = 3084;
                                this.field3432[1][1] = 0;
                                this.field3432[4][3] = 4031;
                                this.field3432[5][3] = 4096;
                                this.field3432[2][1] = 0;
                                this.field3432[5][2] = 4096;
                                this.field3432[3][1] = 0;
                                this.field3432[4][1] = 546;
                                this.field3432[5][1] = 4096;
                                this.field3432[5][0] = 4096;
                            }
                        } else {
                            this.field3432 = new int[7][4];
                            this.field3432[0][3] = 4096;
                            this.field3432[0][0] = 0;
                            this.field3432[1][0] = 663;
                            this.field3432[2][0] = 1363;
                            this.field3432[1][3] = 4096;
                            this.field3432[2][3] = 0;
                            this.field3432[0][1] = 0;
                            this.field3432[3][3] = 0;
                            this.field3432[3][0] = 2048;
                            this.field3432[4][3] = 0;
                            this.field3432[1][1] = 0;
                            this.field3432[0][2] = 0;
                            this.field3432[4][0] = 2727;
                            this.field3432[5][0] = 3411;
                            this.field3432[6][0] = 4096;
                            this.field3432[2][1] = 0;
                            this.field3432[1][2] = 4096;
                            this.field3432[5][3] = 4096;
                            this.field3432[3][1] = 4096;
                            this.field3432[2][2] = 4096;
                            this.field3432[6][3] = 4096;
                            this.field3432[4][1] = 4096;
                            this.field3432[3][2] = 4096;
                            this.field3432[4][2] = 0;
                            this.field3432[5][2] = 0;
                            this.field3432[5][1] = 4096;
                            this.field3432[6][2] = 0;
                            this.field3432[6][1] = 0;
                        }
                    } else {
                        this.field3432 = new int[8][4];
                        this.field3432[0][2] = 2602;
                        this.field3432[0][3] = 2361;
                        this.field3432[1][2] = 1799;
                        this.field3432[0][1] = 2650;
                        this.field3432[1][3] = 1558;
                        this.field3432[0][0] = 0;
                        this.field3432[1][1] = 2313;
                        this.field3432[2][3] = 1413;
                        this.field3432[3][3] = 947;
                        this.field3432[4][3] = 722;
                        this.field3432[1][0] = 2867;
                        this.field3432[2][0] = 3072;
                        this.field3432[3][0] = 3276;
                        this.field3432[4][0] = 3481;
                        this.field3432[5][0] = 3686;
                        this.field3432[2][2] = 1734;
                        this.field3432[6][0] = 3891;
                        this.field3432[5][3] = 1766;
                        this.field3432[2][1] = 2618;
                        this.field3432[7][0] = 4096;
                        this.field3432[3][2] = 1220;
                        this.field3432[6][3] = 915;
                        this.field3432[3][1] = 2296;
                        this.field3432[7][3] = 1140;
                        this.field3432[4][2] = 963;
                        this.field3432[5][2] = 2152;
                        this.field3432[6][2] = 1060;
                        this.field3432[4][1] = 2072;
                        this.field3432[5][1] = 2730;
                        this.field3432[7][2] = 1413;
                        this.field3432[6][1] = 2232;
                        this.field3432[7][1] = 1686;
                    }
                } else {
                    this.field3432 = new int[2][4];
                    this.field3432[0][3] = 0;
                    this.field3432[0][2] = 0;
                    this.field3432[0][0] = 0;
                    this.field3432[1][0] = 4096;
                    this.field3432[0][1] = 0;
                    this.field3432[1][1] = 4096;
                    this.field3432[1][2] = 4096;
                    this.field3432[1][3] = 4096;
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    public class174() {
        super(1, false);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (arg0 == 0) {
            int var4 = arg2.method751((byte) -47);
            if (var4 != 0) {
                this.method1165(var4, 15);
            } else {
                this.field3432 = new int[arg2.method751((byte) -36)][4];
                for (int var5 = 0; ~this.field3432.length < ~var5; ++var5) {
                    this.field3432[var5][0] = arg2.method755((byte) -81);
                    this.field3432[var5][1] = arg2.method751((byte) -119) << 4;
                    this.field3432[var5][2] = arg2.method751((byte) -90) << 4;
                    this.field3432[var5][3] = arg2.method751((byte) 88) << 4;
                }
            }
        }
        ++field3422;
        if (arg1 > -99) {
            field3430 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(B)V")
    public static final void method1166(byte arg0) {
        ++field3428;
        if (class96.field1764 == 181) {
            int var1 = class70.field1358.method735((byte) -51);
            int var2 = var1 >> 2;
            int var3 = var1 & 3;
            int var4 = class121.field2263[var2];
            int var5 = class70.field1358.method785(arg0 + 116);
            byte var6 = class70.field1358.method747(55);
            byte var7 = class70.field1358.method767(arg0 + 11);
            int var8 = class70.field1358.method742((byte) -98);
            int var9 = class70.field1358.method742((byte) -98);
            int var10 = class70.field1358.method785(-1);
            byte var11 = class70.field1358.method768(128);
            byte var12 = class70.field1358.method760(-48);
            int var13 = class70.field1358.method735((byte) -51);
            int var14 = class10.field174 - -(7 & var13);
            int var15 = ((127 & var13) >> 4) + client.field636;
            class212 var16;
            if (~class33.field733 != ~var8) {
                var16 = class183.field3600[var8];
            } else {
                var16 = class175.field3447;
            }
            if (var16 != null) {
                class4 var17 = class182.method1237(true, var5);
                int var18;
                int var19;
                if (var3 != 1 && ~var3 != -4) {
                    var18 = var17.field67;
                    var19 = var17.field61;
                } else {
                    var19 = var17.field67;
                    var18 = var17.field61;
                }
                int var20 = (var19 + 1 >> 1) + var15;
                int var21 = var14 - -(var18 >> 1);
                int var22 = (var18 + 1 >> 1) + var14;
                int var23 = (var19 >> 1) + var15;
                int[][] var24 = class46.field975[class172.field3347];
                int var25 = (var14 << 7) + (var18 << 6);
                int var26 = (var15 << 7) - -(var19 << 6);
                int var27 = var24[var23][var21] + var24[var23][var22] - (-var24[var20][var21] + -var24[var20][var22]) >> 2;
                class213 var28 = var17.method29(var3, var27, true, var2, var25, var26, var24);
                if (var28 != null) {
                    if (~var11 < ~var7) {
                        byte var29 = var11;
                        var11 = var7;
                        var7 = var29;
                    }
                    class47.method328(0, -1, var9 + 1, class172.field3347, var10 + 1, true, var4, var14, 0, var15);
                    var16.field4116 = class217.field4203 + var9;
                    var16.field4101 = class217.field4203 + var10;
                    var16.field4107 = var7 + var15;
                    var16.field4098 = var14 * 128 + var18 * 64;
                    var16.field4114 = var15 * 128 + var19 * 64;
                    var16.field4125 = var28;
                    var16.field4111 = var27;
                    var16.field4112 = var15 - -var11;
                    if (var6 < var12) {
                        byte var30 = var12;
                        var12 = var6;
                        var6 = var30;
                    }
                    var16.field4095 = var6 + var14;
                    var16.field4126 = var12 + var14;
                }
            }
        }
        if (~class96.field1764 == -11) {
            int var31 = class70.field1358.method753(arg0 + 372);
            int var32 = 3 & var31;
            int var33 = var31 >> 2;
            int var34 = class121.field2263[var33];
            int var35 = class70.field1358.method735((byte) -51);
            int var36 = (var35 >> 4 & 7) + client.field636;
            int var37 = (7 & var35) + class10.field174;
            if (~var36 <= -1 && var37 >= 0 && var36 < 104 && var37 < 104) {
                class47.method328(var32, -1, 0, class172.field3347, -1, true, var34, var37, var33, var36);
            }
        } else if (class96.field1764 == 242) {
            int var38 = class70.field1358.method751((byte) 91);
            int var39 = (7 & var38) + class10.field174;
            int var40 = (var38 >> 4 & 7) + client.field636;
            int var41 = class70.field1358.method755((byte) -42);
            int var42 = class70.field1358.method755((byte) -55);
            int var43 = class70.field1358.method755((byte) -40);
            if (var40 >= 0 && ~var39 <= -1 && ~var40 > -105 && ~var39 > -105) {
                class145 var44 = class160.field2985[class172.field3347][var40][var39];
                if (var44 != null) {
                    for (class205 var45 = (class205) var44.method915(-1); var45 != null; var45 = (class205) var44.method910((byte) 88)) {
                        if (~(var41 & 32767) == ~var45.field4009 && ~var45.field4012 == ~var42) {
                            var45.field4012 = var43;
                            break;
                        }
                    }
                    class187.method1256((byte) -101, var40, var39);
                }
            }
        } else if (~class96.field1764 == -62) {
            int var46 = class70.field1358.method751((byte) -75);
            int var47 = ((var46 & 114) >> 4) + client.field636;
            int var48 = (var46 & 7) + class10.field174;
            int var49 = class70.field1358.method785(-1);
            if (~var47 <= -1 && var48 >= 0 && var47 < 104 && var48 < 104) {
                class145 var50 = class160.field2985[class172.field3347][var47][var48];
                if (var50 != null) {
                    for (class205 var51 = (class205) var50.method915(-1); var51 != null; var51 = (class205) var50.method910((byte) 88)) {
                        if (~(32767 & var49) == ~var51.field4009) {
                            var51.method824((byte) -124);
                            break;
                        }
                    }
                    if (var50.method915(-1) == null) {
                        class160.field2985[class172.field3347][var47][var48] = null;
                    }
                    class187.method1256((byte) -101, var47, var48);
                }
            }
        } else if (~class96.field1764 == -178) {
            int var52 = class70.field1358.method735((byte) -51);
            int var53 = (var52 & 7) + class10.field174;
            int var54 = ((115 & var52) >> 4) + client.field636;
            int var55 = class70.field1358.method753(255);
            int var56 = var55 & 3;
            int var57 = var55 >> 2;
            int var58 = class121.field2263[var57];
            int var59 = class70.field1358.method755((byte) -20);
            if (~var54 <= -1 && var53 >= 0 && ~var54 > -105 && var53 < 104) {
                class47.method328(var56, var59, 0, class172.field3347, -1, true, var58, var53, var57, var54);
            }
        } else if (arg0 == -117) {
            if (class96.field1764 != 72) {
                if (class96.field1764 == 13) {
                    int var74 = class70.field1358.method779(15151);
                    int var75 = class10.field174 - -(7 & var74);
                    int var76 = ((121 & var74) >> 4) + client.field636;
                    int var77 = class70.field1358.method742((byte) -98);
                    int var78 = class70.field1358.method742((byte) -98);
                    int var79 = class70.field1358.method755((byte) -30);
                    if (var76 >= 0 && var75 >= 0 && var76 < 104 && var75 < 104 && ~class33.field733 != ~var79) {
                        class205 var80 = new class205();
                        var80.field4009 = var77;
                        var80.field4012 = var78;
                        if (class160.field2985[class172.field3347][var76][var75] == null) {
                            class160.field2985[class172.field3347][var76][var75] = new class145();
                        }
                        class160.field2985[class172.field3347][var76][var75].method920(false, var80);
                        class187.method1256((byte) -104, var76, var75);
                    }
                } else if (~class96.field1764 == -117) {
                    int var81 = class70.field1358.method751((byte) 111);
                    int var82 = (var81 & 7) + class10.field174;
                    int var83 = (7 & var81 >> 4) + client.field636;
                    int var84 = var83 + class70.field1358.method767(-114);
                    int var85 = class70.field1358.method767(-82) + var82;
                    int var86 = class70.field1358.method782(true);
                    int var87 = class70.field1358.method755((byte) -80);
                    int var88 = 4 * class70.field1358.method751((byte) 87);
                    int var89 = 4 * class70.field1358.method751((byte) -50);
                    int var90 = class70.field1358.method755((byte) -111);
                    int var91 = class70.field1358.method755((byte) -58);
                    int var92 = class70.field1358.method751((byte) 85);
                    int var93 = class70.field1358.method751((byte) -109);
                    if (~var83 <= -1 && var82 >= 0 && var83 < 104 && ~var82 > -105 && ~var84 <= -1 && ~var85 <= -1 && var84 < 104 && var85 < 104 && var87 != 65535) {
                        int var94 = var84 * 128 + 64;
                        int var95 = var83 * 128 + 64;
                        int var96 = var82 * 128 + 64;
                        int var97 = var85 * 128 - -64;
                        class46 var98 = new class46(var87, class172.field3347, var95, var96, -var88 + class56.method361(class172.field3347, var96, (byte) -66, var95), class217.field4203 + var90, var91 - -class217.field4203, var92, var93, var86, var89);
                        var98.method324(false, var94, -var89 + class56.method361(class172.field3347, var97, (byte) -121, var94), class217.field4203 + var90, var97);
                        class184.field3609.method920(false, var98);
                    }
                } else if (class96.field1764 == 90) {
                    int var99 = class70.field1358.method751((byte) -109);
                    int var100 = (var99 & 7) + class10.field174;
                    int var101 = client.field636 - -(var99 >> 4 & 7);
                    int var102 = class70.field1358.method755((byte) -32);
                    int var103 = class70.field1358.method751((byte) -26);
                    int var104 = class70.field1358.method755((byte) -78);
                    if (var101 >= 0 && ~var100 <= -1 && ~var101 > -105 && ~var100 > -105) {
                        int var105 = var100 * 128 + 64;
                        int var106 = var101 * 128 + 64;
                        class100 var107 = new class100(var102, class172.field3347, var106, var105, -var103 + class56.method361(class172.field3347, var105, (byte) 101, var106), var104, class217.field4203);
                        class170.field3281.method920(false, var107);
                    }
                } else if (~class96.field1764 == -123) {
                    int var108 = class70.field1358.method735((byte) -51);
                    int var109 = (var108 & 7) + class10.field174;
                    int var110 = (7 & var108 >> 4) + client.field636;
                    int var111 = class70.field1358.method785(arg0 ^ 116);
                    int var112 = class70.field1358.method742((byte) -98);
                    if (~var110 <= -1 && ~var109 <= -1 && ~var110 > -105 && ~var109 > -105) {
                        class205 var113 = new class205();
                        var113.field4009 = var111;
                        var113.field4012 = var112;
                        if (class160.field2985[class172.field3347][var110][var109] == null) {
                            class160.field2985[class172.field3347][var110][var109] = new class145();
                        }
                        class160.field2985[class172.field3347][var110][var109].method920(false, var113);
                        class187.method1256((byte) -123, var110, var109);
                    }
                } else {
                    if (~class96.field1764 == -43) {
                        int var114 = class70.field1358.method751((byte) -97);
                        int var115 = ((var114 & 124) >> 4) + client.field636;
                        int var116 = (7 & var114) + class10.field174;
                        int var117 = class70.field1358.method755((byte) -94);
                        int var118 = class70.field1358.method751((byte) -32);
                        if (~var117 == -65536) {
                            var117 = -1;
                        }
                        int var119 = 15 & var118 >> 4;
                        int var120 = class70.field1358.method751((byte) 103);
                        int var121 = var118 & 7;
                        if (~var115 <= -1 && var116 >= 0 && var115 < 104 && var116 < 104) {
                            int var122 = var119 + 1;
                            if (~(-var122 + var115) >= ~class175.field3447.field2764[0] && class175.field3447.field2764[0] <= var115 - -var122 && class175.field3447.field2814[0] >= var116 - var122 && ~class175.field3447.field2814[0] >= ~(var116 + var122) && class31.field667 != 0 && ~var121 < -1 && class73.field1421 < 50 && var117 != -1) {
                                class92.field1741[class73.field1421] = var117;
                                class20.field456[class73.field1421] = var121;
                                class164.field3027[class73.field1421] = var120;
                                class178.field3490[class73.field1421] = null;
                                class119.field2187[class73.field1421] = (var115 << 16) + (var116 << 8) + var119;
                                ++class73.field1421;
                                return;
                            }
                        }
                    }
                }
            } else {
                int var60 = class70.field1358.method742((byte) -98);
                int var61 = class70.field1358.method779(15151);
                int var62 = client.field636 - -((var61 & 126) >> 4);
                int var63 = class10.field174 - -(var61 & 7);
                int var64 = class70.field1358.method779(arg0 + 15268);
                int var65 = var64 >> 2;
                int var66 = var64 & 3;
                int var67 = class121.field2263[var65];
                if (var62 >= 0 && ~var63 <= -1 && var62 < 103 && ~var63 > -104) {
                    if (var67 == 0) {
                        class107 var68 = class28.method225(class172.field3347, var62, var63);
                        if (var68 != null) {
                            int var69 = Integer.MAX_VALUE & (int) (var68.field1997 >>> 32);
                            if (~var65 == -3) {
                                var68.field1995 = new class166(var69, 2, var66 + 4, class172.field3347, var62, var63, var60, false, var68.field1995);
                                var68.field1987 = new class166(var69, 2, var66 + 1 & 3, class172.field3347, var62, var63, var60, false, var68.field1987);
                            } else {
                                var68.field1995 = new class166(var69, var65, var66, class172.field3347, var62, var63, var60, false, var68.field1995);
                            }
                        }
                    }
                    if (var67 == 1) {
                        class216 var70 = class219.method1425(class172.field3347, var62, var63);
                        if (var70 != null) {
                            int var71 = Integer.MAX_VALUE & (int) (var70.field4178 >>> 32);
                            if (var65 != 4 && ~var65 != -6) {
                                if (~var65 != -7) {
                                    if (var65 != 7) {
                                        if (~var65 == -9) {
                                            var70.field4184 = new class166(var71, 4, var66 + 4, class172.field3347, var62, var63, var60, false, var70.field4184);
                                            var70.field4183 = new class166(var71, 4, (var66 + 2 & 3) + 4, class172.field3347, var62, var63, var60, false, var70.field4183);
                                        }
                                    } else {
                                        var70.field4184 = new class166(var71, 4, (var66 - -2 & 3) + 4, class172.field3347, var62, var63, var60, false, var70.field4184);
                                    }
                                } else {
                                    var70.field4184 = new class166(var71, 4, var66 + 4, class172.field3347, var62, var63, var60, false, var70.field4184);
                                }
                            } else {
                                var70.field4184 = new class166(var71, 4, var66, class172.field3347, var62, var63, var60, false, var70.field4184);
                            }
                        }
                    }
                    if (~var67 == -3) {
                        class5 var72 = class155.method1030(class172.field3347, var62, var63);
                        if (var65 == 11) {
                            var65 = 10;
                        }
                        if (var72 != null) {
                            var72.field113 = new class166(Integer.MAX_VALUE & (int) (var72.field123 >>> 32), var65, var66, class172.field3347, var62, var63, var60, false, var72.field113);
                        }
                    }
                    if (var67 == 3) {
                        class22 var73 = class148.method980(class172.field3347, var62, var63);
                        if (var73 != null) {
                            var73.field475 = new class166(Integer.MAX_VALUE & (int) (var73.field487 >>> 32), 22, var66, class172.field3347, var62, var63, var60, false, var73.field475);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II)[[I")
    public final int[][] method178(int arg0, int arg1) {
        int[][] var3 = super.field731.method1340(94, arg1);
        ++field3434;
        if (arg0 < 112) {
            field3426 = null;
        }
        if (super.field731.field3925) {
            int var4 = this.field3432.length;
            int[] var5 = this.method262(arg1, 124, 0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            if (~var4 < -1) {
                for (int var9 = 0; ~var9 > ~class117.field2173; ++var9) {
                    int var10 = var5[var9];
                    int var11 = 0;
                    for (int var12 = 0; ~var4 < ~var12 && ~var10 <= ~this.field3432[var12][0]; ++var12) {
                        ++var11;
                    }
                    if (~var4 < ~var11) {
                        int[] var13 = this.field3432[var11];
                        if (~var11 < -1) {
                            int[] var14 = this.field3432[var11 + -1];
                            int var15 = (-var14[0] + var10 << 12) / (var13[0] + -var14[0]);
                            int var16 = -var15 + 4096;
                            var6[var9] = var13[1] * var15 - -(var14[1] * var16) >> 12;
                            var7[var9] = var13[2] * var15 + var14[2] * var16 >> 12;
                            var8[var9] = var13[3] * var15 + var14[3] * var16 >> 12;
                        } else {
                            var6[var9] = var13[1];
                            var7[var9] = var13[2];
                            var8[var9] = var13[3];
                        }
                    } else {
                        int[] var17 = this.field3432[var4 + -1];
                        var6[var9] = var17[1];
                        var7[var9] = var17[2];
                        var8[var9] = var17[3];
                    }
                }
            } else {
                for (int var18 = 0; class117.field2173 > var18; ++var18) {
                    var6[var18] = 0;
                    var7[var18] = 0;
                    var8[var18] = 0;
                }
            }
        }
        return var3;
    }
}
