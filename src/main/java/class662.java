import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public interface class662 {

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)J")
    long method693(int arg0);

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)I")
    int method695(int arg0);

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(II[BI)V")
    void method694(int arg0, int arg1, byte[] arg2, int arg3);

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)I")
    int method691(byte arg0);
}
