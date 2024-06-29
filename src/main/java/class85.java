import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class85 extends class51 {

    @OriginalMember(owner = "client!jc", name = "db", descriptor = "I")
    private int field1662 = 4;

    @OriginalMember(owner = "client!jc", name = "cb", descriptor = "I")
    private int field1661 = 4;

    @OriginalMember(owner = "client!jc", name = "bb", descriptor = "Led;")
    private static class43 field1660 = class191.method1219("Welcome to RuneScape", false);

    @OriginalMember(owner = "client!jc", name = "eb", descriptor = "Led;")
    public static class43 field1663 = field1660;

    @OriginalMember(owner = "client!jc", name = "ib", descriptor = "Led;")
    public static class43 field1667 = null;

    @OriginalMember(owner = "client!jc", name = "fb", descriptor = "Z")
    public static boolean field1664 = false;

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "I")
    public static int field1658 = -1;

    @OriginalMember(owner = "client!jc", name = "nb", descriptor = "Led;")
    public static class43 field1672 = class191.method1219("Bitte geben Sie Ihren Benutzenamen ein)3", false);

    @OriginalMember(owner = "client!jc", name = "ab", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!jc", name = "gb", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!jc", name = "jb", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!jc", name = "lb", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!jc", name = "mb", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!jc", name = "hb", descriptor = "Lud;")
    public static class185 field1666;

    @OriginalMember(owner = "client!jc", name = "kb", descriptor = "Lga;")
    public static class58 field1669;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILjava/awt/Component;Lrf;I)Lhh;")
    public static final class73 method515(int arg0, int arg1, Component arg2, class160 arg3, int arg4) {
        ++field1665;
        if (~class38.field726 == -1) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (~arg4 > -257) {
                arg4 = 256;
            }
            try {
                class73 var5 = (class73) Class.forName("qg").newInstance();
                var5.field1450 = arg4;
                var5.field1419 = new int[(class88.field1708 ? 2 : 1) * 256];
                var5.method452(arg2);
                var5.field1439 = (-1024 & arg4) + 1024;
                if (var5.field1439 > 16384) {
                    var5.field1439 = 16384;
                }
                var5.method457(var5.field1439);
                if (class28.field515 > 0 && class128.field2558 == null) {
                    class128.field2558 = new class103();
                    class128.field2558.field1964 = arg3;
                    arg3.method1011(-9054, class128.field2558, class28.field515);
                }
                if (class128.field2558 != null) {
                    if (class128.field2558.field1957[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class128.field2558.field1957[arg1] = var5;
                }
                return var5;
            } catch (Throwable var9) {
                try {
                    class162 var6 = new class162(arg3, arg1);
                    int var7 = 44 % ((8 - arg0) / 60);
                    var6.field1419 = new int[256 * (class88.field1708 ? 2 : 1)];
                    var6.field1450 = arg4;
                    var6.method452(arg2);
                    var6.field1439 = 16384;
                    var6.method457(var6.field1439);
                    if (class28.field515 > 0 && class128.field2558 == null) {
                        class128.field2558 = new class103();
                        class128.field2558.field1964 = arg3;
                        arg3.method1011(-9054, class128.field2558, class28.field515);
                    }
                    if (class128.field2558 != null) {
                        if (class128.field2558.field1957[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class128.field2558.field1957[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class73();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class85() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lvc;I)V")
    public static final void method516(class193 arg0, int arg1) {
        ++field1671;
        if (class5.field112) {
            class188.method1199(arg1 + 24117, arg0);
        } else {
            if (~class185.field3649 == -2 && class41.field814 >= 715 && class187.field3673 >= 453) {
                class159.field3214 = !class159.field3214;
                if (class159.field3214) {
                    class33.method188((byte) 38);
                } else {
                    class49.method304(false, class174.field3461, arg1 ^ -23414, class68.field1363, class189.field3695, 255);
                }
            }
            if (~class174.field3473 != -6) {
                ++class207.field4054;
                if (class174.field3473 == 10) {
                    if (arg1 != 20) {
                        method517(-99);
                    }
                    if (class104.field1994 != 2 && ~class40.field776 == -1) {
                        if (class185.field3649 == 1) {
                            byte var2 = 5;
                            short var3 = 463;
                            byte var4 = 100;
                            byte var5 = 35;
                            if (~var2 >= ~class41.field814 && ~class41.field814 >= ~(var2 + var4) && var3 <= class187.field3673 && ~class187.field3673 >= ~(var3 + var5)) {
                                class117.method743(-31);
                                return;
                            }
                        }
                        if (field1666 != null) {
                            class117.method743(-106);
                        }
                    }
                    int var6 = class185.field3649;
                    int var7 = class187.field3673;
                    int var8 = class41.field814;
                    if (class201.field3944 != 0) {
                        if (~class201.field3944 != -3) {
                            if (class201.field3944 == 3) {
                                short var9 = 382;
                                short var10 = 321;
                                if (~var6 == -2 && var9 + -75 <= var8 && var8 <= var9 - -75 && var10 - 20 <= var7 && var10 - -20 >= var7) {
                                    class201.field3944 = 0;
                                    return;
                                }
                            }
                        } else {
                            short var11 = 231;
                            int var21 = var11 + 30;
                            short var12 = 302;
                            short var13 = 321;
                            if (var6 == 1 && ~(var21 - 15) >= ~var7 && ~var7 > ~var21) {
                                class121.field2430 = 0;
                            }
                            var21 += 15;
                            if (~var6 == -2 && var7 >= var21 + -15 && ~var21 < ~var7) {
                                class121.field2430 = 1;
                            }
                            var21 += 15;
                            if (~var6 == -2 && ~(var12 + -75) >= ~var8 && ~(var12 + 75) <= ~var8 && ~(var13 + -20) >= ~var7 && ~var7 >= ~(var13 - -20)) {
                                class68.field1374 = class68.field1374.method236(10).method273(-72);
                                if (~class68.field1374.method248((byte) 60) == -1) {
                                    class84.method514(34, class36.field686, class36.field664, class82.field1620);
                                    return;
                                }
                                if (class68.field1368.method248((byte) 60) == 0) {
                                    class84.method514(-96, class36.field685, class36.field661, class116.field2278);
                                    return;
                                }
                                class84.method514(arg1 + 24, class36.field680, class36.field691, class7.field146);
                                class35.method197((byte) -125, 20);
                                return;
                            }
                            short var14 = 462;
                            if (~var6 == -2 && ~(var14 + -75) >= ~var8 && var8 <= var14 + 75 && ~var7 <= ~(var13 - 20) && var13 + 20 >= var7) {
                                class68.field1374 = class68.field1363;
                                class201.field3944 = 0;
                                class68.field1368 = class68.field1363;
                            }
                            while (true) {
                                boolean var15;
                                label207: do {
                                    while (class66.method414(1)) {
                                        var15 = false;
                                        for (int var16 = 0; ~class44.field866.method248((byte) 60) < ~var16; ++var16) {
                                            if (class116.field2271 == class44.field866.method256(true, var16)) {
                                                var15 = true;
                                                break;
                                            }
                                        }
                                        if (class121.field2430 != 0) {
                                            continue label207;
                                        }
                                        if (class112.field2148 == 85 && ~class68.field1374.method248((byte) 60) < -1) {
                                            class68.field1374 = class68.field1374.method241((byte) -52, 0, class68.field1374.method248((byte) 60) - 1);
                                        }
                                        if (class112.field2148 == 84 || ~class112.field2148 == -81) {
                                            class121.field2430 = 1;
                                        }
                                        if (var15 && ~class68.field1374.method248((byte) 60) > -13) {
                                            class68.field1374 = class68.field1374.method272(class116.field2271, 22107);
                                        }
                                    }
                                    return;
                                } while (class121.field2430 != 1);
                                if (class112.field2148 == 85 && class68.field1368.method248((byte) 60) > 0) {
                                    class68.field1368 = class68.field1368.method241((byte) 100, 0, -1 + class68.field1368.method248((byte) 60));
                                }
                                if (class112.field2148 == 84 || ~class112.field2148 == -81) {
                                    class121.field2430 = 0;
                                }
                                if (class81.field1612 != 0 && ~class112.field2148 == -85) {
                                    class68.field1374 = class68.field1374.method236(10).method273(-72);
                                    if (~class68.field1374.method248((byte) 60) == -1) {
                                        class84.method514(22, class36.field686, class36.field664, class82.field1620);
                                        return;
                                    }
                                    if (~class68.field1368.method248((byte) 60) == -1) {
                                        class84.method514(arg1 ^ -100, class36.field685, class36.field661, class116.field2278);
                                        return;
                                    }
                                    class84.method514(24, class36.field680, class36.field691, class7.field146);
                                    class35.method197((byte) -82, 20);
                                    return;
                                }
                                if (var15 && ~class68.field1368.method248((byte) 60) > -21) {
                                    class68.field1368 = class68.field1368.method272(class116.field2271, 22107);
                                }
                            }
                        }
                    } else {
                        short var17 = 291;
                        short var18 = 302;
                        boolean var19 = false;
                        if (var6 == 1 && var18 + -75 <= var8 && ~var8 >= ~(var18 + 75) && ~var7 <= ~(var17 + -20) && ~var7 >= ~(var17 + 20)) {
                            class121.field2430 = 0;
                            class201.field3944 = 3;
                        }
                        if (~class81.field1612 != -1) {
                            while (class66.method414(1)) {
                                if (class112.field2148 == 84) {
                                    var19 = true;
                                    break;
                                }
                            }
                        }
                        short var20 = 462;
                        if (var19 || var6 == 1 && var20 + -75 <= var8 && ~(var20 + 75) <= ~var8 && ~(var17 + -20) >= ~var7 && ~var7 >= ~(var17 - -20)) {
                            class68.field1361 = class36.field699;
                            class68.field1358 = class36.field658;
                            class68.field1371 = class140.field2903;
                            class121.field2430 = 0;
                            class201.field3944 = 2;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method99(int arg0, byte arg1) {
        ++field1659;
        if (arg1 != -94) {
            return null;
        } else {
            int[][] var3 = super.field1027.method1087(arg0, arg1 ^ 92);
            if (super.field1027.field3428) {
                int var4 = class122.field2442 / this.field1662;
                int var5 = class112.field2144 / this.field1661;
                int[][] var7;
                if (var5 > 0) {
                    int var6 = arg0 % var5;
                    var7 = this.method306(arg1 ^ -94, class112.field2144 * var6 / var5, 0);
                } else {
                    var7 = this.method306(0, 0, 0);
                }
                int[] var8 = var7[1];
                int[] var9 = var7[2];
                int[] var10 = var3[2];
                int[] var11 = var3[1];
                int[] var12 = var7[0];
                int[] var13 = var3[0];
                for (int var14 = 0; ~class122.field2442 < ~var14; ++var14) {
                    int var16;
                    if (~var4 < -1) {
                        int var15 = var14 % var4;
                        var16 = class122.field2442 * var15 / var4;
                    } else {
                        var16 = 0;
                    }
                    var13[var14] = var12[var16];
                    var11[var14] = var8[var16];
                    var10[var14] = var9[var16];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
    public static void method517(int arg0) {
        field1663 = null;
        field1666 = null;
        field1672 = null;
        if (arg0 <= -24) {
            field1669 = null;
            field1667 = null;
            field1660 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field1668;
        if (arg0 != 16) {
            method515(-70, -6, (Component) null, (class160) null, 125);
        }
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (super.field1025.field154) {
            int var4 = class122.field2442 / this.field1662;
            int var5 = class112.field2144 / this.field1661;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method314(0, (byte) -35, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method314(0, (byte) -111, class112.field2144 * var7 / var5);
            }
            for (int var8 = 0; ~class122.field2442 < ~var8; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class122.field2442 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method99(-101, (byte) 33);
        }
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field1661 = arg0.method538((byte) -39);
            }
        } else {
            this.field1662 = arg0.method538((byte) 119);
        }
        ++field1670;
    }
}
