import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public abstract class class264 extends class449 {

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "[Lol;")
    public class264[] field3795;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "Z")
    public boolean field3794;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "[I")
    public static int[] field3801 = new int[200];

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "I")
    public static int field3806 = 1;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "I")
    public int field3809;

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "Lvn;")
    public class127 field3808;

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "Lnk;")
    public class297 field3816;

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "Lvg;")
    public static class431 field3811;

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "[I")
    public static int[] field3813;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)V", line = 3)
    public void method1669(int arg0) {
        if (arg0 != -8433) {
            this.method95(37);
        }
        if (this.field3794) {
            this.field3808.method959(70);
            this.field3808 = null;
        } else {
            this.field3816.method1926((byte) -125);
            this.field3816 = null;
        }
        field3807++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIIILn;IIILqp;Lvc;IZ)Ln;", line = 28)
    public static final class468 method1780(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class468 arg7, int arg8, int arg9, int arg10, class303 arg11, class89 arg12, int arg13, boolean arg14) {
        field3797++;
        if (arg7 == null) {
            return null;
        }
        int var15 = 1031;
        if (arg11 != null) {
            int var16 = var15 | arg11.method1950(false, -13533, -1, arg0);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg9 << 48) + ((long) arg13 << 32) + (long) ((arg5 << 16) + arg1 - -(arg8 << 24));
        class336 var19 = class279.field4010;
        class468 var20;
        synchronized (class279.field4010) {
            var20 = (class468) class279.field4010.method2113(0, var17);
        }
        if (var20 == null || arg12.method362(var20.method1574(), var15) != 0) {
            if (var20 != null) {
                var15 = arg12.method355(var15, var20.method1574());
            }
            byte var21;
            if (arg1 == 1) {
                var21 = 9;
            } else if (arg1 == 2) {
                var21 = 12;
            } else if (arg1 == 3) {
                var21 = 15;
            } else if (arg1 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class430 var24 = new class430(var21 * var22 + 1, var21 * var22 * 2 + -var21, 0);
            int var25 = var24.method2568(0, -9816, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class319.field4501[var31] * var28 >> 15;
                    int var33 = class319.field4504[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method2568(0, -9816, var32, var33);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg5 * var36 + arg8 * var35 >> 8);
                short var38 = (short) (((arg9 & 0xFC00) * var35 + (arg13 & 0xFC00) * var36 & 0xFC0000) + ((arg9 & 0x7F) * var35 + (arg13 & 0x7F) * var36 & 0x7F00) + ((arg9 & 0x380) * var35 + (arg13 & 0x380) * var36 & 0x38000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method2570(var37, var26[0][(var39 + 1) % var21], var38, var26[0][var39], (short) -1, (byte) -1, var25, -17594, (byte) 1);
                    } else {
                        var24.method2570(var37, var26[var34 - 1][(var39 + 1) % var21], var38, var26[var34][(var39 + 1) % var21], (short) -1, (byte) -1, var26[var34 - 1][var39], -17594, (byte) 1);
                        var24.method2570(var37, var26[var34][(var39 + 1) % var21], var38, var26[var34][var39], (short) -1, (byte) -1, var26[var34 - 1][var39], -17594, (byte) 1);
                    }
                }
            }
            var20 = arg12.method327(var24, var15, class12.field87, 64, 768);
            class336 var40 = class279.field4010;
            synchronized (class279.field4010) {
                class279.field4010.method2116(var17, (byte) -96, var20);
            }
        }
        int var41 = arg1 * 64 - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg14) {
            if (arg4 > 13312 || arg4 < 3072) {
                var43 -= 128;
            }
            if (arg4 > 1024 && arg4 < 7168) {
                var42 -= 128;
            }
            if (arg4 > 5120 && arg4 < 11264) {
                var45 = var41 + 128;
            }
            if (arg4 > 9216 && arg4 < 15360) {
                var44 = var41 + 128;
            }
        }
        int var46 = arg7.method1599();
        int var47 = arg7.method1596();
        int var48 = arg7.method1583();
        if (var42 > var46) {
            var46 = var42;
        }
        if (var43 > var48) {
            var48 = var43;
        }
        if (arg6 >= -50) {
            method1787(-84, (String) null);
        }
        int var49 = arg7.method1569();
        if (var47 > var44) {
            var47 = var44;
        }
        if (var49 > var45) {
            var49 = var45;
        }
        class135 var50 = null;
        if (arg11 != null) {
            int var51 = arg11.field4286[arg0];
            var50 = class386.field5289.method1855(-116, var51 >> 16);
            arg0 = var51 & 0xFFFF;
        }
        class468 var52;
        if (var50 == null) {
            var52 = var20.method1600((byte) 3, var15, true);
            var52.method1562((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method1572((var46 + var47) / 2, 0, (var48 + var49) / 2);
        } else {
            var52 = var20.method1600((byte) 3, var15, true);
            var52.method1562((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method1572((var46 + var47) / 2, 0, (var48 + var49) / 2);
            var52.method2792(-24180, var50, arg0);
        }
        if (arg10 != 0) {
            var52.method1556(arg10);
        }
        if (arg3 != 0) {
            var52.method1605(arg3);
        }
        if (arg2 != 0) {
            var52.method1572(0, arg2, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)[I", line = 245)
    public int[] method90(int arg0, int arg1) {
        if (arg1 != 21034) {
            this.field3809 = -119;
        }
        field3814++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)I", line = 262)
    public int method1781(byte arg0) {
        field3799++;
        int var2 = -42 / ((arg0 + 10) / 54);
        return -1;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IBI)[[I", line = 272)
    public final int[][] method1782(int arg0, byte arg1, int arg2) {
        if (arg1 <= 113) {
            return null;
        }
        field3810++;
        if (this.field3795[arg2].field3794) {
            int[] var4 = this.field3795[arg2].method90(arg0, 21034);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3795[arg2].method5((byte) 116, arg0);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIB)V", line = 304)
    public void method1783(int arg0, int arg1, byte arg2) {
        field3803++;
        int var4 = this.field3809 == 255 ? arg1 : this.field3809;
        if (this.field3794) {
            this.field3808 = new class127(var4, arg1, arg0);
        } else {
            this.field3816 = new class297(var4, arg1, arg0);
        }
        int var5 = 17 / ((-arg2 - 22) / 58);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)Z", line = 330)
    public static final boolean method1784(byte arg0, int arg1) {
        field3796++;
        if (arg1 == 19 || arg1 == 49 || arg1 == 15 || arg1 == 20 || arg1 == 1008) {
            return true;
        } else {
            if (arg0 < 104) {
                field3811 = null;
            }
            return arg1 == 22 || arg1 == 1001;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(BI)[[I", line = 352)
    public int[][] method5(byte arg0, int arg1) {
        field3802++;
        if (arg0 == 116) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return null;
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)I", line = 364)
    public int method1670(int arg0) {
        if (arg0 != 1) {
            this.method95(-12);
        }
        field3815++;
        return -1;
    }

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "(I)V", line = 375)
    public void method95(int arg0) {
        field3804++;
        if (arg0 != -8) {
            field3801 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 389)
    public static final void method1785(String arg0, int arg1) {
        field3798++;
        if (arg0.equals("")) {
            return;
        }
        class336.method2111(class162.field2362, 103);
        class201.field2979++;
        class311.field4403.method1180((byte) -110, class345.method2147(arg0, (byte) 110));
        if (arg1 > 36) {
            class311.field4403.method1184((byte) 63, arg0);
        }
    }

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "(I)V", line = 407)
    public static void method1786(int arg0) {
        field3801 = null;
        field3811 = null;
        field3813 = null;
        if (arg0 < 33) {
            field3806 = 107;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 429)
    public static final String method1787(int arg0, String arg1) {
        field3800++;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 != -61) {
            field3801 = null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(IBI)[I", line = 487)
    public final int[] method1788(int arg0, byte arg1, int arg2) {
        field3805++;
        if (arg1 >= -1) {
            method1786(80);
        }
        return this.field3795[arg2].field3794 ? this.field3795[arg2].method90(arg0, 21034) : this.field3795[arg2].method5((byte) 116, arg0)[0];
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BLkk;I)V", line = 508)
    public void method7(byte arg0, class161 arg1, int arg2) {
        if (arg0 < 31) {
            this.field3794 = true;
        }
        field3812++;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IZ)V", line = 520)
    public class264(int arg0, boolean arg1) {
        this.field3795 = new class264[arg0];
        this.field3794 = arg1;
    }
}
