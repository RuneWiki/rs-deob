import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public interface class269 extends class471 {

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    Buffer method647(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IILjaclib/memory/Source;I)Z")
    boolean method643(int arg0, int arg1, Source arg2, int arg3);

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
    void method645(int arg0);

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BII)Z")
    boolean method649(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)Z")
    boolean method646(int arg0);
}
