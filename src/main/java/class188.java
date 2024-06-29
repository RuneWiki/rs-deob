import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class188 extends class117 {

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    private int field3438 = 0;

    @OriginalMember(owner = "client!cj", name = "ab", descriptor = "I")
    private int field3447 = 4096;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "Lhh;")
    private static class163 field3439 = class137.method1065("Loading)3)3)3", 17);

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "Lhh;")
    public static class163 field3446 = field3439;

    @OriginalMember(owner = "client!cj", name = "fb", descriptor = "Lhh;")
    public static class163 field3452 = class137.method1065("null", 17);

    @OriginalMember(owner = "client!cj", name = "eb", descriptor = "Lhh;")
    public static class163 field3451 = class137.method1065("; Max)2Age=", 17);

    @OriginalMember(owner = "client!cj", name = "bb", descriptor = "Lhh;")
    private static class163 field3448 = class137.method1065("green:", 17);

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "Lhh;")
    public static class163 field3442 = field3448;

    @OriginalMember(owner = "client!cj", name = "cb", descriptor = "I")
    public static int field3449 = -1;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "Lhh;")
    public static class163 field3440 = field3448;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!cj", name = "db", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!cj", name = "gb", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "Lqf;")
    public static class104 field3445;

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "Led;")
    public static class255 field3443;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(B)V")
    public static final void method1388(byte arg0) {
        int var1 = -99 / ((89 - arg0) / 32);
        class192.field3512.method111((byte) -52);
        ++field3453;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLsh;)V")
    public static final void method1389(byte arg0, class202 arg1) {
        ++field3441;
        arg1.field3664 = arg1.field3670;
        if (arg1.field3653 == 0) {
            arg1.field3640 = 0;
        } else {
            if (~arg1.field3673 != 0 && ~arg1.field3622 == -1) {
                class18 var2 = class212.method1511(arg1.field3673, -1);
                if (arg1.field3617 > 0 && ~var2.field276 == -1) {
                    ++arg1.field3640;
                    return;
                }
                if (~arg1.field3617 >= -1 && var2.field263 == 0) {
                    ++arg1.field3640;
                    return;
                }
            }
            int var3 = arg1.field3615;
            int var4 = arg1.field3633;
            int var5 = arg1.field3614[arg1.field3653 + -1] * 128 + arg1.field3645 * 64;
            int var6 = arg1.field3629[arg1.field3653 + -1] * 128 + arg1.field3645 * 64;
            if (~(-var4 + var5) >= -257 && var5 - var4 >= -256 && ~(-var3 + var6) >= -257 && ~(-var3 + var6) <= 255) {
                if (var4 >= var5) {
                    if (~var5 > ~var4) {
                        if (~var6 < ~var3) {
                            arg1.field3654 = 768;
                        } else if (var3 <= var6) {
                            arg1.field3654 = 512;
                        } else {
                            arg1.field3654 = 256;
                        }
                    } else if (~var3 > ~var6) {
                        arg1.field3654 = 1024;
                    } else if (~var3 < ~var6) {
                        arg1.field3654 = 0;
                    }
                } else if (var6 > var3) {
                    arg1.field3654 = 1280;
                } else if (~var6 <= ~var3) {
                    arg1.field3654 = 1536;
                } else {
                    arg1.field3654 = 1792;
                }
                int var7 = 2047 & -arg1.field3667 + arg1.field3654;
                int var8 = arg1.field3651;
                int var9 = -92 % ((39 - arg0) / 32);
                boolean var10 = true;
                int var11 = 4;
                if (~var7 < -1025) {
                    var7 -= 2048;
                }
                if (~var7 <= 255 && var7 <= 256) {
                    var8 = arg1.field3652;
                } else if (var7 >= 256 && var7 < 768) {
                    var8 = arg1.field3663;
                } else if (var7 >= -768 && ~var7 >= 255) {
                    var8 = arg1.field3656;
                }
                if (~var8 == 0) {
                    var8 = arg1.field3652;
                }
                arg1.field3664 = var8;
                if (arg1 instanceof class2) {
                    var10 = ((class2) arg1).field41.field3336;
                }
                if (!var10) {
                    if (arg1.field3653 > 1) {
                        var11 = 6;
                    }
                    if (~arg1.field3653 < -3) {
                        var11 = 8;
                    }
                    if (arg1.field3640 > 0 && arg1.field3653 > 1) {
                        --arg1.field3640;
                        var11 = 8;
                    }
                } else {
                    if (arg1.field3667 != arg1.field3654 && arg1.field3618 == -1 && arg1.field3648 != 0) {
                        var11 = 2;
                    }
                    if (~arg1.field3653 < -3) {
                        var11 = 6;
                    }
                    if (~arg1.field3653 < -4) {
                        var11 = 8;
                    }
                    if (arg1.field3640 > 0 && arg1.field3653 > 1) {
                        --arg1.field3640;
                        var11 = 8;
                    }
                }
                if (arg1.field3616[arg1.field3653 + -1]) {
                    var11 <<= 1;
                }
                if (~var3 > ~var6) {
                    arg1.field3615 += var11;
                    if (var6 < arg1.field3615) {
                        arg1.field3615 = var6;
                    }
                } else if (~var6 > ~var3) {
                    arg1.field3615 -= var11;
                    if (~var6 < ~arg1.field3615) {
                        arg1.field3615 = var6;
                    }
                }
                if (var4 < var5) {
                    arg1.field3633 += var11;
                    if (arg1.field3633 > var5) {
                        arg1.field3633 = var5;
                    }
                } else if (var4 > var5) {
                    arg1.field3633 -= var11;
                    if (~arg1.field3633 > ~var5) {
                        arg1.field3633 = var5;
                    }
                }
                if (arg1.field3633 == var5 && arg1.field3615 == var6) {
                    --arg1.field3653;
                    if (~arg1.field3617 < -1) {
                        --arg1.field3617;
                    }
                }
                if (var11 >= 8 && ~arg1.field3664 == ~arg1.field3652 && ~arg1.field3638 != 0) {
                    arg1.field3664 = arg1.field3638;
                }
            } else {
                arg1.field3633 = var5;
                arg1.field3615 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
    public class188() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "(I)V")
    public static void method1390(int arg0) {
        field3448 = null;
        field3446 = null;
        field3452 = null;
        field3443 = null;
        field3445 = null;
        field3440 = null;
        field3451 = null;
        field3439 = null;
        if (arg0 < 63) {
            field3449 = -100;
        }
        field3442 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field3447 = arg2.method658(arg0 ^ 82);
            }
        } else {
            this.field3438 = arg2.method658(arg0 + -105);
        }
        if (arg0 != 0) {
            field3448 = null;
        }
        ++field3450;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        int[] var3 = super.field2218.method1044(arg1, 0);
        ++field3444;
        if (super.field2218.field2587) {
            int[] var4 = this.method932(arg1, false, 0);
            for (int var5 = 0; var5 < class143.field2702; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field3438 && var6 <= this.field3447 ? 4096 : 0;
            }
        }
        if (arg0 != -21393) {
            this.method60(-58, -27, (class81) null);
        }
        return var3;
    }
}
