import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class315 {

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "Lej;")
    public static class104 field4239 = new class104("M", "M", "M", "M");

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "Lml;")
    public static class325 field4240 = new class325(6, 4);

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    public static int field4241 = -1;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method1963(int arg0, int arg1) {
        field4238++;
        if (arg1 == 100 && class398.field5687 > 0) {
            byte[] var2 = class271.field3771[--class398.field5687];
            class271.field3771[class398.field5687] = null;
            return var2;
        } else if (arg1 == 5000 && class582.field7985 > 0) {
            byte[] var3 = class555.field7648[--class582.field7985];
            class555.field7648[class582.field7985] = null;
            return var3;
        } else if (arg0 != 1) {
            return null;
        } else if (arg1 == 30000 && class53.field993 > 0) {
            byte[] var4 = class252.field3497[--class53.field993];
            class252.field3497[class53.field993] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lvs;Lbo;)V")
    public static final void method1964(class508 arg0, class622 arg1) {
        if (!arg1.field8964) {
            return;
        }
        short var2 = arg1.field8966;
        short var3 = arg1.field8968;
        byte var4 = arg1.field8969;
        byte var5 = arg1.field8970;
        int var6 = (var2 << class272.field3786) + class194.field2745;
        int var7 = (var3 << class272.field3786) + class194.field2745;
        class622[][] var8 = class356.field4807[var4];
        float var9;
        if (client.field3472 == class590.field8430) {
            class329.field4405.method1314(class608.field8767[0].method1105(var6, var7), class503.method2915(var2, var3), class590.method3458(var2, var3), class270.method1756(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class329.field4405.method1333(3000.0F, var9 * 1.5F);
        if (arg1.field8975) {
            if (class109.field1687) {
                if (var4 > 0) {
                    class622 var10 = class356.field4807[var4 - 1][var2][var3];
                    if (var10 != null && var10.field8964) {
                        return;
                    }
                }
                if (var2 <= class120.field1970 && var2 > class213.field3024) {
                    class622 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field8964 && (var11.field8975 || (arg1.field8983 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class120.field1970 && var2 < class258.field3595 - 1) {
                    class622 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field8964 && (var12.field8975 || (arg1.field8983 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class546.field7561 && var3 > class67.field1139) {
                    class622 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field8964 && (var13.field8975 || (arg1.field8983 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class546.field7561 && var3 < class277.field3834 - 1) {
                    class622 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field8964 && (var14.field8975 || (arg1.field8983 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class109.field1687 = true;
            }
            arg1.field8975 = false;
            if (arg1.field8967 != null) {
                class622 var15 = arg1.field8967;
                class329.field4405.method1333(3000.0F, (201.5F - (float) (var15.field8970 + 1) * 50.0F) * 1.5F);
                if (!class427.method2538(var15.field8970, var2, var3)) {
                    class590.field8430[var15.field8970].method1101(var2, var3);
                }
                class344 var16 = var15.field8985;
                if (var16 != null) {
                    if (class474.field6665) {
                        if ((var16.field4632 & arg1.field8989) == 0) {
                            class299.method1901(arg0, var4, var2, var3);
                        } else {
                            class206.method1254(arg0, var16.field4632, var5, var2, var3);
                        }
                        class329.field4405.method1311(arg0.field7093, arg0.field7100);
                    }
                    var16.method483(true, class329.field4405);
                }
                for (class559 var17 = var15.field8973; var17 != null; var17 = var17.field7736) {
                    class425 var18 = var17.field7742;
                    if (var18 != null) {
                        if (class474.field6665) {
                            class299.method1901(arg0, var4, var2, var3);
                            class329.field4405.method1311(arg0.field7093, arg0.field7100);
                        }
                        var18.method483(true, class329.field4405);
                    }
                }
                class329.field4405.method1333(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class427.method2538(var5, var2, var3);
            if (var19) {
                class590.field8430[var5].method1101(var2, var3);
                class197 var20 = arg1.field8979;
                if (var20 != null && var20.field2795) {
                    if (var20.field2792) {
                        class329.field4405.method1333(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class474.field6665) {
                        class299.method1901(arg0, var4, var2, var3);
                        class329.field4405.method1311(arg0.field7093, arg0.field7100);
                    }
                    class254 var21 = var20.method483(true, class329.field4405);
                    if (var21 != null) {
                        var21.field3523 = var20;
                        var21.field3518 = var4;
                        var21.field3526 = var2;
                        var21.field3522 = var3;
                        class402.field5723.method3145(var21, Integer.MAX_VALUE);
                    }
                    if (var20.field2792) {
                        class329.field4405.method1333(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class344 var24 = arg1.field8985;
            class23 var25 = arg1.field8981;
            if (var24 != null || var25 != null) {
                if (class120.field1970 == var2) {
                    var22++;
                } else if (class120.field1970 < var2) {
                    var22 += 2;
                }
                if (class546.field7561 == var3) {
                    var22 += 3;
                } else if (class546.field7561 > var3) {
                    var22 += 6;
                }
                var23 = class331.field4425[var22];
                arg1.field8989 = class538.field7524[var22];
            }
            if (var24 != null) {
                if ((var24.field4632 & class542.field7549[var22]) == 0) {
                    arg1.field8976 = 0;
                } else if (var24.field4632 == 16) {
                    arg1.field8976 = 3;
                    arg1.field8972 = class296.field4055[var22];
                    arg1.field8987 = (byte) (3 - arg1.field8972);
                } else if (var24.field4632 == 32) {
                    arg1.field8976 = 6;
                    arg1.field8972 = class204.field2864[var22];
                    arg1.field8987 = (byte) (6 - arg1.field8972);
                } else if (var24.field4632 == 64) {
                    arg1.field8976 = 12;
                    arg1.field8972 = class314.field4224[var22];
                    arg1.field8987 = (byte) (12 - arg1.field8972);
                } else {
                    arg1.field8976 = 9;
                    arg1.field8972 = class80.field1307[var22];
                    arg1.field8987 = (byte) (9 - arg1.field8972);
                }
                if ((var24.field4632 & var23) != 0 && !class20.method200(var5, var2, var3, var24.field4632)) {
                    if (class474.field6665) {
                        class299.method1901(arg0, var4, var2, var3);
                        class329.field4405.method1311(arg0.field7093, arg0.field7100);
                    }
                    class254 var26 = var24.method483(true, class329.field4405);
                    if (var26 != null) {
                        var26.field3523 = var24;
                        var26.field3518 = var4;
                        var26.field3526 = var2;
                        var26.field3522 = var3;
                        class402.field5723.method3145(var26, Integer.MAX_VALUE);
                    }
                }
                class344 var27 = arg1.field8982;
                if (var27 != null && (var27.field4632 & var23) != 0 && !class20.method200(var5, var2, var3, var27.field4632)) {
                    if (class474.field6665) {
                        class299.method1901(arg0, var4, var2, var3);
                        class329.field4405.method1311(arg0.field7093, arg0.field7100);
                    }
                    class254 var28 = var27.method483(true, class329.field4405);
                    if (var28 != null) {
                        var28.field3523 = var27;
                        var28.field3518 = var4;
                        var28.field3526 = var2;
                        var28.field3522 = var3;
                        class402.field5723.method3145(var28, Integer.MAX_VALUE);
                    }
                }
            }
            if (var25 != null && !class424.method2531(var5, var2, var3, var25.method259(117))) {
                class23 var29 = arg1.field8977;
                class329.field4405.method1333(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field338 & var23) != 0) {
                    if (class474.field6665) {
                        class299.method1901(arg0, var4, var2, var3);
                        class329.field4405.method1311(arg0.field7093, arg0.field7100);
                    }
                    class254 var30 = var25.method483(true, class329.field4405);
                    if (var30 != null) {
                        var30.field3523 = var25;
                        var30.field3518 = var4;
                        var30.field3526 = var2;
                        var30.field3522 = var3;
                        class402.field5723.method3145(var30, Integer.MAX_VALUE);
                    }
                } else if (var25.field338 == 256) {
                    int var31 = var25.field337 - class2.field31;
                    int var32 = var25.field341 - class454.field6417;
                    int var33 = var25.field340;
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
                    if (class474.field6665) {
                        class299.method1901(arg0, var4, var2, var3);
                        class329.field4405.method1311(arg0.field7093, arg0.field7100);
                    }
                    if (var35 < var34) {
                        class254 var36 = var25.method483(true, class329.field4405);
                        if (var36 != null) {
                            var36.field3523 = var25;
                            var36.field3518 = var4;
                            var36.field3526 = var2;
                            var36.field3522 = var3;
                            class402.field5723.method3145(var36, Integer.MAX_VALUE);
                        }
                    } else if (var29 != null) {
                        class254 var37 = var29.method483(true, class329.field4405);
                        if (var37 != null) {
                            var37.field3523 = var29;
                            var37.field3518 = var4;
                            var37.field3526 = var2;
                            var37.field3522 = var3;
                            class402.field5723.method3145(var37, Integer.MAX_VALUE);
                        }
                    }
                }
                class329.field4405.method1333(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class197 var38 = arg1.field8979;
                if (var38 != null && !var38.field2795) {
                    if (var38.field2792) {
                        class329.field4405.method1333(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class474.field6665) {
                        class299.method1901(arg0, var4, var2, var3);
                        class329.field4405.method1311(arg0.field7093, arg0.field7100);
                    }
                    class254 var39 = var38.method483(true, class329.field4405);
                    if (var39 != null) {
                        var39.field3523 = var38;
                        var39.field3518 = var4;
                        var39.field3526 = var2;
                        var39.field3522 = var3;
                        class402.field5723.method3145(var39, Integer.MAX_VALUE);
                    }
                    if (var38.field2792) {
                        class329.field4405.method1333(3000.0F, var9 * 1.5F);
                    }
                }
                class171 var40 = arg1.field8974;
                if (var40 != null && !var40.field2468) {
                    if (class474.field6665) {
                        class299.method1901(arg0, var4, var2, var3);
                        class329.field4405.method1311(arg0.field7093, arg0.field7100);
                    }
                    class254 var41 = var40.method483(true, class329.field4405);
                    if (var41 != null) {
                        var41.field3523 = var40;
                        var41.field3518 = var4;
                        var41.field3526 = var2;
                        var41.field3522 = var3;
                        class402.field5723.method3145(var41, Integer.MAX_VALUE);
                    }
                }
            }
            byte var42 = arg1.field8983;
            if (var42 != 0) {
                if (var2 < class120.field1970 && (var42 & 0x4) != 0) {
                    class622 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field8964) {
                        class233.field3288.method2865(var43, true);
                    }
                }
                if (var3 < class546.field7561 && (var42 & 0x2) != 0) {
                    class622 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field8964) {
                        class233.field3288.method2865(var44, true);
                    }
                }
                if (var2 > class120.field1970 && (var42 & 0x1) != 0) {
                    class622 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field8964) {
                        class233.field3288.method2865(var45, true);
                    }
                }
                if (var3 > class546.field7561 && (var42 & 0x8) != 0) {
                    class622 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field8964) {
                        class233.field3288.method2865(var46, true);
                    }
                }
            }
        }
        if (arg1.field8976 != 0) {
            boolean var47 = true;
            for (class559 var48 = arg1.field8973; var48 != null; var48 = var48.field7736) {
                if (class439.field6235 != var48.field7742.field6038 && (var48.field7744 & arg1.field8976) == arg1.field8972) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class344 var49 = arg1.field8985;
                if (!class20.method200(var5, var2, var3, var49.field4632)) {
                    if (class474.field6665) {
                        label682: {
                            if (var49.field4632 >= 16) {
                                int var50 = var2 - class120.field1970;
                                int var51 = var3 - class546.field7561;
                                if (var49.field4632 == 16) {
                                    int var52 = var50 - class194.field2745;
                                    int var53 = class194.field2745 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class34.field624) {
                                        class299.method1901(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field4632 == 32) {
                                    int var54 = class194.field2745 + var50;
                                    int var55 = class194.field2745 + var51;
                                    if (var55 < -var54 && var2 < class332.field4447 && var3 < class34.field624) {
                                        class299.method1901(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field4632 == 64) {
                                    int var56 = class194.field2745 + var50;
                                    int var57 = var51 - class194.field2745;
                                    if (var57 > var56 && var2 < class332.field4447 && var3 > 0) {
                                        class299.method1901(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field4632 == 128) {
                                    int var58 = var50 - class194.field2745;
                                    int var59 = var51 - class194.field2745;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class299.method1901(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class299.method1901(arg0, var4, var2, var3);
                        }
                        class329.field4405.method1311(arg0.field7093, arg0.field7100);
                    }
                    class254 var60 = var49.method483(true, class329.field4405);
                    if (var60 != null) {
                        var60.field3523 = var49;
                        var60.field3518 = var4;
                        var60.field3526 = var2;
                        var60.field3522 = var3;
                        class402.field5723.method3145(var60, Integer.MAX_VALUE);
                    }
                }
                arg1.field8976 = 0;
            }
        }
        if (arg1.field8984) {
            try {
                arg1.field8984 = false;
                int var61 = 0;
                label625: for (class559 var62 = arg1.field8973; var62 != null; var62 = var62.field7736) {
                    class425 var63 = var62.field7742;
                    if (class439.field6235 != var63.field6038) {
                        for (int var64 = var63.field6036; var64 <= var63.field6030; var64++) {
                            for (int var65 = var63.field6028; var65 <= var63.field6031; var65++) {
                                class622 var66 = var8[var64][var65];
                                if (var66.field8975) {
                                    arg1.field8984 = true;
                                    continue label625;
                                }
                                if (var66.field8976 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field6036) {
                                        var67++;
                                    }
                                    if (var64 < var63.field6030) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field6028) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field6031) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field8976) == arg1.field8987) {
                                        arg1.field8984 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class120.field1970 - var63.field6036;
                        int var69 = var63.field6030 - class120.field1970;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class546.field7561 - var63.field6028;
                        int var71 = var63.field6031 - class546.field7561;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field7101[var61] = var63;
                        arg0.field7097[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class425 var75 = arg0.field7101[var74];
                        if (class439.field6235 != var75.field6038) {
                            int var76 = arg0.field7097[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field6037 - class2.field31;
                                int var78 = var75.field6029 - class454.field6417;
                                int var79 = arg0.field7101[var73].field6037 - class2.field31;
                                int var80 = arg0.field7101[var73].field6029 - class454.field6417;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class425 var81 = arg0.field7101[var73];
                    var81.field6038 = class439.field6235;
                    if (!class400.method2394(var5, var81.field6036, var81.field6030, var81.field6028, var81.field6031, var81.method492(0))) {
                        if (class474.field6665) {
                            if (var81.field6041 == 0) {
                                class218.method1409(arg0, var4, var81.field6036, var81.field6028, var81.field6030, var81.field6031);
                            } else {
                                class299.method1901(arg0, var4, var2, var3);
                                int var82 = var2 - class120.field1970;
                                int var83 = var3 - class546.field7561;
                                if (var81.field6041 == 2) {
                                    if (var83 > -var82) {
                                        class25.method293(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class25.method293(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class25.method293(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class25.method293(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class329.field4405.method1311(arg0.field7093, arg0.field7100);
                        }
                        class254 var84 = var81.method483(true, class329.field4405);
                        if (var84 != null) {
                            var84.field3523 = var81;
                            var84.field3518 = var4;
                            var84.field3526 = var81.field6036;
                            var84.field3522 = var81.field6028;
                            class402.field5723.method3145(var84, Integer.MAX_VALUE);
                        }
                    }
                    for (int var85 = var81.field6036; var85 <= var81.field6030; var85++) {
                        for (int var86 = var81.field6028; var86 <= var81.field6031; var86++) {
                            class622 var87 = var8[var85][var86];
                            if (var87.field8976 != 0) {
                                class233.field3288.method2865(var87, true);
                            } else if ((var2 != var85 || var3 != var86) && var87.field8964) {
                                class233.field3288.method2865(var87, true);
                            }
                        }
                    }
                }
                if (arg1.field8984) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field8984 = false;
            }
        }
        if (arg1.field8986 != null && (byte) (class641.field9321 & 0xFF) == arg1.field8971) {
            class274 var88 = arg1.field8986;
            int var89 = class590.field8430[var4].method1104(var2, var3);
            int var90;
            if (var4 < class395.field5610 - 1) {
                var90 = class590.field8430[var4].method1104(var2, var3) - class590.field8430[var4 + 1].method1104(var2, var3);
            } else {
                var90 = 0x8 << class272.field3786;
            }
            class618.field8854.method1044(var6, var89, var7, arg0.field7094);
            int var91 = arg0.field7094[2];
            class618.field8854.method1044(var6, var89 - var90, var7, arg0.field7094);
            int var92 = arg0.field7094[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class29.field484;
            int var96 = class29.field484 + var94;
            var88.field3805 = var95;
            var88.field3804 = var96;
            var88.field3803 = true;
            class329.field4405.method1356(var88);
        }
        if (!arg1.field8964) {
            return;
        }
        if (arg1.field8976 != 0) {
            return;
        }
        if (var2 <= class120.field1970 && var2 > class213.field3024) {
            class622 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field8964) {
                return;
            }
        }
        if (var2 >= class120.field1970 && var2 < class258.field3595 - 1) {
            class622 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field8964) {
                return;
            }
        }
        if (var3 <= class546.field7561 && var3 > class67.field1139) {
            class622 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field8964) {
                return;
            }
        }
        if (var3 >= class546.field7561 && var3 < class277.field3834 - 1) {
            class622 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field8964) {
                return;
            }
        }
        arg1.field8964 = false;
        class440.field6264--;
        class171 var101 = arg1.field8974;
        if (var101 != null && var101.field2468) {
            if (class474.field6665) {
                class299.method1901(arg0, var4, var2, var3);
                class329.field4405.method1311(arg0.field7093, arg0.field7100);
            }
            class254 var102 = var101.method483(true, class329.field4405);
            if (var102 != null) {
                var102.field3523 = var101;
                var102.field3518 = var4;
                var102.field3526 = var2;
                var102.field3522 = var3;
                class402.field5723.method3145(var102, Integer.MAX_VALUE);
            }
        }
        if (arg1.field8989 != 0) {
            class23 var103 = arg1.field8981;
            if (var103 != null && !class424.method2531(var5, var2, var3, var103.method259(113))) {
                if ((var103.field338 & arg1.field8989) != 0) {
                    if (class474.field6665) {
                        class299.method1901(arg0, var4, var2, var3);
                        class329.field4405.method1311(arg0.field7093, arg0.field7100);
                    }
                    class254 var104 = var103.method483(true, class329.field4405);
                    if (var104 != null) {
                        var104.field3523 = var103;
                        var104.field3518 = var4;
                        var104.field3526 = var2;
                        var104.field3522 = var3;
                        class402.field5723.method3145(var104, Integer.MAX_VALUE);
                    }
                } else if (var103.field338 == 256) {
                    int var105 = var103.field337 - class2.field31;
                    int var106 = var103.field341 - class454.field6417;
                    int var107 = var103.field340;
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
                    if (class474.field6665) {
                        class299.method1901(arg0, var4, var2, var3);
                        class329.field4405.method1311(arg0.field7093, arg0.field7100);
                    }
                    class23 var110 = arg1.field8977;
                    if (var109 > var108) {
                        class254 var111 = var103.method483(true, class329.field4405);
                        if (var111 != null) {
                            var111.field3523 = var103;
                            var111.field3518 = var4;
                            var111.field3526 = var2;
                            var111.field3522 = var3;
                            class402.field5723.method3145(var111, Integer.MAX_VALUE);
                        }
                    } else if (var110 != null) {
                        class254 var112 = var110.method483(true, class329.field4405);
                        if (var112 != null) {
                            var112.field3523 = var110;
                            var112.field3518 = var4;
                            var112.field3526 = var2;
                            var112.field3522 = var3;
                            class402.field5723.method3145(var112, Integer.MAX_VALUE);
                        }
                    }
                }
            }
            class344 var113 = arg1.field8985;
            class344 var114 = arg1.field8982;
            if (var114 != null && (var114.field4632 & arg1.field8989) != 0 && !class20.method200(var5, var2, var3, var114.field4632)) {
                if (class474.field6665) {
                    class206.method1254(arg0, var114.field4632, var4, var2, var3);
                    class329.field4405.method1311(arg0.field7093, arg0.field7100);
                }
                class254 var115 = var114.method483(true, class329.field4405);
                if (var115 != null) {
                    var115.field3523 = var114;
                    var115.field3518 = var4;
                    var115.field3526 = var2;
                    var115.field3522 = var3;
                    class402.field5723.method3145(var115, Integer.MAX_VALUE);
                }
            }
            if (var113 != null && (var113.field4632 & arg1.field8989) != 0 && !class20.method200(var5, var2, var3, var113.field4632)) {
                if (class474.field6665) {
                    class206.method1254(arg0, var113.field4632, var4, var2, var3);
                    class329.field4405.method1311(arg0.field7093, arg0.field7100);
                }
                class254 var116 = var113.method483(true, class329.field4405);
                if (var116 != null) {
                    var116.field3523 = var113;
                    var116.field3518 = var4;
                    var116.field3526 = var2;
                    var116.field3522 = var3;
                    class402.field5723.method3145(var116, Integer.MAX_VALUE);
                }
            }
        }
        if (var4 < class395.field5610 - 1) {
            class622 var117 = class356.field4807[var4 + 1][var2][var3];
            if (var117 != null && var117.field8964) {
                class233.field3288.method2854(68, var117);
            }
        }
        if (var2 < class120.field1970) {
            class622 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field8964) {
                class233.field3288.method2865(var118, true);
            }
        }
        if (var3 < class546.field7561) {
            class622 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field8964) {
                class233.field3288.method2865(var119, true);
            }
        }
        if (var2 > class120.field1970) {
            class622 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field8964) {
                class233.field3288.method2865(var120, true);
            }
        }
        if (var3 > class546.field7561) {
            class622 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field8964) {
                class233.field3288.method2865(var121, true);
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
    public static void method1965(byte arg0) {
        field4239 = null;
        if (arg0 > 51) {
            field4240 = null;
        }
    }
}
