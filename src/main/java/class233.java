import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public interface class233 extends class460 {

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)Z")
    boolean method288(int arg0);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
    void method284(byte arg0);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(III)Z")
    boolean method283(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    Buffer method286(int arg0, boolean arg1);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IBILjaclib/memory/Source;)Z")
    boolean method285(int arg0, byte arg1, int arg2, Source arg3);
}
