import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class279 extends class448 implements class323 {

    @OriginalMember(owner = "client!qm", name = "T", descriptor = "Luc;")
    public class200 field3583;

    @OriginalMember(owner = "client!qm", name = "Q", descriptor = "Z")
    private boolean field3580;

    @OriginalMember(owner = "client!qm", name = "R", descriptor = "Loi;")
    public static class169 field3581 = new class169("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!qm", name = "E", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!qm", name = "F", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!qm", name = "G", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!qm", name = "H", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!qm", name = "I", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!qm", name = "J", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!qm", name = "K", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!qm", name = "L", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!qm", name = "M", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!qm", name = "N", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!qm", name = "O", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!qm", name = "P", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!qm", name = "S", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!qm", name = "U", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!qm", name = "V", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!qm", name = "W", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(Lqa;B)Lvs;")
    public final class465 method172(class129 arg0, byte arg1) {
        int var3 = 43 / ((48 - arg1) / 60);
        ++field3568;
        class507 var4 = this.field3583.method1280(false, super.field6241, super.field6239, 0, 2048, true, arg0);
        if (var4 == null) {
            return null;
        } else {
            class142 var5 = arg0.method847();
            var5.method982(super.field6239, super.field6224, super.field6241);
            class465 var6 = null;
            if (this.field3580) {
                var6 = class92.method635(1, -16461);
            }
            if (this.field3583.field2572 != null) {
                class287 var7 = this.field3583.field2572.method1969();
                arg0.method824(var4, var7, var5, var6 != null ? var6.field6843[0] : null, 0);
            } else {
                var4.method520(var5, var6 != null ? var6.field6843[0] : null, 0);
            }
            this.field3583.method1279(super.field6229, arg0, super.field6221, var4, super.field6238, true, super.field6228, (byte) 103);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)Z")
    public final boolean method177(int arg0) {
        ++field3582;
        return arg0 != 5 ? false : false;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZILqa;)Z")
    public final boolean method179(int arg0, boolean arg1, int arg2, class129 arg3) {
        ++field3570;
        class507 var5 = this.field3583.method1280(false, super.field6241, super.field6239, 0, 131072, arg1, arg3);
        if (var5 == null) {
            return false;
        } else {
            class142 var6 = arg3.method847();
            var6.method982(super.field6239, super.field6224, super.field6241);
            return var5.method499(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLqa;)V")
    public final void method175(byte arg0, class129 arg1) {
        ++field3585;
        class507 var3 = this.field3583.method1280(true, super.field6241, super.field6239, arg0 + -91, 262144, true, arg1);
        if (arg0 == 91) {
            if (var3 != null) {
                this.field3583.method1279(super.field6229, arg1, super.field6221, var3, super.field6238, false, super.field6228, (byte) 118);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)I")
    public final int method413(int arg0) {
        if (arg0 != -30502) {
            field3581 = null;
        }
        ++field3584;
        return this.field3583.field2565;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)I")
    public final int method414(int arg0) {
        if (arg0 != 17350) {
            this.method172((class129) null, (byte) 92);
        }
        ++field3586;
        return this.field3583.field2597;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
    public final void method173(byte arg0) {
        if (arg0 != -32) {
            this.field3580 = true;
        }
        ++field3576;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLrn;ZIILqa;I)V")
    public final void method174(byte arg0, class242 arg1, boolean arg2, int arg3, int arg4, class129 arg5, int arg6) {
        ++field3569;
        if (arg0 == 91) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
    public final void method418(int arg0) {
        ++field3575;
        if (arg0 != -14924) {
            this.method416((class129) null, -41);
        }
    }

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "(I)I")
    public final int method180(int arg0) {
        ++field3573;
        int var2 = -72 / (arg0 / 33);
        return this.field3583.method1287(1);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lqa;B)V")
    public final void method421(class129 arg0, byte arg1) {
        this.field3583.method1282(arg0, (byte) 112);
        if (arg1 > -88) {
            this.field3580 = true;
        }
        ++field3574;
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)I")
    public final int method415(int arg0) {
        if (arg0 != -15317) {
            field3581 = null;
        }
        ++field3579;
        return this.field3583.field2585;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)Z")
    public final boolean method417(boolean arg0) {
        ++field3572;
        if (arg0) {
            this.method175((byte) 94, (class129) null);
        }
        return this.field3583.method1290(104);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lqa;I)V")
    public final void method416(class129 arg0, int arg1) {
        if (arg1 != 16663) {
            field3581 = null;
        }
        this.field3583.method1278(-7278, arg0);
        ++field3571;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILqa;)Lc;")
    public final class507 method419(int arg0, int arg1, class129 arg2) {
        ++field3577;
        if (arg1 != -32039) {
            field3581 = null;
        }
        return this.field3583.method1280(false, 0, 0, 0, arg0, false, arg2);
    }

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "(I)V")
    public static void method1716(int arg0) {
        field3581 = null;
        int var1 = 37 / ((arg0 - -61) / 58);
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lqa;Ljt;IIIIIZIIIIIII)V")
    public class279(class129 arg0, class402 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field5344 == 1, class147.method1015(0, arg13, arg12));
        this.field3583 = new class200(arg0, arg1, arg12, arg13, super.field6220, arg3, arg4, arg6, arg7, arg14);
        this.field3580 = arg1.field5347 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILqa;Lcc;ILtn;)Z")
    public static final boolean method1717(int arg0, int arg1, class129 arg2, class343 arg3, int arg4, class429 arg5) {
        ++field3578;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg5.field5901 != null) {
            var8 = -((arg3.field4368 + arg5.field5921 + -class230.field2982) * (-class230.field2981 + class230.field2977) / (class230.field2972 - class230.field2982)) + class230.field2977;
            var7 = (arg3.field4367 + arg5.field5908 + -class230.field2976) * (-class230.field2973 + class230.field2964) / (-class230.field2976 + class230.field2980) + class230.field2973;
            var6 = (arg5.field5895 - (-arg3.field4367 + class230.field2976)) * (-class230.field2973 + class230.field2964) / (-class230.field2976 + class230.field2980) + class230.field2973;
            var9 = -((arg5.field5915 - class230.field2982 + arg3.field4368) * (-class230.field2981 + class230.field2977) / (-class230.field2982 + class230.field2972)) + class230.field2977;
        }
        class404 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = arg0;
        if (~arg5.field5875 != 0) {
            if (arg3.field4362 && arg5.field5888 != -1) {
                var10 = arg5.method2540(true, (byte) 65, arg2);
            } else {
                var10 = arg5.method2540(false, (byte) 65, arg2);
            }
            if (var10 != null) {
                var11 = arg3.field4364 + -(var10.method370() + 1 >> 1);
                var12 = arg3.field4364 + (var10.method370() - -1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                if (var12 > var7) {
                    var7 = var12;
                }
                var13 = arg3.field4369 - (1 + var10.method369() >> 1);
                var14 = arg3.field4369 - -(1 + var10.method369() >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                if (~var14 < ~var9) {
                    var9 = var14;
                }
            }
        }
        class455 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg5.field5916 != null) {
            var15 = class340.method2005(arg5.field5899, (byte) 125);
            if (var15 != null) {
                var16 = class113.field1553.method1710((byte) -41, (int[]) null, (class404[]) null, arg5.field5916, class431.field5942);
                int var23 = arg3.field4369;
                if (var10 == null) {
                    var17 = var23 - var15.method2698() * var16 / 2;
                } else {
                    var17 = var23 - ((var10.method369() >> 1) - -(var16 * var15.method2700()));
                }
                for (int var24 = 0; var24 < var16; ++var24) {
                    String var25 = class431.field5942[var24];
                    if (var16 + -1 > var24) {
                        var25 = var25.substring(0, -4 + var25.length());
                    }
                    int var26 = var15.method2694(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = -(var18 / 2) + arg3.field4364 + arg1;
                if (var6 > var19) {
                    var6 = var19;
                }
                var20 = arg3.field4364 - -(var18 / 2) + arg1;
                var21 = arg4 + var17;
                if (var20 > var7) {
                    var7 = var20;
                }
                var22 = arg4 + var17 + var16 * var15.method2700();
                if (~var8 < ~var21) {
                    var8 = var21;
                }
                if (~var9 > ~var22) {
                    var9 = var22;
                }
            }
        }
        if (~var7 <= ~class230.field2973 && var6 <= class230.field2964 && ~var9 <= ~class230.field2981 && var8 <= class230.field2977) {
            if (arg5.field5901 != null) {
                int[] var27 = new int[arg5.field5901.length];
                for (int var28 = 0; ~var28 > ~(var27.length / 2); ++var28) {
                    int var30 = arg5.field5901[var28 * 2] + arg3.field4367;
                    int var31 = arg5.field5901[var28 * 2 + 1] - -arg3.field4368;
                    var27[var28 * 2] = (class230.field2964 - class230.field2973) * (-class230.field2976 + var30) / (-class230.field2976 + class230.field2980) + class230.field2973;
                    var27[var28 * 2 + 1] = class230.field2977 - (var31 - class230.field2982) * (class230.field2977 - class230.field2981) / (-class230.field2982 + class230.field2972);
                }
                class427.method2529(arg2, var27, arg5.field5917);
                for (int var29 = 0; var29 < var27.length / 2 + -1; ++var29) {
                    arg2.method910(arg5.field5909, var27[var29 * 2], var27[var29 * 2 + 2], var27[var29 * 2 + 1], var27[(var29 + 1) * 2 - -1], -124);
                }
                arg2.method910(arg5.field5909, var27[var27.length + -2], var27[0], var27[var27.length + -1], var27[1], arg0 ^ -109);
            }
            if (var10 != null) {
                if (class407.field5459 > 0 && (class196.field2536 != -1 && ~class196.field2536 == ~arg3.field4371 || ~class246.field3149 != 0 && ~class246.field3149 == ~arg5.field5912)) {
                    int var32;
                    if (~class181.field2366 >= -51) {
                        var32 = class181.field2366 * 2;
                    } else {
                        var32 = (-class181.field2366 + 100) * 2;
                    }
                    int var33 = 16776960 | var32 << 24;
                    arg2.method881(7 + var10.method375() / 2, arg3.field4364, arg3.field4369, (byte) -36, var33);
                    arg2.method881(var10.method375() / 2 + 5, arg3.field4364, arg3.field4369, (byte) -51, var33);
                    arg2.method881(3 + var10.method375() / 2, arg3.field4364, arg3.field4369, (byte) -67, var33);
                    arg2.method881(var10.method375() / 2 + 1, arg3.field4364, arg3.field4369, (byte) -60, var33);
                    arg2.method881(var10.method375() / 2, arg3.field4364, arg3.field4369, (byte) -94, var33);
                }
                var10.method2406(arg3.field4364 + -(var10.method370() >> 1), arg3.field4369 - (var10.method369() >> 1));
            }
            if (arg5.field5916 != null && var15 != null) {
                class355.method2081(var15, arg2, arg5, var17, var18, var16, arg3, arg0 ^ 127);
            }
            if (~arg5.field5875 != 0 || arg5.field5916 != null) {
                class36 var34 = new class36(arg3);
                var34.field563 = var20;
                var34.field557 = var11;
                var34.field550 = var12;
                var34.field551 = var13;
                var34.field559 = var14;
                var34.field560 = var21;
                var34.field565 = var22;
                var34.field564 = var19;
                class176.field2250.method42(var34, 0);
            }
            return false;
        } else {
            return true;
        }
    }
}
