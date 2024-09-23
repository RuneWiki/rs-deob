import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JMUIRIHZ")
public class class23 extends class34 {

    @OriginalMember(owner = "JMUIRIHZ", name = "rb", descriptor = "B")
    private byte field947 = 1;

    @OriginalMember(owner = "JMUIRIHZ", name = "sb", descriptor = "I")
    private int field948 = -47054;

    @OriginalMember(owner = "JMUIRIHZ", name = "tb", descriptor = "Z")
    private boolean field949 = false;

    @OriginalMember(owner = "JMUIRIHZ", name = "ub", descriptor = "Z")
    private boolean field950 = false;

    @OriginalMember(owner = "JMUIRIHZ", name = "vb", descriptor = "LVWKJSKWX;")
    public class60 field951;

    @OriginalMember(owner = "JMUIRIHZ", name = "a", descriptor = "(Z)Z")
    public final boolean method38(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field951 != null;
    }

    @OriginalMember(owner = "JMUIRIHZ", name = "b", descriptor = "(Z)LCADBNSXE;")
    private final class3 method260(boolean arg0) {
        if (super.field1182 >= 0 && super.field1185 == 0) {
            int var2 = class58.field1570[super.field1182].field1572[super.field1183];
            int var3 = -1;
            if (super.field1155 >= 0 && super.field1155 != super.field1148) {
                var3 = class58.field1570[super.field1155].field1572[super.field1156];
            }
            return this.field951.method572(119, var3, var2, class58.field1570[super.field1182].field1576);
        } else {
            int var4 = -1;
            if (arg0) {
                this.field948 = -30;
            }
            if (super.field1155 >= 0) {
                var4 = class58.field1570[super.field1155].field1572[super.field1156];
            }
            return this.field951.method572(119, -1, var4, (int[]) null);
        }
    }

    @OriginalMember(owner = "JMUIRIHZ", name = "a", descriptor = "(I)LCADBNSXE;")
    public final class3 method40(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else if (this.field951 == null) {
            return null;
        } else {
            class3 var2 = this.method260(this.field950);
            if (var2 == null) {
                return null;
            } else {
                super.field1187 = var2.field945;
                if (super.field1133 != -1 && super.field1134 != -1) {
                    class64 var3 = class64.field1665[super.field1133];
                    class3 var4 = var3.method589();
                    if (var4 != null) {
                        int var5 = var3.field1669.field1572[super.field1134];
                        class3 var6 = new class3(false, class8.method215(false, var5), var4, this.field947, true);
                        var6.method24(-super.field1137, 0, 1, 0);
                        var6.method18(false);
                        var6.method19(var5, (byte) -62);
                        var6.field58 = null;
                        var6.field57 = null;
                        if (var3.field1672 != 128 || var3.field1673 != 128) {
                            var6.method27(var3.field1672, 0, var3.field1673, var3.field1672);
                        }
                        var6.method28(var3.field1675 + 64, var3.field1676 + 850, -30, -50, -30, true);
                        class3[] var7 = new class3[] { var2, var6 };
                        var2 = new class3(true, 6, var7, 2);
                    }
                }
                if (this.field951.field1628 == 1) {
                    var2.field59 = true;
                }
                return var2;
            }
        }
    }
}
