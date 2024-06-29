import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class165 {

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "Lfc;")
    public static class235 field2509 = new class235(62, 5);

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "Luc;")
    public static class27 field2510 = new class27(20, 2);

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "F")
    public static float field2511;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lmh;Lhl;)V", line = 3)
    public static final void method1144(class577 arg0, class486 arg1) {
        if (!arg1.field6742) {
            return;
        }
        short var2 = arg1.field6738;
        short var3 = arg1.field6731;
        byte var4 = arg1.field6744;
        byte var5 = arg1.field6737;
        int var6 = (var2 << class627.field8753) + class634.field8905;
        int var7 = (var3 << class627.field8753) + class634.field8905;
        class486[][] var8 = class658.field9266[var4];
        if (class581.field8114 == class144.field2149) {
            class449.field6276.method410(class31.field369[0].method267(var6, var7), class558.method3058(var2, var3), class273.method1664(var2, var3), class496.method2771(var2, var3));
        }
        if (arg1.field6730) {
            if (class604.field8396) {
                if (var4 > 0) {
                    class486 var9 = class658.field9266[var4 - 1][var2][var3];
                    if (var9 != null && var9.field6742) {
                        return;
                    }
                }
                if (var2 <= class532.field7247 && var2 > class380.field5354) {
                    class486 var10 = var8[var2 - 1][var3];
                    if (var10 != null && var10.field6742 && (var10.field6730 || (arg1.field6733 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class532.field7247 && var2 < class426.field5996 - 1) {
                    class486 var11 = var8[var2 + 1][var3];
                    if (var11 != null && var11.field6742 && (var11.field6730 || (arg1.field6733 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class159.field2386 && var3 > class661.field9284) {
                    class486 var12 = var8[var2][var3 - 1];
                    if (var12 != null && var12.field6742 && (var12.field6730 || (arg1.field6733 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class159.field2386 && var3 < class116.field1549 - 1) {
                    class486 var13 = var8[var2][var3 + 1];
                    if (var13 != null && var13.field6742 && (var13.field6730 || (arg1.field6733 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class604.field8396 = true;
            }
            arg1.field6730 = false;
            if (arg1.field6745 != null) {
                class486 var14 = arg1.field6745;
                if (!class308.method1898(var14.field6737, var2, var3)) {
                    class144.field2149[var14.field6737].method280(var2, var3);
                }
                class86 var15 = var14.field6750;
                if (var15 != null) {
                    if (class507.field6949) {
                        if ((var15.field1180 & arg1.field6749) == 0) {
                            class110.method821(arg0, var4, var2, var3);
                        } else {
                            class138.method978(arg0, var15.field1180, var5, var2, var3);
                        }
                        class449.field6276.method398(arg0.field7757, arg0.field7752);
                    }
                    var15.method555(0, class449.field6276);
                }
                for (class20 var16 = var14.field6751; var16 != null; var16 = var16.field284) {
                    class39 var17 = var16.field281;
                    if (var17 != null) {
                        if (class507.field6949) {
                            class110.method821(arg0, var4, var2, var3);
                            class449.field6276.method398(arg0.field7757, arg0.field7752);
                        }
                        var17.method555(0, class449.field6276);
                    }
                }
            }
            boolean var18 = !class308.method1898(var5, var2, var3);
            if (var18) {
                class144.field2149[var5].method280(var2, var3);
                class348 var19 = arg1.field6748;
                if (var19 != null && var19.field5011) {
                    if (class507.field6949) {
                        class110.method821(arg0, var4, var2, var3);
                        class449.field6276.method398(arg0.field7757, arg0.field7752);
                    }
                    class60 var20 = var19.method555(0, class449.field6276);
                    if (var20 != null) {
                        var20.field817 = var19;
                        var20.field813 = var4;
                        var20.field814 = var2;
                        var20.field820 = var3;
                        class91.field1210.method3679(var20, 0);
                    }
                }
            }
            int var21 = 0;
            int var22 = 0;
            class86 var23 = arg1.field6750;
            class404 var24 = arg1.field6729;
            if (var23 != null || var24 != null) {
                if (class532.field7247 == var2) {
                    var21++;
                } else if (class532.field7247 < var2) {
                    var21 += 2;
                }
                if (class159.field2386 == var3) {
                    var21 += 3;
                } else if (class159.field2386 > var3) {
                    var21 += 6;
                }
                var22 = class113.field1531[var21];
                arg1.field6749 = class412.field5838[var21];
            }
            if (var23 != null) {
                if ((var23.field1180 & class428.field6019[var21]) == 0) {
                    arg1.field6735 = 0;
                } else if (var23.field1180 == 16) {
                    arg1.field6735 = 3;
                    arg1.field6734 = class475.field6643[var21];
                    arg1.field6732 = (byte) (3 - arg1.field6734);
                } else if (var23.field1180 == 32) {
                    arg1.field6735 = 6;
                    arg1.field6734 = class637.field9046[var21];
                    arg1.field6732 = (byte) (6 - arg1.field6734);
                } else if (var23.field1180 == 64) {
                    arg1.field6735 = 12;
                    arg1.field6734 = class188.field2776[var21];
                    arg1.field6732 = (byte) (12 - arg1.field6734);
                } else {
                    arg1.field6735 = 9;
                    arg1.field6734 = class465.field6545[var21];
                    arg1.field6732 = (byte) (9 - arg1.field6734);
                }
                if ((var23.field1180 & var22) != 0 && !class558.method3063(var5, var2, var3, var23.field1180)) {
                    if (class507.field6949) {
                        class110.method821(arg0, var4, var2, var3);
                        class449.field6276.method398(arg0.field7757, arg0.field7752);
                    }
                    class60 var25 = var23.method555(0, class449.field6276);
                    if (var25 != null) {
                        var25.field817 = var23;
                        var25.field813 = var4;
                        var25.field814 = var2;
                        var25.field820 = var3;
                        class91.field1210.method3679(var25, 0);
                    }
                }
                class86 var26 = arg1.field6741;
                if (var26 != null && (var26.field1180 & var22) != 0 && !class558.method3063(var5, var2, var3, var26.field1180)) {
                    if (class507.field6949) {
                        class110.method821(arg0, var4, var2, var3);
                        class449.field6276.method398(arg0.field7757, arg0.field7752);
                    }
                    class60 var27 = var26.method555(0, class449.field6276);
                    if (var27 != null) {
                        var27.field817 = var26;
                        var27.field813 = var4;
                        var27.field814 = var2;
                        var27.field820 = var3;
                        class91.field1210.method3679(var27, 0);
                    }
                }
            }
            if (var24 != null && !class209.method1379(var5, var2, var3, var24.method575(-121))) {
                class404 var28 = arg1.field6728;
                if ((var24.field5719 & var22) != 0) {
                    if (class507.field6949) {
                        class110.method821(arg0, var4, var2, var3);
                        class449.field6276.method398(arg0.field7757, arg0.field7752);
                    }
                    class60 var29 = var24.method555(0, class449.field6276);
                    if (var29 != null) {
                        var29.field817 = var24;
                        var29.field813 = var4;
                        var29.field814 = var2;
                        var29.field820 = var3;
                        class91.field1210.method3679(var29, 0);
                    }
                } else if (var24.field5719 == 256) {
                    int var30 = var24.field5716 - class7.field76;
                    int var31 = var24.field5720 - class247.field3511;
                    int var32 = var24.field5711;
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
                    if (class507.field6949) {
                        class110.method821(arg0, var4, var2, var3);
                        class449.field6276.method398(arg0.field7757, arg0.field7752);
                    }
                    if (var34 < var33) {
                        class60 var35 = var24.method555(0, class449.field6276);
                        if (var35 != null) {
                            var35.field817 = var24;
                            var35.field813 = var4;
                            var35.field814 = var2;
                            var35.field820 = var3;
                            class91.field1210.method3679(var35, 0);
                        }
                    } else if (var28 != null) {
                        class60 var36 = var28.method555(0, class449.field6276);
                        if (var36 != null) {
                            var36.field817 = var28;
                            var36.field813 = var4;
                            var36.field814 = var2;
                            var36.field820 = var3;
                            class91.field1210.method3679(var36, 0);
                        }
                    }
                }
            }
            if (var18) {
                class348 var37 = arg1.field6748;
                if (var37 != null && !var37.field5011) {
                    if (class507.field6949) {
                        class110.method821(arg0, var4, var2, var3);
                        class449.field6276.method398(arg0.field7757, arg0.field7752);
                    }
                    class60 var38 = var37.method555(0, class449.field6276);
                    if (var38 != null) {
                        var38.field817 = var37;
                        var38.field813 = var4;
                        var38.field814 = var2;
                        var38.field820 = var3;
                        class91.field1210.method3679(var38, 0);
                    }
                }
                class32 var39 = arg1.field6743;
                if (var39 != null && !var39.field378) {
                    if (class507.field6949) {
                        class110.method821(arg0, var4, var2, var3);
                        class449.field6276.method398(arg0.field7757, arg0.field7752);
                    }
                    class60 var40 = var39.method555(0, class449.field6276);
                    if (var40 != null) {
                        var40.field817 = var39;
                        var40.field813 = var4;
                        var40.field814 = var2;
                        var40.field820 = var3;
                        class91.field1210.method3679(var40, 0);
                    }
                }
            }
            byte var41 = arg1.field6733;
            if (var41 != 0) {
                if (var2 < class532.field7247 && (var41 & 0x4) != 0) {
                    class486 var42 = var8[var2 + 1][var3];
                    if (var42 != null && var42.field6742) {
                        class220.field3196.method2420(var42, (byte) 118);
                    }
                }
                if (var3 < class159.field2386 && (var41 & 0x2) != 0) {
                    class486 var43 = var8[var2][var3 + 1];
                    if (var43 != null && var43.field6742) {
                        class220.field3196.method2420(var43, (byte) 118);
                    }
                }
                if (var2 > class532.field7247 && (var41 & 0x1) != 0) {
                    class486 var44 = var8[var2 - 1][var3];
                    if (var44 != null && var44.field6742) {
                        class220.field3196.method2420(var44, (byte) 118);
                    }
                }
                if (var3 > class159.field2386 && (var41 & 0x8) != 0) {
                    class486 var45 = var8[var2][var3 - 1];
                    if (var45 != null && var45.field6742) {
                        class220.field3196.method2420(var45, (byte) 118);
                    }
                }
            }
        }
        if (arg1.field6735 != 0) {
            boolean var46 = true;
            for (class20 var47 = arg1.field6751; var47 != null; var47 = var47.field284) {
                if (class687.field9664 != var47.field281.field515 && (var47.field286 & arg1.field6735) == arg1.field6734) {
                    var46 = false;
                    break;
                }
            }
            if (var46) {
                class86 var48 = arg1.field6750;
                if (!class558.method3063(var5, var2, var3, var48.field1180)) {
                    if (class507.field6949) {
                        label663: {
                            if (var48.field1180 >= 16) {
                                int var49 = var2 - class532.field7247;
                                int var50 = var3 - class159.field2386;
                                if (var48.field1180 == 16) {
                                    int var51 = var49 - class634.field8905;
                                    int var52 = class634.field8905 + var50;
                                    if (var52 < var51 && var2 > 0 && var3 <= class22.field308) {
                                        class110.method821(arg0, var4, var2 - 1, var3 + 1);
                                        break label663;
                                    }
                                } else if (var48.field1180 == 32) {
                                    int var53 = class634.field8905 + var49;
                                    int var54 = class634.field8905 + var50;
                                    if (var54 < -var53 && var2 < class137.field1931 && var3 < class22.field308) {
                                        class110.method821(arg0, var4, var2 + 1, var3 + 1);
                                        break label663;
                                    }
                                } else if (var48.field1180 == 64) {
                                    int var55 = class634.field8905 + var49;
                                    int var56 = var50 - class634.field8905;
                                    if (var56 > var55 && var2 < class137.field1931 && var3 > 0) {
                                        class110.method821(arg0, var4, var2 + 1, var3 - 1);
                                        break label663;
                                    }
                                } else if (var48.field1180 == 128) {
                                    int var57 = var49 - class634.field8905;
                                    int var58 = var50 - class634.field8905;
                                    if (var58 > -var57 && var2 > 0 && var3 > 0) {
                                        class110.method821(arg0, var4, var2 - 1, var3 - 1);
                                        break label663;
                                    }
                                }
                            }
                            class110.method821(arg0, var4, var2, var3);
                        }
                        class449.field6276.method398(arg0.field7757, arg0.field7752);
                    }
                    class60 var59 = var48.method555(0, class449.field6276);
                    if (var59 != null) {
                        var59.field817 = var48;
                        var59.field813 = var4;
                        var59.field814 = var2;
                        var59.field820 = var3;
                        class91.field1210.method3679(var59, 0);
                    }
                }
                arg1.field6735 = 0;
            }
        }
        if (arg1.field6736) {
            try {
                arg1.field6736 = false;
                int var60 = 0;
                label606: for (class20 var61 = arg1.field6751; var61 != null; var61 = var61.field284) {
                    class39 var62 = var61.field281;
                    if (class687.field9664 != var62.field515) {
                        for (int var63 = var62.field517; var63 <= var62.field516; var63++) {
                            for (int var64 = var62.field512; var64 <= var62.field519; var64++) {
                                class486 var65 = var8[var63][var64];
                                if (var65.field6730) {
                                    arg1.field6736 = true;
                                    continue label606;
                                }
                                if (var65.field6735 != 0) {
                                    int var66 = 0;
                                    if (var63 > var62.field517) {
                                        var66++;
                                    }
                                    if (var63 < var62.field516) {
                                        var66 += 4;
                                    }
                                    if (var64 > var62.field512) {
                                        var66 += 8;
                                    }
                                    if (var64 < var62.field519) {
                                        var66 += 2;
                                    }
                                    if ((var66 & var65.field6735) == arg1.field6732) {
                                        arg1.field6736 = true;
                                        continue label606;
                                    }
                                }
                            }
                        }
                        int var67 = class532.field7247 - var62.field517;
                        int var68 = var62.field516 - class532.field7247;
                        if (var68 > var67) {
                            var67 = var68;
                        }
                        int var69 = class159.field2386 - var62.field512;
                        int var70 = var62.field519 - class159.field2386;
                        if (var70 > var69) {
                            var69 = var70;
                        }
                        arg0.field7751[var60] = var62;
                        arg0.field7755[var60++] = var67 + var69;
                    }
                }
                while (var60 > 0) {
                    int var71 = -50;
                    int var72 = -1;
                    for (int var73 = 0; var73 < var60; var73++) {
                        class39 var74 = arg0.field7751[var73];
                        if (class687.field9664 != var74.field515) {
                            int var75 = arg0.field7755[var73];
                            if (var75 > var71) {
                                var71 = var75;
                                var72 = var73;
                            } else if (var71 == var75) {
                                int var76 = var74.field509 - class7.field76;
                                int var77 = var74.field514 - class247.field3511;
                                int var78 = arg0.field7751[var72].field509 - class7.field76;
                                int var79 = arg0.field7751[var72].field514 - class247.field3511;
                                if (var76 * var76 + var77 * var77 > var78 * var78 + var79 * var79) {
                                    var72 = var73;
                                }
                            }
                        }
                    }
                    if (var72 == -1) {
                        break;
                    }
                    class39 var80 = arg0.field7751[var72];
                    var80.field515 = class687.field9664;
                    if (!class432.method2454(var5, var80.field517, var80.field516, var80.field512, var80.field519, var80.method179(-1))) {
                        if (class507.field6949) {
                            if (var80.field510 == 0) {
                                class397.method2261(arg0, var4, var80.field517, var80.field512, var80.field516, var80.field519);
                            } else {
                                class110.method821(arg0, var4, var2, var3);
                                int var81 = var2 - class532.field7247;
                                int var82 = var3 - class159.field2386;
                                if (var80.field510 == 2) {
                                    if (var82 > -var81) {
                                        class449.method2577(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class449.method2577(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var82 > var81) {
                                    class449.method2577(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class449.method2577(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class449.field6276.method398(arg0.field7757, arg0.field7752);
                        }
                        class60 var83 = var80.method555(0, class449.field6276);
                        if (var83 != null) {
                            var83.field817 = var80;
                            var83.field813 = var4;
                            var83.field814 = var80.field517;
                            var83.field820 = var80.field512;
                            class91.field1210.method3679(var83, 0);
                        }
                    }
                    for (int var84 = var80.field517; var84 <= var80.field516; var84++) {
                        for (int var85 = var80.field512; var85 <= var80.field519; var85++) {
                            class486 var86 = var8[var84][var85];
                            if (var86.field6735 != 0) {
                                class220.field3196.method2420(var86, (byte) 118);
                            } else if ((var2 != var84 || var3 != var85) && var86.field6742) {
                                class220.field3196.method2420(var86, (byte) 118);
                            }
                        }
                    }
                }
                if (arg1.field6736) {
                    return;
                }
            } catch (Exception var121) {
                arg1.field6736 = false;
            }
        }
        if (arg1.field6726 != null && (byte) (class548.field7414 & 0xFF) == arg1.field6727) {
            class281 var87 = arg1.field6726;
            int var88 = class144.field2149[var4].method273(var2, var3);
            int var89;
            if (var4 < class552.field7467 - 1) {
                var89 = class144.field2149[var4].method273(var2, var3) - class144.field2149[var4 + 1].method273(var2, var3);
            } else {
                var89 = 0x8 << class627.field8753;
            }
            class161.field2478.method1291(var6, var88, var7, arg0.field7756);
            int var90 = arg0.field7756[2];
            class161.field2478.method1291(var6, var88 - var89, var7, arg0.field7756);
            int var91 = arg0.field7756[2];
            int var92 = var90;
            int var93 = var91;
            if (var90 > var91) {
                var92 = var91;
                var93 = var90;
            }
            int var94 = var92 - class88.field1197;
            int var95 = class88.field1197 + var93;
            var87.field3928 = var94;
            var87.field3926 = var95;
            var87.field3930 = true;
            class449.field6276.method419(var87);
        }
        if (!arg1.field6742) {
            return;
        }
        if (arg1.field6735 != 0) {
            return;
        }
        if (var2 <= class532.field7247 && var2 > class380.field5354) {
            class486 var96 = var8[var2 - 1][var3];
            if (var96 != null && var96.field6742) {
                return;
            }
        }
        if (var2 >= class532.field7247 && var2 < class426.field5996 - 1) {
            class486 var97 = var8[var2 + 1][var3];
            if (var97 != null && var97.field6742) {
                return;
            }
        }
        if (var3 <= class159.field2386 && var3 > class661.field9284) {
            class486 var98 = var8[var2][var3 - 1];
            if (var98 != null && var98.field6742) {
                return;
            }
        }
        if (var3 >= class159.field2386 && var3 < class116.field1549 - 1) {
            class486 var99 = var8[var2][var3 + 1];
            if (var99 != null && var99.field6742) {
                return;
            }
        }
        arg1.field6742 = false;
        class252.field3535--;
        class32 var100 = arg1.field6743;
        if (var100 != null && var100.field378) {
            if (class507.field6949) {
                class110.method821(arg0, var4, var2, var3);
                class449.field6276.method398(arg0.field7757, arg0.field7752);
            }
            class60 var101 = var100.method555(0, class449.field6276);
            if (var101 != null) {
                var101.field817 = var100;
                var101.field813 = var4;
                var101.field814 = var2;
                var101.field820 = var3;
                class91.field1210.method3679(var101, 0);
            }
        }
        if (arg1.field6749 != 0) {
            class404 var102 = arg1.field6729;
            if (var102 != null && !class209.method1379(var5, var2, var3, var102.method575(-127))) {
                if ((var102.field5719 & arg1.field6749) != 0) {
                    if (class507.field6949) {
                        class110.method821(arg0, var4, var2, var3);
                        class449.field6276.method398(arg0.field7757, arg0.field7752);
                    }
                    class60 var103 = var102.method555(0, class449.field6276);
                    if (var103 != null) {
                        var103.field817 = var102;
                        var103.field813 = var4;
                        var103.field814 = var2;
                        var103.field820 = var3;
                        class91.field1210.method3679(var103, 0);
                    }
                } else if (var102.field5719 == 256) {
                    int var104 = var102.field5716 - class7.field76;
                    int var105 = var102.field5720 - class247.field3511;
                    int var106 = var102.field5711;
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
                    if (class507.field6949) {
                        class110.method821(arg0, var4, var2, var3);
                        class449.field6276.method398(arg0.field7757, arg0.field7752);
                    }
                    class404 var109 = arg1.field6728;
                    if (var108 > var107) {
                        class60 var110 = var102.method555(0, class449.field6276);
                        if (var110 != null) {
                            var110.field817 = var102;
                            var110.field813 = var4;
                            var110.field814 = var2;
                            var110.field820 = var3;
                            class91.field1210.method3679(var110, 0);
                        }
                    } else if (var109 != null) {
                        class60 var111 = var109.method555(0, class449.field6276);
                        if (var111 != null) {
                            var111.field817 = var109;
                            var111.field813 = var4;
                            var111.field814 = var2;
                            var111.field820 = var3;
                            class91.field1210.method3679(var111, 0);
                        }
                    }
                }
            }
            class86 var112 = arg1.field6750;
            class86 var113 = arg1.field6741;
            if (var113 != null && (var113.field1180 & arg1.field6749) != 0 && !class558.method3063(var5, var2, var3, var113.field1180)) {
                if (class507.field6949) {
                    class138.method978(arg0, var113.field1180, var4, var2, var3);
                    class449.field6276.method398(arg0.field7757, arg0.field7752);
                }
                class60 var114 = var113.method555(0, class449.field6276);
                if (var114 != null) {
                    var114.field817 = var113;
                    var114.field813 = var4;
                    var114.field814 = var2;
                    var114.field820 = var3;
                    class91.field1210.method3679(var114, 0);
                }
            }
            if (var112 != null && (var112.field1180 & arg1.field6749) != 0 && !class558.method3063(var5, var2, var3, var112.field1180)) {
                if (class507.field6949) {
                    class138.method978(arg0, var112.field1180, var4, var2, var3);
                    class449.field6276.method398(arg0.field7757, arg0.field7752);
                }
                class60 var115 = var112.method555(0, class449.field6276);
                if (var115 != null) {
                    var115.field817 = var112;
                    var115.field813 = var4;
                    var115.field814 = var2;
                    var115.field820 = var3;
                    class91.field1210.method3679(var115, 0);
                }
            }
        }
        if (var4 < class552.field7467 - 1) {
            class486 var116 = class658.field9266[var4 + 1][var2][var3];
            if (var116 != null && var116.field6742) {
                class220.field3196.method2429(true, var116);
            }
        }
        if (var2 < class532.field7247) {
            class486 var117 = var8[var2 + 1][var3];
            if (var117 != null && var117.field6742) {
                class220.field3196.method2420(var117, (byte) 118);
            }
        }
        if (var3 < class159.field2386) {
            class486 var118 = var8[var2][var3 + 1];
            if (var118 != null && var118.field6742) {
                class220.field3196.method2420(var118, (byte) 118);
            }
        }
        if (var2 > class532.field7247) {
            class486 var119 = var8[var2 - 1][var3];
            if (var119 != null && var119.field6742) {
                class220.field3196.method2420(var119, (byte) 118);
            }
        }
        if (var3 > class159.field2386) {
            class486 var120 = var8[var2][var3 - 1];
            if (var120 != null && var120.field6742) {
                class220.field3196.method2420(var120, (byte) 118);
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V", line = 1098)
    public static void method1145(int arg0) {
        field2509 = null;
        field2510 = null;
        if (arg0 != -18414) {
            method1144(null, null);
        }
    }
}
