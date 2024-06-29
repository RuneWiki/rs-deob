import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public interface class332 {

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)J")
    long method879(int arg0);

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)I")
    int method878(byte arg0);

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BI[BI)V")
    void method883(byte arg0, int arg1, byte[] arg2, int arg3);

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)I")
    int method880(int arg0);
}
