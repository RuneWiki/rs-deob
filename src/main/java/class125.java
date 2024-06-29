import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public interface class125 {

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)J")
    long method662(int arg0);

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)I")
    int method663(byte arg0);

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)I")
    int method664(int arg0);

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(III[B)V")
    void method665(int arg0, int arg1, int arg2, byte[] arg3);
}
