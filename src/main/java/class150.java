import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class150 extends class467 {

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "Z")
    public boolean field2162;

    @OriginalMember(owner = "client!hv", name = "w", descriptor = "I")
    public int field2168;

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "I")
    public int field2161;

    @OriginalMember(owner = "client!hv", name = "u", descriptor = "I")
    public int field2166;

    @OriginalMember(owner = "client!hv", name = "r", descriptor = "I")
    public int field2163;

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "I")
    public int field2160;

    @OriginalMember(owner = "client!hv", name = "s", descriptor = "I")
    public static int field2164 = 1405;

    @OriginalMember(owner = "client!hv", name = "v", descriptor = "Lui;")
    public static class375 field2167;

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!hv", name = "t", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!hv", name = "x", descriptor = "Lns;")
    public static class438 field2169;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)V")
    public static void method986(byte arg0) {
        if (arg0 != 25) {
            method986((byte) 40);
        }
        field2167 = null;
        field2169 = null;
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(IIIIIZ)V")
    public class150(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field2162 = arg5;
        this.field2168 = arg1;
        this.field2161 = arg2;
        this.field2166 = arg0;
        this.field2163 = arg4;
        this.field2160 = arg3;
    }

    static {
        new class375("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field2167 = new class375("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");
    }
}
