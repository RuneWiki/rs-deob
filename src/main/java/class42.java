import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PDAYFSBN")
public class class42 extends class55 {

    @OriginalMember(owner = "PDAYFSBN", name = "rb", descriptor = "I")
    private int field1081 = -47097;

    @OriginalMember(owner = "PDAYFSBN", name = "sb", descriptor = "LYIBRLAQY;")
    public class70 field1082;

    @OriginalMember(owner = "PDAYFSBN", name = "a", descriptor = "(I)LPSGMMDJS;")
    public final class45 method196(int arg0) {
        if (arg0 != 27243) {
            throw new NullPointerException();
        } else if (this.field1082 == null) {
            return null;
        } else {
            class45 var2 = this.method317(-3861);
            if (var2 == null) {
                return null;
            } else {
                super.field1448 = var2.field1520;
                if (super.field1464 != -1 && super.field1465 != -1) {
                    class23 var3 = class23.field866[super.field1464];
                    class45 var4 = var3.method251();
                    if (var4 != null) {
                        int var5 = var3.field870.field658[super.field1465];
                        class45 var6 = new class45(var4, -42752, class3.method5((byte) 2, var5), true, false);
                        var6.method423(-super.field1468, 0, 0, -20378);
                        var6.method417(true);
                        var6.method418(0, var5);
                        var6.field1182 = null;
                        var6.field1181 = null;
                        if (var3.field873 != 128 || var3.field874 != 128) {
                            var6.method426(var3.field874, var3.field873, var3.field873, 34836);
                        }
                        var6.method427(var3.field876 + 64, var3.field877 + 850, -30, -50, -30, true);
                        class45[] var7 = new class45[] { var2, var6 };
                        var2 = new class45(2, var7, true, true);
                    }
                }
                if (this.field1082.field1690 == 1) {
                    var2.field1183 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "PDAYFSBN", name = "a", descriptor = "(B)Z")
    public final boolean method316(byte arg0) {
        if (arg0 != 127) {
            this.field1081 = 489;
        }
        return this.field1082 != null;
    }

    @OriginalMember(owner = "PDAYFSBN", name = "b", descriptor = "(I)LPSGMMDJS;")
    private final class45 method317(int arg0) {
        if (arg0 != -3861) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field1427 >= 0 && super.field1430 == 0) {
            int var3 = class14.field656[super.field1427].field658[super.field1428];
            int var4 = -1;
            if (super.field1456 >= 0 && super.field1456 != super.field1419) {
                var4 = class14.field656[super.field1456].field658[super.field1457];
            }
            return this.field1082.method581(var3, var4, class14.field656[super.field1427].field662, this.field1081);
        } else {
            int var5 = -1;
            if (super.field1456 >= 0) {
                var5 = class14.field656[super.field1456].field658[super.field1457];
            }
            return this.field1082.method581(var5, -1, (int[]) null, this.field1081);
        }
    }
}
