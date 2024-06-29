import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class231 {

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field3282 = -1;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1464(byte arg0, String arg1) {
        field3281++;
        class310.field4180 = arg1;
        if (class500.field6968.field3975 == null) {
            return;
        }
        if (arg0 >= -34) {
            field3283 = -24;
        }
        try {
            String var2 = class500.field6968.field3975.getParameter("cookieprefix");
            String var3 = class500.field6968.field3975.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class492.method2851((byte) 82, class488.method2835(30160) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class54.method509("document.cookie=\"" + var5 + "\"", class500.field6968.field3975, -8237);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III[B)Ljava/lang/String;")
    public static final String method1465(int arg0, int arg1, int arg2, byte[] arg3) {
        field3280++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg3[arg0 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class3.field44[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        if (arg1 != 55) {
            field3283 = -85;
        }
        return new String(var4, 0, var5);
    }

    static {
        new class104("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field3283 = 0;
    }
}
