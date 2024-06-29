import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class173 {

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    private int field3022 = 0;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "[I")
    private int[] field3019 = new int[5];

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "[I")
    private int[] field3032 = new int[5];

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public int field3029 = 0;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "[I")
    private int[] field3028 = new int[5];

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    private int field3027 = 100;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public int field3024 = 500;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "[I")
    private static int[] field3030 = new int[32768];

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "[I")
    private static int[] field3026;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "[I")
    private static int[] field3035;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "[I")
    private static int[] field3036;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "[I")
    private static int[] field3038;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "[I")
    private static int[] field3037;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "[I")
    private static int[] field3039;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "[I")
    private static int[] field3040;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Lah;")
    private class265 field3016;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Lah;")
    private class265 field3017;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "Lah;")
    private class265 field3018;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "Lah;")
    private class265 field3020;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "Lah;")
    private class265 field3021;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "Lah;")
    private class265 field3023;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "Lah;")
    private class265 field3025;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "Lah;")
    private class265 field3033;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "Lah;")
    private class265 field3034;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "Lha;")
    private class30 field3031;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lie;)V")
    public final void method1200(class32 arg0) {
        this.field3033 = new class265();
        this.field3033.method1770(arg0);
        this.field3018 = new class265();
        this.field3018.method1770(arg0);
        int var2 = arg0.method316((byte) 117);
        if (var2 != 0) {
            arg0.field647--;
            this.field3025 = new class265();
            this.field3025.method1770(arg0);
            this.field3034 = new class265();
            this.field3034.method1770(arg0);
        }
        int var3 = arg0.method316((byte) -66);
        if (var3 != 0) {
            arg0.field647--;
            this.field3016 = new class265();
            this.field3016.method1770(arg0);
            this.field3021 = new class265();
            this.field3021.method1770(arg0);
        }
        int var4 = arg0.method316((byte) -1);
        if (var4 != 0) {
            arg0.field647--;
            this.field3023 = new class265();
            this.field3023.method1770(arg0);
            this.field3017 = new class265();
            this.field3017.method1770(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method303(56);
            if (var6 == 0) {
                break;
            }
            this.field3019[var5] = var6;
            this.field3032[var5] = arg0.method323(98);
            this.field3028[var5] = arg0.method303(-127);
        }
        this.field3022 = arg0.method303(-98);
        this.field3027 = arg0.method303(-117);
        this.field3024 = arg0.method339(-16777216);
        this.field3029 = arg0.method339(-16777216);
        this.field3031 = new class30();
        this.field3020 = new class265();
        this.field3031.method281(arg0, this.field3020);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "()V")
    public static void method1201() {
        field3035 = null;
        field3030 = null;
        field3026 = null;
        field3036 = null;
        field3040 = null;
        field3039 = null;
        field3037 = null;
        field3038 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)I")
    private final int method1202(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3026[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3030[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)[I")
    public final int[] method1203(int arg0, int arg1) {
        class171.method1187(field3035, 0, arg0);
        if (arg1 < 10) {
            return field3035;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3033.method1767();
        this.field3018.method1767();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3025 != null) {
            this.field3025.method1767();
            this.field3034.method1767();
            var5 = (int) ((double) (this.field3025.field4521 - this.field3025.field4520) * 32.768D / var3);
            var6 = (int) ((double) this.field3025.field4520 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3016 != null) {
            this.field3016.method1767();
            this.field3021.method1767();
            var8 = (int) ((double) (this.field3016.field4521 - this.field3016.field4520) * 32.768D / var3);
            var9 = (int) ((double) this.field3016.field4520 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3019[var11] != 0) {
                field3036[var11] = 0;
                field3040[var11] = (int) ((double) this.field3028[var11] * var3);
                field3039[var11] = (this.field3019[var11] << 14) / 100;
                field3037[var11] = (int) ((double) (this.field3033.field4521 - this.field3033.field4520) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3032[var11]) / var3);
                field3038[var11] = (int) ((double) this.field3033.field4520 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3033.method1768(arg0);
            int var40 = this.field3018.method1768(arg0);
            if (this.field3025 != null) {
                int var41 = this.field3025.method1768(arg0);
                int var42 = this.field3034.method1768(arg0);
                var39 += this.method1202(var7, var42, this.field3025.field4522) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3016 != null) {
                int var43 = this.field3016.method1768(arg0);
                int var44 = this.field3021.method1768(arg0);
                var40 = var40 * ((this.method1202(var10, var44, this.field3016.field4522) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3019[var45] != 0) {
                    int var46 = field3040[var45] + var12;
                    if (var46 < arg0) {
                        field3035[var46] += this.method1202(field3036[var45], field3039[var45] * var40 >> 15, this.field3033.field4522);
                        field3036[var45] += (field3037[var45] * var39 >> 16) + field3038[var45];
                    }
                }
            }
        }
        if (this.field3023 != null) {
            this.field3023.method1767();
            this.field3017.method1767();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3023.method1768(arg0);
                int var18 = this.field3017.method1768(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3023.field4521 - this.field3023.field4520) * var17 >> 8) + this.field3023.field4520;
                } else {
                    var19 = ((this.field3023.field4521 - this.field3023.field4520) * var18 >> 8) + this.field3023.field4520;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3035[var16] = 0;
                }
            }
        }
        if (this.field3022 > 0 && this.field3027 > 0) {
            int var20 = (int) ((double) this.field3022 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3035[var21] += field3035[var21 - var20] * this.field3027 / 100;
            }
        }
        if (this.field3031.field610[0] > 0 || this.field3031.field610[1] > 0) {
            this.field3020.method1767();
            int var22 = this.field3020.method1768(arg0 + 1);
            int var23 = this.field3031.method284(0, (float) var22 / 65536.0F);
            int var24 = this.field3031.method284(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3035[var23 + var25] * (long) class30.field606 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3035[var23 + var25 - var36 - 1] * (long) class30.field605[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3035[var25 - var37 - 1] * (long) class30.field605[1][var37] >> 16);
                    }
                    field3035[var25] = var35;
                    var22 = this.field3020.method1768(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3035[var23 + var25] * (long) class30.field606 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3035[var23 + var25 - var33 - 1] * (long) class30.field605[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3035[var25 - var34 - 1] * (long) class30.field605[1][var34] >> 16);
                        }
                        field3035[var25] = var32;
                        var22 = this.field3020.method1768(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3035[var23 + var25 - var29 - 1] * (long) class30.field605[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3035[var25 - var30 - 1] * (long) class30.field605[1][var30] >> 16);
                            }
                            field3035[var25] = var28;
                            this.field3020.method1768(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3031.method284(0, (float) var22 / 65536.0F);
                    var24 = this.field3031.method284(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3035[var38] < -32768) {
                field3035[var38] = -32768;
            }
            if (field3035[var38] > 32767) {
                field3035[var38] = 32767;
            }
        }
        return field3035;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3030[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3026 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3026[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3035 = new int[220500];
        field3036 = new int[5];
        field3038 = new int[5];
        field3037 = new int[5];
        field3039 = new int[5];
        field3040 = new int[5];
    }
}
