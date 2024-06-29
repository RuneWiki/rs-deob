import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class183 extends class189 {

    @OriginalMember(owner = "client!uc", name = "hb", descriptor = "I")
    private int field3703 = 1;

    @OriginalMember(owner = "client!uc", name = "nb", descriptor = "I")
    private int field3709 = 1;

    @OriginalMember(owner = "client!uc", name = "ib", descriptor = "Lgg;")
    public static class63 field3704 = class116.method911(43, "Startseite auf (WSpielkonto wiederherstellen(W)3");

    @OriginalMember(owner = "client!uc", name = "kb", descriptor = "Lgg;")
    public static class63 field3706 = class116.method911(43, "<)4col>");

    @OriginalMember(owner = "client!uc", name = "ob", descriptor = "Ljava/lang/Object;")
    public static Object field3710 = new Object();

    @OriginalMember(owner = "client!uc", name = "vb", descriptor = "Lgg;")
    public static class63 field3717 = class116.method911(43, "<col=00ff80>");

    @OriginalMember(owner = "client!uc", name = "gb", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!uc", name = "jb", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!uc", name = "lb", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!uc", name = "mb", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!uc", name = "rb", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!uc", name = "sb", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!uc", name = "tb", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!uc", name = "qb", descriptor = "Lth;")
    public static class179 field3712;

    @OriginalMember(owner = "client!uc", name = "pb", descriptor = "Lfc;")
    public static class51 field3711;

    @OriginalMember(owner = "client!uc", name = "ub", descriptor = "[I")
    public static int[] field3716;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public static void method1207(int arg0) {
        field3712 = null;
        int var1 = 97 % ((-45 - arg0) / 42);
        field3706 = null;
        field3711 = null;
        field3704 = null;
        field3716 = null;
        field3710 = null;
        field3717 = null;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class183() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (arg1 <= 32) {
            this.method90(-71, 119);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field3811 = arg2.method64(31790) == 1;
                }
            } else {
                this.field3703 = arg2.method64(31790);
            }
        } else {
            this.field3709 = arg2.method64(31790);
        }
        ++field3705;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLff;)Z")
    public static final boolean method1208(byte arg0, class54 arg1) {
        ++field3702;
        if (class29.field673) {
            if (class10.method136((byte) -110, arg1) != 0) {
                return false;
            }
            if (~arg1.field1432 == -1) {
                return false;
            }
        }
        return arg0 < 85 ? true : arg1.field1433;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)[[I")
    public final int[][] method83(int arg0, int arg1) {
        ++field3707;
        if (arg1 < 34) {
            method1207(12);
        }
        int[][] var3 = super.field3808.method237(-1, arg0);
        if (super.field3808.field561) {
            int var4 = this.field3709 + 1 + this.field3709;
            int var5 = this.field3703 + this.field3703 - -1;
            int[][][] var6 = new int[var5][][];
            for (int var7 = -this.field3703 + arg0; this.field3703 + arg0 >= var7; ++var7) {
                int[][] var17 = this.method1244((byte) 20, class1.field4 & var7, 0);
                int[][] var18 = new int[3][class54.field1430];
                int var19 = 0;
                int var20 = 0;
                int var21 = 0;
                int[] var22 = var17[0];
                int[] var23 = var17[1];
                int[] var24 = var17[2];
                for (int var25 = -this.field3709; var25 <= this.field3709; ++var25) {
                    int var35 = class75.field1867 & var25;
                    var21 += var24[var35];
                    var19 += var22[var35];
                    var20 += var23[var35];
                }
                int[] var26 = var18[0];
                int[] var27 = var18[2];
                int[] var28 = var18[1];
                int var29 = 0;
                while (~class54.field1430 < ~var29) {
                    var26[var29] = var19 / var4;
                    var28[var29] = var20 / var4;
                    var27[var29] = var21 / var4;
                    int var30 = -this.field3709 + var29 & class75.field1867;
                    ++var29;
                    int var31 = var21 - var24[var30];
                    int var32 = var19 - var22[var30];
                    int var33 = var20 - var23[var30];
                    int var34 = var29 - -this.field3709 & class75.field1867;
                    var20 = var23[var34] + var33;
                    var19 = var22[var34] + var32;
                    var21 = var24[var34] + var31;
                }
                var6[-arg0 + var7 + this.field3703] = var18;
            }
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; class54.field1430 > var11; ++var11) {
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                for (int var15 = 0; var15 < var5; ++var15) {
                    int[][] var16 = var6[var15];
                    var13 += var16[2][var11];
                    var14 += var16[1][var11];
                    var12 += var16[0][var11];
                }
                var8[var11] = var12 / var5;
                var10[var11] = var14 / var5;
                var9[var11] = var13 / var5;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(JI)V")
    public static final void method1209(long arg0, int arg1) {
        int var3 = -19 / ((arg1 - 70) / 38);
        ++field3713;
        if (arg0 != 0L) {
            class141.field3031.method854(230, true);
            ++class177.field3631;
            class141.field3031.method32((byte) 72, arg0);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field3715;
        int[] var3 = super.field3825.method681(arg1, (byte) -68);
        if (super.field3825.field1840) {
            int var4 = this.field3703 + 1 + this.field3703;
            int var5 = this.field3709 + 1 - -this.field3709;
            int[][] var6 = new int[var4][];
            for (int var7 = arg1 - this.field3703; var7 <= arg1 - -this.field3703; ++var7) {
                int[] var11 = this.method1245(0, class1.field4 & var7, 11433);
                int[] var12 = new int[class54.field1430];
                int var13 = 0;
                for (int var14 = -this.field3709; var14 <= this.field3709; ++var14) {
                    var13 += var11[class75.field1867 & var14];
                }
                int var15 = 0;
                while (~var15 > ~class54.field1430) {
                    var12[var15] = var13 / var5;
                    int var16 = var13 - var11[var15 - this.field3709 & class75.field1867];
                    ++var15;
                    var13 = var11[class75.field1867 & this.field3709 + var15] + var16;
                }
                var6[this.field3703 + var7 + -arg1] = var12;
            }
            for (int var8 = 0; ~var8 > ~class54.field1430; ++var8) {
                int var9 = 0;
                for (int var10 = 0; var10 < var4; ++var10) {
                    var9 += var6[var10][var8];
                }
                var3[var8] = var9 / var4;
            }
        }
        if (arg0 != 0) {
            method1207(52);
        }
        return var3;
    }
}
