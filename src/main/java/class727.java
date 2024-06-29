import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class727 {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    private int field10080 = 0;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "[I")
    private int[] field10086 = new int[5];

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "[I")
    private int[] field10079 = new int[5];

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "[I")
    private int[] field10089 = new int[5];

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public int field10085 = 500;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    private int field10083 = 100;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public int field10103 = 0;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "[I")
    private static int[] field10090 = new int[32768];

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "[I")
    private static int[] field10088;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "[I")
    private static int[] field10091;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "[I")
    private static int[] field10098;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "[I")
    private static int[] field10100;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "[I")
    private static int[] field10102;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "[I")
    private static int[] field10099;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "[I")
    private static int[] field10101;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "Lwr;")
    private class242 field10097;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Lle;")
    private class739 field10081;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Lle;")
    private class739 field10082;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Lle;")
    private class739 field10084;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Lle;")
    private class739 field10087;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "Lle;")
    private class739 field10092;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Lle;")
    private class739 field10093;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "Lle;")
    private class739 field10094;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "Lle;")
    private class739 field10095;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Lle;")
    private class739 field10096;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field10090[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field10088 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field10088[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field10091 = new int[220500];
        field10098 = new int[5];
        field10100 = new int[5];
        field10102 = new int[5];
        field10099 = new int[5];
        field10101 = new int[5];
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)I", line = 15)
    private final int method4057(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field10088[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field10090[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ldc;)V", line = 39)
    public final void method4058(class63 arg0) {
        this.field10093 = new class739();
        this.field10093.method4105(arg0);
        this.field10087 = new class739();
        this.field10087.method4105(arg0);
        int var2 = arg0.method505((byte) -119);
        if (var2 != 0) {
            arg0.field956--;
            this.field10082 = new class739();
            this.field10082.method4105(arg0);
            this.field10094 = new class739();
            this.field10094.method4105(arg0);
        }
        int var3 = arg0.method505((byte) -119);
        if (var3 != 0) {
            arg0.field956--;
            this.field10096 = new class739();
            this.field10096.method4105(arg0);
            this.field10092 = new class739();
            this.field10092.method4105(arg0);
        }
        int var4 = arg0.method505((byte) -119);
        if (var4 != 0) {
            arg0.field956--;
            this.field10084 = new class739();
            this.field10084.method4105(arg0);
            this.field10081 = new class739();
            this.field10081.method4105(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method478(-106);
            if (var6 == 0) {
                break;
            }
            this.field10086[var5] = var6;
            this.field10089[var5] = arg0.method480((byte) -89);
            this.field10079[var5] = arg0.method478(-116);
        }
        this.field10080 = arg0.method478(-113);
        this.field10083 = arg0.method478(-123);
        this.field10085 = arg0.method482(-772591672);
        this.field10103 = arg0.method482(-772591672);
        this.field10097 = new class242();
        this.field10095 = new class739();
        this.field10097.method1629(arg0, this.field10095);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()V", line = 106)
    public static void method4059() {
        field10091 = null;
        field10090 = null;
        field10088 = null;
        field10099 = null;
        field10098 = null;
        field10100 = null;
        field10102 = null;
        field10101 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)[I", line = 168)
    public final int[] method4060(int arg0, int arg1) {
        class245.method1650(field10091, 0, arg0);
        if (arg1 < 10) {
            return field10091;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field10093.method4108();
        this.field10087.method4108();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field10082 != null) {
            this.field10082.method4108();
            this.field10094.method4108();
            var5 = (int) ((double) (this.field10082.field10208 - this.field10082.field10206) * 32.768D / var3);
            var6 = (int) ((double) this.field10082.field10206 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field10096 != null) {
            this.field10096.method4108();
            this.field10092.method4108();
            var8 = (int) ((double) (this.field10096.field10208 - this.field10096.field10206) * 32.768D / var3);
            var9 = (int) ((double) this.field10096.field10206 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field10086[var11] != 0) {
                field10099[var11] = 0;
                field10098[var11] = (int) ((double) this.field10079[var11] * var3);
                field10100[var11] = (this.field10086[var11] << 14) / 100;
                field10102[var11] = (int) ((double) (this.field10093.field10208 - this.field10093.field10206) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field10089[var11]) / var3);
                field10101[var11] = (int) ((double) this.field10093.field10206 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field10093.method4106(arg0);
            int var40 = this.field10087.method4106(arg0);
            if (this.field10082 != null) {
                int var41 = this.field10082.method4106(arg0);
                int var42 = this.field10094.method4106(arg0);
                var39 += this.method4057(var7, var42, this.field10082.field10207) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field10096 != null) {
                int var43 = this.field10096.method4106(arg0);
                int var44 = this.field10092.method4106(arg0);
                var40 = var40 * ((this.method4057(var10, var44, this.field10096.field10207) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field10086[var45] != 0) {
                    int var46 = field10098[var45] + var12;
                    if (var46 < arg0) {
                        field10091[var46] += this.method4057(field10099[var45], field10100[var45] * var40 >> 15, this.field10093.field10207);
                        field10099[var45] += (field10102[var45] * var39 >> 16) + field10101[var45];
                    }
                }
            }
        }
        if (this.field10084 != null) {
            this.field10084.method4108();
            this.field10081.method4108();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field10084.method4106(arg0);
                int var18 = this.field10081.method4106(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field10084.field10208 - this.field10084.field10206) * var17 >> 8) + this.field10084.field10206;
                } else {
                    var19 = ((this.field10084.field10208 - this.field10084.field10206) * var18 >> 8) + this.field10084.field10206;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field10091[var16] = 0;
                }
            }
        }
        if (this.field10080 > 0 && this.field10083 > 0) {
            int var20 = (int) ((double) this.field10080 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field10091[var21] += field10091[var21 - var20] * this.field10083 / 100;
            }
        }
        if (this.field10097.field3601[0] > 0 || this.field10097.field3601[1] > 0) {
            this.field10095.method4108();
            int var22 = this.field10095.method4106(arg0 + 1);
            int var23 = this.field10097.method1630(0, (float) var22 / 65536.0F);
            int var24 = this.field10097.method1630(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field10091[var23 + var25] * (long) class242.field3605 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field10091[var23 + var25 - var36 - 1] * (long) class242.field3604[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field10091[var25 - var37 - 1] * (long) class242.field3604[1][var37] >> 16);
                    }
                    field10091[var25] = var35;
                    var22 = this.field10095.method4106(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field10091[var23 + var25] * (long) class242.field3605 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field10091[var23 + var25 - var33 - 1] * (long) class242.field3604[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field10091[var25 - var34 - 1] * (long) class242.field3604[1][var34] >> 16);
                        }
                        field10091[var25] = var32;
                        var22 = this.field10095.method4106(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field10091[var23 + var25 - var29 - 1] * (long) class242.field3604[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field10091[var25 - var30 - 1] * (long) class242.field3604[1][var30] >> 16);
                            }
                            field10091[var25] = var28;
                            this.field10095.method4106(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field10097.method1630(0, (float) var22 / 65536.0F);
                    var24 = this.field10097.method1630(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field10091[var38] < -32768) {
                field10091[var38] = -32768;
            }
            if (field10091[var38] > 32767) {
                field10091[var38] = 32767;
            }
        }
        return field10091;
    }
}
