import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class114 {

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Ltl;")
    private class400 field1590 = new class400(256);

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lcp;")
    private class481 field1591;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Lnm;")
    private class254 field1589;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Lhi;")
    public final class41 method816(int arg0, int arg1) {
        Object var3 = this.field1590.method2393(-119, (long) arg0);
        if (var3 != null) {
            return (class41) var3;
        } else if (this.field1591.method1335(arg0, (byte) 9)) {
            class85 var4 = this.field1591.method1331(9386, arg0);
            int var5 = var4.field1197 ? 64 : 128;
            if (arg1 > -40) {
                this.field1589 = (class254) null;
            }
            class41 var7;
            if (var4.field1201 && this.field1589.method504()) {
                float[] var6 = this.field1591.method1329(arg0, 0.7F, false, 108, var5, var5);
                var7 = new class41(this.field1589, 3553, 34842, var5, var5, var4.field1200 != 0, var6, 6408);
            } else {
                short var8 = 6408;
                int[] var9 = this.field1591.method1333(108, false, 0.7F, var5, var5, arg0);
                var7 = new class41(this.field1589, 3553, var8, var5, var5, var4.field1200 != 0, var9, false);
            }
            var7.method312(var4.field1204, var4.field1205);
            this.field1590.method2395(0, var7, (long) arg0);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
    public final void method817(boolean arg0) {
        if (!arg0) {
            this.method817(true);
        }
        this.field1590.method2401((byte) -50);
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lnm;Lcp;)V")
    public class114(class254 arg0, class481 arg1) {
        this.field1591 = arg1;
        this.field1589 = arg0;
    }
}
