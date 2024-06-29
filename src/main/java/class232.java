import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class232 extends class107 {

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    private int field3623 = 1;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    private int field3636 = 1;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "Ljava/lang/String;")
    public static String field3626 = "Loaded wordpack";

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field3627 = new String[100];

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "[I")
    public static int[] field3633 = new int[100];

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "Lgi;")
    public static class164 field3624;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "[Z")
    public static boolean[] field3630;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "[[B")
    public static byte[][] field3635;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "[[I")
    public static int[][] field3629;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)V")
    public static final void method1603(int arg0, int arg1) {
        ++field3634;
        if (arg0 != 1) {
            method1604((byte) -25, -40, (class241) null, -43, false, (class241) null, false);
        }
        class103.field1626.method1880(-106, arg1);
        class218.field3422.method1880(-110, arg1);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BILog;IZLog;Z)I")
    public static final int method1604(byte arg0, int arg1, class241 arg2, int arg3, boolean arg4, class241 arg5, boolean arg6) {
        ++field3632;
        int var7 = class225.method1560(arg5, arg4, arg2, true, arg1);
        if (var7 != 0) {
            return arg4 ? -var7 : var7;
        } else if (~arg3 == 0) {
            return 0;
        } else {
            int var8 = class225.method1560(arg5, arg6, arg2, true, arg3);
            if (arg0 <= 76) {
                return 117;
            } else {
                return !arg6 ? var8 : -var8;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class232() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        ++field3631;
        if (arg2 != 28) {
            this.field3636 = -35;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field1660 = ~arg1.method1849(255) == -2;
                }
            } else {
                this.field3623 = arg1.method1849(255);
            }
        } else {
            this.field3636 = arg1.method1849(255);
        }
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(B)V")
    public static void method1605(byte arg0) {
        field3627 = null;
        field3626 = null;
        field3635 = null;
        field3630 = null;
        field3633 = null;
        field3629 = null;
        if (arg0 < 61) {
            field3635 = null;
        }
        field3624 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIILie;JZ)V")
    public static final void method1606(int arg0, int arg1, int arg2, int arg3, class34 arg4, long arg5, boolean arg6) {
        if (arg4 != null) {
            class122 var8 = new class122();
            var8.field1930 = arg4;
            var8.field1923 = arg1 * 128 + 64;
            var8.field1935 = arg2 * 128 + 64;
            var8.field1941 = arg3;
            var8.field1933 = arg5;
            if (class307.field4991[arg0][arg1][arg2] == null) {
                class307.field4991[arg0][arg1][arg2] = new class116(arg0, arg1, arg2);
            }
            class307.field4991[arg0][arg1][arg2].field1765 = var8;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        ++field3628;
        int var3 = -69 % ((arg0 - -34) / 49);
        int[] var4 = super.field1661.method894(114, arg1);
        if (super.field1661.field2115) {
            int var5 = this.field3623 + 1 + this.field3623;
            int var6 = 65536 / var5;
            int[][] var7 = new int[var5][];
            int var8 = this.field3636 + 1 - -this.field3636;
            int var9 = 65536 / var8;
            for (int var10 = arg1 - this.field3623; ~var10 >= ~(this.field3623 + arg1); ++var10) {
                int[] var14 = this.method756(0, class107.field1677 & var10, -29053);
                int var15 = 0;
                for (int var16 = -this.field3636; var16 <= this.field3636; ++var16) {
                    var15 += var14[var16 & class128.field2053];
                }
                int[] var17 = new int[class24.field443];
                int var18 = 0;
                while (~var18 > ~class24.field443) {
                    var17[var18] = var9 * var15 >> 16;
                    int var19 = var15 - var14[-this.field3636 + var18 & class128.field2053];
                    ++var18;
                    var15 = var14[class128.field2053 & var18 - -this.field3636] + var19;
                }
                var7[this.field3623 + var10 + -arg1] = var17;
            }
            for (int var11 = 0; class24.field443 > var11; ++var11) {
                int var12 = 0;
                for (int var13 = 0; var13 < var5; ++var13) {
                    var12 += var7[var13][var11];
                }
                var4[var11] = var6 * var12 >> 16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1607(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3625;
        if (arg1 >= class52.field766 && arg1 <= class191.field3112) {
            int var5 = class268.method1789(class148.field2371, -94, arg0, class34.field561);
            int var6 = class268.method1789(class148.field2371, 92, arg2, class34.field561);
            class12.method100(5, arg1, var5, arg3, var6);
        }
        if (arg4) {
            method1605((byte) 11);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)[[I")
    public final int[][] method190(int arg0, byte arg1) {
        ++field3637;
        int[][] var3 = super.field1662.method1302(arg0, (byte) 26);
        if (super.field1662.field3063) {
            int var4 = this.field3623 + this.field3623 + 1;
            int var5 = this.field3636 + 1 + this.field3636;
            int var6 = 65536 / var4;
            int[][][] var7 = new int[var4][][];
            int var8 = 65536 / var5;
            for (int var9 = -this.field3623 + arg0; ~(this.field3623 + arg0) <= ~var9; ++var9) {
                int[][] var19 = this.method759(0, -128, class107.field1677 & var9);
                int[][] var20 = new int[3][class24.field443];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[1];
                int[] var25 = var19[2];
                int[] var26 = var19[0];
                for (int var27 = -this.field3636; var27 <= this.field3636; ++var27) {
                    int var37 = class128.field2053 & var27;
                    var23 += var25[var37];
                    var22 += var24[var37];
                    var21 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class24.field443) {
                    var28[var31] = var8 * var21 >> 16;
                    var29[var31] = var8 * var22 >> 16;
                    var30[var31] = var8 * var23 >> 16;
                    int var32 = class128.field2053 & var31 - this.field3636;
                    ++var31;
                    int var33 = var21 - var26[var32];
                    int var34 = var23 - var25[var32];
                    int var35 = var22 - var24[var32];
                    int var36 = this.field3636 + var31 & class128.field2053;
                    var22 = var24[var36] + var35;
                    var23 = var25[var36] + var34;
                    var21 = var26[var36] + var33;
                }
                var7[-arg0 + var9 - -this.field3623] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class24.field443 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
                    int[][] var18 = var7[var17];
                    var14 += var18[0][var13];
                    var16 += var18[1][var13];
                    var15 += var18[2][var13];
                }
                var10[var13] = var6 * var14 >> 16;
                var11[var13] = var6 * var16 >> 16;
                var12[var13] = var6 * var15 >> 16;
            }
        }
        return arg1 != -117 ? null : var3;
    }
}
