import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class452 {

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "Lmo;")
    private class336 field6421 = new class336(256);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "Ltq;")
    private class248 field6420;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "Lfu;")
    private class42 field6422;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BI)Luo;")
    public final class429 method2729(byte arg0, int arg1) {
        Object var3 = this.field6421.method2113(0, (long) arg1);
        if (var3 != null) {
            return (class429) var3;
        } else if (this.field6420.method1223(-29838, arg1)) {
            class308 var4 = this.field6420.method1224((byte) 110, arg1);
            int var5 = var4.field4361 ? 64 : 128;
            class429 var7;
            if (var4.field4372 && this.field6422.method379()) {
                float[] var6 = this.field6420.method1228(var5, arg1, false, -109, var5, 0.7F);
                var7 = new class429(this.field6422, 3553, 34842, var5, var5, var4.field4362 != 0, var6, 6408);
            } else {
                short var8 = 6408;
                int[] var9 = this.field6420.method1226(var5, -20, false, 0.7F, var5, arg1);
                var7 = new class429(this.field6422, 3553, var8, var5, var5, var4.field4362 != 0, var9, false);
            }
            if (arg0 > -46) {
                return (class429) null;
            } else {
                var7.method2564(var4.field4366, var4.field4377);
                this.field6421.method2116((long) arg1, (byte) -86, var7);
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
    public final void method2730(byte arg0) {
        this.field6421.method2109(arg0 + 126);
        if (arg0 != -127) {
            this.method2729((byte) 45, -88);
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lfu;Ltq;)V")
    public class452(class42 arg0, class248 arg1) {
        this.field6420 = arg1;
        this.field6422 = arg0;
    }
}
