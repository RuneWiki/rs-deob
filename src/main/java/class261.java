import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class261 {

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field3604 = -1;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "[I")
    public static int[] field3602 = new int[14];

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field3605 = -1;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "[C")
    public static char[] field3607 = new char[128];

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V", line = 4)
    public static void method1641(int arg0) {
        field3607 = null;
        field3602 = null;
        if (arg0 != 1) {
            field3603 = 126;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lbo;IZ)V", line = 17)
    public static final void method1642(class433 arg0, int arg1, boolean arg2) {
        field3608++;
        class270 var3 = arg0.method2697((byte) 93);
        if (arg0.field6345 == 0) {
            arg0.field6339 = 0;
            class231.field3135 = 0;
            class384.field5623 = -1;
            return;
        }
        if (arg0.field6312 != -1 && arg0.field6250 == 0) {
            class182 var4 = class437.method2717(arg0.field6312, (byte) -103);
            if (arg0.field6353 > 0 && var4.field2505 == 0) {
                class384.field5623 = -1;
                arg0.field6339++;
                class231.field3135 = 0;
                return;
            }
            if (arg0.field6353 <= 0 && var4.field2508 == 0) {
                class231.field3135 = 0;
                class384.field5623 = -1;
                arg0.field6339++;
                return;
            }
        }
        if (arg0.field6256 != -1 && arg0.field6304 <= class221.field3033) {
            class377 var5 = class251.method1571(arg0.field6256, (byte) 90);
            if (var5.field5521 && var5.field5536 != -1) {
                class182 var6 = class437.method2717(var5.field5536, (byte) -103);
                if (arg0.field6353 > 0 && var6.field2505 == 0) {
                    arg0.field6339++;
                    class384.field5623 = -1;
                    class231.field3135 = 0;
                    return;
                }
                if (arg0.field6353 <= 0 && var6.field2508 == 0) {
                    class231.field3135 = 0;
                    arg0.field6339++;
                    class384.field5623 = -1;
                    return;
                }
            }
        }
        int var7 = arg0.field1304;
        int var8 = arg0.field1311;
        int var9 = arg0.field6351[arg0.field6345 - 1] * 128 + (arg0.method786((byte) 70) * 64);
        int var10 = arg0.field6350[arg0.field6345 - 1] * 128 + (arg0.method786((byte) 70) * 64);
        if (!arg2 && var9 - var7 > 256 || (var9 - var7) < -256 || var10 - var8 > 256 || var10 - var8 < -256) {
            arg0.field1311 = var10;
            class384.field5623 = -1;
            arg0.field1304 = var9;
            class231.field3135 = 0;
            return;
        }
        if (var9 <= var7) {
            if (var7 > var9) {
                if (var10 > var8) {
                    arg0.method2691(false, 6144);
                } else if (var10 >= var8) {
                    arg0.method2691(false, 4096);
                } else {
                    arg0.method2691(false, 2048);
                }
            } else if (var10 > var8) {
                arg0.method2691(false, 8192);
            } else if (var10 < var8) {
                arg0.method2691(false, 0);
            }
        } else if (var8 < var10) {
            arg0.method2691(false, 10240);
        } else if (var10 < var8) {
            arg0.method2691(false, 14336);
        } else {
            arg0.method2691(false, 12288);
        }
        int var11 = 4;
        boolean var12 = true;
        if (arg0 instanceof class358) {
            var12 = ((class358) arg0).field5229.field4925;
        }
        if (var12) {
            int var13 = arg0.field6330 - arg0.field6289.field6517;
            if (var13 != 0 && arg0.field6334 == -1 && arg0.field6307 != 0) {
                var11 = 2;
            }
            if (!arg2 && arg0.field6345 > 2) {
                var11 = 6;
            }
            if (!arg2 && arg0.field6345 > 3) {
                var11 = 8;
            }
        } else {
            if (!arg2 && arg0.field6345 > 1) {
                var11 = 6;
            }
            if (!arg2 && arg0.field6345 > 2) {
                var11 = 8;
            }
        }
        if (arg0.field6339 > 0 && arg0.field6345 > 1) {
            arg0.field6339--;
            var11 = 8;
        }
        byte var14 = arg0.field6352[arg0.field6345 - 1];
        if (var14 == 2) {
            var11 <<= 0x1;
        } else if (var14 == 0) {
            var11 >>= 0x1;
        }
        if (var3.field3792 != -1) {
            int var15 = var11 << 7;
            if (arg0.field6345 == 1) {
                int var16 = arg0.field6348 * arg0.field6348;
                int var17 = (arg0.field1304 > var9 ? arg0.field1304 - var9 : -arg0.field1304 + var9) << 7;
                int var18 = (arg0.field1311 <= var10 ? var10 - arg0.field1311 : arg0.field1311 - var10) << 7;
                int var19 = var18 >= var17 ? var18 : var17;
                int var20 = var19 * 2 * var3.field3792;
                if (var16 > var20) {
                    arg0.field6348 /= 2;
                } else if (var19 < var16 / 2) {
                    arg0.field6348 -= var3.field3792;
                    if (arg0.field6348 < 0) {
                        arg0.field6348 = 0;
                    }
                } else if (var15 > arg0.field6348) {
                    arg0.field6348 += var3.field3792;
                    if (var15 < arg0.field6348) {
                        arg0.field6348 = var15;
                    }
                }
            } else if (arg0.field6348 < var15) {
                arg0.field6348 += var3.field3792;
                if (var15 < arg0.field6348) {
                    arg0.field6348 = var15;
                }
            } else if (arg0.field6348 > 0) {
                arg0.field6348 -= var3.field3792;
                if (arg0.field6348 < 0) {
                    arg0.field6348 = 0;
                }
            }
            var11 = arg0.field6348 >> 7;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        class231.field3135 = 0;
        if (var9 > var7) {
            class231.field3135 |= 0x4;
            arg0.field1304 += var11;
            if (var9 < arg0.field1304) {
                arg0.field1304 = var9;
            }
        } else if (var7 > var9) {
            arg0.field1304 -= var11;
            class231.field3135 |= 0x8;
            if (arg0.field1304 < var9) {
                arg0.field1304 = var9;
            }
        }
        if (arg1 > -62) {
            return;
        }
        if (var10 > var8) {
            arg0.field1311 += var11;
            class231.field3135 |= 0x1;
            if (arg0.field1311 > var10) {
                arg0.field1311 = var10;
            }
        } else if (var8 > var10) {
            arg0.field1311 -= var11;
            class231.field3135 |= 0x2;
            if (arg0.field1311 < var10) {
                arg0.field1311 = var10;
            }
        }
        if (arg0.field1304 == var9 && arg0.field1311 == var10) {
            arg0.field6345--;
            if (arg0.field6353 > 0) {
                arg0.field6353--;
            }
        }
        if (var11 < 8) {
            class384.field5623 = var14;
        } else {
            class384.field5623 = 2;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)I", line = 340)
    public static final int method1643(int arg0, int arg1, int arg2) {
        field3606++;
        if (arg0 == 4 || arg0 == 5) {
            return class401.field5830[arg1 & 0x3];
        } else {
            if (arg2 != 2) {
                method1642((class433) null, -85, false);
            }
            return 256;
        }
    }
}
