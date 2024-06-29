import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public interface class297 extends class67 {

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)I")
    int method592(byte arg0);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IF)F")
    float method591(int arg0, float arg1);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIII[IIB)V")
    void method596(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, byte arg7);

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)I")
    int method598(byte arg0);

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "(B)Z")
    boolean method599(byte arg0);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILqda;IBIIII[B)V")
    void method593(int arg0, class105 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II[IIIII)V")
    void method594(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IZZ)V")
    void method595(int arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(FI)F")
    float method597(float arg0, int arg1);
}
