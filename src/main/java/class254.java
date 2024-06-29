import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class254 {

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public int field4070 = 500;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "[I")
    private int[] field4074 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    private int field4079 = 100;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    private int field4080 = 0;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "[I")
    private int[] field4078 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!g", name = "s", descriptor = "[I")
    private int[] field4084 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public int field4083 = 0;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "[I")
    private static int[] field4082 = new int[32768];

    @OriginalMember(owner = "client!g", name = "j", descriptor = "[I")
    private static int[] field4075;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "[I")
    private static int[] field4072;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "[I")
    private static int[] field4085;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "[I")
    private static int[] field4088;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "[I")
    private static int[] field4086;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "[I")
    private static int[] field4089;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "[I")
    private static int[] field4090;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Ljg;")
    private class168 field4077;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lrj;")
    private class293 field4066;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Lrj;")
    private class293 field4067;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lrj;")
    private class293 field4068;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lrj;")
    private class293 field4069;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Lrj;")
    private class293 field4071;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Lrj;")
    private class293 field4073;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Lrj;")
    private class293 field4076;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Lrj;")
    private class293 field4081;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "Lrj;")
    private class293 field4087;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Llb;)V", line = 11)
    public final void method1808(class112 arg0) {
        this.field4066 = new class293();
        this.field4066.method2029(arg0);
        this.field4068 = new class293();
        this.field4068.method2029(arg0);
        int var2 = arg0.method792(2);
        if (var2 != 0) {
            arg0.field1640--;
            this.field4069 = new class293();
            this.field4069.method2029(arg0);
            this.field4076 = new class293();
            this.field4076.method2029(arg0);
        }
        int var3 = arg0.method792(2);
        if (var3 != 0) {
            arg0.field1640--;
            this.field4067 = new class293();
            this.field4067.method2029(arg0);
            this.field4071 = new class293();
            this.field4071.method2029(arg0);
        }
        int var4 = arg0.method792(2);
        if (var4 != 0) {
            arg0.field1640--;
            this.field4087 = new class293();
            this.field4087.method2029(arg0);
            this.field4073 = new class293();
            this.field4073.method2029(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method756(101);
            if (var6 == 0) {
                break;
            }
            this.field4084[var5] = var6;
            this.field4074[var5] = arg0.method765(255);
            this.field4078[var5] = arg0.method756(111);
        }
        this.field4080 = arg0.method756(124);
        this.field4079 = arg0.method756(107);
        this.field4070 = arg0.method759((byte) -75);
        this.field4083 = arg0.method759((byte) -30);
        this.field4077 = new class168();
        this.field4081 = new class293();
        this.field4077.method1203(arg0, this.field4081);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "()V", line = 74)
    public static void method1809() {
        field4072 = null;
        field4082 = null;
        field4075 = null;
        field4086 = null;
        field4085 = null;
        field4089 = null;
        field4088 = null;
        field4090 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)[I", line = 86)
    public final int[] method1810(int arg0, int arg1) {
        class21.method142(field4072, 0, arg0);
        if (arg1 < 10) {
            return field4072;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4066.method2028();
        this.field4068.method2028();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4069 != null) {
            this.field4069.method2028();
            this.field4076.method2028();
            var5 = (int) ((double) (this.field4069.field4741 - this.field4069.field4743) * 32.768D / var3);
            var6 = (int) ((double) this.field4069.field4743 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4067 != null) {
            this.field4067.method2028();
            this.field4071.method2028();
            var8 = (int) ((double) (this.field4067.field4741 - this.field4067.field4743) * 32.768D / var3);
            var9 = (int) ((double) this.field4067.field4743 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4084[var11] != 0) {
                field4086[var11] = 0;
                field4085[var11] = (int) ((double) this.field4078[var11] * var3);
                field4089[var11] = (this.field4084[var11] << 14) / 100;
                field4088[var11] = (int) ((double) (this.field4066.field4741 - this.field4066.field4743) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4074[var11]) / var3);
                field4090[var11] = (int) ((double) this.field4066.field4743 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field4066.method2030(arg0);
            int var14 = this.field4068.method2030(arg0);
            if (this.field4069 != null) {
                int var15 = this.field4069.method2030(arg0);
                int var16 = this.field4076.method2030(arg0);
                var13 += this.method1811(var7, var16, this.field4069.field4742) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field4067 != null) {
                int var17 = this.field4067.method2030(arg0);
                int var18 = this.field4071.method2030(arg0);
                var14 = var14 * ((this.method1811(var10, var18, this.field4067.field4742) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field4084[var19] != 0) {
                    int var20 = field4085[var19] + var12;
                    if (var20 < arg0) {
                        field4072[var20] += this.method1811(field4086[var19], field4089[var19] * var14 >> 15, this.field4066.field4742);
                        field4086[var19] += (field4088[var19] * var13 >> 16) + field4090[var19];
                    }
                }
            }
        }
        if (this.field4087 != null) {
            this.field4087.method2028();
            this.field4073.method2028();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field4087.method2030(arg0);
                int var26 = this.field4073.method2030(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field4087.field4741 - this.field4087.field4743) * var25 >> 8) + this.field4087.field4743;
                } else {
                    var27 = ((this.field4087.field4741 - this.field4087.field4743) * var26 >> 8) + this.field4087.field4743;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field4072[var24] = 0;
                }
            }
        }
        if (this.field4080 > 0 && this.field4079 > 0) {
            int var28 = (int) ((double) this.field4080 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field4072[var29] += field4072[var29 - var28] * this.field4079 / 100;
            }
        }
        if (this.field4077.field2664[0] > 0 || this.field4077.field2664[1] > 0) {
            this.field4081.method2028();
            int var30 = this.field4081.method2030(arg0 + 1);
            int var31 = this.field4077.method1200(0, (float) var30 / 65536.0F);
            int var32 = this.field4077.method1200(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field4072[var31 + var33] * (long) class168.field2668 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field4072[var31 + var33 - var36 - 1] * (long) class168.field2669[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field4072[var33 - var37 - 1] * (long) class168.field2669[1][var37] >> 16);
                    }
                    field4072[var33] = var35;
                    var30 = this.field4081.method2030(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field4072[var31 + var33] * (long) class168.field2668 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field4072[var31 + var33 - var40 - 1] * (long) class168.field2669[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field4072[var33 - var41 - 1] * (long) class168.field2669[1][var41] >> 16);
                        }
                        field4072[var33] = var39;
                        var30 = this.field4081.method2030(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field4072[var31 + var33 - var43 - 1] * (long) class168.field2669[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field4072[var33 - var44 - 1] * (long) class168.field2669[1][var44] >> 16);
                            }
                            field4072[var33] = var42;
                            this.field4081.method2030(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field4077.method1200(0, (float) var30 / 65536.0F);
                    var32 = this.field4077.method1200(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field4072[var46] < -32768) {
                field4072[var46] = -32768;
            }
            if (field4072[var46] > 32767) {
                field4072[var46] = 32767;
            }
        }
        return field4072;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4082[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4075 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4075[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4072 = new int[220500];
        field4085 = new int[5];
        field4088 = new int[5];
        field4086 = new int[5];
        field4089 = new int[5];
        field4090 = new int[5];
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)I", line = 421)
    private final int method1811(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4075[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4082[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }
}
