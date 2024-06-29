import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KLQFDPHO")
public class class30 extends class11 {

    @OriginalMember(owner = "client!KLQFDPHO", name = "tb", descriptor = "I")
    private int field997 = 1;

    @OriginalMember(owner = "client!KLQFDPHO", name = "ub", descriptor = "I")
    private int field998 = 772;

    @OriginalMember(owner = "client!KLQFDPHO", name = "sb", descriptor = "I")
    private int field996;

    @OriginalMember(owner = "client!KLQFDPHO", name = "vb", descriptor = "LQYNFXHXW;")
    public class48 field999;

    @OriginalMember(owner = "client!KLQFDPHO", name = "c", descriptor = "(I)LOJGAHFXC;")
    private final class41 method366(int arg0) {
        if (super.field685 >= 0 && super.field688 == 0) {
            int var2 = class14.field717[super.field685].field719[super.field686];
            int var3 = -1;
            if (super.field700 >= 0 && super.field700 != super.field697) {
                var3 = class14.field717[super.field700].field719[super.field701];
            }
            return this.field999.method513(class14.field717[super.field685].field723, 653, var2, var3);
        } else {
            int var4 = -1;
            while (arg0 >= 0) {
                for (int var5 = 1; var5 > 0; ++var5) {
                }
            }
            if (super.field700 >= 0) {
                var4 = class14.field717[super.field700].field719[super.field701];
            }
            return this.field999.method513((int[]) null, 653, var4, -1);
        }
    }

    @OriginalMember(owner = "client!KLQFDPHO", name = "b", descriptor = "(I)Z")
    public final boolean method40(int arg0) {
        int var2 = 61 / arg0;
        return this.field999 != null;
    }

    @OriginalMember(owner = "client!KLQFDPHO", name = "a", descriptor = "(I)LOJGAHFXC;")
    public final class41 method1(int arg0) {
        if (this.field999 == null) {
            return null;
        } else {
            class41 var2 = this.method366(-61);
            if (var2 == null) {
                return null;
            } else {
                super.field705 = var2.field1460;
                int var3 = 52 / arg0;
                if (super.field653 != -1 && super.field654 != -1) {
                    class67 var4 = class67.field1691[super.field653];
                    class41 var5 = var4.method582();
                    if (var5 != null) {
                        int var6 = var4.field1695.field719[super.field654];
                        class41 var7 = new class41(class37.method395(var6, (byte) 1), false, true, -900, var5);
                        var7.method426(-super.field657, 0, 2, 0);
                        var7.method420(this.field996);
                        var7.method421(771, var6);
                        var7.field1221 = null;
                        var7.field1220 = null;
                        if (var4.field1698 != 128 || var4.field1699 != 128) {
                            var7.method429(var4.field1698, this.field997, var4.field1699, var4.field1698);
                        }
                        var7.method430(var4.field1701 + 64, var4.field1702 + 850, -30, -50, -30, true);
                        class41[] var8 = new class41[] { var2, var7 };
                        var2 = new class41(true, var8, 2, true);
                    }
                }
                if (this.field999.field1347 == 1) {
                    var2.field1222 = true;
                }
                return var2;
            }
        }
    }
}
