import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class class487 {

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "[[S")
    public static short[][] field6583;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(B)V", line = 19)
    public static void method2725(byte arg0) {
        field6583 = null;
        if (arg0 != 65) {
            field6583 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLoa;)Lpe;")
    public abstract class571 method145(byte arg0, class651 arg1);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BILoa;I)Z")
    public abstract boolean method149(byte arg0, int arg1, class651 arg2, int arg3);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Loa;Z)V")
    public abstract void method147(class651 arg0, boolean arg1);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)Z")
    public abstract boolean method139(int arg0);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILoa;)Ldd;")
    public abstract class660 method143(int arg0, class651 arg1);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILoa;ILni;ZZI)V")
    public abstract void method141(int arg0, class651 arg1, int arg2, class487 arg3, boolean arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)V")
    public abstract void method142(byte arg0);
}
