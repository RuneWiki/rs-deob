import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class94 {

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "[I")
    public static int[] field1492 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public int field1485;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    private int field1486;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public int field1487;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Lpf;")
    public static class294 field1489;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I")
    public static int method598(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lpf;IIZ)Lmc;")
    public static final class201 method599(class294 arg0, int arg1, int arg2, boolean arg3) {
        field1490++;
        if (class66.method451(arg0, arg1, 2048, arg2)) {
            if (arg3) {
                method599((class294) null, 108, -61, false);
            }
            return class190.method1194(-10215);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILfl;I)V")
    public final void method600(int arg0, class248 arg1, int arg2) {
        field1493++;
        while (true) {
            int var4 = arg1.method1593((byte) 27);
            if (var4 == 0) {
                if (arg2 <= 99) {
                    this.field1486 = 80;
                    return;
                } else {
                    return;
                }
            }
            this.method601(arg1, arg0, var4, 64512);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lfl;III)V")
    private final void method601(class248 arg0, int arg1, int arg2, int arg3) {
        field1488++;
        if (arg2 == 1) {
            this.field1486 = arg0.method1575(false);
        } else if (arg2 == 2) {
            this.field1487 = arg0.method1593((byte) 27);
            this.field1485 = arg0.method1593((byte) 27);
        }
        if (arg3 != 64512) {
            this.field1486 = -100;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIZILcc;Lfk;IIIIIII)Lfk;")
    public static final class14 method602(int arg0, int arg1, int arg2, boolean arg3, int arg4, class215 arg5, class14 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field1491++;
        long var14 = ((long) arg2 << 32) + ((long) arg11 << 48) + (long) ((arg8 << 16) + (arg9 << 24) + arg13);
        class14 var16 = (class14) class241.field3604.method1777(var14, (byte) 112);
        if (var16 == null) {
            byte var17;
            if (arg13 == 1) {
                var17 = 9;
            } else if (arg13 == 2) {
                var17 = 12;
            } else if (arg13 == 3) {
                var17 = 15;
            } else if (arg13 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class208 var20 = new class208(var17 * var18 + 1, var17 * var18 * 2 + -var17, 0);
            int[][] var21 = new int[var18][var17];
            int var22 = var20.method1322(0, 0, 0);
            for (int var23 = 0; var23 < var18; var23++) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = arg4 + (class249.field3767[var33] * var30) >> 16;
                    int var35 = class249.field3781[var33] * var31 + arg1 >> 16;
                    var21[var23][var32] = var20.method1322(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var18; var24++) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = 256 - var25;
                byte var27 = (byte) (arg8 * var26 + arg9 * var25 >> 8);
                short var28 = (short) (((arg2 & 0x7F) * var26 + (arg11 & 0x7F) * var25 & 0x7F00) + ((arg2 & 0xFC00) * var26 + (arg11 & 0xFC00) * var25 & 0xFC0000) + ((arg2 & 0x380) * var26 + (arg11 & 0x380) * var25 & 0x38000) >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var20.method1327(var22, var21[0][(var29 + 1) % var17], var21[0][var29], (byte) 1, var28, var27);
                    } else {
                        var20.method1327(var21[var24 - 1][var29], var21[var24 - 1][(var29 + 1) % var17], var21[var24][(var29 + 1) % var17], (byte) 1, var28, var27);
                        var20.method1327(var21[var24 - 1][var29], var21[var24][(var29 + 1) % var17], var21[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var20.method1315(64, 768, -50, -10, -50);
            class241.field3604.method1784(var14, var16, 0);
        }
        int var36 = arg13 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = arg6.method99();
        int var41 = var36;
        int var42 = 115 / ((24 - arg7) / 46);
        int var43 = arg6.method108();
        if (arg3) {
            if (arg12 > 640 && arg12 < 1408) {
                var41 = var36 + 128;
            }
            if (arg12 > 1664 || arg12 < 384) {
                var38 -= 128;
            }
            if (arg12 > 1152 && arg12 < 1920) {
                var39 = var36 + 128;
            }
            if (arg12 > 128 && arg12 < 896) {
                var37 -= 128;
            }
        }
        if (var40 < var37) {
            var40 = var37;
        }
        if (var39 < var43) {
            var43 = var39;
        }
        int var44 = arg6.method104();
        int var45 = arg6.method86();
        if (var38 > var44) {
            var44 = var38;
        }
        class247 var46 = null;
        if (arg5 != null) {
            int var47 = arg5.field3215[arg0];
            var46 = class92.method587(-1, var47 >> 16);
            arg0 = var47 & 0xFFFF;
        }
        if (var41 < var45) {
            var45 = var41;
        }
        class14 var48;
        if (var46 == null) {
            var48 = var16.method83(true, true, true);
            var48.method92((var43 - var40) / 2, 128, (var45 - var44) / 2);
            var48.method93((var40 + var43) / 2, 0, (var44 + var45) / 2);
        } else {
            var48 = var16.method83(!var46.method1557(arg0, 118), !var46.method1553(arg0, 10), true);
            var48.method92((var43 - var40) / 2, 128, (var45 - var44) / 2);
            var48.method93((var40 + var43) / 2, 0, (var44 + var45) / 2);
            var48.method82(var46, arg0);
        }
        if (arg12 != 0) {
            var48.method89(arg12);
        }
        class29 var49 = (class29) var48;
        if (arg10 != class183.method1139(class99.field1557, arg1 + var44, arg4 + var40, (byte) 117) || class183.method1139(class99.field1557, arg1 + var45, arg4 + var43, (byte) 117) != arg10) {
            for (int var50 = 0; var50 < var49.field348; var50++) {
                var49.field358[var50] += class183.method1139(class99.field1557, var49.field386[var50] + arg1, var49.field356[var50] + arg4, (byte) 117) - arg10;
            }
            var49.field347 = false;
        }
        return var48;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method603(int arg0) {
        field1492 = null;
        if (arg0 == -12084) {
            field1489 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method604(byte arg0, String arg1) {
        int var2 = -30 / ((arg0 + 24) / 52);
        field1483++;
        long var3 = 0L;
        int var5 = arg1.length();
        for (int var6 = 0; var6 < var5; var6++) {
            var3 *= 37L;
            char var7 = arg1.charAt(var6);
            if (var7 >= 'A' && var7 <= 'Z') {
                var3 += (long) (var7 + 1 - 65);
            } else if (var7 >= 'a' && var7 <= 'z') {
                var3 += (long) (var7 + 1 - 97);
            } else if (var7 >= '0' && var7 <= '9') {
                var3 += (long) (var7 - 21);
            }
            if (var3 >= 177917621779460413L) {
                break;
            }
        }
        while ((var3 % 37L) == 0L && var3 != 0L) {
            var3 /= 37L;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)Lmc;")
    public final class201 method605(int arg0) {
        field1494++;
        class201 var2 = (class201) class255.field3883.method1777((long) this.field1486, (byte) 112);
        if (arg0 <= 26) {
            this.field1485 = -26;
        }
        if (var2 != null) {
            return var2;
        }
        class201 var3 = method599(class213.field3186, this.field1486, 0, false);
        if (var3 != null) {
            class255.field3883.method1784((long) this.field1486, var3, 0);
        }
        return var3;
    }
}
