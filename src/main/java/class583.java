import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public interface class583 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BII)V")
    void method16(int arg0, byte[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)I")
    int method17(byte arg0);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)J")
    long method20(int arg0);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)I")
    int method22(boolean arg0);
}
