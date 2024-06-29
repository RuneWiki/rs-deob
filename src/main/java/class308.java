import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public interface class308 {

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)J")
    long method1824(byte arg0);

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)I")
    int method1825(byte arg0);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[BI)V")
    void method1826(int arg0, int arg1, byte[] arg2, int arg3);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)I")
    int method1827(int arg0);
}
