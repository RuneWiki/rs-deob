import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class531 {

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "Lsq;")
    public static class161 field7748 = new class161(9, 2);

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "[F")
    public static float[] field7753 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    public static int field7755 = 0;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "Ljk;")
    public static class585 field7752 = new class585(61, -1);

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field7749;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public static int field7750;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field7751;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)V")
    public static final void method3123(int arg0, int arg1, int arg2) {
        boolean var3 = class281.field3808[0][arg1][arg2] != null && class281.field3808[0][arg1][arg2].field6207 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class281.field3808[var4][arg1][arg2] == null) {
                class433 var5 = class281.field3808[var4][arg1][arg2] = new class433(var4);
                if (var3) {
                    var5.field6205++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7749++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)I")
    public static final int method3124(byte arg0) {
        field7754++;
        if (!class221.field2851.field4163) {
            for (int var1 = 0; var1 < class660.field9377; var1++) {
                if (class159.field1934[var1].method2636((byte) -105) == 's' || class159.field1934[var1].method2636((byte) 95) == 'S') {
                    class221.field2851.field4163 = true;
                    break;
                }
            }
        }
        if (class604.field8712 == class236.field3160) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class301.method1787((byte) -85);
            if (class515.field7544 == 0L) {
                class515.field7544 = var4;
            }
            if (var3 > 16384 && var4 - class515.field7544 < 5000L) {
                if (var4 - class541.field7862 > 1000L) {
                    System.gc();
                    class541.field7862 = var4;
                }
                return 0;
            }
        }
        if (class604.field8712 == class236.field3161) {
            if (class394.field5565 == null) {
                class394.field5565 = new class454(class33.field673, class512.field7508, class518.field7576, class405.field5744);
            }
            if (!class394.field5565.method2694((byte) -26)) {
                return 0;
            }
            class315.method1845(arg0 ^ 0xE0AC87A9, 0, null);
            class652.field9240 = !class237.method1438((byte) -77);
            class207.field2533 = class299.method1777(class652.field9240 ? 34 : 32, 1, false, false);
            class6.field61 = class299.method1777(33, 1, false, false);
            class420.field5953 = class299.method1777(13, 1, false, false);
        }
        if (class604.field8712 == class236.field3162) {
            class6.field61.method3781(arg0 ^ 0xFFFFAEED);
            int var6 = class335.field4448[33].method1304((byte) -1);
            int var7 = var6 + class335.field4448[class652.field9240 ? 34 : 32].method1304((byte) -1);
            int var8 = var7 + class335.field4448[13].method1304((byte) -1);
            int var9 = var8 + class6.field61.method3809(-2);
            if (var9 != 400) {
                return var9 / 4;
            }
            class232.field3063 = class207.field2533.method3782((byte) 51);
            class184.field2260 = class6.field61.method3782((byte) 51);
            class25.method366(class207.field2533, (byte) 27);
            int var10 = class221.field2851.field4173;
            class599.field8647 = new class62(class588.field8518, class370.field4980, class6.field61);
            int[] var11 = class599.field8647.method599(var10, (byte) -90);
            class285 var12 = new class285(class207.field2533, class420.field5953);
            if (var11.length > 0) {
                class268.field3680 = new class688[var11.length];
                for (int var13 = 0; var13 < class268.field3680.length; var13++) {
                    class268.field3680[var13] = new class579(class599.field8647.method600(1, var11[var13]), var12);
                }
            }
        }
        if (class604.field8712 == class236.field3163) {
            class251.method1535(class207.field2533, class443.method2628(arg0 ^ 0x2528), arg0 - 134, class420.field5953);
        }
        if (class604.field8712 == class236.field3164) {
            int var14 = class38.method443(8749);
            int var15 = class82.method673(2);
            if (var15 > var14) {
                return var14 * 100 / var15;
            }
        }
        if (class604.field8712 == class236.field3165) {
            if (class268.field3680 != null && class268.field3680.length > 0) {
                if (class268.field3680[0].method3077(14949) < 100) {
                    return 0;
                }
                if (class268.field3680.length > 1 && class599.field8647.method603(-100) && class268.field3680[1].method3077(14949) < 100) {
                    return 0;
                }
            }
            class574.method3363(arg0 ^ 0x2A, class68.field1045);
            method3127(class68.field1045, (byte) 110);
            class245.method1487(1, arg0 ^ 0xFFFFAC96);
        }
        if (class604.field8712 == class236.field3166) {
            for (int var16 = 0; var16 < 4; var16++) {
                class349.field4642[var16] = class517.method3063(class205.field2465, (byte) -53, class473.field6604);
            }
        }
        if (class604.field8712 == class236.field3167) {
            class692.field9847 = class299.method1777(8, 1, false, false);
            class630.field9028 = class299.method1777(0, 1, false, false);
            class622.field8936 = class299.method1777(1, 1, false, false);
            class474.field6631 = class299.method1777(2, 1, false, false);
            class502.field7007 = class299.method1777(3, 1, false, false);
            class538.field7834 = class299.method1777(4, 1, false, false);
            class89.field1249 = class299.method1777(5, 1, true, false);
            class275.field3764 = class299.method1777(6, 1, true, false);
            class123.field1589 = class299.method1777(7, 1, false, false);
            class416.field5897 = class299.method1777(9, 1, false, false);
            class6.field62 = class299.method1777(10, 1, false, false);
            class78.field1145 = class299.method1777(11, 1, false, false);
            class351.field4691 = class299.method1777(12, 1, false, false);
            class166.field2040 = class299.method1777(14, 1, false, false);
            class153.field1890 = class299.method1777(15, 1, false, false);
            class361.field4803 = class299.method1777(16, 1, false, false);
            class163.field1998 = class299.method1777(17, 1, false, false);
            class618.field8872 = class299.method1777(18, 1, false, false);
            class187.field2287 = class299.method1777(19, 1, false, false);
            class469.field6553 = class299.method1777(20, 1, false, false);
            class672.field9662 = class299.method1777(21, 1, false, false);
            class704.field9963 = class299.method1777(22, 1, false, false);
            class634.field9107 = class299.method1777(23, 1, true, false);
            class70.field1068 = class299.method1777(24, 1, false, false);
            class670.field9630 = class299.method1777(25, 1, false, false);
            class568.field8300 = class299.method1777(26, 1, true, false);
            class216.field2812 = class299.method1777(27, 1, false, false);
            class384.field5116 = class299.method1777(28, 1, true, false);
            class232.field3103 = class299.method1777(29, 1, false, false);
            class384.field5115 = class299.method1777(30, 1, true, false);
            class561.field8099 = class299.method1777(31, 1, true, false);
        }
        if (class604.field8712 == class236.field3168) {
            int var17 = 0;
            for (int var18 = 0; var18 < 35; var18++) {
                if (class335.field4448[var18] != null) {
                    var17 += class335.field4448[var18].method1304((byte) -1) * class400.field5645[var18] / 100;
                }
            }
            if (var17 != 100) {
                if (class440.field6278 < 0) {
                    class440.field6278 = var17;
                }
                return (var17 - class440.field6278) * 100 / (100 - class440.field6278);
            }
            class181.method1124((byte) -96, class692.field9847);
            class251.method1535(class692.field9847, class443.method2628(9474), -25, class420.field5953);
        }
        if (class604.field8712 == class236.field3169) {
            class634.method3623(112);
            class245.method1487(2, -21316);
        }
        if (class604.field8712 == class236.field3170) {
            class247.method1501(class517.field7570, class384.field5115, (byte) 49);
        }
        if (class604.field8712 == class236.field3171) {
            int var19 = class255.method1555(114);
            if (var19 < 100) {
                return var19;
            }
            class668.method3794(5, class384.field5116.method3811(112, 1));
            class293.method1737(class384.field5116.method3811(117, 3), arg0 ^ 0xFFFFFFD5);
        }
        if (class604.field8712 == class236.field3172) {
            if (class418.field5920 != -1 && !class123.field1589.method3783(class418.field5920, 0, 32069)) {
                return 99;
            }
            class206.field2483 = new class31(class568.field8300, class416.field5897, class692.field9847);
            class582.field8483 = new class420(class588.field8518, class370.field4980, class474.field6631);
            class332.field4418 = new class94(class588.field8518, class370.field4980, class474.field6631);
            class404.field5708 = new class470(class588.field8518, class370.field4980, class474.field6631, class692.field9847);
            class502.field7010 = new class331(class588.field8518, class370.field4980, class163.field1998);
            class534.field7800 = new class247(class588.field8518, class370.field4980, class474.field6631);
            class176.field2178 = new class376(class588.field8518, class370.field4980, class474.field6631);
            class616.field8848 = new class594(class588.field8518, class370.field4980, class474.field6631, class123.field1589);
            class355.field4741 = new class597(class588.field8518, class370.field4980, class474.field6631);
            class39.field731 = new class230(class588.field8518, class370.field4980, class474.field6631);
            class37.field703 = new class113(class588.field8518, class370.field4980, true, class361.field4803, class123.field1589);
            class455.field6408 = new class670(class588.field8518, class370.field4980, class474.field6631, class692.field9847);
            class308.field4085 = new class53(class588.field8518, class370.field4980, class474.field6631, class692.field9847);
            class206.field2477 = new class338(class588.field8518, class370.field4980, true, class618.field8872, class123.field1589);
            class65.field1021 = new class16(class588.field8518, class370.field4980, true, class582.field8483, class187.field2287, class123.field1589);
            class496.field6935 = new class299(class588.field8518, class370.field4980, class474.field6631);
            class195.field2367 = new class559(class588.field8518, class370.field4980, class469.field6553, class630.field9028, class622.field8936);
            class415.field5873 = new class469(class588.field8518, class370.field4980, class474.field6631);
            class32.field653 = new class417(class588.field8518, class370.field4980, class474.field6631);
            class276.field3774 = new class12(class588.field8518, class370.field4980, class672.field9662, class123.field1589);
            class468.field6543 = new class310(class588.field8518, class370.field4980, class474.field6631);
            class674.field9674 = new class699(class588.field8518, class370.field4980, class474.field6631);
            class385.field5129 = new class71(class588.field8518, class370.field4980, class474.field6631);
            class342.field4519 = new class452(class588.field8518, class370.field4980, class704.field9963);
            class193.field2350 = new class86(class588.field8518, class370.field4980, class474.field6631);
            class482.method2814(class692.field9847, class502.field7007, class123.field1589, class420.field5953, arg0 ^ 0xFFFFFF84);
            class594.method3444((byte) -103, class232.field3103);
            class563.field8141 = new class425(class370.field4980, class70.field1068, class670.field9630);
            class188.field2292 = new class321(class370.field4980, class70.field1068, class670.field9630, new class675());
            class526.method3104(0);
            class37.field703.method809(!class221.field2851.method1747(0, class375.field5039), arg0 - 12);
            class410.field5804 = new class544();
            class231.method1399(97693160);
            class463.method2726(class216.field2812, (byte) 96);
            class434.method2602(class123.field1589, false, class206.field2483);
            class465 var20 = new class465(class6.field62.method3778(-71, "huffman", ""));
            class16.method179(var20, arg0 ^ 0xFFFF8753);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class150.field1859 = class403.method2431(1);
        }
        if (class604.field8712 == class236.field3174) {
            int var21 = class341.method1961(0, class692.field9847) + class273.method1639(true, 14012);
            int var22 = class370.method2137(-5950) + class82.method673(2);
            if (var22 > var21) {
                return var21 * 100 / var22;
            }
        }
        if (arg0 != 42) {
            method3126((byte) 45);
        }
        if (class604.field8712 == class236.field3175) {
            class550.method3236(class634.field9107, class534.field7800, class176.field2178, class37.field703, class455.field6408, class308.field4085, class410.field5804);
        }
        if (class604.field8712 == class236.field3176) {
            class25.field591 = new boolean[class385.field5129.field1079];
            class415.field5874 = new int[class385.field5129.field1079];
            class279.field3799 = new String[class674.field9674.field9884];
            for (int var23 = 0; var23 < class385.field5129.field1079; var23++) {
                if (class385.field5129.method630((byte) 103, var23).field5677 == 0) {
                    class25.field591[var23] = true;
                    class488.field6827++;
                }
                class415.field5874[var23] = -1;
            }
            class368.method2127(arg0 - 42);
            class358.field4771 = class502.field7007.method3804((byte) 110, "loginscreen");
            class264.field3636 = class502.field7007.method3804((byte) 120, "lobbyscreen");
            class89.field1249.method3806(true, false, true);
            class275.field3764.method3806(true, true, true);
            class692.field9847.method3806(true, true, true);
            class420.field5953.method3806(true, true, true);
            class6.field62.method3806(true, true, true);
            class502.field7007.method3806(true, true, true);
            class603.field8699 = true;
            class474.field6631.field9597 = 2;
            class163.field1998.field9597 = 2;
            class361.field4803.field9597 = 2;
            class618.field8872.field9597 = 2;
            class187.field2287.field9597 = 2;
            class469.field6553.field9597 = 2;
            class672.field9662.field9597 = 2;
        }
        if (class604.field8712 == class236.field3177) {
            if (!class62.method607((byte) -106, class358.field4771)) {
                return 0;
            }
            for (int var24 = 0; var24 < class516.field7555[class358.field4771].length; var24++) {
                class17 var25 = class516.field7555[class358.field4771][var24];
                if (var25.field379 == 5 && var25.field401 != -1) {
                    var25.method204(class68.field1045, false);
                }
            }
        }
        if (class604.field8712 == class236.field3178) {
            for (int var26 = 0; var26 < class516.field7555[class358.field4771].length; var26++) {
                class17 var27 = class516.field7555[class358.field4771][var26];
                if (var27.field379 == 5 && var27.field401 != -1 && var27.method204(class68.field1045, false) == null && class131.field1670) {
                    return 0;
                }
            }
        }
        if (class604.field8712 == class236.field3179) {
            class164.method1033(true, arg0 - 43);
        }
        if (class604.field8712 == class236.field3180) {
            class91.field1282.method3283(-1826593640);
            try {
                class611.field8756.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class207.field2533 = null;
            class599.field8647 = null;
            class91.field1282 = null;
            class268.field3680 = null;
            class611.field8756 = null;
            class6.field61 = null;
            class386.method2213((byte) -32);
            class700.field9909 = class221.field2851.field4163;
            class221.field2851.field4163 = true;
            class221.field2851.method1742(class517.field7570, -1);
            if (class700.field9909) {
                class435.method2608(-97, 0);
            } else {
                class435.method2608(-76, class221.field2851.field4154);
            }
            class14.method153(-1, class221.field2851.field4148, false, -1, (byte) 96);
            class574.method3363(0, class68.field1045);
            method3127(class68.field1045, (byte) -52);
            class696.method3909(class68.field1045, class692.field9847, 110);
            class48.method540(-106, class156.field1902);
        }
        return class209.method1250(false);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BILec;)V")
    public static final void method3125(byte arg0, int arg1, class213 arg2) {
        field7751++;
        if (arg0 != -41) {
            method3127(null, (byte) -109);
        }
        if (arg2.field2655 == null) {
            return;
        }
        int var3 = arg2.field2655[arg1 + 1];
        if (arg2.field2637 == var3) {
            return;
        }
        arg2.field2585 = 1;
        arg2.field2613 = 0;
        arg2.field2637 = var3;
        arg2.field2662 = 0;
        arg2.field2680 = arg2.field2683;
        arg2.field2665 = 0;
        if (arg2.field2637 != -1) {
            class563.method3294((byte) 36, class195.field2367.method3273(arg2.field2637, 0), arg2, arg2.field2613);
            return;
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)V")
    public static void method3126(byte arg0) {
        field7752 = null;
        field7748 = null;
        if (arg0 == -80) {
            field7753 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lr;B)V")
    public static final void method3127(class165 arg0, byte arg1) {
        field7750++;
        class242.field3330 = class42.method464(true, (byte) 112, arg0, class336.field4467);
        class214.field2729 = class636.method3632(arg0, true, class336.field4467);
        class657.field9330 = class42.method464(true, (byte) 77, arg0, class524.field7694);
        class417.field5909 = class636.method3632(arg0, true, class524.field7694);
        int var2 = 19 / ((60 - arg1) / 40);
        class36.field691 = class42.method464(true, (byte) 96, arg0, class113.field1454);
        class12.field205 = class636.method3632(arg0, true, class113.field1454);
    }
}
