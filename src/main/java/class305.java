import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class305 {

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Lhq;")
    private class365 field4098 = new class365(256);

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Lgd;")
    private class172 field4100;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Lh;")
    private class327 field4099;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V", line = 5)
    public final void method1939(byte arg0) {
        this.field4098.method2298(0);
        if (arg0 <= 95) {
            this.method1939((byte) -92);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)Lbj;", line = 18)
    public final class313 method1940(int arg0, int arg1) {
        Object var3 = this.field4098.method2295((long) arg1, (byte) 74);
        if (var3 != null) {
            return (class313) var3;
        } else if (this.field4100.method963(arg1, true)) {
            class358 var4 = this.field4100.method960(arg1, (byte) -40);
            int var5 = var4.field4856 ? 64 : 128;
            if (arg0 >= -106) {
                this.field4100 = (class172) null;
            }
            class313 var7;
            if (var4.field4851 && this.field4099.method714()) {
                float[] var6 = this.field4100.method971(0.7F, false, arg1, var5, var5, false);
                var7 = new class313(this.field4099, 3553, 34842, var5, var5, var4.field4865 != 0, var6, 6408);
            } else {
                short var8 = 6408;
                int[] var9 = this.field4100.method964(arg1, var5, -22968, 0.7F, var5, false);
                var7 = new class313(this.field4099, 3553, var8, var5, var5, var4.field4865 != 0, var9, false);
            }
            var7.method1975(var4.field4868, var4.field4857);
            this.field4098.method2294(var7, (byte) 62, (long) arg1);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lh;Lgd;)V", line = 63)
    public class305(class327 arg0, class172 arg1) {
        this.field4100 = arg1;
        this.field4099 = arg0;
    }
}
