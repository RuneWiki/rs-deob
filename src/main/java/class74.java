import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public interface class74 {

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)J")
    long method551(byte arg0);

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)I")
    int method552(byte arg0);

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)I")
    int method553(byte arg0);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B[BII)V")
    void method554(byte arg0, byte[] arg1, int arg2, int arg3);
}
