import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class110 extends class4 {

    @OriginalMember(owner = "client!vp", name = "K", descriptor = "I")
    private int field1425 = 1;

    @OriginalMember(owner = "client!vp", name = "O", descriptor = "I")
    private int field1429 = 1;

    @OriginalMember(owner = "client!vp", name = "F", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!vp", name = "G", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!vp", name = "H", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!vp", name = "I", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!vp", name = "J", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!vp", name = "L", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!vp", name = "M", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!vp", name = "N", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!vp", name = "E", descriptor = "Ljava/lang/String;")
    public static String field1419;

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V")
    public class110() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "(I)V")
    public static void method594(int arg0) {
        field1419 = null;
        if (arg0 < 59) {
            method595(-107, -111);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IB)[[I")
    public final int[][] method17(int arg0, byte arg1) {
        ++field1424;
        int[][] var3 = super.field38.method3021((byte) 89, arg0);
        if (super.field38.field7618) {
            int var4 = this.field1429 + this.field1429 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field1425 - (-this.field1425 - 1);
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field1429 + arg0; ~(arg0 - -this.field1429) <= ~var9; ++var9) {
                int[][] var19 = this.method22(var9 & class376.field5248, (byte) -85, 0);
                int[][] var20 = new int[3][class132.field1627];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field1425; ~var27 >= ~this.field1425; ++var27) {
                    int var37 = var27 & class150.field1971;
                    var23 += var26[var37];
                    var22 += var25[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class132.field1627) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field1425 + var31 & class150.field1971;
                    int var33 = var23 - var26[var32];
                    ++var31;
                    int var34 = var21 - var24[var32];
                    int var35 = var22 - var25[var32];
                    int var36 = this.field1425 + var31 & class150.field1971;
                    var23 = var26[var36] + var33;
                    var22 = var25[var36] + var35;
                    var21 = var24[var36] + var34;
                }
                var8[this.field1429 + var9 - arg0] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class132.field1627; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var14 += var18[0][var13];
                    var15 += var18[1][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        if (arg1 > -83) {
            field1419 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)V")
    public static final void method595(int arg0, int arg1) {
        class124.field1543 = -1;
        if (arg0 == 12353) {
            ++field1428;
            if (arg1 != 37) {
                if (arg1 == 50) {
                    class614.field8837 = 4.0F;
                } else if (~arg1 != -76) {
                    if (~arg1 == -101) {
                        class614.field8837 = 8.0F;
                    } else if (arg1 == 200) {
                        class614.field8837 = 16.0F;
                    }
                } else {
                    class614.field8837 = 6.0F;
                }
            } else {
                class614.field8837 = 3.0F;
            }
            class124.field1543 = -1;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field1422;
        if (arg0 != 10) {
            method594(7);
        }
        int[] var3 = super.field31.method2252(arg1, 11);
        if (super.field31.field5127) {
            int var4 = this.field1429 + this.field1429 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field1425 - -this.field1425 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field1429 + arg1; ~var9 >= ~(arg1 - -this.field1429); ++var9) {
                int[] var13 = this.method20(0, -21986, class376.field5248 & var9);
                int[] var14 = new int[class132.field1627];
                int var15 = 0;
                for (int var16 = -this.field1425; ~var16 >= ~this.field1425; ++var16) {
                    var15 += var13[class150.field1971 & var16];
                }
                int var17 = 0;
                while (~var17 > ~class132.field1627) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field1425 + var17 & class150.field1971];
                    ++var17;
                    var15 = var13[var17 - -this.field1425 & class150.field1971] + var18;
                }
                var8[this.field1429 + var9 + -arg1] = var14;
            }
            for (int var10 = 0; class132.field1627 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILkr;)I")
    public static final int method596(int arg0, class329 arg1) {
        if (arg0 != 1) {
            field1420 = 18;
        }
        ++field1426;
        int var2 = 0;
        if (arg1.method2042((byte) -80, class49.field669)) {
            ++var2;
        }
        if (arg1.method2042((byte) -80, class208.field2707)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field44 = ~arg1.method3045(-126) == -2;
                }
            } else {
                this.field1429 = arg1.method3045(-127);
            }
        } else {
            this.field1425 = arg1.method3045(-127);
        }
        ++field1421;
        if (arg0 > -89) {
            this.field1425 = -102;
        }
    }
}
