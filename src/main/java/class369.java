import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class369 {

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)Lvl;", line = 4)
    public static final class11 method2138(int arg0, int arg1, int arg2) {
        class409 var3 = class497.field6886[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5628;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 13)
    public static final void method2139(String arg0, boolean arg1) {
        class88.field1341 = arg0;
        if (arg1) {
            return;
        }
        field4972++;
        if (class389.field5281.field2917 == null) {
            return;
        }
        try {
            String var2 = class389.field5281.field2917.getParameter("cookieprefix");
            String var3 = class389.field5281.field2917.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class96.method684(class498.method2854(-114) + 94608000000L, false) + "; Max-Age=" + 94608000L;
            }
            class87.method639((byte) -63, class389.field5281.field2917, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var6) {
        }
    }
}
