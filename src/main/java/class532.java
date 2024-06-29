import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public interface class532 extends class245 {

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)Z")
    boolean method49(int arg0);

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZI)V")
    void method50(boolean arg0, int arg1);

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    Buffer method48(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)Lkn;")
    class770 method46(byte arg0);

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
    void method47(byte arg0);
}
