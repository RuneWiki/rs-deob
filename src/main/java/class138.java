import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class138 extends class376 {

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "Ldd;")
    public class495 field1967;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "Lgk;")
    public static class331 field1971 = new class331("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!hi", name = "G", descriptor = "Z")
    public static boolean field1974 = true;

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "Lgk;")
    public static class331 field1972 = new class331("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 3)
    public static final boolean method1038(int arg0, String arg1) {
        field1969++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class91.field1257; var2++) {
            if (arg1.equalsIgnoreCase(class353.field4943[var2])) {
                return true;
            }
        }
        if (arg0 <= 109) {
            return false;
        } else {
            return arg1.equalsIgnoreCase(class435.field6375.field5074);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IC)C", line = 34)
    public static final char method1039(int arg0, char arg1) {
        if (arg0 != 234) {
            field1971 = null;
        }
        field1973++;
        if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Ldd;)V", line = 429)
    public class138(class495 arg0) {
        this.field1967 = arg0;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII[Luu;IIIII)V", line = 437)
    public static final void method1040(int arg0, int arg1, int arg2, int arg3, class188[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class225.field3300.method380(arg5, arg0, arg1, arg7);
        if (arg9 != -1268043624) {
            return;
        }
        field1968++;
        for (int var10 = 0; var10 < arg4.length; var10++) {
            class188 var11 = arg4[var10];
            if (var11 != null && (var11.field2745 == arg6 || arg6 == -1412584499 && class134.field1943 == var11)) {
                int var12;
                if (arg3 == -1) {
                    class96.field1292[class267.field3933].setBounds(var11.field2718 + arg8, var11.field2765 + arg2, var11.field2711, var11.field2672);
                    var12 = class267.field3933++;
                } else {
                    var12 = arg3;
                }
                var11.field2655 = class263.field3867;
                var11.field2749 = var12;
                if (!client.method1375(var11)) {
                    if (var11.field2732 != 0) {
                        class141.method1052(var11, 18804);
                    }
                    int var13 = var11.field2718 + arg8;
                    int var14 = var11.field2765 + arg2;
                    int var15 = var11.field2747;
                    if (class407.field6069 && (client.method1380(var11).field4072 != 0 || var11.field2727 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class134.field1943 == var11) {
                        if (arg6 != -1412584499 && (class193.field2815 == var11.field2612 || class278.field4073 == var11.field2612)) {
                            class139.field1976 = arg4;
                            class21.field239 = arg2;
                            class147.field2067 = arg8;
                            continue;
                        }
                        if (class20.field234 && class442.field6559) {
                            int var16 = class104.field1460.method1268((byte) 58);
                            int var17 = class104.field1460.method1280(arg9 ^ 0xB46B3B7D);
                            int var18 = var16 - class432.field6353;
                            int var19 = var17 - class203.field2948;
                            if (var18 < class38.field433) {
                                var18 = class38.field433;
                            }
                            if (var11.field2711 + var18 > class38.field433 + class326.field4577.field2711) {
                                var18 = class326.field4577.field2711 + class38.field433 - var11.field2711;
                            }
                            if (class297.field4267 > var19) {
                                var19 = class297.field4267;
                            }
                            var13 = var18;
                            if ((class297.field4267 + class326.field4577.field2672) < (var19 + var11.field2672)) {
                                var19 = class297.field4267 + class326.field4577.field2672 - var11.field2672;
                            }
                            var14 = var19;
                        }
                        if (class278.field4073 == var11.field2612) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field2727 == 2) {
                        var20 = arg0;
                        var21 = arg7;
                        var22 = arg1;
                        var23 = arg5;
                    } else {
                        int var24 = var13 + var11.field2711;
                        int var25 = var11.field2672 + var14;
                        if (var11.field2727 == 9) {
                            var25++;
                            var24++;
                        }
                        var23 = var13 <= arg5 ? arg5 : var13;
                        var20 = var14 <= arg0 ? arg0 : var14;
                        var22 = arg1 > var24 ? var24 : arg1;
                        var21 = arg7 <= var25 ? arg7 : var25;
                    }
                    if (var22 > var23 && var20 < var21) {
                        if (var11.field2732 != 0) {
                            if (class516.field7609 == var11.field2732 || class482.field7096 == var11.field2732) {
                                class291.method1834(var13, (byte) 86, var11.field2711, class482.field7096 == var11.field2732, var14, var11.field2672);
                                class342.field4736[var12] = true;
                                class225.field3300.method380(arg5, arg0, arg1, arg7);
                                continue;
                            }
                            if (class363.field5041 == var11.field2732) {
                                if (var11.method1320(0, class225.field3300) != null) {
                                    class106.method876((byte) -109);
                                    class114.method917(var11, var13, -36, var14, class225.field3300);
                                    class525.field7706[var12] = true;
                                    class225.field3300.method380(arg5, arg0, arg1, arg7);
                                }
                                continue;
                            }
                            if (class457.field6710 == var11.field2732) {
                                if (var11.method1320(0, class225.field3300) != null) {
                                    class466.method2788((byte) -125, var13, var14, var11);
                                    class525.field7706[var12] = true;
                                    class225.field3300.method380(arg5, arg0, arg1, arg7);
                                }
                                continue;
                            }
                            if (class515.field7585 == var11.field2732) {
                                class367.method2266(var13, var11.field2711, class467.field6850, class225.field3300, var11.field2672, (byte) -125, var14);
                                class342.field4736[var12] = true;
                                class225.field3300.method380(arg5, arg0, arg1, arg7);
                                continue;
                            }
                            if (class110.field1552 == var11.field2732) {
                                class275.method1768(var11.field2711, -117, class225.field3300, var13, var14, var11.field2672);
                                class342.field4736[var12] = true;
                                class225.field3300.method380(arg5, arg0, arg1, arg7);
                                continue;
                            }
                            if (class134.field1945 == var11.field2732) {
                                if (!class49.field547 && !class433.field6360) {
                                    continue;
                                }
                                int var26 = var13 + var11.field2711;
                                int var27 = var14 + 15;
                                if (class49.field547) {
                                    class396.field5802.method1959(-1, false, "Fps:" + class338.field4691, var27, -256, var26);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (var29 > 65536) {
                                        var30 = -65536;
                                    }
                                    class396.field5802.method1959(-1, false, "Mem:" + var29 + "k", var27, var30, var26);
                                    var27 += 15;
                                    class396.field5802.method1959(-1, false, "In:" + class355.field4965 + "B/s Out:" + class522.field7673 + "B/s", var27, -256, var26);
                                    var27 += 15;
                                    int var31 = class225.field3300.method320() / 1024;
                                    class396.field5802.method1959(-1, false, "Offheap:" + var31 + "k", var27, var31 <= 65536 ? -256 : -65536, var26);
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < 30; var35++) {
                                        var32 += class4.field64[var35].method1905((byte) -8);
                                        var33 += class4.field64[var35].method1915(-104);
                                        var34 += class4.field64[var35].method1909(false);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class74.method703(true, (long) var37, 2, -113, 0) + "% (" + var36 + "%)";
                                    class122.field1792.method1959(-1, false, var38, var27, -256, var26);
                                    var27 += 12;
                                }
                                if (class213.field3063 > 0) {
                                    class122.field1792.method1959(-1, false, "Particles: " + class287.field4137 + " / " + class213.field3063, var27, -256, var26);
                                }
                                var27 += 12;
                                if (class433.field6360) {
                                    class122.field1792.method1959(-1, false, "Polys: " + class225.field3300.method342() + " Models: " + class225.field3300.method327(), var27, -256, var26);
                                    var27 += 12;
                                    class122.field1792.method1959(-1, false, "Ls: " + class127.field1853 + " La: " + class411.field6104 + " NPC: " + class81.field1106 + " Pl: " + class324.field4553, var27, -256, var26);
                                    var27 += 12;
                                    class206.method1436(-77);
                                }
                                class342.field4736[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field2727 == 0) {
                            if (class173.field2453 == var11.field2732 && class225.field3300.method378()) {
                                class225.field3300.method369(var13, var14, var11.field2711, var11.field2672);
                            }
                            method1040(var20, var22, var14 - var11.field2744, var12, arg4, var23, var11.field2678, var21, var13 - var11.field2700, -1268043624);
                            if (var11.field2758 != null) {
                                method1040(var20, var22, var14 - var11.field2744, var12, var11.field2758, var23, var11.field2678, var21, var13 - var11.field2700, -1268043624);
                            }
                            class305 var39 = (class305) class49.field545.method875((long) var11.field2678, 126);
                            if (var39 != null) {
                                class205.method1434(var23, var12, var20, var22, var39.field4333, var21, var13, (byte) 27, var14);
                            }
                            if (class173.field2453 == var11.field2732 && class225.field3300.method378()) {
                                class225.field3300.method347();
                                class311.field4441 = true;
                            }
                            class225.field3300.method380(arg5, arg0, arg1, arg7);
                        }
                        if (class368.field5473[var12] || class240.field3548 > 1) {
                            if (var11.field2727 == 3) {
                                if (var15 == 0) {
                                    if (var11.field2726) {
                                        class225.field3300.method386(var13, var14, var11.field2711, var11.field2672, var11.field2604, 0);
                                    } else {
                                        class225.field3300.method397(var13, var14, var11.field2711, var11.field2672, var11.field2604, 0);
                                    }
                                } else if (var11.field2726) {
                                    class225.field3300.method386(var13, var14, var11.field2711, var11.field2672, var11.field2604 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                } else {
                                    class225.field3300.method397(var13, var14, var11.field2711, var11.field2672, 255 - (var15 & 0xFF) << 24 | var11.field2604 & 0xFFFFFF, 1);
                                }
                            } else if (var11.field2727 == 4) {
                                class314 var40 = var11.method1318(class225.field3300, -1);
                                if (var40 != null) {
                                    int var41 = var11.field2604;
                                    String var42 = var11.field2677;
                                    if (var11.field2617 != -1) {
                                        class72 var43 = class270.field3995.method6(22883, var11.field2617);
                                        var42 = var43.field929;
                                        if (var42 == null) {
                                            var42 = "null";
                                        }
                                        if ((var43.field965 == 1 || var11.field2710 != 1) && var11.field2710 != -1) {
                                            var42 = "<col=ff9040>" + var42 + "</col> x" + class39.method399(92, var11.field2710);
                                        }
                                    }
                                    if (class454.field6681 == var11) {
                                        var42 = class109.field1548.method2031(true, class377.field5585);
                                        var41 = var11.field2604;
                                    }
                                    if (class522.field7670) {
                                        class225.field3300.method306(var13, var14, var11.field2711 + var13, var11.field2672 + var14);
                                    }
                                    var40.method1949(var13, var11.field2672, 255 - (var15 & 0xFF) << 24 | var41, class32.field374, null, false, var11.field2708 ? 255 - (var15 & 0xFF) << 24 : -1, var11.field2752, 0, 0, var11.field2669, var42, var14, var11.field2689, null, var11.field2720, var11.field2711);
                                    if (class522.field7670) {
                                        class225.field3300.method380(arg5, arg0, arg1, arg7);
                                    }
                                } else if (class423.field6247) {
                                    class120.method951(var11, (byte) -109);
                                }
                            } else if (var11.field2727 == 5) {
                                if (var11.field2620 < 0) {
                                    class16 var45;
                                    if (var11.field2617 == -1) {
                                        var45 = var11.method1308(class225.field3300, (byte) 1);
                                    } else {
                                        class488 var44 = var11.field2657 ? class435.field6375.field5065 : null;
                                        var45 = class270.field3995.method3(class225.field3300, var11.field2617, -113, var44, var11.field2704, var11.field2710, var11.field2709, var11.field2616 | 0xFF000000);
                                    }
                                    if (var45 != null) {
                                        int var46 = var45.method125();
                                        int var47 = var45.method117();
                                        int var48 = (var11.field2604 == 0 ? 16777215 : var11.field2604 & 0xFFFFFF) | 255 - (var15 & 0xFF) << 24;
                                        if (var11.field2738) {
                                            class225.field3300.method306(var13, var14, var11.field2711 + var13, var11.field2672 + var14);
                                            if (var11.field2690 != 0) {
                                                int var49 = (var46 + var11.field2711 - 1) / var46;
                                                int var50 = (var47 + var11.field2672 - 1) / var47;
                                                for (int var51 = 0; var51 < var49; var51++) {
                                                    for (int var52 = 0; var52 < var50; var52++) {
                                                        if (var11.field2604 == 0) {
                                                            var45.method127((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var14 - -(var47 * var52)), 4096, var11.field2690);
                                                        } else {
                                                            var45.method118((float) var46 / 2.0F + (float) (var13 + (var46 * var51)), (float) var47 / 2.0F + (float) (var47 * var52 + var14), 4096, var11.field2690, 0, var48, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field2604 == 0 && var15 == 0) {
                                                var45.method123(var13, var14, var11.field2711, var11.field2672);
                                            } else {
                                                var45.method108(var13, var14, var11.field2711, var11.field2672, 0, var48, 1);
                                            }
                                            class225.field3300.method380(arg5, arg0, arg1, arg7);
                                        } else if (var11.field2604 == 0 && var15 == 0) {
                                            if (var11.field2690 != 0) {
                                                var45.method127((float) var11.field2711 / 2.0F + (float) var13, (float) var11.field2672 / 2.0F + (float) var14, var11.field2711 * 4096 / var46, var11.field2690);
                                            } else if (var11.field2711 == var46 && var11.field2672 == var47) {
                                                var45.method111(var13, var14);
                                            } else {
                                                var45.method120(var13, var14, var11.field2711, var11.field2672);
                                            }
                                        } else if (var11.field2690 != 0) {
                                            var45.method118((float) var11.field2711 / 2.0F + (float) var13, (float) var11.field2672 / 2.0F + (float) var14, var11.field2711 * 4096 / var46, var11.field2690, 0, var48, 1);
                                        } else if (var11.field2711 == var46 && var11.field2672 == var47) {
                                            var45.method114(var13, var14, 0, var48, 1);
                                        } else {
                                            var45.method121(var13, var14, var11.field2711, var11.field2672, 0, var48, 1);
                                        }
                                    } else if (class423.field6247) {
                                        class120.method951(var11, (byte) -109);
                                    }
                                } else {
                                    var11.method1319(arg9 ^ 0x4B94CF1A, class172.field2451, class428.field6311).method1842(0, var13, var14, var11.field2766 << 3, var11.field2683 << 3, class225.field3300, arg9 ^ 0xB46B0F67, var11.field2711, 0, var11.field2672);
                                }
                            } else if (var11.field2727 == 6) {
                                class99.method836(-109);
                                class471 var53 = null;
                                int var54 = 0;
                                if (var11.field2617 != -1) {
                                    class72 var62 = class270.field3995.method6(arg9 + 1268066507, var11.field2617);
                                    if (var62 != null) {
                                        class72 var63 = var62.method686(var11.field2710, 4223);
                                        class267 var64 = var11.field2639 == -1 ? null : class153.field2169.method1585(3, var11.field2639);
                                        class488 var65 = var11.field2657 ? class435.field6375.field5065 : null;
                                        var53 = var63.method671(var11.field2705, 1, var64, 2048, var11.field2628, var65, var11.field2686, -124, class225.field3300);
                                        if (var53 == null) {
                                            class120.method951(var11, (byte) -109);
                                        } else {
                                            var54 = -var53.method463() >> 1;
                                        }
                                    }
                                } else if (var11.field2651 == 5) {
                                    int var59 = var11.field2622;
                                    if (var59 >= 0 && var59 < 2048) {
                                        class364 var60 = class384.field5647[var59];
                                        class267 var61 = var11.field2639 == -1 ? null : class153.field2169.method1585(3, var11.field2639);
                                        if (var60 != null && (class396.field5815 == var59 || class80.method727((byte) -33, var60.field5074) == var11.field2741)) {
                                            var53 = var60.field5065.method2932(class284.field4134, class104.field1458, null, 2048, null, class515.field7587, var11.field2628, var11.field2686, var61, (byte) 119, class153.field2169, -1, 0, class225.field3300, class270.field3995, 0, class253.field3739, var11.field2705, true);
                                        }
                                    }
                                } else if (var11.field2651 == 8 || var11.field2651 == 9) {
                                    class110 var56 = class455.method2749(arg9 ^ 0xB46B30F3, false, var11.field2622);
                                    class267 var57 = var11.field2639 == -1 ? null : class153.field2169.method1585(3, var11.field2639);
                                    if (var56 != null) {
                                        class488 var58 = var11.field2657 ? class435.field6375.field5065 : null;
                                        var53 = var56.method900(2048, var11.field2651 == 9, (byte) 117, var11.field2628, var57, var11.field2705, var11.field2741, var58, var11.field2686, class225.field3300);
                                    }
                                } else if (var11.field2639 == -1) {
                                    var53 = var11.method1315(class270.field3995, class225.field3300, class515.field7587, class435.field6375.field5065, class153.field2169, 2048, (byte) 102, null, -1, class104.field1458, -1, class253.field3739, 0, class284.field4134);
                                    if (var53 == null && class423.field6247) {
                                        class120.method951(var11, (byte) -109);
                                    }
                                } else {
                                    class267 var55 = class153.field2169.method1585(3, var11.field2639);
                                    var53 = var11.method1315(class270.field3995, class225.field3300, class515.field7587, class435.field6375.field5065, class153.field2169, 2048, (byte) 102, var55, var11.field2686, class104.field1458, var11.field2628, class253.field3739, var11.field2705, class284.field4134);
                                    if (var53 == null && class423.field6247) {
                                        class120.method951(var11, (byte) -109);
                                    }
                                }
                                if (var53 != null) {
                                    int var66;
                                    if (var11.field2695 <= 0) {
                                        var66 = 512;
                                    } else {
                                        var66 = (var11.field2711 << 9) / var11.field2695;
                                    }
                                    int var67;
                                    if (var11.field2644 > 0) {
                                        var67 = (var11.field2672 << 9) / var11.field2644;
                                    } else {
                                        var67 = 512;
                                    }
                                    int var68 = var11.field2711 / 2 + var13 + (var11.field2739 * var66 >> 9);
                                    int var69 = var11.field2672 / 2 + (var11.field2645 * var67 >> 9) + var14;
                                    class462.field6798.method250();
                                    class225.field3300.method308(class462.field6798);
                                    class225.field3300.method394(var68, var69, var66, var67);
                                    class225.field3300.method319((float) (var11.field2624 << 0), var11.field2737 ? (float) (var11.field2770 << 0) : (float) (var11.field2770 << 0) * 1.5F);
                                    if (arg6 == -1412584499 || class311.field4441) {
                                        class225.field3300.method339();
                                        class225.field3300.method331();
                                        class225.field3300.method380(arg5, arg0, arg1, arg7);
                                        class311.field4441 = false;
                                    }
                                    if (var11.field2729) {
                                        class225.field3300.method390(false);
                                    }
                                    int var70 = (var11.field2761 << 0) * class340.field4724[var11.field2735 << 3] >> 15;
                                    int var71 = (var11.field2761 << 0) * class340.field4715[var11.field2735 << 3] >> 15;
                                    class264.field3903.method243(-var11.field2733 << 3);
                                    class264.field3903.method247(var11.field2764 << 3);
                                    class264.field3903.method251(var11.field2685 << 0, var70 + (var11.field2701 << 0) + var54, var71 - -(var11.field2701 << 0));
                                    class264.field3903.method254(var11.field2735 << 3);
                                    if (class522.field7670) {
                                        class225.field3300.method306(var13, var14, var11.field2711 + var13, var11.field2672 + var14);
                                    }
                                    if (var11.field2737) {
                                        var53.method464(class264.field3903, null, var11.field2761 << 0, 1);
                                    } else {
                                        var53.method457(class264.field3903, null, 1);
                                    }
                                    if (class522.field7670) {
                                        class225.field3300.method380(arg5, arg0, arg1, arg7);
                                    }
                                    if (var11.field2729) {
                                        class225.field3300.method390(true);
                                    }
                                    class225.field3300.method319(0.0F, 0.0F);
                                }
                            } else if (var11.field2727 == 9) {
                                int var72;
                                int var73;
                                int var74;
                                int var75;
                                if (var11.field2614) {
                                    var72 = var13;
                                    var73 = var11.field2711 + var13;
                                    var74 = var14;
                                    var75 = var11.field2672 + var14;
                                } else {
                                    var72 = var13;
                                    var74 = var11.field2672 + var14;
                                    var73 = var13 + var11.field2711;
                                    var75 = var14;
                                }
                                if (var11.field2646 == 1) {
                                    class225.field3300.method379(var72, var75, var73, var74, var11.field2604, 0);
                                } else {
                                    class225.field3300.method313(var72, var75, var73, var74, var11.field2604, var11.field2646, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 1089)
    public static void method1041(int arg0) {
        field1972 = null;
        if (arg0 != 19293) {
            field1974 = false;
        }
        field1971 = null;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(Z)V", line = 1100)
    public static final void method1042(boolean arg0) {
        if (arg0) {
            field1970++;
            class388.field5740 = 0;
            class476.field7011 = new class114[50];
        }
    }
}
