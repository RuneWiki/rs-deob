import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class146 extends class436 {

    @OriginalMember(owner = "client!rn", name = "K", descriptor = "I")
    private int field2123 = 585;

    @OriginalMember(owner = "client!rn", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2119 = "Loaded defaults";

    @OriginalMember(owner = "client!rn", name = "J", descriptor = "I")
    public static int field2122 = 0;

    @OriginalMember(owner = "client!rn", name = "M", descriptor = "Z")
    public static boolean field2125 = false;

    @OriginalMember(owner = "client!rn", name = "O", descriptor = "[I")
    public static int[] field2127 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!rn", name = "H", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!rn", name = "L", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!rn", name = "N", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!rn", name = "I", descriptor = "Lqj;")
    public static class296 field2121;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method14(int arg0, int arg1) {
        ++field2120;
        int[] var3 = super.field6258.method2688((byte) -84, arg0);
        if (arg1 != 18338) {
            this.method18(-4, -83, (class371) null);
        }
        if (super.field6258.field6138) {
            int var4 = class32.field499[arg0];
            for (int var5 = 0; ~var5 > ~class43.field653; ++var5) {
                int var6 = class249.field3455[var5];
                if (~this.field2123 > ~var6 && var6 < 4096 - this.field2123 && ~var4 < ~(-this.field2123 + 2048) && ~(this.field2123 + 2048) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field2123);
                    var3[var5] = 4096 - var10;
                } else if (~var6 < ~(2048 - this.field2123) && var6 < this.field2123 + 2048) {
                    int var11 = var4 - 2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field2123;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field2123 + 2048);
                } else if (this.field2123 <= var4 && 4096 - this.field2123 >= var4) {
                    if (this.field2123 <= var6 && ~var6 >= ~(-this.field2123 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field2123 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field2123;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field2123 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILeb;)V", line = 97)
    public final void method18(int arg0, int arg1, class371 arg2) {
        ++field2126;
        if (arg1 == 0) {
            this.field2123 = arg2.method2403((byte) 43);
        }
        if (arg0 != 34) {
            field2119 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V", line = 129)
    public class146() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "(I)V", line = 133)
    public static void method1003(int arg0) {
        if (arg0 == -12362) {
            field2127 = null;
            field2119 = null;
            field2121 = null;
        }
    }
}
