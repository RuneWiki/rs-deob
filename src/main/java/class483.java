import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public interface class483 extends class364 {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILjaclib/memory/Source;IB)Z")
    boolean method534(int arg0, Source arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    void method231(byte arg0);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)Z")
    boolean method535(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    Buffer method532(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)Z")
    boolean method530(int arg0);
}
