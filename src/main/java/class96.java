import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class96 extends class50 {

    @OriginalMember(owner = "client!nf", name = "ob", descriptor = "B")
    private byte field2341 = 0;

    @OriginalMember(owner = "client!nf", name = "nb", descriptor = "I")
    private int field2340 = 0;

    @OriginalMember(owner = "client!nf", name = "yb", descriptor = "I")
    private int field2351 = 0;

    @OriginalMember(owner = "client!nf", name = "Nb", descriptor = "I")
    private int field2366 = 0;

    @OriginalMember(owner = "client!nf", name = "Sb", descriptor = "Z")
    private boolean field2371 = false;

    @OriginalMember(owner = "client!nf", name = "pb", descriptor = "[I")
    private int[] field2342;

    @OriginalMember(owner = "client!nf", name = "vb", descriptor = "[I")
    private int[] field2348;

    @OriginalMember(owner = "client!nf", name = "lb", descriptor = "[I")
    private int[] field2338;

    @OriginalMember(owner = "client!nf", name = "qb", descriptor = "[I")
    private int[] field2343;

    @OriginalMember(owner = "client!nf", name = "Ab", descriptor = "[I")
    private int[] field2353;

    @OriginalMember(owner = "client!nf", name = "Ob", descriptor = "[I")
    private int[] field2367;

    @OriginalMember(owner = "client!nf", name = "rb", descriptor = "[I")
    private int[] field2344;

    @OriginalMember(owner = "client!nf", name = "sb", descriptor = "[I")
    private int[] field2345;

    @OriginalMember(owner = "client!nf", name = "mb", descriptor = "[I")
    private int[] field2339;

    @OriginalMember(owner = "client!nf", name = "Rb", descriptor = "[I")
    private int[] field2370;

    @OriginalMember(owner = "client!nf", name = "Pb", descriptor = "[B")
    private byte[] field2368;

    @OriginalMember(owner = "client!nf", name = "Cb", descriptor = "[B")
    private byte[] field2355;

    @OriginalMember(owner = "client!nf", name = "Gb", descriptor = "[B")
    private byte[] field2359;

    @OriginalMember(owner = "client!nf", name = "Jb", descriptor = "[B")
    private byte[] field2362;

    @OriginalMember(owner = "client!nf", name = "Tb", descriptor = "[I")
    private int[] field2372;

    @OriginalMember(owner = "client!nf", name = "Ub", descriptor = "[S")
    private short[] field2373;

    @OriginalMember(owner = "client!nf", name = "Vb", descriptor = "[[I")
    private int[][] field2374;

    @OriginalMember(owner = "client!nf", name = "Hb", descriptor = "[[I")
    private int[][] field2360;

    @OriginalMember(owner = "client!nf", name = "Lb", descriptor = "[Ljb;")
    private class64[] field2364;

    @OriginalMember(owner = "client!nf", name = "Kb", descriptor = "[Led;")
    private class33[] field2363;

    @OriginalMember(owner = "client!nf", name = "ub", descriptor = "[Ljb;")
    private class64[] field2347;

    @OriginalMember(owner = "client!nf", name = "Fb", descriptor = "S")
    public short field2358;

    @OriginalMember(owner = "client!nf", name = "Mb", descriptor = "S")
    public short field2365;

    @OriginalMember(owner = "client!nf", name = "Ib", descriptor = "[I")
    private static int[] field2361 = new int[128];

    @OriginalMember(owner = "client!nf", name = "Eb", descriptor = "I")
    private static int field2357 = 0;

    @OriginalMember(owner = "client!nf", name = "Bb", descriptor = "[I")
    private static int[] field2354 = new int[10000];

    @OriginalMember(owner = "client!nf", name = "Db", descriptor = "[I")
    private static int[] field2356 = new int[10000];

    @OriginalMember(owner = "client!nf", name = "tb", descriptor = "I")
    private int field2346;

    @OriginalMember(owner = "client!nf", name = "wb", descriptor = "I")
    private int field2349;

    @OriginalMember(owner = "client!nf", name = "xb", descriptor = "I")
    private int field2350;

    @OriginalMember(owner = "client!nf", name = "zb", descriptor = "I")
    private int field2352;

    @OriginalMember(owner = "client!nf", name = "Qb", descriptor = "I")
    private int field2369;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lnf;Lnf;IIIZ)V")
    public static final void method748(class96 arg0, class96 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method765();
        arg0.method760();
        arg1.method765();
        arg1.method760();
        ++field2357;
        int var6 = 0;
        int[] var7 = arg1.field2342;
        int var8 = arg1.field2340;
        for (int var9 = 0; var9 < arg0.field2340; ++var9) {
            class64 var12 = arg0.field2364[var9];
            if (var12.field1588 != 0) {
                int var13 = arg0.field2348[var9] - arg3;
                if (var13 <= arg1.field2349) {
                    int var14 = arg0.field2342[var9] - arg2;
                    if (var14 >= arg1.field2346 && var14 <= arg1.field2350) {
                        int var15 = arg0.field2338[var9] - arg4;
                        if (var15 >= arg1.field2369 && var15 <= arg1.field2352) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class64 var17 = arg1.field2364[var16];
                                if (var7[var16] == var14 && arg1.field2338[var16] == var15 && arg1.field2348[var16] == var13 && var17.field1588 != 0) {
                                    if (arg0.field2347 == null) {
                                        arg0.field2347 = new class64[arg0.field2340];
                                    }
                                    if (arg1.field2347 == null) {
                                        arg1.field2347 = new class64[var8];
                                    }
                                    class64 var18 = arg0.field2347[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field2347[var9] = new class64(var12);
                                    }
                                    class64 var19 = arg1.field2347[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field2347[var16] = new class64(var17);
                                    }
                                    var18.field1589 += var17.field1589;
                                    var18.field1601 += var17.field1601;
                                    var18.field1594 += var17.field1594;
                                    var18.field1588 += var17.field1588;
                                    var19.field1589 += var12.field1589;
                                    var19.field1601 += var12.field1601;
                                    var19.field1594 += var12.field1594;
                                    var19.field1588 += var12.field1588;
                                    ++var6;
                                    field2354[var9] = field2357;
                                    field2356[var16] = field2357;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field2366; ++var10) {
                if (field2354[arg0.field2343[var10]] == field2357 && field2354[arg0.field2353[var10]] == field2357 && field2354[arg0.field2367[var10]] == field2357) {
                    if (arg0.field2368 == null) {
                        arg0.field2368 = new byte[arg0.field2366];
                    }
                    arg0.field2368[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field2366; ++var11) {
                if (field2356[arg1.field2343[var11]] == field2357 && field2356[arg1.field2353[var11]] == field2357 && field2356[arg1.field2367[var11]] == field2357) {
                    if (arg1.field2368 == null) {
                        arg1.field2368 = new byte[arg1.field2366];
                    }
                    arg1.field2368[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII)Lka;")
    public final class70 method749(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method760();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class70 var8 = new class70();
        var8.field1666 = new int[this.field2366];
        var8.field1677 = new int[this.field2366];
        var8.field1685 = new int[this.field2366];
        for (int var9 = 0; var9 < this.field2366; ++var9) {
            byte var10;
            if (this.field2368 == null) {
                var10 = 0;
            } else {
                var10 = this.field2368[var9];
            }
            if (this.field2355 != null && this.field2355[var9] != -1) {
                if (var10 != 0) {
                    if (var10 == 1) {
                        class33 var17 = this.field2363[var9];
                        int var18 = (var17.field774 * arg4 + var17.field780 * arg2 + var17.field762 * arg3) / (var7 / 2 + var7) + arg0;
                        var8.field1666[var9] = method757(var18);
                        var8.field1685[var9] = -1;
                    } else {
                        var8.field1685[var9] = -2;
                    }
                } else {
                    class64 var11;
                    if (this.field2347 != null && this.field2347[this.field2343[var9]] != null) {
                        var11 = this.field2347[this.field2343[var9]];
                    } else {
                        var11 = this.field2364[this.field2343[var9]];
                    }
                    int var12 = (var11.field1594 * arg4 + var11.field1601 * arg3 + var11.field1589 * arg2) / (var11.field1588 * var7) + arg0;
                    var8.field1666[var9] = method757(var12);
                    class64 var13;
                    if (this.field2347 != null && this.field2347[this.field2353[var9]] != null) {
                        var13 = this.field2347[this.field2353[var9]];
                    } else {
                        var13 = this.field2364[this.field2353[var9]];
                    }
                    int var14 = (var13.field1594 * arg4 + var13.field1601 * arg3 + var13.field1589 * arg2) / (var13.field1588 * var7) + arg0;
                    var8.field1677[var9] = method757(var14);
                    class64 var15;
                    if (this.field2347 != null && this.field2347[this.field2367[var9]] != null) {
                        var15 = this.field2347[this.field2367[var9]];
                    } else {
                        var15 = this.field2364[this.field2367[var9]];
                    }
                    int var16 = (var15.field1594 * arg4 + var15.field1601 * arg3 + var15.field1589 * arg2) / (var15.field1588 * var7) + arg0;
                    var8.field1685[var9] = method757(var16);
                }
            } else if (var10 != 0) {
                if (var10 == 1) {
                    class33 var26 = this.field2363[var9];
                    int var27 = (var26.field774 * arg4 + var26.field780 * arg2 + var26.field762 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1666[var9] = method762(this.field2373[var9] & 65535, var27);
                    var8.field1685[var9] = -1;
                } else {
                    var8.field1685[var9] = -2;
                }
            } else {
                int var19 = this.field2373[var9] & 65535;
                class64 var20;
                if (this.field2347 != null && this.field2347[this.field2343[var9]] != null) {
                    var20 = this.field2347[this.field2343[var9]];
                } else {
                    var20 = this.field2364[this.field2343[var9]];
                }
                int var21 = (var20.field1594 * arg4 + var20.field1601 * arg3 + var20.field1589 * arg2) / (var20.field1588 * var7) + arg0;
                var8.field1666[var9] = method762(var19, var21);
                class64 var22;
                if (this.field2347 != null && this.field2347[this.field2353[var9]] != null) {
                    var22 = this.field2347[this.field2353[var9]];
                } else {
                    var22 = this.field2364[this.field2353[var9]];
                }
                int var23 = (var22.field1594 * arg4 + var22.field1601 * arg3 + var22.field1589 * arg2) / (var22.field1588 * var7) + arg0;
                var8.field1677[var9] = method762(var19, var23);
                class64 var24;
                if (this.field2347 != null && this.field2347[this.field2367[var9]] != null) {
                    var24 = this.field2347[this.field2367[var9]];
                } else {
                    var24 = this.field2364[this.field2367[var9]];
                }
                int var25 = (var24.field1594 * arg4 + var24.field1601 * arg3 + var24.field1589 * arg2) / (var24.field1588 * var7) + arg0;
                var8.field1685[var9] = method762(var19, var25);
            }
        }
        this.method758();
        var8.field1689 = this.field2340;
        var8.field1676 = this.field2342;
        var8.field1681 = this.field2348;
        var8.field1662 = this.field2338;
        var8.field1663 = this.field2366;
        var8.field1664 = this.field2343;
        var8.field1667 = this.field2353;
        var8.field1678 = this.field2367;
        var8.field1661 = this.field2359;
        var8.field1674 = this.field2362;
        var8.field1672 = this.field2355;
        if (var8.field1672 != null) {
            var8.field1670 = this.field2373;
        } else {
            var8.field1670 = null;
        }
        var8.field1675 = this.field2341;
        var8.field1680 = this.field2351;
        var8.field1684 = this.field2344;
        var8.field1671 = this.field2345;
        var8.field1687 = this.field2339;
        var8.field1686 = this.field2374;
        var8.field1673 = this.field2360;
        return var8;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lnf;I)I")
    private final int method750(class96 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2342[arg1];
        int var5 = arg0.field2348[arg1];
        int var6 = arg0.field2338[arg1];
        for (int var7 = 0; var7 < this.field2340; ++var7) {
            if (this.field2342[var7] == var4 && this.field2348[var7] == var5 && this.field2338[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2342[this.field2340] = var4;
            this.field2348[this.field2340] = var5;
            this.field2338[this.field2340] = var6;
            if (arg0.field2370 != null) {
                this.field2370[this.field2340] = arg0.field2370[arg1];
            }
            var3 = this.field2340++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lie;II)Lnf;")
    public static final class96 method751(class61 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method473((byte) 108, arg1, arg2);
        return var3 == null ? null : new class96(var3);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "()Lnf;")
    public final class96 method752() {
        class96 var1 = new class96();
        if (this.field2368 != null) {
            var1.field2368 = new byte[this.field2366];
            for (int var2 = 0; var2 < this.field2366; ++var2) {
                var1.field2368[var2] = this.field2368[var2];
            }
        }
        var1.field2340 = this.field2340;
        var1.field2366 = this.field2366;
        var1.field2351 = this.field2351;
        var1.field2342 = this.field2342;
        var1.field2348 = this.field2348;
        var1.field2338 = this.field2338;
        var1.field2343 = this.field2343;
        var1.field2353 = this.field2353;
        var1.field2367 = this.field2367;
        var1.field2359 = this.field2359;
        var1.field2362 = this.field2362;
        var1.field2355 = this.field2355;
        var1.field2373 = this.field2373;
        var1.field2341 = this.field2341;
        var1.field2344 = this.field2344;
        var1.field2345 = this.field2345;
        var1.field2339 = this.field2339;
        var1.field2370 = this.field2370;
        var1.field2372 = this.field2372;
        var1.field2374 = this.field2374;
        var1.field2360 = this.field2360;
        var1.field2364 = this.field2364;
        var1.field2363 = this.field2363;
        var1.field2358 = this.field2358;
        var1.field2365 = this.field2365;
        return var1;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "()V")
    public static void method753() {
        field2354 = null;
        field2356 = null;
        field2361 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(SS)V")
    public final void method754(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2366; ++var3) {
            if (this.field2373[var3] == arg0) {
                this.field2373[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V")
    public final void method755(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2340; ++var4) {
            this.field2342[var4] += arg0;
            this.field2348[var4] += arg1;
            this.field2338[var4] += arg2;
        }
        this.method763();
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "()V")
    public final void method756() {
        for (int var1 = 0; var1 < this.field2340; ++var1) {
            this.field2342[var1] = -this.field2342[var1];
            this.field2338[var1] = -this.field2338[var1];
        }
        this.method763();
    }

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "(I)I")
    private static final int method757(int arg0) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 > 127) {
            arg0 = 127;
        }
        return field2361[arg0];
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "()V")
    private final void method758() {
        int var10002;
        if (this.field2370 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2340; ++var3) {
                int var7 = this.field2370[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2374 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field2374[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2340) {
                int var6 = this.field2370[var5];
                this.field2374[var6][var1[var6]++] = var5++;
            }
            this.field2370 = null;
        }
        if (this.field2372 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field2366; ++var10) {
                int var14 = this.field2372[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field2360 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field2360[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field2366) {
                int var13 = this.field2372[var12];
                this.field2360[var13][var8[var13]++] = var12++;
            }
            this.field2372 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "()V")
    public final void method759() {
        for (int var1 = 0; var1 < this.field2340; ++var1) {
            this.field2338[var1] = -this.field2338[var1];
        }
        for (int var2 = 0; var2 < this.field2366; ++var2) {
            int var3 = this.field2343[var2];
            this.field2343[var2] = this.field2367[var2];
            this.field2367[var2] = var3;
        }
        this.method763();
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "()V")
    public final void method760() {
        if (this.field2364 == null) {
            this.field2364 = new class64[this.field2340];
            for (int var1 = 0; var1 < this.field2340; ++var1) {
                this.field2364[var1] = new class64();
            }
            for (int var2 = 0; var2 < this.field2366; ++var2) {
                int var3 = this.field2343[var2];
                int var4 = this.field2353[var2];
                int var5 = this.field2367[var2];
                int var6 = this.field2342[var4] - this.field2342[var3];
                int var7 = this.field2348[var4] - this.field2348[var3];
                int var8 = this.field2338[var4] - this.field2338[var3];
                int var9 = this.field2342[var5] - this.field2342[var3];
                int var10 = this.field2348[var5] - this.field2348[var3];
                int var11 = this.field2338[var5] - this.field2338[var3];
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
                if (this.field2368 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field2368[var2];
                }
                if (var19 == 0) {
                    class64 var20 = this.field2364[var3];
                    var20.field1589 += var16;
                    var20.field1601 += var17;
                    var20.field1594 += var18;
                    ++var20.field1588;
                    class64 var21 = this.field2364[var4];
                    var21.field1589 += var16;
                    var21.field1601 += var17;
                    var21.field1594 += var18;
                    ++var21.field1588;
                    class64 var22 = this.field2364[var5];
                    var22.field1589 += var16;
                    var22.field1601 += var17;
                    var22.field1594 += var18;
                    ++var22.field1588;
                } else if (var19 == 1) {
                    if (this.field2363 == null) {
                        this.field2363 = new class33[this.field2366];
                    }
                    class33 var23 = this.field2363[var2] = new class33();
                    var23.field780 = var16;
                    var23.field762 = var17;
                    var23.field774 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "()V")
    public final void method761() {
        for (int var1 = 0; var1 < this.field2340; ++var1) {
            int var2 = this.field2342[var1];
            this.field2342[var1] = this.field2338[var1];
            this.field2338[var1] = -var2;
        }
        this.method763();
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)I")
    private static final int method762(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "()V")
    private final void method763() {
        this.field2364 = null;
        this.field2347 = null;
        this.field2363 = null;
        this.field2371 = false;
    }

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "()V")
    public final void method764() {
        for (int var1 = 0; var1 < this.field2340; ++var1) {
            int var2 = this.field2338[var1];
            this.field2338[var1] = this.field2342[var1];
            this.field2342[var1] = -var2;
        }
        this.method763();
    }

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "()V")
    private final void method765() {
        if (!this.field2371) {
            super.field1272 = 0;
            this.field2349 = 0;
            this.field2346 = 999999;
            this.field2350 = -999999;
            this.field2352 = -99999;
            this.field2369 = 99999;
            for (int var1 = 0; var1 < this.field2340; ++var1) {
                int var2 = this.field2342[var1];
                int var3 = this.field2348[var1];
                int var4 = this.field2338[var1];
                if (var2 < this.field2346) {
                    this.field2346 = var2;
                }
                if (var2 > this.field2350) {
                    this.field2350 = var2;
                }
                if (var4 < this.field2369) {
                    this.field2369 = var4;
                }
                if (var4 > this.field2352) {
                    this.field2352 = var4;
                }
                if (-var3 > super.field1272) {
                    super.field1272 = -var3;
                }
                if (var3 > this.field2349) {
                    this.field2349 = var3;
                }
            }
            this.field2371 = true;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(III)V")
    public final void method766(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2340; ++var4) {
            this.field2342[var4] = this.field2342[var4] * arg0 / 128;
            this.field2348[var4] = this.field2348[var4] * arg1 / 128;
            this.field2338[var4] = this.field2338[var4] * arg2 / 128;
        }
        this.method763();
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIZ)Lnf;")
    public final class96 method767(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
            return this;
        } else {
            class96 var6;
            if (arg4) {
                var6 = new class96();
                var6.field2340 = this.field2340;
                var6.field2366 = this.field2366;
                var6.field2351 = this.field2351;
                var6.field2342 = this.field2342;
                var6.field2338 = this.field2338;
                var6.field2343 = this.field2343;
                var6.field2353 = this.field2353;
                var6.field2367 = this.field2367;
                var6.field2368 = this.field2368;
                var6.field2359 = this.field2359;
                var6.field2362 = this.field2362;
                var6.field2355 = this.field2355;
                var6.field2373 = this.field2373;
                var6.field2341 = this.field2341;
                var6.field2344 = this.field2344;
                var6.field2345 = this.field2345;
                var6.field2339 = this.field2339;
                var6.field2370 = this.field2370;
                var6.field2372 = this.field2372;
                var6.field2374 = this.field2374;
                var6.field2360 = this.field2360;
                var6.field2358 = this.field2358;
                var6.field2365 = this.field2365;
                var6.field2348 = new int[var6.field2340];
            } else {
                var6 = this;
            }
            int var7 = (arg0 + arg1 + arg2 + arg3) / 4;
            for (int var8 = 0; var8 < var6.field2340; ++var8) {
                int var9 = this.field2342[var8];
                int var10 = this.field2348[var8];
                int var11 = this.field2338[var8];
                int var12 = (arg1 - arg0) * (var9 + 64) / 128 + arg0;
                int var13 = (arg2 - arg3) * (var9 + 64) / 128 + arg3;
                int var14 = (var13 - var12) * (var11 + 64) / 128 + var12;
                var6.field2348[var8] = var10 + var14 - var7;
            }
            var6.method763();
            return var6;
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
    private class96() {
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([B)V")
    private class96(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class103 var4 = new class103(arg0);
        class103 var5 = new class103(arg0);
        class103 var6 = new class103(arg0);
        class103 var7 = new class103(arg0);
        class103 var8 = new class103(arg0);
        var4.field2501 = arg0.length - 18;
        int var9 = var4.method808(-20054);
        int var10 = var4.method808(-20054);
        int var11 = var4.method829((byte) -102);
        int var12 = var4.method829((byte) -76);
        int var13 = var4.method829((byte) 86);
        int var14 = var4.method829((byte) 44);
        int var15 = var4.method829((byte) 47);
        int var16 = var4.method829((byte) -109);
        int var17 = var4.method808(-20054);
        int var18 = var4.method808(-20054);
        int var19 = var4.method808(-20054);
        int var20 = var4.method808(-20054);
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
        this.field2340 = var9;
        this.field2366 = var10;
        this.field2351 = var11;
        this.field2342 = new int[var9];
        this.field2348 = new int[var9];
        this.field2338 = new int[var9];
        this.field2343 = new int[var10];
        this.field2353 = new int[var10];
        this.field2367 = new int[var10];
        if (var11 > 0) {
            this.field2344 = new int[var11];
            this.field2345 = new int[var11];
            this.field2339 = new int[var11];
        }
        if (var16 == 1) {
            this.field2370 = new int[var9];
        }
        if (var12 == 1) {
            this.field2368 = new byte[var10];
            this.field2355 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2359 = new byte[var10];
        } else {
            this.field2341 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2362 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2372 = new int[var10];
        }
        this.field2373 = new short[var10];
        var4.field2501 = var21;
        var5.field2501 = var36;
        var6.field2501 = var38;
        var7.field2501 = var40;
        var8.field2501 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var59 = var4.method829((byte) -80);
            int var60 = 0;
            if ((var59 & 1) != 0) {
                var60 = var5.method817(false);
            }
            int var61 = 0;
            if ((var59 & 2) != 0) {
                var61 = var6.method817(false);
            }
            int var62 = 0;
            if ((var59 & 4) != 0) {
                var62 = var7.method817(false);
            }
            this.field2342[var46] = var43 + var60;
            this.field2348[var46] = var44 + var61;
            this.field2338[var46] = var45 + var62;
            var43 = this.field2342[var46];
            var44 = this.field2348[var46];
            var45 = this.field2338[var46];
            if (var16 == 1) {
                this.field2370[var46] = var8.method829((byte) 34);
            }
        }
        var4.field2501 = var32;
        var5.field2501 = var28;
        var6.field2501 = var26;
        var7.field2501 = var30;
        var8.field2501 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field2373[var47] = (short) var4.method808(-20054);
            if (var12 == 1) {
                int var58 = var5.method829((byte) -116);
                if ((var58 & 1) == 1) {
                    this.field2368[var47] = 1;
                    var3 = true;
                } else {
                    this.field2368[var47] = 0;
                }
                if ((var58 & 2) == 2) {
                    this.field2355[var47] = (byte) (var58 >> 2);
                    var2 = true;
                } else {
                    this.field2355[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2359[var47] = var6.method843(true);
            }
            if (var14 == 1) {
                this.field2362[var47] = var7.method843(true);
            }
            if (var15 == 1) {
                this.field2372[var47] = var8.method829((byte) -107);
            }
        }
        var4.field2501 = var25;
        var5.field2501 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var54 = var5.method829((byte) -111);
            if (var54 == 1) {
                var48 = var4.method817(false) + var51;
                var49 = var4.method817(false) + var48;
                var50 = var4.method817(false) + var49;
                var51 = var50;
                this.field2343[var52] = var48;
                this.field2353[var52] = var49;
                this.field2367[var52] = var50;
            }
            if (var54 == 2) {
                var49 = var50;
                var50 = var4.method817(false) + var51;
                var51 = var50;
                this.field2343[var52] = var48;
                this.field2353[var52] = var49;
                this.field2367[var52] = var50;
            }
            if (var54 == 3) {
                var48 = var50;
                var50 = var4.method817(false) + var51;
                var51 = var50;
                this.field2343[var52] = var48;
                this.field2353[var52] = var49;
                this.field2367[var52] = var50;
            }
            if (var54 == 4) {
                int var57 = var48;
                var48 = var49;
                var49 = var57;
                var50 = var4.method817(false) + var51;
                var51 = var50;
                this.field2343[var52] = var48;
                this.field2353[var52] = var57;
                this.field2367[var52] = var50;
            }
        }
        var4.field2501 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field2344[var53] = var4.method808(-20054);
            this.field2345[var53] = var4.method808(-20054);
            this.field2339[var53] = var4.method808(-20054);
        }
        if (!var2) {
            this.field2355 = null;
        }
        if (!var3) {
            this.field2368 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([Lnf;I)V")
    public class96(class96[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        this.field2340 = 0;
        this.field2366 = 0;
        this.field2351 = 0;
        this.field2341 = -1;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class96 var14 = arg0[var8];
            if (var14 != null) {
                this.field2340 += var14.field2340;
                this.field2366 += var14.field2366;
                this.field2351 += var14.field2351;
                if (var14.field2359 != null) {
                    var4 = true;
                } else {
                    if (this.field2341 == -1) {
                        this.field2341 = var14.field2341;
                    }
                    if (this.field2341 != var14.field2341) {
                        var4 = true;
                    }
                }
                var3 |= var14.field2368 != null;
                var5 |= var14.field2362 != null;
                var6 |= var14.field2372 != null;
                var7 |= var14.field2355 != null;
            }
        }
        this.field2342 = new int[this.field2340];
        this.field2348 = new int[this.field2340];
        this.field2338 = new int[this.field2340];
        this.field2370 = new int[this.field2340];
        this.field2343 = new int[this.field2366];
        this.field2353 = new int[this.field2366];
        this.field2367 = new int[this.field2366];
        if (this.field2351 > 0) {
            this.field2344 = new int[this.field2351];
            this.field2345 = new int[this.field2351];
            this.field2339 = new int[this.field2351];
        }
        if (var3) {
            this.field2368 = new byte[this.field2366];
        }
        if (var4) {
            this.field2359 = new byte[this.field2366];
        }
        if (var5) {
            this.field2362 = new byte[this.field2366];
        }
        if (var7) {
            this.field2355 = new byte[this.field2366];
        }
        if (var6) {
            this.field2372 = new int[this.field2366];
        }
        this.field2373 = new short[this.field2366];
        this.field2340 = 0;
        this.field2366 = 0;
        this.field2351 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class96 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field2366; ++var12) {
                    if (var3 && var11.field2368 != null) {
                        this.field2368[this.field2366] = var11.field2368[var12];
                    }
                    if (var4) {
                        if (var11.field2359 != null) {
                            this.field2359[this.field2366] = var11.field2359[var12];
                        } else {
                            this.field2359[this.field2366] = var11.field2341;
                        }
                    }
                    if (var5 && var11.field2362 != null) {
                        this.field2362[this.field2366] = var11.field2362[var12];
                    }
                    if (var7) {
                        if (var11.field2355 != null && var11.field2355[var12] != -1) {
                            this.field2355[this.field2366] = (byte) (var11.field2355[var12] + var9);
                        } else {
                            this.field2355[this.field2366] = -1;
                        }
                    }
                    if (var6 && var11.field2372 != null) {
                        this.field2372[this.field2366] = var11.field2372[var12];
                    }
                    this.field2373[this.field2366] = var11.field2373[var12];
                    this.field2343[this.field2366] = this.method750(var11, var11.field2343[var12]);
                    this.field2353[this.field2366] = this.method750(var11, var11.field2353[var12]);
                    this.field2367[this.field2366] = this.method750(var11, var11.field2367[var12]);
                    ++this.field2366;
                }
                for (int var13 = 0; var13 < var11.field2351; ++var13) {
                    this.field2344[this.field2351] = this.method750(var11, var11.field2344[var13]);
                    this.field2345[this.field2351] = this.method750(var11, var11.field2345[var13]);
                    this.field2339[this.field2351] = this.method750(var11, var11.field2339[var13]);
                    ++this.field2351;
                }
                var9 += var11.field2351;
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lnf;ZZZ)V")
    public class96(class96 arg0, boolean arg1, boolean arg2, boolean arg3) {
        this.field2340 = arg0.field2340;
        this.field2366 = arg0.field2366;
        this.field2351 = arg0.field2351;
        if (arg1) {
            this.field2342 = arg0.field2342;
            this.field2348 = arg0.field2348;
            this.field2338 = arg0.field2338;
        } else {
            this.field2342 = new int[this.field2340];
            this.field2348 = new int[this.field2340];
            this.field2338 = new int[this.field2340];
            for (int var5 = 0; var5 < this.field2340; ++var5) {
                this.field2342[var5] = arg0.field2342[var5];
                this.field2348[var5] = arg0.field2348[var5];
                this.field2338[var5] = arg0.field2338[var5];
            }
        }
        if (arg2) {
            this.field2373 = arg0.field2373;
        } else {
            this.field2373 = new short[this.field2366];
            for (int var6 = 0; var6 < this.field2366; ++var6) {
                this.field2373[var6] = arg0.field2373[var6];
            }
        }
        if (arg3) {
            this.field2362 = arg0.field2362;
        } else {
            this.field2362 = new byte[this.field2366];
            if (arg0.field2362 == null) {
                for (int var7 = 0; var7 < this.field2366; ++var7) {
                    this.field2362[var7] = 0;
                }
            } else {
                for (int var8 = 0; var8 < this.field2366; ++var8) {
                    this.field2362[var8] = arg0.field2362[var8];
                }
            }
        }
        this.field2343 = arg0.field2343;
        this.field2353 = arg0.field2353;
        this.field2367 = arg0.field2367;
        this.field2368 = arg0.field2368;
        this.field2359 = arg0.field2359;
        this.field2355 = arg0.field2355;
        this.field2341 = arg0.field2341;
        this.field2344 = arg0.field2344;
        this.field2345 = arg0.field2345;
        this.field2339 = arg0.field2339;
        this.field2370 = arg0.field2370;
        this.field2372 = arg0.field2372;
        this.field2374 = arg0.field2374;
        this.field2360 = arg0.field2360;
        this.field2364 = arg0.field2364;
        this.field2363 = arg0.field2363;
        this.field2347 = arg0.field2347;
        this.field2358 = arg0.field2358;
        this.field2365 = arg0.field2365;
    }

    static {
        int var0 = 0;
        int var1 = 248;
        while (var0 < 9) {
            field2361[var0++] = 255;
        }
        while (var0 < 16) {
            field2361[var0++] = var1;
            var1 -= 8;
        }
        while (var0 < 32) {
            field2361[var0++] = var1;
            var1 -= 4;
        }
        while (var0 < 64) {
            field2361[var0++] = var1;
            var1 -= 2;
        }
        while (var0 < 128) {
            field2361[var0++] = var1--;
        }
    }
}
