import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class292 extends class276 {

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public int field4738;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public int field4737;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLqs;)I")
    public static final int method1880(byte arg0, class496 arg1) {
        field4736++;
        int var2 = 0;
        if (arg1.method2929(class200.field3187, -76)) {
            var2++;
        }
        if (arg1.method2929(class83.field1457, arg0 ^ 0xFFFFFFE6)) {
            var2++;
        }
        if (arg1.method2929(class187.field2929, -54)) {
            var2++;
        }
        if (arg1.method2929(class13.field155, -118)) {
            var2++;
        }
        if (arg1.method2929(class437.field6532, -67)) {
            var2++;
        }
        if (arg1.method2929(class279.field4584, -103)) {
            var2++;
        }
        if (arg0 != 112) {
            method1880((byte) 103, null);
        }
        if (arg1.method2929(class502.field7334, -87)) {
            var2++;
        }
        if (arg1.method2929(class422.field6376, arg0 - 177)) {
            var2++;
        }
        if (arg1.method2929(class204.field3235, -66)) {
            var2++;
        }
        if (arg1.method2929(class129.field2218, -99)) {
            var2++;
        }
        if (arg1.method2929(class57.field896, -61)) {
            var2++;
        }
        if (arg1.method2929(class350.field5476, arg0 ^ 0xFFFFFFB7)) {
            var2++;
        }
        if (arg1.method2929(class64.field949, -89)) {
            var2++;
        }
        if (arg1.method2929(class441.field6577, arg0 - 193)) {
            var2++;
        }
        if (arg1.method2929(class429.field6439, -73)) {
            var2++;
        }
        if (arg1.method2929(class142.field2345, -113)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(II)V")
    public class292(int arg0, int arg1) {
        this.field4738 = arg1;
        this.field4737 = arg0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZB)V")
    public static final void method1881(boolean arg0, byte arg1) {
        if (arg0) {
            if (class379.field5881 != -1) {
                class59.method396(class379.field5881, 110);
            }
            for (class52 var2 = (class52) class259.field4346.method2518(87); var2 != null; var2 = (class52) class259.field4346.method2524(0)) {
                if (!var2.method1818(false)) {
                    var2 = (class52) class259.field4346.method2518(97);
                    if (var2 == null) {
                        break;
                    }
                }
                class507.method2985(var2, 32407, false, true);
            }
            class379.field5881 = -1;
            class259.field4346 = new class407(8);
            class156.method1091(90);
            class379.field5881 = class262.field4371;
            class380.method2404(false, true);
            class408.method2530(17234);
            class521.method3071(class379.field5881);
        }
        int var3 = 120 % ((arg1 - 10) / 37);
        field4735++;
        class302.field4849 = true;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)[Ljc;")
    public static final class356[] method1882(int arg0) {
        if (arg0 >= -19) {
            return null;
        } else {
            field4739++;
            return new class356[] { class268.field4474, class264.field4413, class328.field5179, class420.field6344, class449.field6688, class527.field7768, class413.field6292, class406.field6168, class378.field5873, class14.field159, class228.field3985, class155.field2510, class352.field5491, class530.field7795, class151.field2421 };
        }
    }

    static {
        new class306("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        new class306("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
    }
}
