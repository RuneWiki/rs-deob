import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public interface class216 extends class215 {

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method1457(boolean arg0, int arg1);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)V")
    void method1458(byte arg0, int arg1);

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)Z")
    boolean method1459(int arg0);

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)Lok;")
    class256 method1460(int arg0);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
    void method1284(boolean arg0);
}
