import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class143 extends class157 {

    @OriginalMember(owner = "client!ud", name = "Ub", descriptor = "Lic;")
    public static class59 field3139 = null;

    @OriginalMember(owner = "client!ud", name = "Kb", descriptor = "[Lie;")
    public static class61[] field3129 = new class61[16];

    @OriginalMember(owner = "client!ud", name = "bc", descriptor = "Lic;")
    public static class59 field3146 = class59.method433(0, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!ud", name = "Ob", descriptor = "I")
    public static int field3133 = 3353893;

    @OriginalMember(owner = "client!ud", name = "fc", descriptor = "Lic;")
    public static class59 field3150 = class59.method433(0, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!ud", name = "kc", descriptor = "Lic;")
    public static class59 field3155 = class59.method433(0, ":trade:");

    @OriginalMember(owner = "client!ud", name = "ic", descriptor = "Lic;")
    private static class59 field3153 = class59.method433(0, "Login");

    @OriginalMember(owner = "client!ud", name = "mc", descriptor = "Lic;")
    public static class59 field3157 = class59.method433(0, "Stufe)2");

    @OriginalMember(owner = "client!ud", name = "Vb", descriptor = "Lic;")
    public static class59 field3140 = field3153;

    @OriginalMember(owner = "client!ud", name = "Lb", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!ud", name = "Mb", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!ud", name = "Nb", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!ud", name = "Pb", descriptor = "I")
    private int field3134;

    @OriginalMember(owner = "client!ud", name = "Qb", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!ud", name = "Rb", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!ud", name = "Sb", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!ud", name = "Tb", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!ud", name = "Xb", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!ud", name = "Yb", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!ud", name = "Zb", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!ud", name = "ac", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!ud", name = "cc", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!ud", name = "dc", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!ud", name = "gc", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!ud", name = "hc", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!ud", name = "jc", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!ud", name = "lc", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!ud", name = "Wb", descriptor = "Ldd;")
    public static class26 field3141;

    @OriginalMember(owner = "client!ud", name = "ec", descriptor = "Lle;")
    private class81 field3149;

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(I)V")
    public class143(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(BI)Lsb;")
    public static final class127 method1061(byte arg0, int arg1) {
        ++field3144;
        class127 var2 = (class127) class17.field335.method675((long) arg1, 26431);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class108.field2614.method193(false, arg1, 14);
            if (arg0 >= -84) {
                method1075(31, 62);
            }
            class127 var4 = new class127();
            if (var3 != null) {
                var4.method971(12846, new class157(var3));
            }
            class17.field335.method672(-30464, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(Z)V")
    public final void method1062(boolean arg0) {
        if (!arg0) {
            ++field3137;
            this.field3134 = super.field3457 * 8;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIZ)V")
    public static final void method1063(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method1063(64, 14, true);
        }
        ++field3130;
        if (~class49.field1242 != -1 && arg0 != -1) {
            class94.method781(0, class49.field1242, false, -117, class84.field2083, arg0);
            class63.field1625 = true;
        }
    }

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "(II)I")
    public final int method1064(int arg0, int arg1) {
        ++field3143;
        if (arg1 != -7284) {
            return -121;
        } else {
            int var3 = 8 - (this.field3134 & 7);
            int var4 = this.field3134 >> 3;
            int var5 = 0;
            this.field3134 += arg0;
            while (arg0 > var3) {
                var5 += (super.field3473[var4++] & class86.field2177[var3]) << -var3 + arg0;
                arg0 -= var3;
                var3 = 8;
            }
            int var6;
            if (arg0 != var3) {
                var6 = (super.field3473[var4] >> -arg0 + var3 & class86.field2177[arg0]) + var5;
            } else {
                var6 = (class86.field2177[var3] & super.field3473[var4]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Z")
    public static final boolean method1065(int arg0, int arg1, int arg2) {
        ++field3136;
        if (arg2 != -2206) {
            field3155 = null;
        }
        return (arg0 >> arg1 - -1 & 1) != 0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[BIIBI[Lkd;III)V")
    public static final void method1066(int arg0, byte[] arg1, int arg2, int arg3, byte arg4, int arg5, class73[] arg6, int arg7, int arg8, int arg9) {
        ++field3142;
        for (int var10 = 0; ~var10 > -9; ++var10) {
            for (int var16 = 0; ~var16 > -9; ++var16) {
                if (~(arg5 + var10) < -1 && ~(arg5 + var10) > -104 && ~(arg9 + var16) < -1 && arg9 + var16 < 103) {
                    arg6[arg0].field1829[arg5 + var10][arg9 - -var16] = class24.method156(arg6[arg0].field1829[arg5 + var10][arg9 - -var16], -16777217);
                }
            }
        }
        class157 var11 = new class157(arg1);
        int var12 = 0;
        int var13 = -30 % ((50 - arg4) / 55);
        while (~var12 > -5) {
            for (int var14 = 0; var14 < 64; ++var14) {
                for (int var15 = 0; var15 < 64; ++var15) {
                    if (~arg7 == ~var12 && ~var14 <= ~arg3 && arg3 - -8 > var14 && ~var15 <= ~arg8 && var15 < arg8 - -8) {
                        class149.method1105(var11, arg0, arg9 - -class54.method405(7 & var15, arg2, (byte) 58, 7 & var14), 0, 0, class41.method314(99, arg2, 7 & var14, 7 & var15) + arg5, (byte) -46, arg2);
                    } else {
                        class149.method1105(var11, 0, -1, 0, 0, -1, (byte) 100, 0);
                    }
                }
            }
            ++var12;
        }
    }

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "(B)V")
    public static final void method1067(byte arg0) {
        ++field3131;
        class61.field1543.method676((byte) -107);
        int var1 = -70 % ((55 - arg0) / 52);
        class96.field2436.method676((byte) -106);
        class128.field2896.method676((byte) -125);
        class102.field2483.method676((byte) -121);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZILdd;Ldd;Z)Lhe;")
    public static final class54 method1068(boolean arg0, int arg1, class26 arg2, class26 arg3, boolean arg4) {
        ++field3152;
        boolean var5 = arg4;
        int[] var6 = arg2.method190(arg1, !arg4);
        for (int var7 = 0; ~var6.length < ~var7; ++var7) {
            byte[] var8 = arg2.method199(arg1, var6[var7], (byte) 127);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (255 & var8[0]) << 8 | var8[1] & 255;
                byte[] var10;
                if (!arg0) {
                    var10 = arg3.method199(var9, 0, (byte) -77);
                } else {
                    var10 = arg3.method199(0, var9, (byte) 125);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        } else {
            try {
                return new class54(arg2, arg3, arg1, arg0);
            } catch (Exception var11) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([II)V")
    public final void method1069(int[] arg0, int arg1) {
        ++field3154;
        if (arg1 != -104) {
            this.method1062(false);
        }
        this.field3149 = new class81(arg0);
    }

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "(I)V")
    public final void method1070(int arg0) {
        ++field3145;
        if (arg0 != -16777217) {
            field3157 = null;
        }
        super.field3457 = (this.field3134 + 7) / 8;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(IZ)I")
    public final int method1071(int arg0, boolean arg1) {
        ++field3156;
        return !arg1 ? -89 : arg0 * 8 + -this.field3134;
    }

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "(II)V")
    public final void method1072(int arg0, int arg1) {
        ++field3151;
        super.field3473[super.field3457++] = (byte) (arg0 + this.field3149.method662(class125.method958(arg1, 89)));
        if (arg1 != -1) {
            this.method1062(false);
        }
    }

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "(I)V")
    public static void method1073(int arg0) {
        int var1 = -79 % ((arg0 - -15) / 56);
        field3157 = null;
        field3129 = null;
        field3150 = null;
        field3140 = null;
        field3141 = null;
        field3139 = null;
        field3153 = null;
        field3155 = null;
        field3146 = null;
    }

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "(I)I")
    public final int method1074(int arg0) {
        ++field3138;
        return arg0 != -24234 ? -40 : super.field3473[super.field3457++] + -this.field3149.method662(124) & 255;
    }

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "(II)Z")
    public static final boolean method1075(int arg0, int arg1) {
        if (arg1 != -23654) {
            method1066(-106, (byte[]) null, -115, -8, (byte) 65, 33, (class73[]) null, -128, 82, -52);
        }
        ++field3135;
        return ~arg0 <= -49 && arg0 <= 57;
    }
}
