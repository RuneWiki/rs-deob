import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public interface class118 extends class13 {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    Buffer method847(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)Lwj;")
    class415 method848(byte arg0);

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)Z")
    boolean method849(int arg0);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
    void method850(int arg0, int arg1);

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
    void method851(int arg0);
}
