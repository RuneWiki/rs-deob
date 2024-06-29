import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public interface class226 extends class623 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    void method1543(int arg0);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)Z")
    boolean method1544(int arg0);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method1545(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
    void method1546(int arg0, int arg1);

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)Lso;")
    class497 method1547(int arg0);
}
