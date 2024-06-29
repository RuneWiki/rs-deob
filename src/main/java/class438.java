import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public interface class438 {

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)J")
    long method352(int arg0);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[BIB)V")
    void method353(int arg0, byte[] arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)I")
    int method350(int arg0);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)I")
    int method351(boolean arg0);
}
