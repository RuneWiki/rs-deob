import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class156 extends class82 {

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "I")
    private int field2696 = 81;

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "I")
    private int field2699 = 204;

    @OriginalMember(owner = "client!oe", name = "fb", descriptor = "I")
    private int field2710 = 8;

    @OriginalMember(owner = "client!oe", name = "kb", descriptor = "I")
    private int field2715 = 1024;

    @OriginalMember(owner = "client!oe", name = "cb", descriptor = "I")
    private int field2707 = 409;

    @OriginalMember(owner = "client!oe", name = "sb", descriptor = "I")
    private int field2723 = 4;

    @OriginalMember(owner = "client!oe", name = "tb", descriptor = "I")
    private int field2724 = 1024;

    @OriginalMember(owner = "client!oe", name = "pb", descriptor = "I")
    private int field2720 = 0;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "[I")
    public static int[] field2695 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!oe", name = "Z", descriptor = "[I")
    public static int[] field2704 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "Ldj;")
    private static class44 field2698 = class89.method650(255, "Bad session id)3");

    @OriginalMember(owner = "client!oe", name = "db", descriptor = "Ldj;")
    public static class44 field2708 = field2698;

    @OriginalMember(owner = "client!oe", name = "lb", descriptor = "[I")
    public static int[] field2716 = new int[25];

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "Ldj;")
    public static class44 field2697 = class89.method650(255, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!oe", name = "qb", descriptor = "Ldj;")
    public static class44 field2721 = class89.method650(255, "titlebutton");

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "Ldj;")
    public static class44 field2701 = class89.method650(255, ":clanreq:");

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "I")
    private int field2700;

    @OriginalMember(owner = "client!oe", name = "ab", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!oe", name = "eb", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!oe", name = "gb", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!oe", name = "hb", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!oe", name = "ib", descriptor = "I")
    private int field2713;

    @OriginalMember(owner = "client!oe", name = "jb", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!oe", name = "nb", descriptor = "I")
    private int field2718;

    @OriginalMember(owner = "client!oe", name = "ob", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!oe", name = "rb", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!oe", name = "X", descriptor = "[I")
    private int[] field2702;

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "[[I")
    private int[][] field2703;

    @OriginalMember(owner = "client!oe", name = "mb", descriptor = "[[I")
    private int[][] field2717;

    @OriginalMember(owner = "client!oe", name = "bb", descriptor = "[[[B")
    public static byte[][][] field2706;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILve;)Z")
    public static final boolean method1026(int arg0, int arg1, class225 arg2) {
        ++field2712;
        byte[] var3 = arg2.method1460(arg0 + -128, arg1);
        if (var3 == null) {
            return false;
        } else {
            class172.method1093((byte) 123, var3);
            if (arg0 != 255) {
                field2697 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field2719;
        int[] var3 = super.field1595.method603(true, arg1);
        if (super.field1595.field1538) {
            int var4;
            for (var4 = class212.field3809[arg1] + this.field2720; ~var4 > -1; var4 += 4096) {
            }
            while (var4 > 4096) {
                var4 -= 4096;
            }
            int var5;
            for (var5 = 0; this.field2710 > var5 && ~var4 <= ~this.field2702[var5]; ++var5) {
            }
            int var6 = var5 + -1;
            boolean var7 = ~(1 & var5) == -1;
            int var8 = this.field2702[var5];
            int var9 = this.field2702[var5 + -1];
            if (var4 > this.field2713 + var9 && var4 < var8 - this.field2713) {
                for (int var10 = 0; ~var10 > ~class129.field2287; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field2715 : this.field2715;
                    int var13;
                    for (var13 = class49.field912[var10] - -(this.field2718 * var12 >> 12); ~var13 > -1; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field2723 && var13 >= this.field2717[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 - 1;
                    int var15 = this.field2717[var6][var11];
                    int var16 = this.field2717[var6][var14];
                    if (this.field2713 + var16 < var13 && ~var13 > ~(var15 - this.field2713)) {
                        var3[var10] = this.field2703[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class18.method147(var3, 0, class129.field2287, 0);
            }
        }
        return arg0 != 25238 ? null : var3;
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)V")
    public static void method1027(int arg0) {
        field2721 = null;
        field2716 = null;
        field2695 = null;
        field2708 = null;
        field2698 = null;
        field2706 = null;
        if (arg0 >= -102) {
            method1027(27);
        }
        field2701 = null;
        field2704 = null;
        field2697 = null;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        ++field2694;
        if (arg0 <= 95) {
            method1026(-41, 81, (class225) null);
        }
        this.method1028(1);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (arg1 == 7) {
                                        this.field2724 = arg0.method500(71);
                                    }
                                } else {
                                    this.field2696 = arg0.method500(103);
                                }
                            } else {
                                this.field2720 = arg0.method500(108);
                            }
                        } else {
                            this.field2715 = arg0.method500(arg2 + 6);
                        }
                    } else {
                        this.field2699 = arg0.method500(110);
                    }
                } else {
                    this.field2707 = arg0.method500(arg2 ^ 42);
                }
            } else {
                this.field2710 = arg0.method506(arg2 + 187);
            }
        } else {
            this.field2723 = arg0.method506(arg2 ^ 187);
        }
        ++field2709;
        if (arg2 != 68) {
            this.field2702 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "(I)V")
    private final void method1028(int arg0) {
        ++field2711;
        Random var2 = new Random((long) this.field2710);
        this.field2700 = 4096 / this.field2710;
        int var3 = this.field2700 / 2;
        this.field2702 = new int[this.field2710 + arg0];
        this.field2703 = new int[this.field2710][this.field2723];
        this.field2717 = new int[this.field2710][this.field2723 - -1];
        this.field2718 = 4096 / this.field2723;
        this.field2713 = this.field2696 / 2;
        this.field2702[0] = 0;
        int var4 = this.field2718 / 2;
        for (int var5 = 0; var5 < this.field2710; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field2700;
                int var7 = (-2048 + class151.method979(arg0 + -2, 4096, var2)) * this.field2699 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field2702[var5] = this.field2702[var5 + -1] + var8;
            }
            this.field2717[var5][0] = 0;
            for (int var9 = 0; ~this.field2723 < ~var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field2718;
                    int var11 = (-2048 + class151.method979(-1, 4096, var2)) * this.field2707 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field2717[var5][var9] = this.field2717[var5][var9 + -1] - -var12;
                }
                this.field2703[var5][var9] = this.field2724 > 0 ? 4096 - class151.method979(-1, this.field2724, var2) : 4096;
            }
            this.field2717[var5][this.field2723] = 4096;
        }
        this.field2702[this.field2710] = 4096;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lnf;II)V")
    public static final void method1029(class147 arg0, int arg1, int arg2) {
        if (arg2 != 4679) {
            method1029((class147) null, 40, -36);
        }
        ++field2714;
        if (class120.field2137 != null) {
            class120.field2137.field1195 = arg1 * 8 + 5;
            int var3 = class120.field2137.method528(true);
            int var4 = class120.field2137.method528(true);
            arg0.method965(var4, false, var3);
        } else {
            class27.method191((class147) null, (byte) 0, 255, (byte) 24, 0, true, 255);
            class94.field1759[arg1] = arg0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class156() {
        super(0, true);
    }
}
