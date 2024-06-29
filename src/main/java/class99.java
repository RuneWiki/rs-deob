import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class99 extends class37 {

    @OriginalMember(owner = "client!ka", name = "ab", descriptor = "I")
    private int field2179 = 4096;

    @OriginalMember(owner = "client!ka", name = "bb", descriptor = "I")
    private int field2180 = 0;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
    public static volatile int field2171 = 0;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "I")
    public static int field2173 = -1;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "Ldd;")
    public static class35 field2172 = class180.method1196((byte) -20, "<img=1>");

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "Ldd;")
    public static class35 field2178 = class180.method1196((byte) 127, "");

    @OriginalMember(owner = "client!ka", name = "cb", descriptor = "I")
    public static int field2181 = 0;

    @OriginalMember(owner = "client!ka", name = "jb", descriptor = "Ldd;")
    private static class35 field2188 = class180.method1196((byte) 126, "Please contact customer support)3");

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "Ldd;")
    private static class35 field2170 = class180.method1196((byte) 126, "Location");

    @OriginalMember(owner = "client!ka", name = "eb", descriptor = "Ldd;")
    public static class35 field2183 = field2170;

    @OriginalMember(owner = "client!ka", name = "fb", descriptor = "Ldd;")
    public static class35 field2184 = field2188;

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!ka", name = "Y", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!ka", name = "db", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!ka", name = "gb", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!ka", name = "ib", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!ka", name = "kb", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "Lhf;")
    public static class76 field2176;

    @OriginalMember(owner = "client!ka", name = "hb", descriptor = "[I")
    public static int[] field2186;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "[Lbg;")
    public static class18[] field2169;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(B)V")
    public static void method745(byte arg0) {
        field2178 = null;
        field2188 = null;
        field2169 = null;
        field2172 = null;
        field2186 = null;
        field2184 = null;
        field2176 = null;
        int var1 = -13 % ((-15 - arg0) / 40);
        field2183 = null;
        field2170 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field2189;
        if (arg0 != 75) {
            field2171 = 38;
        }
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (super.field816.field3661) {
            int[] var4 = this.method369(0, arg1, (byte) 124);
            for (int var5 = 0; var5 < class72.field1719; ++var5) {
                int var6 = var4[var5];
                if (this.field2180 <= var6) {
                    if (~var6 < ~this.field2179) {
                        var3[var5] = this.field2179;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field2180;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        ++field2182;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field825 = arg2.method221(-88) == 1;
                }
            } else {
                this.field2179 = arg2.method256((byte) -78);
            }
        } else {
            this.field2180 = arg2.method256((byte) -78);
        }
        if (arg1 != 1) {
            this.method1(-54, 101, (class26) null);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[Lfd;)V")
    public static final void method746(int arg0, int arg1, class55[] arg2) {
        for (int var3 = 0; var3 < arg2.length; ++var3) {
            class55 var4 = arg2[var3];
            if (var4 != null && var4.field1368 == arg0 && (!var4.field1291 || !class203.method1345(var4, 256))) {
                if (var4.field1355 == 0) {
                    if (!var4.field1291 && class203.method1345(var4, 256) && class132.field2839 != var4) {
                        continue;
                    }
                    method746(var4.field1383, -1, arg2);
                    if (var4.field1245 != null) {
                        method746(var4.field1383, -1, var4.field1245);
                    }
                    class195 var5 = (class195) class22.field445.method796(true, (long) var4.field1383);
                    if (var5 != null) {
                        class49.method438((byte) -127, var5.field3884);
                    }
                }
                if (~var4.field1355 == -7) {
                    if (var4.field1303 != -1 || var4.field1345 != -1) {
                        boolean var6 = class182.method1213(var4, (byte) -27);
                        int var7;
                        if (!var6) {
                            var7 = var4.field1303;
                        } else {
                            var7 = var4.field1345;
                        }
                        if (~var7 != 0) {
                            class52 var8 = class160.method1070((byte) -26, var7);
                            if (var8 != null) {
                                var4.field1289 += class129.field2782;
                                while (var4.field1289 > var8.field1159[var4.field1240]) {
                                    var4.field1289 -= var8.field1159[var4.field1240];
                                    ++var4.field1240;
                                    if (var4.field1240 >= var8.field1184.length) {
                                        var4.field1240 -= var8.field1185;
                                        if (~var4.field1240 > -1 || var4.field1240 >= var8.field1184.length) {
                                            var4.field1240 = 0;
                                        }
                                    }
                                    class137.method937(var4, (byte) -85);
                                }
                            }
                        }
                    }
                    if (~var4.field1349 != -1 && !var4.field1291) {
                        int var9 = var4.field1349 >> 16;
                        int var10 = class129.field2782 * var9;
                        int var11 = var4.field1349 << 16 >> 16;
                        int var12 = class129.field2782 * var11;
                        var4.field1323 = 2047 & var4.field1323 - -var12;
                        var4.field1304 = var4.field1304 + var10 & 2047;
                        class137.method937(var4, (byte) -85);
                    }
                }
            }
        }
        if (arg1 != -1) {
            method748((class8) null, -8);
        }
        ++field2185;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field2187;
        if (arg1 <= 5) {
            field2186 = null;
        }
        int[][] var3 = super.field832.method653(-30711, arg0);
        if (super.field832.field1978) {
            int[][] var4 = this.method370(arg0, 0, 3);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class72.field1719; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 > ~this.field2180) {
                    var8[var11] = this.field2180;
                } else if (~this.field2179 <= ~var12) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field2179;
                }
                if (~var13 > ~this.field2180) {
                    var9[var11] = this.field2180;
                } else if (~var13 >= ~this.field2179) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field2179;
                }
                if (~this.field2180 >= ~var14) {
                    if (this.field2179 >= var14) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field2179;
                    }
                } else {
                    var10[var11] = this.field2180;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIB)V")
    public static final void method747(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field2177;
        if (arg4 > 20) {
            for (int var5 = arg0; arg0 + arg3 >= var5; ++var5) {
                for (int var6 = arg2; ~(arg2 - -arg1) <= ~var6; ++var6) {
                    if (var6 >= 0 && var6 < 104 && ~var5 <= -1 && ~var5 > -105) {
                        class92.field2050[0][var6][var5] = 127;
                        if (~arg2 == ~var6 && ~var6 < -1) {
                            class206.field4109[0][var6][var5] = class206.field4109[0][var6 + -1][var5];
                        }
                        if (arg1 + arg2 == var6 && var6 < 103) {
                            class206.field4109[0][var6][var5] = class206.field4109[0][var6 + 1][var5];
                        }
                        if (~arg0 == ~var5 && ~var5 < -1) {
                            class206.field4109[0][var6][var5] = class206.field4109[0][var6][var5 + -1];
                        }
                        if (arg0 + arg3 == var5 && var5 < 103) {
                            class206.field4109[0][var6][var5] = class206.field4109[0][var6][var5 + 1];
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
    public class99() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lag;I)V")
    public static final void method748(class8 arg0, int arg1) {
        if (arg1 < -39) {
            ++field2175;
            class100.field2203 = arg0;
        }
    }
}
