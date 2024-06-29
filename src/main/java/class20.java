import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class20 extends class331 {

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "Z")
    public static boolean field265 = true;

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "[I")
    public static int[] field267 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    public int field252;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public int field255;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
    public int field258;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "Ljava/lang/String;")
    public String field263;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)J", line = 3)
    public final long method144(int arg0) {
        if (arg0 != -31416) {
            method145((byte) 87, 29);
        }
        ++field260;
        return Long.MAX_VALUE & super.field4685;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)V", line = 14)
    public static final void method145(byte arg0, int arg1) {
        ++field256;
        if (class325.field4622 == null) {
            class325.field4622 = new byte[4][class176.field2403][class383.field5395];
        }
        if (arg1 != 4) {
            field267 = null;
        }
        for (int var2 = 0; ~var2 > -5; ++var2) {
            for (int var3 = 0; class176.field2403 > var3; ++var3) {
                for (int var4 = 0; ~class383.field5395 < ~var4; ++var4) {
                    class325.field4622[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V", line = 53)
    public final void method146(int arg0) {
        ++field264;
        super.field4685 |= Long.MIN_VALUE;
        if (arg0 <= 68) {
            this.field258 = 13;
        }
        if (~this.method144(-31416) == -1L) {
            class23.field287.method1950(95, this);
        }
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)I", line = 71)
    public final int method147(int arg0) {
        ++field253;
        return arg0 != 0 ? 2 : (int) (super.field5855 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)V", line = 85)
    public final void method148(int arg0) {
        if (arg0 == -11806) {
            ++field262;
            super.field4685 = class175.method1195(73) + 500L | super.field4685 & Long.MIN_VALUE;
            class328.field4655.method1950(22, this);
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V", line = 100)
    public static void method149(byte arg0) {
        if (arg0 >= -119) {
            field265 = false;
        }
        field267 = null;
    }

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "(I)V", line = 110)
    public static final void method150(int arg0) {
        for (class435 var1 = (class435) class273.field3872.method506((byte) -128); var1 != null; var1 = (class435) class273.field3872.method514(true)) {
            if (var1.field6264) {
                var1.method2725((byte) 121);
            }
        }
        ++field266;
        class435 var2 = (class435) class138.field1713.method506((byte) -128);
        if (arg0 <= 36) {
            method152((byte) -101, (class266) null, 62, 116, false, 117, (class134) null);
        }
        while (var2 != null) {
            if (var2.field6264) {
                var2.method2725((byte) 121);
            }
            var2 = (class435) class138.field1713.method514(true);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZIILjava/lang/String;)Z", line = 145)
    public static final boolean method151(boolean arg0, int arg1, int arg2, String arg3) {
        ++field254;
        if (~arg2 <= -3 && arg2 <= 36) {
            int var4 = 93 / ((arg1 - 14) / 36);
            boolean var5 = false;
            boolean var6 = false;
            int var7 = 0;
            int var8 = arg3.length();
            for (int var9 = 0; ~var8 < ~var9; ++var9) {
                char var10 = arg3.charAt(var9);
                if (~var9 == -1) {
                    if (~var10 == -46) {
                        var5 = true;
                        continue;
                    }
                    if (~var10 == -44 && arg0) {
                        continue;
                    }
                }
                int var12;
                if (~var10 <= -49 && var10 <= '9') {
                    var12 = var10 - '0';
                } else if (var10 >= 'A' && ~var10 >= -91) {
                    var12 = var10 - '7';
                } else {
                    if (var10 < 'a' || var10 > 'z') {
                        return false;
                    }
                    var12 = var10 - 'W';
                }
                if (var12 >= arg2) {
                    return false;
                }
                if (var5) {
                    var12 = -var12;
                }
                int var11 = arg2 * var7 + var12;
                if (var11 / arg2 != var7) {
                    return false;
                }
                var6 = true;
                var7 = var11;
            }
            return var6;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLsj;IIZILae;)V", line = 219)
    public static final void method152(byte arg0, class266 arg1, int arg2, int arg3, boolean arg4, int arg5, class134 arg6) {
        ++field257;
        if (arg4) {
            class254.field3668.method2446((class330.field4671 + -class254.field3668.method762()) / 2, (class105.field1259 - class254.field3668.method761()) / 2);
            class389.field5503.method2446((class330.field4671 + -class389.field5503.method762()) / 2, 18);
        }
        if (arg0 == 111) {
            arg1.method1776(class105.field1259 / 2 - 26, arg3, ~class384.field5425 == -2 ? class352.field4975.method2331(25, class271.field3836) : class384.field5421.method2331(25, class271.field3836), class330.field4671 / 2, arg0 ^ -64, -1);
            int var7 = class105.field1259 / 2 - 18;
            arg6.method594(class330.field4671 / 2 + -152, var7, 304, 34, arg2, 0);
            arg6.method594(class330.field4671 / 2 + -151, var7 - -1, 302, 32, 0, 0);
            arg6.method653(class330.field4671 / 2 + -150, var7 + 2, class35.field401 * 3, 30, arg5, 0);
            arg6.method653(class330.field4671 / 2 + class35.field401 * 3 + -150, var7 + 2, -(class35.field401 * 3) + 300, 30, 0, 0);
            arg1.method1776(class105.field1259 / 2 + 4, arg3, class366.field5201, class330.field4671 / 2, arg0 ^ -24, -1);
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(B)I", line = 244)
    public final int method153(byte arg0) {
        if (arg0 < 2) {
            this.field258 = 91;
        }
        ++field261;
        return (int) super.field5855;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(II)V", line = 254)
    public class20(int arg0, int arg1) {
        super.field5855 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIILae;[[[BBIII)V", line = 263)
    public static final void method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class134 arg7, byte[][][] arg8, byte arg9, int arg10, int arg11, int arg12) {
        ++field259;
        if (~arg6 != -1 && ~arg1 != -1) {
            if (~arg6 == -10) {
                arg10 = arg10 - -1 & 3;
                arg6 = 1;
            }
            if (~arg6 == -11) {
                arg10 = arg10 + 3 & 3;
                arg6 = 1;
            }
            if (~arg6 == -12) {
                arg10 = 3 & arg10 - -3;
                arg6 = 8;
            }
            if (arg9 < 111) {
                method150(-78);
            }
            arg7.method665(arg3, arg11, arg12, arg4, arg0, arg5, arg8[arg6 + -1][arg10], arg1, arg2);
        }
    }
}
