import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LJAXEEYT")
public class class24 extends class16 {

    @OriginalMember(owner = "LJAXEEYT", name = "qb", descriptor = "I")
    private int field985 = -64;

    @OriginalMember(owner = "LJAXEEYT", name = "rb", descriptor = "Z")
    private boolean field986 = true;

    @OriginalMember(owner = "LJAXEEYT", name = "sb", descriptor = "LDDJHHGTJ;")
    public class6 field987;

    @OriginalMember(owner = "LJAXEEYT", name = "a", descriptor = "(Z)LOQIGXOFQ;")
    public final class35 method171(boolean arg0) {
        if (this.field987 == null) {
            return null;
        } else {
            class35 var2 = this.method302((byte) 38);
            if (arg0) {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
            if (var2 == null) {
                return null;
            } else {
                super.field857 = var2.field1710;
                if (super.field859 != -1 && super.field860 != -1) {
                    class3 var4 = class3.field41[super.field859];
                    class35 var5 = var4.method18();
                    if (var5 != null) {
                        int var6 = var4.field45.field1562[super.field860];
                        class35 var7 = new class35(class68.method582(var6, 0), var5, -575, false, true);
                        var7.method404(168, 0, -super.field863, 0);
                        var7.method398(0);
                        var7.method399(-230, var6);
                        var7.field1238 = null;
                        var7.field1237 = null;
                        if (var4.field48 != 128 || var4.field49 != 128) {
                            var7.method407(var4.field49, var4.field48, false, var4.field48);
                        }
                        var7.method408(var4.field51 + 64, var4.field52 + 850, -30, -50, -30, true);
                        class35[] var8 = new class35[] { var2, var7 };
                        var2 = new class35(true, this.field985, var8, 2);
                    }
                }
                if (this.field987.field566 == 1) {
                    var2.field1239 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "LJAXEEYT", name = "b", descriptor = "(I)Z")
    public final boolean method169(int arg0) {
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field987 == null) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "LJAXEEYT", name = "a", descriptor = "(B)LOQIGXOFQ;")
    private final class35 method302(byte arg0) {
        if (super.field839 >= 0 && super.field842 == 0) {
            int var2 = class58.field1560[super.field839].field1562[super.field840];
            int var3 = -1;
            if (super.field832 >= 0 && super.field868 != super.field832) {
                var3 = class58.field1560[super.field832].field1562[super.field833];
            }
            return this.field987.method158(class58.field1560[super.field839].field1566, 7, var2, var3);
        } else {
            int var4 = -1;
            if (arg0 != 38) {
                this.field986 = !this.field986;
            }
            if (super.field832 >= 0) {
                var4 = class58.field1560[super.field832].field1562[super.field833];
            }
            return this.field987.method158((int[]) null, 7, var4, -1);
        }
    }
}
