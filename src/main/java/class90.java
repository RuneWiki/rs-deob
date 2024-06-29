import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public interface class90 extends class65 {

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljaclib/memory/Source;III)Z")
    boolean method408(Source arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)Z")
    boolean method411(int arg0);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    Buffer method410(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)V")
    void method409(boolean arg0);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIB)Z")
    boolean method412(int arg0, int arg1, byte arg2);
}
