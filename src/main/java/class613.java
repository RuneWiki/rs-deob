import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public interface class613 extends class225 {

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
    void method7(int arg0);

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method995(boolean arg0, int arg1);

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(B)Z")
    boolean method992(byte arg0);

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z")
    boolean method994(int arg0, int arg1, int arg2, Source arg3);

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(III)Z")
    boolean method993(int arg0, int arg1, int arg2);
}
