import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class464 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lsh;")
    public static class472 field6542 = new class472(43, 3);

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lct;")
    public static class285 field6543 = new class285(16, 6);

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lsh;")
    public static class472 field6544 = new class472(102, -1);

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Lo;")
    public static class332 field6546 = new class332("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Ldp;")
    public static class319 field6547;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2729(boolean arg0) {
        field6543 = null;
        field6542 = null;
        field6544 = null;
        field6546 = null;
        field6547 = null;
        if (!arg0) {
            field6542 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)I", line = 18)
    public static final int method2730(int arg0, int arg1) {
        field6545++;
        return arg0 == 255 ? arg1 & 0xFF : -125;
    }
}
