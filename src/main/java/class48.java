import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class48 extends class198 {

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
    private int field657 = 0;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "I")
    private int field662 = 1;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
    private int field658 = 0;

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!aj", name = "U", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!aj", name = "W", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "Lde;")
    public static class116 field667;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(B)V")
    public final void method142(byte arg0) {
        class217.method1516((byte) 79);
        int var2 = 0 % ((-46 - arg0) / 47);
        ++field666;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public static final void method298(int arg0, String arg1, byte arg2) {
        ++field659;
        ++class64.field954;
        class276.field4572.method1391(0, 224);
        class276.field4572.method1446((byte) 101, 1 + class187.method1270((byte) -100, arg1));
        if (arg2 <= 84) {
            field667 = null;
        }
        class276.field4572.method1446((byte) 95, arg0);
        class276.field4572.method1409(arg1, (byte) 77);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILbl;)V")
    public static final void method299(int arg0, class35 arg1) {
        if (arg0 <= 11) {
            method299(37, (class35) null);
        }
        ++field654;
        for (class145 var2 = (class145) class66.field976.method1959(205); var2 != null; var2 = (class145) class66.field976.method1956(81)) {
            if (var2.field2281 == arg1) {
                if (var2.field2290 != null) {
                    class71.field1024.method597(var2.field2290);
                    var2.field2290 = null;
                }
                var2.method900(88);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
    public class48() {
        super(0, true);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILjava/lang/String;Lkk;ZIILde;III)V")
    public static final void method300(int arg0, String arg1, class254 arg2, boolean arg3, int arg4, int arg5, class116 arg6, int arg7, int arg8, int arg9) {
        int var10;
        if (class92.field1402 != 4) {
            var10 = (int) class202.field3253 + class262.field4330 & 2047;
        } else {
            var10 = (int) class202.field3253 & 2047;
        }
        ++field656;
        int var11 = Math.max(arg2.field4085 / 2, arg2.field4152 / 2) - -10;
        if (!arg3) {
            method301((byte) -107);
        }
        int var12 = arg4 * arg4 - -(arg8 * arg8);
        if (~var12 >= ~(var11 * var11)) {
            int var13 = class172.field2669[var10];
            int var14 = class172.field2658[var10];
            if (~class92.field1402 != -5) {
                var14 = var14 * 256 / (class265.field4365 + 256);
                var13 = var13 * 256 / (class265.field4365 - -256);
            }
            int var15 = arg8 * var13 - -(arg4 * var14) >> 16;
            int var16 = arg6.method734(arg1, 100);
            int var17 = var15 - var16 / 2;
            int var18 = arg8 * var14 - arg4 * var13 >> 16;
            int var19 = arg6.method747(arg1, 100, 0);
            if (-arg2.field4085 <= var17 && ~var17 >= ~arg2.field4085 && ~var18 <= ~(-arg2.field4152) && var18 <= arg2.field4152) {
                class62.method402(arg2.field4193, arg2.field4092);
                arg6.method752(arg1, arg2.field4085 / 2 + var17 + arg9, arg2.field4152 / 2 + -var18 + -arg7 + -var19 + arg5, var16, 50, arg0, 0, 256, 1, 0, 0);
                class62.method401();
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(B)V")
    public static void method301(byte arg0) {
        if (arg0 == -60) {
            field667 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        ++field655;
        if (!arg0) {
            return null;
        } else {
            int[] var3 = super.field3134.method36(arg1, 30672);
            if (super.field3134.field69) {
                int var4 = class42.field591[arg1];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; var6 < class42.field590; ++var6) {
                    int var7 = class152.field2367[var6];
                    int var8 = var7 - 2048 >> 1;
                    int var11;
                    if (this.field658 != 0) {
                        int var9 = var8 * var8 - -(var5 * var5) >> 12;
                        int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                        var11 = (int) ((double) (this.field662 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (-var4 + var7) * this.field662;
                    }
                    int var12 = var11 - (-4096 & var11);
                    if (this.field657 != 0) {
                        if (this.field657 == 2) {
                            var12 -= 2048;
                            if (~var12 > -1) {
                                var12 = -var12;
                            }
                            var12 = 2048 - var12 << 1;
                        }
                    } else {
                        var12 = class67.field984[255 & var12 >> 4] - -4096 >> 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIII[BB[Lwi;IIZI)V")
    public static final void method302(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte arg5, class142[] arg6, int arg7, int arg8, boolean arg9, int arg10) {
        if (arg5 >= -90) {
            method300(-95, (String) null, (class254) null, false, -19, 71, (class116) null, 124, 91, 112);
        }
        class202 var11 = new class202(arg4);
        int var12 = -1;
        while (true) {
            int var13 = var11.method1458((byte) 126);
            if (~var13 == -1) {
                ++field660;
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1450(-65);
                if (~var15 == -1) {
                    break;
                }
                var14 += var15 + -1;
                int var16 = 63 & var14 >> 6;
                int var17 = var11.method1420((byte) 0);
                int var18 = var14 >> 12;
                int var19 = var17 >> 2;
                int var20 = 3 & var17;
                int var21 = 63 & var14;
                if (~arg1 == ~var18 && ~arg8 >= ~var16 && ~var16 > ~(arg8 + 8) && ~var21 <= ~arg10 && arg10 + 8 > var21) {
                    class74 var22 = class216.method1510(0, var12);
                    int var23 = arg7 - -class296.method2059(var22.field1151, arg3, var20, 114, var21 & 7, 7 & var16, var22.field1169);
                    int var24 = class297.method2063(var22.field1169, arg3, 7 & var21, var22.field1151, var16 & 7, var20, 1) + arg0;
                    if (var23 > 0 && var24 > 0 && ~var23 > -104 && ~var24 > -104) {
                        class142 var25 = null;
                        if (!arg9) {
                            int var26 = arg2;
                            if (~(class128.field1972[1][var23][var24] & 2) == -3) {
                                var26 = arg2 - 1;
                            }
                            if (~var26 <= -1) {
                                var25 = arg6[var26];
                            }
                        }
                        class51.method309(var12, var25, var24, 27371, var23, arg3 + var20 & 3, var19, arg2, arg9, !arg9, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -4) {
                    this.field662 = arg1.method1420((byte) 0);
                }
            } else {
                this.field657 = arg1.method1420((byte) 0);
            }
        } else {
            this.field658 = arg1.method1420((byte) 0);
        }
        int var5 = 96 / ((60 - arg0) / 61);
        ++field665;
    }
}
