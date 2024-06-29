import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public interface class741 extends class245 {

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(B)V")
    void method47(byte arg0);

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    Buffer method3454(int arg0, boolean arg1);

    @OriginalMember(owner = "client!fka", name = "b", descriptor = "(B)Z")
    boolean method3456(byte arg0);

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z")
    boolean method3455(int arg0, int arg1, int arg2, Source arg3);

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(III)Z")
    boolean method3457(int arg0, int arg1, int arg2);
}
