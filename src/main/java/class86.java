import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class86 {

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "B")
    public byte field1160;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Lee;")
    public class159 field1159;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "B")
    public byte field1157;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "S")
    public short field1158;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III[BII)V")
    public static final void method486(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field1161++;
        if (arg2 != 0 || arg0 >= arg4) {
            return;
        }
        int var6 = arg0 + arg1;
        int var7 = arg4 - arg0 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg4 - arg0 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg3[var6++] = 1;
                }
            }
            arg3[var6++] = 1;
            arg3[var6++] = 1;
            arg3[var6++] = 1;
            arg3[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lee;III)V")
    public class86(class159 arg0, int arg1, int arg2, int arg3) {
        this.field1160 = (byte) arg2;
        this.field1159 = arg0;
        this.field1157 = (byte) arg3;
        this.field1158 = (short) arg1;
    }

    static {
        new class344("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        new class344("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field1163 = 0;
    }
}
