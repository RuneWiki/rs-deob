import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class185 extends class171 {

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    public int field3090 = 0;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public int field3077 = -1;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "Lok;")
    public static class146 field3076 = class235.method1724(-12908, " autres options");

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "Lok;")
    public static class146 field3079 = class235.method1724(-12908, "::wm1");

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "Lok;")
    public static class146 field3083 = class235.method1724(-12908, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "Lok;")
    public static class146 field3092 = class235.method1724(-12908, "Shift)2click disabled)3");

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field3093 = 0;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "Z")
    public static boolean field3094 = false;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "Lok;")
    public static class146 field3097 = class235.method1724(-12908, "zap");

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public int field3075;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public int field3078;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public int field3080;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    public int field3085;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public int field3087;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public int field3088;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public int field3089;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public int field3091;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    public int field3095;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public int field3096;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "Lr;")
    public static class264 field3081;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V", line = 5)
    public static void method1449(int arg0) {
        field3079 = null;
        if (arg0 != 0) {
            return;
        }
        field3083 = null;
        field3097 = null;
        field3076 = null;
        field3092 = null;
        field3081 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILok;)V", line = 57)
    public static final void method1450(int arg0, class146 arg1) {
        if (arg0 != 3) {
            method1451(-26, (byte) 49, 31, 3, 67);
        }
        field3084++;
        int var2 = class140.method1029(arg1, 102);
        if (var2 != -1) {
            class296.method2104(class135.field2255.field4793[var2], class135.field2255.field4792[var2], true);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBIII)V", line = 85)
    public static final void method1451(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3086++;
        for (class206 var5 = (class206) class9.field202.method1251(76); var5 != null; var5 = (class206) class9.field202.method1253(64)) {
            class66.method499(arg0, arg3, var5, arg4, true, arg2);
        }
        if (arg1 >= -82) {
            method1452(-32, -106, -43, -92);
        }
        for (class206 var6 = (class206) class232.field3870.method1251(108); var6 != null; var6 = (class206) class232.field3870.method1253(35)) {
            byte var7 = 1;
            if (var6.field3438.field5429 == var6.field3438.field5398) {
                var7 = 0;
            } else if (var6.field3438.field5439 == var6.field3438.field5429) {
                var7 = 2;
            }
            if (var6.field3436 != var7) {
                int var8 = class234.method1714(var6.field3438, (byte) 63);
                if (var6.field3434 != var8) {
                    if (var6.field3437 != null) {
                        class82.field1315.method1331(var6.field3437);
                        var6.field3437 = null;
                    }
                    var6.field3434 = var8;
                }
                var6.field3436 = var7;
            }
            var6.field3426 = var6.field3438.field5409;
            var6.field3443 = var6.field3438.field5409 + (var6.field3438.method1717(0) * 64);
            var6.field3420 = var6.field3438.field5380;
            var6.field3425 = var6.field3438.field5380 + var6.field3438.method1717(0) * 64;
            class66.method499(arg0, arg3, var6, arg4, true, arg2);
        }
        for (class206 var9 = (class206) class199.field3324.method807(-115); var9 != null; var9 = (class206) class199.field3324.method806(90)) {
            byte var10 = 1;
            if (var9.field3430.field5429 == var9.field3430.field5398) {
                var10 = 0;
            } else if (var9.field3430.field5439 == var9.field3430.field5429) {
                var10 = 2;
            }
            if (var9.field3436 != var10) {
                int var11 = class267.method1940(0, var9.field3430);
                if (var9.field3434 != var11) {
                    if (var9.field3437 != null) {
                        class82.field1315.method1331(var9.field3437);
                        var9.field3437 = null;
                    }
                    var9.field3434 = var11;
                }
                var9.field3436 = var10;
            }
            var9.field3426 = var9.field3430.field5409;
            var9.field3443 = var9.field3430.field5409 + var9.field3430.method1717(0) * 64;
            var9.field3420 = var9.field3430.field5380;
            var9.field3425 = var9.field3430.field5380 + var9.field3430.method1717(0) * 64;
            class66.method499(arg0, arg3, var9, arg4, true, arg2);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)I", line = 191)
    public static final int method1452(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field3082++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else {
            if (arg2 != 14411) {
                method1452(87, 24, 14, 40);
            }
            return var4 == 2 ? 7 - arg3 : arg1;
        }
    }
}
