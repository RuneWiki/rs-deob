import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class127 {

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    private int field1822 = 0;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Lac;")
    private class153 field1815;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "[I")
    public static int[] field1821 = new int[200];

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1824 = " is already on your friend list.";

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field1826 = -1;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "Ltf;")
    public static class244 field1818;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Lid;")
    private class247 field1825;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "[I")
    public static int[] field1823;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method817(byte arg0, String arg1) {
        field1816++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class200.method1393((byte) -128, arg1.charAt(var4)) + (var3 << 5) - var3;
        }
        if (arg0 != 84) {
            field1818 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public static void method818(byte arg0) {
        field1821 = null;
        field1818 = null;
        field1824 = null;
        if (arg0 != 35) {
            field1823 = null;
        }
        field1823 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)Lid;")
    public final class247 method819(int arg0) {
        field1819++;
        this.field1822 = 0;
        return arg0 == -29274 ? this.method821(-24864) : null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method820(String arg0, byte arg1) {
        field1820++;
        class140.field2003 = arg0;
        if (class95.field1425.field3832 == null) {
            return;
        }
        try {
            if (arg1 < 39) {
                method818((byte) -12);
            }
            String var2 = class95.field1425.field3832.getParameter("cookieprefix");
            String var3 = class95.field1425.field3832.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class231.method1632(class98.method665(true) + 94608000000L, 10) + "; Max-Age=" + 94608000L;
            }
            class25.method133("document.cookie=\"" + var5 + "\"", class95.field1425.field3832, true);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)Lid;")
    public final class247 method821(int arg0) {
        field1817++;
        if (this.field1822 > 0 && this.field1815.field2286[this.field1822 - 1] != this.field1825) {
            class247 var2 = this.field1825;
            this.field1825 = var2.field4013;
            return var2;
        } else if (arg0 == -24864) {
            while (this.field1822 < this.field1815.field2293) {
                class247 var3 = this.field1815.field2286[this.field1822++].field4013;
                if (this.field1815.field2286[this.field1822 - 1] != var3) {
                    this.field1825 = var3.field4013;
                    return var3;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lac;)V")
    public class127(class153 arg0) {
        this.field1815 = arg0;
    }
}
