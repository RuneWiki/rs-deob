import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class10 extends class117 {

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "[I")
    public static int[] field101 = new int[32];

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "Lca;")
    public static class139 field106;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "Ldk;")
    public static class251 field104;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "Ldk;")
    public static class251 field105;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "(I)V")
    public static void method48(int arg0) {
        field104 = null;
        field101 = null;
        field106 = null;
        int var1 = 107 % ((arg0 - -42) / 62);
        field105 = null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class10() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)V")
    public static final void method49(int arg0, int arg1) {
        class119.field1907 = arg0;
        class274.field4401 = 3;
        ++field102;
        class26.field331 = -1;
        class98.field1584 = 100;
        if (arg1 != -2048) {
            field101 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)[[I")
    public final int[][] method47(int arg0, int arg1) {
        int var3 = 23 % ((arg1 - 37) / 38);
        ++field99;
        int[][] var4 = super.field1886.method419(arg0, (byte) -78);
        if (super.field1886.field1022) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class168.field2737; ++var8) {
                this.method51(-2048, arg0, var8);
                int[][] var9 = this.method838(0, 0, class148.field2321);
                var5[var8] = var9[0][class228.field3683];
                var6[var8] = var9[1][class228.field3683];
                var7[var8] = var9[2][class228.field3683];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ldk;B)I")
    public static final int method50(class251 arg0, byte arg1) {
        ++field96;
        int var2 = 0;
        if (arg0.method1698((byte) 73, class307.field4916)) {
            ++var2;
        }
        if (arg0.method1698((byte) 59, class29.field351)) {
            ++var2;
        }
        if (arg1 != -9) {
            method48(-5);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(III)V")
    private final void method51(int arg0, int arg1, int arg2) {
        ++field100;
        int var4 = class243.field3869[arg2];
        int var5 = class173.field2835[arg1];
        float var6 = (float) Math.atan2((double) (arg0 + var4), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class228.field3683 = arg2;
            class148.field2321 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class148.field2321 = arg2;
            class228.field3683 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class228.field3683 = -arg1 + class168.field2737;
            class148.field2321 = arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class228.field3683 = arg2;
            class148.field2321 = -arg1 + class149.field2335;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class148.field2321 = class149.field2335 - arg1;
            class228.field3683 = -arg2 + class168.field2737;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class228.field3683 = -arg1 + class168.field2737;
            class148.field2321 = class149.field2335 - arg2;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class228.field3683 = arg1;
            class148.field2321 = -arg2 + class149.field2335;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class148.field2321 = arg1;
            class228.field3683 = class168.field2737 - arg2;
        }
        class148.field2321 &= class293.field4689;
        class228.field3683 &= class234.field3769;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        ++field97;
        int[] var3 = super.field1883.method531(arg1, (byte) 91);
        if (super.field1883.field1313) {
            for (int var4 = 0; var4 < class168.field2737; ++var4) {
                this.method51(-2048, arg1, var4);
                int[] var5 = this.method837(0, 0, class148.field2321);
                var3[var4] = var5[class228.field3683];
            }
        }
        return arg0 != 2 ? null : var3;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        if (arg1 != 255) {
            this.method47(-93, -40);
        }
        if (~arg2 == -1) {
            super.field1885 = ~arg0.method1133((byte) 53) == -2;
        }
        ++field98;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Laa;I)V")
    public static final void method52(class43 arg0, int arg1) {
        arg0.field621 = false;
        if (~arg0.field682 != 0) {
            class307 var2 = class22.method121(arg0.field682, true);
            if (var2 != null && var2.field4895 != null) {
                ++arg0.field679;
                if (arg0.field659 < var2.field4895.length && arg0.field679 > var2.field4891[arg0.field659]) {
                    ++arg0.field638;
                    ++arg0.field659;
                    arg0.field679 = 1;
                    class274.method1838(arg0.field710, class239.field3829 == arg0, var2, arg0.field659, (byte) -106, arg0.field637);
                }
                if (~arg0.field659 <= ~var2.field4895.length) {
                    arg0.field659 = 0;
                    arg0.field679 = 0;
                    class274.method1838(arg0.field710, class239.field3829 == arg0, var2, arg0.field659, (byte) -118, arg0.field637);
                }
                arg0.field638 = arg0.field659 + 1;
                if (arg0.field638 >= var2.field4895.length) {
                    arg0.field638 = 0;
                }
            } else {
                arg0.field682 = -1;
            }
        }
        if (arg1 == 22871) {
            if (arg0.field669 != -1 && arg0.field623 <= class29.field360) {
                class55 var3 = class137.method958(arg0.field669, (byte) -123);
                int var4 = var3.field908;
                if (var4 != -1) {
                    label296: {
                        class307 var5 = class22.method121(var4, true);
                        if (var3.field919) {
                            if (var5.field4902 != 3) {
                                if (~var5.field4902 == -2 && arg0.field636 > 0 && arg0.field657 <= class29.field360 && ~arg0.field639 > ~class29.field360) {
                                    arg0.field623 = class29.field360 + 1;
                                    break label296;
                                }
                            } else if (arg0.field636 > 0 && arg0.field657 <= class29.field360 && ~class29.field360 < ~arg0.field639) {
                                arg0.field669 = -1;
                                break label296;
                            }
                        }
                        if (var5 != null && var5.field4895 != null) {
                            if (arg0.field627 < 0) {
                                arg0.field627 = 0;
                                class274.method1838(arg0.field710, class239.field3829 == arg0, var5, 0, (byte) -112, arg0.field637);
                            }
                            ++arg0.field660;
                            if (arg0.field627 < var5.field4895.length && ~var5.field4891[arg0.field627] > ~arg0.field660) {
                                arg0.field660 = 1;
                                ++arg0.field627;
                                class274.method1838(arg0.field710, class239.field3829 == arg0, var5, arg0.field627, (byte) -126, arg0.field637);
                            }
                            if (~var5.field4895.length >= ~arg0.field627) {
                                if (var3.field919) {
                                    arg0.field627 -= var5.field4921;
                                    ++arg0.field630;
                                    if (var5.field4904 > arg0.field630) {
                                        if (~arg0.field627 <= -1 && ~arg0.field627 > ~var5.field4895.length) {
                                            class274.method1838(arg0.field710, class239.field3829 == arg0, var5, arg0.field627, (byte) -116, arg0.field637);
                                        } else {
                                            arg0.field669 = -1;
                                        }
                                    } else {
                                        arg0.field669 = -1;
                                    }
                                } else {
                                    arg0.field669 = -1;
                                }
                            }
                            arg0.field640 = arg0.field627 - -1;
                            if (arg0.field640 >= var5.field4895.length) {
                                if (!var3.field919) {
                                    arg0.field640 = -1;
                                } else {
                                    arg0.field640 -= var5.field4921;
                                    if (arg0.field630 + 1 >= var5.field4904) {
                                        arg0.field640 = -1;
                                    } else if (~arg0.field640 > -1 || ~arg0.field640 <= ~var5.field4895.length) {
                                        arg0.field640 = -1;
                                    }
                                }
                            }
                        } else {
                            arg0.field669 = -1;
                        }
                    }
                } else {
                    arg0.field669 = -1;
                }
            }
            if (arg0.field699 != -1 && ~arg0.field717 >= -2) {
                class307 var6 = class22.method121(arg0.field699, true);
                if (~var6.field4902 == -4) {
                    if (arg0.field636 > 0 && ~class29.field360 <= ~arg0.field657 && class29.field360 > arg0.field639) {
                        arg0.field699 = -1;
                    }
                } else if (var6.field4902 == 1 && ~arg0.field636 < -1 && ~arg0.field657 >= ~class29.field360 && arg0.field639 < class29.field360) {
                    arg0.field717 = 2;
                }
            }
            if (~arg0.field699 != 0 && ~arg0.field717 == -1) {
                class307 var7 = class22.method121(arg0.field699, true);
                if (var7 != null && var7.field4895 != null) {
                    ++arg0.field619;
                    if (~var7.field4895.length < ~arg0.field686 && ~arg0.field619 < ~var7.field4891[arg0.field686]) {
                        arg0.field619 = 1;
                        ++arg0.field686;
                        class274.method1838(arg0.field710, class239.field3829 == arg0, var7, arg0.field686, (byte) -110, arg0.field637);
                    }
                    if (arg0.field686 >= var7.field4895.length) {
                        ++arg0.field617;
                        arg0.field686 -= var7.field4921;
                        if (~arg0.field617 > ~var7.field4904) {
                            if (arg0.field686 >= 0 && arg0.field686 < var7.field4895.length) {
                                class274.method1838(arg0.field710, class239.field3829 == arg0, var7, arg0.field686, (byte) -110, arg0.field637);
                            } else {
                                arg0.field699 = -1;
                            }
                        } else {
                            arg0.field699 = -1;
                        }
                    }
                    arg0.field688 = arg0.field686 + 1;
                    if (~arg0.field688 <= ~var7.field4895.length) {
                        arg0.field688 -= var7.field4921;
                        if (~(arg0.field617 + 1) <= ~var7.field4904) {
                            arg0.field688 = -1;
                        } else if (~arg0.field688 > -1 || arg0.field688 >= var7.field4895.length) {
                            arg0.field688 = -1;
                        }
                    }
                    arg0.field621 = var7.field4910;
                } else {
                    arg0.field699 = -1;
                }
            }
            if (arg0.field717 > 0) {
                --arg0.field717;
            }
            for (int var8 = 0; ~arg0.field662.length < ~var8; ++var8) {
                class313 var9 = arg0.field662[var8];
                if (var9 != null) {
                    if (~var9.field4994 < -1) {
                        --var9.field4994;
                    } else {
                        class307 var10 = class22.method121(var9.field4993, true);
                        if (var10 != null && var10.field4895 != null) {
                            ++var9.field4984;
                            if (~var9.field4987 > ~var10.field4895.length && ~var9.field4984 < ~var10.field4891[var9.field4987]) {
                                ++var9.field4987;
                                var9.field4984 = 1;
                                class274.method1838(arg0.field710, class239.field3829 == arg0, var10, var9.field4987, (byte) -105, arg0.field637);
                            }
                            if (~var9.field4987 <= ~var10.field4895.length) {
                                var9.field4987 -= var10.field4921;
                                ++var9.field4988;
                                if (~var9.field4988 > ~var10.field4904) {
                                    if (var9.field4987 >= 0 && var9.field4987 < var10.field4895.length) {
                                        class274.method1838(arg0.field710, class239.field3829 == arg0, var10, var9.field4987, (byte) -122, arg0.field637);
                                    } else {
                                        arg0.field662[var8] = null;
                                    }
                                } else {
                                    arg0.field662[var8] = null;
                                }
                            }
                            var9.field4983 = var9.field4987 + 1;
                            if (var9.field4983 >= var10.field4895.length) {
                                var9.field4983 -= var10.field4921;
                                if (var9.field4988 + 1 >= var10.field4904) {
                                    var9.field4983 = -1;
                                } else if (~var9.field4983 > -1 || ~var9.field4983 <= ~var10.field4895.length) {
                                    var9.field4983 = -1;
                                }
                            }
                        } else {
                            arg0.field662[var8] = null;
                        }
                    }
                }
            }
            ++field103;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field101[var1] = var0 + -1;
            var0 += var0;
        }
    }
}
