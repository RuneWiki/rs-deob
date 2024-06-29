import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public interface class161 extends class664 {

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V")
    void method1059(int arg0);

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "(I)Z")
    boolean method1060(int arg0);

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(III)Z")
    boolean method1061(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Ljaclib/memory/Source;BII)Z")
    boolean method1062(Source arg0, byte arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    Buffer method1063(int arg0, boolean arg1);
}
