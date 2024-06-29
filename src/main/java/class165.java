import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class165 extends class98 {

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "Z")
    private boolean field2324 = true;

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "Z")
    private boolean field2325 = true;

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class165() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)[I")
    public final int[] method83(int arg0, int arg1) {
        ++field2329;
        int[] var3 = super.field1177.method820(arg1, true);
        if (super.field1177.field1610) {
            int[] var4 = this.method539(0, (byte) -115, !this.field2324 ? arg1 : -arg1 + class225.field3153);
            if (!this.field2325) {
                class316.method2072(var4, 0, var3, 0, class268.field3811);
            } else {
                for (int var5 = 0; class268.field3811 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class210.field2995];
                }
            }
        }
        return arg0 != 0 ? null : var3;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        if (arg2 != 0) {
            this.method83(-33, 10);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field1176 = arg1.method1574(-30) == 1;
                }
            } else {
                this.field2324 = ~arg1.method1574(-60) == -2;
            }
        } else {
            this.field2325 = arg1.method1574(-70) == 1;
        }
        ++field2328;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)[[I")
    public final int[][] method194(int arg0, int arg1) {
        ++field2326;
        int[][] var3 = super.field1184.method185((byte) -48, arg0);
        if (super.field1184.field332) {
            int[][] var4 = this.method546(this.field2324 ? -arg0 + class225.field3153 : arg0, (byte) 33, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field2325) {
                for (int var11 = 0; var11 < class268.field3811; ++var11) {
                    var8[var11] = var5[class210.field2995 - var11];
                    var9[var11] = var6[-var11 + class210.field2995];
                    var10[var11] = var7[-var11 + class210.field2995];
                }
            } else {
                for (int var12 = 0; var12 < class268.field3811; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        int var13 = -47 / ((60 - arg1) / 43);
        return var3;
    }
}
