import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public interface class562 extends class632 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V")
    void method180(int arg0, int arg1);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
    void method176(boolean arg0);

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)Lkq;")
    class594 method181(int arg0);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method179(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)Z")
    boolean method178(byte arg0);
}
