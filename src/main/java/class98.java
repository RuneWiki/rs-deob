import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class98 {

    @OriginalMember(owner = "client!og", name = "c", descriptor = "Lwg;")
    private class58 field1308 = new class58(64);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "Lkr;")
    private class329 field1306;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "Lkr;")
    public static class329 field1317;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Lqp;")
    public static class586 field1307;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lkg;Lrg;)V")
    public static final void method540(class57 arg0, class563 arg1) {
        if (!arg1.field7897) {
            return;
        }
        short var2 = arg1.field7900;
        short var3 = arg1.field7899;
        byte var4 = arg1.field7905;
        byte var5 = arg1.field7886;
        int var6 = (var2 << class400.field5480) + class337.field4699;
        int var7 = (var3 << class400.field5480) + class337.field4699;
        class563[][] var8 = class199.field2605[var4];
        if (class501.field6947 == class353.field4949) {
            class583.field8427.method953(class50.field672[0].method1040(var6, var7), method542(var2, var3), class502.method2801(var2, var3), class459.method2661(var2, var3));
        }
        if (arg1.field7890) {
            if (class358.field4998) {
                if (var4 > 0) {
                    class563 var9 = class199.field2605[var4 - 1][var2][var3];
                    if (var9 != null && var9.field7897) {
                        return;
                    }
                }
                if (var2 <= class155.field2012 && var2 > class389.field5401) {
                    class563 var10 = var8[var2 - 1][var3];
                    if (var10 != null && var10.field7897 && (var10.field7890 || (arg1.field7892 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class155.field2012 && var2 < class145.field1893 - 1) {
                    class563 var11 = var8[var2 + 1][var3];
                    if (var11 != null && var11.field7897 && (var11.field7890 || (arg1.field7892 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class151.field1995 && var3 > class445.field6164) {
                    class563 var12 = var8[var2][var3 - 1];
                    if (var12 != null && var12.field7897 && (var12.field7890 || (arg1.field7892 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class151.field1995 && var3 < class244.field3085 - 1) {
                    class563 var13 = var8[var2][var3 + 1];
                    if (var13 != null && var13.field7897 && (var13.field7890 || (arg1.field7892 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class358.field4998 = true;
            }
            arg1.field7890 = false;
            if (arg1.field7893 != null) {
                class563 var14 = arg1.field7893;
                if (!class250.method1528(var14.field7886, var2, var3)) {
                    class501.field6947[var14.field7886].method883(var2, var3);
                }
                class8 var15 = var14.field7896;
                if (var15 != null) {
                    if (class526.field7327) {
                        if ((var15.field64 & arg1.field7901) == 0) {
                            class569.method3190(arg0, var4, var2, var3);
                        } else {
                            class128.method688(arg0, var15.field64, var5, var2, var3);
                        }
                        class583.field8427.method972(arg0.field759, arg0.field756);
                    }
                    var15.method59((byte) 72, class583.field8427);
                }
                for (class15 var16 = var14.field7894; var16 != null; var16 = var16.field158) {
                    class450 var17 = var16.field161;
                    if (var17 != null) {
                        if (class526.field7327) {
                            class569.method3190(arg0, var4, var2, var3);
                            class583.field8427.method972(arg0.field759, arg0.field756);
                        }
                        var17.method59((byte) -124, class583.field8427);
                    }
                }
            }
            boolean var18 = !class250.method1528(var5, var2, var3);
            if (var18) {
                class501.field6947[var5].method883(var2, var3);
                class249 var19 = arg1.field7891;
                if (var19 != null && var19.field3128) {
                    if (class526.field7327) {
                        class569.method3190(arg0, var4, var2, var3);
                        class583.field8427.method972(arg0.field759, arg0.field756);
                    }
                    class541 var20 = var19.method59((byte) 92, class583.field8427);
                    if (var20 != null) {
                        var20.field7572 = var19;
                        var20.field7570 = var4;
                        var20.field7571 = var2;
                        var20.field7569 = var3;
                        class358.field4993.method1873(var20, true);
                    }
                }
            }
            int var21 = 0;
            int var22 = 0;
            class8 var23 = arg1.field7896;
            class486 var24 = arg1.field7885;
            if (var23 != null || var24 != null) {
                if (class155.field2012 == var2) {
                    var21++;
                } else if (class155.field2012 < var2) {
                    var21 += 2;
                }
                if (class151.field1995 == var3) {
                    var21 += 3;
                } else if (class151.field1995 > var3) {
                    var21 += 6;
                }
                var22 = class16.field168[var21];
                arg1.field7901 = class256.field3179[var21];
            }
            if (var23 != null) {
                if ((var23.field64 & class99.field1332[var21]) == 0) {
                    arg1.field7888 = 0;
                } else if (var23.field64 == 16) {
                    arg1.field7888 = 3;
                    arg1.field7887 = class207.field2688[var21];
                    arg1.field7898 = (byte) (3 - arg1.field7887);
                } else if (var23.field64 == 32) {
                    arg1.field7888 = 6;
                    arg1.field7887 = class167.field2111[var21];
                    arg1.field7898 = (byte) (6 - arg1.field7887);
                } else if (var23.field64 == 64) {
                    arg1.field7888 = 12;
                    arg1.field7887 = class375.field5231[var21];
                    arg1.field7898 = (byte) (12 - arg1.field7887);
                } else {
                    arg1.field7888 = 9;
                    arg1.field7887 = class586.field8490[var21];
                    arg1.field7898 = (byte) (9 - arg1.field7887);
                }
                if ((var23.field64 & var22) != 0 && !class355.method2215(var5, var2, var3, var23.field64)) {
                    if (class526.field7327) {
                        class569.method3190(arg0, var4, var2, var3);
                        class583.field8427.method972(arg0.field759, arg0.field756);
                    }
                    class541 var25 = var23.method59((byte) 90, class583.field8427);
                    if (var25 != null) {
                        var25.field7572 = var23;
                        var25.field7570 = var4;
                        var25.field7571 = var2;
                        var25.field7569 = var3;
                        class358.field4993.method1873(var25, true);
                    }
                }
                class8 var26 = arg1.field7884;
                if (var26 != null && (var26.field64 & var22) != 0 && !class355.method2215(var5, var2, var3, var26.field64)) {
                    if (class526.field7327) {
                        class569.method3190(arg0, var4, var2, var3);
                        class583.field8427.method972(arg0.field759, arg0.field756);
                    }
                    class541 var27 = var26.method59((byte) 52, class583.field8427);
                    if (var27 != null) {
                        var27.field7572 = var26;
                        var27.field7570 = var4;
                        var27.field7571 = var2;
                        var27.field7569 = var3;
                        class358.field4993.method1873(var27, true);
                    }
                }
            }
            if (var24 != null && !class504.method2817(var5, var2, var3, var24.method2135(-1))) {
                class486 var28 = arg1.field7889;
                if ((var24.field6778 & var22) != 0) {
                    if (class526.field7327) {
                        class569.method3190(arg0, var4, var2, var3);
                        class583.field8427.method972(arg0.field759, arg0.field756);
                    }
                    class541 var29 = var24.method59((byte) 87, class583.field8427);
                    if (var29 != null) {
                        var29.field7572 = var24;
                        var29.field7570 = var4;
                        var29.field7571 = var2;
                        var29.field7569 = var3;
                        class358.field4993.method1873(var29, true);
                    }
                } else if (var24.field6778 == 256) {
                    int var30 = var24.field6787 - class543.field7580;
                    int var31 = var24.field6780 - class100.field1335;
                    int var32 = var24.field6781;
                    int var33;
                    if (var32 == 1 || var32 == 2) {
                        var33 = -var30;
                    } else {
                        var33 = var30;
                    }
                    int var34;
                    if (var32 == 2 || var32 == 3) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    if (class526.field7327) {
                        class569.method3190(arg0, var4, var2, var3);
                        class583.field8427.method972(arg0.field759, arg0.field756);
                    }
                    if (var34 < var33) {
                        class541 var35 = var24.method59((byte) -124, class583.field8427);
                        if (var35 != null) {
                            var35.field7572 = var24;
                            var35.field7570 = var4;
                            var35.field7571 = var2;
                            var35.field7569 = var3;
                            class358.field4993.method1873(var35, true);
                        }
                    } else if (var28 != null) {
                        class541 var36 = var28.method59((byte) 34, class583.field8427);
                        if (var36 != null) {
                            var36.field7572 = var28;
                            var36.field7570 = var4;
                            var36.field7571 = var2;
                            var36.field7569 = var3;
                            class358.field4993.method1873(var36, true);
                        }
                    }
                }
            }
            if (var18) {
                class249 var37 = arg1.field7891;
                if (var37 != null && !var37.field3128) {
                    if (class526.field7327) {
                        class569.method3190(arg0, var4, var2, var3);
                        class583.field8427.method972(arg0.field759, arg0.field756);
                    }
                    class541 var38 = var37.method59((byte) 44, class583.field8427);
                    if (var38 != null) {
                        var38.field7572 = var37;
                        var38.field7570 = var4;
                        var38.field7571 = var2;
                        var38.field7569 = var3;
                        class358.field4993.method1873(var38, true);
                    }
                }
                class293 var39 = arg1.field7895;
                if (var39 != null && !var39.field3822) {
                    if (class526.field7327) {
                        class569.method3190(arg0, var4, var2, var3);
                        class583.field8427.method972(arg0.field759, arg0.field756);
                    }
                    class541 var40 = var39.method59((byte) 64, class583.field8427);
                    if (var40 != null) {
                        var40.field7572 = var39;
                        var40.field7570 = var4;
                        var40.field7571 = var2;
                        var40.field7569 = var3;
                        class358.field4993.method1873(var40, true);
                    }
                }
            }
            byte var41 = arg1.field7892;
            if (var41 != 0) {
                if (var2 < class155.field2012 && (var41 & 0x4) != 0) {
                    class563 var42 = var8[var2 + 1][var3];
                    if (var42 != null && var42.field7897) {
                        class171.field2196.method756((byte) 61, var42);
                    }
                }
                if (var3 < class151.field1995 && (var41 & 0x2) != 0) {
                    class563 var43 = var8[var2][var3 + 1];
                    if (var43 != null && var43.field7897) {
                        class171.field2196.method756((byte) 61, var43);
                    }
                }
                if (var2 > class155.field2012 && (var41 & 0x1) != 0) {
                    class563 var44 = var8[var2 - 1][var3];
                    if (var44 != null && var44.field7897) {
                        class171.field2196.method756((byte) 61, var44);
                    }
                }
                if (var3 > class151.field1995 && (var41 & 0x8) != 0) {
                    class563 var45 = var8[var2][var3 - 1];
                    if (var45 != null && var45.field7897) {
                        class171.field2196.method756((byte) 61, var45);
                    }
                }
            }
        }
        if (arg1.field7888 != 0) {
            boolean var46 = true;
            for (class15 var47 = arg1.field7894; var47 != null; var47 = var47.field158) {
                if (class642.field9327 != var47.field161.field6364 && (var47.field160 & arg1.field7888) == arg1.field7887) {
                    var46 = false;
                    break;
                }
            }
            if (var46) {
                class8 var48 = arg1.field7896;
                if (!class355.method2215(var5, var2, var3, var48.field64)) {
                    if (class526.field7327) {
                        label663: {
                            if (var48.field64 >= 16) {
                                int var49 = var2 - class155.field2012;
                                int var50 = var3 - class151.field1995;
                                if (var48.field64 == 16) {
                                    int var51 = var49 - class337.field4699;
                                    int var52 = class337.field4699 + var50;
                                    if (var52 < var51 && var2 > 0 && var3 <= class541.field7566) {
                                        class569.method3190(arg0, var4, var2 - 1, var3 + 1);
                                        break label663;
                                    }
                                } else if (var48.field64 == 32) {
                                    int var53 = class337.field4699 + var49;
                                    int var54 = class337.field4699 + var50;
                                    if (var54 < -var53 && var2 < class260.field3211 && var3 < class541.field7566) {
                                        class569.method3190(arg0, var4, var2 + 1, var3 + 1);
                                        break label663;
                                    }
                                } else if (var48.field64 == 64) {
                                    int var55 = class337.field4699 + var49;
                                    int var56 = var50 - class337.field4699;
                                    if (var56 > var55 && var2 < class260.field3211 && var3 > 0) {
                                        class569.method3190(arg0, var4, var2 + 1, var3 - 1);
                                        break label663;
                                    }
                                } else if (var48.field64 == 128) {
                                    int var57 = var49 - class337.field4699;
                                    int var58 = var50 - class337.field4699;
                                    if (var58 > -var57 && var2 > 0 && var3 > 0) {
                                        class569.method3190(arg0, var4, var2 - 1, var3 - 1);
                                        break label663;
                                    }
                                }
                            }
                            class569.method3190(arg0, var4, var2, var3);
                        }
                        class583.field8427.method972(arg0.field759, arg0.field756);
                    }
                    class541 var59 = var48.method59((byte) 77, class583.field8427);
                    if (var59 != null) {
                        var59.field7572 = var48;
                        var59.field7570 = var4;
                        var59.field7571 = var2;
                        var59.field7569 = var3;
                        class358.field4993.method1873(var59, true);
                    }
                }
                arg1.field7888 = 0;
            }
        }
        if (arg1.field7902) {
            try {
                arg1.field7902 = false;
                int var60 = 0;
                label606: for (class15 var61 = arg1.field7894; var61 != null; var61 = var61.field158) {
                    class450 var62 = var61.field161;
                    if (class642.field9327 != var62.field6364) {
                        for (int var63 = var62.field6361; var63 <= var62.field6357; var63++) {
                            for (int var64 = var62.field6359; var64 <= var62.field6367; var64++) {
                                class563 var65 = var8[var63][var64];
                                if (var65.field7890) {
                                    arg1.field7902 = true;
                                    continue label606;
                                }
                                if (var65.field7888 != 0) {
                                    int var66 = 0;
                                    if (var63 > var62.field6361) {
                                        var66++;
                                    }
                                    if (var63 < var62.field6357) {
                                        var66 += 4;
                                    }
                                    if (var64 > var62.field6359) {
                                        var66 += 8;
                                    }
                                    if (var64 < var62.field6367) {
                                        var66 += 2;
                                    }
                                    if ((var66 & var65.field7888) == arg1.field7898) {
                                        arg1.field7902 = true;
                                        continue label606;
                                    }
                                }
                            }
                        }
                        int var67 = class155.field2012 - var62.field6361;
                        int var68 = var62.field6357 - class155.field2012;
                        if (var68 > var67) {
                            var67 = var68;
                        }
                        int var69 = class151.field1995 - var62.field6359;
                        int var70 = var62.field6367 - class151.field1995;
                        if (var70 > var69) {
                            var69 = var70;
                        }
                        arg0.field754[var60] = var62;
                        arg0.field752[var60++] = var67 + var69;
                    }
                }
                while (var60 > 0) {
                    int var71 = -50;
                    int var72 = -1;
                    for (int var73 = 0; var73 < var60; var73++) {
                        class450 var74 = arg0.field754[var73];
                        if (class642.field9327 != var74.field6364) {
                            int var75 = arg0.field752[var73];
                            if (var75 > var71) {
                                var71 = var75;
                                var72 = var73;
                            } else if (var71 == var75) {
                                int var76 = var74.field6362 - class543.field7580;
                                int var77 = var74.field6368 - class100.field1335;
                                int var78 = arg0.field754[var72].field6362 - class543.field7580;
                                int var79 = arg0.field754[var72].field6368 - class100.field1335;
                                if (var76 * var76 + var77 * var77 > var78 * var78 + var79 * var79) {
                                    var72 = var73;
                                }
                            }
                        }
                    }
                    if (var72 == -1) {
                        break;
                    }
                    class450 var80 = arg0.field754[var72];
                    var80.field6364 = class642.field9327;
                    if (!class269.method1646(var5, var80.field6361, var80.field6357, var80.field6359, var80.field6367, var80.method103((byte) -104))) {
                        if (class526.field7327) {
                            if (var80.field6356 == 0) {
                                class48.method263(arg0, var4, var80.field6361, var80.field6359, var80.field6357, var80.field6367);
                            } else {
                                class569.method3190(arg0, var4, var2, var3);
                                int var81 = var2 - class155.field2012;
                                int var82 = var3 - class151.field1995;
                                if (var80.field6356 == 2) {
                                    if (var82 > -var81) {
                                        class611.method3494(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class611.method3494(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var82 > var81) {
                                    class611.method3494(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class611.method3494(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class583.field8427.method972(arg0.field759, arg0.field756);
                        }
                        class541 var83 = var80.method59((byte) 95, class583.field8427);
                        if (var83 != null) {
                            var83.field7572 = var80;
                            var83.field7570 = var4;
                            var83.field7571 = var80.field6361;
                            var83.field7569 = var80.field6359;
                            class358.field4993.method1873(var83, true);
                        }
                    }
                    for (int var84 = var80.field6361; var84 <= var80.field6357; var84++) {
                        for (int var85 = var80.field6359; var85 <= var80.field6367; var85++) {
                            class563 var86 = var8[var84][var85];
                            if (var86.field7888 != 0) {
                                class171.field2196.method756((byte) 61, var86);
                            } else if ((var2 != var84 || var3 != var85) && var86.field7897) {
                                class171.field2196.method756((byte) 61, var86);
                            }
                        }
                    }
                }
                if (arg1.field7902) {
                    return;
                }
            } catch (Exception var121) {
                arg1.field7902 = false;
            }
        }
        if (arg1.field7903 != null && (byte) (class4.field40 & 0xFF) == arg1.field7904) {
            class174 var87 = arg1.field7903;
            int var88 = class501.field6947[var4].method1031(var2, var3);
            int var89;
            if (var4 < class183.field2341 - 1) {
                var89 = class501.field6947[var4].method1031(var2, var3) - class501.field6947[var4 + 1].method1031(var2, var3);
            } else {
                var89 = 0x8 << class400.field5480;
            }
            class22.field308.method363(var6, var88, var7, arg0.field755);
            int var90 = arg0.field755[2];
            class22.field308.method363(var6, var88 - var89, var7, arg0.field755);
            int var91 = arg0.field755[2];
            int var92 = var90;
            int var93 = var91;
            if (var90 > var91) {
                var92 = var91;
                var93 = var90;
            }
            int var94 = var92 - class593.field8564;
            int var95 = class593.field8564 + var93;
            var87.field2257 = var94;
            var87.field2255 = var95;
            var87.field2256 = true;
            class583.field8427.method957(var87);
        }
        if (!arg1.field7897) {
            return;
        }
        if (arg1.field7888 != 0) {
            return;
        }
        if (var2 <= class155.field2012 && var2 > class389.field5401) {
            class563 var96 = var8[var2 - 1][var3];
            if (var96 != null && var96.field7897) {
                return;
            }
        }
        if (var2 >= class155.field2012 && var2 < class145.field1893 - 1) {
            class563 var97 = var8[var2 + 1][var3];
            if (var97 != null && var97.field7897) {
                return;
            }
        }
        if (var3 <= class151.field1995 && var3 > class445.field6164) {
            class563 var98 = var8[var2][var3 - 1];
            if (var98 != null && var98.field7897) {
                return;
            }
        }
        if (var3 >= class151.field1995 && var3 < class244.field3085 - 1) {
            class563 var99 = var8[var2][var3 + 1];
            if (var99 != null && var99.field7897) {
                return;
            }
        }
        arg1.field7897 = false;
        class310.field3972--;
        class293 var100 = arg1.field7895;
        if (var100 != null && var100.field3822) {
            if (class526.field7327) {
                class569.method3190(arg0, var4, var2, var3);
                class583.field8427.method972(arg0.field759, arg0.field756);
            }
            class541 var101 = var100.method59((byte) 62, class583.field8427);
            if (var101 != null) {
                var101.field7572 = var100;
                var101.field7570 = var4;
                var101.field7571 = var2;
                var101.field7569 = var3;
                class358.field4993.method1873(var101, true);
            }
        }
        if (arg1.field7901 != 0) {
            class486 var102 = arg1.field7885;
            if (var102 != null && !class504.method2817(var5, var2, var3, var102.method2135(-1))) {
                if ((var102.field6778 & arg1.field7901) != 0) {
                    if (class526.field7327) {
                        class569.method3190(arg0, var4, var2, var3);
                        class583.field8427.method972(arg0.field759, arg0.field756);
                    }
                    class541 var103 = var102.method59((byte) 54, class583.field8427);
                    if (var103 != null) {
                        var103.field7572 = var102;
                        var103.field7570 = var4;
                        var103.field7571 = var2;
                        var103.field7569 = var3;
                        class358.field4993.method1873(var103, true);
                    }
                } else if (var102.field6778 == 256) {
                    int var104 = var102.field6787 - class543.field7580;
                    int var105 = var102.field6780 - class100.field1335;
                    int var106 = var102.field6781;
                    int var107;
                    if (var106 == 1 || var106 == 2) {
                        var107 = -var104;
                    } else {
                        var107 = var104;
                    }
                    int var108;
                    if (var106 == 2 || var106 == 3) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    if (class526.field7327) {
                        class569.method3190(arg0, var4, var2, var3);
                        class583.field8427.method972(arg0.field759, arg0.field756);
                    }
                    class486 var109 = arg1.field7889;
                    if (var108 > var107) {
                        class541 var110 = var102.method59((byte) 64, class583.field8427);
                        if (var110 != null) {
                            var110.field7572 = var102;
                            var110.field7570 = var4;
                            var110.field7571 = var2;
                            var110.field7569 = var3;
                            class358.field4993.method1873(var110, true);
                        }
                    } else if (var109 != null) {
                        class541 var111 = var109.method59((byte) -127, class583.field8427);
                        if (var111 != null) {
                            var111.field7572 = var109;
                            var111.field7570 = var4;
                            var111.field7571 = var2;
                            var111.field7569 = var3;
                            class358.field4993.method1873(var111, true);
                        }
                    }
                }
            }
            class8 var112 = arg1.field7896;
            class8 var113 = arg1.field7884;
            if (var113 != null && (var113.field64 & arg1.field7901) != 0 && !class355.method2215(var5, var2, var3, var113.field64)) {
                if (class526.field7327) {
                    class128.method688(arg0, var113.field64, var4, var2, var3);
                    class583.field8427.method972(arg0.field759, arg0.field756);
                }
                class541 var114 = var113.method59((byte) -119, class583.field8427);
                if (var114 != null) {
                    var114.field7572 = var113;
                    var114.field7570 = var4;
                    var114.field7571 = var2;
                    var114.field7569 = var3;
                    class358.field4993.method1873(var114, true);
                }
            }
            if (var112 != null && (var112.field64 & arg1.field7901) != 0 && !class355.method2215(var5, var2, var3, var112.field64)) {
                if (class526.field7327) {
                    class128.method688(arg0, var112.field64, var4, var2, var3);
                    class583.field8427.method972(arg0.field759, arg0.field756);
                }
                class541 var115 = var112.method59((byte) 72, class583.field8427);
                if (var115 != null) {
                    var115.field7572 = var112;
                    var115.field7570 = var4;
                    var115.field7571 = var2;
                    var115.field7569 = var3;
                    class358.field4993.method1873(var115, true);
                }
            }
        }
        if (var4 < class183.field2341 - 1) {
            class563 var116 = class199.field2605[var4 + 1][var2][var3];
            if (var116 != null && var116.field7897) {
                class171.field2196.method758(0, var116);
            }
        }
        if (var2 < class155.field2012) {
            class563 var117 = var8[var2 + 1][var3];
            if (var117 != null && var117.field7897) {
                class171.field2196.method756((byte) 61, var117);
            }
        }
        if (var3 < class151.field1995) {
            class563 var118 = var8[var2][var3 + 1];
            if (var118 != null && var118.field7897) {
                class171.field2196.method756((byte) 61, var118);
            }
        }
        if (var2 > class155.field2012) {
            class563 var119 = var8[var2 - 1][var3];
            if (var119 != null && var119.field7897) {
                class171.field2196.method756((byte) 61, var119);
            }
        }
        if (var3 > class151.field1995) {
            class563 var120 = var8[var2][var3 - 1];
            if (var120 != null && var120.field7897) {
                class171.field2196.method756((byte) 61, var120);
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
    public final void method541(int arg0, int arg1) {
        class58 var3 = this.field1308;
        synchronized (this.field1308) {
            this.field1308.method320(arg0, -306674912);
        }
        int var4 = -2 / ((16 - arg1) / 57);
        field1309++;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)I")
    public static final int method542(int arg0, int arg1) {
        return class558.field7819 == null ? 0 : class558.field7819[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
    public final void method543(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1310++;
        class58 var2 = this.field1308;
        synchronized (this.field1308) {
            this.field1308.method315(1);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZC)Z")
    public static final boolean method544(boolean arg0, char arg1) {
        field1315++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class506.method2834(arg1, 120)) {
            return true;
        } else if (arg0) {
            char[] var2 = class597.field8617;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class545.field7601;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static final void method545(int arg0) {
        if (arg0 != 32491) {
            method547(-105);
        }
        field1313++;
        for (int var1 = 0; var1 < class369.field5138; var1++) {
            class201 var2 = class172.field2225[var1];
            if (var2.field2625 == 2) {
                if (var2.field2628 == null) {
                    var2.field2630 = Integer.MIN_VALUE;
                } else {
                    class92.field1224.method250(var2.field2628);
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)Lpu;")
    public final class221 method546(int arg0, byte arg1) {
        field1312++;
        class58 var3 = this.field1308;
        class221 var4;
        synchronized (this.field1308) {
            var4 = (class221) this.field1308.method323((long) arg0, -19814);
        }
        if (var4 != null) {
            return var4;
        }
        class329 var5 = this.field1306;
        byte[] var6;
        synchronized (this.field1306) {
            var6 = this.field1306.method2054(true, 35, arg0);
        }
        class221 var7 = new class221();
        if (arg1 <= 113) {
            field1317 = null;
        }
        if (var6 != null) {
            var7.method1415(new class551(var6), false);
        }
        var7.method1420(10);
        class58 var8 = this.field1308;
        synchronized (this.field1308) {
            this.field1308.method316((long) arg0, (byte) -128, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
    public static void method547(int arg0) {
        if (arg0 == 0) {
            field1317 = null;
            field1307 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
    public final void method548(int arg0) {
        if (arg0 != 0) {
            this.method548(-125);
        }
        field1314++;
        class58 var2 = this.field1308;
        synchronized (this.field1308) {
            this.field1308.method317((byte) 21);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "([III[II)V")
    public static final void method549(int[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        if (arg1 != Integer.MIN_VALUE) {
            method547(-30);
        }
        if (arg2 > arg4) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            int var8 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg4; var10 < arg2; var10++) {
                if (arg3[var10] < (var10 & var9) + var7) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var12 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var12;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg0[arg2] = arg0[var6];
            arg0[var6] = var8;
            method549(arg0, Integer.MIN_VALUE, var6 - 1, arg3, arg4);
            method549(arg0, arg1, arg2, arg3, var6 + 1);
        }
        field1316++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIILbu;I)V")
    public static final void method550(int arg0, int arg1, int arg2, class137 arg3, int arg4) {
        field1311++;
        if (arg2 != 19649) {
            return;
        }
        for (class72 var5 = (class72) class244.field3084.method3188((byte) -100); var5 != null; var5 = (class72) class244.field3084.method3182((byte) -3)) {
            if (var5.field983 == arg1 && arg4 << 9 == var5.field980 && arg0 << 9 == var5.field992 && var5.field978.field1679 == arg3.field1679) {
                if (var5.field993 != null) {
                    class92.field1224.method250(var5.field993);
                    var5.field993 = null;
                }
                if (var5.field996 != null) {
                    class92.field1224.method250(var5.field996);
                    var5.field996 = null;
                }
                var5.method589(-8880);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lg;ILkr;)V")
    public class98(class513 arg0, int arg1, class329 arg2) {
        this.field1306 = arg2;
        if (this.field1306 != null) {
            this.field1306.method2064(0, 35);
        }
    }
}
