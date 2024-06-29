import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public interface class419 extends class302 {

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    Buffer method440(int arg0, boolean arg1);

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(I)V")
    void method443(int arg0);

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)V")
    void method644(int arg0, int arg1);

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "(I)Lvp;")
    class160 method645(int arg0);

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "(I)Z")
    boolean method442(int arg0);
}
