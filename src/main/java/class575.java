import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class575 {

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Lpu;")
    private class522 field8088;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public int field8087;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field8084 = -1;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Lvg;")
    public static class49 field8091 = null;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field8085;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field8086;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field8089;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field8090;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field8092;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)Z")
    public static final boolean method3258(int arg0, int arg1, int arg2) {
        field8093++;
        if (arg0 != -5) {
            field8091 = null;
        }
        return class158.method1102(arg1, (byte) -63, arg2) & class513.method2937(arg2, arg1, arg0 ^ 0x4);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
    public static final void method3259(boolean arg0) {
        class109.method857(false, true);
        field8089++;
        class586.field8213 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class505.field7133.length; var2++) {
            if (class44.field708[var2] != -1 && class505.field7133[var2] == null) {
                class505.field7133[var2] = class334.field4954.method3007(class44.field708[var2], 0, 5);
                if (class505.field7133[var2] == null) {
                    var1 = false;
                    class586.field8213++;
                }
            }
            if (class248.field3860[var2] != -1 && class544.field7660[var2] == null) {
                class544.field7660[var2] = class334.field4954.method2973(class248.field3860[var2], 0, class271.field4086[var2], 0);
                if (class544.field7660[var2] == null) {
                    var1 = false;
                    class586.field8213++;
                }
            }
            if (class549.field7718[var2] != -1 && class119.field1799[var2] == null) {
                class119.field1799[var2] = class334.field4954.method3007(class549.field7718[var2], 0, 5);
                if (class119.field1799[var2] == null) {
                    class586.field8213++;
                    var1 = false;
                }
            }
            if (class131.field1934[var2] != -1 && class475.field6774[var2] == null) {
                class475.field6774[var2] = class334.field4954.method3007(class131.field1934[var2], 0, 5);
                if (class475.field6774[var2] == null) {
                    class586.field8213++;
                    var1 = false;
                }
            }
            if (class462.field6663 != null && class583.field8197[var2] == null && class462.field6663[var2] != -1) {
                class583.field8197[var2] = class334.field4954.method2973(class462.field6663[var2], 0, class271.field4086[var2], 0);
                if (class583.field8197[var2] == null) {
                    var1 = false;
                    class586.field8213++;
                }
            }
        }
        if (class409.field5972 == null) {
            if (class574.field8082 == null || !class75.field1310.method2992((byte) -123, class574.field8082.field4813 + "_staticelements")) {
                class409.field5972 = new class585(0);
            } else if (class75.field1310.method3001(class574.field8082.field4813 + "_staticelements", false)) {
                class409.field5972 = class204.method1354(class75.field1310, class574.field8082.field4813 + "_staticelements", class267.field4035, -23336);
            } else {
                var1 = false;
                class586.field8213++;
            }
        }
        if (!var1) {
            class224.field3166 = 1;
            return;
        }
        class572.field8055 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class505.field7133.length; var4++) {
            byte[] var21 = class544.field7660[var4];
            if (var21 != null) {
                int var22 = (class273.field4105[var4] >> 8) * 64 - class109.field1672;
                int var23 = (class273.field4105[var4] & 0xFF) * 64 - class203.field2874;
                if (class48.field817 != 0) {
                    var22 = 10;
                    var23 = 10;
                }
                var3 &= class133.method980(class199.field2812, var22, var21, class232.field3611, var23, -2);
            }
            byte[] var24 = class475.field6774[var4];
            if (var24 != null) {
                int var25 = (class273.field4105[var4] >> 8) * 64 - class109.field1672;
                int var26 = (class273.field4105[var4] & 0xFF) * 64 - class203.field2874;
                if (class48.field817 != 0) {
                    var25 = 10;
                    var26 = 10;
                }
                var3 &= class133.method980(class199.field2812, var25, var24, class232.field3611, var26, -2);
            }
        }
        if (!var3) {
            class224.field3166 = 2;
            return;
        }
        if (class224.field3166 != 0) {
            class140.method1015(class563.field7931, true, class244.field3796, class282.field4228, (byte) 65, class274.field4128.method1804(7175, class512.field7203) + "<br>(100%)");
        }
        class263.method1730(-1);
        class242.method1643(-19585);
        boolean var5 = arg0;
        if (class282.field4228.method108() && class287.field4270.field3705) {
            for (int var6 = 0; var6 < class505.field7133.length; var6++) {
                if (class475.field6774[var6] != null || class119.field1799[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class287.field4270.field3681) {
            var7 = class27.field396[class234.field3638];
        } else {
            var7 = class43.field693[class234.field3638];
        }
        if (class282.field4228.method167()) {
            var7++;
        }
        class279.method1821(class282.field4228, class247.field3825, 9, 4, class199.field2812, class232.field3611, var7, var5, class282.field4228.method173() > 0);
        if (class650.field9111) {
            class118.method910(class351.field5064);
        } else {
            class118.method910(null);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class423.field6155[var8].method3749(false);
        }
        class252.method1686(-87);
        class504.method2899(1, false);
        class300.method1931(0);
        class189.field2720 = false;
        class380.field5380 = null;
        class263.method1730(-1);
        System.gc();
        class109.method857(true, true);
        class19.method225(26770);
        class236.field3675 = class287.field4270.method1625(-105, class328.field4859);
        class327.field4848 = class266.field4022 >= 96;
        class201.field2844 = class287.field4270.field3705;
        class367.field5247 = class287.field4270.method1624(10814, class328.field4859);
        class163.field2333 = !class287.field4270.field3688;
        class466.field6703 = class287.field4270.method2747(121, class328.field4859) ? -1 : class97.field1532;
        class124.field1864 = class260.method1713(false, class328.field4859) || class287.field4270.field3683;
        class376.field5357 = class287.field4270.field3724;
        class268.field4039 = new class56(4, class199.field2812, class232.field3611, false);
        if (class48.field817 == 0) {
            class647.method3589(class268.field4039, class505.field7133, (byte) -107);
        } else {
            class285.method1837(class505.field7133, class268.field4039, false);
        }
        class32.method357(class232.field3611 >> 4, (byte) -93, class199.field2812 >> 4);
        class424.method2542((byte) 75);
        if (var5) {
            class668.method3700(true);
            class322.field4740 = new class56(1, class199.field2812, class232.field3611, true);
            if (class48.field817 == 0) {
                class647.method3589(class322.field4740, class119.field1799, (byte) -107);
                class109.method857(true, true);
            } else {
                class285.method1837(class119.field1799, class322.field4740, false);
                class109.method857(true, true);
            }
            class322.field4740.method2028((byte) -126, class268.field4039.field4765[0], 0);
            class322.field4740.method2032(null, class282.field4228, null, (byte) -16);
            class668.method3700(false);
        }
        class268.field4039.method2032(var5 ? class322.field4740.field4765 : null, class282.field4228, class423.field6155, (byte) -16);
        if (class48.field817 == 0) {
            class109.method857(true, true);
            class374.method2256(class268.field4039, class544.field7660, (byte) -121);
            if (class583.field8197 != null) {
                class660.method3660(arg0);
            }
        } else {
            class109.method857(true, true);
            class77.method711(true, class544.field7660, class268.field4039);
        }
        class242.method1643(-19585);
        if (class266.field4022 < 96) {
            class132.method976((byte) -64);
        }
        class109.method857(true, true);
        class268.field4039.method2025(var5 ? class499.field7071[0] : null, (byte) 57, class282.field4228, null);
        class268.field4039.method616(class282.field4228, false, -124);
        class109.method857(true, true);
        if (var5) {
            class668.method3700(true);
            class109.method857(true, true);
            if (class48.field817 == 0) {
                class374.method2256(class322.field4740, class475.field6774, (byte) -121);
            } else {
                class77.method711(true, class475.field6774, class322.field4740);
            }
            class242.method1643(-19585);
            class109.method857(true, true);
            class322.field4740.method2025(null, (byte) 73, class282.field4228, class420.field6108[0]);
            class322.field4740.method616(class282.field4228, true, -127);
            class109.method857(true, true);
            class668.method3700(false);
        }
        class136.method987(-106);
        int var9 = class268.field4039.field1082;
        if (class58.field1112 < var9) {
            var9 = class58.field1112;
        }
        if (class58.field1112 - 1 > var9) {
            var9 = class58.field1112 - 1;
        }
        if (class287.field4270.method2747(126, class328.field4859)) {
            class676.method3759(0);
        } else {
            class676.method3759(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class199.field2812; var19++) {
                for (int var20 = 0; var20 < class232.field3611; var20++) {
                    class443.method2627(var20, var10, var19, -28422);
                }
            }
        }
        class315.method1987((byte) 114);
        class263.method1730(-1);
        class431.method2572((byte) -105);
        class242.method1643(-19585);
        class56.method610(-112);
        if (class683.field9634 != null && class274.field4181 != null && class420.field6113 == 11) {
            class264.field4008++;
            class135 var11 = class688.method3794(class381.field5390, class583.field8198, (byte) 38);
            var11.field1978.method3868(1057001181, -318419336);
            class19.method223(var11, 0);
        }
        if (class48.field817 == 0) {
            int var12 = (class312.field4619 - (class199.field2812 >> 4)) / 8;
            int var13 = (class312.field4619 + (class199.field2812 >> 4)) / 8;
            int var14 = (class360.field5169 - (class232.field3611 >> 4)) / 8;
            int var15 = ((class232.field3611 >> 4) + class360.field5169) / 8;
            for (int var16 = var12 - 1; var16 <= var13 + 1; var16++) {
                for (int var17 = var14 - 1; var17 <= var15 + 1; var17++) {
                    if (var16 < var12 || var16 > var13 || var14 > var17 || var17 > var15) {
                        class334.field4954.method3008((byte) -113, "m" + var16 + "_" + var17);
                        class334.field4954.method3008((byte) -117, "l" + var16 + "_" + var17);
                    }
                }
            }
        }
        if (class420.field6113 == 4) {
            class112.method868(3, (byte) -124);
        } else if (class420.field6113 == 8) {
            class112.method868(7, (byte) 95);
        } else {
            class112.method868(10, (byte) -118);
            if (class274.field4181 != null) {
                class135 var18 = class688.method3794(class55.field1070, class583.field8198, (byte) 38);
                class19.method223(var18, 0);
            }
        }
        class215.method1429((byte) -77);
        class263.method1730(-1);
        class588.method3324((byte) 107);
        if (class621.field8658) {
            class262.method1723(!arg0, "Took: " + (class490.method2840(true) - class573.field8061) + "ms");
            class621.field8658 = false;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BILgf;I)V")
    public static final void method3260(byte arg0, int arg1, class248 arg2, int arg3) {
        field8086++;
        class115.field1765[arg1][arg3] = arg2;
        if (arg0 != 81) {
            field8084 = 101;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method3261(int arg0) {
        if (arg0 >= -35) {
            field8091 = null;
        }
        field8091 = null;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public static final void method3262(int arg0) {
        field8092++;
        class293.field4323 = arg0;
        class99.field1552 = null;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lkr;ILpu;)V")
    public class575(class693 arg0, int arg1, class522 arg2) {
        new class382(64);
        this.field8088 = arg2;
        this.field8087 = this.field8088.method2988(109, 15);
    }
}
