import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class204 {

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public int field3262 = 500;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    private int field3258 = 0;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    private int field3264 = 100;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public int field3272 = 0;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "[I")
    private int[] field3280 = new int[5];

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "[I")
    private int[] field3281 = new int[5];

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "[I")
    private int[] field3263 = new int[5];

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "[I")
    private static int[] field3261 = new int[32768];

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "[I")
    private static int[] field3260;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "[I")
    private static int[] field3269;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "[I")
    private static int[] field3277;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "[I")
    private static int[] field3274;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "[I")
    private static int[] field3276;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "[I")
    private static int[] field3278;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "[I")
    private static int[] field3279;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "Lqd;")
    private class114 field3282;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "Lkc;")
    private class2 field3259;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "Lkc;")
    private class2 field3265;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "Lkc;")
    private class2 field3266;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "Lkc;")
    private class2 field3267;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Lkc;")
    private class2 field3268;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "Lkc;")
    private class2 field3270;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "Lkc;")
    private class2 field3271;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "Lkc;")
    private class2 field3273;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "Lkc;")
    private class2 field3275;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "()V")
    public static void method1422() {
        field3269 = null;
        field3261 = null;
        field3260 = null;
        field3279 = null;
        field3278 = null;
        field3274 = null;
        field3276 = null;
        field3277 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lab;)V")
    public final void method1423(class249 arg0) {
        this.field3273 = new class2();
        this.field3273.method27(arg0);
        this.field3270 = new class2();
        this.field3270.method27(arg0);
        int var2 = arg0.method1802((byte) 123);
        if (var2 != 0) {
            arg0.field4160--;
            this.field3259 = new class2();
            this.field3259.method27(arg0);
            this.field3271 = new class2();
            this.field3271.method27(arg0);
        }
        int var3 = arg0.method1802((byte) -88);
        if (var3 != 0) {
            arg0.field4160--;
            this.field3265 = new class2();
            this.field3265.method27(arg0);
            this.field3266 = new class2();
            this.field3266.method27(arg0);
        }
        int var4 = arg0.method1802((byte) -89);
        if (var4 != 0) {
            arg0.field4160--;
            this.field3268 = new class2();
            this.field3268.method27(arg0);
            this.field3275 = new class2();
            this.field3275.method27(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1819(-1741461848);
            if (var6 == 0) {
                break;
            }
            this.field3281[var5] = var6;
            this.field3280[var5] = arg0.method1761(255);
            this.field3263[var5] = arg0.method1819(-1741461848);
        }
        this.field3258 = arg0.method1819(-1741461848);
        this.field3264 = arg0.method1819(-1741461848);
        this.field3262 = arg0.method1821((byte) 51);
        this.field3272 = arg0.method1821((byte) 51);
        this.field3282 = new class114();
        this.field3267 = new class2();
        this.field3282.method876(arg0, this.field3267);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)[I")
    public final int[] method1424(int arg0, int arg1) {
        class75.method533(field3269, 0, arg0);
        if (arg1 < 10) {
            return field3269;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3273.method26();
        this.field3270.method26();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3259 != null) {
            this.field3259.method26();
            this.field3271.method26();
            var5 = (int) ((double) (this.field3259.field93 - this.field3259.field91) * 32.768D / var3);
            var6 = (int) ((double) this.field3259.field91 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3265 != null) {
            this.field3265.method26();
            this.field3266.method26();
            var8 = (int) ((double) (this.field3265.field93 - this.field3265.field91) * 32.768D / var3);
            var9 = (int) ((double) this.field3265.field91 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3281[var11] != 0) {
                field3279[var11] = 0;
                field3278[var11] = (int) ((double) this.field3263[var11] * var3);
                field3274[var11] = (this.field3281[var11] << 14) / 100;
                field3276[var11] = (int) ((double) (this.field3273.field93 - this.field3273.field91) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3280[var11]) / var3);
                field3277[var11] = (int) ((double) this.field3273.field91 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3273.method24(arg0);
            int var40 = this.field3270.method24(arg0);
            if (this.field3259 != null) {
                int var41 = this.field3259.method24(arg0);
                int var42 = this.field3271.method24(arg0);
                var39 += this.method1425(var7, var42, this.field3259.field95) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3265 != null) {
                int var43 = this.field3265.method24(arg0);
                int var44 = this.field3266.method24(arg0);
                var40 = var40 * ((this.method1425(var10, var44, this.field3265.field95) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3281[var45] != 0) {
                    int var46 = field3278[var45] + var12;
                    if (var46 < arg0) {
                        field3269[var46] += this.method1425(field3279[var45], field3274[var45] * var40 >> 15, this.field3273.field95);
                        field3279[var45] += (field3276[var45] * var39 >> 16) + field3277[var45];
                    }
                }
            }
        }
        if (this.field3268 != null) {
            this.field3268.method26();
            this.field3275.method26();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3268.method24(arg0);
                int var18 = this.field3275.method24(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3268.field93 - this.field3268.field91) * var17 >> 8) + this.field3268.field91;
                } else {
                    var19 = ((this.field3268.field93 - this.field3268.field91) * var18 >> 8) + this.field3268.field91;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3269[var16] = 0;
                }
            }
        }
        if (this.field3258 > 0 && this.field3264 > 0) {
            int var20 = (int) ((double) this.field3258 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3269[var21] += field3269[var21 - var20] * this.field3264 / 100;
            }
        }
        if (this.field3282.field1939[0] > 0 || this.field3282.field1939[1] > 0) {
            this.field3267.method26();
            int var22 = this.field3267.method24(arg0 + 1);
            int var23 = this.field3282.method875(0, (float) var22 / 65536.0F);
            int var24 = this.field3282.method875(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3269[var23 + var25] * (long) class114.field1942 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3269[var23 + var25 - var36 - 1] * (long) class114.field1940[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3269[var25 - var37 - 1] * (long) class114.field1940[1][var37] >> 16);
                    }
                    field3269[var25] = var35;
                    var22 = this.field3267.method24(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3269[var23 + var25] * (long) class114.field1942 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3269[var23 + var25 - var33 - 1] * (long) class114.field1940[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3269[var25 - var34 - 1] * (long) class114.field1940[1][var34] >> 16);
                        }
                        field3269[var25] = var32;
                        var22 = this.field3267.method24(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3269[var23 + var25 - var29 - 1] * (long) class114.field1940[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3269[var25 - var30 - 1] * (long) class114.field1940[1][var30] >> 16);
                            }
                            field3269[var25] = var28;
                            this.field3267.method24(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3282.method875(0, (float) var22 / 65536.0F);
                    var24 = this.field3282.method875(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3269[var38] < -32768) {
                field3269[var38] = -32768;
            }
            if (field3269[var38] > 32767) {
                field3269[var38] = 32767;
            }
        }
        return field3269;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)I")
    private final int method1425(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3260[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3261[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3261[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3260 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3260[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3269 = new int[220500];
        field3277 = new int[5];
        field3274 = new int[5];
        field3276 = new int[5];
        field3278 = new int[5];
        field3279 = new int[5];
    }
}
