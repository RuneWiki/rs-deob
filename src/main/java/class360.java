import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class360 {

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "I")
    public static int field5218;

    static {
        new class487("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IB)V", line = 18)
    public static final void method2211(int arg0, byte arg1) {
        if (arg1 > -121) {
            method2211(4, (byte) -99);
        }
        field5217++;
        class17.field147 = -1;
        if (arg0 == 37) {
            class113.field1433 = 3.0F;
        } else if (arg0 == 50) {
            class113.field1433 = 4.0F;
        } else if (arg0 == 75) {
            class113.field1433 = 6.0F;
        } else if (arg0 == 100) {
            class113.field1433 = 8.0F;
        } else if (arg0 == 200) {
            class113.field1433 = 16.0F;
        }
        class17.field147 = -1;
    }
}
