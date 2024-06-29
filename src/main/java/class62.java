import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class62 extends class12 {

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
    private int field1175 = 6;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "Ltg;")
    public static class184 field1165 = class135.method812(" loggt sich aus)3", 3);

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "Ltg;")
    public static class184 field1174 = class135.method812(":clan:", 3);

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
    public static int field1172 = 0;

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "I")
    public static int field1176 = 0;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!gb", name = "Z", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!gb", name = "ab", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field211 = ~arg0.method588((byte) -40) == -2;
            }
        } else {
            this.field1175 = arg0.method588((byte) -45);
        }
        if (!arg2) {
            ++field1177;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        ++field1167;
        if (arg1 != 17) {
            return null;
        } else {
            int[] var3 = super.field224.method7((byte) 85, arg0);
            if (super.field224.field53) {
                int[] var4 = this.method77(0, arg0, -125);
                int[] var5 = this.method77(1, arg0, -127);
                for (int var6 = 0; class201.field3889 > var6; ++var6) {
                    var3[var6] = this.method351(true, var4[var6], var5[var6]);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)V")
    public static final void method348(int arg0) {
        if (arg0 != 4096) {
            method348(95);
        }
        ++field1168;
        class109.field1968.method770(false);
        class111.field2009.method770(false);
        class178.field3400.method770(false);
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)V")
    public static void method349(int arg0) {
        int var1 = -119 / ((-73 - arg0) / 35);
        field1165 = null;
        field1174 = null;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class62() {
        super(2, false);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1173;
        if (class164.method982(22401, arg4)) {
            class191.field3714 = null;
            class208.method1323(91, class149.field2670[arg4], arg1, arg7, arg8, arg2, arg3, -1, arg5, arg6);
            if (class191.field3714 != null) {
                class208.method1323(arg0 + 80, class191.field3714, arg1, arg7, arg8, arg2, class11.field196, -1412584499, class117.field2118, arg6);
                class191.field3714 = null;
            }
            if (arg0 != 0) {
                method349(-36);
            }
        } else if (~arg2 != 0) {
            class99.field1849[arg2] = true;
        } else {
            for (int var9 = 0; var9 < 100; ++var9) {
                class99.field1849[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field1170;
        int[][] var3 = super.field232.method673(arg0, 104);
        if (super.field232.field1962) {
            int[][] var4 = this.method76(arg0, 6218, 0);
            int[][] var5 = this.method76(arg0, 6218, 1);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int[] var10 = var5[0];
            int[] var11 = var4[0];
            int[] var12 = var3[2];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            for (int var15 = 0; var15 < class201.field3889; ++var15) {
                var7[var15] = this.method351(true, var11[var15], var10[var15]);
                var6[var15] = this.method351(true, var8[var15], var14[var15]);
                var12[var15] = this.method351(true, var9[var15], var13[var15]);
            }
        }
        int var16 = 34 % ((-58 - arg1) / 34);
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZII)I")
    private final int method351(boolean arg0, int arg1, int arg2) {
        ++field1166;
        int var4 = this.field1175;
        if (var4 != 1) {
            if (~var4 != -3) {
                if (~var4 != -4) {
                    if (var4 != 4) {
                        if (~var4 != -6) {
                            if (~var4 != -7) {
                                if (var4 != 7) {
                                    if (var4 != 8) {
                                        if (var4 != 9) {
                                            if (~var4 != -11) {
                                                if (~var4 != -12) {
                                                    if (~var4 == -13) {
                                                        return -(arg1 * arg2 >> 11) + arg2 + arg1;
                                                    } else {
                                                        if (!arg0) {
                                                            field1178 = -20;
                                                        }
                                                        return arg1;
                                                    }
                                                } else {
                                                    return ~arg2 > ~arg1 ? -arg2 + arg1 : arg2 - arg1;
                                                }
                                            } else {
                                                return arg2 >= arg1 ? arg2 : arg1;
                                            }
                                        } else {
                                            return ~arg1 <= ~arg2 ? arg2 : arg1;
                                        }
                                    } else {
                                        return arg1 != 0 ? -((4096 - arg2 << 12) / arg1) + 4096 : 0;
                                    }
                                } else {
                                    return arg1 == 4096 ? 4096 : (arg2 << 12) / (-arg1 + 4096);
                                }
                            } else {
                                return ~arg2 > -2049 ? arg1 * arg2 >> 11 : -((-arg1 + 4096) * (-arg2 + 4096) >> 11) + 4096;
                            }
                        } else {
                            return -((4096 - arg1) * (-arg2 + 4096) >> 12) + 4096;
                        }
                    } else {
                        return ~arg2 != -1 ? (arg1 << 12) / arg2 : 4096;
                    }
                } else {
                    return arg1 * arg2 >> 12;
                }
            } else {
                return arg1 - arg2;
            }
        } else {
            return arg1 - -arg2;
        }
    }
}
