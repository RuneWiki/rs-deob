import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public abstract class class581 implements class90 {

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "Lpu;")
    private class522 field8184;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "Lpu;")
    public class522 field8186;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "Ltfa;")
    public class31 field8179;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
    public static int field8187 = 0;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "Lnea;")
    public static class664 field8182 = new class664(43, -1);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field8177;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public static int field8178;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public static int field8180;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
    private int field8181;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
    public static int field8183;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
    public static int field8189;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "J")
    private long field8188;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "Lla;")
    private class416 field8185;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)I")
    public final int method3312(int arg0) {
        field8178++;
        int var2 = class27.field400.method3386(false);
        int var3 = var2 * 100;
        if (arg0 != 43) {
            this.method3312(-2);
        }
        if (this.field8181 == var2 && var2 != 0) {
            int var4 = class27.field400.method3374(0);
            if (var2 < var4) {
                long var5 = this.field8188 - class27.field400.method3378(74);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class490.method2840(true) - this.field8188) * 10000L;
                    if (var9 < var7) {
                        var3 = (int) ((long) (var4 - var2) * var9 * 100L / var7 + (long) (var2 * 100));
                    } else {
                        var3 = var4 * 100;
                    }
                }
            }
        } else {
            this.field8181 = var2;
            this.field8188 = class490.method2840(true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILpca;Lpca;)V")
    public static final void method3313(int arg0, class665 arg1, class665 arg2) {
        if (arg1.field9384 != null) {
            arg1.method3678(~arg0);
        }
        field8189++;
        arg1.field9384 = arg2.field9384;
        if (arg0 != 0) {
            field8182 = null;
        }
        arg1.field9382 = arg2;
        arg1.field9384.field9382 = arg1;
        arg1.field9382.field9384 = arg1;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BZ)V")
    public final void method421(byte arg0, boolean arg1) {
        field8177++;
        int var3 = this.field8179.field485.method860(class245.field3815, this.field8179.field487, (byte) 17) + this.field8179.field489;
        int var4 = this.field8179.field479.method3509(class544.field7651, (byte) -120, this.field8179.field480) + this.field8179.field481;
        this.method1675(0, var3, var4, arg1);
        this.method1673(var4, arg1, var3, 110);
        int var5 = 2 % ((7 - arg0) / 56);
        String var6 = class27.field400.method3387(0);
        if ((class490.method2840(true) - this.field8188) > 10000L) {
            var6 = var6 + " (" + class27.field400.method3379(95).method1585(94) + ")";
        }
        this.field8185.method2494(-1, this.field8179.field477, var3 + (this.field8179.field487 / 2), var6, -102, this.field8179.field480 / 2 + var4 + this.field8179.field482 + 4);
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V")
    public static void method3314(int arg0) {
        if (arg0 == 0) {
            field8182 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
    public void method420(byte arg0) {
        field8180++;
        if (arg0 != 67) {
            field8187 = 39;
        }
        class146 var2 = class412.method2482(86, this.field8184, this.field8179.field484);
        this.field8185 = class282.field4228.method128(var2, class113.method880(this.field8186, this.field8179.field484), true);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IZII)V")
    public abstract void method1673(int arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIZ)V")
    public abstract void method1675(int arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)Z")
    public boolean method419(byte arg0) {
        field8183++;
        boolean var2 = true;
        if (!this.field8186.method2997((byte) -95, this.field8179.field484)) {
            var2 = false;
        }
        if (arg0 < 56) {
            this.method3312(-99);
        }
        if (!this.field8184.method2997((byte) -95, this.field8179.field484)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lpu;Lpu;Ltfa;)V")
    public class581(class522 arg0, class522 arg1, class31 arg2) {
        this.field8184 = arg1;
        this.field8186 = arg0;
        this.field8179 = arg2;
    }
}
