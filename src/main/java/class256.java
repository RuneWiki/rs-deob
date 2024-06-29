import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class256 extends class93 {

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "Ljava/lang/Object;")
    private Object field4173;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "[I")
    public static int[] field4176 = new int[32];

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "Laj;")
    public static class116 field4177;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "[I")
    public static int[] field4178;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)Leh;")
    public static final class101 method1690(int arg0) {
        class101 var1 = new class101(34);
        var1.method682(11, 22555);
        field4184++;
        var1.method682(class286.field4518, arg0 + 22555);
        var1.method682(class277.field4434 ? 1 : 0, arg0 ^ 0x581B);
        var1.method682(class280.field4459 ? 1 : 0, arg0 + 22555);
        var1.method682(class172.field2828 ? 1 : 0, 22555);
        var1.method682(class239.field3932 ? 1 : 0, 22555);
        var1.method682(class11.field156 ? 1 : 0, 22555);
        var1.method682(class22.field338 ? 1 : 0, arg0 + 22555);
        var1.method682(class255.field4168 ? 1 : 0, 22555);
        var1.method682(class188.field3051 ? 1 : 0, arg0 ^ 0x581B);
        var1.method682(class24.field379, 22555);
        if (arg0 != 0) {
            field4178 = null;
        }
        var1.method682(class49.field848 ? 1 : 0, arg0 + 22555);
        var1.method682(class11.field164 ? 1 : 0, 22555);
        var1.method682(class103.field1816 ? 1 : 0, 22555);
        var1.method682(class139.field2403, arg0 + 22555);
        var1.method682(class61.field1069 ? 1 : 0, 22555);
        var1.method682(class10.field121, arg0 ^ 0x581B);
        var1.method682(class50.field872, 22555);
        var1.method682(class196.field3167, 22555);
        var1.method639(class77.field1245, arg0 ^ 0x3BA3);
        var1.method639(class87.field1560, 15267);
        var1.method682(class32.method216(), 22555);
        var1.method698(-104, class157.field2627);
        var1.method682(class52.field912, 22555);
        var1.method682(class165.field2711 ? 1 : 0, 22555);
        var1.method682(class173.field2852 ? 1 : 0, arg0 ^ 0x581B);
        var1.method682(class103.field1818, 22555);
        var1.method682(class159.field2660 ? 1 : 0, 22555);
        var1.method682(class261.field4256 ? 1 : 0, arg0 ^ 0x581B);
        return var1;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)V")
    public static final void method1691(byte arg0) {
        if (arg0 != 4) {
            return;
        }
        if (class253.field4140 != null) {
            class80 var1 = class253.field4140;
            synchronized (class253.field4140) {
                class253.field4140 = null;
            }
        }
        field4175++;
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)Z")
    public final boolean method602(int arg0) {
        field4185++;
        if (arg0 < 117) {
            method1690(-5);
        }
        return false;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)Z")
    public static final boolean method1692(boolean arg0) throws IOException {
        field4180++;
        if (class194.field3131 == null) {
            return false;
        }
        int var1 = class194.field3131.method1386(true);
        if (var1 == 0) {
            return false;
        }
        if (class87.field1558 == -1) {
            class194.field3131.method1390(1, 0, class248.field4058.field1730, true);
            class248.field4058.field1762 = 0;
            class87.field1558 = class248.field4058.method204(8);
            var1--;
            class101.field1747 = class155.field2600[class87.field1558];
        }
        if (class101.field1747 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class194.field3131.method1390(1, 0, class248.field4058.field1730, true);
            class101.field1747 = class248.field4058.field1730[0] & 0xFF;
            var1--;
        }
        if (class101.field1747 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class194.field3131.method1390(2, 0, class248.field4058.field1730, arg0);
            class248.field4058.field1762 = 0;
            var1 -= 2;
            class101.field1747 = class248.field4058.method677(!arg0);
        }
        if (class101.field1747 > var1) {
            return false;
        }
        class248.field4058.field1762 = 0;
        class194.field3131.method1390(class101.field1747, 0, class248.field4058.field1730, arg0);
        class295.field4694 = class211.field3564;
        class114.field2058 = 0;
        class211.field3564 = class248.field4080;
        class248.field4080 = class87.field1558;
        if (class87.field1558 == 247) {
            long var2 = class248.field4058.method694(false);
            class248.field4058.method646(79);
            long var4 = class248.field4058.method694(!arg0);
            long var6 = (long) class248.field4058.method677(false);
            long var8 = (long) class248.field4058.method658(22292);
            long var10 = (var6 << 32) + var8;
            int var12 = class248.field4058.method669((byte) 36);
            boolean var13 = false;
            int var14 = class248.field4058.method677(!arg0);
            int var15 = 0;
            label1245: while (true) {
                if (var15 >= 100) {
                    if (var12 <= 1) {
                        for (int var16 = 0; var16 < class90.field1589; var16++) {
                            if (class237.field3906[var16] == var2) {
                                var13 = true;
                                break label1245;
                            }
                        }
                    }
                    break;
                }
                if (class293.field4676[var15] == var10) {
                    var13 = true;
                    break;
                }
                var15++;
            }
            if (!var13 && class126.field2211 == 0) {
                class293.field4676[class145.field2475] = var10;
                class145.field2475 = (class145.field2475 + 1) % 100;
                String var17 = class113.method795(var14, 237).method838(class248.field4058, (byte) 49);
                if (var12 == 2 || var12 == 3) {
                    class286.method1909((byte) 94, var17, var14, class21.method146(var4, (byte) -109), "<img=1>" + class21.method146(var2, (byte) 79), 20);
                } else if (var12 == 1) {
                    class286.method1909((byte) 67, var17, var14, class21.method146(var4, (byte) -120), "<img=0>" + class21.method146(var2, (byte) -107), 20);
                } else {
                    class286.method1909((byte) 53, var17, var14, class21.method146(var4, (byte) -118), class21.method146(var2, (byte) 95), 20);
                }
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 198) {
            int var18 = class248.field4058.method691((byte) 127);
            int var19 = class248.field4058.method696((byte) 102);
            int var20 = class248.field4058.method669((byte) 36);
            if (class147.method1012(var18, 1)) {
                class75.method460((byte) -45, var19, var20);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 221) {
            int var21 = class248.field4058.method696((byte) 102);
            int var22 = class248.field4058.method691((byte) 117);
            if (class147.method1012(var22, 1)) {
                int var23 = 0;
                if (class273.field4378.field4592 != null) {
                    var23 = class273.field4378.field4592.method153(90);
                }
                class76.method466(var23, (byte) 86, -1, 3, var21);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 210) {
            int var24 = class248.field4058.method641(2);
            if (var24 == 65535) {
                var24 = -1;
            }
            int var25 = class248.field4058.method657(0);
            int var26 = var25 & 0x3;
            int var27 = var25 >> 2;
            int var28 = class145.field2483[var27];
            int var29 = class248.field4058.method652((byte) 83);
            int var30 = var29 & 0x3FFF;
            int var31 = (var29 & 0x31705819) >> 28;
            int var32 = var30 - class255.field4162;
            int var33 = (var29 & 0xFFFDA69) >> 14;
            int var34 = var33 - class126.field2206;
            class154.method1052(var31, !arg0, var27, var28, var32, var34, var24, var26);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 116) {
            int var35 = class248.field4058.method657(0);
            int var36 = class248.field4058.method691((byte) 109);
            class106.method720(var36, 0, var35);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 25) {
            int var37 = class248.field4058.method655((byte) 92);
            int var38 = class248.field4058.method693(false);
            int var39 = class248.field4058.method677(false);
            int var40 = class248.field4058.method691((byte) 110);
            int var41 = class248.field4058.method693(false);
            if (class147.method1012(var38, 1)) {
                class101.method680(var39, (byte) 111, var40, var41, var37);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 47) {
            int var42 = class248.field4058.method641(2);
            int var43 = class248.field4058.method670(28019224);
            if (var42 == 65535) {
                var42 = -1;
            }
            class111.method769(var43, (byte) 1, var42);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 223) {
            int var44 = class248.field4058.method685(false);
            int var45 = class248.field4058.method641(2);
            int var46 = class248.field4058.method670(28019224);
            if (var45 == 65535) {
                var45 = -1;
            }
            class195.method1284(var46, (byte) 101, var45, var44);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 231) {
            class55.method346(class127.field2238, class248.field4058, 0, class101.field1747);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 143) {
            long var47 = class248.field4058.method694(false);
            int var49 = class248.field4058.method677(false);
            boolean var50 = false;
            if ((Long.MIN_VALUE & var47) != 0L) {
                var50 = true;
            }
            byte var51 = class248.field4058.method646(94);
            if (var50) {
                if (class139.field2402 == 0) {
                    class87.field1558 = -1;
                    return true;
                }
                boolean var52 = false;
                long var53 = var47 & Long.MAX_VALUE;
                int var55;
                for (var55 = 0; var55 < class139.field2402 && (class182.field2972[var55].field1515 != var53 || class182.field2972[var55].field1576 != var49); var55++) {
                }
                if (var55 < class139.field2402) {
                    while (var55 < class139.field2402 - 1) {
                        class182.field2972[var55] = class182.field2972[var55 + 1];
                        var55++;
                    }
                    class139.field2402--;
                    class182.field2972[class139.field2402] = null;
                }
            } else {
                String var56 = class248.field4058.method662((byte) 1);
                class88 var57 = new class88();
                var57.field1515 = var47;
                var57.field1574 = class21.method145(var57.field1515, 32481);
                var57.field1567 = var51;
                var57.field1576 = var49;
                var57.field1570 = var56;
                int var58;
                for (var58 = class139.field2402 - 1; var58 >= 0; var58--) {
                    int var59 = class182.field2972[var58].field1574.compareTo(var57.field1574);
                    if (var59 == 0) {
                        class182.field2972[var58].field1576 = var49;
                        class182.field2972[var58].field1567 = var51;
                        class182.field2972[var58].field1570 = var56;
                        class240.field3939 = class222.field3746;
                        if (class171.field2811 == var47) {
                            class292.field4662 = var51;
                        }
                        class87.field1558 = -1;
                        return true;
                    }
                    if (var59 < 0) {
                        break;
                    }
                }
                if (class139.field2402 >= class182.field2972.length) {
                    class87.field1558 = -1;
                    return true;
                }
                for (int var60 = class139.field2402 - 1; var60 > var58; var60--) {
                    class182.field2972[var60 + 1] = class182.field2972[var60];
                }
                if (class139.field2402 == 0) {
                    class182.field2972 = new class88[100];
                }
                class182.field2972[var58 + 1] = var57;
                class139.field2402++;
                if (class171.field2811 == var47) {
                    class292.field4662 = var51;
                }
            }
            class87.field1558 = -1;
            class240.field3939 = class222.field3746;
            return true;
        } else if (class87.field1558 == 93 || class87.field1558 == 79 || class87.field1558 == 37 || class87.field1558 == 183 || class87.field1558 == 91 || class87.field1558 == 237 || class87.field1558 == 11 || class87.field1558 == 120 || class87.field1558 == 153 || class87.field1558 == 60 || class87.field1558 == 220 || class87.field1558 == 110 || class87.field1558 == 8 || class87.field1558 == 43) {
            class152.method1042(-91);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 234) {
            long var61 = class248.field4058.method694(false);
            class248.field4058.method646(-71);
            long var63 = class248.field4058.method694(false);
            long var65 = (long) class248.field4058.method677(false);
            long var67 = (long) class248.field4058.method658(22292);
            int var69 = class248.field4058.method669((byte) 36);
            boolean var70 = false;
            long var71 = (var65 << 32) + var67;
            int var73 = 0;
            label1314: while (true) {
                if (var73 >= 100) {
                    if (var69 <= 1) {
                        if ((!class66.field1108 || class125.field2196) && !class124.field2186) {
                            for (int var74 = 0; var74 < class90.field1589; var74++) {
                                if (class237.field3906[var74] == var61) {
                                    var70 = true;
                                    break label1314;
                                }
                            }
                        } else {
                            var70 = true;
                        }
                    }
                    break;
                }
                if (class293.field4676[var73] == var71) {
                    var70 = true;
                    break;
                }
                var73++;
            }
            if (!var70 && class126.field2211 == 0) {
                class293.field4676[class145.field2475] = var71;
                class145.field2475 = (class145.field2475 + 1) % 100;
                String var75 = class244.method1625(class190.method1247(class50.method304(class248.field4058, 32767), -60));
                if (var69 == 2 || var69 == 3) {
                    class205.method1357("<img=1>" + class21.method146(var61, (byte) 108), class21.method146(var63, (byte) -128), 9, -126, var75);
                } else if (var69 == 1) {
                    class205.method1357("<img=0>" + class21.method146(var61, (byte) -102), class21.method146(var63, (byte) -116), 9, 1, var75);
                } else {
                    class205.method1357(class21.method146(var61, (byte) 50), class21.method146(var63, (byte) -107), 9, 12, var75);
                }
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 176) {
            int var76 = class248.field4058.method689(-117);
            int var77 = class248.field4058.method642(-21513);
            int var78 = class248.field4058.method696((byte) 102);
            int var79 = class248.field4058.method693(!arg0);
            if (class147.method1012(var79, 1)) {
                class147.method1016(var77, var76, var78, 94);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 65) {
            int var80 = class248.field4058.method677(false);
            int var81 = class248.field4058.method638(0);
            int var82 = class248.field4058.method691((byte) 120);
            class141 var83 = class42.field625[var82];
            if (var83 != null) {
                class113.method793(var83, (byte) 123, var80, var81);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 196) {
            int var84 = class248.field4058.method693(false);
            int var85 = class248.field4058.method696((byte) 102);
            class106.method720(var84, 0, var85);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 121) {
            class144.method1002(class248.field4058.method662((byte) 1), (byte) -119);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 213) {
            if (class101.field1747 == 0) {
                class66.field1109 = class55.field962;
            } else {
                class66.field1109 = class248.field4058.method662((byte) 1);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 127) {
            class21.field326 = class248.field4058.method657(0);
            class93.field1635 = class248.field4058.method657(0);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 113) {
            int var86 = class248.field4058.method655((byte) 99);
            int var87 = class248.field4058.method677(false);
            if (var86 < -70000) {
                var87 += 32768;
            }
            class46 var88;
            if (var86 < 0) {
                var88 = null;
            } else {
                var88 = class108.method760(-29533, var86);
            }
            while (class101.field1747 > class248.field4058.field1762) {
                int var89 = class248.field4058.method692(27029);
                int var90 = 0;
                int var91 = class248.field4058.method677(false);
                if (var91 != 0) {
                    var90 = class248.field4058.method669((byte) 36);
                    if (var90 == 255) {
                        var90 = class248.field4058.method655((byte) 47);
                    }
                }
                if (var88 != null && var89 >= 0 && var88.field774.length > var89) {
                    var88.field774[var89] = var91;
                    var88.field711[var89] = var90;
                }
                class97.method616(var89, (byte) -25, var90, var87, var91 - 1);
            }
            if (var88 != null) {
                class79.method516(-373, var88);
            }
            class270.method1776((byte) -89);
            class225.field3787[class113.method791(class136.field2386++, 31)] = class113.method791(32767, var87);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 44) {
            int var92 = class248.field4058.method669((byte) 36);
            int var93 = var92 >> 5;
            int var94 = var92 & 0x1F;
            if (var94 == 0) {
                class26.field398[var93] = null;
                class87.field1558 = -1;
                return true;
            }
            class280 var95 = new class280();
            var95.field4460 = var94;
            var95.field4460 = var92 & 0x3F;
            var95.field4450 = class248.field4058.method669((byte) 36);
            if (var95.field4450 >= 0 && class194.field3133.length > var95.field4450) {
                if (var95.field4460 == 1 || var95.field4460 == 10) {
                    var95.field4454 = class248.field4058.method677(false);
                    class248.field4058.field1762 += 5;
                } else if (var95.field4460 >= 2 && var95.field4460 <= 6) {
                    if (var95.field4460 == 2) {
                        var95.field4456 = 64;
                        var95.field4457 = 64;
                    }
                    if (var95.field4460 == 3) {
                        var95.field4456 = 0;
                        var95.field4457 = 64;
                    }
                    if (var95.field4460 == 4) {
                        var95.field4456 = 128;
                        var95.field4457 = 64;
                    }
                    if (var95.field4460 == 5) {
                        var95.field4456 = 64;
                        var95.field4457 = 0;
                    }
                    if (var95.field4460 == 6) {
                        var95.field4456 = 64;
                        var95.field4457 = 128;
                    }
                    var95.field4460 = 2;
                    var95.field4451 = class248.field4058.method677(false);
                    var95.field4453 = class248.field4058.method677(false);
                    var95.field4462 = class248.field4058.method669((byte) 36);
                    var95.field4452 = class248.field4058.method677(false);
                }
                var95.field4455 = class248.field4058.method677(false);
                if (var95.field4455 == 65535) {
                    var95.field4455 = -1;
                }
                class26.field398[var93] = var95;
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 64) {
            int var96 = class248.field4058.method641(2);
            byte var97 = class248.field4058.method650(100);
            class156.method1070(-126, var96, var97);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 202) {
            class93.field1635 = class248.field4058.method657(0);
            class21.field326 = class248.field4058.method657(0);
            for (int var98 = class93.field1635; var98 < class93.field1635 + 8; var98++) {
                for (int var100 = class21.field326; var100 < (class21.field326 + 8); var100++) {
                    if (class255.field4163[class176.field2886][var98][var100] != null) {
                        class255.field4163[class176.field2886][var98][var100] = null;
                        class6.method35(var98, var100, -126);
                    }
                }
            }
            for (class103 var99 = (class103) class49.field849.method379(6347); var99 != null; var99 = (class103) class49.field849.method378(-53)) {
                if (class93.field1635 <= var99.field1803 && var99.field1803 < (class93.field1635 + 8) && class21.field326 <= var99.field1815 && (class21.field326 + 8) > var99.field1815 && class176.field2886 == var99.field1800) {
                    var99.field1804 = 0;
                }
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 78) {
            int var101 = class248.field4058.method669((byte) 36);
            if (class248.field4058.method669((byte) 36) == 0) {
                class90.field1593[var101] = new class106();
            } else {
                class248.field4058.field1762--;
                class90.field1593[var101] = new class106(class248.field4058);
            }
            class87.field1558 = -1;
            class26.field397 = class222.field3746;
            return true;
        } else if (class87.field1558 == 50) {
            byte[] var102 = new byte[class101.field1747];
            class248.field4058.method196(class101.field1747, (byte) 72, 0, var102);
            String var103 = class234.method1551(var102, 0, (byte) -103, class101.field1747);
            if (class270.field4349 == null && class131.field2288 == 3 || !class131.field2291.startsWith("win") || class66.field1105) {
                class291.method1967(true, var103, 82);
            } else {
                class246.field4048 = var103;
                class253.field4142 = true;
                class60.field1048 = class127.field2238.method914(var103, 0);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 31) {
            int var104 = class248.field4058.method691((byte) 120);
            int var105 = class248.field4058.method691((byte) 115);
            int var106 = class248.field4058.method652((byte) 83);
            int var107 = class248.field4058.method693(!arg0);
            if (var106 >> 30 != 0) {
                int var132 = ((var106 & 0xFFFEE82) >> 14) - class126.field2206;
                int var133 = var106 >> 28 & 0x3;
                int var134 = (var106 & 0x3FFF) - class255.field4162;
                if (var132 >= 0 && var134 >= 0 && var132 < 104 && var134 < 104) {
                    int var135 = var134 * 128 + 64;
                    int var136 = var132 * 128 + 64;
                    class177 var137 = new class177(var107, var133, var136, var135, class10.method68(true, var133, var135, var136) - var104, var105, class266.field4301);
                    class63.field1092.method374(-1, new class66(var137));
                }
            } else if (var106 >> 29 != 0) {
                int var120 = var106 & 0xFFFF;
                class141 var121 = class42.field625[var120];
                if (var121 != null) {
                    if (var107 == 65535) {
                        var107 = -1;
                    }
                    boolean var122 = true;
                    if (var107 != -1 && var121.field1396 != -1) {
                        if (var121.field1396 == var107) {
                            class121 var123 = class189.method1243(65536, var107);
                            if (var123.field2139 && var123.field2138 != -1) {
                                class167 var124 = class105.method714(var123.field2138, (byte) 63);
                                int var125 = var124.field2742;
                                if (var125 == 1) {
                                    var122 = false;
                                    var121.field1463 = 0;
                                    var121.field1482 = 0;
                                    var121.field1431 = 0;
                                    var121.field1390 = 1;
                                    var121.field1385 = class266.field4301 + var105;
                                    class112.method786(var121.field1458, var124, var121.field1482, var121.field1397, (byte) -77, false);
                                } else if (var125 == 2) {
                                    var121.field1440 = 0;
                                    var122 = false;
                                }
                            }
                        } else {
                            class121 var126 = class189.method1243(65536, var107);
                            class121 var127 = class189.method1243(65536, var121.field1396);
                            if (var126.field2138 != -1 && var127.field2138 != -1) {
                                class167 var128 = class105.method714(var126.field2138, (byte) 55);
                                class167 var129 = class105.method714(var127.field2138, (byte) 91);
                                if (var129.field2744 > var128.field2744) {
                                    var122 = false;
                                }
                            }
                        }
                    }
                    if (var122) {
                        var121.field1463 = 0;
                        var121.field1385 = class266.field4301 + var105;
                        var121.field1396 = var107;
                        var121.field1482 = 0;
                        var121.field1386 = var104;
                        var121.field1390 = 1;
                        if (class266.field4301 < var121.field1385) {
                            var121.field1482 = -1;
                        }
                        if (var121.field1396 != -1 && class266.field4301 == var121.field1385) {
                            int var130 = class189.method1243(65536, var121.field1396).field2138;
                            if (var130 != -1) {
                                class167 var131 = class105.method714(var130, (byte) 25);
                                if (var131 != null && var131.field2736 != null) {
                                    class112.method786(var121.field1458, var131, 0, var121.field1397, (byte) -23, false);
                                }
                            }
                        }
                    }
                }
            } else if (var106 >> 28 != 0) {
                int var108 = var106 & 0xFFFF;
                class288 var109;
                if (class37.field545 == var108) {
                    var109 = class273.field4378;
                } else {
                    var109 = class105.field1874[var108];
                }
                if (var109 != null) {
                    if (var107 == 65535) {
                        var107 = -1;
                    }
                    boolean var110 = true;
                    if (var107 != -1 && var109.field1396 != -1) {
                        if (var109.field1396 == var107) {
                            class121 var115 = class189.method1243(65536, var107);
                            if (var115.field2139 && var115.field2138 != -1) {
                                class167 var116 = class105.method714(var115.field2138, (byte) 99);
                                int var117 = var116.field2742;
                                if (var117 == 1) {
                                    var109.field1385 = class266.field4301 + var105;
                                    var110 = false;
                                    var109.field1482 = 0;
                                    var109.field1431 = 0;
                                    var109.field1390 = 1;
                                    var109.field1463 = 0;
                                    class112.method786(var109.field1458, var116, var109.field1482, var109.field1397, (byte) -19, false);
                                } else if (var117 == 2) {
                                    var109.field1440 = 0;
                                    var110 = false;
                                }
                            }
                        } else {
                            class121 var111 = class189.method1243(65536, var107);
                            class121 var112 = class189.method1243(65536, var109.field1396);
                            if (var111.field2138 != -1 && var112.field2138 != -1) {
                                class167 var113 = class105.method714(var111.field2138, (byte) 73);
                                class167 var114 = class105.method714(var112.field2138, (byte) 110);
                                if (var114.field2744 > var113.field2744) {
                                    var110 = false;
                                }
                            }
                        }
                    }
                    if (var110) {
                        var109.field1385 = class266.field4301 + var105;
                        var109.field1386 = var104;
                        var109.field1482 = 0;
                        var109.field1390 = 1;
                        var109.field1463 = 0;
                        if (var109.field1385 > class266.field4301) {
                            var109.field1482 = -1;
                        }
                        var109.field1396 = var107;
                        if (var109.field1396 == 65535) {
                            var109.field1396 = -1;
                        }
                        if (var109.field1396 != -1 && class266.field4301 == var109.field1385) {
                            int var118 = class189.method1243(65536, var109.field1396).field2138;
                            if (var118 != -1) {
                                class167 var119 = class105.method714(var118, (byte) 38);
                                if (var119 != null && var119.field2736 != null) {
                                    class112.method786(var109.field1458, var119, 0, var109.field1397, (byte) -80, class273.field4378 == var109);
                                }
                            }
                        }
                    }
                }
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 87) {
            long var138 = class248.field4058.method694(false);
            long var140 = (long) class248.field4058.method677(false);
            boolean var142 = false;
            long var143 = (long) class248.field4058.method658(22292);
            int var145 = class248.field4058.method669((byte) 36);
            long var146 = (var140 << 32) + var143;
            int var148 = 0;
            label1372: while (true) {
                if (var148 >= 100) {
                    if (var145 <= 1) {
                        if ((!class66.field1108 || class125.field2196) && !class124.field2186) {
                            for (int var149 = 0; var149 < class90.field1589; var149++) {
                                if (class237.field3906[var149] == var138) {
                                    var142 = true;
                                    break label1372;
                                }
                            }
                        } else {
                            var142 = true;
                        }
                    }
                    break;
                }
                if (class293.field4676[var148] == var146) {
                    var142 = true;
                    break;
                }
                var148++;
            }
            if (!var142 && class126.field2211 == 0) {
                class293.field4676[class145.field2475] = var146;
                class145.field2475 = (class145.field2475 + 1) % 100;
                String var150 = class244.method1625(class190.method1247(class50.method304(class248.field4058, 32767), -101));
                if (var145 == 2 || var145 == 3) {
                    class97.method612(var150, -1, 7, "<img=1>" + class21.method146(var138, (byte) -100));
                } else if (var145 == 1) {
                    class97.method612(var150, -1, 7, "<img=0>" + class21.method146(var138, (byte) 92));
                } else {
                    class97.method612(var150, -1, 3, class21.method146(var138, (byte) 31));
                }
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 226) {
            int var151 = class248.field4058.method652((byte) 83);
            int var152 = class248.field4058.method693(false);
            int var153 = class248.field4058.method686(-3);
            if (class147.method1012(var152, 1)) {
                class87.method571(var151, var153, -91);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 184) {
            int var154 = class248.field4058.method666(-128);
            int var155 = class248.field4058.method638(0);
            int var156 = class248.field4058.method641(2);
            int var157 = class248.field4058.method677(false);
            if (class147.method1012(var157, 1)) {
                class194 var158 = (class194) class41.field607.method779(52, (long) var154);
                if (var158 != null) {
                    class196.method1289((byte) -117, var158, var158.field3128 != var156);
                }
                class178.method1180(var155, var156, var154, (byte) 100);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 27) {
            class73.method441(false, 99);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 178) {
            int var159 = class248.field4058.method677(!arg0);
            if (class147.method1012(var159, 1)) {
                class99.method629(15089);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 214) {
            int var160 = class248.field4058.method696((byte) 102);
            class231.field3866 = class127.field2238.method908(-21199, var160);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 46) {
            int var161 = class248.field4058.method641(2);
            int var162 = class248.field4058.method641(2);
            int var163 = class248.field4058.method696((byte) 102);
            int var164 = class248.field4058.method691((byte) 117);
            if (class147.method1012(var162, 1)) {
                class165.method1111(var163, 24, (var164 << 16) + var161);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 0) {
            int var165 = class248.field4058.method670(28019224);
            int var166 = class248.field4058.method638(0);
            int var167 = class248.field4058.method638(0);
            class176.field2886 = var166 >> 1;
            class273.field4378.method1949(var167, (var166 & 0x1) == 1, var165, 32);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 28) {
            int var168 = class248.field4058.method677(!arg0);
            int var169 = class248.field4058.method669((byte) 36);
            int var170 = class248.field4058.method669((byte) 36);
            int var171 = class248.field4058.method677(false);
            int var172 = class248.field4058.method669((byte) 36);
            int var173 = class248.field4058.method669((byte) 36);
            if (class147.method1012(var168, 1)) {
                class162.method1098(var172, var170, var169, true, var173, var171, 100);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 201) {
            class264.field4293 = class248.field4058.method669((byte) 36);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 20) {
            int var174 = class248.field4058.method677(false);
            String var175 = class248.field4058.method662((byte) 1);
            int var176 = class248.field4058.method677(false);
            if (class147.method1012(var174, 1)) {
                class62.method396(var175, var176, -128);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 180) {
            class56.method347(arg0);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 118) {
            int var177 = class248.field4058.method641(2);
            if (var177 == 65535) {
                var177 = -1;
            }
            int var178 = class248.field4058.method691((byte) 118);
            int var179 = class248.field4058.method666(-128);
            if (class147.method1012(var178, 1)) {
                class76.method466(var177, (byte) 86, -1, 1, var179);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 119) {
            long var180 = class248.field4058.method694(false);
            String var182 = class244.method1625(class190.method1247(class50.method304(class248.field4058, 32767), 96));
            class97.method612(var182, -1, 6, class21.method146(var180, (byte) 64));
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 6) {
            class243.field3979 = class248.field4058.method669((byte) 36);
            class175.field2876 = class248.field4058.method669((byte) 36);
            class68.field1122 = class248.field4058.method669((byte) 36);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 70) {
            class95.method606((byte) -125);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 172) {
            int var183 = class248.field4058.method641(2);
            int var184 = class248.field4058.method652((byte) 83);
            int var185 = class248.field4058.method696((byte) 102);
            if (class147.method1012(var183, 1)) {
                class194 var186 = (class194) class41.field607.method779(-115, (long) var184);
                class194 var187 = (class194) class41.field607.method779(-116, (long) var185);
                if (var187 != null) {
                    class196.method1289((byte) -124, var187, var186 == null || var186.field3128 != var187.field3128);
                }
                if (var186 != null) {
                    var186.method547(10026);
                    class41.field607.method780((byte) -78, (long) var185, var186);
                }
                class46 var188 = class108.method760(-29533, var184);
                if (var188 != null) {
                    class79.method516(-373, var188);
                }
                class46 var189 = class108.method760(-29533, var185);
                if (var189 != null) {
                    class79.method516(-373, var189);
                    class89.method580(true, true, var189);
                }
                if (client.field4545 != -1) {
                    class252.method1670(client.field4545, 1, (byte) -114);
                }
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 101) {
            class90.field1589 = class101.field1747 / 8;
            for (int var190 = 0; var190 < class90.field1589; var190++) {
                class237.field3906[var190] = class248.field4058.method694(false);
                class155.field2598[var190] = class264.method1749(26977, class237.field3906[var190]);
                class188.field3046[var190] = false;
            }
            class87.field1558 = -1;
            class63.field1093 = class222.field3746;
            return true;
        } else if (class87.field1558 == 255) {
            class270.method1776((byte) -30);
            int var191 = class248.field4058.method669((byte) 36);
            int var192 = class248.field4058.method652((byte) 83);
            int var193 = class248.field4058.method669((byte) 36);
            class129.field2263[var191] = var192;
            class104.field1831[var191] = var193;
            class95.field1645[var191] = 1;
            for (int var194 = 0; var194 < 98; var194++) {
                if (class246.field4046[var194] <= var192) {
                    class95.field1645[var191] = var194 + 2;
                }
            }
            class292.field4670[class113.method791(class118.field2100++, 31)] = var191;
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 186) {
            int var195 = class248.field4058.method693(false);
            class227.method1526((byte) -127, var195);
            class225.field3787[class113.method791(31, class136.field2386++)] = class113.method791(var195, 32767);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 192) {
            class270.method1776((byte) -13);
            class210.field3548 = class248.field4058.method686(-3);
            class87.field1558 = -1;
            class171.field2816 = class222.field3746;
            return true;
        } else if (class87.field1558 == 212) {
            if (client.field4545 != -1) {
                class252.method1670(client.field4545, 0, (byte) -127);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 84) {
            int var196 = class248.field4058.method677(false);
            int var197 = class248.field4058.method655((byte) 122);
            if (class147.method1012(var196, 1)) {
                class194 var198 = (class194) class41.field607.method779(124, (long) var197);
                if (var198 != null) {
                    class196.method1289((byte) -117, var198, true);
                }
                if (class139.field2404 != null) {
                    class79.method516(-373, class139.field2404);
                    class139.field2404 = null;
                }
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 140) {
            byte var199 = class248.field4058.method687((byte) -120);
            int var200 = class248.field4058.method641(2);
            int var201 = class248.field4058.method693(false);
            if (class147.method1012(var201, 1)) {
                class106.method719(1, var199, var200);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 117) {
            int var202 = class248.field4058.method677(false);
            int var203 = class248.field4058.method669((byte) 36);
            int var204 = class248.field4058.method669((byte) 36);
            int var205 = class248.field4058.method669((byte) 36);
            int var206 = class248.field4058.method669((byte) 36);
            int var207 = class248.field4058.method677(false);
            if (class147.method1012(var202, 1)) {
                class201.field3306[var203] = true;
                class258.field4213[var203] = var204;
                class55.field957[var203] = var205;
                class21.field324[var203] = var206;
                class39.field583[var203] = var207;
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 85) {
            int var208 = class248.field4058.method691((byte) 123);
            int var209 = class248.field4058.method677(false);
            int var210 = class248.field4058.method670(28019224);
            if (class147.method1012(var208, 1)) {
                if (var210 == 2) {
                    class187.method1224(-69);
                }
                client.field4545 = var209;
                class273.method1795(-116, var209);
                class61.method384(false, true);
                class224.method1507(0, client.field4545);
                for (int var211 = 0; var211 < 100; var211++) {
                    class23.field367[var211] = true;
                }
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 228) {
            class240.field3939 = class222.field3746;
            long var212 = class248.field4058.method694(false);
            if (var212 == 0L) {
                class191.field3088 = null;
                client.field4536 = null;
                class87.field1558 = -1;
                class182.field2972 = null;
                class139.field2402 = 0;
                return true;
            }
            long var214 = class248.field4058.method694(false);
            class191.field3088 = class21.method145(var214, 32481);
            client.field4536 = class21.method145(var212, 32481);
            class195.field3148 = class248.field4058.method646(-84);
            int var216 = class248.field4058.method669((byte) 36);
            if (var216 == 255) {
                class87.field1558 = -1;
                return true;
            }
            class139.field2402 = var216;
            class88[] var217 = new class88[100];
            for (int var218 = 0; var218 < class139.field2402; var218++) {
                var217[var218] = new class88();
                var217[var218].field1515 = class248.field4058.method694(false);
                var217[var218].field1574 = class21.method145(var217[var218].field1515, 32481);
                var217[var218].field1576 = class248.field4058.method677(false);
                var217[var218].field1567 = class248.field4058.method646(-85);
                var217[var218].field1570 = class248.field4058.method662((byte) 1);
                if (class171.field2811 == var217[var218].field1515) {
                    class292.field4662 = var217[var218].field1567;
                }
            }
            boolean var219 = false;
            int var220 = class139.field2402;
            while (var220 > 0) {
                boolean var221 = true;
                var220--;
                for (int var222 = 0; var222 < var220; var222++) {
                    if (var217[var222].field1574.compareTo(var217[var222 + 1].field1574) > 0) {
                        class88 var223 = var217[var222];
                        var221 = false;
                        var217[var222] = var217[var222 + 1];
                        var217[var222 + 1] = var223;
                    }
                }
                if (var221) {
                    break;
                }
            }
            class182.field2972 = var217;
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 215) {
            int var224 = class248.field4058.method655((byte) 56);
            int var225 = class248.field4058.method677(false);
            class46 var226;
            if (var224 >= 0) {
                var226 = class108.method760(-29533, var224);
            } else {
                var226 = null;
            }
            if (var226 != null) {
                for (int var227 = 0; var227 < var226.field774.length; var227++) {
                    var226.field774[var227] = 0;
                    var226.field711[var227] = 0;
                }
            }
            if (var224 < -70000) {
                var225 += 32768;
            }
            class213.method1424(var225, 124);
            int var228 = class248.field4058.method677(false);
            for (int var229 = 0; var229 < var228; var229++) {
                int var230 = class248.field4058.method638(0);
                if (var230 == 255) {
                    var230 = class248.field4058.method696((byte) 102);
                }
                int var231 = class248.field4058.method641(2);
                if (var226 != null && var229 < var226.field774.length) {
                    var226.field774[var229] = var231;
                    var226.field711[var229] = var230;
                }
                class97.method616(var229, (byte) 91, var230, var225, var231 - 1);
            }
            if (var226 != null) {
                class79.method516(-373, var226);
            }
            class270.method1776((byte) -126);
            class225.field3787[class113.method791(class136.field2386++, 31)] = class113.method791(32767, var225);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 54) {
            String var232 = class248.field4058.method662((byte) 1);
            int var233 = class248.field4058.method666(-128);
            int var234 = class248.field4058.method641(2);
            if (class147.method1012(var234, 1)) {
                class83.method548(var233, true, var232);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 175) {
            for (int var235 = 0; var235 < class105.field1874.length; var235++) {
                if (class105.field1874[var235] != null) {
                    class105.field1874[var235].field1384 = -1;
                }
            }
            for (int var236 = 0; var236 < class42.field625.length; var236++) {
                if (class42.field625[var236] != null) {
                    class42.field625[var236].field1384 = -1;
                }
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 53) {
            String var237 = class248.field4058.method662((byte) 1);
            if (var237.endsWith(":tradereq:")) {
                String var238 = var237.substring(0, var237.indexOf(":"));
                long var239 = class103.method702(true, var238);
                boolean var241 = false;
                for (int var242 = 0; var242 < class90.field1589; var242++) {
                    if (class237.field3906[var242] == var239) {
                        var241 = true;
                        break;
                    }
                }
                if (!var241 && class126.field2211 == 0) {
                    class97.method612(class219.field3678, -1, 4, var238);
                }
            } else if (var237.endsWith(":chalreq:")) {
                String var272 = var237.substring(0, var237.indexOf(":"));
                long var273 = class103.method702(true, var272);
                boolean var275 = false;
                for (int var276 = 0; var276 < class90.field1589; var276++) {
                    if (class237.field3906[var276] == var273) {
                        var275 = true;
                        break;
                    }
                }
                if (!var275 && class126.field2211 == 0) {
                    String var277 = var237.substring(var237.indexOf(":") + 1, var237.length() - 9);
                    class97.method612(var277, -1, 8, var272);
                }
            } else if (var237.endsWith(":assistreq:")) {
                String var267 = var237.substring(0, var237.indexOf(":"));
                boolean var268 = false;
                long var269 = class103.method702(arg0, var267);
                for (int var271 = 0; var271 < class90.field1589; var271++) {
                    if (class237.field3906[var271] == var269) {
                        var268 = true;
                        break;
                    }
                }
                if (!var268 && class126.field2211 == 0) {
                    class97.method612("", -1, 10, var267);
                }
            } else if (var237.endsWith(":clan:")) {
                String var243 = var237.substring(0, var237.indexOf(":clan:"));
                class97.method612(var243, -1, 11, "");
            } else if (var237.endsWith(":trade:")) {
                String var244 = var237.substring(0, var237.indexOf(":trade:"));
                if (class126.field2211 == 0) {
                    class97.method612(var244, -1, 12, "");
                }
            } else if (var237.endsWith(":assist:")) {
                String var266 = var237.substring(0, var237.indexOf(":assist:"));
                if (class126.field2211 == 0) {
                    class97.method612(var266, -1, 13, "");
                }
            } else if (var237.endsWith(":duelstake:")) {
                String var245 = var237.substring(0, var237.indexOf(":"));
                long var246 = class103.method702(true, var245);
                boolean var248 = false;
                for (int var249 = 0; var249 < class90.field1589; var249++) {
                    if (class237.field3906[var249] == var246) {
                        var248 = true;
                        break;
                    }
                }
                if (!var248 && class126.field2211 == 0) {
                    class97.method612("", -1, 14, var245);
                }
            } else if (var237.endsWith(":duelfriend:")) {
                String var261 = var237.substring(0, var237.indexOf(":"));
                long var262 = class103.method702(true, var261);
                boolean var264 = false;
                for (int var265 = 0; var265 < class90.field1589; var265++) {
                    if (class237.field3906[var265] == var262) {
                        var264 = true;
                        break;
                    }
                }
                if (!var264 && class126.field2211 == 0) {
                    class97.method612("", -1, 15, var261);
                }
            } else if (var237.endsWith(":clanreq:")) {
                String var250 = var237.substring(0, var237.indexOf(":"));
                boolean var251 = false;
                long var252 = class103.method702(arg0, var250);
                for (int var254 = 0; var254 < class90.field1589; var254++) {
                    if (class237.field3906[var254] == var252) {
                        var251 = true;
                        break;
                    }
                }
                if (!var251 && class126.field2211 == 0) {
                    class97.method612("", -1, 16, var250);
                }
            } else if (var237.endsWith(":allyreq:")) {
                boolean var255 = false;
                String var256 = var237.substring(0, var237.indexOf(":"));
                long var257 = class103.method702(true, var256);
                for (int var259 = 0; var259 < class90.field1589; var259++) {
                    if (class237.field3906[var259] == var257) {
                        var255 = true;
                        break;
                    }
                }
                if (!var255 && class126.field2211 == 0) {
                    String var260 = var237.substring(var237.indexOf(":") + 1, var237.length() + -9);
                    class97.method612(var260, -1, 21, var256);
                }
            } else {
                class97.method612(var237, -1, 0, "");
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 138) {
            int var278 = class248.field4058.method641(2);
            int var279 = class248.field4058.method693(false);
            if (var279 == 65535) {
                var279 = -1;
            }
            int var280 = class248.field4058.method696((byte) 102);
            int var281 = class248.field4058.method666(-128);
            if (class147.method1012(var278, 1)) {
                class46 var282 = class108.method760(-29533, var281);
                if (var282.field734) {
                    class175.method1164(var279, var280, (byte) -99, var281);
                    class199 var284 = class203.method1346(-1, var279);
                    class101.method680(var284.field3241, (byte) 110, var284.field3262, var284.field3267, var281);
                    class193.method1264(var284.field3253, var284.field3210, var284.field3235, (byte) -76, var281);
                } else if (var279 == -1) {
                    var282.field748 = 0;
                    class87.field1558 = -1;
                    return true;
                } else {
                    class199 var283 = class203.method1346(-1, var279);
                    var282.field816 = var283.field3262;
                    var282.field741 = var283.field3241;
                    var282.field748 = 4;
                    var282.field746 = var283.field3267 * 100 / var280;
                    var282.field653 = var279;
                    class79.method516(-373, var282);
                }
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 58) {
            int var285 = class248.field4058.method691((byte) 126);
            int var286 = class248.field4058.method696((byte) 102);
            class156.method1070(-102, var285, var286);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 171) {
            long var287 = class248.field4058.method694(false);
            boolean var289 = true;
            int var290 = class248.field4058.method677(!arg0);
            String var291 = "";
            if (var287 < 0L) {
                var289 = false;
                var287 &= Long.MAX_VALUE;
            }
            int var292 = class248.field4058.method669((byte) 36);
            if (var290 > 0) {
                var291 = class248.field4058.method662((byte) 1);
            }
            String var293 = class21.method146(var287, (byte) -100);
            for (int var294 = 0; var294 < class228.field3837; var294++) {
                if (class280.field4464[var294] == var287) {
                    if (class274.field4393[var294] != var290) {
                        class274.field4393[var294] = var290;
                        if (var290 > 0) {
                            class97.method612(var293 + class41.field613, -1, 5, "");
                        }
                        if (var290 == 0) {
                            class97.method612(var293 + class161.field2679, -1, 5, "");
                        }
                    }
                    class276.field4410[var294] = var291;
                    class175.field2872[var294] = var292;
                    var293 = null;
                    class143.field2459[var294] = var289;
                    break;
                }
            }
            boolean var295 = false;
            if (var293 != null && class228.field3837 < 200) {
                class280.field4464[class228.field3837] = var287;
                class5.field63[class228.field3837] = var293;
                class274.field4393[class228.field3837] = var290;
                class276.field4410[class228.field3837] = var291;
                class175.field2872[class228.field3837] = var292;
                class143.field2459[class228.field3837] = var289;
                class228.field3837++;
            }
            class63.field1093 = class222.field3746;
            int var296 = class228.field3837;
            while (var296 > 0) {
                boolean var297 = true;
                var296--;
                for (int var298 = 0; var298 < var296; var298++) {
                    if (class274.field4393[var298] != class146.field2489 && class274.field4393[var298 + 1] == class146.field2489 || class274.field4393[var298] == 0 && class274.field4393[var298 + 1] != 0) {
                        var297 = false;
                        int var299 = class274.field4393[var298];
                        class274.field4393[var298] = class274.field4393[var298 + 1];
                        class274.field4393[var298 + 1] = var299;
                        String var300 = class276.field4410[var298];
                        class276.field4410[var298] = class276.field4410[var298 + 1];
                        class276.field4410[var298 + 1] = var300;
                        String var301 = class5.field63[var298];
                        class5.field63[var298] = class5.field63[var298 + 1];
                        class5.field63[var298 + 1] = var301;
                        long var302 = class280.field4464[var298];
                        class280.field4464[var298] = class280.field4464[var298 + 1];
                        class280.field4464[var298 + 1] = var302;
                        int var304 = class175.field2872[var298];
                        class175.field2872[var298] = class175.field2872[var298 + 1];
                        class175.field2872[var298 + 1] = var304;
                        boolean var305 = class143.field2459[var298];
                        class143.field2459[var298] = class143.field2459[var298 + 1];
                        class143.field2459[var298 + 1] = var305;
                    }
                }
                if (var297) {
                    break;
                }
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 181) {
            long var306 = class248.field4058.method694(false);
            long var308 = (long) class248.field4058.method677(!arg0);
            long var310 = (long) class248.field4058.method658(22292);
            int var312 = class248.field4058.method669((byte) 36);
            int var313 = class248.field4058.method677(false);
            long var314 = (var308 << 32) + var310;
            boolean var316 = false;
            int var317 = 0;
            label1547: while (true) {
                if (var317 >= 100) {
                    if (var312 <= 1) {
                        for (int var318 = 0; var318 < class90.field1589; var318++) {
                            if (class237.field3906[var318] == var306) {
                                var316 = true;
                                break label1547;
                            }
                        }
                    }
                    break;
                }
                if (class293.field4676[var317] == var314) {
                    var316 = true;
                    break;
                }
                var317++;
            }
            if (!var316 && class126.field2211 == 0) {
                class293.field4676[class145.field2475] = var314;
                class145.field2475 = (class145.field2475 + 1) % 100;
                String var319 = class113.method795(var313, 237).method838(class248.field4058, (byte) 49);
                if (var312 == 2) {
                    class286.method1909((byte) 120, var319, var313, (String) null, "<img=1>" + class21.method146(var306, (byte) 34), 18);
                } else if (var312 == 1) {
                    class286.method1909((byte) 66, var319, var313, (String) null, "<img=0>" + class21.method146(var306, (byte) -101), 18);
                } else {
                    class286.method1909((byte) 46, var319, var313, (String) null, class21.method146(var306, (byte) 15), 18);
                }
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 145) {
            int var320 = class248.field4058.method677(false);
            int var321 = class248.field4058.method669((byte) 36);
            int var322 = class248.field4058.method669((byte) 36);
            int var323 = class248.field4058.method677(false);
            int var324 = class248.field4058.method669((byte) 36);
            int var325 = class248.field4058.method669((byte) 36);
            if (class147.method1012(var320, 1)) {
                class239.method1579(var321, var324, var322, var325, -750, var323);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 137) {
            class73.method441(true, 121);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 69) {
            int var326 = class248.field4058.method677(false);
            String var327 = class248.field4058.method662((byte) 1);
            Object[] var328 = new Object[var327.length() + 1];
            for (int var329 = var327.length() - 1; var329 >= 0; var329--) {
                if (var327.charAt(var329) == 's') {
                    var328[var329 + 1] = class248.field4058.method662((byte) 1);
                } else {
                    var328[var329 + 1] = Integer.valueOf(class248.field4058.method655((byte) 116));
                }
            }
            var328[0] = Integer.valueOf(class248.field4058.method655((byte) 69));
            if (class147.method1012(var326, 1)) {
                class198 var330 = new class198();
                var330.field3204 = var328;
                class71.method434(-10521, var330);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 233) {
            class270.method1776((byte) -122);
            class129.field2262 = class248.field4058.method669((byte) 36);
            class87.field1558 = -1;
            class171.field2816 = class222.field3746;
            return true;
        } else if (class87.field1558 == 203) {
            int var331 = class248.field4058.method677(false);
            if (var331 == 65535) {
                var331 = -1;
            }
            int var332 = class248.field4058.method669((byte) 36);
            int var333 = class248.field4058.method677(false);
            int var334 = class248.field4058.method669((byte) 36);
            class31.method208(var331, var332, var333, var334, -118);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 29) {
            class63.method402((byte) -18);
            class87.field1558 = -1;
            return false;
        } else if (class87.field1558 == 2) {
            int var335 = class248.field4058.method669((byte) 36);
            int var336 = class248.field4058.method677(false);
            String var337 = class248.field4058.method662((byte) 1);
            int var338 = class248.field4058.method670(28019224);
            if (var336 == 65535) {
                var336 = -1;
            }
            if (var338 >= 1 && var338 <= 8) {
                if (var337.equalsIgnoreCase("null")) {
                    var337 = null;
                }
                class14.field189[var338 - 1] = var337;
                class52.field916[var338 - 1] = var336;
                class122.field2158[var338 - 1] = var335 == 0;
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 86) {
            class87.field1558 = -1;
            class79.field1364 = 0;
            return true;
        } else if (class87.field1558 == 13) {
            int var339 = class248.field4058.method652((byte) 83);
            int var340 = class248.field4058.method691((byte) 109);
            int var341 = class248.field4058.method677(false);
            if (class147.method1012(var341, 1)) {
                class236.method1564(16, var340, var339);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 107) {
            int var342 = class248.field4058.method652((byte) 83);
            int var343 = class248.field4058.method641(2);
            if (var343 == 65535) {
                var343 = -1;
            }
            int var344 = class248.field4058.method677(false);
            int var345 = class248.field4058.method693(false);
            int var346 = class248.field4058.method666(-128);
            if (var345 == 65535) {
                var345 = -1;
            }
            if (class147.method1012(var344, 1)) {
                for (int var347 = var343; var347 <= var345; var347++) {
                    long var348 = ((long) var346 << 32) + (long) var347;
                    class192 var350 = (class192) class157.field2621.method779(-101, var348);
                    class192 var351;
                    if (var350 != null) {
                        var351 = new class192(var342, var350.field3102);
                        var350.method547(10026);
                    } else if (var347 == -1) {
                        var351 = new class192(var342, class108.method760(-29533, var346).field796.field3102);
                    } else {
                        var351 = new class192(var342, -1);
                    }
                    class157.field2621.method780((byte) -78, var348, var351);
                }
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 18) {
            int var352 = class248.field4058.method691((byte) 125);
            int var353 = class248.field4058.method657(0);
            if (class147.method1012(var352, 1)) {
                class156.field2612 = var353;
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 1) {
            class104.field1822 = class248.field4058.method691((byte) 127) * 30;
            class87.field1558 = -1;
            class171.field2816 = class222.field3746;
            return true;
        } else if (class87.field1558 == 115) {
            class248.field4058.field1762 += 28;
            if (class248.field4058.method683((byte) -15)) {
                class228.method1534((byte) 106, class248.field4058, class248.field4058.field1762 - 28);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 131) {
            for (int var354 = 0; var354 < class125.field2191.length; var354++) {
                if (class50.field857[var354] != class125.field2191[var354]) {
                    class125.field2191[var354] = class50.field857[var354];
                    class89.method577(var354, (byte) -44);
                    class194.field3138[class113.method791(class98.field1690++, 31)] = var354;
                }
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 174) {
            int var355 = class248.field4058.method677(false);
            if (var355 == 65535) {
                var355 = -1;
            }
            int var356 = class248.field4058.method641(2);
            int var357 = class248.field4058.method652((byte) 83);
            if (class147.method1012(var356, 1)) {
                class76.method466(var355, (byte) 86, -1, 2, var357);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 177) {
            int var358 = class248.field4058.method696((byte) 102);
            int var359 = class248.field4058.method691((byte) 120);
            int var360 = class248.field4058.method693(!arg0);
            if (class147.method1012(var359, 1)) {
                class158.method1086(var358, var360, -50);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 169) {
            int var361 = class248.field4058.method641(2);
            int var362 = class248.field4058.method641(2);
            int var363 = class248.field4058.method677(false);
            if (class147.method1012(var363, 1)) {
                class196.method1286(var362, var361, 0);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 22) {
            class53.method333((byte) 94);
            class270.method1776((byte) -82);
            class98.field1690 += 32;
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 187) {
            int var364 = class248.field4058.method641(2);
            int var365 = class248.field4058.method677(false);
            String var366 = class248.field4058.method662((byte) 1);
            if (class147.method1012(var365, 1)) {
                class62.method396(var366, var364, -128);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 199) {
            int var367 = class248.field4058.method696((byte) 102);
            int var368 = class248.field4058.method641(2);
            if (var368 == 65535) {
                var368 = -1;
            }
            int var369 = class248.field4058.method677(false);
            int var370 = class248.field4058.method693(false);
            int var371 = class248.field4058.method641(2);
            if (var371 == 65535) {
                var371 = -1;
            }
            if (class147.method1012(var370, 1)) {
                for (int var372 = var371; var372 <= var368; var372++) {
                    long var373 = ((long) var367 << 32) + (long) var372;
                    class192 var375 = (class192) class157.field2621.method779(-114, var373);
                    class192 var376;
                    if (var375 != null) {
                        var376 = new class192(var375.field3096, var369);
                        var375.method547(10026);
                    } else if (var372 == -1) {
                        var376 = new class192(class108.method760(-29533, var367).field796.field3096, var369);
                    } else {
                        var376 = new class192(0, var369);
                    }
                    class157.field2621.method780((byte) -78, var373, var376);
                }
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 245) {
            int var377 = class248.field4058.method677(false);
            int var378 = class248.field4058.method666(-128);
            int var379 = class248.field4058.method691((byte) 123);
            int var380 = class248.field4058.method677(false);
            int var381 = class248.field4058.method691((byte) 116);
            if (class147.method1012(var381, 1)) {
                class76.method466(var377 | var380 << 16, (byte) 86, var379, 7, var378);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 216) {
            class3.field32 = class248.field4058.method669((byte) 36);
            class63.field1093 = class222.field3746;
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 112) {
            int var382 = class248.field4058.method691((byte) 110);
            int var383 = class248.field4058.method641(2);
            int var384 = class248.field4058.method666(-128);
            if (class147.method1012(var382, 1)) {
                class106.method719(1, var384, var383);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 162) {
            int var385 = class248.field4058.method666(-128);
            class46 var386 = class108.method760(-29533, var385);
            for (int var387 = 0; var387 < var386.field774.length; var387++) {
                var386.field774[var387] = -1;
                var386.field774[var387] = 0;
            }
            class79.method516(-373, var386);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 98) {
            long var388 = class248.field4058.method694(false);
            int var390 = class248.field4058.method677(false);
            String var391 = class113.method795(var390, 237).method838(class248.field4058, (byte) 49);
            class286.method1909((byte) 95, var391, var390, (String) null, class21.method146(var388, (byte) -91), 19);
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 33) {
            int var392 = class248.field4058.method677(false);
            if (class147.method1012(var392, 1)) {
                class291.method1968((byte) 96);
            }
            class87.field1558 = -1;
            return true;
        } else if (class87.field1558 == 160) {
            class93.field1635 = class248.field4058.method669((byte) 36);
            class21.field326 = class248.field4058.method670(28019224);
            while (class101.field1747 > class248.field4058.field1762) {
                class87.field1558 = class248.field4058.method669((byte) 36);
                class152.method1042(-91);
            }
            class87.field1558 = -1;
            return true;
        } else {
            class254.method1684(-125, (Throwable) null, "T1 - " + class87.field1558 + "," + class211.field3564 + "," + class295.field4694 + " - " + class101.field1747);
            class63.method402((byte) -18);
            return true;
        }
    }

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)V")
    public static void method1693(int arg0) {
        if (arg0 >= -69) {
            method1691((byte) 9);
        }
        field4178 = null;
        field4176 = null;
        field4177 = null;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method597(byte arg0) {
        int var2 = -99 % ((-arg0 - 68) / 39);
        field4174++;
        return this.field4173;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class256(Object arg0) {
        this.field4173 = arg0;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4176[var1] = var0 - 1;
            var0 += var0;
        }
        field4179 = -1;
        field4182 = 0;
    }
}
