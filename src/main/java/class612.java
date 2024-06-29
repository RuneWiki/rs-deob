import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class612 extends class418 {

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "Lvf;")
    public static class141 field8320 = new class141(6, 0, 4, 2);

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "B")
    public byte field8318;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    public static int field8317;

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "I")
    public int field8323;

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
    public static int field8324;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
    public static int field8325;

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "Lji;")
    public class572 field8319;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "[[I")
    public static int[][] field8321;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(DI)V")
    public static final void method3426(double arg0, int arg1) {
        ++field8324;
        if (arg1 == 13) {
            if (class539.field6799 != arg0) {
                for (int var3 = 0; ~var3 > -257; ++var3) {
                    int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                    class681.field9278[var3] = ~var4 < -256 ? 255 : var4;
                }
                class539.field6799 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)V")
    public static void method3427(int arg0) {
        field8321 = null;
        field8320 = null;
        if (arg0 <= 29) {
            method3427(67);
        }
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)[B")
    public final byte[] method1741(int arg0) {
        if (arg0 != 0) {
            this.field8319 = null;
        }
        ++field8317;
        if (!super.field5346 && this.field8319.field7313 >= this.field8319.field7318.length + -this.field8318) {
            return this.field8319.field7318;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)I")
    public final int method1740(byte arg0) {
        ++field8325;
        if (this.field8319 == null) {
            return 0;
        } else {
            return arg0 < 38 ? 93 : this.field8319.field7313 * 100 / (this.field8319.field7318.length - this.field8318);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lac;IZ)V")
    public static final void method3428(class506 arg0, int arg1, boolean arg2) {
        ++field8322;
        if (~class638.field8648 > -401) {
            class689 var3 = arg0.field6326;
            if (var3.field9546 != null) {
                var3 = var3.method3812(class327.field4084, -128);
                if (var3 == null) {
                    return;
                }
            }
            if (var3.field9555) {
                String var4 = var3.field9553;
                if (var3.field9523 != 0) {
                    String var5 = class341.field4353 == class237.field3061 ? class671.field9144.method3726((byte) 116, class71.field912) : class671.field9142.method3726((byte) 112, class71.field912);
                    var4 = var4 + class243.method1460(2551, var3.field9523, class67.field815.field4674) + " (" + var5 + var3.field9523 + ")";
                }
                if (class37.field542 && !arg2) {
                    class362 var6 = class696.field9644 != -1 ? class46.field617.method1403(class696.field9644, 64) : null;
                    if (~(class458.field5709 & 2) != -1 && (var6 == null || var3.method3807((byte) -69, class696.field9644, var6.field4635) != var6.field4635)) {
                        ++class683.field9304;
                        class688.method3802(false, true, -1, 58, 0, class467.field5794, (long) arg0.field495, class351.field4540 + " -> <col=ffff00>" + var4, 0, class7.field74, 0);
                    }
                }
                if (!arg2) {
                    String[] var7 = var3.field9565;
                    if (class243.field3147) {
                        var7 = class117.method790(116, var7);
                    }
                    if (var7 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (var7[var8] != null && (~var3.field9526 == -1 || !var7[var8].equalsIgnoreCase(class671.field9137.method3726((byte) 95, class71.field912)))) {
                                byte var9 = 0;
                                int var10 = class428.field5404;
                                if (~var8 == -1) {
                                    var9 = 51;
                                }
                                if (var8 == 1) {
                                    var9 = 2;
                                }
                                if (var8 == 2) {
                                    var9 = 13;
                                }
                                if (var8 == 3) {
                                    var9 = 30;
                                }
                                if (var3.field9544 == var8) {
                                    var10 = var3.field9567;
                                }
                                if (~var8 == -5) {
                                    var9 = 47;
                                }
                                if (var3.field9560 == var8) {
                                    var10 = var3.field9520;
                                }
                                ++class512.field6424;
                                class688.method3802(false, true, -1, var9, 0, var7[var8], (long) arg0.field495, "<col=ffff00>" + var4, 0, var7[var8].equalsIgnoreCase(class671.field9137.method3726((byte) 110, class71.field912)) ? var3.field9524 : var10, 0);
                            }
                        }
                    }
                    if (var3.field9526 == 1 && var7 != null) {
                        for (int var11 = 4; ~var11 <= -1; --var11) {
                            if (var7[var11] != null && var7[var11].equalsIgnoreCase(class671.field9137.method3726((byte) 56, class71.field912))) {
                                short var12 = 0;
                                if (~var3.field9523 < ~class67.field815.field4674) {
                                    var12 = 2000;
                                }
                                short var13 = 0;
                                if (~var11 == -1) {
                                    var13 = 51;
                                }
                                if (var11 == 1) {
                                    var13 = 2;
                                }
                                if (var11 == 2) {
                                    var13 = 13;
                                }
                                if (var11 == 3) {
                                    var13 = 30;
                                }
                                if (~var11 == -5) {
                                    var13 = 47;
                                }
                                if (~var13 != -1) {
                                    var13 += var12;
                                }
                                class688.method3802(false, true, -1, var13, 0, var7[var11], (long) arg0.field495, "<col=ffff00>" + var4, 0, var3.field9524, 0);
                                ++class209.field2478;
                            }
                        }
                    }
                }
                ++class512.field6422;
                class688.method3802(arg2, true, -1, 1001, arg1 ^ arg1, class671.field9136.method3726((byte) 59, class71.field912), (long) arg0.field495, "<col=ffff00>" + var4, 0, class268.field3390, 0);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lpfa;B)V")
    public static final void method3429(class275 arg0, byte arg1) {
        if (arg1 == 17) {
            ++field8316;
            class686.field9369 = arg0;
        }
    }
}
