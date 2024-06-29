import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public interface class241 extends class225 {

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method5(boolean arg0, int arg1);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)V")
    void method1(int arg0, int arg1);

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)Lig;")
    class218 method3(int arg0);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
    void method7(int arg0);

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(I)Z")
    boolean method2(int arg0);
}
