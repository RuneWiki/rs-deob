import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class491 {

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "[I")
    public static int[] field6307 = new int[1];

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "Lrn;")
    public static class633 field6311 = new class633(15, 11);

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "F")
    public static float field6308;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "[Lkl;")
    public static class739[] field6306;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static void method2740(int arg0) {
        field6306 = null;
        field6307 = null;
        field6311 = null;
        if (arg0 != -22836) {
            field6306 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIBI)I")
    public static final int method2741(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg3 & 0x3;
        if (arg2 != 89) {
            field6308 = 0.13267948F;
        }
        field6309++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 4095 - arg0;
        } else if (var4 == 2) {
            return 4095 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILwm;)V")
    public static final void method2742(int arg0, class30 arg1) {
        field6310++;
        class234.field3199 = arg1.method135(0, "p11_full");
        class353.field4310 = arg1.method135(0, "p12_full");
        if (arg0 == 1) {
            class657.field8536 = arg1.method135(arg0 - 1, "b12_full");
        }
    }
}
