import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class320 {

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "Lrd;")
    private class225 field4990 = new class225();

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    private int field4999;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    private int field4996;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "Lgd;")
    private class170 field5002;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Lpg;")
    public static class320 field4994 = new class320(64);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "[I")
    public static int[] field5001;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIZ)I", line = 4)
    public static final int method2171(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 != -4271) {
            return -125;
        }
        field5000++;
        class137 var4 = (class137) class281.field4320.method1222(0, (long) arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field2158.length; var6++) {
            if (var4.field2158[var6] >= 0 && var4.field2158[var6] < class186.field2786) {
                class299 var7 = class237.method1657(2, var4.field2158[var6]);
                if (var7.field4638 != null) {
                    class295 var8 = (class295) var7.field4638.method1222(0, (long) arg2);
                    if (var8 != null) {
                        if (arg3) {
                            var5 += var4.field2159[var6] * var8.field4562;
                        } else {
                            var5 += var8.field4562;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)Lnm;", line = 54)
    public static final class190 method2172(int arg0, int arg1) {
        field5006++;
        class190 var2 = (class190) class240.field3839.method2179(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class62.field999.method980(class128.method931(arg0, (byte) -74), class52.method431((byte) 112, arg0), arg1 ^ 0x7E77);
        class190 var4 = new class190();
        if (var3 != null) {
            var4.method1360(new class166(var3), (byte) 95);
        }
        if (arg1 != 32370) {
            field5008 = 78;
        }
        class240.field3839.method2173(var4, true, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/lang/Object;ZJ)V", line = 77)
    public final void method2173(Object arg0, boolean arg1, long arg2) {
        field5007++;
        this.method2183(arg2, -65);
        if (this.field4999 == 0) {
            class39 var5 = (class39) this.field4990.method1596((byte) 0);
            var5.method403(1);
            var5.method1412(0);
        } else {
            this.field4999--;
        }
        class48 var6 = new class48(arg0);
        this.field5002.method1227(var6, 0, arg2);
        this.field4990.method1595(arg1, var6);
        var6.field2980 = 0L;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 106)
    public final void method2174(int arg0) {
        class39 var2 = (class39) this.field4990.method1589(0);
        if (arg0 != -10385) {
            this.method2176((byte) 67);
        }
        while (var2 != null) {
            if (var2.method326((byte) -53)) {
                var2.method403(1);
                var2.method1412(0);
                this.field4999++;
            }
            var2 = (class39) this.field4990.method1591((byte) 93);
        }
        field5010++;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)V", line = 131)
    public final void method2175(int arg0, int arg1) {
        if (arg1 != -1401253017) {
            this.field4996 = 107;
        }
        if (class297.field4594 != null) {
            for (class39 var3 = (class39) this.field4990.method1589(0); var3 != null; var3 = (class39) this.field4990.method1591((byte) 122)) {
                if (var3.method326((byte) -50)) {
                    if (var3.method325((byte) 97) == null) {
                        var3.method403(arg1 ^ 0xAC7A9366);
                        var3.method1412(0);
                        this.field4999++;
                    }
                } else if (((long) arg0) < (++var3.field2980)) {
                    class39 var4 = class297.field4594.method19((byte) -119, var3);
                    this.field5002.method1227(var4, arg1 ^ 0xAC7A9367, var3.field758);
                    class161.method1095(62, var4, var3);
                    var3.method403(1);
                    var3.method1412(0);
                }
            }
        }
        field4995++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V", line = 181)
    public final void method2176(byte arg0) {
        field4997++;
        this.field4990.method1594(77);
        this.field5002.method1226(0);
        int var2 = 72 % ((38 - arg0) / 57);
        this.field4999 = this.field4996;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V", line = 196)
    public static final void method2177(int arg0) {
        field5004++;
        if (arg0 < -59) {
            class213.field3248.method2174(-10385);
            class257.field4031.method2174(-10385);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIII)V", line = 216)
    public static final void method2178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg1; var6 <= arg1 + arg3; var6++) {
            for (int var7 = arg0; var7 <= (arg0 + arg2); var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class228.field3626[arg5][var7][var6] = 127;
                }
            }
        }
        field4992++;
        int var8 = arg1;
        if (arg4 != -29029) {
            field5001 = (int[]) null;
        }
        while (var8 < arg1 + arg3) {
            for (int var9 = arg0; var9 < (arg0 + arg2); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class218.field3321[arg5][var9][var8] = arg5 > 0 ? class218.field3321[arg5 - 1][var9][var8] : 0;
                }
            }
            var8++;
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var10 = arg1 + 1; var10 < arg1 + arg3; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class218.field3321[arg5][arg0][var10] = class218.field3321[arg5][arg0 - 1][var10];
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var11 = arg0 + 1; var11 < arg0 + arg2; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class218.field3321[arg5][var11][arg1] = class218.field3321[arg5][var11][arg1 - 1];
                }
            }
        }
        if (arg0 < 0 || arg1 < 0 || arg0 >= 104 || arg1 >= 104) {
            return;
        }
        if (arg5 == 0) {
            if (arg0 > 0 && class218.field3321[arg5][arg0 - 1][arg1] != 0) {
                class218.field3321[arg5][arg0][arg1] = class218.field3321[arg5][arg0 - 1][arg1];
            } else if (arg1 > 0 && class218.field3321[arg5][arg0][arg1 - 1] != 0) {
                class218.field3321[arg5][arg0][arg1] = class218.field3321[arg5][arg0][arg1 - 1];
            } else if (arg0 > 0 && arg1 > 0 && class218.field3321[arg5][arg0 - 1][arg1 - 1] != 0) {
                class218.field3321[arg5][arg0][arg1] = class218.field3321[arg5][arg0 - 1][arg1 - 1];
            }
        } else if (arg0 > 0 && class218.field3321[arg5 - 1][arg0 - 1][arg1] != class218.field3321[arg5][arg0 - 1][arg1]) {
            class218.field3321[arg5][arg0][arg1] = class218.field3321[arg5][arg0 - 1][arg1];
        } else if (arg1 > 0 && class218.field3321[arg5 - 1][arg0][arg1 - 1] != class218.field3321[arg5][arg0][arg1 - 1]) {
            class218.field3321[arg5][arg0][arg1] = class218.field3321[arg5][arg0][arg1 - 1];
        } else if (arg0 > 0 && arg1 > 0 && class218.field3321[arg5 - 1][arg0 - 1][arg1 - 1] != class218.field3321[arg5][arg0 - 1][arg1 - 1]) {
            class218.field3321[arg5][arg0][arg1] = class218.field3321[arg5][arg0 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZJ)Ljava/lang/Object;", line = 337)
    public final Object method2179(boolean arg0, long arg1) {
        class39 var4 = (class39) this.field5002.method1222(0, arg1);
        field4993++;
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method325((byte) 121);
        if (arg0) {
            method2181(83, 118, -30, -2);
        }
        if (var5 == null) {
            var4.method403(1);
            var4.method1412(0);
            this.field4999++;
            return null;
        }
        if (var4.method326((byte) -66)) {
            class48 var6 = new class48(var5);
            this.field5002.method1227(var6, 0, var4.field758);
            this.field4990.method1595(true, var6);
            var6.field2980 = 0L;
            var4.method403(1);
            var4.method1412(0);
        } else {
            this.field4990.method1595(true, var4);
            var4.field2980 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIII)V", line = 378)
    public static final void method2180(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4991++;
        if (~class1.field20 == arg1 || arg2 == 0 || class61.field986 >= 50 || arg4 == -1) {
            return;
        }
        class103.field1594[class61.field986] = arg4;
        class342.field5330[class61.field986] = arg2;
        class19.field256[class61.field986] = arg0;
        class267.field4168[class61.field986] = null;
        class263.field4092[class61.field986] = 0;
        class117.field1784[class61.field986] = arg3;
        class61.field986++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)I", line = 400)
    public static final int method2181(int arg0, int arg1, int arg2, int arg3) {
        field5005++;
        if (class218.field3321 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class92.field1468[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var7 = arg0 & 0x7F;
        if (arg2 > -10) {
            method2180(-104, -14, -36, -124, -109);
        }
        int var8 = (128 - var7) * class218.field3321[var6][var4][var5] + class218.field3321[var6][var4 + 1][var5] * var7 >> 7;
        int var9 = arg1 & 0x7F;
        int var10 = (128 - var7) * class218.field3321[var6][var4][var5 + 1] + class218.field3321[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var9) * var8 + var9 * var10 >> 7;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)I", line = 435)
    public final int method2182(byte arg0) {
        field5009++;
        int var2 = 0;
        if (arg0 != 69) {
            this.field4999 = 96;
        }
        for (class39 var3 = (class39) this.field4990.method1589(0); var3 != null; var3 = (class39) this.field4990.method1591((byte) 83)) {
            if (!var3.method326((byte) -108)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(JI)V", line = 460)
    public final void method2183(long arg0, int arg1) {
        field4998++;
        if (arg1 > -58) {
            field5008 = 105;
        }
        class39 var4 = (class39) this.field5002.method1222(0, arg0);
        if (var4 != null) {
            var4.method403(1);
            var4.method1412(0);
            this.field4999++;
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V", line = 487)
    public static void method2184(int arg0) {
        field5001 = null;
        if (arg0 != -7274) {
            field4994 = (class320) null;
        }
        field4994 = null;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(I)V", line = 524)
    public class320(int arg0) {
        this.field4999 = arg0;
        this.field4996 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field5002 = new class170(var2);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILjava/lang/String;)V", line = 507)
    public static final void method2185(int arg0, String arg1) {
        field5003++;
        int var2 = class272.method1875(32028, arg1);
        if (var2 != -1 && arg0 >= 25) {
            int[] var3 = class214.field3256.method8(class162.field2445.field4698[var2] & 0x3FFF, (byte) 110, (class162.field2445.field4698[var2] & 0x363DD384) >> 28, class162.field2445.field4698[var2] >> 14 & 0x3FFF);
            class294.method2001(-1, var3[2], var3[1]);
        }
    }
}
