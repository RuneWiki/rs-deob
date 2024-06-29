import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public interface class359 {

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)I")
    int method1114(byte arg0);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([BIII)V")
    void method1109(byte[] arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)I")
    int method1110(byte arg0);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)J")
    long method1111(int arg0);
}
