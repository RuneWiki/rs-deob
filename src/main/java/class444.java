import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class444 extends class326 {

    @OriginalMember(owner = "client!ar", name = "Q", descriptor = "I")
    private int field6036 = 1;

    @OriginalMember(owner = "client!ar", name = "S", descriptor = "I")
    private int field6038 = 1;

    @OriginalMember(owner = "client!ar", name = "N", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!ar", name = "O", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!ar", name = "P", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!ar", name = "R", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!ar", name = "T", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!ar", name = "V", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!ar", name = "W", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!ar", name = "X", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!ar", name = "U", descriptor = "[Ljd;")
    public static class139[] field6040;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "(I)V")
    public static void method2604(int arg0) {
        int var1 = 124 % ((41 - arg0) / 38);
        field6040 = null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method2605(int arg0, long arg1) {
        class182.field2496.setTime(new Date(arg1));
        ++field6035;
        int var3 = class182.field2496.get(7);
        if (arg0 != 10) {
            method2605(-95, 85L);
        }
        int var4 = class182.field2496.get(5);
        int var5 = class182.field2496.get(2);
        int var6 = class182.field2496.get(1);
        int var7 = class182.field2496.get(11);
        int var8 = class182.field2496.get(12);
        int var9 = class182.field2496.get(13);
        return class272.field3622[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class437.field5933[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(IIB)V")
    public static final void method2606(int arg0, int arg1, byte arg2) {
        class222.field2959 = -class55.field754 + arg0;
        if (arg2 == 110) {
            class304.field4034 = -class55.field757 + arg1;
            ++field6043;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILct;IILwm;Z)V")
    public static final void method2607(int arg0, class88 arg1, int arg2, int arg3, class364 arg4, boolean arg5) {
        ++field6037;
        class351 var6 = class171.field2351.method2198(34, arg1.field1235);
        if (~var6.field4873 != 0) {
            int var7;
            if (!arg1.field1284) {
                var7 = 0;
            } else {
                int var8 = arg1.field1223 + arg0;
                var7 = var8 & 3;
            }
            class139 var9 = var6.method2175(arg1.field1297, arg5, var7, arg4);
            if (var9 != null) {
                int var10 = arg1.field1305;
                int var11 = arg1.field1249;
                if ((1 & var7) == 1) {
                    var10 = arg1.field1249;
                    var11 = arg1.field1305;
                }
                int var12 = var9.method777();
                int var13 = var9.method774();
                if (var6.field4874) {
                    var13 = var11 * 4;
                    var12 = var10 * 4;
                }
                if (~var6.field4875 == -1) {
                    var9.method838(arg3, -((var11 + -1) * 4) + arg2, var12, var13);
                } else {
                    var9.method773(arg3, -(var11 * 4) + 4 + arg2, var12, var13, 1, -16777216 | var6.field4875, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        ++field6034;
        int[] var3 = super.field4344.method130(arg1, 83);
        if (arg0 > -6) {
            this.method48(-89, (byte) -96);
        }
        if (super.field4344.field286) {
            int var4 = this.field6038 - -1 + this.field6038;
            int var5 = 65536 / var4;
            int var6 = this.field6036 + 1 - -this.field6036;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field6038 + arg1; ~var9 >= ~(arg1 - -this.field6038); ++var9) {
                int[] var13 = this.method1824(0, false, class266.field3509 & var9);
                int[] var14 = new int[class181.field2495];
                int var15 = 0;
                for (int var16 = -this.field6036; this.field6036 >= var16; ++var16) {
                    var15 += var13[class459.field6226 & var16];
                }
                int var17 = 0;
                while (var17 < class181.field2495) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field6036 + var17 & class459.field6226];
                    ++var17;
                    var15 = var13[class459.field6226 & this.field6036 + var17] + var18;
                }
                var8[-arg1 + var9 + this.field6038] = var14;
            }
            for (int var10 = 0; ~class181.field2495 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILbt;I)V")
    public final void method33(int arg0, class32 arg1, int arg2) {
        ++field6041;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field4358 = ~arg1.method201((byte) -111) == -2;
                }
            } else {
                this.field6038 = arg1.method201((byte) -112);
            }
        } else {
            this.field6036 = arg1.method201((byte) -107);
        }
        if (arg2 > -3) {
            field6033 = -85;
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
    public class444() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(IB)[[I")
    public final int[][] method48(int arg0, byte arg1) {
        if (arg1 >= -52) {
            this.method30((byte) -11, 80);
        }
        ++field6042;
        int[][] var3 = super.field4343.method2356(arg0, 83);
        if (super.field4343.field5336) {
            int var4 = this.field6038 + this.field6038 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field6036 + this.field6036 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg0 - this.field6038; this.field6038 + arg0 >= var9; ++var9) {
                int[][] var19 = this.method1828(0, true, var9 & class266.field3509);
                int[][] var20 = new int[3][class181.field2495];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field6036; var27 <= this.field6036; ++var27) {
                    int var37 = var27 & class459.field6226;
                    var21 += var24[var37];
                    var23 += var26[var37];
                    var22 += var25[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class181.field2495 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = var31 - this.field6036 & class459.field6226;
                    int var33 = var23 - var26[var32];
                    ++var31;
                    int var34 = var22 - var25[var32];
                    int var35 = var21 - var24[var32];
                    int var36 = class459.field6226 & this.field6036 + var31;
                    var21 = var24[var36] + var35;
                    var23 = var26[var36] + var33;
                    var22 = var25[var36] + var34;
                }
                var8[this.field6038 + var9 + -arg0] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class181.field2495; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
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
