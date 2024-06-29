import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class678 extends class440 {

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "I")
    private int field9582 = 1;

    @OriginalMember(owner = "client!cm", name = "G", descriptor = "I")
    private int field9585 = 1;

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "Lvg;")
    public static class49 field9586 = null;

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "I")
    public static int field9583;

    @OriginalMember(owner = "client!cm", name = "F", descriptor = "I")
    public static int field9584;

    @OriginalMember(owner = "client!cm", name = "J", descriptor = "I")
    public static int field9588;

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "I")
    public static int field9589;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
    public static int field9590;

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "[[I")
    public static int[][] field9587;

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V", line = 299)
    public class678() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(III)Z", line = 8)
    public static final boolean method3762(int arg0, int arg1, int arg2) {
        if (arg1 < 82) {
            method3763(62, -11);
        }
        ++field9588;
        return ~(65536 & arg2) != -1;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(II)I", line = 19)
    public static final int method3763(int arg0, int arg1) {
        ++field9589;
        int var2 = -91 / ((arg1 - -82) / 38);
        return (arg0 & 260656) >> 11;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)[[I", line = 29)
    public final int[][] method763(int arg0, int arg1) {
        ++field9583;
        if (arg0 != -5766) {
            field9586 = null;
        }
        int[][] var3 = super.field6417.method3769(arg1, -26435);
        if (super.field6417.field9606) {
            int var4 = this.field9585 + 1 + this.field9585;
            int var5 = 65536 / var4;
            int var6 = this.field9582 + 1 + this.field9582;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field9585 + arg1; arg1 - -this.field9585 >= var9; ++var9) {
                int[][] var19 = this.method2606(class651.field9116 & var9, 0, -1);
                int[][] var20 = new int[3][class549.field7715];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field9582; ~var27 >= ~this.field9582; ++var27) {
                    int var37 = class420.field6112 & var27;
                    var22 += var25[var37];
                    var21 += var24[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class549.field7715 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field9582 + var31 & class420.field6112;
                    int var33 = var23 - var26[var32];
                    int var34 = var21 - var24[var32];
                    ++var31;
                    int var35 = var22 - var25[var32];
                    int var36 = class420.field6112 & this.field9582 + var31;
                    var21 = var24[var36] + var34;
                    var22 = var25[var36] + var35;
                    var23 = var26[var36] + var33;
                }
                var8[-arg1 + this.field9585 + var9] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class549.field7715 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var14 += var18[0][var13];
                    var15 += var18[1][var13];
                    var16 += var18[2][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BI)[I", line = 163)
    public final int[] method229(byte arg0, int arg1) {
        ++field9584;
        int[] var3 = super.field6412.method3250((byte) 5, arg1);
        int var4 = 39 / ((-56 - arg0) / 41);
        if (super.field6412.field8047) {
            int var5 = this.field9585 + this.field9585 + 1;
            int var6 = 65536 / var5;
            int var7 = this.field9582 - (-this.field9582 - 1);
            int var8 = 65536 / var7;
            int[][] var9 = new int[var5][];
            for (int var10 = -this.field9585 + arg1; ~(arg1 - -this.field9585) <= ~var10; ++var10) {
                int[] var14 = this.method2611(107, class651.field9116 & var10, 0);
                int[] var15 = new int[class549.field7715];
                int var16 = 0;
                for (int var17 = -this.field9582; this.field9582 >= var17; ++var17) {
                    var16 += var14[var17 & class420.field6112];
                }
                int var18 = 0;
                while (var18 < class549.field7715) {
                    var15[var18] = var8 * var16 >> 16;
                    int var19 = var16 - var14[-this.field9582 + var18 & class420.field6112];
                    ++var18;
                    var16 = var14[class420.field6112 & this.field9582 + var18] + var19;
                }
                var9[this.field9585 + var10 + -arg1] = var15;
            }
            for (int var11 = 0; ~class549.field7715 < ~var11; ++var11) {
                int var12 = 0;
                for (int var13 = 0; ~var5 < ~var13; ++var13) {
                    var12 += var9[var13][var11];
                }
                var3[var11] = var6 * var12 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILmo;I)V", line = 252)
    public final void method234(int arg0, class695 arg1, int arg2) {
        if (arg0 != 5) {
            field9587 = null;
        }
        ++field9590;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field6424 = arg1.method3826(false) == 1;
                }
            } else {
                this.field9585 = arg1.method3826(false);
            }
        } else {
            this.field9582 = arg1.method3826(false);
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)V", line = 303)
    public static void method3764(byte arg0) {
        if (arg0 != 125) {
            field9587 = null;
        }
        field9586 = null;
        field9587 = null;
    }
}
