import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public interface class628 extends class489 {

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IILjaclib/memory/Source;I)Z")
    boolean method1867(int arg0, int arg1, Source arg2, int arg3);

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)V")
    void method281(byte arg0);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    Buffer method282(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIB)Z")
    boolean method1866(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)Z")
    boolean method280(int arg0);
}
