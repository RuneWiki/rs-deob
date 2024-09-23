import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TVKIEQYR")
public class class54 extends class69 {

    @OriginalMember(owner = "TVKIEQYR", name = "qb", descriptor = "Z")
    private boolean field1358 = true;

    @OriginalMember(owner = "TVKIEQYR", name = "rb", descriptor = "LZNUYRYPY;")
    public class71 field1359;

    @OriginalMember(owner = "TVKIEQYR", name = "a", descriptor = "(I)LHEQROJXW;")
    public final class27 method1(int arg0) {
        if (this.field1359 == null) {
            return null;
        } else {
            class27 var2 = this.method528((byte) 6);
            if (arg0 != 8) {
                this.field1358 = !this.field1358;
            }
            if (var2 == null) {
                return null;
            } else {
                super.field1656 = var2.field741;
                if (super.field1661 != -1 && super.field1662 != -1) {
                    class57 var3 = class57.field1384[super.field1661];
                    class27 var4 = var3.method539();
                    if (var4 != null) {
                        int var5 = var3.field1388.field1610[super.field1662];
                        class27 var6 = new class27(-167, false, true, class56.method536(var5, 9643), var4);
                        var6.method335(-super.field1665, 21528, 0, 0);
                        var6.method329(true);
                        var6.method330(var5, 0);
                        var6.field882 = null;
                        var6.field881 = null;
                        if (var3.field1391 != 128 || var3.field1392 != 128) {
                            var6.method338(var3.field1392, 24701, var3.field1391, var3.field1391);
                        }
                        var6.method339(var3.field1394 + 64, var3.field1395 + 850, -30, -50, -30, true);
                        class27[] var7 = new class27[] { var2, var6 };
                        var2 = new class27(true, 2, var7, true);
                    }
                }
                if (this.field1359.field1709 == 1) {
                    var2.field883 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "TVKIEQYR", name = "a", descriptor = "(Z)Z")
    public final boolean method3(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else {
            return this.field1359 != null;
        }
    }

    @OriginalMember(owner = "TVKIEQYR", name = "a", descriptor = "(B)LHEQROJXW;")
    private final class27 method528(byte arg0) {
        if (super.field1689 >= 0 && super.field1692 == 0) {
            int var2 = class66.field1608[super.field1689].field1610[super.field1690];
            int var3 = -1;
            if (super.field1647 >= 0 && super.field1654 != super.field1647) {
                var3 = class66.field1608[super.field1647].field1610[super.field1648];
            }
            return this.field1359.method586(0, class66.field1608[super.field1689].field1614, var3, var2);
        } else {
            int var4 = -1;
            if (arg0 == 6) {
                boolean var5 = false;
            } else {
                for (int var6 = 1; var6 > 0; ++var6) {
                }
            }
            if (super.field1647 >= 0) {
                var4 = class66.field1608[super.field1647].field1610[super.field1648];
            }
            return this.field1359.method586(0, (int[]) null, -1, var4);
        }
    }
}
