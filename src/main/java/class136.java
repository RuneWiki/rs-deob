import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class136 extends RuntimeException {

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3318;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "Ljava/lang/String;")
    public String field3322;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "Lgd;")
    private static class40 field3327 = class14.method90(false, "Remove");

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "Lgd;")
    public static class40 field3325 = field3327;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Lgd;")
    private static class40 field3319 = class14.method90(false, "wave2:");

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Lgd;")
    public static class40 field3316 = field3319;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "Loe;")
    public static class89 field3314 = new class89();

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field3331 = -1;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "[I")
    public static int[] field3329 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field3332 = 0;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "Lw;")
    public static class135 field3333;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "Loc;")
    public static class86 field3330;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILhe;Lhe;)V", line = 6)
    public static final void method1069(int arg0, class47 arg1, class47 arg2) {
        field3323++;
        client.field468.method561((byte) -74);
        if (class115.field2769 == 0 || class115.field2769 == 5) {
            byte var3 = 20;
            arg1.method349(class11.field283, 180, 74 - var3, 16777215);
            int var4 = 82 - var3;
            class27.method168(28, var4, 304, 34, 9179409);
            class27.method168(29, var4 + 1, 302, 32, 0);
            class27.method164(30, var4 + 2, class13.field342 * 3, 30, 9179409);
            class27.method164(class13.field342 * 3 + 30, var4 + 2, 300 - class13.field342 * 3, 30, 0);
            arg1.method349(class92.field2113, 180, 105 - var3, 16777215);
        }
        if (class115.field2769 == 20) {
            class135.field3312.method497(0, 0);
            byte var5 = 40;
            arg1.method364(class92.field2095, 180, var5, 16776960, true);
            int var20 = var5 + 15;
            arg1.method364(class92.field2112, 180, var20, 16776960, true);
            int var21 = var20 + 15;
            arg1.method364(class92.field2107, 180, var21, 16776960, true);
            int var22 = var21 + 15;
            int var23 = var22 + 10;
            arg1.method358(client.method114(true, new class40[] { class48.field1216, class92.field2097 }), 90, var23, 16777215, true);
            int var24 = var23 + 15;
            arg1.method358(client.method114(true, new class40[] { class96.field2241, class92.field2117.method256((byte) -38) }), 92, var24, 16777215, true);
            int var25 = var24 + 15;
        }
        if (class115.field2769 == 10) {
            class135.field3312.method497(0, 0);
            if (class79.field1808 == 0) {
                byte var13 = 100;
                byte var14 = 80;
                arg1.method364(class86.field1923, 180, var14, 16776960, true);
                int var36 = var14 + 30;
                byte var15 = 120;
                class22.field492.method497(var13 - 73, var15 + -20);
                arg1.method366(class51.field1293, var13 - 73, var15 - 20, 144, 40, 16777215, true, 1, 1, 0);
                short var16 = 260;
                class22.field492.method497(var16 - 73, var15 + -20);
                arg1.method366(class82.field1848, var16 - 73, var15 + -20, 144, 40, 16777215, true, 1, 1, 0);
            } else if (class79.field1808 == 2) {
                byte var6 = 100;
                byte var7 = 40;
                arg1.method364(class92.field2095, 180, var7, 16776960, true);
                int var26 = var7 + 15;
                short var8 = 150;
                arg1.method364(class92.field2112, 180, var26, 16776960, true);
                int var27 = var26 + 15;
                arg1.method364(class92.field2107, 180, var27, 16776960, true);
                int var28 = var27 + 15;
                int var29 = var28 + 10;
                arg1.method358(client.method114(true, new class40[] { class48.field1216, class92.field2097, class10.field242 % 40 < 20 & class34.field856 == 0 ? class85.field1899 : class92.field2101 }), 90, var29, 16777215, true);
                int var30 = var29 + 15;
                arg1.method358(client.method114(true, new class40[] { class96.field2241, class92.field2117.method256((byte) -38), class34.field856 == 1 & class10.field242 % 40 < 20 ? class85.field1899 : class92.field2101 }), 92, var30, 16777215, true);
                int var31 = var30 + 15;
                class22.field492.method497(var6 - 73, var8 + -20);
                arg1.method364(class115.field2780, var6, var8 + 5, 16777215, true);
                short var9 = 260;
                class22.field492.method497(var9 - 73, var8 + -20);
                arg1.method364(class115.field2770, var9, var8 + 5, 16777215, true);
            } else if (class79.field1808 == 3) {
                arg1.method364(class106.field2587, 180, 40, 16776960, true);
                byte var10 = 65;
                arg1.method364(class52.field1320, 180, var10, 16777215, true);
                short var11 = 150;
                int var32 = var10 + 15;
                arg1.method364(class126.field3000, 180, var32, 16777215, true);
                short var12 = 180;
                int var33 = var32 + 15;
                arg1.method364(class64.field1564, 180, var33, 16777215, true);
                int var34 = var33 + 15;
                arg1.method364(class128.field3075, 180, var34, 16777215, true);
                int var35 = var34 + 15;
                class22.field492.method497(var12 - 73, var11 + -20);
                arg1.method364(class115.field2770, var12, var11 + 5, 16777215, true);
            }
        }
        class42.method286(4687);
        try {
            Graphics var17 = class30.field761.getGraphics();
            client.field468.method465(-125, 171, var17, 202);
            class115.field2774.method465(-114, 0, var17, 0);
            class1.field25.method465(-112, 0, var17, 637);
            if (class64.field1571) {
                class64.field1571 = false;
                class22.field499.method465(-59, 0, var17, 128);
                class118.field2802.method465(-96, 371, var17, 202);
                class54.field1383.method465(-99, 265, var17, 0);
                class131.field3187.method465(-66, 265, var17, 562);
                class92.field2111.method465(-69, 171, var17, 128);
                class112.field2695.method465(-109, 171, var17, 562);
            }
            int var18 = -49 % ((14 - arg0) / 39);
        } catch (Exception var19) {
            class30.field761.repaint();
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 145)
    public static void method1070(int arg0) {
        if (arg0 != -25680) {
            field3330 = null;
        }
        field3329 = null;
        field3333 = null;
        field3327 = null;
        field3316 = null;
        field3330 = null;
        field3325 = null;
        field3319 = null;
        field3314 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V", line = 172)
    public static final void method1071(int arg0, int arg1, int arg2) {
        field3320++;
        if (class16.field418 != arg0 && arg2 != -1) {
            class94.method642(false, (byte) -119, class16.field418, 0, arg2, 1, class98.field2324);
            class94.field2178 = arg1;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILjava/awt/Component;I)Loc;", line = 187)
    public static final class86 method1072(int arg0, int arg1, Component arg2, int arg3) {
        field3324++;
        try {
            Class var4 = Class.forName("m");
            class86 var5 = (class86) var4.getDeclaredConstructor().newInstance();
            if (arg0 == 120) {
                var5.method468(arg1, arg3, arg2, (byte) -122);
                return var5;
            } else {
                return null;
            }
        } catch (Throwable var7) {
            class65 var6 = new class65();
            var6.method468(arg1, arg3, arg2, (byte) -112);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V", line = 210)
    public static final void method1073(int arg0) {
        try {
            Graphics var1 = class30.field761.getGraphics();
            class101.field2406.method465(-118, 4, var1, 0);
            class10.field268.method465(-128, 357, var1, 0);
            class104.field2568.method465(-92, 4, var1, 722);
            class135.field3278.method465(arg0 ^ 0xFFFFFF72, arg0, var1, 743);
            class128.field3074.method465(-53, 0, var1, 0);
            class86.field1915.method465(-101, 4, var1, 516);
            field3330.method465(-99, 205, var1, 516);
            class18.field446.method465(-90, 357, var1, 496);
            class65.field1574.method465(-107, 338, var1, 0);
        } catch (Exception var2) {
            class30.field761.repaint();
        }
        field3317++;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V", line = 235)
    public static final void method1074(int arg0) {
        field3321++;
        if (!class96.field2244) {
            return;
        }
        class31.field778 = null;
        class8.field210 = null;
        class8.field219 = null;
        class12.field309 = null;
        class115.field2774 = null;
        class131.field3187 = null;
        class114.field2756 = null;
        class53.field1356 = null;
        class112.field2695 = null;
        class22.field499 = null;
        class55.field1407 = null;
        class92.field2111 = null;
        class63.field1550 = null;
        class118.field2802 = null;
        class54.field1383 = null;
        if (arg0 < 106) {
            field3330 = null;
        }
        class4.field120 = null;
        class135.field3312 = null;
        class22.field492 = null;
        class1.field25 = null;
        client.field468 = null;
        class63.field1548 = null;
        class79.field1809 = null;
        class94.method634((byte) 126, 10);
        class110.method858(1, true);
        class96.field2244 = false;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)Lhd;", line = 277)
    public static final class46 method1075(boolean arg0) {
        class46 var1 = new class46();
        if (!arg0) {
            method1073(-56);
        }
        var1.field1165 = class16.field424;
        field3328++;
        var1.field1168 = class99.field2355;
        var1.field1163 = class122.field2860[0];
        var1.field1166 = class120.field2842[0];
        var1.field1169 = class134.field3271[0];
        var1.field1164 = class30.field754[0];
        byte[] var2 = class129.field3086[0];
        int var3 = var1.field1169 * var1.field1164;
        var1.field1167 = new int[var3];
        for (int var4 = 0; var4 < var3; var4++) {
            var1.field1167[var4] = class96.field2229[class101.method709(255, var2[var4])];
        }
        class107.method825(-13254);
        return var1;
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V", line = 312)
    public static final void method1076(int arg0) {
        class74.field1714 = class118.field2792;
        class125.field2982 = class23.field549;
        class85.field1904 = class137.field3355;
        class24.field571 = class90.field2038;
        class69.field1672 = class103.field2442;
        field3325 = class126.field3008;
        class9.field227 = class76.field1764;
        class7.field194 = class22.field506;
        class98.field2326 = class5.field148;
        class130.field3144 = class42.field1037;
        class54.field1360 = class112.field2717;
        class128.field3072 = class48.field1226;
        class86.field1923 = class70.field1696;
        class8.field215 = class131.field3173;
        class130.field3121 = class42.field1037;
        class83.field1883 = class8.field203;
        class69.field1670 = class9.field235;
        class86.field1914 = class83.field1875;
        class91.field2084 = class137.field3353;
        class130.field3148 = class24.field565;
        class88.field1989 = class12.field313;
        class130.field3166 = class42.field1037;
        class126.field3015 = class9.field234;
        class11.field287 = class51.field1302;
        class16.field425 = class41.field1009;
        class130.field3152 = class42.field1037;
        class80.field1840 = class128.field3060;
        class120.field2828 = class131.field3185;
        class99.field2363 = class98.field2330;
        class92.field2126 = class65.field1595;
        class126.field3000 = class40.field971;
        class22.field514 = class11.field284;
        class60.field1513 = class130.field3135;
        class120.field2840 = class99.field2362;
        class55.field1427 = class23.field542;
        class22.field502 = class4.field131;
        class86.field1913 = class24.field552;
        class49.field1243 = class23.field541;
        class96.field2245 = class41.field1024;
        class12.field301 = class114.field2751;
        class56.field1456 = class101.field2417;
        class45.field1139 = class34.field866;
        class100.field2382 = class87.field1977;
        class45.field1133 = class4.field144;
        class52.field1320 = class44.field1101;
        class115.field2770 = class112.field2701;
        class35.field894 = class103.field2454;
        class41.field1015 = class56.field1453;
        class87.field1939 = class13.field347;
        class108.field2628 = class110.field2685;
        class120.field2839 = class29.field614;
        class108.field2630 = class74.field1729;
        class10.field267 = class99.field2346;
        class115.field2778 = class125.field2963;
        class48.field1227 = class40.field1002;
        class114.field2743 = class130.field3145;
        class93.field2130 = class30.field751;
        class52.field1325 = class122.field2863;
        class80.field1836 = class14.field387;
        class67.field1656 = class66.field1628;
        class104.field2546 = class34.field863;
        class65.field1581 = class52.field1323;
        class13.field323 = class24.field570;
        class100.field2378 = class101.field2411;
        class113.field2724 = class2.field35;
        class51.field1311 = class40.field968;
        class13.field345 = class126.field2986;
        class56.field1452 = class86.field1918;
        class54.field1369 = class56.field1443;
        class130.field3149 = class61.field1524;
        class130.field3159 = class90.field2039;
        class133.field3251 = class59.field1501;
        class108.field2625 = class63.field1543;
        class14.field371 = class4.field129;
        class98.field2336 = class59.field1500;
        class70.field1681 = class101.field2410;
        class4.field100 = class42.field1039;
        class91.field2076 = class133.field3247;
        class129.field3087 = class86.field1917;
        class130.field3163 = class115.field2764;
        class11.field283 = class70.field1689;
        class65.field1591 = class129.field3092;
        class34.field864 = class52.field1321;
        class79.field1811 = class89.field2022;
        class115.field2780 = class101.field2413;
        class130.field3165 = class42.field1037;
        class103.field2481 = class101.field2418;
        class79.field1815 = class63.field1545;
        class130.field3146 = class79.field1807;
        class89.field2020 = class79.field1802;
        class130.field3125 = class90.field2039;
        class90.field2029 = class11.field271;
        class89.field2026 = class130.field3162;
        class7.field189 = class112.field2706;
        class130.field3151 = class135.field3300;
        class135.field3290 = class91.field2082;
        class74.field1721 = class118.field2792;
        class56.field1450 = class132.field3216;
        class48.field1216 = class8.field202;
        class13.field336 = class49.field1248;
        if (arg0 < 100) {
            return;
        }
        class53.field1351 = class90.field2035;
        class16.field417 = class129.field3089;
        class83.field1885 = class110.field2673;
        class130.field3119 = class24.field579;
        class51.field1293 = class8.field197;
        class128.field3075 = class118.field2790;
        class79.field1801 = class130.field3133;
        class1.field3 = class110.field2681;
        class45.field1143 = class113.field2731;
        class132.field3202 = class29.field630;
        class64.field1564 = class126.field3007;
        class69.field1668 = class51.field1301;
        class128.field3034 = class135.field3309;
        class70.field1683 = class101.field2419;
        class130.field3118 = class42.field1037;
        class120.field2841 = class83.field1876;
        class130.field3157 = class42.field1037;
        class130.field3155 = class42.field1037;
        class70.field1678 = class135.field3296;
        class85.field1906 = class64.field1572;
        class130.field3131 = class42.field1037;
        class18.field438 = class51.field1310;
        class120.field2849 = class29.field614;
        class88.field1984 = class79.field1804;
        class125.field2951 = class10.field260;
        class120.field2847 = class83.field1876;
        class38.field926 = class66.field1622;
        class98.field2320 = class48.field1230;
        class48.field1232 = class85.field1891;
        class130.field3122 = class135.field3300;
        class59.field1499 = class2.field30;
        class130.field3132 = class42.field1037;
        class130.field3116 = class4.field89;
        class5.field151 = class80.field1835;
        class79.field1793 = class65.field1595;
        class130.field3138 = class113.field2730;
        class83.field1881 = class8.field203;
        class130.field3136 = class42.field1037;
        class128.field3061 = class74.field1725;
        class30.field759 = class1.field19;
        class48.field1220 = class122.field2861;
        class130.field3160 = class42.field1037;
        class96.field2241 = class92.field2110;
        class101.field2415 = class87.field1969;
        class126.field2997 = class101.field2416;
        class90.field2046 = class133.field3237;
        class10.field243 = class137.field3357;
        class115.field2782 = class79.field1813;
        class106.field2577 = class65.field1579;
        class41.field1019 = class14.field388;
        class130.field3164 = class98.field2317;
        class70.field1682 = class120.field2813;
        class130.field3127 = class67.field1642;
        class83.field1884 = class8.field203;
        class1.field27 = class61.field1519;
        class7.field176 = class128.field3068;
        field3326++;
        class82.field1848 = class100.field2370;
        class4.field91 = class10.field260;
        class130.field3141 = class42.field1037;
        class125.field2980 = class38.field940;
        class70.field1699 = class120.field2834;
        class54.field1386 = class76.field1761;
        class108.field2648 = class13.field339;
        class130.field3129 = class42.field1037;
        class103.field2492 = class74.field1715;
        class130.field3123 = class42.field1037;
        class134.field3269 = class93.field2153;
        class94.field2157 = class94.field2162;
        class31.field815 = class1.field9;
        client.field472 = class122.field2874;
        class67.field1636 = class69.field1667;
        class35.field886 = class1.field21;
        class40.field963 = class4.field136;
        class77.field1784 = class106.field2589;
        class85.field1888 = class88.field1997;
        class5.field153 = class125.field2977;
        class76.field1756 = class38.field945;
        class11.field295 = class66.field1617;
        class100.field2372 = class133.field3254;
        class67.field1648 = class79.field1812;
        class130.field3139 = class133.field3240;
        class85.field1896 = class88.field1997;
        class7.field188 = class41.field1028;
        class12.field298 = class90.field2048;
        class130.field3143 = class8.field203;
        class83.field1872 = class43.field1074;
        class83.field1866 = class43.field1074;
        class130.field3103 = class51.field1309;
        class10.field256 = class108.field2627;
        class130.field3126 = class42.field1037;
        class85.field1900 = class112.field2693;
        class106.field2587 = class5.field154;
        class64.field1573 = class29.field615;
        class107.field2608 = class21.field488;
        class106.field2585 = class88.field1993;
        class41.field1029 = class87.field1976;
        class22.field505 = class93.field2146;
        field3316 = class85.field1890;
        class137.field3364 = class83.field1873;
        class79.field1794 = class125.field2974;
        class10.field249 = class133.field3245;
        client.field469 = class11.field293;
        class16.field427 = class10.field254;
        class104.field2524 = class80.field1837;
        class126.field2996 = class118.field2787;
        class23.field543 = class77.field1785;
        class130.field3156 = class48.field1219;
        class130.field3154 = class42.field1037;
        class34.field867 = class8.field200;
        class21.field485 = class42.field1045;
        class43.field1091 = class52.field1335;
        if (class87.field1981) {
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 582)
    public class136(Throwable arg0, String arg1) {
        this.field3318 = arg0;
        this.field3322 = arg1;
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)V", line = 601)
    public static final void method1077(int arg0) {
        field3313++;
        int var1 = 39 % ((arg0 - 9) / 33);
        if (class16.field416 != null) {
            class16.field416.method1079(true);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILgd;)V", line = 615)
    public static final void method1078(int arg0, class40 arg1) {
        field3315++;
        if (arg1 == null || arg1.method255(-10) == 0) {
            class94.field2174 = 0;
            return;
        }
        class40[] var2 = new class40[100];
        class40 var3 = arg1;
        if (arg0 != 19192) {
            method1071(-6, 29, 56);
        }
        int var4 = 0;
        while (true) {
            int var5 = var3.method271((byte) -125, 32);
            if (var5 == -1) {
                class40 var7 = var3.method259((byte) -106);
                if (var7.method255(-10) > 0) {
                    var2[var4++] = var7.method267(105);
                }
                class94.field2174 = 0;
                label51: for (int var8 = 0; var8 < class5.field147; var8++) {
                    class4 var9 = class132.method1041(var8, 45);
                    if (var9.field87 == -1 && var9.field114 != null) {
                        class40 var10 = var9.field114.method267(106);
                        for (int var11 = 0; var11 < var4; var11++) {
                            if (var10.method258(var2[var11], (byte) 101) == -1) {
                                continue label51;
                            }
                        }
                        class9.field229[class94.field2174] = var10;
                        class49.field1242[class94.field2174] = var8;
                        class94.field2174++;
                        if (class9.field229.length <= class94.field2174) {
                            return;
                        }
                    }
                }
                return;
            }
            class40 var6 = var3.method242(0, -12448, var5).method259((byte) 105);
            if (var6.method255(-10) > 0) {
                var2[var4++] = var6.method267(116);
            }
            var3 = var3.method240(arg0 ^ 0xFFFFDA0D, var5 + 1);
        }
    }
}
