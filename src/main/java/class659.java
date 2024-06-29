import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public interface class659 extends class5 {

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)Z")
    boolean method774(int arg0);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IB)V")
    void method777(int arg0, byte arg1);

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(Z)V")
    void method776(boolean arg0);

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)Lps;")
    class82 method775(int arg0);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    Buffer method779(byte arg0, boolean arg1);
}
