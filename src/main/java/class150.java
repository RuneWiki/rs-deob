import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class150 extends class386 {

    @OriginalMember(owner = "client!wq", name = "F", descriptor = "I")
    private int field1860 = 585;

    @OriginalMember(owner = "client!wq", name = "G", descriptor = "Z")
    public static boolean field1861 = false;

    @OriginalMember(owner = "client!wq", name = "C", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!wq", name = "H", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!wq", name = "E", descriptor = "Lom;")
    public static class342 field1859;

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "()V", line = 8)
    public class150() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "(I)V", line = 11)
    public static void method972(int arg0) {
        if (arg0 <= 116) {
            method972(-68);
        }
        field1859 = null;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)[I", line = 21)
    public final int[] method359(int arg0, int arg1) {
        ++field1858;
        int[] var3 = super.field5140.method1564(arg0, true);
        int var4 = 101 % ((arg1 - 13) / 40);
        if (super.field5140.field3482) {
            int var5 = class562.field8114[arg0];
            for (int var6 = 0; class599.field8643 > var6; ++var6) {
                int var7 = class152.field1879[var6];
                if (var7 > this.field1860 && -this.field1860 + 4096 > var7 && var5 > -this.field1860 + 2048 && var5 < this.field1860 + 2048) {
                    int var8 = -var7 + 2048;
                    int var9 = var8 >= 0 ? var8 : -var8;
                    int var10 = var9 << 12;
                    int var11 = var10 / (2048 - this.field1860);
                    var3[var6] = -var11 + 4096;
                } else if (-this.field1860 + 2048 < var7 && this.field1860 + 2048 > var7) {
                    int var12 = var5 + -2048;
                    int var13 = ~var12 <= -1 ? var12 : -var12;
                    int var14 = var13 - this.field1860;
                    int var15 = var14 << 12;
                    var3[var6] = var15 / (2048 - this.field1860);
                } else if (~var5 <= ~this.field1860 && ~var5 >= ~(4096 - this.field1860)) {
                    if (~var7 <= ~this.field1860 && ~var7 >= ~(4096 - this.field1860)) {
                        var3[var6] = 0;
                    } else {
                        int var16 = -var5 + 2048;
                        int var17 = ~var16 <= -1 ? var16 : -var16;
                        int var18 = var17 << 12;
                        int var19 = var18 / (-this.field1860 + 2048);
                        var3[var6] = -var19 + 4096;
                    }
                } else {
                    int var20 = var7 + -2048;
                    int var21 = var20 < 0 ? -var20 : var20;
                    int var22 = var21 - this.field1860;
                    int var23 = var22 << 12;
                    var3[var6] = var23 / (-this.field1860 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IBLun;)V", line = 113)
    public final void method355(int arg0, byte arg1, class389 arg2) {
        if (arg0 == 0) {
            this.field1860 = arg2.method2260(-26);
        }
        if (arg1 < 111) {
            this.method359(94, 82);
        }
        ++field1862;
    }
}
