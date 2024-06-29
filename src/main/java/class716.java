import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public interface class716 extends class316 {

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)V")
    void method1125(int arg0);

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    Buffer method2276(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIZ)Z")
    boolean method2277(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(BILjaclib/memory/Source;I)Z")
    boolean method2280(byte arg0, int arg1, Source arg2, int arg3);

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)Z")
    boolean method2281(int arg0);
}
