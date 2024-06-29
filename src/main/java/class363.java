import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class363 extends class117 {

    @OriginalMember(owner = "client!hr", name = "I", descriptor = "Lwq;")
    public class113 field5456;

    @OriginalMember(owner = "client!hr", name = "E", descriptor = "Law;")
    public class53 field5453;

    @OriginalMember(owner = "client!hr", name = "y", descriptor = "I")
    public int field5448;

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "I")
    public int field5449;

    @OriginalMember(owner = "client!hr", name = "A", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!hr", name = "B", descriptor = "I")
    public int field5451;

    @OriginalMember(owner = "client!hr", name = "C", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!hr", name = "F", descriptor = "I")
    public int field5454;

    @OriginalMember(owner = "client!hr", name = "G", descriptor = "I")
    public int field5455;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(B)V")
    public final void method2330(byte arg0) {
        if (arg0 != 79) {
            method2331(null, null);
        }
        this.field5451 = this.field5456.field1788;
        field5450++;
        this.field5449 = this.field5456.field1787;
        this.field5454 = this.field5456.field1790;
        if (this.field5456.field1799 != null) {
            this.field5456.field1799.method993(this.field5453.field790, this.field5453.field787, this.field5453.field771, class88.field1485);
        }
        this.field5455 = class88.field1485[2];
        this.field5448 = class88.field1485[0];
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lat;Lkf;)V")
    public static final void method2331(class255 arg0, class165 arg1) {
        if (!arg1.field2492) {
            return;
        }
        short var2 = arg1.field2474;
        short var3 = arg1.field2481;
        byte var4 = arg1.field2488;
        byte var5 = arg1.field2475;
        int var6 = (var2 << class225.field3278) + class495.field7211;
        int var7 = (var3 << class225.field3278) + class495.field7211;
        class165[][] var8 = class36.field545[var4];
        float var9;
        if (class62.field1063 == class529.field7807) {
            class44.field675.method536(class145.field2135[0].method273(var6, var7), class256.method1628(var2, var3), class97.method768(var2, var3), class279.method1772(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class44.field675.method514(3000.0F, var9 * 1.5F);
        if (arg1.field2495) {
            if (class511.field7548) {
                if (var4 > 0) {
                    class165 var10 = class36.field545[var4 - 1][var2][var3];
                    if (var10 != null && var10.field2492) {
                        return;
                    }
                }
                if (var2 <= class97.field1574 && var2 > class54.field792) {
                    class165 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field2492 && (var11.field2495 || (arg1.field2485 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class97.field1574 && var2 < class227.field3318 - 1) {
                    class165 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field2492 && (var12.field2495 || (arg1.field2485 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class105.field1653 && var3 > class354.field5347) {
                    class165 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field2492 && (var13.field2495 || (arg1.field2485 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class105.field1653 && var3 < class172.field2576 - 1) {
                    class165 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field2492 && (var14.field2495 || (arg1.field2485 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class511.field7548 = true;
            }
            arg1.field2495 = false;
            if (arg1.field2477 != null) {
                class165 var15 = arg1.field2477;
                class44.field675.method514(3000.0F, (201.5F - (float) (var15.field2475 + 1) * 50.0F) * 1.5F);
                if (!class170.method1208(var15.field2475, var2, var3)) {
                    class529.field7807[var15.field2475].method279(var2, var3);
                }
                class524 var16 = var15.field2480;
                if (var16 != null) {
                    if (class485.field7099) {
                        if ((var16.field7701 & arg1.field2494) == 0) {
                            class311.method1946(arg0, var4, var2, var3);
                        } else {
                            class231.method1506(arg0, var16.field7701, var5, var2, var3);
                        }
                        class44.field675.method464(arg0.field3686, arg0.field3682);
                    }
                    var16.method114(-6796, class44.field675);
                }
                for (class525 var17 = var15.field2490; var17 != null; var17 = var17.field7716) {
                    class370 var18 = var17.field7711;
                    if (var18 != null) {
                        if (class485.field7099) {
                            class311.method1946(arg0, var4, var2, var3);
                            class44.field675.method464(arg0.field3686, arg0.field3682);
                        }
                        var18.method114(-6796, class44.field675);
                    }
                }
                class44.field675.method514(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class170.method1208(var5, var2, var3);
            if (var19) {
                class529.field7807[var5].method279(var2, var3);
                class311 var20 = arg1.field2487;
                if (var20 != null && var20.field4454) {
                    if (var20.field4449) {
                        class44.field675.method514(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class485.field7099) {
                        class311.method1946(arg0, var4, var2, var3);
                        class44.field675.method464(arg0.field3686, arg0.field3682);
                    }
                    class482 var21 = var20.method114(-6796, class44.field675);
                    if (var21 != null) {
                        var21.field7077 = var20;
                        var21.field7073 = var4;
                        var21.field7071 = var2;
                        var21.field7072 = var3;
                        class263.field3780.method1637((byte) -98, var21);
                    }
                    if (var20.field4449) {
                        class44.field675.method514(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class524 var24 = arg1.field2480;
            class177 var25 = arg1.field2482;
            if (var24 != null || var25 != null) {
                if (class97.field1574 == var2) {
                    var22++;
                } else if (class97.field1574 < var2) {
                    var22 += 2;
                }
                if (class105.field1653 == var3) {
                    var22 += 3;
                } else if (class105.field1653 > var3) {
                    var22 += 6;
                }
                var23 = class20.field291[var22];
                arg1.field2494 = class18.field285[var22];
            }
            if (var24 != null) {
                if ((var24.field7701 & class270.field3924[var22]) == 0) {
                    arg1.field2496 = 0;
                } else if (var24.field7701 == 16) {
                    arg1.field2496 = 3;
                    arg1.field2476 = class261.field3772[var22];
                    arg1.field2491 = (byte) (3 - arg1.field2476);
                } else if (var24.field7701 == 32) {
                    arg1.field2496 = 6;
                    arg1.field2476 = class180.field2733[var22];
                    arg1.field2491 = (byte) (6 - arg1.field2476);
                } else if (var24.field7701 == 64) {
                    arg1.field2496 = 12;
                    arg1.field2476 = class180.field2732[var22];
                    arg1.field2491 = (byte) (12 - arg1.field2476);
                } else {
                    arg1.field2496 = 9;
                    arg1.field2476 = class37.field573[var22];
                    arg1.field2491 = (byte) (9 - arg1.field2476);
                }
                if ((var24.field7701 & var23) != 0 && !class57.method409(var5, var2, var3, var24.field7701)) {
                    if (class485.field7099) {
                        class311.method1946(arg0, var4, var2, var3);
                        class44.field675.method464(arg0.field3686, arg0.field3682);
                    }
                    class482 var26 = var24.method114(-6796, class44.field675);
                    if (var26 != null) {
                        var26.field7077 = var24;
                        var26.field7073 = var4;
                        var26.field7071 = var2;
                        var26.field7072 = var3;
                        class263.field3780.method1637((byte) -82, var26);
                    }
                }
                class524 var27 = arg1.field2484;
                if (var27 != null && (var27.field7701 & var23) != 0 && !class57.method409(var5, var2, var3, var27.field7701)) {
                    if (class485.field7099) {
                        class311.method1946(arg0, var4, var2, var3);
                        class44.field675.method464(arg0.field3686, arg0.field3682);
                    }
                    class482 var28 = var27.method114(-6796, class44.field675);
                    if (var28 != null) {
                        var28.field7077 = var27;
                        var28.field7073 = var4;
                        var28.field7071 = var2;
                        var28.field7072 = var3;
                        class263.field3780.method1637((byte) -61, var28);
                    }
                }
            }
            if (var25 != null && !class156.method1128(var5, var2, var3, var25.method1264(false))) {
                class177 var29 = arg1.field2493;
                class44.field675.method514(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field2692 & var23) != 0) {
                    if (class485.field7099) {
                        class311.method1946(arg0, var4, var2, var3);
                        class44.field675.method464(arg0.field3686, arg0.field3682);
                    }
                    class482 var30 = var25.method114(-6796, class44.field675);
                    if (var30 != null) {
                        var30.field7077 = var25;
                        var30.field7073 = var4;
                        var30.field7071 = var2;
                        var30.field7072 = var3;
                        class263.field3780.method1637((byte) -112, var30);
                    }
                } else if (var25.field2692 == 256) {
                    int var31 = var25.field2688 - class466.field6858;
                    int var32 = var25.field2683 - class504.field7401;
                    int var33 = var25.field2680;
                    int var34;
                    if (var33 == 1 || var33 == 2) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    int var35;
                    if (var33 == 2 || var33 == 3) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    if (class485.field7099) {
                        class311.method1946(arg0, var4, var2, var3);
                        class44.field675.method464(arg0.field3686, arg0.field3682);
                    }
                    if (var35 < var34) {
                        class482 var36 = var25.method114(-6796, class44.field675);
                        if (var36 != null) {
                            var36.field7077 = var25;
                            var36.field7073 = var4;
                            var36.field7071 = var2;
                            var36.field7072 = var3;
                            class263.field3780.method1637((byte) -74, var36);
                        }
                    } else if (var29 != null) {
                        class482 var37 = var29.method114(-6796, class44.field675);
                        if (var37 != null) {
                            var37.field7077 = var29;
                            var37.field7073 = var4;
                            var37.field7071 = var2;
                            var37.field7072 = var3;
                            class263.field3780.method1637((byte) -113, var37);
                        }
                    }
                }
                class44.field675.method514(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class311 var38 = arg1.field2487;
                if (var38 != null && !var38.field4454) {
                    if (var38.field4449) {
                        class44.field675.method514(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class485.field7099) {
                        class311.method1946(arg0, var4, var2, var3);
                        class44.field675.method464(arg0.field3686, arg0.field3682);
                    }
                    class482 var39 = var38.method114(-6796, class44.field675);
                    if (var39 != null) {
                        var39.field7077 = var38;
                        var39.field7073 = var4;
                        var39.field7071 = var2;
                        var39.field7072 = var3;
                        class263.field3780.method1637((byte) -72, var39);
                    }
                    if (var38.field4449) {
                        class44.field675.method514(3000.0F, var9 * 1.5F);
                    }
                }
                class438 var40 = arg1.field2489;
                if (var40 != null && !var40.field6386) {
                    if (class485.field7099) {
                        class311.method1946(arg0, var4, var2, var3);
                        class44.field675.method464(arg0.field3686, arg0.field3682);
                    }
                    class482 var41 = var40.method114(-6796, class44.field675);
                    if (var41 != null) {
                        var41.field7077 = var40;
                        var41.field7073 = var4;
                        var41.field7071 = var2;
                        var41.field7072 = var3;
                        class263.field3780.method1637((byte) -108, var41);
                    }
                }
            }
            byte var42 = arg1.field2485;
            if (var42 != 0) {
                if (var2 < class97.field1574 && (var42 & 0x4) != 0) {
                    class165 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field2492) {
                        class274.field3957.method2205(var43, 112);
                    }
                }
                if (var3 < class105.field1653 && (var42 & 0x2) != 0) {
                    class165 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field2492) {
                        class274.field3957.method2205(var44, 35);
                    }
                }
                if (var2 > class97.field1574 && (var42 & 0x1) != 0) {
                    class165 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field2492) {
                        class274.field3957.method2205(var45, 81);
                    }
                }
                if (var3 > class105.field1653 && (var42 & 0x8) != 0) {
                    class165 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field2492) {
                        class274.field3957.method2205(var46, 127);
                    }
                }
            }
        }
        if (arg1.field2496 != 0) {
            boolean var47 = true;
            for (class525 var48 = arg1.field2490; var48 != null; var48 = var48.field7716) {
                if (class12.field196 != var48.field7711.field5541 && (var48.field7712 & arg1.field2496) == arg1.field2476) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class524 var49 = arg1.field2480;
                if (!class57.method409(var5, var2, var3, var49.field7701)) {
                    if (class485.field7099) {
                        label682: {
                            if (var49.field7701 >= 16) {
                                int var50 = var2 - class97.field1574;
                                int var51 = var3 - class105.field1653;
                                if (var49.field7701 == 16) {
                                    int var52 = var50 - class495.field7211;
                                    int var53 = class495.field7211 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class254.field3675) {
                                        class311.method1946(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field7701 == 32) {
                                    int var54 = class495.field7211 + var50;
                                    int var55 = class495.field7211 + var51;
                                    if (var55 < -var54 && var2 < class246.field3560 && var3 < class254.field3675) {
                                        class311.method1946(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field7701 == 64) {
                                    int var56 = class495.field7211 + var50;
                                    int var57 = var51 - class495.field7211;
                                    if (var57 > var56 && var2 < class246.field3560 && var3 > 0) {
                                        class311.method1946(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field7701 == 128) {
                                    int var58 = var50 - class495.field7211;
                                    int var59 = var51 - class495.field7211;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class311.method1946(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class311.method1946(arg0, var4, var2, var3);
                        }
                        class44.field675.method464(arg0.field3686, arg0.field3682);
                    }
                    class482 var60 = var49.method114(-6796, class44.field675);
                    if (var60 != null) {
                        var60.field7077 = var49;
                        var60.field7073 = var4;
                        var60.field7071 = var2;
                        var60.field7072 = var3;
                        class263.field3780.method1637((byte) -76, var60);
                    }
                }
                arg1.field2496 = 0;
            }
        }
        if (arg1.field2486) {
            try {
                arg1.field2486 = false;
                int var61 = 0;
                label625: for (class525 var62 = arg1.field2490; var62 != null; var62 = var62.field7716) {
                    class370 var63 = var62.field7711;
                    if (class12.field196 != var63.field5541) {
                        for (int var64 = var63.field5532; var64 <= var63.field5542; var64++) {
                            for (int var65 = var63.field5535; var65 <= var63.field5540; var65++) {
                                class165 var66 = var8[var64][var65];
                                if (var66.field2495) {
                                    arg1.field2486 = true;
                                    continue label625;
                                }
                                if (var66.field2496 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field5532) {
                                        var67++;
                                    }
                                    if (var64 < var63.field5542) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field5535) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field5540) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field2496) == arg1.field2491) {
                                        arg1.field2486 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class97.field1574 - var63.field5532;
                        int var69 = var63.field5542 - class97.field1574;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class105.field1653 - var63.field5535;
                        int var71 = var63.field5540 - class105.field1653;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field3680[var61] = var63;
                        arg0.field3684[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class370 var75 = arg0.field3680[var74];
                        if (class12.field196 != var75.field5541) {
                            int var76 = arg0.field3684[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field5529 - class466.field6858;
                                int var78 = var75.field5539 - class504.field7401;
                                int var79 = arg0.field3680[var73].field5529 - class466.field6858;
                                int var80 = arg0.field3680[var73].field5539 - class504.field7401;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class370 var81 = arg0.field3680[var73];
                    var81.field5541 = class12.field196;
                    if (!class53.method382(var5, var81.field5532, var81.field5542, var81.field5535, var81.field5540, var81.method107(false))) {
                        if (class485.field7099) {
                            if (var81.field5536 == 0) {
                                class467.method2782(arg0, var4, var81.field5532, var81.field5535, var81.field5542, var81.field5540);
                            } else {
                                class311.method1946(arg0, var4, var2, var3);
                                int var82 = var2 - class97.field1574;
                                int var83 = var3 - class105.field1653;
                                if (var81.field5536 == 2) {
                                    if (var83 > -var82) {
                                        class295.method1823(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class295.method1823(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class295.method1823(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class295.method1823(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class44.field675.method464(arg0.field3686, arg0.field3682);
                        }
                        class482 var84 = var81.method114(-6796, class44.field675);
                        if (var84 != null) {
                            var84.field7077 = var81;
                            var84.field7073 = var4;
                            var84.field7071 = var81.field5532;
                            var84.field7072 = var81.field5535;
                            class263.field3780.method1637((byte) -114, var84);
                        }
                    }
                    for (int var85 = var81.field5532; var85 <= var81.field5542; var85++) {
                        for (int var86 = var81.field5535; var86 <= var81.field5540; var86++) {
                            class165 var87 = var8[var85][var86];
                            if (var87.field2496 != 0) {
                                class274.field3957.method2205(var87, 36);
                            } else if ((var2 != var85 || var3 != var86) && var87.field2492) {
                                class274.field3957.method2205(var87, 72);
                            }
                        }
                    }
                }
                if (arg1.field2486) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field2486 = false;
            }
        }
        if (arg1.field2478 != null && (byte) (class211.field3054 & 0xFF) == arg1.field2483) {
            class492 var88 = arg1.field2478;
            int var89 = class529.field7807[var4].method271(var2, var3);
            int var90;
            if (var4 < class334.field5130 - 1) {
                var90 = class529.field7807[var4].method271(var2, var3) - class529.field7807[var4 + 1].method271(var2, var3);
            } else {
                var90 = 0x8 << class225.field3278;
            }
            class326.field5047.method997(var6, var89, var7, arg0.field3678);
            int var91 = arg0.field3678[2];
            class326.field5047.method997(var6, var89 - var90, var7, arg0.field3678);
            int var92 = arg0.field3678[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class303.field4349;
            int var96 = class303.field4349 + var94;
            var88.field7183 = var95;
            var88.field7185 = var96;
            var88.field7189 = true;
            class44.field675.method467(var88);
        }
        if (!arg1.field2492) {
            return;
        }
        if (arg1.field2496 != 0) {
            return;
        }
        if (var2 <= class97.field1574 && var2 > class54.field792) {
            class165 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field2492) {
                return;
            }
        }
        if (var2 >= class97.field1574 && var2 < class227.field3318 - 1) {
            class165 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field2492) {
                return;
            }
        }
        if (var3 <= class105.field1653 && var3 > class354.field5347) {
            class165 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field2492) {
                return;
            }
        }
        if (var3 >= class105.field1653 && var3 < class172.field2576 - 1) {
            class165 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field2492) {
                return;
            }
        }
        arg1.field2492 = false;
        class389.field5755--;
        class438 var101 = arg1.field2489;
        if (var101 != null && var101.field6386) {
            if (class485.field7099) {
                class311.method1946(arg0, var4, var2, var3);
                class44.field675.method464(arg0.field3686, arg0.field3682);
            }
            class482 var102 = var101.method114(-6796, class44.field675);
            if (var102 != null) {
                var102.field7077 = var101;
                var102.field7073 = var4;
                var102.field7071 = var2;
                var102.field7072 = var3;
                class263.field3780.method1637((byte) -106, var102);
            }
        }
        if (arg1.field2494 != 0) {
            class177 var103 = arg1.field2482;
            if (var103 != null && !class156.method1128(var5, var2, var3, var103.method1264(false))) {
                if ((var103.field2692 & arg1.field2494) != 0) {
                    if (class485.field7099) {
                        class311.method1946(arg0, var4, var2, var3);
                        class44.field675.method464(arg0.field3686, arg0.field3682);
                    }
                    class482 var104 = var103.method114(-6796, class44.field675);
                    if (var104 != null) {
                        var104.field7077 = var103;
                        var104.field7073 = var4;
                        var104.field7071 = var2;
                        var104.field7072 = var3;
                        class263.field3780.method1637((byte) -80, var104);
                    }
                } else if (var103.field2692 == 256) {
                    int var105 = var103.field2688 - class466.field6858;
                    int var106 = var103.field2683 - class504.field7401;
                    int var107 = var103.field2680;
                    int var108;
                    if (var107 == 1 || var107 == 2) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    int var109;
                    if (var107 == 2 || var107 == 3) {
                        var109 = -var106;
                    } else {
                        var109 = var106;
                    }
                    if (class485.field7099) {
                        class311.method1946(arg0, var4, var2, var3);
                        class44.field675.method464(arg0.field3686, arg0.field3682);
                    }
                    class177 var110 = arg1.field2493;
                    if (var109 > var108) {
                        class482 var111 = var103.method114(-6796, class44.field675);
                        if (var111 != null) {
                            var111.field7077 = var103;
                            var111.field7073 = var4;
                            var111.field7071 = var2;
                            var111.field7072 = var3;
                            class263.field3780.method1637((byte) -99, var111);
                        }
                    } else if (var110 != null) {
                        class482 var112 = var110.method114(-6796, class44.field675);
                        if (var112 != null) {
                            var112.field7077 = var110;
                            var112.field7073 = var4;
                            var112.field7071 = var2;
                            var112.field7072 = var3;
                            class263.field3780.method1637((byte) -117, var112);
                        }
                    }
                }
            }
            class524 var113 = arg1.field2480;
            class524 var114 = arg1.field2484;
            if (var114 != null && (var114.field7701 & arg1.field2494) != 0 && !class57.method409(var5, var2, var3, var114.field7701)) {
                if (class485.field7099) {
                    class231.method1506(arg0, var114.field7701, var4, var2, var3);
                    class44.field675.method464(arg0.field3686, arg0.field3682);
                }
                class482 var115 = var114.method114(-6796, class44.field675);
                if (var115 != null) {
                    var115.field7077 = var114;
                    var115.field7073 = var4;
                    var115.field7071 = var2;
                    var115.field7072 = var3;
                    class263.field3780.method1637((byte) -88, var115);
                }
            }
            if (var113 != null && (var113.field7701 & arg1.field2494) != 0 && !class57.method409(var5, var2, var3, var113.field7701)) {
                if (class485.field7099) {
                    class231.method1506(arg0, var113.field7701, var4, var2, var3);
                    class44.field675.method464(arg0.field3686, arg0.field3682);
                }
                class482 var116 = var113.method114(-6796, class44.field675);
                if (var116 != null) {
                    var116.field7077 = var113;
                    var116.field7073 = var4;
                    var116.field7071 = var2;
                    var116.field7072 = var3;
                    class263.field3780.method1637((byte) -124, var116);
                }
            }
        }
        if (var4 < class334.field5130 - 1) {
            class165 var117 = class36.field545[var4 + 1][var2][var3];
            if (var117 != null && var117.field2492) {
                class274.field3957.method2204(var117, 0);
            }
        }
        if (var2 < class97.field1574) {
            class165 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field2492) {
                class274.field3957.method2205(var118, 101);
            }
        }
        if (var3 < class105.field1653) {
            class165 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field2492) {
                class274.field3957.method2205(var119, 52);
            }
        }
        if (var2 > class97.field1574) {
            class165 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field2492) {
                class274.field3957.method2205(var120, 49);
            }
        }
        if (var3 > class105.field1653) {
            class165 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field2492) {
                class274.field3957.method2205(var121, 52);
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "(B)V")
    public static final void method2332(byte arg0) {
        field5452++;
        int var1 = class333.field5117;
        int[] var2 = class459.field6766;
        for (int var3 = 0; var3 < var1; var3++) {
            class62 var8 = class390.field5783[var2[var3]];
            if (var8 != null && var8.field344 > 0) {
                var8.field344--;
                if (var8.field344 == 0) {
                    var8.field350 = null;
                }
            }
        }
        int var4 = -73 / ((-arg0 - 47) / 61);
        for (int var5 = 0; var5 < class322.field4943; var5++) {
            int var6 = class101.field1623[var5];
            class13 var7 = class132.field2030[var6];
            if (var7 != null && var7.field344 > 0) {
                var7.field344--;
                if (var7.field344 == 0) {
                    var7.field350 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lwq;Lrb;)V")
    public class363(class113 arg0, class234 arg1) {
        this.field5456 = arg0;
        this.field5453 = this.field5456.method839((byte) 48);
        this.method2330((byte) 79);
    }
}
