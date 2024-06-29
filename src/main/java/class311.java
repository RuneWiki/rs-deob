import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class311 {

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "Ldk;")
    public static class326 field4393 = new class326("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4396 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "Lef;")
    public static class311 field4398 = new class311(2, 6);

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "[I")
    public static int[] field4400 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "[I")
    public static int[] field4401;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "[Ltr;")
    public static class176[] field4397;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "[[[I")
    public static int[][][] field4395;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "[[[Lct;")
    public static class88[][][] field4394;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public static void method1923(byte arg0) {
        field4396 = null;
        field4401 = null;
        field4400 = null;
        field4394 = null;
        field4395 = null;
        if (arg0 == 64) {
            field4393 = null;
            field4398 = null;
            field4397 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILdt;ZI)V")
    public static final void method1924(int arg0, class145 arg1, boolean arg2, int arg3) {
        field4390++;
        if (!class36.field473) {
            for (int var4 = 9; var4 >= 5; var4--) {
                String var8 = class337.method2127(var4, 0, arg1);
                if (var8 != null) {
                    class265.method1633(1004, arg1.field2016, arg1.field1951, arg1.field1933, (long) (var4 + 1), arg1.field1928, true, 500, var8, false, class449.method2618(var4, (byte) -15, arg1));
                    class208.field3175++;
                }
            }
            String var5 = class138.method868(41, arg1);
            if (var5 != null) {
                class265.method1633(8, arg1.field2016, arg1.field1951, arg1.field1933, 0L, arg1.field1928, true, 500, var5, false, arg1.field1926);
                class190.field2815++;
            }
            for (int var6 = 4; var6 >= 0; var6--) {
                String var7 = class337.method2127(var6, 0, arg1);
                if (var7 != null) {
                    class208.field3175++;
                    class265.method1633(11, arg1.field2016, arg1.field1951, arg1.field1933, (long) (var6 + 1), arg1.field1928, true, 500, var7, false, class449.method2618(var6, (byte) -15, arg1));
                }
            }
            if (client.method1122(arg1).method2322(false)) {
                class488.field6879++;
                if (arg1.field2066 == null) {
                    class265.method1633(2, arg1.field2016, arg1.field1951, arg1.field1933, 0L, "", true, 500, class486.field6844.method2065(119, class326.field4711), false, -1);
                } else {
                    class265.method1633(2, arg1.field2016, arg1.field1951, arg1.field1933, 0L, "", true, 500, arg1.field2066, false, -1);
                }
            }
        } else if (client.method1122(arg1).method2316((byte) -93) && (class328.field4745 & 0x20) != 0) {
            class273.field3973++;
            class265.method1633(12, arg1.field2016, arg1.field1951, arg1.field1933, 0L, class373.field5386 + " -> " + arg1.field1928, true, 500, class489.field6894, false, class22.field282);
        }
        if (arg2) {
            field4398 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4391++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(II)V")
    public class311(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([Ljava/lang/Object;[II)V")
    public static final void method1925(Object[] arg0, int[] arg1, int arg2) {
        if (arg2 != 15554) {
            field4400 = null;
        }
        field4392++;
        class104.method586(0, arg1.length - 1, 128, arg0, arg1);
    }
}
