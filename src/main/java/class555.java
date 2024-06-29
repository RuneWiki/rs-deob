import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public interface class555 extends class5 {

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBILjaclib/memory/Source;)Z")
    boolean method1247(int arg0, byte arg1, int arg2, Source arg3);

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)Z")
    boolean method774(int arg0);

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)V")
    void method776(boolean arg0);

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    Buffer method779(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIB)Z")
    boolean method1249(int arg0, int arg1, byte arg2);
}
