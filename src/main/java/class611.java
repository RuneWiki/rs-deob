import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class611 {

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field8635 = 0;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "[I")
    public static int[] field8633 = new int[1000];

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "[I")
    public static int[] field8637 = new int[4096];

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Lbh;")
    public static class37 field8636 = new class37("WTRC", "office", "_rc", 1);

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
    public static int[] field8640 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "D")
    public static double field8638;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field8634;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field8639;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 6)
    public static final void method3541(int arg0) {
        field8639++;
        int var1 = class254.field3653;
        int[] var2 = class345.field4993;
        if (arg0 != 1000) {
            field8633 = null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class689 var9 = class314.field4456[var2[var3]];
            if (var9 != null && var9.field6099 > 0) {
                var9.field6099--;
                if (var9.field6099 == 0) {
                    var9.field6020 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class441.field6552; var4++) {
            long var5 = (long) class338.field4921[var4];
            class432 var7 = (class432) class497.field7067.method2287(var5, (byte) -117);
            if (var7 != null) {
                class282 var8 = var7.field6439;
                if (var8.field6099 > 0) {
                    var8.field6099--;
                    if (var8.field6099 == 0) {
                        var8.field6020 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILk;)I", line = 66)
    public static final int method3542(int arg0, class567 arg1) {
        if (arg0 == -8501) {
            field8634++;
            String var2 = class559.method3269(arg1, (byte) 127);
            return class335.field4827.method589(var2, 169, class259.field3701);
        } else {
            return 104;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V", line = 88)
    public static final void method3543(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8641++;
        class150 var5 = class676.method3885(1000, 10, arg1);
        if (arg0 != 0) {
            field8640 = null;
        }
        var5.method1116(arg0 + 111);
        var5.field2346 = arg2;
        var5.field2345 = arg4;
        var5.field2342 = arg3;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V", line = 110)
    public static void method3544(int arg0) {
        field8636 = null;
        field8637 = null;
        field8640 = null;
        if (arg0 == 0) {
            field8633 = null;
        }
    }
}
