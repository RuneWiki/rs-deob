import java.io.DataInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class119 extends class120 {

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
    public int field2700 = 0;

    @OriginalMember(owner = "client!ud", name = "hb", descriptor = "I")
    public int field2717 = 0;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "Z")
    public boolean field2701 = false;

    @OriginalMember(owner = "client!ud", name = "fb", descriptor = "I")
    private int field2715 = -1;

    @OriginalMember(owner = "client!ud", name = "rb", descriptor = "[Lva;")
    public class121[] field2727 = new class121[] { null, null, class60.field1442, null, null };

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "Lva;")
    public class121 field2708 = class12.field198;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    public int field2698 = 0;

    @OriginalMember(owner = "client!ud", name = "ub", descriptor = "I")
    public int field2730 = 2000;

    @OriginalMember(owner = "client!ud", name = "db", descriptor = "I")
    private int field2713 = -1;

    @OriginalMember(owner = "client!ud", name = "wb", descriptor = "I")
    private int field2732 = 128;

    @OriginalMember(owner = "client!ud", name = "kb", descriptor = "I")
    private int field2720 = -1;

    @OriginalMember(owner = "client!ud", name = "ob", descriptor = "I")
    public int field2724 = 1;

    @OriginalMember(owner = "client!ud", name = "nb", descriptor = "I")
    public int field2723 = 0;

    @OriginalMember(owner = "client!ud", name = "Jb", descriptor = "I")
    public int field2745 = 0;

    @OriginalMember(owner = "client!ud", name = "Ab", descriptor = "I")
    private int field2736 = -1;

    @OriginalMember(owner = "client!ud", name = "bb", descriptor = "I")
    public int field2711 = -1;

    @OriginalMember(owner = "client!ud", name = "gb", descriptor = "I")
    public int field2716 = -1;

    @OriginalMember(owner = "client!ud", name = "sb", descriptor = "[Lva;")
    public class121[] field2728 = new class121[] { null, null, null, null, class114.field2576 };

    @OriginalMember(owner = "client!ud", name = "ib", descriptor = "I")
    private int field2718 = -1;

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "I")
    private int field2709 = 128;

    @OriginalMember(owner = "client!ud", name = "Cb", descriptor = "I")
    private int field2738 = 0;

    @OriginalMember(owner = "client!ud", name = "Bb", descriptor = "I")
    private int field2737 = 0;

    @OriginalMember(owner = "client!ud", name = "Db", descriptor = "I")
    private int field2739 = -1;

    @OriginalMember(owner = "client!ud", name = "Rb", descriptor = "I")
    public int field2753 = 0;

    @OriginalMember(owner = "client!ud", name = "Pb", descriptor = "I")
    private int field2751 = -1;

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "I")
    public int field2705 = 0;

    @OriginalMember(owner = "client!ud", name = "Mb", descriptor = "I")
    public int field2748 = 0;

    @OriginalMember(owner = "client!ud", name = "Lb", descriptor = "I")
    private int field2747 = -1;

    @OriginalMember(owner = "client!ud", name = "Qb", descriptor = "I")
    private int field2752 = -1;

    @OriginalMember(owner = "client!ud", name = "tb", descriptor = "Z")
    public boolean field2729 = false;

    @OriginalMember(owner = "client!ud", name = "Wb", descriptor = "I")
    private int field2758 = -1;

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "I")
    private int field2706 = 128;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "Z")
    public static boolean field2702 = false;

    @OriginalMember(owner = "client!ud", name = "zb", descriptor = "[I")
    public static int[] field2735 = new int[4000];

    @OriginalMember(owner = "client!ud", name = "Fb", descriptor = "Lva;")
    private static class121 field2741 = class107.method797("(U4", -10983);

    @OriginalMember(owner = "client!ud", name = "Gb", descriptor = "Lva;")
    public static class121 field2742 = class107.method797(" )2> @yel@", -10983);

    @OriginalMember(owner = "client!ud", name = "Tb", descriptor = "Lva;")
    public static class121 field2755 = class107.method797("redstone3", -10983);

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "I")
    private int field2703;

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!ud", name = "cb", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!ud", name = "eb", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!ud", name = "lb", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!ud", name = "pb", descriptor = "I")
    public int field2725;

    @OriginalMember(owner = "client!ud", name = "xb", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!ud", name = "yb", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!ud", name = "Hb", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!ud", name = "Ib", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!ud", name = "Kb", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!ud", name = "Nb", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!ud", name = "Ob", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!ud", name = "Sb", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!ud", name = "Xb", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!ud", name = "Vb", descriptor = "Lub;")
    public static class117 field2757;

    @OriginalMember(owner = "client!ud", name = "jb", descriptor = "Lw;")
    public static class125 field2719;

    @OriginalMember(owner = "client!ud", name = "vb", descriptor = "Lw;")
    public static class125 field2731;

    @OriginalMember(owner = "client!ud", name = "Ub", descriptor = "Lbe;")
    public static class12 field2756;

    @OriginalMember(owner = "client!ud", name = "Eb", descriptor = "Lhb;")
    public static class44 field2740;

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "[I")
    public int[] field2707;

    @OriginalMember(owner = "client!ud", name = "ab", descriptor = "[I")
    public int[] field2710;

    @OriginalMember(owner = "client!ud", name = "mb", descriptor = "[I")
    private int[] field2722;

    @OriginalMember(owner = "client!ud", name = "qb", descriptor = "[I")
    private int[] field2726;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lud;BLud;)V", line = 14)
    public final void method911(class119 arg0, byte arg1, class119 arg2) {
        this.field2729 = arg2.field2729;
        this.field2723 = arg0.field2723;
        this.field2708 = arg2.field2708;
        field2746++;
        this.field2703 = arg0.field2703;
        this.field2745 = arg0.field2745;
        this.field2722 = arg0.field2722;
        this.field2698 = arg0.field2698;
        this.field2726 = arg0.field2726;
        this.field2724 = arg2.field2724;
        this.field2701 = true;
        this.field2730 = arg0.field2730;
        this.field2717 = arg0.field2717;
        int var4 = -76 % ((arg1 + 41) / 37);
        this.field2705 = arg0.field2705;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILed;)V", line = 36)
    public static final void method912(int arg0, class29 arg1) {
        arg1.field777 = arg1.field740;
        field2714++;
        if (arg1.field724 == 0) {
            arg1.field729 = 0;
            return;
        }
        if (arg1.field793 != -1 && arg1.field778 == 0) {
            class41 var2 = class5.method33(arg0 + 21312, arg1.field793);
            if (arg1.field773 > 0 && var2.field912 == 0) {
                arg1.field729++;
                return;
            }
            if (arg1.field773 <= 0 && var2.field922 == 0) {
                arg1.field729++;
                return;
            }
        }
        int var3 = arg1.field750;
        int var4 = arg1.field742;
        int var5 = arg1.field767[arg1.field724 - 1] * 128 + arg1.field786 * 64;
        int var6 = arg1.field730[arg1.field724 - 1] * 128 + arg1.field786 * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg1.field750 = var5;
            arg1.field742 = var6;
            return;
        }
        if (var3 < var5) {
            if (var4 < var6) {
                arg1.field725 = 1280;
            } else if (var4 <= var6) {
                arg1.field725 = 1536;
            } else {
                arg1.field725 = 1792;
            }
        } else if (var5 >= var3) {
            if (var4 < var6) {
                arg1.field725 = 1024;
            } else {
                arg1.field725 = 0;
            }
        } else if (var4 < var6) {
            arg1.field725 = 768;
        } else if (var4 > var6) {
            arg1.field725 = 256;
        } else {
            arg1.field725 = 512;
        }
        int var7 = arg1.field725 - arg1.field739 & 0x7FF;
        if (arg0 != -21303) {
            method924(-34);
        }
        int var8 = 4;
        if (arg1.field739 != arg1.field725 && arg1.field753 == -1 && arg1.field728 != 0) {
            var8 = 2;
        }
        if (arg1.field724 > 2) {
            var8 = 6;
        }
        if (arg1.field724 > 3) {
            var8 = 8;
        }
        int var9 = arg1.field759;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        if (var7 >= -256 && var7 <= 256) {
            var9 = arg1.field769;
        } else if (var7 >= 256 && var7 < 768) {
            var9 = arg1.field765;
        } else if (var7 >= -768 && var7 <= -256) {
            var9 = arg1.field721;
        }
        if (arg1.field729 > 0 && arg1.field724 > 1) {
            arg1.field729--;
            var8 = 8;
        }
        if (var9 == -1) {
            var9 = arg1.field769;
        }
        arg1.field777 = var9;
        if (arg1.field771[arg1.field724 - 1]) {
            var8 <<= 0x1;
        }
        if (var3 < var5) {
            arg1.field750 += var8;
            if (var5 < arg1.field750) {
                arg1.field750 = var5;
            }
        } else if (var3 > var5) {
            arg1.field750 -= var8;
            if (var5 > arg1.field750) {
                arg1.field750 = var5;
            }
        }
        if (var6 > var4) {
            arg1.field742 += var8;
            if (var6 < arg1.field742) {
                arg1.field742 = var6;
            }
        } else if (var4 > var6) {
            arg1.field742 -= var8;
            if (arg1.field742 < var6) {
                arg1.field742 = var6;
            }
        }
        if (arg1.field750 == var5 && arg1.field742 == var6) {
            arg1.field724--;
            if (arg1.field773 > 0) {
                arg1.field773--;
            }
        }
        if (var8 >= 8 && arg1.field777 == arg1.field769 && arg1.field736 != -1) {
            arg1.field777 = arg1.field736;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ltc;B)V", line = 227)
    public final void method913(class113 arg0, byte arg1) {
        int var3 = -16 % ((arg1 - 48) / 40);
        field2721++;
        while (true) {
            int var4 = arg0.method821(true);
            if (var4 == 0) {
                return;
            }
            this.method919(var4, arg0, -1);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BZ)Z", line = 247)
    public final boolean method914(byte arg0, boolean arg1) {
        int var3 = this.field2718;
        field2699++;
        if (arg0 > -23) {
            this.field2710 = null;
        }
        int var4 = this.field2713;
        if (arg1) {
            var4 = this.field2739;
            var3 = this.field2736;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!class69.field1639.method329(var3, -1, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !class69.field1639.method329(var4, -1, 0)) {
            var5 = false;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(B)V", line = 295)
    public final void method915(byte arg0) {
        field2754++;
        int var2 = 46 / ((-arg0 - 78) / 45);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ld;ILva;)Lva;", line = 314)
    public static final class121 method916(class19 arg0, int arg1, class121 arg2) {
        field2696++;
        if (arg2.method950(arg1 ^ 0x1, class53.field1236) == arg1) {
            return arg2;
        }
        while (true) {
            int var3 = arg2.method950(-2, class54.field1247);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg2.method950(arg1 - 1, class22.field574);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg2.method950(-2, class113.field2531);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg2.method950(-2, field2741);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg2.method950(-2, class67.field1615);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg2.method950(-2, class34.field823);
                                                    if (var8 == -1) {
                                                        return arg2;
                                                    }
                                                    class121 var9 = class18.field415;
                                                    if (client.field433 != null) {
                                                        var9 = class26.method205(client.field433.field799, false);
                                                        try {
                                                            if (client.field433.field800 != null) {
                                                                byte[] var10 = ((String) client.field433.field800).getBytes("ISO-8859-1");
                                                                var9 = class99.method669(~arg1, var10, var10.length, 0);
                                                            }
                                                        } catch (UnsupportedEncodingException var11) {
                                                        }
                                                    }
                                                    arg2 = class113.method866((byte) -56, new class121[] { arg2.method957(var8, true, 0), var9, arg2.method965(63, var8 + 4) });
                                                }
                                            }
                                            arg2 = class113.method866((byte) -98, new class121[] { arg2.method957(var7, true, 0), class59.method431((byte) 49, class4.method30(arg0, 118, 4)), arg2.method965(63, var7 + 2) });
                                        }
                                    }
                                    arg2 = class113.method866((byte) -80, new class121[] { arg2.method957(var6, true, 0), class59.method431((byte) 49, class4.method30(arg0, 123, 3)), arg2.method965(63, var6 + 2) });
                                }
                            }
                            arg2 = class113.method866((byte) -61, new class121[] { arg2.method957(var5, true, 0), class59.method431((byte) 49, class4.method30(arg0, 120, 2)), arg2.method965(63, var5 + 2) });
                        }
                    }
                    arg2 = class113.method866((byte) -107, new class121[] { arg2.method957(var4, true, 0), class59.method431((byte) 49, class4.method30(arg0, 116, 1)), arg2.method965(63, var4 + 2) });
                }
            }
            arg2 = class113.method866((byte) -46, new class121[] { arg2.method957(var3, true, 0), class59.method431((byte) 49, class4.method30(arg0, 123, 0)), arg2.method965(63, var3 + 2) });
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)Z", line = 418)
    public final boolean method917(int arg0, boolean arg1) {
        field2734++;
        int var3 = this.field2752;
        if (arg0 != 11105) {
            this.field2717 = 1;
        }
        int var4 = this.field2758;
        int var5 = this.field2747;
        if (arg1) {
            var4 = this.field2751;
            var5 = this.field2715;
            var3 = this.field2720;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var6 = true;
        if (!class69.field1639.method329(var3, -1, 0)) {
            var6 = false;
        }
        if (var5 != -1 && !class69.field1639.method329(var5, -1, 0)) {
            var6 = false;
        }
        if (var4 != -1 && !class69.field1639.method329(var4, -1, 0)) {
            var6 = false;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IBZ)Lrb;", line = 471)
    public final class102 method918(int arg0, byte arg1, boolean arg2) {
        if (arg1 != 59) {
            this.method921(false, true);
        }
        field2749++;
        if (this.field2707 != null && arg0 > 1) {
            int var4 = -1;
            for (int var5 = 0; var5 < 10; var5++) {
                if (arg0 >= this.field2710[var5] && this.field2710[var5] != 0) {
                    var4 = this.field2707[var5];
                }
            }
            if (var4 != -1) {
                return class114.method872((byte) 121, var4).method918(1, (byte) 59, arg2);
            }
        }
        if (arg2) {
            class102 var6 = (class102) class37.field859.method345(arg1 + 57, (long) this.field2725);
            if (var6 != null) {
                return var6;
            }
        }
        class102 var7 = class102.method711(class69.field1639, this.field2703, 0);
        if (var7 == null) {
            return null;
        }
        if (this.field2706 != 128 || this.field2732 != 128 || this.field2709 != 128) {
            var7.method692(this.field2706, this.field2732, this.field2709);
        }
        if (this.field2722 != null) {
            for (int var8 = 0; var8 < this.field2722.length; var8++) {
                var7.method704(this.field2722[var8], this.field2726[var8]);
            }
        }
        if (arg2) {
            var7.method700(this.field2753 + 64, this.field2700 + 768, -50, -10, -50, true);
            var7.field2289 = true;
            class37.field859.method350((byte) 123, var7, (long) this.field2725);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILtc;I)V", line = 552)
    private final void method919(int arg0, class113 arg1, int arg2) {
        if (arg2 != -1) {
            return;
        }
        field2759++;
        if (arg0 == 1) {
            this.field2703 = arg1.method870(-1);
        } else if (arg0 == 2) {
            this.field2708 = arg1.method861(20356);
        } else if (arg0 == 4) {
            this.field2730 = arg1.method870(-1);
        } else if (arg0 == 5) {
            this.field2698 = arg1.method870(-1);
        } else if (arg0 == 6) {
            this.field2717 = arg1.method870(-1);
        } else if (arg0 == 7) {
            this.field2745 = arg1.method870(-1);
            if (this.field2745 > 32767) {
                this.field2745 -= 65536;
                return;
            }
        } else {
            if (arg0 == 8) {
                this.field2705 = arg1.method870(-1);
                if (this.field2705 > 32767) {
                    this.field2705 -= 65536;
                    return;
                }
            } else if (arg0 == 10) {
                arg1.method870(arg2);
            } else if (arg0 == 11) {
                this.field2701 = true;
                return;
            } else if (arg0 == 12) {
                this.field2724 = arg1.method822(-708753192);
                return;
            } else if (arg0 == 16) {
                this.field2729 = true;
                return;
            } else if (arg0 == 23) {
                this.field2752 = arg1.method870(-1);
                this.field2738 = arg1.method821(true);
                return;
            } else if (arg0 == 24) {
                this.field2747 = arg1.method870(-1);
                return;
            } else if (arg0 == 25) {
                this.field2720 = arg1.method870(arg2);
                this.field2737 = arg1.method821(true);
                return;
            } else {
                if (arg0 == 26) {
                    this.field2715 = arg1.method870(-1);
                } else if (arg0 >= 30 && arg0 < 35) {
                    this.field2727[arg0 - 30] = arg1.method861(20356);
                    if (this.field2727[arg0 - 30].method940(class127.field2921, (byte) 84)) {
                        this.field2727[arg0 - 30] = null;
                        return;
                    }
                } else if (arg0 < 35 || arg0 >= 40) {
                    if (arg0 != 40) {
                        if (arg0 == 78) {
                            this.field2758 = arg1.method870(-1);
                            return;
                        }
                        if (arg0 != 79) {
                            if (arg0 == 90) {
                                this.field2718 = arg1.method870(-1);
                                return;
                            }
                            if (arg0 == 91) {
                                this.field2736 = arg1.method870(-1);
                                return;
                            }
                            if (arg0 == 92) {
                                this.field2713 = arg1.method870(-1);
                                return;
                            }
                            if (arg0 != 93) {
                                if (arg0 == 95) {
                                    this.field2723 = arg1.method870(arg2);
                                    return;
                                }
                                if (arg0 == 97) {
                                    this.field2716 = arg1.method870(-1);
                                    return;
                                }
                                if (arg0 != 98) {
                                    if (arg0 >= 100 && arg0 < 110) {
                                        if (this.field2707 == null) {
                                            this.field2707 = new int[10];
                                            this.field2710 = new int[10];
                                        }
                                        this.field2707[arg0 - 100] = arg1.method870(-1);
                                        this.field2710[arg0 - 100] = arg1.method870(-1);
                                        return;
                                    }
                                    if (arg0 == 110) {
                                        this.field2706 = arg1.method870(-1);
                                        return;
                                    }
                                    if (arg0 == 111) {
                                        this.field2732 = arg1.method870(arg2);
                                        return;
                                    }
                                    if (arg0 != 112) {
                                        if (arg0 == 113) {
                                            this.field2753 = arg1.method841(true);
                                            return;
                                        }
                                        if (arg0 == 114) {
                                            this.field2700 = arg1.method841(true) * 5;
                                        } else if (arg0 == 115) {
                                            this.field2748 = arg1.method821(true);
                                            return;
                                        }
                                        return;
                                    }
                                    this.field2709 = arg1.method870(-1);
                                    return;
                                }
                                this.field2711 = arg1.method870(-1);
                                return;
                            }
                            this.field2739 = arg1.method870(arg2);
                            return;
                        }
                        this.field2751 = arg1.method870(arg2);
                        return;
                    }
                    int var4 = arg1.method821(true);
                    this.field2726 = new int[var4];
                    this.field2722 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field2722[var5] = arg1.method870(-1);
                        this.field2726[var5] = arg1.method870(-1);
                    }
                    return;
                } else {
                    this.field2728[arg0 - 35] = arg1.method861(arg2 + 20357);
                    return;
                }
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Throwable;)V", line = 755)
    public static final void method920(boolean arg0, String arg1, Throwable arg2) {
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class38.method262(false, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            if (!arg0) {
                field2757 = null;
            }
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            class32 var8 = class92.field2085.method771((byte) 109, new URL(class92.field2085.field2418.getCodeBase(), "clienterror.ws?c=" + class67.field1613 + "&u=" + class56.field1312 + "&v1=" + class105.field2404 + "&v2=" + class105.field2406 + "&e=" + var7));
            while (var8.field795 == 0) {
                class113.method833(1L, true);
            }
            if (var8.field795 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field800;
                var9.read();
                var9.close();
            }
        } catch (Exception var10) {
        }
        field2744++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZ)Lrb;", line = 809)
    public final class102 method921(boolean arg0, boolean arg1) {
        int var3 = this.field2752;
        if (arg0) {
            this.method921(true, false);
        }
        field2743++;
        int var4 = this.field2747;
        int var5 = this.field2758;
        if (arg1) {
            var3 = this.field2720;
            var4 = this.field2715;
            var5 = this.field2751;
        }
        if (var3 == -1) {
            return null;
        }
        class102 var6 = class102.method711(class69.field1639, var3, 0);
        if (var4 != -1) {
            class102 var7 = class102.method711(class69.field1639, var4, 0);
            if (var5 == -1) {
                class102[] var10 = new class102[] { var6, var7 };
                var6 = new class102(var10, 2);
            } else {
                class102 var8 = class102.method711(class69.field1639, var5, 0);
                class102[] var9 = new class102[] { var6, var7, var8 };
                var6 = new class102(var9, 3);
            }
        }
        if (!arg1 && this.field2738 != 0) {
            var6.method691(0, this.field2738, 0);
        }
        if (arg1 && this.field2737 != 0) {
            var6.method691(0, this.field2737, 0);
        }
        if (this.field2722 != null) {
            for (int var11 = 0; var11 < this.field2722.length; var11++) {
                var6.method704(this.field2722[var11], this.field2726[var11]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILhe;II)[Lbc;", line = 907)
    public static final class10[] method922(int arg0, class47 arg1, int arg2, int arg3) {
        if (arg3 > -75) {
            field2741 = null;
        }
        field2704++;
        return class5.method36(arg2, 29066, arg1, arg0) ? class26.method207(110) : null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)Lrb;", line = 936)
    public final class102 method923(boolean arg0, int arg1) {
        int var3 = this.field2718;
        int var4 = this.field2713;
        if (arg0) {
            var3 = this.field2736;
            var4 = this.field2739;
        }
        field2733++;
        if (arg1 != 18321) {
            this.method913(null, (byte) -107);
        }
        if (var3 == -1) {
            return null;
        }
        class102 var5 = class102.method711(class69.field1639, var3, 0);
        if (var4 != -1) {
            class102 var6 = class102.method711(class69.field1639, var4, 0);
            class102[] var7 = new class102[] { var5, var6 };
            var5 = new class102(var7, 2);
        }
        if (this.field2722 != null) {
            for (int var8 = 0; var8 < this.field2722.length; var8++) {
                var5.method704(this.field2722[var8], this.field2726[var8]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V", line = 988)
    public static void method924(int arg0) {
        field2742 = null;
        field2755 = null;
        field2741 = null;
        field2731 = null;
        field2757 = null;
        if (arg0 == 128) {
            field2719 = null;
            field2756 = null;
            field2740 = null;
            field2735 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(B)V", line = 1007)
    public static final void method925(byte arg0) {
        class82.field1896.method347(true);
        if (arg0 == -84) {
            class76.field1749.method347(true);
            field2750++;
        }
    }
}
