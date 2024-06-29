import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public interface class436 extends class278 {

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    void method175(int arg0);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)Z")
    boolean method1101(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    Buffer method1103(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)Z")
    boolean method1099(byte arg0);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z")
    boolean method1102(int arg0, Source arg1, int arg2, int arg3);
}
