import java.awt.Container;
import java.awt.Insets;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class267 implements Runnable {

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "Z")
    public boolean field3636 = true;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field3634 = new Object();

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "[I")
    public int[] field3645 = new int[500];

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "[I")
    public int[] field3643 = new int[500];

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    public int field3642 = 0;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "Lmk;")
    public static class154 field3635 = new class154();

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3640 = "Loading defaults - ";

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3644 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "Lam;")
    public static class286 field3641;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "Lclient;")
    public static client field3646;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field3628;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIILlo;IIIILlo;)V", line = 4)
    public static final void method1484(int arg0, int arg1, int arg2, int arg3, class419 arg4, int arg5, int arg6, int arg7, int arg8, class419 arg9) {
        field3632++;
        int var10 = arg9.method500((byte) -83);
        if (arg3 == var10) {
            return;
        }
        Object var11 = null;
        class20 var12 = (class20) client.field3468.method616(arg3 ^ 0xFFFFFF8B, (long) var10);
        if (var12 == null) {
            class241[] var13 = class241.method1291(class72.field797, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class88.field1003.method1633(var13[0], true);
            client.field3468.method615((byte) -126, (long) var10, var12);
        }
        class24.method128(arg4.method857((byte) -106) * 64, arg4.field154, arg4.field152, arg1, arg7 >> 1, 0, arg5 >> 1, arg6, -129);
        int var14 = class155.field1969[0] + arg2 - 18;
        int var15 = arg0 / 4 * 18 + var14;
        int var16 = class155.field1969[1] + arg8 - 16 - 54;
        int var17 = arg0 % 4 * 18 + var16;
        var12.method93(var15, var17);
        if (arg4 == arg9) {
            class88.field1003.method1862(18, 18, var15 - 1, var17 - 1, (byte) 3, -256);
        }
        class173 var18 = class248.method1321(-90);
        var18.field2169 = arg9;
        var18.field2167 = var17 + 16;
        var18.field2172 = var15;
        var18.field2170 = var15 + 16;
        var18.field2173 = var17;
        class156.field1973.method992(var18, 102);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIBLqs;IIIII)Z", line = 53)
    public static final boolean method1485(int arg0, int arg1, int arg2, int arg3, byte arg4, class438 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3629++;
        int var11 = arg8;
        int var12 = arg0;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg8 - var13;
        int var16 = arg0 - var14;
        class414.field5972[var13][var14] = 99;
        class392.field5642[var13][var14] = 0;
        byte var17 = 0;
        if (arg4 != -98) {
            return false;
        }
        class167.field2121[var17] = arg8;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class307.field4155[var10001] = arg0;
        int[][] var19 = arg5.field6422;
        while (var26 != var18) {
            var11 = class167.field2121[var18];
            var12 = class307.field4155[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            int var22 = var11 - arg5.field6415;
            int var23 = var12 - arg5.field6423;
            if (arg2 == -4) {
                if (arg10 == var11 && arg1 == var12) {
                    class233.field3213 = var12;
                    class310.field4182 = var11;
                    return true;
                }
            } else if (arg2 == -3) {
                if (class278.method1533(arg10, arg1, var11, var12, 2, 2, (byte) -52, arg6, arg7)) {
                    class233.field3213 = var12;
                    class310.field4182 = var11;
                    return true;
                }
            } else if (arg2 == -2) {
                if (arg5.method2717(2, (byte) -118, arg1, 2, var11, arg7, arg3, arg6, arg10, var12)) {
                    class310.field4182 = var11;
                    class233.field3213 = var12;
                    return true;
                }
            } else if (arg2 == -1) {
                if (arg5.method2703(arg1, arg7, -1, arg10, var12, 2, arg3, var11, arg6)) {
                    class310.field4182 = var11;
                    class233.field3213 = var12;
                    return true;
                }
            } else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
                if (arg5.method2707(2, arg9, arg4 + 162, var11, arg2, var12, arg10, arg1)) {
                    class233.field3213 = var12;
                    class310.field4182 = var11;
                    return true;
                }
            } else if (arg5.method2708(-1, arg2, arg1, var11, arg10, 2, arg9, var12)) {
                class310.field4182 = var11;
                class233.field3213 = var12;
                return true;
            }
            int var25 = class392.field5642[var20][var21] + 1;
            if (var20 > 0 && class414.field5972[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class167.field2121[var26] = var11 - 1;
                class307.field4155[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class414.field5972[var20 - 1][var21] = 2;
                class392.field5642[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class414.field5972[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class167.field2121[var26] = var11 + 1;
                class307.field4155[var26] = var12;
                class414.field5972[var20 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class392.field5642[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class414.field5972[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class167.field2121[var26] = var11;
                class307.field4155[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class414.field5972[var20][var21 - 1] = 1;
                class392.field5642[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class414.field5972[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class167.field2121[var26] = var11;
                class307.field4155[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class414.field5972[var20][var21 + 1] = 4;
                class392.field5642[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class414.field5972[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class167.field2121[var26] = var11 - 1;
                class307.field4155[var26] = var12 - 1;
                class414.field5972[var20 - 1][var21 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class392.field5642[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class414.field5972[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class167.field2121[var26] = var11 + 1;
                class307.field4155[var26] = var12 - 1;
                class414.field5972[var20 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class392.field5642[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class414.field5972[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class167.field2121[var26] = var11 - 1;
                class307.field4155[var26] = var12 + 1;
                class414.field5972[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class392.field5642[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class414.field5972[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class167.field2121[var26] = var11 + 1;
                class307.field4155[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class414.field5972[var20 + 1][var21 + 1] = 12;
                class392.field5642[var20 + 1][var21 + 1] = var25;
            }
        }
        class233.field3213 = var12;
        class310.field4182 = var11;
        return false;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V", line = 406)
    public static final void method1486(int arg0, int arg1, int arg2) {
        field3630++;
        if (arg2 == 1808) {
            class40 var3 = class162.method872(arg1, (byte) 92, 1);
            var3.method190(0);
            var3.field418 = arg0;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V", line = 425)
    public static final void method1487(int arg0) {
        if (class450.field6535.toLowerCase().indexOf("microsoft") == -1) {
            class274.field3699[44] = 71;
            class274.field3699[93] = 43;
            class274.field3699[91] = 42;
            class274.field3699[92] = 74;
            class274.field3699[45] = 26;
            if (class450.field6552 == null) {
                class274.field3699[192] = 58;
                class274.field3699[222] = 59;
            } else {
                class274.field3699[520] = 59;
                class274.field3699[192] = 28;
                class274.field3699[222] = 58;
            }
            class274.field3699[47] = 73;
            class274.field3699[61] = 27;
            class274.field3699[59] = 57;
            class274.field3699[46] = 72;
        } else {
            class274.field3699[222] = 59;
            class274.field3699[191] = 73;
            class274.field3699[223] = 28;
            class274.field3699[220] = 74;
            class274.field3699[221] = 43;
            class274.field3699[188] = 71;
            class274.field3699[219] = 42;
            class274.field3699[187] = 27;
            class274.field3699[190] = 72;
            class274.field3699[186] = 57;
            class274.field3699[189] = 26;
            class274.field3699[192] = 58;
        }
        field3631++;
        int var1 = 113 % ((arg0 - 75) / 47);
    }

    @OriginalMember(owner = "client!eo", name = "run", descriptor = "()V", line = 477)
    public final void run() {
        while (this.field3636) {
            Object var1 = this.field3634;
            synchronized (this.field3634) {
                if (this.field3642 < 500) {
                    this.field3643[this.field3642] = class337.field4493;
                    this.field3645[this.field3642] = class306.field4146;
                    this.field3642++;
                }
            }
            class370.method2235(50L, 10);
        }
        field3639++;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIIZ)V", line = 499)
    public static final void method1488(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3637++;
        if (arg5) {
            class328.method1883(91);
        }
        if (class171.field2153 != null && (arg1 != 3 || class444.field6490 != arg0 || class335.field4449 != arg2)) {
            class279.method1544(class171.field2153, class159.field2055, (byte) 115);
            class171.field2153 = null;
        }
        if (arg1 == 3 && class171.field2153 == null) {
            class171.field2153 = class270.method1498(arg2, 0, 0, arg0, class159.field2055, (byte) -38);
            if (class171.field2153 != null) {
                class444.field6490 = arg0;
                class335.field4449 = arg2;
                class340.method1982(6288, class159.field2055);
            }
        }
        if (arg1 == 3 && class171.field2153 == null) {
            method1488(-1, class284.field3877, -1, arg3, 4005, true);
            return;
        }
        if (arg4 != 4005) {
            method1486(-6, 72, 75);
        }
        Container var7;
        if (class171.field2153 != null) {
            class154.field1947 = arg0;
            var7 = class171.field2153;
            class216.field2894 = arg2;
        } else if (class213.field2888 == null) {
            var7 = class159.field2055.field6532;
            class154.field1947 = var7.getSize().width;
            class216.field2894 = var7.getSize().height;
        } else {
            Insets var6 = class213.field2888.getInsets();
            class154.field1947 = class213.field2888.getSize().width - var6.left - var6.right;
            int var10001 = var6.top + var6.bottom;
            class216.field2894 = class213.field2888.getSize().height - var10001;
            var7 = class213.field2888;
        }
        if (arg1 == 1) {
            class333.field4423 = 765;
            class266.field3626 = 0;
            class337.field4496 = 503;
            class373.field5207 = (class154.field1947 - 765) / 2;
        } else if (class436.field6389 < 96 && class101.field1182 == 0) {
            int var8 = class154.field1947 > 1024 ? 1024 : class154.field1947;
            class373.field5207 = (class154.field1947 - var8) / 2;
            int var9 = class216.field2894 <= 768 ? class216.field2894 : 768;
            class333.field4423 = var8;
            class266.field3626 = 0;
            class337.field4496 = var9;
        } else {
            class333.field4423 = class154.field1947;
            class337.field4496 = class216.field2894;
            class266.field3626 = 0;
            class373.field5207 = 0;
        }
        if (class429.field6292 != 0) {
            boolean var10000;
            if (class333.field4423 < 1024 && class337.field4496 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg5) {
            class429.method2657(class101.field1182, 616516448);
        } else {
            class38.field391.setSize(class333.field4423, class337.field4496);
            if (class88.field1003 != null) {
                class88.field1003.method1638();
            }
            if (class213.field2888 == var7) {
                Insets var10 = class213.field2888.getInsets();
                class38.field391.setLocation(class373.field5207 + var10.left, var10.top - -class266.field3626);
            } else {
                class38.field391.setLocation(class373.field5207, class266.field3626);
            }
        }
        if (arg1 < 2) {
            class155.field1970 = false;
        } else {
            class155.field1970 = true;
        }
        if (class272.field3680 != -1) {
            class149.method798(true, false);
        }
        if (class264.field3605 != null && (class129.field1664 == 30 || class129.field1664 == 25)) {
            class96.method526((byte) -98);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class321.field4290[var11] = true;
        }
        class213.field2886 = true;
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V", line = 656)
    public static void method1489(int arg0) {
        field3641 = null;
        field3635 = null;
        field3646 = null;
        field3644 = null;
        field3628 = null;
        if (arg0 != 1) {
            method1490((class286) null, true, -17, (class286) null);
        }
        field3640 = null;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lam;ZILam;)V", line = 676)
    public static final void method1490(class286 arg0, boolean arg1, int arg2, class286 arg3) {
        class339.field4513 = arg0;
        class216.field2900 = arg3;
        field3633++;
        class12.field118 = arg1;
        int var4 = class339.field4513.method1676(127) - 1;
        class7.field65 = var4 * 256 + class339.field4513.method1691(var4, 0);
        if (arg2 > -120) {
            method1484(-69, -5, 57, -112, (class419) null, 5, 123, 19, -118, (class419) null);
        }
        class14.field136 = new String[] { null, null, null, null, class209.field2839 };
        class324.field4322 = new String[] { null, null, class175.field2196, null, null };
    }
}
