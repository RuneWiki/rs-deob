import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AHIOLHWV")
public class class1 extends class12 {

    @OriginalMember(owner = "AHIOLHWV", name = "qb", descriptor = "B")
    private byte field1 = -125;

    @OriginalMember(owner = "AHIOLHWV", name = "rb", descriptor = "Z")
    private boolean field2 = false;

    @OriginalMember(owner = "AHIOLHWV", name = "sb", descriptor = "I")
    private int field3 = 123;

    @OriginalMember(owner = "AHIOLHWV", name = "tb", descriptor = "Z")
    private boolean field4 = true;

    @OriginalMember(owner = "AHIOLHWV", name = "ub", descriptor = "LFWGUGZKU;")
    public class19 field5;

    @OriginalMember(owner = "AHIOLHWV", name = "b", descriptor = "(Z)Z")
    public final boolean method1(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else {
            return this.field5 != null;
        }
    }

    @OriginalMember(owner = "AHIOLHWV", name = "a", descriptor = "(Z)LITSMSHJO;")
    public final class27 method2(boolean arg0) {
        if (!arg0) {
            this.field3 = -201;
        }
        if (this.field5 == null) {
            return null;
        } else {
            class27 var2 = this.method3(-23990);
            if (var2 == null) {
                return null;
            } else {
                super.field604 = var2.field1340;
                if (super.field632 != -1 && super.field633 != -1) {
                    class17 var3 = class17.field725[super.field632];
                    class27 var4 = var3.method206();
                    if (var4 != null) {
                        int var5 = var3.field729.field815[super.field633];
                        class27 var6 = new class27(var4, class49.method401(var5, 0), false, (byte) 85, true);
                        var6.method251(231, 0, 0, -super.field636);
                        var6.method245(0);
                        var6.method246(-1851, var5);
                        var6.field895 = null;
                        var6.field894 = null;
                        if (var3.field732 != 128 || var3.field733 != 128) {
                            var6.method254(var3.field732, var3.field732, var3.field733, 619);
                        }
                        var6.method255(var3.field735 + 64, var3.field736 + 850, -30, -50, -30, true);
                        class27[] var7 = new class27[] { var2, var6 };
                        var2 = new class27(0, true, var7, 2);
                    }
                }
                if (this.field5.field768 == 1) {
                    var2.field896 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "AHIOLHWV", name = "b", descriptor = "(I)LITSMSHJO;")
    private final class27 method3(int arg0) {
        if (arg0 != -23990) {
            this.field4 = !this.field4;
        }
        if (super.field607 >= 0 && super.field610 == 0) {
            int var2 = class24.field813[super.field607].field815[super.field608];
            int var3 = -1;
            if (super.field612 >= 0 && super.field616 != super.field612) {
                var3 = class24.field813[super.field612].field815[super.field613];
            }
            return this.field5.method212(this.field1, var2, class24.field813[super.field607].field819, var3);
        } else {
            int var4 = -1;
            if (super.field612 >= 0) {
                var4 = class24.field813[super.field612].field815[super.field613];
            }
            return this.field5.method212(this.field1, var4, (int[]) null, -1);
        }
    }
}
