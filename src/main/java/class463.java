import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class463 {

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public int field6056;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "J")
    public long field6062;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public int field6055;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "Ljava/lang/String;")
    public String field6063;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Ljava/lang/String;")
    public String field6061;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "Law;")
    public static class506 field6064;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2588(String arg0, byte arg1) {
        if (arg1 >= -27) {
            return;
        }
        class384.field4915 = arg0;
        field6058++;
        if (class348.field4462 == null) {
            return;
        }
        try {
            String var2 = class348.field4462.getParameter("cookieprefix");
            String var3 = class348.field4462.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class305.method1799(-19484, class584.method3191(1) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class92.method689(true, "document.cookie=\"" + var5 + "\"", class348.field4462);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIB)I")
    public static final int method2589(int arg0, int arg1, byte arg2) {
        if (arg2 >= -106) {
            method2588(null, (byte) 46);
        }
        field6057++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static void method2590(int arg0) {
        if (arg0 != 12345678) {
            field6059 = -123;
        }
        field6064 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZIILpe;)Lfca;")
    public static final class645 method2591(boolean arg0, int arg1, int arg2, class615 arg3) {
        field6060++;
        if (arg0) {
            byte[] var4 = arg3.method3346(-1, arg1, arg2);
            return var4 == null ? null : new class645(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class463(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field6056 = arg0;
        this.field6062 = arg4;
        this.field6055 = arg2;
        this.field6063 = arg1;
        this.field6061 = arg3;
    }
}
