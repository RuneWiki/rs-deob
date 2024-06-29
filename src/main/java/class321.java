import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class321 {

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "[[Z")
    public static boolean[][] field4617 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "[Z")
    public static boolean[] field4618;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)Z")
    public static final boolean method2036(int arg0) throws IOException {
        field4622++;
        if (class457.field6340 == null) {
            return false;
        }
        if (class434.field6143 == null) {
            if (class478.field6629) {
                if (!class457.field6340.method3025(1, 55)) {
                    return false;
                }
                class457.field6340.method3028(-109, 1, class89.field1233.field5518, 0);
                class584.field7797 = 0;
                class479.field6638++;
                class478.field6629 = false;
            }
            class89.field1233.field5459 = 0;
            if (class89.field1233.method1985(61)) {
                if (!class457.field6340.method3025(1, 55)) {
                    return false;
                }
                class457.field6340.method3028(-70, 1, class89.field1233.field5518, 1);
                class479.field6638++;
                class584.field7797 = 0;
            }
            class478.field6629 = true;
            class581[] var1 = class496.method2872(-32);
            int var2 = class89.field1233.method1987(arg0 ^ 0x75);
            if (var2 < 0 || var2 >= var1.length) {
                throw new IOException("invo:" + var2 + " ip:" + class89.field1233.field5459);
            }
            class434.field6143 = var1[var2];
            class206.field2700 = class434.field6143.field7765;
        }
        if (class206.field2700 == -1) {
            if (!class457.field6340.method3025(1, 55)) {
                return false;
            }
            class457.field6340.method3028(-72, 1, class89.field1233.field5518, 0);
            class584.field7797 = 0;
            class479.field6638++;
            class206.field2700 = class89.field1233.field5518[0] & 0xFF;
        }
        if (class206.field2700 == -2) {
            if (!class457.field6340.method3025(2, 55)) {
                return false;
            }
            class457.field6340.method3028(arg0 ^ 0x4E, 2, class89.field1233.field5518, 0);
            class89.field1233.field5459 = 0;
            class206.field2700 = class89.field1233.method2359(-1);
            class479.field6638 += 2;
            class584.field7797 = 0;
        }
        if (class206.field2700 > 0) {
            if (!class457.field6340.method3025(class206.field2700, 55)) {
                return false;
            }
            class89.field1233.field5459 = 0;
            class457.field6340.method3028(124, class206.field2700, class89.field1233.field5518, 0);
            class479.field6638 += class206.field2700;
            class584.field7797 = 0;
        }
        class598.field8147 = class635.field8859;
        class635.field8859 = class15.field225;
        class15.field225 = class434.field6143;
        if (class486.field6730 == class434.field6143) {
            class13.field214 = class89.field1233.method2365(arg0 - 2) << 3;
            class438.field6170 = class89.field1233.method2409(true) << 3;
            class146.field2072 = class89.field1233.method2381(-127);
            class434.field6143 = null;
            return true;
        } else if (class434.field6143 == class300.field4341) {
            int var3 = class89.field1233.method2410(65280);
            int var4 = class89.field1233.method2376((byte) 76);
            class630.method3538((byte) -124);
            class648.method3621(var4, -106, var3);
            class434.field6143 = null;
            return true;
        } else if (class57.field798 == class434.field6143) {
            class440.field6186 = class194.field2598;
            boolean var5 = class89.field1233.method2398(-1372747256) == 1;
            class121 var6 = new class121(class89.field1233);
            class56 var7;
            if (var5) {
                var7 = class66.field952;
            } else {
                var7 = class285.field4208;
            }
            var6.method997((byte) 112, var7);
            class434.field6143 = null;
            return true;
        } else if (class773.field10643 == class434.field6143) {
            class235.method1528(class195.field2609, 120);
            class434.field6143 = null;
            return true;
        } else if (class434.field6143 == class314.field4520) {
            int var8 = class89.field1233.method2398(-1372747256);
            boolean var9 = (var8 & 0x1) == 1;
            String var10 = class89.field1233.method2379((byte) 85);
            String var11 = class89.field1233.method2379((byte) 85);
            if (var11.equals("")) {
                var11 = var10;
            }
            String var12 = class89.field1233.method2379((byte) 85);
            String var13 = class89.field1233.method2379((byte) 85);
            if (var13.equals("")) {
                var13 = var12;
            }
            if (var9) {
                for (int var14 = 0; var14 < class5.field54; var14++) {
                    if (class602.field8189[var14].equals(var13)) {
                        class255.field3798[var14] = var10;
                        class602.field8189[var14] = var11;
                        class424.field6053[var14] = var12;
                        class768.field10593[var14] = var13;
                        break;
                    }
                }
            } else {
                class255.field3798[class5.field54] = var10;
                class602.field8189[class5.field54] = var11;
                class424.field6053[class5.field54] = var12;
                class768.field10593[class5.field54] = var13;
                class749.field10327[class5.field54] = class440.method2643(2, var8) == 2;
                class5.field54++;
            }
            class434.field6143 = null;
            class180.field2390 = class194.field2598;
            return true;
        } else if (class97.field1355 == class434.field6143) {
            class517.field7067 = class194.field2598;
            boolean var15 = class89.field1233.method2398(-1372747256) == 1;
            class396 var16 = new class396(class89.field1233);
            class625 var17;
            if (var15) {
                var17 = class181.field2401;
            } else {
                var17 = class495.field6848;
            }
            var16.method2493(var17, -7);
            class434.field6143 = null;
            return true;
        } else if (class434.field6143 == class357.field5232) {
            int var18 = class89.field1233.method2402((byte) 66);
            int var19 = class89.field1233.method2397((byte) -78);
            class630.method3538((byte) -115);
            class133.method1056(var18, -17453, var19);
            class434.field6143 = null;
            return true;
        } else if (class434.field6143 == class324.field4723) {
            int var20 = class89.field1233.method2405(-361);
            int var21 = class89.field1233.method2398(arg0 ^ 0xAE2D8A0A);
            int var22 = class89.field1233.method2381(-55);
            int var23 = class89.field1233.method2375((byte) 31);
            int var24 = class89.field1233.method2381(-112);
            class630.method3538((byte) -66);
            class220.field2986[var24] = true;
            class422.field6039[var24] = var21;
            class103.field1417[var24] = var23;
            class184.field2458[var24] = var22;
            class314.field4525[var24] = var20;
            class434.field6143 = null;
            return true;
        } else if (class551.field7454 == class434.field6143) {
            class434.field6143 = null;
            return false;
        } else if (class722.field10054 == class434.field6143) {
            int var25 = class89.field1233.method2358((byte) -30);
            class630.method3538((byte) -44);
            class47.method358(102, var25);
            class434.field6143 = null;
            return true;
        } else if (class434.field6143 == class132.field1959) {
            class525.field7184 = class467.method2760(class89.field1233.method2398(-1372747256), -123);
            class434.field6143 = null;
            return true;
        } else if (class434.field6143 == class310.field4463) {
            int var26 = class89.field1233.method2405(arg0 - 363);
            int var27 = class89.field1233.method2376((byte) 108);
            class630.method3538((byte) -74);
            class389.method2462(var27, var26, arg0 ^ 0x2);
            class434.field6143 = null;
            return true;
        } else if (class659.field9118 == class434.field6143) {
            boolean var28 = class89.field1233.method2398(-1372747256) == 1;
            String var29 = class89.field1233.method2379((byte) 85);
            String var30 = var29;
            if (var28) {
                var30 = class89.field1233.method2379((byte) 85);
            }
            int var31 = class89.field1233.method2398(arg0 ^ 0xAE2D8A0A);
            boolean var32 = false;
            if (var31 <= 1) {
                if (!(!class739.field10205 || class635.field8858) || class546.field7401) {
                    var32 = true;
                } else if (var31 <= 1 && class337.method2140(121, var30)) {
                    var32 = true;
                }
            }
            if (!var32 && class150.field2090 == 0) {
                String var33 = class652.method3630((byte) -10, class217.method1425(class89.field1233, -74));
                if (var31 == 2) {
                    class589.method3288(24, true, "<img=1>" + var29, var29, -1, "<img=1>" + var30, 0, var33, null);
                } else if (var31 == 1) {
                    class589.method3288(24, true, "<img=0>" + var29, var29, -1, "<img=0>" + var30, 0, var33, null);
                } else {
                    class589.method3288(24, true, var29, var29, -1, var30, 0, var33, null);
                }
            }
            class434.field6143 = null;
            return true;
        } else if (class434.field6143 == class162.field2205) {
            int var34 = class89.field1233.method2402((byte) -99);
            int var35 = class89.field1233.method2359(arg0 ^ 0xFFFFFFFD);
            class630.method3538((byte) -42);
            class42.method282(var34, 3560, var35);
            class434.field6143 = null;
            return true;
        } else if (class791.field10887 == class434.field6143) {
            int var36 = class89.field1233.method2410(arg0 ^ 0xFF02);
            int var37 = class89.field1233.method2358((byte) -30);
            int var38 = class89.field1233.method2375((byte) 31);
            int var39 = class89.field1233.method2384(10);
            class630.method3538((byte) -37);
            class142.method1087(var38, var37, var39, var36, (byte) -52);
            class434.field6143 = null;
            return true;
        } else if (class523.field7176 == class434.field6143) {
            class515.field7046 = class89.field1233.method2412(arg0 - 85);
            class176.field2350 = class89.field1233.method2375((byte) 31);
            class434.field6143 = null;
            return true;
        } else if (class434.field6143 == class299.field4336) {
            class630.method3538((byte) -95);
            class574.method3209(27315);
            class434.field6143 = null;
            return true;
        } else {
            if (arg0 != 2) {
                field4618 = null;
            }
            if (class751.field10387 == class434.field6143) {
                int var40 = class89.field1233.method2358((byte) -30) << 2;
                int var41 = class89.field1233.method2375((byte) 31);
                int var42 = class89.field1233.method2381(-7);
                int var43 = class89.field1233.method2412(-60);
                int var44 = class89.field1233.method2412(-70);
                class630.method3538((byte) -122);
                class419.method2586(var42, var41, var44, var43, var40, -28384);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class245.field3309) {
                class235.method1528(class69.field963, 90);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class372.field5378) {
                int var45 = class89.field1233.method2402((byte) 68);
                int var46 = class89.field1233.method2410(65280);
                int var47 = class89.field1233.method2384(50);
                class630.method3538((byte) -90);
                class97.method760(var46, var47, var45, true, 5);
                class434.field6143 = null;
                return true;
            } else if (class607.field8244 == class434.field6143) {
                boolean var48 = class89.field1233.method2412(arg0 ^ 0xFFFFFFC9) == 1;
                class630.method3538((byte) -88);
                class516.field7059 = var48;
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class293.field4274) {
                class235.method1528(class676.field9477, 86);
                class434.field6143 = null;
                return true;
            } else if (class492.field6821 == class434.field6143) {
                int var49 = class89.field1233.method2412(-95);
                int[] var50 = new int[4];
                for (int var51 = 0; var51 < 4; var51++) {
                    var50[var51] = class89.field1233.method2358((byte) -30);
                }
                int var52 = class89.field1233.method2405(-361);
                class174 var53 = (class174) class234.field3169.method3953((long) var52, 14);
                if (var53 != null) {
                    class553.method3126(var53.field2336, var50, var49, false);
                }
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class303.field4361) {
                int var54 = class89.field1233.method2398(-1372747256);
                int var55 = class89.field1233.method2381(arg0 ^ 0xFFFFFFF7);
                int var56 = class89.field1233.method2371((byte) -60);
                class13.field216[var55] = var56;
                class287.field4230[var55] = var54;
                class286.field4219[var55] = 1;
                int var57 = class550.field7451[var55] - 1;
                for (int var58 = 0; var58 < var57; var58++) {
                    if (var56 >= class793.field10891[var58]) {
                        class286.field4219[var55] = var58 + 2;
                    }
                }
                class186.field2488[class440.method2643(31, class170.field2275++)] = var55;
                class434.field6143 = null;
                return true;
            } else if (class721.field10049 == class434.field6143) {
                int var59 = class89.field1233.method2359(-1);
                class630.method3538((byte) -115);
                class379.method2423(43, var59);
                class434.field6143 = null;
                return true;
            } else if (client.field4580 == class434.field6143) {
                int var60 = class89.field1233.method2359(-1);
                if (var60 == 65535) {
                    var60 = -1;
                }
                int var61 = class89.field1233.method2398(-1372747256);
                int var62 = class89.field1233.method2359(-1);
                int var63 = class89.field1233.method2398(-1372747256);
                int var64 = class89.field1233.method2359(arg0 ^ 0xFFFFFFFD);
                class87.method715(var63, var60, var62, var61, var64, 2760);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class164.field2223) {
                class235.method1528(class582.field7780, arg0 ^ 0x3E);
                class434.field6143 = null;
                return true;
            } else if (class793.field10899 == class434.field6143) {
                class235.method1528(class600.field8162, 121);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class319.field4603) {
                int var65 = class89.field1233.method2384(arg0 ^ 0x75);
                class630.method3538((byte) -58);
                class97.method760(class363.field5292, var65, 0, true, 5);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class295.field4288) {
                boolean var66 = class89.field1233.method2398(-1372747256) == 1;
                String var67 = class89.field1233.method2379((byte) 85);
                long var68 = (long) class89.field1233.method2359(-1);
                long var70 = (long) class89.field1233.method2373(1223262424);
                int var72 = class89.field1233.method2398(-1372747256);
                long var73 = (var68 << 32) + var70;
                boolean var75 = false;
                Object var76 = null;
                class56 var77 = var66 ? class66.field952 : class285.field4208;
                if (var77 == null) {
                    var75 = true;
                } else {
                    label2134: {
                        for (int var78 = 0; var78 < 100; var78++) {
                            if (class455.field6319[var78] == var73) {
                                var75 = true;
                                break label2134;
                            }
                        }
                        if (var72 <= 1) {
                            if (!(!class739.field10205 || class635.field8858) || class546.field7401) {
                                var75 = true;
                            } else if (class337.method2140(124, var67)) {
                                var75 = true;
                            }
                        }
                    }
                }
                if (!var75 && class150.field2090 == 0) {
                    class455.field6319[class472.field6514] = var73;
                    class472.field6514 = (class472.field6514 + 1) % 100;
                    String var79 = class652.method3630((byte) -10, class217.method1425(class89.field1233, arg0 ^ 0xFFFFFF8F));
                    int var80 = var66 ? 41 : 44;
                    if (var72 == 2 || var72 == 3) {
                        class589.method3288(var80, true, "<img=1>" + var67, var67, -1, "<img=1>" + var67, 0, var79, var77.field789);
                    } else if (var72 == 1) {
                        class589.method3288(var80, true, "<img=0>" + var67, var67, -1, "<img=0>" + var67, 0, var79, var77.field789);
                    } else {
                        class589.method3288(var80, true, var67, var67, -1, var67, 0, var79, var77.field789);
                    }
                }
                class434.field6143 = null;
                return true;
            } else if (class733.field10164 == class434.field6143) {
                int var81 = class89.field1233.method2412(-83);
                int var82 = class89.field1233.method2402((byte) 74);
                class630.method3538((byte) -41);
                class162.method1183(var82, 18, var81);
                class434.field6143 = null;
                return true;
            } else if (class643.field8921 == class434.field6143) {
                class235.method1528(class132.field1950, 42);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class12.field188) {
                int var83 = class89.field1233.method2405(-361);
                int var84 = class89.field1233.method2381(-79);
                class630.method3538((byte) -128);
                class237.method1534(true, var83, (byte) -2, var84);
                class434.field6143 = null;
                return true;
            } else if (class60.field821 == class434.field6143) {
                int var85 = class89.field1233.method2359(arg0 ^ 0xFFFFFFFD);
                int var86 = class89.field1233.method2405(arg0 - 363);
                int var87 = class89.field1233.method2402((byte) 99);
                class630.method3538((byte) -61);
                class382.method2431(var87, (var86 << 16) + var85, 0);
                class434.field6143 = null;
                return true;
            } else if (class621.field8369 == class434.field6143) {
                int var88 = class89.field1233.method2410(65280);
                if (var88 == 65535) {
                    var88 = -1;
                }
                int var89 = class89.field1233.method2384(arg0 ^ 0x2F);
                class630.method3538((byte) -110);
                class97.method760(var88, var89, -1, true, 2);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class258.field3852) {
                for (int var90 = 0; var90 < class599.field8149.length; var90++) {
                    if (class599.field8149[var90] != null) {
                        class599.field8149[var90].field1799 = null;
                        class599.field8149[var90].field1827 = -1;
                    }
                }
                for (int var91 = 0; var91 < class184.field2457; var91++) {
                    class495.field6850[var91].field2336.field1799 = null;
                    class495.field6850[var91].field2336.field1827 = -1;
                }
                class434.field6143 = null;
                return true;
            } else if (class470.field6509 == class434.field6143) {
                class438.field6170 = class89.field1233.method2387((byte) 17) << 3;
                class146.field2072 = class89.field1233.method2398(-1372747256);
                class13.field214 = class89.field1233.method2356(-128) << 3;
                for (class193 var92 = (class193) class558.field7516.method3960(0); var92 != null; var92 = (class193) class558.field7516.method3955((byte) -67)) {
                    int var95 = (int) (var92.field1409 >> 28 & 0x3L);
                    int var96 = (int) (var92.field1409 & 0x3FFFL);
                    int var97 = var96 - class121.field1765;
                    int var98 = (int) (var92.field1409 >> 14 & 0x3FFFL);
                    int var99 = var98 - class230.field3147;
                    if (class146.field2072 == var95 && var97 >= class438.field6170 && (class438.field6170 + 8) > var97 && class13.field214 <= var99 && var99 < class13.field214 + 8) {
                        var92.method792((byte) -89);
                        if (var97 >= 0 && var99 >= 0 && var97 < class597.field8132 && var99 < class628.field8800) {
                            class27.method201(126, var99, class146.field2072, var97);
                        }
                    }
                }
                for (class139 var93 = (class139) class496.field6853.method2551((byte) -108); var93 != null; var93 = (class139) class496.field6853.method2542(arg0 ^ 0xFFFFFF82)) {
                    if (var93.field2034 >= class438.field6170 && var93.field2034 < class438.field6170 + 8 && class13.field214 <= var93.field2033 && var93.field2033 < class13.field214 + 8 && class146.field2072 == var93.field2018) {
                        var93.field2020 = true;
                    }
                }
                for (class139 var94 = (class139) class583.field7785.method2551((byte) -108); var94 != null; var94 = (class139) class583.field7785.method2542(arg0 - 124)) {
                    if (class438.field6170 <= var94.field2034 && var94.field2034 < (class438.field6170 + 8) && class13.field214 <= var94.field2033 && (class13.field214 + 8) > var94.field2033 && class146.field2072 == var94.field2018) {
                        var94.field2020 = true;
                    }
                }
                class434.field6143 = null;
                return true;
            } else if (class618.field8336 == class434.field6143) {
                int var100 = class89.field1233.method2358((byte) -30);
                int var101 = class89.field1233.method2412(arg0 - 110);
                class630.method3538((byte) -49);
                if (var101 == 2) {
                    class150.method1117(-88);
                }
                class69.field968 = var100;
                class488.method2838(var100, (byte) -26);
                class503.method2921(-47, false);
                class173.method1226(class69.field968);
                for (int var102 = 0; var102 < 100; var102++) {
                    class627.field8773[var102] = true;
                }
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class280.field4136) {
                class631.method3541(81, class256.field3816);
                class434.field6143 = null;
                return false;
            } else if (class5.field52 == class434.field6143) {
                class180.field2390 = class194.field2598;
                class713.field9972 = 1;
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class402.field5848) {
                class227.field3104 = class89.field1233.method2398(-1372747256);
                class434.field6143 = null;
                return true;
            } else if (class643.field8929 == class434.field6143) {
                class235.method1528(class59.field815, arg0 ^ 0x21);
                class434.field6143 = null;
                return true;
            } else if (class514.field7041 == class434.field6143) {
                int var103 = class89.field1233.method2370(-2);
                int var104 = class89.field1233.method2384(107);
                int var105 = class89.field1233.method2398(-1372747256);
                String var106 = "";
                String var107 = var106;
                if ((var105 & 0x1) != 0) {
                    var106 = class89.field1233.method2379((byte) 85);
                    if ((var105 & 0x2) == 0) {
                        var107 = var106;
                    } else {
                        var107 = class89.field1233.method2379((byte) 85);
                    }
                }
                String var108 = class89.field1233.method2379((byte) 85);
                if (var103 == 99) {
                    class164.method1188((byte) -122, var108);
                } else if (var107.equals("") || !class337.method2140(115, var107)) {
                    class746.method4129(var103, var106, var107, var108, var104, var106, 16773);
                } else {
                    class434.field6143 = null;
                    return true;
                }
                class434.field6143 = null;
                return true;
            } else if (class658.field9107 == class434.field6143) {
                class5.field54 = class89.field1233.method2398(-1372747256);
                for (int var109 = 0; var109 < class5.field54; var109++) {
                    class255.field3798[var109] = class89.field1233.method2379((byte) 85);
                    class602.field8189[var109] = class89.field1233.method2379((byte) 85);
                    if (class602.field8189[var109].equals("")) {
                        class602.field8189[var109] = class255.field3798[var109];
                    }
                    class424.field6053[var109] = class89.field1233.method2379((byte) 85);
                    class768.field10593[var109] = class89.field1233.method2379((byte) 85);
                    if (class768.field10593[var109].equals("")) {
                        class768.field10593[var109] = class424.field6053[var109];
                    }
                    class749.field10327[var109] = false;
                }
                class180.field2390 = class194.field2598;
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class268.field3950) {
                boolean var110 = class89.field1233.method2398(-1372747256) == 1;
                byte[] var111 = new byte[class206.field2700 - 1];
                class89.field1233.method2389(0, arg0 ^ 0x291337EA, class206.field2700 - 1, var111);
                class516.method2997(var110, arg0 ^ 0x676F, var111);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class424.field6048) {
                byte var112 = class89.field1233.method2409(true);
                int var113 = class89.field1233.method2405(-361);
                class382.field5602.method2273(var113, var112, 0);
                class434.field6143 = null;
                return true;
            } else if (class522.field7163 == class434.field6143) {
                String var114 = class89.field1233.method2379((byte) 85);
                String var115 = class652.method3630((byte) -10, class217.method1425(class89.field1233, -123));
                class746.method4129(6, var114, var114, var115, 0, var114, 16773);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class180.field2394) {
                int var116 = class89.field1233.method2384(104);
                int var117 = class89.field1233.method2359(-1);
                class630.method3538((byte) -36);
                class49.method371(1, var117, var116);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class280.field4137) {
                int var118 = class89.field1233.method2405(-361);
                if (var118 == 65535) {
                    var118 = -1;
                }
                int var119 = class89.field1233.method2402((byte) -105);
                int var120 = class89.field1233.method2376((byte) 62);
                class630.method3538((byte) -62);
                class322.method2041(var119, (byte) -101, var120, var118);
                class322 var121 = class770.field10602.method2467(3, var118);
                class47.method359((byte) -121, var121.field4660, var119, var121.field4675, var121.field4623);
                class82.method687(var119, 10, var121.field4651, var121.field4633, var121.field4684);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class208.field2766) {
                int var122 = class89.field1233.method2359(-1);
                class73 var123;
                if (class363.field5292 == var122) {
                    var123 = class551.field7456;
                } else {
                    var123 = class599.field8149[var122];
                }
                if (var123 == null) {
                    class434.field6143 = null;
                    return true;
                }
                int var124 = class89.field1233.method2359(-1);
                int var125 = class89.field1233.method2398(-1372747256);
                boolean var126 = (var124 & 0x8000) != 0;
                if (var123.field1020 != null && var123.field1050 != null) {
                    boolean var127 = false;
                    if (var125 <= 1) {
                        if (!var126 && (class739.field10205 && !class635.field8858 || class546.field7401)) {
                            var127 = true;
                        } else if (class337.method2140(114, var123.field1020)) {
                            var127 = true;
                        }
                    }
                    if (!var127 && class150.field2090 == 0) {
                        int var128 = -1;
                        String var129;
                        if (var126) {
                            var124 &= 0x7FFF;
                            class146 var130 = class387.method2454(class89.field1233, true);
                            var128 = var130.field2075;
                            var129 = var130.field2071.method1954(class89.field1233, 15628);
                        } else {
                            var129 = class652.method3630((byte) -10, class217.method1425(class89.field1233, arg0 ^ 0xFFFFFF96));
                        }
                        var123.field1797 = var129.trim();
                        var123.field1854 = var124 & 0xFF;
                        var123.field1802 = var124 >> 8;
                        var123.field1875 = 150;
                        int var131;
                        if (var125 == 1 || var125 == 2) {
                            var131 = var126 ? 17 : 1;
                        } else {
                            var131 = var126 ? 17 : 2;
                        }
                        if (var125 == 2) {
                            class589.method3288(var131, true, "<img=1>" + var123.method642(true, -1075074040), var123.field1038, var128, "<img=1>" + var123.method650(false, -12628), 0, var129, null);
                        } else if (var125 == 1) {
                            class589.method3288(var131, true, "<img=0>" + var123.method642(true, -1075074040), var123.field1038, var128, "<img=0>" + var123.method650(false, -12628), 0, var129, null);
                        } else {
                            class589.method3288(var131, true, var123.method642(true, -1075074040), var123.field1038, var128, var123.method650(false, -12628), 0, var129, null);
                        }
                    }
                }
                class434.field6143 = null;
                return true;
            } else if (class614.field8315 == class434.field6143) {
                int var132 = class89.field1233.method2384(118);
                int var133 = class89.field1233.method2358((byte) -30);
                class630.method3538((byte) -52);
                if (var133 == 65535) {
                    var133 = -1;
                }
                class412.method2544(-13542, var133, var132);
                class434.field6143 = null;
                return true;
            } else if (class737.field10193 == class434.field6143) {
                int var134 = class89.field1233.method2412(-107);
                byte var135 = class89.field1233.method2387((byte) 112);
                class630.method3538((byte) -75);
                class433.method2626(var135, (byte) -127, var134);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class428.field6090) {
                class235.method1528(class83.field1174, 124);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class315.field4535) {
                class235.method1528(class164.field2218, 100);
                class434.field6143 = null;
                return true;
            } else if (class574.field7703 == class434.field6143) {
                int var136 = class89.field1233.method2410(arg0 ^ 0xFF02);
                String var137 = class89.field1233.method2379((byte) 85);
                class630.method3538((byte) -85);
                class53.method386(var136, (byte) -120, var137);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class416.field5974) {
                int var138 = class89.field1233.method2376((byte) 71);
                class630.method3538((byte) -73);
                class237 var139 = (class237) class609.field8283.method3953((long) var138, arg0 ^ 0xC);
                if (var139 != null) {
                    class618.method3397(false, true, var139, -86709072);
                }
                if (class189.field2524 != null) {
                    class763.method4242(class189.field2524, true);
                    class189.field2524 = null;
                }
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class290.field4250) {
                int var140 = class89.field1233.method2375((byte) 31);
                int var141 = class89.field1233.method2398(-1372747256);
                int var142 = class89.field1233.method2359(arg0 ^ 0xFFFFFFFD) << 2;
                int var143 = class89.field1233.method2381(-7);
                int var144 = class89.field1233.method2381(-9);
                class630.method3538((byte) -40);
                class402.method2509(false, var140, true, var144, var141, var142, var143);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class39.field601) {
                int var145 = class89.field1233.method2381(-32);
                int var146 = class89.field1233.method2358((byte) -30);
                class382.field5602.method2267((byte) 0, var146, var145);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class309.field4456) {
                class357.field5225 = class89.field1233.method2377(arg0 ^ 0xFFFFFF86);
                class739.field10205 = class89.field1233.method2398(arg0 ^ 0xAE2D8A0A) == 1;
                class434.field6143 = null;
                return true;
            } else if (class788.field10853 == class434.field6143) {
                class235.method1528(class389.field5665, 85);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class327.field4758) {
                int var147 = class89.field1233.method2384(57);
                class630.method3538((byte) -101);
                class434.field6143 = null;
                if (var147 == -1) {
                    class518.field7072 = -1;
                    class704.field9868 = -1;
                } else {
                    int var148 = (var147 & 0xFFFFB7C) >> 14;
                    int var149 = var147 & 0x3FFF;
                    int var150 = var148 - class121.field1765;
                    if (var150 < 0) {
                        var150 = 0;
                    } else if (var150 >= class597.field8132) {
                        var150 = class597.field8132;
                    }
                    int var151 = var149 - class230.field3147;
                    if (var151 < 0) {
                        var151 = 0;
                    } else if (class628.field8800 <= var151) {
                        var151 = class628.field8800;
                    }
                    class518.field7072 = (var150 << 9) + 256;
                    class704.field9868 = (var151 << 9) + 256;
                }
                return true;
            } else if (class499.field6887 == class434.field6143) {
                int var152 = class89.field1233.method2375((byte) 31);
                int var153 = class89.field1233.method2359(-1);
                int var154 = class89.field1233.method2371((byte) -57);
                class630.method3538((byte) -104);
                class237 var155 = (class237) class609.field8283.method3953((long) var154, 14);
                if (var155 != null) {
                    class618.method3397(false, var155.field3202 != var153, var155, -86709072);
                }
                class99.method779(var153, var154, false, (byte) 19, var152);
                class434.field6143 = null;
                return true;
            } else if (class73.field1048 == class434.field6143) {
                int var156 = class89.field1233.method2384(arg0 + 79);
                class132.field1949 = class730.field10124.method615((byte) -37, var156);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class418.field6003) {
                class2.method7(arg0 ^ 0x3D);
                class434.field6143 = null;
                return true;
            } else if (class777.field10676 == class434.field6143) {
                class419.method2585(0);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class384.field5618) {
                class73.field1068 = class89.field1233.method2375((byte) 31) == 1;
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class288.field4238) {
                boolean var157 = class89.field1233.method2398(-1372747256) == 1;
                String var158 = class89.field1233.method2379((byte) 85);
                String var159 = var158;
                if (var157) {
                    var159 = class89.field1233.method2379((byte) 85);
                }
                long var160 = class89.field1233.method2366(true);
                long var162 = (long) class89.field1233.method2359(-1);
                long var164 = (long) class89.field1233.method2373(arg0 ^ 0x48E980DA);
                int var166 = class89.field1233.method2398(-1372747256);
                long var167 = (var162 << 32) + var164;
                boolean var169 = false;
                int var170 = 0;
                while (true) {
                    if (var170 >= 100) {
                        if (var166 <= 1) {
                            if (!(!class739.field10205 || class635.field8858) || class546.field7401) {
                                var169 = true;
                            } else if (class337.method2140(120, var159)) {
                                var169 = true;
                            }
                        }
                        break;
                    }
                    if (class455.field6319[var170] == var167) {
                        var169 = true;
                        break;
                    }
                    var170++;
                }
                if (!var169 && class150.field2090 == 0) {
                    class455.field6319[class472.field6514] = var167;
                    class472.field6514 = (class472.field6514 + 1) % 100;
                    String var171 = class652.method3630((byte) -10, class217.method1425(class89.field1233, -110));
                    if (var166 == 2 || var166 == 3) {
                        class589.method3288(9, true, "<img=1>" + var158, var158, -1, "<img=1>" + var159, 0, var171, class23.method184(var160, false));
                    } else if (var166 == 1) {
                        class589.method3288(9, true, "<img=0>" + var158, var158, -1, "<img=0>" + var159, 0, var171, class23.method184(var160, false));
                    } else {
                        class589.method3288(9, true, var158, var158, -1, var159, 0, var171, class23.method184(var160, false));
                    }
                }
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class305.field4414) {
                String var172 = class89.field1233.method2379((byte) 85);
                boolean var173 = class89.field1233.method2398(arg0 ^ 0xAE2D8A0A) == 1;
                String var174;
                if (var173) {
                    var174 = class89.field1233.method2379((byte) 85);
                } else {
                    var174 = var172;
                }
                int var175 = class89.field1233.method2359(-1);
                byte var176 = class89.field1233.method2387((byte) -128);
                boolean var177 = false;
                if (var176 == -128) {
                    var177 = true;
                }
                if (var177) {
                    if (class587.field7825 == 0) {
                        class434.field6143 = null;
                        return true;
                    }
                    boolean var178 = false;
                    int var179;
                    for (var179 = 0; class587.field7825 > var179 && (!class39.field598[var179].field8289.equals(var174) || class39.field598[var179].field8294 != var175); var179++) {
                    }
                    if (class587.field7825 > var179) {
                        while (class587.field7825 - 1 > var179) {
                            class39.field598[var179] = class39.field598[var179 + 1];
                            var179++;
                        }
                        class587.field7825--;
                        class39.field598[class587.field7825] = null;
                    }
                } else {
                    String var180 = class89.field1233.method2379((byte) 85);
                    class610 var181 = new class610();
                    var181.field8290 = var172;
                    var181.field8289 = var174;
                    var181.field8292 = class194.method1339(arg0 ^ 0x46C9, var181.field8289);
                    var181.field8297 = var176;
                    var181.field8293 = var180;
                    var181.field8294 = var175;
                    int var182;
                    for (var182 = class587.field7825 - 1; var182 >= 0; var182--) {
                        int var183 = class39.field598[var182].field8292.compareTo(var181.field8292);
                        if (var183 == 0) {
                            class39.field598[var182].field8294 = var175;
                            class39.field598[var182].field8297 = var176;
                            class39.field598[var182].field8293 = var180;
                            if (var174.equals(class551.field7456.field1020)) {
                                class515.field7047 = var176;
                            }
                            class235.field3191 = class194.field2598;
                            class434.field6143 = null;
                            return true;
                        }
                        if (var183 < 0) {
                            break;
                        }
                    }
                    if (class587.field7825 >= class39.field598.length) {
                        class434.field6143 = null;
                        return true;
                    }
                    for (int var184 = class587.field7825 - 1; var184 > var182; var184--) {
                        class39.field598[var184 + 1] = class39.field598[var184];
                    }
                    if (class587.field7825 == 0) {
                        class39.field598 = new class610[100];
                    }
                    class39.field598[var182 + 1] = var181;
                    class587.field7825++;
                    if (var174.equals(class551.field7456.field1020)) {
                        class515.field7047 = var176;
                    }
                }
                class235.field3191 = class194.field2598;
                class434.field6143 = null;
                return true;
            } else if (class74.field1097 == class434.field6143) {
                int var185 = class89.field1233.method2359(-1);
                int var186 = class89.field1233.method2398(-1372747256);
                boolean var187 = (var186 & 0x1) == 1;
                class360.method2262((byte) 3, var185, var187);
                int var188 = class89.field1233.method2359(-1);
                for (int var189 = 0; var189 < var188; var189++) {
                    int var190 = class89.field1233.method2375((byte) 31);
                    if (var190 == 255) {
                        var190 = class89.field1233.method2371((byte) -99);
                    }
                    int var191 = class89.field1233.method2358((byte) -30);
                    class388.method2456(var189, -100, var187, var185, var191 - 1, var190);
                }
                class40.field635[class440.method2643(31, class334.field4867++)] = var185;
                class434.field6143 = null;
                return true;
            } else if (class666.field9213 == class434.field6143) {
                boolean var192 = class89.field1233.method2398(arg0 ^ 0xAE2D8A0A) == 1;
                String var193 = class89.field1233.method2379((byte) 85);
                String var194 = var193;
                if (var192) {
                    var194 = class89.field1233.method2379((byte) 85);
                }
                int var195 = class89.field1233.method2398(arg0 - 1372747258);
                int var196 = class89.field1233.method2359(-1);
                boolean var197 = false;
                if (var195 <= 1 && class337.method2140(126, var194)) {
                    var197 = true;
                }
                if (!var197 && class150.field2090 == 0) {
                    String var198 = class445.field6245.method609(var196, 17408).method1954(class89.field1233, 15628);
                    if (var195 == 2) {
                        class589.method3288(25, true, "<img=1>" + var193, var193, var196, "<img=1>" + var194, 0, var198, null);
                    } else if (var195 == 1) {
                        class589.method3288(25, true, "<img=0>" + var193, var193, var196, "<img=0>" + var194, 0, var198, null);
                    } else {
                        class589.method3288(25, true, var193, var193, var196, var194, 0, var198, null);
                    }
                }
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class118.field1714) {
                int var199 = class89.field1233.method2384(59);
                int var200 = class89.field1233.method2371((byte) -86);
                class630.method3538((byte) -41);
                class237 var201 = (class237) class609.field8283.method3953((long) var200, arg0 ^ 0xC);
                class237 var202 = (class237) class609.field8283.method3953((long) var199, 14);
                if (var202 != null) {
                    class618.method3397(false, var201 == null || var201.field3202 != var202.field3202, var202, -86709072);
                }
                if (var201 != null) {
                    var201.method792((byte) -105);
                    class609.field8283.method3962((long) var199, var201, -119);
                }
                class668 var203 = class536.method3067(var200, arg0 ^ 0x2);
                if (var203 != null) {
                    class763.method4242(var203, true);
                }
                class668 var204 = class536.method3067(var199, arg0 ^ 0x2);
                if (var204 != null) {
                    class763.method4242(var204, true);
                    class446.method2678(127, true, var204);
                }
                if (class69.field968 != -1) {
                    class274.method1782((byte) -47, 1, class69.field968);
                }
                class434.field6143 = null;
                return true;
            } else if (class535.field7287 == class434.field6143) {
                class235.method1528(class140.field2049, 59);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class40.field629) {
                String var205 = class89.field1233.method2379((byte) 85);
                Object[] var206 = new Object[var205.length() + 1];
                for (int var207 = var205.length() - 1; var207 >= 0; var207--) {
                    if (var205.charAt(var207) == 's') {
                        var206[var207 + 1] = class89.field1233.method2379((byte) 85);
                    } else {
                        var206[var207 + 1] = Integer.valueOf(class89.field1233.method2384(72));
                    }
                }
                var206[0] = Integer.valueOf(class89.field1233.method2384(arg0 + 87));
                class630.method3538((byte) -119);
                class12 var208 = new class12();
                var208.field186 = var206;
                class173.method1235(var208);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class383.field5607) {
                class379.method2422(true);
                class434.field6143 = null;
                return false;
            } else if (class434.field6143 == class271.field3994) {
                class89.field1233.field5459 += 28;
                if (class89.field1233.method2407((byte) -122)) {
                    class296.method1883(class89.field1233.field5459 - 28, class89.field1233, true);
                }
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class186.field2483) {
                class382.field5602.method2270(0);
                class56.field782 += 32;
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class339.field4909) {
                if (class632.field8832 != null) {
                    class142.method1090(-1, -352753888, class712.field9959.field1277.method1299(74), -1, false);
                }
                byte[] var209 = new byte[class206.field2700];
                class89.field1233.method1991(class206.field2700, 0, (byte) -126, var209);
                String var210 = class349.method2203(var209, 1958, 0, class206.field2700);
                class142.method1088(class712.field9959.field1270.method4293(55) == 1, -22283, true, var210, class730.field10124);
                class434.field6143 = null;
                return true;
            } else if (class679.field9492 == class434.field6143) {
                class631.method3541(arg0 ^ 0x6B, false);
                class434.field6143 = null;
                return false;
            } else if (class434.field6143 == class121.field1760) {
                int var211 = class89.field1233.method2358((byte) -30);
                int var212 = class89.field1233.method2371((byte) -125);
                class630.method3538((byte) -86);
                class333.method2091(-115, var211, var212);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class260.field3870) {
                int var213 = class89.field1233.method2381(-92);
                class630.method3538((byte) -101);
                class549.field7447 = var213;
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class232.field3164) {
                int var214 = class89.field1233.method2405(-361);
                int var215 = class89.field1233.method2371((byte) -87);
                class382.field5602.method2273(var214, var215, 0);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class160.field2196) {
                boolean var216 = class89.field1233.method2398(-1372747256) == 1;
                String var217 = class89.field1233.method2379((byte) 85);
                String var218 = var217;
                if (var216) {
                    var218 = class89.field1233.method2379((byte) 85);
                }
                long var219 = (long) class89.field1233.method2359(-1);
                long var221 = (long) class89.field1233.method2373(1223262424);
                int var223 = class89.field1233.method2398(-1372747256);
                long var224 = (var219 << 32) + var221;
                boolean var226 = false;
                int var227 = 0;
                while (true) {
                    if (var227 >= 100) {
                        if (var223 <= 1) {
                            if (!(!class739.field10205 || class635.field8858) || class546.field7401) {
                                var226 = true;
                            } else if (class337.method2140(114, var218)) {
                                var226 = true;
                            }
                        }
                        break;
                    }
                    if (class455.field6319[var227] == var224) {
                        var226 = true;
                        break;
                    }
                    var227++;
                }
                if (!var226 && class150.field2090 == 0) {
                    class455.field6319[class472.field6514] = var224;
                    class472.field6514 = (class472.field6514 + 1) % 100;
                    String var228 = class652.method3630((byte) -10, class217.method1425(class89.field1233, -69));
                    if (var223 == 2) {
                        class589.method3288(7, true, "<img=1>" + var217, var217, -1, "<img=1>" + var218, 0, var228, null);
                    } else if (var223 == 1) {
                        class589.method3288(7, true, "<img=0>" + var217, var217, -1, "<img=0>" + var218, 0, var228, null);
                    } else {
                        class589.method3288(3, true, var217, var217, -1, var218, 0, var228, null);
                    }
                }
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class247.field3684) {
                int var229 = class89.field1233.method2376((byte) 116);
                if (class643.field8928 != var229) {
                    class643.field8928 = var229;
                    class173.method1238(class237.field3207, -1, -1);
                }
                class434.field6143 = null;
                return true;
            } else if (class596.field8127 == class434.field6143) {
                if (class632.field8832 != null) {
                    class142.method1090(-1, -352753888, class712.field9959.field1277.method1299(65), -1, false);
                }
                byte[] var230 = new byte[class206.field2700];
                class89.field1233.method1991(class206.field2700, 0, (byte) 7, var230);
                String var231 = class349.method2203(var230, 1958, 0, class206.field2700);
                String var232 = "opensn";
                if (!class299.field4335 || class155.method1130((byte) 7, var231, class730.field10124, var232, 1).field8321 == 2) {
                    class700.method3898(0, true, class730.field10124, var232, var231, class712.field9959.field1270.method4293(49) == 1);
                }
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class348.field5106) {
                int var233 = class89.field1233.method2384(6);
                class630.method3538((byte) -73);
                class97.method760(-1, var233, -1, true, 3);
                class434.field6143 = null;
                return true;
            } else if (class498.field6875 == class434.field6143) {
                class71.field1007 = class89.field1233.method2409(true);
                class434.field6143 = null;
                if (class71.field1007 == 0 || class71.field1007 == 1) {
                    class262.field3885 = true;
                }
                return true;
            } else if (class82.field1158 == class434.field6143) {
                class24.method194(class730.field10124, class89.field1233, (byte) -112, class206.field2700);
                class434.field6143 = null;
                return true;
            } else if (class620.field8354 == class434.field6143) {
                int var234 = class89.field1233.method2398(-1372747256);
                String var235 = class89.field1233.method2379((byte) 85);
                int var236 = class89.field1233.method2375((byte) 31);
                int var237 = class89.field1233.method2358((byte) -30);
                if (var237 == 65535) {
                    var237 = -1;
                }
                if (var234 >= 1 && var234 <= 8) {
                    if (var235.equalsIgnoreCase("null")) {
                        var235 = null;
                    }
                    class315.field4540[var234 - 1] = var235;
                    class85.field1189[var234 - 1] = var237;
                    class269.field3960[var234 - 1] = var236 == 0;
                }
                class434.field6143 = null;
                return true;
            } else if (class93.field1330 == class434.field6143) {
                int var238 = class89.field1233.method2410(65280);
                int var239 = class89.field1233.method2405(-361);
                int var240 = class89.field1233.method2359(arg0 ^ 0xFFFFFFFD);
                int var241 = class89.field1233.method2402((byte) 95);
                class630.method3538((byte) -126);
                class47.method359((byte) -52, var240, var241, var239, var238);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class26.field386) {
                int var242 = class89.field1233.method2397((byte) -78);
                int var243 = class89.field1233.method2355(3);
                int var244 = class89.field1233.method2376((byte) 122);
                class630.method3538((byte) -110);
                class284.method1821(var242, var244, (byte) 55, var243);
                class434.field6143 = null;
                return true;
            } else if (class648.field9004 == class434.field6143) {
                class270.method1756(false, class89.field1233.method2379((byte) 85));
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class290.field4246) {
                boolean var245 = class89.field1233.method2398(-1372747256) == 1;
                String var246 = class89.field1233.method2379((byte) 85);
                long var247 = (long) class89.field1233.method2359(-1);
                long var249 = (long) class89.field1233.method2373(1223262424);
                int var251 = class89.field1233.method2398(-1372747256);
                int var252 = class89.field1233.method2359(arg0 ^ 0xFFFFFFFD);
                long var253 = (var247 << 32) + var249;
                boolean var255 = false;
                Object var256 = null;
                class56 var257 = var245 ? class66.field952 : class285.field4208;
                if (var257 == null) {
                    var255 = true;
                } else {
                    label2172: {
                        for (int var258 = 0; var258 < 100; var258++) {
                            if (class455.field6319[var258] == var253) {
                                var255 = true;
                                break label2172;
                            }
                        }
                        if (var251 <= 1 && class337.method2140(115, var246)) {
                            var255 = true;
                        }
                    }
                }
                if (!var255 && class150.field2090 == 0) {
                    class455.field6319[class472.field6514] = var253;
                    class472.field6514 = (class472.field6514 + 1) % 100;
                    String var259 = class445.field6245.method609(var252, 17408).method1954(class89.field1233, 15628);
                    int var260 = var245 ? 42 : 45;
                    if (var251 == 2 || var251 == 3) {
                        class589.method3288(var260, true, "<img=1>" + var246, var246, var252, "<img=1>" + var246, 0, var259, var257.field789);
                    } else if (var251 == 1) {
                        class589.method3288(var260, true, "<img=0>" + var246, var246, var252, "<img=0>" + var246, 0, var259, var257.field789);
                    } else {
                        class589.method3288(var260, true, var246, var246, var252, var246, 0, var259, var257.field789);
                    }
                }
                class434.field6143 = null;
                return true;
            } else if (class500.field6892 == class434.field6143) {
                if (class779.method4306(class458.field6355, 92)) {
                    class385.field5623 = (int) ((float) class89.field1233.method2359(-1) * 2.5F);
                } else {
                    class385.field5623 = class89.field1233.method2359(arg0 ^ 0xFFFFFFFD) * 30;
                }
                class706.field9907 = class194.field2598;
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class165.field2235) {
                int var261 = class89.field1233.method2412(-54);
                int var262 = class89.field1233.method2359(-1);
                int var263 = class89.field1233.method2402((byte) -125);
                int var264 = class89.field1233.method2410(65280);
                class630.method3538((byte) -79);
                class74.method663(var263, var261, var264, (byte) -63, var262);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class406.field5884) {
                while (class206.field2700 > class89.field1233.field5459) {
                    boolean var275 = class89.field1233.method2398(-1372747256) == 1;
                    String var276 = class89.field1233.method2379((byte) 85);
                    String var277 = class89.field1233.method2379((byte) 85);
                    int var278 = class89.field1233.method2359(-1);
                    int var279 = class89.field1233.method2398(-1372747256);
                    String var280 = "";
                    boolean var281 = false;
                    if (var278 > 0) {
                        var280 = class89.field1233.method2379((byte) 85);
                        var281 = class89.field1233.method2398(arg0 ^ 0xAE2D8A0A) == 1;
                    }
                    for (int var282 = 0; var282 < class671.field9452; var282++) {
                        if (var275) {
                            if (var277.equals(class42.field653[var282])) {
                                class42.field653[var282] = var276;
                                class246.field3374[var282] = var277;
                                var276 = null;
                                break;
                            }
                        } else if (var276.equals(class42.field653[var282])) {
                            if (class65.field924[var282] != var278) {
                                boolean var283 = true;
                                for (class565 var284 = (class565) class596.field8125.method109(0); var284 != null; var284 = (class565) class596.field8125.method115((byte) 90)) {
                                    if (var284.field7564.equals(var276)) {
                                        if (var278 != 0 && var284.field7566 == 0) {
                                            var284.method2922((byte) -77);
                                            var283 = false;
                                        } else if (var278 == 0 && var284.field7566 != 0) {
                                            var284.method2922((byte) -72);
                                            var283 = false;
                                        }
                                    }
                                }
                                if (var283) {
                                    class596.field8125.method106(new class565(var276, var278), (byte) 119);
                                }
                                class65.field924[var282] = var278;
                            }
                            class246.field3374[var282] = var277;
                            class176.field2353[var282] = var280;
                            class688.field9679[var282] = var279;
                            var276 = null;
                            class281.field4144[var282] = var281;
                            break;
                        }
                    }
                    if (var276 != null && class671.field9452 < 200) {
                        class42.field653[class671.field9452] = var276;
                        class246.field3374[class671.field9452] = var277;
                        class65.field924[class671.field9452] = var278;
                        class176.field2353[class671.field9452] = var280;
                        class688.field9679[class671.field9452] = var279;
                        class281.field4144[class671.field9452] = var281;
                        class671.field9452++;
                    }
                }
                class713.field9972 = 2;
                class180.field2390 = class194.field2598;
                boolean var265 = false;
                int var266 = class671.field9452;
                while (var266 > 0) {
                    var266--;
                    boolean var267 = true;
                    for (int var268 = 0; var268 < var266; var268++) {
                        if (class65.field924[var268] != class369.field5359.field1148 && class65.field924[var268 + 1] == class369.field5359.field1148 || class65.field924[var268] == 0 && class65.field924[var268 + 1] != 0) {
                            int var269 = class65.field924[var268];
                            class65.field924[var268] = class65.field924[var268 + 1];
                            class65.field924[var268 + 1] = var269;
                            String var270 = class176.field2353[var268];
                            class176.field2353[var268] = class176.field2353[var268 + 1];
                            class176.field2353[var268 + 1] = var270;
                            String var271 = class42.field653[var268];
                            class42.field653[var268] = class42.field653[var268 + 1];
                            class42.field653[var268 + 1] = var271;
                            String var272 = class246.field3374[var268];
                            class246.field3374[var268] = class246.field3374[var268 + 1];
                            class246.field3374[var268 + 1] = var272;
                            int var273 = class688.field9679[var268];
                            class688.field9679[var268] = class688.field9679[var268 + 1];
                            class688.field9679[var268 + 1] = var273;
                            boolean var274 = class281.field4144[var268];
                            class281.field4144[var268] = class281.field4144[var268 + 1];
                            var267 = false;
                            class281.field4144[var268 + 1] = var274;
                        }
                    }
                    if (var267) {
                        break;
                    }
                }
                class434.field6143 = null;
                return true;
            } else if (class97.field1353 == class434.field6143) {
                int var285 = class89.field1233.method2412(-128);
                int var286 = var285 >> 2;
                int var287 = var285 & 0x3;
                int var288 = class332.field4810[var286];
                int var289 = class89.field1233.method2384(36);
                int var290 = var289 >> 28 & 0x3;
                int var291 = var289 >> 14 & 0x3FFF;
                int var292 = var289 & 0x3FFF;
                int var293 = class89.field1233.method2358((byte) -30);
                int var294 = var291 - class121.field1765;
                int var295 = var292 - class230.field3147;
                if (var293 == 65535) {
                    var293 = -1;
                }
                class194.method1334(var295, var286, (byte) -8, var288, var287, var290, var294, var293);
                class434.field6143 = null;
                return true;
            } else if (class471.field6511 == class434.field6143) {
                String var296 = class89.field1233.method2379((byte) 85);
                int var297 = class89.field1233.method2376((byte) 95);
                class630.method3538((byte) -118);
                class277.method1793(25243, var297, var296);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class238.field3211) {
                class235.method1528(class419.field6013, 39);
                class434.field6143 = null;
                return true;
            } else if (class764.field10562 == class434.field6143) {
                int var298 = class89.field1233.method2359(-1);
                int var299 = class89.field1233.method2398(-1372747256);
                boolean var300 = (var299 & 0x1) == 1;
                while (class89.field1233.field5459 < class206.field2700) {
                    int var301 = class89.field1233.method2370(-2);
                    int var302 = class89.field1233.method2359(-1);
                    int var303 = 0;
                    if (var302 != 0) {
                        var303 = class89.field1233.method2398(-1372747256);
                        if (var303 == 255) {
                            var303 = class89.field1233.method2384(arg0 + 42);
                        }
                    }
                    class388.method2456(var301, -101, var300, var298, var302 - 1, var303);
                }
                class40.field635[class440.method2643(class334.field4867++, 31)] = var298;
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class224.field3066) {
                class235.method1528(class688.field9674, 100);
                class434.field6143 = null;
                return true;
            } else if (class62.field885 == class434.field6143) {
                int var304 = class89.field1233.method2359(-1);
                if (var304 == 65535) {
                    var304 = -1;
                }
                int var305 = class89.field1233.method2398(-1372747256);
                int var306 = class89.field1233.method2359(-1);
                int var307 = class89.field1233.method2398(-1372747256);
                class642.method3567(true, var306, var305, -102, var304, var307, 256);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class245.field3314) {
                boolean var308 = class89.field1233.method2398(-1372747256) == 1;
                String var309 = class89.field1233.method2379((byte) 85);
                String var310 = var309;
                if (var308) {
                    var310 = class89.field1233.method2379((byte) 85);
                }
                long var311 = class89.field1233.method2366(true);
                long var313 = (long) class89.field1233.method2359(-1);
                long var315 = (long) class89.field1233.method2373(1223262424);
                int var317 = class89.field1233.method2398(-1372747256);
                int var318 = class89.field1233.method2359(-1);
                long var319 = (var313 << 32) + var315;
                boolean var321 = false;
                int var322 = 0;
                while (true) {
                    if (var322 >= 100) {
                        if (var317 <= 1 && class337.method2140(113, var310)) {
                            var321 = true;
                        }
                        break;
                    }
                    if (class455.field6319[var322] == var319) {
                        var321 = true;
                        break;
                    }
                    var322++;
                }
                if (!var321 && class150.field2090 == 0) {
                    class455.field6319[class472.field6514] = var319;
                    class472.field6514 = (class472.field6514 + 1) % 100;
                    String var323 = class445.field6245.method609(var318, 17408).method1954(class89.field1233, 15628);
                    if (var317 == 2) {
                        class589.method3288(20, true, "<img=1>" + var309, var309, var318, "<img=1>" + var310, 0, var323, class23.method184(var311, false));
                    } else if (var317 == 1) {
                        class589.method3288(20, true, "<img=0>" + var309, var309, var318, "<img=0>" + var310, 0, var323, class23.method184(var311, false));
                    } else {
                        class589.method3288(20, true, var309, var309, var318, var310, 0, var323, class23.method184(var311, false));
                    }
                }
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class400.field5840) {
                class443.method2665(class89.field1233, class206.field2700, 1442);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class42.field648) {
                int var324 = class89.field1233.method2376((byte) 63);
                int var325 = class89.field1233.method2410(65280);
                if (var325 == 65535) {
                    var325 = -1;
                }
                class630.method3538((byte) -104);
                class97.method760(var325, var324, -1, true, 1);
                class434.field6143 = null;
                return true;
            } else if (class611.field8306 == class434.field6143) {
                int var326 = class89.field1233.method2381(-48);
                int var327 = class89.field1233.method2375((byte) 31);
                if (var326 == 255) {
                    var326 = -1;
                    var327 = -1;
                }
                class476.method2786(var327, var326, arg0 ^ 0xFFFFFFA2);
                class434.field6143 = null;
                return true;
            } else if (class581.field7769 == class434.field6143) {
                class343.field5055 = class89.field1233.method2398(-1372747256);
                class706.field9907 = class194.field2598;
                class434.field6143 = null;
                return true;
            } else if (class565.field7565 == class434.field6143) {
                int var328 = class89.field1233.method2402((byte) -121);
                int var329 = class89.field1233.method2405(arg0 ^ 0xFFFFFE95);
                if (var329 == 65535) {
                    var329 = -1;
                }
                int var330 = class89.field1233.method2371((byte) -15);
                int var331 = class89.field1233.method2410(arg0 ^ 0xFF02);
                if (var331 == 65535) {
                    var331 = -1;
                }
                class630.method3538((byte) -118);
                for (int var332 = var329; var332 <= var331; var332++) {
                    long var333 = ((long) var328 << 32) + (long) var332;
                    class111 var335 = (class111) class298.field4316.method3953(var333, 14);
                    class111 var336;
                    if (var335 != null) {
                        var336 = new class111(var330, var335.field1529);
                        var335.method792((byte) -107);
                    } else if (var332 == -1) {
                        var336 = new class111(var330, class536.method3067(var328, arg0 ^ 0x2).field9272.field1529);
                    } else {
                        var336 = new class111(var330, -1);
                    }
                    class298.field4316.method3962(var333, var336, -121);
                }
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class159.field2193) {
                class438.field6170 = class89.field1233.method2365(arg0 - 2) << 3;
                class13.field214 = class89.field1233.method2365(0) << 3;
                class146.field2072 = class89.field1233.method2412(arg0 ^ 0xFFFFFFC7);
                while (class89.field1233.field5459 < class206.field2700) {
                    class288 var337 = class243.method1569((byte) 43)[class89.field1233.method2398(-1372747256)];
                    class235.method1528(var337, 95);
                }
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class334.field4863) {
                int var338 = class89.field1233.method2405(-361);
                String var339 = class89.field1233.method2379((byte) 85);
                class630.method3538((byte) -39);
                class53.method386(var338, (byte) -118, var339);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class179.field2384) {
                class235.field3191 = class194.field2598;
                if (class206.field2700 == 0) {
                    class39.field598 = null;
                    class83.field1166 = null;
                    class525.field7190 = null;
                    class434.field6143 = null;
                    class587.field7825 = 0;
                    return true;
                }
                class525.field7190 = class89.field1233.method2379((byte) 85);
                boolean var340 = class89.field1233.method2398(arg0 - 1372747258) == 1;
                if (var340) {
                    class89.field1233.method2379((byte) 85);
                }
                long var341 = class89.field1233.method2366(true);
                class83.field1166 = class667.method3693(-14014, var341);
                class503.field6965 = class89.field1233.method2387((byte) -104);
                int var343 = class89.field1233.method2398(-1372747256);
                if (var343 == 255) {
                    class434.field6143 = null;
                    return true;
                }
                class587.field7825 = var343;
                class610[] var344 = new class610[100];
                for (int var345 = 0; var345 < class587.field7825; var345++) {
                    var344[var345] = new class610();
                    var344[var345].field8290 = class89.field1233.method2379((byte) 85);
                    boolean var351 = class89.field1233.method2398(-1372747256) == 1;
                    if (var351) {
                        var344[var345].field8289 = class89.field1233.method2379((byte) 85);
                    } else {
                        var344[var345].field8289 = var344[var345].field8290;
                    }
                    var344[var345].field8292 = class194.method1339(arg0 + 18121, var344[var345].field8289);
                    var344[var345].field8294 = class89.field1233.method2359(-1);
                    var344[var345].field8297 = class89.field1233.method2387((byte) 62);
                    var344[var345].field8293 = class89.field1233.method2379((byte) 85);
                    if (var344[var345].field8289.equals(class551.field7456.field1020)) {
                        class515.field7047 = var344[var345].field8297;
                    }
                }
                boolean var346 = false;
                int var347 = class587.field7825;
                while (var347 > 0) {
                    boolean var348 = true;
                    var347--;
                    for (int var349 = 0; var349 < var347; var349++) {
                        if (var344[var349].field8292.compareTo(var344[var349 + 1].field8292) > 0) {
                            class610 var350 = var344[var349];
                            var344[var349] = var344[var349 + 1];
                            var344[var349 + 1] = var350;
                            var348 = false;
                        }
                    }
                    if (var348) {
                        break;
                    }
                }
                class39.field598 = var344;
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class270.field3985) {
                class298.method1889(arg0 ^ 0x698904EA);
                class434.field6143 = null;
                return false;
            } else if (class434.field6143 == class359.field5247) {
                class630.method3538((byte) -74);
                class558.method3145((byte) -116);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class190.field2526) {
                int var352 = class89.field1233.method2371((byte) -78);
                int var353 = class89.field1233.method2405(arg0 - 363);
                int var354 = class89.field1233.method2405(-361);
                int var355 = class89.field1233.method2359(-1);
                class630.method3538((byte) -99);
                class97.method760(var353 | var354 << 16, var352, var355, true, 7);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class429.field6108) {
                int var356 = class89.field1233.method2398(arg0 ^ 0xAE2D8A0A);
                int var357 = var356 >> 5;
                int var358 = var356 & 0x1F;
                if (var358 == 0) {
                    class581.field7771[var357] = null;
                    class434.field6143 = null;
                    return true;
                }
                class553 var359 = new class553();
                var359.field7465 = var358;
                var359.field7468 = class89.field1233.method2398(-1372747256);
                if (var359.field7468 >= 0 && class399.field5839.length > var359.field7468) {
                    if (var359.field7465 == 1 || var359.field7465 == 10) {
                        var359.field7467 = class89.field1233.method2359(-1);
                        class89.field1233.field5459 += 6;
                    } else if (var359.field7465 >= 2 && var359.field7465 <= 6) {
                        if (var359.field7465 == 2) {
                            var359.field7469 = 256;
                            var359.field7464 = 256;
                        }
                        if (var359.field7465 == 3) {
                            var359.field7464 = 256;
                            var359.field7469 = 0;
                        }
                        if (var359.field7465 == 4) {
                            var359.field7464 = 256;
                            var359.field7469 = 512;
                        }
                        if (var359.field7465 == 5) {
                            var359.field7464 = 0;
                            var359.field7469 = 256;
                        }
                        if (var359.field7465 == 6) {
                            var359.field7464 = 512;
                            var359.field7469 = 256;
                        }
                        var359.field7465 = 2;
                        var359.field7470 = class89.field1233.method2398(arg0 ^ 0xAE2D8A0A);
                        var359.field7469 += class89.field1233.method2359(arg0 ^ 0xFFFFFFFD) - class121.field1765 << 9;
                        var359.field7464 += class89.field1233.method2359(-1) - class230.field3147 << 9;
                        var359.field7460 = class89.field1233.method2398(-1372747256) << 2;
                        var359.field7461 = class89.field1233.method2359(-1);
                    }
                    var359.field7463 = class89.field1233.method2359(arg0 ^ 0xFFFFFFFD);
                    if (var359.field7463 == 65535) {
                        var359.field7463 = -1;
                    }
                    class581.field7771[var357] = var359;
                }
                class434.field6143 = null;
                return true;
            } else if (class581.field7773 == class434.field6143) {
                if (class69.field968 != -1) {
                    class274.method1782((byte) -47, 0, class69.field968);
                }
                class434.field6143 = null;
                return true;
            } else if (class756.field10488 == class434.field6143) {
                class235.method1528(class686.field9644, arg0 + 100);
                class434.field6143 = null;
                return true;
            } else if (class716.field9998 == class434.field6143) {
                int var360 = class89.field1233.method2375((byte) 31);
                int var361 = class89.field1233.method2410(arg0 + 65278);
                if (var361 == 65535) {
                    var361 = -1;
                }
                int var362 = class89.field1233.method2375((byte) 31);
                class573.method3205(arg0 - 29, var362, var360, var361);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class195.field2608) {
                int var363 = class89.field1233.method2413(-19710);
                int var364 = class89.field1233.method2359(-1);
                if (var364 == 65535) {
                    var364 = -1;
                }
                int var365 = class89.field1233.method2412(arg0 - 116);
                class176.method1243(var364, var365, (byte) -124, var363);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class424.field6054) {
                class517.field7067 = class194.field2598;
                boolean var366 = class89.field1233.method2398(-1372747256) == 1;
                if (class206.field2700 != 1) {
                    if (var366) {
                        class181.field2401 = new class625(class89.field1233);
                    } else {
                        class495.field6848 = new class625(class89.field1233);
                    }
                    class434.field6143 = null;
                    return true;
                }
                class434.field6143 = null;
                if (var366) {
                    class181.field2401 = null;
                } else {
                    class495.field6848 = null;
                }
                return true;
            } else if (class490.field6803 == class434.field6143) {
                class440.field6186 = class194.field2598;
                boolean var367 = class89.field1233.method2398(arg0 ^ 0xAE2D8A0A) == 1;
                if (class206.field2700 != 1) {
                    if (var367) {
                        class66.field952 = new class56(class89.field1233);
                    } else {
                        class285.field4208 = new class56(class89.field1233);
                    }
                    class434.field6143 = null;
                    return true;
                }
                class434.field6143 = null;
                if (var367) {
                    class66.field952 = null;
                } else {
                    class285.field4208 = null;
                }
                return true;
            } else if (class434.field6143 == class400.field5841) {
                class97.field1357 = class89.field1233.method2355(3);
                class706.field9907 = class194.field2598;
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class230.field3146) {
                int var368 = class89.field1233.method2359(arg0 ^ 0xFFFFFFFD);
                byte var369 = class89.field1233.method2409(true);
                class630.method3538((byte) -103);
                class389.method2462(var369, var368, 0);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class408.field5901) {
                String var370 = class89.field1233.method2379((byte) 85);
                int var371 = class89.field1233.method2359(-1);
                String var372 = class445.field6245.method609(var371, arg0 + 17406).method1954(class89.field1233, arg0 + 15626);
                class589.method3288(19, true, var370, var370, var371, var370, 0, var372, null);
                class434.field6143 = null;
                return true;
            } else if (class763.field10533 == class434.field6143) {
                class235.method1528(class39.field628, 99);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class32.field524) {
                int var373 = class89.field1233.method2359(-1);
                if (var373 == 65535) {
                    var373 = -1;
                }
                int var374 = class89.field1233.method2398(-1372747256);
                int var375 = class89.field1233.method2359(-1);
                int var376 = class89.field1233.method2398(-1372747256);
                int var377 = class89.field1233.method2359(-1);
                class642.method3567(false, var375, var374, arg0 ^ 0xFFFFFFD5, var373, var376, var377);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class329.field4765) {
                int var378 = class89.field1233.method2405(-361);
                int var379 = class89.field1233.method2358((byte) -30);
                class630.method3538((byte) -80);
                class749.method4137(var379, 0, var378, false);
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class154.field2108) {
                int var380 = class89.field1233.method2358((byte) -30);
                int var381 = class89.field1233.method2402((byte) -106);
                class382.field5602.method2267((byte) 0, var380, var381);
                class434.field6143 = null;
                return true;
            } else if (class454.field6312 == class434.field6143) {
                int var382 = class89.field1233.method2405(-361);
                int var383 = class89.field1233.method2381(-28);
                boolean var384 = (var383 & 0x1) == 1;
                class577.method3220(var382, var384, arg0 + 72);
                class40.field635[class440.method2643(31, class334.field4867++)] = var382;
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class394.field5806) {
                int var385 = class89.field1233.method2375((byte) 31);
                int var386 = class89.field1233.method2405(-361);
                int var387 = class89.field1233.method2358((byte) -30);
                int var388 = class89.field1233.method2410(65280);
                int var389 = class89.field1233.method2412(-100);
                int var390 = class89.field1233.method2376((byte) 60);
                int var391 = var389 & 0x7;
                int var392 = var389 >> 3 & 0xF;
                if (var392 == 15) {
                    var392 = -1;
                }
                if (var390 >> 30 != 0) {
                    int var393 = var390 >> 28 & 0x3;
                    int var394 = (var390 >> 14 & 0x3FFF) - class121.field1765;
                    int var395 = (var390 & 0x3FFF) - class230.field3147;
                    if (var394 >= 0 && var395 >= 0 && var394 < class597.field8132 && var395 < class628.field8800) {
                        int var396 = var394 * 512 + 256;
                        int var397 = var395 * 512 + 256;
                        int var398 = var393;
                        if (var393 < 3 && class74.method661(var394, var395, 1)) {
                            var398 = var393 + 1;
                        }
                        class657 var399 = new class657(var387, var388, class100.field1401, var393, var398, var396, class783.method4338(var393, var396, arg0 ^ 0xFFFFD0FA, var397) - var386, var397, var394, var394, var395, var395, var391);
                        class229.field3116.method2545(-128, new class744(var399));
                    }
                } else if (var390 >> 29 != 0) {
                    int var414 = var390 & 0xFFFF;
                    class174 var415 = (class174) class234.field3169.method3953((long) var414, arg0 + 12);
                    if (var415 != null) {
                        class192 var416 = var415.field2336;
                        class126 var417 = var416.field1833[var385];
                        if (var387 == 65535) {
                            var387 = -1;
                        }
                        boolean var418 = true;
                        int var419 = var417.field1898;
                        if (var387 != -1 && var419 != -1) {
                            if (var387 == var419) {
                                class608 var424 = class784.field10798.method3973((byte) 86, var387);
                                if (var424.field8278 && var424.field8277 != -1) {
                                    class489 var425 = class6.field65.method1034(var424.field8277, 0);
                                    int var426 = var425.field6786;
                                    if (var426 == 0 || var426 == 2) {
                                        var418 = false;
                                    } else if (var426 == 1) {
                                        var418 = true;
                                    }
                                }
                            } else {
                                class608 var420 = class784.field10798.method3973((byte) 112, var387);
                                class608 var421 = class784.field10798.method3973((byte) 119, var419);
                                if (var420.field8277 != -1 && var421.field8277 != -1) {
                                    class489 var422 = class6.field65.method1034(var420.field8277, 0);
                                    class489 var423 = class6.field65.method1034(var421.field8277, arg0 - 2);
                                    if (var423.field6778 > var422.field6778) {
                                        var418 = false;
                                    }
                                }
                            }
                        }
                        if (var418) {
                            var417.field1896 = 1;
                            var417.field1899 = var391;
                            var417.field1893 = var386;
                            var417.field1907 = 0;
                            var417.field1898 = var387;
                            var417.field1904 = 0;
                            var417.field1906 = var392;
                            var417.field1905 = class100.field1401 + var388;
                            if (var417.field1905 > class100.field1401) {
                                var417.field1907 = -1;
                            }
                            if (var417.field1898 == 65535) {
                                var417.field1898 = -1;
                            }
                            if (var417.field1898 != -1 && class100.field1401 == var417.field1905) {
                                int var427 = class784.field10798.method3973((byte) 97, var417.field1898).field8277;
                                if (var427 != -1) {
                                    class489 var428 = class6.field65.method1034(var427, 0);
                                    if (var428 != null && var428.field6775 != null && !var416.field1823) {
                                        class586.method3259(var416, arg0 ^ 0x2, var428, 0);
                                    }
                                }
                            }
                        }
                    }
                } else if ((var390 >> 28) != 0) {
                    int var400 = var390 & 0xFFFF;
                    class73 var401;
                    if (class363.field5292 == var400) {
                        var401 = class551.field7456;
                    } else {
                        var401 = class599.field8149[var400];
                    }
                    if (var401 != null) {
                        if (var387 == 65535) {
                            var387 = -1;
                        }
                        class126 var402 = var401.field1833[var385];
                        boolean var403 = true;
                        int var404 = var402.field1898;
                        if (var387 != -1 && var404 != -1) {
                            if (var387 == var404) {
                                class608 var409 = class784.field10798.method3973((byte) 109, var387);
                                if (var409.field8278 && var409.field8277 != -1) {
                                    class489 var410 = class6.field65.method1034(var409.field8277, 0);
                                    int var411 = var410.field6786;
                                    if (var411 == 0 || var411 == 2) {
                                        var403 = false;
                                    } else if (var411 == 1) {
                                        var403 = true;
                                    }
                                }
                            } else {
                                class608 var405 = class784.field10798.method3973((byte) 106, var387);
                                class608 var406 = class784.field10798.method3973((byte) 121, var404);
                                if (var405.field8277 != -1 && var406.field8277 != -1) {
                                    class489 var407 = class6.field65.method1034(var405.field8277, arg0 - 2);
                                    class489 var408 = class6.field65.method1034(var406.field8277, 0);
                                    if (var407.field6778 < var408.field6778) {
                                        var403 = false;
                                    }
                                }
                            }
                        }
                        if (var403) {
                            var402.field1896 = 1;
                            var402.field1898 = var387;
                            var402.field1905 = class100.field1401 + var388;
                            var402.field1893 = var386;
                            var402.field1899 = var391;
                            var402.field1906 = var392;
                            var402.field1907 = 0;
                            var402.field1904 = 0;
                            if (var402.field1898 == 65535) {
                                var402.field1898 = -1;
                            }
                            if (class100.field1401 < var402.field1905) {
                                var402.field1907 = -1;
                            }
                            if (var402.field1898 != -1 && class100.field1401 == var402.field1905) {
                                int var412 = class784.field10798.method3973((byte) 97, var402.field1898).field8277;
                                if (var412 != -1) {
                                    class489 var413 = class6.field65.method1034(var412, 0);
                                    if (var413 != null && var413.field6775 != null && !var401.field1823) {
                                        class586.method3259(var401, 0, var413, 0);
                                    }
                                }
                            }
                        }
                    }
                }
                class434.field6143 = null;
                return true;
            } else if (class745.field10290 == class434.field6143) {
                int var429 = class89.field1233.method2359(arg0 - 3);
                int var430 = class89.field1233.method2359(arg0 ^ 0xFFFFFFFD);
                int var431 = class89.field1233.method2359(arg0 - 3);
                class630.method3538((byte) -84);
                if (class111.field1528[var429] != null) {
                    for (int var432 = var430; var432 < var431; var432++) {
                        int var433 = class89.field1233.method2373(1223262424);
                        if (var432 < class111.field1528[var429].length && class111.field1528[var429][var432] != null) {
                            class111.field1528[var429][var432].field9334 = var433;
                        }
                    }
                }
                class434.field6143 = null;
                return true;
            } else if (class499.field6879 == class434.field6143) {
                int var434 = class89.field1233.method2398(-1372747256);
                if (class89.field1233.method2398(-1372747256) == 0) {
                    class546.field7402[var434] = new class107();
                } else {
                    class89.field1233.field5459--;
                    class546.field7402[var434] = new class107(class89.field1233);
                }
                class679.field9494 = class194.field2598;
                class434.field6143 = null;
                return true;
            } else if (class751.field10371 == class434.field6143) {
                boolean var435 = class89.field1233.method2398(-1372747256) == 1;
                String var436 = class89.field1233.method2379((byte) 85);
                String var437 = var436;
                if (var435) {
                    var437 = class89.field1233.method2379((byte) 85);
                }
                long var438 = (long) class89.field1233.method2359(-1);
                long var440 = (long) class89.field1233.method2373(1223262424);
                int var442 = class89.field1233.method2398(-1372747256);
                int var443 = class89.field1233.method2359(-1);
                long var444 = (var438 << 32) + var440;
                boolean var446 = false;
                int var447 = 0;
                while (true) {
                    if (var447 >= 100) {
                        if (var442 <= 1 && class337.method2140(117, var437)) {
                            var446 = true;
                        }
                        break;
                    }
                    if (class455.field6319[var447] == var444) {
                        var446 = true;
                        break;
                    }
                    var447++;
                }
                if (!var446 && class150.field2090 == 0) {
                    class455.field6319[class472.field6514] = var444;
                    class472.field6514 = (class472.field6514 + 1) % 100;
                    String var448 = class445.field6245.method609(var443, 17408).method1954(class89.field1233, 15628);
                    if (var442 == 2) {
                        class589.method3288(18, true, "<img=1>" + var436, var436, var443, "<img=1>" + var437, 0, var448, null);
                    } else if (var442 == 1) {
                        class589.method3288(18, true, "<img=0>" + var436, var436, var443, "<img=0>" + var437, 0, var448, null);
                    } else {
                        class589.method3288(18, true, var436, var436, var443, var437, 0, var448, null);
                    }
                }
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class154.field2109) {
                class300.field4344 = class206.field2700 <= 2 ? class474.field6565.method2780(96, class38.field589) : class89.field1233.method2379((byte) 85);
                class407.field5895 = class206.field2700 > 0 ? class89.field1233.method2359(-1) : -1;
                if (class407.field5895 == 65535) {
                    class407.field5895 = -1;
                }
                class434.field6143 = null;
                return true;
            } else if (class434.field6143 == class275.field4075) {
                int var449 = class89.field1233.method2402((byte) 127);
                int var450 = class89.field1233.method2358((byte) -30);
                if (var450 == 65535) {
                    var450 = -1;
                }
                int var451 = class89.field1233.method2405(-361);
                int var452 = class89.field1233.method2358((byte) -30);
                if (var452 == 65535) {
                    var452 = -1;
                }
                class630.method3538((byte) -68);
                for (int var453 = var450; var453 <= var452; var453++) {
                    long var454 = ((long) var449 << 32) + (long) var453;
                    class111 var456 = (class111) class298.field4316.method3953(var454, arg0 ^ 0xC);
                    class111 var457;
                    if (var456 != null) {
                        var457 = new class111(var456.field1521, var451);
                        var456.method792((byte) -100);
                    } else if (var453 == -1) {
                        var457 = new class111(class536.method3067(var449, 0).field9272.field1521, var451);
                    } else {
                        var457 = new class111(0, var451);
                    }
                    class298.field4316.method3962(var454, var457, -109);
                }
                class434.field6143 = null;
                return true;
            } else {
                class664.method3681((byte) 106, "T1 - " + (class434.field6143 == null ? -1 : class434.field6143.method3232((byte) -125)) + "," + (class635.field8859 == null ? -1 : class635.field8859.method3232((byte) -120)) + "," + (class598.field8147 == null ? -1 : class598.field8147.method3232((byte) -119)) + " - " + class206.field2700, null);
                class631.method3541(121, false);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
    public static void method2037(int arg0) {
        field4617 = null;
        int var1 = -94 % ((arg0 - 7) / 61);
        field4618 = null;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILka;III)Lel;")
    public static final class574 method2038(int arg0, class500 arg1, int arg2, int arg3, int arg4) {
        field4619++;
        if (arg1 == null) {
            return null;
        } else {
            if (arg0 != -23545) {
                method2037(-4);
            }
            return new class574(arg3, arg4, arg2, arg1.method315(), arg1.method327(), arg1.method316(), arg1.method335(), arg1.method338(), arg1.method294(), arg1.method330());
        }
    }
}
