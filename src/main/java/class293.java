import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class293 extends class84 {

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
    private int field4652 = 4;

    @OriginalMember(owner = "client!pl", name = "T", descriptor = "I")
    private int field4657 = 4;

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "I")
    public static volatile int field4650 = 0;

    @OriginalMember(owner = "client!pl", name = "V", descriptor = "Ljava/lang/String;")
    public static String field4659 = null;

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!pl", name = "P", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!pl", name = "Q", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!pl", name = "R", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!pl", name = "S", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!pl", name = "U", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!pl", name = "W", descriptor = "Llc;")
    public static class86 field4660;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1985(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class106.field1537 * 128) {
            arg0 = class106.field1537 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class232.field3724 * 128) {
            arg2 = class232.field3724 * 128 - 1;
        }
        class265.field4298 = class47.field679[arg3];
        class86.field1251 = class47.field695[arg3];
        class114.field1651 = class47.field679[arg4];
        class62.field925 = class47.field695[arg4];
        class204.field3277 = arg0;
        class244.field3960 = arg1;
        class108.field1566 = arg2;
        class24.field278 = arg0 / 128;
        class52.field768 = arg2 / 128;
        class181.field2916 = class24.field278 - class263.field4276;
        if (class181.field2916 < 0) {
            class181.field2916 = 0;
        }
        class288.field4574 = class52.field768 - class263.field4276;
        if (class288.field4574 < 0) {
            class288.field4574 = 0;
        }
        class76.field1091 = class263.field4276 + class24.field278;
        if (class76.field1091 > class106.field1537) {
            class76.field1091 = class106.field1537;
        }
        class133.field2192 = class52.field768 + class263.field4276;
        if (class133.field2192 > class232.field3724) {
            class133.field2192 = class232.field3724;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class263.field4276 + class263.field4276 + 2; ++var16) {
            for (int var19 = 0; var19 < class263.field4276 + class263.field4276 + 2; ++var19) {
                int var20 = (var16 - class263.field4276 << 7) - (class204.field3277 & 127);
                int var21 = (var19 - class263.field4276 << 7) - (class108.field1566 & 127);
                int var22 = class24.field278 - class263.field4276 + var16;
                int var23 = class52.field768 - class263.field4276 + var19;
                if (var22 >= 0 && var23 >= 0 && var22 < class106.field1537 && var23 < class232.field3724) {
                    int var24;
                    if (class241.field3841 != null) {
                        var24 = class241.field3841[0][var22][var23] - class244.field3960 + 128;
                    } else {
                        var24 = class169.field2724[0][var22][var23] - class244.field3960 + 128;
                    }
                    int var25 = class169.field2724[3][var22][var23] - class244.field3960 - 1000;
                    class104.field1516[var16][var19] = class154.method1141(var20, var25, var24, var21, var15);
                } else {
                    class104.field1516[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class263.field4276 + class263.field4276 + 1; ++var17) {
            for (int var18 = 0; var18 < class263.field4276 + class263.field4276 + 1; ++var18) {
                class290.field4603[var17][var18] = class104.field1516[var17][var18] || class104.field1516[var17 + 1][var18] || class104.field1516[var17][var18 + 1] || class104.field1516[var17 + 1][var18 + 1];
            }
        }
        class216.field3427 = arg6;
        class27.field318 = arg7;
        class273.field4387 = arg8;
        class243.field3892 = arg9;
        class62.field901 = arg10;
        class82.method600();
        if (class215.field3420 != null) {
            class222.method1587(true);
            class117.method850(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class222.method1587(false);
        }
        class117.method850(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (arg0 > -125) {
            field4660 = null;
        }
        if (super.field1228.field3651) {
            int var4 = class20.field221 / this.field4652;
            int var5 = class49.field718 / this.field4657;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method612(0, class49.field718 * var6 / var5, false);
            } else {
                var7 = this.method612(0, 0, false);
            }
            for (int var8 = 0; ~class20.field221 < ~var8; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class20.field221 * var9 / var4];
                }
            }
        }
        ++field4656;
        return var3;
    }

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "(I)V")
    public static final void method1986(int arg0) {
        ++field4653;
        class113.field1631 = new class131[class10.field110.method631(-109)][];
        if (arg0 != 0) {
            method1988(23, -80);
        }
        class90.field1339 = new boolean[class10.field110.method631(-108)];
    }

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "(I)V")
    public static void method1987(int arg0) {
        if (arg0 != 2) {
            field4659 = null;
        }
        field4660 = null;
        field4659 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V")
    public static final void method1988(int arg0, int arg1) {
        class201 var2 = class94.method738(-105, arg1, 9);
        if (arg0 < 54) {
            method1988(-122, 14);
        }
        ++field4654;
        var2.method1475(-743577184);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        int[][] var3 = super.field1211.method193((byte) 70, arg0);
        if (arg1 != -18) {
            method1986(-18);
        }
        ++field4655;
        if (super.field1211.field321) {
            int var4 = class20.field221 / this.field4652;
            int var5 = class49.field718 / this.field4657;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method611(0, (byte) -86, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method611(0, (byte) -59, class49.field718 * var7 / var5);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class20.field221 > var14; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class20.field221 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field4657 = arg0.method1111(255);
            }
        } else {
            this.field4652 = arg0.method1111(255);
        }
        if (arg1 < 87) {
            field4650 = 1;
        }
        ++field4658;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V")
    public class293() {
        super(1, false);
    }
}
