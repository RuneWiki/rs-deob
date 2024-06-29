import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public interface class353 extends class695 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljaclib/memory/Source;IIB)Z")
    boolean method881(Source arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)Z")
    boolean method882(int arg0);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method880(boolean arg0, int arg1);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBI)Z")
    boolean method879(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    void method878(int arg0);
}
