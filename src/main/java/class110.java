import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class110 extends class49 {

    @OriginalMember(owner = "client!pf", name = "ib", descriptor = "I")
    private int field2333 = 0;

    @OriginalMember(owner = "client!pf", name = "ab", descriptor = "Z")
    private boolean field2325 = false;

    @OriginalMember(owner = "client!pf", name = "sb", descriptor = "B")
    private byte field2343 = 0;

    @OriginalMember(owner = "client!pf", name = "yb", descriptor = "I")
    private int field2349 = 0;

    @OriginalMember(owner = "client!pf", name = "mb", descriptor = "I")
    private int field2337;

    @OriginalMember(owner = "client!pf", name = "rb", descriptor = "[I")
    private int[] field2342;

    @OriginalMember(owner = "client!pf", name = "qb", descriptor = "[I")
    private int[] field2341;

    @OriginalMember(owner = "client!pf", name = "Cb", descriptor = "[I")
    private int[] field2353;

    @OriginalMember(owner = "client!pf", name = "db", descriptor = "[I")
    private int[] field2328;

    @OriginalMember(owner = "client!pf", name = "pb", descriptor = "[I")
    private int[] field2340;

    @OriginalMember(owner = "client!pf", name = "tb", descriptor = "[I")
    private int[] field2344;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "[I")
    private int[] field2321;

    @OriginalMember(owner = "client!pf", name = "Eb", descriptor = "[B")
    private byte[] field2355;

    @OriginalMember(owner = "client!pf", name = "Db", descriptor = "[B")
    private byte[] field2354;

    @OriginalMember(owner = "client!pf", name = "Lb", descriptor = "[B")
    private byte[] field2362;

    @OriginalMember(owner = "client!pf", name = "xb", descriptor = "[I")
    private int[] field2348;

    @OriginalMember(owner = "client!pf", name = "Y", descriptor = "[S")
    private short[] field2323;

    @OriginalMember(owner = "client!pf", name = "vb", descriptor = "[B")
    private byte[] field2346;

    @OriginalMember(owner = "client!pf", name = "Ab", descriptor = "[S")
    private short[] field2351;

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "[B")
    private byte[] field2322;

    @OriginalMember(owner = "client!pf", name = "Ib", descriptor = "[S")
    private short[] field2359;

    @OriginalMember(owner = "client!pf", name = "zb", descriptor = "[S")
    private short[] field2350;

    @OriginalMember(owner = "client!pf", name = "lb", descriptor = "[S")
    private short[] field2336;

    @OriginalMember(owner = "client!pf", name = "Z", descriptor = "[S")
    private short[] field2324;

    @OriginalMember(owner = "client!pf", name = "Gb", descriptor = "[S")
    private short[] field2357;

    @OriginalMember(owner = "client!pf", name = "jb", descriptor = "[S")
    private short[] field2334;

    @OriginalMember(owner = "client!pf", name = "fb", descriptor = "[S")
    private short[] field2330;

    @OriginalMember(owner = "client!pf", name = "eb", descriptor = "[B")
    private byte[] field2329;

    @OriginalMember(owner = "client!pf", name = "kb", descriptor = "[S")
    private short[] field2335;

    @OriginalMember(owner = "client!pf", name = "gb", descriptor = "[S")
    private short[] field2331;

    @OriginalMember(owner = "client!pf", name = "bb", descriptor = "[[I")
    private int[][] field2326;

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "[[I")
    private int[][] field2320;

    @OriginalMember(owner = "client!pf", name = "nb", descriptor = "[Lha;")
    private class50[] field2338;

    @OriginalMember(owner = "client!pf", name = "Nb", descriptor = "[Lld;")
    private class80[] field2364;

    @OriginalMember(owner = "client!pf", name = "wb", descriptor = "[Lha;")
    private class50[] field2347;

    @OriginalMember(owner = "client!pf", name = "Hb", descriptor = "S")
    public short field2358;

    @OriginalMember(owner = "client!pf", name = "Mb", descriptor = "S")
    public short field2363;

    @OriginalMember(owner = "client!pf", name = "ob", descriptor = "I")
    private static int field2339 = 0;

    @OriginalMember(owner = "client!pf", name = "hb", descriptor = "[I")
    private static int[] field2332 = new int[10000];

    @OriginalMember(owner = "client!pf", name = "Fb", descriptor = "[I")
    private static int[] field2356 = class124.field2709;

    @OriginalMember(owner = "client!pf", name = "Bb", descriptor = "[I")
    private static int[] field2352 = class124.field2717;

    @OriginalMember(owner = "client!pf", name = "cb", descriptor = "[I")
    private static int[] field2327 = new int[10000];

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
    private int field2318;

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "I")
    private int field2319;

    @OriginalMember(owner = "client!pf", name = "ub", descriptor = "I")
    private int field2345;

    @OriginalMember(owner = "client!pf", name = "Jb", descriptor = "I")
    private int field2360;

    @OriginalMember(owner = "client!pf", name = "Kb", descriptor = "I")
    private int field2361;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()V")
    private final void method794() {
        if (!this.field2325) {
            super.field1157 = 0;
            this.field2345 = 0;
            this.field2319 = 999999;
            this.field2361 = -999999;
            this.field2318 = -99999;
            this.field2360 = 99999;
            for (int var1 = 0; var1 < this.field2333; ++var1) {
                int var2 = this.field2342[var1];
                int var3 = this.field2341[var1];
                int var4 = this.field2353[var1];
                if (var2 < this.field2319) {
                    this.field2319 = var2;
                }
                if (var2 > this.field2361) {
                    this.field2361 = var2;
                }
                if (var4 < this.field2360) {
                    this.field2360 = var4;
                }
                if (var4 > this.field2318) {
                    this.field2318 = var4;
                }
                if (-var3 > super.field1157) {
                    super.field1157 = -var3;
                }
                if (var3 > this.field2345) {
                    this.field2345 = var3;
                }
            }
            this.field2325 = true;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lpf;I)I")
    private final int method795(class110 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2342[arg1];
        int var5 = arg0.field2341[arg1];
        int var6 = arg0.field2353[arg1];
        for (int var7 = 0; var7 < this.field2333; ++var7) {
            if (this.field2342[var7] == var4 && this.field2341[var7] == var5 && this.field2353[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2342[this.field2333] = var4;
            this.field2341[this.field2333] = var5;
            this.field2353[this.field2333] = var6;
            if (arg0.field2328 != null) {
                this.field2328[this.field2333] = arg0.field2328[arg1];
            }
            var3 = this.field2333++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(SS)V")
    public final void method796(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2349; ++var3) {
            if (this.field2351[var3] == arg0) {
                this.field2351[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([[IIIIZI)Lpf;")
    public final class110 method797(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method794();
        int var7 = this.field2319 + arg1;
        int var8 = this.field2361 + arg1;
        int var9 = this.field2360 + arg3;
        int var10 = this.field2318 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class110 var15;
                if (arg4) {
                    var15 = new class110();
                    var15.field2333 = this.field2333;
                    var15.field2349 = this.field2349;
                    var15.field2337 = this.field2337;
                    var15.field2342 = this.field2342;
                    var15.field2353 = this.field2353;
                    var15.field2340 = this.field2340;
                    var15.field2344 = this.field2344;
                    var15.field2321 = this.field2321;
                    var15.field2355 = this.field2355;
                    var15.field2354 = this.field2354;
                    var15.field2362 = this.field2362;
                    var15.field2346 = this.field2346;
                    var15.field2351 = this.field2351;
                    var15.field2323 = this.field2323;
                    var15.field2343 = this.field2343;
                    var15.field2322 = this.field2322;
                    var15.field2359 = this.field2359;
                    var15.field2350 = this.field2350;
                    var15.field2336 = this.field2336;
                    var15.field2324 = this.field2324;
                    var15.field2357 = this.field2357;
                    var15.field2334 = this.field2334;
                    var15.field2330 = this.field2330;
                    var15.field2329 = this.field2329;
                    var15.field2335 = this.field2335;
                    var15.field2331 = this.field2331;
                    var15.field2328 = this.field2328;
                    var15.field2348 = this.field2348;
                    var15.field2326 = this.field2326;
                    var15.field2320 = this.field2320;
                    var15.field2358 = this.field2358;
                    var15.field2363 = this.field2363;
                    var15.field2341 = new int[var15.field2333];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field2333; ++var16) {
                        int var17 = this.field2342[var16] + arg1;
                        int var18 = this.field2353[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field2341[var16] = this.field2341[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field2333; ++var26) {
                        int var27 = (-this.field2341[var26] << 16) / super.field1157;
                        if (var27 < arg5) {
                            int var28 = this.field2342[var26] + arg1;
                            int var29 = this.field2353[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field2341[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2341[var26];
                        }
                    }
                }
                var15.method810();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lpf;Lpf;IIIZ)V")
    public static final void method798(class110 arg0, class110 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method794();
        arg0.method816();
        arg1.method794();
        arg1.method816();
        ++field2339;
        int var6 = 0;
        int[] var7 = arg1.field2342;
        int var8 = arg1.field2333;
        for (int var9 = 0; var9 < arg0.field2333; ++var9) {
            class50 var12 = arg0.field2338[var9];
            if (var12.field1176 != 0) {
                int var13 = arg0.field2341[var9] - arg3;
                if (var13 <= arg1.field2345) {
                    int var14 = arg0.field2342[var9] - arg2;
                    if (var14 >= arg1.field2319 && var14 <= arg1.field2361) {
                        int var15 = arg0.field2353[var9] - arg4;
                        if (var15 >= arg1.field2360 && var15 <= arg1.field2318) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class50 var17 = arg1.field2338[var16];
                                if (var7[var16] == var14 && arg1.field2353[var16] == var15 && arg1.field2341[var16] == var13 && var17.field1176 != 0) {
                                    if (arg0.field2347 == null) {
                                        arg0.field2347 = new class50[arg0.field2333];
                                    }
                                    if (arg1.field2347 == null) {
                                        arg1.field2347 = new class50[var8];
                                    }
                                    class50 var18 = arg0.field2347[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field2347[var9] = new class50(var12);
                                    }
                                    class50 var19 = arg1.field2347[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field2347[var16] = new class50(var17);
                                    }
                                    var18.field1169 += var17.field1169;
                                    var18.field1172 += var17.field1172;
                                    var18.field1171 += var17.field1171;
                                    var18.field1176 += var17.field1176;
                                    var19.field1169 += var12.field1169;
                                    var19.field1172 += var12.field1172;
                                    var19.field1171 += var12.field1171;
                                    var19.field1176 += var12.field1176;
                                    ++var6;
                                    field2332[var9] = field2339;
                                    field2327[var16] = field2339;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field2349; ++var10) {
                if (field2332[arg0.field2340[var10]] == field2339 && field2332[arg0.field2344[var10]] == field2339 && field2332[arg0.field2321[var10]] == field2339) {
                    if (arg0.field2355 == null) {
                        arg0.field2355 = new byte[arg0.field2349];
                    }
                    arg0.field2355[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field2349; ++var11) {
                if (field2327[arg1.field2340[var11]] == field2339 && field2327[arg1.field2344[var11]] == field2339 && field2327[arg1.field2321[var11]] == field2339) {
                    if (arg1.field2355 == null) {
                        arg1.field2355 = new byte[arg1.field2349];
                    }
                    arg1.field2355[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "()V")
    public final void method799() {
        for (int var1 = 0; var1 < this.field2333; ++var1) {
            int var2 = this.field2342[var1];
            this.field2342[var1] = this.field2353[var1];
            this.field2353[var1] = -var2;
        }
        this.method810();
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "()V")
    public final void method800() {
        for (int var1 = 0; var1 < this.field2333; ++var1) {
            this.field2353[var1] = -this.field2353[var1];
        }
        for (int var2 = 0; var2 < this.field2349; ++var2) {
            int var3 = this.field2340[var2];
            this.field2340[var2] = this.field2321[var2];
            this.field2321[var2] = var3;
        }
        this.method810();
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
    public final void method801(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2333; ++var4) {
            this.field2342[var4] += arg0;
            this.field2341[var4] += arg1;
            this.field2353[var4] += arg2;
        }
        this.method810();
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(SS)V")
    public final void method802(short arg0, short arg1) {
        if (this.field2323 != null) {
            for (int var3 = 0; var3 < this.field2349; ++var3) {
                if (this.field2323[var3] == arg0) {
                    this.field2323[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "(I)I")
    private static final int method803(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "()Lpf;")
    public final class110 method804() {
        class110 var1 = new class110();
        if (this.field2355 != null) {
            var1.field2355 = new byte[this.field2349];
            for (int var2 = 0; var2 < this.field2349; ++var2) {
                var1.field2355[var2] = this.field2355[var2];
            }
        }
        var1.field2333 = this.field2333;
        var1.field2349 = this.field2349;
        var1.field2337 = this.field2337;
        var1.field2342 = this.field2342;
        var1.field2341 = this.field2341;
        var1.field2353 = this.field2353;
        var1.field2340 = this.field2340;
        var1.field2344 = this.field2344;
        var1.field2321 = this.field2321;
        var1.field2354 = this.field2354;
        var1.field2362 = this.field2362;
        var1.field2346 = this.field2346;
        var1.field2351 = this.field2351;
        var1.field2323 = this.field2323;
        var1.field2343 = this.field2343;
        var1.field2322 = this.field2322;
        var1.field2359 = this.field2359;
        var1.field2350 = this.field2350;
        var1.field2336 = this.field2336;
        var1.field2324 = this.field2324;
        var1.field2357 = this.field2357;
        var1.field2334 = this.field2334;
        var1.field2330 = this.field2330;
        var1.field2329 = this.field2329;
        var1.field2335 = this.field2335;
        var1.field2331 = this.field2331;
        var1.field2328 = this.field2328;
        var1.field2348 = this.field2348;
        var1.field2326 = this.field2326;
        var1.field2320 = this.field2320;
        var1.field2338 = this.field2338;
        var1.field2364 = this.field2364;
        var1.field2358 = this.field2358;
        var1.field2363 = this.field2363;
        return var1;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)V")
    public final void method805(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2333; ++var4) {
            this.field2342[var4] = this.field2342[var4] * arg0 / 128;
            this.field2341[var4] = this.field2341[var4] * arg1 / 128;
            this.field2353[var4] = this.field2353[var4] * arg2 / 128;
        }
        this.method810();
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "()V")
    public final void method806() {
        for (int var1 = 0; var1 < this.field2333; ++var1) {
            this.field2342[var1] = -this.field2342[var1];
            this.field2353[var1] = -this.field2353[var1];
        }
        this.method810();
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII)Lqb;")
    public final class113 method807(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method816();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class113 var8 = new class113();
        var8.field2420 = new int[this.field2349];
        var8.field2426 = new int[this.field2349];
        var8.field2444 = new int[this.field2349];
        if (this.field2337 > 0 && this.field2346 != null) {
            int[] var9 = new int[this.field2337];
            for (int var10 = 0; var10 < this.field2349; ++var10) {
                if (this.field2346[var10] != -1) {
                    ++var9[this.field2346[var10] & 255];
                }
            }
            var8.field2431 = 0;
            for (int var11 = 0; var11 < this.field2337; ++var11) {
                if (var9[var11] > 0 && this.field2322[var11] == 0) {
                    ++var8.field2431;
                }
            }
            var8.field2437 = new int[var8.field2431];
            var8.field2435 = new int[var8.field2431];
            var8.field2448 = new int[var8.field2431];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2337; ++var13) {
                if (var9[var13] > 0 && this.field2322[var13] == 0) {
                    var8.field2437[var12] = this.field2359[var13] & 65535;
                    var8.field2435[var12] = this.field2350[var13] & 65535;
                    var8.field2448[var12] = this.field2336[var13] & 65535;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2436 = new byte[this.field2349];
            for (int var14 = 0; var14 < this.field2349; ++var14) {
                if (this.field2346[var14] != -1) {
                    var8.field2436[var14] = (byte) var9[this.field2346[var14] & 255];
                } else {
                    var8.field2436[var14] = -1;
                }
            }
        }
        for (int var15 = 0; var15 < this.field2349; ++var15) {
            byte var16;
            if (this.field2355 == null) {
                var16 = 0;
            } else {
                var16 = this.field2355[var15];
            }
            byte var17;
            if (this.field2362 == null) {
                var17 = 0;
            } else {
                var17 = this.field2362[var15];
            }
            short var18;
            if (this.field2323 == null) {
                var18 = -1;
            } else {
                var18 = this.field2323[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 != 0) {
                    if (var16 == 1) {
                        class80 var26 = this.field2364[var15];
                        int var27 = (var26.field1695 * arg4 + var26.field1706 * arg3 + var26.field1692 * arg2) / (var7 / 2 + var7) + arg0;
                        var8.field2420[var15] = method812(this.field2351[var15] & 65535, var27);
                        var8.field2444[var15] = -1;
                    } else if (var16 == 3) {
                        var8.field2420[var15] = 128;
                        var8.field2444[var15] = -1;
                    } else {
                        var8.field2444[var15] = -2;
                    }
                } else {
                    int var19 = this.field2351[var15] & 65535;
                    class50 var20;
                    if (this.field2347 != null && this.field2347[this.field2340[var15]] != null) {
                        var20 = this.field2347[this.field2340[var15]];
                    } else {
                        var20 = this.field2338[this.field2340[var15]];
                    }
                    int var21 = (var20.field1171 * arg4 + var20.field1172 * arg3 + var20.field1169 * arg2) / (var20.field1176 * var7) + arg0;
                    var8.field2420[var15] = method812(var19, var21);
                    class50 var22;
                    if (this.field2347 != null && this.field2347[this.field2344[var15]] != null) {
                        var22 = this.field2347[this.field2344[var15]];
                    } else {
                        var22 = this.field2338[this.field2344[var15]];
                    }
                    int var23 = (var22.field1171 * arg4 + var22.field1172 * arg3 + var22.field1169 * arg2) / (var22.field1176 * var7) + arg0;
                    var8.field2426[var15] = method812(var19, var23);
                    class50 var24;
                    if (this.field2347 != null && this.field2347[this.field2321[var15]] != null) {
                        var24 = this.field2347[this.field2321[var15]];
                    } else {
                        var24 = this.field2338[this.field2321[var15]];
                    }
                    int var25 = (var24.field1171 * arg4 + var24.field1172 * arg3 + var24.field1169 * arg2) / (var24.field1176 * var7) + arg0;
                    var8.field2444[var15] = method812(var19, var25);
                }
            } else if (var16 != 0) {
                if (var16 == 1) {
                    class80 var34 = this.field2364[var15];
                    int var35 = (var34.field1695 * arg4 + var34.field1706 * arg3 + var34.field1692 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field2420[var15] = method803(var35);
                    var8.field2444[var15] = -1;
                } else {
                    var8.field2444[var15] = -2;
                }
            } else {
                class50 var28;
                if (this.field2347 != null && this.field2347[this.field2340[var15]] != null) {
                    var28 = this.field2347[this.field2340[var15]];
                } else {
                    var28 = this.field2338[this.field2340[var15]];
                }
                int var29 = (var28.field1171 * arg4 + var28.field1172 * arg3 + var28.field1169 * arg2) / (var28.field1176 * var7) + arg0;
                var8.field2420[var15] = method803(var29);
                class50 var30;
                if (this.field2347 != null && this.field2347[this.field2344[var15]] != null) {
                    var30 = this.field2347[this.field2344[var15]];
                } else {
                    var30 = this.field2338[this.field2344[var15]];
                }
                int var31 = (var30.field1171 * arg4 + var30.field1172 * arg3 + var30.field1169 * arg2) / (var30.field1176 * var7) + arg0;
                var8.field2426[var15] = method803(var31);
                class50 var32;
                if (this.field2347 != null && this.field2347[this.field2321[var15]] != null) {
                    var32 = this.field2347[this.field2321[var15]];
                } else {
                    var32 = this.field2338[this.field2321[var15]];
                }
                int var33 = (var32.field1171 * arg4 + var32.field1172 * arg3 + var32.field1169 * arg2) / (var32.field1176 * var7) + arg0;
                var8.field2444[var15] = method803(var33);
            }
        }
        this.method817();
        var8.field2422 = this.field2333;
        var8.field2432 = this.field2342;
        var8.field2447 = this.field2341;
        var8.field2428 = this.field2353;
        var8.field2419 = this.field2349;
        var8.field2430 = this.field2340;
        var8.field2421 = this.field2344;
        var8.field2438 = this.field2321;
        var8.field2442 = this.field2354;
        var8.field2427 = this.field2362;
        var8.field2434 = this.field2343;
        var8.field2439 = this.field2326;
        var8.field2418 = this.field2320;
        var8.field2423 = this.field2323;
        return var8;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lc;II)Lpf;")
    public static final class110 method808(class15 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method114((byte) 92, arg1, arg2);
        return var3 == null ? null : new class110(var3);
    }

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "(I)V")
    public final void method809(int arg0) {
        int var2 = field2356[arg0];
        int var3 = field2352[arg0];
        for (int var4 = 0; var4 < this.field2333; ++var4) {
            int var5 = this.field2353[var4] * var2 + this.field2342[var4] * var3 >> 16;
            this.field2353[var4] = this.field2353[var4] * var3 - this.field2342[var4] * var2 >> 16;
            this.field2342[var4] = var5;
        }
        this.method810();
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "()V")
    private final void method810() {
        this.field2338 = null;
        this.field2347 = null;
        this.field2364 = null;
        this.field2325 = false;
    }

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "()V")
    public static void method811() {
        field2332 = null;
        field2327 = null;
        field2356 = null;
        field2352 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)I")
    private static final int method812(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([B)V")
    private final void method813(byte[] arg0) {
        class138 var2 = new class138(arg0);
        class138 var3 = new class138(arg0);
        class138 var4 = new class138(arg0);
        class138 var5 = new class138(arg0);
        class138 var6 = new class138(arg0);
        class138 var7 = new class138(arg0);
        class138 var8 = new class138(arg0);
        var2.field3175 = arg0.length - 23;
        int var9 = var2.method1098(true);
        int var10 = var2.method1098(true);
        int var11 = var2.method1055(110);
        int var12 = var2.method1055(124);
        int var13 = var2.method1055(114);
        int var14 = var2.method1055(124);
        int var15 = var2.method1055(117);
        int var16 = var2.method1055(123);
        int var17 = var2.method1055(118);
        int var18 = var2.method1098(true);
        int var19 = var2.method1098(true);
        int var20 = var2.method1098(true);
        int var21 = var2.method1098(true);
        int var22 = var2.method1098(true);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2322 = new byte[var11];
            var2.field3175 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field2322[var26] = var2.method1079((byte) 0);
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
        int var58 = var24 * 2 + var56;
        int var60 = var24 + var58;
        int var62 = var24 * 2 + var25 * 2 + var60;
        this.field2333 = var9;
        this.field2349 = var10;
        this.field2337 = var11;
        this.field2342 = new int[var9];
        this.field2341 = new int[var9];
        this.field2353 = new int[var9];
        this.field2340 = new int[var10];
        this.field2344 = new int[var10];
        this.field2321 = new int[var10];
        if (var17 == 1) {
            this.field2328 = new int[var9];
        }
        if (var12 == 1) {
            this.field2355 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2354 = new byte[var10];
        } else {
            this.field2343 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2362 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2348 = new int[var10];
        }
        if (var16 == 1) {
            this.field2323 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2346 = new byte[var10];
        }
        this.field2351 = new short[var10];
        if (var11 > 0) {
            this.field2359 = new short[var11];
            this.field2350 = new short[var11];
            this.field2336 = new short[var11];
            if (var24 > 0) {
                this.field2324 = new short[var24];
                this.field2357 = new short[var24];
                this.field2334 = new short[var24];
                this.field2330 = new short[var24];
                this.field2329 = new byte[var24];
                this.field2335 = new short[var24];
            }
            if (var25 > 0) {
                this.field2331 = new short[var25];
            }
        }
        var2.field3175 = var11;
        var3.field3175 = var44;
        var4.field3175 = var46;
        var5.field3175 = var48;
        var6.field3175 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method1055(124);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method1097((byte) -80);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method1097((byte) -80);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method1097((byte) -80);
            }
            this.field2342[var67] = var64 + var82;
            this.field2341[var67] = var65 + var83;
            this.field2353[var67] = var66 + var84;
            var64 = this.field2342[var67];
            var65 = this.field2341[var67];
            var66 = this.field2353[var67];
            if (var17 == 1) {
                this.field2328[var67] = var6.method1055(123);
            }
        }
        var2.field3175 = var42;
        var3.field3175 = var31;
        var4.field3175 = var34;
        var5.field3175 = var37;
        var6.field3175 = var35;
        var7.field3175 = var40;
        var8.field3175 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field2351[var68] = (short) var2.method1098(true);
            if (var12 == 1) {
                this.field2355[var68] = var3.method1079((byte) 0);
            }
            if (var13 == 255) {
                this.field2354[var68] = var4.method1079((byte) 0);
            }
            if (var14 == 1) {
                this.field2362[var68] = var5.method1079((byte) 0);
            }
            if (var15 == 1) {
                this.field2348[var68] = var6.method1055(119);
            }
            if (var16 == 1) {
                this.field2323[var68] = (short) (var7.method1098(true) - 1);
            }
            if (this.field2346 != null && this.field2323[var68] != -1) {
                this.field2346[var68] = (byte) (var8.method1055(119) - 1);
            }
        }
        var2.field3175 = var33;
        var3.field3175 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method1055(124);
            if (var77 == 1) {
                var69 = var2.method1097((byte) -80) + var72;
                var70 = var2.method1097((byte) -80) + var69;
                var71 = var2.method1097((byte) -80) + var70;
                var72 = var71;
                this.field2340[var73] = var69;
                this.field2344[var73] = var70;
                this.field2321[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method1097((byte) -80) + var72;
                var72 = var71;
                this.field2340[var73] = var69;
                this.field2344[var73] = var70;
                this.field2321[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method1097((byte) -80) + var72;
                var72 = var71;
                this.field2340[var73] = var69;
                this.field2344[var73] = var70;
                this.field2321[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method1097((byte) -80) + var72;
                var72 = var71;
                this.field2340[var73] = var69;
                this.field2344[var73] = var80;
                this.field2321[var73] = var71;
            }
        }
        var2.field3175 = var50;
        var3.field3175 = var52;
        var4.field3175 = var54;
        var5.field3175 = var56;
        var6.field3175 = var58;
        var7.field3175 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field2322[var74] & 255;
            if (var76 == 0) {
                this.field2359[var74] = (short) var2.method1098(true);
                this.field2350[var74] = (short) var2.method1098(true);
                this.field2336[var74] = (short) var2.method1098(true);
            }
            if (var76 == 1) {
                this.field2359[var74] = (short) var3.method1098(true);
                this.field2350[var74] = (short) var3.method1098(true);
                this.field2336[var74] = (short) var3.method1098(true);
                this.field2324[var74] = (short) var4.method1098(true);
                this.field2357[var74] = (short) var4.method1098(true);
                this.field2334[var74] = (short) var4.method1098(true);
                this.field2330[var74] = (short) var5.method1098(true);
                this.field2329[var74] = var6.method1079((byte) 0);
                this.field2335[var74] = (short) var7.method1098(true);
            }
            if (var76 == 2) {
                this.field2359[var74] = (short) var3.method1098(true);
                this.field2350[var74] = (short) var3.method1098(true);
                this.field2336[var74] = (short) var3.method1098(true);
                this.field2324[var74] = (short) var4.method1098(true);
                this.field2357[var74] = (short) var4.method1098(true);
                this.field2334[var74] = (short) var4.method1098(true);
                this.field2330[var74] = (short) var5.method1098(true);
                this.field2329[var74] = var6.method1079((byte) 0);
                this.field2335[var74] = (short) var7.method1098(true);
                this.field2331[var74] = (short) var7.method1098(true);
            }
            if (var76 == 3) {
                this.field2359[var74] = (short) var3.method1098(true);
                this.field2350[var74] = (short) var3.method1098(true);
                this.field2336[var74] = (short) var3.method1098(true);
                this.field2324[var74] = (short) var4.method1098(true);
                this.field2357[var74] = (short) var4.method1098(true);
                this.field2334[var74] = (short) var4.method1098(true);
                this.field2330[var74] = (short) var5.method1098(true);
                this.field2329[var74] = var6.method1079((byte) 0);
                this.field2335[var74] = (short) var7.method1098(true);
            }
        }
        var2.field3175 = var62;
        int var75 = var2.method1055(120);
        if (var75 != 0) {
            new class147();
            var2.method1098(true);
            var2.method1098(true);
            var2.method1098(true);
            var2.method1062(1809568712);
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "([B)V")
    private final void method814(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class138 var4 = new class138(arg0);
        class138 var5 = new class138(arg0);
        class138 var6 = new class138(arg0);
        class138 var7 = new class138(arg0);
        class138 var8 = new class138(arg0);
        var4.field3175 = arg0.length - 18;
        int var9 = var4.method1098(true);
        int var10 = var4.method1098(true);
        int var11 = var4.method1055(117);
        int var12 = var4.method1055(109);
        int var13 = var4.method1055(124);
        int var14 = var4.method1055(124);
        int var15 = var4.method1055(125);
        int var16 = var4.method1055(122);
        int var17 = var4.method1098(true);
        int var18 = var4.method1098(true);
        int var19 = var4.method1098(true);
        int var20 = var4.method1098(true);
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
        this.field2333 = var9;
        this.field2349 = var10;
        this.field2337 = var11;
        this.field2342 = new int[var9];
        this.field2341 = new int[var9];
        this.field2353 = new int[var9];
        this.field2340 = new int[var10];
        this.field2344 = new int[var10];
        this.field2321 = new int[var10];
        if (var11 > 0) {
            this.field2322 = new byte[var11];
            this.field2359 = new short[var11];
            this.field2350 = new short[var11];
            this.field2336 = new short[var11];
        }
        if (var16 == 1) {
            this.field2328 = new int[var9];
        }
        if (var12 == 1) {
            this.field2355 = new byte[var10];
            this.field2346 = new byte[var10];
            this.field2323 = new short[var10];
        }
        if (var13 == 255) {
            this.field2354 = new byte[var10];
        } else {
            this.field2343 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2362 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2348 = new int[var10];
        }
        this.field2351 = new short[var10];
        var4.field3175 = var21;
        var5.field3175 = var36;
        var6.field3175 = var38;
        var7.field3175 = var40;
        var8.field3175 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method1055(121);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method1097((byte) -80);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method1097((byte) -80);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method1097((byte) -80);
            }
            this.field2342[var46] = var43 + var63;
            this.field2341[var46] = var44 + var64;
            this.field2353[var46] = var45 + var65;
            var43 = this.field2342[var46];
            var44 = this.field2341[var46];
            var45 = this.field2353[var46];
            if (var16 == 1) {
                this.field2328[var46] = var8.method1055(127);
            }
        }
        var4.field3175 = var32;
        var5.field3175 = var28;
        var6.field3175 = var26;
        var7.field3175 = var30;
        var8.field3175 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field2351[var47] = (short) var4.method1098(true);
            if (var12 == 1) {
                int var61 = var5.method1055(112);
                if ((var61 & 1) == 1) {
                    this.field2355[var47] = 1;
                    var2 = true;
                } else {
                    this.field2355[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field2346[var47] = (byte) (var61 >> 2);
                    this.field2323[var47] = this.field2351[var47];
                    this.field2351[var47] = 127;
                    if (this.field2323[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2346[var47] = -1;
                    this.field2323[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2354[var47] = var6.method1079((byte) 0);
            }
            if (var14 == 1) {
                this.field2362[var47] = var7.method1079((byte) 0);
            }
            if (var15 == 1) {
                this.field2348[var47] = var8.method1055(122);
            }
        }
        var4.field3175 = var25;
        var5.field3175 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method1055(109);
            if (var57 == 1) {
                var48 = var4.method1097((byte) -80) + var51;
                var49 = var4.method1097((byte) -80) + var48;
                var50 = var4.method1097((byte) -80) + var49;
                var51 = var50;
                this.field2340[var52] = var48;
                this.field2344[var52] = var49;
                this.field2321[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method1097((byte) -80) + var51;
                var51 = var50;
                this.field2340[var52] = var48;
                this.field2344[var52] = var49;
                this.field2321[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method1097((byte) -80) + var51;
                var51 = var50;
                this.field2340[var52] = var48;
                this.field2344[var52] = var49;
                this.field2321[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method1097((byte) -80) + var51;
                var51 = var50;
                this.field2340[var52] = var48;
                this.field2344[var52] = var60;
                this.field2321[var52] = var50;
            }
        }
        var4.field3175 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field2322[var53] = 0;
            this.field2359[var53] = (short) var4.method1098(true);
            this.field2350[var53] = (short) var4.method1098(true);
            this.field2336[var53] = (short) var4.method1098(true);
        }
        if (this.field2346 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field2346[var55] & 255;
                if (var56 != 255) {
                    if ((this.field2359[var56] & 65535) == this.field2340[var55] && (this.field2350[var56] & 65535) == this.field2344[var55] && (this.field2336[var56] & 65535) == this.field2321[var55]) {
                        this.field2346[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field2346 = null;
            }
        }
        if (!var3) {
            this.field2323 = null;
        }
        if (!var2) {
            this.field2355 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "()V")
    public final void method815() {
        for (int var1 = 0; var1 < this.field2333; ++var1) {
            int var2 = this.field2353[var1];
            this.field2353[var1] = this.field2342[var1];
            this.field2342[var1] = -var2;
        }
        this.method810();
    }

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "()V")
    public final void method816() {
        if (this.field2338 == null) {
            this.field2338 = new class50[this.field2333];
            for (int var1 = 0; var1 < this.field2333; ++var1) {
                this.field2338[var1] = new class50();
            }
            for (int var2 = 0; var2 < this.field2349; ++var2) {
                int var3 = this.field2340[var2];
                int var4 = this.field2344[var2];
                int var5 = this.field2321[var2];
                int var6 = this.field2342[var4] - this.field2342[var3];
                int var7 = this.field2341[var4] - this.field2341[var3];
                int var8 = this.field2353[var4] - this.field2353[var3];
                int var9 = this.field2342[var5] - this.field2342[var3];
                int var10 = this.field2341[var5] - this.field2341[var3];
                int var11 = this.field2353[var5] - this.field2353[var3];
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
                if (this.field2355 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field2355[var2];
                }
                if (var19 == 0) {
                    class50 var20 = this.field2338[var3];
                    var20.field1169 += var16;
                    var20.field1172 += var17;
                    var20.field1171 += var18;
                    ++var20.field1176;
                    class50 var21 = this.field2338[var4];
                    var21.field1169 += var16;
                    var21.field1172 += var17;
                    var21.field1171 += var18;
                    ++var21.field1176;
                    class50 var22 = this.field2338[var5];
                    var22.field1169 += var16;
                    var22.field1172 += var17;
                    var22.field1171 += var18;
                    ++var22.field1176;
                } else if (var19 == 1) {
                    if (this.field2364 == null) {
                        this.field2364 = new class80[this.field2349];
                    }
                    class80 var23 = this.field2364[var2] = new class80();
                    var23.field1692 = var16;
                    var23.field1706 = var17;
                    var23.field1695 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "()V")
    private final void method817() {
        int var10002;
        if (this.field2328 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2333; ++var3) {
                int var7 = this.field2328[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2326 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field2326[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2333) {
                int var6 = this.field2328[var5];
                this.field2326[var6][var1[var6]++] = var5++;
            }
            this.field2328 = null;
        }
        if (this.field2348 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field2349; ++var10) {
                int var14 = this.field2348[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field2320 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field2320[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field2349) {
                int var13 = this.field2348[var12];
                this.field2320[var13][var8[var13]++] = var12++;
            }
            this.field2348 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    private class110() {
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([B)V")
    private class110(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method813(arg0);
        } else {
            this.method814(arg0);
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([Lpf;I)V")
    public class110(class110[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2333 = 0;
        this.field2349 = 0;
        this.field2337 = 0;
        this.field2343 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class110 var15 = arg0[var9];
            if (var15 != null) {
                this.field2333 += var15.field2333;
                this.field2349 += var15.field2349;
                this.field2337 += var15.field2337;
                if (var15.field2354 != null) {
                    var4 = true;
                } else {
                    if (this.field2343 == -1) {
                        this.field2343 = var15.field2343;
                    }
                    if (this.field2343 != var15.field2343) {
                        var4 = true;
                    }
                }
                var3 |= var15.field2355 != null;
                var5 |= var15.field2362 != null;
                var6 |= var15.field2348 != null;
                var7 |= var15.field2323 != null;
                var8 |= var15.field2346 != null;
            }
        }
        this.field2342 = new int[this.field2333];
        this.field2341 = new int[this.field2333];
        this.field2353 = new int[this.field2333];
        this.field2328 = new int[this.field2333];
        this.field2340 = new int[this.field2349];
        this.field2344 = new int[this.field2349];
        this.field2321 = new int[this.field2349];
        if (var3) {
            this.field2355 = new byte[this.field2349];
        }
        if (var4) {
            this.field2354 = new byte[this.field2349];
        }
        if (var5) {
            this.field2362 = new byte[this.field2349];
        }
        if (var6) {
            this.field2348 = new int[this.field2349];
        }
        if (var7) {
            this.field2323 = new short[this.field2349];
        }
        if (var8) {
            this.field2346 = new byte[this.field2349];
        }
        this.field2351 = new short[this.field2349];
        if (this.field2337 > 0) {
            this.field2322 = new byte[this.field2337];
            this.field2359 = new short[this.field2337];
            this.field2350 = new short[this.field2337];
            this.field2336 = new short[this.field2337];
            this.field2324 = new short[this.field2337];
            this.field2357 = new short[this.field2337];
            this.field2334 = new short[this.field2337];
            this.field2330 = new short[this.field2337];
            this.field2329 = new byte[this.field2337];
            this.field2335 = new short[this.field2337];
            this.field2331 = new short[this.field2337];
        }
        this.field2333 = 0;
        this.field2349 = 0;
        this.field2337 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class110 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field2349; ++var12) {
                    if (var3 && var11.field2355 != null) {
                        this.field2355[this.field2349] = var11.field2355[var12];
                    }
                    if (var4) {
                        if (var11.field2354 != null) {
                            this.field2354[this.field2349] = var11.field2354[var12];
                        } else {
                            this.field2354[this.field2349] = var11.field2343;
                        }
                    }
                    if (var5 && var11.field2362 != null) {
                        this.field2362[this.field2349] = var11.field2362[var12];
                    }
                    if (var6 && var11.field2348 != null) {
                        this.field2348[this.field2349] = var11.field2348[var12];
                    }
                    if (var7) {
                        if (var11.field2323 != null) {
                            this.field2323[this.field2349] = var11.field2323[var12];
                        } else {
                            this.field2323[this.field2349] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field2346 != null && var11.field2346[var12] != -1) {
                            this.field2346[this.field2349] = (byte) (var11.field2346[var12] + this.field2337);
                        } else {
                            this.field2346[this.field2349] = -1;
                        }
                    }
                    this.field2351[this.field2349] = var11.field2351[var12];
                    this.field2340[this.field2349] = this.method795(var11, var11.field2340[var12]);
                    this.field2344[this.field2349] = this.method795(var11, var11.field2344[var12]);
                    this.field2321[this.field2349] = this.method795(var11, var11.field2321[var12]);
                    ++this.field2349;
                }
                for (int var13 = 0; var13 < var11.field2337; ++var13) {
                    byte var14 = this.field2322[this.field2337] = var11.field2322[var13];
                    if (var14 == 0) {
                        this.field2359[this.field2337] = (short) this.method795(var11, var11.field2359[var13]);
                        this.field2350[this.field2337] = (short) this.method795(var11, var11.field2350[var13]);
                        this.field2336[this.field2337] = (short) this.method795(var11, var11.field2336[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field2359[this.field2337] = var11.field2359[var13];
                        this.field2350[this.field2337] = var11.field2350[var13];
                        this.field2336[this.field2337] = var11.field2336[var13];
                        this.field2324[this.field2337] = var11.field2324[var13];
                        this.field2357[this.field2337] = var11.field2357[var13];
                        this.field2334[this.field2337] = var11.field2334[var13];
                        this.field2330[this.field2337] = var11.field2330[var13];
                        this.field2329[this.field2337] = var11.field2329[var13];
                        this.field2335[this.field2337] = var11.field2335[var13];
                    }
                    if (var14 == 2) {
                        this.field2331[this.field2337] = var11.field2331[var13];
                    }
                    ++this.field2337;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lpf;ZZZZ)V")
    public class110(class110 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2333 = arg0.field2333;
        this.field2349 = arg0.field2349;
        this.field2337 = arg0.field2337;
        if (arg1) {
            this.field2342 = arg0.field2342;
            this.field2341 = arg0.field2341;
            this.field2353 = arg0.field2353;
        } else {
            this.field2342 = new int[this.field2333];
            this.field2341 = new int[this.field2333];
            this.field2353 = new int[this.field2333];
            for (int var6 = 0; var6 < this.field2333; ++var6) {
                this.field2342[var6] = arg0.field2342[var6];
                this.field2341[var6] = arg0.field2341[var6];
                this.field2353[var6] = arg0.field2353[var6];
            }
        }
        if (arg2) {
            this.field2351 = arg0.field2351;
        } else {
            this.field2351 = new short[this.field2349];
            for (int var7 = 0; var7 < this.field2349; ++var7) {
                this.field2351[var7] = arg0.field2351[var7];
            }
        }
        if (!arg3 && arg0.field2323 != null) {
            this.field2323 = new short[this.field2349];
            for (int var8 = 0; var8 < this.field2349; ++var8) {
                this.field2323[var8] = arg0.field2323[var8];
            }
        } else {
            this.field2323 = arg0.field2323;
        }
        if (arg4) {
            this.field2362 = arg0.field2362;
        } else {
            this.field2362 = new byte[this.field2349];
            if (arg0.field2362 == null) {
                for (int var9 = 0; var9 < this.field2349; ++var9) {
                    this.field2362[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2349; ++var10) {
                    this.field2362[var10] = arg0.field2362[var10];
                }
            }
        }
        this.field2340 = arg0.field2340;
        this.field2344 = arg0.field2344;
        this.field2321 = arg0.field2321;
        this.field2355 = arg0.field2355;
        this.field2354 = arg0.field2354;
        this.field2346 = arg0.field2346;
        this.field2343 = arg0.field2343;
        this.field2322 = arg0.field2322;
        this.field2359 = arg0.field2359;
        this.field2350 = arg0.field2350;
        this.field2336 = arg0.field2336;
        this.field2324 = arg0.field2324;
        this.field2357 = arg0.field2357;
        this.field2334 = arg0.field2334;
        this.field2330 = arg0.field2330;
        this.field2329 = arg0.field2329;
        this.field2335 = arg0.field2335;
        this.field2331 = arg0.field2331;
        this.field2328 = arg0.field2328;
        this.field2348 = arg0.field2348;
        this.field2326 = arg0.field2326;
        this.field2320 = arg0.field2320;
        this.field2338 = arg0.field2338;
        this.field2364 = arg0.field2364;
        this.field2347 = arg0.field2347;
        this.field2358 = arg0.field2358;
        this.field2363 = arg0.field2363;
    }
}
