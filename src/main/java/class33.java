import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public interface class33 extends class278 {

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IB)V")
    void method174(int arg0, byte arg1);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
    void method175(int arg0);

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)Lwq;")
    class674 method176(int arg0);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    Buffer method177(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)Z")
    boolean method178(byte arg0);
}
