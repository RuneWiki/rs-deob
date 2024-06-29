import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public interface class508 extends class218 {

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    Buffer method741(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)Z")
    boolean method740(int arg0);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIZ)Z")
    boolean method742(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z")
    boolean method739(int arg0, int arg1, int arg2, Source arg3);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
    void method11(byte arg0);
}
