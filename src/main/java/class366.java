import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public interface class366 extends class215 {

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    Buffer method1283(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)Z")
    boolean method1289(byte arg0);

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)Z")
    boolean method1290(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z")
    boolean method1285(int arg0, Source arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V")
    void method1284(boolean arg0);
}
