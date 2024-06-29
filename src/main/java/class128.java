import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public interface class128 {

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(II[BB)V")
    void method958(int arg0, int arg1, byte[] arg2, byte arg3);

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)I")
    int method959(int arg0);

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)I")
    int method960(int arg0);

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)J")
    long method961(boolean arg0);
}
