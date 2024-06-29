import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class432 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Lss;")
    public static class213 field6517 = new class213("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Lfg;")
    public static class298 field6519 = new class298(14, 1);

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "Lfg;")
    public static class298 field6520 = new class298(15, 4);

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Lfg;")
    public static class298 field6521 = new class298(16, -2);

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Lfg;")
    public static class298 field6522 = new class298(17, 0);

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Lfg;")
    public static class298 field6523 = new class298(18, -2);

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Lfg;")
    public static class298 field6524 = new class298(19, -2);

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Lfg;")
    public static class298 field6525 = new class298(20, 6);

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "Lfg;")
    public static class298 field6526 = new class298(21, 9);

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Lfg;")
    public static class298 field6527 = new class298(22, -2);

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Lfg;")
    public static class298 field6528 = new class298(23, 4);

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "Lfg;")
    public static class298 field6529 = new class298(24, -1);

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "Lfg;")
    public static class298 field6530 = new class298(25, -2);

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "[Lfg;")
    private static class298[] field6531 = new class298[32];

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "Lsp;")
    public static class525 field6532;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "Lqu;")
    public static class219 field6533;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static void method2722(byte arg0) {
        field6532 = null;
        field6522 = null;
        field6531 = null;
        field6529 = null;
        field6533 = null;
        field6528 = null;
        field6521 = null;
        field6530 = null;
        field6519 = null;
        field6525 = null;
        field6520 = null;
        field6527 = null;
        if (arg0 == 78) {
            field6524 = null;
            field6526 = null;
            field6517 = null;
            field6523 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)Z")
    public static final boolean method2723(int arg0, int arg1, int arg2) {
        field6518++;
        if (arg1 != 458752) {
            field6530 = null;
        }
        return (arg0 & 0x70000) != 0 | class486.method2982(arg1 - 458753, arg0, arg2) || class439.method2789(98, arg0, arg2);
    }

    static {
        class298[] var0 = class335.method2226(0);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field6531[var0[var1].field4683] = var0[var1];
        }
        field6532 = class94.method644(-898);
        new class213("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
        field6533 = new class219(72, 3);
    }
}
