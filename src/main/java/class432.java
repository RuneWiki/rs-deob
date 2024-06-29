import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public abstract class class432 {

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public int field5950;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public int field5951;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public int field5949;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "Lfn;")
    public static class52 field5953 = new class52(28, 6);

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "[I")
    public static int[] field5955 = new int[16384];

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "[I")
    public static int[] field5957 = new int[16384];

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "Lfc;")
    public static class343 field5954;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5955[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field5957[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lvd;Lui;)V", line = 10)
    public static final void method2526(class216 arg0, class406 arg1) {
        if (!arg1.field5611) {
            return;
        }
        short var2 = arg1.field5616;
        short var3 = arg1.field5619;
        byte var4 = arg1.field5622;
        byte var5 = arg1.field5620;
        int var6 = (var2 << class259.field3616) + class411.field5703;
        int var7 = (var3 << class259.field3616) + class411.field5703;
        class406[][] var8 = class455.field6293[var4];
        float var9;
        if (class8.field166 == class317.field4306) {
            class259.field3611.method1075(class366.field5215[0].method701(var6, var7), class357.method2143(var2, var3), class442.method2569(var2, var3), class269.method1685(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class259.field3611.method1144(3000.0F, var9 * 1.5F);
        if (arg1.field5609) {
            if (class375.field5311) {
                if (var4 > 0) {
                    class406 var10 = class455.field6293[var4 - 1][var2][var3];
                    if (var10 != null && var10.field5611) {
                        return;
                    }
                }
                if (var2 <= class381.field5398 && var2 > class443.field6111) {
                    class406 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field5611 && (var11.field5609 || (arg1.field5604 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class381.field5398 && var2 < class371.field5246 - 1) {
                    class406 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field5611 && (var12.field5609 || (arg1.field5604 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class8.field171 && var3 > class175.field2568) {
                    class406 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field5611 && (var13.field5609 || (arg1.field5604 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class8.field171 && var3 < class153.field2206 - 1) {
                    class406 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field5611 && (var14.field5609 || (arg1.field5604 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class375.field5311 = true;
            }
            arg1.field5609 = false;
            if (arg1.field5606 != null) {
                class406 var15 = arg1.field5606;
                class259.field3611.method1144(3000.0F, (201.5F - (float) (var15.field5620 + 1) * 50.0F) * 1.5F);
                if (!class155.method942(var15.field5620, var2, var3)) {
                    class317.field4306[var15.field5620].method698(var2, var3);
                }
                class467 var16 = var15.field5617;
                if (var16 != null) {
                    if (class101.field1443) {
                        if ((var16.field6544 & arg1.field5618) == 0) {
                            class242.method1513(arg0, var4, var2, var3);
                        } else {
                            class489.method2873(arg0, var16.field6544, var5, var2, var3);
                        }
                        class259.field3611.method1083(arg0.field3067, arg0.field3059);
                    }
                    var16.method193(class259.field3611, -72);
                }
                for (class146 var17 = var15.field5613; var17 != null; var17 = var17.field2066) {
                    class478 var18 = var17.field2062;
                    if (var18 != null) {
                        if (class101.field1443) {
                            class242.method1513(arg0, var4, var2, var3);
                            class259.field3611.method1083(arg0.field3067, arg0.field3059);
                        }
                        var18.method193(class259.field3611, -96);
                    }
                }
                class259.field3611.method1144(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class155.method942(var5, var2, var3);
            if (var19) {
                class317.field4306[var5].method698(var2, var3);
                class367 var20 = arg1.field5621;
                if (var20 != null && var20.field5218) {
                    if (var20.field5222) {
                        class259.field3611.method1144(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class101.field1443) {
                        class242.method1513(arg0, var4, var2, var3);
                        class259.field3611.method1083(arg0.field3067, arg0.field3059);
                    }
                    class370 var21 = var20.method193(class259.field3611, -41);
                    if (var21 != null) {
                        var21.field5232 = var20;
                        var21.field5238 = var4;
                        var21.field5231 = var2;
                        var21.field5239 = var3;
                        class123.field1703.method2817(false, var21);
                    }
                    if (var20.field5222) {
                        class259.field3611.method1144(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class467 var24 = arg1.field5617;
            class87 var25 = arg1.field5625;
            if (var24 != null || var25 != null) {
                if (class381.field5398 == var2) {
                    var22++;
                } else if (class381.field5398 < var2) {
                    var22 += 2;
                }
                if (class8.field171 == var3) {
                    var22 += 3;
                } else if (class8.field171 > var3) {
                    var22 += 6;
                }
                var23 = class178.field2593[var22];
                arg1.field5618 = class233.field3281[var22];
            }
            if (var24 != null) {
                if ((var24.field6544 & class292.field4008[var22]) == 0) {
                    arg1.field5607 = 0;
                } else if (var24.field6544 == 16) {
                    arg1.field5607 = 3;
                    arg1.field5615 = class351.field4799[var22];
                    arg1.field5605 = (byte) (3 - arg1.field5615);
                } else if (var24.field6544 == 32) {
                    arg1.field5607 = 6;
                    arg1.field5615 = class250.field3512[var22];
                    arg1.field5605 = (byte) (6 - arg1.field5615);
                } else if (var24.field6544 == 64) {
                    arg1.field5607 = 12;
                    arg1.field5615 = class254.field3554[var22];
                    arg1.field5605 = (byte) (12 - arg1.field5615);
                } else {
                    arg1.field5607 = 9;
                    arg1.field5615 = class118.field1654[var22];
                    arg1.field5605 = (byte) (9 - arg1.field5615);
                }
                if ((var24.field6544 & var23) != 0 && !class159.method966(var5, var2, var3, var24.field6544)) {
                    if (class101.field1443) {
                        class242.method1513(arg0, var4, var2, var3);
                        class259.field3611.method1083(arg0.field3067, arg0.field3059);
                    }
                    class370 var26 = var24.method193(class259.field3611, -103);
                    if (var26 != null) {
                        var26.field5232 = var24;
                        var26.field5238 = var4;
                        var26.field5231 = var2;
                        var26.field5239 = var3;
                        class123.field1703.method2817(false, var26);
                    }
                }
                class467 var27 = arg1.field5624;
                if (var27 != null && (var27.field6544 & var23) != 0 && !class159.method966(var5, var2, var3, var27.field6544)) {
                    if (class101.field1443) {
                        class242.method1513(arg0, var4, var2, var3);
                        class259.field3611.method1083(arg0.field3067, arg0.field3059);
                    }
                    class370 var28 = var27.method193(class259.field3611, -51);
                    if (var28 != null) {
                        var28.field5232 = var27;
                        var28.field5238 = var4;
                        var28.field5231 = var2;
                        var28.field5239 = var3;
                        class123.field1703.method2817(false, var28);
                    }
                }
            }
            if (var25 != null && !class467.method2750(var5, var2, var3, var25.method212(5281))) {
                class87 var29 = arg1.field5608;
                class259.field3611.method1144(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field1329 & var23) != 0) {
                    if (class101.field1443) {
                        class242.method1513(arg0, var4, var2, var3);
                        class259.field3611.method1083(arg0.field3067, arg0.field3059);
                    }
                    class370 var30 = var25.method193(class259.field3611, -17);
                    if (var30 != null) {
                        var30.field5232 = var25;
                        var30.field5238 = var4;
                        var30.field5231 = var2;
                        var30.field5239 = var3;
                        class123.field1703.method2817(false, var30);
                    }
                } else if (var25.field1329 == 256) {
                    int var31 = var25.field1333 - class117.field1648;
                    int var32 = var25.field1327 - class211.field2979;
                    int var33 = var25.field1334;
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
                    if (class101.field1443) {
                        class242.method1513(arg0, var4, var2, var3);
                        class259.field3611.method1083(arg0.field3067, arg0.field3059);
                    }
                    if (var35 < var34) {
                        class370 var36 = var25.method193(class259.field3611, -39);
                        if (var36 != null) {
                            var36.field5232 = var25;
                            var36.field5238 = var4;
                            var36.field5231 = var2;
                            var36.field5239 = var3;
                            class123.field1703.method2817(false, var36);
                        }
                    } else if (var29 != null) {
                        class370 var37 = var29.method193(class259.field3611, -35);
                        if (var37 != null) {
                            var37.field5232 = var29;
                            var37.field5238 = var4;
                            var37.field5231 = var2;
                            var37.field5239 = var3;
                            class123.field1703.method2817(false, var37);
                        }
                    }
                }
                class259.field3611.method1144(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class367 var38 = arg1.field5621;
                if (var38 != null && !var38.field5218) {
                    if (var38.field5222) {
                        class259.field3611.method1144(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class101.field1443) {
                        class242.method1513(arg0, var4, var2, var3);
                        class259.field3611.method1083(arg0.field3067, arg0.field3059);
                    }
                    class370 var39 = var38.method193(class259.field3611, -116);
                    if (var39 != null) {
                        var39.field5232 = var38;
                        var39.field5238 = var4;
                        var39.field5231 = var2;
                        var39.field5239 = var3;
                        class123.field1703.method2817(false, var39);
                    }
                    if (var38.field5222) {
                        class259.field3611.method1144(3000.0F, var9 * 1.5F);
                    }
                }
                class242 var40 = arg1.field5614;
                if (var40 != null && !var40.field3427) {
                    if (class101.field1443) {
                        class242.method1513(arg0, var4, var2, var3);
                        class259.field3611.method1083(arg0.field3067, arg0.field3059);
                    }
                    class370 var41 = var40.method193(class259.field3611, -12);
                    if (var41 != null) {
                        var41.field5232 = var40;
                        var41.field5238 = var4;
                        var41.field5231 = var2;
                        var41.field5239 = var3;
                        class123.field1703.method2817(false, var41);
                    }
                }
            }
            byte var42 = arg1.field5604;
            if (var42 != 0) {
                if (var2 < class381.field5398 && (var42 & 0x4) != 0) {
                    class406 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field5611) {
                        class302.field4135.method812(var43, (byte) 10);
                    }
                }
                if (var3 < class8.field171 && (var42 & 0x2) != 0) {
                    class406 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field5611) {
                        class302.field4135.method812(var44, (byte) 10);
                    }
                }
                if (var2 > class381.field5398 && (var42 & 0x1) != 0) {
                    class406 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field5611) {
                        class302.field4135.method812(var45, (byte) 10);
                    }
                }
                if (var3 > class8.field171 && (var42 & 0x8) != 0) {
                    class406 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field5611) {
                        class302.field4135.method812(var46, (byte) 10);
                    }
                }
            }
        }
        if (arg1.field5607 != 0) {
            boolean var47 = true;
            for (class146 var48 = arg1.field5613; var48 != null; var48 = var48.field2066) {
                if (class192.field2752 != var48.field2062.field6752 && (var48.field2065 & arg1.field5607) == arg1.field5615) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class467 var49 = arg1.field5617;
                if (!class159.method966(var5, var2, var3, var49.field6544)) {
                    if (class101.field1443) {
                        label687: {
                            if (var49.field6544 >= 16) {
                                int var50 = var2 - class381.field5398;
                                int var51 = var3 - class8.field171;
                                if (var49.field6544 == 16) {
                                    int var52 = var50 - class411.field5703;
                                    int var53 = class411.field5703 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class205.field2946) {
                                        class242.method1513(arg0, var4, var2 - 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var49.field6544 == 32) {
                                    int var54 = class411.field5703 + var50;
                                    int var55 = class411.field5703 + var51;
                                    if (var55 < -var54 && var2 < class456.field6299 && var3 < class205.field2946) {
                                        class242.method1513(arg0, var4, var2 + 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var49.field6544 == 64) {
                                    int var56 = class411.field5703 + var50;
                                    int var57 = var51 - class411.field5703;
                                    if (var57 > var56 && var2 < class456.field6299 && var3 > 0) {
                                        class242.method1513(arg0, var4, var2 + 1, var3 - 1);
                                        break label687;
                                    }
                                } else if (var49.field6544 == 128) {
                                    int var58 = var50 - class411.field5703;
                                    int var59 = var51 - class411.field5703;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class242.method1513(arg0, var4, var2 - 1, var3 - 1);
                                        break label687;
                                    }
                                }
                            }
                            class242.method1513(arg0, var4, var2, var3);
                        }
                        class259.field3611.method1083(arg0.field3067, arg0.field3059);
                    }
                    class370 var60 = var49.method193(class259.field3611, -53);
                    if (var60 != null) {
                        var60.field5232 = var49;
                        var60.field5238 = var4;
                        var60.field5231 = var2;
                        var60.field5239 = var3;
                        class123.field1703.method2817(false, var60);
                    }
                }
                arg1.field5607 = 0;
            }
        }
        if (arg1.field5610) {
            try {
                arg1.field5610 = false;
                int var61 = 0;
                label630: for (class146 var62 = arg1.field5613; var62 != null; var62 = var62.field2066) {
                    class478 var63 = var62.field2062;
                    if (class192.field2752 != var63.field6752) {
                        for (int var64 = var63.field6753; var64 <= var63.field6751; var64++) {
                            for (int var65 = var63.field6747; var65 <= var63.field6749; var65++) {
                                class406 var66 = var8[var64][var65];
                                if (var66.field5609) {
                                    arg1.field5610 = true;
                                    continue label630;
                                }
                                if (var66.field5607 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field6753) {
                                        var67++;
                                    }
                                    if (var64 < var63.field6751) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field6747) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field6749) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field5607) == arg1.field5605) {
                                        arg1.field5610 = true;
                                        continue label630;
                                    }
                                }
                            }
                        }
                        int var68 = class381.field5398 - var63.field6753;
                        int var69 = var63.field6751 - class381.field5398;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class8.field171 - var63.field6747;
                        int var71 = var63.field6749 - class8.field171;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field3066[var61] = var63;
                        arg0.field3060[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class478 var75 = arg0.field3066[var74];
                        if (class192.field2752 != var75.field6752) {
                            int var76 = arg0.field3060[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field6765 - class117.field1648;
                                int var78 = var75.field6746 - class211.field2979;
                                int var79 = arg0.field3066[var73].field6765 - class117.field1648;
                                int var80 = arg0.field3066[var73].field6746 - class211.field2979;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class478 var81 = arg0.field3066[var73];
                    var81.field6752 = class192.field2752;
                    if (!class130.method789(var5, var81.field6753, var81.field6751, var81.field6747, var81.field6749, var81.method205((byte) 114))) {
                        if (class101.field1443) {
                            if (var81.field6761 == 0) {
                                class226.method1428(arg0, var4, var81.field6753, var81.field6747, var81.field6751, var81.field6749);
                            } else {
                                class242.method1513(arg0, var4, var2, var3);
                                int var82 = var2 - class381.field5398;
                                int var83 = var3 - class8.field171;
                                if (var81.field6761 == 2) {
                                    if (var83 > -var82) {
                                        class52.method412(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class52.method412(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class52.method412(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class52.method412(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class259.field3611.method1083(arg0.field3067, arg0.field3059);
                        }
                        class370 var84 = var81.method193(class259.field3611, -40);
                        if (var84 != null) {
                            var84.field5232 = var81;
                            var84.field5238 = var4;
                            var84.field5231 = var81.field6753;
                            var84.field5239 = var81.field6747;
                            class123.field1703.method2817(false, var84);
                        }
                    }
                    for (int var85 = var81.field6753; var85 <= var81.field6751; var85++) {
                        for (int var86 = var81.field6747; var86 <= var81.field6749; var86++) {
                            class406 var87 = var8[var85][var86];
                            if (var87.field5607 != 0) {
                                class302.field4135.method812(var87, (byte) 10);
                            } else if ((var2 != var85 || var3 != var86) && var87.field5611) {
                                class302.field4135.method812(var87, (byte) 10);
                            }
                        }
                    }
                }
                if (arg1.field5610) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field5610 = false;
            }
        }
        if (arg1.field5628 != null) {
            if ((byte) (class491.field6928 & 0xFF) == arg1.field5626) {
                class473 var88 = arg1.field5628;
                int var89 = class317.field4306[var4].method710(var2, var3);
                int var90;
                if (var4 < class109.field1542 - 1) {
                    var90 = class317.field4306[var4].method710(var2, var3) - class317.field4306[var4 + 1].method710(var2, var3);
                } else {
                    var90 = 1024;
                }
                class441.field6059.method1385(var6, var89, var7, arg0.field3065);
                int var91 = arg0.field3065[2];
                class441.field6059.method1385(var6, var89 - var90, var7, arg0.field3065);
                int var92 = arg0.field3065[2];
                int var93 = var91;
                int var94 = var92;
                if (var91 > var92) {
                    var93 = var92;
                    var94 = var91;
                }
                int var95 = var93 - class338.field4638;
                int var96 = class338.field4638 + var94;
                if (var95 < var96 - 1597) {
                    var95 = var96 - 1597;
                }
                var88.field6630 = var95;
                var88.field6626 = var96;
                var88.field6628 = true;
                class259.field3611.method1115(var88);
            } else {
                arg1.field5628 = null;
            }
        }
        if (!arg1.field5611) {
            return;
        }
        if (arg1.field5607 != 0) {
            return;
        }
        if (var2 <= class381.field5398 && var2 > class443.field6111) {
            class406 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field5611) {
                return;
            }
        }
        if (var2 >= class381.field5398 && var2 < class371.field5246 - 1) {
            class406 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field5611) {
                return;
            }
        }
        if (var3 <= class8.field171 && var3 > class175.field2568) {
            class406 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field5611) {
                return;
            }
        }
        if (var3 >= class8.field171 && var3 < class153.field2206 - 1) {
            class406 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field5611) {
                return;
            }
        }
        arg1.field5611 = false;
        class356.field4977--;
        class242 var101 = arg1.field5614;
        if (var101 != null && var101.field3427) {
            if (class101.field1443) {
                class242.method1513(arg0, var4, var2, var3);
                class259.field3611.method1083(arg0.field3067, arg0.field3059);
            }
            class370 var102 = var101.method193(class259.field3611, -72);
            if (var102 != null) {
                var102.field5232 = var101;
                var102.field5238 = var4;
                var102.field5231 = var2;
                var102.field5239 = var3;
                class123.field1703.method2817(false, var102);
            }
        }
        if (arg1.field5618 != 0) {
            class87 var103 = arg1.field5625;
            if (var103 != null && !class467.method2750(var5, var2, var3, var103.method212(5281))) {
                if ((var103.field1329 & arg1.field5618) != 0) {
                    if (class101.field1443) {
                        class242.method1513(arg0, var4, var2, var3);
                        class259.field3611.method1083(arg0.field3067, arg0.field3059);
                    }
                    class370 var104 = var103.method193(class259.field3611, -82);
                    if (var104 != null) {
                        var104.field5232 = var103;
                        var104.field5238 = var4;
                        var104.field5231 = var2;
                        var104.field5239 = var3;
                        class123.field1703.method2817(false, var104);
                    }
                } else if (var103.field1329 == 256) {
                    int var105 = var103.field1333 - class117.field1648;
                    int var106 = var103.field1327 - class211.field2979;
                    int var107 = var103.field1334;
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
                    if (class101.field1443) {
                        class242.method1513(arg0, var4, var2, var3);
                        class259.field3611.method1083(arg0.field3067, arg0.field3059);
                    }
                    class87 var110 = arg1.field5608;
                    if (var109 > var108) {
                        class370 var111 = var103.method193(class259.field3611, -84);
                        if (var111 != null) {
                            var111.field5232 = var103;
                            var111.field5238 = var4;
                            var111.field5231 = var2;
                            var111.field5239 = var3;
                            class123.field1703.method2817(false, var111);
                        }
                    } else if (var110 != null) {
                        class370 var112 = var110.method193(class259.field3611, -104);
                        if (var112 != null) {
                            var112.field5232 = var110;
                            var112.field5238 = var4;
                            var112.field5231 = var2;
                            var112.field5239 = var3;
                            class123.field1703.method2817(false, var112);
                        }
                    }
                }
            }
            class467 var113 = arg1.field5617;
            class467 var114 = arg1.field5624;
            if (var114 != null && (var114.field6544 & arg1.field5618) != 0 && !class159.method966(var5, var2, var3, var114.field6544)) {
                if (class101.field1443) {
                    class489.method2873(arg0, var114.field6544, var4, var2, var3);
                    class259.field3611.method1083(arg0.field3067, arg0.field3059);
                }
                class370 var115 = var114.method193(class259.field3611, -114);
                if (var115 != null) {
                    var115.field5232 = var114;
                    var115.field5238 = var4;
                    var115.field5231 = var2;
                    var115.field5239 = var3;
                    class123.field1703.method2817(false, var115);
                }
            }
            if (var113 != null && (var113.field6544 & arg1.field5618) != 0 && !class159.method966(var5, var2, var3, var113.field6544)) {
                if (class101.field1443) {
                    class489.method2873(arg0, var113.field6544, var4, var2, var3);
                    class259.field3611.method1083(arg0.field3067, arg0.field3059);
                }
                class370 var116 = var113.method193(class259.field3611, -119);
                if (var116 != null) {
                    var116.field5232 = var113;
                    var116.field5238 = var4;
                    var116.field5231 = var2;
                    var116.field5239 = var3;
                    class123.field1703.method2817(false, var116);
                }
            }
        }
        if (var4 < class109.field1542 - 1) {
            class406 var117 = class455.field6293[var4 + 1][var2][var3];
            if (var117 != null && var117.field5611) {
                class302.field4135.method816(var117, -127);
            }
        }
        if (var2 < class381.field5398) {
            class406 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field5611) {
                class302.field4135.method812(var118, (byte) 10);
            }
        }
        if (var3 < class8.field171) {
            class406 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field5611) {
                class302.field4135.method812(var119, (byte) 10);
            }
        }
        if (var2 > class381.field5398) {
            class406 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field5611) {
                class302.field4135.method812(var120, (byte) 10);
            }
        }
        if (var3 > class8.field171) {
            class406 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field5611) {
                class302.field4135.method812(var121, (byte) 10);
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZ)V", line = 1135)
    public static final void method2527(int arg0, boolean arg1) {
        if (arg1 && class379.field5359 != null) {
            field5956 = class379.field5359.field2878;
        } else {
            field5956 = -1;
        }
        field5952++;
        class430.field5926 = 0;
        class52.field863 = null;
        class379.field5359 = null;
        class233.field3307 = null;
        class379.method2274();
        class379.field5366.method1552((byte) 117);
        class334.field4585 = null;
        class266.field3706 = -1;
        class265.field3697 = null;
        class138.field1959 = null;
        class379.field5369 = null;
        class242.field3428 = null;
        class137.field1948 = null;
        class50.field846 = null;
        class407.field5639 = null;
        class272.field3778 = null;
        class9.field186 = null;
        class84.field1265 = -1;
        class379.field5358.method83(123);
        class379.field5362.method378(-22928, 64, 64);
        if (arg0 != 20809) {
            method2528((byte) -78);
        }
        class379.field5358.method90(arg0 - 20745, 128, 64);
        class379.field5355.method2076(64, 26748);
        class147.field2084.method407(64, (byte) 117);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V", line = 1173)
    public static void method2528(byte arg0) {
        field5954 = null;
        field5953 = null;
        field5957 = null;
        field5955 = null;
        if (arg0 != 121) {
            method2526((class216) null, (class406) null);
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(III)V", line = 1186)
    public class432(int arg0, int arg1, int arg2) {
        this.field5950 = arg1;
        this.field5951 = arg0;
        this.field5949 = arg2;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZII)V")
    public abstract void method1598(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)V")
    public abstract void method1597(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BII)V")
    public abstract void method1601(byte arg0, int arg1, int arg2);
}
