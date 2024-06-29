import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class456 {

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "[I")
    private int[] field6653 = new int[5];

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public int field6654 = 0;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    private int field6658 = 100;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "[I")
    private int[] field6648 = new int[5];

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "[I")
    private int[] field6651 = new int[5];

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    private int field6655 = 0;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public int field6665 = 500;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "[I")
    private static int[] field6659 = new int[32768];

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "[I")
    private static int[] field6657;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "[I")
    private static int[] field6652;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "[I")
    private static int[] field6669;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "[I")
    private static int[] field6668;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "[I")
    private static int[] field6667;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "[I")
    private static int[] field6670;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "[I")
    private static int[] field6671;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Llka;")
    private class352 field6647;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Lhk;")
    private class638 field6649;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "Lhk;")
    private class638 field6650;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "Lhk;")
    private class638 field6656;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Lhk;")
    private class638 field6660;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Lhk;")
    private class638 field6661;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "Lhk;")
    private class638 field6662;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Lhk;")
    private class638 field6663;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "Lhk;")
    private class638 field6664;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Lhk;")
    private class638 field6666;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljc;)V")
    public final void method3518(class711 arg0) {
        this.field6650 = new class638();
        this.field6650.method4645(arg0);
        this.field6663 = new class638();
        this.field6663.method4645(arg0);
        int var2 = arg0.method5128(0);
        if (var2 != 0) {
            arg0.field9945--;
            this.field6662 = new class638();
            this.field6662.method4645(arg0);
            this.field6660 = new class638();
            this.field6660.method4645(arg0);
        }
        int var3 = arg0.method5128(0);
        if (var3 != 0) {
            arg0.field9945--;
            this.field6656 = new class638();
            this.field6656.method4645(arg0);
            this.field6664 = new class638();
            this.field6664.method4645(arg0);
        }
        int var4 = arg0.method5128(0);
        if (var4 != 0) {
            arg0.field9945--;
            this.field6666 = new class638();
            this.field6666.method4645(arg0);
            this.field6649 = new class638();
            this.field6649.method4645(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method5090(-47);
            if (var6 == 0) {
                break;
            }
            this.field6648[var5] = var6;
            this.field6651[var5] = arg0.method5098((byte) -124);
            this.field6653[var5] = arg0.method5090(-49);
        }
        this.field6655 = arg0.method5090(-94);
        this.field6658 = arg0.method5090(-85);
        this.field6665 = arg0.method5116((byte) -112);
        this.field6654 = arg0.method5116((byte) -110);
        this.field6647 = new class352();
        this.field6661 = new class638();
        this.field6647.method2817(arg0, this.field6661);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()V")
    public static void method3519() {
        field6652 = null;
        field6659 = null;
        field6657 = null;
        field6669 = null;
        field6670 = null;
        field6668 = null;
        field6671 = null;
        field6667 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)I")
    private final int method3520(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field6657[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field6659[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)[I")
    public final int[] method3521(int arg0, int arg1) {
        class569.method4242(field6652, 0, arg0);
        if (arg1 < 10) {
            return field6652;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field6650.method4648();
        this.field6663.method4648();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field6662 != null) {
            this.field6662.method4648();
            this.field6660.method4648();
            var5 = (int) ((double) (this.field6662.field9022 - this.field6662.field9023) * 32.768D / var3);
            var6 = (int) ((double) this.field6662.field9023 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field6656 != null) {
            this.field6656.method4648();
            this.field6664.method4648();
            var8 = (int) ((double) (this.field6656.field9022 - this.field6656.field9023) * 32.768D / var3);
            var9 = (int) ((double) this.field6656.field9023 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field6648[var11] != 0) {
                field6669[var11] = 0;
                field6670[var11] = (int) ((double) this.field6653[var11] * var3);
                field6668[var11] = (this.field6648[var11] << 14) / 100;
                field6671[var11] = (int) ((double) (this.field6650.field9022 - this.field6650.field9023) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field6651[var11]) / var3);
                field6667[var11] = (int) ((double) this.field6650.field9023 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field6650.method4646(arg0);
            int var40 = this.field6663.method4646(arg0);
            if (this.field6662 != null) {
                int var41 = this.field6662.method4646(arg0);
                int var42 = this.field6660.method4646(arg0);
                var39 += this.method3520(var7, var42, this.field6662.field9024) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field6656 != null) {
                int var43 = this.field6656.method4646(arg0);
                int var44 = this.field6664.method4646(arg0);
                var40 = var40 * ((this.method3520(var10, var44, this.field6656.field9024) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field6648[var45] != 0) {
                    int var46 = field6670[var45] + var12;
                    if (var46 < arg0) {
                        field6652[var46] += this.method3520(field6669[var45], field6668[var45] * var40 >> 15, this.field6650.field9024);
                        field6669[var45] += (field6671[var45] * var39 >> 16) + field6667[var45];
                    }
                }
            }
        }
        if (this.field6666 != null) {
            this.field6666.method4648();
            this.field6649.method4648();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field6666.method4646(arg0);
                int var18 = this.field6649.method4646(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field6666.field9022 - this.field6666.field9023) * var17 >> 8) + this.field6666.field9023;
                } else {
                    var19 = ((this.field6666.field9022 - this.field6666.field9023) * var18 >> 8) + this.field6666.field9023;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field6652[var16] = 0;
                }
            }
        }
        if (this.field6655 > 0 && this.field6658 > 0) {
            int var20 = (int) ((double) this.field6655 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field6652[var21] += field6652[var21 - var20] * this.field6658 / 100;
            }
        }
        if (this.field6647.field5099[0] > 0 || this.field6647.field5099[1] > 0) {
            this.field6661.method4648();
            int var22 = this.field6661.method4646(arg0 + 1);
            int var23 = this.field6647.method2818(0, (float) var22 / 65536.0F);
            int var24 = this.field6647.method2818(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field6652[var23 + var25] * (long) class352.field5101 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field6652[var23 + var25 - var36 - 1] * (long) class352.field5104[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field6652[var25 - var37 - 1] * (long) class352.field5104[1][var37] >> 16);
                    }
                    field6652[var25] = var35;
                    var22 = this.field6661.method4646(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field6652[var23 + var25] * (long) class352.field5101 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field6652[var23 + var25 - var33 - 1] * (long) class352.field5104[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field6652[var25 - var34 - 1] * (long) class352.field5104[1][var34] >> 16);
                        }
                        field6652[var25] = var32;
                        var22 = this.field6661.method4646(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field6652[var23 + var25 - var29 - 1] * (long) class352.field5104[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field6652[var25 - var30 - 1] * (long) class352.field5104[1][var30] >> 16);
                            }
                            field6652[var25] = var28;
                            this.field6661.method4646(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field6647.method2818(0, (float) var22 / 65536.0F);
                    var24 = this.field6647.method2818(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field6652[var38] < -32768) {
                field6652[var38] = -32768;
            }
            if (field6652[var38] > 32767) {
                field6652[var38] = 32767;
            }
        }
        return field6652;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field6659[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field6657 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field6657[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field6652 = new int[220500];
        field6669 = new int[5];
        field6668 = new int[5];
        field6667 = new int[5];
        field6670 = new int[5];
        field6671 = new int[5];
    }
}
