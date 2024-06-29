import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public interface class612 extends class435 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    Buffer method2646(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    void method2614(int arg0);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z")
    boolean method2639(int arg0, int arg1, int arg2, Source arg3);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)Z")
    boolean method2642(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)Z")
    boolean method2640(int arg0);
}
