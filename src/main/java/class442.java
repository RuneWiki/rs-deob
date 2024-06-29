import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class442 extends class263 {

    @OriginalMember(owner = "client!ni", name = "ib", descriptor = "Luv;")
    public class304 field6097;

    @OriginalMember(owner = "client!ni", name = "lb", descriptor = "[I")
    public static int[] field6100 = new int[16384];

    @OriginalMember(owner = "client!ni", name = "mb", descriptor = "[I")
    public static int[] field6101 = new int[16384];

    @OriginalMember(owner = "client!ni", name = "qb", descriptor = "[Ljava/lang/String;")
    public static String[] field6105;

    @OriginalMember(owner = "client!ni", name = "rb", descriptor = "Lcea;")
    public static class180 field6106;

    @OriginalMember(owner = "client!ni", name = "tb", descriptor = "Lcea;")
    public static class180 field6108;

    @OriginalMember(owner = "client!ni", name = "gb", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!ni", name = "hb", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!ni", name = "jb", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!ni", name = "kb", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!ni", name = "nb", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!ni", name = "ob", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!ni", name = "pb", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!ni", name = "sb", descriptor = "Lha;")
    public static class52 field6107;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field6100[var2] = (int) (32768.0D * Math.sin((double) var2 * var0));
            field6101[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field6105 = new String[100];
        field6106 = new class180("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");
        field6108 = new class180("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(CB)C", line = 4)
    public static final char method2591(char arg0, byte arg1) {
        ++field6102;
        if (arg1 >= -54) {
            return (char) 65471;
        } else if (arg0 == 198) {
            return 'E';
        } else if (arg0 == 230) {
            return 'e';
        } else if (arg0 == 223) {
            return 's';
        } else if (~arg0 == -339) {
            return 'E';
        } else {
            return (char) (arg0 == 339 ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIII)V", line = 33)
    public static final void method2592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (~class470.field6589 >= ~arg5 && arg1 <= class592.field8588 && ~class563.field8282 >= ~arg6 && arg7 <= class271.field3513) {
            class562.method3278(arg1, arg3, arg4, 28471, arg5, arg7, arg2, arg6);
        } else {
            class282.method1598(arg3, arg1, arg7, arg5, arg6, (byte) -76, arg2, arg4);
        }
        ++field6098;
        if (arg0 != 101) {
            method2591('\u0005', (byte) 67);
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lac;)V", line = 53)
    public class442(class460 arg0) {
        super(arg0);
        this.field6097 = new class304(arg0);
        super.field3430 = new class635(super.field3388);
        super.field3420 = new class635(super.field3388);
        super.field3432 = new class635(super.field3388);
        super.field3418 = new class635(super.field3388);
        super.field3419 = new class635(super.field3388);
        super.field3433 = new class635(super.field3388);
        super.field3407 = new class635(super.field3388);
        super.field3399 = new class635(super.field3388);
        super.field3408 = new class635(super.field3388);
        super.field3411 = new class635(super.field3388);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 75)
    public final void method1471(int arg0) {
        this.field6097 = new class304((class460) super.field3388);
        if (arg0 == 1) {
            ++field6096;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLdn;)V", line = 87)
    public static final void method2593(byte arg0, class438 arg1) {
        if (arg0 <= 38) {
            field6099 = -124;
        }
        ++field6095;
        class560.field8244 = arg1;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V", line = 98)
    public static void method2594(int arg0) {
        field6106 = null;
        field6105 = null;
        field6101 = null;
        field6107 = null;
        field6100 = null;
        field6108 = null;
        if (arg0 > -73) {
            field6108 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 113)
    public static final void method2595(String arg0, int arg1) {
        class22.field153 = arg0;
        ++field6103;
        if (class74.field873.field2014 != null) {
            try {
                String var2 = class74.field873.field2014.getParameter("cookieprefix");
                String var3 = class74.field873.field2014.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (arg0.length() == 0) {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var4 + "; Expires=" + class564.method3290((byte) 126, 94608000000L + class190.method1030(false)) + "; Max-Age=" + 94608000L;
                }
                class47.method248(class74.field873.field2014, "document.cookie=\"" + var5 + "\"", false);
                if (arg1 != 16384) {
                    method2593((byte) 8, (class438) null);
                }
            } catch (Throwable var6) {
            }
        }
    }
}
