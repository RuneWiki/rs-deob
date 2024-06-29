import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class217 extends class222 {

    @OriginalMember(owner = "client!pe", name = "jb", descriptor = "I")
    private int field3747 = -1;

    @OriginalMember(owner = "client!pe", name = "cb", descriptor = "I")
    public static int field3740 = 0;

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "Lsb;")
    public static class98 field3737 = class47.method368("(U5", 0);

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "Lsb;")
    private static class98 field3735 = class47.method368("Hidden", 0);

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "Lsb;")
    public static class98 field3734 = class47.method368("(U1", 0);

    @OriginalMember(owner = "client!pe", name = "hb", descriptor = "Lsb;")
    public static class98 field3745 = field3735;

    @OriginalMember(owner = "client!pe", name = "nb", descriptor = "[Lsb;")
    public static class98[] field3751 = new class98[500];

    @OriginalMember(owner = "client!pe", name = "kb", descriptor = "Lsb;")
    public static class98 field3748 = class47.method368("k", 0);

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "I")
    public int field3736;

    @OriginalMember(owner = "client!pe", name = "ab", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!pe", name = "bb", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!pe", name = "db", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!pe", name = "eb", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!pe", name = "fb", descriptor = "I")
    public int field3743;

    @OriginalMember(owner = "client!pe", name = "gb", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!pe", name = "ib", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!pe", name = "mb", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!pe", name = "lb", descriptor = "[I")
    public int[] field3749;

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class217() {
        super(0, false);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method1494(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3738;
        int var8 = 2047 & -arg5 + 2048;
        int var9 = 0;
        int var10 = -arg0 + 2048 & 2047;
        int var11 = 0;
        int var12 = arg7;
        if (~var8 != -1) {
            int var13 = class160.field2893[var8];
            var11 = -arg7 * var13 >> 16;
            int var14 = class160.field2890[var8];
            var12 = arg7 * var14 >> 16;
        }
        if (var10 != 0) {
            int var15 = class160.field2893[var10];
            int var16 = class160.field2890[var10];
            var9 = var12 * var15 >> 16;
            var12 = var12 * var16 >> 16;
        }
        class122.field2239 = -var11 + arg6;
        class20.field361 = -var12 + arg4;
        class81.field1430 = arg0;
        class6.field86 = -var9 + arg2;
        if (!arg3) {
            class224.field3864 = arg5;
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)I")
    public final int method1495(int arg0) {
        if (arg0 != -1) {
            field3751 = null;
        }
        ++field3750;
        return this.field3747;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lnd;III)V")
    public static final void method1496(class192 arg0, int arg1, int arg2, int arg3) {
        if (~(256 & arg1) != -1) {
            int var4 = class144.field2536.method1443(4);
            int var5 = class144.field2536.method1446(5350);
            arg0.method1761(var4, var5, class236.field4071, 0);
        }
        ++field3744;
        if ((arg1 & 128) != 0) {
            arg0.field4506 = class144.field2536.method1487(74);
            arg0.field4472 = class144.field2536.method1487(82);
        }
        if (~(8 & arg1) != -1) {
            int var6 = class144.field2536.method1441(2);
            int var7 = class144.field2536.method1446(5350);
            boolean var8 = (32768 & var6) != 0;
            int var9 = class144.field2536.method1443(4);
            int var10 = class144.field2536.field3728;
            if (arg0.field3323 != null && arg0.field3338 != null) {
                boolean var11 = false;
                long var12 = arg0.field3323.method727((byte) 36);
                if (var7 <= 1) {
                    if (!var8 && (~class190.field3286 == -2 || ~class105.field1878 == -2)) {
                        var11 = true;
                    } else {
                        for (int var14 = 0; ~class191.field3318 < ~var14; ++var14) {
                            if (class228.field3926[var14] == var12) {
                                var11 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var11 && ~class90.field1586 == -1) {
                    class205.field3503.field3728 = 0;
                    class144.field2536.method1481(var9, class205.field3503.field3706, 0, 255);
                    int var15 = -1;
                    class205.field3503.field3728 = 0;
                    class98 var16;
                    if (!var8) {
                        var16 = class73.method544(class236.method1613(-98, class205.field3503).method713(63));
                    } else {
                        class100 var17 = class230.method1590(class205.field3503, 57);
                        var15 = var17.field1763;
                        var6 &= 32767;
                        var16 = var17.field1755.method439(class205.field3503, (byte) -5);
                    }
                    arg0.field4526 = var16.method723(255);
                    arg0.field4505 = var6 >> 8;
                    arg0.field4455 = 255 & var6;
                    arg0.field4504 = 150;
                    if (var7 == 2) {
                        class15.method127(var15, 0, var16, !var8 ? 1 : 17, (class98) null, class186.method1288(new class98[] { class170.field3004, arg0.method1329(-513) }, 31618));
                    } else if (~var7 != -2) {
                        class15.method127(var15, 0, var16, var8 ? 17 : 2, (class98) null, arg0.method1329(-513));
                    } else {
                        class15.method127(var15, 0, var16, !var8 ? 1 : 17, (class98) null, class186.method1288(new class98[] { class136.field2398, arg0.method1329(-513) }, 31618));
                    }
                }
            }
            class144.field2536.field3728 = var10 - -var9;
        }
        if ((1 & arg1) != 0) {
            int var18 = class144.field2536.method1480(-126);
            byte[] var19 = new byte[var18];
            class216 var20 = new class216(var19);
            class144.field2536.method1452(var19, 0, var18, -1);
            class129.field2304[arg2] = var20;
            arg0.method1328(var20, (byte) -107);
        }
        if ((16 & arg1) != 0) {
            arg0.field4526 = class144.field2536.method1445(-3);
            if (arg0.field4526.method730(0, -26815) == 126) {
                arg0.field4526 = arg0.field4526.method740(1, true);
                class176.method1228(arg0.method1329(-513), arg0.field4526, (byte) -49, 2);
            } else if (class163.field2943 == arg0) {
                class176.method1228(arg0.method1329(-513), arg0.field4526, (byte) -49, 2);
            }
            arg0.field4455 = 0;
            arg0.field4504 = 150;
            arg0.field4505 = 0;
        }
        if ((64 & arg1) != 0) {
            arg0.field4464 = class144.field2536.method1487(34);
            if (arg0.field4464 == 65535) {
                arg0.field4464 = -1;
            }
        }
        if ((32 & arg1) != 0) {
            int var21 = class144.field2536.method1475((byte) -128);
            if (~var21 == -65536) {
                var21 = -1;
            }
            int var22 = class144.field2536.method1446(5350);
            class137.method1031(var21, 7, arg0, var22);
        }
        if (~(1024 & arg1) != -1) {
            arg0.field4481 = class144.field2536.method1443(4);
            arg0.field4500 = class144.field2536.method1471(4);
            arg0.field4473 = class144.field2536.method1480(-123);
            arg0.field4493 = class144.field2536.method1471(4);
            arg0.field4476 = class144.field2536.method1475((byte) -116) - -class236.field4071;
            arg0.field4515 = class144.field2536.method1441(2) - -class236.field4071;
            arg0.field4458 = class144.field2536.method1446(5350);
            arg0.field4482 = 0;
            arg0.field4496 = 1;
        }
        if (arg3 > 11) {
            if ((4 & arg1) != 0) {
                int var23 = class144.field2536.method1446(5350);
                int var24 = class144.field2536.method1443(4);
                arg0.method1761(var23, var24, class236.field4071, 0);
                arg0.field4499 = class236.field4071 + 300;
                arg0.field4484 = class144.field2536.method1443(4);
            }
            if (~(arg1 & 512) != -1) {
                arg0.field4461 = class144.field2536.method1475((byte) -115);
                int var25 = class144.field2536.method1466(0);
                arg0.field4519 = var25 >> 16;
                arg0.field4465 = (var25 & 65535) + class236.field4071;
                arg0.field4485 = 0;
                if (~arg0.field4465 < ~class236.field4071) {
                    arg0.field4485 = -1;
                }
                arg0.field4520 = 0;
                if (arg0.field4461 == 65535) {
                    arg0.field4461 = -1;
                }
                if (~arg0.field4461 != 0 && ~class236.field4071 == ~arg0.field4465) {
                    int var26 = class49.method385(arg0.field4461, 0).field3464;
                    if (~var26 != 0) {
                        class138 var27 = class16.method144(1, var26);
                        if (var27 != null && var27.field2454 != null) {
                            class114.method850(class163.field2943 == arg0, arg0.field4492, arg0.field4466, 0, var27, 4096);
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            this.field3747 = arg0.method1487(66);
        }
        if (arg1) {
            field3740 = -19;
        }
        ++field3739;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(II)[[I")
    public int[][] method4(int arg0, int arg1) {
        if (arg1 != 1) {
            this.method4(32, -6);
        }
        int[][] var3 = super.field3834.method627(4103, arg0);
        ++field3742;
        if (super.field3834.field1486 && this.method1499(-66)) {
            int[] var4 = var3[0];
            int var5 = this.field3736 * (~class20.field373 == ~this.field3743 ? arg0 : this.field3743 * arg0 / class20.field373);
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            if (class13.field253 != this.field3736) {
                for (int var8 = 0; var8 < class13.field253; ++var8) {
                    int var9 = this.field3736 * var8 / class13.field253;
                    int var10 = this.field3749[var5 + var9];
                    var6[var8] = class214.method1427(4080, var10 << 4);
                    var7[var8] = class214.method1427(65280, var10) >> 4;
                    var4[var8] = class214.method1427(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~class13.field253 < ~var11; ++var11) {
                    int var12 = this.field3749[var5++];
                    var6[var11] = class214.method1427(4080, var12 << 4);
                    var7[var11] = class214.method1427(4080, var12 >> 4);
                    var4[var11] = class214.method1427(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public final void method1497(int arg0) {
        ++field3746;
        super.method1497(arg0);
        this.field3749 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)Z")
    public final boolean method1499(int arg0) {
        ++field3741;
        if (this.field3749 != null) {
            return true;
        } else {
            if (arg0 > -25) {
                field3734 = null;
            }
            if (~this.field3747 <= -1) {
                class247 var2 = class188.method1293(this.field3747, (byte) -54, class210.field3597);
                var2.method1716();
                this.field3743 = var2.field1444;
                this.field3749 = var2.field4338;
                this.field3736 = var2.field1454;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
    public static void method1500(boolean arg0) {
        field3735 = null;
        field3748 = null;
        field3734 = null;
        field3745 = null;
        field3737 = null;
        field3751 = null;
        if (arg0) {
            field3734 = null;
        }
    }
}
