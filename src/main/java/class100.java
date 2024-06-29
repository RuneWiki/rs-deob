import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class100 extends class185 {

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
    private int field1568 = 4096;

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "I")
    private int field1578 = 4096;

    @OriginalMember(owner = "client!uk", name = "X", descriptor = "I")
    private int field1582 = 4096;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    public static int field1574 = 127;

    @OriginalMember(owner = "client!uk", name = "V", descriptor = "Lwg;")
    public static class177 field1580 = new class177(5000);

    @OriginalMember(owner = "client!uk", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field1585 = "Loaded input handler";

    @OriginalMember(owner = "client!uk", name = "bb", descriptor = "[I")
    public static int[] field1586 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!uk", name = "W", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!uk", name = "Y", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "Lsb;")
    public static class230 field1575;

    @OriginalMember(owner = "client!uk", name = "Z", descriptor = "[[[B")
    public static byte[][][] field1584;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method39(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1578 = -37;
        }
        ++field1572;
        int[][] var3 = super.field2802.method753(1, arg1);
        if (super.field2802.field1807) {
            int[][] var4 = this.method1152(false, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class174.field2648 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var8[var11] = this.field1568 * var12 >> 12;
                    var9[var11] = this.field1582 * var13 >> 12;
                    var10[var11] = this.field1578 * var14 >> 12;
                } else {
                    var8[var11] = this.field1568;
                    var9[var11] = this.field1582;
                    var10[var11] = this.field1578;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(B)I")
    public static final int method642(byte arg0) {
        ++field1569;
        try {
            if (~class20.field229 == -1) {
                if (-5000L + class263.method1754(123) < class294.field4642) {
                    return 0;
                }
                class177.field2713 = class209.field3147.method68(class158.field2431, 0, class154.field2325);
                class223.field3342 = class263.method1754(-88);
                class20.field229 = 1;
            }
            if (~(class223.field3342 + 30000L) > ~class263.method1754(4)) {
                return class70.method462((byte) -93, 1000);
            } else {
                if (class20.field229 == 1) {
                    if (class177.field2713.field1249 == 2) {
                        return class70.method462((byte) -77, 1001);
                    }
                    if (~class177.field2713.field1249 != -2) {
                        return -1;
                    }
                    int var1 = 0;
                    class44.field706 = new class157((Socket) class177.field2713.field1250, class209.field3147);
                    class177.field2713 = null;
                    if (class253.field3838) {
                        var1 = class141.field2062;
                    }
                    class196.field2979.field3748 = 0;
                    class196.field2979.method1568(23, (byte) 49);
                    class196.field2979.method1577((byte) 88, var1);
                    class44.field706.method951(class196.field2979.field3748, 81, 0, class196.field2979.field3723);
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
                    if (var2 != 0) {
                        return class70.method462((byte) -99, var2);
                    }
                    class20.field229 = 2;
                }
                if (~class20.field229 == -3) {
                    if (~class44.field706.method953(0) > -3) {
                        return -1;
                    }
                    class142.field2083 = class44.field706.method950(true);
                    class142.field2083 <<= 8;
                    class142.field2083 += class44.field706.method950(true);
                    class248.field3762 = new byte[class142.field2083];
                    class54.field882 = 0;
                    class20.field229 = 3;
                }
                if (arg0 != -74) {
                    field1574 = 13;
                }
                if (~class20.field229 == -4) {
                    int var3 = class44.field706.method953(0);
                    if (var3 < 1) {
                        return -1;
                    } else {
                        if (-class54.field882 + class142.field2083 < var3) {
                            var3 = -class54.field882 + class142.field2083;
                        }
                        class44.field706.method946(class248.field3762, true, var3, class54.field882);
                        class54.field882 += var3;
                        if (class142.field2083 > class54.field882) {
                            return -1;
                        } else if (!class247.method1559((byte) 117, class248.field3762)) {
                            return class70.method462((byte) -103, 1002);
                        } else {
                            int var4 = 0;
                            class52.field844 = new class266[class158.field2425];
                            for (int var5 = class81.field1304; var5 <= class22.field267; ++var5) {
                                class266 var6 = class209.method1343(var5, (byte) -39);
                                if (var6 != null) {
                                    class52.field844[var4++] = var6;
                                }
                            }
                            class44.field706.method955((byte) 101);
                            class285.field4274 = 0;
                            class20.field229 = 0;
                            class44.field706 = null;
                            class248.field3762 = null;
                            class294.field4642 = class263.method1754(21);
                            return 0;
                        }
                    }
                } else {
                    return -1;
                }
            }
        } catch (IOException var7) {
            return class70.method462((byte) -76, 1003);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ICI)I")
    public static final int method643(int arg0, char arg1, int arg2) {
        ++field1581;
        int var3 = arg1 << 4;
        if (arg0 != -1631918684) {
            return 14;
        } else {
            if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
                arg1 = Character.toLowerCase(arg1);
                var3 = (arg1 << 4) + 1;
            }
            if (arg1 == 241 && arg2 == 0) {
                var3 = 1762;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
    public class100() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILte;IIIBZ)Lsb;")
    public static final class230 method644(int arg0, class79 arg1, int arg2, int arg3, int arg4, byte arg5, boolean arg6) {
        ++field1576;
        int var8 = arg2 - -(!arg6 ? 0 : 65536) - -(arg0 << 17) - -(arg4 << 19);
        long var9 = (long) arg3 * 3147483667L + (long) var8 * 3849834839L;
        class230 var11 = (class230) class153.field2236.method1777(var9, (byte) 112);
        if (var11 != null) {
            return var11;
        } else {
            if (arg5 != 38) {
                method648(62, 113, -120, 92, -63, -111, 0);
            }
            class249.field3783 = false;
            class230 var12 = class149.method904(arg0, arg2, false, false, arg3, (byte) 68, arg4, arg6, arg1);
            if (var12 != null && !class249.field3783) {
                class153.field2236.method1784(var9, var12, arg5 + -38);
            }
            return var12;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIILrf;Lsb;)V")
    public static final void method645(int arg0, int arg1, int arg2, int arg3, int arg4, class289 arg5, class230 arg6) {
        ++field1577;
        if (arg6 != null) {
            int var7 = (int) class84.field1336 + class154.field2311 & 2047;
            int var8 = arg3 * arg3 + arg4 * arg4;
            int var9 = 10 + Math.max(arg5.field4478 / 2, arg5.field4444 / 2);
            if (~(var9 * var9) <= ~var8) {
                int var10 = class249.field3781[var7];
                int var11 = var10 * 256 / (class82.field1324 - -256);
                int var12 = class249.field3767[var7];
                int var13 = var12 * 256 / (class82.field1324 + 256);
                int var14 = arg3 * var11 + arg4 * var13 >> 16;
                int var15 = arg4 * var11 + -(arg3 * var13) >> 16;
                ((class201) arg6).method1261(arg5.field4478 / 2 + var14 + -(arg6.field3463 / 2) + arg0, arg5.field4444 / 2 + arg1 + -(arg6.field3470 / 2) - var15, arg5.field4417, arg5.field4427);
                if (arg2 != 23) {
                    field1585 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIB)V")
    public static final void method646(int arg0, int arg1, byte arg2) {
        if (class253.field3837 == 2) {
            class259.field3949 = arg1;
            class272.field4088 = arg0;
        }
        ++field1583;
        class84.field1336 = (float) arg0;
        if (arg2 >= 105) {
            class83.field1327 = (float) arg1;
            class75.method503(false);
            class177.field2722 = true;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILpf;I)[Ldi;")
    public static final class179[] method647(int arg0, class294 arg1, int arg2) {
        ++field1573;
        if (!class225.method1431(arg0, arg1, (byte) 14)) {
            return null;
        } else {
            if (arg2 != -2007) {
                field1586 = null;
            }
            return class154.method934(true);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field1578 = arg1.method1575(false);
                }
            } else {
                this.field1582 = arg1.method1575(false);
            }
        } else {
            this.field1568 = arg1.method1575(false);
        }
        ++field1579;
        if (arg2 != -6357) {
            field1574 = -46;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method648(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class265.method1762(arg2, -1);
        if (arg5 != 3) {
            method647(-84, (class294) null, -56);
        }
        int var7 = -arg0 + arg2;
        if (~var7 > -1) {
            var7 = 0;
        }
        ++field1570;
        int var8 = 0;
        int var9 = arg2;
        int var10 = -arg2;
        int var11 = var7;
        int var12 = -1;
        int var13 = -1;
        if (arg1 >= class243.field3635 && ~arg1 >= ~class118.field1782) {
            int[] var14 = class23.field284[arg1];
            int var15 = class86.method565(class248.field3765, arg4 - arg2, class163.field2505, 8142);
            int var16 = class86.method565(class248.field3765, arg2 + arg4, class163.field2505, 8142);
            int var17 = class86.method565(class248.field3765, arg4 - var7, class163.field2505, arg5 + 8139);
            int var18 = class86.method565(class248.field3765, arg4 + var7, class163.field2505, 8142);
            class64.method429(var14, var15, (byte) 115, arg3, var17);
            class64.method429(var14, var17, (byte) 104, arg6, var18);
            class64.method429(var14, var18, (byte) 126, arg3, var16);
        }
        int var19 = -var7;
        while (~var8 > ~var9) {
            var12 += 2;
            var10 += var12;
            var13 += 2;
            var19 += var13;
            if (~var19 <= -1 && ~var11 <= -2) {
                --var11;
                var19 -= var11 << 1;
                class13.field172[var11] = var8;
            }
            ++var8;
            if (~var10 <= -1) {
                --var9;
                int var20 = -var9 + arg1;
                int var21 = arg1 - -var9;
                if (class243.field3635 <= var21 && ~var20 >= ~class118.field1782) {
                    if (var7 > var9) {
                        int var22 = class13.field172[var9];
                        int var23 = class86.method565(class248.field3765, arg4 + var8, class163.field2505, 8142);
                        int var24 = class86.method565(class248.field3765, -var8 + arg4, class163.field2505, arg5 ^ 8141);
                        int var25 = class86.method565(class248.field3765, arg4 + var22, class163.field2505, 8142);
                        int var26 = class86.method565(class248.field3765, arg4 - var22, class163.field2505, 8142);
                        if (~class118.field1782 <= ~var21) {
                            int[] var27 = class23.field284[var21];
                            class64.method429(var27, var24, (byte) 83, arg3, var26);
                            class64.method429(var27, var26, (byte) 79, arg6, var25);
                            class64.method429(var27, var25, (byte) 93, arg3, var23);
                        }
                        if (var20 >= class243.field3635) {
                            int[] var28 = class23.field284[var20];
                            class64.method429(var28, var24, (byte) 91, arg3, var26);
                            class64.method429(var28, var26, (byte) 87, arg6, var25);
                            class64.method429(var28, var25, (byte) 92, arg3, var23);
                        }
                    } else {
                        int var29 = class86.method565(class248.field3765, arg4 + var8, class163.field2505, arg5 + 8139);
                        int var30 = class86.method565(class248.field3765, arg4 - var8, class163.field2505, 8142);
                        if (class118.field1782 >= var21) {
                            class64.method429(class23.field284[var21], var30, (byte) 106, arg3, var29);
                        }
                        if (~class243.field3635 >= ~var20) {
                            class64.method429(class23.field284[var20], var30, (byte) 101, arg3, var29);
                        }
                    }
                }
                var10 -= var9 << 1;
            }
            int var31 = arg1 - -var8;
            int var32 = arg1 - var8;
            if (class243.field3635 <= var31 && class118.field1782 >= var32) {
                int var33 = arg4 + var9;
                int var34 = -var9 + arg4;
                if (class248.field3765 <= var33 && ~var34 >= ~class163.field2505) {
                    int var35 = class86.method565(class248.field3765, var33, class163.field2505, 8142);
                    int var36 = class86.method565(class248.field3765, var34, class163.field2505, arg5 + 8139);
                    if (~var7 < ~var8) {
                        int var37 = ~var11 > ~var8 ? class13.field172[var8] : var11;
                        int var38 = class86.method565(class248.field3765, arg4 + var37, class163.field2505, 8142);
                        int var39 = class86.method565(class248.field3765, arg4 - var37, class163.field2505, arg5 ^ 8141);
                        if (var31 <= class118.field1782) {
                            int[] var40 = class23.field284[var31];
                            class64.method429(var40, var36, (byte) 104, arg3, var39);
                            class64.method429(var40, var39, (byte) 117, arg6, var38);
                            class64.method429(var40, var38, (byte) 85, arg3, var35);
                        }
                        if (~var32 <= ~class243.field3635) {
                            int[] var41 = class23.field284[var32];
                            class64.method429(var41, var36, (byte) 119, arg3, var39);
                            class64.method429(var41, var39, (byte) 102, arg6, var38);
                            class64.method429(var41, var38, (byte) 98, arg3, var35);
                        }
                    } else {
                        if (~var31 >= ~class118.field1782) {
                            class64.method429(class23.field284[var31], var36, (byte) 93, arg3, var35);
                        }
                        if (var32 >= class243.field3635) {
                            class64.method429(class23.field284[var32], var36, (byte) 111, arg3, var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "(I)V")
    public static void method649(int arg0) {
        field1580 = null;
        field1586 = null;
        if (arg0 <= 111) {
            method646(-93, 31, (byte) 31);
        }
        field1575 = null;
        field1584 = null;
        field1585 = null;
    }
}
