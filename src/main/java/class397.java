import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class397 extends class184 {

    @OriginalMember(owner = "client!wm", name = "E", descriptor = "I")
    private int field5682 = 409;

    @OriginalMember(owner = "client!wm", name = "H", descriptor = "I")
    private int field5685 = 2048;

    @OriginalMember(owner = "client!wm", name = "D", descriptor = "I")
    private int field5681 = 1024;

    @OriginalMember(owner = "client!wm", name = "L", descriptor = "I")
    private int field5689 = 1024;

    @OriginalMember(owner = "client!wm", name = "O", descriptor = "I")
    private int field5692 = 0;

    @OriginalMember(owner = "client!wm", name = "P", descriptor = "I")
    private int field5693 = 0;

    @OriginalMember(owner = "client!wm", name = "K", descriptor = "I")
    private int field5688 = 1024;

    @OriginalMember(owner = "client!wm", name = "T", descriptor = "I")
    private int field5697 = 819;

    @OriginalMember(owner = "client!wm", name = "V", descriptor = "I")
    private int field5699 = 1024;

    @OriginalMember(owner = "client!wm", name = "G", descriptor = "Lek;")
    public static class352 field5684 = new class352(8);

    @OriginalMember(owner = "client!wm", name = "W", descriptor = "[[B")
    public static byte[][] field5700 = new byte[1000][];

    @OriginalMember(owner = "client!wm", name = "F", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!wm", name = "I", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!wm", name = "J", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!wm", name = "M", descriptor = "I")
    private int field5690;

    @OriginalMember(owner = "client!wm", name = "Q", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!wm", name = "R", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!wm", name = "S", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!wm", name = "U", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!wm", name = "N", descriptor = "[I")
    public static int[] field5691;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BILfh;)V", line = 8)
    public final void method7(byte arg0, int arg1, class463 arg2) {
        int var4 = -23 % ((-13 - arg0) / 51);
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (arg1 != 7) {
                                        if (~arg1 == -9) {
                                            this.field5681 = arg2.method2758((byte) 93);
                                        }
                                    } else {
                                        this.field5688 = arg2.method2758((byte) 119);
                                    }
                                } else {
                                    this.field5692 = arg2.method2737(false);
                                }
                            } else {
                                this.field5699 = arg2.method2758((byte) 80);
                            }
                        } else {
                            this.field5697 = arg2.method2758((byte) 79);
                        }
                    } else {
                        this.field5682 = arg2.method2758((byte) 99);
                    }
                } else {
                    this.field5685 = arg2.method2758((byte) 75);
                }
            } else {
                this.field5689 = arg2.method2758((byte) 116);
            }
        } else {
            this.field5693 = arg2.method2737(false);
        }
        ++field5696;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)[I", line = 102)
    public final int[] method6(int arg0, int arg1) {
        ++field5694;
        if (arg1 != 578) {
            return null;
        } else {
            int[] var3 = super.field2409.method248(arg0, arg1 ^ 16776514);
            if (super.field2409.field436) {
                int[][] var4 = super.field2409.method249((byte) -127);
                int var5 = 0;
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;
                int var9 = 0;
                boolean var10 = true;
                boolean var11 = true;
                int var12 = 0;
                int var13 = 0;
                int var14 = class245.field3167 * this.field5689 >> 12;
                int var15 = class245.field3167 * this.field5685 >> 12;
                int var16 = class79.field1026 * this.field5682 >> 12;
                int var17 = class79.field1026 * this.field5697 >> 12;
                if (var17 <= 1) {
                    return var4[arg0];
                } else {
                    this.field5690 = class245.field3167 / 8 * this.field5699 >> 12;
                    int var18 = 1 - -(class245.field3167 / var14);
                    int[][] var19 = new int[var18][3];
                    int[][] var20 = new int[var18][3];
                    Random var21 = new Random((long) this.field5693);
                    while (true) {
                        while (true) {
                            int var22 = var14 - -class349.method2006(var21, (byte) -46, -var14 + var15);
                            int var23 = class349.method2006(var21, (byte) -46, -var16 + var17) + var16;
                            int var24 = var8 + var22;
                            if (class245.field3167 < var24) {
                                var24 = class245.field3167;
                                var22 = -var8 + class245.field3167;
                            }
                            int var25;
                            if (var11) {
                                var25 = 0;
                            } else {
                                int var26 = var9;
                                int[] var27 = var20[var9];
                                int var28 = 0;
                                int var29 = var5 + var24;
                                if (var29 < 0) {
                                    var29 += class245.field3167;
                                }
                                if (class245.field3167 < var29) {
                                    var29 -= class245.field3167;
                                }
                                while (true) {
                                    int[] var30 = var20[var26];
                                    if (~var29 <= ~var30[0] && ~var30[1] <= ~var29) {
                                        var25 = var27[2];
                                        if (var9 != var26) {
                                            int var31 = var5 + var8;
                                            if (~var31 > -1) {
                                                var31 += class245.field3167;
                                            }
                                            if (class245.field3167 < var31) {
                                                var31 -= class245.field3167;
                                            }
                                            for (int var32 = 1; var28 >= var32; ++var32) {
                                                int[] var40 = var20[(var9 + var32) % var12];
                                                var25 = Math.max(var25, var40[2]);
                                            }
                                            for (int var33 = 0; var28 >= var33; ++var33) {
                                                int[] var34 = var20[(var9 - -var33) % var12];
                                                int var35 = var34[2];
                                                if (~var25 != ~var35) {
                                                    int var36 = var34[0];
                                                    int var37 = var34[1];
                                                    int var38;
                                                    int var39;
                                                    if (~var31 <= ~var29) {
                                                        if (~var36 == -1) {
                                                            var38 = Math.min(var29, var37);
                                                            var39 = 0;
                                                        } else {
                                                            var39 = Math.max(var31, var36);
                                                            var38 = class245.field3167;
                                                        }
                                                    } else {
                                                        var39 = Math.max(var31, var36);
                                                        var38 = Math.min(var29, var37);
                                                    }
                                                    this.method2365(var35, -var35 + var25, var4, -var39 + var38, var7 + var39, -62, var21);
                                                }
                                            }
                                        }
                                        var9 = var26;
                                        break;
                                    }
                                    ++var26;
                                    if (var12 <= var26) {
                                        var26 = 0;
                                    }
                                    ++var28;
                                }
                            }
                            if (~(var23 + var25) >= ~class79.field1026) {
                                var10 = false;
                            } else {
                                var23 = -var25 + class79.field1026;
                            }
                            if (~class245.field3167 == ~var24) {
                                this.method2365(var25, var23, var4, var22, var8 - -var6, -101, var21);
                                if (var10) {
                                    return var3;
                                }
                                var10 = true;
                                int[] var41 = var19[var13++];
                                var41[2] = var23 + var25;
                                var41[0] = var8;
                                var41[1] = var24;
                                int[][] var42 = var20;
                                var20 = var19;
                                var19 = var42;
                                var12 = var13;
                                var13 = 0;
                                var7 = var6;
                                var6 = class349.method2006(var21, (byte) -46, class245.field3167);
                                var8 = 0;
                                var5 = -var7 + var6;
                                int var43 = var5;
                                if (~var5 > -1) {
                                    var43 = class245.field3167 + var5;
                                }
                                if (~class245.field3167 > ~var43) {
                                    var43 -= class245.field3167;
                                }
                                var9 = 0;
                                while (true) {
                                    int[] var44 = var20[var9];
                                    if (var43 >= var44[0] && var43 <= var44[1]) {
                                        var11 = false;
                                        break;
                                    }
                                    ++var9;
                                    if (var9 >= var12) {
                                        var9 = 0;
                                    }
                                }
                            } else {
                                int[] var45 = var19[var13++];
                                var45[2] = var23 + var25;
                                var45[1] = var24;
                                var45[0] = var8;
                                this.method2365(var25, var23, var4, var22, var6 + var8, arg1 ^ -516, var21);
                                var8 = var24;
                            }
                        }
                    }
                }
            } else {
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V", line = 357)
    public class397() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(Z)V", line = 365)
    public final void method109(boolean arg0) {
        ++field5683;
        if (arg0) {
            this.field5685 = -84;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)V", line = 398)
    public static void method2364(byte arg0) {
        field5691 = null;
        field5700 = null;
        if (arg0 != -118) {
            field5686 = -76;
        }
        field5684 = null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II[[IIIILjava/util/Random;)V", line = 412)
    private final void method2365(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, Random arg6) {
        if (arg5 > -42) {
            this.method2365(-30, 106, (int[][]) null, -115, 124, -64, (Random) null);
        }
        ++field5695;
        int var8 = ~this.field5681 < -1 ? 4096 - class349.method2006(arg6, (byte) -46, this.field5681) : 4096;
        int var9 = this.field5690 * this.field5688 >> 12;
        int var10 = this.field5690 - (~var9 < -1 ? class349.method2006(arg6, (byte) -46, var9) : 0);
        if (arg4 >= class245.field3167) {
            arg4 -= class245.field3167;
        }
        if (~var10 >= -1) {
            if (arg3 + arg4 <= class245.field3167) {
                for (int var11 = 0; ~arg1 < ~var11; ++var11) {
                    class318.method1876(arg2[arg0 - -var11], arg4, arg3, var8);
                }
            } else {
                int var12 = class245.field3167 - arg4;
                for (int var13 = 0; arg1 > var13; ++var13) {
                    int[] var14 = arg2[arg0 + var13];
                    class318.method1876(var14, arg4, var12, var8);
                    class318.method1876(var14, 0, -var12 + arg3, var8);
                }
            }
        } else if (arg1 > 0 && ~arg3 < -1) {
            int var15 = arg3 / 2;
            int var16 = arg1 / 2;
            int var17 = var10 <= var15 ? var10 : var15;
            int var18 = var10 <= var16 ? var10 : var16;
            int var19 = arg4 - -var17;
            int var20 = -(var17 * 2) + arg3;
            for (int var21 = 0; ~arg1 < ~var21; ++var21) {
                int[] var22 = arg2[arg0 + var21];
                if (~var18 < ~var21) {
                    int var23 = var8 * var21 / var18;
                    if (this.field5692 == 0) {
                        for (int var24 = 0; ~var24 > ~var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class378.method2145(arg4 - -var24, class421.field5961)] = var22[class378.method2145(class421.field5961, -var24 + -1 + arg3 + arg4)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; var17 > var26; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class378.method2145(arg4 + var26, class421.field5961)] = var22[class378.method2145(arg4 - -arg3 + -var26 + -1, class421.field5961)] = var23 <= var28 ? var23 : var28;
                        }
                    }
                    if (class245.field3167 < var19 + var20) {
                        int var27 = class245.field3167 - var19;
                        class318.method1876(var22, var19, var27, var23);
                        class318.method1876(var22, 0, -var27 + var20, var23);
                    } else {
                        class318.method1876(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = arg1 + -1 + -var21;
                    if (~var18 < ~var29) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field5692 == -1) {
                            for (int var31 = 0; var17 > var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class378.method2145(arg4 + var31, class421.field5961)] = var22[class378.method2145(class421.field5961, arg4 - var31 + arg3 - 1)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class378.method2145(class421.field5961, arg4 + var33)] = var22[class378.method2145(class421.field5961, arg4 - -arg3 + -1 - var33)] = ~var35 <= ~var30 ? var30 : var35;
                            }
                        }
                        if (class245.field3167 >= var19 - -var20) {
                            class318.method1876(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class245.field3167;
                            class318.method1876(var22, var19, var34, var30);
                            class318.method1876(var22, 0, var20 - var34, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var17 < ~var36; ++var36) {
                            var22[class378.method2145(arg4 + var36, class421.field5961)] = var22[class378.method2145(arg4 + -1 - (-arg3 - -var36), class421.field5961)] = var8 * var36 / var17;
                        }
                        if (~class245.field3167 > ~(var19 + var20)) {
                            int var37 = -var19 + class245.field3167;
                            class318.method1876(var22, var19, var37, var8);
                            class318.method1876(var22, 0, -var37 + var20, var8);
                        } else {
                            class318.method1876(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "(Z)V", line = 624)
    public static final void method2366(boolean arg0) {
        if (class280.field3572 > 0) {
            --class280.field3572;
        }
        ++field5687;
        if (~class306.field3903 < -2) {
            class106.field1342 = class160.field2037;
            --class306.field3903;
        }
        if (class178.field2348) {
            class178.field2348 = false;
            class253.method1525(-1860040276);
        } else {
            if (!class122.field1646) {
                class243.method1480(4);
            }
            for (int var1 = 0; var1 < 100 && class137.method940((byte) 92); ++var1) {
            }
            if (~class483.field7059 == -10) {
                class461.method2720(-19, class136.field1754.method1143((byte) -85), class40.field511);
                if (class404.field5755 != null) {
                    if (~class404.field5755.field7310 != 0) {
                        class282.method1669(class300.field3863, false);
                        class40.field511.method2759((byte) -24, class404.field5755.field7310);
                        class404.field5755 = null;
                        class469.field6813 = class504.method3034((byte) -102) + 30000L;
                    }
                } else if (class469.field6813 <= class504.method3034((byte) -121)) {
                    class404.field5755 = class361.field4658.method2978(true, class64.field834.field363);
                }
                class494 var2 = (class494) class53.field706.method153(0);
                if (var2 != null || class504.method3034((byte) -99) - 2000L > class404.field5749) {
                    boolean var3 = false;
                    int var4 = class40.field511.field6631;
                    for (class494 var5 = (class494) class508.field7312.method153(0); var5 != null && -var4 + class40.field511.field6631 < 240; var5 = (class494) class508.field7312.method161(-24)) {
                        var5.method2165(16225);
                        int var6 = var5.method2155((byte) -108);
                        if (var6 < 0) {
                            var6 = 0;
                        } else if (var6 > 65534) {
                            var6 = 65534;
                        }
                        int var7 = var5.method2151(-126);
                        if (~var7 <= -1) {
                            if (~var7 < -65535) {
                                var7 = 65534;
                            }
                        } else {
                            var7 = 0;
                        }
                        boolean var8 = false;
                        if (~var5.method2155((byte) -64) == 0 && var5.method2151(-102) == -1) {
                            var7 = -1;
                            var8 = true;
                            var6 = -1;
                        }
                        if (class283.field3604 != var7 || ~class163.field2066 != ~var6) {
                            if (!var3) {
                                ++class322.field4087;
                                class282.method1669(class429.field6090, false);
                                class40.field511.method2729(0, false);
                                var4 = class40.field511.field6631;
                                var3 = true;
                            }
                            int var9 = var7 - class283.field3604;
                            class283.field3604 = var7;
                            int var10 = -class163.field2066 + var6;
                            class163.field2066 = var6;
                            int var11 = (int) ((var5.method2153(1) - class404.field5749) / 20L);
                            if (var11 < 8 && ~var9 <= 31 && var9 <= 31 && ~var10 <= 31 && var10 <= 31) {
                                var10 += 32;
                                var9 += 32;
                                class40.field511.method2759((byte) -71, (var11 << 12) - (-(var9 << 6) - var10));
                            } else if (~var11 > -33 && ~var9 <= 127 && ~var9 >= -128 && ~var10 <= 127 && ~var10 >= -128) {
                                var10 += 128;
                                class40.field511.method2729(var11 + 128, !arg0);
                                var9 += 128;
                                class40.field511.method2759((byte) -13, (var9 << 8) + var10);
                            } else if (~var11 <= -33) {
                                class40.field511.method2759((byte) -22, 57344 - -var11);
                                if (!var8) {
                                    class40.field511.method2777(var6 << 16 | var7, -11);
                                } else {
                                    class40.field511.method2777(Integer.MIN_VALUE, -11);
                                }
                            } else {
                                class40.field511.method2729(192 - -var11, false);
                                if (var8) {
                                    class40.field511.method2777(Integer.MIN_VALUE, -11);
                                } else {
                                    class40.field511.method2777(var6 << 16 | var7, -11);
                                }
                            }
                            class404.field5749 = var5.method2153(1);
                        }
                    }
                    if (var3) {
                        class40.field511.method2755(class40.field511.field6631 - var4, (byte) -55);
                    }
                }
                if (var2 != null) {
                    long var12 = (var2.method2153(1) - class140.field1806) / 50L;
                    if (var12 > 32767L) {
                        var12 = 32767L;
                    }
                    class140.field1806 = var2.method2153(1);
                    int var14 = var2.method2155((byte) -49);
                    if (var14 >= 0) {
                        if (~var14 < -65536) {
                            var14 = 65535;
                        }
                    } else {
                        var14 = 0;
                    }
                    int var15 = var2.method2151(-95);
                    if (~var15 <= -1) {
                        if (var15 > 65535) {
                            var15 = 65535;
                        }
                    } else {
                        var15 = 0;
                    }
                    byte var16 = 0;
                    if (var2.method2152(!arg0) == 2) {
                        var16 = 1;
                    }
                    int var17 = (int) var12;
                    class282.method1669(class482.field7034, false);
                    ++class354.field4559;
                    class40.field511.method2778(var14 << 16 | var15, 126);
                    class40.field511.method2785(var16 << 15 | var17, 15103);
                }
                if (~class346.field4439 < -1) {
                    int var18 = 0;
                    for (int var19 = 0; var19 < class346.field4439; ++var19) {
                        if (class389.field5220[var19].method1258(-125)) {
                            ++var18;
                        }
                    }
                    if (var18 > 0) {
                        ++class21.field297;
                        class282.method1669(class275.field3452, false);
                        if (~var18 < -76) {
                            var18 = 75;
                        }
                        class40.field511.method2729(var18 * 3, false);
                        for (int var20 = 0; ~class346.field4439 < ~var20; ++var20) {
                            class304 var21 = class389.field5220[var20];
                            if (var21.method1258(-123)) {
                                long var22 = (var21.method1264(true) - class343.field4338) / 50L;
                                if (~var22 < -65536L) {
                                    var22 = 65535L;
                                }
                                class343.field4338 = var21.method1264(true);
                                class40.field511.method2729(var21.method1263((byte) -97), false);
                                class40.field511.method2759((byte) -124, (int) var22);
                            }
                        }
                    }
                }
                if (class313.field3998 > 0) {
                    --class313.field3998;
                }
                if (class469.field6792 && ~class313.field3998 >= -1) {
                    ++class47.field595;
                    class469.field6792 = false;
                    class313.field3998 = 20;
                    class282.method1669(class364.field4735, false);
                    class40.field511.method2748((int) class463.field6626 >> 3, 8016);
                    class40.field511.method2785((int) class49.field629 >> 3, 15103);
                }
                if (class534.field7855 && !class534.field7857) {
                    class534.field7857 = true;
                    ++class11.field186;
                    class282.method1669(class125.field1667, false);
                    class40.field511.method2729(1, false);
                }
                if (!class534.field7855 && class534.field7857) {
                    ++class11.field186;
                    class534.field7857 = false;
                    class282.method1669(class125.field1667, false);
                    class40.field511.method2729(0, !arg0);
                }
                if (!class236.field3006) {
                    class282.method1669(class353.field4543, false);
                    ++class193.field2499;
                    class40.field511.method2729(0, false);
                    int var24 = class40.field511.field6631;
                    class463 var25 = class407.field5817.method586((byte) 120);
                    class40.field511.method2782(var25.field6631, var25.field6618, false, 0);
                    class40.field511.method2755(class40.field511.field6631 - var24, (byte) -85);
                    class236.field3006 = true;
                }
                if (class125.field1664 != null) {
                    if (class142.field1835 == 2) {
                        class378.method2143((byte) 105);
                    } else if (class142.field1835 == 3) {
                        class57.method540((byte) 123);
                    }
                }
                if (class162.field2059) {
                    class162.field2059 = false;
                } else {
                    class59.field773 /= 2.0F;
                }
                if (!class464.field6695) {
                    class461.field6598 /= 2.0F;
                } else {
                    class464.field6695 = false;
                }
                class66.method588(10);
                if (~class483.field7059 == -10) {
                    class314.method1843((byte) 2);
                    class88.method699((byte) -121);
                    class33.method243((byte) 112);
                    class387.method2184(-99999);
                    ++class507.field7292;
                    if (~class507.field7292 < -751) {
                        class253.method1525(-1860040276);
                    } else {
                        class141.method955(false);
                        class363.method2082(0);
                        class68.method605(arg0);
                        for (int var26 = class491.field7160.method2807((byte) 111, true); var26 != -1; var26 = class491.field7160.method2807((byte) 122, false)) {
                            class523.method3116(var26, 0);
                            class161.field2055[class378.method2145(31, class99.field1200++)] = var26;
                        }
                        for (class153 var27 = class222.method1351(true); var27 != null; var27 = class222.method1351(true)) {
                            int var28 = var27.method1000(-71);
                            int var29 = var27.method1006((byte) -33);
                            if (~var28 == -2) {
                                class372.field4824[var29] = var27.field1933;
                                class40.field514 |= class341.field4300[var29];
                                class507.field7309[class378.method2145(31, class346.field4445++)] = var29;
                            } else if (~var28 != -3) {
                                if (~var28 == -4) {
                                    class523 var30 = class310.method1810(var29, 1182823664);
                                    if (!var27.field1932.equals(var30.field7728)) {
                                        var30.field7728 = var27.field1932;
                                        class136.method935(var30, -125);
                                    }
                                } else if (~var28 == -5) {
                                    class523 var31 = class310.method1810(var29, 1182823664);
                                    int var32 = var27.field1933;
                                    int var33 = var27.field1930;
                                    int var34 = var27.field1928;
                                    if (var31.field7580 != var32 || var31.field7689 != var33 || ~var31.field7588 != ~var34) {
                                        var31.field7580 = var32;
                                        var31.field7689 = var33;
                                        var31.field7588 = var34;
                                        class136.method935(var31, -128);
                                    }
                                } else if (var28 != 5) {
                                    if (var28 != 6) {
                                        if (~var28 == -8) {
                                            class523 var35 = class310.method1810(var29, 1182823664);
                                            boolean var36 = var27.field1933 == 1;
                                            if (!var35.field7682 != !var36) {
                                                var35.field7682 = var36;
                                                class136.method935(var35, -126);
                                            }
                                        } else if (~var28 == -9) {
                                            class523 var37 = class310.method1810(var29, 1182823664);
                                            if (var27.field1933 != var37.field7620 || ~var27.field1930 != ~var37.field7586 || ~var27.field1928 != ~var37.field7674) {
                                                var37.field7620 = var27.field1933;
                                                var37.field7674 = var27.field1928;
                                                var37.field7586 = var27.field1930;
                                                if (var37.field7567 != -1) {
                                                    if (~var37.field7622 < -1) {
                                                        var37.field7674 = var37.field7674 * 32 / var37.field7622;
                                                    } else if (var37.field7604 > 0) {
                                                        var37.field7674 = var37.field7674 * 32 / var37.field7604;
                                                    }
                                                }
                                                class136.method935(var37, -128);
                                            }
                                        } else if (~var28 != -10) {
                                            if (var28 == 10) {
                                                class523 var38 = class310.method1810(var29, 1182823664);
                                                if (~var27.field1933 != ~var38.field7603 || var27.field1930 != var38.field7688 || ~var27.field1928 != ~var38.field7690) {
                                                    var38.field7688 = var27.field1930;
                                                    var38.field7603 = var27.field1933;
                                                    var38.field7690 = var27.field1928;
                                                    class136.method935(var38, -128);
                                                }
                                            } else if (~var28 == -12) {
                                                class523 var39 = class310.method1810(var29, 1182823664);
                                                var39.field7670 = 0;
                                                var39.field7623 = var39.field7649 = var27.field1933;
                                                var39.field7675 = 0;
                                                var39.field7660 = var39.field7619 = var27.field1930;
                                                class136.method935(var39, -127);
                                            } else if (var28 != 12) {
                                                if (var28 == 14) {
                                                    class523 var40 = class310.method1810(var29, 1182823664);
                                                    var40.field7647 = var27.field1933;
                                                } else if (~var28 != -16) {
                                                    if (var28 == 16) {
                                                        class523 var41 = class310.method1810(var29, 1182823664);
                                                        var41.field7694 = var27.field1933;
                                                    }
                                                } else {
                                                    class199.field2593 = true;
                                                    class247.field3176 = var27.field1930;
                                                    class274.field3441 = var27.field1933;
                                                }
                                            } else {
                                                class523 var42 = class310.method1810(var29, 1182823664);
                                                int var43 = var27.field1933;
                                                if (var42 != null && var42.field7632 == 0) {
                                                    if (~var43 < ~(-var42.field7574 + var42.field7585)) {
                                                        var43 = var42.field7585 - var42.field7574;
                                                    }
                                                    if (var43 < 0) {
                                                        var43 = 0;
                                                    }
                                                    if (var42.field7659 != var43) {
                                                        var42.field7659 = var43;
                                                        class136.method935(var42, -126);
                                                    }
                                                }
                                            }
                                        } else {
                                            class523 var44 = class310.method1810(var29, 1182823664);
                                            if (~var27.field1933 != ~var44.field7567 || var27.field1930 != var44.field7609) {
                                                var44.field7567 = var27.field1933;
                                                var44.field7609 = var27.field1930;
                                                class136.method935(var44, -126);
                                            }
                                        }
                                    } else {
                                        int var45 = var27.field1933;
                                        int var46 = 31 & var45 >> 10;
                                        int var47 = (994 & var45) >> 5;
                                        int var48 = var45 & 31;
                                        int var49 = (var46 << 19) + (var47 << 11) + (var48 << 3);
                                        class523 var50 = class310.method1810(var29, 1182823664);
                                        if (var50.field7699 != var49) {
                                            var50.field7699 = var49;
                                            class136.method935(var50, -127);
                                        }
                                    }
                                } else {
                                    class523 var51 = class310.method1810(var29, 1182823664);
                                    if (var27.field1933 != var51.field7703 || var27.field1933 == -1) {
                                        var51.field7703 = var27.field1933;
                                        var51.field7698 = 0;
                                        var51.field7627 = 0;
                                        var51.field7691 = 1;
                                        class136.method935(var51, -126);
                                    }
                                }
                            } else {
                                class125.field1668[var29] = var27.field1932;
                                class105.field1332[class378.method2145(class177.field2331++, 31)] = var29;
                            }
                        }
                        if (class353.field4542 != 0) {
                            class422.field5985 += 20;
                            if (class422.field5985 >= 400) {
                                class353.field4542 = 0;
                            }
                        }
                        ++class250.field3207;
                        if (class386.field5072 != null) {
                            ++class145.field1862;
                            if (~class145.field1862 <= -16) {
                                class136.method935(class386.field5072, -125);
                                class386.field5072 = null;
                            }
                        }
                        class337.field4240 = false;
                        class382.field5029 = false;
                        class78.field1021 = null;
                        class401.field5718 = null;
                        class534.method3160((byte) 124, -1, (class523) null, -1);
                        class186.method1170(-1, 24, -1, (class523) null);
                        if (!class211.field2717) {
                            class236.field3000 = -1;
                        }
                        class6.method36((byte) -47);
                        ++class160.field2037;
                        if (class242.field3131) {
                            class282.method1669(class404.field5754, false);
                            ++class384.field5051;
                            class40.field511.method2778(class498.field7219 | class92.field1126 << 14 | class201.field2617 << 28, 98);
                            class242.field3131 = false;
                        }
                        while (true) {
                            class170 var52;
                            class523 var53;
                            class523 var54;
                            do {
                                var52 = (class170) class170.field2182.method158(-24557);
                                if (var52 == null) {
                                    while (true) {
                                        class170 var55;
                                        class523 var56;
                                        class523 var57;
                                        do {
                                            var55 = (class170) class165.field2100.method158(-24557);
                                            if (var55 == null) {
                                                while (true) {
                                                    class170 var58;
                                                    class523 var59;
                                                    class523 var60;
                                                    do {
                                                        var58 = (class170) class434.field6164.method158(-24557);
                                                        if (var58 == null) {
                                                            if (class78.field1021 == null) {
                                                                class446.field6396 = 0;
                                                            }
                                                            if (class233.field2985 != null) {
                                                                class439.method2582(-49);
                                                            }
                                                            if (class322.field4086 > 0 && class343.field4392.method834(false, 82) && class343.field4392.method834(false, 81) && ~class109.field1364 != -1) {
                                                                int var61 = -class109.field1364 + class23.field336.field2676;
                                                                if (~var61 <= -1) {
                                                                    if (var61 > 3) {
                                                                        var61 = 3;
                                                                    }
                                                                } else {
                                                                    var61 = 0;
                                                                }
                                                                class521.method3101(var61, class23.field336.field4936[0] + class320.field4064, false, class23.field336.field4944[0] + class441.field6317);
                                                            }
                                                            class383.method2164(true);
                                                            for (int var62 = 0; ~var62 > -6; ++var62) {
                                                                int var10002 = class401.field5715[var62]++;
                                                            }
                                                            if (class40.field514 && class53.field710 < class504.method3034((byte) -119) - 60000L) {
                                                                class144.method966(115);
                                                            }
                                                            ++class519.field7501;
                                                            if (~class519.field7501 < -501) {
                                                                class519.field7501 = 0;
                                                                int var63 = (int) (Math.random() * 8.0D);
                                                                if ((1 & var63) == 1) {
                                                                    class14.field233 += class308.field3928;
                                                                }
                                                                if (~(4 & var63) == -5) {
                                                                    class55.field718 += class286.field3667;
                                                                }
                                                                if (~(2 & var63) == -3) {
                                                                    class57.field753 += class196.field2545;
                                                                }
                                                            }
                                                            if (class14.field233 < -50) {
                                                                class308.field3928 = 2;
                                                            }
                                                            if (class57.field753 < -55) {
                                                                class196.field2545 = 2;
                                                            }
                                                            if (~class14.field233 < -51) {
                                                                class308.field3928 = -2;
                                                            }
                                                            if (class57.field753 > 55) {
                                                                class196.field2545 = -2;
                                                            }
                                                            if (~class55.field718 > 39) {
                                                                class286.field3667 = 1;
                                                            }
                                                            ++class249.field3191;
                                                            if (class55.field718 > 40) {
                                                                class286.field3667 = -1;
                                                            }
                                                            if (~class249.field3191 < -501) {
                                                                class249.field3191 = 0;
                                                                int var64 = (int) (8.0D * Math.random());
                                                                if (~(2 & var64) == -3) {
                                                                    class317.field4050 += class345.field4429;
                                                                }
                                                                if (~(1 & var64) == -2) {
                                                                    class309.field3967 += class518.field7496;
                                                                }
                                                            }
                                                            if (class309.field3967 < -60) {
                                                                class518.field7496 = 2;
                                                            }
                                                            if (class309.field3967 > 60) {
                                                                class518.field7496 = -2;
                                                            }
                                                            if (~class317.field4050 > 19) {
                                                                class345.field4429 = 1;
                                                            }
                                                            ++class2.field17;
                                                            if (class317.field4050 > 10) {
                                                                class345.field4429 = -1;
                                                            }
                                                            if (~class2.field17 < -51) {
                                                                class282.method1669(class520.field7510, false);
                                                                ++class386.field5074;
                                                            }
                                                            if (class184.field2419) {
                                                                class303.method1786((byte) 68);
                                                                class184.field2419 = false;
                                                            }
                                                            try {
                                                                if (class64.field835 != null && class40.field511.field6631 > 0) {
                                                                    class527.field7780 += class40.field511.field6631;
                                                                    class64.field835.method2475(0, (byte) 103, class40.field511.field6631, class40.field511.field6618);
                                                                    class2.field17 = 0;
                                                                    class40.field511.field6631 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var65) {
                                                                class253.method1525(-1860040276);
                                                                return;
                                                            }
                                                        }
                                                        var59 = var58.field2179;
                                                        if (~var59.field7562 > -1) {
                                                            break;
                                                        }
                                                        var60 = class310.method1810(var59.field7673, 1182823664);
                                                    } while (var60 == null || var60.field7717 == null || var60.field7717.length <= var59.field7562 || var60.field7717[var59.field7562] != var59);
                                                    class239.method1444(var58);
                                                }
                                            }
                                            var56 = var55.field2179;
                                            if (~var56.field7562 > -1) {
                                                break;
                                            }
                                            var57 = class310.method1810(var56.field7673, 1182823664);
                                        } while (var57 == null || var57.field7717 == null || ~var57.field7717.length >= ~var56.field7562 || var57.field7717[var56.field7562] != var56);
                                        class239.method1444(var55);
                                    }
                                }
                                var53 = var52.field2179;
                                if (var53.field7562 < 0) {
                                    break;
                                }
                                var54 = class310.method1810(var53.field7673, 1182823664);
                            } while (var54 == null || var54.field7717 == null || var53.field7562 >= var54.field7717.length || var54.field7717[var53.field7562] != var53);
                            class239.method1444(var52);
                        }
                    }
                }
            }
        }
    }
}
