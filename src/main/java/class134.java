import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public interface class134 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)I")
    int method168(int arg0, int arg1);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)Z")
    boolean method164(byte arg0, int arg1);

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)Z")
    boolean method163(int arg0, int arg1);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)Z")
    boolean method171(int arg0, byte arg1);

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(II)[I")
    int[] method162(int arg0, int arg1);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FII)[I")
    int[] method170(float arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(II)Z")
    boolean method161(int arg0, int arg1);
}
