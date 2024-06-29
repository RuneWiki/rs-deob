import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class102 {

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Lkm;")
    private class302 field1617 = new class302();

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "Lnl;")
    public static class101 field1624;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "Lt;")
    public static class212 field1625;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Lnb;")
    public static class223 field1621;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "Lkm;")
    private class302 field1619;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "[Lrk;")
    public static class292[] field1620;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lkm;I)V")
    public final void method726(class302 arg0, int arg1) {
        if (arg1 != -15473) {
            this.field1619 = null;
        }
        field1611++;
        if (arg0.field4940 != null) {
            arg0.method2064(20307);
        }
        arg0.field4938 = this.field1617;
        arg0.field4940 = this.field1617.field4940;
        arg0.field4940.field4938 = arg0;
        arg0.field4938.field4940 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static final void method727(byte arg0) {
        if (arg0 < 14) {
            field1625 = null;
        }
        field1616++;
        if (class84.field1342 > 1) {
            class84.field1342--;
            class109.field1686 = class68.field1083;
        }
        if (class221.field3487 > 0) {
            class221.field3487--;
        }
        if (class246.field3873) {
            class246.field3873 = false;
            class240.method1631((byte) -67);
            return;
        }
        for (int var1 = 0; var1 < 100 && class27.method209(118); var1++) {
        }
        if (class238.field3741 != 30) {
            return;
        }
        class246.method1668(class311.field5027, false, 180);
        Object var2 = class7.field166.field3489;
        synchronized (class7.field166.field3489) {
            if (!class237.field3729) {
                class7.field166.field3492 = 0;
            } else if (class295.field4805 != 0 || class7.field166.field3492 >= 40) {
                class11.field211++;
                class311.field5027.method2081(false, 165);
                class311.field5027.method1865(0, 30);
                int var3 = 0;
                int var4 = class311.field5027.field4458;
                for (int var5 = 0; var5 < class7.field166.field3492 && class311.field5027.field4458 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class7.field166.field3491[var5];
                    int var7 = class7.field166.field3493[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class7.field166.field3491[var5] == -1 && class7.field166.field3493[var5] == -1) {
                        var8 = true;
                        var7 = -1;
                        var6 = -1;
                    }
                    if (class21.field401 != var7 || class104.field1635 != var6) {
                        int var9 = var7 - class21.field401;
                        class21.field401 = var7;
                        int var10 = var6 - class104.field1635;
                        class104.field1635 = var6;
                        if (class161.field2625 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class311.field5027.method1824((class161.field2625 << 12) + (var9 << 6) + var10, 28357);
                            class161.field2625 = 0;
                        } else if (class161.field2625 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var10 += 128;
                            var9 += 128;
                            class311.field5027.method1865(class161.field2625 + 128, -99);
                            class311.field5027.method1824((var9 << 8) + var10, 28357);
                            class161.field2625 = 0;
                        } else if (class161.field2625 < 32) {
                            class311.field5027.method1865(class161.field2625 + 192, -118);
                            if (var8) {
                                class311.field5027.method1831(Integer.MIN_VALUE, 119690440);
                            } else {
                                class311.field5027.method1831(var6 << 16 | var7, 119690440);
                            }
                            class161.field2625 = 0;
                        } else {
                            class311.field5027.method1824(class161.field2625 + 57344, 28357);
                            if (var8) {
                                class311.field5027.method1831(Integer.MIN_VALUE, 119690440);
                            } else {
                                class311.field5027.method1831(var7 | var6 << 16, 119690440);
                            }
                            class161.field2625 = 0;
                        }
                    } else if (class161.field2625 < 2047) {
                        class161.field2625++;
                    }
                }
                class311.field5027.method1843(14058, class311.field5027.field4458 - var4);
                if (var3 >= class7.field166.field3492) {
                    class7.field166.field3492 = 0;
                } else {
                    class7.field166.field3492 -= var3;
                    for (int var11 = 0; var11 < class7.field166.field3492; var11++) {
                        class7.field166.field3493[var11] = class7.field166.field3493[var11 + var3];
                        class7.field166.field3491[var11] = class7.field166.field3491[var11 + var3];
                    }
                }
            }
        }
        if (class295.field4805 != 0) {
            class269.field4348++;
            int var12 = class16.field302;
            long var13 = (class117.field1801 - class145.field2331) / 50L;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 65535) {
                var12 = 65535;
            }
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            int var15 = class295.field4806;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            class145.field2331 = class117.field1801;
            byte var16 = 0;
            if (class295.field4805 == 2) {
                var16 = 1;
            }
            class311.field5027.method2081(false, 172);
            class311.field5027.method1869(var15 | var12 << 16, false);
            int var17 = (int) var13;
            class311.field5027.method1844(-1, var16 << 15 | var17);
        }
        if (class207.field3312 > 0) {
            class207.field3312--;
        }
        if (class8.field181 && class207.field3312 <= 0) {
            class8.field181 = false;
            class219.field3440++;
            class207.field3312 = 20;
            class311.field5027.method2081(false, 132);
            class311.field5027.method1844(-1, (int) class226.field3554);
            class311.field5027.method1844(-1, (int) class114.field1742);
        }
        if (class83.field1332 && !class62.field971) {
            class62.field978++;
            class62.field971 = true;
            class311.field5027.method2081(false, 236);
            class311.field5027.method1865(1, -109);
        }
        if (!class83.field1332 && class62.field971) {
            class62.field978++;
            class62.field971 = false;
            class311.field5027.method2081(false, 236);
            class311.field5027.method1865(0, -126);
        }
        if (!class295.field4817) {
            class311.field5027.method2081(false, 130);
            class174.field2912++;
            class311.field5027.method1851((byte) 96, class243.method1656(92));
            class295.field4817 = true;
        }
        if (class269.field4350) {
            class269.field4350 = false;
        } else {
            class271.field4364 /= 2.0F;
        }
        if (class247.field3884) {
            class247.field3884 = false;
        } else {
            class266.field4323 /= 2.0F;
        }
        class108.method760((byte) 90);
        if (class238.field3741 != 30) {
            return;
        }
        class198.method1369(40);
        class186.method1311(2732);
        class23.method187((byte) -44);
        class192.field3139++;
        if (class192.field3139 > 750) {
            class240.method1631((byte) -67);
            return;
        }
        class278.method1894(-28929);
        class71.method492(12963);
        class164.method1158(-128);
        for (int var18 = class192.method1343(true, -1); var18 != -1; var18 = class192.method1343(false, -1)) {
            class43.method291(var18, -3);
            class58.field855[class233.method1609(31, class234.field3680++)] = var18;
        }
        for (class291 var19 = class248.method1688(59); var19 != null; var19 = class248.method1688(44)) {
            int var20 = var19.method2007((byte) -88);
            int var21 = var19.method2006((byte) -113);
            if (var20 == 1) {
                class218.field3433[var21] = var19.field4763;
                class9.field201[class233.method1609(class125.field1989++, 31)] = var21;
            } else if (var20 == 2) {
                class120.field1902[var21] = var19.field4774;
                class149.field2376[class233.method1609(31, class306.field4982++)] = var21;
            } else if (var20 == 3) {
                class248 var42 = class281.method1913(var21, (byte) -62);
                if (!var19.field4774.equals(var42.field4046)) {
                    var42.field4046 = var19.field4774;
                    class111.method776(var42, (byte) 25);
                }
            } else if (var20 == 4) {
                class248 var38 = class281.method1913(var21, (byte) -95);
                int var39 = var19.field4763;
                int var40 = var19.field4768;
                int var41 = var19.field4773;
                if (var38.field4042 != var39 || var38.field4055 != var40 || var38.field3920 != var41) {
                    var38.field4042 = var39;
                    var38.field4055 = var40;
                    var38.field3920 = var41;
                    class111.method776(var38, (byte) 25);
                }
            } else if (var20 == 5) {
                class248 var22 = class281.method1913(var21, (byte) -112);
                if (var19.field4763 != var22.field3940 || var19.field4763 == -1) {
                    var22.field3940 = var19.field4763;
                    var22.field4031 = 0;
                    var22.field3969 = 1;
                    var22.field3927 = 0;
                    class111.method776(var22, (byte) 25);
                }
            } else if (var20 == 6) {
                int var32 = var19.field4763;
                int var33 = (var32 & 0x7CE5) >> 10;
                int var34 = var32 & 0x1F;
                int var35 = (var32 & 0x3E2) >> 5;
                class248 var36 = class281.method1913(var21, (byte) 80);
                int var37 = (var34 << 3) + (var33 << 19) + (var35 << 11);
                if (var36.field3976 != var37) {
                    var36.field3976 = var37;
                    class111.method776(var36, (byte) 25);
                }
            } else if (var20 == 7) {
                class248 var23 = class281.method1913(var21, (byte) -92);
                boolean var24 = var19.field4763 == 1;
                if (var24 != var23.field4023) {
                    var23.field4023 = var24;
                    class111.method776(var23, (byte) 25);
                }
            } else if (var20 == 8) {
                class248 var31 = class281.method1913(var21, (byte) 119);
                if (var19.field4763 != var31.field4035 || var19.field4768 != var31.field4062 || var19.field4773 != var31.field4022) {
                    var31.field4022 = var19.field4773;
                    if (var31.field4049 != -1) {
                        if (var31.field4053 > 0) {
                            var31.field4022 = var31.field4022 * 32 / var31.field4053;
                        } else if (var31.field3911 > 0) {
                            var31.field4022 = var31.field4022 * 32 / var31.field3911;
                        }
                    }
                    var31.field4035 = var19.field4763;
                    var31.field4062 = var19.field4768;
                    class111.method776(var31, (byte) 25);
                }
            } else if (var20 == 9) {
                class248 var30 = class281.method1913(var21, (byte) -77);
                if (var19.field4763 != var30.field4049 || var19.field4768 != var30.field3902) {
                    var30.field3902 = var19.field4768;
                    var30.field4049 = var19.field4763;
                    class111.method776(var30, (byte) 25);
                }
            } else if (var20 == 10) {
                class248 var29 = class281.method1913(var21, (byte) 118);
                if (var19.field4763 != var29.field4047 || var19.field4768 != var29.field3923 || var19.field4773 != var29.field4011) {
                    var29.field4011 = var19.field4773;
                    var29.field4047 = var19.field4763;
                    var29.field3923 = var19.field4768;
                    class111.method776(var29, (byte) 25);
                }
            } else if (var20 == 11) {
                class248 var25 = class281.method1913(var21, (byte) -116);
                var25.field3972 = 0;
                var25.field4037 = var25.field4003 = var19.field4763;
                var25.field3894 = 0;
                var25.field3916 = var25.field4026 = var19.field4768;
                class111.method776(var25, (byte) 25);
            } else if (var20 == 12) {
                class248 var27 = class281.method1913(var21, (byte) -84);
                int var28 = var19.field4763;
                if (var27 != null && var27.field4038 == 0) {
                    if (var27.field3994 - var27.field4057 < var28) {
                        var28 = var27.field3994 - var27.field4057;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                    if (var27.field3953 != var28) {
                        var27.field3953 = var28;
                        class111.method776(var27, (byte) 25);
                    }
                }
            } else if (var20 == 13) {
                class248 var26 = class281.method1913(var21, (byte) 90);
                var26.field3979 = var19.field4763;
            }
        }
        class61.field883++;
        if (class26.field468 != 0) {
            class115.field1750 += 20;
            if (class115.field1750 >= 400) {
                class26.field468 = 0;
            }
        }
        if (class114.field1744 != null) {
            class191.field3124++;
            if (class191.field3124 >= 15) {
                class111.method776(class114.field1744, (byte) 25);
                class114.field1744 = null;
            }
        }
        if (class202.field3270 != null) {
            class111.method776(class202.field3270, (byte) 25);
            if (class287.field4640 > (class57.field828 + 5) || class57.field828 - 5 > class287.field4640 || class55.field797 > (class156.field2494 + 5) || (class156.field2494 - 5) > class55.field797) {
                class17.field310 = true;
            }
            class266.field4321++;
            if (class90.field1400 == 0) {
                if (class17.field310 && class266.field4321 >= 5) {
                    if (class90.field1410 == class202.field3270 && class34.field557 != class218.field3434) {
                        class297.field4851++;
                        class248 var43 = class202.field3270;
                        byte var44 = 0;
                        if (class273.field4393 == 1 && var43.field3957 == 206) {
                            var44 = 1;
                        }
                        if (var43.field4041[class218.field3434] <= 0) {
                            var44 = 0;
                        }
                        if (client.method1126(var43).method178(2875)) {
                            int var45 = class218.field3434;
                            int var46 = class34.field557;
                            var43.field4041[var45] = var43.field4041[var46];
                            var43.field4054[var45] = var43.field4054[var46];
                            var43.field4041[var46] = -1;
                            var43.field4054[var46] = 0;
                        } else if (var44 == 1) {
                            int var47 = class218.field3434;
                            int var48 = class34.field557;
                            while (var47 != var48) {
                                if (var47 < var48) {
                                    var43.method1677(var48 - 1, var48, true);
                                    var48--;
                                } else if (var47 > var48) {
                                    var43.method1677(var48 + 1, var48, true);
                                    var48++;
                                }
                            }
                        } else {
                            var43.method1677(class218.field3434, class34.field557, true);
                        }
                        class311.field5027.method2081(false, 74);
                        class311.field5027.method1823(1617348648, class34.field557);
                        class311.field5027.method1865(var44, -106);
                        class311.field5027.method1851((byte) 79, class202.field3270.field3968);
                        class311.field5027.method1823(1617348648, class218.field3434);
                    }
                } else if ((class298.field4867 == 1 || class206.method1424((byte) 74, class291.field4776 - 1)) && class291.field4776 > 2) {
                    class118.method809(true);
                } else if (class291.field4776 > 0) {
                    class110.method770(false);
                }
                class295.field4805 = 0;
                class202.field3270 = null;
                class191.field3124 = 10;
            }
        }
        class79.field1275 = 0;
        class248 var49 = class85.field1356;
        class85.field1356 = null;
        class124.field1973 = null;
        class254.field4202 = false;
        class113.field1732 = false;
        class248 var50 = class173.field2903;
        class173.field2903 = null;
        while (class76.method549((byte) 100) && class79.field1275 < 128) {
            class263.field4309[class79.field1275] = class290.field4737;
            class21.field394[class79.field1275] = class233.field3645;
            class79.field1275++;
        }
        class132.field2117 = null;
        if (class68.field1089 != -1) {
            class210.method1448(0, -14364, class195.field3161, class68.field1089, 0, 0, 0, class154.field2463);
        }
        class68.field1083++;
        if (class132.field2117 != null) {
            class58.method367(-1);
        }
        while (true) {
            class78 var51;
            class248 var52;
            class248 var53;
            do {
                var51 = (class78) class150.field2389.method1555(0);
                if (var51 == null) {
                    while (true) {
                        class78 var54;
                        class248 var55;
                        class248 var56;
                        do {
                            var54 = (class78) class34.field550.method1555(0);
                            if (var54 == null) {
                                while (true) {
                                    class78 var57;
                                    class248 var58;
                                    class248 var59;
                                    do {
                                        var57 = (class78) class184.field3050.method1555(0);
                                        if (var57 == null) {
                                            if (class132.field2117 == null) {
                                                class154.field2459 = 0;
                                            }
                                            if (class218.field3430 != null) {
                                                class296.method2029(-116);
                                            }
                                            if (class117.field1796 > 0 && class8.field170[82] && class8.field170[81] && class17.field309 != 0) {
                                                int var60 = class214.field3389 - class17.field309;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class85.method608(class217.field3408.field965[0] + class75.field1211, class217.field3408.field956[0] + class145.field2327, (byte) -123, var60);
                                            }
                                            if (class117.field1796 > 0 && class8.field170[82] && class8.field170[81]) {
                                                if (class134.field2179 != -1) {
                                                    class85.method608(class75.field1211 + class134.field2179, class33.field548 + class145.field2327, (byte) -118, class214.field3389);
                                                }
                                                class123.field1959 = 0;
                                                class285.field4620 = 0;
                                            } else if (class285.field4620 == 2) {
                                                if (class134.field2179 != -1) {
                                                    class147.field2356++;
                                                    class311.field5027.method2081(false, 235);
                                                    class311.field5027.method1823(1617348648, class33.field548 + class145.field2327);
                                                    class311.field5027.method1824(class75.field1211 + class134.field2179, 28357);
                                                    class311.field5027.method1844(-1, class243.field3847);
                                                    class311.field5027.method1831(class122.field1940, 119690440);
                                                    class115.field1750 = 0;
                                                    class26.field468 = 1;
                                                    class224.field3521 = class16.field302;
                                                    class40.field610 = class295.field4806;
                                                }
                                                class285.field4620 = 0;
                                            } else if (class123.field1959 == 2) {
                                                if (class134.field2179 != -1) {
                                                    class202.field3265++;
                                                    class311.field5027.method2081(false, 212);
                                                    class311.field5027.method1824(class75.field1211 + class134.field2179, 28357);
                                                    class311.field5027.method1823(1617348648, class33.field548 + class145.field2327);
                                                    class40.field610 = class295.field4806;
                                                    class26.field468 = 1;
                                                    class115.field1750 = 0;
                                                    class224.field3521 = class16.field302;
                                                }
                                                class123.field1959 = 0;
                                            } else if (class134.field2179 != -1 && class285.field4620 == 0 && class123.field1959 == 0) {
                                                int var61 = (class134.field2179 << 1) + 1 - class217.field3408.method101(false) >> 1;
                                                int var62 = (class33.field548 << 1) + 1 - class217.field3408.method101(false) >> 1;
                                                class220.method1498(false, var61, 0, var62);
                                                class224.field3521 = class16.field302;
                                                class40.field610 = class295.field4806;
                                                class26.field468 = 1;
                                                class115.field1750 = 0;
                                                class74.method539(0, class217.field3408.field965[0], 0, var61, var62, 0, true, -3, 0, 0, class217.field3408.field956[0]);
                                            }
                                            class134.field2179 = -1;
                                            class103.method738(-11661);
                                            if (class85.field1356 != var49) {
                                                if (var49 != null) {
                                                    class111.method776(var49, (byte) 25);
                                                }
                                                if (class85.field1356 != null) {
                                                    class111.method776(class85.field1356, (byte) 25);
                                                }
                                            }
                                            if (class173.field2903 != var50 && class224.field3522 == class155.field2471) {
                                                if (var50 != null) {
                                                    class111.method776(var50, (byte) 25);
                                                }
                                                if (class173.field2903 != null) {
                                                    class111.method776(class173.field2903, (byte) 25);
                                                }
                                            }
                                            if (class173.field2903 == null) {
                                                if (class155.field2471 > 0) {
                                                    class155.field2471--;
                                                }
                                            } else if (class155.field2471 < class224.field3522) {
                                                class155.field2471++;
                                                if (class224.field3522 == class155.field2471) {
                                                    class111.method776(class173.field2903, (byte) 25);
                                                }
                                            }
                                            for (int var63 = 0; var63 < 5; var63++) {
                                                int var10002 = class139.field2232[var63]++;
                                            }
                                            int var64 = class250.method1702(127);
                                            int var65 = class253.method1715((byte) 123);
                                            if (var64 > 15000 && var65 > 15000) {
                                                class221.field3487 = 250;
                                                class221.method1505(11819, 14500);
                                                class263.field4297++;
                                                class311.field5027.method2081(false, 103);
                                            }
                                            if (class87.field1368 != null && class87.field1368.field4929 == 1) {
                                                if (class87.field1368.field4930 != null) {
                                                    class168.method1196(class21.field405, class169.field2774, 78);
                                                }
                                                class21.field405 = null;
                                                class87.field1368 = null;
                                                class169.field2774 = false;
                                            }
                                            class270.field4357++;
                                            class122.field1932++;
                                            class164.field2708++;
                                            if (class122.field1932 > 500) {
                                                class122.field1932 = 0;
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x1) == 1) {
                                                    class221.field3478 += class188.field3093;
                                                }
                                                if ((var66 & 0x4) == 4) {
                                                    class117.field1802 += class169.field2772;
                                                }
                                                if ((var66 & 0x2) == 2) {
                                                    class62.field904 += class158.field2546;
                                                }
                                            }
                                            if (class270.field4357 > 500) {
                                                int var67 = (int) (Math.random() * 8.0D);
                                                class270.field4357 = 0;
                                                if ((var67 & 0x2) == 2) {
                                                    class150.field2394 += class59.field864;
                                                }
                                                if ((var67 & 0x1) == 1) {
                                                    class278.field4540 += class157.field2515;
                                                }
                                            }
                                            if (class150.field2394 < -20) {
                                                class59.field864 = 1;
                                            }
                                            if (class117.field1802 < -40) {
                                                class169.field2772 = 1;
                                            }
                                            if (class117.field1802 > 40) {
                                                class169.field2772 = -1;
                                            }
                                            if (class278.field4540 < -60) {
                                                class157.field2515 = 2;
                                            }
                                            if (class278.field4540 > 60) {
                                                class157.field2515 = -2;
                                            }
                                            if (class150.field2394 > 10) {
                                                class59.field864 = -1;
                                            }
                                            if (class62.field904 < -55) {
                                                class158.field2546 = 2;
                                            }
                                            if (class221.field3478 < -50) {
                                                class188.field3093 = 2;
                                            }
                                            if (class62.field904 > 55) {
                                                class158.field2546 = -2;
                                            }
                                            if (class221.field3478 > 50) {
                                                class188.field3093 = -2;
                                            }
                                            if (class164.field2708 > 50) {
                                                class311.field5027.method2081(false, 206);
                                                class191.field3111++;
                                            }
                                            if (class70.field1119) {
                                                class275.method1882(64);
                                                class70.field1119 = false;
                                            }
                                            try {
                                                if (class18.field322 != null && class311.field5027.field4458 > 0) {
                                                    class18.field322.method410(0, class311.field5027.field4441, class311.field5027.field4458, (byte) 93);
                                                    class164.field2708 = 0;
                                                    class311.field5027.field4458 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var68) {
                                                class240.method1631((byte) -67);
                                                return;
                                            }
                                        }
                                        var58 = var57.field1251;
                                        if (var58.field4019 < 0) {
                                            break;
                                        }
                                        var59 = class281.method1913(var58.field3974, (byte) -81);
                                    } while (var59 == null || var59.field4068 == null || var59.field4068.length <= var58.field4019 || var59.field4068[var58.field4019] != var58);
                                    class139.method959((byte) 106, var57);
                                }
                            }
                            var55 = var54.field1251;
                            if (var55.field4019 < 0) {
                                break;
                            }
                            var56 = class281.method1913(var55.field3974, (byte) -93);
                        } while (var56 == null || var56.field4068 == null || var56.field4068.length <= var55.field4019 || var56.field4068[var55.field4019] != var55);
                        class139.method959((byte) 94, var54);
                    }
                }
                var52 = var51.field1251;
                if (var52.field4019 < 0) {
                    break;
                }
                var53 = class281.method1913(var52.field3974, (byte) 113);
            } while (var53 == null || var53.field4068 == null || var52.field4019 >= var53.field4068.length || var53.field4068[var52.field4019] != var52);
            class139.method959((byte) 122, var51);
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
    public static void method728(byte arg0) {
        field1624 = null;
        field1625 = null;
        field1621 = null;
        field1620 = null;
        int var1 = 19 % ((arg0 - 21) / 58);
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(B)Lkm;")
    public final class302 method729(byte arg0) {
        field1623++;
        if (arg0 >= -127) {
            method733((byte) 123);
        }
        class302 var2 = this.field1619;
        if (this.field1617 == var2) {
            this.field1619 = null;
            return null;
        } else {
            this.field1619 = var2.field4938;
            return var2;
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(B)Lkm;")
    public final class302 method730(byte arg0) {
        int var2 = -12 % ((arg0 - 13) / 47);
        field1622++;
        class302 var3 = this.field1617.field4938;
        if (this.field1617 == var3) {
            this.field1619 = null;
            return null;
        } else {
            this.field1619 = var3.field4938;
            return var3;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
    public static final void method731(int arg0, int arg1) {
        field1613++;
        if (arg1 >= -38 || arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class221.method1503(117);
        } else if (arg0 == 2) {
            class34.method253(false);
        } else if (arg0 == 3) {
            class140.method969(-71);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)I")
    public final int method732(int arg0) {
        field1618++;
        int var2 = 0;
        for (class302 var3 = this.field1617.field4938; var3 != this.field1617; var3 = var3.field4938) {
            var2++;
        }
        if (arg0 != 0) {
            method733((byte) -1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(B)V")
    public static final void method733(byte arg0) {
        field1615++;
        int var1 = -12 / ((54 - arg0) / 58);
        class123.field1949.method1873(-7401);
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class102() {
        this.field1617.field4940 = this.field1617;
        this.field1617.field4938 = this.field1617;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLrg;)Lrg;")
    public static final class248 method734(byte arg0, class248 arg1) {
        if (arg0 != 0) {
            return null;
        }
        field1612++;
        class248 var2 = client.method1124(arg1);
        if (var2 == null) {
            var2 = arg1.field3922;
        }
        return var2;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)I")
    public static final int method735(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field1614++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else {
            if (arg2 != 2) {
                method728((byte) -80);
            }
            return var4 == 2 ? 7 - arg3 : -arg0 + 7;
        }
    }
}
