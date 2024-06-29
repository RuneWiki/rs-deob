import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class332 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Luc;")
    private class51 field4884 = new class51(256);

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Lse;")
    private class282 field4886;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Lwh;")
    private class288 field4885;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public final void method2171(int arg0) {
        int var2 = 75 / ((-arg0 - 50) / 49);
        this.field4884.method372(124);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)Loa;")
    public final class121 method2172(byte arg0, int arg1) {
        if (arg0 > -92) {
            this.method2171(-47);
        }
        Object var3 = this.field4884.method378((byte) 28, (long) arg1);
        if (var3 != null) {
            return (class121) var3;
        } else if (this.field4885.method1960(false, arg1)) {
            class3 var4 = this.field4885.method1962(arg1, -11999);
            int var5 = var4.field34 ? 64 : 128;
            class121 var7;
            if (var4.field27 && this.field4886.method498()) {
                float[] var6 = this.field4885.method1959(-113, var5, false, 0.7F, arg1, var5);
                var7 = new class121(this.field4886, 3553, 34842, var5, var5, var4.field43 != 0, var6, 6408);
            } else {
                short var8 = 6408;
                int[] var9 = this.field4885.method1958(22410, var5, var5, false, arg1, 0.7F);
                var7 = new class121(this.field4886, 3553, var8, var5, var5, var4.field43 != 0, var9, false);
            }
            var7.method872(var4.field35, var4.field44);
            this.field4884.method367((long) arg1, var7, true);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lse;Lwh;)V")
    public class332(class282 arg0, class288 arg1) {
        this.field4886 = arg0;
        this.field4885 = arg1;
    }
}
