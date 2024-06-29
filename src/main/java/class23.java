import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class23 {

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    private int field468;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "[[I")
    public int[][] field457;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "Lsc;")
    public static class128 field481 = class129.method1017(false, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!da", name = "v", descriptor = "Lsc;")
    public static class128 field478 = class129.method1017(false, "<col=ffffff>");

    @OriginalMember(owner = "client!da", name = "c", descriptor = "[I")
    public static int[] field459 = new int[5];

    @OriginalMember(owner = "client!da", name = "k", descriptor = "Lsc;")
    public static class128 field467 = class129.method1017(false, "headicons_prayer");

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!da", name = "B", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "Lsf;")
    public static class131 field477;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "Z")
    public static boolean field469;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "[Lad;")
    public static class5[] field475;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method198(int arg0) {
        field481 = null;
        field477 = null;
        field459 = null;
        field475 = null;
        field467 = null;
        if (arg0 != 1) {
            field475 = null;
        }
        field478 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIIIIIII)Z")
    public final boolean method199(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != 106) {
            field477 = null;
        }
        field466++;
        int var9 = arg3 + arg5 - 1;
        int var10 = arg1 + arg6 - 1;
        if (arg5 <= arg7 && var9 >= arg7 && arg6 <= arg2 && var10 >= arg2) {
            return true;
        } else if (arg5 - 1 == arg7 && arg2 >= arg6 && var10 >= arg2 && (this.field457[arg7 - this.field476][arg2 - this.field483] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg7 && arg2 >= arg6 && var10 >= arg2 && (this.field457[arg7 - this.field476][arg2 - this.field483] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if (arg6 - 1 == arg2 && arg7 >= arg5 && arg7 <= var9 && (this.field457[arg7 - this.field476][arg2 - this.field483] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg2 && arg7 >= arg5 && arg7 <= var9 && (this.field457[arg7 - this.field476][arg2 - this.field483] & 0x20) == 0 && (arg4 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field471++;
        if (arg4 == arg6 && arg3 == arg5) {
            return true;
        }
        int var8 = arg5 - this.field483;
        int var9 = arg4 - this.field476;
        int var10 = arg6 - this.field476;
        int var11 = arg3 - this.field483;
        if (arg1 == 0) {
            if (arg0 == 0) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field457[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field457[var9][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var10 - 1 == var9 && var8 == var11 && (this.field457[var9][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field457[var9][var11] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field457[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field457[var9][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
                if (var10 - 1 == var9 && var8 == var11 && (this.field457[var9][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field457[var9][var11] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field457[var9][var11] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field457[var9][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var10 - 1 == var9 && var8 == var11 && (this.field457[var9][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field457[var9][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 - 1 == var9 && var8 == var11 && (this.field457[var9][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field457[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field457[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field457[var9][var11] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
            }
        }
        if (arg2 != 0) {
            return true;
        }
        if (arg1 == 9) {
            if (var9 == var10 && var8 + 1 == var11 && (this.field457[var9][var11] & 0x20) == 0) {
                return true;
            }
            if (var9 == var10 && var8 - 1 == var11 && (this.field457[var9][var11] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var9 && var8 == var11 && (this.field457[var9][var11] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var9 && var8 == var11 && (this.field457[var9][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIIIIII)Z")
    public final boolean method201(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field470++;
        if (arg2 == arg6 && arg1 == arg5) {
            return true;
        }
        int var8 = arg1 - this.field483;
        int var9 = arg2 - this.field476;
        int var10 = arg5 - this.field483;
        if (arg0 > -34) {
            this.method204((byte) -76, -34, -19);
        }
        int var11 = arg6 - this.field476;
        if (arg4 == 6 || arg4 == 7) {
            if (arg4 == 7) {
                arg3 = arg3 + 2 & 0x3;
            }
            if (arg3 == 0) {
                if (var11 + 1 == var9 && var8 == var10 && (this.field457[var9][var10] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10 && (this.field457[var9][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var11 - 1 == var9 && var8 == var10 && (this.field457[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10 && (this.field457[var9][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var11 - 1 == var9 && var8 == var10 && (this.field457[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10 && (this.field457[var9][var10] & 0x20) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var11 + 1 == var9 && var8 == var10 && (this.field457[var9][var10] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10 && (this.field457[var9][var10] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 8) {
            if (var9 == var11 && var8 + 1 == var10 && (this.field457[var9][var10] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var8 - 1 == var10 && (this.field457[var9][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var9 && var8 == var10 && (this.field457[var9][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var9 && var8 == var10 && (this.field457[var9][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
    private final void method202(int arg0, int arg1, int arg2, int arg3) {
        field480++;
        this.field457[arg1][arg0] = class25.method224(this.field457[arg1][arg0], ~arg2);
        if (arg3 <= 108) {
            this.method200(-111, -102, 104, -46, -115, -99, 65);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILbe;ILda;I)V")
    public static final void method203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class13 arg6, int arg7, class23 arg8, int arg9) {
        field464++;
        class94 var10 = class147.method1185(-2, arg4);
        int var11;
        int var12;
        if (arg5 == 1 || arg5 == 3) {
            var11 = var10.field2195;
            var12 = var10.field2166;
        } else {
            var11 = var10.field2166;
            var12 = var10.field2195;
        }
        int var13;
        int var14;
        if (arg3 + var11 <= 104) {
            var13 = (var11 + 1 >> 1) + arg3;
            var14 = (var11 >> 1) + arg3;
        } else {
            var13 = arg3 + 1;
            var14 = arg3;
        }
        int var15;
        int var16;
        if (arg7 + var12 <= 104) {
            var15 = (var12 + 1 >> 1) + arg7;
            var16 = (var12 >> 1) + arg7;
        } else {
            var15 = arg7 + 1;
            var16 = arg7;
        }
        int[][] var17 = class55.field1229[arg2];
        int var18 = var17[var13][var16] + var17[var14][var16] + var17[var14][var15] + var17[var13][var15] >> 2;
        int var19 = (arg7 << 7) + (var12 << 6);
        int var20 = (arg3 << 7) + (var11 << 6);
        int var21 = (arg5 << 6) + arg9;
        if (var10.field2149 == 1) {
            var21 += 256;
        }
        int var22 = arg3 + (arg7 << 7) + (arg4 << 14) + 1073741824;
        if (var10.field2203 == 0) {
            var22 += Integer.MIN_VALUE;
        }
        if (arg9 == 22) {
            class156 var23;
            if (var10.field2183 == -1 && var10.field2164 == null) {
                var23 = var10.method740(var18, var17, (byte) 23, var19, var20, 22, arg5);
            } else {
                var23 = new class40(arg4, 22, arg5, arg2, arg3, arg7, var10.field2183, true, null);
            }
            arg6.method126(arg1, arg3, arg7, var18, var23, var22, var21);
            if (var10.field2196 == 1) {
                arg8.method212(arg7, arg3, false);
            }
        } else if (arg9 == 10 || arg9 == 11) {
            class156 var47;
            if (var10.field2183 == -1 && var10.field2164 == null) {
                var47 = var10.method740(var18, var17, (byte) 23, var19, var20, 10, arg5);
            } else {
                var47 = new class40(arg4, 10, arg5, arg2, arg3, arg7, var10.field2183, true, null);
            }
            if (var47 != null) {
                arg6.method111(arg1, arg3, arg7, var18, var11, var12, var47, arg9 == 11 ? 256 : 0, var22, var21);
            }
            if (var10.field2196 != 0) {
                arg8.method214(8, var12, arg3, var11, arg7, var10.field2191);
            }
        } else if (arg9 >= 12) {
            class156 var24;
            if (var10.field2183 == -1 && var10.field2164 == null) {
                var24 = var10.method740(var18, var17, (byte) 23, var19, var20, arg9, arg5);
            } else {
                var24 = new class40(arg4, arg9, arg5, arg2, arg3, arg7, var10.field2183, true, null);
            }
            arg6.method111(arg1, arg3, arg7, var18, 1, 1, var24, 0, var22, var21);
            if (var10.field2196 != 0) {
                arg8.method214(8, var12, arg3, var11, arg7, var10.field2191);
            }
        } else if (arg9 == 0) {
            class156 var25;
            if (var10.field2183 == -1 && var10.field2164 == null) {
                var25 = var10.method740(var18, var17, (byte) 23, var19, var20, 0, arg5);
            } else {
                var25 = new class40(arg4, 0, arg5, arg2, arg3, arg7, var10.field2183, true, null);
            }
            arg6.method112(arg1, arg3, arg7, var18, var25, null, class90.field2061[arg5], 0, var22, var21);
            if (var10.field2196 != 0) {
                arg8.method209(arg3, arg7, arg5, (byte) -126, arg9, var10.field2191);
            }
        } else if (arg9 == 1) {
            class156 var26;
            if (var10.field2183 == -1 && var10.field2164 == null) {
                var26 = var10.method740(var18, var17, (byte) 23, var19, var20, 1, arg5);
            } else {
                var26 = new class40(arg4, 1, arg5, arg2, arg3, arg7, var10.field2183, true, null);
            }
            arg6.method112(arg1, arg3, arg7, var18, var26, null, class117.field2624[arg5], 0, var22, var21);
            if (var10.field2196 != 0) {
                arg8.method209(arg3, arg7, arg5, (byte) -126, arg9, var10.field2191);
            }
        } else if (arg9 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class156 var28;
            class156 var29;
            if (var10.field2183 == -1 && var10.field2164 == null) {
                var28 = var10.method740(var18, var17, (byte) 23, var19, var20, 2, arg5 + 4);
                var29 = var10.method740(var18, var17, (byte) 23, var19, var20, 2, var27);
            } else {
                var28 = new class40(arg4, 2, arg5 + 4, arg2, arg3, arg7, var10.field2183, true, null);
                var29 = new class40(arg4, 2, var27, arg2, arg3, arg7, var10.field2183, true, null);
            }
            arg6.method112(arg1, arg3, arg7, var18, var28, var29, class90.field2061[arg5], class90.field2061[var27], var22, var21);
            if (var10.field2196 != 0) {
                arg8.method209(arg3, arg7, arg5, (byte) -126, arg9, var10.field2191);
            }
        } else {
            int var30 = -71 % ((arg0 - 61) / 35);
            if (arg9 == 3) {
                class156 var31;
                if (var10.field2183 == -1 && var10.field2164 == null) {
                    var31 = var10.method740(var18, var17, (byte) 23, var19, var20, 3, arg5);
                } else {
                    var31 = new class40(arg4, 3, arg5, arg2, arg3, arg7, var10.field2183, true, null);
                }
                arg6.method112(arg1, arg3, arg7, var18, var31, null, class117.field2624[arg5], 0, var22, var21);
                if (var10.field2196 != 0) {
                    arg8.method209(arg3, arg7, arg5, (byte) -126, arg9, var10.field2191);
                }
            } else if (arg9 == 9) {
                class156 var32;
                if (var10.field2183 == -1 && var10.field2164 == null) {
                    var32 = var10.method740(var18, var17, (byte) 23, var19, var20, arg9, arg5);
                } else {
                    var32 = new class40(arg4, arg9, arg5, arg2, arg3, arg7, var10.field2183, true, null);
                }
                arg6.method111(arg1, arg3, arg7, var18, 1, 1, var32, 0, var22, var21);
                if (var10.field2196 != 0) {
                    arg8.method214(8, var12, arg3, var11, arg7, var10.field2191);
                }
            } else if (arg9 == 4) {
                class156 var33;
                if (var10.field2183 == -1 && var10.field2164 == null) {
                    var33 = var10.method740(var18, var17, (byte) 23, var19, var20, 4, arg5);
                } else {
                    var33 = new class40(arg4, 4, arg5, arg2, arg3, arg7, var10.field2183, true, null);
                }
                arg6.method133(arg1, arg3, arg7, var18, var33, null, class90.field2061[arg5], 0, 0, 0, var22, var21);
            } else if (arg9 == 5) {
                int var34 = 16;
                int var35 = arg6.method128(arg1, arg3, arg7);
                if (var35 != 0) {
                    var34 = class147.method1185(-2, var35 >> 14 & 0x7FFF).field2201;
                }
                class156 var36;
                if (var10.field2183 == -1 && var10.field2164 == null) {
                    var36 = var10.method740(var18, var17, (byte) 23, var19, var20, 4, arg5);
                } else {
                    var36 = new class40(arg4, 4, arg5, arg2, arg3, arg7, var10.field2183, true, null);
                }
                arg6.method133(arg1, arg3, arg7, var18, var36, null, class90.field2061[arg5], 0, class110.field2480[arg5] * var34, class125.field2843[arg5] * var34, var22, var21);
            } else if (arg9 == 6) {
                int var37 = 8;
                int var38 = arg6.method128(arg1, arg3, arg7);
                if (var38 != 0) {
                    var37 = class147.method1185(-2, var38 >> 14 & 0x7FFF).field2201 / 2;
                }
                class156 var39;
                if (var10.field2183 == -1 && var10.field2164 == null) {
                    var39 = var10.method740(var18, var17, (byte) 23, var19, var20, 4, arg5 + 4);
                } else {
                    var39 = new class40(arg4, 4, arg5 + 4, arg2, arg3, arg7, var10.field2183, true, null);
                }
                arg6.method133(arg1, arg3, arg7, var18, var39, null, 256, arg5, class105.field2378[arg5] * var37, class62.field1338[arg5] * var37, var22, var21);
            } else if (arg9 == 7) {
                int var40 = arg5 + 2 & 0x3;
                class156 var41;
                if (var10.field2183 == -1 && var10.field2164 == null) {
                    var41 = var10.method740(var18, var17, (byte) 23, var19, var20, 4, var40 + 4);
                } else {
                    var41 = new class40(arg4, 4, var40 + 4, arg2, arg3, arg7, var10.field2183, true, null);
                }
                arg6.method133(arg1, arg3, arg7, var18, var41, null, 256, var40, 0, 0, var22, var21);
            } else if (arg9 == 8) {
                int var42 = 8;
                int var43 = arg6.method128(arg1, arg3, arg7);
                if (var43 != 0) {
                    var42 = class147.method1185(-2, var43 >> 14 & 0x7FFF).field2201 / 2;
                }
                int var44 = arg5 + 2 & 0x3;
                class156 var45;
                class156 var46;
                if (var10.field2183 == -1 && var10.field2164 == null) {
                    var45 = var10.method740(var18, var17, (byte) 23, var19, var20, 4, arg5 + 4);
                    var46 = var10.method740(var18, var17, (byte) 23, var19, var20, 4, var44 + 4);
                } else {
                    var45 = new class40(arg4, 4, arg5 + 4, arg2, arg3, arg7, var10.field2183, true, null);
                    var46 = new class40(arg4, 4, var44 + 4, arg2, arg3, arg7, var10.field2183, true, null);
                }
                arg6.method133(arg1, arg3, arg7, var18, var45, var46, 256, arg5, class105.field2378[arg5] * var42, class62.field1338[arg5] * var42, var22, var21);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)V")
    public final void method204(byte arg0, int arg1, int arg2) {
        field484++;
        int var4 = arg2 - this.field476;
        int var5 = arg1 - this.field483;
        this.field457[var4][var5] = class25.method224(this.field457[var4][var5], -262145);
        if (arg0 != 41) {
            method203(-109, -41, 93, -2, -49, 44, null, -29, null, 117);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBIZII)V")
    public final void method205(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field482++;
        if (arg1 != 93) {
            this.method214(111, -71, 70, -48, 85, false);
        }
        int var7 = arg5 - this.field483;
        int var8 = arg0 - this.field476;
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method202(var7, var8, 128, arg1 ^ 0x29);
                this.method202(var7, var8 - 1, 8, 119);
            }
            if (arg4 == 1) {
                this.method202(var7, var8, 2, 113);
                this.method202(var7 + 1, var8, 32, 109);
            }
            if (arg4 == 2) {
                this.method202(var7, var8, 8, 123);
                this.method202(var7, var8 + 1, 128, arg1 ^ 0x32);
            }
            if (arg4 == 3) {
                this.method202(var7, var8, 32, 118);
                this.method202(var7 - 1, var8, 2, 110);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method202(var7, var8, 1, 110);
                this.method202(var7 + 1, var8 + -1, 16, 119);
            }
            if (arg4 == 1) {
                this.method202(var7, var8, 4, 117);
                this.method202(var7 + 1, var8 + 1, 64, 112);
            }
            if (arg4 == 2) {
                this.method202(var7, var8, 16, arg1 + 19);
                this.method202(var7 - 1, var8 + 1, 1, arg1 ^ 0x2B);
            }
            if (arg4 == 3) {
                this.method202(var7, var8, 64, 125);
                this.method202(var7 - 1, var8 + -1, 4, 125);
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                this.method202(var7, var8, 130, arg1 ^ 0x24);
                this.method202(var7, var8 - 1, 8, 121);
                this.method202(var7 + 1, var8, 32, 120);
            }
            if (arg4 == 1) {
                this.method202(var7, var8, 10, 125);
                this.method202(var7 + 1, var8, 32, 125);
                this.method202(var7, var8 + 1, 128, 123);
            }
            if (arg4 == 2) {
                this.method202(var7, var8, 40, 116);
                this.method202(var7, var8 + 1, 128, 127);
                this.method202(var7 - 1, var8, 2, 127);
            }
            if (arg4 == 3) {
                this.method202(var7, var8, 160, 125);
                this.method202(var7 - 1, var8, 2, 115);
                this.method202(var7, var8 - 1, 8, 113);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method202(var7, var8, 65536, 121);
                this.method202(var7, var8 - 1, 4096, arg1 ^ 0x26);
            }
            if (arg4 == 1) {
                this.method202(var7, var8, 1024, 123);
                this.method202(var7 + 1, var8, 16384, 110);
            }
            if (arg4 == 2) {
                this.method202(var7, var8, 4096, 125);
                this.method202(var7, var8 + 1, 65536, 113);
            }
            if (arg4 == 3) {
                this.method202(var7, var8, 16384, arg1 ^ 0x29);
                this.method202(var7 - 1, var8, 1024, 110);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method202(var7, var8, 512, 127);
                this.method202(var7 + 1, var8 + -1, 8192, arg1 + 30);
            }
            if (arg4 == 1) {
                this.method202(var7, var8, 2048, 122);
                this.method202(var7 + 1, var8 + 1, 32768, arg1 ^ 0x25);
            }
            if (arg4 == 2) {
                this.method202(var7, var8, 8192, 109);
                this.method202(var7 - 1, var8 + 1, 512, arg1 + 20);
            }
            if (arg4 == 3) {
                this.method202(var7, var8, 32768, arg1 ^ 0x25);
                this.method202(var7 - 1, var8 + -1, 2048, 122);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method202(var7, var8, 66560, 119);
            this.method202(var7, var8 - 1, 4096, 122);
            this.method202(var7 + 1, var8, 16384, 111);
        }
        if (arg4 == 1) {
            this.method202(var7, var8, 5120, arg1 + 33);
            this.method202(var7 + 1, var8, 16384, 112);
            this.method202(var7, var8 + 1, 65536, arg1 + 27);
        }
        if (arg4 == 2) {
            this.method202(var7, var8, 20480, 112);
            this.method202(var7, var8 + 1, 65536, 111);
            this.method202(var7 - 1, var8, 1024, 125);
        }
        if (arg4 == 3) {
            this.method202(var7, var8, 81920, 118);
            this.method202(var7 - 1, var8, 1024, 115);
            this.method202(var7, var8 - 1, 4096, arg1 + 20);
            return;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V")
    public static final void method206(int arg0, int arg1) {
        field458++;
        if (class14.field282 == arg1) {
            return;
        }
        if (class14.field282 == 0) {
            class143.method1167(-111);
        }
        if (arg0 == arg1 || arg1 == 40) {
            class21.field400 = 0;
            class158.field3637 = 0;
            class151.field3465 = 0;
        }
        if (arg1 != 20 && arg1 != 40 && class106.field2417 != null) {
            class106.field2417.method502((byte) -1);
            class106.field2417 = null;
        }
        if (class14.field282 == 25) {
            class147.field3402 = 1;
            class49.field876 = 0;
            class27.field529 = 1;
            class89.field2034 = 0;
            client.field428 = 0;
        }
        if (arg1 == 5 || arg1 == 10 || arg1 == 20) {
            class106.method790(class12.field205, class127.field2888, 32768, class135.field3184);
        } else {
            class102.method770(-27784);
        }
        class14.field282 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)Z")
    public static final boolean method207(byte arg0) {
        field465++;
        class111 var1 = class141.field3302;
        synchronized (class141.field3302) {
            if (class148.field3418 == class121.field2744) {
                return false;
            }
            class2.field19 = class94.field2204[class148.field3418];
            class30.field565 = class132.field3052[class148.field3418];
            if (arg0 != 102) {
                field481 = null;
            }
            class148.field3418 = class148.field3418 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IIII)V")
    private final void method208(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= -53) {
            field459 = null;
        }
        field479++;
        this.field457[arg2][arg0] = class97.method751(this.field457[arg2][arg0], arg3);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIBIZ)V")
    public final void method209(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5) {
        if (arg3 != -126) {
            return;
        }
        int var7 = arg1 - this.field483;
        field462++;
        int var8 = arg0 - this.field476;
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method208(var7, -89, var8, 128);
                this.method208(var7, arg3 ^ 0x22, var8 - 1, 8);
            }
            if (arg2 == 1) {
                this.method208(var7, -69, var8, 2);
                this.method208(var7 + 1, -76, var8, 32);
            }
            if (arg2 == 2) {
                this.method208(var7, -70, var8, 8);
                this.method208(var7, -106, var8 + 1, 128);
            }
            if (arg2 == 3) {
                this.method208(var7, -91, var8, 32);
                this.method208(var7 - 1, -72, var8, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method208(var7, -125, var8, 1);
                this.method208(var7 + 1, -79, var8 - 1, 16);
            }
            if (arg2 == 1) {
                this.method208(var7, arg3 + 26, var8, 4);
                this.method208(var7 + 1, -105, var8 + 1, 64);
            }
            if (arg2 == 2) {
                this.method208(var7, -61, var8, 16);
                this.method208(var7 - 1, arg3 ^ 0x43, var8 + 1, 1);
            }
            if (arg2 == 3) {
                this.method208(var7, -121, var8, 64);
                this.method208(var7 - 1, -102, var8 - 1, 4);
            }
        }
        if (arg4 == 2) {
            if (arg2 == 0) {
                this.method208(var7, -122, var8, 130);
                this.method208(var7, -58, var8 - 1, 8);
                this.method208(var7 + 1, -90, var8, 32);
            }
            if (arg2 == 1) {
                this.method208(var7, -118, var8, 10);
                this.method208(var7 + 1, arg3 + 45, var8, 32);
                this.method208(var7, -98, var8 + 1, 128);
            }
            if (arg2 == 2) {
                this.method208(var7, arg3 - 1, var8, 40);
                this.method208(var7, -59, var8 + 1, 128);
                this.method208(var7 - 1, -59, var8, 2);
            }
            if (arg2 == 3) {
                this.method208(var7, -81, var8, 160);
                this.method208(var7 - 1, -70, var8, 2);
                this.method208(var7, -98, var8 - 1, 8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method208(var7, -72, var8, 65536);
                this.method208(var7, -124, var8 - 1, 4096);
            }
            if (arg2 == 1) {
                this.method208(var7, -74, var8, 1024);
                this.method208(var7 + 1, -74, var8, 16384);
            }
            if (arg2 == 2) {
                this.method208(var7, -119, var8, 4096);
                this.method208(var7, -121, var8 + 1, 65536);
            }
            if (arg2 == 3) {
                this.method208(var7, -67, var8, 16384);
                this.method208(var7 - 1, arg3 + 22, var8, 1024);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method208(var7, -85, var8, 512);
                this.method208(var7 + 1, -123, var8 - 1, 8192);
            }
            if (arg2 == 1) {
                this.method208(var7, -84, var8, 2048);
                this.method208(var7 + 1, arg3 + 65, var8 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method208(var7, -70, var8, 8192);
                this.method208(var7 - 1, arg3 ^ 0x1B, var8 + 1, 512);
            }
            if (arg2 == 3) {
                this.method208(var7, -62, var8, 32768);
                this.method208(var7 - 1, -91, var8 - 1, 2048);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method208(var7, -113, var8, 66560);
            this.method208(var7, -104, var8 - 1, 4096);
            this.method208(var7 + 1, -61, var8, 16384);
        }
        if (arg2 == 1) {
            this.method208(var7, -72, var8, 5120);
            this.method208(var7 + 1, -84, var8, 16384);
            this.method208(var7, -75, var8 + 1, 65536);
        }
        if (arg2 == 2) {
            this.method208(var7, arg3 ^ 0x17, var8, 20480);
            this.method208(var7, -118, var8 + 1, 65536);
            this.method208(var7 - 1, -71, var8, 1024);
        }
        if (arg2 == 3) {
            this.method208(var7, -97, var8, 81920);
            this.method208(var7 - 1, -64, var8, 1024);
            this.method208(var7, arg3 + 4, var8 + -1, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V")
    public static final void method210(byte arg0) {
        class79.field1770 = 0;
        field485++;
        if (arg0 <= 64) {
            method206(18, -31);
        }
        int var1 = (class151.field3473.field975 >> 7) + class62.field1325;
        int var2 = (class151.field3473.field987 >> 7) + class66.field1482;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class79.field1770 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class79.field1770 = 1;
        }
        if (class79.field1770 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class79.field1770 = 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public final void method211(int arg0) {
        field474++;
        if (arg0 != 128) {
            this.method199((byte) -107, -80, 73, -109, 28, 13, -109, -65);
        }
        for (int var2 = 0; var2 < this.field460; var2++) {
            for (int var3 = 0; var3 < this.field468; var3++) {
                if (var2 == 0 || var3 == 0 || this.field460 - 5 <= var2 || this.field468 - 5 <= var3) {
                    this.field457[var2][var3] = 16777215;
                } else {
                    this.field457[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZ)V")
    public final void method212(int arg0, int arg1, boolean arg2) {
        field472++;
        int var4 = arg0 - this.field483;
        int var5 = arg1 - this.field476;
        this.field457[var5][var4] = class97.method751(this.field457[var5][var4], 262144);
        if (arg2) {
            method210((byte) 122);
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(II)V")
    public class23(int arg0, int arg1) {
        this.field460 = arg0;
        this.field483 = 0;
        this.field476 = 0;
        this.field468 = arg1;
        this.field457 = new int[this.field460][this.field468];
        this.method211(128);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)V")
    public final void method213(int arg0, int arg1, byte arg2) {
        int var4 = -49 / ((arg2 - 76) / 50);
        field486++;
        int var5 = arg0 - this.field476;
        int var6 = arg1 - this.field483;
        this.field457[var5][var6] = class97.method751(this.field457[var5][var6], 2097152);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIZ)V")
    public final void method214(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field473++;
        int var7 = arg2 - this.field476;
        int var8 = arg4 - this.field483;
        int var9 = 256;
        if (arg5) {
            var9 += 131072;
        }
        int var10 = var7;
        if (arg0 != 8) {
            this.field457 = null;
        }
        while (arg3 + var7 > var10) {
            if (var10 >= 0 && var10 < this.field460) {
                for (int var11 = var8; var11 < arg1 + var8; var11++) {
                    if (var11 >= 0 && var11 < this.field468) {
                        this.method208(var11, arg0 ^ 0xFFFFFF8E, var10, var9);
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIIIIII)V")
    public final void method215(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 0) {
            field459 = null;
        }
        field463++;
        int var8 = arg1 - this.field476;
        int var9 = 256;
        if (arg6 == 1 || arg6 == 3) {
            int var10 = arg5;
            arg5 = arg3;
            arg3 = var10;
        }
        if (arg0) {
            var9 += 131072;
        }
        int var11 = arg4 - this.field483;
        for (int var12 = var8; var12 < arg5 + var8; var12++) {
            if (var12 >= 0 && this.field460 > var12) {
                for (int var13 = var11; var13 < arg3 + var11; var13++) {
                    if (var13 >= 0 && this.field468 > var13) {
                        this.method202(var13, var12, var9, 122);
                    }
                }
            }
        }
    }
}
