import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class258 extends class177 implements class232 {

    @OriginalMember(owner = "client!es", name = "J", descriptor = "Lws;")
    public class238 field3718;

    @OriginalMember(owner = "client!es", name = "L", descriptor = "Z")
    private boolean field3720;

    @OriginalMember(owner = "client!es", name = "N", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!es", name = "R", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!es", name = "z", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!es", name = "A", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!es", name = "B", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!es", name = "C", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!es", name = "D", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!es", name = "E", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!es", name = "F", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!es", name = "G", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!es", name = "H", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!es", name = "I", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!es", name = "K", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!es", name = "M", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!es", name = "O", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!es", name = "Q", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!es", name = "S", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!es", name = "P", descriptor = "[I")
    public static int[] field3724;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(Lqa;I)V")
    public final void method373(class162 arg0, int arg1) {
        if (arg1 == -2304) {
            ++field3711;
            this.field3718.method1542(arg0, true);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method122(int arg0, int arg1, int arg2, class162 arg3) {
        ++field3727;
        class121 var5 = this.field3718.method1549(super.field2683, 112, super.field2688, false, arg3, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg1 != -1) {
                this.field3718 = null;
            }
            class413 var6 = arg3.method439();
            var6.method1008(super.field2688 + super.field2686, super.field2691, super.field2683 + super.field2679);
            return var5.method909(arg2, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(Lqa;I)V")
    public final void method126(class162 arg0, int arg1) {
        ++field3709;
        class121 var3 = this.field3718.method1549(super.field2683, 114, super.field2688, false, arg0, 262144, true);
        if (var3 != null) {
            int var4 = super.field2688 >> 7;
            int var5 = super.field2683 >> 7;
            this.field3718.method1551(var4, var5, var5, var3, false, var4, arg0, (byte) -105);
        }
        if (arg1 > -43) {
            this.field3720 = true;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)Z")
    public final boolean method377(int arg0) {
        if (arg0 >= -27) {
            return true;
        } else {
            ++field3710;
            return this.field3718.method1545(-21741);
        }
    }

    @OriginalMember(owner = "client!es", name = "j", descriptor = "(I)V")
    public static void method1631(int arg0) {
        if (arg0 != -771161753) {
            method1633(58, 26, 71);
        }
        field3724 = null;
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(Z)I")
    public final int method1264(boolean arg0) {
        if (arg0) {
            this.field3718 = null;
        }
        ++field3712;
        return this.field3718.method1546(-26616);
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(I)V")
    public final void method376(int arg0) {
        if (arg0 != 16931) {
            this.method374((class162) null, -33);
        }
        ++field3715;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IILju;IBI)V")
    public static final void method1632(int arg0, int arg1, class81 arg2, int arg3, byte arg4, int arg5) {
        ++field3721;
        if (arg2.field1341 != -1 || arg2.field1338 != null) {
            int var6 = 0;
            int var7 = class397.field5830.field135 * arg2.field1344 >> 8;
            if (~arg2.field1336 <= ~arg1) {
                if (arg2.field1332 > arg1) {
                    var6 += -arg1 + arg2.field1332;
                }
            } else {
                var6 += -arg2.field1336 + arg1;
            }
            if (arg2.field1346 >= arg0) {
                if (arg0 < arg2.field1342) {
                    var6 += -arg0 + arg2.field1342;
                }
            } else {
                var6 += -arg2.field1346 + arg0;
            }
            if (~arg2.field1333 != -1 && arg2.field1333 >= var6 - 64 && class397.field5830.field135 != 0 && ~arg2.field1340 == ~arg3) {
                if (arg4 != 110) {
                    field3726 = -24;
                }
                var6 -= 64;
                if (~var6 > -1) {
                    var6 = 0;
                }
                int var8 = (arg2.field1333 - var6) * var7 / arg2.field1333;
                if (arg2.field1337 != null) {
                    arg2.field1337.method2177(var8);
                } else if (~arg2.field1341 <= -1) {
                    class71 var9 = class71.method603(class250.field3600, arg2.field1341, 0);
                    if (var9 != null) {
                        class199 var10 = var9.method602().method1362(class508.field7428);
                        class330 var11 = class330.method2186(var10, 100, var8);
                        var11.method2154(-1);
                        class124.field1920.method230(var11);
                        arg2.field1337 = var11;
                    }
                }
                if (arg2.field1329 == null) {
                    if (arg2.field1338 != null && ~(arg2.field1348 -= arg5) >= -1) {
                        int var12 = (int) (Math.random() * (double) arg2.field1338.length);
                        class71 var13 = class71.method603(class250.field3600, arg2.field1338[var12], 0);
                        if (var13 != null) {
                            class199 var14 = var13.method602().method1362(class508.field7428);
                            class330 var15 = class330.method2186(var14, 100, var8);
                            var15.method2154(0);
                            class124.field1920.method230(var15);
                            arg2.field1329 = var15;
                            arg2.field1348 = arg2.field1330 - -((int) ((double) (-arg2.field1330 + arg2.field1352) * Math.random()));
                            return;
                        }
                    }
                } else {
                    arg2.field1329.method2177(var8);
                    if (arg2.field1329.method2664(53)) {
                        return;
                    }
                    arg2.field1329 = null;
                }
            } else {
                if (arg2.field1337 != null) {
                    class124.field1920.method232(arg2.field1337);
                    arg2.field1337 = null;
                }
                if (arg2.field1329 != null) {
                    class124.field1920.method232(arg2.field1329);
                    arg2.field1329 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I)I")
    public final int method375(int arg0) {
        ++field3719;
        if (arg0 != -13015) {
            field3722 = -75;
        }
        return this.field3718.field3467;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lqa;I)V")
    public final void method374(class162 arg0, int arg1) {
        if (arg1 == 28339) {
            this.field3718.method1544(0, arg0);
            ++field3714;
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lqa;Lbo;IIIIIZIIIIII)V")
    public class258(class162 arg0, class510 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class343.method2235(arg12, 4, arg11));
        this.field3718 = new class238(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field3720 = ~arg1.field7491 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)I")
    public final int method379(byte arg0) {
        if (arg0 != -96) {
            this.method373((class162) null, 69);
        }
        ++field3708;
        return this.field3718.field3469;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(III)Z")
    public static final boolean method1633(int arg0, int arg1, int arg2) {
        ++field3716;
        if (!class314.field4487) {
            return false;
        } else {
            int var3 = arg2 >> 16;
            int var4 = arg2 & 65535;
            if (class416.field6157[var3] != null && class416.field6157[var3][var4] != null) {
                class58 var5 = class416.field6157[var3][var4];
                int var6 = 89 % ((arg1 - -50) / 33);
                if (~arg0 == 0 && ~var5.field843 == -1) {
                    for (class231 var7 = (class231) class246.field3563.method2257((byte) 110); var7 != null; var7 = (class231) class246.field3563.method2256(121)) {
                        if (~var7.field3368 == -31 || ~var7.field3368 == -1003 || var7.field3368 == 46 || var7.field3368 == 15 || var7.field3368 == 47) {
                            for (class58 var8 = class421.method2578(-4179, var7.field3367); var8 != null; var8 = class290.method1805(var8, (byte) 71)) {
                                if (var5.field955 == var8.field955) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    for (class231 var9 = (class231) class246.field3563.method2257((byte) 115); var9 != null; var9 = (class231) class246.field3563.method2256(-52)) {
                        if (var9.field3372 == arg0 && var5.field955 == var9.field3367 && (var9.field3368 == 30 || ~var9.field3368 == -1003 || ~var9.field3368 == -47 || var9.field3368 == 15 || var9.field3368 == 47)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ILqa;)Lbw;")
    public final class482 method114(int arg0, class162 arg1) {
        ++field3717;
        class121 var3 = this.field3718.method1549(super.field2683, 119, super.field2688, false, arg1, 2048, true);
        if (var3 == null) {
            return null;
        } else {
            class413 var4 = arg1.method439();
            if (arg0 != -6796) {
                return null;
            } else {
                var4.method1008(super.field2688 - -super.field2686, super.field2691, super.field2683 + super.field2679);
                class482 var5 = null;
                if (this.field3720) {
                    var5 = class410.method2537((byte) -90, 1);
                }
                if (this.field3718.field3455 == null) {
                    var3.method910(var4, var5 != null ? var5.field7079[0] : null, 0);
                } else {
                    class492 var6 = this.field3718.field3455.method1519();
                    arg1.method531(var3, var6, var4, var5 != null ? var5.field7079[0] : null, 0);
                }
                int var7 = super.field2688 >> 7;
                int var8 = super.field2683 >> 7;
                this.field3718.method1551(var7, var8, var8, var3, true, var7, arg1, (byte) -105);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V")
    public static final void method1634(int arg0, int arg1) {
        ++field3725;
        class434 var2 = class483.method2888(arg1, 114, 12);
        if (arg0 == 5797) {
            var2.method2628(45);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)I")
    public final int method380(boolean arg0) {
        if (!arg0) {
            this.field3718 = null;
        }
        ++field3713;
        return this.field3718.field3443;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IILqa;)Lc;")
    public final class121 method381(int arg0, int arg1, class162 arg2) {
        ++field3723;
        return arg0 != 1584 ? null : this.field3718.method1549(0, arg0 + -1468, 0, false, arg2, arg1, false);
    }

    static {
        new class180("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field3722 = 0;
        field3726 = -1;
    }
}
