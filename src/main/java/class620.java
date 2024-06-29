import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public interface class620 extends class126 {

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)Lvt;")
    class343 method246(byte arg0);

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    Buffer method251(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
    void method249(int arg0);

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)V")
    void method252(int arg0, int arg1);

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)Z")
    boolean method245(int arg0);
}
