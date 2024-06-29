import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public interface class13 extends class138 {

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Ljr;")
    class100 method58(byte arg0);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
    void method59(int arg0, int arg1);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    void method60(int arg0);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)Z")
    boolean method61(byte arg0);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    Buffer method62(boolean arg0, boolean arg1);
}
