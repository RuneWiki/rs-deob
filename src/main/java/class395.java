import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class395 {

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "Lrc;")
    public static class108 field5447;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "[S")
    public static short[] field5446;

    static {
        new class151("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field5447 = new class108(37, -1);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)Z", line = 7)
    public static final boolean method2385(int arg0, int arg1, int arg2) {
        int var3 = class117.field1629[arg0][arg1][arg2];
        if (-class196.field2912 == var3) {
            return false;
        } else if (class196.field2912 == var3) {
            return true;
        } else {
            int var4 = arg1 << class380.field5232;
            int var5 = arg2 << class380.field5232;
            if (class22.method157(var4 + 1, class340.field4692[arg0].method591(arg1, arg2), var5 + 1) && class22.method157(class47.field719 + var4 - 1, class340.field4692[arg0].method591(arg1 + 1, arg2), var5 + 1) && class22.method157(class47.field719 + var4 - 1, class340.field4692[arg0].method591(arg1 + 1, arg2 + 1), class47.field719 + var5 - 1) && class22.method157(var4 + 1, class340.field4692[arg0].method591(arg1, arg2 + 1), class47.field719 + var5 - 1)) {
                class117.field1629[arg0][arg1][arg2] = class196.field2912;
                return true;
            } else {
                class117.field1629[arg0][arg1][arg2] = -class196.field2912;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZI)Lir;", line = 34)
    public static final class226 method2386(boolean arg0, int arg1) {
        field5445++;
        if (arg1 == 0) {
            if ((double) class330.field4577 == 3.0D) {
                return class76.field1134;
            }
            if ((double) class330.field4577 == 4.0D) {
                return class382.field5241;
            }
            if ((double) class330.field4577 == 6.0D) {
                return class145.field2005;
            }
            if ((double) class330.field4577 >= 8.0D) {
                return class333.field4634;
            }
        } else if (arg1 == 1) {
            if ((double) class330.field4577 == 3.0D) {
                return class145.field2005;
            }
            if ((double) class330.field4577 == 4.0D) {
                return class333.field4634;
            }
            if ((double) class330.field4577 == 6.0D) {
                return class475.field6709;
            }
            if ((double) class330.field4577 >= 8.0D) {
                return class205.field3001;
            }
        } else if (arg1 == 2) {
            if ((double) class330.field4577 == 3.0D) {
                return class475.field6709;
            }
            if ((double) class330.field4577 == 4.0D) {
                return class205.field3001;
            }
            if ((double) class330.field4577 == 6.0D) {
                return class56.field828;
            }
            if ((double) class330.field4577 >= 8.0D) {
                return class314.field4429;
            }
        }
        if (!arg0) {
            field5447 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V", line = 102)
    public static void method2387(byte arg0) {
        if (arg0 < 2) {
            method2385(53, -85, 28);
        }
        field5446 = null;
        field5447 = null;
    }
}
