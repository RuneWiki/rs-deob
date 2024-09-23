import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TEBIXSCV")
public class class49 extends class38 {

    @OriginalMember(owner = "TEBIXSCV", name = "pb", descriptor = "LZDMOUFDZ;")
    public class68 field1441;

    @OriginalMember(owner = "TEBIXSCV", name = "a", descriptor = "(B)LCCYECDYX;")
    public final class4 method181(byte arg0) {
        if (arg0 != 1) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field1441 == null) {
            return null;
        } else {
            class4 var3 = this.method438(false);
            if (var3 == null) {
                return null;
            } else {
                super.field1212 = var3.field1482;
                if (super.field1200 != -1 && super.field1201 != -1) {
                    class71 var4 = class71.field1721[super.field1200];
                    class4 var5 = var4.method590();
                    if (var5 != null) {
                        int var6 = var4.field1725.field877[super.field1201];
                        class4 var7 = new class4(class41.method383(var6, (byte) 8), -784, var5, false, true);
                        var7.method24(0, 0, 0, -super.field1204);
                        var7.method18(true);
                        var7.method19(var6, (byte) 106);
                        var7.field65 = null;
                        var7.field64 = null;
                        if (var4.field1728 != 128 || var4.field1729 != 128) {
                            var7.method27(var4.field1728, var4.field1729, var4.field1728, (byte) 6);
                        }
                        var7.method28(var4.field1731 + 64, var4.field1732 + 850, -30, -50, -30, true);
                        class4[] var8 = new class4[] { var3, var7 };
                        var3 = new class4(true, var8, 2, 865);
                    }
                }
                if (this.field1441.field1669 == 1) {
                    var3.field66 = true;
                }
                return var3;
            }
        }
    }

    @OriginalMember(owner = "TEBIXSCV", name = "c", descriptor = "(Z)LCCYECDYX;")
    private final class4 method438(boolean arg0) {
        if (super.field1245 >= 0 && super.field1248 == 0) {
            int var2 = class20.field875[super.field1245].field877[super.field1246];
            int var3 = -1;
            if (super.field1197 >= 0 && super.field1210 != super.field1197) {
                var3 = class20.field875[super.field1197].field877[super.field1198];
            }
            return this.field1441.method530(var3, var2, class20.field875[super.field1245].field881, 7);
        } else {
            int var4 = -1;
            if (arg0) {
                throw new NullPointerException();
            } else {
                if (super.field1197 >= 0) {
                    var4 = class20.field875[super.field1197].field877[super.field1198];
                }
                return this.field1441.method530(-1, var4, (int[]) null, 7);
            }
        }
    }

    @OriginalMember(owner = "TEBIXSCV", name = "a", descriptor = "(Z)Z")
    public final boolean method369(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else {
            return this.field1441 != null;
        }
    }
}
