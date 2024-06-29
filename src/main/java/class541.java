import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public interface class541 {

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)I")
    int method471(int arg0);

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)J")
    long method474(int arg0);

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)I")
    int method468(byte arg0);

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(III[B)V")
    void method475(int arg0, int arg1, int arg2, byte[] arg3);
}
