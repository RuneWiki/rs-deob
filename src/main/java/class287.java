import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class287 {

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    private int field5056 = 0;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public int field5058 = 0;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    private int field5052 = 100;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "[I")
    private int[] field5064 = new int[5];

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "[I")
    private int[] field5065 = new int[5];

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public int field5051 = 500;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "[I")
    private int[] field5072 = new int[5];

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "[I")
    private static int[] field5068 = new int[32768];

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "[I")
    private static int[] field5050;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "[I")
    private static int[] field5063;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "[I")
    private static int[] field5069;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "[I")
    private static int[] field5073;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "[I")
    private static int[] field5070;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "[I")
    private static int[] field5074;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "[I")
    private static int[] field5071;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Lni;")
    private class152 field5059;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "Lbb;")
    private class89 field5053;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "Lbb;")
    private class89 field5054;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Lbb;")
    private class89 field5055;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Lbb;")
    private class89 field5057;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "Lbb;")
    private class89 field5060;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Lbb;")
    private class89 field5061;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "Lbb;")
    private class89 field5062;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "Lbb;")
    private class89 field5066;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "Lbb;")
    private class89 field5067;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I")
    public final int[] method1928(int arg0, int arg1) {
        class270.method1841(field5063, 0, arg0);
        if (arg1 < 10) {
            return field5063;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field5061.method635();
        this.field5066.method635();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field5055 != null) {
            this.field5055.method635();
            this.field5067.method635();
            var5 = (int) ((double) (this.field5055.field1753 - this.field5055.field1751) * 32.768D / var3);
            var6 = (int) ((double) this.field5055.field1751 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field5053 != null) {
            this.field5053.method635();
            this.field5062.method635();
            var8 = (int) ((double) (this.field5053.field1753 - this.field5053.field1751) * 32.768D / var3);
            var9 = (int) ((double) this.field5053.field1751 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field5065[var11] != 0) {
                field5071[var11] = 0;
                field5069[var11] = (int) ((double) this.field5064[var11] * var3);
                field5074[var11] = (this.field5065[var11] << 14) / 100;
                field5073[var11] = (int) ((double) (this.field5061.field1753 - this.field5061.field1751) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field5072[var11]) / var3);
                field5070[var11] = (int) ((double) this.field5061.field1751 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field5061.method634(arg0);
            int var40 = this.field5066.method634(arg0);
            if (this.field5055 != null) {
                int var41 = this.field5055.method634(arg0);
                int var42 = this.field5067.method634(arg0);
                var39 += this.method1929(var7, var42, this.field5055.field1752) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field5053 != null) {
                int var43 = this.field5053.method634(arg0);
                int var44 = this.field5062.method634(arg0);
                var40 = var40 * ((this.method1929(var10, var44, this.field5053.field1752) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field5065[var45] != 0) {
                    int var46 = field5069[var45] + var12;
                    if (var46 < arg0) {
                        field5063[var46] += this.method1929(field5071[var45], field5074[var45] * var40 >> 15, this.field5061.field1752);
                        field5071[var45] += (field5073[var45] * var39 >> 16) + field5070[var45];
                    }
                }
            }
        }
        if (this.field5054 != null) {
            this.field5054.method635();
            this.field5057.method635();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field5054.method634(arg0);
                int var18 = this.field5057.method634(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field5054.field1753 - this.field5054.field1751) * var17 >> 8) + this.field5054.field1751;
                } else {
                    var19 = ((this.field5054.field1753 - this.field5054.field1751) * var18 >> 8) + this.field5054.field1751;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field5063[var16] = 0;
                }
            }
        }
        if (this.field5056 > 0 && this.field5052 > 0) {
            int var20 = (int) ((double) this.field5056 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field5063[var21] += field5063[var21 - var20] * this.field5052 / 100;
            }
        }
        if (this.field5059.field2757[0] > 0 || this.field5059.field2757[1] > 0) {
            this.field5060.method635();
            int var22 = this.field5060.method634(arg0 + 1);
            int var23 = this.field5059.method1051(0, (float) var22 / 65536.0F);
            int var24 = this.field5059.method1051(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field5063[var23 + var25] * (long) class152.field2759 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field5063[var23 + var25 - var36 - 1] * (long) class152.field2755[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field5063[var25 - var37 - 1] * (long) class152.field2755[1][var37] >> 16);
                    }
                    field5063[var25] = var35;
                    var22 = this.field5060.method634(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field5063[var23 + var25] * (long) class152.field2759 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field5063[var23 + var25 - var33 - 1] * (long) class152.field2755[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field5063[var25 - var34 - 1] * (long) class152.field2755[1][var34] >> 16);
                        }
                        field5063[var25] = var32;
                        var22 = this.field5060.method634(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field5063[var23 + var25 - var29 - 1] * (long) class152.field2755[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field5063[var25 - var30 - 1] * (long) class152.field2755[1][var30] >> 16);
                            }
                            field5063[var25] = var28;
                            this.field5060.method634(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field5059.method1051(0, (float) var22 / 65536.0F);
                    var24 = this.field5059.method1051(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field5063[var38] < -32768) {
                field5063[var38] = -32768;
            }
            if (field5063[var38] > 32767) {
                field5063[var38] = 32767;
            }
        }
        return field5063;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I")
    private final int method1929(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field5050[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field5068[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()V")
    public static void method1930() {
        field5063 = null;
        field5068 = null;
        field5050 = null;
        field5071 = null;
        field5069 = null;
        field5074 = null;
        field5073 = null;
        field5070 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ltf;)V")
    public final void method1931(class106 arg0) {
        this.field5061 = new class89();
        this.field5061.method636(arg0);
        this.field5066 = new class89();
        this.field5066.method636(arg0);
        int var2 = arg0.method774((byte) 120);
        if (var2 != 0) {
            arg0.field2085--;
            this.field5055 = new class89();
            this.field5055.method636(arg0);
            this.field5067 = new class89();
            this.field5067.method636(arg0);
        }
        int var3 = arg0.method774((byte) 102);
        if (var3 != 0) {
            arg0.field2085--;
            this.field5053 = new class89();
            this.field5053.method636(arg0);
            this.field5062 = new class89();
            this.field5062.method636(arg0);
        }
        int var4 = arg0.method774((byte) 91);
        if (var4 != 0) {
            arg0.field2085--;
            this.field5054 = new class89();
            this.field5054.method636(arg0);
            this.field5057 = new class89();
            this.field5057.method636(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method760(255);
            if (var6 == 0) {
                break;
            }
            this.field5065[var5] = var6;
            this.field5072[var5] = arg0.method768((byte) 96);
            this.field5064[var5] = arg0.method760(255);
        }
        this.field5056 = arg0.method760(255);
        this.field5052 = arg0.method760(255);
        this.field5051 = arg0.method736(121);
        this.field5058 = arg0.method736(124);
        this.field5059 = new class152();
        this.field5060 = new class89();
        this.field5059.method1046(arg0, this.field5060);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field5068[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field5050 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field5050[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field5063 = new int[220500];
        field5069 = new int[5];
        field5073 = new int[5];
        field5070 = new int[5];
        field5074 = new int[5];
        field5071 = new int[5];
    }
}
