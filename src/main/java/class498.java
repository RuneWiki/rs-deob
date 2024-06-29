import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public interface class498 extends class471 {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)Z")
    boolean method646(int arg0);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    void method645(int arg0);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)V")
    void method2429(int arg0, byte arg1);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    Buffer method647(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)Llj;")
    class6 method2700(int arg0);
}
