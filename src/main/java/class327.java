import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class327 {

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Ljda;")
    public static class240 field4459 = new class240();

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "J")
    public static long field4462 = -1L;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V")
    public static final void method2068(int arg0, int arg1, int arg2) {
        field4461++;
        class281 var3 = class54.method395((byte) -53, (long) arg0, arg2);
        var3.method1821((byte) 107);
        var3.field3910 = arg1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static void method2069(byte arg0) {
        if (arg0 != 1) {
            field4462 = 65L;
        }
        field4459 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2070(byte arg0, String arg1) {
        class178.field2806 = arg1;
        field4460++;
        if (class286.field3936 == null) {
            return;
        }
        if (arg0 != 93) {
            method2070((byte) -112, null);
        }
        try {
            String var2 = class286.field3936.getParameter("cookieprefix");
            String var3 = class286.field3936.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class187.method1385(class197.method1423(arg0 ^ 0x5C) + 94608000000L, 10) + "; Max-Age=" + 94608000L;
            }
            class729.method4042((byte) 104, "document.cookie=\"" + var5 + "\"", class286.field3936);
        } catch (Throwable var6) {
        }
    }
}
