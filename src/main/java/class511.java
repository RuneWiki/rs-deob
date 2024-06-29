import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public interface class511 {

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)J")
    long method2183(int arg0);

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)I")
    int method2186(byte arg0);

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II[BZ)V")
    void method2187(int arg0, int arg1, byte[] arg2, boolean arg3);

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)I")
    int method2182(int arg0);
}
