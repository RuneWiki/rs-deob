import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class599 {

    @OriginalMember(owner = "client!aga", name = "k", descriptor = "I")
    private int field8669 = 100;

    @OriginalMember(owner = "client!aga", name = "h", descriptor = "[I")
    private int[] field8666 = new int[5];

    @OriginalMember(owner = "client!aga", name = "f", descriptor = "[I")
    private int[] field8664 = new int[5];

    @OriginalMember(owner = "client!aga", name = "s", descriptor = "I")
    private int field8677 = 0;

    @OriginalMember(owner = "client!aga", name = "m", descriptor = "I")
    public int field8671 = 500;

    @OriginalMember(owner = "client!aga", name = "g", descriptor = "I")
    public int field8665 = 0;

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "[I")
    private int[] field8663 = new int[5];

    @OriginalMember(owner = "client!aga", name = "o", descriptor = "[I")
    private static int[] field8673 = new int[32768];

    @OriginalMember(owner = "client!aga", name = "i", descriptor = "[I")
    private static int[] field8667;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "[I")
    private static int[] field8659;

    @OriginalMember(owner = "client!aga", name = "w", descriptor = "[I")
    private static int[] field8681;

    @OriginalMember(owner = "client!aga", name = "x", descriptor = "[I")
    private static int[] field8682;

    @OriginalMember(owner = "client!aga", name = "t", descriptor = "[I")
    private static int[] field8678;

    @OriginalMember(owner = "client!aga", name = "v", descriptor = "[I")
    private static int[] field8680;

    @OriginalMember(owner = "client!aga", name = "u", descriptor = "[I")
    private static int[] field8679;

    @OriginalMember(owner = "client!aga", name = "n", descriptor = "Lhca;")
    private class363 field8672;

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "Liea;")
    private class598 field8660;

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "Liea;")
    private class598 field8661;

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "Liea;")
    private class598 field8662;

    @OriginalMember(owner = "client!aga", name = "j", descriptor = "Liea;")
    private class598 field8668;

    @OriginalMember(owner = "client!aga", name = "l", descriptor = "Liea;")
    private class598 field8670;

    @OriginalMember(owner = "client!aga", name = "p", descriptor = "Liea;")
    private class598 field8674;

    @OriginalMember(owner = "client!aga", name = "q", descriptor = "Liea;")
    private class598 field8675;

    @OriginalMember(owner = "client!aga", name = "r", descriptor = "Liea;")
    private class598 field8676;

    @OriginalMember(owner = "client!aga", name = "y", descriptor = "Liea;")
    private class598 field8683;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field8673[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field8667 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field8667[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field8659 = new int[220500];
        field8681 = new int[5];
        field8682 = new int[5];
        field8678 = new int[5];
        field8680 = new int[5];
        field8679 = new int[5];
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(III)I", line = 28)
    private final int method3407(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field8667[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field8673[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lgk;)V", line = 77)
    public final void method3408(class540 arg0) {
        this.field8675 = new class598();
        this.field8675.method3403(arg0);
        this.field8668 = new class598();
        this.field8668.method3403(arg0);
        int var2 = arg0.method3115(29871);
        if (var2 != 0) {
            arg0.field7956--;
            this.field8676 = new class598();
            this.field8676.method3403(arg0);
            this.field8662 = new class598();
            this.field8662.method3403(arg0);
        }
        int var3 = arg0.method3115(29871);
        if (var3 != 0) {
            arg0.field7956--;
            this.field8674 = new class598();
            this.field8674.method3403(arg0);
            this.field8670 = new class598();
            this.field8670.method3403(arg0);
        }
        int var4 = arg0.method3115(29871);
        if (var4 != 0) {
            arg0.field7956--;
            this.field8660 = new class598();
            this.field8660.method3403(arg0);
            this.field8661 = new class598();
            this.field8661.method3403(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3109(-2);
            if (var6 == 0) {
                break;
            }
            this.field8664[var5] = var6;
            this.field8666[var5] = arg0.method3158((byte) -109);
            this.field8663[var5] = arg0.method3109(-2);
        }
        this.field8677 = arg0.method3109(-2);
        this.field8669 = arg0.method3109(-2);
        this.field8671 = arg0.method3169(26488);
        this.field8665 = arg0.method3169(26488);
        this.field8672 = new class363();
        this.field8683 = new class598();
        this.field8672.method2228(arg0, this.field8683);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)[I", line = 146)
    public final int[] method3409(int arg0, int arg1) {
        class667.method3743(field8659, 0, arg0);
        if (arg1 < 10) {
            return field8659;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field8675.method3406();
        this.field8668.method3406();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field8676 != null) {
            this.field8676.method3406();
            this.field8662.method3406();
            var5 = (int) ((double) (this.field8676.field8651 - this.field8676.field8648) * 32.768D / var3);
            var6 = (int) ((double) this.field8676.field8648 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field8674 != null) {
            this.field8674.method3406();
            this.field8670.method3406();
            var8 = (int) ((double) (this.field8674.field8651 - this.field8674.field8648) * 32.768D / var3);
            var9 = (int) ((double) this.field8674.field8648 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field8664[var11] != 0) {
                field8682[var11] = 0;
                field8678[var11] = (int) ((double) this.field8663[var11] * var3);
                field8680[var11] = (this.field8664[var11] << 14) / 100;
                field8681[var11] = (int) ((double) (this.field8675.field8651 - this.field8675.field8648) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field8666[var11]) / var3);
                field8679[var11] = (int) ((double) this.field8675.field8648 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field8675.method3404(arg0);
            int var40 = this.field8668.method3404(arg0);
            if (this.field8676 != null) {
                int var41 = this.field8676.method3404(arg0);
                int var42 = this.field8662.method3404(arg0);
                var39 += this.method3407(var7, var42, this.field8676.field8649) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field8674 != null) {
                int var43 = this.field8674.method3404(arg0);
                int var44 = this.field8670.method3404(arg0);
                var40 = var40 * ((this.method3407(var10, var44, this.field8674.field8649) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field8664[var45] != 0) {
                    int var46 = field8678[var45] + var12;
                    if (var46 < arg0) {
                        field8659[var46] += this.method3407(field8682[var45], field8680[var45] * var40 >> 15, this.field8675.field8649);
                        field8682[var45] += (field8681[var45] * var39 >> 16) + field8679[var45];
                    }
                }
            }
        }
        if (this.field8660 != null) {
            this.field8660.method3406();
            this.field8661.method3406();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field8660.method3404(arg0);
                int var18 = this.field8661.method3404(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field8660.field8651 - this.field8660.field8648) * var17 >> 8) + this.field8660.field8648;
                } else {
                    var19 = ((this.field8660.field8651 - this.field8660.field8648) * var18 >> 8) + this.field8660.field8648;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field8659[var16] = 0;
                }
            }
        }
        if (this.field8677 > 0 && this.field8669 > 0) {
            int var20 = (int) ((double) this.field8677 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field8659[var21] += field8659[var21 - var20] * this.field8669 / 100;
            }
        }
        if (this.field8672.field5327[0] > 0 || this.field8672.field5327[1] > 0) {
            this.field8683.method3406();
            int var22 = this.field8683.method3404(arg0 + 1);
            int var23 = this.field8672.method2230(0, (float) var22 / 65536.0F);
            int var24 = this.field8672.method2230(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field8659[var23 + var25] * (long) class363.field5332 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field8659[var23 + var25 - var36 - 1] * (long) class363.field5331[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field8659[var25 - var37 - 1] * (long) class363.field5331[1][var37] >> 16);
                    }
                    field8659[var25] = var35;
                    var22 = this.field8683.method3404(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field8659[var23 + var25] * (long) class363.field5332 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field8659[var23 + var25 - var33 - 1] * (long) class363.field5331[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field8659[var25 - var34 - 1] * (long) class363.field5331[1][var34] >> 16);
                        }
                        field8659[var25] = var32;
                        var22 = this.field8683.method3404(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field8659[var23 + var25 - var29 - 1] * (long) class363.field5331[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field8659[var25 - var30 - 1] * (long) class363.field5331[1][var30] >> 16);
                            }
                            field8659[var25] = var28;
                            this.field8683.method3404(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field8672.method2230(0, (float) var22 / 65536.0F);
                    var24 = this.field8672.method2230(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field8659[var38] < -32768) {
                field8659[var38] = -32768;
            }
            if (field8659[var38] > 32767) {
                field8659[var38] = 32767;
            }
        }
        return field8659;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "()V", line = 430)
    public static void method3410() {
        field8659 = null;
        field8673 = null;
        field8667 = null;
        field8682 = null;
        field8678 = null;
        field8680 = null;
        field8681 = null;
        field8679 = null;
    }
}
