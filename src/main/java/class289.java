import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class289 {

    @OriginalMember(owner = "client!fda", name = "i", descriptor = "[I")
    public static int[] field3719 = null;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "I")
    public int field3711;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
    public int field3712;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
    public int field3715;

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!fda", name = "h", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "Lua;")
    public static class608 field3713;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IZI)Lle;")
    public static final class277 method1633(int arg0, boolean arg1, int arg2) {
        field3717++;
        class277 var3 = new class277();
        var3.field3504 = arg0 + 1 + 5;
        var3.field3492 = arg2 + 1 + 5;
        var3.field3507 = -1;
        var3.field3489 = -1;
        var3.field3493 = new int[var3.field3492][var3.field3504];
        if (!arg1) {
            field3719 = null;
        }
        var3.method1580(-113);
        return var3;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IB)Loda;")
    public static final class104 method1634(int arg0, byte arg1) {
        field3714++;
        class104 var2 = (class104) class671.field9534.method3690((byte) 124, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class325.field4237.method1719(arg0, 0, 4);
        class104 var4 = new class104();
        if (var3 != null) {
            var4.method625((byte) -128, new class452(var3), arg0);
        }
        class671.field9534.method3683(var4, (byte) 109, (long) arg0);
        if (arg1 > -11) {
            method1635(-50, null, -114, 83, null, null, -85, -98, false);
        }
        return var4;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ILoa;IILfa;Lep;IIZ)V")
    public static final void method1635(int arg0, class635 arg1, int arg2, int arg3, class213 arg4, class382 arg5, int arg6, int arg7, boolean arg8) {
        if (arg8) {
            method1635(25, null, -74, 102, null, null, 19, -20, false);
        }
        field3718++;
        class89 var9 = class147.field1644.method1972(arg6, (byte) -18);
        if (var9 == null || !var9.field956 || !var9.method552(true, class491.field7127)) {
            return;
        }
        if (var9.field972 != null) {
            int[] var10 = new int[var9.field972.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var13;
                if (class5.field41 == 4) {
                    var13 = (int) class90.field1041 & 0x3FFF;
                } else {
                    var13 = (int) class90.field1041 + class628.field8908 & 0x3FFF;
                }
                int var14 = class285.field3655[var13];
                int var15 = class285.field3656[var13];
                if (class5.field41 != 4) {
                    var14 = var14 * 256 / (class599.field8520 + 256);
                    var15 = var15 * 256 / (class599.field8520 + 256);
                }
                var10[var11 * 2] = arg5.field5035 / 2 + ((var9.field972[var11 * 2] * 4 + arg3) * var15 + (var9.field972[var11 * 2 + 1] * 4 + arg7) * var14 >> 14) + arg2;
                var10[var11 * 2 + 1] = arg5.field4958 / 2 + arg0 - ((arg7 + (var9.field972[var11 * 2 + 1] * 4)) * var15 - ((var9.field972[var11 * 2] * 4 + arg3) * var14) >> 14);
            }
            class74.method475(arg1, var10, var9.field971, arg5.field4994, arg5.field4985);
            for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                arg1.method313(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[(var12 + 1) * 2 + 1], var9.field942, 1, arg4, arg2, arg0);
            }
            arg1.method313(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field942, 1, arg4, arg2, arg0);
        }
        class458 var16 = null;
        if (var9.field970 != -1) {
            var16 = var9.method551(false, arg1, (byte) -127);
            if (var16 != null) {
                class406.method2206(var16, arg0, arg2, arg4, arg7, 16383, arg3, arg5);
            }
        }
        if (var9.field943 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method417();
        }
        class195 var18 = class419.field5573;
        class645 var19 = class651.field9317;
        if (var9.field949 == 1) {
            var19 = class653.field9338;
            var18 = class404.field5386;
        }
        if (var9.field949 == 2) {
            var18 = class211.field2561;
            var19 = class612.field8650;
        }
        class521.method2968(var9.field943, var17, arg4, var9.field952, arg7, arg5, var19, arg0, arg2, arg3, true, var18);
        return;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
    public static void method1636(int arg0) {
        field3713 = null;
        field3719 = null;
        if (arg0 < 26) {
            method1634(75, (byte) 90);
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(CB)B")
    public static final byte method1637(char arg0, byte arg1) {
        field3716++;
        if (arg1 >= -125) {
            return -58;
        }
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }
}
