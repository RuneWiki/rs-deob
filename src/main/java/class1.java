import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ADGLALPC")
public class class1 extends class61 {

    @OriginalMember(owner = "ADGLALPC", name = "rb", descriptor = "I")
    private int field1;

    @OriginalMember(owner = "ADGLALPC", name = "sb", descriptor = "LOMIIKHIV;")
    public class47 field2;

    @OriginalMember(owner = "ADGLALPC", name = "a", descriptor = "(I)LLFTMDGKK;")
    public final class37 method1(int arg0) {
        if (this.field2 == null) {
            return null;
        } else {
            class37 var2 = this.method3(true);
            if (arg0 != 0) {
                throw new NullPointerException();
            } else if (var2 == null) {
                return null;
            } else {
                super.field1563 = var2.field582;
                if (super.field1527 != -1 && super.field1528 != -1) {
                    class4 var3 = class4.field15[super.field1527];
                    class37 var4 = var3.method11();
                    if (var4 != null) {
                        int var5 = var3.field19.field818[super.field1528];
                        class37 var6 = new class37(class7.method17(var5, false), true, var4, false, false);
                        var6.method354(-super.field1531, (byte) 24, 0, 0);
                        var6.method348(false);
                        var6.method349(var5, (byte) 89);
                        var6.field999 = null;
                        var6.field998 = null;
                        if (var3.field22 != 128 || var3.field23 != 128) {
                            var6.method357(5, var3.field23, var3.field22, var3.field22);
                        }
                        var6.method358(var3.field25 + 64, var3.field26 + 850, -30, -50, -30, true);
                        class37[] var7 = new class37[] { var2, var6 };
                        var2 = new class37(true, var7, false, 2);
                    }
                }
                if (this.field2.field1190 == 1) {
                    var2.field1000 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "ADGLALPC", name = "b", descriptor = "(Z)Z")
    public final boolean method2(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else {
            return this.field2 != null;
        }
    }

    @OriginalMember(owner = "ADGLALPC", name = "c", descriptor = "(Z)LLFTMDGKK;")
    private final class37 method3(boolean arg0) {
        if (!arg0) {
            this.field1 = 221;
        }
        if (super.field1571 >= 0 && super.field1574 == 0) {
            int var2 = class32.field816[super.field1571].field818[super.field1572];
            int var3 = -1;
            if (super.field1578 >= 0 && super.field1578 != super.field1566) {
                var3 = class32.field816[super.field1578].field818[super.field1579];
            }
            return this.field2.method445(class32.field816[super.field1571].field822, true, var3, var2);
        } else {
            int var4 = -1;
            if (super.field1578 >= 0) {
                var4 = class32.field816[super.field1578].field818[super.field1579];
            }
            return this.field2.method445((int[]) null, true, -1, var4);
        }
    }
}
