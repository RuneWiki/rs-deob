import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class442 {

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "I")
    private int field6351 = 0;

    @OriginalMember(owner = "client!oga", name = "k", descriptor = "I")
    public int field6356 = 0;

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "I")
    private int field6348 = 100;

    @OriginalMember(owner = "client!oga", name = "o", descriptor = "[I")
    private int[] field6360 = new int[5];

    @OriginalMember(owner = "client!oga", name = "p", descriptor = "I")
    public int field6361 = 500;

    @OriginalMember(owner = "client!oga", name = "r", descriptor = "[I")
    private int[] field6363 = new int[5];

    @OriginalMember(owner = "client!oga", name = "n", descriptor = "[I")
    private int[] field6359 = new int[5];

    @OriginalMember(owner = "client!oga", name = "t", descriptor = "[I")
    private static int[] field6365 = new int[32768];

    @OriginalMember(owner = "client!oga", name = "l", descriptor = "[I")
    private static int[] field6357;

    @OriginalMember(owner = "client!oga", name = "q", descriptor = "[I")
    private static int[] field6362;

    @OriginalMember(owner = "client!oga", name = "w", descriptor = "[I")
    private static int[] field6368;

    @OriginalMember(owner = "client!oga", name = "v", descriptor = "[I")
    private static int[] field6367;

    @OriginalMember(owner = "client!oga", name = "u", descriptor = "[I")
    private static int[] field6366;

    @OriginalMember(owner = "client!oga", name = "x", descriptor = "[I")
    private static int[] field6369;

    @OriginalMember(owner = "client!oga", name = "y", descriptor = "[I")
    private static int[] field6370;

    @OriginalMember(owner = "client!oga", name = "j", descriptor = "Lcg;")
    private class123 field6355;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "Lvda;")
    private class166 field6346;

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "Lvda;")
    private class166 field6347;

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "Lvda;")
    private class166 field6349;

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "Lvda;")
    private class166 field6350;

    @OriginalMember(owner = "client!oga", name = "g", descriptor = "Lvda;")
    private class166 field6352;

    @OriginalMember(owner = "client!oga", name = "h", descriptor = "Lvda;")
    private class166 field6353;

    @OriginalMember(owner = "client!oga", name = "i", descriptor = "Lvda;")
    private class166 field6354;

    @OriginalMember(owner = "client!oga", name = "m", descriptor = "Lvda;")
    private class166 field6358;

    @OriginalMember(owner = "client!oga", name = "s", descriptor = "Lvda;")
    private class166 field6364;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Lqh;)V")
    public final void method2661(class61 arg0) {
        this.field6349 = new class166();
        this.field6349.method1256(arg0);
        this.field6346 = new class166();
        this.field6346.method1256(arg0);
        int var2 = arg0.method732(-559537960);
        if (var2 != 0) {
            arg0.field1393--;
            this.field6352 = new class166();
            this.field6352.method1256(arg0);
            this.field6364 = new class166();
            this.field6364.method1256(arg0);
        }
        int var3 = arg0.method732(-559537960);
        if (var3 != 0) {
            arg0.field1393--;
            this.field6353 = new class166();
            this.field6353.method1256(arg0);
            this.field6350 = new class166();
            this.field6350.method1256(arg0);
        }
        int var4 = arg0.method732(-559537960);
        if (var4 != 0) {
            arg0.field1393--;
            this.field6358 = new class166();
            this.field6358.method1256(arg0);
            this.field6354 = new class166();
            this.field6354.method1256(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method752(-27278);
            if (var6 == 0) {
                break;
            }
            this.field6363[var5] = var6;
            this.field6359[var5] = arg0.method699(-49152);
            this.field6360[var5] = arg0.method752(-27278);
        }
        this.field6351 = arg0.method752(-27278);
        this.field6348 = arg0.method752(-27278);
        this.field6361 = arg0.method723((byte) -25);
        this.field6356 = arg0.method723((byte) -25);
        this.field6355 = new class123();
        this.field6347 = new class166();
        this.field6355.method1059(arg0, this.field6347);
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "()V")
    public static void method2662() {
        field6362 = null;
        field6365 = null;
        field6357 = null;
        field6367 = null;
        field6369 = null;
        field6368 = null;
        field6370 = null;
        field6366 = null;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(III)I")
    private final int method2663(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field6357[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field6365[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)[I")
    public final int[] method2664(int arg0, int arg1) {
        class692.method3872(field6362, 0, arg0);
        if (arg1 < 10) {
            return field6362;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field6349.method1259();
        this.field6346.method1259();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field6352 != null) {
            this.field6352.method1259();
            this.field6364.method1259();
            var5 = (int) ((double) (this.field6352.field2759 - this.field6352.field2761) * 32.768D / var3);
            var6 = (int) ((double) this.field6352.field2761 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field6353 != null) {
            this.field6353.method1259();
            this.field6350.method1259();
            var8 = (int) ((double) (this.field6353.field2759 - this.field6353.field2761) * 32.768D / var3);
            var9 = (int) ((double) this.field6353.field2761 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field6363[var11] != 0) {
                field6367[var11] = 0;
                field6369[var11] = (int) ((double) this.field6360[var11] * var3);
                field6368[var11] = (this.field6363[var11] << 14) / 100;
                field6370[var11] = (int) ((double) (this.field6349.field2759 - this.field6349.field2761) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field6359[var11]) / var3);
                field6366[var11] = (int) ((double) this.field6349.field2761 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field6349.method1257(arg0);
            int var40 = this.field6346.method1257(arg0);
            if (this.field6352 != null) {
                int var41 = this.field6352.method1257(arg0);
                int var42 = this.field6364.method1257(arg0);
                var39 += this.method2663(var7, var42, this.field6352.field2757) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field6353 != null) {
                int var43 = this.field6353.method1257(arg0);
                int var44 = this.field6350.method1257(arg0);
                var40 = var40 * ((this.method2663(var10, var44, this.field6353.field2757) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field6363[var45] != 0) {
                    int var46 = field6369[var45] + var12;
                    if (var46 < arg0) {
                        field6362[var46] += this.method2663(field6367[var45], field6368[var45] * var40 >> 15, this.field6349.field2757);
                        field6367[var45] += (field6370[var45] * var39 >> 16) + field6366[var45];
                    }
                }
            }
        }
        if (this.field6358 != null) {
            this.field6358.method1259();
            this.field6354.method1259();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field6358.method1257(arg0);
                int var18 = this.field6354.method1257(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field6358.field2759 - this.field6358.field2761) * var17 >> 8) + this.field6358.field2761;
                } else {
                    var19 = ((this.field6358.field2759 - this.field6358.field2761) * var18 >> 8) + this.field6358.field2761;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field6362[var16] = 0;
                }
            }
        }
        if (this.field6351 > 0 && this.field6348 > 0) {
            int var20 = (int) ((double) this.field6351 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field6362[var21] += field6362[var21 - var20] * this.field6348 / 100;
            }
        }
        if (this.field6355.field2239[0] > 0 || this.field6355.field2239[1] > 0) {
            this.field6347.method1259();
            int var22 = this.field6347.method1257(arg0 + 1);
            int var23 = this.field6355.method1057(0, (float) var22 / 65536.0F);
            int var24 = this.field6355.method1057(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field6362[var23 + var25] * (long) class123.field2233 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field6362[var23 + var25 - var36 - 1] * (long) class123.field2237[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field6362[var25 - var37 - 1] * (long) class123.field2237[1][var37] >> 16);
                    }
                    field6362[var25] = var35;
                    var22 = this.field6347.method1257(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field6362[var23 + var25] * (long) class123.field2233 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field6362[var23 + var25 - var33 - 1] * (long) class123.field2237[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field6362[var25 - var34 - 1] * (long) class123.field2237[1][var34] >> 16);
                        }
                        field6362[var25] = var32;
                        var22 = this.field6347.method1257(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field6362[var23 + var25 - var29 - 1] * (long) class123.field2237[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field6362[var25 - var30 - 1] * (long) class123.field2237[1][var30] >> 16);
                            }
                            field6362[var25] = var28;
                            this.field6347.method1257(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field6355.method1057(0, (float) var22 / 65536.0F);
                    var24 = this.field6355.method1057(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field6362[var38] < -32768) {
                field6362[var38] = -32768;
            }
            if (field6362[var38] > 32767) {
                field6362[var38] = 32767;
            }
        }
        return field6362;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field6365[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field6357 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field6357[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field6362 = new int[220500];
        field6368 = new int[5];
        field6367 = new int[5];
        field6366 = new int[5];
        field6369 = new int[5];
        field6370 = new int[5];
    }
}
