import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class7 {

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    private int field98 = 100;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public int field94 = 0;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "[I")
    private int[] field99 = new int[5];

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "[I")
    private int[] field104 = new int[5];

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public int field95 = 500;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "[I")
    private int[] field96 = new int[5];

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    private int field110 = 0;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "[I")
    private static int[] field101 = new int[32768];

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "[I")
    private static int[] field100;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "[I")
    private static int[] field111;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "[I")
    private static int[] field115;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "[I")
    private static int[] field114;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "[I")
    private static int[] field113;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "[I")
    private static int[] field117;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "[I")
    private static int[] field116;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "Lnj;")
    private class183 field102;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "Lnj;")
    private class183 field103;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Lnj;")
    private class183 field105;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "Lnj;")
    private class183 field106;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "Lnj;")
    private class183 field108;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "Lnj;")
    private class183 field109;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "Lnj;")
    private class183 field112;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "Lnj;")
    private class183 field93;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Lnj;")
    private class183 field97;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "Lbb;")
    private class43 field107;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)I")
    private final int method27(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field100[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field101[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()V")
    public static void method28() {
        field111 = null;
        field101 = null;
        field100 = null;
        field114 = null;
        field116 = null;
        field117 = null;
        field113 = null;
        field115 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        class154.method1088(field111, 0, arg0);
        if (arg1 < 10) {
            return field111;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field103.method1224();
        this.field102.method1224();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field106 != null) {
            this.field106.method1224();
            this.field112.method1224();
            var5 = (int) ((double) (this.field106.field3136 - this.field106.field3137) * 32.768D / var3);
            var6 = (int) ((double) this.field106.field3137 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field109 != null) {
            this.field109.method1224();
            this.field97.method1224();
            var8 = (int) ((double) (this.field109.field3136 - this.field109.field3137) * 32.768D / var3);
            var9 = (int) ((double) this.field109.field3137 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field96[var11] != 0) {
                field114[var11] = 0;
                field116[var11] = (int) ((double) this.field104[var11] * var3);
                field117[var11] = (this.field96[var11] << 14) / 100;
                field113[var11] = (int) ((double) (this.field103.field3136 - this.field103.field3137) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field99[var11]) / var3);
                field115[var11] = (int) ((double) this.field103.field3137 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field103.method1222(arg0);
            int var40 = this.field102.method1222(arg0);
            if (this.field106 != null) {
                int var41 = this.field106.method1222(arg0);
                int var42 = this.field112.method1222(arg0);
                var39 += this.method27(var7, var42, this.field106.field3133) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field109 != null) {
                int var43 = this.field109.method1222(arg0);
                int var44 = this.field97.method1222(arg0);
                var40 = var40 * ((this.method27(var10, var44, this.field109.field3133) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field96[var45] != 0) {
                    int var46 = field116[var45] + var12;
                    if (var46 < arg0) {
                        field111[var46] += this.method27(field114[var45], field117[var45] * var40 >> 15, this.field103.field3133);
                        field114[var45] += (field113[var45] * var39 >> 16) + field115[var45];
                    }
                }
            }
        }
        if (this.field108 != null) {
            this.field108.method1224();
            this.field93.method1224();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field108.method1222(arg0);
                int var18 = this.field93.method1222(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field108.field3136 - this.field108.field3137) * var17 >> 8) + this.field108.field3137;
                } else {
                    var19 = ((this.field108.field3136 - this.field108.field3137) * var18 >> 8) + this.field108.field3137;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field111[var16] = 0;
                }
            }
        }
        if (this.field110 > 0 && this.field98 > 0) {
            int var20 = (int) ((double) this.field110 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field111[var21] += field111[var21 - var20] * this.field98 / 100;
            }
        }
        if (this.field107.field737[0] > 0 || this.field107.field737[1] > 0) {
            this.field105.method1224();
            int var22 = this.field105.method1222(arg0 + 1);
            int var23 = this.field107.method255(0, (float) var22 / 65536.0F);
            int var24 = this.field107.method255(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field111[var23 + var25] * (long) class43.field734 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field111[var23 + var25 - var36 - 1] * (long) class43.field739[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field111[var25 - var37 - 1] * (long) class43.field739[1][var37] >> 16);
                    }
                    field111[var25] = var35;
                    var22 = this.field105.method1222(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field111[var23 + var25] * (long) class43.field734 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field111[var23 + var25 - var33 - 1] * (long) class43.field739[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field111[var25 - var34 - 1] * (long) class43.field739[1][var34] >> 16);
                        }
                        field111[var25] = var32;
                        var22 = this.field105.method1222(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field111[var23 + var25 - var29 - 1] * (long) class43.field739[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field111[var25 - var30 - 1] * (long) class43.field739[1][var30] >> 16);
                            }
                            field111[var25] = var28;
                            this.field105.method1222(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field107.method255(0, (float) var22 / 65536.0F);
                    var24 = this.field107.method255(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field111[var38] < -32768) {
                field111[var38] = -32768;
            }
            if (field111[var38] > 32767) {
                field111[var38] = 32767;
            }
        }
        return field111;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lij;)V")
    public final void method30(class85 arg0) {
        this.field103 = new class183();
        this.field103.method1223(arg0);
        this.field102 = new class183();
        this.field102.method1223(arg0);
        int var2 = arg0.method564((byte) 55);
        if (var2 != 0) {
            arg0.field1392--;
            this.field106 = new class183();
            this.field106.method1223(arg0);
            this.field112 = new class183();
            this.field112.method1223(arg0);
        }
        int var3 = arg0.method564((byte) 61);
        if (var3 != 0) {
            arg0.field1392--;
            this.field109 = new class183();
            this.field109.method1223(arg0);
            this.field97 = new class183();
            this.field97.method1223(arg0);
        }
        int var4 = arg0.method564((byte) 89);
        if (var4 != 0) {
            arg0.field1392--;
            this.field108 = new class183();
            this.field108.method1223(arg0);
            this.field93 = new class183();
            this.field93.method1223(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method593((byte) -106);
            if (var6 == 0) {
                break;
            }
            this.field96[var5] = var6;
            this.field99[var5] = arg0.method583(255);
            this.field104[var5] = arg0.method593((byte) -106);
        }
        this.field110 = arg0.method593((byte) -106);
        this.field98 = arg0.method593((byte) -106);
        this.field95 = arg0.method608(41);
        this.field94 = arg0.method608(88);
        this.field107 = new class43();
        this.field105 = new class183();
        this.field107.method258(arg0, this.field105);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field101[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field100 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field100[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field111 = new int[220500];
        field115 = new int[5];
        field114 = new int[5];
        field113 = new int[5];
        field117 = new int[5];
        field116 = new int[5];
    }
}
