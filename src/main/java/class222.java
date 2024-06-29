import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public abstract class class222 {

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "S")
    public static short field3470 = 256;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "Ls;")
    public static class186 field3468 = new class186(98, -1);

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method811(Component arg0, byte arg1);

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method810(Component arg0, int arg1);

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)V")
    public static final void method1480(int arg0, int arg1) {
        field3469++;
        class18 var2 = class140.method1047(arg0, arg1, false);
        var2.method123(20983);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)I")
    public abstract int method812(int arg0);

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
    public static void method1481(int arg0) {
        field3468 = null;
        int var1 = -40 / ((-arg0 - 41) / 52);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lke;Lak;)V")
    public static final void method1482(class427 arg0, class234 arg1) {
        if (!arg1.field3617) {
            return;
        }
        short var2 = arg1.field3599;
        short var3 = arg1.field3614;
        byte var4 = arg1.field3623;
        byte var5 = arg1.field3600;
        int var6 = (var2 << class353.field5216) + class421.field6346;
        int var7 = (var3 << class353.field5216) + class421.field6346;
        class234[][] var8 = class518.field7511[var4];
        float var9;
        if (class520.field7560 == class293.field4481) {
            class34.field522.method375(class531.field7727[0].method186(var6, var7), class205.method1399(var2, var3), class34.method237(var2, var3), class399.method2476(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class34.field522.method385(3000.0F, var9 * 1.5F);
        if (arg1.field3609) {
            if (class456.field6768) {
                if (var4 > 0) {
                    class234 var10 = class518.field7511[var4 - 1][var2][var3];
                    if (var10 != null && var10.field3617) {
                        return;
                    }
                }
                if (var2 <= class107.field1974 && var2 > class450.field6693) {
                    class234 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field3617 && (var11.field3609 || (arg1.field3608 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class107.field1974 && var2 < class250.field3857 - 1) {
                    class234 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field3617 && (var12.field3609 || (arg1.field3608 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class199.field3222 && var3 > class498.field7314) {
                    class234 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field3617 && (var13.field3609 || (arg1.field3608 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class199.field3222 && var3 < class531.field7725 - 1) {
                    class234 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field3617 && (var14.field3609 || (arg1.field3608 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class456.field6768 = true;
            }
            arg1.field3609 = false;
            if (arg1.field3621 != null) {
                class234 var15 = arg1.field3621;
                class34.field522.method385(3000.0F, (201.5F - (float) (var15.field3600 + 1) * 50.0F) * 1.5F);
                if (!class478.method2855(var15.field3600, var2, var3)) {
                    class520.field7560[var15.field3600].method190(var2, var3);
                }
                class50 var16 = var15.field3610;
                if (var16 != null) {
                    if (class196.field3150) {
                        if ((var16.field1007 & arg1.field3611) == 0) {
                            class368.method2258(arg0, var4, var2, var3);
                        } else {
                            class77.method693(arg0, var16.field1007, var5, var2, var3);
                        }
                        class34.field522.method372(arg0.field6394, arg0.field6397);
                    }
                    var16.method15(class34.field522, 2);
                }
                for (class440 var17 = var15.field3607; var17 != null; var17 = var17.field6528) {
                    class402 var18 = var17.field6530;
                    if (var18 != null) {
                        if (class196.field3150) {
                            class368.method2258(arg0, var4, var2, var3);
                            class34.field522.method372(arg0.field6394, arg0.field6397);
                        }
                        var18.method15(class34.field522, 2);
                    }
                }
                class34.field522.method385(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class478.method2855(var5, var2, var3);
            if (var19) {
                class520.field7560[var5].method190(var2, var3);
                class311 var20 = arg1.field3619;
                if (var20 != null && var20.field4704) {
                    if (var20.field4705) {
                        class34.field522.method385(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class196.field3150) {
                        class368.method2258(arg0, var4, var2, var3);
                        class34.field522.method372(arg0.field6394, arg0.field6397);
                    }
                    class385 var21 = var20.method15(class34.field522, 2);
                    if (var21 != null) {
                        var21.field5624 = var20;
                        var21.field5625 = var4;
                        var21.field5621 = var2;
                        var21.field5623 = var3;
                        class146.field2446.method531((byte) -118, var21);
                    }
                    if (var20.field4705) {
                        class34.field522.method385(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class50 var24 = arg1.field3610;
            class210 var25 = arg1.field3605;
            if (var24 != null || var25 != null) {
                if (class107.field1974 == var2) {
                    var22++;
                } else if (class107.field1974 < var2) {
                    var22 += 2;
                }
                if (class199.field3222 == var3) {
                    var22 += 3;
                } else if (class199.field3222 > var3) {
                    var22 += 6;
                }
                var23 = class405.field6100[var22];
                arg1.field3611 = class108.field1988[var22];
            }
            if (var24 != null) {
                if ((var24.field1007 & class128.field2189[var22]) == 0) {
                    arg1.field3616 = 0;
                } else if (var24.field1007 == 16) {
                    arg1.field3616 = 3;
                    arg1.field3622 = class10.field143[var22];
                    arg1.field3603 = (byte) (3 - arg1.field3622);
                } else if (var24.field1007 == 32) {
                    arg1.field3616 = 6;
                    arg1.field3622 = class243.field3772[var22];
                    arg1.field3603 = (byte) (6 - arg1.field3622);
                } else if (var24.field1007 == 64) {
                    arg1.field3616 = 12;
                    arg1.field3622 = class8.field118[var22];
                    arg1.field3603 = (byte) (12 - arg1.field3622);
                } else {
                    arg1.field3616 = 9;
                    arg1.field3622 = class61.field1261[var22];
                    arg1.field3603 = (byte) (9 - arg1.field3622);
                }
                if ((var24.field1007 & var23) != 0 && !class288.method1805(var5, var2, var3, var24.field1007)) {
                    if (class196.field3150) {
                        class368.method2258(arg0, var4, var2, var3);
                        class34.field522.method372(arg0.field6394, arg0.field6397);
                    }
                    class385 var26 = var24.method15(class34.field522, 2);
                    if (var26 != null) {
                        var26.field5624 = var24;
                        var26.field5625 = var4;
                        var26.field5621 = var2;
                        var26.field5623 = var3;
                        class146.field2446.method531((byte) -40, var26);
                    }
                }
                class50 var27 = arg1.field3613;
                if (var27 != null && (var27.field1007 & var23) != 0 && !class288.method1805(var5, var2, var3, var27.field1007)) {
                    if (class196.field3150) {
                        class368.method2258(arg0, var4, var2, var3);
                        class34.field522.method372(arg0.field6394, arg0.field6397);
                    }
                    class385 var28 = var27.method15(class34.field522, 2);
                    if (var28 != null) {
                        var28.field5624 = var27;
                        var28.field5625 = var4;
                        var28.field5621 = var2;
                        var28.field5623 = var3;
                        class146.field2446.method531((byte) 98, var28);
                    }
                }
            }
            if (var25 != null && !class83.method778(var5, var2, var3, var25.method227((byte) -104))) {
                class210 var29 = arg1.field3602;
                class34.field522.method385(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field3357 & var23) != 0) {
                    if (class196.field3150) {
                        class368.method2258(arg0, var4, var2, var3);
                        class34.field522.method372(arg0.field6394, arg0.field6397);
                    }
                    class385 var30 = var25.method15(class34.field522, 2);
                    if (var30 != null) {
                        var30.field5624 = var25;
                        var30.field5625 = var4;
                        var30.field5621 = var2;
                        var30.field5623 = var3;
                        class146.field2446.method531((byte) 127, var30);
                    }
                } else if (var25.field3357 == 256) {
                    int var31 = var25.field3347 - class233.field3595;
                    int var32 = var25.field3344 - class471.field6987;
                    int var33 = var25.field3358;
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
                    if (class196.field3150) {
                        class368.method2258(arg0, var4, var2, var3);
                        class34.field522.method372(arg0.field6394, arg0.field6397);
                    }
                    if (var35 < var34) {
                        class385 var36 = var25.method15(class34.field522, 2);
                        if (var36 != null) {
                            var36.field5624 = var25;
                            var36.field5625 = var4;
                            var36.field5621 = var2;
                            var36.field5623 = var3;
                            class146.field2446.method531((byte) 104, var36);
                        }
                    } else if (var29 != null) {
                        class385 var37 = var29.method15(class34.field522, 2);
                        if (var37 != null) {
                            var37.field5624 = var29;
                            var37.field5625 = var4;
                            var37.field5621 = var2;
                            var37.field5623 = var3;
                            class146.field2446.method531((byte) 118, var37);
                        }
                    }
                }
                class34.field522.method385(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class311 var38 = arg1.field3619;
                if (var38 != null && !var38.field4704) {
                    if (var38.field4705) {
                        class34.field522.method385(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class196.field3150) {
                        class368.method2258(arg0, var4, var2, var3);
                        class34.field522.method372(arg0.field6394, arg0.field6397);
                    }
                    class385 var39 = var38.method15(class34.field522, 2);
                    if (var39 != null) {
                        var39.field5624 = var38;
                        var39.field5625 = var4;
                        var39.field5621 = var2;
                        var39.field5623 = var3;
                        class146.field2446.method531((byte) 111, var39);
                    }
                    if (var38.field4705) {
                        class34.field522.method385(3000.0F, var9 * 1.5F);
                    }
                }
                class170 var40 = arg1.field3618;
                if (var40 != null && !var40.field2767) {
                    if (class196.field3150) {
                        class368.method2258(arg0, var4, var2, var3);
                        class34.field522.method372(arg0.field6394, arg0.field6397);
                    }
                    class385 var41 = var40.method15(class34.field522, 2);
                    if (var41 != null) {
                        var41.field5624 = var40;
                        var41.field5625 = var4;
                        var41.field5621 = var2;
                        var41.field5623 = var3;
                        class146.field2446.method531((byte) 102, var41);
                    }
                }
            }
            byte var42 = arg1.field3608;
            if (var42 != 0) {
                if (var2 < class107.field1974 && (var42 & 0x4) != 0) {
                    class234 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field3617) {
                        class192.field3104.method1344((byte) -71, var43);
                    }
                }
                if (var3 < class199.field3222 && (var42 & 0x2) != 0) {
                    class234 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field3617) {
                        class192.field3104.method1344((byte) -111, var44);
                    }
                }
                if (var2 > class107.field1974 && (var42 & 0x1) != 0) {
                    class234 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field3617) {
                        class192.field3104.method1344((byte) -53, var45);
                    }
                }
                if (var3 > class199.field3222 && (var42 & 0x8) != 0) {
                    class234 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field3617) {
                        class192.field3104.method1344((byte) -99, var46);
                    }
                }
            }
        }
        if (arg1.field3616 != 0) {
            boolean var47 = true;
            for (class440 var48 = arg1.field3607; var48 != null; var48 = var48.field6528) {
                if (class374.field5485 != var48.field6530.field6074 && (var48.field6526 & arg1.field3616) == arg1.field3622) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class50 var49 = arg1.field3610;
                if (!class288.method1805(var5, var2, var3, var49.field1007)) {
                    if (class196.field3150) {
                        label682: {
                            if (var49.field1007 >= 16) {
                                int var50 = var2 - class107.field1974;
                                int var51 = var3 - class199.field3222;
                                if (var49.field1007 == 16) {
                                    int var52 = var50 - class421.field6346;
                                    int var53 = class421.field6346 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class220.field3464) {
                                        class368.method2258(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field1007 == 32) {
                                    int var54 = class421.field6346 + var50;
                                    int var55 = class421.field6346 + var51;
                                    if (var55 < -var54 && var2 < class493.field7231 && var3 < class220.field3464) {
                                        class368.method2258(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field1007 == 64) {
                                    int var56 = class421.field6346 + var50;
                                    int var57 = var51 - class421.field6346;
                                    if (var57 > var56 && var2 < class493.field7231 && var3 > 0) {
                                        class368.method2258(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field1007 == 128) {
                                    int var58 = var50 - class421.field6346;
                                    int var59 = var51 - class421.field6346;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class368.method2258(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class368.method2258(arg0, var4, var2, var3);
                        }
                        class34.field522.method372(arg0.field6394, arg0.field6397);
                    }
                    class385 var60 = var49.method15(class34.field522, 2);
                    if (var60 != null) {
                        var60.field5624 = var49;
                        var60.field5625 = var4;
                        var60.field5621 = var2;
                        var60.field5623 = var3;
                        class146.field2446.method531((byte) 113, var60);
                    }
                }
                arg1.field3616 = 0;
            }
        }
        if (arg1.field3612) {
            try {
                arg1.field3612 = false;
                int var61 = 0;
                label625: for (class440 var62 = arg1.field3607; var62 != null; var62 = var62.field6528) {
                    class402 var63 = var62.field6530;
                    if (class374.field5485 != var63.field6074) {
                        for (int var64 = var63.field6082; var64 <= var63.field6081; var64++) {
                            for (int var65 = var63.field6077; var65 <= var63.field6075; var65++) {
                                class234 var66 = var8[var64][var65];
                                if (var66.field3609) {
                                    arg1.field3612 = true;
                                    continue label625;
                                }
                                if (var66.field3616 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field6082) {
                                        var67++;
                                    }
                                    if (var64 < var63.field6081) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field6077) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field6075) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field3616) == arg1.field3603) {
                                        arg1.field3612 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class107.field1974 - var63.field6082;
                        int var69 = var63.field6081 - class107.field1974;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class199.field3222 - var63.field6077;
                        int var71 = var63.field6075 - class199.field3222;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field6395[var61] = var63;
                        arg0.field6390[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class402 var75 = arg0.field6395[var74];
                        if (class374.field5485 != var75.field6074) {
                            int var76 = arg0.field6390[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field6073 - class233.field3595;
                                int var78 = var75.field6078 - class471.field6987;
                                int var79 = arg0.field6395[var73].field6073 - class233.field3595;
                                int var80 = arg0.field6395[var73].field6078 - class471.field6987;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class402 var81 = arg0.field6395[var73];
                    var81.field6074 = class374.field5485;
                    if (!class84.method788(var5, var81.field6082, var81.field6081, var81.field6077, var81.field6075, var81.method8(0))) {
                        if (class196.field3150) {
                            if (var81.field6076 == 0) {
                                class493.method2974(arg0, var4, var81.field6082, var81.field6077, var81.field6081, var81.field6075);
                            } else {
                                class368.method2258(arg0, var4, var2, var3);
                                int var82 = var2 - class107.field1974;
                                int var83 = var3 - class199.field3222;
                                if (var81.field6076 == 2) {
                                    if (var83 > -var82) {
                                        class111.method930(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class111.method930(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class111.method930(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class111.method930(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class34.field522.method372(arg0.field6394, arg0.field6397);
                        }
                        class385 var84 = var81.method15(class34.field522, 2);
                        if (var84 != null) {
                            var84.field5624 = var81;
                            var84.field5625 = var4;
                            var84.field5621 = var81.field6082;
                            var84.field5623 = var81.field6077;
                            class146.field2446.method531((byte) 126, var84);
                        }
                    }
                    for (int var85 = var81.field6082; var85 <= var81.field6081; var85++) {
                        for (int var86 = var81.field6077; var86 <= var81.field6075; var86++) {
                            class234 var87 = var8[var85][var86];
                            if (var87.field3616 != 0) {
                                class192.field3104.method1344((byte) -114, var87);
                            } else if ((var2 != var85 || var3 != var86) && var87.field3617) {
                                class192.field3104.method1344((byte) -125, var87);
                            }
                        }
                    }
                }
                if (arg1.field3612) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field3612 = false;
            }
        }
        if (arg1.field3615 != null && (byte) (class122.field2125 & 0xFF) == arg1.field3601) {
            class502 var88 = arg1.field3615;
            int var89 = class520.field7560[var4].method177(var2, var3);
            int var90;
            if (var4 < class138.field2320 - 1) {
                var90 = class520.field7560[var4].method177(var2, var3) - class520.field7560[var4 + 1].method177(var2, var3);
            } else {
                var90 = 0x8 << class353.field5216;
            }
            class63.field1292.method837(var6, var89, var7, arg0.field6392);
            int var91 = arg0.field6392[2];
            class63.field1292.method837(var6, var89 - var90, var7, arg0.field6392);
            int var92 = arg0.field6392[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class250.field3865;
            int var96 = class250.field3865 + var94;
            var88.field7345 = var95;
            var88.field7342 = var96;
            var88.field7341 = true;
            class34.field522.method414(var88);
        }
        if (!arg1.field3617) {
            return;
        }
        if (arg1.field3616 != 0) {
            return;
        }
        if (var2 <= class107.field1974 && var2 > class450.field6693) {
            class234 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field3617) {
                return;
            }
        }
        if (var2 >= class107.field1974 && var2 < class250.field3857 - 1) {
            class234 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field3617) {
                return;
            }
        }
        if (var3 <= class199.field3222 && var3 > class498.field7314) {
            class234 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field3617) {
                return;
            }
        }
        if (var3 >= class199.field3222 && var3 < class531.field7725 - 1) {
            class234 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field3617) {
                return;
            }
        }
        arg1.field3617 = false;
        class496.field7289--;
        class170 var101 = arg1.field3618;
        if (var101 != null && var101.field2767) {
            if (class196.field3150) {
                class368.method2258(arg0, var4, var2, var3);
                class34.field522.method372(arg0.field6394, arg0.field6397);
            }
            class385 var102 = var101.method15(class34.field522, 2);
            if (var102 != null) {
                var102.field5624 = var101;
                var102.field5625 = var4;
                var102.field5621 = var2;
                var102.field5623 = var3;
                class146.field2446.method531((byte) -78, var102);
            }
        }
        if (arg1.field3611 != 0) {
            class210 var103 = arg1.field3605;
            if (var103 != null && !class83.method778(var5, var2, var3, var103.method227((byte) -104))) {
                if ((var103.field3357 & arg1.field3611) != 0) {
                    if (class196.field3150) {
                        class368.method2258(arg0, var4, var2, var3);
                        class34.field522.method372(arg0.field6394, arg0.field6397);
                    }
                    class385 var104 = var103.method15(class34.field522, 2);
                    if (var104 != null) {
                        var104.field5624 = var103;
                        var104.field5625 = var4;
                        var104.field5621 = var2;
                        var104.field5623 = var3;
                        class146.field2446.method531((byte) 126, var104);
                    }
                } else if (var103.field3357 == 256) {
                    int var105 = var103.field3347 - class233.field3595;
                    int var106 = var103.field3344 - class471.field6987;
                    int var107 = var103.field3358;
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
                    if (class196.field3150) {
                        class368.method2258(arg0, var4, var2, var3);
                        class34.field522.method372(arg0.field6394, arg0.field6397);
                    }
                    class210 var110 = arg1.field3602;
                    if (var109 > var108) {
                        class385 var111 = var103.method15(class34.field522, 2);
                        if (var111 != null) {
                            var111.field5624 = var103;
                            var111.field5625 = var4;
                            var111.field5621 = var2;
                            var111.field5623 = var3;
                            class146.field2446.method531((byte) -19, var111);
                        }
                    } else if (var110 != null) {
                        class385 var112 = var110.method15(class34.field522, 2);
                        if (var112 != null) {
                            var112.field5624 = var110;
                            var112.field5625 = var4;
                            var112.field5621 = var2;
                            var112.field5623 = var3;
                            class146.field2446.method531((byte) 123, var112);
                        }
                    }
                }
            }
            class50 var113 = arg1.field3610;
            class50 var114 = arg1.field3613;
            if (var114 != null && (var114.field1007 & arg1.field3611) != 0 && !class288.method1805(var5, var2, var3, var114.field1007)) {
                if (class196.field3150) {
                    class77.method693(arg0, var114.field1007, var4, var2, var3);
                    class34.field522.method372(arg0.field6394, arg0.field6397);
                }
                class385 var115 = var114.method15(class34.field522, 2);
                if (var115 != null) {
                    var115.field5624 = var114;
                    var115.field5625 = var4;
                    var115.field5621 = var2;
                    var115.field5623 = var3;
                    class146.field2446.method531((byte) 101, var115);
                }
            }
            if (var113 != null && (var113.field1007 & arg1.field3611) != 0 && !class288.method1805(var5, var2, var3, var113.field1007)) {
                if (class196.field3150) {
                    class77.method693(arg0, var113.field1007, var4, var2, var3);
                    class34.field522.method372(arg0.field6394, arg0.field6397);
                }
                class385 var116 = var113.method15(class34.field522, 2);
                if (var116 != null) {
                    var116.field5624 = var113;
                    var116.field5625 = var4;
                    var116.field5621 = var2;
                    var116.field5623 = var3;
                    class146.field2446.method531((byte) -99, var116);
                }
            }
        }
        if (var4 < class138.field2320 - 1) {
            class234 var117 = class518.field7511[var4 + 1][var2][var3];
            if (var117 != null && var117.field3617) {
                class192.field3104.method1343(var117, 1);
            }
        }
        if (var2 < class107.field1974) {
            class234 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field3617) {
                class192.field3104.method1344((byte) -109, var118);
            }
        }
        if (var3 < class199.field3222) {
            class234 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field3617) {
                class192.field3104.method1344((byte) -84, var119);
            }
        }
        if (var2 > class107.field1974) {
            class234 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field3617) {
                class192.field3104.method1344((byte) -99, var120);
            }
        }
        if (var3 > class199.field3222) {
            class234 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field3617) {
                class192.field3104.method1344((byte) -99, var121);
            }
        }
    }
}
