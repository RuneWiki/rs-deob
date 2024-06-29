import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class164 extends class8 {

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
    private int field2596 = 4096;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2600 = "glow2:";

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
    public static int field2597 = 0;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "Lqh;")
    public static class201 field2605;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)V")
    public static void method1125(byte arg0) {
        field2605 = null;
        field2600 = null;
        if (arg0 > -117) {
            field2600 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
    public class164() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)V")
    public static final void method1126(int arg0) {
        if (arg0 != 261) {
            method1125((byte) -77);
        }
        for (int var1 = 0; ~var1 > ~class141.field2287; ++var1) {
            int var2 = class221.field3648[var1];
            class15 var3 = class137.field2260[var2];
            if (var3 != null) {
                class105.method760(var3, var3.field258.field1731, false);
            }
        }
        ++field2599;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZBZI)V")
    public static final void method1127(boolean arg0, byte arg1, boolean arg2, int arg3) {
        int var10002;
        for (int var4 = 0; ~class141.field2287 < ~var4; ++var4) {
            class15 var21 = class137.field2260[class221.field3648[var4]];
            if (var21 != null && var21.method118((byte) 125) && var21.field258.method777((byte) -18)) {
                int var22 = var21.method278(0);
                if (arg0) {
                    if (!var21.field258.field1718) {
                        continue;
                    }
                } else if (!arg2 != !var21.field258.field1746 || arg3 != 0 && ~arg3 != ~var22) {
                    continue;
                }
                if (var22 == 1) {
                    if ((127 & var21.field3389) == 64 && ~(127 & var21.field3341) == -65) {
                        int var29 = var21.field3389 >> 7;
                        int var30 = var21.field3341 >> 7;
                        if (var29 >= 0 && ~var29 > -105 && ~var30 <= -1 && var30 < 104) {
                            var10002 = class105.field1682[var29][var30]++;
                        }
                    }
                } else if (((1 & var22) != 0 || ~(127 & var21.field3389) == -1 && (var21.field3341 & 127) == 0) && (~(var22 & 1) != -2 || ~(127 & var21.field3389) == -65 && (127 & var21.field3341) == 64)) {
                    int var23 = -(var22 * 64) + var21.field3341 >> 7;
                    int var24 = -(var22 * 64) + var21.field3389 >> 7;
                    int var25 = var24 + var21.method278(0);
                    int var26 = var21.method278(0) + var23;
                    if (var26 > 104) {
                        var26 = 104;
                    }
                    if (var24 < 0) {
                        var24 = 0;
                    }
                    if (~var25 < -105) {
                        var25 = 104;
                    }
                    if (var23 < 0) {
                        var23 = 0;
                    }
                    for (int var27 = var24; var25 > var27; ++var27) {
                        for (int var28 = var23; ~var26 < ~var28; ++var28) {
                            var10002 = class105.field1682[var27][var28]++;
                        }
                    }
                }
            }
        }
        int var5 = 0;
        if (arg1 <= 21) {
            field2600 = null;
        }
        while (~class141.field2287 < ~var5) {
            class15 var6 = class137.field2260[class221.field3648[var5]];
            long var7 = 536870912L | (long) class221.field3648[var5] << 32;
            if (var6 != null && var6.method118((byte) 125) && var6.field258.method777((byte) -18)) {
                label270: {
                    int var9 = var6.method278(0);
                    if (!arg0) {
                        if (var6.field258.field1746 == !arg2 || arg3 != 0 && arg3 != var9) {
                            break label270;
                        }
                    } else if (!var6.field258.field1718) {
                        break label270;
                    }
                    var6.field3325 = true;
                    if (~var9 != -2) {
                        if (~(1 & var9) == -1 && ~(var6.field3389 & 127) == -1 && ~(127 & var6.field3341) == -1 || ~(1 & var9) == -2 && ~(127 & var6.field3389) == -65 && (var6.field3341 & 127) == 64) {
                            int var10 = -(var9 * 64) + var6.field3389 >> 7;
                            int var11 = -(var9 * 64) + var6.field3341 >> 7;
                            int var12 = var9 + var10;
                            if (~var10 > -1) {
                                var10 = 0;
                            }
                            if (~var12 < -105) {
                                var12 = 104;
                            }
                            int var13 = var9 + var11;
                            if (var11 < 0) {
                                var11 = 0;
                            }
                            if (var13 > 104) {
                                var13 = 104;
                            }
                            boolean var14 = true;
                            for (int var15 = var10; var12 > var15; ++var15) {
                                for (int var18 = var11; ~var13 < ~var18; ++var18) {
                                    if (class105.field1682[var15][var18] <= 1) {
                                        var14 = false;
                                        break;
                                    }
                                }
                            }
                            if (var14) {
                                int var16 = var10;
                                while (true) {
                                    if (var16 >= var12) {
                                        break label270;
                                    }
                                    for (int var17 = var11; var17 < var13; ++var17) {
                                        var10002 = class105.field1682[var16][var17]--;
                                    }
                                    ++var16;
                                }
                            }
                        }
                    } else if ((127 & var6.field3389) == 64 && ~(var6.field3341 & 127) == -65) {
                        int var19 = var6.field3389 >> 7;
                        int var20 = var6.field3341 >> 7;
                        if (~var19 > -1 || var19 >= 104 || ~var20 > -1 || var20 >= 104) {
                            break label270;
                        }
                        if (~class105.field1682[var19][var20] < -2) {
                            var10002 = class105.field1682[var19][var20]--;
                            break label270;
                        }
                    }
                    var6.field3325 = false;
                    if (!var6.field258.field1773) {
                        var7 |= Long.MIN_VALUE;
                    }
                    var6.field3350 = class225.method1583(var6.field3341, var6.field3389, class250.field3980, 0);
                    class270.method1824(class250.field3980, var6.field3389, var6.field3341, var6.field3350, var9 * 64 + 60 - 64, var6, var6.field3320, var7, var6.field3396);
                }
            }
            ++var5;
        }
        ++field2602;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class188.method1286(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << 7;
                int var7 = arg3 << 7;
                return class204.method1409(var6 + 1, class124.field2012[arg0][arg1][arg3] + arg5, var7 + 1) && class204.method1409(var6 + 128 - 1, class124.field2012[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class204.method1409(var6 + 128 - 1, class124.field2012[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class204.method1409(var6 + 1, class124.field2012[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class284.field4482[arg0][var8][var14] == -class20.field344) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class124.field2012[arg0][arg1][arg3] + arg5;
            if (!class204.method1409(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << 7) - 1;
                if (!class204.method1409(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << 7) - 1;
                    if (!class204.method1409(var9, var11, var13)) {
                        return false;
                    } else if (!class204.method1409(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(B)V")
    public static final void method1129(byte arg0) {
        ++field2595;
        if (~class138.field2264 != -1) {
            try {
                if (arg0 >= 113) {
                    if (++class273.field4310 > 2000) {
                        if (class5.field69 != null) {
                            class5.field69.method7((byte) 18);
                            class5.field69 = null;
                        }
                        if (class70.field1154 >= 1) {
                            class138.field2264 = 0;
                            class145.field2330 = -5;
                            return;
                        }
                        class273.field4310 = 0;
                        class138.field2264 = 1;
                        if (class99.field1628 != class245.field3922) {
                            class245.field3922 = class99.field1628;
                        } else {
                            class245.field3922 = class271.field4276;
                        }
                        ++class70.field1154;
                    }
                    if (class138.field2264 == 1) {
                        class16.field282 = class105.field1684.method1135(82, class200.field3195, class245.field3922);
                        class138.field2264 = 2;
                    }
                    if (~class138.field2264 == -3) {
                        if (~class16.field282.field2589 == -3) {
                            throw new IOException();
                        }
                        if (class16.field282.field2589 != 1) {
                            return;
                        }
                        class5.field69 = new class1((Socket) class16.field282.field2594, class105.field1684);
                        class16.field282 = null;
                        class5.field69.method2(0, class68.field1113.field3653, -112, class68.field1113.field3655);
                        if (class74.field1203 != null) {
                            class74.field1203.method1191(2);
                        }
                        if (class13.field243 != null) {
                            class13.field243.method1191(2);
                        }
                        int var1 = class5.field69.method9(17335);
                        if (class74.field1203 != null) {
                            class74.field1203.method1191(2);
                        }
                        if (class13.field243 != null) {
                            class13.field243.method1191(2);
                        }
                        if (~var1 != -22) {
                            class145.field2330 = var1;
                            class138.field2264 = 0;
                            class5.field69.method7((byte) 18);
                            class5.field69 = null;
                            return;
                        }
                        class138.field2264 = 3;
                    }
                    if (class138.field2264 == 3) {
                        if (~class5.field69.method6(112) > -2) {
                            return;
                        }
                        class103.field1677 = new String[class5.field69.method9(17335)];
                        class138.field2264 = 4;
                    }
                    if (class138.field2264 == 4) {
                        if (~class5.field69.method6(-127) <= ~(class103.field1677.length * 8)) {
                            class67.field1103.field3655 = 0;
                            class5.field69.method4(class103.field1677.length * 8, (byte) 119, 0, class67.field1103.field3653);
                            for (int var2 = 0; class103.field1677.length > var2; ++var2) {
                                class103.field1677[var2] = class141.method979(class67.field1103.method1507(-116), (byte) -112);
                            }
                            class145.field2330 = 21;
                            class138.field2264 = 0;
                            class5.field69.method7((byte) 18);
                            class5.field69 = null;
                        }
                    }
                }
            } catch (IOException var3) {
                if (class5.field69 != null) {
                    class5.field69.method7((byte) 18);
                    class5.field69 = null;
                }
                if (~class70.field1154 > -2) {
                    class273.field4310 = 0;
                    if (~class99.field1628 == ~class245.field3922) {
                        class245.field3922 = class271.field4276;
                    } else {
                        class245.field3922 = class99.field1628;
                    }
                    ++class70.field1154;
                    class138.field2264 = 1;
                } else {
                    class145.field2330 = -4;
                    class138.field2264 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (arg0 < 62) {
            field2600 = null;
        }
        if (~arg2 == -1) {
            this.field2596 = arg1.method1521((byte) 113);
        }
        ++field2603;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field2601;
        int[] var3 = super.field110.method1585(0, arg1);
        if (arg0 != 3) {
            field2597 = -125;
        }
        if (super.field110.field3734) {
            int[] var4 = this.method61(arg1 + -1 & class92.field1523, -48, 0);
            int[] var5 = this.method61(arg1, 126, 0);
            int[] var6 = this.method61(arg1 - -1 & class92.field1523, -77, 0);
            for (int var7 = 0; var7 < class231.field3798; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field2596;
                int var9 = (var5[class287.field4537 & var7 + 1] + -var5[class287.field4537 & var7 + -1]) * this.field2596;
                int var10 = var9 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var8 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var11 + 4096 + var13) / 4096.0F)));
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BJ)V")
    public static final void method1130(byte arg0, long arg1) {
        ++field2598;
        class68.field1113.field3655 = 0;
        class68.field1113.method1548(-494964184, 21);
        class68.field1113.method1502((byte) -124, arg1);
        class273.field4310 = 0;
        class70.field1154 = 0;
        class145.field2330 = -3;
        if (arg0 != -95) {
            field2597 = -74;
        }
        class138.field2264 = 1;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Log;I)V")
    public static final void method1131(class221 arg0, int arg1) {
        ++field2604;
        int var2 = 89 / ((arg1 - 35) / 34);
        while (true) {
            while (~arg0.field3655 > ~arg0.field3653.length) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (~arg0.method1517((byte) -96) == -2) {
                    var4 = arg0.method1517((byte) -96);
                    var5 = arg0.method1517((byte) -96);
                    var3 = true;
                }
                int var6 = arg0.method1517((byte) -96);
                int var7 = arg0.method1517((byte) -96);
                int var8 = class210.field3428 - 1 + -(var7 * 64) + class223.field3692;
                int var9 = var6 * 64 + -class161.field2568;
                if (~var9 <= -1 && ~(var8 + -63) <= -1 && ~(var9 - -63) > ~class1.field17 && ~var8 > ~class210.field3428) {
                    int var10 = var8 >> 6;
                    int var11 = var9 >> 6;
                    for (int var12 = 0; ~var12 > -65; ++var12) {
                        for (int var13 = 0; var13 < 64; ++var13) {
                            if (!var3 || ~(var4 * 8) >= ~var12 && ~(var4 * 8 + 8) < ~var12 && var5 * 8 <= var13 && var13 < var5 * 8 + 8) {
                                int var14 = arg0.method1517((byte) -96);
                                if (var14 != 0) {
                                    if (~(var14 & 1) == -2) {
                                        int var15 = arg0.method1517((byte) -96);
                                        if (class119.field1948[var11][var10] == null) {
                                            class119.field1948[var11][var10] = new byte[4096];
                                        }
                                        class119.field1948[var11][var10][(-var13 + 63 << 6) + var12] = (byte) var15;
                                    }
                                    if (~(2 & var14) == -3) {
                                        int var16 = arg0.method1531(65280);
                                        if (class95.field1559[var11][var10] == null) {
                                            class95.field1559[var11][var10] = new int[4096];
                                        }
                                        class95.field1559[var11][var10][(-var13 + 63 << 6) + var12] = var16;
                                    }
                                    if ((var14 & 4) == 4) {
                                        int var17 = arg0.method1531(65280);
                                        if (class183.field2878[var11][var10] == null) {
                                            class183.field2878[var11][var10] = new int[4096];
                                        }
                                        --var17;
                                        class135 var18 = class209.method1447(var17, -6653);
                                        if (var18.field2209 != null) {
                                            var18 = var18.method953(102);
                                            if (var18 == null || var18.field2187 == -1) {
                                                continue;
                                            }
                                        }
                                        class183.field2878[var11][var10][(-var13 + 63 << 6) + var12] = var18.field2173 + 1;
                                        class195 var19 = new class195();
                                        var19.field3114 = var8;
                                        var19.field3117 = var18.field2187;
                                        var19.field3124 = var9;
                                        class143.field2302.method855(false, var19);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var20 = 0; ~var20 > ~(var3 ? 64 : 4096); ++var20) {
                        int var21 = arg0.method1517((byte) -96);
                        if (var21 != 0) {
                            if (~(1 & var21) == -2) {
                                ++arg0.field3655;
                            }
                            if (~(2 & var21) == -3) {
                                arg0.field3655 += 2;
                            }
                            if ((var21 & 4) == 4) {
                                arg0.field3655 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }
}
