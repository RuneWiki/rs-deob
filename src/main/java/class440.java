import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public interface class440 extends class658 {

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
    void method970(int arg0);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BII)Z")
    boolean method2140(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIZLjaclib/memory/Source;)Z")
    boolean method2141(int arg0, int arg1, boolean arg2, Source arg3);

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method2145(boolean arg0, int arg1);

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)Z")
    boolean method2143(int arg0);
}
