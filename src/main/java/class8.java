import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class8 extends class64 {

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    private int field143 = 0;

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "I")
    private int field149 = 25;

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    private int field147 = 5;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
    private int field142 = 5;

    @OriginalMember(owner = "client!ag", name = "db", descriptor = "I")
    private int field156 = 1;

    @OriginalMember(owner = "client!ag", name = "gb", descriptor = "I")
    private int field159 = 2;

    @OriginalMember(owner = "client!ag", name = "qb", descriptor = "I")
    private int field169 = 2048;

    @OriginalMember(owner = "client!ag", name = "fb", descriptor = "I")
    public static int field158 = 0;

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "Lcd;")
    public static class23 field152 = class54.method414("da dieser Computer gegen unsere ", -1);

    @OriginalMember(owner = "client!ag", name = "ib", descriptor = "[I")
    public static int[] field161 = new int[32768];

    @OriginalMember(owner = "client!ag", name = "ob", descriptor = "Z")
    public static boolean field167 = false;

    @OriginalMember(owner = "client!ag", name = "pb", descriptor = "[[S")
    public static short[][] field168 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
    private int field151;

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!ag", name = "eb", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!ag", name = "hb", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!ag", name = "jb", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client!ag", name = "kb", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!ag", name = "lb", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ag", name = "nb", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client!ag", name = "rb", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "Lgd;")
    public static class58 field145;

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "Lkh;")
    public static class97 field148;

    @OriginalMember(owner = "client!ag", name = "mb", descriptor = "[Lea;")
    public static class38[] field165;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "[[I")
    private int[][] field146;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field147 = arg2.method1202(116);
                                }
                            } else {
                                this.field142 = arg2.method1202(-18);
                            }
                        } else {
                            this.field156 = arg2.method1202(111);
                        }
                    } else {
                        this.field159 = arg2.method1202(-64);
                    }
                } else {
                    this.field169 = arg2.method1197(-1);
                }
            } else {
                this.field143 = arg2.method1202(101);
            }
        } else {
            this.field142 = this.field147 = arg2.method1202(-17);
        }
        int var5 = -50 / ((arg0 - 7) / 43);
        ++field170;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)[I")
    private final int[] method43(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg1];
        for (int var6 = 0; var6 < arg1; ++var6) {
            var5[var6] = Integer.MAX_VALUE;
        }
        int var7 = this.field166 + arg2;
        int var8 = this.field151 + arg3;
        if (var7 > 4096) {
            var7 -= 4096;
        }
        ++field153;
        int var9 = -1;
        if (var8 > 4096) {
            var8 -= 4096;
        }
        int var10 = -1;
        int var11 = this.field142 * var7 >> 12;
        int var12 = this.field147 * var8 >> 12;
        int var13 = ~this.field142 < -3 ? 2 : this.field142 + -1;
        int var14 = Integer.MAX_VALUE;
        int var15 = ~this.field147 < -3 ? 2 : this.field147 + -1;
        int var16 = Integer.MAX_VALUE;
        int var17 = -var13;
        if (arg0 != Integer.MAX_VALUE) {
            this.method50((byte) -63);
        }
        while (var13 >= var17) {
            for (int var25 = -var15; var15 >= var25; ++var25) {
                int var26 = var11 + var17;
                if (var26 < 0) {
                    var26 += this.field142;
                }
                if (var26 >= this.field142) {
                    var26 -= this.field142;
                }
                int var27 = var12 + var25;
                if (var27 < 0) {
                    var27 += this.field147;
                }
                if (~this.field147 >= ~var27) {
                    var27 -= this.field147;
                }
                int var28 = this.field142 * var27 - -var26;
                int var29 = this.field146[var28][0];
                int var30 = this.field146[var28][1];
                int var31 = -var29 + var7;
                int var32 = -var30 + var8;
                if (~var31 > -1) {
                    var31 = -var31;
                }
                if (~var31 < -2049) {
                    var31 = -var31 + 4096;
                }
                if (var32 < 0) {
                    var32 = -var32;
                }
                if (var32 > 2048) {
                    var32 = -var32 + 4096;
                }
                int var33 = var31 * var31 + var32 * var32 >> 12;
                if (~var16 < ~var33) {
                    if (~var9 == 0) {
                        var14 = var33;
                        var9 = var28;
                    } else {
                        var9 = var10;
                        var14 = var16;
                    }
                    var10 = var28;
                    var16 = var33;
                } else if (var9 == var10 && var9 != var28 || var14 > var33 && ~var10 != ~var28) {
                    var9 = var28;
                    var14 = var33;
                }
            }
            ++var17;
        }
        int var18 = var7 - this.field146[var9][0];
        int var19 = -this.field146[var9][1] + var8;
        int var20 = -this.field146[var10][1] + var8;
        if (~var19 > -1) {
            var19 = -var19;
        }
        if (var20 < 0) {
            var20 = -var20;
        }
        int var21 = var7 - this.field146[var10][0];
        if (var20 > 2048) {
            var20 = -var20 + 4096;
        }
        if (var19 > 2048) {
            var19 = 4096 - var19;
        }
        if (~var18 > -1) {
            var18 = -var18;
        }
        if (~var21 > -1) {
            var21 = -var21;
        }
        if (var18 > 2048) {
            var18 = -var18 + 4096;
        }
        if (var21 > 2048) {
            var21 = -var21 + 4096;
        }
        int var22 = this.field156;
        int var23;
        int var24;
        if (~var22 != -2) {
            if (var22 == 2) {
                var23 = Math.max(var21, var20);
                var24 = Math.max(var18, var19);
            } else {
                var24 = var18 * var18 + var19 * var19;
                var23 = var20 * var20 + var21 * var21;
            }
        } else {
            var23 = (int) Math.sqrt((double) (var20 * var20 + var21 * var21));
            var24 = (int) Math.sqrt((double) (var18 * var18 - -(var19 * var19)));
        }
        var5[0] = this.field162 * var23;
        if (~arg1 < -2) {
            var5[1] = this.field162 * var24;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V")
    public final void method44(byte arg0) {
        ++field144;
        this.method50(arg0);
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class8() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Z)V")
    public static final void method45(boolean arg0) {
        ++field160;
        int var1 = class189.field3714.method273(class85.field1834);
        for (int var2 = 0; class49.field1171 > var2; ++var2) {
            int var6 = class189.field3714.method273(class9.method52(var2, (byte) 127));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        class134.field2786 = true;
        class189.field3698 = class49.field1171 * 15 - -22;
        var1 += 8;
        int var3 = -(var1 / 2) + class65.field1535;
        if (~(var1 + var3) < -766) {
            var3 = -var1 + 765;
        }
        if (arg0) {
            field165 = null;
        }
        int var4 = class49.field1171 * 15 - -21;
        if (var3 < 0) {
            var3 = 0;
        }
        class179.field3552 = var1;
        int var5 = class43.field912;
        if (var5 - -var4 > 503) {
            var5 = -var4 + 503;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        class119.field2489 = var5;
        class134.field2789 = var3;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)V")
    public static final void method46(int arg0, int arg1) {
        ++field150;
        if (~arg1 != 0) {
            if (class129.field2678[arg1]) {
                class107.field2289.method658(-87, arg1);
                if (class100.field2114[arg1] != null) {
                    boolean var2 = true;
                    for (int var3 = 0; ~class100.field2114[arg1].length < ~var3; ++var3) {
                        if (class100.field2114[arg1][var3] != null) {
                            if (~class100.field2114[arg1][var3].field1127 != -3) {
                                class100.field2114[arg1][var3] = null;
                            } else {
                                var2 = false;
                            }
                        }
                    }
                    if (var2) {
                        class100.field2114[arg1] = null;
                    }
                    if (arg0 != 2047) {
                        field165 = null;
                    }
                    class129.field2678[arg1] = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BJ)V")
    public static final void method47(byte arg0, long arg1) {
        ++field157;
        if (~arg1 != -1L) {
            class159.field3190.method631(190, -1);
            ++class66.field1551;
            if (arg0 >= 98) {
                class159.field3190.method1199(arg1, -1898826808);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != -9421) {
            method48((byte) -48, 59);
        }
        int[] var3 = super.field1513.method1033(arg1 ^ 9376, arg0);
        ++field164;
        if (super.field1513.field3368) {
            int var4 = class95.field1995[arg0];
            int var5 = this.field159;
            if (var5 != 2) {
                if (~var5 == -2) {
                    for (int var6 = 0; ~class168.field3367 < ~var6; ++var6) {
                        int var7 = class174.field3475[var6];
                        var3[var6] = this.method43(Integer.MAX_VALUE, 2, var7, var4)[1];
                    }
                } else {
                    for (int var8 = 0; var8 < class168.field3367; ++var8) {
                        int var9 = class174.field3475[var8];
                        var3[var8] = this.method43(Integer.MAX_VALUE, 1, var9, var4)[0];
                    }
                }
            } else {
                for (int var10 = 0; ~class168.field3367 < ~var10; ++var10) {
                    int var11 = class174.field3475[var10];
                    int[] var12 = this.method43(Integer.MAX_VALUE, 2, var11, var4);
                    var3[var10] = var12[1] + -var12[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)Lcd;")
    public static final class23 method48(byte arg0, int arg1) {
        class23 var2 = class184.method1132(-1, arg1);
        ++field163;
        if (arg0 > -75) {
            return null;
        } else {
            for (int var3 = -3 + var2.method143(-41); var3 > 0; var3 -= 3) {
                var2 = class3.method14(true, new class23[] { var2.method156(0, var3, -94), class111.field2347, var2.method136(var3, -3331) });
            }
            if (~var2.method143(-41) < -10) {
                return class3.method14(true, new class23[] { class1.field8, var2.method156(0, -8 + var2.method143(-41), -105), class66.field1548, class55.field1297, var2, class160.field3215 });
            } else {
                return var2.method143(-41) > 6 ? class3.method14(true, new class23[] { class20.field419, var2.method156(0, -4 + var2.method143(-41), -91), class68.field1591, class55.field1297, var2, class160.field3215 }) : class3.method14(true, new class23[] { class189.field3760, var2, class158.field3168 });
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZ[Lfa;)V")
    public static final void method49(int arg0, boolean arg1, class47[] arg2) {
        if (arg1) {
            field152 = null;
        }
        for (int var3 = 0; ~var3 > ~arg2.length; ++var3) {
            class47 var4 = arg2[var3];
            if (var4 != null && ~var4.field1051 == ~arg0 && (!var4.field1027 || !class95.method624(-1, var4))) {
                if (var4.field1127 == 0) {
                    if (!var4.field1027 && class95.method624(-1, var4) && class62.field1442 != var4) {
                        continue;
                    }
                    method49(var4.field1071, false, arg2);
                    if (var4.field1029 != null) {
                        method49(var4.field1071, false, var4.field1029);
                    }
                    class115 var5 = (class115) class31.field665.method260((long) var4.field1071, (byte) 28);
                    if (var5 != null) {
                        class74.method525((byte) -111, var5.field2408);
                    }
                }
                if (var4.field1127 == 6) {
                    if (var4.field1095 != -1 || var4.field1047 != -1) {
                        boolean var6 = class97.method645(65535, var4);
                        int var7;
                        if (!var6) {
                            var7 = var4.field1095;
                        } else {
                            var7 = var4.field1047;
                        }
                        if (~var7 != 0) {
                            class94 var8 = class20.method128(var7, (byte) 103);
                            var4.field1146 += class138.field2850;
                            while (~var4.field1146 < ~var8.field1992[var4.field1082]) {
                                var4.field1146 -= var8.field1992[var4.field1082];
                                ++var4.field1082;
                                if (~var8.field1973.length >= ~var4.field1082) {
                                    var4.field1082 -= var8.field1978;
                                    if (~var4.field1082 > -1 || var4.field1082 >= var8.field1973.length) {
                                        var4.field1082 = 0;
                                    }
                                }
                                class3.method12(var4, false);
                            }
                        }
                    }
                    if (var4.field1076 != 0 && !var4.field1027) {
                        int var9 = var4.field1076 << 16 >> 16;
                        int var10 = var4.field1076 >> 16;
                        int var11 = class138.field2850 * var9;
                        var4.field1048 = var4.field1048 + var11 & 2047;
                        int var12 = class138.field2850 * var10;
                        var4.field1073 = 2047 & var4.field1073 - -var12;
                        class3.method12(var4, false);
                    }
                }
            }
        }
        ++field154;
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(B)V")
    private final void method50(byte arg0) {
        Random var2 = new Random((long) this.field143);
        int var3 = 4096 / this.field142;
        this.field166 = var3 >> 1;
        ++field155;
        this.field149 = this.field147 * this.field142;
        this.field146 = new int[this.field149][2];
        int var4 = this.field169 * this.field166 >> 12;
        int var5 = 4096 / this.field147;
        this.field151 = var5 >> 1;
        int var6 = this.field169 * this.field151 >> 12;
        if (arg0 > -16) {
            this.method43(-53, 72, -58, -34);
        }
        for (int var7 = 0; this.field147 > var7; ++var7) {
            int var8 = var5 * var7;
            for (int var9 = 0; ~var9 > ~this.field142; ++var9) {
                int var10 = this.field142 * var7 + var9;
                int var11 = var4 * (-4096 + class155.method952(var2, 8192, 126)) >> 12;
                int var12 = var6 * (class155.method952(var2, 8192, 126) - 4096) >> 12;
                this.field146[var10][0] = var3 * var9 + var11;
                this.field146[var10][1] = var8 + var12;
            }
        }
        this.field162 = this.field147 < this.field142 ? this.field142 : this.field147;
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)V")
    public static void method51(int arg0) {
        field168 = null;
        field145 = null;
        field161 = null;
        if (arg0 < 60) {
            field158 = -117;
        }
        field148 = null;
        field152 = null;
        field165 = null;
    }
}
