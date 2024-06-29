import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public interface class370 extends class489 {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
    void method287(int arg0, int arg1);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Lui;")
    class194 method283(byte arg0);

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
    void method281(byte arg0);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Z")
    boolean method280(int arg0);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    Buffer method282(int arg0, boolean arg1);
}
