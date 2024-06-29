import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public interface class17 {

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZFIIIB)[I")
    int[] method185(boolean arg0, float arg1, int arg2, int arg3, int arg4, byte arg5);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZIIIIF)[I")
    int[] method186(boolean arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIBIZF)[F")
    float[] method187(int arg0, int arg1, byte arg2, int arg3, boolean arg4, float arg5);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Z")
    boolean method188(int arg0, int arg1);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I")
    int method189(int arg0);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)Lsr;")
    class211 method190(byte arg0, int arg1);
}
