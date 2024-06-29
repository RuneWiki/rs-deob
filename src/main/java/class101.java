import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class101 extends class68 {

    @OriginalMember(owner = "client!pa", name = "yb", descriptor = "Z")
    private boolean field2446 = false;

    @OriginalMember(owner = "client!pa", name = "Eb", descriptor = "I")
    private int field2452 = 0;

    @OriginalMember(owner = "client!pa", name = "xb", descriptor = "B")
    private byte field2445 = 0;

    @OriginalMember(owner = "client!pa", name = "Xb", descriptor = "I")
    private int field2471 = 0;

    @OriginalMember(owner = "client!pa", name = "Ob", descriptor = "I")
    private int field2462 = 0;

    @OriginalMember(owner = "client!pa", name = "bc", descriptor = "[I")
    private int[] field2475;

    @OriginalMember(owner = "client!pa", name = "ac", descriptor = "[I")
    private int[] field2474;

    @OriginalMember(owner = "client!pa", name = "Fb", descriptor = "[I")
    private int[] field2453;

    @OriginalMember(owner = "client!pa", name = "Sb", descriptor = "[I")
    private int[] field2466;

    @OriginalMember(owner = "client!pa", name = "Vb", descriptor = "[I")
    private int[] field2469;

    @OriginalMember(owner = "client!pa", name = "Cb", descriptor = "[I")
    private int[] field2450;

    @OriginalMember(owner = "client!pa", name = "Ab", descriptor = "[I")
    private int[] field2448;

    @OriginalMember(owner = "client!pa", name = "vb", descriptor = "[I")
    private int[] field2443;

    @OriginalMember(owner = "client!pa", name = "Kb", descriptor = "[I")
    private int[] field2458;

    @OriginalMember(owner = "client!pa", name = "Db", descriptor = "[I")
    private int[] field2451;

    @OriginalMember(owner = "client!pa", name = "Jb", descriptor = "[B")
    private byte[] field2457;

    @OriginalMember(owner = "client!pa", name = "ub", descriptor = "[B")
    private byte[] field2442;

    @OriginalMember(owner = "client!pa", name = "Lb", descriptor = "[B")
    private byte[] field2459;

    @OriginalMember(owner = "client!pa", name = "Mb", descriptor = "[B")
    private byte[] field2460;

    @OriginalMember(owner = "client!pa", name = "Wb", descriptor = "[I")
    private int[] field2470;

    @OriginalMember(owner = "client!pa", name = "Rb", descriptor = "[S")
    private short[] field2465;

    @OriginalMember(owner = "client!pa", name = "Qb", descriptor = "[[I")
    private int[][] field2464;

    @OriginalMember(owner = "client!pa", name = "wb", descriptor = "[[I")
    private int[][] field2444;

    @OriginalMember(owner = "client!pa", name = "Yb", descriptor = "[Lne;")
    private class93[] field2472;

    @OriginalMember(owner = "client!pa", name = "zb", descriptor = "[Lae;")
    private class6[] field2447;

    @OriginalMember(owner = "client!pa", name = "cc", descriptor = "[Lne;")
    private class93[] field2476;

    @OriginalMember(owner = "client!pa", name = "Ib", descriptor = "S")
    public short field2456;

    @OriginalMember(owner = "client!pa", name = "Ub", descriptor = "S")
    public short field2468;

    @OriginalMember(owner = "client!pa", name = "sb", descriptor = "[I")
    private static int[] field2440 = new int[128];

    @OriginalMember(owner = "client!pa", name = "Pb", descriptor = "[I")
    private static int[] field2463 = new int[10000];

    @OriginalMember(owner = "client!pa", name = "Nb", descriptor = "[I")
    private static int[] field2461 = new int[10000];

    @OriginalMember(owner = "client!pa", name = "Zb", descriptor = "I")
    private static int field2473 = 0;

    @OriginalMember(owner = "client!pa", name = "tb", descriptor = "I")
    private int field2441;

    @OriginalMember(owner = "client!pa", name = "Bb", descriptor = "I")
    private int field2449;

    @OriginalMember(owner = "client!pa", name = "Gb", descriptor = "I")
    private int field2454;

    @OriginalMember(owner = "client!pa", name = "Hb", descriptor = "I")
    private int field2455;

    @OriginalMember(owner = "client!pa", name = "Tb", descriptor = "I")
    private int field2467;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "()V")
    private final void method827() {
        int var10002;
        if (this.field2451 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2462; ++var3) {
                int var7 = this.field2451[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2464 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field2464[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2462) {
                int var6 = this.field2451[var5];
                this.field2464[var6][var1[var6]++] = var5++;
            }
            this.field2451 = null;
        }
        if (this.field2470 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field2471; ++var10) {
                int var14 = this.field2470[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field2444 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field2444[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field2471) {
                int var13 = this.field2470[var12];
                this.field2444[var13][var8[var13]++] = var12++;
            }
            this.field2470 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lpa;Lpa;IIIZ)V")
    public static final void method828(class101 arg0, class101 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method845();
        arg0.method842();
        arg1.method845();
        arg1.method842();
        ++field2473;
        int var6 = 0;
        int[] var7 = arg1.field2475;
        int var8 = arg1.field2462;
        for (int var9 = 0; var9 < arg0.field2462; ++var9) {
            class93 var12 = arg0.field2472[var9];
            if (var12.field2314 != 0) {
                int var13 = arg0.field2474[var9] - arg3;
                if (var13 <= arg1.field2454) {
                    int var14 = arg0.field2475[var9] - arg2;
                    if (var14 >= arg1.field2449 && var14 <= arg1.field2441) {
                        int var15 = arg0.field2453[var9] - arg4;
                        if (var15 >= arg1.field2467 && var15 <= arg1.field2455) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class93 var17 = arg1.field2472[var16];
                                if (var7[var16] == var14 && arg1.field2453[var16] == var15 && arg1.field2474[var16] == var13 && var17.field2314 != 0) {
                                    if (arg0.field2476 == null) {
                                        arg0.field2476 = new class93[arg0.field2462];
                                    }
                                    if (arg1.field2476 == null) {
                                        arg1.field2476 = new class93[var8];
                                    }
                                    class93 var18 = arg0.field2476[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field2476[var9] = new class93(var12);
                                    }
                                    class93 var19 = arg1.field2476[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field2476[var16] = new class93(var17);
                                    }
                                    var18.field2324 += var17.field2324;
                                    var18.field2317 += var17.field2317;
                                    var18.field2310 += var17.field2310;
                                    var18.field2314 += var17.field2314;
                                    var19.field2324 += var12.field2324;
                                    var19.field2317 += var12.field2317;
                                    var19.field2310 += var12.field2310;
                                    var19.field2314 += var12.field2314;
                                    ++var6;
                                    field2463[var9] = field2473;
                                    field2461[var16] = field2473;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field2471; ++var10) {
                if (field2463[arg0.field2466[var10]] == field2473 && field2463[arg0.field2469[var10]] == field2473 && field2463[arg0.field2450[var10]] == field2473) {
                    if (arg0.field2457 == null) {
                        arg0.field2457 = new byte[arg0.field2471];
                    }
                    arg0.field2457[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field2471; ++var11) {
                if (field2461[arg1.field2466[var11]] == field2473 && field2461[arg1.field2469[var11]] == field2473 && field2461[arg1.field2450[var11]] == field2473) {
                    if (arg1.field2457 == null) {
                        arg1.field2457 = new byte[arg1.field2471];
                    }
                    arg1.field2457[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lsd;II)Lpa;")
    public static final class101 method829(class122 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method986(arg2, arg1, (byte) 67);
        return var3 == null ? null : new class101(var3);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lpa;I)I")
    private final int method830(class101 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2475[arg1];
        int var5 = arg0.field2474[arg1];
        int var6 = arg0.field2453[arg1];
        for (int var7 = 0; var7 < this.field2462; ++var7) {
            if (this.field2475[var7] == var4 && this.field2474[var7] == var5 && this.field2453[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2475[this.field2462] = var4;
            this.field2474[this.field2462] = var5;
            this.field2453[this.field2462] = var6;
            if (arg0.field2451 != null) {
                this.field2451[this.field2462] = arg0.field2451[arg1];
            }
            var3 = this.field2462++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "()Lpa;")
    public final class101 method831() {
        class101 var1 = new class101();
        if (this.field2457 != null) {
            var1.field2457 = new byte[this.field2471];
            for (int var2 = 0; var2 < this.field2471; ++var2) {
                var1.field2457[var2] = this.field2457[var2];
            }
        }
        var1.field2462 = this.field2462;
        var1.field2471 = this.field2471;
        var1.field2452 = this.field2452;
        var1.field2475 = this.field2475;
        var1.field2474 = this.field2474;
        var1.field2453 = this.field2453;
        var1.field2466 = this.field2466;
        var1.field2469 = this.field2469;
        var1.field2450 = this.field2450;
        var1.field2459 = this.field2459;
        var1.field2460 = this.field2460;
        var1.field2442 = this.field2442;
        var1.field2465 = this.field2465;
        var1.field2445 = this.field2445;
        var1.field2448 = this.field2448;
        var1.field2443 = this.field2443;
        var1.field2458 = this.field2458;
        var1.field2451 = this.field2451;
        var1.field2470 = this.field2470;
        var1.field2464 = this.field2464;
        var1.field2444 = this.field2444;
        var1.field2472 = this.field2472;
        var1.field2447 = this.field2447;
        var1.field2456 = this.field2456;
        var1.field2468 = this.field2468;
        return var1;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "()V")
    private final void method832() {
        this.field2472 = null;
        this.field2476 = null;
        this.field2447 = null;
        this.field2446 = false;
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "()V")
    public static void method833() {
        field2463 = null;
        field2461 = null;
        field2440 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(SS)V")
    public final void method834(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2471; ++var3) {
            if (this.field2465[var3] == arg0) {
                this.field2465[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "(I)I")
    private static final int method835(int arg0) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 > 127) {
            arg0 = 127;
        }
        return field2440[arg0];
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "()V")
    public final void method836() {
        for (int var1 = 0; var1 < this.field2462; ++var1) {
            int var2 = this.field2453[var1];
            this.field2453[var1] = this.field2475[var1];
            this.field2475[var1] = -var2;
        }
        this.method832();
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)I")
    private static final int method837(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIII)Ldd;")
    public final class26 method838(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method842();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class26 var8 = new class26();
        var8.field585 = new int[this.field2471];
        var8.field606 = new int[this.field2471];
        var8.field603 = new int[this.field2471];
        for (int var9 = 0; var9 < this.field2471; ++var9) {
            byte var10;
            if (this.field2457 == null) {
                var10 = 0;
            } else {
                var10 = this.field2457[var9];
            }
            if (this.field2442 != null && this.field2442[var9] != -1) {
                if (var10 != 0) {
                    if (var10 == 1) {
                        class6 var17 = this.field2447[var9];
                        int var18 = (var17.field107 * arg4 + var17.field117 * arg3 + var17.field111 * arg2) / (var7 / 2 + var7) + arg0;
                        var8.field585[var9] = method835(var18);
                        var8.field603[var9] = -1;
                    } else {
                        var8.field603[var9] = -2;
                    }
                } else {
                    class93 var11;
                    if (this.field2476 != null && this.field2476[this.field2466[var9]] != null) {
                        var11 = this.field2476[this.field2466[var9]];
                    } else {
                        var11 = this.field2472[this.field2466[var9]];
                    }
                    int var12 = (var11.field2310 * arg4 + var11.field2324 * arg2 + var11.field2317 * arg3) / (var11.field2314 * var7) + arg0;
                    var8.field585[var9] = method835(var12);
                    class93 var13;
                    if (this.field2476 != null && this.field2476[this.field2469[var9]] != null) {
                        var13 = this.field2476[this.field2469[var9]];
                    } else {
                        var13 = this.field2472[this.field2469[var9]];
                    }
                    int var14 = (var13.field2310 * arg4 + var13.field2324 * arg2 + var13.field2317 * arg3) / (var13.field2314 * var7) + arg0;
                    var8.field606[var9] = method835(var14);
                    class93 var15;
                    if (this.field2476 != null && this.field2476[this.field2450[var9]] != null) {
                        var15 = this.field2476[this.field2450[var9]];
                    } else {
                        var15 = this.field2472[this.field2450[var9]];
                    }
                    int var16 = (var15.field2310 * arg4 + var15.field2324 * arg2 + var15.field2317 * arg3) / (var15.field2314 * var7) + arg0;
                    var8.field603[var9] = method835(var16);
                }
            } else if (var10 != 0) {
                if (var10 == 1) {
                    class6 var26 = this.field2447[var9];
                    int var27 = (var26.field107 * arg4 + var26.field117 * arg3 + var26.field111 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field585[var9] = method837(this.field2465[var9] & 65535, var27);
                    var8.field603[var9] = -1;
                } else {
                    var8.field603[var9] = -2;
                }
            } else {
                int var19 = this.field2465[var9] & 65535;
                class93 var20;
                if (this.field2476 != null && this.field2476[this.field2466[var9]] != null) {
                    var20 = this.field2476[this.field2466[var9]];
                } else {
                    var20 = this.field2472[this.field2466[var9]];
                }
                int var21 = (var20.field2310 * arg4 + var20.field2324 * arg2 + var20.field2317 * arg3) / (var20.field2314 * var7) + arg0;
                var8.field585[var9] = method837(var19, var21);
                class93 var22;
                if (this.field2476 != null && this.field2476[this.field2469[var9]] != null) {
                    var22 = this.field2476[this.field2469[var9]];
                } else {
                    var22 = this.field2472[this.field2469[var9]];
                }
                int var23 = (var22.field2310 * arg4 + var22.field2324 * arg2 + var22.field2317 * arg3) / (var22.field2314 * var7) + arg0;
                var8.field606[var9] = method837(var19, var23);
                class93 var24;
                if (this.field2476 != null && this.field2476[this.field2450[var9]] != null) {
                    var24 = this.field2476[this.field2450[var9]];
                } else {
                    var24 = this.field2472[this.field2450[var9]];
                }
                int var25 = (var24.field2310 * arg4 + var24.field2324 * arg2 + var24.field2317 * arg3) / (var24.field2314 * var7) + arg0;
                var8.field603[var9] = method837(var19, var25);
            }
        }
        this.method827();
        var8.field596 = this.field2462;
        var8.field591 = this.field2475;
        var8.field598 = this.field2474;
        var8.field583 = this.field2453;
        var8.field597 = this.field2471;
        var8.field586 = this.field2466;
        var8.field599 = this.field2469;
        var8.field608 = this.field2450;
        var8.field595 = this.field2459;
        var8.field593 = this.field2460;
        var8.field604 = this.field2442;
        if (var8.field604 != null) {
            var8.field588 = this.field2465;
        } else {
            var8.field588 = null;
        }
        var8.field590 = this.field2445;
        var8.field605 = this.field2452;
        var8.field610 = this.field2448;
        var8.field589 = this.field2443;
        var8.field609 = this.field2458;
        var8.field613 = this.field2464;
        var8.field600 = this.field2444;
        return var8;
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "()V")
    public final void method839() {
        for (int var1 = 0; var1 < this.field2462; ++var1) {
            this.field2475[var1] = -this.field2475[var1];
            this.field2453[var1] = -this.field2453[var1];
        }
        this.method832();
    }

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "()V")
    public final void method840() {
        for (int var1 = 0; var1 < this.field2462; ++var1) {
            int var2 = this.field2475[var1];
            this.field2475[var1] = this.field2453[var1];
            this.field2453[var1] = -var2;
        }
        this.method832();
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V")
    public final void method841(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2462; ++var4) {
            this.field2475[var4] += arg0;
            this.field2474[var4] += arg1;
            this.field2453[var4] += arg2;
        }
        this.method832();
    }

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "()V")
    public final void method842() {
        if (this.field2472 == null) {
            this.field2472 = new class93[this.field2462];
            for (int var1 = 0; var1 < this.field2462; ++var1) {
                this.field2472[var1] = new class93();
            }
            for (int var2 = 0; var2 < this.field2471; ++var2) {
                int var3 = this.field2466[var2];
                int var4 = this.field2469[var2];
                int var5 = this.field2450[var2];
                int var6 = this.field2475[var4] - this.field2475[var3];
                int var7 = this.field2474[var4] - this.field2474[var3];
                int var8 = this.field2453[var4] - this.field2453[var3];
                int var9 = this.field2475[var5] - this.field2475[var3];
                int var10 = this.field2474[var5] - this.field2474[var3];
                int var11 = this.field2453[var5] - this.field2453[var3];
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
                if (this.field2457 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field2457[var2];
                }
                if (var19 == 0) {
                    class93 var20 = this.field2472[var3];
                    var20.field2324 += var16;
                    var20.field2317 += var17;
                    var20.field2310 += var18;
                    ++var20.field2314;
                    class93 var21 = this.field2472[var4];
                    var21.field2324 += var16;
                    var21.field2317 += var17;
                    var21.field2310 += var18;
                    ++var21.field2314;
                    class93 var22 = this.field2472[var5];
                    var22.field2324 += var16;
                    var22.field2317 += var17;
                    var22.field2310 += var18;
                    ++var22.field2314;
                } else if (var19 == 1) {
                    if (this.field2447 == null) {
                        this.field2447 = new class6[this.field2471];
                    }
                    class6 var23 = this.field2447[var2] = new class6();
                    var23.field111 = var16;
                    var23.field117 = var17;
                    var23.field107 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIZ)Lpa;")
    public final class101 method843(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
            return this;
        } else {
            class101 var6;
            if (arg4) {
                var6 = new class101();
                var6.field2462 = this.field2462;
                var6.field2471 = this.field2471;
                var6.field2452 = this.field2452;
                var6.field2475 = this.field2475;
                var6.field2453 = this.field2453;
                var6.field2466 = this.field2466;
                var6.field2469 = this.field2469;
                var6.field2450 = this.field2450;
                var6.field2457 = this.field2457;
                var6.field2459 = this.field2459;
                var6.field2460 = this.field2460;
                var6.field2442 = this.field2442;
                var6.field2465 = this.field2465;
                var6.field2445 = this.field2445;
                var6.field2448 = this.field2448;
                var6.field2443 = this.field2443;
                var6.field2458 = this.field2458;
                var6.field2451 = this.field2451;
                var6.field2470 = this.field2470;
                var6.field2464 = this.field2464;
                var6.field2444 = this.field2444;
                var6.field2456 = this.field2456;
                var6.field2468 = this.field2468;
                var6.field2474 = new int[var6.field2462];
            } else {
                var6 = this;
            }
            int var7 = (arg0 + arg1 + arg2 + arg3) / 4;
            for (int var8 = 0; var8 < var6.field2462; ++var8) {
                int var9 = this.field2475[var8];
                int var10 = this.field2474[var8];
                int var11 = this.field2453[var8];
                int var12 = (arg1 - arg0) * (var9 + 64) / 128 + arg0;
                int var13 = (arg2 - arg3) * (var9 + 64) / 128 + arg3;
                int var14 = (var13 - var12) * (var11 + 64) / 128 + var12;
                var6.field2474[var8] = var10 + var14 - var7;
            }
            var6.method832();
            return var6;
        }
    }

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "()V")
    public final void method844() {
        for (int var1 = 0; var1 < this.field2462; ++var1) {
            this.field2453[var1] = -this.field2453[var1];
        }
        for (int var2 = 0; var2 < this.field2471; ++var2) {
            int var3 = this.field2466[var2];
            this.field2466[var2] = this.field2450[var2];
            this.field2450[var2] = var3;
        }
        this.method832();
    }

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "()V")
    private final void method845() {
        if (!this.field2446) {
            super.field1668 = 0;
            this.field2454 = 0;
            this.field2449 = 999999;
            this.field2441 = -999999;
            this.field2455 = -99999;
            this.field2467 = 99999;
            for (int var1 = 0; var1 < this.field2462; ++var1) {
                int var2 = this.field2475[var1];
                int var3 = this.field2474[var1];
                int var4 = this.field2453[var1];
                if (var2 < this.field2449) {
                    this.field2449 = var2;
                }
                if (var2 > this.field2441) {
                    this.field2441 = var2;
                }
                if (var4 < this.field2467) {
                    this.field2467 = var4;
                }
                if (var4 > this.field2455) {
                    this.field2455 = var4;
                }
                if (-var3 > super.field1668) {
                    super.field1668 = -var3;
                }
                if (var3 > this.field2454) {
                    this.field2454 = var3;
                }
            }
            this.field2446 = true;
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    private class101() {
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "([B)V")
    private class101(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class51 var4 = new class51(arg0);
        class51 var5 = new class51(arg0);
        class51 var6 = new class51(arg0);
        class51 var7 = new class51(arg0);
        class51 var8 = new class51(arg0);
        var4.field1128 = arg0.length - 18;
        int var9 = var4.method383(-2056200760);
        int var10 = var4.method383(-2056200760);
        int var11 = var4.method373(25094);
        int var12 = var4.method373(25094);
        int var13 = var4.method373(25094);
        int var14 = var4.method373(25094);
        int var15 = var4.method373(25094);
        int var16 = var4.method373(25094);
        int var17 = var4.method383(-2056200760);
        int var18 = var4.method383(-2056200760);
        int var19 = var4.method383(-2056200760);
        int var20 = var4.method383(-2056200760);
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
        this.field2462 = var9;
        this.field2471 = var10;
        this.field2452 = var11;
        this.field2475 = new int[var9];
        this.field2474 = new int[var9];
        this.field2453 = new int[var9];
        this.field2466 = new int[var10];
        this.field2469 = new int[var10];
        this.field2450 = new int[var10];
        if (var11 > 0) {
            this.field2448 = new int[var11];
            this.field2443 = new int[var11];
            this.field2458 = new int[var11];
        }
        if (var16 == 1) {
            this.field2451 = new int[var9];
        }
        if (var12 == 1) {
            this.field2457 = new byte[var10];
            this.field2442 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2459 = new byte[var10];
        } else {
            this.field2445 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2460 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2470 = new int[var10];
        }
        this.field2465 = new short[var10];
        var4.field1128 = var21;
        var5.field1128 = var36;
        var6.field1128 = var38;
        var7.field1128 = var40;
        var8.field1128 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var59 = var4.method373(25094);
            int var60 = 0;
            if ((var59 & 1) != 0) {
                var60 = var5.method410(-30497);
            }
            int var61 = 0;
            if ((var59 & 2) != 0) {
                var61 = var6.method410(-30497);
            }
            int var62 = 0;
            if ((var59 & 4) != 0) {
                var62 = var7.method410(-30497);
            }
            this.field2475[var46] = var43 + var60;
            this.field2474[var46] = var44 + var61;
            this.field2453[var46] = var45 + var62;
            var43 = this.field2475[var46];
            var44 = this.field2474[var46];
            var45 = this.field2453[var46];
            if (var16 == 1) {
                this.field2451[var46] = var8.method373(25094);
            }
        }
        var4.field1128 = var32;
        var5.field1128 = var28;
        var6.field1128 = var26;
        var7.field1128 = var30;
        var8.field1128 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field2465[var47] = (short) var4.method383(-2056200760);
            if (var12 == 1) {
                int var58 = var5.method373(25094);
                if ((var58 & 1) == 1) {
                    this.field2457[var47] = 1;
                    var3 = true;
                } else {
                    this.field2457[var47] = 0;
                }
                if ((var58 & 2) == 2) {
                    this.field2442[var47] = (byte) (var58 >> 2);
                    var2 = true;
                } else {
                    this.field2442[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2459[var47] = var6.method412((byte) -84);
            }
            if (var14 == 1) {
                this.field2460[var47] = var7.method412((byte) -84);
            }
            if (var15 == 1) {
                this.field2470[var47] = var8.method373(25094);
            }
        }
        var4.field1128 = var25;
        var5.field1128 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var54 = var5.method373(25094);
            if (var54 == 1) {
                var48 = var4.method410(-30497) + var51;
                var49 = var4.method410(-30497) + var48;
                var50 = var4.method410(-30497) + var49;
                var51 = var50;
                this.field2466[var52] = var48;
                this.field2469[var52] = var49;
                this.field2450[var52] = var50;
            }
            if (var54 == 2) {
                var49 = var50;
                var50 = var4.method410(-30497) + var51;
                var51 = var50;
                this.field2466[var52] = var48;
                this.field2469[var52] = var49;
                this.field2450[var52] = var50;
            }
            if (var54 == 3) {
                var48 = var50;
                var50 = var4.method410(-30497) + var51;
                var51 = var50;
                this.field2466[var52] = var48;
                this.field2469[var52] = var49;
                this.field2450[var52] = var50;
            }
            if (var54 == 4) {
                int var57 = var48;
                var48 = var49;
                var49 = var57;
                var50 = var4.method410(-30497) + var51;
                var51 = var50;
                this.field2466[var52] = var48;
                this.field2469[var52] = var57;
                this.field2450[var52] = var50;
            }
        }
        var4.field1128 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field2448[var53] = var4.method383(-2056200760);
            this.field2443[var53] = var4.method383(-2056200760);
            this.field2458[var53] = var4.method383(-2056200760);
        }
        if (!var2) {
            this.field2442 = null;
        }
        if (!var3) {
            this.field2457 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "([Lpa;I)V")
    public class101(class101[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        this.field2462 = 0;
        this.field2471 = 0;
        this.field2452 = 0;
        this.field2445 = -1;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class101 var14 = arg0[var8];
            if (var14 != null) {
                this.field2462 += var14.field2462;
                this.field2471 += var14.field2471;
                this.field2452 += var14.field2452;
                if (var14.field2459 != null) {
                    var4 = true;
                } else {
                    if (this.field2445 == -1) {
                        this.field2445 = var14.field2445;
                    }
                    if (this.field2445 != var14.field2445) {
                        var4 = true;
                    }
                }
                var3 |= var14.field2457 != null;
                var5 |= var14.field2460 != null;
                var6 |= var14.field2470 != null;
                var7 |= var14.field2442 != null;
            }
        }
        this.field2475 = new int[this.field2462];
        this.field2474 = new int[this.field2462];
        this.field2453 = new int[this.field2462];
        this.field2451 = new int[this.field2462];
        this.field2466 = new int[this.field2471];
        this.field2469 = new int[this.field2471];
        this.field2450 = new int[this.field2471];
        if (this.field2452 > 0) {
            this.field2448 = new int[this.field2452];
            this.field2443 = new int[this.field2452];
            this.field2458 = new int[this.field2452];
        }
        if (var3) {
            this.field2457 = new byte[this.field2471];
        }
        if (var4) {
            this.field2459 = new byte[this.field2471];
        }
        if (var5) {
            this.field2460 = new byte[this.field2471];
        }
        if (var7) {
            this.field2442 = new byte[this.field2471];
        }
        if (var6) {
            this.field2470 = new int[this.field2471];
        }
        this.field2465 = new short[this.field2471];
        this.field2462 = 0;
        this.field2471 = 0;
        this.field2452 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class101 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field2471; ++var12) {
                    if (var3 && var11.field2457 != null) {
                        this.field2457[this.field2471] = var11.field2457[var12];
                    }
                    if (var4) {
                        if (var11.field2459 != null) {
                            this.field2459[this.field2471] = var11.field2459[var12];
                        } else {
                            this.field2459[this.field2471] = var11.field2445;
                        }
                    }
                    if (var5 && var11.field2460 != null) {
                        this.field2460[this.field2471] = var11.field2460[var12];
                    }
                    if (var7) {
                        if (var11.field2442 != null && var11.field2442[var12] != -1) {
                            this.field2442[this.field2471] = (byte) (var11.field2442[var12] + var9);
                        } else {
                            this.field2442[this.field2471] = -1;
                        }
                    }
                    if (var6 && var11.field2470 != null) {
                        this.field2470[this.field2471] = var11.field2470[var12];
                    }
                    this.field2465[this.field2471] = var11.field2465[var12];
                    this.field2466[this.field2471] = this.method830(var11, var11.field2466[var12]);
                    this.field2469[this.field2471] = this.method830(var11, var11.field2469[var12]);
                    this.field2450[this.field2471] = this.method830(var11, var11.field2450[var12]);
                    ++this.field2471;
                }
                for (int var13 = 0; var13 < var11.field2452; ++var13) {
                    this.field2448[this.field2452] = this.method830(var11, var11.field2448[var13]);
                    this.field2443[this.field2452] = this.method830(var11, var11.field2443[var13]);
                    this.field2458[this.field2452] = this.method830(var11, var11.field2458[var13]);
                    ++this.field2452;
                }
                var9 += var11.field2452;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)V")
    public final void method846(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2462; ++var4) {
            this.field2475[var4] = this.field2475[var4] * arg0 / 128;
            this.field2474[var4] = this.field2474[var4] * arg1 / 128;
            this.field2453[var4] = this.field2453[var4] * arg2 / 128;
        }
        this.method832();
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lpa;ZZZ)V")
    public class101(class101 arg0, boolean arg1, boolean arg2, boolean arg3) {
        this.field2462 = arg0.field2462;
        this.field2471 = arg0.field2471;
        this.field2452 = arg0.field2452;
        if (arg1) {
            this.field2475 = arg0.field2475;
            this.field2474 = arg0.field2474;
            this.field2453 = arg0.field2453;
        } else {
            this.field2475 = new int[this.field2462];
            this.field2474 = new int[this.field2462];
            this.field2453 = new int[this.field2462];
            for (int var5 = 0; var5 < this.field2462; ++var5) {
                this.field2475[var5] = arg0.field2475[var5];
                this.field2474[var5] = arg0.field2474[var5];
                this.field2453[var5] = arg0.field2453[var5];
            }
        }
        if (arg2) {
            this.field2465 = arg0.field2465;
        } else {
            this.field2465 = new short[this.field2471];
            for (int var6 = 0; var6 < this.field2471; ++var6) {
                this.field2465[var6] = arg0.field2465[var6];
            }
        }
        if (arg3) {
            this.field2460 = arg0.field2460;
        } else {
            this.field2460 = new byte[this.field2471];
            if (arg0.field2460 == null) {
                for (int var7 = 0; var7 < this.field2471; ++var7) {
                    this.field2460[var7] = 0;
                }
            } else {
                for (int var8 = 0; var8 < this.field2471; ++var8) {
                    this.field2460[var8] = arg0.field2460[var8];
                }
            }
        }
        this.field2466 = arg0.field2466;
        this.field2469 = arg0.field2469;
        this.field2450 = arg0.field2450;
        this.field2457 = arg0.field2457;
        this.field2459 = arg0.field2459;
        this.field2442 = arg0.field2442;
        this.field2445 = arg0.field2445;
        this.field2448 = arg0.field2448;
        this.field2443 = arg0.field2443;
        this.field2458 = arg0.field2458;
        this.field2451 = arg0.field2451;
        this.field2470 = arg0.field2470;
        this.field2464 = arg0.field2464;
        this.field2444 = arg0.field2444;
        this.field2472 = arg0.field2472;
        this.field2447 = arg0.field2447;
        this.field2476 = arg0.field2476;
        this.field2456 = arg0.field2456;
        this.field2468 = arg0.field2468;
    }

    static {
        int var0 = 0;
        int var1 = 248;
        while (var0 < 9) {
            field2440[var0++] = 255;
        }
        while (var0 < 16) {
            field2440[var0++] = var1;
            var1 -= 8;
        }
        while (var0 < 32) {
            field2440[var0++] = var1;
            var1 -= 4;
        }
        while (var0 < 64) {
            field2440[var0++] = var1;
            var1 -= 2;
        }
        while (var0 < 128) {
            field2440[var0++] = var1--;
        }
    }
}
