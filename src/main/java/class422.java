import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class422 {

    @OriginalMember(owner = "client!nw", name = "h", descriptor = "I")
    public int field5951 = 1;

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "I")
    public static int field5950 = 0;

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "Lkn;")
    public static class530 field5949 = new class530("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!nw", name = "j", descriptor = "Leh;")
    public static class246 field5953 = new class246(61, 8);

    @OriginalMember(owner = "client!nw", name = "k", descriptor = "[C")
    public static char[] field5954 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "C")
    public char field5947;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!nw", name = "i", descriptor = "Lo;")
    public static class24 field5952;

    @OriginalMember(owner = "client!nw", name = "l", descriptor = "Lqc;")
    public static class532 field5955;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "[I")
    public static int[] field5944;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V")
    public static void method2501(int arg0) {
        field5954 = null;
        field5949 = null;
        field5955 = null;
        field5952 = null;
        if (arg0 <= 28) {
            field5955 = null;
        }
        field5953 = null;
        field5944 = null;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IILwm;)V")
    private final void method2502(int arg0, int arg1, class403 arg2) {
        field5946++;
        if (arg0 == 1) {
            this.field5947 = class120.method805(arg2.method2359(64), (byte) -21);
        } else if (arg0 == 2) {
            this.field5951 = 0;
        }
        if (arg1 > -101) {
            method2501(59);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(III)Z")
    public static final boolean method2503(int arg0, int arg1, int arg2) {
        int var3 = class520.field7650[arg0][arg1][arg2];
        if (-class479.field6683 == var3) {
            return false;
        } else if (class479.field6683 == var3) {
            return true;
        } else {
            int var4 = arg1 << class493.field6970;
            int var5 = arg2 << class493.field6970;
            if (class395.method2299(var4 + 1, class330.field4818[arg0].method10(arg1, arg2), var5 + 1) && class395.method2299(class169.field2463 + var4 - 1, class330.field4818[arg0].method10(arg1 + 1, arg2), var5 + 1) && class395.method2299(class169.field2463 + var4 - 1, class330.field4818[arg0].method10(arg1 + 1, arg2 + 1), class169.field2463 + var5 - 1) && class395.method2299(var4 + 1, class330.field4818[arg0].method10(arg1, arg2 + 1), class169.field2463 + var5 - 1) && class395.method2299(class534.field7832 + var4, class330.field4818[arg0].method10(arg1, arg2), var5 + 1) && class395.method2299(class169.field2463 + var4 - 1, class330.field4818[arg0].method10(arg1 + 1, arg2), class534.field7832 + var5) && class395.method2299(class534.field7832 + var4, class330.field4818[arg0].method10(arg1, arg2 + 1), class169.field2463 + var5 - 1) && class395.method2299(class169.field2463 + var4 - 1, class330.field4818[arg0].method10(arg1, arg2), class534.field7832 + var5) && class395.method2299(class534.field7832 + var4, class330.field4818[arg0].method10(arg1, arg2), class534.field7832 + var5)) {
                class520.field7650[arg0][arg1][arg2] = class479.field6683;
                return true;
            } else {
                class520.field7650[arg0][arg1][arg2] = -class479.field6683;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lwm;B)V")
    public final void method2504(class403 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2357((byte) 108);
            if (var3 == 0) {
                if (arg1 != 114) {
                    method2503(56, -33, -72);
                }
                field5945++;
                return;
            }
            this.method2502(var3, -108, arg0);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2505(String arg0, int arg1) {
        field5948++;
        class284.field4166 = arg0;
        if (class268.field3914.field2165 == null) {
            return;
        }
        try {
            if (arg1 <= 47) {
                field5944 = null;
            }
            String var2 = class268.field3914.field2165.getParameter("cookieprefix");
            String var3 = class268.field3914.field2165.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class534.method3143(class465.method2699((byte) 14) + 94608000000L, 29541) + "; Max-Age=" + 94608000L;
            }
            class297.method1824(class268.field3914.field2165, (byte) -53, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var6) {
        }
    }
}
