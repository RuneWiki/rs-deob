import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class25 extends class115 {

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "I")
    private int field302 = 3072;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "I")
    private int field299 = 1024;

    @OriginalMember(owner = "client!mh", name = "eb", descriptor = "I")
    private int field307 = 2048;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
    public static int field296 = 0;

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "Lqe;")
    public static class168 field301 = class66.method448("gr-Un:", -118);

    @OriginalMember(owner = "client!mh", name = "bb", descriptor = "Lqe;")
    public static class168 field304 = null;

    @OriginalMember(owner = "client!mh", name = "db", descriptor = "Lqe;")
    public static class168 field306 = class66.method448("null", -119);

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!mh", name = "ab", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!mh", name = "cb", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!mh", name = "fb", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "Z")
    public static boolean field294;

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "Z")
    public static boolean field300;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(B)Lqe;")
    public static final class168 method166(byte arg0) {
        class168 var1 = class56.field775;
        int var2 = -19 / ((arg0 - 24) / 61);
        if (class23.field277 != 0) {
            var1 = class69.field1000;
        }
        ++field293;
        return class50.method347(2, new class168[] { class230.field3919, var1, class43.field565, class128.method867((byte) 99, class199.field3438), class7.field78, class128.method867((byte) 94, class153.field2661), class236.field4024 });
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IB)I")
    public static final int method167(int arg0, byte arg1) {
        ++field303;
        return arg1 != 110 ? 40 : arg0 >>> 10;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class25() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(B)V")
    public static void method168(byte arg0) {
        field304 = null;
        field306 = null;
        field301 = null;
        if (arg0 != 113) {
            field294 = false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BIIILfj;)V")
    public static final void method169(byte arg0, int arg1, int arg2, int arg3, class180 arg4) {
        ++field308;
        if (arg0 != -35) {
            method168((byte) 82);
        }
        if (~class109.field1748 > -401) {
            if (arg4.field3206 != null) {
                arg4 = arg4.method1192(-1);
            }
            if (arg4 != null) {
                if (arg4.field3173) {
                    class168 var5 = arg4.field3219;
                    if (~arg4.field3209 != -1) {
                        var5 = class50.method347(arg0 ^ -33, new class168[] { var5, class26.method174(arg4.field3209, 34, class7.field85.field1993), class167.field2847, class254.field4402, class128.method867((byte) 117, arg4.field3209), class44.field577 });
                    }
                    if (class190.field3311 == 1) {
                        class94.method624(arg2, (long) arg3, (short) 41, arg1, class50.method347(2, new class168[] { class117.field1911, class127.field2107, var5 }), class90.field1398, (byte) 122);
                        ++class256.field4432;
                    } else {
                        if (class84.field1277) {
                            if ((2 & class172.field2985) == 2) {
                                class94.method624(arg2, (long) arg3, (short) 48, arg1, class50.method347(2, new class168[] { class128.field2118, class127.field2107, var5 }), class19.field236, (byte) 110);
                                ++class178.field3133;
                                return;
                            }
                        } else {
                            ++class237.field4053;
                            class168[] var6 = arg4.field3213;
                            if (class249.field4321) {
                                var6 = class233.method1505((byte) -123, var6);
                            }
                            if (var6 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (var6[var7] != null && (class30.field367 != 0 || !var6[var7].method1106(-107, class238.field4078))) {
                                        ++class33.field406;
                                        byte var8 = 0;
                                        if (var7 == 0) {
                                            var8 = 16;
                                        }
                                        if (~var7 == -2) {
                                            var8 = 13;
                                        }
                                        if (var7 == 2) {
                                            var8 = 47;
                                        }
                                        if (var7 == 3) {
                                            var8 = 15;
                                        }
                                        if (~var7 == -5) {
                                            var8 = 25;
                                        }
                                        class94.method624(arg2, (long) arg3, var8, arg1, class50.method347(arg0 ^ -33, new class168[] { class78.field1179, var5 }), var6[var7], (byte) 106);
                                    }
                                }
                            }
                            if (~class30.field367 == -1 && var6 != null) {
                                for (int var9 = 4; ~var9 <= -1; --var9) {
                                    if (var6[var9] != null && var6[var9].method1106(-84, class238.field4078)) {
                                        short var10 = 0;
                                        short var11 = 0;
                                        ++class9.field95;
                                        if (var9 == 0) {
                                            var11 = 16;
                                        }
                                        if (~var9 == -2) {
                                            var11 = 13;
                                        }
                                        if (~var9 == -3) {
                                            var11 = 47;
                                        }
                                        if (var9 == 3) {
                                            var11 = 15;
                                        }
                                        if (arg4.field3209 > class7.field85.field1993) {
                                            var10 = 2000;
                                        }
                                        if (~var9 == -5) {
                                            var11 = 25;
                                        }
                                        if (var11 != 0) {
                                            var11 += var10;
                                        }
                                        class94.method624(arg2, (long) arg3, var11, arg1, class50.method347(2, new class168[] { class78.field1179, var5 }), var6[var9], (byte) 109);
                                    }
                                }
                            }
                            class94.method624(arg2, (long) arg3, (short) 1001, arg1, class50.method347(2, new class168[] { class78.field1179, var5 }), class147.field2554, (byte) 116);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        int[] var3 = super.field1872.method182((byte) -108, arg0);
        ++field305;
        if (arg1 < 37) {
            this.field307 = -114;
        }
        if (super.field1872.field341) {
            int[] var4 = this.method792(0, 0, arg0);
            for (int var5 = 0; ~var5 > ~class130.field2297; ++var5) {
                var3[var5] = (var4[var5] * this.field307 >> 12) + this.field299;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V")
    public final void method170(int arg0) {
        ++field295;
        if (arg0 == 395462996) {
            this.field307 = -this.field299 + this.field302;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field1879 = ~arg1.method758(true) == -2;
                }
            } else {
                this.field302 = arg1.method731(false);
            }
        } else {
            this.field299 = arg1.method731(false);
        }
        if (arg0 == 107) {
            ++field297;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        if (arg1 < 11) {
            this.field299 = -12;
        }
        ++field298;
        int[][] var3 = super.field1882.method1242(arg0, 54);
        if (super.field1882.field3344) {
            int[][] var4 = this.method789(0, (byte) -124, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; class130.field2297 > var11; ++var11) {
                var8[var11] = (var5[var11] * this.field307 >> 12) + this.field299;
                var10[var11] = (var6[var11] * this.field307 >> 12) + this.field299;
                var9[var11] = this.field299 - -(var7[var11] * this.field307 >> 12);
            }
        }
        return var3;
    }
}
