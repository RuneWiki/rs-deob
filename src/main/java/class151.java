import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class151 extends class212 {

    @OriginalMember(owner = "client!uj", name = "ab", descriptor = "I")
    public static int field2519 = 0;

    @OriginalMember(owner = "client!uj", name = "db", descriptor = "Lsc;")
    public static class181 field2522 = class149.method967(255, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!uj", name = "gb", descriptor = "I")
    public static int field2525 = 0;

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!uj", name = "Z", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!uj", name = "bb", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!uj", name = "cb", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!uj", name = "eb", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!uj", name = "fb", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!uj", name = "hb", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!uj", name = "Y", descriptor = "Lo;")
    public static class175 field2517;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BII)V")
    private final void method973(byte arg0, int arg1, int arg2) {
        ++field2513;
        int var4 = -27 / ((-8 - arg0) / 42);
        int var5 = class253.field4416[arg2];
        int var6 = class176.field3090[arg1];
        float var7 = (float) Math.atan2((double) (var5 - 2048), (double) (var6 + -2048));
        if ((double) var7 >= -3.141592653589793D && (double) var7 <= -2.356194490192345D) {
            class137.field2235 = arg2;
            class161.field2747 = arg1;
        } else if ((double) var7 <= -1.5707963267948966D && (double) var7 >= -2.356194490192345D) {
            class137.field2235 = arg1;
            class161.field2747 = arg2;
        } else if ((double) var7 <= -0.7853981633974483D && (double) var7 >= -1.5707963267948966D) {
            class161.field2747 = arg2;
            class137.field2235 = class26.field452 - arg1;
        } else if (var7 <= 0.0F && (double) var7 >= -0.7853981633974483D) {
            class137.field2235 = arg2;
            class161.field2747 = -arg1 + class97.field1577;
        } else if (var7 >= 0.0F && (double) var7 <= 0.7853981633974483D) {
            class137.field2235 = -arg2 + class26.field452;
            class161.field2747 = -arg1 + class97.field1577;
        } else if ((double) var7 >= 0.7853981633974483D && (double) var7 <= 1.5707963267948966D) {
            class137.field2235 = -arg1 + class26.field452;
            class161.field2747 = class97.field1577 - arg2;
        } else if ((double) var7 >= 1.5707963267948966D && (double) var7 <= 2.356194490192345D) {
            class161.field2747 = -arg2 + class97.field1577;
            class137.field2235 = arg1;
        } else if ((double) var7 >= 2.356194490192345D && (double) var7 <= 3.141592653589793D) {
            class137.field2235 = -arg2 + class26.field452;
            class161.field2747 = arg1;
        }
        class137.field2235 &= class186.field3300;
        class161.field2747 &= class4.field90;
    }

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V")
    public static final void method974(int arg0) {
        ++field2518;
        class55 var1 = (class55) class172.field2883.method1686((byte) -83);
        if (arg0 == -28506) {
            while (var1 != null) {
                class21 var2 = var1.field854;
                if (~class38.field581 == ~var2.field369 && !var2.field364) {
                    if (~var2.field385 >= ~class237.field4125) {
                        var2.method196(class258.field4504, -2);
                        if (var2.field364) {
                            var1.method290((byte) -48);
                        } else {
                            class188.method1304(var2.field369, var2.field371, var2.field370, var2.field375, 60, var2, 0, -1L, false);
                        }
                    }
                } else {
                    var1.method290((byte) -48);
                }
                var1 = (class55) class172.field2883.method1683(140);
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(Ljb;I)V")
    public static final void method975(class11 arg0, int arg1) {
        ++field2524;
        if (!class102.field1700) {
            class17.method151();
            class239.field4162 = class91.method600(arg0, arg1 + 109, class170.field2861);
            class239.field4162.method329(-95, arg1);
            class100.field1678 = class124.method802(arg0, class235.field4087, (byte) -30);
            class100.field1678.method482(-(class100.field1678.field1096 / 2) + 382, 18);
            class102.field1700 = true;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        ++field2523;
        if (~arg1 == -1) {
            super.field3651 = ~arg0.method1516((byte) 82) == -2;
        }
        if (arg2 != -3) {
            method976(-85, -15, 109, (class8[]) null, 115, (byte[]) null, false, true);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III[Ljc;I[BZZ)V")
    public static final void method976(int arg0, int arg1, int arg2, class8[] arg3, int arg4, byte[] arg5, boolean arg6, boolean arg7) {
        ++field2514;
        if (!arg6) {
            for (int var8 = 0; var8 < 4; ++var8) {
                for (int var9 = 0; ~var9 > -65; ++var9) {
                    for (int var10 = 0; var10 < 64; ++var10) {
                        if (~(arg0 + var9) < -1 && ~(arg0 + var9) > -104 && arg1 + var10 > 0 && arg1 + var10 < 103) {
                            arg3[var8].field142[arg0 + var9][arg1 + var10] = class5.method43(arg3[var8].field142[arg0 + var9][arg1 + var10], -16777217);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg6) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class230 var12 = new class230(arg5);
        if (!arg7) {
            field2519 = 33;
        }
        for (int var13 = 0; var11 > var13; ++var13) {
            for (int var14 = 0; ~var14 > -65; ++var14) {
                for (int var15 = 0; var15 < 64; ++var15) {
                    class12.method123(var14 - -arg0, arg4, var13, arg6, arg2, 0, var15 - -arg1, var12, (byte) 82);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        ++field2515;
        int[] var3 = super.field3640.method737(true, arg0);
        if (arg1 <= 25) {
            field2525 = -76;
        }
        if (super.field3640.field1813) {
            for (int var4 = 0; var4 < class26.field452; ++var4) {
                this.method973((byte) -79, arg0, var4);
                int[] var5 = this.method1405(class161.field2747, 0, 83);
                var3[var4] = var5[class137.field2235];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
    public class151() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)[[I")
    public final int[][] method260(int arg0, int arg1) {
        if (arg1 != 16383) {
            method974(-42);
        }
        ++field2526;
        int[][] var3 = super.field3645.method1352(arg0, -111);
        if (super.field3645.field3477) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class26.field452 < ~var7; ++var7) {
                this.method973((byte) 94, arg0, var7);
                int[][] var8 = this.method1410(class161.field2747, 0, (byte) -40);
                var4[var7] = var8[0][class137.field2235];
                var5[var7] = var8[1][class137.field2235];
                var6[var7] = var8[2][class137.field2235];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Leg;I)V")
    public static final void method977(class157 arg0, int arg1) {
        ++field2516;
        arg0.field2632 = false;
        if (arg0.field2629 != -1) {
            class254 var2 = class128.method827(arg0.field2629, 114);
            if (var2 != null && var2.field4431 != null) {
                ++arg0.field2624;
                if (~var2.field4431.length < ~arg0.field2661 && arg0.field2624 > var2.field4456[arg0.field2661]) {
                    ++arg0.field2661;
                    arg0.field2624 = 1;
                    class211.method1396(arg0.field2681, -1287515740, arg0.field2654, var2, class258.field4507 == arg0, arg0.field2661);
                }
                if (arg0.field2661 >= var2.field4431.length) {
                    arg0.field2624 = 0;
                    arg0.field2661 = 0;
                    class211.method1396(arg0.field2681, -1287515740, arg0.field2654, var2, class258.field4507 == arg0, arg0.field2661);
                }
            } else {
                arg0.field2629 = -1;
            }
        }
        if (arg0.field2682 != -1 && ~class237.field4125 <= ~arg0.field2662) {
            if (arg0.field2673 < 0) {
                arg0.field2673 = 0;
            }
            int var3 = class259.method1760(arg0.field2682, -18270).field1563;
            if (var3 == -1) {
                arg0.field2682 = -1;
            } else {
                class254 var4 = class128.method827(var3, 101);
                if (var4 != null && var4.field4431 != null) {
                    ++arg0.field2687;
                    if (arg0.field2673 < var4.field4431.length && ~arg0.field2687 < ~var4.field4456[arg0.field2673]) {
                        arg0.field2687 = 1;
                        ++arg0.field2673;
                        class211.method1396(arg0.field2681, -1287515740, arg0.field2654, var4, class258.field4507 == arg0, arg0.field2673);
                    }
                    if (var4.field4431.length <= arg0.field2673) {
                        arg0.field2682 = -1;
                    }
                } else {
                    arg0.field2682 = -1;
                }
            }
        }
        if (~arg0.field2685 != arg1 && arg0.field2618 <= 1) {
            class254 var5 = class128.method827(arg0.field2685, 104);
            if (~var5.field4433 == -2 && arg0.field2676 > 0 && ~arg0.field2677 >= ~class237.field4125 && arg0.field2657 < class237.field4125) {
                arg0.field2618 = 1;
                return;
            }
        }
        if (arg0.field2685 != -1 && arg0.field2618 == 0) {
            class254 var6 = class128.method827(arg0.field2685, 83);
            if (var6 != null && var6.field4431 != null) {
                ++arg0.field2644;
                if (~arg0.field2656 > ~var6.field4431.length && arg0.field2644 > var6.field4456[arg0.field2656]) {
                    ++arg0.field2656;
                    arg0.field2644 = 1;
                    class211.method1396(arg0.field2681, -1287515740, arg0.field2654, var6, class258.field4507 == arg0, arg0.field2656);
                }
                if (var6.field4431.length <= arg0.field2656) {
                    ++arg0.field2684;
                    arg0.field2656 -= var6.field4424;
                    if (var6.field4425 > arg0.field2684) {
                        if (arg0.field2656 >= 0 && ~var6.field4431.length < ~arg0.field2656) {
                            class211.method1396(arg0.field2681, -1287515740, arg0.field2654, var6, class258.field4507 == arg0, arg0.field2656);
                        } else {
                            arg0.field2685 = -1;
                        }
                    } else {
                        arg0.field2685 = -1;
                    }
                }
                arg0.field2632 = var6.field4423;
            } else {
                arg0.field2685 = -1;
            }
        }
        if (arg0.field2618 > 0) {
            --arg0.field2618;
        }
    }

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "(I)V")
    public static void method978(int arg0) {
        if (arg0 != 30771) {
            field2517 = null;
        }
        field2522 = null;
        field2517 = null;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(Ljb;I)V")
    public static final void method979(class11 arg0, int arg1) {
        class131.field2178 = arg0;
        if (arg1 != 0) {
            method975((class11) null, 81);
        }
        class256.field4472 = class131.field2178.method102(4, arg1 + -23099);
        ++field2520;
    }
}
