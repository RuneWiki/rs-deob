import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public interface class246 extends class299 {

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)Lew;")
    class240 method1516(byte arg0);

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
    void method474(int arg0);

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(B)Z")
    boolean method1517(byte arg0);

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    Buffer method1518(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IB)V")
    void method818(int arg0, byte arg1);
}
