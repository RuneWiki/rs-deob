import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public abstract class class271 {

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "[[B")
    public static byte[][] field3771;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)V")
    public static void method1761(boolean arg0) {
        field3771 = null;
        if (arg0) {
            field3772 = 7;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(III)[B")
    public abstract byte[] method1762(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "([BI)V")
    public abstract void method1763(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1764(int arg0);

    static {
        new class104("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field3771 = new byte[1000][];
    }
}
