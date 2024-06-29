import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public interface class517 extends class697 {

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V")
    void method2342(boolean arg0);

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(Z)Z")
    boolean method2339(boolean arg0);

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    Buffer method2343(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)Lon;")
    class496 method2345(int arg0);

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(II)V")
    void method2344(int arg0, int arg1);
}
