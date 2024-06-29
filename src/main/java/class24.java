import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class24 {

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "Lhl;")
    public static class139 field387 = new class139(16);

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "Ljava/lang/String;")
    public static String field393 = "Members object";

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "[C")
    public static char[] field392 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field394 = 0;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Lpk;")
    public static class237 field390;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "Lpk;")
    public static class237 field391;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "[Z")
    public static boolean[] field388;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public static final void method161(byte arg0) {
        field386++;
        class43.method347(-161, 5);
        class272.method1823(5, 12230);
        class103.method754(5, -28973);
        class284.method1883(160, 5);
        class211.method1395(5, 95);
        class125.method877((byte) 86, 5);
        class254.method1728(5, 10);
        class19.method137(5, 69);
        class115.method825(5, (byte) 83);
        class156.method1057(-201, 5);
        class21.method146((byte) -122, 5);
        class296.method1949(5, (byte) -62);
        class1.method2(-31300, 5);
        class22.method155(5, 957);
        class131.method899(-110, 5);
        class225.method1543(5, (byte) 91);
        if (arg0 < 107) {
            field392 = null;
        }
        class73.method583(-1, 5);
        class147.method1002(50, (byte) -85);
        class85.method655(-7263, 5);
        class27.method196(5, -3);
        class166.field2446.method938(5, (byte) -123);
        class270.field4217.method938(5, (byte) -123);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method162(String arg0, boolean arg1) {
        field389++;
        class4.field58 = arg0;
        if (class217.field3338.field505 == null) {
            return;
        }
        try {
            if (arg1) {
                method162((String) null, false);
            }
            String var2 = class217.field3338.field505.getParameter("cookieprefix");
            String var3 = class217.field3338.field505.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class247.method1693((byte) 69, class257.method1736(14361) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class238.method1633((byte) -123, "document.cookie=\"" + var5 + "\"", class217.field3338.field505);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static void method163(int arg0) {
        field391 = null;
        field388 = null;
        field390 = null;
        field387 = null;
        field393 = null;
        if (arg0 != 5) {
            method163(-98);
        }
        field392 = null;
    }
}
