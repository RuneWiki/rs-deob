import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class8 extends class23 {

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    private int field90 = 0;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
    private int field93 = 4096;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
    private int field87 = 16;

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "I")
    private int field101 = 2000;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
    private int field89 = 0;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "Ldc;")
    public static class37 field91 = class185.method1233((byte) 86, "cross");

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "I")
    public static int field100 = 0;

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "Ldc;")
    private static class37 field94 = class185.method1233((byte) 86, "To create a new account you need to");

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
    public static int field98 = 0;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "Ldc;")
    public static class37 field88 = field94;

    @OriginalMember(owner = "client!ag", name = "gb", descriptor = "Ldc;")
    private static class37 field106 = class185.method1233((byte) 86, "Loaded config");

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
    public static int field95 = 127;

    @OriginalMember(owner = "client!ag", name = "eb", descriptor = "Ldc;")
    public static class37 field104 = field106;

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "Ldc;")
    public static class37 field96 = class185.method1233((byte) 86, "sl_flags");

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "Ldc;")
    public static class37 field92 = class185.method1233((byte) 86, "mapfunction");

    @OriginalMember(owner = "client!ag", name = "hb", descriptor = "[Lld;")
    public static class123[] field107 = new class123[2048];

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!ag", name = "db", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!ag", name = "fb", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ag", name = "ib", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ag", name = "jb", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "Lda;")
    public static class35 field86;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)V")
    public final void method53(int arg0) {
        class74.method521(2);
        if (arg0 != -21746) {
            this.method57(77, 126);
        }
        ++field109;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIBII)V")
    public static final void method54(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 != 37) {
            field100 = -103;
        }
        if (~class66.field1191 == -1 && !class30.field600) {
            ++class167.field3192;
            int var7 = class105.field1827;
            int var8 = class52.field1043;
            int var9 = class228.field4195;
            int var10 = class41.field857;
            int var11 = (-arg3 + arg2) * (-var7 + var8) / arg5 - -var7;
            int var12 = (var10 - var9) * (-arg0 + arg6) / arg1 + var9;
            class200.method1328(0L, (short) 5, var11, class243.field4462, 500, class41.field856, var12);
        }
        ++field97;
        long var13 = -1L;
        for (int var15 = 0; ~class153.field2888 < ~var15; ++var15) {
            long var16 = class23.field400[var15];
            int var18 = 127 & (int) var16;
            int var19 = (16341 & (int) var16) >> 7;
            int var20 = Integer.MAX_VALUE & (int) (var16 >>> 32);
            int var21 = (int) var16 >> 29 & 3;
            if (~var13 != ~var16) {
                var13 = var16;
                if (var21 == 2 && class61.method458(class125.field2246, var18, var19, var16)) {
                    class30 var22 = class73.method519(var20, -21035);
                    if (var22.field554 != null) {
                        var22 = var22.method256(176743434);
                    }
                    if (var22 == null) {
                        continue;
                    }
                    if (~class66.field1191 == -2) {
                        class200.method1328(var16, (short) 14, var18, class80.method548(new class37[] { class223.field4142, class82.field1460, var22.field605 }, -121), 500, class206.field3841, var19);
                        ++class28.field491;
                    } else if (class30.field600) {
                        if (~(4 & class24.field418) == -5) {
                            class200.method1328(var16, (short) 42, var18, class80.method548(new class37[] { class12.field170, class82.field1460, var22.field605 }, -112), arg4 + 463, class109.field1899, var19);
                            ++class135.field2501;
                        }
                    } else {
                        ++client.field666;
                        class37[] var23 = var22.field608;
                        if (class34.field696) {
                            var23 = class195.method1299(arg4 + 30076, var23);
                        }
                        if (var23 != null) {
                            for (int var24 = 4; var24 >= 0; --var24) {
                                if (var23[var24] != null) {
                                    short var25 = 0;
                                    ++class5.field51;
                                    if (var24 == 0) {
                                        var25 = 29;
                                    }
                                    if (var24 == 1) {
                                        var25 = 39;
                                    }
                                    if (var24 == 2) {
                                        var25 = 37;
                                    }
                                    if (~var24 == -4) {
                                        var25 = 10;
                                    }
                                    if (~var24 == -5) {
                                        var25 = 1001;
                                    }
                                    class200.method1328(var16, var25, var18, class80.method548(new class37[] { class137.field2676, var22.field605 }, -60), 500, var23[var24], var19);
                                }
                            }
                        }
                        class200.method1328((long) var22.field599, (short) 1005, var18, class80.method548(new class37[] { class137.field2676, var22.field605 }, -18), arg4 + 463, class156.field2974, var19);
                    }
                }
                if (~var21 == -2) {
                    class66 var26 = class70.field1262[var20];
                    if (~var26.field1190.field3851 == -2 && (127 & var26.field3505) == 64 && (var26.field3490 & 127) == 64) {
                        for (int var27 = 0; ~class95.field1669 < ~var27; ++var27) {
                            class66 var30 = class70.field1262[class92.field1579[var27]];
                            if (var30 != null && var26 != var30 && ~var30.field1190.field3851 == -2 && var26.field3505 == var30.field3505 && var26.field3490 == var30.field3490) {
                                method55(var18, var19, var30.field1190, true, class92.field1579[var27]);
                            }
                        }
                        for (int var28 = 0; ~class76.field1342 < ~var28; ++var28) {
                            class123 var29 = field107[class9.field122[var28]];
                            if (var29 != null && ~var26.field3505 == ~var29.field3505 && ~var26.field3490 == ~var29.field3490) {
                                class72.method511(var19, var18, class9.field122[var28], (byte) 123, var29);
                            }
                        }
                    }
                    method55(var18, var19, var26.field1190, true, var20);
                }
                if (var21 == 0) {
                    class123 var31 = field107[var20];
                    if ((127 & var31.field3505) == 64 && (var31.field3490 & 127) == 64) {
                        for (int var32 = 0; class95.field1669 > var32; ++var32) {
                            class66 var35 = class70.field1262[class92.field1579[var32]];
                            if (var35 != null && ~var35.field1190.field3851 == -2 && var31.field3505 == var35.field3505 && ~var31.field3490 == ~var35.field3490) {
                                method55(var18, var19, var35.field1190, true, class92.field1579[var32]);
                            }
                        }
                        for (int var33 = 0; ~class76.field1342 < ~var33; ++var33) {
                            class123 var34 = field107[class9.field122[var33]];
                            if (var34 != null && var31 != var34 && ~var31.field3505 == ~var34.field3505 && ~var31.field3490 == ~var34.field3490) {
                                class72.method511(var19, var18, class9.field122[var33], (byte) -119, var34);
                            }
                        }
                    }
                    class72.method511(var19, var18, var20, (byte) 119, var31);
                }
                if (var21 == 3) {
                    class203 var36 = class183.field3389[class125.field2246][var18][var19];
                    if (var36 != null) {
                        for (class6 var37 = (class6) var36.method1341(arg4 ^ 85); var37 != null; var37 = (class6) var36.method1339((byte) 121)) {
                            int var38 = var37.field66.field1295;
                            class125 var39 = class223.method1471(124, var38);
                            if (class66.field1191 == 1) {
                                class200.method1328((long) var38, (short) 43, var18, class80.method548(new class37[] { class223.field4142, class35.field702, var39.field2232 }, arg4 ^ -60), 500, class206.field3841, var19);
                                ++class120.field2147;
                            } else if (class30.field600) {
                                if (~(1 & class24.field418) == -2) {
                                    ++class109.field1892;
                                    class200.method1328((long) var38, (short) 35, var18, class80.method548(new class37[] { class12.field170, class35.field702, var39.field2232 }, arg4 + -100), arg4 ^ 465, class109.field1899, var19);
                                }
                            } else {
                                ++class50.field999;
                                class37[] var40 = var39.field2275;
                                if (class34.field696) {
                                    var40 = class195.method1299(30113, var40);
                                }
                                for (int var41 = 4; ~var41 <= -1; --var41) {
                                    if (var40 != null && var40[var41] != null) {
                                        ++class190.field3467;
                                        byte var42 = 0;
                                        if (var41 == 0) {
                                            var42 = 17;
                                        }
                                        if (var41 == 1) {
                                            var42 = 12;
                                        }
                                        if (~var41 == -3) {
                                            var42 = 46;
                                        }
                                        if (var41 == 3) {
                                            var42 = 34;
                                        }
                                        if (var41 == 4) {
                                            var42 = 33;
                                        }
                                        class200.method1328((long) var38, var42, var18, class80.method548(new class37[] { class196.field3668, var39.field2232 }, -107), 500, var40[var41], var19);
                                    } else if (var41 == 2) {
                                        class200.method1328((long) var38, (short) 46, var18, class80.method548(new class37[] { class196.field3668, var39.field2232 }, -91), arg4 + 463, class39.field814, var19);
                                        ++class151.field2863;
                                    }
                                }
                                class200.method1328((long) var38, (short) 1003, var18, class80.method548(new class37[] { class196.field3668, var39.field2232 }, -84), 500, class156.field2974, var19);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILsj;ZI)V")
    private static final void method55(int arg0, int arg1, class206 arg2, boolean arg3, int arg4) {
        ++field105;
        if (!arg3) {
            method55(116, 51, (class206) null, false, -125);
        }
        if (~class97.field1701 > -401) {
            if (arg2.field3831 != null) {
                arg2 = arg2.method1356(674);
            }
            if (arg2 != null) {
                if (arg2.field3847) {
                    class37 var5 = arg2.field3863;
                    if (arg2.field3844 != 0) {
                        var5 = class80.method548(new class37[] { var5, class5.method41(class238.field4382.field2181, (byte) -15, arg2.field3844), class212.field3961, class131.field2444, class151.method1034((byte) -9, arg2.field3844), class75.field1323 }, -95);
                    }
                    if (~class66.field1191 != -2) {
                        if (!class30.field600) {
                            ++class152.field2878;
                            class37[] var6 = arg2.field3860;
                            if (class34.field696) {
                                var6 = class195.method1299(30113, var6);
                            }
                            if (var6 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (var6[var7] != null && (class192.field3592 != 0 || !var6[var7].method303(class70.field1266, 40))) {
                                        byte var8 = 0;
                                        ++class127.field2349;
                                        if (~var7 == -1) {
                                            var8 = 58;
                                        }
                                        if (var7 == 1) {
                                            var8 = 45;
                                        }
                                        if (var7 == 2) {
                                            var8 = 31;
                                        }
                                        if (~var7 == -4) {
                                            var8 = 1;
                                        }
                                        if (~var7 == -5) {
                                            var8 = 48;
                                        }
                                        class200.method1328((long) arg4, var8, arg0, class80.method548(new class37[] { class49.field968, var5 }, -120), 500, var6[var7], arg1);
                                    }
                                }
                            }
                            if (class192.field3592 == 0 && var6 != null) {
                                for (int var9 = 4; ~var9 <= -1; --var9) {
                                    if (var6[var9] != null && var6[var9].method303(class70.field1266, 40)) {
                                        ++class49.field963;
                                        short var10 = 0;
                                        short var11 = 0;
                                        if (~var9 == -1) {
                                            var11 = 58;
                                        }
                                        if (~class238.field4382.field2181 > ~arg2.field3844) {
                                            var10 = 2000;
                                        }
                                        if (var9 == 1) {
                                            var11 = 45;
                                        }
                                        if (~var9 == -3) {
                                            var11 = 31;
                                        }
                                        if (~var9 == -4) {
                                            var11 = 1;
                                        }
                                        if (~var9 == -5) {
                                            var11 = 48;
                                        }
                                        if (var11 != 0) {
                                            var11 += var10;
                                        }
                                        class200.method1328((long) arg4, var11, arg0, class80.method548(new class37[] { class49.field968, var5 }, -95), 500, var6[var9], arg1);
                                    }
                                }
                            }
                            class200.method1328((long) arg4, (short) 1004, arg0, class80.method548(new class37[] { class49.field968, var5 }, -75), 500, class156.field2974, arg1);
                            return;
                        }
                        if ((class24.field418 & 2) == 2) {
                            ++class109.field1901;
                            class200.method1328((long) arg4, (short) 21, arg0, class80.method548(new class37[] { class12.field170, class129.field2432, var5 }, -119), 500, class109.field1899, arg1);
                            return;
                        }
                    } else {
                        ++class41.field840;
                        class200.method1328((long) arg4, (short) 32, arg0, class80.method548(new class37[] { class223.field4142, class129.field2432, var5 }, -107), 500, class206.field3841, arg1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I[BIB)Z")
    public static final boolean method56(int arg0, byte[] arg1, int arg2, byte arg3) {
        int var4 = 75 / ((64 - arg3) / 40);
        boolean var5 = true;
        class28 var6 = new class28(arg1);
        ++field108;
        int var7 = -1;
        label56: while (true) {
            int var8 = var6.method201((byte) -120);
            if (~var8 == -1) {
                return var5;
            }
            var7 += var8;
            int var9 = 0;
            boolean var10 = false;
            while (true) {
                while (!var10) {
                    int var12 = var6.method186((byte) 112);
                    if (~var12 == -1) {
                        continue label56;
                    }
                    var9 += var12 - 1;
                    int var13 = var6.method215(-1797813752) >> 2;
                    int var14 = (4087 & var9) >> 6;
                    int var15 = arg2 + var14;
                    int var16 = var9 & 63;
                    int var17 = arg0 + var16;
                    if (var15 > 0 && ~var17 < -1 && ~var15 > -104 && var17 < 103) {
                        class30 var18 = class73.method519(var7, -21035);
                        if (var13 != 22 || !class16.field259 || ~var18.field601 != -1 || var18.field614 == 1 || var18.field593) {
                            if (!var18.method252(10286)) {
                                var5 = false;
                                ++class61.field1123;
                            }
                            var10 = true;
                        }
                    }
                }
                int var11 = var6.method186((byte) 108);
                if (~var11 == -1) {
                    break;
                }
                var6.method215(-1797813752);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        ++field103;
        int[] var3 = super.field405.method1461(arg1, (byte) -113);
        if (arg0 != 0) {
            return null;
        } else {
            if (super.field405.field4114) {
                int var4 = this.field93 >> 1;
                int[][] var5 = super.field405.method1460((byte) -98);
                Random var6 = new Random((long) this.field89);
                for (int var7 = 0; this.field101 > var7; ++var7) {
                    int var8 = this.field93 > 0 ? this.field90 - (var4 + -class97.method646(arg0 ^ 12402, var6, this.field93)) : this.field90;
                    int var9 = class97.method646(12402, var6, class199.field3705);
                    int var10 = (4088 & var8) >> 4;
                    int var11 = class97.method646(12402, var6, class235.field4276);
                    int var12 = var9 - -(class120.field2144[var10] * this.field87 >> 12);
                    int var13 = (class107.field1874[var10] * this.field87 >> 12) + var11;
                    int var14 = -var9 + var12;
                    int var15 = -var11 + var13;
                    if (var14 != 0 || ~var15 != -1) {
                        if (~var14 > -1) {
                            var14 = -var14;
                        }
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        boolean var16 = var14 < var15;
                        if (var16) {
                            int var17 = var9;
                            int var18 = var12;
                            var9 = var11;
                            var12 = var13;
                            var13 = var18;
                            var11 = var17;
                        }
                        if (var9 > var12) {
                            int var19 = var9;
                            var9 = var12;
                            int var20 = var11;
                            var11 = var13;
                            var12 = var19;
                            var13 = var20;
                        }
                        int var21 = -var11 + var13;
                        int var22 = var12 - var9;
                        if (var21 < 0) {
                            var21 = -var21;
                        }
                        int var23 = var11;
                        int var24 = 1024 - (class97.method646(arg0 ^ 12402, var6, 4096) >> 2);
                        int var25 = -var22 / 2;
                        int var26 = 2048 / var22;
                        int var27 = var13 <= var11 ? -1 : 1;
                        for (int var28 = var9; ~var28 > ~var12; ++var28) {
                            int var29 = (-var9 + var28) * var26 + var24 + 1024;
                            int var30 = var23 & class5.field44;
                            var25 += var21;
                            int var31 = var28 & class215.field4008;
                            if (var25 > 0) {
                                var25 += -var22;
                                var23 += var27;
                            }
                            if (!var16) {
                                var5[var31][var30] = var29;
                            } else {
                                var5[var30][var31] = var29;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(JB)V")
    public static final void method58(long arg0, byte arg1) {
        ++field102;
        if (arg0 != 0L) {
            for (int var3 = 0; var3 < class104.field1808; ++var3) {
                if (~class147.field2795[var3] == ~arg0) {
                    ++class197.field3684;
                    --class104.field1808;
                    for (int var4 = var3; ~var4 > ~class104.field1808; ++var4) {
                        class80.field1420[var4] = class80.field1420[var4 + 1];
                        class162.field3069[var4] = class162.field3069[var4 + 1];
                        class204.field3784[var4] = class204.field3784[var4 + 1];
                        class147.field2795[var4] = class147.field2795[var4 + 1];
                        class26.field455[var4] = class26.field455[var4 + 1];
                        class237.field4311[var4] = class237.field4311[var4 + 1];
                    }
                    class168.field3197 = class112.field1963;
                    class49.field970.method1503(47, 2976);
                    class49.field970.method190(arg0, (byte) -108);
                    break;
                }
            }
            if (arg1 >= -37) {
                field104 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)V")
    public static void method59(byte arg0) {
        field86 = null;
        if (arg0 != 2) {
            method55(-15, 51, (class206) null, true, 42);
        }
        field88 = null;
        field107 = null;
        field106 = null;
        field96 = null;
        field92 = null;
        field104 = null;
        field91 = null;
        field94 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (arg2 != 1000) {
            field91 = null;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            this.field93 = arg0.method230((byte) -104);
                        }
                    } else {
                        this.field90 = arg0.method230((byte) -108);
                    }
                } else {
                    this.field87 = arg0.method215(-1797813752);
                }
            } else {
                this.field101 = arg0.method230((byte) -115);
            }
        } else {
            this.field89 = arg0.method215(-1797813752);
        }
        ++field99;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class8() {
        super(0, true);
    }
}
