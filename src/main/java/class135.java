import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class135 extends class28 {

    @OriginalMember(owner = "client!t", name = "X", descriptor = "I")
    public int field3103 = -1;

    @OriginalMember(owner = "client!t", name = "Y", descriptor = "Z")
    public boolean field3104 = false;

    @OriginalMember(owner = "client!t", name = "rb", descriptor = "[I")
    private int[] field3123 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!t", name = "bb", descriptor = "[S")
    private short[] field3107 = new short[6];

    @OriginalMember(owner = "client!t", name = "nb", descriptor = "[S")
    private short[] field3119 = new short[6];

    @OriginalMember(owner = "client!t", name = "lb", descriptor = "Lja;")
    public static class62 field3117 = class30.method243(43, "<col=ffff00>");

    @OriginalMember(owner = "client!t", name = "V", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!t", name = "W", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!t", name = "db", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!t", name = "eb", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!t", name = "fb", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!t", name = "gb", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!t", name = "hb", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!t", name = "ib", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!t", name = "jb", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!t", name = "kb", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!t", name = "mb", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!t", name = "ob", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!t", name = "pb", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!t", name = "sb", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!t", name = "tb", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!t", name = "qb", descriptor = "Lqe;")
    public static class116 field3122;

    @OriginalMember(owner = "client!t", name = "ab", descriptor = "Lic;")
    public static class58 field3106;

    @OriginalMember(owner = "client!t", name = "cb", descriptor = "[I")
    private int[] field3108;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILs;)V")
    private final void method1075(int arg0, int arg1, class128 arg2) {
        if (arg0 != -50) {
            this.field3103 = 6;
        }
        field3102++;
        if (arg1 == 1) {
            this.field3103 = arg2.method1025(arg0 ^ 0xFFFFFF31);
        } else if (arg1 == 2) {
            int var4 = arg2.method1025(255);
            this.field3108 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3108[var5] = arg2.method1041(212464720);
            }
        } else if (arg1 == 3) {
            this.field3104 = true;
            return;
        } else if (arg1 < 40 || arg1 >= 50) {
            if (arg1 >= 50 && arg1 < 60) {
                this.field3119[arg1 - 50] = (short) arg2.method1041(212464720);
                return;
            }
            if (arg1 >= 60 && arg1 < 70) {
                this.field3123[arg1 - 60] = arg2.method1041(212464720);
                return;
            }
        } else {
            this.field3107[arg1 - 40] = (short) arg2.method1041(212464720);
            return;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(Lae;I)V")
    public static final void method1076(class6 arg0, int arg1) {
        field3115++;
        if (class86.field2060 == arg0.field187 || arg0.field177 == -1 || arg0.field155 != 0 || arg0.field139 + 1 > class141.method1121(arg0.field177, -24732).field280[arg0.field169]) {
            int var2 = arg0.field166 * 128 + arg0.field149 * 64;
            int var3 = arg0.field187 - arg0.field150;
            int var4 = class86.field2060 - arg0.field150;
            int var5 = arg0.field173 * 128 + arg0.field149 * 64;
            arg0.field136 = ((var3 - var4) * var2 + var4 * var5) / var3;
            int var6 = arg0.field149 * 64 + arg0.field143 * 128;
            int var7 = arg0.field148 * 128 + arg0.field149 * 64;
            arg0.field134 = ((var3 - var4) * var6 + var4 * var7) / var3;
        }
        if (arg0.field164 == 0) {
            arg0.field137 = 1024;
        }
        if (arg0.field164 == 1) {
            arg0.field137 = 1536;
        }
        arg0.field141 = 0;
        if (arg0.field164 == 2) {
            arg0.field137 = 0;
        }
        if (arg1 >= -119) {
            field3117 = null;
        }
        if (arg0.field164 == 3) {
            arg0.field137 = 512;
        }
        arg0.field168 = arg0.field137;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III[B)I")
    public static final int method1077(int arg0, int arg1, int arg2, byte[] arg3) {
        field3113++;
        int var4 = -1;
        for (int var5 = arg2; var5 < arg1; var5++) {
            var4 = var4 >>> 8 ^ class108.field2479[(var4 ^ arg3[var5]) & 0xFF];
        }
        int var6 = ~var4;
        if (arg0 <= 33) {
            field3122 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V")
    public static void method1078(int arg0) {
        if (arg0 != 6) {
            method1076(null, -38);
        }
        field3117 = null;
        field3122 = null;
        field3106 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BLja;Lja;IIII)V")
    public static final void method1079(byte arg0, class62 arg1, class62 arg2, int arg3, int arg4, int arg5, int arg6) {
        field3110++;
        if (class119.field2709) {
            return;
        }
        if (class128.field2889 < 500) {
            class53.field1226[class128.field2889] = arg2;
            class60.field1479[class128.field2889] = arg1;
            class146.field3437[class128.field2889] = arg6;
            class124.field2836[class128.field2889] = arg4;
            class12.field288[class128.field2889] = arg5;
            class59.field1440[class128.field2889] = arg3;
            class128.field2889++;
        }
        if (arg0 != -113) {
            field3122 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)Lqb;")
    public final class112 method1080(int arg0) {
        field3125++;
        class112[] var2 = new class112[5];
        if (arg0 != 27016) {
            return null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3123[var4] != -1) {
                var2[var3++] = class112.method925(class28.field697, this.field3123[var4], 0);
            }
        }
        class112 var5 = new class112(var2, var3);
        for (int var6 = 0; var6 < 6 && this.field3107[var6] != 0; var6++) {
            var5.method909(this.field3107[var6], this.field3119[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!t", name = "g", descriptor = "(I)V")
    public static final void method1081(int arg0) {
        class119 var1 = class70.field1788;
        synchronized (class70.field1788) {
            class70.field1797 = class86.field2062;
            class103.field2398 = class153.field3564;
            class84.field2032 = class10.field251;
            class70.field1792 = class29.field706;
            class29.field713 = class71.field1811;
            class4.field56 = class18.field412;
            class42.field984 = class155.field3600;
            class29.field706 = arg0;
        }
        field3105++;
    }

    @OriginalMember(owner = "client!t", name = "h", descriptor = "(I)Z")
    public final boolean method1082(int arg0) {
        field3118++;
        if (arg0 <= 63) {
            this.field3108 = null;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3123[var3] != -1 && !class28.field697.method883(this.field3123[var3], -1, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
    public static final void method1083(int arg0, int arg1, int arg2) {
        field3114++;
        if (class128.field2889 < arg1 && class68.field1692 == 0 && !class90.field2145) {
            return;
        }
        class62 var3;
        if (class68.field1692 == 1 && class128.field2889 < 2) {
            var3 = class70.method594(new class62[] { class35.field827, class144.field3364, class60.field1459, class32.field777 }, 1229);
        } else if (class90.field2145 && class128.field2889 < 2) {
            var3 = class70.method594(new class62[] { class124.field2835, class144.field3364, class27.field678, class32.field777 }, 1229);
        } else {
            var3 = class97.method756(-121, class128.field2889 - 1);
        }
        if (class128.field2889 > 2) {
            var3 = class70.method594(new class62[] { var3, class72.field1845, class31.method249(true, class128.field2889 - 2), class88.field2084 }, 1229);
        }
        class70.field1789.method689(var3, arg2 + 4, arg0 + 15, 16777215, 0, class86.field2060 / 1000);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)Z")
    public final boolean method1084(boolean arg0) {
        field3120++;
        if (this.field3108 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0) {
            method1081(57);
        }
        for (int var3 = 0; var3 < this.field3108.length; var3++) {
            if (!class28.field697.method883(this.field3108[var3], -1, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!t", name = "i", descriptor = "(I)V")
    public static final void method1085(int arg0) {
        class12.field295 = class77.field1906;
        class94.field2189 = class149.field3512;
        class26.field619 = class141.field3287;
        class140.field3286 = class18.field404;
        class88.field2089 = class102.field2375;
        class126.field2849 = class80.field1933;
        class42.field990 = class30.field737;
        client.field498 = class52.field1195;
        class51.field1184 = class26.field631;
        class54.field1338 = class105.field2443;
        class110.field2515 = class48.field1106;
        class26.field613 = class136.field3129;
        class28.field701 = class94.field2186;
        class140.field3261 = class62.field1525;
        class120.field2761 = class40.field931;
        class9.field239 = class1.field10;
        class115.field2656 = class56.field1387;
        class121.field2775 = class131.field3003;
        class131.field3001 = class24.field590;
        class140.field3285 = class79.field1909;
        class53.field1220 = class6.field200;
        class26.field615 = class136.field3141;
        class131.field3004 = class39.field900;
        class20.field455 = class148.field3497;
        class42.field965 = class105.field2424;
        class136.field3142 = class148.field3494;
        class140.field3280 = class36.field870;
        class140.field3262 = class79.field1909;
        class16.field381 = class48.field1115;
        class150.field3535 = class111.field2551;
        class134.field3075 = class121.field2773;
        class140.field3239 = class83.field1990;
        class67.field1667 = class143.field3337;
        class119.field2708 = class103.field2394;
        client.field493 = class38.field895;
        class71.field1810 = class1.field14;
        class120.field2763 = class31.field751;
        class84.field2025 = class8.field233;
        class140.field3275 = class79.field1909;
        class137.field3157 = class65.field1610;
        class39.field916 = class103.field2386;
        class31.field760 = class31.field759;
        class140.field3271 = class38.field895;
        class140.field3236 = class79.field1909;
        class39.field906 = class122.field2793;
        class148.field3490 = class65.field1619;
        class140.field3276 = class72.field1843;
        class140.field3281 = class79.field1909;
        client.field507 = class68.field1689;
        class94.field2196 = class34.field800;
        client.field491 = class38.field895;
        class140.field3235 = class79.field1909;
        class36.field856 = class32.field775;
        class155.field3587 = class71.field1803;
        class50.field1160 = class32.field788;
        client.field490 = class38.field895;
        class62.field1509 = class119.field2725;
        class29.field732 = class24.field592;
        class15.field351 = class51.field1177;
        class140.field3263 = class24.field596;
        class13.field316 = class105.field2423;
        class140.field3284 = class79.field1909;
        class143.field3349 = class150.field3532;
        class81.field1951 = class50.field1153;
        class12.field297 = class3.field22;
        class32.field766 = class42.field987;
        class108.field2483 = class155.field3582;
        class84.field2022 = class119.field2715;
        class4.field46 = class136.field3139;
        class126.field2841 = class67.field1677;
        class27.field658 = class51.field1172;
        class50.field1151 = class103.field2384;
        class88.field2092 = class36.field865;
        class26.field626 = class136.field3141;
        class43.field1005 = class75.field1870;
        class35.field849 = class28.field691;
        class116.field2675 = class80.field1941;
        class93.field2174 = class77.field1904;
        if (arg0 >= -93) {
            field3106 = null;
        }
        class70.field1782 = class150.field3534;
        class138.field3219 = class32.field792;
        class12.field284 = class54.field1357;
        class140.field3243 = class79.field1909;
        class4.field49 = class113.field2614;
        class148.field3495 = class65.field1619;
        class140.field3268 = class130.field2970;
        class94.field2214 = class34.field800;
        class140.field3282 = class79.field1909;
        class110.field2519 = class149.field3517;
        class111.field2532 = class96.field2244;
        class138.field3203 = class126.field2845;
        class38.field891 = class26.field612;
        class144.field3363 = class103.field2396;
        class63.field1555 = class72.field1849;
        class155.field3609 = class119.field2713;
        class126.field2854 = class77.field1907;
        class138.field3221 = class32.field792;
        class71.field1805 = class15.field341;
        class13.field318 = class65.field1605;
        class30.field743 = class142.field3317;
        class75.field1871 = class120.field2752;
        class52.field1202 = class7.field209;
        class144.field3364 = class23.field583;
        class42.field986 = class38.field892;
        class110.field2511 = class113.field2615;
        class140.field3252 = class46.field1057;
        class83.field1996 = class94.field2197;
        class140.field3256 = class134.field3071;
        class81.field1968 = class38.field883;
        class35.field827 = class50.field1156;
        class30.field746 = class140.field3253;
        class63.field1573 = class51.field1174;
        client.field510 = class8.field219;
        class40.field930 = class1.field2;
        class5.field118 = class153.field3567;
        class10.field252 = class60.field1454;
        class122.field2787 = class140.field3278;
        class45.field1022 = class51.field1175;
        class43.field991 = class105.field2429;
        class134.field3084 = class115.field2633;
        class51.field1185 = class10.field253;
        class90.field2155 = class38.field889;
        class140.field3245 = class79.field1909;
        class140.field3240 = class136.field3144;
        class67.field1678 = class84.field2023;
        class141.field3303 = class96.field2239;
        class110.field2512 = class34.field826;
        class122.field2796 = class39.field915;
        class26.field629 = class62.field1523;
        class108.field2472 = class15.field366;
        class140.field3274 = class36.field870;
        class6.field204 = class30.field741;
        class35.field839 = class22.field521;
        class122.field2802 = class40.field933;
        class63.field1541 = class115.field2632;
        class24.field591 = class118.field2699;
        class46.field1044 = class32.field786;
        client.field499 = class4.field55;
        class140.field3250 = class79.field1909;
        class132.field3024 = class94.field2205;
        class98.field2296 = class80.field1939;
        class140.field3237 = class79.field1909;
        class39.field910 = class45.field1039;
        class147.field3457 = class128.field2897;
        class94.field2216 = class153.field3569;
        class153.field3561 = class1.field18;
        class39.field914 = class13.field312;
        class141.field3296 = class84.field2030;
        class153.field3566 = class105.field2436;
        class45.field1033 = class137.field3150;
        class57.field1395 = class28.field692;
        class121.field2770 = class52.field1197;
        class56.field1378 = class63.field1549;
        class30.field736 = class4.field50;
        class40.field937 = class119.field2731;
        class140.field3279 = class79.field1909;
        class134.field3058 = class22.field529;
        class132.field3014 = class130.field2967;
        class147.field3474 = class26.field627;
        class20.field466 = class141.field3293;
        class146.field3447 = class93.field2172;
        class111.field2547 = class148.field3482;
        class140.field3260 = class79.field1909;
        class140.field3246 = class79.field1909;
        class16.field380 = class46.field1064;
        class130.field2977 = class1.field7;
        class147.field3478 = class121.field2783;
        class132.field3020 = class79.field1909;
        class3.field23 = class100.field2336;
        class140.field3266 = class83.field1990;
        class72.field1842 = class128.field2882;
        class140.field3255 = class79.field1909;
        class39.field909 = class103.field2386;
        field3101++;
        class28.field698 = class94.field2186;
        client.field483 = class8.field219;
        class140.field3283 = class79.field1909;
        class140.field3251 = class79.field1909;
        class50.field1152 = class10.field245;
        class88.field2084 = class7.field212;
        class50.field1155 = class115.field2648;
        class67.field1680 = class3.field37;
        class140.field3249 = class79.field1909;
        class70.field1774 = class97.field2265;
        class12.field293 = class88.field2083;
        class80.field1937 = class96.field2232;
        class142.field3322 = class10.field246;
        class140.field3242 = class79.field1909;
        class18.field413 = class75.field1862;
        class48.field1109 = class134.field3087;
        class140.field3258 = class1.field9;
        class151.field3558 = class151.field3552;
        class8.field227 = class27.field676;
        class118.field2689 = class23.field566;
        class140.field3269 = class79.field1909;
        class72.field1844 = class100.field2318;
        class140.field3267 = class153.field3573;
        class130.field2972 = class149.field3506;
        if (class27.field679) {
        }
    }

    @OriginalMember(owner = "client!t", name = "j", descriptor = "(I)V")
    public static final void method1086(int arg0) {
        field3124++;
        if (arg0 <= 120) {
            field3122 = null;
        }
        class6.field194.method127((byte) -121);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILs;)V")
    public final void method1087(int arg0, class128 arg1) {
        while (true) {
            int var3 = arg1.method1025(255);
            if (var3 == 0) {
                field3111++;
                if (arg0 != 0) {
                    field3122 = null;
                    return;
                }
                return;
            }
            this.method1075(arg0 ^ 0xFFFFFFCE, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method1088(String arg0, byte arg1) throws ClassNotFoundException {
        field3112++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        }
        if (arg1 != -24) {
            method1076(null, -63);
        }
        if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!t", name = "k", descriptor = "(I)Lqb;")
    public final class112 method1089(int arg0) {
        field3116++;
        if (this.field3108 == null) {
            return null;
        }
        class112[] var2 = new class112[this.field3108.length];
        for (int var3 = 0; var3 < this.field3108.length; var3++) {
            var2[var3] = class112.method925(class28.field697, this.field3108[var3], 0);
        }
        class112 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class112(var2, var2.length);
        }
        if (arg0 == 5) {
            for (int var5 = 0; var5 < 6 && this.field3107[var5] != 0; var5++) {
                var4.method909(this.field3107[var5], this.field3119[var5]);
            }
            return var4;
        } else {
            return null;
        }
    }
}
