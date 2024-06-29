import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class265 {

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "Z")
    public static boolean field3408 = false;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "Lcq;")
    public static class72 field3410 = new class72("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
    public static int field3417 = 0;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "[I")
    public static int[] field3420;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "Z")
    public static boolean field3419;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
    public int field3407;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
    public int field3409;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
    public int field3411;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
    public int field3412;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
    public int field3413;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
    public int field3415;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "Lik;")
    public static class451 field3418;

    static {
        new class72((String) null, "geschickt werden.", (String) null, (String) null);
        field3420 = new int[] { 1, -1, -1, 1 };
        field3419 = false;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1662(int arg0) {
        class143.field1680.method2290(13831);
        field3416++;
        if (arg0 != 2) {
            method1663(false);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)V", line = 19)
    public static final void method1663(boolean arg0) {
        if (arg0) {
            field3408 = false;
        }
        field3414++;
        class215.field2658.method2167(-73);
        int var1 = class215.field2658.method2171(8, 74);
        if (class106.field1263 > var1) {
            for (int var2 = var1; var2 < class106.field1263; var2++) {
                class374.field5062[class238.field3146++] = class437.field5984[var2];
            }
        }
        if (var1 > class106.field1263) {
            throw new RuntimeException("gnpov1");
        }
        class106.field1263 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class437.field5984[var3];
            class298 var5 = class220.field2726[var4];
            int var6 = class215.field2658.method2171(1, 117);
            if (var6 == 0) {
                class437.field5984[class106.field1263++] = var4;
                var5.field2427 = class106.field1273;
            } else {
                int var7 = class215.field2658.method2171(2, 80);
                if (var7 == 0) {
                    class437.field5984[class106.field1263++] = var4;
                    var5.field2427 = class106.field1273;
                    class332.field4530[class341.field4651++] = var4;
                } else if (var7 == 1) {
                    class437.field5984[class106.field1263++] = var4;
                    var5.field2427 = class106.field1273;
                    int var8 = class215.field2658.method2171(3, 102);
                    var5.method1887(var8, 1, -3);
                    int var9 = class215.field2658.method2171(1, 75);
                    if (var9 == 1) {
                        class332.field4530[class341.field4651++] = var4;
                    }
                } else if (var7 == 2) {
                    class437.field5984[class106.field1263++] = var4;
                    var5.field2427 = class106.field1273;
                    if (class215.field2658.method2171(1, 77) == 1) {
                        int var10 = class215.field2658.method2171(3, 118);
                        var5.method1887(var10, 2, -3);
                        int var11 = class215.field2658.method2171(3, 77);
                        var5.method1887(var11, 2, -3);
                    } else {
                        int var12 = class215.field2658.method2171(3, 78);
                        var5.method1887(var12, 0, -3);
                    }
                    int var13 = class215.field2658.method2171(1, 109);
                    if (var13 == 1) {
                        class332.field4530[class341.field4651++] = var4;
                    }
                } else if (var7 == 3) {
                    class374.field5062[class238.field3146++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V", line = 133)
    public static void method1664(int arg0) {
        field3418 = null;
        if (arg0 == 18570) {
            field3420 = null;
            field3410 = null;
        }
    }
}
