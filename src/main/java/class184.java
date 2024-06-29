import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public interface class184 extends class136 {

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IILjaclib/memory/Source;I)Z")
    boolean method1228(int arg0, int arg1, Source arg2, int arg3);

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V")
    void method987(int arg0);

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(III)Z")
    boolean method1229(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(I)Z")
    boolean method1230(int arg0);

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method1231(boolean arg0, int arg1);
}
