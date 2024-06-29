import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class245 {

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Lng;")
    private class226 field3620 = new class226(128);

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Lic;")
    private class491 field3619;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "[I")
    public static int[] field3614 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "Z")
    public static boolean field3617 = false;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V", line = 5)
    public final void method1644(byte arg0) {
        class226 var2 = this.field3620;
        synchronized (this.field3620) {
            this.field3620.method1540(0);
            int var3 = -116 / ((arg0 - 17) / 45);
        }
        field3612++;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V", line = 22)
    public final void method1645(byte arg0) {
        class226 var2 = this.field3620;
        synchronized (this.field3620) {
            this.field3620.method1539(-124);
        }
        if (arg0 < 118) {
            field3614 = null;
        }
        field3618++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V", line = 42)
    public final void method1646(int arg0, int arg1) {
        field3613++;
        class226 var3 = this.field3620;
        synchronized (this.field3620) {
            this.field3620.method1534(arg1 ^ arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)Lev;", line = 55)
    public final class487 method1647(int arg0, int arg1) {
        field3611++;
        class226 var3 = this.field3620;
        class487 var4;
        synchronized (this.field3620) {
            var4 = (class487) this.field3620.method1536((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3619.method2945(1, arg0, true);
        if (arg1 > -97) {
            this.method1647(123, 50);
        }
        class487 var6 = new class487();
        if (var5 != null) {
            var6.method2893(124, new class209(var5));
        }
        class226 var7 = this.field3620;
        synchronized (this.field3620) {
            this.field3620.method1542(var6, (byte) 112, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II[Lvg;IIBIIII)V", line = 85)
    public static final void method1648(int arg0, int arg1, class38[] arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field3615++;
        class348.field5015.method1098(arg3, arg9, arg4, arg8);
        int var10 = 0;
        if (arg5 > -54) {
            return;
        }
        while (var10 < arg2.length) {
            class38 var11 = arg2[var10];
            if (var11 != null && (var11.field480 == arg6 || arg6 == -1412584499 && class283.field4065 == var11)) {
                int var12;
                if (arg7 == -1) {
                    class125.field1885[class446.field6641].setBounds(var11.field412 + arg0, var11.field501 + arg1, var11.field553, var11.field472);
                    var12 = class446.field6641++;
                } else {
                    var12 = arg7;
                }
                var11.field517 = class317.field4559;
                var11.field410 = var12;
                if (!client.method1333(var11)) {
                    label581: {
                        if (var11.field448 != 0) {
                            class38.method231(true, var11);
                        }
                        int var13 = var11.field412 + arg0;
                        int var14 = var11.field501 + arg1;
                        int var15 = var11.field545;
                        if (class187.field2783 && (client.method1328(var11).field5858 != 0 || var11.field492 == 0) && var15 > 127) {
                            var15 = 127;
                        }
                        if (class283.field4065 == var11) {
                            if (arg6 != -1412584499 && (class125.field1889 == var11.field496 || class8.field113 == var11.field496)) {
                                class197.field2872 = arg0;
                                class306.field4403 = arg2;
                                class476.field7004 = arg1;
                                break label581;
                            }
                            if (class229.field3428 && class100.field1462) {
                                int var16 = class54.field838.method1751(32);
                                int var17 = class54.field838.method1749((byte) -127);
                                int var18 = var16 - class141.field2117;
                                int var19 = var17 - class479.field7038;
                                if (class110.field1573 > var18) {
                                    var18 = class110.field1573;
                                }
                                if (var11.field553 + var18 > class110.field1573 - -class163.field2399.field553) {
                                    var18 = class110.field1573 + class163.field2399.field553 - var11.field553;
                                }
                                if (var19 < class518.field7543) {
                                    var19 = class518.field7543;
                                }
                                var13 = var18;
                                if ((class518.field7543 + class163.field2399.field472) < (var11.field472 + var19)) {
                                    var19 = class518.field7543 + class163.field2399.field472 - var11.field472;
                                }
                                var14 = var19;
                            }
                            if (class8.field113 == var11.field496) {
                                var15 = 128;
                            }
                        }
                        int var20;
                        int var21;
                        int var22;
                        int var23;
                        if (var11.field492 == 2) {
                            var20 = arg4;
                            var21 = arg8;
                            var22 = arg9;
                            var23 = arg3;
                        } else {
                            int var24 = var11.field553 + var13;
                            int var25 = var14 + var11.field472;
                            var22 = var14 > arg9 ? var14 : arg9;
                            var23 = var13 <= arg3 ? arg3 : var13;
                            if (var11.field492 == 9) {
                                var24++;
                                var25++;
                            }
                            var20 = var24 >= arg4 ? arg4 : var24;
                            var21 = arg8 <= var25 ? arg8 : var25;
                        }
                        if (var20 > var23 && var22 < var21) {
                            if (var11.field448 != 0) {
                                if (class272.field3957 == var11.field448 || class392.field5916 == var11.field448) {
                                    class101.method620(var11.field553, -128, var11.field472, var14, var13, class392.field5916 == var11.field448);
                                    class315.field4503[var12] = true;
                                    class348.field5015.method1098(arg3, arg9, arg4, arg8);
                                    break label581;
                                }
                                if (class349.field5083 == var11.field448) {
                                    if (var11.method225(-1, class348.field5015) != null) {
                                        class110.method675(19315);
                                        class398.method2405(var11, 25055, var13, var14, class348.field5015);
                                        class343.field4944[var12] = true;
                                        class348.field5015.method1098(arg3, arg9, arg4, arg8);
                                    }
                                    break label581;
                                }
                                if (class511.field7487 == var11.field448) {
                                    if (var11.method225(-1, class348.field5015) != null) {
                                        class246.method1654(var14, var11, (byte) 93, var13);
                                        class343.field4944[var12] = true;
                                        class348.field5015.method1098(arg3, arg9, arg4, arg8);
                                    }
                                    break label581;
                                }
                                if (class47.field767 == var11.field448) {
                                    class166.method1156((byte) -93, var11.field553, var11.field472, class348.field5015, var14, var13, class109.field1563);
                                    class315.field4503[var12] = true;
                                    class348.field5015.method1098(arg3, arg9, arg4, arg8);
                                    break label581;
                                }
                                if (class28.field291 == var11.field448) {
                                    class327.method2017((byte) 57, var11.field472, var13, var11.field553, class348.field5015, var14);
                                    class315.field4503[var12] = true;
                                    class348.field5015.method1098(arg3, arg9, arg4, arg8);
                                    break label581;
                                }
                                if (class289.field4151 == var11.field448) {
                                    if (!class390.field5883 && !class40.field586) {
                                        break label581;
                                    }
                                    int var26 = var11.field553 + var13;
                                    int var27 = var14 + 15;
                                    if (class390.field5883) {
                                        class147.field2181.method2912("Fps:" + class33.field348, -256, (byte) 124, var26, -1, var27);
                                        var27 += 15;
                                        Runtime var28 = Runtime.getRuntime();
                                        int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                        int var30 = -256;
                                        if (var29 > 65536) {
                                            var30 = -65536;
                                        }
                                        class147.field2181.method2912("Mem:" + var29 + "k", var30, (byte) 124, var26, -1, var27);
                                        var27 += 15;
                                        class147.field2181.method2912("In:" + class436.field6520 + "B/s Out:" + class478.field7027 + "B/s", -256, (byte) 124, var26, -1, var27);
                                        var27 += 15;
                                        int var31 = class348.field5015.method1114() / 1024;
                                        class147.field2181.method2912("Offheap:" + var31 + "k", var31 <= 65536 ? -256 : -65536, (byte) 124, var26, -1, var27);
                                        var27 += 15;
                                        int var32 = 0;
                                        int var33 = 0;
                                        int var34 = 0;
                                        for (int var35 = 0; var35 < 30; var35++) {
                                            var32 += class326.field4650[var35].method1977((byte) -5);
                                            var33 += class326.field4650[var35].method1978(-2);
                                            var34 += class326.field4650[var35].method1983(0);
                                        }
                                        int var36 = var34 * 100 / var32;
                                        int var37 = var33 * 10000 / var32;
                                        String var38 = "Cache:" + class228.method1562((long) var37, true, true, 0, 2) + "% (" + var36 + "%)";
                                        class47.field761.method2912(var38, -256, (byte) 124, var26, -1, var27);
                                        var27 += 12;
                                    }
                                    if (class204.field2945 > 0) {
                                        class47.field761.method2912("Particles: " + class151.field2256 + " / " + class204.field2945, -256, (byte) 124, var26, -1, var27);
                                    }
                                    var27 += 12;
                                    if (class40.field586) {
                                        class47.field761.method2912("Polys: " + class348.field5015.method1057() + " Models: " + class348.field5015.method1099(), -256, (byte) 124, var26, -1, var27);
                                        var27 += 12;
                                        class47.field761.method2912("Ls: " + class123.field1864 + " La: " + class214.field3122 + " NPC: " + class147.field2177 + " Pl: " + class91.field1367, -256, (byte) 124, var26, -1, var27);
                                        class250.method1670((byte) -75);
                                        var27 += 12;
                                    }
                                    class315.field4503[var12] = true;
                                    break label581;
                                }
                            }
                            if (var11.field492 == 0) {
                                if (class31.field331 == var11.field448 && class348.field5015.method1025()) {
                                    class348.field5015.method1033(var13, var14, var11.field553, var11.field472);
                                }
                                method1648(var13 - var11.field505, -var11.field415 + var14, arg2, var23, var20, (byte) -92, var11.field467, var12, var21, var22);
                                if (var11.field452 != null) {
                                    method1648(var13 - var11.field505, -var11.field415 + var14, var11.field452, var23, var20, (byte) -84, var11.field467, var12, var21, var22);
                                }
                                class92 var39 = (class92) class431.field6450.method2605(false, (long) var11.field467);
                                if (var39 != null) {
                                    class229.method1569(var22, var14, var21, var12, var13, -1, var39.field1378, var23, var20);
                                }
                                if (class31.field331 == var11.field448 && class348.field5015.method1025()) {
                                    class348.field5015.method1032();
                                    class57.field879 = true;
                                }
                                class348.field5015.method1098(arg3, arg9, arg4, arg8);
                            }
                            if (class16.field183[var12] || class172.field2540 > 1) {
                                if (var11.field492 == 3) {
                                    if (var15 == 0) {
                                        if (var11.field500) {
                                            class348.field5015.method1036(var13, var14, var11.field553, var11.field472, var11.field533, 0);
                                        } else {
                                            class348.field5015.method1104(var13, var14, var11.field553, var11.field472, var11.field533, 0);
                                        }
                                    } else if (var11.field500) {
                                        class348.field5015.method1036(var13, var14, var11.field553, var11.field472, var11.field533 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                    } else {
                                        class348.field5015.method1104(var13, var14, var11.field553, var11.field472, 255 - (var15 & 0xFF) << 24 | var11.field533 & 0xFFFFFF, 1);
                                    }
                                } else if (var11.field492 == 4) {
                                    class489 var40 = var11.method233((byte) -126, class348.field5015);
                                    if (var40 != null) {
                                        int var41 = var11.field533;
                                        String var42 = var11.field489;
                                        if (var11.field535 != -1) {
                                            class339 var43 = class294.field4196.method453(0, var11.field535);
                                            var42 = var43.field4796;
                                            if (var42 == null) {
                                                var42 = "null";
                                            }
                                            if ((var43.field4829 == 1 || var11.field563 != 1) && var11.field563 != -1) {
                                                var42 = "<col=ff9040>" + var42 + "</col> x" + class108.method666((byte) -96, var11.field563);
                                            }
                                        }
                                        if (class191.field2809 == var11) {
                                            var42 = class447.field6652.method2838(false, class143.field2137);
                                            var41 = var11.field533;
                                        }
                                        if (class209.field3019) {
                                            class348.field5015.method1069(var13, var14, var11.field553 + var13, var11.field472 + var14);
                                        }
                                        var40.method2905(var14, 255 - (var15 & 0xFF) << 24 | var41, class167.field2476, var11.field434, var42, null, 0, var13, var11.field427, 0, -104, var11.field469 ? 255 - (var15 & 0xFF) << 24 : -1, var11.field549, null, var11.field487, var11.field472, var11.field553);
                                        if (class209.field3019) {
                                            class348.field5015.method1098(arg3, arg9, arg4, arg8);
                                        }
                                    } else if (class123.field1870) {
                                        class350.method2203((byte) -118, var11);
                                    }
                                } else if (var11.field492 == 5) {
                                    if (var11.field401 >= 0) {
                                        var11.method219(class77.field1154, 748, class515.field7515).method1485(0, class348.field5015, 0, var14, var11.field478 << 3, var11.field553, (byte) -86, var13, var11.field526 << 3, var11.field472);
                                    } else {
                                        class529 var45;
                                        if (var11.field535 == -1) {
                                            var45 = var11.method217(true, class348.field5015);
                                        } else {
                                            class42 var44 = var11.field518 ? class500.field7365.field3532 : null;
                                            var45 = class294.field4196.method459(var11.field535, var11.field471, var44, var11.field454 | 0xFF000000, (byte) -80, class348.field5015, var11.field563, var11.field515);
                                        }
                                        if (var45 != null) {
                                            int var46 = var45.method105();
                                            int var47 = var45.method100();
                                            int var48 = 255 - (var15 & 0xFF) << 24 | (var11.field533 == 0 ? 16777215 : var11.field533 & 0xFFFFFF);
                                            if (var11.field498) {
                                                class348.field5015.method1069(var13, var14, var13 + var11.field553, var14 - -var11.field472);
                                                if (var11.field538 != 0) {
                                                    int var49 = (var46 + var11.field553 - 1) / var46;
                                                    int var50 = (var11.field472 + var47 - 1) / var47;
                                                    for (int var51 = 0; var51 < var49; var51++) {
                                                        for (int var52 = 0; var52 < var50; var52++) {
                                                            if (var11.field533 == 0) {
                                                                var45.method3124((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var47 * var52 + var14), 4096, var11.field538);
                                                            } else {
                                                                var45.method3126((float) var46 / 2.0F + (float) (var13 + (var46 * var51)), (float) var47 / 2.0F + (float) (var14 - -(var47 * var52)), 4096, var11.field538, 0, var48, 1);
                                                            }
                                                        }
                                                    }
                                                } else if (var11.field533 == 0 && var15 == 0) {
                                                    var45.method3125(var13, var14, var11.field553, var11.field472);
                                                } else {
                                                    var45.method109(var13, var14, var11.field553, var11.field472, 0, var48, 1);
                                                }
                                                class348.field5015.method1098(arg3, arg9, arg4, arg8);
                                            } else if (var11.field533 == 0 && var15 == 0) {
                                                if (var11.field538 != 0) {
                                                    var45.method3124((float) var11.field553 / 2.0F + (float) var13, (float) var11.field472 / 2.0F + (float) var14, var11.field553 * 4096 / var46, var11.field538);
                                                } else if (var11.field553 == var46 && var11.field472 == var47) {
                                                    var45.method3121(var13, var14);
                                                } else {
                                                    var45.method3123(var13, var14, var11.field553, var11.field472);
                                                }
                                            } else if (var11.field538 != 0) {
                                                var45.method3126((float) var11.field553 / 2.0F + (float) var13, (float) var11.field472 / 2.0F + (float) var14, var11.field553 * 4096 / var46, var11.field538, 0, var48, 1);
                                            } else if (var11.field553 == var46 && var11.field472 == var47) {
                                                var45.method110(var13, var14, 0, var48, 1);
                                            } else {
                                                var45.method106(var13, var14, var11.field553, var11.field472, 0, var48, 1);
                                            }
                                        } else if (class123.field1870) {
                                            class350.method2203((byte) -119, var11);
                                        }
                                    }
                                } else if (var11.field492 == 6) {
                                    class91.method528(121);
                                    class121 var53 = null;
                                    int var54 = 0;
                                    if (var11.field535 != -1) {
                                        class339 var55 = class294.field4196.method453(0, var11.field535);
                                        if (var55 != null) {
                                            class339 var56 = var55.method2064(false, var11.field563);
                                            class329 var57 = var11.field407 == -1 ? null : class84.field1295.method1182(var11.field407, 8);
                                            class42 var58 = var11.field518 ? class500.field7365.field3532 : null;
                                            var53 = var56.method2073(1, class348.field5015, var11.field443, 2048, var11.field455, var11.field522, var58, (byte) 33, var57);
                                            if (var53 == null) {
                                                class350.method2203((byte) -117, var11);
                                            } else {
                                                var54 = -var53.method709() >> 1;
                                            }
                                        }
                                    } else if (var11.field523 == 5) {
                                        int var59 = var11.field444;
                                        if (var59 >= 0 && var59 < 2048) {
                                            class239 var60 = class44.field707[var59];
                                            class329 var61 = var11.field407 == -1 ? null : class84.field1295.method1182(var11.field407, 8);
                                            if (var60 != null && (class172.field2546 == var59 || class20.method132(var60.field3548, 0) == var11.field447)) {
                                                var53 = var60.field3532.method260(-49, var11.field455, class84.field1295, class348.field5015, class294.field4196, null, class431.field6451, var11.field522, true, class456.field6745, null, class49.field796, class45.field717, 0, var11.field443, 2048, -1, var61, 0);
                                            }
                                        }
                                    } else if (var11.field523 == 8 || var11.field523 == 9) {
                                        class138 var63 = class307.method1936((byte) 82, false, var11.field444);
                                        class329 var64 = var11.field407 == -1 ? null : class84.field1295.method1182(var11.field407, 8);
                                        if (var63 != null) {
                                            class42 var65 = var11.field518 ? class500.field7365.field3532 : null;
                                            var53 = var63.method918(var11.field523 == 9, var11.field447, var11.field522, -29012, class348.field5015, var65, var11.field455, var11.field443, 2048, var64);
                                        }
                                    } else if (var11.field407 == -1) {
                                        var53 = var11.method221(class456.field6745, class45.field717, class431.field6451, null, 0, (byte) -128, -1, class84.field1295, class294.field4196, 2048, class49.field796, -1, class500.field7365.field3532, class348.field5015);
                                        if (var53 == null && class123.field1870) {
                                            class350.method2203((byte) -121, var11);
                                        }
                                    } else {
                                        class329 var62 = class84.field1295.method1182(var11.field407, 8);
                                        var53 = var11.method221(class456.field6745, class45.field717, class431.field6451, var62, var11.field455, (byte) -127, var11.field443, class84.field1295, class294.field4196, 2048, class49.field796, var11.field522, class500.field7365.field3532, class348.field5015);
                                        if (var53 == null && class123.field1870) {
                                            class350.method2203((byte) -127, var11);
                                        }
                                    }
                                    if (var53 != null) {
                                        int var66;
                                        if (var11.field529 > 0) {
                                            var66 = (var11.field553 << 9) / var11.field529;
                                        } else {
                                            var66 = 512;
                                        }
                                        int var67;
                                        if (var11.field398 > 0) {
                                            var67 = (var11.field472 << 9) / var11.field398;
                                        } else {
                                            var67 = 512;
                                        }
                                        int var68 = var11.field553 / 2 + var13 + (var11.field470 * var66 >> 9);
                                        int var69 = (var11.field451 * var67 >> 9) + (var14 + (var11.field472 / 2));
                                        class301.field4266.method902();
                                        class348.field5015.method1082(class301.field4266);
                                        class348.field5015.method1050(var68, var69, var66, var67);
                                        class348.field5015.method1039((float) (var11.field433 << 0), var11.field425 ? (float) (var11.field436 << 0) : (float) (var11.field436 << 0) * 1.5F);
                                        if (arg6 == -1412584499 || class57.field879) {
                                            class348.field5015.method1112();
                                            class348.field5015.method1089();
                                            class348.field5015.method1098(arg3, arg9, arg4, arg8);
                                            class57.field879 = false;
                                        }
                                        if (var11.field446) {
                                            class348.field5015.method1110(false);
                                        }
                                        int var70 = (var11.field426 << 0) * class457.field6760[var11.field485 << 3] >> 15;
                                        int var71 = (var11.field426 << 0) * class457.field6759[var11.field485 << 3] >> 15;
                                        class447.field6667.method911(-var11.field482 << 3);
                                        class447.field6667.method906(var11.field408 << 3);
                                        class447.field6667.method901(var11.field562 << 0, (var11.field466 << 0) + var70 + var54, (var11.field466 << 0) + var71);
                                        class447.field6667.method905(var11.field485 << 3);
                                        if (class209.field3019) {
                                            class348.field5015.method1069(var13, var14, var13 + var11.field553, var11.field472 + var14);
                                        }
                                        if (var11.field425) {
                                            var53.method691(class447.field6667, null, var11.field426 << 0, 1);
                                        } else {
                                            var53.method720(class447.field6667, null, 1);
                                        }
                                        if (class209.field3019) {
                                            class348.field5015.method1098(arg3, arg9, arg4, arg8);
                                        }
                                        if (var11.field446) {
                                            class348.field5015.method1110(true);
                                        }
                                        class348.field5015.method1039(0.0F, 0.0F);
                                    }
                                } else if (var11.field492 == 9) {
                                    int var72;
                                    int var73;
                                    int var74;
                                    int var75;
                                    if (var11.field540) {
                                        var74 = var11.field553 + var13;
                                        var75 = var14;
                                        var73 = var13;
                                        var72 = var11.field472 + var14;
                                    } else {
                                        var72 = var14;
                                        var73 = var13;
                                        var74 = var11.field553 + var13;
                                        var75 = var11.field472 + var14;
                                    }
                                    if (var11.field514 == 1) {
                                        class348.field5015.method1113(var73, var72, var74, var75, var11.field533, 0);
                                    } else {
                                        class348.field5015.method1047(var73, var72, var74, var75, var11.field533, var11.field514, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V", line = 740)
    public static void method1649(boolean arg0) {
        if (arg0) {
            method1649(true);
        }
        field3614 = null;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lai;ILic;)V", line = 755)
    public class245(class423 arg0, int arg1, class491 arg2) {
        this.field3619 = arg2;
        this.field3619.method2942(false, 1);
    }
}
