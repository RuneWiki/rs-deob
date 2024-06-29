import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class70 extends class264 {

    @OriginalMember(owner = "client!m", name = "yb", descriptor = "[I")
    private int[] field1119 = new int[257];

    @OriginalMember(owner = "client!m", name = "mb", descriptor = "Lma;")
    public static class5 field1107 = class12.method119("huffman", (byte) 81);

    @OriginalMember(owner = "client!m", name = "ib", descriptor = "[B")
    public static byte[] field1103 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!m", name = "tb", descriptor = "Lma;")
    private static class5 field1114 = class12.method119("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", (byte) 80);

    @OriginalMember(owner = "client!m", name = "sb", descriptor = "Lma;")
    public static class5 field1113 = field1114;

    @OriginalMember(owner = "client!m", name = "fb", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!m", name = "gb", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!m", name = "hb", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!m", name = "jb", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!m", name = "lb", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!m", name = "nb", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!m", name = "ob", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!m", name = "pb", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!m", name = "qb", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!m", name = "vb", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!m", name = "wb", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!m", name = "xb", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!m", name = "zb", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!m", name = "rb", descriptor = "Lpg;")
    public static class295 field1112;

    @OriginalMember(owner = "client!m", name = "ub", descriptor = "[Z")
    public static boolean[] field1115;

    @OriginalMember(owner = "client!m", name = "kb", descriptor = "[[I")
    private int[][] field1105;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(BI)[[I", line = 7)
    public final int[][] method138(byte arg0, int arg1) {
        int var3 = -124 % ((-arg0 - 43) / 55);
        int[][] var4 = this.field4524.method1462(-15077, arg1);
        if (this.field4524.field3506) {
            int[] var5 = this.method1815(0, arg1, 61);
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var4[0];
            for (int var9 = 0; var9 < class226.field3716; var9++) {
                int var10 = var5[var9] >> 4;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var10 > 256) {
                    var10 = 256;
                }
                int var11 = this.field1119[var10];
                var8[var9] = class204.method1354(var11 >> 12, 4080);
                var6[var9] = class204.method1354(65280, var11) >> 4;
                var7[var9] = class204.method1354(var11 << 4, 4080);
            }
        }
        field1116++;
        return var4;
    }

    @OriginalMember(owner = "client!m", name = "h", descriptor = "(I)V", line = 53)
    private final void method499(int arg0) {
        if (arg0 <= 18) {
            this.method499(31);
        }
        field1120++;
        int var2 = this.field1105.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var6 < var2 && this.field1105[var6][0] <= var5; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var2 > var4) {
                int[] var7 = this.field1105[var4];
                if (var4 <= 0) {
                    var8 = var7[2];
                    var9 = var7[1];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field1105[var4 - 1];
                    int var12 = (var5 - var11[0] << 12) / (var7[0] - var11[0]);
                    int var13 = 4096 - var12;
                    var9 = var7[1] * var12 + var11[1] * var13 >> 12;
                    var8 = var7[2] * var12 + var11[2] * var13 >> 12;
                    var10 = var7[3] * var12 + var11[3] * var13 >> 12;
                }
            } else {
                int[] var14 = this.field1105[var2 - 1];
                var8 = var14[2];
                var9 = var14[1];
                var10 = var14[3];
            }
            int var15 = var9 >> 4;
            int var16 = var8 >> 4;
            int var17 = var10 >> 4;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            this.field1119[var3] = class264.method1820(class264.method1820(var15 << 16, var16 << 8), var17);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIIIIII)V", line = 160)
    public static final void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1118++;
        class186 var10 = (class186) class127.field1905.method1475(14);
        class186 var11 = null;
        while (var10 != null) {
            if (var10.field2920 == arg7 && var10.field2923 == arg1 && var10.field2918 == arg3 && var10.field2929 == arg9) {
                var11 = var10;
                break;
            }
            var10 = (class186) class127.field1905.method1486(38);
        }
        if (var11 == null) {
            var11 = new class186();
            var11.field2918 = arg3;
            var11.field2923 = arg1;
            var11.field2929 = arg9;
            var11.field2920 = arg7;
            class99.method634(var11, -1550739730);
            class127.field1905.method1485(-8564, var11);
        }
        int var12 = 23 / ((-arg0 - 42) / 34);
        var11.field2928 = arg6;
        var11.field2927 = arg5;
        var11.field2916 = arg4;
        var11.field2919 = arg2;
        var11.field2914 = arg8;
    }

    @OriginalMember(owner = "client!m", name = "i", descriptor = "(I)V", line = 200)
    public static final void method501(int arg0) {
        field1108++;
        if (class200.method1313(0) != 2) {
            return;
        }
        byte var1 = (byte) (class60.field938 - 4 & 0xFF);
        int var2 = class60.field938 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class141.field2081[var3][var2][var4] = var1;
            }
        }
        if (class276.field4701 == 3) {
            return;
        }
        if (arg0 != 23666) {
            field1114 = (class5) null;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class209.field3313[var5] = -1000000;
            class281.field4761[var5] = 1000000;
            class29.field478[var5] = 0;
            class275.field4687[var5] = 1000000;
            class257.field4395[var5] = 0;
        }
        if (class270.field4631 != 1) {
            int var6 = class20.method161(class303.field5108, class239.field3970, 1, class276.field4701);
            if (var6 - class27.field437 < 800 && (class18.field321[class276.field4701][class239.field3970 >> 7][class303.field5108 >> 7] & 0x4) != 0) {
                class188.method1234(class303.field5108 >> 7, class43.field646, class239.field3970 >> 7, false, false, 1);
            }
            return;
        }
        if ((class18.field321[class276.field4701][class151.field2183.field178 >> 7][class151.field2183.field211 >> 7] & 0x4) != 0) {
            class188.method1234(class151.field2183.field211 >> 7, class43.field646, class151.field2183.field178 >> 7, false, false, 0);
        }
        if (class207.field3287 >= 310) {
            return;
        }
        int var7 = class239.field3970 >> 7;
        int var8 = class303.field5108 >> 7;
        int var9 = class151.field2183.field211 >> 7;
        int var10 = class151.field2183.field178 >> 7;
        int var11;
        if (var7 >= var10) {
            var11 = var7 - var10;
        } else {
            var11 = var10 - var7;
        }
        int var12;
        if (var8 < var9) {
            var12 = var9 - var8;
        } else {
            var12 = var8 - var9;
        }
        if (var12 >= var11) {
            int var15 = 32768;
            int var16 = var11 * 65536 / var12;
            while (var8 != var9) {
                if (var8 < var9) {
                    var8++;
                } else if (var9 < var8) {
                    var8--;
                }
                if ((class18.field321[class276.field4701][var7][var8] & 0x4) != 0) {
                    class188.method1234(var8, class43.field646, var7, false, false, 1);
                    break;
                }
                var15 += var16;
                if (var15 >= 65536) {
                    if (var10 > var7) {
                        var7++;
                    } else if (var7 > var10) {
                        var7--;
                    }
                    var15 -= 65536;
                    if ((class18.field321[class276.field4701][var7][var8] & 0x4) != 0) {
                        class188.method1234(var8, class43.field646, var7, false, false, 1);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var12 * 65536 / var11;
        int var14 = 32768;
        while (var7 != var10) {
            if (var10 > var7) {
                var7++;
            } else if (var10 < var7) {
                var7--;
            }
            if ((class18.field321[class276.field4701][var7][var8] & 0x4) != 0) {
                class188.method1234(var8, class43.field646, var7, false, false, 1);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                if (var9 > var8) {
                    var8++;
                } else if (var9 < var8) {
                    var8--;
                }
                var14 -= 65536;
                if ((class18.field321[class276.field4701][var7][var8] & 0x4) != 0) {
                    class188.method1234(var8, class43.field646, var7, false, false, 1);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IILii;)V", line = 389)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg0 == 0) {
            int var4 = arg2.method1509(true);
            if (var4 == 0) {
                this.field1105 = new int[arg2.method1509(true)][4];
                for (int var5 = 0; var5 < this.field1105.length; var5++) {
                    this.field1105[var5][0] = arg2.method1524((byte) 81);
                    this.field1105[var5][1] = arg2.method1509(true) << 4;
                    this.field1105[var5][2] = arg2.method1509(true) << 4;
                    this.field1105[var5][3] = arg2.method1509(true) << 4;
                }
            } else {
                this.method505(var4, true);
            }
        }
        if (arg1 > -27) {
            field1113 = (class5) null;
        }
        field1104++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lma;ZI)V", line = 447)
    public static final void method502(class5 arg0, boolean arg1, int arg2) {
        field1117++;
        short[] var3 = new short[16];
        int var4 = 0;
        class5 var5 = arg0.method37(-74);
        for (int var6 = 0; var6 < class100.field1495; var6++) {
            class196 var7 = class235.method1664(105, var6);
            if ((!arg1 || var7.field3093) && var7.field3080 == -1 && var7.field3085 == -1 && var7.field3069 == 0 && var7.field3062.method37(-113).method73(-5069, var5) != -1) {
                if (var4 >= 250) {
                    class55.field864 = -1;
                    class284.field4814 = null;
                    return;
                }
                if (var3.length <= var4) {
                    short[] var8 = new short[var3.length * 2];
                    for (int var9 = 0; var9 < var4; var9++) {
                        var8[var9] = var3[var9];
                    }
                    var3 = var8;
                }
                var3[var4++] = (short) var6;
            }
        }
        class55.field864 = var4;
        if (arg2 >= -40) {
            return;
        }
        class284.field4814 = var3;
        class5[] var10 = new class5[class55.field864];
        class46.field693 = 0;
        for (int var11 = 0; var11 < class55.field864; var11++) {
            var10[var11] = class235.method1664(119, var3[var11]).field3062;
        }
        class262.method1810((byte) -120, var10, class284.field4814);
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V", line = 518)
    public class70() {
        super(1, false);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII)V", line = 527)
    public static final void method503(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 1) {
            method506(-128, -24, -107);
        }
        field1102++;
        if (arg3 >= class57.field899 && class301.field5073 >= arg3) {
            int var5 = class76.method533(class294.field4956, arg0, true, class101.field1505);
            int var6 = class76.method533(class294.field4956, arg2, true, class101.field1505);
            class272.method1863(arg4 ^ 0x1, arg1, var6, var5, arg3);
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(B)V", line = 549)
    public static void method504(byte arg0) {
        field1112 = null;
        field1113 = null;
        field1107 = null;
        field1115 = null;
        field1114 = null;
        if (arg0 != -56) {
            method503(-46, 117, -26, -100, -71);
        }
        field1103 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)V", line = 565)
    private final void method505(int arg0, boolean arg1) {
        field1106++;
        if (!arg1) {
            field1107 = (class5) null;
        }
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            this.field1105 = new int[2][4];
            this.field1105[0][1] = 0;
            this.field1105[0][3] = 0;
            this.field1105[0][2] = 0;
            this.field1105[1][2] = 4096;
            this.field1105[1][3] = 4096;
            this.field1105[1][1] = 4096;
            this.field1105[0][0] = 0;
            this.field1105[1][0] = 4096;
        } else if (arg0 == 2) {
            this.field1105 = new int[8][4];
            this.field1105[0][0] = 0;
            this.field1105[1][0] = 2867;
            this.field1105[2][0] = 3072;
            this.field1105[0][1] = 2650;
            this.field1105[3][0] = 3276;
            this.field1105[0][2] = 2602;
            this.field1105[1][2] = 1799;
            this.field1105[4][0] = 3481;
            this.field1105[1][1] = 2313;
            this.field1105[5][0] = 3686;
            this.field1105[6][0] = 3891;
            this.field1105[2][2] = 1734;
            this.field1105[3][2] = 1220;
            this.field1105[0][3] = 2361;
            this.field1105[1][3] = 1558;
            this.field1105[7][0] = 4096;
            this.field1105[4][2] = 963;
            this.field1105[5][2] = 2152;
            this.field1105[2][3] = 1413;
            this.field1105[6][2] = 1060;
            this.field1105[7][2] = 1413;
            this.field1105[3][3] = 947;
            this.field1105[4][3] = 722;
            this.field1105[2][1] = 2618;
            this.field1105[3][1] = 2296;
            this.field1105[4][1] = 2072;
            this.field1105[5][1] = 2730;
            this.field1105[6][1] = 2232;
            this.field1105[5][3] = 1766;
            this.field1105[6][3] = 915;
            this.field1105[7][3] = 1140;
            this.field1105[7][1] = 1686;
        } else if (arg0 == 3) {
            this.field1105 = new int[7][4];
            this.field1105[0][2] = 0;
            this.field1105[1][2] = 4096;
            this.field1105[0][3] = 4096;
            this.field1105[2][2] = 4096;
            this.field1105[0][0] = 0;
            this.field1105[1][3] = 4096;
            this.field1105[2][3] = 0;
            this.field1105[3][3] = 0;
            this.field1105[1][0] = 663;
            this.field1105[0][1] = 0;
            this.field1105[3][2] = 4096;
            this.field1105[4][3] = 0;
            this.field1105[2][0] = 1363;
            this.field1105[5][3] = 4096;
            this.field1105[3][0] = 2048;
            this.field1105[4][2] = 0;
            this.field1105[1][1] = 0;
            this.field1105[6][3] = 4096;
            this.field1105[4][0] = 2727;
            this.field1105[2][1] = 0;
            this.field1105[5][2] = 0;
            this.field1105[3][1] = 4096;
            this.field1105[5][0] = 3411;
            this.field1105[6][2] = 0;
            this.field1105[6][0] = 4096;
            this.field1105[4][1] = 4096;
            this.field1105[5][1] = 4096;
            this.field1105[6][1] = 0;
        } else if (arg0 == 4) {
            this.field1105 = new int[6][4];
            this.field1105[0][0] = 0;
            this.field1105[0][3] = 0;
            this.field1105[0][1] = 0;
            this.field1105[1][3] = 1493;
            this.field1105[2][3] = 2939;
            this.field1105[1][1] = 0;
            this.field1105[1][0] = 1843;
            this.field1105[3][3] = 3565;
            this.field1105[2][0] = 2457;
            this.field1105[2][1] = 0;
            this.field1105[3][0] = 2781;
            this.field1105[4][0] = 3481;
            this.field1105[3][1] = 0;
            this.field1105[5][0] = 4096;
            this.field1105[4][3] = 4031;
            this.field1105[5][3] = 4096;
            this.field1105[4][1] = 546;
            this.field1105[0][2] = 0;
            this.field1105[5][1] = 4096;
            this.field1105[1][2] = 0;
            this.field1105[2][2] = 0;
            this.field1105[3][2] = 1124;
            this.field1105[4][2] = 3084;
            this.field1105[5][2] = 4096;
        } else if (arg0 == 5) {
            this.field1105 = new int[16][4];
            this.field1105[0][1] = 80;
            this.field1105[0][0] = 0;
            this.field1105[1][0] = 155;
            this.field1105[0][2] = 192;
            this.field1105[2][0] = 389;
            this.field1105[1][2] = 449;
            this.field1105[3][0] = 671;
            this.field1105[1][1] = 321;
            this.field1105[2][2] = 690;
            this.field1105[2][1] = 578;
            this.field1105[3][1] = 947;
            this.field1105[3][2] = 995;
            this.field1105[4][2] = 1397;
            this.field1105[0][3] = 321;
            this.field1105[5][2] = 1429;
            this.field1105[4][1] = 1285;
            this.field1105[6][2] = 1461;
            this.field1105[5][1] = 1525;
            this.field1105[7][2] = 1525;
            this.field1105[8][2] = 1590;
            this.field1105[4][0] = 897;
            this.field1105[5][0] = 1175;
            this.field1105[6][1] = 1734;
            this.field1105[1][3] = 562;
            this.field1105[7][1] = 1413;
            this.field1105[2][3] = 803;
            this.field1105[3][3] = 1140;
            this.field1105[8][1] = 1108;
            this.field1105[6][0] = 1368;
            this.field1105[9][2] = 2056;
            this.field1105[7][0] = 1507;
            this.field1105[9][1] = 1766;
            this.field1105[10][1] = 2409;
            this.field1105[10][2] = 2586;
            this.field1105[8][0] = 1736;
            this.field1105[4][3] = 1509;
            this.field1105[11][1] = 3116;
            this.field1105[5][3] = 1413;
            this.field1105[9][0] = 2088;
            this.field1105[12][1] = 3806;
            this.field1105[11][2] = 3148;
            this.field1105[10][0] = 2355;
            this.field1105[6][3] = 1333;
            this.field1105[11][0] = 2691;
            this.field1105[7][3] = 1702;
            this.field1105[12][0] = 3031;
            this.field1105[8][3] = 2056;
            this.field1105[13][1] = 3437;
            this.field1105[13][0] = 3522;
            this.field1105[12][2] = 3710;
            this.field1105[14][1] = 3116;
            this.field1105[13][2] = 3421;
            this.field1105[14][2] = 3148;
            this.field1105[14][0] = 3727;
            this.field1105[15][1] = 2377;
            this.field1105[15][0] = 4096;
            this.field1105[9][3] = 2666;
            this.field1105[15][2] = 2505;
            this.field1105[10][3] = 3276;
            this.field1105[11][3] = 3228;
            this.field1105[12][3] = 3196;
            this.field1105[13][3] = 3019;
            this.field1105[14][3] = 3228;
            this.field1105[15][3] = 2746;
        } else if (arg0 == 6) {
            this.field1105 = new int[4][4];
            this.field1105[0][0] = 2048;
            this.field1105[1][0] = 2867;
            this.field1105[2][0] = 3276;
            this.field1105[0][2] = 4096;
            this.field1105[0][3] = 0;
            this.field1105[1][3] = 0;
            this.field1105[3][0] = 4096;
            this.field1105[2][3] = 0;
            this.field1105[0][1] = 0;
            this.field1105[1][2] = 4096;
            this.field1105[3][3] = 0;
            this.field1105[1][1] = 4096;
            this.field1105[2][2] = 4096;
            this.field1105[3][2] = 0;
            this.field1105[2][1] = 4096;
            this.field1105[3][1] = 4096;
        } else {
            throw new RuntimeException("Invalid gradient preset");
        }
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(III)V", line = 833)
    public static final void method506(int arg0, int arg1, int arg2) {
        field1100++;
        class45.method319();
        int var3 = 25 % ((43 - arg2) / 34);
        if (browsercontrol.iscreated()) {
            browsercontrol.hide();
        }
        class207.field3291 = class152.method962(1, 0, 0, arg0, arg1, class267.field4597);
        if (class207.field3291 == null) {
            class278.method1890(113);
            return;
        }
        class73.field1151 = arg0;
        class21.field346 = arg1;
        class130.method860(class267.field4597, 0);
        class282.method1906(-119, 0);
        class69.method498(false);
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(I)V", line = 862)
    public final void method111(int arg0) {
        if (this.field1105 == null) {
            this.method505(1, true);
        }
        int var2 = -122 % ((arg0 - 66) / 44);
        field1110++;
        this.method499(43);
    }
}
