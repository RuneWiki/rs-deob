import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PVFNGMTQ")
public class class47 extends class10 {

    @OriginalMember(owner = "client!PVFNGMTQ", name = "sb", descriptor = "I")
    private int field1407 = -25668;

    @OriginalMember(owner = "client!PVFNGMTQ", name = "tb", descriptor = "Z")
    private boolean field1408 = true;

    @OriginalMember(owner = "client!PVFNGMTQ", name = "ub", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client!PVFNGMTQ", name = "vb", descriptor = "LPJGEBWSY;")
    public class46 field1410;

    @OriginalMember(owner = "client!PVFNGMTQ", name = "b", descriptor = "(I)Z")
    public final boolean method42(int arg0) {
        if (arg0 != 5) {
            this.field1409 = -404;
        }
        return this.field1410 != null;
    }

    @OriginalMember(owner = "client!PVFNGMTQ", name = "a", descriptor = "(I)LFCIDIKVY;")
    public final class19 method187(int arg0) {
        if (this.field1410 == null) {
            return null;
        } else {
            class19 var2 = this.method397((byte) 8);
            if (arg0 != 0) {
                this.field1407 = 314;
            }
            if (var2 == null) {
                return null;
            } else {
                super.field209 = var2.field735;
                if (super.field182 != -1 && super.field183 != -1) {
                    class63 var3 = class63.field1652[super.field182];
                    class19 var4 = var3.method563();
                    if (var4 != null) {
                        int var5 = var3.field1656.field1695[super.field183];
                        class19 var6 = new class19(false, class21.method235(var5, 12073), true, var4, true);
                        var6.method212((byte) -36, 0, -super.field186, 0);
                        var6.method206(8);
                        var6.method207(var5, (byte) -14);
                        var6.field799 = null;
                        var6.field798 = null;
                        if (var3.field1659 != 128 || var3.field1660 != 128) {
                            var6.method215(var3.field1659, var3.field1659, this.field1408, var3.field1660);
                        }
                        var6.method216(var3.field1662 + 64, var3.field1663 + 850, -30, -50, -30, true);
                        class19[] var7 = new class19[] { var2, var6 };
                        var2 = new class19(true, var7, true, 2);
                    }
                }
                if (this.field1410.field1390 == 1) {
                    var2.field800 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!PVFNGMTQ", name = "a", descriptor = "(B)LFCIDIKVY;")
    private final class19 method397(byte arg0) {
        if (super.field202 >= 0 && super.field205 == 0) {
            int var2 = class66.field1693[super.field202].field1695[super.field203];
            int var3 = -1;
            if (super.field162 >= 0 && super.field215 != super.field162) {
                var3 = class66.field1693[super.field162].field1695[super.field163];
            }
            return this.field1410.method396(class66.field1693[super.field202].field1699, 0, var2, var3);
        } else {
            int var4 = -1;
            if (arg0 != 8) {
                throw new NullPointerException();
            } else {
                if (super.field162 >= 0) {
                    var4 = class66.field1693[super.field162].field1695[super.field163];
                }
                return this.field1410.method396((int[]) null, 0, var4, -1);
            }
        }
    }
}
