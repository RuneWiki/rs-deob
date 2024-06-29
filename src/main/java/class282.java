import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class282 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Lkm;", line = 30)
    public static final class94 method2071(int arg0, int arg1) {
        class94 var2 = (class94) class169.field2676.method2329((byte) 107, (long) arg0);
        field4625++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class27.field331.method472(class208.method1576(arg1 ^ 0x7B, arg0), 64, class257.method1973(arg1 ^ 0xFFFFE93D, arg0));
        class94 var4 = new class94();
        var4.field1581 = arg0;
        if (var3 != null) {
            var4.method733(~arg1, new class227(var3));
        }
        class169.field2676.method2333((long) arg0, arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 55)
    public static final void method2072(String arg0, int arg1) {
        field4622++;
        if (arg1 != 7875) {
            method2073(3, -98, 3);
        }
        class14.field155 = arg0;
        if (class128.field2163.field2350 == null) {
            return;
        }
        try {
            String var2 = class128.field2163.field2350.getParameter("cookieprefix");
            String var3 = class128.field2163.field2350.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class165.method1282((byte) -110, class47.method371(-116) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class88.method701(class128.field2163.field2350, 31343, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)Lob;", line = 93)
    public static final class184 method2073(int arg0, int arg1, int arg2) {
        class36 var3 = class129.field2184[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class184 var4 = var3.field537;
            var3.field537 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)V", line = 125)
    public static final void method2074(int arg0, int arg1) {
        field4623++;
        if (arg1 == 22778) {
            class354 var2 = (class354) class329.field5229.method1268(12, (long) arg0);
            if (var2 != null) {
                var2.method330(arg1 - 22763);
            }
        }
    }
}
