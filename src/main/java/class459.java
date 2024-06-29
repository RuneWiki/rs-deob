import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public interface class459 extends class466 {

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)I")
    int method526(byte arg0);

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)Z")
    boolean method519(boolean arg0);

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(FB)F")
    float method518(float arg0, byte arg1);

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I[BLec;IIIIII)V")
    void method523(int arg0, byte[] arg1, class146 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BZZ)V")
    void method525(byte arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)I")
    int method517(int arg0);

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IBI[IIIII)V")
    void method520(int arg0, byte arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZF)F")
    float method522(boolean arg0, float arg1);
}
