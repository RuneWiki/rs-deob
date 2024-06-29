import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class256 extends class12 {

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "[I")
    public int[] field4382 = new int[1];

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "[I")
    public int[] field4378 = new int[] { -1 };

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "[I")
    public static int[] field4385 = new int[2500];

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "[I")
    public static int[] field4388 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "[I")
    public static int[] field4379 = new int[256];

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "Lvf;")
    public static class265 field4386 = class87.method582(-46, "Moteur son pr-Bpar-B");

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "Lak;")
    public static class269 field4384;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4381;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "Z")
    public static boolean field4380;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
    public static void method1680(byte arg0) {
        if (arg0 <= 24) {
            method1681((byte) -92, (class192) null, (class265) null);
        }
        field4379 = null;
        field4384 = null;
        field4386 = null;
        field4381 = null;
        field4388 = null;
        field4385 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLfl;Lvf;)Lrd;")
    public static final class145 method1681(byte arg0, class192 arg1, class265 arg2) {
        int var3 = arg1.method1326((byte) -21, arg2);
        field4387++;
        if (var3 == -1) {
            return new class145(0);
        }
        if (arg0 != 36) {
            method1681((byte) -98, (class192) null, (class265) null);
        }
        int[] var4 = arg1.method1303(0, var3);
        class145 var5 = new class145(var4.length);
        for (int var6 = 0; var6 < var5.field2713; var6++) {
            class135 var7 = new class135(arg1.method1332(true, var4[var6], var3));
            var5.field2702[var6] = var7.method942(false);
            var5.field2704[var6] = var7.method929((byte) -3);
            var5.field2705[var6] = (short) var7.method927(arg0 + 91);
            var5.field2709[var6] = (short) var7.method927(126);
            var5.field2699[var6] = var7.method949(3933);
        }
        return var5;
    }
}
