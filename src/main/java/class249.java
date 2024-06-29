import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class249 extends class145 {

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "Lke;")
    public static class256 field4237 = class316.method2202(" )2> <col=00ffff>", 27626);

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field4236 = 0;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "Lke;")
    public static class256 field4232 = class316.method2202(")3", 27626);

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field4235 = 0;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Lng;")
    public static class138 field4233;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "[[[B")
    public static byte[][][] field4234;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lra;I)Lkg;", line = 5)
    public static final class111 method1677(class41 arg0, int arg1) {
        field4231++;
        return arg1 == 0 ? new class111(arg0.method309(2), arg0.method309(2), arg0.method309(2), arg0.method309(2), arg0.method349((byte) -112), arg0.method349((byte) -122), arg0.method357(false)) : (class111) null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V", line = 36)
    public static void method1678(int arg0) {
        if (arg0 != -1) {
            field4235 = -53;
        }
        field4232 = null;
        field4234 = (byte[][][]) null;
        field4233 = null;
        field4237 = null;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)V", line = 53)
    public static final void method1679(int arg0, int arg1) {
        field4238++;
        class77 var2 = class156.method1158(arg1, false, arg0);
        var2.method586((byte) 98);
    }
}
