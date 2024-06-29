import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class454 extends class107 {

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Lfk;")
    public static class314 field6530;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)Lbda;")
    public static final class197 method2636(int arg0, int arg1, int arg2) {
        class293 var3 = class541.field7946[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4091;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
    public static void method2637(int arg0) {
        field6530 = null;
        if (arg0 != -3) {
            method2637(-88);
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
    public static final void method2638(int arg0) {
        field6529++;
        class326.method1948(arg0 + 4, class512.field7616);
        class494.field7088++;
        if (arg0 != -3) {
            return;
        }
        if (class86.field1290 && class23.field309) {
            int var1 = class313.field4336.method310(false);
            int var2 = class313.field4336.method321(115);
            int var3 = var1 - class586.field8575;
            int var4 = var2 - class655.field9260;
            if (class112.field1794 > var3) {
                var3 = class112.field1794;
            }
            if ((class112.field1794 + class456.field6557.field1604) < (class512.field7616.field1604 + var3)) {
                var3 = class456.field6557.field1604 + class112.field1794 - class512.field7616.field1604;
            }
            if (class654.field9236 > var4) {
                var4 = class654.field9236;
            }
            if (class512.field7616.field1651 + var4 > class654.field9236 + class456.field6557.field1651) {
                var4 = class654.field9236 + class456.field6557.field1651 - class512.field7616.field1651;
            }
            int var5 = class456.field6557.field1518 + var3 - class112.field1794;
            int var6 = var4 + class456.field6557.field1523 - class654.field9236;
            if (class313.field4336.method2343(arg0 ^ 0xFFFFFFDD)) {
                if (class512.field7616.field1504 < class494.field7088) {
                    int var8 = var3 - class251.field3627;
                    int var9 = var4 - class443.field6405;
                    if (var8 > class512.field7616.field1500 || -class512.field7616.field1500 > var8 || class512.field7616.field1500 < var9 || (-class512.field7616.field1500) > var9) {
                        class205.field3169 = true;
                    }
                }
                if (class512.field7616.field1550 != null && class205.field3169) {
                    class400 var10 = new class400();
                    var10.field5785 = var5;
                    var10.field5791 = var6;
                    var10.field5783 = class512.field7616;
                    var10.field5790 = class512.field7616.field1550;
                    class362.method2171(var10);
                }
            } else {
                if (class205.field3169) {
                    class372.method2220(-20585);
                    if (class512.field7616.field1611 != null) {
                        class400 var7 = new class400();
                        var7.field5790 = class512.field7616.field1611;
                        var7.field5783 = class512.field7616;
                        var7.field5776 = class201.field3101;
                        var7.field5785 = var5;
                        var7.field5791 = var6;
                        class362.method2171(var7);
                    }
                    if (class201.field3101 != null && client.method716(class512.field7616) != null) {
                        class103.method867(class201.field3101, -1, class512.field7616);
                    }
                } else if ((class248.field3608 == 1 || class116.method932((byte) -126)) && class400.field5784 > 2) {
                    class396.method2404(-15896, class655.field9260 + class443.field6405, class586.field8575 + class251.field3627);
                } else if (class366.method2194((byte) -105)) {
                    class396.method2404(-15896, class655.field9260 + class443.field6405, class586.field8575 + class251.field3627);
                }
                class512.field7616 = null;
            }
        } else if (class494.field7088 > 1) {
            class512.field7616 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
    public static final String method2639(int arg0, int arg1, boolean arg2, int arg3) {
        field6528++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg2 && arg3 >= 0) {
            int var4 = 2;
            for (int var5 = arg3 / arg1; var5 != 0; var5 /= arg1) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = arg0 + var4; var7 > 0; var7--) {
                int var8 = arg3;
                arg3 /= arg1;
                int var9 = var8 - arg1 * arg3;
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIIIIILnea;)Z")
    public static final boolean method2640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class538 arg10) {
        field6531++;
        int var11 = arg9;
        int var12 = arg7;
        if (arg1 < 22) {
            method2636(79, 122, 47);
        }
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg9 - var13;
        class83.field1265[var13][var14] = 99;
        int var16 = arg7 - var14;
        class259.field3714[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class340.field4721[var17] = arg9;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class25.field345[var10001] = arg7;
        int[][] var19 = arg10.field7893;
        while (var26 != var18) {
            var11 = class340.field4721[var18];
            var12 = class25.field345[var18];
            int var20 = var12 - arg10.field7908;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var11 - var15;
            int var22 = var11 - arg10.field7891;
            int var23 = var12 - var16;
            if (arg0 == -4) {
                if (arg6 == var11 && arg4 == var12) {
                    class372.field5164 = var11;
                    class642.field9125 = var12;
                    return true;
                }
            } else if (arg0 == -3) {
                if (class550.method3231(100, 1, var11, arg6, 1, var12, arg5, arg2, arg4)) {
                    class372.field5164 = var11;
                    class642.field9125 = var12;
                    return true;
                }
            } else if (arg0 == -2) {
                if (arg10.method3168(-48, arg4, var11, arg8, var12, arg2, 1, 1, arg6, arg5)) {
                    class642.field9125 = var12;
                    class372.field5164 = var11;
                    return true;
                }
            } else if (arg0 == -1) {
                if (arg10.method3166(var12, var11, arg2, arg5, true, arg6, arg8, arg4, 1)) {
                    class372.field5164 = var11;
                    class642.field9125 = var12;
                    return true;
                }
            } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                if (arg10.method3156(var12, 1, arg0, arg3, arg6, var11, arg4, -1)) {
                    class372.field5164 = var11;
                    class642.field9125 = var12;
                    return true;
                }
            } else if (arg10.method3154(116, arg4, 1, arg0, arg6, var12, arg3, var11)) {
                class642.field9125 = var12;
                class372.field5164 = var11;
                return true;
            }
            int var25 = class259.field3714[var21][var23] + 1;
            if (var21 > 0 && class83.field1265[var21 - 1][var23] == 0 && (var19[var22 - 1][var20] & 0x42240000) == 0) {
                class340.field4721[var26] = var11 - 1;
                class25.field345[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class83.field1265[var21 - 1][var23] = 2;
                class259.field3714[var21 - 1][var23] = var25;
            }
            if (var21 < 127 && class83.field1265[var21 + 1][var23] == 0 && (var19[var22 + 1][var20] & 0x60240000) == 0) {
                class340.field4721[var26] = var11 + 1;
                class25.field345[var26] = var12;
                class83.field1265[var21 + 1][var23] = 8;
                var26 = var26 + 1 & 0xFFF;
                class259.field3714[var21 + 1][var23] = var25;
            }
            if (var23 > 0 && class83.field1265[var21][var23 - 1] == 0 && (var19[var22][var20 - 1] & 0x40A40000) == 0) {
                class340.field4721[var26] = var11;
                class25.field345[var26] = var12 - 1;
                class83.field1265[var21][var23 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class259.field3714[var21][var23 - 1] = var25;
            }
            if (var23 < 127 && class83.field1265[var21][var23 + 1] == 0 && (var19[var22][var20 + 1] & 0x48240000) == 0) {
                class340.field4721[var26] = var11;
                class25.field345[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class83.field1265[var21][var23 + 1] = 4;
                class259.field3714[var21][var23 + 1] = var25;
            }
            if (var21 > 0 && var23 > 0 && class83.field1265[var21 - 1][var23 - 1] == 0 && (var19[var22 - 1][var20 - 1] & 0x43A40000) == 0 && (var19[var22 - 1][var20] & 0x42240000) == 0 && (var19[var22][var20 - 1] & 0x40A40000) == 0) {
                class340.field4721[var26] = var11 - 1;
                class25.field345[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class83.field1265[var21 - 1][var23 - 1] = 3;
                class259.field3714[var21 - 1][var23 - 1] = var25;
            }
            if (var21 < 127 && var23 > 0 && class83.field1265[var21 + 1][var23 - 1] == 0 && (var19[var22 + 1][var20 - 1] & 0x60E40000) == 0 && (var19[var22 + 1][var20] & 0x60240000) == 0 && (var19[var22][var20 - 1] & 0x40A40000) == 0) {
                class340.field4721[var26] = var11 + 1;
                class25.field345[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class83.field1265[var21 + 1][var23 - 1] = 9;
                class259.field3714[var21 + 1][var23 - 1] = var25;
            }
            if (var21 > 0 && var23 < 127 && class83.field1265[var21 - 1][var23 + 1] == 0 && (var19[var22 - 1][var20 + 1] & 0x4E240000) == 0 && (var19[var22 - 1][var20] & 0x42240000) == 0 && (var19[var22][var20 + 1] & 0x48240000) == 0) {
                class340.field4721[var26] = var11 - 1;
                class25.field345[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class83.field1265[var21 - 1][var23 + 1] = 6;
                class259.field3714[var21 - 1][var23 + 1] = var25;
            }
            if (var21 < 127 && var23 < 127 && class83.field1265[var21 + 1][var23 + 1] == 0 && (var19[var22 + 1][var20 + 1] & 0x78240000) == 0 && (var19[var22 + 1][var20] & 0x60240000) == 0 && (var19[var22][var20 + 1] & 0x48240000) == 0) {
                class340.field4721[var26] = var11 + 1;
                class25.field345[var26] = var12 + 1;
                class83.field1265[var21 + 1][var23 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class259.field3714[var21 + 1][var23 + 1] = var25;
            }
        }
        class642.field9125 = var12;
        class372.field5164 = var11;
        return false;
    }
}
