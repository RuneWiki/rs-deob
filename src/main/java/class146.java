import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class146 extends class171 {

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "I")
    public int field2514 = 0;

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "Z")
    private boolean field2524 = false;

    @OriginalMember(owner = "client!ll", name = "R", descriptor = "I")
    public int field2535 = 0;

    @OriginalMember(owner = "client!ll", name = "eb", descriptor = "B")
    private byte field2548 = 0;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "[I")
    public int[] field2507;

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "[I")
    public int[] field2518;

    @OriginalMember(owner = "client!ll", name = "db", descriptor = "[I")
    public int[] field2547;

    @OriginalMember(owner = "client!ll", name = "X", descriptor = "[I")
    public int[] field2541;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "[I")
    public int[] field2510;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "[I")
    public int[] field2504;

    @OriginalMember(owner = "client!ll", name = "V", descriptor = "[I")
    public int[] field2539;

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "[B")
    public byte[] field2528;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "[B")
    public byte[] field2508;

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "[B")
    public byte[] field2516;

    @OriginalMember(owner = "client!ll", name = "ib", descriptor = "[S")
    public short[] field2552;

    @OriginalMember(owner = "client!ll", name = "P", descriptor = "[S")
    public short[] field2533;

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "[B")
    public byte[] field2515;

    @OriginalMember(owner = "client!ll", name = "H", descriptor = "[I")
    public int[] field2526;

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "[B")
    public byte[] field2527;

    @OriginalMember(owner = "client!ll", name = "M", descriptor = "[S")
    public short[] field2530;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "[S")
    public short[] field2505;

    @OriginalMember(owner = "client!ll", name = "O", descriptor = "[S")
    public short[] field2532;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "[S")
    public short[] field2513;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "[S")
    public short[] field2509;

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "[S")
    public short[] field2529;

    @OriginalMember(owner = "client!ll", name = "B", descriptor = "[B")
    public byte[] field2520;

    @OriginalMember(owner = "client!ll", name = "Y", descriptor = "[B")
    public byte[] field2542;

    @OriginalMember(owner = "client!ll", name = "N", descriptor = "[B")
    public byte[] field2531;

    @OriginalMember(owner = "client!ll", name = "fb", descriptor = "[B")
    public byte[] field2549;

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "[B")
    public byte[] field2525;

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
    public int field2517;

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "[I")
    private static int[] field2512 = new int[10000];

    @OriginalMember(owner = "client!ll", name = "W", descriptor = "[I")
    private static int[] field2540 = class21.field286;

    @OriginalMember(owner = "client!ll", name = "T", descriptor = "[I")
    private static int[] field2537 = new int[10000];

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "[I")
    private static int[] field2523 = class21.field288;

    @OriginalMember(owner = "client!ll", name = "cb", descriptor = "I")
    private static int field2546 = 0;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "S")
    private short field2506;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "S")
    private short field2511;

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "S")
    private short field2521;

    @OriginalMember(owner = "client!ll", name = "D", descriptor = "S")
    private short field2522;

    @OriginalMember(owner = "client!ll", name = "S", descriptor = "S")
    private short field2536;

    @OriginalMember(owner = "client!ll", name = "U", descriptor = "S")
    private short field2538;

    @OriginalMember(owner = "client!ll", name = "bb", descriptor = "S")
    private short field2545;

    @OriginalMember(owner = "client!ll", name = "hb", descriptor = "S")
    private short field2551;

    @OriginalMember(owner = "client!ll", name = "Q", descriptor = "[Lfl;")
    public class213[] field2534;

    @OriginalMember(owner = "client!ll", name = "ab", descriptor = "[Lfl;")
    public class213[] field2544;

    @OriginalMember(owner = "client!ll", name = "Z", descriptor = "[Lik;")
    public class244[] field2543;

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "[[I")
    public int[][] field2519;

    @OriginalMember(owner = "client!ll", name = "gb", descriptor = "[[I")
    public int[][] field2550;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIII)Lcc;", line = 9)
    public final class234 method1114(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class57 var6 = new class57(this, arg0, arg1, true);
        var6.method434();
        return var6;
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "()V", line = 20)
    public final void method1115() {
        int var10002;
        if (this.field2541 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2535; var3++) {
                int var4 = this.field2541[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2550 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2550[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2535) {
                int var7 = this.field2541[var6];
                this.field2550[var7][var1[var7]++] = var6++;
            }
            this.field2541 = null;
        }
        if (this.field2526 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2514; var10++) {
            int var11 = this.field2526[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2519 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2519[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2514) {
            int var14 = this.field2526[var13];
            this.field2519[var14][var8[var14]++] = var13++;
        }
        this.field2526 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lll;I)I", line = 113)
    private final int method1116(class146 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2507[arg1];
        int var5 = arg0.field2518[arg1];
        int var6 = arg0.field2547[arg1];
        for (int var7 = 0; var7 < this.field2535; var7++) {
            if (this.field2507[var7] == var4 && this.field2518[var7] == var5 && this.field2547[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2507[this.field2535] = var4;
            this.field2518[this.field2535] = var5;
            this.field2547[this.field2535] = var6;
            if (arg0.field2541 != null) {
                this.field2541[this.field2535] = arg0.field2541[arg1];
            }
            var3 = this.field2535++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)Lpj;", line = 153)
    public final class171 method433(int arg0, int arg1, int arg2) {
        return this.method1114(this.field2506, this.field2538, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(SS)V", line = 170)
    public final void method1117(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2514; var3++) {
            if (this.field2552[var3] == arg0) {
                this.field2552[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(III)V", line = 183)
    public final void method1118(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2535; var4++) {
            this.field2507[var4] += arg0;
            this.field2518[var4] += arg1;
            this.field2547[var4] += arg2;
        }
        this.method1129();
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIBSB)I", line = 199)
    public final int method1119(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field2510[this.field2514] = arg0;
        this.field2504[this.field2514] = arg1;
        this.field2539[this.field2514] = arg2;
        this.field2528[this.field2514] = arg3;
        this.field2515[this.field2514] = -1;
        this.field2552[this.field2514] = arg4;
        this.field2533[this.field2514] = -1;
        this.field2516[this.field2514] = arg5;
        return this.field2514++;
    }

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "()V", line = 214)
    public final void method1120() {
        if (this.field2534 != null) {
            return;
        }
        this.field2534 = new class213[this.field2535];
        for (int var1 = 0; var1 < this.field2535; var1++) {
            this.field2534[var1] = new class213();
        }
        for (int var2 = 0; var2 < this.field2514; var2++) {
            int var3 = this.field2510[var2];
            int var4 = this.field2504[var2];
            int var5 = this.field2539[var2];
            int var6 = this.field2507[var4] - this.field2507[var3];
            int var7 = this.field2518[var4] - this.field2518[var3];
            int var8 = this.field2547[var4] - this.field2547[var3];
            int var9 = this.field2507[var5] - this.field2507[var3];
            int var10 = this.field2518[var5] - this.field2518[var3];
            int var11 = this.field2547[var5] - this.field2547[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field2528 == null) {
                var19 = 0;
            } else {
                var19 = this.field2528[var2];
            }
            if (var19 == 0) {
                class213 var20 = this.field2534[var3];
                var20.field3616 += var16;
                var20.field3622 += var17;
                var20.field3617 += var18;
                var20.field3619++;
                class213 var21 = this.field2534[var4];
                var21.field3616 += var16;
                var21.field3622 += var17;
                var21.field3617 += var18;
                var21.field3619++;
                class213 var22 = this.field2534[var5];
                var22.field3616 += var16;
                var22.field3622 += var17;
                var22.field3617 += var18;
                var22.field3619++;
            } else if (var19 == 1) {
                if (this.field2543 == null) {
                    this.field2543 = new class244[this.field2514];
                }
                class244 var23 = this.field2543[var2] = new class244();
                var23.field4112 = var16;
                var23.field4105 = var17;
                var23.field4106 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "()V", line = 314)
    private final void method1121() {
        if (this.field2524) {
            return;
        }
        this.field2524 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field2535; var7++) {
            int var8 = this.field2507[var7];
            int var9 = this.field2518[var7];
            int var10 = this.field2547[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field2511 = (short) var1;
        this.field2521 = (short) var4;
        this.field2522 = (short) var2;
        this.field2536 = (short) var5;
        this.field2545 = (short) var3;
        this.field2551 = (short) var6;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V", line = 1453)
    private class146() {
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "([B)V", line = 1455)
    private class146(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1126(arg0);
        } else {
            this.method1130(arg0);
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(III)V", line = 1462)
    public class146(int arg0, int arg1, int arg2) {
        this.field2507 = new int[arg0];
        this.field2518 = new int[arg0];
        this.field2547 = new int[arg0];
        this.field2541 = new int[arg0];
        this.field2510 = new int[arg1];
        this.field2504 = new int[arg1];
        this.field2539 = new int[arg1];
        this.field2528 = new byte[arg1];
        this.field2508 = new byte[arg1];
        this.field2516 = new byte[arg1];
        this.field2552 = new short[arg1];
        this.field2533 = new short[arg1];
        this.field2515 = new byte[arg1];
        this.field2526 = new int[arg1];
        if (arg2 > 0) {
            this.field2527 = new byte[arg2];
            this.field2530 = new short[arg2];
            this.field2505 = new short[arg2];
            this.field2532 = new short[arg2];
            this.field2513 = new short[arg2];
            this.field2509 = new short[arg2];
            this.field2529 = new short[arg2];
            this.field2520 = new byte[arg2];
            this.field2542 = new byte[arg2];
            this.field2531 = new byte[arg2];
            this.field2549 = new byte[arg2];
            this.field2525 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "([Lll;I)V", line = 1494)
    public class146(class146[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2535 = 0;
        this.field2514 = 0;
        this.field2517 = 0;
        this.field2548 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class146 var10 = arg0[var9];
            if (var10 != null) {
                this.field2535 += var10.field2535;
                this.field2514 += var10.field2514;
                this.field2517 += var10.field2517;
                if (var10.field2508 == null) {
                    if (this.field2548 == -1) {
                        this.field2548 = var10.field2548;
                    }
                    if (this.field2548 != var10.field2548) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field2528 != null;
                var5 |= var10.field2516 != null;
                var6 |= var10.field2526 != null;
                var7 |= var10.field2533 != null;
                var8 |= var10.field2515 != null;
            }
        }
        this.field2507 = new int[this.field2535];
        this.field2518 = new int[this.field2535];
        this.field2547 = new int[this.field2535];
        this.field2541 = new int[this.field2535];
        this.field2510 = new int[this.field2514];
        this.field2504 = new int[this.field2514];
        this.field2539 = new int[this.field2514];
        if (var3) {
            this.field2528 = new byte[this.field2514];
        }
        if (var4) {
            this.field2508 = new byte[this.field2514];
        }
        if (var5) {
            this.field2516 = new byte[this.field2514];
        }
        if (var6) {
            this.field2526 = new int[this.field2514];
        }
        if (var7) {
            this.field2533 = new short[this.field2514];
        }
        if (var8) {
            this.field2515 = new byte[this.field2514];
        }
        this.field2552 = new short[this.field2514];
        if (this.field2517 > 0) {
            this.field2527 = new byte[this.field2517];
            this.field2530 = new short[this.field2517];
            this.field2505 = new short[this.field2517];
            this.field2532 = new short[this.field2517];
            this.field2513 = new short[this.field2517];
            this.field2509 = new short[this.field2517];
            this.field2529 = new short[this.field2517];
            this.field2520 = new byte[this.field2517];
            this.field2542 = new byte[this.field2517];
            this.field2531 = new byte[this.field2517];
            this.field2549 = new byte[this.field2517];
            this.field2525 = new byte[this.field2517];
        }
        this.field2535 = 0;
        this.field2514 = 0;
        this.field2517 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class146 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field2514; var13++) {
                    if (var3 && var12.field2528 != null) {
                        this.field2528[this.field2514] = var12.field2528[var13];
                    }
                    if (var4) {
                        if (var12.field2508 == null) {
                            this.field2508[this.field2514] = var12.field2548;
                        } else {
                            this.field2508[this.field2514] = var12.field2508[var13];
                        }
                    }
                    if (var5 && var12.field2516 != null) {
                        this.field2516[this.field2514] = var12.field2516[var13];
                    }
                    if (var6 && var12.field2526 != null) {
                        this.field2526[this.field2514] = var12.field2526[var13];
                    }
                    if (var7) {
                        if (var12.field2533 == null) {
                            this.field2533[this.field2514] = -1;
                        } else {
                            this.field2533[this.field2514] = var12.field2533[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field2515 == null || var12.field2515[var13] == -1) {
                            this.field2515[this.field2514] = -1;
                        } else {
                            this.field2515[this.field2514] = (byte) (var12.field2515[var13] + this.field2517);
                        }
                    }
                    this.field2552[this.field2514] = var12.field2552[var13];
                    this.field2510[this.field2514] = this.method1116(var12, var12.field2510[var13]);
                    this.field2504[this.field2514] = this.method1116(var12, var12.field2504[var13]);
                    this.field2539[this.field2514] = this.method1116(var12, var12.field2539[var13]);
                    this.field2514++;
                }
                for (int var14 = 0; var14 < var12.field2517; var14++) {
                    byte var15 = this.field2527[this.field2517] = var12.field2527[var14];
                    if (var15 == 0) {
                        this.field2530[this.field2517] = (short) this.method1116(var12, var12.field2530[var14]);
                        this.field2505[this.field2517] = (short) this.method1116(var12, var12.field2505[var14]);
                        this.field2532[this.field2517] = (short) this.method1116(var12, var12.field2532[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field2530[this.field2517] = var12.field2530[var14];
                        this.field2505[this.field2517] = var12.field2505[var14];
                        this.field2532[this.field2517] = var12.field2532[var14];
                        this.field2513[this.field2517] = var12.field2513[var14];
                        this.field2509[this.field2517] = var12.field2509[var14];
                        this.field2529[this.field2517] = var12.field2529[var14];
                        this.field2520[this.field2517] = var12.field2520[var14];
                        this.field2542[this.field2517] = var12.field2542[var14];
                        this.field2531[this.field2517] = var12.field2531[var14];
                    }
                    if (var15 == 2) {
                        this.field2549[this.field2517] = var12.field2549[var14];
                        this.field2525[this.field2517] = var12.field2525[var14];
                    }
                    this.field2517++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lpj;IIIZ)V", line = 377)
    public final void method447(class171 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class146 var6 = (class146) arg0;
        var6.method1121();
        var6.method1120();
        field2546++;
        int var7 = 0;
        int[] var8 = var6.field2507;
        int var9 = var6.field2535;
        for (int var10 = 0; var10 < this.field2535; var10++) {
            class213 var11 = this.field2534[var10];
            if (var11.field3619 != 0) {
                int var12 = this.field2518[var10] - arg2;
                if (var12 >= var6.field2522 && var12 <= var6.field2536) {
                    int var13 = this.field2507[var10] - arg1;
                    if (var13 >= var6.field2511 && var13 <= var6.field2521) {
                        int var14 = this.field2547[var10] - arg3;
                        if (var14 >= var6.field2545 && var14 <= var6.field2551) {
                            for (int var15 = 0; var15 < var9; var15++) {
                                class213 var16 = var6.field2534[var15];
                                if (var8[var15] == var13 && var6.field2547[var15] == var14 && var6.field2518[var15] == var12 && var16.field3619 != 0) {
                                    if (this.field2544 == null) {
                                        this.field2544 = new class213[this.field2535];
                                    }
                                    if (var6.field2544 == null) {
                                        var6.field2544 = new class213[var9];
                                    }
                                    class213 var17 = this.field2544[var10];
                                    if (var17 == null) {
                                        var17 = this.field2544[var10] = new class213(var11);
                                    }
                                    class213 var18 = var6.field2544[var15];
                                    if (var18 == null) {
                                        var18 = var6.field2544[var15] = new class213(var16);
                                    }
                                    var17.field3616 += var16.field3616;
                                    var17.field3622 += var16.field3622;
                                    var17.field3617 += var16.field3617;
                                    var17.field3619 += var16.field3619;
                                    var18.field3616 += var11.field3616;
                                    var18.field3622 += var11.field3622;
                                    var18.field3617 += var11.field3617;
                                    var18.field3619 += var11.field3619;
                                    var7++;
                                    field2512[var10] = field2546;
                                    field2537[var15] = field2546;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var19 = 0; var19 < this.field2514; var19++) {
            if (field2512[this.field2510[var19]] == field2546 && field2512[this.field2504[var19]] == field2546 && field2512[this.field2539[var19]] == field2546) {
                if (this.field2528 == null) {
                    this.field2528 = new byte[this.field2514];
                }
                this.field2528[var19] = 2;
            }
        }
        for (int var20 = 0; var20 < var6.field2514; var20++) {
            if (field2537[var6.field2510[var20]] == field2546 && field2537[var6.field2504[var20]] == field2546 && field2537[var6.field2539[var20]] == field2546) {
                if (var6.field2528 == null) {
                    var6.field2528 = new byte[var6.field2514];
                }
                var6.field2528[var20] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(IIIII)Ltb;", line = 504)
    public final class208 method1122(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class208(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(III)V", line = 507)
    public final void method1123(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field2523[arg2];
            int var5 = field2540[arg2];
            for (int var6 = 0; var6 < this.field2535; var6++) {
                int var7 = this.field2518[var6] * var4 + this.field2507[var6] * var5 >> 16;
                this.field2518[var6] = this.field2518[var6] * var5 - this.field2507[var6] * var4 >> 16;
                this.field2507[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field2523[arg0];
            int var9 = field2540[arg0];
            for (int var10 = 0; var10 < this.field2535; var10++) {
                int var11 = this.field2518[var10] * var9 - this.field2547[var10] * var8 >> 16;
                this.field2547[var10] = this.field2547[var10] * var9 + this.field2518[var10] * var8 >> 16;
                this.field2518[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field2523[arg1];
        int var13 = field2540[arg1];
        for (int var14 = 0; var14 < this.field2535; var14++) {
            int var15 = this.field2547[var14] * var12 + this.field2507[var14] * var13 >> 16;
            this.field2547[var14] = this.field2547[var14] * var13 - this.field2507[var14] * var12 >> 16;
            this.field2507[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(SS)V", line = 572)
    public final void method1124(short arg0, short arg1) {
        if (this.field2533 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2514; var3++) {
            if (this.field2533[var3] == arg0) {
                this.field2533[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(III)I", line = 590)
    public final int method1125(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2535; var4++) {
            if (this.field2507[var4] == arg0 && this.field2518[var4] == arg1 && this.field2547[var4] == arg2) {
                return var4;
            }
        }
        this.field2507[this.field2535] = arg0;
        this.field2518[this.field2535] = arg1;
        this.field2547[this.field2535] = arg2;
        return this.field2535++;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([B)V", line = 611)
    private final void method1126(byte[] arg0) {
        class60 var2 = new class60(arg0);
        class60 var3 = new class60(arg0);
        class60 var4 = new class60(arg0);
        class60 var5 = new class60(arg0);
        class60 var6 = new class60(arg0);
        class60 var7 = new class60(arg0);
        class60 var8 = new class60(arg0);
        var2.field1012 = arg0.length - 23;
        int var9 = var2.method485((byte) -2);
        int var10 = var2.method485((byte) -2);
        int var11 = var2.method501(0);
        int var12 = var2.method501(0);
        int var13 = var2.method501(0);
        int var14 = var2.method501(0);
        int var15 = var2.method501(0);
        int var16 = var2.method501(0);
        int var17 = var2.method501(0);
        int var18 = var2.method485((byte) -2);
        int var19 = var2.method485((byte) -2);
        int var20 = var2.method485((byte) -2);
        int var21 = var2.method485((byte) -2);
        int var22 = var2.method485((byte) -2);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2527 = new byte[var11];
            var2.field1012 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2527[var26] = var2.method511(-117);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field2535 = var9;
        this.field2514 = var10;
        this.field2517 = var11;
        this.field2507 = new int[var9];
        this.field2518 = new int[var9];
        this.field2547 = new int[var9];
        this.field2510 = new int[var10];
        this.field2504 = new int[var10];
        this.field2539 = new int[var10];
        if (var17 == 1) {
            this.field2541 = new int[var9];
        }
        if (var12 == 1) {
            this.field2528 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2508 = new byte[var10];
        } else {
            this.field2548 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2516 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2526 = new int[var10];
        }
        if (var16 == 1) {
            this.field2533 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2515 = new byte[var10];
        }
        this.field2552 = new short[var10];
        if (var11 > 0) {
            this.field2530 = new short[var11];
            this.field2505 = new short[var11];
            this.field2532 = new short[var11];
            if (var24 > 0) {
                this.field2513 = new short[var24];
                this.field2509 = new short[var24];
                this.field2529 = new short[var24];
                this.field2520 = new byte[var24];
                this.field2542 = new byte[var24];
                this.field2531 = new byte[var24];
            }
            if (var25 > 0) {
                this.field2549 = new byte[var25];
                this.field2525 = new byte[var25];
            }
        }
        var2.field1012 = var11;
        var3.field1012 = var44;
        var4.field1012 = var46;
        var5.field1012 = var48;
        var6.field1012 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var67 = var2.method501(0);
            int var68 = 0;
            if ((var67 & 0x1) != 0) {
                var68 = var3.method531(true);
            }
            int var69 = 0;
            if ((var67 & 0x2) != 0) {
                var69 = var4.method531(true);
            }
            int var70 = 0;
            if ((var67 & 0x4) != 0) {
                var70 = var5.method531(true);
            }
            this.field2507[var66] = var63 + var68;
            this.field2518[var66] = var64 + var69;
            this.field2547[var66] = var65 + var70;
            var63 = this.field2507[var66];
            var64 = this.field2518[var66];
            var65 = this.field2547[var66];
            if (var17 == 1) {
                this.field2541[var66] = var6.method501(0);
            }
        }
        var2.field1012 = var42;
        var3.field1012 = var31;
        var4.field1012 = var34;
        var5.field1012 = var37;
        var6.field1012 = var35;
        var7.field1012 = var40;
        var8.field1012 = var39;
        for (int var71 = 0; var71 < var10; var71++) {
            this.field2552[var71] = (short) var2.method485((byte) -2);
            if (var12 == 1) {
                this.field2528[var71] = var3.method511(-125);
            }
            if (var13 == 255) {
                this.field2508[var71] = var4.method511(-125);
            }
            if (var14 == 1) {
                this.field2516[var71] = var5.method511(-128);
            }
            if (var15 == 1) {
                this.field2526[var71] = var6.method501(0);
            }
            if (var16 == 1) {
                this.field2533[var71] = (short) (var7.method485((byte) -2) - 1);
            }
            if (this.field2515 != null) {
                if (this.field2533[var71] == -1) {
                    this.field2515[var71] = -1;
                } else {
                    this.field2515[var71] = (byte) (var8.method501(0) - 1);
                }
            }
        }
        var2.field1012 = var33;
        var3.field1012 = var30;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        for (int var76 = 0; var76 < var10; var76++) {
            int var77 = var3.method501(0);
            if (var77 == 1) {
                var72 = var2.method531(true) + var75;
                var73 = var2.method531(true) + var72;
                var74 = var2.method531(true) + var73;
                var75 = var74;
                this.field2510[var76] = var72;
                this.field2504[var76] = var73;
                this.field2539[var76] = var74;
            }
            if (var77 == 2) {
                var73 = var74;
                var74 = var2.method531(true) + var75;
                var75 = var74;
                this.field2510[var76] = var72;
                this.field2504[var76] = var73;
                this.field2539[var76] = var74;
            }
            if (var77 == 3) {
                var72 = var74;
                var74 = var2.method531(true) + var75;
                var75 = var74;
                this.field2510[var76] = var72;
                this.field2504[var76] = var73;
                this.field2539[var76] = var74;
            }
            if (var77 == 4) {
                int var80 = var72;
                var72 = var73;
                var73 = var80;
                var74 = var2.method531(true) + var75;
                var75 = var74;
                this.field2510[var76] = var72;
                this.field2504[var76] = var80;
                this.field2539[var76] = var74;
            }
        }
        var2.field1012 = var50;
        var3.field1012 = var52;
        var4.field1012 = var54;
        var5.field1012 = var56;
        var6.field1012 = var58;
        var7.field1012 = var60;
        for (int var81 = 0; var81 < var11; var81++) {
            int var82 = this.field2527[var81] & 0xFF;
            if (var82 == 0) {
                this.field2530[var81] = (short) var2.method485((byte) -2);
                this.field2505[var81] = (short) var2.method485((byte) -2);
                this.field2532[var81] = (short) var2.method485((byte) -2);
            }
            if (var82 == 1) {
                this.field2530[var81] = (short) var3.method485((byte) -2);
                this.field2505[var81] = (short) var3.method485((byte) -2);
                this.field2532[var81] = (short) var3.method485((byte) -2);
                this.field2513[var81] = (short) var4.method485((byte) -2);
                this.field2509[var81] = (short) var4.method485((byte) -2);
                this.field2529[var81] = (short) var4.method485((byte) -2);
                this.field2520[var81] = var5.method511(-127);
                this.field2542[var81] = var6.method511(-126);
                this.field2531[var81] = var7.method511(-126);
            }
            if (var82 == 2) {
                this.field2530[var81] = (short) var3.method485((byte) -2);
                this.field2505[var81] = (short) var3.method485((byte) -2);
                this.field2532[var81] = (short) var3.method485((byte) -2);
                this.field2513[var81] = (short) var4.method485((byte) -2);
                this.field2509[var81] = (short) var4.method485((byte) -2);
                this.field2529[var81] = (short) var4.method485((byte) -2);
                this.field2520[var81] = var5.method511(-117);
                this.field2542[var81] = var6.method511(-116);
                this.field2531[var81] = var7.method511(-125);
                this.field2549[var81] = var7.method511(-118);
                this.field2525[var81] = var7.method511(-114);
            }
            if (var82 == 3) {
                this.field2530[var81] = (short) var3.method485((byte) -2);
                this.field2505[var81] = (short) var3.method485((byte) -2);
                this.field2532[var81] = (short) var3.method485((byte) -2);
                this.field2513[var81] = (short) var4.method485((byte) -2);
                this.field2509[var81] = (short) var4.method485((byte) -2);
                this.field2529[var81] = (short) var4.method485((byte) -2);
                this.field2520[var81] = var5.method511(-126);
                this.field2542[var81] = var6.method511(-125);
                this.field2531[var81] = var7.method511(-118);
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lcb;II)Lll;", line = 1033)
    public static final class146 method1127(class267 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1911(arg1, arg2, -99);
        return var3 == null ? null : new class146(var3);
    }

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "()V", line = 1047)
    public static void method1128() {
        field2512 = null;
        field2537 = null;
        field2523 = null;
        field2540 = null;
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "()Z", line = 1065)
    public final boolean method420() {
        return true;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIIIIJ)V", line = 1070)
    public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "()V", line = 1077)
    private final void method1129() {
        this.field2534 = null;
        this.field2544 = null;
        this.field2543 = null;
        this.field2524 = false;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "([B)V", line = 1103)
    private final void method1130(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class60 var4 = new class60(arg0);
        class60 var5 = new class60(arg0);
        class60 var6 = new class60(arg0);
        class60 var7 = new class60(arg0);
        class60 var8 = new class60(arg0);
        var4.field1012 = arg0.length - 18;
        int var9 = var4.method485((byte) -2);
        int var10 = var4.method485((byte) -2);
        int var11 = var4.method501(0);
        int var12 = var4.method501(0);
        int var13 = var4.method501(0);
        int var14 = var4.method501(0);
        int var15 = var4.method501(0);
        int var16 = var4.method501(0);
        int var17 = var4.method485((byte) -2);
        int var18 = var4.method485((byte) -2);
        int var19 = var4.method485((byte) -2);
        int var20 = var4.method485((byte) -2);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field2535 = var9;
        this.field2514 = var10;
        this.field2517 = var11;
        this.field2507 = new int[var9];
        this.field2518 = new int[var9];
        this.field2547 = new int[var9];
        this.field2510 = new int[var10];
        this.field2504 = new int[var10];
        this.field2539 = new int[var10];
        if (var11 > 0) {
            this.field2527 = new byte[var11];
            this.field2530 = new short[var11];
            this.field2505 = new short[var11];
            this.field2532 = new short[var11];
        }
        if (var16 == 1) {
            this.field2541 = new int[var9];
        }
        if (var12 == 1) {
            this.field2528 = new byte[var10];
            this.field2515 = new byte[var10];
            this.field2533 = new short[var10];
        }
        if (var13 == 255) {
            this.field2508 = new byte[var10];
        } else {
            this.field2548 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2516 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2526 = new int[var10];
        }
        this.field2552 = new short[var10];
        var4.field1012 = var21;
        var5.field1012 = var36;
        var6.field1012 = var38;
        var7.field1012 = var40;
        var8.field1012 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method501(0);
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method531(true);
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method531(true);
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method531(true);
            }
            this.field2507[var46] = var43 + var48;
            this.field2518[var46] = var44 + var49;
            this.field2547[var46] = var45 + var50;
            var43 = this.field2507[var46];
            var44 = this.field2518[var46];
            var45 = this.field2547[var46];
            if (var16 == 1) {
                this.field2541[var46] = var8.method501(0);
            }
        }
        var4.field1012 = var32;
        var5.field1012 = var28;
        var6.field1012 = var26;
        var7.field1012 = var30;
        var8.field1012 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2552[var51] = (short) var4.method485((byte) -2);
            if (var12 == 1) {
                int var52 = var5.method501(0);
                if ((var52 & 0x1) == 1) {
                    this.field2528[var51] = 1;
                    var2 = true;
                } else {
                    this.field2528[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2515[var51] = (byte) (var52 >> 2);
                    this.field2533[var51] = this.field2552[var51];
                    this.field2552[var51] = 127;
                    if (this.field2533[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2515[var51] = -1;
                    this.field2533[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2508[var51] = var6.method511(-117);
            }
            if (var14 == 1) {
                this.field2516[var51] = var7.method511(-122);
            }
            if (var15 == 1) {
                this.field2526[var51] = var8.method501(0);
            }
        }
        var4.field1012 = var25;
        var5.field1012 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method501(0);
            if (var58 == 1) {
                var53 = var4.method531(true) + var56;
                var54 = var4.method531(true) + var53;
                var55 = var4.method531(true) + var54;
                var56 = var55;
                this.field2510[var57] = var53;
                this.field2504[var57] = var54;
                this.field2539[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method531(true) + var56;
                var56 = var55;
                this.field2510[var57] = var53;
                this.field2504[var57] = var54;
                this.field2539[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method531(true) + var56;
                var56 = var55;
                this.field2510[var57] = var53;
                this.field2504[var57] = var54;
                this.field2539[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method531(true) + var56;
                var56 = var55;
                this.field2510[var57] = var53;
                this.field2504[var57] = var61;
                this.field2539[var57] = var55;
            }
        }
        var4.field1012 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2527[var62] = 0;
            this.field2530[var62] = (short) var4.method485((byte) -2);
            this.field2505[var62] = (short) var4.method485((byte) -2);
            this.field2532[var62] = (short) var4.method485((byte) -2);
        }
        if (this.field2515 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2515[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2530[var65] & 0xFFFF) == this.field2510[var64] && (this.field2505[var65] & 0xFFFF) == this.field2504[var64] && (this.field2532[var65] & 0xFFFF) == this.field2539[var64]) {
                        this.field2515[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2515 = null;
            }
        }
        if (!var3) {
            this.field2533 = null;
        }
        if (!var2) {
            this.field2528 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "()I", line = 1446)
    public final int method443() {
        if (!this.field2524) {
            this.method1121();
        }
        return this.field2522;
    }
}
