import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public interface class682 extends class216 {

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z")
    boolean method3931(int arg0, int arg1, int arg2, Source arg3);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BII)Z")
    boolean method3933(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    void method981(int arg0);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)Z")
    boolean method3932(byte arg0);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method3929(boolean arg0, int arg1);
}
