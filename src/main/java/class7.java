import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 {

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field67 = -1;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "[I")
    public static int[] field69 = new int[25];

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field65 = 0;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "Lus;")
    public static class1 field68 = new class1(101, 15);

    @OriginalMember(owner = "client!il", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field70 = new String[100];

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static final void method25(int arg0) {
        class184.field2715 = null;
        class95.field1228 = null;
        class23.field309 = null;
        field66++;
        class103.field1318 = false;
        class27.field366 = null;
        class255.field3740 = null;
        if (arg0 != -27832004) {
            field67 = 51;
        }
        class453.method2661((byte) 127);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
    public static void method26(byte arg0) {
        field68 = null;
        field69 = null;
        field70 = null;
        int var1 = -94 / ((arg0 + 30) / 61);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IILut;II)V")
    public static final void method27(int arg0, int arg1, class71 arg2, int arg3, int arg4) {
        if (arg0 != 12727) {
            field65 = -117;
        }
        field64++;
        long var5 = (long) (arg4 << 14 | arg3 << 28 | arg1);
        class442 var7 = (class442) class269.field3928.method2761(var5, (byte) -112);
        if (var7 == null) {
            class442 var8 = new class442();
            class269.field3928.method2767(arg0 ^ 0xFFFFCE48, var5, var8);
            var8.field6126.method2845(arg2, (byte) 37);
            return;
        }
        class41 var9 = class64.field834.method2129(arg2.field885, false);
        int var10 = var9.field559;
        if (var9.field592 == 1) {
            var10 = (arg2.field887 + 1) * var10;
        }
        for (class71 var11 = (class71) var7.field6126.method2843(1123227612); var11 != null; var11 = (class71) var7.field6126.method2842(1673506446)) {
            class41 var12 = class64.field834.method2129(var11.field885, false);
            int var13 = var12.field559;
            if (var12.field592 == 1) {
                var13 = (var11.field887 + 1) * var13;
            }
            if (var13 < var10) {
                class386.method2325(arg2, var11, 111105159);
                return;
            }
        }
        var7.field6126.method2845(arg2, (byte) 37);
    }
}
