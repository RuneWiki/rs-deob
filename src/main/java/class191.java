import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class191 {

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "[I")
    private int[] field3295 = new int[5];

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public int field3299 = 0;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public int field3300 = 500;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "[I")
    private int[] field3310 = new int[5];

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    private int field3306 = 100;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    private int field3304 = 0;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "[I")
    private int[] field3316 = new int[5];

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "[I")
    private static int[] field3302 = new int[32768];

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "[I")
    private static int[] field3296;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "[I")
    private static int[] field3303;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "[I")
    private static int[] field3305;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "[I")
    private static int[] field3309;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "[I")
    private static int[] field3312;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "[I")
    private static int[] field3315;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "[I")
    private static int[] field3317;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Lah;")
    private class13 field3301;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "Lag;")
    private class239 field3294;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "Lag;")
    private class239 field3297;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "Lag;")
    private class239 field3298;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "Lag;")
    private class239 field3307;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "Lag;")
    private class239 field3308;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "Lag;")
    private class239 field3311;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "Lag;")
    private class239 field3313;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "Lag;")
    private class239 field3314;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "Lag;")
    private class239 field3318;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "()V")
    public static void method1254() {
        field3303 = null;
        field3302 = null;
        field3296 = null;
        field3312 = null;
        field3317 = null;
        field3305 = null;
        field3315 = null;
        field3309 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)[I")
    public final int[] method1255(int arg0, int arg1) {
        class46.method329(field3303, 0, arg0);
        if (arg1 < 10) {
            return field3303;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3297.method1575();
        this.field3313.method1575();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3311 != null) {
            this.field3311.method1575();
            this.field3314.method1575();
            var5 = (int) ((double) (this.field3311.field4151 - this.field3311.field4147) * 32.768D / var3);
            var6 = (int) ((double) this.field3311.field4147 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3318 != null) {
            this.field3318.method1575();
            this.field3298.method1575();
            var8 = (int) ((double) (this.field3318.field4151 - this.field3318.field4147) * 32.768D / var3);
            var9 = (int) ((double) this.field3318.field4147 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3310[var11] != 0) {
                field3312[var11] = 0;
                field3317[var11] = (int) ((double) this.field3316[var11] * var3);
                field3305[var11] = (this.field3310[var11] << 14) / 100;
                field3315[var11] = (int) ((double) (this.field3297.field4151 - this.field3297.field4147) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3295[var11]) / var3);
                field3309[var11] = (int) ((double) this.field3297.field4147 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3297.method1573(arg0);
            int var40 = this.field3313.method1573(arg0);
            if (this.field3311 != null) {
                int var41 = this.field3311.method1573(arg0);
                int var42 = this.field3314.method1573(arg0);
                var39 += this.method1256(var7, var42, this.field3311.field4149) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3318 != null) {
                int var43 = this.field3318.method1573(arg0);
                int var44 = this.field3298.method1573(arg0);
                var40 = var40 * ((this.method1256(var10, var44, this.field3318.field4149) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3310[var45] != 0) {
                    int var46 = field3317[var45] + var12;
                    if (var46 < arg0) {
                        field3303[var46] += this.method1256(field3312[var45], field3305[var45] * var40 >> 15, this.field3297.field4149);
                        field3312[var45] += (field3315[var45] * var39 >> 16) + field3309[var45];
                    }
                }
            }
        }
        if (this.field3294 != null) {
            this.field3294.method1575();
            this.field3307.method1575();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3294.method1573(arg0);
                int var18 = this.field3307.method1573(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3294.field4151 - this.field3294.field4147) * var17 >> 8) + this.field3294.field4147;
                } else {
                    var19 = ((this.field3294.field4151 - this.field3294.field4147) * var18 >> 8) + this.field3294.field4147;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3303[var16] = 0;
                }
            }
        }
        if (this.field3304 > 0 && this.field3306 > 0) {
            int var20 = (int) ((double) this.field3304 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3303[var21] += field3303[var21 - var20] * this.field3306 / 100;
            }
        }
        if (this.field3301.field161[0] > 0 || this.field3301.field161[1] > 0) {
            this.field3308.method1575();
            int var22 = this.field3308.method1573(arg0 + 1);
            int var23 = this.field3301.method56(0, (float) var22 / 65536.0F);
            int var24 = this.field3301.method56(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3303[var23 + var25] * (long) class13.field163 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3303[var23 + var25 - var36 - 1] * (long) class13.field162[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3303[var25 - var37 - 1] * (long) class13.field162[1][var37] >> 16);
                    }
                    field3303[var25] = var35;
                    var22 = this.field3308.method1573(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3303[var23 + var25] * (long) class13.field163 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3303[var23 + var25 - var33 - 1] * (long) class13.field162[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3303[var25 - var34 - 1] * (long) class13.field162[1][var34] >> 16);
                        }
                        field3303[var25] = var32;
                        var22 = this.field3308.method1573(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3303[var23 + var25 - var29 - 1] * (long) class13.field162[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3303[var25 - var30 - 1] * (long) class13.field162[1][var30] >> 16);
                            }
                            field3303[var25] = var28;
                            this.field3308.method1573(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3301.method56(0, (float) var22 / 65536.0F);
                    var24 = this.field3301.method56(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3303[var38] < -32768) {
                field3303[var38] = -32768;
            }
            if (field3303[var38] > 32767) {
                field3303[var38] = 32767;
            }
        }
        return field3303;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)I")
    private final int method1256(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3296[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3302[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Llh;)V")
    public final void method1257(class249 arg0) {
        this.field3297 = new class239();
        this.field3297.method1574(arg0);
        this.field3313 = new class239();
        this.field3313.method1574(arg0);
        int var2 = arg0.method1677(-6677);
        if (var2 != 0) {
            arg0.field4335--;
            this.field3311 = new class239();
            this.field3311.method1574(arg0);
            this.field3314 = new class239();
            this.field3314.method1574(arg0);
        }
        int var3 = arg0.method1677(-6677);
        if (var3 != 0) {
            arg0.field4335--;
            this.field3318 = new class239();
            this.field3318.method1574(arg0);
            this.field3298 = new class239();
            this.field3298.method1574(arg0);
        }
        int var4 = arg0.method1677(-6677);
        if (var4 != 0) {
            arg0.field4335--;
            this.field3294 = new class239();
            this.field3294.method1574(arg0);
            this.field3307 = new class239();
            this.field3307.method1574(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1639(255);
            if (var6 == 0) {
                break;
            }
            this.field3310[var5] = var6;
            this.field3295[var5] = arg0.method1687(32767);
            this.field3316[var5] = arg0.method1639(255);
        }
        this.field3304 = arg0.method1639(255);
        this.field3306 = arg0.method1639(255);
        this.field3300 = arg0.method1674(1355769544);
        this.field3299 = arg0.method1674(1355769544);
        this.field3301 = new class13();
        this.field3308 = new class239();
        this.field3301.method55(arg0, this.field3308);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3302[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3296 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3296[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3303 = new int[220500];
        field3305 = new int[5];
        field3309 = new int[5];
        field3312 = new int[5];
        field3315 = new int[5];
        field3317 = new int[5];
    }
}
