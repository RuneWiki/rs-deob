import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public interface class448 extends class574 {

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
    void method24(byte arg0);

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)Z")
    boolean method28(int arg0);

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)Z")
    boolean method2520(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    Buffer method27(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(BIILjaclib/memory/Source;)Z")
    boolean method2521(byte arg0, int arg1, int arg2, Source arg3);
}
