import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class792 {

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    private int field10847 = 0;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    private int field10860 = 100;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "[I")
    private int[] field10869 = new int[5];

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public int field10855 = 500;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "[I")
    private int[] field10865 = new int[5];

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "[I")
    private int[] field10866 = new int[5];

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public int field10852 = 0;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "[I")
    private static int[] field10849 = new int[32768];

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "[I")
    private static int[] field10848;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "[I")
    private static int[] field10856;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "[I")
    private static int[] field10862;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "[I")
    private static int[] field10864;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "[I")
    private static int[] field10867;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "[I")
    private static int[] field10863;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "[I")
    private static int[] field10870;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Lcm;")
    private class587 field10854;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Lnj;")
    private class741 field10846;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Lnj;")
    private class741 field10850;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Lnj;")
    private class741 field10851;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Lnj;")
    private class741 field10853;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "Lnj;")
    private class741 field10857;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Lnj;")
    private class741 field10858;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Lnj;")
    private class741 field10859;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Lnj;")
    private class741 field10861;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "Lnj;")
    private class741 field10868;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field10849[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field10848 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field10848[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field10856 = new int[220500];
        field10862 = new int[5];
        field10864 = new int[5];
        field10867 = new int[5];
        field10863 = new int[5];
        field10870 = new int[5];
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lmc;)V", line = 3)
    public final void method4333(class234 arg0) {
        this.field10858 = new class741();
        this.field10858.method4034(arg0);
        this.field10851 = new class741();
        this.field10851.method4034(arg0);
        int var2 = arg0.method1509(true);
        if (var2 != 0) {
            arg0.field3133--;
            this.field10857 = new class741();
            this.field10857.method4034(arg0);
            this.field10861 = new class741();
            this.field10861.method4034(arg0);
        }
        int var3 = arg0.method1509(true);
        if (var3 != 0) {
            arg0.field3133--;
            this.field10853 = new class741();
            this.field10853.method4034(arg0);
            this.field10859 = new class741();
            this.field10859.method4034(arg0);
        }
        int var4 = arg0.method1509(true);
        if (var4 != 0) {
            arg0.field3133--;
            this.field10868 = new class741();
            this.field10868.method4034(arg0);
            this.field10850 = new class741();
            this.field10850.method4034(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1505((byte) -6);
            if (var6 == 0) {
                break;
            }
            this.field10866[var5] = var6;
            this.field10865[var5] = arg0.method1538(65);
            this.field10869[var5] = arg0.method1505((byte) -6);
        }
        this.field10847 = arg0.method1505((byte) -6);
        this.field10860 = arg0.method1505((byte) -6);
        this.field10855 = arg0.method1553((byte) 68);
        this.field10852 = arg0.method1553((byte) 109);
        this.field10854 = new class587();
        this.field10846 = new class741();
        this.field10854.method3141(arg0, this.field10846);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()V", line = 63)
    public static void method4334() {
        field10856 = null;
        field10849 = null;
        field10848 = null;
        field10870 = null;
        field10867 = null;
        field10864 = null;
        field10863 = null;
        field10862 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)I", line = 88)
    private final int method4335(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field10848[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field10849[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)[I", line = 188)
    public final int[] method4336(int arg0, int arg1) {
        class642.method3477(field10856, 0, arg0);
        if (arg1 < 10) {
            return field10856;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field10858.method4033();
        this.field10851.method4033();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field10857 != null) {
            this.field10857.method4033();
            this.field10861.method4033();
            var5 = (int) ((double) (this.field10857.field10034 - this.field10857.field10037) * 32.768D / var3);
            var6 = (int) ((double) this.field10857.field10037 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field10853 != null) {
            this.field10853.method4033();
            this.field10859.method4033();
            var8 = (int) ((double) (this.field10853.field10034 - this.field10853.field10037) * 32.768D / var3);
            var9 = (int) ((double) this.field10853.field10037 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field10866[var11] != 0) {
                field10870[var11] = 0;
                field10867[var11] = (int) ((double) this.field10869[var11] * var3);
                field10864[var11] = (this.field10866[var11] << 14) / 100;
                field10863[var11] = (int) ((double) (this.field10858.field10034 - this.field10858.field10037) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field10865[var11]) / var3);
                field10862[var11] = (int) ((double) this.field10858.field10037 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field10858.method4031(arg0);
            int var40 = this.field10851.method4031(arg0);
            if (this.field10857 != null) {
                int var41 = this.field10857.method4031(arg0);
                int var42 = this.field10861.method4031(arg0);
                var39 += this.method4335(var7, var42, this.field10857.field10038) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field10853 != null) {
                int var43 = this.field10853.method4031(arg0);
                int var44 = this.field10859.method4031(arg0);
                var40 = var40 * ((this.method4335(var10, var44, this.field10853.field10038) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field10866[var45] != 0) {
                    int var46 = field10867[var45] + var12;
                    if (var46 < arg0) {
                        field10856[var46] += this.method4335(field10870[var45], field10864[var45] * var40 >> 15, this.field10858.field10038);
                        field10870[var45] += (field10863[var45] * var39 >> 16) + field10862[var45];
                    }
                }
            }
        }
        if (this.field10868 != null) {
            this.field10868.method4033();
            this.field10850.method4033();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field10868.method4031(arg0);
                int var18 = this.field10850.method4031(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field10868.field10034 - this.field10868.field10037) * var17 >> 8) + this.field10868.field10037;
                } else {
                    var19 = ((this.field10868.field10034 - this.field10868.field10037) * var18 >> 8) + this.field10868.field10037;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field10856[var16] = 0;
                }
            }
        }
        if (this.field10847 > 0 && this.field10860 > 0) {
            int var20 = (int) ((double) this.field10847 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field10856[var21] += field10856[var21 - var20] * this.field10860 / 100;
            }
        }
        if (this.field10854.field7412[0] > 0 || this.field10854.field7412[1] > 0) {
            this.field10846.method4033();
            int var22 = this.field10846.method4031(arg0 + 1);
            int var23 = this.field10854.method3140(0, (float) var22 / 65536.0F);
            int var24 = this.field10854.method3140(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field10856[var23 + var25] * (long) class587.field7417 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field10856[var23 + var25 - var36 - 1] * (long) class587.field7415[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field10856[var25 - var37 - 1] * (long) class587.field7415[1][var37] >> 16);
                    }
                    field10856[var25] = var35;
                    var22 = this.field10846.method4031(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field10856[var23 + var25] * (long) class587.field7417 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field10856[var23 + var25 - var33 - 1] * (long) class587.field7415[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field10856[var25 - var34 - 1] * (long) class587.field7415[1][var34] >> 16);
                        }
                        field10856[var25] = var32;
                        var22 = this.field10846.method4031(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field10856[var23 + var25 - var29 - 1] * (long) class587.field7415[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field10856[var25 - var30 - 1] * (long) class587.field7415[1][var30] >> 16);
                            }
                            field10856[var25] = var28;
                            this.field10846.method4031(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field10854.method3140(0, (float) var22 / 65536.0F);
                    var24 = this.field10854.method3140(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field10856[var38] < -32768) {
                field10856[var38] = -32768;
            }
            if (field10856[var38] > 32767) {
                field10856[var38] = 32767;
            }
        }
        return field10856;
    }
}
