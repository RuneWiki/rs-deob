import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class311 extends class600 {

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "Z")
    public static boolean field4321 = false;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    public static int field4338 = 0;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "Lsd;")
    public static class95 field4330 = new class95();

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "Lmi;")
    private class496 field4324;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "Lmi;")
    private class496 field4325;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "Lmi;")
    private class496 field4328;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "Lmi;")
    private class496 field4329;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "Lmi;")
    private class496 field4333;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "Lmi;")
    public class496 field4336;

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lin;Lin;Lum;)V")
    public class311(class91 arg0, class91 arg1, class524 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)[I")
    public static final int[] method2023(int arg0) {
        ++field4332;
        if (arg0 != 1084489728) {
            method2029((byte) 33);
        }
        return new int[] { class120.field2056, class691.field9325, class307.field4264 };
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)Z")
    public final boolean method1470(byte arg0) {
        ++field4337;
        if (!super.method1470((byte) -125)) {
            return false;
        } else {
            class524 var2 = (class524) super.field8228;
            if (!super.field8225.method874(false, var2.field7262)) {
                return false;
            } else if (!super.field8225.method874(false, var2.field7258)) {
                return false;
            } else if (!super.field8225.method874(false, var2.field7266)) {
                return false;
            } else if (!super.field8225.method874(false, var2.field7265)) {
                return false;
            } else {
                int var3 = 47 / ((25 - arg0) / 52);
                if (!super.field8225.method874(false, var2.field7263)) {
                    return false;
                } else {
                    return super.field8225.method874(false, var2.field7260);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)I")
    public static final int method2024(int arg0, byte arg1) {
        if (arg1 > 0) {
            field4338 = 48;
        }
        ++field4326;
        return 255 & arg0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIBII)V")
    public void method2025(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        this.field4336.method2923(arg3, arg0, arg4, arg1);
        ++field4327;
        if (arg2 <= 21) {
            this.method1470((byte) 68);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIILfe;IIII)Z")
    public static final boolean method2026(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class570 arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field4334;
        int var11 = arg9;
        int var12 = arg2;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = -var13 + arg9;
        class184.field2786[var13][var14] = 99;
        int var16 = -var14 + arg2;
        class426.field6133[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class641.field8811[var17] = arg9;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class201.field2919[var10001] = arg2;
        int[][] var19 = arg6.field7832;
        while (var26 != var18) {
            var12 = class201.field2919[var18];
            var11 = class641.field8811[var18];
            int var20 = -arg6.field7835 + var12;
            int var21 = -var15 + var11;
            int var22 = var12 - var16;
            int var23 = -arg6.field7847 + var11;
            var18 = 4095 & var18 + 1;
            if (arg7 != -4) {
                if (arg7 != -3) {
                    if (~arg7 != 1) {
                        if (arg7 != -1) {
                            if (arg7 != 0 && ~arg7 != -2 && ~arg7 != -3 && ~arg7 != -4 && arg7 != 9) {
                                if (arg6.method3302(arg1, var12, arg0, var11, arg7, 1, arg3, 1)) {
                                    class443.field6294 = var11;
                                    class375.field5309 = var12;
                                    return true;
                                }
                            } else if (arg6.method3293(arg0, var12, 1, arg3, var11, arg1, arg7, 91)) {
                                class375.field5309 = var12;
                                class443.field6294 = var11;
                                return true;
                            }
                        } else if (arg6.method3301(var11, (byte) 110, arg1, 1, arg8, arg5, arg4, var12, arg0)) {
                            class443.field6294 = var11;
                            class375.field5309 = var12;
                            return true;
                        }
                    } else if (arg6.method3295(-28388, arg0, arg4, 1, arg8, var11, 1, var12, arg1, arg5)) {
                        class375.field5309 = var12;
                        class443.field6294 = var11;
                        return true;
                    }
                } else if (class555.method3192(arg5, arg1, -1, 1, var11, var12, arg0, 1, arg8)) {
                    class375.field5309 = var12;
                    class443.field6294 = var11;
                    return true;
                }
            } else if (arg0 == var11 && ~arg1 == ~var12) {
                class443.field6294 = var11;
                class375.field5309 = var12;
                return true;
            }
            int var25 = class426.field6133[var21][var22] + 1;
            if (~var21 < -1 && ~class184.field2786[var21 + -1][var22] == -1 && (var19[var23 + -1][var20] & 1109655552) == 0) {
                class641.field8811[var26] = var11 + -1;
                class201.field2919[var26] = var12;
                var26 = 4095 & var26 - -1;
                class184.field2786[var21 + -1][var22] = 2;
                class426.field6133[var21 + -1][var22] = var25;
            }
            if (~var21 > -128 && class184.field2786[var21 + 1][var22] == 0 && ~(1612972032 & var19[var23 + 1][var20]) == -1) {
                class641.field8811[var26] = var11 + 1;
                class201.field2919[var26] = var12;
                class184.field2786[var21 + 1][var22] = 8;
                var26 = 4095 & var26 - -1;
                class426.field6133[var21 + 1][var22] = var25;
            }
            if (~var22 < -1 && ~class184.field2786[var21][var22 + -1] == -1 && (var19[var23][var20 - 1] & 1084489728) == 0) {
                class641.field8811[var26] = var11;
                class201.field2919[var26] = var12 + -1;
                class184.field2786[var21][var22 + -1] = 1;
                var26 = 4095 & var26 + 1;
                class426.field6133[var21][var22 + -1] = var25;
            }
            if (var22 < 127 && ~class184.field2786[var21][var22 + 1] == -1 && (1210318848 & var19[var23][var20 - -1]) == 0) {
                class641.field8811[var26] = var11;
                class201.field2919[var26] = var12 + 1;
                class184.field2786[var21][var22 - -1] = 4;
                var26 = 4095 & var26 + 1;
                class426.field6133[var21][var22 + 1] = var25;
            }
            if (~var21 < -1 && var22 > 0 && ~class184.field2786[var21 + -1][var22 + -1] == -1 && ~(var19[var23 + -1][var20 - 1] & 1134821376) == -1 && (var19[var23 + -1][var20] & 1109655552) == 0 && ~(1084489728 & var19[var23][var20 - 1]) == -1) {
                class641.field8811[var26] = var11 + -1;
                class201.field2919[var26] = var12 - 1;
                var26 = var26 + 1 & 4095;
                class184.field2786[var21 + -1][var22 + -1] = 3;
                class426.field6133[var21 + -1][var22 + -1] = var25;
            }
            if (~var21 > -128 && ~var22 < -1 && ~class184.field2786[var21 + 1][var22 - 1] == -1 && ~(1625554944 & var19[var23 - -1][var20 + -1]) == -1 && ~(var19[var23 + 1][var20] & 1612972032) == -1 && ~(var19[var23][var20 + -1] & 1084489728) == -1) {
                class641.field8811[var26] = var11 + 1;
                class201.field2919[var26] = var12 - 1;
                var26 = 4095 & var26 + 1;
                class184.field2786[var21 + 1][var22 + -1] = 9;
                class426.field6133[var21 + 1][var22 + -1] = var25;
            }
            if (~var21 < -1 && ~var22 > -128 && class184.field2786[var21 + -1][var22 - -1] == 0 && ~(var19[var23 + -1][var20 - -1] & 1310982144) == -1 && ~(1109655552 & var19[var23 - 1][var20]) == -1 && (1210318848 & var19[var23][var20 + 1]) == 0) {
                class641.field8811[var26] = var11 - 1;
                class201.field2919[var26] = var12 + 1;
                class184.field2786[var21 + -1][var22 - -1] = 6;
                var26 = var26 + 1 & 4095;
                class426.field6133[var21 + -1][var22 + 1] = var25;
            }
            if (var21 < 127 && var22 < 127 && ~class184.field2786[var21 + 1][var22 + 1] == -1 && (2015625216 & var19[var23 - -1][var20 + 1]) == 0 && (1612972032 & var19[var23 + 1][var20]) == 0 && (1210318848 & var19[var23][var20 - -1]) == 0) {
                class641.field8811[var26] = var11 - -1;
                class201.field2919[var26] = var12 + 1;
                class184.field2786[var21 + 1][var22 + 1] = 12;
                var26 = 4095 & var26 + 1;
                class426.field6133[var21 + 1][var22 + 1] = var25;
            }
        }
        if (arg10 != 1109655552) {
            field4321 = false;
        }
        class443.field6294 = var11;
        class375.field5309 = var12;
        return false;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZBI)V")
    public final void method2027(int arg0, boolean arg1, byte arg2, int arg3) {
        if (arg1) {
            int[] var5 = new int[4];
            class272.field3822.method206(var5);
            class272.field3822.method303(arg0, arg3, arg0 - -super.field8228.field2325, super.field8228.field2317 + arg3);
            int var6 = this.field4328.method1618();
            int var7 = this.field4328.method1614();
            int var8 = this.field4325.method1618();
            int var9 = this.field4325.method1614();
            this.field4328.method2925(arg0, arg3 - -((-var7 + super.field8228.field2317) / 2));
            this.field4325.method2925(-var8 + arg0 + super.field8228.field2325, (-var9 + super.field8228.field2317) / 2 + arg3);
            class272.field3822.method303(arg0, arg3, super.field8228.field2325 + arg0, arg3 - -this.field4329.method1614());
            this.field4329.method2923(arg0 + var6, arg3, -var6 + super.field8228.field2325 - var8, super.field8228.field2317);
            int var10 = this.field4324.method1614();
            class272.field3822.method303(arg0, -var10 + arg3 - -super.field8228.field2317, super.field8228.field2325 + arg0, super.field8228.field2317 + arg3);
            this.field4324.method2923(arg0 + var6, -var10 + arg3 + super.field8228.field2317, -var6 + super.field8228.field2325 + -var8, super.field8228.field2317);
            class272.field3822.method303(var5[0], var5[1], var5[2], var5[3]);
        }
        ++field4320;
        if (arg2 > -6) {
            this.field4333 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)[Lhv;")
    public static final class519[] method2028(byte arg0) {
        ++field4331;
        int var1 = -7 / ((-67 - arg0) / 44);
        return new class519[] { class250.field3607, class250.field3609, class250.field3610, class250.field3611, class250.field3612, class250.field3613, class250.field3614, class250.field3615, class250.field3616, class250.field3617, class250.field3618, class250.field3619, class250.field3620, class250.field3621 };
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V")
    public static void method2029(byte arg0) {
        if (arg0 < 112) {
            field4338 = -87;
        }
        field4330 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIZ)V")
    public final void method2030(int arg0, int arg1, int arg2, boolean arg3) {
        int var5 = -45 / ((-20 - arg0) / 57);
        ++field4322;
        int var6 = this.field4328.method1618() + arg2;
        int var7 = super.field8228.field2325 + arg2 + -this.field4325.method1618();
        int var8 = arg1 - -this.field4329.method1614();
        int var9 = super.field8228.field2317 + arg1 - this.field4324.method1614();
        int var10 = -var6 + var7;
        int var11 = -var8 + var9;
        int var12 = this.method3415(124) * var10 / 10000;
        int[] var13 = new int[4];
        class272.field3822.method206(var13);
        class272.field3822.method303(var6, var8, var6 + var12, var9);
        this.method2025(var8, var11, (byte) 33, var6, var10);
        class272.field3822.method303(var6 + var12, var8, var7, var9);
        this.field4333.method2923(var6, var8, var10, var11);
        class272.field3822.method303(var13[0], var13[1], var13[2], var13[3]);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public final void method1474(int arg0) {
        super.method1474(arg0);
        ++field4323;
        class524 var2 = (class524) super.field8228;
        this.field4336 = class392.method2467(var2.field7262, (byte) -19, super.field8225);
        this.field4333 = class392.method2467(var2.field7258, (byte) 106, super.field8225);
        this.field4328 = class392.method2467(var2.field7266, (byte) -19, super.field8225);
        this.field4325 = class392.method2467(var2.field7265, (byte) -121, super.field8225);
        this.field4329 = class392.method2467(var2.field7263, (byte) 124, super.field8225);
        this.field4324 = class392.method2467(var2.field7260, (byte) 115, super.field8225);
    }
}
