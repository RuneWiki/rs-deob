import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class136 extends class93 {

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    private int field2714 = -1;

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
    public static int field2717 = 0;

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "I")
    public static int field2722 = 0;

    @OriginalMember(owner = "client!ob", name = "gb", descriptor = "Ljd;")
    private static class92 field2726 = class202.method1325((byte) 90, " ");

    @OriginalMember(owner = "client!ob", name = "fb", descriptor = "[[[Lbg;")
    public static class18[][][] field2725 = new class18[4][104][104];

    @OriginalMember(owner = "client!ob", name = "jb", descriptor = "Ljd;")
    public static class92 field2729 = field2726;

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "Lbg;")
    public static class18 field2723 = new class18();

    @OriginalMember(owner = "client!ob", name = "kb", descriptor = "I")
    public static int field2730 = 127;

    @OriginalMember(owner = "client!ob", name = "mb", descriptor = "I")
    public static int field2732 = 0;

    @OriginalMember(owner = "client!ob", name = "lb", descriptor = "Ljd;")
    private static class92 field2731 = class202.method1325((byte) 90, "Create a free account");

    @OriginalMember(owner = "client!ob", name = "nb", descriptor = "Ljd;")
    public static class92 field2733 = class202.method1325((byte) 90, "<br>(X");

    @OriginalMember(owner = "client!ob", name = "ob", descriptor = "Ljd;")
    public static class92 field2734 = field2731;

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
    private int field2715;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!ob", name = "eb", descriptor = "I")
    private int field2724;

    @OriginalMember(owner = "client!ob", name = "hb", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!ob", name = "ib", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "Lle;")
    public static class112 field2712;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "[I")
    private int[] field2721;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V")
    public static void method906(boolean arg0) {
        field2726 = null;
        if (arg0) {
            field2722 = -70;
        }
        field2733 = null;
        field2734 = null;
        field2725 = null;
        field2729 = null;
        field2723 = null;
        field2731 = null;
        field2712 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILjc;I)V")
    public static final void method907(int arg0, int arg1, class91 arg2, int arg3) {
        ++field2716;
        if ((arg0 & 1) != 0) {
            arg2.field204 = class185.field3497.method442(-21351);
            if (arg2.field204 == 65535) {
                arg2.field204 = -1;
            }
        }
        if (arg1 >= -93) {
            method907(-121, 76, (class91) null, 89);
        }
        if ((arg0 & 512) != 0) {
            arg2.field238 = class185.field3497.method414((byte) -16);
            int var4 = class185.field3497.method433(-3);
            arg2.field240 = 0;
            arg2.field214 = var4 >> 16;
            arg2.field203 = (65535 & var4) + class158.field3150;
            if (~arg2.field203 < ~class158.field3150) {
                arg2.field240 = -1;
            }
            arg2.field191 = 0;
            if (arg2.field238 == 65535) {
                arg2.field238 = -1;
            }
        }
        if ((arg0 & 64) != 0) {
            int var5 = class185.field3497.method425((byte) -101);
            if (~var5 == -65536) {
                var5 = -1;
            }
            int var6 = class185.field3497.method443(255);
            class126.method844(var6, arg2, var5, 2980);
        }
        if (~(128 & arg0) != -1) {
            arg2.field223 = class185.field3497.method437((byte) 124);
            if (~arg2.field223.method635((byte) -85, 0) == -127) {
                arg2.field223 = arg2.field223.method613(0, 1);
                class117.method788(arg2.field1805, -19001, 2, arg2.field223);
            } else if (class15.field423 == arg2) {
                class117.method788(arg2.field1805, -19001, 2, arg2.field223);
            }
            arg2.field218 = 0;
            arg2.field239 = 150;
            arg2.field241 = 0;
        }
        if ((arg0 & 16) != 0) {
            int var7 = class185.field3497.method418(109);
            byte[] var8 = new byte[var7];
            class70 var9 = new class70(var8);
            class185.field3497.method454(0, var8, 29029, var7);
            class55.field1161[arg3] = var9;
            arg2.method601(113, var9);
        }
        if (~(256 & arg0) != -1) {
            int var10 = class185.field3497.method443(255);
            int var11 = class185.field3497.method461(-1);
            arg2.method26(var10, 73, class158.field3150, var11);
        }
        if (~(arg0 & 32) != -1) {
            int var12 = class185.field3497.method425((byte) -101);
            int var13 = class185.field3497.method443(255);
            int var14 = class185.field3497.method443(255);
            int var15 = class185.field3497.field1472;
            if (arg2.field1805 != null && arg2.field1799 != null) {
                long var16 = arg2.field1805.method609(10354);
                boolean var18 = false;
                if (var13 <= 1) {
                    for (int var19 = 0; ~var19 > ~class64.field1302; ++var19) {
                        if (~class144.field2880[var19] == ~var16) {
                            var18 = true;
                            break;
                        }
                    }
                }
                if (!var18 && ~class197.field3859 == -1) {
                    class146.field2910.field1472 = 0;
                    class185.field3497.method423(class146.field2910.field1493, -71, 0, var14);
                    class146.field2910.field1472 = 0;
                    class92 var20 = class154.method988(class111.method753(class146.field2910, 32767).method633((byte) -57));
                    arg2.field223 = var20.method607((byte) -121);
                    arg2.field239 = 150;
                    arg2.field241 = var12 >> 8;
                    arg2.field218 = var12 & 255;
                    if (var13 != 2 && ~var13 != -4) {
                        if (var13 != 1) {
                            class117.method788(arg2.field1805, -19001, 2, var20);
                        } else {
                            class117.method788(class77.method529(-3, new class92[] { class118.field2395, arg2.field1805 }), -19001, 1, var20);
                        }
                    } else {
                        class117.method788(class77.method529(-3, new class92[] { class64.field1316, arg2.field1805 }), -19001, 1, var20);
                    }
                }
            }
            class185.field3497.field1472 = var14 + var15;
        }
        if (~(arg0 & 8) != -1) {
            int var21 = class185.field3497.method411(-88);
            int var22 = class185.field3497.method443(255);
            arg2.method26(var21, 84, class158.field3150, var22);
            arg2.field245 = class158.field3150 + 300;
            arg2.field261 = class185.field3497.method461(-1);
        }
        if (~(arg0 & 1024) != -1) {
            arg2.field207 = class185.field3497.method443(255);
            arg2.field212 = class185.field3497.method418(74);
            arg2.field258 = class185.field3497.method411(101);
            arg2.field210 = class185.field3497.method411(111);
            arg2.field249 = class185.field3497.method442(-21351) - -class158.field3150;
            arg2.field232 = class185.field3497.method465(255) - -class158.field3150;
            arg2.field222 = class185.field3497.method418(103);
            arg2.field235 = 1;
            arg2.field250 = 0;
        }
        if ((arg0 & 4) != 0) {
            arg2.field225 = class185.field3497.method465(255);
            arg2.field194 = class185.field3497.method414((byte) -16);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(III)V")
    public static final void method908(int arg0, int arg1, int arg2) {
        class43 var3 = class31.field698[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field969 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        ++field2719;
        if (arg2 != 0) {
            field2729 = null;
        }
        if (~arg0 == -1) {
            this.field2714 = arg1.method442(-21351);
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(Z)Z")
    private final boolean method909(boolean arg0) {
        ++field2720;
        if (this.field2721 != null) {
            return true;
        } else {
            if (!arg0) {
                this.method63(-98, (class70) null, -7);
            }
            if (this.field2714 >= 0) {
                int var2 = class81.field1650.method164((byte) -75, this.field2714) ? 64 : 128;
                this.field2721 = class81.field1650.method162(this.field2714, 124);
                this.field2715 = var2;
                this.field2724 = var2;
                return this.field2721 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V")
    public static final void method910(int arg0) {
        ++field2713;
        try {
            if (class177.field3412 == 0) {
                if (class66.field1334 != null) {
                    class66.field1334.method319(true);
                    class66.field1334 = null;
                }
                class165.field3254 = null;
                class177.field3412 = 1;
                class12.field372 = false;
                class33.field741 = 0;
            }
            if (~class177.field3412 == -2) {
                if (class165.field3254 == null) {
                    class165.field3254 = class140.field2817.method1123(class64.field1307, 0, class135.field2708);
                }
                if (class165.field3254.field3476 == 2) {
                    throw new IOException();
                }
                if (class165.field3254.field3476 == 1) {
                    class66.field1334 = new class55((Socket) class165.field3254.field3474, class140.field2817);
                    class177.field3412 = 2;
                    class165.field3254 = null;
                }
            }
            if (~class177.field3412 == -3) {
                long var1 = class89.field1754 = class3.field181.method609(10354);
                int var3 = (int) (var1 >> 16 & 31L);
                class99.field2000.field1472 = 0;
                class99.field2000.method428(14, arg0 ^ -1991);
                class99.field2000.method428(var3, 110);
                class66.field1334.method324(0, class99.field2000.field1493, 2, arg0 + 4033);
                class177.field3412 = 3;
                class185.field3497.field1472 = 0;
            }
            if (~class177.field3412 == -4) {
                if (class177.field3404 != null) {
                    class177.field3404.method826(arg0 + 18333);
                }
                if (class47.field1022 != null) {
                    class47.field1022.method826(16384);
                }
                int var4 = class66.field1334.method321(-110);
                if (class177.field3404 != null) {
                    class177.field3404.method826(16384);
                }
                if (class47.field1022 != null) {
                    class47.field1022.method826(16384);
                }
                if (~var4 != -1) {
                    class7.method50(true, var4);
                    return;
                }
                class185.field3497.field1472 = 0;
                class177.field3412 = 4;
            }
            if (class177.field3412 == 4) {
                if (class185.field3497.field1472 < 8) {
                    int var5 = class66.field1334.method326(arg0 ^ -1949);
                    if (~(-class185.field3497.field1472 + 8) > ~var5) {
                        var5 = 8 - class185.field3497.field1472;
                    }
                    if (~var5 < -1) {
                        class66.field1334.method318(class185.field3497.field1472, (byte) 52, var5, class185.field3497.field1493);
                        class185.field3497.field1472 += var5;
                    }
                }
                if (~class185.field3497.field1472 == -9) {
                    class185.field3497.field1472 = 0;
                    class64.field1292 = class185.field3497.method448(103);
                    class177.field3412 = 5;
                }
            }
            if (arg0 != -1949) {
                field2731 = null;
            }
            if (~class177.field3412 == -6) {
                class99.field2000.field1472 = 0;
                int[] var6 = new int[] { (int) (9.9999999E7D * Math.random()), (int) (9.9999999E7D * Math.random()), (int) (class64.field1292 >> 32), (int) class64.field1292 };
                class99.field2000.method428(10, 103);
                class99.field2000.method446(var6[0], -26751);
                class99.field2000.method446(var6[1], -26751);
                class99.field2000.method446(var6[2], arg0 ^ 28642);
                class99.field2000.method446(var6[3], -26751);
                class99.field2000.method459(false, class3.field181.method609(10354));
                class99.field2000.method466(class3.field169, 121);
                class99.field2000.method422(class159.field3159, class177.field3402, false);
                class144.field2866.field1472 = 0;
                if (~class159.field3169 != -41) {
                    class144.field2866.method428(16, 99);
                } else {
                    class144.field2866.method428(18, 111);
                }
                class144.field2866.method428(125 + class99.field2000.field1472 + class118.method806(class86.field1714, -12126), 111);
                class144.field2866.method446(488, -26751);
                class144.field2866.method428(!class115.field2339 ? 0 : 1, 104);
                class118.method800(class144.field2866, 28416);
                class144.field2866.method466(class86.field1714, 39);
                class144.field2866.method446(class90.field1769, -26751);
                class144.field2866.method446(class114.field2307.field2656, arg0 ^ 28642);
                class144.field2866.method446(class18.field459.field2656, -26751);
                class144.field2866.method446(class93.field1892.field2656, -26751);
                class144.field2866.method446(class84.field1690.field2656, arg0 ^ 28642);
                class144.field2866.method446(class214.field4183.field2656, arg0 + -24802);
                class144.field2866.method446(class182.field3462.field2656, -26751);
                class144.field2866.method446(class81.field1653.field2656, arg0 ^ 28642);
                class144.field2866.method446(class29.field643.field2656, -26751);
                class144.field2866.method446(class58.field1220.field2656, -26751);
                class144.field2866.method446(class31.field700.field2656, -26751);
                class144.field2866.method446(class26.field593.field2656, -26751);
                class144.field2866.method446(class124.field2520.field2656, -26751);
                class144.field2866.method446(class15.field439.field2656, -26751);
                class144.field2866.method446(class198.field3862.field2656, -26751);
                class144.field2866.method446(class84.field1692.field2656, -26751);
                class144.field2866.method446(class18.field450.field2656, -26751);
                class144.field2866.method446(class155.field3090.field2656, -26751);
                class144.field2866.method446(class200.field3895.field2656, arg0 ^ 28642);
                class144.field2866.method446(class27.field608.field2656, -26751);
                class144.field2866.method446(class12.field366.field2656, -26751);
                class144.field2866.method446(class95.field1924.field2656, arg0 + -24802);
                class144.field2866.method446(class125.field2540.field2656, -26751);
                class144.field2866.method446(class144.field2870.field2656, arg0 ^ 28642);
                class144.field2866.method429(class99.field2000.field1493, -36, 0, class99.field2000.field1472);
                class66.field1334.method324(0, class144.field2866.field1493, class144.field2866.field1472, 2084);
                class99.field2000.method403(var6, false);
                for (int var7 = 0; ~var7 > -5; ++var7) {
                    var6[var7] += 50;
                }
                class185.field3497.method403(var6, false);
                class177.field3412 = 6;
            }
            if (~class177.field3412 == -7 && ~class66.field1334.method326(arg0 ^ -1949) < -1) {
                int var8 = class66.field1334.method321(arg0 ^ 2034);
                if (~var8 == -22 && class159.field3169 == 20) {
                    class177.field3412 = 7;
                } else if (~var8 == -3) {
                    class177.field3412 = 9;
                } else {
                    if (var8 == 15 && ~class159.field3169 == -41) {
                        class143.method940((byte) 100);
                        return;
                    }
                    if (~var8 != -24 || ~class204.field3934 <= -2) {
                        class7.method50(true, var8);
                        return;
                    }
                    class177.field3412 = 0;
                    ++class204.field3934;
                }
            }
            if (~class177.field3412 == -8 && ~class66.field1334.method326(0) < -1) {
                class55.field1160 = class66.field1334.method321(-121) * 60 - -180;
                class177.field3412 = 8;
            }
            if (class177.field3412 == 8) {
                class33.field741 = 0;
                class94.method663(class77.method529(-3, new class92[] { class142.method938(class55.field1160 / 60, false), class32.field731 }), class54.field1127, (byte) 53, class30.field658);
                if (~(--class55.field1160) >= -1) {
                    class177.field3412 = 0;
                }
            } else {
                if (~class177.field3412 == -10 && class66.field1334.method326(arg0 + 1949) >= 9) {
                    class88.field1730 = class66.field1334.method321(-106);
                    class165.field3253 = class66.field1334.method321(-127);
                    class77.field1607 = class66.field1334.method321(-115) == 1;
                    class170.field3313 = class66.field1334.method321(-110);
                    class170.field3313 <<= 8;
                    class170.field3313 += class66.field1334.method321(-115);
                    class25.field576 = class66.field1334.method321(-127);
                    class66.field1334.method318(0, (byte) 55, 1, class185.field3497.field1493);
                    class185.field3497.field1472 = 0;
                    class61.field1265 = class185.field3497.method404(true);
                    class66.field1334.method318(0, (byte) 95, 2, class185.field3497.field1493);
                    class185.field3497.field1472 = 0;
                    class148.field2930 = class185.field3497.method442(arg0 + -19402);
                    class177.field3412 = 10;
                }
                if (class177.field3412 == 10) {
                    if (~class66.field1334.method326(arg0 ^ -1949) <= ~class148.field2930) {
                        class185.field3497.field1472 = 0;
                        class66.field1334.method318(0, (byte) 56, class148.field2930, class185.field3497.field1493);
                        class2.method19(71);
                        class67.field1352 = -1;
                        class3.method22(false, (byte) -45);
                        class61.field1265 = -1;
                    }
                } else {
                    ++class33.field741;
                    if (class33.field741 > 2000) {
                        if (class204.field3934 < 1) {
                            class177.field3412 = 0;
                            ++class204.field3934;
                            if (~class135.field2708 != ~class102.field2097) {
                                class135.field2708 = class102.field2097;
                            } else {
                                class135.field2708 = class162.field3178;
                            }
                        } else {
                            class7.method50(true, -3);
                        }
                    }
                }
            }
        } catch (IOException var9) {
            if (class204.field3934 < 1) {
                ++class204.field3934;
                class177.field3412 = 0;
                if (class135.field2708 != class102.field2097) {
                    class135.field2708 = class102.field2097;
                } else {
                    class135.field2708 = class162.field3178;
                }
            } else {
                class7.method50(true, -2);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "(B)I")
    public final int method656(byte arg0) {
        ++field2728;
        int var2 = -55 / ((arg0 - 42) / 60);
        return this.field2714;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    public class136() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        ++field2727;
        int[][] var3 = super.field1873.method553(arg0, 0);
        if (arg1 != 4096) {
            return null;
        } else {
            if (super.field1873.field1656 && this.method909(true)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = (~class68.field1385 == ~this.field2724 ? arg0 : this.field2724 * arg0 / class68.field1385) * this.field2715;
                if (class150.field2985 != this.field2715) {
                    for (int var8 = 0; ~class150.field2985 < ~var8; ++var8) {
                        int var9 = this.field2715 * var8 / class150.field2985;
                        int var10 = this.field2721[var7 + var9];
                        var6[var8] = class196.method1301(255, var10) << 4;
                        var5[var8] = class196.method1301(4080, var10 >> 4);
                        var4[var8] = class196.method1301(var10, 16711680) >> 12;
                    }
                } else {
                    for (int var11 = 0; var11 < class150.field2985; ++var11) {
                        int var12 = this.field2721[var7++];
                        var6[var11] = class196.method1301(var12 << 4, 4080);
                        var5[var11] = class196.method1301(var12, 65280) >> 4;
                        var4[var11] = class196.method1301(4080, var12 >> 12);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(IZI)I")
    public static final int method911(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method906(true);
        }
        class116 var3 = (class116) class29.field637.method216(-94, (long) arg2);
        ++field2718;
        if (var3 == null) {
            return -1;
        } else {
            return arg0 >= 0 && var3.field2356.length > arg0 ? var3.field2356[arg0] : -1;
        }
    }
}
