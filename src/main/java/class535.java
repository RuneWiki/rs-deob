import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public interface class535 extends class615 {

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    Buffer method605(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)Lbja;")
    class34 method603(byte arg0);

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)Z")
    boolean method601(int arg0);

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
    void method602(byte arg0);

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V")
    void method604(int arg0, int arg1);
}
