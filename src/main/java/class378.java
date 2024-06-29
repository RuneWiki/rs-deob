import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class378 {

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "Z")
    public static boolean field5428 = false;

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "[I")
    public static int[] field5426 = new int[13];

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "Ljn;")
    public static class134 field5429 = new class134(9, -1);

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "Lqk;")
    public static class1 field5430 = new class1(39, 15);

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!tda", name = "g", descriptor = "Lsha;")
    public static class115 field5431;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V")
    public static void method2365(int arg0) {
        field5426 = null;
        field5429 = null;
        field5431 = null;
        field5430 = null;
        if (arg0 != 39) {
            method2366(-5, -55, 79, 10, 90);
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIIII)V")
    public static final void method2366(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5427++;
        if (arg2 >= arg0) {
            for (int var5 = arg0; var5 < arg2; var5++) {
                class705.field9804[var5][arg4] = arg3;
            }
        } else {
            for (int var6 = arg2; var6 < arg0; var6++) {
                class705.field9804[var6][arg4] = arg3;
            }
        }
        if (arg1 != 39) {
            method2365(-22);
        }
    }
}
