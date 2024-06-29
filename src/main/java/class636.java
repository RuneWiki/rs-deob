import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class636 extends class766 {

    @OriginalMember(owner = "client!nba", name = "t", descriptor = "I")
    public int field8991;

    @OriginalMember(owner = "client!nba", name = "r", descriptor = "I")
    public int field8989;

    @OriginalMember(owner = "client!nba", name = "p", descriptor = "I")
    public static int field8987 = 0;

    @OriginalMember(owner = "client!nba", name = "n", descriptor = "I")
    public static int field8985;

    @OriginalMember(owner = "client!nba", name = "o", descriptor = "I")
    public static int field8986;

    @OriginalMember(owner = "client!nba", name = "q", descriptor = "I")
    public static int field8988;

    @OriginalMember(owner = "client!nba", name = "s", descriptor = "I")
    public static int field8990;

    @OriginalMember(owner = "client!nba", name = "v", descriptor = "I")
    public static int field8993;

    @OriginalMember(owner = "client!nba", name = "u", descriptor = "Lgga;")
    public static class513 field8992;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)Z")
    public static final boolean method3622(byte arg0) throws IOException {
        field8990++;
        if (class600.field8551 == null) {
            return false;
        }
        if (class673.field9429 == null) {
            if (class210.field3081) {
                if (!class600.field8551.method186(1, arg0 - 178)) {
                    return false;
                }
                class600.field8551.method185(1, class48.field674.field6002, 0, -90);
                class519.field7125++;
                class210.field3081 = false;
                class577.field8318 = 0;
            }
            class48.field674.field5983 = 0;
            if (class48.field674.method2224(arg0 + 1898356113)) {
                if (!class600.field8551.method186(1, -101)) {
                    return false;
                }
                class600.field8551.method185(1, class48.field674.field6002, 1, -88);
                class577.field8318 = 0;
                class519.field7125++;
            }
            class210.field3081 = true;
            class380[] var1 = class508.method2971(false);
            int var2 = class48.field674.method2228((byte) 90);
            if (var2 < 0 || var1.length <= var2) {
                throw new IOException("invo:" + var2 + " ip:" + class48.field674.field5983);
            }
            class673.field9429 = var1[var2];
            class549.field7634 = class673.field9429.field5324;
        }
        if (class549.field7634 == -1) {
            if (!class600.field8551.method186(1, -111)) {
                return false;
            }
            class600.field8551.method185(1, class48.field674.field6002, 0, -117);
            class549.field7634 = class48.field674.field6002[0] & 0xFF;
            class519.field7125++;
            class577.field8318 = 0;
        }
        if (class549.field7634 == -2) {
            if (!class600.field8551.method186(2, -97)) {
                return false;
            }
            class600.field8551.method185(2, class48.field674.field6002, 0, -76);
            class48.field674.field5983 = 0;
            class549.field7634 = class48.field674.method2565((byte) -86);
            class519.field7125 += 2;
            class577.field8318 = 0;
        }
        if (class549.field7634 > 0) {
            if (!class600.field8551.method186(class549.field7634, -113)) {
                return false;
            }
            class48.field674.field5983 = 0;
            class600.field8551.method185(class549.field7634, class48.field674.field6002, 0, -108);
            class519.field7125 += class549.field7634;
            class577.field8318 = 0;
        }
        class651.field9225 = class654.field9250;
        class654.field9250 = class95.field1354;
        class95.field1354 = class673.field9429;
        if (class673.field9429 == class667.field9380) {
            while (class48.field674.field5983 < class549.field7634) {
                boolean var13 = class48.field674.method2557(14929) == 1;
                String var14 = class48.field674.method2532((byte) -117);
                String var15 = class48.field674.method2532((byte) -120);
                int var16 = class48.field674.method2565((byte) -107);
                int var17 = class48.field674.method2557(14929);
                String var18 = "";
                boolean var19 = false;
                if (var16 > 0) {
                    var18 = class48.field674.method2532((byte) -126);
                    var19 = class48.field674.method2557(14929) == 1;
                }
                for (int var20 = 0; var20 < class381.field5340; var20++) {
                    if (var13) {
                        if (var15.equals(class586.field8428[var20])) {
                            class586.field8428[var20] = var14;
                            class713.field9952[var20] = var15;
                            var14 = null;
                            break;
                        }
                    } else if (var14.equals(class586.field8428[var20])) {
                        if (class276.field3930[var20] != var16) {
                            boolean var21 = true;
                            for (class521 var22 = (class521) class430.field5949.method1730((byte) 123); var22 != null; var22 = (class521) class430.field5949.method1729((byte) 100)) {
                                if (var22.field7309.equals(var14)) {
                                    if (var16 != 0 && var22.field7307 == 0) {
                                        var22.method781(5555);
                                        var21 = false;
                                    } else if (var16 == 0 && var22.field7307 != 0) {
                                        var21 = false;
                                        var22.method781(arg0 ^ 0x1581);
                                    }
                                }
                            }
                            if (var21) {
                                class430.field5949.method1734(new class521(var14, var16), 0);
                            }
                            class276.field3930[var20] = var16;
                        }
                        class713.field9952[var20] = var15;
                        class322.field4583[var20] = var18;
                        class724.field10090[var20] = var17;
                        var14 = null;
                        class729.field10167[var20] = var19;
                        break;
                    }
                }
                if (var14 != null && class381.field5340 < 200) {
                    class586.field8428[class381.field5340] = var14;
                    class713.field9952[class381.field5340] = var15;
                    class276.field3930[class381.field5340] = var16;
                    class322.field4583[class381.field5340] = var18;
                    class724.field10090[class381.field5340] = var17;
                    class729.field10167[class381.field5340] = var19;
                    class381.field5340++;
                }
            }
            class576.field8307 = 2;
            class732.field10182 = class745.field10359;
            boolean var3 = false;
            int var4 = class381.field5340;
            while (var4 > 0) {
                var4--;
                boolean var5 = true;
                for (int var6 = 0; var6 < var4; var6++) {
                    if (class276.field3930[var6] != class472.field6424.field5598 && class276.field3930[var6 + 1] == class472.field6424.field5598 || class276.field3930[var6] == 0 && class276.field3930[var6 + 1] != 0) {
                        int var7 = class276.field3930[var6];
                        class276.field3930[var6] = class276.field3930[var6 + 1];
                        class276.field3930[var6 + 1] = var7;
                        String var8 = class322.field4583[var6];
                        class322.field4583[var6] = class322.field4583[var6 + 1];
                        class322.field4583[var6 + 1] = var8;
                        String var9 = class586.field8428[var6];
                        class586.field8428[var6] = class586.field8428[var6 + 1];
                        class586.field8428[var6 + 1] = var9;
                        String var10 = class713.field9952[var6];
                        class713.field9952[var6] = class713.field9952[var6 + 1];
                        class713.field9952[var6 + 1] = var10;
                        int var11 = class724.field10090[var6];
                        class724.field10090[var6] = class724.field10090[var6 + 1];
                        class724.field10090[var6 + 1] = var11;
                        boolean var12 = class729.field10167[var6];
                        class729.field10167[var6] = class729.field10167[var6 + 1];
                        class729.field10167[var6 + 1] = var12;
                        var5 = false;
                    }
                }
                if (var5) {
                    break;
                }
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class425.field5905) {
            class42.method322(class222.field3260, arg0 + 77);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class109.field1552) {
            String var23 = class48.field674.method2532((byte) -117);
            int var24 = class48.field674.method2580((byte) 88);
            class282.method1800(2);
            class500.method2923(var24, var23, (byte) -35);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class115.field1973) {
            int var25 = class48.field674.method2540(-16010);
            int var26 = class48.field674.method2565((byte) -82);
            class578.field8328.method4314(var26, (byte) 33, var25);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class237.field3425) {
            int var27 = class48.field674.method2580((byte) 109);
            String var28 = class48.field674.method2532((byte) -111);
            class282.method1800(2);
            class500.method2923(var27, var28, (byte) -35);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class228.field3317) {
            String var29 = class48.field674.method2532((byte) -113);
            int var30 = class48.field674.method2565((byte) -120);
            String var31 = class502.field6884.method2392(var30, arg0 ^ 0x7FCD).method1042((byte) 112, class48.field674);
            class647.method3660(var29, 19, null, var31, var29, var30, var29, 0, arg0 + 49);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class17.field182) {
            int var32 = class48.field674.method2555(arg0 + 74);
            int var33 = class48.field674.method2561((byte) -94);
            int var34 = class48.field674.method2580((byte) 104);
            if (var34 == 65535) {
                var34 = -1;
            }
            String var35 = class48.field674.method2532((byte) -120);
            if (var33 >= 1 && var33 <= 8) {
                if (var35.equalsIgnoreCase("null")) {
                    var35 = null;
                }
                class402.field5552[var33 - 1] = var35;
                class762.field10563[var33 - 1] = var34;
                class454.field6216[var33 - 1] = var32 == 0;
            }
            class673.field9429 = null;
            return true;
        } else if (class687.field9716 == class673.field9429) {
            class429.method2508(true, class549.field7634, class48.field674);
            class673.field9429 = null;
            return true;
        } else if (class714.field9965 == class673.field9429) {
            class578.field8328.method4311(-12151);
            class673.field9429 = null;
            class16.field180 += 32;
            return true;
        } else if (class769.field10611 == class673.field9429) {
            int var36 = class48.field674.method2568((byte) -80) << 2;
            int var37 = class48.field674.method2557(14929);
            int var38 = class48.field674.method2555(arg0 + 74);
            int var39 = class48.field674.method2557(14929);
            int var40 = class48.field674.method2555(127);
            class282.method1800(2);
            class452.method2657(var38, (byte) -128, var36, var39, var40, var37);
            class673.field9429 = null;
            return true;
        } else if (class745.field10362 == class673.field9429) {
            class379.field5320 = class48.field674.method2557(14929);
            class700.field9818 = class745.field10359;
            class673.field9429 = null;
            return true;
        } else if (class695.field9787 == class673.field9429) {
            int var41 = class48.field674.method2560(true);
            int var42 = class48.field674.method2521(113);
            int var43 = class48.field674.method2576(126);
            class282.method1800(2);
            class27 var44 = (class27) class37.field437.method4253((long) var42, -1);
            if (var44 != null) {
                class251.method1663(false, false, var44, var44.field284 != var43);
            }
            class33.method271(var43, false, var41, (byte) -104, var42);
            class673.field9429 = null;
            return true;
        } else if (class737.field10221 == class673.field9429) {
            class512.method2984(class336.field4775, class48.field674, class549.field7634, (byte) -112);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class645.field9173) {
            class728.field10163 = class48.field674.method2528((byte) 89);
            class673.field9429 = null;
            class700.field9818 = class745.field10359;
            return true;
        } else if (class673.field9429 == class27.field287) {
            int var45 = class48.field674.method2565((byte) -94);
            int var46 = class48.field674.method2540(-16010);
            class282.method1800(2);
            class5.method33(82, var45, var46);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class193.field2895) {
            class42.method322(class120.field2046, 99);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class605.field8589) {
            int var47 = class48.field674.method2521(112);
            int var48 = class48.field674.method2576(arg0 ^ 0x47);
            if (var48 == 65535) {
                var48 = -1;
            }
            class282.method1800(arg0 ^ 0x30);
            class662.method3709(-1, var47, arg0 ^ 0x36, var48, 2);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class659.field9290) {
            int var49 = class48.field674.method2540(arg0 - 16060);
            int var50 = class48.field674.method2521(-123);
            int var51 = class48.field674.method2580((byte) 90);
            if (var51 == 65535) {
                var51 = -1;
            }
            class282.method1800(arg0 - 48);
            class791.method4325((byte) -113, var50, var49, var51);
            class42 var52 = class422.field5873.method2937((byte) -45, var51);
            class276.method1748(var52.field510, var52.field524, 1, var50, var52.field559);
            class33.method270(var50, (byte) 52, var52.field545, var52.field542, var52.field523);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class389.field5433) {
            boolean var53 = class48.field674.method2557(arg0 + 14879) == 1;
            String var54 = class48.field674.method2532((byte) -112);
            long var55 = (long) class48.field674.method2565((byte) -112);
            long var57 = (long) class48.field674.method2515(88);
            int var59 = class48.field674.method2557(14929);
            int var60 = class48.field674.method2565((byte) -128);
            long var61 = (var55 << 32) + var57;
            boolean var63 = false;
            Object var64 = null;
            class465 var65 = var53 ? class274.field3846 : class138.field2285;
            if (var65 == null) {
                var63 = true;
            } else {
                label2118: {
                    for (int var66 = 0; var66 < 100; var66++) {
                        if (class74.field1143[var66] == var61) {
                            var63 = true;
                            break label2118;
                        }
                    }
                    if (var59 <= 1 && class439.method2611(8348, var54)) {
                        var63 = true;
                    }
                }
            }
            if (!var63 && class624.field8861 == 0) {
                class74.field1143[class68.field1104] = var61;
                class68.field1104 = (class68.field1104 + 1) % 100;
                String var67 = class502.field6884.method2392(var60, arg0 ^ 0x7FCD).method1042((byte) 112, class48.field674);
                int var68 = var53 ? 42 : 45;
                if (var59 == 2 || var59 == 3) {
                    class647.method3660("<img=1>" + var54, var68, var65.field6331, var67, var54, var60, "<img=1>" + var54, 0, 99);
                } else if (var59 == 1) {
                    class647.method3660("<img=0>" + var54, var68, var65.field6331, var67, var54, var60, "<img=0>" + var54, 0, 99);
                } else {
                    class647.method3660(var54, var68, var65.field6331, var67, var54, var60, var54, 0, 99);
                }
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class453.field6203) {
            class42.method322(class302.field4339, arg0 ^ 0x54);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class407.field5604) {
            if (class761.method4207((byte) 99, class141.field2306)) {
                class609.field8651 = (int) ((float) class48.field674.method2565((byte) -103) * 2.5F);
            } else {
                class609.field8651 = class48.field674.method2565((byte) -117) * 30;
            }
            class673.field9429 = null;
            class700.field9818 = class745.field10359;
            return true;
        } else if (class673.field9429 == class419.field5806) {
            class353.field5018 = class48.field674.method2529(122);
            if (class353.field5018 == 0 || class353.field5018 == 1) {
                class523.field7330 = true;
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class272.field3818) {
            class673.field9429 = null;
            return false;
        } else if (class673.field9429 == class143.field2324) {
            int var69 = class48.field674.method2565((byte) -97);
            int var70 = class48.field674.method2576(123);
            class282.method1800(2);
            class222.method1527(var70, 0, -105, var69);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class667.field9382) {
            int[] var71 = new int[4];
            for (int var72 = 0; var72 < 4; var72++) {
                var71[var72] = class48.field674.method2565((byte) -84);
            }
            int var73 = class48.field674.method2560(true);
            int var74 = class48.field674.method2576(114);
            class647 var75 = (class647) class486.field6697.method4253((long) var74, arg0 ^ 0xFFFFFFCD);
            if (var75 != null) {
                class777.method4274(var71, var73, false, var75.field9191);
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class182.field2766) {
            int var76 = class48.field674.method2576(116);
            if (var76 == 65535) {
                var76 = -1;
            }
            int var77 = class48.field674.method2540(arg0 - 16060);
            class282.method1800(2);
            class662.method3709(-1, var77, 4, var76, 1);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class113.field1625) {
            class42.method322(class733.field10186, 97);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class158.field2465) {
            int var78 = class48.field674.method2557(14929);
            boolean var79 = (var78 & 0x1) == 1;
            String var80 = class48.field674.method2532((byte) -114);
            String var81 = class48.field674.method2532((byte) -114);
            if (var81.equals("")) {
                var81 = var80;
            }
            String var82 = class48.field674.method2532((byte) -116);
            String var83 = class48.field674.method2532((byte) -117);
            if (var83.equals("")) {
                var83 = var82;
            }
            if (var79) {
                for (int var84 = 0; var84 < class458.field6267; var84++) {
                    if (class460.field6286[var84].equals(var83)) {
                        class263.field3721[var84] = var80;
                        class460.field6286[var84] = var81;
                        class581.field8364[var84] = var82;
                        class482.field6621[var84] = var83;
                        break;
                    }
                }
            } else {
                class263.field3721[class458.field6267] = var80;
                class460.field6286[class458.field6267] = var81;
                class581.field8364[class458.field6267] = var82;
                class482.field6621[class458.field6267] = var83;
                class217.field3164[class458.field6267] = class194.method1380(var78, 2) == 2;
                class458.field6267++;
            }
            class673.field9429 = null;
            class732.field10182 = class745.field10359;
            return true;
        } else if (class673.field9429 == class443.field6137) {
            int var85 = class48.field674.method2580((byte) 100);
            if (var85 == 65535) {
                var85 = -1;
            }
            int var86 = class48.field674.method2577(arg0 + 16);
            class282.method1800(2);
            class785.method4306(var85, var86, (byte) 124);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class548.field7588) {
            int var87 = class48.field674.method2565((byte) -126);
            int var88 = class48.field674.method2557(14929);
            boolean var89 = (var88 & 0x1) == 1;
            while (class549.field7634 > class48.field674.field5983) {
                int var90 = class48.field674.method2527((byte) -24);
                int var91 = class48.field674.method2565((byte) -121);
                int var92 = 0;
                if (var91 != 0) {
                    var92 = class48.field674.method2557(14929);
                    if (var92 == 255) {
                        var92 = class48.field674.method2526(17);
                    }
                }
                class658.method3689(var89, var90, -97, var91 - 1, var87, var92);
            }
            class296.field4304[class194.method1380(class87.field1299++, 31)] = var87;
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class518.field7121) {
            int var93 = class48.field674.method2580((byte) 85);
            if (var93 == 65535) {
                var93 = -1;
            }
            int var94 = class48.field674.method2577(95);
            int var95 = class48.field674.method2565((byte) -127);
            int var96 = class48.field674.method2576(115);
            class282.method1800(arg0 - 48);
            if (var96 == 65535) {
                var96 = -1;
            }
            for (int var97 = var93; var97 <= var96; var97++) {
                long var98 = ((long) var94 << 32) + (long) var97;
                class169 var100 = (class169) class114.field1802.method4253(var98, arg0 - 51);
                class169 var101;
                if (var100 != null) {
                    var101 = new class169(var100.field2564, var95);
                    var100.method4237(-1);
                } else if (var97 == -1) {
                    var101 = new class169(class604.method3506(var94, 255).field7217.field2564, var95);
                } else {
                    var101 = new class169(0, var95);
                }
                class114.field1802.method4252(false, var101, var98);
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class185.field2806) {
            int var102 = class48.field674.method2526(arg0 ^ 0x23);
            int var103 = class48.field674.method2580((byte) 123);
            if (var103 == 65535) {
                var103 = -1;
            }
            int var104 = class48.field674.method2576(124);
            if (var104 == 65535) {
                var104 = -1;
            }
            int var105 = class48.field674.method2526(17);
            class282.method1800(arg0 ^ 0x30);
            for (int var106 = var103; var106 <= var104; var106++) {
                long var107 = ((long) var105 << 32) + (long) var106;
                class169 var109 = (class169) class114.field1802.method4253(var107, arg0 ^ 0xFFFFFFCD);
                class169 var110;
                if (var109 != null) {
                    var110 = new class169(var102, var109.field2555);
                    var109.method4237(-1);
                } else if (var106 == -1) {
                    var110 = new class169(var102, class604.method3506(var105, 255).field7217.field2555);
                } else {
                    var110 = new class169(var102, -1);
                }
                class114.field1802.method4252(false, var110, var107);
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class596.field8516) {
            int var111 = class48.field674.method2521(-122);
            int var112 = class48.field674.method2576(123);
            int var113 = class48.field674.method2565((byte) -91);
            class282.method1800(arg0 - 48);
            class790.method4319((var112 << 16) + var113, false, var111);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class506.field6942) {
            class42.method322(class387.field5410, 103);
            class673.field9429 = null;
            return true;
        } else if (class83.field1257 == class673.field9429) {
            int var114 = class48.field674.method2577(79);
            int var115 = class48.field674.method2552(1311889544);
            class282.method1800(2);
            class656.method3679(var115, var114, false);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class645.field9172) {
            class673.field9429 = null;
            class732.field10182 = class745.field10359;
            class576.field8307 = 1;
            return true;
        } else if (class673.field9429 == class30.field327) {
            class477.method2832(class759.field10515, (byte) -54);
            class673.field9429 = null;
            return false;
        } else if (class673.field9429 == class607.field8631) {
            class68.field1100 = class745.field10359;
            boolean var116 = class48.field674.method2557(14929) == 1;
            if (class549.field7634 != 1) {
                if (var116) {
                    class274.field3846 = new class465(class48.field674);
                } else {
                    class138.field2285 = new class465(class48.field674);
                }
                class673.field9429 = null;
                return true;
            }
            if (var116) {
                class274.field3846 = null;
            } else {
                class138.field2285 = null;
            }
            class673.field9429 = null;
            return true;
        } else if (class792.field10849 == class673.field9429) {
            int var117 = class48.field674.method2565((byte) -83);
            int var118 = class48.field674.method2577(71);
            int var119 = class48.field674.method2565((byte) -112);
            int var120 = class48.field674.method2576(121);
            class282.method1800(2);
            class276.method1748(var117, var120, 1, var118, var119);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class125.field2143) {
            int var121 = class48.field674.method2557(arg0 ^ 0x3A63);
            int var122 = class48.field674.method2561((byte) -94);
            if (var121 == 255) {
                var121 = -1;
                var122 = -1;
            }
            class169.method1250(var122, var121, 0);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class370.field5220) {
            class712.field9943 = class48.field674.method2561((byte) -94);
            class791.field10846 = class48.field674.method2555(arg0 + 76);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class573.field8129) {
            int var123 = class48.field674.method2577(arg0 ^ 0x77);
            if (class116.field1980 != var123) {
                class116.field1980 = var123;
                class46.method356(class513.field7046, -1, -1);
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class330.field4704) {
            class42.method322(class297.field4320, arg0 + 27);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class24.field270) {
            int var124 = class48.field674.method2565((byte) -120);
            int var125 = class48.field674.method2565((byte) -86);
            int var126 = class48.field674.method2565((byte) -106);
            class282.method1800(2);
            if (class610.field8661[var124] != null) {
                for (int var127 = var125; var127 < var126; var127++) {
                    int var128 = class48.field674.method2515(113);
                    if (var127 < class610.field8661[var124].length && class610.field8661[var124][var127] != null) {
                        class610.field8661[var124][var127].field7147 = var128;
                    }
                }
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class13.field161) {
            int var129 = class48.field674.method2576(120);
            int var130 = class48.field674.method2561((byte) -94);
            class578.field8328.method4307(var129, 24391, var130);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class599.field8545) {
            int var131 = class48.field674.method2517((byte) -109);
            int var132 = class48.field674.method2528((byte) 89);
            int var133 = class48.field674.method2577(arg0 + 77);
            class282.method1800(2);
            class464.method2706(-30458, var131, var132, var133);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class455.field6219) {
            class282.method1800(2);
            class420.method2482((byte) -30);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class350.field4964) {
            class42.method322(class72.field1136, 62);
            class673.field9429 = null;
            return true;
        } else if (class697.field9794 == class673.field9429) {
            for (int var134 = 0; var134 < class588.field8451.length; var134++) {
                if (class588.field8451[var134] != null) {
                    class588.field8451[var134].field4088 = null;
                    class588.field8451[var134].field4064 = -1;
                }
            }
            for (int var135 = 0; var135 < class51.field731; var135++) {
                class654.field9252[var135].field9191.field4088 = null;
                class654.field9252[var135].field9191.field4064 = -1;
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class356.field5059) {
            int var136 = class48.field674.method2565((byte) -100);
            if (var136 == 65535) {
                var136 = -1;
            }
            int var137 = class48.field674.method2557(14929);
            int var138 = class48.field674.method2565((byte) -82);
            int var139 = class48.field674.method2557(arg0 ^ 0x3A63);
            class75.method691(var137, var139, var136, var138, 256, true, 0);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class611.field8671) {
            boolean var140 = class48.field674.method2557(14929) == 1;
            String var141 = class48.field674.method2532((byte) -128);
            String var142 = var141;
            if (var140) {
                var142 = class48.field674.method2532((byte) -125);
            }
            int var143 = class48.field674.method2557(14929);
            boolean var144 = false;
            if (var143 <= 1) {
                if (!(!class273.field3833 || class115.field1975) || class419.field5810) {
                    var144 = true;
                } else if (var143 <= 1 && class439.method2611(8348, var142)) {
                    var144 = true;
                }
            }
            if (!var144 && class624.field8861 == 0) {
                String var145 = class326.method1978(class364.method2188(class48.field674, (byte) -64), false);
                if (var143 == 2) {
                    class647.method3660("<img=1>" + var141, 24, null, var145, var141, -1, "<img=1>" + var142, 0, 99);
                } else if (var143 == 1) {
                    class647.method3660("<img=0>" + var141, 24, null, var145, var141, -1, "<img=0>" + var142, 0, 99);
                } else {
                    class647.method3660(var141, 24, null, var145, var141, -1, var142, 0, 99);
                }
            }
            class673.field9429 = null;
            return true;
        } else if (class768.field10603 == class673.field9429) {
            boolean var146 = class48.field674.method2557(14929) == 1;
            String var147 = class48.field674.method2532((byte) -122);
            long var148 = (long) class48.field674.method2565((byte) -121);
            long var150 = (long) class48.field674.method2515(arg0 - 19);
            int var152 = class48.field674.method2557(14929);
            long var153 = (var148 << 32) + var150;
            boolean var155 = false;
            Object var156 = null;
            class465 var157 = var146 ? class274.field3846 : class138.field2285;
            if (var157 == null) {
                var155 = true;
            } else {
                label2136: {
                    for (int var158 = 0; var158 < 100; var158++) {
                        if (class74.field1143[var158] == var153) {
                            var155 = true;
                            break label2136;
                        }
                    }
                    if (var152 <= 1) {
                        if (!(!class273.field3833 || class115.field1975) || class419.field5810) {
                            var155 = true;
                        } else if (class439.method2611(8348, var147)) {
                            var155 = true;
                        }
                    }
                }
            }
            if (!var155 && class624.field8861 == 0) {
                class74.field1143[class68.field1104] = var153;
                class68.field1104 = (class68.field1104 + 1) % 100;
                String var159 = class326.method1978(class364.method2188(class48.field674, (byte) -127), false);
                int var160 = var146 ? 41 : 44;
                if (var152 == 2 || var152 == 3) {
                    class647.method3660("<img=1>" + var147, var160, var157.field6331, var159, var147, -1, "<img=1>" + var147, 0, 99);
                } else if (var152 == 1) {
                    class647.method3660("<img=0>" + var147, var160, var157.field6331, var159, var147, -1, "<img=0>" + var147, 0, 99);
                } else {
                    class647.method3660(var147, var160, var157.field6331, var159, var147, -1, var147, 0, 99);
                }
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class316.field4519) {
            boolean var161 = class48.field674.method2557(14929) == 1;
            String var162 = class48.field674.method2532((byte) -126);
            String var163 = var162;
            if (var161) {
                var163 = class48.field674.method2532((byte) -128);
            }
            int var164 = class48.field674.method2557(14929);
            int var165 = class48.field674.method2565((byte) -88);
            boolean var166 = false;
            if (var164 <= 1 && class439.method2611(8348, var163)) {
                var166 = true;
            }
            if (!var166 && class624.field8861 == 0) {
                String var167 = class502.field6884.method2392(var165, 32767).method1042((byte) 112, class48.field674);
                if (var164 == 2) {
                    class647.method3660("<img=1>" + var162, 25, null, var167, var162, var165, "<img=1>" + var163, 0, 99);
                } else if (var164 == 1) {
                    class647.method3660("<img=0>" + var162, 25, null, var167, var162, var165, "<img=0>" + var163, 0, arg0 + 49);
                } else {
                    class647.method3660(var162, 25, null, var167, var162, var165, var163, 0, 99);
                }
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class427.field5924) {
            int var168 = class48.field674.method2565((byte) -123);
            int var169 = class48.field674.method2557(14929);
            boolean var170 = (var169 & 0x1) == 1;
            class742.method4097(var170, 115, var168);
            int var171 = class48.field674.method2565((byte) -110);
            for (int var172 = 0; var172 < var171; var172++) {
                int var173 = class48.field674.method2580((byte) 52);
                int var174 = class48.field674.method2561((byte) -94);
                if (var174 == 255) {
                    var174 = class48.field674.method2521(18);
                }
                class658.method3689(var170, var172, arg0 + 32, var173 + -1, var168, var174);
            }
            class296.field4304[class194.method1380(class87.field1299++, 31)] = var168;
            class673.field9429 = null;
            return true;
        } else if (class87.field1293 == class673.field9429) {
            int var175 = class48.field674.method2555(arg0 ^ 0x4E);
            int var176 = class48.field674.method2568((byte) -80);
            boolean var177 = (var175 & 0x1) == 1;
            class458.method2678((byte) 27, var177, var176);
            class296.field4304[class194.method1380(class87.field1299++, 31)] = var176;
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class591.field8477) {
            int var178 = class48.field674.method2557(14929);
            int var179 = var178 >> 5;
            int var180 = var178 & 0x1F;
            if (var180 == 0) {
                class55.field870[var179] = null;
                class673.field9429 = null;
                return true;
            }
            class780 var181 = new class780();
            var181.field10692 = var180;
            var181.field10689 = class48.field674.method2557(14929);
            if (var181.field10689 >= 0 && var181.field10689 < class491.field6736.length) {
                if (var181.field10692 == 1 || var181.field10692 == 10) {
                    var181.field10686 = class48.field674.method2565((byte) -105);
                    class48.field674.field5983 += 6;
                } else if (var181.field10692 >= 2 && var181.field10692 <= 6) {
                    if (var181.field10692 == 2) {
                        var181.field10688 = 256;
                        var181.field10687 = 256;
                    }
                    if (var181.field10692 == 3) {
                        var181.field10687 = 256;
                        var181.field10688 = 0;
                    }
                    if (var181.field10692 == 4) {
                        var181.field10687 = 256;
                        var181.field10688 = 512;
                    }
                    if (var181.field10692 == 5) {
                        var181.field10688 = 256;
                        var181.field10687 = 0;
                    }
                    if (var181.field10692 == 6) {
                        var181.field10688 = 256;
                        var181.field10687 = 512;
                    }
                    var181.field10692 = 2;
                    var181.field10694 = class48.field674.method2557(14929);
                    var181.field10688 += class48.field674.method2565((byte) -89) - class222.field3266 << 9;
                    var181.field10687 += class48.field674.method2565((byte) -105) - class697.field9798 << 9;
                    var181.field10696 = class48.field674.method2557(14929) << 2;
                    var181.field10693 = class48.field674.method2565((byte) -96);
                }
                var181.field10690 = class48.field674.method2565((byte) -98);
                if (var181.field10690 == 65535) {
                    var181.field10690 = -1;
                }
                class55.field870[var179] = var181;
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class582.field8372) {
            if (class259.field3676 != null) {
                class548.method3169(-1, -8361, class420.field5820.field9488.method3773(17539), -1, false);
            }
            byte[] var182 = new byte[class549.field7634];
            class48.field674.method2226(0, 0, var182, class549.field7634);
            String var183 = class142.method1144(var182, class549.field7634, (byte) -53, 0);
            class157.method1214(class336.field4775, true, -77, class420.field5820.field9482.method2338(17539) == 1, var183);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class265.field3742) {
            int var184 = class48.field674.method2540(-16010);
            class282.method1800(2);
            if (var184 == -1) {
                class743.field10323 = -1;
                class401.field5533 = -1;
            } else {
                int var185 = (var184 & 0xFFFD45C) >> 14;
                int var186 = var185 - class222.field3266;
                int var187 = var184 & 0x3FFF;
                int var188 = var187 - class697.field9798;
                if (var186 < 0) {
                    var186 = 0;
                } else if (var186 >= class192.field2891) {
                    var186 = class192.field2891;
                }
                class743.field10323 = (var186 << 9) + 256;
                if (var188 < 0) {
                    var188 = 0;
                } else if (var188 >= class456.field6225) {
                    var188 = class456.field6225;
                }
                class401.field5533 = (var188 << 9) + 256;
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class307.field4385) {
            class282.method1800(2);
            class740.method4074(0);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class584.field8399) {
            class153.field2447 = class48.field674.method2529(arg0 ^ 0xF) << 3;
            class642.field9082 = class48.field674.method2529(arg0 + 62) << 3;
            class290.field4238 = class48.field674.method2555(125);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class350.field4962) {
            class198.field2985 = class48.field674.method2557(arg0 ^ 0x3A63);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class347.field4936) {
            int var189 = class48.field674.method2565((byte) -111);
            int var190 = class48.field674.method2561((byte) -94);
            int var191 = class48.field674.method2540(-16010);
            int var192 = class48.field674.method2568((byte) -80);
            class282.method1800(2);
            class180.method1314(var191, arg0 ^ 0xFFFFFF94, var192, var189, var190);
            class673.field9429 = null;
            return true;
        } else if (class782.field10718 == class673.field9429) {
            class143.field2332 = class549.field7634 > 2 ? class48.field674.method2532((byte) -128) : class563.field7824.method3281(class423.field5892, -1);
            class367.field5189 = class549.field7634 <= 0 ? -1 : class48.field674.method2565((byte) -86);
            class673.field9429 = null;
            if (class367.field5189 == 65535) {
                class367.field5189 = -1;
            }
            return true;
        } else if (class673.field9429 == class30.field335) {
            class48.field674.field5983 += 28;
            if (class48.field674.method2534((byte) 61)) {
                class358.method2165(class48.field674.field5983 - 28, class48.field674, (byte) 93);
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class561.field7764) {
            class42.method322(class405.field5571, 93);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class392.field5451) {
            class429.field5940 = class48.field674.method2547(arg0 - 33);
            class273.field3833 = class48.field674.method2557(arg0 + 14879) == 1;
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class668.field9389) {
            int var193 = class48.field674.method2580((byte) 115);
            int var194 = class48.field674.method2526(17);
            class282.method1800(arg0 - 48);
            class502.method2929(var193, var194, (byte) -121);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class631.field8940) {
            int var195 = class48.field674.method2568((byte) -80);
            int var196 = class48.field674.method2577(arg0 ^ 0x54);
            class282.method1800(2);
            class561.method3268(var196, var195, arg0 ^ 0xFFFFFFB7);
            class673.field9429 = null;
            return true;
        } else if (class95.field1353 == class673.field9429) {
            int var197 = class48.field674.method2577(78);
            int var198 = class48.field674.method2576(arg0 + 74);
            class578.field8328.method4307(var198, 24391, var197);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class494.field6770) {
            boolean var199 = class48.field674.method2557(14929) == 1;
            String var200 = class48.field674.method2532((byte) -125);
            String var201 = var200;
            if (var199) {
                var201 = class48.field674.method2532((byte) -127);
            }
            long var202 = class48.field674.method2567((byte) -127);
            long var204 = (long) class48.field674.method2565((byte) -106);
            long var206 = (long) class48.field674.method2515(24);
            int var208 = class48.field674.method2557(14929);
            int var209 = class48.field674.method2565((byte) -100);
            long var210 = (var204 << 32) + var206;
            boolean var212 = false;
            int var213 = 0;
            while (true) {
                if (var213 >= 100) {
                    if (var208 <= 1 && class439.method2611(arg0 + 8298, var201)) {
                        var212 = true;
                    }
                    break;
                }
                if (class74.field1143[var213] == var210) {
                    var212 = true;
                    break;
                }
                var213++;
            }
            if (!var212 && class624.field8861 == 0) {
                class74.field1143[class68.field1104] = var210;
                class68.field1104 = (class68.field1104 + 1) % 100;
                String var214 = class502.field6884.method2392(var209, 32767).method1042((byte) 112, class48.field674);
                if (var208 == 2) {
                    class647.method3660("<img=1>" + var200, 20, class472.method2759(var202, true), var214, var200, var209, "<img=1>" + var201, 0, 99);
                } else if (var208 == 1) {
                    class647.method3660("<img=0>" + var200, 20, class472.method2759(var202, true), var214, var200, var209, "<img=0>" + var201, 0, 99);
                } else {
                    class647.method3660(var200, 20, class472.method2759(var202, true), var214, var200, var209, var201, 0, 99);
                }
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class2.field42) {
            class153.field2447 = class48.field674.method2529(98) << 3;
            class290.field4238 = class48.field674.method2557(arg0 ^ 0x3A63);
            class642.field9082 = class48.field674.method2529(94) << 3;
            while (class549.field7634 > class48.field674.field5983) {
                class396 var215 = class632.method3606(4)[class48.field674.method2557(arg0 ^ 0x3A63)];
                class42.method322(var215, 70);
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class645.field9170) {
            int var216 = class48.field674.method2577(arg0 ^ 0x41);
            class282.method1800(2);
            class662.method3709(-1, var216, 4, -1, 3);
            class673.field9429 = null;
            return true;
        } else if (class713.field9949 == class673.field9429) {
            int var217 = class48.field674.method2521(-7);
            String var218 = class48.field674.method2532((byte) -117);
            class282.method1800(2);
            class380.method2292(var217, var218, (byte) -107);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class479.field6587) {
            class42.method322(class495.field6794, 113);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class36.field431) {
            int var219 = class48.field674.method2580((byte) 57);
            int var220 = class48.field674.method2580((byte) 71);
            int var221 = class48.field674.method2526(17);
            int var222 = class48.field674.method2568((byte) -80);
            class282.method1800(2);
            class662.method3709(var219, var221, arg0 ^ 0x36, var220 | var222 << 16, 7);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class164.field2516) {
            class129.field2192 = class745.field10359;
            if (class549.field7634 == 0) {
                class87.field1295 = null;
                class92.field1324 = 0;
                class673.field9429 = null;
                class288.field4217 = null;
                class193.field2893 = null;
                return true;
            }
            class87.field1295 = class48.field674.method2532((byte) -125);
            boolean var223 = class48.field674.method2557(14929) == 1;
            if (var223) {
                class48.field674.method2532((byte) -123);
            }
            long var224 = class48.field674.method2567((byte) -126);
            class193.field2893 = class549.method3176(false, var224);
            class668.field9392 = class48.field674.method2529(74);
            int var226 = class48.field674.method2557(14929);
            if (var226 == 255) {
                class673.field9429 = null;
                return true;
            }
            class92.field1324 = var226;
            class661[] var227 = new class661[100];
            for (int var228 = 0; var228 < class92.field1324; var228++) {
                var227[var228] = new class661();
                var227[var228].field9314 = class48.field674.method2532((byte) -125);
                boolean var234 = class48.field674.method2557(14929) == 1;
                if (var234) {
                    var227[var228].field9309 = class48.field674.method2532((byte) -113);
                } else {
                    var227[var228].field9309 = var227[var228].field9314;
                }
                var227[var228].field9312 = class147.method1160(-110, var227[var228].field9309);
                var227[var228].field9316 = class48.field674.method2565((byte) -120);
                var227[var228].field9308 = class48.field674.method2529(arg0 + 75);
                var227[var228].field9315 = class48.field674.method2532((byte) -117);
                if (var227[var228].field9309.equals(class719.field10041.field212)) {
                    class275.field3855 = var227[var228].field9308;
                }
            }
            boolean var229 = false;
            int var230 = class92.field1324;
            while (var230 > 0) {
                boolean var231 = true;
                var230--;
                for (int var232 = 0; var232 < var230; var232++) {
                    if (var227[var232].field9312.compareTo(var227[var232 + 1].field9312) > 0) {
                        class661 var233 = var227[var232];
                        var227[var232] = var227[var232 + 1];
                        var227[var232 + 1] = var233;
                        var231 = false;
                    }
                }
                if (var231) {
                    break;
                }
            }
            class288.field4217 = var227;
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class205.field3009) {
            int var235 = class48.field674.method2527((byte) -24);
            int var236 = class48.field674.method2526(17);
            int var237 = class48.field674.method2557(14929);
            String var238 = "";
            String var239 = var238;
            if ((var237 & 0x1) != 0) {
                var238 = class48.field674.method2532((byte) -122);
                if ((var237 & 0x2) == 0) {
                    var239 = var238;
                } else {
                    var239 = class48.field674.method2532((byte) -127);
                }
            }
            String var240 = class48.field674.method2532((byte) -121);
            if (var235 == 99) {
                class30.method251(false, var240);
            } else if (var239.equals("") || !class439.method2611(8348, var239)) {
                class437.method2608(var238, var240, var235, var238, (byte) 120, var239, var236);
            } else {
                class673.field9429 = null;
                return true;
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class459.field6270) {
            int var241 = class48.field674.method2565((byte) -106);
            if (var241 == 65535) {
                var241 = -1;
            }
            int var242 = class48.field674.method2557(arg0 ^ 0x3A63);
            int var243 = class48.field674.method2565((byte) -127);
            int var244 = class48.field674.method2557(14929);
            int var245 = class48.field674.method2565((byte) -97);
            class588.method3448(var241, var242, var244, var245, -1, var243);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class466.field6346) {
            int var246 = class48.field674.method2521(-9);
            int var247 = class48.field674.method2540(-16010);
            class282.method1800(2);
            class27 var248 = (class27) class37.field437.method4253((long) var247, -1);
            class27 var249 = (class27) class37.field437.method4253((long) var246, -1);
            if (var249 != null) {
                class251.method1663(false, false, var249, var248 == null || var248.field284 != var249.field284);
            }
            if (var248 != null) {
                var248.method4237(arg0 - 51);
                class37.field437.method4252(false, var248, (long) var246);
            }
            class519 var250 = class604.method3506(var247, 255);
            if (var250 != null) {
                class172.method1268(var250, -72);
            }
            class519 var251 = class604.method3506(var246, 255);
            if (var251 != null) {
                class172.method1268(var251, arg0 ^ 0xFFFFFFB0);
                class597.method3483(false, true, var251);
            }
            if (class379.field5314 != -1) {
                class411.method2416(class379.field5314, 1, (byte) -49);
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class482.field6617) {
            boolean var252 = class48.field674.method2557(14929) == 1;
            String var253 = class48.field674.method2532((byte) -117);
            String var254 = var253;
            if (var252) {
                var254 = class48.field674.method2532((byte) -117);
            }
            long var255 = (long) class48.field674.method2565((byte) -119);
            long var257 = (long) class48.field674.method2515(arg0 ^ 0x1C);
            int var259 = class48.field674.method2557(14929);
            int var260 = class48.field674.method2565((byte) -125);
            long var261 = (var255 << 32) + var257;
            boolean var263 = false;
            int var264 = 0;
            while (true) {
                if (var264 >= 100) {
                    if (var259 <= 1 && class439.method2611(8348, var254)) {
                        var263 = true;
                    }
                    break;
                }
                if (class74.field1143[var264] == var261) {
                    var263 = true;
                    break;
                }
                var264++;
            }
            if (!var263 && class624.field8861 == 0) {
                class74.field1143[class68.field1104] = var261;
                class68.field1104 = (class68.field1104 + 1) % 100;
                String var265 = class502.field6884.method2392(var260, 32767).method1042((byte) 112, class48.field674);
                if (var259 == 2) {
                    class647.method3660("<img=1>" + var253, 18, null, var265, var253, var260, "<img=1>" + var254, 0, arg0 ^ 0x51);
                } else if (var259 == 1) {
                    class647.method3660("<img=0>" + var253, 18, null, var265, var253, var260, "<img=0>" + var254, 0, 99);
                } else {
                    class647.method3660(var253, 18, null, var265, var253, var260, var254, 0, 99);
                }
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class527.field7365) {
            class68.field1100 = class745.field10359;
            boolean var266 = class48.field674.method2557(arg0 + 14879) == 1;
            class656 var267 = new class656(class48.field674);
            class465 var268;
            if (var266) {
                var268 = class274.field3846;
            } else {
                var268 = class138.field2285;
            }
            var267.method3683((byte) -53, var268);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class4.field51) {
            boolean var269 = class48.field674.method2557(14929) == 1;
            class282.method1800(2);
            class711.field9932 = var269;
            class673.field9429 = null;
            return true;
        } else if (class76.field1152 == class673.field9429) {
            class381.method2300(false);
            class673.field9429 = null;
            return false;
        } else if (class765.field10579 == class673.field9429) {
            String var270 = class48.field674.method2532((byte) -119);
            String var271 = class326.method1978(class364.method2188(class48.field674, (byte) -68), false);
            class437.method2608(var270, var271, 6, var270, (byte) 120, var270, 0);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class433.field6041) {
            class421.field5859 = class48.field674.method2555(124) == 1;
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class643.field9152) {
            int var272 = class48.field674.method2565((byte) -122);
            class21 var273;
            if (class541.field7492 == var272) {
                var273 = class719.field10041;
            } else {
                var273 = class588.field8451[var272];
            }
            if (var273 == null) {
                class673.field9429 = null;
                return true;
            }
            int var274 = class48.field674.method2565((byte) -84);
            int var275 = class48.field674.method2557(arg0 ^ 0x3A63);
            boolean var276 = (var274 & 0x8000) != 0;
            if (var273.field212 != null && var273.field207 != null) {
                boolean var277 = false;
                if (var275 <= 1) {
                    if (!var276 && (class273.field3833 && !class115.field1975 || class419.field5810)) {
                        var277 = true;
                    } else if (class439.method2611(8348, var273.field212)) {
                        var277 = true;
                    }
                }
                if (!var277 && class624.field8861 == 0) {
                    int var278 = -1;
                    String var279;
                    if (var276) {
                        var274 &= 0x7FFF;
                        class473 var280 = class84.method747((byte) 74, class48.field674);
                        var278 = var280.field6436;
                        var279 = var280.field6431.method1042((byte) 112, class48.field674);
                    } else {
                        var279 = class326.method1978(class364.method2188(class48.field674, (byte) -102), false);
                    }
                    var273.field4069 = var279.trim();
                    var273.field4118 = var274 >> 8;
                    var273.field4102 = 150;
                    var273.field4091 = var274 & 0xFF;
                    int var281;
                    if (var275 == 1 || var275 == 2) {
                        var281 = var276 ? 17 : 1;
                    } else {
                        var281 = var276 ? 17 : 2;
                    }
                    if (var275 == 2) {
                        class647.method3660("<img=1>" + var273.method190(true, -116), var281, null, var279, var273.field224, var278, "<img=1>" + var273.method208(16383, false), 0, arg0 + 49);
                    } else if (var275 == 1) {
                        class647.method3660("<img=0>" + var273.method190(true, arg0 - 166), var281, null, var279, var273.field224, var278, "<img=0>" + var273.method208(16383, false), 0, 99);
                    } else {
                        class647.method3660(var273.method190(true, -116), var281, null, var279, var273.field224, var278, var273.method208(arg0 ^ 0x3FCD, false), 0, 99);
                    }
                }
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class458.field6264) {
            int var282 = class48.field674.method2577(73);
            int var283 = class48.field674.method2565((byte) -117);
            class282.method1800(arg0 - 48);
            class393.method2353((byte) -125, var283, var282);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class653.field9245) {
            if (class379.field5314 != -1) {
                class411.method2416(class379.field5314, 0, (byte) -49);
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class560.field7759) {
            int var284 = class48.field674.method2576(124);
            int var285 = class48.field674.method2555(arg0 ^ 0x4D);
            class282.method1800(arg0 - 48);
            if (var285 == 2) {
                class108.method869(true);
            }
            class379.field5314 = var284;
            class654.method3678(-11954, var284);
            class106.method857(false, arg0 - 50);
            class46.method354(class379.field5314);
            for (int var286 = 0; var286 < 100; var286++) {
                class438.field6082[var286] = true;
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class521.field7304) {
            String var287 = class48.field674.method2532((byte) -117);
            Object[] var288 = new Object[var287.length() + 1];
            for (int var289 = var287.length() - 1; var289 >= 0; var289--) {
                if (var287.charAt(var289) == 's') {
                    var288[var289 + 1] = class48.field674.method2532((byte) -115);
                } else {
                    var288[var289 + 1] = Integer.valueOf(class48.field674.method2526(17));
                }
            }
            var288[0] = Integer.valueOf(class48.field674.method2526(class172.method1269(arg0, 35)));
            class282.method1800(2);
            class511 var290 = new class511();
            var290.field7021 = var288;
            class46.method357(var290);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class163.field2504) {
            class551.field7649 = class372.method2217(0, class48.field674.method2557(arg0 + 14879));
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class216.field3149) {
            int var291 = class48.field674.method2560(true);
            int var292 = class48.field674.method2561((byte) -94);
            int var293 = class48.field674.method2540(arg0 - 16060);
            class150.field2406[var292] = var293;
            class500.field6870[var292] = var291;
            class133.field2223[var292] = 1;
            int var294 = class178.field2666[var292] - 1;
            for (int var295 = 0; var295 < var294; var295++) {
                if (class343.field4882[var295] <= var293) {
                    class133.field2223[var292] = var295 + 2;
                }
            }
            class341.field4861[class194.method1380(31, class453.field6201++)] = var292;
            class673.field9429 = null;
            return true;
        } else if (class710.field9931 == class673.field9429) {
            int var296 = class48.field674.method2557(14929);
            class282.method1800(2);
            class673.field9429 = null;
            class752.field10461 = var296;
            return true;
        } else if (class673.field9429 == class413.field5673) {
            String var297 = class48.field674.method2532((byte) -121);
            boolean var298 = class48.field674.method2557(14929) == 1;
            String var299;
            if (var298) {
                var299 = class48.field674.method2532((byte) -124);
            } else {
                var299 = var297;
            }
            int var300 = class48.field674.method2565((byte) -89);
            byte var301 = class48.field674.method2529(112);
            boolean var302 = false;
            if (var301 == -128) {
                var302 = true;
            }
            if (var302) {
                if (class92.field1324 == 0) {
                    class673.field9429 = null;
                    return true;
                }
                boolean var303 = false;
                int var304;
                for (var304 = 0; class92.field1324 > var304 && (!class288.field4217[var304].field9309.equals(var299) || class288.field4217[var304].field9316 != var300); var304++) {
                }
                if (var304 < class92.field1324) {
                    while (class92.field1324 - 1 > var304) {
                        class288.field4217[var304] = class288.field4217[var304 + 1];
                        var304++;
                    }
                    class92.field1324--;
                    class288.field4217[class92.field1324] = null;
                }
            } else {
                String var305 = class48.field674.method2532((byte) -120);
                class661 var306 = new class661();
                var306.field9314 = var297;
                var306.field9309 = var299;
                var306.field9312 = class147.method1160(arg0 ^ 0x32, var306.field9309);
                var306.field9308 = var301;
                var306.field9315 = var305;
                var306.field9316 = var300;
                int var307;
                for (var307 = class92.field1324 - 1; var307 >= 0; var307--) {
                    int var308 = class288.field4217[var307].field9312.compareTo(var306.field9312);
                    if (var308 == 0) {
                        class288.field4217[var307].field9316 = var300;
                        class288.field4217[var307].field9308 = var301;
                        class288.field4217[var307].field9315 = var305;
                        if (var299.equals(class719.field10041.field212)) {
                            class275.field3855 = var301;
                        }
                        class129.field2192 = class745.field10359;
                        class673.field9429 = null;
                        return true;
                    }
                    if (var308 < 0) {
                        break;
                    }
                }
                if (class288.field4217.length <= class92.field1324) {
                    class673.field9429 = null;
                    return true;
                }
                for (int var309 = class92.field1324 - 1; var309 > var307; var309--) {
                    class288.field4217[var309 + 1] = class288.field4217[var309];
                }
                if (class92.field1324 == 0) {
                    class288.field4217 = new class661[100];
                }
                class288.field4217[var307 + 1] = var306;
                class92.field1324++;
                if (var299.equals(class719.field10041.field212)) {
                    class275.field3855 = var301;
                }
            }
            class673.field9429 = null;
            class129.field2192 = class745.field10359;
            return true;
        } else if (class673.field9429 == class276.field3963) {
            class42.method322(class191.field2873, arg0 ^ 0x75);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class122.field2071) {
            int var310 = class48.field674.method2577(95);
            int var311 = class48.field674.method2540(arg0 - 16060);
            int var312 = class48.field674.method2580((byte) 100);
            class282.method1800(2);
            class662.method3709(var310, var311, 4, var312, 5);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class262.field3707) {
            int var313 = class48.field674.method2565((byte) -92);
            if (var313 == 65535) {
                var313 = -1;
            }
            int var314 = class48.field674.method2557(14929);
            int var315 = class48.field674.method2565((byte) -128);
            int var316 = class48.field674.method2557(arg0 + 14879);
            int var317 = class48.field674.method2565((byte) -120);
            class75.method691(var314, var316, var313, var315, var317, false, 0);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class351.field4976) {
            class42.method322(class770.field10630, arg0 ^ 0x8);
            class673.field9429 = null;
            return true;
        } else if (class785.field10757 == class673.field9429) {
            class153.field2447 = class48.field674.method2544(arg0 ^ 0x32) << 3;
            class642.field9082 = class48.field674.method2581(67) << 3;
            class290.field4238 = class48.field674.method2557(14929);
            for (class482 var318 = (class482) class400.field5509.method4254((byte) 8); var318 != null; var318 = (class482) class400.field5509.method4251(-119)) {
                int var321 = (int) (var318.field10592 >> 28 & 0x3L);
                int var322 = (int) (var318.field10592 & 0x3FFFL);
                int var323 = var322 - class222.field3266;
                int var324 = (int) (var318.field10592 >> 14 & 0x3FFFL);
                int var325 = var324 - class697.field9798;
                if (class290.field4238 == var321 && class153.field2447 <= var323 && (class153.field2447 + 8) > var323 && var325 >= class642.field9082 && class642.field9082 + 8 > var325) {
                    var318.method4237(-1);
                    if (var323 >= 0 && var325 >= 0 && class192.field2891 > var323 && var325 < class456.field6225) {
                        class352.method2135(var325, class290.field4238, var323, arg0 ^ 0x12CEFD1B);
                    }
                }
            }
            for (class160 var319 = (class160) class218.field3198.method3731((byte) -75); var319 != null; var319 = (class160) class218.field3198.method3729((byte) 92)) {
                if (class153.field2447 <= var319.field2479 && (class153.field2447 + 8) > var319.field2479 && var319.field2488 >= class642.field9082 && var319.field2488 < (class642.field9082 + 8) && class290.field4238 == var319.field2489) {
                    var319.field2485 = true;
                }
            }
            for (class160 var320 = (class160) class117.field1994.method3731((byte) -109); var320 != null; var320 = (class160) class117.field1994.method3729((byte) 49)) {
                if (class153.field2447 <= var320.field2479 && (class153.field2447 + 8) > var320.field2479 && class642.field9082 <= var320.field2488 && var320.field2488 < (class642.field9082 + 8) && class290.field4238 == var320.field2489) {
                    var320.field2485 = true;
                }
            }
            class673.field9429 = null;
            return true;
        } else if (class752.field10462 == class673.field9429) {
            int var326 = class48.field674.method2580((byte) 61);
            class282.method1800(arg0 - 48);
            class503.method2941((byte) -102, var326);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class235.field3406) {
            class266.field3762 = class745.field10359;
            boolean var327 = class48.field674.method2557(arg0 ^ 0x3A63) == 1;
            if (class549.field7634 != 1) {
                if (var327) {
                    class723.field10086 = new class50(class48.field674);
                } else {
                    class587.field8438 = new class50(class48.field674);
                }
                class673.field9429 = null;
                return true;
            }
            class673.field9429 = null;
            if (var327) {
                class723.field10086 = null;
            } else {
                class587.field8438 = null;
            }
            return true;
        } else if (class673.field9429 == class253.field3631) {
            class556.method3207(-4);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class409.field5611) {
            class266.field3762 = class745.field10359;
            boolean var328 = class48.field674.method2557(arg0 ^ 0x3A63) == 1;
            class295 var329 = new class295(class48.field674);
            class50 var330;
            if (var328) {
                var330 = class723.field10086;
            } else {
                var330 = class587.field8438;
            }
            var329.method1864(var330, -11);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class198.field2986) {
            int var331 = class48.field674.method2557(14929);
            int var332 = class48.field674.method2580((byte) 106) << 2;
            int var333 = class48.field674.method2557(14929);
            int var334 = class48.field674.method2561((byte) -94);
            int var335 = class48.field674.method2557(arg0 + 14879);
            class282.method1800(arg0 - 48);
            class209.method1448(var331, var335, true, var332, (byte) -68, var334, var333);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class188.field2838) {
            boolean var336 = class48.field674.method2557(14929) == 1;
            String var337 = class48.field674.method2532((byte) -125);
            String var338 = var337;
            if (var336) {
                var338 = class48.field674.method2532((byte) -116);
            }
            long var339 = class48.field674.method2567((byte) -127);
            long var341 = (long) class48.field674.method2565((byte) -119);
            long var343 = (long) class48.field674.method2515(104);
            int var345 = class48.field674.method2557(14929);
            long var346 = (var341 << 32) + var343;
            boolean var348 = false;
            int var349 = 0;
            while (true) {
                if (var349 >= 100) {
                    if (var345 <= 1) {
                        if (!(!class273.field3833 || class115.field1975) || class419.field5810) {
                            var348 = true;
                        } else if (class439.method2611(8348, var338)) {
                            var348 = true;
                        }
                    }
                    break;
                }
                if (class74.field1143[var349] == var346) {
                    var348 = true;
                    break;
                }
                var349++;
            }
            if (!var348 && class624.field8861 == 0) {
                class74.field1143[class68.field1104] = var346;
                class68.field1104 = (class68.field1104 + 1) % 100;
                String var350 = class326.method1978(class364.method2188(class48.field674, (byte) -79), false);
                if (var345 == 2 || var345 == 3) {
                    class647.method3660("<img=1>" + var337, 9, class472.method2759(var339, true), var350, var337, -1, "<img=1>" + var338, 0, arg0 + 49);
                } else if (var345 == 1) {
                    class647.method3660("<img=0>" + var337, 9, class472.method2759(var339, true), var350, var337, -1, "<img=0>" + var338, 0, arg0 + 49);
                } else {
                    class647.method3660(var337, 9, class472.method2759(var339, true), var350, var337, -1, var338, 0, arg0 ^ 0x51);
                }
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class651.field9220) {
            int var351 = class48.field674.method2526(17);
            class18.field191 = class336.field4775.method921((byte) 126, var351);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class458.field6266) {
            class42.method322(class349.field4959, 92);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class141.field2308) {
            class42.method322(class510.field7007, 119);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class47.field634) {
            class157.method1213((byte) -71);
            class673.field9429 = null;
            return false;
        } else if (class673.field9429 == class143.field2331) {
            int var352 = class48.field674.method2557(14929);
            int var353 = class48.field674.method2557(arg0 + 14879);
            int var354 = class48.field674.method2557(arg0 ^ 0x3A63);
            int var355 = class48.field674.method2568((byte) -80);
            int var356 = class48.field674.method2555(125);
            class282.method1800(arg0 ^ 0x30);
            class81.field1203[var356] = true;
            class359.field5084[var356] = var354;
            class367.field5188[var356] = var352;
            class732.field10183[var356] = var353;
            class51.field732[var356] = var355;
            class673.field9429 = null;
            return true;
        } else if (class81.field1199 == class673.field9429) {
            int var357 = class48.field674.method2557(14929);
            if (class48.field674.method2557(14929) == 0) {
                class256.field3661[var357] = new class716();
            } else {
                class48.field674.field5983--;
                class256.field3661[var357] = new class716(class48.field674);
            }
            class673.field9429 = null;
            class603.field8567 = class745.field10359;
            return true;
        } else if (class745.field10353 == class673.field9429) {
            int var358 = class48.field674.method2565((byte) -96);
            int var359 = class48.field674.method2540(-16010);
            int var360 = class48.field674.method2557(arg0 + 14879);
            int var361 = class48.field674.method2557(14929);
            int var362 = class48.field674.method2565((byte) -86);
            int var363 = class48.field674.method2576(114);
            int var364 = var361 & 0x7;
            int var365 = var361 >> 3 & 0xF;
            if (var365 == 15) {
                var365 = -1;
            }
            if ((var359 >> 30) != 0) {
                int var395 = var359 >> 28 & 0x3;
                int var396 = (var359 >> 14 & 0x3FFF) - class222.field3266;
                int var397 = (var359 & 0x3FFF) - class697.field9798;
                if (var396 >= 0 && var397 >= 0 && class192.field2891 > var396 && var397 < class456.field6225) {
                    int var398 = var396 * 512 + 256;
                    int var399 = var397 * 512 + 256;
                    int var400 = var395;
                    if (var395 < 3 && class717.method3994(32281, var396, var397)) {
                        var400 = var395 + 1;
                    }
                    class326 var401 = new class326(var363, var358, class594.field8494, var395, var400, var398, class577.method3399(var399, var398, -8724, var395) - var362, var399, var396, var396, var397, var397, var364);
                    class752.field10463.method3728((byte) 105, new class478(var401));
                }
            } else if ((var359 >> 29) != 0) {
                int var366 = var359 & 0xFFFF;
                class647 var367 = (class647) class486.field6697.method4253((long) var366, -1);
                if (var367 != null) {
                    class506 var368 = var367.field9191;
                    class614 var369 = var368.field4043[var360];
                    if (var363 == 65535) {
                        var363 = -1;
                    }
                    boolean var370 = true;
                    int var371 = var369.field8710;
                    if (var363 != -1 && var371 != -1) {
                        if (var363 == var371) {
                            class113 var376 = class620.field8760.method1832(43, var363);
                            if (var376.field1650 && var376.field1628 != -1) {
                                class98 var377 = class168.field2552.method3287(arg0 ^ 0x67, var376.field1628);
                                int var378 = var377.field1392;
                                if (var378 == 0 || var378 == 2) {
                                    var370 = false;
                                } else if (var378 == 1) {
                                    var370 = true;
                                }
                            }
                        } else {
                            class113 var372 = class620.field8760.method1832(65, var363);
                            class113 var373 = class620.field8760.method1832(arg0 - 155, var371);
                            if (var372.field1628 != -1 && var373.field1628 != -1) {
                                class98 var374 = class168.field2552.method3287(arg0 + 71, var372.field1628);
                                class98 var375 = class168.field2552.method3287(73, var373.field1628);
                                if (var374.field1407 < var375.field1407) {
                                    var370 = false;
                                }
                            }
                        }
                    }
                    if (var370) {
                        var369.field8710 = var363;
                        var369.field8714 = 1;
                        var369.field8706 = class594.field8494 + var358;
                        var369.field8716 = var365;
                        var369.field8707 = 0;
                        var369.field8708 = var362;
                        var369.field8709 = 0;
                        var369.field8715 = var364;
                        if (var369.field8706 > class594.field8494) {
                            var369.field8707 = -1;
                        }
                        if (var369.field8710 == 65535) {
                            var369.field8710 = -1;
                        }
                        if (var369.field8710 != -1 && class594.field8494 == var369.field8706) {
                            int var379 = class620.field8760.method1832(-113, var369.field8710).field1628;
                            if (var379 != -1) {
                                class98 var380 = class168.field2552.method3287(93, var379);
                                if (var380 != null && var380.field1402 != null && !var368.field4120) {
                                    class324.method1958(var380, (byte) 42, var368, 0);
                                }
                            }
                        }
                    }
                }
            } else if (var359 >> 28 != 0) {
                int var381 = var359 & 0xFFFF;
                class21 var382;
                if (class541.field7492 == var381) {
                    var382 = class719.field10041;
                } else {
                    var382 = class588.field8451[var381];
                }
                if (var382 != null) {
                    if (var363 == 65535) {
                        var363 = -1;
                    }
                    class614 var383 = var382.field4043[var360];
                    boolean var384 = true;
                    int var385 = var383.field8710;
                    if (var363 != -1 && var385 != -1) {
                        if (var363 == var385) {
                            class113 var390 = class620.field8760.method1832(97, var363);
                            if (var390.field1650 && var390.field1628 != -1) {
                                class98 var391 = class168.field2552.method3287(114, var390.field1628);
                                int var392 = var391.field1392;
                                if (var392 == 0 || var392 == 2) {
                                    var384 = false;
                                } else if (var392 == 1) {
                                    var384 = true;
                                }
                            }
                        } else {
                            class113 var386 = class620.field8760.method1832(arg0 - 174, var363);
                            class113 var387 = class620.field8760.method1832(arg0 ^ 0x3C, var385);
                            if (var386.field1628 != -1 && var387.field1628 != -1) {
                                class98 var388 = class168.field2552.method3287(80, var386.field1628);
                                class98 var389 = class168.field2552.method3287(87, var387.field1628);
                                if (var388.field1407 < var389.field1407) {
                                    var384 = false;
                                }
                            }
                        }
                    }
                    if (var384) {
                        var383.field8714 = 1;
                        var383.field8706 = class594.field8494 + var358;
                        var383.field8715 = var364;
                        var383.field8707 = 0;
                        var383.field8709 = 0;
                        var383.field8716 = var365;
                        var383.field8710 = var363;
                        var383.field8708 = var362;
                        if (var383.field8710 == 65535) {
                            var383.field8710 = -1;
                        }
                        if (var383.field8706 > class594.field8494) {
                            var383.field8707 = -1;
                        }
                        if (var383.field8710 != -1 && class594.field8494 == var383.field8706) {
                            int var393 = class620.field8760.method1832(66, var383.field8710).field1628;
                            if (var393 != -1) {
                                class98 var394 = class168.field2552.method3287(78, var393);
                                if (var394 != null && var394.field1402 != null && !var382.field4120) {
                                    class324.method1958(var394, (byte) 42, var382, 0);
                                }
                            }
                        }
                    }
                }
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class595.field8499) {
            int var402 = class48.field674.method2521(-125);
            class282.method1800(2);
            class662.method3709(0, var402, 4, class541.field7492, 5);
            class673.field9429 = null;
            return true;
        } else if (class721.field10070 == class673.field9429) {
            class209.method1449(class48.field674.method2532((byte) -112), (byte) -113);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class264.field3727) {
            class42.method322(class253.field3619, 82);
            class673.field9429 = null;
            return true;
        } else if (class675.field9444 == class673.field9429) {
            int var403 = class48.field674.method2580((byte) 123);
            int var404 = class48.field674.method2521(arg0 + 23);
            int var405 = class48.field674.method2576(115);
            int var406 = class48.field674.method2555(124);
            class282.method1800(arg0 - 48);
            class87.method772(var404, var405, var406, var403, (byte) 107);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class507.field6976) {
            int var407 = class48.field674.method2526(arg0 - 33);
            int var408 = class48.field674.method2565((byte) -124);
            class282.method1800(2);
            class431.method2558(var408, 17, var407);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class582.field8377) {
            class306.method1890(-80);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class136.field2260) {
            int var409 = class48.field674.method2576(120);
            class282.method1800(2);
            class523.method3073((byte) 95, var409);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class494.field6781) {
            byte var410 = class48.field674.method2529(113);
            int var411 = class48.field674.method2576(120);
            class578.field8328.method4314(var411, (byte) 33, var410);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class473.field6428) {
            int var412 = class48.field674.method2557(14929);
            int var413 = class48.field674.method2580((byte) 48);
            class282.method1800(2);
            class493.method2879(true, var412, 0, var413);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class482.field6619) {
            class42.method322(class38.field446, arg0 ^ 0x53);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class621.field8771) {
            int var414 = class48.field674.method2540(-16010);
            int var415 = class48.field674.method2560(true);
            class282.method1800(2);
            class777.method4275(var415, var414, 21896);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class250.field3587) {
            class477.method2832(false, (byte) 126);
            class673.field9429 = null;
            return false;
        } else if (class673.field9429 == class542.field7496) {
            int var416 = class48.field674.method2555(127);
            int var417 = class48.field674.method2555(126);
            int var418 = class48.field674.method2565((byte) -106);
            if (var418 == 65535) {
                var418 = -1;
            }
            class528.method3086(var416, var418, var417, 49);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class501.field6876) {
            int var419 = class48.field674.method2515(120);
            int var420 = class48.field674.method2555(126);
            int var421 = class48.field674.method2568((byte) -80);
            if (var421 == 65535) {
                var421 = -1;
            }
            class133.method1106(var420, var421, var419, -13);
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class168.field2553) {
            boolean var422 = class48.field674.method2557(arg0 + 14879) == 1;
            String var423 = class48.field674.method2532((byte) -111);
            String var424 = var423;
            if (var422) {
                var424 = class48.field674.method2532((byte) -121);
            }
            long var425 = (long) class48.field674.method2565((byte) -99);
            long var427 = (long) class48.field674.method2515(arg0 ^ 0x12);
            int var429 = class48.field674.method2557(14929);
            long var430 = (var425 << 32) + var427;
            boolean var432 = false;
            int var433 = 0;
            while (true) {
                if (var433 >= 100) {
                    if (var429 <= 1) {
                        if (!(!class273.field3833 || class115.field1975) || class419.field5810) {
                            var432 = true;
                        } else if (class439.method2611(8348, var424)) {
                            var432 = true;
                        }
                    }
                    break;
                }
                if (class74.field1143[var433] == var430) {
                    var432 = true;
                    break;
                }
                var433++;
            }
            if (!var432 && class624.field8861 == 0) {
                class74.field1143[class68.field1104] = var430;
                class68.field1104 = (class68.field1104 + 1) % 100;
                String var434 = class326.method1978(class364.method2188(class48.field674, (byte) -119), false);
                if (var429 == 2) {
                    class647.method3660("<img=1>" + var423, 7, null, var434, var423, -1, "<img=1>" + var424, 0, 99);
                } else if (var429 == 1) {
                    class647.method3660("<img=0>" + var423, 7, null, var434, var423, -1, "<img=0>" + var424, 0, 99);
                } else {
                    class647.method3660(var423, 3, null, var434, var423, -1, var424, 0, arg0 + 49);
                }
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class286.field4203) {
            class458.field6267 = class48.field674.method2557(14929);
            for (int var435 = 0; var435 < class458.field6267; var435++) {
                class263.field3721[var435] = class48.field674.method2532((byte) -115);
                class460.field6286[var435] = class48.field674.method2532((byte) -123);
                if (class460.field6286[var435].equals("")) {
                    class460.field6286[var435] = class263.field3721[var435];
                }
                class581.field8364[var435] = class48.field674.method2532((byte) -123);
                class482.field6621[var435] = class48.field674.method2532((byte) -121);
                if (class482.field6621[var435].equals("")) {
                    class482.field6621[var435] = class581.field8364[var435];
                }
                class217.field3164[var435] = false;
            }
            class673.field9429 = null;
            class732.field10182 = class745.field10359;
            return true;
        } else if (class673.field9429 == class48.field673) {
            int var436 = class48.field674.method2561((byte) -94);
            byte var437 = class48.field674.method2544(0);
            class282.method1800(arg0 - 48);
            class91.method783(70, var437, var436);
            class673.field9429 = null;
            return true;
        } else if (class713.field9954 == class673.field9429) {
            int var438 = class48.field674.method2565((byte) -87);
            byte var439 = class48.field674.method2581(99);
            class282.method1800(arg0 - 48);
            class561.method3268(var439, var438, arg0 - 164);
            class673.field9429 = null;
            return true;
        } else if (class706.field9894 == class673.field9429) {
            int var440 = class48.field674.method2521(arg0 ^ 0xFFFFFFB2);
            int var441 = var440 >> 28 & 0x3;
            int var442 = var440 >> 14 & 0x3FFF;
            int var443 = var440 & 0x3FFF;
            int var444 = class48.field674.method2565((byte) -82);
            if (var444 == 65535) {
                var444 = -1;
            }
            int var445 = class48.field674.method2557(arg0 + 14879);
            int var446 = var445 >> 2;
            int var447 = var445 & 0x3;
            int var448 = class249.field3578[var446];
            int var449 = var443 - class697.field9798;
            int var450 = var442 - class222.field3266;
            class188.method1358(var447, var444, (byte) -74, var441, var446, var450, var448, var449);
            class673.field9429 = null;
            return true;
        } else if (arg0 != 50) {
            return true;
        } else if (class673.field9429 == class137.field2274) {
            int var451 = class48.field674.method2577(arg0 + 32);
            class282.method1800(2);
            class27 var452 = (class27) class37.field437.method4253((long) var451, -1);
            if (var452 != null) {
                class251.method1663(false, false, var452, true);
            }
            if (class284.field4182 != null) {
                class172.method1268(class284.field4182, -86);
                class284.field4182 = null;
            }
            class673.field9429 = null;
            return true;
        } else if (class673.field9429 == class218.field3182) {
            boolean var453 = class48.field674.method2557(arg0 + 14879) == 1;
            byte[] var454 = new byte[class549.field7634 - 1];
            class48.field674.method2530(-77, var454, 0, class549.field7634 - 1);
            class10.method150(var453, var454, -127);
            class673.field9429 = null;
            return true;
        } else {
            class349.method2122(null, "T1 - " + (class673.field9429 == null ? -1 : class673.field9429.method2291((byte) -128)) + "," + (class654.field9250 == null ? -1 : class654.field9250.method2291((byte) -100)) + "," + (class651.field9225 == null ? -1 : class651.field9225.method2291((byte) -119)) + " - " + class549.field7634, 1);
            class477.method2832(false, (byte) 115);
            return true;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I[Ljava/lang/String;[S)V")
    public static final void method3623(int arg0, String[] arg1, short[] arg2) {
        class577.method3398(false, arg1.length + arg0, arg1, 0, arg2);
        field8985++;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V")
    public static void method3624(int arg0) {
        if (arg0 != 17871) {
            method3626(88);
        }
        field8992 = null;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(ZII)V")
    public static final void method3625(boolean arg0, int arg1, int arg2) {
        int var3 = -53 % ((arg2 - 56) / 54);
        field8993++;
        class760.method4198(class563.field7810.method3281(class423.field5892, -1), 120, arg0, arg1);
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V")
    public static final void method3626(int arg0) {
        field8986++;
        int var1 = -95 / ((-arg0 - 84) / 41);
        if (!class215.field3142) {
            class215.field3142 = true;
            class133.field2232 += (-24.0F - class133.field2232) / 2.0F;
            class438.field6083 = true;
        }
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(II)V")
    public class636(int arg0, int arg1) {
        this.field8991 = arg1;
        this.field8989 = arg0;
    }
}
