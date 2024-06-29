import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class443 {

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Lku;")
    private class232 field6132 = new class232(256);

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "Lwp;")
    private class109 field6133;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Lmi;")
    private class315 field6131;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)Lkh;")
    public final class13 method2602(int arg0, int arg1) {
        Object var3 = this.field6132.method1479(0, (long) arg1);
        if (var3 != null) {
            return (class13) var3;
        } else if (this.field6133.method702(arg1, 125)) {
            class279 var4 = this.field6133.method703(12095, arg1);
            int var5 = var4.field4114 ? 64 : 128;
            class13 var7;
            if (var4.field4102 && this.field6131.method666()) {
                float[] var6 = this.field6133.method706(arg1, (byte) 121, var5, 0.7F, false, var5);
                var7 = new class13(this.field6131, 3553, 34842, var5, var5, var4.field4096 != 0, var6, 6408);
            } else {
                short var8 = 6408;
                int[] var9 = this.field6133.method704(false, 0.7F, var5, true, arg1, var5);
                var7 = new class13(this.field6131, 3553, var8, var5, var5, var4.field4096 != 0, var9, false);
            }
            if (arg0 < 89) {
                this.method2602(72, -47);
            }
            var7.method93(var4.field4112, var4.field4098);
            this.field6132.method1473(var7, (long) arg1, 114);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
    public final void method2603(boolean arg0) {
        if (!arg0) {
            this.method2603(true);
        }
        this.field6132.method1478((byte) -90);
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lmi;Lwp;)V")
    public class443(class315 arg0, class109 arg1) {
        this.field6133 = arg1;
        this.field6131 = arg0;
    }
}
