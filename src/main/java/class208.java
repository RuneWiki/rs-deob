import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class208 {

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Lik;")
    private class410 field2889 = new class410(256);

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Lpg;")
    private class112 field2888;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "Lhd;")
    private class17 field2890;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)Loe;", line = 7)
    public final class231 method1435(int arg0, int arg1) {
        Object var3 = this.field2889.method2537(arg1 ^ 0x40D2, (long) arg0);
        if (var3 != null) {
            return (class231) var3;
        } else if (this.field2888.method918(arg0, -567)) {
            class122 var4 = this.field2888.method917((byte) 96, arg0);
            int var5 = var4.field1703 ? 64 : 128;
            class231 var7;
            if (var4.field1716 && this.field2890.method250()) {
                float[] var6 = this.field2888.method915(var5, false, var5, arg0, (byte) 110, 0.7F);
                var7 = new class231(this.field2890, 3553, 34842, var5, var5, var4.field1706 != 0, var6, 6408);
            } else {
                int[] var8 = this.field2888.method916(0.7F, 102, arg0, false, var5, var5);
                short var9 = 6408;
                var7 = new class231(this.field2890, 3553, var9, var5, var5, var4.field1706 != 0, var8, false);
            }
            var7.method1543(var4.field1721, var4.field1722);
            if (arg1 == -16541) {
                this.field2889.method2542(var7, (byte) 126, (long) arg0);
                return var7;
            } else {
                return (class231) null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 51)
    public final void method1436(int arg0) {
        this.field2889.method2533(0);
        if (arg0 >= -25) {
            this.field2888 = (class112) null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lhd;Lpg;)V", line = 63)
    public class208(class17 arg0, class112 arg1) {
        this.field2888 = arg1;
        this.field2890 = arg0;
    }
}
