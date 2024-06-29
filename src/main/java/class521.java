import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class521 {

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public int field7625;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "J")
    public long field7629;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "Ljava/lang/String;")
    public String field7628;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "Ljava/lang/String;")
    public String field7627;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public int field7624;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7632 = new String[] { method3961(method3960("tr)=|")), method3961(method3960("tr)>|")), method3961(method3960("b5)R)")), method3961(method3960("Wnk\u0010")), method3961(method3960("tr)?|")), method3961(method3960("%xh\u0010i\u007f}a\u001a2\u007f%")), method3961(method3960("wnk\u0010")), method3961(method3960("tr)@=wrsB|")) };

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "Lel;")
    public static class573 field7630 = new class573(95, -1);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "[I")
    public static int[] field7631 = new int[4];

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static void method3957(int arg0) {
        try {
            if (arg0 != 7689) {
                field7630 = null;
            }
            field7630 = null;
            field7631 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7632[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public static final void method3958(int arg0) {
        try {
            field7623++;
            short var1 = 1024;
            short var2 = 3072;
            if (class640.field9291) {
                if (class268.field4092) {
                    var1 = 2048;
                }
                var2 = 4096;
            }
            if (class98.field1099 < (float) var1) {
                class98.field1099 = var1;
            }
            if ((float) var2 < class98.field1099) {
                class98.field1099 = var2;
            }
            while (class377.field5748 >= 16384.0F) {
                class377.field5748 -= 16384.0F;
            }
            while (class377.field5748 < 0.0F) {
                class377.field5748 += 16384.0F;
            }
            int var3 = class477.field6945 >> 9;
            int var4 = class578.field8576 >> 9;
            int var5 = class316.method2656(class477.field6945, class520.field7618, class578.field8576, 0);
            int var6 = 0;
            if (var3 > 3 && var4 > 3 && var3 < (class648.field9378 - 4) && var4 < class659.field9506 - 4) {
                for (int var7 = var3 - 4; var7 <= (var3 + 4); var7++) {
                    for (int var8 = var4 - 4; var8 <= (var4 + 4); var8++) {
                        int var9 = class520.field7618;
                        if (var9 < 3 && class231.method1980(arg0 + 16403, var8, var7)) {
                            var9++;
                        }
                        int var10 = 0;
                        if (class531.field7799.field6412 != null && class531.field7799.field6412[var9] != null) {
                            var10 = (class531.field7799.field6412[var9][var7][var8] & 0xFF) * 8 << 2;
                        }
                        if (class555.field8261 != null && class555.field8261[var9] != null) {
                            int var11 = var10 + var5 - class555.field8261[var9].method2407(var8, var7, arg0 + 16301);
                            if (var11 > var6) {
                                var6 = var11;
                            }
                        }
                    }
                }
            }
            int var12 = (var6 >> 2) * 1536;
            if (var12 > 786432) {
                var12 = 786432;
            }
            if (var12 < 262144) {
                var12 = 262144;
            }
            if (arg0 != -16402) {
                method3958(-65);
            }
            if (class776.field11276 < var12) {
                class776.field11276 += (var12 - class776.field11276) / 24;
            } else if (var12 < class776.field11276) {
                class776.field11276 += (var12 - class776.field11276) / 80;
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field7632[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lsg;III)V")
    public static final void method3959(class417 arg0, int arg1, int arg2, int arg3) {
        try {
            field7626++;
            if (arg0 != null && class728.field10549.field7374 != arg0) {
                int var4 = arg0.field6158;
                int var5 = arg0.field6141;
                int var6 = arg0.field6146;
                int var7 = 14 / ((-arg3 - 5) / 58);
                int var8 = (int) arg0.field6137;
                if (var6 >= 2000) {
                    var6 -= 2000;
                }
                long var9 = arg0.field6137;
                if (var6 == 16) {
                    class597.field8779 = arg1;
                    class617.field9068 = arg2;
                    class104.field1200++;
                    class382.field5791 = 0;
                    class245.field3753 = 2;
                    class280 var11 = class610.method4508(class39.field459, class279.field4190, (byte) -94);
                    var11.field4197.method1440((int) (var9 >>> 32) & Integer.MAX_VALUE, (byte) -35);
                    var11.field4197.method1457(128, class597.field8749.method89(false, 82) ? 1 : 0);
                    var11.field4197.method1440(var5 + class281.field4219, (byte) -35);
                    var11.field4197.method1446(var4 + class494.field7101, (byte) 98);
                    class106.method934((byte) 53, var11);
                    class709.method5170(var5, var4, false, var9);
                }
                if (var6 == 53) {
                    class726 var12 = class197.field2685[var8];
                    if (var12 != null) {
                        class382.field5791 = 0;
                        class617.field9068 = arg2;
                        class624.field9128++;
                        class597.field8779 = arg1;
                        class245.field3753 = 2;
                        class280 var13 = class610.method4508(class139.field1650, class279.field4190, (byte) 123);
                        var13.field4197.method1446(var8, (byte) 98);
                        var13.field4197.method1428((byte) -24, class597.field8749.method89(false, 82) ? 1 : 0);
                        class106.method934((byte) 53, var13);
                        class471.method3582(true, 0, var12.field3863[0], 1, -2, var12.field3859[0], 0, var12.method2101(31463), var12.method2101(31463));
                    }
                }
                if (var6 == 20) {
                    class726 var14 = class197.field2685[var8];
                    if (var14 != null) {
                        class382.field5791 = 0;
                        class617.field9068 = arg2;
                        class546.field8152++;
                        class597.field8779 = arg1;
                        class245.field3753 = 2;
                        class280 var15 = class610.method4508(class200.field3121, class279.field4190, (byte) 89);
                        var15.field4197.method1410(class597.field8749.method89(false, 82) ? 1 : 0, 26913);
                        var15.field4197.method1406(var8, 380332136);
                        class106.method934((byte) 53, var15);
                        class471.method3582(true, 0, var14.field3863[0], 1, -2, var14.field3859[0], 0, var14.method2101(31463), var14.method2101(31463));
                    }
                }
                if (var6 == 22) {
                    class382.field5791 = 0;
                    class245.field3753 = 2;
                    class597.field8779 = arg1;
                    class690.field10037++;
                    class617.field9068 = arg2;
                    class280 var16 = class610.method4508(class454.field6634, class279.field4190, (byte) 10);
                    var16.field4197.method1406(class281.field4219 + var5, 380332136);
                    var16.field4197.method1440((int) (var9 >>> 32) & Integer.MAX_VALUE, (byte) -35);
                    var16.field4197.method1446(class494.field7101 + var4, (byte) 98);
                    var16.field4197.method1428((byte) -24, class597.field8749.method89(false, 82) ? 1 : 0);
                    class106.method934((byte) 53, var16);
                    class709.method5170(var5, var4, false, var9);
                }
                if (var6 == 1002) {
                    class597.field8779 = arg1;
                    class245.field3753 = 2;
                    class382.field5791 = 0;
                    class617.field9068 = arg2;
                    class349.field5395++;
                    class280 var17 = class610.method4508(class128.field1504, class279.field4190, (byte) -101);
                    var17.field4197.method1446((int) (var9 >>> 32) & Integer.MAX_VALUE, (byte) 98);
                    var17.field4197.method1418((byte) -111, class494.field7101 + var4);
                    var17.field4197.method1418((byte) -117, class281.field4219 + var5);
                    var17.field4197.method1428((byte) -24, class597.field8749.method89(false, 82) ? 1 : 0);
                    class106.method934((byte) 53, var17);
                    class709.method5170(var5, var4, false, var9);
                }
                if (var6 == 1012 || var6 == 1001 || var6 == 1011 || var6 == 1010 || var6 == 1006) {
                    class373.method3009((byte) 88, var8, var4, var6);
                }
                if (var6 == 21) {
                    class383 var18 = (class383) class207.field3184.method977((long) var8, 1);
                    if (var18 != null) {
                        class612 var19 = var18.field5799;
                        class3.field37++;
                        class597.field8779 = arg1;
                        class617.field9068 = arg2;
                        class382.field5791 = 0;
                        class245.field3753 = 2;
                        class280 var20 = class610.method4508(class473.field6861, class279.field4190, (byte) -74);
                        var20.field4197.method1418((byte) -113, var8);
                        var20.field4197.method1430(false, class597.field8749.method89(false, 82) ? 1 : 0);
                        class106.method934((byte) 53, var20);
                        class471.method3582(true, 0, var19.field3863[0], 1, -2, var19.field3859[0], 0, var19.method2101(31463), var19.method2101(31463));
                    }
                }
                if (var6 == 15) {
                    class686.field9959++;
                    class245.field3753 = 2;
                    class597.field8779 = arg1;
                    class617.field9068 = arg2;
                    class382.field5791 = 0;
                    class280 var21 = class610.method4508(class655.field9465, class279.field4190, (byte) -82);
                    var21.field4197.method1418((byte) -123, var5 + class281.field4219);
                    var21.field4197.method1410(class597.field8749.method89(false, 82) ? 1 : 0, 26913);
                    var21.field4197.method1440((int) (var9 >>> 32) & Integer.MAX_VALUE, (byte) -35);
                    var21.field4197.method1446(class494.field7101 + var4, (byte) 98);
                    class106.method934((byte) 53, var21);
                    class709.method5170(var5, var4, false, var9);
                }
                if (var6 == 9) {
                    class617.field9068 = arg2;
                    class597.field8779 = arg1;
                    class382.field5791 = 0;
                    class245.field3753 = 2;
                    class492.field7059++;
                    class280 var22 = class610.method4508(class606.field8873, class279.field4190, (byte) -99);
                    var22.field4197.method1412(true, class173.field2406);
                    var22.field4197.method1418((byte) -109, class547.field8162);
                    var22.field4197.method1406(class729.field10569, 380332136);
                    var22.field4197.method1428((byte) -24, class597.field8749.method89(false, 82) ? 1 : 0);
                    var22.field4197.method1440(class225.field3446.field3780, (byte) -35);
                    class106.method934((byte) 53, var22);
                }
                if (var6 == 59) {
                    class726 var23 = class197.field2685[var8];
                    if (var23 != null) {
                        class597.field8779 = arg1;
                        class245.field3753 = 2;
                        class685.field9940++;
                        class617.field9068 = arg2;
                        class382.field5791 = 0;
                        class280 var24 = class610.method4508(class517.field7478, class279.field4190, (byte) -86);
                        var24.field4197.method1428((byte) -24, class597.field8749.method89(false, 82) ? 1 : 0);
                        var24.field4197.method1446(var8, (byte) 98);
                        class106.method934((byte) 53, var24);
                        class471.method3582(true, 0, var23.field3863[0], 1, -2, var23.field3859[0], 0, var23.method2101(31463), var23.method2101(31463));
                    }
                }
                if (var6 == 44) {
                    class617.field9068 = arg2;
                    class597.field8779 = arg1;
                    class382.field5791 = 0;
                    class245.field3753 = 2;
                    class313.field4955++;
                    class280 var25 = class610.method4508(class101.field1117, class279.field4190, (byte) -67);
                    var25.field4197.method1457(128, class597.field8749.method89(false, 82) ? 1 : 0);
                    var25.field4197.method1406(class281.field4219 + var5, 380332136);
                    var25.field4197.method1446(var8, (byte) 98);
                    var25.field4197.method1440(class494.field7101 + var4, (byte) -35);
                    class106.method934((byte) 53, var25);
                    class28.method192(-39, var4, var5);
                }
                if (var6 == 6) {
                    if (class757.field10995 > 0 && class597.field8749.method89(false, 82) && class597.field8749.method89(false, 81)) {
                        class385.method3075(1, class225.field3446.field6200, class281.field4219 + var5, class494.field7101 + var4);
                    } else {
                        class358.field5484++;
                        class245.field3753 = 1;
                        class382.field5791 = 0;
                        class597.field8779 = arg1;
                        class617.field9068 = arg2;
                        class280 var26 = class610.method4508(class532.field7810, class279.field4190, (byte) 70);
                        var26.field4197.method1406(class281.field4219 + var5, 380332136);
                        var26.field4197.method1418((byte) -122, class494.field7101 + var4);
                        class106.method934((byte) 53, var26);
                    }
                }
                if (var6 == 1009) {
                    class245.field3753 = 2;
                    class426.field6274++;
                    class617.field9068 = arg2;
                    class597.field8779 = arg1;
                    class382.field5791 = 0;
                    class280 var27 = class610.method4508(class484.field6991, class279.field4190, (byte) 62);
                    var27.field4197.method1406(var8, 380332136);
                    class106.method934((byte) 53, var27);
                }
                if (var6 == 11) {
                    class597.field8779 = arg1;
                    class429.field6325++;
                    class382.field5791 = 0;
                    class245.field3753 = 1;
                    class617.field9068 = arg2;
                    class280 var28 = class610.method4508(class511.field7356, class279.field4190, (byte) -78);
                    var28.field4197.method1440(class547.field8162, (byte) -35);
                    var28.field4197.method1416(-2804, class173.field2406);
                    var28.field4197.method1406(class281.field4219 + var5, 380332136);
                    var28.field4197.method1418((byte) -103, class729.field10569);
                    var28.field4197.method1406(class494.field7101 + var4, 380332136);
                    class106.method934((byte) 53, var28);
                    class471.method3582(true, 0, var5, 1, -4, var4, 0, 1, 1);
                }
                if (var6 == 45) {
                    class726 var29 = class197.field2685[var8];
                    if (var29 != null) {
                        class546.field8152++;
                        class245.field3753 = 2;
                        class597.field8779 = arg1;
                        class382.field5791 = 0;
                        class617.field9068 = arg2;
                        class280 var30 = class610.method4508(class36.field412, class279.field4190, (byte) 7);
                        var30.field4197.method1428((byte) -24, class597.field8749.method89(false, 82) ? 1 : 0);
                        var30.field4197.method1446(var8, (byte) 98);
                        class106.method934((byte) 53, var30);
                        class471.method3582(true, 0, var29.field3863[0], 1, -2, var29.field3859[0], 0, var29.method2101(31463), var29.method2101(31463));
                    }
                }
                if (var6 == 48) {
                    class383 var31 = (class383) class207.field3184.method977((long) var8, 1);
                    if (var31 != null) {
                        class415.field6115++;
                        class245.field3753 = 2;
                        class612 var32 = var31.field5799;
                        class617.field9068 = arg2;
                        class597.field8779 = arg1;
                        class382.field5791 = 0;
                        class280 var33 = class610.method4508(class74.field858, class279.field4190, (byte) -65);
                        var33.field4197.method1446(var8, (byte) 98);
                        var33.field4197.method1428((byte) -24, class597.field8749.method89(false, 82) ? 1 : 0);
                        class106.method934((byte) 53, var33);
                        class471.method3582(true, 0, var32.field3863[0], 1, -2, var32.field3859[0], 0, var32.method2101(31463), var32.method2101(31463));
                    }
                }
                if (var6 == 52 || var6 == 1004) {
                    class663.method4861(arg0.field6149, var5, var4, var8, 9);
                }
                if (var6 == 60) {
                    class383 var34 = (class383) class207.field3184.method977((long) var8, 1);
                    if (var34 != null) {
                        class245.field3753 = 2;
                        class597.field8779 = arg1;
                        class612 var35 = var34.field5799;
                        class617.field9068 = arg2;
                        class396.field5918++;
                        class382.field5791 = 0;
                        class280 var36 = class610.method4508(class101.field1113, class279.field4190, (byte) -128);
                        var36.field4197.method1406(var8, 380332136);
                        var36.field4197.method1430(false, class597.field8749.method89(false, 82) ? 1 : 0);
                        class106.method934((byte) 53, var36);
                        class471.method3582(true, 0, var35.field3863[0], 1, -2, var35.field3859[0], 0, var35.method2101(31463), var35.method2101(31463));
                    }
                }
                if (var6 == 46) {
                    class541 var37 = class211.method1854(var5, var4, false);
                    if (var37 != null) {
                        class431.method3305(-1);
                        class469 var38 = client.method2670(var37);
                        class209.method1839(var38.field6817, false, var37, var38.method3564(122));
                        class10.field116 = class745.method5431(-1, var37);
                        if (class10.field116 == null) {
                            class10.field116 = field7632[3];
                        }
                        class740.field10757 = var37.field7985 + field7632[5];
                    }
                } else {
                    if (var6 == 12) {
                        if (class757.field10995 > 0 && class597.field8749.method89(false, 82) && class597.field8749.method89(false, 81)) {
                            class385.method3075(1, class225.field3446.field6200, class281.field4219 + var5, class494.field7101 + var4);
                        } else {
                            class280 var39 = class415.method3220(var4, var5, 1, var8);
                            if (var8 == 1) {
                                var39.field4197.method1428((byte) -24, -1);
                                var39.field4197.method1428((byte) -24, -1);
                                var39.field4197.method1406((int) class377.field5748, 380332136);
                                var39.field4197.method1428((byte) -24, 57);
                                var39.field4197.method1428((byte) -24, class550.field8201);
                                var39.field4197.method1428((byte) -24, class681.field9866);
                                var39.field4197.method1428((byte) -24, 89);
                                var39.field4197.method1406(class225.field3446.field6197, 380332136);
                                var39.field4197.method1406(class225.field3446.field6211, 380332136);
                                var39.field4197.method1428((byte) -24, 63);
                            } else {
                                class597.field8779 = arg1;
                                class245.field3753 = 1;
                                class382.field5791 = 0;
                                class617.field9068 = arg2;
                            }
                            class106.method934((byte) 53, var39);
                            class471.method3582(true, 0, var5, 1, -4, var4, 0, 1, 1);
                        }
                    }
                    if (var6 == 17) {
                        class541 var40 = class211.method1854(var5, var4, false);
                        if (var40 != null) {
                            class377.method3037(var40, (byte) -53);
                        }
                    }
                    if (var6 == 1007) {
                        class245.field3753 = 2;
                        class597.field8779 = arg1;
                        class382.field5791 = 0;
                        class617.field9068 = arg2;
                        class383 var41 = (class383) class207.field3184.method977((long) var8, 1);
                        if (var41 != null) {
                            class612 var42 = var41.field5799;
                            class496 var43 = var42.field8947;
                            if (var43.field7110 != null) {
                                var43 = var43.method3742(-1, class276.field4168);
                            }
                            if (var43 != null) {
                                class597.field8764++;
                                class280 var44 = class610.method4508(class545.field8143, class279.field4190, (byte) -88);
                                var44.field4197.method1406(var43.field7177, 380332136);
                                class106.method934((byte) 53, var44);
                            }
                        }
                    }
                    if (var6 == 58) {
                        class597.field8779 = arg1;
                        class478.field6957++;
                        class617.field9068 = arg2;
                        class245.field3753 = 2;
                        class382.field5791 = 0;
                        class280 var45 = class610.method4508(class150.field1856, class279.field4190, (byte) 73);
                        var45.field4197.method1428((byte) -24, class597.field8749.method89(false, 82) ? 1 : 0);
                        var45.field4197.method1446(class494.field7101 + var4, (byte) 98);
                        var45.field4197.method1446(class281.field4219 + var5, (byte) 98);
                        var45.field4197.method1446(var8, (byte) 98);
                        class106.method934((byte) 53, var45);
                        class28.method192(-39, var4, var5);
                    }
                    if (var6 == 2) {
                        class726 var46 = class197.field2685[var8];
                        if (var46 != null) {
                            class157.field1947++;
                            class617.field9068 = arg2;
                            class382.field5791 = 0;
                            class245.field3753 = 2;
                            class597.field8779 = arg1;
                            class280 var47 = class610.method4508(class85.field945, class279.field4190, (byte) -93);
                            var47.field4197.method1418((byte) -104, var8);
                            var47.field4197.method1457(128, class597.field8749.method89(false, 82) ? 1 : 0);
                            class106.method934((byte) 53, var47);
                            class471.method3582(true, 0, var46.field3863[0], 1, -2, var46.field3859[0], 0, var46.method2101(31463), var46.method2101(31463));
                        }
                    }
                    if (var6 == 50) {
                        class383 var48 = (class383) class207.field3184.method977((long) var8, 1);
                        if (var48 != null) {
                            class167.field2304++;
                            class617.field9068 = arg2;
                            class612 var49 = var48.field5799;
                            class245.field3753 = 2;
                            class382.field5791 = 0;
                            class597.field8779 = arg1;
                            class280 var50 = class610.method4508(class785.field11441, class279.field4190, (byte) -90);
                            var50.field4197.method1457(128, class597.field8749.method89(false, 82) ? 1 : 0);
                            var50.field4197.method1446(var8, (byte) 98);
                            class106.method934((byte) 53, var50);
                            class471.method3582(true, 0, var49.field3863[0], 1, -2, var49.field3859[0], 0, var49.method2101(31463), var49.method2101(31463));
                        }
                    }
                    if (var6 == 13) {
                        class726 var51 = class197.field2685[var8];
                        if (var51 != null) {
                            class617.field9068 = arg2;
                            class245.field3753 = 2;
                            class597.field8779 = arg1;
                            class492.field7059++;
                            class382.field5791 = 0;
                            class280 var52 = class610.method4508(class606.field8873, class279.field4190, (byte) 6);
                            var52.field4197.method1412(true, class173.field2406);
                            var52.field4197.method1418((byte) -119, class547.field8162);
                            var52.field4197.method1406(class729.field10569, 380332136);
                            var52.field4197.method1428((byte) -24, class597.field8749.method89(false, 82) ? 1 : 0);
                            var52.field4197.method1440(var8, (byte) -35);
                            class106.method934((byte) 53, var52);
                            class471.method3582(true, 0, var51.field3863[0], 1, -2, var51.field3859[0], 0, var51.method2101(31463), var51.method2101(31463));
                        }
                    }
                    if (var6 == 3) {
                        class617.field9068 = arg2;
                        class597.field8779 = arg1;
                        class382.field5791 = 0;
                        class295.field4348++;
                        class245.field3753 = 2;
                        class280 var53 = class610.method4508(class222.field3407, class279.field4190, (byte) 122);
                        var53.field4197.method1446(class494.field7101 + var4, (byte) 98);
                        var53.field4197.method1440(var5 + class281.field4219, (byte) -35);
                        var53.field4197.method1418((byte) -116, (int) (var9 >>> 32) & Integer.MAX_VALUE);
                        var53.field4197.method1428((byte) -24, class597.field8749.method89(false, 82) ? 1 : 0);
                        class106.method934((byte) 53, var53);
                        class709.method5170(var5, var4, false, var9);
                    }
                    if (var6 == 8) {
                        class726 var54 = class197.field2685[var8];
                        if (var54 != null) {
                            class107.field1249++;
                            class382.field5791 = 0;
                            class617.field9068 = arg2;
                            class597.field8779 = arg1;
                            class245.field3753 = 2;
                            class280 var55 = class610.method4508(class456.field6645, class279.field4190, (byte) 100);
                            var55.field4197.method1430(false, class597.field8749.method89(false, 82) ? 1 : 0);
                            var55.field4197.method1406(var8, 380332136);
                            class106.method934((byte) 53, var55);
                            class471.method3582(true, 0, var54.field3863[0], 1, -2, var54.field3859[0], 0, var54.method2101(31463), var54.method2101(31463));
                        }
                    }
                    if (var6 == 5) {
                        class383 var56 = (class383) class207.field3184.method977((long) var8, 1);
                        if (var56 != null) {
                            class612 var57 = var56.field5799;
                            class617.field9068 = arg2;
                            class382.field5791 = 0;
                            class245.field3753 = 2;
                            class597.field8779 = arg1;
                            class457.field6658++;
                            class280 var58 = class610.method4508(class470.field6821, class279.field4190, (byte) -103);
                            var58.field4197.method1410(class597.field8749.method89(false, 82) ? 1 : 0, 26913);
                            var58.field4197.method1406(var8, 380332136);
                            class106.method934((byte) 53, var58);
                            class471.method3582(true, 0, var57.field3863[0], 1, -2, var57.field3859[0], 0, var57.method2101(31463), var57.method2101(31463));
                        }
                    }
                    if (var6 == 51) {
                        class627.field9185++;
                        class382.field5791 = 0;
                        class617.field9068 = arg2;
                        class245.field3753 = 2;
                        class597.field8779 = arg1;
                        class280 var59 = class610.method4508(class31.field365, class279.field4190, (byte) -102);
                        var59.field4197.method1440(class494.field7101 + var4, (byte) -35);
                        var59.field4197.method1418((byte) -114, (int) (var9 >>> 32) & Integer.MAX_VALUE);
                        var59.field4197.method1418((byte) -119, class729.field10569);
                        var59.field4197.method1461(67, class173.field2406);
                        var59.field4197.method1418((byte) -121, class281.field4219 + var5);
                        var59.field4197.method1430(false, class597.field8749.method89(false, 82) ? 1 : 0);
                        var59.field4197.method1446(class547.field8162, (byte) 98);
                        class106.method934((byte) 53, var59);
                        class709.method5170(var5, var4, false, var9);
                    }
                    if (var6 == 49) {
                        class288.field4277++;
                        class245.field3753 = 2;
                        class382.field5791 = 0;
                        class617.field9068 = arg2;
                        class597.field8779 = arg1;
                        class280 var60 = class610.method4508(class733.field10639, class279.field4190, (byte) 76);
                        var60.field4197.method1440(class281.field4219 + var5, (byte) -35);
                        var60.field4197.method1406(var8, 380332136);
                        var60.field4197.method1446(class494.field7101 + var4, (byte) 98);
                        var60.field4197.method1410(class597.field8749.method89(false, 82) ? 1 : 0, 26913);
                        class106.method934((byte) 53, var60);
                        class28.method192(-39, var4, var5);
                    }
                    if (var6 == 10) {
                        class383 var61 = (class383) class207.field3184.method977((long) var8, 1);
                        if (var61 != null) {
                            class298.field4699++;
                            class597.field8779 = arg1;
                            class617.field9068 = arg2;
                            class382.field5791 = 0;
                            class612 var62 = var61.field5799;
                            class245.field3753 = 2;
                            class280 var63 = class610.method4508(class297.field4679, class279.field4190, (byte) 21);
                            var63.field4197.method1440(class729.field10569, (byte) -35);
                            var63.field4197.method1428((byte) -24, class597.field8749.method89(false, 82) ? 1 : 0);
                            var63.field4197.method1416(-2804, class173.field2406);
                            var63.field4197.method1446(class547.field8162, (byte) 98);
                            var63.field4197.method1406(var8, 380332136);
                            class106.method934((byte) 53, var63);
                            class471.method3582(true, 0, var62.field3863[0], 1, -2, var62.field3859[0], 0, var62.method2101(31463), var62.method2101(31463));
                        }
                    }
                    if (var6 == 23) {
                        class726 var64 = class197.field2685[var8];
                        if (var64 != null) {
                            class597.field8779 = arg1;
                            class617.field9068 = arg2;
                            class382.field5791 = 0;
                            class671.field9746++;
                            class245.field3753 = 2;
                            class280 var65 = class610.method4508(class93.field1053, class279.field4190, (byte) -87);
                            var65.field4197.method1457(128, class597.field8749.method89(false, 82) ? 1 : 0);
                            var65.field4197.method1446(var8, (byte) 98);
                            class106.method934((byte) 53, var65);
                            class471.method3582(true, 0, var64.field3863[0], 1, -2, var64.field3859[0], 0, var64.method2101(31463), var64.method2101(31463));
                        }
                    }
                    if (var6 == 47 && class502.field7260 == null) {
                        class586.method4372(var5, var4, 0);
                        class502.field7260 = class211.method1854(var5, var4, false);
                        class115.method1013(true, class502.field7260);
                    }
                    if (var6 == 4) {
                        class726 var66 = class197.field2685[var8];
                        if (var66 != null) {
                            class617.field9068 = arg2;
                            class245.field3753 = 2;
                            class90.field1030++;
                            class382.field5791 = 0;
                            class597.field8779 = arg1;
                            class280 var67 = class610.method4508(class680.field9860, class279.field4190, (byte) -85);
                            var67.field4197.method1428((byte) -24, class597.field8749.method89(false, 82) ? 1 : 0);
                            var67.field4197.method1440(var8, (byte) -35);
                            class106.method934((byte) 53, var67);
                            class471.method3582(true, 0, var66.field3863[0], 1, -2, var66.field3859[0], 0, var66.method2101(31463), var66.method2101(31463));
                        }
                    }
                    if (var6 == 18) {
                        class597.field8779 = arg1;
                        class245.field3753 = 2;
                        class666.field9686++;
                        class617.field9068 = arg2;
                        class382.field5791 = 0;
                        class280 var68 = class610.method4508(class319.field5050, class279.field4190, (byte) -81);
                        var68.field4197.method1428((byte) -24, class597.field8749.method89(false, 82) ? 1 : 0);
                        var68.field4197.method1440(var8, (byte) -35);
                        var68.field4197.method1440(class494.field7101 + var4, (byte) -35);
                        var68.field4197.method1446(class281.field4219 + var5, (byte) 98);
                        class106.method934((byte) 53, var68);
                        class28.method192(-39, var4, var5);
                    }
                    if (var6 == 1003) {
                        class617.field9068 = arg2;
                        class173.field2405++;
                        class597.field8779 = arg1;
                        class382.field5791 = 0;
                        class245.field3753 = 2;
                        class280 var69 = class610.method4508(class183.field2530, class279.field4190, (byte) -77);
                        var69.field4197.method1406(var8, 380332136);
                        class106.method934((byte) 53, var69);
                    }
                    if (var6 == 30) {
                        class382.field5791 = 0;
                        class597.field8779 = arg1;
                        class245.field3753 = 2;
                        class265.field4052++;
                        class617.field9068 = arg2;
                        class280 var70 = class610.method4508(class55.field601, class279.field4190, (byte) 90);
                        var70.field4197.method1440(class729.field10569, (byte) -35);
                        var70.field4197.method1406(var8, 380332136);
                        var70.field4197.method1440(class547.field8162, (byte) -35);
                        var70.field4197.method1406(class281.field4219 + var5, 380332136);
                        var70.field4197.method1440(class494.field7101 + var4, (byte) -35);
                        var70.field4197.method1412(true, class173.field2406);
                        var70.field4197.method1430(false, class597.field8749.method89(false, 82) ? 1 : 0);
                        class106.method934((byte) 53, var70);
                        class28.method192(-39, var4, var5);
                    }
                    if (var6 == 57) {
                        class617.field9068 = arg2;
                        class640.field9290++;
                        class382.field5791 = 0;
                        class597.field8779 = arg1;
                        class245.field3753 = 2;
                        class280 var71 = class610.method4508(class127.field1497, class279.field4190, (byte) -124);
                        var71.field4197.method1418((byte) -118, class281.field4219 + var5);
                        var71.field4197.method1446(var8, (byte) 98);
                        var71.field4197.method1430(false, class597.field8749.method89(false, 82) ? 1 : 0);
                        var71.field4197.method1418((byte) -101, class494.field7101 + var4);
                        class106.method934((byte) 53, var71);
                        class28.method192(-39, var4, var5);
                    }
                    if (var6 == 25) {
                        class726 var72 = class197.field2685[var8];
                        if (var72 != null) {
                            class617.field9068 = arg2;
                            class382.field5791 = 0;
                            class245.field3753 = 2;
                            class597.field8779 = arg1;
                            class546.field8152++;
                            class280 var73 = class610.method4508(class157.field1959, class279.field4190, (byte) 15);
                            var73.field4197.method1446(var8, (byte) 98);
                            var73.field4197.method1428((byte) -24, class597.field8749.method89(false, 82) ? 1 : 0);
                            class106.method934((byte) 53, var73);
                            class471.method3582(true, 0, var72.field3863[0], 1, -2, var72.field3859[0], 0, var72.method2101(31463), var72.method2101(31463));
                        }
                    }
                    if (var6 == 19) {
                        class726 var74 = class197.field2685[var8];
                        if (var74 != null) {
                            class597.field8779 = arg1;
                            class245.field3753 = 2;
                            class617.field9068 = arg2;
                            class382.field5791 = 0;
                            class309.field4846++;
                            class280 var75 = class610.method4508(class597.field8782, class279.field4190, (byte) -111);
                            var75.field4197.method1446(var8, (byte) 98);
                            var75.field4197.method1410(class597.field8749.method89(false, 82) ? 1 : 0, 26913);
                            class106.method934((byte) 53, var75);
                            class471.method3582(true, 0, var74.field3863[0], 1, -2, var74.field3859[0], 0, var74.method2101(31463), var74.method2101(31463));
                        }
                    }
                    if (class728.field10555) {
                        class431.method3305(-1);
                    }
                    if (class181.field2504 != null && class770.field11157 == 0) {
                        class115.method1013(true, class181.field2504);
                    }
                }
            }
        } catch (RuntimeException var77) {
            throw class759.method5498(var77, field7632[4] + (arg0 == null ? field7632[6] : field7632[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class521(int arg0, String arg1, int arg2, String arg3, long arg4) {
        try {
            this.field7625 = arg2;
            this.field7629 = arg4;
            this.field7628 = arg3;
            this.field7627 = arg1;
            this.field7624 = arg0;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field7632[7] + arg0 + ',' + (arg1 == null ? field7632[6] : field7632[2]) + ',' + arg2 + ',' + (arg3 == null ? field7632[6] : field7632[2]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3960(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x54);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3961(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 25;
                    break;
                case 1:
                    var10005 = 27;
                    break;
                case 2:
                    var10005 = 7;
                    break;
                case 3:
                    var10005 = 124;
                    break;
                default:
                    var10005 = 84;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
