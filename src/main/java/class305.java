import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class305 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    private int field5292 = 0;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "Z")
    public boolean field5294 = false;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    private int field5305 = 128;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    private int field5307 = 0;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public int field5308 = -1;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "I")
    private int field5318 = 0;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    private int field5315 = 128;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "[S")
    public static short[] field5299 = new short[500];

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "Lsf;")
    public static class108 field5302 = class140.method973(255, "Librairie 3D d-Bmarr-Be");

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field5300 = -1;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "Lsf;")
    public static class108 field5310 = class140.method973(255, "voudrait faire un -Bchange avec vous)3");

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "Lsf;")
    private static class108 field5304 = class140.method973(255, "Allocating memory");

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public static int field5312 = 0;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "Lsf;")
    public static class108 field5316 = class140.method973(255, " (X");

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "Lsf;")
    public static class108 field5320 = field5304;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    private int field5297;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public int field5309;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "[S")
    private short[] field5301;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "[S")
    private short[] field5303;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "[S")
    private short[] field5314;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "[S")
    private short[] field5317;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)Lsf;", line = 16)
    public static final class108 method2140(byte arg0) {
        class108 var1 = class174.field3172;
        if (class220.field3910 != 0) {
            var1 = class310.field5358;
        }
        field5319++;
        class108 var2 = class63.field1016;
        int var3 = -114 / ((arg0 - 59) / 59);
        if (class160.field2869 != null) {
            var2 = class117.method833(new class108[] { class144.field2530, class160.field2869 }, false);
        }
        return class117.method833(new class108[] { class59.field879, var1, class19.field264, class79.method518(false, class88.field1393), class313.field5410, class79.method518(false, class247.field4269), var2, class69.field1080 }, false);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILrm;)V", line = 43)
    public final void method2141(int arg0, class249 arg1) {
        field5293++;
        while (true) {
            int var3 = arg1.method1731(true);
            if (var3 == 0) {
                if (arg0 != -1) {
                    this.field5305 = 47;
                }
                return;
            }
            this.method2145(var3, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIII)V", line = 64)
    public static final void method2142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != -2) {
            return;
        }
        field5306++;
        if (arg6 >= class260.field4593 && class79.field1202 >= arg5 && arg3 >= class266.field4677 && class166.field2984 >= arg2) {
            if (arg0 == 1) {
                class301.method2119(arg5, arg1 ^ 0xFFFFFFEE, arg2, arg6, arg3, arg4);
            } else {
                class293.method2093(arg5, arg4, (byte) -60, arg6, arg0, arg2, arg3);
            }
        } else if (arg0 == 1) {
            class151.method1071(arg3, arg2, arg4, arg6, arg5, arg1 ^ 0xFFFFFF81);
        } else {
            class101.method701(arg6, arg0, arg3, arg5, (byte) -125, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 105)
    public static void method2143(int arg0) {
        if (arg0 != -21472) {
            field5295 = -31;
        }
        field5316 = null;
        field5304 = null;
        field5299 = null;
        field5310 = null;
        field5302 = null;
        field5320 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Lke;", line = 151)
    public final class113 method2144(int arg0, int arg1) {
        class113 var3 = (class113) class286.field5000.method642((long) this.field5309, (byte) -81);
        field5298++;
        if (var3 == null) {
            class230 var4 = class230.method1556(class3.field49, this.field5297, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field5314 != null) {
                for (int var5 = 0; var5 < this.field5314.length; var5++) {
                    var4.method1553(this.field5314[var5], this.field5317[var5]);
                }
            }
            if (this.field5303 != null) {
                for (int var6 = 0; var6 < this.field5303.length; var6++) {
                    var4.method1565(this.field5303[var6], this.field5301[var6]);
                }
            }
            var3 = var4.method1555(this.field5307 + 64, 850 - -this.field5318, -30, -50, -30);
            class286.field5000.method643((byte) -49, (long) this.field5309, var3);
        }
        class113 var7;
        if (this.field5308 == -1 || arg1 == -1) {
            var7 = var3.method288(true, true);
        } else {
            var7 = class149.method1063(this.field5308, -18767).method1966(arg1, (byte) 124, var3);
        }
        if (this.field5315 != 128 || this.field5305 != 128) {
            var7.method304(this.field5315, this.field5305, this.field5315);
        }
        if (this.field5292 != 0) {
            if (this.field5292 == 90) {
                var7.method316();
            }
            if (this.field5292 == 180) {
                var7.method297();
            }
            if (this.field5292 == 270) {
                var7.method299();
            }
        }
        if (arg0 < 17) {
            field5316 = (class108) null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILrm;)V", line = 253)
    private final void method2145(int arg0, int arg1, class249 arg2) {
        if (arg1 != 0) {
            field5320 = (class108) null;
        }
        field5311++;
        if (arg0 == 1) {
            this.field5297 = arg2.method1712(arg1 - 1);
        } else if (arg0 == 2) {
            this.field5308 = arg2.method1712(-1);
        } else if (arg0 == 4) {
            this.field5315 = arg2.method1712(-1);
        } else if (arg0 == 5) {
            this.field5305 = arg2.method1712(~arg1);
        } else if (arg0 == 6) {
            this.field5292 = arg2.method1712(-1);
        } else if (arg0 == 7) {
            this.field5307 = arg2.method1731(true);
        } else if (arg0 == 8) {
            this.field5318 = arg2.method1731(true);
        } else if (arg0 == 9) {
            this.field5294 = true;
        } else if (arg0 == 40) {
            int var4 = arg2.method1731(true);
            this.field5317 = new short[var4];
            this.field5314 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5314[var5] = (short) arg2.method1712(-1);
                this.field5317[var5] = (short) arg2.method1712(arg1 - 1);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method1731(true);
            this.field5303 = new short[var6];
            this.field5301 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5303[var7] = (short) arg2.method1712(-1);
                this.field5301[var7] = (short) arg2.method1712(arg1 - 1);
            }
        }
    }
}
