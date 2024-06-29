import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class235 {

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Lmb;")
    public static class96 field4022 = class243.method1708("b12_full", (byte) 118);

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "[[I")
    public static int[][] field4028 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field4019 = 0;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Lmb;")
    public static class96 field4023 = class243.method1708("(U0a )2 non)2existant gosub script)2num: ", (byte) 107);

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public static int field4033 = 0;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "Lmb;")
    public static class96 field4030 = class243.method1708(" (X", (byte) 106);

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field4021 = 0;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "Lmb;")
    public static class96 field4025 = class243.method1708("Musik)2Engine vorbereitet)3", (byte) 111);

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field4032 = -1;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "Lmb;")
    public static class96 field4034 = class243.method1708("Lade Benutzeroberfl-=che )2 ", (byte) 91);

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)I")
    public static final int method1591(int arg0) {
        if (arg0 != 17934) {
            method1591(-89);
        }
        field4029++;
        return ((class92.field1525 == 0 ? 0 : 1) << 21) + ((class233.field3999 == 0 ? 0 : 1) << 20) + ((class22.field386 ? 1 : 0) << 19) + ((class161.field2860 ? 1 : 0) << 15) + ((class128.field2334 ? 1 : 0) << 8) + ((class82.field1392 ? 1 : 0) << 7) + (class269.field4682 & 0x7) + ((class130.field2353 ? 1 : 0) << 3) + ((class248.field4292 ? 1 : 0) << 4) + ((class89.field1478 ? 1 : 0) << 5) + ((class237.field4073 ? 1 : 0) << 6) + ((class94.field1550 ? 1 : 0) << 9) + ((class219.field3743 ? 1 : 0) << 10) + ((class148.field2620 & 0x3) << 11) + ((class143.field2541 ? 1 : 0) << 13) + ((class109.field2014 ? 1 : 0) << 16) + ((class22.field376 & 0x3 << 17) - -((class5.field100 == 0 ? 0 : 1) << 22));
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZ)Lmb;")
    public static final class96 method1592(int arg0, boolean arg1) {
        field4031++;
        if (arg0 < 100000) {
            return class36.method289(-5615, new class96[] { class96.field1589, class31.method205(arg0, (byte) -78), class137.field2449 });
        } else if (arg0 < 10000000) {
            return class36.method289(-5615, new class96[] { class11.field182, class31.method205(arg0 / 1000, (byte) -78), class170.field2984, class137.field2449 });
        } else {
            if (arg1) {
                method1596(109);
            }
            return class36.method289(-5615, new class96[] { class186.field3246, class31.method205(arg0 / 1000000, (byte) -78), class272.field4737, class137.field2449 });
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)V")
    public static final void method1593(byte arg0, int arg1) {
        field4024++;
        class154.method1125(50);
        class2.method10(-106);
        int var2 = class85.method621((byte) 27, arg1).field1451;
        if (var2 == 0 || arg0 != -3) {
            return;
        }
        int var3 = class54.field937[arg1];
        if (var2 == 6) {
            class44.field746 = var3;
        }
        if (var2 == 9) {
            class122.field2268 = var3;
        }
        if (var2 == 5) {
            class244.field4239 = var3;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZLmb;Z)V")
    public static final void method1594(boolean arg0, class96 arg1, boolean arg2) {
        field4027++;
        class96 var3 = arg1.method702(124);
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class202.field3496; var6++) {
            class159 var9 = class269.method1845(var6, (byte) 61);
            if ((!arg2 || var9.field2778) && var9.field2811 == -1 && var9.field2813 == -1 && var9.field2766 == 0 && var9.field2779.method702(-103).method720(var3, 20329) != -1) {
                if (var5 >= 250) {
                    class274.field4785 = null;
                    class91.field1515 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        if (!arg0) {
            field4025 = null;
        }
        class91.field1515 = var5;
        class256.field4454 = 0;
        class274.field4785 = var4;
        class96[] var7 = new class96[class91.field1515];
        for (int var8 = 0; var8 < class91.field1515; var8++) {
            var7[var8] = class269.method1845(var4[var8], (byte) 61).field2779;
        }
        class229.method1561(945977671, var7, class274.field4785);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V")
    public static void method1595(boolean arg0) {
        field4022 = null;
        field4034 = null;
        if (!arg0) {
            field4019 = -20;
        }
        field4023 = null;
        field4028 = null;
        field4030 = null;
        field4025 = null;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
    public static final void method1596(int arg0) {
        class26.field440 = class201.field3491;
        class188.field3289 = class56.field987;
        class97.field1650 = class48.field846;
        class224.field3807 = class169.field2970;
        class85.field1445 = class6.field125;
        class121.field2231 = class180.field3114;
        class219.field3746 = class154.field2712;
        class247.field4283 = class198.field3447;
        class180.field3108 = class105.field1761;
        class43.field731 = class65.field1110;
        class272.field4737 = class42.field717;
        class89.field1467 = class107.field1811;
        class169.field2965 = class146.field2596;
        class49.field864 = class219.field3750;
        class245.field4261 = class259.field4496;
        class70.field1210 = class47.field839;
        class56.field976 = class64.field1108;
        class215.field3690 = class106.field1775;
        class202.field3501 = class7.field136;
        class20.field338 = class276.field4794;
        class46.field791 = class254.field4387;
        class100.field1691 = class116.field2162;
        class212.field3656 = class147.field2613;
        class54.field945 = class109.field2011;
        class241.field4186 = class227.field3871;
        class244.field4236 = class198.field3456;
        class270.field4710 = class202.field3495;
        class170.field2979 = class187.field3261;
        class135.field2428 = class173.field3023;
        class274.field4787 = class252.field4367;
        class21.field360 = class227.field3860;
        class20.field334 = class68.field1172;
        class136.field2435 = class95.field1564;
        class118.field2193 = class272.field4726;
        class78.field1327 = class171.field2995;
        class68.field1186 = class175.field3050;
        class45.field770 = class122.field2266;
        class89.field1471 = class110.field2037;
        class82.field1383 = class253.field4382;
        class9.field158 = class272.field4732;
        class75.field1296 = class2.field17;
        class22.field383 = class230.field3961;
        class145.field2576 = class61.field1050;
        class3.field59 = class176.field3067;
        class168.field2953 = class218.field3733;
        class44.field762 = class120.field2223;
        class29.field481 = class213.field3669;
        class171.field2997 = class188.field3293;
        class26.field443 = class58.field1021;
        class175.field3042 = class14.field222;
        class258.field4473 = class270.field4701;
        class170.field2984 = class187.field3261;
        class103.field1742 = class159.field2786;
        class169.field2975 = class230.field3950;
        class53.field933 = class192.field3324;
        class130.field2350 = class82.field1385;
        class62.field1055 = class175.field3041;
        if (arg0 != 3) {
            return;
        }
        class71.field1217 = class162.field2878;
        class189.field3308 = class250.field4328;
        class260.field4551 = class2.field14;
        class127.field2329 = class181.field3142;
        class68.field1173 = class36.field619;
        class156.field2725 = class114.field2100;
        class139.field2484 = class121.field2243;
        class120.field2225 = class216.field3714;
        class151.field2655 = class180.field3100;
        class197.field3438 = class222.field3795;
        class52.field917 = class98.field1669;
        class272.field4735 = class42.field717;
        class23.field402 = class15.field232;
        class7.field131 = class244.field4224;
        class206.field3532 = class117.field2175;
        class73.field1251 = class143.field2539;
        class80.field1370 = class17.field241;
        class230.field3959 = class179.field3090;
        class3.field27 = class134.field2407;
        class10.field173 = class227.field3859;
        class34.field601 = class36.field609;
        class219.field3754 = class93.field1538;
        class121.field2233 = class180.field3114;
        field4020++;
        class213.field3675 = class209.field3608;
        class206.field3538 = class265.field4629;
        class178.field3079 = class153.field2702;
        class17.field251 = class154.field2716;
        class24.field417 = class260.field4581;
        class21.field363 = class188.field3296;
        class77.field1313 = class49.field862;
        class52.field902 = class144.field2552;
    }
}
