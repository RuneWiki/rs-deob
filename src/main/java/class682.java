import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class682 {

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "I")
    public int field9733 = 0;

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "I")
    public int field9735 = 500;

    @OriginalMember(owner = "client!ww", name = "l", descriptor = "I")
    private int field9740 = 0;

    @OriginalMember(owner = "client!ww", name = "v", descriptor = "I")
    private int field9750 = 100;

    @OriginalMember(owner = "client!ww", name = "u", descriptor = "[I")
    private int[] field9749 = new int[5];

    @OriginalMember(owner = "client!ww", name = "m", descriptor = "[I")
    private int[] field9741 = new int[5];

    @OriginalMember(owner = "client!ww", name = "y", descriptor = "[I")
    private int[] field9753 = new int[5];

    @OriginalMember(owner = "client!ww", name = "k", descriptor = "[I")
    private static int[] field9739 = new int[32768];

    @OriginalMember(owner = "client!ww", name = "n", descriptor = "[I")
    private static int[] field9742;

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "[I")
    private static int[] field9731;

    @OriginalMember(owner = "client!ww", name = "r", descriptor = "[I")
    private static int[] field9746;

    @OriginalMember(owner = "client!ww", name = "t", descriptor = "[I")
    private static int[] field9748;

    @OriginalMember(owner = "client!ww", name = "s", descriptor = "[I")
    private static int[] field9747;

    @OriginalMember(owner = "client!ww", name = "x", descriptor = "[I")
    private static int[] field9752;

    @OriginalMember(owner = "client!ww", name = "w", descriptor = "[I")
    private static int[] field9751;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "Lfp;")
    private class294 field9729;

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "Lfp;")
    private class294 field9730;

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "Lfp;")
    private class294 field9732;

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "Lfp;")
    private class294 field9736;

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "Lfp;")
    private class294 field9737;

    @OriginalMember(owner = "client!ww", name = "j", descriptor = "Lfp;")
    private class294 field9738;

    @OriginalMember(owner = "client!ww", name = "o", descriptor = "Lfp;")
    private class294 field9743;

    @OriginalMember(owner = "client!ww", name = "p", descriptor = "Lfp;")
    private class294 field9744;

    @OriginalMember(owner = "client!ww", name = "q", descriptor = "Lfp;")
    private class294 field9745;

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "Lvg;")
    private class49 field9734;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field9739[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field9742 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field9742[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field9731 = new int[220500];
        field9746 = new int[5];
        field9748 = new int[5];
        field9747 = new int[5];
        field9752 = new int[5];
        field9751 = new int[5];
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method3864(int arg0, int arg1) {
        class359.method2056(field9731, 0, arg0);
        if (arg1 < 10) {
            return field9731;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field9743.method1795();
        this.field9737.method1795();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field9729 != null) {
            this.field9729.method1795();
            this.field9732.method1795();
            var5 = (int) ((double) (this.field9729.field4030 - this.field9729.field4031) * 32.768D / var3);
            var6 = (int) ((double) this.field9729.field4031 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field9744 != null) {
            this.field9744.method1795();
            this.field9745.method1795();
            var8 = (int) ((double) (this.field9744.field4030 - this.field9744.field4031) * 32.768D / var3);
            var9 = (int) ((double) this.field9744.field4031 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field9753[var11] != 0) {
                field9746[var11] = 0;
                field9751[var11] = (int) ((double) this.field9749[var11] * var3);
                field9747[var11] = (this.field9753[var11] << 14) / 100;
                field9752[var11] = (int) ((double) (this.field9743.field4030 - this.field9743.field4031) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field9741[var11]) / var3);
                field9748[var11] = (int) ((double) this.field9743.field4031 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field9743.method1796(arg0);
            int var40 = this.field9737.method1796(arg0);
            if (this.field9729 != null) {
                int var41 = this.field9729.method1796(arg0);
                int var42 = this.field9732.method1796(arg0);
                var39 += this.method3866(var7, var42, this.field9729.field4027) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field9744 != null) {
                int var43 = this.field9744.method1796(arg0);
                int var44 = this.field9745.method1796(arg0);
                var40 = var40 * ((this.method3866(var10, var44, this.field9744.field4027) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field9753[var45] != 0) {
                    int var46 = field9751[var45] + var12;
                    if (var46 < arg0) {
                        field9731[var46] += this.method3866(field9746[var45], field9747[var45] * var40 >> 15, this.field9743.field4027);
                        field9746[var45] += (field9752[var45] * var39 >> 16) + field9748[var45];
                    }
                }
            }
        }
        if (this.field9736 != null) {
            this.field9736.method1795();
            this.field9738.method1795();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field9736.method1796(arg0);
                int var18 = this.field9738.method1796(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field9736.field4030 - this.field9736.field4031) * var17 >> 8) + this.field9736.field4031;
                } else {
                    var19 = ((this.field9736.field4030 - this.field9736.field4031) * var18 >> 8) + this.field9736.field4031;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field9731[var16] = 0;
                }
            }
        }
        if (this.field9740 > 0 && this.field9750 > 0) {
            int var20 = (int) ((double) this.field9740 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field9731[var21] += field9731[var21 - var20] * this.field9750 / 100;
            }
        }
        if (this.field9734.field583[0] > 0 || this.field9734.field583[1] > 0) {
            this.field9730.method1795();
            int var22 = this.field9730.method1796(arg0 + 1);
            int var23 = this.field9734.method397(0, (float) var22 / 65536.0F);
            int var24 = this.field9734.method397(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field9731[var23 + var25] * (long) class49.field586 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field9731[var23 + var25 - var36 - 1] * (long) class49.field580[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field9731[var25 - var37 - 1] * (long) class49.field580[1][var37] >> 16);
                    }
                    field9731[var25] = var35;
                    var22 = this.field9730.method1796(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field9731[var23 + var25] * (long) class49.field586 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field9731[var23 + var25 - var33 - 1] * (long) class49.field580[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field9731[var25 - var34 - 1] * (long) class49.field580[1][var34] >> 16);
                        }
                        field9731[var25] = var32;
                        var22 = this.field9730.method1796(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field9731[var23 + var25 - var29 - 1] * (long) class49.field580[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field9731[var25 - var30 - 1] * (long) class49.field580[1][var30] >> 16);
                            }
                            field9731[var25] = var28;
                            this.field9730.method1796(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field9734.method397(0, (float) var22 / 65536.0F);
                    var24 = this.field9734.method397(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field9731[var38] < -32768) {
                field9731[var38] = -32768;
            }
            if (field9731[var38] > 32767) {
                field9731[var38] = 32767;
            }
        }
        return field9731;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lac;)V", line = 306)
    public final void method3865(class501 arg0) {
        this.field9743 = new class294();
        this.field9743.method1794(arg0);
        this.field9737 = new class294();
        this.field9737.method1794(arg0);
        int var2 = arg0.method2874((byte) -75);
        if (var2 != 0) {
            arg0.field6892--;
            this.field9729 = new class294();
            this.field9729.method1794(arg0);
            this.field9732 = new class294();
            this.field9732.method1794(arg0);
        }
        int var3 = arg0.method2874((byte) -75);
        if (var3 != 0) {
            arg0.field6892--;
            this.field9744 = new class294();
            this.field9744.method1794(arg0);
            this.field9745 = new class294();
            this.field9745.method1794(arg0);
        }
        int var4 = arg0.method2874((byte) -75);
        if (var4 != 0) {
            arg0.field6892--;
            this.field9736 = new class294();
            this.field9736.method1794(arg0);
            this.field9738 = new class294();
            this.field9738.method1794(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2871((byte) -87);
            if (var6 == 0) {
                break;
            }
            this.field9753[var5] = var6;
            this.field9741[var5] = arg0.method2855((byte) -8);
            this.field9749[var5] = arg0.method2871((byte) -87);
        }
        this.field9740 = arg0.method2871((byte) -87);
        this.field9750 = arg0.method2871((byte) -87);
        this.field9735 = arg0.method2845(-1);
        this.field9733 = arg0.method2845(-1);
        this.field9734 = new class49();
        this.field9730 = new class294();
        this.field9734.method398(arg0, this.field9730);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(III)I", line = 368)
    private final int method3866(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field9742[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field9739[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "()V", line = 431)
    public static void method3867() {
        field9731 = null;
        field9739 = null;
        field9742 = null;
        field9746 = null;
        field9751 = null;
        field9747 = null;
        field9752 = null;
        field9748 = null;
    }
}
