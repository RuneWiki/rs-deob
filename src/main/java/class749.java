import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public interface class749 extends class664 {

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(I)Lwt;")
    class309 method2155(int arg0);

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    Buffer method2154(int arg0, boolean arg1);

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IB)V")
    void method2157(int arg0, byte arg1);

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)V")
    void method1059(int arg0);

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)Z")
    boolean method2156(byte arg0);
}
