import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public interface class342 extends class126 {

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
    void method249(int arg0);

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(I)Z")
    boolean method245(int arg0);

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    Buffer method251(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z")
    boolean method1344(int arg0, Source arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIB)Z")
    boolean method1343(int arg0, int arg1, byte arg2);
}
