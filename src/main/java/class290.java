import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class290 {

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Lcr;")
    private class189 field4163 = new class189(256);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Lnf;")
    private class256 field4161;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Lfh;")
    private class210 field4162;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)Lir;", line = 6)
    public final class216 method1978(int arg0, byte arg1) {
        if (arg1 != -91) {
            return (class216) null;
        }
        Object var3 = this.field4163.method1137((long) arg0, 2108653711);
        if (var3 != null) {
            return (class216) var3;
        } else if (this.field4162.method184(arg0, 14556)) {
            class444 var4 = this.field4162.method186(arg0, -9590);
            int var5 = var4.field6509 ? 64 : 128;
            class216 var7;
            if (var4.field6511 && this.field4161.method1717()) {
                float[] var6 = this.field4162.method183(false, var5, false, 0.7F, arg0, var5);
                var7 = new class216(this.field4161, 3553, 34842, var5, var5, var4.field6497 != 0, var6, 6408);
            } else {
                short var8 = 6408;
                int[] var9 = this.field4162.method185(false, -121, var5, var5, 0.7F, arg0);
                var7 = new class216(this.field4161, 3553, var8, var5, var5, var4.field6497 != 0, var9, false);
            }
            var7.method1271(var4.field6503, var4.field6507);
            this.field4163.method1144((long) arg0, var7, -3480);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 52)
    public final void method1979(byte arg0) {
        if (arg0 > 42) {
            this.field4163.method1141(256);
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lnf;Lfh;)V", line = 63)
    public class290(class256 arg0, class210 arg1) {
        this.field4161 = arg0;
        this.field4162 = arg1;
    }
}
