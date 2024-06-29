import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class105 extends class139 {

    @OriginalMember(owner = "client!la", name = "V", descriptor = "I")
    private int field2186 = 1;

    @OriginalMember(owner = "client!la", name = "Y", descriptor = "I")
    private int field2189 = 0;

    @OriginalMember(owner = "client!la", name = "ab", descriptor = "I")
    private int field2191 = 0;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "I")
    public static int field2185 = 0;

    @OriginalMember(owner = "client!la", name = "eb", descriptor = "Lf;")
    public static class51 field2195 = new class51(5000);

    @OriginalMember(owner = "client!la", name = "gb", descriptor = "I")
    public static int field2197 = 0;

    @OriginalMember(owner = "client!la", name = "hb", descriptor = "I")
    public static int field2198 = 0;

    @OriginalMember(owner = "client!la", name = "fb", descriptor = "[I")
    public static int[] field2196 = new int[128];

    @OriginalMember(owner = "client!la", name = "T", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!la", name = "W", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!la", name = "X", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!la", name = "Z", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!la", name = "bb", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!la", name = "cb", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!la", name = "db", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
    public final void method127(int arg0) {
        if (arg0 != 0) {
            this.method61(66, 30);
        }
        ++field2188;
        class137.method901(false);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        if (arg1 != 21) {
            field2185 = 123;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -4) {
                    this.field2186 = arg2.method344(255);
                }
            } else {
                this.field2189 = arg2.method344(255);
            }
        } else {
            this.field2191 = arg2.method344(255);
        }
        ++field2190;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        if (arg1 != 7451) {
            return null;
        } else {
            ++field2192;
            int[] var3 = super.field2859.method1319(-98, arg0);
            if (super.field2859.field3966) {
                int var4 = class180.field3607[arg0];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; ~var6 > ~class23.field402; ++var6) {
                    int var7 = class189.field3772[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var11;
                    if (~this.field2191 != -1) {
                        int var9 = var5 * var5 + var8 * var8 >> 12;
                        int var10 = (int) (Math.sqrt((double) (var9 / 4096)) * 4096.0D);
                        var11 = (int) ((double) (this.field2186 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (-var4 + var7) * this.field2186;
                    }
                    int var12 = var11 - (-4096 & var11);
                    if (~this.field2189 != -1) {
                        if (~this.field2189 == -3) {
                            var12 -= 2048;
                            if (~var12 > -1) {
                                var12 = -var12;
                            }
                            var12 = -var12 + 2048 << 1;
                        }
                    } else {
                        var12 = class162.field3266[var12 >> 4 & 255] + 4096 >> 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class105() {
        super(0, true);
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(B)V")
    public static final void method716(byte arg0) {
        ++field2187;
        class137 var1 = class175.field3528;
        synchronized (class175.field3528) {
            if (arg0 <= 6) {
                method718((class84[]) null, 105, (byte) 8);
            }
            class31.field626 = class112.field2376;
            if (~class3.field31 > -1) {
                for (int var2 = 0; var2 < 112; ++var2) {
                    class119.field2518[var2] = false;
                }
                class3.field31 = class82.field1647;
            } else {
                while (~class82.field1647 != ~class3.field31) {
                    int var3 = class201.field3970[class82.field1647];
                    class82.field1647 = class82.field1647 + 1 & 127;
                    if (var3 < 0) {
                        class119.field2518[~var3] = false;
                    } else {
                        class119.field2518[var3] = true;
                    }
                }
            }
            class112.field2376 = class129.field2685;
        }
    }

    @OriginalMember(owner = "client!la", name = "g", descriptor = "(B)V")
    public static void method717(byte arg0) {
        field2196 = null;
        if (arg0 > 75) {
            field2195 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([Lig;IB)V")
    public static final void method718(class84[] arg0, int arg1, byte arg2) {
        ++field2194;
        int var3 = 0;
        if (arg2 != -77) {
            method719(-33, -76, 11, -38, (class131[]) null, 97, -70, 46, (byte[]) null, -24);
        }
        while (~var3 > ~arg0.length) {
            class84 var4 = arg0[var3];
            if (var4 != null && ~var4.field1724 == ~arg1 && (!var4.field1853 || !class191.method1288(var4, (byte) -90))) {
                label97: {
                    if (var4.field1755 == 0) {
                        if (!var4.field1853 && class191.method1288(var4, (byte) -123) && class158.field3225 != var4) {
                            break label97;
                        }
                        method718(arg0, var4.field1782, (byte) -77);
                        if (var4.field1804 != null) {
                            method718(var4.field1804, var4.field1782, (byte) -77);
                        }
                        class87 var5 = (class87) class138.field2847.method465((long) var4.field1782, (byte) 125);
                        if (var5 != null) {
                            class112.method773(-1, var5.field1903);
                        }
                    }
                    if (~var4.field1755 == -7) {
                        if (var4.field1827 != -1 || var4.field1733 != -1) {
                            boolean var6 = class97.method667(var4, (byte) 126);
                            int var7;
                            if (var6) {
                                var7 = var4.field1733;
                            } else {
                                var7 = var4.field1827;
                            }
                            if (var7 != -1) {
                                class162 var8 = class97.method668(var7, (byte) 44);
                                var4.field1715 += class79.field1607;
                                while (var4.field1715 > var8.field3292[var4.field1785]) {
                                    var4.field1715 -= var8.field3292[var4.field1785];
                                    ++var4.field1785;
                                    if (var4.field1785 >= var8.field3263.length) {
                                        var4.field1785 -= var8.field3287;
                                        if (~var4.field1785 > -1 || var4.field1785 >= var8.field3263.length) {
                                            var4.field1785 = 0;
                                        }
                                    }
                                    class194.method1295((byte) -4, var4);
                                }
                            }
                        }
                        if (~var4.field1825 != -1 && !var4.field1853) {
                            int var9 = var4.field1825 >> 16;
                            int var10 = var4.field1825 << 16 >> 16;
                            int var11 = class79.field1607 * var9;
                            var4.field1742 = 2047 & var4.field1742 + var11;
                            int var12 = class79.field1607 * var10;
                            var4.field1739 = var4.field1739 - -var12 & 2047;
                            class194.method1295((byte) -123, var4);
                        }
                    }
                }
            }
            ++var3;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII[Loa;III[BI)V")
    public static final void method719(int arg0, int arg1, int arg2, int arg3, class131[] arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        ++field2193;
        class52 var10 = new class52(arg8);
        int var11 = arg1;
        while (true) {
            int var12 = var10.method354((byte) -108);
            if (var12 == 0) {
                return;
            }
            int var13 = 0;
            var11 += var12;
            while (true) {
                int var14 = var10.method354((byte) 120);
                if (~var14 == -1) {
                    break;
                }
                var13 += var14 + -1;
                int var15 = 63 & var13 >> 6;
                int var16 = var13 >> 12;
                int var17 = var10.method344(255);
                int var18 = var13 & 63;
                int var19 = var17 >> 2;
                int var20 = 3 & var17;
                if (arg7 == var16 && var15 >= arg6 && ~(arg6 - -8) < ~var15 && var18 >= arg0 && ~var18 > ~(arg0 - -8)) {
                    class61 var21 = class199.method1314((byte) 127, var11);
                    int var22 = arg5 + class15.method98(var21.field1257, var18 & 7, (byte) -44, arg9, var20, var21.field1250, 7 & var15);
                    int var23 = class86.method604(var21.field1257, var21.field1250, (byte) 51, var20, arg9, 7 & var15, 7 & var18) + arg2;
                    if (var22 > 0 && ~var23 < -1 && ~var22 > -104 && ~var23 > -104) {
                        class131 var24 = null;
                        int var25 = arg3;
                        if (~(2 & class21.field372[1][var22][var23]) == -3) {
                            var25 = arg3 - 1;
                        }
                        if (var25 >= 0) {
                            var24 = arg4[var25];
                        }
                        class82.method548(var19, (byte) -4, var11, arg3, arg9 + var20 & 3, var23, var22, var24);
                    }
                }
            }
        }
    }
}
