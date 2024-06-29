import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public interface class467 extends class534 {

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
    void method1022(byte arg0);

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Ljaclib/memory/Source;III)Z")
    boolean method1023(Source arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)Z")
    boolean method1021(boolean arg0);

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    Buffer method1025(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(III)Z")
    boolean method1019(int arg0, int arg1, int arg2);
}
