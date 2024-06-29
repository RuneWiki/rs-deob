import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class18 {

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    private int field452 = 0;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    private int field451 = 100;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public int field455 = 0;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "[I")
    private int[] field458 = new int[5];

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "[I")
    private int[] field462 = new int[5];

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public int field467 = 500;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "[I")
    private int[] field461 = new int[5];

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "[I")
    private static int[] field454 = new int[32768];

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "[I")
    private static int[] field460;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "[I")
    private static int[] field459;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "[I")
    private static int[] field465;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "[I")
    private static int[] field468;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "[I")
    private static int[] field464;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "[I")
    private static int[] field469;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "[I")
    private static int[] field466;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lrd;")
    private class106 field447;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Lrd;")
    private class106 field448;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Lrd;")
    private class106 field449;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lrd;")
    private class106 field450;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Lrd;")
    private class106 field453;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "Lrd;")
    private class106 field456;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "Lrd;")
    private class106 field463;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "Lrd;")
    private class106 field470;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "Lrd;")
    private class106 field471;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "Lf;")
    private class34 field457;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field454[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field460 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field460[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field459 = new int[220500];
        field465 = new int[5];
        field468 = new int[5];
        field464 = new int[5];
        field469 = new int[5];
        field466 = new int[5];
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()V", line = 4)
    public static void method130() {
        field459 = null;
        field454 = null;
        field460 = null;
        field469 = null;
        field465 = null;
        field466 = null;
        field468 = null;
        field464 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)I", line = 28)
    private final int method131(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field460[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field454[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)[I", line = 51)
    public final int[] method132(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field459[var3] = 0;
        }
        if (arg1 < 10) {
            return field459;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field448.method779();
        this.field456.method779();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field463 != null) {
            this.field463.method779();
            this.field447.method779();
            var6 = (int) ((double) (this.field463.field2641 - this.field463.field2639) * 32.768D / var4);
            var7 = (int) ((double) this.field463.field2639 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field471 != null) {
            this.field471.method779();
            this.field470.method779();
            var9 = (int) ((double) (this.field471.field2641 - this.field471.field2639) * 32.768D / var4);
            var10 = (int) ((double) this.field471.field2639 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field458[var12] != 0) {
                field469[var12] = 0;
                field465[var12] = (int) ((double) this.field462[var12] * var4);
                field466[var12] = (this.field458[var12] << 14) / 100;
                field468[var12] = (int) ((double) (this.field448.field2641 - this.field448.field2639) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field461[var12]) / var4);
                field464[var12] = (int) ((double) this.field448.field2639 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field448.method781(arg0);
            int var41 = this.field456.method781(arg0);
            if (this.field463 != null) {
                int var42 = this.field463.method781(arg0);
                int var43 = this.field447.method781(arg0);
                var40 += this.method131(var8, var43, this.field463.field2636) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field471 != null) {
                int var44 = this.field471.method781(arg0);
                int var45 = this.field470.method781(arg0);
                var41 = var41 * ((this.method131(var11, var45, this.field471.field2636) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field458[var46] != 0) {
                    int var47 = field465[var46] + var13;
                    if (var47 < arg0) {
                        field459[var47] += this.method131(field469[var46], field466[var46] * var41 >> 15, this.field448.field2636);
                        field469[var46] += (field468[var46] * var40 >> 16) + field464[var46];
                    }
                }
            }
        }
        if (this.field450 != null) {
            this.field450.method779();
            this.field449.method779();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field450.method781(arg0);
                int var19 = this.field449.method781(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field450.field2641 - this.field450.field2639) * var18 >> 8) + this.field450.field2639;
                } else {
                    var20 = ((this.field450.field2641 - this.field450.field2639) * var19 >> 8) + this.field450.field2639;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field459[var17] = 0;
                }
            }
        }
        if (this.field452 > 0 && this.field451 > 0) {
            int var21 = (int) ((double) this.field452 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field459[var22] += field459[var22 - var21] * this.field451 / 100;
            }
        }
        if (this.field457.field928[0] > 0 || this.field457.field928[1] > 0) {
            this.field453.method779();
            int var23 = this.field453.method781(arg0 + 1);
            int var24 = this.field457.method278(0, (float) var23 / 65536.0F);
            int var25 = this.field457.method278(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field459[var24 + var26] * (long) class34.field929 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field459[var24 + var26 - var37 - 1] * (long) class34.field927[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field459[var26 - var38 - 1] * (long) class34.field927[1][var38] >> 16);
                    }
                    field459[var26] = var36;
                    var23 = this.field453.method781(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field459[var24 + var26] * (long) class34.field929 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field459[var24 + var26 - var34 - 1] * (long) class34.field927[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field459[var26 - var35 - 1] * (long) class34.field927[1][var35] >> 16);
                        }
                        field459[var26] = var33;
                        var23 = this.field453.method781(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field459[var24 + var26 - var30 - 1] * (long) class34.field927[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field459[var26 - var31 - 1] * (long) class34.field927[1][var31] >> 16);
                            }
                            field459[var26] = var29;
                            this.field453.method781(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field457.method278(0, (float) var23 / 65536.0F);
                    var25 = this.field457.method278(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field459[var39] < -32768) {
                field459[var39] = -32768;
            }
            if (field459[var39] > 32767) {
                field459[var39] = 32767;
            }
        }
        return field459;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Luc;)V", line = 336)
    public final void method133(class122 arg0) {
        this.field448 = new class106();
        this.field448.method778(arg0);
        this.field456 = new class106();
        this.field456.method778(arg0);
        int var2 = arg0.method943(-1025);
        if (var2 != 0) {
            arg0.field3047--;
            this.field463 = new class106();
            this.field463.method778(arg0);
            this.field447 = new class106();
            this.field447.method778(arg0);
        }
        int var3 = arg0.method943(-1025);
        if (var3 != 0) {
            arg0.field3047--;
            this.field471 = new class106();
            this.field471.method778(arg0);
            this.field470 = new class106();
            this.field470.method778(arg0);
        }
        int var4 = arg0.method943(-1025);
        if (var4 != 0) {
            arg0.field3047--;
            this.field450 = new class106();
            this.field450.method778(arg0);
            this.field449 = new class106();
            this.field449.method778(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method948(-30);
            if (var6 == 0) {
                break;
            }
            this.field458[var5] = var6;
            this.field461[var5] = arg0.method960(89);
            this.field462[var5] = arg0.method948(125);
        }
        this.field452 = arg0.method948(-90);
        this.field451 = arg0.method948(115);
        this.field467 = arg0.method938((byte) 76);
        this.field455 = arg0.method938((byte) -95);
        this.field457 = new class34();
        this.field453 = new class106();
        this.field457.method274(arg0, this.field453);
    }
}
