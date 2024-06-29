import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class291 {

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    private int field4661;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "[Lnb;")
    private class137[] field4666;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Loj;")
    public static class246 field4675 = new class246();

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "[I")
    public static int[] field4678 = new int[50];

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4676 = "M";

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field4679 = 0;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "J")
    private long field4668;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "Lnb;")
    private class137 field4674;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "Lvb;")
    public static class140 field4677;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)I")
    public static final int method1935(int arg0, int arg1) {
        field4663++;
        if (arg1 != -1) {
            method1945(47, -27, -127, -54, false, 40, -18, -60, 59, -105, -41);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static void method1936(byte arg0) {
        if (arg0 <= -3) {
            field4677 = null;
            field4676 = null;
            field4675 = null;
            field4678 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
    public static final String method1937(String[] arg0, int arg1, int arg2, int arg3) {
        field4665++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg0[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg2 + arg3;
            int var6 = 0;
            for (int var7 = arg2; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            if (arg1 > -75) {
                return null;
            }
            for (int var9 = arg2; var9 < var5; var9++) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)Lnb;")
    public final class137 method1938(int arg0) {
        field4672++;
        if (this.field4674 == null) {
            return null;
        }
        if (arg0 >= -14) {
            method1935(-19, -59);
        }
        class137 var2 = this.field4666[(int) (this.field4668 & (long) (this.field4661 - 1))];
        while (this.field4674 != var2) {
            if (this.field4674.field2169 == this.field4668) {
                class137 var3 = this.field4674;
                this.field4674 = this.field4674.field2173;
                return var3;
            }
            this.field4674 = this.field4674.field2173;
        }
        this.field4674 = null;
        return null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lwd;B)Laf;")
    public static final class71 method1939(class162 arg0, byte arg1) {
        int var2 = -21 / ((-arg1 - 33) / 60);
        field4667++;
        return new class71(arg0.method1146(2), arg0.method1146(2), arg0.method1146(2), arg0.method1146(2), arg0.method1137(31155), arg0.method1137(31155), arg0.method1133((byte) 53));
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lnb;IJ)V")
    public final void method1940(class137 arg0, int arg1, long arg2) {
        if (arg0.field2163 != null) {
            arg0.method956(256);
        }
        field4673++;
        class137 var5 = this.field4666[(int) (arg2 & (long) (this.field4661 - 1))];
        arg0.field2163 = var5.field2163;
        if (arg1 != -23353) {
            this.field4674 = null;
        }
        arg0.field2169 = arg2;
        arg0.field2173 = var5;
        arg0.field2163.field2173 = arg0;
        arg0.field2173.field2163 = arg0;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BJ)Lnb;")
    public final class137 method1941(byte arg0, long arg1) {
        field4669++;
        this.field4668 = arg1;
        class137 var4 = this.field4666[(int) ((long) (this.field4661 - 1) & arg1)];
        for (this.field4674 = var4.field2173; this.field4674 != var4; this.field4674 = this.field4674.field2173) {
            if (this.field4674.field2169 == arg1) {
                class137 var5 = this.field4674;
                this.field4674 = this.field4674.field2173;
                return var5;
            }
        }
        if (arg0 >= -9) {
            this.field4666 = null;
        }
        this.field4674 = null;
        return null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLdk;Ldk;Lti;)V")
    public static final void method1942(byte arg0, class251 arg1, class251 arg2, class147 arg3) {
        class46.field772 = arg2;
        class46.field771 = arg3;
        class19.field234 = arg1;
        field4670++;
        if (arg0 <= 120) {
            field4677 = null;
        }
        if (class46.field772 != null) {
            class281.field4491 = class46.field772.method1678((byte) 50, 1);
        }
        if (class19.field234 != null) {
            class146.field2299 = class19.field234.method1678((byte) 105, 1);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)Z")
    public static final boolean method1943(byte arg0, int arg1) {
        field4671++;
        class203 var2 = class298.method1969(arg1, (byte) -44);
        if (var2 == null) {
            return false;
        } else if (class45.field759 == 1 || class45.field759 == 2 || class225.field3652 == 2) {
            class145.field2289 = var2.field3232;
            class60.field979 = var2.field3238;
            if (class225.field3652 != 0) {
                class52.field870 = class60.field979 + 50000;
                class32.field483 = class60.field979 + 40000;
                class245.field3903 = class32.field483;
            }
            return true;
        } else {
            String var3 = "";
            String var4 = "";
            if (class225.field3652 != 0) {
                var4 = ":" + (var2.field3238 + 7000);
            }
            if (class160.field2545 != null) {
                var3 = "/p=" + class160.field2545;
            }
            String var5 = "http://" + var2.field3232 + var4 + "/l=" + class2.field28 + "/a=" + class1.field17 + var3 + "/j" + (class281.field4493 ? "1" : "0") + ",o" + (class211.field3504 ? "1" : "0") + ",a2,m" + (class266.field4275 ? "1" : "0");
            if (arg0 >= -61) {
                method1945(-128, 20, 109, -8, true, 122, -21, 82, -39, 25, 104);
            }
            try {
                class59.field973.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZI)V")
    public static final void method1944(boolean arg0, int arg1) {
        field4664++;
        if (class289.field4636 == arg0) {
            return;
        }
        class289.field4636 = arg0;
        if (arg1 != -1) {
            field4679 = 27;
        }
        class212.method1481((byte) -80);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIZIIIIII)V")
    public static final void method1945(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field4662++;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var27 = 0; var27 < 104; var27++) {
                class193.field3135[var11][var27] = 0;
                class117.field1887[var11][var27] = 99999999;
            }
        }
        class193.field3135[arg3][arg8] = 99;
        class117.field1887[arg3][arg8] = 0;
        int var12 = arg3;
        int var13 = arg8;
        byte var14 = 0;
        class163.field2645[var14] = arg3;
        boolean var15 = false;
        int var16 = 0;
        int var28 = var14 + 1;
        class155.field2425[var14] = arg8;
        int[][] var17 = class131.field2065[class56.field941].field728;
        while (var28 != var16) {
            var13 = class155.field2425[var16];
            var12 = class163.field2645[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg7 == var12 && arg9 == var13) {
                var15 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && class131.field2065[class56.field941].method309(arg9, var12, var13, arg7, arg2 - 1, 1, arg1, -1)) {
                    var15 = true;
                    break;
                }
                if (arg2 < 10 && class131.field2065[class56.field941].method296(arg7, var13, var12, (byte) -94, arg9, 1, arg1, arg2 - 1)) {
                    var15 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg6 != 0 && class131.field2065[class56.field941].method298(arg7, arg0, arg6, 1, var12, arg9, var13, 118, arg10)) {
                var15 = true;
                break;
            }
            int var26 = class117.field1887[var12][var13] + 1;
            if (var12 > 0 && class193.field3135[var12 - 1][var13] == 0 && (var17[var12 - 1][var13] & 0x2C0108) == 0) {
                class163.field2645[var28] = var12 - 1;
                class155.field2425[var28] = var13;
                var28 = var28 + 1 & 0xFFF;
                class193.field3135[var12 - 1][var13] = 2;
                class117.field1887[var12 - 1][var13] = var26;
            }
            if (var12 < 103 && class193.field3135[var12 + 1][var13] == 0 && (var17[var12 + 1][var13] & 0x2C0180) == 0) {
                class163.field2645[var28] = var12 + 1;
                class155.field2425[var28] = var13;
                class193.field3135[var12 + 1][var13] = 8;
                class117.field1887[var12 + 1][var13] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var13 > 0 && class193.field3135[var12][var13 - 1] == 0 && (var17[var12][var13 - 1] & 0x2C0102) == 0) {
                class163.field2645[var28] = var12;
                class155.field2425[var28] = var13 - 1;
                var28 = var28 + 1 & 0xFFF;
                class193.field3135[var12][var13 - 1] = 1;
                class117.field1887[var12][var13 - 1] = var26;
            }
            if (var13 < 103 && class193.field3135[var12][var13 + 1] == 0 && (var17[var12][var13 + 1] & 0x2C0120) == 0) {
                class163.field2645[var28] = var12;
                class155.field2425[var28] = var13 + 1;
                class193.field3135[var12][var13 + 1] = 4;
                class117.field1887[var12][var13 + 1] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var12 > 0 && var13 > 0 && class193.field3135[var12 - 1][var13 - 1] == 0 && (var17[var12 - 1][var13 - 1] & 0x2C010E) == 0 && (var17[var12 - 1][var13] & 0x2C0108) == 0 && (var17[var12][var13 - 1] & 0x2C0102) == 0) {
                class163.field2645[var28] = var12 - 1;
                class155.field2425[var28] = var13 - 1;
                var28 = var28 + 1 & 0xFFF;
                class193.field3135[var12 - 1][var13 - 1] = 3;
                class117.field1887[var12 - 1][var13 - 1] = var26;
            }
            if (var12 < 103 && var13 > 0 && class193.field3135[var12 + 1][var13 - 1] == 0 && (var17[var12 + 1][var13 - 1] & 0x2C0183) == 0 && (var17[var12 + 1][var13] & 0x2C0180) == 0 && (var17[var12][var13 - 1] & 0x2C0102) == 0) {
                class163.field2645[var28] = var12 + 1;
                class155.field2425[var28] = var13 - 1;
                class193.field3135[var12 + 1][var13 - 1] = 9;
                class117.field1887[var12 + 1][var13 - 1] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var12 > 0 && var13 < 103 && class193.field3135[var12 - 1][var13 + 1] == 0 && (var17[var12 - 1][var13 + 1] & 0x2C0138) == 0 && (var17[var12 - 1][var13] & 0x2C0108) == 0 && (var17[var12][var13 + 1] & 0x2C0120) == 0) {
                class163.field2645[var28] = var12 - 1;
                class155.field2425[var28] = var13 + 1;
                class193.field3135[var12 - 1][var13 + 1] = 6;
                class117.field1887[var12 - 1][var13 + 1] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var12 < 103 && var13 < 103 && class193.field3135[var12 + 1][var13 + 1] == 0 && (var17[var12 + 1][var13 + 1] & 0x2C01E0) == 0 && (var17[var12 + 1][var13] & 0x2C0180) == 0 && (var17[var12][var13 + 1] & 0x2C0120) == 0) {
                class163.field2645[var28] = var12 + 1;
                class155.field2425[var28] = var13 + 1;
                var28 = var28 + 1 & 0xFFF;
                class193.field3135[var12 + 1][var13 + 1] = 12;
                class117.field1887[var12 + 1][var13 + 1] = var26;
            }
        }
        if (arg5 > -69) {
            method1944(true, 47);
        }
        if (!var15) {
            if (!arg4) {
                return;
            }
            int var18 = 100;
            byte var19 = 10;
            int var20 = 1000;
            for (int var21 = arg7 - var19; var21 <= arg7 + var19; var21++) {
                for (int var22 = arg9 - var19; var22 <= (arg9 + var19); var22++) {
                    if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104 && class117.field1887[var21][var22] < 100) {
                        int var23 = 0;
                        if (arg7 > var21) {
                            var23 = arg7 - var21;
                        } else if (var21 > (arg0 + arg7 - 1)) {
                            var23 = var21 + 1 - arg7 - arg0;
                        }
                        int var24 = 0;
                        if (arg9 > var22) {
                            var24 = arg9 - var22;
                        } else if (arg6 + arg9 - 1 < var22) {
                            var24 = var22 + 1 - arg9 - arg6;
                        }
                        int var25 = var23 * var23 + var24 * var24;
                        if (var20 > var25 || var20 == var25 && class117.field1887[var21][var22] < var18) {
                            var12 = var21;
                            var18 = class117.field1887[var21][var22];
                            var13 = var22;
                            var20 = var25;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return;
            }
            if (arg3 == var12 && arg8 == var13) {
                return;
            }
        }
        class86.field1418 = var13;
        class237.field3804 = var12;
        class130.field2033 = false;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(I)V")
    public class291(int arg0) {
        this.field4661 = arg0;
        this.field4666 = new class137[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class137 var3 = this.field4666[var2] = new class137();
            var3.field2173 = var3;
            var3.field2163 = var3;
        }
    }
}
