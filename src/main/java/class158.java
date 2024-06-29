import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class158 {

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "[I")
    private int[] field2261 = new int[5];

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    private int field2266 = 0;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    private int field2271 = 100;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public int field2274 = 500;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
    private int[] field2267 = new int[5];

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public int field2280 = 0;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "[I")
    private int[] field2281 = new int[5];

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "[I")
    private static int[] field2264 = new int[32768];

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[I")
    private static int[] field2263;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "[I")
    private static int[] field2269;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "[I")
    private static int[] field2277;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "[I")
    private static int[] field2278;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "[I")
    private static int[] field2282;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "[I")
    private static int[] field2273;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "[I")
    private static int[] field2284;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Le;")
    private class253 field2260;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Le;")
    private class253 field2262;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Le;")
    private class253 field2268;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Le;")
    private class253 field2270;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "Le;")
    private class253 field2272;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Le;")
    private class253 field2275;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "Le;")
    private class253 field2276;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "Le;")
    private class253 field2279;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "Le;")
    private class253 field2283;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "Lrk;")
    private class279 field2265;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2264[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2263 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2263[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2269 = new int[220500];
        field2277 = new int[5];
        field2278 = new int[5];
        field2282 = new int[5];
        field2273 = new int[5];
        field2284 = new int[5];
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Llk;)V", line = 7)
    public final void method956(class425 arg0) {
        this.field2275 = new class253();
        this.field2275.method1572(arg0);
        this.field2272 = new class253();
        this.field2272.method1572(arg0);
        int var2 = arg0.method2503(true);
        if (var2 != 0) {
            arg0.field5830--;
            this.field2276 = new class253();
            this.field2276.method1572(arg0);
            this.field2260 = new class253();
            this.field2260.method1572(arg0);
        }
        int var3 = arg0.method2503(true);
        if (var3 != 0) {
            arg0.field5830--;
            this.field2283 = new class253();
            this.field2283.method1572(arg0);
            this.field2270 = new class253();
            this.field2270.method1572(arg0);
        }
        int var4 = arg0.method2503(true);
        if (var4 != 0) {
            arg0.field5830--;
            this.field2268 = new class253();
            this.field2268.method1572(arg0);
            this.field2279 = new class253();
            this.field2279.method1572(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2474((byte) 113);
            if (var6 == 0) {
                break;
            }
            this.field2261[var5] = var6;
            this.field2267[var5] = arg0.method2455(255);
            this.field2281[var5] = arg0.method2474((byte) 113);
        }
        this.field2266 = arg0.method2474((byte) -55);
        this.field2271 = arg0.method2474((byte) 71);
        this.field2274 = arg0.method2508(true);
        this.field2280 = arg0.method2508(true);
        this.field2265 = new class279();
        this.field2262 = new class253();
        this.field2265.method1745(arg0, this.field2262);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[I", line = 69)
    public final int[] method957(int arg0, int arg1) {
        class415.method2420(field2269, 0, arg0);
        if (arg1 < 10) {
            return field2269;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2275.method1571();
        this.field2272.method1571();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2276 != null) {
            this.field2276.method1571();
            this.field2260.method1571();
            var5 = (int) ((double) (this.field2276.field3541 - this.field2276.field3540) * 32.768D / var3);
            var6 = (int) ((double) this.field2276.field3540 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2283 != null) {
            this.field2283.method1571();
            this.field2270.method1571();
            var8 = (int) ((double) (this.field2283.field3541 - this.field2283.field3540) * 32.768D / var3);
            var9 = (int) ((double) this.field2283.field3540 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2261[var11] != 0) {
                field2273[var11] = 0;
                field2284[var11] = (int) ((double) this.field2281[var11] * var3);
                field2277[var11] = (this.field2261[var11] << 14) / 100;
                field2278[var11] = (int) ((double) (this.field2275.field3541 - this.field2275.field3540) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2267[var11]) / var3);
                field2282[var11] = (int) ((double) this.field2275.field3540 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2275.method1573(arg0);
            int var40 = this.field2272.method1573(arg0);
            if (this.field2276 != null) {
                int var41 = this.field2276.method1573(arg0);
                int var42 = this.field2260.method1573(arg0);
                var39 += this.method959(var7, var42, this.field2276.field3543) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2283 != null) {
                int var43 = this.field2283.method1573(arg0);
                int var44 = this.field2270.method1573(arg0);
                var40 = var40 * ((this.method959(var10, var44, this.field2283.field3543) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2261[var45] != 0) {
                    int var46 = field2284[var45] + var12;
                    if (var46 < arg0) {
                        field2269[var46] += this.method959(field2273[var45], field2277[var45] * var40 >> 15, this.field2275.field3543);
                        field2273[var45] += (field2278[var45] * var39 >> 16) + field2282[var45];
                    }
                }
            }
        }
        if (this.field2268 != null) {
            this.field2268.method1571();
            this.field2279.method1571();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2268.method1573(arg0);
                int var18 = this.field2279.method1573(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2268.field3541 - this.field2268.field3540) * var17 >> 8) + this.field2268.field3540;
                } else {
                    var19 = ((this.field2268.field3541 - this.field2268.field3540) * var18 >> 8) + this.field2268.field3540;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2269[var16] = 0;
                }
            }
        }
        if (this.field2266 > 0 && this.field2271 > 0) {
            int var20 = (int) ((double) this.field2266 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2269[var21] += field2269[var21 - var20] * this.field2271 / 100;
            }
        }
        if (this.field2265.field3846[0] > 0 || this.field2265.field3846[1] > 0) {
            this.field2262.method1571();
            int var22 = this.field2262.method1573(arg0 + 1);
            int var23 = this.field2265.method1746(0, (float) var22 / 65536.0F);
            int var24 = this.field2265.method1746(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2269[var23 + var25] * (long) class279.field3850 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2269[var23 + var25 - var36 - 1] * (long) class279.field3851[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2269[var25 - var37 - 1] * (long) class279.field3851[1][var37] >> 16);
                    }
                    field2269[var25] = var35;
                    var22 = this.field2262.method1573(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2269[var23 + var25] * (long) class279.field3850 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2269[var23 + var25 - var33 - 1] * (long) class279.field3851[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2269[var25 - var34 - 1] * (long) class279.field3851[1][var34] >> 16);
                        }
                        field2269[var25] = var32;
                        var22 = this.field2262.method1573(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2269[var23 + var25 - var29 - 1] * (long) class279.field3851[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2269[var25 - var30 - 1] * (long) class279.field3851[1][var30] >> 16);
                            }
                            field2269[var25] = var28;
                            this.field2262.method1573(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2265.method1746(0, (float) var22 / 65536.0F);
                    var24 = this.field2265.method1746(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2269[var38] < -32768) {
                field2269[var38] = -32768;
            }
            if (field2269[var38] > 32767) {
                field2269[var38] = 32767;
            }
        }
        return field2269;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "()V", line = 350)
    public static void method958() {
        field2269 = null;
        field2264 = null;
        field2263 = null;
        field2273 = null;
        field2284 = null;
        field2277 = null;
        field2278 = null;
        field2282 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)I", line = 433)
    private final int method959(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2263[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2264[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }
}
