import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class216 {

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "Leb;")
    public static class230 field3728 = class68.method589(0, "Schlie-8en");

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "Leb;")
    private static class230 field3732 = class68.method589(0, "white:");

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "Leb;")
    public static class230 field3729 = field3732;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field3736 = 0;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Leb;")
    public static class230 field3733 = field3732;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Llc;")
    public static class83 field3731;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILrk;IIBIIIIILsa;Z)Lrk;")
    public static final class257 method1487(int arg0, int arg1, int arg2, class257 arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class249 arg12, boolean arg13) {
        field3737++;
        int var14 = 7 % ((arg6 + 21) / 55);
        long var15 = (long) ((arg10 << 24) + (arg11 << 16) + arg1) - (-((long) arg9 << 32) - ((long) arg8 << 48));
        class257 var17 = (class257) class178.field3120.method1125(var15, true);
        if (var17 == null) {
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            byte var20;
            if (arg1 == 1) {
                var20 = 9;
            } else if (arg1 == 2) {
                var20 = 12;
            } else if (arg1 == 3) {
                var20 = 15;
            } else if (arg1 == 4) {
                var20 = 18;
            } else {
                var20 = 21;
            }
            class250 var21 = new class250((var18 * var20) + 1, var18 * var20 * 2 + -var20, 0);
            int var22 = var21.method1761(0, 0, 0);
            int[][] var23 = new int[var18][var20];
            for (int var24 = 0; var24 < var18; var24++) {
                int var31 = var19[var24];
                int var32 = var19[var24];
                for (int var33 = 0; var33 < var20; var33++) {
                    int var34 = (var33 << 11) / var20;
                    int var35 = class3.field21[var34] * var31 + arg4 >> 16;
                    int var36 = arg5 + (class3.field24[var34] * var32) >> 16;
                    var23[var24][var33] = var21.method1761(var35, 0, var36);
                }
            }
            for (int var25 = 0; var25 < var18; var25++) {
                int var26 = (var25 * 256 + 128) / var18;
                int var27 = 256 - var26;
                byte var28 = (byte) (arg10 * var26 + arg11 * var27 >> 8);
                short var29 = (short) (((arg8 & 0x7F) * var26 + (arg9 & 0x7F) * var27 & 0x7F00) + ((arg8 & 0xFC00) * var26 + (arg9 & 0xFC00) * var27 & 0xFC0000) + ((arg8 & 0x380) * var26 + (arg9 & 0x380) * var27 & 0x38000) >> 8);
                for (int var30 = 0; var30 < var20; var30++) {
                    if (var25 == 0) {
                        var21.method1765(var22, var23[0][(var30 + 1) % var20], var23[0][var30], (byte) 1, var29, var28);
                    } else {
                        var21.method1765(var23[var25 - 1][var30], var23[var25 - 1][(var30 + 1) % var20], var23[var25][(var30 + 1) % var20], (byte) 1, var29, var28);
                        var21.method1765(var23[var25 - 1][var30], var23[var25][(var30 + 1) % var20], var23[var25][var30], (byte) 1, var29, var28);
                    }
                }
            }
            var17 = var21.method1746(64, 768, -50, -10, -50);
            class178.field3120.method1129(var15, true, var17);
        }
        int var37 = arg1 * 64 - 1;
        int var38 = -var37;
        int var39 = -var37;
        int var40 = var37;
        int var41 = var37;
        if (arg13) {
            if (arg0 > 1152 && arg0 < 1920) {
                var40 = var37 + 128;
            }
            if (arg0 > 640 && arg0 < 1408) {
                var41 = var37 + 128;
            }
            if (arg0 > 128 && arg0 < 896) {
                var38 -= 128;
            }
            if (arg0 > 1664 || arg0 < 384) {
                var39 -= 128;
            }
        }
        int var42 = arg3.method737();
        int var43 = arg3.method768();
        if (var42 < var38) {
            var42 = var38;
        }
        if (var43 > var40) {
            var43 = var40;
        }
        int var44 = arg3.method751();
        if (var39 > var44) {
            var44 = var39;
        }
        int var45 = arg3.method744();
        if (var41 < var45) {
            var45 = var41;
        }
        class39 var46 = null;
        if (arg12 != null) {
            int var47 = arg12.field4408[arg2];
            var46 = class92.method776(var47 >> 16, 122);
            arg2 = var47 & 0xFFFF;
        }
        class257 var48;
        if (var46 == null) {
            var48 = var17.method764(true, true);
            var48.method763((var43 - var42) / 2, 128, (var45 - var44) / 2);
            var48.method761((var42 + var43) / 2, 0, (var44 + var45) / 2);
        } else {
            var48 = var17.method764(!var46.method347((byte) -123, arg2), true);
            var48.method763((var43 - var42) / 2, 128, (var45 - var44) / 2);
            var48.method761((var42 + var43) / 2, 0, (var44 + var45) / 2);
            var48.method738(var46, arg2);
        }
        if (arg0 != 0) {
            var48.method765(arg0);
        }
        class90 var49 = (class90) var48;
        if (arg7 != class37.method333(arg5 + var44, 1637367879, class124.field2174, arg4 + var42) || class37.method333(arg5 + var45, 1637367879, class124.field2174, arg4 + var43) != arg7) {
            for (int var50 = 0; var50 < var49.field1599; var50++) {
                var49.field1585[var50] += class37.method333(var49.field1594[var50] + arg5, 1637367879, class124.field2174, var49.field1596[var50] + arg4) - arg7;
            }
            var49.field1591 = false;
        }
        return var48;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIZ)I")
    public static final int method1488(int arg0, int arg1, boolean arg2) {
        field3730++;
        int var3 = 1;
        if (arg2) {
            method1487(-43, 21, -73, (class257) null, 35, -54, (byte) -110, -9, -42, -40, -63, -79, (class249) null, true);
        }
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg1 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static final void method1489(int arg0) {
        class46.field806.method1124(0);
        field3735++;
        if (arg0 >= -114) {
            field3736 = 5;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method1490(int arg0, int arg1) {
        field3734++;
        if (arg0 >= -78) {
            method1487(-97, 116, 84, (class257) null, 71, 38, (byte) 63, -99, -19, 17, 12, -41, (class249) null, false);
        }
        if (arg1 == 100 && class237.field4092 > 0) {
            byte[] var2 = class45.field797[--class237.field4092];
            class45.field797[class237.field4092] = null;
            return var2;
        } else if (arg1 == 5000 && class268.field4758 > 0) {
            byte[] var3 = class105.field1908[--class268.field4758];
            class105.field1908[class268.field4758] = null;
            return var3;
        } else if (arg1 == 30000 && class9.field156 > 0) {
            byte[] var4 = class262.field4667[--class9.field156];
            class262.field4667[class9.field156] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static void method1491(byte arg0) {
        field3729 = null;
        field3731 = null;
        field3732 = null;
        field3728 = null;
        if (arg0 != 107) {
            method1487(-22, -12, 124, (class257) null, 15, -73, (byte) 92, 19, 48, 87, -16, 110, (class249) null, true);
        }
        field3733 = null;
    }
}
