import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class390 {

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "[Lns;")
    public class279[] field5644 = new class279[100];

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "[I")
    public int[] field5648 = new int[3];

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "[Lbn;")
    public class309[] field5642 = new class309[8];

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "[I")
    public int[] field5641 = new int[100];

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Ljo;")
    public static class222 field5647 = new class222(0, -1);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public int field5643;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field5646;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)Z", line = 3)
    public static final boolean method2359(byte arg0) {
        if (arg0 < 20) {
            field5647 = null;
        }
        field5645++;
        return class97.field1260 == 0 ? class246.field3235.method575(false) : true;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V", line = 28)
    public static final void method2360(int arg0, int arg1) {
        if (arg0 >= -70) {
            method2360(-112, 62);
        }
        field5640++;
        class226.field3037.method3036(arg1, (byte) -15);
        class320.field4268.method3036(arg1, (byte) -45);
        class483.field7123.method3036(arg1, (byte) -21);
        class309.field4140.method3036(arg1, (byte) -122);
        class531.field7821.method3036(arg1, (byte) -15);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)Z", line = 43)
    public static final boolean method2361(int arg0) throws IOException {
        field5649++;
        if (class446.field6499 == null) {
            return false;
        }
        int var1 = class446.field6499.method2624(arg0 ^ 0xFFFFFF8E);
        if (var1 == 0) {
            return false;
        }
        if (class188.field2437 == null) {
            if (class333.field4409) {
                var1--;
                class446.field6499.method2621(false, 0, 1, class334.field4414.field5761);
                class333.field4409 = false;
                class228.field3072++;
            }
            class334.field4414.field5729 = 0;
            if (class334.field4414.method81(false)) {
                if (var1 == 0) {
                    return false;
                }
                class446.field6499.method2621(false, 1, 1, class334.field4414.field5761);
                var1--;
                class228.field3072++;
            }
            class333.field4409 = true;
            class191[] var2 = class465.method2845((byte) 93);
            int var3 = class334.field4414.method75(9256);
            if (var3 < 0 || var2.length <= var3) {
                throw new IOException("invo:" + var3 + " ip:" + class334.field4414.field5729);
            }
            class188.field2437 = var2[var3];
            class132.field1742 = class188.field2437.field2462;
        }
        if (class132.field1742 == arg0) {
            if (var1 <= 0) {
                return false;
            }
            class446.field6499.method2621(false, 0, 1, class334.field4414.field5761);
            var1--;
            class132.field1742 = class334.field4414.field5761[0] & 0xFF;
            class228.field3072++;
        }
        if (class132.field1742 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class446.field6499.method2621(false, 0, 2, class334.field4414.field5761);
            class334.field4414.field5729 = 0;
            var1 -= 2;
            class132.field1742 = class334.field4414.method2386(arg0 - 23647);
            class228.field3072 += 2;
        }
        if (var1 < class132.field1742) {
            return false;
        }
        class334.field4414.field5729 = 0;
        class446.field6499.method2621(false, 0, class132.field1742, class334.field4414.field5761);
        class228.field3072 += class132.field1742;
        class384.field5586 = 0;
        class272.field3626 = class93.field1117;
        class93.field1117 = class434.field6334;
        class434.field6334 = class188.field2437;
        if (class339.field4483 == class188.field2437) {
            class367.field5013 = class334.field4414.method2404((byte) -97) << 3;
            class242.field3197 = class334.field4414.method2418(-53) << 3;
            class12.field131 = class334.field4414.method2447(4339);
            for (class166 var4 = (class166) class243.field3208.method300((byte) -124); var4 != null; var4 = (class166) class243.field3208.method301(arg0 - 114)) {
                int var6 = (int) (var4.field6348 & 0x3FFFL);
                int var7 = (int) (var4.field6348 >> 14 & 0x3FFFL);
                int var8 = (int) (var4.field6348 >> 28 & 0x3L);
                if (class12.field131 == var8 && class367.field5013 <= var6 && class367.field5013 + 8 > var6 && class242.field3197 <= var7 && class242.field3197 + 8 > var7) {
                    var4.method2674(true);
                    class497.method2995(class12.field131, var7, var6, (byte) -100);
                }
            }
            for (class263 var5 = (class263) class366.field4995.method970(arg0 + 13); var5 != null; var5 = (class263) class366.field4995.method976((byte) -122)) {
                if (class367.field5013 <= var5.field3534 && var5.field3534 < class367.field5013 + 8 && var5.field3527 >= class242.field3197 && (class242.field3197 + 8) > var5.field3527 && class12.field131 == var5.field3535) {
                    var5.field3523 = 0;
                }
            }
            class188.field2437 = null;
            return true;
        } else if (class428.field6222 == class188.field2437) {
            if (class270.method1644((byte) -93, class527.field7734)) {
                class430.field6246 = (int) ((float) class334.field4414.method2386(-23648) * 2.5F);
            } else {
                class430.field6246 = class334.field4414.method2386(-23648) * 30;
            }
            class191.field2463 = class106.field1448;
            class188.field2437 = null;
            return true;
        } else if (class510.field7414 == class188.field2437) {
            int var9 = class334.field4414.method2386(-23648);
            int var10 = class334.field4414.method2388((byte) -125);
            boolean var11 = (var10 & 0x1) == 1;
            class216.method1374(var11, var9, 0);
            int var12 = class334.field4414.method2386(arg0 - 23647);
            for (int var13 = 0; var13 < var12; var13++) {
                int var14 = class334.field4414.method2414(true);
                if (var14 == 255) {
                    var14 = class334.field4414.method2431((byte) 125);
                }
                int var15 = class334.field4414.method2386(-23648);
                class342.method1991(var15 - 1, var13, var14, -10094, var11, var9);
            }
            class393.field5682[class95.method534(31, class139.field1853++)] = var9;
            class188.field2437 = null;
            return true;
        } else if (class93.field1115 == class188.field2437) {
            int var16 = class334.field4414.method2388((byte) -115);
            boolean var17 = (var16 & 0x1) == 1;
            String var18 = class334.field4414.method2432((byte) 125);
            String var19 = class334.field4414.method2432((byte) 125);
            if (var19.equals("")) {
                var19 = var18;
            }
            String var20 = class334.field4414.method2432((byte) 125);
            String var21 = class334.field4414.method2432((byte) 125);
            if (var21.equals("")) {
                var21 = var20;
            }
            if (var17) {
                for (int var22 = 0; var22 < class327.field4351; var22++) {
                    if (class428.field6226[var22].equals(var21)) {
                        class384.field5591[var22] = var18;
                        class428.field6226[var22] = var19;
                        class161.field2091[var22] = var20;
                        class130.field1677[var22] = var21;
                        break;
                    }
                }
            } else {
                class384.field5591[class327.field4351] = var18;
                class428.field6226[class327.field4351] = var19;
                class161.field2091[class327.field4351] = var20;
                class130.field1677[class327.field4351] = var21;
                class127.field1646[class327.field4351] = class95.method534(2, var16) == 2;
                class327.field4351++;
            }
            class381.field5519 = class106.field1448;
            class188.field2437 = null;
            return true;
        } else if (class408.field5851 == class188.field2437) {
            int var23 = class334.field4414.method2386(-23648);
            int var24 = class334.field4414.method2406((byte) -75);
            int var25 = class334.field4414.method2386(arg0 - 23647);
            if (var25 == 65535) {
                var25 = -1;
            }
            if (class500.method3004((byte) -32, var23)) {
                class136.method825(2, var25, var24, (byte) -120, -1);
            }
            class188.field2437 = null;
            return true;
        } else if (class191.field2461 == class188.field2437) {
            class167.field2171 = class334.field4414.method2433((byte) 115);
            class188.field2437 = null;
            class191.field2463 = class106.field1448;
            return true;
        } else if (class41.field450 == class188.field2437) {
            int var26 = class334.field4414.method2386(-23648);
            int var27 = class334.field4414.method2388((byte) -120);
            boolean var28 = (var27 & 0x1) == 1;
            while (class334.field4414.field5729 < class132.field1742) {
                int var29 = class334.field4414.method2443(arg0 ^ 0xFFFFFF9E);
                int var30 = class334.field4414.method2386(-23648);
                int var31 = 0;
                if (var30 != 0) {
                    var31 = class334.field4414.method2388((byte) -122);
                    if (var31 == 255) {
                        var31 = class334.field4414.method2406((byte) -78);
                    }
                }
                class342.method1991(var30 - 1, var29, var31, -10094, var28, var26);
            }
            class393.field5682[class95.method534(class139.field1853++, 31)] = var26;
            class188.field2437 = null;
            return true;
        } else if (class260.field3491 == class188.field2437) {
            int var32 = class334.field4414.method2392(false);
            int var33 = class334.field4414.method2447(4339);
            int var34 = class334.field4414.method2412(arg0 ^ 0x7F0AAC07);
            if (class500.method3004((byte) -32, var32)) {
                class87.method478(var34, (byte) 39, var33);
            }
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class117.field1532) {
            class367.field5013 = class334.field4414.method2418(110) << 3;
            class12.field131 = class334.field4414.method2388((byte) -124);
            class242.field3197 = class334.field4414.method2442((byte) 92) << 3;
            class188.field2437 = null;
            return true;
        } else if (class380.field5504 == class188.field2437) {
            class244.method1519(class444.field6464, arg0 - 89);
            class188.field2437 = null;
            return true;
        } else if (class451.field6725 == class188.field2437) {
            int var35 = class334.field4414.method2406((byte) -91);
            class263.field3525 = class381.field5518.method853(true, var35);
            class188.field2437 = null;
            return true;
        } else if (class280.field3705 == class188.field2437) {
            boolean var36 = class334.field4414.method2388((byte) -118) == 1;
            String var37 = class334.field4414.method2432((byte) 125);
            String var38 = var37;
            if (var36) {
                var38 = class334.field4414.method2432((byte) 125);
            }
            long var39 = class334.field4414.method2391((byte) 8);
            long var41 = (long) class334.field4414.method2386(-23648);
            long var43 = (long) class334.field4414.method2396((byte) -64);
            int var45 = class334.field4414.method2388((byte) -110);
            int var46 = class334.field4414.method2386(-23648);
            long var47 = (var41 << 32) + var43;
            boolean var49 = false;
            int var50 = 0;
            while (true) {
                if (var50 >= 100) {
                    if (var45 <= 1 && class313.method1863((byte) -9, var38)) {
                        var49 = true;
                    }
                    break;
                }
                if (class277.field3677[var50] == var47) {
                    var49 = true;
                    break;
                }
                var50++;
            }
            if (!var49 && class94.field1120 == 0) {
                class277.field3677[class304.field4040] = var47;
                class304.field4040 = (class304.field4040 + 1) % 100;
                String var51 = class253.field3371.method1481(var46, (byte) -109).method2713(class334.field4414, -1);
                if (var45 == 2) {
                    class124.method755(class474.method2893(var39, arg0 ^ 0xFFFFFFD5), var51, var46, true, "<img=1>" + var37, 20, "<img=1>" + var38, 0);
                } else if (var45 == 1) {
                    class124.method755(class474.method2893(var39, arg0 + 95), var51, var46, true, "<img=0>" + var37, 20, "<img=0>" + var38, 0);
                } else {
                    class124.method755(class474.method2893(var39, 71), var51, var46, true, var37, 20, var38, 0);
                }
            }
            class188.field2437 = null;
            return true;
        } else if (class470.field6973 == class188.field2437) {
            class244.method1519(class408.field5858, -127);
            class188.field2437 = null;
            return true;
        } else if (class386.field5613 == class188.field2437) {
            class52.field606.method1329(92);
            class188.field2437 = null;
            class375.field5087 += 32;
            return true;
        } else if (class214.field2930 == class188.field2437) {
            boolean var52 = class334.field4414.method2388((byte) -113) == 1;
            String var53 = class334.field4414.method2432((byte) 125);
            String var54 = var53;
            if (var52) {
                var54 = class334.field4414.method2432((byte) 125);
            }
            long var55 = (long) class334.field4414.method2386(arg0 - 23647);
            long var57 = (long) class334.field4414.method2396((byte) 49);
            int var59 = class334.field4414.method2388((byte) -122);
            long var60 = (var55 << 32) + var57;
            boolean var62 = false;
            int var63 = 0;
            while (true) {
                if (var63 >= 100) {
                    if (var59 <= 1) {
                        if (!(!class193.field2495 || class310.field4150) || class334.field4432) {
                            var62 = true;
                        } else if (class313.method1863((byte) -9, var54)) {
                            var62 = true;
                        }
                    }
                    break;
                }
                if (class277.field3677[var63] == var60) {
                    var62 = true;
                    break;
                }
                var63++;
            }
            if (!var62 && class94.field1120 == 0) {
                class277.field3677[class304.field4040] = var60;
                class304.field4040 = (class304.field4040 + 1) % 100;
                String var64 = class401.method2476(class274.method1665(class334.field4414, (byte) 24), false);
                if (var59 == 2) {
                    class124.method755(null, var64, -1, true, "<img=1>" + var53, 7, "<img=1>" + var54, 0);
                } else if (var59 == 1) {
                    class124.method755(null, var64, -1, true, "<img=0>" + var53, 7, "<img=0>" + var54, 0);
                } else {
                    class124.method755(null, var64, -1, true, var53, 3, var54, 0);
                }
            }
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class167.field2170) {
            int var65 = class334.field4414.method2426((byte) 104);
            if (var65 == 65535) {
                var65 = -1;
            }
            int var66 = class334.field4414.method2386(-23648);
            int var67 = class334.field4414.method2426((byte) 97);
            if (var67 == 65535) {
                var67 = -1;
            }
            int var68 = class334.field4414.method2431((byte) 96);
            int var69 = class334.field4414.method2386(-23648);
            if (class500.method3004((byte) -32, var66)) {
                for (int var70 = var67; var70 <= var65; var70++) {
                    long var71 = ((long) var68 << 32) + ((long) var70);
                    class222 var73 = (class222) class179.field2317.method295(var71, -110);
                    class222 var74;
                    if (var73 != null) {
                        var74 = new class222(var73.field2979, var69);
                        var73.method2674(true);
                    } else if (var70 == -1) {
                        var74 = new class222(class406.method2490((byte) -116, var68).field6694.field2979, var69);
                    } else {
                        var74 = new class222(0, var69);
                    }
                    class179.field2317.method291(var71, var74, -19);
                }
            }
            class188.field2437 = null;
            return true;
        } else if (class532.field7838 == class188.field2437) {
            boolean var75 = class334.field4414.method2388((byte) -119) == 1;
            String var76 = class334.field4414.method2432((byte) 125);
            String var77 = var76;
            if (var75) {
                var77 = class334.field4414.method2432((byte) 125);
            }
            int var78 = class334.field4414.method2388((byte) -123);
            boolean var79 = false;
            if (var78 <= 1) {
                if (!(!class193.field2495 || class310.field4150) || class334.field4432) {
                    var79 = true;
                } else if (var78 <= 1 && class313.method1863((byte) -9, var77)) {
                    var79 = true;
                }
            }
            if (!var79 && class94.field1120 == 0) {
                String var80 = class401.method2476(class274.method1665(class334.field4414, (byte) 24), false);
                if (var78 == 2) {
                    class124.method755(null, var80, -1, true, "<img=1>" + var76, 24, "<img=1>" + var77, 0);
                } else if (var78 == 1) {
                    class124.method755(null, var80, -1, true, "<img=0>" + var76, 24, "<img=0>" + var77, 0);
                } else {
                    class124.method755(null, var80, -1, true, var76, 24, var77, 0);
                }
            }
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class118.field1539) {
            class321.method1900(false, arg0 - 20146);
            class188.field2437 = null;
            return false;
        } else if (class408.field5857 == class188.field2437) {
            int var81 = class334.field4414.method2409(-4);
            int var82 = class334.field4414.method2386(-23648);
            int var83 = class334.field4414.method2386(-23648);
            int var84 = class334.field4414.method2387((byte) 125);
            int var85 = class334.field4414.method2386(-23648);
            if (class500.method3004((byte) -32, var83)) {
                class209.method1333(var82, var81, var84, arg0, var85);
            }
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class10.field122) {
            if (class168.field2174 != -1) {
                class63.method379(0, class168.field2174, true);
            }
            class188.field2437 = null;
            return true;
        } else if (class43.field457 == class188.field2437) {
            class244.method1519(class419.field6086, arg0 + 35);
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class152.field1992) {
            class244.method1519(class185.field2418, -117);
            class188.field2437 = null;
            return true;
        } else if (class478.field7079 == class188.field2437) {
            class214.method1365(true, (byte) -112);
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class111.field1479) {
            int var86 = class334.field4414.method2392(false);
            int var87 = class334.field4414.method2412(arg0 ^ 0x7F0AAC07);
            class52.field606.method1327(var86, var87, arg0 ^ 0x32);
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class117.field1521) {
            String var88 = class334.field4414.method2432((byte) 125);
            int var89 = class334.field4414.method2386(-23648);
            String var90 = class253.field3371.method1481(var89, (byte) -124).method2713(class334.field4414, -1);
            class124.method755(null, var90, var89, true, var88, 19, var88, 0);
            class188.field2437 = null;
            return true;
        } else if (class252.field3349 == class188.field2437) {
            int var91 = class334.field4414.method2447(4339);
            int var92 = class334.field4414.method2386(arg0 ^ 0x5C5F);
            int var93 = class334.field4414.method2409(-4);
            int var94 = class334.field4414.method2386(-23648);
            if (class500.method3004((byte) -32, var94)) {
                class360 var95 = (class360) class152.field1989.method295((long) var93, -99);
                if (var95 != null) {
                    class115.method696(false, arg0 ^ 0xFFFFFFB6, var95.field4886 != var92, var95);
                }
                class256.method1582(-1, var92, var91, false, var93);
            }
            class188.field2437 = null;
            return true;
        } else if (class451.field6716 == class188.field2437) {
            int var96 = class334.field4414.method2412(-2131405832);
            int var97 = class334.field4414.method2414(true);
            int var98 = class334.field4414.method2447(4339);
            class173.field2225[var98] = var96;
            class81.field985[var98] = var97;
            class456.field6807[var98] = 1;
            int var99 = class192.field2470[var98] - 1;
            for (int var100 = 0; var100 < var99; var100++) {
                if (class184.field2398[var100] <= var96) {
                    class456.field6807[var98] = var100 + 2;
                }
            }
            class293.field3884[class95.method534(class309.field4147++, 31)] = var98;
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class155.field2022) {
            int var101 = class334.field4414.method2414(true);
            int var102 = class334.field4414.method2441(arg0 - 25005);
            int var103 = class334.field4414.method2392(false);
            if (var103 == 65535) {
                var103 = -1;
            }
            String var104 = class334.field4414.method2432((byte) 125);
            if (var101 >= 1 && var101 <= 8) {
                if (var104.equalsIgnoreCase("null")) {
                    var104 = null;
                }
                class185.field2419[var101 - 1] = var104;
                class245.field3229[var101 - 1] = var103;
                class155.field2040[var101 - 1] = var102 == 0;
            }
            class188.field2437 = null;
            return true;
        } else if (class442.field6416 == class188.field2437) {
            int var105 = class334.field4414.method2392(false);
            if (var105 == 65535) {
                var105 = -1;
            }
            int var106 = class334.field4414.method2386(arg0 ^ 0x5C5F);
            int var107 = class334.field4414.method2409(-4);
            int var108 = class334.field4414.method2392(false);
            if (var108 == 65535) {
                var108 = -1;
            }
            int var109 = class334.field4414.method2412(-2131405832);
            if (class500.method3004((byte) -32, var106)) {
                for (int var110 = var108; var110 <= var105; var110++) {
                    long var111 = ((long) var109 << 32) + ((long) var110);
                    class222 var113 = (class222) class179.field2317.method295(var111, -99);
                    class222 var114;
                    if (var113 != null) {
                        var114 = new class222(var107, var113.field2980);
                        var113.method2674(true);
                    } else if (var110 == -1) {
                        var114 = new class222(var107, class406.method2490((byte) -116, var109).field6694.field2980);
                    } else {
                        var114 = new class222(var107, -1);
                    }
                    class179.field2317.method291(var111, var114, -73);
                }
            }
            class188.field2437 = null;
            return true;
        } else if (class436.field6356 == class188.field2437) {
            boolean var115 = class334.field4414.method2388((byte) -125) == 1;
            String var116 = class334.field4414.method2432((byte) 125);
            String var117 = var116;
            if (var115) {
                var117 = class334.field4414.method2432((byte) 125);
            }
            int var118 = class334.field4414.method2388((byte) -119);
            int var119 = class334.field4414.method2386(-23648);
            boolean var120 = false;
            if (var118 <= 1 && class313.method1863((byte) -9, var117)) {
                var120 = true;
            }
            if (!var120 && class94.field1120 == 0) {
                String var121 = class253.field3371.method1481(var119, (byte) -125).method2713(class334.field4414, -1);
                if (var118 == 2) {
                    class124.method755(null, var121, var119, true, "<img=1>" + var116, 25, "<img=1>" + var117, 0);
                } else if (var118 == 1) {
                    class124.method755(null, var121, var119, true, "<img=0>" + var116, 25, "<img=0>" + var117, 0);
                } else {
                    class124.method755(null, var121, var119, true, var116, 25, var117, 0);
                }
            }
            class188.field2437 = null;
            return true;
        } else if (class330.field4378 == class188.field2437) {
            int var122 = class334.field4414.method2386(arg0 - 23647);
            String var123 = class334.field4414.method2432((byte) 125);
            Object[] var124 = new Object[var123.length() + 1];
            for (int var125 = var123.length() - 1; var125 >= 0; var125--) {
                if (var123.charAt(var125) == 's') {
                    var124[var125 + 1] = class334.field4414.method2432((byte) 125);
                } else {
                    var124[var125 + 1] = Integer.valueOf(class334.field4414.method2406((byte) -66));
                }
            }
            var124[0] = Integer.valueOf(class334.field4414.method2406((byte) -85));
            if (class500.method3004((byte) -32, var122)) {
                class293 var126 = new class293();
                var126.field3866 = var124;
                class432.method2657(var126);
            }
            class188.field2437 = null;
            return true;
        } else if (class308.field4130 == class188.field2437) {
            int var127 = class334.field4414.method2386(-23648);
            int var128 = class334.field4414.method2388((byte) -121);
            int var129 = class334.field4414.method2388((byte) -114);
            int var130 = class334.field4414.method2386(arg0 - 23647) << 0;
            int var131 = class334.field4414.method2388((byte) -117);
            int var132 = class334.field4414.method2388((byte) -127);
            if (class500.method3004((byte) -32, var127)) {
                class217.method1379(var129, var131, true, true, var128, var132, var130);
            }
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class164.field2142) {
            boolean var133 = class334.field4414.method2388((byte) -126) == 1;
            String var134 = class334.field4414.method2432((byte) 125);
            String var135 = var134;
            if (var133) {
                var135 = class334.field4414.method2432((byte) 125);
            }
            long var136 = (long) class334.field4414.method2386(arg0 - 23647);
            long var138 = (long) class334.field4414.method2396((byte) -90);
            int var140 = class334.field4414.method2388((byte) -115);
            int var141 = class334.field4414.method2386(-23648);
            long var142 = (var136 << 32) + var138;
            boolean var144 = false;
            int var145 = 0;
            while (true) {
                if (var145 >= 100) {
                    if (var140 <= 1 && class313.method1863((byte) -9, var135)) {
                        var144 = true;
                    }
                    break;
                }
                if (class277.field3677[var145] == var142) {
                    var144 = true;
                    break;
                }
                var145++;
            }
            if (!var144 && class94.field1120 == 0) {
                class277.field3677[class304.field4040] = var142;
                class304.field4040 = (class304.field4040 + 1) % 100;
                String var146 = class253.field3371.method1481(var141, (byte) -124).method2713(class334.field4414, -1);
                if (var140 == 2) {
                    class124.method755(null, var146, var141, true, "<img=1>" + var134, 18, "<img=1>" + var135, 0);
                } else if (var140 == 1) {
                    class124.method755(null, var146, var141, true, "<img=0>" + var134, 18, "<img=0>" + var135, 0);
                } else {
                    class124.method755(null, var146, var141, true, var134, 18, var135, 0);
                }
            }
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class173.field2213) {
            String var147 = class334.field4414.method2432((byte) 125);
            int var148 = class334.field4414.method2387((byte) 125);
            int var149 = class334.field4414.method2409(-4);
            if (class500.method3004((byte) -32, var148)) {
                class466.method2848(var149, var147, (byte) 118);
            }
            class188.field2437 = null;
            return true;
        } else if (class189.field2444 == class188.field2437) {
            class244.method1519(class482.field7121, 85);
            class188.field2437 = null;
            return true;
        } else if (class490.field7189 == class188.field2437) {
            class530.field7766 = class334.field4414.method2388((byte) -117);
            class191.field2463 = class106.field1448;
            class188.field2437 = null;
            return true;
        } else if (class249.field3319 == class188.field2437) {
            int var150 = class334.field4414.method2441(-25006);
            int var151 = class334.field4414.method2386(-23648);
            int var152 = class334.field4414.method2387((byte) 125);
            if (class500.method3004((byte) -32, var152)) {
                if (var150 == 2) {
                    class91.method505((byte) 123);
                }
                class168.field2174 = var151;
                class9.method59(2048, var151);
                class334.method1949(false, -28025);
                class432.method2654(class168.field2174);
                for (int var153 = 0; var153 < 100; var153++) {
                    class442.field6427[var153] = true;
                }
            }
            class188.field2437 = null;
            return true;
        } else if (class521.field7669 == class188.field2437) {
            class12.field131 = class334.field4414.method2414(true);
            class242.field3197 = class334.field4414.method2428(1797) << 3;
            class367.field5013 = class334.field4414.method2404((byte) -97) << 3;
            while (class334.field4414.field5729 < class132.field1742) {
                class115 var154 = class382.method2331(arg0 ^ 0x7C)[class334.field4414.method2388((byte) -111)];
                class244.method1519(var154, -112);
            }
            class188.field2437 = null;
            return true;
        } else if (class190.field2453 == class188.field2437) {
            int var155 = class334.field4414.method2386(arg0 ^ 0x5C5F);
            int var156 = class334.field4414.method2386(-23648);
            if (var156 == 65535) {
                var156 = -1;
            }
            int var157 = class334.field4414.method2412(arg0 - 2131405831);
            if (class500.method3004((byte) -32, var155)) {
                class136.method825(1, var156, var157, (byte) -120, -1);
            }
            class188.field2437 = null;
            return true;
        } else if (class276.field3676 == class188.field2437) {
            int var158 = class334.field4414.method2392(false);
            int var159 = class334.field4414.method2386(-23648);
            int var160 = class334.field4414.method2412(-2131405832);
            if (class500.method3004((byte) -32, var159)) {
                class21.method121(var158, (byte) 91, var160);
            }
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class125.field1614) {
            int var161 = class334.field4414.method2392(false);
            int var162 = class334.field4414.method2431((byte) 116);
            class52.field606.method1332(var161, arg0, var162);
            class188.field2437 = null;
            return true;
        } else if (class376.field5094 == class188.field2437) {
            class479.field7092 = 1;
            class188.field2437 = null;
            class381.field5519 = class106.field1448;
            return true;
        } else if (class188.field2437 == class102.field1389) {
            class465.field6918 = class132.field1742 > 2 ? class334.field4414.method2432((byte) 125) : class232.field3115.method1823(class374.field5072, (byte) -88);
            class125.field1621 = class132.field1742 > 0 ? class334.field4414.method2386(-23648) : -1;
            if (class125.field1621 == 65535) {
                class125.field1621 = -1;
            }
            class188.field2437 = null;
            return true;
        } else if (class502.field7318 == class188.field2437) {
            int var163 = class334.field4414.method2392(false);
            int var164 = class334.field4414.method2426((byte) 126);
            int var165 = class334.field4414.method2387((byte) 125);
            int var166 = class334.field4414.method2431((byte) -99);
            int var167 = class334.field4414.method2387((byte) 125);
            if (class500.method3004((byte) -32, var163)) {
                class136.method825(7, var164 | var167 << 16, var166, (byte) -120, var165);
            }
            class188.field2437 = null;
            return true;
        } else if (class371.field5041 == class188.field2437) {
            class244.method1519(class375.field5083, -85);
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class143.field1905) {
            class244.method1519(class495.field7225, 74);
            class188.field2437 = null;
            return true;
        } else if (class452.field6736 == class188.field2437) {
            int var168 = class334.field4414.method2392(false);
            if (var168 == 65535) {
                var168 = -1;
            }
            int var169 = class334.field4414.method2386(arg0 - 23647);
            int var170 = class334.field4414.method2431((byte) -119);
            if (class500.method3004((byte) -32, var169)) {
                class445.method2747(var168, var170, (byte) 102);
            }
            class188.field2437 = null;
            return true;
        } else if (class481.field7107 == class188.field2437) {
            int var171 = class334.field4414.method2386(-23648);
            int var172 = class334.field4414.method2388((byte) -115);
            int var173 = class334.field4414.method2388((byte) -123);
            int var174 = class334.field4414.method2388((byte) -123);
            int var175 = class334.field4414.method2388((byte) -117);
            int var176 = class334.field4414.method2386(-23648);
            if (class500.method3004((byte) -32, var171)) {
                class462.field6896[var172] = true;
                class429.field6238[var172] = var173;
                class89.field1065[var172] = var174;
                class314.field4185[var172] = var175;
                class380.field5505[var172] = var176;
            }
            class188.field2437 = null;
            return true;
        } else if (class228.field3079 == class188.field2437) {
            int var177 = class334.field4414.method2387((byte) 125);
            int var178 = class334.field4414.method2392(false);
            String var179 = class334.field4414.method2432((byte) 125);
            if (class500.method3004((byte) -32, var177)) {
                class100.method612(var179, var178, (byte) 115);
            }
            class188.field2437 = null;
            return true;
        } else if (class63.field727 == class188.field2437) {
            int var180 = class334.field4414.method2386(-23648);
            int var181 = class334.field4414.method2388((byte) -114);
            int var182 = class334.field4414.method2388((byte) -116);
            int var183 = class334.field4414.method2386(-23648) << 0;
            int var184 = class334.field4414.method2388((byte) -115);
            int var185 = class334.field4414.method2388((byte) -111);
            if (class500.method3004((byte) -32, var180)) {
                class429.method2641(var182, var185, var181, false, var183, var184);
            }
            class188.field2437 = null;
            return true;
        } else if (class289.field3800 == class188.field2437) {
            int var186 = class334.field4414.method2387((byte) 125);
            if (var186 == 65535) {
                var186 = -1;
            }
            int var187 = class334.field4414.method2414(true);
            int var188 = class334.field4414.method2388((byte) -114);
            class422.method2603(var186, -128, var188, var187);
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class115.field1505) {
            int var189 = class334.field4414.method2447(4339);
            int var190 = class334.field4414.method2392(false);
            if (var190 == 65535) {
                var190 = -1;
            }
            int var191 = class334.field4414.method2393(127);
            class21.method122(var191, 0, var189, var190);
            class188.field2437 = null;
            return true;
        } else if (class43.field461 == class188.field2437) {
            int var192 = class334.field4414.method2386(-23648);
            if (var192 == 65535) {
                var192 = -1;
            }
            int var193 = class334.field4414.method2388((byte) -122);
            int var194 = class334.field4414.method2386(-23648);
            int var195 = class334.field4414.method2388((byte) -124);
            class370.method2196(-1094, var192, var194, var195, var193);
            class188.field2437 = null;
            return true;
        } else if (class417.field6056 == class188.field2437) {
            int var196 = class334.field4414.method2409(-4);
            int var197 = class334.field4414.method2386(-23648);
            int var198 = class334.field4414.method2386(-23648);
            int var199 = class334.field4414.method2388((byte) -113);
            int var200 = class334.field4414.method2387((byte) 125);
            boolean var201 = (var199 & 0x80) != 0;
            if ((var196 >> 30) != 0) {
                int var202 = var196 >> 28 & 0x3;
                int var203 = (var196 >> 14 & 0x3FFF) - class357.field4867;
                int var204 = (var196 & 0x3FFF) - class418.field6074;
                if (var203 >= 0 && var204 >= 0 && var203 < class308.field4128 && var204 < class426.field6200) {
                    int var205 = var203 * 128 + 64;
                    int var206 = var204 * 128 + 64;
                    int var207 = var202;
                    if (var202 < 3 && class381.method2330(false, var204, var203)) {
                        var207 = var202 + 1;
                    }
                    class530 var208 = new class530(var197, 0, class532.field7836, var202, var207, var205, class470.method2868(arg0 ^ 0xFFFFFF80, var202, var205, var206) - var200, var206, var203, var203, var204, var204, var199);
                    class65.field740.method975(arg0 + 1, new class428(var208));
                }
            } else if ((var196 >> 29) != 0) {
                int var209 = var196 & 0xFFFF;
                class22 var210 = class339.field4484[var209];
                if (var210 != null) {
                    if (var197 == 65535) {
                        var197 = -1;
                    }
                    boolean var211 = true;
                    int var212 = var201 ? var210.field1193 : var210.field1210;
                    if (var197 != -1 && var212 != -1) {
                        if (var197 == var212) {
                            class88 var213 = class71.field914.method1608((byte) 82, var197);
                            if (var213.field1051 && var213.field1047 != -1) {
                                class260 var214 = class7.field97.method2951(var213.field1047, -13765);
                                int var215 = var214.field3475;
                                if (var215 == 0 || var215 == 2) {
                                    var211 = false;
                                } else if (var215 == 1) {
                                    var211 = true;
                                }
                            }
                        } else {
                            class88 var216 = class71.field914.method1608((byte) 82, var197);
                            class88 var217 = class71.field914.method1608((byte) 82, var212);
                            if (var216.field1047 != -1 && var217.field1047 != -1) {
                                class260 var218 = class7.field97.method2951(var216.field1047, -13765);
                                class260 var219 = class7.field97.method2951(var217.field1047, -13765);
                                if (var219.field3478 > var218.field3478) {
                                    var211 = false;
                                }
                            }
                        }
                    }
                    if (var211) {
                        if (var201) {
                            var210.field1208 = class532.field7836 + var198;
                            var210.field1234 = var199 & 0x7;
                            var210.field1220 = 1;
                            var210.field1162 = var200;
                            var210.field1240 = 0;
                            var210.field1181 = 0;
                            var210.field1193 = var197;
                            if (var210.field1208 > class532.field7836) {
                                var210.field1181 = -1;
                            }
                            if (var210.field1193 != -1 && class532.field7836 == var210.field1208) {
                                int var222 = class71.field914.method1608((byte) 82, var210.field1193).field1047;
                                if (var222 != -1) {
                                    class260 var223 = class7.field97.method2951(var222, arg0 ^ 0x35C4);
                                    if (var223 != null && var223.field3474 != null) {
                                        class276.method1678(var223, var210.field3695, var210.field3704, (byte) 111, var210.field3694, false, 0);
                                    }
                                }
                            }
                        } else {
                            var210.field1191 = var199 & 0x7;
                            var210.field1187 = class532.field7836 + var198;
                            var210.field1210 = var197;
                            var210.field1180 = 0;
                            var210.field1174 = 0;
                            var210.field1202 = var200;
                            var210.field1232 = 1;
                            if (var210.field1187 > class532.field7836) {
                                var210.field1174 = -1;
                            }
                            if (var210.field1210 != -1 && class532.field7836 == var210.field1187) {
                                int var220 = class71.field914.method1608((byte) 82, var210.field1210).field1047;
                                if (var220 != -1) {
                                    class260 var221 = class7.field97.method2951(var220, -13765);
                                    if (var221 != null && var221.field3474 != null) {
                                        class276.method1678(var221, var210.field3695, var210.field3704, (byte) 81, var210.field3694, false, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (var196 >> 28 != 0) {
                int var224 = var196 & 0xFFFF;
                class531 var225;
                if (class308.field4121 == var224) {
                    var225 = class96.field1170;
                } else {
                    var225 = class29.field272[var224];
                }
                if (var225 != null) {
                    if (var197 == 65535) {
                        var197 = -1;
                    }
                    boolean var226 = true;
                    int var227 = var201 ? var225.field1193 : var225.field1210;
                    if (var197 != -1 && var227 != -1) {
                        if (var197 == var227) {
                            class88 var228 = class71.field914.method1608((byte) 82, var197);
                            if (var228.field1051 && var228.field1047 != -1) {
                                class260 var229 = class7.field97.method2951(var228.field1047, arg0 ^ 0x35C4);
                                int var230 = var229.field3475;
                                if (var230 == 0 || var230 == 2) {
                                    var226 = false;
                                } else if (var230 == 1) {
                                    var226 = true;
                                }
                            }
                        } else {
                            class88 var231 = class71.field914.method1608((byte) 82, var197);
                            class88 var232 = class71.field914.method1608((byte) 82, var227);
                            if (var231.field1047 != -1 && var232.field1047 != -1) {
                                class260 var233 = class7.field97.method2951(var231.field1047, -13765);
                                class260 var234 = class7.field97.method2951(var232.field1047, -13765);
                                if (var234.field3478 > var233.field3478) {
                                    var226 = false;
                                }
                            }
                        }
                    }
                    if (var226) {
                        if (var201) {
                            var225.field1234 = var199 & 0x7;
                            var225.field1240 = 0;
                            var225.field1162 = var200;
                            var225.field1208 = class532.field7836 + var198;
                            var225.field1181 = 0;
                            var225.field1220 = 1;
                            var225.field1193 = var197;
                            if (var225.field1193 == 65535) {
                                var225.field1193 = -1;
                            }
                            if (class532.field7836 < var225.field1208) {
                                var225.field1181 = -1;
                            }
                            if (var225.field1193 != -1 && class532.field7836 == var225.field1208) {
                                int var235 = class71.field914.method1608((byte) 82, var225.field1193).field1047;
                                if (var235 != -1) {
                                    class260 var236 = class7.field97.method2951(var235, -13765);
                                    if (var236 != null && var236.field3474 != null) {
                                        class276.method1678(var236, var225.field3695, var225.field3704, (byte) 103, var225.field3694, class96.field1170 == var225, 0);
                                    }
                                }
                            }
                        } else {
                            var225.field1180 = 0;
                            var225.field1210 = var197;
                            var225.field1174 = 0;
                            var225.field1232 = 1;
                            var225.field1187 = class532.field7836 + var198;
                            var225.field1202 = var200;
                            var225.field1191 = var199 & 0x7;
                            if (var225.field1210 == 65535) {
                                var225.field1210 = -1;
                            }
                            if (class532.field7836 < var225.field1187) {
                                var225.field1174 = -1;
                            }
                            if (var225.field1210 != -1 && class532.field7836 == var225.field1187) {
                                int var237 = class71.field914.method1608((byte) 82, var225.field1210).field1047;
                                if (var237 != -1) {
                                    class260 var238 = class7.field97.method2951(var237, -13765);
                                    if (var238 != null && var238.field3474 != null) {
                                        class276.method1678(var238, var225.field3695, var225.field3704, (byte) 127, var225.field3694, class96.field1170 == var225, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class188.field2437 = null;
            return true;
        } else if (class376.field5104 == class188.field2437) {
            class392.field5660 = class106.field1448;
            if (class132.field1742 == 0) {
                class54.field623 = null;
                class436.field6359 = null;
                class188.field2437 = null;
                class357.field4868 = null;
                class198.field2557 = 0;
                return true;
            }
            class357.field4868 = class334.field4414.method2432((byte) 125);
            boolean var239 = class334.field4414.method2388((byte) -121) == 1;
            if (var239) {
                class334.field4414.method2432((byte) 125);
            }
            long var240 = class334.field4414.method2391((byte) -126);
            class436.field6359 = class90.method498(var240, 64);
            class265.field3556 = class334.field4414.method2418(-13);
            int var242 = class334.field4414.method2388((byte) -116);
            if (var242 == 255) {
                class188.field2437 = null;
                return true;
            }
            class198.field2557 = var242;
            class454[] var243 = new class454[100];
            for (int var244 = 0; var244 < class198.field2557; var244++) {
                var243[var244] = new class454();
                var243[var244].field6794 = class334.field4414.method2432((byte) 125);
                boolean var250 = class334.field4414.method2388((byte) -128) == 1;
                if (var250) {
                    var243[var244].field6796 = class334.field4414.method2432((byte) 125);
                } else {
                    var243[var244].field6796 = var243[var244].field6794;
                }
                var243[var244].field6787 = class437.method2684(arg0 - 77, var243[var244].field6796);
                var243[var244].field6797 = class334.field4414.method2386(-23648);
                var243[var244].field6792 = class334.field4414.method2418(-48);
                var243[var244].field6789 = class334.field4414.method2432((byte) 125);
                if (var243[var244].field6796.equals(class96.field1170.field7783)) {
                    class317.field4242 = var243[var244].field6792;
                }
            }
            boolean var245 = false;
            int var246 = class198.field2557;
            while (var246 > 0) {
                var246--;
                boolean var247 = true;
                for (int var248 = 0; var248 < var246; var248++) {
                    if (var243[var248].field6787.compareTo(var243[var248 + 1].field6787) > 0) {
                        class454 var249 = var243[var248];
                        var243[var248] = var243[var248 + 1];
                        var243[var248 + 1] = var249;
                        var247 = false;
                    }
                }
                if (var247) {
                    break;
                }
            }
            class54.field623 = var243;
            class188.field2437 = null;
            return true;
        } else if (class360.field4890 == class188.field2437) {
            class386.field5616 = class334.field4414.method2440((byte) -15);
            class193.field2495 = class334.field4414.method2388((byte) -110) == 1;
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class168.field2178) {
            class81.field986 = class449.method2776(arg0 ^ 0x72E1, class334.field4414.method2388((byte) -114));
            class188.field2437 = null;
            return true;
        } else if (class323.field4300 == class188.field2437) {
            int var251 = class334.field4414.method2386(-23648);
            int var252 = class334.field4414.method2388((byte) -115);
            class52.field606.method1332(var251, -1, var252);
            class188.field2437 = null;
            return true;
        } else if (class37.field385 == class188.field2437) {
            int var253 = class334.field4414.method2426((byte) 103);
            int var254 = class334.field4414.method2431((byte) 75);
            int var255 = class334.field4414.method2426((byte) 83);
            if (class500.method3004((byte) -32, var255)) {
                class173.method1017(var254, arg0 ^ 0x74, var253);
            }
            class188.field2437 = null;
            return true;
        } else if (class297.field3914 == class188.field2437) {
            int var256 = class334.field4414.method2392(false);
            byte var257 = class334.field4414.method2428(1797);
            class52.field606.method1327(var256, var257, 68);
            class188.field2437 = null;
            return true;
        } else if (class381.field5516 == class188.field2437) {
            int var258 = class334.field4414.method2386(-23648);
            if (class500.method3004((byte) -32, var258)) {
                class398.method2454((byte) 100);
            }
            class188.field2437 = null;
            return true;
        } else if (class393.field5681 == class188.field2437) {
            class154.method916(class334.field4414.method2432((byte) 125), (byte) 41);
            class188.field2437 = null;
            return true;
        } else if (class206.field2719 == class188.field2437) {
            int var259 = class334.field4414.method2388((byte) -115);
            int var260 = var259 >> 5;
            int var261 = var259 & 0x1F;
            if (var261 == 0) {
                class497.field7241[var260] = null;
                class188.field2437 = null;
                return true;
            }
            class523 var262 = new class523();
            var262.field7698 = var261;
            var262.field7689 = class334.field4414.method2388((byte) -119);
            if (var262.field7689 >= 0 && var262.field7689 < class152.field1984.length) {
                if (var262.field7698 == 1 || var262.field7698 == 10) {
                    var262.field7691 = class334.field4414.method2386(-23648);
                    class334.field4414.field5729 += 6;
                } else if (var262.field7698 >= 2 && var262.field7698 <= 6) {
                    if (var262.field7698 == 2) {
                        var262.field7687 = 64;
                        var262.field7692 = 64;
                    }
                    if (var262.field7698 == 3) {
                        var262.field7692 = 0;
                        var262.field7687 = 64;
                    }
                    if (var262.field7698 == 4) {
                        var262.field7687 = 64;
                        var262.field7692 = 128;
                    }
                    if (var262.field7698 == 5) {
                        var262.field7692 = 64;
                        var262.field7687 = 0;
                    }
                    if (var262.field7698 == 6) {
                        var262.field7692 = 64;
                        var262.field7687 = 128;
                    }
                    var262.field7698 = 2;
                    var262.field7696 = class334.field4414.method2388((byte) -118);
                    var262.field7692 += class334.field4414.method2386(-23648) - class357.field4867 << 7;
                    var262.field7687 += class334.field4414.method2386(-23648) - class418.field6074 << 7;
                    var262.field7695 = class334.field4414.method2388((byte) -120) << 0;
                    var262.field7699 = class334.field4414.method2386(arg0 ^ 0x5C5F);
                }
                var262.field7697 = class334.field4414.method2386(-23648);
                if (var262.field7697 == 65535) {
                    var262.field7697 = -1;
                }
                class497.field7241[var260] = var262;
            }
            class188.field2437 = null;
            return true;
        } else if (class57.field681 == class188.field2437) {
            int var263 = class334.field4414.method2409(arg0 - 3);
            int var264 = class334.field4414.method2412(-2131405832);
            int var265 = class334.field4414.method2387((byte) 125);
            if (class500.method3004((byte) -32, var265)) {
                class360 var266 = (class360) class152.field1989.method295((long) var264, -89);
                class360 var267 = (class360) class152.field1989.method295((long) var263, arg0 ^ 0x65);
                if (var267 != null) {
                    class115.method696(false, arg0 ^ 0xFFFFFFA7, var266 == null || var266.field4886 != var267.field4886, var267);
                }
                if (var266 != null) {
                    var266.method2674(true);
                    class152.field1989.method291((long) var263, var266, -51);
                }
                class450 var268 = class406.method2490((byte) -116, var264);
                if (var268 != null) {
                    class413.method2521(var268, false);
                }
                class450 var269 = class406.method2490((byte) -116, var263);
                if (var269 != null) {
                    class413.method2521(var269, false);
                    class433.method2667(0, var269, true);
                }
                if (class168.field2174 != -1) {
                    class63.method379(1, class168.field2174, true);
                }
            }
            class188.field2437 = null;
            return true;
        } else if (class55.field639 == class188.field2437) {
            class440.method2696(-1501808444);
            class188.field2437 = null;
            return false;
        } else if (class324.field4304 == class188.field2437) {
            int var270 = class334.field4414.method2406((byte) -115);
            int var271 = class334.field4414.method2392(false);
            int var272 = class334.field4414.method2387((byte) 125);
            if (class500.method3004((byte) -32, var272)) {
                class123.method736(var270, (byte) 11, var271);
            }
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class15.field156) {
            class111.field1481 = class334.field4414.method2388((byte) -122);
            class188.field2437 = null;
            return true;
        } else if (class386.field5615 == class188.field2437) {
            int var273 = class334.field4414.method2426((byte) 125);
            int var274 = class334.field4414.method2412(arg0 ^ 0x7F0AAC07);
            int var275 = class334.field4414.method2397(-15526);
            if (class500.method3004((byte) -32, var273)) {
                class174.method1022(0, var274, var275);
            }
            class188.field2437 = null;
            return true;
        } else if (class55.field635 == class188.field2437) {
            int var276 = class334.field4414.method2387((byte) 125);
            int var277 = class334.field4414.method2387((byte) 125);
            int var278 = class334.field4414.method2412(-2131405832);
            if (class500.method3004((byte) -32, var276)) {
                class291.method1745(var278, var277, (byte) 107);
            }
            class188.field2437 = null;
            return true;
        } else if (class68.field779 == class188.field2437) {
            String var279 = class334.field4414.method2432((byte) 125);
            boolean var280 = class334.field4414.method2388((byte) -111) == 1;
            String var281;
            if (var280) {
                var281 = class334.field4414.method2432((byte) 125);
            } else {
                var281 = var279;
            }
            int var282 = class334.field4414.method2386(-23648);
            byte var283 = class334.field4414.method2418(arg0 ^ 0x1E);
            boolean var284 = false;
            if (var283 == -128) {
                var284 = true;
            }
            if (var284) {
                if (class198.field2557 == 0) {
                    class188.field2437 = null;
                    return true;
                }
                boolean var285 = false;
                int var286;
                for (var286 = 0; var286 < class198.field2557 && (!class54.field623[var286].field6796.equals(var281) || class54.field623[var286].field6797 != var282); var286++) {
                }
                if (class198.field2557 > var286) {
                    while (var286 < class198.field2557 - 1) {
                        class54.field623[var286] = class54.field623[var286 + 1];
                        var286++;
                    }
                    class198.field2557--;
                    class54.field623[class198.field2557] = null;
                }
            } else {
                String var287 = class334.field4414.method2432((byte) 125);
                class454 var288 = new class454();
                var288.field6796 = var281;
                var288.field6794 = var279;
                var288.field6787 = class437.method2684(-96, var288.field6796);
                var288.field6789 = var287;
                var288.field6792 = var283;
                var288.field6797 = var282;
                int var289;
                for (var289 = class198.field2557 - 1; var289 >= 0; var289--) {
                    int var290 = class54.field623[var289].field6787.compareTo(var288.field6787);
                    if (var290 == 0) {
                        class54.field623[var289].field6797 = var282;
                        class54.field623[var289].field6792 = var283;
                        class54.field623[var289].field6789 = var287;
                        if (var281.equals(class96.field1170.field7783)) {
                            class317.field4242 = var283;
                        }
                        class188.field2437 = null;
                        class392.field5660 = class106.field1448;
                        return true;
                    }
                    if (var290 < 0) {
                        break;
                    }
                }
                if (class54.field623.length <= class198.field2557) {
                    class188.field2437 = null;
                    return true;
                }
                for (int var291 = class198.field2557 - 1; var291 > var289; var291--) {
                    class54.field623[var291 + 1] = class54.field623[var291];
                }
                if (class198.field2557 == 0) {
                    class54.field623 = new class454[100];
                }
                class54.field623[var289 + 1] = var288;
                class198.field2557++;
                if (var281.equals(class96.field1170.field7783)) {
                    class317.field4242 = var283;
                }
            }
            class188.field2437 = null;
            class392.field5660 = class106.field1448;
            return true;
        } else if (class302.field3995 == class188.field2437) {
            class321.method1900(class95.field1148, arg0 - 20146);
            class188.field2437 = null;
            return false;
        } else if (class188.field2437 == class188.field2434) {
            class244.method1519(class6.field61, -75);
            class188.field2437 = null;
            return true;
        } else if (class276.field3675 == class188.field2437) {
            class244.method1519(class517.field7625, -63);
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class184.field2397) {
            int var292 = class334.field4414.method2443(arg0 ^ 0x5F);
            int var293 = class334.field4414.method2406((byte) -97);
            int var294 = class334.field4414.method2388((byte) -127);
            String var295 = "";
            String var296 = var295;
            if ((var294 & 0x1) != 0) {
                var295 = class334.field4414.method2432((byte) 125);
                if ((var294 & 0x2) == 0) {
                    var296 = var295;
                } else {
                    var296 = class334.field4414.method2432((byte) 125);
                }
            }
            String var297 = class334.field4414.method2432((byte) 125);
            if (var292 == 99) {
                class329.method1930(var297, 25572);
            } else if (var296.equals("") || !class313.method1863((byte) -9, var296)) {
                class119.method714(var297, var296, var292, (byte) 102, var295, var293);
            } else {
                class188.field2437 = null;
                return true;
            }
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class140.field1865) {
            int var298 = class334.field4414.method2386(arg0 - 23647);
            int var299 = class334.field4414.method2406((byte) -102);
            if (class500.method3004((byte) -32, var298)) {
                class360 var300 = (class360) class152.field1989.method295((long) var299, -102);
                if (var300 != null) {
                    class115.method696(false, 110, true, var300);
                }
                if (class446.field6492 != null) {
                    class413.method2521(class446.field6492, false);
                    class446.field6492 = null;
                }
            }
            class188.field2437 = null;
            return true;
        } else if (class76.field954 == class188.field2437) {
            int var301 = class334.field4414.method2441(-25006);
            int var302 = class334.field4414.method2426((byte) 113);
            int var303 = class334.field4414.method2392(false);
            class22 var304 = class339.field4484[var302];
            if (var304 != null) {
                class525.method3125(-97, var303, var304, var301);
            }
            class188.field2437 = null;
            return true;
        } else if (class515.field7482 == class188.field2437) {
            int var305 = class334.field4414.method2386(-23648);
            if (var305 == 65535) {
                var305 = -1;
            }
            int var306 = class334.field4414.method2388((byte) -116);
            int var307 = class334.field4414.method2386(-23648);
            int var308 = class334.field4414.method2388((byte) -118);
            class379.method2313(arg0 ^ 0xFFFFFFA2, var308, var306, var307, var305);
            class188.field2437 = null;
            return true;
        } else if (class262.field3517 == class188.field2437) {
            boolean var309 = class334.field4414.method2388((byte) -117) == 1;
            byte[] var310 = new byte[class132.field1742 - 1];
            class334.field4414.method2395((byte) 109, var310, 0, class132.field1742 - 1);
            class483.method2944(var310, var309, arg0 + 1);
            class188.field2437 = null;
            return true;
        } else if (class207.field2727 == class188.field2437) {
            int var311 = class334.field4414.method2392(false);
            byte var312 = class334.field4414.method2418(-84);
            int var313 = class334.field4414.method2386(-23648);
            if (class500.method3004((byte) -32, var311)) {
                class21.method121(var313, (byte) 79, var312);
            }
            class188.field2437 = null;
            return true;
        } else if (class285.field3755 == class188.field2437) {
            class14.method85(class381.field5518, class132.field1742, class334.field4414, (byte) 94);
            class188.field2437 = null;
            return true;
        } else if (class239.field3176 == class188.field2437) {
            class334.field4414.field5729 += 28;
            if (class334.field4414.method2423(arg0 + 5)) {
                class459.method2826(class334.field4414.field5729 - 28, class334.field4414, 16208);
            }
            class188.field2437 = null;
            return true;
        } else if (class444.field6460 == class188.field2437) {
            int var314 = class334.field4414.method2412(arg0 ^ 0x7F0AAC07);
            int var315 = class334.field4414.method2409(-4);
            int var316 = class334.field4414.method2386(arg0 - 23647);
            int var317 = class334.field4414.method2426((byte) 117);
            if (class500.method3004((byte) -32, var316)) {
                class136.method825(5, var317, var315, (byte) -120, var314);
            }
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class121.field1568) {
            class417.method2583((byte) -34);
            class188.field2437 = null;
            return false;
        } else if (class527.field7737 == class188.field2437) {
            int var318 = class334.field4414.method2392(false);
            int var319 = class334.field4414.method2409(-4);
            if (class500.method3004((byte) -32, var318)) {
                class136.method825(3, -1, var319, (byte) -120, -1);
            }
            class188.field2437 = null;
            return true;
        } else if (class456.field6806 == class188.field2437) {
            int var320 = class334.field4414.method2386(-23648);
            if (class500.method3004((byte) -32, var320)) {
                class380.method2322((byte) 70);
            }
            class188.field2437 = null;
            return true;
        } else if (class6.field70 == class188.field2437) {
            int var321 = class334.field4414.method2386(-23648);
            int var322 = class334.field4414.method2426((byte) 93);
            int var323 = class334.field4414.method2431((byte) 103);
            int var324 = class334.field4414.method2387((byte) 125);
            if (class500.method3004((byte) -32, var322)) {
                class249.method1546(13, var323, (var324 << 16) + var321);
            }
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class122.field1586) {
            class166.method967(arg0 - 1);
            class188.field2437 = null;
            return true;
        } else if (class328.field4363 == class188.field2437) {
            int var325 = class334.field4414.method2392(false);
            int var326 = class334.field4414.method2412(-2131405832);
            if (class500.method3004((byte) -32, var325)) {
                class136.method825(5, class308.field4121, var326, (byte) -120, 0);
            }
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class174.field2247) {
            if (class119.field1559 != null) {
                class163.method957(-1, class319.field4256.field4675, false, -1, false);
            }
            byte[] var327 = new byte[class132.field1742];
            class334.field4414.method83(0, var327, class132.field1742, -108);
            String var328 = class527.method3129(class132.field1742, -161, 0, var327);
            class58.method346(class20.field183 == 1, var328, true, 3, class381.field5518);
            class188.field2437 = null;
            return true;
        } else if (class293.field3879 == class188.field2437) {
            boolean var329 = class334.field4414.method2388((byte) -125) == 1;
            String var330 = class334.field4414.method2432((byte) 125);
            String var331 = var330;
            if (var329) {
                var331 = class334.field4414.method2432((byte) 125);
            }
            long var332 = class334.field4414.method2391((byte) 0);
            long var334 = (long) class334.field4414.method2386(-23648);
            long var336 = (long) class334.field4414.method2396((byte) -111);
            int var338 = class334.field4414.method2388((byte) -122);
            long var339 = (var334 << 32) + var336;
            boolean var341 = false;
            int var342 = 0;
            while (true) {
                if (var342 >= 100) {
                    if (var338 <= 1) {
                        if (!(!class193.field2495 || class310.field4150) || class334.field4432) {
                            var341 = true;
                        } else if (class313.method1863((byte) -9, var331)) {
                            var341 = true;
                        }
                    }
                    break;
                }
                if (class277.field3677[var342] == var339) {
                    var341 = true;
                    break;
                }
                var342++;
            }
            if (!var341 && class94.field1120 == 0) {
                class277.field3677[class304.field4040] = var339;
                class304.field4040 = (class304.field4040 + 1) % 100;
                String var343 = class401.method2476(class274.method1665(class334.field4414, (byte) 24), false);
                if (var338 == 2 || var338 == 3) {
                    class124.method755(class474.method2893(var332, 111), var343, -1, true, "<img=1>" + var330, 9, "<img=1>" + var331, 0);
                } else if (var338 == 1) {
                    class124.method755(class474.method2893(var332, 124), var343, -1, true, "<img=0>" + var330, 9, "<img=0>" + var331, 0);
                } else {
                    class124.method755(class474.method2893(var332, 68), var343, -1, true, var330, 9, var331, 0);
                }
            }
            class188.field2437 = null;
            return true;
        } else if (class285.field3757 == class188.field2437) {
            int var344 = class334.field4414.method2386(-23648);
            int var345 = class334.field4414.method2447(4339);
            boolean var346 = (var345 & 0x1) == 1;
            class256.method1583(var344, (byte) 73, var346);
            class393.field5682[class95.method534(31, class139.field1853++)] = var344;
            class188.field2437 = null;
            return true;
        } else if (class428.field6225 == class188.field2437) {
            int var347 = class334.field4414.method2406((byte) -78);
            int var348 = var347 >> 28 & 0x3;
            int var349 = (var347 & 0xFFFEA7B) >> 14;
            int var350 = var347 & 0x3FFF;
            int var351 = class334.field4414.method2447(4339);
            int var352 = var351 >> 2;
            int var353 = var351 & 0x3;
            int var354 = class198.field2555[var352];
            int var355 = class334.field4414.method2426((byte) 74);
            int var356 = var349 - class357.field4867;
            if (var355 == 65535) {
                var355 = -1;
            }
            int var357 = var350 - class418.field6074;
            class419.method2590(var348, var354, var353, var352, var357, var355, -12, var356);
            class188.field2437 = null;
            return true;
        } else if (class206.field2717 == class188.field2437) {
            int var358 = class334.field4414.method2426((byte) 102);
            int var359 = class334.field4414.method2392(false);
            int var360 = class334.field4414.method2386(-23648);
            if (class500.method3004((byte) -32, var358)) {
                class387.method2351(var359, var360, 0, arg0 - 86);
            }
            class188.field2437 = null;
            return true;
        } else if (class429.field6241 == class188.field2437) {
            class214.method1365(false, (byte) -36);
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class184.field2389) {
            class244.method1519(class514.field7477, 99);
            class188.field2437 = null;
            return true;
        } else if (class33.field342 == class188.field2437) {
            class93.method523(class334.field4414, 123, class132.field1742);
            class188.field2437 = null;
            return true;
        } else if (class357.field4866 == class188.field2437) {
            int var361 = class334.field4414.method2386(-23648);
            int var362 = class334.field4414.method2426((byte) 110);
            String var363 = class334.field4414.method2432((byte) 125);
            if (class500.method3004((byte) -32, var361)) {
                class100.method612(var363, var362, (byte) -96);
            }
            class188.field2437 = null;
            return true;
        } else if (class91.field1088 == class188.field2437) {
            String var364 = class334.field4414.method2432((byte) 125);
            String var365 = class401.method2476(class274.method1665(class334.field4414, (byte) 24), false);
            class119.method714(var365, var364, 6, (byte) 102, var364, 0);
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class176.field2272) {
            int var366 = class334.field4414.method2447(4339);
            int var367 = class334.field4414.method2441(arg0 - 25005);
            if (var366 == 255) {
                var367 = -1;
                var366 = -1;
            }
            class175.method1026(true, var367, var366);
            class188.field2437 = null;
            return true;
        } else if (class241.field3195 == class188.field2437) {
            int var368 = class334.field4414.method2392(false);
            if (var368 == 65535) {
                var368 = -1;
            }
            int var369 = class334.field4414.method2431((byte) 59);
            int var370 = class334.field4414.method2392(false);
            int var371 = class334.field4414.method2409(-4);
            if (class500.method3004((byte) -32, var370)) {
                class469.method2863(var369, var371, var368, -112);
                class199 var372 = class237.field3158.method236(arg0 ^ 0x478A, var368);
                class209.method1333(var372.field2599, var371, var372.field2585, -1, var372.field2621);
                class309.method1846(var372.field2609, var372.field2638, 14216, var371, var372.field2589);
            }
            class188.field2437 = null;
            return true;
        } else if (class232.field3113 == class188.field2437) {
            class244.method1519(class338.field4468, -75);
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class138.field1845) {
            int var373 = class334.field4414.method2426((byte) 94);
            int var374 = class334.field4414.method2447(4339);
            if (class500.method3004((byte) -32, var373)) {
                class98.field1303 = var374;
            }
            class188.field2437 = null;
            return true;
        } else if (class495.field7231 == class188.field2437) {
            int var375 = class334.field4414.method2386(-23648);
            int var376 = class334.field4414.method2386(-23648);
            int var377 = class334.field4414.method2386(-23648);
            int var378 = class334.field4414.method2386(-23648);
            if (class500.method3004((byte) -32, var375) && class339.field4491[var376] != null) {
                for (int var379 = var377; var379 < var378; var379++) {
                    int var380 = class334.field4414.method2396((byte) 99);
                    if (var379 < class339.field4491[var376].length && class339.field4491[var376][var379] != null) {
                        class339.field4491[var376][var379].field6588 = var380;
                    }
                }
            }
            class188.field2437 = null;
            return true;
        } else if (class377.field5225 == class188.field2437) {
            class244.method1519(class316.field4228, -72);
            class188.field2437 = null;
            return true;
        } else if (class502.field7323 == class188.field2437) {
            int var381 = class334.field4414.method2388((byte) -123);
            if (class334.field4414.method2388((byte) -114) == 0) {
                class88.field1060[var381] = new class189();
            } else {
                class334.field4414.field5729--;
                class88.field1060[var381] = new class189(class334.field4414);
            }
            class188.field2437 = null;
            class450.field6696 = class106.field1448;
            return true;
        } else if (class418.field6073 == class188.field2437) {
            int var382 = class334.field4414.method2397(-15526);
            int var383 = class334.field4414.method2387((byte) 125);
            int var384 = class334.field4414.method2409(arg0 - 3);
            int var385 = class334.field4414.method2429(120);
            if (class500.method3004((byte) -32, var383)) {
                class68.method394(var384, var382, var385, (byte) -95);
            }
            class188.field2437 = null;
            return true;
        } else if (class379.field5478 == class188.field2437) {
            while (class334.field4414.field5729 < class132.field1742) {
                boolean var396 = class334.field4414.method2388((byte) -127) == 1;
                String var397 = class334.field4414.method2432((byte) 125);
                String var398 = class334.field4414.method2432((byte) 125);
                int var399 = class334.field4414.method2386(-23648);
                int var400 = class334.field4414.method2388((byte) -124);
                String var401 = "";
                boolean var402 = false;
                if (var399 > 0) {
                    var401 = class334.field4414.method2432((byte) 125);
                    var402 = class334.field4414.method2388((byte) -113) == 1;
                }
                for (int var403 = 0; var403 < class85.field1014; var403++) {
                    if (var396) {
                        if (var398.equals(class52.field611[var403])) {
                            class52.field611[var403] = var397;
                            class465.field6912[var403] = var398;
                            var397 = null;
                            break;
                        }
                    } else if (var397.equals(class52.field611[var403])) {
                        if (class91.field1090[var403] != var399) {
                            boolean var404 = true;
                            for (class304 var405 = (class304) class123.field1601.method290(-1); var405 != null; var405 = (class304) class123.field1601.method284(10748)) {
                                if (var405.field4041.equals(var397)) {
                                    if (var399 != 0 && var405.field4047 == 0) {
                                        var404 = false;
                                        var405.method1239(76);
                                    } else if (var399 == 0 && var405.field4047 != 0) {
                                        var404 = false;
                                        var405.method1239(81);
                                    }
                                }
                            }
                            if (var404) {
                                class123.field1601.method286((byte) -67, new class304(var397, var399));
                            }
                            class91.field1090[var403] = var399;
                        }
                        class465.field6912[var403] = var398;
                        class380.field5506[var403] = var401;
                        class285.field3756[var403] = var400;
                        var397 = null;
                        class122.field1589[var403] = var402;
                        break;
                    }
                }
                if (var397 != null && class85.field1014 < 200) {
                    class52.field611[class85.field1014] = var397;
                    class465.field6912[class85.field1014] = var398;
                    class91.field1090[class85.field1014] = var399;
                    class380.field5506[class85.field1014] = var401;
                    class285.field3756[class85.field1014] = var400;
                    class122.field1589[class85.field1014] = var402;
                    class85.field1014++;
                }
            }
            class381.field5519 = class106.field1448;
            class479.field7092 = 2;
            boolean var386 = false;
            int var387 = class85.field1014;
            while (var387 > 0) {
                var387--;
                boolean var388 = true;
                for (int var389 = 0; var389 < var387; var389++) {
                    if (class91.field1090[var389] != class255.field3395.field3559 && class91.field1090[var389 + 1] == class255.field3395.field3559 || class91.field1090[var389] == 0 && class91.field1090[var389 + 1] != 0) {
                        int var390 = class91.field1090[var389];
                        class91.field1090[var389] = class91.field1090[var389 + 1];
                        class91.field1090[var389 + 1] = var390;
                        String var391 = class380.field5506[var389];
                        class380.field5506[var389] = class380.field5506[var389 + 1];
                        class380.field5506[var389 + 1] = var391;
                        String var392 = class52.field611[var389];
                        class52.field611[var389] = class52.field611[var389 + 1];
                        class52.field611[var389 + 1] = var392;
                        String var393 = class465.field6912[var389];
                        class465.field6912[var389] = class465.field6912[var389 + 1];
                        class465.field6912[var389 + 1] = var393;
                        int var394 = class285.field3756[var389];
                        class285.field3756[var389] = class285.field3756[var389 + 1];
                        class285.field3756[var389 + 1] = var394;
                        boolean var395 = class122.field1589[var389];
                        class122.field1589[var389] = class122.field1589[var389 + 1];
                        var388 = false;
                        class122.field1589[var389 + 1] = var395;
                    }
                }
                if (var388) {
                    break;
                }
            }
            class188.field2437 = null;
            return true;
        } else if (class326.field4343 == class188.field2437) {
            class327.field4351 = class334.field4414.method2388((byte) -112);
            for (int var406 = 0; var406 < class327.field4351; var406++) {
                class384.field5591[var406] = class334.field4414.method2432((byte) 125);
                class428.field6226[var406] = class334.field4414.method2432((byte) 125);
                if (class428.field6226[var406].equals("")) {
                    class428.field6226[var406] = class384.field5591[var406];
                }
                class161.field2091[var406] = class334.field4414.method2432((byte) 125);
                class130.field1677[var406] = class334.field4414.method2432((byte) 125);
                if (class130.field1677[var406].equals("")) {
                    class130.field1677[var406] = class161.field2091[var406];
                }
                class127.field1646[var406] = false;
            }
            class381.field5519 = class106.field1448;
            class188.field2437 = null;
            return true;
        } else if (class325.field4334 == class188.field2437) {
            class481.field7111 = class334.field4414.method2447(4339);
            class477.field7058 = class334.field4414.method2447(4339);
            class188.field2437 = null;
            return true;
        } else if (class419.field6081 == class188.field2437) {
            class244.method1519(class517.field7626, arg0 + 89);
            class188.field2437 = null;
            return true;
        } else if (class475.field7035 == class188.field2437) {
            class244.method1519(class401.field5817, -82);
            class188.field2437 = null;
            return true;
        } else if (class453.field6786 == class188.field2437) {
            class244.method1519(class215.field2935, 83);
            class188.field2437 = null;
            return true;
        } else if (class188.field2437 == class134.field1764) {
            for (int var407 = 0; var407 < class29.field272.length; var407++) {
                if (class29.field272[var407] != null) {
                    class29.field272[var407].field1196 = -1;
                }
            }
            for (int var408 = 0; var408 < class339.field4484.length; var408++) {
                if (class339.field4484[var408] != null) {
                    class339.field4484[var408].field1196 = -1;
                }
            }
            class188.field2437 = null;
            return true;
        } else {
            client.method1256(null, -2020, "T1 - " + (class188.field2437 == null ? -1 : class188.field2437.method1090(2)) + "," + (class93.field1117 == null ? -1 : class93.field1117.method1090(2)) + "," + (class272.field3626 == null ? -1 : class272.field3626.method1090(arg0 + 3)) + " - " + class132.field1742);
            class321.method1900(false, -20147);
            return true;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V", line = 3209)
    public static void method2362(int arg0) {
        if (arg0 != -1) {
            field5647 = null;
        }
        field5647 = null;
    }
}
