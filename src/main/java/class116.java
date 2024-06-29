import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class116 extends class252 {

    @OriginalMember(owner = "client!u", name = "db", descriptor = "[I")
    public static int[] field2074 = new int[100];

    @OriginalMember(owner = "client!u", name = "eb", descriptor = "I")
    public static int field2075 = 0;

    @OriginalMember(owner = "client!u", name = "jb", descriptor = "Ljd;")
    private static class85 field2080 = class221.method1499("skill)2", (byte) -114);

    @OriginalMember(owner = "client!u", name = "fb", descriptor = "Ljd;")
    private static class85 field2076 = class221.method1499("yellow:", (byte) 126);

    @OriginalMember(owner = "client!u", name = "Z", descriptor = "Ljd;")
    public static class85 field2070 = field2076;

    @OriginalMember(owner = "client!u", name = "mb", descriptor = "Ljd;")
    public static class85 field2083 = class221.method1499("hint_mapmarkers", (byte) -107);

    @OriginalMember(owner = "client!u", name = "nb", descriptor = "Ljd;")
    public static class85 field2084 = field2076;

    @OriginalMember(owner = "client!u", name = "cb", descriptor = "Ljd;")
    public static class85 field2073 = field2080;

    @OriginalMember(owner = "client!u", name = "ob", descriptor = "Z")
    public static boolean field2085 = false;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!u", name = "V", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!u", name = "X", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!u", name = "Y", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!u", name = "ab", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!u", name = "bb", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!u", name = "gb", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!u", name = "hb", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!u", name = "ib", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!u", name = "kb", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!u", name = "lb", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!u", name = "pb", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!u", name = "qb", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!u", name = "W", descriptor = "Lge;")
    public static class68 field2067;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(JI)Ljd;")
    public static final class85 method814(long arg0, int arg1) {
        ++field2071;
        if (~arg0 < -1L && arg0 < 6582952005840035281L) {
            if (arg0 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg0;
                while (~var4 != -1L) {
                    var4 /= 37L;
                    ++var3;
                }
                byte[] var6 = new byte[var3];
                while (arg0 != 0L) {
                    long var9 = arg0;
                    arg0 /= 37L;
                    --var3;
                    var6[var3] = class169.field2914[(int) (-(arg0 * 37L) + var9)];
                }
                class85 var7 = new class85();
                var7.field1548 = var6;
                var7.field1538 = var6.length;
                int var8 = -45 % ((9 - arg1) / 53);
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method815(byte[] arg0, boolean arg1) {
        int var2 = arg0.length;
        ++field2077;
        byte[] var3 = new byte[var2];
        class248.method1724(arg0, 0, var3, 0, var2);
        return !arg1 ? null : var3;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method816(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2072;
        if (~arg2 <= -2 && ~arg6 <= -2 && arg2 <= 102 && arg6 <= 102) {
            if (!class121.method833((byte) -106) && ~(2 & class228.field3952[0][arg2][arg6]) == -1) {
                int var8 = arg0;
                if ((8 & class228.field3952[arg0][arg2][arg6]) != 0) {
                    var8 = 0;
                }
                if (class82.field1498 != var8) {
                    return;
                }
            }
            int var9 = arg0;
            if (arg0 < 3 && ~(2 & class228.field3952[1][arg2][arg6]) == -3) {
                var9 = arg0 + 1;
            }
            class142.method929(arg6, 3, arg2, arg0, var9, arg4, class34.field529[arg0]);
            if (arg7 >= 0) {
                boolean var10 = class31.field475;
                class31.field475 = true;
                class104.method719(false, arg0, arg7, var9, arg6, arg5, class34.field529[arg0], 14013, arg2, arg3, false);
                class31.field475 = var10;
            }
        }
        if (arg1 < 12) {
            method817(-92, (byte[]) null, (byte) -39, -15);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I[BBI)Ljd;")
    public static final class85 method817(int arg0, byte[] arg1, byte arg2, int arg3) {
        if (arg2 != -39) {
            method815((byte[]) null, true);
        }
        ++field2079;
        class85 var4 = new class85();
        var4.field1548 = new byte[arg0];
        var4.field1538 = 0;
        for (int var5 = arg3; arg0 + arg3 > var5; ++var5) {
            if (arg1[var5] != 0) {
                var4.field1548[var4.field1538++] = arg1[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(III)J")
    public static final long method818(int arg0, int arg1, int arg2) {
        class208 var3 = class99.field1780[arg0][arg1][arg2];
        return var3 != null && var3.field3656 != null ? var3.field3656.field4028 : 0L;
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(I)V")
    public static void method819(int arg0) {
        field2084 = null;
        field2083 = null;
        field2070 = null;
        field2067 = null;
        field2080 = null;
        field2073 = null;
        if (arg0 != -26318) {
            method814(13L, -104);
        }
        field2074 = null;
        field2076 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        if (arg1 != -123) {
            field2082 = 13;
        }
        int[][] var3 = super.field4350.method155(arg0, false);
        if (super.field4350.field338) {
            int[][] var4 = this.method1737(0, arg1 + 126, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~class5.field63 < ~var11; ++var11) {
                var8[var11] = 4096 - var5[var11];
                var10[var11] = -var6[var11] + 4096;
                var9[var11] = -var7[var11] + 4096;
            }
        }
        ++field2078;
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIII)V")
    public static final void method820(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg4 * arg4;
        int var7 = arg2;
        int var8 = 0;
        int var9 = arg2 * arg2;
        int var10 = var6 << 1;
        int var11 = var9 << 1;
        int var12 = arg2 << 1;
        int var13 = (-var12 + 1) * var6 + var11;
        ++field2069;
        int var14 = var6 << 2;
        int var15 = var9 - (var12 - 1) * var10;
        int var16 = var9 << 2;
        int var17 = ((var8 << 1) + 3) * var11;
        int var18 = (var8 + 1) * var16;
        if (arg1 >= class34.field522 && ~class1.field6 <= ~arg1) {
            int var19 = class144.method945(arg4 + arg5, class217.field3802, (byte) -116, class83.field1513);
            int var20 = class144.method945(-arg4 + arg5, class217.field3802, (byte) -116, class83.field1513);
            class183.method1260(arg0, var20, 8, class146.field2488[arg1], var19);
        }
        int var21 = (arg2 + -1) * var14;
        if (arg3 == -21732) {
            int var22 = ((arg2 << 1) + -3) * var10;
            while (var7 > 0) {
                --var7;
                if (var13 < 0) {
                    while (var13 < 0) {
                        ++var8;
                        var13 += var17;
                        var17 += var16;
                        var15 += var18;
                        var18 += var16;
                    }
                }
                if (~var15 > -1) {
                    var15 += var18;
                    var13 += var17;
                    ++var8;
                    var18 += var16;
                    var17 += var16;
                }
                var13 += -var21;
                var21 -= var14;
                int var23 = arg1 - -var7;
                var15 += -var22;
                var22 -= var14;
                int var24 = -var7 + arg1;
                if (~class34.field522 >= ~var23 && var24 <= class1.field6) {
                    int var25 = class144.method945(arg5 + var8, class217.field3802, (byte) -116, class83.field1513);
                    int var26 = class144.method945(-var8 + arg5, class217.field3802, (byte) -116, class83.field1513);
                    if (~var24 <= ~class34.field522) {
                        class183.method1260(arg0, var26, 91, class146.field2488[var24], var25);
                    }
                    if (~var23 >= ~class1.field6) {
                        class183.method1260(arg0, var26, 96, class146.field2488[var23], var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class116() {
        super(1, false);
    }

    @OriginalMember(owner = "client!u", name = "h", descriptor = "(I)V")
    public static final void method821(int arg0) {
        ++field2065;
        class16.method120((byte) -110, class177.field3035);
        ++class30.field454;
        if (arg0 != -25523) {
            method815((byte[]) null, false);
        }
        if (class22.field305 && class239.field4115) {
            int var1 = class245.field4195;
            int var2 = var1 - class16.field233;
            int var3 = class106.field1851;
            int var4 = class177.field3035.field4532;
            if (~var2 > ~class202.field3520) {
                var2 = class202.field3520;
            }
            if (class202.field3520 - -class153.field2645.field4513 < var2 - -class177.field3035.field4513) {
                var2 = class202.field3520 + class153.field2645.field4513 + -class177.field3035.field4513;
            }
            int var5 = var2 - class202.field3520 + class153.field2645.field4557;
            int var6 = var3 - class244.field4177;
            if (~class146.field2490 < ~var6) {
                var6 = class146.field2490;
            }
            int var7 = -class134.field2338 + var2;
            if (~(class146.field2490 + class153.field2645.field4482) > ~(var6 - -class177.field3035.field4482)) {
                var6 = class153.field2645.field4482 - class177.field3035.field4482 + class146.field2490;
            }
            int var8 = -class146.field2490 + var6 + class153.field2645.field4484;
            int var9 = -class206.field3608 + var6;
            if (~class30.field454 < ~class177.field3035.field4489 && (var4 < var7 || -var4 > var7 || ~var9 < ~var4 || ~(-var4) < ~var9)) {
                class251.field4330 = true;
            }
            if (class177.field3035.field4401 != null && class251.field4330) {
                class5 var10 = new class5();
                var10.field62 = var8;
                var10.field67 = class177.field3035.field4401;
                var10.field58 = class177.field3035;
                var10.field56 = var5;
                class127.method863(-126, var10);
            }
            if (class217.field3806 == 0) {
                if (!class251.field4330) {
                    if ((~class150.field2543 == -2 || class142.method930(-3115, class115.field2058 - 1)) && class115.field2058 > 2) {
                        class107.method741(-15179);
                    } else if (class115.field2058 > 0) {
                        class54.method363((byte) -41);
                    }
                } else {
                    if (class177.field3035.field4458 != null) {
                        class5 var11 = new class5();
                        var11.field59 = class33.field501;
                        var11.field56 = var5;
                        var11.field67 = class177.field3035.field4458;
                        var11.field58 = class177.field3035;
                        var11.field62 = var8;
                        class127.method863(arg0 ^ 25592, var11);
                    }
                    if (class33.field501 != null && client.method990(class177.field3035) != null) {
                        class207.field3618.method483(-24260, 191);
                        class207.field3618.method1675(-1, class177.field3035.field4418);
                        ++class97.field1750;
                        class207.field3618.method1673(class33.field501.field4418, true);
                        class207.field3618.method1715(class33.field501.field4479, (byte) 125);
                        class207.field3618.method1709(false, class177.field3035.field4479);
                    }
                }
                class177.field3035 = null;
            }
        } else {
            if (class30.field454 > 1) {
                class177.field3035 = null;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        if (arg1 != -55) {
            method819(66);
        }
        ++field2086;
        int[] var3 = super.field4356.method868(arg0, (byte) -19);
        if (super.field4356.field2258) {
            int[] var4 = this.method1742((byte) 8, 0, arg0);
            for (int var5 = 0; var5 < class5.field63; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        if (~arg1 == -1) {
            super.field4338 = arg0.method1711((byte) -67) == 1;
        }
        if (arg2 != -99) {
            method817(-117, (byte[]) null, (byte) -116, 123);
        }
        ++field2068;
    }
}
