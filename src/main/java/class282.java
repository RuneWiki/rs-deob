import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class282 extends class320 {

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public int field4469;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public int field4462;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "[J")
    public static long[] field4471 = new long[32];

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "Lvh;")
    public static class61 field4466;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "[I")
    public static int[] field4470;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Llg;IIIZ)V", line = 6)
    public static final void method1922(class137 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var5 = arg0.field2533;
        int var6 = arg0.field2515;
        field4463++;
        if (arg0.field2364 == 0) {
            arg0.field2533 = arg0.field2435;
        } else if (arg0.field2364 == 1) {
            arg0.field2533 = arg3 - arg0.field2435;
        } else if (arg0.field2364 == 2) {
            arg0.field2533 = arg0.field2435 * arg3 >> 14;
        } else if (arg0.field2364 == 3) {
            if (arg0.field2490 == 2) {
                arg0.field2533 = (arg0.field2435 - 1) * arg0.field2365 + arg0.field2435 * 32;
            } else if (arg0.field2490 == 7) {
                arg0.field2533 = (arg0.field2435 - 1) * arg0.field2365 + arg0.field2435 * 115;
            }
        }
        if (arg0.field2424 == 0) {
            arg0.field2515 = arg0.field2443;
        } else if (arg0.field2424 == 1) {
            arg0.field2515 = arg2 - arg0.field2443;
        } else if (arg0.field2424 == 2) {
            arg0.field2515 = arg0.field2443 * arg2 >> 14;
        } else if (arg0.field2424 == 3) {
            if (arg0.field2490 == 2) {
                arg0.field2515 = (arg0.field2443 - 1) * arg0.field2544 + arg0.field2443 * 32;
            } else if (arg0.field2490 == 7) {
                arg0.field2515 = (arg0.field2443 - 1) * arg0.field2544 + arg0.field2443 * 12;
            }
        }
        if (arg0.field2364 == 4) {
            arg0.field2533 = arg0.field2538 * arg0.field2515 / arg0.field2369;
        }
        if (arg0.field2424 == 4) {
            arg0.field2515 = arg0.field2533 * arg0.field2369 / arg0.field2538;
        }
        if (class348.field5537 && (client.method1894(arg0).field891 != 0 || arg0.field2490 == 0)) {
            if (arg0.field2515 < 5 && arg0.field2533 < 5) {
                arg0.field2533 = 5;
                arg0.field2515 = 5;
            } else {
                if (arg0.field2533 <= 0) {
                    arg0.field2533 = 5;
                }
                if (arg0.field2515 <= 0) {
                    arg0.field2515 = 5;
                }
            }
        }
        if (arg0.field2386 == 1337) {
            class285.field4524 = arg0;
        }
        if (arg4 && arg0.field2432 != null && (arg0.field2533 != var5 || arg0.field2515 != var6)) {
            class258 var7 = new class258();
            var7.field4168 = arg0;
            var7.field4173 = arg0.field2432;
            class311.field4920.method2303((byte) -124, var7);
        }
        int var8 = 65 % ((arg1 - 44) / 52);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZIIII)V", line = 107)
    public static final void method1923(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= -30) {
            return;
        }
        class80.field1319 = 0L;
        int var5 = class209.method1554(-123);
        field4468++;
        if (arg2 == 3 || var5 == 3) {
            arg0 = true;
        }
        if (class59.field913.startsWith("mac") && arg2 > 0) {
            arg0 = true;
        }
        boolean var6 = false;
        if (var5 > 0 != arg2 > 0) {
            var6 = true;
        }
        if (arg0 && arg2 > 0) {
            var6 = true;
        }
        class92.method797(arg2, (byte) -86, arg0, arg4, arg3, var5, var6);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V", line = 140)
    public static void method1924(int arg0) {
        field4466 = null;
        field4471 = null;
        if (arg0 != 9605) {
            method1923(false, -49, 25, 39, 55);
        }
        field4470 = null;
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V", line = 155)
    public static final void method1925(int arg0) {
        if (class185.field3143 < class305.field4839) {
            class185.field3143 = (float) ((double) class185.field3143 / 30.0D + (double) class185.field3143);
            if (class185.field3143 > class305.field4839) {
                class185.field3143 = class305.field4839;
            }
            class218.method1605(0);
        } else if (class185.field3143 > class305.field4839) {
            class185.field3143 = (float) ((double) class185.field3143 - (double) class185.field3143 / 30.0D);
            if (class305.field4839 > class185.field3143) {
                class185.field3143 = class305.field4839;
            }
            class218.method1605(0);
        }
        if (class199.field3404 != -1 && class255.field4115 != -1) {
            int var1 = class199.field3404 - class95.field1483;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            int var2 = class255.field4115 - class318.field5042;
            class95.field1483 += var1;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var1 == 0 && var2 == 0) {
                class199.field3404 = -1;
                class255.field4115 = -1;
            }
            class318.field5042 += var2;
            class218.method1605(arg0 - 15326);
        }
        if (arg0 != 15326) {
            method1922((class137) null, 76, 62, -66, false);
        }
        field4467++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIII)Z", line = 216)
    public static final boolean method1926(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4464++;
        long var8 = class290.method1980(arg2, arg3 + arg5, arg0 - -arg4);
        if (var8 != 0L) {
            int var10 = (int) var8 >> 20 & 0x3;
            int var11 = (int) var8 >> 14 & 0x1F;
            int var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class97 var13 = class92.method798((byte) 104, var12);
            if (var13.field1535 == -1) {
                int var14 = (52736 - (arg0 * 512)) * 4 + arg5 * 4 + 24624;
                int[] var15 = class47.field725;
                int var16 = arg7;
                if (var8 > 0L) {
                    var16 = arg1;
                }
                if (var11 == 0 || var11 == 2) {
                    if (var10 == 0) {
                        var15[var14] = var16;
                        var15[var14 + 512] = var16;
                        var15[var14 + 1024] = var16;
                        var15[var14 + 1536] = var16;
                    } else if (var10 == 1) {
                        var15[var14] = var16;
                        var15[var14 + 1] = var16;
                        var15[var14 + 2] = var16;
                        var15[var14 + 3] = var16;
                    } else if (var10 == 2) {
                        var15[var14 + 3] = var16;
                        var15[var14 + 515] = var16;
                        var15[var14 + 3 + 1024] = var16;
                        var15[var14 + 1536 + 3] = var16;
                    } else if (var10 == 3) {
                        var15[var14 + 1536] = var16;
                        var15[var14 + 1 + 1536] = var16;
                        var15[var14 + 2 + 1536] = var16;
                        var15[var14 + 1539] = var16;
                    }
                }
                if (var11 == 3) {
                    if (var10 == 0) {
                        var15[var14] = var16;
                    } else if (var10 == 1) {
                        var15[var14 + 3] = var16;
                    } else if (var10 == 2) {
                        var15[var14 + 3 + 1536] = var16;
                    } else if (var10 == 3) {
                        var15[var14 + 1536] = var16;
                    }
                }
                if (var11 == 2) {
                    if (var10 == 3) {
                        var15[var14] = var16;
                        var15[var14 + 512] = var16;
                        var15[var14 + 1024] = var16;
                        var15[var14 + 1536] = var16;
                    } else if (var10 == 0) {
                        var15[var14] = var16;
                        var15[var14 + 1] = var16;
                        var15[var14 + 2] = var16;
                        var15[var14 + 3] = var16;
                    } else if (var10 == 1) {
                        var15[var14 + 3] = var16;
                        var15[var14 + 512 + 3] = var16;
                        var15[var14 + 3 + 1024] = var16;
                        var15[var14 + 1536 + 3] = var16;
                    } else if (var10 == 2) {
                        var15[var14 + 1536] = var16;
                        var15[var14 + 1536 + 1] = var16;
                        var15[var14 + 1538] = var16;
                        var15[var14 + 1536 + 3] = var16;
                    }
                }
            } else if (!class310.method2151(arg3, arg6 - 1532, var10, arg0, arg4, arg5, var13)) {
                return false;
            }
        }
        long var17 = class143.method1156(arg2, arg3 + arg5, arg0 + arg4);
        if (arg6 != 1536) {
            return false;
        }
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x365450) >> 20;
            int var20 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            class97 var21 = class92.method798((byte) 104, var20);
            int var22 = ((int) var17 & 0x7EBD0) >> 14;
            if (var21.field1535 == -1) {
                if (var22 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int[] var24 = class47.field725;
                    int var25 = arg5 * 4 + ((-(arg0 * 512) + 52736) * 4) + 24624;
                    if (var19 == 0 || var19 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1024 + 1] = var23;
                        var24[var25 + 512 + 2] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 1 + 512] = var23;
                        var24[var25 + 1024 + 2] = var23;
                        var24[var25 + 1536 + 3] = var23;
                    }
                }
            } else if (!class310.method2151(arg3, 4, var19, arg0, arg4, arg5, var21)) {
                return false;
            }
        }
        long var26 = class271.method1850(arg2, arg3 + arg5, arg0 + arg4);
        if (var26 != 0L) {
            int var28 = (int) var26 >> 20 & 0x3;
            int var29 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class97 var30 = class92.method798((byte) 104, var29);
            if (var30.field1535 != -1 && !class310.method2151(arg3, arg6 - 1532, var28, arg0, arg4, arg5, var30)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(II)V", line = 425)
    public class282(int arg0, int arg1) {
        this.field4469 = arg0;
        this.field4462 = arg1;
    }
}
