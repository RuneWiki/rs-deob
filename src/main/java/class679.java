import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public interface class679 extends class172 {

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
    void method431(int arg0);

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)Lmg;")
    class134 method427(int arg0);

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)Z")
    boolean method425(int arg0);

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)V")
    void method424(byte arg0, int arg1);

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    Buffer method430(boolean arg0, byte arg1);
}
