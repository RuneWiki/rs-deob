import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class321 extends class525 {

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "Z")
    public boolean field4198 = false;

    @OriginalMember(owner = "client!qg", name = "db", descriptor = "Z")
    public boolean field4206 = false;

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "Lls;")
    public static class92 field4199 = new class92();

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "Lcu;")
    public static class145 field4200 = new class145(70, 8);

    @OriginalMember(owner = "client!qg", name = "gb", descriptor = "Los;")
    public static class305 field4209 = new class305();

    @OriginalMember(owner = "client!qg", name = "jb", descriptor = "[Ldc;")
    public static class5[] field4212 = new class5[14];

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!qg", name = "ab", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!qg", name = "bb", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!qg", name = "cb", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!qg", name = "eb", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!qg", name = "fb", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!qg", name = "hb", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!qg", name = "ib", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V", line = 3)
    public static void method1846(byte arg0) {
        if (arg0 == -86) {
            field4200 = null;
            field4212 = null;
            field4199 = null;
            field4209 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII)V", line = 16)
    public static final void method1847(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4205;
        if (arg1 > -46) {
            method1846((byte) -57);
        }
        if (class300.field3971 >= arg0 && arg2 >= class353.field4777) {
            boolean var6;
            if (~class308.field4055 < ~arg5) {
                var6 = false;
                arg5 = class308.field4055;
            } else if (class71.field1077 >= arg5) {
                var6 = true;
            } else {
                var6 = false;
                arg5 = class71.field1077;
            }
            boolean var7;
            if (arg3 < class308.field4055) {
                var7 = false;
                arg3 = class308.field4055;
            } else if (arg3 <= class71.field1077) {
                var7 = true;
            } else {
                var7 = false;
                arg3 = class71.field1077;
            }
            if (~class353.field4777 >= ~arg0) {
                class427.method2465(class457.field6299[arg0++], arg3, arg5, -7, arg4);
            } else {
                arg0 = class353.field4777;
            }
            if (arg2 > class300.field3971) {
                arg2 = class300.field3971;
            } else {
                class427.method2465(class457.field6299[arg2--], arg3, arg5, -7, arg4);
            }
            if (var6 && var7) {
                for (int var8 = arg0; ~var8 >= ~arg2; ++var8) {
                    int[] var9 = class457.field6299[var8];
                    var9[arg5] = var9[arg3] = arg4;
                }
            } else {
                if (!var6) {
                    if (var7) {
                        for (int var10 = arg0; ~var10 >= ~arg2; ++var10) {
                            class457.field6299[var10][arg3] = arg4;
                        }
                        return;
                    }
                } else {
                    for (int var11 = arg0; arg2 >= var11; ++var11) {
                        class457.field6299[var11][arg5] = arg4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Z", line = 120)
    public final boolean method1848(int arg0, int arg1) {
        int var3 = 6 / ((arg0 - -80) / 42);
        ++field4211;
        return arg1 == 0 ? super.field7750 : true;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(IB)I", line = 135)
    public final int method1849(int arg0, byte arg1) {
        ++field4210;
        if (arg1 >= -79) {
            return 88;
        } else if (this.field4198) {
            return 0;
        } else if (!this.method1855((byte) -41, arg0)) {
            return 1;
        } else {
            return super.field7773 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)V", line = 153)
    public final void method1850(boolean arg0, int arg1) {
        if (arg1 != 2) {
            method1857((byte) 82, -23);
        }
        ++field4207;
        super.field7750 = arg0;
        if (class402.field5388 != null) {
            class402.field5388.method1996(!this.method1855((byte) -108, class166.field2414), arg1 + 616);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBLpc;I)Lre;", line = 167)
    public static final class425 method1851(int arg0, byte arg1, class473 arg2, int arg3) {
        ++field4203;
        if (arg1 < 1) {
            method1854((char) 65470, (byte) 80);
        }
        byte[] var4 = arg2.method2708(arg0, arg3, (byte) 54);
        return var4 == null ? null : new class425(var4);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljs;B)V", line = 184)
    public final void method1852(class216 arg0, byte arg1) {
        ++field4197;
        class164 var3 = null;
        int var4 = -24 % ((arg1 - 74) / 42);
        try {
            class446 var5 = arg0.method1366(16, "");
            while (var5.field6100 == 0) {
                class94.method674(1L, 1);
            }
            if (var5.field6100 == 1) {
                var3 = (class164) var5.field6104;
                class379 var6 = this.method1853((byte) -72);
                var3.method1108((byte) -60, 0, var6.field5152, var6.field5173);
            }
        } catch (Exception var8) {
        }
        try {
            if (var3 != null) {
                var3.method1109((byte) -63);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)Lmd;", line = 222)
    public final class379 method1853(byte arg0) {
        ++field4202;
        class379 var2 = new class379(41);
        var2.method2200(arg0 + 79, 17);
        var2.method2200(arg0 ^ -65, super.field7746);
        var2.method2200(arg0 + 79, super.field7750 ? 1 : 0);
        var2.method2200(7, super.field7773 ? 1 : 0);
        var2.method2200(7, super.field7764 ? 1 : 0);
        var2.method2200(7, !super.field7749 ? 0 : 1);
        var2.method2200(7, 0);
        var2.method2200(7, !super.field7758 ? 0 : 1);
        var2.method2200(7, !super.field7745 ? 0 : 1);
        var2.method2200(arg0 ^ -65, !super.field7766 ? 0 : 1);
        var2.method2200(7, super.field7751);
        var2.method2200(7, super.field7762);
        var2.method2200(7, !super.field7774 ? 0 : 1);
        var2.method2200(7, super.field7747 ? 1 : 0);
        var2.method2200(7, super.field7778 ? 1 : 0);
        var2.method2200(7, !super.field7769 ? 0 : 1);
        var2.method2200(7, super.field7757);
        var2.method2200(7, super.field7765 ? 1 : 0);
        var2.method2200(7, super.field7767);
        var2.method2200(arg0 ^ -65, super.field7775);
        if (arg0 != -72) {
            method1847(-37, 58, 103, 96, -9, -62);
        }
        var2.method2200(7, super.field7772);
        var2.method2246(super.field7777, (byte) -62);
        var2.method2246(super.field7759, (byte) -76);
        var2.method2200(7, class518.method3047((byte) 32));
        var2.method2214(arg0 + 114, super.field7760);
        var2.method2200(7, super.field7752);
        var2.method2200(arg0 ^ -65, super.field7741 ? 1 : 0);
        var2.method2200(7, super.field7738 ? 1 : 0);
        var2.method2200(7, super.field7768);
        var2.method2200(7, super.field7755 ? 1 : 0);
        var2.method2200(arg0 ^ -65, super.field7763 ? 1 : 0);
        var2.method2200(7, super.field7737);
        var2.method2200(7, !super.field7744 ? 0 : 1);
        var2.method2200(7, super.field7743);
        var2.method2200(7, super.field7761);
        var2.method2200(7, !super.field7754 ? 0 : 1);
        return var2;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(CB)Z", line = 274)
    public static final boolean method1854(char arg0, byte arg1) {
        ++field4201;
        if (arg1 < 49) {
            field4199 = null;
        }
        return ~arg0 == -161 || arg0 == ' ' || arg0 == '_' || ~arg0 == -46;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(BI)Z", line = 286)
    public final boolean method1855(byte arg0, int arg1) {
        int var3 = 87 % ((27 - arg0) / 33);
        ++field4195;
        return ~arg1 == -1 && !this.field4206 ? super.field7750 : true;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lmd;I)V", line = 308)
    private final void method1856(class379 arg0, int arg1) {
        ++field4204;
        if (~(arg0.field5152.length + -arg0.field5173) <= -2) {
            int var3 = arg0.method2238(255);
            if (var3 >= 0 && ~var3 >= -18) {
                byte var4;
                if (~var3 == -18) {
                    var4 = 40;
                } else if (var3 != 16) {
                    if (var3 == 15) {
                        var4 = 37;
                    } else if (~var3 != -15) {
                        if (var3 != 13) {
                            if (var3 == 12) {
                                var4 = 34;
                            } else if (var3 == 11) {
                                var4 = 33;
                            } else if (var3 != 10) {
                                if (var3 != 9) {
                                    if (~var3 != -9) {
                                        if (var3 != 7) {
                                            if (~var3 != -7) {
                                                if (var3 != 5) {
                                                    if (var3 == 4) {
                                                        var4 = 24;
                                                    } else if (var3 != 3) {
                                                        if (~var3 == -3) {
                                                            var4 = 22;
                                                        } else if (~var3 != -2) {
                                                            var4 = 19;
                                                        } else {
                                                            var4 = 23;
                                                        }
                                                    } else {
                                                        var4 = 23;
                                                    }
                                                } else {
                                                    var4 = 28;
                                                }
                                            } else {
                                                var4 = 28;
                                            }
                                        } else {
                                            var4 = 29;
                                        }
                                    } else {
                                        var4 = 30;
                                    }
                                } else {
                                    var4 = 31;
                                }
                            } else {
                                var4 = 32;
                            }
                        } else {
                            var4 = 35;
                        }
                    } else {
                        var4 = 36;
                    }
                } else {
                    var4 = 38;
                }
                if (arg0.field5152.length + -arg0.field5173 >= var4) {
                    super.field7746 = arg0.method2238(arg1 + 231);
                    if (~super.field7746 > -2) {
                        super.field7746 = 1;
                    } else if (~super.field7746 < -5) {
                        super.field7746 = 4;
                    }
                    this.method1850(~arg0.method2238(255) == -2, 2);
                    super.field7773 = ~arg0.method2238(255) == -2;
                    if (arg1 != 24) {
                        field4209 = null;
                    }
                    super.field7764 = arg0.method2238(arg1 + 231) == 1;
                    super.field7749 = arg0.method2238(255) == 1;
                    super.field7737 = ~arg0.method2238(255) == -2 ? 1 : 0;
                    super.field7758 = arg0.method2238(255) == 1;
                    super.field7745 = arg0.method2238(255) == 1;
                    super.field7766 = ~arg0.method2238(255) == -2;
                    super.field7751 = arg0.method2238(arg1 ^ 231);
                    if (~super.field7751 < -3) {
                        super.field7751 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field7762 = arg0.method2238(255);
                    }
                    if (~var3 <= -3) {
                        super.field7774 = arg0.method2238(255) == 1;
                        if (~var3 <= -18) {
                            super.field7747 = ~arg0.method2238(255) == -2;
                        }
                    } else {
                        super.field7774 = arg0.method2238(arg1 + 231) == 1;
                        arg0.method2238(255);
                    }
                    super.field7778 = ~arg0.method2238(255) == -2;
                    super.field7769 = arg0.method2238(arg1 + 231) == 1;
                    super.field7757 = arg0.method2238(arg1 ^ 231);
                    if (~super.field7757 < -3) {
                        super.field7757 = 2;
                    }
                    super.field7756 = super.field7757;
                    super.field7765 = ~arg0.method2238(arg1 ^ 231) == -2;
                    super.field7767 = arg0.method2238(255);
                    if (super.field7767 > 127) {
                        super.field7767 = 127;
                    }
                    super.field7775 = arg0.method2238(arg1 ^ 231);
                    super.field7772 = arg0.method2238(arg1 + 231);
                    if (~super.field7772 < -128) {
                        super.field7772 = 127;
                    }
                    if (var3 >= 1) {
                        super.field7777 = arg0.method2212((byte) 83);
                        super.field7759 = arg0.method2212((byte) 83);
                    }
                    if (var3 >= 3 && var3 < 6) {
                        arg0.method2238(255);
                    }
                    if (~var3 <= -5) {
                        int var5 = arg0.method2238(255);
                        if (~var5 > -1 || var5 > 2) {
                            var5 = 0;
                        }
                        if (~class199.field2765 > -97) {
                            var5 = 0;
                        }
                        class201.method1285(-3, var5);
                    }
                    if (var3 >= 5) {
                        super.field7760 = arg0.method2232((byte) 124);
                    }
                    int var6 = 0;
                    if (var3 >= 6) {
                        super.field7752 = var6 = arg0.method2238(255);
                    }
                    if (super.field7752 != 1 && ~super.field7752 != -3) {
                        super.field7752 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field7741 = ~arg0.method2238(255) == -2;
                    }
                    if (~var3 <= -9) {
                        super.field7738 = arg0.method2238(arg1 ^ 231) == 1;
                    }
                    if (var3 >= 9) {
                        super.field7768 = arg0.method2238(255);
                    }
                    if (super.field7768 < 0 || super.field7768 > class425.method2445(96, class199.field2765)) {
                        super.field7768 = 0;
                    }
                    if (~var3 <= -11) {
                        super.field7755 = arg0.method2238(255) != 0;
                    }
                    if (var3 >= 11) {
                        super.field7763 = arg0.method2238(255) != 0;
                    }
                    if (~var3 <= -13) {
                        super.field7737 = arg0.method2238(255);
                    }
                    if (super.field7737 < 0 || super.field7737 > 2) {
                        super.field7737 = 1;
                    }
                    if (~var3 <= -14) {
                        super.field7744 = arg0.method2238(255) == 1;
                    }
                    if (var3 < 14) {
                        if (~var6 != -1) {
                            super.field7743 = 1;
                        } else {
                            super.field7743 = 2;
                        }
                    } else {
                        super.field7743 = arg0.method2238(255);
                    }
                    if (~super.field7743 > -1 || ~super.field7743 < -4) {
                        super.field7743 = 2;
                    }
                    if (~var3 <= -16) {
                        super.field7761 = arg0.method2238(255);
                        if (~super.field7761 > -1 || super.field7761 > 4) {
                            super.field7761 = class422.field5778 != 1 ? 4 : 2;
                        }
                    }
                    if (var3 >= 16) {
                        super.field7754 = ~arg0.method2238(255) == -2;
                    }
                    if (~var3 > -18 && super.field7743 == 0) {
                        super.field7743 = 2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Ljs;)V", line = 596)
    public class321(class216 arg0) {
        super.field7746 = 3;
        this.method1850(true, 2);
        super.field7751 = 2;
        super.field7765 = true;
        super.field7747 = false;
        super.field7777 = 0;
        super.field7775 = 255;
        super.field7766 = true;
        super.field7774 = true;
        super.field7757 = 0;
        super.field7769 = true;
        super.field7737 = 1;
        super.field7773 = true;
        super.field7772 = 127;
        super.field7759 = 0;
        super.field7749 = true;
        super.field7756 = 0;
        super.field7762 = 0;
        super.field7767 = 127;
        super.field7758 = true;
        super.field7764 = true;
        super.field7778 = true;
        super.field7745 = true;
        if (class199.field2765 >= 96) {
            class201.method1285(-3, 2);
        } else {
            class201.method1285(-3, 0);
        }
        super.field7760 = 0;
        super.field7768 = 0;
        super.field7738 = false;
        super.field7741 = false;
        super.field7761 = ~class422.field5778 == -2 ? 2 : 4;
        super.field7763 = true;
        super.field7752 = 2;
        super.field7743 = 2;
        super.field7744 = true;
        super.field7755 = false;
        class164 var2 = null;
        try {
            class446 var3 = arg0.method1366(16, "");
            while (~var3.field6100 == -1) {
                class94.method674(1L, 1);
            }
            if (var3.field6100 == 1) {
                var2 = (class164) var3.field6104;
                byte[] var4 = new byte[(int) var2.method1112(120)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1110(var4, var5, 15596, var4.length + -var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                this.method1856(new class379(var4), 24);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1109((byte) -63);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(BI)I", line = 576)
    public static final int method1857(byte arg0, int arg1) {
        ++field4196;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        if (arg0 != 113) {
            field4199 = null;
        }
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }
}
