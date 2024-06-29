import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class353 {

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Lhu;")
    private class76 field4896 = new class76(256);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Lbf;")
    private class344 field4894;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Lci;")
    private class287 field4895;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public final void method2177(int arg0) {
        if (arg0 >= -29) {
            this.field4895 = (class287) null;
        }
        this.field4896.method495(-112);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)Lal;")
    public final class58 method2178(int arg0, byte arg1) {
        Object var3 = this.field4896.method493((byte) 19, (long) arg0);
        if (var3 != null) {
            return (class58) var3;
        } else if (this.field4895.method1620(-3810, arg0)) {
            class23 var4 = this.field4895.method1621(18318, arg0);
            int var5 = var4.field309 ? 64 : 128;
            class58 var7;
            if (var4.field297 && this.field4894.method2109()) {
                float[] var6 = this.field4895.method1623((byte) -111, false, arg0, var5, 0.7F, var5);
                var7 = new class58(this.field4894, 3553, 34842, var5, var5, var4.field293 != 0, var6, 6408);
            } else {
                int[] var8 = this.field4895.method1619(0.7F, -6322, var5, false, var5, arg0);
                short var9 = 6408;
                var7 = new class58(this.field4894, 3553, var9, var5, var5, var4.field293 != 0, var8, false);
            }
            var7.method415(var4.field296, var4.field303);
            this.field4896.method505((long) arg0, var7, 96);
            if (arg1 > -65) {
                this.method2178(-58, (byte) -102);
            }
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lbf;Lci;)V")
    public class353(class344 arg0, class287 arg1) {
        this.field4894 = arg0;
        this.field4895 = arg1;
    }
}
