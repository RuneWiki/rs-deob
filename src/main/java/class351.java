import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public interface class351 {

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BILnr;)Lqc;")
    class95 method147(byte arg0, int arg1, class437 arg2);

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)Z")
    boolean method146(byte arg0);

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lnr;Z)V")
    void method156(class437 arg0, boolean arg1);

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)I")
    int method160(int arg0);

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILnr;)V")
    void method154(int arg0, class437 arg1);

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)I")
    int method150(byte arg0);

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(B)I")
    int method148(byte arg0);

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(B)V")
    void method158(byte arg0);
}
