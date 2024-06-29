import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public interface class519 extends class138 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    Buffer method62(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    void method60(int arg0);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)Z")
    boolean method61(byte arg0);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z")
    boolean method2813(int arg0, Source arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBI)Z")
    boolean method2814(int arg0, byte arg1, int arg2);
}
