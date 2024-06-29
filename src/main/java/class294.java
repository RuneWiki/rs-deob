import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class294 extends class236 {

    @OriginalMember(owner = "client!hd", name = "mb", descriptor = "I")
    public static int field4656 = 99;

    @OriginalMember(owner = "client!hd", name = "nb", descriptor = "Lpd;")
    public static class96 field4657 = new class96(new byte[5000]);

    @OriginalMember(owner = "client!hd", name = "xb", descriptor = "Z")
    public static boolean field4667 = false;

    @OriginalMember(owner = "client!hd", name = "tb", descriptor = "Lte;")
    public static class244 field4663 = new class244(4);

    @OriginalMember(owner = "client!hd", name = "yb", descriptor = "Ljava/lang/String;")
    public static String field4668 = "Unable to find ";

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!hd", name = "kb", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!hd", name = "lb", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!hd", name = "pb", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!hd", name = "qb", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!hd", name = "rb", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!hd", name = "ub", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!hd", name = "wb", descriptor = "Leh;")
    public static class137 field4666;

    @OriginalMember(owner = "client!hd", name = "sb", descriptor = "Lsi;")
    public static class219 field4662;

    @OriginalMember(owner = "client!hd", name = "ob", descriptor = "[I")
    public static int[] field4658;

    @OriginalMember(owner = "client!hd", name = "vb", descriptor = "[I")
    public static int[] field4665;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lwb;I)Z")
    public static final boolean method1971(class123 arg0, int arg1) {
        if (arg1 != 4) {
            field4667 = false;
        }
        ++field4655;
        if (arg0.field1816 == null) {
            return false;
        } else {
            for (int var2 = 0; ~arg0.field1816.length < ~var2; ++var2) {
                int var3 = class79.method444(arg0, (byte) -4, var2);
                int var4 = arg0.field1768[var2];
                if (arg0.field1816[var2] == 2) {
                    if (var4 <= var3) {
                        return false;
                    }
                } else if (arg0.field1816[var2] != 3) {
                    if (arg0.field1816[var2] != 4) {
                        if (var3 != var4) {
                            return false;
                        }
                    } else if (var3 == var4) {
                        return false;
                    }
                } else if (var4 >= var3) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(II)[[I")
    public final int[][] method46(int arg0, int arg1) {
        ++field4664;
        if (arg0 != -1) {
            method1973(-107);
        }
        int[][] var3 = super.field3461.method1126(1, arg1);
        if (super.field3461.field2591 && this.method1669(-709346716)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field3896 * super.field3896;
            for (int var8 = 0; class244.field4015 > var8; ++var8) {
                int var9 = super.field3902[var8 % super.field3903 + var7];
                var6[var8] = class173.method1186(var9, 255) << 4;
                var5[var8] = class173.method1186(4080, var9 >> 4);
                var4[var8] = class173.method1186(16711680, var9) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "(I)V")
    public static final void method1972(int arg0) {
        ++field4654;
        class287.field4577.method1701((byte) 79);
        if (arg0 > -52) {
            field4657 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "(I)V")
    public static void method1973(int arg0) {
        field4662 = null;
        field4657 = null;
        field4668 = null;
        field4663 = null;
        int var1 = -106 / ((arg0 - 41) / 50);
        field4666 = null;
        field4665 = null;
        field4658 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)I")
    public static final int method1974(int arg0, byte arg1) {
        ++field4653;
        if (arg1 != -23) {
            method1972(-69);
        }
        return 255 & arg0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lpd;I)V")
    public static final void method1975(class96 arg0, int arg1) {
        ++field4660;
        while (true) {
            while (~arg0.field1228 > ~arg0.field1218.length) {
                int var2 = 0;
                int var3 = 0;
                boolean var4 = false;
                if (~arg0.method584(255) == -2) {
                    var2 = arg0.method584(255);
                    var4 = true;
                    var3 = arg0.method584(255);
                }
                int var5 = arg0.method584(255);
                int var6 = arg0.method584(255);
                int var7 = var5 * 64 - class105.field1413;
                int var8 = class7.field88 - var6 * 64 + -1 - -class42.field524;
                if (var7 >= 0 && var8 - 63 >= 0 && class44.field562 > var7 + 63 && class7.field88 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; ~var11 > -65; ++var11) {
                        for (int var12 = 0; var12 < 64; ++var12) {
                            if (!var4 || ~(var2 * 8) >= ~var11 && ~var11 > ~(var2 * 8 + 8) && var3 * 8 <= var12 && var3 * 8 + 8 > var12) {
                                int var13 = arg0.method584(255);
                                if (~var13 != -1) {
                                    if (~(var13 & 1) == -2) {
                                        int var14 = arg0.method584(255);
                                        if (class269.field4312[var9][var10] == null) {
                                            class269.field4312[var9][var10] = new byte[4096];
                                        }
                                        class269.field4312[var9][var10][(-var12 + 63 << 6) + var11] = (byte) var14;
                                    }
                                    if (~(var13 & 2) == -3) {
                                        int var15 = arg0.method598(-1235752501);
                                        if (class55.field702[var9][var10] == null) {
                                            class55.field702[var9][var10] = new int[4096];
                                        }
                                        class55.field702[var9][var10][(63 - var12 << 6) - -var11] = var15;
                                    }
                                    if (~(var13 & 4) == -5) {
                                        int var16 = arg0.method598(-1235752501);
                                        if (class155.field2424[var9][var10] == null) {
                                            class155.field2424[var9][var10] = new int[4096];
                                        }
                                        --var16;
                                        class228 var17 = class256.method1749(var16, 0);
                                        if (var17.field3641 != null) {
                                            var17 = var17.method1629(-126);
                                            if (var17 == null || ~var17.field3695 == 0) {
                                                continue;
                                            }
                                        }
                                        class155.field2424[var9][var10][(63 - var12 << 6) + var11] = var17.field3697 + 1;
                                        class41 var18 = new class41();
                                        var18.field515 = var7;
                                        var18.field513 = var8;
                                        var18.field510 = var17.field3695;
                                        class78.field980.method1803(var18, -1);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; ~var19 > ~(!var4 ? 4096 : 64); ++var19) {
                        int var20 = arg0.method584(255);
                        if (~var20 != -1) {
                            if ((1 & var20) == 1) {
                                ++arg0.field1228;
                            }
                            if (~(var20 & 2) == -3) {
                                arg0.field1228 += 2;
                            }
                            if ((4 & var20) == 4) {
                                arg0.field1228 += 3;
                            }
                        }
                    }
                }
            }
            if (arg1 > 0) {
                method1972(90);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1976(int arg0, String arg1, int arg2) {
        if (arg2 <= -114) {
            ++field4661;
            class233 var3 = class114.method746(arg0, 1228126432, 2);
            var3.method1651((byte) 121);
            var3.field3863 = arg1;
        }
    }
}
