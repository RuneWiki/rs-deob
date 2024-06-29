import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class137 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lh;")
    public static class572 field1958 = new class572("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Z")
    public static volatile boolean field1962 = true;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lje;")
    public static class341 field1961;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public static void method961(byte arg0) {
        field1958 = null;
        int var1 = 62 / ((arg0 - 22) / 58);
        field1961 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BD)V")
    public static final void method962(byte arg0, double arg1) {
        if (class1.field7 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class615.field9104[var3] = var4 <= 255 ? var4 : 255;
            }
            class1.field7 = arg1;
        }
        field1959++;
        if (arg0 != 86) {
            field1962 = false;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method963(String arg0, int arg1) {
        field1960++;
        class595.field8788 = arg0;
        if (class442.field5896.field4568 == null) {
            return;
        }
        try {
            if (arg1 != 255) {
                method963(null, 82);
            }
            String var2 = class442.field5896.field4568.getParameter("cookieprefix");
            String var3 = class442.field5896.field4568.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class626.method3659((byte) 126, class598.method3538(true) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class640.method3703("document.cookie=\"" + var5 + "\"", class442.field5896.field4568, arg1 + 20693);
        } catch (Throwable var6) {
        }
    }
}
