import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class151 extends class593 {

    @OriginalMember(owner = "client!mha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1937 = new String[] { method1287(method1286("\u0002\u001ft\u0016rG")), method1287(method1286("\u0002\u001ft\u0016zG")), method1287(method1286("\u0002\u001ft\u0016pG")), method1287(method1286("\u0002\u001ft\u0016vG")), method1287(method1286("\u0002\u001ft\u0016tG")), method1287(method1286("\u0001\u0002yT")), method1287(method1286("\u0014Y;\u0016N")), method1287(method1286("\u0002\u001ft\u0016qG")), method1287(method1286("\u0002\u001ft\u0016wG")), method1287(method1286("\u0002\u001ft\u0016uG")), method1287(method1286("\u0002\u001ft\u0016{G")) };

    @OriginalMember(owner = "client!mha", name = "i", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!mha", name = "l", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!mha", name = "p", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!mha", name = "h", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!mha", name = "k", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!mha", name = "n", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!mha", name = "o", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!mha", name = "t", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!mha", name = "q", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!mha", name = "j", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!mha", name = "m", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!mha", name = "s", descriptor = "Lqa;")
    public static class104 field1925;

    @OriginalMember(owner = "client!mha", name = "u", descriptor = "Llga;")
    public static class47 field1929;

    @OriginalMember(owner = "client!mha", name = "r", descriptor = "Llga;")
    public static class47 field1933;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(BZ)V", line = 9)
    public final void method460(byte arg0, boolean arg1) {
        try {
            ++field1928;
            if (arg0 != -20) {
                method1285(82, -103, -105, -51, -96, -53, (byte) -63);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1937[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)Z", line = 21)
    public final boolean method458(int arg0) {
        try {
            if (arg0 <= 70) {
                field1932 = 58;
            }
            ++field1930;
            return false;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1937[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIB)V", line = 32)
    public final void method463(int arg0, int arg1, byte arg2) {
        try {
            ++field1926;
            if (arg2 >= -98) {
                field1933 = null;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1937[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "(I)V", line = 44)
    public final void method455(int arg0) {
        try {
            ++field1923;
            if (arg0 != -15226) {
                method1285(-79, 15, -30, 85, -19, 55, (byte) -116);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1937[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "h", descriptor = "(I)V", line = 54)
    public static void method1283(int arg0) {
        try {
            if (arg0 != 20586) {
                method1285(85, -50, -59, 30, -60, 81, (byte) 85);
            }
            field1925 = null;
            field1933 = null;
            field1929 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1937[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(Ljj;)V", line = 66)
    public class151(class334 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IBI)Z", line = 70)
    public static final boolean method1284(int arg0, byte arg1, int arg2) {
        try {
            ++field1924;
            if (arg1 != -43) {
                method1285(-11, -31, -86, -1, 86, -63, (byte) 13);
            }
            return (2048 & arg0) != 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1937[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIIIIIB)V", line = 82)
    public static final void method1285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        try {
            ++field1934;
            class505.method3861(arg6 + 5, arg2);
            int var7 = 0;
            int var8 = -arg4 + arg2;
            if (~var8 > -1) {
                var8 = 0;
            }
            int var9 = arg2;
            int var10 = -arg2;
            int var11 = var8;
            int var12 = -var8;
            int var13 = -1;
            if (arg6 == -123) {
                int var14 = -1;
                int[] var15 = class529.field7682[arg3];
                int var16 = -var8 + arg5;
                int var17 = arg5 + var8;
                class576.method4282(-7, -arg2 + arg5, arg0, var15, var16);
                class576.method4282(-7, var16, arg1, var15, var17);
                class576.method4282(-7, var17, arg0, var15, arg2 + arg5);
                while (~var9 < ~var7) {
                    var13 += 2;
                    var14 += 2;
                    var12 += var14;
                    var10 += var13;
                    if (var12 >= 0 && ~var11 <= -2) {
                        class740.field10522[var11] = var7;
                        --var11;
                        var12 -= var11 << 1;
                    }
                    ++var7;
                    if (~var10 <= -1) {
                        --var9;
                        if (var8 <= var9) {
                            int[] var18 = class529.field7682[arg3 - -var9];
                            int[] var19 = class529.field7682[-var9 + arg3];
                            int var20 = arg5 + var7;
                            int var21 = arg5 - var7;
                            class576.method4282(-7, var21, arg0, var18, var20);
                            class576.method4282(-7, var21, arg0, var19, var20);
                        } else {
                            int[] var22 = class529.field7682[arg3 + var9];
                            int[] var23 = class529.field7682[arg3 - var9];
                            int var24 = class740.field10522[var9];
                            int var25 = arg5 + var7;
                            int var26 = -var7 + arg5;
                            int var27 = arg5 + var24;
                            int var28 = arg5 - var24;
                            class576.method4282(-7, var26, arg0, var22, var28);
                            class576.method4282(-7, var28, arg1, var22, var27);
                            class576.method4282(-7, var27, arg0, var22, var25);
                            class576.method4282(-7, var26, arg0, var23, var28);
                            class576.method4282(-7, var28, arg1, var23, var27);
                            class576.method4282(-7, var27, arg0, var23, var25);
                        }
                        var10 -= var9 << 1;
                    }
                    int[] var29 = class529.field7682[arg3 - -var7];
                    int[] var30 = class529.field7682[arg3 - var7];
                    int var31 = arg5 + var9;
                    int var32 = -var9 + arg5;
                    if (var8 <= var7) {
                        class576.method4282(-7, var32, arg0, var29, var31);
                        class576.method4282(-7, var32, arg0, var30, var31);
                    } else {
                        int var33 = var11 >= var7 ? var11 : class740.field10522[var7];
                        int var34 = arg5 - -var33;
                        int var35 = -var33 + arg5;
                        class576.method4282(arg6 ^ 124, var32, arg0, var29, var35);
                        class576.method4282(-7, var35, arg1, var29, var34);
                        class576.method4282(arg6 + 116, var34, arg0, var29, var31);
                        class576.method4282(-7, var32, arg0, var30, var35);
                        class576.method4282(-7, var35, arg1, var30, var34);
                        class576.method4282(arg6 + 116, var34, arg0, var30, var31);
                    }
                }
            }
        } catch (RuntimeException var37) {
            throw class665.method4799(var37, field1937[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IBLah;)V", line = 212)
    public final void method452(int arg0, byte arg1, class764 arg2) {
        try {
            super.field8530.method2668(arg1 + 130, arg2);
            ++field1927;
            super.field8530.method2679(arg1 ^ -108, arg0);
            if (arg1 != -106) {
                field1929 = null;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1937[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1937[6] : field1937[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IZ)V", line = 226)
    public final void method454(int arg0, boolean arg1) {
        try {
            int var3 = 28 / ((arg0 - -51) / 39);
            ++field1931;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1937[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1286(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 51);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1287(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 111;
                    break;
                case 1:
                    var10005 = 119;
                    break;
                case 2:
                    var10005 = 21;
                    break;
                case 3:
                    var10005 = 56;
                    break;
                default:
                    var10005 = 51;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
