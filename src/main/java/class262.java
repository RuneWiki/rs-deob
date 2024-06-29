import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class262 {

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4261 = "";

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field4265 = 0;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Lnj;")
    public static class144 field4266 = new class144(16);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BJ)V")
    public static final void method1835(byte arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field4264++;
        if (arg0 != -124) {
            field4265 = 124;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1836(String arg0, byte arg1) {
        class154.field2539 = arg0;
        field4263++;
        if (class138.field2241.field63 == null) {
            return;
        }
        try {
            String var2 = class138.field2241.field63.getParameter("cookieprefix");
            String var3 = class138.field2241.field63.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class184.method1365(2, class197.method1454((byte) -104) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class54.method406(class138.field2241.field63, "document.cookie=\"" + var5 + "\"", -124);
            int var6 = 76 % ((arg1 + 63) / 36);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIBI)V")
    public static final void method1837(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -41) {
            field4265 = -47;
        }
        field4260++;
        class201 var5 = class94.method738(-51, arg4, 10);
        var5.method1477(0);
        var5.field3226 = arg1;
        var5.field3224 = arg2;
        var5.field3219 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIB)V")
    public static final void method1838(int arg0, int arg1, byte arg2) {
        if (arg2 == 5) {
            field4259++;
            class29.field339 = arg0 - class227.field3636;
            class112.field1613 = class52.field753 + class122.field1786 - arg1 - 1;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public static void method1839(byte arg0) {
        field4261 = null;
        field4266 = null;
        if (arg0 < 5) {
            field4265 = -68;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
    public static final void method1840(int arg0, int arg1) {
        if (arg1 != 16) {
            field4261 = null;
        }
        class78.field1133.method1548(arg0, 0);
        field4262++;
    }
}
