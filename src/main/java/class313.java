import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class313 extends class316 implements class18 {

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "B")
    private byte field4732;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "S")
    private short field4728;

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "Z")
    private boolean field4723;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "B")
    private byte field4710;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "Z")
    private boolean field4715;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "Z")
    private boolean field4730;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "Z")
    private boolean field4725;

    @OriginalMember(owner = "client!uk", name = "Y", descriptor = "Lwp;")
    private class292 field4738;

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "Lqn;")
    private class380 field4733;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!uk", name = "H", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!uk", name = "V", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!uk", name = "W", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!uk", name = "X", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!uk", name = "Z", descriptor = "I")
    public static int field4739;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uk", name = "ab", descriptor = "Ljava/lang/Class;")
    public static Class field4740;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V")
    public final void method116(byte arg0) {
        this.field4723 = false;
        if (arg0 >= -45) {
            this.field4715 = true;
        }
        ++field4712;
        if (this.field4738 != null) {
            this.field4738.method1277(-32769 & this.field4738.method1274());
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)Lhn;")
    public static final class57 method1909(int arg0, int arg1) {
        ++field4707;
        class57 var2 = (class57) class319.field4812.method1491((long) arg1, 0);
        if (var2 != null) {
            return var2;
        } else {
            int var3 = -106 / ((-13 - arg0) / 42);
            byte[] var4 = class118.field1553.method823(33, -20334, arg1);
            class57 var5 = new class57();
            if (var4 != null) {
                var5.method323(new class385(var4), arg1, (byte) 6);
            }
            class319.field4812.method1488(128, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ldr;IB)Lwp;")
    public final class292 method12(class261 arg0, int arg1, byte arg2) {
        int var4 = -15 % ((arg2 - 46) / 47);
        ++field4737;
        return this.method1910(arg0, arg1, (byte) 111);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(Ldr;IB)Lwp;")
    private final class292 method1910(class261 arg0, int arg1, byte arg2) {
        ++field4735;
        if (this.field4738 != null && ~arg0.method372(this.field4738.method1274(), arg1) == -1) {
            return this.field4738;
        } else {
            if (arg2 != 111) {
                this.method1915((class261) null, 4, true, 0);
            }
            class221 var4 = this.method1915(arg0, -64, false, arg1);
            return var4 == null ? null : var4.field3362;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLdr;)V")
    public final void method2(byte arg0, class261 arg1) {
        ++field4713;
        Object var3 = null;
        if (arg0 == 76) {
            class380 var5;
            if (this.field4733 == null && this.field4725) {
                class221 var4 = this.method1915(arg1, -64, true, 131072);
                var5 = var4 != null ? var4.field3366 : null;
            } else {
                var5 = this.field4733;
                this.field4733 = null;
            }
            if (var5 != null) {
                class177.method1080(var5, this.field4710, super.field4778, super.field4785, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZILla;IIILdr;)V")
    public final void method117(boolean arg0, int arg1, class269 arg2, int arg3, int arg4, int arg5, class261 arg6) {
        ++field4736;
        if (arg1 != 0) {
            this.field4715 = true;
        }
        if (arg2 instanceof class313) {
            class313 var8 = (class313) arg2;
            if (this.field4738 != null && var8.field4738 != null) {
                this.field4738.method1273(var8.field4738, arg3, arg4, arg5, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIZ[Lek;ILdr;[BII)[I")
    public static final int[] method1911(int arg0, int arg1, int arg2, boolean arg3, class375[] arg4, int arg5, class261 arg6, byte[] arg7, int arg8, int arg9) {
        ++field4709;
        if (!arg3) {
            for (int var10 = 0; var10 < 4; ++var10) {
                class375 var11 = arg4[var10];
                for (int var12 = 0; ~var12 > -65; ++var12) {
                    for (int var13 = 0; var13 < 64; ++var13) {
                        int var14 = arg8 + var12;
                        int var15 = arg1 + var13;
                        if (var14 >= 0 && ~var14 > ~class115.field1522 && var15 >= 0 && var15 < class198.field3004) {
                            var11.method2247(var14, -1, var15);
                        }
                    }
                }
            }
        }
        class385 var16 = new class385(arg7);
        int var17 = arg0 + arg8;
        int var18 = arg1 + arg9;
        int var19 = 0;
        if (arg2 != 11154) {
            method1913(105);
        }
        while (~arg5 < ~var19) {
            for (int var55 = 0; ~var55 > -65; ++var55) {
                for (int var56 = 0; ~var56 > -65; ++var56) {
                    class28.method163(arg3, var19, arg8 + var55, var17 + var55, arg1 + var56, arg2 ^ -11172, var16, false, 0, 0, 0, var18 + var56);
                }
            }
            ++var19;
        }
        boolean var20 = false;
        boolean var21 = false;
        while (~var16.field5685.length < ~var16.field5666) {
            int var22 = var16.method2343(arg2 ^ 11117);
            if (var22 == 128) {
                class212.field3196[0] = var16.method2323(-104);
                class212.field3196[1] = var16.method2327((byte) -116);
                class212.field3196[2] = var16.method2327((byte) -116);
                class212.field3196[3] = var16.method2327((byte) -116);
                class212.field3196[4] = var16.method2323(-68);
                var20 = true;
            } else {
                if (~var22 != -130) {
                    --var16.field5666;
                    break;
                }
                if (class210.field3161 == null) {
                    class210.field3161 = new byte[4][][];
                }
                var21 = true;
                for (int var40 = 0; var40 < 4; ++var40) {
                    byte var41 = var16.method2341((byte) 54);
                    if (~var41 == -1 && class210.field3161[var40] != null) {
                        int var42 = arg8;
                        int var43 = arg8 - -64;
                        int var44 = arg1;
                        int var45 = arg1 - -64;
                        if (~var43 <= -1) {
                            if (class115.field1522 <= var43) {
                                var43 = class115.field1522;
                            }
                        } else {
                            var43 = 0;
                        }
                        if (arg8 < 0) {
                            var42 = 0;
                        } else if (class115.field1522 <= arg8) {
                            var42 = class115.field1522;
                        }
                        if (arg1 >= 0) {
                            if (~class198.field3004 >= ~arg1) {
                                var44 = class198.field3004;
                            }
                        } else {
                            var44 = 0;
                        }
                        if (~var45 > -1) {
                            var45 = 0;
                        } else if (~var45 <= ~class198.field3004) {
                            var45 = class198.field3004;
                        }
                        while (var42 < var43) {
                            while (~var45 < ~var44) {
                                class210.field3161[var40][var42][var44] = 0;
                                ++var44;
                            }
                            ++var42;
                        }
                    } else if (var41 != 1) {
                        if (var41 == 2) {
                            if (class210.field3161[var40] == null) {
                                class210.field3161[var40] = new byte[class115.field1522 - -1][class198.field3004 - -1];
                            }
                            if (var40 > 0) {
                                int var46 = arg8;
                                int var47 = arg8 + 64;
                                int var48 = arg1;
                                if (arg1 >= 0) {
                                    if (~class198.field3004 >= ~arg1) {
                                        var48 = class198.field3004;
                                    }
                                } else {
                                    var48 = 0;
                                }
                                int var49 = arg1 - -64;
                                if (~arg8 <= -1) {
                                    if (arg8 >= class115.field1522) {
                                        var46 = class115.field1522;
                                    }
                                } else {
                                    var46 = 0;
                                }
                                if (var47 >= 0) {
                                    if (class115.field1522 <= var47) {
                                        var47 = class115.field1522;
                                    }
                                } else {
                                    var47 = 0;
                                }
                                if (~var49 <= -1) {
                                    if (~var49 <= ~class198.field3004) {
                                        var49 = class198.field3004;
                                    }
                                } else {
                                    var49 = 0;
                                }
                                while (var47 > var46) {
                                    while (var48 < var49) {
                                        class210.field3161[var40][var46][var48] = class210.field3161[var40 + -1][var46][var48];
                                        ++var48;
                                    }
                                    ++var46;
                                }
                            }
                        }
                    } else {
                        if (class210.field3161[var40] == null) {
                            class210.field3161[var40] = new byte[class115.field1522 - -1][class198.field3004 + 1];
                        }
                        for (int var50 = 0; ~var50 > -65; var50 += 4) {
                            for (int var51 = 0; var51 < 64; var51 += 4) {
                                byte var52 = var16.method2341((byte) 54);
                                for (int var53 = arg8 + var50; arg8 + var50 + 4 > var53; ++var53) {
                                    for (int var54 = arg1 + var51; ~var54 > ~(arg1 + var51 + 4); ++var54) {
                                        if (var53 >= 0 && ~var53 > ~class115.field1522 && ~var54 <= -1 && class198.field3004 > var54) {
                                            class210.field3161[var40][var53][var54] = var52;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!arg3) {
            class451 var23 = null;
            while (true) {
                while (~var16.field5666 > ~var16.field5685.length) {
                    int var28 = var16.method2343(arg2 ^ 11117);
                    if (var28 == 0) {
                        var23 = new class451(var16);
                    } else if (~var28 == -2) {
                        int var29 = var16.method2343(255);
                        if (~var29 < -1) {
                            for (int var30 = 0; var29 > var30; ++var30) {
                                class21 var31 = new class21(var16);
                                if (~var31.field294 == -32) {
                                    class287 var32 = class367.method2207(var16.method2323(arg2 ^ -11248), (byte) 116);
                                    var31.method133(var32.field4366, var32.field4367, var32.field4368, var32.field4372, -39);
                                }
                                var31.field2033 += arg8 << 7;
                                var31.field2038 += arg1 << 7;
                                int var33 = var31.field2033 >> 7;
                                int var34 = var31.field2038 >> 7;
                                if (var33 >= 0 && ~var34 <= -1 && ~class115.field1522 < ~var33 && class198.field3004 > var34) {
                                    var31.field2040 = class355.field5243[var31.field284][var33][var34] - var31.field2040;
                                    if (~arg6.method342() < -1) {
                                        class303.method1864(var31);
                                    }
                                }
                            }
                        }
                    } else {
                        if (~var28 != -3) {
                            throw new IllegalStateException();
                        }
                        if (var23 == null) {
                            var23 = new class451();
                        }
                        var23.method2776((byte) 88, var16);
                    }
                }
                if (var23 != null) {
                    for (int var24 = 0; var24 < 8; ++var24) {
                        for (int var25 = 0; ~var25 > -9; ++var25) {
                            int var26 = (arg8 >> 3) + var24;
                            int var27 = (arg1 >> 3) - -var25;
                            if (~var26 <= -1 && ~var26 > ~(class115.field1522 >> 3) && var27 >= 0 && ~(class198.field3004 >> 3) < ~var27) {
                                class326.method2015(var23, 82, var26, var27);
                            }
                        }
                    }
                }
                break;
            }
        }
        if (!var21 && class210.field3161 != null) {
            for (int var35 = 0; ~var35 > -5; ++var35) {
                if (class210.field3161[var35] != null) {
                    for (int var36 = 0; ~var36 > -17; ++var36) {
                        for (int var37 = 0; var37 < 16; ++var37) {
                            int var38 = (arg8 >> 2) + var36;
                            int var39 = (arg1 >> 2) + var37;
                            if (var38 >= 0 && ~var38 > -27 && ~var39 <= -1 && ~var39 > -27) {
                                class210.field3161[var35][var38][var39] = 0;
                            }
                        }
                    }
                }
            }
        }
        if (var20) {
            return class212.field3196;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII)V")
    public static final void method1912(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class189.field2831 = arg2;
        class204.field3060 = arg1;
        if (arg4 != 0) {
            method1911(23, 78, -50, true, (class375[]) null, 96, (class261) null, (byte[]) null, 11, -108);
        }
        ++field4731;
        class192.field2917 = arg0;
        class39.field497 = arg3;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(Ldr;I)V")
    public final void method15(class261 arg0, int arg1) {
        if (arg1 < 114) {
            this.field4723 = false;
        }
        ++field4721;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)Z")
    public final boolean method112(boolean arg0) {
        if (!arg0) {
            this.field4732 = 106;
        }
        ++field4724;
        return this.field4723;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
    public final void method11(int arg0) {
        if (this.field4738 != null) {
            this.field4738.method1249();
        }
        ++field4729;
        if (arg0 != -21910) {
            method1916((byte) 7);
        }
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)V")
    public static final void method1913(int arg0) {
        if (arg0 == 131072) {
            ++field4716;
            try {
                Method var1 = (field4740 != null ? field4740 : (field4740 = method1918("java.lang.Runtime"))).getMethod("availableProcessors");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                        class137.field1854 = var3;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lon;ILon;ZB)I")
    public static final int method1914(class432 arg0, int arg1, class432 arg2, boolean arg3, byte arg4) {
        ++field4726;
        if (~arg1 == -2) {
            int var5 = arg0.field5120;
            int var6 = arg2.field5120;
            if (!arg3) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (~arg1 == -3) {
            return class268.method1672(arg2.method2650(arg4 ^ 2147483562).field256, (byte) -106, class27.field356, arg0.method2650(Integer.MIN_VALUE).field256);
        } else if (~arg1 == -4) {
            if (!arg0.field6337.equals("-")) {
                if (arg2.field6337.equals("-")) {
                    return !arg3 ? -1 : 1;
                } else {
                    return class268.method1672(arg2.field6337, (byte) -113, class27.field356, arg0.field6337);
                }
            } else if (arg2.field6337.equals("-")) {
                return 0;
            } else {
                return arg3 ? -1 : 1;
            }
        } else if (arg1 == 4) {
            if (arg0.method2089((byte) 33)) {
                return arg2.method2089((byte) 41) ? 0 : 1;
            } else {
                return arg2.method2089((byte) 127) ? -1 : 0;
            }
        } else if (~arg1 == -6) {
            if (arg0.method2092((byte) -67)) {
                return arg2.method2092((byte) 38) ? 0 : 1;
            } else {
                return arg2.method2092((byte) 124) ? -1 : 0;
            }
        } else {
            if (arg4 != -86) {
                method1914((class432) null, 114, (class432) null, true, (byte) -93);
            }
            if (~arg1 == -7) {
                if (!arg0.method2093(arg4 ^ 62)) {
                    return arg2.method2093(arg4 ^ 59) ? -1 : 0;
                } else {
                    return arg2.method2093(-128) ? 0 : 1;
                }
            } else if (~arg1 == -8) {
                if (!arg0.method2091(arg4 + 32854)) {
                    return !arg2.method2091(arg4 + 32854) ? 0 : -1;
                } else {
                    return arg2.method2091(32768) ? 0 : 1;
                }
            } else if (~arg1 == -9) {
                int var7 = arg0.field6341;
                int var8 = arg2.field6341;
                if (!arg3) {
                    if (~var7 == 0) {
                        var7 = 1000;
                    }
                    if (~var8 == 0) {
                        var8 = 1000;
                    }
                } else {
                    if (~var7 == -1001) {
                        var7 = -1;
                    }
                    if (~var8 == -1001) {
                        var8 = -1;
                    }
                }
                return -var8 + var7;
            } else {
                return -arg2.field6335 + arg0.field6335;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)I")
    public final int method3(byte arg0) {
        ++field4717;
        if (arg0 > -3) {
            this.field4715 = false;
        }
        return this.field4732;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)I")
    public final int method7(boolean arg0) {
        ++field4714;
        if (!arg0) {
            method1911(65, -31, -79, false, (class375[]) null, -52, (class261) null, (byte[]) null, -67, 0);
        }
        return this.field4728 & 65535;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ldr;IZI)Luq;")
    private final class221 method1915(class261 arg0, int arg1, boolean arg2, int arg3) {
        ++field4711;
        class85 var5 = class411.method2575(0, 65535 & this.field4728);
        class143 var6;
        class143 var7;
        if (this.field4730) {
            var6 = class85.field1201[0];
            var7 = class154.field2118[this.field4710];
        } else {
            var7 = class85.field1201[this.field4710];
            if (~this.field4710 <= -4) {
                var6 = null;
            } else {
                var6 = class85.field1201[this.field4710 + 1];
            }
        }
        if (arg1 != -64) {
            this.field4732 = 12;
        }
        return var5.method538(var6, -110, super.field4785, this.field4732, 22, var7, arg3, super.field4780, arg0, super.field4778, arg2);
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(Ldr;I)Lkq;")
    public final class70 method10(class261 arg0, int arg1) {
        ++field4722;
        if (this.field4738 == null) {
            return null;
        } else {
            if (arg1 != 7) {
                this.field4715 = false;
            }
            class361 var3 = arg0.method434();
            var3.method611(super.field4778, super.field4780, super.field4785);
            class70 var4 = null;
            if (this.field4715) {
                var4 = class383.method2309(78, 1);
            }
            this.field4738.method1282(var3, var4 != null ? var4.field899[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ldr;I)V")
    public final void method6(class261 arg0, int arg1) {
        ++field4718;
        Object var3 = null;
        if (arg1 >= -68) {
            this.field4728 = -5;
        }
        class380 var5;
        if (this.field4733 == null && this.field4725) {
            class221 var4 = this.method1915(arg0, -64, true, 131072);
            var5 = var4 != null ? var4.field3366 : null;
        } else {
            var5 = this.field4733;
            this.field4733 = null;
        }
        if (var5 != null) {
            class85.method557(var5, this.field4710, super.field4778, super.field4785, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILdr;I)Z")
    public final boolean method4(int arg0, int arg1, class261 arg2, int arg3) {
        ++field4734;
        class292 var5 = this.method1910(arg2, 65536, (byte) 111);
        if (arg3 != 2) {
            this.method11(-42);
        }
        if (var5 != null) {
            class361 var6 = arg2.method434();
            var6.method611(super.field4778, super.field4780, super.field4785);
            return var5.method1297(arg0, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)Z")
    public final boolean method1(int arg0) {
        int var2 = -127 % ((-1 - arg0) / 46);
        ++field4708;
        return this.field4725;
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(B)Z")
    public static final boolean method1916(byte arg0) {
        ++field4727;
        try {
            if (class360.field5320 == 2) {
                if (class176.field2677 == null) {
                    class176.field2677 = class48.method267(class162.field2247, class463.field6832, class36.field437);
                    if (class176.field2677 == null) {
                        return false;
                    }
                }
                if (class146.field2023 == null) {
                    class146.field2023 = new class217(class187.field2799, class192.field2900);
                }
                if (class311.field4685.method1578(class146.field2023, 3862, 22050, class145.field1986, class176.field2677)) {
                    class311.field4685.method1577(arg0 ^ -41);
                    class311.field4685.method1597(true, class314.field4765);
                    class311.field4685.method1596(class303.field4585, 32, class176.field2677);
                    class360.field5320 = 0;
                    class146.field2023 = null;
                    class162.field2247 = null;
                    class176.field2677 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class311.field4685.method1579((byte) 126);
            class146.field2023 = null;
            class162.field2247 = null;
            class360.field5320 = 0;
            class176.field2677 = null;
        }
        return arg0 != -68;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Ldr;Lfq;IIIIZIZ)V")
    public class313(class261 arg0, class85 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field1198, arg1.field1164);
        this.field4732 = (byte) arg7;
        this.field4728 = (short) arg1.field1156;
        this.field4723 = arg8;
        this.field4710 = (byte) arg2;
        super.field4785 = (short) arg5;
        super.field4778 = (short) arg3;
        this.field4715 = ~arg1.field1184 != -1 && !arg6;
        this.field4730 = arg6;
        this.field4725 = arg0.method427() && arg1.field1158 && !this.field4730 && class97.field1334 != 0;
        int var10 = 1024;
        if (this.field4723) {
            var10 |= 32768;
        }
        class221 var11 = this.method1915(arg0, -64, this.field4725, var10);
        if (var11 != null) {
            this.field4738 = var11.field3362;
            this.field4733 = var11.field3366;
            if (this.field4723) {
                this.field4738 = this.field4738.method1264((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILec;ILjava/awt/Canvas;)Ldr;")
    public static final class261 method1917(int arg0, class96 arg1, int arg2, Canvas arg3) {
        if (arg0 != -64) {
            return null;
        } else {
            ++field4739;
            return new class65(arg3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)I")
    public final int method9(int arg0) {
        ++field4719;
        return arg0 <= 26 ? 98 : 22;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1918(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
