import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class15 {

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public int field152;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Lte;")
    private class527 field155;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)Z")
    public static final boolean method105(int arg0, int arg1, int arg2) {
        int var3 = 123 % ((arg0 - 41) / 49);
        field151++;
        if (((arg1 & 0x10000) != 0 | class560.method3375(arg2, (byte) -93, arg1)) || class464.method2796(arg1, (byte) -95, arg2)) {
            return true;
        } else {
            return (arg2 & 0x37) == 0 && class444.method2666(-13624, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!kh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field155.method3134(45, this.field152);
        field154++;
        super.finalize();
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILjava/net/Socket;B)Lpi;")
    public static final class426 method106(int arg0, Socket arg1, byte arg2) throws IOException {
        if (arg2 >= -26) {
            field153 = -106;
        }
        field150++;
        return new class299(arg1, arg0);
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lte;II)V")
    public class15(class527 arg0, int arg1, int arg2) {
        this.field152 = arg2;
        this.field155 = arg0;
    }

    static {
        new class572("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
    }
}
