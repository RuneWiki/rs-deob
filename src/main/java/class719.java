import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public interface class719 extends class697 {

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V")
    void method2342(boolean arg0);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)Z")
    boolean method2405(int arg0);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    Buffer method2401(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)Z")
    boolean method2402(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLjaclib/memory/Source;II)Z")
    boolean method2404(byte arg0, Source arg1, int arg2, int arg3);
}
