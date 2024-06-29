import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class269 {

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
    private int field4108 = 0;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "[I")
    private int[] field4107 = new int[5];

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
    public int field4112 = 0;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
    public int field4116 = 500;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    private int field4113 = 100;

    @OriginalMember(owner = "client!lp", name = "y", descriptor = "[I")
    private int[] field4127 = new int[5];

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "[I")
    private int[] field4117 = new int[5];

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "[I")
    private static int[] field4106 = new int[32768];

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "[I")
    private static int[] field4109;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "[I")
    private static int[] field4111;

    @OriginalMember(owner = "client!lp", name = "s", descriptor = "[I")
    private static int[] field4121;

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "[I")
    private static int[] field4118;

    @OriginalMember(owner = "client!lp", name = "x", descriptor = "[I")
    private static int[] field4126;

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "[I")
    private static int[] field4119;

    @OriginalMember(owner = "client!lp", name = "u", descriptor = "[I")
    private static int[] field4123;

    @OriginalMember(owner = "client!lp", name = "w", descriptor = "Lll;")
    private class247 field4125;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "Lht;")
    private class413 field4103;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "Lht;")
    private class413 field4104;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "Lht;")
    private class413 field4105;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "Lht;")
    private class413 field4110;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "Lht;")
    private class413 field4114;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "Lht;")
    private class413 field4115;

    @OriginalMember(owner = "client!lp", name = "r", descriptor = "Lht;")
    private class413 field4120;

    @OriginalMember(owner = "client!lp", name = "t", descriptor = "Lht;")
    private class413 field4122;

    @OriginalMember(owner = "client!lp", name = "v", descriptor = "Lht;")
    private class413 field4124;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)I")
    private final int method1780(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4109[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4106[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lhp;)V")
    public final void method1781(class217 arg0) {
        this.field4120 = new class413();
        this.field4120.method2596(arg0);
        this.field4104 = new class413();
        this.field4104.method2596(arg0);
        int var2 = arg0.method1515((byte) 123);
        if (var2 != 0) {
            arg0.field3556--;
            this.field4103 = new class413();
            this.field4103.method2596(arg0);
            this.field4115 = new class413();
            this.field4115.method2596(arg0);
        }
        int var3 = arg0.method1515((byte) 126);
        if (var3 != 0) {
            arg0.field3556--;
            this.field4124 = new class413();
            this.field4124.method2596(arg0);
            this.field4105 = new class413();
            this.field4105.method2596(arg0);
        }
        int var4 = arg0.method1515((byte) 127);
        if (var4 != 0) {
            arg0.field3556--;
            this.field4110 = new class413();
            this.field4110.method2596(arg0);
            this.field4114 = new class413();
            this.field4114.method2596(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1510(-129);
            if (var6 == 0) {
                break;
            }
            this.field4117[var5] = var6;
            this.field4107[var5] = arg0.method1562((byte) 123);
            this.field4127[var5] = arg0.method1510(-129);
        }
        this.field4108 = arg0.method1510(-129);
        this.field4113 = arg0.method1510(-129);
        this.field4116 = arg0.method1511(-57);
        this.field4112 = arg0.method1511(77);
        this.field4125 = new class247();
        this.field4122 = new class413();
        this.field4125.method1671(arg0, this.field4122);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)[I")
    public final int[] method1782(int arg0, int arg1) {
        class414.method2600(field4111, 0, arg0);
        if (arg1 < 10) {
            return field4111;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4120.method2597();
        this.field4104.method2597();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4103 != null) {
            this.field4103.method2597();
            this.field4115.method2597();
            var5 = (int) ((double) (this.field4103.field6184 - this.field4103.field6185) * 32.768D / var3);
            var6 = (int) ((double) this.field4103.field6185 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4124 != null) {
            this.field4124.method2597();
            this.field4105.method2597();
            var8 = (int) ((double) (this.field4124.field6184 - this.field4124.field6185) * 32.768D / var3);
            var9 = (int) ((double) this.field4124.field6185 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4117[var11] != 0) {
                field4126[var11] = 0;
                field4123[var11] = (int) ((double) this.field4127[var11] * var3);
                field4118[var11] = (this.field4117[var11] << 14) / 100;
                field4119[var11] = (int) ((double) (this.field4120.field6184 - this.field4120.field6185) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4107[var11]) / var3);
                field4121[var11] = (int) ((double) this.field4120.field6185 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4120.method2594(arg0);
            int var40 = this.field4104.method2594(arg0);
            if (this.field4103 != null) {
                int var41 = this.field4103.method2594(arg0);
                int var42 = this.field4115.method2594(arg0);
                var39 += this.method1780(var7, var42, this.field4103.field6186) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field4124 != null) {
                int var43 = this.field4124.method2594(arg0);
                int var44 = this.field4105.method2594(arg0);
                var40 = var40 * ((this.method1780(var10, var44, this.field4124.field6186) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field4117[var45] != 0) {
                    int var46 = field4123[var45] + var12;
                    if (var46 < arg0) {
                        field4111[var46] += this.method1780(field4126[var45], field4118[var45] * var40 >> 15, this.field4120.field6186);
                        field4126[var45] += (field4119[var45] * var39 >> 16) + field4121[var45];
                    }
                }
            }
        }
        if (this.field4110 != null) {
            this.field4110.method2597();
            this.field4114.method2597();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field4110.method2594(arg0);
                int var18 = this.field4114.method2594(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field4110.field6184 - this.field4110.field6185) * var17 >> 8) + this.field4110.field6185;
                } else {
                    var19 = ((this.field4110.field6184 - this.field4110.field6185) * var18 >> 8) + this.field4110.field6185;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4111[var16] = 0;
                }
            }
        }
        if (this.field4108 > 0 && this.field4113 > 0) {
            int var20 = (int) ((double) this.field4108 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4111[var21] += field4111[var21 - var20] * this.field4113 / 100;
            }
        }
        if (this.field4125.field3876[0] > 0 || this.field4125.field3876[1] > 0) {
            this.field4122.method2597();
            int var22 = this.field4122.method2594(arg0 + 1);
            int var23 = this.field4125.method1672(0, (float) var22 / 65536.0F);
            int var24 = this.field4125.method1672(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4111[var23 + var25] * (long) class247.field3877 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4111[var23 + var25 - var36 - 1] * (long) class247.field3872[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4111[var25 - var37 - 1] * (long) class247.field3872[1][var37] >> 16);
                    }
                    field4111[var25] = var35;
                    var22 = this.field4122.method2594(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4111[var23 + var25] * (long) class247.field3877 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4111[var23 + var25 - var33 - 1] * (long) class247.field3872[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4111[var25 - var34 - 1] * (long) class247.field3872[1][var34] >> 16);
                        }
                        field4111[var25] = var32;
                        var22 = this.field4122.method2594(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4111[var23 + var25 - var29 - 1] * (long) class247.field3872[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4111[var25 - var30 - 1] * (long) class247.field3872[1][var30] >> 16);
                            }
                            field4111[var25] = var28;
                            this.field4122.method2594(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field4125.method1672(0, (float) var22 / 65536.0F);
                    var24 = this.field4125.method1672(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4111[var38] < -32768) {
                field4111[var38] = -32768;
            }
            if (field4111[var38] > 32767) {
                field4111[var38] = 32767;
            }
        }
        return field4111;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "()V")
    public static void method1783() {
        field4111 = null;
        field4106 = null;
        field4109 = null;
        field4126 = null;
        field4123 = null;
        field4118 = null;
        field4119 = null;
        field4121 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4106[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4109 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4109[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4111 = new int[220500];
        field4121 = new int[5];
        field4118 = new int[5];
        field4126 = new int[5];
        field4119 = new int[5];
        field4123 = new int[5];
    }
}
