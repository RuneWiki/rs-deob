import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public interface class288 extends class126 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    void method1122(int arg0);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)Z")
    boolean method1768(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method1769(boolean arg0, int arg1);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljaclib/memory/Source;III)Z")
    boolean method1770(Source arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)Z")
    boolean method1771(int arg0);
}
