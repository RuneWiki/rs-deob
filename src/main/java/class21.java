import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public interface class21 {

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)I")
    int method134(int arg0);

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)J")
    long method135(int arg0);

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I[BZI)V")
    void method136(int arg0, byte[] arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)I")
    int method137(byte arg0);
}
