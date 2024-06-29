import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class154 extends class105 {

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "Z")
    private boolean field3014 = true;

    @OriginalMember(owner = "client!ra", name = "ab", descriptor = "Z")
    private boolean field3015 = true;

    @OriginalMember(owner = "client!ra", name = "gb", descriptor = "Leh;")
    public static class47 field3021 = class195.method1282((byte) -4, "null");

    @OriginalMember(owner = "client!ra", name = "kb", descriptor = "Leh;")
    public static class47 field3025 = class195.method1282((byte) -4, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!ra", name = "jb", descriptor = "I")
    public static volatile int field3024 = 0;

    @OriginalMember(owner = "client!ra", name = "eb", descriptor = "Lqc;")
    public static class147 field3019 = new class147(0, 0);

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!ra", name = "bb", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!ra", name = "cb", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!ra", name = "db", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!ra", name = "fb", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!ra", name = "hb", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!ra", name = "ib", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!ra", name = "lb", descriptor = "Lah;")
    public static class9 field3026;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)V")
    public static void method1068(byte arg0) {
        field3019 = null;
        field3026 = null;
        field3021 = null;
        field3025 = null;
        if (arg0 != 32) {
            field3026 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(Z)V")
    public static final void method1069(boolean arg0) {
        ++field3022;
        int var1 = class77.field1666 * 128 + 64;
        int var2 = class194.field3759 * 128 + 64;
        int var3 = class39.method335(var1, class196.field3827, var2, 20896) + -class82.field1766;
        if (~class33.field639 > ~var1) {
            class33.field639 += (-class33.field639 + var1) * class53.field1027 / 1000 + class140.field2748;
            if (~var1 > ~class33.field639) {
                class33.field639 = var1;
            }
        }
        if (~class33.field639 < ~var1) {
            class33.field639 -= (class33.field639 - var1) * class53.field1027 / 1000 + class140.field2748;
            if (class33.field639 < var1) {
                class33.field639 = var1;
            }
        }
        if (class98.field2086 < var2) {
            class98.field2086 += (-class98.field2086 + var2) * class53.field1027 / 1000 + class140.field2748;
            if (~var2 > ~class98.field2086) {
                class98.field2086 = var2;
            }
        }
        if (var2 < class98.field2086) {
            class98.field2086 -= (-var2 + class98.field2086) * class53.field1027 / 1000 + class140.field2748;
            if (~var2 < ~class98.field2086) {
                class98.field2086 = var2;
            }
        }
        if (~class188.field3655 > ~var3) {
            class188.field3655 += (var3 - class188.field3655) * class53.field1027 / 1000 + class140.field2748;
            if (~class188.field3655 < ~var3) {
                class188.field3655 = var3;
            }
        }
        int var4 = class163.field3170 * 128 - -64;
        if (var3 < class188.field3655) {
            class188.field3655 -= (-var3 + class188.field3655) * class53.field1027 / 1000 + class140.field2748;
            if (~var3 < ~class188.field3655) {
                class188.field3655 = var3;
            }
        }
        int var5 = class97.field2052 * 128 + 64;
        int var6 = class39.method335(var4, class196.field3827, var5, 20896) - class44.field875;
        int var7 = var6 - class188.field3655;
        int var8 = -class33.field639 + var4;
        int var9 = -class98.field2086 + var5;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 2047;
        if (!arg0) {
            int var12 = 2047 & (int) (Math.atan2((double) var8, (double) var9) * -325.949D);
            int var13 = var12 - class53.field1036;
            if (~var11 > -129) {
                var11 = 128;
            }
            if (~var13 < -1025) {
                var13 -= 2048;
            }
            if (~var13 > 1023) {
                var13 += 2048;
            }
            if (~var13 < -1) {
                class53.field1036 += class183.field3513 - -(class59.field1145 * var13 / 1000);
                class53.field1036 &= 2047;
            }
            if (~var13 > -1) {
                class53.field1036 -= -var13 * class59.field1145 / 1000 + class183.field3513;
                class53.field1036 &= 2047;
            }
            if (~var11 < -384) {
                var11 = 383;
            }
            if (class194.field3787 < var11) {
                class194.field3787 += (-class194.field3787 + var11) * class59.field1145 / 1000 + class183.field3513;
                if (var11 < class194.field3787) {
                    class194.field3787 = var11;
                }
            }
            if (var11 < class194.field3787) {
                class194.field3787 -= class183.field3513 - -((-var11 + class194.field3787) * class59.field1145 / 1000);
                if (~var11 < ~class194.field3787) {
                    class194.field3787 = var11;
                }
            }
            int var14 = var12 - class53.field1036;
            if (~var14 < -1025) {
                var14 -= 2048;
            }
            if (var14 < -1024) {
                var14 += 2048;
            }
            if (var14 < 0 && ~var13 < -1 || var14 > 0 && var13 < 0) {
                class53.field1036 = var12;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V")
    public static final void method1070(int arg0) {
        if (arg0 == 43) {
            class82.field1756 = null;
            class156.field3048 = null;
            client.field544 = null;
            ++field3020;
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class154() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLdb;III)V")
    public static final void method1071(byte arg0, class32 arg1, int arg2, int arg3, int arg4) {
        ++field3018;
        if (class123.field2489 != arg1) {
            if (~class95.field1971 > -401) {
                class47 var5;
                if (~arg1.field623 != -1) {
                    var5 = class5.method24(new class47[] { arg1.field598, class131.field2588, class3.field31, class167.method1133(arg1.field623, (byte) 67), class188.field3652 }, (byte) 58);
                } else {
                    var5 = class5.method24(new class47[] { arg1.field598, class117.method919(class123.field2489.field605, arg1.field605, -7), class131.field2588, class152.field2984, class167.method1133(arg1.field605, (byte) 89), class188.field3652 }, (byte) 99);
                }
                if (class109.field2268 == 1) {
                    class81.method686(class98.field2082, arg2, arg4, class5.method24(new class47[] { class179.field3435, class178.field3418, var5 }, (byte) 89), (byte) 74, (short) 43, (long) arg3);
                    ++class143.field2811;
                } else if (!class78.field1688) {
                    for (int var6 = 7; var6 >= 0; --var6) {
                        if (class161.field3136[var6] != null) {
                            short var7 = 0;
                            ++class54.field1045;
                            if (!class161.field3136[var6].method411(false, class23.field446)) {
                                if (class114.field2329[var6]) {
                                    var7 = 2000;
                                }
                            } else {
                                if (~arg1.field605 < ~class123.field2489.field605) {
                                    var7 = 2000;
                                }
                                if (~class123.field2489.field611 != -1 && ~arg1.field611 != -1) {
                                    if (class123.field2489.field611 == arg1.field611) {
                                        var7 = 2000;
                                    } else {
                                        var7 = 0;
                                    }
                                }
                            }
                            boolean var8 = false;
                            short var9 = class83.field1774[var6];
                            short var10 = (short) (var7 + var9);
                            class81.method686(class161.field3136[var6], arg2, arg4, class5.method24(new class47[] { class76.field1644, var5 }, (byte) 71), (byte) 85, var10, (long) arg3);
                        }
                    }
                } else if ((class196.field3811 & 8) == 8) {
                    class81.method686(class35.field686, arg2, arg4, class5.method24(new class47[] { class117.field2371, class178.field3418, var5 }, (byte) 115), (byte) 53, (short) 35, (long) arg3);
                    ++class131.field2599;
                }
                int var11 = 0;
                if (arg0 == -117) {
                    while (var11 < class95.field1971) {
                        if (class25.field478[var11] == 14) {
                            class80.field1731[var11] = class5.method24(new class47[] { class76.field1644, var5 }, (byte) 88);
                            return;
                        }
                        ++var11;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)V")
    public static final void method1072(int arg0) {
        while (true) {
            if (~class22.field418.method654(class14.field304, 8) <= -28) {
                int var1 = class22.field418.method655(15, 720);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class133.field2626[var1] == null) {
                        var2 = true;
                        class133.field2626[var1] = new class72();
                    }
                    class72 var3 = class133.field2626[var1];
                    class136.field2666[class80.field1727++] = var1;
                    var3.field3326 = class18.field362;
                    var3.field1547 = class195.method1284(class22.field418.method655(14, 720), 43);
                    int var4 = class22.field418.method655(5, 720);
                    int var5 = class22.field418.method655(5, 720);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class59.field1135[class22.field418.method655(3, arg0 + 688)];
                    if (~var4 < -16) {
                        var4 -= 32;
                    }
                    if (var2) {
                        var3.field3282 = var3.field3286 = var6;
                    }
                    int var7 = class22.field418.method655(1, arg0 ^ 752);
                    if (~var7 == -2) {
                        class196.field3810[class94.field1942++] = var1;
                    }
                    int var8 = class22.field418.method655(1, 720);
                    var3.field3332 = var3.field1547.field1066;
                    var3.field3328 = var3.field1547.field1099;
                    var3.field3319 = var3.field1547.field1088;
                    var3.field3338 = var3.field1547.field1064;
                    var3.field3280 = var3.field1547.field1103;
                    var3.field3314 = var3.field1547.field1094;
                    var3.field3275 = var3.field1547.field1100;
                    var3.field3308 = var3.field1547.field1068;
                    if (var3.field3308 == 0) {
                        var3.field3286 = 0;
                    }
                    var3.field3276 = var3.field1547.field1111;
                    var3.method1156(true, class123.field2489.field3317[0] + var5, var8 == 1, class123.field2489.field3310[0] + var4);
                    continue;
                }
            }
            ++field3023;
            if (arg0 != 32) {
                return;
            }
            class22.field418.method661(false);
            return;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (arg2 == -256) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        super.field2179 = ~arg1.method604((byte) -123) == -2;
                    }
                } else {
                    this.field3015 = ~arg1.method604((byte) -124) == -2;
                }
            } else {
                this.field3014 = arg1.method604((byte) 96) == 1;
            }
            ++field3013;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method15(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            int[][] var3 = super.field2186.method10(arg0, (byte) 51);
            if (super.field2186.field28) {
                int[][] var4 = this.method854(0, (byte) -93, !this.field3015 ? arg0 : class122.field2468 - arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var3[0];
                if (!this.field3014) {
                    for (int var11 = 0; ~var11 > ~class149.field2928; ++var11) {
                        var10[var11] = var5[var11];
                        var8[var11] = var6[var11];
                        var9[var11] = var7[var11];
                    }
                } else {
                    for (int var12 = 0; var12 < class149.field2928; ++var12) {
                        var10[var12] = var5[-var12 + class121.field2453];
                        var8[var12] = var6[-var12 + class121.field2453];
                        var9[var12] = var7[-var12 + class121.field2453];
                    }
                }
            }
            ++field3016;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        if (arg1 <= 78) {
            this.field3015 = true;
        }
        ++field3017;
        int[] var3 = super.field2192.method336(-43, arg0);
        if (super.field2192.field770) {
            int[] var4 = this.method851(0, true, !this.field3015 ? arg0 : -arg0 + class122.field2468);
            if (this.field3014) {
                for (int var5 = 0; ~class149.field2928 < ~var5; ++var5) {
                    var3[var5] = var4[-var5 + class121.field2453];
                }
            } else {
                class128.method956(var4, 0, var3, 0, class149.field2928);
            }
        }
        return var3;
    }
}
