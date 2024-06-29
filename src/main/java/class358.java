import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public abstract class class358 {

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "Lwr;")
    public static class459 field4748 = new class459(32);

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "Lfc;")
    public static class262 field4752 = new class262(64);

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public static int field4754 = 0;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "Lgm;")
    public static class125 field4753 = new class125("", 10);

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V", line = 4)
    public static void method2058(int arg0) {
        field4752 = null;
        field4753 = null;
        field4748 = null;
        if (arg0 != -1) {
            field4754 = 44;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(III)I", line = 18)
    public static final int method2059(int arg0, int arg1, int arg2) {
        field4751++;
        double var3 = Math.log((double) arg1) / Math.log(2.0D);
        double var5 = Math.log((double) arg0) / Math.log(2.0D);
        int var7 = 107 % ((arg2 + 33) / 52);
        double var8 = var5 + Math.random() * (var3 - var5);
        return (int) (Math.pow(2.0D, var8) + 0.5D);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/lang/String;)V", line = 35)
    public static final void method2061(int arg0, String arg1) {
        field4749++;
        class734.field10237 = arg1;
        if (class144.field1868 == null) {
            return;
        }
        try {
            String var2 = class144.field1868.getParameter("cookieprefix");
            String var3 = class144.field1868.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            if (arg0 != 19208) {
                field4753 = null;
            }
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class450.method2520(5090, class538.method2963(arg0 - 19255) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class679.method3853(class144.field1868, "document.cookie=\"" + var5 + "\"", 9202);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)V", line = 72)
    public static final void method2062(byte arg0) {
        field4750++;
        class362.field4796.method1563(18);
        int var1 = 80 % ((arg0 - 38) / 44);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)J")
    public abstract long method2060(byte arg0);
}
