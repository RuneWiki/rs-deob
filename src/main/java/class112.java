import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public interface class112 {

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZIIBF)[F")
    float[] method915(int arg0, boolean arg1, int arg2, int arg3, byte arg4, float arg5);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(FIIZII)[I")
    int[] method916(float arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)Lb;")
    class122 method917(byte arg0, int arg1);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)Z")
    boolean method918(int arg0, int arg1);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIZF)[I")
    int[] method919(int arg0, int arg1, int arg2, int arg3, boolean arg4, float arg5);
}
