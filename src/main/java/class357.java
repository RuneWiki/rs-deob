import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class357 {

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field5463 = -2;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Z")
    public static boolean field5460 = true;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Lrm;")
    public static class234 field5457 = new class234(64);

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 6)
    public static final void method2328(String arg0, int arg1) {
        field5462++;
        class341.field5264 = arg0;
        if (class63.field822.field4464 == null) {
            return;
        }
        try {
            String var2 = class63.field822.field4464.getParameter("cookieprefix");
            String var3 = class63.field822.field4464.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            if (arg1 <= 97) {
                field5460 = true;
            }
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class306.method2063(true, class46.method297(27104) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class169.method1181(class63.field822.field4464, "document.cookie=\"" + var5 + "\"", (byte) -73);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(Ljava/lang/String;I)V", line = 43)
    public static final void method2329(String arg0, int arg1) {
        class429.method2656(0, arg1, -1, "", arg0, "");
        field5459++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V", line = 52)
    public static void method2330(byte arg0) {
        field5457 = null;
        if (arg0 != -122) {
            field5457 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)I", line = 72)
    public static final int method2331(byte arg0) {
        field5461++;
        int var1 = 10 % ((arg0 - 7) / 50);
        if (class312.field4925) {
            return 0;
        } else if (class117.method852(true)) {
            return class216.field3514 ? 2 : 1;
        } else {
            return 1;
        }
    }
}
