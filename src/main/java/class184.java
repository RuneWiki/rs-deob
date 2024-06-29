import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class184 extends class170 {

    @OriginalMember(owner = "client!hc", name = "kc", descriptor = "[Lge;")
    public static class163[] field2649 = new class163[0];

    @OriginalMember(owner = "client!hc", name = "lc", descriptor = "[Z")
    public static boolean[] field2650 = new boolean[112];

    @OriginalMember(owner = "client!hc", name = "xc", descriptor = "Ls;")
    public static class287 field2662 = new class287();

    @OriginalMember(owner = "client!hc", name = "zc", descriptor = "F")
    public static float field2664 = 128.0F;

    @OriginalMember(owner = "client!hc", name = "nc", descriptor = "F")
    public static float field2652;

    @OriginalMember(owner = "client!hc", name = "ic", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!hc", name = "jc", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!hc", name = "mc", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!hc", name = "oc", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!hc", name = "pc", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!hc", name = "qc", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!hc", name = "rc", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!hc", name = "tc", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!hc", name = "uc", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!hc", name = "vc", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!hc", name = "wc", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!hc", name = "yc", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!hc", name = "sc", descriptor = "Lve;")
    public class282 field2657;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "()I", line = 5)
    public final int method11() {
        field2648++;
        return this.field2398;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIIIJILid;)V", line = 16)
    public final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class274 arg10) {
        field2656++;
        if (this.field2657 == null) {
            return;
        }
        class247 var13 = this.field2435 != -1 && this.field2365 == 0 ? class185.method1289(this.field2435, (byte) 125) : null;
        class247 var14 = this.field2376 == -1 || this.field2376 == this.method1102((byte) -45).field2737 && var13 != null ? null : class185.method1289(this.field2376, (byte) 114);
        class201 var15 = this.field2657.method2015(this.field2405, var14, this.field2370, 128, this.field2364, this.field2425, this.field2363, var13, this.field2413, this.field2366);
        if (var15 == null) {
            return;
        }
        this.field2398 = var15.method11();
        class282 var16 = this.field2657;
        if (var16.field4401 != null) {
            var16 = var16.method2021((byte) 22);
        }
        if (class272.field4269 && var16.field4400) {
            class201 var17 = class37.method218(this.field2657.field4413, var14 == null ? var13 : var14, this.field2657.field4420, this.field2441, arg0, this.field2657.field4428, this.field2386, this.field2357, this.field2392, this.field2657.field4371, (byte) -81, var15, this.field2657.field4414, var14 == null ? this.field2425 : this.field2363);
            if (class250.field3787) {
                float var18 = class250.method1820();
                float var19 = class250.method1802();
                class250.method1827();
                class250.method1818(var18, var19 - 150.0F);
                var17.method8(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field2442);
                class250.method1791();
                class250.method1818(var18, var19);
            } else {
                var17.method8(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field2442);
            }
        }
        this.method1113(var15, 114);
        this.method1109(true, arg0, var15);
        class201 var20 = null;
        if (this.field2372 != -1 && this.field2449 != -1) {
            class159 var21 = class120.method818((byte) 96, this.field2372);
            var20 = var21.method1054(this.field2412, this.field2449, 3899, this.field2408);
            if (var20 != null) {
                var20.method688(0, -this.field2448, 0);
                if (var21.field2199) {
                    if (class162.field2228 != 0) {
                        var20.method700(class162.field2228);
                    }
                    if (class330.field5046 != 0) {
                        var20.method734(class330.field5046);
                    }
                    if (class291.field4570 != 0) {
                        var20.method688(0, class291.field4570, 0);
                    }
                }
            }
        }
        if (!class250.field3787) {
            if (var20 != null) {
                var15 = ((class333) var15).method2303(var20);
            }
            if (this.field2657.field4420 == 1) {
                var15.field2845 = true;
            }
            var15.method8(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2442);
            return;
        }
        if (this.field2657.field4420 == 1) {
            var15.field2845 = true;
        }
        var15.method8(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2442);
        if (var20 != null) {
            if (this.field2657.field4420 == 1) {
                var20.field2845 = true;
            }
            var20.method8(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2442);
        }
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(B)V", line = 133)
    public static final void method1276(byte arg0) {
        if (arg0 <= 115) {
            field2649 = (class163[]) null;
        }
        field2655++;
        class89.field1108.method1237((byte) -107);
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V", line = 144)
    public static void method1277(int arg0) {
        field2649 = null;
        if (arg0 == 28455) {
            field2650 = null;
            field2662 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(IIII)I", line = 167)
    public static final int method1278(int arg0, int arg1, int arg2, int arg3) {
        field2654++;
        if (class167.field2324 == null) {
            return 0;
        }
        if (arg1 != -13660) {
            method1279(116, (class107) null);
        }
        int var4 = arg3 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg0;
        int var7 = arg3 & 0x7F;
        if (arg0 < 3 && (class264.field4163[1][var4][var5] & 0x2) == 2) {
            var6 = arg0 + 1;
        }
        int var8 = arg2 & 0x7F;
        int var9 = (128 - var7) * class167.field2324[var6][var4][var5] + class167.field2324[var6][var4 + 1][var5] * var7 >> 7;
        int var10 = (128 - var7) * class167.field2324[var6][var4][var5 + 1] + class167.field2324[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILp;)V", line = 202)
    public static final void method1279(int arg0, class107 arg1) {
        field2647++;
        if (arg0 != 65535) {
            return;
        }
        for (int var2 = 0; var2 < class29.field367; var2++) {
            int var3 = arg1.method643(-14205);
            int var4 = arg1.method624(14612);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class175.field2507[var3] != null) {
                class175.field2507[var3].field2678 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(B)I", line = 235)
    public final int method751(byte arg0) {
        field2658++;
        if (arg0 < 23) {
            field2652 = -1.5816995F;
        }
        if (class249.field3769 != 0 && this.field2657.field4401 != null) {
            class282 var2 = this.field2657.method2021((byte) 22);
            if (var2 != null && var2.field4421 != -1) {
                return var2.field4421;
            }
        }
        return this.field2375;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Llc;I)V", line = 257)
    public static final void method1280(class175 arg0, int arg1) {
        field2653++;
        if (class19.field253) {
            return;
        }
        if (class250.field3787) {
            class306.method2153();
        } else {
            class144.method969();
        }
        class285.field4491 = class23.method153(arg0, true, class277.field4320);
        int var2 = class314.field4847;
        int var3 = arg1 * var2 / 503;
        class285.field4491.method539((class188.field2712 - var3) / 2, 0, var3, var2);
        class61.field752 = class319.method2225(109, arg0, class322.field4957);
        class61.field752.method1657(class188.field2712 / 2 - (class61.field752.field4743 / 2), 18);
        class19.field253 = true;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lve;I)V", line = 285)
    public final void method1281(class282 arg0, int arg1) {
        this.field2657 = arg0;
        if (this.field2442 != null) {
            this.field2442.method1977();
        }
        field2661++;
        if (arg1 != -24886) {
            field2650 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)V", line = 300)
    public final void method12(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2651++;
        if (this.field2657 == null) {
            ;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)Z", line = 314)
    public static final boolean method1282(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class247.field3733; var3++) {
            class342 var4 = class337.field5216[var3];
            if (var4.field5309 == 1) {
                int var5 = var4.field5322 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field5300 * var5 >> 8) + var4.field5318;
                    int var7 = (var4.field5308 * var5 >> 8) + var4.field5320;
                    int var8 = (var4.field5296 * var5 >> 8) + var4.field5319;
                    int var9 = (var4.field5298 * var5 >> 8) + var4.field5310;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field5309 == 2) {
                int var10 = arg0 - var4.field5322;
                if (var10 > 0) {
                    int var11 = (var4.field5300 * var10 >> 8) + var4.field5318;
                    int var12 = (var4.field5308 * var10 >> 8) + var4.field5320;
                    int var13 = (var4.field5296 * var10 >> 8) + var4.field5319;
                    int var14 = (var4.field5298 * var10 >> 8) + var4.field5310;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field5309 == 3) {
                int var15 = var4.field5318 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field5313 * var15 >> 8) + var4.field5322;
                    int var17 = (var4.field5299 * var15 >> 8) + var4.field5295;
                    int var18 = (var4.field5296 * var15 >> 8) + var4.field5319;
                    int var19 = (var4.field5298 * var15 >> 8) + var4.field5310;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field5309 == 4) {
                int var20 = arg2 - var4.field5318;
                if (var20 > 0) {
                    int var21 = (var4.field5313 * var20 >> 8) + var4.field5322;
                    int var22 = (var4.field5299 * var20 >> 8) + var4.field5295;
                    int var23 = (var4.field5296 * var20 >> 8) + var4.field5319;
                    int var24 = (var4.field5298 * var20 >> 8) + var4.field5310;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field5309 == 5) {
                int var25 = arg1 - var4.field5319;
                if (var25 > 0) {
                    int var26 = (var4.field5313 * var25 >> 8) + var4.field5322;
                    int var27 = (var4.field5299 * var25 >> 8) + var4.field5295;
                    int var28 = (var4.field5300 * var25 >> 8) + var4.field5318;
                    int var29 = (var4.field5308 * var25 >> 8) + var4.field5320;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)Z", line = 442)
    public final boolean method744(int arg0) {
        field2659++;
        if (this.field2657 == null) {
            return false;
        } else {
            if (arg0 != 8) {
                method1280((class175) null, -116);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hc", name = "finalize", descriptor = "()V", line = 459)
    protected final void finalize() {
        field2660++;
    }
}
