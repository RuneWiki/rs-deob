import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ACKJULTZ")
public class class1 extends class27 {

    @OriginalMember(owner = "client!ACKJULTZ", name = "pb", descriptor = "I")
    private int field1 = 964;

    @OriginalMember(owner = "client!ACKJULTZ", name = "qb", descriptor = "LLQFHJGYA;")
    public class30 field2;

    @OriginalMember(owner = "client!ACKJULTZ", name = "c", descriptor = "(B)Z")
    public final boolean method1(byte arg0) {
        if (arg0 == 9) {
            boolean var2 = false;
        } else {
            this.field1 = -21;
        }
        return this.field2 != null;
    }

    @OriginalMember(owner = "client!ACKJULTZ", name = "a", descriptor = "(Z)LPDVZPZLT;")
    private final class42 method2(boolean arg0) {
        if (super.field933 >= 0 && super.field936 == 0) {
            int var2 = class28.field952[super.field933].field954[super.field934];
            int var3 = -1;
            if (super.field946 >= 0 && super.field946 != super.field942) {
                var3 = class28.field952[super.field946].field954[super.field947];
            }
            return this.field2.method317(class28.field952[super.field933].field958, (byte) -57, var2, var3);
        } else {
            int var4 = -1;
            if (arg0) {
                for (int var5 = 1; var5 > 0; ++var5) {
                }
            }
            if (super.field946 >= 0) {
                var4 = class28.field952[super.field946].field954[super.field947];
            }
            return this.field2.method317((int[]) null, (byte) -57, var4, -1);
        }
    }

    @OriginalMember(owner = "client!ACKJULTZ", name = "a", descriptor = "(B)LPDVZPZLT;")
    public final class42 method3(byte arg0) {
        if (this.field2 == null) {
            return null;
        } else {
            class42 var2 = this.method2(false);
            if (var2 == null) {
                return null;
            } else {
                super.field894 = var2.field1695;
                if (arg0 != 6) {
                    throw new NullPointerException();
                } else {
                    if (super.field900 != -1 && super.field901 != -1) {
                        class34 var3 = class34.field1053[super.field900];
                        class42 var4 = var3.method343();
                        if (var4 != null) {
                            int var5 = var3.field1057.field954[super.field901];
                            class42 var6 = new class42(var4, true, class71.method602(var5, true), 0, false);
                            var6.method427(0, 0, -super.field904, 0);
                            var6.method421(0);
                            var6.method422(0, var5);
                            var6.field1328 = null;
                            var6.field1327 = null;
                            if (var3.field1060 != 128 || var3.field1061 != 128) {
                                var6.method430(var3.field1060, var3.field1061, var3.field1060, (byte) 6);
                            }
                            var6.method431(var3.field1063 + 64, var3.field1064 + 850, -30, -50, -30, true);
                            class42[] var7 = new class42[] { var2, var6 };
                            var2 = new class42(7, var7, true, 2);
                        }
                    }
                    if (this.field2.field1005 == 1) {
                        var2.field1329 = true;
                    }
                    return var2;
                }
            }
        }
    }
}
