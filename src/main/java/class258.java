import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class258 extends class4 {

    @OriginalMember(owner = "client!ada", name = "E", descriptor = "I")
    private int field3201 = 0;

    @OriginalMember(owner = "client!ada", name = "F", descriptor = "I")
    private int field3202 = 20;

    @OriginalMember(owner = "client!ada", name = "H", descriptor = "I")
    private int field3204 = 1365;

    @OriginalMember(owner = "client!ada", name = "K", descriptor = "I")
    private int field3207 = 0;

    @OriginalMember(owner = "client!ada", name = "G", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!ada", name = "I", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!ada", name = "J", descriptor = "[I")
    public static int[] field3206;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        if (arg0 != 10) {
            return null;
        } else {
            ++field3205;
            int[] var3 = super.field31.method2252(arg1, 11);
            if (super.field31.field5127) {
                for (int var4 = 0; ~class132.field1627 < ~var4; ++var4) {
                    int var5 = (class66.field881[var4] << 12) / this.field3204 + this.field3201;
                    int var6 = (class130.field1606[arg1] << 12) / this.field3204 + this.field3207;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (var11 + var12 < 16384 && this.field3202 > var13) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = var11 - (var12 - var7);
                        var11 = var9 * var9 >> 12;
                        ++var13;
                        var12 = var10 * var10 >> 12;
                    }
                    var3[var4] = this.field3202 + -1 > var13 ? (var13 << 12) / this.field3202 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        if (arg0 >= -89) {
            this.field3207 = 43;
        }
        ++field3203;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 == 3) {
                        this.field3207 = arg1.method3090(-80);
                    }
                } else {
                    this.field3201 = arg1.method3090(-108);
                }
            } else {
                this.field3202 = arg1.method3090(-96);
            }
        } else {
            this.field3204 = arg1.method3090(-94);
        }
    }

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "(B)V")
    public static void method1549(byte arg0) {
        field3206 = null;
        int var1 = -47 % ((arg0 - 44) / 55);
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "()V")
    public class258() {
        super(0, true);
    }
}
