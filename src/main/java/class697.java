import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public interface class697 extends class341 {

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljaclib/memory/Source;III)Z")
    boolean method2568(Source arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IBI)Z")
    boolean method2567(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    Buffer method2566(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)Z")
    boolean method2564(int arg0);

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(B)V")
    void method1758(byte arg0);
}
