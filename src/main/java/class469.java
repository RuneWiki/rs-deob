import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class469 {

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "[F")
    public static float[] field6742 = new float[4];

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "Ldt;")
    public static class616 field6743;

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "Ldt;")
    public static class616 field6740 = field6743 = new class616(false);

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "Lus;")
    public static class328 field6744 = new class328(71, -1);

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)V", line = 3)
    public static void method2762(int arg0) {
        field6743 = null;
        if (arg0 != -13741) {
            method2763(13, 118, 96, null, 116, (byte) 11, null, null);
        }
        field6740 = null;
        field6742 = null;
        field6744 = null;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIILgaa;IBLaa;Lac;)V", line = 31)
    public static final void method2763(int arg0, int arg1, int arg2, class460 arg3, int arg4, byte arg5, class81 arg6, class712 arg7) {
        field6739++;
        if (arg7 == null) {
            return;
        }
        if (arg5 < 19) {
            method2762(-55);
        }
        int var8;
        if (class276.field3497 == 4) {
            var8 = (int) class748.field10471 & 0x3FFF;
        } else {
            var8 = (int) class748.field10471 + class10.field112 & 0x3FFF;
        }
        int var9 = Math.max(arg3.field6566 / 2, arg3.field6514 / 2) + 10;
        int var10 = arg1 * arg1 + arg4 * arg4;
        if (var10 > var9 * var9) {
            return;
        }
        int var11 = class138.field1644[var8];
        int var12 = class138.field1645[var8];
        if (class276.field3497 != 4) {
            var12 = var12 * 256 / (class3.field16 + 256);
            var11 = var11 * 256 / (class3.field16 + 256);
        }
        int var13 = arg1 * var12 + arg4 * var11 >> 14;
        int var14 = arg4 * var12 - (arg1 * var11) >> 14;
        arg7.method691(arg3.field6566 / 2 + (arg0 - ((arg7.method1892() / 2) - var13)), -var14 + arg2 - (-(arg3.field6514 / 2) - -(arg7.method1882() / 2)), arg6, arg0, arg2);
    }
}
