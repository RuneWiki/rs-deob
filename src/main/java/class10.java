import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class10 extends class123 {

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "[J")
    private long[] field208 = new long[10];

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field194 = 0;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "[I")
    public static int[] field210 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "[I")
    public static int[] field204 = new int[2000];

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "[Llc;")
    public static class69[] field214 = new class69[100];

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "I")
    public static int field215 = 0;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    private int field196;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    private int field200;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    private int field216;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "J")
    private long field203;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "Z")
    public static boolean field198;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "[Lda;")
    public static class20[] field201;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLlc;Lkc;Llc;)Lcb;")
    public static final class15 method57(byte arg0, class69 arg1, class63 arg2, class69 arg3) {
        field206++;
        int var4 = arg2.method400(arg1, (byte) 121);
        if (arg0 == 77) {
            int var5 = arg2.method390(var4, arg3, 104);
            return class53.method339(arg2, var5, (byte) 24, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lib;B)V")
    public static final void method58(class50 arg0, byte arg1) {
        field205++;
        arg0.field1059 = false;
        if (arg0.field1034 != -1) {
            class74 var2 = class67.method435(103, arg0.field1034);
            arg0.field1061++;
            if (arg0.field1057 < var2.field1646.length && arg0.field1061 > var2.field1658[arg0.field1057]) {
                arg0.field1061 = 1;
                arg0.field1057++;
            }
            if (var2.field1646.length <= arg0.field1057) {
                arg0.field1057 = 0;
                arg0.field1061 = 0;
            }
        }
        if (arg0.field1043 != -1 && class62.field1282 >= arg0.field1036) {
            if (arg0.field1028 < 0) {
                arg0.field1028 = 0;
            }
            int var3 = class89.method631(89, arg0.field1043).field2485;
            if (var3 == -1) {
                arg0.field1043 = -1;
            } else {
                class74 var4 = class67.method435(79, var3);
                arg0.field1023++;
                if (var4.field1646.length > arg0.field1028 && var4.field1658[arg0.field1028] < arg0.field1023) {
                    arg0.field1023 = 1;
                    arg0.field1028++;
                }
                if (var4.field1646.length <= arg0.field1028 && (arg0.field1028 < 0 || arg0.field1028 >= var4.field1646.length)) {
                    arg0.field1043 = -1;
                }
            }
        }
        if (arg0.field1070 != -1 && arg0.field1032 <= 1) {
            class74 var5 = class67.method435(101, arg0.field1070);
            if (var5.field1660 == 1 && arg0.field1044 > 0 && arg0.field1075 <= class62.field1282 && arg0.field1085 < class62.field1282) {
                arg0.field1032 = 1;
                return;
            }
        }
        if (arg0.field1070 != -1 && arg0.field1032 == 0) {
            class74 var6 = class67.method435(95, arg0.field1070);
            arg0.field1022++;
            if (arg0.field1033 < var6.field1646.length && arg0.field1022 > var6.field1658[arg0.field1033]) {
                arg0.field1022 = 1;
                arg0.field1033++;
            }
            if (var6.field1646.length <= arg0.field1033) {
                arg0.field1033 -= var6.field1656;
                arg0.field1025++;
                if (arg0.field1025 >= var6.field1661) {
                    arg0.field1070 = -1;
                }
                if (arg0.field1033 < 0 || arg0.field1033 >= var6.field1646.length) {
                    arg0.field1070 = -1;
                }
            }
            arg0.field1059 = var6.field1669;
        }
        int var7 = 63 % ((-arg1 - 73) / 43);
        if (arg0.field1032 > 0) {
            arg0.field1032--;
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    private final void method59(int arg0) {
        this.field216 = 1;
        field195++;
        this.field196 = 0;
        this.field200 = 256;
        this.field203 = System.currentTimeMillis();
        for (int var2 = arg0; var2 < 10; var2++) {
            this.field208[var2] = this.field203;
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
    public static void method60(int arg0) {
        field201 = null;
        if (arg0 >= 90) {
            field204 = null;
            field210 = null;
            field214 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public final void method61(int arg0) {
        if (arg0 <= 72) {
            method58(null, (byte) 3);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field208[var2] = 0L;
        }
        field211++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIIIBII)V")
    public static final void method62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10) {
        field212++;
        if (!class50.method334((byte) 75, arg2) || (arg5 > arg6 || arg9 > arg7 || arg6 >= arg4 || arg3 <= arg7)) {
            return;
        }
        int var11 = -17 / ((-arg8 - 10) / 32);
        class9[] var12 = class106.field2310[arg2];
        for (int var13 = 0; var13 < var12.length; var13++) {
            class9 var14 = var12[var13];
            if (var14 != null && var14.field126 == arg10) {
                int var15 = var14.field166 + arg5;
                int var16 = var14.field161 + arg9 - arg0;
                if ((var14.field183 >= 0 || var14.field128 != 0) && var15 <= arg6 && var16 <= arg7 && var14.field174 + var15 > arg6 && arg7 < var14.field140 + var16) {
                    if (var14.field183 >= 0) {
                        class33.field660 = var14.field183;
                    } else {
                        class33.field660 = var13;
                    }
                }
                if (var14.field171 == 8 && arg6 >= var15 && arg7 >= var16 && arg6 < var14.field174 + var15 && arg7 < var14.field140 + var16) {
                    class71.field1579 = var13;
                }
                if (var14.field171 != 0) {
                    if (var14.field154 == 1 && arg6 >= var15 && arg7 >= var16 && var14.field174 + var15 > arg6 && var14.field140 + var16 > arg7) {
                        boolean var17 = false;
                        if (var14.field186 != 0) {
                            var17 = class80.method584(-1, var14);
                        }
                        if (!var17) {
                            class23.method149(-28, (arg2 << 16) + var13, var14.field120, 44, 0, 0);
                            class2.field13++;
                        }
                    }
                    if (var14.field154 == 2 && class60.field1248 == 0 && arg6 >= var15 && var16 <= arg7 && var14.field174 + var15 > arg6 && var14.field140 + var16 > arg7) {
                        class69 var18 = var14.field182;
                        class94.field2086++;
                        if (var18.method473(class43.field860, 0) != -1) {
                            var18 = var18.method477(63, var18.method473(class43.field860, 0), 0);
                        }
                        class23.method149(-60, (arg2 << 16) + var13, class46.method305(20025, new class69[] { var18, class89.field1944, var14.field190 }), 52, 0, 0);
                    }
                    if (var14.field154 == 3 && arg6 >= var15 && var16 <= arg7 && arg6 < var14.field174 + var15 && var14.field140 + var16 > arg7) {
                        class119.field2541++;
                        byte var19;
                        if (arg1 == 3) {
                            var19 = 56;
                        } else {
                            var19 = 49;
                        }
                        class23.method149(-99, (arg2 << 16) + var13, class73.field1634, var19, 0, 0);
                    }
                    if (var14.field154 == 4 && var15 <= arg6 && var16 <= arg7 && var14.field174 + var15 > arg6 && arg7 < var14.field140 + var16) {
                        class17.field327++;
                        class23.method149(93, (arg2 << 16) + var13, var14.field120, 14, 0, 0);
                    }
                    if (var14.field154 == 5 && arg6 >= var15 && var16 <= arg7 && arg6 < var14.field174 + var15 && arg7 < var14.field140 + var16) {
                        class23.method149(-61, (arg2 << 16) + var13, var14.field120, 35, 0, 0);
                        class66.field1377++;
                    }
                    if (var14.field154 == 6 && !class73.field1639 && var15 <= arg6 && arg7 >= var16 && var15 + var14.field174 > arg6 && var16 + var14.field140 > arg7) {
                        class23.method149(90, (arg2 << 16) + var13, var14.field120, 7, 0, 0);
                        class33.field662++;
                    }
                    if (var14.field171 == 2) {
                        int var20 = 0;
                        for (int var21 = 0; var21 < var14.field140; var21++) {
                            for (int var22 = 0; var22 < var14.field174; var22++) {
                                int var23 = var15 + (var14.field125 + 32) * var22;
                                int var24 = (var14.field143 + 32) * var21 + var16;
                                if (var20 < 20) {
                                    var24 += var14.field144[var20];
                                    var23 += var14.field117[var20];
                                }
                                if (arg6 >= var23 && arg7 >= var24 && var23 + 32 > arg6 && arg7 < var24 + 32) {
                                    class11.field236 = (arg2 << 16) + var13;
                                    class53.field1135 = var20;
                                    if (var14.field129[var20] > 0) {
                                        class108 var25 = class9.method47(64, var14.field129[var20] - 1);
                                        if (class76.field1696 == 1 && var14.field168) {
                                            if ((arg2 << 16) + var13 != class114.field2467 || class35.field703 != var20) {
                                                class23.method149(89, (arg2 << 16) + var13, class46.method305(20025, new class69[] { class13.field261, class50.field1083, class25.field550, var25.field2397 }), 32, var25.field2389, var20);
                                                class108.field2370++;
                                            }
                                        } else if (class60.field1248 != 1 || !var14.field168) {
                                            class107.field2334++;
                                            class69[] var26 = var25.field2355;
                                            if (class79.field1798) {
                                                var26 = class110.method822(var26, 5410);
                                            }
                                            if (var14.field168) {
                                                for (int var27 = 4; var27 >= 3; var27--) {
                                                    if (var26 != null && var26[var27] != null) {
                                                        byte var28;
                                                        if (var27 == 3) {
                                                            var28 = 19;
                                                        } else {
                                                            var28 = 29;
                                                        }
                                                        class82.field1855++;
                                                        class23.method149(110, (arg2 << 16) + var13, class46.method305(20025, new class69[] { var26[var27], class16.field317, var25.field2397 }), var28, var25.field2389, var20);
                                                    } else if (var27 == 4) {
                                                        class23.method149(-51, (arg2 << 16) + var13, class46.method305(20025, new class69[] { class66.field1382, var25.field2397 }), 29, var25.field2389, var20);
                                                        class19.field421++;
                                                    }
                                                }
                                            }
                                            if (var14.field185) {
                                                class23.method149(66, (arg2 << 16) + var13, class46.method305(20025, new class69[] { class24.field494, var25.field2397 }), 33, var25.field2389, var20);
                                                class35.field691++;
                                            }
                                            if (var14.field168 && var26 != null) {
                                                for (int var29 = 2; var29 >= 0; var29--) {
                                                    if (var26[var29] != null) {
                                                        class42.field841++;
                                                        byte var30 = 0;
                                                        if (var29 == 0) {
                                                            var30 = 36;
                                                        }
                                                        if (var29 == 1) {
                                                            var30 = 51;
                                                        }
                                                        if (var29 == 2) {
                                                            var30 = 5;
                                                        }
                                                        class23.method149(112, (arg2 << 16) + var13, class46.method305(20025, new class69[] { var26[var29], class16.field317, var25.field2397 }), var30, var25.field2389, var20);
                                                    }
                                                }
                                            }
                                            class69[] var31 = var14.field176;
                                            if (class79.field1798) {
                                                var31 = class110.method822(var31, 5410);
                                            }
                                            if (var31 != null) {
                                                for (int var32 = 4; var32 >= 0; var32--) {
                                                    if (var31[var32] != null) {
                                                        byte var33 = 0;
                                                        class43.field853++;
                                                        if (var32 == 0) {
                                                            var33 = 55;
                                                        }
                                                        if (var32 == 1) {
                                                            var33 = 22;
                                                        }
                                                        if (var32 == 2) {
                                                            var33 = 15;
                                                        }
                                                        if (var32 == 3) {
                                                            var33 = 21;
                                                        }
                                                        if (var32 == 4) {
                                                            var33 = 18;
                                                        }
                                                        class23.method149(86, (arg2 << 16) + var13, class46.method305(20025, new class69[] { var31[var32], class16.field317, var25.field2397 }), var33, var25.field2389, var20);
                                                    }
                                                }
                                            }
                                            class23.method149(103, (arg2 << 16) + var13, class46.method305(20025, new class69[] { class89.field1939, var25.field2397 }), 1005, var25.field2389, var20);
                                        } else if ((class127.field2743 & 0x10) == 16) {
                                            class17.field337++;
                                            class23.method149(-31, (arg2 << 16) + var13, class46.method305(20025, new class69[] { class101.field2186, class16.field317, var25.field2397 }), 8, var25.field2389, var20);
                                        }
                                    }
                                }
                                var20++;
                            }
                        }
                    }
                } else if (!var14.field135 || client.method113(var13, arg1, -102) || class74.field1667) {
                    method62(var14.field153, arg1, arg2, var14.field140 + var16, var14.field174 + var15, var15, arg6, arg7, (byte) 25, var16, var13);
                    if (var14.field178 > var14.field140) {
                        class24.method158(arg6, var16, false, arg1, arg7, var14, var14.field178, var15 + var14.field174, var14.field140);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BII)I")
    public final int method63(byte arg0, int arg1, int arg2) {
        int var4 = this.field200;
        this.field200 = 300;
        field207++;
        if (arg0 <= 12) {
            return 55;
        }
        int var5 = this.field216;
        this.field216 = 1;
        this.field203 = System.currentTimeMillis();
        if (this.field208[this.field217] == 0L) {
            this.field216 = var5;
            this.field200 = var4;
        } else if (this.field203 > this.field208[this.field217]) {
            this.field200 = (int) ((long) (arg1 * 2560) / (this.field203 - this.field208[this.field217]));
        }
        if (this.field200 < 25) {
            this.field200 = 25;
        }
        if (this.field200 > 256) {
            this.field200 = 256;
            this.field216 = (int) ((long) arg1 - (this.field203 - this.field208[this.field217]) / 10L);
        }
        if (this.field216 > arg1) {
            this.field216 = arg1;
        }
        this.field208[this.field217] = this.field203;
        this.field217 = (this.field217 + 1) % 10;
        if (this.field216 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field208[var6] != 0L) {
                    this.field208[var6] += this.field216;
                }
            }
        }
        if (arg2 > this.field216) {
            this.field216 = arg2;
        }
        int var7 = 0;
        class108.method814((byte) 15, (long) this.field216);
        while (this.field196 < 256) {
            var7++;
            this.field196 += this.field200;
        }
        this.field196 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V")
    public static final void method64(int arg0) {
        field202++;
        if (class103.field2236 == null) {
            return;
        }
        if (class98.field2158 >= 0) {
            if (class70.field1565 > 0) {
                class3.field61 += class102.field2218;
                class103.field2236.method5((byte) -127, class98.field2158, class3.field61);
                class70.field1565--;
                if (class70.field1565 == 0) {
                    class103.field2236.method4(-114);
                    class98.field2158 = -1;
                    class70.field1565 = 20;
                }
            }
        } else if (class70.field1565 > 0) {
            class70.field1565--;
            if (class70.field1565 == 0) {
                class103.field2236.method1(121);
                class3.field61 = 0;
                if (class98.field2141 != null) {
                    class98.field2158 = class56.field1178;
                    class103.field2236.method3(class125.field2701, (byte) -113, class56.field1178, class98.field2141);
                    class98.field2141 = null;
                }
            }
        }
        int var1 = -122 % ((arg0 + 59) / 32);
        class103.field2236.method7(true);
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    public class10() {
        this.method59(0);
    }
}
