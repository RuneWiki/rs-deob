import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class18 extends class223 {

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "I")
    private int field245 = 4096;

    @OriginalMember(owner = "client!sl", name = "W", descriptor = "I")
    private int field252 = 4096;

    @OriginalMember(owner = "client!sl", name = "M", descriptor = "I")
    private int field242 = 4096;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!sl", name = "T", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!sl", name = "U", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "Lbc;")
    public static class182 field243;

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "Lub;")
    public static class92 field244;

    @OriginalMember(owner = "client!sl", name = "V", descriptor = "[Lej;")
    public static class51[] field251;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIII)V")
    public static final void method133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field248;
        int var6 = -arg4 + arg3;
        int var7 = -arg5 + arg0;
        if (var7 != 0) {
            if (var6 == 0) {
                class76.method602(arg5, arg4, arg0, arg1, (byte) -41);
            } else {
                if (~var6 > -1) {
                    var6 = -var6;
                }
                if (var7 < 0) {
                    var7 = -var7;
                }
                boolean var8 = ~var6 < ~var7;
                if (var8) {
                    int var9 = arg5;
                    arg5 = arg4;
                    arg4 = var9;
                    int var10 = arg0;
                    arg0 = arg3;
                    arg3 = var10;
                }
                if (~arg5 < ~arg0) {
                    int var11 = arg4;
                    int var12 = arg5;
                    arg5 = arg0;
                    arg4 = arg3;
                    arg3 = var11;
                    arg0 = var12;
                }
                int var13 = arg4;
                int var14 = 76 / (arg2 / 58);
                int var15 = -arg5 + arg0;
                int var16 = -arg4 + arg3;
                if (~var16 > -1) {
                    var16 = -var16;
                }
                int var17 = -(var15 >> 1);
                int var18 = ~arg4 <= ~arg3 ? -1 : 1;
                if (!var8) {
                    for (int var19 = arg5; ~arg0 <= ~var19; ++var19) {
                        class55.field872[var13][var19] = arg1;
                        var17 += var16;
                        if (~var17 < -1) {
                            var13 += var18;
                            var17 -= var15;
                        }
                    }
                } else {
                    for (int var20 = arg5; ~var20 >= ~arg0; ++var20) {
                        class55.field872[var20][var13] = arg1;
                        var17 += var16;
                        if (~var17 < -1) {
                            var13 += var18;
                            var17 -= var15;
                        }
                    }
                }
            }
        } else {
            if (~var6 != -1) {
                class170.method1224(arg4, (byte) -36, arg1, arg5, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method134(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class235.field3716 * 128) {
            arg0 = class235.field3716 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class291.field4515 * 128) {
            arg2 = class291.field4515 * 128 - 1;
        }
        class39.field662 = class224.field3601[arg3];
        class257.field4092 = class224.field3597[arg3];
        class31.field573 = class224.field3601[arg4];
        class239.field3770 = class224.field3597[arg4];
        class42.field713 = arg0;
        class178.field2736 = arg1;
        class14.field178 = arg2;
        class239.field3781 = arg0 / 128;
        class150.field2230 = arg2 / 128;
        class180.field2820 = class239.field3781 - class232.field3669;
        if (class180.field2820 < 0) {
            class180.field2820 = 0;
        }
        class135.field2022 = class150.field2230 - class232.field3669;
        if (class135.field2022 < 0) {
            class135.field2022 = 0;
        }
        class22.field369 = class239.field3781 + class232.field3669;
        if (class22.field369 > class235.field3716) {
            class22.field369 = class235.field3716;
        }
        class56.field888 = class232.field3669 + class150.field2230;
        if (class56.field888 > class291.field4515) {
            class56.field888 = class291.field4515;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class232.field3669 + class232.field3669 + 2; ++var16) {
            for (int var19 = 0; var19 < class232.field3669 + class232.field3669 + 2; ++var19) {
                int var20 = (var16 - class232.field3669 << 7) - (class42.field713 & 127);
                int var21 = (var19 - class232.field3669 << 7) - (class14.field178 & 127);
                int var22 = class239.field3781 - class232.field3669 + var16;
                int var23 = class150.field2230 - class232.field3669 + var19;
                if (var22 >= 0 && var23 >= 0 && var22 < class235.field3716 && var23 < class291.field4515) {
                    int var24;
                    if (class166.field2507 != null) {
                        var24 = class166.field2507[0][var22][var23] - class178.field2736 + 128;
                    } else {
                        var24 = class303.field4876[0][var22][var23] - class178.field2736 + 128;
                    }
                    int var25 = class303.field4876[3][var22][var23] - class178.field2736 - 1000;
                    class247.field3926[var16][var19] = class163.method1180(var20, var25, var24, var21, var15);
                } else {
                    class247.field3926[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class232.field3669 + class232.field3669 + 1; ++var17) {
            for (int var18 = 0; var18 < class232.field3669 + class232.field3669 + 1; ++var18) {
                class35.field617[var17][var18] = class247.field3926[var17][var18] || class247.field3926[var17 + 1][var18] || class247.field3926[var17][var18 + 1] || class247.field3926[var17 + 1][var18 + 1];
            }
        }
        class92.field1476 = arg6;
        class159.field2376 = arg7;
        class45.field763 = arg8;
        class300.field4824 = arg9;
        class231.field3650 = arg10;
        class136.method1017();
        if (class133.field1999 != null) {
            class291.method1935(true);
            class129.method955(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class291.method1935(false);
        }
        class129.method955(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)[[I")
    public final int[][] method135(int arg0, int arg1) {
        if (arg0 < 0) {
            field244 = null;
        }
        int[][] var3 = super.field3572.method1818(arg1, false);
        if (super.field3572.field4257) {
            int[][] var4 = this.method1534(false, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var3[0];
            for (int var11 = 0; ~class250.field4008 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 == var13 && var13 == var14) {
                    var10[var11] = this.field245 * var12 >> 12;
                    var9[var11] = this.field252 * var13 >> 12;
                    var8[var11] = this.field242 * var14 >> 12;
                } else {
                    var10[var11] = this.field245;
                    var9[var11] = this.field252;
                    var8[var11] = this.field242;
                }
            }
        }
        ++field246;
        return var3;
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(III)V")
    public static final void method136(int arg0, int arg1, int arg2) {
        if (~class250.field4008 != ~arg1) {
            class106.field1662 = new int[arg1];
            for (int var3 = 0; ~arg1 < ~var3; ++var3) {
                class106.field1662[var3] = (var3 << 12) / arg1;
            }
            class194.field3029 = arg1 * 32;
            class280.field4430 = arg1 + -1;
            class250.field4008 = arg1;
        }
        ++field247;
        if (arg0 != 1) {
            field244 = null;
        }
        if (class172.field2654 != arg2) {
            if (class250.field4008 != arg2) {
                class307.field4925 = new int[arg2];
                for (int var4 = 0; arg2 > var4; ++var4) {
                    class307.field4925[var4] = (var4 << 12) / arg2;
                }
            } else {
                class307.field4925 = class106.field1662;
            }
            class172.field2654 = arg2;
            class75.field1168 = arg2 + -1;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIII)V")
    public static final void method137(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field240;
        if (arg1 > -121) {
            field251 = null;
        }
        for (int var5 = 0; ~var5 > ~class126.field1895; ++var5) {
            if (class86.field1281[var5] - -class185.field2917[var5] > arg4 && class86.field1281[var5] < arg3 + arg4 && ~(class281.field4437[var5] + class108.field1680[var5]) < ~arg0 && ~(arg0 + arg2) < ~class108.field1680[var5]) {
                class247.field3933[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
    public class18() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(Z)V")
    public static final void method138(boolean arg0) {
        if (!arg0) {
            class290.field4508.method1169(true);
            class126.field1897.method1169(true);
            ++field249;
        }
    }

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "(I)V")
    public static void method139(int arg0) {
        field244 = null;
        field243 = null;
        if (arg0 == 0) {
            field251 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field242 = arg0.method260((byte) -67);
                }
            } else {
                this.field252 = arg0.method260((byte) -67);
            }
        } else {
            this.field245 = arg0.method260((byte) -67);
        }
        if (arg2 == 102) {
            ++field250;
        }
    }

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "(I)V")
    public static final void method140(int arg0) {
        class238.field3751.method1172((byte) 116);
        if (arg0 >= -112) {
            field244 = null;
        }
        ++field241;
    }
}
