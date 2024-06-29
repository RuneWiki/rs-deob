import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public interface class212 extends class562 {

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)I")
    int method36(int arg0);

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(FI)F")
    float method39(float arg0, int arg1);

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)Z")
    boolean method38(byte arg0);

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIZIILnh;I[B)V")
    void method34(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class699 arg6, int arg7, byte[] arg8);

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([IIIIIIII)V")
    void method35(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BF)F")
    float method42(byte arg0, float arg1);

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)I")
    int method37(int arg0);

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZZI)V")
    void method40(boolean arg0, boolean arg1, int arg2);
}
