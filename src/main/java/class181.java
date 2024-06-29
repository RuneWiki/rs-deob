import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class181 extends class478 {

    @OriginalMember(owner = "client!uo", name = "K", descriptor = "[I")
    public static int[] field2035 = new int[14];

    @OriginalMember(owner = "client!uo", name = "J", descriptor = "I")
    public static int field2034 = 0;

    @OriginalMember(owner = "client!uo", name = "B", descriptor = "Lcq;")
    public static class110 field2026 = new class110(107, 3);

    @OriginalMember(owner = "client!uo", name = "H", descriptor = "F")
    public static float field2032;

    @OriginalMember(owner = "client!uo", name = "C", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!uo", name = "D", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!uo", name = "E", descriptor = "I")
    private int field2029;

    @OriginalMember(owner = "client!uo", name = "F", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!uo", name = "G", descriptor = "I")
    private int field2031;

    @OriginalMember(owner = "client!uo", name = "I", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!uo", name = "L", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!uo", name = "M", descriptor = "I")
    private int field2037;

    @OriginalMember(owner = "client!uo", name = "N", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
    public class181() {
        this(0);
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)V")
    public static void method1099(int arg0) {
        field2026 = null;
        field2035 = null;
        if (arg0 != 4185954) {
            field2032 = 0.25045666F;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lce;BI)Z")
    public static final boolean method1100(class445 arg0, byte arg1, int arg2) {
        ++field2038;
        int var3 = arg0.method2574(296813219, 2);
        if (var3 == 0) {
            if (arg0.method2574(296813219, 1) != 0) {
                method1100(arg0, (byte) 8, arg2);
            }
            int var4 = arg0.method2574(296813219, 6);
            int var5 = arg0.method2574(296813219, 6);
            boolean var6 = ~arg0.method2574(296813219, 1) == -2;
            if (var6) {
                class624.field8805[class293.field3662++] = arg2;
            }
            if (class139.field1540[arg2] != null) {
                throw new RuntimeException("hr:lr");
            } else {
                class432 var7 = class186.field2112[arg2];
                class236 var8 = class139.field1540[arg2] = new class236();
                var8.field9434 = arg2;
                if (class304.field3766[arg2] != null) {
                    var8.method1405(20512, class304.field3766[arg2]);
                }
                var8.method3733(var7.field6121, true, (byte) -103);
                var8.field9448 = var7.field6114;
                int var9 = var7.field6117;
                int var10 = var9 >> 28;
                int var11 = (4185954 & var9) >> 14;
                int var12 = 255 & var9;
                int var13 = (var11 << 6) + -class26.field245 + var4;
                int var14 = (var12 << 6) + var5 - class231.field2860;
                var8.field2895 = var7.field6115;
                var8.field9523[0] = class649.field9141[arg2];
                var8.field5166 = var8.field5169 = (byte) var10;
                if (class568.method3221(var14, var13, 0)) {
                    ++var8.field5169;
                }
                var8.method1403(var13, 84, var14);
                var8.field2932 = false;
                class186.field2112[arg2] = null;
                return true;
            }
        } else if (var3 == 1) {
            int var15 = arg0.method2574(296813219, 2);
            int var16 = class186.field2112[arg2].field6117;
            class186.field2112[arg2].field6117 = ((var16 >> 28) + var15 << 28 & 805306368) + (var16 & 268435455);
            return false;
        } else if (var3 == 2) {
            int var17 = arg0.method2574(296813219, 5);
            int var18 = var17 >> 3;
            int var19 = var17 & 7;
            int var20 = class186.field2112[arg2].field6117;
            int var21 = (var20 >> 28) + var18 & 3;
            int var22 = 255 & var20 >> 14;
            int var23 = 255 & var20;
            if (var19 == 0) {
                --var22;
                --var23;
            }
            if (~var19 == -2) {
                --var23;
            }
            if (~var19 == -3) {
                ++var22;
                --var23;
            }
            if (var19 == 3) {
                --var22;
            }
            if (var19 == 4) {
                ++var22;
            }
            if (var19 == 5) {
                ++var23;
                --var22;
            }
            if (var19 == 6) {
                ++var23;
            }
            if (var19 == 7) {
                ++var23;
                ++var22;
            }
            class186.field2112[arg2].field6117 = (var22 << 14) + ((var21 << 28) - -var23);
            return false;
        } else {
            int var24 = arg0.method2574(296813219, 18);
            int var25 = var24 >> 16;
            int var26 = 58 % ((-55 - arg1) / 59);
            int var27 = (var24 & 65450) >> 8;
            int var28 = var24 & 255;
            int var29 = class186.field2112[arg2].field6117;
            int var30 = (var29 >> 28) + var25 & 3;
            int var31 = 255 & (var29 >> 14) - -var27;
            int var32 = var28 + var29 & 255;
            class186.field2112[arg2].field6117 = (var30 << 28) - (-(var31 << 14) + -var32);
            return false;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2028;
        class334.field4188[class581.field8265++] = new class603(arg7, arg1, arg4, arg6, arg6, arg4, arg3, arg8, arg8, arg3, arg5, arg5, arg2, arg2);
        if (arg0 != 268435455) {
            method1101(-3, -48, -91, -108, -9, -61, 62, -113, -47);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lsq;B)I")
    public static final int method1102(class485 arg0, byte arg1) {
        if (arg1 <= 36) {
            return 65;
        } else {
            ++field2036;
            if (class293.field3663 != arg0) {
                if (class412.field5529 == arg0) {
                    return 6408;
                } else if (class274.field3431 != arg0) {
                    if (class379.field5140 == arg0) {
                        return 6409;
                    } else if (class363.field4868 != arg0) {
                        if (class496.field7182 == arg0) {
                            return 6145;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        return 6410;
                    }
                } else {
                    return 6406;
                }
            } else {
                return 6407;
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(I)V")
    private class181(int arg0) {
        super(0, false);
        this.method1103(-123, arg0);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILnp;I)V")
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (~arg2 == -1) {
            this.method1103(arg0 ^ -145, arg1.method675(-126));
        }
        ++field2027;
        if (arg0 != 255) {
            field2032 = -0.28142178F;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method104(boolean arg0, int arg1) {
        ++field2030;
        int[][] var3 = super.field6889.method2091(-128, arg1);
        if (super.field6889.field4765) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class436.field6154; ++var7) {
                var4[var7] = this.field2037;
                var5[var7] = this.field2029;
                var6[var7] = this.field2031;
            }
        }
        return !arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(II)V")
    private final void method1103(int arg0, int arg1) {
        ++field2033;
        this.field2037 = 4080 & arg1 >> 12;
        this.field2031 = arg1 << 4 & 4080;
        int var3 = -46 / ((-49 - arg0) / 48);
        this.field2029 = (65280 & arg1) >> 4;
    }
}
