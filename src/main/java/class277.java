import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class277 {

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public int field3498 = -1;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Lap;")
    public static class335 field3499 = new class335("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field3502 = 0;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field3510 = -1;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public int field3501;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public int field3503;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public int field3504;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public int field3506;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public int field3507;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public int field3508;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public int field3511;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public int field3512;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "J")
    public static long field3509;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lob;B)V", line = 3)
    public static final void method1635(class520 arg0, byte arg1) {
        field3505++;
        if (!class122.field1646) {
            arg0.method2165(16225);
            if (arg1 > 6) {
                class2.field24--;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 30)
    public static void method1636(int arg0) {
        if (arg0 == -22609) {
            field3499 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Z", line = 41)
    public static final boolean method1637(int arg0, int arg1) {
        field3500++;
        class184.field2419 = true;
        class296.field3802 = arg1 + 1 & 0xFFFF;
        int var2 = 122 / ((-arg0 - 30) / 53);
        return true;
    }
}
