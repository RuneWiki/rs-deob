import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public interface class21 {

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Z")
    boolean method118(int arg0, int arg1);

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)Z")
    boolean method119(int arg0, int arg1);

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)[I")
    int[] method120(int arg0, int arg1);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)Z")
    boolean method121(int arg0, byte arg1);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IFI)[I")
    int[] method122(int arg0, float arg1, int arg2);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)I")
    int method123(byte arg0, int arg1);

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(II)Z")
    boolean method124(int arg0, int arg1);
}
