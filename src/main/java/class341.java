import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class341 {

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "[I")
    private int[] field5237 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "[I")
    private int[] field5241 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    private int field5244 = 0;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
    public int field5248 = 500;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public int field5240 = 0;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "[I")
    private int[] field5239 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    private int field5247 = 100;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "[I")
    private static int[] field5250 = new int[32768];

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "[I")
    private static int[] field5249;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "[I")
    private static int[] field5251;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "[I")
    private static int[] field5253;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "[I")
    private static int[] field5255;

    @OriginalMember(owner = "client!eo", name = "w", descriptor = "[I")
    private static int[] field5257;

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "[I")
    private static int[] field5254;

    @OriginalMember(owner = "client!eo", name = "y", descriptor = "[I")
    private static int[] field5259;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "Ldn;")
    private class142 field5235;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "Ldn;")
    private class142 field5236;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "Ldn;")
    private class142 field5238;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "Ldn;")
    private class142 field5242;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "Ldn;")
    private class142 field5243;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "Ldn;")
    private class142 field5246;

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "Ldn;")
    private class142 field5252;

    @OriginalMember(owner = "client!eo", name = "v", descriptor = "Ldn;")
    private class142 field5256;

    @OriginalMember(owner = "client!eo", name = "x", descriptor = "Ldn;")
    private class142 field5258;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "Lhf;")
    private class16 field5245;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)I", line = 11)
    private final int method2394(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field5249[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field5250[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lug;)V", line = 34)
    public final void method2395(class25 arg0) {
        this.field5236 = new class142();
        this.field5236.method1180(arg0);
        this.field5243 = new class142();
        this.field5243.method1180(arg0);
        int var2 = arg0.method281(-128);
        if (var2 != 0) {
            arg0.field397--;
            this.field5252 = new class142();
            this.field5252.method1180(arg0);
            this.field5235 = new class142();
            this.field5235.method1180(arg0);
        }
        int var3 = arg0.method281(45);
        if (var3 != 0) {
            arg0.field397--;
            this.field5246 = new class142();
            this.field5246.method1180(arg0);
            this.field5256 = new class142();
            this.field5256.method1180(arg0);
        }
        int var4 = arg0.method281(-125);
        if (var4 != 0) {
            arg0.field397--;
            this.field5242 = new class142();
            this.field5242.method1180(arg0);
            this.field5238 = new class142();
            this.field5238.method1180(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method270(false);
            if (var6 == 0) {
                break;
            }
            this.field5241[var5] = var6;
            this.field5239[var5] = arg0.method303((byte) 105);
            this.field5237[var5] = arg0.method270(false);
        }
        this.field5244 = arg0.method270(false);
        this.field5247 = arg0.method270(false);
        this.field5248 = arg0.method314((byte) 83);
        this.field5240 = arg0.method314((byte) 28);
        this.field5245 = new class16();
        this.field5258 = new class142();
        this.field5245.method166(arg0, this.field5258);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)[I", line = 111)
    public final int[] method2396(int arg0, int arg1) {
        class65.method638(field5251, 0, arg0);
        if (arg1 < 10) {
            return field5251;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field5236.method1182();
        this.field5243.method1182();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field5252 != null) {
            this.field5252.method1182();
            this.field5235.method1182();
            var5 = (int) ((double) (this.field5252.field2337 - this.field5252.field2340) * 32.768D / var3);
            var6 = (int) ((double) this.field5252.field2340 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field5246 != null) {
            this.field5246.method1182();
            this.field5256.method1182();
            var8 = (int) ((double) (this.field5246.field2337 - this.field5246.field2340) * 32.768D / var3);
            var9 = (int) ((double) this.field5246.field2340 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field5241[var11] != 0) {
                field5255[var11] = 0;
                field5257[var11] = (int) ((double) this.field5237[var11] * var3);
                field5253[var11] = (this.field5241[var11] << 14) / 100;
                field5254[var11] = (int) ((double) (this.field5236.field2337 - this.field5236.field2340) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field5239[var11]) / var3);
                field5259[var11] = (int) ((double) this.field5236.field2340 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field5236.method1179(arg0);
            int var14 = this.field5243.method1179(arg0);
            if (this.field5252 != null) {
                int var15 = this.field5252.method1179(arg0);
                int var16 = this.field5235.method1179(arg0);
                var13 += this.method2394(var7, var16, this.field5252.field2336) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field5246 != null) {
                int var17 = this.field5246.method1179(arg0);
                int var18 = this.field5256.method1179(arg0);
                var14 = var14 * ((this.method2394(var10, var18, this.field5246.field2336) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field5241[var19] != 0) {
                    int var20 = field5257[var19] + var12;
                    if (var20 < arg0) {
                        field5251[var20] += this.method2394(field5255[var19], field5253[var19] * var14 >> 15, this.field5236.field2336);
                        field5255[var19] += (field5254[var19] * var13 >> 16) + field5259[var19];
                    }
                }
            }
        }
        if (this.field5242 != null) {
            this.field5242.method1182();
            this.field5238.method1182();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field5242.method1179(arg0);
                int var26 = this.field5238.method1179(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field5242.field2337 - this.field5242.field2340) * var25 >> 8) + this.field5242.field2340;
                } else {
                    var27 = ((this.field5242.field2337 - this.field5242.field2340) * var26 >> 8) + this.field5242.field2340;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field5251[var24] = 0;
                }
            }
        }
        if (this.field5244 > 0 && this.field5247 > 0) {
            int var28 = (int) ((double) this.field5244 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field5251[var29] += field5251[var29 - var28] * this.field5247 / 100;
            }
        }
        if (this.field5245.field254[0] > 0 || this.field5245.field254[1] > 0) {
            this.field5258.method1182();
            int var30 = this.field5258.method1179(arg0 + 1);
            int var31 = this.field5245.method171(0, (float) var30 / 65536.0F);
            int var32 = this.field5245.method171(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field5251[var31 + var33] * (long) class16.field252 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field5251[var31 + var33 - var36 - 1] * (long) class16.field257[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field5251[var33 - var37 - 1] * (long) class16.field257[1][var37] >> 16);
                    }
                    field5251[var33] = var35;
                    var30 = this.field5258.method1179(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field5251[var31 + var33] * (long) class16.field252 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field5251[var31 + var33 - var40 - 1] * (long) class16.field257[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field5251[var33 - var41 - 1] * (long) class16.field257[1][var41] >> 16);
                        }
                        field5251[var33] = var39;
                        var30 = this.field5258.method1179(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field5251[var31 + var33 - var43 - 1] * (long) class16.field257[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field5251[var33 - var44 - 1] * (long) class16.field257[1][var44] >> 16);
                            }
                            field5251[var33] = var42;
                            this.field5258.method1179(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field5245.method171(0, (float) var30 / 65536.0F);
                    var32 = this.field5245.method171(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field5251[var46] < -32768) {
                field5251[var46] = -32768;
            }
            if (field5251[var46] > 32767) {
                field5251[var46] = 32767;
            }
        }
        return field5251;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "()V", line = 395)
    public static void method2397() {
        field5251 = null;
        field5250 = null;
        field5249 = null;
        field5255 = null;
        field5257 = null;
        field5253 = null;
        field5254 = null;
        field5259 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field5250[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field5249 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field5249[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field5251 = new int[220500];
        field5253 = new int[5];
        field5255 = new int[5];
        field5257 = new int[5];
        field5254 = new int[5];
        field5259 = new int[5];
    }
}
