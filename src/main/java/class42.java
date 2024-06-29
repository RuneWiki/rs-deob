import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class42 {

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field638 = 0;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Lon;")
    public static class35 field636 = new class35(64);

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field640 = 0;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "[[B")
    public static byte[][] field641;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Lu;", line = 3)
    public static final class187 method400(int arg0) {
        field637++;
        if (class365.field5034.length > class384.field5390) {
            return class365.field5034[class384.field5390++];
        } else if (arg0 == 50) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILoa;IZLpe;IIIIIZI)V", line = 23)
    public static final void method401(int arg0, int arg1, class151 arg2, int arg3, boolean arg4, class391 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11, int arg12) {
        field635++;
        if (!class339.method2153(9) && !class113.method921(arg12, arg7, arg3, class329.field4471, false) || arg0 <= 30) {
            return;
        }
        if (client.field3447 > arg3) {
            client.field3447 = arg3;
        }
        class372 var13 = class10.method53(arg9, true);
        if (class243.field3355 == 1 && var13.field5162) {
            return;
        }
        int var14;
        int var15;
        if (arg6 == 1 || arg6 == 3) {
            var15 = var13.field5206;
            var14 = var13.field5147;
        } else {
            var14 = var13.field5206;
            var15 = var13.field5147;
        }
        int var16;
        int var17;
        if ((arg12 + var14) <= class116.field1621) {
            var16 = (var14 + 1 >> 1) + arg12;
            var17 = (var14 >> 1) + arg12;
        } else {
            var17 = arg12;
            var16 = arg12 + 1;
        }
        int var18;
        int var19;
        if (class385.field5425 < arg7 + var15) {
            var18 = arg7;
            var19 = arg7 + 1;
        } else {
            var18 = arg7 + (var15 >> 1);
            var19 = (var15 + 1 >> 1) + arg7;
        }
        class411 var20 = class91.field1351[arg1];
        int var21 = var20.method1509(var17, var18) + var20.method1509(var16, var18) + (var20.method1509(var17, var19) - -var20.method1509(var16, var19)) >> 2;
        int var22 = (arg12 << 7) + (var14 << 6);
        int var23 = (arg7 << 7) + (var15 << 6);
        boolean var24 = arg11 && !arg4 && var13.field5218;
        if (var13.method2317(false)) {
            class199.method1410((class127) null, arg12, arg3, (class338) null, var13, 1, arg7, arg6);
        }
        boolean var25 = arg10 == -1 && var13.field5141 == -1 && var13.field5145 == null && var13.field5192 == null && !var13.field5140;
        if (class176.field2606 && var13.field5194 != 1) {
            return;
        }
        if (arg8 == 22) {
            if (class162.field2401 || var13.field5204 != 0 || var13.field5221 == 1 || var13.field5208) {
                class44 var26;
                if (var25) {
                    class218 var27 = new class218(arg5, var13, arg1, var22, var21, var23, arg4, arg6, var24);
                    var26 = var27;
                    if (var27.method577(-16528)) {
                        var27.method570((byte) 124, arg5);
                    }
                } else {
                    var26 = new class423(arg5, var13, arg6, arg3, arg1, var22, var21, var23, arg4, arg10);
                }
                class77.method663(arg3, arg12, arg7, var26);
                if (var13.field5221 == 1 && arg2 != null) {
                    arg2.method1166(arg7, false, arg12);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class173 var65 = null;
            class228 var66;
            int var67;
            if (var25) {
                class173 var68 = new class173(arg5, var13, arg3, arg1, var22, var21, var23, arg4, arg12, arg12 + var14 - 1, arg7, arg7 + var15 - 1, arg8, arg6, var24);
                var66 = var68;
                var67 = var68.method1287(0);
                var65 = var68;
            } else {
                var66 = new class66(arg5, var13, arg8, arg6, arg3, arg1, var22, var21, var23, arg4, arg12, arg12 + var14 - 1, arg7, var15 + arg7 - 1, arg10);
                var67 = 15;
            }
            if (class384.method2379(var66, false, !arg11)) {
                if (var65 != null && var65.method577(-16528)) {
                    var65.method570((byte) 106, arg5);
                }
                if (var13.field5176 && arg11) {
                    if (var67 > 30) {
                        var67 = 30;
                    }
                    for (int var69 = 0; var69 <= var14; var69++) {
                        for (int var70 = 0; var70 <= var15; var70++) {
                            var20.method1519(arg12 + var69, arg7 + var70, var67);
                        }
                    }
                }
            }
            if (var13.field5221 != 0 && arg2 != null) {
                arg2.method1152(!var13.field5174, arg12, var14, var15, var13.field5201, arg7, (byte) 126);
            }
        } else if (!(arg8 < 12 || arg8 > 17) || !(arg8 < 18 || arg8 > 21)) {
            class228 var28;
            if (var25) {
                class173 var29 = new class173(arg5, var13, arg3, arg1, var22, var21, var23, arg4, arg12, var14 + arg12 - 1, arg7, arg7 + var15 - 1, arg8, arg6, var24);
                var28 = var29;
                if (var29.method577(-16528)) {
                    var29.method570((byte) -120, arg5);
                }
            } else {
                var28 = new class66(arg5, var13, arg8, arg6, arg3, arg1, var22, var21, var23, arg4, arg12, arg12 + var14 - 1, arg7, arg7 + var15 - 1, arg10);
            }
            class384.method2379(var28, false, !arg11);
            if (arg11 && !arg4 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg3 > 0 && var13.field5194 != 0) {
                class277.field3734[arg3][arg12][arg7] = (byte) class260.method1678(class277.field3734[arg3][arg12][arg7], 4);
            }
            if (var13.field5221 != 0 && arg2 != null) {
                arg2.method1152(!var13.field5174, arg12, var14, var15, var13.field5201, arg7, (byte) 126);
            }
        } else if (arg8 == 0) {
            class339 var31;
            if (var25) {
                class314 var30 = new class314(arg5, var13, arg1, var22, var21, var23, arg4, arg8, arg6, var24);
                if (var30.method577(-16528)) {
                    var30.method570((byte) -127, arg5);
                }
                var31 = var30;
            } else {
                var31 = new class134(arg5, var13, 0, arg6, arg3, arg1, var22, var21, var23, arg4, arg10);
            }
            class407.method2520(arg3, arg12, arg7, var31, (class339) null);
            if (arg11) {
                if (arg6 == 0) {
                    if (var13.field5176) {
                        var20.method1519(arg12, arg7, 50);
                        var20.method1519(arg12, arg7 + 1, 50);
                    }
                    if (var13.field5194 == 1 && !arg4) {
                        class277.field3734[arg3][arg12][arg7] = (byte) class260.method1678(class277.field3734[arg3][arg12][arg7], 1);
                    }
                } else if (arg6 == 1) {
                    if (var13.field5176) {
                        var20.method1519(arg12, arg7 + 1, 50);
                        var20.method1519(arg12 + 1, arg7 + 1, 50);
                    }
                    if (var13.field5194 == 1 && !arg4) {
                        class277.field3734[arg3][arg12][arg7 + 1] = (byte) class260.method1678(class277.field3734[arg3][arg12][arg7 + 1], 2);
                    }
                } else if (arg6 == 2) {
                    if (var13.field5176) {
                        var20.method1519(arg12 + 1, arg7, 50);
                        var20.method1519(arg12 + 1, arg7 + 1, 50);
                    }
                    if (var13.field5194 == 1 && !arg4) {
                        class277.field3734[arg3][arg12 + 1][arg7] = (byte) class260.method1678(class277.field3734[arg3][arg12 + 1][arg7], 1);
                    }
                } else if (arg6 == 3) {
                    if (var13.field5176) {
                        var20.method1519(arg12, arg7, 50);
                        var20.method1519(arg12 + 1, arg7, 50);
                    }
                    if (var13.field5194 == 1 && !arg4) {
                        class277.field3734[arg3][arg12][arg7] = (byte) class260.method1678(class277.field3734[arg3][arg12][arg7], 2);
                    }
                }
            }
            if (var13.field5221 != 0 && arg2 != null) {
                arg2.method1164(3610, arg6, !var13.field5174, var13.field5201, arg12, arg8, arg7);
            }
            if (var13.field5178 != 16) {
                class22.method280(arg3, arg12, arg7, var13.field5178);
            }
        } else if (arg8 == 1) {
            class339 var32;
            if (var25) {
                class314 var33 = new class314(arg5, var13, arg1, var22, var21, var23, arg4, arg8, arg6, var24);
                if (var33.method577(-16528)) {
                    var33.method570((byte) -24, arg5);
                }
                var32 = var33;
            } else {
                var32 = new class134(arg5, var13, 1, arg6, arg3, arg1, var22, var21, var23, arg4, arg10);
            }
            class407.method2520(arg3, arg12, arg7, var32, (class339) null);
            if (var13.field5176 && arg11) {
                if (arg6 == 0) {
                    var20.method1519(arg12, arg7 + 1, 50);
                } else if (arg6 == 1) {
                    var20.method1519(arg12 + 1, arg7 + 1, 50);
                } else if (arg6 == 2) {
                    var20.method1519(arg12 + 1, arg7, 50);
                } else if (arg6 == 3) {
                    var20.method1519(arg12, arg7, 50);
                }
            }
            if (var13.field5221 != 0 && arg2 != null) {
                arg2.method1164(3610, arg6, !var13.field5174, var13.field5201, arg12, arg8, arg7);
            }
        } else if (arg8 == 2) {
            int var34 = arg6 + 1 & 0x3;
            class339 var37;
            class339 var38;
            if (var25) {
                class314 var35 = new class314(arg5, var13, arg1, var22, var21, var23, arg4, arg8, arg6 + 4, var24);
                class314 var36 = new class314(arg5, var13, arg1, var22, var21, var23, arg4, arg8, var34, var24);
                if (var35.method577(-16528)) {
                    var35.method570((byte) 111, arg5);
                }
                if (var36.method577(-16528)) {
                    var36.method570((byte) 126, arg5);
                }
                var37 = var35;
                var38 = var36;
            } else {
                var37 = new class134(arg5, var13, 2, arg6 + 4, arg3, arg1, var22, var21, var23, arg4, arg10);
                var38 = new class134(arg5, var13, 2, var34, arg3, arg1, var22, var21, var23, arg4, arg10);
            }
            class407.method2520(arg3, arg12, arg7, var37, var38);
            if (var13.field5194 == 1 && arg11 && !arg4) {
                if (arg6 == 0) {
                    class277.field3734[arg3][arg12][arg7] = (byte) class260.method1678(class277.field3734[arg3][arg12][arg7], 1);
                    class277.field3734[arg3][arg12][arg7 + 1] = (byte) class260.method1678(class277.field3734[arg3][arg12][arg7 + 1], 2);
                } else if (arg6 == 1) {
                    class277.field3734[arg3][arg12][arg7 + 1] = (byte) class260.method1678(class277.field3734[arg3][arg12][arg7 + 1], 2);
                    class277.field3734[arg3][arg12 + 1][arg7] = (byte) class260.method1678(class277.field3734[arg3][arg12 + 1][arg7], 1);
                } else if (arg6 == 2) {
                    class277.field3734[arg3][arg12 + 1][arg7] = (byte) class260.method1678(class277.field3734[arg3][arg12 + 1][arg7], 1);
                    class277.field3734[arg3][arg12][arg7] = (byte) class260.method1678(class277.field3734[arg3][arg12][arg7], 2);
                } else if (arg6 == 3) {
                    class277.field3734[arg3][arg12][arg7] = (byte) class260.method1678(class277.field3734[arg3][arg12][arg7], 2);
                    class277.field3734[arg3][arg12][arg7] = (byte) class260.method1678(class277.field3734[arg3][arg12][arg7], 1);
                }
            }
            if (var13.field5221 != 0 && arg2 != null) {
                arg2.method1164(3610, arg6, !var13.field5174, var13.field5201, arg12, arg8, arg7);
            }
            if (var13.field5178 != 16) {
                class22.method280(arg3, arg12, arg7, var13.field5178);
            }
        } else if (arg8 == 3) {
            class339 var40;
            if (var25) {
                class314 var39 = new class314(arg5, var13, arg1, var22, var21, var23, arg4, arg8, arg6, var24);
                var40 = var39;
                if (var39.method577(-16528)) {
                    var39.method570((byte) -103, arg5);
                }
            } else {
                var40 = new class134(arg5, var13, 3, arg6, arg3, arg1, var22, var21, var23, arg4, arg10);
            }
            class407.method2520(arg3, arg12, arg7, var40, (class339) null);
            if (var13.field5176 && arg11) {
                if (arg6 == 0) {
                    var20.method1519(arg12, arg7 + 1, 50);
                } else if (arg6 == 1) {
                    var20.method1519(arg12 + 1, arg7 + 1, 50);
                } else if (arg6 == 2) {
                    var20.method1519(arg12 + 1, arg7, 50);
                } else if (arg6 == 3) {
                    var20.method1519(arg12, arg7, 50);
                }
            }
            if (var13.field5221 != 0 && arg2 != null) {
                arg2.method1164(3610, arg6, !var13.field5174, var13.field5201, arg12, arg8, arg7);
            }
        } else if (arg8 == 9) {
            class228 var41;
            if (var25) {
                class173 var42 = new class173(arg5, var13, arg3, arg1, var22, var21, var23, arg4, arg12, arg12, arg7, arg7, arg8, arg6, var24);
                if (var42.method577(-16528)) {
                    var42.method570((byte) 10, arg5);
                }
                var41 = var42;
            } else {
                var41 = new class66(arg5, var13, arg8, arg6, arg3, arg1, var22, var21, var23, arg4, arg12, var14 + arg12 - 1, arg7, arg7 + var15 - 1, arg10);
            }
            class384.method2379(var41, false, !arg11);
            if (var13.field5221 != 0 && arg2 != null) {
                arg2.method1152(!var13.field5174, arg12, var14, var15, var13.field5201, arg7, (byte) 126);
            }
            if (var13.field5178 != 16) {
                class22.method280(arg3, arg12, arg7, var13.field5178);
            }
        } else if (arg8 == 4) {
            class57 var44;
            if (var25) {
                class326 var43 = new class326(arg5, var13, arg1, var22, var21, var23, arg4, 0, 0, 0, arg8, arg6);
                if (var43.method577(-16528)) {
                    var43.method570((byte) 106, arg5);
                }
                var44 = var43;
            } else {
                var44 = new class375(arg5, var13, arg8, arg6, arg3, arg1, var22, var21, var23, arg4, 0, 0, 0, arg10);
            }
            class218.method1496(arg3, arg12, arg7, var44, (class57) null);
        } else if (arg8 == 5) {
            int var45 = 16;
            class111 var46 = (class111) class194.method1394(arg3, arg12, arg7);
            if (var46 != null) {
                var45 = class10.method53(var46.method582((byte) 22), true).field5178;
            }
            class57 var48;
            if (var25) {
                class326 var47 = new class326(arg5, var13, arg1, var22, var21, var23, arg4, 0, class451.field6512[arg6] * var45, class173.field2526[arg6] * var45, arg8, arg6);
                if (var47.method577(-16528)) {
                    var47.method570((byte) 109, arg5);
                }
                var48 = var47;
            } else {
                var48 = new class375(arg5, var13, arg8, arg6, arg3, arg1, var22, var21, var23, arg4, 0, class451.field6512[arg6] * var45, class173.field2526[arg6] * var45, arg10);
            }
            class218.method1496(arg3, arg12, arg7, var48, (class57) null);
        } else if (arg8 == 6) {
            int var49 = 8;
            class111 var50 = (class111) class194.method1394(arg3, arg12, arg7);
            if (var50 != null) {
                var49 = class10.method53(var50.method582((byte) 22), true).field5178 / 2;
            }
            class57 var52;
            if (var25) {
                class326 var51 = new class326(arg5, var13, arg1, var22, var21, var23, arg4, arg6, class451.field6512[arg6] * var49, class173.field2526[arg6] * var49, arg8, arg6 + 4);
                if (var51.method577(-16528)) {
                    var51.method570((byte) 120, arg5);
                }
                var52 = var51;
            } else {
                var52 = new class375(arg5, var13, arg8, arg6 + 4, arg3, arg1, var22, var21, var23, arg4, arg6, class76.field1133[arg6] * var49, class148.field2276[arg6] * var49, arg10);
            }
            class218.method1496(arg3, arg12, arg7, var52, (class57) null);
        } else if (arg8 == 7) {
            int var53 = arg6 + 2 & 0x3;
            class57 var54;
            if (var25) {
                class326 var55 = new class326(arg5, var13, arg1, var22, var21, var23, arg4, var53, 0, 0, arg8, var53 + 4);
                var54 = var55;
                if (var55.method577(-16528)) {
                    var55.method570((byte) -21, arg5);
                }
            } else {
                var54 = new class375(arg5, var13, arg8, var53 + 4, arg3, arg1, var22, var21, var23, arg4, var53, 0, 0, arg10);
            }
            class218.method1496(arg3, arg12, arg7, var54, (class57) null);
        } else if (arg8 == 8) {
            int var56 = arg6 + 2 & 0x3;
            int var57 = 8;
            class111 var58 = (class111) class194.method1394(arg3, arg12, arg7);
            if (var58 != null) {
                var57 = class10.method53(var58.method582((byte) 22), true).field5178 / 2;
            }
            class57 var61;
            class57 var62;
            if (var25) {
                class326 var63 = new class326(arg5, var13, arg1, var22, var21, var23, arg4, arg6, class76.field1133[arg6] * var57, class148.field2276[arg6] * var57, arg8, arg6 + 4);
                class326 var64 = new class326(arg5, var13, arg1, var22, var21, var23, arg4, arg6, 0, 0, arg8, var56 + 4);
                if (var63.method577(-16528)) {
                    var63.method570((byte) 118, arg5);
                }
                if (var64.method577(-16528)) {
                    var64.method570((byte) -77, arg5);
                }
                var61 = var63;
                var62 = var64;
            } else {
                class375 var59 = new class375(arg5, var13, arg8, arg6, arg3, arg1, var22, var21, var23, arg4, arg6, class76.field1133[arg6] * var57, class148.field2276[arg6] * var57, arg10);
                class375 var60 = new class375(arg5, var13, arg8, arg6, arg3, arg1, var22, var21, var23, arg4, arg6, 0, 0, arg10);
                var61 = var59;
                var62 = var60;
            }
            class218.method1496(arg3, arg12, arg7, var61, var62);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)I", line = 642)
    public static final int method402(int arg0) {
        if (arg0 != 50) {
            method402(-111);
        }
        field634++;
        class410 var1 = class68.field1018;
        synchronized (class68.field1018) {
            return class68.field1018.method2536(true);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIII)V", line = 659)
    public static final void method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field639++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg5 - arg7;
        int var12 = arg3 - arg7;
        if (arg2 != 1016544257) {
            field640 = 3;
        }
        int var13 = arg5 * arg5;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg3 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (class39.field595 <= arg1 && class134.field1917 >= arg1) {
            int[] var39 = class186.field2697[arg1];
            int var40 = class359.method2251(class69.field1047, arg4 - arg5, -91, class433.field6144);
            int var41 = class359.method2251(class69.field1047, arg4 + arg5, 91, class433.field6144);
            int var42 = class359.method2251(class69.field1047, arg4 - var11, arg2 + -1016544133, class433.field6144);
            int var43 = class359.method2251(class69.field1047, arg4 + var11, 107, class433.field6144);
            class396.method2436(-1070, arg0, var40, var39, var42);
            class396.method2436(-1070, arg6, var42, var39, var43);
            class396.method2436(-1070, arg0, var43, var39, var41);
        }
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var10++;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var37 += var30;
                    var33 += var30;
                    var10++;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var8++;
                    var35 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var45 = arg1 - var9;
            int var46 = arg1 + var9;
            if (var46 >= class39.field595 && class134.field1917 >= var45) {
                int var47 = class359.method2251(class69.field1047, arg4 + var8, -61, class433.field6144);
                int var48 = class359.method2251(class69.field1047, arg4 - var8, -64, class433.field6144);
                if (var44) {
                    int var49 = class359.method2251(class69.field1047, arg4 + var10, 57, class433.field6144);
                    int var50 = class359.method2251(class69.field1047, arg4 - var10, -76, class433.field6144);
                    if (class39.field595 <= var45) {
                        int[] var51 = class186.field2697[var45];
                        class396.method2436(arg2 - 1016545327, arg0, var48, var51, var50);
                        class396.method2436(-1070, arg6, var50, var51, var49);
                        class396.method2436(-1070, arg0, var49, var51, var47);
                    }
                    if (class134.field1917 >= var46) {
                        int[] var52 = class186.field2697[var46];
                        class396.method2436(-1070, arg0, var48, var52, var50);
                        class396.method2436(-1070, arg6, var50, var52, var49);
                        class396.method2436(-1070, arg0, var49, var52, var47);
                    }
                } else {
                    if (class39.field595 <= var45) {
                        class396.method2436(-1070, arg0, var48, class186.field2697[var45], var47);
                    }
                    if (var46 <= class134.field1917) {
                        class396.method2436(-1070, arg0, var48, class186.field2697[var46], var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 875)
    public static void method404(byte arg0) {
        field636 = null;
        int var1 = -28 / ((63 - arg0) / 34);
        field641 = null;
    }
}
