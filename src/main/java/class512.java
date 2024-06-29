import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public interface class512 extends class65 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    Buffer method410(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Z")
    boolean method411(int arg0);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)V")
    void method464(boolean arg0, int arg1);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    void method409(boolean arg0);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Llc;")
    class629 method465(byte arg0);
}
