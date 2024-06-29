import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public interface class553 extends class615 {

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IILjaclib/memory/Source;I)Z")
    boolean method680(int arg0, int arg1, Source arg2, int arg3);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIZ)Z")
    boolean method679(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)Z")
    boolean method678(int arg0);

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V")
    void method602(byte arg0);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    Buffer method676(byte arg0, boolean arg1);
}
