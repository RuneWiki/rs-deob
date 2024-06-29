import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class627 {

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Lhf;")
    public static class363 field8993 = new class363();

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "[I")
    public static int[] field8996 = new int[14];

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "F")
    public static float field8994;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field8989;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field8990;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field8992;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field8995;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Ljava/applet/Applet;")
    public static Applet field8991;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static void method3603(byte arg0) {
        field8991 = null;
        if (arg0 < 85) {
            field8991 = null;
        }
        field8993 = null;
        field8996 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lna;B)Lrfa;")
    public static final class182 method3604(class43 arg0, byte arg1) {
        field8989++;
        if (arg1 != -69) {
            field8992 = 79;
        }
        class182 var2;
        if (class557.field8062 == null) {
            var2 = new class182();
        } else {
            var2 = class557.field8062;
            class557.field8062 = class557.field8062.field2226;
            var2.field2226 = null;
            class516.field7548--;
        }
        var2.field2227 = arg0;
        return var2;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLio;ZILio;)I")
    public static final int method3605(byte arg0, class404 arg1, boolean arg2, int arg3, class404 arg4) {
        field8990++;
        if (arg3 == 1) {
            int var5 = arg4.field7797;
            int var6 = arg1.field7797;
            if (!arg2) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return class657.method3718(-29726, arg4.method2435(false).field8339, class370.field4980, arg1.method2435(false).field8339);
        } else if (arg3 == 3) {
            if (arg4.field5697.equals("-")) {
                if (arg1.field5697.equals("-")) {
                    return 0;
                } else if (arg2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field5697.equals("-")) {
                return arg2 ? 1 : -1;
            } else {
                return class657.method3718(arg0 - 29836, arg4.field5697, class370.field4980, arg1.field5697);
            }
        } else if (arg3 == 4) {
            if (arg4.method3138(arg0 ^ 0xFFFFD047)) {
                return arg1.method3138(arg0 - 12357) ? 0 : 1;
            } else if (arg1.method3138(-12247)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 5) {
            if (arg4.method3141(-23627)) {
                return arg1.method3141(-23627) ? 0 : 1;
            } else if (arg1.method3141(-23627)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 != 6) {
            if (arg0 != 110) {
                field8993 = null;
            }
            if (arg3 == 7) {
                if (arg4.method3135(-1)) {
                    return arg1.method3135(-1) ? 0 : 1;
                } else if (arg1.method3135(-1)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 8) {
                int var7 = arg4.field5696;
                int var8 = arg1.field5696;
                if (arg2) {
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                } else {
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg4.field5698 - arg1.field5698;
            }
        } else if (arg4.method3140((byte) -102)) {
            return arg1.method3140((byte) -53) ? 0 : 1;
        } else if (arg1.method3140((byte) -47)) {
            return -1;
        } else {
            return 0;
        }
    }
}
