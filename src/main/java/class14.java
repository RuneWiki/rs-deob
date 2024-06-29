import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class14 extends class326 {

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
    private int field185 = 0;

    @OriginalMember(owner = "client!qk", name = "W", descriptor = "I")
    private int field193 = 0;

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
    private int field189 = 12288;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
    private int field186 = 4096;

    @OriginalMember(owner = "client!qk", name = "eb", descriptor = "I")
    private int field201 = 2048;

    @OriginalMember(owner = "client!qk", name = "ab", descriptor = "I")
    private int field197 = 2048;

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
    private int field187 = 8192;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "[I")
    public static int[] field188 = new int[32];

    @OriginalMember(owner = "client!qk", name = "gb", descriptor = "[[B")
    public static byte[][] field203 = new byte[1000][];

    @OriginalMember(owner = "client!qk", name = "jb", descriptor = "[[I")
    public static int[][] field206;

    @OriginalMember(owner = "client!qk", name = "hb", descriptor = "[Ljava/awt/Color;")
    public static Color[] field204;

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!qk", name = "X", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!qk", name = "Y", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!qk", name = "Z", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!qk", name = "bb", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!qk", name = "cb", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!qk", name = "db", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!qk", name = "fb", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!qk", name = "ib", descriptor = "I")
    public static int field205;

    static {
        int var0 = 2;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            field188[var1] = var0 + -1;
            var0 += var0;
        }
        field206 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
        field204 = new Color[] { new Color(16777215), new Color(16777215) };
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(Z)V", line = 16)
    public static final void method87(boolean arg0) {
        if (arg0) {
            method94(-45, -22, 56, -125, (byte) 124, 59, 30, (class261) null, 52, 4, 106, 35);
        }
        for (class256 var1 = (class256) class125.field1822.method2764((byte) -111); var1 != null; var1 = (class256) class125.field1822.method2769(true)) {
            var1.method1433();
        }
        ++field196;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V", line = 949)
    public class14() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V", line = 41)
    public static final void method88(byte arg0) {
        ++field205;
        if (arg0 != -41) {
            field203 = null;
        }
        class153.field2152.method495(-108);
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V", line = 53)
    public final void method65(int arg0) {
        class66.method437(false);
        if (arg0 <= -100) {
            ++field191;
        }
    }

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "(I)V", line = 65)
    public static void method89(int arg0) {
        if (arg0 < 51) {
            field204 = null;
        }
        field204 = null;
        field188 = null;
        field206 = null;
        field203 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILbt;I)V", line = 81)
    public final void method33(int arg0, class32 arg1, int arg2) {
        if (arg2 >= -3) {
            field188 = null;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field187 = arg1.method215((byte) 110);
                                }
                            } else {
                                this.field186 = arg1.method215((byte) 119);
                            }
                        } else {
                            this.field189 = arg1.method215((byte) 122);
                        }
                    } else {
                        this.field197 = arg1.method215((byte) 90);
                    }
                } else {
                    this.field193 = arg1.method215((byte) 125);
                }
            } else {
                this.field185 = arg1.method215((byte) 121);
            }
        } else {
            this.field201 = arg1.method215((byte) 107);
        }
        ++field190;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljg;ILwm;Lnp;BI)Z", line = 160)
    public static final boolean method90(class205 arg0, int arg1, class364 arg2, class313 arg3, byte arg4, int arg5) {
        if (arg4 != -88) {
            method94(47, -29, -40, 104, (byte) -108, 40, 38, (class261) null, -58, -100, 79, -122);
        }
        ++field200;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg3.field4122 != null) {
            var6 = (-class55.field759 + arg0.field2777 + arg3.field4151) * (-class55.field746 + class55.field747) / (-class55.field759 + class55.field752) + class55.field746;
            var9 = -((arg0.field2780 + arg3.field4148 + -class55.field760) * (-class55.field751 + class55.field766) / (-class55.field760 + class55.field764)) + class55.field766;
            var7 = class55.field746 - -((-class55.field759 + arg3.field4133 - -arg0.field2777) * (-class55.field746 + class55.field747) / (-class55.field759 + class55.field752));
            var8 = -((-class55.field760 + arg0.field2780 + arg3.field4144) * (-class55.field751 + class55.field766) / (-class55.field760 + class55.field764)) + class55.field766;
        }
        class139 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (~arg3.field4134 != 0) {
            if (arg0.field2770 && ~arg3.field4156 != 0) {
                var10 = arg3.method1723(arg2, true, true);
            } else {
                var10 = arg3.method1723(arg2, true, false);
            }
            if (var10 != null) {
                var11 = arg0.field2776 - (var10.method777() - -1 >> 1);
                var12 = arg0.field2776 - -(1 + var10.method777() >> 1);
                if (~var11 > ~var6) {
                    var6 = var11;
                }
                var13 = arg0.field2772 + -(1 + var10.method774() >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                if (var8 > var13) {
                    var8 = var13;
                }
                var14 = arg0.field2772 - -(var10.method774() - -1 >> 1);
                if (~var14 < ~var9) {
                    var9 = var14;
                }
            }
        }
        class253 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg3.field4136 != null) {
            var15 = class314.method1727((byte) 114, arg3.field4131);
            if (var15 != null) {
                var16 = class93.field1363.method2138(-102, class477.field6584, arg3.field4136, (int[]) null, (class139[]) null);
                int var23 = arg0.field2772;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method1420() / 2;
                } else {
                    var17 = var23 - ((var10.method774() >> 1) - -(var16 * var15.method1421()));
                }
                for (int var24 = 0; ~var24 > ~var16; ++var24) {
                    String var25 = class477.field6584[var24];
                    if (~var24 > ~(var16 + -1)) {
                        var25 = var25.substring(0, var25.length() + -4);
                    }
                    int var26 = var15.method1423(var25);
                    if (~var18 > ~var26) {
                        var18 = var26;
                    }
                }
                var19 = arg0.field2776 - (var18 / 2 - arg5);
                var20 = var18 / 2 + arg5 + arg0.field2776;
                if (var6 > var19) {
                    var6 = var19;
                }
                if (~var7 > ~var20) {
                    var7 = var20;
                }
                var21 = arg1 + var17;
                if (~var21 > ~var8) {
                    var8 = var21;
                }
                var22 = arg1 + var17 + var15.method1421() * var16;
                if (~var9 > ~var22) {
                    var9 = var22;
                }
            }
        }
        if (~class55.field746 >= ~var7 && ~class55.field747 <= ~var6 && ~var9 <= ~class55.field751 && var8 <= class55.field766) {
            if (arg3.field4122 != null) {
                int[] var27 = new int[arg3.field4122.length];
                for (int var28 = 0; ~var28 > ~(var27.length / 2); ++var28) {
                    int var30 = arg3.field4122[var28 * 2] - -arg0.field2777;
                    int var31 = arg3.field4122[var28 * 2 + 1] + arg0.field2780;
                    var27[var28 * 2] = (-class55.field759 + var30) * (-class55.field746 + class55.field747) / (-class55.field759 + class55.field752) + class55.field746;
                    var27[var28 * 2 + 1] = -((-class55.field760 + var31) * (-class55.field751 + class55.field766) / (class55.field764 - class55.field760)) + class55.field766;
                }
                class394.method2408(arg2, var27, arg3.field4126);
                for (int var29 = 0; ~(var27.length / 2 + -1) < ~var29; ++var29) {
                    arg2.method2220(var27[var29 * 2 + 1], var27[var29 * 2 + 2], var27[var29 * 2], arg4 ^ -8000, arg3.field4137, var27[var29 * 2 + 3]);
                }
                arg2.method2220(var27[var27.length + -1], var27[0], var27[var27.length + -2], 8040, arg3.field4137, var27[1]);
            }
            if (var10 != null) {
                if (class134.field1953 > 0 && (~class15.field215 != 0 && ~class15.field215 == ~arg0.field2775 || ~class464.field6405 != 0 && class464.field6405 == arg3.field4139)) {
                    int var32;
                    if (class308.field4076 <= 50) {
                        var32 = class308.field4076 * 2;
                    } else {
                        var32 = (-class308.field4076 + 100) * 2;
                    }
                    int var33 = var32 << 24 | 16776960;
                    arg2.method2221(arg0.field2776, 7 + var10.method775() / 2, var33, 1, arg0.field2772);
                    arg2.method2221(arg0.field2776, 5 + var10.method775() / 2, var33, 1, arg0.field2772);
                    arg2.method2221(arg0.field2776, 3 + var10.method775() / 2, var33, 1, arg0.field2772);
                    arg2.method2221(arg0.field2776, 1 + var10.method775() / 2, var33, arg4 ^ -87, arg0.field2772);
                    arg2.method2221(arg0.field2776, var10.method775() / 2, var33, 1, arg0.field2772);
                }
                var10.method836(arg0.field2776 + -(var10.method777() >> 1), arg0.field2772 + -(var10.method774() >> 1));
            }
            if (arg3.field4136 != null && var15 != null) {
                class314.method1725(var18, var16, var17, var15, arg2, arg0, arg3, arg4 ^ -119);
            }
            if (~arg3.field4134 != 0 || arg3.field4136 != null) {
                class392 var34 = new class392(arg0);
                var34.field5447 = var22;
                var34.field5435 = var21;
                var34.field5436 = var19;
                var34.field5438 = var14;
                var34.field5440 = var11;
                var34.field5442 = var12;
                var34.field5446 = var20;
                var34.field5443 = var13;
                class271.field3611.method641(var34, (byte) -93);
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(IIB)Z", line = 380)
    private final boolean method91(int arg0, int arg1, byte arg2) {
        ++field195;
        int var4 = (arg1 - -arg0) * this.field189 >> 12;
        int var5 = class461.field6247[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field189;
        int var7 = (var6 << 12) / this.field187;
        int var8 = this.field186 * var7 >> 12;
        if (arg2 < 71) {
            method90((class205) null, -32, (class364) null, (class313) null, (byte) 4, -103);
        }
        return var8 > -arg0 + arg1 && ~(-arg0 + arg1) < ~(-var8);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)[I", line = 399)
    public final int[] method30(byte arg0, int arg1) {
        ++field202;
        int[] var3 = super.field4344.method130(arg1, -112);
        if (arg0 >= -6) {
            return null;
        } else {
            if (super.field4344.field286) {
                int var4 = class95.field1400[arg1] - 2048;
                for (int var5 = 0; ~class181.field2495 < ~var5; ++var5) {
                    int var6 = class389.field5375[var5] + -2048;
                    int var7 = this.field201 + var6;
                    int var8 = var7 < -2048 ? var7 + 4096 : var7;
                    int var9 = var8 <= 2048 ? var8 : var8 + -4096;
                    int var10 = this.field185 + var4;
                    int var11 = ~var10 <= 2047 ? var10 : var10 + 4096;
                    int var12 = var11 > 2048 ? var11 + -4096 : var11;
                    int var13 = this.field193 + var6;
                    int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                    int var15 = var14 <= 2048 ? var14 : var14 - 4096;
                    int var16 = var4 - -this.field197;
                    int var17 = ~var16 <= 2047 ? var16 : var16 + 4096;
                    int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                    var3[var5] = !this.method93((byte) -125, var9, var12) && !this.method91(var15, var18, (byte) 115) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(IZI)V", line = 450)
    public static final void method92(int arg0, boolean arg1, int arg2) {
        ++field194;
        class257 var3 = class80.method525(arg1, -7967, arg2);
        if (var3 != null) {
            for (int var4 = arg0; var4 < var3.field3418.length; ++var4) {
                var3.field3418[var4] = -1;
                var3.field3415[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BII)Z", line = 487)
    private final boolean method93(byte arg0, int arg1, int arg2) {
        ++field199;
        int var4 = (-arg1 + arg2) * this.field189 >> 12;
        if (arg0 > -110) {
            method90((class205) null, -94, (class364) null, (class313) null, (byte) -78, 17);
        }
        int var5 = class461.field6247[(1046657 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field189;
        int var7 = (var6 << 12) / this.field187;
        int var8 = this.field186 * var7 >> 12;
        return ~var8 < ~(arg1 + arg2) && ~(-var8) > ~(arg1 + arg2);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIBIILdg;IIII)Z", line = 505)
    public static final boolean method94(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, class261 arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field198;
        int var12 = arg11;
        int var13 = arg10;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg11 - var14;
        int var17 = -var15 + arg10;
        class65.field860[var14][var15] = 99;
        class173.field2376[var14][var15] = 0;
        byte var18 = 0;
        class68.field933[var18] = arg11;
        int var19 = 0;
        int var35 = var18 + 1;
        class203.field2752[var18] = arg10;
        int[][] var20 = arg7.field3454;
        if (arg4 <= 103) {
            return false;
        } else {
            while (true) {
                label284: while (true) {
                    int var21;
                    int var22;
                    int var23;
                    int var24;
                    int var26;
                    do {
                        do {
                            do {
                                label261: do {
                                    if (var35 == var19) {
                                        class216.field2911 = var12;
                                        class114.field1712 = var13;
                                        return false;
                                    }
                                    var12 = class68.field933[var19];
                                    var13 = class203.field2752[var19];
                                    var19 = var19 + 1 & 4095;
                                    var21 = -var17 + var13;
                                    var22 = -var16 + var12;
                                    var23 = var12 - arg7.field3451;
                                    var24 = -arg7.field3469 + var13;
                                    if (arg0 != -4) {
                                        if (~arg0 != 2) {
                                            if (arg0 != -2) {
                                                if (~arg0 != 0) {
                                                    if (arg0 != 0 && arg0 != 1 && arg0 != 2 && ~arg0 != -4 && arg0 != 9) {
                                                        if (arg7.method1473(arg3, arg1, var13, var12, arg0, 19348, arg5, arg6)) {
                                                            class216.field2911 = var12;
                                                            class114.field1712 = var13;
                                                            return true;
                                                        }
                                                    } else if (arg7.method1472(arg1, arg6, true, arg0, arg5, arg3, var13, var12)) {
                                                        class216.field2911 = var12;
                                                        class114.field1712 = var13;
                                                        return true;
                                                    }
                                                } else if (arg7.method1483(arg2, arg6, arg8, var12, arg5, 4321, arg9, var13, arg1)) {
                                                    class114.field1712 = var13;
                                                    class216.field2911 = var12;
                                                    return true;
                                                }
                                            } else if (arg7.method1480(arg8, var12, 23160, arg5, arg1, arg2, arg6, var13, arg1, arg9)) {
                                                class216.field2911 = var12;
                                                class114.field1712 = var13;
                                                return true;
                                            }
                                        } else if (class27.method160(arg8, var13, arg5, var12, -50, arg6, arg1, arg9, arg1)) {
                                            class216.field2911 = var12;
                                            class114.field1712 = var13;
                                            return true;
                                        }
                                    } else if (~arg6 == ~var12 && arg5 == var13) {
                                        class216.field2911 = var12;
                                        class114.field1712 = var13;
                                        return true;
                                    }
                                    var26 = class173.field2376[var22][var21] + 1;
                                    if (var22 > 0 && class65.field860[var22 - 1][var21] == 0 && (var20[var23 + -1][var24] & 1134821376) == 0 && (var20[var23 + -1][var24 - -arg1 + -1] & 1310982144) == 0) {
                                        int var27 = 1;
                                        while (true) {
                                            if (~(arg1 + -1) >= ~var27) {
                                                class68.field933[var35] = var12 + -1;
                                                class203.field2752[var35] = var13;
                                                var35 = var35 + 1 & 4095;
                                                class65.field860[var22 + -1][var21] = 2;
                                                class173.field2376[var22 + -1][var21] = var26;
                                                break;
                                            }
                                            if ((1336147968 & var20[var23 + -1][var24 - -var27]) != 0) {
                                                break;
                                            }
                                            ++var27;
                                        }
                                    }
                                    if (var22 < 128 - arg1 && ~class65.field860[var22 - -1][var21] == -1 && ~(var20[arg1 + var23][var24] & 1625554944) == -1 && (2015625216 & var20[var23 - -arg1][var24 - (-arg1 - -1)]) == 0) {
                                        int var28 = 1;
                                        while (true) {
                                            if (~var28 <= ~(arg1 + -1)) {
                                                class68.field933[var35] = var12 + 1;
                                                class203.field2752[var35] = var13;
                                                class65.field860[var22 + 1][var21] = 8;
                                                var35 = var35 + 1 & 4095;
                                                class173.field2376[var22 - -1][var21] = var26;
                                                break;
                                            }
                                            if ((2028208128 & var20[arg1 + var23][var24 - -var28]) != 0) {
                                                break;
                                            }
                                            ++var28;
                                        }
                                    }
                                    if (var21 > 0 && ~class65.field860[var22][var21 + -1] == -1 && ~(var20[var23][var24 + -1] & 1134821376) == -1 && ~(1625554944 & var20[var23 - -arg1 - 1][var24 + -1]) == -1) {
                                        int var29 = 1;
                                        while (true) {
                                            if (arg1 + -1 <= var29) {
                                                class68.field933[var35] = var12;
                                                class203.field2752[var35] = var13 + -1;
                                                var35 = 4095 & var35 + 1;
                                                class65.field860[var22][var21 + -1] = 1;
                                                class173.field2376[var22][var21 + -1] = var26;
                                                break;
                                            }
                                            if ((var20[var23 + var29][var24 + -1] & 1675886592) != 0) {
                                                break;
                                            }
                                            ++var29;
                                        }
                                    }
                                    if (var21 < -arg1 + 128 && ~class65.field860[var22][var21 + 1] == -1 && ~(var20[var23][var24 - -arg1] & 1310982144) == -1 && ~(2015625216 & var20[arg1 + -1 + var23][arg1 + var24]) == -1) {
                                        int var30 = 1;
                                        while (true) {
                                            if (arg1 + -1 <= var30) {
                                                class68.field933[var35] = var12;
                                                class203.field2752[var35] = var13 + 1;
                                                class65.field860[var22][var21 + 1] = 4;
                                                var35 = var35 + 1 & 4095;
                                                class173.field2376[var22][var21 + 1] = var26;
                                                break;
                                            }
                                            if ((2116288512 & var20[var23 + var30][var24 - -arg1]) != 0) {
                                                break;
                                            }
                                            ++var30;
                                        }
                                    }
                                    if (var22 > 0 && ~var21 < -1 && class65.field860[var22 + -1][var21 + -1] == 0 && (var20[var23 + -1][var24 - 1] & 1134821376) == 0) {
                                        int var31 = 1;
                                        while (true) {
                                            if (arg1 <= var31) {
                                                class68.field933[var35] = var12 + -1;
                                                class203.field2752[var35] = var13 + -1;
                                                class65.field860[var22 - 1][var21 + -1] = 3;
                                                var35 = var35 + 1 & 4095;
                                                class173.field2376[var22 + -1][var21 + -1] = var26;
                                                break;
                                            }
                                            if ((1336147968 & var20[var23 + -1][-1 - -var31 + var24]) != 0 || (1675886592 & var20[var31 + -1 + var23][var24 + -1]) != 0) {
                                                break;
                                            }
                                            ++var31;
                                        }
                                    }
                                    if (-arg1 + 128 > var22 && ~var21 < -1 && ~class65.field860[var22 + 1][var21 + -1] == -1 && ~(1625554944 & var20[arg1 + var23][var24 + -1]) == -1) {
                                        int var32 = 1;
                                        while (true) {
                                            if (~var32 <= ~arg1) {
                                                class68.field933[var35] = var12 + 1;
                                                class203.field2752[var35] = var13 + -1;
                                                class65.field860[var22 - -1][var21 + -1] = 9;
                                                var35 = 4095 & var35 + 1;
                                                class173.field2376[var22 - -1][var21 + -1] = var26;
                                                break;
                                            }
                                            if ((2028208128 & var20[arg1 + var23][var24 + -1 + var32]) != 0 || (1675886592 & var20[var23 + var32][var24 - 1]) != 0) {
                                                break;
                                            }
                                            ++var32;
                                        }
                                    }
                                    if (~var22 < -1 && var21 < -arg1 + 128 && ~class65.field860[var22 - 1][var21 + 1] == -1 && ~(1310982144 & var20[var23 + -1][arg1 + var24]) == -1) {
                                        for (int var33 = 1; var33 < arg1; ++var33) {
                                            if ((1336147968 & var20[var23 + -1][var24 - -var33]) != 0 || ~(2116288512 & var20[var23 + var33 + -1][arg1 + var24]) != -1) {
                                                continue label261;
                                            }
                                        }
                                        class68.field933[var35] = var12 + -1;
                                        class203.field2752[var35] = var13 + 1;
                                        var35 = 4095 & var35 - -1;
                                        class65.field860[var22 + -1][var21 + 1] = 6;
                                        class173.field2376[var22 - 1][var21 + 1] = var26;
                                    }
                                } while (~(128 - arg1) >= ~var22);
                            } while (~var21 <= ~(128 - arg1));
                        } while (class65.field860[var22 + 1][var21 + 1] != 0);
                    } while ((2015625216 & var20[arg1 + var23][arg1 + var24]) != 0);
                    for (int var34 = 1; ~arg1 < ~var34; ++var34) {
                        if (~(var20[var23 + var34][arg1 + var24] & 2116288512) != -1 || (var20[arg1 + var23][var24 - -var34] & 2028208128) != 0) {
                            continue label284;
                        }
                    }
                    class68.field933[var35] = var12 + 1;
                    class203.field2752[var35] = var13 + 1;
                    class65.field860[var22 + 1][var21 - -1] = 12;
                    var35 = var35 + 1 & 4095;
                    class173.field2376[var22 + 1][var21 + 1] = var26;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lbt;I)Ljq;", line = 952)
    public static final class326 method95(class32 arg0, int arg1) {
        arg0.method201((byte) -107);
        ++field192;
        int var2 = arg0.method201((byte) -105);
        class326 var3 = class123.method758(var2, (byte) -104);
        var3.field4352 = arg0.method201((byte) -120);
        int var4 = arg0.method201((byte) -126);
        for (int var5 = arg1; ~var5 > ~var4; ++var5) {
            int var6 = arg0.method201((byte) -115);
            var3.method33(var6, arg0, -83);
        }
        var3.method65(-103);
        return var3;
    }
}
