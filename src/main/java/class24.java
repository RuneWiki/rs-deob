import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ITIWVLHR")
public class class24 extends class71 {

    @OriginalMember(owner = "client!ITIWVLHR", name = "ob", descriptor = "Z")
    private boolean field874 = true;

    @OriginalMember(owner = "client!ITIWVLHR", name = "pb", descriptor = "Z")
    private boolean field875 = true;

    @OriginalMember(owner = "client!ITIWVLHR", name = "qb", descriptor = "LEKQCVRVG;")
    public class14 field876;

    @OriginalMember(owner = "client!ITIWVLHR", name = "a", descriptor = "(B)Z")
    public final boolean method228(byte arg0) {
        if (arg0 != 43) {
            this.field875 = !this.field875;
        }
        return this.field876 != null;
    }

    @OriginalMember(owner = "client!ITIWVLHR", name = "a", descriptor = "(Z)LWRJMHIDY;")
    public final class61 method174(boolean arg0) {
        if (this.field876 == null) {
            return null;
        } else {
            class61 var2 = this.method229(true);
            if (arg0) {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
            if (var2 == null) {
                return null;
            } else {
                super.field1730 = var2.field726;
                if (super.field1736 != -1 && super.field1737 != -1) {
                    class55 var4 = class55.field1321[super.field1736];
                    class61 var5 = var4.method444();
                    if (var5 != null) {
                        int var6 = var4.field1325.field965[super.field1737];
                        class61 var7 = new class61(var5, true, false, class44.method338(var6, (byte) 6), (byte) 0);
                        var7.method479(0, true, 0, -super.field1740);
                        var7.method473(39018);
                        var7.method474(false, var6);
                        var7.field1478 = null;
                        var7.field1477 = null;
                        if (var4.field1328 != 128 || var4.field1329 != 128) {
                            var7.method482(this.field874, var4.field1328, var4.field1328, var4.field1329);
                        }
                        var7.method483(var4.field1331 + 64, var4.field1332 + 850, -30, -50, -30, true);
                        class61[] var8 = new class61[] { var2, var7 };
                        var2 = new class61(-8047, true, 2, var8);
                    }
                }
                if (this.field876.field691 == 1) {
                    var2.field1479 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!ITIWVLHR", name = "b", descriptor = "(Z)LWRJMHIDY;")
    private final class61 method229(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        } else if (super.field1743 >= 0 && super.field1746 == 0) {
            int var2 = class33.field963[super.field1743].field965[super.field1744];
            int var3 = -1;
            if (super.field1731 >= 0 && super.field1731 != super.field1711) {
                var3 = class33.field963[super.field1731].field965[super.field1732];
            }
            return this.field876.method198(false, var2, var3, class33.field963[super.field1743].field969);
        } else {
            int var4 = -1;
            if (super.field1731 >= 0) {
                var4 = class33.field963[super.field1731].field965[super.field1732];
            }
            return this.field876.method198(false, var4, -1, (int[]) null);
        }
    }
}
