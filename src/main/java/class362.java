import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class362 {

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "Lmo;")
    private class336 field4986 = new class336(64);

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "Lnl;")
    public class435 field4984;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "Lnl;")
    private class435 field4980;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "Z")
    public static boolean field4981 = true;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public static int field4988 = 0;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
    public final void method2225(int arg0) {
        field4982++;
        class336 var2 = this.field4986;
        synchronized (this.field4986) {
            this.field4986.method2119(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)V")
    public final void method2226(int arg0) {
        if (arg0 != 3) {
            this.method2226(-28);
        }
        field4985++;
        class336 var2 = this.field4986;
        synchronized (this.field4986) {
            this.field4986.method2109(-1);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)Lsl;")
    public final class54 method2227(int arg0, int arg1) {
        field4987++;
        class336 var3 = this.field4986;
        class54 var4;
        synchronized (this.field4986) {
            var4 = (class54) this.field4986.method2113(arg1 ^ arg1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4980.method2633(3, arg0, 108);
        class54 var6 = new class54();
        var6.field806 = this;
        if (var5 != null) {
            var6.method513(new class161(var5), (byte) -116);
        }
        class336 var7 = this.field4986;
        synchronized (this.field4986) {
            this.field4986.method2116((long) arg0, (byte) -120, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(II)V")
    public final void method2228(int arg0, int arg1) {
        field4983++;
        class336 var3 = this.field4986;
        synchronized (this.field4986) {
            this.field4986.method2120((byte) 98, arg1);
            int var4 = 16 / ((arg0 + 63) / 45);
        }
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Llo;ILnl;Lnl;)V")
    public class362(class280 arg0, int arg1, class435 arg2, class435 arg3) {
        this.field4984 = arg3;
        this.field4980 = arg2;
        this.field4980.method2638(1, 3);
    }
}
