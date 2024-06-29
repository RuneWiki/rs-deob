import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class495 extends class223 {

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "Ldm;")
    public static class46 field6924 = new class46();

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "[I")
    public static int[] field6927 = new int[5];

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "[I")
    public static int[] field6929 = new int[] { 4, 4, 1, 2, 6, 4, 2, 45, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "Lio;")
    public static class370 field6928 = new class370();

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public static int field6926;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(IIIIIF)V")
    public class495(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method2870(byte arg0) {
        field6924 = null;
        field6928 = null;
        field6929 = null;
        field6927 = null;
        if (arg0 != 63) {
            field6928 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(FB)V")
    public final void method504(float arg0, byte arg1) {
        ++field6926;
        if (arg1 <= 87) {
            field6930 = -102;
        }
        super.field3179 = arg0;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIBI)V")
    public final void method506(int arg0, int arg1, byte arg2, int arg3) {
        super.field3193 = arg0;
        if (arg2 == -115) {
            super.field3187 = arg1;
            ++field6925;
            super.field3194 = arg3;
        }
    }
}
