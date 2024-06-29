import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public abstract class class176 implements class450 {

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "Lvd;")
    public class39 field2716;

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "Lau;")
    public class739 field2722;

    @OriginalMember(owner = "client!aba", name = "i", descriptor = "Lvd;")
    private class39 field2724;

    @OriginalMember(owner = "client!aba", name = "n", descriptor = "Lmr;")
    public static class144 field2729 = null;

    @OriginalMember(owner = "client!aba", name = "r", descriptor = "Lqe;")
    public static class469 field2733 = new class469(88, 6);

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!aba", name = "j", descriptor = "I")
    private int field2725;

    @OriginalMember(owner = "client!aba", name = "l", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!aba", name = "m", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!aba", name = "p", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!aba", name = "q", descriptor = "J")
    private long field2732;

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "Lvn;")
    public static class313 field2719;

    @OriginalMember(owner = "client!aba", name = "k", descriptor = "Lnv;")
    public static class419 field2726;

    @OriginalMember(owner = "client!aba", name = "o", descriptor = "Lda;")
    private class61 field2730;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IZ)V", line = 8)
    public final void method1249(int arg0, boolean arg1) {
        field2728++;
        int var3 = this.field2722.field10372.method3778(class291.field4165, this.field2722.field10371, false) + this.field2722.field10369;
        if (arg0 != 7620) {
            return;
        }
        int var4 = this.field2722.field10360.method4065((byte) -125, this.field2722.field10364, class344.field4988) + this.field2722.field10365;
        this.method1254(var3, arg1, (byte) 82, var4);
        this.method1248(var3, 2, var4, arg1);
        String var5 = class311.field4401.method3381(arg0 - 7692);
        if ((class524.method3075(18) - this.field2732) > 10000L) {
            var5 = var5 + " (" + class311.field4401.method3371(-25704).method416((byte) -34) + ")";
        }
        this.field2730.method544(this.field2722.field10371 / 2 + var3, var5, -1, (byte) -54, var4 + (this.field2722.field10364 / 2) + this.field2722.field10359 + 4, this.field2722.field10358);
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)I", line = 34)
    public final int method1250(byte arg0) {
        field2723++;
        if (arg0 != -25) {
            return -7;
        }
        int var2 = class311.field4401.method3369(false);
        int var3 = var2 * 100;
        if (this.field2725 == var2 && var2 != 0) {
            int var4 = class311.field4401.method3382(72);
            if (var2 < var4) {
                long var5 = this.field2732 - class311.field4401.method3374(81);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class524.method3075(18) - this.field2732) * 10000L;
                    if (var7 > var9) {
                        var3 = (int) (var9 * 100L * (long) (var4 - var2) / var7 + (long) (var2 * 100));
                    } else {
                        var3 = var4 * 100;
                    }
                }
            }
        } else {
            this.field2725 = var2;
            this.field2732 = class524.method3075(18);
        }
        return var3;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)Z", line = 84)
    public boolean method1251(int arg0) {
        field2720++;
        boolean var2 = true;
        if (arg0 != -24346) {
            return false;
        }
        if (!this.field2716.method208(this.field2722.field10368, (byte) 70)) {
            var2 = false;
        }
        if (!this.field2724.method208(this.field2722.field10368, (byte) 70)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIIII)V", line = 105)
    public static final void method1252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 112 / ((-arg5 - 49) / 38);
        field2731++;
        if (arg0 == arg3) {
            class80.method648(arg3, true, arg4, arg1, arg2);
        } else if (class497.field7073 <= arg2 - arg3 && arg2 + arg3 <= class391.field5895 && class166.field2622 <= arg4 - arg0 && arg0 + arg4 <= class432.field6446) {
            class199.method1374(arg2, 0, arg4, arg0, arg3, arg1);
        } else {
            class341.method2173(arg4, arg0, arg3, arg2, 33, arg1);
        }
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)V", line = 130)
    public void method1253(int arg0) {
        field2718++;
        class66 var2 = class647.method3764(this.field2722.field10368, this.field2724, 0);
        this.field2730 = class736.field10316.method474(var2, class129.method918(this.field2716, this.field2722.field10368), true);
        if (arg0 != 27444) {
            method1255((byte) 38);
        }
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(B)V", line = 145)
    public static final void method1255(byte arg0) {
        class255.field3662 = null;
        field2717++;
        class457.field6742 = null;
        if (arg0 != -84) {
            field2729 = null;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(B[B)Ljava/lang/String;", line = 158)
    public static final String method1256(byte arg0, byte[] arg1) {
        if (arg0 >= -64) {
            field2733 = null;
        }
        field2721++;
        return class46.method332(arg1.length, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "(B)V", line = 169)
    public static void method1257(byte arg0) {
        if (arg0 != -110) {
            field2726 = null;
        }
        field2733 = null;
        field2719 = null;
        field2726 = null;
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Lvd;Lvd;Lau;)V", line = 187)
    public class176(class39 arg0, class39 arg1, class739 arg2) {
        this.field2716 = arg0;
        this.field2722 = arg2;
        this.field2724 = arg1;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIZIIII)V", line = 198)
    public static final void method1258(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg2 ? class63.field916.field10210.method2268(17503) : class63.field916.field10189.method2268(17503)) != 0 && arg6 != 0 && class107.field1497 < 50 && arg4 != -1) {
            class282.field4007[class107.field1497++] = new class247((byte) (arg2 ? 3 : 2), arg4, arg6, arg3, arg5, 0, arg1, null);
        }
        if (arg0 != 50) {
            field2726 = null;
        }
        field2727++;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIZ)V")
    public abstract void method1248(int arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IZBI)V")
    public abstract void method1254(int arg0, boolean arg1, byte arg2, int arg3);
}
