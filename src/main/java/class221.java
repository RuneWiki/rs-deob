import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public interface class221 {

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)I")
    int method60(int arg0, int arg1);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)[I")
    int[] method53(byte arg0, int arg1);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)Z")
    boolean method59(int arg0, boolean arg1);

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)Z")
    boolean method61(int arg0, int arg1);

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(II)Z")
    boolean method63(int arg0, int arg1);

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(II)Z")
    boolean method52(int arg0, int arg1);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(FBI)[I")
    int[] method57(float arg0, byte arg1, int arg2);
}
