import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public interface class422 extends class768 {

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)Z")
    boolean method2526(int arg0);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    Buffer method2527(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)Ldw;")
    class748 method2528(boolean arg0);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
    void method2529(int arg0, int arg1);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
    void method274(byte arg0);
}
