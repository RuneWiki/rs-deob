import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class56 {

    @OriginalMember(owner = "client!aea", name = "k", descriptor = "I")
    public int field789 = 0;

    @OriginalMember(owner = "client!aea", name = "p", descriptor = "I")
    public int field794 = 500;

    @OriginalMember(owner = "client!aea", name = "i", descriptor = "I")
    private int field787 = 100;

    @OriginalMember(owner = "client!aea", name = "n", descriptor = "[I")
    private int[] field792 = new int[5];

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "[I")
    private int[] field784 = new int[5];

    @OriginalMember(owner = "client!aea", name = "q", descriptor = "I")
    private int field795 = 0;

    @OriginalMember(owner = "client!aea", name = "o", descriptor = "[I")
    private int[] field793 = new int[5];

    @OriginalMember(owner = "client!aea", name = "m", descriptor = "[I")
    private static int[] field791 = new int[32768];

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "[I")
    private static int[] field780;

    @OriginalMember(owner = "client!aea", name = "s", descriptor = "[I")
    private static int[] field797;

    @OriginalMember(owner = "client!aea", name = "u", descriptor = "[I")
    private static int[] field799;

    @OriginalMember(owner = "client!aea", name = "w", descriptor = "[I")
    private static int[] field801;

    @OriginalMember(owner = "client!aea", name = "y", descriptor = "[I")
    private static int[] field803;

    @OriginalMember(owner = "client!aea", name = "x", descriptor = "[I")
    private static int[] field802;

    @OriginalMember(owner = "client!aea", name = "v", descriptor = "[I")
    private static int[] field800;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "Lmv;")
    private class392 field779;

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "Lmv;")
    private class392 field781;

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "Lmv;")
    private class392 field782;

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "Lmv;")
    private class392 field783;

    @OriginalMember(owner = "client!aea", name = "h", descriptor = "Lmv;")
    private class392 field786;

    @OriginalMember(owner = "client!aea", name = "j", descriptor = "Lmv;")
    private class392 field788;

    @OriginalMember(owner = "client!aea", name = "l", descriptor = "Lmv;")
    private class392 field790;

    @OriginalMember(owner = "client!aea", name = "r", descriptor = "Lmv;")
    private class392 field796;

    @OriginalMember(owner = "client!aea", name = "t", descriptor = "Lmv;")
    private class392 field798;

    @OriginalMember(owner = "client!aea", name = "g", descriptor = "Llja;")
    private class743 field785;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field791[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field780 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field780[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field797 = new int[220500];
        field799 = new int[5];
        field801 = new int[5];
        field803 = new int[5];
        field802 = new int[5];
        field800 = new int[5];
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lrv;)V", line = 4)
    public final void method359(class120 arg0) {
        this.field781 = new class392();
        this.field781.method2392(arg0);
        this.field782 = new class392();
        this.field782.method2392(arg0);
        int var2 = arg0.method842(2384);
        if (var2 != 0) {
            arg0.field1521--;
            this.field798 = new class392();
            this.field798.method2392(arg0);
            this.field788 = new class392();
            this.field788.method2392(arg0);
        }
        int var3 = arg0.method842(2384);
        if (var3 != 0) {
            arg0.field1521--;
            this.field796 = new class392();
            this.field796.method2392(arg0);
            this.field779 = new class392();
            this.field779.method2392(arg0);
        }
        int var4 = arg0.method842(2384);
        if (var4 != 0) {
            arg0.field1521--;
            this.field786 = new class392();
            this.field786.method2392(arg0);
            this.field783 = new class392();
            this.field783.method2392(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method890((byte) -59);
            if (var6 == 0) {
                break;
            }
            this.field793[var5] = var6;
            this.field784[var5] = arg0.method857(49152);
            this.field792[var5] = arg0.method890((byte) -59);
        }
        this.field795 = arg0.method890((byte) -59);
        this.field787 = arg0.method890((byte) -59);
        this.field794 = arg0.method898((byte) -106);
        this.field789 = arg0.method898((byte) -98);
        this.field785 = new class743();
        this.field790 = new class392();
        this.field785.method4150(arg0, this.field790);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(II)[I", line = 66)
    public final int[] method360(int arg0, int arg1) {
        class42.method290(field797, 0, arg0);
        if (arg1 < 10) {
            return field797;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field781.method2395();
        this.field782.method2395();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field798 != null) {
            this.field798.method2395();
            this.field788.method2395();
            var5 = (int) ((double) (this.field798.field5566 - this.field798.field5567) * 32.768D / var3);
            var6 = (int) ((double) this.field798.field5567 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field796 != null) {
            this.field796.method2395();
            this.field779.method2395();
            var8 = (int) ((double) (this.field796.field5566 - this.field796.field5567) * 32.768D / var3);
            var9 = (int) ((double) this.field796.field5567 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field793[var11] != 0) {
                field803[var11] = 0;
                field800[var11] = (int) ((double) this.field792[var11] * var3);
                field801[var11] = (this.field793[var11] << 14) / 100;
                field802[var11] = (int) ((double) (this.field781.field5566 - this.field781.field5567) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field784[var11]) / var3);
                field799[var11] = (int) ((double) this.field781.field5567 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field781.method2394(arg0);
            int var40 = this.field782.method2394(arg0);
            if (this.field798 != null) {
                int var41 = this.field798.method2394(arg0);
                int var42 = this.field788.method2394(arg0);
                var39 += this.method362(var7, var42, this.field798.field5562) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field796 != null) {
                int var43 = this.field796.method2394(arg0);
                int var44 = this.field779.method2394(arg0);
                var40 = var40 * ((this.method362(var10, var44, this.field796.field5562) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field793[var45] != 0) {
                    int var46 = field800[var45] + var12;
                    if (var46 < arg0) {
                        field797[var46] += this.method362(field803[var45], field801[var45] * var40 >> 15, this.field781.field5562);
                        field803[var45] += (field802[var45] * var39 >> 16) + field799[var45];
                    }
                }
            }
        }
        if (this.field786 != null) {
            this.field786.method2395();
            this.field783.method2395();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field786.method2394(arg0);
                int var18 = this.field783.method2394(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field786.field5566 - this.field786.field5567) * var17 >> 8) + this.field786.field5567;
                } else {
                    var19 = ((this.field786.field5566 - this.field786.field5567) * var18 >> 8) + this.field786.field5567;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field797[var16] = 0;
                }
            }
        }
        if (this.field795 > 0 && this.field787 > 0) {
            int var20 = (int) ((double) this.field795 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field797[var21] += field797[var21 - var20] * this.field787 / 100;
            }
        }
        if (this.field785.field10352[0] > 0 || this.field785.field10352[1] > 0) {
            this.field790.method2395();
            int var22 = this.field790.method2394(arg0 + 1);
            int var23 = this.field785.method4146(0, (float) var22 / 65536.0F);
            int var24 = this.field785.method4146(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field797[var23 + var25] * (long) class743.field10350 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field797[var23 + var25 - var36 - 1] * (long) class743.field10351[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field797[var25 - var37 - 1] * (long) class743.field10351[1][var37] >> 16);
                    }
                    field797[var25] = var35;
                    var22 = this.field790.method2394(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field797[var23 + var25] * (long) class743.field10350 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field797[var23 + var25 - var33 - 1] * (long) class743.field10351[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field797[var25 - var34 - 1] * (long) class743.field10351[1][var34] >> 16);
                        }
                        field797[var25] = var32;
                        var22 = this.field790.method2394(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field797[var23 + var25 - var29 - 1] * (long) class743.field10351[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field797[var25 - var30 - 1] * (long) class743.field10351[1][var30] >> 16);
                            }
                            field797[var25] = var28;
                            this.field790.method2394(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field785.method4146(0, (float) var22 / 65536.0F);
                    var24 = this.field785.method4146(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field797[var38] < -32768) {
                field797[var38] = -32768;
            }
            if (field797[var38] > 32767) {
                field797[var38] = 32767;
            }
        }
        return field797;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "()V", line = 355)
    public static void method361() {
        field797 = null;
        field791 = null;
        field780 = null;
        field803 = null;
        field800 = null;
        field801 = null;
        field802 = null;
        field799 = null;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)I", line = 390)
    private final int method362(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field780[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field791[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }
}
