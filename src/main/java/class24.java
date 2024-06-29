import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class24 {

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field476 = -1;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Ljava/lang/String;")
    public static String field479 = "cyan:";

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Lab;")
    public static class279 field478 = new class279(5);

    @OriginalMember(owner = "client!p", name = "j", descriptor = "[I")
    public static int[] field483 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Lth;")
    public static class55 field482 = new class55();

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Z")
    public static boolean field485 = false;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Lkl;")
    public static class68 field484;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 7)
    public static void method198(int arg0) {
        field479 = null;
        field482 = null;
        field478 = null;
        field484 = null;
        if (arg0 <= 73) {
            method200(-127);
        }
        field483 = null;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V", line = 23)
    public static final void method199(int arg0) {
        if (arg0 != 0) {
            method199(94);
        }
        class255.field3971.method1877(-29702);
        field474++;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)Loj;", line = 46)
    public static final class283 method200(int arg0) {
        int var1 = class28.field537[0] * class176.field2833[arg0];
        field480++;
        int[] var2 = new int[var1];
        byte[] var3 = class254.field3968[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class274.field4202[class61.method475(var3[var4], 255)];
        }
        class283 var5;
        if (class249.field3893) {
            var5 = new class137(class194.field3127, class321.field4891, class80.field1572[0], class27.field530[0], class28.field537[0], class176.field2833[0], var2);
        } else {
            var5 = new class206(class194.field3127, class321.field4891, class80.field1572[0], class27.field530[0], class28.field537[0], class176.field2833[0], var2);
        }
        class97.method644((byte) 109);
        return var5;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIII)V", line = 72)
    public static final void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field477++;
        int var8 = arg2 + 1;
        class241.method1598(arg5, -7, class155.field2522[arg2], arg1, arg4);
        if (arg0 != -25895) {
            return;
        }
        int var9 = arg3 - 1;
        class241.method1598(arg5, -7, class155.field2522[arg3], arg1, arg4);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class155.field2522[var6];
            var7[arg4] = var7[arg1] = arg5;
        }
    }
}
