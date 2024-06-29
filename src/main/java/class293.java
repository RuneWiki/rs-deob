import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public interface class293 extends class302 {

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z")
    boolean method439(int arg0, Source arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "(I)Z")
    boolean method442(int arg0);

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    Buffer method440(int arg0, boolean arg1);

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V")
    void method443(int arg0);

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZII)Z")
    boolean method444(boolean arg0, int arg1, int arg2);
}
