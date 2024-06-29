import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class56 extends class51 {

    @OriginalMember(owner = "client!ga", name = "gb", descriptor = "I")
    private int field1419 = 3216;

    @OriginalMember(owner = "client!ga", name = "fb", descriptor = "[I")
    private int[] field1418 = new int[3];

    @OriginalMember(owner = "client!ga", name = "nb", descriptor = "I")
    private int field1426 = 4096;

    @OriginalMember(owner = "client!ga", name = "qb", descriptor = "I")
    private int field1429 = 3216;

    @OriginalMember(owner = "client!ga", name = "db", descriptor = "Lea;")
    private static class38 field1416 = class9.method46((byte) 110, "Username: ");

    @OriginalMember(owner = "client!ga", name = "lb", descriptor = "I")
    public static int field1424 = 0;

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "Lea;")
    public static class38 field1412 = class9.method46((byte) 110, "<col=40ff00>");

    @OriginalMember(owner = "client!ga", name = "sb", descriptor = "Lea;")
    public static class38 field1431 = class9.method46((byte) 116, "<col=c0ff00>");

    @OriginalMember(owner = "client!ga", name = "pb", descriptor = "Lea;")
    private static class38 field1428 = class9.method46((byte) 126, "shake:");

    @OriginalMember(owner = "client!ga", name = "rb", descriptor = "Lea;")
    public static class38 field1430 = field1428;

    @OriginalMember(owner = "client!ga", name = "cb", descriptor = "Lea;")
    public static class38 field1415 = field1416;

    @OriginalMember(owner = "client!ga", name = "kb", descriptor = "Lea;")
    public static class38 field1423 = field1428;

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ga", name = "bb", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ga", name = "eb", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!ga", name = "hb", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ga", name = "ib", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ga", name = "jb", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!ga", name = "mb", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!ga", name = "ob", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!ga", name = "tb", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILdd;)Lk;")
    public static final class89 method411(int arg0, int arg1, class32 arg2) {
        if (arg1 < 62) {
            field1431 = null;
        }
        ++field1420;
        return !class204.method1337(arg2, 107, arg0) ? null : class87.method721(26);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
    private final void method412(byte arg0) {
        double var2 = Math.cos((double) (this.field1419 / 4096));
        if (arg0 != 64) {
            field1431 = null;
        }
        ++field1421;
        this.field1418[0] = (int) (var2 * Math.sin((double) (this.field1429 / 4096)) * 4096.0D);
        this.field1418[1] = (int) (Math.cos((double) (this.field1429 / 4096)) * var2 * 4096.0D);
        this.field1418[2] = (int) (4096.0D * Math.sin((double) (this.field1419 / 4096)));
        int var4 = this.field1418[2] * this.field1418[2] >> 12;
        int var5 = this.field1418[0] * this.field1418[0] >> 12;
        int var6 = this.field1418[1] * this.field1418[1] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field1418[1] = (this.field1418[1] << 12) / var7;
            this.field1418[2] = (this.field1418[2] << 12) / var7;
            this.field1418[0] = (this.field1418[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method413(int arg0, String arg1) throws ClassNotFoundException {
        int var2 = 74 % ((arg0 - -45) / 49);
        ++field1414;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else {
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class56() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field1431 = null;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field1419 = arg0.method511(-125);
                }
            } else {
                this.field1429 = arg0.method511(-127);
            }
        } else {
            this.field1426 = arg0.method511(-122);
        }
        ++field1427;
    }

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "(I)V")
    public static void method414(int arg0) {
        field1415 = null;
        field1423 = null;
        field1430 = null;
        field1431 = null;
        int var1 = -46 / ((arg0 - -3) / 36);
        field1412 = null;
        field1416 = null;
        field1428 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lc;I)V")
    public static final void method415(class19 arg0, int arg1) {
        ++field1432;
        arg0.field375 = false;
        if (~arg0.field387 != 0) {
            class140 var2 = class139.method997(-82, arg0.field387);
            if (var2 != null && var2.field2919 != null) {
                ++arg0.field390;
                if (var2.field2919.length > arg0.field378 && ~arg0.field390 < ~var2.field2938[arg0.field378]) {
                    arg0.field390 = 1;
                    ++arg0.field378;
                    class146.method1043(arg0.field378, class195.field3842 == arg0, -27816, var2, arg0.field406, arg0.field382);
                }
                if (~var2.field2919.length >= ~arg0.field378) {
                    arg0.field378 = 0;
                    arg0.field390 = 0;
                    class146.method1043(arg0.field378, class195.field3842 == arg0, arg1 ^ -20140, var2, arg0.field406, arg0.field382);
                }
            } else {
                arg0.field387 = -1;
            }
        }
        if (arg0.field376 != -1 && arg0.field392 <= class45.field1098) {
            if (~arg0.field394 > -1) {
                arg0.field394 = 0;
            }
            int var3 = class177.method1224((byte) 115, arg0.field376).field3914;
            if (~var3 != 0) {
                class140 var4 = class139.method997(arg1 + -8812, var3);
                if (var4 != null && var4.field2919 != null) {
                    ++arg0.field404;
                    if (var4.field2919.length > arg0.field394 && arg0.field404 > var4.field2938[arg0.field394]) {
                        ++arg0.field394;
                        arg0.field404 = 1;
                        class146.method1043(arg0.field394, class195.field3842 == arg0, -27816, var4, arg0.field406, arg0.field382);
                    }
                    if (arg0.field394 >= var4.field2919.length && (~arg0.field394 > -1 || arg0.field394 >= var4.field2919.length)) {
                        arg0.field376 = -1;
                    }
                } else {
                    arg0.field376 = -1;
                }
            } else {
                arg0.field376 = -1;
            }
        }
        if (arg0.field395 != -1 && ~arg0.field429 >= -2) {
            class140 var5 = class139.method997(127, arg0.field395);
            if (var5.field2924 == 1 && ~arg0.field380 < -1 && ~class45.field1098 <= ~arg0.field388 && ~class45.field1098 < ~arg0.field407) {
                arg0.field429 = 1;
                return;
            }
        }
        if (~arg0.field395 != 0 && ~arg0.field429 == -1) {
            class140 var6 = class139.method997(124, arg0.field395);
            if (var6 != null && var6.field2919 != null) {
                ++arg0.field420;
                if (arg0.field417 < var6.field2919.length && arg0.field420 > var6.field2938[arg0.field417]) {
                    arg0.field420 = 1;
                    ++arg0.field417;
                    class146.method1043(arg0.field417, class195.field3842 == arg0, arg1 ^ -20140, var6, arg0.field406, arg0.field382);
                }
                if (arg0.field417 >= var6.field2919.length) {
                    ++arg0.field399;
                    arg0.field417 -= var6.field2935;
                    if (~var6.field2934 >= ~arg0.field399) {
                        arg0.field395 = -1;
                    } else if (arg0.field417 >= 0 && arg0.field417 < var6.field2919.length) {
                        class146.method1043(arg0.field417, class195.field3842 == arg0, -27816, var6, arg0.field406, arg0.field382);
                    } else {
                        arg0.field395 = -1;
                    }
                }
                arg0.field375 = var6.field2913;
            } else {
                arg0.field395 = -1;
            }
        }
        if (~arg0.field429 < -1) {
            --arg0.field429;
        }
        if (arg1 != 8716) {
            field1431 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lm;Lm;B)V")
    public static final void method416(class107 arg0, class107 arg1, byte arg2) {
        ++field1422;
        if (class143.field2986) {
            class132.method970((byte) -101, arg1, arg0);
        } else if (arg2 == 69) {
            if (class86.field2005 == 0 || class86.field2005 == 5) {
                byte var3 = 20;
                arg1.method645(class105.field2346, 382, 245 - var3, 16777215, -1);
                int var4 = -var3 + 253;
                class71.method575(230, var4, 304, 34, 9179409);
                class71.method575(231, var4 + 1, 302, 32, 0);
                class71.method558(232, var4 - -2, class163.field3380 * 3, 30, 9179409);
                class71.method558(232 - -(class163.field3380 * 3), var4 + 2, -(class163.field3380 * 3) + 300, 30, 0);
                arg1.method645(class187.field3721, 382, 276 - var3, 16777215, -1);
            }
            if (~class86.field2005 == -21) {
                short var5 = 211;
                class111.field2472.method335(382 - class111.field2472.field1147 / 2, 271 - class111.field2472.field1144 / 2);
                arg1.method645(class187.field3719, 382, var5, 16776960, 0);
                int var23 = var5 + 15;
                arg1.method645(class187.field3720, 382, var23, 16776960, 0);
                int var24 = var23 + 15;
                arg1.method645(class187.field3727, 382, var24, 16776960, 0);
                int var25 = var24 + 15;
                int var26 = var25 + 10;
                arg1.method646(class163.method1168(-123, new class38[] { field1415, class77.method644(class187.field3725) }), 272, var26, 16777215, 0);
                int var28 = var26 + 15;
                arg1.method646(class163.method1168(-28, new class38[] { class140.field2944, class187.field3724.method267(-40) }), 274, var28, 16777215, 0);
                int var29 = var28 + 15;
            }
            if (class86.field2005 == 10) {
                class111.field2472.method335(202, 171);
                if (~class43.field950 == -1) {
                    short var6 = 251;
                    arg1.method645(class160.field3338, 382, var6, 16776960, 0);
                    int var27 = var6 + 30;
                    short var7 = 302;
                    short var8 = 291;
                    class117.field2561.method335(var7 - 73, var8 - 20);
                    arg1.method658(class194.field3820, var7 - 73, var8 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                    short var9 = 462;
                    class117.field2561.method335(var9 + -73, var8 + -20);
                    arg1.method658(class198.field3916, var9 - 73, var8 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                } else if (class43.field950 != 2) {
                    if (class43.field950 == 3) {
                        arg1.method645(class99.field2197, 382, 211, 16776960, 0);
                        short var10 = 321;
                        short var11 = 382;
                        short var12 = 236;
                        arg1.method645(class98.field2178, 382, var12, 16777215, 0);
                        int var30 = var12 + 15;
                        arg1.method645(class169.field3480, 382, var30, 16777215, 0);
                        int var31 = var30 + 15;
                        arg1.method645(class204.field4020, 382, var31, 16777215, 0);
                        int var32 = var31 + 15;
                        arg1.method645(class21.field461, 382, var32, 16777215, 0);
                        class117.field2561.method335(var11 + -73, var10 + -20);
                        arg1.method645(class148.field3070, var11, var10 + 5, 16777215, 0);
                        int var34 = var32 + 15;
                    }
                } else {
                    short var13 = 211;
                    arg1.method645(class187.field3719, 382, var13, 16776960, 0);
                    int var33 = var13 + 15;
                    arg1.method645(class187.field3720, 382, var33, 16776960, 0);
                    int var35 = var33 + 15;
                    arg1.method645(class187.field3727, 382, var35, 16776960, 0);
                    boolean var14;
                    if (~class178.field3611 == -1 && class45.field1098 % 40 < 20 && class183.field3664) {
                        var14 = true;
                    } else {
                        var14 = false;
                    }
                    short var15 = 302;
                    short var16 = 321;
                    var33 = var35 + 15;
                    var33 += 10;
                    arg1.method646(class163.method1168(112, new class38[] { field1415, class77.method644(class187.field3725), !var14 ? class187.field3723 : class63.field1542 }), 272, var33, 16777215, 0);
                    var33 += 15;
                    boolean var17;
                    if (class178.field3611 == 1 && class45.field1098 % 40 < 20 && class183.field3664) {
                        var17 = true;
                    } else {
                        var17 = false;
                    }
                    arg1.method646(class163.method1168(-60, new class38[] { class140.field2944, class187.field3724.method267(-123), var17 ? class63.field1542 : class187.field3723 }), 274, var33, 16777215, 0);
                    class117.field2561.method335(var15 - 73, var16 + -20);
                    arg1.method645(class156.field3235, var15, var16 + 5, 16777215, 0);
                    var33 += 15;
                    short var18 = 462;
                    class117.field2561.method335(var18 - 73, var16 + -20);
                    arg1.method645(class148.field3070, var18, var16 + 5, 16777215, 0);
                }
            }
            if (~class194.field3822 != -2) {
                if (class188.field3757 > 0) {
                    class156.method1088((byte) -63, class188.field3757);
                    class188.field3757 = 0;
                }
                class125.method934(-39);
            }
            class176.field3570[class130.field2777 ? 1 : 0].method335(725, 463);
            if (class86.field2005 > 5 && class25.field508 != 2 && ~class158.field3317 == -1) {
                if (class33.field677 != null) {
                    short var19 = 463;
                    byte var20 = 5;
                    class33.field677.method335(var20, var19);
                    byte var21 = 35;
                    byte var22 = 100;
                    arg1.method645(class163.method1168(12, new class38[] { class14.field290, class175.field3551, class151.method1059(class125.field2699, (byte) -114) }), var22 / 2 + var20, var21 / 2 + var19 - 2, 16777215, 0);
                    if (class51.field1300 == null) {
                        arg0.method645(class143.field2985, var22 / 2 + var20, var21 / 2 + var19 + 12, 16777215, 0);
                    } else {
                        arg0.method645(class21.field464, var20 - -(var22 / 2), var21 / 2 + var19 + 12, 16777215, 0);
                    }
                } else {
                    class33.field677 = class75.method597(class187.field3723, -1094018352, class83.field1962, class146.field3049);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        if (arg0 > -125) {
            return null;
        } else {
            ++field1413;
            int[] var3 = super.field1312.method827(arg1, true);
            if (super.field1312.field2271) {
                int[] var4 = this.method376(class144.field3018 & arg1 + -1, 0, -37);
                int[] var5 = this.method376(arg1, 0, -81);
                int[] var6 = this.method376(arg1 + 1 & class144.field3018, 0, -32);
                for (int var7 = 0; ~var7 > ~class86.field2008; ++var7) {
                    int var8 = (var6[var7] - var4[var7]) * this.field1426;
                    int var9 = (var5[class39.field850 & var7 + 1] + -var5[class39.field850 & var7 - 1]) * this.field1426;
                    int var10 = var9 >> 12;
                    int var11 = var8 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (Math.sqrt((double) ((var13 + 4096 + var12) / 4096)) * 4096.0D);
                    int var15;
                    int var16;
                    int var17;
                    if (~var14 == -1) {
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                    } else {
                        var17 = 16777216 / var14;
                        var16 = var9 / var14;
                        var15 = var8 / var14;
                    }
                    int var18 = this.field1418[2] * var17 >> 12;
                    int var19 = this.field1418[0] * var16 >> 12;
                    int var20 = this.field1418[1] * var15 >> 12;
                    var3[var7] = var18 + var20 + var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
    public final void method235(int arg0) {
        ++field1417;
        this.method412((byte) 64);
        if (arg0 != -2) {
            field1416 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lea;Ldd;Lea;BLdd;)Lm;")
    public static final class107 method417(class38 arg0, class32 arg1, class38 arg2, byte arg3, class32 arg4) {
        ++field1425;
        int var5 = arg4.method207((byte) 32, arg0);
        if (arg3 < 108) {
            method417((class38) null, (class32) null, (class38) null, (byte) -18, (class32) null);
        }
        int var6 = arg4.method212(arg2, -118, var5);
        return class17.method97(arg4, var6, (byte) 119, arg1, var5);
    }
}
