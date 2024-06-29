import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class278 extends class224 {

    @OriginalMember(owner = "client!h", name = "Tb", descriptor = "I")
    public static int field4305 = 0;

    @OriginalMember(owner = "client!h", name = "Wb", descriptor = "[Ljava/lang/String;")
    public static String[] field4308 = new String[1000];

    @OriginalMember(owner = "client!h", name = "ac", descriptor = "Lic;")
    public static class143 field4312 = new class143(64);

    @OriginalMember(owner = "client!h", name = "ec", descriptor = "[J")
    public static long[] field4316 = new long[500];

    @OriginalMember(owner = "client!h", name = "gc", descriptor = "J")
    public static long field4318 = 0L;

    @OriginalMember(owner = "client!h", name = "dc", descriptor = "S")
    public static short field4315 = 1;

    @OriginalMember(owner = "client!h", name = "ic", descriptor = "Ljava/lang/String;")
    public static String field4320 = "flash2:";

    @OriginalMember(owner = "client!h", name = "Lb", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!h", name = "Nb", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!h", name = "Ob", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!h", name = "Pb", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!h", name = "Qb", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!h", name = "Rb", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!h", name = "Sb", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!h", name = "Ub", descriptor = "I")
    private int field4306;

    @OriginalMember(owner = "client!h", name = "Vb", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!h", name = "Xb", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!h", name = "Yb", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!h", name = "Zb", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!h", name = "cc", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!h", name = "Mb", descriptor = "Lmh;")
    private class154 field4298;

    @OriginalMember(owner = "client!h", name = "fc", descriptor = "Lpa;")
    public static class220 field4317;

    @OriginalMember(owner = "client!h", name = "hc", descriptor = "Lhc;")
    public static class235 field4319;

    @OriginalMember(owner = "client!h", name = "bc", descriptor = "[[[Ljd;")
    public static class89[][][] field4313;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IZI[B)V")
    public final void method1854(int arg0, boolean arg1, int arg2, byte[] arg3) {
        ++field4314;
        if (!arg1) {
            for (int var5 = 0; ~var5 > ~arg0; ++var5) {
                arg3[arg2 + var5] = (byte) (super.field3336[super.field3402++] + -this.field4298.method1023((byte) -45));
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "u", descriptor = "(I)V")
    public static final void method1855(int arg0) {
        class69.field936.method546(-90762264);
        class151.field2082.method546(-90762264);
        ++field4304;
        class122.field1699.method546(arg0 + -90733860);
        if (arg0 != -28404) {
            field4319 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(I)V")
    public class278(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!h", name = "n", descriptor = "(B)V")
    public final void method1856(byte arg0) {
        this.field4306 = super.field3402 * 8;
        ++field4303;
        if (arg0 != -45) {
            field4308 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "v", descriptor = "(I)Ltj;")
    public static final class280 method1857(int arg0) {
        if (arg0 != 8) {
            return null;
        } else {
            ++field4309;
            class280 var1 = (class280) class118.field1672.method1887((byte) -89);
            if (var1 != null) {
                var1.method1115(-121);
                var1.method527(false);
                return var1;
            } else {
                class280 var2;
                do {
                    var2 = (class280) class205.field2854.method1887((byte) -56);
                    if (var2 == null) {
                        return null;
                    }
                    if (~var2.method1877(false) < ~class223.method1433((byte) -1)) {
                        return null;
                    }
                    var2.method1115(-128);
                    var2.method527(false);
                } while ((Long.MIN_VALUE & var2.field1148) == 0L);
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "m", descriptor = "(II)V")
    public static final void method1858(int arg0, int arg1) {
        ++field4300;
        class281.method1884(arg0 ^ 123);
        class96.method640(arg0 + -37);
        int var2 = class151.method1013(true, arg1).field911;
        if (arg0 != -8) {
            method1858(77, -18);
        }
        if (var2 != 0) {
            int var3 = class120.field1688[arg1];
            if (var2 == 5) {
                class170.field2352 = var3;
            }
            if (~var2 == -7) {
                class13.field137 = var3;
            }
            if (~var2 == -10) {
                class77.field1083 = var3;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "o", descriptor = "(B)V")
    public static void method1859(byte arg0) {
        field4317 = null;
        int var1 = -5 / ((arg0 - 20) / 51);
        field4316 = null;
        field4319 = null;
        field4312 = null;
        field4320 = null;
        field4313 = null;
        field4308 = null;
    }

    @OriginalMember(owner = "client!h", name = "w", descriptor = "(I)V")
    public final void method1860(int arg0) {
        ++field4299;
        super.field3402 = (this.field4306 + 7) / 8;
        if (arg0 != -16973) {
            field4315 = -13;
        }
    }

    @OriginalMember(owner = "client!h", name = "x", descriptor = "(I)I")
    public final int method1861(int arg0) {
        ++field4301;
        if (arg0 != -311308797) {
            this.field4298 = null;
        }
        return 255 & super.field3336[super.field3402++] + -this.field4298.method1023((byte) -107);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "([II)V")
    public final void method1862(int[] arg0, int arg1) {
        ++field4297;
        if (arg1 != 8) {
            field4318 = 57L;
        }
        this.field4298 = new class154(arg0);
    }

    @OriginalMember(owner = "client!h", name = "n", descriptor = "(II)I")
    public final int method1863(int arg0, int arg1) {
        ++field4302;
        if (arg0 != -7686) {
            field4316 = null;
        }
        return arg1 * 8 + -this.field4306;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(IB)V")
    public final void method1864(int arg0, byte arg1) {
        super.field3336[super.field3402++] = (byte) (this.field4298.method1023((byte) -115) + arg0);
        if (arg1 != -69) {
            this.method1854(-19, true, 77, (byte[]) null);
        }
        ++field4311;
    }

    @OriginalMember(owner = "client!h", name = "o", descriptor = "(II)I")
    public final int method1865(int arg0, int arg1) {
        ++field4307;
        int var3 = 0;
        int var4 = -(7 & this.field4306) + arg1;
        int var5 = this.field4306 >> 3;
        this.field4306 += arg0;
        while (var4 < arg0) {
            var3 += (super.field3336[var5++] & class47.field682[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (class47.field682[var4] & super.field3336[var5]) + var3;
        } else {
            var6 = (super.field3336[var5] >> -arg0 + var4 & class47.field682[arg0]) + var3;
        }
        return var6;
    }

    @OriginalMember(owner = "client!h", name = "p", descriptor = "(B)[Lge;")
    public static final class72[] method1866(byte arg0) {
        ++field4310;
        class72[] var1 = new class72[class175.field2465];
        if (arg0 != 117) {
            return null;
        } else {
            for (int var2 = 0; var2 < class175.field2465; ++var2) {
                var1[var2] = new class72(class21.field296, class287.field4535, class273.field4208[var2], class198.field2749[var2], class50.field729[var2], class39.field576[var2], class140.field1956[var2], class9.field79);
            }
            class15.method88(arg0 ^ -15896);
            return var1;
        }
    }
}
