import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class26 {

    @OriginalMember(owner = "client!qaa", name = "h", descriptor = "I")
    public int field306 = -1;

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "Lws;")
    public static class333 field303 = new class333();

    @OriginalMember(owner = "client!qaa", name = "l", descriptor = "Z")
    public static boolean field310 = false;

    @OriginalMember(owner = "client!qaa", name = "k", descriptor = "Lhg;")
    public static class647 field309 = new class647(0);

    @OriginalMember(owner = "client!qaa", name = "m", descriptor = "Ljava/lang/String;")
    public static String field311 = null;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "I")
    public int field299;

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
    public int field300;

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "I")
    public int field301;

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "I")
    public int field302;

    @OriginalMember(owner = "client!qaa", name = "f", descriptor = "I")
    public int field304;

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "I")
    public int field305;

    @OriginalMember(owner = "client!qaa", name = "i", descriptor = "I")
    public int field307;

    @OriginalMember(owner = "client!qaa", name = "j", descriptor = "I")
    public int field308;

    @OriginalMember(owner = "client!qaa", name = "n", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!qaa", name = "o", descriptor = "Lkaa;")
    public static class44 field313;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IB)V")
    public static final void method162(int arg0, byte arg1) {
        field312++;
        class243 var2 = class546.method2926(arg0, 1, true);
        if (arg1 != 45) {
            field310 = false;
        }
        var2.method1455(true);
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)V")
    public static void method163(int arg0) {
        field313 = null;
        field303 = null;
        if (arg0 != -1) {
            field313 = null;
        }
        field309 = null;
        field311 = null;
    }
}
