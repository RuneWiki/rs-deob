import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class307 {

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4835 = "Please remove ";

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field4839 = 0;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "[I")
    public static int[] field4840 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field4844 = -1;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)I", line = 4)
    public static final int method2110(int arg0, int arg1, int arg2) {
        field4837++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg2 != 3326) {
            field4832 = -79;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZIIZZ)V", line = 29)
    public static final void method2111(boolean arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        field4831++;
        if (arg0) {
            field4844 = -68;
        }
        class166.method1134(0, (byte) 113, arg2, arg4, class266.field4108.length - 1, arg3, arg1);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BCLjava/lang/String;)I", line = 44)
    public static final int method2112(byte arg0, char arg1, String arg2) {
        field4843++;
        int var3 = arg2.length();
        int var4 = 0;
        if (arg0 != 102) {
            method2113(20, 15, 109, 70);
        }
        for (int var5 = 0; var5 < var3; var5++) {
            if (arg1 == arg2.charAt(var5)) {
                var4++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)V", line = 72)
    public static final void method2113(int arg0, int arg1, int arg2, int arg3) {
        field4845++;
        if (arg0 != -5) {
            return;
        }
        if (arg3 == 0) {
            class219.field3491++;
            class265.field4095.method2064(255, 155);
            class265.field4095.method2034(-111, 5);
        }
        if (arg3 == 1) {
            class143.field2264++;
            class265.field4095.method2064(255, 137);
            class265.field4095.method2034(-31, 19);
        }
        class265.field4095.method2031((byte) 106, class294.field4534[82] ? 1 : 0);
        class265.field4095.method2055(class30.field374 + arg2, arg0 + 6);
        class265.field4095.method1997(class294.field4535 + arg1, arg0 ^ 0xFFFF9D24);
        class228.field3660 = arg1;
        class133.field2099 = arg2;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZBI)Ljava/lang/String;", line = 102)
    public static final String method2114(boolean arg0, byte arg1, int arg2) {
        field4841++;
        if (arg1 != -17) {
            method2110(30, 34, -8);
        }
        return arg0 && arg2 >= 0 ? class139.method943(arg0, arg2, 10, 43) : Integer.toString(arg2);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 119)
    public static final void method2115(byte arg0) {
        class154.method1075();
        field4838++;
        for (int var1 = 0; var1 < 4; var1++) {
            class33.field425[var1].method1921(-21761);
        }
        if (arg0 != 117) {
            method2116(73);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)I", line = 146)
    public static final int method2116(int arg0) {
        field4842++;
        if (arg0 != 32) {
            return -11;
        } else if (class23.field293 == null) {
            return -1;
        } else {
            while (class46.field645 < class23.field293.field1862) {
                if (class23.field293.method821(class46.field645, -117)) {
                    return class46.field645++;
                }
                class46.field645++;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILjava/lang/String;)V", line = 173)
    public static final void method2117(int arg0, String arg1) {
        class266.field4101 = arg1;
        field4836++;
        if (class89.field1359.field3569 == null) {
            return;
        }
        try {
            if (arg0 != -5709) {
                method2110(86, -41, -16);
            }
            String var2 = class89.field1359.field3569.getParameter("cookieprefix");
            String var3 = class89.field1359.field3569.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class71.method509(class195.method1322(arg0 ^ 0xFFFFE9CD) + 94608000000L, arg0 + 5711) + "; Max-Age=" + 94608000L;
            }
            class254.method1716(class89.field1359.field3569, "document.cookie=\"" + var5 + "\"", -20114);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V", line = 215)
    public static void method2118(byte arg0) {
        if (arg0 < -31) {
            field4840 = null;
            field4835 = null;
        }
    }
}
