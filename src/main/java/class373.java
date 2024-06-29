import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public interface class373 extends class13 {

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZILjaclib/memory/Source;I)Z")
    boolean method2336(boolean arg0, int arg1, Source arg2, int arg3);

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)Z")
    boolean method2337(int arg0);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    Buffer method2338(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III)Z")
    boolean method2339(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V")
    void method851(int arg0);
}
