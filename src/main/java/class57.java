import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class57 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    private int field981 = 0;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public int field987 = 500;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public int field989 = 0;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    private int field993 = 100;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "[I")
    private int[] field986 = new int[5];

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "[I")
    private int[] field991 = new int[5];

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "[I")
    private int[] field994 = new int[5];

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "[I")
    private static int[] field997 = new int[32768];

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "[I")
    private static int[] field990;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "[I")
    private static int[] field984;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "[I")
    private static int[] field1001;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "[I")
    private static int[] field1002;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "[I")
    private static int[] field1003;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "[I")
    private static int[] field1000;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "[I")
    private static int[] field1004;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Lnj;")
    private class192 field985;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "Lbf;")
    private class283 field1005;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Lbf;")
    private class283 field982;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Lbf;")
    private class283 field983;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Lbf;")
    private class283 field988;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "Lbf;")
    private class283 field992;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "Lbf;")
    private class283 field995;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Lbf;")
    private class283 field996;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "Lbf;")
    private class283 field998;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "Lbf;")
    private class283 field999;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()V")
    public static void method393() {
        field984 = null;
        field997 = null;
        field990 = null;
        field1002 = null;
        field1003 = null;
        field1004 = null;
        field1000 = null;
        field1001 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)[I")
    public final int[] method394(int arg0, int arg1) {
        class190.method1372(field984, 0, arg0);
        if (arg1 < 10) {
            return field984;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1005.method1924();
        this.field998.method1924();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field983 != null) {
            this.field983.method1924();
            this.field995.method1924();
            var5 = (int) ((double) (this.field983.field4982 - this.field983.field4985) * 32.768D / var3);
            var6 = (int) ((double) this.field983.field4985 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field996 != null) {
            this.field996.method1924();
            this.field988.method1924();
            var8 = (int) ((double) (this.field996.field4982 - this.field996.field4985) * 32.768D / var3);
            var9 = (int) ((double) this.field996.field4985 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field994[var11] != 0) {
                field1002[var11] = 0;
                field1003[var11] = (int) ((double) this.field986[var11] * var3);
                field1004[var11] = (this.field994[var11] << 14) / 100;
                field1000[var11] = (int) ((double) (this.field1005.field4982 - this.field1005.field4985) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field991[var11]) / var3);
                field1001[var11] = (int) ((double) this.field1005.field4985 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1005.method1926(arg0);
            int var40 = this.field998.method1926(arg0);
            if (this.field983 != null) {
                int var41 = this.field983.method1926(arg0);
                int var42 = this.field995.method1926(arg0);
                var39 += this.method396(var7, var42, this.field983.field4984) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field996 != null) {
                int var43 = this.field996.method1926(arg0);
                int var44 = this.field988.method1926(arg0);
                var40 = var40 * ((this.method396(var10, var44, this.field996.field4984) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field994[var45] != 0) {
                    int var46 = field1003[var45] + var12;
                    if (var46 < arg0) {
                        field984[var46] += this.method396(field1002[var45], field1004[var45] * var40 >> 15, this.field1005.field4984);
                        field1002[var45] += (field1000[var45] * var39 >> 16) + field1001[var45];
                    }
                }
            }
        }
        if (this.field982 != null) {
            this.field982.method1924();
            this.field999.method1924();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field982.method1926(arg0);
                int var18 = this.field999.method1926(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field982.field4982 - this.field982.field4985) * var17 >> 8) + this.field982.field4985;
                } else {
                    var19 = ((this.field982.field4982 - this.field982.field4985) * var18 >> 8) + this.field982.field4985;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field984[var16] = 0;
                }
            }
        }
        if (this.field981 > 0 && this.field993 > 0) {
            int var20 = (int) ((double) this.field981 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field984[var21] += field984[var21 - var20] * this.field993 / 100;
            }
        }
        if (this.field985.field3552[0] > 0 || this.field985.field3552[1] > 0) {
            this.field992.method1924();
            int var22 = this.field992.method1926(arg0 + 1);
            int var23 = this.field985.method1388(0, (float) var22 / 65536.0F);
            int var24 = this.field985.method1388(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field984[var23 + var25] * (long) class192.field3548 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field984[var23 + var25 - var36 - 1] * (long) class192.field3549[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field984[var25 - var37 - 1] * (long) class192.field3549[1][var37] >> 16);
                    }
                    field984[var25] = var35;
                    var22 = this.field992.method1926(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field984[var23 + var25] * (long) class192.field3548 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field984[var23 + var25 - var33 - 1] * (long) class192.field3549[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field984[var25 - var34 - 1] * (long) class192.field3549[1][var34] >> 16);
                        }
                        field984[var25] = var32;
                        var22 = this.field992.method1926(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field984[var23 + var25 - var29 - 1] * (long) class192.field3549[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field984[var25 - var30 - 1] * (long) class192.field3549[1][var30] >> 16);
                            }
                            field984[var25] = var28;
                            this.field992.method1926(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field985.method1388(0, (float) var22 / 65536.0F);
                    var24 = this.field985.method1388(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field984[var38] < -32768) {
                field984[var38] = -32768;
            }
            if (field984[var38] > 32767) {
                field984[var38] = 32767;
            }
        }
        return field984;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljd;)V")
    public final void method395(class118 arg0) {
        this.field1005 = new class283();
        this.field1005.method1925(arg0);
        this.field998 = new class283();
        this.field998.method1925(arg0);
        int var2 = arg0.method867(false);
        if (var2 != 0) {
            arg0.field2155--;
            this.field983 = new class283();
            this.field983.method1925(arg0);
            this.field995 = new class283();
            this.field995.method1925(arg0);
        }
        int var3 = arg0.method867(false);
        if (var3 != 0) {
            arg0.field2155--;
            this.field996 = new class283();
            this.field996.method1925(arg0);
            this.field988 = new class283();
            this.field988.method1925(arg0);
        }
        int var4 = arg0.method867(false);
        if (var4 != 0) {
            arg0.field2155--;
            this.field982 = new class283();
            this.field982.method1925(arg0);
            this.field999 = new class283();
            this.field999.method1925(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method836((byte) -11);
            if (var6 == 0) {
                break;
            }
            this.field994[var5] = var6;
            this.field991[var5] = arg0.method824((byte) 74);
            this.field986[var5] = arg0.method836((byte) -99);
        }
        this.field981 = arg0.method836((byte) -83);
        this.field993 = arg0.method836((byte) -77);
        this.field987 = arg0.method827(255);
        this.field989 = arg0.method827(255);
        this.field985 = new class192();
        this.field992 = new class283();
        this.field985.method1385(arg0, this.field992);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)I")
    private final int method396(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field990[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field997[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field997[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field990 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field990[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field984 = new int[220500];
        field1001 = new int[5];
        field1002 = new int[5];
        field1003 = new int[5];
        field1000 = new int[5];
        field1004 = new int[5];
    }
}
