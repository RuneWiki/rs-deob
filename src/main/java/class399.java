import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class399 {

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "[I")
    public static int[] field5553 = new int[1000];

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "F")
    public static float field5556;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "Ldh;")
    public static class209 field5554;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2311(boolean arg0) {
        field5553 = null;
        field5554 = null;
        if (arg0) {
            field5553 = null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)Z", line = 16)
    public static final boolean method2312(byte arg0) throws IOException {
        field5555++;
        if (class117.field1578 == null) {
            return false;
        }
        int var1 = class117.field1578.method645((byte) -123);
        if (var1 == 0) {
            return false;
        }
        if (class467.field6834 == null) {
            if (class273.field3717) {
                class117.field1578.method649(1, false, 0, class387.field5435.field5073);
                var1--;
                class124.field1702++;
                class273.field3717 = false;
            }
            class387.field5435.field5069 = 0;
            if (class387.field5435.method2605(255)) {
                if (var1 == 0) {
                    return false;
                }
                var1--;
                class117.field1578.method649(1, false, 1, class387.field5435.field5073);
                class124.field1702++;
            }
            class273.field3717 = true;
            class310[] var2 = class349.method1935(true);
            int var3 = class387.field5435.method2606((byte) -123);
            if (var3 < 0 || var3 >= var2.length) {
                throw new IOException("invo:" + var3 + " ip:" + class387.field5435.field5069);
            }
            class467.field6834 = var2[var3];
            class438.field6394 = class467.field6834.field4244;
        }
        if (class438.field6394 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class117.field1578.method649(1, false, 0, class387.field5435.field5073);
            class124.field1702++;
            class438.field6394 = class387.field5435.field5073[0] & 0xFF;
            var1--;
        }
        if (class438.field6394 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class117.field1578.method649(2, false, 0, class387.field5435.field5073);
            class387.field5435.field5069 = 0;
            var1 -= 2;
            class438.field6394 = class387.field5435.method2062((byte) 14);
            class124.field1702 += 2;
        }
        if (var1 < class438.field6394) {
            return false;
        }
        class387.field5435.field5069 = 0;
        class117.field1578.method649(class438.field6394, false, 0, class387.field5435.field5073);
        class193.field2752 = 0;
        class374.field5274 = class207.field2937;
        class124.field1702 += class438.field6394;
        class207.field2937 = class497.field7324;
        class497.field7324 = class467.field6834;
        if (class467.field6834 == class415.field6082) {
            int var4 = class387.field5435.method2057(65280);
            int var5 = class387.field5435.method2102(-4);
            int var6 = class387.field5435.method2093(false);
            int var7 = class387.field5435.method2056((byte) 89);
            if (class190.method1140(65535, var6)) {
                class243.method1435(-27914, var4, var5, 5, var7);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class446.field6460) {
            class158.field2250 = class387.field5435.method2062((byte) 14) * 30;
            class467.field6834 = null;
            class317.field4398 = class234.field3240;
            return true;
        } else if (class471.field6886 == class467.field6834) {
            int var8 = class387.field5435.method2062((byte) 14);
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = class387.field5435.method2095(8999);
            int var10 = var9 >> 28 & 0x3;
            int var11 = (var9 & 0xFFFFA31) >> 14;
            int var12 = var9 & 0x3FFF;
            int var13 = class387.field5435.method2055(true);
            int var14 = var13 >> 2;
            int var15 = var13 & 0x3;
            int var16 = var12 - class79.field1134;
            int var17 = var11 - class215.field3059;
            int var18 = class180.field2540[var14];
            class472.method2782(var10, var16, 2, var8, var15, var17, var14, var18);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class461.field6704) {
            class379.field5329 = class387.field5435.method2099(255);
            class467.field6834 = null;
            class317.field4398 = class234.field3240;
            return true;
        } else if (class467.field6834 == class245.field3409) {
            int var19 = class387.field5435.method2062((byte) 14);
            int var20 = class387.field5435.method2062((byte) 14);
            int var21 = class387.field5435.method2056((byte) -69);
            if (class190.method1140(65535, var20)) {
                class398.method2300(var19, -30233, var21);
            }
            class467.field6834 = null;
            return true;
        } else if (class488.field7132 == class467.field6834) {
            class451.field6506 = class135.method885(4, class387.field5435.method2099(255));
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class321.field4440) {
            boolean var22 = class387.field5435.method2099(255) == 1;
            String var23 = class387.field5435.method2106(-1);
            String var24 = var23;
            if (var22) {
                var24 = class387.field5435.method2106(-1);
            }
            long var25 = (long) class387.field5435.method2062((byte) 14);
            long var27 = (long) class387.field5435.method2111(-2);
            int var29 = class387.field5435.method2099(255);
            long var30 = (var25 << 32) + var27;
            boolean var32 = false;
            int var33 = 0;
            while (true) {
                if (var33 >= 100) {
                    if (var29 <= 1) {
                        if (!(!class319.field4412 || class374.field5223) || class99.field1366) {
                            var32 = true;
                        } else if (class487.method2864(var24, 0)) {
                            var32 = true;
                        }
                    }
                    break;
                }
                if (class43.field597[var33] == var30) {
                    var32 = true;
                    break;
                }
                var33++;
            }
            if (!var32 && class117.field1581 == 0) {
                class43.field597[class213.field3038] = var30;
                class213.field3038 = (class213.field3038 + 1) % 100;
                String var34 = class134.method882(false, class195.method1185(class387.field5435, 0));
                if (var29 == 2) {
                    class29.method200(0, "<img=1>" + var24, (byte) 87, "<img=1>" + var23, null, -1, var34, 7);
                } else if (var29 == 1) {
                    class29.method200(0, "<img=0>" + var24, (byte) 89, "<img=0>" + var23, null, -1, var34, 7);
                } else {
                    class29.method200(0, var24, (byte) 96, var23, null, -1, var34, 3);
                }
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class121.field1669) {
            class17.field180 = class387.field5435.method2090((byte) 70) << 3;
            class424.field6191 = class387.field5435.method2090((byte) 100) << 3;
            class105.field1435 = class387.field5435.method2055(true);
            while (class387.field5435.field5069 < class438.field6394) {
                class284 var35 = class240.method1389((byte) -114)[class387.field5435.method2099(255)];
                class337.method1870(true, var35);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class196.field2828) {
            class337.method1870(true, class215.field3058);
            class467.field6834 = null;
            return true;
        } else if (class97.field1338 == class467.field6834) {
            if (class38.field513 != null) {
                class161.method997(-1, false, -1, class437.field6374.field4263, false);
            }
            byte[] var36 = new byte[class438.field6394];
            class387.field5435.method2596(class438.field6394, var36, 0, 0);
            String var37 = class49.method309(var36, 0, class438.field6394, 81);
            class499.method2943(true, class282.field3804, var37, class278.field3761 == 1, (byte) -112);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class366.field5136) {
            class337.method1870(true, class192.field2732);
            class467.field6834 = null;
            return true;
        } else if (class521.field7674 == class467.field6834) {
            int var38 = class387.field5435.method2103(0);
            int var39 = class387.field5435.method2064(122);
            int var40 = class387.field5435.method2087(-127);
            if (class190.method1140(65535, var39)) {
                class449.method2647(var40, (byte) 27, var38);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class213.field3032) {
            int var41 = class387.field5435.method2062((byte) 14);
            if (var41 == 65535) {
                var41 = -1;
            }
            int var42 = class387.field5435.method2099(255);
            int var43 = class387.field5435.method2062((byte) 14);
            int var44 = class387.field5435.method2099(255);
            class213.method1279(var44, var42, var41, var43, false);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class150.field2113) {
            int var45 = class387.field5435.method2064(113);
            if (var45 == 65535) {
                var45 = -1;
            }
            int var46 = class387.field5435.method2095(8999);
            int var47 = class387.field5435.method2057(65280);
            if (class190.method1140(65535, var47)) {
                class424.method2533(var45, var46, false);
            }
            class467.field6834 = null;
            return true;
        } else if (class507.field7459 == class467.field6834) {
            class336.field4605 = class387.field5435.method2099(255);
            for (int var48 = 0; var48 < class336.field4605; var48++) {
                class159.field2284[var48] = class387.field5435.method2106(-1);
                class174.field2491[var48] = class387.field5435.method2106(-1);
                if (class174.field2491[var48].equals("")) {
                    class174.field2491[var48] = class159.field2284[var48];
                }
                class463.field6729[var48] = class387.field5435.method2106(-1);
                class467.field6804[var48] = class387.field5435.method2106(-1);
                if (class467.field6804[var48].equals("")) {
                    class467.field6804[var48] = class463.field6729[var48];
                }
                class294.field3921[var48] = false;
            }
            class137.field1959 = class234.field3240;
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class341.field4710) {
            int var49 = class387.field5435.method2093(false);
            int var50 = class387.field5435.method2102(-4);
            int var51 = class387.field5435.method2057(65280);
            if (class190.method1140(65535, var51)) {
                class492.method2921(var50, var49, (byte) -126);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class125.field1714) {
            class337.method1870(true, class51.field691);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class305.field4182) {
            int var52 = class387.field5435.method2098(104);
            int var53 = class387.field5435.method2093(false);
            if (var53 == 65535) {
                var53 = -1;
            }
            int var54 = class387.field5435.method2087(-122);
            class426.method2555(var52, var53, var54, 0);
            class467.field6834 = null;
            return true;
        } else if (class515.field7560 == class467.field6834) {
            int var55 = class387.field5435.method2068((byte) 79);
            int var56 = class387.field5435.method2093(false);
            if (var56 == 65535) {
                var56 = -1;
            }
            int var57 = class387.field5435.method2099(255);
            class3.method15(var57, 0, var55, var56);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class255.field3538) {
            class467.field6834 = null;
            class516.field7575 = 1;
            class137.field1959 = class234.field3240;
            return true;
        } else if (class467.field6834 == class212.field3018) {
            int var58 = class387.field5435.method2099(255);
            boolean var59 = (var58 & 0x1) == 1;
            String var60 = class387.field5435.method2106(-1);
            String var61 = class387.field5435.method2106(-1);
            if (var61.equals("")) {
                var61 = var60;
            }
            String var62 = class387.field5435.method2106(-1);
            String var63 = class387.field5435.method2106(-1);
            if (var63.equals("")) {
                var63 = var62;
            }
            if (var59) {
                for (int var64 = 0; var64 < class336.field4605; var64++) {
                    if (class174.field2491[var64].equals(var63)) {
                        class159.field2284[var64] = var60;
                        class174.field2491[var64] = var61;
                        class463.field6729[var64] = var62;
                        class467.field6804[var64] = var63;
                        break;
                    }
                }
            } else {
                class159.field2284[class336.field4605] = var60;
                class174.field2491[class336.field4605] = var61;
                class463.field6729[class336.field4605] = var62;
                class467.field6804[class336.field4605] = var63;
                class294.field3921[class336.field4605] = class118.method750(2, var58) == 2;
                class336.field4605++;
            }
            class137.field1959 = class234.field3240;
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class308.field4226) {
            class319.field4406 = class438.field6394 <= 2 ? class13.field152.method590(class105.field1434, -22602) : class387.field5435.method2106(-1);
            class340.field4697 = class438.field6394 <= 0 ? -1 : class387.field5435.method2062((byte) 14);
            class467.field6834 = null;
            if (class340.field4697 == 65535) {
                class340.field4697 = -1;
            }
            return true;
        } else if (class93.field1246 == class467.field6834) {
            class337.method1870(true, class500.field7349);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class423.field6182) {
            int var65 = class387.field5435.method2064(120);
            int var66 = class387.field5435.method2064(109);
            int var67 = class387.field5435.method2103(0);
            if (class190.method1140(65535, var66)) {
                class23.method176(var65, var67, 12);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class249.field3454) {
            class337.method1870(true, class269.field3689);
            class467.field6834 = null;
            return true;
        } else if (class86.field1189 == class467.field6834) {
            int var68 = class387.field5435.method2102(-4);
            int var69 = class387.field5435.method2062((byte) 14);
            if (class190.method1140(65535, var69)) {
                class243.method1435(-27914, class202.field2880, var68, 5, 0);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class412.field6047) {
            class45.field637 = class234.field3240;
            if (class438.field6394 == 0) {
                class68.field982 = null;
                class520.field7653 = 0;
                class467.field6834 = null;
                class44.field617 = null;
                class80.field1136 = null;
                return true;
            }
            class68.field982 = class387.field5435.method2106(-1);
            boolean var70 = class387.field5435.method2099(255) == 1;
            if (var70) {
                class387.field5435.method2106(-1);
            }
            long var71 = class387.field5435.method2063(584310688);
            class44.field617 = class310.method1760((byte) -57, var71);
            class485.field7107 = class387.field5435.method2081((byte) -62);
            int var73 = class387.field5435.method2099(255);
            if (var73 == 255) {
                class467.field6834 = null;
                return true;
            }
            class520.field7653 = var73;
            class203[] var74 = new class203[100];
            for (int var75 = 0; var75 < class520.field7653; var75++) {
                var74[var75] = new class203();
                var74[var75].field2887 = class387.field5435.method2106(-1);
                boolean var81 = class387.field5435.method2099(255) == 1;
                if (var81) {
                    var74[var75].field2889 = class387.field5435.method2106(-1);
                } else {
                    var74[var75].field2889 = var74[var75].field2887;
                }
                var74[var75].field2891 = class451.method2659(var74[var75].field2889, (byte) -120);
                var74[var75].field2883 = class387.field5435.method2062((byte) 14);
                var74[var75].field2885 = class387.field5435.method2081((byte) 105);
                var74[var75].field2890 = class387.field5435.method2106(-1);
                if (var74[var75].field2889.equals(class75.field1089.field2693)) {
                    class285.field3835 = var74[var75].field2885;
                }
            }
            boolean var76 = false;
            int var77 = class520.field7653;
            while (var77 > 0) {
                boolean var78 = true;
                var77--;
                for (int var79 = 0; var79 < var77; var79++) {
                    if (var74[var79].field2891.compareTo(var74[var79 + 1].field2891) > 0) {
                        class203 var80 = var74[var79];
                        var74[var79] = var74[var79 + 1];
                        var78 = false;
                        var74[var79 + 1] = var80;
                    }
                }
                if (var78) {
                    break;
                }
            }
            class467.field6834 = null;
            class80.field1136 = var74;
            return true;
        } else if (class467.field6834 == class253.field3523) {
            class166.field2346 = class387.field5435.method2099(255);
            class467.field6834 = null;
            return true;
        } else if (class511.field7517 == class467.field6834) {
            class337.method1870(true, class377.field5308);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class464.field6749) {
            int var82 = class387.field5435.method2064(116);
            int var83 = class387.field5435.method2102(-4);
            int var84 = class387.field5435.method2103(0);
            if (class190.method1140(65535, var82)) {
                class14 var85 = (class14) class269.field3690.method979((byte) 28, (long) var83);
                class14 var86 = (class14) class269.field3690.method979((byte) 28, (long) var84);
                if (var86 != null) {
                    class114.method733((byte) -90, var85 == null || var85.field167 != var86.field167, var86, false);
                }
                if (var85 != null) {
                    var85.method2946(-103);
                    class269.field3690.method990((long) var84, (byte) 116, var85);
                }
                class295 var87 = class339.method1882((byte) 94, var83);
                if (var87 != null) {
                    class150.method952((byte) -76, var87);
                }
                class295 var88 = class339.method1882((byte) 91, var84);
                if (var88 != null) {
                    class150.method952((byte) 102, var88);
                    class263.method1517((byte) -15, true, var88);
                }
                if (class319.field4419 != -1) {
                    class368.method2131(1, class319.field4419, false);
                }
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class413.field6068) {
            int var89 = class387.field5435.method2062((byte) 14);
            if (class190.method1140(65535, var89)) {
                class171.method1062(0);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class103.field1411) {
            int var90 = class387.field5435.method2062((byte) 14);
            int var91 = class387.field5435.method2056((byte) -43);
            if (class190.method1140(65535, var90)) {
                class14 var92 = (class14) class269.field3690.method979((byte) 28, (long) var91);
                if (var92 != null) {
                    class114.method733((byte) -90, true, var92, false);
                }
                if (class347.field4748 != null) {
                    class150.method952((byte) -119, class347.field4748);
                    class347.field4748 = null;
                }
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class288.field3879) {
            class528.method3102(-124);
            class467.field6834 = null;
            return false;
        } else if (class522.field7684 == class467.field6834) {
            int var93 = class387.field5435.method2056((byte) 110);
            int var94 = class387.field5435.method2062((byte) 14);
            int var95 = class387.field5435.method2057(65280);
            if (var95 == 65535) {
                var95 = -1;
            }
            if (class190.method1140(65535, var94)) {
                class243.method1435(-27914, var95, var93, 2, -1);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class360.field4942) {
            int var96 = class387.field5435.method2095(8999);
            int var97 = class387.field5435.method2062((byte) 14);
            int var98 = class387.field5435.method2080((byte) -82);
            if (class190.method1140(65535, var97)) {
                class47.method292(var98, (byte) 116, var96);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class21.field244) {
            int var99 = class387.field5435.method2095(8999);
            int var100 = class387.field5435.method2062((byte) 14);
            class453.field6623.method1885(var99, var100, true);
            class467.field6834 = null;
            return true;
        } else if (class507.field7446 == class467.field6834) {
            class66.method409(-955, class387.field5435.method2106(-1));
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class207.field2936) {
            int var101 = class387.field5435.method2057(65280);
            int var102 = class387.field5435.method2093(false);
            int var103 = class387.field5435.method2093(false);
            if (class190.method1140(65535, var101)) {
                class393.method2251(0, (byte) -75, var103, var102);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class233.field3225) {
            int var104 = class387.field5435.method2062((byte) 14);
            int var105 = class387.field5435.method2099(255);
            int var106 = class387.field5435.method2099(255);
            int var107 = class387.field5435.method2099(255);
            int var108 = class387.field5435.method2099(255);
            int var109 = class387.field5435.method2062((byte) 14);
            if (class190.method1140(65535, var104)) {
                class223.field3131[var105] = true;
                class61.field813[var105] = var106;
                class384.field5403[var105] = var107;
                class325.field4464[var105] = var108;
                class423.field6171[var105] = var109;
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class269.field3685) {
            class387.field5435.field5069 += 28;
            if (class387.field5435.method2083((byte) -39)) {
                class140.method909(class387.field5435.field5069 - 28, class387.field5435, -119);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class341.field4711) {
            int var110 = class387.field5435.method2062((byte) 14);
            int var111 = class387.field5435.method2099(255);
            boolean var112 = (var111 & 0x1) == 1;
            while (class438.field6394 > class387.field5435.field5069) {
                int var113 = class387.field5435.method2065(false);
                int var114 = class387.field5435.method2062((byte) 14);
                int var115 = 0;
                if (var114 != 0) {
                    var115 = class387.field5435.method2099(255);
                    if (var115 == 255) {
                        var115 = class387.field5435.method2056((byte) 102);
                    }
                }
                class321.method1812(var115, var114 - 1, (byte) -112, var113, var112, var110);
            }
            class164.field2342[class118.method750(31, class453.field6630++)] = var110;
            class467.field6834 = null;
            return true;
        } else if (class67.field927 == class467.field6834) {
            while (class438.field6394 > class387.field5435.field5069) {
                boolean var126 = class387.field5435.method2099(255) == 1;
                String var127 = class387.field5435.method2106(-1);
                String var128 = class387.field5435.method2106(-1);
                int var129 = class387.field5435.method2062((byte) 14);
                int var130 = class387.field5435.method2099(255);
                String var131 = "";
                boolean var132 = false;
                if (var129 > 0) {
                    var131 = class387.field5435.method2106(-1);
                    var132 = class387.field5435.method2099(255) == 1;
                }
                for (int var133 = 0; var133 < class223.field3106; var133++) {
                    if (var126) {
                        if (var128.equals(class52.field702[var133])) {
                            class52.field702[var133] = var127;
                            class133.field1926[var133] = var128;
                            var127 = null;
                            break;
                        }
                    } else if (var127.equals(class52.field702[var133])) {
                        if (class405.field5628[var133] != var129) {
                            class405.field5628[var133] = var129;
                            if (var129 > 0) {
                                class478.method2806("", 0, 5, 4339, var127 + class232.field3216.method590(class105.field1434, -22602), "");
                            }
                            if (var129 == 0) {
                                class478.method2806("", 0, 5, 4339, var127 + class118.field1591.method590(class105.field1434, -22602), "");
                            }
                        }
                        class133.field1926[var133] = var128;
                        class467.field6831[var133] = var131;
                        class403.field5592[var133] = var130;
                        var127 = null;
                        class348.field4775[var133] = var132;
                        break;
                    }
                }
                if (var127 != null && class223.field3106 < 200) {
                    class52.field702[class223.field3106] = var127;
                    class133.field1926[class223.field3106] = var128;
                    class405.field5628[class223.field3106] = var129;
                    class467.field6831[class223.field3106] = var131;
                    class403.field5592[class223.field3106] = var130;
                    class348.field4775[class223.field3106] = var132;
                    class223.field3106++;
                }
            }
            class516.field7575 = 2;
            class137.field1959 = class234.field3240;
            boolean var116 = false;
            int var117 = class223.field3106;
            while (var117 > 0) {
                var117--;
                boolean var118 = true;
                for (int var119 = 0; var119 < var117; var119++) {
                    if (class405.field5628[var119] != class223.field3140 && class405.field5628[var119 + 1] == class223.field3140 || class405.field5628[var119] == 0 && class405.field5628[var119 + 1] != 0) {
                        int var120 = class405.field5628[var119];
                        class405.field5628[var119] = class405.field5628[var119 + 1];
                        class405.field5628[var119 + 1] = var120;
                        String var121 = class467.field6831[var119];
                        class467.field6831[var119] = class467.field6831[var119 + 1];
                        class467.field6831[var119 + 1] = var121;
                        String var122 = class52.field702[var119];
                        class52.field702[var119] = class52.field702[var119 + 1];
                        class52.field702[var119 + 1] = var122;
                        String var123 = class133.field1926[var119];
                        class133.field1926[var119] = class133.field1926[var119 + 1];
                        class133.field1926[var119 + 1] = var123;
                        int var124 = class403.field5592[var119];
                        class403.field5592[var119] = class403.field5592[var119 + 1];
                        class403.field5592[var119 + 1] = var124;
                        boolean var125 = class348.field4775[var119];
                        class348.field4775[var119] = class348.field4775[var119 + 1];
                        class348.field4775[var119 + 1] = var125;
                        var118 = false;
                    }
                }
                if (var118) {
                    break;
                }
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class138.field1978) {
            String var134 = class387.field5435.method2106(-1);
            int var135 = class387.field5435.method2093(false);
            int var136 = class387.field5435.method2093(false);
            if (class190.method1140(65535, var135)) {
                class299.method1708(var136, var134, 59);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class119.field1628) {
            int var137 = class387.field5435.method2058((byte) -113);
            int var138 = class387.field5435.method2102(-4);
            int var139 = class387.field5435.method2058((byte) -107);
            int var140 = class387.field5435.method2057(65280);
            if (class190.method1140(65535, var140)) {
                class340.method1895(true, var139, var138, var137);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class272.field3702) {
            class105.field1435 = class387.field5435.method2087(-127);
            class424.field6191 = class387.field5435.method2081((byte) -97) << 3;
            class17.field180 = class387.field5435.method2081((byte) -88) << 3;
            class467.field6834 = null;
            return true;
        } else if (class472.field6898 == class467.field6834) {
            for (int var141 = 0; var141 < class309.field4234.length; var141++) {
                if (class309.field4234[var141] != null) {
                    class309.field4234[var141].field271 = -1;
                }
            }
            for (int var142 = 0; var142 < class179.field2534.length; var142++) {
                if (class179.field2534[var142] != null) {
                    class179.field2534[var142].field271 = -1;
                }
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class4.field50) {
            String var143 = class387.field5435.method2106(-1);
            boolean var144 = class387.field5435.method2099(255) == 1;
            String var145;
            if (var144) {
                var145 = class387.field5435.method2106(-1);
            } else {
                var145 = var143;
            }
            int var146 = class387.field5435.method2062((byte) 14);
            byte var147 = class387.field5435.method2081((byte) -70);
            boolean var148 = false;
            if (var147 == -128) {
                var148 = true;
            }
            if (var148) {
                if (class520.field7653 == 0) {
                    class467.field6834 = null;
                    return true;
                }
                boolean var154 = false;
                int var155;
                for (var155 = 0; class520.field7653 > var155 && (!class80.field1136[var155].field2889.equals(var145) || class80.field1136[var155].field2883 != var146); var155++) {
                }
                if (var155 < class520.field7653) {
                    while (var155 < (class520.field7653 - 1)) {
                        class80.field1136[var155] = class80.field1136[var155 + 1];
                        var155++;
                    }
                    class520.field7653--;
                    class80.field1136[class520.field7653] = null;
                }
            } else {
                String var149 = class387.field5435.method2106(-1);
                class203 var150 = new class203();
                var150.field2887 = var143;
                var150.field2889 = var145;
                var150.field2891 = class451.method2659(var150.field2889, (byte) -120);
                var150.field2885 = var147;
                var150.field2883 = var146;
                var150.field2890 = var149;
                int var151;
                for (var151 = class520.field7653 - 1; var151 >= 0; var151--) {
                    int var152 = class80.field1136[var151].field2891.compareTo(var150.field2891);
                    if (var152 == 0) {
                        class80.field1136[var151].field2883 = var146;
                        class80.field1136[var151].field2885 = var147;
                        class80.field1136[var151].field2890 = var149;
                        if (var145.equals(class75.field1089.field2693)) {
                            class285.field3835 = var147;
                        }
                        class45.field637 = class234.field3240;
                        class467.field6834 = null;
                        return true;
                    }
                    if (var152 < 0) {
                        break;
                    }
                }
                if (class80.field1136.length <= class520.field7653) {
                    class467.field6834 = null;
                    return true;
                }
                for (int var153 = class520.field7653 - 1; var153 > var151; var153--) {
                    class80.field1136[var153 + 1] = class80.field1136[var153];
                }
                if (class520.field7653 == 0) {
                    class80.field1136 = new class203[100];
                }
                class80.field1136[var151 + 1] = var150;
                class520.field7653++;
                if (var145.equals(class75.field1089.field2693)) {
                    class285.field3835 = var147;
                }
            }
            class467.field6834 = null;
            class45.field637 = class234.field3240;
            return true;
        } else if (class467.field6834 == class349.field4788) {
            int var156 = class387.field5435.method2064(127);
            if (var156 == 65535) {
                var156 = -1;
            }
            int var157 = class387.field5435.method2102(-4);
            int var158 = class387.field5435.method2064(124);
            int var159 = class387.field5435.method2057(65280);
            int var160 = class387.field5435.method2057(65280);
            if (var160 == 65535) {
                var160 = -1;
            }
            if (class190.method1140(65535, var159)) {
                for (int var161 = var156; var161 <= var160; var161++) {
                    long var162 = ((long) var157 << 32) + (long) var161;
                    class197 var164 = (class197) class482.field7074.method979((byte) 28, var162);
                    class197 var165;
                    if (var164 != null) {
                        var165 = new class197(var164.field2833, var158);
                        var164.method2946(-115);
                    } else if (var161 == -1) {
                        var165 = new class197(class339.method1882((byte) 89, var157).field3947.field2833, var158);
                    } else {
                        var165 = new class197(0, var158);
                    }
                    class482.field7074.method990(var162, (byte) 39, var165);
                }
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class400.field5570) {
            class86.method605(18, class387.field5435, class438.field6394);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class127.field1734) {
            int var166 = class387.field5435.method2062((byte) 14);
            if (var166 == 65535) {
                var166 = -1;
            }
            int var167 = class387.field5435.method2057(65280);
            int var168 = class387.field5435.method2095(8999);
            if (class190.method1140(65535, var167)) {
                class243.method1435(-27914, var166, var168, 1, -1);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class252.field3509) {
            String var169 = class387.field5435.method2106(-1);
            int var170 = class387.field5435.method2062((byte) 14);
            String var171 = class517.field7602.method2((byte) -47, var170).method2452(8192, class387.field5435);
            class29.method200(0, var169, (byte) 92, var169, null, var170, var171, 19);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class413.field6057) {
            String var172 = class387.field5435.method2106(-1);
            String var173 = class134.method882(false, class195.method1185(class387.field5435, 0));
            class478.method2806(var172, 0, 6, 4339, var173, var172);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class25.field388) {
            int var174 = class387.field5435.method2102(-4);
            int var175 = class387.field5435.method2103(0);
            int var176 = class387.field5435.method2057(65280);
            if (var176 == 65535) {
                var176 = -1;
            }
            int var177 = class387.field5435.method2093(false);
            if (var177 == 65535) {
                var177 = -1;
            }
            int var178 = class387.field5435.method2093(false);
            if (class190.method1140(65535, var178)) {
                for (int var179 = var176; var179 <= var177; var179++) {
                    long var180 = ((long) var174 << 32) + (long) var179;
                    class197 var182 = (class197) class482.field7074.method979((byte) 28, var180);
                    class197 var183;
                    if (var182 != null) {
                        var183 = new class197(var175, var182.field2835);
                        var182.method2946(-125);
                    } else if (var179 == -1) {
                        var183 = new class197(var175, class339.method1882((byte) 75, var174).field3947.field2835);
                    } else {
                        var183 = new class197(var175, -1);
                    }
                    class482.field7074.method990(var180, (byte) 14, var183);
                }
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class384.field5395) {
            int var184 = class387.field5435.method2103(0);
            int var185 = class387.field5435.method2093(false);
            if (class190.method1140(65535, var185)) {
                class243.method1435(-27914, -1, var184, 3, -1);
            }
            class467.field6834 = null;
            return true;
        } else if (class53.field742 == class467.field6834) {
            String var186 = class387.field5435.method2106(-1);
            int var187 = class387.field5435.method2062((byte) 14);
            int var188 = class387.field5435.method2064(113);
            if (class190.method1140(65535, var188)) {
                class299.method1708(var187, var186, 59);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class108.field1474) {
            int var189 = class387.field5435.method2055(true);
            int var190 = class387.field5435.method2055(true);
            int var191 = class387.field5435.method2103(0);
            class141.field2012[var189] = var191;
            class9.field90[var189] = var190;
            class35.field493[var189] = 1;
            int var192 = class319.field4411[var189] - 1;
            for (int var193 = 0; var193 < var192; var193++) {
                if (class75.field1088[var193] <= var191) {
                    class35.field493[var189] = var193 + 2;
                }
            }
            class2.field23[class118.method750(class463.field6737++, 31)] = var189;
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class158.field2261) {
            class337.method1870(true, class45.field625);
            class467.field6834 = null;
            return true;
        } else if (class86.field1182 == class467.field6834) {
            String var194 = class387.field5435.method2106(-1);
            int var195 = class387.field5435.method2093(false);
            int var196 = class387.field5435.method2102(-4);
            if (class190.method1140(65535, var195)) {
                class511.method2999((byte) 32, var196, var194);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class138.field1961) {
            class193.field2750 = class387.field5435.method2069(-122);
            class317.field4398 = class234.field3240;
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class140.field1991) {
            int var197 = class387.field5435.method2062((byte) 14);
            if (var197 == 65535) {
                var197 = -1;
            }
            int var198 = class387.field5435.method2099(255);
            int var199 = class387.field5435.method2062((byte) 14);
            int var200 = class387.field5435.method2099(255);
            class467.method2746(var199, var200, var198, -73, var197);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class234.field3235) {
            boolean var201 = class387.field5435.method2099(255) == 1;
            String var202 = class387.field5435.method2106(-1);
            String var203 = var202;
            if (var201) {
                var203 = class387.field5435.method2106(-1);
            }
            long var204 = class387.field5435.method2063(584310688);
            long var206 = (long) class387.field5435.method2062((byte) 14);
            long var208 = (long) class387.field5435.method2111(-2);
            int var210 = class387.field5435.method2099(255);
            long var211 = (var206 << 32) + var208;
            boolean var213 = false;
            int var214 = 0;
            while (true) {
                if (var214 >= 100) {
                    if (var210 <= 1) {
                        if (!(!class319.field4412 || class374.field5223) || class99.field1366) {
                            var213 = true;
                        } else if (class487.method2864(var203, 0)) {
                            var213 = true;
                        }
                    }
                    break;
                }
                if (class43.field597[var214] == var211) {
                    var213 = true;
                    break;
                }
                var214++;
            }
            if (!var213 && class117.field1581 == 0) {
                class43.field597[class213.field3038] = var211;
                class213.field3038 = (class213.field3038 + 1) % 100;
                String var215 = class134.method882(false, class195.method1185(class387.field5435, 0));
                if (var210 == 2 || var210 == 3) {
                    class29.method200(0, "<img=1>" + var203, (byte) 79, "<img=1>" + var202, class141.method913(false, var204), -1, var215, 9);
                } else if (var210 == 1) {
                    class29.method200(0, "<img=0>" + var203, (byte) 125, "<img=0>" + var202, class141.method913(false, var204), -1, var215, 9);
                } else {
                    class29.method200(0, var203, (byte) 103, var202, class141.method913(false, var204), -1, var215, 9);
                }
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class151.field2130) {
            int var216 = class387.field5435.method2064(123);
            int var217 = class387.field5435.method2098(111);
            int var218 = class387.field5435.method2064(115);
            class405 var219 = class179.field2534[var216];
            if (var219 != null) {
                class138.method903(var218, var217, -3, var219);
            }
            class467.field6834 = null;
            return true;
        } else if (class83.field1156 == class467.field6834) {
            String var220 = class387.field5435.method2106(-1);
            int var221 = class387.field5435.method2055(true);
            int var222 = class387.field5435.method2055(true);
            int var223 = class387.field5435.method2093(false);
            if (var223 == 65535) {
                var223 = -1;
            }
            if (var222 >= 1 && var222 <= 8) {
                if (var220.equalsIgnoreCase("null")) {
                    var220 = null;
                }
                class422.field6158[var222 - 1] = var220;
                class361.field4950[var222 - 1] = var223;
                class495.field7292[var222 - 1] = var221 == 0;
            }
            class467.field6834 = null;
            return true;
        } else if (class517.field7588 == class467.field6834) {
            boolean var224 = class387.field5435.method2099(255) == 1;
            String var225 = class387.field5435.method2106(-1);
            String var226 = var225;
            if (var224) {
                var226 = class387.field5435.method2106(-1);
            }
            int var227 = class387.field5435.method2099(255);
            int var228 = class387.field5435.method2062((byte) 14);
            boolean var229 = false;
            if (var227 <= 1 && class487.method2864(var226, 0)) {
                var229 = true;
            }
            if (!var229 && class117.field1581 == 0) {
                String var230 = class517.field7602.method2((byte) -47, var228).method2452(8192, class387.field5435);
                if (var227 == 2) {
                    class29.method200(0, "<img=1>" + var226, (byte) 100, "<img=1>" + var225, null, var228, var230, 25);
                } else if (var227 == 1) {
                    class29.method200(0, "<img=0>" + var226, (byte) 87, "<img=0>" + var225, null, var228, var230, 25);
                } else {
                    class29.method200(0, var226, (byte) 76, var225, null, var228, var230, 25);
                }
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class247.field3444) {
            class337.method1870(true, class215.field3053);
            class467.field6834 = null;
            return true;
        } else if (client.field2799 == class467.field6834) {
            class424.method2534(16, false);
            class467.field6834 = null;
            return true;
        } else if (class521.field7683 == class467.field6834) {
            class337.method1870(true, class36.field502);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class442.field6433) {
            int var231 = class387.field5435.method2057(65280);
            int var232 = class387.field5435.method2056((byte) 115);
            class453.field6623.method1888(var231, -103, var232);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class107.field1465) {
            int var233 = class387.field5435.method2062((byte) 14);
            int var234 = class387.field5435.method2062((byte) 14);
            int var235 = class387.field5435.method2062((byte) 14);
            int var236 = class387.field5435.method2062((byte) 14);
            if (class190.method1140(65535, var233) && class522.field7701[var234] != null) {
                for (int var237 = var235; var237 < var236; var237++) {
                    int var238 = class387.field5435.method2111(-2);
                    if (var237 < class522.field7701[var234].length && class522.field7701[var234][var237] != null) {
                        class522.field7701[var234][var237].field3951 = var238;
                    }
                }
            }
            class467.field6834 = null;
            return true;
        } else if (class66.field906 == class467.field6834) {
            int var239 = class387.field5435.method2062((byte) 14);
            int var240 = class387.field5435.method2057(65280);
            int var241 = class387.field5435.method2102(-4);
            int var242 = class387.field5435.method2064(121);
            if (class190.method1140(65535, var239)) {
                class48.method299((var242 << 16) + var240, var241, 13);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class314.field4304) {
            int var243 = class387.field5435.method2057(65280);
            int var244 = class387.field5435.method2062((byte) 14);
            int var245 = class387.field5435.method2095(8999);
            int var246 = class387.field5435.method2055(true);
            if (class190.method1140(65535, var244)) {
                class14 var247 = (class14) class269.field3690.method979((byte) 28, (long) var245);
                if (var247 != null) {
                    class114.method733((byte) -90, var247.field167 != var243, var247, false);
                }
                class319.method1806(false, (byte) 125, var245, var243, var246);
            }
            class467.field6834 = null;
            return true;
        } else if (class508.field7460 == class467.field6834) {
            int var248 = class387.field5435.method2062((byte) 14);
            String var249 = class387.field5435.method2106(-1);
            Object[] var250 = new Object[var249.length() + 1];
            for (int var251 = var249.length() - 1; var251 >= 0; var251--) {
                if (var249.charAt(var251) == 's') {
                    var250[var251 + 1] = class387.field5435.method2106(-1);
                } else {
                    var250[var251 + 1] = Integer.valueOf(class387.field5435.method2056((byte) 74));
                }
            }
            var250[0] = Integer.valueOf(class387.field5435.method2056((byte) 101));
            if (class190.method1140(65535, var248)) {
                class44 var252 = new class44();
                var252.field612 = var250;
                class475.method2798(var252);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class388.field5452) {
            int var253 = class387.field5435.method2057(65280);
            byte var254 = class387.field5435.method2059(8620);
            int var255 = class387.field5435.method2093(false);
            if (class190.method1140(65535, var253)) {
                class84.method593(1, var255, var254);
            }
            class467.field6834 = null;
            return true;
        } else if (class68.field973 == class467.field6834) {
            class337.method1870(true, class449.field6491);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class273.field3716) {
            int var256 = class387.field5435.method2064(120);
            int var257 = class387.field5435.method2064(116);
            int var258 = class387.field5435.method2102(-4);
            if (class190.method1140(65535, var256)) {
                class84.method593(1, var257, var258);
            }
            class467.field6834 = null;
            return true;
        } else if (class96.field1330 == class467.field6834) {
            class435.method2593(127);
            class467.field6834 = null;
            return true;
        } else if (class77.field1114 == class467.field6834) {
            class134.field1943 = class387.field5435.method2087(-125);
            class185.field2581 = class387.field5435.method2087(-126);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class418.field6106) {
            class337.method1870(true, class26.field404);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class186.field2588) {
            class312.method1768((byte) -99);
            class467.field6834 = null;
            return false;
        } else if (class467.field6834 == class306.field4200) {
            class16.method135(class387.field5435, class282.field3804, -120, class438.field6394);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class133.field1933) {
            int var259 = class387.field5435.method2099(255);
            if (class387.field5435.method2099(255) == 0) {
                class521.field7682[var259] = new class25();
            } else {
                class387.field5435.field5069--;
                class521.field7682[var259] = new class25(class387.field5435);
            }
            class467.field6834 = null;
            class522.field7687 = class234.field3240;
            return true;
        } else if (class471.field6892 == class467.field6834) {
            int var260 = class387.field5435.method2062((byte) 14);
            int var261 = class387.field5435.method2056((byte) 67);
            int var262 = class387.field5435.method2057(65280);
            int var263 = class387.field5435.method2064(109);
            int var264 = class387.field5435.method2093(false);
            if (class190.method1140(65535, var260)) {
                class159.method986(var263, true, var261, var262, var264);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class275.field3734) {
            if (class319.field4419 != -1) {
                class368.method2131(0, class319.field4419, false);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class234.field3247) {
            int var265 = class387.field5435.method2087(-127);
            int var266 = class387.field5435.method2093(false);
            boolean var267 = (var265 & 0x1) == 1;
            class511.method3002(var266, var267, (byte) -119);
            class164.field2342[class118.method750(31, class453.field6630++)] = var266;
            class467.field6834 = null;
            return true;
        } else if (class511.field7518 == class467.field6834) {
            class337.method1870(true, class480.field7018);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class36.field505) {
            class292.method1676(22362);
            class467.field6834 = null;
            return false;
        } else if (class467.field6834 == class465.field6788) {
            int var268 = class387.field5435.method2057(65280);
            int var269 = class387.field5435.method2056((byte) 95);
            int var270 = class387.field5435.method2062((byte) 14);
            if (var270 == 65535) {
                var270 = -1;
            }
            int var271 = class387.field5435.method2056((byte) -33);
            if (class190.method1140(65535, var268)) {
                class192.method1166(var269, var270, 127, var271);
                class316 var272 = class75.field1097.method823(false, var270);
                class159.method986(var272.field4365, true, var271, var272.field4360, var272.field4341);
                class479.method2814(var272.field4363, var271, 10, var272.field4316, var272.field4383);
            }
            class467.field6834 = null;
            return true;
        } else if (class519.field7646 == class467.field6834) {
            int var273 = class387.field5435.method2056((byte) 102);
            class213.field3039 = class282.field3804.method2297(var273, 0);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class215.field3057) {
            byte var274 = class387.field5435.method2081((byte) -102);
            int var275 = class387.field5435.method2062((byte) 14);
            class453.field6623.method1885(var274, var275, true);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class250.field3475) {
            int var276 = class387.field5435.method2062((byte) 14);
            int var277 = class387.field5435.method2099(255);
            boolean var278 = (var277 & 0x1) == 1;
            class95.method647(var276, 109, var278);
            int var279 = class387.field5435.method2062((byte) 14);
            for (int var280 = 0; var280 < var279; var280++) {
                int var281 = class387.field5435.method2062((byte) 14);
                int var282 = class387.field5435.method2098(82);
                if (var282 == 255) {
                    var282 = class387.field5435.method2056((byte) 71);
                }
                class321.method1812(var282, var281 - 1, (byte) 111, var280, var278, var276);
            }
            class164.field2342[class118.method750(class453.field6630++, 31)] = var276;
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class247.field3440) {
            boolean var283 = class387.field5435.method2099(255) == 1;
            String var284 = class387.field5435.method2106(-1);
            String var285 = var284;
            if (var283) {
                var285 = class387.field5435.method2106(-1);
            }
            int var286 = class387.field5435.method2099(255);
            boolean var287 = false;
            if (var286 <= 1) {
                if (!(!class319.field4412 || class374.field5223) || class99.field1366) {
                    var287 = true;
                } else if (var286 <= 1 && class487.method2864(var285, 0)) {
                    var287 = true;
                }
            }
            if (!var287 && class117.field1581 == 0) {
                String var288 = class134.method882(false, class195.method1185(class387.field5435, 0));
                if (var286 == 2) {
                    class29.method200(0, "<img=1>" + var285, (byte) 113, "<img=1>" + var284, null, -1, var288, 24);
                } else if (var286 == 1) {
                    class29.method200(0, "<img=0>" + var285, (byte) 122, "<img=0>" + var284, null, -1, var288, 24);
                } else {
                    class29.method200(0, var285, (byte) 125, var284, null, -1, var288, 24);
                }
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class400.field5573) {
            int var289 = class387.field5435.method2099(255);
            int var290 = var289 >> 5;
            int var291 = var289 & 0x1F;
            if (var291 == 0) {
                class324.field4457[var290] = null;
                class467.field6834 = null;
                return true;
            }
            class473 var292 = new class473();
            var292.field6911 = var291;
            var292.field6905 = class387.field5435.method2099(255);
            if (var292.field6905 >= 0 && var292.field6905 < class344.field4742.length) {
                if (var292.field6911 == 1 || var292.field6911 == 10) {
                    var292.field6904 = class387.field5435.method2062((byte) 14);
                    class387.field5435.field5069 += 6;
                } else if (var292.field6911 >= 2 && var292.field6911 <= 6) {
                    if (var292.field6911 == 2) {
                        var292.field6908 = 64;
                        var292.field6912 = 64;
                    }
                    if (var292.field6911 == 3) {
                        var292.field6908 = 0;
                        var292.field6912 = 64;
                    }
                    if (var292.field6911 == 4) {
                        var292.field6908 = 128;
                        var292.field6912 = 64;
                    }
                    if (var292.field6911 == 5) {
                        var292.field6908 = 64;
                        var292.field6912 = 0;
                    }
                    if (var292.field6911 == 6) {
                        var292.field6908 = 64;
                        var292.field6912 = 128;
                    }
                    var292.field6911 = 2;
                    var292.field6907 = class387.field5435.method2099(255);
                    var292.field6908 += class387.field5435.method2062((byte) 14) - class215.field3059 << 7;
                    var292.field6912 += class387.field5435.method2062((byte) 14) - class79.field1134 << 7;
                    var292.field6915 = class387.field5435.method2099(255);
                    var292.field6903 = class387.field5435.method2062((byte) 14);
                }
                var292.field6913 = class387.field5435.method2062((byte) 14);
                if (var292.field6913 == 65535) {
                    var292.field6913 = -1;
                }
                class324.field4457[var290] = var292;
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class209.field2965) {
            int var293 = class387.field5435.method2093(false);
            int var294 = class387.field5435.method2098(84);
            int var295 = class387.field5435.method2062((byte) 14);
            if (class190.method1140(65535, var293)) {
                if (var294 == 2) {
                    class79.method578(-111);
                }
                class319.field4419 = var295;
                class188.method1126(10241, var295);
                class302.method1720(false, 66);
                class475.method2787(class319.field4419);
                for (int var296 = 0; var296 < 100; var296++) {
                    class451.field6504[var296] = true;
                }
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class241.field3342) {
            class337.method1870(true, class60.field799);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class438.field6390) {
            int var297 = class387.field5435.method2099(255);
            int var298 = class387.field5435.method2099(255);
            if (var297 == 255) {
                var297 = -1;
                var298 = -1;
            }
            class482.method2849(-2365, var298, var297);
            class467.field6834 = null;
            return true;
        } else if (class52.field705 == class467.field6834) {
            int var299 = class387.field5435.method2057(65280);
            int var300 = class387.field5435.method2057(65280);
            int var301 = class387.field5435.method2056((byte) 109);
            int var302 = class387.field5435.method2093(false);
            int var303 = class387.field5435.method2062((byte) 14);
            if (class190.method1140(65535, var302)) {
                class243.method1435(-27914, var300 << 16 | var299, var301, 7, var303);
            }
            class467.field6834 = null;
            return true;
        } else if (class79.field1132 == class467.field6834) {
            int var304 = class387.field5435.method2093(false);
            int var305 = class387.field5435.method2087(-128);
            if (class190.method1140(65535, var304)) {
                class161.field2296 = var305;
            }
            class467.field6834 = null;
            return true;
        } else if (arg0 <= 122) {
            return true;
        } else if (class467.field6834 == class224.field3151) {
            int var306 = class387.field5435.method2062((byte) 14);
            int var307 = class387.field5435.method2099(255);
            int var308 = class387.field5435.method2099(255);
            int var309 = class387.field5435.method2062((byte) 14) << 0;
            int var310 = class387.field5435.method2099(255);
            int var311 = class387.field5435.method2099(255);
            if (class190.method1140(65535, var306)) {
                class385.method2214(var311, var308, -74, true, var309, var307, var310);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class116.field1573) {
            int var312 = class387.field5435.method2062((byte) 14);
            int var313 = class387.field5435.method2099(255);
            int var314 = class387.field5435.method2099(255);
            int var315 = class387.field5435.method2062((byte) 14) << 0;
            int var316 = class387.field5435.method2099(255);
            int var317 = class387.field5435.method2099(255);
            if (class190.method1140(65535, var312)) {
                class351.method1940(6760, var313, var317, var315, var316, var314);
            }
            class467.field6834 = null;
            return true;
        } else if (class92.field1232 == class467.field6834) {
            boolean var318 = class387.field5435.method2099(255) == 1;
            String var319 = class387.field5435.method2106(-1);
            String var320 = var319;
            if (var318) {
                var320 = class387.field5435.method2106(-1);
            }
            long var321 = class387.field5435.method2063(584310688);
            long var323 = (long) class387.field5435.method2062((byte) 14);
            long var325 = (long) class387.field5435.method2111(-2);
            int var327 = class387.field5435.method2099(255);
            int var328 = class387.field5435.method2062((byte) 14);
            long var329 = (var323 << 32) + var325;
            boolean var331 = false;
            int var332 = 0;
            while (true) {
                if (var332 >= 100) {
                    if (var327 <= 1 && class487.method2864(var320, 0)) {
                        var331 = true;
                    }
                    break;
                }
                if (class43.field597[var332] == var329) {
                    var331 = true;
                    break;
                }
                var332++;
            }
            if (!var331 && class117.field1581 == 0) {
                class43.field597[class213.field3038] = var329;
                class213.field3038 = (class213.field3038 + 1) % 100;
                String var333 = class517.field7602.method2((byte) -47, var328).method2452(8192, class387.field5435);
                if (var327 == 2) {
                    class29.method200(0, "<img=1>" + var320, (byte) 86, "<img=1>" + var319, class141.method913(false, var321), var328, var333, 20);
                } else if (var327 == 1) {
                    class29.method200(0, "<img=0>" + var320, (byte) 84, "<img=0>" + var319, class141.method913(false, var321), var328, var333, 20);
                } else {
                    class29.method200(0, var320, (byte) 82, var319, class141.method913(false, var321), var328, var333, 20);
                }
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class112.field1525) {
            class337.method1870(true, class320.field4429);
            class467.field6834 = null;
            return true;
        } else if (class58.field783 == class467.field6834) {
            class337.method1870(true, class296.field4096);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class244.field3403) {
            class424.field6191 = class387.field5435.method2097((byte) 109) << 3;
            class17.field180 = class387.field5435.method2081((byte) -68) << 3;
            class105.field1435 = class387.field5435.method2055(true);
            for (class152 var334 = (class152) class456.field6672.method981(0); var334 != null; var334 = (class152) class456.field6672.method989(0)) {
                int var336 = (int) (var334.field7342 & 0x3FFFL);
                int var337 = (int) (var334.field7342 >> 14 & 0x3FFFL);
                int var338 = (int) (var334.field7342 >> 28 & 0x3L);
                if (class105.field1435 == var338 && var336 >= class424.field6191 && var336 < (class424.field6191 + 8) && class17.field180 <= var337 && var337 < (class17.field180 + 8)) {
                    var334.method2946(-100);
                    class469.method2754(class105.field1435, var336, var337, (byte) 127);
                }
            }
            for (class64 var335 = (class64) class114.field1552.method3072((byte) 76); var335 != null; var335 = (class64) class114.field1552.method3066(2)) {
                if (class424.field6191 <= var335.field885 && var335.field885 < (class424.field6191 + 8) && class17.field180 <= var335.field884 && (class17.field180 + 8) > var335.field884 && class105.field1435 == var335.field883) {
                    var335.field873 = 0;
                }
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class157.field2238) {
            int var339 = class387.field5435.method2065(false);
            int var340 = class387.field5435.method2056((byte) 94);
            int var341 = class387.field5435.method2099(255);
            String var342 = "";
            String var343 = var342;
            if ((var341 & 0x1) != 0) {
                var342 = class387.field5435.method2106(-1);
                if ((var341 & 0x2) == 0) {
                    var343 = var342;
                } else {
                    var343 = class387.field5435.method2106(-1);
                }
            }
            String var344 = class387.field5435.method2106(-1);
            if (var339 == 99) {
                class58.method376((byte) -112, var344);
            } else if (var343.equals("") || !class487.method2864(var343, 0)) {
                class478.method2806(var342, var340, var339, 4339, var344, var343);
            } else {
                class467.field6834 = null;
                return true;
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class172.field2458) {
            boolean var345 = class387.field5435.method2099(255) == 1;
            String var346 = class387.field5435.method2106(-1);
            String var347 = var346;
            if (var345) {
                var347 = class387.field5435.method2106(-1);
            }
            long var348 = (long) class387.field5435.method2062((byte) 14);
            long var350 = (long) class387.field5435.method2111(-2);
            int var352 = class387.field5435.method2099(255);
            int var353 = class387.field5435.method2062((byte) 14);
            long var354 = (var348 << 32) + var350;
            boolean var356 = false;
            int var357 = 0;
            while (true) {
                if (var357 >= 100) {
                    if (var352 <= 1 && class487.method2864(var347, 0)) {
                        var356 = true;
                    }
                    break;
                }
                if (class43.field597[var357] == var354) {
                    var356 = true;
                    break;
                }
                var357++;
            }
            if (!var356 && class117.field1581 == 0) {
                class43.field597[class213.field3038] = var354;
                class213.field3038 = (class213.field3038 + 1) % 100;
                String var358 = class517.field7602.method2((byte) -47, var353).method2452(8192, class387.field5435);
                if (var352 == 2) {
                    class29.method200(0, "<img=1>" + var347, (byte) 95, "<img=1>" + var346, null, var353, var358, 18);
                } else if (var352 == 1) {
                    class29.method200(0, "<img=0>" + var347, (byte) 79, "<img=0>" + var346, null, var353, var358, 18);
                } else {
                    class29.method200(0, var347, (byte) 125, var346, null, var353, var358, 18);
                }
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class330.field4497) {
            int var359 = class387.field5435.method2062((byte) 14);
            if (class190.method1140(65535, var359)) {
                class38.method247(66);
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class172.field2465) {
            class453.field6623.method1889(-16777216);
            class467.field6834 = null;
            class223.field3139 += 32;
            return true;
        } else if (class467.field6834 == class307.field4204) {
            int var360 = class387.field5435.method2057(65280);
            int var361 = class387.field5435.method2064(122);
            int var362 = class387.field5435.method2062((byte) 14);
            int var363 = class387.field5435.method2056((byte) -47);
            int var364 = class387.field5435.method2099(255);
            boolean var365 = (var364 & 0x80) != 0;
            if (var363 >> 30 != 0) {
                int var366 = (var363 & 0x30E01BF5) >> 28;
                int var367 = (var363 >> 14 & 0x3FFF) - class215.field3059;
                int var368 = (var363 & 0x3FFF) - class79.field1134;
                if (var367 >= 0 && var368 >= 0 && class442.field6435 > var367 && class232.field3217 > var368) {
                    int var369 = var367 * 128 + 64;
                    int var370 = var368 * 128 + 64;
                    int var371 = var366;
                    if (var366 < 3 && class426.method2553(var368, var367, 1)) {
                        var371 = var366 + 1;
                    }
                    class423 var372 = new class423(var361, 0, class393.field5484, var366, var371, var369, class186.method1118(var369, var370, 12840, var366) - var360, var370, var367, var367, var368, var368, var364);
                    class36.field504.method3070(new class309(var372), (byte) -126);
                }
            } else if (var363 >> 29 != 0) {
                int var388 = var363 & 0xFFFF;
                class405 var389 = class179.field2534[var388];
                if (var389 != null) {
                    if (var361 == 65535) {
                        var361 = -1;
                    }
                    boolean var390 = true;
                    int var391 = var365 ? var389.field303 : var389.field324;
                    if (var361 != -1 && var391 != -1) {
                        if (var361 == var391) {
                            class119 var396 = class492.field7279.method2231(var361, 64);
                            if (var396.field1603 && var396.field1616 != -1) {
                                class467 var397 = class275.field3740.method1484(0, var396.field1616);
                                int var398 = var397.field6826;
                                if (var398 == 0 || var398 == 2) {
                                    var390 = false;
                                } else if (var398 == 1) {
                                    var390 = true;
                                }
                            }
                        } else {
                            class119 var392 = class492.field7279.method2231(var361, 64);
                            class119 var393 = class492.field7279.method2231(var391, 64);
                            if (var392.field1616 != -1 && var393.field1616 != -1) {
                                class467 var394 = class275.field3740.method1484(0, var392.field1616);
                                class467 var395 = class275.field3740.method1484(0, var393.field1616);
                                if (var394.field6810 < var395.field6810) {
                                    var390 = false;
                                }
                            }
                        }
                    }
                    if (var390) {
                        if (var365) {
                            var389.field292 = var360;
                            var389.field279 = var364 & 0x7;
                            var389.field310 = 1;
                            var389.field300 = 0;
                            var389.field277 = 0;
                            var389.field303 = var361;
                            var389.field283 = class393.field5484 + var362;
                            if (class393.field5484 < var389.field283) {
                                var389.field300 = -1;
                            }
                            if (var389.field303 != -1 && class393.field5484 == var389.field283) {
                                int var401 = class492.field7279.method2231(var389.field303, 64).field1616;
                                if (var401 != -1) {
                                    class467 var402 = class275.field3740.method1484(0, var401);
                                    if (var402 != null && var402.field6806 != null) {
                                        class284.method1624(var389.field461, false, var389.field466, var402, 0, 118, var389.field464);
                                    }
                                }
                            }
                        } else {
                            var389.field336 = 1;
                            var389.field313 = var360;
                            var389.field324 = var361;
                            var389.field329 = var364 & 0x7;
                            var389.field274 = 0;
                            var389.field340 = class393.field5484 + var362;
                            var389.field308 = 0;
                            if (var389.field340 > class393.field5484) {
                                var389.field308 = -1;
                            }
                            if (var389.field324 != -1 && class393.field5484 == var389.field340) {
                                int var399 = class492.field7279.method2231(var389.field324, 64).field1616;
                                if (var399 != -1) {
                                    class467 var400 = class275.field3740.method1484(0, var399);
                                    if (var400 != null && var400.field6806 != null) {
                                        class284.method1624(var389.field461, false, var389.field466, var400, 0, 126, var389.field464);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if ((var363 >> 28) != 0) {
                int var373 = var363 & 0xFFFF;
                class192 var374;
                if (class202.field2880 == var373) {
                    var374 = class75.field1089;
                } else {
                    var374 = class309.field4234[var373];
                }
                if (var374 != null) {
                    if (var361 == 65535) {
                        var361 = -1;
                    }
                    boolean var375 = true;
                    int var376 = var365 ? var374.field303 : var374.field324;
                    if (var361 != -1 && var376 != -1) {
                        if (var361 == var376) {
                            class119 var377 = class492.field7279.method2231(var361, 64);
                            if (var377.field1603 && var377.field1616 != -1) {
                                class467 var378 = class275.field3740.method1484(0, var377.field1616);
                                int var379 = var378.field6826;
                                if (var379 == 0 || var379 == 2) {
                                    var375 = false;
                                } else if (var379 == 1) {
                                    var375 = true;
                                }
                            }
                        } else {
                            class119 var380 = class492.field7279.method2231(var361, 64);
                            class119 var381 = class492.field7279.method2231(var376, 64);
                            if (var380.field1616 != -1 && var381.field1616 != -1) {
                                class467 var382 = class275.field3740.method1484(0, var380.field1616);
                                class467 var383 = class275.field3740.method1484(0, var381.field1616);
                                if (var382.field6810 < var383.field6810) {
                                    var375 = false;
                                }
                            }
                        }
                    }
                    if (var375) {
                        if (var365) {
                            var374.field303 = var361;
                            var374.field310 = 1;
                            var374.field277 = 0;
                            var374.field279 = var364 & 0x7;
                            var374.field283 = class393.field5484 + var362;
                            var374.field300 = 0;
                            var374.field292 = var360;
                            if (class393.field5484 < var374.field283) {
                                var374.field300 = -1;
                            }
                            if (var374.field303 == 65535) {
                                var374.field303 = -1;
                            }
                            if (var374.field303 != -1 && class393.field5484 == var374.field283) {
                                int var386 = class492.field7279.method2231(var374.field303, 64).field1616;
                                if (var386 != -1) {
                                    class467 var387 = class275.field3740.method1484(0, var386);
                                    if (var387 != null && var387.field6806 != null) {
                                        class284.method1624(var374.field461, class75.field1089 == var374, var374.field466, var387, 0, -77, var374.field464);
                                    }
                                }
                            }
                        } else {
                            var374.field329 = var364 & 0x7;
                            var374.field336 = 1;
                            var374.field308 = 0;
                            var374.field340 = class393.field5484 + var362;
                            var374.field324 = var361;
                            var374.field313 = var360;
                            var374.field274 = 0;
                            if (var374.field324 == 65535) {
                                var374.field324 = -1;
                            }
                            if (var374.field340 > class393.field5484) {
                                var374.field308 = -1;
                            }
                            if (var374.field324 != -1 && class393.field5484 == var374.field340) {
                                int var384 = class492.field7279.method2231(var374.field324, 64).field1616;
                                if (var384 != -1) {
                                    class467 var385 = class275.field3740.method1484(0, var384);
                                    if (var385 != null && var385.field6806 != null) {
                                        class284.method1624(var374.field461, class75.field1089 == var374, var374.field466, var385, 0, -68, var374.field464);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class410.field5826) {
            int var403 = class387.field5435.method2093(false);
            int var404 = class387.field5435.method2099(255);
            class453.field6623.method1888(var403, -67, var404);
            class467.field6834 = null;
            return true;
        } else if (class467.field6834 == class253.field3524) {
            class424.method2534(16, true);
            class467.field6834 = null;
            return true;
        } else {
            class162.method1000((byte) -90, null, "T1 - " + (class467.field6834 == null ? -1 : class467.field6834.method1759(true)) + "," + (class207.field2937 == null ? -1 : class207.field2937.method1759(true)) + "," + (class374.field5274 == null ? -1 : class374.field5274.method1759(true)) + " - " + class438.field6394);
            class528.method3102(-128);
            return true;
        }
    }
}
