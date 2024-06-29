import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class259 extends class303 implements class323 {

    @OriginalMember(owner = "client!a", name = "D", descriptor = "S")
    private short field3269;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "B")
    private byte field3272;

    @OriginalMember(owner = "client!a", name = "J", descriptor = "Z")
    private boolean field3275;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "B")
    private byte field3278;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "Z")
    private boolean field3273;

    @OriginalMember(owner = "client!a", name = "L", descriptor = "B")
    private byte field3277;

    @OriginalMember(owner = "client!a", name = "F", descriptor = "Z")
    private boolean field3271;

    @OriginalMember(owner = "client!a", name = "R", descriptor = "Lc;")
    private class507 field3283;

    @OriginalMember(owner = "client!a", name = "W", descriptor = "Lj;")
    private class254 field3288;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "Lpi;")
    public static class340 field3267 = new class340(61, -2);

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "I")
    public static int field3282 = 0;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!a", name = "P", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!a", name = "S", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!a", name = "T", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!a", name = "U", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!a", name = "V", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!a", name = "X", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V", line = 8)
    public final void method418(int arg0) {
        if (arg0 != -14924) {
            this.field3271 = true;
        }
        if (this.field3283 != null) {
            this.field3283.method492();
        }
        ++field3268;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lqa;I)V", line = 24)
    public final void method416(class129 arg0, int arg1) {
        ++field3266;
        if (arg1 == 16663) {
            Object var3 = null;
            class254 var5;
            if (this.field3288 == null && this.field3271) {
                class445 var4 = this.method1620(true, 0, 262144, arg0);
                var5 = var4 != null ? var4.field6182 : null;
            } else {
                var5 = this.field3288;
                this.field3288 = null;
            }
            if (var5 != null) {
                class518.method3076(var5, this.field3277, super.field3926, super.field3929, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZILqa;)Z", line = 55)
    public final boolean method179(int arg0, boolean arg1, int arg2, class129 arg3) {
        ++field3289;
        class507 var5 = this.method1618(!arg1, arg3, 131072);
        if (arg1) {
            return true;
        } else if (var5 != null) {
            class142 var6 = arg3.method847();
            var6.method982(super.field3926, super.field3919, super.field3929);
            return var5.method499(arg0, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZLqa;I)Lc;", line = 79)
    private final class507 method1618(boolean arg0, class129 arg1, int arg2) {
        ++field3284;
        if (this.field3283 != null && arg1.method880(this.field3283.method475(), arg2) == 0) {
            return this.field3283;
        } else {
            class445 var4 = this.method1620(false, 0, arg2, arg1);
            if (!arg0) {
                return null;
            } else {
                return var4 == null ? null : var4.field6188;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[[[Ltg;)V", line = 101)
    public static final void method1619(int arg0, class510[][][] arg1) {
        for (int var2 = arg0; ~arg1.length < ~var2; ++var2) {
            class510[][] var3 = arg1[var2];
            for (int var4 = 0; var3.length > var4; ++var4) {
                for (int var5 = 0; ~var5 > ~var3[var4].length; ++var5) {
                    class510 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field7492 instanceof class323) {
                            ((class323) var6.field7492).method418(arg0 ^ -14924);
                        }
                        if (var6.field7485 instanceof class323) {
                            ((class323) var6.field7485).method418(-14924);
                        }
                        if (var6.field7497 instanceof class323) {
                            ((class323) var6.field7497).method418(-14924);
                        }
                        if (var6.field7499 instanceof class323) {
                            ((class323) var6.field7499).method418(-14924);
                        }
                        if (var6.field7502 instanceof class323) {
                            ((class323) var6.field7502).method418(-14924);
                        }
                        for (class319 var7 = var6.field7494; var7 != null; var7 = var7.field4102) {
                            class448 var8 = var7.field4107;
                            if (var8 instanceof class323) {
                                ((class323) var8).method418(-14924);
                            }
                        }
                    }
                }
            }
        }
        ++field3285;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lqa;B)V", line = 176)
    public final void method421(class129 arg0, byte arg1) {
        ++field3291;
        Object var3 = null;
        if (arg1 >= -88) {
            this.method417(false);
        }
        class254 var5;
        if (this.field3288 == null && this.field3271) {
            class445 var4 = this.method1620(true, 0, 262144, arg0);
            var5 = var4 != null ? var4.field6182 : null;
        } else {
            var5 = this.field3288;
            this.field3288 = null;
        }
        if (var5 != null) {
            class24.method161(var5, this.field3277, super.field3926, super.field3929, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZIILqa;)Ldf;", line = 209)
    private final class445 method1620(boolean arg0, int arg1, int arg2, class129 arg3) {
        ++field3279;
        class402 var5 = class52.field715.method1164(65535 & this.field3269, arg1);
        class251 var6;
        class251 var7;
        if (!this.field3275) {
            if (this.field3277 < 3) {
                var6 = class405.field5436[this.field3277 + 1];
            } else {
                var6 = null;
            }
            var7 = class405.field5436[this.field3277];
        } else {
            var7 = class283.field3620[this.field3277];
            var6 = class405.field5436[0];
        }
        return var5.method2383(super.field3926, (byte) 20, arg0, arg2, var6, this.field3278, super.field3919, super.field3929, var7, this.field3272, arg3);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)I", line = 238)
    public final int method414(int arg0) {
        ++field3276;
        if (arg0 != 17350) {
            this.field3272 = -25;
        }
        return this.field3278;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)Z", line = 254)
    public final boolean method417(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field3270;
            return this.field3271;
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Lqa;B)Lvs;", line = 265)
    public final class465 method172(class129 arg0, byte arg1) {
        int var3 = 72 / ((48 - arg1) / 60);
        ++field3286;
        if (this.field3283 == null) {
            return null;
        } else {
            class142 var4 = arg0.method847();
            var4.method982(super.field3926 - -super.field3931, super.field3919, super.field3929 + super.field3924);
            class465 var5 = null;
            if (this.field3273) {
                var5 = class92.method635(1, -16461);
            }
            this.field3283.method520(var4, var5 != null ? var5.field6843[0] : null, 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)I", line = 291)
    public final int method415(int arg0) {
        if (arg0 != -15317) {
            this.field3273 = false;
        }
        ++field3274;
        return this.field3272;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lqa;Ljt;IIIIZIIIII)V", line = 304)
    public class259(class129 arg0, class402 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class14.method96(arg10, arg11, (byte) -38));
        this.field3269 = (short) arg1.field5377;
        this.field3272 = (byte) arg11;
        super.field3926 = arg3;
        this.field3275 = arg6;
        this.field3278 = (byte) arg10;
        this.field3273 = ~arg1.field5347 != -1 && !arg6;
        super.field3929 = arg5;
        this.field3277 = (byte) arg2;
        this.field3271 = arg0.method903() && arg1.field5420 && !this.field3275 && ~class421.field5647.method3097((byte) 121, class520.field7690) != -1;
        class445 var13 = this.method1620(this.field3271, 0, 2048, arg0);
        if (var13 != null) {
            this.field3283 = var13.field6188;
            this.field3288 = var13.field6182;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lmv;ZI)V", line = 328)
    public static final void method1621(class518 arg0, boolean arg1, int arg2) {
        ++field3287;
        if (class271.field3433 < 400) {
            if (class37.field573 == arg0) {
                if (class515.field7573 && (class182.field2380 & 16) != 0) {
                    ++class97.field1359;
                    class126.method793(0, 13, 0L, -1, 0, (byte) -5, false, class195.field2532 + " -> <col=ffffff>" + class350.field4481.method1127(class379.field4920, false), true, class257.field3252, class35.field543);
                }
            } else {
                String var3;
                if (arg0.field7629 != 0) {
                    var3 = arg0.method3080(255, true) + " (" + class516.field7591.method1127(class379.field4920, false) + arg0.field7629 + ")";
                } else {
                    boolean var4 = true;
                    if (~class37.field573.field7647 != 0 && arg0.field7647 != -1) {
                        int var5 = class37.field573.field7633 > arg0.field7633 ? class37.field573.field7633 : arg0.field7633;
                        int var6 = class37.field573.field7647 >= arg0.field7647 ? arg0.field7647 : class37.field573.field7647;
                        int var7 = 5 - -(var5 * 10 / 100) + var6;
                        int var8 = -arg0.field7633 + class37.field573.field7633;
                        if (~var8 > -1) {
                            var8 = -var8;
                        }
                        if (~var8 < ~var7) {
                            var4 = false;
                        }
                    }
                    String var9 = class494.field7234 == class10.field134 ? class334.field4267.method1127(class379.field4920, false) : class284.field3624.method1127(class379.field4920, false);
                    if (arg0.field7633 < arg0.field7663) {
                        var3 = arg0.method3080(arg2 ^ -32754, true) + (!var4 ? "<col=ffffff>" : class203.method1334(arg2 + 32446, arg0.field7633, class37.field573.field7633)) + " (" + var9 + arg0.field7633 + "+" + (-arg0.field7633 + arg0.field7663) + ")";
                    } else {
                        var3 = arg0.method3080(255, true) + (var4 ? class203.method1334(-122, arg0.field7633, class37.field573.field7633) : "<col=ffffff>") + " (" + var9 + arg0.field7633 + ")";
                    }
                }
                if (!class515.field7573) {
                    if (arg1) {
                        class126.method793(0, -1, 0L, 0, 0, (byte) -5, true, "", false, "<col=cccccc>" + var3, -1);
                    } else {
                        for (int var10 = 7; var10 >= 0; --var10) {
                            if (class107.field1451[var10] != null) {
                                short var11 = 0;
                                if (class494.field7234 == class276.field3527 && class107.field1451[var10].equalsIgnoreCase(class318.field4096.method1127(class379.field4920, false))) {
                                    if (~class37.field573.field7633 > ~arg0.field7633) {
                                        var11 = 2000;
                                    }
                                    if (class37.field573.field7624 != 0 && arg0.field7624 != 0) {
                                        if (~class37.field573.field7624 == ~arg0.field7624) {
                                            var11 = 2000;
                                        } else {
                                            var11 = 0;
                                        }
                                    }
                                } else if (class385.field5068[var10]) {
                                    var11 = 2000;
                                }
                                short var12 = (short) (class326.field4185[var10] + var11);
                                int var13 = class46.field675[var10] != -1 ? class46.field675[var10] : class395.field5239;
                                class126.method793(0, var12, (long) arg0.field5159, -1, 0, (byte) -5, false, "<col=ffffff>" + var3, true, class107.field1451[var10], var13);
                                ++class487.field7068;
                            }
                        }
                    }
                } else if (!arg1 && ~(class182.field2380 & 8) != -1) {
                    ++class489.field7132;
                    class126.method793(0, 11, (long) arg0.field5159, -1, 0, (byte) -5, false, class195.field2532 + " -> <col=ffffff>" + var3, true, class257.field3252, class35.field543);
                }
                if (!arg1) {
                    for (class502 var14 = (class502) class103.field1421.method49(95); var14 != null; var14 = (class502) class103.field1421.method46((byte) 76)) {
                        if (var14.field7390 == 21) {
                            var14.field7375 = "<col=ffffff>" + var3;
                            break;
                        }
                    }
                }
                if (arg2 != -32527) {
                    field3267 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IILqa;)Lc;", line = 485)
    public final class507 method419(int arg0, int arg1, class129 arg2) {
        if (arg1 != -32039) {
            method1622(94);
        }
        ++field3290;
        return this.method1618(true, arg2, arg0);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)I", line = 497)
    public final int method1131(byte arg0) {
        if (arg0 <= 72) {
            this.field3273 = true;
        }
        ++field3281;
        return this.field3283 != null ? this.field3283.method507() : 0;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BLqa;)V", line = 508)
    public final void method175(byte arg0, class129 arg1) {
        if (arg0 != 91) {
            this.method417(false);
        }
        ++field3280;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)I", line = 519)
    public final int method413(int arg0) {
        ++field3265;
        return arg0 != -30502 ? -27 : 65535 & this.field3269;
    }

    @OriginalMember(owner = "client!a", name = "h", descriptor = "(I)V", line = 530)
    public static void method1622(int arg0) {
        field3267 = null;
        if (arg0 < 72) {
            field3282 = 116;
        }
    }
}
