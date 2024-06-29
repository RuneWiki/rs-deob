import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class159 {

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "Llh;")
    public static class487 field2316 = new class487(51, 18);

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Z)V")
    public static final void method1125(boolean arg0) {
        class26.method255(class396.field5579, -20229);
        field2315++;
        class498.field6767++;
        if (class118.field1597 && class198.field2824) {
            int var1 = class214.field2991.method1499(8);
            int var2 = class214.field2991.method1491((byte) 104);
            int var3 = var2 - class220.field3073;
            int var4 = var1 - class413.field5853;
            if (class451.field6206 > var4) {
                var4 = class451.field6206;
            }
            if (class1.field3 > var3) {
                var3 = class1.field3;
            }
            if (class451.field6206 + class501.field6894.field1104 < class396.field5579.field1104 + var4) {
                var4 = class451.field6206 + class501.field6894.field1104 - class396.field5579.field1104;
            }
            if ((class1.field3 + class501.field6894.field1050) < (var3 + class396.field5579.field1050)) {
                var3 = class1.field3 + class501.field6894.field1050 - class396.field5579.field1050;
            }
            if (arg0) {
                field2316 = null;
            }
            int var5 = var4 + class501.field6894.field1158 - class451.field6206;
            int var6 = var3 + class501.field6894.field1170 - class1.field3;
            if (class214.field2991.method1500(0)) {
                if (class396.field5579.field1065 < class498.field6767) {
                    int var7 = var4 - class11.field108;
                    int var8 = var3 - class473.field6504;
                    if (var7 > class396.field5579.field1173 || (-class396.field5579.field1173) > var7 || class396.field5579.field1173 < var8 || var8 < (-class396.field5579.field1173)) {
                        class11.field113 = true;
                    }
                }
                if (class396.field5579.field1153 != null && class11.field113) {
                    class368 var9 = new class368();
                    var9.field4957 = class396.field5579;
                    var9.field4962 = class396.field5579.field1153;
                    var9.field4961 = var5;
                    var9.field4954 = var6;
                    class97.method708(var9);
                    return;
                }
            } else {
                if (class11.field113) {
                    class114.method820((byte) -114);
                    if (class396.field5579.field1056 != null) {
                        class368 var10 = new class368();
                        var10.field4961 = var5;
                        var10.field4952 = class482.field6625;
                        var10.field4962 = class396.field5579.field1056;
                        var10.field4954 = var6;
                        var10.field4957 = class396.field5579;
                        class97.method708(var10);
                    }
                    if (class482.field6625 != null && client.method1678(class396.field5579) != null) {
                        class454.method2580(class396.field5579, class482.field6625, (byte) 34);
                    }
                } else if ((class141.field2008 == 1 || class116.method828(1006094723)) && class137.field1948 > 2) {
                    class389.method2286(class413.field5853 + class11.field108, 117, class473.field6504 + class220.field3073);
                } else if (class541.method3053((byte) 113)) {
                    class389.method2286(class413.field5853 + class11.field108, 126, class473.field6504 + class220.field3073);
                }
                class396.field5579 = null;
            }
        } else if (class498.field6767 > 1) {
            class396.field5579 = null;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)I")
    public static final int method1126(int arg0) {
        if (arg0 < 86) {
            field2316 = null;
        }
        field2312++;
        return 46;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(ZII)I")
    public static final int method1127(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            return 70;
        }
        field2313++;
        double var3 = Math.log((double) arg2) / Math.log(2.0D);
        double var5 = Math.log((double) arg1) / Math.log(2.0D);
        double var7 = var5 + (var3 - var5) * Math.random();
        return (int) (Math.pow(2.0D, var7) + 0.5D);
    }

    @OriginalMember(owner = "client!aba", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2314++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)V")
    public static void method1128(int arg0) {
        field2316 = null;
        if (arg0 < 121) {
            field2316 = null;
        }
    }
}
