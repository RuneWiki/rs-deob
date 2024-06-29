import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class259 extends class748 {

    @OriginalMember(owner = "client!aia", name = "L", descriptor = "[I")
    public static int[] field3528 = new int[1];

    @OriginalMember(owner = "client!aia", name = "H", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!aia", name = "I", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!aia", name = "J", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!aia", name = "K", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!aia", name = "M", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!aia", name = "N", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!aia", name = "O", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!aia", name = "P", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(BLjava/lang/String;Lwu;Z)Leea;", line = 4)
    public static final class458 method1609(byte arg0, String arg1, class557 arg2, boolean arg3) {
        ++field3531;
        int var4 = arg2.method3311((byte) -24, arg1);
        if (var4 == -1) {
            return new class458(0);
        } else {
            int[] var5 = arg2.method3319(var4, (byte) -2);
            class458 var6 = new class458(var5.length);
            int var7 = 0;
            if (arg0 >= -82) {
                field3528 = null;
            }
            int var8 = 0;
            while (true) {
                while (var7 < var6.field6303) {
                    class26 var9 = new class26(arg2.method3322(var4, var5[var8++], (byte) 107));
                    int var10 = var9.method189(255);
                    int var11 = var9.method193(2);
                    int var12 = var9.method194((byte) 119);
                    if (!arg3 && var12 == 1) {
                        --var6.field6303;
                    } else {
                        var6.field6304[var7] = var10;
                        var6.field6305[var7] = var11;
                        ++var7;
                    }
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(II)[I", line = 50)
    public final int[] method25(int arg0, int arg1) {
        if (arg1 != 255) {
            return null;
        } else {
            ++field3530;
            int[] var3 = super.field10407.method3873(0, arg0);
            if (super.field10407.field9527) {
                int[] var4 = this.method4157(0, (byte) -116, arg0);
                for (int var5 = 0; var5 < class424.field5889; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!aia", name = "d", descriptor = "(B)V", line = 84)
    public static void method1610(byte arg0) {
        field3528 = null;
        int var1 = 92 % ((arg0 - -38) / 38);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lam;B)I", line = 94)
    public static final int method1611(class55 arg0, byte arg1) {
        if (arg1 > -46) {
            return -79;
        } else {
            ++field3527;
            class11 var2 = arg0.field771;
            if (var2.field111 != null) {
                var2 = var2.method55((byte) 118, class554.field7826);
                if (var2 == null) {
                    return -1;
                }
            }
            int var3 = var2.field165;
            class591 var4 = arg0.method3482(0);
            if (~arg0.field8309 != 0 && !arg0.field8352) {
                if (~arg0.field8309 != ~var4.field8489 && ~arg0.field8309 != ~var4.field8501 && arg0.field8309 != var4.field8518 && ~arg0.field8309 != ~var4.field8491) {
                    if (arg0.field8309 == var4.field8516 || ~arg0.field8309 == ~var4.field8476 || ~arg0.field8309 == ~var4.field8500 || arg0.field8309 == var4.field8496) {
                        var3 = var2.field166;
                    }
                } else {
                    var3 = var2.field110;
                }
            } else {
                var3 = var2.field145;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(II)[[I", line = 131)
    public final int[][] method445(int arg0, int arg1) {
        ++field3524;
        if (arg1 != 0) {
            return null;
        } else {
            int[][] var3 = super.field10420.method930(29784, arg0);
            if (super.field10420.field1979) {
                int[][] var4 = this.method4159(0, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class424.field5889 > var11; ++var11) {
                    var8[var11] = -var5[var11] + 4096;
                    var9[var11] = 4096 - var6[var11];
                    var10[var11] = 4096 - var7[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IIII)I", line = 178)
    public static final int method1612(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -29100) {
            field3528 = null;
        }
        ++field3532;
        int var4 = arg3 & 3;
        if (~var4 == -1) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else {
            return var4 == 2 ? 7 - arg1 : -arg2 + 7;
        }
    }

    @OriginalMember(owner = "client!aia", name = "<init>", descriptor = "()V", line = 202)
    public class259() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(BII)V", line = 205)
    public static final void method1613(byte arg0, int arg1, int arg2) {
        ++field3525;
        if (class410.field5731 != null) {
            int var3 = class209.field2976;
            int var4 = class446.field6100;
            class95.method651(-1300621791, arg1, arg2);
            if (~class589.field8461 != -1) {
                if (~class589.field8461 == -2 && (class264.field3599 == null || ~class209.field2976 != ~var3 || class446.field6100 != var4)) {
                    class264.field3599 = new class279[class446.field6100 * class209.field2976];
                    for (int var5 = 0; ~var5 > ~class264.field3599.length; ++var5) {
                        class264.field3599[var5] = class410.field5731.method584(class410.field5731.method600(class61.field829, class459.field6317), class410.field5731.method628(class61.field829, class459.field6317));
                    }
                    class677.field9538 = 1;
                    class38.field530 = new int[class446.field6100 * class209.field2976];
                }
            } else {
                class637.field9059 = null;
                class637.field9059 = class410.field5731.method584(class410.field5731.method600(class577.field8260, class647.field9167), class410.field5731.method628(class577.field8260, class647.field9167));
            }
            if (arg0 != -21) {
                field3528 = null;
            }
            class380.field5357 = true;
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 250)
    public static final int method1614(String arg0, byte arg1) {
        ++field3526;
        if (arg1 < 25) {
            method1612(-87, 109, -56, -25);
        }
        return arg0.length() - -2;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IZLvj;)V", line = 266)
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        if (arg1) {
            method1609((byte) -47, (String) null, (class557) null, true);
        }
        if (arg0 == 0) {
            super.field10414 = ~arg2.method194((byte) 119) == -2;
        }
        ++field3529;
    }
}
