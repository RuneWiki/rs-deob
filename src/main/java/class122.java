import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class122 extends class51 {

    @OriginalMember(owner = "client!nf", name = "Z", descriptor = "I")
    private int field2605 = 1;

    @OriginalMember(owner = "client!nf", name = "pb", descriptor = "I")
    private int field2621 = 1;

    @OriginalMember(owner = "client!nf", name = "ib", descriptor = "Lea;")
    private static class38 field2614 = class9.method46((byte) 111, "purple:");

    @OriginalMember(owner = "client!nf", name = "jb", descriptor = "[[[Lpg;")
    public static class141[][][] field2615 = new class141[4][104][104];

    @OriginalMember(owner = "client!nf", name = "eb", descriptor = "[I")
    public static int[] field2610 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!nf", name = "fb", descriptor = "Lea;")
    public static class38 field2611 = field2614;

    @OriginalMember(owner = "client!nf", name = "ob", descriptor = "Lea;")
    public static class38 field2620 = field2614;

    @OriginalMember(owner = "client!nf", name = "kb", descriptor = "Lea;")
    private static class38 field2616 = class9.method46((byte) 124, "Your account is already logged in)3");

    @OriginalMember(owner = "client!nf", name = "hb", descriptor = "Lea;")
    public static class38 field2613 = class9.method46((byte) 107, "welle:");

    @OriginalMember(owner = "client!nf", name = "qb", descriptor = "Lea;")
    private static class38 field2622 = class9.method46((byte) 113, "green:");

    @OriginalMember(owner = "client!nf", name = "gb", descriptor = "Lea;")
    public static class38 field2612 = field2622;

    @OriginalMember(owner = "client!nf", name = "lb", descriptor = "Lea;")
    public static class38 field2617 = field2616;

    @OriginalMember(owner = "client!nf", name = "bb", descriptor = "Lea;")
    public static class38 field2607 = field2622;

    @OriginalMember(owner = "client!nf", name = "ab", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!nf", name = "cb", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!nf", name = "db", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!nf", name = "mb", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!nf", name = "nb", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!nf", name = "rb", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
    public static void method919(byte arg0) {
        field2611 = null;
        field2617 = null;
        field2613 = null;
        field2620 = null;
        field2612 = null;
        field2615 = null;
        if (arg0 == -107) {
            field2616 = null;
            field2622 = null;
            field2610 = null;
            field2607 = null;
            field2614 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
    public class122() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        int[] var3 = super.field1312.method827(arg1, true);
        if (super.field1312.field2271) {
            int var4 = this.field2605 + this.field2605 - -1;
            int var5 = this.field2621 + this.field2621 + 1;
            int[][] var6 = new int[var4][];
            for (int var7 = -this.field2605 + arg1; ~(this.field2605 + arg1) <= ~var7; ++var7) {
                int[] var11 = this.method376(class144.field3018 & var7, 0, -90);
                int[] var12 = new int[class86.field2008];
                int var13 = 0;
                for (int var14 = -this.field2621; ~var14 >= ~this.field2621; ++var14) {
                    var13 += var11[class39.field850 & var14];
                }
                int var15 = 0;
                while (~class86.field2008 < ~var15) {
                    var12[var15] = var13 / var5;
                    int var16 = var13 - var11[-this.field2621 + var15 & class39.field850];
                    ++var15;
                    var13 = var11[this.field2621 + var15 & class39.field850] + var16;
                }
                var6[var7 - -this.field2605 + -arg1] = var12;
            }
            for (int var8 = 0; class86.field2008 > var8; ++var8) {
                int var9 = 0;
                for (int var10 = 0; ~var10 > ~var4; ++var10) {
                    var9 += var6[var10][var8];
                }
                var3[var8] = var9 / var4;
            }
        }
        if (arg0 >= -125) {
            return null;
        } else {
            ++field2623;
            return var3;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZIIB)V")
    public static final void method920(boolean arg0, int arg1, int arg2, byte arg3) {
        ++field2618;
        if (arg3 < 27) {
            field2610 = null;
        }
        if (arg2 >= 8000 && arg2 <= 48000) {
            class83.field1974 = arg0;
            class87.field2030 = arg2;
            class31.field619 = arg1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lhc;ILea;)I")
    public static final int method921(class66 arg0, int arg1, class38 arg2) {
        ++field2609;
        if (arg1 != 1) {
            return -41;
        } else {
            int var3 = arg0.field1620;
            arg0.method482((byte) 37, arg2.field802);
            arg0.field1620 += class127.field2720.method188(32, arg0.field1627, 0, arg0.field1620, arg2.field802, arg2.field821);
            return -var3 + arg0.field1620;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method55(35, -6);
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field1289 = arg0.method509(119) == 1;
                }
            } else {
                this.field2605 = arg0.method509(127);
            }
        } else {
            this.field2621 = arg0.method509(116);
        }
        ++field2606;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field2608;
        if (arg0 < 111) {
            field2612 = null;
        }
        int[][] var3 = super.field1292.method720(false, arg1);
        if (super.field1292.field2032) {
            int var4 = this.field2605 + 1 + this.field2605;
            int var5 = this.field2621 + this.field2621 - -1;
            int[][][] var6 = new int[var4][][];
            for (int var7 = -this.field2605 + arg1; this.field2605 + arg1 >= var7; ++var7) {
                int[][] var17 = this.method377(0, var7 & class144.field3018, (byte) -116);
                int[][] var18 = new int[3][class86.field2008];
                int var19 = 0;
                int var20 = 0;
                int var21 = 0;
                int[] var22 = var17[1];
                int[] var23 = var17[0];
                int[] var24 = var17[2];
                for (int var25 = -this.field2621; var25 <= this.field2621; ++var25) {
                    int var35 = class39.field850 & var25;
                    var20 += var24[var35];
                    var21 += var22[var35];
                    var19 += var23[var35];
                }
                int[] var26 = var18[0];
                int[] var27 = var18[1];
                int[] var28 = var18[2];
                int var29 = 0;
                while (class86.field2008 > var29) {
                    var26[var29] = var19 / var5;
                    var27[var29] = var21 / var5;
                    var28[var29] = var20 / var5;
                    int var30 = class39.field850 & var29 - this.field2621;
                    int var31 = var19 - var23[var30];
                    ++var29;
                    int var32 = var21 - var22[var30];
                    int var33 = var20 - var24[var30];
                    int var34 = class39.field850 & this.field2621 + var29;
                    var21 = var22[var34] + var32;
                    var19 = var23[var34] + var31;
                    var20 = var24[var34] + var33;
                }
                var6[-arg1 + this.field2605 + var7] = var18;
            }
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class86.field2008; ++var11) {
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                for (int var15 = 0; ~var4 < ~var15; ++var15) {
                    int[][] var16 = var6[var15];
                    var12 += var16[0][var11];
                    var13 += var16[2][var11];
                    var14 += var16[1][var11];
                }
                var8[var11] = var12 / var4;
                var9[var11] = var14 / var4;
                var10[var11] = var13 / var4;
            }
        }
        return var3;
    }
}
