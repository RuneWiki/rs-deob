import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GBGUDIMT")
public class class17 extends class12 {

    @OriginalMember(owner = "GBGUDIMT", name = "qb", descriptor = "I")
    private int field794 = -273;

    @OriginalMember(owner = "GBGUDIMT", name = "rb", descriptor = "Z")
    private boolean field795 = false;

    @OriginalMember(owner = "GBGUDIMT", name = "sb", descriptor = "LWZSDIPBR;")
    public class58 field796;

    @OriginalMember(owner = "GBGUDIMT", name = "a", descriptor = "(B)Z")
    public final boolean method263(byte arg0) {
        if (arg0 != 15) {
            this.field795 = !this.field795;
        }
        return this.field796 != null;
    }

    @OriginalMember(owner = "GBGUDIMT", name = "c", descriptor = "(Z)LPOJFANDE;")
    private final class43 method274(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else if (super.field737 >= 0 && super.field740 == 0) {
            int var2 = class29.field1014[super.field737].field1016[super.field738];
            int var3 = -1;
            if (super.field706 >= 0 && super.field748 != super.field706) {
                var3 = class29.field1014[super.field706].field1016[super.field707];
            }
            return this.field796.method527(11195, class29.field1014[super.field737].field1020, var2, var3);
        } else {
            int var4 = -1;
            if (super.field706 >= 0) {
                var4 = class29.field1014[super.field706].field1016[super.field707];
            }
            return this.field796.method527(11195, (int[]) null, var4, -1);
        }
    }

    @OriginalMember(owner = "GBGUDIMT", name = "a", descriptor = "(Z)LPOJFANDE;")
    public final class43 method54(boolean arg0) {
        if (this.field796 == null) {
            return null;
        } else {
            class43 var2 = this.method274(false);
            if (!arg0) {
                this.field794 = 305;
            }
            if (var2 == null) {
                return null;
            } else {
                super.field731 = var2.field1487;
                if (super.field713 != -1 && super.field714 != -1) {
                    class6 var3 = class6.field49[super.field713];
                    class43 var4 = var3.method62();
                    if (var4 != null) {
                        int var5 = var3.field53.field1016[super.field714];
                        class43 var6 = new class43(class21.method287(var5, -13619), true, false, -785, var4);
                        var6.method473(-super.field717, 0, 0, -30187);
                        var6.method467(0);
                        var6.method468(var5, 19066);
                        var6.field1310 = null;
                        var6.field1309 = null;
                        if (var3.field56 != 128 || var3.field57 != 128) {
                            var6.method476(var3.field57, true, var3.field56, var3.field56);
                        }
                        var6.method477(var3.field59 + 64, var3.field60 + 850, -30, -50, -30, true);
                        class43[] var7 = new class43[] { var2, var6 };
                        var2 = new class43(true, var7, 2, true);
                    }
                }
                if (this.field796.field1503 == 1) {
                    var2.field1311 = true;
                }
                return var2;
            }
        }
    }
}
