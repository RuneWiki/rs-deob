import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public interface class463 {

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)J")
    long method157(int arg0);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIB[B)V")
    void method153(int arg0, int arg1, byte arg2, byte[] arg3);

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)I")
    int method159(int arg0);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)I")
    int method154(byte arg0);
}
