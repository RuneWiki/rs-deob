import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DLMOHDFX")
public class class13 extends class15 {

    @OriginalMember(owner = "DLMOHDFX", name = "rb", descriptor = "I")
    private int field669 = 4006;

    @OriginalMember(owner = "DLMOHDFX", name = "sb", descriptor = "B")
    private byte field670 = 23;

    @OriginalMember(owner = "DLMOHDFX", name = "tb", descriptor = "LKFUEEJVZ;")
    public class33 field671;

    @OriginalMember(owner = "DLMOHDFX", name = "a", descriptor = "(I)LVYUQHOMO;")
    public final class66 method13(int arg0) {
        int var2 = 10 / arg0;
        if (this.field671 == null) {
            return null;
        } else {
            class66 var3 = this.method191(true);
            if (var3 == null) {
                return null;
            } else {
                super.field739 = var3.field935;
                if (super.field717 != -1 && super.field718 != -1) {
                    class6 var4 = class6.field61[super.field717];
                    class66 var5 = var4.method16();
                    if (var5 != null) {
                        int var6 = var4.field65.field1189[super.field718];
                        class66 var7 = new class66(true, class2.method11((byte) 85, var6), var5, this.field670, false);
                        var7.method420(0, -super.field721, 0, (byte) -122);
                        var7.method414((byte) 56);
                        var7.method415(var6, 3);
                        var7.field1511 = null;
                        var7.field1510 = null;
                        if (var4.field68 != 128 || var4.field69 != 128) {
                            var7.method423(var4.field68, var4.field69, var4.field68, 0);
                        }
                        var7.method424(var4.field71 + 64, var4.field72 + 850, -30, -50, -30, true);
                        class66[] var8 = new class66[] { var3, var7 };
                        var3 = new class66(true, 2, 20, var8);
                    }
                }
                if (this.field671.field975 == 1) {
                    var3.field1512 = true;
                }
                return var3;
            }
        }
    }

    @OriginalMember(owner = "DLMOHDFX", name = "b", descriptor = "(Z)LVYUQHOMO;")
    private final class66 method191(boolean arg0) {
        if (super.field686 >= 0 && super.field689 == 0) {
            int var2 = class45.field1187[super.field686].field1189[super.field687];
            int var3 = -1;
            if (super.field723 >= 0 && super.field736 != super.field723) {
                var3 = class45.field1187[super.field723].field1189[super.field724];
            }
            return this.field671.method264(var2, class45.field1187[super.field686].field1193, var3, 2);
        } else {
            int var4 = -1;
            if (!arg0) {
                this.field669 = 320;
            }
            if (super.field723 >= 0) {
                var4 = class45.field1187[super.field723].field1189[super.field724];
            }
            return this.field671.method264(var4, (int[]) null, -1, 2);
        }
    }

    @OriginalMember(owner = "DLMOHDFX", name = "b", descriptor = "(I)Z")
    public final boolean method192(int arg0) {
        if (arg0 != -22030) {
            this.field669 = -6;
        }
        return this.field671 != null;
    }
}
