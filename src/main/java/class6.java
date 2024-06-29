import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Lej;")
    public static class104 field75 = new class104("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "Lh;")
    public static class571 field77 = new class571(200);

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field79 = 10;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Lej;")
    public static class104 field78 = new class104("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static final void method38(byte arg0) {
        field76++;
        class494.field6919.method1295(((float) class491.field6875.field3350 * 0.1F + 0.7F) * 1.1523438F);
        if (arg0 >= 26) {
            class494.field6919.method1298(class303.field4135, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
            class494.field6919.method1334(class45.field852, -1, 256);
            class494.field6919.method1277(class1.field10);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)Z")
    public static final boolean method39(int arg0, int arg1, int arg2) {
        if (arg0 == -50) {
            field74++;
            return (class391.method2353(arg0 + 164, arg1, arg2) | class192.method1192(2, arg2, arg1) | class274.method1771(arg1, 0, arg2)) & class563.method3214(arg1, -33, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
    public static void method40(byte arg0) {
        if (arg0 > -77) {
            method40((byte) 1);
        }
        field77 = null;
        field75 = null;
        field78 = null;
    }
}
