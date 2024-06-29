import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class300 extends class199 {

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "I")
    private int field4408 = 1;

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
    private int field4407 = 1;

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "I")
    public static int field4405 = -1;

    @OriginalMember(owner = "client!vi", name = "ab", descriptor = "[I")
    public static int[] field4412 = new int[25];

    @OriginalMember(owner = "client!vi", name = "cb", descriptor = "[I")
    public static int[] field4414 = new int[100];

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!vi", name = "X", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!vi", name = "Z", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!vi", name = "bb", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "[[[Lnh;")
    public static class119[][][] field4410;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "(I)V", line = 6)
    public static void method2106(int arg0) {
        if (arg0 != 1) {
            method2106(-73);
        }
        field4410 = (class119[][][]) null;
        field4412 = null;
        field4414 = null;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)[[I", line = 20)
    public final int[][] method215(int arg0, int arg1) {
        field4406++;
        int[][] var3 = this.field2796.method2187(arg0, -102);
        if (arg1 != -29869) {
            this.method190(-26, -43);
        }
        if (this.field2796.field4667) {
            int var4 = this.field4408 - (-this.field4408 - 1);
            int var5 = 65536 / var4;
            int var6 = this.field4407 + this.field4407 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg0 - this.field4408; var9 <= (arg0 + this.field4408); var9++) {
                int[][] var10 = this.method1459(0, var9 & class156.field2165, (byte) -51);
                int[][] var11 = new int[3][class95.field1235];
                int var12 = 0;
                int var13 = 0;
                int[] var14 = var10[0];
                int var15 = 0;
                int[] var16 = var10[2];
                int[] var17 = var10[1];
                for (int var18 = -this.field4407; var18 <= this.field4407; var18++) {
                    int var19 = class245.field3573 & var18;
                    var15 += var17[var19];
                    var12 += var14[var19];
                    var13 += var16[var19];
                }
                int[] var20 = var11[0];
                int[] var21 = var11[1];
                int[] var22 = var11[2];
                int var23 = 0;
                while (class95.field1235 > var23) {
                    var20[var23] = var7 * var12 >> 16;
                    var21[var23] = var7 * var15 >> 16;
                    var22[var23] = var7 * var13 >> 16;
                    int var24 = var23 - this.field4407 & class245.field3573;
                    int var25 = var15 - var17[var24];
                    int var26 = var12 - var14[var24];
                    var23++;
                    int var27 = var13 - var16[var24];
                    int var28 = var23 + this.field4407 & class245.field3573;
                    var12 = var14[var28] + var26;
                    var15 = var17[var28] + var25;
                    var13 = var16[var28] + var27;
                }
                var8[var9 + this.field4408 - arg0] = var11;
            }
            int[] var29 = var3[1];
            int[] var30 = var3[2];
            int[] var31 = var3[0];
            for (int var32 = 0; var32 < class95.field1235; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var8[var36];
                    var35 += var37[2][var32];
                    var33 += var37[0][var32];
                    var34 += var37[1][var32];
                }
                var31[var32] = var5 * var33 >> 16;
                var29[var32] = var5 * var34 >> 16;
                var30[var32] = var5 * var35 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLfd;I)V", line = 160)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4407 = arg1.method2096((byte) -122);
        } else if (arg2 == 1) {
            this.field4408 = arg1.method2096((byte) -122);
        } else if (arg2 == 2) {
            this.field2795 = arg1.method2096((byte) -122) == 1;
        }
        field4404++;
        if (arg0 != -43) {
            this.field4407 = 58;
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(II)I", line = 198)
    public static int method2107(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)[I", line = 207)
    public final int[] method190(int arg0, int arg1) {
        field4409++;
        if (arg0 != -1735) {
            this.method190(-44, 36);
        }
        int[] var3 = this.field2802.method2502(arg1, 90);
        if (this.field2802.field5637) {
            int var4 = this.field4408 + this.field4408 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field4407 + this.field4407 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field4408; var9 <= arg1 + this.field4408; var9++) {
                int[] var10 = this.method1467(arg0 ^ 0x1895, class156.field2165 & var9, 0);
                int[] var11 = new int[class95.field1235];
                int var12 = 0;
                for (int var13 = -this.field4407; var13 <= this.field4407; var13++) {
                    var12 += var10[class245.field3573 & var13];
                }
                int var14 = 0;
                while (var14 < class95.field1235) {
                    var11[var14] = var7 * var12 >> 16;
                    int var15 = var12 - var10[class245.field3573 & var14 - this.field4407];
                    var14++;
                    var12 = var10[this.field4407 + var14 & class245.field3573] + var15;
                }
                var8[var9 + this.field4408 - arg1] = var11;
            }
            for (int var16 = 0; var16 < class95.field1235; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V", line = 314)
    public class300() {
        super(1, false);
    }
}
