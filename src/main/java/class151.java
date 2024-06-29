import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public abstract class class151 {

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public int field2627;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public int field2638;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public int field2637;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Lqe;")
    private static class168 field2631 = class66.method448("skill)2", -126);

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "[B")
    public static byte[] field2632 = new byte[520];

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field2630 = 0;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Lqe;")
    public static class168 field2628 = field2631;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "Lqe;")
    private static class168 field2641 = class66.method448("Starting 3d library", -108);

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "[Lqe;")
    public static class168[] field2640 = new class168[500];

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "Lqe;")
    public static class168 field2639 = field2641;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILoe;B)Luj;")
    public static final class158 method1002(int arg0, class256 arg1, byte arg2) {
        field2635++;
        if (class105.method697(false, arg0, arg1)) {
            int var3 = -18 % ((33 - arg2) / 62);
            return class189.method1221((byte) -123);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([Lmj;II)V")
    public static final void method1003(class129[] arg0, int arg1, int arg2) {
        for (int var3 = arg2; var3 < arg0.length; var3++) {
            class129 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field2230 == 0) {
                    if (var4.field2263 != null) {
                        method1003(var4.field2263, arg1, 0);
                    }
                    class114 var5 = (class114) class176.field3079.method1527((long) var4.field2222, (byte) -92);
                    if (var5 != null) {
                        class87.method575((byte) -23, var5.field1853, arg1);
                    }
                }
                if (arg1 == 0 && var4.field2250 != null) {
                    class147 var6 = new class147();
                    var6.field2566 = var4.field2250;
                    var6.field2552 = var4;
                    class82.method545(var6, (byte) 106);
                }
                if (arg1 == 1 && var4.field2170 != null) {
                    if (var4.field2123 >= 0) {
                        class129 var7 = class257.method1713(var4.field2222, 127);
                        if (var7 == null || var7.field2263 == null || var7.field2263.length <= var4.field2123 || var7.field2263[var4.field2123] != var4) {
                            continue;
                        }
                    }
                    class147 var8 = new class147();
                    var8.field2566 = var4.field2170;
                    var8.field2552 = var4;
                    class82.method545(var8, (byte) 106);
                }
            }
        }
        field2634++;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method1004(int arg0) {
        field2639 = null;
        field2641 = null;
        field2628 = null;
        if (arg0 == -1) {
            field2631 = null;
            field2632 = null;
            field2640 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
    public abstract void method424(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IBI)V")
    public abstract void method426(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Lp;")
    public static final class242 method1005(int arg0, int arg1) {
        field2633++;
        class242 var2 = (class242) class114.field1858.method1499(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class91.field1428.method1712(class209.method1353(1557, arg1), class191.method1237(arg1, 94), -1);
        class242 var4 = new class242();
        var4.field4183 = arg1;
        if (var3 != null) {
            var4.method1583(new class112(var3), (byte) -128);
        }
        if (arg0 != 520) {
            return null;
        }
        var4.method1588((byte) 24);
        if (var4.field4165 != -1) {
            var4.method1586(method1005(520, var4.field4140), method1005(520, var4.field4165), arg0 - 398);
        }
        if (var4.field4184 != -1) {
            var4.method1594(method1005(520, var4.field4210), 0, method1005(arg0, var4.field4184));
        }
        if (!class175.field3068 && var4.field4204) {
            var4.field4152 = 0;
            var4.field4167 = class187.field3288;
            var4.field4164 = false;
            var4.field4196 = null;
            var4.field4158 = null;
        }
        class114.field1858.method1502((byte) -18, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZBLjava/lang/Object;)[B")
    public static final byte[] method1006(boolean arg0, byte arg1, Object arg2) {
        field2636++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class26.method175(false, var3) : var3;
        } else if (arg2 instanceof class84) {
            class84 var4 = (class84) arg2;
            return var4.method554(-21444);
        } else {
            if (arg1 > -123) {
                method1002(-127, null, (byte) -23);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(IBI)V")
    public abstract void method422(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(III)V")
    public class151(int arg0, int arg1, int arg2) {
        this.field2627 = arg1;
        this.field2638 = arg2;
        this.field2637 = arg0;
    }
}
