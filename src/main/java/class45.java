import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RLTBSHTA")
public class class45 extends class36 {

    @OriginalMember(owner = "client!RLTBSHTA", name = "sb", descriptor = "Z")
    private boolean field1256 = false;

    @OriginalMember(owner = "client!RLTBSHTA", name = "tb", descriptor = "B")
    private byte field1257 = 0;

    @OriginalMember(owner = "client!RLTBSHTA", name = "ub", descriptor = "Z")
    private boolean field1258 = true;

    @OriginalMember(owner = "client!RLTBSHTA", name = "vb", descriptor = "LZLQCXMFK;")
    public class67 field1259;

    @OriginalMember(owner = "client!RLTBSHTA", name = "a", descriptor = "(Z)Z")
    public final boolean method342(boolean arg0) {
        if (arg0) {
            this.field1256 = !this.field1256;
        }
        return this.field1259 != null;
    }

    @OriginalMember(owner = "client!RLTBSHTA", name = "c", descriptor = "(I)LIEHKDFMR;")
    private final class18 method389(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field1064 >= 0 && super.field1067 == 0) {
            int var3 = class55.field1444[super.field1064].field1446[super.field1065];
            int var4 = -1;
            if (super.field1078 >= 0 && super.field1078 != super.field1040) {
                var4 = class55.field1444[super.field1078].field1446[super.field1079];
            }
            return this.field1259.method512(var4, class55.field1444[super.field1064].field1450, var3, (byte) -26);
        } else {
            int var5 = -1;
            if (super.field1078 >= 0) {
                var5 = class55.field1444[super.field1078].field1446[super.field1079];
            }
            return this.field1259.method512(-1, (int[]) null, var5, (byte) -26);
        }
    }

    @OriginalMember(owner = "client!RLTBSHTA", name = "a", descriptor = "(I)LIEHKDFMR;")
    public final class18 method24(int arg0) {
        if (this.field1259 == null) {
            return null;
        } else {
            class18 var2 = this.method389(0);
            if (var2 == null) {
                return null;
            } else {
                super.field1033 = var2.field680;
                if (arg0 != 0) {
                    this.field1258 = !this.field1258;
                }
                if (super.field1042 != -1 && super.field1043 != -1) {
                    class47 var3 = class47.field1276[super.field1042];
                    class18 var4 = var3.method396();
                    if (var4 != null) {
                        int var5 = var3.field1280.field1446[super.field1043];
                        class18 var6 = new class18(false, (byte) 1, class33.method337(this.field1257, var5), var4, true);
                        var6.method280(0, 0, -super.field1046, -530);
                        var6.method274(false);
                        var6.method275((byte) 9, var5);
                        var6.field798 = null;
                        var6.field797 = null;
                        if (var3.field1283 != 128 || var3.field1284 != 128) {
                            var6.method283(var3.field1283, var3.field1284, 42667, var3.field1283);
                        }
                        var6.method284(var3.field1286 + 64, var3.field1287 + 850, -30, -50, -30, true);
                        class18[] var7 = new class18[] { var2, var6 };
                        var2 = new class18((byte) -29, true, 2, var7);
                    }
                }
                if (this.field1259.field1625 == 1) {
                    var2.field799 = true;
                }
                return var2;
            }
        }
    }
}
