import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class129 {

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public int field2284 = 0;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    private int field2291 = 100;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "[I")
    private int[] field2293 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "[I")
    private int[] field2296 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "[I")
    private int[] field2286 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    public int field2300 = 500;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    private int field2301 = 0;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "[I")
    private static int[] field2292 = new int[32768];

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "[I")
    private static int[] field2297;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "[I")
    private static int[] field2302;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "[I")
    private static int[] field2303;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "[I")
    private static int[] field2304;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "[I")
    private static int[] field2306;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "[I")
    private static int[] field2305;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "[I")
    private static int[] field2307;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "Lhf;")
    private class191 field2287;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "Lob;")
    private class279 field2283;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Lob;")
    private class279 field2285;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "Lob;")
    private class279 field2288;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "Lob;")
    private class279 field2289;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Lob;")
    private class279 field2290;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "Lob;")
    private class279 field2294;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "Lob;")
    private class279 field2295;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "Lob;")
    private class279 field2298;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "Lob;")
    private class279 field2299;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()V", line = 5)
    public static void method933() {
        field2302 = null;
        field2292 = null;
        field2297 = null;
        field2305 = null;
        field2303 = null;
        field2306 = null;
        field2304 = null;
        field2307 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lkh;)V", line = 16)
    public final void method934(class13 arg0) {
        this.field2285 = new class279();
        this.field2285.method1937(arg0);
        this.field2289 = new class279();
        this.field2289.method1937(arg0);
        int var2 = arg0.method152((byte) -100);
        if (var2 != 0) {
            arg0.field281--;
            this.field2295 = new class279();
            this.field2295.method1937(arg0);
            this.field2288 = new class279();
            this.field2288.method1937(arg0);
        }
        int var3 = arg0.method152((byte) -110);
        if (var3 != 0) {
            arg0.field281--;
            this.field2298 = new class279();
            this.field2298.method1937(arg0);
            this.field2283 = new class279();
            this.field2283.method1937(arg0);
        }
        int var4 = arg0.method152((byte) -100);
        if (var4 != 0) {
            arg0.field281--;
            this.field2294 = new class279();
            this.field2294.method1937(arg0);
            this.field2290 = new class279();
            this.field2290.method1937(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method163(255);
            if (var6 == 0) {
                break;
            }
            this.field2296[var5] = var6;
            this.field2286[var5] = arg0.method134(5525);
            this.field2293[var5] = arg0.method163(255);
        }
        this.field2301 = arg0.method163(255);
        this.field2291 = arg0.method163(255);
        this.field2300 = arg0.method112((byte) 92);
        this.field2284 = arg0.method112((byte) 92);
        this.field2287 = new class191();
        this.field2299 = new class279();
        this.field2287.method1352(arg0, this.field2299);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)[I", line = 77)
    public final int[] method935(int arg0, int arg1) {
        class95.method716(field2302, 0, arg0);
        if (arg1 < 10) {
            return field2302;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2285.method1935();
        this.field2289.method1935();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2295 != null) {
            this.field2295.method1935();
            this.field2288.method1935();
            var5 = (int) ((double) (this.field2295.field4814 - this.field2295.field4811) * 32.768D / var3);
            var6 = (int) ((double) this.field2295.field4811 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2298 != null) {
            this.field2298.method1935();
            this.field2283.method1935();
            var8 = (int) ((double) (this.field2298.field4814 - this.field2298.field4811) * 32.768D / var3);
            var9 = (int) ((double) this.field2298.field4811 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2296[var11] != 0) {
                field2305[var11] = 0;
                field2303[var11] = (int) ((double) this.field2293[var11] * var3);
                field2306[var11] = (this.field2296[var11] << 14) / 100;
                field2304[var11] = (int) ((double) (this.field2285.field4814 - this.field2285.field4811) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2286[var11]) / var3);
                field2307[var11] = (int) ((double) this.field2285.field4811 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field2285.method1938(arg0);
            int var14 = this.field2289.method1938(arg0);
            if (this.field2295 != null) {
                int var15 = this.field2295.method1938(arg0);
                int var16 = this.field2288.method1938(arg0);
                var13 += this.method936(var7, var16, this.field2295.field4816) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field2298 != null) {
                int var17 = this.field2298.method1938(arg0);
                int var18 = this.field2283.method1938(arg0);
                var14 = var14 * ((this.method936(var10, var18, this.field2298.field4816) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field2296[var19] != 0) {
                    int var20 = field2303[var19] + var12;
                    if (var20 < arg0) {
                        field2302[var20] += this.method936(field2305[var19], field2306[var19] * var14 >> 15, this.field2285.field4816);
                        field2305[var19] += (field2304[var19] * var13 >> 16) + field2307[var19];
                    }
                }
            }
        }
        if (this.field2294 != null) {
            this.field2294.method1935();
            this.field2290.method1935();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field2294.method1938(arg0);
                int var26 = this.field2290.method1938(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field2294.field4814 - this.field2294.field4811) * var25 >> 8) + this.field2294.field4811;
                } else {
                    var27 = ((this.field2294.field4814 - this.field2294.field4811) * var26 >> 8) + this.field2294.field4811;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field2302[var24] = 0;
                }
            }
        }
        if (this.field2301 > 0 && this.field2291 > 0) {
            int var28 = (int) ((double) this.field2301 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field2302[var29] += field2302[var29 - var28] * this.field2291 / 100;
            }
        }
        if (this.field2287.field3272[0] > 0 || this.field2287.field3272[1] > 0) {
            this.field2299.method1935();
            int var30 = this.field2299.method1938(arg0 + 1);
            int var31 = this.field2287.method1351(0, (float) var30 / 65536.0F);
            int var32 = this.field2287.method1351(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field2302[var31 + var33] * (long) class191.field3277 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field2302[var31 + var33 - var36 - 1] * (long) class191.field3276[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field2302[var33 - var37 - 1] * (long) class191.field3276[1][var37] >> 16);
                    }
                    field2302[var33] = var35;
                    var30 = this.field2299.method1938(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field2302[var31 + var33] * (long) class191.field3277 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field2302[var31 + var33 - var40 - 1] * (long) class191.field3276[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field2302[var33 - var41 - 1] * (long) class191.field3276[1][var41] >> 16);
                        }
                        field2302[var33] = var39;
                        var30 = this.field2299.method1938(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field2302[var31 + var33 - var43 - 1] * (long) class191.field3276[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field2302[var33 - var44 - 1] * (long) class191.field3276[1][var44] >> 16);
                            }
                            field2302[var33] = var42;
                            this.field2299.method1938(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field2287.method1351(0, (float) var30 / 65536.0F);
                    var32 = this.field2287.method1351(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field2302[var46] < -32768) {
                field2302[var46] = -32768;
            }
            if (field2302[var46] > 32767) {
                field2302[var46] = 32767;
            }
        }
        return field2302;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)I", line = 387)
    private final int method936(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2297[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2292[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2292[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2297 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2297[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2302 = new int[220500];
        field2303 = new int[5];
        field2304 = new int[5];
        field2306 = new int[5];
        field2305 = new int[5];
        field2307 = new int[5];
    }
}
