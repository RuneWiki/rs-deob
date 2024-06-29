import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class534 extends class263 {

    @OriginalMember(owner = "client!aq", name = "H", descriptor = "I")
    private int field7856 = 1;

    @OriginalMember(owner = "client!aq", name = "J", descriptor = "I")
    private int field7858 = 1;

    @OriginalMember(owner = "client!aq", name = "L", descriptor = "Laa;")
    public static class76 field7860 = new class76(23, 3);

    @OriginalMember(owner = "client!aq", name = "M", descriptor = "I")
    public static int field7861 = 0;

    @OriginalMember(owner = "client!aq", name = "E", descriptor = "I")
    public static int field7853;

    @OriginalMember(owner = "client!aq", name = "F", descriptor = "I")
    public static int field7854;

    @OriginalMember(owner = "client!aq", name = "G", descriptor = "I")
    public static int field7855;

    @OriginalMember(owner = "client!aq", name = "K", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!aq", name = "I", descriptor = "Lni;")
    public static class521 field7857;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(IB)[[I", line = 3)
    public final int[][] method34(int arg0, byte arg1) {
        if (arg1 >= -45) {
            this.method32(-20, false, (class468) null);
        }
        ++field7853;
        int[][] var3 = super.field3912.method2649(arg0, false);
        if (super.field3912.field6681) {
            int var4 = this.field7858 - -this.field7858 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field7856 + 1 + this.field7856;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field7858 + arg0; arg0 - -this.field7858 >= var9; ++var9) {
                int[][] var19 = this.method1646(0, 2, class142.field2133 & var9);
                int[][] var20 = new int[3][class367.field5597];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field7856; var27 <= this.field7856; ++var27) {
                    int var37 = class83.field1326 & var27;
                    var22 += var25[var37];
                    var21 += var24[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class367.field5597 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class83.field1326 & -this.field7856 + var31;
                    ++var31;
                    int var33 = var22 - var25[var32];
                    int var34 = var23 - var26[var32];
                    int var35 = var21 - var24[var32];
                    int var36 = this.field7856 + var31 & class83.field1326;
                    var22 = var25[var36] + var33;
                    var23 = var26[var36] + var34;
                    var21 = var24[var36] + var35;
                }
                var8[this.field7858 - arg0 + var9] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class367.field5597; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
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

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V", line = 136)
    public class534() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "(I)V", line = 140)
    public static void method3159(int arg0) {
        field7860 = null;
        if (arg0 != 2) {
            field7857 = null;
        }
        field7857 = null;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZLgk;)V", line = 153)
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field3927 = arg2.method2765(102) == 1;
                }
            } else {
                this.field7858 = arg2.method2765(63);
            }
        } else {
            this.field7856 = arg2.method2765(79);
        }
        ++field7854;
        if (!arg1) {
            field7861 = -16;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IB)[I", line = 198)
    public final int[] method33(int arg0, byte arg1) {
        ++field7855;
        int[] var3 = super.field3917.method41(arg0, 1);
        if (super.field3917.field91) {
            int var4 = this.field7858 + this.field7858 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field7856 - -this.field7856 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field7858 + arg0; var9 <= this.field7858 + arg0; ++var9) {
                int[] var13 = this.method1644(0, 0, var9 & class142.field2133);
                int[] var14 = new int[class367.field5597];
                int var15 = 0;
                for (int var16 = -this.field7856; ~var16 >= ~this.field7856; ++var16) {
                    var15 += var13[var16 & class83.field1326];
                }
                int var17 = 0;
                while (var17 < class367.field5597) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class83.field1326 & var17 - this.field7856];
                    ++var17;
                    var15 = var13[class83.field1326 & var17 - -this.field7856] + var18;
                }
                var8[-arg0 + var9 - -this.field7858] = var14;
            }
            for (int var10 = 0; ~var10 > ~class367.field5597; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        if (arg1 <= 40) {
            method3159(126);
        }
        return var3;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIILjava/lang/Class;)Lmv;", line = 287)
    public static final class522 method3160(int arg0, int arg1, int arg2, Class arg3) {
        class306 var4 = class236.field3305[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        } else {
            for (class17 var5 = var4.field4589; var5 != null; var5 = var5.field281) {
                class522 var6 = var5.field279;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field7687 == arg1 && var6.field7676 == arg2) {
                    return var6;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IB[BI)[B", line = 314)
    public static final byte[] method3161(int arg0, byte arg1, byte[] arg2, int arg3) {
        ++field7859;
        byte[] var4 = new byte[arg0];
        class442.method2590(arg2, arg3, var4, 0, arg0);
        if (arg1 != 0) {
            method3159(-77);
        }
        return var4;
    }
}
