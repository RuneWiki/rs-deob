import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class402 extends class170 {

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "[B")
    public byte[] field5558;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "Lle;")
    public static class65 field5559 = new class65(128);

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V")
    public static void method2487(byte arg0) {
        if (arg0 <= -81) {
            field5559 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method2488(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5560++;
        int var8 = arg2 + arg5;
        int var9 = arg1 - arg2;
        for (int var10 = arg5; var10 < var8; var10++) {
            class149.method1112(arg6, arg3, 8, arg4, class83.field1157[var10]);
        }
        if (arg0 != 2) {
            field5559 = null;
        }
        for (int var11 = arg1; var11 > var9; var11--) {
            class149.method1112(arg6, arg3, 8, arg4, class83.field1157[var11]);
        }
        int var12 = arg2 + arg4;
        int var13 = arg3 - arg2;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class83.field1157[var14];
            class149.method1112(arg6, var12, arg0 ^ 0xA, arg4, var15);
            class149.method1112(arg7, var13, 8, var12, var15);
            class149.method1112(arg6, arg3, 8, var13, var15);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lgg;Lr;)V")
    public static final void method2489(class313 arg0, class63 arg1) {
        if (!arg1.field857) {
            return;
        }
        short var2 = arg1.field866;
        short var3 = arg1.field849;
        byte var4 = arg1.field865;
        byte var5 = arg1.field851;
        int var6 = (var2 << 7) + 64;
        int var7 = (var3 << 7) + 64;
        class63[][] var8 = class341.field4617[var4];
        float var10;
        if (class436.field6160 == class125.field1879) {
            int var9 = class124.field1876[var2][var3];
            class389.field5413.method229(class82.field1130[0].method331(var6, var7), var9 & 0xFFFFFF, var9 >>> 21 & 0x7F8);
            var10 = 251.5F;
        } else {
            var10 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class389.field5413.method180(3000.0F, var10 * 1.5F);
        if (arg1.field855) {
            if (class18.field237) {
                if (var4 > 0) {
                    class63 var11 = class341.field4617[var4 - 1][var2][var3];
                    if (var11 != null && var11.field857) {
                        return;
                    }
                }
                if (var2 <= class58.field750 && var2 > class92.field1293) {
                    class63 var12 = var8[var2 - 1][var3];
                    if (var12 != null && var12.field857 && (var12.field855 || (arg1.field860 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class58.field750 && var2 < class186.field2698 - 1) {
                    class63 var13 = var8[var2 + 1][var3];
                    if (var13 != null && var13.field857 && (var13.field855 || (arg1.field860 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class446.field6253 && var3 > class371.field5146) {
                    class63 var14 = var8[var2][var3 - 1];
                    if (var14 != null && var14.field857 && (var14.field855 || (arg1.field860 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class446.field6253 && var3 < class218.field3063 - 1) {
                    class63 var15 = var8[var2][var3 + 1];
                    if (var15 != null && var15.field857 && (var15.field855 || (arg1.field860 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class18.field237 = true;
            }
            arg1.field855 = false;
            if (arg1.field873 != null) {
                class63 var16 = arg1.field873;
                class389.field5413.method180(3000.0F, (201.5F - (float) (var16.field851 + 1) * 50.0F) * 1.5F);
                if (!class117.method913(var16.field851, var2, var3)) {
                    class436.field6160[var16.field851].method337(var2, var3);
                }
                class403 var17 = var16.field867;
                if (var17 != null) {
                    if (class346.field4681) {
                        if ((var17.field5570 & arg1.field870) == 0) {
                            class133.method992(arg0, var4, var2, var3);
                        } else {
                            class6.method41(arg0, var17.field5570, var5, var2, var3);
                        }
                        class389.field5413.method247(arg0.field4247, arg0.field4242);
                    }
                    var17.method696(0, class389.field5413);
                }
                for (class48 var18 = var16.field853; var18 != null; var18 = var18.field608) {
                    class5 var19 = var18.field617;
                    if (var19 != null) {
                        if (class346.field4681) {
                            class133.method992(arg0, var4, var2, var3);
                            class389.field5413.method247(arg0.field4247, arg0.field4242);
                        }
                        var19.method696(0, class389.field5413);
                    }
                }
                class389.field5413.method180(3000.0F, var10 * 1.5F);
            }
            boolean var20 = !class117.method913(var5, var2, var3);
            if (var20) {
                class436.field6160[var5].method337(var2, var3);
                class301 var21 = arg1.field854;
                if (var21 != null && var21.field4115) {
                    if (var21.field4106) {
                        class389.field5413.method180(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class346.field4681) {
                        class133.method992(arg0, var4, var2, var3);
                        class389.field5413.method247(arg0.field4247, arg0.field4242);
                    }
                    class450 var22 = var21.method696(0, class389.field5413);
                    if (var22 != null) {
                        var22.field6458 = var21;
                        var22.field6455 = var4;
                        var22.field6454 = var2;
                        var22.field6459 = var3;
                        class345.field4667.method2483(var22, 0);
                    }
                    if (var21.field4106) {
                        class389.field5413.method180(3000.0F, var10 * 1.5F);
                    }
                }
            }
            int var23 = 0;
            int var24 = 0;
            class403 var25 = arg1.field867;
            class371 var26 = arg1.field861;
            if (var25 != null || var26 != null) {
                if (class58.field750 == var2) {
                    var23++;
                } else if (class58.field750 < var2) {
                    var23 += 2;
                }
                if (class446.field6253 == var3) {
                    var23 += 3;
                } else if (class446.field6253 > var3) {
                    var23 += 6;
                }
                var24 = class362.field4990[var23];
                arg1.field870 = class70.field977[var23];
            }
            if (var25 != null) {
                if ((var25.field5570 & class339.field4593[var23]) == 0) {
                    arg1.field864 = 0;
                } else if (var25.field5570 == 16) {
                    arg1.field864 = 3;
                    arg1.field872 = class399.field5519[var23];
                    arg1.field862 = (byte) (3 - arg1.field872);
                } else if (var25.field5570 == 32) {
                    arg1.field864 = 6;
                    arg1.field872 = class412.field5734[var23];
                    arg1.field862 = (byte) (6 - arg1.field872);
                } else if (var25.field5570 == 64) {
                    arg1.field864 = 12;
                    arg1.field872 = class13.field117[var23];
                    arg1.field862 = (byte) (12 - arg1.field872);
                } else {
                    arg1.field864 = 9;
                    arg1.field872 = class350.field4717[var23];
                    arg1.field862 = (byte) (9 - arg1.field872);
                }
                if ((var25.field5570 & var24) != 0 && !class147.method1062(var5, var2, var3, var25.field5570)) {
                    if (class346.field4681) {
                        class133.method992(arg0, var4, var2, var3);
                        class389.field5413.method247(arg0.field4247, arg0.field4242);
                    }
                    class450 var27 = var25.method696(0, class389.field5413);
                    if (var27 != null) {
                        var27.field6458 = var25;
                        var27.field6455 = var4;
                        var27.field6454 = var2;
                        var27.field6459 = var3;
                        class345.field4667.method2483(var27, 0);
                    }
                }
                class403 var28 = arg1.field863;
                if (var28 != null && (var28.field5570 & var24) != 0 && !class147.method1062(var5, var2, var3, var28.field5570)) {
                    if (class346.field4681) {
                        class133.method992(arg0, var4, var2, var3);
                        class389.field5413.method247(arg0.field4247, arg0.field4242);
                    }
                    class450 var29 = var28.method696(0, class389.field5413);
                    if (var29 != null) {
                        var29.field6458 = var28;
                        var29.field6455 = var4;
                        var29.field6454 = var2;
                        var29.field6459 = var3;
                        class345.field4667.method2483(var29, 0);
                    }
                }
            }
            if (var26 != null && !class261.method1684(var5, var2, var3, var26.method807((byte) -113))) {
                class371 var30 = arg1.field859;
                class389.field5413.method180(3000.0F, (var10 - 0.5F) * 1.5F);
                if ((var26.field5138 & var24) != 0) {
                    if (class346.field4681) {
                        class133.method992(arg0, var4, var2, var3);
                        class389.field5413.method247(arg0.field4247, arg0.field4242);
                    }
                    class450 var31 = var26.method696(0, class389.field5413);
                    if (var31 != null) {
                        var31.field6458 = var26;
                        var31.field6455 = var4;
                        var31.field6454 = var2;
                        var31.field6459 = var3;
                        class345.field4667.method2483(var31, 0);
                    }
                } else if (var26.field5138 == 256) {
                    int var32 = var26.field5135 - class136.field2023;
                    int var33 = var26.field5137 - class373.field5175;
                    int var34 = var26.field5141;
                    int var35;
                    if (var34 == 1 || var34 == 2) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    int var36;
                    if (var34 == 2 || var34 == 3) {
                        var36 = -var33;
                    } else {
                        var36 = var33;
                    }
                    if (class346.field4681) {
                        class133.method992(arg0, var4, var2, var3);
                        class389.field5413.method247(arg0.field4247, arg0.field4242);
                    }
                    if (var36 < var35) {
                        class450 var37 = var26.method696(0, class389.field5413);
                        if (var37 != null) {
                            var37.field6458 = var26;
                            var37.field6455 = var4;
                            var37.field6454 = var2;
                            var37.field6459 = var3;
                            class345.field4667.method2483(var37, 0);
                        }
                    } else if (var30 != null) {
                        class450 var38 = var30.method696(0, class389.field5413);
                        if (var38 != null) {
                            var38.field6458 = var30;
                            var38.field6455 = var4;
                            var38.field6454 = var2;
                            var38.field6459 = var3;
                            class345.field4667.method2483(var38, 0);
                        }
                    }
                }
                class389.field5413.method180(3000.0F, var10 * 1.5F);
            }
            if (var20) {
                class301 var39 = arg1.field854;
                if (var39 != null && !var39.field4115) {
                    if (var39.field4106) {
                        class389.field5413.method180(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class346.field4681) {
                        class133.method992(arg0, var4, var2, var3);
                        class389.field5413.method247(arg0.field4247, arg0.field4242);
                    }
                    class450 var40 = var39.method696(0, class389.field5413);
                    if (var40 != null) {
                        var40.field6458 = var39;
                        var40.field6455 = var4;
                        var40.field6454 = var2;
                        var40.field6459 = var3;
                        class345.field4667.method2483(var40, 0);
                    }
                    if (var39.field4106) {
                        class389.field5413.method180(3000.0F, var10 * 1.5F);
                    }
                }
                class312 var41 = arg1.field856;
                if (var41 != null && !var41.field4232) {
                    if (class346.field4681) {
                        class133.method992(arg0, var4, var2, var3);
                        class389.field5413.method247(arg0.field4247, arg0.field4242);
                    }
                    class450 var42 = var41.method696(0, class389.field5413);
                    if (var42 != null) {
                        var42.field6458 = var41;
                        var42.field6455 = var4;
                        var42.field6454 = var2;
                        var42.field6459 = var3;
                        class345.field4667.method2483(var42, 0);
                    }
                }
            }
            byte var43 = arg1.field860;
            if (var43 != 0) {
                if (var2 < class58.field750 && (var43 & 0x4) != 0) {
                    class63 var44 = var8[var2 + 1][var3];
                    if (var44 != null && var44.field857) {
                        class316.field4283.method1568(var44, (byte) -125);
                    }
                }
                if (var3 < class446.field6253 && (var43 & 0x2) != 0) {
                    class63 var45 = var8[var2][var3 + 1];
                    if (var45 != null && var45.field857) {
                        class316.field4283.method1568(var45, (byte) -125);
                    }
                }
                if (var2 > class58.field750 && (var43 & 0x1) != 0) {
                    class63 var46 = var8[var2 - 1][var3];
                    if (var46 != null && var46.field857) {
                        class316.field4283.method1568(var46, (byte) -123);
                    }
                }
                if (var3 > class446.field6253 && (var43 & 0x8) != 0) {
                    class63 var47 = var8[var2][var3 - 1];
                    if (var47 != null && var47.field857) {
                        class316.field4283.method1568(var47, (byte) -128);
                    }
                }
            }
        }
        if (arg1.field864 != 0) {
            boolean var48 = true;
            for (class48 var49 = arg1.field853; var49 != null; var49 = var49.field608) {
                if (class410.field5724 != var49.field617.field51 && (var49.field613 & arg1.field864) == arg1.field872) {
                    var48 = false;
                    break;
                }
            }
            if (var48) {
                class403 var50 = arg1.field867;
                if (!class147.method1062(var5, var2, var3, var50.field5570)) {
                    if (class346.field4681) {
                        label687: {
                            if (var50.field5570 >= 16) {
                                int var51 = var2 - class58.field750;
                                int var52 = var3 - class446.field6253;
                                if (var50.field5570 == 16) {
                                    var51 -= 64;
                                    var52 += 64;
                                    if (var52 < var51 && var2 > 0 && var3 <= class354.field4768) {
                                        class133.method992(arg0, var4, var2 - 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field5570 == 32) {
                                    var51 += 64;
                                    var52 += 64;
                                    if (var52 < -var51 && var2 < class284.field3862 && var3 < class354.field4768) {
                                        class133.method992(arg0, var4, var2 + 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field5570 == 64) {
                                    var51 += 64;
                                    var52 -= 64;
                                    if (var52 > var51 && var2 < class284.field3862 && var3 > 0) {
                                        class133.method992(arg0, var4, var2 + 1, var3 - 1);
                                        break label687;
                                    }
                                } else if (var50.field5570 == 128) {
                                    var51 -= 64;
                                    var52 -= 64;
                                    if (var52 > -var51 && var2 > 0 && var3 > 0) {
                                        class133.method992(arg0, var4, var2 - 1, var3 - 1);
                                        break label687;
                                    }
                                }
                            }
                            class133.method992(arg0, var4, var2, var3);
                        }
                        class389.field5413.method247(arg0.field4247, arg0.field4242);
                    }
                    class450 var53 = var50.method696(0, class389.field5413);
                    if (var53 != null) {
                        var53.field6458 = var50;
                        var53.field6455 = var4;
                        var53.field6454 = var2;
                        var53.field6459 = var3;
                        class345.field4667.method2483(var53, 0);
                    }
                }
                arg1.field864 = 0;
            }
        }
        if (arg1.field858) {
            try {
                arg1.field858 = false;
                int var54 = 0;
                label630: for (class48 var55 = arg1.field853; var55 != null; var55 = var55.field608) {
                    class5 var56 = var55.field617;
                    if (class410.field5724 != var56.field51) {
                        for (int var57 = var56.field52; var57 <= var56.field47; var57++) {
                            for (int var58 = var56.field55; var58 <= var56.field41; var58++) {
                                class63 var59 = var8[var57][var58];
                                if (var59.field855) {
                                    arg1.field858 = true;
                                    continue label630;
                                }
                                if (var59.field864 != 0) {
                                    int var60 = 0;
                                    if (var57 > var56.field52) {
                                        var60++;
                                    }
                                    if (var57 < var56.field47) {
                                        var60 += 4;
                                    }
                                    if (var58 > var56.field55) {
                                        var60 += 8;
                                    }
                                    if (var58 < var56.field41) {
                                        var60 += 2;
                                    }
                                    if ((var60 & var59.field864) == arg1.field862) {
                                        arg1.field858 = true;
                                        continue label630;
                                    }
                                }
                            }
                        }
                        int var61 = class58.field750 - var56.field52;
                        int var62 = var56.field47 - class58.field750;
                        if (var62 > var61) {
                            var61 = var62;
                        }
                        int var63 = class446.field6253 - var56.field55;
                        int var64 = var56.field41 - class446.field6253;
                        if (var64 > var63) {
                            var63 = var64;
                        }
                        arg0.field4252[var54] = var56;
                        arg0.field4240[var54++] = var61 + var63;
                    }
                }
                while (var54 > 0) {
                    int var65 = -50;
                    int var66 = -1;
                    for (int var67 = 0; var67 < var54; var67++) {
                        class5 var68 = arg0.field4252[var67];
                        if (class410.field5724 != var68.field51) {
                            int var69 = arg0.field4240[var67];
                            if (var69 > var65) {
                                var65 = var69;
                                var66 = var67;
                            } else if (var65 == var69) {
                                int var70 = var68.field40 - class136.field2023;
                                int var71 = var68.field44 - class373.field5175;
                                int var72 = arg0.field4252[var66].field40 - class136.field2023;
                                int var73 = arg0.field4252[var66].field44 - class373.field5175;
                                if (var70 * var70 + var71 * var71 > var72 * var72 + var73 * var73) {
                                    var66 = var67;
                                }
                            }
                        }
                    }
                    if (var66 == -1) {
                        break;
                    }
                    class5 var74 = arg0.field4252[var66];
                    var74.field51 = class410.field5724;
                    if (!class75.method585(var5, var74.field52, var74.field47, var74.field55, var74.field41, var74.method23(-115))) {
                        if (class346.field4681) {
                            if (var74.field43 == 0) {
                                class218.method1447(arg0, var4, var74.field52, var74.field55, var74.field47, var74.field41);
                            } else {
                                class133.method992(arg0, var4, var2, var3);
                                int var75 = var2 - class58.field750;
                                int var76 = var3 - class446.field6253;
                                if (var74.field43 == 2) {
                                    if (var76 > -var75) {
                                        class4.method22(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class4.method22(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var76 > var75) {
                                    class4.method22(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class4.method22(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class389.field5413.method247(arg0.field4247, arg0.field4242);
                        }
                        class450 var77 = var74.method696(0, class389.field5413);
                        if (var77 != null) {
                            var77.field6458 = var74;
                            var77.field6455 = var4;
                            var77.field6454 = var74.field52;
                            var77.field6459 = var74.field55;
                            class345.field4667.method2483(var77, 0);
                        }
                    }
                    for (int var78 = var74.field52; var78 <= var74.field47; var78++) {
                        for (int var79 = var74.field55; var79 <= var74.field41; var79++) {
                            class63 var80 = var8[var78][var79];
                            if (var80.field864 != 0) {
                                class316.field4283.method1568(var80, (byte) -123);
                            } else if ((var2 != var78 || var3 != var79) && var80.field857) {
                                class316.field4283.method1568(var80, (byte) -125);
                            }
                        }
                    }
                }
                if (arg1.field858) {
                    return;
                }
            } catch (Exception var113) {
                arg1.field858 = false;
            }
        }
        if (arg1.field871 != null) {
            if ((byte) (class118.field1801 & 0xFF) == arg1.field869) {
                class174 var81 = arg1.field871;
                int var82 = class436.field6160[var4].method329(var2, var3);
                int var83;
                if (var4 < 3) {
                    var83 = class436.field6160[var4].method329(var2, var3) - class436.field6160[var4 + 1].method329(var2, var3);
                } else {
                    var83 = 1024;
                }
                class253.field3512.method1860(var6, var82, var7, arg0.field4249);
                int var84 = arg0.field4249[2];
                class253.field3512.method1860(var6, var82 - var83, var7, arg0.field4249);
                int var85 = arg0.field4249[2];
                int var86 = var84;
                int var87 = var85;
                if (var84 > var85) {
                    var86 = var85;
                    var87 = var84;
                }
                var86 -= 91;
                var87 += 91;
                if (var86 < var87 - 1597) {
                    var86 = var87 - 1597;
                }
                var81.field2487 = var86;
                var81.field2489 = var87;
                var81.field2488 = true;
                class389.field5413.method219(var81);
            } else {
                arg1.field871 = null;
            }
        }
        if (!arg1.field857) {
            return;
        }
        if (arg1.field864 != 0) {
            return;
        }
        if (var2 <= class58.field750 && var2 > class92.field1293) {
            class63 var88 = var8[var2 - 1][var3];
            if (var88 != null && var88.field857) {
                return;
            }
        }
        if (var2 >= class58.field750 && var2 < class186.field2698 - 1) {
            class63 var89 = var8[var2 + 1][var3];
            if (var89 != null && var89.field857) {
                return;
            }
        }
        if (var3 <= class446.field6253 && var3 > class371.field5146) {
            class63 var90 = var8[var2][var3 - 1];
            if (var90 != null && var90.field857) {
                return;
            }
        }
        if (var3 >= class446.field6253 && var3 < class218.field3063 - 1) {
            class63 var91 = var8[var2][var3 + 1];
            if (var91 != null && var91.field857) {
                return;
            }
        }
        arg1.field857 = false;
        class336.field4536--;
        class312 var92 = arg1.field856;
        if (var92 != null && var92.field4232) {
            if (class346.field4681) {
                class133.method992(arg0, var4, var2, var3);
                class389.field5413.method247(arg0.field4247, arg0.field4242);
            }
            class450 var93 = var92.method696(0, class389.field5413);
            if (var93 != null) {
                var93.field6458 = var92;
                var93.field6455 = var4;
                var93.field6454 = var2;
                var93.field6459 = var3;
                class345.field4667.method2483(var93, 0);
            }
        }
        if (arg1.field870 != 0) {
            class371 var94 = arg1.field861;
            if (var94 != null && !class261.method1684(var5, var2, var3, var94.method807((byte) -105))) {
                if ((var94.field5138 & arg1.field870) != 0) {
                    if (class346.field4681) {
                        class133.method992(arg0, var4, var2, var3);
                        class389.field5413.method247(arg0.field4247, arg0.field4242);
                    }
                    class450 var95 = var94.method696(0, class389.field5413);
                    if (var95 != null) {
                        var95.field6458 = var94;
                        var95.field6455 = var4;
                        var95.field6454 = var2;
                        var95.field6459 = var3;
                        class345.field4667.method2483(var95, 0);
                    }
                } else if (var94.field5138 == 256) {
                    int var96 = var94.field5135 - class136.field2023;
                    int var97 = var94.field5137 - class373.field5175;
                    int var98 = var94.field5141;
                    int var99;
                    if (var98 == 1 || var98 == 2) {
                        var99 = -var96;
                    } else {
                        var99 = var96;
                    }
                    int var100;
                    if (var98 == 2 || var98 == 3) {
                        var100 = -var97;
                    } else {
                        var100 = var97;
                    }
                    if (class346.field4681) {
                        class133.method992(arg0, var4, var2, var3);
                        class389.field5413.method247(arg0.field4247, arg0.field4242);
                    }
                    class371 var101 = arg1.field859;
                    if (var100 > var99) {
                        class450 var102 = var94.method696(0, class389.field5413);
                        if (var102 != null) {
                            var102.field6458 = var94;
                            var102.field6455 = var4;
                            var102.field6454 = var2;
                            var102.field6459 = var3;
                            class345.field4667.method2483(var102, 0);
                        }
                    } else if (var101 != null) {
                        class450 var103 = var101.method696(0, class389.field5413);
                        if (var103 != null) {
                            var103.field6458 = var101;
                            var103.field6455 = var4;
                            var103.field6454 = var2;
                            var103.field6459 = var3;
                            class345.field4667.method2483(var103, 0);
                        }
                    }
                }
            }
            class403 var104 = arg1.field867;
            class403 var105 = arg1.field863;
            if (var105 != null && (var105.field5570 & arg1.field870) != 0 && !class147.method1062(var5, var2, var3, var105.field5570)) {
                if (class346.field4681) {
                    class6.method41(arg0, var105.field5570, var4, var2, var3);
                    class389.field5413.method247(arg0.field4247, arg0.field4242);
                }
                class450 var106 = var105.method696(0, class389.field5413);
                if (var106 != null) {
                    var106.field6458 = var105;
                    var106.field6455 = var4;
                    var106.field6454 = var2;
                    var106.field6459 = var3;
                    class345.field4667.method2483(var106, 0);
                }
            }
            if (var104 != null && (var104.field5570 & arg1.field870) != 0 && !class147.method1062(var5, var2, var3, var104.field5570)) {
                if (class346.field4681) {
                    class6.method41(arg0, var104.field5570, var4, var2, var3);
                    class389.field5413.method247(arg0.field4247, arg0.field4242);
                }
                class450 var107 = var104.method696(0, class389.field5413);
                if (var107 != null) {
                    var107.field6458 = var104;
                    var107.field6455 = var4;
                    var107.field6454 = var2;
                    var107.field6459 = var3;
                    class345.field4667.method2483(var107, 0);
                }
            }
        }
        if (var4 < class409.field5706 - 1) {
            class63 var108 = class341.field4617[var4 + 1][var2][var3];
            if (var108 != null && var108.field857) {
                class316.field4283.method1572(5000, var108);
            }
        }
        if (var2 < class58.field750) {
            class63 var109 = var8[var2 + 1][var3];
            if (var109 != null && var109.field857) {
                class316.field4283.method1568(var109, (byte) -128);
            }
        }
        if (var3 < class446.field6253) {
            class63 var110 = var8[var2][var3 + 1];
            if (var110 != null && var110.field857) {
                class316.field4283.method1568(var110, (byte) -125);
            }
        }
        if (var2 > class58.field750) {
            class63 var111 = var8[var2 - 1][var3];
            if (var111 != null && var111.field857) {
                class316.field4283.method1568(var111, (byte) -124);
            }
        }
        if (var3 > class446.field6253) {
            class63 var112 = var8[var2][var3 - 1];
            if (var112 != null && var112.field857) {
                class316.field4283.method1568(var112, (byte) -125);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "([B)V")
    public class402(byte[] arg0) {
        this.field5558 = arg0;
    }
}
