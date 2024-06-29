import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public interface class241 extends class632 {

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(I)Z")
    boolean method1448(int arg0);

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Z)V")
    void method176(boolean arg0);

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(BIILjaclib/memory/Source;)Z")
    boolean method1449(byte arg0, int arg1, int arg2, Source arg3);

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(III)Z")
    boolean method1450(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    Buffer method1451(boolean arg0, byte arg1);
}
