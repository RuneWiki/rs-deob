import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class203 {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field3204 = 0;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Z")
    public static volatile boolean field3206 = true;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1411(String arg0, int arg1) {
        field3207++;
        class272.field4343 = arg0;
        if (class194.field3107.field609 == null) {
            return;
        }
        try {
            String var2 = class194.field3107.field609.getParameter("cookieprefix");
            String var3 = class194.field3107.field609.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class282.method1894((byte) 72, class249.method1723((byte) 95) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            if (arg1 > 8) {
                class277.method1849("document.cookie=\"" + var5 + "\"", -122, class194.field3107.field609);
            }
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Leh;I)V")
    public static final void method1412(class137 arg0, int arg1) {
        field3205++;
        class235.field3889 = class86.method470(0, 7460, class222.field3578, arg0);
        class129.field2066 = class42.method232((byte) -79, class80.field993, arg0, 0);
        class159.field2541 = class42.method232((byte) -118, class240.field3957, arg0, 0);
        class213.field3422 = class42.method232((byte) -68, class155.field2489, arg0, 0);
        class245.field4026 = class42.method232((byte) -71, class79.field987, arg0, 0);
        class126.field2026 = class42.method232((byte) -113, class156.field2521, arg0, 0);
        class164.field2608 = class42.method232((byte) -52, class215.field3463, arg0, 0);
        class166.field2673 = class269.method1809(0, arg0, class90.field1129, -107);
        class90.field1121 = class154.method1049(-1, 0, arg0, class42.field523);
        class286.field4559 = class154.method1049(-1, 0, arg0, class106.field1429);
        class288.field4590 = class283.method1900(class45.field578, 0, false, arg0);
        class258.field4179 = class283.method1900(class25.field347, 0, false, arg0);
        class5.field84.method681(class258.field4179, (int[]) null);
        class166.field2664.method681(class258.field4179, (int[]) null);
        class280.field4439.method681(class258.field4179, (int[]) null);
        class227 var2 = class18.method97(arg0, class70.field872, 0, true);
        var2.method1616();
        class155.field2491 = var2;
        class227[] var3 = class86.method470(0, 7460, class136.field2152, arg0);
        if (arg1 < 48) {
            return;
        }
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4].method1616();
        }
        class226.field3630 = var3;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 41.0D) - 20;
        for (int var9 = 0; var9 < class235.field3889.length; var9++) {
            class235.field3889[var9].method1607(var5 + var8, var6 + var8, var7 + var8);
        }
        class119.field1702 = class235.field3889;
    }
}
