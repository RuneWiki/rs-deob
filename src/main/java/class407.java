import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public interface class407 {

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Z)J")
    long method54(boolean arg0);

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)I")
    int method50(byte arg0);

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(B)I")
    int method57(byte arg0);

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I[BII)V")
    void method55(int arg0, byte[] arg1, int arg2, int arg3);
}
