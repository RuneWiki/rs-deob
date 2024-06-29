import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class143 {

    @OriginalMember(owner = "client!eea", name = "k", descriptor = "I")
    public int field1915 = 128;

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "I")
    public int field1910 = 128;

    @OriginalMember(owner = "client!eea", name = "m", descriptor = "I")
    public int field1917;

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "I")
    public int field1907;

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "I")
    public int field1909;

    @OriginalMember(owner = "client!eea", name = "o", descriptor = "I")
    public int field1919;

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "I")
    public static int field1911 = -1;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "I")
    public int field1908;

    @OriginalMember(owner = "client!eea", name = "h", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!eea", name = "i", descriptor = "I")
    public int field1913;

    @OriginalMember(owner = "client!eea", name = "j", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!eea", name = "l", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!eea", name = "n", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!eea", name = "p", descriptor = "I")
    public int field1920;

    @OriginalMember(owner = "client!eea", name = "q", descriptor = "I")
    public int field1921;

    @OriginalMember(owner = "client!eea", name = "r", descriptor = "I")
    public int field1922;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method994(String arg0, byte arg1) {
        field1906++;
        class33.field317 = arg0;
        if (class552.field7624 == null) {
            return;
        }
        try {
            String var2 = class552.field7624.getParameter("cookieprefix");
            if (arg1 > -30) {
                field1916 = 3;
            }
            String var3 = class552.field7624.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class191.method1269(10, class401.method2440(false) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class376.method2359("document.cookie=\"" + var5 + "\"", class552.field7624, (byte) 115);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(III)Z")
    public static final boolean method995(int arg0, int arg1, int arg2) {
        field1912++;
        return arg2 == -1 ? (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0 : false;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Leea;B)V")
    public final void method996(class143 arg0, byte arg1) {
        field1905++;
        this.field1910 = arg0.field1910;
        this.field1917 = arg0.field1917;
        this.field1909 = arg0.field1909;
        this.field1919 = arg0.field1919;
        this.field1915 = arg0.field1915;
        this.field1907 = arg0.field1907;
        int var3 = -111 / ((arg1 + 12) / 47);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIILec;I)Ljava/awt/Frame;")
    public static final Frame method997(int arg0, int arg1, int arg2, int arg3, class248 arg4, int arg5) {
        field1918++;
        if (!arg4.method1536((byte) -105)) {
            return null;
        }
        if (arg0 == arg1) {
            class626[] var6 = class307.method1984(arg4, 19304);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field8479 == arg2 && var6[var8].field8481 == arg5 && (arg3 == 0 || var6[var8].field8483 == arg3) && (!var7 || arg0 < var6[var8].field8484)) {
                    arg0 = var6[var8].field8484;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class621 var9 = arg4.method1550(arg2, arg0, arg5, arg3, (byte) 127);
        while (var9.field8405 == 0) {
            class171.method1152(10L, false);
        }
        Frame var10 = (Frame) var9.field8403;
        if (var10 == null) {
            return null;
        } else if (var9.field8405 == 2) {
            class163.method1130(var10, arg4, -128);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)Leea;")
    public final class143 method998(int arg0) {
        int var2 = 50 / ((31 - arg0) / 56);
        field1914++;
        return new class143(this.field1917, this.field1910, this.field1915, this.field1907, this.field1919, this.field1909);
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(I)V")
    public class143(int arg0) {
        this.field1917 = arg0;
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(IIIIII)V")
    private class143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1917 = arg0;
        this.field1907 = arg3;
        this.field1909 = arg5;
        this.field1910 = arg1;
        this.field1915 = arg2;
        this.field1919 = arg4;
    }
}
