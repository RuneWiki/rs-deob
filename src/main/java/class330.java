import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class330 {

    @OriginalMember(owner = "client!so", name = "d", descriptor = "[I")
    private int[] field4168 = new int[5];

    @OriginalMember(owner = "client!so", name = "h", descriptor = "I")
    public int field4172 = 500;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "I")
    private int field4175 = 0;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "[I")
    private int[] field4173 = new int[5];

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    private int field4165 = 100;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "[I")
    private int[] field4180 = new int[5];

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public int field4169 = 0;

    @OriginalMember(owner = "client!so", name = "s", descriptor = "[I")
    private static int[] field4183 = new int[32768];

    @OriginalMember(owner = "client!so", name = "g", descriptor = "[I")
    private static int[] field4171;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "[I")
    private static int[] field4174;

    @OriginalMember(owner = "client!so", name = "u", descriptor = "[I")
    private static int[] field4185;

    @OriginalMember(owner = "client!so", name = "w", descriptor = "[I")
    private static int[] field4187;

    @OriginalMember(owner = "client!so", name = "t", descriptor = "[I")
    private static int[] field4184;

    @OriginalMember(owner = "client!so", name = "y", descriptor = "[I")
    private static int[] field4189;

    @OriginalMember(owner = "client!so", name = "x", descriptor = "[I")
    private static int[] field4188;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "Lkh;")
    private class13 field4167;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "Lnm;")
    private class332 field4166;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "Lnm;")
    private class332 field4170;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "Lnm;")
    private class332 field4176;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "Lnm;")
    private class332 field4177;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "Lnm;")
    private class332 field4178;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "Lnm;")
    private class332 field4179;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "Lnm;")
    private class332 field4181;

    @OriginalMember(owner = "client!so", name = "r", descriptor = "Lnm;")
    private class332 field4182;

    @OriginalMember(owner = "client!so", name = "v", descriptor = "Lnm;")
    private class332 field4186;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "()V")
    public static void method1919() {
        field4174 = null;
        field4183 = null;
        field4171 = null;
        field4184 = null;
        field4185 = null;
        field4189 = null;
        field4188 = null;
        field4187 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(III)I")
    private final int method1920(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4171[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4183[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lfh;)V")
    public final void method1921(class463 arg0) {
        this.field4182 = new class332();
        this.field4182.method1926(arg0);
        this.field4178 = new class332();
        this.field4178.method1926(arg0);
        int var2 = arg0.method2737(false);
        if (var2 != 0) {
            arg0.field6631--;
            this.field4186 = new class332();
            this.field4186.method1926(arg0);
            this.field4166 = new class332();
            this.field4166.method1926(arg0);
        }
        int var3 = arg0.method2737(false);
        if (var3 != 0) {
            arg0.field6631--;
            this.field4176 = new class332();
            this.field4176.method1926(arg0);
            this.field4181 = new class332();
            this.field4181.method1926(arg0);
        }
        int var4 = arg0.method2737(false);
        if (var4 != 0) {
            arg0.field6631--;
            this.field4179 = new class332();
            this.field4179.method1926(arg0);
            this.field4170 = new class332();
            this.field4170.method1926(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2763(-514944944);
            if (var6 == 0) {
                break;
            }
            this.field4173[var5] = var6;
            this.field4180[var5] = arg0.method2750((byte) -40);
            this.field4168[var5] = arg0.method2763(-514944944);
        }
        this.field4175 = arg0.method2763(-514944944);
        this.field4165 = arg0.method2763(-514944944);
        this.field4172 = arg0.method2758((byte) 109);
        this.field4169 = arg0.method2758((byte) 108);
        this.field4167 = new class13();
        this.field4177 = new class332();
        this.field4167.method100(arg0, this.field4177);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)[I")
    public final int[] method1922(int arg0, int arg1) {
        class318.method1873(field4174, 0, arg0);
        if (arg1 < 10) {
            return field4174;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4182.method1927();
        this.field4178.method1927();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4186 != null) {
            this.field4186.method1927();
            this.field4166.method1927();
            var5 = (int) ((double) (this.field4186.field4193 - this.field4186.field4191) * 32.768D / var3);
            var6 = (int) ((double) this.field4186.field4191 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4176 != null) {
            this.field4176.method1927();
            this.field4181.method1927();
            var8 = (int) ((double) (this.field4176.field4193 - this.field4176.field4191) * 32.768D / var3);
            var9 = (int) ((double) this.field4176.field4191 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4173[var11] != 0) {
                field4184[var11] = 0;
                field4185[var11] = (int) ((double) this.field4168[var11] * var3);
                field4189[var11] = (this.field4173[var11] << 14) / 100;
                field4188[var11] = (int) ((double) (this.field4182.field4193 - this.field4182.field4191) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4180[var11]) / var3);
                field4187[var11] = (int) ((double) this.field4182.field4191 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4182.method1928(arg0);
            int var40 = this.field4178.method1928(arg0);
            if (this.field4186 != null) {
                int var41 = this.field4186.method1928(arg0);
                int var42 = this.field4166.method1928(arg0);
                var39 += this.method1920(var7, var42, this.field4186.field4194) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field4176 != null) {
                int var43 = this.field4176.method1928(arg0);
                int var44 = this.field4181.method1928(arg0);
                var40 = var40 * ((this.method1920(var10, var44, this.field4176.field4194) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field4173[var45] != 0) {
                    int var46 = field4185[var45] + var12;
                    if (var46 < arg0) {
                        field4174[var46] += this.method1920(field4184[var45], field4189[var45] * var40 >> 15, this.field4182.field4194);
                        field4184[var45] += (field4188[var45] * var39 >> 16) + field4187[var45];
                    }
                }
            }
        }
        if (this.field4179 != null) {
            this.field4179.method1927();
            this.field4170.method1927();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field4179.method1928(arg0);
                int var18 = this.field4170.method1928(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field4179.field4193 - this.field4179.field4191) * var17 >> 8) + this.field4179.field4191;
                } else {
                    var19 = ((this.field4179.field4193 - this.field4179.field4191) * var18 >> 8) + this.field4179.field4191;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4174[var16] = 0;
                }
            }
        }
        if (this.field4175 > 0 && this.field4165 > 0) {
            int var20 = (int) ((double) this.field4175 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4174[var21] += field4174[var21 - var20] * this.field4165 / 100;
            }
        }
        if (this.field4167.field221[0] > 0 || this.field4167.field221[1] > 0) {
            this.field4177.method1927();
            int var22 = this.field4177.method1928(arg0 + 1);
            int var23 = this.field4167.method102(0, (float) var22 / 65536.0F);
            int var24 = this.field4167.method102(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4174[var23 + var25] * (long) class13.field222 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4174[var23 + var25 - var36 - 1] * (long) class13.field219[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4174[var25 - var37 - 1] * (long) class13.field219[1][var37] >> 16);
                    }
                    field4174[var25] = var35;
                    var22 = this.field4177.method1928(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4174[var23 + var25] * (long) class13.field222 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4174[var23 + var25 - var33 - 1] * (long) class13.field219[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4174[var25 - var34 - 1] * (long) class13.field219[1][var34] >> 16);
                        }
                        field4174[var25] = var32;
                        var22 = this.field4177.method1928(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4174[var23 + var25 - var29 - 1] * (long) class13.field219[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4174[var25 - var30 - 1] * (long) class13.field219[1][var30] >> 16);
                            }
                            field4174[var25] = var28;
                            this.field4177.method1928(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field4167.method102(0, (float) var22 / 65536.0F);
                    var24 = this.field4167.method102(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4174[var38] < -32768) {
                field4174[var38] = -32768;
            }
            if (field4174[var38] > 32767) {
                field4174[var38] = 32767;
            }
        }
        return field4174;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4183[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4171 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4171[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4174 = new int[220500];
        field4185 = new int[5];
        field4187 = new int[5];
        field4184 = new int[5];
        field4189 = new int[5];
        field4188 = new int[5];
    }
}
