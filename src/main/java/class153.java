import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class153 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "[C")
    public static char[] field2305 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "Llm;")
    public static class210 field2307;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)[Lpj;", line = 6)
    public static final class59[] method1095(int arg0) {
        field2309++;
        class59[] var1 = new class59[class96.field1444];
        for (int var2 = 0; var2 < class96.field1444; var2++) {
            var1[var2] = new class59(class12.field136, class132.field2034, class203.field3039[var2], class184.field2754[var2], class203.field3051[var2], class160.field2403[var2], class205.field3083[var2], class66.field865);
        }
        if (arg0 != -33) {
            field2305 = (char[]) null;
        }
        class10.method49((byte) 87);
        return var1;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZI)V", line = 30)
    public static final void method1096(boolean arg0, int arg1) {
        field2308++;
        if (class96.field1445 == arg0) {
            return;
        }
        class96.field1445 = arg0;
        class217.method1493(arg1 ^ 0x7398);
        if (arg1 != -29665) {
            method1098(-21);
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V", line = 45)
    public static void method1097(int arg0) {
        if (arg0 == 240) {
            field2307 = null;
            field2305 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)V", line = 63)
    public static final void method1098(int arg0) {
        class149.field2244.method2182(false);
        if (arg0 != 0) {
            field2305 = (char[]) null;
        }
        field2306++;
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)V", line = 79)
    public static final void method1099(int arg0) {
        if (class321.field4856 > 1) {
            class56.field712 = class225.field3423;
            class321.field4856--;
        }
        if (class172.field2584 > 0) {
            class172.field2584--;
        }
        field2310++;
        if (class194.field2904) {
            class194.field2904 = false;
            class154.method1101(0);
            return;
        }
        for (int var1 = 0; var1 < 100 && class278.method1941((byte) -58); var1++) {
        }
        if (class293.field4490 != 30) {
            return;
        }
        class106.method747((byte) -105, class234.field3507, 227);
        Object var2 = class320.field4842.field1288;
        synchronized (class320.field4842.field1288) {
            if (!class278.field4236) {
                class320.field4842.field1292 = 0;
            } else if (class253.field3813 != 0 || class320.field4842.field1292 >= 40) {
                class166.field2490++;
                class234.field3507.method28(148, false);
                int var3 = 0;
                class234.field3507.method1813(-126, 0);
                int var4 = class234.field3507.field4025;
                for (int var5 = 0; var5 < class320.field4842.field1292 && class234.field3507.field4025 - var4 < 240; var5++) {
                    int var6 = class320.field4842.field1294[var5];
                    var3++;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class320.field4842.field1293[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class320.field4842.field1294[var5] == -1 && class320.field4842.field1293[var5] == -1) {
                        var6 = -1;
                        var8 = true;
                        var7 = -1;
                    }
                    if (class297.field4548 != var7 || class67.field883 != var6) {
                        int var9 = var6 - class67.field883;
                        class67.field883 = var6;
                        int var10 = var7 - class297.field4548;
                        class297.field4548 = var7;
                        if (class78.field1086 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class234.field3507.method1823((class78.field1086 << 12) + (var10 << 6) + var9, (byte) -120);
                            class78.field1086 = 0;
                        } else if (class78.field1086 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            var9 += 128;
                            var10 += 128;
                            class234.field3507.method1813(-110, class78.field1086 + 128);
                            class234.field3507.method1823((var10 << 8) + var9, (byte) -67);
                            class78.field1086 = 0;
                        } else if (class78.field1086 < 32) {
                            class234.field3507.method1813(34, class78.field1086 + 192);
                            if (var8) {
                                class234.field3507.method1815(122, Integer.MIN_VALUE);
                            } else {
                                class234.field3507.method1815(77, var6 << 16 | var7);
                            }
                            class78.field1086 = 0;
                        } else {
                            class234.field3507.method1823(class78.field1086 + 57344, (byte) -104);
                            if (var8) {
                                class234.field3507.method1815(119, Integer.MIN_VALUE);
                            } else {
                                class234.field3507.method1815(102, var6 << 16 | var7);
                            }
                            class78.field1086 = 0;
                        }
                    } else if (class78.field1086 < 2047) {
                        class78.field1086++;
                    }
                }
                class234.field3507.method1791(-1157288507, class234.field3507.field4025 - var4);
                if (var3 >= class320.field4842.field1292) {
                    class320.field4842.field1292 = 0;
                } else {
                    class320.field4842.field1292 -= var3;
                    for (int var11 = 0; var11 < class320.field4842.field1292; var11++) {
                        class320.field4842.field1293[var11] = class320.field4842.field1293[var3 + var11];
                        class320.field4842.field1294[var11] = class320.field4842.field1294[var11 + var3];
                    }
                }
            }
        }
        if (class253.field3813 != 0) {
            class288.field4344++;
            int var13 = class28.field387;
            long var14 = (class325.field4890 - class73.field950) / 50L;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            class73.field950 = class325.field4890;
            int var16 = class207.field3140;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            byte var17 = 0;
            if (class253.field3813 == 2) {
                var17 = 1;
            }
            class234.field3507.method28(247, false);
            class234.field3507.method1815(97, var13 << 16 | var16);
            int var18 = (int) var14;
            class234.field3507.method1823(var17 << 15 | var18, (byte) -79);
        }
        if (class236.field3547 > 0) {
            class236.field3547--;
        }
        if (class131.field2025) {
            for (int var19 = 0; var19 < class9.field84; var19++) {
                int var20 = class64.field842[var19];
                if (var20 == 98 || var20 == 99 || var20 == 96 || var20 == 97) {
                    class144.field2181 = true;
                    break;
                }
            }
        } else if (class120.field1879[96] || class120.field1879[97] || class120.field1879[98] || class120.field1879[99]) {
            class144.field2181 = true;
        }
        if (class144.field2181 && class236.field3547 <= 0) {
            class144.field2181 = false;
            class236.field3547 = 20;
            class188.field2800++;
            class234.field3507.method28(181, false);
            class234.field3507.method1817(true, class284.field4297);
            class234.field3507.method1823(class234.field3525, (byte) -42);
        }
        if (class58.field780 && !class104.field1643) {
            class299.field4576++;
            class104.field1643 = true;
            class234.field3507.method28(171, false);
            class234.field3507.method1813(86, 1);
        }
        if (!class58.field780 && class104.field1643) {
            class299.field4576++;
            class104.field1643 = false;
            class234.field3507.method28(171, false);
            class234.field3507.method1813(73, 0);
        }
        if (!class250.field3726) {
            class234.field3507.method28(72, false);
            class234.field3507.method1833(-128, class61.method411(true));
            class249.field3706++;
            class250.field3726 = true;
        }
        class284.method1979(-124);
        if (class293.field4490 != 30) {
            return;
        }
        class54.method360(-89);
        class211.method1469(-124);
        class176.method1218((byte) 46);
        class70.field926++;
        if (class70.field926 > 750) {
            class154.method1101(0);
            return;
        }
        class285.method1986(125);
        class228.method1581((byte) -116);
        class301.method2093(0);
        if (class94.field1430 != null) {
            class222.method1554(-16653);
        }
        for (int var21 = class261.method1763((byte) -40, true); var21 != -1; var21 = class261.method1763((byte) -40, false)) {
            class206.method1420((byte) -65, var21);
            class240.field3582[class124.method893(31, class116.field1769++)] = var21;
        }
        class169 var22 = class316.method2168(-18365);
        if (arg0 > -3) {
            field2305 = (char[]) null;
        }
        while (var22 != null) {
            int var23 = var22.method1185(649254432);
            int var24 = var22.method1182(-125);
            if (var23 == 1) {
                class157.field2349[var24] = var22.field2542;
                class176.field2606[class124.method893(class124.field1937++, 31)] = var24;
            } else if (var23 == 2) {
                class314.field4756[var24] = var22.field2527;
                class172.field2580[class124.method893(class234.field3511++, 31)] = var24;
            } else if (var23 == 3) {
                class329 var45 = class80.method541((byte) 96, var24);
                if (!var22.field2527.equals(var45.field5035)) {
                    var45.field5035 = var22.field2527;
                    class247.method1666(var45, -128);
                }
            } else if (var23 == 4) {
                class329 var41 = class80.method541((byte) 96, var24);
                int var42 = var22.field2542;
                int var43 = var22.field2530;
                int var44 = var22.field2543;
                if (var41.field4937 != var42 || var41.field4939 != var43 || var41.field4996 != var44) {
                    var41.field4996 = var44;
                    var41.field4939 = var43;
                    var41.field4937 = var42;
                    class247.method1666(var41, -127);
                }
            } else if (var23 == 5) {
                class329 var40 = class80.method541((byte) 96, var24);
                if (var22.field2542 != var40.field4958 || var22.field2542 == -1) {
                    var40.field4970 = 1;
                    var40.field4986 = 0;
                    var40.field5059 = 0;
                    var40.field4958 = var22.field2542;
                    class247.method1666(var40, -126);
                }
            } else if (var23 == 6) {
                int var34 = var22.field2542;
                int var35 = var34 >> 5 & 0x1F;
                int var36 = var34 >> 10 & 0x1F;
                int var37 = var34 & 0x1F;
                int var38 = (var37 << 3) + (var35 << 11) + (var36 << 19);
                class329 var39 = class80.method541((byte) 96, var24);
                if (var39.field4935 != var38) {
                    var39.field4935 = var38;
                    class247.method1666(var39, -126);
                }
            } else if (var23 == 7) {
                class329 var25 = class80.method541((byte) 96, var24);
                boolean var26 = var22.field2542 == 1;
                if (var25.field5026 != var26) {
                    var25.field5026 = var26;
                    class247.method1666(var25, -127);
                }
            } else if (var23 == 8) {
                class329 var33 = class80.method541((byte) 96, var24);
                if (var22.field2542 != var33.field5097 || var22.field2530 != var33.field4961 || var22.field2543 != var33.field5041) {
                    var33.field4961 = var22.field2530;
                    var33.field5097 = var22.field2542;
                    var33.field5041 = var22.field2543;
                    if (var33.field5089 != -1) {
                        if (var33.field5079 > 0) {
                            var33.field5041 = var33.field5041 * 32 / var33.field5079;
                        } else if (var33.field4971 > 0) {
                            var33.field5041 = var33.field5041 * 32 / var33.field4971;
                        }
                    }
                    class247.method1666(var33, -125);
                }
            } else if (var23 == 9) {
                class329 var27 = class80.method541((byte) 96, var24);
                if (var22.field2542 != var27.field5089 || var22.field2530 != var27.field5045) {
                    var27.field5089 = var22.field2542;
                    var27.field5045 = var22.field2530;
                    class247.method1666(var27, -126);
                }
            } else if (var23 == 10) {
                class329 var32 = class80.method541((byte) 96, var24);
                if (var22.field2542 != var32.field4997 || var22.field2530 != var32.field5099 || var22.field2543 != var32.field5084) {
                    var32.field5099 = var22.field2530;
                    var32.field4997 = var22.field2542;
                    var32.field5084 = var22.field2543;
                    class247.method1666(var32, -128);
                }
            } else if (var23 == 11) {
                class329 var28 = class80.method541((byte) 96, var24);
                var28.field5057 = 0;
                var28.field5067 = 0;
                var28.field4929 = var28.field4998 = var22.field2542;
                var28.field4962 = var28.field5042 = var22.field2530;
                class247.method1666(var28, -128);
            } else if (var23 == 12) {
                class329 var29 = class80.method541((byte) 96, var24);
                int var30 = var22.field2542;
                if (var29 != null && var29.field5066 == 0) {
                    if ((var29.field4932 - var29.field4994) < var30) {
                        var30 = var29.field4932 - var29.field4994;
                    }
                    if (var30 < 0) {
                        var30 = 0;
                    }
                    if (var29.field5023 != var30) {
                        var29.field5023 = var30;
                        class247.method1666(var29, -126);
                    }
                }
            } else if (var23 == 13) {
                class329 var31 = class80.method541((byte) 96, var24);
                var31.field4953 = var22.field2542;
            }
            var22 = class316.method2168(-18365);
        }
        if (class213.field3233 != 0) {
            class292.field4454 += 20;
            if (class292.field4454 >= 400) {
                class213.field3233 = 0;
            }
        }
        class288.field4352++;
        if (class113.field1743 != null) {
            class184.field2746++;
            if (class184.field2746 >= 15) {
                class247.method1666(class113.field1743, -126);
                class113.field1743 = null;
            }
        }
        if (class191.field2852 != null) {
            class247.method1666(class191.field2852, -128);
            if ((class147.field2215 + 5) < class132.field2036 || (class147.field2215 - 5) > class132.field2036 || class69.field910 + 5 < class237.field3557 || class237.field3557 < class69.field910 - 5) {
                class179.field2652 = true;
            }
            class213.field3235++;
            if (class183.field2744 == 0) {
                if (class179.field2652 && class213.field3235 >= 5) {
                    if (class78.field1084 == class191.field2852 && class35.field436 != class304.field4634) {
                        class124.field1933++;
                        byte var46 = 0;
                        class329 var47 = class191.field2852;
                        if (class251.field3750 == 1 && var47.field5032 == 206) {
                            var46 = 1;
                        }
                        if (var47.field4995[class35.field436] <= 0) {
                            var46 = 0;
                        }
                        if (client.method902(var47).method139(11442)) {
                            int var50 = class35.field436;
                            int var51 = class304.field4634;
                            var47.field4995[var50] = var47.field4995[var51];
                            var47.field4999[var50] = var47.field4999[var51];
                            var47.field4995[var51] = -1;
                            var47.field4999[var51] = 0;
                        } else if (var46 == 1) {
                            int var48 = class35.field436;
                            int var49 = class304.field4634;
                            while (var48 != var49) {
                                if (var48 < var49) {
                                    var47.method2242(var49, -87, var49 - 1);
                                    var49--;
                                } else if (var48 > var49) {
                                    var47.method2242(var49, -84, var49 + 1);
                                    var49++;
                                }
                            }
                        } else {
                            var47.method2242(class304.field4634, -84, class35.field436);
                        }
                        class234.field3507.method28(228, false);
                        class234.field3507.method1823(class304.field4634, (byte) -78);
                        class234.field3507.method1837(28160, class35.field436);
                        class234.field3507.method1843(-1, var46);
                        class234.field3507.method1798(class191.field2852.field5086, 89);
                    }
                } else if ((class226.field3439 == 1 || class291.method2035((byte) 74, class190.field2829 - 1)) && class190.field2829 > 2) {
                    class281.method1963(true);
                } else if (class190.field2829 > 0) {
                    class298.method2076(false);
                }
                class191.field2852 = null;
                class253.field3813 = 0;
                class184.field2746 = 10;
            }
        }
        class194.field2898 = false;
        class9.field84 = 0;
        class329 var52 = class38.field469;
        class329 var53 = class69.field918;
        class185.field2762 = false;
        class287.field4339 = null;
        class69.field918 = null;
        class38.field469 = null;
        while (class295.method2060((byte) 112) && class9.field84 < 128) {
            class64.field842[class9.field84] = class64.field850;
            class281.field4266[class9.field84] = class329.field4948;
            class9.field84++;
        }
        class94.field1430 = null;
        if (class123.field1926 != -1) {
            class145.method1034(class136.field2071, class123.field1926, 1908, 0, 0, 0, 0, class251.field3747);
        }
        class225.field3423++;
        while (true) {
            class286 var54;
            class329 var55;
            class329 var56;
            do {
                var54 = (class286) class217.field3302.method1114(-13454);
                if (var54 == null) {
                    while (true) {
                        class286 var57;
                        class329 var58;
                        class329 var59;
                        do {
                            var57 = (class286) class287.field4335.method1114(-13454);
                            if (var57 == null) {
                                while (true) {
                                    class286 var60;
                                    class329 var61;
                                    class329 var62;
                                    do {
                                        var60 = (class286) class211.field3202.method1114(-13454);
                                        if (var60 == null) {
                                            if (class94.field1430 == null) {
                                                class78.field1085 = 0;
                                            }
                                            if (class145.field2197 != null) {
                                                class159.method1125(-28222);
                                            }
                                            if (class192.field2863 > 0 && class120.field1879[82] && class120.field1879[81] && class11.field117 != 0) {
                                                int var63 = class180.field2697 - class11.field117;
                                                if (var63 < 0) {
                                                    var63 = 0;
                                                } else if (var63 > 3) {
                                                    var63 = 3;
                                                }
                                                class159.method1129(class114.field1750.field1541[0] + class217.field3309, var63, class189.field2807 + class114.field1750.field1516[0], (byte) -110);
                                            }
                                            if (class192.field2863 > 0 && class120.field1879[82] && class120.field1879[81]) {
                                                if (class41.field495 != -1) {
                                                    class159.method1129(class41.field495 + class217.field3309, class180.field2697, class189.field2807 + class190.field2826, (byte) -127);
                                                }
                                                class283.field4281 = 0;
                                                class10.field95 = 0;
                                            } else if (class10.field95 == 2) {
                                                if (class41.field495 != -1) {
                                                    class177.field2621++;
                                                    class234.field3507.method28(69, false);
                                                    class234.field3507.method1815(86, class115.field1762);
                                                    class234.field3507.method1837(28160, class198.field2977);
                                                    class234.field3507.method1817(true, class190.field2826 + class189.field2807);
                                                    class234.field3507.method1823(class41.field495 + class217.field3309, (byte) -67);
                                                    class55.field688 = class28.field387;
                                                    class292.field4454 = 0;
                                                    class213.field3233 = 1;
                                                    class21.field261 = class207.field3140;
                                                }
                                                class10.field95 = 0;
                                            } else if (class283.field4281 == 2) {
                                                if (class41.field495 != -1) {
                                                    class234.field3507.method28(32, false);
                                                    class3.field17++;
                                                    class234.field3507.method1837(28160, class41.field495 + class217.field3309);
                                                    class234.field3507.method1841(113, class190.field2826 + class189.field2807);
                                                    class21.field261 = class207.field3140;
                                                    class55.field688 = class28.field387;
                                                    class213.field3233 = 1;
                                                    class292.field4454 = 0;
                                                }
                                                class283.field4281 = 0;
                                            } else if (class41.field495 != -1 && class10.field95 == 0 && class283.field4281 == 0) {
                                                boolean var64 = class55.method366(false, class114.field1750.field1541[0], 0, 0, 0, class114.field1750.field1516[0], class41.field495, 0, class190.field2826, 0, 0, true);
                                                if (var64) {
                                                    class55.field688 = class28.field387;
                                                    class21.field261 = class207.field3140;
                                                    class213.field3233 = 1;
                                                    class292.field4454 = 0;
                                                }
                                            }
                                            class41.field495 = -1;
                                            class192.method1329((byte) 88);
                                            if (class38.field469 != var52) {
                                                if (var52 != null) {
                                                    class247.method1666(var52, -124);
                                                }
                                                if (class38.field469 != null) {
                                                    class247.method1666(class38.field469, -126);
                                                }
                                            }
                                            if (class69.field918 != var53 && class81.field1144 == class273.field4190) {
                                                if (var53 != null) {
                                                    class247.method1666(var53, -128);
                                                }
                                                if (class69.field918 != null) {
                                                    class247.method1666(class69.field918, -127);
                                                }
                                            }
                                            if (class69.field918 == null) {
                                                if (class81.field1144 > 0) {
                                                    class81.field1144--;
                                                }
                                            } else if (class273.field4190 > class81.field1144) {
                                                class81.field1144++;
                                                if (class81.field1144 == class273.field4190) {
                                                    class247.method1666(class69.field918, -127);
                                                }
                                            }
                                            if (class56.field710 == 1) {
                                                class11.method65((byte) -123);
                                            } else if (class56.field710 == 2) {
                                                class180.method1249(-64);
                                            } else {
                                                class171.method1193(0);
                                            }
                                            for (int var65 = 0; var65 < 5; var65++) {
                                                int var10002 = class140.field2120[var65]++;
                                            }
                                            int var66 = class68.method452(122);
                                            int var67 = class166.method1166((byte) -81);
                                            if (var66 > 15000 && var67 > 15000) {
                                                class204.field3057++;
                                                class172.field2584 = 250;
                                                class239.method1626(14500, -1714174746);
                                                class234.field3507.method28(214, false);
                                            }
                                            if (class213.field3229 != null && class213.field3229.field3456 == 1) {
                                                if (class213.field3229.field3452 != null) {
                                                    class97.method687(3, class268.field4116, class58.field741);
                                                }
                                                class58.field741 = false;
                                                class268.field4116 = null;
                                                class213.field3229 = null;
                                            }
                                            class54.field681++;
                                            class207.field3139++;
                                            class278.field4228++;
                                            if (class207.field3139 > 500) {
                                                class207.field3139 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x2) == 2) {
                                                    class223.field3397 += class241.field3589;
                                                }
                                                if ((var68 & 0x4) == 4) {
                                                    class193.field2890 += class233.field3502;
                                                }
                                                if ((var68 & 0x1) == 1) {
                                                    class9.field79 += class184.field2752;
                                                }
                                            }
                                            if (class223.field3397 < -55) {
                                                class241.field3589 = 2;
                                            }
                                            if (class223.field3397 > 55) {
                                                class241.field3589 = -2;
                                            }
                                            if (class278.field4228 > 500) {
                                                class278.field4228 = 0;
                                                int var69 = (int) (Math.random() * 8.0D);
                                                if ((var69 & 0x2) == 2) {
                                                    class178.field2641 += class114.field1754;
                                                }
                                                if ((var69 & 0x1) == 1) {
                                                    class160.field2401 += class172.field2582;
                                                }
                                            }
                                            if (class193.field2890 < -40) {
                                                class233.field3502 = 1;
                                            }
                                            if (class160.field2401 < -60) {
                                                class172.field2582 = 2;
                                            }
                                            if (class160.field2401 > 60) {
                                                class172.field2582 = -2;
                                            }
                                            if (class9.field79 < -50) {
                                                class184.field2752 = 2;
                                            }
                                            if (class178.field2641 < -20) {
                                                class114.field1754 = 1;
                                            }
                                            if (class178.field2641 > 10) {
                                                class114.field1754 = -1;
                                            }
                                            if (class193.field2890 > 40) {
                                                class233.field3502 = -1;
                                            }
                                            if (class9.field79 > 50) {
                                                class184.field2752 = -2;
                                            }
                                            if (class54.field681 > 50) {
                                                class123.field1922++;
                                                class234.field3507.method28(220, false);
                                            }
                                            if (class241.field3588) {
                                                class151.method1089((byte) -126);
                                                class241.field3588 = false;
                                            }
                                            try {
                                                if (class168.field2517 != null && class234.field3507.field4025 > 0) {
                                                    class168.field2517.method1134(class234.field3507.field3986, true, class234.field3507.field4025, 0);
                                                    class54.field681 = 0;
                                                    class234.field3507.field4025 = 0;
                                                }
                                            } catch (IOException var71) {
                                                class154.method1101(0);
                                            }
                                            return;
                                        }
                                        var61 = var60.field4330;
                                        if (var61.field5040 < 0) {
                                            break;
                                        }
                                        var62 = class80.method541((byte) 96, var61.field5091);
                                    } while (var62 == null || var62.field4964 == null || var61.field5040 >= var62.field4964.length || var62.field4964[var61.field5040] != var61);
                                    class9.method39(var60, 6514);
                                }
                            }
                            var58 = var57.field4330;
                            if (var58.field5040 < 0) {
                                break;
                            }
                            var59 = class80.method541((byte) 96, var58.field5091);
                        } while (var59 == null || var59.field4964 == null || var58.field5040 >= var59.field4964.length || var59.field4964[var58.field5040] != var58);
                        class9.method39(var57, 6514);
                    }
                }
                var55 = var54.field4330;
                if (var55.field5040 < 0) {
                    break;
                }
                var56 = class80.method541((byte) 96, var55.field5091);
            } while (var56 == null || var56.field4964 == null || var56.field4964.length <= var55.field5040 || var56.field4964[var55.field5040] != var55);
            class9.method39(var54, 6514);
        }
    }
}
