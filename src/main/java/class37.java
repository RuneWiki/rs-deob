import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OTOMPFCI")
public class class37 extends class5 {

    @OriginalMember(owner = "OTOMPFCI", name = "sb", descriptor = "Z")
    private boolean field1042 = false;

    @OriginalMember(owner = "OTOMPFCI", name = "tb", descriptor = "Z")
    private boolean field1043 = true;

    @OriginalMember(owner = "OTOMPFCI", name = "ub", descriptor = "LWHKCNEXD;")
    public class60 field1044;

    @OriginalMember(owner = "OTOMPFCI", name = "a", descriptor = "(Z)LYABPKWWG;")
    public final class67 method16(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field1044 == null) {
            return null;
        } else {
            class67 var3 = this.method378(0);
            if (var3 == null) {
                return null;
            } else {
                super.field57 = var3.field37;
                if (super.field82 != -1 && super.field83 != -1) {
                    class9 var4 = class9.field136[super.field82];
                    class67 var5 = var4.method32();
                    if (var5 != null) {
                        int var6 = var4.field140.field1707[super.field83];
                        class67 var7 = new class67(660, var5, class22.method219(var6, true), true, false);
                        var7.method561(0, 0, -super.field86, 7);
                        var7.method555((byte) 45);
                        var7.method556(598, var6);
                        var7.field1647 = null;
                        var7.field1646 = null;
                        if (var4.field143 != 128 || var4.field144 != 128) {
                            var7.method564(var4.field144, var4.field143, (byte) -46, var4.field143);
                        }
                        var7.method565(var4.field146 + 64, var4.field147 + 850, -30, -50, -30, true);
                        class67[] var8 = new class67[] { var3, var7 };
                        var3 = new class67(2, var8, 0, true);
                    }
                }
                if (this.field1044.field1560 == 1) {
                    var3.field1648 = true;
                }
                return var3;
            }
        }
    }

    @OriginalMember(owner = "OTOMPFCI", name = "b", descriptor = "(I)Z")
    public final boolean method21(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field1044 != null;
    }

    @OriginalMember(owner = "OTOMPFCI", name = "c", descriptor = "(I)LYABPKWWG;")
    private final class67 method378(int arg0) {
        if (super.field41 >= 0 && super.field44 == 0) {
            int var2 = class71.field1705[super.field41].field1707[super.field42];
            int var3 = -1;
            if (super.field67 >= 0 && super.field90 != super.field67) {
                var3 = class71.field1705[super.field67].field1707[super.field68];
            }
            return this.field1044.method520(class71.field1705[super.field41].field1711, false, var2, var3);
        } else {
            int var4 = -1;
            if (arg0 != 0) {
                this.field1042 = !this.field1042;
            }
            if (super.field67 >= 0) {
                var4 = class71.field1705[super.field67].field1707[super.field68];
            }
            return this.field1044.method520((int[]) null, false, var4, -1);
        }
    }
}
