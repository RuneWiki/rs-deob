import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class410 {

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public int field6089;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public int field6090;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Lpf;")
    public class410 field6096;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "Lc;")
    public class122 field6091;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "Lbg;")
    public static class324 field6097 = new class324(22, 9);

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "Lbg;")
    public static class324 field6102 = new class324(10, 12);

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public int field6092;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public int field6094;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field6100;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public int field6101;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static void method2509(byte arg0) {
        field6102 = null;
        if (arg0 >= -78) {
            field6097 = null;
        }
        field6097 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljj;Lnt;)V")
    public static final void method2510(class76 arg0, class148 arg1) {
        if (!arg1.field2097) {
            return;
        }
        short var2 = arg1.field2087;
        short var3 = arg1.field2083;
        byte var4 = arg1.field2101;
        byte var5 = arg1.field2100;
        int var6 = (var2 << class527.field7754) + class47.field517;
        int var7 = (var3 << class527.field7754) + class47.field517;
        class148[][] var8 = class422.field6240[var4];
        float var9;
        if (class52.field578 == class131.field1899) {
            class442.field6561.method352(class283.field4115[0].method426(var6, var7), class121.method965(var2, var3), class101.method866(var2, var3), class220.method1501(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class442.field6561.method319(3000.0F, var9 * 1.5F);
        if (arg1.field2092) {
            if (class102.field1433) {
                if (var4 > 0) {
                    class148 var10 = class422.field6240[var4 - 1][var2][var3];
                    if (var10 != null && var10.field2097) {
                        return;
                    }
                }
                if (var2 <= class321.field4527 && var2 > class400.field5938) {
                    class148 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field2097 && (var11.field2092 || (arg1.field2094 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class321.field4527 && var2 < class74.field1016 - 1) {
                    class148 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field2097 && (var12.field2092 || (arg1.field2094 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class209.field3040 && var3 > class101.field1415) {
                    class148 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field2097 && (var13.field2092 || (arg1.field2094 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class209.field3040 && var3 < class215.field3099 - 1) {
                    class148 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field2097 && (var14.field2092 || (arg1.field2094 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class102.field1433 = true;
            }
            arg1.field2092 = false;
            if (arg1.field2091 != null) {
                class148 var15 = arg1.field2091;
                class442.field6561.method319(3000.0F, (201.5F - (float) (var15.field2100 + 1) * 50.0F) * 1.5F);
                if (!class518.method3077(var15.field2100, var2, var3)) {
                    class131.field1899[var15.field2100].method420(var2, var3);
                }
                class235 var16 = var15.field2098;
                if (var16 != null) {
                    if (class348.field4832) {
                        if ((var16.field3446 & arg1.field2090) == 0) {
                            class344.method2078(arg0, var4, var2, var3);
                        } else {
                            class454.method2734(arg0, var16.field3446, var5, var2, var3);
                        }
                        class442.field6561.method291(arg0.field1031, arg0.field1034);
                    }
                    var16.method38(class442.field6561, -103);
                }
                for (class480 var17 = var15.field2086; var17 != null; var17 = var17.field7058) {
                    class431 var18 = var17.field7054;
                    if (var18 != null) {
                        if (class348.field4832) {
                            class344.method2078(arg0, var4, var2, var3);
                            class442.field6561.method291(arg0.field1031, arg0.field1034);
                        }
                        var18.method38(class442.field6561, -97);
                    }
                }
                class442.field6561.method319(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class518.method3077(var5, var2, var3);
            if (var19) {
                class131.field1899[var5].method420(var2, var3);
                class363 var20 = arg1.field2082;
                if (var20 != null && var20.field5039) {
                    if (var20.field5043) {
                        class442.field6561.method319(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class348.field4832) {
                        class344.method2078(arg0, var4, var2, var3);
                        class442.field6561.method291(arg0.field1031, arg0.field1034);
                    }
                    class462 var21 = var20.method38(class442.field6561, -114);
                    if (var21 != null) {
                        var21.field6799 = var20;
                        var21.field6793 = var4;
                        var21.field6796 = var2;
                        var21.field6795 = var3;
                        class111.field1573.method2948(76, var21);
                    }
                    if (var20.field5043) {
                        class442.field6561.method319(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class235 var24 = arg1.field2098;
            class386 var25 = arg1.field2079;
            if (var24 != null || var25 != null) {
                if (class321.field4527 == var2) {
                    var22++;
                } else if (class321.field4527 < var2) {
                    var22 += 2;
                }
                if (class209.field3040 == var3) {
                    var22 += 3;
                } else if (class209.field3040 > var3) {
                    var22 += 6;
                }
                var23 = class125.field1838[var22];
                arg1.field2090 = class208.field3022[var22];
            }
            if (var24 != null) {
                if ((var24.field3446 & class225.field3298[var22]) == 0) {
                    arg1.field2088 = 0;
                } else if (var24.field3446 == 16) {
                    arg1.field2088 = 3;
                    arg1.field2096 = class233.field3423[var22];
                    arg1.field2095 = (byte) (3 - arg1.field2096);
                } else if (var24.field3446 == 32) {
                    arg1.field2088 = 6;
                    arg1.field2096 = class346.field4802[var22];
                    arg1.field2095 = (byte) (6 - arg1.field2096);
                } else if (var24.field3446 == 64) {
                    arg1.field2088 = 12;
                    arg1.field2096 = class37.field419[var22];
                    arg1.field2095 = (byte) (12 - arg1.field2096);
                } else {
                    arg1.field2088 = 9;
                    arg1.field2096 = class213.field3059[var22];
                    arg1.field2095 = (byte) (9 - arg1.field2096);
                }
                if ((var24.field3446 & var23) != 0 && !class181.method1276(var5, var2, var3, var24.field3446)) {
                    if (class348.field4832) {
                        class344.method2078(arg0, var4, var2, var3);
                        class442.field6561.method291(arg0.field1031, arg0.field1034);
                    }
                    class462 var26 = var24.method38(class442.field6561, -128);
                    if (var26 != null) {
                        var26.field6799 = var24;
                        var26.field6793 = var4;
                        var26.field6796 = var2;
                        var26.field6795 = var3;
                        class111.field1573.method2948(65, var26);
                    }
                }
                class235 var27 = arg1.field2078;
                if (var27 != null && (var27.field3446 & var23) != 0 && !class181.method1276(var5, var2, var3, var27.field3446)) {
                    if (class348.field4832) {
                        class344.method2078(arg0, var4, var2, var3);
                        class442.field6561.method291(arg0.field1031, arg0.field1034);
                    }
                    class462 var28 = var27.method38(class442.field6561, -99);
                    if (var28 != null) {
                        var28.field6799 = var27;
                        var28.field6793 = var4;
                        var28.field6796 = var2;
                        var28.field6795 = var3;
                        class111.field1573.method2948(-128, var28);
                    }
                }
            }
            if (var25 != null && !class173.method1223(var5, var2, var3, var25.method228(false))) {
                class386 var29 = arg1.field2085;
                class442.field6561.method319(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field5683 & var23) != 0) {
                    if (class348.field4832) {
                        class344.method2078(arg0, var4, var2, var3);
                        class442.field6561.method291(arg0.field1031, arg0.field1034);
                    }
                    class462 var30 = var25.method38(class442.field6561, -117);
                    if (var30 != null) {
                        var30.field6799 = var25;
                        var30.field6793 = var4;
                        var30.field6796 = var2;
                        var30.field6795 = var3;
                        class111.field1573.method2948(117, var30);
                    }
                } else if (var25.field5683 == 256) {
                    int var31 = var25.field5697 - class215.field3070;
                    int var32 = var25.field5676 - class55.field585;
                    int var33 = var25.field5690;
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
                    if (class348.field4832) {
                        class344.method2078(arg0, var4, var2, var3);
                        class442.field6561.method291(arg0.field1031, arg0.field1034);
                    }
                    if (var35 < var34) {
                        class462 var36 = var25.method38(class442.field6561, -118);
                        if (var36 != null) {
                            var36.field6799 = var25;
                            var36.field6793 = var4;
                            var36.field6796 = var2;
                            var36.field6795 = var3;
                            class111.field1573.method2948(-114, var36);
                        }
                    } else if (var29 != null) {
                        class462 var37 = var29.method38(class442.field6561, -118);
                        if (var37 != null) {
                            var37.field6799 = var29;
                            var37.field6793 = var4;
                            var37.field6796 = var2;
                            var37.field6795 = var3;
                            class111.field1573.method2948(36, var37);
                        }
                    }
                }
                class442.field6561.method319(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class363 var38 = arg1.field2082;
                if (var38 != null && !var38.field5039) {
                    if (var38.field5043) {
                        class442.field6561.method319(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class348.field4832) {
                        class344.method2078(arg0, var4, var2, var3);
                        class442.field6561.method291(arg0.field1031, arg0.field1034);
                    }
                    class462 var39 = var38.method38(class442.field6561, -113);
                    if (var39 != null) {
                        var39.field6799 = var38;
                        var39.field6793 = var4;
                        var39.field6796 = var2;
                        var39.field6795 = var3;
                        class111.field1573.method2948(-117, var39);
                    }
                    if (var38.field5043) {
                        class442.field6561.method319(3000.0F, var9 * 1.5F);
                    }
                }
                class470 var40 = arg1.field2084;
                if (var40 != null && !var40.field6945) {
                    if (class348.field4832) {
                        class344.method2078(arg0, var4, var2, var3);
                        class442.field6561.method291(arg0.field1031, arg0.field1034);
                    }
                    class462 var41 = var40.method38(class442.field6561, -127);
                    if (var41 != null) {
                        var41.field6799 = var40;
                        var41.field6793 = var4;
                        var41.field6796 = var2;
                        var41.field6795 = var3;
                        class111.field1573.method2948(-120, var41);
                    }
                }
            }
            byte var42 = arg1.field2094;
            if (var42 != 0) {
                if (var2 < class321.field4527 && (var42 & 0x4) != 0) {
                    class148 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field2097) {
                        class198.field2896.method1201(var43, 0);
                    }
                }
                if (var3 < class209.field3040 && (var42 & 0x2) != 0) {
                    class148 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field2097) {
                        class198.field2896.method1201(var44, 0);
                    }
                }
                if (var2 > class321.field4527 && (var42 & 0x1) != 0) {
                    class148 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field2097) {
                        class198.field2896.method1201(var45, 0);
                    }
                }
                if (var3 > class209.field3040 && (var42 & 0x8) != 0) {
                    class148 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field2097) {
                        class198.field2896.method1201(var46, 0);
                    }
                }
            }
        }
        if (arg1.field2088 != 0) {
            boolean var47 = true;
            for (class480 var48 = arg1.field2086; var48 != null; var48 = var48.field7058) {
                if (class250.field3685 != var48.field7054.field6331 && (var48.field7061 & arg1.field2088) == arg1.field2096) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class235 var49 = arg1.field2098;
                if (!class181.method1276(var5, var2, var3, var49.field3446)) {
                    if (class348.field4832) {
                        label682: {
                            if (var49.field3446 >= 16) {
                                int var50 = var2 - class321.field4527;
                                int var51 = var3 - class209.field3040;
                                if (var49.field3446 == 16) {
                                    int var52 = var50 - class47.field517;
                                    int var53 = class47.field517 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class497.field7388) {
                                        class344.method2078(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field3446 == 32) {
                                    int var54 = class47.field517 + var50;
                                    int var55 = class47.field517 + var51;
                                    if (var55 < -var54 && var2 < class241.field3562 && var3 < class497.field7388) {
                                        class344.method2078(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field3446 == 64) {
                                    int var56 = class47.field517 + var50;
                                    int var57 = var51 - class47.field517;
                                    if (var57 > var56 && var2 < class241.field3562 && var3 > 0) {
                                        class344.method2078(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field3446 == 128) {
                                    int var58 = var50 - class47.field517;
                                    int var59 = var51 - class47.field517;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class344.method2078(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class344.method2078(arg0, var4, var2, var3);
                        }
                        class442.field6561.method291(arg0.field1031, arg0.field1034);
                    }
                    class462 var60 = var49.method38(class442.field6561, -91);
                    if (var60 != null) {
                        var60.field6799 = var49;
                        var60.field6793 = var4;
                        var60.field6796 = var2;
                        var60.field6795 = var3;
                        class111.field1573.method2948(-124, var60);
                    }
                }
                arg1.field2088 = 0;
            }
        }
        if (arg1.field2093) {
            try {
                arg1.field2093 = false;
                int var61 = 0;
                label625: for (class480 var62 = arg1.field2086; var62 != null; var62 = var62.field7058) {
                    class431 var63 = var62.field7054;
                    if (class250.field3685 != var63.field6331) {
                        for (int var64 = var63.field6332; var64 <= var63.field6340; var64++) {
                            for (int var65 = var63.field6339; var65 <= var63.field6337; var65++) {
                                class148 var66 = var8[var64][var65];
                                if (var66.field2092) {
                                    arg1.field2093 = true;
                                    continue label625;
                                }
                                if (var66.field2088 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field6332) {
                                        var67++;
                                    }
                                    if (var64 < var63.field6340) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field6339) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field6337) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field2088) == arg1.field2095) {
                                        arg1.field2093 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class321.field4527 - var63.field6332;
                        int var69 = var63.field6340 - class321.field4527;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class209.field3040 - var63.field6339;
                        int var71 = var63.field6337 - class209.field3040;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field1028[var61] = var63;
                        arg0.field1032[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class431 var75 = arg0.field1028[var74];
                        if (class250.field3685 != var75.field6331) {
                            int var76 = arg0.field1032[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field6335 - class215.field3070;
                                int var78 = var75.field6334 - class55.field585;
                                int var79 = arg0.field1028[var73].field6335 - class215.field3070;
                                int var80 = arg0.field1028[var73].field6334 - class55.field585;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class431 var81 = arg0.field1028[var73];
                    var81.field6331 = class250.field3685;
                    if (!class423.method2589(var5, var81.field6332, var81.field6340, var81.field6339, var81.field6337, var81.method890(-25430))) {
                        if (class348.field4832) {
                            if (var81.field6330 == 0) {
                                class123.method974(arg0, var4, var81.field6332, var81.field6339, var81.field6340, var81.field6337);
                            } else {
                                class344.method2078(arg0, var4, var2, var3);
                                int var82 = var2 - class321.field4527;
                                int var83 = var3 - class209.field3040;
                                if (var81.field6330 == 2) {
                                    if (var83 > -var82) {
                                        class233.method1562(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class233.method1562(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class233.method1562(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class233.method1562(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class442.field6561.method291(arg0.field1031, arg0.field1034);
                        }
                        class462 var84 = var81.method38(class442.field6561, -128);
                        if (var84 != null) {
                            var84.field6799 = var81;
                            var84.field6793 = var4;
                            var84.field6796 = var81.field6332;
                            var84.field6795 = var81.field6339;
                            class111.field1573.method2948(-128, var84);
                        }
                    }
                    for (int var85 = var81.field6332; var85 <= var81.field6340; var85++) {
                        for (int var86 = var81.field6339; var86 <= var81.field6337; var86++) {
                            class148 var87 = var8[var85][var86];
                            if (var87.field2088 != 0) {
                                class198.field2896.method1201(var87, 0);
                            } else if ((var2 != var85 || var3 != var86) && var87.field2097) {
                                class198.field2896.method1201(var87, 0);
                            }
                        }
                    }
                }
                if (arg1.field2093) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field2093 = false;
            }
        }
        if (arg1.field2099 != null && (byte) (class397.field5826 & 0xFF) == arg1.field2080) {
            class88 var88 = arg1.field2099;
            int var89 = class131.field1899[var4].method430(var2, var3);
            int var90;
            if (var4 < class308.field4395 - 1) {
                var90 = class131.field1899[var4].method430(var2, var3) - class131.field1899[var4 + 1].method430(var2, var3);
            } else {
                var90 = 0x8 << class527.field7754;
            }
            class405.field6000.method255(var6, var89, var7, arg0.field1037);
            int var91 = arg0.field1037[2];
            class405.field6000.method255(var6, var89 - var90, var7, arg0.field1037);
            int var92 = arg0.field1037[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class209.field3025;
            int var96 = class209.field3025 + var94;
            var88.field1198 = var95;
            var88.field1192 = var96;
            var88.field1200 = true;
            class442.field6561.method345(var88);
        }
        if (!arg1.field2097) {
            return;
        }
        if (arg1.field2088 != 0) {
            return;
        }
        if (var2 <= class321.field4527 && var2 > class400.field5938) {
            class148 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field2097) {
                return;
            }
        }
        if (var2 >= class321.field4527 && var2 < class74.field1016 - 1) {
            class148 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field2097) {
                return;
            }
        }
        if (var3 <= class209.field3040 && var3 > class101.field1415) {
            class148 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field2097) {
                return;
            }
        }
        if (var3 >= class209.field3040 && var3 < class215.field3099 - 1) {
            class148 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field2097) {
                return;
            }
        }
        arg1.field2097 = false;
        class63.field752--;
        class470 var101 = arg1.field2084;
        if (var101 != null && var101.field6945) {
            if (class348.field4832) {
                class344.method2078(arg0, var4, var2, var3);
                class442.field6561.method291(arg0.field1031, arg0.field1034);
            }
            class462 var102 = var101.method38(class442.field6561, -125);
            if (var102 != null) {
                var102.field6799 = var101;
                var102.field6793 = var4;
                var102.field6796 = var2;
                var102.field6795 = var3;
                class111.field1573.method2948(-121, var102);
            }
        }
        if (arg1.field2090 != 0) {
            class386 var103 = arg1.field2079;
            if (var103 != null && !class173.method1223(var5, var2, var3, var103.method228(false))) {
                if ((var103.field5683 & arg1.field2090) != 0) {
                    if (class348.field4832) {
                        class344.method2078(arg0, var4, var2, var3);
                        class442.field6561.method291(arg0.field1031, arg0.field1034);
                    }
                    class462 var104 = var103.method38(class442.field6561, -123);
                    if (var104 != null) {
                        var104.field6799 = var103;
                        var104.field6793 = var4;
                        var104.field6796 = var2;
                        var104.field6795 = var3;
                        class111.field1573.method2948(-6, var104);
                    }
                } else if (var103.field5683 == 256) {
                    int var105 = var103.field5697 - class215.field3070;
                    int var106 = var103.field5676 - class55.field585;
                    int var107 = var103.field5690;
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
                    if (class348.field4832) {
                        class344.method2078(arg0, var4, var2, var3);
                        class442.field6561.method291(arg0.field1031, arg0.field1034);
                    }
                    class386 var110 = arg1.field2085;
                    if (var109 > var108) {
                        class462 var111 = var103.method38(class442.field6561, -119);
                        if (var111 != null) {
                            var111.field6799 = var103;
                            var111.field6793 = var4;
                            var111.field6796 = var2;
                            var111.field6795 = var3;
                            class111.field1573.method2948(-126, var111);
                        }
                    } else if (var110 != null) {
                        class462 var112 = var110.method38(class442.field6561, -88);
                        if (var112 != null) {
                            var112.field6799 = var110;
                            var112.field6793 = var4;
                            var112.field6796 = var2;
                            var112.field6795 = var3;
                            class111.field1573.method2948(18, var112);
                        }
                    }
                }
            }
            class235 var113 = arg1.field2098;
            class235 var114 = arg1.field2078;
            if (var114 != null && (var114.field3446 & arg1.field2090) != 0 && !class181.method1276(var5, var2, var3, var114.field3446)) {
                if (class348.field4832) {
                    class454.method2734(arg0, var114.field3446, var4, var2, var3);
                    class442.field6561.method291(arg0.field1031, arg0.field1034);
                }
                class462 var115 = var114.method38(class442.field6561, -105);
                if (var115 != null) {
                    var115.field6799 = var114;
                    var115.field6793 = var4;
                    var115.field6796 = var2;
                    var115.field6795 = var3;
                    class111.field1573.method2948(29, var115);
                }
            }
            if (var113 != null && (var113.field3446 & arg1.field2090) != 0 && !class181.method1276(var5, var2, var3, var113.field3446)) {
                if (class348.field4832) {
                    class454.method2734(arg0, var113.field3446, var4, var2, var3);
                    class442.field6561.method291(arg0.field1031, arg0.field1034);
                }
                class462 var116 = var113.method38(class442.field6561, -123);
                if (var116 != null) {
                    var116.field6799 = var113;
                    var116.field6793 = var4;
                    var116.field6796 = var2;
                    var116.field6795 = var3;
                    class111.field1573.method2948(-128, var116);
                }
            }
        }
        if (var4 < class308.field4395 - 1) {
            class148 var117 = class422.field6240[var4 + 1][var2][var3];
            if (var117 != null && var117.field2097) {
                class198.field2896.method1196((byte) -73, var117);
            }
        }
        if (var2 < class321.field4527) {
            class148 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field2097) {
                class198.field2896.method1201(var118, 0);
            }
        }
        if (var3 < class209.field3040) {
            class148 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field2097) {
                class198.field2896.method1201(var119, 0);
            }
        }
        if (var2 > class321.field4527) {
            class148 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field2097) {
                class198.field2896.method1201(var120, 0);
            }
        }
        if (var3 > class209.field3040) {
            class148 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field2097) {
                class198.field2896.method1201(var121, 0);
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lnf;Laq;BLya;)V")
    public static final void method2511(class405 arg0, class111 arg1, byte arg2, class38 arg3) {
        field6095++;
        class16 var4 = arg0.method2483(105, arg3);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method110();
        if (var5 < var4.method126()) {
            var5 = var4.method126();
        }
        byte var6 = 10;
        int var7 = arg1.field1569;
        int var8 = arg1.field1564;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg0.field5991 != null) {
            var9 = class59.field685.method1968(null, null, (byte) -71, class193.field2808, arg0.field5991);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class193.field2808[var12];
                if (var9 - 1 > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class88.field1194.method1343(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = var9 * class88.field1194.method1341() + class88.field1194.method1344() / 2;
        }
        int var15 = var5 / 2 + arg1.field1569;
        int var16 = arg1.field1564;
        if (arg2 != 55) {
            return;
        }
        if (class399.field5909 + var5 > var7) {
            var15 = var5 / 2 + class399.field5909 + var6 + (var10 / 2) + 5;
            var7 = class399.field5909;
        } else if ((class399.field5925 - var5) < var7) {
            var15 = class399.field5925 - var6 - (var5 / 2) - var10 / 2 - 5;
            var7 = class399.field5925 - var5;
        }
        if (class399.field5918 + var5 > var8) {
            var8 = class399.field5918;
            var16 = var5 / 2 + class399.field5918 + var6;
        } else if (var8 > (class399.field5924 - var5)) {
            var16 = class399.field5924 - (var5 / 2) - var11 - var6;
            var8 = class399.field5924 - var5;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg1.field1569), (double) (var8 - arg1.field1564)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method127((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg0.field5991 != null) {
            var18 = var15 - (var10 / 2) - 5;
            var19 = var16;
            var21 = var16 + class88.field1194.method1341() * var9 + 3;
            var20 = var18 + var10 + 10;
            if (arg0.field6006 != 0) {
                arg3.method367(var18, var20 - var18, var16, (byte) 58, arg0.field6006, var21 - var16);
            }
            if (arg0.field5990 != 0) {
                arg3.method370(var18, arg0.field5990, var21 - var16, 8, var20 - var18, var16);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class193.field2808[var22];
                if (var22 < (var9 - 1)) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class88.field1194.method1342(arg3, var23, var15, var16, arg0.field6015, true);
                var16 += class88.field1194.method1341();
            }
        }
        if (arg0.field6019 == -1 && arg0.field5991 == null) {
            return;
        }
        class504 var24 = new class504(arg1);
        int var25 = var5 >> 1;
        var24.field7468 = var7 + var25;
        var24.field7473 = var8 - var25;
        var24.field7469 = var21;
        var24.field7477 = var20;
        var24.field7467 = var7 - var25;
        var24.field7471 = var8 + var25;
        var24.field7470 = var18;
        var24.field7472 = var19;
        class274.field4042.method1015(false, var24);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZIII)V")
    public static final void method2512(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        if (!arg1) {
            return;
        }
        while (var5 < class267.field3933) {
            Rectangle var6 = class96.field1292[var5];
            if (arg0 < (var6.x + var6.width) && var6.x < (arg0 + arg3) && arg4 < var6.y + var6.height && var6.y < arg2 + arg4) {
                class342.field4736[var5] = true;
            }
            var5++;
        }
        field6099++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)Lpf;")
    public final class410 method2513(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            field6098++;
            return new class410(this.field6090, arg0);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)Z")
    public static final boolean method2514(int arg0) {
        if (arg0 != 8271) {
            return true;
        }
        field6093++;
        if (class436.field6386) {
            try {
                if ((Boolean) class505.method3017(class498.field7404.field6180, "showingVideoAd", 112)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)Lah;")
    public final class261 method2515(byte arg0) {
        if (arg0 <= 2) {
            return null;
        } else {
            field6103++;
            return class70.method666(0, this.field6090);
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(II)V")
    public class410(int arg0, int arg1) {
        this.field6089 = arg1;
        this.field6090 = arg0;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lpf;I)V")
    public class410(class410 arg0, int arg1) {
        this.field6096 = arg0;
        this.field6090 = this.field6096.field6090;
        this.field6091 = this.field6096.field6091;
        this.field6089 = this.field6096.field6089 + arg1;
    }
}
