import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public interface class155 extends class326 {

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(I)Z")
    boolean method357(int arg0);

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    Buffer method354(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(B)V")
    void method74(byte arg0);

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IILjaclib/memory/Source;I)Z")
    boolean method355(int arg0, int arg1, Source arg2, int arg3);

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIB)Z")
    boolean method353(int arg0, int arg1, byte arg2);
}
