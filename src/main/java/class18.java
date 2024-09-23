import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HGVATLQF")
public class class18 extends class40 {

    @OriginalMember(owner = "HGVATLQF", name = "sb", descriptor = "I")
    private int field838 = 5;

    @OriginalMember(owner = "HGVATLQF", name = "tb", descriptor = "Z")
    private boolean field839 = false;

    @OriginalMember(owner = "HGVATLQF", name = "ub", descriptor = "B")
    private byte field840 = 8;

    @OriginalMember(owner = "HGVATLQF", name = "vb", descriptor = "LRRZTMHXJ;")
    public class52 field841;

    @OriginalMember(owner = "HGVATLQF", name = "a", descriptor = "(I)LJLNSJQDR;")
    public final class26 method2(int arg0) {
        if (this.field841 == null) {
            return null;
        } else {
            class26 var2 = this.method296(this.field840);
            if (var2 == null) {
                return null;
            } else {
                super.field1267 = var2.field6;
                if (arg0 >= this.field838 && arg0 <= this.field838) {
                    if (super.field1256 != -1 && super.field1257 != -1) {
                        class35 var3 = class35.field1198[super.field1256];
                        class26 var4 = var3.method423();
                        if (var4 != null) {
                            int var5 = var3.field1202.field1316[super.field1257];
                            class26 var6 = new class26(class59.method524((byte) 8, var5), false, true, true, var4);
                            var6.method341(true, -super.field1260, 0, 0);
                            var6.method335(19035);
                            var6.method336((byte) 46, var5);
                            var6.field980 = null;
                            var6.field979 = null;
                            if (var3.field1205 != 128 || var3.field1206 != 128) {
                                var6.method344(var3.field1205, -190, var3.field1206, var3.field1205);
                            }
                            var6.method345(var3.field1208 + 64, var3.field1209 + 850, -30, -50, -30, true);
                            class26[] var7 = new class26[] { var2, var6 };
                            var2 = new class26(true, var7, 2, false);
                        }
                    }
                    if (this.field841.field1471 == 1) {
                        var2.field981 = true;
                    }
                    return var2;
                } else {
                    throw new NullPointerException();
                }
            }
        }
    }

    @OriginalMember(owner = "HGVATLQF", name = "a", descriptor = "(B)LJLNSJQDR;")
    private final class26 method296(byte arg0) {
        if (arg0 != 8) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field1291 >= 0 && super.field1294 == 0) {
            int var3 = class42.field1314[super.field1291].field1316[super.field1292];
            int var4 = -1;
            if (super.field1283 >= 0 && super.field1299 != super.field1283) {
                var4 = class42.field1314[super.field1283].field1316[super.field1284];
            }
            return this.field841.method485(class42.field1314[super.field1291].field1320, var3, var4, 0);
        } else {
            int var5 = -1;
            if (super.field1283 >= 0) {
                var5 = class42.field1314[super.field1283].field1316[super.field1284];
            }
            return this.field841.method485((int[]) null, var5, -1, 0);
        }
    }

    @OriginalMember(owner = "HGVATLQF", name = "a", descriptor = "(Z)Z")
    public final boolean method297(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else {
            return this.field841 != null;
        }
    }
}
