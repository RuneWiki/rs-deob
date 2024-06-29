import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public interface class440 {

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "([BIII)V")
    void method114(byte[] arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)I")
    int method117(byte arg0);

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)J")
    long method113(byte arg0);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)I")
    int method112(int arg0);
}
