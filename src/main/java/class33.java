import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class33 extends class43 {

    @OriginalMember(owner = "client!cj", name = "eb", descriptor = "I")
    private int field514 = 0;

    @OriginalMember(owner = "client!cj", name = "mb", descriptor = "I")
    private int field522 = 0;

    @OriginalMember(owner = "client!cj", name = "qb", descriptor = "I")
    private int field526 = 1;

    @OriginalMember(owner = "client!cj", name = "bb", descriptor = "Lmb;")
    private static class132 field511 = class166.method1092("Location", 118);

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "Lmb;")
    private static class132 field509 = class166.method1092("You have only just left another world)3", 116);

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "J")
    public static long field503 = 0L;

    @OriginalMember(owner = "client!cj", name = "ab", descriptor = "Lmb;")
    private static class132 field510 = class166.method1092("Loaded sprites", 116);

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "Lmb;")
    public static class132 field506 = field509;

    @OriginalMember(owner = "client!cj", name = "jb", descriptor = "Lmb;")
    private static class132 field519 = class166.method1092("Started 3d library", 111);

    @OriginalMember(owner = "client!cj", name = "db", descriptor = "Lmb;")
    public static class132 field513 = class166.method1092("<br>", 125);

    @OriginalMember(owner = "client!cj", name = "ib", descriptor = "Lmb;")
    public static class132 field518 = field511;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "Lmb;")
    public static class132 field504 = field510;

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "Lmb;")
    private static class132 field508 = class166.method1092("Loaded fonts", 111);

    @OriginalMember(owner = "client!cj", name = "hb", descriptor = "Lmb;")
    public static class132 field517 = field508;

    @OriginalMember(owner = "client!cj", name = "tb", descriptor = "Lmb;")
    public static class132 field529 = field519;

    @OriginalMember(owner = "client!cj", name = "rb", descriptor = "[I")
    public static int[] field527 = new int[2048];

    @OriginalMember(owner = "client!cj", name = "ub", descriptor = "[I")
    public static int[] field530 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!cj", name = "pb", descriptor = "Lmb;")
    public static class132 field525 = class166.method1092("Mem:", 112);

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!cj", name = "cb", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!cj", name = "fb", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!cj", name = "gb", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!cj", name = "kb", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!cj", name = "nb", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!cj", name = "ob", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!cj", name = "lb", descriptor = "Lpb;")
    public static class165 field521;

    @OriginalMember(owner = "client!cj", name = "sb", descriptor = "Lsh;")
    public static class202 field528;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILkd;)Lw;")
    public static final class234 method230(int arg0, class112 arg1) {
        if (arg0 != 21101) {
            return null;
        } else {
            ++field523;
            return new class234(arg1.method750(arg0 ^ 44397), arg1.method750(65280), arg1.method750(65280), arg1.method750(arg0 ^ 44397), arg1.method750(65280), arg1.method750(arg0 + 44179), arg1.method750(65280), arg1.method750(65280), arg1.method718(false), arg1.method716(arg0 + -22409));
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(Z)V")
    public static void method231(boolean arg0) {
        field504 = null;
        field530 = null;
        field521 = null;
        field517 = null;
        field527 = null;
        field518 = null;
        field519 = null;
        field509 = null;
        field528 = null;
        field529 = null;
        field510 = null;
        field513 = null;
        field506 = null;
        field508 = null;
        if (!arg0) {
            field525 = null;
            field511 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIILra;)V")
    public static final void method232(int arg0, int arg1, int arg2, int arg3, class185 arg4) {
        ++field507;
        if (arg0 <= -38) {
            if (~class57.field974 > -401) {
                if (arg4.field3394 != null) {
                    arg4 = arg4.method1188(100);
                }
                if (arg4 != null) {
                    if (arg4.field3414) {
                        class132 var5 = arg4.field3420;
                        if (~arg4.field3404 != -1) {
                            var5 = class187.method1197(new class132[] { var5, class136.method927((byte) 125, arg4.field3404, class210.field3854.field2894), class21.field304, class10.field120, class132.method889(arg4.field3404, (byte) 110), class92.field1628 }, -83);
                        }
                        if (~class106.field1984 == -2) {
                            ++class89.field1560;
                            class108.method693(class187.method1197(new class132[] { class170.field3177, class161.field2924, var5 }, -90), class187.field3465, -501, (long) arg3, (short) 41, arg1, arg2);
                        } else if (!class10.field116) {
                            ++class215.field3929;
                            class132[] var6 = arg4.field3392;
                            if (class202.field3716) {
                                var6 = class19.method126(12, var6);
                            }
                            if (var6 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (var6[var7] != null && (class71.field1198 != 0 || !var6[var7].method882(24493, class93.field1641))) {
                                        ++class75.field1255;
                                        byte var8 = 0;
                                        if (var7 == 0) {
                                            var8 = 26;
                                        }
                                        if (~var7 == -2) {
                                            var8 = 20;
                                        }
                                        if (var7 == 2) {
                                            var8 = 40;
                                        }
                                        if (var7 == 3) {
                                            var8 = 18;
                                        }
                                        if (~var7 == -5) {
                                            var8 = 24;
                                        }
                                        class108.method693(class187.method1197(new class132[] { class131.field2428, var5 }, -103), var6[var7], -501, (long) arg3, var8, arg1, arg2);
                                    }
                                }
                            }
                            if (class71.field1198 == 0 && var6 != null) {
                                for (int var9 = 4; var9 >= 0; --var9) {
                                    if (var6[var9] != null && var6[var9].method882(24493, class93.field1641)) {
                                        short var10 = 0;
                                        if (class210.field3854.field2894 < arg4.field3404) {
                                            var10 = 2000;
                                        }
                                        ++class100.field1882;
                                        short var11 = 0;
                                        if (var9 == 0) {
                                            var11 = 26;
                                        }
                                        if (~var9 == -2) {
                                            var11 = 20;
                                        }
                                        if (~var9 == -3) {
                                            var11 = 40;
                                        }
                                        if (~var9 == -4) {
                                            var11 = 18;
                                        }
                                        if (~var9 == -5) {
                                            var11 = 24;
                                        }
                                        if (~var11 != -1) {
                                            var11 += var10;
                                        }
                                        class108.method693(class187.method1197(new class132[] { class131.field2428, var5 }, -127), var6[var9], -501, (long) arg3, var11, arg1, arg2);
                                    }
                                }
                            }
                            class108.method693(class187.method1197(new class132[] { class131.field2428, var5 }, -106), class84.field1472, -501, (long) arg3, (short) 1002, arg1, arg2);
                        } else if ((2 & class38.field621) == 2) {
                            class108.method693(class187.method1197(new class132[] { class160.field2914, class161.field2924, var5 }, -84), class138.field2589, -501, (long) arg3, (short) 7, arg1, arg2);
                            ++class168.field3072;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(B)V")
    public static final void method233(byte arg0) {
        ++field515;
        if (class14.field178) {
            class205.field3755 = null;
            class157.field2857 = null;
            class150.field2745 = null;
            class30.field470 = null;
            class71.field1179 = null;
            class6.field58 = null;
            class108.field2050 = null;
            class189.field3493 = null;
            class181.field3332 = null;
            class93.field1633 = null;
            class59.field994 = null;
            class65.field1071 = null;
            class174.field3253 = null;
            class62.field1038 = null;
            class63.field1047 = null;
            class47.field810 = null;
            class9.field93 = null;
            class110.field2070 = null;
            class112.field2124 = null;
            class218.field3990 = null;
            class39.field639 = null;
            class86.field1500 = null;
            class164.method1062(2, -1);
            class164.method1060(true, 853933806);
            if (arg0 != 27) {
                field528 = null;
            }
            class14.field178 = false;
        }
    }

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "(I)V")
    public final void method234(int arg0) {
        if (arg0 <= 21) {
            field530 = null;
        }
        ++field516;
        class191.method1222(false);
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field512;
        int[] var3 = super.field768.method1123(arg1, arg0);
        if (super.field768.field3219) {
            int var4 = class2.field35[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; class131.field2427 > var6; ++var6) {
                int var7 = class156.field2849[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (this.field522 != 0) {
                    int var9 = var8 * var8 - -(var5 * var5) >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field526 * var10) * 3.141592653589793D);
                } else {
                    var11 = (var7 - var4) * this.field526;
                }
                int var12 = var11 - (-4096 & var11);
                if (this.field514 == 0) {
                    var12 = class174.field3239[var12 >> 4 & 255] + 4096 >> 1;
                } else if (~this.field514 == -3) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        if (arg1 == -73) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 == 3) {
                        this.field526 = arg2.method716(-1308);
                    }
                } else {
                    this.field514 = arg2.method716(-1308);
                }
            } else {
                this.field522 = arg2.method716(-1308);
            }
            ++field505;
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
    public class33() {
        super(0, true);
    }
}
