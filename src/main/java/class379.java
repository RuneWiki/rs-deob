import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class379 {

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "I")
    private int field5568 = 0;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "I")
    private int field5563 = 100;

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "[I")
    private int[] field5566 = new int[5];

    @OriginalMember(owner = "client!bba", name = "k", descriptor = "[I")
    private int[] field5573 = new int[5];

    @OriginalMember(owner = "client!bba", name = "q", descriptor = "[I")
    private int[] field5579 = new int[5];

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "I")
    public int field5567 = 0;

    @OriginalMember(owner = "client!bba", name = "r", descriptor = "I")
    public int field5580 = 500;

    @OriginalMember(owner = "client!bba", name = "p", descriptor = "[I")
    private static int[] field5578 = new int[32768];

    @OriginalMember(owner = "client!bba", name = "o", descriptor = "[I")
    private static int[] field5577;

    @OriginalMember(owner = "client!bba", name = "l", descriptor = "[I")
    private static int[] field5574;

    @OriginalMember(owner = "client!bba", name = "t", descriptor = "[I")
    private static int[] field5582;

    @OriginalMember(owner = "client!bba", name = "u", descriptor = "[I")
    private static int[] field5583;

    @OriginalMember(owner = "client!bba", name = "x", descriptor = "[I")
    private static int[] field5586;

    @OriginalMember(owner = "client!bba", name = "y", descriptor = "[I")
    private static int[] field5587;

    @OriginalMember(owner = "client!bba", name = "v", descriptor = "[I")
    private static int[] field5584;

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "Lun;")
    private class152 field5565;

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "Lgd;")
    private class250 field5564;

    @OriginalMember(owner = "client!bba", name = "g", descriptor = "Lgd;")
    private class250 field5569;

    @OriginalMember(owner = "client!bba", name = "h", descriptor = "Lgd;")
    private class250 field5570;

    @OriginalMember(owner = "client!bba", name = "i", descriptor = "Lgd;")
    private class250 field5571;

    @OriginalMember(owner = "client!bba", name = "j", descriptor = "Lgd;")
    private class250 field5572;

    @OriginalMember(owner = "client!bba", name = "m", descriptor = "Lgd;")
    private class250 field5575;

    @OriginalMember(owner = "client!bba", name = "n", descriptor = "Lgd;")
    private class250 field5576;

    @OriginalMember(owner = "client!bba", name = "s", descriptor = "Lgd;")
    private class250 field5581;

    @OriginalMember(owner = "client!bba", name = "w", descriptor = "Lgd;")
    private class250 field5585;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field5578[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field5577 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field5577[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field5574 = new int[220500];
        field5582 = new int[5];
        field5583 = new int[5];
        field5586 = new int[5];
        field5587 = new int[5];
        field5584 = new int[5];
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method2300(int arg0, int arg1) {
        class164.method1145(field5574, 0, arg0);
        if (arg1 < 10) {
            return field5574;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field5581.method1584();
        this.field5572.method1584();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field5576 != null) {
            this.field5576.method1584();
            this.field5585.method1584();
            var5 = (int) ((double) (this.field5576.field3653 - this.field5576.field3655) * 32.768D / var3);
            var6 = (int) ((double) this.field5576.field3655 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field5570 != null) {
            this.field5570.method1584();
            this.field5575.method1584();
            var8 = (int) ((double) (this.field5570.field3653 - this.field5570.field3655) * 32.768D / var3);
            var9 = (int) ((double) this.field5570.field3655 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field5573[var11] != 0) {
                field5586[var11] = 0;
                field5587[var11] = (int) ((double) this.field5579[var11] * var3);
                field5583[var11] = (this.field5573[var11] << 14) / 100;
                field5584[var11] = (int) ((double) (this.field5581.field3653 - this.field5581.field3655) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field5566[var11]) / var3);
                field5582[var11] = (int) ((double) this.field5581.field3655 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field5581.method1585(arg0);
            int var40 = this.field5572.method1585(arg0);
            if (this.field5576 != null) {
                int var41 = this.field5576.method1585(arg0);
                int var42 = this.field5585.method1585(arg0);
                var39 += this.method2303(var7, var42, this.field5576.field3652) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field5570 != null) {
                int var43 = this.field5570.method1585(arg0);
                int var44 = this.field5575.method1585(arg0);
                var40 = var40 * ((this.method2303(var10, var44, this.field5570.field3652) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field5573[var45] != 0) {
                    int var46 = field5587[var45] + var12;
                    if (var46 < arg0) {
                        field5574[var46] += this.method2303(field5586[var45], field5583[var45] * var40 >> 15, this.field5581.field3652);
                        field5586[var45] += (field5584[var45] * var39 >> 16) + field5582[var45];
                    }
                }
            }
        }
        if (this.field5571 != null) {
            this.field5571.method1584();
            this.field5569.method1584();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field5571.method1585(arg0);
                int var18 = this.field5569.method1585(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field5571.field3653 - this.field5571.field3655) * var17 >> 8) + this.field5571.field3655;
                } else {
                    var19 = ((this.field5571.field3653 - this.field5571.field3655) * var18 >> 8) + this.field5571.field3655;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field5574[var16] = 0;
                }
            }
        }
        if (this.field5568 > 0 && this.field5563 > 0) {
            int var20 = (int) ((double) this.field5568 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field5574[var21] += field5574[var21 - var20] * this.field5563 / 100;
            }
        }
        if (this.field5565.field2292[0] > 0 || this.field5565.field2292[1] > 0) {
            this.field5564.method1584();
            int var22 = this.field5564.method1585(arg0 + 1);
            int var23 = this.field5565.method1086(0, (float) var22 / 65536.0F);
            int var24 = this.field5565.method1086(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field5574[var23 + var25] * (long) class152.field2287 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field5574[var23 + var25 - var36 - 1] * (long) class152.field2285[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field5574[var25 - var37 - 1] * (long) class152.field2285[1][var37] >> 16);
                    }
                    field5574[var25] = var35;
                    var22 = this.field5564.method1585(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field5574[var23 + var25] * (long) class152.field2287 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field5574[var23 + var25 - var33 - 1] * (long) class152.field2285[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field5574[var25 - var34 - 1] * (long) class152.field2285[1][var34] >> 16);
                        }
                        field5574[var25] = var32;
                        var22 = this.field5564.method1585(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field5574[var23 + var25 - var29 - 1] * (long) class152.field2285[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field5574[var25 - var30 - 1] * (long) class152.field2285[1][var30] >> 16);
                            }
                            field5574[var25] = var28;
                            this.field5564.method1585(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field5565.method1086(0, (float) var22 / 65536.0F);
                    var24 = this.field5565.method1086(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field5574[var38] < -32768) {
                field5574[var38] = -32768;
            }
            if (field5574[var38] > 32767) {
                field5574[var38] = 32767;
            }
        }
        return field5574;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lco;)V", line = 294)
    public final void method2301(class268 arg0) {
        this.field5581 = new class250();
        this.field5581.method1583(arg0);
        this.field5572 = new class250();
        this.field5572.method1583(arg0);
        int var2 = arg0.method1738(255);
        if (var2 != 0) {
            arg0.field3913--;
            this.field5576 = new class250();
            this.field5576.method1583(arg0);
            this.field5585 = new class250();
            this.field5585.method1583(arg0);
        }
        int var3 = arg0.method1738(255);
        if (var3 != 0) {
            arg0.field3913--;
            this.field5570 = new class250();
            this.field5570.method1583(arg0);
            this.field5575 = new class250();
            this.field5575.method1583(arg0);
        }
        int var4 = arg0.method1738(255);
        if (var4 != 0) {
            arg0.field3913--;
            this.field5571 = new class250();
            this.field5571.method1583(arg0);
            this.field5569 = new class250();
            this.field5569.method1583(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1749((byte) 105);
            if (var6 == 0) {
                break;
            }
            this.field5573[var5] = var6;
            this.field5566[var5] = arg0.method1708(49152);
            this.field5579[var5] = arg0.method1749((byte) 123);
        }
        this.field5568 = arg0.method1749((byte) 114);
        this.field5563 = arg0.method1749((byte) 91);
        this.field5580 = arg0.method1745(32132);
        this.field5567 = arg0.method1745(32132);
        this.field5565 = new class152();
        this.field5564 = new class250();
        this.field5565.method1082(arg0, this.field5564);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "()V", line = 372)
    public static void method2302() {
        field5574 = null;
        field5578 = null;
        field5577 = null;
        field5586 = null;
        field5587 = null;
        field5583 = null;
        field5584 = null;
        field5582 = null;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(III)I", line = 387)
    private final int method2303(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field5577[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field5578[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }
}
