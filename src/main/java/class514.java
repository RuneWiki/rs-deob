import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public interface class514 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III[B)V")
    void method670(int arg0, int arg1, int arg2, byte[] arg3);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)I")
    int method668(int arg0);

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)I")
    int method671(int arg0);

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)J")
    long method667(int arg0);
}
