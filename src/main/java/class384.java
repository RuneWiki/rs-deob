import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class384 {

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "Lqj;")
    private class535 field5583 = new class535(64);

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "Lqj;")
    private class535 field5585 = new class535(100);

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "Luq;")
    private class172 field5570;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "[J")
    public static long[] field5584 = new long[32];

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "Luq;")
    public static class172 field5579;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Lth;")
    public static class621 field5573;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5580;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lr;III[Z)Z", line = 4)
    public static final boolean method2380(class195 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class737.field10008 != class645.field8694) {
            int var6 = class648.field8748[arg1].method1895(arg2, arg3, 65);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class295 var8 = class648.field8748[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1895(arg2, arg3, 90);
                    if (arg4 != null) {
                        arg4[var7] = var8.method201(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method202(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)Lbea;", line = 39)
    public final class236 method2381(byte arg0, int arg1) {
        field5574++;
        if (arg0 <= 41) {
            field5579 = null;
        }
        class535 var3 = this.field5585;
        synchronized (this.field5585) {
            class236 var4 = (class236) this.field5585.method3109((byte) 110, (long) arg1);
            if (var4 == null) {
                var4 = new class236(arg1);
                this.field5585.method3108((long) arg1, 16337, var4);
            }
            return var4.method1495((byte) -124) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)Ltga;", line = 64)
    public static final class64 method2382(byte arg0) {
        int var1 = -3 / ((68 - arg0) / 46);
        field5572++;
        return class311.field4406;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 78)
    public static void method2383(int arg0) {
        field5584 = null;
        field5580 = null;
        int var1 = -12 % ((arg0 + 82) / 32);
        field5579 = null;
        field5573 = null;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V", line = 92)
    public final void method2384(int arg0) {
        field5576++;
        class535 var2 = this.field5583;
        synchronized (this.field5583) {
            this.field5583.method3113(-127);
            if (arg0 != -32400) {
                field5580 = null;
            }
        }
        class535 var3 = this.field5585;
        synchronized (this.field5585) {
            this.field5585.method3113(-128);
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)V", line = 108)
    public final void method2385(byte arg0) {
        field5582++;
        if (arg0 != -116) {
            return;
        }
        class535 var2 = this.field5583;
        synchronized (this.field5583) {
            this.field5583.method3103(-11294);
        }
        class535 var3 = this.field5585;
        synchronized (this.field5585) {
            this.field5585.method3103(-11294);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)V", line = 125)
    public final void method2386(int arg0, int arg1) {
        field5581++;
        class535 var3 = this.field5583;
        synchronized (this.field5583) {
            this.field5583.method3101(false, arg1);
        }
        class535 var4 = this.field5585;
        synchronized (this.field5585) {
            if (arg0 > -1) {
                field5580 = null;
            }
            this.field5585.method3101(false, arg1);
        }
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)[Ljb;", line = 144)
    public static final class519[] method2387(int arg0) {
        field5575++;
        if (arg0 != -21565) {
            method2389(64, -53);
        }
        return new class519[] { class494.field6958, class191.field2479, class309.field4387, class617.field8325, class635.field8575, class555.field7650, class545.field7531, class578.field7882, class478.field6721, class618.field8354, class536.field7436, class609.field8236, class572.field7786, class236.field3143, class366.field5277, class204.field2633, class554.field7644, class478.field6705, class433.field6259, class575.field7840, class64.field821, class227.field2934, class243.field3192, class233.field3020, class32.field307, class702.field9297, class83.field1183, class329.field4678, class66.field916, class623.field8408, class709.field9702, class532.field7392, class87.field1230, class164.field2196, class315.field4436, class251.field3674, class358.field5211, class600.field8177, class164.field2197, class222.field2882, class433.field6249, class422.field6060, class213.field2799, class424.field6091, class643.field8654, class220.field2847, class137.field1852, class469.field6633, class443.field6372, class415.field5991, class116.field1569, class617.field8327, class52.field623, class731.field9901, class441.field6351, class563.field7715, class451.field6472, class494.field6952, class137.field1848, class480.field6747, class318.field4522, class189.field2465, class327.field4637, class49.field485, class592.field8089, class275.field3983, class363.field5251, class496.field6973, class123.field1703, class760.field10446, class239.field3173, class728.field9880, class75.field1016, class173.field2294, class116.field1565, class164.field2187, class551.field7601, class687.field9195, class386.field5612, class176.field2324, class610.field8246, class168.field2214, class651.field8772, class672.field9012, class544.field7528, class42.field452, class625.field8469, class368.field5314, class382.field5557, class535.field7405, class605.field8199, class43.field460, class791.field10854, class618.field8356, class24.field239, class181.field2374, class711.field9719, class623.field8410, class213.field2791, class732.field9903, class122.field1689, class366.field5269, class561.field7685, class459.field6547, class582.field7910, class246.field3211, class548.field7568, class271.field3949, class306.field4356, class173.field2289, class597.field8130, class734.field9955, class282.field4076, class575.field7835, class323.field4587, class302.field4237, class154.field2088, class453.field6499, class202.field2627, class357.field5203, class504.field7089, class105.field1494, class2.field13, class497.field6987, class69.field953, class12.field140, class316.field4454, class502.field7052, class734.field9950, class465.field6591, class128.field1763, class257.field3831, class776.field10669 };
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)Lmu;", line = 159)
    public final class317 method2388(int arg0, int arg1) {
        field5571++;
        class535 var3 = this.field5583;
        class317 var4;
        synchronized (this.field5583) {
            var4 = (class317) this.field5583.method3109((byte) 124, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class172 var5 = this.field5570;
        byte[] var6;
        synchronized (this.field5570) {
            var6 = this.field5570.method1188(class385.method2391(arg0, (byte) -55), -18047, class416.method2508(arg0, 45));
        }
        class317 var7 = new class317();
        var7.field4472 = this;
        var7.field4476 = arg0;
        if (var6 != null) {
            var7.method2027(new class254(var6), -1);
        }
        var7.method2026(arg1 ^ arg1);
        class535 var8 = this.field5583;
        synchronized (this.field5583) {
            this.field5583.method3108((long) arg0, 16337, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(II)V", line = 192)
    public static final void method2389(int arg0, int arg1) {
        if (arg0 != 0) {
            return;
        }
        field5577++;
        class116 var2 = (class116) class138.field1861.method1248(89, (long) arg1);
        if (var2 != null) {
            var2.field1570.method2591(false);
            class31.method175(var2.field1563, var2.field1566, -103);
            var2.method1102((byte) 74);
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lkw;ILuq;Luq;Luq;)V", line = 227)
    public class384(class263 arg0, int arg1, class172 arg2, class172 arg3, class172 arg4) {
        this.field5570 = arg2;
        if (this.field5570 != null) {
            int var6 = this.field5570.method1193(true) - 1;
            this.field5570.method1175(var6, (byte) 99);
        }
        class105.method801(arg4, 2, arg3, -123);
    }
}
