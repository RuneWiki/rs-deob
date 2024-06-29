import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class321 {

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public int field4399 = 500;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    private int field4391 = 100;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    private int field4398 = 0;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public int field4395 = 0;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "[I")
    private int[] field4392 = new int[5];

    @OriginalMember(owner = "client!j", name = "m", descriptor = "[I")
    private int[] field4401 = new int[5];

    @OriginalMember(owner = "client!j", name = "y", descriptor = "[I")
    private int[] field4413 = new int[5];

    @OriginalMember(owner = "client!j", name = "h", descriptor = "[I")
    private static int[] field4396 = new int[32768];

    @OriginalMember(owner = "client!j", name = "s", descriptor = "[I")
    private static int[] field4407;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "[I")
    private static int[] field4403;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "[I")
    private static int[] field4408;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "[I")
    private static int[] field4410;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "[I")
    private static int[] field4411;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "[I")
    private static int[] field4412;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "[I")
    private static int[] field4409;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "Lpd;")
    private class140 field4389;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Lpd;")
    private class140 field4390;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "Lpd;")
    private class140 field4393;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "Lpd;")
    private class140 field4394;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Lpd;")
    private class140 field4397;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "Lpd;")
    private class140 field4402;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Lpd;")
    private class140 field4404;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "Lpd;")
    private class140 field4405;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "Lpd;")
    private class140 field4406;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Lgp;")
    private class31 field4400;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()V")
    public static void method2072() {
        field4403 = null;
        field4396 = null;
        field4407 = null;
        field4412 = null;
        field4410 = null;
        field4411 = null;
        field4409 = null;
        field4408 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[I")
    public final int[] method2073(int arg0, int arg1) {
        class36.method349(field4403, 0, arg0);
        if (arg1 < 10) {
            return field4403;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4397.method964();
        this.field4405.method964();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4406 != null) {
            this.field4406.method964();
            this.field4389.method964();
            var5 = (int) ((double) (this.field4406.field2001 - this.field4406.field1999) * 32.768D / var3);
            var6 = (int) ((double) this.field4406.field1999 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4402 != null) {
            this.field4402.method964();
            this.field4394.method964();
            var8 = (int) ((double) (this.field4402.field2001 - this.field4402.field1999) * 32.768D / var3);
            var9 = (int) ((double) this.field4402.field1999 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4401[var11] != 0) {
                field4412[var11] = 0;
                field4410[var11] = (int) ((double) this.field4413[var11] * var3);
                field4411[var11] = (this.field4401[var11] << 14) / 100;
                field4409[var11] = (int) ((double) (this.field4397.field2001 - this.field4397.field1999) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4392[var11]) / var3);
                field4408[var11] = (int) ((double) this.field4397.field1999 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4397.method963(arg0);
            int var40 = this.field4405.method963(arg0);
            if (this.field4406 != null) {
                int var41 = this.field4406.method963(arg0);
                int var42 = this.field4389.method963(arg0);
                var39 += this.method2074(var7, var42, this.field4406.field2003) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field4402 != null) {
                int var43 = this.field4402.method963(arg0);
                int var44 = this.field4394.method963(arg0);
                var40 = var40 * ((this.method2074(var10, var44, this.field4402.field2003) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field4401[var45] != 0) {
                    int var46 = field4410[var45] + var12;
                    if (var46 < arg0) {
                        field4403[var46] += this.method2074(field4412[var45], field4411[var45] * var40 >> 15, this.field4397.field2003);
                        field4412[var45] += (field4409[var45] * var39 >> 16) + field4408[var45];
                    }
                }
            }
        }
        if (this.field4404 != null) {
            this.field4404.method964();
            this.field4390.method964();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field4404.method963(arg0);
                int var18 = this.field4390.method963(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field4404.field2001 - this.field4404.field1999) * var17 >> 8) + this.field4404.field1999;
                } else {
                    var19 = ((this.field4404.field2001 - this.field4404.field1999) * var18 >> 8) + this.field4404.field1999;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4403[var16] = 0;
                }
            }
        }
        if (this.field4398 > 0 && this.field4391 > 0) {
            int var20 = (int) ((double) this.field4398 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4403[var21] += field4403[var21 - var20] * this.field4391 / 100;
            }
        }
        if (this.field4400.field503[0] > 0 || this.field4400.field503[1] > 0) {
            this.field4393.method964();
            int var22 = this.field4393.method963(arg0 + 1);
            int var23 = this.field4400.method316(0, (float) var22 / 65536.0F);
            int var24 = this.field4400.method316(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4403[var23 + var25] * (long) class31.field506 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4403[var23 + var25 - var36 - 1] * (long) class31.field501[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4403[var25 - var37 - 1] * (long) class31.field501[1][var37] >> 16);
                    }
                    field4403[var25] = var35;
                    var22 = this.field4393.method963(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4403[var23 + var25] * (long) class31.field506 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4403[var23 + var25 - var33 - 1] * (long) class31.field501[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4403[var25 - var34 - 1] * (long) class31.field501[1][var34] >> 16);
                        }
                        field4403[var25] = var32;
                        var22 = this.field4393.method963(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4403[var23 + var25 - var29 - 1] * (long) class31.field501[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4403[var25 - var30 - 1] * (long) class31.field501[1][var30] >> 16);
                            }
                            field4403[var25] = var28;
                            this.field4393.method963(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field4400.method316(0, (float) var22 / 65536.0F);
                    var24 = this.field4400.method316(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4403[var38] < -32768) {
                field4403[var38] = -32768;
            }
            if (field4403[var38] > 32767) {
                field4403[var38] = 32767;
            }
        }
        return field4403;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)I")
    private final int method2074(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4407[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4396[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lkh;)V")
    public final void method2075(class11 arg0) {
        this.field4397 = new class140();
        this.field4397.method961(arg0);
        this.field4405 = new class140();
        this.field4405.method961(arg0);
        int var2 = arg0.method172((byte) 52);
        if (var2 != 0) {
            arg0.field191--;
            this.field4406 = new class140();
            this.field4406.method961(arg0);
            this.field4389 = new class140();
            this.field4389.method961(arg0);
        }
        int var3 = arg0.method172((byte) 52);
        if (var3 != 0) {
            arg0.field191--;
            this.field4402 = new class140();
            this.field4402.method961(arg0);
            this.field4394 = new class140();
            this.field4394.method961(arg0);
        }
        int var4 = arg0.method172((byte) 52);
        if (var4 != 0) {
            arg0.field191--;
            this.field4404 = new class140();
            this.field4404.method961(arg0);
            this.field4390 = new class140();
            this.field4390.method961(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method175(255);
            if (var6 == 0) {
                break;
            }
            this.field4401[var5] = var6;
            this.field4392[var5] = arg0.method199((byte) -51);
            this.field4413[var5] = arg0.method175(255);
        }
        this.field4398 = arg0.method175(255);
        this.field4391 = arg0.method175(255);
        this.field4399 = arg0.method174(255);
        this.field4395 = arg0.method174(255);
        this.field4400 = new class31();
        this.field4393 = new class140();
        this.field4400.method318(arg0, this.field4393);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4396[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4407 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4407[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4403 = new int[220500];
        field4408 = new int[5];
        field4410 = new int[5];
        field4411 = new int[5];
        field4412 = new int[5];
        field4409 = new int[5];
    }
}
