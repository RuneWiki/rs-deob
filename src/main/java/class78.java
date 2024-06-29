import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class78 extends class191 {

    @OriginalMember(owner = "client!tt", name = "Ec", descriptor = "I")
    public int field842 = -1;

    @OriginalMember(owner = "client!tt", name = "Gc", descriptor = "I")
    public int field844 = -1;

    @OriginalMember(owner = "client!tt", name = "Xc", descriptor = "Z")
    public static boolean field861 = false;

    @OriginalMember(owner = "client!tt", name = "Tc", descriptor = "[I")
    public static int[] field857 = new int[13];

    @OriginalMember(owner = "client!tt", name = "Wc", descriptor = "F")
    public static float field860;

    @OriginalMember(owner = "client!tt", name = "Fc", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!tt", name = "Hc", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!tt", name = "Ic", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!tt", name = "Jc", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!tt", name = "Kc", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!tt", name = "Lc", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!tt", name = "Mc", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!tt", name = "Nc", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!tt", name = "Oc", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!tt", name = "Pc", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!tt", name = "Qc", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!tt", name = "Rc", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!tt", name = "Sc", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!tt", name = "Uc", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!tt", name = "Vc", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!tt", name = "Yc", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!tt", name = "Zc", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!tt", name = "bd", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!tt", name = "cd", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!tt", name = "ad", descriptor = "Lpl;")
    public class566 field864;

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "(B)V", line = 3)
    public static final void method500(byte arg0) {
        ++field847;
        class315.method2075((long) class287.field3982, class413.field6264, (byte) 95);
        if (class518.field7542 != -1) {
            class268.method1753(-119, class518.field7542);
        }
        for (int var1 = 0; class384.field5785 > var1; ++var1) {
            if (class136.field1692[var1]) {
                class570.field8224[var1] = true;
            }
            class320.field4635[var1] = class136.field1692[var1];
            class136.field1692[var1] = false;
        }
        class80.field882 = class287.field3982;
        if (class413.field6264.method370()) {
            class508.field7385 = true;
        }
        if (~class518.field7542 != 0) {
            class384.field5785 = 0;
            class163.method948(6543);
        }
        class413.field6264.method404();
        class22.method139((byte) -32, class413.field6264);
        int var2 = class525.method3092(-13);
        if (var2 == -1) {
            var2 = class595.field8697;
        }
        int var3 = 54 % ((arg0 - 4) / 62);
        if (~var2 == 0) {
            var2 = class398.field6048;
        }
        class279.method1822(var2, -1);
        class529.field7661 = 0;
    }

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "(I)V", line = 56)
    public static void method501(int arg0) {
        if (arg0 != 0) {
            method500((byte) -22);
        }
        field857 = null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIB)V", line = 67)
    public final void method502(int arg0, int arg1, byte arg2) {
        ++field848;
        int var4 = super.field2515[0];
        int var5 = super.field2524[0];
        if (arg0 == 0) {
            ++var5;
        }
        if (arg0 == 1) {
            ++var4;
            ++var5;
        }
        if (~arg0 == -3) {
            ++var4;
        }
        if (~arg0 == -4) {
            ++var4;
            --var5;
        }
        if (arg0 == 4) {
            --var5;
        }
        if (~arg0 == -6) {
            --var5;
            --var4;
        }
        if (arg0 == 6) {
            --var4;
        }
        if (arg0 == 7) {
            --var4;
            ++var5;
        }
        if (~super.field2502 != 0 && ~class259.field3686.method2961(super.field2502, 8).field2155 == -2) {
            super.field2502 = -1;
        }
        if (~super.field2472 != 0) {
            class576 var6 = class141.field1735.method3667(false, super.field2472);
            if (var6.field8328 && ~var6.field8318 != 0 && ~class259.field3686.method2961(var6.field8318, 8).field2155 == -2) {
                super.field2472 = -1;
            }
        }
        if (super.field2421 != -1) {
            class576 var7 = class141.field1735.method3667(false, super.field2421);
            if (var7.field8328 && var7.field8318 != -1 && class259.field3686.method2961(var7.field8318, 8).field2155 == 1) {
                super.field2421 = -1;
            }
        }
        if (super.field2517 < 9) {
            ++super.field2517;
        }
        for (int var8 = super.field2517; ~var8 < -1; --var8) {
            super.field2515[var8] = super.field2515[var8 + -1];
            super.field2524[var8] = super.field2524[var8 + -1];
            super.field2525[var8] = super.field2525[var8 + -1];
        }
        super.field2515[0] = var4;
        super.field2524[0] = var5;
        super.field2525[0] = (byte) arg1;
        int var9 = 37 % ((-54 - arg2) / 45);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Loa;B)Laca;", line = 161)
    public final class630 method88(class605 arg0, byte arg1) {
        ++field852;
        if (this.field864 != null && this.method505(arg0, (byte) -8, 2048)) {
            class364 var3 = arg0.method342();
            int var4 = super.field2501.method877(-126);
            var3.method2023(var4);
            var3.method2006(super.field1764, super.field1769 - 20, super.field1768);
            class154 var5 = this.method1158((byte) -128);
            class566 var6 = this.field864.field8121 != null ? this.field864.method3287(121, class23.field243) : this.field864;
            if (class595.field8694.field6561 && var6.field8084 && var5.field1893) {
                class177 var7 = ~super.field2502 != 0 && super.field2482 == 0 ? class259.field3686.method2961(super.field2502, 8) : null;
                class177 var8 = ~super.field2434 == 0 || super.field2432 && var7 != null ? null : class259.field3686.method2961(super.field2434, 8);
                int var9 = 0;
                if (~super.field2427 != -1) {
                    var9 = this.method1148((byte) 25);
                }
                class327 var10 = class13.method77(super.field2479, this.field864.field8098 & 255, 65535 & this.field864.field8088, var8 != null ? super.field2460 : super.field2491, var4, var8 != null ? var8 : var7, this.field864.field8096, super.field2471, super.field2523[0], var9, -124, 255 & this.field864.field8092, 65535 & this.field864.field8086, super.field2481, arg0);
                if (var10 != null) {
                    arg0.method323(false);
                    var10.method1380(var3, (class219) null, 0);
                    arg0.method323(true);
                }
            }
            var3.method2023(var4);
            if (arg1 >= -127) {
                return null;
            } else {
                var3.method2006(super.field1764, super.field1769 + -5, super.field1768);
                class630 var11 = null;
                if (this.method506(2)) {
                    var11 = class471.method2882(-125, super.field2523.length);
                }
                this.method1152(false, arg0, -1, super.field2523, var3);
                if (super.field2518 != null) {
                    class33 var12 = super.field2518.method1334();
                    arg0.method328(super.field2523, var12, var3, var11 == null ? null : var11.field9084, 0);
                } else {
                    arg0.method385(super.field2523, var3, var11 == null ? null : var11.field9084, 0);
                }
                super.field2523[0] = super.field2523[1] = super.field2523[2] = super.field2523[3] = null;
                super.field2506 = class23.field246;
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZIIII)V", line = 237)
    public final void method503(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field866;
        super.field1757 = (byte) arg5;
        if (~super.field2502 != 0 && ~class259.field3686.method2961(super.field2502, 8).field2155 == -2) {
            super.field2502 = -1;
        }
        if (super.field2472 != arg4) {
            class576 var7 = class141.field1735.method3667(false, super.field2472);
            if (var7.field8328 && ~var7.field8318 != 0 && ~class259.field3686.method2961(var7.field8318, 8).field2155 == -2) {
                super.field2472 = -1;
            }
        }
        if (~super.field2421 != 0) {
            class576 var8 = class141.field1735.method3667(false, super.field2421);
            if (var8.field8328 && ~var8.field8318 != 0 && class259.field3686.method2961(var8.field8318, 8).field2155 == 1) {
                super.field2421 = -1;
            }
        }
        if (!arg1) {
            int var9 = -super.field2515[0] + arg0;
            int var10 = -super.field2524[0] + arg3;
            if (~var9 <= 7 && ~var9 >= -9 && ~var10 <= 7 && ~var10 >= -9) {
                if (super.field2517 < 9) {
                    ++super.field2517;
                }
                for (int var11 = super.field2517; var11 > 0; --var11) {
                    super.field2515[var11] = super.field2515[var11 + -1];
                    super.field2524[var11] = super.field2524[var11 + -1];
                    super.field2525[var11] = super.field2525[var11 - 1];
                }
                super.field2515[0] = arg0;
                super.field2524[0] = arg3;
                super.field2525[0] = 1;
                return;
            }
        }
        super.field2519 = 0;
        super.field2515[0] = arg0;
        super.field2517 = 0;
        super.field2516 = 0;
        super.field2524[0] = arg3;
        super.field1768 = (super.field2524[0] << 9) + (arg2 << 8);
        super.field1764 = (super.field2515[0] << 9) + (arg2 << 8);
        if (super.field2518 != null) {
            super.field2518.method1333();
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIILva;Loa;ZI)V", line = 309)
    public final void method86(int arg0, int arg1, int arg2, class429 arg3, class605 arg4, boolean arg5, int arg6) {
        if (arg0 != 7) {
            field857 = null;
        }
        ++field859;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)I", line = 320)
    public final int method504(int arg0) {
        ++field846;
        if (this.field864.field8121 != null) {
            class566 var2 = this.field864.method3287(124, class23.field243);
            if (var2 != null && ~var2.field8073 != 0) {
                return var2.field8073;
            }
        }
        if (arg0 <= 25) {
            field860 = 2.3737557F;
        }
        return this.field864.field8073;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Loa;BI)Z", line = 346)
    private final boolean method505(class605 arg0, byte arg1, int arg2) {
        ++field845;
        int var4 = arg2;
        class154 var5 = this.method1158((byte) 109);
        class177 var6 = super.field2502 != -1 && super.field2482 == 0 ? class259.field3686.method2961(super.field2502, arg1 ^ -16) : null;
        class177 var7 = super.field2434 == -1 || super.field2432 && var6 != null ? null : class259.field3686.method2961(super.field2434, 8);
        int var8 = var5.field1890;
        int var9 = var5.field1901;
        if (var8 != 0 || ~var9 != -1 || var5.field1873 != 0 || ~var5.field1867 != -1) {
            arg2 |= 7;
        }
        boolean var10 = super.field2503 != 0 && ~class287.field3982 <= ~super.field2449 && class287.field3982 < super.field2417;
        if (var10) {
            arg2 |= 524288;
        }
        class327 var11 = super.field2523[0] = this.field864.method3279(super.field2454, super.field2487, var6, super.field2428, arg1 + -107, class393.field6020, class23.field243, super.field2486, var7, arg2, arg0, super.field2491, super.field2460, class259.field3686, super.field2440);
        if (var11 == null) {
            return false;
        } else {
            super.field2425 = var11.method1379();
            this.method1146(-18871, var11);
            int var12 = super.field2501.method877(-67);
            if (~var8 == -1 && ~var9 == -1) {
                this.method1145(var12, this.method1153(true) << 9, 0, this.method1153(true) << 9, 0, 0);
            } else {
                this.method1145(var12, var8, 0, var9, var5.field1907, var5.field1868);
                if (super.field2481 != 0) {
                    super.field2523[0].method1358(super.field2481);
                }
                if (super.field2471 != 0) {
                    super.field2523[0].method1396(super.field2471);
                }
                if (~super.field2479 != -1) {
                    super.field2523[0].method1354(0, super.field2479, 0);
                }
            }
            if (arg1 != -8) {
                this.field864 = null;
            }
            if (var10) {
                var11.method1401(super.field2464, super.field2467, super.field2430, super.field2503 & 255);
            }
            if (super.field2472 != -1 && ~super.field2468 != 0) {
                class576 var13 = class141.field1735.method3667(false, super.field2472);
                boolean var14 = var13.field8308 == 3 && (var8 != 0 || ~var9 != -1);
                int var15 = var4;
                if (!var14) {
                    if (~super.field2509 != -1) {
                        var15 = var4 | 5;
                    }
                    if (super.field2485 != 0) {
                        var15 |= 2;
                    }
                } else {
                    var15 = var4 | 7;
                }
                class327 var16 = super.field2523[1] = var13.method3350(super.field2468, var15, class259.field3686, class92.method583(arg1, -86), arg0, super.field2488, super.field2451);
                if (var16 != null) {
                    if (~super.field2485 != -1) {
                        var16.method1354(0, -super.field2485 << 2, 0);
                    }
                    if (~super.field2509 != -1) {
                        var16.method1385(super.field2509 * 2048);
                    }
                    if (var14) {
                        if (~super.field2481 != -1) {
                            var16.method1358(super.field2481);
                        }
                        if (super.field2471 != 0) {
                            var16.method1396(super.field2471);
                        }
                        if (~super.field2479 != -1) {
                            var16.method1354(0, super.field2479, 0);
                        }
                    }
                }
            } else {
                super.field2523[1] = null;
            }
            if (super.field2421 != -1 && super.field2443 != -1) {
                class576 var17 = class141.field1735.method3667(false, super.field2421);
                boolean var18 = ~var17.field8308 == -4 && (~var8 != -1 || var9 != 0);
                int var19 = var4;
                if (!var18) {
                    if (super.field2478 != 0) {
                        var19 = var4 | 5;
                    }
                    if (~super.field2418 != -1) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class327 var20 = super.field2523[3] = var17.method3343(class259.field3686, super.field2443, super.field2424, var19, arg0, true, super.field2494);
                if (var20 != null) {
                    if (~super.field2418 != -1) {
                        var20.method1354(0, -super.field2418 << 2, 0);
                    }
                    if (super.field2478 != 0) {
                        var20.method1385(super.field2478 * 2048);
                    }
                    if (var18) {
                        if (~super.field2481 != -1) {
                            var20.method1358(super.field2481);
                        }
                        if (super.field2471 != 0) {
                            var20.method1396(super.field2471);
                        }
                        if (~super.field2479 != -1) {
                            var20.method1354(0, super.field2479, 0);
                        }
                    }
                }
            } else {
                super.field2523[3] = null;
            }
            super.field2523[2] = null;
            if (super.field2522 != null) {
                if (~super.field2522.field7987 < ~class287.field3982) {
                    if (super.field2522.field7986 <= class287.field3982) {
                        class327 var21 = super.field2522.method3242(-70, 7 | var4, arg0);
                        if (var21 != null) {
                            var21.method1354(-super.field1764 + super.field2522.field7983, -super.field1769 + super.field2522.field7968 + 5, -super.field1768 + super.field2522.field7980);
                            if (~var12 != -1) {
                                var21.method1385(var12);
                            }
                            super.field2523[2] = var21;
                        }
                    }
                } else {
                    super.field2522 = null;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Loa;I)V", line = 541)
    public final void method90(class605 arg0, int arg1) {
        ++field863;
        if (arg1 != -5) {
            field860 = 0.4819933F;
        }
        if (this.field864 != null) {
            if (super.field2521 || this.method505(arg0, (byte) -8, 0)) {
                class364 var3 = arg0.method342();
                var3.method2023(super.field2501.method877(-82));
                var3.method2006(super.field1764, super.field1769 + -20, super.field1768);
                this.method1152(super.field2521, arg0, -1, super.field2523, var3);
                super.field2523[0] = super.field2523[1] = super.field2523[2] = super.field2523[3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "(I)Z", line = 572)
    private final boolean method506(int arg0) {
        ++field850;
        if (arg0 != 2) {
            this.method507(-97);
        }
        return this.field864.field8100;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)I", line = 583)
    public final int method507(int arg0) {
        ++field843;
        int var2 = -97 / ((-60 - arg0) / 56);
        if (this.field864.field8121 != null) {
            class566 var3 = this.field864.method3287(113, class23.field243);
            if (var3 != null && ~var3.field8126 != 0) {
                return var3.field8126;
            }
        }
        return ~this.field864.field8126 == 0 ? super.method507(112) : this.field864.field8126;
    }

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "(B)I", line = 606)
    public final int method413(byte arg0) {
        if (arg0 != 58) {
            return -73;
        } else {
            ++field855;
            return super.field2425;
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(B)V", line = 619)
    public final void method96(byte arg0) {
        if (arg0 != -76) {
            this.field864 = null;
        }
        ++field853;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(Loa;I)Lew;", line = 630)
    public final class425 method100(class605 arg0, int arg1) {
        ++field862;
        if (arg1 != 28286) {
            this.method503(59, true, 17, 6, 40, -88);
        }
        return null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILoa;I)Z", line = 641)
    public final boolean method91(int arg0, int arg1, class605 arg2, int arg3) {
        ++field854;
        if (this.field864 != null && this.method505(arg2, (byte) -8, 131072)) {
            if (arg0 != -10503) {
                this.method86(-37, -48, -19, (class429) null, (class605) null, true, -110);
            }
            class364 var5 = arg2.method342();
            int var6 = super.field2501.method877(-36);
            var5.method2023(var6);
            var5.method2006(super.field1764, super.field1769, super.field1768);
            boolean var7 = false;
            for (int var8 = 0; var8 < super.field2523.length; ++var8) {
                if (super.field2523[var8] != null && super.field2523[var8].method1381(arg1, arg3, var5, ~this.field864.field8096 == -2)) {
                    var7 = true;
                    break;
                }
            }
            super.field2523[0] = super.field2523[1] = super.field2523[2] = super.field2523[3] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "(I)Z", line = 679)
    public final boolean method508(int arg0) {
        ++field856;
        if (arg0 != 0) {
            this.method508(-10);
        }
        return this.field864 != null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lpl;I)V", line = 694)
    public final void method509(class566 arg0, int arg1) {
        ++field865;
        this.field864 = arg0;
        if (super.field2518 != null) {
            super.field2518.method1333();
        }
        if (arg1 != -4) {
            this.field842 = 103;
        }
    }

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "(B)I", line = 713)
    public final int method510(byte arg0) {
        ++field851;
        if (arg0 != 75) {
            this.field844 = 125;
        }
        if (this.field864.field8121 != null) {
            class566 var2 = this.field864.method3287(112, class23.field243);
            if (var2 != null && ~var2.field8081 != 0) {
                return var2.field8081;
            }
        }
        return this.field864.field8081;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLeca;)I", line = 742)
    public static final int method511(byte arg0, class655 arg1) {
        ++field858;
        int var2 = arg1.field9460;
        class154 var3 = arg1.method1158((byte) -127);
        if (!arg1.field2432) {
            if (arg1.field2434 != var3.field1905 && ~arg1.field2434 != ~var3.field1881 && ~arg1.field2434 != ~var3.field1896 && ~arg1.field2434 != ~var3.field1910) {
                if (~arg1.field2434 == ~var3.field1886 || arg1.field2434 == var3.field1876 || ~arg1.field2434 == ~var3.field1872 || ~arg1.field2434 == ~var3.field1888) {
                    var2 = arg1.field9479;
                }
            } else {
                var2 = arg1.field9464;
            }
        } else {
            var2 = arg1.field9474;
        }
        return arg0 != 3 ? -30 : var2;
    }

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "(I)Z", line = 769)
    public final boolean method84(int arg0) {
        ++field849;
        if (arg0 != 1630) {
            this.field864 = null;
        }
        return false;
    }
}
