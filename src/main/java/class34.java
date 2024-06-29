import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class34 extends class89 {

    @OriginalMember(owner = "client!w", name = "V", descriptor = "Lha;")
    public static class46 field625 = class271.method1828(")1", -46);

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "Lha;")
    private static class46 field628 = class271.method1828("Connected to update server", -46);

    @OriginalMember(owner = "client!w", name = "T", descriptor = "Lha;")
    public static class46 field623 = field628;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!w", name = "S", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!w", name = "U", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!w", name = "W", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!w", name = "X", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!w", name = "ab", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!w", name = "bb", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!w", name = "cb", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!w", name = "Z", descriptor = "[Lgb;")
    private class60[] field629;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        if (arg1 != 25) {
            this.method219(-7, (int[][]) null);
        }
        int[][] var3 = super.field1695.method843((byte) -25, arg0);
        ++field624;
        if (super.field1695.field2028) {
            int var4 = class241.field4284;
            int var5 = class113.field2149;
            int[][][] var6 = super.field1695.method844(0);
            int[][] var7 = new int[var5][var4];
            this.method219(0, var7);
            for (int var8 = 0; class113.field2149 > var8; ++var8) {
                int[] var9 = var7[var8];
                int[][] var10 = var6[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class241.field4284; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class50.method369(255, var15) << 4;
                    var12[var14] = class50.method369(var15 >> 4, 4080);
                    var11[var14] = class50.method369(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        ++field621;
        if (arg1 == -641641492) {
            if (arg2 == 0) {
                this.field629 = new class60[arg0.method558(arg1 ^ -641641491)];
                for (int var4 = 0; var4 < this.field629.length; ++var4) {
                    int var5 = arg0.method558(1);
                    if (var5 != 0) {
                        if (var5 != 1) {
                            if (var5 != 2) {
                                if (~var5 == -4) {
                                    this.field629[var4] = class157.method1159(arg0, arg1 + 641641494);
                                }
                            } else {
                                this.field629[var4] = class273.method1842(arg0, (byte) -67);
                            }
                        } else {
                            this.field629[var4] = class83.method660(arg0, 0);
                        }
                    } else {
                        this.field629[var4] = class54.method385(arg0, false);
                    }
                }
            } else if (arg2 == 1) {
                super.field1683 = arg0.method558(1) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ltc;ZIII)V")
    public static final void method217(class236 arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field632;
        if (!arg1) {
            field628 = null;
        }
        for (class269 var5 = (class269) class154.field2719.method264(-31); var5 != null; var5 = (class269) class154.field2719.method269((byte) 7)) {
            if (~var5.field4666 == ~arg2 && arg4 * 128 == var5.field4670 && ~(arg3 * 128) == ~var5.field4675 && var5.field4652.field4146 == arg0.field4146) {
                if (var5.field4671 != null) {
                    class236.field4116.method1711(var5.field4671);
                    var5.field4671 = null;
                }
                if (var5.field4668 != null) {
                    class236.field4116.method1711(var5.field4668);
                    var5.field4668 = null;
                }
                var5.method501(0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
    public static void method218(int arg0) {
        field625 = null;
        field623 = null;
        if (arg0 < 120) {
            field625 = null;
        }
        field628 = null;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
    public class34() {
        super(0, true);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        ++field630;
        int[] var3 = super.field1688.method936(1, arg0);
        if (super.field1688.field2200) {
            this.method219(0, super.field1688.method934(26428));
        }
        int var4 = -99 / ((51 - arg1) / 44);
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I[[I)V")
    private final void method219(int arg0, int[][] arg1) {
        int var3 = class241.field4284;
        int var4 = class113.field2149;
        ++field622;
        class92.method718(arg1, true);
        class260.method1740(class115.field2177, 0, arg0, (byte) 63, class231.field4015);
        if (this.field629 != null) {
            for (int var5 = 0; var5 < this.field629.length; ++var5) {
                class60 var6 = this.field629[var5];
                int var7 = var6.field1005;
                int var8 = var6.field1009;
                if (~var7 > -1) {
                    if (var8 >= 0) {
                        var6.method410(var3, var4, -15);
                    }
                } else if (~var8 > -1) {
                    var6.method405(true, var3, var4);
                } else {
                    var6.method412((byte) 109, var4, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IBI)V")
    public static final void method220(int arg0, byte arg1, int arg2) {
        ++field626;
        class273 var3 = class269.method1801(100, arg0);
        int var4 = var3.field4770;
        int var5 = var3.field4778;
        int var6 = var3.field4771;
        if (arg1 != 94) {
            field628 = null;
        }
        int var7 = class235.field4083[-var4 + var6];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var4;
        class161.method1174(true, var5, class234.field4064[var5] & ~var8 | var8 & arg2 << var4);
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
    public static final void method221(int arg0) {
        ++field631;
        if (!class222.field3910) {
            class242.field4290 = 1;
            class215.field3807[0] = 1004;
            class275.field4795[0] = class3.field48;
            class162.field2855[0] = class85.field1613;
            if (class20.field267 != 0) {
                class250.field4420 = class53.field916;
                class197.field3517 = class124.field2291;
            } else if (~class71.field1270 != -1) {
                class250.field4420 = class143.field2607;
                class197.field3517 = class100.field1850;
            } else {
                class197.field3517 = class7.field116;
                class250.field4420 = class208.field3735;
            }
        }
        if (~class114.field2157 != 0) {
            class181.method1296(class114.field2157, -1);
        }
        for (int var1 = arg0; ~var1 > ~class193.field3473; ++var1) {
            if (class31.field592[var1]) {
                class52.field905[var1] = true;
            }
            class119.field2243[var1] = class31.field592[var1];
            class31.field592[var1] = false;
        }
        class205.field3680 = -1;
        class206.field3695 = class157.field2803;
        class145.field2627 = -1;
        class169.field3015 = null;
        if (~class114.field2157 != 0) {
            class193.field3473 = 0;
            class134.method1031(false, 0, class114.field2157, 0, 0, 0, -1, class163.field2895, class50.field876);
        }
        class262.method1757();
        class178.method1272(false);
        if (!class222.field3910) {
            if (~class145.field2627 != 0) {
                class157.method1157(class205.field3680, class145.field2627, (byte) 102);
            }
        } else {
            class143.method1074(-36);
        }
        if (~class158.field2812 == -4) {
            for (int var2 = 0; class193.field3473 > var2; ++var2) {
                if (!class119.field2243[var2]) {
                    if (class52.field905[var2]) {
                        class262.method1766(class175.field3156[var2], class51.field894[var2], class186.field3336[var2], class98.field1816[var2], 16711680, 128);
                    }
                } else {
                    class262.method1766(class175.field3156[var2], class51.field894[var2], class186.field3336[var2], class98.field1816[var2], 16711935, 128);
                }
            }
        }
        class197.method1409(class237.field4202, 3, class135.field2450, class277.field4824.field2585, class277.field4824.field2546);
        class237.field4202 = 0;
    }
}
