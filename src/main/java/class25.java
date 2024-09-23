import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JKNLPRIU")
public class class25 extends class54 {

    @OriginalMember(owner = "JKNLPRIU", name = "pb", descriptor = "I")
    private int field869 = -40048;

    @OriginalMember(owner = "JKNLPRIU", name = "qb", descriptor = "Z")
    private boolean field870 = false;

    @OriginalMember(owner = "JKNLPRIU", name = "rb", descriptor = "LJKAPIYZO;")
    public class24 field871;

    @OriginalMember(owner = "JKNLPRIU", name = "b", descriptor = "(B)LWEVRTBOZ;")
    private final class66 method286(byte arg0) {
        if (super.field1382 >= 0 && super.field1385 == 0) {
            int var2 = class47.field1280[super.field1382].field1282[super.field1383];
            int var3 = -1;
            if (super.field1425 >= 0 && super.field1425 != super.field1407) {
                var3 = class47.field1280[super.field1425].field1282[super.field1426];
            }
            return this.field871.method278(false, var2, class47.field1280[super.field1382].field1286, var3);
        } else {
            int var4 = -1;
            if (arg0 != 6) {
                throw new NullPointerException();
            } else {
                if (super.field1425 >= 0) {
                    var4 = class47.field1280[super.field1425].field1282[super.field1426];
                }
                return this.field871.method278(false, var4, (int[]) null, -1);
            }
        }
    }

    @OriginalMember(owner = "JKNLPRIU", name = "a", descriptor = "(Z)LWEVRTBOZ;")
    public final class66 method225(boolean arg0) {
        if (this.field871 == null) {
            return null;
        } else {
            class66 var2 = this.method286((byte) 6);
            if (!arg0) {
                this.field869 = 87;
            }
            if (var2 == null) {
                return null;
            } else {
                super.field1433 = var2.field1085;
                if (super.field1396 != -1 && super.field1397 != -1) {
                    class43 var3 = class43.field1253[super.field1396];
                    class66 var4 = var3.method404();
                    if (var4 != null) {
                        int var5 = var3.field1257.field1282[super.field1397];
                        class66 var6 = new class66(107, var4, class15.method218(var5, true), false, true);
                        var6.method538(-super.field1400, 0, 0, -225);
                        var6.method532((byte) 2);
                        var6.method533(var5, 803);
                        var6.field1618 = null;
                        var6.field1617 = null;
                        if (var3.field1260 != 128 || var3.field1261 != 128) {
                            var6.method541(var3.field1260, var3.field1260, var3.field1261, 49106);
                        }
                        var6.method542(var3.field1263 + 64, var3.field1264 + 850, -30, -50, -30, true);
                        class66[] var7 = new class66[] { var2, var6 };
                        var2 = new class66(var7, true, true, 2);
                    }
                }
                if (this.field871.field854 == 1) {
                    var2.field1619 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "JKNLPRIU", name = "b", descriptor = "(Z)Z")
    public final boolean method287(boolean arg0) {
        if (arg0) {
            this.field870 = !this.field870;
        }
        return this.field871 != null;
    }
}
