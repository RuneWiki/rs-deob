import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class95 extends class476 {

    @OriginalMember(owner = "client!km", name = "k", descriptor = "Ljava/lang/String;")
    public String field1539;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public static int field1540 = 1;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IZ)[[[B", line = 5)
    public static final byte[][][] method770(int arg0, boolean arg1) {
        field1538++;
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
        byte[] var14 = new byte[var3 * var4];
        int var15 = 0;
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var129 >= var16) {
                    var14[var15] = -1;
                }
                var15++;
            }
        }
        var2[0][3] = var14;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var128 <= (var19 >> 1)) {
                    var18[var17] = -1;
                }
                var17++;
            }
        }
        var2[1][0] = var18;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var20 >= 0 && var21.length > var20) {
                    if (var127 >= var22 << 1) {
                        var21[var20] = -1;
                    }
                    var20++;
                } else {
                    var20++;
                }
            }
        }
        var2[1][1] = var21;
        int var23 = 0;
        byte[] var24 = new byte[var3 * var4];
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var126 <= (var25 >> 1)) {
                    var24[var23] = -1;
                }
                var23++;
            }
        }
        var2[1][2] = var24;
        byte[] var26 = new byte[var3 * var4];
        int var27 = 0;
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if ((var28 << 1) <= var125) {
                    var26[var27] = -1;
                }
                var27++;
            }
        }
        var2[1][3] = var26;
        int var29 = 0;
        byte[] var30 = new byte[var3 * var4];
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if ((var31 >> 1) >= var124) {
                    var30[var29] = -1;
                }
                var29++;
            }
        }
        var2[2][0] = var30;
        int var32 = 0;
        byte[] var33 = new byte[var3 * var4];
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var123 >= (var34 << 1)) {
                    var33[var32] = -1;
                }
                var32++;
            }
        }
        var2[2][1] = var33;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if (var122 <= (var37 >> 1)) {
                    var35[var36] = -1;
                }
                var36++;
            }
        }
        var2[2][2] = var35;
        int var38 = 0;
        byte[] var39 = new byte[var3 * var4];
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if (var40 << 1 <= var121) {
                    var39[var38] = -1;
                }
                var38++;
            }
        }
        var2[2][3] = var39;
        byte[] var41 = new byte[var3 * var4];
        int var42 = 0;
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if ((var43 >> 1) <= var120) {
                    var41[var42] = -1;
                }
                var42++;
            }
        }
        var2[3][0] = var41;
        byte[] var44 = new byte[var3 * var4];
        int var45 = 0;
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if (var46 << 1 >= var119) {
                    var44[var45] = -1;
                }
                var45++;
            }
        }
        var2[3][1] = var44;
        byte[] var47 = new byte[var3 * var4];
        int var48 = 0;
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if ((var49 >> 1) <= var118) {
                    var47[var48] = -1;
                }
                var48++;
            }
        }
        var2[3][2] = var47;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if ((var52 << 1) >= var117) {
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
                if (var55 >> 1 <= var116) {
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
                if (var58 << 1 >= var115) {
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
                if ((var61 >> 1) <= var114) {
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
                if (var64 << 1 >= var113) {
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
                if ((var3 / 2) >= var112) {
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
        byte[] var71 = new byte[var3 * var4];
        int var72 = 0;
        for (int var73 = 0; var73 < var4; var73++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if (var3 / 2 <= var110) {
                    var71[var72] = -1;
                }
                var72++;
            }
        }
        var2[5][2] = var71;
        byte[] var74 = new byte[var3 * var4];
        int var75 = 0;
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if ((var4 / 2) <= var76) {
                    var74[var75] = -1;
                }
                var75++;
            }
        }
        var2[5][3] = var74;
        byte[] var77 = new byte[var3 * var4];
        int var78 = 0;
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var108 <= var79 - var4 / 2) {
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
                if (var107 <= (var82 - (var4 / 2))) {
                    var81[var80] = -1;
                }
                var80++;
            }
        }
        var2[6][1] = var81;
        byte[] var83 = new byte[var3 * var4];
        int var84 = 0;
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var85 - var4 / 2 >= var106) {
                    var83[var84] = -1;
                }
                var84++;
            }
        }
        var2[6][2] = var83;
        int var86 = 0;
        byte[] var87 = new byte[var3 * var4];
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if ((var88 - (var4 / 2)) >= var105) {
                    var87[var86] = -1;
                }
                var86++;
            }
        }
        if (arg1) {
            field1540 = 59;
        }
        var2[6][3] = var87;
        int var89 = 0;
        byte[] var90 = new byte[var3 * var4];
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var91 - (var4 / 2) <= var104) {
                    var90[var89] = -1;
                }
                var89++;
            }
        }
        var2[7][0] = var90;
        byte[] var92 = new byte[var3 * var4];
        int var93 = 0;
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if (var94 - (var4 / 2) <= var103) {
                    var92[var93] = -1;
                }
                var93++;
            }
        }
        var2[7][1] = var92;
        int var95 = 0;
        byte[] var96 = new byte[var3 * var4];
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var102 >= var97 - (var4 / 2)) {
                    var96[var95] = -1;
                }
                var95++;
            }
        }
        var2[7][2] = var96;
        byte[] var98 = new byte[var3 * var4];
        int var99 = 0;
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var101 >= var100 - var4 / 2) {
                    var98[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var98;
        return var2;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZIIIILpg;)Lgq;", line = 784)
    public static final class241 method771(boolean arg0, int arg1, int arg2, int arg3, int arg4, class333 arg5) {
        field1541++;
        if (!arg0) {
            field1540 = 23;
        }
        if (!arg5.field4809 && (!class113.method855(arg1, (byte) -103) || !class113.method855(arg2, (byte) -103))) {
            return arg5.field4803 ? new class241(arg5, 34037, arg4, arg3, arg1, arg2, true) : new class241(arg5, arg4, arg3, arg1, arg2, class274.method1604(arg1, (byte) -71), class274.method1604(arg2, (byte) 9), true);
        } else {
            return new class241(arg5, 3553, arg4, arg3, arg1, arg2, true);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 804)
    public static final boolean method772(int arg0, String arg1) {
        field1542++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class296.field3993; var2++) {
            if (arg1.equalsIgnoreCase(class508.field7421[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class51.field728[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V", line = 833)
    public class95() {
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 836)
    public class95(String arg0, int arg1) {
        this.field1539 = arg0;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V", line = 846)
    public static final void method773(int arg0) {
        field1537++;
        int var1 = class51.field750 * 128 + 64;
        int var2 = class187.field2753 * 128 + 64;
        int var3 = class123.method893(var2, var1, (byte) -13, class366.field5260) - class300.field4106;
        if (class375.field5391 < 100) {
            if (var1 > class118.field1848) {
                class118.field1848 += class529.field7787 + ((var1 - class118.field1848) * class375.field5391 / 1000);
                if (class118.field1848 > var1) {
                    class118.field1848 = var1;
                }
            }
            if (var1 < class118.field1848) {
                class118.field1848 -= (class118.field1848 - var1) * class375.field5391 / 1000 + class529.field7787;
                if (class118.field1848 < var1) {
                    class118.field1848 = var1;
                }
            }
            if (class159.field2421 < var3) {
                class159.field2421 += class529.field7787 + ((var3 - class159.field2421) * class375.field5391 / 1000);
                if (var3 < class159.field2421) {
                    class159.field2421 = var3;
                }
            }
            if (var2 > class108.field1747) {
                class108.field1747 += (var2 - class108.field1747) * class375.field5391 / 1000 + class529.field7787;
                if (class108.field1747 > var2) {
                    class108.field1747 = var2;
                }
            }
            if (var3 < class159.field2421) {
                class159.field2421 -= (class159.field2421 - var3) * class375.field5391 / 1000 + class529.field7787;
                if (class159.field2421 < var3) {
                    class159.field2421 = var3;
                }
            }
            if (var2 < class108.field1747) {
                class108.field1747 -= (class108.field1747 - var2) * class375.field5391 / 1000 + class529.field7787;
                if (class108.field1747 < var2) {
                    class108.field1747 = var2;
                }
            }
        } else {
            class118.field1848 = class51.field750 * 128 + 64;
            class108.field1747 = class187.field2753 * 128 + 64;
            class159.field2421 = class123.method893(class108.field1747, class118.field1848, (byte) -13, class366.field5260) - class300.field4106;
        }
        int var4 = class422.field6129 * 128 + 64;
        int var5 = class22.field302 * 128 + 64;
        int var6 = class123.method893(var4, var5, (byte) -13, class366.field5260) - class286.field3881;
        int var7 = var5 - class118.field1848;
        int var8 = var6 - class159.field2421;
        int var9 = var4 - class108.field1747;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        int var13 = 104 % ((38 - arg0) / 49);
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class153.field2357) {
            class153.field2357 += (var11 - class153.field2357 >> 3) * class137.field2067 / 1000 + class50.field714 << 3;
            if (class153.field2357 > var11) {
                class153.field2357 = var11;
            }
        }
        if (class153.field2357 > var11) {
            class153.field2357 -= (class153.field2357 - var11 >> 3) * class137.field2067 / 1000 + class50.field714 << 3;
            if (class153.field2357 < var11) {
                class153.field2357 = var11;
            }
        }
        int var14 = var12 - class49.field706;
        if (var14 > 8192) {
            var14 -= 16384;
        }
        if (var14 < -8192) {
            var14 += 16384;
        }
        int var15 = var14 >> 3;
        if (var15 > 0) {
            class49.field706 += class137.field2067 * var15 / 1000 + class50.field714 << 3;
            class49.field706 &= 0x3FFF;
        }
        if (var15 < 0) {
            class49.field706 -= class50.field714 + (-var15 * class137.field2067 / 1000) << 3;
            class49.field706 &= 0x3FFF;
        }
        int var16 = var12 - class49.field706;
        if (var16 > 8192) {
            var16 -= 16384;
        }
        if (var16 < -8192) {
            var16 += 16384;
        }
        class455.field6641 = 0;
        if (var16 < 0 && var15 > 0 || var16 > 0 && var15 < 0) {
            class49.field706 = var12;
        }
    }
}
