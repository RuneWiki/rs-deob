import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public interface class415 extends class126 {

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)Ljg;")
    class309 method1124(int arg0);

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(II)V")
    void method1116(int arg0, int arg1);

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)V")
    void method1122(int arg0);

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(Z)Z")
    boolean method1121(boolean arg0);

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    Buffer method1119(int arg0, boolean arg1);
}
