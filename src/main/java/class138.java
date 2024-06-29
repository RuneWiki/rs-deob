import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class138 {

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "Lcs;")
    private class225 field1962 = new class225();

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    private int field1967;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    private int field1964;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "Lbj;")
    private class159 field1976;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "Luf;")
    public static class310 field1961 = new class310(95, 2);

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "[I")
    public static int[] field1974 = new int[13];

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "Luf;")
    public static class310 field1978 = new class310(37, -1);

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "Ljm;")
    public static class485 field1982 = new class485(71, 18);

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "Lqi;")
    public static class398 field1983 = new class398();

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "Llm;")
    public static class344 field1984;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "[I")
    public static int[] field1985;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILwv;)V")
    private final void method890(int arg0, class26 arg1) {
        if (arg1 != null) {
            arg1.method2946(-118);
            arg1.method581(4);
            this.field1964 += arg1.field403;
        }
        field1963++;
        if (arg0 > -74) {
            method898(-34);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLcg;)V")
    private final void method891(byte arg0, class90 arg1) {
        field1975++;
        if (arg0 > -110) {
            this.method890(-76, null);
        }
        long var3 = arg1.method217((byte) 112);
        for (class26 var5 = (class26) this.field1976.method979((byte) 28, var3); var5 != null; var5 = (class26) this.field1976.method991((byte) -124)) {
            if (var5.field402.method219(arg1, (byte) 121)) {
                this.method890(-86, var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)I")
    public final int method892(int arg0) {
        if (arg0 == 10292) {
            field1965++;
            return this.field1964;
        } else {
            return -10;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZLss;ZI)V")
    public static final void method893(int arg0, boolean arg1, class295 arg2, boolean arg3, int arg4) {
        field1979++;
        int var5 = arg2.field4022;
        int var6 = arg2.field3960;
        if (arg2.field3933 == 0) {
            arg2.field4022 = arg2.field3964;
        } else if (arg2.field3933 == 1) {
            arg2.field4022 = arg4 - arg2.field3964;
        } else if (arg2.field3933 == 2) {
            arg2.field4022 = arg2.field3964 * arg4 >> 14;
        }
        if (arg2.field4089 == 0) {
            arg2.field3960 = arg2.field3926;
        } else if (arg2.field4089 == 1) {
            arg2.field3960 = arg0 - arg2.field3926;
        } else if (arg2.field4089 == 2) {
            arg2.field3960 = arg2.field3926 * arg0 >> 14;
        }
        if (arg2.field3933 == 4) {
            arg2.field4022 = arg2.field4015 * arg2.field3960 / arg2.field4046;
        }
        if (arg2.field4089 == 4) {
            arg2.field3960 = arg2.field4046 * arg2.field4022 / arg2.field4015;
        }
        if (class476.field6973 && (client.method1191(arg2).field2833 != 0 || arg2.field3984 == 0)) {
            if (arg2.field3960 < 5 && arg2.field4022 < 5) {
                arg2.field3960 = 5;
                arg2.field4022 = 5;
            } else {
                if (arg2.field4022 <= 0) {
                    arg2.field4022 = 5;
                }
                if (arg2.field3960 <= 0) {
                    arg2.field3960 = 5;
                }
            }
        }
        if (arg3) {
            return;
        }
        if (class496.field7306 == arg2.field3995) {
            class515.field7561 = arg2;
        }
        if (arg1 && arg2.field4002 != null && arg2.field4022 != var5 || arg2.field3960 != var6) {
            class44 var7 = new class44();
            var7.field612 = arg2.field4002;
            var7.field613 = arg2;
            class225.field3171.method3070(var7, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)I")
    public final int method894(byte arg0) {
        if (arg0 == -48) {
            field1970++;
            return this.field1967;
        } else {
            return 16;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZLjava/lang/Object;Lcg;I)V")
    private final void method895(boolean arg0, Object arg1, class90 arg2, int arg3) {
        field1973++;
        if (this.field1967 < arg3) {
            throw new IllegalStateException("s>cs");
        } else if (!arg0) {
            this.method891((byte) -111, arg2);
            this.field1964 -= arg3;
            while (this.field1964 < 0) {
                class26 var6 = (class26) this.field1962.method1334(124);
                this.method890(-105, var6);
            }
            class487 var5 = new class487(arg2, arg1, arg3);
            this.field1976.method990(arg2.method217((byte) 112), (byte) 79, var5);
            this.field1962.method1335(-571093627, var5);
            var5.field1140 = 0L;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
    public final void method896(int arg0) {
        if (arg0 != 1) {
            return;
        }
        for (class26 var2 = (class26) this.field1962.method1328((byte) -88); var2 != null; var2 = (class26) this.field1962.method1330(192)) {
            if (var2.method188((byte) 48)) {
                var2.method2946(-120);
                var2.method581(4);
                this.field1964 += var2.field403;
            }
        }
        field1966++;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V")
    public final void method897(byte arg0) {
        field1972++;
        this.field1962.method1333(-95);
        this.field1976.method992(-15728);
        this.field1964 = this.field1967;
        int var2 = 97 % ((-arg0 - 36) / 42);
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V")
    public static void method898(int arg0) {
        field1961 = null;
        field1978 = null;
        field1984 = null;
        field1982 = null;
        field1974 = null;
        field1985 = null;
        if (arg0 == 5) {
            field1983 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)V")
    public final void method899(byte arg0, int arg1) {
        field1980++;
        if (arg0 != -81 || class425.field6198 == null) {
            return;
        }
        for (class26 var3 = (class26) this.field1962.method1328((byte) -84); var3 != null; var3 = (class26) this.field1962.method1330(192)) {
            if (var3.method188((byte) 48)) {
                if (var3.method189(arg0 ^ 0xFFFFF7AF) == null) {
                    var3.method2946(arg0 ^ 0x3B);
                    var3.method581(4);
                    this.field1964 += var3.field403;
                }
            } else if (++var3.field1140 > (long) arg1) {
                class26 var4 = class425.field6198.method33(0, var3);
                this.field1976.method990(var3.field7342, (byte) 40, var4);
                class287.method1638(var3, var4, -6809);
                var3.method2946(arg0 - 41);
                var3.method581(arg0 ^ 0xFFFFFFAB);
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lcg;ILjava/lang/Object;)V")
    public final void method900(class90 arg0, int arg1, Object arg2) {
        field1971++;
        this.method895(false, arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BII)V")
    public static final void method901(byte arg0, int arg1, int arg2) {
        field1977++;
        class159 var3 = new class159(16);
        for (class152 var4 = (class152) class456.field6672.method981(0); var4 != null; var4 = (class152) class456.field6672.method989(0)) {
            var4.method2946(-104);
            int var5 = (int) (var4.field7342 >> 28);
            int var6 = (int) (var4.field7342 >> 14 & 0x3FFFL) - arg2;
            int var7 = (int) (var4.field7342 & 0x3FFFL) - arg1;
            if (var7 >= 0 && var6 >= 0 && class442.field6435 > var7 && var6 < class232.field3217) {
                var3.method990((long) (var6 << 14 | var5 << 28 | var7), (byte) 14, var4);
            }
        }
        if (arg0 != 76) {
            method901((byte) -69, 125, -120);
        }
        class456.field6672 = var3;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lcg;I)Ljava/lang/Object;")
    public final Object method902(class90 arg0, int arg1) {
        field1969++;
        long var3 = arg0.method217((byte) 112);
        int var5 = -66 / ((-arg1 - 2) / 36);
        for (class26 var6 = (class26) this.field1976.method979((byte) 28, var3); var6 != null; var6 = (class26) this.field1976.method991((byte) -99)) {
            if (var6.field402.method219(arg0, (byte) 121)) {
                Object var7 = var6.method189(2048);
                if (var7 != null) {
                    if (var6.method188((byte) 48)) {
                        class487 var8 = new class487(arg0, var7, var6.field403);
                        this.field1976.method990(var6.field7342, (byte) 69, var8);
                        this.field1962.method1335(-571093627, var8);
                        var8.field1140 = 0L;
                        var6.method2946(-121);
                        var6.method581(4);
                    } else {
                        this.field1962.method1335(-571093627, var6);
                        var6.field1140 = 0L;
                    }
                    return var7;
                }
                var6.method2946(-115);
                var6.method581(4);
                this.field1964 += var6.field403;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIILuo;)V")
    public static final void method903(int arg0, int arg1, int arg2, class405 arg3) {
        if (arg2 != -3) {
            return;
        }
        field1968++;
        if (arg3.field271 == arg0 && arg0 != -1) {
            class467 var4 = class275.field3740.method1484(0, arg0);
            int var5 = var4.field6826;
            if (var5 == 1) {
                arg3.field345 = 0;
                arg3.field335 = 0;
                arg3.field273 = 0;
                arg3.field342 = 1;
                arg3.field325 = arg1;
                class284.method1624(arg3.field461, false, arg3.field466, var4, arg3.field273, arg2 ^ 0xFFFFFF83, arg3.field464);
            }
            if (var5 == 2) {
                arg3.field345 = 0;
                return;
            }
        } else if (arg0 == -1 || arg3.field271 == -1 || class275.field3740.method1484(arg2 + 3, arg0).field6810 >= class275.field3740.method1484(arg2 ^ 0xFFFFFFFD, arg3.field271).field6810) {
            arg3.field335 = 0;
            arg3.field271 = arg0;
            arg3.field325 = arg1;
            arg3.field342 = 1;
            arg3.field363 = arg3.field368;
            arg3.field345 = 0;
            arg3.field273 = 0;
            if (arg3.field271 == -1) {
                return;
            }
            class284.method1624(arg3.field461, false, arg3.field466, class275.field3740.method1484(0, arg3.field271), arg3.field273, 127, arg3.field464);
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I)V")
    public class138(int arg0) {
        this.field1967 = arg0;
        this.field1964 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1976 = new class159(var2);
    }
}
