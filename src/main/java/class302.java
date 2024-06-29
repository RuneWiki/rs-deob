import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public interface class302 extends class410 {

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Z)V")
    void method1496(boolean arg0);

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(III)Z")
    boolean method1497(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)Z")
    boolean method1494(int arg0);

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Ljaclib/memory/Source;IIB)Z")
    boolean method1495(Source arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    Buffer method1492(byte arg0, boolean arg1);
}
