import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class788 {

    @OriginalMember(owner = "client!rw", name = "h", descriptor = "I")
    private int field10821 = 0;

    @OriginalMember(owner = "client!rw", name = "g", descriptor = "[I")
    private int[] field10820 = new int[5];

    @OriginalMember(owner = "client!rw", name = "p", descriptor = "I")
    public int field10829 = 500;

    @OriginalMember(owner = "client!rw", name = "o", descriptor = "[I")
    private int[] field10828 = new int[5];

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "I")
    public int field10816 = 0;

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "I")
    private int field10815 = 100;

    @OriginalMember(owner = "client!rw", name = "w", descriptor = "[I")
    private int[] field10836 = new int[5];

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "[I")
    private static int[] field10819 = new int[32768];

    @OriginalMember(owner = "client!rw", name = "r", descriptor = "[I")
    private static int[] field10831;

    @OriginalMember(owner = "client!rw", name = "j", descriptor = "[I")
    private static int[] field10823;

    @OriginalMember(owner = "client!rw", name = "s", descriptor = "[I")
    private static int[] field10832;

    @OriginalMember(owner = "client!rw", name = "u", descriptor = "[I")
    private static int[] field10834;

    @OriginalMember(owner = "client!rw", name = "t", descriptor = "[I")
    private static int[] field10833;

    @OriginalMember(owner = "client!rw", name = "y", descriptor = "[I")
    private static int[] field10838;

    @OriginalMember(owner = "client!rw", name = "x", descriptor = "[I")
    private static int[] field10837;

    @OriginalMember(owner = "client!rw", name = "n", descriptor = "Lvr;")
    private class147 field10827;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "Lgo;")
    private class653 field10814;

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "Lgo;")
    private class653 field10817;

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "Lgo;")
    private class653 field10818;

    @OriginalMember(owner = "client!rw", name = "i", descriptor = "Lgo;")
    private class653 field10822;

    @OriginalMember(owner = "client!rw", name = "k", descriptor = "Lgo;")
    private class653 field10824;

    @OriginalMember(owner = "client!rw", name = "l", descriptor = "Lgo;")
    private class653 field10825;

    @OriginalMember(owner = "client!rw", name = "m", descriptor = "Lgo;")
    private class653 field10826;

    @OriginalMember(owner = "client!rw", name = "q", descriptor = "Lgo;")
    private class653 field10830;

    @OriginalMember(owner = "client!rw", name = "v", descriptor = "Lgo;")
    private class653 field10835;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field10819[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field10831 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field10831[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field10823 = new int[220500];
        field10832 = new int[5];
        field10834 = new int[5];
        field10833 = new int[5];
        field10838 = new int[5];
        field10837 = new int[5];
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Ldt;)V", line = 4)
    public final void method4313(class254 arg0) {
        this.field10814 = new class653();
        this.field10814.method3631(arg0);
        this.field10822 = new class653();
        this.field10822.method3631(arg0);
        int var2 = arg0.method1731((byte) 64);
        if (var2 != 0) {
            arg0.field3725--;
            this.field10826 = new class653();
            this.field10826.method3631(arg0);
            this.field10824 = new class653();
            this.field10824.method3631(arg0);
        }
        int var3 = arg0.method1731((byte) 64);
        if (var3 != 0) {
            arg0.field3725--;
            this.field10825 = new class653();
            this.field10825.method3631(arg0);
            this.field10835 = new class653();
            this.field10835.method3631(arg0);
        }
        int var4 = arg0.method1731((byte) 64);
        if (var4 != 0) {
            arg0.field3725--;
            this.field10817 = new class653();
            this.field10817.method3631(arg0);
            this.field10818 = new class653();
            this.field10818.method3631(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1673(-32768);
            if (var6 == 0) {
                break;
            }
            this.field10828[var5] = var6;
            this.field10820[var5] = arg0.method1669(-16443);
            this.field10836[var5] = arg0.method1673(-32768);
        }
        this.field10821 = arg0.method1673(-32768);
        this.field10815 = arg0.method1673(-32768);
        this.field10829 = arg0.method1728((byte) 36);
        this.field10816 = arg0.method1728((byte) 88);
        this.field10827 = new class147();
        this.field10830 = new class653();
        this.field10827.method1033(arg0, this.field10830);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)[I", line = 80)
    public final int[] method4314(int arg0, int arg1) {
        class421.method2530(field10823, 0, arg0);
        if (arg1 < 10) {
            return field10823;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field10814.method3632();
        this.field10822.method3632();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field10826 != null) {
            this.field10826.method3632();
            this.field10824.method3632();
            var5 = (int) ((double) (this.field10826.field8802 - this.field10826.field8803) * 32.768D / var3);
            var6 = (int) ((double) this.field10826.field8803 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field10825 != null) {
            this.field10825.method3632();
            this.field10835.method3632();
            var8 = (int) ((double) (this.field10825.field8802 - this.field10825.field8803) * 32.768D / var3);
            var9 = (int) ((double) this.field10825.field8803 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field10828[var11] != 0) {
                field10833[var11] = 0;
                field10832[var11] = (int) ((double) this.field10836[var11] * var3);
                field10834[var11] = (this.field10828[var11] << 14) / 100;
                field10837[var11] = (int) ((double) (this.field10814.field8802 - this.field10814.field8803) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field10820[var11]) / var3);
                field10838[var11] = (int) ((double) this.field10814.field8803 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field10814.method3633(arg0);
            int var40 = this.field10822.method3633(arg0);
            if (this.field10826 != null) {
                int var41 = this.field10826.method3633(arg0);
                int var42 = this.field10824.method3633(arg0);
                var39 += this.method4316(var7, var42, this.field10826.field8801) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field10825 != null) {
                int var43 = this.field10825.method3633(arg0);
                int var44 = this.field10835.method3633(arg0);
                var40 = var40 * ((this.method4316(var10, var44, this.field10825.field8801) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field10828[var45] != 0) {
                    int var46 = field10832[var45] + var12;
                    if (var46 < arg0) {
                        field10823[var46] += this.method4316(field10833[var45], field10834[var45] * var40 >> 15, this.field10814.field8801);
                        field10833[var45] += (field10837[var45] * var39 >> 16) + field10838[var45];
                    }
                }
            }
        }
        if (this.field10817 != null) {
            this.field10817.method3632();
            this.field10818.method3632();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field10817.method3633(arg0);
                int var18 = this.field10818.method3633(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field10817.field8802 - this.field10817.field8803) * var17 >> 8) + this.field10817.field8803;
                } else {
                    var19 = ((this.field10817.field8802 - this.field10817.field8803) * var18 >> 8) + this.field10817.field8803;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field10823[var16] = 0;
                }
            }
        }
        if (this.field10821 > 0 && this.field10815 > 0) {
            int var20 = (int) ((double) this.field10821 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field10823[var21] += field10823[var21 - var20] * this.field10815 / 100;
            }
        }
        if (this.field10827.field1982[0] > 0 || this.field10827.field1982[1] > 0) {
            this.field10830.method3632();
            int var22 = this.field10830.method3633(arg0 + 1);
            int var23 = this.field10827.method1034(0, (float) var22 / 65536.0F);
            int var24 = this.field10827.method1034(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field10823[var23 + var25] * (long) class147.field1985 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field10823[var23 + var25 - var36 - 1] * (long) class147.field1984[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field10823[var25 - var37 - 1] * (long) class147.field1984[1][var37] >> 16);
                    }
                    field10823[var25] = var35;
                    var22 = this.field10830.method3633(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field10823[var23 + var25] * (long) class147.field1985 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field10823[var23 + var25 - var33 - 1] * (long) class147.field1984[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field10823[var25 - var34 - 1] * (long) class147.field1984[1][var34] >> 16);
                        }
                        field10823[var25] = var32;
                        var22 = this.field10830.method3633(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field10823[var23 + var25 - var29 - 1] * (long) class147.field1984[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field10823[var25 - var30 - 1] * (long) class147.field1984[1][var30] >> 16);
                            }
                            field10823[var25] = var28;
                            this.field10830.method3633(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field10827.method1034(0, (float) var22 / 65536.0F);
                    var24 = this.field10827.method1034(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field10823[var38] < -32768) {
                field10823[var38] = -32768;
            }
            if (field10823[var38] > 32767) {
                field10823[var38] = 32767;
            }
        }
        return field10823;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "()V", line = 369)
    public static void method4315() {
        field10823 = null;
        field10819 = null;
        field10831 = null;
        field10833 = null;
        field10832 = null;
        field10834 = null;
        field10837 = null;
        field10838 = null;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(III)I", line = 381)
    private final int method4316(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field10831[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field10819[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }
}
