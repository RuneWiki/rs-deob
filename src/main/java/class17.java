import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public interface class17 extends class326 {

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)Z")
    boolean method71(int arg0);

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)Lrt;")
    class179 method72(byte arg0);

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IB)V")
    void method73(int arg0, byte arg1);

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(B)V")
    void method74(byte arg0);

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method75(boolean arg0, int arg1);
}
