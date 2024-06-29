import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GYKYBIID")
public class class15 extends class21 {

    @OriginalMember(owner = "client!GYKYBIID", name = "qb", descriptor = "I")
    private int field707 = 41952;

    @OriginalMember(owner = "client!GYKYBIID", name = "rb", descriptor = "Z")
    private boolean field708 = false;

    @OriginalMember(owner = "client!GYKYBIID", name = "pb", descriptor = "I")
    private int field706;

    @OriginalMember(owner = "client!GYKYBIID", name = "sb", descriptor = "LYANZSPIT;")
    public class66 field709;

    @OriginalMember(owner = "client!GYKYBIID", name = "c", descriptor = "(I)LKDWDYCIL;")
    private final class25 method199(int arg0) {
        if (super.field813 >= 0 && super.field816 == 0) {
            int var2 = class30.field982[super.field813].field984[super.field814];
            int var3 = -1;
            if (super.field808 >= 0 && super.field808 != super.field788) {
                var3 = class30.field982[super.field808].field984[super.field809];
            }
            return this.field709.method561(class30.field982[super.field813].field988, var2, 4318, var3);
        } else {
            int var4 = -1;
            if (arg0 <= 0) {
                this.field706 = 414;
            }
            if (super.field808 >= 0) {
                var4 = class30.field982[super.field808].field984[super.field809];
            }
            return this.field709.method561((int[]) null, var4, 4318, -1);
        }
    }

    @OriginalMember(owner = "client!GYKYBIID", name = "a", descriptor = "(I)LKDWDYCIL;")
    public final class25 method185(int arg0) {
        if (arg0 >= 9 && arg0 <= 9) {
            if (this.field709 == null) {
                return null;
            } else {
                class25 var2 = this.method199(778);
                if (var2 == null) {
                    return null;
                } else {
                    super.field790 = var2.field758;
                    if (super.field818 != -1 && super.field819 != -1) {
                        class45 var3 = class45.field1307[super.field818];
                        class25 var4 = var3.method413();
                        if (var4 != null) {
                            int var5 = var3.field1311.field984[super.field819];
                            class25 var6 = new class25((byte) -48, false, var4, class48.method423(var5, this.field707), true);
                            var6.method259(0, true, -super.field822, 0);
                            var6.method253(0);
                            var6.method254(var5, 151);
                            var6.field907 = null;
                            var6.field906 = null;
                            if (var3.field1314 != 128 || var3.field1315 != 128) {
                                var6.method262((byte) 3, var3.field1314, var3.field1314, var3.field1315);
                            }
                            var6.method263(var3.field1317 + 64, var3.field1318 + 850, -30, -50, -30, true);
                            class25[] var7 = new class25[] { var2, var6 };
                            var2 = new class25(var7, 2, true, -234);
                        }
                    }
                    if (this.field709.field1616 == 1) {
                        var2.field908 = true;
                    }
                    return var2;
                }
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!GYKYBIID", name = "a", descriptor = "(Z)Z")
    public final boolean method188(boolean arg0) {
        if (!arg0) {
            this.field708 = !this.field708;
        }
        return this.field709 != null;
    }
}
