import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class159 {

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public int field2286 = 0;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "[I")
    private int[] field2288 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    private int field2287 = 100;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "[I")
    private int[] field2295 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "[I")
    private int[] field2301 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public int field2300 = 500;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    private int field2309 = 0;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "[I")
    private static int[] field2292 = new int[32768];

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "[I")
    private static int[] field2299;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "[I")
    private static int[] field2294;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "[I")
    private static int[] field2304;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "[I")
    private static int[] field2306;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "[I")
    private static int[] field2307;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "[I")
    private static int[] field2305;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "[I")
    private static int[] field2308;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Luf;")
    private class242 field2291;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Lgn;")
    private class271 field2285;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Lgn;")
    private class271 field2289;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "Lgn;")
    private class271 field2290;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "Lgn;")
    private class271 field2293;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Lgn;")
    private class271 field2296;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Lgn;")
    private class271 field2297;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "Lgn;")
    private class271 field2298;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "Lgn;")
    private class271 field2302;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "Lgn;")
    private class271 field2303;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lsb;)V", line = 6)
    public final void method1143(class190 arg0) {
        this.field2303 = new class271();
        this.field2303.method1995(arg0);
        this.field2296 = new class271();
        this.field2296.method1995(arg0);
        int var2 = arg0.method1319(255);
        if (var2 != 0) {
            arg0.field2776--;
            this.field2290 = new class271();
            this.field2290.method1995(arg0);
            this.field2297 = new class271();
            this.field2297.method1995(arg0);
        }
        int var3 = arg0.method1319(255);
        if (var3 != 0) {
            arg0.field2776--;
            this.field2289 = new class271();
            this.field2289.method1995(arg0);
            this.field2302 = new class271();
            this.field2302.method1995(arg0);
        }
        int var4 = arg0.method1319(255);
        if (var4 != 0) {
            arg0.field2776--;
            this.field2298 = new class271();
            this.field2298.method1995(arg0);
            this.field2285 = new class271();
            this.field2285.method1995(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1372(-101);
            if (var6 == 0) {
                break;
            }
            this.field2301[var5] = var6;
            this.field2288[var5] = arg0.method1314(-97);
            this.field2295[var5] = arg0.method1372(-62);
        }
        this.field2309 = arg0.method1372(-70);
        this.field2287 = arg0.method1372(-115);
        this.field2300 = arg0.method1317((byte) 122);
        this.field2286 = arg0.method1317((byte) 35);
        this.field2291 = new class242();
        this.field2293 = new class271();
        this.field2291.method1779(arg0, this.field2293);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[I", line = 70)
    public final int[] method1144(int arg0, int arg1) {
        class84.method685(field2294, 0, arg0);
        if (arg1 < 10) {
            return field2294;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2303.method1996();
        this.field2296.method1996();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2290 != null) {
            this.field2290.method1996();
            this.field2297.method1996();
            var5 = (int) ((double) (this.field2290.field4112 - this.field2290.field4111) * 32.768D / var3);
            var6 = (int) ((double) this.field2290.field4111 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2289 != null) {
            this.field2289.method1996();
            this.field2302.method1996();
            var8 = (int) ((double) (this.field2289.field4112 - this.field2289.field4111) * 32.768D / var3);
            var9 = (int) ((double) this.field2289.field4111 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2301[var11] != 0) {
                field2306[var11] = 0;
                field2304[var11] = (int) ((double) this.field2295[var11] * var3);
                field2307[var11] = (this.field2301[var11] << 14) / 100;
                field2308[var11] = (int) ((double) (this.field2303.field4112 - this.field2303.field4111) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2288[var11]) / var3);
                field2305[var11] = (int) ((double) this.field2303.field4111 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field2303.method1997(arg0);
            int var14 = this.field2296.method1997(arg0);
            if (this.field2290 != null) {
                int var15 = this.field2290.method1997(arg0);
                int var16 = this.field2297.method1997(arg0);
                var13 += this.method1145(var7, var16, this.field2290.field4114) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field2289 != null) {
                int var17 = this.field2289.method1997(arg0);
                int var18 = this.field2302.method1997(arg0);
                var14 = var14 * ((this.method1145(var10, var18, this.field2289.field4114) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field2301[var19] != 0) {
                    int var20 = field2304[var19] + var12;
                    if (var20 < arg0) {
                        field2294[var20] += this.method1145(field2306[var19], field2307[var19] * var14 >> 15, this.field2303.field4114);
                        field2306[var19] += (field2308[var19] * var13 >> 16) + field2305[var19];
                    }
                }
            }
        }
        if (this.field2298 != null) {
            this.field2298.method1996();
            this.field2285.method1996();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field2298.method1997(arg0);
                int var26 = this.field2285.method1997(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field2298.field4112 - this.field2298.field4111) * var25 >> 8) + this.field2298.field4111;
                } else {
                    var27 = ((this.field2298.field4112 - this.field2298.field4111) * var26 >> 8) + this.field2298.field4111;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field2294[var24] = 0;
                }
            }
        }
        if (this.field2309 > 0 && this.field2287 > 0) {
            int var28 = (int) ((double) this.field2309 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field2294[var29] += field2294[var29 - var28] * this.field2287 / 100;
            }
        }
        if (this.field2291.field3607[0] > 0 || this.field2291.field3607[1] > 0) {
            this.field2293.method1996();
            int var30 = this.field2293.method1997(arg0 + 1);
            int var31 = this.field2291.method1780(0, (float) var30 / 65536.0F);
            int var32 = this.field2291.method1780(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field2294[var31 + var33] * (long) class242.field3602 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field2294[var31 + var33 - var36 - 1] * (long) class242.field3603[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field2294[var33 - var37 - 1] * (long) class242.field3603[1][var37] >> 16);
                    }
                    field2294[var33] = var35;
                    var30 = this.field2293.method1997(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field2294[var31 + var33] * (long) class242.field3602 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field2294[var31 + var33 - var40 - 1] * (long) class242.field3603[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field2294[var33 - var41 - 1] * (long) class242.field3603[1][var41] >> 16);
                        }
                        field2294[var33] = var39;
                        var30 = this.field2293.method1997(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field2294[var31 + var33 - var43 - 1] * (long) class242.field3603[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field2294[var33 - var44 - 1] * (long) class242.field3603[1][var44] >> 16);
                            }
                            field2294[var33] = var42;
                            this.field2293.method1997(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field2291.method1780(0, (float) var30 / 65536.0F);
                    var32 = this.field2291.method1780(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field2294[var46] < -32768) {
                field2294[var46] = -32768;
            }
            if (field2294[var46] > 32767) {
                field2294[var46] = 32767;
            }
        }
        return field2294;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)I", line = 364)
    private final int method1145(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2299[arg0 & 0x7FFF] * arg1 >> 14;
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
        field2299 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2299[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2294 = new int[220500];
        field2304 = new int[5];
        field2306 = new int[5];
        field2307 = new int[5];
        field2305 = new int[5];
        field2308 = new int[5];
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()V", line = 435)
    public static void method1146() {
        field2294 = null;
        field2292 = null;
        field2299 = null;
        field2306 = null;
        field2304 = null;
        field2307 = null;
        field2308 = null;
        field2305 = null;
    }
}
