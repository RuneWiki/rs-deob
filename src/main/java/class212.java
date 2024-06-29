import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public interface class212 extends class553 {

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)V")
    void method1398(boolean arg0);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZ)V")
    void method1399(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(Z)Z")
    boolean method1400(boolean arg0);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method1401(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)Lkf;")
    class720 method1402(int arg0);
}
