import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public interface class532 extends class136 {

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(Z)Lbk;")
    class106 method988(boolean arg0);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
    void method987(int arg0);

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(Z)Z")
    boolean method986(boolean arg0);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    Buffer method985(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)V")
    void method984(int arg0, int arg1);
}
