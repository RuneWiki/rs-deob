import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FSNLAIJY")
public class class18 extends class70 {

    @OriginalMember(owner = "FSNLAIJY", name = "rb", descriptor = "I")
    private int field721 = -39282;

    @OriginalMember(owner = "FSNLAIJY", name = "sb", descriptor = "LNHTDEVDA;")
    public class37 field722;

    @OriginalMember(owner = "FSNLAIJY", name = "d", descriptor = "(I)LFUTAQMCE;")
    private final class19 method244(int arg0) {
        int var2 = 85 / arg0;
        if (super.field1698 >= 0 && super.field1701 == 0) {
            int var3 = class21.field817[super.field1698].field819[super.field1699];
            int var4 = -1;
            if (super.field1692 >= 0 && super.field1692 != super.field1678) {
                var4 = class21.field817[super.field1692].field819[super.field1693];
            }
            return this.field722.method367(class21.field817[super.field1698].field823, var4, var3, 4);
        } else {
            int var5 = -1;
            if (super.field1692 >= 0) {
                var5 = class21.field817[super.field1692].field819[super.field1693];
            }
            return this.field722.method367((int[]) null, -1, var5, 4);
        }
    }

    @OriginalMember(owner = "FSNLAIJY", name = "a", descriptor = "(I)LFUTAQMCE;")
    public final class19 method2(int arg0) {
        if (this.field722 == null) {
            return null;
        } else {
            class19 var2 = this.method244(291);
            if (this.field721 != arg0) {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
            if (var2 == null) {
                return null;
            } else {
                super.field1707 = var2.field1116;
                if (super.field1673 != -1 && super.field1674 != -1) {
                    class66 var4 = class66.field1605[super.field1673];
                    class19 var5 = var4.method519();
                    if (var5 != null) {
                        int var6 = var4.field1609.field819[super.field1674];
                        class19 var7 = new class19(var5, false, (byte) 2, true, class55.method428(4, var6));
                        var7.method263(0, -super.field1677, 292, 0);
                        var7.method257(284);
                        var7.method258(var6, 4);
                        var7.field765 = null;
                        var7.field764 = null;
                        if (var4.field1612 != 128 || var4.field1613 != 128) {
                            var7.method266(var4.field1612, var4.field1613, var4.field1612, -9317);
                        }
                        var7.method267(var4.field1615 + 64, var4.field1616 + 850, -30, -50, -30, true);
                        class19[] var8 = new class19[] { var2, var7 };
                        var2 = new class19(2, false, var8, true);
                    }
                }
                if (this.field722.field1090 == 1) {
                    var2.field766 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "FSNLAIJY", name = "b", descriptor = "(I)Z")
    public final boolean method245(int arg0) {
        if (arg0 < 6 || arg0 > 6) {
            this.field721 = 453;
        }
        return this.field722 != null;
    }
}
