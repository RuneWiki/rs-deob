import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class207 extends class391 {

    @OriginalMember(owner = "client!vc", name = "Mb", descriptor = "[I")
    public static int[] field2895 = new int[1];

    @OriginalMember(owner = "client!vc", name = "Cb", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!vc", name = "Db", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!vc", name = "Eb", descriptor = "I")
    private int field2887;

    @OriginalMember(owner = "client!vc", name = "Fb", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!vc", name = "Gb", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!vc", name = "Hb", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!vc", name = "Ib", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!vc", name = "Jb", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!vc", name = "Kb", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!vc", name = "Nb", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!vc", name = "Ob", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!vc", name = "Pb", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!vc", name = "Lb", descriptor = "Lpb;")
    private class464 field2894;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "(I)V", line = 3)
    public final void method1276(int arg0) {
        super.field5719 = (this.field2887 - -7) / 8;
        ++field2889;
        if (arg0 <= 73) {
            this.method1277(1);
        }
    }

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "(I)Z", line = 16)
    public final boolean method1277(int arg0) {
        int var2 = -28 / ((-61 - arg0) / 63);
        ++field2892;
        int var3 = super.field5678[super.field5719] + -this.field2894.method2726(113) & 255;
        return ~var3 <= -129;
    }

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "(I)V", line = 32)
    public final void method1278(int arg0) {
        if (arg0 != 0) {
            this.method1276(-106);
        }
        ++field2885;
        this.field2887 = super.field5719 * 8;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(ZI)I", line = 43)
    public final int method1279(boolean arg0, int arg1) {
        if (!arg0) {
            field2895 = null;
        }
        ++field2898;
        return arg1 * 8 - this.field2887;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I[I)V", line = 59)
    public final void method1280(int arg0, int[] arg1) {
        this.field2894 = new class464(arg1);
        ++field2896;
        if (arg0 != 178105062) {
            field2895 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "(II)V", line = 70)
    public final void method1281(int arg0, int arg1) {
        super.field5678[super.field5719++] = (byte) (this.field2894.method2723(-257) + arg0);
        ++field2897;
        if (arg1 != -3) {
            this.field2887 = 34;
        }
    }

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "(II)I", line = 85)
    public final int method1282(int arg0, int arg1) {
        ++field2890;
        int var3 = this.field2887 >> 3;
        if (arg0 != -26364) {
            method1284(true);
        }
        int var4 = -(this.field2887 & 7) + 8;
        this.field2887 += arg1;
        int var5 = 0;
        while (var4 < arg1) {
            var5 += (super.field5678[var3++] & class389.field5667[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 != ~var4) {
            var6 = (super.field5678[var3] >> -arg1 + var4 & class389.field5667[arg1]) + var5;
        } else {
            var6 = (super.field5678[var3] & class389.field5667[var4]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(I)V", line = 115)
    public class207(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "(B)V", line = 123)
    public static void method1283(byte arg0) {
        if (arg0 == -109) {
            field2895 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(Z)V", line = 136)
    public static final void method1284(boolean arg0) {
        ++field2891;
        if (class492.field7178 != 10 && ~class492.field7178 != -29) {
            int var1 = class316.field4324.field1127[0] >> 3;
            int var2 = class316.field4324.field1117[0] >> 3;
            if (~var1 <= -1 && ~var1 > ~(class527.field7799 >> 3) && var2 >= 0 && ~var2 > ~(class422.field6182 >> 3)) {
                class218.method1351(var2, true, 5000, var1);
            } else {
                class218.method1351(class422.field6182 >> 4, true, 0, class527.field7799 >> 4);
            }
        } else {
            class218.method1351(class373.field5478 >> 10, true, 5000, class329.field4493 >> 10);
        }
        if (arg0) {
            field2895 = null;
        }
        class220.method1361(-11554);
        class490.method2871(-1475793664);
        class275.method1629((byte) -61);
        class310.method1798((byte) 81);
    }

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "(B)V", line = 169)
    public static final void method1285(byte arg0) {
        ++field2886;
        class355 var1 = null;
        try {
            class56 var2 = class202.field2840.method2954(-29744, "2");
            while (~var2.field667 == -1) {
                class157.method1046(-128, 1L);
            }
            if (~var2.field667 == -2) {
                var1 = (class355) var2.field670;
                class391 var3 = new class391(3 - -(class376.field5510 * 6));
                var3.method2302(-4, 1);
                var3.method2355(1686288168, class376.field5510);
                for (int var4 = 0; var4 < class263.field3635.length; ++var4) {
                    if (class357.field5216[var4]) {
                        var3.method2355(1686288168, var4);
                        var3.method2359(class263.field3635[var4], -128);
                    }
                }
                var1.method2121(0, (byte) -89, var3.field5719, var3.field5678);
            }
        } catch (Exception var6) {
        }
        if (arg0 >= -69) {
            field2895 = null;
        }
        try {
            if (var1 != null) {
                var1.method2126(-1);
            }
        } catch (Exception var5) {
        }
        class522.field7735 = class246.method1483(5957);
        class489.field7143 = false;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([BIII)V", line = 224)
    public final void method1286(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1030414183) {
            for (int var5 = 0; var5 < arg2; ++var5) {
                arg0[arg3 + var5] = (byte) (super.field5678[super.field5719++] + -this.field2894.method2723(-257));
            }
            ++field2888;
        }
    }

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "(B)I", line = 245)
    public final int method1287(byte arg0) {
        if (arg0 <= 99) {
            field2895 = null;
        }
        ++field2893;
        int var2 = super.field5678[super.field5719++] + -this.field2894.method2723(-257) & 255;
        return var2 < 128 ? var2 : (var2 + -128 << 8) - -(super.field5678[super.field5719++] - this.field2894.method2723(-257) & 255);
    }
}
