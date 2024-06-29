import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class255 implements class456 {

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "Lwk;")
    private class155 field3655 = new class155(128);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "[I")
    private int[] field3650 = new int[class31.field332.field5620];

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "[I")
    public int[] field3652 = new int[class31.field332.field5620];

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "Lch;")
    public static class151 field3657 = new class151("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
    public static int field3661 = 0;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "[I")
    public static int[] field3659 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "Lmb;")
    public static class262 field3658 = new class262();

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    public static int field3668 = 0;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "Lhq;")
    public static class30 field3669 = new class30("", 15);

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "Lap;")
    public static class310 field3670 = new class310(11, 7);

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "Ljava/lang/String;")
    public static String field3671 = null;

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "Lrc;")
    public static class108 field3672 = new class108(76, 14);

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
    public static void method1723(int arg0) {
        field3669 = null;
        field3671 = null;
        if (arg0 != 24057) {
            return;
        }
        field3659 = null;
        field3672 = null;
        field3670 = null;
        field3658 = null;
        field3657 = null;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(II)I")
    public final int method1724(int arg0, int arg1) {
        int var3 = 43 / ((61 - arg1) / 43);
        field3665++;
        class410 var4 = class97.field1365.method2329(128, arg0);
        int var5 = var4.field5612;
        int var6 = var4.field5613;
        int var7 = var4.field5610;
        int var8 = class13.field108[var7 - var6];
        return this.field3652[var5] >> var6 & var8;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZI)I")
    public final int method1725(boolean arg0, int arg1) {
        if (arg1 != 9928) {
            return 41;
        }
        field3662++;
        long var3 = class10.method51(-3183);
        for (class301 var5 = arg0 ? (class301) this.field3655.method1097(64) : (class301) this.field3655.method1105(false); var5 != null; var5 = (class301) this.field3655.method1105(false)) {
            if ((var5.field4263 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field4263 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field6382;
                    this.field3652[var6] = this.field3650[var6];
                    var5.method2714(-106);
                    return var6;
                }
                var5.method2714(arg1 ^ 0x26AD);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)V")
    public final void method1726(int arg0, int arg1, int arg2) {
        field3667++;
        class410 var4 = class97.field1365.method2329(arg1 ^ 0xFFFFFF7F, arg0);
        int var5 = var4.field5612;
        int var6 = var4.field5613;
        int var7 = var4.field5610;
        int var8 = class13.field108[var7 - var6];
        if (~arg2 > arg1 || var8 < arg2) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method1732(var9 & arg2 << var6 | this.field3652[var5] & ~var9, arg1, var5);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIZII)V")
    public static final void method1727(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3664++;
        for (class31 var5 = (class31) class428.field5975.method775(1); var5 != null; var5 = (class31) class428.field5975.method763(0)) {
            class155.method1102(arg3, arg1, arg4, var5, arg0, true);
        }
        for (class31 var6 = (class31) class357.field4928.method775(1); var6 != null; var6 = (class31) class357.field4928.method763(0)) {
            byte var11 = 1;
            class389 var12 = var6.field317.method2506(-16338);
            if (var6.field317.field5765) {
                var11 = 0;
            } else if (var6.field317.field5763 == var12.field5343 || var6.field317.field5763 == var12.field5348 || var6.field317.field5763 == var12.field5351 || var6.field317.field5763 == var12.field5352) {
                var11 = 2;
            } else if (var6.field317.field5763 == var12.field5361 || var6.field317.field5763 == var12.field5344 || var6.field317.field5763 == var12.field5336 || var6.field317.field5763 == var12.field5350) {
                var11 = 3;
            }
            if (var6.field320 != var11) {
                int var13 = class349.method2164(-15368, var6.field317);
                if (var6.field328 != var13) {
                    if (var6.field335 != null) {
                        class332.field4613.method2406(var6.field335);
                        var6.field335 = null;
                    }
                    var6.field328 = var13;
                }
                var6.field320 = var11;
            }
            var6.field322 = var6.field317.field4537;
            var6.field319 = var6.field317.field4537 + var6.field317.method245(4452) * 64;
            var6.field323 = var6.field317.field4530;
            var6.field327 = var6.field317.field4530 + (var6.field317.method245(4452) * 64);
            class155.method1102(arg3, arg1, arg4, var6, arg0, true);
        }
        if (arg2) {
            return;
        }
        for (class31 var7 = (class31) class218.field3152.method1097(64); var7 != null; var7 = (class31) class218.field3152.method1105(false)) {
            byte var8 = 1;
            class389 var9 = var7.field333.method2506(-16338);
            if (var7.field333.field5765) {
                var8 = 0;
            } else if (var7.field333.field5763 == var9.field5343 || var7.field333.field5763 == var9.field5348 || var7.field333.field5763 == var9.field5351 || var7.field333.field5763 == var9.field5352) {
                var8 = 2;
            } else if (var7.field333.field5763 == var9.field5361 || var7.field333.field5763 == var9.field5344 || var7.field333.field5763 == var9.field5336 || var7.field333.field5763 == var9.field5350) {
                var8 = 3;
            }
            if (var7.field320 != var8) {
                int var10 = class77.method677((byte) 65, var7.field333);
                if (var7.field328 != var10) {
                    if (var7.field335 != null) {
                        class332.field4613.method2406(var7.field335);
                        var7.field335 = null;
                    }
                    var7.field328 = var10;
                }
                var7.field320 = var8;
            }
            var7.field322 = var7.field333.field4537;
            var7.field319 = var7.field333.field4537 + var7.field333.method245(4452) * 64;
            var7.field323 = var7.field333.field4530;
            var7.field327 = var7.field333.field4530 + var7.field333.method245(4452) * 64;
            class155.method1102(arg3, arg1, arg4, var7, arg0, !arg2);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
    public final void method1728(byte arg0) {
        for (int var2 = 0; var2 < class31.field332.field5620; var2++) {
            class319 var3 = class31.field332.method2460((byte) 0, var2);
            if (var3 != null && var3.field4502 == 0) {
                this.field3650[var2] = 0;
                this.field3652[var2] = 0;
            }
        }
        if (arg0 != -15) {
            this.field3650 = null;
        }
        field3663++;
        this.field3655 = new class155(128);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)I")
    public final int method1729(int arg0, int arg1) {
        field3654++;
        int var3 = 96 % ((17 - arg0) / 45);
        return this.field3652[arg1];
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IBI)V")
    public final void method1730(int arg0, byte arg1, int arg2) {
        field3656++;
        this.field3650[arg0] = arg2;
        if (arg1 < 125) {
            this.method1728((byte) 13);
        }
        class301 var4 = (class301) this.field3655.method1104(-126, (long) arg0);
        if (var4 == null) {
            class301 var5 = new class301(4611686018427387905L);
            this.field3655.method1100(var5, -118, (long) arg0);
        } else if (var4.field4263 != 4611686018427387905L) {
            var4.field4263 = class10.method51(-3183) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BLvc;)V")
    public static final void method1731(byte arg0, class89 arg1) {
        field3660++;
        if (class38.field472.method768(false) == 0) {
            return;
        }
        if (class377.field5192 == 0) {
            for (class465 var4 = (class465) class38.field472.method775(1); var4 != null; var4 = (class465) class38.field472.method763(0)) {
                class373.field5128.method1646(var4.field6550 ? class262.field3781.field498 : null, arg1, class411.field5629, var4.field6555, arg1, var4.field6551, false, -1, var4.field6554, var4.field6552, false, var4.field6553);
                var4.method2714(83);
            }
            class125.method947(arg0 ^ 0x41);
        } else {
            if (class76.field1132 == null) {
                Canvas var2 = new Canvas();
                var2.setSize(36, 32);
                class76.field1132 = class89.method744(var2, class74.field1071, 0, 112, class436.field6206, 0);
                class202.field2988 = class76.field1132.method367(class297.method1924(-7962, class167.field2423, class294.field4150, 0), class355.method2189(class454.field6440, class167.field2423, 0), true);
            }
            for (class465 var3 = (class465) class38.field472.method775(arg0 + 2); var3 != null; var3 = (class465) class38.field472.method763(arg0 + 1)) {
                class373.field5128.method1646(var3.field6550 ? class262.field3781.field498 : null, arg1, class202.field2988, var3.field6555, class76.field1132, var3.field6551, false, -1, var3.field6554, var3.field6552, false, var3.field6553);
                var3.method2714(arg0 ^ 0xFFFFFFC2);
            }
        }
        if (arg0 != -1) {
            field3670 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(III)V")
    public final void method1732(int arg0, int arg1, int arg2) {
        field3653++;
        this.field3652[arg2] = arg0;
        if (arg1 != -1) {
            this.method1724(-5, 1);
        }
        class301 var4 = (class301) this.field3655.method1104(arg1 ^ 0x7D, (long) arg2);
        if (var4 == null) {
            class301 var5 = new class301(class10.method51(-3183) + 500L);
            this.field3655.method1100(var5, arg1 ^ 0xFFFFFFCF, (long) arg2);
        } else {
            var4.field4263 = class10.method51(arg1 ^ 0xC6E) + 500L;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIB)V")
    public final void method1733(int arg0, int arg1, byte arg2) {
        field3651++;
        class410 var4 = class97.field1365.method2329(128, arg0);
        int var5 = var4.field5612;
        if (arg2 != -22) {
            this.method1730(-92, (byte) 101, 43);
        }
        int var6 = var4.field5613;
        int var7 = var4.field5610;
        int var8 = class13.field108[var7 - var6];
        if (arg1 < 0 || var8 < arg1) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method1730(var5, (byte) 126, ~var9 & this.field3650[var5] | var9 & arg1 << var6);
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(II)[[[B")
    public static final byte[][][] method1734(int arg0, int arg1) {
        field3666++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var132 = 0; var132 < var3; var132++) {
                if (var132 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        var2[0][0] = var5;
        int var8 = 0;
        byte[] var9 = new byte[var3 * var4];
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var131 = 0; var131 < var4; var131++) {
                if (var131 <= var10) {
                    var9[var8] = -1;
                }
                var8++;
            }
        }
        var2[0][1] = var9;
        int var11 = 0;
        byte[] var12 = new byte[var3 * var4];
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var13 <= var130) {
                    var12[var11] = -1;
                }
                var11++;
            }
        }
        var2[0][2] = var12;
        int var14 = 0;
        byte[] var15 = new byte[var3 * var4];
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var129 >= var16) {
                    var15[var14] = -1;
                }
                var14++;
            }
        }
        var2[0][3] = var15;
        byte[] var17 = new byte[var3 * var4];
        int var18 = 0;
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var128 <= var19 >> 1) {
                    var17[var18] = -1;
                }
                var18++;
            }
        }
        var2[1][0] = var17;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var20 >= 0 && var21.length > var20) {
                    if (var127 >= (var22 << 1)) {
                        var21[var20] = -1;
                    }
                    var20++;
                } else {
                    var20++;
                }
            }
        }
        var2[1][1] = var21;
        byte[] var23 = new byte[var3 * var4];
        int var24 = 0;
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var126 <= var25 >> 1) {
                    var23[var24] = -1;
                }
                var24++;
            }
        }
        var2[1][2] = var23;
        int var26 = 0;
        byte[] var27 = new byte[var3 * var4];
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if ((var28 << 1) <= var125) {
                    var27[var26] = -1;
                }
                var26++;
            }
        }
        var2[1][3] = var27;
        byte[] var29 = new byte[var3 * var4];
        int var30 = 0;
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if (var124 <= var31 >> 1) {
                    var29[var30] = -1;
                }
                var30++;
            }
        }
        var2[2][0] = var29;
        byte[] var32 = new byte[var3 * var4];
        int var33 = 0;
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var123 >= var34 << 1) {
                    var32[var33] = -1;
                }
                var33++;
            }
        }
        var2[2][1] = var32;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if (var37 >> 1 >= var122) {
                    var35[var36] = -1;
                }
                var36++;
            }
        }
        var2[2][2] = var35;
        byte[] var38 = new byte[var3 * var4];
        int var39 = 0;
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if (var40 << 1 <= var121) {
                    var38[var39] = -1;
                }
                var39++;
            }
        }
        var2[2][arg1] = var38;
        int var41 = 0;
        byte[] var42 = new byte[var3 * var4];
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var43 >> 1 <= var120) {
                    var42[var41] = -1;
                }
                var41++;
            }
        }
        var2[3][0] = var42;
        byte[] var44 = new byte[var3 * var4];
        int var45 = 0;
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if (var119 <= (var46 << 1)) {
                    var44[var45] = -1;
                }
                var45++;
            }
        }
        var2[3][1] = var44;
        int var47 = 0;
        byte[] var48 = new byte[var3 * var4];
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var49 >> 1 <= var118) {
                    var48[var47] = -1;
                }
                var47++;
            }
        }
        var2[3][2] = var48;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if (var117 <= var52 << 1) {
                    var50[var51] = -1;
                }
                var51++;
            }
        }
        var2[3][3] = var50;
        int var53 = 0;
        byte[] var54 = new byte[var3 * var4];
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var116 = var3 - 1; var116 >= 0; var116--) {
                if (var116 >= (var55 >> 1)) {
                    var54[var53] = -1;
                }
                var53++;
            }
        }
        var2[4][0] = var54;
        int var56 = 0;
        byte[] var57 = new byte[var3 * var4];
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var115 <= (var58 << 1)) {
                    var57[var56] = -1;
                }
                var56++;
            }
        }
        var2[4][1] = var57;
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if (var61 >> 1 <= var114) {
                    var60[var59] = -1;
                }
                var59++;
            }
        }
        var2[4][2] = var60;
        byte[] var62 = new byte[var3 * var4];
        int var63 = 0;
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if (var113 <= var64 << 1) {
                    var62[var63] = -1;
                }
                var63++;
            }
        }
        var2[4][3] = var62;
        int var65 = 0;
        byte[] var66 = new byte[var3 * var4];
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if (var112 <= var3 / 2) {
                    var66[var65] = -1;
                }
                var65++;
            }
        }
        var2[5][0] = var66;
        byte[] var68 = new byte[var3 * var4];
        int var69 = 0;
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var70 <= (var4 / 2)) {
                    var68[var69] = -1;
                }
                var69++;
            }
        }
        var2[5][1] = var68;
        int var71 = 0;
        byte[] var72 = new byte[var3 * var4];
        for (int var73 = 0; var73 < var4; var73++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if (var110 >= (var3 / 2)) {
                    var72[var71] = -1;
                }
                var71++;
            }
        }
        var2[5][2] = var72;
        int var74 = 0;
        byte[] var75 = new byte[var3 * var4];
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var76 >= (var4 / 2)) {
                    var75[var74] = -1;
                }
                var74++;
            }
        }
        var2[5][3] = var75;
        byte[] var77 = new byte[var3 * var4];
        int var78 = 0;
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var108 = 0; var108 < var3; var108++) {
                if ((var79 - (var4 / 2)) >= var108) {
                    var77[var78] = -1;
                }
                var78++;
            }
        }
        var2[6][0] = var77;
        int var80 = 0;
        byte[] var81 = new byte[var3 * var4];
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if (var82 - (var4 / 2) >= var107) {
                    var81[var80] = -1;
                }
                var80++;
            }
        }
        var2[6][1] = var81;
        int var83 = 0;
        byte[] var84 = new byte[var3 * var4];
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var106 <= var85 - (var4 / 2)) {
                    var84[var83] = -1;
                }
                var83++;
            }
        }
        var2[6][2] = var84;
        byte[] var86 = new byte[var3 * var4];
        int var87 = 0;
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if (var105 <= var88 - var4 / 2) {
                    var86[var87] = -1;
                }
                var87++;
            }
        }
        var2[6][3] = var86;
        byte[] var89 = new byte[var3 * var4];
        int var90 = 0;
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if ((var91 - (var4 / 2)) <= var104) {
                    var89[var90] = -1;
                }
                var90++;
            }
        }
        var2[7][0] = var89;
        byte[] var92 = new byte[var3 * var4];
        int var93 = 0;
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if (var103 >= var94 - (var4 / 2)) {
                    var92[var93] = -1;
                }
                var93++;
            }
        }
        var2[7][1] = var92;
        byte[] var95 = new byte[var3 * var4];
        int var96 = 0;
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var102 >= (var97 - (var4 / 2))) {
                    var95[var96] = -1;
                }
                var96++;
            }
        }
        var2[7][2] = var95;
        int var98 = 0;
        byte[] var99 = new byte[var3 * var4];
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var101 >= var100 - var4 / 2) {
                    var99[var98] = -1;
                }
                var98++;
            }
        }
        var2[7][3] = var99;
        return var2;
    }
}
