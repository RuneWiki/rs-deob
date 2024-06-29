import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class469 extends class145 {

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    public static int field6963;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILrt;)V", line = 3)
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (~arg0 == -1) {
            super.field1790 = ~arg2.method1177(255) == -2;
        }
        if (arg1 < -67) {
            ++field6962;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)[[I", line = 21)
    public final int[][] method75(byte arg0, int arg1) {
        ++field6963;
        int[][] var3 = super.field1792.method1826(arg1, -16486);
        if (arg0 > -28) {
            return null;
        } else {
            if (super.field1792.field3917) {
                int[] var4 = this.method865(2, arg1, (byte) -61);
                int[][] var5 = this.method866(0, arg1, (byte) -118);
                int[][] var6 = this.method866(1, arg1, (byte) 25);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; ~class647.field9368 < ~var16; ++var16) {
                    int var17 = var4[var16];
                    if (~var17 != -4097) {
                        if (~var17 != -1) {
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
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZI)[I", line = 99)
    public final int[] method27(boolean arg0, int arg1) {
        ++field6961;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (arg0) {
            return null;
        } else {
            if (super.field1779.field4602) {
                int[] var4 = this.method865(0, arg1, (byte) -79);
                int[] var5 = this.method865(1, arg1, (byte) 100);
                int[] var6 = this.method865(2, arg1, (byte) -60);
                for (int var7 = 0; ~var7 > ~class647.field9368; ++var7) {
                    int var8 = var6[var7];
                    if (~var8 != -4097) {
                        if (var8 != 0) {
                            var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                        } else {
                            var3[var7] = var5[var7];
                        }
                    } else {
                        var3[var7] = var4[var7];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V", line = 151)
    public class469() {
        super(3, false);
    }
}
