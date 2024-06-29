import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class431 {

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "[I")
    private int[] field6271 = new int[5];

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public int field6284 = 0;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    private int field6282 = 0;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "[I")
    private int[] field6279 = new int[5];

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public int field6280 = 500;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
    private int field6293 = 100;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "[I")
    private int[] field6290 = new int[5];

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "[I")
    private static int[] field6281 = new int[32768];

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "[I")
    private static int[] field6270;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "[I")
    private static int[] field6273;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "[I")
    private static int[] field6285;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "[I")
    private static int[] field6289;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "[I")
    private static int[] field6286;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "[I")
    private static int[] field6283;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "[I")
    private static int[] field6292;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "Ltr;")
    private class191 field6275;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Lde;")
    private class368 field6269;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "Lde;")
    private class368 field6272;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "Lde;")
    private class368 field6274;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "Lde;")
    private class368 field6276;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "Lde;")
    private class368 field6277;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "Lde;")
    private class368 field6278;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "Lde;")
    private class368 field6287;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "Lde;")
    private class368 field6288;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "Lde;")
    private class368 field6291;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lti;)V")
    public final void method2617(class303 arg0) {
        this.field6274 = new class368();
        this.field6274.method2365(arg0);
        this.field6291 = new class368();
        this.field6291.method2365(arg0);
        int var2 = arg0.method1918((byte) 89);
        if (var2 != 0) {
            arg0.field4333--;
            this.field6277 = new class368();
            this.field6277.method2365(arg0);
            this.field6269 = new class368();
            this.field6269.method2365(arg0);
        }
        int var3 = arg0.method1918((byte) 104);
        if (var3 != 0) {
            arg0.field4333--;
            this.field6287 = new class368();
            this.field6287.method2365(arg0);
            this.field6276 = new class368();
            this.field6276.method2365(arg0);
        }
        int var4 = arg0.method1918((byte) 68);
        if (var4 != 0) {
            arg0.field4333--;
            this.field6288 = new class368();
            this.field6288.method2365(arg0);
            this.field6278 = new class368();
            this.field6278.method2365(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1891(false);
            if (var6 == 0) {
                break;
            }
            this.field6279[var5] = var6;
            this.field6290[var5] = arg0.method1895(-19);
            this.field6271[var5] = arg0.method1891(false);
        }
        this.field6282 = arg0.method1891(false);
        this.field6293 = arg0.method1891(false);
        this.field6280 = arg0.method1868(0);
        this.field6284 = arg0.method1868(0);
        this.field6275 = new class191();
        this.field6272 = new class368();
        this.field6275.method1307(arg0, this.field6272);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)[I")
    public final int[] method2618(int arg0, int arg1) {
        class486.method2906(field6273, 0, arg0);
        if (arg1 < 10) {
            return field6273;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field6274.method2367();
        this.field6291.method2367();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field6277 != null) {
            this.field6277.method2367();
            this.field6269.method2367();
            var5 = (int) ((double) (this.field6277.field5514 - this.field6277.field5512) * 32.768D / var3);
            var6 = (int) ((double) this.field6277.field5512 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field6287 != null) {
            this.field6287.method2367();
            this.field6276.method2367();
            var8 = (int) ((double) (this.field6287.field5514 - this.field6287.field5512) * 32.768D / var3);
            var9 = (int) ((double) this.field6287.field5512 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field6279[var11] != 0) {
                field6292[var11] = 0;
                field6286[var11] = (int) ((double) this.field6271[var11] * var3);
                field6283[var11] = (this.field6279[var11] << 14) / 100;
                field6289[var11] = (int) ((double) (this.field6274.field5514 - this.field6274.field5512) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field6290[var11]) / var3);
                field6285[var11] = (int) ((double) this.field6274.field5512 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field6274.method2366(arg0);
            int var40 = this.field6291.method2366(arg0);
            if (this.field6277 != null) {
                int var41 = this.field6277.method2366(arg0);
                int var42 = this.field6269.method2366(arg0);
                var39 += this.method2619(var7, var42, this.field6277.field5516) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field6287 != null) {
                int var43 = this.field6287.method2366(arg0);
                int var44 = this.field6276.method2366(arg0);
                var40 = var40 * ((this.method2619(var10, var44, this.field6287.field5516) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field6279[var45] != 0) {
                    int var46 = field6286[var45] + var12;
                    if (var46 < arg0) {
                        field6273[var46] += this.method2619(field6292[var45], field6283[var45] * var40 >> 15, this.field6274.field5516);
                        field6292[var45] += (field6289[var45] * var39 >> 16) + field6285[var45];
                    }
                }
            }
        }
        if (this.field6288 != null) {
            this.field6288.method2367();
            this.field6278.method2367();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field6288.method2366(arg0);
                int var18 = this.field6278.method2366(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field6288.field5514 - this.field6288.field5512) * var17 >> 8) + this.field6288.field5512;
                } else {
                    var19 = ((this.field6288.field5514 - this.field6288.field5512) * var18 >> 8) + this.field6288.field5512;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field6273[var16] = 0;
                }
            }
        }
        if (this.field6282 > 0 && this.field6293 > 0) {
            int var20 = (int) ((double) this.field6282 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field6273[var21] += field6273[var21 - var20] * this.field6293 / 100;
            }
        }
        if (this.field6275.field2808[0] > 0 || this.field6275.field2808[1] > 0) {
            this.field6272.method2367();
            int var22 = this.field6272.method2366(arg0 + 1);
            int var23 = this.field6275.method1305(0, (float) var22 / 65536.0F);
            int var24 = this.field6275.method1305(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field6273[var23 + var25] * (long) class191.field2806 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field6273[var23 + var25 - var36 - 1] * (long) class191.field2802[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field6273[var25 - var37 - 1] * (long) class191.field2802[1][var37] >> 16);
                    }
                    field6273[var25] = var35;
                    var22 = this.field6272.method2366(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field6273[var23 + var25] * (long) class191.field2806 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field6273[var23 + var25 - var33 - 1] * (long) class191.field2802[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field6273[var25 - var34 - 1] * (long) class191.field2802[1][var34] >> 16);
                        }
                        field6273[var25] = var32;
                        var22 = this.field6272.method2366(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field6273[var23 + var25 - var29 - 1] * (long) class191.field2802[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field6273[var25 - var30 - 1] * (long) class191.field2802[1][var30] >> 16);
                            }
                            field6273[var25] = var28;
                            this.field6272.method2366(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field6275.method1305(0, (float) var22 / 65536.0F);
                    var24 = this.field6275.method1305(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field6273[var38] < -32768) {
                field6273[var38] = -32768;
            }
            if (field6273[var38] > 32767) {
                field6273[var38] = 32767;
            }
        }
        return field6273;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)I")
    private final int method2619(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field6270[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field6281[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()V")
    public static void method2620() {
        field6273 = null;
        field6281 = null;
        field6270 = null;
        field6292 = null;
        field6286 = null;
        field6283 = null;
        field6289 = null;
        field6285 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field6281[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field6270 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field6270[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field6273 = new int[220500];
        field6285 = new int[5];
        field6289 = new int[5];
        field6286 = new int[5];
        field6283 = new int[5];
        field6292 = new int[5];
    }
}
