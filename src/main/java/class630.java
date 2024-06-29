import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public interface class630 {

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)I")
    int method721(int arg0);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)I")
    int method720(boolean arg0);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II[BI)V")
    void method724(int arg0, int arg1, byte[] arg2, int arg3);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)J")
    long method722(byte arg0);
}
