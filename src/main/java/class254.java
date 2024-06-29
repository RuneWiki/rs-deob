import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class254 {

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field4502 = 0;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Lli;")
    public static class185 field4507 = class245.method1649("Hidden)2", 123);

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "[Lli;")
    public static class185[] field4509 = new class185[100];

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Z")
    public static boolean field4504 = false;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "Lli;")
    public static class185 field4510 = class245.method1649("Konfig geladen)3", 123);

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field4506 = -1;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "[Lcg;")
    public static class34[] field4512;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljd;I)V")
    public static final void method1718(class118 arg0, int arg1) {
        field4505++;
        int var2 = arg0.method836((byte) 109);
        class138.field2585 = new class237[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class138.field2585[var3] = new class237();
            class138.field2585[var3].field4236 = arg0.method836((byte) 111);
            class138.field2585[var3].field4237 = arg0.method845((byte) -73);
        }
        class235.field4220 = arg0.method836((byte) -14);
        class180.field3311 = arg0.method836((byte) -92);
        class238.field4251 = arg0.method836((byte) -66);
        class94.field1797 = new class199[class180.field3311 + 1 - class235.field4220];
        for (int var4 = 0; var4 < class238.field4251; var4++) {
            int var5 = arg0.method836((byte) 120);
            class199 var6 = class94.field1797[var5] = new class199();
            var6.field2886 = arg0.method867(false);
            var6.field2895 = arg0.method875((byte) 50);
            var6.field3654 = class235.field4220 + var5;
            var6.field3659 = arg0.method845((byte) -73);
            var6.field3656 = arg0.method845((byte) -73);
        }
        if (arg1 <= 37) {
            field4504 = false;
        }
        class258.field4593 = arg0.method875((byte) 75);
        class187.field3463 = true;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static void method1719(int arg0) {
        field4510 = null;
        field4507 = null;
        if (arg0 > 41) {
            field4509 = null;
            field4512 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZBIIZIILwf;I)V")
    public static final void method1720(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, class47 arg9, int arg10) {
        field4508++;
        if (arg6 && !class17.method125(72) && (class239.field4262[0][arg1][arg10] & 0x2) == 0) {
            if ((class239.field4262[arg0][arg1][arg10] & 0x10) != 0) {
                return;
            }
            if (class176.method1244(arg1, arg10, arg0, -126) != class111.field2009) {
                return;
            }
        }
        if (class275.field4882 > arg0) {
            class275.field4882 = arg0;
        }
        class135 var11 = class184.method1294(arg5, -28916);
        int var12;
        int var13;
        if (arg7 == 1 || arg7 == 3) {
            var12 = var11.field2500;
            var13 = var11.field2536;
        } else {
            var12 = var11.field2536;
            var13 = var11.field2500;
        }
        int var14;
        int var15;
        if (arg1 + var12 > 104) {
            var14 = arg1;
            var15 = arg1 + 1;
        } else {
            var14 = (var12 >> 1) + arg1;
            var15 = arg1 + (var12 + 1 >> 1);
        }
        int var16;
        int var17;
        if ((arg10 + var13) <= 104) {
            var16 = (var13 + 1 >> 1) + arg10;
            var17 = arg10 + (var13 >> 1);
        } else {
            var16 = arg10 + 1;
            var17 = arg10;
        }
        int[][] var18 = class201.field3694[arg4];
        int var19 = var18[var14][var17] + var18[var15][var17] + var18[var14][var16] + var18[var15][var16] >> 2;
        if (arg3 != 17) {
            return;
        }
        int var20 = (arg1 << 7) + (var12 << 6);
        int var21 = (arg10 << 7) + (var13 << 6);
        int[][] var22 = null;
        long var23 = (long) (arg10 | 0x800000 << 7 | arg1 | arg8 << 14 | arg7 << 20);
        if (var11.field2482 == 0 || arg2) {
            var23 |= Long.MIN_VALUE;
        }
        if (arg2) {
            var22 = class60.field1075[0];
        } else if (arg4 < 3) {
            var22 = class201.field3694[arg4 + 1];
        }
        if (var11.field2498 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field2513) {
            var23 |= 0x80000000L;
        }
        long var25 = var23 | (long) arg5 << 32;
        if (var11.method969(arg3 - 15255)) {
            class117.method816(arg7, arg0, (class71) null, arg1, (class188) null, 20807, var11, arg10);
        }
        boolean var27 = !arg2 & var11.field2474;
        if (arg8 == 22) {
            if (class32.field533 || var11.field2482 != 0 || var11.field2516 == 1 || var11.field2533) {
                class75 var29;
                if (var11.field2472 == -1 && var11.field2502 == null && !var11.field2523) {
                    class217 var28 = var11.method972(22, (class34) null, var21, var18, var27, (byte) -77, arg7, var20, var19, var22, arg6);
                    var29 = var28.field3972;
                } else {
                    var29 = new class76(arg5, 22, arg7, arg4, arg1, arg10, var11.field2472, var11.field2547, (class75) null);
                }
                class144.method1034(arg0, arg1, arg10, var19, var29, var25, var11.field2497);
                if (var11.field2516 == 1 && arg9 != null) {
                    arg9.method299(arg1, arg10, arg3 ^ 0xFFFFC3C7);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class75 var69;
            if (var11.field2472 == -1 && var11.field2502 == null && !var11.field2523) {
                class217 var68 = var11.method972(10, (class34) null, var21, var18, var27, (byte) -77, arg8 == 11 ? arg7 + 4 : arg7, var20, var19, var22, arg6);
                var69 = var68.field3972;
            } else {
                var69 = new class76(arg5, 10, arg8 == 11 ? arg7 + 4 : arg7, arg4, arg1, arg10, var11.field2472, var11.field2547, (class75) null);
            }
            if (var69 != null) {
                boolean var70 = class58.method403(arg0, arg1, arg10, var19, var12, var13, var69, 0, var25);
                if (var11.field2495 && var70 && arg6) {
                    int var71 = 15;
                    if (var69 instanceof class98) {
                        var71 = ((class98) var69).method646() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var12; var72++) {
                        for (int var73 = 0; var73 <= var13; var73++) {
                            if (var71 > class157.field2981[arg0][arg1 + var72][arg10 + var73]) {
                                class157.field2981[arg0][arg1 + var72][arg10 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field2516 != 0 && arg9 != null) {
                arg9.method298(var12, var13, arg1, true, var11.field2545, arg10);
            }
        } else if (arg8 >= 12) {
            class75 var31;
            if (var11.field2472 == -1 && var11.field2502 == null && !var11.field2523) {
                class217 var30 = var11.method972(arg8, (class34) null, var21, var18, var27, (byte) -77, arg7, var20, var19, var22, arg6);
                var31 = var30.field3972;
            } else {
                var31 = new class76(arg5, arg8, arg7, arg4, arg1, arg10, var11.field2472, var11.field2547, (class75) null);
            }
            class58.method403(arg0, arg1, arg10, var19, 1, 1, var31, 0, var25);
            if (arg6 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg0 > 0) {
                class185.field3450[arg0][arg1][arg10] = class21.method150(class185.field3450[arg0][arg1][arg10], 4);
            }
            if (var11.field2516 != 0 && arg9 != null) {
                arg9.method298(var12, var13, arg1, true, var11.field2545, arg10);
            }
        } else if (arg8 == 0) {
            class75 var33;
            if (var11.field2472 == -1 && var11.field2502 == null && !var11.field2523) {
                class217 var32 = var11.method972(0, (class34) null, var21, var18, var27, (byte) -77, arg7, var20, var19, var22, arg6);
                var33 = var32.field3972;
            } else {
                var33 = new class76(arg5, 0, arg7, arg4, arg1, arg10, var11.field2472, var11.field2547, (class75) null);
            }
            class206.method1463(arg0, arg1, arg10, var19, var33, (class75) null, class273.field4841[arg7], 0, var25);
            if (arg6) {
                if (arg7 == 0) {
                    if (var11.field2495) {
                        class157.field2981[arg0][arg1][arg10] = 50;
                        class157.field2981[arg0][arg1][arg10 + 1] = 50;
                    }
                    if (var11.field2481) {
                        class185.field3450[arg0][arg1][arg10] = class21.method150(class185.field3450[arg0][arg1][arg10], 1);
                    }
                } else if (arg7 == 1) {
                    if (var11.field2495) {
                        class157.field2981[arg0][arg1][arg10 + 1] = 50;
                        class157.field2981[arg0][arg1 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field2481) {
                        class185.field3450[arg0][arg1][arg10 + 1] = class21.method150(class185.field3450[arg0][arg1][arg10 + 1], 2);
                    }
                } else if (arg7 == 2) {
                    if (var11.field2495) {
                        class157.field2981[arg0][arg1 + 1][arg10] = 50;
                        class157.field2981[arg0][arg1 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field2481) {
                        class185.field3450[arg0][arg1 + 1][arg10] = class21.method150(class185.field3450[arg0][arg1 + 1][arg10], 1);
                    }
                } else if (arg7 == 3) {
                    if (var11.field2495) {
                        class157.field2981[arg0][arg1][arg10] = 50;
                        class157.field2981[arg0][arg1 + 1][arg10] = 50;
                    }
                    if (var11.field2481) {
                        class185.field3450[arg0][arg1][arg10] = class21.method150(class185.field3450[arg0][arg1][arg10], 2);
                    }
                }
            }
            if (var11.field2516 != 0 && arg9 != null) {
                arg9.method303(arg10, var11.field2545, arg8, arg7, arg1, (byte) 38);
            }
            if (var11.field2518 != 16) {
                class276.method1890(arg0, arg1, arg10, var11.field2518);
            }
        } else if (arg8 == 1) {
            class75 var35;
            if (var11.field2472 == -1 && var11.field2502 == null && !var11.field2523) {
                class217 var34 = var11.method972(1, (class34) null, var21, var18, var27, (byte) -77, arg7, var20, var19, var22, arg6);
                var35 = var34.field3972;
            } else {
                var35 = new class76(arg5, 1, arg7, arg4, arg1, arg10, var11.field2472, var11.field2547, (class75) null);
            }
            class206.method1463(arg0, arg1, arg10, var19, var35, (class75) null, class152.field2877[arg7], 0, var25);
            if (var11.field2495 && arg6) {
                if (arg7 == 0) {
                    class157.field2981[arg0][arg1][arg10 + 1] = 50;
                } else if (arg7 == 1) {
                    class157.field2981[arg0][arg1 + 1][arg10 + 1] = 50;
                } else if (arg7 == 2) {
                    class157.field2981[arg0][arg1 + 1][arg10] = 50;
                } else if (arg7 == 3) {
                    class157.field2981[arg0][arg1][arg10] = 50;
                }
            }
            if (var11.field2516 != 0 && arg9 != null) {
                arg9.method303(arg10, var11.field2545, arg8, arg7, arg1, (byte) 38);
            }
        } else if (arg8 == 2) {
            int var36 = arg7 + 1 & 0x3;
            class75 var38;
            class75 var40;
            if (var11.field2472 == -1 && var11.field2502 == null && !var11.field2523) {
                class217 var37 = var11.method972(2, (class34) null, var21, var18, var27, (byte) -77, arg7 + 4, var20, var19, var22, arg6);
                var38 = var37.field3972;
                class217 var39 = var11.method972(2, (class34) null, var21, var18, var27, (byte) -77, var36, var20, var19, var22, arg6);
                var40 = var39.field3972;
            } else {
                var38 = new class76(arg5, 2, arg7 + 4, arg4, arg1, arg10, var11.field2472, var11.field2547, (class75) null);
                var40 = new class76(arg5, 2, var36, arg4, arg1, arg10, var11.field2472, var11.field2547, (class75) null);
            }
            class206.method1463(arg0, arg1, arg10, var19, var38, var40, class273.field4841[arg7], class273.field4841[var36], var25);
            if (var11.field2481 && arg6) {
                if (arg7 == 0) {
                    class185.field3450[arg0][arg1][arg10] = class21.method150(class185.field3450[arg0][arg1][arg10], 1);
                    class185.field3450[arg0][arg1][arg10 + 1] = class21.method150(class185.field3450[arg0][arg1][arg10 + 1], 2);
                } else if (arg7 == 1) {
                    class185.field3450[arg0][arg1][arg10 + 1] = class21.method150(class185.field3450[arg0][arg1][arg10 + 1], 2);
                    class185.field3450[arg0][arg1 + 1][arg10] = class21.method150(class185.field3450[arg0][arg1 + 1][arg10], 1);
                } else if (arg7 == 2) {
                    class185.field3450[arg0][arg1 + 1][arg10] = class21.method150(class185.field3450[arg0][arg1 + 1][arg10], 1);
                    class185.field3450[arg0][arg1][arg10] = class21.method150(class185.field3450[arg0][arg1][arg10], 2);
                } else if (arg7 == 3) {
                    class185.field3450[arg0][arg1][arg10] = class21.method150(class185.field3450[arg0][arg1][arg10], 2);
                    class185.field3450[arg0][arg1][arg10] = class21.method150(class185.field3450[arg0][arg1][arg10], 1);
                }
            }
            if (var11.field2516 != 0 && arg9 != null) {
                arg9.method303(arg10, var11.field2545, arg8, arg7, arg1, (byte) 38);
            }
            if (var11.field2518 != 16) {
                class276.method1890(arg0, arg1, arg10, var11.field2518);
            }
        } else if (arg8 == 3) {
            class75 var42;
            if (var11.field2472 == -1 && var11.field2502 == null && !var11.field2523) {
                class217 var41 = var11.method972(3, (class34) null, var21, var18, var27, (byte) -77, arg7, var20, var19, var22, arg6);
                var42 = var41.field3972;
            } else {
                var42 = new class76(arg5, 3, arg7, arg4, arg1, arg10, var11.field2472, var11.field2547, (class75) null);
            }
            class206.method1463(arg0, arg1, arg10, var19, var42, (class75) null, class152.field2877[arg7], 0, var25);
            if (var11.field2495 && arg6) {
                if (arg7 == 0) {
                    class157.field2981[arg0][arg1][arg10 + 1] = 50;
                } else if (arg7 == 1) {
                    class157.field2981[arg0][arg1 + 1][arg10 + 1] = 50;
                } else if (arg7 == 2) {
                    class157.field2981[arg0][arg1 + 1][arg10] = 50;
                } else if (arg7 == 3) {
                    class157.field2981[arg0][arg1][arg10] = 50;
                }
            }
            if (var11.field2516 != 0 && arg9 != null) {
                arg9.method303(arg10, var11.field2545, arg8, arg7, arg1, (byte) 38);
            }
        } else if (arg8 == 9) {
            class75 var44;
            if (var11.field2472 == -1 && var11.field2502 == null && !var11.field2523) {
                class217 var43 = var11.method972(arg8, (class34) null, var21, var18, var27, (byte) -77, arg7, var20, var19, var22, arg6);
                var44 = var43.field3972;
            } else {
                var44 = new class76(arg5, arg8, arg7, arg4, arg1, arg10, var11.field2472, var11.field2547, (class75) null);
            }
            class58.method403(arg0, arg1, arg10, var19, 1, 1, var44, 0, var25);
            if (var11.field2516 != 0 && arg9 != null) {
                arg9.method298(var12, var13, arg1, true, var11.field2545, arg10);
            }
            if (var11.field2518 != 16) {
                class276.method1890(arg0, arg1, arg10, var11.field2518);
            }
        } else if (arg8 == 4) {
            class75 var46;
            if (var11.field2472 == -1 && var11.field2502 == null && !var11.field2523) {
                class217 var45 = var11.method972(4, (class34) null, var21, var18, var27, (byte) -77, arg7, var20, var19, var22, arg6);
                var46 = var45.field3972;
            } else {
                var46 = new class76(arg5, 4, arg7, arg4, arg1, arg10, var11.field2472, var11.field2547, (class75) null);
            }
            class154.method1100(arg0, arg1, arg10, var19, var46, (class75) null, class273.field4841[arg7], 0, 0, 0, var25);
        } else if (arg8 == 5) {
            int var47 = 16;
            long var48 = class255.method1724(arg0, arg1, arg10);
            if (var48 != 0L) {
                var47 = class184.method1294(Integer.MAX_VALUE & (int) (var48 >>> 32), arg3 ^ 0xFFFF8F1D).field2518;
            }
            class75 var51;
            if (var11.field2472 == -1 && var11.field2502 == null && !var11.field2523) {
                class217 var50 = var11.method972(4, (class34) null, var21, var18, var27, (byte) -77, arg7, var20, var19, var22, arg6);
                var51 = var50.field3972;
            } else {
                var51 = new class76(arg5, 4, arg7, arg4, arg1, arg10, var11.field2472, var11.field2547, (class75) null);
            }
            class154.method1100(arg0, arg1, arg10, var19, var51, (class75) null, class273.field4841[arg7], 0, class50.field822[arg7] * var47, class82.field1634[arg7] * var47, var25);
        } else if (arg8 == 6) {
            int var52 = 8;
            long var53 = class255.method1724(arg0, arg1, arg10);
            if (var53 != 0L) {
                var52 = class184.method1294(Integer.MAX_VALUE & (int) (var53 >>> 32), arg3 ^ 0xFFFF8F1D).field2518 / 2;
            }
            class75 var56;
            if (var11.field2472 == -1 && var11.field2502 == null && !var11.field2523) {
                class217 var55 = var11.method972(4, (class34) null, var21, var18, var27, (byte) -77, arg7 + 4, var20, var19, var22, arg6);
                var56 = var55.field3972;
            } else {
                var56 = new class76(arg5, 4, arg7 + 4, arg4, arg1, arg10, var11.field2472, var11.field2547, (class75) null);
            }
            class154.method1100(arg0, arg1, arg10, var19, var56, (class75) null, 256, arg7, class174.field3179[arg7] * var52, class133.field2385[arg7] * var52, var25);
        } else if (arg8 == 7) {
            int var57 = arg7 + 2 & 0x3;
            class75 var59;
            if (var11.field2472 == -1 && var11.field2502 == null && !var11.field2523) {
                class217 var58 = var11.method972(4, (class34) null, var21, var18, var27, (byte) -77, var57 + 4, var20, var19, var22, arg6);
                var59 = var58.field3972;
            } else {
                var59 = new class76(arg5, 4, var57 + 4, arg4, arg1, arg10, var11.field2472, var11.field2547, (class75) null);
            }
            class154.method1100(arg0, arg1, arg10, var19, var59, (class75) null, 256, var57, 0, 0, var25);
        } else if (arg8 == 8) {
            long var60 = class255.method1724(arg0, arg1, arg10);
            int var62 = 8;
            if (var60 != 0L) {
                var62 = class184.method1294((int) (var60 >>> 32) & Integer.MAX_VALUE, -28916).field2518 / 2;
            }
            int var63 = arg7 + 2 & 0x3;
            class75 var65;
            class75 var67;
            if (var11.field2472 == -1 && var11.field2502 == null && !var11.field2523) {
                class217 var64 = var11.method972(4, (class34) null, var21, var18, var27, (byte) -77, arg7 + 4, var20, var19, var22, arg6);
                var65 = var64.field3972;
                class217 var66 = var11.method972(4, (class34) null, var21, var18, var27, (byte) -77, var63 + 4, var20, var19, var22, arg6);
                var67 = var66.field3972;
            } else {
                var65 = new class76(arg5, 4, arg7 + 4, arg4, arg1, arg10, var11.field2472, var11.field2547, (class75) null);
                var67 = new class76(arg5, 4, var63 + 4, arg4, arg1, arg10, var11.field2472, var11.field2547, (class75) null);
            }
            class154.method1100(arg0, arg1, arg10, var19, var65, var67, 256, arg7, class174.field3179[arg7] * var62, class133.field2385[arg7] * var62, var25);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)V")
    public static final void method1721(byte arg0, int arg1) {
        field4511++;
        class148.field2785.method85((byte) 75, arg1);
        class30.field495.method85((byte) 75, arg1);
        int var2 = -90 / ((-arg0 - 2) / 61);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public static final void method1722(byte arg0) {
        int var1 = 81 / ((66 - arg0) / 32);
        field4503++;
    }
}
