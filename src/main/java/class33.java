import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class33 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    private int field761 = 100;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public int field775 = 0;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "[I")
    private int[] field778 = new int[5];

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public int field770 = 500;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    private int field764 = 0;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "[I")
    private int[] field768 = new int[5];

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "[I")
    private int[] field780 = new int[5];

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "[I")
    private static int[] field765 = new int[32768];

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "[I")
    private static int[] field779;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "[I")
    private static int[] field776;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "[I")
    private static int[] field784;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "[I")
    private static int[] field785;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "[I")
    private static int[] field782;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "[I")
    private static int[] field781;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "[I")
    private static int[] field783;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Lva;")
    private class142 field773;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lgb;")
    private class45 field762;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lgb;")
    private class45 field763;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Lgb;")
    private class45 field766;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "Lgb;")
    private class45 field767;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Lgb;")
    private class45 field769;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Lgb;")
    private class45 field771;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Lgb;")
    private class45 field772;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Lgb;")
    private class45 field774;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Lgb;")
    private class45 field777;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)I")
    private final int method261(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field779[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field765[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "()V")
    public static void method262() {
        field776 = null;
        field765 = null;
        field779 = null;
        field783 = null;
        field784 = null;
        field782 = null;
        field781 = null;
        field785 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lic;)V")
    public final void method263(class59 arg0) {
        this.field767 = new class45();
        this.field767.method350(arg0);
        this.field774 = new class45();
        this.field774.method350(arg0);
        int var2 = arg0.method480(0);
        if (var2 != 0) {
            arg0.field1485--;
            this.field777 = new class45();
            this.field777.method350(arg0);
            this.field763 = new class45();
            this.field763.method350(arg0);
        }
        int var3 = arg0.method480(0);
        if (var3 != 0) {
            arg0.field1485--;
            this.field771 = new class45();
            this.field771.method350(arg0);
            this.field762 = new class45();
            this.field762.method350(arg0);
        }
        int var4 = arg0.method480(0);
        if (var4 != 0) {
            arg0.field1485--;
            this.field772 = new class45();
            this.field772.method350(arg0);
            this.field769 = new class45();
            this.field769.method350(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method450((byte) -71);
            if (var6 == 0) {
                break;
            }
            this.field778[var5] = var6;
            this.field768[var5] = arg0.method479(128);
            this.field780[var5] = arg0.method450((byte) -71);
        }
        this.field764 = arg0.method450((byte) -71);
        this.field761 = arg0.method450((byte) -71);
        this.field770 = arg0.method483((byte) 24);
        this.field775 = arg0.method483((byte) 24);
        this.field773 = new class142();
        this.field766 = new class45();
        this.field773.method1172(arg0, this.field766);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)[I")
    public final int[] method264(int arg0, int arg1) {
        class71.method576(field776, 0, arg0);
        if (arg1 < 10) {
            return field776;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field767.method349();
        this.field774.method349();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field777 != null) {
            this.field777.method349();
            this.field763.method349();
            var5 = (int) ((double) (this.field777.field1087 - this.field777.field1086) * 32.768D / var3);
            var6 = (int) ((double) this.field777.field1086 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field771 != null) {
            this.field771.method349();
            this.field762.method349();
            var8 = (int) ((double) (this.field771.field1087 - this.field771.field1086) * 32.768D / var3);
            var9 = (int) ((double) this.field771.field1086 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field778[var11] != 0) {
                field783[var11] = 0;
                field784[var11] = (int) ((double) this.field780[var11] * var3);
                field782[var11] = (this.field778[var11] << 14) / 100;
                field781[var11] = (int) ((double) (this.field767.field1087 - this.field767.field1086) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field768[var11]) / var3);
                field785[var11] = (int) ((double) this.field767.field1086 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field767.method352(arg0);
            int var40 = this.field774.method352(arg0);
            if (this.field777 != null) {
                int var41 = this.field777.method352(arg0);
                int var42 = this.field763.method352(arg0);
                var39 += this.method261(var7, var42, this.field777.field1084) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field771 != null) {
                int var43 = this.field771.method352(arg0);
                int var44 = this.field762.method352(arg0);
                var40 = var40 * ((this.method261(var10, var44, this.field771.field1084) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field778[var45] != 0) {
                    int var46 = field784[var45] + var12;
                    if (var46 < arg0) {
                        field776[var46] += this.method261(field783[var45], field782[var45] * var40 >> 15, this.field767.field1084);
                        field783[var45] += (field781[var45] * var39 >> 16) + field785[var45];
                    }
                }
            }
        }
        if (this.field772 != null) {
            this.field772.method349();
            this.field769.method349();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field772.method352(arg0);
                int var18 = this.field769.method352(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field772.field1087 - this.field772.field1086) * var17 >> 8) + this.field772.field1086;
                } else {
                    var19 = ((this.field772.field1087 - this.field772.field1086) * var18 >> 8) + this.field772.field1086;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field776[var16] = 0;
                }
            }
        }
        if (this.field764 > 0 && this.field761 > 0) {
            int var20 = (int) ((double) this.field764 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field776[var21] += field776[var21 - var20] * this.field761 / 100;
            }
        }
        if (this.field773.field3487[0] > 0 || this.field773.field3487[1] > 0) {
            this.field766.method349();
            int var22 = this.field766.method352(arg0 + 1);
            int var23 = this.field773.method1173(0, (float) var22 / 65536.0F);
            int var24 = this.field773.method1173(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field776[var23 + var25] * (long) class142.field3483 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field776[var23 + var25 - var36 - 1] * (long) class142.field3486[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field776[var25 - var37 - 1] * (long) class142.field3486[1][var37] >> 16);
                    }
                    field776[var25] = var35;
                    var22 = this.field766.method352(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field776[var23 + var25] * (long) class142.field3483 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field776[var23 + var25 - var33 - 1] * (long) class142.field3486[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field776[var25 - var34 - 1] * (long) class142.field3486[1][var34] >> 16);
                        }
                        field776[var25] = var32;
                        var22 = this.field766.method352(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field776[var23 + var25 - var29 - 1] * (long) class142.field3486[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field776[var25 - var30 - 1] * (long) class142.field3486[1][var30] >> 16);
                            }
                            field776[var25] = var28;
                            this.field766.method352(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field773.method1173(0, (float) var22 / 65536.0F);
                    var24 = this.field773.method1173(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field776[var38] < -32768) {
                field776[var38] = -32768;
            }
            if (field776[var38] > 32767) {
                field776[var38] = 32767;
            }
        }
        return field776;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field765[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field779 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field779[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field776 = new int[220500];
        field784 = new int[5];
        field785 = new int[5];
        field782 = new int[5];
        field781 = new int[5];
        field783 = new int[5];
    }
}
