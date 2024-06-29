import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public interface class174 extends class658 {

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    Buffer method968(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
    void method970(int arg0);

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)Z")
    boolean method975(int arg0);

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ZI)V")
    void method969(boolean arg0, int arg1);

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(I)Ljt;")
    class38 method974(int arg0);
}
