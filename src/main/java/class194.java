import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class194 extends class425 {

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public int field2794 = -1;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "Z")
    public boolean field2790 = false;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "Lpm;")
    public static class349 field2796 = new class349("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "Lpm;")
    public static class349 field2800;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public int field2791;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public int field2792;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public int field2797;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    public int field2799;

    static {
        new class349((String) null, "Dieses System darf nicht missbraucht werden!", (String) null, (String) null);
        field2800 = new class349("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");
        new class349("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        field2801 = -1;
        field2802 = 2;
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(B)V", line = 9)
    public static final void method1387(byte arg0) {
        field2795++;
        class218.field3132 = -1;
        int var1 = 52 % ((54 - arg0) / 57);
        class134.field2063 = -1;
        class72.field944 = -1;
        class259.field3833 = 0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 24)
    public static void method1388(int arg0) {
        if (arg0 != -1) {
            field2802 = -30;
        }
        field2800 = null;
        field2796 = null;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V", line = 56)
    public class194(int arg0) {
        this.field2794 = arg0;
    }
}
