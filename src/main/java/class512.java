import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class512 extends class404 {

    @OriginalMember(owner = "client!mp", name = "B", descriptor = "I")
    private int field7756 = -1;

    @OriginalMember(owner = "client!mp", name = "N", descriptor = "Lsk;")
    public static class423 field7767 = new class423("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!mp", name = "z", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!mp", name = "A", descriptor = "I")
    public static int field7755;

    @OriginalMember(owner = "client!mp", name = "C", descriptor = "I")
    public static int field7757;

    @OriginalMember(owner = "client!mp", name = "E", descriptor = "I")
    public static int field7758;

    @OriginalMember(owner = "client!mp", name = "F", descriptor = "I")
    public static int field7759;

    @OriginalMember(owner = "client!mp", name = "G", descriptor = "I")
    private int field7760;

    @OriginalMember(owner = "client!mp", name = "H", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!mp", name = "I", descriptor = "I")
    private int field7762;

    @OriginalMember(owner = "client!mp", name = "J", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!mp", name = "K", descriptor = "Lpm;")
    public static class396 field7764;

    @OriginalMember(owner = "client!mp", name = "L", descriptor = "[I")
    private int[] field7765;

    @OriginalMember(owner = "client!mp", name = "M", descriptor = "[Lig;")
    public static class154[] field7766;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILha;I)V")
    public final void method87(int arg0, class40 arg1, int arg2) {
        ++field7757;
        if (arg0 != 0) {
            this.field7762 = 64;
        }
        if (~arg2 == -1) {
            this.field7756 = arg1.method254((byte) -73);
        }
    }

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "(I)Lfb;")
    public static final class457 method3061(int arg0) {
        ++field7754;
        try {
            if (arg0 != 31046) {
                field7764 = null;
            }
            return (class457) Class.forName("pe").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BII)V")
    public final void method2395(byte arg0, int arg1, int arg2) {
        ++field7761;
        super.method2395((byte) 0, arg1, arg2);
        int var4 = -88 / ((74 - arg0) / 45);
        if (this.field7756 >= 0 && class490.field7452 != null) {
            int var5 = !class490.field7452.method59(this.field7756, 21645).field735 ? 128 : 64;
            this.field7765 = class490.field7452.method60(var5, false, this.field7756, 1.0F, 118, var5);
            this.field7760 = var5;
            this.field7762 = var5;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I[[[Loh;IIIZ)Z")
    public static final boolean method3062(int arg0, class268[][][] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7759;
        if (arg0 != 1702040368) {
            field7767 = null;
        }
        byte var6 = arg5 ? 1 : (byte) (class338.field5055 & 255);
        if (class64.field1061[class362.field5339][arg4][arg2] == var6) {
            return false;
        } else if ((4 & class146.field2369[class362.field5339][arg4][arg2]) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class388.field5615[var7] = arg4;
            int var8 = 0;
            int var35 = var7 + 1;
            class412.field5974[var7] = arg2;
            class64.field1061[class362.field5339][arg4][arg2] = var6;
            while (~var35 != ~var8) {
                int var9 = class388.field5615[var8] & 65535;
                int var10 = 255 & class388.field5615[var8] >> 16;
                int var11 = class388.field5615[var8] >> 24 & 255;
                int var12 = 65535 & class412.field5974[var8];
                int var13 = (class412.field5974[var8] & 16730185) >> 16;
                var8 = 4095 & var8 + 1;
                boolean var14 = false;
                if ((class146.field2369[class362.field5339][var9][var12] & 4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class362.field5339 - -1; ~var16 >= -4; ++var16) {
                    if (~(8 & class146.field2369[var16][var9][var12]) == -1) {
                        if (var14 && arg1[var16][var9][var12] != null) {
                            if (arg1[var16][var9][var12].field4059 != null) {
                                int var20 = class254.method1529((byte) 93, var10);
                                if (~arg1[var16][var9][var12].field4059.field6979 == ~var20 || arg1[var16][var9][var12].field4063 != null && ~arg1[var16][var9][var12].field4063.field6979 == ~var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class254.method1529((byte) -96, var11);
                                    if (arg1[var16][var9][var12].field4059.field6979 == var21 || arg1[var16][var9][var12].field4063 != null && arg1[var16][var9][var12].field4063.field6979 == var21) {
                                        continue;
                                    }
                                }
                                if (~var13 != -1) {
                                    int var22 = class254.method1529((byte) -36, var13);
                                    if (arg1[var16][var9][var12].field4059.field6979 == var22 || arg1[var16][var9][var12].field4063 != null && ~arg1[var16][var9][var12].field4063.field6979 == ~var22) {
                                        continue;
                                    }
                                }
                            }
                            class268 var23 = arg1[var16][var9][var12];
                            if (var23.field4045 != null) {
                                for (class297 var24 = var23.field4045; var24 != null; var24 = var24.field4500) {
                                    class205 var25 = var24.field4505;
                                    if (var25 instanceof class185) {
                                        class185 var26 = (class185) var25;
                                        int var27 = var26.method170(true);
                                        if (~var27 == -22) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method173(1438);
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || ~var11 != -1 && var11 == var29 || var13 != 0 && ~var13 == ~var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class268 var30 = arg1[var16][var9][var12];
                        if (var30 != null && var30.field4045 != null) {
                            for (class297 var31 = var30.field4045; var31 != null; var31 = var31.field4500) {
                                class205 var32 = var31.field4505;
                                if (~var32.field3227 != ~var32.field3225 || ~var32.field3220 != ~var32.field3219) {
                                    for (int var33 = var32.field3225; var32.field3227 >= var33; ++var33) {
                                        for (int var34 = var32.field3219; var34 <= var32.field3220; ++var34) {
                                            class64.field1061[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class64.field1061[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class99.field1801[class362.field5339 + 1].method318(var9, var12);
                    if (~var17 < ~class252.field3852[arg3]) {
                        class252.field3852[arg3] = var17;
                    }
                    int var18 = var9 << 7;
                    if (~class248.field3802[arg3] < ~var18) {
                        class248.field3802[arg3] = var18;
                    } else if (var18 > class197.field3100[arg3]) {
                        class197.field3100[arg3] = var18;
                    }
                    int var19 = var12 << 7;
                    if (class158.field2493[arg3] <= var19) {
                        if (~var19 < ~class96.field1707[arg3]) {
                            class96.field1707[arg3] = var19;
                        }
                    } else {
                        class158.field2493[arg3] = var19;
                    }
                }
                if (!var14) {
                    if (~var9 <= -2 && ~class64.field1061[class362.field5339][var9 + -1][var12] != ~var6) {
                        class388.field5615[var35] = class318.method1973(-754974720, class318.method1973(var9 + -1, 1179648));
                        class412.field5974[var35] = class318.method1973(var12, 1245184);
                        var35 = var35 + 1 & 4095;
                        class64.field1061[class362.field5339][var9 + -1][var12] = var6;
                    }
                    ++var12;
                    if (var12 < class21.field272) {
                        if (~(var9 + -1) <= -1 && ~class64.field1061[class362.field5339][var9 + -1][var12] != ~var6 && ~(class146.field2369[class362.field5339][var9][var12] & 4) == -1 && ~(class146.field2369[class362.field5339][var9 - 1][var12 + -1] & 4) == -1) {
                            class388.field5615[var35] = class318.method1973(class318.method1973(var9 + -1, 1179648), 1375731712);
                            class412.field5974[var35] = class318.method1973(1245184, var12);
                            class64.field1061[class362.field5339][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 4095;
                        }
                        if (class64.field1061[class362.field5339][var9][var12] != var6) {
                            class388.field5615[var35] = class318.method1973(class318.method1973(var9, 5373952), 318767104);
                            class412.field5974[var35] = class318.method1973(var12, 5439488);
                            var35 = 4095 & var35 + 1;
                            class64.field1061[class362.field5339][var9][var12] = var6;
                        }
                        if (var9 + 1 < class150.field2422 && ~class64.field1061[class362.field5339][var9 - -1][var12] != ~var6 && (4 & class146.field2369[class362.field5339][var9][var12]) == 0 && ~(4 & class146.field2369[class362.field5339][var9 - -1][var12 + -1]) == -1) {
                            class388.field5615[var35] = class318.method1973(class318.method1973(var9 - -1, 5373952), -1845493760);
                            class412.field5974[var35] = class318.method1973(var12, 5439488);
                            var35 = 4095 & var35 - -1;
                            class64.field1061[class362.field5339][var9 + 1][var12] = var6;
                        }
                    }
                    --var12;
                    if (var9 + 1 < class150.field2422 && ~class64.field1061[class362.field5339][var9 - -1][var12] != ~var6) {
                        class388.field5615[var35] = class318.method1973(1392508928, class318.method1973(9568256, var9 + 1));
                        class412.field5974[var35] = class318.method1973(var12, 9633792);
                        var35 = var35 + 1 & 4095;
                        class64.field1061[class362.field5339][var9 - -1][var12] = var6;
                    }
                    --var12;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class64.field1061[class362.field5339][var9 + -1][var12] != var6 && ~(class146.field2369[class362.field5339][var9][var12] & 4) == -1 && ~(4 & class146.field2369[class362.field5339][var9 + -1][var12 + 1]) == -1) {
                            class388.field5615[var35] = class318.method1973(301989888, class318.method1973(13762560, var9 - 1));
                            class412.field5974[var35] = class318.method1973(13828096, var12);
                            var35 = var35 + 1 & 4095;
                            class64.field1061[class362.field5339][var9 + -1][var12] = var6;
                        }
                        if (~class64.field1061[class362.field5339][var9][var12] != ~var6) {
                            class388.field5615[var35] = class318.method1973(-1828716544, class318.method1973(13762560, var9));
                            class412.field5974[var35] = class318.method1973(13828096, var12);
                            class64.field1061[class362.field5339][var9][var12] = var6;
                            var35 = var35 + 1 & 4095;
                        }
                        if (~(var9 + 1) > ~class150.field2422 && ~class64.field1061[class362.field5339][var9 - -1][var12] != ~var6 && (4 & class146.field2369[class362.field5339][var9][var12]) == 0 && (class146.field2369[class362.field5339][var9 - -1][var12 - -1] & 4) == 0) {
                            class388.field5615[var35] = class318.method1973(-771751936, class318.method1973(var9 + 1, 9568256));
                            class412.field5974[var35] = class318.method1973(9633792, var12);
                            class64.field1061[class362.field5339][var9 + 1][var12] = var6;
                            var35 = var35 - -1 & 4095;
                        }
                    }
                }
            }
            if (class252.field3852[arg3] != -1000000) {
                class252.field3852[arg3] += 10;
                class248.field3802[arg3] -= 50;
                class197.field3100[arg3] += 50;
                class96.field1707[arg3] += 50;
                class158.field2493[arg3] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
    public static void method3063(byte arg0) {
        int var1 = -89 % ((-36 - arg0) / 49);
        field7767 = null;
        field7766 = null;
        field7764 = null;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(II)[[I")
    public final int[][] method89(int arg0, int arg1) {
        ++field7758;
        int[][] var3 = super.field5869.method2819(arg1, 1);
        if (arg0 != -1) {
            return null;
        } else {
            if (super.field5869.field7156) {
                int var4 = (~class437.field6437 == ~this.field7762 ? arg1 : this.field7762 * arg1 / class437.field6437) * this.field7760;
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (~class431.field6348 != ~this.field7760) {
                    for (int var8 = 0; var8 < class431.field6348; ++var8) {
                        int var9 = this.field7760 * var8 / class431.field6348;
                        int var10 = this.field7765[var4 + var9];
                        var7[var8] = class330.method2050(var10 << 4, 4080);
                        var6[var8] = class330.method2050(var10, 65280) >> 4;
                        var5[var8] = class330.method2050(16711680, var10) >> 12;
                    }
                } else {
                    for (int var11 = 0; ~var11 > ~class431.field6348; ++var11) {
                        int var12 = this.field7765[var4++];
                        var7[var11] = class330.method2050(var12, 255) << 4;
                        var6[var11] = class330.method2050(65280, var12) >> 4;
                        var5[var11] = class330.method2050(var12, 16711680) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "(I)I")
    public final int method2398(int arg0) {
        if (arg0 != 0) {
            field7764 = null;
        }
        ++field7755;
        return this.field7756;
    }

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "(I)V")
    public final void method2397(int arg0) {
        ++field7763;
        super.method2397(38);
        this.field7765 = null;
        if (arg0 < 13) {
            this.field7756 = 17;
        }
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V")
    public class512() {
        super(0, false);
    }
}
