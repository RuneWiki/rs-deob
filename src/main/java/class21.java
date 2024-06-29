import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public interface class21 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)I")
    int method137(byte arg0);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)J")
    long method138(boolean arg0);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([BIII)V")
    void method139(byte[] arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)I")
    int method140(int arg0);
}
