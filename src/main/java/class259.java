import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class259 {

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Lhc;")
    public static class368 field3588 = new class368("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "[I")
    public static int[] field3589 = new int[100];

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 5)
    public static void method1667(int arg0) {
        if (arg0 != 9960) {
            field3589 = null;
        }
        field3589 = null;
        field3588 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)I", line = 17)
    public static final int method1668(int arg0, int arg1, int arg2) {
        field3587++;
        return ~arg1 == arg0 || arg1 == 3 ? class5.field48[arg2 & 0x3] : class296.field4072[arg2 & 0x3];
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Llb;III[Z)Z", line = 33)
    public static final boolean method1669(class210 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class436.field6160 != class125.field1879) {
            int var6 = class82.field1130[arg1].method331(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class323 var8 = class82.field1130[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method331(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method336(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method324(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 70)
    public static final void method1670(String arg0, byte arg1) {
        field3590++;
        class101.field1400 = arg0;
        if (class122.field1839.field1086 == null) {
            return;
        }
        try {
            String var2 = class122.field1839.field1086.getParameter("cookieprefix");
            String var3 = class122.field1839.field1086.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            if (arg1 != -101) {
                method1670((String) null, (byte) 110);
            }
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class314.method1900(class199.method1372(30938) + 94608000000L, (byte) -86) + "; Max-Age=" + 94608000L;
            }
            class9.method50("document.cookie=\"" + var5 + "\"", (byte) -122, class122.field1839.field1086);
        } catch (Throwable var6) {
        }
    }
}
