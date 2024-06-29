import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public interface class427 extends class435 {

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)Z")
    boolean method2611(int arg0);

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)Lig;")
    class258 method2612(int arg0);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method2613(boolean arg0, int arg1);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    void method2614(int arg0);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)V")
    void method2615(int arg0, byte arg1);
}
