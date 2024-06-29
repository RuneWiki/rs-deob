import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public interface class438 extends class623 {

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V")
    void method1543(int arg0);

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z")
    boolean method1738(int arg0, Source arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(B)Z")
    boolean method1737(byte arg0);

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(BII)Z")
    boolean method1736(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method1739(boolean arg0, int arg1);
}
