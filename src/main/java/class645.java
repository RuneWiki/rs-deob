import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class645 {

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "[C")
    public static char[] field9105 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "Lcq;")
    public static class110 field9101 = new class110(96, 7);

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "I")
    public static int field9107 = 0;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "I")
    public static int field9100;

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "I")
    public static int field9102;

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "I")
    public static int field9103;

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "I")
    public static int field9104;

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "I")
    public static int field9106;

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "I")
    public static int field9108;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIIIILlb;IBIIILda;ILr;)Lda;")
    public static final class473 method3612(int arg0, int arg1, int arg2, int arg3, int arg4, class257 arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, class473 arg11, int arg12, class564 arg13) {
        field9104++;
        if (arg11 == null) {
            return null;
        }
        int var14 = 2055;
        if (arg5 != null) {
            int var15 = var14 | arg5.method1523(arg8, 29, -1, false);
            var14 = var15 & 0xFFFFFDFF;
        }
        long var16 = ((long) arg10 << 32) + ((long) ((arg12 << 24) + (arg6 + (arg1 << 16))) + ((long) arg0 << 48));
        class19 var18 = class593.field8375;
        class473 var19;
        synchronized (class593.field8375) {
            var19 = (class473) class593.field8375.method78(0, var16);
        }
        if (var19 == null || arg13.method973(var19.method1861(), var14) != 0) {
            if (var19 != null) {
                var14 = arg13.method1004(var14, var19.method1861());
            }
            byte var20;
            if (arg6 == 1) {
                var20 = 9;
            } else if (arg6 == 2) {
                var20 = 12;
            } else if (arg6 == 3) {
                var20 = 15;
            } else if (arg6 == 4) {
                var20 = 18;
            } else {
                var20 = 21;
            }
            byte var21 = 3;
            int[] var22 = new int[] { 64, 96, 128 };
            class581 var23 = new class581((var20 * var21) + 1, var21 * 2 * var20 + -var20, 0);
            int var24 = var23.method3292(-91, 0, 0, 0);
            int[][] var25 = new int[var21][var20];
            for (int var26 = 0; var26 < var21; var26++) {
                int var27 = var22[var26];
                int var28 = var22[var26];
                for (int var29 = 0; var29 < var20; var29++) {
                    int var30 = (var29 << 14) / var20;
                    int var31 = class435.field6134[var30] * var27 >> 14;
                    int var32 = class435.field6135[var30] * var28 >> 14;
                    var25[var26][var29] = var23.method3292(-88, var32, var31, 0);
                }
            }
            for (int var33 = 0; var33 < var21; var33++) {
                int var34 = (var33 * 256 + 128) / var21;
                int var35 = 256 - var34;
                byte var36 = (byte) (arg1 * var35 + arg12 * var34 >> 8);
                short var37 = (short) (((arg0 & 0x380) * var34 + (arg10 & 0x380) * var35 & 0x38000) + ((arg0 & 0xFC00) * var34 + (arg10 & 0xFC00) * var35 & 0xFC0000) + ((arg0 & 0x7F) * var34 + (arg10 & 0x7F) * var35 & 0x7F00) >> 8);
                for (int var38 = 0; var38 < var20; var38++) {
                    if (var33 == 0) {
                        var23.method3286(var25[0][var38], var37, var36, (byte) 11, (short) -1, (byte) -1, (byte) 1, var24, var25[0][(var38 + 1) % var20]);
                    } else {
                        var23.method3286(var25[var33][(var38 + 1) % var20], var37, var36, (byte) 16, (short) -1, (byte) -1, (byte) 1, var25[var33 - 1][var38], var25[var33 - 1][(var38 + 1) % var20]);
                        var23.method3286(var25[var33][var38], var37, var36, (byte) -122, (short) -1, (byte) -1, (byte) 1, var25[var33 - 1][var38], var25[var33][(var38 + 1) % var20]);
                    }
                }
            }
            var19 = arg13.method1051(var23, var14, class124.field1387, 64, 768);
            class19 var39 = class593.field8375;
            synchronized (class593.field8375) {
                class593.field8375.method92(1, var16, var19);
            }
        }
        int var40 = arg11.method1912();
        int var41 = arg11.method1870();
        int var42 = arg11.method1865();
        int var43 = arg11.method1899();
        class479 var44 = null;
        int var45 = -101 % ((arg7 + 69) / 34);
        if (arg5 != null) {
            int var46 = arg5.field3218[arg8];
            var44 = class265.field3301.method3042(var46 >> 16, (byte) -21);
            arg8 = var46 & 0xFFFF;
        }
        class473 var47;
        if (var44 == null) {
            var47 = var19.method1877((byte) 3, var14, true);
            var47.method1885(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var47.method1915(var40 + var41 >> 1, 0, var42 + var43 >> 1);
        } else {
            var47 = var19.method1877((byte) 3, var14, true);
            var47.method1885(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var47.method1915(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            var47.method2727(arg8, -5405, var44);
        }
        if (arg9 != 0) {
            var47.method1884(arg9);
        }
        if (arg4 != 0) {
            var47.method1902(arg4);
        }
        if (arg3 != 0) {
            var47.method1915(0, arg3, 0);
        }
        return var47;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lr;JZ)V")
    public static final void method3613(class564 arg0, long arg1, boolean arg2) {
        field9103++;
        class397.field5367 = 0;
        if (arg2) {
            field9106 = -99;
        }
        class370.field5058 = class638.field8989;
        class229.field2832 = 0;
        class638.field8989 = 0;
        long var4 = class557.method3157(-53);
        for (class339 var6 = (class339) class369.field5054.method1672((byte) 69); var6 != null; var6 = (class339) class369.field5054.method1669(-2747)) {
            if (var6.method1955(arg0, arg1)) {
                class397.field5367++;
            }
        }
        if (class398.field5371 && arg1 % 100L == 0L) {
            System.out.println("Particle system count: " + class369.field5054.method1673(20423) + ", running: " + class397.field5367);
            System.out.println("Emitters: " + class229.field2832 + " Particles: " + class638.field8989 + ". Time taken: " + (class557.method3157(-104) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method3614(int arg0, long arg1) {
        field9102++;
        if (arg0 <= 4) {
            field9101 = null;
        }
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(field9105[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)V")
    public static void method3615(byte arg0) {
        int var1 = 67 / ((arg0 - 91) / 32);
        field9101 = null;
        field9105 = null;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ZI)Lwe;")
    public static final class192 method3616(boolean arg0, int arg1) {
        field9100++;
        if (arg0) {
            field9106 = 84;
        }
        return arg1 >= 0 && arg1 < 100 ? class518.field7380[arg1] : null;
    }
}
