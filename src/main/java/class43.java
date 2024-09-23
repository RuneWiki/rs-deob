import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ONCZAQCQ")
public class class43 extends class3 {

    @OriginalMember(owner = "ONCZAQCQ", name = "qb", descriptor = "Z")
    private boolean field1209 = false;

    @OriginalMember(owner = "ONCZAQCQ", name = "rb", descriptor = "B")
    private byte field1210 = 29;

    @OriginalMember(owner = "ONCZAQCQ", name = "sb", descriptor = "Z")
    private boolean field1211 = true;

    @OriginalMember(owner = "ONCZAQCQ", name = "tb", descriptor = "I")
    private int field1212 = 947;

    @OriginalMember(owner = "ONCZAQCQ", name = "ub", descriptor = "LNPWLDXJE;")
    public class37 field1213;

    @OriginalMember(owner = "ONCZAQCQ", name = "a", descriptor = "(I)LKBEXSZSN;")
    public final class31 method28(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (this.field1213 == null) {
            return null;
        } else {
            class31 var2 = this.method415((byte) 9);
            if (var2 == null) {
                return null;
            } else {
                super.field36 = var2.field1489;
                if (super.field27 != -1 && super.field28 != -1) {
                    class55 var3 = class55.field1367[super.field27];
                    class31 var4 = var3.method461();
                    if (var4 != null) {
                        int var5 = var3.field1371.field1186[super.field28];
                        class31 var6 = new class31(false, 777, class25.method309(var5, false), var4, true);
                        var6.method352(-super.field31, 0, 8, 0);
                        var6.method346(311);
                        var6.method347(-486, var5);
                        var6.field1032 = null;
                        var6.field1031 = null;
                        if (var3.field1374 != 128 || var3.field1375 != 128) {
                            var6.method355(this.field1210, var3.field1374, var3.field1375, var3.field1374);
                        }
                        var6.method356(var3.field1377 + 64, var3.field1378 + 850, -30, -50, -30, true);
                        class31[] var7 = new class31[] { var2, var6 };
                        var2 = new class31(var7, 2, true, false);
                    }
                }
                if (this.field1213.field1127 == 1) {
                    var2.field1033 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "ONCZAQCQ", name = "b", descriptor = "(B)LKBEXSZSN;")
    private final class31 method415(byte arg0) {
        if (arg0 != 9) {
            this.field1212 = 468;
        }
        if (super.field47 >= 0 && super.field50 == 0) {
            int var2 = class41.field1184[super.field47].field1186[super.field48];
            int var3 = -1;
            if (super.field43 >= 0 && super.field70 != super.field43) {
                var3 = class41.field1184[super.field43].field1186[super.field44];
            }
            return this.field1213.method388(var2, var3, class41.field1184[super.field47].field1190, true);
        } else {
            int var4 = -1;
            if (super.field43 >= 0) {
                var4 = class41.field1184[super.field43].field1186[super.field44];
            }
            return this.field1213.method388(var4, -1, (int[]) null, true);
        }
    }

    @OriginalMember(owner = "ONCZAQCQ", name = "a", descriptor = "(Z)Z")
    public final boolean method10(boolean arg0) {
        if (!arg0) {
            this.field1209 = !this.field1209;
        }
        return this.field1213 != null;
    }
}
