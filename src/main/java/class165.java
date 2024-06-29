import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class165 {

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "B")
    public byte field2274;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "Lbda;")
    public static class505 field2263 = new class505(4);

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "Lqfa;")
    public static class98 field2264 = new class98(40, 10);

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "Lwq;")
    public class165 field2272;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "Lem;")
    public static class223 field2262;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "Lbga;")
    public class356 field2270;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "Llv;")
    public class444 field2265;

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "Llv;")
    public class444 field2269;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "Lsl;")
    public class458 field2267;

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "Lsl;")
    public class458 field2278;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "Llh;")
    public class526 field2266;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "Ldha;")
    public class77 field2271;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "S")
    public short field2273;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "S")
    public short field2275;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "S")
    public short field2276;

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "S")
    public short field2277;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
    public final void method1082(byte arg0) {
        field2268++;
        if (arg0 != 46) {
            return;
        }
        while (this.field2270 != null) {
            class356 var2 = this.field2270.field5066;
            this.field2270.method2292(-501);
            this.field2270 = var2;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public static void method1083(int arg0) {
        field2262 = null;
        field2263 = null;
        if (arg0 < -81) {
            field2264 = null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(I)V")
    public class165(int arg0) {
        this.field2274 = (byte) arg0;
    }
}
