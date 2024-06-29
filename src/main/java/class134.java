import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class134 extends class298 {

    @OriginalMember(owner = "client!nq", name = "S", descriptor = "I")
    private int field1627 = 32768;

    @OriginalMember(owner = "client!nq", name = "M", descriptor = "Llc;")
    public static class135 field1621 = new class135("", 16);

    @OriginalMember(owner = "client!nq", name = "K", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!nq", name = "L", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!nq", name = "N", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!nq", name = "O", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!nq", name = "P", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!nq", name = "Q", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!nq", name = "R", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!nq", name = "T", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!nq", name = "U", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IILvt;)V")
    public final void method10(int arg0, int arg1, class179 arg2) {
        if (arg0 > -44) {
            method638(-96, 43);
        }
        ++field1623;
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field4449 = ~arg2.method895((byte) -117) == -2;
            }
        } else {
            this.field1627 = arg2.method916(21933) << 4;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)[[I")
    public final int[][] method157(int arg0, int arg1) {
        ++field1619;
        int[][] var3 = super.field4454.method1638((byte) -107, arg1);
        if (arg0 != -24032) {
            method635(-51, -85, (class280) null, -20, (byte) 80, -1, 0, (class352) null, 18, -39, -118);
        }
        if (super.field4454.field3886) {
            int[] var4 = this.method1882(1, arg0 ^ 22526, arg1);
            int[] var5 = this.method1882(2, -2594, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class158.field1877; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field1627 >> 12;
                int var12 = class159.field1909[var10] * var11 >> 12;
                int var13 = class420.field6058[var10] * var11 >> 12;
                int var14 = class474.field6656 & (var12 >> 12) + var9;
                int var15 = (var13 >> 12) + arg1 & class208.field2886;
                int[][] var16 = this.method1878(0, var15, 121);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZ)[I")
    public final int[] method13(int arg0, boolean arg1) {
        ++field1622;
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (!arg1) {
            method638(27, -13);
        }
        if (super.field4443.field6915) {
            int[] var4 = this.method1882(1, -2594, arg0);
            int[] var5 = this.method1882(2, -2594, arg0);
            for (int var6 = 0; ~class158.field1877 < ~var6; ++var6) {
                int var7 = (var4[var6] & 4093) >> 4;
                int var8 = var5[var6] * this.field1627 >> 12;
                int var9 = class159.field1909[var7] * var8 >> 12;
                int var10 = class420.field6058[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class474.field6656;
                int var12 = arg0 - -(var10 >> 12) & class208.field2886;
                int[] var13 = this.method1882(0, -2594, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILjava/lang/String;IZ)I")
    public static final int method633(int arg0, String arg1, int arg2, boolean arg3) {
        ++field1629;
        if (arg2 >= 2 && arg2 <= 36) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg1.length();
            for (int var8 = 0; ~var8 > ~var7; ++var8) {
                char var9 = arg1.charAt(var8);
                if (var8 == 0) {
                    if (~var9 == -46) {
                        var4 = true;
                        continue;
                    }
                    if (~var9 == -44 && arg3) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (~var9 <= -66 && ~var9 >= -91) {
                    var11 = var9 - '7';
                } else {
                    if (~var9 > -98 || var9 > 'z') {
                        throw new NumberFormatException();
                    }
                    var11 = var9 - 'W';
                }
                if (var11 >= arg2) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg2 * var6 + var11;
                if (var10 / arg2 != var6) {
                    throw new NumberFormatException();
                }
                var6 = var10;
                var5 = true;
            }
            if (arg0 != 57) {
                field1621 = null;
            }
            if (!var5) {
                throw new NumberFormatException();
            } else {
                return var6;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V")
    public final void method15(int arg0) {
        class292.method1836(6090);
        if (arg0 >= -41) {
            method634((byte) 111);
        }
        ++field1624;
    }

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "(B)V")
    public static void method634(byte arg0) {
        field1621 = null;
        if (arg0 != -109) {
            field1621 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
    public class134() {
        super(3, false);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IILoj;IBIILqh;III)Lqh;")
    public static final class352 method635(int arg0, int arg1, class280 arg2, int arg3, byte arg4, int arg5, int arg6, class352 arg7, int arg8, int arg9, int arg10) {
        ++field1628;
        long var11 = (long) arg9;
        int var13 = 75 % ((-62 - arg4) / 52);
        class352 var14 = (class352) class282.field4114.method1163((byte) -127, var11);
        short var15 = 1031;
        if (var14 == null) {
            class10 var16 = class85.method430(0, class291.field4336, -88, arg9);
            if (var16 == null) {
                return null;
            }
            var14 = arg2.method1346(var16, var15, class273.field3883, 64, 768);
            class282.field4114.method1172(var11, 1, var14);
        }
        class352 var17 = var14.method1749((byte) 2, var15, true);
        if (~arg10 != -1) {
            var17.method1743(arg10);
        }
        if (arg8 != 0) {
            var17.method1750(arg8);
        }
        if (arg3 != 0) {
            var17.method1740(arg3);
        }
        if (~arg5 != -1) {
            var17.method1700(0, arg5, 0);
        }
        return var17;
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
    public static final void method636(int arg0) {
        ++field1625;
        if (arg0 != 0) {
            method634((byte) 94);
        }
        for (class92 var1 = (class92) class270.field3868.method802((byte) 119); var1 != null; var1 = (class92) class270.field3868.method806((byte) 104)) {
            class357 var2 = var1.field1141;
            if (~class100.field1217 == ~var2.field994 && ~var2.field5146 <= ~class204.field2796) {
                if (class204.field2796 >= var2.field5120) {
                    if (~var2.field5118 < -1) {
                        class137 var3 = class448.field6366[var2.field5118 - 1];
                        if (var3 != null && var3.field1008 >= 0 && var3.field1008 < class159.field1895 * 128 && ~var3.field1005 <= -1 && ~(class289.field4316 * 128) < ~var3.field1005) {
                            var2.method2179(1, class204.field2796, var3.field1005, class375.method2264(-1547, var3.field1005, var2.field994, var3.field1008) - var2.field5153, var3.field1008);
                        }
                    }
                    if (~var2.field5118 > -1) {
                        int var4 = -var2.field5118 + -1;
                        class198 var5;
                        if (class61.field760 != var4) {
                            var5 = class46.field596[var4];
                        } else {
                            var5 = class19.field258;
                        }
                        if (var5 != null && var5.field1008 >= 0 && ~var5.field1008 > ~(class159.field1895 * 128) && var5.field1005 >= 0 && ~(class289.field4316 * 128) < ~var5.field1005) {
                            var2.method2179(arg0 + 1, class204.field2796, var5.field1005, class375.method2264(-1547, var5.field1005, var2.field994, var5.field1008) + -var2.field5153, var5.field1008);
                        }
                    }
                    var2.method2183(arg0 + 1, class263.field3805);
                    class223.method1232(var2, true);
                }
            } else {
                var1.method702((byte) -114);
                var2.method2184((byte) 105);
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)V")
    public static final void method637(int arg0) {
        ++field1626;
        class208.field2882.method974((byte) 126);
        class128.field1581 = null;
        class142.field1712 = arg0;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)Lmg;")
    public static final class451 method638(int arg0, int arg1) {
        ++field1620;
        if (arg0 != 762096108) {
            return null;
        } else {
            class388[] var2 = class36.field442;
            synchronized (class36.field442) {
                class451 var3;
                if (~arg1 > ~class36.field442.length && !class36.field442[arg1].method2345(4616)) {
                    var3 = (class451) class36.field442[arg1].method2335(0);
                    var3.method2550(false);
                    int var10002 = class94.field1178[arg1]--;
                } else {
                    var3 = new class451();
                    var3.field6379 = new class465[arg1];
                    for (int var4 = 0; ~var4 > ~arg1; ++var4) {
                        var3.field6379[var4] = new class465();
                    }
                }
                return var3;
            }
        }
    }
}
