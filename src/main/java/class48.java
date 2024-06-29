import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class48 extends class120 {

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field614 = 0;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public int field615;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public int field616;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "I")
    public int field618;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "I")
    public int field619;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "I")
    public int field620;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method359(int arg0, Throwable arg1, String arg2) {
        field612++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class207.method1410(arg1, 4095);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class248.method1671(var3, arg0 ^ 0x1E18);
            String var4 = class287.method1915(var3, ":", "%3a", (byte) -128);
            String var5 = class287.method1915(var4, "@", "%40", (byte) 87);
            String var6 = class287.method1915(var5, "&", "%26", (byte) -127);
            String var7 = class287.method1915(var6, "#", "%23", (byte) 61);
            if (class69.field977.field237 != null) {
                class208 var8 = class69.field977.method148(new URL(class69.field977.field237.getCodeBase(), "clienterror.ws?c=" + class155.field2301 + "&u=" + class17.field211 + "&v1=" + class20.field240 + "&v2=" + class20.field249 + "&e=" + var7), 88);
                while (var8.field3247 == 0) {
                    class170.method1183(1L, (byte) 122);
                }
                if (var8.field3247 == arg0) {
                    DataInputStream var9 = (DataInputStream) var8.field3249;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ldl;Ldl;Z)V")
    public static final void method360(class123 arg0, class123 arg1, boolean arg2) {
        field621++;
        class1.field1 = arg1;
        if (arg2) {
            method359(36, (Throwable) null, (String) null);
        }
        class71.field999 = arg0;
    }
}
