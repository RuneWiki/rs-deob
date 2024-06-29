import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class42 extends class183 {

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "Ljava/lang/String;")
    public String field477;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field476 = 0;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "Lqc;")
    public static class99 field473 = new class99(64);

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "[Lsc;")
    public static class329[] field484 = new class329[32768];

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "Lfm;")
    public static class53 field482 = new class53(64);

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public static int field485 = -1;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "Lkm;")
    public static class133 field486;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 8)
    public static void method256(int arg0) {
        field484 = null;
        field473 = null;
        field482 = null;
        field486 = null;
        if (arg0 < 66) {
            method260(-73, (String) null);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZC)Z", line = 23)
    public static final boolean method257(boolean arg0, char arg1) {
        if (!arg0) {
            field484 = (class329[]) null;
        }
        field475++;
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIZ)I", line = 36)
    public static final int method258(int arg0, int arg1, boolean arg2) {
        field474++;
        if (!arg2) {
            return -86;
        }
        class113 var3 = (class113) class255.field3648.method111(92, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field1546.length; var5++) {
                if (var3.field1541[var5] == arg1) {
                    var4 += var3.field1546[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V", line = 77)
    public static final void method259(int arg0, int arg1) {
        if (arg1 <= -124) {
            class26.field330.method720(arg0, 1088);
            class269.field3998.method720(arg0, 1088);
            field478++;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILjava/lang/String;)V", line = 89)
    public static final void method260(int arg0, String arg1) {
        field480++;
        class165.field2262 = arg1;
        if (class165.field2258.field1157 == null) {
            return;
        }
        try {
            String var2 = class165.field2258.field1157.getParameter("cookieprefix");
            String var3 = class165.field2258.field1157.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class150.method1088(true, class29.method174(27763) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class325.method2276(class165.field2258.field1157, "document.cookie=\"" + var5 + "\"", -74);
        } catch (Throwable var7) {
        }
        if (arg0 < 85) {
            method257(true, (char) 65423);
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V", line = 135)
    public class42() {
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 138)
    public class42(String arg0, int arg1) {
        this.field477 = arg0;
    }
}
