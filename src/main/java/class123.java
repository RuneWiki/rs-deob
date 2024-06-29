import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class123 {

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "[I")
    private int[] field2236 = new int[5];

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    private int field2241 = 100;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public int field2238 = 0;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    private int field2240 = 0;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public int field2243 = 500;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "[I")
    private int[] field2247 = new int[5];

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "[I")
    private int[] field2248 = new int[5];

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "[I")
    private static int[] field2235 = new int[32768];

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "[I")
    private static int[] field2244;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "[I")
    private static int[] field2237;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "[I")
    private static int[] field2250;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "[I")
    private static int[] field2252;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "[I")
    private static int[] field2253;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "[I")
    private static int[] field2254;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "[I")
    private static int[] field2256;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Lr;")
    private class185 field2242;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Lvf;")
    private class235 field2234;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Lvf;")
    private class235 field2239;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Lvf;")
    private class235 field2245;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Lvf;")
    private class235 field2246;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Lvf;")
    private class235 field2249;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "Lvf;")
    private class235 field2251;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "Lvf;")
    private class235 field2255;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "Lvf;")
    private class235 field2257;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "Lvf;")
    private class235 field2258;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)I")
    private final int method833(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2244[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2235[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "()V")
    public static void method834() {
        field2237 = null;
        field2235 = null;
        field2244 = null;
        field2252 = null;
        field2256 = null;
        field2254 = null;
        field2250 = null;
        field2253 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[I")
    public final int[] method835(int arg0, int arg1) {
        class124.method837(field2237, 0, arg0);
        if (arg1 < 10) {
            return field2237;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2234.method1563();
        this.field2255.method1563();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2246 != null) {
            this.field2246.method1563();
            this.field2239.method1563();
            var5 = (int) ((double) (this.field2246.field4388 - this.field2246.field4389) * 32.768D / var3);
            var6 = (int) ((double) this.field2246.field4389 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2258 != null) {
            this.field2258.method1563();
            this.field2251.method1563();
            var8 = (int) ((double) (this.field2258.field4388 - this.field2258.field4389) * 32.768D / var3);
            var9 = (int) ((double) this.field2258.field4389 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2248[var11] != 0) {
                field2252[var11] = 0;
                field2256[var11] = (int) ((double) this.field2247[var11] * var3);
                field2254[var11] = (this.field2248[var11] << 14) / 100;
                field2250[var11] = (int) ((double) (this.field2234.field4388 - this.field2234.field4389) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2236[var11]) / var3);
                field2253[var11] = (int) ((double) this.field2234.field4389 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2234.method1562(arg0);
            int var40 = this.field2255.method1562(arg0);
            if (this.field2246 != null) {
                int var41 = this.field2246.method1562(arg0);
                int var42 = this.field2239.method1562(arg0);
                var39 += this.method833(var7, var42, this.field2246.field4390) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2258 != null) {
                int var43 = this.field2258.method1562(arg0);
                int var44 = this.field2251.method1562(arg0);
                var40 = var40 * ((this.method833(var10, var44, this.field2258.field4390) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2248[var45] != 0) {
                    int var46 = field2256[var45] + var12;
                    if (var46 < arg0) {
                        field2237[var46] += this.method833(field2252[var45], field2254[var45] * var40 >> 15, this.field2234.field4390);
                        field2252[var45] += (field2250[var45] * var39 >> 16) + field2253[var45];
                    }
                }
            }
        }
        if (this.field2249 != null) {
            this.field2249.method1563();
            this.field2257.method1563();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2249.method1562(arg0);
                int var18 = this.field2257.method1562(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2249.field4388 - this.field2249.field4389) * var17 >> 8) + this.field2249.field4389;
                } else {
                    var19 = ((this.field2249.field4388 - this.field2249.field4389) * var18 >> 8) + this.field2249.field4389;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2237[var16] = 0;
                }
            }
        }
        if (this.field2240 > 0 && this.field2241 > 0) {
            int var20 = (int) ((double) this.field2240 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2237[var21] += field2237[var21 - var20] * this.field2241 / 100;
            }
        }
        if (this.field2242.field3622[0] > 0 || this.field2242.field3622[1] > 0) {
            this.field2245.method1563();
            int var22 = this.field2245.method1562(arg0 + 1);
            int var23 = this.field2242.method1305(0, (float) var22 / 65536.0F);
            int var24 = this.field2242.method1305(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2237[var23 + var25] * (long) class185.field3617 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2237[var23 + var25 - var36 - 1] * (long) class185.field3621[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2237[var25 - var37 - 1] * (long) class185.field3621[1][var37] >> 16);
                    }
                    field2237[var25] = var35;
                    var22 = this.field2245.method1562(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2237[var23 + var25] * (long) class185.field3617 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2237[var23 + var25 - var33 - 1] * (long) class185.field3621[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2237[var25 - var34 - 1] * (long) class185.field3621[1][var34] >> 16);
                        }
                        field2237[var25] = var32;
                        var22 = this.field2245.method1562(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2237[var23 + var25 - var29 - 1] * (long) class185.field3621[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2237[var25 - var30 - 1] * (long) class185.field3621[1][var30] >> 16);
                            }
                            field2237[var25] = var28;
                            this.field2245.method1562(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2242.method1305(0, (float) var22 / 65536.0F);
                    var24 = this.field2242.method1305(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2237[var38] < -32768) {
                field2237[var38] = -32768;
            }
            if (field2237[var38] > 32767) {
                field2237[var38] = 32767;
            }
        }
        return field2237;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lea;)V")
    public final void method836(class46 arg0) {
        this.field2234 = new class235();
        this.field2234.method1565(arg0);
        this.field2255 = new class235();
        this.field2255.method1565(arg0);
        int var2 = arg0.method347(26119);
        if (var2 != 0) {
            arg0.field831--;
            this.field2246 = new class235();
            this.field2246.method1565(arg0);
            this.field2239 = new class235();
            this.field2239.method1565(arg0);
        }
        int var3 = arg0.method347(26119);
        if (var3 != 0) {
            arg0.field831--;
            this.field2258 = new class235();
            this.field2258.method1565(arg0);
            this.field2251 = new class235();
            this.field2251.method1565(arg0);
        }
        int var4 = arg0.method347(26119);
        if (var4 != 0) {
            arg0.field831--;
            this.field2249 = new class235();
            this.field2249.method1565(arg0);
            this.field2257 = new class235();
            this.field2257.method1565(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method350(118);
            if (var6 == 0) {
                break;
            }
            this.field2248[var5] = var6;
            this.field2236[var5] = arg0.method342(true);
            this.field2247[var5] = arg0.method350(112);
        }
        this.field2240 = arg0.method350(123);
        this.field2241 = arg0.method350(118);
        this.field2243 = arg0.method301(73);
        this.field2238 = arg0.method301(126);
        this.field2242 = new class185();
        this.field2245 = new class235();
        this.field2242.method1307(arg0, this.field2245);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2235[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2244 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2244[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2237 = new int[220500];
        field2250 = new int[5];
        field2252 = new int[5];
        field2253 = new int[5];
        field2254 = new int[5];
        field2256 = new int[5];
    }
}
