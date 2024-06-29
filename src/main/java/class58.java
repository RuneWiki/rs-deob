import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class58 extends class37 {

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "I")
    private int field1439 = 1024;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
    private int field1441 = 0;

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "I")
    private int field1444 = 1024;

    @OriginalMember(owner = "client!fg", name = "gb", descriptor = "I")
    private int field1456 = 1024;

    @OriginalMember(owner = "client!fg", name = "eb", descriptor = "I")
    private int field1454 = 409;

    @OriginalMember(owner = "client!fg", name = "jb", descriptor = "I")
    private int field1459 = 2048;

    @OriginalMember(owner = "client!fg", name = "bb", descriptor = "I")
    private int field1451 = 1024;

    @OriginalMember(owner = "client!fg", name = "kb", descriptor = "I")
    private int field1460 = 0;

    @OriginalMember(owner = "client!fg", name = "X", descriptor = "I")
    private int field1447 = 819;

    @OriginalMember(owner = "client!fg", name = "Z", descriptor = "[Ldd;")
    public static class35[] field1449 = new class35[100];

    @OriginalMember(owner = "client!fg", name = "ab", descriptor = "Ldd;")
    private static class35 field1450 = class180.method1196((byte) 127, "Password: ");

    @OriginalMember(owner = "client!fg", name = "lb", descriptor = "Ldd;")
    public static class35 field1461 = class180.method1196((byte) 126, " loggt sich aus)3");

    @OriginalMember(owner = "client!fg", name = "nb", descriptor = "Ldd;")
    public static class35 field1463 = field1450;

    @OriginalMember(owner = "client!fg", name = "cb", descriptor = "Lld;")
    public static class111 field1452 = new class111(50);

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!fg", name = "W", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!fg", name = "Y", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!fg", name = "db", descriptor = "I")
    private int field1453;

    @OriginalMember(owner = "client!fg", name = "fb", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!fg", name = "hb", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!fg", name = "ib", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!fg", name = "mb", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!fg", name = "ob", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "Lag;")
    public static class8 field1445;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        ++field1446;
        if (super.field816.field3661) {
            int var4 = 0;
            int[][] var5 = super.field816.method1187(-14);
            int var6 = 0;
            int var7 = 0;
            boolean var8 = true;
            int var9 = 0;
            int var10 = 0;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class72.field1719 * this.field1439 >> 12;
            int var15 = class72.field1719 * this.field1459 >> 12;
            int var16 = class35.field782 * this.field1454 >> 12;
            int var17 = class35.field782 * this.field1447 >> 12;
            if (var17 <= 1) {
                return var5[arg1];
            }
            this.field1453 = class72.field1719 / 8 * this.field1456 >> 12;
            int var18 = class72.field1719 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field1460);
            label126: while (true) {
                while (true) {
                    int var22 = class183.method1218(1804454752, -var14 + var15, var21) + var14;
                    int var23 = var16 + class183.method1218(1804454752, -var16 + var17, var21);
                    int var24 = var6 + var22;
                    if (~class72.field1719 > ~var24) {
                        var24 = class72.field1719;
                        var22 = -var6 + class72.field1719;
                    }
                    int var27;
                    if (var11) {
                        var27 = 0;
                    } else {
                        int[] var25 = var19[var10];
                        int var26 = 0;
                        var27 = var25[2];
                        int var28 = var10;
                        int var29 = var24 - -var4;
                        if (~var29 > -1) {
                            var29 += class72.field1719;
                        }
                        if (~class72.field1719 > ~var29) {
                            var29 -= class72.field1719;
                        }
                        while (true) {
                            int[] var30 = var19[var28];
                            if (~var30[0] >= ~var29 && var29 <= var30[1]) {
                                if (var10 != var28) {
                                    int var31 = var6 - -var4;
                                    if (var31 < 0) {
                                        var31 += class72.field1719;
                                    }
                                    if (~var31 < ~class72.field1719) {
                                        var31 -= class72.field1719;
                                    }
                                    for (int var32 = 1; var26 >= var32; ++var32) {
                                        int[] var40 = var19[(var10 + var32) % var13];
                                        var27 = Math.max(var27, var40[2]);
                                    }
                                    for (int var33 = 0; ~var26 <= ~var33; ++var33) {
                                        int[] var34 = var19[(var10 - -var33) % var13];
                                        int var35 = var34[2];
                                        if (var27 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (var31 >= var29) {
                                                if (~var36 == -1) {
                                                    var38 = 0;
                                                    var39 = Math.min(var29, var37);
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class72.field1719;
                                                }
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var29, var37);
                                            }
                                            this.method504(-var38 + var39, var5, var21, -var35 + var27, var9 + var38, 0, var35);
                                        }
                                    }
                                }
                                var10 = var28;
                                break;
                            }
                            ++var28;
                            if (~var28 <= ~var13) {
                                var28 = 0;
                            }
                            ++var26;
                        }
                    }
                    if (~(var23 + var27) >= ~class35.field782) {
                        var8 = false;
                    } else {
                        var23 = class35.field782 - var27;
                    }
                    if (~class72.field1719 != ~var24) {
                        int[] var41 = var20[var12++];
                        var41[1] = var24;
                        var41[2] = var23 + var27;
                        var41[0] = var6;
                        this.method504(var22, var5, var21, var23, var6 + var7, 0, var27);
                        var6 = var24;
                    } else {
                        this.method504(var22, var5, var21, var23, var6 + var7, arg0 ^ 75, var27);
                        if (var8) {
                            break label126;
                        }
                        var11 = false;
                        var9 = var7;
                        var8 = true;
                        int[] var42 = var20[var12++];
                        var42[0] = var6;
                        var42[2] = var23 + var27;
                        var13 = var12;
                        var10 = 0;
                        var6 = 0;
                        var12 = 0;
                        var42[1] = var24;
                        int[][] var43 = var19;
                        var19 = var20;
                        var20 = var43;
                        var7 = class183.method1218(arg0 + 1804454677, class72.field1719, var21);
                        var4 = -var9 + var7;
                        int var44 = var4;
                        if (~var4 > -1) {
                            var44 = class72.field1719 + var4;
                        }
                        if (class72.field1719 < var44) {
                            var44 -= class72.field1719;
                        }
                        while (true) {
                            int[] var45 = var19[var10];
                            if (~var45[0] >= ~var44 && ~var45[1] <= ~var44) {
                                break;
                            }
                            ++var10;
                            if (var10 >= var13) {
                                var10 = 0;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 75) {
            method506(-54);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
    public final void method11(boolean arg0) {
        if (!arg0) {
            ++field1440;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[Lfd;)V")
    public static final void method503(int arg0, int arg1, class55[] arg2) {
        ++field1448;
        if (arg0 < -26) {
            for (int var3 = 0; arg2.length > var3; ++var3) {
                class55 var4 = arg2[var3];
                if (var4 != null) {
                    if (var4.field1355 == 0) {
                        if (var4.field1245 != null) {
                            method503(-123, arg1, var4.field1245);
                        }
                        class195 var5 = (class195) class22.field445.method796(true, (long) var4.field1383);
                        if (var5 != null) {
                            class82.method623(var5.field3884, arg1, (byte) -112);
                        }
                    }
                    if (arg1 == 0 && var4.field1308 != null) {
                        class200 var6 = new class200();
                        var6.field4010 = var4.field1308;
                        var6.field3995 = var4;
                        class1.method2(var6, (byte) -95);
                    }
                    if (arg1 == 1 && var4.field1282 != null) {
                        if (~var4.field1339 <= -1) {
                            class55 var7 = class131.method903(609074640, var4.field1383);
                            if (var7 == null || var7.field1245 == null || ~var4.field1339 <= ~var7.field1245.length || var7.field1245[var4.field1339] != var4) {
                                continue;
                            }
                        }
                        class200 var8 = new class200();
                        var8.field4010 = var4.field1282;
                        var8.field3995 = var4;
                        class1.method2(var8, (byte) -87);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[[ILjava/util/Random;IIII)V")
    private final void method504(int arg0, int[][] arg1, Random arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1443;
        int var8 = this.field1451 > 0 ? -class183.method1218(1804454752, this.field1451, arg2) + 4096 : 4096;
        int var9 = this.field1453 * this.field1444 >> 12;
        int var10 = this.field1453 + -(arg5 < var9 ? class183.method1218(1804454752, var9, arg2) : 0);
        if (~arg4 <= ~class72.field1719) {
            arg4 -= class72.field1719;
        }
        if (var10 <= 0) {
            if (~class72.field1719 <= ~(arg0 + arg4)) {
                for (int var11 = 0; ~arg3 < ~var11; ++var11) {
                    class156.method1047(arg1[arg6 + var11], arg4, arg0, var8);
                }
            } else {
                int var12 = class72.field1719 - arg4;
                for (int var13 = 0; var13 < arg3; ++var13) {
                    int[] var14 = arg1[arg6 + var13];
                    class156.method1047(var14, arg4, var12, var8);
                    class156.method1047(var14, 0, -var12 + arg0, var8);
                }
            }
        } else if (~arg3 < -1 && ~arg0 < -1) {
            int var15 = arg0 / 2;
            int var16 = arg3 / 2;
            int var17 = ~var15 > ~var10 ? var15 : var10;
            int var18 = var10 <= var16 ? var10 : var16;
            int var19 = arg4 + var17;
            int var20 = -(var17 * 2) + arg0;
            for (int var21 = 0; arg3 > var21; ++var21) {
                int[] var22 = arg1[var21 - -arg6];
                if (var18 > var21) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field1441 == -1) {
                        for (int var24 = 0; ~var24 > ~var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class208.method1372(arg4 + var24, class71.field1691)] = var22[class208.method1372(class71.field1691, arg0 + arg4 + -var24 + -1)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; var17 > var26; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class208.method1372(class71.field1691, arg4 + var26)] = var22[class208.method1372(-var26 + -1 + arg4 + arg0, class71.field1691)] = var23 <= var28 ? var23 : var28;
                        }
                    }
                    if (class72.field1719 < var19 - -var20) {
                        int var27 = -var19 + class72.field1719;
                        class156.method1047(var22, var19, var27, var23);
                        class156.method1047(var22, 0, -var27 + var20, var23);
                    } else {
                        class156.method1047(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = -var21 + arg3 - 1;
                    if (~var18 < ~var29) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field1441 == -1) {
                            for (int var31 = 0; ~var17 < ~var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class208.method1372(arg4 + var31, class71.field1691)] = var22[class208.method1372(arg0 + arg4 + -1 + -var31, class71.field1691)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; var33 < var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class208.method1372(arg4 + var33, class71.field1691)] = var22[class208.method1372(class71.field1691, -var33 + arg4 + arg0 + -1)] = ~var30 >= ~var35 ? var30 : var35;
                            }
                        }
                        if (~(var19 + var20) < ~class72.field1719) {
                            int var34 = -var19 + class72.field1719;
                            class156.method1047(var22, var19, var34, var30);
                            class156.method1047(var22, 0, -var34 + var20, var30);
                        } else {
                            class156.method1047(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; var36 < var17; ++var36) {
                            var22[class208.method1372(class71.field1691, arg4 + var36)] = var22[class208.method1372(class71.field1691, -var36 + arg4 - (-arg0 + 1))] = var8 * var36 / var17;
                        }
                        if (~class72.field1719 > ~(var19 - -var20)) {
                            int var37 = -var19 + class72.field1719;
                            class156.method1047(var22, var19, var37, var8);
                            class156.method1047(var22, 0, var20 - var37, var8);
                        } else {
                            class156.method1047(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class58() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lbg;Z)V")
    public static final void method505(class18 arg0, boolean arg1) {
        short var2 = 256;
        for (int var3 = 0; var3 < class82.field1902.length; ++var3) {
            class82.field1902[var3] = 0;
        }
        ++field1455;
        for (int var4 = 0; ~var4 > -5001; ++var4) {
            int var16 = (int) ((double) var2 * 128.0D * Math.random());
            class82.field1902[var16] = (int) (256.0D * Math.random());
        }
        if (!arg1) {
            for (int var5 = 0; var5 < 20; ++var5) {
                for (int var12 = 1; var12 < var2 + -1; ++var12) {
                    for (int var14 = 1; ~var14 > -128; ++var14) {
                        int var15 = (var12 << 7) + var14;
                        class40.field873[var15] = (class82.field1902[var15 - -1] + class82.field1902[var15 - 1] + class82.field1902[var15 + 128] - -class82.field1902[var15 + -128]) / 4;
                    }
                }
                int[] var13 = class82.field1902;
                class82.field1902 = class40.field873;
                class40.field873 = var13;
            }
            if (arg0 != null) {
                int var6 = 0;
                for (int var7 = 0; arg0.field356 > var7; ++var7) {
                    for (int var8 = 0; ~arg0.field358 < ~var8; ++var8) {
                        if (~arg0.field361[var6++] != -1) {
                            int var9 = arg0.field360 + var7 + 16;
                            int var10 = arg0.field354 + var8 - -16;
                            int var11 = (var9 << 7) + var10;
                            class82.field1902[var11] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)V")
    public static void method506(int arg0) {
        field1463 = null;
        field1450 = null;
        if (arg0 == 0) {
            field1445 = null;
            field1461 = null;
            field1452 = null;
            field1449 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        ++field1464;
        if (arg1 == 1) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (arg0 != 2) {
                        if (arg0 != 3) {
                            if (~arg0 != -5) {
                                if (arg0 != 5) {
                                    if (~arg0 != -7) {
                                        if (~arg0 != -8) {
                                            if (~arg0 == -9) {
                                                this.field1451 = arg2.method256((byte) -78);
                                            }
                                        } else {
                                            this.field1444 = arg2.method256((byte) -78);
                                        }
                                    } else {
                                        this.field1441 = arg2.method221(arg1 + -126);
                                    }
                                } else {
                                    this.field1456 = arg2.method256((byte) -78);
                                }
                            } else {
                                this.field1447 = arg2.method256((byte) -78);
                            }
                        } else {
                            this.field1454 = arg2.method256((byte) -78);
                        }
                    } else {
                        this.field1459 = arg2.method256((byte) -78);
                    }
                } else {
                    this.field1439 = arg2.method256((byte) -78);
                }
            } else {
                this.field1460 = arg2.method221(-120);
            }
        }
    }
}
