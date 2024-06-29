import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class135 {

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "Lqo;")
    private static class141 field1956 = new class141(16);

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "[S")
    private static short[] field1959 = new short[1];

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "[B")
    private static byte[] field1962 = new byte[1];

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
    public static int field1960 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "I")
    public static int field1965 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!gp", name = "s", descriptor = "Lvr;")
    public static class306 field1967 = new class306();

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "F")
    public static float field1961;

    @OriginalMember(owner = "client!gp", name = "r", descriptor = "F")
    public static float field1966;

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!gp", name = "t", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!gp", name = "u", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!gp", name = "A", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!gp", name = "B", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!gp", name = "K", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!gp", name = "L", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!gp", name = "M", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!gp", name = "N", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!gp", name = "O", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!gp", name = "G", descriptor = "Lqo;")
    private static class141 field1981;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "Lbl;")
    private static class262 field1955;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "Lfd;")
    public static class313 field1951;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "Lrt;")
    public static class316 field1952;

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "Lvq;")
    public static class338 field1963;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "Lfb;")
    public static class365 field1954;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "Lrv;")
    public static class41 field1950;

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "Lns;")
    public static class438 field1957;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "Lqq;")
    public static class52 field1953;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "Lhs;")
    private static class94 field1949;

    @OriginalMember(owner = "client!gp", name = "v", descriptor = "[B")
    private static byte[] field1970;

    @OriginalMember(owner = "client!gp", name = "y", descriptor = "[B")
    private static byte[] field1973;

    @OriginalMember(owner = "client!gp", name = "E", descriptor = "[B")
    private static byte[] field1979;

    @OriginalMember(owner = "client!gp", name = "H", descriptor = "[B")
    private static byte[] field1982;

    @OriginalMember(owner = "client!gp", name = "J", descriptor = "[B")
    private static byte[] field1984;

    @OriginalMember(owner = "client!gp", name = "C", descriptor = "[I")
    private static int[] field1977;

    @OriginalMember(owner = "client!gp", name = "D", descriptor = "[S")
    private static short[] field1978;

    @OriginalMember(owner = "client!gp", name = "I", descriptor = "[S")
    private static short[] field1983;

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "[[[B")
    public static byte[][][] field1958;

    @OriginalMember(owner = "client!gp", name = "F", descriptor = "[[[Lbr;")
    private static class380[][][] field1980;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)Lrt;")
    public static final class316 method875(int arg0, int arg1) {
        for (class316 var2 = (class316) field1956.method948(106); var2 != null; var2 = (class316) field1956.method938(-118)) {
            if (var2.field4830 && var2.method2045(arg0, 12800, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lns;Lhs;Lbl;Lfd;Lqq;Lrv;Lfb;)V")
    public static final void method876(class438 arg0, class94 arg1, class262 arg2, class313 arg3, class52 arg4, class41 arg5, class365 arg6) {
        field1957 = arg0;
        field1949 = arg1;
        field1955 = arg2;
        field1951 = arg3;
        field1953 = arg4;
        field1950 = arg5;
        field1954 = arg6;
        field1956.method937(0);
        int var7 = field1957.method2652("details", 86);
        int[] var8 = field1957.method2641(var7, 0);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class316 var10 = class444.method2675(var8[var9], var7, field1957, 0);
            field1956.method940((long) var10.field4833, -97, var10);
        }
        class220.method1492((byte) -125, false, true);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "()V")
    public static final void method877() {
        field1973 = new byte[field1986 * field1968];
        field1979 = new byte[field1986 * field1968];
        field1970 = new byte[field1986 * field1968];
        field1983 = new short[field1986 * field1968];
        field1984 = new byte[field1986 * field1968];
        field1981 = new class141(1024);
        field1980 = new class380[3][field1986 >> 6][field1968 >> 6];
        field1977 = new int[field1949.field1362 + 1];
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lqa;)Lvr;")
    public static final class306 method878(class496 arg0) {
        int var1 = field1975 - field1988;
        int var2 = field1972 - field1989;
        int var3 = (field1971 - field1987 << 16) / var1;
        int var4 = (field1976 - field1985 << 16) / var2;
        return method879(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lqa;IIII)Lvr;")
    private static final class306 method879(class496 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class5 var5 = (class5) field1967.method1970(64); var5 != null; var5 = (class5) field1967.method1960(24)) {
            method880(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field1967;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lqa;Lps;IIII)V")
    private static final void method880(class496 arg0, class5 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field67 = ((arg1.field69 - field1988) * arg2 + arg4 >> 16) + field1987;
        arg1.field72 = field1976 - ((arg1.field66 - field1989) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lm;III)I")
    private static final int method881(class373 arg0, int arg1, int arg2, int arg3) {
        class95 var4 = field1949.method657(1, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field1385;
        if (var5 >= 0 && arg0.method1558(var5, (byte) 105).field3665) {
            var5 = -1;
        }
        int var9;
        if (var4.field1374 >= 0) {
            int var6 = var4.field1374;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class88.field1208[class500.method2987(class296.method1904(true, var8, 96), 6755) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class88.field1208[class500.method2987(class296.method1904(true, arg0.method1558(var5, (byte) 127).field3668, 96), 6755) & 0xFFFF] | 0xFF000000;
        } else if (var4.field1375 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field1375;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class88.field1208[class500.method2987(class296.method1904(true, var12, 96), 6755) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(II)Lkn;")
    public static final class233 method882(int arg0, int arg1) {
        class233 var2 = new class233();
        for (class316 var3 = (class316) field1956.method948(115); var3 != null; var3 = (class316) field1956.method938(86)) {
            if (var3.field4830 && var3.method2045(arg0, 12800, arg1)) {
                var2.method1582(var3, -1);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lqa;IIIIIII[S[BZ)V")
    private static final void method883(class496 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method1112(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field1977[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method1112(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class430.method2576(arg1, field1964, arg3, arg0, arg2, var11, arg4, arg5, var12, false, arg7 >> 6 & 0x3, field1977[arg6], field1958);
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var14;
        if (arg3 == 1) {
            var14 = arg1;
        } else {
            var14 = arg1 + arg3 - 1;
        }
        int var15;
        if (arg4 == 1) {
            var15 = arg2;
        } else {
            var15 = arg2 + arg4 - 1;
        }
        for (int var16 = 0; var16 < arg8.length; var16++) {
            int var17 = arg9[var16] & 0x3F;
            if (var17 == 0 || var17 == 2 || var17 == 3 || var17 == 9) {
                class130 var18 = field1951.method2031(125, arg8[var16] & 0xFFFF);
                if (var18.field1838 == -1) {
                    int var19 = -3355444;
                    if (var18.field1886 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method1079(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1122(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1079(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method1122(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method1079(arg1, arg2, arg4, -1, 0);
                            arg0.method1122(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1079(var14, arg2, arg4, -1, 0);
                            arg0.method1122(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1079(var14, arg2, arg4, -1, 0);
                            arg0.method1122(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method1079(arg1, arg2, arg4, -1, 0);
                            arg0.method1122(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method1122(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1122(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1122(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method1122(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method1122(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method1122(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "()V")
    public static void method884() {
        field1949 = null;
        field1955 = null;
        field1951 = null;
        field1953 = null;
        field1950 = null;
        field1954 = null;
        field1952 = null;
        field1957 = null;
        field1956 = null;
        field1958 = null;
        field1959 = null;
        field1962 = null;
        field1963 = null;
        field1967 = null;
        field1977 = null;
        field1973 = null;
        field1982 = null;
        field1978 = null;
        field1979 = null;
        field1970 = null;
        field1983 = null;
        field1984 = null;
        field1981 = null;
        field1980 = null;
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "()V")
    private static final void method885() {
        for (int var0 = 0; var0 < field1986; var0++) {
            for (int var11 = 0; var11 < field1968; var11++) {
                int var12 = field1983[field1986 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class385 var13 = (class385) field1981.method943((long) (var0 << 16 | var11), -1);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field5873.length; var14++) {
                                class130 var15 = field1951.method2031(8, var13.field5873[var14] & 0xFFFF);
                                int var16 = var15.field1903;
                                if (var15.field1823 != null) {
                                    class130 var17 = var15.method832((byte) -123, field1954);
                                    if (var17 != null) {
                                        var16 = var17.field1903;
                                    }
                                }
                                if (var16 != -1) {
                                    class5 var18 = new class5(var16);
                                    var18.field69 = var0;
                                    var18.field66 = var11;
                                    field1967.method1958(var18, 0);
                                }
                            }
                        }
                    } else {
                        class130 var19 = field1951.method2031(121, var12 - 1);
                        int var20 = var19.field1903;
                        if (var19.field1823 != null) {
                            class130 var21 = var19.method832((byte) -121, field1954);
                            if (var21 != null) {
                                var20 = var21.field1903;
                            }
                        }
                        if (var20 != -1) {
                            class5 var22 = new class5(var20);
                            var22.field69 = var0;
                            var22.field66 = var11;
                            field1967.method1958(var22, 0);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field1980[0].length; var2++) {
                for (int var3 = 0; var3 < field1980[0][0].length; var3++) {
                    class380 var4 = field1980[var1][var2][var3];
                    if (var4 != null) {
                        for (class280 var5 = (class280) var4.method2358((byte) 54); var5 != null; var5 = (class280) var4.method2363(31844)) {
                            if (var5.field3859 != null) {
                                for (int var6 = 0; var6 < var5.field3859.length; var6++) {
                                    class130 var7 = field1951.method2031(127, var5.field3859[var6] & 0xFFFF);
                                    int var8 = var7.field1903;
                                    if (var7.field1823 != null) {
                                        class130 var9 = var7.method832((byte) -123, field1954);
                                        if (var9 != null) {
                                            var8 = var9.field1903;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class5 var10 = new class5(var8);
                                        var10.field69 = ((field1969 >> 6) + var2) * 64 + var5.field3857 - field1969;
                                        var10.field66 = ((field1974 >> 6) + var3) * 64 + var5.field3860 - field1974;
                                        field1967.method1958(var10, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)Lrt;")
    public static final class316 method886(int arg0) {
        return (class316) field1956.method943((long) arg0, -1);
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V")
    public static final void method887(int arg0) {
        field1952 = (class316) field1956.method943((long) arg0, -1);
    }

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "()V")
    public static final void method888() {
        field1973 = null;
        field1982 = null;
        field1978 = null;
        field1979 = null;
        field1970 = null;
        field1983 = null;
        field1984 = null;
        field1981 = null;
        field1980 = null;
        field1977 = null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method889(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1988 = arg0 - field1969;
        field1972 = arg1 - field1974;
        field1975 = arg2 - field1969;
        field1989 = arg3 - field1974;
        field1987 = arg4;
        field1985 = arg5;
        field1971 = arg6;
        field1976 = arg7;
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(Lqa;IIII)V")
    private static final void method890(class496 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field1975 - field1988;
        int var6 = field1972 - field1989;
        if (field1975 < field1986) {
            var5++;
        }
        if (field1972 < field1968) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field1987;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field1987;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field1988 + var7;
                if (var52 >= 0 && var52 < field1986) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field1976 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field1976 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field1989 + var53;
                            int var58 = field1986 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field1968) {
                                var59 = (field1982[var58] & 0xFF) << 16 | field1978[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field1979[var58] & 0xFF;
                                var61 = field1983[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field1952.field4821 != -1) {
                                    var62 = field1952.field4821 | 0xFF000000;
                                } else if ((field1988 + var7 & 0x4) == (field1972 + var53 & 0x4)) {
                                    var62 = field1977[field1949.field1366 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method1112(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method883(arg0, var49, var54, var51, var56, var59, var60, field1970[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class385 var63 = (class385) field1981.method943((long) (var52 << 16 | var57), -1);
                                if (var63 != null) {
                                    method883(arg0, var49, var54, var51, var56, var59, var60, field1970[var58], var63.field5873, var63.field5872, true);
                                }
                            } else {
                                field1959[0] = (short) (var61 - 1);
                                field1962[0] = field1984[var58];
                                method883(arg0, var49, var54, var51, var56, var59, var60, field1970[var58], field1959, field1962, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field1976 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field1976 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field1952.field4821 != -1) {
                            var68 = field1952.field4821 | 0xFF000000;
                        } else if ((field1988 + var7 & 0x4) == (field1972 + var64 & 0x4)) {
                            var68 = field1977[field1949.field1366 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method1112(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field1987;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field1987;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field1988 + var8;
                if (var41 >= 0 && var41 < field1986) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field1976 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field1976 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field1989 + var42;
                            if (var46 >= 0 && var46 < field1968) {
                                int var47 = field1983[field1986 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method892(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class385 var48 = (class385) field1981.method943((long) (var41 << 16 | var46), -1);
                                    if (var48 != null) {
                                        method892(arg0, var38, var43, var40, var45, var48.field5873, var48.field5872);
                                    }
                                } else {
                                    field1959[0] = (short) (var47 - 1);
                                    field1962[0] = field1984[field1986 * var46 + var41];
                                    method892(arg0, var38, var43, var40, var45, field1959, field1962);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field1988 >> 6;
        int var10 = field1989 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field1975 >> 6;
        int var12 = field1972 >> 6;
        if (var11 >= field1980[0].length) {
            var11 = field1980[0].length - 1;
        }
        if (var12 >= field1980[0][0].length) {
            var12 = field1980[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class380 var28 = field1980[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field1969 >> 6) + var14) * 64;
                        int var30 = ((field1974 >> 6) + var27) * 64;
                        for (class280 var31 = (class280) var28.method2358((byte) 89); var31 != null; var31 = (class280) var28.method2363(31844)) {
                            int var32 = var31.field3857 + var29 - field1969 - field1988;
                            int var33 = var31.field3860 + var30 - field1974 - field1989;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field1987;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field1987;
                            int var36 = field1976 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field1976 - (arg2 * var33 + arg4 >> 16);
                            method883(arg0, var34, var36, var35 - var34, var37 - var36, var31.field3854, var31.field3855 & 0xFF, var31.field3858, var31.field3859, var31.field3856, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class380 var17 = field1980[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field1969 >> 6) + var15) * 64;
                        int var19 = ((field1974 >> 6) + var16) * 64;
                        for (class280 var20 = (class280) var17.method2358((byte) 78); var20 != null; var20 = (class280) var17.method2363(31844)) {
                            int var21 = var20.field3857 + var18 - field1969 - field1988;
                            int var22 = var20.field3860 + var19 - field1974 - field1989;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field1987;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field1987;
                            int var25 = field1976 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field1976 - (arg2 * var22 + arg4 >> 16);
                            method892(arg0, var23, var25, var24 - var23, var26 - var25, var20.field3859, var20.field3856);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "()V")
    public static final void method891() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field1963.field5354; var1++) {
            boolean var2 = field1952.method2051(0, field1963.field5353[var1] >> 14 & 0x3FFF, field1963.field5353[var1] >> 28 & 0x3, field1963.field5353[var1] & 0x3FFF, var0);
            if (var2) {
                class5 var3 = new class5(field1963.field5358[var1]);
                var3.field69 = var0[1] - field1969;
                var3.field66 = var0[2] - field1974;
                field1967.method1958(var3, 0);
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lqa;IIII[S[B)V")
    private static final void method892(class496 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class130 var8 = field1951.method2031(127, arg5[var7] & 0xFFFF);
            int var9 = var8.field1838;
            if (var9 != -1) {
                class498 var10 = field1950.method329(var9, -23316);
                class191 var11 = var10.method2964(-96, arg0, var8.field1845 ? var8.field1825 : false, var8.field1880 ? arg6[var7] >> 6 & 0x3 : 0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method209() >> 2;
                    int var13 = arg4 * var11.method219() >> 2;
                    if (var10.field7268) {
                        int var14 = var8.field1843;
                        int var15 = var8.field1898;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field7270 == 0) {
                            var11.method1339(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method34(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field7270 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lqa;Ltl;IIII[I[I)V")
    private static final void method893(class496 arg0, class91 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method618((byte) 100);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method618((byte) 100);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field1973[field1986 * arg5 + arg4] = (byte) var11;
                    field1979[field1986 * arg5 + arg4] = 0;
                } else {
                    field1979[field1986 * arg5 + arg4] = (byte) var11;
                    field1970[field1986 * arg5 + arg4] = 0;
                    field1973[field1986 * arg5 + arg4] = arg1.method619((byte) -23);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method618((byte) 100);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method618((byte) 100);
                var18 = arg1.method618((byte) 100);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method618((byte) 100);
            }
            if (var15 == 0) {
                field1973[field1986 * arg5 + arg4] = (byte) var16;
                field1979[field1986 * arg5 + arg4] = (byte) var17;
                field1970[field1986 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field1983[field1986 * arg5 + arg4] = (short) (arg1.method631(10494) + 1);
                    field1984[field1986 * arg5 + arg4] = arg1.method619((byte) -23);
                } else if (var19 > 1) {
                    field1983[field1986 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method631(10494);
                        var21[var22] = arg1.method619((byte) -23);
                    }
                    field1981.method940((long) (arg4 << 16 | arg5), -115, new class385(var20, var21));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method631(10494);
                        var24[var25] = arg1.method619((byte) -23);
                    }
                }
                if (field1980[var15 - 1][arg2 - (field1969 >> 6)][arg3 - (field1974 >> 6)] == null) {
                    field1980[var15 - 1][arg2 - (field1969 >> 6)][arg3 - (field1974 >> 6)] = new class380();
                }
                class280 var26 = new class280(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field1980[var15 - 1][arg2 - (field1969 >> 6)][arg3 - (field1974 >> 6)].method2353(var26, -9798);
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "([B[B[SII)V")
    private static final void method894(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field1968];
        int[] var6 = new int[field1968];
        int[] var7 = new int[field1968];
        int[] var8 = new int[field1968];
        int[] var9 = new int[field1968];
        for (int var10 = -5; var10 < field1986; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field1968; var13++) {
                int var10002;
                if (var11 < field1986) {
                    int var28 = arg0[field1986 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class362 var29 = field1955.method1689(var28 - 1, -96);
                        var5[var13] += var29.field5614;
                        var6[var13] += var29.field5603;
                        var7[var13] += var29.field5612;
                        var8[var13] += var29.field5602;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field1986 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class362 var31 = field1955.method1689(var30 - 1, 118);
                        var5[var13] -= var31.field5614;
                        var6[var13] -= var31.field5603;
                        var7[var13] -= var31.field5612;
                        var8[var13] -= var31.field5602;
                        var10002 = var9[var13]--;
                    }
                }
            }
            if (var10 >= 0) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                for (int var19 = -5; var19 < field1968; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field1968) {
                        var14 += var5[var20];
                        var15 += var6[var20];
                        var16 += var7[var20];
                        var17 += var8[var20];
                        var18 += var9[var20];
                    }
                    int var21 = var19 - 5;
                    if (var21 >= 0) {
                        var14 -= var5[var21];
                        var15 -= var6[var21];
                        var16 -= var7[var21];
                        var17 -= var8[var21];
                        var18 -= var9[var21];
                    }
                    if (var19 >= 0 && var18 > 0) {
                        if ((arg0[field1986 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field1986 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class91.method624(true, var15 / var18, var14 * 256 / var17, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field1986 * var19 + var10;
                            int var27 = class88.field1208[class500.method2987(class449.method2713(var25, 96, false), 6755) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lm;II)V")
    public static final void method895(class373 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field1949.field1362; var3++) {
            field1977[var3 + 1] = method881(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lqa;II)V")
    public static final void method896(class496 arg0, int arg1, int arg2) {
        class91 var3 = new class91(field1957.method2627("area", field1952.field4831, 0));
        int var4 = var3.method618((byte) 100);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method618((byte) 100);
        }
        int var7 = var3.method618((byte) 100);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method618((byte) 100);
        }
        while (true) {
            while (var3.field1292 < var3.field1277.length) {
                if (var3.method618((byte) 100) == 0) {
                    int var22 = var3.method618((byte) 100);
                    int var23 = var3.method618((byte) 100);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field1969;
                            int var27 = var23 * 64 + var25 - field1974;
                            method893(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method618((byte) 100);
                    int var29 = var3.method618((byte) 100);
                    int var30 = var3.method618((byte) 100);
                    int var31 = var3.method618((byte) 100);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field1969;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field1974;
                            method893(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field1982 = new byte[field1986 * field1968];
            field1978 = new short[field1986 * field1968];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field1986 * field1968];
                for (int var13 = 0; var13 < field1980[var11].length; var13++) {
                    for (int var19 = 0; var19 < field1980[var11][0].length; var19++) {
                        class380 var20 = field1980[var11][var13][var19];
                        if (var20 != null) {
                            for (class280 var21 = (class280) var20.method2358((byte) 53); var21 != null; var21 = (class280) var20.method2363(31844)) {
                                var12[(var19 * 64 + var21.field3860) * field1986 + var13 * 64 + var21.field3857] = (byte) var21.field3854;
                            }
                        }
                    }
                }
                method894(var12, field1982, field1978, arg1, arg2);
                for (int var14 = 0; var14 < field1980[var11].length; var14++) {
                    for (int var15 = 0; var15 < field1980[var11][0].length; var15++) {
                        class380 var16 = field1980[var11][var14][var15];
                        if (var16 != null) {
                            for (class280 var17 = (class280) var16.method2358((byte) 104); var17 != null; var17 = (class280) var16.method2363(31844)) {
                                int var18 = (var15 * 64 + var17.field3860) * field1986 + var14 * 64 + var17.field3857;
                                var17.field3854 = (field1982[var18] & 0xFF) << 16 | field1978[var18] & 0xFFFF;
                                if (var17.field3854 != 0) {
                                    var17.field3854 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method894(field1973, field1982, field1978, arg1, arg2);
            field1973 = null;
            method885();
            return;
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(Lqa;)V")
    public static final void method897(class496 arg0) {
        int var1 = field1975 - field1988;
        int var2 = field1972 - field1989;
        int var3 = (field1971 - field1987 << 16) / var1;
        int var4 = (field1976 - field1985 << 16) / var2;
        method890(arg0, var3, var4, 0, 0);
    }
}
