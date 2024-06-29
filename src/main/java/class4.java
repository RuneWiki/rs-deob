import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public interface class4 extends class574 {

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)V")
    void method24(byte arg0);

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)Lne;")
    class294 method25(byte arg0);

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)V")
    void method26(int arg0, int arg1);

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    Buffer method27(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)Z")
    boolean method28(int arg0);
}
