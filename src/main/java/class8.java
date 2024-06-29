import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DWBMCYCE")
public class class8 extends class64 {

    @OriginalMember(owner = "client!DWBMCYCE", name = "ub", descriptor = "I")
    private int field593 = -479;

    @OriginalMember(owner = "client!DWBMCYCE", name = "vb", descriptor = "LAPPQAEOL;")
    public class2 field594;

    @OriginalMember(owner = "client!DWBMCYCE", name = "c", descriptor = "(I)LJUQSYEMB;")
    private final class22 method165(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else if (super.field1563 >= 0 && super.field1566 == 0) {
            int var2 = class27.field923[super.field1563].field925[super.field1564];
            int var3 = -1;
            if (super.field1540 >= 0 && super.field1579 != super.field1540) {
                var3 = class27.field923[super.field1540].field925[super.field1541];
            }
            return this.field594.method7(var3, (byte) -48, class27.field923[super.field1563].field929, var2);
        } else {
            int var4 = -1;
            if (super.field1540 >= 0) {
                var4 = class27.field923[super.field1540].field925[super.field1541];
            }
            return this.field594.method7(-1, (byte) -48, (int[]) null, var4);
        }
    }

    @OriginalMember(owner = "client!DWBMCYCE", name = "b", descriptor = "(I)Z")
    public final boolean method166(int arg0) {
        if (arg0 != 9382) {
            throw new NullPointerException();
        } else {
            return this.field594 != null;
        }
    }

    @OriginalMember(owner = "client!DWBMCYCE", name = "a", descriptor = "(I)LJUQSYEMB;")
    public final class22 method167(int arg0) {
        if (this.field594 == null) {
            return null;
        } else {
            class22 var2 = this.method165(484);
            if (var2 == null) {
                return null;
            } else {
                super.field1555 = var2.field1212;
                int var3 = 83 / arg0;
                if (super.field1545 != -1 && super.field1546 != -1) {
                    class41 var4 = class41.field1131[super.field1545];
                    class22 var5 = var4.method414();
                    if (var5 != null) {
                        int var6 = var4.field1135.field925[super.field1546];
                        class22 var7 = new class22(false, true, (byte) 119, var5, class69.method579(true, var6));
                        var7.method225(0, true, 0, -super.field1549);
                        var7.method219(301);
                        var7.method220(true, var6);
                        var7.field800 = null;
                        var7.field799 = null;
                        if (var4.field1138 != 128 || var4.field1139 != 128) {
                            var7.method228(var4.field1138, var4.field1139, var4.field1138, this.field593);
                        }
                        var7.method229(var4.field1141 + 64, var4.field1142 + 850, -30, -50, -30, true);
                        class22[] var8 = new class22[] { var2, var7 };
                        var2 = new class22(true, var8, -889, 2);
                    }
                }
                if (this.field594.field11 == 1) {
                    var2.field801 = true;
                }
                return var2;
            }
        }
    }
}
