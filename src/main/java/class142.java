import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class142 {

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public int field2523 = 99;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public int field2515 = 5;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public int field2530 = -1;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "Z")
    public boolean field2526 = false;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "Z")
    private boolean field2529 = false;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public int field2517 = 2;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "I")
    public int field2542 = -1;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public int field2524 = -1;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "I")
    public int field2541 = -1;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
    public int field2545 = -1;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field2525 = 0;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Lbd;")
    public static class162 field2521 = class17.method142(0, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "Z")
    public static boolean field2528 = false;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public static int field2537 = 0;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
    public static int field2543 = 99;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "[I")
    public int[] field2522;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "[I")
    public int[] field2527;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "[I")
    private int[] field2538;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "[I")
    private int[] field2540;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "[[I")
    public int[][] field2546;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 6)
    public final void method1105(int arg0) {
        if (this.field2524 == -1) {
            if (this.field2540 == null) {
                this.field2524 = 0;
            } else {
                this.field2524 = 2;
            }
        }
        if (arg0 > -113) {
            return;
        }
        if (this.field2542 == -1) {
            if (this.field2540 == null) {
                this.field2542 = 0;
            } else {
                this.field2542 = 2;
            }
        }
        field2531++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBLhi;)Lhi;", line = 45)
    public final class176 method1106(int arg0, byte arg1, class176 arg2) {
        int var4 = this.field2522[arg0];
        class54 var5 = class57.method399(55, var4 >> 16);
        field2544++;
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method88(true, true);
        }
        class176 var7 = arg2.method88(!var5.method385(var6, false), !this.field2529);
        if (arg1 <= 50) {
            return (class176) null;
        } else {
            var7.method92(var5, var6, this.field2529);
            return var7;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V", line = 73)
    public static final void method1107(int arg0) {
        int var1 = (class122.field2215.field5013 >> 7) + class178.field3052;
        class268.field4483 = 0;
        field2518++;
        if (arg0 != -9536) {
            method1116((byte) 14);
        }
        int var2 = (class122.field2215.field5047 >> 7) + class258.field4294;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class268.field4483 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class268.field4483 = 1;
        }
        if (class268.field4483 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class268.field4483 = 0;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(IBLhi;)Lhi;", line = 100)
    public final class176 method1108(int arg0, byte arg1, class176 arg2) {
        int var4 = this.field2522[arg0];
        if (arg1 >= 0) {
            this.method1114((byte) -105, 88, (class94) null);
        }
        field2532++;
        class54 var5 = class57.method399(114, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method74(true, true);
        } else {
            class176 var7 = arg2.method74(!var5.method385(var6, false), !this.field2529);
            var7.method92(var5, var6, this.field2529);
            return var7;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILeg;Lhi;II)Lhi;", line = 135)
    public final class176 method1109(int arg0, class142 arg1, class176 arg2, int arg3, int arg4) {
        int var6 = this.field2522[arg4];
        field2536++;
        class54 var7 = class57.method399(-66, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method1108(arg3, (byte) -45, arg2);
        }
        int var9 = arg1.field2522[arg3];
        class54 var10 = class57.method399(-74, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class176 var12 = arg2.method74(!var7.method385(var8, false), !this.field2529);
            var12.method92(var7, var8, this.field2529);
            return var12;
        } else {
            int var13 = 96 / ((arg0 + 61) / 51);
            class176 var14 = arg2.method74(!var7.method385(var8, false) & !var10.method385(var11, false), !this.field2529 & !arg1.field2529);
            var14.method66(var7, var8, var10, var11, this.field2540, this.field2529 | arg1.field2529);
            return var14;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZ)Z", line = 167)
    public static final boolean method1110(int arg0, boolean arg1) {
        if (!arg1) {
            method1107(87);
        }
        field2535++;
        return (arg0 & 0x2B972883) >> 29 != 0;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLb;)V", line = 187)
    public final void method1111(byte arg0, class94 arg1) {
        if (arg0 > -69) {
            this.field2545 = -69;
        }
        field2534++;
        while (true) {
            int var3 = arg1.method756(915905888);
            if (var3 == 0) {
                return;
            }
            this.method1114((byte) 67, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lbd;BI)V", line = 218)
    public static final void method1112(class162 arg0, byte arg1, int arg2) {
        class18.field296++;
        field2520++;
        class187.field3229.method338(163, (byte) 8);
        class187.field3229.method753(arg2, true);
        class187.field3229.method745(arg0.method1256(0), (byte) -124);
        if (arg1 != -34) {
            method1110(96, false);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILhi;II)Lhi;", line = 257)
    public final class176 method1113(int arg0, class176 arg1, int arg2, int arg3) {
        int var5 = this.field2522[arg0];
        field2539++;
        class54 var6 = class57.method399(-42, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method74(true, true);
        }
        if (arg3 <= 12) {
            this.field2522 = (int[]) null;
        }
        class176 var8 = arg1.method74(!var6.method385(var7, false), !this.field2529);
        int var9 = arg2 & 0x3;
        if (var9 == 1) {
            var8.method85();
        } else if (var9 == 2) {
            var8.method82();
        } else if (var9 == 3) {
            var8.method73();
        }
        var8.method92(var6, var7, this.field2529);
        if (var9 == 1) {
            var8.method73();
        } else if (var9 == 2) {
            var8.method82();
        } else if (var9 == 3) {
            var8.method85();
        }
        return var8;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BILb;)V", line = 306)
    private final void method1114(byte arg0, int arg1, class94 arg2) {
        if (arg1 == 1) {
            int var4 = arg2.method761((byte) 108);
            this.field2527 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2527[var5] = arg2.method761((byte) 108);
            }
            this.field2522 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2522[var6] = arg2.method761((byte) 108);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field2522[var7] = (arg2.method761((byte) 108) << 16) + this.field2522[var7];
            }
        } else if (arg1 == 2) {
            this.field2530 = arg2.method761((byte) 108);
        } else if (arg1 == 3) {
            int var15 = arg2.method756(915905888);
            this.field2540 = new int[var15 + 1];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field2540[var16] = arg2.method756(915905888);
            }
            this.field2540[var15] = 9999999;
        } else if (arg1 == 4) {
            this.field2526 = true;
        } else if (arg1 == 5) {
            this.field2515 = arg2.method756(arg0 + 915905821);
        } else if (arg1 == 6) {
            this.field2541 = arg2.method761((byte) 108);
        } else if (arg1 == 7) {
            this.field2545 = arg2.method761((byte) 108);
        } else if (arg1 == 8) {
            this.field2523 = arg2.method756(915905888);
        } else if (arg1 == 9) {
            this.field2542 = arg2.method756(915905888);
        } else if (arg1 == 10) {
            this.field2524 = arg2.method756(915905888);
        } else if (arg1 == 11) {
            this.field2517 = arg2.method756(915905888);
        } else if (arg1 == 12) {
            int var12 = arg2.method756(arg0 + 915905821);
            this.field2538 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2538[var13] = arg2.method761((byte) 108);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field2538[var14] = (arg2.method761((byte) 108) << 16) + this.field2538[var14];
            }
        } else if (arg1 == 13) {
            int var8 = arg2.method761((byte) 108);
            this.field2546 = new int[var8][];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method756(915905888);
                if (var10 > 0) {
                    this.field2546[var9] = new int[var10];
                    this.field2546[var9][0] = arg2.method732(arg0 - 68);
                    for (int var11 = 1; var11 < var10; var11++) {
                        this.field2546[var9][var11] = arg2.method761((byte) 108);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field2529 = true;
        }
        if (arg0 == 67) {
            field2533++;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILhi;I)Lhi;", line = 461)
    public final class176 method1115(int arg0, class176 arg1, int arg2) {
        field2516++;
        if (arg2 != -1687129200) {
            this.method1113(-10, (class176) null, -62, -24);
        }
        int var4 = this.field2522[arg0];
        class54 var5 = class57.method399(-108, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method74(true, true);
        }
        int var7 = 0;
        class54 var8 = null;
        if (this.field2538 != null && arg0 < this.field2538.length) {
            int var9 = this.field2538[arg0];
            var8 = class57.method399(124, var9 >> 16);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class176 var11 = arg1.method74(!var5.method385(var6, false), !this.field2529);
            var11.method92(var5, var6, this.field2529);
            return var11;
        } else {
            class176 var10 = arg1.method74(!var5.method385(var6, false) & !var8.method385(var7, false), !this.field2529);
            var10.method92(var5, var6, this.field2529);
            var10.method92(var8, var7, this.field2529);
            return var10;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 514)
    public static void method1116(byte arg0) {
        field2521 = null;
        if (arg0 != 1) {
            field2537 = -21;
        }
    }
}
