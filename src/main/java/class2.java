import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BFCMZACY")
public class class2 extends class20 {

    @OriginalMember(owner = "client!BFCMZACY", name = "rb", descriptor = "B")
    private byte field23 = 7;

    @OriginalMember(owner = "client!BFCMZACY", name = "sb", descriptor = "I")
    private int field24 = 122;

    @OriginalMember(owner = "client!BFCMZACY", name = "tb", descriptor = "LSHKUIFHF;")
    public class49 field25;

    @OriginalMember(owner = "client!BFCMZACY", name = "a", descriptor = "(B)LXBVYIDUH;")
    public final class65 method39(byte arg0) {
        if (arg0 != 3) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field25 == null) {
            return null;
        } else {
            class65 var3 = this.method40(true);
            if (var3 == null) {
                return null;
            } else {
                super.field918 = var3.field1025;
                if (super.field888 != -1 && super.field889 != -1) {
                    class9 var4 = class9.field662[super.field888];
                    class65 var5 = var4.method299();
                    if (var5 != null) {
                        int var6 = var4.field666.field1394[super.field889];
                        class65 var7 = new class65(class6.method115(this.field23, var6), (byte) 9, true, false, var5);
                        var7.method554(0, 0, 0, -super.field892);
                        var7.method548((byte) 77);
                        var7.method549(true, var6);
                        var7.field1627 = null;
                        var7.field1626 = null;
                        if (var4.field669 != 128 || var4.field670 != 128) {
                            var7.method557(0, var4.field670, var4.field669, var4.field669);
                        }
                        var7.method558(var4.field672 + 64, var4.field673 + 850, -30, -50, -30, true);
                        class65[] var8 = new class65[] { var3, var7 };
                        var3 = new class65(true, 2, var8, false);
                    }
                }
                if (this.field25.field1363 == 1) {
                    var3.field1628 = true;
                }
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!BFCMZACY", name = "b", descriptor = "(Z)LXBVYIDUH;")
    private final class65 method40(boolean arg0) {
        if (super.field869 >= 0 && super.field872 == 0) {
            int var2 = class50.field1392[super.field869].field1394[super.field870];
            int var3 = -1;
            if (super.field880 >= 0 && super.field880 != super.field862) {
                var3 = class50.field1392[super.field880].field1394[super.field881];
            }
            return this.field25.method502(var3, 1, var2, class50.field1392[super.field869].field1398);
        } else {
            int var4 = -1;
            if (!arg0) {
                for (int var5 = 1; var5 > 0; ++var5) {
                }
            }
            if (super.field880 >= 0) {
                var4 = class50.field1392[super.field880].field1394[super.field881];
            }
            return this.field25.method502(-1, 1, var4, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!BFCMZACY", name = "a", descriptor = "(I)Z")
    public final boolean method41(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else {
            return this.field25 != null;
        }
    }
}
