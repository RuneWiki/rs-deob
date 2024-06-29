import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public interface class543 extends class573 {

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(II)V")
    void method267(int arg0, int arg1);

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(Z)Ljm;")
    class687 method264(boolean arg0);

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    Buffer method263(int arg0, boolean arg1);

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)Z")
    boolean method266(int arg0);

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z)V")
    void method262(boolean arg0);
}
