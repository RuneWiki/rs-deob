import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public interface class180 extends class471 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZI)V")
    void method292(boolean arg0, int arg1);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)Z")
    boolean method290(int arg0);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    void method296(byte arg0);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    Buffer method297(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)Lsb;")
    class280 method1108(int arg0);
}
