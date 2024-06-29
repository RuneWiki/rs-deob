import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class277 extends class96 {

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "Lna;")
    public static class26 field4624 = class69.method505(")4p=", (byte) -119);

    @OriginalMember(owner = "client!lk", name = "S", descriptor = "Lna;")
    private static class26 field4632 = class69.method505(" is already on your friend list)3", (byte) -117);

    @OriginalMember(owner = "client!lk", name = "U", descriptor = "Z")
    public static boolean field4634 = false;

    @OriginalMember(owner = "client!lk", name = "P", descriptor = "Lna;")
    private static class26 field4629 = class69.method505("Loading fonts )2 ", (byte) -126);

    @OriginalMember(owner = "client!lk", name = "X", descriptor = "Lna;")
    public static class26 field4637 = field4629;

    @OriginalMember(owner = "client!lk", name = "Z", descriptor = "I")
    public static int field4639 = 0;

    @OriginalMember(owner = "client!lk", name = "ab", descriptor = "Lna;")
    public static class26 field4640 = field4632;

    @OriginalMember(owner = "client!lk", name = "V", descriptor = "I")
    public static int field4635 = 0;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!lk", name = "M", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!lk", name = "N", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!lk", name = "O", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!lk", name = "Q", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!lk", name = "R", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!lk", name = "T", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!lk", name = "W", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!lk", name = "Y", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!lk", name = "bb", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "Lsc;")
    private class259 field4623;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILve;)I", line = 9)
    public static final int method1953(int arg0, class266 arg1) {
        int var2 = 0;
        field4638++;
        if (arg0 != -20916) {
            return -88;
        }
        if (arg1.method1900(0, class307.field5293)) {
            var2++;
        }
        if (arg1.method1900(0, class232.field3674)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIB)I", line = 29)
    public final int method1954(int arg0, int arg1, byte arg2) {
        field4628++;
        if (this.field4623 == null) {
            return arg1;
        }
        if (arg2 != -29) {
            this.method1958((class26) null, (byte) 56, 110);
        }
        class188 var4 = (class188) this.field4623.method1827((long) arg0, arg2 ^ 0xFFFFFFE3);
        return var4 == null ? arg1 : var4.field2961;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lwa;IB)V", line = 60)
    private final void method1955(class82 arg0, int arg1, byte arg2) {
        if (arg2 >= -2) {
            return;
        }
        field4626++;
        if (arg1 != 249) {
            return;
        }
        int var4 = arg0.method642((byte) -52);
        if (this.field4623 == null) {
            int var5 = class313.method2175((byte) 105, var4);
            this.field4623 = new class259(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg0.method642((byte) -94) == 1;
            int var8 = arg0.method633((byte) 95);
            class147 var9;
            if (var7) {
                var9 = new class56(arg0.method615(true));
            } else {
                var9 = new class188(arg0.method587(-502942936));
            }
            this.field4623.method1826(1, var9, (long) var8);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIBLve;)Lqf;", line = 108)
    public static final class148 method1956(int arg0, int arg1, byte arg2, class266 arg3) {
        field4636++;
        if (class196.method1317(arg3, arg0, arg1, arg2 ^ 0x78A5)) {
            if (arg2 != -18) {
                method1961(true);
            }
            return class215.method1439(arg2 + 103);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIILbe;Z)V", line = 128)
    public static final void method1957(int arg0, int arg1, int arg2, class297 arg3, boolean arg4) {
        int var5 = arg3.field4967;
        int var6 = arg3.field4996;
        if (arg1 != 13987) {
            method1956(-115, 65, (byte) -119, (class266) null);
        }
        if (arg3.field5116 == 0) {
            arg3.field4967 = arg3.field4976;
        } else if (arg3.field5116 == 1) {
            arg3.field4967 = arg2 - arg3.field4976;
        } else if (arg3.field5116 == 2) {
            arg3.field4967 = arg3.field4976 * arg2 >> 14;
        } else if (arg3.field5116 == 3) {
            if (arg3.field4988 == 2) {
                arg3.field4967 = arg3.field4976 * 32 + ((arg3.field4976 - 1) * arg3.field5095);
            } else if (arg3.field4988 == 7) {
                arg3.field4967 = (arg3.field4976 - 1) * arg3.field5095 + arg3.field4976 * 115;
            }
        }
        field4627++;
        if (arg3.field5047 == 0) {
            arg3.field4996 = arg3.field5050;
        } else if (arg3.field5047 == 1) {
            arg3.field4996 = arg0 - arg3.field5050;
        } else if (arg3.field5047 == 2) {
            arg3.field4996 = arg3.field5050 * arg0 >> 14;
        } else if (arg3.field5047 == 3) {
            if (arg3.field4988 == 2) {
                arg3.field4996 = (arg3.field5050 - 1) * arg3.field5101 + arg3.field5050 * 32;
            } else if (arg3.field4988 == 7) {
                arg3.field4996 = (arg3.field5050 - 1) * arg3.field5101 + arg3.field5050 * 12;
            }
        }
        if (arg3.field5116 == 4) {
            arg3.field4967 = arg3.field5020 * arg3.field4996 / arg3.field4959;
        }
        if (arg3.field5047 == 4) {
            arg3.field4996 = arg3.field4967 * arg3.field4959 / arg3.field5020;
        }
        if (class299.field5146 && (client.method1730(arg3).field5661 != 0 || arg3.field4988 == 0)) {
            if (arg3.field4996 < 5 && arg3.field4967 < 5) {
                arg3.field4996 = 5;
                arg3.field4967 = 5;
            } else {
                if (arg3.field4967 <= 0) {
                    arg3.field4967 = 5;
                }
                if (arg3.field4996 <= 0) {
                    arg3.field4996 = 5;
                }
            }
        }
        if (arg3.field4990 == 1337) {
            class89.field1465 = arg3;
        }
        if (arg4 && arg3.field5040 != null && (arg3.field4967 != var5 || arg3.field4996 != var6)) {
            class263 var7 = new class263();
            var7.field4306 = arg3.field5040;
            var7.field4307 = arg3;
            class100.field1610.method257(true, var7);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lna;BI)Lna;", line = 228)
    public final class26 method1958(class26 arg0, byte arg1, int arg2) {
        field4641++;
        if (this.field4623 == null) {
            return arg0;
        }
        class56 var4 = (class56) this.field4623.method1827((long) arg2, 0);
        if (arg1 != -44) {
            method1961(false);
        }
        return var4 == null ? arg0 : var4.field914;
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V", line = 265)
    public static void method1959(int arg0) {
        field4624 = null;
        field4629 = null;
        field4632 = null;
        field4637 = null;
        if (arg0 != 221301966) {
            method1957(-111, -64, -10, (class297) null, false);
        }
        field4640 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILfl;IIII)V", line = 281)
    public static final void method1960(int arg0, class224 arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 <= 44) {
            return;
        }
        field4631++;
        if (arg1.field3559 == -1 && arg1.field3561 == null) {
            return;
        }
        int var6 = 0;
        if (arg1.field3547 < arg0) {
            var6 += arg0 - arg1.field3547;
        } else if (arg1.field3553 > arg0) {
            var6 += arg1.field3553 - arg0;
        }
        if (arg1.field3531 < arg4) {
            var6 += arg4 - arg1.field3531;
        } else if (arg4 < arg1.field3532) {
            var6 += arg1.field3532 - arg4;
        }
        if (arg1.field3555 == 0 || arg1.field3555 < (var6 - 64) || class42.field696 == 0 || arg1.field3539 != arg2) {
            if (arg1.field3537 != null) {
                class301.field5195.method1313(arg1.field3537);
                arg1.field3537 = null;
            }
            if (arg1.field3540 != null) {
                class301.field5195.method1313(arg1.field3540);
                arg1.field3540 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg1.field3555 - var6) * class42.field696 / arg1.field3555;
        if (arg1.field3537 != null) {
            arg1.field3537.method431(var7);
        } else if (arg1.field3559 >= 0) {
            class99 var8 = class99.method734(class189.field2969, arg1.field3559, 0);
            if (var8 != null) {
                class176 var9 = var8.method735().method1221(class322.field5542);
                class60 var10 = class60.method453(var9, 100, var7);
                var10.method444(-1);
                class301.field5195.method1309(var10);
                arg1.field3537 = var10;
            }
        }
        if (arg1.field3540 != null) {
            arg1.field3540.method431(var7);
            if (!arg1.field3540.method1002(0)) {
                arg1.field3540 = null;
            }
        } else if (arg1.field3561 != null && (arg1.field3541 -= arg3) <= 0) {
            int var11 = (int) ((double) arg1.field3561.length * Math.random());
            class99 var12 = class99.method734(class189.field2969, arg1.field3561[var11], 0);
            if (var12 != null) {
                class176 var13 = var12.method735().method1221(class322.field5542);
                class60 var14 = class60.method453(var13, 100, var7);
                var14.method444(0);
                class301.field5195.method1309(var14);
                arg1.field3541 = (int) ((double) (arg1.field3552 - arg1.field3535) * Math.random()) + arg1.field3535;
                arg1.field3540 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V", line = 421)
    public static final void method1961(boolean arg0) {
        class109.field1744 = class101.field1618;
        class264.field4318 = class85.field1398;
        class45.field708 = class284.field4748;
        class31.field520 = class55.field870;
        class207.field3221 = class264.field4330;
        class103.field1656 = class167.field2590;
        class202.field3139 = class167.field2589;
        class324.field5577 = class11.field154;
        class252.field4146 = class160.field2508;
        class313.field5345 = class309.field5322;
        class137.field2104 = class69.field1073;
        class327.field5667 = class305.field5254;
        class109.field1735 = class50.field784;
        class304.field5238 = class201.field3123;
        class47.field767 = class145.field2200;
        class132.field2008 = class133.field2027;
        class269.field4438 = class170.field2668;
        class61.field989 = class101.field1631;
        class217.field3469 = class123.field1921;
        class9.field108 = class201.field3125;
        class24.field346 = class12.field175;
        class210.field3259 = class265.field4351;
        class79.field1250 = class47.field737;
        class39.field640 = class275.field4600;
        if (arg0) {
            field4634 = false;
        }
        class121.field1889 = class265.field4341;
        class57.field927 = class146.field2217;
        class45.field715 = class284.field4748;
        field4637 = class320.field5507;
        class154.field2406 = class314.field5379;
        class244.field4015 = class115.field1809;
        class254.field4155 = class117.field1839;
        class177.field2787 = class315.field5403;
        class115.field1810 = class177.field2785;
        class264.field4321 = class112.field1774;
        class259.field4231 = class300.field5179;
        class21.field293 = class246.field4041;
        client.field4112 = class215.field3357;
        class218.field3477 = class126.field1947;
        class157.field2448 = class192.field3003;
        class322.field5540 = class290.field4827;
        class4.field46 = class178.field2795;
        class236.field3759 = class27.field451;
        class325.field5622 = class217.field3468;
        class55.field871 = class35.field580;
        class121.field1886 = class204.field3196;
        class265.field4339 = class47.field765;
        class132.field2005 = class133.field2027;
        class12.field167 = class306.field5275;
        class307.field5289 = class7.field77;
        class315.field5398 = class297.field5108;
        class215.field3347 = class81.field1266;
        class284.field4744 = class150.field2347;
        class107.field1680 = class53.field834;
        class95.field1554 = class276.field4610;
        class27.field450 = class259.field4224;
        class190.field2974 = class292.field4866;
        class198.field3078 = class35.field572;
        class196.field3046 = class148.field2318;
        class96.field1573 = class235.field3728;
        class110.field1755 = class29.field505;
        class76.field1161 = class63.field1004;
        class307.field5285 = class26.field388;
        class82.field1312 = class275.field4583;
        class300.field5178 = class17.field250;
        class166.field2576 = class58.field942;
        class63.field1000 = class92.field1525;
        class71.field1100 = class21.field289;
        field4630++;
        class155.field2419 = class211.field3274;
        class284.field4745 = class115.field1806;
        class198.field3070 = class35.field572;
        class63.field1002 = class236.field3737;
        class26.field402 = class196.field3036;
        class281.field4692 = class299.field5152;
        class205.field3208 = class127.field1968;
        class212.field3293 = class271.field4535;
        class193.field3011 = class294.field4891;
        class230.field3655 = class138.field2115;
        class25.field365 = class97.field1578;
        class236.field3743 = class42.field694;
        class320.field5505 = class220.field3509;
        class201.field3134 = class55.field898;
        class203.field3181 = class223.field3527;
        field4640 = class249.field4068;
        class38.field629 = class13.field195;
        class142.field2180 = class185.field2876;
        class322.field5541 = class23.field334;
        class292.field4864 = class251.field4105;
        class218.field3480 = class69.field1078;
        class12.field178 = class126.field1949;
        class322.field5543 = class166.field2581;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILwa;)V", line = 754)
    public final void method1962(int arg0, class82 arg1) {
        while (true) {
            int var3 = arg1.method642((byte) -76);
            if (var3 == 0) {
                if (arg0 != 5) {
                    method1961(false);
                }
                field4625++;
                return;
            }
            this.method1955(arg1, var3, (byte) -5);
        }
    }
}
