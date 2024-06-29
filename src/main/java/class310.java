import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public interface class310 {

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)I")
    int method131(byte arg0);

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V")
    void method132(int arg0);

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Loa;I)V")
    void method136(class650 arg0, int arg1);

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)I")
    int method138(int arg0);

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Loa;BI)Lba;")
    class359 method134(class650 arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Loa;B)V")
    void method130(class650 arg0, byte arg1);

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Z)Z")
    boolean method133(boolean arg0);

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(B)I")
    int method139(byte arg0);
}
