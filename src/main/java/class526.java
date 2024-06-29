import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public interface class526 extends class534 {

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
    void method1022(byte arg0);

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)Z")
    boolean method1021(boolean arg0);

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)V")
    void method1446(int arg0, int arg1);

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    Buffer method1025(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(B)Leea;")
    class680 method2310(byte arg0);
}
