import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class131 extends class152 {

    @OriginalMember(owner = "client!wi", name = "Qb", descriptor = "[I")
    public static int[] field2341 = new int[2];

    @OriginalMember(owner = "client!wi", name = "Xb", descriptor = "Lia;")
    public static class257 field2348 = class28.method234(-86, "::rebuild");

    @OriginalMember(owner = "client!wi", name = "bc", descriptor = "Lia;")
    public static class257 field2352 = class28.method234(-95, "www");

    @OriginalMember(owner = "client!wi", name = "fc", descriptor = "Lia;")
    public static class257 field2356 = class28.method234(-48, "Wordpack geladen)3");

    @OriginalMember(owner = "client!wi", name = "Tb", descriptor = "I")
    public static int field2344 = 0;

    @OriginalMember(owner = "client!wi", name = "ec", descriptor = "Lia;")
    public static class257 field2355 = class28.method234(-58, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!wi", name = "V", descriptor = "I")
    private int field2339;

    @OriginalMember(owner = "client!wi", name = "Rb", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!wi", name = "Sb", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!wi", name = "Ub", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!wi", name = "Yb", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!wi", name = "Zb", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!wi", name = "ac", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!wi", name = "cc", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!wi", name = "dc", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!wi", name = "gc", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!wi", name = "Pb", descriptor = "Lnd;")
    private class126 field2340;

    @OriginalMember(owner = "client!wi", name = "Wb", descriptor = "Lme;")
    public static class44 field2347;

    @OriginalMember(owner = "client!wi", name = "Vb", descriptor = "[[[B")
    public static byte[][][] field2346;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljb;ILme;Ljb;IIII)V")
    public static final void method906(class107 arg0, int arg1, class44 arg2, class107 arg3, int arg4, int arg5, int arg6, int arg7) {
        class257.field4414 = arg7;
        class165.field2886 = arg5;
        ++field2354;
        class209.field3577 = arg6;
        class164.field2861 = arg4;
        class191.field3264 = arg2;
        if (class186.field3230 == null) {
            class231.field3882 = true;
            if (class20.field423 == null) {
                class20.field423 = class170.method1169(-2048, 0, class182.field3169, class42.field850);
            }
            if (class260.field4508 == null) {
                class260.field4508 = class231.method1506(class42.field850, client.field1531, (byte) -95, 0);
            }
            if (class138.field2463 == null) {
                class138.field2463 = class231.method1506(class42.field850, class183.field3190, (byte) -91, 0);
            }
            if (class237.field4060 == null) {
                class237.field4060 = class231.method1506(class42.field850, class230.field3859, (byte) -118, 0);
            }
            int var8 = class164.field2861 / 5;
            int var9 = class164.field2861 / 5 * 4;
            class23.method196(class165.field2886, class257.field4414, class164.field2861, class209.field3577, 0, 168);
            class23.method207(class165.field2886, class257.field4414, var8, 23, 12425273, 9135624);
            class23.method207(class165.field2886 + var8, class257.field4414, var9, 23, 5197647, 2697513);
            arg0.method794(class217.field3677, var8 / 2 + class165.field2886, class257.field4414 + 15, 0, -1);
            if (class237.field4060 != null) {
                class237.field4060[1].method673(class165.field2886 + 2 + var8, class257.field4414 + 1);
                arg3.method790(class166.field2891, class165.field2886 + 12 - -var8, class257.field4414 - -10, 16777215, -1);
                class237.field4060[0].method673(class165.field2886 + var8 + 2, class257.field4414 + 12);
                arg3.method790(class95.field1794, class165.field2886 + 12 + var8, class257.field4414 + 21, 16777215, -1);
            }
            if (class138.field2463 != null) {
                int var10 = var8 + 140 + class165.field2886;
                if (class17.field372[0] == 0 && class44.field1029[0] == 0) {
                    class138.field2463[2].method673(var10, class257.field4414 - -4);
                } else {
                    class138.field2463[0].method673(var10, class257.field4414 - -4);
                }
                if (~class17.field372[0] == -1 && ~class44.field1029[0] == -2) {
                    class138.field2463[3].method673(var10 + 15, class257.field4414 + 4);
                } else {
                    class138.field2463[1].method673(var10 + 15, class257.field4414 + 4);
                }
                arg0.method790(class202.field3458, var10 - -32, class257.field4414 + 17, 16777215, -1);
                int var11 = class165.field2886 - (-var8 + -250);
                if (class17.field372[0] == 1 && ~class44.field1029[0] == -1) {
                    class138.field2463[2].method673(var11, class257.field4414 + 4);
                } else {
                    class138.field2463[0].method673(var11, class257.field4414 + 4);
                }
                if (class17.field372[0] == 1 && ~class44.field1029[0] == -2) {
                    class138.field2463[3].method673(var11 + 15, class257.field4414 - -4);
                } else {
                    class138.field2463[1].method673(var11 + 15, class257.field4414 - -4);
                }
                arg0.method790(class37.field743, var11 + 32, class257.field4414 + 17, 16777215, -1);
                int var12 = class165.field2886 + 360 + var8;
                if (class17.field372[0] == 2 && class44.field1029[0] == 0) {
                    class138.field2463[2].method673(var12, class257.field4414 + 4);
                } else {
                    class138.field2463[0].method673(var12, class257.field4414 - -4);
                }
                if (~class17.field372[0] == -3 && ~class44.field1029[0] == -2) {
                    class138.field2463[3].method673(var12 + 15, class257.field4414 + 4);
                } else {
                    class138.field2463[1].method673(var12 - -15, class257.field4414 - -4);
                }
                arg0.method790(class238.field4092, var12 - -32, class257.field4414 - -17, 16777215, -1);
                int var13 = var8 + 470 + class165.field2886;
                if (class17.field372[0] == 3 && class44.field1029[0] == 0) {
                    class138.field2463[2].method673(var13, class257.field4414 + 4);
                } else {
                    class138.field2463[0].method673(var13, class257.field4414 + 4);
                }
                if (class17.field372[0] == 3 && class44.field1029[0] == 1) {
                    class138.field2463[3].method673(var13 - -15, class257.field4414 + 4);
                } else {
                    class138.field2463[1].method673(var13 + 15, class257.field4414 + 4);
                }
                arg0.method790(class225.field3781, var13 + 32, class257.field4414 + 17, 16777215, -1);
            }
            class23.method198(class164.field2861 + -10 - arg1, class257.field4414 + 4, 58, 16, 0);
            class70.field1382 = -1;
            if (class20.field423 != null) {
                byte var14 = 88;
                byte var15 = 19;
                int var16 = class164.field2861 / (var14 + 1);
                int var17 = (class209.field3577 + -23) / (var15 + 1);
                int var18;
                int var19;
                do {
                    var18 = var17;
                    var19 = var16;
                    if (~class258.field4485 >= ~((var16 + -1) * var17)) {
                        --var16;
                    }
                    if (~((var17 + -1) * var16) <= ~class258.field4485) {
                        --var17;
                    }
                    if ((var17 + -1) * var16 >= class258.field4485) {
                        --var17;
                    }
                } while (var17 != var18 || ~var16 != ~var19);
                int var20 = (class164.field2861 - var14 * var16) / (var16 + 1);
                if (~var20 < -6) {
                    var20 = 5;
                }
                int var21 = (-(var15 * var17) + class209.field3577 + -23) / (var17 - -1);
                if (~var21 < -6) {
                    var21 = 5;
                }
                int var22 = (-((var16 + -1) * var20) + class164.field2861 - var14 * var16) / 2;
                int var23 = (-((var17 + -1) * var21) + -(var15 * var17) + -23 + class209.field3577) / 2;
                int var24 = var23 + 23;
                int var25 = var22;
                int var26 = 0;
                for (int var27 = 0; class258.field4485 > var27; ++var27) {
                    class132 var28 = class171.field2936[var27];
                    boolean var29 = true;
                    class257 var30 = class111.method808(10, var28.field2361);
                    if (var28.field2361 == -1) {
                        var29 = false;
                        var30 = class59.field1251;
                    } else if (~var28.field2361 < -1981) {
                        var29 = false;
                        var30 = class50.field1100;
                    }
                    if (~class245.field4253 <= ~var25 && ~var24 >= ~class102.field1904 && var14 + var25 > class245.field4253 && ~class102.field1904 > ~(var24 - -var15) && var29) {
                        class70.field1382 = var27;
                        class20.field423[var28.field2364 ? 1 : 0].method1256(class165.field2886 + var25, class257.field4414 + var24, 128, 16777215);
                    } else {
                        class20.field423[var28.field2364 ? 1 : 0].method486(class165.field2886 + var25, class257.field4414 + var24);
                    }
                    if (class260.field4508 != null) {
                        class260.field4508[(var28.field2364 ? 8 : 0) - -var28.field2359].method673(class165.field2886 + 29 + var25, class257.field4414 + var24);
                    }
                    arg0.method794(class111.method808(10, var28.field2375), class165.field2886 - -var25 + 15, var15 / 2 + class257.field4414 - -5 + var24, 0, -1);
                    arg3.method794(var30, var25 + 60 + class165.field2886, var15 / 2 + 5 + class257.field4414 + var24, 268435455, -1);
                    var24 += var15 + var21;
                    ++var26;
                    if (var17 <= var26) {
                        var24 = var23 + 23;
                        var25 += var14 + var20;
                        var26 = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III[B)V")
    public final void method907(int arg0, int arg1, int arg2, byte[] arg3) {
        for (int var5 = 0; ~arg0 < ~var5; ++var5) {
            arg3[var5 - -arg2] = (byte) (super.field2638[super.field2677++] + -this.field2340.method881((byte) -102));
        }
        if (arg1 != 831) {
            this.method912((byte) -97);
        }
        ++field2357;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(ZI)V")
    public final void method908(boolean arg0, int arg1) {
        ++field2343;
        if (arg0) {
            this.method912((byte) -92);
        }
        super.field2638[super.field2677++] = (byte) (arg1 + this.field2340.method881((byte) -102));
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(IB)I")
    public final int method909(int arg0, byte arg1) {
        if (arg1 >= -99) {
            this.method907(26, -81, -6, (byte[]) null);
        }
        ++field2351;
        int var3 = -(this.field2339 & 7) + 8;
        int var4 = this.field2339 >> 3;
        int var5 = 0;
        this.field2339 += arg0;
        while (~var3 > ~arg0) {
            var5 += (super.field2638[var4++] & class201.field3443[var3]) << -var3 + arg0;
            arg0 -= var3;
            var3 = 8;
        }
        int var6;
        if (~arg0 == ~var3) {
            var6 = (super.field2638[var4] & class201.field3443[var3]) + var5;
        } else {
            var6 = (super.field2638[var4] >> -arg0 + var3 & class201.field3443[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(I)V")
    public class131(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(BI)I")
    public final int method910(byte arg0, int arg1) {
        if (arg0 != 45) {
            this.method909(-39, (byte) 23);
        }
        ++field2342;
        return arg1 * 8 + -this.field2339;
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(Z)V")
    public final void method911(boolean arg0) {
        if (!arg0) {
            super.field2677 = (this.field2339 + 7) / 8;
            ++field2353;
        }
    }

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "(B)V")
    public final void method912(byte arg0) {
        ++field2345;
        this.field2339 = super.field2677 * 8;
        if (arg0 != 36) {
            this.method912((byte) -36);
        }
    }

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "(B)V")
    public static void method913(byte arg0) {
        if (arg0 >= -99) {
            field2341 = null;
        }
        field2341 = null;
        field2352 = null;
        field2348 = null;
        field2347 = null;
        field2355 = null;
        field2346 = null;
        field2356 = null;
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(Z)I")
    public final int method914(boolean arg0) {
        ++field2350;
        if (arg0) {
            this.method915(28, (int[]) null);
        }
        return 255 & super.field2638[super.field2677++] + -this.field2340.method881((byte) -102);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[I)V")
    public final void method915(int arg0, int[] arg1) {
        if (arg0 == 2) {
            this.field2340 = new class126(arg1);
            ++field2349;
        }
    }
}
