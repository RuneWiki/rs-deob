import java.math.BigInteger;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class73 extends class117 {

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
    private int field1364 = 409;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
    private int field1365 = 0;

    @OriginalMember(owner = "client!ck", name = "bb", descriptor = "I")
    private int field1371 = 0;

    @OriginalMember(owner = "client!ck", name = "hb", descriptor = "I")
    private int field1377 = 1024;

    @OriginalMember(owner = "client!ck", name = "Z", descriptor = "I")
    private int field1369 = 1024;

    @OriginalMember(owner = "client!ck", name = "fb", descriptor = "I")
    private int field1375 = 819;

    @OriginalMember(owner = "client!ck", name = "jb", descriptor = "I")
    private int field1379 = 1024;

    @OriginalMember(owner = "client!ck", name = "ib", descriptor = "I")
    private int field1378 = 1024;

    @OriginalMember(owner = "client!ck", name = "mb", descriptor = "I")
    private int field1382 = 2048;

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "Z")
    public static boolean field1368 = true;

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1366 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ck", name = "kb", descriptor = "I")
    public static int field1380 = 0;

    @OriginalMember(owner = "client!ck", name = "pb", descriptor = "B")
    public static byte field1385 = 0;

    @OriginalMember(owner = "client!ck", name = "qb", descriptor = "Lhh;")
    private static class163 field1386 = class137.method1065("You can(Wt add yourself to your own friend list)3", 17);

    @OriginalMember(owner = "client!ck", name = "nb", descriptor = "Lhh;")
    public static class163 field1383 = field1386;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!ck", name = "ab", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!ck", name = "cb", descriptor = "I")
    private int field1372;

    @OriginalMember(owner = "client!ck", name = "db", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!ck", name = "eb", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!ck", name = "gb", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!ck", name = "lb", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!ck", name = "ob", descriptor = "[Lhk;")
    public static class105[] field1384;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II[[IIIILjava/util/Random;)V")
    private final void method536(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, Random arg6) {
        ++field1374;
        int var8 = ~this.field1377 < -1 ? -class127.method1012(this.field1377, arg6, -22067) + 4096 : 4096;
        int var9 = this.field1379 * this.field1372 >> 12;
        int var10 = this.field1372 - (var9 <= 0 ? 0 : class127.method1012(var9, arg6, -22067));
        if (arg3 != 1) {
            this.field1364 = -107;
        }
        if (~class143.field2702 >= ~arg1) {
            arg1 -= class143.field2702;
        }
        if (~var10 < -1) {
            if (~arg5 < -1 && ~arg0 < -1) {
                int var11 = arg0 / 2;
                int var12 = ~var10 >= ~var11 ? var10 : var11;
                int var13 = arg5 / 2;
                int var14 = var13 >= var10 ? var10 : var13;
                int var15 = arg1 + var12;
                int var16 = arg0 - var12 * 2;
                for (int var17 = 0; ~arg5 < ~var17; ++var17) {
                    int[] var18 = arg2[arg4 + var17];
                    if (var14 > var17) {
                        int var19 = var8 * var17 / var14;
                        if (this.field1365 == 0) {
                            for (int var20 = 0; ~var20 > ~var12; ++var20) {
                                int var21 = var8 * var20 / var12;
                                var18[class7.method50(arg1 + var20, class54.field884)] = var18[class7.method50(class54.field884, arg1 - 1 + arg0 + -var20)] = var19 * var21 >> 12;
                            }
                        } else {
                            for (int var22 = 0; var12 > var22; ++var22) {
                                int var24 = var8 * var22 / var12;
                                var18[class7.method50(arg1 + var22, class54.field884)] = var18[class7.method50(class54.field884, arg0 + arg1 + -1 + -var22)] = var19 <= var24 ? var19 : var24;
                            }
                        }
                        if (~(var15 + var16) < ~class143.field2702) {
                            int var23 = class143.field2702 - var15;
                            class241.method1665(var18, var15, var23, var19);
                            class241.method1665(var18, 0, -var23 + var16, var19);
                        } else {
                            class241.method1665(var18, var15, var16, var19);
                        }
                    } else {
                        int var25 = arg5 - var17 + -1;
                        if (var14 > var25) {
                            int var26 = var8 * var25 / var14;
                            if (this.field1365 != 0) {
                                for (int var27 = 0; var12 > var27; ++var27) {
                                    int var28 = var8 * var27 / var12;
                                    var18[class7.method50(class54.field884, arg1 + var27)] = var18[class7.method50(class54.field884, arg1 - 1 + -var27 + arg0)] = var26 > var28 ? var28 : var26;
                                }
                            } else {
                                for (int var29 = 0; var29 < var12; ++var29) {
                                    int var31 = var8 * var29 / var12;
                                    var18[class7.method50(class54.field884, arg1 + var29)] = var18[class7.method50(class54.field884, arg1 - -arg0 + -var29 + -1)] = var26 * var31 >> 12;
                                }
                            }
                            if (~class143.field2702 > ~(var15 - -var16)) {
                                int var30 = class143.field2702 - var15;
                                class241.method1665(var18, var15, var30, var26);
                                class241.method1665(var18, 0, -var30 + var16, var26);
                            } else {
                                class241.method1665(var18, var15, var16, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var12 < ~var32; ++var32) {
                                var18[class7.method50(arg1 + var32, class54.field884)] = var18[class7.method50(arg1 - -arg0 + -var32 + -1, class54.field884)] = var8 * var32 / var12;
                            }
                            if (~(var15 - -var16) >= ~class143.field2702) {
                                class241.method1665(var18, var15, var16, var8);
                            } else {
                                int var33 = class143.field2702 - var15;
                                class241.method1665(var18, var15, var33, var8);
                                class241.method1665(var18, 0, var16 - var33, var8);
                            }
                        }
                    }
                }
            }
        } else if (class143.field2702 < arg1 - -arg0) {
            int var34 = -arg1 + class143.field2702;
            for (int var35 = 0; var35 < arg5; ++var35) {
                int[] var36 = arg2[arg4 - -var35];
                class241.method1665(var36, arg1, var34, var8);
                class241.method1665(var36, 0, -var34 + arg0, var8);
            }
        } else {
            for (int var37 = 0; ~arg5 < ~var37; ++var37) {
                class241.method1665(arg2[arg4 + var37], arg1, arg0, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    if (arg1 != 7) {
                                        if (arg1 == 8) {
                                            this.field1377 = arg2.method658(96);
                                        }
                                    } else {
                                        this.field1379 = arg2.method658(arg0 + 119);
                                    }
                                } else {
                                    this.field1365 = arg2.method622(true);
                                }
                            } else {
                                this.field1369 = arg2.method658(70);
                            }
                        } else {
                            this.field1375 = arg2.method658(77);
                        }
                    } else {
                        this.field1364 = arg2.method658(67);
                    }
                } else {
                    this.field1382 = arg2.method658(111);
                }
            } else {
                this.field1378 = arg2.method658(64);
            }
        } else {
            this.field1371 = arg2.method622(true);
        }
        if (arg0 != 0) {
            field1366 = null;
        }
        ++field1370;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        int[] var3 = super.field2218.method1044(arg1, 0);
        ++field1373;
        if (super.field2218.field2587) {
            int[][] var4 = super.field2218.method1046(true);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            boolean var13 = true;
            int var14 = class143.field2702 * this.field1378 >> 12;
            int var15 = class143.field2702 * this.field1382 >> 12;
            int var16 = class1.field26 * this.field1364 >> 12;
            int var17 = class1.field26 * this.field1375 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            } else {
                this.field1372 = class143.field2702 / 8 * this.field1369 >> 12;
                int var18 = class143.field2702 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field1371);
                while (true) {
                    while (true) {
                        int var22 = class127.method1012(-var14 + var15, var21, -22067) + var14;
                        int var23 = class127.method1012(var17 - var16, var21, arg0 + -674) + var16;
                        int var24 = var8 + var22;
                        if (~var24 < ~class143.field2702) {
                            var22 = -var8 + class143.field2702;
                            var24 = class143.field2702;
                        }
                        int var10000;
                        int var25;
                        if (var13) {
                            var25 = 0;
                        } else {
                            int var26 = var10;
                            int var27 = var5 + var24;
                            if (~var27 > -1) {
                                var27 += class143.field2702;
                            }
                            int[] var28 = var20[var10];
                            int var29 = 0;
                            if (~class143.field2702 > ~var27) {
                                var27 -= class143.field2702;
                            }
                            var25 = var28[2];
                            while (true) {
                                int[] var30 = var20[var26];
                                if (var27 >= var30[0] && var27 <= var30[1]) {
                                    if (var10 != var26) {
                                        int var31 = var8 - -var5;
                                        if (var31 < 0) {
                                            var31 += class143.field2702;
                                        }
                                        if (class143.field2702 < var31) {
                                            var31 -= class143.field2702;
                                        }
                                        for (int var32 = 1; ~var29 <= ~var32; ++var32) {
                                            int[] var40 = var20[(var10 + var32) % var11];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var29; ++var33) {
                                            int[] var34 = var20[(var10 + var33) % var11];
                                            int var35 = var34[2];
                                            if (~var25 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var27 <= var31) {
                                                    if (~var36 != -1) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class143.field2702;
                                                    } else {
                                                        var38 = 0;
                                                        var39 = Math.min(var27, var37);
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var27, var37);
                                                }
                                                this.method536(-var38 + var39, var38 - -var7, var4, 1, var35, -var35 + var25, var21);
                                            }
                                        }
                                    }
                                    var10 = var26;
                                    break;
                                }
                                var10000 = ~var11;
                                ++var26;
                                if (var10000 >= ~var26) {
                                    var26 = 0;
                                }
                                ++var29;
                            }
                        }
                        if (var23 + var25 > class1.field26) {
                            var23 = -var25 + class1.field26;
                        } else {
                            var9 = false;
                        }
                        if (~class143.field2702 != ~var24) {
                            int[] var41 = var19[var12++];
                            var41[1] = var24;
                            var41[2] = var23 + var25;
                            var41[0] = var8;
                            this.method536(var22, var6 + var8, var4, 1, var25, var23, var21);
                            var8 = var24;
                        } else {
                            this.method536(var22, var8 - -var6, var4, 1, var25, var23, var21);
                            if (var9) {
                                return arg0 != -21393 ? null : var3;
                            }
                            var9 = true;
                            var13 = false;
                            var10 = 0;
                            int[] var42 = var19[var12++];
                            var42[0] = var8;
                            var11 = var12;
                            var8 = 0;
                            var42[1] = var24;
                            int[][] var43 = var20;
                            var42[2] = var25 - -var23;
                            var7 = var6;
                            var6 = class127.method1012(class143.field2702, var21, arg0 ^ 1442);
                            var5 = -var7 + var6;
                            var20 = var19;
                            int var44 = var5;
                            if (~var5 > -1) {
                                var44 = class143.field2702 + var5;
                            }
                            if (var44 > class143.field2702) {
                                var44 -= class143.field2702;
                            }
                            var19 = var43;
                            var12 = 0;
                            while (true) {
                                int[] var45 = var20[var10];
                                if (var45[0] <= var44 && var44 <= var45[1]) {
                                    break;
                                }
                                var10000 = ~var11;
                                ++var10;
                                if (var10000 >= ~var10) {
                                    var10 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return arg0 != -21393 ? null : var3;
        }
    }

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "(I)V")
    public static void method537(int arg0) {
        field1383 = null;
        if (arg0 == 409) {
            field1386 = null;
            field1384 = null;
            field1366 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "(I)V")
    public static final void method538(int arg0) {
        for (int var1 = 0; ~class199.field3573 < ~var1; ++var1) {
            int var2 = class155.field2887[var1];
            class2 var3 = class111.field2098[var2];
            if (var3 != null) {
                class43.method329(-99, var3.field41.field3274, var3);
            }
        }
        if (arg0 != 1) {
            field1376 = 78;
        }
        ++field1363;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    public class73() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILpa;I)[Lhk;")
    public static final class105[] method539(int arg0, int arg1, class123 arg2, int arg3) {
        ++field1381;
        if (arg1 != -1) {
            field1384 = null;
        }
        return !class85.method677(arg0, arg2, 20888, arg3) ? null : class28.method176((byte) 90);
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(B)V")
    public final void method57(byte arg0) {
        ++field1367;
        if (arg0 >= -92) {
            this.method60(12, -81, (class81) null);
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(III)Lei;")
    public static final class159 method540(int arg0, int arg1, int arg2) {
        class144 var3 = class259.field4542[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class159 var4 = var3.field2731;
            var3.field2731 = null;
            return var4;
        }
    }
}
