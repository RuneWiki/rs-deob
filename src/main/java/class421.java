import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class421 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Ljg;")
    private class241 field6206 = new class241(256);

    @OriginalMember(owner = "client!re", name = "c", descriptor = "Lcg;")
    private class393 field6208;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Lec;")
    private class96 field6207;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)Lpq;")
    public final class46 method2604(boolean arg0, int arg1) {
        Object var3 = this.field6206.method1491((long) arg1, 0);
        if (var3 != null) {
            return (class46) var3;
        } else if (this.field6207.method178(false, arg1)) {
            class154 var4 = this.field6207.method180(arg1, 58);
            int var5 = var4.field2126 ? 64 : 128;
            class46 var7;
            if (var4.field2114 && this.field6208.method387()) {
                float[] var6 = this.field6207.method182(var5, arg1, false, 0.7F, (byte) -124, var5);
                var7 = new class46(this.field6208, 3553, 34842, var5, var5, var4.field2131 != 0, var6, 6408);
            } else {
                short var8 = 6408;
                int[] var9 = this.field6207.method183(30111, 0.7F, var5, arg1, false, var5);
                var7 = new class46(this.field6208, 3553, var8, var5, var5, var4.field2131 != 0, var9, false);
            }
            var7.method258(var4.field2120, var4.field2133);
            if (arg0) {
                this.field6206.method1488(128, (long) arg1, var7);
                return var7;
            } else {
                return (class46) null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public final void method2605(int arg0) {
        if (arg0 != 3553) {
            this.method2605(-120);
        }
        this.field6206.method1485(-22032);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lcg;Lec;)V")
    public class421(class393 arg0, class96 arg1) {
        this.field6208 = arg0;
        this.field6207 = arg1;
    }
}
