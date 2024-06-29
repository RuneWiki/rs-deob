import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class180 extends class99 {

    @OriginalMember(owner = "client!se", name = "T", descriptor = "I")
    private int field3141 = 0;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "I")
    private int field3138 = 10;

    @OriginalMember(owner = "client!se", name = "eb", descriptor = "I")
    private int field3151 = 2048;

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "Lc;")
    public static class125 field3146 = new class125();

    @OriginalMember(owner = "client!se", name = "gb", descriptor = "[I")
    public static int[] field3153 = new int[32];

    @OriginalMember(owner = "client!se", name = "fb", descriptor = "[I")
    public static int[] field3152 = new int[5];

    @OriginalMember(owner = "client!se", name = "lb", descriptor = "I")
    public static int field3158 = -1;

    @OriginalMember(owner = "client!se", name = "mb", descriptor = "Lr;")
    public static class66 field3159 = class93.method641(43, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!se", name = "R", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!se", name = "X", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!se", name = "cb", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!se", name = "db", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!se", name = "ib", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!se", name = "kb", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!se", name = "nb", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!se", name = "hb", descriptor = "Lsg;")
    public static class247 field3154;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "[I")
    private int[] field3142;

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "[I")
    private int[] field3147;

    @OriginalMember(owner = "client!se", name = "jb", descriptor = "[Ldh;")
    public static class265[] field3156;

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    public class180() {
        super(0, true);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        this.method1198(-1);
        if (arg0 > -22) {
            this.field3147 = null;
        }
        ++field3145;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILcj;II)Lni;")
    public static final class168 method1196(int arg0, class28 arg1, int arg2, int arg3) {
        ++field3148;
        if (arg0 <= 49) {
            field3152 = null;
        }
        return !class31.method174(-29381, arg3, arg1, arg2) ? null : class250.method1692(-14452);
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V")
    public static final void method1197(byte arg0) {
        int var1 = -14 / ((-23 - arg0) / 50);
        class156.field2768.method1613((byte) 94);
        ++field3144;
    }

    @OriginalMember(owner = "client!se", name = "g", descriptor = "(I)V")
    private final void method1198(int arg0) {
        this.field3147 = new int[this.field3138 - arg0];
        int var2 = 0;
        ++field3140;
        this.field3142 = new int[this.field3138 + 1];
        int var3 = 4096 / this.field3138;
        int var4 = this.field3151 * var3 >> 12;
        for (int var5 = 0; var5 < this.field3138; ++var5) {
            this.field3147[var5] = var2;
            this.field3142[var5] = var2 + var4;
            var2 += var3;
        }
        this.field3147[this.field3138] = 4096;
        this.field3142[this.field3138] = this.field3142[0] + 4096;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZIZI)V")
    public static final void method1199(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        ++class214.field3683;
        ++field3150;
        if (!arg4) {
            class69.method508(64, true);
            class35.method196(true, -125);
            class69.method508(64, false);
        }
        class35.method196(arg2, -127);
        if (!arg4) {
            class61.method398((byte) -92);
        }
        class92.method640(-1);
        if (~class167.field2995 == -2) {
            int var6 = class125.field2367;
            if (~var6 > ~(class237.field4114 / 256)) {
                var6 = class237.field4114 / 256;
            }
            if (class44.field774[4] && var6 < class48.field870[4] + 128) {
                var6 = class48.field870[4] + 128;
            }
            int var7 = class259.field4562 + class208.field3602 & 2047;
            class175.method1181(arg5, var7, class198.field3419, class45.method327(class207.field3595.field2077, class196.field3401, class207.field3595.field2053, arg2) - 50, 600 - -(var6 * 3), class216.field3717, var6, (byte) 65);
        }
        int var8 = class207.field3597;
        int var9 = class192.field3330;
        int var10 = class134.field2494;
        int var11 = class250.field4410;
        int var12 = class253.field4435;
        for (int var13 = 0; var13 < 5; ++var13) {
            if (class44.field774[var13]) {
                int var19 = (int) ((double) (-class255.field4486[var13]) + Math.random() * (double) (class255.field4486[var13] * 2 + 1) + Math.sin((double) class223.field3799[var13] / 100.0D * (double) class8.field75[var13]) * (double) class48.field870[var13]);
                if (var13 == 2) {
                    class192.field3330 += var19;
                }
                if (~var13 == -5) {
                    class253.field4435 += var19;
                    if (~class253.field4435 > -129) {
                        class253.field4435 = 128;
                    }
                    if (~class253.field4435 < -384) {
                        class253.field4435 = 383;
                    }
                }
                if (~var13 == -2) {
                    class134.field2494 += var19;
                }
                if (var13 == 0) {
                    class207.field3597 += var19;
                }
                if (~var13 == -4) {
                    class250.field4410 = 2047 & class250.field4410 + var19;
                }
            }
        }
        class49.method348(-3);
        class235.method1546(arg3, arg0, arg3 - -arg1, arg0 - -arg5);
        class123.method845();
        if (!class115.field2177 && ~class147.field2683 <= ~arg3 && ~class147.field2683 > ~(arg1 + arg3) && ~arg0 >= ~class29.field429 && ~class29.field429 > ~(arg0 + arg5)) {
            class195.field3362 = 0;
            class56.field957 = true;
            int var14 = class206.field3537;
            int var15 = class257.field4520;
            class35.field521 = (class147.field2683 - arg3) * (-var14 + var15) / arg1 - -var14;
            int var16 = class20.field274;
            int var17 = class233.field4072;
            class222.field3789 = (-arg0 + class29.field429) * (-var16 + var17) / arg5 - -var16;
        } else {
            class56.field957 = false;
            class195.field3362 = 0;
        }
        class129.method901(16322);
        byte var18 = ~class207.method1346(1) != -3 ? 1 : (byte) class214.field3683;
        class235.method1558(arg3, arg0, arg1, arg5, 0);
        class86.method610(class207.field3597, class134.field2494, class192.field3330, class253.field4435, class250.field4410, class102.field2000, class247.field4296, class101.field1962, class162.field2911, class230.field3979, class240.field4160, class196.field3401 - -1, var18, class207.field3595.field2077 >> 7, class207.field3595.field2053 >> 7);
        class129.method901(16322);
        class111.method753();
        class21.method95(arg5, arg1, arg3, 256, arg0, 256, (byte) -32);
        class17.method69(113, arg1, arg0, arg3, 256, arg5, 256);
        ((class62) class123.field2318).method412(class193.field3347, 0);
        class216.method1392(arg5, arg3, arg0, arg1, -17234);
        class134.field2494 = var10;
        class250.field4410 = var11;
        class207.field3597 = var8;
        class192.field3330 = var9;
        class253.field4435 = var12;
        if (class208.field3601 && ~class35.method197(true, false, (byte) 71) == -1) {
            class208.field3601 = false;
        }
        if (class208.field3601) {
            class235.method1558(arg3, arg0, arg1, arg5, 0);
            class250.method1693(false, class199.field3428, -16678);
        }
        if (!arg4 && !class208.field3601 && !class115.field2177 && class147.field2683 >= arg3 && ~class147.field2683 > ~(arg3 - -arg1) && ~class29.field429 <= ~arg0 && ~class29.field429 > ~(arg0 + arg5)) {
            class203.method1315(arg3, arg0, arg5, class29.field429, !arg2, arg1, class147.field2683);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILr;)I")
    public static final int method1200(int arg0, class66 arg1) {
        ++field3155;
        if (arg0 != 64) {
            return 54;
        } else if (~arg1.method460((byte) -104) == -1) {
            return -1;
        } else {
            for (int var2 = 0; ~var2 > ~class178.field3122.field2163; ++var2) {
                if (class178.field3122.field2161[var2].method487(-577, arg1)) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIILnf;I)V")
    public static final void method1201(int arg0, int arg1, int arg2, int arg3, class217 arg4, int arg5) {
        ++field3157;
        if (arg4.field3724 != -1 || arg4.field3735 != null) {
            int var6 = 0;
            if (~arg5 < ~arg4.field3744) {
                var6 += -arg4.field3744 + arg5;
            } else if (~arg4.field3746 < ~arg5) {
                var6 += arg4.field3746 - arg5;
            }
            if (arg4.field3720 >= arg2) {
                if (~arg2 > ~arg4.field3733) {
                    var6 += -arg2 + arg4.field3733;
                }
            } else {
                var6 += -arg4.field3720 + arg2;
            }
            if (arg4.field3739 != 0 && ~arg4.field3739 <= ~(var6 + -64) && class54.field944 != 0 && ~arg4.field3721 == ~arg1) {
                var6 -= 64;
                if (arg0 >= 77) {
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    int var7 = (-var6 + arg4.field3739) * class54.field944 / arg4.field3739;
                    if (arg4.field3722 == null) {
                        if (arg4.field3724 >= 0) {
                            class71 var8 = class71.method512(class146.field2662, arg4.field3724, 0);
                            if (var8 != null) {
                                class177 var9 = var8.method511().method1188(class102.field1984);
                                class258 var10 = class258.method1754(var9, 100, var7);
                                var10.method1727(-1);
                                class206.field3528.method1033(var10);
                                arg4.field3722 = var10;
                            }
                        }
                    } else {
                        arg4.field3722.method1734(var7);
                    }
                    if (arg4.field3731 != null) {
                        arg4.field3731.method1734(var7);
                        if (!arg4.field3731.method559(84)) {
                            arg4.field3731 = null;
                        }
                    } else {
                        if (arg4.field3735 != null && (arg4.field3736 -= arg3) <= 0) {
                            int var11 = (int) (Math.random() * (double) arg4.field3735.length);
                            class71 var12 = class71.method512(class146.field2662, arg4.field3735[var11], 0);
                            if (var12 != null) {
                                class177 var13 = var12.method511().method1188(class102.field1984);
                                class258 var14 = class258.method1754(var13, 100, var7);
                                var14.method1727(0);
                                class206.field3528.method1033(var14);
                                arg4.field3731 = var14;
                                arg4.field3736 = (int) (Math.random() * (double) (-arg4.field3726 + arg4.field3741)) + arg4.field3726;
                                return;
                            }
                        }
                    }
                }
            } else {
                if (arg4.field3722 != null) {
                    class206.field3528.method1031(arg4.field3722);
                    arg4.field3722 = null;
                }
                if (arg4.field3731 != null) {
                    class206.field3528.method1031(arg4.field3731);
                    arg4.field3731 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field3152 = null;
        }
        ++field3143;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field3141 = arg0.method1677(-6677);
                }
            } else {
                this.field3151 = arg0.method1674(arg2 + 1355769545);
            }
        } else {
            this.field3138 = arg0.method1677(-6677);
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(B)V")
    public static void method1202(byte arg0) {
        if (arg0 == 120) {
            field3153 = null;
            field3156 = null;
            field3146 = null;
            field3159 = null;
            field3152 = null;
            field3154 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        ++field3139;
        if (arg0 != -61) {
            method1200(-125, (class66) null);
        }
        int[] var3 = super.field1943.method749(false, arg1);
        if (super.field1943.field2147) {
            int var4 = class19.field261[arg1];
            if (~this.field3141 == -1) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field3138; ++var6) {
                    if (this.field3147[var6] <= var4 && ~var4 > ~this.field3147[var6 + 1]) {
                        if (~var4 > ~this.field3142[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class46.method330(var3, 0, class199.field3432, var5);
            } else {
                for (int var7 = 0; ~var7 > ~class199.field3432; ++var7) {
                    short var8 = 0;
                    int var9 = 0;
                    int var10 = class10.field120[var7];
                    int var11 = this.field3141;
                    if (~var11 != -2) {
                        if (~var11 != -3) {
                            if (var11 == 3) {
                                var9 = (var10 - var4 >> 1) + 2048;
                            }
                        } else {
                            var9 = (var4 + -4096 + var10 >> 1) + 2048;
                        }
                    } else {
                        var9 = var10;
                    }
                    for (int var12 = 0; ~var12 > ~this.field3138; ++var12) {
                        if (this.field3147[var12] <= var9 && ~this.field3147[var12 + 1] < ~var9) {
                            if (~var9 > ~this.field3142[var12]) {
                                var8 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var8;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(B)V")
    public static final void method1203(byte arg0) {
        class150.method1020(5, true);
        class230.method1503(5, -120);
        class103.method708((byte) 66, 5);
        class224.method1429(-1, 5);
        class88.method620(5, true);
        ++field3149;
        class1.method4(5, (byte) 35);
        class140.method970(5, 0);
        class30.method167(9, 5);
        if (arg0 >= -4) {
            method1199(-68, 94, false, -113, false, 93);
        }
        class230.method1496(121, 5);
        class41.method264(0, 5);
        class41.method269(190, 5);
        class263.method1787(0, 50);
        class124.method855(-127, 5);
        class245.method1610(5, 95);
        class158.field2852.method1611(-18767, 5);
    }
}
