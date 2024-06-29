import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class175 {

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "Z")
    public boolean field2132 = true;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    private int field2131 = -1;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "Lbda;")
    private class428 field2129;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Lrt;")
    private class192 field2127;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    private int field2122;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    private int field2130;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    private int field2137;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    private int field2126;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "Liaa;")
    private class419 field2128;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public int field2118;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "Leea;")
    private class112 field2120;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public static int field2134 = 16777215;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "F")
    public static float field2133;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "Lha;")
    public static class52 field2139;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "[Z")
    public static boolean[] field2125;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)I")
    public static final int method971(int arg0, int arg1, int arg2) {
        field2138++;
        if (arg0 != 60) {
            return 67;
        }
        int var3 = class629.method3603(arg1 + 45365, arg0 + 27133, arg2 + 91923, 4) + (class629.method3603(arg1 + 10294, 27193, arg2 + 37821, 2) - 128 >> 1) + (class629.method3603(arg1, 27193, arg2, 1) - 128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILiaa;B)V")
    public final void method972(int arg0, class419 arg1, byte arg2) {
        int var4 = 44 % ((arg2 - 25) / 43);
        if (arg0 > 0) {
            this.method974((byte) 45);
            this.field2129.method2459(119, this.field2120);
            this.field2129.method1801(this.field2126, this.field2137 + 1 - this.field2126, 1440, class384.field5077, arg1, arg0, 0);
        }
        field2124++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public static final void method973(byte arg0) {
        class307.field3915.method1048(-7730);
        field2136++;
        for (class99 var1 = (class99) class89.field1096.method1050((byte) 73); var1 != null; var1 = (class99) class89.field1096.method1047(-7962)) {
            if (var1.field1227 < 1000) {
                var1.method3187(true);
                class307.field3915.method1040(var1, -97);
            }
        }
        class307.field3915.method1044(class89.field1096, -24223);
        if (class199.field2397 <= 1) {
            class605.field8726 = null;
        } else if (class236.field2894 && class443.field6109.method185(53, 81) && class199.field2397 > 2) {
            class605.field8726 = (class99) class89.field1096.field2331.field7965.field7965;
        } else {
            class605.field8726 = (class99) class89.field1096.field2331.field7965;
        }
        int var2 = -1;
        if (arg0 >= -116) {
            method975(87, 32, -3, 30, 91);
        }
        class379 var3 = (class379) class5.field43.method1050((byte) 73);
        if (var3 != null) {
            var2 = var3.method700((byte) 24);
        }
        if (!class473.field6634) {
            if (var2 == 0 && (class157.field1913 == 1 && class199.field2397 > 2 || class210.method1209(101))) {
                var2 = 2;
            }
            if (var2 == 2 && class199.field2397 > 0 && var3 != null) {
                if (class289.field3757 == null && class141.field1705 == 0) {
                    class608.method3503(31911, var3.method705(5), var3.method701(5));
                } else {
                    class197.field2385 = 2;
                }
            }
            if (var2 == 0 && class199.field2397 > 0) {
                class329.method1855(18557);
            }
            if (class289.field3757 != null || class141.field1705 != 0) {
                return;
            }
            class34.field269 = null;
            class197.field2385 = 0;
            return;
        }
        if (var2 == -1) {
            int var4 = class368.field4859.method167(64);
            int var5 = class368.field4859.method169(-83);
            if (var4 < class308.field3933 - 10 || var4 > class609.field8848 + class308.field3933 + 10 || var5 < (class521.field7314 - 10) || var5 > class594.field8623 + class521.field7314 + 10) {
                class19.method123(2169);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class308.field3933;
        int var7 = class521.field7314;
        int var8 = class609.field8848;
        int var9 = var3.method701(5);
        int var10 = var3.method705(5);
        int var11 = -1;
        for (int var12 = 0; var12 < class199.field2397; var12++) {
            if (class590.field8552) {
                int var16 = var7 + ((-var12 + class199.field2397 + -1) * 16) + 33;
                if (var9 > var6 && (var6 + var8) > var9 && var10 > (var16 - 13) && var10 < var16 + 4) {
                    var11 = var12;
                }
            } else {
                int var17 = (class199.field2397 - var12 - 1) * 16 + var7 + 31;
                if (var9 > var6 && var9 < var6 + var8 && var10 > (var17 - 13) && (var17 + 3) > var10) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class580 var14 = new class580(class89.field1096);
            for (class99 var15 = (class99) var14.method3382(-19983); var15 != null; var15 = (class99) var14.method3381(-16796)) {
                if (var11 == var13) {
                    class476.method2776(var9, var15, var10, 28409);
                }
                var13++;
            }
        }
        class19.method123(2169);
        return;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V")
    private final void method974(byte arg0) {
        field2135++;
        if (!this.field2132) {
            return;
        }
        this.field2132 = false;
        byte[] var2 = this.field2127.field2310;
        int var3 = 0;
        if (arg0 != 45) {
            method971(119, -33, 88);
        }
        int var4 = this.field2127.field2312;
        int var5 = this.field2127.field2312 * this.field2122 + this.field2130;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field2120 != null && this.field2131 == var3) {
            this.field2132 = false;
            return;
        }
        this.field2131 = var3;
        int var7 = 0;
        int var8 = this.field2122 * var4 + this.field2130;
        if (!this.field2129.method1805(-116, class160.field1932, class37.field293)) {
            if (class482.field6751 == null) {
                class482.field6751 = new int[16384];
            }
            int[] var13 = class482.field6751;
            for (int var14 = -128; var14 < 0; var14++) {
                for (int var15 = -128; var15 < 0; var15++) {
                    if (var2[var8] == 0) {
                        int var16 = 0;
                        if (var2[var8 - 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 + 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 - var4] != 0) {
                            var16++;
                        }
                        if (var2[var4 + var8] != 0) {
                            var16++;
                        }
                        var13[var7++] = var16 * 17 << 24;
                    } else {
                        var13[var7++] = 1140850688;
                    }
                    var8++;
                }
                var8 += this.field2127.field2312 - 128;
            }
            if (this.field2120 == null) {
                this.field2120 = this.field2129.method2430(-126, class482.field6751, 128, 128, false);
                this.field2120.method647(false, false, (byte) 75);
            } else {
                this.field2120.method651(class482.field6751, 0, 128, 0, 128, 5826, 128, 0);
            }
            return;
        }
        if (class607.field8767 == null) {
            class607.field8767 = new byte[16384];
        }
        byte[] var9 = class607.field8767;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var4] != 0) {
                        var12++;
                    }
                    if (var2[var4 + var8] != 0) {
                        var12++;
                    }
                    var9[var7++] = (byte) (var12 * 17);
                } else {
                    var9[var7++] = 68;
                }
                var8++;
            }
            var8 += this.field2127.field2312 - 128;
        }
        if (this.field2120 == null) {
            this.field2120 = this.field2129.method2477(128, class607.field8767, 0, false, class37.field293, 128);
            this.field2120.method647(false, false, (byte) 67);
        } else {
            this.field2120.method650((byte) 125, 0, 0, 128, class37.field293, 128, 0, 128, class607.field8767);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)V")
    public static final void method975(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2121++;
        if (arg2 < 71) {
            method977(-86);
        }
        if (arg0 >= class563.field8282 && class271.field3513 >= arg0) {
            int var5 = class536.method3056(class592.field8588, 114, arg3, class470.field6589);
            int var6 = class536.method3056(class592.field8588, 118, arg1, class470.field6589);
            class78.method456(-2, arg4, var5, arg0, var6);
        }
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(B)V")
    public final void method976(byte arg0) {
        if (arg0 != -18) {
            method973((byte) 114);
        }
        this.method972(this.field2118, this.field2128, (byte) -85);
        field2119++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static void method977(int arg0) {
        field2125 = null;
        if (arg0 != -7319) {
            method977(117);
        }
        field2139 = null;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lbda;Lrt;Lml;IIIII)V")
    public class175(class428 arg0, class192 arg1, class325 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field2129 = arg0;
        this.field2127 = arg1;
        this.field2122 = arg7;
        this.field2130 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field2116 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field4124[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field2120 = null;
            this.field2118 = 0;
        } else {
            this.field2137 = Integer.MIN_VALUE;
            this.field2126 = Integer.MAX_VALUE;
            this.field2128 = this.field2129.method1795(false, (byte) -89);
            this.field2128.method644(-113, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field2128.method440(-106, true);
                if (var15 != null) {
                    Stream var16 = this.field2129.method2426(var15, (byte) 11);
                    if (Stream.method3340()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field2116 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field4124[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (this.field2126 > var28) {
                                            this.field2126 = var28;
                                        }
                                        if (this.field2137 < var28) {
                                            this.field2137 = var28;
                                        }
                                        var16.method3339(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field2116 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field4124[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field2126 > var22) {
                                            this.field2126 = var22;
                                        }
                                        if (this.field2137 < var22) {
                                            this.field2137 = var22;
                                        }
                                        var16.method3341(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3342();
                    if (this.field2128.method442(82)) {
                        break;
                    }
                }
            }
            this.field2118 = var10 / 3;
        }
    }
}
