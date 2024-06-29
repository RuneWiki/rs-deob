import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class148 extends class56 {

    @OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
    private int field2119 = 585;

    @OriginalMember(owner = "client!ho", name = "D", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!ho", name = "E", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!ho", name = "G", descriptor = "[Ldga;")
    public static class204[] field2120;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)V", line = 3)
    public static void method1019(int arg0) {
        field2120 = null;
        if (arg0 >= -36) {
            method1019(15);
        }
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V", line = 13)
    public class148() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZ)[I", line = 17)
    public final int[] method24(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            ++field2117;
            int[] var3 = super.field673.method3270(arg0, (byte) -42);
            if (super.field673.field8073) {
                int var4 = class720.field10000[arg0];
                for (int var5 = 0; class328.field4576 > var5; ++var5) {
                    int var6 = class132.field1945[var5];
                    if (var6 > this.field2119 && ~(-this.field2119 + 4096) < ~var6 && var4 > -this.field2119 + 2048 && ~(this.field2119 + 2048) < ~var4) {
                        int var7 = -var6 + 2048;
                        int var8 = var7 < 0 ? -var7 : var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (-this.field2119 + 2048);
                        var3[var5] = -var10 + 4096;
                    } else if (~(-this.field2119 + 2048) > ~var6 && 2048 - -this.field2119 > var6) {
                        int var11 = var4 + -2048;
                        int var12 = ~var11 > -1 ? -var11 : var11;
                        int var13 = var12 - this.field2119;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (-this.field2119 + 2048);
                    } else if (var4 >= this.field2119 && ~(-this.field2119 + 4096) <= ~var4) {
                        if (var6 >= this.field2119 && var6 <= -this.field2119 + 4096) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = var15 >= 0 ? var15 : -var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (2048 - this.field2119);
                            var3[var5] = -var18 + 4096;
                        }
                    } else {
                        int var19 = var6 + -2048;
                        int var20 = ~var19 <= -1 ? var19 : -var19;
                        int var21 = var20 - this.field2119;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (2048 - this.field2119);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILee;I)V", line = 106)
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (~arg2 == -1) {
            this.field2119 = arg1.method3757((byte) -65);
        }
        ++field2118;
        if (arg0 != 3731) {
            this.method6(44, (class675) null, -63);
        }
    }
}
