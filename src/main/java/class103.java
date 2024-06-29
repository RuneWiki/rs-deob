import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class103 extends class1 {

    @OriginalMember(owner = "client!jf", name = "jb", descriptor = "I")
    private int field1852 = 1;

    @OriginalMember(owner = "client!jf", name = "mb", descriptor = "I")
    private int field1855 = 1;

    @OriginalMember(owner = "client!jf", name = "rb", descriptor = "I")
    public static int field1860 = 0;

    @OriginalMember(owner = "client!jf", name = "tb", descriptor = "Loc;")
    public static class151 field1862 = class137.method873(2, "Ausw-=hlen");

    @OriginalMember(owner = "client!jf", name = "gb", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!jf", name = "ib", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!jf", name = "kb", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!jf", name = "lb", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!jf", name = "nb", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!jf", name = "ob", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!jf", name = "pb", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!jf", name = "qb", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!jf", name = "sb", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!jf", name = "ub", descriptor = "Lfb;")
    public static class58 field1863;

    @OriginalMember(owner = "client!jf", name = "hb", descriptor = "[I")
    public static int[] field1850;

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class103() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)V")
    public static void method627(int arg0) {
        field1850 = null;
        field1863 = null;
        if (arg0 != 28440) {
            field1862 = null;
        }
        field1862 = null;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        int[][] var3 = super.field13.method578(arg0, -1);
        ++field1858;
        if (arg1 != -81) {
            field1860 = -63;
        }
        if (super.field13.field1658) {
            int var4 = this.field1852 - -this.field1852 + 1;
            int var5 = 65536 / var4;
            int[][][] var6 = new int[var4][][];
            int var7 = this.field1855 + this.field1855 + 1;
            int var8 = 65536 / var7;
            for (int var9 = -this.field1852 + arg0; ~var9 >= ~(this.field1852 + arg0); ++var9) {
                int[][] var19 = this.method8(0, (byte) -107, var9 & class155.field2804);
                int var20 = 0;
                int[][] var21 = new int[3][class202.field3603];
                int[] var22 = var19[0];
                int var23 = 0;
                int var24 = 0;
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field1855; ~this.field1855 <= ~var27; ++var27) {
                    int var37 = class78.field1510 & var27;
                    var23 += var25[var37];
                    var24 += var26[var37];
                    var20 += var22[var37];
                }
                int[] var28 = var21[0];
                int[] var29 = var21[1];
                int[] var30 = var21[2];
                int var31 = 0;
                while (~class202.field3603 < ~var31) {
                    var28[var31] = var8 * var20 >> 16;
                    var29[var31] = var8 * var23 >> 16;
                    var30[var31] = var8 * var24 >> 16;
                    int var32 = -this.field1855 + var31 & class78.field1510;
                    int var33 = var24 - var26[var32];
                    ++var31;
                    int var34 = var20 - var22[var32];
                    int var35 = var23 - var25[var32];
                    int var36 = class78.field1510 & this.field1855 + var31;
                    var23 = var25[var36] + var35;
                    var24 = var26[var36] + var33;
                    var20 = var22[var36] + var34;
                }
                var6[var9 - -this.field1852 + -arg0] = var21;
            }
            int[] var10 = var3[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            for (int var13 = 0; var13 < class202.field3603; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
                    int[][] var18 = var6[var17];
                    var16 += var18[0][var13];
                    var14 += var18[1][var13];
                    var15 += var18[2][var13];
                }
                var11[var13] = var5 * var16 >> 16;
                var12[var13] = var5 * var14 >> 16;
                var10[var13] = var5 * var15 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        ++field1861;
        int[] var3 = super.field21.method1182(arg1, arg0 ^ -31672);
        if (super.field21.field3388) {
            int var4 = this.field1852 + 1 + this.field1852;
            int var5 = 65536 / var4;
            int var6 = this.field1855 + this.field1855 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field1852 + arg1; this.field1852 + arg1 >= var9; ++var9) {
                int[] var13 = this.method4(class155.field2804 & var9, -127, 0);
                int[] var14 = new int[class202.field3603];
                int var15 = 0;
                for (int var16 = -this.field1855; ~var16 >= ~this.field1855; ++var16) {
                    var15 += var13[var16 & class78.field1510];
                }
                int var17 = 0;
                while (var17 < class202.field3603) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[var17 - this.field1855 & class78.field1510];
                    ++var17;
                    var15 = var13[class78.field1510 & this.field1855 + var17] + var18;
                }
                var8[-arg1 + var9 - -this.field1852] = var14;
            }
            for (int var10 = 0; class202.field3603 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var4 < ~var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return arg0 != 107 ? null : var3;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field27 = ~arg2.method1475(255) == -2;
                }
            } else {
                this.field1852 = arg2.method1475(255);
            }
        } else {
            this.field1855 = arg2.method1475(255);
        }
        if (arg0 != 0) {
            field1862 = null;
        }
        ++field1856;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method628(Component arg0, byte arg1) {
        ++field1859;
        arg0.removeKeyListener(class139.field2545);
        if (arg1 <= 15) {
            method631(27, (byte) 84, -109);
        }
        arg0.removeFocusListener(class139.field2545);
        class206.field3651 = -1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIII)V")
    public static final void method629(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1851;
        if (arg0 != -3912) {
            field1860 = -29;
        }
        if (arg4 == arg5) {
            class233.method1526((byte) 114, arg2, arg3, arg4, arg1);
        } else if (-arg4 + arg3 >= class79.field1526 && arg3 + arg4 <= class25.field524 && arg1 - arg5 >= class233.field4281 && class154.field2793 >= arg1 - -arg5) {
            class175.method1113(28711, arg1, arg4, arg5, arg3, arg2);
        } else {
            class131.method813(arg3, arg2, arg1, arg4, arg0 ^ -3895, arg5);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILsd;Z)[Lcg;")
    public static final class30[] method630(int arg0, class192 arg1, boolean arg2) {
        ++field1857;
        if (!arg2) {
            return null;
        } else {
            return !class75.method489(arg0, arg1, 93) ? null : class71.method474((byte) 126);
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(IBI)Z")
    public static final boolean method631(int arg0, byte arg1, int arg2) {
        class93 var3 = class5.method32((byte) 42, arg0);
        if (~arg2 == -12) {
            arg2 = 10;
        }
        ++field1854;
        if (~arg2 <= -6 && ~arg2 >= -9) {
            arg2 = 4;
        }
        if (arg1 > -8) {
            field1863 = null;
        }
        return var3.method592(0, arg2);
    }
}
