import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public interface class497 extends class316 {

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    Buffer method1369(int arg0, boolean arg1);

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)V")
    void method294(byte arg0);

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)V")
    void method1008(int arg0, int arg1);

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(B)Lwha;")
    class285 method1370(byte arg0);

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Z)Z")
    boolean method1368(boolean arg0);
}
