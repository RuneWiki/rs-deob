import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public interface class601 extends class172 {

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    Buffer method1726(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)Z")
    boolean method1722(int arg0);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BII)Z")
    boolean method1725(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    void method431(int arg0);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljaclib/memory/Source;III)Z")
    boolean method1723(Source arg0, int arg1, int arg2, int arg3);
}
