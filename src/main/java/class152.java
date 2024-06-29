import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class152 {

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "Lrh;")
    private class170 field2539 = new class170();

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "Lnk;")
    private class95 field2547 = new class95();

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    private int field2548;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    private int field2543;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "Lhd;")
    private class214 field2546;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field2527 = -1;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public static int field2544 = 0;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field2538 = 0;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "B")
    public static byte field2530;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "[I")
    public static int[] field2534;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ln;I)V")
    public static final void method980(class1 arg0, int arg1) {
        field2536++;
        if (arg1 <= 61) {
            field2538 = -116;
        }
        class257.method1753((byte) 121);
        if (class177.field3100 != null) {
            return;
        }
        if (!class140.field2270) {
            class165.method1104(-123);
        } else if (class146.field2406 == 1) {
            int var2 = class196.field3422 / 5;
            int var3 = class4.field83 + var2 + 140;
            if (var3 <= class235.field4093 && class235.field4093 <= var3 + 14 && class93.field1478 >= class191.field3367 + 4 && class93.field1478 <= class191.field3367 + 18) {
                class42.method292(0, 0, 95);
                return;
            }
            if ((var3 + 15) <= class235.field4093 && class235.field4093 <= (var3 + 80) && class191.field3367 + 4 <= class93.field1478 && class93.field1478 <= class191.field3367 + 18) {
                class42.method292(1, 0, 121);
                return;
            }
            int var4 = class4.field83 + var2 + 250;
            if (class235.field4093 >= var4 && var4 + 14 >= class235.field4093 && (class191.field3367 + 4) <= class93.field1478 && class191.field3367 + 18 >= class93.field1478) {
                class42.method292(0, 1, 98);
                return;
            }
            if (var4 + 15 <= class235.field4093 && class235.field4093 <= var4 + 80 && class93.field1478 >= (class191.field3367 + 4) && class93.field1478 <= (class191.field3367 + 18)) {
                class42.method292(1, 1, 91);
                return;
            }
            int var5 = class4.field83 + var2 + 360;
            if (var5 <= class235.field4093 && class235.field4093 <= var5 + 14 && class93.field1478 >= (class191.field3367 + 4) && class93.field1478 <= (class191.field3367 + 18)) {
                class42.method292(0, 2, 109);
                return;
            }
            if (class235.field4093 >= (var5 + 15) && var5 + 80 >= class235.field4093 && class93.field1478 >= (class191.field3367 + 4) && (class191.field3367 + 18) >= class93.field1478) {
                class42.method292(1, 2, 122);
                return;
            }
            int var6 = var2 + class4.field83 + 470;
            if (var6 <= class235.field4093 && class235.field4093 <= (var6 + 14) && class191.field3367 + 4 <= class93.field1478 && class93.field1478 <= (class191.field3367 + 18)) {
                class42.method292(0, 3, 120);
                return;
            }
            if ((var6 + 15) <= class235.field4093 && var6 + 80 >= class235.field4093 && (class191.field3367 + 4) <= class93.field1478 && class191.field3367 + 18 >= class93.field1478) {
                class42.method292(1, 3, 92);
                return;
            }
            if (class110.field1810 != -1) {
                class192 var7 = class131.field2167[class110.field1810];
                if (var7.field3368 == class213.field3664) {
                    byte[] var8 = class175.method1164(new class181[] { var7.field3379, class200.field3455 }, (byte) 125).method1247(-126);
                    class173.field2912 = new String(var8, 0, var8.length);
                    class62.field947 = var7.field3380;
                    if (class113.field1840 != 0) {
                        class55.field853 = class62.field947 + 40000;
                        class248.field4333 = class55.field853;
                        class219.field3780 = class62.field947 + 50000;
                    }
                    if (class66.field1073 != null) {
                        class66.field1073.field2944 = true;
                        class218.method1453((byte) -80, class66.field1073);
                    }
                    return;
                }
                class181 var9 = class208.field3576;
                if (class113.field1840 != 0) {
                    var9 = class175.method1164(new class181[] { class186.field3296, class169.method1119((byte) -122, var7.field3380 + 7000) }, (byte) 124);
                }
                class181 var10 = class175.method1164(new class181[] { class201.field3468, var7.field3379, class200.field3455, var9, class38.field579, class169.method1119((byte) 42, class196.field3431), class198.field3441, class169.method1119((byte) -111, class264.field4584), class71.field1135, class169.method1119((byte) 25, 0), class165.field2803, class169.method1119((byte) -120, class85.field1359), class163.field2777, class169.method1119((byte) 45, class8.field158) }, (byte) 124);
                try {
                    arg0.getAppletContext().showDocument(var10.method1199((byte) -112), "_self");
                    return;
                } catch (Exception var11) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lo;IIB)V")
    public static final void method981(class175 arg0, int arg1, int arg2, byte arg3) {
        if (arg0.field3074 == 1) {
            class199.method1348(class241.field4187, true, arg0.field2987, (short) 10, 0, 0L, arg0.field2976);
            class126.field2091++;
        }
        if (arg0.field3074 == 2 && !class220.field3781) {
            class181 var4 = class2.method19(-15077, arg0);
            if (var4 != null) {
                class199.method1348(class175.method1164(new class181[] { class198.field3438, arg0.field3037 }, (byte) 127), true, arg0.field2987, (short) 11, -1, 0L, var4);
                class99.field1611++;
            }
        }
        field2533++;
        if (arg3 != -34) {
            return;
        }
        if (arg0.field3074 == 3) {
            class145.field2353++;
            class199.method1348(class241.field4187, true, arg0.field2987, (short) 47, 0, 0L, class127.field2109);
        }
        if (arg0.field3074 == 4) {
            class210.field3599++;
            class199.method1348(class241.field4187, true, arg0.field2987, (short) 9, 0, 0L, arg0.field2976);
        }
        if (arg0.field3074 == 5) {
            class199.method1348(class241.field4187, true, arg0.field2987, (short) 7, 0, 0L, arg0.field2976);
            class71.field1134++;
        }
        if (arg0.field3074 == 6 && class210.field3608 == null) {
            class199.method1348(class241.field4187, true, arg0.field2987, (short) 40, -1, 0L, arg0.field2976);
            class25.field423++;
        }
        if (arg0.field3069 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2996; var6++) {
                for (int var7 = 0; var7 < arg0.field3072; var7++) {
                    int var8 = (arg0.field2999 + 32) * var7;
                    int var9 = (arg0.field2985 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field3058[var5];
                        var9 += arg0.field2960[var5];
                    }
                    if (var8 <= arg2 && var9 <= arg1 && arg2 < (var8 + 32) && arg1 < var9 + 32) {
                        class7.field127 = var5;
                        class185.field3291 = arg0;
                        if (arg0.field3065[var5] > 0) {
                            class99 var10 = class237.method1620(arg3 ^ 0x7343, arg0.field3065[var5] - 1);
                            if (class216.field3710 == 1 && class211.method1400(16126, client.method1058(arg0))) {
                                if (class247.field4314 != arg0.field2987 || class116.field1902 != var5) {
                                    class199.method1348(class175.method1164(new class181[] { class208.field3568, class159.field2724, var10.field1652 }, (byte) 124), true, arg0.field2987, (short) 21, var5, (long) var10.field1621, class52.field830);
                                    class170.field2851++;
                                }
                            } else if (!class220.field3781 || !class211.method1400(16126, client.method1058(arg0))) {
                                class219.field3771++;
                                class181[] var11 = var10.field1608;
                                if (class73.field1170) {
                                    var11 = class149.method971((byte) -125, var11);
                                }
                                if (class211.method1400(arg3 + 16160, client.method1058(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class203.field3497++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 3;
                                            } else {
                                                var13 = 5;
                                            }
                                            class199.method1348(class175.method1164(new class181[] { class68.field1091, var10.field1652 }, (byte) 127), true, arg0.field2987, var13, var5, (long) var10.field1621, var11[var12]);
                                        } else if (var12 == 4) {
                                            class9.field189++;
                                            class199.method1348(class175.method1164(new class181[] { class68.field1091, var10.field1652 }, (byte) 125), true, arg0.field2987, (short) 5, var5, (long) var10.field1621, class143.field2324);
                                        }
                                    }
                                }
                                if (class124.method801(false, client.method1058(arg0))) {
                                    class199.method1348(class175.method1164(new class181[] { class68.field1091, var10.field1652 }, (byte) 126), true, arg0.field2987, (short) 45, var5, (long) var10.field1621, class52.field830);
                                    class129.field2136++;
                                }
                                if (class211.method1400(16126, client.method1058(arg0)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class4.field84++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 13;
                                            }
                                            if (var14 == 1) {
                                                var15 = 30;
                                            }
                                            if (var14 == 2) {
                                                var15 = 23;
                                            }
                                            class199.method1348(class175.method1164(new class181[] { class68.field1091, var10.field1652 }, (byte) 125), true, arg0.field2987, var15, var5, (long) var10.field1621, var11[var14]);
                                        }
                                    }
                                }
                                class181[] var16 = arg0.field3061;
                                if (class73.field1170) {
                                    var16 = class149.method971((byte) -117, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class116.field1884++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 41;
                                            }
                                            if (var17 == 1) {
                                                var18 = 16;
                                            }
                                            if (var17 == 2) {
                                                var18 = 4;
                                            }
                                            if (var17 == 3) {
                                                var18 = 51;
                                            }
                                            if (var17 == 4) {
                                                var18 = 38;
                                            }
                                            class199.method1348(class175.method1164(new class181[] { class68.field1091, var10.field1652 }, (byte) 126), true, arg0.field2987, var18, var5, (long) var10.field1621, var16[var17]);
                                        }
                                    }
                                }
                                class199.method1348(class175.method1164(new class181[] { class68.field1091, var10.field1652 }, (byte) 125), true, arg0.field2987, (short) 1004, var5, (long) var10.field1621, class20.field353);
                            } else if ((class121.field1974 & 0x10) == 16) {
                                class199.method1348(class175.method1164(new class181[] { class166.field2817, class159.field2724, var10.field1652 }, (byte) 124), true, arg0.field2987, (short) 39, var5, (long) var10.field1621, class177.field3113);
                                field2529++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2972) {
            return;
        }
        if (!class220.field3781) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class181 var23 = class246.method1681(arg3 - 57, arg0, var19);
                if (var23 != null) {
                    class199.method1348(arg0.field3007, true, arg0.field2987, (short) 1001, arg0.field2934, (long) (var19 + 1), var23);
                    class19.field331++;
                }
            }
            class181 var20 = class2.method19(-15077, arg0);
            if (var20 != null) {
                class99.field1611++;
                class199.method1348(arg0.field3007, true, arg0.field2987, (short) 11, arg0.field2934, 0L, var20);
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class181 var22 = class246.method1681(-118, arg0, var21);
                if (var22 != null) {
                    class19.field331++;
                    class199.method1348(arg0.field3007, true, arg0.field2987, (short) 33, arg0.field2934, (long) (var21 + 1), var22);
                }
            }
            if (class259.method1757(21543, client.method1058(arg0))) {
                class199.method1348(class241.field4187, true, arg0.field2987, (short) 40, arg0.field2934, 0L, class82.field1315);
                class25.field423++;
                return;
            }
            return;
        }
        if (class165.method1099((byte) 125, client.method1058(arg0)) && (class121.field1974 & 0x20) == 32) {
            class199.method1348(class175.method1164(new class181[] { class166.field2817, class16.field304, arg0.field3007 }, (byte) 124), true, arg0.field2987, (short) 8, arg0.field2934, 0L, class177.field3113);
            class227.field3891++;
            return;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lrh;BJ)V")
    public final void method982(class170 arg0, byte arg1, long arg2) {
        field2549++;
        if (this.field2543 == 0) {
            class170 var5 = this.field2547.method630(6798);
            var5.method290((byte) -48);
            var5.method1128((byte) 20);
            if (this.field2539 == var5) {
                class170 var6 = this.field2547.method630(6798);
                var6.method290((byte) -48);
                var6.method1128((byte) 20);
            }
        } else {
            this.field2543--;
        }
        this.field2546.method1422(arg2, arg0, -1);
        this.field2547.method633(arg0, -114);
        if (arg1 != 60) {
            this.field2543 = 88;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)Lrb;")
    public final class41 method983(byte arg0) {
        field2531++;
        if (arg0 < 62) {
            this.field2539 = null;
        }
        return this.field2546.method1418(0);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)Lrb;")
    public final class41 method984(int arg0) {
        if (arg0 >= -43) {
            field2534 = null;
        }
        field2542++;
        return this.field2546.method1421(false);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IILjc;IIII)V")
    public static final void method985(int arg0, int arg1, class8 arg2, int arg3, int arg4, int arg5, int arg6) {
        field2541++;
        boolean var7 = true;
        long var8 = 0L;
        boolean var10 = false;
        int var11 = 28 % ((16 - arg4) / 53);
        if (arg5 == 0) {
            var8 = class230.method1528(arg3, arg6, arg0);
        } else if (arg5 == 1) {
            var8 = class262.method1779(arg3, arg6, arg0);
        } else if (arg5 == 2) {
            var8 = class189.method1312(arg3, arg6, arg0);
        } else if (arg5 == 3) {
            var8 = class123.method800(arg3, arg6, arg0);
        }
        int var12 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
        int var13 = ((int) var8 & 0x7E46B) >> 14;
        boolean var14 = false;
        int var15 = ((int) var8 & 0x35E19D) >> 20;
        class148 var16 = class62.method442((byte) 79, var12);
        if (var16.method962((byte) 67)) {
            class244.method1651(var16, (byte) 47, arg0, arg3, arg6);
        }
        if (var8 == 0L) {
            return;
        }
        if (arg5 == 0) {
            class156.method1041(arg3, arg6, arg0);
            if (var16.field2463 != 0) {
                arg2.method61(arg0, var13, 24571, var16.field2437, var15, arg6);
                return;
            }
            return;
        }
        if (arg5 == 1) {
            class261.method1770(arg3, arg6, arg0);
            return;
        }
        if (arg5 == 2) {
            class59.method428(arg3, arg6, arg0);
            if (var16.field2463 != 0 && var16.field2466 + arg6 < 104 && var16.field2466 + arg0 < 104 && (var16.field2433 + arg6) < 104 && (arg0 + var16.field2433) < 104) {
                arg2.method57(var15, var16.field2437, var16.field2433, var16.field2466, arg6, arg0, 8657);
                return;
            }
            return;
        }
        if (arg5 != 3) {
            return;
        }
        class186.method1294(arg3, arg6, arg0);
        if (var16.field2463 == 1) {
            arg2.method65(arg6, arg0, 85);
            return;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
    public final void method986(int arg0) {
        this.field2547.method628(-115);
        field2540++;
        this.field2546.method1420(5125);
        this.field2539 = new class170();
        this.field2543 = this.field2548;
        if (arg0 != -12939) {
            method987(102, 26);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lqj;")
    public static final class215 method987(int arg0, int arg1) {
        field2545++;
        class215 var2 = (class215) class19.field346.method990((byte) 80, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class155.field2601.method89(arg0, arg1, arg1 ^ 0x62);
        class215 var4 = new class215();
        if (var3 != null) {
            var4.method1425(-49, new class230(var3));
        }
        class19.field346.method982(var4, (byte) 60, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    public static void method988(byte arg0) {
        if (arg0 < -1) {
            field2534 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)V")
    public static final void method989(int arg0, int arg1, int arg2) {
        field2528++;
        class196.field3426[arg1] = arg2;
        class236 var3 = (class236) class143.field2314.method1424(true, (long) arg1);
        if (var3 == null) {
            class236 var4 = new class236(class213.method1414(-9292) + 500L);
            class143.field2314.method1422((long) arg1, var4, -1);
        } else {
            var3.field4105 = class213.method1414(-9292) + 500L;
        }
        if (arg0 >= -111) {
            method985(17, 113, (class8) null, 124, 91, 92, 90);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BJ)Lrh;")
    public final class170 method990(byte arg0, long arg1) {
        field2532++;
        class170 var4 = (class170) this.field2546.method1424(true, arg1);
        if (var4 != null) {
            this.field2547.method633(var4, 93);
        }
        return arg0 == 80 ? var4 : null;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V")
    public class152(int arg0) {
        this.field2548 = arg0;
        this.field2543 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2546 = new class214(var2);
    }
}
