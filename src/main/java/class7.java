import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class7 {

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    private int field94 = 100;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public int field100 = 500;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    private int field108 = 0;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "[I")
    private int[] field107 = new int[5];

    @OriginalMember(owner = "client!l", name = "s", descriptor = "[I")
    private int[] field111 = new int[5];

    @OriginalMember(owner = "client!l", name = "q", descriptor = "[I")
    private int[] field109 = new int[5];

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public int field101 = 0;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "[I")
    private static int[] field105 = new int[32768];

    @OriginalMember(owner = "client!l", name = "c", descriptor = "[I")
    private static int[] field95;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "[I")
    private static int[] field112;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "[I")
    private static int[] field114;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "[I")
    private static int[] field116;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "[I")
    private static int[] field117;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "[I")
    private static int[] field115;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "[I")
    private static int[] field113;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "Lod;")
    private class175 field102;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Lod;")
    private class175 field103;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Lod;")
    private class175 field104;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "Lod;")
    private class175 field110;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Lod;")
    private class175 field93;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Lod;")
    private class175 field96;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Lod;")
    private class175 field97;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "Lod;")
    private class175 field98;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Lod;")
    private class175 field99;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Lia;")
    private class209 field106;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Llj;)V")
    public final void method42(class216 arg0) {
        this.field102 = new class175();
        this.field102.method1225(arg0);
        this.field103 = new class175();
        this.field103.method1225(arg0);
        int var2 = arg0.method1446(5350);
        if (var2 != 0) {
            arg0.field3728--;
            this.field96 = new class175();
            this.field96.method1225(arg0);
            this.field97 = new class175();
            this.field97.method1225(arg0);
        }
        int var3 = arg0.method1446(5350);
        if (var3 != 0) {
            arg0.field3728--;
            this.field99 = new class175();
            this.field99.method1225(arg0);
            this.field110 = new class175();
            this.field110.method1225(arg0);
        }
        int var4 = arg0.method1446(5350);
        if (var4 != 0) {
            arg0.field3728--;
            this.field104 = new class175();
            this.field104.method1225(arg0);
            this.field98 = new class175();
            this.field98.method1225(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1482(26084);
            if (var6 == 0) {
                break;
            }
            this.field109[var5] = var6;
            this.field111[var5] = arg0.method1473(107);
            this.field107[var5] = arg0.method1482(26084);
        }
        this.field108 = arg0.method1482(26084);
        this.field94 = arg0.method1482(26084);
        this.field100 = arg0.method1487(46);
        this.field101 = arg0.method1487(103);
        this.field106 = new class209();
        this.field93 = new class175();
        this.field106.method1405(arg0, this.field93);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        class66.method464(field112, 0, arg0);
        if (arg1 < 10) {
            return field112;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field102.method1222();
        this.field103.method1222();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field96 != null) {
            this.field96.method1222();
            this.field97.method1222();
            var5 = (int) ((double) (this.field96.field3051 - this.field96.field3054) * 32.768D / var3);
            var6 = (int) ((double) this.field96.field3054 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field99 != null) {
            this.field99.method1222();
            this.field110.method1222();
            var8 = (int) ((double) (this.field99.field3051 - this.field99.field3054) * 32.768D / var3);
            var9 = (int) ((double) this.field99.field3054 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field109[var11] != 0) {
                field113[var11] = 0;
                field114[var11] = (int) ((double) this.field107[var11] * var3);
                field117[var11] = (this.field109[var11] << 14) / 100;
                field116[var11] = (int) ((double) (this.field102.field3051 - this.field102.field3054) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field111[var11]) / var3);
                field115[var11] = (int) ((double) this.field102.field3054 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field102.method1224(arg0);
            int var40 = this.field103.method1224(arg0);
            if (this.field96 != null) {
                int var41 = this.field96.method1224(arg0);
                int var42 = this.field97.method1224(arg0);
                var39 += this.method45(var7, var42, this.field96.field3055) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field99 != null) {
                int var43 = this.field99.method1224(arg0);
                int var44 = this.field110.method1224(arg0);
                var40 = var40 * ((this.method45(var10, var44, this.field99.field3055) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field109[var45] != 0) {
                    int var46 = field114[var45] + var12;
                    if (var46 < arg0) {
                        field112[var46] += this.method45(field113[var45], field117[var45] * var40 >> 15, this.field102.field3055);
                        field113[var45] += (field116[var45] * var39 >> 16) + field115[var45];
                    }
                }
            }
        }
        if (this.field104 != null) {
            this.field104.method1222();
            this.field98.method1222();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field104.method1224(arg0);
                int var18 = this.field98.method1224(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field104.field3051 - this.field104.field3054) * var17 >> 8) + this.field104.field3054;
                } else {
                    var19 = ((this.field104.field3051 - this.field104.field3054) * var18 >> 8) + this.field104.field3054;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field112[var16] = 0;
                }
            }
        }
        if (this.field108 > 0 && this.field94 > 0) {
            int var20 = (int) ((double) this.field108 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field112[var21] += field112[var21 - var20] * this.field94 / 100;
            }
        }
        if (this.field106.field3594[0] > 0 || this.field106.field3594[1] > 0) {
            this.field93.method1222();
            int var22 = this.field93.method1224(arg0 + 1);
            int var23 = this.field106.method1409(0, (float) var22 / 65536.0F);
            int var24 = this.field106.method1409(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field112[var23 + var25] * (long) class209.field3592 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field112[var23 + var25 - var36 - 1] * (long) class209.field3589[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field112[var25 - var37 - 1] * (long) class209.field3589[1][var37] >> 16);
                    }
                    field112[var25] = var35;
                    var22 = this.field93.method1224(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field112[var23 + var25] * (long) class209.field3592 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field112[var23 + var25 - var33 - 1] * (long) class209.field3589[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field112[var25 - var34 - 1] * (long) class209.field3589[1][var34] >> 16);
                        }
                        field112[var25] = var32;
                        var22 = this.field93.method1224(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field112[var23 + var25 - var29 - 1] * (long) class209.field3589[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field112[var25 - var30 - 1] * (long) class209.field3589[1][var30] >> 16);
                            }
                            field112[var25] = var28;
                            this.field93.method1224(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field106.method1409(0, (float) var22 / 65536.0F);
                    var24 = this.field106.method1409(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field112[var38] < -32768) {
                field112[var38] = -32768;
            }
            if (field112[var38] > 32767) {
                field112[var38] = 32767;
            }
        }
        return field112;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()V")
    public static void method44() {
        field112 = null;
        field105 = null;
        field95 = null;
        field113 = null;
        field114 = null;
        field117 = null;
        field116 = null;
        field115 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)I")
    private final int method45(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field95[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field105[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field105[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field95 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field95[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field112 = new int[220500];
        field114 = new int[5];
        field116 = new int[5];
        field117 = new int[5];
        field115 = new int[5];
        field113 = new int[5];
    }
}
