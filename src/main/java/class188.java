import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class188 extends class293 implements class83 {

    @OriginalMember(owner = "client!lw", name = "Z", descriptor = "Z")
    private boolean field2549;

    @OriginalMember(owner = "client!lw", name = "mb", descriptor = "Z")
    private boolean field2562;

    @OriginalMember(owner = "client!lw", name = "qb", descriptor = "S")
    private short field2566;

    @OriginalMember(owner = "client!lw", name = "O", descriptor = "Z")
    private boolean field2538;

    @OriginalMember(owner = "client!lw", name = "jb", descriptor = "B")
    private byte field2559;

    @OriginalMember(owner = "client!lw", name = "nb", descriptor = "B")
    private byte field2563;

    @OriginalMember(owner = "client!lw", name = "V", descriptor = "Z")
    private boolean field2545;

    @OriginalMember(owner = "client!lw", name = "K", descriptor = "Lda;")
    public class395 field2534;

    @OriginalMember(owner = "client!lw", name = "U", descriptor = "Lha;")
    private class425 field2544;

    @OriginalMember(owner = "client!lw", name = "Q", descriptor = "[I")
    public static int[] field2540 = new int[3];

    @OriginalMember(owner = "client!lw", name = "L", descriptor = "I")
    public static int field2535 = 1337;

    @OriginalMember(owner = "client!lw", name = "lb", descriptor = "Lps;")
    public static class5 field2561 = null;

    @OriginalMember(owner = "client!lw", name = "H", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!lw", name = "I", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!lw", name = "J", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!lw", name = "M", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!lw", name = "N", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!lw", name = "P", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!lw", name = "R", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!lw", name = "S", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!lw", name = "T", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!lw", name = "W", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!lw", name = "X", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!lw", name = "Y", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!lw", name = "ab", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!lw", name = "bb", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!lw", name = "cb", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!lw", name = "db", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!lw", name = "eb", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!lw", name = "fb", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!lw", name = "gb", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!lw", name = "hb", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!lw", name = "ib", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!lw", name = "ob", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!lw", name = "pb", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!lw", name = "kb", descriptor = "Lifa;")
    private class62 field2560;

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(I)Z")
    public final boolean method266(int arg0) {
        ++field2558;
        if (arg0 != 28107) {
            field2561 = null;
        }
        return this.field2545;
    }

    @OriginalMember(owner = "client!lw", name = "i", descriptor = "(I)V")
    public static void method1241(int arg0) {
        field2561 = null;
        field2540 = null;
        if (arg0 != 1) {
            method1244((class302) null, -15, (byte) 88, (class98) null, -84);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)I")
    public final int method263(byte arg0) {
        ++field2539;
        if (arg0 < 10) {
            this.method309(true);
        }
        return this.field2563;
    }

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "(I)Z")
    public final boolean method274(int arg0) {
        ++field2556;
        if (arg0 != -1510217528) {
            this.method259((class98) null, 47);
        }
        return this.field2534 == null ? false : this.field2534.method1024();
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILr;ILcaa;ZII)V")
    public final void method311(int arg0, class98 arg1, int arg2, class538 arg3, boolean arg4, int arg5, int arg6) {
        if (arg5 > 24) {
            ++field2550;
            if (arg3 instanceof class264) {
                class264 var8 = (class264) arg3;
                if (this.field2534 != null && var8.field3417 != null) {
                    this.field2534.method1055(var8.field3417, arg2, arg0, arg6, arg4);
                }
            } else {
                if (arg3 instanceof class188) {
                    class188 var9 = (class188) arg3;
                    if (this.field2534 != null && var9.field2534 != null) {
                        this.field2534.method1055(var9.field2534, arg2, arg0, arg6, arg4);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)I")
    public final int method264(int arg0) {
        if (arg0 != -5273) {
            return 108;
        } else {
            ++field2554;
            return this.field2559;
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(Lr;I)V")
    public final void method259(class98 arg0, int arg1) {
        if (arg1 != 11771) {
            method1241(94);
        }
        ++field2555;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lr;I)Lhr;")
    public final class218 method272(class98 arg0, int arg1) {
        ++field2557;
        if (this.field2534 == null) {
            return null;
        } else {
            if (arg1 != -1) {
                method1241(-67);
            }
            class151 var3 = arg0.method682();
            var3.method883(super.field7895, super.field7894, super.field7896);
            class218 var4 = null;
            if (this.field2562) {
                var4 = class187.method1237(1, (byte) 33);
            }
            if (!class384.field5767) {
                this.field2534.method1054(var3, var4 == null ? null : var4.field2902[0], 0);
            } else {
                this.field2534.method1030(var3, var4 == null ? null : var4.field2902[0], class515.field7222, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IBLr;)Lda;")
    private final class395 method1242(int arg0, byte arg1, class98 arg2) {
        ++field2565;
        if (arg1 != 64) {
            return null;
        } else if (this.field2534 != null && ~arg2.method706(this.field2534.method1027(), arg0) == -1) {
            return this.field2534;
        } else {
            class193 var4 = this.method1245(73, arg0, arg2, false);
            return var4 == null ? null : var4.field2594;
        }
    }

    @OriginalMember(owner = "client!lw", name = "h", descriptor = "(I)Z")
    public final boolean method270(int arg0) {
        ++field2531;
        if (arg0 >= -42) {
            this.field2563 = -101;
        }
        return true;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lr;Z)V")
    public final void method265(class98 arg0, boolean arg1) {
        ++field2564;
        if (arg1) {
            Object var3 = null;
            class425 var5;
            if (this.field2544 == null && this.field2545) {
                class193 var4 = this.method1245(103, 262144, arg0, true);
                var5 = var4 == null ? null : var4.field2595;
            } else {
                var5 = this.field2544;
                this.field2544 = null;
            }
            if (var5 != null) {
                class91.method508(var5, super.field7900, super.field7895, super.field7896, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lr;Llt;IIIIIZIIIIIIZ)V")
    public class188(class98 arg0, class289 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field4187 == -2, class668.method3745(67, arg13, arg12));
        this.field2549 = arg14;
        this.field2562 = ~arg1.field4250 != -1 && !arg7;
        this.field2566 = (short) arg1.field4224;
        this.field2538 = arg7;
        this.field2559 = (byte) arg12;
        this.field2563 = (byte) arg13;
        super.field7900 = (byte) arg3;
        this.field2545 = arg0.method671() && arg1.field4219 && !this.field2538 && ~class335.field4872.method3786(class62.field996, false) != -1;
        int var16 = 2048;
        if (this.field2549) {
            var16 |= 65536;
        }
        class193 var17 = this.method1245(35, var16, arg0, this.field2545);
        if (var17 != null) {
            this.field2534 = var17.field2594;
            this.field2544 = var17.field2595;
            if (this.field2549) {
                this.field2534 = this.field2534.method1038((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(BLr;)V")
    public final void method273(byte arg0, class98 arg1) {
        ++field2547;
        Object var3 = null;
        class425 var5;
        if (this.field2544 == null && this.field2545) {
            class193 var4 = this.method1245(42, 262144, arg1, true);
            var5 = var4 == null ? null : var4.field2595;
        } else {
            var5 = this.field2544;
            this.field2544 = null;
        }
        if (var5 != null) {
            class445.method2628(var5, super.field7900, super.field7895, super.field7896, (boolean[]) null);
        }
        int var6 = -55 % ((2 - arg0) / 56);
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(Z)I")
    public final int method271(boolean arg0) {
        if (arg0) {
            this.field2549 = true;
        }
        ++field2552;
        return this.field2534 == null ? 0 : this.field2534.method1007();
    }

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "(Z)Z")
    public final boolean method309(boolean arg0) {
        ++field2532;
        if (!arg0) {
            this.field2549 = false;
        }
        return this.field2549;
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(II)Z")
    public static final boolean method1243(int arg0, int arg1) {
        if (arg1 != 1679) {
            return false;
        } else {
            ++field2548;
            return arg0 == 7 || arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)I")
    public final int method277(byte arg0) {
        if (arg0 != 95) {
            return 46;
        } else {
            ++field2553;
            return this.field2566 & 65535;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIZLr;)Z")
    public final boolean method261(int arg0, int arg1, boolean arg2, class98 arg3) {
        ++field2536;
        class395 var5 = this.method1242(131072, (byte) 64, arg3);
        if (arg2) {
            this.method274(-16);
        }
        if (var5 != null) {
            class151 var6 = arg3.method682();
            var6.method883(super.field7895, super.field7894, super.field7896);
            return class384.field5767 ? var5.method1022(arg0, arg1, var6, false, class515.field7222) : var5.method1026(arg0, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Ldc;IBLr;I)V")
    public static final void method1244(class302 arg0, int arg1, byte arg2, class98 arg3, int arg4) {
        class507.field7162.method1905(arg2);
        if (arg2 != 0) {
            method1241(127);
        }
        ++field2543;
        if (!class309.field4555) {
            for (class415 var5 = (class415) arg0.method1904(false); var5 != null; var5 = (class415) arg0.method1901(arg2 + 120)) {
                class168 var6 = class55.field834.method2757(var5.field6142, (byte) -46);
                if (class456.method2672((byte) -124, var6)) {
                    boolean var7 = class595.method3387(arg1, var6, arg4, var5, false, arg3);
                    if (var7) {
                        class281.method1671(arg3, var5, -29, var6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "f", descriptor = "(I)I")
    public final int method258(int arg0) {
        ++field2542;
        if (arg0 != -1) {
            return -100;
        } else {
            return this.field2534 != null ? this.field2534.method1018() : 0;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V")
    public final void method276(int arg0) {
        if (arg0 < 63) {
            this.method311(-59, (class98) null, -13, (class538) null, false, -92, -89);
        }
        ++field2541;
        if (this.field2534 != null) {
            this.field2534.method1016();
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IILr;Z)Ldg;")
    private final class193 method1245(int arg0, int arg1, class98 arg2, boolean arg3) {
        if (arg0 < 34) {
            this.field2549 = false;
        }
        ++field2533;
        class289 var5 = class60.field965.method2596(0, this.field2566 & 65535);
        class682 var6;
        class682 var7;
        if (!this.field2538) {
            var6 = class262.field3404[super.field7900];
            if (~super.field7900 > -4) {
                var7 = class262.field3404[super.field7900 + 1];
            } else {
                var7 = null;
            }
        } else {
            var6 = class383.field5753[super.field7900];
            var7 = class262.field3404[0];
        }
        return var5.method1781(~this.field2559 != -12 ? this.field2563 : 4 - -this.field2563, var6, 19886, arg1, var7, super.field7894, this.field2559 == 11 ? 10 : this.field2559, super.field7896, arg3, arg2, super.field7895);
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(Lr;I)Lifa;")
    public final class62 method268(class98 arg0, int arg1) {
        if (this.field2560 == null) {
            this.field2560 = class249.method1513(super.field7896, super.field7894, this.method1242(0, (byte) 64, arg0), 2, super.field7895);
        }
        if (arg1 != 0) {
            return null;
        } else {
            ++field2551;
            return this.field2560;
        }
    }

    @OriginalMember(owner = "client!lw", name = "j", descriptor = "(I)I")
    public final int method1246(int arg0) {
        if (arg0 < 104) {
            return 50;
        } else {
            ++field2537;
            return this.field2534 == null ? 15 : this.field2534.method1041() / 4;
        }
    }

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "(B)V")
    public final void method315(byte arg0) {
        ++field2546;
        if (arg0 > 101) {
            this.field2549 = false;
            if (this.field2534 != null) {
                this.field2534.method1017(this.field2534.method1027() & -65537);
            }
        }
    }
}
