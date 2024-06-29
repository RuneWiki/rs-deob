import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class101 extends class139 {

    @OriginalMember(owner = "client!kf", name = "cb", descriptor = "I")
    private int field2118 = 6;

    @OriginalMember(owner = "client!kf", name = "Z", descriptor = "J")
    public static long field2115 = 0L;

    @OriginalMember(owner = "client!kf", name = "X", descriptor = "Lrf;")
    public static class163 field2113 = class53.method392(104, "Startseite auf (WSpielkonto wiederherstellen(W)3");

    @OriginalMember(owner = "client!kf", name = "ab", descriptor = "Z")
    public static boolean field2116 = false;

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "Lrf;")
    private static class163 field2111 = class53.method392(-72, "Create a free account");

    @OriginalMember(owner = "client!kf", name = "eb", descriptor = "Lrf;")
    public static class163 field2120 = field2111;

    @OriginalMember(owner = "client!kf", name = "fb", descriptor = "Z")
    public static boolean field2121 = false;

    @OriginalMember(owner = "client!kf", name = "W", descriptor = "Lge;")
    public static class65 field2112 = new class65(4096);

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!kf", name = "Y", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!kf", name = "bb", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!kf", name = "db", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!kf", name = "gb", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field2122;
        if (arg1 != 7451) {
            field2112 = null;
        }
        int[] var3 = super.field2859.method1319(-123, arg0);
        if (super.field2859.field3966) {
            int[] var4 = this.method917(arg0, 0, true);
            int[] var5 = this.method917(arg0, 1, true);
            for (int var6 = 0; ~var6 > ~class23.field402; ++var6) {
                var3[var6] = this.method689(var4[var6], arg1 + -3355, var5[var6]);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        ++field2110;
        int[][] var3 = super.field2866.method259(arg1, -2);
        if (arg0 < 53) {
            method691((byte) 96);
        }
        if (super.field2866.field885) {
            int[][] var4 = this.method910((byte) -94, arg1, 0);
            int[][] var5 = this.method910((byte) -98, arg1, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var4[2];
            int[] var11 = var4[0];
            int[] var12 = var5[0];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            for (int var15 = 0; ~var15 > ~class23.field402; ++var15) {
                var6[var15] = this.method689(var11[var15], 4096, var12[var15]);
                var9[var15] = this.method689(var8[var15], 4096, var14[var15]);
                var7[var15] = this.method689(var10[var15], 4096, var13[var15]);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field2872 = ~arg2.method344(255) == -2;
            }
        } else {
            this.field2118 = arg2.method344(255);
        }
        if (arg1 == 21) {
            ++field2119;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)I")
    private final int method689(int arg0, int arg1, int arg2) {
        ++field2117;
        if (arg1 != 4096) {
            method692(-13, 12, (byte[]) null, (class131[]) null, -107);
        }
        int var4 = this.field2118;
        if (var4 != 1) {
            if (var4 != 2) {
                if (~var4 != -4) {
                    if (~var4 != -5) {
                        if (var4 != 5) {
                            if (var4 != 6) {
                                if (~var4 != -8) {
                                    if (var4 != 8) {
                                        if (var4 != 9) {
                                            if (~var4 != -11) {
                                                if (~var4 != -12) {
                                                    return var4 == 12 ? arg0 + arg2 + -(arg0 * arg2 >> 11) : arg0;
                                                } else {
                                                    return ~arg2 <= ~arg0 ? -arg0 + arg2 : arg0 - arg2;
                                                }
                                            } else {
                                                return ~arg0 < ~arg2 ? arg0 : arg2;
                                            }
                                        } else {
                                            return ~arg0 <= ~arg2 ? arg2 : arg0;
                                        }
                                    } else {
                                        return arg0 == 0 ? 0 : -((4096 - arg2 << 12) / arg0) + 4096;
                                    }
                                } else {
                                    return arg0 != 4096 ? (arg2 << 12) / (-arg0 + 4096) : 4096;
                                }
                            } else {
                                return arg2 >= 2048 ? 4096 - ((-arg0 + 4096) * (-arg2 + 4096) >> 11) : arg0 * arg2 >> 11;
                            }
                        } else {
                            return -((4096 - arg0) * (-arg2 + 4096) >> 12) + 4096;
                        }
                    } else {
                        return arg2 != 0 ? (arg0 << 12) / arg2 : 4096;
                    }
                } else {
                    return arg0 * arg2 >> 12;
                }
            } else {
                return -arg2 + arg0;
            }
        } else {
            return arg0 + arg2;
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
    public class101() {
        super(2, false);
    }

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "(B)V")
    public static void method690(byte arg0) {
        field2113 = null;
        int var1 = -119 % ((-71 - arg0) / 53);
        field2112 = null;
        field2111 = null;
        field2120 = null;
    }

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "(B)V")
    public static final void method691(byte arg0) {
        ++field2109;
        class102.field2145.method222(108);
        for (int var1 = 0; var1 < 32; ++var1) {
            class103.field2169[var1] = 0L;
        }
        int var2 = -66 % ((arg0 - -37) / 33);
        for (int var3 = 0; ~var3 > -33; ++var3) {
            class88.field1927[var3] = 0L;
        }
        class109.field2315 = 0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II[B[Loa;I)V")
    public static final void method692(int arg0, int arg1, byte[] arg2, class131[] arg3, int arg4) {
        ++field2114;
        int var5 = -1;
        class52 var6 = new class52(arg2);
        if (arg4 != 2) {
            field2111 = null;
        }
        while (true) {
            int var7 = var6.method368(0);
            if (var7 == 0) {
                return;
            }
            int var8 = 0;
            var5 += var7;
            while (true) {
                int var9 = var6.method354((byte) 87);
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = 63 & var8;
                int var11 = 63 & var8 >> 6;
                int var12 = var8 >> 12;
                int var13 = var6.method344(255);
                int var14 = var13 >> 2;
                int var15 = 3 & var13;
                int var16 = arg1 + var11;
                int var17 = var10 - -arg0;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    class131 var19 = null;
                    if ((2 & class21.field372[1][var16][var17]) == 2) {
                        var18 = var12 - 1;
                    }
                    if (~var18 <= -1) {
                        var19 = arg3[var18];
                    }
                    class82.method548(var14, (byte) -4, var5, var12, var15, var17, var16, var19);
                }
            }
        }
    }
}
