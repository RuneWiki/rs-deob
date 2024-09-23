import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QDXHSLSL")
public class class46 extends class58 {

    @OriginalMember(owner = "QDXHSLSL", name = "pb", descriptor = "Z")
    private boolean field1135 = false;

    @OriginalMember(owner = "QDXHSLSL", name = "qb", descriptor = "B")
    private byte field1136 = 1;

    @OriginalMember(owner = "QDXHSLSL", name = "rb", descriptor = "Z")
    private boolean field1137 = false;

    @OriginalMember(owner = "QDXHSLSL", name = "sb", descriptor = "Z")
    private boolean field1138 = false;

    @OriginalMember(owner = "QDXHSLSL", name = "tb", descriptor = "I")
    private int field1139 = -938;

    @OriginalMember(owner = "QDXHSLSL", name = "ub", descriptor = "LLPTCUHOU;")
    public class36 field1140;

    @OriginalMember(owner = "QDXHSLSL", name = "a", descriptor = "(I)LVHYCWIPJ;")
    public final class53 method217(int arg0) {
        if (this.field1140 == null) {
            return null;
        } else {
            class53 var2 = this.method409(-938);
            if (arg0 >= 0) {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
            if (var2 == null) {
                return null;
            } else {
                super.field1482 = var2.field1124;
                if (super.field1490 != -1 && super.field1491 != -1) {
                    class64 var4 = class64.field1620[super.field1490];
                    class53 var5 = var4.method579();
                    if (var5 != null) {
                        int var6 = var4.field1624.field1540[super.field1491];
                        class53 var7 = new class53((byte) 9, class51.method489(var6, this.field1136), true, false, var5);
                        var7.method513(0, 0, 0, -super.field1494);
                        var7.method507(0);
                        var7.method508(999, var6);
                        var7.field1411 = null;
                        var7.field1410 = null;
                        if (var4.field1627 != 128 || var4.field1628 != 128) {
                            var7.method516(this.field1135, var4.field1627, var4.field1627, var4.field1628);
                        }
                        var7.method517(var4.field1630 + 64, var4.field1631 + 850, -30, -50, -30, true);
                        class53[] var8 = new class53[] { var2, var7 };
                        var2 = new class53(2, true, 7, var8);
                    }
                }
                if (this.field1140.field1037 == 1) {
                    var2.field1412 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "QDXHSLSL", name = "a", descriptor = "(B)Z")
    public final boolean method404(byte arg0) {
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            this.field1137 = !this.field1137;
        }
        return this.field1140 != null;
    }

    @OriginalMember(owner = "QDXHSLSL", name = "b", descriptor = "(I)LVHYCWIPJ;")
    private final class53 method409(int arg0) {
        if (super.field1524 >= 0 && super.field1527 == 0) {
            int var2 = class59.field1538[super.field1524].field1540[super.field1525];
            int var3 = -1;
            if (super.field1533 >= 0 && super.field1533 != super.field1484) {
                var3 = class59.field1538[super.field1533].field1540[super.field1534];
            }
            return this.field1140.method382(class59.field1538[super.field1524].field1544, var3, 14442, var2);
        } else {
            int var4 = -1;
            if (arg0 >= 0) {
                this.field1138 = !this.field1138;
            }
            if (super.field1533 >= 0) {
                var4 = class59.field1538[super.field1533].field1540[super.field1534];
            }
            return this.field1140.method382((int[]) null, -1, 14442, var4);
        }
    }
}
