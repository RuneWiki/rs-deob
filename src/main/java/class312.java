import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class312 {

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    private int field4876 = 100;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public int field4884 = 500;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public int field4874 = 0;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "[I")
    private int[] field4885 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    private int field4882 = 0;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "[I")
    private int[] field4887 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "[I")
    private int[] field4893 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "[I")
    private static int[] field4880 = new int[32768];

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "[I")
    private static int[] field4886;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "[I")
    private static int[] field4878;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "[I")
    private static int[] field4890;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "[I")
    private static int[] field4892;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "[I")
    private static int[] field4895;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "[I")
    private static int[] field4894;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "[I")
    private static int[] field4889;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Lkf;")
    private class106 field4872;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Lkf;")
    private class106 field4873;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Lkf;")
    private class106 field4875;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Lkf;")
    private class106 field4877;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "Lkf;")
    private class106 field4879;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Lkf;")
    private class106 field4881;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "Lkf;")
    private class106 field4883;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "Lkf;")
    private class106 field4888;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "Lkf;")
    private class106 field4896;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "Lnf;")
    private class262 field4891;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method2175(int arg0, int arg1) {
        class54.method426(field4878, 0, arg0);
        if (arg1 < 10) {
            return field4878;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4873.method727();
        this.field4879.method727();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4883 != null) {
            this.field4883.method727();
            this.field4881.method727();
            var5 = (int) ((double) (this.field4883.field1399 - this.field4883.field1398) * 32.768D / var3);
            var6 = (int) ((double) this.field4883.field1398 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4896 != null) {
            this.field4896.method727();
            this.field4888.method727();
            var8 = (int) ((double) (this.field4896.field1399 - this.field4896.field1398) * 32.768D / var3);
            var9 = (int) ((double) this.field4896.field1398 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4887[var11] != 0) {
                field4890[var11] = 0;
                field4892[var11] = (int) ((double) this.field4885[var11] * var3);
                field4895[var11] = (this.field4887[var11] << 14) / 100;
                field4894[var11] = (int) ((double) (this.field4873.field1399 - this.field4873.field1398) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4893[var11]) / var3);
                field4889[var11] = (int) ((double) this.field4873.field1398 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field4873.method729(arg0);
            int var14 = this.field4879.method729(arg0);
            if (this.field4883 != null) {
                int var15 = this.field4883.method729(arg0);
                int var16 = this.field4881.method729(arg0);
                var13 += this.method2178(var7, var16, this.field4883.field1397) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field4896 != null) {
                int var17 = this.field4896.method729(arg0);
                int var18 = this.field4888.method729(arg0);
                var14 = var14 * ((this.method2178(var10, var18, this.field4896.field1397) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field4887[var19] != 0) {
                    int var20 = field4892[var19] + var12;
                    if (var20 < arg0) {
                        field4878[var20] += this.method2178(field4890[var19], field4895[var19] * var14 >> 15, this.field4873.field1397);
                        field4890[var19] += (field4894[var19] * var13 >> 16) + field4889[var19];
                    }
                }
            }
        }
        if (this.field4875 != null) {
            this.field4875.method727();
            this.field4877.method727();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field4875.method729(arg0);
                int var26 = this.field4877.method729(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field4875.field1399 - this.field4875.field1398) * var25 >> 8) + this.field4875.field1398;
                } else {
                    var27 = ((this.field4875.field1399 - this.field4875.field1398) * var26 >> 8) + this.field4875.field1398;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field4878[var24] = 0;
                }
            }
        }
        if (this.field4882 > 0 && this.field4876 > 0) {
            int var28 = (int) ((double) this.field4882 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field4878[var29] += field4878[var29 - var28] * this.field4876 / 100;
            }
        }
        if (this.field4891.field4111[0] > 0 || this.field4891.field4111[1] > 0) {
            this.field4872.method727();
            int var30 = this.field4872.method729(arg0 + 1);
            int var31 = this.field4891.method1880(0, (float) var30 / 65536.0F);
            int var32 = this.field4891.method1880(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field4878[var31 + var33] * (long) class262.field4110 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field4878[var31 + var33 - var36 - 1] * (long) class262.field4112[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field4878[var33 - var37 - 1] * (long) class262.field4112[1][var37] >> 16);
                    }
                    field4878[var33] = var35;
                    var30 = this.field4872.method729(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field4878[var31 + var33] * (long) class262.field4110 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field4878[var31 + var33 - var40 - 1] * (long) class262.field4112[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field4878[var33 - var41 - 1] * (long) class262.field4112[1][var41] >> 16);
                        }
                        field4878[var33] = var39;
                        var30 = this.field4872.method729(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field4878[var31 + var33 - var43 - 1] * (long) class262.field4112[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field4878[var33 - var44 - 1] * (long) class262.field4112[1][var44] >> 16);
                            }
                            field4878[var33] = var42;
                            this.field4872.method729(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field4891.method1880(0, (float) var30 / 65536.0F);
                    var32 = this.field4891.method1880(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field4878[var46] < -32768) {
                field4878[var46] = -32768;
            }
            if (field4878[var46] > 32767) {
                field4878[var46] = 32767;
            }
        }
        return field4878;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V", line = 312)
    public static void method2176() {
        field4878 = null;
        field4880 = null;
        field4886 = null;
        field4890 = null;
        field4892 = null;
        field4895 = null;
        field4894 = null;
        field4889 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4880[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4886 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4886[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4878 = new int[220500];
        field4890 = new int[5];
        field4892 = new int[5];
        field4895 = new int[5];
        field4894 = new int[5];
        field4889 = new int[5];
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lvl;)V", line = 353)
    public final void method2177(class6 arg0) {
        this.field4873 = new class106();
        this.field4873.method726(arg0);
        this.field4879 = new class106();
        this.field4879.method726(arg0);
        int var2 = arg0.method58(-288140008);
        if (var2 != 0) {
            arg0.field111--;
            this.field4883 = new class106();
            this.field4883.method726(arg0);
            this.field4881 = new class106();
            this.field4881.method726(arg0);
        }
        int var3 = arg0.method58(-288140008);
        if (var3 != 0) {
            arg0.field111--;
            this.field4896 = new class106();
            this.field4896.method726(arg0);
            this.field4888 = new class106();
            this.field4888.method726(arg0);
        }
        int var4 = arg0.method58(-288140008);
        if (var4 != 0) {
            arg0.field111--;
            this.field4875 = new class106();
            this.field4875.method726(arg0);
            this.field4877 = new class106();
            this.field4877.method726(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method52(-32768);
            if (var6 == 0) {
                break;
            }
            this.field4887[var5] = var6;
            this.field4893[var5] = arg0.method50(-16777216);
            this.field4885[var5] = arg0.method52(-32768);
        }
        this.field4882 = arg0.method52(-32768);
        this.field4876 = arg0.method52(-32768);
        this.field4884 = arg0.method39((byte) 109);
        this.field4874 = arg0.method39((byte) 100);
        this.field4891 = new class262();
        this.field4872 = new class106();
        this.field4891.method1883(arg0, this.field4872);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)I", line = 425)
    private final int method2178(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4886[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4880[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }
}
