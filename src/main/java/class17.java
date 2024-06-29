import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class17 extends class5 {

    @OriginalMember(owner = "client!mda", name = "M", descriptor = "I")
    private int field273 = 6;

    @OriginalMember(owner = "client!mda", name = "H", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!mda", name = "I", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!mda", name = "J", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!mda", name = "K", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!mda", name = "L", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!mda", name = "N", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!mda", name = "O", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILes;I)V", line = 3)
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field120 = ~arg1.method3501(-9268) == -2;
            }
        } else {
            this.field273 = arg1.method3501(-9268);
        }
        if (arg0 == 1) {
            ++field271;
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(II)[I", line = 39)
    public final int[] method39(int arg0, int arg1) {
        ++field275;
        int[] var3 = super.field126.method3280(arg1, true);
        int var4 = -67 % ((arg0 - 81) / 36);
        if (super.field126.field8392) {
            int[] var5 = this.method49(arg1, false, 0);
            int[] var6 = this.method49(arg1, false, 1);
            int var7 = this.field273;
            if (var7 != 1) {
                if (~var7 != -3) {
                    if (var7 != 3) {
                        if (~var7 != -5) {
                            if (~var7 != -6) {
                                if (var7 != 6) {
                                    if (var7 != 7) {
                                        if (var7 != 8) {
                                            if (~var7 != -10) {
                                                if (~var7 != -11) {
                                                    if (var7 != 11) {
                                                        if (~var7 == -13) {
                                                            for (int var8 = 0; class657.field9287 > var8; ++var8) {
                                                                int var9 = var5[var8];
                                                                int var10 = var6[var8];
                                                                var3[var8] = -(var9 * var10 >> 11) + var9 + var10;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var11 = 0; class657.field9287 > var11; ++var11) {
                                                            int var12 = var5[var11];
                                                            int var13 = var6[var11];
                                                            var3[var11] = var13 < var12 ? -var13 + var12 : -var12 + var13;
                                                        }
                                                    }
                                                } else {
                                                    for (int var14 = 0; var14 < class657.field9287; ++var14) {
                                                        int var15 = var6[var14];
                                                        int var16 = var5[var14];
                                                        var3[var14] = ~var15 > ~var16 ? var16 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var17 = 0; class657.field9287 > var17; ++var17) {
                                                    int var18 = var5[var17];
                                                    int var19 = var6[var17];
                                                    var3[var17] = var19 > var18 ? var18 : var19;
                                                }
                                            }
                                        } else {
                                            for (int var20 = 0; ~var20 > ~class657.field9287; ++var20) {
                                                int var21 = var5[var20];
                                                var3[var20] = ~var21 == -1 ? 0 : -((-var6[var20] + 4096 << 12) / var21) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var22 = 0; ~var22 > ~class657.field9287; ++var22) {
                                            int var23 = var5[var22];
                                            var3[var22] = var23 != 4096 ? (var6[var22] << 12) / (4096 - var23) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var24 = 0; ~var24 > ~class657.field9287; ++var24) {
                                        int var25 = var6[var24];
                                        var3[var24] = ~var25 > -2049 ? var5[var24] * var25 >> 11 : 4096 - ((-var5[var24] + 4096) * (-var25 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var26 = 0; ~var26 > ~class657.field9287; ++var26) {
                                    var3[var26] = -((4096 - var5[var26]) * (-var6[var26] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var27 = 0; ~class657.field9287 < ~var27; ++var27) {
                                int var28 = var6[var27];
                                var3[var27] = var28 == 0 ? 4096 : (var5[var27] << 12) / var28;
                            }
                        }
                    } else {
                        for (int var29 = 0; var29 < class657.field9287; ++var29) {
                            var3[var29] = var5[var29] * var6[var29] >> 12;
                        }
                    }
                } else {
                    for (int var30 = 0; ~class657.field9287 < ~var30; ++var30) {
                        var3[var30] = var5[var30] + -var6[var30];
                    }
                }
            } else {
                for (int var31 = 0; ~class657.field9287 < ~var31; ++var31) {
                    var3[var31] = var5[var31] + var6[var31];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Z)V", line = 293)
    public static final void method114(boolean arg0) {
        if (~class20.field311 > -103) {
            class20.field311 += 6;
        }
        ++field272;
        if (class80.field1085 != -1 && class671.field9449 < class571.method3150(126)) {
            for (int var1 = class80.field1085; ~class169.field2210.length < ~var1; ++var1) {
                if (class169.field2210[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class169.field2210[var1].substring(6));
                    } catch (Exception var15) {
                    }
                    class193.method1171(4, "Pausing for " + var2 + " seconds...");
                    class80.field1085 = var1 + 1;
                    class671.field9449 = class571.method3150(120) + (long) (var2 * 1000);
                    return;
                }
                class163.field2141 = class169.field2210[var1];
                class646.method3611(false, (byte) -38);
            }
            class80.field1085 = -1;
        }
        if (class204.field2592 != 0) {
            class684.field9604 -= class204.field2592 * 5;
            if (~class684.field9604 <= ~class542.field7250) {
                class684.field9604 = class542.field7250 - 1;
            }
            if (~class684.field9604 > -1) {
                class684.field9604 = 0;
            }
            class204.field2592 = 0;
        }
        if (arg0) {
            for (int var3 = 0; ~var3 > ~class404.field5070; ++var3) {
                class521 var4 = class338.field4383[var3];
                int var5 = var4.method566((byte) -93);
                char var6 = var4.method561(true);
                int var7 = var4.method567(22858);
                if (var5 == 84) {
                    class646.method3611(false, (byte) -114);
                }
                if (var5 == 80) {
                    class646.method3611(true, (byte) -123);
                } else if (~var5 == -67 && (var7 & 4) != 0) {
                    if (class434.field5437 != null) {
                        String var8 = "";
                        for (int var9 = class329.field4194.length - 1; ~var9 <= -1; --var9) {
                            if (class329.field4194[var9] != null && class329.field4194[var9].length() > 0) {
                                var8 = var8 + class329.field4194[var9] + '\n';
                            }
                        }
                        class434.field5437.setContents(new StringSelection(var8), (ClipboardOwner) null);
                    }
                } else if (var5 == 67 && (4 & var7) != 0) {
                    if (class434.field5437 != null) {
                        Transferable var10 = class434.field5437.getContents((Object) null);
                        if (var10 != null) {
                            try {
                                String var11 = (String) var10.getTransferData(DataFlavor.stringFlavor);
                                if (var11 != null) {
                                    String[] var12 = class475.method2512(-122, var11, '\n');
                                    if (var12.length > 1) {
                                        for (int var13 = 0; var13 < var12.length; ++var13) {
                                            if (var12[var13].startsWith("pause")) {
                                                int var14 = 5;
                                                try {
                                                    var14 = Integer.parseInt(var12[var13].substring(6));
                                                } catch (Exception var16) {
                                                }
                                                class193.method1171(4, "Pausing for " + var14 + " seconds...");
                                                class169.field2210 = var12;
                                                class80.field1085 = var13 + 1;
                                                class671.field9449 = class571.method3150(97) + (long) (var14 * 1000);
                                                return;
                                            }
                                            class163.field2141 = var12[var13];
                                            class646.method3611(false, (byte) -31);
                                        }
                                    } else {
                                        class163.field2141 = class163.field2141 + var11;
                                    }
                                }
                            } catch (Exception var17) {
                            }
                        }
                    }
                } else if (var5 == 85 && ~class172.field2245 < -1) {
                    class163.field2141 = class163.field2141.substring(0, class172.field2245 + -1) + class163.field2141.substring(class172.field2245);
                    --class172.field2245;
                } else if (~var5 == -102 && ~class172.field2245 > ~class163.field2141.length()) {
                    class163.field2141 = class163.field2141.substring(0, class172.field2245) + class163.field2141.substring(class172.field2245 + 1);
                } else if (var5 == 96 && class172.field2245 > 0) {
                    --class172.field2245;
                } else if (var5 == 97 && ~class172.field2245 > ~class163.field2141.length()) {
                    ++class172.field2245;
                } else if (~var5 == -103) {
                    class172.field2245 = 0;
                } else if (var5 == 103) {
                    class172.field2245 = class163.field2141.length();
                } else if (~var5 == -105 && class687.field9736 < class329.field4194.length) {
                    ++class687.field9736;
                    class44.method265(-1);
                    class172.field2245 = class163.field2141.length();
                } else if (var5 == 105 && class687.field9736 > 0) {
                    --class687.field9736;
                    class44.method265(-1);
                    class172.field2245 = class163.field2141.length();
                } else if (class653.method3663(-118, var6) || var6 == ':' || var6 == ',' || ~var6 == -33 || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || ~var6 == -94) {
                    class163.field2141 = class163.field2141.substring(0, class172.field2245) + class338.field4383[var3].method561(true) + class163.field2141.substring(class172.field2245);
                    ++class172.field2245;
                }
            }
            class404.field5070 = 0;
            class4.field113 = 0;
            class544.method2941(0);
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IZ)[[I", line = 522)
    public final int[][] method44(int arg0, boolean arg1) {
        if (!arg1) {
            this.method39(-12, 21);
        }
        ++field269;
        int[][] var3 = super.field135.method2706(arg0, -111);
        if (super.field135.field6667) {
            int[][] var4 = this.method45(0, arg0, 0);
            int[][] var5 = this.method45(1, arg0, 0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field273;
            if (~var15 != -2) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~var16 > ~class657.field9287; ++var16) {
                                                                int var17 = var13[var16];
                                                                int var18 = var14[var16];
                                                                int var19 = var11[var16];
                                                                int var20 = var10[var16];
                                                                int var21 = var9[var16];
                                                                int var22 = var12[var16];
                                                                var6[var16] = var21 - -var22 + -(var21 * var22 >> 11);
                                                                var7[var16] = var20 - (-var17 - -(var17 * var20 >> 11));
                                                                var8[var16] = -(var18 * var19 >> 11) + var19 - -var18;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; class657.field9287 > var23; ++var23) {
                                                            int var24 = var13[var23];
                                                            int var25 = var11[var23];
                                                            int var26 = var12[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var10[var23];
                                                            int var29 = var9[var23];
                                                            var6[var23] = ~var26 > ~var29 ? var29 - var26 : -var29 + var26;
                                                            var7[var23] = ~var28 < ~var24 ? -var24 + var28 : -var28 + var24;
                                                            var8[var23] = var25 <= var27 ? -var25 + var27 : -var27 + var25;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class657.field9287; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var12[var30];
                                                        int var33 = var10[var30];
                                                        int var34 = var11[var30];
                                                        int var35 = var9[var30];
                                                        int var36 = var13[var30];
                                                        var6[var30] = ~var32 <= ~var35 ? var32 : var35;
                                                        var7[var30] = var33 <= var36 ? var36 : var33;
                                                        var8[var30] = var31 < var34 ? var34 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class657.field9287; ++var37) {
                                                    int var38 = var9[var37];
                                                    int var39 = var14[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var13[var37];
                                                    int var42 = var10[var37];
                                                    int var43 = var11[var37];
                                                    var6[var37] = var40 > var38 ? var38 : var40;
                                                    var7[var37] = var41 <= var42 ? var41 : var42;
                                                    var8[var37] = var39 <= var43 ? var39 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class657.field9287; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var9[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = ~var46 != -1 ? -((-var12[var44] + 4096 << 12) / var46) + 4096 : 0;
                                                var7[var44] = var47 != 0 ? -((4096 - var13[var44] << 12) / var47) + 4096 : 0;
                                                var8[var44] = ~var45 == -1 ? 0 : -((-var14[var44] + 4096 << 12) / var45) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~var48 > ~class657.field9287; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var11[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = var51 != 4096 ? (var12[var48] << 12) / (-var51 + 4096) : 4096;
                                            var7[var48] = ~var49 == -4097 ? 4096 : (var13[var48] << 12) / (-var49 + 4096);
                                            var8[var48] = var50 == 4096 ? 4096 : (var14[var48] << 12) / (-var50 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class657.field9287; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var14[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = ~var53 <= -2049 ? -((4096 - var53) * (-var9[var52] + 4096) >> 11) + 4096 : var9[var52] * var53 >> 11;
                                        var7[var52] = ~var55 <= -2049 ? -((4096 - var10[var52]) * (4096 - var55) >> 11) + 4096 : var10[var52] * var55 >> 11;
                                        var8[var52] = ~var54 > -2049 ? var11[var52] * var54 >> 11 : -((4096 - var11[var52]) * (-var54 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class657.field9287; ++var56) {
                                    var6[var56] = -((4096 - var12[var56]) * (-var9[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = 4096 - ((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12);
                                    var8[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class657.field9287; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var13[var57];
                                int var60 = var12[var57];
                                var6[var57] = var60 == 0 ? 4096 : (var9[var57] << 12) / var60;
                                var7[var57] = ~var59 == -1 ? 4096 : (var10[var57] << 12) / var59;
                                var8[var57] = var58 == 0 ? 4096 : (var11[var57] << 12) / var58;
                            }
                        }
                    } else {
                        for (int var61 = 0; class657.field9287 > var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class657.field9287; ++var62) {
                        var6[var62] = var9[var62] - var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class657.field9287 < ~var63; ++var63) {
                    var6[var63] = var9[var63] - -var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "()V", line = 838)
    public class17() {
        super(2, false);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IFFF[BLab;FIIIIFII)V", line = 844)
    public static final void method115(int arg0, float arg1, float arg2, float arg3, byte[] arg4, class318 arg5, float arg6, int arg7, int arg8, int arg9, int arg10, float arg11, int arg12, int arg13) {
        ++field274;
        int var14 = arg7 * arg8;
        float[] var15 = new float[var14];
        for (int var16 = arg12; ~var16 > ~arg9; ++var16) {
            arg5.method1828(arg1 / (float) arg7, arg13, arg7, 7, arg6 / (float) arg8, var15, 0, arg8, arg2 / (float) arg10, arg10, arg11 * 127.0F);
            int var19 = arg0;
            arg1 *= 2.0F;
            for (int var20 = 0; ~var20 > ~var14; ++var20) {
                arg4[var19] = (byte) ((int) ((float) arg4[var19] + var15[var20]));
                ++var19;
            }
            arg2 *= 2.0F;
            arg6 *= 2.0F;
            arg11 = arg3 * arg11;
        }
        int var17 = arg0;
        for (int var18 = 0; var18 < var14; ++var18) {
            arg4[var17] = (byte) (arg4[var17] + 127);
            ++var17;
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(BIIII)V", line = 892)
    public static final void method116(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 9) {
            method116((byte) -9, 23, -116, -32, 102);
        }
        if (class289.field3595 <= arg1 && arg1 <= class159.field2063) {
            int var5 = class605.method3315(arg3, 4095, class263.field3294, class314.field4052);
            int var6 = class605.method3315(arg2, 4095, class263.field3294, class314.field4052);
            class221.method1308(arg1, var6, (byte) -80, arg4, var5);
        }
        ++field270;
    }
}
