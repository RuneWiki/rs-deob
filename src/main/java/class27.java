import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class27 {

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "[Lpj;")
    public static class237[] field488 = new class237[100];

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Lub;")
    public static class88 field487 = new class88();

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Lpj;")
    public static class237 field493 = class33.method353("mapflag", 59);

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public int field492;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Lpj;")
    public class237 field486;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIBIIIIZIZLlj;)V")
    public static final void method242(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9, class25 arg10) {
        field490++;
        if (arg7 && !class151.method1033((byte) -100) && (class73.field1410[0][arg0][arg1] & 0x2) == 0) {
            if ((class73.field1410[arg8][arg0][arg1] & 0x10) != 0) {
                return;
            }
            if (class3.method49(arg0, arg8, arg1, -11566) != class214.field3647) {
                return;
            }
        }
        if (class182.field3209 > arg8) {
            class182.field3209 = arg8;
        }
        class28 var11 = class94.method700(-68, arg5);
        int var12;
        int var13;
        if (arg6 == 1 || arg6 == 3) {
            var12 = var11.field507;
            var13 = var11.field571;
        } else {
            var12 = var11.field571;
            var13 = var11.field507;
        }
        int var14;
        int var15;
        if (arg0 + var13 <= 104) {
            var14 = (var13 >> 1) + arg0;
            var15 = arg0 + (var13 + 1 >> 1);
        } else {
            var15 = arg0 + 1;
            var14 = arg0;
        }
        int var16;
        int var17;
        if ((arg1 + var12) > 104) {
            var16 = arg1 + 1;
            var17 = arg1;
        } else {
            var16 = (var12 + 1 >> 1) + arg1;
            var17 = arg1 + (var12 >> 1);
        }
        int[][] var18 = class99.field1773[arg3];
        int var19 = var18[var14][var16] + var18[var15][var17] + var18[var14][var17] + var18[var15][var16] >> 2;
        int var20 = (arg0 << 7) + (var13 << 6);
        int var21 = (arg1 << 7) + (var12 << 6);
        if (arg2 < 59) {
            return;
        }
        int[][] var22 = null;
        long var23 = (long) (arg0 | arg1 << 7 | arg4 << 14 | arg6 << 20 | 0x40000000);
        if (var11.field535 == 0 || arg9) {
            var23 |= Long.MIN_VALUE;
        }
        if (arg9) {
            var22 = class74.field1421[0];
        } else if (arg3 < 3) {
            var22 = class99.field1773[arg3 + 1];
        }
        if (var11.field517 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field557) {
            var23 |= 0x80000000L;
        }
        long var25 = var23 | (long) arg5 << 32;
        if (var11.method249(-94)) {
            class96.method719(arg1, arg0, arg6, var11, (byte) 107, (class271) null, (class210) null, arg8);
        }
        boolean var27 = !arg9 & var11.field561;
        if (arg4 == 22) {
            if (class22.field401 || var11.field535 != 0 || var11.field551 == 1 || var11.field521) {
                class95 var29;
                if (var11.field543 == -1 && var11.field537 == null) {
                    class129 var28 = var11.method264(22, (class154) null, var21, arg7, var27, var18, (byte) -28, var19, var20, var22, arg6);
                    var29 = var28.field2256;
                } else {
                    var29 = new class218(arg5, 22, arg6, arg3, arg0, arg1, var11.field543, var11.field569, (class95) null);
                }
                class85.method651(arg8, arg0, arg1, var19, var29, var25, var11.field508);
                if (var11.field551 == 1 && arg10 != null) {
                    arg10.method223(0, arg0, arg1);
                }
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class95 var69;
            if (var11.field543 == -1 && var11.field537 == null) {
                class129 var68 = var11.method264(10, (class154) null, var21, arg7, var27, var18, (byte) -28, var19, var20, var22, arg4 == 11 ? arg6 + 4 : arg6);
                var69 = var68.field2256;
            } else {
                var69 = new class218(arg5, 10, arg4 == 11 ? arg6 + 4 : arg6, arg3, arg0, arg1, var11.field543, var11.field569, (class95) null);
            }
            if (var69 != null) {
                boolean var70 = client.method1050(arg8, arg0, arg1, var19, var13, var12, var69, 0, var25);
                if (var11.field530 && var70 && arg7) {
                    int var71 = 15;
                    if (var69 instanceof class201) {
                        var71 = ((class201) var69).method171() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var13; var72++) {
                        for (int var73 = 0; var73 <= var12; var73++) {
                            if (class148.field2639[arg8][arg0 + var72][arg1 + var73] < var71) {
                                class148.field2639[arg8][arg0 + var72][arg1 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field551 != 0 && arg10 != null) {
                arg10.method222(arg1, arg0, var11.field529, (byte) -125, var13, var12);
            }
        } else if (arg4 >= 12) {
            class95 var31;
            if (var11.field543 == -1 && var11.field537 == null) {
                class129 var30 = var11.method264(arg4, (class154) null, var21, arg7, var27, var18, (byte) -28, var19, var20, var22, arg6);
                var31 = var30.field2256;
            } else {
                var31 = new class218(arg5, arg4, arg6, arg3, arg0, arg1, var11.field543, var11.field569, (class95) null);
            }
            client.method1050(arg8, arg0, arg1, var19, 1, 1, var31, 0, var25);
            if (arg7 && arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg8 > 0) {
                class70.field1386[arg8][arg0][arg1] = class34.method362(class70.field1386[arg8][arg0][arg1], 4);
            }
            if (var11.field551 != 0 && arg10 != null) {
                arg10.method222(arg1, arg0, var11.field529, (byte) -120, var13, var12);
            }
        } else if (arg4 == 0) {
            class95 var33;
            if (var11.field543 == -1 && var11.field537 == null) {
                class129 var32 = var11.method264(0, (class154) null, var21, arg7, var27, var18, (byte) -28, var19, var20, var22, arg6);
                var33 = var32.field2256;
            } else {
                var33 = new class218(arg5, 0, arg6, arg3, arg0, arg1, var11.field543, var11.field569, (class95) null);
            }
            class203.method1376(arg8, arg0, arg1, var19, var33, (class95) null, class214.field3669[arg6], 0, var25);
            if (arg7) {
                if (arg6 == 0) {
                    if (var11.field530) {
                        class148.field2639[arg8][arg0][arg1] = 50;
                        class148.field2639[arg8][arg0][arg1 + 1] = 50;
                    }
                    if (var11.field497) {
                        class70.field1386[arg8][arg0][arg1] = class34.method362(class70.field1386[arg8][arg0][arg1], 1);
                    }
                } else if (arg6 == 1) {
                    if (var11.field530) {
                        class148.field2639[arg8][arg0][arg1 + 1] = 50;
                        class148.field2639[arg8][arg0 + 1][arg1 + 1] = 50;
                    }
                    if (var11.field497) {
                        class70.field1386[arg8][arg0][arg1 + 1] = class34.method362(class70.field1386[arg8][arg0][arg1 + 1], 2);
                    }
                } else if (arg6 == 2) {
                    if (var11.field530) {
                        class148.field2639[arg8][arg0 + 1][arg1] = 50;
                        class148.field2639[arg8][arg0 + 1][arg1 + 1] = 50;
                    }
                    if (var11.field497) {
                        class70.field1386[arg8][arg0 + 1][arg1] = class34.method362(class70.field1386[arg8][arg0 + 1][arg1], 1);
                    }
                } else if (arg6 == 3) {
                    if (var11.field530) {
                        class148.field2639[arg8][arg0][arg1] = 50;
                        class148.field2639[arg8][arg0 + 1][arg1] = 50;
                    }
                    if (var11.field497) {
                        class70.field1386[arg8][arg0][arg1] = class34.method362(class70.field1386[arg8][arg0][arg1], 2);
                    }
                }
            }
            if (var11.field551 != 0 && arg10 != null) {
                arg10.method233(arg0, arg6, var11.field529, arg1, (byte) -119, arg4);
            }
            if (var11.field514 != 16) {
                class238.method1631(arg8, arg0, arg1, var11.field514);
            }
        } else if (arg4 == 1) {
            class95 var35;
            if (var11.field543 == -1 && var11.field537 == null) {
                class129 var34 = var11.method264(1, (class154) null, var21, arg7, var27, var18, (byte) -28, var19, var20, var22, arg6);
                var35 = var34.field2256;
            } else {
                var35 = new class218(arg5, 1, arg6, arg3, arg0, arg1, var11.field543, var11.field569, (class95) null);
            }
            class203.method1376(arg8, arg0, arg1, var19, var35, (class95) null, class218.field3776[arg6], 0, var25);
            if (var11.field530 && arg7) {
                if (arg6 == 0) {
                    class148.field2639[arg8][arg0][arg1 + 1] = 50;
                } else if (arg6 == 1) {
                    class148.field2639[arg8][arg0 + 1][arg1 + 1] = 50;
                } else if (arg6 == 2) {
                    class148.field2639[arg8][arg0 + 1][arg1] = 50;
                } else if (arg6 == 3) {
                    class148.field2639[arg8][arg0][arg1] = 50;
                }
            }
            if (var11.field551 != 0 && arg10 != null) {
                arg10.method233(arg0, arg6, var11.field529, arg1, (byte) -74, arg4);
            }
        } else if (arg4 == 2) {
            int var36 = arg6 + 1 & 0x3;
            class95 var38;
            class95 var40;
            if (var11.field543 == -1 && var11.field537 == null) {
                class129 var37 = var11.method264(2, (class154) null, var21, arg7, var27, var18, (byte) -28, var19, var20, var22, arg6 + 4);
                var38 = var37.field2256;
                class129 var39 = var11.method264(2, (class154) null, var21, arg7, var27, var18, (byte) -28, var19, var20, var22, var36);
                var40 = var39.field2256;
            } else {
                var38 = new class218(arg5, 2, arg6 + 4, arg3, arg0, arg1, var11.field543, var11.field569, (class95) null);
                var40 = new class218(arg5, 2, var36, arg3, arg0, arg1, var11.field543, var11.field569, (class95) null);
            }
            class203.method1376(arg8, arg0, arg1, var19, var38, var40, class214.field3669[arg6], class214.field3669[var36], var25);
            if (var11.field497 && arg7) {
                if (arg6 == 0) {
                    class70.field1386[arg8][arg0][arg1] = class34.method362(class70.field1386[arg8][arg0][arg1], 1);
                    class70.field1386[arg8][arg0][arg1 + 1] = class34.method362(class70.field1386[arg8][arg0][arg1 + 1], 2);
                } else if (arg6 == 1) {
                    class70.field1386[arg8][arg0][arg1 + 1] = class34.method362(class70.field1386[arg8][arg0][arg1 + 1], 2);
                    class70.field1386[arg8][arg0 + 1][arg1] = class34.method362(class70.field1386[arg8][arg0 + 1][arg1], 1);
                } else if (arg6 == 2) {
                    class70.field1386[arg8][arg0 + 1][arg1] = class34.method362(class70.field1386[arg8][arg0 + 1][arg1], 1);
                    class70.field1386[arg8][arg0][arg1] = class34.method362(class70.field1386[arg8][arg0][arg1], 2);
                } else if (arg6 == 3) {
                    class70.field1386[arg8][arg0][arg1] = class34.method362(class70.field1386[arg8][arg0][arg1], 2);
                    class70.field1386[arg8][arg0][arg1] = class34.method362(class70.field1386[arg8][arg0][arg1], 1);
                }
            }
            if (var11.field551 != 0 && arg10 != null) {
                arg10.method233(arg0, arg6, var11.field529, arg1, (byte) -90, arg4);
            }
            if (var11.field514 != 16) {
                class238.method1631(arg8, arg0, arg1, var11.field514);
            }
        } else if (arg4 == 3) {
            class95 var42;
            if (var11.field543 == -1 && var11.field537 == null) {
                class129 var41 = var11.method264(3, (class154) null, var21, arg7, var27, var18, (byte) -28, var19, var20, var22, arg6);
                var42 = var41.field2256;
            } else {
                var42 = new class218(arg5, 3, arg6, arg3, arg0, arg1, var11.field543, var11.field569, (class95) null);
            }
            class203.method1376(arg8, arg0, arg1, var19, var42, (class95) null, class218.field3776[arg6], 0, var25);
            if (var11.field530 && arg7) {
                if (arg6 == 0) {
                    class148.field2639[arg8][arg0][arg1 + 1] = 50;
                } else if (arg6 == 1) {
                    class148.field2639[arg8][arg0 + 1][arg1 + 1] = 50;
                } else if (arg6 == 2) {
                    class148.field2639[arg8][arg0 + 1][arg1] = 50;
                } else if (arg6 == 3) {
                    class148.field2639[arg8][arg0][arg1] = 50;
                }
            }
            if (var11.field551 != 0 && arg10 != null) {
                arg10.method233(arg0, arg6, var11.field529, arg1, (byte) -96, arg4);
            }
        } else if (arg4 == 9) {
            class95 var44;
            if (var11.field543 == -1 && var11.field537 == null) {
                class129 var43 = var11.method264(arg4, (class154) null, var21, arg7, var27, var18, (byte) -28, var19, var20, var22, arg6);
                var44 = var43.field2256;
            } else {
                var44 = new class218(arg5, arg4, arg6, arg3, arg0, arg1, var11.field543, var11.field569, (class95) null);
            }
            client.method1050(arg8, arg0, arg1, var19, 1, 1, var44, 0, var25);
            if (var11.field551 != 0 && arg10 != null) {
                arg10.method222(arg1, arg0, var11.field529, (byte) -111, var13, var12);
            }
            if (var11.field514 != 16) {
                class238.method1631(arg8, arg0, arg1, var11.field514);
            }
        } else if (arg4 == 4) {
            class95 var46;
            if (var11.field543 == -1 && var11.field537 == null) {
                class129 var45 = var11.method264(4, (class154) null, var21, arg7, var27, var18, (byte) -28, var19, var20, var22, arg6);
                var46 = var45.field2256;
            } else {
                var46 = new class218(arg5, 4, arg6, arg3, arg0, arg1, var11.field543, var11.field569, (class95) null);
            }
            class84.method643(arg8, arg0, arg1, var19, var46, (class95) null, class214.field3669[arg6], 0, 0, 0, var25);
        } else if (arg4 == 5) {
            int var47 = 16;
            long var48 = class119.method864(arg8, arg0, arg1);
            if (var48 != 0L) {
                var47 = class94.method700(68, (int) (var48 >>> 32) & Integer.MAX_VALUE).field514;
            }
            class95 var51;
            if (var11.field543 == -1 && var11.field537 == null) {
                class129 var50 = var11.method264(4, (class154) null, var21, arg7, var27, var18, (byte) -28, var19, var20, var22, arg6);
                var51 = var50.field2256;
            } else {
                var51 = new class218(arg5, 4, arg6, arg3, arg0, arg1, var11.field543, var11.field569, (class95) null);
            }
            class84.method643(arg8, arg0, arg1, var19, var51, (class95) null, class214.field3669[arg6], 0, class172.field2995[arg6] * var47, class224.field3860[arg6] * var47, var25);
        } else if (arg4 == 6) {
            int var52 = 8;
            long var53 = class119.method864(arg8, arg0, arg1);
            if (var53 != 0L) {
                var52 = class94.method700(94, Integer.MAX_VALUE & (int) (var53 >>> 32)).field514 / 2;
            }
            class95 var56;
            if (var11.field543 == -1 && var11.field537 == null) {
                class129 var55 = var11.method264(4, (class154) null, var21, arg7, var27, var18, (byte) -28, var19, var20, var22, arg6 + 4);
                var56 = var55.field2256;
            } else {
                var56 = new class218(arg5, 4, arg6 + 4, arg3, arg0, arg1, var11.field543, var11.field569, (class95) null);
            }
            class84.method643(arg8, arg0, arg1, var19, var56, (class95) null, 256, arg6, class179.field3153[arg6] * var52, class235.field4082[arg6] * var52, var25);
        } else if (arg4 == 7) {
            int var57 = arg6 + 2 & 0x3;
            class95 var59;
            if (var11.field543 == -1 && var11.field537 == null) {
                class129 var58 = var11.method264(4, (class154) null, var21, arg7, var27, var18, (byte) -28, var19, var20, var22, var57 + 4);
                var59 = var58.field2256;
            } else {
                var59 = new class218(arg5, 4, var57 + 4, arg3, arg0, arg1, var11.field543, var11.field569, (class95) null);
            }
            class84.method643(arg8, arg0, arg1, var19, var59, (class95) null, 256, var57, 0, 0, var25);
        } else if (arg4 == 8) {
            int var60 = 8;
            long var61 = class119.method864(arg8, arg0, arg1);
            if (var61 != 0L) {
                var60 = class94.method700(-98, Integer.MAX_VALUE & (int) (var61 >>> 32)).field514 / 2;
            }
            int var63 = arg6 + 2 & 0x3;
            class95 var65;
            class95 var67;
            if (var11.field543 == -1 && var11.field537 == null) {
                class129 var64 = var11.method264(4, (class154) null, var21, arg7, var27, var18, (byte) -28, var19, var20, var22, arg6 + 4);
                var65 = var64.field2256;
                class129 var66 = var11.method264(4, (class154) null, var21, arg7, var27, var18, (byte) -28, var19, var20, var22, var63 + 4);
                var67 = var66.field2256;
            } else {
                var65 = new class218(arg5, 4, arg6 + 4, arg3, arg0, arg1, var11.field543, var11.field569, (class95) null);
                var67 = new class218(arg5, 4, var63 + 4, arg3, arg0, arg1, var11.field543, var11.field569, (class95) null);
            }
            class84.method643(arg8, arg0, arg1, var19, var65, var67, 256, arg6, class179.field3153[arg6] * var60, class235.field4082[arg6] * var60, var25);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method243(byte arg0) {
        field493 = null;
        field488 = null;
        field487 = null;
        if (arg0 >= -77) {
            field487 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)J")
    public static final long method244(int arg0, int arg1, int arg2) {
        class35 var3 = class274.field4775[arg0][arg1][arg2];
        return var3 == null || var3.field749 == null ? 0L : var3.field749.field3617;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lsb;I)V")
    public static final void method245(class215 arg0, int arg1) {
        field491++;
        if (class241.field4246 == arg0.field3714 || arg0.field3722 == -1 || arg0.field3688 != 0 || (arg0.field3684 + 1) > class256.method1732(arg0.field3722, true).field4383[arg0.field3673]) {
            int var2 = arg0.field3714 - arg0.field3729;
            int var3 = class241.field4246 - arg0.field3729;
            int var4 = arg0.field3704 * 128 + (arg0.method1441((byte) 108) * 64);
            int var5 = arg0.field3691 * 128 + arg0.method1441((byte) 94) * 64;
            int var6 = arg0.field3676 * 128 + arg0.method1441((byte) 53) * 64;
            int var7 = arg0.field3682 * 128 + arg0.method1441((byte) 98) * 64;
            arg0.field3710 = ((var2 - var3) * var4 + (var3 * var6)) / var2;
            arg0.field3700 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg0.field3708 == 0) {
            arg0.field3717 = 1024;
        }
        arg0.field3701 = 0;
        if (arg0.field3708 == 1) {
            arg0.field3717 = 1536;
        }
        if (arg0.field3708 == 2) {
            arg0.field3717 = 0;
        }
        if (arg0.field3708 == 3) {
            arg0.field3717 = 512;
        }
        arg0.field3697 = arg0.field3717;
        if (arg1 != 128) {
            field489 = -47;
        }
    }
}
