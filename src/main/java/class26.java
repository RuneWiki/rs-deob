import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public interface class26 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)J")
    long method173(int arg0);

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)I")
    int method174(int arg0);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z[BII)V")
    void method175(boolean arg0, byte[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)I")
    int method176(int arg0);
}
