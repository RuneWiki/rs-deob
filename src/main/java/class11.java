import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class11 {

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public int field171 = 500;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    private int field172 = 0;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "[I")
    private int[] field176 = new int[5];

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public int field183 = 0;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "[I")
    private int[] field187 = new int[5];

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    private int field182 = 100;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "[I")
    private int[] field192 = new int[5];

    @OriginalMember(owner = "client!b", name = "a", descriptor = "[I")
    private static int[] field168 = new int[32768];

    @OriginalMember(owner = "client!b", name = "f", descriptor = "[I")
    private static int[] field173;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "[I")
    private static int[] field170;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "[I")
    private static int[] field178;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "[I")
    private static int[] field185;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "[I")
    private static int[] field184;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "[I")
    private static int[] field191;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "[I")
    private static int[] field188;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Lvh;")
    private class198 field169;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Lvh;")
    private class198 field174;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Lvh;")
    private class198 field175;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Lvh;")
    private class198 field179;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Lvh;")
    private class198 field180;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Lvh;")
    private class198 field181;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "Lvh;")
    private class198 field186;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "Lvh;")
    private class198 field189;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "Lvh;")
    private class198 field190;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Lje;")
    private class87 field177;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lrd;)V")
    public final void method56(class158 arg0) {
        this.field175 = new class198();
        this.field175.method1265(arg0);
        this.field180 = new class198();
        this.field180.method1265(arg0);
        int var2 = arg0.method1054(128);
        if (var2 != 0) {
            arg0.field3153--;
            this.field190 = new class198();
            this.field190.method1265(arg0);
            this.field189 = new class198();
            this.field189.method1265(arg0);
        }
        int var3 = arg0.method1054(128);
        if (var3 != 0) {
            arg0.field3153--;
            this.field186 = new class198();
            this.field186.method1265(arg0);
            this.field179 = new class198();
            this.field179.method1265(arg0);
        }
        int var4 = arg0.method1054(128);
        if (var4 != 0) {
            arg0.field3153--;
            this.field169 = new class198();
            this.field169.method1265(arg0);
            this.field181 = new class198();
            this.field181.method1265(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1072(-25182);
            if (var6 == 0) {
                break;
            }
            this.field192[var5] = var6;
            this.field187[var5] = arg0.method1079((byte) 126);
            this.field176[var5] = arg0.method1072(-25182);
        }
        this.field172 = arg0.method1072(-25182);
        this.field182 = arg0.method1072(-25182);
        this.field171 = arg0.method1071(28101);
        this.field183 = arg0.method1071(28101);
        this.field177 = new class87();
        this.field174 = new class198();
        this.field177.method440(arg0, this.field174);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)I")
    private final int method57(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field173[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field168[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V")
    public static void method58() {
        field170 = null;
        field168 = null;
        field173 = null;
        field191 = null;
        field188 = null;
        field178 = null;
        field184 = null;
        field185 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)[I")
    public final int[] method59(int arg0, int arg1) {
        class90.method473(field170, 0, arg0);
        if (arg1 < 10) {
            return field170;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field175.method1266();
        this.field180.method1266();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field190 != null) {
            this.field190.method1266();
            this.field189.method1266();
            var5 = (int) ((double) (this.field190.field3846 - this.field190.field3849) * 32.768D / var3);
            var6 = (int) ((double) this.field190.field3849 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field186 != null) {
            this.field186.method1266();
            this.field179.method1266();
            var8 = (int) ((double) (this.field186.field3846 - this.field186.field3849) * 32.768D / var3);
            var9 = (int) ((double) this.field186.field3849 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field192[var11] != 0) {
                field191[var11] = 0;
                field188[var11] = (int) ((double) this.field176[var11] * var3);
                field178[var11] = (this.field192[var11] << 14) / 100;
                field184[var11] = (int) ((double) (this.field175.field3846 - this.field175.field3849) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field187[var11]) / var3);
                field185[var11] = (int) ((double) this.field175.field3849 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field175.method1267(arg0);
            int var40 = this.field180.method1267(arg0);
            if (this.field190 != null) {
                int var41 = this.field190.method1267(arg0);
                int var42 = this.field189.method1267(arg0);
                var39 += this.method57(var7, var42, this.field190.field3848) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field186 != null) {
                int var43 = this.field186.method1267(arg0);
                int var44 = this.field179.method1267(arg0);
                var40 = var40 * ((this.method57(var10, var44, this.field186.field3848) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field192[var45] != 0) {
                    int var46 = field188[var45] + var12;
                    if (var46 < arg0) {
                        field170[var46] += this.method57(field191[var45], field178[var45] * var40 >> 15, this.field175.field3848);
                        field191[var45] += (field184[var45] * var39 >> 16) + field185[var45];
                    }
                }
            }
        }
        if (this.field169 != null) {
            this.field169.method1266();
            this.field181.method1266();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field169.method1267(arg0);
                int var18 = this.field181.method1267(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field169.field3846 - this.field169.field3849) * var17 >> 8) + this.field169.field3849;
                } else {
                    var19 = ((this.field169.field3846 - this.field169.field3849) * var18 >> 8) + this.field169.field3849;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field170[var16] = 0;
                }
            }
        }
        if (this.field172 > 0 && this.field182 > 0) {
            int var20 = (int) ((double) this.field172 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field170[var21] += field170[var21 - var20] * this.field182 / 100;
            }
        }
        if (this.field177.field1588[0] > 0 || this.field177.field1588[1] > 0) {
            this.field174.method1266();
            int var22 = this.field174.method1267(arg0 + 1);
            int var23 = this.field177.method438(0, (float) var22 / 65536.0F);
            int var24 = this.field177.method438(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field170[var23 + var25] * (long) class87.field1587 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field170[var23 + var25 - var36 - 1] * (long) class87.field1584[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field170[var25 - var37 - 1] * (long) class87.field1584[1][var37] >> 16);
                    }
                    field170[var25] = var35;
                    var22 = this.field174.method1267(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field170[var23 + var25] * (long) class87.field1587 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field170[var23 + var25 - var33 - 1] * (long) class87.field1584[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field170[var25 - var34 - 1] * (long) class87.field1584[1][var34] >> 16);
                        }
                        field170[var25] = var32;
                        var22 = this.field174.method1267(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field170[var23 + var25 - var29 - 1] * (long) class87.field1584[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field170[var25 - var30 - 1] * (long) class87.field1584[1][var30] >> 16);
                            }
                            field170[var25] = var28;
                            this.field174.method1267(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field177.method438(0, (float) var22 / 65536.0F);
                    var24 = this.field177.method438(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field170[var38] < -32768) {
                field170[var38] = -32768;
            }
            if (field170[var38] > 32767) {
                field170[var38] = 32767;
            }
        }
        return field170;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field168[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field173 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field173[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field170 = new int[220500];
        field178 = new int[5];
        field185 = new int[5];
        field184 = new int[5];
        field191 = new int[5];
        field188 = new int[5];
    }
}
