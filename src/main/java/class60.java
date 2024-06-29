import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public interface class60 extends class299 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    Buffer method471(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)Z")
    boolean method472(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z")
    boolean method473(int arg0, int arg1, int arg2, Source arg3);

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    void method474(int arg0);

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)Z")
    boolean method475(byte arg0);
}
