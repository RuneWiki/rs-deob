import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class241 extends RuntimeException {

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Ljava/lang/String;")
    public String field4421;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4419;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Ldc;")
    public static class37 field4420 = class185.method1233((byte) 86, ")3");

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Ldc;")
    public static class37 field4416 = class185.method1233((byte) 86, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "[[S")
    public static short[][] field4422 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lwa;BI)[Ljc;")
    public static final class100[] method1575(class238 arg0, byte arg1, int arg2) {
        field4418++;
        if (arg1 != -102) {
            method1578(null, false);
        }
        return class128.method906(arg0, arg2, 3) ? class79.method543(arg1 - 15935) : null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)I")
    public static final int method1576(byte arg0, int arg1) {
        field4415++;
        if (arg0 >= -18) {
            return 94;
        }
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIBII)V")
    public static final void method1577(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4414++;
        int var5 = 0;
        if (arg2 >= -95) {
            return;
        }
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = -1;
        int var9 = class196.method1308(49, class29.field536, arg0 + arg3, class82.field1458);
        int var10 = class196.method1308(81, class29.field536, arg0 - arg3, class82.field1458);
        class29.method242(var9, (byte) -30, arg1, class11.field156[arg4], var10);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg4 - var6;
                int var12 = arg4 + var6;
                if (var12 >= class198.field3697 && var11 <= class199.field3712) {
                    int var13 = class196.method1308(66, class29.field536, arg0 + var5, class82.field1458);
                    int var14 = class196.method1308(115, class29.field536, arg0 - var5, class82.field1458);
                    if (var12 <= class199.field3712) {
                        class29.method242(var13, (byte) -30, arg1, class11.field156[var12], var14);
                    }
                    if (var11 >= class198.field3697) {
                        class29.method242(var13, (byte) -30, arg1, class11.field156[var11], var14);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (var16 >= class198.field3697 && class199.field3712 >= var15) {
                int var17 = class196.method1308(65, class29.field536, arg0 + var6, class82.field1458);
                int var18 = class196.method1308(78, class29.field536, arg0 - var6, class82.field1458);
                if (var16 <= class199.field3712) {
                    class29.method242(var17, (byte) -30, arg1, class11.field156[var16], var18);
                }
                if (var15 >= class198.field3697) {
                    class29.method242(var17, (byte) -30, arg1, class11.field156[var15], var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lce;Z)Lkb;")
    public static final class110 method1578(class28 arg0, boolean arg1) {
        field4413++;
        return arg1 ? new class110(arg0.method228(true), arg0.method228(true), arg0.method228(arg1), arg0.method228(true), arg0.method225(114), arg0.method225(80), arg0.method215(-1797813752)) : null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1579(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < class157.field2981; var5++) {
            if (arg2 < class61.field1121[var5] + class58.field1089[var5] && class61.field1121[var5] < arg1 + arg2 && arg3 < class64.field1167[var5] + class120.field2139[var5] && arg0 + arg3 > class64.field1167[var5]) {
                class211.field3948[var5] = true;
            }
        }
        if (!arg4) {
            field4420 = null;
        }
        field4423++;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class241(Throwable arg0, String arg1) {
        this.field4421 = arg1;
        this.field4419 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static void method1580(int arg0) {
        field4416 = null;
        if (arg0 == 8404) {
            field4420 = null;
            field4422 = null;
        }
    }
}
