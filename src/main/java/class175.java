import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public interface class175 extends class364 {

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)Lqda;")
    class689 method1282(int arg0);

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
    void method231(byte arg0);

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)V")
    void method238(int arg0, int arg1);

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    Buffer method1283(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)Z")
    boolean method1284(int arg0);
}
