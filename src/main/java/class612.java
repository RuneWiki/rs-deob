import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public interface class612 extends class402 {

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(I)Z")
    boolean method419(int arg0);

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "(I)I")
    int method412(int arg0);

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIIII[III)V")
    void method415(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IF)F")
    float method416(int arg0, float arg1);

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IZZ)V")
    void method414(int arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "(I)I")
    int method417(int arg0);

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(FZ)F")
    float method418(float arg0, boolean arg1);

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "([BIIIIIIILjb;)V")
    void method421(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class666 arg8);
}
