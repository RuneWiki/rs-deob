import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class250 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public int field4149 = 500;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "[I")
    private int[] field4157 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    private int field4152 = 0;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public int field4161 = 0;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    private int field4167 = 100;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "[I")
    private int[] field4158 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "[I")
    private int[] field4172 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "[I")
    private static int[] field4153 = new int[32768];

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "[I")
    private static int[] field4155;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "[I")
    private static int[] field4151;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "[I")
    private static int[] field4162;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "[I")
    private static int[] field4159;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "[I")
    private static int[] field4165;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "[I")
    private static int[] field4166;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "[I")
    private static int[] field4171;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "Lqe;")
    private class35 field4150;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "Lcf;")
    private class66 field4154;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Lcf;")
    private class66 field4156;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Lcf;")
    private class66 field4160;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "Lcf;")
    private class66 field4163;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "Lcf;")
    private class66 field4164;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "Lcf;")
    private class66 field4168;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "Lcf;")
    private class66 field4169;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "Lcf;")
    private class66 field4170;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "Lcf;")
    private class66 field4173;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)[I", line = 6)
    public final int[] method1747(int arg0, int arg1) {
        class63.method523(field4151, 0, arg0);
        if (arg1 < 10) {
            return field4151;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4170.method543();
        this.field4168.method543();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4163 != null) {
            this.field4163.method543();
            this.field4154.method543();
            var5 = (int) ((double) (this.field4163.field1005 - this.field4163.field1006) * 32.768D / var3);
            var6 = (int) ((double) this.field4163.field1006 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4169 != null) {
            this.field4169.method543();
            this.field4156.method543();
            var8 = (int) ((double) (this.field4169.field1005 - this.field4169.field1006) * 32.768D / var3);
            var9 = (int) ((double) this.field4169.field1006 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4158[var11] != 0) {
                field4165[var11] = 0;
                field4159[var11] = (int) ((double) this.field4172[var11] * var3);
                field4171[var11] = (this.field4158[var11] << 14) / 100;
                field4162[var11] = (int) ((double) (this.field4170.field1005 - this.field4170.field1006) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4157[var11]) / var3);
                field4166[var11] = (int) ((double) this.field4170.field1006 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field4170.method542(arg0);
            int var14 = this.field4168.method542(arg0);
            if (this.field4163 != null) {
                int var15 = this.field4163.method542(arg0);
                int var16 = this.field4154.method542(arg0);
                var13 += this.method1749(var7, var16, this.field4163.field1002) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field4169 != null) {
                int var17 = this.field4169.method542(arg0);
                int var18 = this.field4156.method542(arg0);
                var14 = var14 * ((this.method1749(var10, var18, this.field4169.field1002) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field4158[var19] != 0) {
                    int var20 = field4159[var19] + var12;
                    if (var20 < arg0) {
                        field4151[var20] += this.method1749(field4165[var19], field4171[var19] * var14 >> 15, this.field4170.field1002);
                        field4165[var19] += (field4162[var19] * var13 >> 16) + field4166[var19];
                    }
                }
            }
        }
        if (this.field4160 != null) {
            this.field4160.method543();
            this.field4173.method543();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field4160.method542(arg0);
                int var26 = this.field4173.method542(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field4160.field1005 - this.field4160.field1006) * var25 >> 8) + this.field4160.field1006;
                } else {
                    var27 = ((this.field4160.field1005 - this.field4160.field1006) * var26 >> 8) + this.field4160.field1006;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field4151[var24] = 0;
                }
            }
        }
        if (this.field4152 > 0 && this.field4167 > 0) {
            int var28 = (int) ((double) this.field4152 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field4151[var29] += field4151[var29 - var28] * this.field4167 / 100;
            }
        }
        if (this.field4150.field514[0] > 0 || this.field4150.field514[1] > 0) {
            this.field4164.method543();
            int var30 = this.field4164.method542(arg0 + 1);
            int var31 = this.field4150.method233(0, (float) var30 / 65536.0F);
            int var32 = this.field4150.method233(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field4151[var31 + var33] * (long) class35.field515 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field4151[var31 + var33 - var36 - 1] * (long) class35.field509[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field4151[var33 - var37 - 1] * (long) class35.field509[1][var37] >> 16);
                    }
                    field4151[var33] = var35;
                    var30 = this.field4164.method542(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field4151[var31 + var33] * (long) class35.field515 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field4151[var31 + var33 - var40 - 1] * (long) class35.field509[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field4151[var33 - var41 - 1] * (long) class35.field509[1][var41] >> 16);
                        }
                        field4151[var33] = var39;
                        var30 = this.field4164.method542(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field4151[var31 + var33 - var43 - 1] * (long) class35.field509[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field4151[var33 - var44 - 1] * (long) class35.field509[1][var44] >> 16);
                            }
                            field4151[var33] = var42;
                            this.field4164.method542(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field4150.method233(0, (float) var30 / 65536.0F);
                    var32 = this.field4150.method233(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field4151[var46] < -32768) {
                field4151[var46] = -32768;
            }
            if (field4151[var46] > 32767) {
                field4151[var46] = 32767;
            }
        }
        return field4151;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ls;)V", line = 289)
    public final void method1748(class170 arg0) {
        this.field4170 = new class66();
        this.field4170.method544(arg0);
        this.field4168 = new class66();
        this.field4168.method544(arg0);
        int var2 = arg0.method1221(107);
        if (var2 != 0) {
            arg0.field2787--;
            this.field4163 = new class66();
            this.field4163.method544(arg0);
            this.field4154 = new class66();
            this.field4154.method544(arg0);
        }
        int var3 = arg0.method1221(92);
        if (var3 != 0) {
            arg0.field2787--;
            this.field4169 = new class66();
            this.field4169.method544(arg0);
            this.field4156 = new class66();
            this.field4156.method544(arg0);
        }
        int var4 = arg0.method1221(72);
        if (var4 != 0) {
            arg0.field2787--;
            this.field4160 = new class66();
            this.field4160.method544(arg0);
            this.field4173 = new class66();
            this.field4173.method544(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1249(false);
            if (var6 == 0) {
                break;
            }
            this.field4158[var5] = var6;
            this.field4157[var5] = arg0.method1232((byte) 121);
            this.field4172[var5] = arg0.method1249(false);
        }
        this.field4152 = arg0.method1249(false);
        this.field4167 = arg0.method1249(false);
        this.field4149 = arg0.method1214(-18254);
        this.field4161 = arg0.method1214(-18254);
        this.field4150 = new class35();
        this.field4164 = new class66();
        this.field4150.method238(arg0, this.field4164);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)I", line = 350)
    private final int method1749(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4155[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4153[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4153[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4155 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4155[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4151 = new int[220500];
        field4162 = new int[5];
        field4159 = new int[5];
        field4165 = new int[5];
        field4166 = new int[5];
        field4171 = new int[5];
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "()V", line = 411)
    public static void method1750() {
        field4151 = null;
        field4153 = null;
        field4155 = null;
        field4165 = null;
        field4159 = null;
        field4171 = null;
        field4162 = null;
        field4166 = null;
    }
}
