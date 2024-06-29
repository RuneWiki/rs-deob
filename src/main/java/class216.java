import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class216 extends class135 {

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "Lqj;")
    private static class196 field3882 = class80.method502("OFF", -48);

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "J")
    public static long field3888 = 0L;

    @OriginalMember(owner = "client!ie", name = "gb", descriptor = "[I")
    public static int[] field3893 = new int[256];

    @OriginalMember(owner = "client!ie", name = "eb", descriptor = "Lqj;")
    public static class196 field3891 = field3882;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!ie", name = "fb", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!ie", name = "db", descriptor = "Lkc;")
    public static class222 field3890;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(II)Lak;")
    public static final class100 method1480(int arg0, int arg1) {
        ++field3887;
        class100 var2 = (class100) class215.field3853.method575(0, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class149.field2385.method842(arg1, (byte) 53, 0);
            if (var3 == null) {
                return null;
            } else {
                class100 var4 = new class100();
                class56 var5 = new class56(var3);
                var5.field699 = var5.field693.length + -2;
                int var6 = var5.method318(true);
                int var7 = var5.field693.length - 2 + -var6 + -12;
                var5.field699 = var7;
                int var8 = var5.method311(0);
                var4.field1440 = var5.method318(true);
                var4.field1438 = var5.method318(true);
                var4.field1435 = var5.method318(true);
                var4.field1433 = var5.method318(true);
                int var9 = var5.method367(1);
                if (var9 > 0) {
                    var4.field1437 = new class231[var9];
                    for (int var10 = 0; ~var10 > ~var9; ++var10) {
                        int var11 = var5.method318(true);
                        class231 var12 = new class231(class251.method1697(var11, true));
                        var4.field1437[var10] = var12;
                        while (var11-- > 0) {
                            int var13 = var5.method311(0);
                            int var14 = var5.method311(0);
                            var12.method1552(new class206(var14), (long) var13, 0);
                        }
                    }
                }
                var5.field699 = arg0;
                var4.field1442 = var5.method340(-1633689400);
                var4.field1432 = new int[var8];
                int var15 = 0;
                var4.field1430 = new int[var8];
                var4.field1429 = new class196[var8];
                while (~var7 < ~var5.field699) {
                    int var16 = var5.method318(true);
                    if (~var16 != -4) {
                        if (~var16 > -101 && ~var16 != -22 && var16 != 38 && ~var16 != -40) {
                            var4.field1430[var15] = var5.method311(0);
                        } else {
                            var4.field1430[var15] = var5.method367(1);
                        }
                    } else {
                        var4.field1429[var15] = var5.method326(true);
                    }
                    var4.field1432[var15++] = var16;
                }
                class215.field3853.method574((long) arg1, false, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class216() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILl;IILec;ZLl;I)V")
    public static final void method1481(int arg0, class190 arg1, int arg2, int arg3, class178 arg4, boolean arg5, class190 arg6, int arg7) {
        class169.field2851 = arg2;
        class198.field3507 = arg0;
        class65.field919 = arg4;
        class53.field669 = arg3;
        ++field3892;
        class130.field1843 = arg7;
        if (class171.field2876 == null) {
            class211.field3799 = arg5;
            if (class70.field997 == null) {
                class70.field997 = class91.method560(0, class196.field3439, class179.field3167, 3);
            }
            if (class77.field1109 == null) {
                class77.field1109 = class3.method11(class85.field1251, class196.field3439, 0, -25635);
            }
            if (class52.field652 == null) {
                class52.field652 = class3.method11(class215.field3877, class196.field3439, 0, -25635);
            }
            if (class43.field501 == null) {
                class43.field501 = class3.method11(class151.field2445, class196.field3439, 0, -25635);
            }
            int var8 = class130.field1843 / 5;
            int var9 = class130.field1843 / 5 * 4;
            class55.method299(class53.field669, class169.field2851, class130.field1843, class198.field3507, 0, 168);
            class55.method304(class53.field669, class169.field2851, var8, 23, 12425273, 9135624);
            class55.method304(class53.field669 + var8, class169.field2851, var9, 23, 5197647, 2697513);
            arg1.method1249(class166.field2739, var8 / 2 + class53.field669, class169.field2851 + 15, 0, -1);
            if (class43.field501 != null) {
                class43.field501[1].method442(class53.field669 - -2 + var8, class169.field2851 + 1);
                arg6.method1241(class96.field1407, class53.field669 + var8 - -12, class169.field2851 + 10, 16777215, -1);
                class43.field501[0].method442(class53.field669 + var8 - -2, class169.field2851 + 12);
                arg6.method1241(class225.field4036, class53.field669 + 12 - -var8, class169.field2851 + 21, 16777215, -1);
            }
            if (class52.field652 != null) {
                int var10 = var8 + 140 + class53.field669;
                if (class42.field487[0] == 0 && class71.field1001[0] == 0) {
                    class52.field652[2].method442(var10, class169.field2851 - -4);
                } else {
                    class52.field652[0].method442(var10, class169.field2851 - -4);
                }
                if (class42.field487[0] == 0 && ~class71.field1001[0] == -2) {
                    class52.field652[3].method442(var10 + 15, class169.field2851 + 4);
                } else {
                    class52.field652[1].method442(var10 - -15, class169.field2851 + 4);
                }
                arg1.method1241(class171.field2889, var10 + 32, class169.field2851 - -17, 16777215, -1);
                int var11 = class53.field669 + var8 - -250;
                if (~class42.field487[0] == -2 && class71.field1001[0] == 0) {
                    class52.field652[2].method442(var11, class169.field2851 - -4);
                } else {
                    class52.field652[0].method442(var11, class169.field2851 - -4);
                }
                if (~class42.field487[0] == -2 && class71.field1001[0] == 1) {
                    class52.field652[3].method442(var11 + 15, class169.field2851 - -4);
                } else {
                    class52.field652[1].method442(var11 - -15, class169.field2851 + 4);
                }
                arg1.method1241(class31.field398, var11 + 32, class169.field2851 + 17, 16777215, -1);
                int var12 = class53.field669 + var8 + 360;
                if (~class42.field487[0] == -3 && class71.field1001[0] == 0) {
                    class52.field652[2].method442(var12, class169.field2851 + 4);
                } else {
                    class52.field652[0].method442(var12, class169.field2851 + 4);
                }
                if (class42.field487[0] == 2 && class71.field1001[0] == 1) {
                    class52.field652[3].method442(var12 - -15, class169.field2851 + 4);
                } else {
                    class52.field652[1].method442(var12 + 15, class169.field2851 + 4);
                }
                arg1.method1241(class70.field978, var12 + 32, class169.field2851 + 17, 16777215, -1);
                int var13 = class53.field669 + 470 - -var8;
                if (class42.field487[0] == 3 && class71.field1001[0] == 0) {
                    class52.field652[2].method442(var13, class169.field2851 + 4);
                } else {
                    class52.field652[0].method442(var13, class169.field2851 + 4);
                }
                if (~class42.field487[0] == -4 && class71.field1001[0] == 1) {
                    class52.field652[3].method442(var13 + 15, class169.field2851 + 4);
                } else {
                    class52.field652[1].method442(var13 - -15, class169.field2851 + 4);
                }
                arg1.method1241(class12.field136, var13 + 32, class169.field2851 + 17, 16777215, -1);
            }
            class55.method295(class130.field1843 - 58 + -10, class169.field2851 - -4, 58, 16, 0);
            class183.field3218 = -1;
            if (class70.field997 != null) {
                byte var14 = 88;
                byte var15 = 19;
                int var16 = class130.field1843 / (var14 + 1);
                int var17 = (class198.field3507 + -23) / (var15 + 1);
                int var18;
                int var19;
                do {
                    var18 = var17;
                    var19 = var16;
                    if (~((var16 + -1) * var17) <= ~class193.field3405) {
                        --var16;
                    }
                    if (~((var17 + -1) * var16) <= ~class193.field3405) {
                        --var17;
                    }
                    if (~((var17 - 1) * var16) <= ~class193.field3405) {
                        --var17;
                    }
                } while (var17 != var18 || var16 != var19);
                int var20 = (class130.field1843 - var14 * var16) / (var16 + 1);
                int var21 = (-(var15 * var17) + class198.field3507 + -23) / (var17 + 1);
                if (var21 > 5) {
                    var21 = 5;
                }
                if (~var20 < -6) {
                    var20 = 5;
                }
                int var22 = (-(var14 * var16) + class130.field1843 + -((var16 + -1) * var20)) / 2;
                int var23 = (class198.field3507 - 23 + -((var17 + -1) * var21) + -(var15 * var17)) / 2;
                int var24 = var23 + 23;
                int var25 = 0;
                int var26 = var22;
                for (int var27 = 0; var27 < class193.field3405; ++var27) {
                    class146 var28 = class64.field881[var27];
                    boolean var29 = true;
                    class196 var30 = class163.method1029(var28.field2313, false);
                    if (~var28.field2313 == 0) {
                        var29 = false;
                        var30 = field3891;
                    } else if (~var28.field2313 < -1981) {
                        var30 = class65.field899;
                        var29 = false;
                    }
                    if (~var26 >= ~class52.field646 && var24 <= class63.field869 && var14 + var26 > class52.field646 && ~class63.field869 > ~(var15 + var24) && var29) {
                        class183.field3218 = var27;
                        class70.field997[var28.field2299 ? 1 : 0].method223(class53.field669 + var26, class169.field2851 + var24, 128, 16777215);
                    } else {
                        class70.field997[!var28.field2299 ? 0 : 1].method221(class53.field669 - -var26, class169.field2851 - -var24);
                    }
                    if (class77.field1109 != null) {
                        class77.field1109[(var28.field2299 ? 8 : 0) + var28.field2307].method442(class53.field669 + 29 + var26, class169.field2851 - -var24);
                    }
                    arg1.method1249(class163.method1029(var28.field2312, false), var26 + 15 + class53.field669, var15 / 2 + class169.field2851 + var24 - -5, 0, -1);
                    arg6.method1249(var30, class53.field669 + var26 + 60, class169.field2851 - (-(var15 / 2) + -5) + var24, 268435455, -1);
                    var24 += var15 + var21;
                    ++var25;
                    if (var17 <= var25) {
                        var24 = var23 + 23;
                        var25 = 0;
                        var26 += var14 + var20;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)[[I")
    public final int[][] method164(int arg0, int arg1) {
        if (arg0 != 260028743) {
            field3891 = null;
        }
        ++field3886;
        int[][] var3 = super.field1947.method511(arg1, -1);
        if (super.field1947.field1180) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class131.field1862 > var7; ++var7) {
                this.method1483(false, var7, arg1);
                int[][] var8 = this.method818(2, class113.field1656, 0);
                var4[var7] = var8[0][class231.field4107];
                var5[var7] = var8[1][class231.field4107];
                var6[var7] = var8[2][class231.field4107];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)V")
    public static void method1482(boolean arg0) {
        field3890 = null;
        field3891 = null;
        field3882 = null;
        if (!arg0) {
            field3891 = null;
        }
        field3893 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZII)V")
    private final void method1483(boolean arg0, int arg1, int arg2) {
        ++field3889;
        int var4 = class82.field1189[arg1];
        if (arg0) {
            method1482(true);
        }
        int var5 = class123.field1756[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class113.field1656 = arg2;
            class231.field4107 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class113.field1656 = arg1;
            class231.field4107 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class113.field1656 = arg1;
            class231.field4107 = -arg2 + class131.field1862;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class231.field4107 = arg1;
            class113.field1656 = class150.field2400 - arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class113.field1656 = -arg2 + class150.field2400;
            class231.field4107 = -arg1 + class131.field1862;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class113.field1656 = -arg1 + class150.field2400;
            class231.field4107 = -arg2 + class131.field1862;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class231.field4107 = arg2;
            class113.field1656 = class150.field2400 - arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class231.field4107 = -arg1 + class131.field1862;
            class113.field1656 = arg2;
        }
        class231.field4107 &= class61.field816;
        class113.field1656 &= class53.field667;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        ++field3883;
        if (~arg1 == -1) {
            super.field1962 = arg0.method367(1) == 1;
        }
        if (arg2 != -16231) {
            field3884 = -88;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field3885;
            int[] var3 = super.field1954.method110(arg0, 85);
            if (super.field1954.field244) {
                for (int var4 = 0; class131.field1862 > var4; ++var4) {
                    this.method1483(false, var4, arg0);
                    int[] var5 = this.method819(-88, 0, class113.field1656);
                    var3[var4] = var5[class231.field4107];
                }
            }
            return var3;
        }
    }
}
