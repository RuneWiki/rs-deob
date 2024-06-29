import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class283 extends class108 {

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "Lmg;")
    public static class272 field4469 = new class272(0, 0);

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field4475 = 0;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)Ljava/lang/String;")
    public static final String method1898(byte arg0) {
        if (arg0 != 46) {
            return null;
        }
        field4476++;
        String var1 = "";
        String var2 = "www";
        if (class174.field2588 != null) {
            var1 = "/p=" + class174.field2588;
        }
        if (class238.field3689 != 0) {
            var2 = "www-wtqa";
        }
        return "http://" + var2 + ".runescape.com/l=" + class226.field3542 + "/a=" + class274.field4315 + var1 + "/";
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIBI)V")
    public static final void method1899(int arg0, int arg1, byte arg2, int arg3) {
        class220.method1471(-1, false);
        class136.field2122 = arg3;
        if (arg2 > -101) {
            field4475 = -18;
        }
        class157.field2422 = arg1;
        class260.method1731(false, arg0);
        field4471++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V")
    public static final void method1900(int arg0, int arg1) {
        field4472++;
        class295 var2 = class250.method1673(23, arg1, arg0);
        var2.method1979(-8205);
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
    public static void method1901(byte arg0) {
        int var1 = -111 % ((-arg0 - 27) / 37);
        field4469 = null;
    }
}
