import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DLNPJUEQ")
public class class10 extends class5 {

    @OriginalMember(owner = "DLNPJUEQ", name = "qb", descriptor = "Z")
    private boolean field624 = true;

    @OriginalMember(owner = "DLNPJUEQ", name = "rb", descriptor = "Z")
    private boolean field625 = true;

    @OriginalMember(owner = "DLNPJUEQ", name = "sb", descriptor = "LHEKJNUPL;")
    public class20 field626;

    @OriginalMember(owner = "DLNPJUEQ", name = "a", descriptor = "(B)LSNMMQNPZ;")
    public final class55 method175(byte arg0) {
        if (this.field626 == null) {
            return null;
        } else {
            class55 var2 = this.method176((byte) 74);
            if (arg0 == 5) {
                boolean var3 = false;
            } else {
                this.field624 = !this.field624;
            }
            if (var2 == null) {
                return null;
            } else {
                super.field84 = var2.field1628;
                if (super.field59 != -1 && super.field60 != -1) {
                    class37 var4 = class37.field1137[super.field59];
                    class55 var5 = var4.method351();
                    if (var5 != null) {
                        int var6 = var4.field1141.field1729[super.field60];
                        class55 var7 = new class55(var5, 707, false, true, class39.method356((byte) 68, var6));
                        var7.method431(0, -super.field63, false, 0);
                        var7.method425(false);
                        var7.method426(var6, (byte) 1);
                        var7.field1370 = null;
                        var7.field1369 = null;
                        if (var4.field1144 != 128 || var4.field1145 != 128) {
                            var7.method434(2985, var4.field1144, var4.field1144, var4.field1145);
                        }
                        var7.method435(var4.field1147 + 64, var4.field1148 + 850, -30, -50, -30, true);
                        class55[] var8 = new class55[] { var2, var7 };
                        var2 = new class55(false, true, 2, var8);
                    }
                }
                if (this.field626.field751 == 1) {
                    var2.field1371 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "DLNPJUEQ", name = "a", descriptor = "(Z)Z")
    public final boolean method20(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else {
            return this.field626 != null;
        }
    }

    @OriginalMember(owner = "DLNPJUEQ", name = "c", descriptor = "(B)LSNMMQNPZ;")
    private final class55 method176(byte arg0) {
        if (super.field90 >= 0 && super.field93 == 0) {
            int var2 = class71.field1727[super.field90].field1729[super.field91];
            int var3 = -1;
            if (super.field49 >= 0 && super.field66 != super.field49) {
                var3 = class71.field1727[super.field49].field1729[super.field50];
            }
            return this.field626.method268(this.field625, var2, class71.field1727[super.field90].field1733, var3);
        } else {
            int var4 = -1;
            if (arg0 != 74) {
                this.field625 = !this.field625;
            }
            if (super.field49 >= 0) {
                var4 = class71.field1727[super.field49].field1729[super.field50];
            }
            return this.field626.method268(this.field625, var4, (int[]) null, -1);
        }
    }
}
