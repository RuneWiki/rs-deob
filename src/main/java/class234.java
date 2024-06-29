import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public interface class234 extends class410 {

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)Lti;")
    class438 method1598(int arg0);

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    Buffer method1599(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(II)V")
    void method1600(int arg0, int arg1);

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)Z")
    boolean method1601(int arg0);

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Z)V")
    void method1496(boolean arg0);
}
