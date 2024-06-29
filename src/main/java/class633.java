import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public interface class633 extends class697 {

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    Buffer method2599(int arg0, boolean arg1);

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(III)Z")
    boolean method2603(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
    void method588(boolean arg0);

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)Z")
    boolean method2601(int arg0);

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z")
    boolean method2600(int arg0, Source arg1, int arg2, int arg3);
}
