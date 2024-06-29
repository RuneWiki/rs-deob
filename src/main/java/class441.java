import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class441 extends class243 {

    @OriginalMember(owner = "client!ks", name = "D", descriptor = "I")
    private int field6154 = 585;

    @OriginalMember(owner = "client!ks", name = "E", descriptor = "I")
    public static int field6155 = -1;

    @OriginalMember(owner = "client!ks", name = "G", descriptor = "[I")
    public static int[] field6157 = new int[14];

    @OriginalMember(owner = "client!ks", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field6158 = new String[200];

    @OriginalMember(owner = "client!ks", name = "F", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!ks", name = "I", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "()V", line = 3)
    public class441() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "(B)V", line = 14)
    public static void method2490(byte arg0) {
        field6158 = null;
        field6157 = null;
        if (arg0 != 40) {
            method2490((byte) 11);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)[I", line = 32)
    public final int[] method5(int arg0, int arg1) {
        ++field6159;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (arg0 != 255) {
            return null;
        } else {
            if (super.field3164.field9250) {
                int var4 = class685.field9613[arg1];
                for (int var5 = 0; ~var5 > ~class687.field9628; ++var5) {
                    int var6 = class666.field9279[var5];
                    if (~this.field6154 > ~var6 && var6 < 4096 - this.field6154 && -this.field6154 + 2048 < var4 && ~(this.field6154 + 2048) < ~var4) {
                        int var7 = -var6 + 2048;
                        int var8 = var7 >= 0 ? var7 : -var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (-this.field6154 + 2048);
                        var3[var5] = -var10 + 4096;
                    } else if (~var6 < ~(2048 - this.field6154) && var6 < this.field6154 + 2048) {
                        int var11 = var4 + -2048;
                        int var12 = ~var11 > -1 ? -var11 : var11;
                        int var13 = var12 - this.field6154;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (-this.field6154 + 2048);
                    } else if (var4 >= this.field6154 && ~var4 >= ~(-this.field6154 + 4096)) {
                        if (~var6 <= ~this.field6154 && ~(-this.field6154 + 4096) <= ~var6) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = var15 < 0 ? -var15 : var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (-this.field6154 + 2048);
                            var3[var5] = -var18 + 4096;
                        }
                    } else {
                        int var19 = var6 + -2048;
                        int var20 = var19 < 0 ? -var19 : var19;
                        int var21 = var20 - this.field6154;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (-this.field6154 + 2048);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILji;B)V", line = 113)
    public final void method1(int arg0, class611 arg1, byte arg2) {
        ++field6156;
        if (arg2 > -92) {
            field6155 = -16;
        }
        if (~arg0 == -1) {
            this.field6154 = arg1.method3402((byte) 127);
        }
    }
}
