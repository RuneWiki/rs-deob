import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public interface class463 extends class90 {

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)Z")
    boolean method1441(int arg0);

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method1440(boolean arg0, int arg1);

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(I)V")
    void method32(int arg0);

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)V")
    void method602(int arg0, int arg1);

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(B)Ldr;")
    class629 method1442(byte arg0);
}
