import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public abstract class class459 extends class623 {

    @OriginalMember(owner = "client!nq", name = "A", descriptor = "Z")
    public volatile boolean field6563 = true;

    @OriginalMember(owner = "client!nq", name = "x", descriptor = "[Z")
    public static boolean[] field6560 = new boolean[100];

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "Z")
    public boolean field6561;

    @OriginalMember(owner = "client!nq", name = "C", descriptor = "Z")
    public boolean field6565;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)V")
    public static final void method2805(int arg0, int arg1) {
        field6562++;
        class456 var2 = (class456) class228.field2651.method1754(false, (long) arg0);
        if (var2 != null) {
            var2.field6543.method3491(-1);
            class444.method2755(var2.field6535, 10501, var2.field6544);
            var2.method864(12983);
        }
        int var3 = -48 % ((arg1 - 13) / 44);
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)V")
    public static void method2806(boolean arg0) {
        if (!arg0) {
            method2807(false, null);
        }
        field6560 = null;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)[B")
    public abstract byte[] method1206(byte arg0);

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method2807(boolean arg0, String arg1) {
        class608.field8638 = arg1;
        field6558++;
        if (arg0) {
            field6560 = null;
        }
        if (class255.field3123 == null) {
            return;
        }
        try {
            String var2 = class255.field3123.getParameter("cookieprefix");
            String var3 = class255.field3123.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class397.method2433(class652.method3700(-1) + 94608000000L, -2209) + "; Max-Age=" + 94608000L;
            }
            class393.method2416(class255.field3123, -25442, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)I")
    public static final int method2808(int arg0) {
        field6564++;
        if (arg0 != -3263) {
            field6560 = null;
        }
        int var1 = class92.field959.method3390(arg0 + 3276);
        if (client.field3743.length - 1 > var1) {
            class92.field959 = client.field3743[var1 + 1];
        }
        return 100;
    }

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)I")
    public abstract int method1211(int arg0);
}
