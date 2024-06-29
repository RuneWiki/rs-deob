import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public interface class251 extends class553 {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    Buffer method1590(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)Z")
    boolean method1591(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)Z")
    boolean method1592(int arg0);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
    void method1398(boolean arg0);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljaclib/memory/Source;III)Z")
    boolean method1593(Source arg0, int arg1, int arg2, int arg3);
}
