import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class307 extends class198 {

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "[I")
    private int[] field4987 = new int[257];

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    public static int field4984 = 0;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "Z")
    public static boolean field4992 = false;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "[I")
    public static int[] field4996 = new int[50];

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "[[S")
    public static short[][] field4988 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "[[I")
    private int[][] field4998;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(B)V")
    private final void method2096(byte arg0) {
        ++field4985;
        int var2 = this.field4998.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && this.field4998[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var2 >= ~var4) {
                    int[] var7 = this.field4998[var2 + -1];
                    var8 = var7[1];
                    var9 = var7[2];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field4998[var4];
                    if (~var4 < -1) {
                        int[] var12 = this.field4998[var4 - 1];
                        int var13 = (var5 - var12[0] << 12) / (var11[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var10 = var11[3] * var13 + var12[3] * var14 >> 12;
                        var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var8 = var11[1] * var13 + var12[1] * var14 >> 12;
                    } else {
                        var8 = var11[1];
                        var10 = var11[3];
                        var9 = var11[2];
                    }
                }
                int var15 = var9 >> 4;
                int var16 = var8 >> 4;
                if (var15 >= 0) {
                    if (var15 > 255) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                int var17 = var10 >> 4;
                if (~var17 <= -1) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (~var16 > -1) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                this.field4987[var3] = class82.method554(var17, class82.method554(var16 << 16, var15 << 8));
            }
        }
        if (arg0 <= 40) {
            this.field4987 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(B)V")
    public static void method2097(byte arg0) {
        field4996 = null;
        field4988 = null;
        int var1 = -86 % ((arg0 - 35) / 39);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZC)C")
    public static final char method2098(boolean arg0, char arg1) {
        if (arg0) {
            return '\u001c';
        } else {
            ++field4995;
            return ~arg1 != -182 && arg1 != 402 ? Character.toTitleCase(arg1) : arg1;
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)V")
    public final void method142(byte arg0) {
        int var2 = -21 / ((-46 - arg0) / 47);
        if (this.field4998 == null) {
            this.method2099(255, 1);
        }
        ++field4999;
        this.method2096((byte) 50);
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class307() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)V")
    private final void method2099(int arg0, int arg1) {
        ++field4994;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field4998 = new int[4][4];
                                this.field4998[0][2] = 4096;
                                this.field4998[0][3] = 0;
                                this.field4998[1][3] = 0;
                                this.field4998[2][3] = 0;
                                this.field4998[0][1] = 0;
                                this.field4998[1][1] = 4096;
                                this.field4998[2][1] = 4096;
                                this.field4998[3][3] = 0;
                                this.field4998[0][0] = 2048;
                                this.field4998[1][0] = 2867;
                                this.field4998[3][1] = 4096;
                                this.field4998[2][0] = 3276;
                                this.field4998[3][0] = 4096;
                                this.field4998[1][2] = 4096;
                                this.field4998[2][2] = 4096;
                                this.field4998[3][2] = 0;
                            } else {
                                this.field4998 = new int[16][4];
                                this.field4998[0][1] = 80;
                                this.field4998[0][3] = 321;
                                this.field4998[1][1] = 321;
                                this.field4998[0][2] = 192;
                                this.field4998[2][1] = 578;
                                this.field4998[3][1] = 947;
                                this.field4998[4][1] = 1285;
                                this.field4998[0][0] = 0;
                                this.field4998[1][0] = 155;
                                this.field4998[1][2] = 449;
                                this.field4998[1][3] = 562;
                                this.field4998[5][1] = 1525;
                                this.field4998[6][1] = 1734;
                                this.field4998[7][1] = 1413;
                                this.field4998[2][0] = 389;
                                this.field4998[8][1] = 1108;
                                this.field4998[9][1] = 1766;
                                this.field4998[3][0] = 671;
                                this.field4998[2][3] = 803;
                                this.field4998[3][3] = 1140;
                                this.field4998[4][3] = 1509;
                                this.field4998[2][2] = 690;
                                this.field4998[3][2] = 995;
                                this.field4998[10][1] = 2409;
                                this.field4998[4][0] = 897;
                                this.field4998[11][1] = 3116;
                                this.field4998[4][2] = 1397;
                                this.field4998[5][2] = 1429;
                                this.field4998[12][1] = 3806;
                                this.field4998[13][1] = 3437;
                                this.field4998[5][3] = 1413;
                                this.field4998[14][1] = 3116;
                                this.field4998[15][1] = 2377;
                                this.field4998[5][0] = 1175;
                                this.field4998[6][2] = 1461;
                                this.field4998[6][3] = 1333;
                                this.field4998[7][2] = 1525;
                                this.field4998[7][3] = 1702;
                                this.field4998[6][0] = 1368;
                                this.field4998[7][0] = 1507;
                                this.field4998[8][3] = 2056;
                                this.field4998[8][0] = 1736;
                                this.field4998[8][2] = 1590;
                                this.field4998[9][0] = 2088;
                                this.field4998[9][3] = 2666;
                                this.field4998[10][3] = 3276;
                                this.field4998[11][3] = 3228;
                                this.field4998[12][3] = 3196;
                                this.field4998[9][2] = 2056;
                                this.field4998[10][2] = 2586;
                                this.field4998[11][2] = 3148;
                                this.field4998[12][2] = 3710;
                                this.field4998[13][2] = 3421;
                                this.field4998[10][0] = 2355;
                                this.field4998[13][3] = 3019;
                                this.field4998[14][3] = 3228;
                                this.field4998[14][2] = 3148;
                                this.field4998[15][2] = 2505;
                                this.field4998[11][0] = 2691;
                                this.field4998[12][0] = 3031;
                                this.field4998[15][3] = 2746;
                                this.field4998[13][0] = 3522;
                                this.field4998[14][0] = 3727;
                                this.field4998[15][0] = 4096;
                            }
                        } else {
                            this.field4998 = new int[6][4];
                            this.field4998[0][2] = 0;
                            this.field4998[0][3] = 0;
                            this.field4998[0][0] = 0;
                            this.field4998[1][2] = 0;
                            this.field4998[1][3] = 1493;
                            this.field4998[0][1] = 0;
                            this.field4998[1][0] = 1843;
                            this.field4998[2][2] = 0;
                            this.field4998[3][2] = 1124;
                            this.field4998[2][3] = 2939;
                            this.field4998[4][2] = 3084;
                            this.field4998[1][1] = 0;
                            this.field4998[2][0] = 2457;
                            this.field4998[2][1] = 0;
                            this.field4998[3][0] = 2781;
                            this.field4998[4][0] = 3481;
                            this.field4998[5][2] = 4096;
                            this.field4998[3][3] = 3565;
                            this.field4998[4][3] = 4031;
                            this.field4998[5][3] = 4096;
                            this.field4998[3][1] = 0;
                            this.field4998[5][0] = 4096;
                            this.field4998[4][1] = 546;
                            this.field4998[5][1] = 4096;
                        }
                    } else {
                        this.field4998 = new int[7][4];
                        this.field4998[0][3] = 4096;
                        this.field4998[0][0] = 0;
                        this.field4998[0][1] = 0;
                        this.field4998[1][0] = 663;
                        this.field4998[1][3] = 4096;
                        this.field4998[0][2] = 0;
                        this.field4998[2][3] = 0;
                        this.field4998[3][3] = 0;
                        this.field4998[2][0] = 1363;
                        this.field4998[4][3] = 0;
                        this.field4998[1][2] = 4096;
                        this.field4998[3][0] = 2048;
                        this.field4998[5][3] = 4096;
                        this.field4998[1][1] = 0;
                        this.field4998[4][0] = 2727;
                        this.field4998[6][3] = 4096;
                        this.field4998[2][1] = 0;
                        this.field4998[2][2] = 4096;
                        this.field4998[5][0] = 3411;
                        this.field4998[3][2] = 4096;
                        this.field4998[4][2] = 0;
                        this.field4998[5][2] = 0;
                        this.field4998[6][0] = 4096;
                        this.field4998[6][2] = 0;
                        this.field4998[3][1] = 4096;
                        this.field4998[4][1] = 4096;
                        this.field4998[5][1] = 4096;
                        this.field4998[6][1] = 0;
                    }
                } else {
                    this.field4998 = new int[8][4];
                    this.field4998[0][3] = 2361;
                    this.field4998[0][1] = 2650;
                    this.field4998[1][1] = 2313;
                    this.field4998[1][3] = 1558;
                    this.field4998[2][3] = 1413;
                    this.field4998[3][3] = 947;
                    this.field4998[0][0] = 0;
                    this.field4998[2][1] = 2618;
                    this.field4998[0][2] = 2602;
                    this.field4998[1][2] = 1799;
                    this.field4998[3][1] = 2296;
                    this.field4998[4][1] = 2072;
                    this.field4998[4][3] = 722;
                    this.field4998[1][0] = 2867;
                    this.field4998[2][2] = 1734;
                    this.field4998[3][2] = 1220;
                    this.field4998[2][0] = 3072;
                    this.field4998[3][0] = 3276;
                    this.field4998[4][2] = 963;
                    this.field4998[4][0] = 3481;
                    this.field4998[5][0] = 3686;
                    this.field4998[5][3] = 1766;
                    this.field4998[6][0] = 3891;
                    this.field4998[5][1] = 2730;
                    this.field4998[7][0] = 4096;
                    this.field4998[5][2] = 2152;
                    this.field4998[6][3] = 915;
                    this.field4998[7][3] = 1140;
                    this.field4998[6][1] = 2232;
                    this.field4998[6][2] = 1060;
                    this.field4998[7][1] = 1686;
                    this.field4998[7][2] = 1413;
                }
            } else {
                this.field4998 = new int[2][4];
                this.field4998[0][1] = 0;
                this.field4998[1][1] = 4096;
                this.field4998[0][3] = 0;
                this.field4998[0][0] = 0;
                this.field4998[1][0] = 4096;
                this.field4998[0][2] = 0;
                this.field4998[1][2] = 4096;
                this.field4998[1][3] = 4096;
            }
        }
        if (arg0 != 255) {
            this.method2099(-60, 23);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4991;
        if (arg3 > -127) {
            field4997 = -124;
        }
        class184.field2861 = 0;
        for (int var7 = -1; ~var7 > ~(class249.field3964 - -class14.field195); ++var7) {
            class106 var37 = null;
            class58 var38;
            if (var7 >= 0) {
                if (var7 >= class249.field3964) {
                    var38 = class76.field1188[class76.field1189[-class249.field3964 + var7]];
                    var37 = ((class35) var38).field442;
                    if (var37.field1630 != null) {
                        var37 = var37.method685(-1);
                        if (var37 == null) {
                            continue;
                        }
                    }
                } else {
                    var38 = class300.field4925[class53.field713[var7]];
                }
            } else {
                var38 = class309.field5006;
            }
            if (var38.method211(65535)) {
                class210.method1489(var38, -1, arg6 >> 1, var38.method204((byte) 104), arg5, arg4 >> 1, arg0);
                if (~class19.field256 <= -1) {
                    if (var38.field831 != null && (~class249.field3964 >= ~var7 || class187.field2899 == 0 || class187.field2899 == 3 || class187.field2899 == 1 && class130.method858(80, ((class208) var38).field3329)) && ~class253.field4020 < ~class184.field2861) {
                        class253.field4009[class184.field2861] = class202.field3227.method736(var38.field831) / 2;
                        class253.field4007[class184.field2861] = class202.field3227.field1749;
                        class253.field4013[class184.field2861] = class19.field256;
                        class253.field4015[class184.field2861] = class227.field3597;
                        class253.field4016[class184.field2861] = var38.field876;
                        class253.field4017[class184.field2861] = var38.field840;
                        class253.field4012[class184.field2861] = var38.field852;
                        class253.field4018[class184.field2861] = var38.field831;
                        ++class184.field2861;
                    }
                    class294 var39 = class71.field1027[0];
                    int var40 = arg2 - -class227.field3597 + -Math.max(class202.field3227.field1755, var39.field4833);
                    if (!var38.field817 && var38.field885 > class4.field32) {
                        class294 var41 = class71.field1027[1];
                        if (var38 instanceof class35) {
                            class35 var42 = (class35) var38;
                            class294[] var43 = (class294[]) class11.field150.method149((byte) -45, (long) var42.field442.field1643);
                            if (var43 == null) {
                                var43 = class2.method7(true, 0, class3.field22, var42.field442.field1643);
                                if (var43 != null) {
                                    class11.field150.method152(var43, (long) var42.field442.field1643, true);
                                }
                            }
                            if (var43 != null && var43.length == 2) {
                                var41 = var43[1];
                                var39 = var43[0];
                            }
                        }
                        int var44 = arg1 - -class19.field256 + -(var39.field4830 >> 1);
                        var39.method252(var44, var40);
                        int var45 = var38.field874 * var39.field4830 / 255;
                        class62.method397(var44, var40, var44 + var45, var39.field4833 + var40);
                        var41.method252(var44, var40);
                        class62.method391(arg1, arg2, arg1 + arg6, arg2 - -arg4);
                    }
                    var40 -= 2;
                    if (!var38.field817) {
                        if (~class249.field3964 >= ~var7) {
                            if (~var37.field1647 <= -1 && var37.field1647 < class173.field2689.length) {
                                var40 -= 25;
                                class294 var46 = class173.field2689[var37.field1647];
                                var46.method252(-(var46.field4830 >> 1) + class19.field256 + arg1, var40);
                                var40 -= 2;
                            }
                        } else {
                            class208 var47 = (class208) var38;
                            if (var47.field3339 != -1) {
                                var40 -= 25;
                                class141.field2172[var47.field3339].method252(arg1 + -12 + class19.field256, var40);
                                var40 -= 2;
                            }
                            if (var47.field3331 != -1) {
                                var40 -= 25;
                                class173.field2689[var47.field3331].method252(arg1 - 12 + class19.field256, var40);
                                var40 -= 2;
                            }
                        }
                    }
                    int var10000;
                    if (var38 instanceof class208) {
                        if (~var7 <= -1) {
                            int var48 = 0;
                            class3[] var49 = class263.field4340;
                            for (int var50 = 0; var50 < var49.length; ++var50) {
                                class3 var52 = var49[var50];
                                if (var52 != null && var52.field16 == 10 && ~class53.field713[var7] == ~var52.field17) {
                                    class294 var53 = class127.field1961[var52.field14];
                                    if (~var48 > ~var53.field4833) {
                                        var48 = var53.field4833;
                                    }
                                    var53.method252(class19.field256 + arg1 + -12, var40 - var53.field4833);
                                }
                            }
                            if (~var48 < -1) {
                                var10000 = var40 - (var48 + 2);
                            }
                        }
                    } else {
                        int var54 = 0;
                        int var55 = 0;
                        class3[] var56 = class263.field4340;
                        while (var55 < var56.length) {
                            class3 var60 = var56[var55];
                            if (var60 != null && var60.field16 == 1 && ~class76.field1189[-class249.field3964 + var7] == ~var60.field17) {
                                class294 var61 = class127.field1961[var60.field14];
                                if (var54 < var61.field4833) {
                                    var54 = var61.field4833;
                                }
                                if (~(class4.field32 % 20) > -11) {
                                    var61.method252(class19.field256 + arg1 + -12, -var61.field4833 + var40);
                                }
                            }
                            ++var55;
                        }
                        if (var54 > 0) {
                            var10000 = var40 - (var54 + 2);
                        }
                    }
                    for (int var58 = 0; var58 < 4; ++var58) {
                        if (~class4.field32 > ~var38.field792[var58]) {
                            int var59 = var38.method204((byte) -106) / 2;
                            class210.method1489(var38, -1, arg6 >> 1, var59, arg5, arg4 >> 1, arg0);
                            if (class19.field256 > -1) {
                                if (var58 == 1) {
                                    class227.field3597 -= 20;
                                }
                                if (~var58 == -3) {
                                    class227.field3597 -= 10;
                                    class19.field256 -= 15;
                                }
                                if (var58 == 3) {
                                    class19.field256 += 15;
                                    class227.field3597 -= 10;
                                }
                                class199.field3156[var38.field886[var58]].method252(class19.field256 + arg1 + -12, arg2 + -12 + class227.field3597);
                                class249.field3970.method730(Integer.toString(var38.field789[var58]), arg1 - (-class19.field256 + 1), class227.field3597 + 3 + arg2, 16777215, 0);
                            }
                        }
                    }
                }
            }
        }
        for (int var8 = 0; class173.field2687 > var8; ++var8) {
            int var24 = class68.field999[var8];
            int var25 = class309.field5007[var8];
            class58 var26;
            if (~var24 > -2049) {
                var26 = class300.field4925[var24];
            } else {
                var24 -= 2048;
                var26 = class76.field1188[var24];
            }
            class58 var27;
            if (~var25 > -2049) {
                var27 = class300.field4925[var25];
            } else {
                var25 -= 2048;
                var27 = class76.field1188[var25];
            }
            int var28 = var26.method213(0);
            if (~var28 != 0) {
                Object var29 = null;
                class294 var30 = (class294) class37.field480.method149((byte) -43, (long) var28);
                if (var30 == null) {
                    class294[] var31 = class2.method7(true, 0, class3.field22, var28);
                    if (var31 != null) {
                        var30 = var31[0];
                        class37.field480.method152(var30, (long) var28, true);
                    }
                }
                if (var30 != null) {
                    int var32 = var27.field788++;
                    class34.method198(-10479, arg4 >> 1, 0, var27.field836, arg6 >> 1, arg0, var27.method362(25892) * 64, arg5, var27.field850);
                    int var33 = class19.field256 + arg1 - 18;
                    int var34 = var32 / 4 * 18 + var33;
                    int var35 = class227.field3597 + -16 + -54;
                    int var36 = var32 % 4 * 18 + var35;
                    var30.method252(var34, var36);
                    if (var26 == var27) {
                        class62.method389(var34 - 1, var36 + -1, 18, 18, 16776960);
                    }
                    if (~class265.field4367 <= ~var34 && ~(var30.field4830 + var34) < ~class265.field4367 && ~var36 >= ~class262.field4331 && class262.field4331 < var36 - -var30.field4833) {
                        if (var26 instanceof class208) {
                            class110.field1673[0] = (long) var24 << 32;
                        } else {
                            class110.field1673[0] = class55.method330(536870912L, (long) var24 << 32);
                        }
                        class104.field1560 = false;
                        class103.field1555 = 1;
                    }
                }
            }
        }
        for (int var9 = 0; var9 < class184.field2861; ++var9) {
            int var10 = class253.field4013[var9];
            int var11 = class253.field4015[var9];
            int var12 = class253.field4009[var9];
            int var13 = class253.field4007[var9];
            boolean var14 = true;
            while (var14) {
                var14 = false;
                for (int var23 = 0; ~var23 > ~var9; ++var23) {
                    if (~(var11 + 2) < ~(class253.field4015[var23] + -class253.field4007[var23]) && ~(-var13 + var11) > ~(class253.field4015[var23] - -2) && ~(var10 - var12) > ~(class253.field4013[var23] + class253.field4009[var23]) && var10 + var12 > class253.field4013[var23] + -class253.field4009[var23] && ~var11 < ~(class253.field4015[var23] + -class253.field4007[var23])) {
                        var11 = class253.field4015[var23] - class253.field4007[var23];
                        var14 = true;
                    }
                }
            }
            class19.field256 = class253.field4013[var9];
            class227.field3597 = class253.field4015[var9] = var11;
            String var15 = class253.field4018[var9];
            if (~class97.field1457 != -1) {
                class202.field3227.method730(var15, class19.field256 + arg1, arg2 - -class227.field3597, 16776960, 0);
            } else {
                int var16 = 16776960;
                if (class253.field4016[var9] < 6) {
                    var16 = class193.field3051[class253.field4016[var9]];
                }
                if (class253.field4016[var9] == 6) {
                    var16 = class80.field1274 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (~class253.field4016[var9] == -8) {
                    var16 = ~(class80.field1274 % 20) > -11 ? 255 : 65535;
                }
                if (class253.field4016[var9] == 8) {
                    var16 = class80.field1274 % 20 < 10 ? 45056 : 8454016;
                }
                if (~class253.field4016[var9] == -10) {
                    int var17 = -class253.field4012[var9] + 150;
                    if (var17 >= 50) {
                        if (~var17 > -101) {
                            var16 = 16776960 - (var17 - 50) * 327680;
                        } else if (var17 < 150) {
                            var16 = (var17 + -100) * 5 + 65280;
                        }
                    } else {
                        var16 = var17 * 1280 + 16711680;
                    }
                }
                if (class253.field4016[var9] == 10) {
                    int var18 = 150 - class253.field4012[var9];
                    if (~var18 > -51) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 >= 100) {
                        if (var18 < 150) {
                            var16 = 255 - -(var18 * 327680) + -((var18 + -100) * 5) + -32768000;
                        }
                    } else {
                        var16 = 16711935 - (var18 + -50) * 327680;
                    }
                }
                if (class253.field4016[var9] == 11) {
                    int var19 = -class253.field4012[var9] + 150;
                    if (var19 < 50) {
                        var16 = -(var19 * 327685) + 16777215;
                    } else if (~var19 <= -101) {
                        if (~var19 > -151) {
                            var16 = -((var19 + -100) * 327680) + 16777215;
                        }
                    } else {
                        var16 = var19 * 327685 - 16384250 + 65280;
                    }
                }
                if (class253.field4017[var9] == 0) {
                    class202.field3227.method730(var15, class19.field256 + arg1, class227.field3597 + arg2, var16, 0);
                }
                if (class253.field4017[var9] == 1) {
                    class202.field3227.method753(var15, class19.field256 + arg1, class227.field3597 + arg2, var16, 0, class80.field1274);
                }
                if (~class253.field4017[var9] == -3) {
                    class202.field3227.method748(var15, arg1 - -class19.field256, class227.field3597 + arg2, var16, 0, class80.field1274);
                }
                if (class253.field4017[var9] == 3) {
                    class202.field3227.method746(var15, class19.field256 + arg1, class227.field3597 + arg2, var16, 0, class80.field1274, -class253.field4012[var9] + 150);
                }
                if (~class253.field4017[var9] == -5) {
                    int var20 = (-class253.field4012[var9] + 150) * (class202.field3227.method736(var15) - -100) / 150;
                    class62.method397(class19.field256 + arg1 + -50, arg2, arg1 + 50 + class19.field256, arg2 + arg4);
                    class202.field3227.method744(var15, class19.field256 + arg1 + -var20 - -50, arg2 - -class227.field3597, var16, 0);
                    class62.method391(arg1, arg2, arg1 + arg6, arg2 + arg4);
                }
                if (class253.field4017[var9] == 5) {
                    int var21 = -class253.field4012[var9] + 150;
                    class62.method397(arg1, class227.field3597 + arg2 + -class202.field3227.field1749 - 1, arg1 + arg6, class227.field3597 + arg2 + 5);
                    int var22 = 0;
                    if (var21 < 25) {
                        var22 = var21 + -25;
                    } else if (var21 > 125) {
                        var22 = var21 + -125;
                    }
                    class202.field3227.method730(var15, class19.field256 + arg1, arg2 + var22 - -class227.field3597, var16, 0);
                    class62.method391(arg1, arg2, arg1 + arg6, arg2 - -arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        int var4 = 66 / ((arg0 - 60) / 61);
        ++field4993;
        if (arg2 == 0) {
            int var5 = arg1.method1420((byte) 0);
            if (var5 != 0) {
                this.method2099(255, var5);
            } else {
                this.field4998 = new int[arg1.method1420((byte) 0)][4];
                for (int var6 = 0; this.field4998.length > var6; ++var6) {
                    this.field4998[var6][0] = arg1.method1419(76);
                    this.field4998[var6][1] = arg1.method1420((byte) 0) << 4;
                    this.field4998[var6][2] = arg1.method1420((byte) 0) << 4;
                    this.field4998[var6][3] = arg1.method1420((byte) 0) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)[[I")
    public final int[][] method200(int arg0, int arg1) {
        ++field4986;
        int[][] var3 = super.field3150.method642(arg0, 1);
        if (super.field3150.field1498) {
            int[] var4 = this.method1367((byte) -79, 0, arg0);
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            for (int var8 = 0; ~class42.field590 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field4987[var9];
                var7[var8] = class10.method53(var10 >> 12, 4080);
                var6[var8] = class10.method53(4080, var10 >> 4);
                var5[var8] = class10.method53(var10, 255) << 4;
            }
        }
        if (arg1 != -2) {
            field4997 = 113;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLfm;)V")
    public static final void method2101(byte arg0, class210 arg1) {
        ++field4989;
        int var2 = -1;
        long var3 = 0L;
        int var5 = 0;
        if (arg1.field3377 == 0) {
            var3 = class194.method1344(arg1.field3374, arg1.field3378, arg1.field3368);
        }
        int var6 = 0;
        if (~arg1.field3377 == -2) {
            var3 = class76.method498(arg1.field3374, arg1.field3378, arg1.field3368);
        }
        if (~arg1.field3377 == -3) {
            var3 = class186.method1268(arg1.field3374, arg1.field3378, arg1.field3368);
        }
        if (~arg1.field3377 == -4) {
            var3 = class9.method48(arg1.field3374, arg1.field3378, arg1.field3368);
        }
        if (arg0 <= 104) {
            field4992 = false;
        }
        if (var3 != 0L) {
            var5 = 31 & (int) var3 >> 14;
            var2 = Integer.MAX_VALUE & (int) (var3 >>> 32);
            var6 = (int) var3 >> 20 & 3;
        }
        arg1.field3379 = var5;
        arg1.field3376 = var2;
        arg1.field3364 = var6;
    }
}
