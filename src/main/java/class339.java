import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class339 {

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "Lmq;")
    private class104 field4641 = new class104(256);

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Lbc;")
    private class187 field4640;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Lqi;")
    private class458 field4639;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public final void method2011(int arg0) {
        if (arg0 != 34842) {
            this.method2011(80);
        }
        this.field4641.method656(106);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)Lai;")
    public final class201 method2012(int arg0, int arg1) {
        Object var3 = this.field4641.method659((long) arg1, (byte) -1);
        if (var3 != null) {
            return (class201) var3;
        } else if (this.field4640.method1215(14455, arg1)) {
            class192 var4 = this.field4640.method1218(arg1, false);
            int var5 = var4.field2730 ? 64 : 128;
            class201 var7;
            if (var4.field2736 && this.field4639.method1096()) {
                float[] var6 = this.field4640.method1216(arg1, var5, false, 0.7F, -86, var5);
                var7 = new class201(this.field4639, 3553, 34842, var5, var5, var4.field2748 != 0, var6, 6408);
            } else {
                short var8 = 6408;
                int[] var9 = this.field4640.method1217(var5, 0.7F, arg1, var5, (byte) -126, false);
                var7 = new class201(this.field4639, 3553, var8, var5, var5, var4.field2748 != 0, var9, false);
            }
            var7.method1279(var4.field2744, var4.field2745);
            if (arg0 != 6408) {
                this.method2012(81, 16);
            }
            this.field4641.method653(50, (long) arg1, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lqi;Lbc;)V")
    public class339(class458 arg0, class187 arg1) {
        this.field4640 = arg1;
        this.field4639 = arg0;
    }
}
