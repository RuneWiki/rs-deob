import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class91 {

    @OriginalMember(owner = "client!na", name = "h", descriptor = "[I")
    private int[] field2271 = new int[5];

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    private int field2265 = 100;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public int field2276 = 0;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public int field2266 = 500;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    private int field2278 = 0;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "[I")
    private int[] field2281 = new int[5];

    @OriginalMember(owner = "client!na", name = "v", descriptor = "[I")
    private int[] field2285 = new int[5];

    @OriginalMember(owner = "client!na", name = "l", descriptor = "[I")
    private static int[] field2275 = new int[32768];

    @OriginalMember(owner = "client!na", name = "a", descriptor = "[I")
    private static int[] field2264;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "[I")
    private static int[] field2282;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "[I")
    private static int[] field2286;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "[I")
    private static int[] field2284;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "[I")
    private static int[] field2283;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "[I")
    private static int[] field2287;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "[I")
    private static int[] field2288;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Lre;")
    private class123 field2273;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Lde;")
    private class27 field2267;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Lde;")
    private class27 field2268;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Lde;")
    private class27 field2269;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "Lde;")
    private class27 field2270;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Lde;")
    private class27 field2272;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Lde;")
    private class27 field2274;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Lde;")
    private class27 field2277;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Lde;")
    private class27 field2279;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "Lde;")
    private class27 field2280;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III)I")
    private final int method740(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2264[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2275[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)[I")
    public final int[] method741(int arg0, int arg1) {
        class149.method1135(field2282, 0, arg0);
        if (arg1 < 10) {
            return field2282;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2272.method208();
        this.field2270.method208();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2279 != null) {
            this.field2279.method208();
            this.field2267.method208();
            var5 = (int) ((double) (this.field2279.field643 - this.field2279.field644) * 32.768D / var3);
            var6 = (int) ((double) this.field2279.field644 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2277 != null) {
            this.field2277.method208();
            this.field2274.method208();
            var8 = (int) ((double) (this.field2277.field643 - this.field2277.field644) * 32.768D / var3);
            var9 = (int) ((double) this.field2277.field644 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2281[var11] != 0) {
                field2286[var11] = 0;
                field2288[var11] = (int) ((double) this.field2271[var11] * var3);
                field2283[var11] = (this.field2281[var11] << 14) / 100;
                field2284[var11] = (int) ((double) (this.field2272.field643 - this.field2272.field644) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2285[var11]) / var3);
                field2287[var11] = (int) ((double) this.field2272.field644 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2272.method205(arg0);
            int var40 = this.field2270.method205(arg0);
            if (this.field2279 != null) {
                int var41 = this.field2279.method205(arg0);
                int var42 = this.field2267.method205(arg0);
                var39 += this.method740(var7, var42, this.field2279.field645) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2277 != null) {
                int var43 = this.field2277.method205(arg0);
                int var44 = this.field2274.method205(arg0);
                var40 = var40 * ((this.method740(var10, var44, this.field2277.field645) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2281[var45] != 0) {
                    int var46 = field2288[var45] + var12;
                    if (var46 < arg0) {
                        field2282[var46] += this.method740(field2286[var45], field2283[var45] * var40 >> 15, this.field2272.field645);
                        field2286[var45] += (field2284[var45] * var39 >> 16) + field2287[var45];
                    }
                }
            }
        }
        if (this.field2269 != null) {
            this.field2269.method208();
            this.field2268.method208();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2269.method205(arg0);
                int var18 = this.field2268.method205(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2269.field643 - this.field2269.field644) * var17 >> 8) + this.field2269.field644;
                } else {
                    var19 = ((this.field2269.field643 - this.field2269.field644) * var18 >> 8) + this.field2269.field644;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2282[var16] = 0;
                }
            }
        }
        if (this.field2278 > 0 && this.field2265 > 0) {
            int var20 = (int) ((double) this.field2278 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2282[var21] += field2282[var21 - var20] * this.field2265 / 100;
            }
        }
        if (this.field2273.field2838[0] > 0 || this.field2273.field2838[1] > 0) {
            this.field2280.method208();
            int var22 = this.field2280.method205(arg0 + 1);
            int var23 = this.field2273.method974(0, (float) var22 / 65536.0F);
            int var24 = this.field2273.method974(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2282[var23 + var25] * (long) class123.field2831 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2282[var23 + var25 - var36 - 1] * (long) class123.field2833[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2282[var25 - var37 - 1] * (long) class123.field2833[1][var37] >> 16);
                    }
                    field2282[var25] = var35;
                    var22 = this.field2280.method205(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2282[var23 + var25] * (long) class123.field2831 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2282[var23 + var25 - var33 - 1] * (long) class123.field2833[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2282[var25 - var34 - 1] * (long) class123.field2833[1][var34] >> 16);
                        }
                        field2282[var25] = var32;
                        var22 = this.field2280.method205(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2282[var23 + var25 - var29 - 1] * (long) class123.field2833[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2282[var25 - var30 - 1] * (long) class123.field2833[1][var30] >> 16);
                            }
                            field2282[var25] = var28;
                            this.field2280.method205(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2273.method974(0, (float) var22 / 65536.0F);
                    var24 = this.field2273.method974(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2282[var38] < -32768) {
                field2282[var38] = -32768;
            }
            if (field2282[var38] > 32767) {
                field2282[var38] = 32767;
            }
        }
        return field2282;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()V")
    public static void method742() {
        field2282 = null;
        field2275 = null;
        field2264 = null;
        field2286 = null;
        field2288 = null;
        field2283 = null;
        field2284 = null;
        field2287 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lof;)V")
    public final void method743(class103 arg0) {
        this.field2272 = new class27();
        this.field2272.method206(arg0);
        this.field2270 = new class27();
        this.field2270.method206(arg0);
        int var2 = arg0.method829((byte) 21);
        if (var2 != 0) {
            arg0.field2501--;
            this.field2279 = new class27();
            this.field2279.method206(arg0);
            this.field2267 = new class27();
            this.field2267.method206(arg0);
        }
        int var3 = arg0.method829((byte) -95);
        if (var3 != 0) {
            arg0.field2501--;
            this.field2277 = new class27();
            this.field2277.method206(arg0);
            this.field2274 = new class27();
            this.field2274.method206(arg0);
        }
        int var4 = arg0.method829((byte) 45);
        if (var4 != 0) {
            arg0.field2501--;
            this.field2269 = new class27();
            this.field2269.method206(arg0);
            this.field2268 = new class27();
            this.field2268.method206(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method835(-24298);
            if (var6 == 0) {
                break;
            }
            this.field2281[var5] = var6;
            this.field2285[var5] = arg0.method817(false);
            this.field2271[var5] = arg0.method835(-24298);
        }
        this.field2278 = arg0.method835(-24298);
        this.field2265 = arg0.method835(-24298);
        this.field2266 = arg0.method808(-20054);
        this.field2276 = arg0.method808(-20054);
        this.field2273 = new class123();
        this.field2280 = new class27();
        this.field2273.method972(arg0, this.field2280);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2275[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2264 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2264[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2282 = new int[220500];
        field2286 = new int[5];
        field2284 = new int[5];
        field2283 = new int[5];
        field2287 = new int[5];
        field2288 = new int[5];
    }
}
