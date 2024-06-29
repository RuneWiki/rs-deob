import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public interface class532 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)Z")
    boolean method150(byte arg0);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Loa;BI)Lba;")
    class358 method137(class651 arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
    void method144(boolean arg0);

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)I")
    int method151(byte arg0);

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)I")
    int method146(boolean arg0);

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(Z)I")
    int method152(boolean arg0);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Loa;B)V")
    void method148(class651 arg0, byte arg1);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Loa;I)V")
    void method138(class651 arg0, int arg1);
}
