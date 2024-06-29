import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public interface class250 {

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)[I")
    int[] method674(int arg0, int arg1);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(FII)[I")
    int[] method687(float arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)Z")
    boolean method684(int arg0, int arg1);

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)I")
    int method681(int arg0, int arg1);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)Z")
    boolean method686(int arg0, byte arg1);

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(II)Z")
    boolean method676(int arg0, int arg1);

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(II)Z")
    boolean method680(int arg0, int arg1);
}
