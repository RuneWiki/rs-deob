import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public interface class200 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)I")
    int method1145(boolean arg0);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BZ)V")
    void method1138(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(JB)Z")
    boolean method1146(long arg0, byte arg1);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    void method1141(byte arg0);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)I")
    int method1143(int arg0);

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    void method1139(int arg0);
}
