import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KPZIZBER")
public class class32 extends class8 {

    @OriginalMember(owner = "client!KPZIZBER", name = "rb", descriptor = "Z")
    private boolean field1027 = false;

    @OriginalMember(owner = "client!KPZIZBER", name = "sb", descriptor = "LNIJEYEOX;")
    public class39 field1028;

    @OriginalMember(owner = "client!KPZIZBER", name = "a", descriptor = "(B)LJJMVUSJJ;")
    public final class29 method214(byte arg0) {
        if (this.field1028 == null) {
            return null;
        } else {
            class29 var2 = this.method331(0);
            if (var2 == null) {
                return null;
            } else {
                super.field613 = var2.field1525;
                if (arg0 != 7) {
                    this.field1027 = !this.field1027;
                }
                if (super.field601 != -1 && super.field602 != -1) {
                    class12 var3 = class12.field683[super.field601];
                    class29 var4 = var3.method210();
                    if (var4 != null) {
                        int var5 = var3.field687.field1630[super.field602];
                        class29 var6 = new class29(true, class42.method382(var5, 4), false, 9, var4);
                        var6.method313(0, 161, -super.field605, 0);
                        var6.method307(979);
                        var6.method308(var5, 771);
                        var6.field953 = null;
                        var6.field952 = null;
                        if (var3.field690 != 128 || var3.field691 != 128) {
                            var6.method316(var3.field691, var3.field690, var3.field690, true);
                        }
                        var6.method317(var3.field693 + 64, var3.field694 + 850, -30, -50, -30, true);
                        class29[] var7 = new class29[] { var2, var6 };
                        var2 = new class29(var7, 976, 2, true);
                    }
                }
                if (this.field1028.field1211 == 1) {
                    var2.field954 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!KPZIZBER", name = "b", descriptor = "(I)LJJMVUSJJ;")
    private final class29 method331(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field615 >= 0 && super.field618 == 0) {
            int var3 = class65.field1628[super.field615].field1630[super.field616];
            int var4 = -1;
            if (super.field634 >= 0 && super.field634 != super.field607) {
                var4 = class65.field1628[super.field634].field1630[super.field635];
            }
            return this.field1028.method368(var3, var4, -768, class65.field1628[super.field615].field1634);
        } else {
            int var5 = -1;
            if (super.field634 >= 0) {
                var5 = class65.field1628[super.field634].field1630[super.field635];
            }
            return this.field1028.method368(var5, -1, -768, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!KPZIZBER", name = "a", descriptor = "(I)Z")
    public final boolean method203(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else {
            return this.field1028 != null;
        }
    }
}
