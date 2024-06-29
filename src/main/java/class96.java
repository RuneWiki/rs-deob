import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface class96 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
    boolean method390(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZFIIII)[I")
    int[] method395(boolean arg0, float arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(II)Lje;")
    class91 method389(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IFIIIZ)[I")
    int[] method397(int arg0, float arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIFZI)[F")
    float[] method393(int arg0, int arg1, int arg2, float arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)I")
    int method391(byte arg0);
}
