import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class199 extends class200 {

    @OriginalMember(owner = "client!k", name = "o", descriptor = "Lsb;")
    public static class98 field3417 = class47.method368("hint_mapedge", 0);

    @OriginalMember(owner = "client!k", name = "q", descriptor = "[I")
    public static int[] field3419 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!k", name = "x", descriptor = "I")
    public static int field3426 = 0;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    public static int field3425 = 0;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "Z")
    public static boolean field3423 = true;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "Lq;")
    public static class148 field3427 = null;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "Z")
    public static volatile boolean field3424 = true;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "Lsb;")
    public static class98 field3421 = class47.method368("details", 0);

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field3418 = 0;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3420++;
        if (class111.field1975 == 0 && !class56.field892) {
            class252.field4411++;
            int var7 = class47.field786;
            int var8 = class170.field2996;
            int var9 = class47.field790;
            int var10 = (arg0 - arg2) * (var7 - var8) / arg3 + var8;
            int var11 = class107.field1922;
            int var12 = (var9 - var11) * (arg1 - arg5) / arg6 + var11;
            class226.method1560(class233.field4011, class64.field1053, (short) 21, (byte) 116, var12, var10, 0L);
        }
        long var13 = -1L;
        if (arg4 != 587) {
            method1360(-12);
        }
        for (int var15 = 0; var15 < class115.field2061; var15++) {
            long var16 = class191.field3302[var15];
            int var18 = (int) var16 >> 7 & 0x7F;
            int var19 = (int) var16 & 0x7F;
            int var20 = (int) (var16 >>> 32) & Integer.MAX_VALUE;
            int var21 = (int) var16 >> 29 & 0x3;
            if (var13 != var16) {
                var13 = var16;
                if (var21 == 2 && class211.method1418(class265.field4640, var19, var18, var16)) {
                    class21 var22 = class125.method929(var20, (byte) -118);
                    if (var22.field393 != null) {
                        var22 = var22.method236(0);
                    }
                    if (var22 == null) {
                        continue;
                    }
                    if (class111.field1975 == 1) {
                        class226.method1560(class186.method1288(new class98[] { class55.field879, class215.field3663, var22.field376 }, 31618), class210.field3603, (short) 2, (byte) -60, var18, var19, var16);
                        class173.field3030++;
                    } else if (!class56.field892) {
                        class198.field3408++;
                        class98[] var23 = var22.field379;
                        if (class78.field1389) {
                            var23 = class92.method675(7759, var23);
                        }
                        if (var23 != null) {
                            for (int var24 = 4; var24 >= 0; var24--) {
                                if (var23[var24] != null) {
                                    short var25 = 0;
                                    class62.field1031++;
                                    if (var24 == 0) {
                                        var25 = 47;
                                    }
                                    if (var24 == 1) {
                                        var25 = 32;
                                    }
                                    if (var24 == 2) {
                                        var25 = 12;
                                    }
                                    if (var24 == 3) {
                                        var25 = 11;
                                    }
                                    if (var24 == 4) {
                                        var25 = 1002;
                                    }
                                    class226.method1560(class186.method1288(new class98[] { class114.field2046, var22.field376 }, 31618), var23[var24], var25, (byte) -91, var18, var19, var16);
                                }
                            }
                        }
                        class226.method1560(class186.method1288(new class98[] { class114.field2046, var22.field376 }, 31618), class102.field1817, (short) 1006, (byte) 120, var18, var19, (long) var22.field404);
                    } else if ((class12.field236 & 0x4) == 4) {
                        class145.field2547++;
                        class226.method1560(class186.method1288(new class98[] { class91.field1609, class215.field3663, var22.field376 }, arg4 ^ 0x79C9), class67.field1080, (short) 19, (byte) 126, var18, var19, var16);
                    }
                }
                if (var21 == 1) {
                    class108 var26 = class180.field3109[var20];
                    if (var26.field1928.field2165 == 1 && (var26.field4492 & 0x7F) == 64 && (var26.field4466 & 0x7F) == 64) {
                        for (int var27 = 0; var27 < class222.field3837; var27++) {
                            class108 var30 = class180.field3109[class87.field1546[var27]];
                            if (var30 != null && var26 != var30 && var30.field1928.field2165 == 1 && var26.field4492 == var30.field4492 && var26.field4466 == var30.field4466) {
                                class90.method665(true, var30.field1928, class87.field1546[var27], var19, var18);
                            }
                        }
                        for (int var28 = 0; var28 < class97.field1671; var28++) {
                            class192 var29 = class141.field2499[class51.field831[var28]];
                            if (var29 != null && var26.field4492 == var29.field4492 && var26.field4466 == var29.field4466) {
                                class171.method1209(var29, var19, var18, 2000, class51.field831[var28]);
                            }
                        }
                    }
                    class90.method665(true, var26.field1928, var20, var19, var18);
                }
                if (var21 == 0) {
                    class192 var31 = class141.field2499[var20];
                    if ((var31.field4492 & 0x7F) == 64 && (var31.field4466 & 0x7F) == 64) {
                        for (int var32 = 0; var32 < class222.field3837; var32++) {
                            class108 var35 = class180.field3109[class87.field1546[var32]];
                            if (var35 != null && var35.field1928.field2165 == 1 && var31.field4492 == var35.field4492 && var31.field4466 == var35.field4466) {
                                class90.method665(true, var35.field1928, class87.field1546[var32], var19, var18);
                            }
                        }
                        for (int var33 = 0; var33 < class97.field1671; var33++) {
                            class192 var34 = class141.field2499[class51.field831[var33]];
                            if (var34 != null && var31 != var34 && var31.field4492 == var34.field4492 && var31.field4466 == var34.field4466) {
                                class171.method1209(var34, var19, var18, 2000, class51.field831[var33]);
                            }
                        }
                    }
                    class171.method1209(var31, var19, var18, 2000, var20);
                }
                if (var21 == 3) {
                    class48 var36 = class115.field2050[class265.field4640][var19][var18];
                    if (var36 != null) {
                        for (class194 var37 = (class194) var36.method373((byte) -86); var37 != null; var37 = (class194) var36.method375(8)) {
                            int var38 = var37.field3362.field201;
                            class245 var39 = class235.method1605(arg4 ^ 0xFFFFFDE3, var38);
                            if (class111.field1975 == 1) {
                                class67.field1063++;
                                class226.method1560(class186.method1288(new class98[] { class55.field879, class15.field291, var39.field4255 }, arg4 ^ 0x79C9), class210.field3603, (short) 57, (byte) -92, var18, var19, (long) var38);
                            } else if (!class56.field892) {
                                class264.field4627++;
                                class98[] var40 = var39.field4259;
                                if (class78.field1389) {
                                    var40 = class92.method675(7759, var40);
                                }
                                for (int var41 = 4; var41 >= 0; var41--) {
                                    if (var40 != null && var40[var41] != null) {
                                        class166.field2970++;
                                        byte var42 = 0;
                                        if (var41 == 0) {
                                            var42 = 14;
                                        }
                                        if (var41 == 1) {
                                            var42 = 22;
                                        }
                                        if (var41 == 2) {
                                            var42 = 48;
                                        }
                                        if (var41 == 3) {
                                            var42 = 8;
                                        }
                                        if (var41 == 4) {
                                            var42 = 7;
                                        }
                                        class226.method1560(class186.method1288(new class98[] { class243.field4214, var39.field4255 }, 31618), var40[var41], var42, (byte) 113, var18, var19, (long) var38);
                                    } else if (var41 == 2) {
                                        class82.field1439++;
                                        class226.method1560(class186.method1288(new class98[] { class243.field4214, var39.field4255 }, 31618), class221.field3814, (short) 48, (byte) -42, var18, var19, (long) var38);
                                    }
                                }
                                class226.method1560(class186.method1288(new class98[] { class243.field4214, var39.field4255 }, 31618), class102.field1817, (short) 1007, (byte) -61, var18, var19, (long) var38);
                            } else if ((class12.field236 & 0x1) == 1) {
                                class226.method1560(class186.method1288(new class98[] { class91.field1609, class15.field291, var39.field4255 }, 31618), class67.field1080, (short) 18, (byte) -89, var18, var19, (long) var38);
                                class211.field3605++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIII)V")
    public static final void method1356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3422++;
        int var6 = arg4 - arg2;
        int var7 = arg0 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                class87.method646(arg3, arg2, arg1, arg4, -42);
            }
        } else if (var6 == 0) {
            class253.method1749(arg3, arg0, arg1, -92, arg2);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg3;
                arg3 = arg2;
                arg2 = var9;
                int var10 = arg0;
                arg0 = arg4;
                arg4 = var10;
            }
            if (arg3 > arg0) {
                int var11 = arg3;
                arg3 = arg0;
                arg0 = var11;
                int var12 = arg2;
                arg2 = arg4;
                arg4 = var12;
            }
            int var13 = arg0 - arg3;
            if (arg5 > 41) {
                int var14 = arg4 - arg2;
                if (var14 < 0) {
                    var14 = -var14;
                }
                int var15 = -(var13 >> 1);
                int var16 = arg2;
                int var17 = arg2 < arg4 ? 1 : -1;
                if (var8) {
                    for (int var19 = arg3; var19 <= arg0; var19++) {
                        var15 += var14;
                        class43.field721[var19][var16] = arg1;
                        if (var15 > 0) {
                            var15 -= var13;
                            var16 += var17;
                        }
                    }
                } else {
                    for (int var18 = arg3; var18 <= arg0; var18++) {
                        var15 += var14;
                        class43.field721[var16][var18] = arg1;
                        if (var15 > 0) {
                            var16 += var17;
                            var15 -= var13;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILlj;)V")
    public static final void method1357(int arg0, class216 arg1) {
        if (arg0 != 1) {
            return;
        }
        field3415++;
        while (true) {
            while (arg1.field3728 < arg1.field3706.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1446(5350) == 1) {
                    var3 = arg1.method1446(5350);
                    var2 = true;
                    var4 = arg1.method1446(5350);
                }
                int var5 = arg1.method1446(5350);
                int var6 = arg1.method1446(5350);
                int var7 = var5 * 64 - class51.field830;
                int var8 = class255.field4470 + class148.field2743 - (var6 * 64) - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && var7 + 63 < class140.field2488 && class148.field2743 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && var11 < var3 * 8 + 8 && var4 * 8 <= var12 && (var4 * 8 + 8) > var12) {
                                byte var13 = arg1.method1472(78);
                                if (var13 != 0) {
                                    if (class91.field1608[var9][var10] == null) {
                                        class91.field1608[var9][var10] = new byte[4096];
                                    }
                                    class91.field1608[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1472(70);
                                    if (class15.field293[var9][var10] == null) {
                                        class15.field293[var9][var10] = new byte[4096];
                                    }
                                    class15.field293[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1472(105);
                        if (var16 != 0) {
                            arg1.field3728++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(B)V")
    public static final void method1358(byte arg0) {
        if (arg0 != 76) {
            return;
        }
        int var1 = 0;
        field3412++;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class253.method1753(var1, class31.field553, (byte) -87, var3, var2, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIILqb;II)V")
    public static final void method1359(int arg0, int arg1, int arg2, int arg3, class72 arg4, int arg5, int arg6) {
        long var7 = 0L;
        field3414++;
        if (arg5 == 0) {
            var7 = class129.method984(arg2, arg0, arg3);
        } else if (arg5 == 1) {
            var7 = class181.method1247(arg2, arg0, arg3);
        } else if (arg5 == 2) {
            var7 = class48.method379(arg2, arg0, arg3);
        } else if (arg5 == 3) {
            var7 = class221.method1527(arg2, arg0, arg3);
        }
        boolean var9 = false;
        int var10 = (int) var7 >> 14 & 0x1F;
        boolean var11 = true;
        boolean var12 = false;
        int var13 = (int) var7 >> 20 & 0x3;
        int var14 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        class21 var15 = class125.method929(var14, (byte) -107);
        if (var15.method240(9142)) {
            class150.method1106(arg3, arg2, 121, var15, arg0);
        }
        if (var7 != 0L) {
            if (arg5 == 0) {
                class55.method407(arg2, arg0, arg3);
                if (var15.field442 != 0) {
                    arg4.method504(var10, arg3, var15.field395, true, arg0, var13);
                }
            } else if (arg5 == 1) {
                class205.method1385(arg2, arg0, arg3);
            } else if (arg5 == 2) {
                class208.method1402(arg2, arg0, arg3);
                if (var15.field442 != 0 && var15.field398 + arg0 < 104 && (var15.field398 + arg3) < 104 && (var15.field397 + arg0) < 104 && (arg3 + var15.field397) < 104) {
                    arg4.method515(-1, arg3, var15.field398, var15.field395, arg0, var13, var15.field397);
                }
            } else if (arg5 == 3) {
                class110.method835(arg2, arg0, arg3);
                if (var15.field442 == 1) {
                    arg4.method513((byte) -72, arg0, arg3);
                }
            }
        }
        if (arg1 >= -70) {
            method1358((byte) 59);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method1360(int arg0) {
        field3417 = null;
        field3421 = null;
        if (arg0 != 0) {
            method1359(-114, 37, -18, 92, (class72) null, -126, -15);
        }
        field3427 = null;
        field3419 = null;
    }
}
