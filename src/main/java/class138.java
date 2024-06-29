import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class138 extends class398 {

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "I")
    private int field1908 = 585;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "Lar;")
    public static class47 field1902 = new class47();

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "[I")
    public static int[] field1906 = new int[25];

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)V")
    public static void method893(byte arg0) {
        field1906 = null;
        field1902 = null;
        if (arg0 >= -17) {
            method893((byte) -69);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)[I")
    public final int[] method95(int arg0, int arg1) {
        ++field1903;
        int[] var3 = super.field5927.method305(arg0, (byte) 67);
        if (arg1 != 0) {
            this.method208((class228) null, 87, -122);
        }
        if (super.field5927.field591) {
            int var4 = class84.field1206[arg0];
            for (int var5 = 0; var5 < class140.field1922; ++var5) {
                int var6 = class375.field5448[var5];
                if (this.field1908 < var6 && ~var6 > ~(-this.field1908 + 4096) && var4 > -this.field1908 + 2048 && var4 < this.field1908 + 2048) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field1908 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~(-this.field1908 + 2048) > ~var6 && ~(this.field1908 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field1908;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field1908 + 2048);
                } else if (this.field1908 <= var4 && var4 <= -this.field1908 + 4096) {
                    if (var6 >= this.field1908 && ~var6 >= ~(-this.field1908 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field1908 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field1908;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field1908 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class138() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lnj;II)V")
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            this.field1908 = arg0.method1343(arg2 ^ -13237);
        }
        if (arg2 != -13132) {
            this.method95(77, 34);
        }
        ++field1905;
    }
}
