import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class88 {

    @OriginalMember(owner = "client!iia", name = "h", descriptor = "Lej;")
    public static class124 field1570 = new class124(5, 3);

    @OriginalMember(owner = "client!iia", name = "i", descriptor = "[I")
    public static int[] field1571 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!iia", name = "e", descriptor = "I")
    public int field1567;

    @OriginalMember(owner = "client!iia", name = "f", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!iia", name = "j", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!iia", name = "d", descriptor = "Ltd;")
    public class454 field1566;

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "Lin;")
    public static class91 field1563;

    @OriginalMember(owner = "client!iia", name = "g", descriptor = "[I")
    public int[] field1569;

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)V")
    public static void method830(int arg0) {
        field1570 = null;
        field1571 = null;
        if (arg0 == 0) {
            field1563 = null;
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(B)Lbo;")
    public static final class727 method831(byte arg0) {
        field1568++;
        if (arg0 != 68) {
            method831((byte) -42);
        }
        return class303.method1967((byte) 95, 1);
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method832(String arg0, boolean arg1) {
        field1565++;
        class640.field8796 = arg0;
        if (!arg1) {
            method831((byte) -48);
        }
        if (class675.field9193 == null) {
            return;
        }
        try {
            String var2 = class675.field9193.getParameter("cookieprefix");
            String var3 = class675.field9193.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class421.method2585(class554.method3190(-53) + 94608000000L, 63) + "; Max-Age=" + 94608000L;
            }
            class43.method540(class675.field9193, -15092, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)V")
    public static final void method833(int arg0) {
        for (int var1 = arg0; var1 < class391.field5761; var1++) {
            int var2 = class179.method1318(class369.field5253 + var1, (byte) -15, class391.field5761) * class589.field8025;
            for (int var3 = 0; var3 < class589.field8025; var3++) {
                int var4 = class179.method1318(var3 + class94.field1656, (byte) -15, class589.field8025) + var2;
                if (class58.field1149[var4] == class576.field7925) {
                    class478.field6662[var4].method2958(0, 0, class273.field3847, class386.field5603, class273.field3847 * var3, class386.field5603 * var1, true, true);
                }
            }
        }
        field1564++;
    }
}
