import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class231 {

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "[I")
    private int[] field3663 = new int[5];

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "[I")
    private int[] field3665 = new int[5];

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    private int field3672 = 100;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
    public int field3682 = 0;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public int field3680 = 500;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "[I")
    private int[] field3681 = new int[5];

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    private int field3678 = 0;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "[I")
    private static int[] field3679 = new int[32768];

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "[I")
    private static int[] field3674;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "[I")
    private static int[] field3669;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "[I")
    private static int[] field3683;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "[I")
    private static int[] field3684;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "[I")
    private static int[] field3685;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "[I")
    private static int[] field3686;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "[I")
    private static int[] field3687;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Lql;")
    private class15 field3664;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Lql;")
    private class15 field3666;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Lql;")
    private class15 field3667;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "Lql;")
    private class15 field3670;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Lql;")
    private class15 field3671;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Lql;")
    private class15 field3673;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "Lql;")
    private class15 field3675;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "Lql;")
    private class15 field3676;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "Lql;")
    private class15 field3677;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Lul;")
    private class37 field3668;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()V")
    public static void method1530() {
        field3669 = null;
        field3679 = null;
        field3674 = null;
        field3683 = null;
        field3686 = null;
        field3685 = null;
        field3684 = null;
        field3687 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lhi;)V")
    public final void method1531(class264 arg0) {
        this.field3676 = new class15();
        this.field3676.method115(arg0);
        this.field3670 = new class15();
        this.field3670.method115(arg0);
        int var2 = arg0.method1779(-126);
        if (var2 != 0) {
            arg0.field4195--;
            this.field3671 = new class15();
            this.field3671.method115(arg0);
            this.field3675 = new class15();
            this.field3675.method115(arg0);
        }
        int var3 = arg0.method1779(-99);
        if (var3 != 0) {
            arg0.field4195--;
            this.field3666 = new class15();
            this.field3666.method115(arg0);
            this.field3677 = new class15();
            this.field3677.method115(arg0);
        }
        int var4 = arg0.method1779(-105);
        if (var4 != 0) {
            arg0.field4195--;
            this.field3667 = new class15();
            this.field3667.method115(arg0);
            this.field3664 = new class15();
            this.field3664.method115(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1729(false);
            if (var6 == 0) {
                break;
            }
            this.field3681[var5] = var6;
            this.field3663[var5] = arg0.method1783((byte) 69);
            this.field3665[var5] = arg0.method1729(false);
        }
        this.field3678 = arg0.method1729(false);
        this.field3672 = arg0.method1729(false);
        this.field3680 = arg0.method1777(-73);
        this.field3682 = arg0.method1777(-59);
        this.field3668 = new class37();
        this.field3673 = new class15();
        this.field3668.method297(arg0, this.field3673);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)[I")
    public final int[] method1532(int arg0, int arg1) {
        class56.method435(field3669, 0, arg0);
        if (arg1 < 10) {
            return field3669;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3676.method112();
        this.field3670.method112();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3671 != null) {
            this.field3671.method112();
            this.field3675.method112();
            var5 = (int) ((double) (this.field3671.field176 - this.field3671.field175) * 32.768D / var3);
            var6 = (int) ((double) this.field3671.field175 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3666 != null) {
            this.field3666.method112();
            this.field3677.method112();
            var8 = (int) ((double) (this.field3666.field176 - this.field3666.field175) * 32.768D / var3);
            var9 = (int) ((double) this.field3666.field175 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3681[var11] != 0) {
                field3683[var11] = 0;
                field3686[var11] = (int) ((double) this.field3665[var11] * var3);
                field3685[var11] = (this.field3681[var11] << 14) / 100;
                field3684[var11] = (int) ((double) (this.field3676.field176 - this.field3676.field175) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3663[var11]) / var3);
                field3687[var11] = (int) ((double) this.field3676.field175 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3676.method113(arg0);
            int var40 = this.field3670.method113(arg0);
            if (this.field3671 != null) {
                int var41 = this.field3671.method113(arg0);
                int var42 = this.field3675.method113(arg0);
                var39 += this.method1533(var7, var42, this.field3671.field174) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3666 != null) {
                int var43 = this.field3666.method113(arg0);
                int var44 = this.field3677.method113(arg0);
                var40 = var40 * ((this.method1533(var10, var44, this.field3666.field174) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3681[var45] != 0) {
                    int var46 = field3686[var45] + var12;
                    if (var46 < arg0) {
                        field3669[var46] += this.method1533(field3683[var45], field3685[var45] * var40 >> 15, this.field3676.field174);
                        field3683[var45] += (field3684[var45] * var39 >> 16) + field3687[var45];
                    }
                }
            }
        }
        if (this.field3667 != null) {
            this.field3667.method112();
            this.field3664.method112();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3667.method113(arg0);
                int var18 = this.field3664.method113(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3667.field176 - this.field3667.field175) * var17 >> 8) + this.field3667.field175;
                } else {
                    var19 = ((this.field3667.field176 - this.field3667.field175) * var18 >> 8) + this.field3667.field175;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3669[var16] = 0;
                }
            }
        }
        if (this.field3678 > 0 && this.field3672 > 0) {
            int var20 = (int) ((double) this.field3678 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3669[var21] += field3669[var21 - var20] * this.field3672 / 100;
            }
        }
        if (this.field3668.field455[0] > 0 || this.field3668.field455[1] > 0) {
            this.field3673.method112();
            int var22 = this.field3673.method113(arg0 + 1);
            int var23 = this.field3668.method298(0, (float) var22 / 65536.0F);
            int var24 = this.field3668.method298(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3669[var23 + var25] * (long) class37.field451 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3669[var23 + var25 - var36 - 1] * (long) class37.field452[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3669[var25 - var37 - 1] * (long) class37.field452[1][var37] >> 16);
                    }
                    field3669[var25] = var35;
                    var22 = this.field3673.method113(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3669[var23 + var25] * (long) class37.field451 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3669[var23 + var25 - var33 - 1] * (long) class37.field452[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3669[var25 - var34 - 1] * (long) class37.field452[1][var34] >> 16);
                        }
                        field3669[var25] = var32;
                        var22 = this.field3673.method113(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3669[var23 + var25 - var29 - 1] * (long) class37.field452[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3669[var25 - var30 - 1] * (long) class37.field452[1][var30] >> 16);
                            }
                            field3669[var25] = var28;
                            this.field3673.method113(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3668.method298(0, (float) var22 / 65536.0F);
                    var24 = this.field3668.method298(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3669[var38] < -32768) {
                field3669[var38] = -32768;
            }
            if (field3669[var38] > 32767) {
                field3669[var38] = 32767;
            }
        }
        return field3669;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)I")
    private final int method1533(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3674[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3679[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3679[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3674 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3674[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3669 = new int[220500];
        field3683 = new int[5];
        field3684 = new int[5];
        field3685 = new int[5];
        field3686 = new int[5];
        field3687 = new int[5];
    }
}
