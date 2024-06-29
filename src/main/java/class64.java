import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class64 {

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "I")
    public static int field851 = 0;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "F")
    public static float field848;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "Lpj;")
    public static class132 field850;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)V")
    public static final void method520(int arg0) {
        field849++;
        class348.method2073(114);
        if (arg0 != 2244) {
            field848 = -0.57123655F;
        }
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)V")
    public static void method521(int arg0) {
        field850 = null;
        int var1 = 106 % ((46 - arg0) / 53);
    }
}
