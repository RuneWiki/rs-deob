import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class145 extends class185 {

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
    private int field2116 = 1;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "I")
    private int field2118 = 1;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    private int field2117 = 204;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "[I")
    public static int[] field2119 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "Z")
    public static boolean field2115 = true;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "Ljl;")
    public static class253 field2120 = new class253(16);

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "I")
    public static int field2125 = 0;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "[I")
    public static int[] field2122;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        ++field2124;
        int[] var3 = super.field2804.method561(arg0, -2);
        if (super.field2804.field1384) {
            for (int var4 = 0; class174.field2648 > var4; ++var4) {
                int var5 = class153.field2304[var4];
                int var6 = this.field2118 * var5 >> 12;
                int var7 = class85.field1356[arg0];
                int var8 = this.field2116 * var7 >> 12;
                int var9 = var5 % (4096 / this.field2118) * this.field2118;
                int var10 = var7 % (4096 / this.field2116) * this.field2116;
                if (this.field2117 > var10) {
                    for (var6 -= var8; var6 < 0; var6 += 4) {
                    }
                    while (~var6 < -4) {
                        var6 -= 4;
                    }
                    if (var6 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var9 > ~this.field2117) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field2117 > var9) {
                    int var11;
                    for (var11 = var6 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return arg1 < 70 ? null : var3;
    }

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "(I)V")
    public static void method885(int arg0) {
        field2119 = null;
        if (arg0 != -1) {
            method885(-100);
        }
        field2122 = null;
        field2120 = null;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class145() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        ++field2114;
        if (arg2 != -6357) {
            field2121 = -82;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field2117 = arg1.method1575(false);
                }
            } else {
                this.field2116 = arg1.method1593((byte) 27);
            }
        } else {
            this.field2118 = arg1.method1593((byte) 27);
        }
    }
}
