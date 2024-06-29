import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public abstract class class219 {

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field3164;

    static {
        new class530("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIII)Z", line = 6)
    public static final boolean method1359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3164++;
        if (arg4 != -2) {
            return true;
        }
        for (int var6 = arg0; var6 <= arg3; var6++) {
            for (int var7 = arg2; var7 <= arg1; var7++) {
                if (class255.field3779[var6][var7] == arg5 && class508.field7507[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)Z")
    public abstract boolean method1356(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "([BBII)V")
    public abstract void method1357(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IB[BI)I")
    public abstract int method1358(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
    public abstract void method1360(byte arg0);

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
    public abstract void method1361(int arg0);
}
