import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public interface class609 extends class499 {

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method613(boolean arg0, int arg1);

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z")
    boolean method617(int arg0, int arg1, int arg2, Source arg3);

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)Z")
    boolean method619(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V")
    void method618(byte arg0);

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)Z")
    boolean method616(byte arg0);
}
