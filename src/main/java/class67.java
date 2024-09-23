import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZLSEKGJR")
public class class67 extends class58 {

    @OriginalMember(owner = "ZLSEKGJR", name = "rb", descriptor = "I")
    private int field1687;

    @OriginalMember(owner = "ZLSEKGJR", name = "sb", descriptor = "LGALAVQEJ;")
    public class12 field1688;

    @OriginalMember(owner = "ZLSEKGJR", name = "a", descriptor = "(I)Z")
    public final boolean method250(int arg0) {
        int var2 = 89 / arg0;
        return this.field1688 != null;
    }

    @OriginalMember(owner = "ZLSEKGJR", name = "c", descriptor = "(I)LCSGBDGDY;")
    private final class4 method585(int arg0) {
        if (super.field1587 >= 0 && super.field1590 == 0) {
            int var2 = class42.field1219[super.field1587].field1221[super.field1588];
            int var3 = -1;
            if (super.field1550 >= 0 && super.field1599 != super.field1550) {
                var3 = class42.field1219[super.field1550].field1221[super.field1551];
            }
            return this.field1688.method205(426, var2, class42.field1219[super.field1587].field1225, var3);
        } else {
            int var4 = -1;
            if (arg0 != 0) {
                throw new NullPointerException();
            } else {
                if (super.field1550 >= 0) {
                    var4 = class42.field1219[super.field1550].field1221[super.field1551];
                }
                return this.field1688.method205(426, var4, (int[]) null, -1);
            }
        }
    }

    @OriginalMember(owner = "ZLSEKGJR", name = "a", descriptor = "(Z)LCSGBDGDY;")
    public final class4 method187(boolean arg0) {
        if (this.field1688 == null) {
            return null;
        } else {
            class4 var2 = this.method585(this.field1687);
            if (var2 == null) {
                return null;
            } else {
                super.field1606 = var2.field1685;
                if (!arg0) {
                    throw new NullPointerException();
                } else {
                    if (super.field1553 != -1 && super.field1554 != -1) {
                        class11 var3 = class11.field698[super.field1553];
                        class4 var4 = var3.method202();
                        if (var4 != null) {
                            int var5 = var3.field702.field1221[super.field1554];
                            class4 var6 = new class4(true, class25.method285(0, var5), var4, false, (byte) -45);
                            var6.method173(-super.field1557, 0, 0, 625);
                            var6.method167(7);
                            var6.method168(false, var5);
                            var6.field601 = null;
                            var6.field600 = null;
                            if (var3.field705 != 128 || var3.field706 != 128) {
                                var6.method176(var3.field705, var3.field706, var3.field705, 1);
                            }
                            var6.method177(var3.field708 + 64, var3.field709 + 850, -30, -50, -30, true);
                            class4[] var7 = new class4[] { var2, var6 };
                            var2 = new class4(true, 2, var7, true);
                        }
                    }
                    if (this.field1688.field736 == 1) {
                        var2.field602 = true;
                    }
                    return var2;
                }
            }
        }
    }
}
