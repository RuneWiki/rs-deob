import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class class247 {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Leo;")
    public static class443 field3588 = new class443(6, 6);

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lnl;")
    public static class435 field3589;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static void method1703(int arg0) {
        field3589 = null;
        field3588 = null;
        int var1 = -3 / ((arg0 - 20) / 53);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[[BLpg;)V")
    public static final void method1704(int arg0, byte[][] arg1, class454 arg2) {
        int var3 = -111 / ((arg0 + 14) / 55);
        field3590++;
        int var4 = class295.field4169.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = arg1[var5];
            if (var6 != null) {
                int var7 = (class486.field6887[var5] >> 8) * 64 - class279.field4012;
                int var8 = (class486.field6887[var5] & 0xFF) * 64 - class189.field2810;
                class208.method1423((byte) -38);
                arg2.method2733(class300.field4249, class374.field5152, (byte) 92, var6, var8, var7);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lup;Lwr;)V")
    public static final void method1705(class340 arg0, class52 arg1) {
        if (!arg1.field750) {
            return;
        }
        short var2 = arg1.field762;
        short var3 = arg1.field767;
        byte var4 = arg1.field759;
        byte var5 = arg1.field749;
        int var6 = (var2 << class380.field5232) + class289.field4100;
        int var7 = (var3 << class380.field5232) + class289.field4100;
        class52[][] var8 = class385.field5285[var4];
        float var9;
        if (class427.field5960 == class340.field4692) {
            class340.field4702.method423(class190.field2858[0].method590(var6, var7), class46.method476(var2, var3), class193.method1345(var2, var3), class318.method2027(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class340.field4702.method378(3000.0F, var9 * 1.5F);
        if (arg1.field769) {
            if (class412.field5643) {
                if (var4 > 0) {
                    class52 var10 = class385.field5285[var4 - 1][var2][var3];
                    if (var10 != null && var10.field750) {
                        return;
                    }
                }
                if (var2 <= class409.field5607 && var2 > class316.field4461) {
                    class52 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field750 && (var11.field769 || (arg1.field768 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class409.field5607 && var2 < class106.field1497 - 1) {
                    class52 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field750 && (var12.field769 || (arg1.field768 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class54.field811 && var3 > client.field877) {
                    class52 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field750 && (var13.field769 || (arg1.field768 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class54.field811 && var3 < class380.field5224 - 1) {
                    class52 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field750 && (var14.field769 || (arg1.field768 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class412.field5643 = true;
            }
            arg1.field769 = false;
            if (arg1.field757 != null) {
                class52 var15 = arg1.field757;
                class340.field4702.method378(3000.0F, (201.5F - (float) (var15.field749 + 1) * 50.0F) * 1.5F);
                if (!class395.method2385(var15.field749, var2, var3)) {
                    class340.field4692[var15.field749].method588(var2, var3);
                }
                class421 var16 = var15.field772;
                if (var16 != null) {
                    if (class296.field4181) {
                        if ((var16.field5824 & arg1.field771) == 0) {
                            class265.method1789(arg0, var4, var2, var3);
                        } else {
                            class367.method2246(arg0, var16.field5824, var5, var2, var3);
                        }
                        class340.field4702.method439(arg0.field4700, arg0.field4699);
                    }
                    var16.method69(class340.field4702, 10228);
                }
                for (class131 var17 = var15.field763; var17 != null; var17 = var17.field1796) {
                    class325 var18 = var17.field1803;
                    if (var18 != null) {
                        if (class296.field4181) {
                            class265.method1789(arg0, var4, var2, var3);
                            class340.field4702.method439(arg0.field4700, arg0.field4699);
                        }
                        var18.method69(class340.field4702, 10228);
                    }
                }
                class340.field4702.method378(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class395.method2385(var5, var2, var3);
            if (var19) {
                class340.field4692[var5].method588(var2, var3);
                class390 var20 = arg1.field758;
                if (var20 != null && var20.field5389) {
                    if (var20.field5392) {
                        class340.field4702.method378(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class296.field4181) {
                        class265.method1789(arg0, var4, var2, var3);
                        class340.field4702.method439(arg0.field4700, arg0.field4699);
                    }
                    class309 var21 = var20.method69(class340.field4702, 10228);
                    if (var21 != null) {
                        var21.field4382 = var20;
                        var21.field4378 = var4;
                        var21.field4379 = var2;
                        var21.field4384 = var3;
                        class280.field4024.method1765(123, var21);
                    }
                    if (var20.field5392) {
                        class340.field4702.method378(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class421 var24 = arg1.field772;
            class371 var25 = arg1.field755;
            if (var24 != null || var25 != null) {
                if (class409.field5607 == var2) {
                    var22++;
                } else if (class409.field5607 < var2) {
                    var22 += 2;
                }
                if (class54.field811 == var3) {
                    var22 += 3;
                } else if (class54.field811 > var3) {
                    var22 += 6;
                }
                var23 = class7.field51[var22];
                arg1.field771 = class227.field3274[var22];
            }
            if (var24 != null) {
                if ((var24.field5824 & class69.field1008[var22]) == 0) {
                    arg1.field751 = 0;
                } else if (var24.field5824 == 16) {
                    arg1.field751 = 3;
                    arg1.field773 = class33.field344[var22];
                    arg1.field754 = (byte) (3 - arg1.field773);
                } else if (var24.field5824 == 32) {
                    arg1.field751 = 6;
                    arg1.field773 = class74.field1067[var22];
                    arg1.field754 = (byte) (6 - arg1.field773);
                } else if (var24.field5824 == 64) {
                    arg1.field751 = 12;
                    arg1.field773 = class151.field2080[var22];
                    arg1.field754 = (byte) (12 - arg1.field773);
                } else {
                    arg1.field751 = 9;
                    arg1.field773 = class98.field1392[var22];
                    arg1.field754 = (byte) (9 - arg1.field773);
                }
                if ((var24.field5824 & var23) != 0 && !class61.method554(var5, var2, var3, var24.field5824)) {
                    if (class296.field4181) {
                        class265.method1789(arg0, var4, var2, var3);
                        class340.field4702.method439(arg0.field4700, arg0.field4699);
                    }
                    class309 var26 = var24.method69(class340.field4702, 10228);
                    if (var26 != null) {
                        var26.field4382 = var24;
                        var26.field4378 = var4;
                        var26.field4379 = var2;
                        var26.field4384 = var3;
                        class280.field4024.method1765(126, var26);
                    }
                }
                class421 var27 = arg1.field752;
                if (var27 != null && (var27.field5824 & var23) != 0 && !class61.method554(var5, var2, var3, var27.field5824)) {
                    if (class296.field4181) {
                        class265.method1789(arg0, var4, var2, var3);
                        class340.field4702.method439(arg0.field4700, arg0.field4699);
                    }
                    class309 var28 = var27.method69(class340.field4702, 10228);
                    if (var28 != null) {
                        var28.field4382 = var27;
                        var28.field4378 = var4;
                        var28.field4379 = var2;
                        var28.field4384 = var3;
                        class280.field4024.method1765(122, var28);
                    }
                }
            }
            if (var25 != null && !class282.method1875(var5, var2, var3, var25.method803(-15823))) {
                class371 var29 = arg1.field756;
                class340.field4702.method378(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field5104 & var23) != 0) {
                    if (class296.field4181) {
                        class265.method1789(arg0, var4, var2, var3);
                        class340.field4702.method439(arg0.field4700, arg0.field4699);
                    }
                    class309 var30 = var25.method69(class340.field4702, 10228);
                    if (var30 != null) {
                        var30.field4382 = var25;
                        var30.field4378 = var4;
                        var30.field4379 = var2;
                        var30.field4384 = var3;
                        class280.field4024.method1765(120, var30);
                    }
                } else if (var25.field5104 == 256) {
                    int var31 = var25.field5113 - class200.field2966;
                    int var32 = var25.field5112 - class385.field5280;
                    int var33 = var25.field5102;
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
                    if (class296.field4181) {
                        class265.method1789(arg0, var4, var2, var3);
                        class340.field4702.method439(arg0.field4700, arg0.field4699);
                    }
                    if (var35 < var34) {
                        class309 var36 = var25.method69(class340.field4702, 10228);
                        if (var36 != null) {
                            var36.field4382 = var25;
                            var36.field4378 = var4;
                            var36.field4379 = var2;
                            var36.field4384 = var3;
                            class280.field4024.method1765(127, var36);
                        }
                    } else if (var29 != null) {
                        class309 var37 = var29.method69(class340.field4702, 10228);
                        if (var37 != null) {
                            var37.field4382 = var29;
                            var37.field4378 = var4;
                            var37.field4379 = var2;
                            var37.field4384 = var3;
                            class280.field4024.method1765(121, var37);
                        }
                    }
                }
                class340.field4702.method378(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class390 var38 = arg1.field758;
                if (var38 != null && !var38.field5389) {
                    if (var38.field5392) {
                        class340.field4702.method378(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class296.field4181) {
                        class265.method1789(arg0, var4, var2, var3);
                        class340.field4702.method439(arg0.field4700, arg0.field4699);
                    }
                    class309 var39 = var38.method69(class340.field4702, 10228);
                    if (var39 != null) {
                        var39.field4382 = var38;
                        var39.field4378 = var4;
                        var39.field4379 = var2;
                        var39.field4384 = var3;
                        class280.field4024.method1765(119, var39);
                    }
                    if (var38.field5392) {
                        class340.field4702.method378(3000.0F, var9 * 1.5F);
                    }
                }
                class174 var40 = arg1.field748;
                if (var40 != null && !var40.field2648) {
                    if (class296.field4181) {
                        class265.method1789(arg0, var4, var2, var3);
                        class340.field4702.method439(arg0.field4700, arg0.field4699);
                    }
                    class309 var41 = var40.method69(class340.field4702, 10228);
                    if (var41 != null) {
                        var41.field4382 = var40;
                        var41.field4378 = var4;
                        var41.field4379 = var2;
                        var41.field4384 = var3;
                        class280.field4024.method1765(117, var41);
                    }
                }
            }
            byte var42 = arg1.field768;
            if (var42 != 0) {
                if (var2 < class409.field5607 && (var42 & 0x4) != 0) {
                    class52 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field750) {
                        class291.field4124.method139(var43, 0);
                    }
                }
                if (var3 < class54.field811 && (var42 & 0x2) != 0) {
                    class52 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field750) {
                        class291.field4124.method139(var44, 0);
                    }
                }
                if (var2 > class409.field5607 && (var42 & 0x1) != 0) {
                    class52 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field750) {
                        class291.field4124.method139(var45, 0);
                    }
                }
                if (var3 > class54.field811 && (var42 & 0x8) != 0) {
                    class52 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field750) {
                        class291.field4124.method139(var46, 0);
                    }
                }
            }
        }
        if (arg1.field751 != 0) {
            boolean var47 = true;
            for (class131 var48 = arg1.field763; var48 != null; var48 = var48.field1796) {
                if (class196.field2912 != var48.field1803.field4536 && (var48.field1798 & arg1.field751) == arg1.field773) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class421 var49 = arg1.field772;
                if (!class61.method554(var5, var2, var3, var49.field5824)) {
                    if (class296.field4181) {
                        label687: {
                            if (var49.field5824 >= 16) {
                                int var50 = var2 - class409.field5607;
                                int var51 = var3 - class54.field811;
                                if (var49.field5824 == 16) {
                                    int var52 = var50 - class289.field4100;
                                    int var53 = class289.field4100 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class97.field1374) {
                                        class265.method1789(arg0, var4, var2 - 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var49.field5824 == 32) {
                                    int var54 = class289.field4100 + var50;
                                    int var55 = class289.field4100 + var51;
                                    if (var55 < -var54 && var2 < class310.field4401 && var3 < class97.field1374) {
                                        class265.method1789(arg0, var4, var2 + 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var49.field5824 == 64) {
                                    int var56 = class289.field4100 + var50;
                                    int var57 = var51 - class289.field4100;
                                    if (var57 > var56 && var2 < class310.field4401 && var3 > 0) {
                                        class265.method1789(arg0, var4, var2 + 1, var3 - 1);
                                        break label687;
                                    }
                                } else if (var49.field5824 == 128) {
                                    int var58 = var50 - class289.field4100;
                                    int var59 = var51 - class289.field4100;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class265.method1789(arg0, var4, var2 - 1, var3 - 1);
                                        break label687;
                                    }
                                }
                            }
                            class265.method1789(arg0, var4, var2, var3);
                        }
                        class340.field4702.method439(arg0.field4700, arg0.field4699);
                    }
                    class309 var60 = var49.method69(class340.field4702, 10228);
                    if (var60 != null) {
                        var60.field4382 = var49;
                        var60.field4378 = var4;
                        var60.field4379 = var2;
                        var60.field4384 = var3;
                        class280.field4024.method1765(119, var60);
                    }
                }
                arg1.field751 = 0;
            }
        }
        if (arg1.field764) {
            try {
                arg1.field764 = false;
                int var61 = 0;
                label630: for (class131 var62 = arg1.field763; var62 != null; var62 = var62.field1796) {
                    class325 var63 = var62.field1803;
                    if (class196.field2912 != var63.field4536) {
                        for (int var64 = var63.field4535; var64 <= var63.field4526; var64++) {
                            for (int var65 = var63.field4539; var65 <= var63.field4534; var65++) {
                                class52 var66 = var8[var64][var65];
                                if (var66.field769) {
                                    arg1.field764 = true;
                                    continue label630;
                                }
                                if (var66.field751 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field4535) {
                                        var67++;
                                    }
                                    if (var64 < var63.field4526) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field4539) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field4534) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field751) == arg1.field754) {
                                        arg1.field764 = true;
                                        continue label630;
                                    }
                                }
                            }
                        }
                        int var68 = class409.field5607 - var63.field4535;
                        int var69 = var63.field4526 - class409.field5607;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class54.field811 - var63.field4539;
                        int var71 = var63.field4534 - class54.field811;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field4697[var61] = var63;
                        arg0.field4694[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class325 var75 = arg0.field4697[var74];
                        if (class196.field2912 != var75.field4536) {
                            int var76 = arg0.field4694[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field4537 - class200.field2966;
                                int var78 = var75.field4530 - class385.field5280;
                                int var79 = arg0.field4697[var73].field4537 - class200.field2966;
                                int var80 = arg0.field4697[var73].field4530 - class385.field5280;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class325 var81 = arg0.field4697[var73];
                    var81.field4536 = class196.field2912;
                    if (!class265.method1791(var5, var81.field4535, var81.field4526, var81.field4539, var81.field4534, var81.method251((byte) 5))) {
                        if (class296.field4181) {
                            if (var81.field4527 == 0) {
                                class407.method2434(arg0, var4, var81.field4535, var81.field4539, var81.field4526, var81.field4534);
                            } else {
                                class265.method1789(arg0, var4, var2, var3);
                                int var82 = var2 - class409.field5607;
                                int var83 = var3 - class54.field811;
                                if (var81.field4527 == 2) {
                                    if (var83 > -var82) {
                                        class435.method2645(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class435.method2645(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class435.method2645(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class435.method2645(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class340.field4702.method439(arg0.field4700, arg0.field4699);
                        }
                        class309 var84 = var81.method69(class340.field4702, 10228);
                        if (var84 != null) {
                            var84.field4382 = var81;
                            var84.field4378 = var4;
                            var84.field4379 = var81.field4535;
                            var84.field4384 = var81.field4539;
                            class280.field4024.method1765(123, var84);
                        }
                    }
                    for (int var85 = var81.field4535; var85 <= var81.field4526; var85++) {
                        for (int var86 = var81.field4539; var86 <= var81.field4534; var86++) {
                            class52 var87 = var8[var85][var86];
                            if (var87.field751 != 0) {
                                class291.field4124.method139(var87, 0);
                            } else if ((var2 != var85 || var3 != var86) && var87.field750) {
                                class291.field4124.method139(var87, 0);
                            }
                        }
                    }
                }
                if (arg1.field764) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field764 = false;
            }
        }
        if (arg1.field766 != null) {
            if ((byte) (class105.field1472 & 0xFF) == arg1.field765) {
                class404 var88 = arg1.field766;
                int var89 = class340.field4692[var4].method591(var2, var3);
                int var90;
                if (var4 < class310.field4398 - 1) {
                    var90 = class340.field4692[var4].method591(var2, var3) - class340.field4692[var4 + 1].method591(var2, var3);
                } else {
                    var90 = 1024;
                }
                class379.field5217.method108(var6, var89, var7, arg0.field4696);
                int var91 = arg0.field4696[2];
                class379.field5217.method108(var6, var89 - var90, var7, arg0.field4696);
                int var92 = arg0.field4696[2];
                int var93 = var91;
                int var94 = var92;
                if (var91 > var92) {
                    var93 = var92;
                    var94 = var91;
                }
                int var95 = var93 - class165.field2406;
                int var96 = class165.field2406 + var94;
                if (var95 < var96 - 1597) {
                    var95 = var96 - 1597;
                }
                var88.field5529 = var95;
                var88.field5531 = var96;
                var88.field5530 = true;
                class340.field4702.method329(var88);
            } else {
                arg1.field766 = null;
            }
        }
        if (!arg1.field750) {
            return;
        }
        if (arg1.field751 != 0) {
            return;
        }
        if (var2 <= class409.field5607 && var2 > class316.field4461) {
            class52 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field750) {
                return;
            }
        }
        if (var2 >= class409.field5607 && var2 < class106.field1497 - 1) {
            class52 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field750) {
                return;
            }
        }
        if (var3 <= class54.field811 && var3 > client.field877) {
            class52 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field750) {
                return;
            }
        }
        if (var3 >= class54.field811 && var3 < class380.field5224 - 1) {
            class52 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field750) {
                return;
            }
        }
        arg1.field750 = false;
        class466.field6563--;
        class174 var101 = arg1.field748;
        if (var101 != null && var101.field2648) {
            if (class296.field4181) {
                class265.method1789(arg0, var4, var2, var3);
                class340.field4702.method439(arg0.field4700, arg0.field4699);
            }
            class309 var102 = var101.method69(class340.field4702, 10228);
            if (var102 != null) {
                var102.field4382 = var101;
                var102.field4378 = var4;
                var102.field4379 = var2;
                var102.field4384 = var3;
                class280.field4024.method1765(121, var102);
            }
        }
        if (arg1.field771 != 0) {
            class371 var103 = arg1.field755;
            if (var103 != null && !class282.method1875(var5, var2, var3, var103.method803(-15823))) {
                if ((var103.field5104 & arg1.field771) != 0) {
                    if (class296.field4181) {
                        class265.method1789(arg0, var4, var2, var3);
                        class340.field4702.method439(arg0.field4700, arg0.field4699);
                    }
                    class309 var104 = var103.method69(class340.field4702, 10228);
                    if (var104 != null) {
                        var104.field4382 = var103;
                        var104.field4378 = var4;
                        var104.field4379 = var2;
                        var104.field4384 = var3;
                        class280.field4024.method1765(117, var104);
                    }
                } else if (var103.field5104 == 256) {
                    int var105 = var103.field5113 - class200.field2966;
                    int var106 = var103.field5112 - class385.field5280;
                    int var107 = var103.field5102;
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
                    if (class296.field4181) {
                        class265.method1789(arg0, var4, var2, var3);
                        class340.field4702.method439(arg0.field4700, arg0.field4699);
                    }
                    class371 var110 = arg1.field756;
                    if (var109 > var108) {
                        class309 var111 = var103.method69(class340.field4702, 10228);
                        if (var111 != null) {
                            var111.field4382 = var103;
                            var111.field4378 = var4;
                            var111.field4379 = var2;
                            var111.field4384 = var3;
                            class280.field4024.method1765(125, var111);
                        }
                    } else if (var110 != null) {
                        class309 var112 = var110.method69(class340.field4702, 10228);
                        if (var112 != null) {
                            var112.field4382 = var110;
                            var112.field4378 = var4;
                            var112.field4379 = var2;
                            var112.field4384 = var3;
                            class280.field4024.method1765(122, var112);
                        }
                    }
                }
            }
            class421 var113 = arg1.field772;
            class421 var114 = arg1.field752;
            if (var114 != null && (var114.field5824 & arg1.field771) != 0 && !class61.method554(var5, var2, var3, var114.field5824)) {
                if (class296.field4181) {
                    class367.method2246(arg0, var114.field5824, var4, var2, var3);
                    class340.field4702.method439(arg0.field4700, arg0.field4699);
                }
                class309 var115 = var114.method69(class340.field4702, 10228);
                if (var115 != null) {
                    var115.field4382 = var114;
                    var115.field4378 = var4;
                    var115.field4379 = var2;
                    var115.field4384 = var3;
                    class280.field4024.method1765(118, var115);
                }
            }
            if (var113 != null && (var113.field5824 & arg1.field771) != 0 && !class61.method554(var5, var2, var3, var113.field5824)) {
                if (class296.field4181) {
                    class367.method2246(arg0, var113.field5824, var4, var2, var3);
                    class340.field4702.method439(arg0.field4700, arg0.field4699);
                }
                class309 var116 = var113.method69(class340.field4702, 10228);
                if (var116 != null) {
                    var116.field4382 = var113;
                    var116.field4378 = var4;
                    var116.field4379 = var2;
                    var116.field4384 = var3;
                    class280.field4024.method1765(121, var116);
                }
            }
        }
        if (var4 < class310.field4398 - 1) {
            class52 var117 = class385.field5285[var4 + 1][var2][var3];
            if (var117 != null && var117.field750) {
                class291.field4124.method137(-118, var117);
            }
        }
        if (var2 < class409.field5607) {
            class52 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field750) {
                class291.field4124.method139(var118, 0);
            }
        }
        if (var3 < class54.field811) {
            class52 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field750) {
                class291.field4124.method139(var119, 0);
            }
        }
        if (var2 > class409.field5607) {
            class52 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field750) {
                class291.field4124.method139(var120, 0);
            }
        }
        if (var3 > class54.field811) {
            class52 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field750) {
                class291.field4124.method139(var121, 0);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lrg;I)Lrg;")
    public abstract class365 method1706(class365 arg0, int arg1);
}
