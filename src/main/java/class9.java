import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class9 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public int field94 = 500;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "[I")
    private int[] field100 = new int[5];

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public int field104 = 0;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "[I")
    private int[] field97 = new int[5];

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "[I")
    private int[] field108 = new int[5];

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    private int field96 = 100;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    private int field106 = 0;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "[I")
    private static int[] field111 = new int[32768];

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "[I")
    private static int[] field103;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "[I")
    private static int[] field107;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "[I")
    private static int[] field112;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "[I")
    private static int[] field114;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "[I")
    private static int[] field115;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "[I")
    private static int[] field116;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "[I")
    private static int[] field117;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Lac;")
    private class200 field99;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "Lfr;")
    private class436 field101;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "Lfr;")
    private class436 field102;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Lfr;")
    private class436 field105;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Lfr;")
    private class436 field109;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Lfr;")
    private class436 field110;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "Lfr;")
    private class436 field113;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "Lfr;")
    private class436 field118;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Lfr;")
    private class436 field95;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Lfr;")
    private class436 field98;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)I")
    private final int method66(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field103[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field111[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lef;)V")
    public final void method67(class385 arg0) {
        this.field109 = new class436();
        this.field109.method2676(arg0);
        this.field118 = new class436();
        this.field118.method2676(arg0);
        int var2 = arg0.method2343(255);
        if (var2 != 0) {
            arg0.field5666--;
            this.field101 = new class436();
            this.field101.method2676(arg0);
            this.field98 = new class436();
            this.field98.method2676(arg0);
        }
        int var3 = arg0.method2343(255);
        if (var3 != 0) {
            arg0.field5666--;
            this.field110 = new class436();
            this.field110.method2676(arg0);
            this.field95 = new class436();
            this.field95.method2676(arg0);
        }
        int var4 = arg0.method2343(255);
        if (var4 != 0) {
            arg0.field5666--;
            this.field113 = new class436();
            this.field113.method2676(arg0);
            this.field105 = new class436();
            this.field105.method2676(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2372(true);
            if (var6 == 0) {
                break;
            }
            this.field97[var5] = var6;
            this.field100[var5] = arg0.method2342((byte) -46);
            this.field108[var5] = arg0.method2372(true);
        }
        this.field106 = arg0.method2372(true);
        this.field96 = arg0.method2372(true);
        this.field94 = arg0.method2323(-29);
        this.field104 = arg0.method2323(-91);
        this.field99 = new class200();
        this.field102 = new class436();
        this.field99.method1198(arg0, this.field102);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[I")
    public final int[] method68(int arg0, int arg1) {
        class129.method763(field107, 0, arg0);
        if (arg1 < 10) {
            return field107;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field109.method2678();
        this.field118.method2678();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field101 != null) {
            this.field101.method2678();
            this.field98.method2678();
            var5 = (int) ((double) (this.field101.field6417 - this.field101.field6418) * 32.768D / var3);
            var6 = (int) ((double) this.field101.field6418 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field110 != null) {
            this.field110.method2678();
            this.field95.method2678();
            var8 = (int) ((double) (this.field110.field6417 - this.field110.field6418) * 32.768D / var3);
            var9 = (int) ((double) this.field110.field6418 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field97[var11] != 0) {
                field116[var11] = 0;
                field115[var11] = (int) ((double) this.field108[var11] * var3);
                field114[var11] = (this.field97[var11] << 14) / 100;
                field112[var11] = (int) ((double) (this.field109.field6417 - this.field109.field6418) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field100[var11]) / var3);
                field117[var11] = (int) ((double) this.field109.field6418 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field109.method2679(arg0);
            int var40 = this.field118.method2679(arg0);
            if (this.field101 != null) {
                int var41 = this.field101.method2679(arg0);
                int var42 = this.field98.method2679(arg0);
                var39 += this.method66(var7, var42, this.field101.field6413) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field110 != null) {
                int var43 = this.field110.method2679(arg0);
                int var44 = this.field95.method2679(arg0);
                var40 = var40 * ((this.method66(var10, var44, this.field110.field6413) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field97[var45] != 0) {
                    int var46 = field115[var45] + var12;
                    if (var46 < arg0) {
                        field107[var46] += this.method66(field116[var45], field114[var45] * var40 >> 15, this.field109.field6413);
                        field116[var45] += (field112[var45] * var39 >> 16) + field117[var45];
                    }
                }
            }
        }
        if (this.field113 != null) {
            this.field113.method2678();
            this.field105.method2678();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field113.method2679(arg0);
                int var18 = this.field105.method2679(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field113.field6417 - this.field113.field6418) * var17 >> 8) + this.field113.field6418;
                } else {
                    var19 = ((this.field113.field6417 - this.field113.field6418) * var18 >> 8) + this.field113.field6418;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field107[var16] = 0;
                }
            }
        }
        if (this.field106 > 0 && this.field96 > 0) {
            int var20 = (int) ((double) this.field106 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field107[var21] += field107[var21 - var20] * this.field96 / 100;
            }
        }
        if (this.field99.field3012[0] > 0 || this.field99.field3012[1] > 0) {
            this.field102.method2678();
            int var22 = this.field102.method2679(arg0 + 1);
            int var23 = this.field99.method1195(0, (float) var22 / 65536.0F);
            int var24 = this.field99.method1195(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field107[var23 + var25] * (long) class200.field3015 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field107[var23 + var25 - var36 - 1] * (long) class200.field3010[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field107[var25 - var37 - 1] * (long) class200.field3010[1][var37] >> 16);
                    }
                    field107[var25] = var35;
                    var22 = this.field102.method2679(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field107[var23 + var25] * (long) class200.field3015 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field107[var23 + var25 - var33 - 1] * (long) class200.field3010[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field107[var25 - var34 - 1] * (long) class200.field3010[1][var34] >> 16);
                        }
                        field107[var25] = var32;
                        var22 = this.field102.method2679(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field107[var23 + var25 - var29 - 1] * (long) class200.field3010[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field107[var25 - var30 - 1] * (long) class200.field3010[1][var30] >> 16);
                            }
                            field107[var25] = var28;
                            this.field102.method2679(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field99.method1195(0, (float) var22 / 65536.0F);
                    var24 = this.field99.method1195(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field107[var38] < -32768) {
                field107[var38] = -32768;
            }
            if (field107[var38] > 32767) {
                field107[var38] = 32767;
            }
        }
        return field107;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "()V")
    public static void method69() {
        field107 = null;
        field111 = null;
        field103 = null;
        field116 = null;
        field115 = null;
        field114 = null;
        field112 = null;
        field117 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field111[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field103 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field103[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field107 = new int[220500];
        field112 = new int[5];
        field114 = new int[5];
        field115 = new int[5];
        field116 = new int[5];
        field117 = new int[5];
    }
}
