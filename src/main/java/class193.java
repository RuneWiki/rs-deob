import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class193 extends class305 {

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    private int field2969 = 1;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "I")
    private int field2960 = 1;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "[I")
    public static int[] field2958 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!je", name = "M", descriptor = "I")
    public static int field2966 = 0;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public static int field2968 = -1;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field2962 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!je", name = "N", descriptor = "[I")
    public static int[] field2967 = new int[5];

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIBIIIII)V")
    public static final void method1331(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2959;
        if (arg9 >= 128 && arg7 >= 128 && (class338.field5076 + -2) * 128 >= arg9 && ~arg7 >= ~((class250.field4077 + -2) * 128)) {
            int var10 = -arg2 + class416.method2605(arg7, arg9, (byte) 127, arg3);
            class517.field7515.method957(arg8, 0, 0);
            int var11 = -95 % ((35 - arg4) / 34);
            class376.field5542.method582(class517.field7515);
            class376.field5542.method592(arg9, var10, arg7, class370.field5458);
            class517.field7515.method957(-arg8, 0, 0);
            class376.field5542.method582(class517.field7515);
        } else {
            class370.field5458[0] = class370.field5458[1] = -1;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)[[I")
    public final int[][] method72(int arg0, byte arg1) {
        ++field2963;
        if (arg1 >= -59) {
            return null;
        } else {
            int[][] var3 = super.field4674.method2206(-111, arg0);
            if (super.field4674.field5110) {
                int var4 = this.field2960 + this.field2960 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field2969 + 1 + this.field2969;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = arg0 - this.field2960; ~(this.field2960 + arg0) <= ~var9; ++var9) {
                    int[][] var19 = this.method2015(true, 0, var9 & class236.field3551);
                    int[][] var20 = new int[3][class91.field1471];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field2969; ~this.field2969 <= ~var27; ++var27) {
                        int var37 = class228.field3447 & var27;
                        var23 += var26[var37];
                        var21 += var24[var37];
                        var22 += var25[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (class91.field1471 > var31) {
                        var28[var31] = var7 * var21 >> 16;
                        var29[var31] = var7 * var22 >> 16;
                        var30[var31] = var7 * var23 >> 16;
                        int var32 = class228.field3447 & -this.field2969 + var31;
                        int var33 = var23 - var26[var32];
                        int var34 = var22 - var25[var32];
                        ++var31;
                        int var35 = var21 - var24[var32];
                        int var36 = class228.field3447 & this.field2969 + var31;
                        var23 = var26[var36] + var33;
                        var22 = var25[var36] + var34;
                        var21 = var24[var36] + var35;
                    }
                    var8[-arg0 + this.field2960 + var9] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; ~class91.field1471 < ~var13; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; ~var17 > ~var4; ++var17) {
                        int[][] var18 = var8[var17];
                        var16 += var18[2][var13];
                        var15 += var18[1][var13];
                        var14 += var18[0][var13];
                    }
                    var10[var13] = var5 * var14 >> 16;
                    var11[var13] = var5 * var15 >> 16;
                    var12[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILya;)V")
    public static final void method1332(int arg0, class11 arg1) {
        class407.field6024[arg0] = arg1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field2964;
        if (arg1 != 4688) {
            this.method15(-16, 101);
        }
        int[] var3 = super.field4677.method2174(arg0, arg1 ^ 4610);
        if (super.field4677.field5040) {
            int var4 = this.field2960 - -1 + this.field2960;
            int var5 = 65536 / var4;
            int var6 = this.field2969 - -1 + this.field2969;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field2960 + arg0; ~(this.field2960 + arg0) <= ~var9; ++var9) {
                int[] var13 = this.method2021(0, var9 & class236.field3551, 0);
                int[] var14 = new int[class91.field1471];
                int var15 = 0;
                for (int var16 = -this.field2969; var16 <= this.field2969; ++var16) {
                    var15 += var13[var16 & class228.field3447];
                }
                int var17 = 0;
                while (var17 < class91.field1471) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class228.field3447 & var17 - this.field2969];
                    ++var17;
                    var15 = var13[var17 - -this.field2969 & class228.field3447] + var18;
                }
                var8[var9 - (-this.field2960 - -arg0)] = var14;
            }
            for (int var10 = 0; ~class91.field1471 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
    public class193() {
        super(1, false);
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(B)V")
    public static void method1333(byte arg0) {
        if (arg0 >= -109) {
            field2958 = null;
        }
        field2967 = null;
        field2958 = null;
        field2962 = null;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)I")
    public static final int method1334(int arg0, int arg1) {
        return class295.field4548 != null ? class295.field4548[arg0][arg1] & 16777215 : 0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILfh;B)V")
    public final void method14(int arg0, class194 arg1, byte arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field4675 = ~arg1.method1337((byte) -112) == -2;
                }
            } else {
                this.field2960 = arg1.method1337((byte) -123);
            }
        } else {
            this.field2969 = arg1.method1337((byte) -116);
        }
        if (arg2 <= 76) {
            field2958 = null;
        }
        ++field2965;
    }
}
