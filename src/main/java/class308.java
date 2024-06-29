import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class308 {

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "[I")
    private int[] field4682 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "[I")
    private int[] field4685 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "[I")
    private int[] field4689 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    private int field4690 = 100;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    public int field4693 = 0;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    private int field4694 = 0;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "I")
    public int field4695 = 500;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "[I")
    private static int[] field4680 = new int[32768];

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "[I")
    private static int[] field4688;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "[I")
    private static int[] field4697;

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "[I")
    private static int[] field4700;

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "[I")
    private static int[] field4699;

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "[I")
    private static int[] field4701;

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "[I")
    private static int[] field4702;

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "[I")
    private static int[] field4703;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "Lkn;")
    private class152 field4684;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "Lpm;")
    private class261 field4679;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "Lpm;")
    private class261 field4681;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "Lpm;")
    private class261 field4683;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "Lpm;")
    private class261 field4686;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "Lpm;")
    private class261 field4687;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "Lpm;")
    private class261 field4691;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "Lpm;")
    private class261 field4692;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "Lpm;")
    private class261 field4696;

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "Lpm;")
    private class261 field4698;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "()V", line = 5)
    public static void method2060() {
        field4697 = null;
        field4680 = null;
        field4688 = null;
        field4699 = null;
        field4702 = null;
        field4700 = null;
        field4701 = null;
        field4703 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)[I", line = 31)
    public final int[] method2061(int arg0, int arg1) {
        class129.method855(field4697, 0, arg0);
        if (arg1 < 10) {
            return field4697;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4687.method1750();
        this.field4681.method1750();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4692 != null) {
            this.field4692.method1750();
            this.field4691.method1750();
            var5 = (int) ((double) (this.field4692.field4074 - this.field4692.field4075) * 32.768D / var3);
            var6 = (int) ((double) this.field4692.field4075 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4686 != null) {
            this.field4686.method1750();
            this.field4683.method1750();
            var8 = (int) ((double) (this.field4686.field4074 - this.field4686.field4075) * 32.768D / var3);
            var9 = (int) ((double) this.field4686.field4075 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4685[var11] != 0) {
                field4699[var11] = 0;
                field4702[var11] = (int) ((double) this.field4689[var11] * var3);
                field4700[var11] = (this.field4685[var11] << 14) / 100;
                field4701[var11] = (int) ((double) (this.field4687.field4074 - this.field4687.field4075) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4682[var11]) / var3);
                field4703[var11] = (int) ((double) this.field4687.field4075 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field4687.method1752(arg0);
            int var14 = this.field4681.method1752(arg0);
            if (this.field4692 != null) {
                int var15 = this.field4692.method1752(arg0);
                int var16 = this.field4691.method1752(arg0);
                var13 += this.method2062(var7, var16, this.field4692.field4073) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field4686 != null) {
                int var17 = this.field4686.method1752(arg0);
                int var18 = this.field4683.method1752(arg0);
                var14 = var14 * ((this.method2062(var10, var18, this.field4686.field4073) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field4685[var19] != 0) {
                    int var20 = field4702[var19] + var12;
                    if (var20 < arg0) {
                        field4697[var20] += this.method2062(field4699[var19], field4700[var19] * var14 >> 15, this.field4687.field4073);
                        field4699[var19] += (field4701[var19] * var13 >> 16) + field4703[var19];
                    }
                }
            }
        }
        if (this.field4698 != null) {
            this.field4698.method1750();
            this.field4679.method1750();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field4698.method1752(arg0);
                int var26 = this.field4679.method1752(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field4698.field4074 - this.field4698.field4075) * var25 >> 8) + this.field4698.field4075;
                } else {
                    var27 = ((this.field4698.field4074 - this.field4698.field4075) * var26 >> 8) + this.field4698.field4075;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field4697[var24] = 0;
                }
            }
        }
        if (this.field4694 > 0 && this.field4690 > 0) {
            int var28 = (int) ((double) this.field4694 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field4697[var29] += field4697[var29 - var28] * this.field4690 / 100;
            }
        }
        if (this.field4684.field2475[0] > 0 || this.field4684.field2475[1] > 0) {
            this.field4696.method1750();
            int var30 = this.field4696.method1752(arg0 + 1);
            int var31 = this.field4684.method991(0, (float) var30 / 65536.0F);
            int var32 = this.field4684.method991(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field4697[var31 + var33] * (long) class152.field2476 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field4697[var31 + var33 - var36 - 1] * (long) class152.field2472[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field4697[var33 - var37 - 1] * (long) class152.field2472[1][var37] >> 16);
                    }
                    field4697[var33] = var35;
                    var30 = this.field4696.method1752(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field4697[var31 + var33] * (long) class152.field2476 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field4697[var31 + var33 - var40 - 1] * (long) class152.field2472[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field4697[var33 - var41 - 1] * (long) class152.field2472[1][var41] >> 16);
                        }
                        field4697[var33] = var39;
                        var30 = this.field4696.method1752(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field4697[var31 + var33 - var43 - 1] * (long) class152.field2472[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field4697[var33 - var44 - 1] * (long) class152.field2472[1][var44] >> 16);
                            }
                            field4697[var33] = var42;
                            this.field4696.method1752(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field4684.method991(0, (float) var30 / 65536.0F);
                    var32 = this.field4684.method991(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field4697[var46] < -32768) {
                field4697[var46] = -32768;
            }
            if (field4697[var46] > 32767) {
                field4697[var46] = 32767;
            }
        }
        return field4697;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)I", line = 335)
    private final int method2062(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4688[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4680[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4680[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4688 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4688[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4697 = new int[220500];
        field4700 = new int[5];
        field4699 = new int[5];
        field4701 = new int[5];
        field4702 = new int[5];
        field4703 = new int[5];
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lag;)V", line = 389)
    public final void method2063(class202 arg0) {
        this.field4687 = new class261();
        this.field4687.method1751(arg0);
        this.field4681 = new class261();
        this.field4681.method1751(arg0);
        int var2 = arg0.method1317((byte) -97);
        if (var2 != 0) {
            arg0.field3249--;
            this.field4692 = new class261();
            this.field4692.method1751(arg0);
            this.field4691 = new class261();
            this.field4691.method1751(arg0);
        }
        int var3 = arg0.method1317((byte) -128);
        if (var3 != 0) {
            arg0.field3249--;
            this.field4686 = new class261();
            this.field4686.method1751(arg0);
            this.field4683 = new class261();
            this.field4683.method1751(arg0);
        }
        int var4 = arg0.method1317((byte) -78);
        if (var4 != 0) {
            arg0.field3249--;
            this.field4698 = new class261();
            this.field4698.method1751(arg0);
            this.field4679 = new class261();
            this.field4679.method1751(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1296((byte) 91);
            if (var6 == 0) {
                break;
            }
            this.field4685[var5] = var6;
            this.field4682[var5] = arg0.method1341((byte) 79);
            this.field4689[var5] = arg0.method1296((byte) 91);
        }
        this.field4694 = arg0.method1296((byte) 91);
        this.field4690 = arg0.method1296((byte) 91);
        this.field4695 = arg0.method1315(14289);
        this.field4693 = arg0.method1315(14289);
        this.field4684 = new class152();
        this.field4696 = new class261();
        this.field4684.method989(arg0, this.field4696);
    }
}
