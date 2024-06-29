import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class530 {

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "[Ljava/lang/String;")
    private String[] field7762;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "[[I")
    public static int[][] field7760 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "[[F")
    public static float[][] field7765 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field7764 = 0;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field7759;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field7767;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lsq;Lrb;)V", line = 29)
    public static final void method3114(class121 arg0, class239 arg1) {
        if (!arg1.field3472) {
            return;
        }
        short var2 = arg1.field3491;
        short var3 = arg1.field3485;
        byte var4 = arg1.field3479;
        byte var5 = arg1.field3470;
        int var6 = (var2 << class493.field6970) + class534.field7832;
        int var7 = (var3 << class493.field6970) + class534.field7832;
        class239[][] var8 = class268.field3910[var4];
        float var9;
        if (class60.field743 == class330.field4818) {
            class489.field6839.method333(class68.field858[0].method11(var6, var7), class40.method230(var2, var3), class513.method3058(var2, var3), class471.method2727(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class489.field6839.method365(3000.0F, var9 * 1.5F);
        if (arg1.field3480) {
            if (class505.field7476) {
                if (var4 > 0) {
                    class239 var10 = class268.field3910[var4 - 1][var2][var3];
                    if (var10 != null && var10.field3472) {
                        return;
                    }
                }
                if (var2 <= class88.field1096 && var2 > class230.field3392) {
                    class239 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field3472 && (var11.field3480 || (arg1.field3486 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class88.field1096 && var2 < class209.field3046 - 1) {
                    class239 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field3472 && (var12.field3480 || (arg1.field3486 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class204.field2910 && var3 > class187.field2692) {
                    class239 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field3472 && (var13.field3480 || (arg1.field3486 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class204.field2910 && var3 < class276.field4100 - 1) {
                    class239 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field3472 && (var14.field3480 || (arg1.field3486 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class505.field7476 = true;
            }
            arg1.field3480 = false;
            if (arg1.field3483 != null) {
                class239 var15 = arg1.field3483;
                class489.field6839.method365(3000.0F, (201.5F - (float) (var15.field3470 + 1) * 50.0F) * 1.5F);
                if (!class422.method2503(var15.field3470, var2, var3)) {
                    class330.field4818[var15.field3470].method15(var2, var3);
                }
                class232 var16 = var15.field3487;
                if (var16 != null) {
                    if (class517.field7613) {
                        if ((var16.field3405 & arg1.field3488) == 0) {
                            class270.method1711(arg0, var4, var2, var3);
                        } else {
                            class513.method3060(arg0, var16.field3405, var5, var2, var3);
                        }
                        class489.field6839.method352(arg0.field1669, arg0.field1662);
                    }
                    var16.method126(class489.field6839, (byte) -95);
                }
                for (class134 var17 = var15.field3482; var17 != null; var17 = var17.field1755) {
                    class144 var18 = var17.field1761;
                    if (var18 != null) {
                        if (class517.field7613) {
                            class270.method1711(arg0, var4, var2, var3);
                            class489.field6839.method352(arg0.field1669, arg0.field1662);
                        }
                        var18.method126(class489.field6839, (byte) -100);
                    }
                }
                class489.field6839.method365(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class422.method2503(var5, var2, var3);
            if (var19) {
                class330.field4818[var5].method15(var2, var3);
                class35 var20 = arg1.field3493;
                if (var20 != null && var20.field392) {
                    if (var20.field391) {
                        class489.field6839.method365(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class517.field7613) {
                        class270.method1711(arg0, var4, var2, var3);
                        class489.field6839.method352(arg0.field1669, arg0.field1662);
                    }
                    class170 var21 = var20.method126(class489.field6839, (byte) -89);
                    if (var21 != null) {
                        var21.field2470 = var20;
                        var21.field2474 = var4;
                        var21.field2471 = var2;
                        var21.field2472 = var3;
                        class22.field286.method2753(4, var21);
                    }
                    if (var20.field391) {
                        class489.field6839.method365(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class232 var24 = arg1.field3487;
            class362 var25 = arg1.field3474;
            if (var24 != null || var25 != null) {
                if (class88.field1096 == var2) {
                    var22++;
                } else if (class88.field1096 < var2) {
                    var22 += 2;
                }
                if (class204.field2910 == var3) {
                    var22 += 3;
                } else if (class204.field2910 > var3) {
                    var22 += 6;
                }
                var23 = class240.field3499[var22];
                arg1.field3488 = class472.field6574[var22];
            }
            if (var24 != null) {
                if ((var24.field3405 & class360.field5155[var22]) == 0) {
                    arg1.field3478 = 0;
                } else if (var24.field3405 == 16) {
                    arg1.field3478 = 3;
                    arg1.field3489 = class198.field2814[var22];
                    arg1.field3484 = (byte) (3 - arg1.field3489);
                } else if (var24.field3405 == 32) {
                    arg1.field3478 = 6;
                    arg1.field3489 = class207.field2999[var22];
                    arg1.field3484 = (byte) (6 - arg1.field3489);
                } else if (var24.field3405 == 64) {
                    arg1.field3478 = 12;
                    arg1.field3489 = class303.field4428[var22];
                    arg1.field3484 = (byte) (12 - arg1.field3489);
                } else {
                    arg1.field3478 = 9;
                    arg1.field3489 = class539.field7882[var22];
                    arg1.field3484 = (byte) (9 - arg1.field3489);
                }
                if ((var24.field3405 & var23) != 0 && !class141.method884(var5, var2, var3, var24.field3405)) {
                    if (class517.field7613) {
                        class270.method1711(arg0, var4, var2, var3);
                        class489.field6839.method352(arg0.field1669, arg0.field1662);
                    }
                    class170 var26 = var24.method126(class489.field6839, (byte) -109);
                    if (var26 != null) {
                        var26.field2470 = var24;
                        var26.field2474 = var4;
                        var26.field2471 = var2;
                        var26.field2472 = var3;
                        class22.field286.method2753(4, var26);
                    }
                }
                class232 var27 = arg1.field3473;
                if (var27 != null && (var27.field3405 & var23) != 0 && !class141.method884(var5, var2, var3, var27.field3405)) {
                    if (class517.field7613) {
                        class270.method1711(arg0, var4, var2, var3);
                        class489.field6839.method352(arg0.field1669, arg0.field1662);
                    }
                    class170 var28 = var27.method126(class489.field6839, (byte) -93);
                    if (var28 != null) {
                        var28.field2470 = var27;
                        var28.field2474 = var4;
                        var28.field2471 = var2;
                        var28.field2472 = var3;
                        class22.field286.method2753(4, var28);
                    }
                }
            }
            if (var25 != null && !class296.method1822(var5, var2, var3, var25.method759(-20767))) {
                class362 var29 = arg1.field3471;
                class489.field6839.method365(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field5168 & var23) != 0) {
                    if (class517.field7613) {
                        class270.method1711(arg0, var4, var2, var3);
                        class489.field6839.method352(arg0.field1669, arg0.field1662);
                    }
                    class170 var30 = var25.method126(class489.field6839, (byte) -98);
                    if (var30 != null) {
                        var30.field2470 = var25;
                        var30.field2474 = var4;
                        var30.field2471 = var2;
                        var30.field2472 = var3;
                        class22.field286.method2753(4, var30);
                    }
                } else if (var25.field5168 == 256) {
                    int var31 = var25.field5167 - class347.field5024;
                    int var32 = var25.field5171 - class181.field2608;
                    int var33 = var25.field5177;
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
                    if (class517.field7613) {
                        class270.method1711(arg0, var4, var2, var3);
                        class489.field6839.method352(arg0.field1669, arg0.field1662);
                    }
                    if (var35 < var34) {
                        class170 var36 = var25.method126(class489.field6839, (byte) -117);
                        if (var36 != null) {
                            var36.field2470 = var25;
                            var36.field2474 = var4;
                            var36.field2471 = var2;
                            var36.field2472 = var3;
                            class22.field286.method2753(4, var36);
                        }
                    } else if (var29 != null) {
                        class170 var37 = var29.method126(class489.field6839, (byte) -121);
                        if (var37 != null) {
                            var37.field2470 = var29;
                            var37.field2474 = var4;
                            var37.field2471 = var2;
                            var37.field2472 = var3;
                            class22.field286.method2753(4, var37);
                        }
                    }
                }
                class489.field6839.method365(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class35 var38 = arg1.field3493;
                if (var38 != null && !var38.field392) {
                    if (var38.field391) {
                        class489.field6839.method365(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class517.field7613) {
                        class270.method1711(arg0, var4, var2, var3);
                        class489.field6839.method352(arg0.field1669, arg0.field1662);
                    }
                    class170 var39 = var38.method126(class489.field6839, (byte) -114);
                    if (var39 != null) {
                        var39.field2470 = var38;
                        var39.field2474 = var4;
                        var39.field2471 = var2;
                        var39.field2472 = var3;
                        class22.field286.method2753(4, var39);
                    }
                    if (var38.field391) {
                        class489.field6839.method365(3000.0F, var9 * 1.5F);
                    }
                }
                class371 var40 = arg1.field3495;
                if (var40 != null && !var40.field5287) {
                    if (class517.field7613) {
                        class270.method1711(arg0, var4, var2, var3);
                        class489.field6839.method352(arg0.field1669, arg0.field1662);
                    }
                    class170 var41 = var40.method126(class489.field6839, (byte) -117);
                    if (var41 != null) {
                        var41.field2470 = var40;
                        var41.field2474 = var4;
                        var41.field2471 = var2;
                        var41.field2472 = var3;
                        class22.field286.method2753(4, var41);
                    }
                }
            }
            byte var42 = arg1.field3486;
            if (var42 != 0) {
                if (var2 < class88.field1096 && (var42 & 0x4) != 0) {
                    class239 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field3472) {
                        class435.field6118.method1455(-123, var43);
                    }
                }
                if (var3 < class204.field2910 && (var42 & 0x2) != 0) {
                    class239 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field3472) {
                        class435.field6118.method1455(-107, var44);
                    }
                }
                if (var2 > class88.field1096 && (var42 & 0x1) != 0) {
                    class239 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field3472) {
                        class435.field6118.method1455(-122, var45);
                    }
                }
                if (var3 > class204.field2910 && (var42 & 0x8) != 0) {
                    class239 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field3472) {
                        class435.field6118.method1455(-109, var46);
                    }
                }
            }
        }
        if (arg1.field3478 != 0) {
            boolean var47 = true;
            for (class134 var48 = arg1.field3482; var48 != null; var48 = var48.field1755) {
                if (class479.field6683 != var48.field1761.field1910 && (var48.field1763 & arg1.field3478) == arg1.field3489) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class232 var49 = arg1.field3487;
                if (!class141.method884(var5, var2, var3, var49.field3405)) {
                    if (class517.field7613) {
                        label682: {
                            if (var49.field3405 >= 16) {
                                int var50 = var2 - class88.field1096;
                                int var51 = var3 - class204.field2910;
                                if (var49.field3405 == 16) {
                                    int var52 = var50 - class534.field7832;
                                    int var53 = class534.field7832 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class272.field4032) {
                                        class270.method1711(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field3405 == 32) {
                                    int var54 = class534.field7832 + var50;
                                    int var55 = class534.field7832 + var51;
                                    if (var55 < -var54 && var2 < class6.field109 && var3 < class272.field4032) {
                                        class270.method1711(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field3405 == 64) {
                                    int var56 = class534.field7832 + var50;
                                    int var57 = var51 - class534.field7832;
                                    if (var57 > var56 && var2 < class6.field109 && var3 > 0) {
                                        class270.method1711(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field3405 == 128) {
                                    int var58 = var50 - class534.field7832;
                                    int var59 = var51 - class534.field7832;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class270.method1711(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class270.method1711(arg0, var4, var2, var3);
                        }
                        class489.field6839.method352(arg0.field1669, arg0.field1662);
                    }
                    class170 var60 = var49.method126(class489.field6839, (byte) -103);
                    if (var60 != null) {
                        var60.field2470 = var49;
                        var60.field2474 = var4;
                        var60.field2471 = var2;
                        var60.field2472 = var3;
                        class22.field286.method2753(4, var60);
                    }
                }
                arg1.field3478 = 0;
            }
        }
        if (arg1.field3490) {
            try {
                arg1.field3490 = false;
                int var61 = 0;
                label625: for (class134 var62 = arg1.field3482; var62 != null; var62 = var62.field1755) {
                    class144 var63 = var62.field1761;
                    if (class479.field6683 != var63.field1910) {
                        for (int var64 = var63.field1911; var64 <= var63.field1898; var64++) {
                            for (int var65 = var63.field1902; var65 <= var63.field1907; var65++) {
                                class239 var66 = var8[var64][var65];
                                if (var66.field3480) {
                                    arg1.field3490 = true;
                                    continue label625;
                                }
                                if (var66.field3478 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field1911) {
                                        var67++;
                                    }
                                    if (var64 < var63.field1898) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field1902) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field1907) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field3478) == arg1.field3484) {
                                        arg1.field3490 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class88.field1096 - var63.field1911;
                        int var69 = var63.field1898 - class88.field1096;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class204.field2910 - var63.field1902;
                        int var71 = var63.field1907 - class204.field2910;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field1665[var61] = var63;
                        arg0.field1670[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class144 var75 = arg0.field1665[var74];
                        if (class479.field6683 != var75.field1910) {
                            int var76 = arg0.field1670[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field1896 - class347.field5024;
                                int var78 = var75.field1899 - class181.field2608;
                                int var79 = arg0.field1665[var73].field1896 - class347.field5024;
                                int var80 = arg0.field1665[var73].field1899 - class181.field2608;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class144 var81 = arg0.field1665[var73];
                    var81.field1910 = class479.field6683;
                    if (!class79.method601(var5, var81.field1911, var81.field1898, var81.field1902, var81.field1907, var81.method127((byte) 86))) {
                        if (class517.field7613) {
                            if (var81.field1900 == 0) {
                                class41.method233(arg0, var4, var81.field1911, var81.field1902, var81.field1898, var81.field1907);
                            } else {
                                class270.method1711(arg0, var4, var2, var3);
                                int var82 = var2 - class88.field1096;
                                int var83 = var3 - class204.field2910;
                                if (var81.field1900 == 2) {
                                    if (var83 > -var82) {
                                        class161.method1026(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class161.method1026(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class161.method1026(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class161.method1026(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class489.field6839.method352(arg0.field1669, arg0.field1662);
                        }
                        class170 var84 = var81.method126(class489.field6839, (byte) -111);
                        if (var84 != null) {
                            var84.field2470 = var81;
                            var84.field2474 = var4;
                            var84.field2471 = var81.field1911;
                            var84.field2472 = var81.field1902;
                            class22.field286.method2753(4, var84);
                        }
                    }
                    for (int var85 = var81.field1911; var85 <= var81.field1898; var85++) {
                        for (int var86 = var81.field1902; var86 <= var81.field1907; var86++) {
                            class239 var87 = var8[var85][var86];
                            if (var87.field3478 != 0) {
                                class435.field6118.method1455(-104, var87);
                            } else if ((var2 != var85 || var3 != var86) && var87.field3472) {
                                class435.field6118.method1455(-122, var87);
                            }
                        }
                    }
                }
                if (arg1.field3490) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field3490 = false;
            }
        }
        if (arg1.field3492 != null && (byte) (class35.field395 & 0xFF) == arg1.field3469) {
            class324 var88 = arg1.field3492;
            int var89 = class330.field4818[var4].method10(var2, var3);
            int var90;
            if (var4 < class409.field5785 - 1) {
                var90 = class330.field4818[var4].method10(var2, var3) - class330.field4818[var4 + 1].method10(var2, var3);
            } else {
                var90 = 0x8 << class493.field6970;
            }
            class323.field4723.method819(var6, var89, var7, arg0.field1666);
            int var91 = arg0.field1666[2];
            class323.field4723.method819(var6, var89 - var90, var7, arg0.field1666);
            int var92 = arg0.field1666[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class170.field2468;
            int var96 = class170.field2468 + var94;
            var88.field4732 = var95;
            var88.field4730 = var96;
            var88.field4731 = true;
            class489.field6839.method359(var88);
        }
        if (!arg1.field3472) {
            return;
        }
        if (arg1.field3478 != 0) {
            return;
        }
        if (var2 <= class88.field1096 && var2 > class230.field3392) {
            class239 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field3472) {
                return;
            }
        }
        if (var2 >= class88.field1096 && var2 < class209.field3046 - 1) {
            class239 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field3472) {
                return;
            }
        }
        if (var3 <= class204.field2910 && var3 > class187.field2692) {
            class239 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field3472) {
                return;
            }
        }
        if (var3 >= class204.field2910 && var3 < class276.field4100 - 1) {
            class239 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field3472) {
                return;
            }
        }
        arg1.field3472 = false;
        class357.field5124--;
        class371 var101 = arg1.field3495;
        if (var101 != null && var101.field5287) {
            if (class517.field7613) {
                class270.method1711(arg0, var4, var2, var3);
                class489.field6839.method352(arg0.field1669, arg0.field1662);
            }
            class170 var102 = var101.method126(class489.field6839, (byte) -125);
            if (var102 != null) {
                var102.field2470 = var101;
                var102.field2474 = var4;
                var102.field2471 = var2;
                var102.field2472 = var3;
                class22.field286.method2753(4, var102);
            }
        }
        if (arg1.field3488 != 0) {
            class362 var103 = arg1.field3474;
            if (var103 != null && !class296.method1822(var5, var2, var3, var103.method759(-20767))) {
                if ((var103.field5168 & arg1.field3488) != 0) {
                    if (class517.field7613) {
                        class270.method1711(arg0, var4, var2, var3);
                        class489.field6839.method352(arg0.field1669, arg0.field1662);
                    }
                    class170 var104 = var103.method126(class489.field6839, (byte) -123);
                    if (var104 != null) {
                        var104.field2470 = var103;
                        var104.field2474 = var4;
                        var104.field2471 = var2;
                        var104.field2472 = var3;
                        class22.field286.method2753(4, var104);
                    }
                } else if (var103.field5168 == 256) {
                    int var105 = var103.field5167 - class347.field5024;
                    int var106 = var103.field5171 - class181.field2608;
                    int var107 = var103.field5177;
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
                    if (class517.field7613) {
                        class270.method1711(arg0, var4, var2, var3);
                        class489.field6839.method352(arg0.field1669, arg0.field1662);
                    }
                    class362 var110 = arg1.field3471;
                    if (var109 > var108) {
                        class170 var111 = var103.method126(class489.field6839, (byte) -110);
                        if (var111 != null) {
                            var111.field2470 = var103;
                            var111.field2474 = var4;
                            var111.field2471 = var2;
                            var111.field2472 = var3;
                            class22.field286.method2753(4, var111);
                        }
                    } else if (var110 != null) {
                        class170 var112 = var110.method126(class489.field6839, (byte) -102);
                        if (var112 != null) {
                            var112.field2470 = var110;
                            var112.field2474 = var4;
                            var112.field2471 = var2;
                            var112.field2472 = var3;
                            class22.field286.method2753(4, var112);
                        }
                    }
                }
            }
            class232 var113 = arg1.field3487;
            class232 var114 = arg1.field3473;
            if (var114 != null && (var114.field3405 & arg1.field3488) != 0 && !class141.method884(var5, var2, var3, var114.field3405)) {
                if (class517.field7613) {
                    class513.method3060(arg0, var114.field3405, var4, var2, var3);
                    class489.field6839.method352(arg0.field1669, arg0.field1662);
                }
                class170 var115 = var114.method126(class489.field6839, (byte) -92);
                if (var115 != null) {
                    var115.field2470 = var114;
                    var115.field2474 = var4;
                    var115.field2471 = var2;
                    var115.field2472 = var3;
                    class22.field286.method2753(4, var115);
                }
            }
            if (var113 != null && (var113.field3405 & arg1.field3488) != 0 && !class141.method884(var5, var2, var3, var113.field3405)) {
                if (class517.field7613) {
                    class513.method3060(arg0, var113.field3405, var4, var2, var3);
                    class489.field6839.method352(arg0.field1669, arg0.field1662);
                }
                class170 var116 = var113.method126(class489.field6839, (byte) -96);
                if (var116 != null) {
                    var116.field2470 = var113;
                    var116.field2474 = var4;
                    var116.field2471 = var2;
                    var116.field2472 = var3;
                    class22.field286.method2753(4, var116);
                }
            }
        }
        if (var4 < class409.field5785 - 1) {
            class239 var117 = class268.field3910[var4 + 1][var2][var3];
            if (var117 != null && var117.field3472) {
                class435.field6118.method1457(117, var117);
            }
        }
        if (var2 < class88.field1096) {
            class239 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field3472) {
                class435.field6118.method1455(-118, var118);
            }
        }
        if (var3 < class204.field2910) {
            class239 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field3472) {
                class435.field6118.method1455(-110, var119);
            }
        }
        if (var2 > class88.field1096) {
            class239 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field3472) {
                class435.field6118.method1455(-104, var120);
            }
        }
        if (var3 > class204.field2910) {
            class239 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field3472) {
                class435.field6118.method1455(-100, var121);
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 1179)
    public class530(String arg0, String arg1, String arg2, String arg3) {
        this.field7762 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V", line = 1192)
    public static void method3115(int arg0) {
        field7760 = null;
        if (arg0 == 3) {
            field7765 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 1232)
    public final String method3116(int arg0, byte arg1) {
        if (arg1 <= 94) {
            return null;
        } else {
            field7759++;
            return this.field7762[arg0];
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z[BI)V", line = 1244)
    public static final void method3117(boolean arg0, byte[] arg1, int arg2) {
        field7761++;
        if (class71.field882 == null) {
            class71.field882 = new class403(20000);
        }
        class71.field882.method2363(arg2, arg1, -1, arg1.length);
        if (!arg0) {
            return;
        }
        class363.method2142(class71.field882.field5663, arg2 ^ 0x1);
        class20.field239 = new class135[class204.field2901];
        int var3 = 0;
        for (int var4 = class399.field5626; var4 <= class434.field6109; var4++) {
            class135 var5 = class167.method1050(-88, var4);
            if (var5 != null) {
                class20.field239[var3++] = var5;
            }
        }
        class2.field57 = false;
        class40.field441 = class465.method2699((byte) 14);
        class71.field882 = null;
    }

    @OriginalMember(owner = "client!kn", name = "toString", descriptor = "()Ljava/lang/String;", line = 1292)
    public final String toString() {
        field7766++;
        throw new IllegalStateException();
    }
}
