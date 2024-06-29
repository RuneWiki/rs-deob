import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class82 extends class17 {

    @OriginalMember(owner = "client!ut", name = "F", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!ut", name = "G", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!ut", name = "H", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!ut", name = "I", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        ++field1055;
        int[][] var3 = super.field201.method1851(arg0, (byte) -56);
        if (arg1 != -25) {
            return null;
        } else {
            if (super.field201.field4431) {
                int[] var4 = this.method88(arg0, -4526, 2);
                int[][] var5 = this.method91(0, 0, arg0);
                int[][] var6 = this.method91(1, arg1 ^ -25, arg0);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; class530.field7763 > var16; ++var16) {
                    int var17 = var4[var16];
                    if (~var17 != -4097) {
                        if (~var17 == -1) {
                            var7[var16] = var13[var16];
                            var8[var16] = var14[var16];
                            var9[var16] = var15[var16];
                        } else {
                            int var18 = -var17 + 4096;
                            var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                            var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                            var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
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
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lwm;II)V")
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            super.field205 = ~arg0.method2357((byte) 119) == -2;
        }
        ++field1054;
        if (arg2 != 5159) {
            this.method34((class403) null, 47, 67);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        if (arg1 < 53) {
            method608(-43, -54, -36);
        }
        ++field1056;
        int[] var3 = super.field210.method2683(-17, arg0);
        if (super.field210.field6442) {
            int[] var4 = this.method88(arg0, -4526, 0);
            int[] var5 = this.method88(arg0, -4526, 1);
            int[] var6 = this.method88(arg0, -4526, 2);
            for (int var7 = 0; class530.field7763 > var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "(III)Z")
    public static final boolean method608(int arg0, int arg1, int arg2) {
        ++field1057;
        int var3 = -38 / ((arg2 - 59) / 50);
        return (24 & arg1) != 0 | (544 & arg1) == 544;
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
    public class82() {
        super(3, false);
    }
}
