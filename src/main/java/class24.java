import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class24 {

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "Lsw;")
    private class641 field159 = new class641(64);

    @OriginalMember(owner = "client!fba", name = "r", descriptor = "Lsw;")
    public class641 field173 = new class641(50);

    @OriginalMember(owner = "client!fba", name = "s", descriptor = "Lsw;")
    public class641 field174 = new class641(5);

    @OriginalMember(owner = "client!fba", name = "m", descriptor = "Lre;")
    public class515 field168;

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "Z")
    public boolean field158;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "Ldn;")
    public class438 field156;

    @OriginalMember(owner = "client!fba", name = "p", descriptor = "Ldn;")
    private class438 field171;

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "I")
    public static int field163 = 0;

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "F")
    public static float field162;

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!fba", name = "l", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!fba", name = "n", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!fba", name = "o", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!fba", name = "t", descriptor = "I")
    public int field175;

    @OriginalMember(owner = "client!fba", name = "q", descriptor = "Ljava/lang/Object;")
    public static Object field172;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lqa;Z)V")
    public static final void method142(class206 arg0, boolean arg1) {
        arg0.method1107(0, 0, class185.field2239, 350);
        field167++;
        arg0.method1133(0, 0, class185.field2239, 350, class328.field4281 << 24 | 0x332277, 1);
        int var2 = 350 / class614.field8895;
        if (class208.field2500 > 0) {
            int var3 = 346 - class614.field8895 - 4;
            int var4 = var2 * var3 / (class208.field2500 + var2 - 1);
            int var5 = 4;
            if (class208.field2500 > 1) {
                var5 += (var3 - var4) * (class208.field2500 - class54.field458 - 1) / (class208.field2500 - 1);
            }
            arg0.method1133(class185.field2239 - 16, var5, 12, var4, class328.field4281 << 24 | 0x332277, 2);
            for (int var6 = class54.field458; class54.field458 + var2 > var6 && var6 < class208.field2500; var6++) {
                String[] var7 = class220.method1267(class330.field4302[var6], '\b', (byte) 109);
                int var8 = (class185.field2239 - 24) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = (var8 * var9) + 8;
                    arg0.method1107(var10, 0, var8 + var10 - 8, 350);
                    class137.field1673.method540(-1, 350 - ((var6 - class54.field458) * class614.field8895) - class92.field1129.field2624 - class63.field628 - 2, var7[var9], var10, -16777216, false);
                }
            }
        }
        arg0.method1107(0, 0, class185.field2239, 350);
        arg0.method1115(class185.field2239, -1, 350 - class63.field628, 0, true);
        class459.field6320.method540(-1, 350 - class410.field5340.field2624 - 1, "--> " + class279.field3671, 10, -16777216, arg1);
        if (!class55.field481) {
            return;
        }
        int var11 = -1;
        if ((class335.field4358 % 30) > 15) {
            var11 = 16777215;
        }
        arg0.method1195(1, class410.field5340.method1241("--> " + class279.field3671.substring(0, class348.field4479), (byte) 0) + 10, 12, var11, 350 - class410.field5340.field2624 - 11);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IZ)V")
    public final void method143(int arg0, boolean arg1) {
        field164++;
        this.field175 = arg0;
        class641 var3 = this.field173;
        synchronized (this.field173) {
            this.field173.method3687(1402);
        }
        class641 var4 = this.field174;
        synchronized (this.field174) {
            this.field174.method3687(1402);
        }
        if (!arg1) {
            this.method143(-4, true);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)V")
    public static final void method144(int arg0, int arg1) {
        field161++;
        class370.method2073(arg0 ^ arg0);
        class469.method2733(-9153);
        class499.method2883(true, false, arg1);
        class219.method1263(class39.field299, class593.field8621, class210.field2560, -21120);
        class347.method1936(class210.field2560, class39.field299, (byte) -108);
        class292.method1635(true);
        class350.method1950(class547.field8049, 10);
        class562.method3279((byte) -125);
        class529.method3013(arg0 + 6);
        if (class137.field1671 == 2) {
            class35.method200(3, 2);
        } else if (class137.field1671 == 6) {
            class35.method200(7, 2);
        } else if (class137.field1671 == 9) {
            class35.method200(10, 2);
        } else if (class137.field1671 == 1) {
            class152.method840(class210.field2560, class39.field299, 0);
            return;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lqa;Loe;III)V")
    public static final void method145(class206 arg0, class170 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class238.field2985) {
            class349 var5 = class383.field5070[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field4506 != null && var5.field4506.method317(64)) {
                arg1.method312(true, var5.field4506, 0, arg0, 0, 13915, class79.field929);
            }
        }
        if (arg4 < class238.field2985) {
            class349 var6 = class383.field5070[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field4506 != null && var6.field4506.method317(64)) {
                arg1.method312(true, var6.field4506, class79.field929, arg0, 0, 13915, 0);
            }
        }
        if (arg3 < class238.field2985 && arg4 < class548.field8061) {
            class349 var7 = class383.field5070[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field4506 != null && var7.field4506.method317(64)) {
                arg1.method312(true, var7.field4506, class79.field929, arg0, 0, 13915, class79.field929);
            }
        }
        if (arg3 < class238.field2985 && arg4 > 0) {
            class349 var8 = class383.field5070[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field4506 != null && var8.field4506.method317(64)) {
                arg1.method312(true, var8.field4506, -class79.field929, arg0, 0, 13915, class79.field929);
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z)V")
    public final void method146(boolean arg0) {
        class641 var2 = this.field159;
        synchronized (this.field159) {
            this.field159.method3694(0);
        }
        field170++;
        class641 var3 = this.field173;
        synchronized (this.field173) {
            this.field173.method3694(0);
        }
        class641 var4 = this.field174;
        synchronized (this.field174) {
            if (!arg0) {
                field163 = -47;
            }
            this.field174.method3694(0);
        }
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(II)V")
    public final void method147(int arg0, int arg1) {
        class641 var3 = this.field159;
        synchronized (this.field159) {
            this.field159.method3686((byte) 53, arg1);
            if (arg0 != 350) {
                field172 = null;
            }
        }
        field169++;
        class641 var4 = this.field173;
        synchronized (this.field173) {
            this.field173.method3686((byte) 53, arg1);
        }
        class641 var5 = this.field174;
        synchronized (this.field174) {
            this.field174.method3686((byte) 53, arg1);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V")
    public final void method148(int arg0) {
        class641 var2 = this.field159;
        synchronized (this.field159) {
            if (arg0 != 5) {
                method145(null, null, 47, 88, 27);
            }
            this.field159.method3687(1402);
        }
        field165++;
        class641 var3 = this.field173;
        synchronized (this.field173) {
            this.field173.method3687(1402);
        }
        class641 var4 = this.field174;
        synchronized (this.field174) {
            this.field174.method3687(1402);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(BZ)V")
    public final void method149(byte arg0, boolean arg1) {
        if (arg0 >= -111) {
            field172 = null;
        }
        field166++;
        if (this.field158 != arg1) {
            this.field158 = arg1;
            this.method148(5);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZI)Ltn;")
    public final class74 method150(boolean arg0, int arg1) {
        field160++;
        class641 var3 = this.field159;
        class74 var4;
        synchronized (this.field159) {
            var4 = (class74) this.field159.method3682(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class438 var5 = this.field171;
        byte[] var6;
        synchronized (this.field171) {
            var6 = this.field171.method2558(100, class550.method3219(125, arg1), class368.method2063(arg1, 104));
        }
        class74 var7 = new class74();
        var7.field837 = this;
        var7.field816 = arg1;
        if (var6 != null) {
            var7.method421(new class374(var6), false);
        }
        var7.method426(arg0);
        class641 var8 = this.field159;
        synchronized (this.field159) {
            this.field159.method3684(var7, 0, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)V")
    public final void method151(int arg0) {
        field157++;
        if (arg0 != -21071) {
            field163 = -31;
        }
        class641 var2 = this.field173;
        synchronized (this.field173) {
            this.field173.method3687(1402);
        }
        class641 var3 = this.field174;
        synchronized (this.field174) {
            this.field174.method3687(1402);
        }
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(I)V")
    public static void method152(int arg0) {
        field172 = null;
        if (arg0 != 350) {
            method144(-8, -22);
        }
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lre;IZLdn;Ldn;)V")
    public class24(class515 arg0, int arg1, boolean arg2, class438 arg3, class438 arg4) {
        this.field168 = arg0;
        this.field158 = arg2;
        this.field156 = arg4;
        this.field171 = arg3;
        if (this.field171 != null) {
            int var6 = this.field171.method2565((byte) 108) - 1;
            this.field171.method2554(var6, 125);
        }
    }
}
