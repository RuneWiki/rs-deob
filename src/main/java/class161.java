import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class161 {

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field2107 = 2;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field2102 = 0;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Z")
    public static boolean field2103 = true;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field2104 = 0;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "Lpp;")
    public static class262 field2109;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "Lud;")
    public static class2 field2101;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1010(int arg0, byte arg1, int arg2) {
        field2108++;
        if ((class37.field606[1][arg2][arg0] & 0x2) == 0) {
            if (arg1 != 72) {
                field2103 = true;
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZLfg;Z)V")
    public static final void method1011(boolean arg0, class18 arg1, boolean arg2) {
        field2110++;
        class183 var3 = arg1.method140(125);
        if (arg0) {
            method1011(false, (class18) null, true);
        }
        if (arg1.field309 == 0) {
            class73.field991 = -1;
            class369.field5487 = 0;
            arg1.field296 = 0;
            return;
        }
        if (arg1.field222 != -1 && arg1.field231 == 0) {
            class15 var4 = class391.method2551(arg1.field222, (byte) -104);
            if (arg1.field305 > 0 && var4.field151 == 0) {
                class369.field5487 = 0;
                class73.field991 = -1;
                arg1.field296++;
                return;
            }
            if (arg1.field305 <= 0 && var4.field173 == 0) {
                arg1.field296++;
                class73.field991 = -1;
                class369.field5487 = 0;
                return;
            }
        }
        if (arg1.field228 != -1 && arg1.field262 <= class50.field698) {
            class333 var5 = class395.method2586(arg1.field228, -6861);
            if (var5.field4922 && var5.field4924 != -1) {
                class15 var6 = class391.method2551(var5.field4924, (byte) -102);
                if (arg1.field305 > 0 && var6.field151 == 0) {
                    arg1.field296++;
                    class369.field5487 = 0;
                    class73.field991 = -1;
                    return;
                }
                if (arg1.field305 <= 0 && var6.field173 == 0) {
                    class369.field5487 = 0;
                    class73.field991 = -1;
                    arg1.field296++;
                    return;
                }
            }
        }
        int var7 = arg1.field5284;
        int var8 = arg1.field5298;
        int var9 = arg1.field303[arg1.field309 - 1] * 128 + (arg1.method130((byte) -40) * 64);
        int var10 = arg1.field306[arg1.field309 - 1] * 128 + arg1.method130((byte) -101) * 64;
        if (!arg2 && var9 - var7 > 256 || var9 - var7 < -256 || (var10 - var8) > 256 || var10 - var8 < -256) {
            class369.field5487 = 0;
            arg1.field5284 = var9;
            arg1.field5298 = var10;
            class73.field991 = -1;
            return;
        }
        if (var7 >= var9) {
            if (var9 < var7) {
                if (var10 > var8) {
                    arg1.method143(-1408718297, 6144);
                } else if (var10 >= var8) {
                    arg1.method143(-1408718297, 4096);
                } else {
                    arg1.method143(-1408718297, 2048);
                }
            } else if (var10 > var8) {
                arg1.method143(-1408718297, 8192);
            } else if (var10 < var8) {
                arg1.method143(-1408718297, 0);
            }
        } else if (var8 < var10) {
            arg1.method143(-1408718297, 10240);
        } else if (var8 <= var10) {
            arg1.method143(-1408718297, 12288);
        } else {
            arg1.method143(-1408718297, 14336);
        }
        int var11 = 4;
        boolean var12 = true;
        if (arg1 instanceof class129) {
            var12 = ((class129) arg1).field1714.field5583;
        }
        if (var12) {
            int var13 = arg1.field235 - arg1.field272.field3846;
            if (var13 != 0 && arg1.field230 == -1 && arg1.field285 != 0) {
                var11 = 2;
            }
            if (!arg2 && arg1.field309 > 2) {
                var11 = 6;
            }
            if (!arg2 && arg1.field309 > 3) {
                var11 = 8;
            }
        } else {
            if (!arg2 && arg1.field309 > 1) {
                var11 = 6;
            }
            if (!arg2 && arg1.field309 > 2) {
                var11 = 8;
            }
        }
        if (arg1.field296 > 0 && arg1.field309 > 1) {
            arg1.field296--;
            var11 = 8;
        }
        byte var14 = arg1.field297[arg1.field309 - 1];
        if (var14 == 2) {
            var11 <<= 0x1;
        } else if (var14 == 0) {
            var11 >>= 0x1;
        }
        if (var3.field2435 != -1) {
            int var15 = var11 << 7;
            if (arg1.field309 == 1) {
                int var16 = arg1.field293 * arg1.field293;
                int var17 = (var9 >= arg1.field5284 ? var9 - arg1.field5284 : -var9 + arg1.field5284) << 7;
                int var18 = (var10 < arg1.field5298 ? arg1.field5298 - var10 : -arg1.field5298 + var10) << 7;
                int var19 = var17 <= var18 ? var18 : var17;
                int var20 = var3.field2435 * var19 * 2;
                if (var16 > var20) {
                    arg1.field293 /= 2;
                } else if (var16 / 2 > var19) {
                    arg1.field293 -= var3.field2435;
                    if (arg1.field293 < 0) {
                        arg1.field293 = 0;
                    }
                } else if (arg1.field293 < var15) {
                    arg1.field293 += var3.field2435;
                    if (arg1.field293 > var15) {
                        arg1.field293 = var15;
                    }
                }
            } else if (arg1.field293 < var15) {
                arg1.field293 += var3.field2435;
                if (arg1.field293 > var15) {
                    arg1.field293 = var15;
                }
            } else if (arg1.field293 > 0) {
                arg1.field293 -= var3.field2435;
                if (arg1.field293 < 0) {
                    arg1.field293 = 0;
                }
            }
            var11 = arg1.field293 >> 7;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        class369.field5487 = 0;
        if (var9 > var7) {
            arg1.field5284 += var11;
            class369.field5487 |= 0x4;
            if (arg1.field5284 > var9) {
                arg1.field5284 = var9;
            }
        } else if (var7 > var9) {
            class369.field5487 |= 0x8;
            arg1.field5284 -= var11;
            if (var9 > arg1.field5284) {
                arg1.field5284 = var9;
            }
        }
        if (var10 > var8) {
            arg1.field5298 += var11;
            class369.field5487 |= 0x1;
            if (arg1.field5298 > var10) {
                arg1.field5298 = var10;
            }
        } else if (var8 > var10) {
            class369.field5487 |= 0x2;
            arg1.field5298 -= var11;
            if (arg1.field5298 < var10) {
                arg1.field5298 = var10;
            }
        }
        if (var11 >= 8) {
            class73.field991 = 2;
        } else {
            class73.field991 = var14;
        }
        if (arg1.field5284 == var9 && arg1.field5298 == var10) {
            if (arg1.field305 > 0) {
                arg1.field305--;
            }
            arg1.field309--;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public static void method1012(int arg0) {
        field2101 = null;
        field2109 = null;
        if (arg0 > -62) {
            method1012(-120);
        }
    }
}
