import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class374 {

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    private int field5178 = 100;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    private int field5179 = 0;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public int field5185 = 500;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public int field5182 = 0;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "[I")
    private int[] field5181 = new int[5];

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "[I")
    private int[] field5186 = new int[5];

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "[I")
    private int[] field5192 = new int[5];

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "[I")
    private static int[] field5184 = new int[32768];

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "[I")
    private static int[] field5196;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "[I")
    private static int[] field5194;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "[I")
    private static int[] field5198;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "[I")
    private static int[] field5200;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "[I")
    private static int[] field5199;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "[I")
    private static int[] field5201;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "[I")
    private static int[] field5202;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "Luq;")
    private class235 field5193;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "Lrq;")
    private class327 field5180;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "Lrq;")
    private class327 field5183;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "Lrq;")
    private class327 field5187;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "Lrq;")
    private class327 field5188;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "Lrq;")
    private class327 field5189;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "Lrq;")
    private class327 field5190;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "Lrq;")
    private class327 field5191;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "Lrq;")
    private class327 field5195;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "Lrq;")
    private class327 field5197;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field5184[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field5196 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field5196[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field5194 = new int[220500];
        field5198 = new int[5];
        field5200 = new int[5];
        field5199 = new int[5];
        field5201 = new int[5];
        field5202 = new int[5];
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)I", line = 10)
    private final int method2339(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field5196[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field5184[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)[I", line = 39)
    public final int[] method2340(int arg0, int arg1) {
        class79.method640(field5194, 0, arg0);
        if (arg1 < 10) {
            return field5194;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field5180.method1997();
        this.field5191.method1997();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field5188 != null) {
            this.field5188.method1997();
            this.field5187.method1997();
            var5 = (int) ((double) (this.field5188.field4436 - this.field5188.field4437) * 32.768D / var3);
            var6 = (int) ((double) this.field5188.field4437 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field5195 != null) {
            this.field5195.method1997();
            this.field5190.method1997();
            var8 = (int) ((double) (this.field5195.field4436 - this.field5195.field4437) * 32.768D / var3);
            var9 = (int) ((double) this.field5195.field4437 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field5181[var11] != 0) {
                field5202[var11] = 0;
                field5198[var11] = (int) ((double) this.field5186[var11] * var3);
                field5200[var11] = (this.field5181[var11] << 14) / 100;
                field5201[var11] = (int) ((double) (this.field5180.field4436 - this.field5180.field4437) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field5192[var11]) / var3);
                field5199[var11] = (int) ((double) this.field5180.field4437 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field5180.method1995(arg0);
            int var40 = this.field5191.method1995(arg0);
            if (this.field5188 != null) {
                int var41 = this.field5188.method1995(arg0);
                int var42 = this.field5187.method1995(arg0);
                var39 += this.method2339(var7, var42, this.field5188.field4440) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field5195 != null) {
                int var43 = this.field5195.method1995(arg0);
                int var44 = this.field5190.method1995(arg0);
                var40 = var40 * ((this.method2339(var10, var44, this.field5195.field4440) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field5181[var45] != 0) {
                    int var46 = field5198[var45] + var12;
                    if (var46 < arg0) {
                        field5194[var46] += this.method2339(field5202[var45], field5200[var45] * var40 >> 15, this.field5180.field4440);
                        field5202[var45] += (field5201[var45] * var39 >> 16) + field5199[var45];
                    }
                }
            }
        }
        if (this.field5197 != null) {
            this.field5197.method1997();
            this.field5183.method1997();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field5197.method1995(arg0);
                int var18 = this.field5183.method1995(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field5197.field4436 - this.field5197.field4437) * var17 >> 8) + this.field5197.field4437;
                } else {
                    var19 = ((this.field5197.field4436 - this.field5197.field4437) * var18 >> 8) + this.field5197.field4437;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field5194[var16] = 0;
                }
            }
        }
        if (this.field5179 > 0 && this.field5178 > 0) {
            int var20 = (int) ((double) this.field5179 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field5194[var21] += field5194[var21 - var20] * this.field5178 / 100;
            }
        }
        if (this.field5193.field3347[0] > 0 || this.field5193.field3347[1] > 0) {
            this.field5189.method1997();
            int var22 = this.field5189.method1995(arg0 + 1);
            int var23 = this.field5193.method1537(0, (float) var22 / 65536.0F);
            int var24 = this.field5193.method1537(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field5194[var23 + var25] * (long) class235.field3341 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field5194[var23 + var25 - var36 - 1] * (long) class235.field3348[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field5194[var25 - var37 - 1] * (long) class235.field3348[1][var37] >> 16);
                    }
                    field5194[var25] = var35;
                    var22 = this.field5189.method1995(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field5194[var23 + var25] * (long) class235.field3341 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field5194[var23 + var25 - var33 - 1] * (long) class235.field3348[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field5194[var25 - var34 - 1] * (long) class235.field3348[1][var34] >> 16);
                        }
                        field5194[var25] = var32;
                        var22 = this.field5189.method1995(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field5194[var23 + var25 - var29 - 1] * (long) class235.field3348[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field5194[var25 - var30 - 1] * (long) class235.field3348[1][var30] >> 16);
                            }
                            field5194[var25] = var28;
                            this.field5189.method1995(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field5193.method1537(0, (float) var22 / 65536.0F);
                    var24 = this.field5193.method1537(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field5194[var38] < -32768) {
                field5194[var38] = -32768;
            }
            if (field5194[var38] > 32767) {
                field5194[var38] = 32767;
            }
        }
        return field5194;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()V", line = 331)
    public static void method2341() {
        field5194 = null;
        field5184 = null;
        field5196 = null;
        field5202 = null;
        field5198 = null;
        field5200 = null;
        field5201 = null;
        field5199 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lrg;)V", line = 342)
    public final void method2342(class366 arg0) {
        this.field5180 = new class327();
        this.field5180.method1996(arg0);
        this.field5191 = new class327();
        this.field5191.method1996(arg0);
        int var2 = arg0.method2306((byte) 114);
        if (var2 != 0) {
            arg0.field5048--;
            this.field5188 = new class327();
            this.field5188.method1996(arg0);
            this.field5187 = new class327();
            this.field5187.method1996(arg0);
        }
        int var3 = arg0.method2306((byte) 94);
        if (var3 != 0) {
            arg0.field5048--;
            this.field5195 = new class327();
            this.field5195.method1996(arg0);
            this.field5190 = new class327();
            this.field5190.method1996(arg0);
        }
        int var4 = arg0.method2306((byte) 54);
        if (var4 != 0) {
            arg0.field5048--;
            this.field5197 = new class327();
            this.field5197.method1996(arg0);
            this.field5183 = new class327();
            this.field5183.method1996(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2251(-120);
            if (var6 == 0) {
                break;
            }
            this.field5181[var5] = var6;
            this.field5192[var5] = arg0.method2294(-26949);
            this.field5186[var5] = arg0.method2251(-106);
        }
        this.field5179 = arg0.method2251(-116);
        this.field5178 = arg0.method2251(-123);
        this.field5185 = arg0.method2297(13352);
        this.field5182 = arg0.method2297(13352);
        this.field5193 = new class235();
        this.field5189 = new class327();
        this.field5193.method1535(arg0, this.field5189);
    }
}
