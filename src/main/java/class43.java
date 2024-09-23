import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PNBDNSXO")
public class class43 extends class23 {

    @OriginalMember(owner = "PNBDNSXO", name = "sb", descriptor = "Z")
    private boolean field1176 = true;

    @OriginalMember(owner = "PNBDNSXO", name = "rb", descriptor = "I")
    private int field1175;

    @OriginalMember(owner = "PNBDNSXO", name = "tb", descriptor = "LBYABUZFP;")
    public class5 field1177;

    @OriginalMember(owner = "PNBDNSXO", name = "a", descriptor = "(I)LNJPATAFL;")
    public final class35 method206(int arg0) {
        if (this.field1177 == null) {
            return null;
        } else {
            class35 var2 = this.method412(9);
            if (var2 == null) {
                return null;
            } else {
                super.field818 = var2.field887;
                if (arg0 != 9) {
                    this.field1176 = !this.field1176;
                }
                if (super.field845 != -1 && super.field846 != -1) {
                    class55 var3 = class55.field1422[super.field845];
                    class35 var4 = var3.method478();
                    if (var4 != null) {
                        int var5 = var3.field1426.field1455[super.field846];
                        class35 var6 = new class35(class57.method491(var5, this.field1175), false, true, (byte) 45, var4);
                        var6.method347(0, true, 0, -super.field849);
                        var6.method341(9566);
                        var6.method342(true, var5);
                        var6.field1025 = null;
                        var6.field1024 = null;
                        if (var3.field1429 != 128 || var3.field1430 != 128) {
                            var6.method350(var3.field1429, true, var3.field1429, var3.field1430);
                        }
                        var6.method351(var3.field1432 + 64, var3.field1433 + 850, -30, -50, -30, true);
                        class35[] var7 = new class35[] { var2, var6 };
                        var2 = new class35(2, var7, 397, true);
                    }
                }
                if (this.field1177.field57 == 1) {
                    var2.field1026 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "PNBDNSXO", name = "b", descriptor = "(I)Z")
    public final boolean method241(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else {
            return this.field1177 != null;
        }
    }

    @OriginalMember(owner = "PNBDNSXO", name = "c", descriptor = "(I)LNJPATAFL;")
    private final class35 method412(int arg0) {
        if (arg0 < 9 || arg0 > 9) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field808 >= 0 && super.field811 == 0) {
            int var3 = class58.field1453[super.field808].field1455[super.field809];
            int var4 = -1;
            if (super.field821 >= 0 && super.field835 != super.field821) {
                var4 = class58.field1453[super.field821].field1455[super.field822];
            }
            return this.field1177.method28(class58.field1453[super.field808].field1459, var4, var3, 3);
        } else {
            int var5 = -1;
            if (super.field821 >= 0) {
                var5 = class58.field1453[super.field821].field1455[super.field822];
            }
            return this.field1177.method28((int[]) null, -1, var5, 3);
        }
    }
}
