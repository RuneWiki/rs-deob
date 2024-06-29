import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class224 extends class260 {

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
    private int field3955 = 4096;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    private int field3952 = 4096;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
    private int field3954 = 4096;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "Llb;")
    public static class127 field3949 = new class127(64);

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "Loh;")
    public static class263 field3959 = class253.method1681(-125, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "Loh;")
    public static class263 field3956 = class253.method1681(-119, "(R");

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BIIIIIIIII)V")
    public static final void method1524(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == 2) {
            ++field3953;
            if (arg9 >= class51.field1099 && class198.field3587 >= arg9 && ~arg1 <= ~class51.field1099 && ~class198.field3587 <= ~arg1 && ~class51.field1099 >= ~arg3 && class198.field3587 >= arg3 && arg7 >= class51.field1099 && ~arg7 >= ~class198.field3587 && ~arg5 <= ~class11.field249 && ~arg5 >= ~class276.field4831 && ~class11.field249 >= ~arg8 && arg8 <= class276.field4831 && class11.field249 <= arg4 && ~class276.field4831 <= ~arg4 && arg6 >= class11.field249 && ~class276.field4831 <= ~arg6) {
                class145.method958(arg1, arg6, arg4, arg2, arg7, arg3, arg9, arg8, (byte) 80, arg5);
            } else {
                class3.method14(arg9, arg2, arg7, 1002, arg5, arg6, arg4, arg3, arg8, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)V")
    public static final void method1525(boolean arg0) {
        class5.method28(arg0, (byte) -94);
        System.gc();
        class244.method1659(25, 26473);
        ++field3961;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        ++field3957;
        if (arg1 != 5701) {
            field3956 = null;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field3955 = arg2.method1294((byte) 3);
                }
            } else {
                this.field3952 = arg2.method1294((byte) 3);
            }
        } else {
            this.field3954 = arg2.method1294((byte) 3);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)[[I")
    public final int[][] method174(int arg0, int arg1) {
        if (arg1 != 5) {
            method1529(37, false, 104, false, 26);
        }
        ++field3960;
        int[][] var3 = super.field4509.method1667(arg0, 0);
        if (super.field4509.field4346) {
            int[][] var4 = this.method1712((byte) 2, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; class49.field1052 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var9[var11] = this.field3954 * var12 >> 12;
                    var8[var11] = this.field3952 * var13 >> 12;
                    var10[var11] = this.field3955 * var14 >> 12;
                } else {
                    var9[var11] = this.field3954;
                    var8[var11] = this.field3952;
                    var10[var11] = this.field3955;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1526(int arg0, boolean arg1) {
        ++field3958;
        if (arg1) {
            field3959 = null;
        }
        return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class224() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V")
    public static void method1527(int arg0) {
        field3956 = null;
        if (arg0 != 30831) {
            method1525(false);
        }
        field3959 = null;
        field3949 = null;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(IZ)V")
    public static final void method1528(int arg0, boolean arg1) {
        int var2 = -41 / ((-24 - arg0) / 51);
        for (int var3 = 0; var3 < class13.field345; ++var3) {
            class90 var4 = class31.field774[class117.field2191[var3]];
            long var5 = (long) class117.field2191[var3] << 32 | 536870912L;
            if (var4 != null && var4.method633((byte) 121) && arg1 != !var4.field1787.field3704 && var4.field1787.method1406((byte) 125)) {
                int var7 = var4.field4688 >> 7;
                int var8 = var4.field4705 >> 7;
                if (var7 >= 0 && ~var7 > -105 && var8 >= 0 && var8 < 104) {
                    if (~var4.method898(48) == -2 && ~(var4.field4688 & 127) == -65 && ~(var4.field4705 & 127) == -65) {
                        if (class36.field833[var7][var8] == class150.field2711) {
                            continue;
                        }
                        class36.field833[var7][var8] = class150.field2711;
                    }
                    if (!var4.field1787.field3708) {
                        var5 |= Long.MIN_VALUE;
                    }
                    var4.field4719 = class120.method781(class12.field321, var4.field4688, false, var4.field4705);
                    class146.method963(class12.field321, var4.field4688, var4.field4705, var4.field4719, var4.method898(49) * 64 - 64 - -60, var4, var4.field4700, var5, var4.field4666);
                }
            }
        }
        ++field3950;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZIZI)V")
    public static final void method1529(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        class188.method1238(arg3, arg4, arg1, arg0, arg2, arg4 ^ 38, class214.field3810.length - 1);
        ++field3951;
    }
}
