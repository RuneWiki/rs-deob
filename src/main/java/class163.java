import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public interface class163 extends class695 {

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)Z")
    boolean method1239(int arg0);

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
    void method878(int arg0);

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V")
    void method1240(int arg0, int arg1);

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    Buffer method1241(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)Lbaa;")
    class523 method1242(byte arg0);
}
