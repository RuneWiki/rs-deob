import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class173 {

    @OriginalMember(owner = "client!id", name = "s", descriptor = "Lsc;")
    private static class181 field2904 = class149.method967(255, " loggt sich aus)3");

    @OriginalMember(owner = "client!id", name = "u", descriptor = "Z")
    public static volatile boolean field2906 = false;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "Lvb;")
    public static class247 field2900 = new class247();

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    public static int field2911 = 127;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "Lak;")
    public static class152 field2910 = new class152(16);

    @OriginalMember(owner = "client!id", name = "B", descriptor = "Lsc;")
    private static class181 field2913 = class149.method967(255, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public int field2903;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "J")
    private long field2886;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "J")
    private long field2907;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "Ljava/lang/String;")
    public static String field2912;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Z")
    public boolean field2909;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "[I")
    private int[] field2887;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "[I")
    private int[] field2897;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)I")
    public final int method1140(byte arg0) {
        field2902++;
        if (arg0 != 111) {
            this.method1140((byte) 35);
        }
        return this.field2903 == -1 ? (this.field2897[0] << 15) + (this.field2897[8] << 10) + (this.field2887[0] << 25) + (this.field2887[4] << 20) + (this.field2897[11] << 5) + this.field2897[1] : 305419896 - -class9.method75(-1, this.field2903).field1001;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljb;Z)V")
    public static final void method1141(class11 arg0, boolean arg1) {
        if (!arg1) {
            class116.field1924 = arg0;
            field2893++;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method1142(int arg0) {
        int var1 = 116 / ((-arg0 - 71) / 49);
        field2900 = null;
        field2912 = null;
        field2910 = null;
        field2904 = null;
        field2913 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIILqa;)Lnb;")
    public final class249 method1143(int arg0, int arg1, int arg2, int arg3, class254 arg4) {
        field2896++;
        long var6 = (long) (arg2 << 16) | (long) arg0 << 32 | (long) arg0;
        if (arg1 <= 29) {
            this.method1153(-44, (byte) 52, -117);
        }
        class249 var8 = (class249) class194.field3391.method1794(-1, var6);
        if (var8 == null) {
            class50[] var9 = new class50[2];
            int var10 = 0;
            if (!class60.method432(3, arg0).method1776(true) || !class60.method432(3, arg2).method1776(true)) {
                return null;
            }
            class50 var11 = class60.method432(3, arg0).method1767(-128);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class50 var12 = class60.method432(3, arg2).method1767(77);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class50 var13 = new class50(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field2887[var14] < class116.field1896[var14].length) {
                    var13.method348(class206.field3550[var14], class116.field1896[var14][this.field2887[var14]]);
                }
                if (class93.field1476[var14].length > this.field2887[var14]) {
                    var13.method348(class146.field2404[var14], class93.field1476[var14][this.field2887[var14]]);
                }
            }
            var8 = var13.method351(64, 768, -50, -10, -50);
            class194.field3391.method1795(14177, var6, var8);
        }
        if (arg4 != null) {
            var8 = arg4.method1734(arg3, var8, -108);
        }
        return var8;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB[I[IZ)V")
    public final void method1144(int arg0, byte arg1, int[] arg2, int[] arg3, boolean arg4) {
        int var6 = 45 % ((arg1 + 80) / 41);
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var7 = 0; var7 < 7; var7++) {
                for (int var8 = 0; var8 < class77.field1245; var8++) {
                    class261 var9 = class60.method432(3, var8);
                    if (var9 != null && !var9.field4545 && ((arg4 ? 7 : 0) + var7) == var9.field4547) {
                        arg3[class215.field3699[var7]] = class185.method1291(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field2897 = arg3;
        this.field2903 = arg0;
        this.field2909 = arg4;
        field2891++;
        this.field2887 = arg2;
        this.method1152(true);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public static final void method1145(int arg0) {
        class94.field1504 = class65.field1067;
        class237.field4123 = class250.field4363;
        class199.field3450 = class8.field155;
        class65.field1066 = class98.field1590;
        class116.field1906 = class193.field3388;
        class120.field1959 = class83.field1329;
        class127.field2109 = class175.field3024;
        class114.field1848 = class224.field3868;
        class61.field935 = class234.field4079;
        class144.field2346 = class256.field4481;
        class203.field3486 = class148.field2482;
        class169.field2840 = class211.field3630;
        class32.field518 = class202.field3478;
        class227.field3901 = class78.field1255;
        class76.field1233 = class23.field405;
        class90.field1416 = class9.field188;
        class25.field443 = class9.field170;
        class107.field1744 = class35.field542;
        class82.field1315 = class260.field4537;
        if (arg0 <= 59) {
            method1155((byte) -47);
        }
        class12.field248 = class11.field201;
        class125.field2053 = class155.field2584;
        class218.field3742 = class68.field1087;
        class74.field1188 = class51.field806;
        class88.field1397 = class55.field855;
        class120.field1963 = class180.field3143;
        class208.field3575 = class25.field427;
        class43.field666 = class155.field2568;
        class234.field4078 = class128.field2119;
        class238.field4130 = class190.field3348;
        class232.field4057 = class228.field3911;
        class37.field566 = class236.field4099;
        class239.field4156 = class111.field1826;
        class74.field1182 = class187.field3301;
        class52.field830 = class98.field1589;
        class215.field3695 = class41.field615;
        class155.field2575 = class137.field2251;
        class7.field125 = class171.field2871;
        class114.field1856 = class191.field3364;
        class5.field110 = class97.field1578;
        class41.field611 = class114.field1854;
        class126.field2098 = class13.field258;
        class170.field2864 = class22.field396;
        class143.field2329 = class210.field3609;
        class61.field944 = class52.field828;
        class176.field3087 = class161.field2752;
        class92.field1466 = class47.field739;
        class42.field663 = class135.field2196;
        class239.field4159 = class111.field1826;
        class92.field1464 = class35.field552;
        class159.field2725 = class261.field4541;
        class218.field3740 = class68.field1087;
        class157.field2643 = class128.field2117;
        class254.field4455 = class210.field3611;
        class135.field2197 = class16.field294;
        class253.field4407 = class77.field1244;
        class93.field1477 = class210.field3603;
        class161.field2746 = class203.field3509;
        class235.field4089 = class199.field3451;
        class241.field4178 = class182.field3206;
        class76.field1227 = class107.field1743;
        field2899++;
        class143.field2324 = class121.field1985;
        class43.field680 = class27.field480;
        class209.field3578 = class145.field2357;
        class250.field4359 = class129.field2138;
        class236.field4103 = class189.field3343;
        class67.field1085 = class196.field3432;
        class128.field2122 = class64.field1049;
        class247.field4313 = field2913;
        class120.field1954 = class83.field1329;
        class107.field1752 = class95.field1529;
        class208.field3564 = class242.field4203;
        class155.field2590 = class213.field3674;
        class73.field1171 = class95.field1526;
        class125.field2041 = class70.field1125;
        class20.field353 = class168.field2832;
        class70.field1124 = class80.field1296;
        class71.field1138 = class87.field1387;
        class123.field2019 = class62.field955;
        class188.field3318 = class210.field3613;
        class177.field3097 = class31.field506;
        class236.field4096 = class11.field193;
        class136.field2216 = class256.field4484;
        class196.field3416 = class43.field672;
        class169.field2846 = field2904;
        class106.field1734 = class2.field65;
        class155.field2591 = class108.field1770;
        class38.field594 = class250.field4367;
        class146.field2402 = class37.field560;
        class45.field698 = class221.field3826;
        class222.field3831 = class92.field1470;
        class7.field124 = class189.field3342;
        class188.field3326 = class136.field2233;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)V")
    public final void method1146(boolean arg0, int arg1) {
        this.field2909 = arg0;
        if (arg1 >= 57) {
            this.method1152(true);
            field2908++;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lqa;II)Lnb;")
    public final class249 method1147(class254 arg0, int arg1, int arg2) {
        if (arg1 != 64) {
            field2910 = null;
        }
        field2898++;
        if (this.field2903 != -1) {
            return class9.method75(-1, this.field2903).method457(arg0, false, arg2);
        }
        class249 var4 = (class249) class194.field3391.method1794(-1, this.field2907);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field2897[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((var15 & Integer.MIN_VALUE) != 0 && !class60.method432(3, var15 & 0x3FFFFFFF).method1776(true)) {
                        var5 = true;
                    }
                } else if (!class237.method1620(arg1 - 29603, var15 & 0x3FFFFFFF).method662(0, this.field2909)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class50[] var7 = new class50[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field2897[var9];
                if ((var12 & 0x40000000) != 0) {
                    class50 var13 = class237.method1620(arg1 - 29603, var12 & 0x3FFFFFFF).method658(this.field2909, (byte) 18);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                } else if ((Integer.MIN_VALUE & var12) != 0) {
                    class50 var14 = class60.method432(3, var12 & 0x3FFFFFFF).method1767(-127);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                }
            }
            class50 var10 = new class50(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (class116.field1896[var11].length > this.field2887[var11]) {
                    var10.method348(class206.field3550[var11], class116.field1896[var11][this.field2887[var11]]);
                }
                if (this.field2887[var11] < class93.field1476[var11].length) {
                    var10.method348(class146.field2404[var11], class93.field1476[var11][this.field2887[var11]]);
                }
            }
            var4 = var10.method351(64, 768, -50, -10, -50);
            class194.field3391.method1795(14177, this.field2907, var4);
        }
        if (arg0 != null) {
            var4 = arg0.method1734(arg2, var4, -7);
        }
        return var4;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lsc;B)V")
    public static final void method1148(class181 arg0, byte arg1) {
        field2888++;
        if (class61.field933 == null) {
            return;
        }
        int var2 = -69 / ((arg1 + 67) / 54);
        int var3 = 0;
        long var4 = arg0.method1197(-127);
        if (var4 == 0L) {
            return;
        }
        while (var3 < class61.field933.length && class61.field933[var3].field606 != var4) {
            var3++;
        }
        if (class61.field933.length > var3 && class61.field933[var3] != null) {
            class141.field2275.method541(220, -74);
            class246.field4294++;
            class141.field2275.method1511(false, class61.field933[var3].field606);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILnb;IBIII)Lnb;")
    public static final class249 method1149(int arg0, class249 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field2894++;
        long var7 = (long) arg2;
        class249 var9 = (class249) class171.field2865.method1794(arg3 ^ 0xFFFFFFB3, var7);
        if (var9 == null) {
            class50 var10 = class50.method354(class45.field692, arg2, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method351(64, 768, -50, -10, -50);
            class171.field2865.method1795(14177, var7, var9);
        }
        if (arg3 != 76) {
            method1149(-31, (class249) null, 26, (byte) -98, -58, 1, 72);
        }
        int var11 = arg1.method1588();
        int var12 = arg1.method1584();
        int var13 = arg1.method1576();
        int var14 = arg1.method1568();
        class249 var15 = var9.method1581(true, true);
        if (arg4 != 0) {
            var15.method1574(arg4);
        }
        class231 var16 = (class231) var15;
        if (arg6 != class232.method1606(class38.field581, (byte) -23, arg5 + var13, arg0 + var11) || arg6 != class232.method1606(class38.field581, (byte) -124, arg5 + var14, arg0 + var12)) {
            for (int var17 = 0; var17 < var16.field4026; var17++) {
                var16.field4001[var17] += class232.method1606(class38.field581, (byte) -96, var16.field3999[var17] + arg5, var16.field4015[var17] + arg0) - arg6;
            }
            var16.field4008 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([Lsc;III)Lsc;")
    public static final class181 method1150(class181[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -1049215800) {
            method1155((byte) -51);
        }
        field2901++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg0[arg2 + var5] == null) {
                arg0[arg2 + var5] = class246.field4293;
            }
            var4 += arg0[arg2 + var5].field3155;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg1; var8++) {
            class181 var10 = arg0[arg2 + var8];
            class252.method1718(var10.field3166, 0, var7, var6, var10.field3155);
            var6 += var10.field3155;
        }
        class181 var9 = new class181();
        var9.field3166 = var7;
        var9.field3155 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BII)V")
    public final void method1151(byte arg0, int arg1, int arg2) {
        this.field2887[arg2] = arg1;
        field2892++;
        this.method1152(true);
        if (arg0 > -94) {
            this.field2907 = 49L;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
    private final void method1152(boolean arg0) {
        if (!arg0) {
            this.method1143(126, 44, -106, 50, (class254) null);
        }
        field2889++;
        long var2 = this.field2907;
        this.field2907 = -1L;
        long[] var4 = class209.field3587;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2907 = var4[(int) (((long) (this.field2897[var5] >> 24) ^ this.field2907) & 0xFFL)] ^ this.field2907 >>> 8;
            this.field2907 = var4[(int) ((this.field2907 ^ (long) (this.field2897[var5] >> 16)) & 0xFFL)] ^ this.field2907 >>> 8;
            this.field2907 = var4[(int) ((this.field2907 ^ (long) (this.field2897[var5] >> 8)) & 0xFFL)] ^ this.field2907 >>> 8;
            this.field2907 = var4[(int) (((long) this.field2897[var5] ^ this.field2907) & 0xFFL)] ^ this.field2907 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2907 = var4[(int) (((long) this.field2887[var6] ^ this.field2907) & 0xFFL)] ^ this.field2907 >>> 8;
        }
        this.field2907 = var4[(int) (((long) (this.field2909 ? 1 : 0) ^ this.field2907) & 0xFFL)] ^ this.field2907 >>> 8;
        if (var2 != 0L && this.field2907 != var2) {
            class115.field1871.method1797(var2, 30496);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IBI)V")
    public final void method1153(int arg0, byte arg1, int arg2) {
        int var4 = class215.field3699[arg2];
        field2890++;
        if (this.field2897[var4] == 0 || class60.method432(3, arg0) == null) {
            return;
        }
        if (arg1 < 115) {
            this.method1153(-3, (byte) 63, 25);
        }
        this.field2897[var4] = class185.method1291(Integer.MIN_VALUE, arg0);
        this.method1152(true);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZLqa;Lqa;I)Lnb;")
    public final class249 method1154(int arg0, boolean arg1, class254 arg2, class254 arg3, int arg4) {
        field2895++;
        if (this.field2903 != -1) {
            return class9.method75(-1, this.field2903).method462(115, arg3, arg2, arg0, arg4);
        }
        long var6 = this.field2907;
        int[] var8 = this.field2897;
        if (arg2 != null && (arg2.field4438 >= 0 || arg2.field4430 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field2897[var9];
            }
            if (arg2.field4438 >= 0) {
                if (arg2.field4438 == 65535) {
                    var8[5] = 0;
                    var6 ^= 0xFFFFFFFF00000000L;
                } else {
                    var8[5] = class185.method1291(1073741824, arg2.field4438);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg2.field4430 >= 0) {
                if (arg2.field4430 == 65535) {
                    var8[3] = 0;
                    var6 ^= 0xFFFFFFFFL;
                } else {
                    var8[3] = class185.method1291(1073741824, arg2.field4430);
                    var6 ^= (long) var8[3];
                }
            }
        }
        class249 var10 = (class249) class115.field1871.method1794(-1, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var30 = var8[var12];
                if ((var30 & 0x40000000) == 0) {
                    if ((var30 & Integer.MIN_VALUE) != 0 && !class60.method432(3, var30 & 0x3FFFFFFF).method1769(0)) {
                        var11 = true;
                    }
                } else if (!class237.method1620(-29539, var30 & 0x3FFFFFFF).method665((byte) -102, this.field2909)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field2886 != -1L) {
                    var10 = (class249) class115.field1871.method1794(-1, this.field2886);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class50[] var13 = new class50[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var27 = var8[var15];
                    if ((var27 & 0x40000000) != 0) {
                        class50 var29 = class237.method1620(-29539, var27 & 0x3FFFFFFF).method661((byte) 20, this.field2909);
                        if (var29 != null) {
                            var13[var14++] = var29;
                        }
                    } else if ((Integer.MIN_VALUE & var27) != 0) {
                        class50 var28 = class60.method432(3, var27 & 0x3FFFFFFF).method1778(-19);
                        if (var28 != null) {
                            var13[var14++] = var28;
                        }
                    }
                }
                int var16 = var8[0];
                if ((var16 & 0x40000000) != 0) {
                    class99 var17 = class237.method1620(-29539, var16 & 0x3FFFFFFF);
                    if (var17.field1643 != null) {
                        for (int var18 = 0; var18 < var17.field1643.length; var18++) {
                            if (var17.field1643[var18] != null && var13[var18 + 1] != null) {
                                int var19 = var17.field1643[var18][1];
                                int var20 = var17.field1643[var18][3];
                                int var21 = var17.field1643[var18][2];
                                int var22 = var17.field1643[var18][5];
                                int var23 = var17.field1643[var18][4];
                                int var24 = var17.field1643[var18][0];
                                var13[var18 + 1].method363(var24, var19, var21);
                                var13[var18 + 1].method372(var20, var23, var22);
                            }
                        }
                    }
                }
                class50 var25 = new class50(var13, var14);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (this.field2887[var26] < class116.field1896[var26].length) {
                        var25.method348(class206.field3550[var26], class116.field1896[var26][this.field2887[var26]]);
                    }
                    if (this.field2887[var26] < class93.field1476[var26].length) {
                        var25.method348(class146.field2404[var26], class93.field1476[var26][this.field2887[var26]]);
                    }
                }
                var10 = var25.method351(64, 850, -30, -50, -30);
                class115.field1871.method1795(14177, var6, var10);
                this.field2886 = var6;
            }
        }
        if (arg2 == null && arg3 == null) {
            return var10;
        }
        class249 var31;
        if (arg2 != null && arg3 != null) {
            var31 = arg2.method1728(arg0, arg4, arg3, 25303, var10);
        } else if (arg2 == null) {
            var31 = arg3.method1730(var10, arg4, -121);
        } else {
            var31 = arg2.method1730(var10, arg0, 80);
        }
        if (!arg1) {
            field2910 = null;
        }
        return var31;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
    public static final void method1155(byte arg0) {
        field2905++;
        if (arg0 == 91) {
            class69.field1103.method1790(0);
        }
    }
}
