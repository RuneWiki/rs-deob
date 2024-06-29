import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class252 extends class328 {

    @OriginalMember(owner = "client!lt", name = "E", descriptor = "I")
    private int field3686 = 1;

    @OriginalMember(owner = "client!lt", name = "K", descriptor = "I")
    private int field3691 = 1;

    @OriginalMember(owner = "client!lt", name = "F", descriptor = "[Lbj;")
    public static class439[] field3687 = new class439[14];

    @OriginalMember(owner = "client!lt", name = "B", descriptor = "Liu;")
    public static class517 field3683 = new class517(91, 0);

    @OriginalMember(owner = "client!lt", name = "C", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!lt", name = "D", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!lt", name = "G", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!lt", name = "I", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!lt", name = "L", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!lt", name = "M", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!lt", name = "J", descriptor = "Z")
    public static boolean field3690;

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "()V", line = 4)
    public class252() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "(III)Z", line = 8)
    public static final boolean method1592(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field3685;
            return class301.method1879(arg2, arg1, -7643) & (class471.method2740(arg2, (byte) -122, arg1) | (8192 & arg2) != 0 | class619.method3499(arg2, arg1, 30191));
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BII)Z", line = 24)
    public static final boolean method1593(byte arg0, int arg1, int arg2) {
        ++field3689;
        if (arg0 <= 116) {
            field3690 = false;
        }
        return (arg2 & 52) != 0;
    }

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "(I)Lpba;", line = 35)
    public static final class144 method1594(int arg0) {
        if (arg0 != -30998) {
            return null;
        } else {
            ++field3692;
            try {
                return (class144) Class.forName("gba").newInstance();
            } catch (Throwable var1) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BILco;)V", line = 61)
    public final void method1(byte arg0, int arg1, class268 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field4728 = ~arg2.method1738(255) == -2;
                }
            } else {
                this.field3686 = arg2.method1738(255);
            }
        } else {
            this.field3691 = arg2.method1738(255);
        }
        ++field3688;
        if (arg0 < 75) {
            this.method7(70, 3);
        }
    }

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "(B)V", line = 108)
    public static void method1595(byte arg0) {
        field3683 = null;
        if (arg0 >= 89) {
            field3687 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(II)[[I", line = 127)
    public final int[][] method7(int arg0, int arg1) {
        ++field3684;
        int[][] var3 = super.field4725.method1886((byte) 100, arg0);
        if (super.field4725.field4371) {
            int var4 = this.field3686 + this.field3686 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field3691 + 1 + this.field3691;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field3686 + arg0; var9 <= arg0 - -this.field3686; ++var9) {
                int[][] var19 = this.method2040(0, var9 & class589.field8379, 0);
                int[][] var20 = new int[3][class449.field6539];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field3691; ~var27 >= ~this.field3691; ++var27) {
                    int var37 = var27 & class108.field1799;
                    var23 += var26[var37];
                    var22 += var25[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class449.field6539) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field3691 + var31 & class108.field1799;
                    int var33 = var22 - var25[var32];
                    int var34 = var23 - var26[var32];
                    ++var31;
                    int var35 = var21 - var24[var32];
                    int var36 = this.field3691 + var31 & class108.field1799;
                    var22 = var25[var36] + var33;
                    var23 = var26[var36] + var34;
                    var21 = var24[var36] + var35;
                }
                var8[this.field3686 + var9 + -arg0] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class449.field6539 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        int var38 = 79 / ((46 - arg1) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)[I", line = 259)
    public final int[] method4(int arg0, int arg1) {
        ++field3693;
        int[] var3 = super.field4720.method2872(1, arg0);
        if (super.field4720.field7109) {
            int var4 = this.field3686 + 1 - -this.field3686;
            int var5 = 65536 / var4;
            int var6 = this.field3691 + this.field3691 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg0 - this.field3686; ~var9 >= ~(this.field3686 + arg0); ++var9) {
                int[] var13 = this.method2042(0, var9 & class589.field8379, (byte) 119);
                int[] var14 = new int[class449.field6539];
                int var15 = 0;
                for (int var16 = -this.field3691; ~this.field3691 <= ~var16; ++var16) {
                    var15 += var13[class108.field1799 & var16];
                }
                int var17 = 0;
                while (var17 < class449.field6539) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field3691 + var17 & class108.field1799];
                    ++var17;
                    var15 = var13[this.field3691 + var17 & class108.field1799] + var18;
                }
                var8[-arg0 + var9 + this.field3686] = var14;
            }
            for (int var10 = 0; ~class449.field6539 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        int var19 = 107 % ((48 - arg1) / 56);
        return var3;
    }
}
