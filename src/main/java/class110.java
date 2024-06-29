import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class110 extends class154 {

    @OriginalMember(owner = "client!co", name = "y", descriptor = "Len;")
    public class49 field2020 = new class49();

    @OriginalMember(owner = "client!co", name = "E", descriptor = "Lwb;")
    public class175 field2026 = new class175();

    @OriginalMember(owner = "client!co", name = "A", descriptor = "Lak;")
    private class345 field2022;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "I")
    public static int field2013 = 0;

    @OriginalMember(owner = "client!co", name = "t", descriptor = "[I")
    public static int[] field2015 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!co", name = "z", descriptor = "I")
    public static int field2021 = 0;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!co", name = "q", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!co", name = "s", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!co", name = "u", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!co", name = "v", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!co", name = "w", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!co", name = "x", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!co", name = "B", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!co", name = "C", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!co", name = "D", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "()I", line = 4)
    public final int method820() {
        field2016++;
        return 0;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "([IIIZILeh;)V", line = 14)
    private final void method821(int[] arg0, int arg1, int arg2, boolean arg3, int arg4, class189 arg5) {
        field2010++;
        if (arg3) {
            return;
        }
        if ((this.field2022.field5467[arg5.field3202] & 0x4) != 0 && arg5.field3211 < 0) {
            int var7 = this.field2022.field5459[arg5.field3202] / class194.field3261;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field3208) / var7;
                if (var8 > arg4) {
                    arg5.field3208 += arg4 * var7;
                    break;
                }
                arg5.field3207.method827(arg0, arg2, var8);
                arg4 -= var8;
                arg2 += var8;
                arg5.field3208 += var7 * var8 - 1048576;
                int var9 = class194.field3261 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class304 var11 = arg5.field3207;
                if (this.field2022.field5509[arg5.field3202] == 0) {
                    arg5.field3207 = class304.method2187(arg5.field3204, var11.method2208(), var11.method2179(), var11.method2190());
                } else {
                    arg5.field3207 = class304.method2187(arg5.field3204, var11.method2208(), 0, var11.method2190());
                    this.field2022.method2435(arg5.field3201.field693[arg5.field3216] < 0, arg5, 4);
                    arg5.field3207.method2186(var9, var11.method2179());
                }
                if (arg5.field3201.field693[arg5.field3216] < 0) {
                    arg5.field3207.method2177(-1);
                }
                var11.method2174(var9);
                var11.method827(arg0, arg2, arg1 - arg2);
                if (var11.method2189()) {
                    this.field2026.method1242(var11);
                }
            }
        }
        arg5.field3207.method827(arg0, arg2, arg4);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BZ)V", line = 81)
    public static final void method822(byte arg0, boolean arg1) {
        field2014++;
        byte var2;
        byte[][] var3;
        if (class241.field4016 && arg1) {
            var2 = 1;
            var3 = class148.field2516;
        } else {
            var2 = 4;
            var3 = class46.field920;
        }
        if (arg0 != 87) {
            field2021 = -4;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class119.method865(-4097);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class71.field1308[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3321058) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class127.field2221.length; var13++) {
                                if (class127.field2221[var13] == var12 && var3[var13] != null) {
                                    class148.method1061(var8, (var10 & 0x7) * 8, var9, arg1, -11286, var3[var13], var4, (var11 & 0x7) * 8, class23.field576, var5 * 8, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 165)
    public static final boolean method823(String arg0, int arg1) {
        field2024++;
        if (arg1 >= -79) {
            field2013 = 16;
        }
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class317.field5171; var2++) {
            if (arg0.equalsIgnoreCase(class340.field5382[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class295.field4821[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(B)V", line = 204)
    public static void method824(byte arg0) {
        if (arg0 <= 53) {
            field2021 = -103;
        }
        field2015 = null;
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "()Lmh;", line = 214)
    public final class154 method825() {
        field2017++;
        class189 var1;
        do {
            var1 = (class189) this.field2020.method439(-28512);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3207 == null);
        return var1.field3207;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IILeh;)V", line = 237)
    private final void method826(int arg0, int arg1, class189 arg2) {
        if ((this.field2022.field5467[arg2.field3202] & 0x4) != 0 && arg2.field3211 < 0) {
            int var4 = this.field2022.field5459[arg2.field3202] / class194.field3261;
            int var5 = (var4 + 1048575 - arg2.field3208) / var4;
            arg2.field3208 = arg1 * var4 + arg2.field3208 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field2022.field5509[arg2.field3202] == 0) {
                    arg2.field3207 = class304.method2187(arg2.field3204, arg2.field3207.method2208(), arg2.field3207.method2179(), arg2.field3207.method2190());
                } else {
                    arg2.field3207 = class304.method2187(arg2.field3204, arg2.field3207.method2208(), 0, arg2.field3207.method2190());
                    this.field2022.method2435(arg2.field3201.field693[arg2.field3216] < 0, arg2, 4);
                }
                if (arg2.field3201.field693[arg2.field3216] < 0) {
                    arg2.field3207.method2177(-1);
                }
                arg1 = arg2.field3208 / var4;
            }
        }
        field2018++;
        arg2.field3207.method828(arg1);
        if (arg0 != 14478) {
            field2021 = -31;
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lak;)V", line = 396)
    public class110(class345 arg0) {
        this.field2022 = arg0;
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "([III)V", line = 285)
    public final void method827(int[] arg0, int arg1, int arg2) {
        field2011++;
        this.field2026.method827(arg0, arg1, arg2);
        for (class189 var4 = (class189) this.field2020.method431(0); var4 != null; var4 = (class189) this.field2020.method439(-28512)) {
            if (!this.field2022.method2444(var4, 127)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3194) {
                        this.method821(arg0, var5 + var6, var5, false, var6, var4);
                        var4.field3194 -= var6;
                        break;
                    }
                    this.method821(arg0, var5 + var6, var5, false, var4.field3194, var4);
                    var5 += var4.field3194;
                    var6 -= var4.field3194;
                } while (!this.field2022.method2440(var4, (byte) 95, arg0, var5, var6));
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V", line = 324)
    public final void method828(int arg0) {
        this.field2026.method828(arg0);
        for (class189 var2 = (class189) this.field2020.method431(0); var2 != null; var2 = (class189) this.field2020.method439(-28512)) {
            if (!this.field2022.method2444(var2, 6)) {
                int var3 = arg0;
                do {
                    if (var2.field3194 >= var3) {
                        this.method826(14478, var3, var2);
                        var2.field3194 -= var3;
                        break;
                    }
                    this.method826(14478, var2.field3194, var2);
                    var3 -= var2.field3194;
                } while (!this.field2022.method2440(var2, (byte) -89, (int[]) null, 0, var3));
            }
        }
        field2012++;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "()Lmh;", line = 360)
    public final class154 method829() {
        field2023++;
        class189 var1 = (class189) this.field2020.method431(0);
        if (var1 == null) {
            return null;
        } else if (var1.field3207 == null) {
            return this.method825();
        } else {
            return var1.field3207;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V", line = 385)
    public static final void method830(int arg0, int arg1) {
        field2025++;
        if (arg1 != -21998) {
            method830(63, -80);
        }
        class199 var2 = class173.method1231(false, 8, arg0);
        var2.method1358(-1);
    }
}
