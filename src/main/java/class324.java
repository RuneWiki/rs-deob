import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class324 extends class112 {

    @OriginalMember(owner = "client!km", name = "M", descriptor = "I")
    private int field5649 = 0;

    @OriginalMember(owner = "client!km", name = "V", descriptor = "I")
    private int field5658 = 4096;

    @OriginalMember(owner = "client!km", name = "N", descriptor = "[Lrb;")
    public static class220[] field5650 = new class220[4];

    @OriginalMember(owner = "client!km", name = "R", descriptor = "Lwm;")
    public static class152 field5654 = class157.method1048("<col=ffff00>", 104);

    @OriginalMember(owner = "client!km", name = "U", descriptor = "F")
    public static float field5657;

    @OriginalMember(owner = "client!km", name = "K", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!km", name = "L", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!km", name = "O", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!km", name = "P", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!km", name = "T", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!km", name = "W", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!km", name = "X", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!km", name = "Y", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!km", name = "S", descriptor = "Lbg;")
    public static class203 field5655;

    @OriginalMember(owner = "client!km", name = "Q", descriptor = "[I")
    public static int[] field5653;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BI)[I", line = 8)
    public final int[] method53(byte arg0, int arg1) {
        field5651++;
        int[] var3 = this.field1585.method1952(arg1, (byte) 83);
        if (this.field1585.field4935) {
            int[] var4 = this.method751(arg1, (byte) 126, 0);
            for (int var5 = 0; var5 < class58.field889; var5++) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field5649 && this.field5658 >= var6 ? 4096 : 0;
            }
        }
        if (arg0 != -3) {
            field5654 = (class152) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V", line = 43)
    public static final void method2277(boolean arg0) {
        if (class270.field4622 > 1) {
            class65.field980 = class86.field1212;
            class270.field4622--;
        }
        field5661++;
        if (class277.field4738 > 0) {
            class277.field4738--;
        }
        if (class196.field3147) {
            class196.field3147 = false;
            class234.method1606(22243);
            return;
        }
        for (int var1 = 0; var1 < 100 && class304.method2122(arg0); var1++) {
        }
        if (class232.field3814 != 30) {
            return;
        }
        class46.method315(class245.field4102, 117, 110);
        Object var2 = class140.field2131.field2190;
        synchronized (class140.field2131.field2190) {
            if (!class296.field5061) {
                class140.field2131.field2196 = 0;
            } else if (class61.field921 != 0 || class140.field2131.field2196 >= 40) {
                class107.field1524++;
                class245.field4102.method1065(65, 126);
                class245.field4102.method1980(false, 0);
                int var3 = class245.field4102.field4946;
                int var4 = 0;
                for (int var5 = 0; class140.field2131.field2196 > var5 && (class245.field4102.field4946 - var3) < 240; var5++) {
                    var4++;
                    int var6 = class140.field2131.field2197[var5];
                    int var7 = class140.field2131.field2195[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    if (class140.field2131.field2197[var5] == -1 && class140.field2131.field2195[var5] == -1) {
                        var6 = -1;
                        var8 = true;
                        var7 = -1;
                    }
                    if (class98.field1412 != var7 || class253.field4388 != var6) {
                        int var9 = var7 - class98.field1412;
                        class98.field1412 = var7;
                        int var10 = var6 - class253.field4388;
                        class253.field4388 = var6;
                        if (class241.field3949 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class245.field4102.method1994((class241.field3949 << 12) + (var9 << 6) + var10, 2921);
                            class241.field3949 = 0;
                        } else if (class241.field3949 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var9 += 128;
                            class245.field4102.method1980(arg0, class241.field3949 + 128);
                            var10 += 128;
                            class245.field4102.method1994((var9 << 8) + var10, 2921);
                            class241.field3949 = 0;
                        } else if (class241.field3949 >= 32) {
                            class245.field4102.method1994(class241.field3949 + 57344, 2921);
                            if (var8) {
                                class245.field4102.method1967(Integer.MIN_VALUE, -1303690792);
                            } else {
                                class245.field4102.method1967(var7 | var6 << 16, -1303690792);
                            }
                            class241.field3949 = 0;
                        } else {
                            class245.field4102.method1980(arg0, class241.field3949 + 192);
                            if (var8) {
                                class245.field4102.method1967(Integer.MIN_VALUE, -1303690792);
                            } else {
                                class245.field4102.method1967(var6 << 16 | var7, -1303690792);
                            }
                            class241.field3949 = 0;
                        }
                    } else if (class241.field3949 < 2047) {
                        class241.field3949++;
                    }
                }
                class245.field4102.method2005(class245.field4102.field4946 - var3, (byte) 126);
                if (class140.field2131.field2196 > var4) {
                    class140.field2131.field2196 -= var4;
                    for (int var11 = 0; var11 < class140.field2131.field2196; var11++) {
                        class140.field2131.field2195[var11] = class140.field2131.field2195[var11 + var4];
                        class140.field2131.field2197[var11] = class140.field2131.field2197[var4 + var11];
                    }
                } else {
                    class140.field2131.field2196 = 0;
                }
            }
        }
        if (class61.field921 != 0) {
            class180.field2870++;
            long var13 = (class111.field1572 - class162.field2567) / 50L;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            class162.field2567 = class111.field1572;
            byte var15 = 0;
            int var16 = class193.field3066;
            int var17 = (int) var13;
            int var18 = class62.field944;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            if (class61.field921 == 2) {
                var15 = 1;
            }
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 65535) {
                var18 = 65535;
            }
            class245.field4102.method1065(34, 126);
            class245.field4102.method1963((byte) -78, var17 | var15 << 15);
            class245.field4102.method2019((byte) -89, var16 | var18 << 16);
        }
        if (class320.field5571 > 0) {
            class320.field5571--;
        }
        if (class259.field4438) {
            for (int var19 = 0; var19 < class195.field3127; var19++) {
                int var20 = class247.field4135[var19];
                if (var20 == 98 || var20 == 99 || var20 == 96 || var20 == 97) {
                    class212.field3463 = true;
                    break;
                }
            }
        } else if (class216.field3515[96] || class216.field3515[97] || class216.field3515[98] || class216.field3515[99]) {
            class212.field3463 = true;
        }
        if (class212.field3463 && class320.field5571 <= 0) {
            class212.field3463 = false;
            class283.field4818++;
            class320.field5571 = 20;
            class245.field4102.method1065(101, 125);
            class245.field4102.method2018(class272.field4645, 128);
            class245.field4102.method2018(class193.field3060, 128);
        }
        if (class290.field4932 && !class322.field5634) {
            class45.field712++;
            class322.field5634 = true;
            class245.field4102.method1065(114, -83);
            class245.field4102.method1980(false, 1);
        }
        if (arg0 == class290.field4932 && class322.field5634) {
            class322.field5634 = false;
            class245.field4102.method1065(114, 123);
            class245.field4102.method1980(false, 0);
            class45.field712++;
        }
        if (!class254.field4391) {
            class303.field5221++;
            class245.field4102.method1065(153, -50);
            class245.field4102.method2010(method2279(-12940), -3);
            class254.field4391 = true;
        }
        class189.method1254((byte) -64);
        if (class232.field3814 != 30) {
            return;
        }
        class111.method744((byte) 57);
        class322.method2267(0);
        class148.method934(125);
        class147.field2248++;
        if (class147.field2248 > 750) {
            class234.method1606(22243);
            return;
        }
        class224.method1546((byte) -31);
        class112.method746((byte) 126);
        class127.method806((byte) 125);
        if (class252.field4341 != null) {
            class286.method1928((byte) 25);
        }
        for (int var21 = class262.method1809((byte) -125, true); var21 != -1; var21 = class262.method1809((byte) -124, false)) {
            class127.method815(-2, var21);
            class194.field3100[class34.method251(class266.field4489++, 31)] = var21;
        }
        for (class303 var22 = class208.method1400((byte) 109); var22 != null; var22 = class208.method1400((byte) 125)) {
            int var23 = var22.method2118(-82);
            int var24 = var22.method2120(0);
            if (var23 == 1) {
                class211.field3426[var24] = var22.field5219;
                class247.field4136[class34.method251(class141.field2144++, 31)] = var24;
            } else if (var23 == 2) {
                class236.field3864[var24] = var22.field5215;
                class31.field526[class34.method251(31, class325.field5662++)] = var24;
            } else if (var23 == 3) {
                class127 var25 = class11.method54(false, var24);
                if (!var22.field5215.method992(23292, var25.field1912)) {
                    var25.field1912 = var22.field5215;
                    class272.method1868(22889, var25);
                }
            } else if (var23 == 4) {
                class127 var42 = class11.method54(false, var24);
                int var43 = var22.field5219;
                int var44 = var22.field5208;
                int var45 = var22.field5223;
                if (var42.field1899 != var43 || var42.field1900 != var44 || var42.field1888 != var45) {
                    var42.field1888 = var45;
                    var42.field1900 = var44;
                    var42.field1899 = var43;
                    class272.method1868(22889, var42);
                }
            } else if (var23 == 5) {
                class127 var26 = class11.method54(false, var24);
                if (var22.field5219 != var26.field1943 || var22.field5219 == -1) {
                    var26.field1874 = 1;
                    var26.field1943 = var22.field5219;
                    var26.field1795 = 0;
                    var26.field1800 = 0;
                    class272.method1868(22889, var26);
                }
            } else if (var23 == 6) {
                int var27 = var22.field5219;
                int var28 = (var27 & 0x3E0) >> 5;
                int var29 = var27 & 0x1F;
                class127 var30 = class11.method54(false, var24);
                int var31 = (var27 & 0x7C44) >> 10;
                int var32 = (var31 << 19) + (var28 << 11) + (var29 << 3);
                if (var30.field1856 != var32) {
                    var30.field1856 = var32;
                    class272.method1868(22889, var30);
                }
            } else if (var23 == 7) {
                class127 var33 = class11.method54(false, var24);
                boolean var34 = var22.field5219 == 1;
                if (var34 != var33.field1870) {
                    var33.field1870 = var34;
                    class272.method1868(22889, var33);
                }
            } else if (var23 == 8) {
                class127 var35 = class11.method54(false, var24);
                if (var22.field5219 != var35.field1820 || var22.field5208 != var35.field1813 || var22.field5223 != var35.field1861) {
                    var35.field1861 = var22.field5223;
                    var35.field1820 = var22.field5219;
                    if (var35.field1911 != -1) {
                        if (var35.field1822 > 0) {
                            var35.field1861 = var35.field1861 * 32 / var35.field1822;
                        } else if (var35.field1879 > 0) {
                            var35.field1861 = var35.field1861 * 32 / var35.field1879;
                        }
                    }
                    var35.field1813 = var22.field5208;
                    class272.method1868(22889, var35);
                }
            } else if (var23 == 9) {
                class127 var41 = class11.method54(false, var24);
                if (var22.field5219 != var41.field1911 || var22.field5208 != var41.field1885) {
                    var41.field1911 = var22.field5219;
                    var41.field1885 = var22.field5208;
                    class272.method1868(22889, var41);
                }
            } else if (var23 == 10) {
                class127 var40 = class11.method54(false, var24);
                if (var22.field5219 != var40.field1823 || var22.field5208 != var40.field1782 || var22.field5223 != var40.field1790) {
                    var40.field1823 = var22.field5219;
                    var40.field1790 = var22.field5223;
                    var40.field1782 = var22.field5208;
                    class272.method1868(22889, var40);
                }
            } else if (var23 == 11) {
                class127 var36 = class11.method54(false, var24);
                var36.field1838 = 0;
                var36.field1828 = var36.field1851 = var22.field5208;
                var36.field1924 = var36.field1927 = var22.field5219;
                var36.field1857 = 0;
                class272.method1868(22889, var36);
            } else if (var23 == 12) {
                class127 var38 = class11.method54(false, var24);
                int var39 = var22.field5219;
                if (var38 != null && var38.field1902 == 0) {
                    if (var39 > (var38.field1915 - var38.field1921)) {
                        var39 = var38.field1915 - var38.field1921;
                    }
                    if (var39 < 0) {
                        var39 = 0;
                    }
                    if (var38.field1852 != var39) {
                        var38.field1852 = var39;
                        class272.method1868(22889, var38);
                    }
                }
            } else if (var23 == 13) {
                class127 var37 = class11.method54(false, var24);
                var37.field1834 = var22.field5219;
            }
        }
        if (class38.field632 != 0) {
            class57.field878 += 20;
            if (class57.field878 >= 400) {
                class38.field632 = 0;
            }
        }
        class277.field4740++;
        if (class205.field3357 != null) {
            class199.field3207++;
            if (class199.field3207 >= 15) {
                class272.method1868(22889, class205.field3357);
                class205.field3357 = null;
            }
        }
        if (class77.field1091 != null) {
            class272.method1868(22889, class77.field1091);
            if (class304.field5229 + 5 < class278.field4763 || class278.field4763 < (class304.field5229 - 5) || class254.field4397 > class169.field2650 + 5 || (class169.field2650 - 5) > class254.field4397) {
                class175.field2820 = true;
            }
            class205.field3355++;
            if (class93.field1330 == 0) {
                if (class175.field2820 && class205.field3355 >= 5) {
                    if (class77.field1091 == class208.field3394 && class323.field5642 != class302.field5199) {
                        class201.field3244++;
                        class127 var46 = class77.field1091;
                        byte var47 = 0;
                        if (class275.field4701 == 1 && var46.field1887 == 206) {
                            var47 = 1;
                        }
                        if (var46.field1833[class302.field5199] <= 0) {
                            var47 = 0;
                        }
                        if (client.method1759(var46).method552(45)) {
                            int var48 = class323.field5642;
                            int var49 = class302.field5199;
                            var46.field1833[var49] = var46.field1833[var48];
                            var46.field1837[var49] = var46.field1837[var48];
                            var46.field1833[var48] = -1;
                            var46.field1837[var48] = 0;
                        } else if (var47 == 1) {
                            int var50 = class323.field5642;
                            int var51 = class302.field5199;
                            while (var50 != var51) {
                                if (var51 < var50) {
                                    var46.method813((byte) 42, var50, var50 - 1);
                                    var50--;
                                } else if (var50 < var51) {
                                    var46.method813((byte) 42, var50, var50 + 1);
                                    var50++;
                                }
                            }
                        } else {
                            var46.method813((byte) 42, class323.field5642, class302.field5199);
                        }
                        class245.field4102.method1065(204, 126);
                        class245.field4102.method1996(0, class323.field5642);
                        class245.field4102.method1996(0, class302.field5199);
                        class245.field4102.method1965((byte) 127, var47);
                        class245.field4102.method1967(class77.field1091.field1868, -1303690792);
                    }
                } else if ((class270.field4625 == 1 || class169.method1111(class160.field2556 - 1, (byte) 108)) && class160.field2556 > 2) {
                    class222.method1537(30);
                } else if (class160.field2556 > 0) {
                    class175.method1170(false);
                }
                class199.field3207 = 10;
                class61.field921 = 0;
                class77.field1091 = null;
            }
        }
        class40.field646 = false;
        class127 var52 = class120.field1694;
        class120.field1694 = null;
        class127 var53 = class108.field1542;
        client.field4364 = false;
        class108.field1542 = null;
        class195.field3127 = 0;
        class16.field225 = null;
        while (class266.method1823((byte) -126) && class195.field3127 < 128) {
            class247.field4135[class195.field3127] = class42.field667;
            class320.field5585[class195.field3127] = class197.field3167;
            class195.field3127++;
        }
        class252.field4341 = null;
        if (class253.field4387 != -1) {
            class169.method1112(class227.field3709, class172.field2757, 0, 0, 84, 0, class253.field4387, 0);
        }
        class86.field1212++;
        while (true) {
            class320 var54;
            class127 var55;
            class127 var56;
            do {
                var54 = (class320) class39.field637.method1215((byte) -96);
                if (var54 == null) {
                    while (true) {
                        class320 var57;
                        class127 var58;
                        class127 var59;
                        do {
                            var57 = (class320) class203.field3285.method1215((byte) -90);
                            if (var57 == null) {
                                while (true) {
                                    class320 var60;
                                    class127 var61;
                                    class127 var62;
                                    do {
                                        var60 = (class320) class66.field989.method1215((byte) -112);
                                        if (var60 == null) {
                                            if (class252.field4341 == null) {
                                                class26.field435 = 0;
                                            }
                                            if (class33.field537 != null) {
                                                class230.method1577(1);
                                            }
                                            if (class148.field2263 > 0 && class216.field3515[82] && class216.field3515[81] && class155.field2459 != 0) {
                                                int var63 = class23.field400 - class155.field2459;
                                                if (var63 < 0) {
                                                    var63 = 0;
                                                } else if (var63 > 3) {
                                                    var63 = 3;
                                                }
                                                class269.method1842(class85.field1176.field4245[0] + class199.field3226, class85.field1176.field4188[0] + class272.field4670, var63, -6810);
                                            }
                                            if (class148.field2263 > 0 && class216.field3515[82] && class216.field3515[81]) {
                                                if (class233.field3815 != -1) {
                                                    class269.method1842(class199.field3226 + class258.field4422, class272.field4670 + class233.field3815, class23.field400, -6810);
                                                }
                                                class10.field131 = 0;
                                                class194.field3098 = 0;
                                            } else if (class194.field3098 == 2) {
                                                if (class233.field3815 != -1) {
                                                    class245.field4102.method1065(255, -67);
                                                    class245.field4102.method1967(class93.field1329, -1303690792);
                                                    class310.field5311++;
                                                    class245.field4102.method1963((byte) -78, class258.field4422 + class199.field3226);
                                                    class245.field4102.method1994(class272.field4670 + class233.field3815, 2921);
                                                    class245.field4102.method1963((byte) -78, class172.field2758);
                                                    class38.field632 = 1;
                                                    class57.field878 = 0;
                                                    class211.field3429 = class193.field3066;
                                                    class279.field4765 = class62.field944;
                                                }
                                                class194.field3098 = 0;
                                            } else if (class10.field131 == 2) {
                                                if (class233.field3815 != -1) {
                                                    class310.field5301++;
                                                    class245.field4102.method1065(12, 123);
                                                    class245.field4102.method1994(class199.field3226 + class258.field4422, 2921);
                                                    class245.field4102.method1963((byte) -78, class272.field4670 + class233.field3815);
                                                    class211.field3429 = class193.field3066;
                                                    class57.field878 = 0;
                                                    class38.field632 = 1;
                                                    class279.field4765 = class62.field944;
                                                }
                                                class10.field131 = 0;
                                            } else if (class233.field3815 != -1 && class194.field3098 == 0 && class10.field131 == 0) {
                                                boolean var64 = class272.method1869(0, class85.field1176.field4188[0], 0, 0, 0, class258.field4422, 0, class85.field1176.field4245[0], 85, class233.field3815, true, 0);
                                                if (var64) {
                                                    class57.field878 = 0;
                                                    class279.field4765 = class62.field944;
                                                    class38.field632 = 1;
                                                    class211.field3429 = class193.field3066;
                                                }
                                            }
                                            class233.field3815 = -1;
                                            class150.method947((byte) -69);
                                            if (class120.field1694 != var52) {
                                                if (var52 != null) {
                                                    class272.method1868(22889, var52);
                                                }
                                                if (class120.field1694 != null) {
                                                    class272.method1868(22889, class120.field1694);
                                                }
                                            }
                                            if (class108.field1542 != var53 && class91.field1278 == class156.field2483) {
                                                if (var53 != null) {
                                                    class272.method1868(22889, var53);
                                                }
                                                if (class108.field1542 != null) {
                                                    class272.method1868(22889, class108.field1542);
                                                }
                                            }
                                            if (class108.field1542 == null) {
                                                if (class91.field1278 > 0) {
                                                    class91.field1278--;
                                                }
                                            } else if (class91.field1278 < class156.field2483) {
                                                class91.field1278++;
                                                if (class91.field1278 == class156.field2483) {
                                                    class272.method1868(22889, class108.field1542);
                                                }
                                            }
                                            if (class28.field485 == 1) {
                                                class288.method1937(true);
                                            } else if (class28.field485 == 2) {
                                                class130.method826(14155);
                                            } else {
                                                class280.method1905(true);
                                            }
                                            for (int var65 = 0; var65 < 5; var65++) {
                                                int var10002 = class97.field1389[var65]++;
                                            }
                                            int var66 = class37.method272(true);
                                            int var67 = class252.method1744((byte) 18);
                                            if (var66 > 15000 && var67 > 15000) {
                                                class34.field560++;
                                                class277.field4738 = 250;
                                                class51.method353(false, 14500);
                                                class245.field4102.method1065(191, 23);
                                            }
                                            if (class314.field5438 != null && class314.field5438.field2980 == 1) {
                                                if (class314.field5438.field2977 != null) {
                                                    class108.method720(class100.field1462, class241.field3942, 59);
                                                }
                                                class100.field1462 = false;
                                                class241.field3942 = null;
                                                class314.field5438 = null;
                                            }
                                            class241.field3948++;
                                            class54.field844++;
                                            if (class54.field844 > 500) {
                                                class54.field844 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x4) == 4) {
                                                    class229.field3737 += class299.field5179;
                                                }
                                                if ((var68 & 0x1) == 1) {
                                                    class9.field118 += class262.field4462;
                                                }
                                                if ((var68 & 0x2) == 2) {
                                                    class265.field4473 += class11.field144;
                                                }
                                            }
                                            class272.field4677++;
                                            if (class229.field3737 < -40) {
                                                class299.field5179 = 1;
                                            }
                                            if (class265.field4473 < -55) {
                                                class11.field144 = 2;
                                            }
                                            if (class229.field3737 > 40) {
                                                class299.field5179 = -1;
                                            }
                                            if (class272.field4677 > 500) {
                                                int var69 = (int) (Math.random() * 8.0D);
                                                if ((var69 & 0x2) == 2) {
                                                    class130.field1980 += class73.field1064;
                                                }
                                                if ((var69 & 0x1) == 1) {
                                                    class202.field3262 += class154.field2452;
                                                }
                                                class272.field4677 = 0;
                                            }
                                            if (class202.field3262 < -60) {
                                                class154.field2452 = 2;
                                            }
                                            if (class202.field3262 > 60) {
                                                class154.field2452 = -2;
                                            }
                                            if (class265.field4473 > 55) {
                                                class11.field144 = -2;
                                            }
                                            if (class130.field1980 < -20) {
                                                class73.field1064 = 1;
                                            }
                                            if (class130.field1980 > 10) {
                                                class73.field1064 = -1;
                                            }
                                            if (class9.field118 < -50) {
                                                class262.field4462 = 2;
                                            }
                                            if (class9.field118 > 50) {
                                                class262.field4462 = -2;
                                            }
                                            if (class241.field3948 > 50) {
                                                class163.field2574++;
                                                class245.field4102.method1065(224, 124);
                                            }
                                            if (class63.field946) {
                                                class251.method1735(true);
                                                class63.field946 = false;
                                            }
                                            try {
                                                if (class265.field4477 != null && class245.field4102.field4946 > 0) {
                                                    class265.field4477.method1237(!arg0, 0, class245.field4102.field4946, class245.field4102.field4950);
                                                    class241.field3948 = 0;
                                                    class245.field4102.field4946 = 0;
                                                }
                                            } catch (IOException var71) {
                                                class234.method1606(22243);
                                            }
                                            return;
                                        }
                                        var61 = var60.field5569;
                                        if (var61.field1934 < 0) {
                                            break;
                                        }
                                        var62 = class11.method54(false, var61.field1836);
                                    } while (var62 == null || var62.field1937 == null || var62.field1937.length <= var61.field1934 || var62.field1937[var61.field1934] != var61);
                                    class64.method412(var60, (byte) -113);
                                }
                            }
                            var58 = var57.field5569;
                            if (var58.field1934 < 0) {
                                break;
                            }
                            var59 = class11.method54(false, var58.field1836);
                        } while (var59 == null || var59.field1937 == null || var58.field1934 >= var59.field1937.length || var59.field1937[var58.field1934] != var58);
                        class64.method412(var57, (byte) -117);
                    }
                }
                var55 = var54.field5569;
                if (var55.field1934 < 0) {
                    break;
                }
                var56 = class11.method54(false, var55.field1836);
            } while (var56 == null || var56.field1937 == null || var56.field1937.length <= var55.field1934 || var56.field1937[var55.field1934] != var55);
            class64.method412(var54, (byte) -91);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILjava/lang/String;)V", line = 1069)
    public static final void method2278(int arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        if (arg0 != -6) {
            field5657 = -0.9731874F;
        }
        System.exit(1);
        field5647++;
    }

    @OriginalMember(owner = "client!km", name = "h", descriptor = "(I)I", line = 1084)
    public static final int method2279(int arg0) {
        field5659++;
        if (arg0 != -12940) {
            method2278(49, (String) null);
        }
        return ((class72.field1048 == 0 ? 0 : 1) << 22) + ((class28.field484 ? 1 : 0) << 19) + ((class236.field3870 ? 1 : 0) << 16) + ((class81.field1131 ? 1 : 0) << 13) + ((class239.field3919 & 0x3) << 11) + ((class211.field3427 ? 1 : 0) << 7) + ((class199.field3209 ? 1 : 0) << 5) + ((class272.field4679 ? 1 : 0) << 3) + ((class87.field1228 & 0x7) - (-((class289.field4906 ? 1 : 0) << 4) - ((class205.field3352 ? 1 : 0) << 6) - ((class15.field209 ? 1 : 0) << 8))) + (((class92.field1307 ? 1 : 0) << 9) - (-((class33.field539 ? 1 : 0) << 10) + -((class100.field1454 ? 1 : 0) << 15)) - (-((class224.field3637 == 0 ? 0 : 1) << 20) + -((class6.field93 == 0 ? 0 : 1) << 21) - (class47.method323() << 23)));
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIII)V", line = 1108)
    public static final void method2280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5652++;
        if (arg2 != -384) {
            return;
        }
        class141.field2164 = arg3;
        class180.field2866 = arg1;
        class48.field756 = arg4;
        class174.field2790 = arg5;
        class239.field3918 = arg0;
        if (class180.field2866 >= 100) {
            int var6 = class48.field756 * 128 + 64;
            int var7 = class239.field3918 * 128 + 64;
            int var8 = class154.method1031(62, var6, class23.field400, var7) - class141.field2164;
            int var9 = var8 - class27.field470;
            int var10 = var7 - class80.field1129;
            int var11 = var6 - class224.field3639;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class223.field3634 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class94.field1346 = (int) (-325.949D * Math.atan2((double) var11, (double) var10)) & 0x7FF;
            if (class223.field3634 < 128) {
                class223.field3634 = 128;
            }
            if (class223.field3634 > 383) {
                class223.field3634 = 383;
            }
        }
        class28.field485 = 2;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V", line = 1156)
    public class324() {
        super(1, true);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZZ)V", line = 1173)
    public static final void method2281(boolean arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field5648++;
        if (class104.field1494 != arg0) {
            class104.field1494 = arg0;
            class172.method1151((byte) 72);
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(Z)V", line = 1190)
    public static void method2282(boolean arg0) {
        field5654 = null;
        field5653 = null;
        field5650 = null;
        field5655 = null;
        if (!arg0) {
            method2281(true, true);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IILhi;)V", line = 1206)
    public final void method52(int arg0, int arg1, class291 arg2) {
        field5656++;
        if (arg1 == 0) {
            this.field5649 = arg2.method2021((byte) 74);
        } else if (arg1 == 1) {
            this.field5658 = arg2.method2021((byte) 74);
        }
        if (arg0 != 31164) {
            this.method53((byte) 28, 110);
        }
    }
}
