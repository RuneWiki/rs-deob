import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class440 extends class260 {

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
    public int field6509;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
    public int field6507;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    public static int field6505 = 0;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "Lqp;")
    public static class466 field6506 = new class466("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "Ljava/lang/Object;")
    public static Object field6508;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)V", line = 9)
    public static void method2615(int arg0) {
        field6506 = null;
        if (arg0 != 0) {
            method2615(-73);
        }
        field6508 = null;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(II)V", line = 21)
    public class440(int arg0, int arg1) {
        this.field6509 = arg0;
        this.field6507 = arg1;
    }
}
