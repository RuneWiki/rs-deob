import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public interface class209 extends class542 {

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Ljaclib/memory/Source;III)Z")
    boolean method1070(Source arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)Z")
    boolean method651(int arg0);

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(III)Z")
    boolean method1071(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method652(boolean arg0, int arg1);

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)V")
    void method650(boolean arg0);
}
