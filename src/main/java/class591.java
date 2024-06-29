import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public interface class591 extends class316 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    void method294(byte arg0);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z")
    boolean method298(int arg0, int arg1, int arg2, Source arg3);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Z")
    boolean method299(int arg0);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    Buffer method295(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)Z")
    boolean method296(int arg0, int arg1, int arg2);
}
