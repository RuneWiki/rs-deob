import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public interface class154 extends class218 {

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    Buffer method14(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Z)Lbv;")
    class279 method12(boolean arg0);

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)Z")
    boolean method15(int arg0);

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(II)V")
    void method13(int arg0, int arg1);

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)V")
    void method11(byte arg0);
}
