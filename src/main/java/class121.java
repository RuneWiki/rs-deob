import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class121 extends class288 {

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
    private int field2034 = 4096;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "Z")
    private boolean field2040 = true;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
    public static int field2038 = 0;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
    public static int field2042 = 100;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "F")
    public static float field2039 = 0.0F;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field2040 = ~arg0.method1779(-52) == -2;
            }
        } else {
            this.field2034 = arg0.method1777(-107);
        }
        if (arg1 == -19) {
            ++field2043;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method849(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class236.field3769 * 128) {
            arg0 = class236.field3769 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class77.field1061 * 128) {
            arg2 = class77.field1061 * 128 - 1;
        }
        class296.field4680 = class145.field2338[arg3];
        class250.field4008 = class145.field2348[arg3];
        class236.field3777 = class145.field2338[arg4];
        class8.field117 = class145.field2348[arg4];
        class209.field3435 = arg0;
        class243.field3896 = arg1;
        class30.field365 = arg2;
        class177.field2861 = arg0 / 128;
        class21.field265 = arg2 / 128;
        class136.field2265 = class177.field2861 - class54.field771;
        if (class136.field2265 < 0) {
            class136.field2265 = 0;
        }
        class222.field3532 = class21.field265 - class54.field771;
        if (class222.field3532 < 0) {
            class222.field3532 = 0;
        }
        class100.field1523 = class54.field771 + class177.field2861;
        if (class100.field1523 > class236.field3769) {
            class100.field1523 = class236.field3769;
        }
        class258.field4119 = class54.field771 + class21.field265;
        if (class258.field4119 > class77.field1061) {
            class258.field4119 = class77.field1061;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class54.field771 + class54.field771 + 2; ++var16) {
            for (int var19 = 0; var19 < class54.field771 + class54.field771 + 2; ++var19) {
                int var20 = (var16 - class54.field771 << 7) - (class209.field3435 & 127);
                int var21 = (var19 - class54.field771 << 7) - (class30.field365 & 127);
                int var22 = class177.field2861 - class54.field771 + var16;
                int var23 = class21.field265 - class54.field771 + var19;
                if (var22 >= 0 && var23 >= 0 && var22 < class236.field3769 && var23 < class77.field1061) {
                    int var24;
                    if (class240.field3846 != null) {
                        var24 = class240.field3846[0][var22][var23] - class243.field3896 + 128;
                    } else {
                        var24 = class34.field423[0][var22][var23] - class243.field3896 + 128;
                    }
                    int var25 = class34.field423[3][var22][var23] - class243.field3896 - 1000;
                    class262.field4152[var16][var19] = class171.method1196(var20, var25, var24, var21, var15);
                } else {
                    class262.field4152[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class54.field771 + class54.field771 + 1; ++var17) {
            for (int var18 = 0; var18 < class54.field771 + class54.field771 + 1; ++var18) {
                class259.field4124[var17][var18] = class262.field4152[var17][var18] || class262.field4152[var17 + 1][var18] || class262.field4152[var17][var18 + 1] || class262.field4152[var17 + 1][var18 + 1];
            }
        }
        class95.field1418 = arg6;
        class18.field216 = arg7;
        class256.field4097 = arg8;
        class66.field931 = arg9;
        class271.field4385 = arg10;
        class203.method1365();
        if (class155.field2492 != null) {
            class55.method423(true);
            class171.method1197(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class55.method423(false);
        }
        class171.method1197(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(II)V")
    public static final void method850(int arg0, int arg1) {
        if (arg1 != -2) {
            method849(-21, 42, -72, -65, 81, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -80, (byte) -55, 49, -78);
        }
        ++field2037;
        class197.field3176.method1832(arg0, (byte) -87);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method851(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg5) {
            ++field2035;
            if (arg2 <= client.field3617 && arg0 >= class156.field2507) {
                boolean var6;
                if (arg1 >= class58.field817) {
                    if (~arg1 < ~field2042) {
                        arg1 = field2042;
                        var6 = false;
                    } else {
                        var6 = true;
                    }
                } else {
                    arg1 = class58.field817;
                    var6 = false;
                }
                boolean var7;
                if (arg3 < class58.field817) {
                    arg3 = class58.field817;
                    var7 = false;
                } else if (~field2042 <= ~arg3) {
                    var7 = true;
                } else {
                    arg3 = field2042;
                    var7 = false;
                }
                if (~arg2 > ~class156.field2507) {
                    arg2 = class156.field2507;
                } else {
                    class168.method1184(128, arg3, arg1, arg4, class85.field1162[arg2++]);
                }
                if (client.field3617 < arg0) {
                    arg0 = client.field3617;
                } else {
                    class168.method1184(128, arg3, arg1, arg4, class85.field1162[arg0--]);
                }
                if (var6 && var7) {
                    for (int var8 = arg2; arg0 >= var8; ++var8) {
                        int[] var9 = class85.field1162[var8];
                        var9[arg1] = var9[arg3] = arg4;
                    }
                } else {
                    if (!var6) {
                        if (var7) {
                            for (int var10 = arg2; ~var10 >= ~arg0; ++var10) {
                                class85.field1162[var10][arg3] = arg4;
                            }
                            return;
                        }
                    } else {
                        for (int var11 = arg2; var11 <= arg0; ++var11) {
                            class85.field1162[var11][arg1] = arg4;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class121() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)[[I")
    public final int[][] method34(int arg0, int arg1) {
        ++field2036;
        if (arg0 != 1) {
            this.method34(115, 64);
        }
        int[][] var3 = super.field4598.method812(arg1, arg0 ^ 65534);
        if (super.field4598.field1954) {
            int[] var4 = this.method1931((byte) -124, 0, arg1 + -1 & class144.field2332);
            int[] var5 = this.method1931((byte) -119, 0, arg1);
            int[] var6 = this.method1931((byte) -128, 0, class144.field2332 & arg1 + 1);
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            for (int var10 = 0; ~var10 > ~class186.field2986; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field2034;
                int var12 = (var5[var10 + 1 & class34.field422] - var5[var10 + -1 & class34.field422]) * this.field2034;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 - -4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = var11 / var17;
                    var19 = var12 / var17;
                    var20 = 16777216 / var17;
                } else {
                    var19 = 0;
                    var20 = 0;
                    var18 = 0;
                }
                if (this.field2040) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var9[var10] = var19;
                var7[var10] = var18;
                var8[var10] = var20;
            }
        }
        return var3;
    }
}
