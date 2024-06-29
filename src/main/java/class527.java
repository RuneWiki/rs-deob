import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class527 extends class145 {

    @OriginalMember(owner = "client!iq", name = "I", descriptor = "[[S")
    public static short[][] field7643 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!iq", name = "G", descriptor = "J")
    public static long field7641 = 0L;

    @OriginalMember(owner = "client!iq", name = "E", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!iq", name = "F", descriptor = "I")
    public static int field7640;

    @OriginalMember(owner = "client!iq", name = "H", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!iq", name = "J", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lrf;", line = 5)
    public static final class74 method3097(Throwable arg0, String arg1) {
        ++field7640;
        class74 var2;
        if (arg0 instanceof class74) {
            var2 = (class74) arg0;
            var2.field788 = var2.field788 + ' ' + arg1;
        } else {
            var2 = new class74(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBIZII)V", line = 23)
    public static final void method3098(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field7644;
        if (class431.field6408 == null) {
            class413.field6264.method3524(arg0, arg2, (byte) 92, -16777216, arg4, arg5);
        } else if (~class439.field6548.field1764 <= -1 && class90.field1032 * 512 > class439.field6548.field1764 && class439.field6548.field1768 >= 0 && class439.field6548.field1768 < class30.field349 * 512) {
            ++class23.field246;
            if (class439.field6548 != null && class439.field6548.field1764 + -((-1 + class439.field6548.method1153(true)) * 256) >> 9 == class82.field925 && ~(class439.field6548.field1768 - (-1 + class439.field6548.method1153(true)) * 256 >> 9) == ~class50.field531) {
                class82.field925 = -1;
                class50.field531 = -1;
                class304.method2026((byte) 73);
            }
            class113.method705((byte) 127);
            if (!arg3) {
                class341.method2193(0);
            }
            class89.method569((byte) 93);
            class573.method3331(true, arg5, arg0, arg2, arg4, 31243);
            int var6 = class455.field6797;
            int var7 = class594.field8685;
            int var8 = class342.field4884;
            int var9 = class544.field7779;
            if (class236.field3384 == 1) {
                int var10 = (int) class639.field9187;
                if (class289.field4003 >> 8 > var10) {
                    var10 = class289.field4003 >> 8;
                }
                if (class126.field1553[4] && ~var10 > ~(class481.field7066[4] + 128)) {
                    var10 = class481.field7066[4] - -128;
                }
                int var11 = (int) class388.field5967 - -class51.field543 & 16383;
                class563.method3258((byte) 15, class620.field8987, (var10 >> 3) * 3 + 600 << 2, var10, var11, class399.method2547(class439.field6548.field1768, class439.field6548.field1764, (byte) 46, class226.field3179) + -200, class325.field4695, var7);
            } else if (class236.field3384 == 4) {
                int var12 = (int) class639.field9187;
                if (~(class289.field4003 >> 8) < ~var12) {
                    var12 = class289.field4003 >> 8;
                }
                if (class126.field1553[4] && ~(class481.field7066[4] + 128) < ~var12) {
                    var12 = class481.field7066[4] + 128;
                }
                int var13 = 16383 & (int) class388.field5967;
                class563.method3258((byte) 15, class620.field8987, (var12 >> 3) * 3 + 600 << 2, var12, var13, -200 + class399.method2547(class151.field1860, class326.field4703, (byte) 123, class226.field3179), class325.field4695, var7);
            } else if (~class236.field3384 == -6) {
                class225.method1469(var7, true);
            }
            int var14 = class337.field4821;
            int var15 = class100.field1192;
            int var16 = class207.field2781;
            int var17 = class309.field4550;
            int var18 = class17.field177;
            for (int var19 = 0; ~var19 > -6; ++var19) {
                if (class126.field1553[var19]) {
                    int var23 = (int) ((double) (-class574.field8284[var19]) + (double) (class574.field8284[var19] * 2 - -1) * Math.random() + Math.sin((double) class146.field1799[var19] / 100.0D * (double) class561.field8014[var19]) * (double) class481.field7066[var19]);
                    if (var19 == 3) {
                        class17.field177 = class17.field177 + var23 & 16383;
                    }
                    if (var19 == 1) {
                        class100.field1192 += var23 << 2;
                    }
                    if (~var19 == -1) {
                        class337.field4821 += var23 << 2;
                    }
                    if (var19 == 4) {
                        class309.field4550 += var23;
                        if (class309.field4550 >= 1024) {
                            if (class309.field4550 > 3072) {
                                class309.field4550 = 3072;
                            }
                        } else {
                            class309.field4550 = 1024;
                        }
                    }
                    if (~var19 == -3) {
                        class207.field2781 += var23 << 2;
                    }
                }
            }
            if (~class337.field4821 > -1) {
                class337.field4821 = 0;
            }
            if (~class207.field2781 > -1) {
                class207.field2781 = 0;
            }
            if (~((class588.field8441 << 9) + -1) > ~class337.field4821) {
                class337.field4821 = (class588.field8441 << 9) + -1;
            }
            if (~((class91.field1047 << 9) + -1) > ~class207.field2781) {
                class207.field2781 = (class91.field1047 << 9) + -1;
            }
            class257.method1714((byte) 86);
            class110.method683((byte) -114);
            class413.field6264.method368(var8, var9, var8 - -var6, var9 - -var7);
            class413.field6264.method349();
            int var20 = 27 / ((arg1 - -57) / 60);
            int var21 = class28.field294;
            if (class291.field4035 == null) {
                class413.field6264.method344(var21);
            } else {
                class291.field4035.method2046(var6, var8, var9, class17.field177, class309.field4550, var7, var21, class413.field6264, 0, class107.field1280 << 3);
            }
            class453.method2798((byte) 127);
            class495.field7240.method2019(class337.field4821, class100.field1192, class207.field2781, -class309.field4550 & 16383, 16383 & -class17.field177, 16383 & -class474.field7009);
            class413.field6264.method382(class495.field7240);
            class413.field6264.method309(var6 / 2 + var8, var7 / 2 + var9, class119.field1493 << 1, class119.field1493 << 1);
            class263.method1741(class119.field1493 << 1, var6 / 2 + var8, var7 / 2 + var9, class119.field1493 << 1, false);
            class3.method10(16383 & -class309.field4550, class337.field4821, 16383 & -class17.field177, class100.field1192, class207.field2781, -class474.field7009 & 16383, 1);
            byte var22 = ~class595.field8694.method2436(class81.field908, 0) == -3 ? (byte) class23.field246 : 1;
            class96.method601(class413.field6264, class287.field3982, class629.field9081, class495.field7240, class337.field4821, class100.field1192, class207.field2781, class399.field6056, class334.field4796, class274.field3847, class455.field6822, class448.field6688, class550.field7845, class439.field6548.field1757 + 1, var22, class439.field6548.field1764 >> 9, class439.field6548.field1768 >> 9, !class595.field8694.field6526);
            class453.method2798((byte) 119);
            if (~class133.field1673 == -10) {
                class418.method2643(256, var9, 256, 73, var6, var7, var8);
                class393.method2527(var8, var6, 256, var7, var9, 256, false);
                class171.method985(256, var9, 0, 256, var6, var7, var8);
                class225.method1468(var8, (byte) 100, var6, var7, var9);
            }
            class94.method596();
            class100.field1192 = var15;
            class309.field4550 = var17;
            class207.field2781 = var16;
            class17.field177 = var18;
            class337.field4821 = var14;
            if (class342.field4880 && ~class564.field8033.method2765(115) == -1) {
                class342.field4880 = false;
            }
            if (class342.field4880) {
                class413.field6264.method3524(var6, var9, (byte) 92, -16777216, var7, var8);
                class120.method745(false, -69, class445.field6665, class151.field1857.method2902(class35.field396, -20139));
            }
        } else {
            class413.field6264.method3524(arg0, arg2, (byte) 92, -16777216, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V", line = 219)
    public static void method3099(byte arg0) {
        field7643 = null;
        if (arg0 < 38) {
            method3098(-72, (byte) -61, -43, false, -102, 32);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZI)[I", line = 229)
    public final int[] method27(boolean arg0, int arg1) {
        ++field7642;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (arg0) {
            field7641 = -98L;
        }
        if (super.field1779.field4602) {
            int[][] var4 = this.method866(0, arg1, (byte) 87);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class647.field9368; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "()V", line = 268)
    public class527() {
        super(1, true);
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(III)I", line = 271)
    public static final int method3100(int arg0, int arg1, int arg2) {
        ++field7639;
        if (~arg2 != -2 && ~arg2 != -4) {
            return arg0 != -5721 ? 80 : class234.field3343[arg1 & 3];
        } else {
            return class377.field5747[3 & arg1];
        }
    }
}
