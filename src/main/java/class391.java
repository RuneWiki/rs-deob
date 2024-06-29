import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class391 {

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "Luf;")
    private class380 field5231 = new class380(64);

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "Lga;")
    private class332 field5233;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "Leba;")
    public static class550 field5232 = new class550(50, 6);

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field5235 = 0;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public static int field5236 = 0;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BI)Lps;")
    public final class466 method2255(byte arg0, int arg1) {
        field5230++;
        if (arg0 != -88) {
            return null;
        }
        class380 var3 = this.field5231;
        class466 var4;
        synchronized (this.field5231) {
            var4 = (class466) this.field5231.method2176(-127, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class332 var5 = this.field5233;
        byte[] var6;
        synchronized (this.field5233) {
            var6 = this.field5233.method1938(arg1, 5, -17);
        }
        class466 var7 = new class466();
        if (var6 != null) {
            var7.method2597(new class157(var6), -1);
        }
        class380 var8 = this.field5231;
        synchronized (this.field5231) {
            this.field5231.method2174(var7, (long) arg1, (byte) 122);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
    public static void method2256(int arg0) {
        if (arg0 != 0) {
            field5235 = -4;
        }
        field5232 = null;
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lnq;ILga;)V")
    public class391(class650 arg0, int arg1, class332 arg2) {
        this.field5233 = arg2;
        this.field5233.method1939(0, 5);
    }
}
