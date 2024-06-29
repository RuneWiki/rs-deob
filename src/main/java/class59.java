import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class59 {

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "[I")
    private int[] field837 = new int[5];

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public int field836 = 500;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
    private int field846 = 0;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    public int field844 = 0;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "[I")
    private int[] field851 = new int[5];

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
    private int field855 = 100;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "[I")
    private int[] field840 = new int[5];

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "[I")
    private static int[] field843 = new int[32768];

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "[I")
    private static int[] field845;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "[I")
    private static int[] field841;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "[I")
    private static int[] field847;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "[I")
    private static int[] field849;

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "[I")
    private static int[] field852;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "[I")
    private static int[] field854;

    @OriginalMember(owner = "client!tn", name = "y", descriptor = "[I")
    private static int[] field858;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "Lwb;")
    private class220 field848;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "Lgo;")
    private class450 field834;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "Lgo;")
    private class450 field835;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "Lgo;")
    private class450 field838;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "Lgo;")
    private class450 field839;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "Lgo;")
    private class450 field842;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "Lgo;")
    private class450 field850;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "Lgo;")
    private class450 field853;

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "Lgo;")
    private class450 field856;

    @OriginalMember(owner = "client!tn", name = "x", descriptor = "Lgo;")
    private class450 field857;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field843[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field845 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field845[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field841 = new int[220500];
        field847 = new int[5];
        field849 = new int[5];
        field852 = new int[5];
        field854 = new int[5];
        field858 = new int[5];
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[I", line = 13)
    public final int[] method428(int arg0, int arg1) {
        class192.method1301(field841, 0, arg0);
        if (arg1 < 10) {
            return field841;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field842.method2744();
        this.field856.method2744();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field838 != null) {
            this.field838.method2744();
            this.field835.method2744();
            var5 = (int) ((double) (this.field838.field6758 - this.field838.field6757) * 32.768D / var3);
            var6 = (int) ((double) this.field838.field6757 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field853 != null) {
            this.field853.method2744();
            this.field857.method2744();
            var8 = (int) ((double) (this.field853.field6758 - this.field853.field6757) * 32.768D / var3);
            var9 = (int) ((double) this.field853.field6757 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field840[var11] != 0) {
                field854[var11] = 0;
                field849[var11] = (int) ((double) this.field851[var11] * var3);
                field852[var11] = (this.field840[var11] << 14) / 100;
                field847[var11] = (int) ((double) (this.field842.field6758 - this.field842.field6757) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field837[var11]) / var3);
                field858[var11] = (int) ((double) this.field842.field6757 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field842.method2745(arg0);
            int var40 = this.field856.method2745(arg0);
            if (this.field838 != null) {
                int var41 = this.field838.method2745(arg0);
                int var42 = this.field835.method2745(arg0);
                var39 += this.method430(var7, var42, this.field838.field6756) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field853 != null) {
                int var43 = this.field853.method2745(arg0);
                int var44 = this.field857.method2745(arg0);
                var40 = var40 * ((this.method430(var10, var44, this.field853.field6756) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field840[var45] != 0) {
                    int var46 = field849[var45] + var12;
                    if (var46 < arg0) {
                        field841[var46] += this.method430(field854[var45], field852[var45] * var40 >> 15, this.field842.field6756);
                        field854[var45] += (field847[var45] * var39 >> 16) + field858[var45];
                    }
                }
            }
        }
        if (this.field839 != null) {
            this.field839.method2744();
            this.field850.method2744();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field839.method2745(arg0);
                int var18 = this.field850.method2745(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field839.field6758 - this.field839.field6757) * var17 >> 8) + this.field839.field6757;
                } else {
                    var19 = ((this.field839.field6758 - this.field839.field6757) * var18 >> 8) + this.field839.field6757;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field841[var16] = 0;
                }
            }
        }
        if (this.field846 > 0 && this.field855 > 0) {
            int var20 = (int) ((double) this.field846 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field841[var21] += field841[var21 - var20] * this.field855 / 100;
            }
        }
        if (this.field848.field3072[0] > 0 || this.field848.field3072[1] > 0) {
            this.field834.method2744();
            int var22 = this.field834.method2745(arg0 + 1);
            int var23 = this.field848.method1485(0, (float) var22 / 65536.0F);
            int var24 = this.field848.method1485(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field841[var23 + var25] * (long) class220.field3071 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field841[var23 + var25 - var36 - 1] * (long) class220.field3074[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field841[var25 - var37 - 1] * (long) class220.field3074[1][var37] >> 16);
                    }
                    field841[var25] = var35;
                    var22 = this.field834.method2745(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field841[var23 + var25] * (long) class220.field3071 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field841[var23 + var25 - var33 - 1] * (long) class220.field3074[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field841[var25 - var34 - 1] * (long) class220.field3074[1][var34] >> 16);
                        }
                        field841[var25] = var32;
                        var22 = this.field834.method2745(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field841[var23 + var25 - var29 - 1] * (long) class220.field3074[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field841[var25 - var30 - 1] * (long) class220.field3074[1][var30] >> 16);
                            }
                            field841[var25] = var28;
                            this.field834.method2745(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field848.method1485(0, (float) var22 / 65536.0F);
                    var24 = this.field848.method1485(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field841[var38] < -32768) {
                field841[var38] = -32768;
            }
            if (field841[var38] > 32767) {
                field841[var38] = 32767;
            }
        }
        return field841;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lnj;)V", line = 297)
    public final void method429(class164 arg0) {
        this.field842 = new class450();
        this.field842.method2742(arg0);
        this.field856 = new class450();
        this.field856.method2742(arg0);
        int var2 = arg0.method1087(false);
        if (var2 != 0) {
            arg0.field2185--;
            this.field838 = new class450();
            this.field838.method2742(arg0);
            this.field835 = new class450();
            this.field835.method2742(arg0);
        }
        int var3 = arg0.method1087(false);
        if (var3 != 0) {
            arg0.field2185--;
            this.field853 = new class450();
            this.field853.method2742(arg0);
            this.field857 = new class450();
            this.field857.method2742(arg0);
        }
        int var4 = arg0.method1087(false);
        if (var4 != 0) {
            arg0.field2185--;
            this.field839 = new class450();
            this.field839.method2742(arg0);
            this.field850 = new class450();
            this.field850.method2742(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1077((byte) -124);
            if (var6 == 0) {
                break;
            }
            this.field840[var5] = var6;
            this.field837[var5] = arg0.method1083(109);
            this.field851[var5] = arg0.method1077((byte) -111);
        }
        this.field846 = arg0.method1077((byte) -113);
        this.field855 = arg0.method1077((byte) -111);
        this.field836 = arg0.method1074(-635989152);
        this.field844 = arg0.method1074(-635989152);
        this.field848 = new class220();
        this.field834 = new class450();
        this.field848.method1481(arg0, this.field834);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)I", line = 366)
    private final int method430(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field845[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field843[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "()V", line = 419)
    public static void method431() {
        field841 = null;
        field843 = null;
        field845 = null;
        field854 = null;
        field849 = null;
        field852 = null;
        field847 = null;
        field858 = null;
    }
}
