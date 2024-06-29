import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public interface class490 {

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)I")
    int method962(boolean arg0);

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(II[BI)V")
    void method960(int arg0, int arg1, byte[] arg2, int arg3);

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)J")
    long method964(byte arg0);

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)I")
    int method959(byte arg0);
}
