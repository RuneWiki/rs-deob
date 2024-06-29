import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public abstract class class255 extends class81 {

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "Z")
    public volatile boolean field4506 = true;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
    public static int field4503 = 0;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "Lsg;")
    private static class30 field4498 = class167.method1221((byte) 33, "Loaded title screen");

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "Lsg;")
    public static class30 field4497 = field4498;

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "Lsg;")
    private static class30 field4505 = class167.method1221((byte) 33, "shake:");

    @OriginalMember(owner = "client!hk", name = "U", descriptor = "Lsg;")
    public static class30 field4508 = field4505;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "Lsg;")
    public static class30 field4501 = field4505;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "Z")
    public boolean field4496;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "Z")
    public boolean field4502;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "[Lpj;")
    public static class152[] field4499;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(Z)[B")
    public abstract byte[] method109(boolean arg0);

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)I")
    public abstract int method113(int arg0);

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "(I)V")
    public static void method1772(int arg0) {
        int var1 = 34 / ((arg0 + 52) / 42);
        field4497 = null;
        field4505 = null;
        field4498 = null;
        field4501 = null;
        field4508 = null;
        field4499 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)V")
    public static final void method1773(int arg0, int arg1, int arg2, int arg3) {
        field4507++;
        class68 var4 = class103.method830(arg1, 4, arg0);
        var4.method608(false);
        var4.field1484 = arg2;
        var4.field1490 = arg3;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lue;IIIZZIZIII)V")
    public static final void method1774(class13 arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field4504++;
        if (arg4 && !class81.method703(-15861) && (class272.field4771[0][arg3][arg9] & 0x2) == 0) {
            if ((class272.field4771[arg2][arg3][arg9] & 0x10) != 0) {
                return;
            }
            if (class246.method1730((byte) 101, arg9, arg2, arg3) != class109.field2191) {
                return;
            }
        }
        if (arg2 < class239.field4249) {
            class239.field4249 = arg2;
        }
        class40 var11 = class195.method1415(-127, arg6);
        int var12;
        int var13;
        if (arg1 == 1 || arg1 == 3) {
            var12 = var11.field937;
            var13 = var11.field955;
        } else {
            var12 = var11.field955;
            var13 = var11.field937;
        }
        int var14;
        int var15;
        if ((arg3 + var13) > 104) {
            var14 = arg3 + 1;
            var15 = arg3;
        } else {
            var14 = (var13 + 1 >> 1) + arg3;
            var15 = (var13 >> 1) + arg3;
        }
        int[][] var16 = class242.field4333[arg10];
        int var17;
        int var18;
        if ((arg9 + var12) > 104) {
            var17 = arg9;
            var18 = arg9 + 1;
        } else {
            var17 = (var12 >> 1) + arg9;
            var18 = arg9 + (var12 + 1 >> 1);
        }
        int var19 = var16[var15][var17] + var16[var14][var18] - (-var16[var14][var17] - var16[var15][var18]) >> 2;
        int var20 = (arg3 << 7) + (var13 << 6);
        int var21 = (arg9 << 7) + (var12 << 6);
        long var22 = (long) (arg1 << 20 | arg8 << 14 | arg3 | arg9 << 7 | 0x40000000);
        if (var11.field947 == 0 || arg7) {
            var22 |= Long.MIN_VALUE;
        }
        int[][] var24 = null;
        if (arg7) {
            var24 = class177.field3289[0];
        } else if (arg10 < 3) {
            var24 = class242.field4333[arg10 + 1];
        }
        if (var11.field963 == 1) {
            var22 |= 0x400000L;
        }
        if (var11.field938) {
            var22 |= 0x80000000L;
        }
        long var25 = var22 | (long) arg6 << 32;
        if (var11.method421(0)) {
            class195.method1410(var11, (class275) null, arg1, arg9, arg2, (byte) -97, arg3, (class120) null);
        }
        if (!arg5) {
            field4503 = 18;
        }
        boolean var27 = !arg7 & var11.field996;
        if (arg8 == 22) {
            if (class197.field3569 || var11.field947 != 0 || var11.field944 == 1 || var11.field1003) {
                class20 var29;
                if (var11.field960 == -1 && var11.field997 == null) {
                    class73 var28 = var11.method409(var19, arg4, 22, var21, (class192) null, arg1, var16, var24, -84, var27, var20);
                    var29 = var28.field1649;
                } else {
                    var29 = new class55(arg6, 22, arg1, arg10, arg3, arg9, var11.field960, var11.field971, (class20) null);
                }
                class115.method893(arg2, arg3, arg9, var19, var29, var25, var11.field1004);
                if (var11.field944 == 1 && arg0 != null) {
                    arg0.method132((byte) -28, arg3, arg9);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class20 var69;
            if (var11.field960 == -1 && var11.field997 == null) {
                class73 var68 = var11.method409(var19, arg4, 10, var21, (class192) null, arg8 == 11 ? arg1 + 4 : arg1, var16, var24, -98, var27, var20);
                var69 = var68.field1649;
            } else {
                var69 = new class55(arg6, 10, arg8 == 11 ? arg1 + 4 : arg1, arg10, arg3, arg9, var11.field960, var11.field971, (class20) null);
            }
            if (var69 != null) {
                boolean var70 = class25.method219(arg2, arg3, arg9, var19, var13, var12, var69, 0, var25);
                if (var11.field968 && var70 && arg4) {
                    int var71 = 15;
                    if (var69 instanceof class217) {
                        var71 = ((class217) var69).method1539() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var13; var72++) {
                        for (int var73 = 0; var73 <= var12; var73++) {
                            if (class166.field3050[arg2][arg3 + var72][arg9 + var73] < var71) {
                                class166.field3050[arg2][arg3 + var72][arg9 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field944 != 0 && arg0 != null) {
                arg0.method133(-98, arg3, arg9, var11.field981, var13, var12);
            }
        } else if (arg8 >= 12) {
            class20 var31;
            if (var11.field960 == -1 && var11.field997 == null) {
                class73 var30 = var11.method409(var19, arg4, arg8, var21, (class192) null, arg1, var16, var24, -91, var27, var20);
                var31 = var30.field1649;
            } else {
                var31 = new class55(arg6, arg8, arg1, arg10, arg3, arg9, var11.field960, var11.field971, (class20) null);
            }
            class25.method219(arg2, arg3, arg9, var19, 1, 1, var31, 0, var25);
            if (arg4 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg2 > 0) {
                class194.field3505[arg2][arg3][arg9] = class182.method1314(class194.field3505[arg2][arg3][arg9], 4);
            }
            if (var11.field944 != 0 && arg0 != null) {
                arg0.method133(-122, arg3, arg9, var11.field981, var13, var12);
            }
        } else if (arg8 == 0) {
            class20 var33;
            if (var11.field960 == -1 && var11.field997 == null) {
                class73 var32 = var11.method409(var19, arg4, 0, var21, (class192) null, arg1, var16, var24, -121, var27, var20);
                var33 = var32.field1649;
            } else {
                var33 = new class55(arg6, 0, arg1, arg10, arg3, arg9, var11.field960, var11.field971, (class20) null);
            }
            class96.method787(arg2, arg3, arg9, var19, var33, (class20) null, class107.field2144[arg1], 0, var25);
            if (arg4) {
                if (arg1 == 0) {
                    if (var11.field968) {
                        class166.field3050[arg2][arg3][arg9] = 50;
                        class166.field3050[arg2][arg3][arg9 + 1] = 50;
                    }
                    if (var11.field945) {
                        class194.field3505[arg2][arg3][arg9] = class182.method1314(class194.field3505[arg2][arg3][arg9], 1);
                    }
                } else if (arg1 == 1) {
                    if (var11.field968) {
                        class166.field3050[arg2][arg3][arg9 + 1] = 50;
                        class166.field3050[arg2][arg3 + 1][arg9 + 1] = 50;
                    }
                    if (var11.field945) {
                        class194.field3505[arg2][arg3][arg9 + 1] = class182.method1314(class194.field3505[arg2][arg3][arg9 + 1], 2);
                    }
                } else if (arg1 == 2) {
                    if (var11.field968) {
                        class166.field3050[arg2][arg3 + 1][arg9] = 50;
                        class166.field3050[arg2][arg3 + 1][arg9 + 1] = 50;
                    }
                    if (var11.field945) {
                        class194.field3505[arg2][arg3 + 1][arg9] = class182.method1314(class194.field3505[arg2][arg3 + 1][arg9], 1);
                    }
                } else if (arg1 == 3) {
                    if (var11.field968) {
                        class166.field3050[arg2][arg3][arg9] = 50;
                        class166.field3050[arg2][arg3 + 1][arg9] = 50;
                    }
                    if (var11.field945) {
                        class194.field3505[arg2][arg3][arg9] = class182.method1314(class194.field3505[arg2][arg3][arg9], 2);
                    }
                }
            }
            if (var11.field944 != 0 && arg0 != null) {
                arg0.method122(var11.field981, arg3, arg9, arg1, arg8, 105);
            }
            if (var11.field1006 != 16) {
                class82.method708(arg2, arg3, arg9, var11.field1006);
            }
        } else if (arg8 == 1) {
            class20 var35;
            if (var11.field960 == -1 && var11.field997 == null) {
                class73 var34 = var11.method409(var19, arg4, 1, var21, (class192) null, arg1, var16, var24, -128, var27, var20);
                var35 = var34.field1649;
            } else {
                var35 = new class55(arg6, 1, arg1, arg10, arg3, arg9, var11.field960, var11.field971, (class20) null);
            }
            class96.method787(arg2, arg3, arg9, var19, var35, (class20) null, class241.field4324[arg1], 0, var25);
            if (var11.field968 && arg4) {
                if (arg1 == 0) {
                    class166.field3050[arg2][arg3][arg9 + 1] = 50;
                } else if (arg1 == 1) {
                    class166.field3050[arg2][arg3 + 1][arg9 + 1] = 50;
                } else if (arg1 == 2) {
                    class166.field3050[arg2][arg3 + 1][arg9] = 50;
                } else if (arg1 == 3) {
                    class166.field3050[arg2][arg3][arg9] = 50;
                }
            }
            if (var11.field944 != 0 && arg0 != null) {
                arg0.method122(var11.field981, arg3, arg9, arg1, arg8, 75);
            }
        } else if (arg8 == 2) {
            int var36 = arg1 + 1 & 0x3;
            class20 var38;
            class20 var40;
            if (var11.field960 == -1 && var11.field997 == null) {
                class73 var37 = var11.method409(var19, arg4, 2, var21, (class192) null, arg1 + 4, var16, var24, -58, var27, var20);
                var38 = var37.field1649;
                class73 var39 = var11.method409(var19, arg4, 2, var21, (class192) null, var36, var16, var24, -113, var27, var20);
                var40 = var39.field1649;
            } else {
                var38 = new class55(arg6, 2, arg1 + 4, arg10, arg3, arg9, var11.field960, var11.field971, (class20) null);
                var40 = new class55(arg6, 2, var36, arg10, arg3, arg9, var11.field960, var11.field971, (class20) null);
            }
            class96.method787(arg2, arg3, arg9, var19, var38, var40, class107.field2144[arg1], class107.field2144[var36], var25);
            if (var11.field945 && arg4) {
                if (arg1 == 0) {
                    class194.field3505[arg2][arg3][arg9] = class182.method1314(class194.field3505[arg2][arg3][arg9], 1);
                    class194.field3505[arg2][arg3][arg9 + 1] = class182.method1314(class194.field3505[arg2][arg3][arg9 + 1], 2);
                } else if (arg1 == 1) {
                    class194.field3505[arg2][arg3][arg9 + 1] = class182.method1314(class194.field3505[arg2][arg3][arg9 + 1], 2);
                    class194.field3505[arg2][arg3 + 1][arg9] = class182.method1314(class194.field3505[arg2][arg3 + 1][arg9], 1);
                } else if (arg1 == 2) {
                    class194.field3505[arg2][arg3 + 1][arg9] = class182.method1314(class194.field3505[arg2][arg3 + 1][arg9], 1);
                    class194.field3505[arg2][arg3][arg9] = class182.method1314(class194.field3505[arg2][arg3][arg9], 2);
                } else if (arg1 == 3) {
                    class194.field3505[arg2][arg3][arg9] = class182.method1314(class194.field3505[arg2][arg3][arg9], 2);
                    class194.field3505[arg2][arg3][arg9] = class182.method1314(class194.field3505[arg2][arg3][arg9], 1);
                }
            }
            if (var11.field944 != 0 && arg0 != null) {
                arg0.method122(var11.field981, arg3, arg9, arg1, arg8, 78);
            }
            if (var11.field1006 != 16) {
                class82.method708(arg2, arg3, arg9, var11.field1006);
            }
        } else if (arg8 == 3) {
            class20 var42;
            if (var11.field960 == -1 && var11.field997 == null) {
                class73 var41 = var11.method409(var19, arg4, 3, var21, (class192) null, arg1, var16, var24, -115, var27, var20);
                var42 = var41.field1649;
            } else {
                var42 = new class55(arg6, 3, arg1, arg10, arg3, arg9, var11.field960, var11.field971, (class20) null);
            }
            class96.method787(arg2, arg3, arg9, var19, var42, (class20) null, class241.field4324[arg1], 0, var25);
            if (var11.field968 && arg4) {
                if (arg1 == 0) {
                    class166.field3050[arg2][arg3][arg9 + 1] = 50;
                } else if (arg1 == 1) {
                    class166.field3050[arg2][arg3 + 1][arg9 + 1] = 50;
                } else if (arg1 == 2) {
                    class166.field3050[arg2][arg3 + 1][arg9] = 50;
                } else if (arg1 == 3) {
                    class166.field3050[arg2][arg3][arg9] = 50;
                }
            }
            if (var11.field944 != 0 && arg0 != null) {
                arg0.method122(var11.field981, arg3, arg9, arg1, arg8, 102);
            }
        } else if (arg8 == 9) {
            class20 var44;
            if (var11.field960 == -1 && var11.field997 == null) {
                class73 var43 = var11.method409(var19, arg4, arg8, var21, (class192) null, arg1, var16, var24, -99, var27, var20);
                var44 = var43.field1649;
            } else {
                var44 = new class55(arg6, arg8, arg1, arg10, arg3, arg9, var11.field960, var11.field971, (class20) null);
            }
            class25.method219(arg2, arg3, arg9, var19, 1, 1, var44, 0, var25);
            if (var11.field944 != 0 && arg0 != null) {
                arg0.method133(-114, arg3, arg9, var11.field981, var13, var12);
            }
            if (var11.field1006 != 16) {
                class82.method708(arg2, arg3, arg9, var11.field1006);
            }
        } else if (arg8 == 4) {
            class20 var46;
            if (var11.field960 == -1 && var11.field997 == null) {
                class73 var45 = var11.method409(var19, arg4, 4, var21, (class192) null, arg1, var16, var24, -81, var27, var20);
                var46 = var45.field1649;
            } else {
                var46 = new class55(arg6, 4, arg1, arg10, arg3, arg9, var11.field960, var11.field971, (class20) null);
            }
            class74.method676(arg2, arg3, arg9, var19, var46, (class20) null, class107.field2144[arg1], 0, 0, 0, var25);
        } else if (arg8 == 5) {
            int var47 = 16;
            long var48 = class176.method1291(arg2, arg3, arg9);
            if (var48 != 0L) {
                var47 = class195.method1415(120, Integer.MAX_VALUE & (int) (var48 >>> 32)).field1006;
            }
            class20 var51;
            if (var11.field960 == -1 && var11.field997 == null) {
                class73 var50 = var11.method409(var19, arg4, 4, var21, (class192) null, arg1, var16, var24, -68, var27, var20);
                var51 = var50.field1649;
            } else {
                var51 = new class55(arg6, 4, arg1, arg10, arg3, arg9, var11.field960, var11.field971, (class20) null);
            }
            class74.method676(arg2, arg3, arg9, var19, var51, (class20) null, class107.field2144[arg1], 0, class81.field1746[arg1] * var47, class119.field2330[arg1] * var47, var25);
        } else if (arg8 == 6) {
            long var52 = class176.method1291(arg2, arg3, arg9);
            int var54 = 8;
            if (var52 != 0L) {
                var54 = class195.method1415(42, Integer.MAX_VALUE & (int) (var52 >>> 32)).field1006 / 2;
            }
            class20 var56;
            if (var11.field960 == -1 && var11.field997 == null) {
                class73 var55 = var11.method409(var19, arg4, 4, var21, (class192) null, arg1 + 4, var16, var24, -127, var27, var20);
                var56 = var55.field1649;
            } else {
                var56 = new class55(arg6, 4, arg1 + 4, arg10, arg3, arg9, var11.field960, var11.field971, (class20) null);
            }
            class74.method676(arg2, arg3, arg9, var19, var56, (class20) null, 256, arg1, class177.field3276[arg1] * var54, class235.field4202[arg1] * var54, var25);
        } else if (arg8 == 7) {
            int var57 = arg1 + 2 & 0x3;
            class20 var59;
            if (var11.field960 == -1 && var11.field997 == null) {
                class73 var58 = var11.method409(var19, arg4, 4, var21, (class192) null, var57 + 4, var16, var24, -106, var27, var20);
                var59 = var58.field1649;
            } else {
                var59 = new class55(arg6, 4, var57 + 4, arg10, arg3, arg9, var11.field960, var11.field971, (class20) null);
            }
            class74.method676(arg2, arg3, arg9, var19, var59, (class20) null, 256, var57, 0, 0, var25);
        } else if (arg8 == 8) {
            int var60 = 8;
            int var61 = arg1 + 2 & 0x3;
            long var62 = class176.method1291(arg2, arg3, arg9);
            if (var62 != 0L) {
                var60 = class195.method1415(32, (int) (var62 >>> 32) & Integer.MAX_VALUE).field1006 / 2;
            }
            class20 var65;
            class20 var67;
            if (var11.field960 == -1 && var11.field997 == null) {
                class73 var64 = var11.method409(var19, arg4, 4, var21, (class192) null, arg1 + 4, var16, var24, -119, var27, var20);
                var65 = var64.field1649;
                class73 var66 = var11.method409(var19, arg4, 4, var21, (class192) null, var61 + 4, var16, var24, -73, var27, var20);
                var67 = var66.field1649;
            } else {
                var65 = new class55(arg6, 4, arg1 + 4, arg10, arg3, arg9, var11.field960, var11.field971, (class20) null);
                var67 = new class55(arg6, 4, var61 + 4, arg10, arg3, arg9, var11.field960, var11.field971, (class20) null);
            }
            class74.method676(arg2, arg3, arg9, var19, var65, var67, 256, arg1, class177.field3276[arg1] * var60, class235.field4202[arg1] * var60, var25);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I[BII)Lsg;")
    public static final class30 method1775(int arg0, byte[] arg1, int arg2, int arg3) {
        class30 var4 = new class30();
        field4500++;
        var4.field618 = new byte[arg0];
        if (arg2 != 2) {
            field4497 = null;
        }
        var4.field576 = 0;
        for (int var5 = arg3; var5 < (arg0 + arg3); var5++) {
            if (arg1[var5] != 0) {
                var4.field618[var4.field576++] = arg1[var5];
            }
        }
        return var4;
    }
}
