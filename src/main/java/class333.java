import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class333 {

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "[I")
    private int[] field5203 = new int[5];

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "[I")
    private int[] field5206 = new int[5];

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
    private int field5199 = 100;

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
    public int field5204 = 0;

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "[I")
    private int[] field5213 = new int[5];

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "I")
    private int field5214 = 0;

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "I")
    public int field5207 = 500;

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "[I")
    private static int[] field5208 = new int[32768];

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "[I")
    private static int[] field5216;

    @OriginalMember(owner = "client!tv", name = "m", descriptor = "[I")
    private static int[] field5209;

    @OriginalMember(owner = "client!tv", name = "v", descriptor = "[I")
    private static int[] field5218;

    @OriginalMember(owner = "client!tv", name = "w", descriptor = "[I")
    private static int[] field5219;

    @OriginalMember(owner = "client!tv", name = "x", descriptor = "[I")
    private static int[] field5220;

    @OriginalMember(owner = "client!tv", name = "y", descriptor = "[I")
    private static int[] field5221;

    @OriginalMember(owner = "client!tv", name = "u", descriptor = "[I")
    private static int[] field5217;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "Lls;")
    private class111 field5197;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "Lls;")
    private class111 field5198;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "Lls;")
    private class111 field5200;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "Lls;")
    private class111 field5201;

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "Lls;")
    private class111 field5202;

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "Lls;")
    private class111 field5210;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "Lls;")
    private class111 field5211;

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "Lls;")
    private class111 field5212;

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "Lls;")
    private class111 field5215;

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "Lku;")
    private class145 field5205;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(II)[I")
    public final int[] method2215(int arg0, int arg1) {
        class324.method2171(field5209, 0, arg0);
        if (arg1 < 10) {
            return field5209;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field5200.method721();
        this.field5215.method721();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field5212 != null) {
            this.field5212.method721();
            this.field5211.method721();
            var5 = (int) ((double) (this.field5212.field1564 - this.field5212.field1565) * 32.768D / var3);
            var6 = (int) ((double) this.field5212.field1565 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field5210 != null) {
            this.field5210.method721();
            this.field5202.method721();
            var8 = (int) ((double) (this.field5210.field1564 - this.field5210.field1565) * 32.768D / var3);
            var9 = (int) ((double) this.field5210.field1565 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field5206[var11] != 0) {
                field5219[var11] = 0;
                field5220[var11] = (int) ((double) this.field5213[var11] * var3);
                field5218[var11] = (this.field5206[var11] << 14) / 100;
                field5217[var11] = (int) ((double) (this.field5200.field1564 - this.field5200.field1565) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field5203[var11]) / var3);
                field5221[var11] = (int) ((double) this.field5200.field1565 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field5200.method724(arg0);
            int var40 = this.field5215.method724(arg0);
            if (this.field5212 != null) {
                int var41 = this.field5212.method724(arg0);
                int var42 = this.field5211.method724(arg0);
                var39 += this.method2216(var7, var42, this.field5212.field1562) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field5210 != null) {
                int var43 = this.field5210.method724(arg0);
                int var44 = this.field5202.method724(arg0);
                var40 = var40 * ((this.method2216(var10, var44, this.field5210.field1562) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field5206[var45] != 0) {
                    int var46 = field5220[var45] + var12;
                    if (var46 < arg0) {
                        field5209[var46] += this.method2216(field5219[var45], field5218[var45] * var40 >> 15, this.field5200.field1562);
                        field5219[var45] += (field5217[var45] * var39 >> 16) + field5221[var45];
                    }
                }
            }
        }
        if (this.field5201 != null) {
            this.field5201.method721();
            this.field5198.method721();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field5201.method724(arg0);
                int var18 = this.field5198.method724(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field5201.field1564 - this.field5201.field1565) * var17 >> 8) + this.field5201.field1565;
                } else {
                    var19 = ((this.field5201.field1564 - this.field5201.field1565) * var18 >> 8) + this.field5201.field1565;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field5209[var16] = 0;
                }
            }
        }
        if (this.field5214 > 0 && this.field5199 > 0) {
            int var20 = (int) ((double) this.field5214 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field5209[var21] += field5209[var21 - var20] * this.field5199 / 100;
            }
        }
        if (this.field5205.field1948[0] > 0 || this.field5205.field1948[1] > 0) {
            this.field5197.method721();
            int var22 = this.field5197.method724(arg0 + 1);
            int var23 = this.field5205.method870(0, (float) var22 / 65536.0F);
            int var24 = this.field5205.method870(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field5209[var23 + var25] * (long) class145.field1946 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field5209[var23 + var25 - var36 - 1] * (long) class145.field1945[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field5209[var25 - var37 - 1] * (long) class145.field1945[1][var37] >> 16);
                    }
                    field5209[var25] = var35;
                    var22 = this.field5197.method724(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field5209[var23 + var25] * (long) class145.field1946 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field5209[var23 + var25 - var33 - 1] * (long) class145.field1945[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field5209[var25 - var34 - 1] * (long) class145.field1945[1][var34] >> 16);
                        }
                        field5209[var25] = var32;
                        var22 = this.field5197.method724(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field5209[var23 + var25 - var29 - 1] * (long) class145.field1945[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field5209[var25 - var30 - 1] * (long) class145.field1945[1][var30] >> 16);
                            }
                            field5209[var25] = var28;
                            this.field5197.method724(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field5205.method870(0, (float) var22 / 65536.0F);
                    var24 = this.field5205.method870(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field5209[var38] < -32768) {
                field5209[var38] = -32768;
            }
            if (field5209[var38] > 32767) {
                field5209[var38] = 32767;
            }
        }
        return field5209;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(III)I")
    private final int method2216(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field5216[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field5208[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lhw;)V")
    public final void method2217(class208 arg0) {
        this.field5200 = new class111();
        this.field5200.method723(arg0);
        this.field5215 = new class111();
        this.field5215.method723(arg0);
        int var2 = arg0.method1445(114);
        if (var2 != 0) {
            arg0.field3162--;
            this.field5212 = new class111();
            this.field5212.method723(arg0);
            this.field5211 = new class111();
            this.field5211.method723(arg0);
        }
        int var3 = arg0.method1445(103);
        if (var3 != 0) {
            arg0.field3162--;
            this.field5210 = new class111();
            this.field5210.method723(arg0);
            this.field5202 = new class111();
            this.field5202.method723(arg0);
        }
        int var4 = arg0.method1445(61);
        if (var4 != 0) {
            arg0.field3162--;
            this.field5201 = new class111();
            this.field5201.method723(arg0);
            this.field5198 = new class111();
            this.field5198.method723(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1481(false);
            if (var6 == 0) {
                break;
            }
            this.field5206[var5] = var6;
            this.field5203[var5] = arg0.method1441(-489);
            this.field5213[var5] = arg0.method1481(false);
        }
        this.field5214 = arg0.method1481(false);
        this.field5199 = arg0.method1481(false);
        this.field5207 = arg0.method1455(-3387);
        this.field5204 = arg0.method1455(-3387);
        this.field5205 = new class145();
        this.field5197 = new class111();
        this.field5205.method874(arg0, this.field5197);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "()V")
    public static void method2218() {
        field5209 = null;
        field5208 = null;
        field5216 = null;
        field5219 = null;
        field5220 = null;
        field5218 = null;
        field5217 = null;
        field5221 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field5208[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field5216 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field5216[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field5209 = new int[220500];
        field5218 = new int[5];
        field5219 = new int[5];
        field5220 = new int[5];
        field5221 = new int[5];
        field5217 = new int[5];
    }
}
