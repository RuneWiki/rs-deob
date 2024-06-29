import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public interface class129 extends class768 {

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(B)V")
    void method274(byte arg0);

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Ljaclib/memory/Source;IBI)Z")
    boolean method272(Source arg0, int arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    Buffer method271(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IBI)Z")
    boolean method273(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)Z")
    boolean method275(int arg0);
}
