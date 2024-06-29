import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class116 extends class106 {

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "Z")
    private boolean field2847 = false;

    @OriginalMember(owner = "client!tb", name = "zb", descriptor = "Z")
    private volatile boolean field2864 = false;

    @OriginalMember(owner = "client!tb", name = "Db", descriptor = "I")
    private int field2868 = -1;

    @OriginalMember(owner = "client!tb", name = "tb", descriptor = "I")
    private int field2858;

    @OriginalMember(owner = "client!tb", name = "lb", descriptor = "Lr;")
    private class102 field2850;

    @OriginalMember(owner = "client!tb", name = "mb", descriptor = "Lr;")
    private class102 field2851;

    @OriginalMember(owner = "client!tb", name = "ub", descriptor = "Lad;")
    private static class5 field2859 = class88.method674("Connecting to friendserver", 30);

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "Lad;")
    public static class5 field2848 = field2859;

    @OriginalMember(owner = "client!tb", name = "vb", descriptor = "Lq;")
    public static class96 field2860 = new class96();

    @OriginalMember(owner = "client!tb", name = "Eb", descriptor = "Lpa;")
    public static class91 field2869 = null;

    @OriginalMember(owner = "client!tb", name = "Fb", descriptor = "Lad;")
    public static class5 field2870 = class88.method674(",Zffentlicher Chat", 60);

    @OriginalMember(owner = "client!tb", name = "Pb", descriptor = "Lad;")
    private static class5 field2880 = class88.method674("Invalid loginserver requested)3", 43);

    @OriginalMember(owner = "client!tb", name = "Lb", descriptor = "Lad;")
    private static class5 field2876 = class88.method674("Loaded title screen", 87);

    @OriginalMember(owner = "client!tb", name = "Ob", descriptor = "[Lad;")
    public static class5[] field2879 = new class5[100];

    @OriginalMember(owner = "client!tb", name = "Hb", descriptor = "Lad;")
    private static class5 field2872 = class88.method674("Loaded gamescreen", 53);

    @OriginalMember(owner = "client!tb", name = "Sb", descriptor = "Lad;")
    private static class5 field2883 = class88.method674("skill)2", -74);

    @OriginalMember(owner = "client!tb", name = "Rb", descriptor = "Z")
    public static boolean field2882 = true;

    @OriginalMember(owner = "client!tb", name = "Nb", descriptor = "Lad;")
    public static class5 field2878 = field2883;

    @OriginalMember(owner = "client!tb", name = "Kb", descriptor = "Lad;")
    public static class5 field2875 = field2876;

    @OriginalMember(owner = "client!tb", name = "Mb", descriptor = "Lad;")
    public static class5 field2877 = field2872;

    @OriginalMember(owner = "client!tb", name = "Tb", descriptor = "Lad;")
    public static class5 field2884 = class88.method674("Unerwartete Antwort vom Anmelde)2Server", 61);

    @OriginalMember(owner = "client!tb", name = "Ib", descriptor = "Lad;")
    public static class5 field2873 = field2880;

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!tb", name = "kb", descriptor = "I")
    private int field2849;

    @OriginalMember(owner = "client!tb", name = "nb", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!tb", name = "ob", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!tb", name = "pb", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!tb", name = "rb", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!tb", name = "sb", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!tb", name = "wb", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!tb", name = "xb", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!tb", name = "yb", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!tb", name = "Ab", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!tb", name = "Jb", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!tb", name = "Qb", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!tb", name = "Cb", descriptor = "Lee;")
    public static class30 field2867;

    @OriginalMember(owner = "client!tb", name = "Gb", descriptor = "[I")
    public static int[] field2871;

    @OriginalMember(owner = "client!tb", name = "Ub", descriptor = "[I")
    public static int[] field2885;

    @OriginalMember(owner = "client!tb", name = "Bb", descriptor = "[Luc;")
    public static class123[] field2866;

    @OriginalMember(owner = "client!tb", name = "qb", descriptor = "[Z")
    private volatile boolean[] field2855;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZZII[B)V", line = 4)
    public final void method920(boolean arg0, boolean arg1, int arg2, int arg3, byte[] arg4) {
        ++field2881;
        if (arg0) {
            if (this.field2864) {
                throw new RuntimeException();
            }
            if (this.field2850 != null) {
                class83.method639(arg4, true, this.field2850, this.field2858);
            }
            this.method866(-1, arg4);
            this.method929(100);
        } else {
            arg4[arg4.length + -2] = (byte) (super.field2655[arg2] >> 8);
            arg4[arg4.length - 1] = (byte) super.field2655[arg2];
            if (this.field2851 != null) {
                class83.method639(arg4, true, this.field2851, arg2);
                this.field2855[arg2] = true;
            }
            if (arg1) {
                super.field2689[arg2] = arg4;
            }
        }
        if (arg3 != 7352) {
            this.method861(15, (byte) 97);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)I", line = 53)
    public final int method921(byte arg0) {
        ++field2865;
        if (this.field2864) {
            return 100;
        } else if (super.field2689 != null) {
            return 99;
        } else {
            int var2 = class82.method634(this.field2858, (byte) -69, 255);
            if (var2 >= 100) {
                var2 = 99;
            }
            int var3 = -6 % ((arg0 - -40) / 49);
            return var2;
        }
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(II)I", line = 76)
    private final int method922(int arg0, int arg1) {
        ++field2845;
        if (super.field2689[arg0] != null) {
            return 100;
        } else if (this.field2855[arg0]) {
            return 100;
        } else {
            if (arg1 != 100) {
                method928(22, -102);
            }
            return class82.method634(arg0, (byte) -69, this.field2858);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(IB)V", line = 102)
    public final void method923(int arg0, byte arg1) {
        ++field2853;
        this.field2849 = arg0;
        if (arg1 != 1) {
            this.field2855 = null;
        }
        if (this.field2850 == null) {
            class14.method122(this.field2849, arg1 ^ -8983, this.field2858, 255, true, this, (byte) 0);
        } else {
            class50.method431(this.field2850, 62, this.field2858, this);
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lr;Lr;IZZZ)V", line = 118)
    public class116(class102 arg0, class102 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2847 = arg5;
        this.field2858 = arg2;
        this.field2850 = arg1;
        this.field2851 = arg0;
        class27.method227(0, this.field2858, this);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lrd;III)[Lub;", line = 130)
    public static final class122[] method924(class106 arg0, int arg1, int arg2, int arg3) {
        ++field2863;
        if (arg2 != -8575) {
            return null;
        } else {
            return !class5.method76((byte) -108, arg3, arg0, arg1) ? null : class69.method543(arg2 + 8537);
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V", line = 149)
    public static void method925(int arg0) {
        field2884 = null;
        field2871 = null;
        field2867 = null;
        int var1 = -99 / ((arg0 - -80) / 41);
        field2873 = null;
        field2860 = null;
        field2872 = null;
        field2877 = null;
        field2875 = null;
        field2870 = null;
        field2859 = null;
        field2883 = null;
        field2879 = null;
        field2876 = null;
        field2878 = null;
        field2880 = null;
        field2866 = null;
        field2885 = null;
        field2848 = null;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)V", line = 181)
    public final void method862(int arg0, int arg1) {
        class102.method820(this.field2858, (byte) -106, arg1);
        ++field2861;
        if (arg0 != 255) {
            method925(-87);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBZLr;[B)V", line = 192)
    public final void method926(int arg0, byte arg1, boolean arg2, class102 arg3, byte[] arg4) {
        if (arg1 != -112) {
            field2871 = null;
        }
        ++field2862;
        if (this.field2850 == arg3) {
            if (this.field2864) {
                throw new RuntimeException();
            } else if (arg4 == null) {
                class14.method122(this.field2849, arg1 ^ 9080, this.field2858, 255, true, this, (byte) 0);
            } else {
                class27.field659.reset();
                class27.field659.update(arg4, 0, arg4.length);
                int var6 = (int) class27.field659.getValue();
                if (~this.field2849 != ~var6) {
                    class14.method122(this.field2849, -8984, this.field2858, 255, true, this, (byte) 0);
                } else {
                    this.method866(-1, arg4);
                    this.method929(100);
                }
            }
        } else {
            if (!arg2 && ~this.field2868 == ~arg0) {
                this.field2864 = true;
            }
            if (arg4 != null && arg4.length > 2) {
                class27.field659.reset();
                class27.field659.update(arg4, 0, arg4.length + -2);
                int var7 = (int) class27.field659.getValue();
                int var8 = (arg4[arg4.length + -2] << 8 & 65280) + (255 & arg4[arg4.length - 1]);
                if (~super.field2654[arg0] == ~var7 && super.field2655[arg0] == var8) {
                    this.field2855[arg0] = true;
                    if (arg2) {
                        super.field2689[arg0] = arg4;
                    }
                } else {
                    this.field2855[arg0] = false;
                    if (this.field2847 || arg2) {
                        class14.method122(super.field2654[arg0], -8984, arg0, this.field2858, arg2, this, (byte) 2);
                    }
                }
            } else {
                this.field2855[arg0] = false;
                if (this.field2847 || arg2) {
                    class14.method122(super.field2654[arg0], -8984, arg0, this.field2858, arg2, this, (byte) 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)V", line = 290)
    public final void method861(int arg0, byte arg1) {
        if (this.field2851 != null && this.field2855 != null && this.field2855[arg0]) {
            class50.method431(this.field2851, arg1 ^ -77, arg0, this);
        } else {
            class14.method122(super.field2654[arg0], -8984, arg0, this.field2858, true, this, (byte) 2);
        }
        ++field2852;
        if (arg1 != 97) {
            this.method861(123, (byte) -110);
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)I", line = 306)
    public final int method927(byte arg0) {
        if (arg0 != 2) {
            return -9;
        } else {
            int var2 = 0;
            ++field2846;
            int var3 = 0;
            for (int var4 = 0; ~super.field2689.length < ~var4; ++var4) {
                if (~super.field2653[var4] < -1) {
                    var3 += 100;
                    var2 += this.method922(var4, 100);
                }
            }
            if (var3 == 0) {
                return 100;
            } else {
                return var2 * 100 / var3;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(II)Z", line = 350)
    public static final boolean method928(int arg0, int arg1) {
        ++field2857;
        if (class34.field865[arg1]) {
            return true;
        } else if (!class6.field237.method872(0, arg1)) {
            return false;
        } else {
            int var2 = class6.field237.method869(22222, arg1);
            if (var2 == 0) {
                class34.field865[arg1] = true;
                return true;
            } else {
                if (class121.field3013[arg1] == null) {
                    class121.field3013[arg1] = new class105[var2];
                }
                for (int var3 = 0; ~var3 > ~var2; ++var3) {
                    if (class121.field3013[arg1][var3] == null) {
                        byte[] var5 = class6.field237.method857(30580, arg1, var3);
                        if (var5 != null) {
                            class121.field3013[arg1][var3] = new class105();
                            class121.field3013[arg1][var3].field2568 = (arg1 << 16) - -var3;
                            if (var5[0] == -1) {
                                class121.field3013[arg1][var3].method839((byte) 103, new class39(var5));
                            } else {
                                class121.field3013[arg1][var3].method838(new class39(var5), -10767);
                            }
                        }
                    }
                }
                class34.field865[arg1] = true;
                int var4 = -84 / ((-22 - arg0) / 62);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V", line = 428)
    private final void method929(int arg0) {
        this.field2855 = new boolean[super.field2689.length];
        ++field2874;
        int var2 = 0;
        if (arg0 != 100) {
            this.method923(85, (byte) -64);
        }
        while (~var2 > ~this.field2855.length) {
            this.field2855[var2] = false;
            ++var2;
        }
        if (this.field2851 == null) {
            this.field2864 = true;
        } else {
            this.field2868 = -1;
            for (int var3 = 0; this.field2855.length > var3; ++var3) {
                if (super.field2653[var3] > 0) {
                    class48.method422((byte) -56, this.field2851, var3, this);
                    this.field2868 = var3;
                }
            }
            if (~this.field2868 == 0) {
                this.field2864 = true;
            }
        }
    }
}
