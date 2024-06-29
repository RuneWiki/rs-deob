import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class195 extends class255 {

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "Z")
    private boolean field3283 = false;

    @OriginalMember(owner = "client!qj", name = "eb", descriptor = "B")
    public byte field3321 = 0;

    @OriginalMember(owner = "client!qj", name = "db", descriptor = "I")
    public int field3320 = 0;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
    public int field3286 = 0;

    @OriginalMember(owner = "client!qj", name = "cb", descriptor = "[I")
    public int[] field3319;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "[I")
    public int[] field3309;

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "[I")
    public int[] field3296;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "[I")
    public int[] field3279;

    @OriginalMember(owner = "client!qj", name = "kb", descriptor = "[I")
    public int[] field3327;

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "[I")
    public int[] field3292;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "[I")
    public int[] field3284;

    @OriginalMember(owner = "client!qj", name = "ib", descriptor = "[B")
    public byte[] field3325;

    @OriginalMember(owner = "client!qj", name = "bb", descriptor = "[B")
    public byte[] field3318;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "[B")
    public byte[] field3287;

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "[S")
    public short[] field3298;

    @OriginalMember(owner = "client!qj", name = "W", descriptor = "[S")
    public short[] field3313;

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "[B")
    public byte[] field3293;

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "[I")
    public int[] field3312;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "[B")
    public byte[] field3301;

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "[S")
    public short[] field3311;

    @OriginalMember(owner = "client!qj", name = "Z", descriptor = "[S")
    public short[] field3316;

    @OriginalMember(owner = "client!qj", name = "X", descriptor = "[S")
    public short[] field3314;

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "[S")
    public short[] field3306;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "[S")
    public short[] field3303;

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "[S")
    public short[] field3305;

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "[B")
    public byte[] field3295;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "[B")
    public byte[] field3282;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "[B")
    public byte[] field3280;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "[B")
    public byte[] field3288;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "[B")
    public byte[] field3299;

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "I")
    public int field3308;

    @OriginalMember(owner = "client!qj", name = "Y", descriptor = "[[I")
    public int[][] field3315;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "[[I")
    public int[][] field3307;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "[Lqk;")
    public class61[] field3285;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "[Lei;")
    public class242[] field3302;

    @OriginalMember(owner = "client!qj", name = "jb", descriptor = "[Lqk;")
    public class61[] field3326;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "S")
    public short field3281;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "S")
    public short field3290;

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "[I")
    private static int[] field3297 = class312.field5269;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "[I")
    private static int[] field3310 = class312.field5262;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "I")
    private static int field3291 = 0;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "[I")
    private static int[] field3289 = new int[10000];

    @OriginalMember(owner = "client!qj", name = "ab", descriptor = "[I")
    private static int[] field3317 = new int[10000];

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "S")
    private short field3294;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "S")
    private short field3300;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "S")
    private short field3304;

    @OriginalMember(owner = "client!qj", name = "fb", descriptor = "S")
    private short field3322;

    @OriginalMember(owner = "client!qj", name = "gb", descriptor = "S")
    private short field3323;

    @OriginalMember(owner = "client!qj", name = "hb", descriptor = "S")
    private short field3324;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 4)
    private final void method1439(int arg0) {
        int var2 = field3310[arg0];
        int var3 = field3297[arg0];
        for (int var4 = 0; var4 < this.field3320; var4++) {
            int var5 = this.field3319[var4] * var3 + this.field3309[var4] * var2 >> 16;
            this.field3309[var4] = this.field3309[var4] * var3 - this.field3319[var4] * var2 >> 16;
            this.field3319[var4] = var5;
        }
        this.method1456();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lrk;IIIZ)V", line = 23)
    public final void method797(class255 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class195 var6 = (class195) arg0;
        var6.method1453();
        var6.method1455();
        field3291++;
        int var7 = 0;
        int[] var8 = var6.field3319;
        int var9 = var6.field3320;
        for (int var10 = 0; var10 < this.field3320; var10++) {
            class61 var11 = this.field3285[var10];
            if (var11.field943 != 0) {
                int var12 = this.field3309[var10] - arg2;
                if (var12 >= var6.field3324 && var12 <= var6.field3323) {
                    int var13 = this.field3319[var10] - arg1;
                    if (var13 >= var6.field3304 && var13 <= var6.field3294) {
                        int var14 = this.field3296[var10] - arg3;
                        if (var14 >= var6.field3322 && var14 <= var6.field3300) {
                            for (int var15 = 0; var15 < var9; var15++) {
                                class61 var16 = var6.field3285[var15];
                                if (var8[var15] == var13 && var6.field3296[var15] == var14 && var6.field3309[var15] == var12 && var16.field943 != 0) {
                                    if (this.field3326 == null) {
                                        this.field3326 = new class61[this.field3320];
                                    }
                                    if (var6.field3326 == null) {
                                        var6.field3326 = new class61[var9];
                                    }
                                    class61 var17 = this.field3326[var10];
                                    if (var17 == null) {
                                        var17 = this.field3326[var10] = new class61(var11);
                                    }
                                    class61 var18 = var6.field3326[var15];
                                    if (var18 == null) {
                                        var18 = var6.field3326[var15] = new class61(var16);
                                    }
                                    var17.field944 += var16.field944;
                                    var17.field941 += var16.field941;
                                    var17.field950 += var16.field950;
                                    var17.field943 += var16.field943;
                                    var18.field944 += var11.field944;
                                    var18.field941 += var11.field941;
                                    var18.field950 += var11.field950;
                                    var18.field943 += var11.field943;
                                    var7++;
                                    field3289[var10] = field3291;
                                    field3317[var15] = field3291;
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
        for (int var19 = 0; var19 < this.field3286; var19++) {
            if (field3289[this.field3327[var19]] == field3291 && field3289[this.field3292[var19]] == field3291 && field3289[this.field3284[var19]] == field3291) {
                if (this.field3325 == null) {
                    this.field3325 = new byte[this.field3286];
                }
                this.field3325[var19] = 2;
            }
        }
        for (int var20 = 0; var20 < var6.field3286; var20++) {
            if (field3317[var6.field3327[var20]] == field3291 && field3317[var6.field3292[var20]] == field3291 && field3317[var6.field3284[var20]] == field3291) {
                if (var6.field3325 == null) {
                    var6.field3325 = new byte[var6.field3286];
                }
                var6.field3325[var20] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "()Lqj;", line = 140)
    public final class195 method1440() {
        class195 var1 = new class195();
        if (this.field3325 != null) {
            var1.field3325 = new byte[this.field3286];
            for (int var2 = 0; var2 < this.field3286; var2++) {
                var1.field3325[var2] = this.field3325[var2];
            }
        }
        var1.field3320 = this.field3320;
        var1.field3286 = this.field3286;
        var1.field3308 = this.field3308;
        var1.field3319 = this.field3319;
        var1.field3309 = this.field3309;
        var1.field3296 = this.field3296;
        var1.field3327 = this.field3327;
        var1.field3292 = this.field3292;
        var1.field3284 = this.field3284;
        var1.field3318 = this.field3318;
        var1.field3287 = this.field3287;
        var1.field3293 = this.field3293;
        var1.field3298 = this.field3298;
        var1.field3313 = this.field3313;
        var1.field3321 = this.field3321;
        var1.field3301 = this.field3301;
        var1.field3311 = this.field3311;
        var1.field3316 = this.field3316;
        var1.field3314 = this.field3314;
        var1.field3306 = this.field3306;
        var1.field3303 = this.field3303;
        var1.field3305 = this.field3305;
        var1.field3295 = this.field3295;
        var1.field3282 = this.field3282;
        var1.field3280 = this.field3280;
        var1.field3288 = this.field3288;
        var1.field3299 = this.field3299;
        var1.field3279 = this.field3279;
        var1.field3312 = this.field3312;
        var1.field3315 = this.field3315;
        var1.field3307 = this.field3307;
        var1.field3285 = this.field3285;
        var1.field3302 = this.field3302;
        var1.field3281 = this.field3281;
        var1.field3290 = this.field3290;
        return var1;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(III)V", line = 196)
    public final void method1441(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field3310[arg2];
            int var5 = field3297[arg2];
            for (int var6 = 0; var6 < this.field3320; var6++) {
                int var7 = this.field3319[var6] * var5 + this.field3309[var6] * var4 >> 16;
                this.field3309[var6] = this.field3309[var6] * var5 - this.field3319[var6] * var4 >> 16;
                this.field3319[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field3310[arg0];
            int var9 = field3297[arg0];
            for (int var10 = 0; var10 < this.field3320; var10++) {
                int var11 = this.field3309[var10] * var9 - this.field3296[var10] * var8 >> 16;
                this.field3296[var10] = this.field3309[var10] * var8 + this.field3296[var10] * var9 >> 16;
                this.field3309[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field3310[arg1];
        int var13 = field3297[arg1];
        for (int var14 = 0; var14 < this.field3320; var14++) {
            int var15 = this.field3319[var14] * var13 + this.field3296[var14] * var12 >> 16;
            this.field3296[var14] = this.field3296[var14] * var13 - this.field3319[var14] * var12 >> 16;
            this.field3319[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([[IIIIII)V", line = 259)
    private final void method1442(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1467(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1467(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1467(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1467(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1462(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1439(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1460(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "()Z", line = 322)
    public final boolean method824() {
        return true;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIBSB)I", line = 327)
    public final int method1443(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field3327[this.field3286] = arg0;
        this.field3292[this.field3286] = arg1;
        this.field3284[this.field3286] = arg2;
        this.field3325[this.field3286] = arg3;
        this.field3293[this.field3286] = -1;
        this.field3298[this.field3286] = arg4;
        this.field3313[this.field3286] = -1;
        this.field3287[this.field3286] = arg5;
        return this.field3286++;
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "()V", line = 340)
    public final void method1444() {
        for (int var1 = 0; var1 < this.field3320; var1++) {
            this.field3319[var1] = -this.field3319[var1];
            this.field3296[var1] = -this.field3296[var1];
        }
        this.method1456();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([B)V", line = 358)
    private final void method1445(byte[] arg0) {
        class94 var2 = new class94(arg0);
        class94 var3 = new class94(arg0);
        class94 var4 = new class94(arg0);
        class94 var5 = new class94(arg0);
        class94 var6 = new class94(arg0);
        class94 var7 = new class94(arg0);
        class94 var8 = new class94(arg0);
        var2.field1653 = arg0.length - 23;
        int var9 = var2.method761((byte) 108);
        int var10 = var2.method761((byte) 108);
        int var11 = var2.method756(915905888);
        int var12 = var2.method756(915905888);
        int var13 = var2.method756(915905888);
        int var14 = var2.method756(915905888);
        int var15 = var2.method756(915905888);
        int var16 = var2.method756(915905888);
        int var17 = var2.method756(915905888);
        int var18 = var2.method761((byte) 108);
        int var19 = var2.method761((byte) 108);
        int var20 = var2.method761((byte) 108);
        int var21 = var2.method761((byte) 108);
        int var22 = var2.method761((byte) 108);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field3301 = new byte[var11];
            var2.field1653 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field3301[var26] = var2.method719((byte) -42);
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
        this.field3320 = var9;
        this.field3286 = var10;
        this.field3308 = var11;
        this.field3319 = new int[var9];
        this.field3309 = new int[var9];
        this.field3296 = new int[var9];
        this.field3327 = new int[var10];
        this.field3292 = new int[var10];
        this.field3284 = new int[var10];
        if (var17 == 1) {
            this.field3279 = new int[var9];
        }
        if (var12 == 1) {
            this.field3325 = new byte[var10];
        }
        if (var13 == 255) {
            this.field3318 = new byte[var10];
        } else {
            this.field3321 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3287 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3312 = new int[var10];
        }
        if (var16 == 1) {
            this.field3313 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field3293 = new byte[var10];
        }
        this.field3298 = new short[var10];
        if (var11 > 0) {
            this.field3311 = new short[var11];
            this.field3316 = new short[var11];
            this.field3314 = new short[var11];
            if (var24 > 0) {
                this.field3306 = new short[var24];
                this.field3303 = new short[var24];
                this.field3305 = new short[var24];
                this.field3295 = new byte[var24];
                this.field3282 = new byte[var24];
                this.field3280 = new byte[var24];
            }
            if (var25 > 0) {
                this.field3288 = new byte[var25];
                this.field3299 = new byte[var25];
            }
        }
        var2.field1653 = var11;
        var3.field1653 = var44;
        var4.field1653 = var46;
        var5.field1653 = var48;
        var6.field1653 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var67 = var2.method756(915905888);
            int var68 = 0;
            if ((var67 & 0x1) != 0) {
                var68 = var3.method702(-126);
            }
            int var69 = 0;
            if ((var67 & 0x2) != 0) {
                var69 = var4.method702(-95);
            }
            int var70 = 0;
            if ((var67 & 0x4) != 0) {
                var70 = var5.method702(-51);
            }
            this.field3319[var66] = var63 + var68;
            this.field3309[var66] = var64 + var69;
            this.field3296[var66] = var65 + var70;
            var63 = this.field3319[var66];
            var64 = this.field3309[var66];
            var65 = this.field3296[var66];
            if (var17 == 1) {
                this.field3279[var66] = var6.method756(915905888);
            }
        }
        var2.field1653 = var42;
        var3.field1653 = var31;
        var4.field1653 = var34;
        var5.field1653 = var37;
        var6.field1653 = var35;
        var7.field1653 = var40;
        var8.field1653 = var39;
        for (int var71 = 0; var71 < var10; var71++) {
            this.field3298[var71] = (short) var2.method761((byte) 108);
            if (var12 == 1) {
                this.field3325[var71] = var3.method719((byte) -42);
            }
            if (var13 == 255) {
                this.field3318[var71] = var4.method719((byte) -42);
            }
            if (var14 == 1) {
                this.field3287[var71] = var5.method719((byte) -42);
            }
            if (var15 == 1) {
                this.field3312[var71] = var6.method756(915905888);
            }
            if (var16 == 1) {
                this.field3313[var71] = (short) (var7.method761((byte) 108) - 1);
            }
            if (this.field3293 != null) {
                if (this.field3313[var71] == -1) {
                    this.field3293[var71] = -1;
                } else {
                    this.field3293[var71] = (byte) (var8.method756(915905888) - 1);
                }
            }
        }
        var2.field1653 = var33;
        var3.field1653 = var30;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        for (int var76 = 0; var76 < var10; var76++) {
            int var77 = var3.method756(915905888);
            if (var77 == 1) {
                var72 = var2.method702(-99) + var75;
                var73 = var2.method702(-75) + var72;
                var74 = var2.method702(-120) + var73;
                var75 = var74;
                this.field3327[var76] = var72;
                this.field3292[var76] = var73;
                this.field3284[var76] = var74;
            }
            if (var77 == 2) {
                var73 = var74;
                var74 = var2.method702(-33) + var75;
                var75 = var74;
                this.field3327[var76] = var72;
                this.field3292[var76] = var73;
                this.field3284[var76] = var74;
            }
            if (var77 == 3) {
                var72 = var74;
                var74 = var2.method702(-34) + var75;
                var75 = var74;
                this.field3327[var76] = var72;
                this.field3292[var76] = var73;
                this.field3284[var76] = var74;
            }
            if (var77 == 4) {
                int var80 = var72;
                var72 = var73;
                var73 = var80;
                var74 = var2.method702(-96) + var75;
                var75 = var74;
                this.field3327[var76] = var72;
                this.field3292[var76] = var80;
                this.field3284[var76] = var74;
            }
        }
        var2.field1653 = var50;
        var3.field1653 = var52;
        var4.field1653 = var54;
        var5.field1653 = var56;
        var6.field1653 = var58;
        var7.field1653 = var60;
        for (int var81 = 0; var81 < var11; var81++) {
            int var82 = this.field3301[var81] & 0xFF;
            if (var82 == 0) {
                this.field3311[var81] = (short) var2.method761((byte) 108);
                this.field3316[var81] = (short) var2.method761((byte) 108);
                this.field3314[var81] = (short) var2.method761((byte) 108);
            }
            if (var82 == 1) {
                this.field3311[var81] = (short) var3.method761((byte) 108);
                this.field3316[var81] = (short) var3.method761((byte) 108);
                this.field3314[var81] = (short) var3.method761((byte) 108);
                this.field3306[var81] = (short) var4.method761((byte) 108);
                this.field3303[var81] = (short) var4.method761((byte) 108);
                this.field3305[var81] = (short) var4.method761((byte) 108);
                this.field3295[var81] = var5.method719((byte) -42);
                this.field3282[var81] = var6.method719((byte) -42);
                this.field3280[var81] = var7.method719((byte) -42);
            }
            if (var82 == 2) {
                this.field3311[var81] = (short) var3.method761((byte) 108);
                this.field3316[var81] = (short) var3.method761((byte) 108);
                this.field3314[var81] = (short) var3.method761((byte) 108);
                this.field3306[var81] = (short) var4.method761((byte) 108);
                this.field3303[var81] = (short) var4.method761((byte) 108);
                this.field3305[var81] = (short) var4.method761((byte) 108);
                this.field3295[var81] = var5.method719((byte) -42);
                this.field3282[var81] = var6.method719((byte) -42);
                this.field3280[var81] = var7.method719((byte) -42);
                this.field3288[var81] = var7.method719((byte) -42);
                this.field3299[var81] = var7.method719((byte) -42);
            }
            if (var82 == 3) {
                this.field3311[var81] = (short) var3.method761((byte) 108);
                this.field3316[var81] = (short) var3.method761((byte) 108);
                this.field3314[var81] = (short) var3.method761((byte) 108);
                this.field3306[var81] = (short) var4.method761((byte) 108);
                this.field3303[var81] = (short) var4.method761((byte) 108);
                this.field3305[var81] = (short) var4.method761((byte) 108);
                this.field3295[var81] = var5.method719((byte) -42);
                this.field3282[var81] = var6.method719((byte) -42);
                this.field3280[var81] = var7.method719((byte) -42);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "()V", line = 780)
    public final void method1446() {
        for (int var1 = 0; var1 < this.field3320; var1++) {
            int var2 = this.field3296[var1];
            this.field3296[var1] = this.field3319[var1];
            this.field3319[var1] = -var2;
        }
        this.method1456();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "()I", line = 794)
    public final int method46() {
        if (!this.field3283) {
            this.method1453();
        }
        return this.field3324;
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "()V", line = 811)
    public final void method1447() {
        for (int var1 = 0; var1 < this.field3320; var1++) {
            this.field3296[var1] = -this.field3296[var1];
        }
        for (int var2 = 0; var2 < this.field3286; var2++) {
            int var3 = this.field3327[var2];
            this.field3327[var2] = this.field3284[var2];
            this.field3284[var2] = var3;
        }
        this.method1456();
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V", line = 834)
    public final void method1448(int arg0) {
        int var2 = field3310[arg0];
        int var3 = field3297[arg0];
        for (int var4 = 0; var4 < this.field3320; var4++) {
            int var5 = this.field3319[var4] * var3 + this.field3296[var4] * var2 >> 16;
            this.field3296[var4] = this.field3296[var4] * var3 - this.field3319[var4] * var2 >> 16;
            this.field3319[var4] = var5;
        }
        this.method1456();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lda;II)Lqj;", line = 854)
    public static final class195 method1449(class143 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1128(arg2, 0, arg1);
        return var3 == null ? null : new class195(var3);
    }

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "()V", line = 861)
    public final void method1450() {
        this.field3279 = null;
        this.field3312 = null;
        this.field3315 = (int[][]) null;
        this.field3307 = (int[][]) null;
    }

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "()V", line = 873)
    public static void method1451() {
        field3289 = null;
        field3317 = null;
        field3310 = null;
        field3297 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II[[I[[IIIIZZ)Lqj;", line = 880)
    public final class195 method1452(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1453();
        int var10 = this.field3304 + arg4;
        int var11 = this.field3294 + arg4;
        int var12 = this.field3322 + arg6;
        int var13 = this.field3300 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class195 var18;
        if (arg7) {
            var18 = new class195();
            var18.field3320 = this.field3320;
            var18.field3286 = this.field3286;
            var18.field3308 = this.field3308;
            var18.field3327 = this.field3327;
            var18.field3292 = this.field3292;
            var18.field3284 = this.field3284;
            var18.field3325 = this.field3325;
            var18.field3318 = this.field3318;
            var18.field3287 = this.field3287;
            var18.field3293 = this.field3293;
            var18.field3298 = this.field3298;
            var18.field3313 = this.field3313;
            var18.field3321 = this.field3321;
            var18.field3301 = this.field3301;
            var18.field3311 = this.field3311;
            var18.field3316 = this.field3316;
            var18.field3314 = this.field3314;
            var18.field3306 = this.field3306;
            var18.field3303 = this.field3303;
            var18.field3305 = this.field3305;
            var18.field3295 = this.field3295;
            var18.field3282 = this.field3282;
            var18.field3280 = this.field3280;
            var18.field3288 = this.field3288;
            var18.field3299 = this.field3299;
            var18.field3279 = this.field3279;
            var18.field3312 = this.field3312;
            var18.field3315 = this.field3315;
            var18.field3307 = this.field3307;
            var18.field3281 = this.field3281;
            var18.field3290 = this.field3290;
            var18.field3285 = this.field3285;
            var18.field3302 = this.field3302;
            var18.field3326 = this.field3326;
            if (arg0 == 3) {
                var18.field3319 = class72.method524(this.field3319, -30180);
                var18.field3309 = class72.method524(this.field3309, -30180);
                var18.field3296 = class72.method524(this.field3296, -30180);
            } else {
                var18.field3319 = this.field3319;
                var18.field3309 = new int[var18.field3320];
                var18.field3296 = this.field3296;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field3320; var19++) {
                int var20 = this.field3319[var19] + arg4;
                int var21 = this.field3296[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field3309[var19] = this.field3309[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field3320; var29++) {
                int var30 = (this.field3309[var29] << 16) / this.field3324;
                if (var30 < arg1) {
                    int var31 = this.field3319[var29] + arg4;
                    int var32 = this.field3296[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field3309[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field3309[var29];
                } else {
                    var18.field3309[var29] = this.field3309[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method1442(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field3323 - this.field3324;
            for (int var43 = 0; var43 < this.field3320; var43++) {
                int var44 = this.field3319[var43] + arg4;
                int var45 = this.field3296[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field3309[var43] = var52 + this.field3309[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field3323 - this.field3324;
            for (int var54 = 0; var54 < this.field3320; var54++) {
                int var55 = this.field3319[var54] + arg4;
                int var56 = this.field3296[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field3309[var54] = ((this.field3309[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method1456();
        } else {
            this.field3283 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "()V", line = 1144)
    private final void method1453() {
        if (this.field3283) {
            return;
        }
        this.field3283 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field3320; var7++) {
            int var8 = this.field3319[var7];
            int var9 = this.field3309[var7];
            int var10 = this.field3296[var7];
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
        this.field3304 = (short) var1;
        this.field3294 = (short) var4;
        this.field3324 = (short) var2;
        this.field3323 = (short) var5;
        this.field3322 = (short) var3;
        this.field3300 = (short) var6;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(SS)V", line = 1204)
    public final void method1454(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3286; var3++) {
            if (this.field3298[var3] == arg0) {
                this.field3298[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "()V", line = 1215)
    public final void method1455() {
        if (this.field3285 != null) {
            return;
        }
        this.field3285 = new class61[this.field3320];
        for (int var1 = 0; var1 < this.field3320; var1++) {
            this.field3285[var1] = new class61();
        }
        for (int var2 = 0; var2 < this.field3286; var2++) {
            int var3 = this.field3327[var2];
            int var4 = this.field3292[var2];
            int var5 = this.field3284[var2];
            int var6 = this.field3319[var4] - this.field3319[var3];
            int var7 = this.field3309[var4] - this.field3309[var3];
            int var8 = this.field3296[var4] - this.field3296[var3];
            int var9 = this.field3319[var5] - this.field3319[var3];
            int var10 = this.field3309[var5] - this.field3309[var3];
            int var11 = this.field3296[var5] - this.field3296[var3];
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
            if (this.field3325 == null) {
                var19 = 0;
            } else {
                var19 = this.field3325[var2];
            }
            if (var19 == 0) {
                class61 var20 = this.field3285[var3];
                var20.field944 += var16;
                var20.field941 += var17;
                var20.field950 += var18;
                var20.field943++;
                class61 var21 = this.field3285[var4];
                var21.field944 += var16;
                var21.field941 += var17;
                var21.field950 += var18;
                var21.field943++;
                class61 var22 = this.field3285[var5];
                var22.field944 += var16;
                var22.field941 += var17;
                var22.field950 += var18;
                var22.field943++;
            } else if (var19 == 1) {
                if (this.field3302 == null) {
                    this.field3302 = new class242[this.field3286];
                }
                class242 var23 = this.field3302[var2] = new class242();
                var23.field4032 = var16;
                var23.field4024 = var17;
                var23.field4018 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "()V", line = 1318)
    private final void method1456() {
        this.field3285 = null;
        this.field3326 = null;
        this.field3302 = null;
        this.field3283 = false;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(III)I", line = 1326)
    public final int method1457(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3320; var4++) {
            if (this.field3319[var4] == arg0 && this.field3309[var4] == arg1 && this.field3296[var4] == arg2) {
                return var4;
            }
        }
        this.field3319[this.field3320] = arg0;
        this.field3309[this.field3320] = arg1;
        this.field3296[this.field3320] = arg2;
        return this.field3320++;
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(III)V", line = 1342)
    public final void method1458(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3320; var4++) {
            this.field3319[var4] = this.field3319[var4] * arg0 / 128;
            this.field3309[var4] = this.field3309[var4] * arg1 / 128;
            this.field3296[var4] = this.field3296[var4] * arg2 / 128;
        }
        this.method1456();
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "([B)V", line = 1355)
    private final void method1459(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class94 var4 = new class94(arg0);
        class94 var5 = new class94(arg0);
        class94 var6 = new class94(arg0);
        class94 var7 = new class94(arg0);
        class94 var8 = new class94(arg0);
        var4.field1653 = arg0.length - 18;
        int var9 = var4.method761((byte) 108);
        int var10 = var4.method761((byte) 108);
        int var11 = var4.method756(915905888);
        int var12 = var4.method756(915905888);
        int var13 = var4.method756(915905888);
        int var14 = var4.method756(915905888);
        int var15 = var4.method756(915905888);
        int var16 = var4.method756(915905888);
        int var17 = var4.method761((byte) 108);
        int var18 = var4.method761((byte) 108);
        int var19 = var4.method761((byte) 108);
        int var20 = var4.method761((byte) 108);
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
        this.field3320 = var9;
        this.field3286 = var10;
        this.field3308 = var11;
        this.field3319 = new int[var9];
        this.field3309 = new int[var9];
        this.field3296 = new int[var9];
        this.field3327 = new int[var10];
        this.field3292 = new int[var10];
        this.field3284 = new int[var10];
        if (var11 > 0) {
            this.field3301 = new byte[var11];
            this.field3311 = new short[var11];
            this.field3316 = new short[var11];
            this.field3314 = new short[var11];
        }
        if (var16 == 1) {
            this.field3279 = new int[var9];
        }
        if (var12 == 1) {
            this.field3325 = new byte[var10];
            this.field3293 = new byte[var10];
            this.field3313 = new short[var10];
        }
        if (var13 == 255) {
            this.field3318 = new byte[var10];
        } else {
            this.field3321 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3287 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3312 = new int[var10];
        }
        this.field3298 = new short[var10];
        var4.field1653 = var21;
        var5.field1653 = var36;
        var6.field1653 = var38;
        var7.field1653 = var40;
        var8.field1653 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method756(915905888);
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method702(-65);
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method702(-122);
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method702(-100);
            }
            this.field3319[var46] = var43 + var48;
            this.field3309[var46] = var44 + var49;
            this.field3296[var46] = var45 + var50;
            var43 = this.field3319[var46];
            var44 = this.field3309[var46];
            var45 = this.field3296[var46];
            if (var16 == 1) {
                this.field3279[var46] = var8.method756(915905888);
            }
        }
        var4.field1653 = var32;
        var5.field1653 = var28;
        var6.field1653 = var26;
        var7.field1653 = var30;
        var8.field1653 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field3298[var51] = (short) var4.method761((byte) 108);
            if (var12 == 1) {
                int var52 = var5.method756(915905888);
                if ((var52 & 0x1) == 1) {
                    this.field3325[var51] = 1;
                    var2 = true;
                } else {
                    this.field3325[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field3293[var51] = (byte) (var52 >> 2);
                    this.field3313[var51] = this.field3298[var51];
                    this.field3298[var51] = 127;
                    if (this.field3313[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field3293[var51] = -1;
                    this.field3313[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field3318[var51] = var6.method719((byte) -42);
            }
            if (var14 == 1) {
                this.field3287[var51] = var7.method719((byte) -42);
            }
            if (var15 == 1) {
                this.field3312[var51] = var8.method756(915905888);
            }
        }
        var4.field1653 = var25;
        var5.field1653 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method756(915905888);
            if (var58 == 1) {
                var53 = var4.method702(-79) + var56;
                var54 = var4.method702(-36) + var53;
                var55 = var4.method702(-38) + var54;
                var56 = var55;
                this.field3327[var57] = var53;
                this.field3292[var57] = var54;
                this.field3284[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method702(-111) + var56;
                var56 = var55;
                this.field3327[var57] = var53;
                this.field3292[var57] = var54;
                this.field3284[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method702(-51) + var56;
                var56 = var55;
                this.field3327[var57] = var53;
                this.field3292[var57] = var54;
                this.field3284[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method702(-91) + var56;
                var56 = var55;
                this.field3327[var57] = var53;
                this.field3292[var57] = var61;
                this.field3284[var57] = var55;
            }
        }
        var4.field1653 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field3301[var62] = 0;
            this.field3311[var62] = (short) var4.method761((byte) 108);
            this.field3316[var62] = (short) var4.method761((byte) 108);
            this.field3314[var62] = (short) var4.method761((byte) 108);
        }
        if (this.field3293 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field3293[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field3311[var65] & 0xFFFF) == this.field3327[var64] && (this.field3316[var65] & 0xFFFF) == this.field3292[var64] && (this.field3314[var65] & 0xFFFF) == this.field3284[var64]) {
                        this.field3293[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field3293 = null;
            }
        }
        if (!var3) {
            this.field3313 = null;
        }
        if (!var2) {
            this.field3325 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(III)V", line = 1702)
    public final void method1460(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3320; var4++) {
            this.field3319[var4] += arg0;
            this.field3309[var4] += arg1;
            this.field3296[var4] += arg2;
        }
        this.method1456();
    }

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "()V", line = 1716)
    public final void method1461() {
        for (int var1 = 0; var1 < this.field3320; var1++) {
            int var2 = this.field3319[var1];
            this.field3319[var1] = this.field3296[var1];
            this.field3296[var1] = -var2;
        }
        this.method1456();
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V", line = 1731)
    private final void method1462(int arg0) {
        int var2 = field3310[arg0];
        int var3 = field3297[arg0];
        for (int var4 = 0; var4 < this.field3320; var4++) {
            int var5 = this.field3309[var4] * var3 - this.field3296[var4] * var2 >> 16;
            this.field3296[var4] = this.field3309[var4] * var2 + this.field3296[var4] * var3 >> 16;
            this.field3309[var4] = var5;
        }
        this.method1456();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIII)Lue;", line = 1755)
    public final class11 method1463(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class11(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIIIJ)V", line = 1758)
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)Lrk;", line = 1764)
    public final class255 method831(int arg0, int arg1, int arg2) {
        return this.method1465(this.field3281, this.field3290, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lqj;I)I", line = 1773)
    private final int method1464(class195 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field3319[arg1];
        int var5 = arg0.field3309[arg1];
        int var6 = arg0.field3296[arg1];
        for (int var7 = 0; var7 < this.field3320; var7++) {
            if (this.field3319[var7] == var4 && this.field3309[var7] == var5 && this.field3296[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field3319[this.field3320] = var4;
            this.field3309[this.field3320] = var5;
            this.field3296[this.field3320] = var6;
            if (arg0.field3279 != null) {
                this.field3279[this.field3320] = arg0.field3279[arg1];
            }
            var3 = this.field3320++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 1977)
    private class195() {
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "([B)V", line = 1979)
    private class195(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1445(arg0);
        } else {
            this.method1459(arg0);
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(III)V", line = 1986)
    public class195(int arg0, int arg1, int arg2) {
        this.field3319 = new int[arg0];
        this.field3309 = new int[arg0];
        this.field3296 = new int[arg0];
        this.field3279 = new int[arg0];
        this.field3327 = new int[arg1];
        this.field3292 = new int[arg1];
        this.field3284 = new int[arg1];
        this.field3325 = new byte[arg1];
        this.field3318 = new byte[arg1];
        this.field3287 = new byte[arg1];
        this.field3298 = new short[arg1];
        this.field3313 = new short[arg1];
        this.field3293 = new byte[arg1];
        this.field3312 = new int[arg1];
        if (arg2 > 0) {
            this.field3301 = new byte[arg2];
            this.field3311 = new short[arg2];
            this.field3316 = new short[arg2];
            this.field3314 = new short[arg2];
            this.field3306 = new short[arg2];
            this.field3303 = new short[arg2];
            this.field3305 = new short[arg2];
            this.field3295 = new byte[arg2];
            this.field3282 = new byte[arg2];
            this.field3280 = new byte[arg2];
            this.field3288 = new byte[arg2];
            this.field3299 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "([Lqj;I)V", line = 2018)
    public class195(class195[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field3320 = 0;
        this.field3286 = 0;
        this.field3308 = 0;
        this.field3321 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class195 var10 = arg0[var9];
            if (var10 != null) {
                this.field3320 += var10.field3320;
                this.field3286 += var10.field3286;
                this.field3308 += var10.field3308;
                if (var10.field3318 == null) {
                    if (this.field3321 == -1) {
                        this.field3321 = var10.field3321;
                    }
                    if (this.field3321 != var10.field3321) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field3325 != null;
                var5 |= var10.field3287 != null;
                var6 |= var10.field3312 != null;
                var7 |= var10.field3313 != null;
                var8 |= var10.field3293 != null;
            }
        }
        this.field3319 = new int[this.field3320];
        this.field3309 = new int[this.field3320];
        this.field3296 = new int[this.field3320];
        this.field3279 = new int[this.field3320];
        this.field3327 = new int[this.field3286];
        this.field3292 = new int[this.field3286];
        this.field3284 = new int[this.field3286];
        if (var3) {
            this.field3325 = new byte[this.field3286];
        }
        if (var4) {
            this.field3318 = new byte[this.field3286];
        }
        if (var5) {
            this.field3287 = new byte[this.field3286];
        }
        if (var6) {
            this.field3312 = new int[this.field3286];
        }
        if (var7) {
            this.field3313 = new short[this.field3286];
        }
        if (var8) {
            this.field3293 = new byte[this.field3286];
        }
        this.field3298 = new short[this.field3286];
        if (this.field3308 > 0) {
            this.field3301 = new byte[this.field3308];
            this.field3311 = new short[this.field3308];
            this.field3316 = new short[this.field3308];
            this.field3314 = new short[this.field3308];
            this.field3306 = new short[this.field3308];
            this.field3303 = new short[this.field3308];
            this.field3305 = new short[this.field3308];
            this.field3295 = new byte[this.field3308];
            this.field3282 = new byte[this.field3308];
            this.field3280 = new byte[this.field3308];
            this.field3288 = new byte[this.field3308];
            this.field3299 = new byte[this.field3308];
        }
        this.field3320 = 0;
        this.field3286 = 0;
        this.field3308 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class195 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field3286; var13++) {
                    if (var3 && var12.field3325 != null) {
                        this.field3325[this.field3286] = var12.field3325[var13];
                    }
                    if (var4) {
                        if (var12.field3318 == null) {
                            this.field3318[this.field3286] = var12.field3321;
                        } else {
                            this.field3318[this.field3286] = var12.field3318[var13];
                        }
                    }
                    if (var5 && var12.field3287 != null) {
                        this.field3287[this.field3286] = var12.field3287[var13];
                    }
                    if (var6 && var12.field3312 != null) {
                        this.field3312[this.field3286] = var12.field3312[var13];
                    }
                    if (var7) {
                        if (var12.field3313 == null) {
                            this.field3313[this.field3286] = -1;
                        } else {
                            this.field3313[this.field3286] = var12.field3313[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field3293 == null || var12.field3293[var13] == -1) {
                            this.field3293[this.field3286] = -1;
                        } else {
                            this.field3293[this.field3286] = (byte) (var12.field3293[var13] + this.field3308);
                        }
                    }
                    this.field3298[this.field3286] = var12.field3298[var13];
                    this.field3327[this.field3286] = this.method1464(var12, var12.field3327[var13]);
                    this.field3292[this.field3286] = this.method1464(var12, var12.field3292[var13]);
                    this.field3284[this.field3286] = this.method1464(var12, var12.field3284[var13]);
                    this.field3286++;
                }
                for (int var14 = 0; var14 < var12.field3308; var14++) {
                    byte var15 = this.field3301[this.field3308] = var12.field3301[var14];
                    if (var15 == 0) {
                        this.field3311[this.field3308] = (short) this.method1464(var12, var12.field3311[var14]);
                        this.field3316[this.field3308] = (short) this.method1464(var12, var12.field3316[var14]);
                        this.field3314[this.field3308] = (short) this.method1464(var12, var12.field3314[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field3311[this.field3308] = var12.field3311[var14];
                        this.field3316[this.field3308] = var12.field3316[var14];
                        this.field3314[this.field3308] = var12.field3314[var14];
                        this.field3306[this.field3308] = var12.field3306[var14];
                        this.field3303[this.field3308] = var12.field3303[var14];
                        this.field3305[this.field3308] = var12.field3305[var14];
                        this.field3295[this.field3308] = var12.field3295[var14];
                        this.field3282[this.field3308] = var12.field3282[var14];
                        this.field3280[this.field3308] = var12.field3280[var14];
                    }
                    if (var15 == 2) {
                        this.field3288[this.field3308] = var12.field3288[var14];
                        this.field3299[this.field3308] = var12.field3299[var14];
                    }
                    this.field3308++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lqj;ZZZZ)V", line = 2227)
    public class195(class195 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field3320 = arg0.field3320;
        this.field3286 = arg0.field3286;
        this.field3308 = arg0.field3308;
        if (arg1) {
            this.field3319 = arg0.field3319;
            this.field3309 = arg0.field3309;
            this.field3296 = arg0.field3296;
        } else {
            this.field3319 = new int[this.field3320];
            this.field3309 = new int[this.field3320];
            this.field3296 = new int[this.field3320];
            for (int var6 = 0; var6 < this.field3320; var6++) {
                this.field3319[var6] = arg0.field3319[var6];
                this.field3309[var6] = arg0.field3309[var6];
                this.field3296[var6] = arg0.field3296[var6];
            }
        }
        if (arg2) {
            this.field3298 = arg0.field3298;
        } else {
            this.field3298 = new short[this.field3286];
            for (int var7 = 0; var7 < this.field3286; var7++) {
                this.field3298[var7] = arg0.field3298[var7];
            }
        }
        if (arg3 || arg0.field3313 == null) {
            this.field3313 = arg0.field3313;
        } else {
            this.field3313 = new short[this.field3286];
            for (int var8 = 0; var8 < this.field3286; var8++) {
                this.field3313[var8] = arg0.field3313[var8];
            }
        }
        if (arg4) {
            this.field3287 = arg0.field3287;
        } else {
            this.field3287 = new byte[this.field3286];
            if (arg0.field3287 == null) {
                for (int var9 = 0; var9 < this.field3286; var9++) {
                    this.field3287[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field3286; var10++) {
                    this.field3287[var10] = arg0.field3287[var10];
                }
            }
        }
        this.field3327 = arg0.field3327;
        this.field3292 = arg0.field3292;
        this.field3284 = arg0.field3284;
        this.field3325 = arg0.field3325;
        this.field3318 = arg0.field3318;
        this.field3293 = arg0.field3293;
        this.field3321 = arg0.field3321;
        this.field3301 = arg0.field3301;
        this.field3311 = arg0.field3311;
        this.field3316 = arg0.field3316;
        this.field3314 = arg0.field3314;
        this.field3306 = arg0.field3306;
        this.field3303 = arg0.field3303;
        this.field3305 = arg0.field3305;
        this.field3295 = arg0.field3295;
        this.field3282 = arg0.field3282;
        this.field3280 = arg0.field3280;
        this.field3288 = arg0.field3288;
        this.field3299 = arg0.field3299;
        this.field3279 = arg0.field3279;
        this.field3312 = arg0.field3312;
        this.field3315 = arg0.field3315;
        this.field3307 = arg0.field3307;
        this.field3285 = arg0.field3285;
        this.field3302 = arg0.field3302;
        this.field3326 = arg0.field3326;
        this.field3281 = arg0.field3281;
        this.field3290 = arg0.field3290;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(IIIII)Lhi;", line = 1812)
    public final class176 method1465(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class117.field2159) {
            class100 var6 = new class100(this, arg0, arg1, true);
            var6.method819();
            return var6;
        } else {
            return new class11(this, arg0, arg1, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(SS)V", line = 1839)
    public final void method1466(short arg0, short arg1) {
        if (this.field3313 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field3286; var3++) {
            if (this.field3313[var3] == arg0) {
                this.field3313[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([[III)I", line = 1861)
    private static final int method1467(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "()V", line = 1879)
    public final void method1468() {
        int var10002;
        if (this.field3279 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3320; var3++) {
                int var4 = this.field3279[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field3315 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field3315[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field3320) {
                int var7 = this.field3279[var6];
                this.field3315[var7][var1[var7]++] = var6++;
            }
            this.field3279 = null;
        }
        if (this.field3312 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3286; var10++) {
            int var11 = this.field3312[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field3307 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field3307[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field3286) {
            int var14 = this.field3312[var13];
            this.field3307[var14][var8[var14]++] = var13++;
        }
        this.field3312 = null;
    }
}
