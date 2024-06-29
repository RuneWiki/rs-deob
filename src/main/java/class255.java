import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public interface class255 {

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II[BI)V")
    void method891(int arg0, int arg1, byte[] arg2, int arg3);

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)I")
    int method893(int arg0);

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)I")
    int method892(int arg0);

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)J")
    long method896(int arg0);
}
