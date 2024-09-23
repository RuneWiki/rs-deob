import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NLPNWUNL")
public class class44 extends class56 {

    @OriginalMember(owner = "NLPNWUNL", name = "rb", descriptor = "B")
    private byte field1076 = 1;

    @OriginalMember(owner = "NLPNWUNL", name = "sb", descriptor = "I")
    private int field1077 = -374;

    @OriginalMember(owner = "NLPNWUNL", name = "tb", descriptor = "I")
    private int field1078 = -874;

    @OriginalMember(owner = "NLPNWUNL", name = "ub", descriptor = "Z")
    private boolean field1079 = true;

    @OriginalMember(owner = "NLPNWUNL", name = "vb", descriptor = "LRBTWCHLG;")
    public class58 field1080;

    @OriginalMember(owner = "NLPNWUNL", name = "c", descriptor = "(I)LRTQSBWRH;")
    private final class59 method385(int arg0) {
        if (super.field1231 >= 0 && super.field1234 == 0) {
            int var2 = class36.field953[super.field1231].field955[super.field1232];
            int var3 = -1;
            if (super.field1207 >= 0 && super.field1207 != super.field1202) {
                var3 = class36.field953[super.field1207].field955[super.field1208];
            }
            return this.field1080.method443(class36.field953[super.field1231].field959, var3, 856, var2);
        } else {
            int var4 = -1;
            if (arg0 != -4952) {
                for (int var5 = 1; var5 > 0; ++var5) {
                }
            }
            if (super.field1207 >= 0) {
                var4 = class36.field953[super.field1207].field955[super.field1208];
            }
            return this.field1080.method443((int[]) null, -1, 856, var4);
        }
    }

    @OriginalMember(owner = "NLPNWUNL", name = "a", descriptor = "(Z)Z")
    public final boolean method244(boolean arg0) {
        if (!arg0) {
            this.field1079 = !this.field1079;
        }
        return this.field1080 != null;
    }

    @OriginalMember(owner = "NLPNWUNL", name = "a", descriptor = "(I)LRTQSBWRH;")
    public final class59 method199(int arg0) {
        if (this.field1080 == null) {
            return null;
        } else {
            class59 var2 = this.method385(-4952);
            while (arg0 >= 0) {
                this.field1078 = -9;
            }
            if (var2 == null) {
                return null;
            } else {
                super.field1220 = var2.field696;
                if (super.field1184 != -1 && super.field1185 != -1) {
                    class64 var3 = class64.field1557[super.field1184];
                    class59 var4 = var3.method502();
                    if (var4 != null) {
                        int var5 = var3.field1561.field955[super.field1185];
                        class59 var6 = new class59(true, -28456, class18.method229(var5, 8), var4, false);
                        var6.method467(0, -super.field1188, 0, 0);
                        var6.method461(this.field1077);
                        var6.method462(var5, this.field1076);
                        var6.field1336 = null;
                        var6.field1335 = null;
                        if (var3.field1564 != 128 || var3.field1565 != 128) {
                            var6.method470(var3.field1565, var3.field1564, var3.field1564, true);
                        }
                        var6.method471(var3.field1567 + 64, var3.field1568 + 850, -30, -50, -30, true);
                        class59[] var7 = new class59[] { var2, var6 };
                        var2 = new class59((byte) 1, var7, true, 2);
                    }
                }
                if (this.field1080.field1250 == 1) {
                    var2.field1337 = true;
                }
                return var2;
            }
        }
    }
}
