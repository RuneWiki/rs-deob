import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class394 extends class145 {

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    private int field5515 = 0;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "I")
    private int field5509 = 1;

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
    private int field5512 = 0;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    public static int field5511 = 0;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    public static int field5510 = 2;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "Ltd;")
    public static class107 field5513 = new class107();

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "F")
    public static float field5520;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "Lwn;")
    public static class77 field5517;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "[I")
    public static int[] field5518;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(B)V")
    public final void method87(byte arg0) {
        ++field5516;
        class377.method2347(arg0 ^ -34);
        if (arg0 != 77) {
            field5517 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    public class394() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V")
    public static void method2424(int arg0) {
        field5517 = null;
        field5513 = null;
        field5518 = null;
        int var1 = 83 % ((arg0 - 12) / 34);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        int var3 = 94 % ((arg1 - 16) / 49);
        ++field5514;
        int[] var4 = super.field2218.method1614(42, arg0);
        if (super.field2218.field3396) {
            int var5 = class134.field1902[arg0];
            int var6 = var5 + -2048 >> 1;
            for (int var7 = 0; var7 < class156.field2364; ++var7) {
                int var8 = class229.field3181[var7];
                int var9 = var8 + -2048 >> 1;
                int var12;
                if (~this.field5515 != -1) {
                    int var10 = var9 * var9 - -(var6 * var6) >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var12 = (int) ((double) (this.field5509 * var11) * 3.141592653589793D);
                } else {
                    var12 = (-var5 + var8) * this.field5509;
                }
                int var13 = var12 - (var12 & -4096);
                if (~this.field5512 == -1) {
                    var13 = class100.field1444[var13 >> 4 & 255] + 4096 >> 1;
                } else if (~this.field5512 == -3) {
                    var13 -= 2048;
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    var13 = -var13 + 2048 << 1;
                }
                var4[var7] = var13;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BIIIILoa;IIIII)Z")
    public static final boolean method2425(byte arg0, int arg1, int arg2, int arg3, int arg4, class151 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field5519;
        int var11 = arg10;
        int var12 = arg9;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = -var13 + arg10;
        int var16 = -var14 + arg9;
        class161.field2398[var13][var14] = 99;
        class416.field5822[var13][var14] = 0;
        byte var17 = 0;
        class358.field4854[var17] = arg10;
        int var18 = 0;
        byte var10001 = var17;
        int var27 = var17 + 1;
        class52.field847[var10001] = arg9;
        int var19 = 121 / ((56 - arg0) / 39);
        int[][] var20 = arg5.field2303;
        while (~var27 != ~var18) {
            var11 = class358.field4854[var18];
            var12 = class52.field847[var18];
            int var21 = -var15 + var11;
            int var22 = var12 - var16;
            var18 = 4095 & var18 + 1;
            int var23 = -arg5.field2320 + var11;
            int var24 = var12 - arg5.field2316;
            if (arg6 != -4) {
                if (~arg6 != 2) {
                    if (arg6 != -2) {
                        if (arg6 != -1) {
                            if (arg6 != 0 && arg6 != 1 && arg6 != 2 && arg6 != 3 && ~arg6 != -10) {
                                if (arg5.method1165(arg6, arg3, 2, -15410, arg7, var11, var12, arg8)) {
                                    class286.field3826 = var11;
                                    class268.field3612 = var12;
                                    return true;
                                }
                            } else if (arg5.method1155((byte) 36, 2, arg8, arg6, arg7, var11, var12, arg3)) {
                                class268.field3612 = var12;
                                class286.field3826 = var11;
                                return true;
                            }
                        } else if (arg5.method1156(arg2, 1, arg7, arg8, var11, 2, var12, arg4, arg1)) {
                            class268.field3612 = var12;
                            class286.field3826 = var11;
                            return true;
                        }
                    } else if (arg5.method1161(2, arg7, var12, (byte) -49, var11, arg8, arg1, arg2, arg4, 2)) {
                        class268.field3612 = var12;
                        class286.field3826 = var11;
                        return true;
                    }
                } else if (class448.method2791(arg4, var11, arg8, (byte) 127, 2, var12, arg1, arg7, 2)) {
                    class286.field3826 = var11;
                    class268.field3612 = var12;
                    return true;
                }
            } else if (arg8 == var11 && arg7 == var12) {
                class268.field3612 = var12;
                class286.field3826 = var11;
                return true;
            }
            int var26 = class416.field5822[var21][var22] + 1;
            if (~var21 < -1 && ~class161.field2398[var21 + -1][var22] == -1 && ~(1134821376 & var20[var23 + -1][var24]) == -1 && ~(1310982144 & var20[var23 - 1][var24 + 1]) == -1) {
                class358.field4854[var27] = var11 + -1;
                class52.field847[var27] = var12;
                class161.field2398[var21 + -1][var22] = 2;
                var27 = var27 + 1 & 4095;
                class416.field5822[var21 + -1][var22] = var26;
            }
            if (~var21 > -127 && class161.field2398[var21 + 1][var22] == 0 && (var20[var23 - -2][var24] & 1625554944) == 0 && ~(2015625216 & var20[var23 + 2][var24 + 1]) == -1) {
                class358.field4854[var27] = var11 + 1;
                class52.field847[var27] = var12;
                var27 = 4095 & var27 + 1;
                class161.field2398[var21 + 1][var22] = 8;
                class416.field5822[var21 + 1][var22] = var26;
            }
            if (var22 > 0 && class161.field2398[var21][var22 - 1] == 0 && ~(1134821376 & var20[var23][var24 - 1]) == -1 && ~(1625554944 & var20[var23 + 1][var24 + -1]) == -1) {
                class358.field4854[var27] = var11;
                class52.field847[var27] = var12 + -1;
                var27 = 4095 & var27 - -1;
                class161.field2398[var21][var22 + -1] = 1;
                class416.field5822[var21][var22 - 1] = var26;
            }
            if (~var22 > -127 && class161.field2398[var21][var22 + 1] == 0 && ~(var20[var23][var24 + 2] & 1310982144) == -1 && (var20[var23 + 1][var24 - -2] & 2015625216) == 0) {
                class358.field4854[var27] = var11;
                class52.field847[var27] = var12 + 1;
                var27 = var27 + 1 & 4095;
                class161.field2398[var21][var22 + 1] = 4;
                class416.field5822[var21][var22 + 1] = var26;
            }
            if (~var21 < -1 && var22 > 0 && ~class161.field2398[var21 + -1][var22 + -1] == -1 && ~(1336147968 & var20[var23 + -1][var24]) == -1 && (1134821376 & var20[var23 + -1][var24 + -1]) == 0 && (var20[var23][var24 + -1] & 1675886592) == 0) {
                class358.field4854[var27] = var11 + -1;
                class52.field847[var27] = var12 + -1;
                class161.field2398[var21 - 1][var22 - 1] = 3;
                var27 = var27 + 1 & 4095;
                class416.field5822[var21 + -1][var22 + -1] = var26;
            }
            if (var21 < 126 && var22 > 0 && class161.field2398[var21 - -1][var22 + -1] == 0 && ~(var20[var23 + 1][var24 + -1] & 1675886592) == -1 && ~(1625554944 & var20[var23 + 2][var24 + -1]) == -1 && ~(var20[var23 + 2][var24] & 2028208128) == -1) {
                class358.field4854[var27] = var11 + 1;
                class52.field847[var27] = var12 + -1;
                var27 = 4095 & var27 + 1;
                class161.field2398[var21 + 1][var22 + -1] = 9;
                class416.field5822[var21 + 1][var22 + -1] = var26;
            }
            if (~var21 < -1 && var22 < 126 && ~class161.field2398[var21 + -1][var22 + 1] == -1 && ~(var20[var23 + -1][var24 - -1] & 1336147968) == -1 && (var20[var23 + -1][var24 - -2] & 1310982144) == 0 && ~(2116288512 & var20[var23][var24 + 2]) == -1) {
                class358.field4854[var27] = var11 - 1;
                class52.field847[var27] = var12 + 1;
                var27 = 4095 & var27 + 1;
                class161.field2398[var21 - 1][var22 - -1] = 6;
                class416.field5822[var21 + -1][var22 + 1] = var26;
            }
            if (~var21 > -127 && ~var22 > -127 && class161.field2398[var21 + 1][var22 + 1] == 0 && ~(var20[var23 + 1][var24 + 2] & 2116288512) == -1 && (2015625216 & var20[var23 + 2][var24 + 2]) == 0 && (2028208128 & var20[var23 + 2][var24 - -1]) == 0) {
                class358.field4854[var27] = var11 + 1;
                class52.field847[var27] = var12 + 1;
                class161.field2398[var21 + 1][var22 + 1] = 12;
                var27 = var27 + 1 & 4095;
                class416.field5822[var21 + 1][var22 - -1] = var26;
            }
        }
        class286.field3826 = var11;
        class268.field3612 = var12;
        return false;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lap;BI)V")
    public final void method2(class289 arg0, byte arg1, int arg2) {
        int var4 = 57 / ((11 - arg1) / 52);
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 3) {
                    this.field5509 = arg0.method1861((byte) -72);
                }
            } else {
                this.field5512 = arg0.method1861((byte) -72);
            }
        } else {
            this.field5515 = arg0.method1861((byte) -72);
        }
        ++field5508;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(II)Lsk;")
    public static final class170 method2426(int arg0, int arg1) {
        ++field5522;
        class410 var2 = class107.field1569;
        class170 var3;
        synchronized (class107.field1569) {
            var3 = (class170) class107.field1569.method2537(-71, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class109.field1585.method2633(arg0, -1, 16);
            if (arg1 >= -22) {
                method2426(-52, 48);
            }
            class170 var5 = new class170();
            if (var4 != null) {
                var5.method1277(new class289(var4), 126);
            }
            class410 var6 = class107.field1569;
            synchronized (class107.field1569) {
                class107.field1569.method2542(var5, (byte) -112, (long) arg0);
                return var5;
            }
        }
    }
}
