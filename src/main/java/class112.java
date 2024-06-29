import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class112 extends class205 {

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "Lvd;")
    public static class222 field2104 = class212.method1357(" )2> <col=00ffff>", 10731);

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "I")
    public static int field2107 = 0;

    @OriginalMember(owner = "client!kd", name = "gb", descriptor = "[J")
    public static long[] field2115 = new long[32];

    @OriginalMember(owner = "client!kd", name = "hb", descriptor = "I")
    public static int field2116 = 0;

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!kd", name = "ib", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!kd", name = "eb", descriptor = "Lab;")
    public static class3 field2113;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
    public static void method724(boolean arg0) {
        if (arg0) {
            method727(7, 119);
        }
        field2115 = null;
        field2104 = null;
        field2113 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field2111;
        if (arg0 != 0) {
            return null;
        } else {
            int[] var3 = super.field3810.method557(6978, arg1);
            if (super.field3810.field1635) {
                int var4 = class218.field4051[arg1];
                for (int var5 = 0; class118.field2245 > var5; ++var5) {
                    var3[var5] = this.method730(789221, var4, class230.field4319[var5]) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 != -1810599263) {
            method726(126, 78, -26, 3, (class65) null, 55);
        }
        ++field2106;
        if (class27.method232(arg7, -7754)) {
            class172.field3233 = null;
            class166.method1073((byte) -46, arg2, -1, arg1, arg5, class220.field4066[arg7], arg3, arg0, arg6, arg8);
            if (class172.field3233 != null) {
                class166.method1073((byte) -47, class36.field787, -1412584499, arg1, arg5, class172.field3233, arg3, arg0, class32.field669, arg8);
                class172.field3233 = null;
            }
        } else if (~arg1 != 0) {
            class93.field1746[arg1] = true;
        } else {
            for (int var9 = 0; ~var9 > -101; ++var9) {
                class93.field1746[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIILfj;I)V")
    public static final void method726(int arg0, int arg1, int arg2, int arg3, class65 arg4, int arg5) {
        ++field2117;
        class138 var6 = new class138();
        var6.field2665 = arg4.field1224 * 128;
        var6.field2676 = arg4.field1199;
        var6.field2666 = arg4.field1229;
        var6.field2670 = arg1 * 128;
        if (arg5 == -4) {
            var6.field2667 = arg4.field1232;
            var6.field2672 = arg2;
            var6.field2663 = arg4.field1231;
            var6.field2677 = arg0 * 128;
            int var7 = arg4.field1209;
            int var8 = arg4.field1196;
            if (arg3 == 1 || ~arg3 == -4) {
                var7 = arg4.field1196;
                var8 = arg4.field1209;
            }
            var6.field2662 = (arg1 + var8) * 128;
            var6.field2671 = (arg0 - -var7) * 128;
            if (arg4.field1197 != null) {
                var6.field2680 = arg4;
                var6.method871(107);
            }
            class56.field1059.method235(var6, true);
            if (var6.field2667 != null) {
                var6.field2678 = (int) (Math.random() * (double) (var6.field2666 - var6.field2663)) + var6.field2663;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)Lvd;")
    public static final class222 method727(int arg0, int arg1) {
        ++field2105;
        if (~arg1 > -100001) {
            return class234.method1531(new class222[] { class211.field3925, class56.method414(-113, arg1), class180.field3348 }, arg0 + -1010949);
        } else if (arg1 < 10000000) {
            return class234.method1531(new class222[] { class197.field3604, class56.method414(-108, arg1 / 1000), class22.field531, class180.field3348 }, -10949);
        } else {
            if (arg0 != 1000000) {
                method729(-123, -104);
            }
            return class234.method1531(new class222[] { class143.field2774, class56.method414(arg0 ^ -999988, arg1 / 1000000), class52.field1001, class180.field3348 }, -10949);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IB)Ltf;")
    public static final class204 method728(int arg0, byte arg1) {
        ++field2109;
        class204 var2 = (class204) class18.field442.method601((long) arg0, 121);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class80.field1542.method33(-29616, class27.method228((byte) -6, arg0), class68.method462(arg0, 255));
            class204 var4 = new class204();
            int var5 = 19 % ((arg1 - -38) / 56);
            var4.field3741 = arg0;
            if (var3 != null) {
                var4.method1312(new class109(var3), -1);
            }
            var4.method1314((byte) -63);
            if (var4.field3749 != -1) {
                var4.method1316(1, method728(var4.field3752, (byte) -116), method728(var4.field3749, (byte) 51));
            }
            if (~var4.field3766 != 0) {
                var4.method1306(-106, method728(var4.field3772, (byte) 126), method728(var4.field3766, (byte) -126));
            }
            if (!class228.field4289 && var4.field3788) {
                var4.field3775 = 0;
                var4.field3736 = null;
                var4.field3793 = false;
                var4.field3767 = null;
                var4.field3777 = class214.field3971;
            }
            class18.field442.method593((long) arg0, var4, (byte) -12);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)Lvd;")
    public static final class222 method729(int arg0, int arg1) {
        ++field2112;
        return arg1 < 36 ? null : class234.method1531(new class222[] { class56.method414(-116, arg0 >> 24 & 255), class93.field1742, class56.method414(-114, (16740139 & arg0) >> 16), class93.field1742, class56.method414(-115, arg0 >> 8 & 255), class93.field1742, class56.method414(-116, arg0 & 255) }, -10949);
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class112() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)I")
    private final int method730(int arg0, int arg1, int arg2) {
        ++field2114;
        int var4 = arg2 - -(arg1 * 57);
        int var5 = var4 << 1 ^ var4;
        if (arg0 != 789221) {
            field2107 = 118;
        }
        return -(((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }
}
