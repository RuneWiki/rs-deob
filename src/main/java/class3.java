import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class3 extends class171 {

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "Ljava/lang/String;")
    public static String field103 = "scroll:";

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "Z")
    public static boolean field102 = false;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "Ljava/lang/String;")
    public static String field110 = "flash3:";

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "Lmd;")
    public static class273 field107;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "[I")
    public static int[] field104;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
    public static void method28(int arg0) {
        field107 = null;
        field103 = null;
        field110 = null;
        if (arg0 == -16338) {
            field104 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method29(int arg0, int arg1, int arg2, long arg3) {
        class174 var5 = class90.field1498[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2800 != null && var5.field2800.field2945 == arg3) {
            return true;
        } else if (var5.field2817 != null && var5.field2817.field4256 == arg3) {
            return true;
        } else if (var5.field2805 != null && var5.field2805.field428 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2814; var6++) {
                if (var5.field2812[var6].field1278 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZI[Lhg;II)V")
    public static final void method30(int arg0, boolean arg1, int arg2, class207[] arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 84 % ((66 - arg0) / 45);
        while (arg3.length > var6) {
            class207 var8 = arg3[var6];
            if (var8 != null && var8.field3465 == arg4) {
                class133.method991(arg2, var8, arg1, (byte) -78, arg5);
                client.method729(arg2, var8, -122, arg5);
                if (var8.field3450 > var8.field3416 - var8.field3484) {
                    var8.field3450 = var8.field3416 - var8.field3484;
                }
                if (var8.field3450 < 0) {
                    var8.field3450 = 0;
                }
                if (var8.field3374 > var8.field3344 - var8.field3481) {
                    var8.field3374 = var8.field3344 - var8.field3481;
                }
                if (var8.field3374 < 0) {
                    var8.field3374 = 0;
                }
                if (var8.field3376 == 0) {
                    class26.method168(var8, 0, arg1);
                }
            }
            var6++;
        }
        field105++;
    }
}
