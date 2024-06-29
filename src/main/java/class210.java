import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public interface class210 {

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lvc;B)V")
    void method85(class89 arg0, byte arg1);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLvc;)V")
    void method78(boolean arg0, class89 arg1);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)I")
    int method71(byte arg0);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)I")
    int method80(int arg0);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BILvc;)Ln;")
    class468 method76(byte arg0, int arg1, class89 arg2);

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    void method84(int arg0);

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)I")
    int method83(byte arg0);

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)Z")
    boolean method82(byte arg0);
}
