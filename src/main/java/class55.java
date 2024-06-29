import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UGARWYIU")
public class class55 extends class48 {

    @OriginalMember(owner = "client!UGARWYIU", name = "nb", descriptor = "I")
    private int field1420 = 932;

    @OriginalMember(owner = "client!UGARWYIU", name = "ob", descriptor = "Z")
    private boolean field1421 = true;

    @OriginalMember(owner = "client!UGARWYIU", name = "pb", descriptor = "LBJGOYLYN;")
    public class2 field1422;

    @OriginalMember(owner = "client!UGARWYIU", name = "b", descriptor = "(B)Z")
    public final boolean method408(byte arg0) {
        if (arg0 != 8) {
            this.field1421 = !this.field1421;
        }
        return this.field1422 != null;
    }

    @OriginalMember(owner = "client!UGARWYIU", name = "c", descriptor = "(B)LUNLYQRUD;")
    private final class56 method437(byte arg0) {
        if (super.field1311 >= 0 && super.field1314 == 0) {
            int var2 = class41.field1147[super.field1311].field1149[super.field1312];
            int var3 = -1;
            if (super.field1348 >= 0 && super.field1348 != super.field1298) {
                var3 = class41.field1147[super.field1348].field1149[super.field1349];
            }
            return this.field1422.method2(var3, class41.field1147[super.field1311].field1153, var2, false);
        } else {
            int var4 = -1;
            if (arg0 != 103) {
                throw new NullPointerException();
            } else {
                if (super.field1348 >= 0) {
                    var4 = class41.field1147[super.field1348].field1149[super.field1349];
                }
                return this.field1422.method2(-1, (int[]) null, var4, false);
            }
        }
    }

    @OriginalMember(owner = "client!UGARWYIU", name = "a", descriptor = "(B)LUNLYQRUD;")
    public final class56 method10(byte arg0) {
        if (this.field1422 == null) {
            return null;
        } else {
            class56 var2 = this.method437((byte) 103);
            if (arg0 != 93) {
                throw new NullPointerException();
            } else if (var2 == null) {
                return null;
            } else {
                super.field1300 = var2.field55;
                if (super.field1319 != -1 && super.field1320 != -1) {
                    class54 var3 = class54.field1407[super.field1319];
                    class56 var4 = var3.method436();
                    if (var4 != null) {
                        int var5 = var3.field1411.field1149[super.field1320];
                        class56 var6 = new class56(true, var4, false, 8, class6.method178(var5, 688));
                        var6.method455(-super.field1323, (byte) 4, 0, 0);
                        var6.method449(956);
                        var6.method450(936, var5);
                        var6.field1466 = null;
                        var6.field1465 = null;
                        if (var3.field1414 != 128 || var3.field1415 != 128) {
                            var6.method458(var3.field1414, var3.field1415, false, var3.field1414);
                        }
                        var6.method459(var3.field1417 + 64, var3.field1418 + 850, -30, -50, -30, true);
                        class56[] var7 = new class56[] { var2, var6 };
                        var2 = new class56(2, this.field1420, var7, true);
                    }
                }
                if (this.field1422.field29 == 1) {
                    var2.field1467 = true;
                }
                return var2;
            }
        }
    }
}
