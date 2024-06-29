import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class490 {

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "Lns;")
    public static class278 field7191 = new class278(0, -1);

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "Lbg;")
    public static class324 field7193 = new class324(71, 6);

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "Lid;")
    public static class412 field7194;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field7195;

    static {
        new class331("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field7194 = new class412(1);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2944(byte arg0) {
        field7195++;
        class215 var1 = class171.method1208(0, (byte) 123, 15);
        var1.method1469((byte) -125);
        if (arg0 != -31) {
            field7191 = null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V", line = 16)
    public static void method2945(int arg0) {
        if (arg0 != 0) {
            field7194 = null;
        }
        field7194 = null;
        field7193 = null;
        field7191 = null;
    }
}
