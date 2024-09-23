import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AVKLDTFF")
public class class3 extends class50 {

    @OriginalMember(owner = "AVKLDTFF", name = "qb", descriptor = "Z")
    private boolean field39 = true;

    @OriginalMember(owner = "AVKLDTFF", name = "rb", descriptor = "Z")
    private boolean field40 = false;

    @OriginalMember(owner = "AVKLDTFF", name = "sb", descriptor = "LHQFMWUSH;")
    public class26 field41;

    @OriginalMember(owner = "AVKLDTFF", name = "a", descriptor = "(I)LKPUOCBCE;")
    public final class35 method11(int arg0) {
        if (arg0 != 8) {
            this.field40 = !this.field40;
        }
        if (this.field41 == null) {
            return null;
        } else {
            class35 var2 = this.method13(0);
            if (var2 == null) {
                return null;
            } else {
                super.field1325 = var2.field1593;
                if (super.field1336 != -1 && super.field1337 != -1) {
                    class21 var3 = class21.field703[super.field1336];
                    class35 var4 = var3.method231();
                    if (var4 != null) {
                        int var5 = var3.field707.field1160[super.field1337];
                        class35 var6 = new class35(class71.method585(var5, 2), false, var4, true, 271);
                        var6.method392(0, 0, -super.field1340, 340);
                        var6.method386(9);
                        var6.method387(var5, -599);
                        var6.field1042 = null;
                        var6.field1041 = null;
                        if (var3.field710 != 128 || var3.field711 != 128) {
                            var6.method395(-49478, var3.field710, var3.field711, var3.field710);
                        }
                        var6.method396(var3.field713 + 64, var3.field714 + 850, -30, -50, -30, true);
                        class35[] var7 = new class35[] { var2, var6 };
                        var2 = new class35(true, var7, 2, 1);
                    }
                }
                if (this.field41.field916 == 1) {
                    var2.field1043 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "AVKLDTFF", name = "b", descriptor = "(I)Z")
    public final boolean method12(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else {
            return this.field41 != null;
        }
    }

    @OriginalMember(owner = "AVKLDTFF", name = "c", descriptor = "(I)LKPUOCBCE;")
    private final class35 method13(int arg0) {
        if (super.field1319 >= 0 && super.field1322 == 0) {
            int var2 = class42.field1158[super.field1319].field1160[super.field1320];
            int var3 = -1;
            if (super.field1332 >= 0 && super.field1353 != super.field1332) {
                var3 = class42.field1158[super.field1332].field1160[super.field1333];
            }
            return this.field41.method305(var3, class42.field1158[super.field1319].field1164, 0, var2);
        } else {
            int var4 = -1;
            if (arg0 != 0) {
                this.field39 = !this.field39;
            }
            if (super.field1332 >= 0) {
                var4 = class42.field1158[super.field1332].field1160[super.field1333];
            }
            return this.field41.method305(-1, (int[]) null, 0, var4);
        }
    }
}
