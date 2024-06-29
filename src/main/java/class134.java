import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class134 {

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Li;")
    public static class88 field2498 = class208.method1425(105, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "[[[Lwi;")
    public static class248[][][] field2499 = new class248[4][104][104];

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "[I")
    public static int[] field2503 = new int[1000];

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Li;")
    public static class88 field2495 = class208.method1425(105, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Li;")
    public static class88 field2501 = class208.method1425(105, "(U5");

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Li;")
    public static class88 field2500 = class208.method1425(105, "Abbrechen");

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field2505 = 0;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIBIII)V")
    public static final void method894(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field2497++;
        int var6 = arg3;
        class230.method1536(arg0 - arg1, arg5, -7, arg0 + arg1, class3.field42[arg4]);
        if (arg2 != 89) {
            return;
        }
        int var7 = arg1 * arg1;
        int var8 = 0;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var7 << 1;
        int var12 = arg3 << 1;
        int var13 = var9 - (var12 - 1) * var11;
        int var14 = (1 - var12) * var7 + var10;
        int var15 = var7 << 2;
        int var16 = ((arg3 << 1) - 3) * var11;
        int var17 = var9 << 2;
        int var18 = (var8 + 1) * var17;
        int var19 = ((var8 << 1) + 3) * var10;
        int var20 = (arg3 - 1) * var15;
        while (var6 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var8++;
                    var14 += var19;
                    var13 += var18;
                    var19 += var17;
                    var18 += var17;
                }
            }
            var6--;
            int var21 = arg4 - var6;
            if (var13 < 0) {
                var14 += var19;
                var8++;
                var19 += var17;
                var13 += var18;
                var18 += var17;
            }
            int var22 = arg4 + var6;
            var14 += -var20;
            var20 -= var15;
            int var23 = arg0 + var8;
            int var24 = arg0 - var8;
            class230.method1536(var24, arg5, -7, var23, class3.field42[var21]);
            var13 += -var16;
            var16 -= var15;
            class230.method1536(var24, arg5, -7, var23, class3.field42[var22]);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZB)V")
    public static final void method895(boolean arg0, byte arg1) {
        class219.method1481(2);
        class144.field2709++;
        if (arg1 != 49) {
            method897(false);
        }
        field2494++;
        if (class144.field2709 < 50 && !arg0) {
            return;
        }
        class144.field2709 = 0;
        if (class58.field1097 || class33.field556 == null) {
            return;
        }
        class31.field498++;
        class146.field2749.method30((byte) -102, 19);
        try {
            class33.field556.method913(class146.field2749.field831, 0, class146.field2749.field842, 17492);
            class146.field2749.field831 = 0;
        } catch (IOException var2) {
            class58.field1097 = true;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static final void method896(int arg0) {
        class15.field228 = null;
        class201.field3842 = null;
        class143.field2645 = null;
        if (arg0 == 1965381537) {
            field2502++;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
    public static void method897(boolean arg0) {
        field2495 = null;
        if (arg0) {
            method897(false);
        }
        field2499 = null;
        field2498 = null;
        field2501 = null;
        field2500 = null;
        field2503 = null;
    }
}
