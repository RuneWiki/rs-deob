import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class281 {

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "Liv;")
    public static class64 field4021 = new class64(46, 6);

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public static int field4023 = 0;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "Lpi;")
    public static class342 field4025 = new class342("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public static int field4026 = -1;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "Liv;")
    public static class64 field4027 = new class64(105, 3);

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IZZBI)V", line = 8)
    public static final void method1795(int arg0, boolean arg1, boolean arg2, byte arg3, int arg4) {
        class392.method2418(arg0, arg1, arg4, 0, 2, arg2, class403.field6057.length - 1);
        field4020++;
        class261.field3797 = null;
        int var5 = -30 / ((-arg3 - 64) / 55);
        class305.field4650 = 0;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V", line = 22)
    public static void method1796(int arg0) {
        field4025 = null;
        field4021 = null;
        if (arg0 != -1) {
            method1795(-56, true, true, (byte) -8, 84);
        }
        field4027 = null;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)Z", line = 34)
    public static final boolean method1797(int arg0, int arg1, int arg2) {
        field4019++;
        if (!class474.method2837(-9, arg1, arg0)) {
            return false;
        } else if ((arg0 & 0xB000) != 0 | class445.method2659(arg1, arg0, -15177) | class20.method170(arg1, arg0, -3910)) {
            return true;
        } else {
            if (arg2 != -4542) {
                method1796(60);
            }
            return (class105.method795((byte) 47, arg0, arg1) | class200.method1380(arg1, arg0, (byte) 40)) & (arg1 & 0x37) == 0;
        }
    }
}
