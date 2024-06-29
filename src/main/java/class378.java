import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public interface class378 extends class354 {

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILjaclib/memory/Source;I)Z")
    boolean method2170(int arg0, int arg1, Source arg2, int arg3);

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)Z")
    boolean method2169(byte arg0);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)Z")
    boolean method2164(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    Buffer method2167(int arg0, boolean arg1);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
    void method382(byte arg0);
}
