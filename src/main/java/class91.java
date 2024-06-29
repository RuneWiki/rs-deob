import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class91 {

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Lec;")
    public static class32 field2089 = class73.method594(" )2> <col=00ffff>", true);

    @OriginalMember(owner = "client!na", name = "o", descriptor = "Lec;")
    public static class32 field2091 = class73.method594(" loggt sich aus)3", true);

    @OriginalMember(owner = "client!na", name = "e", descriptor = "[[I")
    public static int[][] field2081 = new int[5][5000];

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Lec;")
    private static class32 field2087 = class73.method594("Players", true);

    @OriginalMember(owner = "client!na", name = "r", descriptor = "Lec;")
    public static class32 field2094 = field2087;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Lec;")
    public static class32 field2092 = class73.method594("Null", true);

    @OriginalMember(owner = "client!na", name = "t", descriptor = "[I")
    public static int[] field2096 = new int[200];

    @OriginalMember(owner = "client!na", name = "s", descriptor = "Lec;")
    public static class32 field2095 = class73.method594(" zuerst von Ihrer Ignorieren)2Liste(Q", true);

    @OriginalMember(owner = "client!na", name = "x", descriptor = "Lec;")
    private static class32 field2100 = class73.method594("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", true);

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Lec;")
    public static class32 field2085 = field2100;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "Lec;")
    public static class32 field2103 = class73.method594("null", true);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public int field2077;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public int field2080;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public int field2093;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Lbf;")
    public static class14 field2090;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Lea;")
    public static class30 field2088;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static final void method719(int arg0) {
        field2099++;
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        System.exit(1);
        if (arg0 != 10649) {
            field2103 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public static void method720(int arg0) {
        field2095 = null;
        field2087 = null;
        field2085 = null;
        field2100 = null;
        if (arg0 != 0) {
            method728((byte) -11);
        }
        field2088 = null;
        field2103 = null;
        field2094 = null;
        field2096 = null;
        field2081 = null;
        field2090 = null;
        field2091 = null;
        field2089 = null;
        field2092 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IJ)V")
    public static final void method721(int arg0, long arg1) {
        field2098++;
        if (arg1 == 0L) {
            return;
        }
        if (class2.field20 >= 100 && class158.field3610 != 1 || class2.field20 >= 200) {
            class79.method629((byte) 98, class62.field1414, 0, class77.field1787);
            return;
        }
        class32 var3 = class9.method59(arg1, 1).method264((byte) 52);
        for (int var4 = 0; var4 < class2.field20; var4++) {
            if (class33.field695[var4] == arg1) {
                class79.method629((byte) 98, class52.method403(new class32[] { var3, class133.field3078 }, (byte) -20), 0, class77.field1787);
                return;
            }
        }
        for (int var5 = 0; var5 < class106.field2506; var5++) {
            if (class103.field2409[var5] == arg1) {
                class79.method629((byte) 98, class52.method403(new class32[] { class5.field97, var3, class152.field3488 }, (byte) -20), 0, class77.field1787);
                return;
            }
        }
        if (var3.method272(true, class20.field373.field1660)) {
            class79.method629((byte) 98, class5.field96, 0, class77.field1787);
            return;
        }
        if (arg0 <= 52) {
            method720(-32);
        }
        class106.field2509++;
        class14.field239[class2.field20] = var3;
        class33.field695[class2.field20] = arg1;
        field2096[class2.field20] = 0;
        class5.field103[class2.field20] = 0;
        class2.field26 = class115.field2769;
        class2.field20++;
        class44.field1027.method357(28, -119);
        class44.field1027.method542(arg1, (byte) 56);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lqd;IB)V")
    public static final void method722(class115 arg0, int arg1, byte arg2) {
        int var3 = -30 % ((-arg2 - 15) / 40);
        class136.method1033(arg0.field2700, (byte) 123, arg0.field2749, arg1);
        field2102++;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
    public static final void method723(int arg0) {
        for (class23 var1 = (class23) class45.field1077.method1213(95); var1 != null; var1 = (class23) class45.field1077.method1211(-3)) {
            if (var1.field411 > 0) {
                var1.field411--;
            }
            if (var1.field411 != 0) {
                if (var1.field412 > 0) {
                    var1.field412--;
                }
                if (var1.field412 == 0 && var1.field405 >= 1 && var1.field420 >= 1 && var1.field405 <= 102 && var1.field420 <= 102 && (var1.field414 < 0 || class33.method286((byte) 78, var1.field414, var1.field404))) {
                    client.method149(var1.field404, var1.field398, var1.field405, (byte) 13, var1.field414, var1.field413, var1.field401, var1.field420);
                    var1.field412 = -1;
                    if (var1.field414 == var1.field406 && var1.field406 == -1) {
                        var1.method1093(arg0 - 25682);
                    } else if (var1.field414 == var1.field406 && var1.field413 == var1.field410 && var1.field408 == var1.field404) {
                        var1.method1093(0);
                    }
                }
            } else if (var1.field406 < 0 || class33.method286((byte) 76, var1.field406, var1.field408)) {
                client.method149(var1.field408, var1.field398, var1.field405, (byte) 114, var1.field406, var1.field410, var1.field401, var1.field420);
                var1.method1093(0);
            }
        }
        field2084++;
        if (arg0 != 25682) {
            method720(-11);
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
    public static final void method724(int arg0) {
        class132.method1010(class158.field3631, (byte) -104);
        class9.field163++;
        field2082++;
        if (class112.field2624 && class27.field500) {
            int var1 = class86.field2002;
            int var2 = class140.field3218;
            int var3 = var1 - class45.field1069;
            if (var3 < class111.field2608) {
                var3 = class111.field2608;
            }
            int var4 = class158.field3631.field761;
            int var5 = var2 - class88.field2031;
            if (class111.field2608 + class117.field2809.field811 < class158.field3631.field811 + var3) {
                var3 = class117.field2809.field811 + class111.field2608 - class158.field3631.field811;
            }
            int var6 = var3 - class126.field2932;
            if (class137.field3182 > var5) {
                var5 = class137.field3182;
            }
            int var7 = class117.field2809.field844 + var3 - class111.field2608;
            if (arg0 == 2) {
                if (class137.field3182 + class117.field2809.field774 < class158.field3631.field774 + var5) {
                    var5 = class117.field2809.field774 + class137.field3182 - class158.field3631.field774;
                }
                int var8 = var5 - class63.field1466;
                if (class9.field163 > class158.field3631.field747 && (var4 < var6 || -var4 > var6 || var4 < var8 || -var4 > var8)) {
                    class77.field1790 = true;
                }
                int var9 = class117.field2809.field873 + var5 - class137.field3182;
                if (class158.field3631.field853 != null && class77.field1790) {
                    class12 var10 = new class12();
                    var10.field204 = var7;
                    var10.field208 = class158.field3631.field853;
                    var10.field209 = class158.field3631;
                    var10.field210 = var9;
                    class158.method1224(var10, (byte) -78);
                }
                if (class86.field2017 == 0) {
                    if (class77.field1790) {
                        if (class158.field3631.field872 != null) {
                            class12 var11 = new class12();
                            var11.field204 = var7;
                            var11.field210 = var9;
                            var11.field209 = class158.field3631;
                            var11.field202 = class124.field2888;
                            var11.field208 = class158.field3631.field872;
                            class158.method1224(var11, (byte) -89);
                        }
                        if (class124.field2888 != null && class15.method111(1442844045, class158.field3631) != null) {
                            class44.field1027.method357(178, -83);
                            class44.field1027.method554(8, class124.field2888.field744);
                            class44.field1027.method549(class124.field2888.field829, 88);
                            class66.field1538++;
                            class44.field1027.method527(class158.field3631.field744, arg0 - 2689);
                            class44.field1027.method547(-25680, class158.field3631.field829);
                        }
                    } else if ((class125.field2900 == 1 || class32.method237((byte) 93, class119.field2851 - 1)) && class119.field2851 > 2) {
                        class135.method1032(-5560);
                    } else if (class119.field2851 > 0) {
                        class14.method79(101, class119.field2851 - 1);
                    }
                    class158.field3631 = null;
                }
            }
        } else if (class9.field163 > 1) {
            class158.field3631 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
    public static final void method725(int arg0) {
        if (arg0 != -10015) {
            return;
        }
        if (class143.field3275 != null) {
            class143.field3275.method52(-95);
            class143.field3275 = null;
        }
        class102.method826(arg0 ^ 0xFFFFD8D2);
        field2101++;
        class159.field3659.method1141();
        for (int var1 = 0; var1 < 4; var1++) {
            class105.field2484[var1].method925(74);
        }
        System.gc();
        class152.method1178(2, (byte) 55);
        class112.field2623 = false;
        class12.field206 = -1;
        class33.method284(false);
        class54.method426(arg0 + 10015, 10);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Lu;")
    public static final class139 method726(int arg0, int arg1) {
        field2079++;
        class139 var2 = (class139) client.field382.method486(arg1 - 45918, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1 == 17093) {
            byte[] var3 = class129.field2972.method206(5, arg0, -68);
            class139 var4 = new class139();
            if (var3 != null) {
                var4.method1045(new class66(var3), 110);
            }
            client.field382.method485((long) arg0, (byte) -122, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lec;B)V")
    public static final void method727(class32 arg0, byte arg1) {
        field2097++;
        if (class111.field2611 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg0.method259(0);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class111.field2611.length && class111.field2611[var2].field3326 != var3) {
            var2++;
        }
        if (class111.field2611.length <= var2 || class111.field2611[var2] == null) {
            return;
        }
        class44.field1027.method357(194, arg1 ^ 0x8);
        if (arg1 != -123) {
            method721(-29, -106L);
        }
        class44.field1027.method542(class111.field2611[var2].field3326, (byte) 56);
        class66.field1532++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public static final void method728(byte arg0) {
        class61.field1353 = 0;
        class102.field2393 = 0;
        class156.method1199(true);
        class9.method54((byte) 127);
        field2086++;
        class8.method45(11);
        class43.method331(19135);
        for (int var1 = 0; var1 < class102.field2393; var1++) {
            int var3 = class27.field495[var1];
            if (class140.field3219 != class52.field1176[var3].field2715) {
                class52.field1176[var3] = null;
            }
        }
        if (class115.field2702 != class158.field3614.field1569) {
            throw new RuntimeException("gpp1 pos:" + class158.field3614.field1569 + " psize:" + class115.field2702);
        }
        for (int var2 = 0; var2 < class62.field1405; var2++) {
            if (class52.field1176[class137.field3189[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class62.field1405);
            }
        }
        if (arg0 != 126) {
            field2081 = null;
        }
    }
}
