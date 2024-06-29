import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class402 {

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "[I")
    private int[] field5564 = new int[5];

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
    private int field5567 = 100;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    private int field5563 = 0;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
    public int field5577 = 0;

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "[I")
    private int[] field5570 = new int[5];

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
    public int field5572 = 500;

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "[I")
    private int[] field5580 = new int[5];

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "[I")
    private static int[] field5579 = new int[32768];

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "[I")
    private static int[] field5569;

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "[I")
    private static int[] field5568;

    @OriginalMember(owner = "client!ms", name = "u", descriptor = "[I")
    private static int[] field5581;

    @OriginalMember(owner = "client!ms", name = "v", descriptor = "[I")
    private static int[] field5582;

    @OriginalMember(owner = "client!ms", name = "w", descriptor = "[I")
    private static int[] field5583;

    @OriginalMember(owner = "client!ms", name = "x", descriptor = "[I")
    private static int[] field5584;

    @OriginalMember(owner = "client!ms", name = "y", descriptor = "[I")
    private static int[] field5585;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "Liba;")
    private class302 field5578;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "Lav;")
    private class414 field5561;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "Lav;")
    private class414 field5562;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "Lav;")
    private class414 field5565;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "Lav;")
    private class414 field5566;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "Lav;")
    private class414 field5571;

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "Lav;")
    private class414 field5573;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "Lav;")
    private class414 field5574;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "Lav;")
    private class414 field5575;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "Lav;")
    private class414 field5576;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field5579[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field5569 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field5569[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field5568 = new int[220500];
        field5581 = new int[5];
        field5582 = new int[5];
        field5583 = new int[5];
        field5584 = new int[5];
        field5585 = new int[5];
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)I", line = 7)
    private final int method2441(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field5569[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field5579[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lvj;)V", line = 38)
    public final void method2442(class26 arg0) {
        this.field5573 = new class414();
        this.field5573.method2522(arg0);
        this.field5571 = new class414();
        this.field5571.method2522(arg0);
        int var2 = arg0.method194((byte) 119);
        if (var2 != 0) {
            arg0.field330--;
            this.field5561 = new class414();
            this.field5561.method2522(arg0);
            this.field5574 = new class414();
            this.field5574.method2522(arg0);
        }
        int var3 = arg0.method194((byte) 119);
        if (var3 != 0) {
            arg0.field330--;
            this.field5562 = new class414();
            this.field5562.method2522(arg0);
            this.field5565 = new class414();
            this.field5565.method2522(arg0);
        }
        int var4 = arg0.method194((byte) 119);
        if (var4 != 0) {
            arg0.field330--;
            this.field5575 = new class414();
            this.field5575.method2522(arg0);
            this.field5566 = new class414();
            this.field5566.method2522(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method190(-27226);
            if (var6 == 0) {
                break;
            }
            this.field5580[var5] = var6;
            this.field5570[var5] = arg0.method183(true);
            this.field5564[var5] = arg0.method190(-27226);
        }
        this.field5563 = arg0.method190(-27226);
        this.field5567 = arg0.method190(-27226);
        this.field5572 = arg0.method193(2);
        this.field5577 = arg0.method193(2);
        this.field5578 = new class302();
        this.field5576 = new class414();
        this.field5578.method1772(arg0, this.field5576);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "()V", line = 151)
    public static void method2443() {
        field5568 = null;
        field5579 = null;
        field5569 = null;
        field5585 = null;
        field5582 = null;
        field5583 = null;
        field5584 = null;
        field5581 = null;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)[I", line = 165)
    public final int[] method2444(int arg0, int arg1) {
        class34.method239(field5568, 0, arg0);
        if (arg1 < 10) {
            return field5568;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field5573.method2523();
        this.field5571.method2523();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field5561 != null) {
            this.field5561.method2523();
            this.field5574.method2523();
            var5 = (int) ((double) (this.field5561.field5761 - this.field5561.field5760) * 32.768D / var3);
            var6 = (int) ((double) this.field5561.field5760 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field5562 != null) {
            this.field5562.method2523();
            this.field5565.method2523();
            var8 = (int) ((double) (this.field5562.field5761 - this.field5562.field5760) * 32.768D / var3);
            var9 = (int) ((double) this.field5562.field5760 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field5580[var11] != 0) {
                field5585[var11] = 0;
                field5582[var11] = (int) ((double) this.field5564[var11] * var3);
                field5583[var11] = (this.field5580[var11] << 14) / 100;
                field5584[var11] = (int) ((double) (this.field5573.field5761 - this.field5573.field5760) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field5570[var11]) / var3);
                field5581[var11] = (int) ((double) this.field5573.field5760 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field5573.method2521(arg0);
            int var40 = this.field5571.method2521(arg0);
            if (this.field5561 != null) {
                int var41 = this.field5561.method2521(arg0);
                int var42 = this.field5574.method2521(arg0);
                var39 += this.method2441(var7, var42, this.field5561.field5765) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field5562 != null) {
                int var43 = this.field5562.method2521(arg0);
                int var44 = this.field5565.method2521(arg0);
                var40 = var40 * ((this.method2441(var10, var44, this.field5562.field5765) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field5580[var45] != 0) {
                    int var46 = field5582[var45] + var12;
                    if (var46 < arg0) {
                        field5568[var46] += this.method2441(field5585[var45], field5583[var45] * var40 >> 15, this.field5573.field5765);
                        field5585[var45] += (field5584[var45] * var39 >> 16) + field5581[var45];
                    }
                }
            }
        }
        if (this.field5575 != null) {
            this.field5575.method2523();
            this.field5566.method2523();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field5575.method2521(arg0);
                int var18 = this.field5566.method2521(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field5575.field5761 - this.field5575.field5760) * var17 >> 8) + this.field5575.field5760;
                } else {
                    var19 = ((this.field5575.field5761 - this.field5575.field5760) * var18 >> 8) + this.field5575.field5760;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field5568[var16] = 0;
                }
            }
        }
        if (this.field5563 > 0 && this.field5567 > 0) {
            int var20 = (int) ((double) this.field5563 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field5568[var21] += field5568[var21 - var20] * this.field5567 / 100;
            }
        }
        if (this.field5578.field3928[0] > 0 || this.field5578.field3928[1] > 0) {
            this.field5576.method2523();
            int var22 = this.field5576.method2521(arg0 + 1);
            int var23 = this.field5578.method1769(0, (float) var22 / 65536.0F);
            int var24 = this.field5578.method1769(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field5568[var23 + var25] * (long) class302.field3930 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field5568[var23 + var25 - var36 - 1] * (long) class302.field3929[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field5568[var25 - var37 - 1] * (long) class302.field3929[1][var37] >> 16);
                    }
                    field5568[var25] = var35;
                    var22 = this.field5576.method2521(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field5568[var23 + var25] * (long) class302.field3930 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field5568[var23 + var25 - var33 - 1] * (long) class302.field3929[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field5568[var25 - var34 - 1] * (long) class302.field3929[1][var34] >> 16);
                        }
                        field5568[var25] = var32;
                        var22 = this.field5576.method2521(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field5568[var23 + var25 - var29 - 1] * (long) class302.field3929[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field5568[var25 - var30 - 1] * (long) class302.field3929[1][var30] >> 16);
                            }
                            field5568[var25] = var28;
                            this.field5576.method2521(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field5578.method1769(0, (float) var22 / 65536.0F);
                    var24 = this.field5578.method1769(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field5568[var38] < -32768) {
                field5568[var38] = -32768;
            }
            if (field5568[var38] > 32767) {
                field5568[var38] = 32767;
            }
        }
        return field5568;
    }
}
