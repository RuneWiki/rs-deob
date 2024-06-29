import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class756 extends class305 {

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "Lqe;")
    public static class469 field10577 = new class469(70, 6);

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
    public static int field10587 = 0;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
    public static int field10578;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
    public static int field10579;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "I")
    public static int field10580;

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "I")
    public static int field10581;

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "I")
    public static int field10582;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
    public static int field10583;

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "I")
    public static int field10585;

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
    public static int field10586;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "I")
    public static int field10588;

    @OriginalMember(owner = "client!lo", name = "u", descriptor = "I")
    public static int field10589;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "Lvd;")
    public static class39 field10584;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)I", line = 4)
    public final int method4217(int arg0) {
        ++field10578;
        return arg0 != 17503 ? 36 : super.field4320;
    }

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "(B)V", line = 18)
    public static void method4218(byte arg0) {
        field10577 = null;
        field10584 = null;
        if (arg0 != -114) {
            field10577 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(II)V", line = 29)
    public final void method303(int arg0, int arg1) {
        ++field10585;
        super.field4320 = arg1;
        if (arg0 != -27751) {
            field10587 = -52;
        }
    }

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "(B)I", line = 43)
    public static final int method4219(byte arg0) {
        if (arg0 != 8) {
            field10587 = -89;
        }
        ++field10583;
        if (class183.field2801 != null) {
            return 3;
        } else {
            return !class127.field1684 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(II)I", line = 58)
    public final int method306(int arg0, int arg1) {
        if (arg0 != 31401) {
            return -34;
        } else {
            ++field10588;
            return super.field4323.method4110(-22215) ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZIIII)V", line = 76)
    public static final void method4220(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field10582;
        if (arg0 || class352.field5126 != arg2 || class499.field7093 != arg3 || class700.field9654 != class341.field4946 && ~class63.field916.field10204.method368(17503) != -2) {
            class499.field7093 = arg3;
            class352.field5126 = arg2;
            if (arg1 == -26510) {
                class700.field9654 = class341.field4946;
                if (class63.field916.field10204.method368(17503) == 1) {
                    class700.field9654 = 0;
                }
                class49.method363(arg4, -6);
                class310.method1960(true, class430.field6382.method2679(class650.field9160, arg1 ^ 26600), class55.field764, class358.field5201, (byte) -124, class736.field10316);
                int var5 = class361.field5224;
                class361.field5224 = (class352.field5126 - (class194.field2946 >> 4)) * 8;
                int var6 = class582.field8288;
                class582.field8288 = (-(class255.field3656 >> 4) + class499.field7093) * 8;
                class194.field2944 = class84.method681(class352.field5126 * 8, class499.field7093 * 8);
                class567.field8057 = null;
                int var7 = -var5 + class361.field5224;
                int var8 = -var6 + class582.field8288;
                if (~arg4 != -12) {
                    boolean var9 = false;
                    class441.field6552 = 0;
                    int var10 = class194.field2946 * 512 + -512;
                    int var11 = class255.field3656 * 512 - 512;
                    for (int var12 = 0; ~var12 > ~class567.field8058; ++var12) {
                        class432 var13 = class488.field6985[var12];
                        if (var13 != null) {
                            class282 var14 = var13.field6439;
                            var14.field8428 -= var8 * 512;
                            var14.field8423 -= var7 * 512;
                            if (~var14.field8423 <= -1 && var10 >= var14.field8423 && var14.field8428 >= 0 && var14.field8428 <= var11) {
                                boolean var15 = true;
                                for (int var16 = 0; var16 < 10; ++var16) {
                                    var14.field6133[var16] -= var7;
                                    var14.field6139[var16] -= var8;
                                    if (~var14.field6133[var16] > -1 || class194.field2946 <= var14.field6133[var16] || var14.field6139[var16] < 0 || ~var14.field6139[var16] <= ~class255.field3656) {
                                        var15 = false;
                                    }
                                }
                                if (var15) {
                                    class338.field4921[class441.field6552++] = var14.field6118;
                                } else {
                                    var14.method1806(-9430, (class348) null);
                                    var9 = true;
                                    var13.method1304((byte) 7);
                                }
                            } else {
                                var14.method1806(-9430, (class348) null);
                                var13.method1304((byte) 7);
                                var9 = true;
                            }
                        }
                    }
                    if (var9) {
                        class567.field8058 = class497.field7067.method2281(false);
                        class497.field7067.method2288(class488.field6985, (byte) -89);
                    }
                } else {
                    for (int var17 = 0; var17 < class567.field8058; ++var17) {
                        class432 var31 = class488.field6985[var17];
                        if (var31 != null) {
                            class282 var32 = var31.field6439;
                            for (int var33 = 0; ~var33 > -11; ++var33) {
                                var32.field6133[var33] -= var7;
                                var32.field6139[var33] -= var8;
                            }
                            var32.field8423 -= var7 * 512;
                            var32.field8428 -= var8 * 512;
                        }
                    }
                }
                for (int var18 = 0; ~var18 > -2049; ++var18) {
                    class689 var29 = class314.field4456[var18];
                    if (var29 != null) {
                        for (int var30 = 0; ~var30 > -11; ++var30) {
                            var29.field6133[var30] -= var7;
                            var29.field6139[var30] -= var8;
                        }
                        var29.field8428 -= var8 * 512;
                        var29.field8423 -= var7 * 512;
                    }
                }
                class635[] var19 = class554.field7904;
                for (int var20 = 0; var20 < var19.length; ++var20) {
                    class635 var28 = var19[var20];
                    if (var28 != null) {
                        var28.field8930 -= var8 * 512;
                        var28.field8923 -= var7 * 512;
                    }
                }
                for (class19 var21 = (class19) class153.field2445.method1195(arg1 + 26510); var21 != null; var21 = (class19) class153.field2445.method1201(2)) {
                    var21.field211 -= var8;
                    var21.field208 -= var7;
                    if (class9.field132 != 4 && (~var21.field208 > -1 || var21.field211 < 0 || class194.field2946 <= var21.field208 || var21.field211 >= class255.field3656)) {
                        var21.method1304((byte) 7);
                    }
                }
                for (class19 var22 = (class19) class606.field8555.method1195(arg1 + 26510); var22 != null; var22 = (class19) class606.field8555.method1201(2)) {
                    var22.field208 -= var7;
                    var22.field211 -= var8;
                    if (~class9.field132 != -5 && (~var22.field208 > -1 || var22.field211 < 0 || class194.field2946 <= var22.field208 || class255.field3656 <= var22.field211)) {
                        var22.method1304((byte) 7);
                    }
                }
                if (~class9.field132 != -5) {
                    for (class258 var23 = (class258) class12.field173.method2283(false); var23 != null; var23 = (class258) class12.field173.method2282((byte) 121)) {
                        int var24 = (int) (16383L & var23.field2810);
                        int var25 = var24 - class361.field5224;
                        int var26 = (int) (var23.field2810 >> 14 & 16383L);
                        int var27 = var26 - class582.field8288;
                        if (~var25 > -1 || ~var27 > -1 || ~class194.field2946 >= ~var25 || var27 >= class255.field3656) {
                            var23.method1304((byte) 7);
                        }
                    }
                }
                if (~class344.field4987 != -1) {
                    class445.field6615 -= var8;
                    class344.field4987 -= var7;
                }
                class345.method2184((byte) -120);
                if (arg4 != 11) {
                    class517.field7387 -= var7;
                    class396.field5946 -= var7;
                    class364.field5254 -= var7 * 512;
                    class460.field6783 -= var8 * 512;
                    class601.field8509 -= var8;
                    class726.field10139 -= var8;
                    if (~Math.abs(var7) < ~class194.field2946 || ~Math.abs(var8) < ~class255.field3656) {
                        class608.method3528(arg1 + 26511);
                    }
                } else if (~class264.field3784 == -5) {
                    class398.field5951 -= var8 * 512;
                    class383.field5783 -= var7 * 512;
                    class537.field7685 -= var8 * 512;
                    class189.field2869 -= var7 * 512;
                } else {
                    class67.field967 = -1;
                    class656.field9191 = -1;
                    class264.field3784 = 1;
                }
                class270.method1722(125);
                class85.method696(-1);
                class209.field3054.method1200(arg1 + 26574);
                class299.field4241.method1200(99);
                client.field4276.method1619((byte) -125);
                class69.method601(arg1 ^ -26601);
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(B)V", line = 352)
    public final void method308(byte arg0) {
        if (arg0 > -40) {
            this.method305((byte) 123);
        }
        ++field10589;
        if (super.field4323.method4110(-22215)) {
            super.field4320 = 2;
        }
        if (~super.field4320 > -1 || super.field4320 > 2) {
            super.field4320 = this.method305((byte) 68);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZLrg;)Ljv;", line = 374)
    public static final class80 method4221(boolean arg0, class645 arg1) {
        ++field10580;
        int var2 = arg1.method3712((byte) -110);
        class651 var3 = class43.method300(arg0)[arg1.method3745(-6314)];
        if (arg0) {
            method4220(true, -66, -57, 116, 10);
        }
        class713 var4 = class478.method2882(47)[arg1.method3745(-6314)];
        int var5 = arg1.method3756(65536);
        int var6 = arg1.method3756(65536);
        return new class80(var2, var3, var4, var5, var6);
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(ILhb;)V", line = 395)
    public class756(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)I", line = 399)
    public final int method305(byte arg0) {
        if (arg0 != 68) {
            method4221(false, (class645) null);
        }
        ++field10579;
        if (!super.field4323.method4110(arg0 + -22283)) {
            return super.field4323.field10200.method3847(arg0 ^ 16172) && class202.method1383((byte) -94, super.field4323.field10200.method3848(17503)) ? 1 : 0;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lhb;)V", line = 421)
    public class756(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)Z", line = 424)
    public final boolean method4222(int arg0) {
        ++field10586;
        if (arg0 != 2) {
            field10587 = -14;
        }
        return !super.field4323.method4110(arg0 + -22217);
    }
}
