import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public interface class545 extends class573 {

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljaclib/memory/Source;BII)Z")
    boolean method3106(Source arg0, byte arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)Z")
    boolean method3107(byte arg0);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method3109(boolean arg0, int arg1);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)Z")
    boolean method3110(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
    void method262(boolean arg0);
}
