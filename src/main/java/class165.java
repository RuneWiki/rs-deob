import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class165 extends class667 {

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
    private int field2432 = 1;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
    private int field2435 = 1;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "Ltaa;")
    public static class405 field2440 = new class405();

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "[Lak;")
    public static class349[] field2442 = new class349[2048];

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "[Lbda;")
    public static class503[] field2441 = new class503[37];

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V", line = 3)
    public class165() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIII)V", line = 6)
    public static final void method1225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class156.field2337 <= arg2 && arg4 <= class612.field8854 && class558.field7940 <= arg5 && ~class748.field10458 <= ~arg1) {
            class638.method3653((byte) 84, arg4, arg5, arg1, arg3, arg2);
        } else {
            class684.method3854(false, arg3, arg1, arg4, arg5, arg2);
        }
        ++field2439;
        if (arg0 != 0) {
            field2441 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIBIII)V", line = 23)
    public static final void method1226(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        ++field2433;
        if (class4.method19(arg5 ^ 92, arg1)) {
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            if (arg5 != 60) {
                method1228(115, false);
            }
            int var14 = 0;
            if (class200.field2876) {
                var11 = class715.field9989;
                var14 = class130.field1947;
                var10 = class179.field2576;
                var13 = class159.field2374;
                var12 = class30.field405;
                class130.field1947 = 1;
            }
            if (class463.field6662[arg1] == null) {
                class749.method4169(arg6, class117.field1849[arg1], arg2, arg8, -4183, ~arg8 > -1, arg4, -1, arg3, arg7, arg0);
            } else {
                class749.method4169(arg6, class463.field6662[arg1], arg2, arg8, arg5 + -4243, ~arg8 > -1, arg4, -1, arg3, arg7, arg0);
            }
            if (class200.field2876) {
                if (arg8 >= 0 && class130.field1947 == 2) {
                    class6.method33(true, class159.field2374, class715.field9989, class179.field2576, class30.field405);
                }
                class715.field9989 = var11;
                class130.field1947 = var14;
                class159.field2374 = var13;
                class30.field405 = var12;
                class179.field2576 = var10;
            }
        } else if (~arg8 != 0) {
            class329.field4646[arg8] = true;
        } else {
            for (int var9 = 0; var9 < 100; ++var9) {
                class329.field4646[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lud;II)V", line = 91)
    public final void method116(class35 arg0, int arg1, int arg2) {
        ++field2434;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field9344 = ~arg0.method273(255) == -2;
                }
            } else {
                this.field2432 = arg0.method273(arg1 + 252);
            }
        } else {
            this.field2435 = arg0.method273(255);
        }
        if (arg1 != 3) {
            method1227(-76);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)[[I", line = 136)
    public final int[][] method777(boolean arg0, int arg1) {
        ++field2437;
        int[][] var3 = super.field9357.method2314((byte) 41, arg1);
        if (arg0) {
            field2440 = null;
        }
        if (super.field9357.field5178) {
            int var4 = this.field2432 - (-this.field2432 - 1);
            int var5 = 65536 / var4;
            int var6 = this.field2435 - -1 + this.field2435;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field2432 + arg1; this.field2432 + arg1 >= var9; ++var9) {
                int[][] var19 = this.method3748(var9 & class77.field1453, 0, 0);
                int[][] var20 = new int[3][class77.field1455];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field2435; ~var27 >= ~this.field2435; ++var27) {
                    int var37 = class439.field6131 & var27;
                    var21 += var24[var37];
                    var23 += var26[var37];
                    var22 += var25[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (class77.field1455 > var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field2435 + var31 & class439.field6131;
                    int var33 = var21 - var24[var32];
                    int var34 = var23 - var26[var32];
                    int var35 = var22 - var25[var32];
                    ++var31;
                    int var36 = var31 - -this.field2435 & class439.field6131;
                    var22 = var25[var36] + var35;
                    var23 = var26[var36] + var34;
                    var21 = var24[var36] + var33;
                }
                var8[-arg1 + this.field2432 + var9] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; class77.field1455 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
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
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)[I", line = 270)
    public final int[] method117(byte arg0, int arg1) {
        ++field2438;
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (super.field9355.field3728) {
            int var4 = this.field2432 + 1 + this.field2432;
            int var5 = 65536 / var4;
            int var6 = this.field2435 + this.field2435 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field2432 + arg1; var9 <= this.field2432 + arg1; ++var9) {
                int[] var13 = this.method3744(class77.field1453 & var9, (byte) 25, 0);
                int[] var14 = new int[class77.field1455];
                int var15 = 0;
                for (int var16 = -this.field2435; this.field2435 >= var16; ++var16) {
                    var15 += var13[var16 & class439.field6131];
                }
                int var17 = 0;
                while (~class77.field1455 < ~var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field2435 + var17 & class439.field6131];
                    ++var17;
                    var15 = var13[this.field2435 + var17 & class439.field6131] + var18;
                }
                var8[-arg1 + var9 + this.field2432] = var14;
            }
            for (int var10 = 0; ~var10 > ~class77.field1455; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return arg0 > -87 ? null : var3;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V", line = 363)
    public static void method1227(int arg0) {
        field2441 = null;
        field2440 = null;
        if (arg0 >= -36) {
            method1225(-85, 113, -60, 87, -30, -72);
        }
        field2442 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZ)Lqca;", line = 382)
    public static final class115 method1228(int arg0, boolean arg1) {
        ++field2436;
        class115[] var2 = class307.method1995((byte) 126);
        if (!arg1) {
            field2442 = null;
        }
        for (int var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3].field1842 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }
}
