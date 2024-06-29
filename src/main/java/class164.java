import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class164 extends class117 {

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "Lhh;")
    private static class163 field3025 = class137.method1065("wishes to trade with you)3", 17);

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "Lhh;")
    public static class163 field3031 = class137.method1065("::fpsoff", 17);

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
    public static int field3030 = -2;

    @OriginalMember(owner = "client!ff", name = "cb", descriptor = "Lhh;")
    public static class163 field3036 = field3025;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!ff", name = "bb", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!ff", name = "db", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([BZ)V")
    public static final void method1233(byte[] arg0, boolean arg1) {
        ++field3037;
        class81 var2 = new class81(arg0);
        var2.field1541 = arg0.length - 2;
        class84.field1594 = var2.method658(120);
        class81.field1574 = new boolean[class84.field1594];
        class180.field3267 = new int[class84.field1594];
        class35.field568 = new byte[class84.field1594][];
        class256.field4478 = new int[class84.field1594];
        class223.field4070 = new byte[class84.field1594][];
        class257.field4505 = new int[class84.field1594];
        class65.field1107 = new int[class84.field1594];
        var2.field1541 = arg0.length + -(class84.field1594 * 8) - 7;
        class107.field2043 = var2.method658(-105);
        class2.field36 = var2.method658(124);
        int var3 = 1 + (var2.method622(arg1) & 255);
        for (int var4 = 0; class84.field1594 > var4; ++var4) {
            class65.field1107[var4] = var2.method658(-84);
        }
        for (int var5 = 0; class84.field1594 > var5; ++var5) {
            class180.field3267[var5] = var2.method658(83);
        }
        for (int var6 = 0; ~class84.field1594 < ~var6; ++var6) {
            class256.field4478[var6] = var2.method658(80);
        }
        for (int var7 = 0; class84.field1594 > var7; ++var7) {
            class257.field4505[var7] = var2.method658(124);
        }
        var2.field1541 = arg0.length + -(class84.field1594 * 8) + -((var3 + -1) * 3) + -7;
        class111.field2097 = new int[var3];
        for (int var8 = 1; ~var3 < ~var8; ++var8) {
            class111.field2097[var8] = var2.method615(-109);
            if (class111.field2097[var8] == 0) {
                class111.field2097[var8] = 1;
            }
        }
        var2.field1541 = 0;
        for (int var9 = 0; class84.field1594 > var9; ++var9) {
            int var10 = class256.field4478[var9];
            boolean var11 = false;
            int var12 = class257.field4505[var9];
            int var13 = var10 * var12;
            byte[] var14 = new byte[var13];
            class223.field4070[var9] = var14;
            byte[] var15 = new byte[var13];
            class35.field568[var9] = var15;
            int var16 = var2.method622(arg1);
            if ((var16 & 1) != 0) {
                int var17 = 0;
                label88: while (true) {
                    if (~var17 <= ~var10) {
                        if ((2 & var16) == 0) {
                            break;
                        }
                        int var18 = 0;
                        while (true) {
                            if (~var10 >= ~var18) {
                                break label88;
                            }
                            for (int var19 = 0; var12 > var19; ++var19) {
                                byte var20 = var15[var10 * var19 + var18] = var2.method635(-23);
                                var11 |= var20 != -1;
                            }
                            ++var18;
                        }
                    }
                    for (int var21 = 0; var12 > var21; ++var21) {
                        var14[var10 * var21 + var17] = var2.method635(-116);
                    }
                    ++var17;
                }
            } else {
                for (int var22 = 0; ~var13 < ~var22; ++var22) {
                    var14[var22] = var2.method635(-23);
                }
                if (~(2 & var16) != -1) {
                    for (int var23 = 0; var13 > var23; ++var23) {
                        byte var24 = var15[var23] = var2.method635(-34);
                        var11 |= var24 != -1;
                    }
                }
            }
            class81.field1574[var9] = var11;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class164() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)Lbd;")
    public static final class14 method1234(int arg0, byte arg1) {
        class14 var2 = (class14) class146.field2782.method326((long) arg0, (byte) -102);
        if (arg1 != 90) {
            field3025 = null;
        }
        ++field3028;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class54.field900.method973(5, true, arg0);
            class14 var4 = new class14();
            if (var3 != null) {
                var4.method92(19121, new class81(var3));
            }
            class146.field2782.method328(8690, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(B)[Lvf;")
    public static final class71[] method1235(byte arg0) {
        if (arg0 >= -86) {
            return null;
        } else {
            ++field3029;
            class71[] var1 = new class71[class84.field1594];
            for (int var2 = 0; var2 < class84.field1594; ++var2) {
                int var3 = class257.field4505[var2] * class256.field4478[var2];
                int[] var4 = new int[var3];
                byte[] var5 = class223.field4070[var2];
                for (int var6 = 0; ~var3 < ~var6; ++var6) {
                    var4[var6] = class111.field2097[class7.method50(var5[var6], 255)];
                }
                var1[var2] = new class105(class107.field2043, class2.field36, class65.field1107[var2], class180.field3267[var2], class256.field4478[var2], class257.field4505[var2], var4);
            }
            class67.method463(-10);
            return var1;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (arg0 == 0) {
            ++field3026;
            if (~arg1 == -1) {
                super.field2208 = ~arg2.method622(true) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method90(int arg0, boolean arg1) {
        ++field3033;
        int[][] var3 = super.field2228.method1304(arg0, (byte) 110);
        if (super.field2228.field3221) {
            int[] var4 = this.method932(arg0, false, 2);
            int[][] var5 = this.method931(arg0, 119, 0);
            int[][] var6 = this.method931(arg0, -109, 1);
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class143.field2702; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var8[var16] = var10[var16];
                    var9[var16] = var11[var16];
                    var7[var16] = var12[var16];
                } else if (var17 == 0) {
                    var8[var16] = var13[var16];
                    var9[var16] = var14[var16];
                    var7[var16] = var15[var16];
                } else {
                    int var18 = -var17 + 4096;
                    var8[var16] = var10[var16] * var17 - -(var13[var16] * var18) >> 12;
                    var9[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var7[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                }
            }
        }
        if (!arg1) {
            field3030 = 93;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIBI)V")
    public static final void method1236(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field3034;
        if (arg3 < 49) {
            method1235((byte) -42);
        }
        if (~class127.field2465 >= ~(-arg1 + arg2) && arg1 + arg2 <= class252.field4407 && arg0 - arg1 >= class182.field3344 && ~(arg0 + arg1) >= ~class201.field3593) {
            class240.method1662((byte) 62, arg2, arg0, arg4, arg1);
        } else {
            class178.method1316((byte) 96, arg4, arg0, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(B)V")
    public static void method1237(byte arg0) {
        if (arg0 == 65) {
            field3031 = null;
            field3036 = null;
            field3025 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field3027;
        int[] var3 = super.field2218.method1044(arg1, 0);
        if (super.field2218.field2587) {
            int[] var4 = this.method932(arg1, false, 0);
            int[] var5 = this.method932(arg1, false, 1);
            int[] var6 = this.method932(arg1, false, 2);
            for (int var7 = 0; ~class143.field2702 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (var8 != 0) {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        if (arg0 != -21393) {
            field3030 = -91;
        }
        return var3;
    }
}
