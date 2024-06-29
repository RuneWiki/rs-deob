import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class14 {

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "[I")
    private int[] field130 = new int[5];

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    private int field138 = 0;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public int field132 = 500;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    private int field141 = 100;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "[I")
    private int[] field146 = new int[5];

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "[I")
    private int[] field150 = new int[5];

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public int field144 = 0;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "[I")
    private static int[] field145 = new int[32768];

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "[I")
    private static int[] field133;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "[I")
    private static int[] field142;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "[I")
    private static int[] field151;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "[I")
    private static int[] field152;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "[I")
    private static int[] field153;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "[I")
    private static int[] field154;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "[I")
    private static int[] field149;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "Ltj;")
    private class274 field140;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "Lri;")
    private class66 field131;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "Lri;")
    private class66 field134;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Lri;")
    private class66 field135;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "Lri;")
    private class66 field136;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "Lri;")
    private class66 field137;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "Lri;")
    private class66 field139;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "Lri;")
    private class66 field143;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "Lri;")
    private class66 field147;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "Lri;")
    private class66 field148;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)[I")
    public final int[] method92(int arg0, int arg1) {
        class241.method1572(field142, 0, arg0);
        if (arg1 < 10) {
            return field142;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field148.method436();
        this.field139.method436();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field147 != null) {
            this.field147.method436();
            this.field131.method436();
            var5 = (int) ((double) (this.field147.field1111 - this.field147.field1110) * 32.768D / var3);
            var6 = (int) ((double) this.field147.field1110 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field136 != null) {
            this.field136.method436();
            this.field143.method436();
            var8 = (int) ((double) (this.field136.field1111 - this.field136.field1110) * 32.768D / var3);
            var9 = (int) ((double) this.field136.field1110 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field130[var11] != 0) {
                field151[var11] = 0;
                field154[var11] = (int) ((double) this.field146[var11] * var3);
                field149[var11] = (this.field130[var11] << 14) / 100;
                field152[var11] = (int) ((double) (this.field148.field1111 - this.field148.field1110) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field150[var11]) / var3);
                field153[var11] = (int) ((double) this.field148.field1110 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field148.method438(arg0);
            int var40 = this.field139.method438(arg0);
            if (this.field147 != null) {
                int var41 = this.field147.method438(arg0);
                int var42 = this.field131.method438(arg0);
                var39 += this.method93(var7, var42, this.field147.field1115) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field136 != null) {
                int var43 = this.field136.method438(arg0);
                int var44 = this.field143.method438(arg0);
                var40 = var40 * ((this.method93(var10, var44, this.field136.field1115) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field130[var45] != 0) {
                    int var46 = field154[var45] + var12;
                    if (var46 < arg0) {
                        field142[var46] += this.method93(field151[var45], field149[var45] * var40 >> 15, this.field148.field1115);
                        field151[var45] += (field152[var45] * var39 >> 16) + field153[var45];
                    }
                }
            }
        }
        if (this.field134 != null) {
            this.field134.method436();
            this.field135.method436();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field134.method438(arg0);
                int var18 = this.field135.method438(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field134.field1111 - this.field134.field1110) * var17 >> 8) + this.field134.field1110;
                } else {
                    var19 = ((this.field134.field1111 - this.field134.field1110) * var18 >> 8) + this.field134.field1110;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field142[var16] = 0;
                }
            }
        }
        if (this.field138 > 0 && this.field141 > 0) {
            int var20 = (int) ((double) this.field138 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field142[var21] += field142[var21 - var20] * this.field141 / 100;
            }
        }
        if (this.field140.field4839[0] > 0 || this.field140.field4839[1] > 0) {
            this.field137.method436();
            int var22 = this.field137.method438(arg0 + 1);
            int var23 = this.field140.method1820(0, (float) var22 / 65536.0F);
            int var24 = this.field140.method1820(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field142[var23 + var25] * (long) class274.field4838 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field142[var23 + var25 - var36 - 1] * (long) class274.field4837[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field142[var25 - var37 - 1] * (long) class274.field4837[1][var37] >> 16);
                    }
                    field142[var25] = var35;
                    var22 = this.field137.method438(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field142[var23 + var25] * (long) class274.field4838 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field142[var23 + var25 - var33 - 1] * (long) class274.field4837[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field142[var25 - var34 - 1] * (long) class274.field4837[1][var34] >> 16);
                        }
                        field142[var25] = var32;
                        var22 = this.field137.method438(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field142[var23 + var25 - var29 - 1] * (long) class274.field4837[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field142[var25 - var30 - 1] * (long) class274.field4837[1][var30] >> 16);
                            }
                            field142[var25] = var28;
                            this.field137.method438(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field140.method1820(0, (float) var22 / 65536.0F);
                    var24 = this.field140.method1820(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field142[var38] < -32768) {
                field142[var38] = -32768;
            }
            if (field142[var38] > 32767) {
                field142[var38] = 32767;
            }
        }
        return field142;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)I")
    private final int method93(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field133[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field145[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lik;)V")
    public final void method94(class261 arg0) {
        this.field148 = new class66();
        this.field148.method439(arg0);
        this.field139 = new class66();
        this.field139.method439(arg0);
        int var2 = arg0.method1693((byte) -112);
        if (var2 != 0) {
            arg0.field4587--;
            this.field147 = new class66();
            this.field147.method439(arg0);
            this.field131 = new class66();
            this.field131.method439(arg0);
        }
        int var3 = arg0.method1693((byte) -79);
        if (var3 != 0) {
            arg0.field4587--;
            this.field136 = new class66();
            this.field136.method439(arg0);
            this.field143 = new class66();
            this.field143.method439(arg0);
        }
        int var4 = arg0.method1693((byte) 123);
        if (var4 != 0) {
            arg0.field4587--;
            this.field134 = new class66();
            this.field134.method439(arg0);
            this.field135 = new class66();
            this.field135.method439(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1742(-957401312);
            if (var6 == 0) {
                break;
            }
            this.field130[var5] = var6;
            this.field150[var5] = arg0.method1728(31597);
            this.field146[var5] = arg0.method1742(-957401312);
        }
        this.field138 = arg0.method1742(-957401312);
        this.field141 = arg0.method1742(-957401312);
        this.field132 = arg0.method1740((byte) 51);
        this.field144 = arg0.method1740((byte) 106);
        this.field140 = new class274();
        this.field137 = new class66();
        this.field140.method1825(arg0, this.field137);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "()V")
    public static void method95() {
        field142 = null;
        field145 = null;
        field133 = null;
        field151 = null;
        field154 = null;
        field149 = null;
        field152 = null;
        field153 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field145[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field133 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field133[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field142 = new int[220500];
        field151 = new int[5];
        field152 = new int[5];
        field153 = new int[5];
        field154 = new int[5];
        field149 = new int[5];
    }
}
