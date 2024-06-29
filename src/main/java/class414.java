import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public interface class414 extends class216 {

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    Buffer method3305(int arg0, boolean arg1);

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)Ldn;")
    class544 method3306(byte arg0);

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)Z")
    boolean method3307(int arg0);

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZ)V")
    void method980(int arg0, boolean arg1);

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
    void method981(int arg0);
}
