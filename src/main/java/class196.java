import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class196 {

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "Lik;")
    public static class259 field3117 = new class259(4);

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "Z")
    public static boolean field3123 = false;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "Lai;")
    public static class126 field3118;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lwl;B)V", line = 6)
    public static final void method1429(class89 arg0, byte arg1) {
        field3119++;
        class63 var2 = arg0.method640(123);
        arg0.field1453 = var2.field970;
        if (arg0.field1365 == 0) {
            arg0.field1389 = 0;
        } else {
            if (arg0.field1458 != -1 && arg0.field1398 == 0) {
                class269 var3 = class6.method28(arg0.field1458, 2);
                if (arg0.field1434 > 0 && var3.field4176 == 0) {
                    arg0.field1389++;
                    return;
                }
                if (arg0.field1434 <= 0 && var3.field4188 == 0) {
                    arg0.field1389++;
                    return;
                }
            }
            int var4 = arg0.field1442;
            int var5 = arg0.field1369;
            int var6 = arg0.field1386[arg0.field1365 - 1] * 128 + arg0.method200(-1) * 64;
            int var7 = arg0.field1388[arg0.field1365 - 1] * 128 + (arg0.method200(arg1 ^ 0xFFFFFF9F) * 64);
            if (var6 - var4 > 256 || var6 - var4 < -256 || var7 - var5 > 256 || var7 - var5 < -256) {
                arg0.field1442 = var6;
                arg0.field1369 = var7;
                return;
            }
            if (var6 <= var4) {
                if (var6 < var4) {
                    if (var5 < var7) {
                        arg0.field1395 = 768;
                    } else if (var7 < var5) {
                        arg0.field1395 = 256;
                    } else {
                        arg0.field1395 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field1395 = 1024;
                } else if (var7 < var5) {
                    arg0.field1395 = 0;
                }
            } else if (var5 < var7) {
                arg0.field1395 = 1280;
            } else if (var5 > var7) {
                arg0.field1395 = 1792;
            } else {
                arg0.field1395 = 1536;
            }
            int var8 = arg0.field1395 - arg0.field1443 & 0x7FF;
            if (var8 > 1024) {
                var8 -= 2048;
            }
            int var9 = var2.field976;
            int var10 = 4;
            if (var8 >= -256 && var8 <= 256) {
                var9 = var2.field1001;
            } else if (var8 >= 256 && var8 < 768) {
                var9 = var2.field997;
            } else if (var8 >= -768 && var8 <= -256) {
                var9 = var2.field968;
            }
            boolean var11 = true;
            if (var9 == -1) {
                var9 = var2.field1001;
            }
            arg0.field1453 = var9;
            if (arg0 instanceof class305) {
                var11 = ((class305) arg0).field4778.field3337;
            }
            if (var11) {
                if (arg0.field1443 != arg0.field1395 && arg0.field1366 == -1 && arg0.field1384 != 0) {
                    var10 = 2;
                }
                if (arg0.field1365 > 2) {
                    var10 = 6;
                }
                if (arg0.field1365 > 3) {
                    var10 = 8;
                }
                if (arg0.field1389 > 0 && arg0.field1365 > 1) {
                    var10 = 8;
                    arg0.field1389--;
                }
            } else {
                if (arg0.field1365 > 1) {
                    var10 = 6;
                }
                if (arg0.field1365 > 2) {
                    var10 = 8;
                }
                if (arg0.field1389 > 0 && arg0.field1365 > 1) {
                    arg0.field1389--;
                    var10 = 8;
                }
            }
            byte var12 = 1;
            if (arg0.field1431[arg0.field1365 - 1] == 2) {
                var12 = 2;
                var10 <<= 0x1;
            } else if (arg0.field1431[arg0.field1365 - 1] == 0) {
                var12 = 0;
                var10 >>= 0x1;
            }
            if (var10 < 8 || var2.field989 == -1) {
                if (var2.field971 != -1 && var12 == 0) {
                    if (arg0.field1453 == var2.field976 && var2.field973 != -1) {
                        arg0.field1453 = var2.field973;
                    } else if (arg0.field1453 == var2.field968 && var2.field995 != -1) {
                        arg0.field1453 = var2.field995;
                    } else if (arg0.field1453 == var2.field997 && var2.field980 != -1) {
                        arg0.field1453 = var2.field980;
                    } else {
                        arg0.field1453 = var2.field971;
                    }
                }
            } else if (arg0.field1453 == var2.field976 && var2.field987 != -1) {
                arg0.field1453 = var2.field987;
            } else if (arg0.field1453 == var2.field968 && var2.field974 != -1) {
                arg0.field1453 = var2.field974;
            } else if (arg0.field1453 == var2.field997 && var2.field1004 != -1) {
                arg0.field1453 = var2.field1004;
            } else {
                arg0.field1453 = var2.field989;
            }
            if (var2.field1003 != -1) {
                int var13 = var10 << 7;
                if (arg0.field1365 == 1) {
                    int var14 = arg0.field1377 * arg0.field1377;
                    int var15 = (var6 < arg0.field1442 ? arg0.field1442 - var6 : -arg0.field1442 + var6) << 7;
                    int var16 = (arg0.field1369 > var7 ? arg0.field1369 - var7 : -arg0.field1369 + var7) << 7;
                    int var17 = var15 > var16 ? var15 : var16;
                    int var18 = var17 * 2 * var2.field1003;
                    if (var18 < var14) {
                        arg0.field1377 /= 2;
                    } else if (var17 < var14 / 2) {
                        arg0.field1377 -= var2.field1003;
                        if (arg0.field1377 < 0) {
                            arg0.field1377 = 0;
                        }
                    } else if (var13 > arg0.field1377) {
                        arg0.field1377 += var2.field1003;
                        if (arg0.field1377 > var13) {
                            arg0.field1377 = var13;
                        }
                    }
                } else if (arg0.field1377 < var13) {
                    arg0.field1377 += var2.field1003;
                    if (arg0.field1377 > var13) {
                        arg0.field1377 = var13;
                    }
                } else if (arg0.field1377 > 0) {
                    arg0.field1377 -= var2.field1003;
                    if (arg0.field1377 < 0) {
                        arg0.field1377 = 0;
                    }
                }
                var10 = arg0.field1377 >> 7;
                if (var10 < 1) {
                    var10 = 1;
                }
            }
            if (var6 > var4) {
                arg0.field1442 += var10;
                if (arg0.field1442 > var6) {
                    arg0.field1442 = var6;
                }
            } else if (var6 < var4) {
                arg0.field1442 -= var10;
                if (var6 > arg0.field1442) {
                    arg0.field1442 = var6;
                }
            }
            if (var5 < var7) {
                arg0.field1369 += var10;
                if (var7 < arg0.field1369) {
                    arg0.field1369 = var7;
                }
            } else if (var5 > var7) {
                arg0.field1369 -= var10;
                if (arg0.field1369 < var7) {
                    arg0.field1369 = var7;
                }
            }
            if (arg0.field1442 == var6 && arg0.field1369 == var7) {
                if (arg0.field1434 > 0) {
                    arg0.field1434--;
                }
                arg0.field1365--;
            }
        }
        if (arg1 != 96) {
            field3117 = (class259) null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILob;I)V", line = 332)
    public static final void method1430(int arg0, int arg1, class292 arg2, int arg3) {
        field3112++;
        if (class76.field1165 != null || class243.field3754 || arg2 == null || class150.method1154(50, arg2) == null) {
            return;
        }
        class76.field1165 = arg2;
        class6.field101 = class150.method1154(arg0 + 9386, arg2);
        class274.field4257 = arg3;
        class91.field1489 = false;
        if (arg0 != -9336) {
            field3118 = (class126) null;
        }
        class328.field5081 = arg1;
        class256.field3956 = 0;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIII)I", line = 366)
    public static final int method1431(int arg0, int arg1, int arg2, int arg3) {
        field3113++;
        int var4 = arg3 & 0x3;
        if (arg0 == var4) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIIIII)V", line = 389)
    public static final void method1432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg7 != 14152) {
            field3123 = false;
        }
        int var9 = arg1 - arg8;
        int var10 = arg3 - arg2;
        int var11 = (arg5 - arg6 << 16) / var10;
        field3114++;
        int var12 = (arg0 - arg4 << 16) / var9;
        class63.method451(arg2, 0, -2, var11, arg6, arg4, arg3, arg1, 0, arg8, var12);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V", line = 413)
    public static void method1433(byte arg0) {
        int var1 = -70 % ((72 - arg0) / 46);
        field3117 = null;
        field3118 = null;
    }
}
