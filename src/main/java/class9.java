import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public interface class9 {

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)I")
    int method50(boolean arg0);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)I")
    int method51(int arg0);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)J")
    long method52(byte arg0);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III[B)V")
    void method53(int arg0, int arg1, int arg2, byte[] arg3);
}
