import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class671 extends class478 {

    @OriginalMember(owner = "client!naa", name = "B", descriptor = "Z")
    public static boolean field9344 = false;

    @OriginalMember(owner = "client!naa", name = "C", descriptor = "I")
    public static int field9345;

    @OriginalMember(owner = "client!naa", name = "E", descriptor = "I")
    public static int field9347;

    @OriginalMember(owner = "client!naa", name = "F", descriptor = "I")
    public static int field9348;

    @OriginalMember(owner = "client!naa", name = "G", descriptor = "I")
    public static int field9349;

    @OriginalMember(owner = "client!naa", name = "H", descriptor = "I")
    public static int field9350;

    @OriginalMember(owner = "client!naa", name = "I", descriptor = "I")
    public static int field9351;

    @OriginalMember(owner = "client!naa", name = "D", descriptor = "Ltf;")
    public static class701 field9346;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(ZI)[[I", line = 3)
    public final int[][] method104(boolean arg0, int arg1) {
        ++field9349;
        int[][] var3 = super.field6889.method2091(64, arg1);
        if (!arg0) {
            field9346 = null;
        }
        if (super.field6889.field4765) {
            int[] var4 = this.method2752(arg1, -56, 2);
            int[][] var5 = this.method2753(0, arg1, (byte) 11);
            int[][] var6 = this.method2753(1, arg1, (byte) 11);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class436.field6154; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (var17 != 0) {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    } else {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "(I)V", line = 81)
    public static void method3712(int arg0) {
        field9346 = null;
        if (arg0 > -29) {
            method3713(36);
        }
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "()V", line = 91)
    public class671() {
        super(3, false);
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(ILnp;I)V", line = 94)
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (arg0 != 255) {
            this.method104(false, 78);
        }
        if (~arg2 == -1) {
            super.field6881 = arg1.method620((byte) -128) == 1;
        }
        ++field9347;
    }

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "(I)V", line = 111)
    public static final void method3713(int arg0) {
        class90.field910 = true;
        ++field9345;
        if (arg0 != 9722) {
            field9344 = false;
        }
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(II)[I", line = 131)
    public final int[] method35(int arg0, int arg1) {
        ++field9350;
        int[] var3 = super.field6886.method789(arg0, (byte) -84);
        if (super.field6886.field1592) {
            int[] var4 = this.method2752(arg0, arg1 + 11208, 0);
            int[] var5 = this.method2752(arg0, 119, 1);
            int[] var6 = this.method2752(arg0, arg1 ^ 11348, 2);
            for (int var7 = 0; class436.field6154 > var7; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        if (arg1 != -11323) {
            method3713(-124);
        }
        return var3;
    }
}
