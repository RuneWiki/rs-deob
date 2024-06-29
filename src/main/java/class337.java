import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class337 extends class403 {

    @OriginalMember(owner = "client!np", name = "B", descriptor = "Ljava/lang/Object;")
    private Object field5076;

    @OriginalMember(owner = "client!np", name = "E", descriptor = "[I")
    public static int[] field5079 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!np", name = "H", descriptor = "[I")
    public static int[] field5082 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!np", name = "C", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!np", name = "D", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!np", name = "F", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!np", name = "G", descriptor = "Lcq;")
    public static class324 field5081;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(III)Z")
    public static final boolean method2161(int arg0, int arg1, int arg2) {
        field5077++;
        if (arg0 > -37) {
            field5081 = null;
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class337(Object arg0, int arg1) {
        super(arg1);
        this.field5076 = arg0;
    }

    @OriginalMember(owner = "client!np", name = "e", descriptor = "(I)Z")
    public final boolean method432(int arg0) {
        if (arg0 == 28015) {
            field5080++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lqf;Liq;)V")
    public static final void method2162(class478 arg0, class429 arg1) {
        if (!arg1.field6377) {
            return;
        }
        short var2 = arg1.field6375;
        short var3 = arg1.field6372;
        byte var4 = arg1.field6374;
        byte var5 = arg1.field6368;
        int var6 = (var2 << class426.field6345) + class130.field2075;
        int var7 = (var3 << class426.field6345) + class130.field2075;
        class429[][] var8 = class380.field5761[var4];
        float var9;
        if (class88.field1546 == class335.field5061) {
            class95.field1609.method214(class43.field829[0].method371(var6, var7), class164.method1212(var2, var3), class500.method2992(var2, var3), class4.method33(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class95.field1609.method300(3000.0F, var9 * 1.5F);
        if (arg1.field6371) {
            if (class416.field6219) {
                if (var4 > 0) {
                    class429 var10 = class380.field5761[var4 - 1][var2][var3];
                    if (var10 != null && var10.field6377) {
                        return;
                    }
                }
                if (var2 <= class267.field3846 && var2 > class451.field6738) {
                    class429 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field6377 && (var11.field6371 || (arg1.field6363 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class267.field3846 && var2 < class1.field2 - 1) {
                    class429 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field6377 && (var12.field6371 || (arg1.field6363 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class388.field5834 && var3 > class363.field5501) {
                    class429 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field6377 && (var13.field6371 || (arg1.field6363 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class388.field5834 && var3 < class252.field3602 - 1) {
                    class429 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field6377 && (var14.field6371 || (arg1.field6363 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class416.field6219 = true;
            }
            arg1.field6371 = false;
            if (arg1.field6389 != null) {
                class429 var15 = arg1.field6389;
                class95.field1609.method300(3000.0F, (201.5F - (float) (var15.field6368 + 1) * 50.0F) * 1.5F);
                if (!class341.method2177(var15.field6368, var2, var3)) {
                    class88.field1546[var15.field6368].method365(var2, var3);
                }
                class241 var16 = var15.field6370;
                if (var16 != null) {
                    if (class165.field2567) {
                        if ((var16.field3475 & arg1.field6384) == 0) {
                            class250.method1610(arg0, var4, var2, var3);
                        } else {
                            class500.method2994(arg0, var16.field3475, var5, var2, var3);
                        }
                        class95.field1609.method289(arg0.field7132, arg0.field7128);
                    }
                    var16.method13(false, class95.field1609);
                }
                for (class166 var17 = var15.field6364; var17 != null; var17 = var17.field2572) {
                    class417 var18 = var17.field2576;
                    if (var18 != null) {
                        if (class165.field2567) {
                            class250.method1610(arg0, var4, var2, var3);
                            class95.field1609.method289(arg0.field7132, arg0.field7128);
                        }
                        var18.method13(false, class95.field1609);
                    }
                }
                class95.field1609.method300(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class341.method2177(var5, var2, var3);
            if (var19) {
                class88.field1546[var5].method365(var2, var3);
                class480 var20 = arg1.field6366;
                if (var20 != null && var20.field7152) {
                    if (var20.field7143) {
                        class95.field1609.method300(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class165.field2567) {
                        class250.method1610(arg0, var4, var2, var3);
                        class95.field1609.method289(arg0.field7132, arg0.field7128);
                    }
                    class163 var21 = var20.method13(false, class95.field1609);
                    if (var21 != null) {
                        var21.field2523 = var20;
                        var21.field2517 = var4;
                        var21.field2520 = var2;
                        var21.field2524 = var3;
                        class221.field3167.method1636(9, var21);
                    }
                    if (var20.field7143) {
                        class95.field1609.method300(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class241 var24 = arg1.field6370;
            class506 var25 = arg1.field6380;
            if (var24 != null || var25 != null) {
                if (class267.field3846 == var2) {
                    var22++;
                } else if (class267.field3846 < var2) {
                    var22 += 2;
                }
                if (class388.field5834 == var3) {
                    var22 += 3;
                } else if (class388.field5834 > var3) {
                    var22 += 6;
                }
                var23 = class409.field6136[var22];
                arg1.field6384 = class528.field7796[var22];
            }
            if (var24 != null) {
                if ((var24.field3475 & class76.field1274[var22]) == 0) {
                    arg1.field6369 = 0;
                } else if (var24.field3475 == 16) {
                    arg1.field6369 = 3;
                    arg1.field6382 = class65.field1127[var22];
                    arg1.field6373 = (byte) (3 - arg1.field6382);
                } else if (var24.field3475 == 32) {
                    arg1.field6369 = 6;
                    arg1.field6382 = class245.field3523[var22];
                    arg1.field6373 = (byte) (6 - arg1.field6382);
                } else if (var24.field3475 == 64) {
                    arg1.field6369 = 12;
                    arg1.field6382 = class441.field6595[var22];
                    arg1.field6373 = (byte) (12 - arg1.field6382);
                } else {
                    arg1.field6369 = 9;
                    arg1.field6382 = class363.field5507[var22];
                    arg1.field6373 = (byte) (9 - arg1.field6382);
                }
                if ((var24.field3475 & var23) != 0 && !class378.method2353(var5, var2, var3, var24.field3475)) {
                    if (class165.field2567) {
                        class250.method1610(arg0, var4, var2, var3);
                        class95.field1609.method289(arg0.field7132, arg0.field7128);
                    }
                    class163 var26 = var24.method13(false, class95.field1609);
                    if (var26 != null) {
                        var26.field2523 = var24;
                        var26.field2517 = var4;
                        var26.field2520 = var2;
                        var26.field2524 = var3;
                        class221.field3167.method1636(9, var26);
                    }
                }
                class241 var27 = arg1.field6365;
                if (var27 != null && (var27.field3475 & var23) != 0 && !class378.method2353(var5, var2, var3, var27.field3475)) {
                    if (class165.field2567) {
                        class250.method1610(arg0, var4, var2, var3);
                        class95.field1609.method289(arg0.field7132, arg0.field7128);
                    }
                    class163 var28 = var27.method13(false, class95.field1609);
                    if (var28 != null) {
                        var28.field2523 = var27;
                        var28.field2517 = var4;
                        var28.field2520 = var2;
                        var28.field2524 = var3;
                        class221.field3167.method1636(9, var28);
                    }
                }
            }
            if (var25 != null && !class431.method2580(var5, var2, var3, var25.method381(85))) {
                class506 var29 = arg1.field6367;
                class95.field1609.method300(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field7467 & var23) != 0) {
                    if (class165.field2567) {
                        class250.method1610(arg0, var4, var2, var3);
                        class95.field1609.method289(arg0.field7132, arg0.field7128);
                    }
                    class163 var30 = var25.method13(false, class95.field1609);
                    if (var30 != null) {
                        var30.field2523 = var25;
                        var30.field2517 = var4;
                        var30.field2520 = var2;
                        var30.field2524 = var3;
                        class221.field3167.method1636(9, var30);
                    }
                } else if (var25.field7467 == 256) {
                    int var31 = var25.field7470 - class472.field7077;
                    int var32 = var25.field7474 - class350.field5363;
                    int var33 = var25.field7471;
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
                    if (class165.field2567) {
                        class250.method1610(arg0, var4, var2, var3);
                        class95.field1609.method289(arg0.field7132, arg0.field7128);
                    }
                    if (var35 < var34) {
                        class163 var36 = var25.method13(false, class95.field1609);
                        if (var36 != null) {
                            var36.field2523 = var25;
                            var36.field2517 = var4;
                            var36.field2520 = var2;
                            var36.field2524 = var3;
                            class221.field3167.method1636(9, var36);
                        }
                    } else if (var29 != null) {
                        class163 var37 = var29.method13(false, class95.field1609);
                        if (var37 != null) {
                            var37.field2523 = var29;
                            var37.field2517 = var4;
                            var37.field2520 = var2;
                            var37.field2524 = var3;
                            class221.field3167.method1636(9, var37);
                        }
                    }
                }
                class95.field1609.method300(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class480 var38 = arg1.field6366;
                if (var38 != null && !var38.field7152) {
                    if (var38.field7143) {
                        class95.field1609.method300(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class165.field2567) {
                        class250.method1610(arg0, var4, var2, var3);
                        class95.field1609.method289(arg0.field7132, arg0.field7128);
                    }
                    class163 var39 = var38.method13(false, class95.field1609);
                    if (var39 != null) {
                        var39.field2523 = var38;
                        var39.field2517 = var4;
                        var39.field2520 = var2;
                        var39.field2524 = var3;
                        class221.field3167.method1636(9, var39);
                    }
                    if (var38.field7143) {
                        class95.field1609.method300(3000.0F, var9 * 1.5F);
                    }
                }
                class481 var40 = arg1.field6385;
                if (var40 != null && !var40.field7154) {
                    if (class165.field2567) {
                        class250.method1610(arg0, var4, var2, var3);
                        class95.field1609.method289(arg0.field7132, arg0.field7128);
                    }
                    class163 var41 = var40.method13(false, class95.field1609);
                    if (var41 != null) {
                        var41.field2523 = var40;
                        var41.field2517 = var4;
                        var41.field2520 = var2;
                        var41.field2524 = var3;
                        class221.field3167.method1636(9, var41);
                    }
                }
            }
            byte var42 = arg1.field6363;
            if (var42 != 0) {
                if (var2 < class267.field3846 && (var42 & 0x4) != 0) {
                    class429 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field6377) {
                        class318.field4777.method323(var43, (byte) 91);
                    }
                }
                if (var3 < class388.field5834 && (var42 & 0x2) != 0) {
                    class429 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field6377) {
                        class318.field4777.method323(var44, (byte) 120);
                    }
                }
                if (var2 > class267.field3846 && (var42 & 0x1) != 0) {
                    class429 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field6377) {
                        class318.field4777.method323(var45, (byte) 55);
                    }
                }
                if (var3 > class388.field5834 && (var42 & 0x8) != 0) {
                    class429 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field6377) {
                        class318.field4777.method323(var46, (byte) 67);
                    }
                }
            }
        }
        if (arg1.field6369 != 0) {
            boolean var47 = true;
            for (class166 var48 = arg1.field6364; var48 != null; var48 = var48.field2572) {
                if (class183.field2743 != var48.field2576.field6224 && (var48.field2573 & arg1.field6369) == arg1.field6382) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class241 var49 = arg1.field6370;
                if (!class378.method2353(var5, var2, var3, var49.field3475)) {
                    if (class165.field2567) {
                        label682: {
                            if (var49.field3475 >= 16) {
                                int var50 = var2 - class267.field3846;
                                int var51 = var3 - class388.field5834;
                                if (var49.field3475 == 16) {
                                    int var52 = var50 - class130.field2075;
                                    int var53 = class130.field2075 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class261.field3792) {
                                        class250.method1610(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field3475 == 32) {
                                    int var54 = class130.field2075 + var50;
                                    int var55 = class130.field2075 + var51;
                                    if (var55 < -var54 && var2 < class151.field2408 && var3 < class261.field3792) {
                                        class250.method1610(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field3475 == 64) {
                                    int var56 = class130.field2075 + var50;
                                    int var57 = var51 - class130.field2075;
                                    if (var57 > var56 && var2 < class151.field2408 && var3 > 0) {
                                        class250.method1610(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field3475 == 128) {
                                    int var58 = var50 - class130.field2075;
                                    int var59 = var51 - class130.field2075;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class250.method1610(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class250.method1610(arg0, var4, var2, var3);
                        }
                        class95.field1609.method289(arg0.field7132, arg0.field7128);
                    }
                    class163 var60 = var49.method13(false, class95.field1609);
                    if (var60 != null) {
                        var60.field2523 = var49;
                        var60.field2517 = var4;
                        var60.field2520 = var2;
                        var60.field2524 = var3;
                        class221.field3167.method1636(9, var60);
                    }
                }
                arg1.field6369 = 0;
            }
        }
        if (arg1.field6383) {
            try {
                arg1.field6383 = false;
                int var61 = 0;
                label625: for (class166 var62 = arg1.field6364; var62 != null; var62 = var62.field2572) {
                    class417 var63 = var62.field2576;
                    if (class183.field2743 != var63.field6224) {
                        for (int var64 = var63.field6231; var64 <= var63.field6235; var64++) {
                            for (int var65 = var63.field6238; var65 <= var63.field6226; var65++) {
                                class429 var66 = var8[var64][var65];
                                if (var66.field6371) {
                                    arg1.field6383 = true;
                                    continue label625;
                                }
                                if (var66.field6369 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field6231) {
                                        var67++;
                                    }
                                    if (var64 < var63.field6235) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field6238) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field6226) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field6369) == arg1.field6373) {
                                        arg1.field6383 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class267.field3846 - var63.field6231;
                        int var69 = var63.field6235 - class267.field3846;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class388.field5834 - var63.field6238;
                        int var71 = var63.field6226 - class388.field5834;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field7125[var61] = var63;
                        arg0.field7124[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class417 var75 = arg0.field7125[var74];
                        if (class183.field2743 != var75.field6224) {
                            int var76 = arg0.field7124[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field6228 - class472.field7077;
                                int var78 = var75.field6233 - class350.field5363;
                                int var79 = arg0.field7125[var73].field6228 - class472.field7077;
                                int var80 = arg0.field7125[var73].field6233 - class350.field5363;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class417 var81 = arg0.field7125[var73];
                    var81.field6224 = class183.field2743;
                    if (!class150.method1148(var5, var81.field6231, var81.field6235, var81.field6238, var81.field6226, var81.method547(3))) {
                        if (class165.field2567) {
                            if (var81.field6227 == 0) {
                                class409.method2490(arg0, var4, var81.field6231, var81.field6238, var81.field6235, var81.field6226);
                            } else {
                                class250.method1610(arg0, var4, var2, var3);
                                int var82 = var2 - class267.field3846;
                                int var83 = var3 - class388.field5834;
                                if (var81.field6227 == 2) {
                                    if (var83 > -var82) {
                                        class110.method821(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class110.method821(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class110.method821(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class110.method821(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class95.field1609.method289(arg0.field7132, arg0.field7128);
                        }
                        class163 var84 = var81.method13(false, class95.field1609);
                        if (var84 != null) {
                            var84.field2523 = var81;
                            var84.field2517 = var4;
                            var84.field2520 = var81.field6231;
                            var84.field2524 = var81.field6238;
                            class221.field3167.method1636(9, var84);
                        }
                    }
                    for (int var85 = var81.field6231; var85 <= var81.field6235; var85++) {
                        for (int var86 = var81.field6238; var86 <= var81.field6226; var86++) {
                            class429 var87 = var8[var85][var86];
                            if (var87.field6369 != 0) {
                                class318.field4777.method323(var87, (byte) 37);
                            } else if ((var2 != var85 || var3 != var86) && var87.field6377) {
                                class318.field4777.method323(var87, (byte) 75);
                            }
                        }
                    }
                }
                if (arg1.field6383) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field6383 = false;
            }
        }
        if (arg1.field6381 != null && (byte) (class416.field6218 & 0xFF) == arg1.field6379) {
            class49 var88 = arg1.field6381;
            int var89 = class88.field1546[var4].method376(var2, var3);
            int var90;
            if (var4 < class190.field2830 - 1) {
                var90 = class88.field1546[var4].method376(var2, var3) - class88.field1546[var4 + 1].method376(var2, var3);
            } else {
                var90 = 0x8 << class426.field6345;
            }
            class65.field1126.method875(var6, var89, var7, arg0.field7126);
            int var91 = arg0.field7126[2];
            class65.field1126.method875(var6, var89 - var90, var7, arg0.field7126);
            int var92 = arg0.field7126[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class8.field138;
            int var96 = class8.field138 + var94;
            var88.field895 = var95;
            var88.field896 = var96;
            var88.field898 = true;
            class95.field1609.method268(var88);
        }
        if (!arg1.field6377) {
            return;
        }
        if (arg1.field6369 != 0) {
            return;
        }
        if (var2 <= class267.field3846 && var2 > class451.field6738) {
            class429 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field6377) {
                return;
            }
        }
        if (var2 >= class267.field3846 && var2 < class1.field2 - 1) {
            class429 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field6377) {
                return;
            }
        }
        if (var3 <= class388.field5834 && var3 > class363.field5501) {
            class429 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field6377) {
                return;
            }
        }
        if (var3 >= class388.field5834 && var3 < class252.field3602 - 1) {
            class429 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field6377) {
                return;
            }
        }
        arg1.field6377 = false;
        class68.field1179--;
        class481 var101 = arg1.field6385;
        if (var101 != null && var101.field7154) {
            if (class165.field2567) {
                class250.method1610(arg0, var4, var2, var3);
                class95.field1609.method289(arg0.field7132, arg0.field7128);
            }
            class163 var102 = var101.method13(false, class95.field1609);
            if (var102 != null) {
                var102.field2523 = var101;
                var102.field2517 = var4;
                var102.field2520 = var2;
                var102.field2524 = var3;
                class221.field3167.method1636(9, var102);
            }
        }
        if (arg1.field6384 != 0) {
            class506 var103 = arg1.field6380;
            if (var103 != null && !class431.method2580(var5, var2, var3, var103.method381(101))) {
                if ((var103.field7467 & arg1.field6384) != 0) {
                    if (class165.field2567) {
                        class250.method1610(arg0, var4, var2, var3);
                        class95.field1609.method289(arg0.field7132, arg0.field7128);
                    }
                    class163 var104 = var103.method13(false, class95.field1609);
                    if (var104 != null) {
                        var104.field2523 = var103;
                        var104.field2517 = var4;
                        var104.field2520 = var2;
                        var104.field2524 = var3;
                        class221.field3167.method1636(9, var104);
                    }
                } else if (var103.field7467 == 256) {
                    int var105 = var103.field7470 - class472.field7077;
                    int var106 = var103.field7474 - class350.field5363;
                    int var107 = var103.field7471;
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
                    if (class165.field2567) {
                        class250.method1610(arg0, var4, var2, var3);
                        class95.field1609.method289(arg0.field7132, arg0.field7128);
                    }
                    class506 var110 = arg1.field6367;
                    if (var109 > var108) {
                        class163 var111 = var103.method13(false, class95.field1609);
                        if (var111 != null) {
                            var111.field2523 = var103;
                            var111.field2517 = var4;
                            var111.field2520 = var2;
                            var111.field2524 = var3;
                            class221.field3167.method1636(9, var111);
                        }
                    } else if (var110 != null) {
                        class163 var112 = var110.method13(false, class95.field1609);
                        if (var112 != null) {
                            var112.field2523 = var110;
                            var112.field2517 = var4;
                            var112.field2520 = var2;
                            var112.field2524 = var3;
                            class221.field3167.method1636(9, var112);
                        }
                    }
                }
            }
            class241 var113 = arg1.field6370;
            class241 var114 = arg1.field6365;
            if (var114 != null && (var114.field3475 & arg1.field6384) != 0 && !class378.method2353(var5, var2, var3, var114.field3475)) {
                if (class165.field2567) {
                    class500.method2994(arg0, var114.field3475, var4, var2, var3);
                    class95.field1609.method289(arg0.field7132, arg0.field7128);
                }
                class163 var115 = var114.method13(false, class95.field1609);
                if (var115 != null) {
                    var115.field2523 = var114;
                    var115.field2517 = var4;
                    var115.field2520 = var2;
                    var115.field2524 = var3;
                    class221.field3167.method1636(9, var115);
                }
            }
            if (var113 != null && (var113.field3475 & arg1.field6384) != 0 && !class378.method2353(var5, var2, var3, var113.field3475)) {
                if (class165.field2567) {
                    class500.method2994(arg0, var113.field3475, var4, var2, var3);
                    class95.field1609.method289(arg0.field7132, arg0.field7128);
                }
                class163 var116 = var113.method13(false, class95.field1609);
                if (var116 != null) {
                    var116.field2523 = var113;
                    var116.field2517 = var4;
                    var116.field2520 = var2;
                    var116.field2524 = var3;
                    class221.field3167.method1636(9, var116);
                }
            }
        }
        if (var4 < class190.field2830 - 1) {
            class429 var117 = class380.field5761[var4 + 1][var2][var3];
            if (var117 != null && var117.field6377) {
                class318.field4777.method322((byte) 17, var117);
            }
        }
        if (var2 < class267.field3846) {
            class429 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field6377) {
                class318.field4777.method323(var118, (byte) 116);
            }
        }
        if (var3 < class388.field5834) {
            class429 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field6377) {
                class318.field4777.method323(var119, (byte) 69);
            }
        }
        if (var2 > class267.field3846) {
            class429 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field6377) {
                class318.field4777.method323(var120, (byte) 127);
            }
        }
        if (var3 > class388.field5834) {
            class429 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field6377) {
                class318.field4777.method323(var121, (byte) 120);
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(B)V")
    public static void method2163(byte arg0) {
        field5079 = null;
        int var1 = 124 / ((29 - arg0) / 37);
        field5081 = null;
        field5082 = null;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method431(byte arg0) {
        if (arg0 == -34) {
            field5078++;
            return this.field5076;
        } else {
            return null;
        }
    }
}
