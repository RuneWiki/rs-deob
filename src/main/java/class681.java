import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class681 {

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "[I")
    private int[] field9654 = new int[5];

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
    public int field9660 = 0;

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
    private int field9665 = 100;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public int field9655 = 500;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "[I")
    private int[] field9657 = new int[5];

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "[I")
    private int[] field9670 = new int[5];

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
    private int field9669 = 0;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "[I")
    private static int[] field9653 = new int[32768];

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "[I")
    private static int[] field9664;

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "[I")
    private static int[] field9666;

    @OriginalMember(owner = "client!mo", name = "w", descriptor = "[I")
    private static int[] field9674;

    @OriginalMember(owner = "client!mo", name = "x", descriptor = "[I")
    private static int[] field9675;

    @OriginalMember(owner = "client!mo", name = "u", descriptor = "[I")
    private static int[] field9672;

    @OriginalMember(owner = "client!mo", name = "v", descriptor = "[I")
    private static int[] field9673;

    @OriginalMember(owner = "client!mo", name = "y", descriptor = "[I")
    private static int[] field9676;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "Lmda;")
    private class240 field9662;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "Lwn;")
    private class660 field9652;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "Lwn;")
    private class660 field9656;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "Lwn;")
    private class660 field9658;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "Lwn;")
    private class660 field9659;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "Lwn;")
    private class660 field9661;

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "Lwn;")
    private class660 field9663;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "Lwn;")
    private class660 field9667;

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "Lwn;")
    private class660 field9668;

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "Lwn;")
    private class660 field9671;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field9653[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field9664 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field9664[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field9666 = new int[220500];
        field9674 = new int[5];
        field9675 = new int[5];
        field9672 = new int[5];
        field9673 = new int[5];
        field9676 = new int[5];
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)I", line = 9)
    private final int method3804(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field9664[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field9653[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "()V", line = 46)
    public static void method3805() {
        field9666 = null;
        field9653 = null;
        field9664 = null;
        field9673 = null;
        field9676 = null;
        field9675 = null;
        field9674 = null;
        field9672 = null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)[I", line = 60)
    public final int[] method3806(int arg0, int arg1) {
        class652.method3681(field9666, 0, arg0);
        if (arg1 < 10) {
            return field9666;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field9671.method3718();
        this.field9652.method3718();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field9663 != null) {
            this.field9663.method3718();
            this.field9667.method3718();
            var5 = (int) ((double) (this.field9663.field9396 - this.field9663.field9395) * 32.768D / var3);
            var6 = (int) ((double) this.field9663.field9395 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field9656 != null) {
            this.field9656.method3718();
            this.field9661.method3718();
            var8 = (int) ((double) (this.field9656.field9396 - this.field9656.field9395) * 32.768D / var3);
            var9 = (int) ((double) this.field9656.field9395 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field9654[var11] != 0) {
                field9673[var11] = 0;
                field9676[var11] = (int) ((double) this.field9657[var11] * var3);
                field9675[var11] = (this.field9654[var11] << 14) / 100;
                field9674[var11] = (int) ((double) (this.field9671.field9396 - this.field9671.field9395) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field9670[var11]) / var3);
                field9672[var11] = (int) ((double) this.field9671.field9395 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field9671.method3717(arg0);
            int var40 = this.field9652.method3717(arg0);
            if (this.field9663 != null) {
                int var41 = this.field9663.method3717(arg0);
                int var42 = this.field9667.method3717(arg0);
                var39 += this.method3804(var7, var42, this.field9663.field9399) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field9656 != null) {
                int var43 = this.field9656.method3717(arg0);
                int var44 = this.field9661.method3717(arg0);
                var40 = var40 * ((this.method3804(var10, var44, this.field9656.field9399) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field9654[var45] != 0) {
                    int var46 = field9676[var45] + var12;
                    if (var46 < arg0) {
                        field9666[var46] += this.method3804(field9673[var45], field9675[var45] * var40 >> 15, this.field9671.field9399);
                        field9673[var45] += (field9674[var45] * var39 >> 16) + field9672[var45];
                    }
                }
            }
        }
        if (this.field9658 != null) {
            this.field9658.method3718();
            this.field9668.method3718();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field9658.method3717(arg0);
                int var18 = this.field9668.method3717(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field9658.field9396 - this.field9658.field9395) * var17 >> 8) + this.field9658.field9395;
                } else {
                    var19 = ((this.field9658.field9396 - this.field9658.field9395) * var18 >> 8) + this.field9658.field9395;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field9666[var16] = 0;
                }
            }
        }
        if (this.field9669 > 0 && this.field9665 > 0) {
            int var20 = (int) ((double) this.field9669 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field9666[var21] += field9666[var21 - var20] * this.field9665 / 100;
            }
        }
        if (this.field9662.field3030[0] > 0 || this.field9662.field3030[1] > 0) {
            this.field9659.method3718();
            int var22 = this.field9659.method3717(arg0 + 1);
            int var23 = this.field9662.method1385(0, (float) var22 / 65536.0F);
            int var24 = this.field9662.method1385(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field9666[var23 + var25] * (long) class240.field3029 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field9666[var23 + var25 - var36 - 1] * (long) class240.field3031[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field9666[var25 - var37 - 1] * (long) class240.field3031[1][var37] >> 16);
                    }
                    field9666[var25] = var35;
                    var22 = this.field9659.method3717(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field9666[var23 + var25] * (long) class240.field3029 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field9666[var23 + var25 - var33 - 1] * (long) class240.field3031[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field9666[var25 - var34 - 1] * (long) class240.field3031[1][var34] >> 16);
                        }
                        field9666[var25] = var32;
                        var22 = this.field9659.method3717(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field9666[var23 + var25 - var29 - 1] * (long) class240.field3031[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field9666[var25 - var30 - 1] * (long) class240.field3031[1][var30] >> 16);
                            }
                            field9666[var25] = var28;
                            this.field9659.method3717(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field9662.method1385(0, (float) var22 / 65536.0F);
                    var24 = this.field9662.method1385(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field9666[var38] < -32768) {
                field9666[var38] = -32768;
            }
            if (field9666[var38] > 32767) {
                field9666[var38] = 32767;
            }
        }
        return field9666;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Liaa;)V", line = 355)
    public final void method3807(class452 arg0) {
        this.field9671 = new class660();
        this.field9671.method3715(arg0);
        this.field9652 = new class660();
        this.field9652.method3715(arg0);
        int var2 = arg0.method2541(97);
        if (var2 != 0) {
            arg0.field6215--;
            this.field9663 = new class660();
            this.field9663.method3715(arg0);
            this.field9667 = new class660();
            this.field9667.method3715(arg0);
        }
        int var3 = arg0.method2541(65);
        if (var3 != 0) {
            arg0.field6215--;
            this.field9656 = new class660();
            this.field9656.method3715(arg0);
            this.field9661 = new class660();
            this.field9661.method3715(arg0);
        }
        int var4 = arg0.method2541(87);
        if (var4 != 0) {
            arg0.field6215--;
            this.field9658 = new class660();
            this.field9658.method3715(arg0);
            this.field9668 = new class660();
            this.field9668.method3715(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2548(-29696);
            if (var6 == 0) {
                break;
            }
            this.field9654[var5] = var6;
            this.field9670[var5] = arg0.method2572(false);
            this.field9657[var5] = arg0.method2548(-29696);
        }
        this.field9669 = arg0.method2548(-29696);
        this.field9665 = arg0.method2548(-29696);
        this.field9655 = arg0.method2574(-1758460248);
        this.field9660 = arg0.method2574(-1758460248);
        this.field9662 = new class240();
        this.field9659 = new class660();
        this.field9662.method1387(arg0, this.field9659);
    }
}
