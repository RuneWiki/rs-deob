import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class471 {

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "Lhj;")
    private class47 field6533;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "J")
    public long field6536;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "Lal;")
    public static class125 field6531 = new class125();

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "Ljn;")
    public static class324 field6532 = new class324(15, 0, 1, 0);

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "Lwn;")
    public static class585 field6535 = new class585("", 19);

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLjava/lang/String;)V", line = 4)
    public static final void method2865(byte arg0, String arg1) {
        field6534++;
        class237.field3514 = arg1;
        if (class320.field4445 == null) {
            return;
        }
        try {
            String var2 = class320.field4445.getParameter("cookieprefix");
            String var3 = class320.field4445.getParameter("cookiehost");
            int var4 = 42 / ((arg0 + 15) / 61);
            String var5 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var6;
            if (arg1.length() == 0) {
                var6 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var6 = var5 + "; Expires=" + class204.method1236(class97.method664((byte) -50) + 94608000000L, -21) + "; Max-Age=" + 94608000L;
            }
            class69.method539("document.cookie=\"" + var6 + "\"", class320.field4445, -23636);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V", line = 42)
    public static void method2866(byte arg0) {
        field6535 = null;
        field6531 = null;
        if (arg0 == 58) {
            field6532 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "finalize", descriptor = "()V", line = 61)
    protected final void finalize() throws Throwable {
        this.field6533.method261(this.field6536, false);
        field6530++;
        super.finalize();
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lhj;J[Lws;)V", line = 74)
    public class471(class47 arg0, long arg1, class696[] arg2) {
        this.field6533 = arg0;
        this.field6536 = arg1;
    }
}
