import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class175 {

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    private int field3051;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    private int field3047;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "[[I")
    private int[][] field3055;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Ljf;")
    public static class229 field3049 = class212.method1457((byte) 100, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Ljf;")
    public static class229 field3056 = class212.method1457((byte) 125, "Abandonner");

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "Ljf;")
    private static class229 field3057 = class212.method1457((byte) 87, "glow1:");

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "[I")
    public static int[] field3059 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Ljf;")
    public static class229 field3050 = field3057;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Ljf;")
    public static class229 field3060 = field3057;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "[I")
    public static int[] field3053;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIB)V", line = 8)
    public static final void method1184(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (class66.field1123 < 100) {
            class284.method1999(33163884);
        }
        field3058++;
        if (class108.field1900) {
            class163.method1095(arg3, arg1, arg0 + arg3, arg1 + arg2);
        } else {
            class114.method813(arg3, arg1, arg0 + arg3, arg1 + arg2);
        }
        if (class66.field1123 < 100) {
            byte var14 = 20;
            int var15 = arg0 / 2 + arg3;
            int var16 = arg1 - (-(arg2 / 2) - -var14) - 18;
            if (class108.field1900) {
                class163.method1102(arg3, arg1, arg0, arg2, 0);
                class163.method1098(var15 - 152, var16, 304, 34, 9179409);
                class163.method1098(var15 - 151, var16 + 1, 302, 32, 0);
                class163.method1102(var15 - 150, var16 + 2, class66.field1123 * 3, 30, 9179409);
                class163.method1102(class66.field1123 * 3 + (var15 - 150), var16 + 2, 300 - (class66.field1123 * 3), 30, 0);
            } else {
                class114.method803(arg3, arg1, arg0, arg2, 0);
                class114.method805(var15 - 152, var16, 304, 34, 9179409);
                class114.method805(var15 - 151, var16 + 1, 302, 32, 0);
                class114.method803(var15 - 150, var16 + 2, class66.field1123 * 3, 30, 9179409);
                class114.method803(class66.field1123 * 3 + var15 - 150, var16 + 2, 300 - class66.field1123 * 3, 30, 0);
            }
            class44.field796.method954(class71.field1370, var15, var14 + var16, 16777215, -1);
            return;
        }
        class140.field2439 = (int) ((float) (arg2 * 2) / class235.field4060);
        int var5 = class151.field2619 - ((int) ((float) arg0 / class235.field4060));
        int var6 = class42.field768 - ((int) ((float) arg2 / class235.field4060));
        class315.field5337 = (int) ((float) (arg0 * 2) / class235.field4060);
        class69.field1317 = class151.field2619 - ((int) ((float) arg0 / class235.field4060));
        int var7 = (int) ((float) arg2 / class235.field4060) + class42.field768;
        int var8 = (int) ((float) arg0 / class235.field4060) + class151.field2619;
        class102.field1774 = class42.field768 - ((int) ((float) arg2 / class235.field4060));
        if (class108.field1900) {
            if (class235.field4069 == null || class235.field4069.field667 != arg0 || class235.field4069.field669 != arg2) {
                class235.field4069 = null;
                class235.field4069 = new class92(arg0, arg2);
            }
            class114.method823(class235.field4069.field2708, arg0, arg2);
            class150.method1024(0, 0, arg0, var8, arg2, var5, -11655, var7, var6);
            class299.method2059(2, 0, arg2, var6, var7, var8, 0, var5, arg0);
            class104.method702(0, var5, var7, var8, arg0, arg2, 0, 27789, var6);
            class235.field4069.method316(arg3, arg1);
        } else {
            class150.method1024(arg1, arg3, arg3 + arg0, var8, arg1 + arg2, var5, -11655, var7, var6);
            class299.method2059(2, arg1, arg1 + arg2, var6, var7, var8, arg3, var5, arg0 + arg3);
            class104.method702(arg3, var5, var7, var8, arg0 + arg3, arg1 + arg2, arg1, 27789, var6);
        }
        if (arg4 > -38) {
            method1186((byte) -43);
        }
        if (class48.field867 > 0) {
            class48.field867--;
        }
        if (!class186.field3257) {
            return;
        }
        int var9 = arg1 + arg2 - 8;
        int var10 = arg3 - (5 - arg0);
        class249.field4385.method962(class142.method989(new class229[] { client.field4471, class84.method607(127, class281.field4818) }, -30), var10, var9, 16776960, -1);
        int var17 = var9 - 15;
        Runtime var11 = Runtime.getRuntime();
        int var12 = 16776960;
        int var13 = (int) ((var11.totalMemory() - var11.freeMemory()) / 1024L);
        if (var13 > 65536) {
            var12 = 16711680;
        }
        class249.field4385.method962(class142.method989(new class229[] { class213.field3661, class84.method607(-58, var13), class100.field1761 }, -65), var10, var17, var12, -1);
        var9 = var17 - 15;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[B)[B", line = 116)
    public final byte[] method1185(int arg0, byte[] arg1) {
        if (this.field3055 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field3051 / (long) this.field3047) + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var8 = arg1[var7];
                int[] var9 = this.field3055[var6];
                for (int var10 = 0; var10 < 14; var10++) {
                    var5[var4 + var10] += var9[var10] * var8;
                }
                int var11 = this.field3051 + var6;
                int var12 = var11 / this.field3047;
                var4 += var12;
                var6 = var11 - this.field3047 * var12;
            }
            arg1 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var5[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg1[var13] = -128;
                } else if (var14 <= 127) {
                    arg1[var13] = (byte) var14;
                } else {
                    arg1[var13] = 127;
                }
            }
        }
        if (arg0 != 0) {
            method1188((byte) 0);
        }
        field3048++;
        return arg1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 195)
    public static void method1186(byte arg0) {
        if (arg0 != -100) {
            field3057 = (class229) null;
        }
        field3049 = null;
        field3053 = null;
        field3057 = null;
        field3050 = null;
        field3059 = null;
        field3056 = null;
        field3060 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)I", line = 213)
    public final int method1187(int arg0, int arg1) {
        if (this.field3055 != null) {
            arg1 = (int) ((long) this.field3051 * (long) arg1 / (long) this.field3047);
        }
        if (arg0 != 3062) {
            field3056 = (class229) null;
        }
        field3054++;
        return arg1;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V", line = 233)
    public static final void method1188(byte arg0) {
        field3052++;
        class59.field1029 = 0;
        int var1 = (class301.field5124.field2028 >> 7) + class213.field3649;
        int var2 = (class301.field5124.field1983 >> 7) + class258.field4503;
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class59.field1029 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class59.field1029 = 1;
        }
        if (arg0 != -105) {
            method1188((byte) 127);
        }
        if (class59.field1029 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class59.field1029 = 0;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(II)V", line = 279)
    public class175(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class323.method2172(arg0, arg1, (byte) -17);
            int var4 = arg1 / var3;
            this.field3051 = var4;
            int var5 = arg0 / var3;
            this.field3047 = var5;
            this.field3055 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field3055[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                double var12 = (double) var4 / (double) var5;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var11 > var10) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (-1.0E-4D > var16 || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)I", line = 354)
    public final int method1189(int arg0, int arg1) {
        if (this.field3055 != null) {
            arg0 = (int) ((long) this.field3051 * (long) arg0 / (long) this.field3047) + 6;
        }
        field3061++;
        if (arg1 != 6) {
            this.method1189(-67, 0);
        }
        return arg0;
    }
}
