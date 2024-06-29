import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class439 {

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "Ljk;")
    private class449 field6301 = new class449(64);

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "Lqn;")
    private class47 field6292;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "[I")
    public static int[] field6296 = new int[50];

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Lub;")
    public static class18 field6293 = new class18();

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BI)Luk;", line = 6)
    public final class172 method2579(byte arg0, int arg1) {
        field6298++;
        class449 var3 = this.field6301;
        class172 var5;
        synchronized (this.field6301) {
            int var4 = -97 % ((40 - arg0) / 61);
            var5 = (class172) this.field6301.method2647(-125, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        class47 var6 = this.field6292;
        byte[] var7;
        synchronized (this.field6292) {
            var7 = this.field6292.method481(11, arg1, -72);
        }
        class172 var8 = new class172();
        if (var7 != null) {
            var8.method1096(new class463(var7), -78);
        }
        class449 var9 = this.field6301;
        synchronized (this.field6301) {
            this.field6301.method2635((long) arg1, -26591, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V", line = 38)
    public final void method2580(int arg0, int arg1) {
        field6299++;
        class449 var3 = this.field6301;
        synchronized (this.field6301) {
            this.field6301.method2648(false, arg1);
            if (arg0 != 392) {
                this.method2580(75, -33);
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 64)
    public static void method2581(int arg0) {
        field6296 = null;
        if (arg0 >= 67) {
            field6293 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V", line = 75)
    public static final void method2582(int arg0) {
        field6300++;
        if (arg0 > -12) {
            method2582(81);
        }
        class136.method935(class233.field2985, -124);
        class52.field701++;
        if (class337.field4240 && class382.field5029) {
            int var1 = class204.field2664.method1333(7);
            int var2 = class204.field2664.method1337(69);
            int var3 = var2 - class501.field7242;
            int var4 = var1 - class452.field6531;
            if (var4 < class368.field4764) {
                var4 = class368.field4764;
            }
            if ((class233.field2985.field7617 + var4) > (class368.field4764 + class177.field2338.field7617)) {
                var4 = class368.field4764 - (class233.field2985.field7617 - class177.field2338.field7617);
            }
            if (var3 < class266.field3371) {
                var3 = class266.field3371;
            }
            if (var3 + class233.field2985.field7574 > class266.field3371 + class177.field2338.field7574) {
                var3 = class266.field3371 + class177.field2338.field7574 - class233.field2985.field7574;
            }
            int var5 = var4 + class177.field2338.field7636 - class368.field4764;
            int var6 = class177.field2338.field7659 + var3 - class266.field3371;
            if (class204.field2664.method1342(1)) {
                if (class233.field2985.field7596 < class52.field701) {
                    int var7 = var4 - class257.field3268;
                    int var8 = var3 - class282.field3587;
                    if (class233.field2985.field7610 < var7 || var7 < -class233.field2985.field7610 || var8 > class233.field2985.field7610 || var8 < (-class233.field2985.field7610)) {
                        class178.field2358 = true;
                    }
                }
                if (class233.field2985.field7583 != null && class178.field2358) {
                    class170 var9 = new class170();
                    var9.field2177 = var6;
                    var9.field2179 = class233.field2985;
                    var9.field2175 = var5;
                    var9.field2178 = class233.field2985.field7583;
                    class239.method1444(var9);
                    return;
                }
            } else {
                if (class178.field2358) {
                    class379.method2156(true);
                    if (class233.field2985.field7662 != null) {
                        class170 var10 = new class170();
                        var10.field2179 = class233.field2985;
                        var10.field2180 = class401.field5718;
                        var10.field2175 = var5;
                        var10.field2178 = class233.field2985.field7662;
                        var10.field2177 = var6;
                        class239.method1444(var10);
                    }
                    if (class401.field5718 != null && client.method1231(class233.field2985) != null) {
                        class60.method554(-1, class401.field5718, class233.field2985);
                    }
                } else if ((class295.field3791 == 1 || class52.method518(13)) && class2.field24 > 2) {
                    class197.method1221(-118, class501.field7242 + class282.field3587, class452.field6531 + class257.field3268);
                } else if (class517.method3086(1723)) {
                    class197.method1221(-119, class501.field7242 + class282.field3587, class452.field6531 + class257.field3268);
                }
                class233.field2985 = null;
            }
        } else if (class52.field701 > 1) {
            class233.field2985 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V", line = 194)
    public final void method2583(int arg0) {
        class449 var2 = this.field6301;
        synchronized (this.field6301) {
            this.field6301.method2642(0);
        }
        field6294++;
        if (arg0 < 104) {
            field6293 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V", line = 207)
    public final void method2584(int arg0) {
        field6295++;
        class449 var2 = this.field6301;
        synchronized (this.field6301) {
            if (arg0 != -952) {
                method2581(88);
            }
            this.field6301.method2640(103);
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lae;ILqn;)V", line = 683)
    public class439(class165 arg0, int arg1, class47 arg2) {
        this.field6292 = arg2;
        if (this.field6292 != null) {
            this.field6292.method469(30322, 11);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V", line = 225)
    public static final void method2585(byte arg0) {
        class494.method2994(false, (byte) 114);
        field6297++;
        class141.field1833 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class42.field521.length; var2++) {
            if (class296.field3805[var2] != -1 && class42.field521[var2] == null) {
                class42.field521[var2] = class351.field4507.method481(class296.field3805[var2], 0, -84);
                if (class42.field521[var2] == null) {
                    class141.field1833++;
                    var1 = false;
                }
            }
            if (class523.field7708[var2] != -1 && class189.field2476[var2] == null) {
                class189.field2476[var2] = class351.field4507.method487(0, class523.field7708[var2], class268.field3391[var2], -20447);
                if (class189.field2476[var2] == null) {
                    class141.field1833++;
                    var1 = false;
                }
            }
            if (class502.field7256[var2] != -1 && class450.field6476[var2] == null) {
                class450.field6476[var2] = class351.field4507.method481(class502.field7256[var2], 0, class489.method2968(arg0, 47));
                if (class450.field6476[var2] == null) {
                    class141.field1833++;
                    var1 = false;
                }
            }
            if (class53.field709[var2] != -1 && class141.field1826[var2] == null) {
                class141.field1826[var2] = class351.field4507.method481(class53.field709[var2], 0, -83);
                if (class141.field1826[var2] == null) {
                    var1 = false;
                    class141.field1833++;
                }
            }
            if (class433.field6138 != null && class166.field2121[var2] == null && class433.field6138[var2] != -1) {
                class166.field2121[var2] = class351.field4507.method487(0, class433.field6138[var2], class268.field3391[var2], -20447);
                if (class166.field2121[var2] == null) {
                    var1 = false;
                    class141.field1833++;
                }
            }
        }
        if (class452.field6528 == null) {
            if (class443.field6361 == null || !class231.field2945.method459(class443.field6361.field2018 + "_staticelements", 121)) {
                class452.field6528 = new class66(0);
            } else if (class231.field2945.method480((byte) 22, class443.field6361.field2018 + "_staticelements")) {
                class452.field6528 = class214.method1319(class231.field2945, class433.field6147, arg0 ^ 0x35, class443.field6361.field2018 + "_staticelements");
            } else {
                var1 = false;
                class141.field1833++;
            }
        }
        if (!var1) {
            class384.field5058 = 1;
            return;
        }
        class308.field3948 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class42.field521.length; var4++) {
            byte[] var19 = class189.field2476[var4];
            if (var19 != null) {
                int var20 = (class79.field1025[var4] >> 8) * 64 - class441.field6317;
                int var21 = (class79.field1025[var4] & 0xFF) * 64 - class320.field4064;
                if (class387.field5108 != 0) {
                    var21 = 10;
                    var20 = 10;
                }
                var3 &= class240.method1449(var19, var21, 61, var20, class440.field6307, class452.field6526);
            }
            byte[] var22 = class141.field1826[var4];
            if (var22 != null) {
                int var23 = (class79.field1025[var4] >> 8) * 64 - class441.field6317;
                int var24 = (class79.field1025[var4] & 0xFF) * 64 - class320.field4064;
                if (class387.field5108 != 0) {
                    var24 = 10;
                    var23 = 10;
                }
                var3 &= class240.method1449(var22, var24, arg0 + 105, var23, class440.field6307, class452.field6526);
            }
        }
        if (!var3) {
            class384.field5058 = 2;
            return;
        }
        if (class384.field5058 != 0) {
            class151.method990(class460.field6579, (byte) 42, class101.field1225.method1936(arg0 ^ 0x67E4, class11.field177) + "<br>(100%)", true);
        }
        class139.method946(81);
        class124.method876((byte) 107);
        boolean var5 = false;
        if (class33.field416.method297() && class407.field5817.field3623) {
            for (int var6 = 0; var6 < class42.field521.length; var6++) {
                if (class141.field1826[var6] != null || class450.field6476[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class407.field5817.field3636) {
            var7 = class280.field3567[class131.field1723];
        } else {
            var7 = class179.field2367[class131.field1723];
        }
        if (class33.field416.method289()) {
            var7++;
        }
        class113.method822(7, 4, class452.field6526, class440.field6307, var7, var5, class33.field416.method314() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class172.field2185[var8].method2004(-1);
        }
        class513.method3062(-1);
        class452.method2697(true, false);
        class492.method2986(-121);
        class521.field7538 = null;
        class139.method946(arg0 + 187);
        System.gc();
        class494.method2994(true, (byte) -100);
        class442.method2605(-33);
        class228.field2923 = class407.field5817.method1681(class377.field4959, -28198);
        class376.field4947 = class105.field1333 >= 96;
        class223.field2822 = class407.field5817.field3623;
        class266.field3354 = class407.field5817.method1684(arg0 ^ 0x4F, class377.field4959);
        class433.field6156 = !class407.field5817.field3617;
        class140.field1810 = class407.field5817.method580(class377.field4959, (byte) -35) ? -1 : class415.field5926;
        class455.field6552 = class407.field5817.field3625;
        class24.field354 = class377.field4959 == 1 || class407.field5817.field3654;
        class532.field7825 = new class4(4, class452.field6526, class440.field6307, false);
        if (class387.field5108 == 0) {
            class304.method1791(class532.field7825, (byte) 103, class42.field521);
        } else {
            class243.method1479(class42.field521, -67, class532.field7825);
        }
        class87.method695(class440.field6307 >> 4, 2, class452.field6526 >> 4);
        class314.method1843((byte) 2);
        if (var5) {
            class119.method857(true);
            class275.field3455 = new class4(1, class452.field6526, class440.field6307, true);
            if (class387.field5108 == 0) {
                class304.method1791(class275.field3455, (byte) 103, class450.field6476);
                class494.method2994(true, (byte) -42);
            } else {
                class243.method1479(class450.field6476, arg0 ^ 0x3C, class275.field3455);
                class494.method2994(true, (byte) 115);
            }
            class275.field3455.method655(arg0 ^ 0xFFFFFFCE, 0, class532.field7825.field967[0]);
            class275.field3455.method651((byte) -89, null, null, class33.field416);
            class119.method857(false);
        }
        class532.field7825.method651((byte) -59, class172.field2185, var5 ? class275.field3455.field967 : null, class33.field416);
        if (class387.field5108 == 0) {
            class494.method2994(true, (byte) 117);
            class161.method1036(class532.field7825, class189.field2476, false);
            if (class166.field2121 != null) {
                class291.method1707(1077367982);
            }
        } else {
            class494.method2994(true, (byte) -38);
            class117.method842(class189.field2476, (byte) -93, class532.field7825);
        }
        class124.method876((byte) 107);
        class494.method2994(true, (byte) 120);
        class532.field7825.method658(class33.field416, -24983, null, var5 ? class140.field1808[0] : null);
        class532.field7825.method16(class33.field416, -10938);
        class494.method2994(true, (byte) 111);
        if (var5) {
            class119.method857(true);
            class494.method2994(true, (byte) -118);
            if (class387.field5108 == 0) {
                class161.method1036(class275.field3455, class141.field1826, false);
            } else {
                class117.method842(class141.field1826, (byte) -91, class275.field3455);
            }
            class124.method876((byte) 107);
            class494.method2994(true, (byte) -76);
            class275.field3455.method658(class33.field416, -24983, class531.field7811[0], null);
            class275.field3455.method16(class33.field416, -10938);
            class494.method2994(true, (byte) -18);
            class119.method857(false);
        }
        class516.method3079(arg0 - 3703);
        int var9 = class532.field7825.field42;
        if (var9 > class276.field3488) {
            var9 = class276.field3488;
        }
        if ((class276.field3488 - 1) > var9) {
            var9 = class276.field3488 - 1;
        }
        if (class407.field5817.method580(class377.field4959, (byte) -35)) {
            class389.method2213(0);
        } else {
            class389.method2213(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class452.field6526; var17++) {
                for (int var18 = 0; var18 < class440.field6307; var18++) {
                    class33.method244((byte) 58, var17, var10, var18);
                }
            }
        }
        class211.method1310(true);
        class139.method946(88);
        if (arg0 != -79) {
            return;
        }
        class372.method2119(arg0 ^ 0xFFFFFFC3);
        class124.method876((byte) 107);
        class253.field3234 = false;
        class266.method1583(arg0 + 335);
        if (class123.field1656 != null && class64.field835 != null && class483.field7059 == 10) {
            class282.method1669(class109.field1473, false);
            class187.field2442++;
            class40.field511.method2777(1057001181, -11);
        }
        if (class387.field5108 == 0) {
            int var11 = (class75.field963 - (class452.field6526 >> 4)) / 8;
            int var12 = ((class452.field6526 >> 4) + class75.field963) / 8;
            int var13 = (class169.field2170 - (class440.field6307 >> 4)) / 8;
            int var14 = ((class440.field6307 >> 4) + class169.field2170) / 8;
            for (int var15 = var11 - 1; var15 <= var12 + 1; var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var11 > var15 || var12 < var15 || var16 < var13 || var16 > var14) {
                        class351.field4507.method467("m" + var15 + "_" + var16, -35);
                        class351.field4507.method467("l" + var15 + "_" + var16, -29);
                    }
                }
            }
        }
        if (class483.field7059 == 3) {
            class284.method1677(-20429, 2);
        } else if (class483.field7059 == 7) {
            class284.method1677(arg0 - 20350, 6);
        } else {
            class284.method1677(-20429, 9);
            if (class64.field835 != null) {
                class282.method1669(class116.field1552, false);
            }
        }
        class118.method849(-1);
        class139.method946(114);
        class529.method3140(true);
    }
}
