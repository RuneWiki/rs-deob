import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class152 extends class242 {

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field2624 = 1;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field2621 = 0;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "[I")
    public static int[] field2629 = new int[] { 0, 0, 0, 3, 0, -1, 0, 0, 6, 2, 5, 0, 0, 0, 0, 0, 0, 0, -2, 2, 3, -2, 0, 15, 0, 0, 0, 0, 0, 6, -2, 0, 0, 0, -1, 10, 7, 0, 0, 0, 6, -2, 0, -1, 0, 0, 0, 0, 0, 3, 0, 0, 1, 0, 0, 3, 24, 0, 8, -1, 0, 0, 0, 0, 6, 0, 1, 0, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12, -1, 6, 4, 0, 0, 0, 1, 0, 0, 0, 0, -1, 10, -1, 0, 0, 15, -1, -2, 0, 7, 0, 2, 0, 0, 0, 0, 5, -1, 6, 0, 0, 4, 14, 0, 0, 0, 0, 9, 0, 0, 7, 0, -1, 2, 0, 5, 8, 0, 0, 6, 0, -1, 0, 3, 0, 0, 5, 0, 1, 8, 0, 0, 0, 10, 0, 0, 0, -1, 0, 0, 0, -2, 6, 0, 8, 10, 0, -1, 2, 0, 0, 0, 5, 0, 4, -2, 8, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 20, 5, 1, 0, 6, 0, -2, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -2, 8, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, -1, -2, 0, 14, 0, 0, 0, 0, 0, 0, 0, -2, 0, 12, 0, 0, 6, 0, 0, 0, 0, 0, 2, 4, -2, 0, 0, 0 };

    @OriginalMember(owner = "client!di", name = "p", descriptor = "Ljf;")
    public static class229 field2622 = class212.method1457((byte) 104, "Moteur son pr-Bpar-B");

    @OriginalMember(owner = "client!di", name = "u", descriptor = "Ljf;")
    public static class229 field2627 = class212.method1457((byte) 68, "null");

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    public int field2623;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    public int field2626;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "I")
    public int field2632;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "Ljava/lang/String;")
    public static String field2631;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "[Lkb;")
    public static class35[] field2625;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(B)V", line = 10)
    public static void method1029(byte arg0) {
        field2627 = null;
        if (arg0 <= -62) {
            field2629 = null;
            field2625 = null;
            field2622 = null;
            field2631 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILkh;I)Ljf;", line = 45)
    public static final class229 method1030(int arg0, class14 arg1, int arg2) {
        field2630++;
        try {
            if (arg2 != -28276) {
                method1029((byte) -23);
            }
            class229 var3 = new class229();
            var3.field3973 = arg1.method104(-52);
            if (var3.field3973 > arg0) {
                var3.field3973 = arg0;
            }
            var3.field3944 = new byte[var3.field3973];
            arg1.field195 += class180.field3126.method2051((byte) -82, var3.field3973, arg1.field195, 0, var3.field3944, arg1.field174);
            return var3;
        } catch (Exception var5) {
            return class282.field4849;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIZI)V", line = 82)
    public static final void method1031(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2628++;
        if (arg3) {
            method1031(-121, -15, 78, true, -96);
        }
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = class129.method909(class149.field2578, 0, arg4 + arg0, class327.field5490);
        int var9 = -1;
        int var10 = class129.method909(class149.field2578, 0, arg4 - arg0, class327.field5490);
        class34.method306(var10, class173.field3021[arg2], (byte) 120, var8, arg1);
        while (var5 < var6) {
            var9 += 2;
            var7 += var9;
            if (var7 > 0) {
                var6--;
                int var11 = arg2 + var6;
                int var12 = arg2 - var6;
                var7 -= var6 << 1;
                if (class56.field991 <= var11 && class142.field2458 >= var12) {
                    int var13 = class129.method909(class149.field2578, 0, arg4 + var5, class327.field5490);
                    int var14 = class129.method909(class149.field2578, 0, arg4 - var5, class327.field5490);
                    if (class142.field2458 >= var11) {
                        class34.method306(var14, class173.field3021[var11], (byte) 124, var13, arg1);
                    }
                    if (class56.field991 <= var12) {
                        class34.method306(var14, class173.field3021[var12], (byte) 111, var13, arg1);
                    }
                }
            }
            var5++;
            int var15 = arg2 + var5;
            int var16 = arg2 - var5;
            if (var15 >= class56.field991 && class142.field2458 >= var16) {
                int var17 = class129.method909(class149.field2578, 0, arg4 + var6, class327.field5490);
                int var18 = class129.method909(class149.field2578, 0, arg4 - var6, class327.field5490);
                if (var15 <= class142.field2458) {
                    class34.method306(var18, class173.field3021[var15], (byte) 118, var17, arg1);
                }
                if (class56.field991 <= var16) {
                    class34.method306(var18, class173.field3021[var16], (byte) 121, var17, arg1);
                }
            }
        }
    }
}
