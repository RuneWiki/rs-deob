import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public interface class743 extends class591 {

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
    void method697(int arg0);

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BI)V")
    void method924(byte arg0, int arg1);

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)Lal;")
    class121 method927(int arg0);

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(B)Z")
    boolean method925(byte arg0);

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method926(boolean arg0, int arg1);
}
