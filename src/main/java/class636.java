import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public interface class636 extends class355 {

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(FI)F")
    float method432(float arg0, int arg1);

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)Z")
    boolean method428(int arg0);

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIILkca;Z[BI)V")
    void method433(int arg0, int arg1, int arg2, int arg3, int arg4, class82 arg5, boolean arg6, byte[] arg7, int arg8);

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "([IIIBIII)V")
    void method422(int[] arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZBZ)V")
    void method427(boolean arg0, byte arg1, boolean arg2);

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)I")
    int method426(boolean arg0);

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "(I)I")
    int method429(int arg0);

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IF)F")
    float method423(int arg0, float arg1);

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIZII[II)V")
    void method434(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int[] arg6, int arg7);
}
