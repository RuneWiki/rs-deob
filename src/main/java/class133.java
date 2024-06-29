import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public interface class133 extends class471 {

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(III)Z")
    boolean method703(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V")
    void method296(byte arg0);

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    Buffer method297(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)Z")
    boolean method290(int arg0);

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Ljaclib/memory/Source;IBI)Z")
    boolean method704(Source arg0, int arg1, byte arg2, int arg3);
}
