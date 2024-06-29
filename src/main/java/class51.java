import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public interface class51 extends class117 {

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(IIIIII[II)V")
    void method347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7);

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(B)Z")
    boolean method348(byte arg0);

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(IIBII[II)V")
    void method349(int arg0, int arg1, byte arg2, int arg3, int arg4, int[] arg5, int arg6);

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "(I)I")
    int method350(int arg0);

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(Z)I")
    int method351(boolean arg0);

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "([BILkea;IIIIII)V")
    void method352(byte[] arg0, int arg1, class77 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(BF)F")
    float method353(byte arg0, float arg1);

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(IF)F")
    float method354(int arg0, float arg1);

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(ZBZ)V")
    void method355(boolean arg0, byte arg1, boolean arg2);
}
