import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public interface class669 extends class591 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Z")
    boolean method696(int arg0);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZII)Z")
    boolean method693(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z")
    boolean method698(int arg0, Source arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method692(boolean arg0, int arg1);

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    void method697(int arg0);
}
