import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public interface class421 extends class175 {

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    Buffer method3256(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
    void method20(boolean arg0);

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)Z")
    boolean method3257(int arg0);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
    void method24(int arg0, int arg1);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)Lpj;")
    class157 method3258(int arg0);
}
