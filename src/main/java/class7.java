import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CRBPLXHF")
public class class7 extends class23 {

    @OriginalMember(owner = "CRBPLXHF", name = "qb", descriptor = "I")
    private int field529 = -44;

    @OriginalMember(owner = "CRBPLXHF", name = "rb", descriptor = "Z")
    private boolean field530 = false;

    @OriginalMember(owner = "CRBPLXHF", name = "sb", descriptor = "LDOBKXCMM;")
    public class14 field531;

    @OriginalMember(owner = "CRBPLXHF", name = "a", descriptor = "(B)LDHUPIIUL;")
    public final class10 method159(byte arg0) {
        if (this.field531 == null) {
            return null;
        } else {
            class10 var2 = this.method160(0);
            if (var2 == null) {
                return null;
            } else {
                super.field912 = var2.field789;
                if (arg0 != 5) {
                    throw new NullPointerException();
                } else {
                    if (super.field905 != -1 && super.field906 != -1) {
                        class70 var3 = class70.field1694[super.field905];
                        class10 var4 = var3.method582();
                        if (var4 != null) {
                            int var5 = var3.field1698.field951[super.field906];
                            class10 var6 = new class10(var4, false, class5.method16(var5, true), 878, true);
                            var6.method204(0, 0, 0, -super.field909);
                            var6.method198(-390);
                            var6.method199(var5, 0);
                            var6.field649 = null;
                            var6.field648 = null;
                            if (var3.field1701 != 128 || var3.field1702 != 128) {
                                var6.method207(-592, var3.field1701, var3.field1702, var3.field1701);
                            }
                            var6.method208(var3.field1704 + 64, var3.field1705 + 850, -30, -50, -30, true);
                            class10[] var7 = new class10[] { var2, var6 };
                            var2 = new class10(true, 0, 2, var7);
                        }
                    }
                    if (this.field531.field762 == 1) {
                        var2.field650 = true;
                    }
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "CRBPLXHF", name = "a", descriptor = "(I)LDHUPIIUL;")
    private final class10 method160(int arg0) {
        if (arg0 != 0) {
            this.field529 = -60;
        }
        if (super.field898 >= 0 && super.field901 == 0) {
            int var2 = class26.field949[super.field898].field951[super.field899];
            int var3 = -1;
            if (super.field878 >= 0 && super.field878 != super.field860) {
                var3 = class26.field949[super.field878].field951[super.field879];
            }
            return this.field531.method237(var3, class26.field949[super.field898].field955, var2, 623);
        } else {
            int var4 = -1;
            if (super.field878 >= 0) {
                var4 = class26.field949[super.field878].field951[super.field879];
            }
            return this.field531.method237(-1, (int[]) null, var4, 623);
        }
    }

    @OriginalMember(owner = "CRBPLXHF", name = "b", descriptor = "(B)Z")
    public final boolean method161(byte arg0) {
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            this.field530 = !this.field530;
        }
        return this.field531 != null;
    }
}
