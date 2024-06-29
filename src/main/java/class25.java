import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IGOBKPZP")
public class class25 extends class50 {

    @OriginalMember(owner = "client!IGOBKPZP", name = "qb", descriptor = "Z")
    private boolean field885 = true;

    @OriginalMember(owner = "client!IGOBKPZP", name = "rb", descriptor = "I")
    private int field886 = -131;

    @OriginalMember(owner = "client!IGOBKPZP", name = "sb", descriptor = "LTQRZOVPP;")
    public class57 field887;

    @OriginalMember(owner = "client!IGOBKPZP", name = "a", descriptor = "(Z)LGCSAWSJV;")
    public final class16 method8(boolean arg0) {
        if (arg0) {
            this.field886 = 408;
        }
        if (this.field887 == null) {
            return null;
        } else {
            class16 var2 = this.method303((byte) 7);
            if (var2 == null) {
                return null;
            } else {
                super.field1312 = var2.field11;
                if (super.field1273 != -1 && super.field1274 != -1) {
                    class29 var3 = class29.field932[super.field1273];
                    class16 var4 = var3.method332();
                    if (var4 != null) {
                        int var5 = var3.field936.field1668[super.field1274];
                        class16 var6 = new class16(0, var4, true, class48.method436(this.field885, var5), false);
                        var6.method273(-super.field1277, true, 0, 0);
                        var6.method267(-12404);
                        var6.method268((byte) 81, var5);
                        var6.field746 = null;
                        var6.field745 = null;
                        if (var3.field939 != 128 || var3.field940 != 128) {
                            var6.method276(var3.field939, var3.field939, var3.field940, (byte) -79);
                        }
                        var6.method277(var3.field942 + 64, var3.field943 + 850, -30, -50, -30, true);
                        class16[] var7 = new class16[] { var2, var6 };
                        var2 = new class16(true, var7, -4860, 2);
                    }
                }
                if (this.field887.field1472 == 1) {
                    var2.field747 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!IGOBKPZP", name = "a", descriptor = "(B)Z")
    public final boolean method302(byte arg0) {
        if (arg0 != 38) {
            throw new NullPointerException();
        } else {
            return this.field887 != null;
        }
    }

    @OriginalMember(owner = "client!IGOBKPZP", name = "b", descriptor = "(B)LGCSAWSJV;")
    private final class16 method303(byte arg0) {
        if (super.field1300 >= 0 && super.field1303 == 0) {
            int var2 = class67.field1666[super.field1300].field1668[super.field1301];
            int var3 = -1;
            if (super.field1297 >= 0 && super.field1297 != super.field1286) {
                var3 = class67.field1666[super.field1297].field1668[super.field1298];
            }
            return this.field887.method520(var3, class67.field1666[super.field1300].field1672, var2, (byte) -112);
        } else {
            int var4 = -1;
            if (arg0 == 7) {
                boolean var5 = false;
                if (super.field1297 >= 0) {
                    var4 = class67.field1666[super.field1297].field1668[super.field1298];
                }
                return this.field887.method520(-1, (int[]) null, var4, (byte) -112);
            } else {
                throw new NullPointerException();
            }
        }
    }
}
