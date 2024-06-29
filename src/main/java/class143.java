import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class143 extends class260 {

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "Loh;")
    public static class263 field2611 = class253.method1681(-124, "<img=0>");

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
    public static int field2613 = 0;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "Z")
    public static boolean field2612 = false;

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "I")
    public static int field2623 = 0;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!ab", name = "Z", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "[I")
    public static int[] field2621;

    @OriginalMember(owner = "client!ab", name = "ab", descriptor = "[Lfd;")
    public static class119[] field2626;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        ++field2617;
        if (arg1 != 255) {
            field2616 = 106;
        }
        int[] var3 = super.field4511.method304(arg0, false);
        if (super.field4511.field1029) {
            int[][] var4 = this.method1712((byte) 122, 0, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class49.field1052 < ~var8; ++var8) {
                var3[var8] = (var6[var8] - -var5[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(II)I")
    public static final int method943(int arg0, int arg1) {
        ++field2622;
        if (arg0 != 1487780168) {
            field2611 = null;
        }
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)V")
    public static final void method944(int arg0) {
        for (int var1 = -1; class41.field911 > var1; ++var1) {
            int var5;
            if (var1 != -1) {
                var5 = class249.field4354[var1];
            } else {
                var5 = 2047;
            }
            class137 var6 = class151.field2725[var5];
            if (var6 != null && ~var6.field4679 < -1) {
                --var6.field4679;
                if (~var6.field4679 == -1) {
                    var6.field4650 = null;
                }
            }
        }
        for (int var2 = 0; class13.field345 > var2; ++var2) {
            int var3 = class117.field2191[var2];
            class90 var4 = class31.field774[var3];
            if (var4 != null && ~var4.field4679 < -1) {
                --var4.field4679;
                if (var4.field4679 == 0) {
                    var4.field4650 = null;
                }
            }
        }
        if (arg0 != 32768) {
            field2611 = null;
        }
        ++field2624;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class143() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lsi;I)V")
    public static final void method945(class194 arg0, int arg1) {
        if (arg1 != 22359) {
            field2611 = null;
        }
        ++field2618;
        while (true) {
            while (arg0.field3497 < arg0.field3469.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (~arg0.method1301(-8317) == -2) {
                    var2 = true;
                    var3 = arg0.method1301(arg1 ^ -30508);
                    var4 = arg0.method1301(arg1 + -30676);
                }
                int var5 = arg0.method1301(arg1 ^ -30508);
                int var6 = arg0.method1301(arg1 + -30676);
                int var7 = var5 * 64 - class54.field1146;
                int var8 = class112.field2110 + -1 - (var6 * 64 + -class116.field2163);
                if (~var7 <= -1 && var8 + -63 >= 0 && var7 - -63 < class8.field149 && class112.field2110 > var8) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; ++var11) {
                        for (int var12 = 0; var12 < 64; ++var12) {
                            if (!var2 || ~(var3 * 8) >= ~var11 && ~var11 > ~(var3 * 8 + 8) && var4 * 8 <= var12 && ~var12 > ~(var4 * 8 + 8)) {
                                int var13 = arg0.method1301(arg1 ^ -30508);
                                if (var13 != 0) {
                                    if (~(var13 & 1) == -2) {
                                        int var14 = arg0.method1301(-8317);
                                        if (class92.field1823[var10][var9] == null) {
                                            class92.field1823[var10][var9] = new byte[4096];
                                        }
                                        class92.field1823[var10][var9][(-var12 + 63 << 6) + var11] = (byte) var14;
                                    }
                                    if (~(2 & var13) == -3) {
                                        int var15 = arg0.method1294((byte) 3);
                                        if (class50.field1084[var10][var9] == null) {
                                            class50.field1084[var10][var9] = new short[4096];
                                        }
                                        class50.field1084[var10][var9][(-var12 + 63 << 6) - -var11] = (short) var15;
                                    }
                                    if (~(var13 & 4) == -5) {
                                        int var16 = (16711680 & arg0.method1301(-8317) << 16) - (-((255 & arg0.method1301(-8317)) << 8) + -(arg0.method1301(-8317) & 255));
                                        if (class38.field872[var10][var9] == null) {
                                            class38.field872[var10][var9] = new int[4096];
                                        }
                                        --var16;
                                        class12 var17 = class117.method763(var16, (byte) -125);
                                        if (var17.field328 != null) {
                                            var17 = var17.method97(104);
                                            if (var17 == null || var17.field271 == -1) {
                                                continue;
                                            }
                                        }
                                        class38.field872[var10][var9][(63 - var12 << 6) - -var11] = var17.field335 + 1;
                                        class94 var18 = new class94();
                                        var18.field1856 = var7;
                                        var18.field1853 = var17.field271;
                                        var18.field1859 = var8;
                                        class31.field755.method1883(var18, (byte) -3);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (!var2 ? 4096 : 64); ++var19) {
                        int var20 = arg0.method1301(-8317);
                        if (~var20 != -1) {
                            if ((var20 & 1) == 1) {
                                ++arg0.field3497;
                            }
                            if (~(2 & var20) == -3) {
                                arg0.field3497 += 2;
                            }
                            if ((var20 & 4) == 4) {
                                arg0.field3497 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Loh;II)V")
    public static final void method946(class263 arg0, int arg1, int arg2) {
        if (arg1 != 4163) {
            method949(false, -97, 98, (class137) null);
        }
        ++field2619;
        class154.field2792.method1516(82, 67);
        ++class95.field1865;
        class154.field2792.method1323(arg0.method1755(arg1 ^ 4162), (byte) -88);
        class154.field2792.method1288((byte) -93, arg2);
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(B)V")
    public static void method947(byte arg0) {
        field2611 = null;
        field2621 = null;
        if (arg0 < -58) {
            field2626 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BIIII)V")
    public static final void method948(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class113.field2115 = class112.field2110 * arg4 / arg3;
        class182.field3299 = -1;
        class207.field3755 = class8.field149 * arg1 / arg2;
        class75.field1554 = -1;
        class1.method4((byte) 114);
        ++field2614;
        if (arg0 < 112) {
            field2626 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZIILdg;)V")
    public static final void method949(boolean arg0, int arg1, int arg2, class137 arg3) {
        if (!arg0) {
            if ((arg1 & 256) != 0) {
                arg3.field4689 = class189.field3394.method1282(arg0);
                int var4 = class189.field3394.method1283(115);
                arg3.field4653 = (var4 & 65535) + class228.field4012;
                arg3.field4685 = 0;
                if (~arg3.field4689 == -65536) {
                    arg3.field4689 = -1;
                }
                if (class228.field4012 < arg3.field4653) {
                    arg3.field4685 = -1;
                }
                arg3.field4699 = var4 >> 16;
                arg3.field4709 = 0;
                if (arg3.field4689 != -1 && class228.field4012 == arg3.field4653) {
                    int var5 = class46.method296(-68, arg3.field4689).field987;
                    if (~var5 != 0) {
                        class240 var6 = class186.method1226(12828, var5);
                        if (var6 != null && var6.field4211 != null) {
                            class219.method1490(class229.field4018 == arg3, arg3.field4705, 0, -64, var6, arg3.field4688);
                        }
                    }
                }
            }
            ++field2615;
            if ((arg1 & 8) != 0) {
                int var7 = class189.field3394.method1295(-1);
                int var8 = class189.field3394.method1273(0);
                if (var7 == 65535) {
                    var7 = -1;
                }
                class165.method1085(arg3, -2662, var7, var8);
            }
            if (~(arg1 & 1) != -1) {
                int var9 = class189.field3394.method1269(-13208);
                byte[] var10 = new byte[var9];
                class194 var11 = new class194(var10);
                class189.field3394.method1267(0, (byte) -123, var10, var9);
                class8.field142[arg2] = var11;
                arg3.method895(-13, var11);
            }
            if (~(arg1 & 64) != -1) {
                int var12 = class189.field3394.method1311(78);
                int var13 = class189.field3394.method1269(-13208);
                arg3.method1804(class228.field4012, var12, var13, -81);
                arg3.field4672 = class228.field4012 + 300;
                arg3.field4692 = class189.field3394.method1273(0);
            }
            if ((32 & arg1) != 0) {
                int var14 = class189.field3394.method1294((byte) 3);
                int var15 = class189.field3394.method1269(-13208);
                int var16 = class189.field3394.method1279(false);
                int var17 = class189.field3394.field3497;
                boolean var18 = (var14 & 32768) != 0;
                if (arg3.field2508 != null && arg3.field2525 != null) {
                    boolean var19 = false;
                    long var20 = arg3.field2508.method1755(1);
                    if (var15 <= 1) {
                        if (var18 || (!class156.field2806 || class85.field1670) && !class134.field2451) {
                            for (int var22 = 0; var22 < class31.field785; ++var22) {
                                if (class41.field909[var22] == var20) {
                                    var19 = true;
                                    break;
                                }
                            }
                        } else {
                            var19 = true;
                        }
                    }
                    if (!var19 && ~class4.field79 == -1) {
                        class200.field3616.field3497 = 0;
                        int var23 = -1;
                        class189.field3394.method1297(var16, 0, class200.field3616.field3469, 1);
                        class200.field3616.field3497 = 0;
                        class263 var24;
                        if (!var18) {
                            var24 = class65.method417(class109.method727(class200.field3616, 0).method1767((byte) -16));
                        } else {
                            var14 &= 32767;
                            class160 var25 = class6.method39(class200.field3616, 4158);
                            var23 = var25.field2919;
                            var24 = var25.field2924.method639(-27737, class200.field3616);
                        }
                        arg3.field4650 = var24.method1786((byte) -57);
                        arg3.field4691 = var14 & 255;
                        arg3.field4679 = 150;
                        arg3.field4669 = var14 >> 8;
                        if (var15 == 2) {
                            class48.method309(var24, !var18 ? 1 : 17, (byte) 7, class124.method797(-56, new class263[] { class195.field3532, arg3.method896((byte) -88) }), (class263) null, var23);
                        } else if (var15 != 1) {
                            class48.method309(var24, !var18 ? 2 : 17, (byte) 7, arg3.method896((byte) -91), (class263) null, var23);
                        } else {
                            class48.method309(var24, var18 ? 17 : 1, (byte) 7, class124.method797(-110, new class263[] { class194.field3466, arg3.method896((byte) -114) }), (class263) null, var23);
                        }
                    }
                }
                class189.field3394.field3497 = var16 + var17;
            }
            if (~(4 & arg1) != -1) {
                arg3.field4650 = class189.field3394.method1320(false);
                if (~arg3.field4650.method1784(0, 114) == -127) {
                    arg3.field4650 = arg3.field4650.method1787(1, arg0);
                    class120.method774(2, arg3.field4650, -11292, arg3.method896((byte) -75));
                } else if (class229.field4018 == arg3) {
                    class120.method774(2, arg3.field4650, -11292, arg3.method896((byte) -124));
                }
                arg3.field4679 = 150;
                arg3.field4691 = 0;
                arg3.field4669 = 0;
            }
            if (~(arg1 & 1024) != -1) {
                int var26 = class189.field3394.method1311(1);
                int var27 = class189.field3394.method1301(-8317);
                arg3.method1804(class228.field4012, var26, var27, -70);
            }
            if (~(16 & arg1) != -1) {
                arg3.field4682 = class189.field3394.method1282(false);
                arg3.field4655 = class189.field3394.method1294((byte) 3);
            }
            if (~(arg1 & 512) != -1) {
                arg3.field4648 = class189.field3394.method1269(-13208);
                arg3.field4695 = class189.field3394.method1301(-8317);
                arg3.field4673 = class189.field3394.method1269(-13208);
                arg3.field4656 = class189.field3394.method1279(arg0);
                arg3.field4663 = class189.field3394.method1326(-21737) - -class228.field4012;
                arg3.field4659 = class189.field3394.method1282(false) + class228.field4012;
                arg3.field4712 = class189.field3394.method1301(-8317);
                arg3.field4711 = 1;
                arg3.field4658 = 0;
            }
            if (~(arg1 & 2) != -1) {
                arg3.field4693 = class189.field3394.method1282(false);
                if (~arg3.field4693 == -65536) {
                    arg3.field4693 = -1;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)V")
    public static final void method950(int arg0) {
        if (arg0 != -30486) {
            field2626 = null;
        }
        for (class229 var1 = (class229) class20.field450.method1878(true); var1 != null; var1 = (class229) class20.field450.method1881(-78)) {
            class39 var2 = var1.field4020;
            if (class12.field321 == var2.field893 && !var2.field880) {
                if (~class228.field4012 <= ~var2.field891) {
                    var2.method246(class187.field3369, (byte) 60);
                    if (!var2.field880) {
                        class146.method963(var2.field893, var2.field888, var2.field892, var2.field876, 60, var2, 0, -1L, false);
                    } else {
                        var1.method1614(-1204826926);
                    }
                }
            } else {
                var1.method1614(-1204826926);
            }
        }
        ++field2620;
    }
}
