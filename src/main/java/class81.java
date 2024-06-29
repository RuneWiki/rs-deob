import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class81 extends class185 {

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "Lik;")
    public static class267 field1297 = new class267(64);

    @OriginalMember(owner = "client!ld", name = "bb", descriptor = "Z")
    public static boolean field1309 = false;

    @OriginalMember(owner = "client!ld", name = "ab", descriptor = "[Ljava/lang/String;")
    public static String[] field1308 = new String[5];

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    private int field1300;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    private int field1302;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!ld", name = "cb", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "Lsb;")
    public static class230 field1305;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        if (arg0 == 0) {
            this.method534(true, arg1.method1587(-128));
        }
        if (arg2 != -6357) {
            field1304 = -62;
        }
        ++field1307;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lrf;IZ)I")
    public static final int method531(class289 arg0, int arg1, boolean arg2) {
        ++field1295;
        if (arg0.field4510 != null && ~arg1 > ~arg0.field4510.length) {
            if (arg2) {
                method531((class289) null, -95, false);
            }
            try {
                int[] var3 = arg0.field4510[arg1];
                int var4 = 0;
                int var5 = 0;
                byte var6 = 0;
                while (true) {
                    int var7 = 0;
                    int var8 = var3[var5++];
                    byte var9 = 0;
                    if (var8 == 0) {
                        return var4;
                    }
                    if (var8 == 15) {
                        var9 = 1;
                    }
                    if (var8 == 16) {
                        var9 = 2;
                    }
                    if (~var8 == -2) {
                        var7 = class231.field3479[var3[var5++]];
                    }
                    if (~var8 == -3) {
                        var7 = class155.field2327[var3[var5++]];
                    }
                    if (~var8 == -18) {
                        var9 = 3;
                    }
                    if (var8 == 3) {
                        var7 = class93.field1481[var3[var5++]];
                    }
                    if (~var8 == -5) {
                        int var10 = var3[var5++] << 16;
                        int var11 = var10 + var3[var5++];
                        class289 var12 = class89.method574((byte) -15, var11);
                        int var13 = var3[var5++];
                        if (var13 != -1 && (!class160.method999(var13, 0).field653 || class106.field1615)) {
                            for (int var14 = 0; var12.field4513.length > var14; ++var14) {
                                if (~(var13 + 1) == ~var12.field4513[var14]) {
                                    var7 += var12.field4448[var14];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var7 = class35.field494[var3[var5++]];
                    }
                    if (var8 == 6) {
                        var7 = class254.field3867[class155.field2327[var3[var5++]] - 1];
                    }
                    if (var8 == 7) {
                        var7 = class35.field494[var3[var5++]] * 100 / 46875;
                    }
                    if (~var8 == -9) {
                        var7 = class165.field2537.field1647;
                    }
                    if (~var8 == -10) {
                        for (int var15 = 0; ~var15 > -26; ++var15) {
                            if (class160.field2459[var15]) {
                                var7 += class155.field2327[var15];
                            }
                        }
                    }
                    if (~var8 == -11) {
                        int var16 = var3[var5++] << 16;
                        int var17 = var16 + var3[var5++];
                        class289 var18 = class89.method574((byte) -15, var17);
                        int var19 = var3[var5++];
                        if (~var19 != 0 && (!class160.method999(var19, 0).field653 || class106.field1615)) {
                            for (int var20 = 0; ~var20 > ~var18.field4513.length; ++var20) {
                                if (~(var19 - -1) == ~var18.field4513[var20]) {
                                    var7 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (~var8 == -12) {
                        var7 = class118.field1783;
                    }
                    if (var8 == 12) {
                        var7 = class234.field3535;
                    }
                    if (~var8 == -14) {
                        int var21 = class35.field494[var3[var5++]];
                        int var22 = var3[var5++];
                        var7 = ~(1 << var22 & var21) == -1 ? 0 : 1;
                    }
                    if (~var8 == -15) {
                        int var23 = var3[var5++];
                        var7 = class275.method1826(-1914808948, var23);
                    }
                    if (~var8 == -19) {
                        var7 = (class165.field2537.field2251 >> 7) + field1303;
                    }
                    if (var8 == 19) {
                        var7 = (class165.field2537.field2234 >> 7) + class147.field2141;
                    }
                    if (~var8 == -21) {
                        var7 = var3[var5++];
                    }
                    if (~var9 != -1) {
                        var6 = var9;
                    } else {
                        if (~var6 == -1) {
                            var4 += var7;
                        }
                        if (~var6 == -2) {
                            var4 -= var7;
                        }
                        if (var6 == 2 && var7 != 0) {
                            var4 /= var7;
                        }
                        if (~var6 == -4) {
                            var4 *= var7;
                        }
                        var6 = 0;
                    }
                }
            } catch (Exception var24) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)V")
    public static final void method532(byte arg0) {
        int var1 = 95 % ((arg0 - 13) / 62);
        ++field1296;
        if (class163.field2501 != 0) {
            try {
                if (++class110.field1708 > 2000) {
                    if (class44.field706 != null) {
                        class44.field706.method955((byte) -111);
                        class44.field706 = null;
                    }
                    if (class234.field3523 >= 1) {
                        class163.field2501 = 0;
                        class61.field970 = -5;
                        return;
                    }
                    if (~class278.field4192 != ~class256.field3897) {
                        class256.field3897 = class278.field4192;
                    } else {
                        class256.field3897 = class284.field4257;
                    }
                    class110.field1708 = 0;
                    ++class234.field3523;
                    class163.field2501 = 1;
                }
                if (~class163.field2501 == -2) {
                    class177.field2713 = class209.field3147.method68(class210.field3162, 0, class256.field3897);
                    class163.field2501 = 2;
                }
                if (~class163.field2501 == -3) {
                    if (class177.field2713.field1249 == 2) {
                        throw new IOException();
                    }
                    if (~class177.field2713.field1249 != -2) {
                        return;
                    }
                    class44.field706 = new class157((Socket) class177.field2713.field1250, class209.field3147);
                    class177.field2713 = null;
                    class44.field706.method951(class196.field2979.field3748, 65, 0, class196.field2979.field3723);
                    if (class147.field2144 != null) {
                        class147.field2144.method445((byte) 122);
                    }
                    if (class192.field2958 != null) {
                        class192.field2958.method445((byte) 122);
                    }
                    int var2 = class44.field706.method950(true);
                    if (class147.field2144 != null) {
                        class147.field2144.method445((byte) 122);
                    }
                    if (class192.field2958 != null) {
                        class192.field2958.method445((byte) 122);
                    }
                    if (~var2 != -22) {
                        class163.field2501 = 0;
                        class61.field970 = var2;
                        class44.field706.method955((byte) 77);
                        class44.field706 = null;
                        return;
                    }
                    class163.field2501 = 3;
                }
                if (~class163.field2501 == -4) {
                    if (class44.field706.method953(0) < 1) {
                        return;
                    }
                    class211.field3168 = new String[class44.field706.method950(true)];
                    class163.field2501 = 4;
                }
                if (~class163.field2501 == -5) {
                    if (class44.field706.method953(0) >= class211.field3168.length * 8) {
                        class100.field1580.field3748 = 0;
                        class44.field706.method946(class100.field1580.field3723, true, class211.field3168.length * 8, 0);
                        for (int var3 = 0; var3 < class211.field3168.length; ++var3) {
                            class211.field3168[var3] = class98.method632(0, class100.field1580.method1608(11119));
                        }
                        class163.field2501 = 0;
                        class61.field970 = 21;
                        class44.field706.method955((byte) 79);
                        class44.field706 = null;
                    }
                }
            } catch (IOException var4) {
                if (class44.field706 != null) {
                    class44.field706.method955((byte) 64);
                    class44.field706 = null;
                }
                if (~class234.field3523 <= -2) {
                    class61.field970 = -4;
                    class163.field2501 = 0;
                } else {
                    class110.field1708 = 0;
                    if (class278.field4192 != class256.field3897) {
                        class256.field3897 = class278.field4192;
                    } else {
                        class256.field3897 = class284.field4257;
                    }
                    class163.field2501 = 1;
                    ++class234.field3523;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method39(boolean arg0, int arg1) {
        int[][] var3 = super.field2802.method753(1, arg1);
        ++field1293;
        if (!arg0) {
            this.method39(false, 79);
        }
        if (super.field2802.field1807) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class174.field2648; ++var7) {
                var4[var7] = this.field1299;
                var5[var7] = this.field1300;
                var6[var7] = this.field1302;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(I)V")
    private class81(int arg0) {
        super(0, false);
        this.method534(true, arg0);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ[[[Lnd;III)Z")
    public static final boolean method533(int arg0, boolean arg1, class270[][][] arg2, int arg3, int arg4, int arg5) {
        ++field1310;
        byte var6 = !arg1 ? (byte) (class246.field3674 & 255) : 1;
        if (class272.field4093[class99.field1557][arg4][arg5] == var6) {
            return false;
        } else if (~(class221.field3333[class99.field1557][arg4][arg5] & 4) == -1) {
            return false;
        } else {
            int var7 = 0;
            byte var8 = 0;
            if (arg3 != -2873) {
                return false;
            } else {
                class188.field2873[var8] = arg4;
                int var31 = var8 + 1;
                class235.field3548[var8] = arg5;
                class272.field4093[class99.field1557][arg4][arg5] = var6;
                while (~var7 != ~var31) {
                    int var9 = class188.field2873[var7] & 65535;
                    int var10 = 255 & class188.field2873[var7] >> 16;
                    int var11 = 255 & class188.field2873[var7] >> 24;
                    int var12 = (class235.field3548[var7] & 16731357) >> 16;
                    int var13 = class235.field3548[var7] & 65535;
                    var7 = var7 + 1 & 4095;
                    boolean var14 = false;
                    boolean var15 = false;
                    if ((4 & class221.field3333[class99.field1557][var9][var13]) == 0) {
                        var14 = true;
                    }
                    label229: for (int var16 = class99.field1557 + 1; ~var16 >= -4; ++var16) {
                        if (~(class221.field3333[var16][var9][var13] & 8) == -1) {
                            if (var14 && arg2[var16][var9][var13] != null) {
                                if (arg2[var16][var9][var13].field4084 != null) {
                                    int var19 = class75.method505(var10, -31119);
                                    if (arg2[var16][var9][var13].field4084.field2476 == var19 || ~arg2[var16][var9][var13].field4084.field2477 == ~var19) {
                                        continue;
                                    }
                                    if (var11 != 0) {
                                        int var20 = class75.method505(var11, arg3 ^ 29366);
                                        if (~arg2[var16][var9][var13].field4084.field2476 == ~var20 || arg2[var16][var9][var13].field4084.field2477 == var20) {
                                            continue;
                                        }
                                    }
                                    if (~var12 != -1) {
                                        int var21 = class75.method505(var12, -31119);
                                        if (~arg2[var16][var9][var13].field4084.field2476 == ~var21 || arg2[var16][var9][var13].field4084.field2477 == var21) {
                                            continue;
                                        }
                                    }
                                }
                                if (arg2[var16][var9][var13].field4069 != null) {
                                    for (int var22 = 0; ~arg2[var16][var9][var13].field4071 < ~var22; ++var22) {
                                        int var23 = (int) (3L & arg2[var16][var9][var13].field4069[var22].field28 >> 20);
                                        int var24 = (int) (63L & arg2[var16][var9][var13].field4069[var22].field28 >> 14);
                                        if (var24 == 21) {
                                            var24 = 19;
                                        }
                                        int var25 = var23 << 6 | var24;
                                        if (~var10 == ~var25 || ~var11 != -1 && var11 == var25 || ~var12 != -1 && ~var12 == ~var25) {
                                            continue label229;
                                        }
                                    }
                                }
                            }
                            class270 var26 = arg2[var16][var9][var13];
                            if (var26 != null && var26.field4071 > 0) {
                                for (int var27 = 0; ~var27 > ~var26.field4071; ++var27) {
                                    class2 var28 = var26.field4069[var27];
                                    if (var28.field26 != var28.field25 || var28.field34 != var28.field23) {
                                        for (int var29 = var28.field26; var28.field25 >= var29; ++var29) {
                                            for (int var30 = var28.field23; var28.field34 >= var30; ++var30) {
                                                class272.field4093[var16][var29][var30] = var6;
                                            }
                                        }
                                    }
                                }
                            }
                            var15 = true;
                            class272.field4093[var16][var9][var13] = var6;
                        }
                    }
                    if (var15) {
                        if (~class97.field1531[arg0] > ~class67.field1072[class99.field1557 + 1][var9][var13]) {
                            class97.field1531[arg0] = class67.field1072[class99.field1557 + 1][var9][var13];
                        }
                        int var17 = var13 << 7;
                        int var18 = var9 << 7;
                        if (~class237.field3581[arg0] >= ~var18) {
                            if (~class180.field2735[arg0] > ~var18) {
                                class180.field2735[arg0] = var18;
                            }
                        } else {
                            class237.field3581[arg0] = var18;
                        }
                        if (var17 < class77.field1238[arg0]) {
                            class77.field1238[arg0] = var17;
                        } else if (~class220.field3310[arg0] > ~var17) {
                            class220.field3310[arg0] = var17;
                        }
                    }
                    if (!var14) {
                        if (var9 >= 1 && class272.field4093[class99.field1557][var9 + -1][var13] != var6) {
                            class188.field2873[var31] = class63.method428(class63.method428(1179648, var9 + -1), -754974720);
                            class235.field3548[var31] = class63.method428(1245184, var13);
                            class272.field4093[class99.field1557][var9 + -1][var13] = var6;
                            var31 = 4095 & var31 + 1;
                        }
                        ++var13;
                        if (~var13 > -105) {
                            if (var9 - 1 >= 0 && ~class272.field4093[class99.field1557][var9 - 1][var13] != ~var6 && (class221.field3333[class99.field1557][var9][var13] & 4) == 0 && (class221.field3333[class99.field1557][var9 + -1][var13 + -1] & 4) == 0) {
                                class188.field2873[var31] = class63.method428(1375731712, class63.method428(var9 - 1, 1179648));
                                class235.field3548[var31] = class63.method428(1245184, var13);
                                var31 = var31 - -1 & 4095;
                                class272.field4093[class99.field1557][var9 + -1][var13] = var6;
                            }
                            if (class272.field4093[class99.field1557][var9][var13] != var6) {
                                class188.field2873[var31] = class63.method428(318767104, class63.method428(5373952, var9));
                                class235.field3548[var31] = class63.method428(var13, 5439488);
                                var31 = var31 + 1 & 4095;
                                class272.field4093[class99.field1557][var9][var13] = var6;
                            }
                            if (~(var9 + 1) > -105 && class272.field4093[class99.field1557][var9 + 1][var13] != var6 && (4 & class221.field3333[class99.field1557][var9][var13]) == 0 && ~(4 & class221.field3333[class99.field1557][var9 + 1][var13 + -1]) == -1) {
                                class188.field2873[var31] = class63.method428(-1845493760, class63.method428(5373952, var9 + 1));
                                class235.field3548[var31] = class63.method428(5439488, var13);
                                class272.field4093[class99.field1557][var9 + 1][var13] = var6;
                                var31 = var31 + 1 & 4095;
                            }
                        }
                        --var13;
                        if (~(var9 + 1) > -105 && class272.field4093[class99.field1557][var9 + 1][var13] != var6) {
                            class188.field2873[var31] = class63.method428(1392508928, class63.method428(var9 + 1, 9568256));
                            class235.field3548[var31] = class63.method428(9633792, var13);
                            var31 = 4095 & var31 + 1;
                            class272.field4093[class99.field1557][var9 - -1][var13] = var6;
                        }
                        --var13;
                        if (~var13 <= -1) {
                            if (~(var9 + -1) <= -1 && class272.field4093[class99.field1557][var9 + -1][var13] != var6 && (class221.field3333[class99.field1557][var9][var13] & 4) == 0 && (4 & class221.field3333[class99.field1557][var9 + -1][var13 - -1]) == 0) {
                                class188.field2873[var31] = class63.method428(301989888, class63.method428(13762560, var9 + -1));
                                class235.field3548[var31] = class63.method428(13828096, var13);
                                class272.field4093[class99.field1557][var9 + -1][var13] = var6;
                                var31 = var31 - -1 & 4095;
                            }
                            if (class272.field4093[class99.field1557][var9][var13] != var6) {
                                class188.field2873[var31] = class63.method428(-1828716544, class63.method428(var9, 13762560));
                                class235.field3548[var31] = class63.method428(var13, 13828096);
                                var31 = 4095 & var31 + 1;
                                class272.field4093[class99.field1557][var9][var13] = var6;
                            }
                            if (~(var9 + 1) > -105 && class272.field4093[class99.field1557][var9 - -1][var13] != var6 && ~(class221.field3333[class99.field1557][var9][var13] & 4) == -1 && ~(4 & class221.field3333[class99.field1557][var9 + 1][var13 - -1]) == -1) {
                                class188.field2873[var31] = class63.method428(class63.method428(9568256, var9 + 1), -771751936);
                                class235.field3548[var31] = class63.method428(9633792, var13);
                                var31 = 4095 & var31 - -1;
                                class272.field4093[class99.field1557][var9 + 1][var13] = var6;
                            }
                        }
                    }
                }
                if (class97.field1531[arg0] != -1000000) {
                    class97.field1531[arg0] += 10;
                    class237.field3581[arg0] -= 50;
                    class180.field2735[arg0] += 50;
                    class220.field3310[arg0] += 50;
                    class77.field1238[arg0] -= 50;
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(ZI)V")
    private final void method534(boolean arg0, int arg1) {
        this.field1302 = arg1 << 4 & 4080;
        ++field1298;
        this.field1299 = (16711680 & arg1) >> 12;
        this.field1300 = arg1 >> 4 & 4080;
        if (!arg0) {
            field1297 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "(I)V")
    public static void method535(int arg0) {
        field1297 = null;
        field1305 = null;
        if (arg0 != 0) {
            field1304 = -122;
        }
        field1308 = null;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class81() {
        this(0);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lkd;")
    public static final class209 method536(Throwable arg0, String arg1) {
        class209 var2;
        if (!(arg0 instanceof class209)) {
            var2 = new class209(arg0, arg1);
        } else {
            var2 = (class209) arg0;
            var2.field3149 = var2.field3149 + ' ' + arg1;
        }
        ++field1294;
        return var2;
    }
}
