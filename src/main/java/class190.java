import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class190 extends class160 {

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "Ljava/lang/String;")
    public static String field2943 = "yellow:";

    @OriginalMember(owner = "client!bd", name = "Z", descriptor = "Loh;")
    public static class281 field2945 = new class281(64);

    @OriginalMember(owner = "client!bd", name = "cb", descriptor = "I")
    public static int field2948 = 2;

    @OriginalMember(owner = "client!bd", name = "db", descriptor = "[I")
    public static int[] field2949 = new int[2];

    @OriginalMember(owner = "client!bd", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field2950 = null;

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!bd", name = "bb", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!bd", name = "fb", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!bd", name = "gb", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "Lre;")
    public static class228 field2942;

    @OriginalMember(owner = "client!bd", name = "ab", descriptor = "[I")
    public static int[] field2946;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2939;
        class141.method951(arg6, false);
        int var7 = 0;
        int var8 = 66 / ((17 - arg1) / 34);
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = -arg5 + arg6;
        int var12 = -1;
        int[] var13 = class154.field2406[arg2];
        int var14 = -1;
        if (~var11 > -1) {
            var11 = 0;
        }
        int var15 = -var11 + arg0;
        class166.method1124(true, var13, var15, arg3, arg0 - arg6);
        int var16 = var11;
        int var17 = arg0 - -var11;
        int var18 = -var11;
        class166.method1124(true, var13, var17, arg4, var15);
        class166.method1124(true, var13, arg0 - -arg6, arg3, var17);
        while (~var7 > ~var9) {
            var14 += 2;
            var12 += 2;
            var18 += var14;
            var10 += var12;
            if (~var18 <= -1 && ~var16 <= -2) {
                class243.field3963[var16] = var7;
                --var16;
                var18 -= var16 << 1;
            }
            ++var7;
            if (var10 >= 0) {
                --var9;
                if (~var9 > ~var11) {
                    int[] var19 = class154.field2406[arg2 + var9];
                    int[] var20 = class154.field2406[-var9 + arg2];
                    int var21 = class243.field3963[var9];
                    int var22 = arg0 + var7;
                    int var23 = -var7 + arg0;
                    int var24 = -var21 + arg0;
                    int var25 = arg0 - -var21;
                    class166.method1124(true, var19, var24, arg3, var23);
                    class166.method1124(true, var19, var25, arg4, var24);
                    class166.method1124(true, var19, var22, arg3, var25);
                    class166.method1124(true, var20, var24, arg3, var23);
                    class166.method1124(true, var20, var25, arg4, var24);
                    class166.method1124(true, var20, var22, arg3, var25);
                } else {
                    int[] var26 = class154.field2406[arg2 + var9];
                    int[] var27 = class154.field2406[-var9 + arg2];
                    int var28 = -var7 + arg0;
                    int var29 = arg0 + var7;
                    class166.method1124(true, var26, var29, arg3, var28);
                    class166.method1124(true, var27, var29, arg3, var28);
                }
                var10 -= var9 << 1;
            }
            int[] var30 = class154.field2406[arg2 + var7];
            int[] var31 = class154.field2406[-var7 + arg2];
            int var32 = -var9 + arg0;
            int var33 = arg0 + var9;
            if (var11 > var7) {
                int var34 = var7 <= var16 ? var16 : class243.field3963[var7];
                int var35 = arg0 + var34;
                int var36 = -var34 + arg0;
                class166.method1124(true, var30, var36, arg3, var32);
                class166.method1124(true, var30, var35, arg4, var36);
                class166.method1124(true, var30, var33, arg3, var35);
                class166.method1124(true, var31, var36, arg3, var32);
                class166.method1124(true, var31, var35, arg4, var36);
                class166.method1124(true, var31, var33, arg3, var35);
            } else {
                class166.method1124(true, var30, var33, arg3, var32);
                class166.method1124(true, var31, var33, arg3, var32);
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2940;
        if (arg7 != 3) {
            method1277(81, -57, -119, 102, 13, 58, -74, -27, -105, 85);
        }
        if (~arg8 == ~arg9 && arg2 == arg5 && ~arg3 == ~arg6 && arg1 == arg4) {
            class284.method1909(arg9, arg0, -1, arg3, arg2, arg4);
        } else {
            int var10 = arg9;
            int var11 = arg2;
            int var12 = arg9 * 3;
            int var13 = arg2 * 3;
            int var14 = arg8 * 3;
            int var15 = arg6 * 3;
            int var16 = arg1 * 3;
            int var17 = arg5 * 3;
            int var18 = arg3 + var14 - arg9 + -var15;
            int var19 = var17 - arg2 + (arg4 - var16);
            int var20 = -var14 - var14 + var12 + var15;
            int var21 = -var17 + var16 - (-var13 + var17);
            int var22 = -var13 + var17;
            int var23 = var14 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var23 * var24;
                int var31 = var22 * var24;
                int var32 = var21 * var25;
                int var33 = (var27 - -var29 + var30 >> 12) + arg9;
                int var34 = arg2 - -(var31 + var32 + var28 >> 12);
                class284.method1909(var10, arg0, -1, var33, var11, var34);
                var10 = var33;
                var11 = var34;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(IIIII)V")
    public static final void method1278(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2944;
        for (class11 var5 = (class11) class185.field2857.method1221(119); var5 != null; var5 = (class11) class185.field2857.method1227(-10626)) {
            class114.method806(arg0, arg1, var5, arg3, arg2, (byte) -50);
        }
        if (arg4 != 3) {
            method1279(15, (byte) 67);
        }
        for (class11 var6 = (class11) class102.field1699.method1221(124); var6 != null; var6 = (class11) class102.field1699.method1227(arg4 ^ -10627)) {
            byte var11 = 1;
            class283 var12 = var6.field201.method972((byte) -71);
            if (var6.field201.field2250 == var12.field4496) {
                var11 = 0;
            } else if (var6.field201.field2250 != var12.field4468 && ~var6.field201.field2250 != ~var12.field4497 && ~var6.field201.field2250 != ~var12.field4485 && var6.field201.field2250 != var12.field4495) {
                if (~var6.field201.field2250 == ~var12.field4494 || var6.field201.field2250 == var12.field4454 || var6.field201.field2250 == var12.field4466 || var6.field201.field2250 == var12.field4483) {
                    var11 = 3;
                }
            } else {
                var11 = 2;
            }
            if (var6.field187 != var11) {
                int var13 = class185.method1248(-1, var6.field201);
                if (var6.field188 != var13) {
                    if (var6.field206 != null) {
                        class257.field4118.method1205(var6.field206);
                        var6.field206 = null;
                    }
                    var6.field188 = var13;
                }
                var6.field187 = var11;
            }
            var6.field182 = var6.field201.field2240;
            var6.field190 = var6.field201.field2240 + var6.field201.method971(65535) * 64;
            var6.field185 = var6.field201.field2278;
            var6.field202 = var6.field201.field2278 + 64 * var6.field201.method971(65535);
            class114.method806(arg0, arg1, var6, arg3, arg2, (byte) -50);
        }
        for (class11 var7 = (class11) class30.field444.method287(-123); var7 != null; var7 = (class11) class30.field444.method291((byte) -124)) {
            byte var8 = 1;
            class283 var9 = var7.field193.method972((byte) -71);
            if (~var7.field193.field2250 == ~var9.field4496) {
                var8 = 0;
            } else if (var7.field193.field2250 != var9.field4468 && var7.field193.field2250 != var9.field4497 && ~var7.field193.field2250 != ~var9.field4485 && var7.field193.field2250 != var9.field4495) {
                if (~var7.field193.field2250 == ~var9.field4494 || var7.field193.field2250 == var9.field4454 || var7.field193.field2250 == var9.field4466 || var7.field193.field2250 == var9.field4483) {
                    var8 = 3;
                }
            } else {
                var8 = 2;
            }
            if (~var7.field187 != ~var8) {
                int var10 = class90.method693(16, var7.field193);
                if (var7.field188 != var10) {
                    if (var7.field206 != null) {
                        class257.field4118.method1205(var7.field206);
                        var7.field206 = null;
                    }
                    var7.field188 = var10;
                }
                var7.field187 = var8;
            }
            var7.field182 = var7.field193.field2240;
            var7.field190 = var7.field193.field2240 + 64 * var7.field193.method971(arg4 ^ 65532);
            var7.field185 = var7.field193.field2278;
            var7.field202 = var7.field193.field2278 + 64 * var7.field193.method971(65535);
            class114.method806(arg0, arg1, var7, arg3, arg2, (byte) -50);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method3(int arg0, boolean arg1) {
        if (!arg1) {
            this.method2((class88) null, -35, -103);
        }
        ++field2941;
        int[][] var3 = super.field2476.method839(false, arg0);
        if (super.field2476.field1950) {
            int[] var4 = this.method1085(2, arg0, (byte) 111);
            int[][] var5 = this.method1079(arg0, 95, 0);
            int[][] var6 = this.method1079(arg0, 104, 1);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var5[1];
            int[] var11 = var5[0];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class240.field3896; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var8[var16] = var11[var16];
                    var7[var16] = var10[var16];
                    var9[var16] = var12[var16];
                } else if (var17 != 0) {
                    int var18 = -var17 + 4096;
                    var8[var16] = var11[var16] * var17 + var13[var16] * var18 >> 12;
                    var7[var16] = var10[var16] * var17 - -(var14[var16] * var18) >> 12;
                    var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                } else {
                    var8[var16] = var13[var16];
                    var7[var16] = var14[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(IB)C")
    public static final char method1279(int arg0, byte arg1) {
        ++field2947;
        int var2 = 255 & arg1;
        if (~var2 == -1) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (var2 >= 128 && var2 < 160) {
                char var3 = class292.field4593[var2 - 128];
                if (var3 == 0) {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) (arg0 != 14210 ? 65462 : (char) var2);
        }
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
    public static void method1280(int arg0) {
        field2942 = null;
        if (arg0 != -4097) {
            field2945 = null;
        }
        field2943 = null;
        field2949 = null;
        field2945 = null;
        field2950 = null;
        field2946 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        ++field2952;
        if (~arg2 == -1) {
            super.field2494 = ~arg0.method633(64) == -2;
        }
        if (arg1 < 11) {
            this.method1(-90, (byte) -21);
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class190() {
        super(3, false);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        ++field2938;
        int[] var3 = super.field2488.method15((byte) 127, arg0);
        if (super.field2488.field42) {
            int[] var4 = this.method1085(0, arg0, (byte) 98);
            int[] var5 = this.method1085(1, arg0, (byte) 124);
            int[] var6 = this.method1085(2, arg0, (byte) 50);
            for (int var7 = 0; ~var7 > ~class240.field3896; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        if (arg1 != 57) {
            method1276(-88, -5, -25, 48, -12, 75, 12);
        }
        return var3;
    }
}
