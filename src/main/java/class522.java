import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class522 extends class11 {

    @OriginalMember(owner = "client!wo", name = "G", descriptor = "I")
    public static int field7733 = 0;

    @OriginalMember(owner = "client!wo", name = "I", descriptor = "J")
    public static long field7735;

    @OriginalMember(owner = "client!wo", name = "H", descriptor = "I")
    public static int field7734;

    static {
        new class466("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field7735 = -1L;
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(II)[I", line = 3)
    public final int[] method44(int arg0, int arg1) {
        if (arg0 > -42) {
            this.method44(-85, -97);
        }
        field7734++;
        return class448.field6606;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V", line = 15)
    public class522() {
        super(0, true);
    }
}
