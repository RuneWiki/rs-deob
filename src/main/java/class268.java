import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public interface class268 extends class697 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    Buffer method587(int arg0, boolean arg1);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V")
    void method588(boolean arg0);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)V")
    void method585(int arg0, byte arg1);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)Lns;")
    class408 method589(byte arg0);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)Z")
    boolean method586(int arg0);
}
