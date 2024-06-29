import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class80 extends class15 {

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "[B")
    public byte[] field955;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "[I")
    public static int[] field956 = new int[13];

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "Lec;")
    public static class40 field954 = new class40(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public static final boolean method401(boolean arg0, String arg1) {
        if (arg0) {
            return true;
        } else {
            field953++;
            return class462.method2722((byte) 116, 10, arg1, true);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lrs;Lqa;)V")
    public static final void method402(class258 arg0, class263 arg1) {
        if (!arg1.field3795) {
            return;
        }
        short var2 = arg1.field3781;
        short var3 = arg1.field3790;
        byte var4 = arg1.field3796;
        byte var5 = arg1.field3792;
        int var6 = (var2 << class482.field6812) + class137.field1663;
        int var7 = (var3 << class482.field6812) + class137.field1663;
        class263[][] var8 = class293.field4356[var4];
        float var9;
        if (class398.field5667 == class361.field5208) {
            class415.field5985.method1382(class443.field6329[0].method1857(var6, var7), class35.method177(var2, var3), class71.method362(var2, var3), class483.method2853(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class415.field5985.method1498(3000.0F, var9 * 1.5F);
        if (arg1.field3785) {
            if (class183.field2351) {
                if (var4 > 0) {
                    class263 var10 = class293.field4356[var4 - 1][var2][var3];
                    if (var10 != null && var10.field3795) {
                        return;
                    }
                }
                if (var2 <= class352.field5065 && var2 > class63.field785) {
                    class263 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field3795 && (var11.field3785 || (arg1.field3802 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class352.field5065 && var2 < class216.field2980 - 1) {
                    class263 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field3795 && (var12.field3785 || (arg1.field3802 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class25.field345 && var3 > class360.field5183) {
                    class263 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field3795 && (var13.field3785 || (arg1.field3802 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class25.field345 && var3 < class257.field3718 - 1) {
                    class263 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field3795 && (var14.field3785 || (arg1.field3802 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class183.field2351 = true;
            }
            arg1.field3785 = false;
            if (arg1.field3788 != null) {
                class263 var15 = arg1.field3788;
                class415.field5985.method1498(3000.0F, (201.5F - (float) (var15.field3792 + 1) * 50.0F) * 1.5F);
                if (!class328.method1989(var15.field3792, var2, var3)) {
                    class398.field5667[var15.field3792].method1859(var2, var3);
                }
                class261 var16 = var15.field3783;
                if (var16 != null) {
                    if (class183.field2363) {
                        if ((var16.field3761 & arg1.field3793) == 0) {
                            class168.method823(arg0, var4, var2, var3);
                        } else {
                            class52.method282(arg0, var16.field3761, var5, var2, var3);
                        }
                        class415.field5985.method1370(arg0.field3730, arg0.field3732);
                    }
                    var16.method19(126, class415.field5985);
                }
                for (class248 var17 = var15.field3801; var17 != null; var17 = var17.field3490) {
                    class83 var18 = var17.field3487;
                    if (var18 != null) {
                        if (class183.field2363) {
                            class168.method823(arg0, var4, var2, var3);
                            class415.field5985.method1370(arg0.field3730, arg0.field3732);
                        }
                        var18.method19(113, class415.field5985);
                    }
                }
                class415.field5985.method1498(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class328.method1989(var5, var2, var3);
            if (var19) {
                class398.field5667[var5].method1859(var2, var3);
                class60 var20 = arg1.field3798;
                if (var20 != null && var20.field746) {
                    if (var20.field751) {
                        class415.field5985.method1498(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class183.field2363) {
                        class168.method823(arg0, var4, var2, var3);
                        class415.field5985.method1370(arg0.field3730, arg0.field3732);
                    }
                    class451 var21 = var20.method19(109, class415.field5985);
                    if (var21 != null) {
                        var21.field6378 = var20;
                        var21.field6380 = var4;
                        var21.field6381 = var2;
                        var21.field6385 = var3;
                        class305.field4504.method2336(var21, (byte) -56);
                    }
                    if (var20.field751) {
                        class415.field5985.method1498(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class261 var24 = arg1.field3783;
            class183 var25 = arg1.field3784;
            if (var24 != null || var25 != null) {
                if (class352.field5065 == var2) {
                    var22++;
                } else if (class352.field5065 < var2) {
                    var22 += 2;
                }
                if (class25.field345 == var3) {
                    var22 += 3;
                } else if (class25.field345 > var3) {
                    var22 += 6;
                }
                var23 = class468.field6581[var22];
                arg1.field3793 = class262.field3775[var22];
            }
            if (var24 != null) {
                if ((var24.field3761 & class368.field5257[var22]) == 0) {
                    arg1.field3789 = 0;
                } else if (var24.field3761 == 16) {
                    arg1.field3789 = 3;
                    arg1.field3797 = class237.field3282[var22];
                    arg1.field3804 = (byte) (3 - arg1.field3797);
                } else if (var24.field3761 == 32) {
                    arg1.field3789 = 6;
                    arg1.field3797 = class220.field3078[var22];
                    arg1.field3804 = (byte) (6 - arg1.field3797);
                } else if (var24.field3761 == 64) {
                    arg1.field3789 = 12;
                    arg1.field3797 = class60.field747[var22];
                    arg1.field3804 = (byte) (12 - arg1.field3797);
                } else {
                    arg1.field3789 = 9;
                    arg1.field3797 = class282.field4109[var22];
                    arg1.field3804 = (byte) (9 - arg1.field3797);
                }
                if ((var24.field3761 & var23) != 0 && !class128.method608(var5, var2, var3, var24.field3761)) {
                    if (class183.field2363) {
                        class168.method823(arg0, var4, var2, var3);
                        class415.field5985.method1370(arg0.field3730, arg0.field3732);
                    }
                    class451 var26 = var24.method19(97, class415.field5985);
                    if (var26 != null) {
                        var26.field6378 = var24;
                        var26.field6380 = var4;
                        var26.field6381 = var2;
                        var26.field6385 = var3;
                        class305.field4504.method2336(var26, (byte) -56);
                    }
                }
                class261 var27 = arg1.field3780;
                if (var27 != null && (var27.field3761 & var23) != 0 && !class128.method608(var5, var2, var3, var27.field3761)) {
                    if (class183.field2363) {
                        class168.method823(arg0, var4, var2, var3);
                        class415.field5985.method1370(arg0.field3730, arg0.field3732);
                    }
                    class451 var28 = var27.method19(105, class415.field5985);
                    if (var28 != null) {
                        var28.field6378 = var27;
                        var28.field6380 = var4;
                        var28.field6381 = var2;
                        var28.field6385 = var3;
                        class305.field4504.method2336(var28, (byte) -56);
                    }
                }
            }
            if (var25 != null && !class314.method1942(var5, var2, var3, var25.method126(-124))) {
                class183 var29 = arg1.field3782;
                class415.field5985.method1498(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field2353 & var23) != 0) {
                    if (class183.field2363) {
                        class168.method823(arg0, var4, var2, var3);
                        class415.field5985.method1370(arg0.field3730, arg0.field3732);
                    }
                    class451 var30 = var25.method19(99, class415.field5985);
                    if (var30 != null) {
                        var30.field6378 = var25;
                        var30.field6380 = var4;
                        var30.field6381 = var2;
                        var30.field6385 = var3;
                        class305.field4504.method2336(var30, (byte) -56);
                    }
                } else if (var25.field2353 == 256) {
                    int var31 = var25.field2355 - class404.field5739;
                    int var32 = var25.field2360 - class68.field851;
                    int var33 = var25.field2362;
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
                    if (class183.field2363) {
                        class168.method823(arg0, var4, var2, var3);
                        class415.field5985.method1370(arg0.field3730, arg0.field3732);
                    }
                    if (var35 < var34) {
                        class451 var36 = var25.method19(120, class415.field5985);
                        if (var36 != null) {
                            var36.field6378 = var25;
                            var36.field6380 = var4;
                            var36.field6381 = var2;
                            var36.field6385 = var3;
                            class305.field4504.method2336(var36, (byte) -56);
                        }
                    } else if (var29 != null) {
                        class451 var37 = var29.method19(98, class415.field5985);
                        if (var37 != null) {
                            var37.field6378 = var29;
                            var37.field6380 = var4;
                            var37.field6381 = var2;
                            var37.field6385 = var3;
                            class305.field4504.method2336(var37, (byte) -56);
                        }
                    }
                }
                class415.field5985.method1498(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class60 var38 = arg1.field3798;
                if (var38 != null && !var38.field746) {
                    if (var38.field751) {
                        class415.field5985.method1498(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class183.field2363) {
                        class168.method823(arg0, var4, var2, var3);
                        class415.field5985.method1370(arg0.field3730, arg0.field3732);
                    }
                    class451 var39 = var38.method19(104, class415.field5985);
                    if (var39 != null) {
                        var39.field6378 = var38;
                        var39.field6380 = var4;
                        var39.field6381 = var2;
                        var39.field6385 = var3;
                        class305.field4504.method2336(var39, (byte) -56);
                    }
                    if (var38.field751) {
                        class415.field5985.method1498(3000.0F, var9 * 1.5F);
                    }
                }
                class287 var40 = arg1.field3787;
                if (var40 != null && !var40.field4299) {
                    if (class183.field2363) {
                        class168.method823(arg0, var4, var2, var3);
                        class415.field5985.method1370(arg0.field3730, arg0.field3732);
                    }
                    class451 var41 = var40.method19(125, class415.field5985);
                    if (var41 != null) {
                        var41.field6378 = var40;
                        var41.field6380 = var4;
                        var41.field6381 = var2;
                        var41.field6385 = var3;
                        class305.field4504.method2336(var41, (byte) -56);
                    }
                }
            }
            byte var42 = arg1.field3802;
            if (var42 != 0) {
                if (var2 < class352.field5065 && (var42 & 0x4) != 0) {
                    class263 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field3795) {
                        class96.field1187.method714(var43, 74);
                    }
                }
                if (var3 < class25.field345 && (var42 & 0x2) != 0) {
                    class263 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field3795) {
                        class96.field1187.method714(var44, 96);
                    }
                }
                if (var2 > class352.field5065 && (var42 & 0x1) != 0) {
                    class263 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field3795) {
                        class96.field1187.method714(var45, 125);
                    }
                }
                if (var3 > class25.field345 && (var42 & 0x8) != 0) {
                    class263 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field3795) {
                        class96.field1187.method714(var46, 94);
                    }
                }
            }
        }
        if (arg1.field3789 != 0) {
            boolean var47 = true;
            for (class248 var48 = arg1.field3801; var48 != null; var48 = var48.field3490) {
                if (class76.field920 != var48.field3487.field998 && (var48.field3488 & arg1.field3789) == arg1.field3797) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class261 var49 = arg1.field3783;
                if (!class128.method608(var5, var2, var3, var49.field3761)) {
                    if (class183.field2363) {
                        label687: {
                            if (var49.field3761 >= 16) {
                                int var50 = var2 - class352.field5065;
                                int var51 = var3 - class25.field345;
                                if (var49.field3761 == 16) {
                                    int var52 = var50 - class137.field1663;
                                    int var53 = class137.field1663 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class225.field3116) {
                                        class168.method823(arg0, var4, var2 - 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var49.field3761 == 32) {
                                    int var54 = class137.field1663 + var50;
                                    int var55 = class137.field1663 + var51;
                                    if (var55 < -var54 && var2 < class176.field2122 && var3 < class225.field3116) {
                                        class168.method823(arg0, var4, var2 + 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var49.field3761 == 64) {
                                    int var56 = class137.field1663 + var50;
                                    int var57 = var51 - class137.field1663;
                                    if (var57 > var56 && var2 < class176.field2122 && var3 > 0) {
                                        class168.method823(arg0, var4, var2 + 1, var3 - 1);
                                        break label687;
                                    }
                                } else if (var49.field3761 == 128) {
                                    int var58 = var50 - class137.field1663;
                                    int var59 = var51 - class137.field1663;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class168.method823(arg0, var4, var2 - 1, var3 - 1);
                                        break label687;
                                    }
                                }
                            }
                            class168.method823(arg0, var4, var2, var3);
                        }
                        class415.field5985.method1370(arg0.field3730, arg0.field3732);
                    }
                    class451 var60 = var49.method19(116, class415.field5985);
                    if (var60 != null) {
                        var60.field6378 = var49;
                        var60.field6380 = var4;
                        var60.field6381 = var2;
                        var60.field6385 = var3;
                        class305.field4504.method2336(var60, (byte) -56);
                    }
                }
                arg1.field3789 = 0;
            }
        }
        if (arg1.field3794) {
            try {
                arg1.field3794 = false;
                int var61 = 0;
                label630: for (class248 var62 = arg1.field3801; var62 != null; var62 = var62.field3490) {
                    class83 var63 = var62.field3487;
                    if (class76.field920 != var63.field998) {
                        for (int var64 = var63.field999; var64 <= var63.field1011; var64++) {
                            for (int var65 = var63.field1004; var65 <= var63.field997; var65++) {
                                class263 var66 = var8[var64][var65];
                                if (var66.field3785) {
                                    arg1.field3794 = true;
                                    continue label630;
                                }
                                if (var66.field3789 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field999) {
                                        var67++;
                                    }
                                    if (var64 < var63.field1011) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field1004) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field997) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field3789) == arg1.field3804) {
                                        arg1.field3794 = true;
                                        continue label630;
                                    }
                                }
                            }
                        }
                        int var68 = class352.field5065 - var63.field999;
                        int var69 = var63.field1011 - class352.field5065;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class25.field345 - var63.field1004;
                        int var71 = var63.field997 - class25.field345;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field3723[var61] = var63;
                        arg0.field3731[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class83 var75 = arg0.field3723[var74];
                        if (class76.field920 != var75.field998) {
                            int var76 = arg0.field3731[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field1008 - class404.field5739;
                                int var78 = var75.field1005 - class68.field851;
                                int var79 = arg0.field3723[var73].field1008 - class404.field5739;
                                int var80 = arg0.field3723[var73].field1005 - class68.field851;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class83 var81 = arg0.field3723[var73];
                    var81.field998 = class76.field920;
                    if (!class368.method2221(var5, var81.field999, var81.field1011, var81.field1004, var81.field997, var81.method17(-8960))) {
                        if (class183.field2363) {
                            if (var81.field1009 == 0) {
                                class162.method786(arg0, var4, var81.field999, var81.field1004, var81.field1011, var81.field997);
                            } else {
                                class168.method823(arg0, var4, var2, var3);
                                int var82 = var2 - class352.field5065;
                                int var83 = var3 - class25.field345;
                                if (var81.field1009 == 2) {
                                    if (var83 > -var82) {
                                        class200.method1095(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class200.method1095(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class200.method1095(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class200.method1095(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class415.field5985.method1370(arg0.field3730, arg0.field3732);
                        }
                        class451 var84 = var81.method19(107, class415.field5985);
                        if (var84 != null) {
                            var84.field6378 = var81;
                            var84.field6380 = var4;
                            var84.field6381 = var81.field999;
                            var84.field6385 = var81.field1004;
                            class305.field4504.method2336(var84, (byte) -56);
                        }
                    }
                    for (int var85 = var81.field999; var85 <= var81.field1011; var85++) {
                        for (int var86 = var81.field1004; var86 <= var81.field997; var86++) {
                            class263 var87 = var8[var85][var86];
                            if (var87.field3789 != 0) {
                                class96.field1187.method714(var87, 98);
                            } else if ((var2 != var85 || var3 != var86) && var87.field3795) {
                                class96.field1187.method714(var87, 111);
                            }
                        }
                    }
                }
                if (arg1.field3794) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field3794 = false;
            }
        }
        if (arg1.field3791 != null) {
            if ((byte) (class113.field1389 & 0xFF) == arg1.field3800) {
                class46 var88 = arg1.field3791;
                int var89 = class398.field5667[var4].method1861(var2, var3);
                int var90;
                if (var4 < class346.field4937 - 1) {
                    var90 = class398.field5667[var4].method1861(var2, var3) - class398.field5667[var4 + 1].method1861(var2, var3);
                } else {
                    var90 = 1024;
                }
                class83.field1003.method557(var6, var89, var7, arg0.field3726);
                int var91 = arg0.field3726[2];
                class83.field1003.method557(var6, var89 - var90, var7, arg0.field3726);
                int var92 = arg0.field3726[2];
                int var93 = var91;
                int var94 = var92;
                if (var91 > var92) {
                    var93 = var92;
                    var94 = var91;
                }
                int var95 = var93 - class93.field1159;
                int var96 = class93.field1159 + var94;
                if (var95 < var96 - 1597) {
                    var95 = var96 - 1597;
                }
                var88.field604 = var95;
                var88.field605 = var96;
                var88.field603 = true;
                class415.field5985.method1434(var88);
            } else {
                arg1.field3791 = null;
            }
        }
        if (!arg1.field3795) {
            return;
        }
        if (arg1.field3789 != 0) {
            return;
        }
        if (var2 <= class352.field5065 && var2 > class63.field785) {
            class263 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field3795) {
                return;
            }
        }
        if (var2 >= class352.field5065 && var2 < class216.field2980 - 1) {
            class263 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field3795) {
                return;
            }
        }
        if (var3 <= class25.field345 && var3 > class360.field5183) {
            class263 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field3795) {
                return;
            }
        }
        if (var3 >= class25.field345 && var3 < class257.field3718 - 1) {
            class263 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field3795) {
                return;
            }
        }
        arg1.field3795 = false;
        class382.field5428--;
        class287 var101 = arg1.field3787;
        if (var101 != null && var101.field4299) {
            if (class183.field2363) {
                class168.method823(arg0, var4, var2, var3);
                class415.field5985.method1370(arg0.field3730, arg0.field3732);
            }
            class451 var102 = var101.method19(97, class415.field5985);
            if (var102 != null) {
                var102.field6378 = var101;
                var102.field6380 = var4;
                var102.field6381 = var2;
                var102.field6385 = var3;
                class305.field4504.method2336(var102, (byte) -56);
            }
        }
        if (arg1.field3793 != 0) {
            class183 var103 = arg1.field3784;
            if (var103 != null && !class314.method1942(var5, var2, var3, var103.method126(-116))) {
                if ((var103.field2353 & arg1.field3793) != 0) {
                    if (class183.field2363) {
                        class168.method823(arg0, var4, var2, var3);
                        class415.field5985.method1370(arg0.field3730, arg0.field3732);
                    }
                    class451 var104 = var103.method19(109, class415.field5985);
                    if (var104 != null) {
                        var104.field6378 = var103;
                        var104.field6380 = var4;
                        var104.field6381 = var2;
                        var104.field6385 = var3;
                        class305.field4504.method2336(var104, (byte) -56);
                    }
                } else if (var103.field2353 == 256) {
                    int var105 = var103.field2355 - class404.field5739;
                    int var106 = var103.field2360 - class68.field851;
                    int var107 = var103.field2362;
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
                    if (class183.field2363) {
                        class168.method823(arg0, var4, var2, var3);
                        class415.field5985.method1370(arg0.field3730, arg0.field3732);
                    }
                    class183 var110 = arg1.field3782;
                    if (var109 > var108) {
                        class451 var111 = var103.method19(110, class415.field5985);
                        if (var111 != null) {
                            var111.field6378 = var103;
                            var111.field6380 = var4;
                            var111.field6381 = var2;
                            var111.field6385 = var3;
                            class305.field4504.method2336(var111, (byte) -56);
                        }
                    } else if (var110 != null) {
                        class451 var112 = var110.method19(100, class415.field5985);
                        if (var112 != null) {
                            var112.field6378 = var110;
                            var112.field6380 = var4;
                            var112.field6381 = var2;
                            var112.field6385 = var3;
                            class305.field4504.method2336(var112, (byte) -56);
                        }
                    }
                }
            }
            class261 var113 = arg1.field3783;
            class261 var114 = arg1.field3780;
            if (var114 != null && (var114.field3761 & arg1.field3793) != 0 && !class128.method608(var5, var2, var3, var114.field3761)) {
                if (class183.field2363) {
                    class52.method282(arg0, var114.field3761, var4, var2, var3);
                    class415.field5985.method1370(arg0.field3730, arg0.field3732);
                }
                class451 var115 = var114.method19(124, class415.field5985);
                if (var115 != null) {
                    var115.field6378 = var114;
                    var115.field6380 = var4;
                    var115.field6381 = var2;
                    var115.field6385 = var3;
                    class305.field4504.method2336(var115, (byte) -56);
                }
            }
            if (var113 != null && (var113.field3761 & arg1.field3793) != 0 && !class128.method608(var5, var2, var3, var113.field3761)) {
                if (class183.field2363) {
                    class52.method282(arg0, var113.field3761, var4, var2, var3);
                    class415.field5985.method1370(arg0.field3730, arg0.field3732);
                }
                class451 var116 = var113.method19(107, class415.field5985);
                if (var116 != null) {
                    var116.field6378 = var113;
                    var116.field6380 = var4;
                    var116.field6381 = var2;
                    var116.field6385 = var3;
                    class305.field4504.method2336(var116, (byte) -56);
                }
            }
        }
        if (var4 < class346.field4937 - 1) {
            class263 var117 = class293.field4356[var4 + 1][var2][var3];
            if (var117 != null && var117.field3795) {
                class96.field1187.method713(-121, var117);
            }
        }
        if (var2 < class352.field5065) {
            class263 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field3795) {
                class96.field1187.method714(var118, 74);
            }
        }
        if (var3 < class25.field345) {
            class263 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field3795) {
                class96.field1187.method714(var119, 102);
            }
        }
        if (var2 > class352.field5065) {
            class263 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field3795) {
                class96.field1187.method714(var120, 84);
            }
        }
        if (var3 > class25.field345) {
            class263 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field3795) {
                class96.field1187.method714(var121, 69);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(Z)V")
    public static void method403(boolean arg0) {
        if (arg0) {
            field956 = null;
            field954 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "([B)V")
    public class80(byte[] arg0) {
        this.field955 = arg0;
    }
}
