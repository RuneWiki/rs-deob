import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class243 {

    @OriginalMember(owner = "client!un", name = "a", descriptor = "Lfi;")
    private class331 field3288 = new class331(256);

    @OriginalMember(owner = "client!un", name = "b", descriptor = "Lbm;")
    private class60 field3289;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "Lpo;")
    private class332 field3290;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)Lfc;", line = 5)
    public final class141 method1537(int arg0, int arg1) {
        Object var3 = this.field3288.method2049(arg1 - 181, (long) arg0);
        if (var3 != null) {
            return (class141) var3;
        } else if (this.field3289.method369(arg0, (byte) -100)) {
            class311 var4 = this.field3289.method371(arg0, (byte) 96);
            int var5 = var4.field4442 ? 64 : 128;
            class141 var7;
            if (var4.field4443 && this.field3290.method925()) {
                float[] var6 = this.field3289.method370(arg0, false, (byte) -74, var5, 0.7F, var5);
                var7 = new class141(this.field3290, 3553, 34842, var5, var5, var4.field4430 != 0, var6, 6408);
            } else {
                short var8 = 6408;
                int[] var9 = this.field3289.method372(var5, -128, false, arg0, 0.7F, var5);
                var7 = new class141(this.field3290, 3553, var8, var5, var5, var4.field4430 != 0, var9, false);
            }
            var7.method837(var4.field4434, var4.field4431);
            this.field3288.method2046((long) arg0, 0, var7);
            if (arg1 != 128) {
                this.field3289 = (class60) null;
            }
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V", line = 51)
    public final void method1538(int arg0) {
        this.field3288.method2043(-33);
        int var2 = -78 / ((62 - arg0) / 57);
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lpo;Lbm;)V", line = 62)
    public class243(class332 arg0, class60 arg1) {
        this.field3289 = arg1;
        this.field3290 = arg0;
    }
}
