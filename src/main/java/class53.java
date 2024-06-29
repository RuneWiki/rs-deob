import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class53 {

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "[I")
    private int[] field650 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    private int field647 = 100;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public int field655 = 0;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "[I")
    private int[] field657 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public int field666 = 500;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "[I")
    private int[] field669 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    private int field668 = 0;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "[I")
    private static int[] field648 = new int[32768];

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "[I")
    private static int[] field652;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "[I")
    private static int[] field662;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "[I")
    private static int[] field663;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "[I")
    private static int[] field665;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "[I")
    private static int[] field664;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "[I")
    private static int[] field667;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "[I")
    private static int[] field671;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "Lfm;")
    private class322 field649;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Lfm;")
    private class322 field653;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "Lfm;")
    private class322 field654;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Lfm;")
    private class322 field656;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "Lfm;")
    private class322 field658;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "Lfm;")
    private class322 field659;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "Lfm;")
    private class322 field660;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Lfm;")
    private class322 field661;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "Lfm;")
    private class322 field670;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Lgm;")
    private class47 field651;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)[I", line = 11)
    public final int[] method350(int arg0, int arg1) {
        class85.method588(field662, 0, arg0);
        if (arg1 < 10) {
            return field662;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field660.method2206();
        this.field659.method2206();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field653 != null) {
            this.field653.method2206();
            this.field649.method2206();
            var5 = (int) ((double) (this.field653.field4858 - this.field653.field4862) * 32.768D / var3);
            var6 = (int) ((double) this.field653.field4862 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field658 != null) {
            this.field658.method2206();
            this.field656.method2206();
            var8 = (int) ((double) (this.field658.field4858 - this.field658.field4862) * 32.768D / var3);
            var9 = (int) ((double) this.field658.field4862 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field669[var11] != 0) {
                field671[var11] = 0;
                field663[var11] = (int) ((double) this.field657[var11] * var3);
                field667[var11] = (this.field669[var11] << 14) / 100;
                field665[var11] = (int) ((double) (this.field660.field4858 - this.field660.field4862) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field650[var11]) / var3);
                field664[var11] = (int) ((double) this.field660.field4862 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field660.method2207(arg0);
            int var14 = this.field659.method2207(arg0);
            if (this.field653 != null) {
                int var15 = this.field653.method2207(arg0);
                int var16 = this.field649.method2207(arg0);
                var13 += this.method351(var7, var16, this.field653.field4861) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field658 != null) {
                int var17 = this.field658.method2207(arg0);
                int var18 = this.field656.method2207(arg0);
                var14 = var14 * ((this.method351(var10, var18, this.field658.field4861) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field669[var19] != 0) {
                    int var20 = field663[var19] + var12;
                    if (var20 < arg0) {
                        field662[var20] += this.method351(field671[var19], field667[var19] * var14 >> 15, this.field660.field4861);
                        field671[var19] += (field665[var19] * var13 >> 16) + field664[var19];
                    }
                }
            }
        }
        if (this.field661 != null) {
            this.field661.method2206();
            this.field670.method2206();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field661.method2207(arg0);
                int var26 = this.field670.method2207(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field661.field4858 - this.field661.field4862) * var25 >> 8) + this.field661.field4862;
                } else {
                    var27 = ((this.field661.field4858 - this.field661.field4862) * var26 >> 8) + this.field661.field4862;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field662[var24] = 0;
                }
            }
        }
        if (this.field668 > 0 && this.field647 > 0) {
            int var28 = (int) ((double) this.field668 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field662[var29] += field662[var29 - var28] * this.field647 / 100;
            }
        }
        if (this.field651.field587[0] > 0 || this.field651.field587[1] > 0) {
            this.field654.method2206();
            int var30 = this.field654.method2207(arg0 + 1);
            int var31 = this.field651.method324(0, (float) var30 / 65536.0F);
            int var32 = this.field651.method324(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field662[var31 + var33] * (long) class47.field586 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field662[var31 + var33 - var36 - 1] * (long) class47.field588[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field662[var33 - var37 - 1] * (long) class47.field588[1][var37] >> 16);
                    }
                    field662[var33] = var35;
                    var30 = this.field654.method2207(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field662[var31 + var33] * (long) class47.field586 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field662[var31 + var33 - var40 - 1] * (long) class47.field588[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field662[var33 - var41 - 1] * (long) class47.field588[1][var41] >> 16);
                        }
                        field662[var33] = var39;
                        var30 = this.field654.method2207(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field662[var31 + var33 - var43 - 1] * (long) class47.field588[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field662[var33 - var44 - 1] * (long) class47.field588[1][var44] >> 16);
                            }
                            field662[var33] = var42;
                            this.field654.method2207(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field651.method324(0, (float) var30 / 65536.0F);
                    var32 = this.field651.method324(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field662[var46] < -32768) {
                field662[var46] = -32768;
            }
            if (field662[var46] > 32767) {
                field662[var46] = 32767;
            }
        }
        return field662;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)I", line = 309)
    private final int method351(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field652[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field648[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lre;)V", line = 331)
    public final void method352(class263 arg0) {
        this.field660 = new class322();
        this.field660.method2205(arg0);
        this.field659 = new class322();
        this.field659.method2205(arg0);
        int var2 = arg0.method1787(false);
        if (var2 != 0) {
            arg0.field4025--;
            this.field653 = new class322();
            this.field653.method2205(arg0);
            this.field649 = new class322();
            this.field649.method2205(arg0);
        }
        int var3 = arg0.method1787(false);
        if (var3 != 0) {
            arg0.field4025--;
            this.field658 = new class322();
            this.field658.method2205(arg0);
            this.field656 = new class322();
            this.field656.method2205(arg0);
        }
        int var4 = arg0.method1787(false);
        if (var4 != 0) {
            arg0.field4025--;
            this.field661 = new class322();
            this.field661.method2205(arg0);
            this.field670 = new class322();
            this.field670.method2205(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1832(-32768);
            if (var6 == 0) {
                break;
            }
            this.field669[var5] = var6;
            this.field650[var5] = arg0.method1789(-49152);
            this.field657[var5] = arg0.method1832(-32768);
        }
        this.field668 = arg0.method1832(-32768);
        this.field647 = arg0.method1832(-32768);
        this.field666 = arg0.method1830((byte) -77);
        this.field655 = arg0.method1830((byte) -77);
        this.field651 = new class47();
        this.field654 = new class322();
        this.field651.method325(arg0, this.field654);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field648[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field652 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field652[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field662 = new int[220500];
        field663 = new int[5];
        field665 = new int[5];
        field664 = new int[5];
        field667 = new int[5];
        field671 = new int[5];
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "()V", line = 440)
    public static void method353() {
        field662 = null;
        field648 = null;
        field652 = null;
        field671 = null;
        field663 = null;
        field667 = null;
        field665 = null;
        field664 = null;
    }
}
