import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class527 {

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "Lno;")
    public static class494 field7781 = new class494("", 15);

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "Lpi;")
    public static class342 field7782 = new class342(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
    public static void method3130(byte arg0) {
        int var1 = -74 % ((arg0 - 77) / 41);
        field7782 = null;
        field7781 = null;
    }
}
