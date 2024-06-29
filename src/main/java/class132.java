import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class132 extends class4 {

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "I")
    public int field2499 = 0;

    @OriginalMember(owner = "client!oe", name = "db", descriptor = "Z")
    private boolean field2507 = false;

    @OriginalMember(owner = "client!oe", name = "kb", descriptor = "B")
    public byte field2514 = 0;

    @OriginalMember(owner = "client!oe", name = "Z", descriptor = "I")
    public int field2503 = 0;

    @OriginalMember(owner = "client!oe", name = "mb", descriptor = "I")
    public int field2516;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "[I")
    public int[] field2493;

    @OriginalMember(owner = "client!oe", name = "eb", descriptor = "[I")
    public int[] field2508;

    @OriginalMember(owner = "client!oe", name = "tb", descriptor = "[I")
    public int[] field2523;

    @OriginalMember(owner = "client!oe", name = "Fb", descriptor = "[I")
    private int[] field2535;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "[I")
    public int[] field2495;

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "[I")
    public int[] field2497;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "[I")
    public int[] field2500;

    @OriginalMember(owner = "client!oe", name = "vb", descriptor = "[B")
    public byte[] field2525;

    @OriginalMember(owner = "client!oe", name = "Eb", descriptor = "[B")
    public byte[] field2534;

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "[B")
    public byte[] field2498;

    @OriginalMember(owner = "client!oe", name = "Hb", descriptor = "[I")
    private int[] field2537;

    @OriginalMember(owner = "client!oe", name = "rb", descriptor = "[S")
    public short[] field2521;

    @OriginalMember(owner = "client!oe", name = "ib", descriptor = "[B")
    public byte[] field2512;

    @OriginalMember(owner = "client!oe", name = "hb", descriptor = "[S")
    public short[] field2511;

    @OriginalMember(owner = "client!oe", name = "nb", descriptor = "[B")
    public byte[] field2517;

    @OriginalMember(owner = "client!oe", name = "ob", descriptor = "[S")
    public short[] field2518;

    @OriginalMember(owner = "client!oe", name = "bb", descriptor = "[S")
    public short[] field2505;

    @OriginalMember(owner = "client!oe", name = "pb", descriptor = "[S")
    public short[] field2519;

    @OriginalMember(owner = "client!oe", name = "Bb", descriptor = "[S")
    private short[] field2531;

    @OriginalMember(owner = "client!oe", name = "yb", descriptor = "[S")
    private short[] field2528;

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "[S")
    private short[] field2502;

    @OriginalMember(owner = "client!oe", name = "Db", descriptor = "[B")
    private byte[] field2533;

    @OriginalMember(owner = "client!oe", name = "qb", descriptor = "[B")
    private byte[] field2520;

    @OriginalMember(owner = "client!oe", name = "zb", descriptor = "[B")
    private byte[] field2529;

    @OriginalMember(owner = "client!oe", name = "Gb", descriptor = "[B")
    private byte[] field2536;

    @OriginalMember(owner = "client!oe", name = "Cb", descriptor = "[B")
    private byte[] field2532;

    @OriginalMember(owner = "client!oe", name = "xb", descriptor = "[[I")
    public int[][] field2527;

    @OriginalMember(owner = "client!oe", name = "wb", descriptor = "[[I")
    public int[][] field2526;

    @OriginalMember(owner = "client!oe", name = "gb", descriptor = "[Lth;")
    public class180[] field2510;

    @OriginalMember(owner = "client!oe", name = "cb", descriptor = "[Lie;")
    public class79[] field2506;

    @OriginalMember(owner = "client!oe", name = "ab", descriptor = "[Lth;")
    public class180[] field2504;

    @OriginalMember(owner = "client!oe", name = "lb", descriptor = "S")
    public short field2515;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "S")
    public short field2491;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
    private static int field2494 = 0;

    @OriginalMember(owner = "client!oe", name = "Ab", descriptor = "[I")
    private static int[] field2530 = class150.field2888;

    @OriginalMember(owner = "client!oe", name = "sb", descriptor = "[I")
    private static int[] field2522 = new int[10000];

    @OriginalMember(owner = "client!oe", name = "fb", descriptor = "[I")
    private static int[] field2509 = new int[10000];

    @OriginalMember(owner = "client!oe", name = "jb", descriptor = "[I")
    private static int[] field2513 = class150.field2896;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "S")
    private short field2492;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "S")
    private short field2496;

    @OriginalMember(owner = "client!oe", name = "X", descriptor = "S")
    private short field2501;

    @OriginalMember(owner = "client!oe", name = "ub", descriptor = "S")
    private short field2524;

    @OriginalMember(owner = "client!oe", name = "Ib", descriptor = "S")
    private short field2538;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(SS)V")
    public final void method769(short arg0, short arg1) {
        if (this.field2521 != null) {
            for (int var3 = 0; var3 < this.field2503; ++var3) {
                if (this.field2521[var3] == arg0) {
                    this.field2521[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()V")
    public final void method770() {
        for (int var1 = 0; var1 < this.field2499; ++var1) {
            int var2 = this.field2523[var1];
            this.field2523[var1] = this.field2493[var1];
            this.field2493[var1] = -var2;
        }
        this.method771();
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "()V")
    private final void method771() {
        this.field2510 = null;
        this.field2504 = null;
        this.field2506 = null;
        this.field2507 = false;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "()Loe;")
    public final class132 method772() {
        class132 var1 = new class132();
        if (this.field2525 != null) {
            var1.field2525 = new byte[this.field2503];
            for (int var2 = 0; var2 < this.field2503; ++var2) {
                var1.field2525[var2] = this.field2525[var2];
            }
        }
        var1.field2499 = this.field2499;
        var1.field2503 = this.field2503;
        var1.field2516 = this.field2516;
        var1.field2493 = this.field2493;
        var1.field2508 = this.field2508;
        var1.field2523 = this.field2523;
        var1.field2495 = this.field2495;
        var1.field2497 = this.field2497;
        var1.field2500 = this.field2500;
        var1.field2534 = this.field2534;
        var1.field2498 = this.field2498;
        var1.field2512 = this.field2512;
        var1.field2511 = this.field2511;
        var1.field2521 = this.field2521;
        var1.field2514 = this.field2514;
        var1.field2517 = this.field2517;
        var1.field2518 = this.field2518;
        var1.field2505 = this.field2505;
        var1.field2519 = this.field2519;
        var1.field2531 = this.field2531;
        var1.field2528 = this.field2528;
        var1.field2502 = this.field2502;
        var1.field2533 = this.field2533;
        var1.field2520 = this.field2520;
        var1.field2529 = this.field2529;
        var1.field2536 = this.field2536;
        var1.field2532 = this.field2532;
        var1.field2535 = this.field2535;
        var1.field2537 = this.field2537;
        var1.field2527 = this.field2527;
        var1.field2526 = this.field2526;
        var1.field2510 = this.field2510;
        var1.field2506 = this.field2506;
        var1.field2515 = this.field2515;
        var1.field2491 = this.field2491;
        return var1;
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "()V")
    public final void method773() {
        for (int var1 = 0; var1 < this.field2499; ++var1) {
            int var2 = this.field2493[var1];
            this.field2493[var1] = this.field2523[var1];
            this.field2523[var1] = -var2;
        }
        this.method771();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIZZ)Lfd;")
    public final class52 method774(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        return new class125(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public final void method775(int arg0) {
        int var2 = field2513[arg0];
        int var3 = field2530[arg0];
        for (int var4 = 0; var4 < this.field2499; ++var4) {
            int var5 = this.field2523[var4] * var2 + this.field2493[var4] * var3 >> 16;
            this.field2523[var4] = this.field2523[var4] * var3 - this.field2493[var4] * var2 >> 16;
            this.field2493[var4] = var5;
        }
        this.method771();
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "()V")
    public final void method776() {
        int var10002;
        if (this.field2535 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2499; ++var3) {
                int var7 = this.field2535[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2527 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field2527[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2499) {
                int var6 = this.field2535[var5];
                this.field2527[var6][var1[var6]++] = var5++;
            }
            this.field2535 = null;
        }
        if (this.field2537 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field2503; ++var10) {
                int var14 = this.field2537[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field2526 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field2526[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field2503) {
                int var13 = this.field2537[var12];
                this.field2526[var13][var8[var13]++] = var12++;
            }
            this.field2537 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([[IIIIZI)Loe;")
    public final class132 method777(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method783();
        int var7 = this.field2496 + arg1;
        int var8 = this.field2492 + arg1;
        int var9 = this.field2538 + arg3;
        int var10 = this.field2501 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class132 var15;
                if (arg4) {
                    var15 = new class132();
                    var15.field2499 = this.field2499;
                    var15.field2503 = this.field2503;
                    var15.field2516 = this.field2516;
                    var15.field2493 = this.field2493;
                    var15.field2523 = this.field2523;
                    var15.field2495 = this.field2495;
                    var15.field2497 = this.field2497;
                    var15.field2500 = this.field2500;
                    var15.field2525 = this.field2525;
                    var15.field2534 = this.field2534;
                    var15.field2498 = this.field2498;
                    var15.field2512 = this.field2512;
                    var15.field2511 = this.field2511;
                    var15.field2521 = this.field2521;
                    var15.field2514 = this.field2514;
                    var15.field2517 = this.field2517;
                    var15.field2518 = this.field2518;
                    var15.field2505 = this.field2505;
                    var15.field2519 = this.field2519;
                    var15.field2531 = this.field2531;
                    var15.field2528 = this.field2528;
                    var15.field2502 = this.field2502;
                    var15.field2533 = this.field2533;
                    var15.field2520 = this.field2520;
                    var15.field2529 = this.field2529;
                    var15.field2536 = this.field2536;
                    var15.field2532 = this.field2532;
                    var15.field2535 = this.field2535;
                    var15.field2537 = this.field2537;
                    var15.field2527 = this.field2527;
                    var15.field2526 = this.field2526;
                    var15.field2515 = this.field2515;
                    var15.field2491 = this.field2491;
                    var15.field2508 = new int[var15.field2499];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field2499; ++var16) {
                        int var17 = this.field2493[var16] + arg1;
                        int var18 = this.field2523[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field2508[var16] = this.field2508[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field2499; ++var26) {
                        int var27 = (this.field2508[var26] << 16) / super.field73;
                        if (var27 < arg5) {
                            int var28 = this.field2493[var26] + arg1;
                            int var29 = this.field2523[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field2508[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2508[var26];
                        } else {
                            var15.field2508[var26] = this.field2508[var26];
                        }
                    }
                }
                var15.method771();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "()V")
    public final void method778() {
        for (int var1 = 0; var1 < this.field2499; ++var1) {
            this.field2493[var1] = -this.field2493[var1];
            this.field2523[var1] = -this.field2523[var1];
        }
        this.method771();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
    public final void method779(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2499; ++var4) {
            this.field2493[var4] = this.field2493[var4] * arg0 / 128;
            this.field2508[var4] = this.field2508[var4] * arg1 / 128;
            this.field2523[var4] = this.field2523[var4] * arg2 / 128;
        }
        this.method771();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljg;II)Loe;")
    public static final class132 method780(class89 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method461(arg1, (byte) 71, arg2);
        return var3 == null ? null : new class132(var3);
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "()V")
    public static void method781() {
        field2509 = null;
        field2522 = null;
        field2513 = null;
        field2530 = null;
    }

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "()V")
    public final void method782() {
        for (int var1 = 0; var1 < this.field2499; ++var1) {
            this.field2523[var1] = -this.field2523[var1];
        }
        for (int var2 = 0; var2 < this.field2503; ++var2) {
            int var3 = this.field2495[var2];
            this.field2495[var2] = this.field2500[var2];
            this.field2500[var2] = var3;
        }
        this.method771();
    }

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "()V")
    private final void method783() {
        if (!this.field2507) {
            this.field2507 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            for (int var7 = 0; var7 < this.field2499; ++var7) {
                int var8 = this.field2493[var7];
                int var9 = this.field2508[var7];
                int var10 = this.field2523[var7];
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
            this.field2496 = (short) var1;
            this.field2492 = (short) var4;
            super.field73 = (short) var2;
            this.field2524 = (short) var5;
            this.field2538 = (short) var3;
            this.field2501 = (short) var6;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([B)V")
    private final void method784(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class158 var4 = new class158(arg0);
        class158 var5 = new class158(arg0);
        class158 var6 = new class158(arg0);
        class158 var7 = new class158(arg0);
        class158 var8 = new class158(arg0);
        var4.field3153 = arg0.length - 18;
        int var9 = var4.method1071(28101);
        int var10 = var4.method1071(28101);
        int var11 = var4.method1054(128);
        int var12 = var4.method1054(128);
        int var13 = var4.method1054(128);
        int var14 = var4.method1054(128);
        int var15 = var4.method1054(128);
        int var16 = var4.method1054(128);
        int var17 = var4.method1071(28101);
        int var18 = var4.method1071(28101);
        int var19 = var4.method1071(28101);
        int var20 = var4.method1071(28101);
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
        this.field2499 = var9;
        this.field2503 = var10;
        this.field2516 = var11;
        this.field2493 = new int[var9];
        this.field2508 = new int[var9];
        this.field2523 = new int[var9];
        this.field2495 = new int[var10];
        this.field2497 = new int[var10];
        this.field2500 = new int[var10];
        if (var11 > 0) {
            this.field2517 = new byte[var11];
            this.field2518 = new short[var11];
            this.field2505 = new short[var11];
            this.field2519 = new short[var11];
        }
        if (var16 == 1) {
            this.field2535 = new int[var9];
        }
        if (var12 == 1) {
            this.field2525 = new byte[var10];
            this.field2512 = new byte[var10];
            this.field2521 = new short[var10];
        }
        if (var13 == 255) {
            this.field2534 = new byte[var10];
        } else {
            this.field2514 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2498 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2537 = new int[var10];
        }
        this.field2511 = new short[var10];
        var4.field3153 = var21;
        var5.field3153 = var36;
        var6.field3153 = var38;
        var7.field3153 = var40;
        var8.field3153 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method1054(128);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method1079((byte) 114);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method1079((byte) 114);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method1079((byte) 87);
            }
            this.field2493[var46] = var43 + var63;
            this.field2508[var46] = var44 + var64;
            this.field2523[var46] = var45 + var65;
            var43 = this.field2493[var46];
            var44 = this.field2508[var46];
            var45 = this.field2523[var46];
            if (var16 == 1) {
                this.field2535[var46] = var8.method1054(128);
            }
        }
        var4.field3153 = var32;
        var5.field3153 = var28;
        var6.field3153 = var26;
        var7.field3153 = var30;
        var8.field3153 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field2511[var47] = (short) var4.method1071(28101);
            if (var12 == 1) {
                int var61 = var5.method1054(128);
                if ((var61 & 1) == 1) {
                    this.field2525[var47] = 1;
                    var2 = true;
                } else {
                    this.field2525[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field2512[var47] = (byte) (var61 >> 2);
                    this.field2521[var47] = this.field2511[var47];
                    this.field2511[var47] = 127;
                    if (this.field2521[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2512[var47] = -1;
                    this.field2521[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2534[var47] = var6.method1066(true);
            }
            if (var14 == 1) {
                this.field2498[var47] = var7.method1066(true);
            }
            if (var15 == 1) {
                this.field2537[var47] = var8.method1054(128);
            }
        }
        var4.field3153 = var25;
        var5.field3153 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method1054(128);
            if (var57 == 1) {
                var48 = var4.method1079((byte) 124) + var51;
                var49 = var4.method1079((byte) 117) + var48;
                var50 = var4.method1079((byte) 87) + var49;
                var51 = var50;
                this.field2495[var52] = var48;
                this.field2497[var52] = var49;
                this.field2500[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method1079((byte) 87) + var51;
                var51 = var50;
                this.field2495[var52] = var48;
                this.field2497[var52] = var49;
                this.field2500[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method1079((byte) 91) + var51;
                var51 = var50;
                this.field2495[var52] = var48;
                this.field2497[var52] = var49;
                this.field2500[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method1079((byte) 112) + var51;
                var51 = var50;
                this.field2495[var52] = var48;
                this.field2497[var52] = var60;
                this.field2500[var52] = var50;
            }
        }
        var4.field3153 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field2517[var53] = 0;
            this.field2518[var53] = (short) var4.method1071(28101);
            this.field2505[var53] = (short) var4.method1071(28101);
            this.field2519[var53] = (short) var4.method1071(28101);
        }
        if (this.field2512 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field2512[var55] & 255;
                if (var56 != 255) {
                    if ((this.field2518[var56] & 65535) == this.field2495[var55] && (this.field2505[var56] & 65535) == this.field2497[var55] && (this.field2519[var56] & 65535) == this.field2500[var55]) {
                        this.field2512[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field2512 = null;
            }
        }
        if (!var3) {
            this.field2521 = null;
        }
        if (!var2) {
            this.field2525 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIII)Lng;")
    public final class125 method785(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class125(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Loe;I)I")
    private final int method786(class132 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2493[arg1];
        int var5 = arg0.field2508[arg1];
        int var6 = arg0.field2523[arg1];
        for (int var7 = 0; var7 < this.field2499; ++var7) {
            if (this.field2493[var7] == var4 && this.field2508[var7] == var5 && this.field2523[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2493[this.field2499] = var4;
            this.field2508[this.field2499] = var5;
            this.field2523[this.field2499] = var6;
            if (arg0.field2535 != null) {
                this.field2535[this.field2499] = arg0.field2535[arg1];
            }
            var3 = this.field2499++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "()V")
    public final void method787() {
        if (this.field2510 == null) {
            this.field2510 = new class180[this.field2499];
            for (int var1 = 0; var1 < this.field2499; ++var1) {
                this.field2510[var1] = new class180();
            }
            for (int var2 = 0; var2 < this.field2503; ++var2) {
                int var3 = this.field2495[var2];
                int var4 = this.field2497[var2];
                int var5 = this.field2500[var2];
                int var6 = this.field2493[var4] - this.field2493[var3];
                int var7 = this.field2508[var4] - this.field2508[var3];
                int var8 = this.field2523[var4] - this.field2523[var3];
                int var9 = this.field2493[var5] - this.field2493[var3];
                int var10 = this.field2508[var5] - this.field2508[var3];
                int var11 = this.field2523[var5] - this.field2523[var3];
                int var12 = var7 * var11 - var8 * var10;
                int var13 = var8 * var9 - var6 * var11;
                int var14;
                for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
                if (var15 <= 0) {
                    var15 = 1;
                }
                int var16 = var12 * 256 / var15;
                int var17 = var13 * 256 / var15;
                int var18 = var14 * 256 / var15;
                byte var19;
                if (this.field2525 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field2525[var2];
                }
                if (var19 == 0) {
                    class180 var20 = this.field2510[var3];
                    var20.field3576 += var16;
                    var20.field3574 += var17;
                    var20.field3577 += var18;
                    ++var20.field3570;
                    class180 var21 = this.field2510[var4];
                    var21.field3576 += var16;
                    var21.field3574 += var17;
                    var21.field3577 += var18;
                    ++var21.field3570;
                    class180 var22 = this.field2510[var5];
                    var22.field3576 += var16;
                    var22.field3574 += var17;
                    var22.field3577 += var18;
                    ++var22.field3570;
                } else if (var19 == 1) {
                    if (this.field2506 == null) {
                        this.field2506 = new class79[this.field2503];
                    }
                    class79 var23 = this.field2506[var2] = new class79();
                    var23.field1407 = var16;
                    var23.field1411 = var17;
                    var23.field1410 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(III)V")
    public final void method788(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2499; ++var4) {
            this.field2493[var4] += arg0;
            this.field2508[var4] += arg1;
            this.field2523[var4] += arg2;
        }
        this.method771();
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "([B)V")
    private final void method789(byte[] arg0) {
        class158 var2 = new class158(arg0);
        class158 var3 = new class158(arg0);
        class158 var4 = new class158(arg0);
        class158 var5 = new class158(arg0);
        class158 var6 = new class158(arg0);
        class158 var7 = new class158(arg0);
        class158 var8 = new class158(arg0);
        var2.field3153 = arg0.length - 23;
        int var9 = var2.method1071(28101);
        int var10 = var2.method1071(28101);
        int var11 = var2.method1054(128);
        int var12 = var2.method1054(128);
        int var13 = var2.method1054(128);
        int var14 = var2.method1054(128);
        int var15 = var2.method1054(128);
        int var16 = var2.method1054(128);
        int var17 = var2.method1054(128);
        int var18 = var2.method1071(28101);
        int var19 = var2.method1071(28101);
        int var20 = var2.method1071(28101);
        int var21 = var2.method1071(28101);
        int var22 = var2.method1071(28101);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2517 = new byte[var11];
            var2.field3153 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field2517[var26] = var2.method1066(true);
                if (var27 == 0) {
                    ++var23;
                }
                if (var27 >= 1 && var27 <= 3) {
                    ++var24;
                }
                if (var27 == 2) {
                    ++var25;
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
        this.field2499 = var9;
        this.field2503 = var10;
        this.field2516 = var11;
        this.field2493 = new int[var9];
        this.field2508 = new int[var9];
        this.field2523 = new int[var9];
        this.field2495 = new int[var10];
        this.field2497 = new int[var10];
        this.field2500 = new int[var10];
        if (var17 == 1) {
            this.field2535 = new int[var9];
        }
        if (var12 == 1) {
            this.field2525 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2534 = new byte[var10];
        } else {
            this.field2514 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2498 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2537 = new int[var10];
        }
        if (var16 == 1) {
            this.field2521 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2512 = new byte[var10];
        }
        this.field2511 = new short[var10];
        if (var11 > 0) {
            this.field2518 = new short[var11];
            this.field2505 = new short[var11];
            this.field2519 = new short[var11];
            if (var24 > 0) {
                this.field2531 = new short[var24];
                this.field2528 = new short[var24];
                this.field2502 = new short[var24];
                this.field2533 = new byte[var24];
                this.field2520 = new byte[var24];
                this.field2529 = new byte[var24];
            }
            if (var25 > 0) {
                this.field2536 = new byte[var25];
                this.field2532 = new byte[var25];
            }
        }
        var2.field3153 = var11;
        var3.field3153 = var44;
        var4.field3153 = var46;
        var5.field3153 = var48;
        var6.field3153 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method1054(128);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method1079((byte) 92);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method1079((byte) 108);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method1079((byte) 112);
            }
            this.field2493[var67] = var64 + var82;
            this.field2508[var67] = var65 + var83;
            this.field2523[var67] = var66 + var84;
            var64 = this.field2493[var67];
            var65 = this.field2508[var67];
            var66 = this.field2523[var67];
            if (var17 == 1) {
                this.field2535[var67] = var6.method1054(128);
            }
        }
        var2.field3153 = var42;
        var3.field3153 = var31;
        var4.field3153 = var34;
        var5.field3153 = var37;
        var6.field3153 = var35;
        var7.field3153 = var40;
        var8.field3153 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field2511[var68] = (short) var2.method1071(28101);
            if (var12 == 1) {
                this.field2525[var68] = var3.method1066(true);
            }
            if (var13 == 255) {
                this.field2534[var68] = var4.method1066(true);
            }
            if (var14 == 1) {
                this.field2498[var68] = var5.method1066(true);
            }
            if (var15 == 1) {
                this.field2537[var68] = var6.method1054(128);
            }
            if (var16 == 1) {
                this.field2521[var68] = (short) (var7.method1071(28101) - 1);
            }
            if (this.field2512 != null) {
                if (this.field2521[var68] != -1) {
                    this.field2512[var68] = (byte) (var8.method1054(128) - 1);
                } else {
                    this.field2512[var68] = -1;
                }
            }
        }
        var2.field3153 = var33;
        var3.field3153 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method1054(128);
            if (var77 == 1) {
                var69 = var2.method1079((byte) 114) + var72;
                var70 = var2.method1079((byte) 123) + var69;
                var71 = var2.method1079((byte) 110) + var70;
                var72 = var71;
                this.field2495[var73] = var69;
                this.field2497[var73] = var70;
                this.field2500[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method1079((byte) 95) + var72;
                var72 = var71;
                this.field2495[var73] = var69;
                this.field2497[var73] = var70;
                this.field2500[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method1079((byte) 104) + var72;
                var72 = var71;
                this.field2495[var73] = var69;
                this.field2497[var73] = var70;
                this.field2500[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method1079((byte) 121) + var72;
                var72 = var71;
                this.field2495[var73] = var69;
                this.field2497[var73] = var80;
                this.field2500[var73] = var71;
            }
        }
        var2.field3153 = var50;
        var3.field3153 = var52;
        var4.field3153 = var54;
        var5.field3153 = var56;
        var6.field3153 = var58;
        var7.field3153 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field2517[var74] & 255;
            if (var76 == 0) {
                this.field2518[var74] = (short) var2.method1071(28101);
                this.field2505[var74] = (short) var2.method1071(28101);
                this.field2519[var74] = (short) var2.method1071(28101);
            }
            if (var76 == 1) {
                this.field2518[var74] = (short) var3.method1071(28101);
                this.field2505[var74] = (short) var3.method1071(28101);
                this.field2519[var74] = (short) var3.method1071(28101);
                this.field2531[var74] = (short) var4.method1071(28101);
                this.field2528[var74] = (short) var4.method1071(28101);
                this.field2502[var74] = (short) var4.method1071(28101);
                this.field2533[var74] = var5.method1066(true);
                this.field2520[var74] = var6.method1066(true);
                this.field2529[var74] = var7.method1066(true);
            }
            if (var76 == 2) {
                this.field2518[var74] = (short) var3.method1071(28101);
                this.field2505[var74] = (short) var3.method1071(28101);
                this.field2519[var74] = (short) var3.method1071(28101);
                this.field2531[var74] = (short) var4.method1071(28101);
                this.field2528[var74] = (short) var4.method1071(28101);
                this.field2502[var74] = (short) var4.method1071(28101);
                this.field2533[var74] = var5.method1066(true);
                this.field2520[var74] = var6.method1066(true);
                this.field2529[var74] = var7.method1066(true);
                this.field2536[var74] = var7.method1066(true);
                this.field2532[var74] = var7.method1066(true);
            }
            if (var76 == 3) {
                this.field2518[var74] = (short) var3.method1071(28101);
                this.field2505[var74] = (short) var3.method1071(28101);
                this.field2519[var74] = (short) var3.method1071(28101);
                this.field2531[var74] = (short) var4.method1071(28101);
                this.field2528[var74] = (short) var4.method1071(28101);
                this.field2502[var74] = (short) var4.method1071(28101);
                this.field2533[var74] = var5.method1066(true);
                this.field2520[var74] = var6.method1066(true);
                this.field2529[var74] = var7.method1066(true);
            }
        }
        var2.field3153 = var62;
        int var75 = var2.method1054(128);
        if (var75 != 0) {
            new class6();
            var2.method1071(28101);
            var2.method1071(28101);
            var2.method1071(28101);
            var2.method1076(24277);
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(SS)V")
    public final void method790(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2503; ++var3) {
            if (this.field2511[var3] == arg0) {
                this.field2511[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    private class132() {
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Loe;Loe;IIIZ)V")
    public static final void method791(class132 arg0, class132 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method783();
        arg0.method787();
        arg1.method783();
        arg1.method787();
        ++field2494;
        int var6 = 0;
        int[] var7 = arg1.field2493;
        int var8 = arg1.field2499;
        for (int var9 = 0; var9 < arg0.field2499; ++var9) {
            class180 var12 = arg0.field2510[var9];
            if (var12.field3570 != 0) {
                int var13 = arg0.field2508[var9] - arg3;
                if (var13 >= arg1.field73 && var13 <= arg1.field2524) {
                    int var14 = arg0.field2493[var9] - arg2;
                    if (var14 >= arg1.field2496 && var14 <= arg1.field2492) {
                        int var15 = arg0.field2523[var9] - arg4;
                        if (var15 >= arg1.field2538 && var15 <= arg1.field2501) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class180 var17 = arg1.field2510[var16];
                                if (var7[var16] == var14 && arg1.field2523[var16] == var15 && arg1.field2508[var16] == var13 && var17.field3570 != 0) {
                                    if (arg0.field2504 == null) {
                                        arg0.field2504 = new class180[arg0.field2499];
                                    }
                                    if (arg1.field2504 == null) {
                                        arg1.field2504 = new class180[var8];
                                    }
                                    class180 var18 = arg0.field2504[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field2504[var9] = new class180(var12);
                                    }
                                    class180 var19 = arg1.field2504[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field2504[var16] = new class180(var17);
                                    }
                                    var18.field3576 += var17.field3576;
                                    var18.field3574 += var17.field3574;
                                    var18.field3577 += var17.field3577;
                                    var18.field3570 += var17.field3570;
                                    var19.field3576 += var12.field3576;
                                    var19.field3574 += var12.field3574;
                                    var19.field3577 += var12.field3577;
                                    var19.field3570 += var12.field3570;
                                    ++var6;
                                    field2509[var9] = field2494;
                                    field2522[var16] = field2494;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field2503; ++var10) {
                if (field2509[arg0.field2495[var10]] == field2494 && field2509[arg0.field2497[var10]] == field2494 && field2509[arg0.field2500[var10]] == field2494) {
                    if (arg0.field2525 == null) {
                        arg0.field2525 = new byte[arg0.field2503];
                    }
                    arg0.field2525[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field2503; ++var11) {
                if (field2522[arg1.field2495[var11]] == field2494 && field2522[arg1.field2497[var11]] == field2494 && field2522[arg1.field2500[var11]] == field2494) {
                    if (arg1.field2525 == null) {
                        arg1.field2525 = new byte[arg1.field2503];
                    }
                    arg1.field2525[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "([B)V")
    private class132(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method789(arg0);
        } else {
            this.method784(arg0);
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "([Loe;I)V")
    public class132(class132[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2499 = 0;
        this.field2503 = 0;
        this.field2516 = 0;
        this.field2514 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class132 var15 = arg0[var9];
            if (var15 != null) {
                this.field2499 += var15.field2499;
                this.field2503 += var15.field2503;
                this.field2516 += var15.field2516;
                if (var15.field2534 != null) {
                    var4 = true;
                } else {
                    if (this.field2514 == -1) {
                        this.field2514 = var15.field2514;
                    }
                    if (this.field2514 != var15.field2514) {
                        var4 = true;
                    }
                }
                var3 |= var15.field2525 != null;
                var5 |= var15.field2498 != null;
                var6 |= var15.field2537 != null;
                var7 |= var15.field2521 != null;
                var8 |= var15.field2512 != null;
            }
        }
        this.field2493 = new int[this.field2499];
        this.field2508 = new int[this.field2499];
        this.field2523 = new int[this.field2499];
        this.field2535 = new int[this.field2499];
        this.field2495 = new int[this.field2503];
        this.field2497 = new int[this.field2503];
        this.field2500 = new int[this.field2503];
        if (var3) {
            this.field2525 = new byte[this.field2503];
        }
        if (var4) {
            this.field2534 = new byte[this.field2503];
        }
        if (var5) {
            this.field2498 = new byte[this.field2503];
        }
        if (var6) {
            this.field2537 = new int[this.field2503];
        }
        if (var7) {
            this.field2521 = new short[this.field2503];
        }
        if (var8) {
            this.field2512 = new byte[this.field2503];
        }
        this.field2511 = new short[this.field2503];
        if (this.field2516 > 0) {
            this.field2517 = new byte[this.field2516];
            this.field2518 = new short[this.field2516];
            this.field2505 = new short[this.field2516];
            this.field2519 = new short[this.field2516];
            this.field2531 = new short[this.field2516];
            this.field2528 = new short[this.field2516];
            this.field2502 = new short[this.field2516];
            this.field2533 = new byte[this.field2516];
            this.field2520 = new byte[this.field2516];
            this.field2529 = new byte[this.field2516];
            this.field2536 = new byte[this.field2516];
            this.field2532 = new byte[this.field2516];
        }
        this.field2499 = 0;
        this.field2503 = 0;
        this.field2516 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class132 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field2503; ++var12) {
                    if (var3 && var11.field2525 != null) {
                        this.field2525[this.field2503] = var11.field2525[var12];
                    }
                    if (var4) {
                        if (var11.field2534 != null) {
                            this.field2534[this.field2503] = var11.field2534[var12];
                        } else {
                            this.field2534[this.field2503] = var11.field2514;
                        }
                    }
                    if (var5 && var11.field2498 != null) {
                        this.field2498[this.field2503] = var11.field2498[var12];
                    }
                    if (var6 && var11.field2537 != null) {
                        this.field2537[this.field2503] = var11.field2537[var12];
                    }
                    if (var7) {
                        if (var11.field2521 != null) {
                            this.field2521[this.field2503] = var11.field2521[var12];
                        } else {
                            this.field2521[this.field2503] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field2512 != null && var11.field2512[var12] != -1) {
                            this.field2512[this.field2503] = (byte) (var11.field2512[var12] + this.field2516);
                        } else {
                            this.field2512[this.field2503] = -1;
                        }
                    }
                    this.field2511[this.field2503] = var11.field2511[var12];
                    this.field2495[this.field2503] = this.method786(var11, var11.field2495[var12]);
                    this.field2497[this.field2503] = this.method786(var11, var11.field2497[var12]);
                    this.field2500[this.field2503] = this.method786(var11, var11.field2500[var12]);
                    ++this.field2503;
                }
                for (int var13 = 0; var13 < var11.field2516; ++var13) {
                    byte var14 = this.field2517[this.field2516] = var11.field2517[var13];
                    if (var14 == 0) {
                        this.field2518[this.field2516] = (short) this.method786(var11, var11.field2518[var13]);
                        this.field2505[this.field2516] = (short) this.method786(var11, var11.field2505[var13]);
                        this.field2519[this.field2516] = (short) this.method786(var11, var11.field2519[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field2518[this.field2516] = var11.field2518[var13];
                        this.field2505[this.field2516] = var11.field2505[var13];
                        this.field2519[this.field2516] = var11.field2519[var13];
                        this.field2531[this.field2516] = var11.field2531[var13];
                        this.field2528[this.field2516] = var11.field2528[var13];
                        this.field2502[this.field2516] = var11.field2502[var13];
                        this.field2533[this.field2516] = var11.field2533[var13];
                        this.field2520[this.field2516] = var11.field2520[var13];
                        this.field2529[this.field2516] = var11.field2529[var13];
                    }
                    if (var14 == 2) {
                        this.field2536[this.field2516] = var11.field2536[var13];
                        this.field2532[this.field2516] = var11.field2532[var13];
                    }
                    ++this.field2516;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Loe;ZZZZ)V")
    public class132(class132 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2499 = arg0.field2499;
        this.field2503 = arg0.field2503;
        this.field2516 = arg0.field2516;
        if (arg1) {
            this.field2493 = arg0.field2493;
            this.field2508 = arg0.field2508;
            this.field2523 = arg0.field2523;
        } else {
            this.field2493 = new int[this.field2499];
            this.field2508 = new int[this.field2499];
            this.field2523 = new int[this.field2499];
            for (int var6 = 0; var6 < this.field2499; ++var6) {
                this.field2493[var6] = arg0.field2493[var6];
                this.field2508[var6] = arg0.field2508[var6];
                this.field2523[var6] = arg0.field2523[var6];
            }
        }
        if (arg2) {
            this.field2511 = arg0.field2511;
        } else {
            this.field2511 = new short[this.field2503];
            for (int var7 = 0; var7 < this.field2503; ++var7) {
                this.field2511[var7] = arg0.field2511[var7];
            }
        }
        if (!arg3 && arg0.field2521 != null) {
            this.field2521 = new short[this.field2503];
            for (int var8 = 0; var8 < this.field2503; ++var8) {
                this.field2521[var8] = arg0.field2521[var8];
            }
        } else {
            this.field2521 = arg0.field2521;
        }
        if (arg4) {
            this.field2498 = arg0.field2498;
        } else {
            this.field2498 = new byte[this.field2503];
            if (arg0.field2498 == null) {
                for (int var9 = 0; var9 < this.field2503; ++var9) {
                    this.field2498[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2503; ++var10) {
                    this.field2498[var10] = arg0.field2498[var10];
                }
            }
        }
        this.field2495 = arg0.field2495;
        this.field2497 = arg0.field2497;
        this.field2500 = arg0.field2500;
        this.field2525 = arg0.field2525;
        this.field2534 = arg0.field2534;
        this.field2512 = arg0.field2512;
        this.field2514 = arg0.field2514;
        this.field2517 = arg0.field2517;
        this.field2518 = arg0.field2518;
        this.field2505 = arg0.field2505;
        this.field2519 = arg0.field2519;
        this.field2531 = arg0.field2531;
        this.field2528 = arg0.field2528;
        this.field2502 = arg0.field2502;
        this.field2533 = arg0.field2533;
        this.field2520 = arg0.field2520;
        this.field2529 = arg0.field2529;
        this.field2536 = arg0.field2536;
        this.field2532 = arg0.field2532;
        this.field2535 = arg0.field2535;
        this.field2537 = arg0.field2537;
        this.field2527 = arg0.field2527;
        this.field2526 = arg0.field2526;
        this.field2510 = arg0.field2510;
        this.field2506 = arg0.field2506;
        this.field2504 = arg0.field2504;
        this.field2515 = arg0.field2515;
        this.field2491 = arg0.field2491;
    }
}
