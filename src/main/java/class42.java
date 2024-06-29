import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PEHNWFXK")
public class class42 extends class35 {

    @OriginalMember(owner = "client!PEHNWFXK", name = "qb", descriptor = "Z")
    private boolean field1194 = true;

    @OriginalMember(owner = "client!PEHNWFXK", name = "rb", descriptor = "I")
    private int field1195 = -22770;

    @OriginalMember(owner = "client!PEHNWFXK", name = "sb", descriptor = "LPIPBZEOV;")
    public class44 field1196;

    @OriginalMember(owner = "client!PEHNWFXK", name = "a", descriptor = "(I)Z")
    public final boolean method325(int arg0) {
        if (arg0 < 5 || arg0 > 5) {
            this.field1194 = !this.field1194;
        }
        return this.field1196 != null;
    }

    @OriginalMember(owner = "client!PEHNWFXK", name = "b", descriptor = "(I)LIYSWJGDE;")
    private final class19 method392(int arg0) {
        if (super.field1117 >= 0 && super.field1120 == 0) {
            int var2 = class26.field921[super.field1117].field923[super.field1118];
            int var3 = -1;
            if (super.field1094 >= 0 && super.field1094 != super.field1072) {
                var3 = class26.field921[super.field1094].field923[super.field1095];
            }
            return this.field1196.method401(this.field1195, class26.field921[super.field1117].field927, var2, var3);
        } else {
            int var4 = -1;
            if (arg0 != -37900) {
                this.field1194 = !this.field1194;
            }
            if (super.field1094 >= 0) {
                var4 = class26.field921[super.field1094].field923[super.field1095];
            }
            return this.field1196.method401(this.field1195, (int[]) null, var4, -1);
        }
    }

    @OriginalMember(owner = "client!PEHNWFXK", name = "a", descriptor = "(Z)LIYSWJGDE;")
    public final class19 method2(boolean arg0) {
        if (this.field1196 == null) {
            return null;
        } else {
            class19 var2 = this.method392(-37900);
            if (var2 == null) {
                return null;
            } else {
                super.field1070 = var2.field884;
                if (!arg0) {
                    throw new NullPointerException();
                } else {
                    if (super.field1102 != -1 && super.field1103 != -1) {
                        class50 var3 = class50.field1354[super.field1102];
                        class19 var4 = var3.method448();
                        if (var4 != null) {
                            int var5 = var3.field1358.field923[super.field1103];
                            class19 var6 = new class19(class45.method406(61, var5), var4, 946, true, false);
                            var6.method286(-super.field1106, 0, 600, 0);
                            var6.method280(true);
                            var6.method281(true, var5);
                            var6.field842 = null;
                            var6.field841 = null;
                            if (var3.field1361 != 128 || var3.field1362 != 128) {
                                var6.method289(var3.field1361, 471, var3.field1361, var3.field1362);
                            }
                            var6.method290(var3.field1364 + 64, var3.field1365 + 850, -30, -50, -30, true);
                            class19[] var7 = new class19[] { var2, var6 };
                            var2 = new class19(var7, 2, true, (byte) 2);
                        }
                    }
                    if (this.field1196.field1238 == 1) {
                        var2.field843 = true;
                    }
                    return var2;
                }
            }
        }
    }
}
