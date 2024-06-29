import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SBPCMLRM")
public class class49 extends class37 {

    @OriginalMember(owner = "client!SBPCMLRM", name = "ob", descriptor = "Z")
    private boolean field1401 = true;

    @OriginalMember(owner = "client!SBPCMLRM", name = "pb", descriptor = "LYGGALXYD;")
    public class64 field1402;

    @OriginalMember(owner = "client!SBPCMLRM", name = "a", descriptor = "(Z)LCYPZUKMB;")
    private final class8 method522(boolean arg0) {
        if (super.field1173 >= 0 && super.field1176 == 0) {
            int var2 = class15.field837[super.field1173].field839[super.field1174];
            int var3 = -1;
            if (super.field1160 >= 0 && super.field1160 != super.field1146) {
                var3 = class15.field837[super.field1160].field839[super.field1161];
            }
            return this.field1402.method569(var3, (byte) 0, var2, class15.field837[super.field1173].field843);
        } else {
            int var4 = -1;
            if (!arg0) {
                this.field1401 = !this.field1401;
            }
            if (super.field1160 >= 0) {
                var4 = class15.field837[super.field1160].field839[super.field1161];
            }
            return this.field1402.method569(-1, (byte) 0, var4, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!SBPCMLRM", name = "a", descriptor = "(B)LCYPZUKMB;")
    public final class8 method2(byte arg0) {
        if (this.field1402 == null) {
            return null;
        } else {
            class8 var2 = this.method522(true);
            if (arg0 != -99) {
                throw new NullPointerException();
            } else if (var2 == null) {
                return null;
            } else {
                super.field1151 = var2.field1436;
                if (super.field1126 != -1 && super.field1127 != -1) {
                    class4 var3 = class4.field43[super.field1126];
                    class8 var4 = var3.method9();
                    if (var4 != null) {
                        int var5 = var3.field47.field839[super.field1127];
                        class8 var6 = new class8(class46.method469(var5, true), var4, false, false, true);
                        var6.method209(0, -super.field1130, false, 0);
                        var6.method203(166);
                        var6.method204(257, var5);
                        var6.field651 = null;
                        var6.field650 = null;
                        if (var3.field50 != 128 || var3.field51 != 128) {
                            var6.method212(var3.field50, -39776, var3.field51, var3.field50);
                        }
                        var6.method213(var3.field53 + 64, var3.field54 + 850, -30, -50, -30, true);
                        class8[] var7 = new class8[] { var2, var6 };
                        var2 = new class8(153, true, 2, var7);
                    }
                }
                if (this.field1402.field1597 == 1) {
                    var2.field652 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!SBPCMLRM", name = "a", descriptor = "(I)Z")
    public final boolean method429(int arg0) {
        if (arg0 != 21781) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field1402 != null;
    }
}
