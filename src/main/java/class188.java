import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class188 extends class142 {

    @OriginalMember(owner = "client!ti", name = "gc", descriptor = "I")
    public int field3492 = 0;

    @OriginalMember(owner = "client!ti", name = "dc", descriptor = "I")
    public int field3489 = 0;

    @OriginalMember(owner = "client!ti", name = "cc", descriptor = "Z")
    public boolean field3488 = false;

    @OriginalMember(owner = "client!ti", name = "fc", descriptor = "I")
    public int field3491 = -1;

    @OriginalMember(owner = "client!ti", name = "bc", descriptor = "S")
    private short field3487 = 0;

    @OriginalMember(owner = "client!ti", name = "lc", descriptor = "I")
    public int field3497 = 0;

    @OriginalMember(owner = "client!ti", name = "mc", descriptor = "I")
    public int field3498 = 0;

    @OriginalMember(owner = "client!ti", name = "ec", descriptor = "I")
    public int field3490 = 0;

    @OriginalMember(owner = "client!ti", name = "Tb", descriptor = "I")
    private int field3479 = 0;

    @OriginalMember(owner = "client!ti", name = "sc", descriptor = "I")
    public int field3504 = -1;

    @OriginalMember(owner = "client!ti", name = "Wb", descriptor = "I")
    public int field3482 = -1;

    @OriginalMember(owner = "client!ti", name = "wc", descriptor = "I")
    public int field3508 = 0;

    @OriginalMember(owner = "client!ti", name = "pc", descriptor = "I")
    public int field3501 = -1;

    @OriginalMember(owner = "client!ti", name = "Bc", descriptor = "I")
    public int field3513 = -1;

    @OriginalMember(owner = "client!ti", name = "Fc", descriptor = "I")
    public int field3517 = 0;

    @OriginalMember(owner = "client!ti", name = "Gc", descriptor = "I")
    public int field3518 = -1;

    @OriginalMember(owner = "client!ti", name = "Hc", descriptor = "S")
    private short field3519 = 0;

    @OriginalMember(owner = "client!ti", name = "Pb", descriptor = "I")
    public static int field3475 = -1;

    @OriginalMember(owner = "client!ti", name = "Yb", descriptor = "Z")
    public static boolean field3484 = true;

    @OriginalMember(owner = "client!ti", name = "Dc", descriptor = "Lli;")
    public static class185 field3515 = class245.method1649(" ", -119);

    @OriginalMember(owner = "client!ti", name = "yc", descriptor = "Lli;")
    public static class185 field3510 = class245.method1649("Chargement des fichiers config )2 ", -115);

    @OriginalMember(owner = "client!ti", name = "vc", descriptor = "Lli;")
    public static class185 field3507 = class245.method1649("Spieler kann nicht gefunden werden: ", -26);

    @OriginalMember(owner = "client!ti", name = "Qb", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!ti", name = "Rb", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!ti", name = "Vb", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!ti", name = "Zb", descriptor = "I")
    public int field3485;

    @OriginalMember(owner = "client!ti", name = "ac", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!ti", name = "hc", descriptor = "I")
    public int field3493;

    @OriginalMember(owner = "client!ti", name = "ic", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!ti", name = "jc", descriptor = "I")
    public int field3495;

    @OriginalMember(owner = "client!ti", name = "kc", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!ti", name = "nc", descriptor = "I")
    public int field3499;

    @OriginalMember(owner = "client!ti", name = "oc", descriptor = "I")
    public int field3500;

    @OriginalMember(owner = "client!ti", name = "qc", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!ti", name = "rc", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!ti", name = "tc", descriptor = "I")
    public int field3505;

    @OriginalMember(owner = "client!ti", name = "uc", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!ti", name = "xc", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!ti", name = "zc", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!ti", name = "Ac", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!ti", name = "Ec", descriptor = "I")
    public int field3516;

    @OriginalMember(owner = "client!ti", name = "Cc", descriptor = "Lli;")
    public class185 field3514;

    @OriginalMember(owner = "client!ti", name = "Ub", descriptor = "Lhi;")
    public static class250 field3480;

    @OriginalMember(owner = "client!ti", name = "Sb", descriptor = "Lqh;")
    public class256 field3478;

    @OriginalMember(owner = "client!ti", name = "Xb", descriptor = "Lic;")
    public class98 field3483;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)Z")
    public final boolean method463(boolean arg0) {
        if (!arg0) {
            method1360((class185) null, (byte) 49);
        }
        ++field3502;
        return this.field3478 != null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIII)V")
    public final void method46(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3481;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1353(Component arg0, int arg1) {
        if (arg1 != 11951) {
            method1353((Component) null, -47);
        }
        ++field3506;
        Method var2 = class160.field3035;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class241.field4308);
        arg0.addFocusListener(class241.field4308);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljd;Z)V")
    public final void method1354(class118 arg0, boolean arg1) {
        arg0.field2155 = 0;
        int var3 = arg0.method867(false);
        int var4 = 1 & var3;
        ++field3512;
        if ((2 & var3) == 2) {
            this.field3487 = (short) (arg0.method867(arg1) << 2);
            this.field3519 = (short) (arg0.method867(false) << 2);
        } else {
            this.field3487 = 0;
            this.field3519 = 0;
        }
        int var5 = super.method1014(-1);
        boolean var6 = (var3 & 4) != 0;
        int var7 = -1;
        int[] var8 = new int[12];
        this.method1015((var3 >> 3 & 7) + 1, 10672);
        this.field3479 = (205 & var3) >> 6;
        super.field2694 += (-var5 + this.method1014(-1)) * 64;
        super.field2687 += 64 * (this.method1014(-1) + -var5);
        this.field3491 = arg0.method838(1275919136);
        this.field3501 = arg0.method838(1275919136);
        this.field3489 = 0;
        for (int var9 = 0; ~var9 > -13; ++var9) {
            int var10 = arg0.method867(false);
            if (~var10 == -1) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method867(false);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && ~var12 == -65536) {
                    var7 = arg0.method827(255);
                    this.field3489 = arg0.method867(arg1);
                    break;
                }
                if (var12 >= 32768) {
                    int var23 = class21.field360[var12 - 32768];
                    var8[var9] = class21.method150(var23, 1073741824);
                    int var24 = class165.method1179(102, var23).field2407;
                    if (var24 != 0) {
                        this.field3489 = var24;
                    }
                } else {
                    var8[var9] = class21.method150(var12 + -256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; ~var14 > -6; ++var14) {
            int var22 = arg0.method867(false);
            if (var22 < 0 || ~class130.field2332[var14].length >= ~var22) {
                var22 = 0;
            }
            var13[var14] = var22;
        }
        super.field2693 = arg0.method827(255);
        if (super.field2693 == 65535) {
            super.field2693 = -1;
        }
        super.field2648 = arg0.method827(255);
        if (super.field2648 == 65535) {
            super.field2648 = -1;
        }
        super.field2666 = super.field2648;
        super.field2700 = arg0.method827(255);
        if (~super.field2700 == -65536) {
            super.field2700 = -1;
        }
        super.field2716 = arg0.method827(255);
        if (~super.field2716 == -65536) {
            super.field2716 = -1;
        }
        super.field2719 = arg0.method827(255);
        if (super.field2719 == 65535) {
            super.field2719 = -1;
        }
        super.field2699 = arg0.method827(255);
        if (super.field2699 == 65535) {
            super.field2699 = -1;
        }
        super.field2667 = arg0.method827(255);
        if (super.field2667 == 65535) {
            super.field2667 = -1;
        }
        long var15 = arg0.method862(false);
        this.field3514 = class271.method1859((byte) -108, var15).method1334(38);
        this.field3497 = arg0.method867(false);
        if (!var6) {
            this.field3492 = 0;
            this.field3498 = arg0.method867(false);
            this.field3513 = arg0.method867(false);
            if (this.field3513 == 255) {
                this.field3513 = -1;
            }
        } else {
            this.field3492 = arg0.method827(255);
            this.field3498 = this.field3497;
            this.field3513 = -1;
        }
        int var17 = this.field3508;
        this.field3508 = arg0.method867(arg1);
        if (this.field3508 != 0) {
            int var18 = this.field3482;
            int var19 = this.field3518;
            int var20 = this.field3504;
            this.field3482 = arg0.method827(255);
            this.field3504 = arg0.method827(255);
            this.field3518 = arg0.method827(255);
            if (~this.field3508 != ~var17 || ~this.field3482 != ~var18 || ~this.field3504 != ~var20 || this.field3518 != var19) {
                class273.method1876(this, 0);
            }
        } else {
            class220.method1523(this, false);
        }
        if (this.field3478 == null) {
            this.field3478 = new class256();
        }
        int var21 = this.field3478.field4547;
        this.field3478.method1744(var8, true, ~var4 == -2, var7, var13);
        if (var7 != var21) {
            super.field2694 = super.field2651[0] * 128 + 64 * this.method1014(-1);
            super.field2687 = super.field2720[0] * 128 + this.method1014(-1) * 64;
        }
        if (super.field2692 != null) {
            super.field2692.method120();
        }
    }

    @OriginalMember(owner = "client!ti", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field3477;
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)Lli;")
    public final class185 method1355(int arg0) {
        ++field3503;
        class185 var2 = this.field3514;
        if (arg0 != 8) {
            return null;
        } else {
            if (class32.field524 != null) {
                var2 = class87.method567(-11039, new class185[] { class32.field524[this.field3479], var2 });
            }
            if (class20.field324 != null) {
                var2 = class87.method567(-11039, new class185[] { var2, class20.field324[this.field3479] });
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IBIZ)V")
    public final void method1356(int arg0, byte arg1, int arg2, boolean arg3) {
        if (arg1 != -85) {
            this.method1356(-31, (byte) 72, -124, true);
        }
        ++field3496;
        super.method1018(arg3, this.method1014(-1), arg0, arg2, -12477);
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(III)Z")
    public static final boolean method1357(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class40.field623; ++var3) {
            class156 var4 = class68.field1178[var3];
            if (var4.field2947 == 1) {
                int var5 = var4.field2961 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2963 * var5 >> 8) + var4.field2964;
                    int var7 = (var4.field2966 * var5 >> 8) + var4.field2959;
                    int var8 = (var4.field2950 * var5 >> 8) + var4.field2948;
                    int var9 = (var4.field2943 * var5 >> 8) + var4.field2938;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2947 == 2) {
                int var10 = arg0 - var4.field2961;
                if (var10 > 0) {
                    int var11 = (var4.field2963 * var10 >> 8) + var4.field2964;
                    int var12 = (var4.field2966 * var10 >> 8) + var4.field2959;
                    int var13 = (var4.field2950 * var10 >> 8) + var4.field2948;
                    int var14 = (var4.field2943 * var10 >> 8) + var4.field2938;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2947 == 3) {
                int var15 = var4.field2964 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2941 * var15 >> 8) + var4.field2961;
                    int var17 = (var4.field2960 * var15 >> 8) + var4.field2956;
                    int var18 = (var4.field2950 * var15 >> 8) + var4.field2948;
                    int var19 = (var4.field2943 * var15 >> 8) + var4.field2938;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2947 == 4) {
                int var20 = arg2 - var4.field2964;
                if (var20 > 0) {
                    int var21 = (var4.field2941 * var20 >> 8) + var4.field2961;
                    int var22 = (var4.field2960 * var20 >> 8) + var4.field2956;
                    int var23 = (var4.field2950 * var20 >> 8) + var4.field2948;
                    int var24 = (var4.field2943 * var20 >> 8) + var4.field2938;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2947 == 5) {
                int var25 = arg1 - var4.field2948;
                if (var25 > 0) {
                    int var26 = (var4.field2941 * var25 >> 8) + var4.field2961;
                    int var27 = (var4.field2960 * var25 >> 8) + var4.field2956;
                    int var28 = (var4.field2963 * var25 >> 8) + var4.field2964;
                    int var29 = (var4.field2966 * var25 >> 8) + var4.field2959;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)I")
    public final int method1014(int arg0) {
        if (arg0 != -1) {
            field3480 = null;
        }
        ++field3511;
        return this.field3478 != null && this.field3478.field4547 != -1 ? class269.method1828(2, this.field3478.field4547).field1452 : super.method1014(-1);
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)V")
    public static void method1358(int arg0) {
        field3510 = null;
        field3515 = null;
        field3507 = null;
        if (arg0 != 8) {
            method1360((class185) null, (byte) -54);
        }
        field3480 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "()I")
    public final int method62() {
        ++field3476;
        return super.field2715;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lga;ILic;IIIIIIIIIIII)V")
    private final void method1359(class16 arg0, int arg1, class98 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        int var16 = arg6 * arg6 + arg13 * arg13;
        ++field3509;
        if (var16 >= 16 && ~var16 >= -360001) {
            int var17 = 2047 & (int) (325.949D * Math.atan2((double) arg6, (double) arg13));
            int var18 = -97 % ((arg4 - -66) / 33);
            class98 var19 = class80.method516(super.field2694, var17, super.field2711, arg9, super.field2687, arg2, (byte) 4);
            if (var19 != null) {
                var19.method48(0, arg7, arg14, arg11, arg3, arg8, arg1, arg5, -1L, arg10, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lli;B)V")
    public static final void method1360(class185 arg0, byte arg1) {
        ++field3494;
        if (arg1 >= -121) {
            method1353((Component) null, -3);
        }
        for (class85 var2 = (class85) class235.field4213.method1375(16259); var2 != null; var2 = (class85) class235.field4213.method1377(-19546)) {
            if (var2.field1680.method1329(arg0, (byte) 22)) {
                class65.field1124 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIIIIJILga;)V")
    public final void method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class16 arg10) {
        ++field3486;
        if (this.field3478 != null) {
            class2 var13 = ~super.field2655 != 0 && ~super.field2691 == -1 ? class253.method1712(super.field2655, -123) : null;
            class2 var14 = super.field2654 == -1 || this.field3488 || super.field2693 == super.field2654 && var13 != null ? null : class253.method1712(super.field2654, -126);
            class98 var15 = this.field3478.method1734(var14, true, var13, super.field2663, (byte) -105, super.field2652);
            int var16 = class262.method1789(10);
            if (~class254.field4502 != -1 && ~var16 > -51) {
                int var17 = -var16 + 50;
                while (var17 > class78.field1366) {
                    class256.field4550[class78.field1366] = new byte[102400];
                    ++class78.field1366;
                }
                while (class78.field1366 > var17) {
                    --class78.field1366;
                    class256.field4550[class78.field1366] = null;
                }
            }
            if (var15 != null) {
                super.field2715 = var15.method62();
                if (class194.field3578 && (this.field3478.field4547 == -1 || class269.method1828(2, this.field3478.field4547).field1451)) {
                    class98 var18 = class181.method1277(160, var14 != null ? var14 : var13, 0, super.field2711, super.field2694, super.field2690, var14 != null ? super.field2652 : super.field2663, 0, super.field2687, 240, arg0, 1, (byte) -95, var15);
                    var18.method48(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class16) null);
                }
                if (class241.field4310 == this) {
                    for (int var19 = class10.field204.length + -1; ~var19 <= -1; --var19) {
                        class201 var20 = class10.field204[var19];
                        if (var20 != null && ~var20.field3681 != 0) {
                            if (var20.field3695 == 1 && ~var20.field3689 <= -1 && var20.field3689 < class87.field1712.length) {
                                class71 var21 = class87.field1712[var20.field3689];
                                if (var21 != null) {
                                    int var22 = var21.field2694 / 32 + -(class241.field4310.field2694 / 32);
                                    int var23 = var21.field2687 / 32 + -(class241.field4310.field2687 / 32);
                                    this.method1359((class16) null, arg6, var15, arg4, -19, arg7, var22, arg1, arg5, var20.field3681, arg9, arg3, arg0, var23, arg2);
                                }
                            }
                            if (~var20.field3695 == -3) {
                                int var24 = (-class107.field1933 + var20.field3682) * 4 + 2 + -(class241.field4310.field2687 / 32);
                                int var25 = (var20.field3677 - class77.field1339) * 4 + -(class241.field4310.field2694 / 32) + 2;
                                this.method1359((class16) null, arg6, var15, arg4, -112, arg7, var25, arg1, arg5, var20.field3681, arg9, arg3, arg0, var24, arg2);
                            }
                            if (var20.field3695 == 10 && var20.field3689 >= 0 && var20.field3689 < class93.field1774.length) {
                                class188 var26 = class93.field1774[var20.field3689];
                                if (var26 != null) {
                                    int var27 = var26.field2694 / 32 + -(class241.field4310.field2694 / 32);
                                    int var28 = var26.field2687 / 32 - class241.field4310.field2687 / 32;
                                    this.method1359((class16) null, arg6, var15, arg4, -120, arg7, var27, arg1, arg5, var20.field3681, arg9, arg3, arg0, var28, arg2);
                                }
                            }
                        }
                    }
                }
                int var29 = 0;
                int var30 = 0;
                int var31 = 0;
                if (~this.field3487 != -1 && ~this.field3519 != -1) {
                    int var32 = class167.field3110[arg0];
                    short var33 = this.field3487;
                    int var34 = class167.field3112[arg0];
                    short var35 = this.field3519;
                    int var36 = -var33 / 2;
                    int var37 = -var35 / 2;
                    int var38 = var34 * var37 - var32 * var36 >> 16;
                    int var39 = var32 * var37 + var34 * var36 >> 16;
                    int var40 = class236.method1606(51, super.field2687 - -var38, super.field2694 - -var39, class265.field4703);
                    int var41 = var33 / 2;
                    int var42 = -var35 / 2;
                    int var43 = var34 * var42 + -(var32 * var41) >> 16;
                    int var44 = var32 * var42 + var34 * var41 >> 16;
                    int var45 = class236.method1606(91, super.field2687 + var43, super.field2694 + var44, class265.field4703);
                    int var46 = var35 / 2;
                    int var47 = -var33 / 2;
                    int var48 = var32 * var46 - -(var34 * var47) >> 16;
                    int var49 = var34 * var46 - var32 * var47 >> 16;
                    int var50 = var33 / 2;
                    int var51 = class236.method1606(40, super.field2687 + var49, super.field2694 + var48, class265.field4703);
                    int var52 = var35 / 2;
                    int var53 = var32 * var52 - -(var34 * var50) >> 16;
                    int var54 = var34 * var52 + -(var32 * var50) >> 16;
                    int var55 = ~var51 < ~var40 ? var40 : var51;
                    int var56 = class236.method1606(127, super.field2687 + var54, super.field2694 + var53, class265.field4703);
                    int var57 = var40 + var56;
                    int var58 = var51 >= var56 ? var56 : var51;
                    int var59 = var45 <= var40 ? var45 : var40;
                    if (~(var45 + var51) > ~var57) {
                        var57 = var45 + var51;
                    }
                    var29 = 2047 & (int) (325.95D * Math.atan2((double) (var59 - var58), (double) var35));
                    if (var29 != 0) {
                        var15.method635(var29);
                    }
                    int var60 = ~var45 > ~var56 ? var45 : var56;
                    var31 = 2047 & (int) (Math.atan2((double) (-var60 + var55), (double) var33) * 325.95D);
                    if (var31 != 0) {
                        var15.method634(var31);
                    }
                    var30 = (var57 >> 1) - super.field2711;
                    if (var30 != 0) {
                        var15.method628(0, var30, 0);
                    }
                }
                class98 var61 = null;
                if (!this.field3488 && super.field2709 != -1 && ~super.field2656 != 0) {
                    class233 var62 = class255.method1728(super.field2709, (byte) 95);
                    var61 = var62.method1595(7208, super.field2656);
                    if (var61 != null) {
                        var61.method628(0, -super.field2674, 0);
                        if (var62.field4201) {
                            if (~var29 != -1) {
                                var61.method635(var29);
                            }
                            if (var31 != 0) {
                                var61.method634(var31);
                            }
                            if (var30 != 0) {
                                var61.method628(0, var30, 0);
                            }
                        }
                    }
                }
                class98 var63 = null;
                if (!this.field3488 && this.field3483 != null) {
                    if (this.field3490 <= class211.field3851) {
                        this.field3483 = null;
                    }
                    if (~class211.field3851 <= ~this.field3517 && class211.field3851 < this.field3490) {
                        var63 = this.field3483;
                        var63.method628(-super.field2694 + this.field3505, -super.field2711 + this.field3516, -super.field2687 + this.field3495);
                        if (~super.field2683 != -513) {
                            if (super.field2683 != 1024) {
                                if (super.field2683 == 1536) {
                                    var63.method629();
                                }
                            } else {
                                var63.method638();
                            }
                        } else {
                            var63.method644();
                        }
                    }
                }
                if (var61 != null) {
                    var15 = ((class222) var15).method1537(var61);
                }
                if (var63 != null) {
                    var15 = ((class222) var15).method1537(var63);
                }
                var15.field1822 = true;
                var15.method48(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field2692);
                if (var63 != null) {
                    if (~super.field2683 != -513) {
                        if (~super.field2683 == -1025) {
                            var63.method638();
                        } else if (~super.field2683 == -1537) {
                            var63.method644();
                        }
                    } else {
                        var63.method629();
                    }
                    var63.method628(-this.field3505 + super.field2694, super.field2711 - this.field3516, -this.field3495 + super.field2687);
                }
            }
        }
    }
}
