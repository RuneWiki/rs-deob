import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class147 {

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "Z")
    public static boolean field1727;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Lr;")
    public static class368 field1728;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BILwo;I)Lhf;")
    public static final class402 method952(byte arg0, int arg1, class285 arg2, int arg3) {
        field1726++;
        byte[] var4 = arg2.method1794(arg0 + 5941, arg1, arg3);
        if (var4 == null) {
            return null;
        } else {
            if (arg0 != -81) {
                field1728 = null;
            }
            return new class402(var4);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static void method953(int arg0) {
        field1728 = null;
        if (arg0 != -10856) {
            method952((byte) -76, -109, (class285) null, -105);
        }
    }

    static {
        new class72(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        field1727 = true;
        new class72("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field1728 = class283.method1785(0);
    }
}
