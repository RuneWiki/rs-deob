import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("vc")
public class class196 {

    @OriginalMember(owner = "vc", name = "b", descriptor = "[I")
    private int[] field3739 = new int[5];

    @OriginalMember(owner = "vc", name = "c", descriptor = "I")
    public int field3740 = 500;

    @OriginalMember(owner = "vc", name = "g", descriptor = "[I")
    private int[] field3744 = new int[5];

    @OriginalMember(owner = "vc", name = "k", descriptor = "I")
    private int field3748 = 0;

    @OriginalMember(owner = "vc", name = "l", descriptor = "[I")
    private int[] field3749 = new int[5];

    @OriginalMember(owner = "vc", name = "t", descriptor = "I")
    private int field3757 = 100;

    @OriginalMember(owner = "vc", name = "u", descriptor = "I")
    public int field3758 = 0;

    @OriginalMember(owner = "vc", name = "p", descriptor = "[I")
    private static int[] field3753 = new int[32768];

    @OriginalMember(owner = "vc", name = "e", descriptor = "[I")
    private static int[] field3742;

    @OriginalMember(owner = "vc", name = "d", descriptor = "[I")
    private static int[] field3741;

    @OriginalMember(owner = "vc", name = "s", descriptor = "[I")
    private static int[] field3756;

    @OriginalMember(owner = "vc", name = "v", descriptor = "[I")
    private static int[] field3759;

    @OriginalMember(owner = "vc", name = "y", descriptor = "[I")
    private static int[] field3762;

    @OriginalMember(owner = "vc", name = "r", descriptor = "[I")
    private static int[] field3755;

    @OriginalMember(owner = "vc", name = "x", descriptor = "[I")
    private static int[] field3761;

    @OriginalMember(owner = "vc", name = "a", descriptor = "Lta;")
    private class176 field3738;

    @OriginalMember(owner = "vc", name = "f", descriptor = "Lta;")
    private class176 field3743;

    @OriginalMember(owner = "vc", name = "h", descriptor = "Lta;")
    private class176 field3745;

    @OriginalMember(owner = "vc", name = "i", descriptor = "Lta;")
    private class176 field3746;

    @OriginalMember(owner = "vc", name = "j", descriptor = "Lta;")
    private class176 field3747;

    @OriginalMember(owner = "vc", name = "m", descriptor = "Lta;")
    private class176 field3750;

    @OriginalMember(owner = "vc", name = "n", descriptor = "Lta;")
    private class176 field3751;

    @OriginalMember(owner = "vc", name = "q", descriptor = "Lta;")
    private class176 field3754;

    @OriginalMember(owner = "vc", name = "w", descriptor = "Lta;")
    private class176 field3760;

    @OriginalMember(owner = "vc", name = "o", descriptor = "Lwe;")
    private class207 field3752;

    @OriginalMember(owner = "vc", name = "a", descriptor = "(Lja;)V")
    public final void method1305(class86 arg0) {
        this.field3747 = new class176();
        this.field3747.method1206(arg0);
        this.field3746 = new class176();
        this.field3746.method1206(arg0);
        int var2 = arg0.method598((byte) 75);
        if (var2 != 0) {
            arg0.field1773--;
            this.field3754 = new class176();
            this.field3754.method1206(arg0);
            this.field3750 = new class176();
            this.field3750.method1206(arg0);
        }
        int var3 = arg0.method598((byte) 85);
        if (var3 != 0) {
            arg0.field1773--;
            this.field3738 = new class176();
            this.field3738.method1206(arg0);
            this.field3751 = new class176();
            this.field3751.method1206(arg0);
        }
        int var4 = arg0.method598((byte) 98);
        if (var4 != 0) {
            arg0.field1773--;
            this.field3760 = new class176();
            this.field3760.method1206(arg0);
            this.field3745 = new class176();
            this.field3745.method1206(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method560(0);
            if (var6 == 0) {
                break;
            }
            this.field3739[var5] = var6;
            this.field3744[var5] = arg0.method550(128);
            this.field3749[var5] = arg0.method560(0);
        }
        this.field3748 = arg0.method560(0);
        this.field3757 = arg0.method560(0);
        this.field3740 = arg0.method569(true);
        this.field3758 = arg0.method569(true);
        this.field3752 = new class207();
        this.field3743 = new class176();
        this.field3752.method1355(arg0, this.field3743);
    }

    @OriginalMember(owner = "vc", name = "a", descriptor = "()V")
    public static void method1306() {
        field3741 = null;
        field3753 = null;
        field3742 = null;
        field3762 = null;
        field3761 = null;
        field3755 = null;
        field3756 = null;
        field3759 = null;
    }

    @OriginalMember(owner = "vc", name = "a", descriptor = "(III)I")
    private final int method1307(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3742[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3753[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "vc", name = "a", descriptor = "(II)[I")
    public final int[] method1308(int arg0, int arg1) {
        class122.method876(field3741, 0, arg0);
        if (arg1 < 10) {
            return field3741;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3747.method1204();
        this.field3746.method1204();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3754 != null) {
            this.field3754.method1204();
            this.field3750.method1204();
            var5 = (int) ((double) (this.field3754.field3321 - this.field3754.field3325) * 32.768D / var3);
            var6 = (int) ((double) this.field3754.field3325 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3738 != null) {
            this.field3738.method1204();
            this.field3751.method1204();
            var8 = (int) ((double) (this.field3738.field3321 - this.field3738.field3325) * 32.768D / var3);
            var9 = (int) ((double) this.field3738.field3325 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3739[var11] != 0) {
                field3762[var11] = 0;
                field3761[var11] = (int) ((double) this.field3749[var11] * var3);
                field3755[var11] = (this.field3739[var11] << 14) / 100;
                field3756[var11] = (int) ((double) (this.field3747.field3321 - this.field3747.field3325) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3744[var11]) / var3);
                field3759[var11] = (int) ((double) this.field3747.field3325 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3747.method1203(arg0);
            int var40 = this.field3746.method1203(arg0);
            if (this.field3754 != null) {
                int var41 = this.field3754.method1203(arg0);
                int var42 = this.field3750.method1203(arg0);
                var39 += this.method1307(var7, var42, this.field3754.field3323) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3738 != null) {
                int var43 = this.field3738.method1203(arg0);
                int var44 = this.field3751.method1203(arg0);
                var40 = var40 * ((this.method1307(var10, var44, this.field3738.field3323) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3739[var45] != 0) {
                    int var46 = field3761[var45] + var12;
                    if (var46 < arg0) {
                        field3741[var46] += this.method1307(field3762[var45], field3755[var45] * var40 >> 15, this.field3747.field3323);
                        field3762[var45] += (field3756[var45] * var39 >> 16) + field3759[var45];
                    }
                }
            }
        }
        if (this.field3760 != null) {
            this.field3760.method1204();
            this.field3745.method1204();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3760.method1203(arg0);
                int var18 = this.field3745.method1203(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3760.field3321 - this.field3760.field3325) * var17 >> 8) + this.field3760.field3325;
                } else {
                    var19 = ((this.field3760.field3321 - this.field3760.field3325) * var18 >> 8) + this.field3760.field3325;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3741[var16] = 0;
                }
            }
        }
        if (this.field3748 > 0 && this.field3757 > 0) {
            int var20 = (int) ((double) this.field3748 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3741[var21] += field3741[var21 - var20] * this.field3757 / 100;
            }
        }
        if (this.field3752.field4058[0] > 0 || this.field3752.field4058[1] > 0) {
            this.field3743.method1204();
            int var22 = this.field3743.method1203(arg0 + 1);
            int var23 = this.field3752.method1358(0, (float) var22 / 65536.0F);
            int var24 = this.field3752.method1358(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3741[var23 + var25] * (long) class207.field4055 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3741[var23 + var25 - var36 - 1] * (long) class207.field4056[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3741[var25 - var37 - 1] * (long) class207.field4056[1][var37] >> 16);
                    }
                    field3741[var25] = var35;
                    var22 = this.field3743.method1203(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3741[var23 + var25] * (long) class207.field4055 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3741[var23 + var25 - var33 - 1] * (long) class207.field4056[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3741[var25 - var34 - 1] * (long) class207.field4056[1][var34] >> 16);
                        }
                        field3741[var25] = var32;
                        var22 = this.field3743.method1203(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3741[var23 + var25 - var29 - 1] * (long) class207.field4056[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3741[var25 - var30 - 1] * (long) class207.field4056[1][var30] >> 16);
                            }
                            field3741[var25] = var28;
                            this.field3743.method1203(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3752.method1358(0, (float) var22 / 65536.0F);
                    var24 = this.field3752.method1358(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3741[var38] < -32768) {
                field3741[var38] = -32768;
            }
            if (field3741[var38] > 32767) {
                field3741[var38] = 32767;
            }
        }
        return field3741;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3753[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3742 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3742[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3741 = new int[220500];
        field3756 = new int[5];
        field3759 = new int[5];
        field3762 = new int[5];
        field3755 = new int[5];
        field3761 = new int[5];
    }
}
