import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YQBVAFEO")
public class class70 extends class16 {

    @OriginalMember(owner = "client!YQBVAFEO", name = "nb", descriptor = "I")
    private int field1733 = 9;

    @OriginalMember(owner = "client!YQBVAFEO", name = "ob", descriptor = "B")
    private byte field1734 = -8;

    @OriginalMember(owner = "client!YQBVAFEO", name = "pb", descriptor = "Z")
    private boolean field1735 = false;

    @OriginalMember(owner = "client!YQBVAFEO", name = "qb", descriptor = "LPFWIJTDA;")
    public class45 field1736;

    @OriginalMember(owner = "client!YQBVAFEO", name = "b", descriptor = "(I)Z")
    public final boolean method166(int arg0) {
        if (arg0 < 5 || arg0 > 5) {
            this.field1733 = -74;
        }
        return this.field1736 != null;
    }

    @OriginalMember(owner = "client!YQBVAFEO", name = "a", descriptor = "(I)LIRLTEWJP;")
    public final class26 method168(int arg0) {
        if (this.field1736 == null) {
            return null;
        } else {
            class26 var2 = this.method603(-390);
            if (var2 == null) {
                return null;
            } else {
                super.field680 = var2.field794;
                if (arg0 >= 0) {
                    this.field1735 = !this.field1735;
                }
                if (super.field710 != -1 && super.field711 != -1) {
                    class44 var3 = class44.field1269[super.field710];
                    class26 var4 = var3.method435();
                    if (var4 != null) {
                        int var5 = var3.field1273.field1338[super.field711];
                        class26 var6 = new class26(var4, false, 0, class17.method211(var5, 47525), true);
                        var6.method294(0, 0, (byte) 96, -super.field714);
                        var6.method288(49427);
                        var6.method289(var5, true);
                        var6.field1023 = null;
                        var6.field1022 = null;
                        if (var3.field1276 != 128 || var3.field1277 != 128) {
                            var6.method297(var3.field1276, this.field1734, var3.field1277, var3.field1276);
                        }
                        var6.method298(var3.field1279 + 64, var3.field1280 + 850, -30, -50, -30, true);
                        class26[] var7 = new class26[] { var2, var6 };
                        var2 = new class26(true, 2, 163, var7);
                    }
                }
                if (this.field1736.field1300 == 1) {
                    var2.field1024 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!YQBVAFEO", name = "c", descriptor = "(I)LIRLTEWJP;")
    private final class26 method603(int arg0) {
        while (arg0 >= 0) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (super.field693 >= 0 && super.field696 == 0) {
            int var2 = class47.field1336[super.field693].field1338[super.field694];
            int var3 = -1;
            if (super.field668 >= 0 && super.field716 != super.field668) {
                var3 = class47.field1336[super.field668].field1338[super.field669];
            }
            return this.field1736.method440(class47.field1336[super.field693].field1342, var3, var2, 670);
        } else {
            int var4 = -1;
            if (super.field668 >= 0) {
                var4 = class47.field1336[super.field668].field1338[super.field669];
            }
            return this.field1736.method440((int[]) null, -1, var4, 670);
        }
    }
}
