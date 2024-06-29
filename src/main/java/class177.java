import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class177 extends class105 {

    @OriginalMember(owner = "client!tf", name = "eb", descriptor = "Leh;")
    public static class47 field3386 = class195.method1282((byte) -4, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!tf", name = "Y", descriptor = "Leh;")
    public static class47 field3380 = class195.method1282((byte) -4, "Hierhin gehen");

    @OriginalMember(owner = "client!tf", name = "ib", descriptor = "Leh;")
    private static class47 field3390 = class195.method1282((byte) -4, "Please remove ");

    @OriginalMember(owner = "client!tf", name = "gb", descriptor = "Leh;")
    public static class47 field3388 = field3390;

    @OriginalMember(owner = "client!tf", name = "nb", descriptor = "Leh;")
    public static class47 field3395 = field3390;

    @OriginalMember(owner = "client!tf", name = "Z", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!tf", name = "ab", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!tf", name = "bb", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!tf", name = "cb", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!tf", name = "db", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!tf", name = "fb", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!tf", name = "hb", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!tf", name = "jb", descriptor = "I")
    private int field3391;

    @OriginalMember(owner = "client!tf", name = "kb", descriptor = "I")
    private int field3392;

    @OriginalMember(owner = "client!tf", name = "lb", descriptor = "I")
    private int field3393;

    @OriginalMember(owner = "client!tf", name = "mb", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!tf", name = "ob", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lhd;IILqf;)V")
    public static final void method1178(class68 arg0, int arg1, int arg2, class150 arg3) {
        ++field3387;
        class81 var4 = new class81();
        var4.field1749 = arg0.method604((byte) 99);
        var4.field1737 = arg0.method599((byte) 96);
        var4.field1755 = new class129[var4.field1749];
        var4.field1736 = new byte[var4.field1749][][];
        var4.field1743 = new int[var4.field1749];
        var4.field1754 = new class129[var4.field1749];
        var4.field1740 = new int[var4.field1749];
        var4.field1742 = new int[var4.field1749];
        for (int var5 = 0; var4.field1749 > var5; ++var5) {
            try {
                int var6 = arg0.method604((byte) -125);
                if (var6 != 0 && var6 != 1 && ~var6 != -3) {
                    if (~var6 == -4 || ~var6 == -5) {
                        String var10 = new String(arg0.method575(-101).method410(9262));
                        String var11 = new String(arg0.method575(80).method410(9262));
                        int var12 = arg0.method604((byte) 51);
                        String[] var13 = new String[var12];
                        for (int var14 = 0; ~var14 > ~var12; ++var14) {
                            var13[var14] = new String(arg0.method575(arg2 + -18384).method410(9262));
                        }
                        byte[][] var15 = new byte[var12][];
                        if (~var6 == -4) {
                            for (int var16 = 0; ~var12 < ~var16; ++var16) {
                                int var17 = arg0.method599((byte) 96);
                                var15[var16] = new byte[var17];
                                arg0.method565(var17, 0, (byte) 90, var15[var16]);
                            }
                        }
                        Class[] var18 = new Class[var12];
                        var4.field1740[var5] = var6;
                        for (int var19 = 0; var12 > var19; ++var19) {
                            var18[var19] = class23.method228(var13[var19], 4809);
                        }
                        var4.field1754[var5] = arg3.method1058(var18, var11, class23.method228(var10, 4809), (byte) 58);
                        var4.field1736[var5] = var15;
                    }
                } else {
                    String var7 = new String(arg0.method575(59).method410(9262));
                    String var8 = new String(arg0.method575(65).method410(9262));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg0.method599((byte) 96);
                    }
                    var4.field1740[var5] = var6;
                    var4.field1743[var5] = var9;
                    var4.field1755[var5] = arg3.method1050(class23.method228(var7, 4809), var8, class136.method989(arg2, 4810));
                }
            } catch (ClassNotFoundException var20) {
                var4.field1742[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1742[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1742[var5] = -3;
            } catch (Exception var23) {
                var4.field1742[var5] = -4;
            } catch (Throwable var24) {
                var4.field1742[var5] = -5;
            }
        }
        if (arg2 != 18486) {
            field3390 = null;
        }
        class51.field996.method337(var4, (byte) -22);
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(I)V")
    private class177(int arg0) {
        super(0, false);
        this.method1179(arg0, -126);
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
    public class177() {
        this(0);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V")
    private final void method1179(int arg0, int arg1) {
        this.field3393 = (65280 & arg0) >> 4;
        this.field3391 = arg0 >> 12 & 4080;
        this.field3392 = 4080 & arg0 << 4;
        if (arg1 > -43) {
            field3390 = null;
        }
        ++field3383;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([BB)[B")
    public static final byte[] method1180(byte[] arg0, byte arg1) {
        if (arg1 > -73) {
            method1184(-27, (class61) null, 13, 43);
        }
        ++field3385;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class128.method958(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method15(int arg0, boolean arg1) {
        ++field3394;
        if (!arg1) {
            return null;
        } else {
            int[][] var3 = super.field2186.method10(arg0, (byte) 51);
            if (super.field2186.field28) {
                int[] var4 = var3[2];
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                for (int var7 = 0; var7 < class149.field2928; ++var7) {
                    var5[var7] = this.field3391;
                    var6[var7] = this.field3393;
                    var4[var7] = this.field3392;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIILah;ZII)V")
    public static final void method1181(int arg0, int arg1, int arg2, class9 arg3, boolean arg4, int arg5, int arg6) {
        class189.field3668 = arg5;
        class86.field1848 = arg3;
        class3.field36 = arg1;
        ++field3381;
        class148.field2893 = arg0;
        class20.field387 = arg2;
        class86.field1841 = arg4;
        class9.field211 = arg6;
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)V")
    public static void method1182(int arg0) {
        field3395 = null;
        field3380 = null;
        field3390 = null;
        if (arg0 != 1113) {
            field3380 = null;
        }
        field3388 = null;
        field3386 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZLeh;)V")
    public static final void method1183(int arg0, boolean arg1, class47 arg2) {
        ++field3389;
        class47 var3 = arg2.method395((byte) -61).method387(false);
        if (!arg1) {
            method1182(119);
        }
        boolean var4 = false;
        for (int var5 = 0; class130.field2575 > var5; ++var5) {
            class32 var6 = class40.field795[class146.field2853[var5]];
            if (var6 != null && var6.field598 != null && var6.field598.method411(false, var3)) {
                class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var6.field3310[0], class123.field2489.field3317[0], 0, 2, var6.field3317[0], (byte) 88, 0);
                if (~arg0 != -2) {
                    if (arg0 != 4) {
                        if (~arg0 == -7) {
                            class60.field1174.method657(28182, 171);
                            ++class198.field3862;
                            class60.field1174.method583(-68041368, class146.field2853[var5]);
                        } else if (~arg0 == -8) {
                            ++class117.field2377;
                            class60.field1174.method657(28182, 163);
                            class60.field1174.method573(19634, class146.field2853[var5]);
                        }
                    } else {
                        class60.field1174.method657(28182, 74);
                        class60.field1174.method590(class146.field2853[var5], -1848441912);
                        ++class160.field3103;
                    }
                } else {
                    ++class149.field2920;
                    class60.field1174.method657(28182, 2);
                    class60.field1174.method562(class146.field2853[var5], 115);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class60.method506(41, class181.field3472, 0, class5.method24(new class47[] { class36.field703, var3 }, (byte) 102));
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILgf;II)V")
    public static final void method1184(int arg0, class61 arg1, int arg2, int arg3) {
        ++field3384;
        if (~arg1.field1273 == -2) {
            class81.method686(arg1.field1249, arg1.field1211, 0, class181.field3472, (byte) 86, (short) 3, 0L);
            ++class56.field1097;
        }
        if (~arg1.field1273 == -3 && !class78.field1688) {
            class47 var4 = class198.method1297(100, arg1);
            if (var4 != null) {
                class81.method686(var4, arg1.field1211, -1, class5.method24(new class47[] { class193.field3747, arg1.field1300 }, (byte) 102), (byte) -98, (short) 34, 0L);
                ++class191.field3688;
            }
        }
        if (arg1.field1273 == 3) {
            class81.method686(class60.field1166, arg1.field1211, 0, class181.field3472, (byte) 103, (short) 58, 0L);
            ++class114.field2326;
        }
        if (arg1.field1273 == 4) {
            class81.method686(arg1.field1249, arg1.field1211, 0, class181.field3472, (byte) 82, (short) 29, 0L);
            ++class122.field2470;
        }
        if (~arg1.field1273 == -6) {
            ++class195.field3800;
            class81.method686(arg1.field1249, arg1.field1211, 0, class181.field3472, (byte) -112, (short) 24, 0L);
        }
        int var5 = 113 / ((arg2 - 44) / 51);
        if (arg1.field1273 == 6 && class200.field3905 == null) {
            ++class133.field2620;
            class81.method686(arg1.field1249, arg1.field1211, -1, class181.field3472, (byte) 68, (short) 44, 0L);
        }
        if (~arg1.field1311 == -3) {
            int var6 = 0;
            for (int var7 = 0; ~var7 > ~arg1.field1303; ++var7) {
                for (int var8 = 0; ~arg1.field1187 < ~var8; ++var8) {
                    int var9 = (arg1.field1233 + 32) * var8;
                    int var10 = (arg1.field1248 + 32) * var7;
                    if (~var6 > -21) {
                        var10 += arg1.field1257[var6];
                        var9 += arg1.field1261[var6];
                    }
                    if (arg0 >= var9 && ~arg3 <= ~var10 && ~(var9 + 32) < ~arg0 && ~arg3 > ~(var10 - -32)) {
                        class19.field375 = arg1;
                        class170.field3296 = var6;
                        if (~arg1.field1264[var6] < -1) {
                            class73 var11 = class87.method713(114, arg1.field1264[var6] - 1);
                            if (class109.field2268 == 1 && class123.method944(-126, class5.method25(arg1, (byte) 74))) {
                                if (~class192.field3721 != ~arg1.field1211 || ~class186.field3591 != ~var6) {
                                    ++class162.field3157;
                                    class81.method686(class98.field2082, arg1.field1211, var6, class5.method24(new class47[] { class179.field3435, class8.field156, var11.field1563 }, (byte) 119), (byte) -113, (short) 23, (long) var11.field1571);
                                }
                            } else if (class78.field1688 && class123.method944(64, class5.method25(arg1, (byte) 109))) {
                                if ((class196.field3811 & 16) == 16) {
                                    class81.method686(class35.field686, arg1.field1211, var6, class5.method24(new class47[] { class117.field2371, class8.field156, var11.field1563 }, (byte) 89), (byte) 124, (short) 13, (long) var11.field1571);
                                    ++class173.field3344;
                                }
                            } else {
                                class47[] var12 = var11.field1593;
                                ++class190.field3676;
                                if (class61.field1224) {
                                    var12 = class193.method1269((byte) 31, var12);
                                }
                                if (class123.method944(-125, class5.method25(arg1, (byte) 127))) {
                                    for (int var13 = 4; var13 >= 3; --var13) {
                                        if (var12 != null && var12[var13] != null) {
                                            ++class87.field1858;
                                            byte var14;
                                            if (var13 == 3) {
                                                var14 = 2;
                                            } else {
                                                var14 = 47;
                                            }
                                            class81.method686(var12[var13], arg1.field1211, var6, class5.method24(new class47[] { class34.field667, var11.field1563 }, (byte) 120), (byte) -91, var14, (long) var11.field1571);
                                        } else if (var13 == 4) {
                                            class81.method686(class160.field3119, arg1.field1211, var6, class5.method24(new class47[] { class34.field667, var11.field1563 }, (byte) 127), (byte) 82, (short) 47, (long) var11.field1571);
                                            ++class204.field4023;
                                        }
                                    }
                                }
                                if (class196.method1287(false, class5.method25(arg1, (byte) 103))) {
                                    ++class137.field2687;
                                    class81.method686(class98.field2082, arg1.field1211, var6, class5.method24(new class47[] { class34.field667, var11.field1563 }, (byte) 108), (byte) -120, (short) 7, (long) var11.field1571);
                                }
                                if (class123.method944(61, class5.method25(arg1, (byte) 72)) && var12 != null) {
                                    for (int var15 = 2; var15 >= 0; --var15) {
                                        if (var12[var15] != null) {
                                            ++class87.field1856;
                                            byte var16 = 0;
                                            if (var15 == 0) {
                                                var16 = 57;
                                            }
                                            if (var15 == 1) {
                                                var16 = 12;
                                            }
                                            if (var15 == 2) {
                                                var16 = 1;
                                            }
                                            class81.method686(var12[var15], arg1.field1211, var6, class5.method24(new class47[] { class34.field667, var11.field1563 }, (byte) 119), (byte) -102, var16, (long) var11.field1571);
                                        }
                                    }
                                }
                                class47[] var17 = arg1.field1326;
                                if (class61.field1224) {
                                    var17 = class193.method1269((byte) 31, var17);
                                }
                                if (var17 != null) {
                                    for (int var18 = 4; var18 >= 0; --var18) {
                                        if (var17[var18] != null) {
                                            ++class83.field1771;
                                            byte var19 = 0;
                                            if (var18 == 0) {
                                                var19 = 5;
                                            }
                                            if (var18 == 1) {
                                                var19 = 21;
                                            }
                                            if (var18 == 2) {
                                                var19 = 19;
                                            }
                                            if (var18 == 3) {
                                                var19 = 33;
                                            }
                                            if (var18 == 4) {
                                                var19 = 22;
                                            }
                                            class81.method686(var17[var18], arg1.field1211, var6, class5.method24(new class47[] { class34.field667, var11.field1563 }, (byte) 116), (byte) 70, var19, (long) var11.field1571);
                                        }
                                    }
                                }
                                class81.method686(class126.field2530, arg1.field1211, var6, class5.method24(new class47[] { class34.field667, var11.field1563 }, (byte) 119), (byte) -120, (short) 1007, (long) var11.field1571);
                            }
                        }
                    }
                    ++var6;
                }
            }
        }
        if (arg1.field1313) {
            if (!class78.field1688) {
                for (int var20 = 9; ~var20 <= -6; --var20) {
                    class47 var24 = class61.method514(arg1, var20, (byte) 51);
                    if (var24 != null) {
                        ++class127.field2540;
                        class81.method686(var24, arg1.field1211, arg1.field1263, arg1.field1235, (byte) 98, (short) 1001, (long) (var20 + 1));
                    }
                }
                class47 var21 = class198.method1297(96, arg1);
                if (var21 != null) {
                    class81.method686(var21, arg1.field1211, arg1.field1263, arg1.field1235, (byte) -62, (short) 34, 0L);
                    ++class191.field3688;
                }
                for (int var22 = 4; var22 >= 0; --var22) {
                    class47 var23 = class61.method514(arg1, var22, (byte) 28);
                    if (var23 != null) {
                        ++class127.field2540;
                        class81.method686(var23, arg1.field1211, arg1.field1263, arg1.field1235, (byte) 95, (short) 37, (long) (var22 + 1));
                    }
                }
                if (class100.method808(false, class5.method25(arg1, (byte) 126))) {
                    ++class133.field2620;
                    class81.method686(class44.field879, arg1.field1211, arg1.field1263, class181.field3472, (byte) 75, (short) 44, 0L);
                    return;
                }
                return;
            }
            if (class193.method1268(class5.method25(arg1, (byte) 111), 1) && ~(32 & class196.field3811) == -33) {
                ++class206.field4052;
                class81.method686(class35.field686, arg1.field1211, arg1.field1263, class5.method24(new class47[] { class117.field2371, class148.field2889, arg1.field1235 }, (byte) 62), (byte) 101, (short) 32, 0L);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (arg2 != -256) {
            this.method15(-114, false);
        }
        if (~arg0 == -1) {
            this.method1179(arg1.method613(true), -61);
        }
        ++field3382;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(IB)I")
    public static final int method1185(int arg0, byte arg1) {
        int var7 = arg0 - 1;
        ++field3396;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg1 >= -82) {
            return 38;
        } else {
            int var5 = var4 | var4 >>> 8;
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        }
    }
}
