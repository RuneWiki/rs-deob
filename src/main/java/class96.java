import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public interface class96 {

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)I")
    int method681(byte arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIF)[I")
    int[] method682(int arg0, int arg1, float arg2);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Z")
    boolean method683(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(BI)[I")
    int[] method684(byte arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI)Z")
    boolean method685(boolean arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(ZI)Z")
    boolean method686(boolean arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Z")
    boolean method687(int arg0, int arg1);
}
