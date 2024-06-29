import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class622 {

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "Lsq;")
    private class194 field8864;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "Lnh;")
    private class495 field8857;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public int field8848;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    private int field8854;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "[B")
    public byte[] field8858;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    private int field8856;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    private int field8853;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    private int field8851;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "Z")
    public static boolean field8855 = true;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "Leda;")
    public static class116 field8861 = new class116(41, 3);

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field8849;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field8850;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field8852;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field8859;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public static int field8863;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "[[Luk;")
    private class265[][] field8865;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "[[[B")
    public static byte[][][] field8867;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 10)
    public static void method3506(int arg0) {
        int var1 = -24 % ((arg0 + 84) / 42);
        field8867 = null;
        field8861 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILha;II)V", line = 22)
    public final void method3507(int arg0, class427 arg1, int arg2, int arg3) {
        field8866++;
        class45 var5 = (class45) arg1;
        int var6 = var5.field612 + arg0 + 1;
        int var7 = var5.field605 + arg3 + arg2;
        int var8 = this.field8848 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field603;
        int var11 = var5.field615;
        int var12 = this.field8848 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var10 -= var14;
            var9 += var11 * var14;
            var8 += this.field8848 * var14;
        }
        if (this.field8854 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field8854;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var11 -= var16;
            var9 += var16;
            var13 += var16;
            var8 += var16;
            var7 = 1;
        }
        if ((var7 + var11) >= this.field8848) {
            int var17 = var11 + var7 + 1 - this.field8848;
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class113.method914(var12, var9, var5.field614, var10, this.field8858, var13, var11, var8, (byte) 104);
            this.method3510(var7, -28, var11, var6, var10);
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V", line = 95)
    public static final void method3508(int arg0) {
        if (arg0 != 1) {
            field8867 = null;
        }
        class681.field9691.method950((byte) 106);
        field8862++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V", line = 107)
    public final void method3509(byte arg0) {
        field8863++;
        this.field8865 = new class265[this.field8853][this.field8851];
        if (arg0 != -82) {
            return;
        }
        for (int var2 = 0; var2 < this.field8851; var2++) {
            for (int var3 = 0; var3 < this.field8853; var3++) {
                this.field8865[var3][var2] = new class265(this.field8857, this, this.field8864, var3, var2, this.field8856, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field8865[var3][var2].field3800 == 0) {
                    this.field8865[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIII)V", line = 142)
    private final void method3510(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= -15) {
            return;
        }
        field8852++;
        if (this.field8865 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg0 + arg2 - 1 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg3 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class265[] var11 = this.field8865[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field3815 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILha;IB)Z", line = 189)
    public final boolean method3511(int arg0, class427 arg1, int arg2, byte arg3) {
        field8849++;
        class45 var5 = (class45) arg1;
        int var6 = var5.field612 + arg2 + 1;
        int var7 = var5.field605 + arg0 + 1;
        int var8 = this.field8848 * var6 + var7;
        int var9 = var5.field603;
        int var10 = var5.field615;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var6 = 1;
            var9 -= var11;
            var8 += this.field8848 * var11;
        }
        int var12 = this.field8848 - var10;
        if (this.field8854 <= var6 + var9) {
            int var13 = var9 + var6 + 1 - this.field8854;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var12 += var14;
            var10 -= var14;
            var8 += var14;
        }
        if ((var7 + var10) >= this.field8848) {
            int var15 = var10 + var7 + 1 - this.field8848;
            var12 += var15;
            var10 -= var15;
        }
        if (var10 <= 0 || var9 <= 0) {
            return false;
        }
        byte var16 = 8;
        int var17 = (var16 - 1) * this.field8848 + var12;
        if (arg3 >= -121) {
            this.method3510(18, 100, 93, 29, 27);
        }
        return class624.method3517(this.field8858, var17, var10, var9, false, var16, var8);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZBI[[ZII)V", line = 265)
    public final void method3512(boolean arg0, byte arg1, int arg2, boolean[][] arg3, int arg4, int arg5) {
        this.field8857.method2939(false, (byte) -121);
        field8850++;
        this.field8857.method2931(-8193, false);
        this.field8857.method2938(1, (byte) 123);
        this.field8857.method2956((byte) 47, 1);
        if (arg1 != 68) {
            return;
        }
        this.field8857.method2922(-2, -27382, false, false);
        float var7 = 1.0F / (float) (this.field8857.field7324 * 128);
        if (arg0) {
            for (int var8 = 0; var8 < this.field8851; var8++) {
                int var9 = var8 << this.field8856;
                int var10 = var8 + 1 << this.field8856;
                label145: for (int var11 = 0; var11 < this.field8853; var11++) {
                    if (this.field8865[var11][var8] != null) {
                        int var12 = var11 << this.field8856;
                        int var13 = var11 + 1 << this.field8856;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if (var14 - arg5 >= -arg2 && arg2 >= (var14 - arg5)) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if (-arg2 <= var15 - arg4 && var15 - arg4 <= arg2 && arg3[var14 + arg2 - arg5][var15 + arg2 - arg4]) {
                                        class14 var16 = this.field8857.method2946((byte) -124);
                                        var16.method190(arg1 - 183, 1.0F, var7, var7);
                                        var16.method158(-var11, -var8, 0);
                                        this.field8857.method2949(class303.field4244, (byte) -10);
                                        this.field8865[var11][var8].method1683((byte) 84);
                                        continue label145;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field8851; var17++) {
                int var18 = var17 << this.field8856;
                int var19 = var17 + 1 << this.field8856;
                for (int var20 = 0; var20 < this.field8853; var20++) {
                    class265 var21 = this.field8865[var20][var17];
                    if (var21 != null) {
                        class175 var22 = this.field8857.method2966(0, var21.field3800 * 3);
                        Buffer var23 = var22.method1283((byte) 0, true);
                        if (var23 != null) {
                            Stream var24 = this.field8857.method2912(125, var23);
                            int var25 = 0;
                            int var26 = var20 << this.field8856;
                            int var27 = var20 + 1 << this.field8856;
                            for (int var28 = var18; var28 < var19; var28++) {
                                if (var28 - arg4 >= -arg2 && var28 - arg4 <= arg2) {
                                    int var30 = this.field8864.field9706 * var28 + var26;
                                    for (int var31 = var26; var31 < var27; var31++) {
                                        if ((var31 - arg5) >= (-arg2) && arg2 >= (var31 - arg5) && arg3[var31 + arg2 - arg5][var28 + arg2 - arg4]) {
                                            short[] var32 = this.field8864.field3015[var30];
                                            if (var32 != null) {
                                                if (Stream.method2042()) {
                                                    for (int var34 = 0; var34 < var32.length; var34++) {
                                                        var25++;
                                                        var24.method2036(var32[var34] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var33 = 0; var33 < var32.length; var33++) {
                                                        var25++;
                                                        var24.method2038(var32[var33] & 0xFFFF);
                                                    }
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            var24.method2034();
                            if (var22.method1284(-28439) && var25 > 0) {
                                class14 var29 = this.field8857.method2946((byte) -124);
                                var29.method190(arg1 - 167, 1.0F, var7, var7);
                                var29.method158(-var20, -var17, 0);
                                this.field8857.method2949(class303.field4244, (byte) -128);
                                var21.method1680(var25 / 3, -114, var22);
                            }
                        }
                    }
                }
            }
        }
        this.field8857.method2954((byte) 127);
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lnh;Lsq;)V", line = 462)
    public class622(class495 arg0, class194 arg1) {
        this.field8864 = arg1;
        this.field8857 = arg0;
        this.field8848 = (this.field8864.field9709 * this.field8864.field9706 >> this.field8857.field7335) + 2;
        this.field8854 = (this.field8864.field9709 * this.field8864.field9703 >> this.field8857.field7335) + 2;
        this.field8858 = new byte[this.field8854 * this.field8848];
        this.field8856 = this.field8857.field7335 + 7 - this.field8864.field9707;
        this.field8853 = this.field8864.field9706 >> this.field8856;
        this.field8851 = this.field8864.field9703 >> this.field8856;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILha;Z)V", line = 477)
    public final void method3513(int arg0, int arg1, class427 arg2, boolean arg3) {
        field8860++;
        class45 var5 = (class45) arg2;
        int var6 = var5.field605 + arg1 + 1;
        int var7 = var5.field612 + arg0 + 1;
        int var8 = var6 + (this.field8848 * var7);
        int var9 = 0;
        int var10 = var5.field603;
        int var11 = var5.field615;
        int var12 = this.field8848 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var9 += var11 * var14;
            var10 -= var14;
            var8 += this.field8848 * var14;
            var7 = 1;
        }
        if (this.field8854 <= var7 + var10) {
            int var15 = var10 + var7 + 1 - this.field8854;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var12 += var16;
            var6 = 1;
            var13 += var16;
            var11 -= var16;
            var8 += var16;
        }
        if (this.field8848 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field8848;
            var12 += var17;
            var11 -= var17;
            var13 += var17;
        }
        if (arg3) {
            method3506(-70);
        }
        if (var11 > 0 && var10 > 0) {
            class530.method3120(var5.field614, var8, this.field8858, var10, var11, (byte) -20, var13, var9, var12);
            this.method3510(var6, -93, var11, var7, var10);
        }
    }
}
