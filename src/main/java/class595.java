import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public interface class595 extends class354 {

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    Buffer method1188(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
    void method382(byte arg0);

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(B)Lro;")
    class2 method1187(byte arg0);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)Z")
    boolean method1185(boolean arg0);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IB)V")
    void method380(int arg0, byte arg1);
}
