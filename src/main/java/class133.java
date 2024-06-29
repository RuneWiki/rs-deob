import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class133 extends class288 {

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "[Lnc;")
    public class243[] field1930 = new class243[5];

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public int field1919 = 0;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "[I")
    public int[] field1941 = new int[5];

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
    public int field1937;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public int field1924;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
    public int field1938;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public int field1915;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
    public static int field1939 = 0;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "Lbh;")
    public static class234 field1933 = new class234();

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
    public static int field1942 = 0;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    public static int field1944 = 0;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "Ljava/lang/String;")
    public static String field1945 = null;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public int field1913;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public int field1916;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public int field1922;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "I")
    public int field1932;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
    public int field1934;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "Lkf;")
    public class118 field1927;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "Lab;")
    public class133 field1936;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "Lsc;")
    public class157 field1935;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "Lcf;")
    public class163 field1920;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Ldf;")
    public class245 field1918;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Lld;")
    public class256 field1914;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "Lfk;")
    public class50 field1917;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "Z")
    public boolean field1923;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "Z")
    public boolean field1926;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "Z")
    public boolean field1931;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "[[[Lab;")
    public static class133[][][] field1943;

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(III)V")
    public class133(int arg0, int arg1, int arg2) {
        this.field1937 = arg1;
        this.field1924 = arg2;
        this.field1915 = this.field1938 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
    public static void method865(int arg0) {
        field1933 = null;
        field1945 = null;
        field1943 = null;
        int var1 = -98 % ((-arg0 - 25) / 43);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method866(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class272.field3985[arg0][var8][var14] == -class158.field2285) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class290.field4536[arg0][arg1][arg3] + arg5;
            if (!class241.method1570(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class241.method1570(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class241.method1570(var9, var11, var13)) {
                return false;
            } else if (class241.method1570(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class152.method996(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class241.method1570(var6 + 1, class290.field4536[arg0][arg1][arg3] + arg5, var7 + 1) && class241.method1570(var6 + 128 - 1, class290.field4536[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class241.method1570(var6 + 128 - 1, class290.field4536[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class241.method1570(var6 + 1, class290.field4536[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZI)Z")
    public static final boolean method867(boolean arg0, int arg1) {
        byte var2 = 0;
        byte var3 = 0;
        field1928++;
        if (class203.field2888 == null) {
            if (class276.field4204 == null) {
                class203.field2888 = new class187(512, 512);
            } else {
                class203.field2888 = (class187) class276.field4204;
            }
            int[] var4 = class203.field2888.field2691;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < (103 - var3); var7++) {
                int var21 = (var3 + 103 - var7) * 512 * 4 + 24628;
                for (int var22 = var2 + 1; var22 < 104 - var2 - 1; var22++) {
                    if ((class241.field3507[arg1][var22][var7] & 0x18) == 0) {
                        class127.method831(var4, var21, 512, arg1, var22, var7);
                    }
                    if (arg1 < 3 && (class241.field3507[arg1 + 1][var22][var7] & 0x8) != 0) {
                        class127.method831(var4, var21, 512, arg1 + 1, var22, var7);
                    }
                    var21 += 4;
                }
            }
            class19.field236 = 0;
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var9 = 0; var9 < 104; var9++) {
                    long var10 = class268.method1719(class199.field2833, var2 + var8, var9 - -var3);
                    if (var10 != 0L) {
                        class273 var12 = class164.method1081(0, (int) (var10 >>> 32) & Integer.MAX_VALUE);
                        int var13 = var12.field4000;
                        if (var12.field3991 != null) {
                            for (int var14 = 0; var14 < var12.field3991.length; var14++) {
                                if (var12.field3991[var14] != -1) {
                                    class273 var15 = class164.method1081(0, var12.field3991[var14]);
                                    if (var15.field4000 >= 0) {
                                        var13 = var15.field4000;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var13 >= 0) {
                            int var16 = var3 + var9;
                            int var17 = var2 + var8;
                            if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                                int[][] var18 = class127.field1825[class199.field2833].field1988;
                                for (int var19 = 0; var19 < 10; var19++) {
                                    int var20 = (int) (Math.random() * 4.0D);
                                    if (var20 == 0 && var17 > 0 && (var8 - 3) < var17 && (var18[var17 - 1][var16] & 0x2C0108) == 0) {
                                        var17--;
                                    }
                                    if (var20 == 1 && var17 < 103 && var8 + 3 > var17 && (var18[var17 + 1][var16] & 0x2C0180) == 0) {
                                        var17++;
                                    }
                                    if (var20 == 2 && var16 > 0 && var16 > (var9 - 3) && (var18[var17][var16 - 1] & 0x2C0102) == 0) {
                                        var16--;
                                    }
                                    if (var20 == 3 && var16 < 103 && var16 < var9 + 3 && (var18[var17][var16 + 1] & 0x2C0120) == 0) {
                                        var16++;
                                    }
                                }
                            }
                            class112.field1506[class19.field236] = var12.field4012;
                            class104.field1418[class19.field236] = var17 - var2;
                            class20.field248[class19.field236] = var16 - var3;
                            class19.field236++;
                        }
                    }
                }
            }
        }
        class203.field2888.method1218();
        if (arg0) {
            method868(21, -61, 70, -14, 55, (class82) null, -109, 10);
        }
        int var23 = (((int) (Math.random() * 20.0D)) + 238) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 + -10 << 16) - 10;
        int var24 = 238 - (10 - ((int) (Math.random() * 20.0D))) << 16;
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class241.field3507[arg1][var2 + var26][var25 + var3] & 0x18) == 0 && !class169.method1109(var23, arg1, -55, var24, var2, var26, var25, var3)) {
                    class74.field890.method147(-98);
                    return false;
                }
                if (arg1 < 3 && (class241.field3507[arg1 + 1][var2 + var26][var25 + var3] & 0x8) != 0 && !class169.method1109(var23, arg1 + 1, -127, var24, var2, var26, var25, var3)) {
                    class74.field890.method147(-106);
                    return false;
                }
            }
        }
        class276.field4204 = class203.field2888;
        class74.field890.method147(-105);
        class203.field2888 = null;
        return true;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIILwe;II)V")
    public static final void method868(int arg0, int arg1, int arg2, int arg3, int arg4, class82 arg5, int arg6, int arg7) {
        int var8 = arg1 * arg1 + arg4 * arg4;
        field1925++;
        if (var8 > arg7) {
            return;
        }
        int var9 = Math.min(arg5.field1131 / 2, arg5.field1048 / 2);
        if (var8 <= var9 * var9) {
            class152.method999(class14.field180[arg0], arg1, arg4, arg6, (byte) 116, arg2, arg5);
        } else {
            var9 -= 10;
            int var10 = (int) class274.field4085 + class139.field2016 & 0x7FF;
            int var11 = class297.field4697[var10];
            int var12 = var11 * 256 / (class15.field187 + 256);
            int var13 = class297.field4698[var10];
            int var14 = var13 * 256 / (class15.field187 + 256);
            int var15 = arg1 * var12 + arg4 * var14 >> 16;
            int var16 = arg1 * var14 - (arg4 * var12) >> 16;
            double var17 = Math.atan2((double) var15, (double) var16);
            int var19 = (int) ((double) var9 * Math.sin(var17));
            int var20 = (int) ((double) var9 * Math.cos(var17));
            ((class187) class88.field1188[arg0]).method1220(arg5.field1131 / 2 + arg6 + var19 - 10, arg5.field1048 / 2 + arg2 + -var20 + -10, 20, 20, 15, 15, var17, 256);
        }
        if (arg3 <= 51) {
            method867(true, -127);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lnc;)V")
    public static final void method869(class243 arg0) {
        for (int var1 = arg0.field3540; var1 <= arg0.field3533; var1++) {
            for (int var2 = arg0.field3527; var2 <= arg0.field3532; var2++) {
                class133 var3 = class6.field94[arg0.field3534][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1934; var4++) {
                        if (var3.field1930[var4] == arg0) {
                            var3.field1934--;
                            for (int var5 = var4; var5 < var3.field1934; var5++) {
                                var3.field1930[var5] = var3.field1930[var5 + 1];
                                var3.field1941[var5] = var3.field1941[var5 + 1];
                            }
                            var3.field1930[var3.field1934] = null;
                            break;
                        }
                    }
                    var3.field1919 = 0;
                    for (int var6 = 0; var6 < var3.field1934; var6++) {
                        var3.field1919 |= var3.field1941[var6];
                    }
                }
            }
        }
    }
}
