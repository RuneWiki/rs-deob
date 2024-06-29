import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public interface class19 extends class190 {

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)Z")
    boolean method93(int arg0);

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)I")
    int method94(int arg0);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)I")
    int method95(byte arg0);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(FI)F")
    float method96(float arg0, int arg1);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IF)F")
    float method97(int arg0, float arg1);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III[IIII)V")
    void method98(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIILiv;[BIIZI)V")
    void method99(int arg0, int arg1, int arg2, class25 arg3, byte[] arg4, int arg5, int arg6, boolean arg7, int arg8);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZZI)V")
    void method100(boolean arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II[IIIIII)V")
    void method101(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7);
}
