import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class445 {

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "Lbt;")
    private class363 field6481 = new class363(256);

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Lic;")
    private class235 field6482;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "Lks;")
    private class173 field6483;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)Lqb;")
    public final class89 method2734(int arg0, byte arg1) {
        Object var3 = this.field6481.method2310((byte) -127, (long) arg0);
        if (var3 != null) {
            return (class89) var3;
        } else if (this.field6482.method463(arg0, -26564)) {
            class17 var4 = this.field6482.method468((byte) -37, arg0);
            int var5 = var4.field271 ? 64 : 128;
            class89 var7;
            if (var4.field273 && this.field6483.method168()) {
                float[] var6 = this.field6482.method460(false, var5, arg0, -122, 0.7F, var5);
                var7 = new class89(this.field6483, 3553, 34842, var5, var5, var4.field277 != 0, var6, 6408);
            } else {
                int[] var8 = this.field6482.method461(arg0, false, var5, var5, 0.7F, (byte) -96);
                short var9 = 6408;
                var7 = new class89(this.field6483, 3553, var9, var5, var5, var4.field277 != 0, var8, false);
            }
            var7.method599(var4.field268, var4.field263);
            this.field6481.method2299(true, var7, (long) arg0);
            int var10 = 9 / ((arg1 - 62) / 55);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public final void method2735(byte arg0) {
        if (arg0 > 113) {
            this.field6481.method2313(107);
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lks;Lic;)V")
    public class445(class173 arg0, class235 arg1) {
        this.field6482 = arg1;
        this.field6483 = arg0;
    }
}
