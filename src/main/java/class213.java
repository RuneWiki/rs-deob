import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class213 {

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Lfg;")
    private class18 field3154 = new class18(256);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Lcj;")
    private class181 field3152;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Lge;")
    private class104 field3153;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public final void method1622(int arg0) {
        this.field3154.method106((byte) -116);
        if (arg0 != -1) {
            this.field3153 = (class104) null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZ)Llb;")
    public final class208 method1623(int arg0, boolean arg1) {
        Object var3 = this.field3154.method103(0, (long) arg0);
        if (var3 != null) {
            return (class208) var3;
        } else if (!this.field3152.method1415((byte) 98, arg0)) {
            return null;
        } else if (arg1) {
            class200 var4 = this.field3152.method1412(arg0, (byte) -85);
            int var5 = var4.field2931 ? 64 : 128;
            class208 var7;
            if (var4.field2927 && this.field3153.method743()) {
                float[] var6 = this.field3152.method1414(arg0, false, var5, true, 0.7F, var5);
                var7 = new class208(this.field3153, 3553, 34842, var5, var5, var4.field2926 != 0, var6, 6408);
            } else {
                short var8 = 6408;
                int[] var9 = this.field3152.method1411(arg0, (byte) -90, var5, 0.7F, var5, false);
                var7 = new class208(this.field3153, 3553, var8, var5, var5, var4.field2926 != 0, var9, false);
            }
            var7.method1574(var4.field2915, var4.field2923);
            this.field3154.method113(var7, 0, (long) arg0);
            return var7;
        } else {
            return (class208) null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lge;Lcj;)V")
    public class213(class104 arg0, class181 arg1) {
        this.field3152 = arg1;
        this.field3153 = arg0;
    }
}
