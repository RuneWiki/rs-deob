import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class383 extends class5 {

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "I")
    private int field4830 = 0;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "I")
    private int field4832 = 4096;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "[I")
    public static int[] field4829 = new int[3];

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "Lsa;")
    public static class595 field4835;

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V", line = 4)
    public class383() {
        super(1, true);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIFIFFFIILab;F)[B", line = 7)
    public static final byte[] method2067(int arg0, int arg1, float arg2, int arg3, float arg4, float arg5, float arg6, int arg7, int arg8, class318 arg9, float arg10) {
        ++field4836;
        byte[] var11 = new byte[arg7 * arg8 * arg3];
        class472.method2495(arg2, arg1, var11, arg5, arg9, arg10, arg6, arg4, arg8, arg7, 1, arg0, arg3);
        return var11;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILes;I)V", line = 28)
    public final void method47(int arg0, class630 arg1, int arg2) {
        ++field4828;
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field4832 = arg1.method3470(13111);
            }
        } else {
            this.field4830 = arg1.method3470(13111);
        }
        if (arg0 != 1) {
            field4835 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(IBI)Z", line = 62)
    public static final boolean method2068(int arg0, byte arg1, int arg2) {
        if (arg1 < 82) {
            field4829 = null;
        }
        ++field4831;
        return ~(arg2 & 384) != -1;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)V", line = 77)
    public static void method2069(byte arg0) {
        field4829 = null;
        int var1 = -42 % ((arg0 - 78) / 36);
        field4835 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZIIBI[[[Lvf;)Z", line = 89)
    public static final boolean method2070(boolean arg0, int arg1, int arg2, byte arg3, int arg4, class75[][][] arg5) {
        ++field4833;
        byte var6 = !arg0 ? (byte) (class673.field9473 & 255) : 1;
        if (class569.field7970[class476.field6039][arg4][arg2] == var6) {
            return false;
        } else if (~(class10.field190[class476.field6039][arg4][arg2] & 4) == -1) {
            return false;
        } else {
            if (arg3 < 65) {
                method2067(-29, -15, -0.8449425F, 71, -1.6469798F, 1.3943362F, -0.67159706F, 28, 1, (class318) null, -0.03662885F);
            }
            byte var7 = 0;
            class461.field5880[var7] = arg4;
            int var8 = 0;
            int var35 = var7 + 1;
            class78.field1077[var7] = arg2;
            class569.field7970[class476.field6039][arg4][arg2] = var6;
            while (~var35 != ~var8) {
                int var9 = class461.field5880[var8] & 65535;
                int var10 = class461.field5880[var8] >> 16 & 255;
                int var11 = class461.field5880[var8] >> 24 & 255;
                int var12 = 65535 & class78.field1077[var8];
                int var13 = (16764734 & class78.field1077[var8]) >> 16;
                var8 = 4095 & var8 + 1;
                boolean var14 = false;
                if ((4 & class10.field190[class476.field6039][var9][var12]) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class476.field6039 + 1; var16 <= 3; ++var16) {
                    if ((class10.field190[var16][var9][var12] & 8) == 0) {
                        if (var14 && arg5[var16][var9][var12] != null) {
                            if (arg5[var16][var9][var12].field1030 != null) {
                                int var20 = class513.method2770(var10, -27579);
                                if (arg5[var16][var9][var12].field1030.field8397 == var20 || arg5[var16][var9][var12].field1026 != null && arg5[var16][var9][var12].field1026.field8397 == var20) {
                                    continue;
                                }
                                if (~var11 != -1) {
                                    int var21 = class513.method2770(var11, -27579);
                                    if (~arg5[var16][var9][var12].field1030.field8397 == ~var21 || arg5[var16][var9][var12].field1026 != null && arg5[var16][var9][var12].field1026.field8397 == var21) {
                                        continue;
                                    }
                                }
                                if (~var13 != -1) {
                                    int var22 = class513.method2770(var13, -27579);
                                    if (arg5[var16][var9][var12].field1030.field8397 == var22 || arg5[var16][var9][var12].field1026 != null && arg5[var16][var9][var12].field1026.field8397 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class75 var23 = arg5[var16][var9][var12];
                            if (var23.field1024 != null) {
                                for (class138 var24 = var23.field1024; var24 != null; var24 = var24.field1789) {
                                    class172 var25 = var24.field1786;
                                    if (var25 instanceof class339) {
                                        class339 var26 = (class339) var25;
                                        int var27 = var26.method74((byte) 42);
                                        int var28 = var26.method78((byte) -75);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var28 << 6 | var27;
                                        if (~var10 == ~var29 || ~var11 != -1 && ~var11 == ~var29 || ~var13 != -1 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class75 var30 = arg5[var16][var9][var12];
                        if (var30 != null && var30.field1024 != null) {
                            for (class138 var31 = var30.field1024; var31 != null; var31 = var31.field1789) {
                                class172 var32 = var31.field1786;
                                if (var32.field2254 != var32.field2247 || ~var32.field2244 != ~var32.field2243) {
                                    for (int var33 = var32.field2247; ~var33 >= ~var32.field2254; ++var33) {
                                        for (int var34 = var32.field2243; var34 <= var32.field2244; ++var34) {
                                            class569.field7970[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class569.field7970[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class491.field6485[class476.field6039 + 1].method1562(var12, (byte) 51, var9);
                    if (~var17 < ~class540.field7233[arg1]) {
                        class540.field7233[arg1] = var17;
                    }
                    int var18 = var9 << 9;
                    if (class289.field3588[arg1] <= var18) {
                        if (var18 > class389.field4915[arg1]) {
                            class389.field4915[arg1] = var18;
                        }
                    } else {
                        class289.field3588[arg1] = var18;
                    }
                    int var19 = var12 << 9;
                    if (~class215.field2671[arg1] >= ~var19) {
                        if (~class693.field9833[arg1] > ~var19) {
                            class693.field9833[arg1] = var19;
                        }
                    } else {
                        class215.field2671[arg1] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && ~class569.field7970[class476.field6039][var9 + -1][var12] != ~var6) {
                        class461.field5880[var35] = class444.method2376(class444.method2376(var9 + -1, 1179648), -754974720);
                        class78.field1077[var35] = class444.method2376(1245184, var12);
                        class569.field7970[class476.field6039][var9 + -1][var12] = var6;
                        var35 = 4095 & var35 - -1;
                    }
                    ++var12;
                    if (~var12 > ~class452.field5802) {
                        if (var9 + -1 >= 0 && ~class569.field7970[class476.field6039][var9 - 1][var12] != ~var6 && (4 & class10.field190[class476.field6039][var9][var12]) == 0 && (4 & class10.field190[class476.field6039][var9 + -1][var12 + -1]) == 0) {
                            class461.field5880[var35] = class444.method2376(1375731712, class444.method2376(1179648, var9 - 1));
                            class78.field1077[var35] = class444.method2376(1245184, var12);
                            class569.field7970[class476.field6039][var9 + -1][var12] = var6;
                            var35 = var35 + 1 & 4095;
                        }
                        if (~class569.field7970[class476.field6039][var9][var12] != ~var6) {
                            class461.field5880[var35] = class444.method2376(class444.method2376(var9, 5373952), 318767104);
                            class78.field1077[var35] = class444.method2376(5439488, var12);
                            var35 = 4095 & var35 + 1;
                            class569.field7970[class476.field6039][var9][var12] = var6;
                        }
                        if (var9 + 1 < class431.field5395 && ~class569.field7970[class476.field6039][var9 + 1][var12] != ~var6 && (4 & class10.field190[class476.field6039][var9][var12]) == 0 && (4 & class10.field190[class476.field6039][var9 - -1][var12 + -1]) == 0) {
                            class461.field5880[var35] = class444.method2376(-1845493760, class444.method2376(5373952, var9 + 1));
                            class78.field1077[var35] = class444.method2376(var12, 5439488);
                            var35 = 4095 & var35 - -1;
                            class569.field7970[class476.field6039][var9 + 1][var12] = var6;
                        }
                    }
                    --var12;
                    if (var9 + 1 < class431.field5395 && class569.field7970[class476.field6039][var9 + 1][var12] != var6) {
                        class461.field5880[var35] = class444.method2376(class444.method2376(var9 + 1, 9568256), 1392508928);
                        class78.field1077[var35] = class444.method2376(var12, 9633792);
                        class569.field7970[class476.field6039][var9 + 1][var12] = var6;
                        var35 = 4095 & var35 + 1;
                    }
                    --var12;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && ~class569.field7970[class476.field6039][var9 + -1][var12] != ~var6 && (4 & class10.field190[class476.field6039][var9][var12]) == 0 && ~(class10.field190[class476.field6039][var9 + -1][var12 + 1] & 4) == -1) {
                            class461.field5880[var35] = class444.method2376(301989888, class444.method2376(var9 + -1, 13762560));
                            class78.field1077[var35] = class444.method2376(var12, 13828096);
                            var35 = 4095 & var35 + 1;
                            class569.field7970[class476.field6039][var9 + -1][var12] = var6;
                        }
                        if (class569.field7970[class476.field6039][var9][var12] != var6) {
                            class461.field5880[var35] = class444.method2376(-1828716544, class444.method2376(var9, 13762560));
                            class78.field1077[var35] = class444.method2376(var12, 13828096);
                            var35 = 4095 & var35 + 1;
                            class569.field7970[class476.field6039][var9][var12] = var6;
                        }
                        if (class431.field5395 > var9 + 1 && ~class569.field7970[class476.field6039][var9 + 1][var12] != ~var6 && ~(class10.field190[class476.field6039][var9][var12] & 4) == -1 && (class10.field190[class476.field6039][var9 - -1][var12 - -1] & 4) == 0) {
                            class461.field5880[var35] = class444.method2376(class444.method2376(var9 + 1, 9568256), -771751936);
                            class78.field1077[var35] = class444.method2376(var12, 9633792);
                            class569.field7970[class476.field6039][var9 + 1][var12] = var6;
                            var35 = 4095 & var35 + 1;
                        }
                    }
                }
            }
            if (~class540.field7233[arg1] != 999999) {
                class540.field7233[arg1] += 40;
                class289.field3588[arg1] -= 512;
                class389.field4915[arg1] += 512;
                class693.field9833[arg1] += 512;
                class215.field2671[arg1] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)[I", line = 410)
    public final int[] method39(int arg0, int arg1) {
        ++field4834;
        int[] var3 = super.field126.method3280(arg1, true);
        if (super.field126.field8392) {
            int[] var4 = this.method49(arg1, false, 0);
            for (int var5 = 0; ~var5 > ~class657.field9287; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field4830 >= ~var6 && ~this.field4832 <= ~var6 ? 4096 : 0;
            }
        }
        int var7 = 96 / ((81 - arg0) / 36);
        return var3;
    }
}
