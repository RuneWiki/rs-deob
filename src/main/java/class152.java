import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public abstract class class152 extends class551 {

    @OriginalMember(owner = "client!un", name = "y", descriptor = "I")
    public int field1951;

    @OriginalMember(owner = "client!un", name = "x", descriptor = "J")
    public static long field1950 = -1L;

    @OriginalMember(owner = "client!un", name = "s", descriptor = "Lfo;")
    public static class22 field1945 = new class22(1, 3);

    @OriginalMember(owner = "client!un", name = "A", descriptor = "I")
    public static int field1953 = 0;

    @OriginalMember(owner = "client!un", name = "t", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!un", name = "u", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!un", name = "v", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!un", name = "w", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!un", name = "z", descriptor = "[I")
    public static int[] field1952;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "(I)V", line = 4)
    public static void method888(int arg0) {
        if (arg0 != -23977) {
            method894(-48, -2);
        }
        field1945 = null;
        field1952 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IBJI)V", line = 18)
    public static final void method889(int arg0, byte arg1, long arg2, int arg3) {
        field1948++;
        int var5 = (int) arg2 >> 14 & 0x1F;
        int var6 = (int) arg2 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class158 var8 = class312.field4690.method2004(false, var7);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field2014;
                var10 = var8.field2017;
            } else {
                var9 = var8.field2017;
                var10 = var8.field2014;
            }
            int var11 = var8.field2071;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class632.method3679(true, 0, var10, -1, var9, var11, arg3, arg0, 0);
        } else {
            class632.method3679(true, var5, 0, -1, 0, 0, arg3, arg0, var6);
        }
        if (arg1 != -19) {
            method894(46, 109);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lhaa;Lsk;)V", line = 67)
    public static final void method890(class77 arg0, class415 arg1) {
        if (!arg1.field5991) {
            return;
        }
        short var2 = arg1.field5975;
        short var3 = arg1.field5988;
        byte var4 = arg1.field5990;
        byte var5 = arg1.field5984;
        int var6 = (var2 << class179.field2726) + class605.field8913;
        int var7 = (var3 << class179.field2726) + class605.field8913;
        class415[][] var8 = class526.field7777[var4];
        float var9;
        if (class287.field4219 == class235.field3455) {
            class139.field1827.method979(class562.field8337[0].method1323(var6, var7), class501.method3012(var2, var3), class241.method1546(var2, var3), class582.method3401(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class139.field1827.method1009(3000.0F, var9 * 1.5F);
        if (arg1.field5972) {
            if (class232.field3430) {
                if (var4 > 0) {
                    class415 var10 = class526.field7777[var4 - 1][var2][var3];
                    if (var10 != null && var10.field5991) {
                        return;
                    }
                }
                if (var2 <= class365.field5254 && var2 > class580.field8548) {
                    class415 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field5991 && (var11.field5972 || (arg1.field5992 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class365.field5254 && var2 < class309.field4509 - 1) {
                    class415 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field5991 && (var12.field5972 || (arg1.field5992 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class613.field8993 && var3 > class10.field90) {
                    class415 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field5991 && (var13.field5972 || (arg1.field5992 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class613.field8993 && var3 < class605.field8906 - 1) {
                    class415 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field5991 && (var14.field5972 || (arg1.field5992 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class232.field3430 = true;
            }
            arg1.field5972 = false;
            if (arg1.field5979 != null) {
                class415 var15 = arg1.field5979;
                class139.field1827.method1009(3000.0F, (201.5F - (float) (var15.field5984 + 1) * 50.0F) * 1.5F);
                if (!class239.method1539(var15.field5984, var2, var3)) {
                    class235.field3455[var15.field5984].method1330(var2, var3);
                }
                class578 var16 = var15.field5987;
                if (var16 != null) {
                    if (class509.field7559) {
                        if ((var16.field8512 & arg1.field5993) == 0) {
                            class259.method1632(arg0, var4, var2, var3);
                        } else {
                            class260.method1645(arg0, var16.field8512, var5, var2, var3);
                        }
                        class139.field1827.method1045(arg0.field895, arg0.field890);
                    }
                    var16.method169(-911932384, class139.field1827);
                }
                for (class639 var17 = var15.field5981; var17 != null; var17 = var17.field9291) {
                    class237 var18 = var17.field9288;
                    if (var18 != null) {
                        if (class509.field7559) {
                            class259.method1632(arg0, var4, var2, var3);
                            class139.field1827.method1045(arg0.field895, arg0.field890);
                        }
                        var18.method169(-911932384, class139.field1827);
                    }
                }
                class139.field1827.method1009(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class239.method1539(var5, var2, var3);
            if (var19) {
                class235.field3455[var5].method1330(var2, var3);
                class33 var20 = arg1.field5976;
                if (var20 != null && var20.field359) {
                    if (var20.field360) {
                        class139.field1827.method1009(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class509.field7559) {
                        class259.method1632(arg0, var4, var2, var3);
                        class139.field1827.method1045(arg0.field895, arg0.field890);
                    }
                    class239 var21 = var20.method169(-911932384, class139.field1827);
                    if (var21 != null) {
                        var21.field3498 = var20;
                        var21.field3491 = var4;
                        var21.field3495 = var2;
                        var21.field3494 = var3;
                        class147.field1903.method770(-65537, var21);
                    }
                    if (var20.field360) {
                        class139.field1827.method1009(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class578 var24 = arg1.field5987;
            class73 var25 = arg1.field5985;
            if (var24 != null || var25 != null) {
                if (class365.field5254 == var2) {
                    var22++;
                } else if (class365.field5254 < var2) {
                    var22 += 2;
                }
                if (class613.field8993 == var3) {
                    var22 += 3;
                } else if (class613.field8993 > var3) {
                    var22 += 6;
                }
                var23 = class553.field8229[var22];
                arg1.field5993 = class62.field730[var22];
            }
            if (var24 != null) {
                if ((var24.field8512 & class559.field8305[var22]) == 0) {
                    arg1.field5983 = 0;
                } else if (var24.field8512 == 16) {
                    arg1.field5983 = 3;
                    arg1.field5977 = class461.field6668[var22];
                    arg1.field5982 = (byte) (3 - arg1.field5977);
                } else if (var24.field8512 == 32) {
                    arg1.field5983 = 6;
                    arg1.field5977 = class522.field7740[var22];
                    arg1.field5982 = (byte) (6 - arg1.field5977);
                } else if (var24.field8512 == 64) {
                    arg1.field5983 = 12;
                    arg1.field5977 = class345.field5029[var22];
                    arg1.field5982 = (byte) (12 - arg1.field5977);
                } else {
                    arg1.field5983 = 9;
                    arg1.field5977 = class239.field3488[var22];
                    arg1.field5982 = (byte) (9 - arg1.field5977);
                }
                if ((var24.field8512 & var23) != 0 && !class643.method3723(var5, var2, var3, var24.field8512)) {
                    if (class509.field7559) {
                        class259.method1632(arg0, var4, var2, var3);
                        class139.field1827.method1045(arg0.field895, arg0.field890);
                    }
                    class239 var26 = var24.method169(-911932384, class139.field1827);
                    if (var26 != null) {
                        var26.field3498 = var24;
                        var26.field3491 = var4;
                        var26.field3495 = var2;
                        var26.field3494 = var3;
                        class147.field1903.method770(-65537, var26);
                    }
                }
                class578 var27 = arg1.field5978;
                if (var27 != null && (var27.field8512 & var23) != 0 && !class643.method3723(var5, var2, var3, var27.field8512)) {
                    if (class509.field7559) {
                        class259.method1632(arg0, var4, var2, var3);
                        class139.field1827.method1045(arg0.field895, arg0.field890);
                    }
                    class239 var28 = var27.method169(-911932384, class139.field1827);
                    if (var28 != null) {
                        var28.field3498 = var27;
                        var28.field3491 = var4;
                        var28.field3495 = var2;
                        var28.field3494 = var3;
                        class147.field1903.method770(-65537, var28);
                    }
                }
            }
            if (var25 != null && !class241.method1550(var5, var2, var3, var25.method251(5530))) {
                class73 var29 = arg1.field5989;
                class139.field1827.method1009(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field853 & var23) != 0) {
                    if (class509.field7559) {
                        class259.method1632(arg0, var4, var2, var3);
                        class139.field1827.method1045(arg0.field895, arg0.field890);
                    }
                    class239 var30 = var25.method169(-911932384, class139.field1827);
                    if (var30 != null) {
                        var30.field3498 = var25;
                        var30.field3491 = var4;
                        var30.field3495 = var2;
                        var30.field3494 = var3;
                        class147.field1903.method770(-65537, var30);
                    }
                } else if (var25.field853 == 256) {
                    int var31 = var25.field856 - class100.field1278;
                    int var32 = var25.field850 - class420.field6034;
                    int var33 = var25.field854;
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
                    if (class509.field7559) {
                        class259.method1632(arg0, var4, var2, var3);
                        class139.field1827.method1045(arg0.field895, arg0.field890);
                    }
                    if (var35 < var34) {
                        class239 var36 = var25.method169(-911932384, class139.field1827);
                        if (var36 != null) {
                            var36.field3498 = var25;
                            var36.field3491 = var4;
                            var36.field3495 = var2;
                            var36.field3494 = var3;
                            class147.field1903.method770(-65537, var36);
                        }
                    } else if (var29 != null) {
                        class239 var37 = var29.method169(-911932384, class139.field1827);
                        if (var37 != null) {
                            var37.field3498 = var29;
                            var37.field3491 = var4;
                            var37.field3495 = var2;
                            var37.field3494 = var3;
                            class147.field1903.method770(-65537, var37);
                        }
                    }
                }
                class139.field1827.method1009(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class33 var38 = arg1.field5976;
                if (var38 != null && !var38.field359) {
                    if (var38.field360) {
                        class139.field1827.method1009(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class509.field7559) {
                        class259.method1632(arg0, var4, var2, var3);
                        class139.field1827.method1045(arg0.field895, arg0.field890);
                    }
                    class239 var39 = var38.method169(-911932384, class139.field1827);
                    if (var39 != null) {
                        var39.field3498 = var38;
                        var39.field3491 = var4;
                        var39.field3495 = var2;
                        var39.field3494 = var3;
                        class147.field1903.method770(-65537, var39);
                    }
                    if (var38.field360) {
                        class139.field1827.method1009(3000.0F, var9 * 1.5F);
                    }
                }
                class190 var40 = arg1.field5973;
                if (var40 != null && !var40.field2884) {
                    if (class509.field7559) {
                        class259.method1632(arg0, var4, var2, var3);
                        class139.field1827.method1045(arg0.field895, arg0.field890);
                    }
                    class239 var41 = var40.method169(-911932384, class139.field1827);
                    if (var41 != null) {
                        var41.field3498 = var40;
                        var41.field3491 = var4;
                        var41.field3495 = var2;
                        var41.field3494 = var3;
                        class147.field1903.method770(-65537, var41);
                    }
                }
            }
            byte var42 = arg1.field5992;
            if (var42 != 0) {
                if (var2 < class365.field5254 && (var42 & 0x4) != 0) {
                    class415 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field5991) {
                        class298.field4354.method941((byte) -123, var43);
                    }
                }
                if (var3 < class613.field8993 && (var42 & 0x2) != 0) {
                    class415 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field5991) {
                        class298.field4354.method941((byte) -126, var44);
                    }
                }
                if (var2 > class365.field5254 && (var42 & 0x1) != 0) {
                    class415 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field5991) {
                        class298.field4354.method941((byte) -124, var45);
                    }
                }
                if (var3 > class613.field8993 && (var42 & 0x8) != 0) {
                    class415 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field5991) {
                        class298.field4354.method941((byte) -127, var46);
                    }
                }
            }
        }
        if (arg1.field5983 != 0) {
            boolean var47 = true;
            for (class639 var48 = arg1.field5981; var48 != null; var48 = var48.field9291) {
                if (class490.field7410 != var48.field9288.field3465 && (var48.field9289 & arg1.field5983) == arg1.field5977) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class578 var49 = arg1.field5987;
                if (!class643.method3723(var5, var2, var3, var49.field8512)) {
                    if (class509.field7559) {
                        label682: {
                            if (var49.field8512 >= 16) {
                                int var50 = var2 - class365.field5254;
                                int var51 = var3 - class613.field8993;
                                if (var49.field8512 == 16) {
                                    int var52 = var50 - class605.field8913;
                                    int var53 = class605.field8913 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class366.field5271) {
                                        class259.method1632(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field8512 == 32) {
                                    int var54 = class605.field8913 + var50;
                                    int var55 = class605.field8913 + var51;
                                    if (var55 < -var54 && var2 < class331.field4909 && var3 < class366.field5271) {
                                        class259.method1632(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field8512 == 64) {
                                    int var56 = class605.field8913 + var50;
                                    int var57 = var51 - class605.field8913;
                                    if (var57 > var56 && var2 < class331.field4909 && var3 > 0) {
                                        class259.method1632(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field8512 == 128) {
                                    int var58 = var50 - class605.field8913;
                                    int var59 = var51 - class605.field8913;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class259.method1632(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class259.method1632(arg0, var4, var2, var3);
                        }
                        class139.field1827.method1045(arg0.field895, arg0.field890);
                    }
                    class239 var60 = var49.method169(-911932384, class139.field1827);
                    if (var60 != null) {
                        var60.field3498 = var49;
                        var60.field3491 = var4;
                        var60.field3495 = var2;
                        var60.field3494 = var3;
                        class147.field1903.method770(-65537, var60);
                    }
                }
                arg1.field5983 = 0;
            }
        }
        if (arg1.field5974) {
            try {
                arg1.field5974 = false;
                int var61 = 0;
                label625: for (class639 var62 = arg1.field5981; var62 != null; var62 = var62.field9291) {
                    class237 var63 = var62.field9288;
                    if (class490.field7410 != var63.field3465) {
                        for (int var64 = var63.field3469; var64 <= var63.field3459; var64++) {
                            for (int var65 = var63.field3472; var65 <= var63.field3462; var65++) {
                                class415 var66 = var8[var64][var65];
                                if (var66.field5972) {
                                    arg1.field5974 = true;
                                    continue label625;
                                }
                                if (var66.field5983 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field3469) {
                                        var67++;
                                    }
                                    if (var64 < var63.field3459) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field3472) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field3462) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field5983) == arg1.field5982) {
                                        arg1.field5974 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class365.field5254 - var63.field3469;
                        int var69 = var63.field3459 - class365.field5254;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class613.field8993 - var63.field3472;
                        int var71 = var63.field3462 - class613.field8993;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field893[var61] = var63;
                        arg0.field887[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class237 var75 = arg0.field893[var74];
                        if (class490.field7410 != var75.field3465) {
                            int var76 = arg0.field887[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field3464 - class100.field1278;
                                int var78 = var75.field3463 - class420.field6034;
                                int var79 = arg0.field893[var73].field3464 - class100.field1278;
                                int var80 = arg0.field893[var73].field3463 - class420.field6034;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class237 var81 = arg0.field893[var73];
                    var81.field3465 = class490.field7410;
                    if (!class47.method241(var5, var81.field3469, var81.field3459, var81.field3472, var81.field3462, var81.method159(-103))) {
                        if (class509.field7559) {
                            if (var81.field3467 == 0) {
                                class486.method2948(arg0, var4, var81.field3469, var81.field3472, var81.field3459, var81.field3462);
                            } else {
                                class259.method1632(arg0, var4, var2, var3);
                                int var82 = var2 - class365.field5254;
                                int var83 = var3 - class613.field8993;
                                if (var81.field3467 == 2) {
                                    if (var83 > -var82) {
                                        class77.method450(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class77.method450(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class77.method450(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class77.method450(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class139.field1827.method1045(arg0.field895, arg0.field890);
                        }
                        class239 var84 = var81.method169(-911932384, class139.field1827);
                        if (var84 != null) {
                            var84.field3498 = var81;
                            var84.field3491 = var4;
                            var84.field3495 = var81.field3469;
                            var84.field3494 = var81.field3472;
                            class147.field1903.method770(-65537, var84);
                        }
                    }
                    for (int var85 = var81.field3469; var85 <= var81.field3459; var85++) {
                        for (int var86 = var81.field3472; var86 <= var81.field3462; var86++) {
                            class415 var87 = var8[var85][var86];
                            if (var87.field5983 != 0) {
                                class298.field4354.method941((byte) -126, var87);
                            } else if ((var2 != var85 || var3 != var86) && var87.field5991) {
                                class298.field4354.method941((byte) -126, var87);
                            }
                        }
                    }
                }
                if (arg1.field5974) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field5974 = false;
            }
        }
        if (arg1.field5971 != null && (byte) (class300.field4402 & 0xFF) == arg1.field5986) {
            class510 var88 = arg1.field5971;
            int var89 = class235.field3455[var4].method1319(var2, var3);
            int var90;
            if (var4 < class487.field7383 - 1) {
                var90 = class235.field3455[var4].method1319(var2, var3) - class235.field3455[var4 + 1].method1319(var2, var3);
            } else {
                var90 = 0x8 << class179.field2726;
            }
            class185.field2812.method617(var6, var89, var7, arg0.field894);
            int var91 = arg0.field894[2];
            class185.field2812.method617(var6, var89 - var90, var7, arg0.field894);
            int var92 = arg0.field894[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class639.field9295;
            int var96 = class639.field9295 + var94;
            var88.field7581 = var95;
            var88.field7579 = var96;
            var88.field7580 = true;
            class139.field1827.method989(var88);
        }
        if (!arg1.field5991) {
            return;
        }
        if (arg1.field5983 != 0) {
            return;
        }
        if (var2 <= class365.field5254 && var2 > class580.field8548) {
            class415 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field5991) {
                return;
            }
        }
        if (var2 >= class365.field5254 && var2 < class309.field4509 - 1) {
            class415 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field5991) {
                return;
            }
        }
        if (var3 <= class613.field8993 && var3 > class10.field90) {
            class415 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field5991) {
                return;
            }
        }
        if (var3 >= class613.field8993 && var3 < class605.field8906 - 1) {
            class415 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field5991) {
                return;
            }
        }
        arg1.field5991 = false;
        class57.field699--;
        class190 var101 = arg1.field5973;
        if (var101 != null && var101.field2884) {
            if (class509.field7559) {
                class259.method1632(arg0, var4, var2, var3);
                class139.field1827.method1045(arg0.field895, arg0.field890);
            }
            class239 var102 = var101.method169(-911932384, class139.field1827);
            if (var102 != null) {
                var102.field3498 = var101;
                var102.field3491 = var4;
                var102.field3495 = var2;
                var102.field3494 = var3;
                class147.field1903.method770(-65537, var102);
            }
        }
        if (arg1.field5993 != 0) {
            class73 var103 = arg1.field5985;
            if (var103 != null && !class241.method1550(var5, var2, var3, var103.method251(5530))) {
                if ((var103.field853 & arg1.field5993) != 0) {
                    if (class509.field7559) {
                        class259.method1632(arg0, var4, var2, var3);
                        class139.field1827.method1045(arg0.field895, arg0.field890);
                    }
                    class239 var104 = var103.method169(-911932384, class139.field1827);
                    if (var104 != null) {
                        var104.field3498 = var103;
                        var104.field3491 = var4;
                        var104.field3495 = var2;
                        var104.field3494 = var3;
                        class147.field1903.method770(-65537, var104);
                    }
                } else if (var103.field853 == 256) {
                    int var105 = var103.field856 - class100.field1278;
                    int var106 = var103.field850 - class420.field6034;
                    int var107 = var103.field854;
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
                    if (class509.field7559) {
                        class259.method1632(arg0, var4, var2, var3);
                        class139.field1827.method1045(arg0.field895, arg0.field890);
                    }
                    class73 var110 = arg1.field5989;
                    if (var109 > var108) {
                        class239 var111 = var103.method169(-911932384, class139.field1827);
                        if (var111 != null) {
                            var111.field3498 = var103;
                            var111.field3491 = var4;
                            var111.field3495 = var2;
                            var111.field3494 = var3;
                            class147.field1903.method770(-65537, var111);
                        }
                    } else if (var110 != null) {
                        class239 var112 = var110.method169(-911932384, class139.field1827);
                        if (var112 != null) {
                            var112.field3498 = var110;
                            var112.field3491 = var4;
                            var112.field3495 = var2;
                            var112.field3494 = var3;
                            class147.field1903.method770(-65537, var112);
                        }
                    }
                }
            }
            class578 var113 = arg1.field5987;
            class578 var114 = arg1.field5978;
            if (var114 != null && (var114.field8512 & arg1.field5993) != 0 && !class643.method3723(var5, var2, var3, var114.field8512)) {
                if (class509.field7559) {
                    class260.method1645(arg0, var114.field8512, var4, var2, var3);
                    class139.field1827.method1045(arg0.field895, arg0.field890);
                }
                class239 var115 = var114.method169(-911932384, class139.field1827);
                if (var115 != null) {
                    var115.field3498 = var114;
                    var115.field3491 = var4;
                    var115.field3495 = var2;
                    var115.field3494 = var3;
                    class147.field1903.method770(-65537, var115);
                }
            }
            if (var113 != null && (var113.field8512 & arg1.field5993) != 0 && !class643.method3723(var5, var2, var3, var113.field8512)) {
                if (class509.field7559) {
                    class260.method1645(arg0, var113.field8512, var4, var2, var3);
                    class139.field1827.method1045(arg0.field895, arg0.field890);
                }
                class239 var116 = var113.method169(-911932384, class139.field1827);
                if (var116 != null) {
                    var116.field3498 = var113;
                    var116.field3491 = var4;
                    var116.field3495 = var2;
                    var116.field3494 = var3;
                    class147.field1903.method770(-65537, var116);
                }
            }
        }
        if (var4 < class487.field7383 - 1) {
            class415 var117 = class526.field7777[var4 + 1][var2][var3];
            if (var117 != null && var117.field5991) {
                class298.field4354.method942((byte) 127, var117);
            }
        }
        if (var2 < class365.field5254) {
            class415 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field5991) {
                class298.field4354.method941((byte) -128, var118);
            }
        }
        if (var3 < class613.field8993) {
            class415 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field5991) {
                class298.field4354.method941((byte) -127, var119);
            }
        }
        if (var2 > class365.field5254) {
            class415 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field5991) {
                class298.field4354.method941((byte) -123, var120);
            }
        }
        if (var3 > class613.field8993) {
            class415 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field5991) {
                class298.field4354.method941((byte) -128, var121);
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BLjava/lang/String;)V", line = 1186)
    public static final void method891(byte arg0, String arg1) {
        field1949++;
        if (!class369.field5337) {
            return;
        }
        boolean var2 = false;
        int var3 = -112 / ((56 - arg0) / 55);
        int var4 = class264.field3925;
        int[] var5 = class533.field7895;
        for (int var6 = 0; var6 < var4; var6++) {
            class179 var7 = class383.field5604[var5[var6]];
            if (var7 != null && class239.field3493 != var7 && var7.field2718 != null && var7.field2718.equalsIgnoreCase(arg1)) {
                class165.method1046(-3466, class294.field4310);
                class177.field2690++;
                class221.field3268.method2608(class546.field8160, (byte) 62);
                class221.field3268.method2595(class564.field8360, 98);
                class221.field3268.method2577(class427.field6085, -45066936);
                class221.field3268.method2563(-13021, 0);
                class221.field3268.method2579(-90, var5[var6]);
                var2 = true;
                class632.method3679(true, -2, var7.method514(0), -1, var7.method514(0), 0, var7.field1089[0], var7.field1090[0], 0);
                break;
            }
        }
        if (!var2) {
            class62.method389(class115.field1514.method2953(3181, class77.field889) + arg1, 0);
        }
        if (class369.field5337) {
            class178.method1188((byte) -75);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 1239)
    public static final void method893(String arg0, int arg1, int arg2) {
        class165.method1046(-3466, class449.field6571);
        field1946++;
        class10.field85++;
        class221.field3268.method2563(-13021, class83.method488(arg1 ^ -2615, arg0) + 1);
        if (arg1 != 2635) {
            field1952 = null;
        }
        class221.field3268.method2582(arg2, -24025);
        class221.field3268.method2580(arg0, 30127);
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(I)V", line = 1257)
    public class152(int arg0) {
        this.field1951 = arg0;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)Z", line = 1265)
    public static final boolean method894(int arg0, int arg1) {
        field1947++;
        if (arg1 != 1) {
            field1945 = null;
        }
        return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)Z")
    public abstract boolean method887(byte arg0);

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method892(boolean arg0);
}
