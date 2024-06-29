import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class138 {

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Lfs;")
    private class331 field1711 = new class331();

    @OriginalMember(owner = "client!se", name = "t", descriptor = "Lek;")
    private class295 field1728 = new class295();

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    private int field1726;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    private int field1725;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "Lva;")
    private class288 field1727;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "[I")
    public static int[] field1721 = new int[6];

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lwq;")
    public static class92 field1713 = new class92();

    @OriginalMember(owner = "client!se", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field1724 = new String[100];

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Lsj;")
    public static class266 field1714;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLfs;J)V", line = 4)
    public final void method849(byte arg0, class331 arg1, long arg2) {
        field1717++;
        if (this.field1726 == 0) {
            class331 var5 = this.field1728.method1946(4);
            var5.method2594((byte) -22);
            var5.method2133(-31493);
            if (this.field1711 == var5) {
                class331 var6 = this.field1728.method1946(4);
                var6.method2594((byte) -22);
                var6.method2133(arg0 ^ 0xFFFF84C4);
            }
        } else {
            this.field1726--;
        }
        this.field1727.method1886(arg1, arg2, arg0 - 62);
        this.field1728.method1950(98, arg1);
        if (arg0 != 63) {
            method850(100);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 36)
    public static final void method850(int arg0) {
        field1712++;
        class359.field5120.method2150(1);
        int var1 = class359.field5120.method2146(8, (byte) 52);
        if (class102.field1250 > var1) {
            for (int var2 = var1; var2 < class102.field1250; var2++) {
                class183.field2507[class141.field1738++] = class86.field981[var2];
            }
        }
        if (class102.field1250 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class102.field1250 = 0;
        if (arg0 >= -127) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class86.field981[var3];
            class77 var5 = class167.field2335[var4];
            int var6 = class359.field5120.method2146(1, (byte) 52);
            if (var6 == 0) {
                class86.field981[class102.field1250++] = var4;
                var5.field5625 = class189.field2726;
            } else {
                int var7 = class359.field5120.method2146(2, (byte) 52);
                if (var7 == 0) {
                    class86.field981[class102.field1250++] = var4;
                    var5.field5625 = class189.field2726;
                    class150.field1853[class176.field2399++] = var4;
                } else if (var7 == 1) {
                    class86.field981[class102.field1250++] = var4;
                    var5.field5625 = class189.field2726;
                    int var8 = class359.field5120.method2146(3, (byte) 52);
                    var5.method429(var8, (byte) -17, 1);
                    int var9 = class359.field5120.method2146(1, (byte) 52);
                    if (var9 == 1) {
                        class150.field1853[class176.field2399++] = var4;
                    }
                } else if (var7 == 2) {
                    class86.field981[class102.field1250++] = var4;
                    var5.field5625 = class189.field2726;
                    if (class359.field5120.method2146(1, (byte) 52) == 1) {
                        int var10 = class359.field5120.method2146(3, (byte) 52);
                        var5.method429(var10, (byte) -17, 2);
                        int var11 = class359.field5120.method2146(3, (byte) 52);
                        var5.method429(var11, (byte) -17, 2);
                    } else {
                        int var12 = class359.field5120.method2146(3, (byte) 52);
                        var5.method429(var12, (byte) -17, 0);
                    }
                    int var13 = class359.field5120.method2146(1, (byte) 52);
                    if (var13 == 1) {
                        class150.field1853[class176.field2399++] = var4;
                    }
                } else if (var7 == 3) {
                    class183.field2507[class141.field1738++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V", line = 156)
    public static void method851(int arg0) {
        field1721 = null;
        field1713 = null;
        field1724 = null;
        field1714 = null;
        if (arg0 != 0) {
            method854((class40) null, (byte) 67);
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V", line = 173)
    public final void method852(int arg0) {
        this.field1728.method1948((byte) -24);
        field1710++;
        this.field1727.method1887(arg0 ^ 0x56861B39);
        this.field1711 = new class331();
        if (arg0 != -1451629407) {
            method851(-120);
        }
        this.field1726 = this.field1725;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)Lsf;", line = 191)
    public static final class306 method853(int arg0, byte arg1) {
        field1709++;
        class237 var2 = class88.field1039;
        class306 var3;
        synchronized (class88.field1039) {
            var3 = (class306) class88.field1039.method1625((long) arg0, 0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class379.field5340.method2431((byte) 104, 32, arg0);
        class306 var5 = new class306();
        int var6 = -21 / ((60 - arg1) / 54);
        if (var4 != null) {
            var5.method2017(new class236(var4), (byte) 123);
        }
        var5.method2010(-27);
        class237 var7 = class88.field1039;
        synchronized (class88.field1039) {
            class88.field1039.method1622((byte) 13, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lqr;B)V", line = 222)
    public static final void method854(class40 arg0, byte arg1) {
        if (arg1 > -122) {
            field1724 = null;
        }
        field1715++;
        class435 var2 = (class435) class11.field150.method1888((long) arg0.field5620, (byte) -30);
        if (var2 == null) {
            class3.method15((class77) null, class129.field1570, (class88) null, -114, 0, arg0.field5664[0], arg0, arg0.field5677[0]);
        } else {
            var2.method2725((byte) 121);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)I", line = 241)
    public static final int method855(int arg0, int arg1) {
        field1718++;
        return arg1 == -27872 ? arg0 & 0x7F : 52;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(JB)Lfs;", line = 254)
    public final class331 method856(long arg0, byte arg1) {
        field1716++;
        if (arg1 != 123) {
            return null;
        }
        class331 var4 = (class331) this.field1727.method1888(arg0, (byte) -30);
        if (var4 != null) {
            this.field1728.method1950(49, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)[[[B", line = 301)
    public static final byte[][][] method857(int arg0, int arg1) {
        field1720++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var132 = 0; var132 < var3; var132++) {
                if (var7 >= var132) {
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
                if (var10 >= var131) {
                    var9[var8] = -1;
                }
                var8++;
            }
        }
        var2[0][1] = var9;
        int var11 = 0;
        byte[] var12 = new byte[var3 * var4];
        if (arg1 != -14209) {
            field1714 = null;
        }
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
                if (var16 <= var129) {
                    var14[var15] = -1;
                }
                var15++;
            }
        }
        var2[0][3] = var14;
        byte[] var17 = new byte[var3 * var4];
        int var18 = 0;
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var19 >> 1 >= var128) {
                    var17[var18] = -1;
                }
                var18++;
            }
        }
        var2[1][0] = var17;
        byte[] var20 = new byte[var3 * var4];
        int var21 = 0;
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var21 >= 0 && var20.length > var21) {
                    if (var22 << 1 <= var127) {
                        var20[var21] = -1;
                    }
                    var21++;
                } else {
                    var21++;
                }
            }
        }
        var2[1][1] = var20;
        byte[] var23 = new byte[var3 * var4];
        int var24 = 0;
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if ((var25 >> 1) >= var126) {
                    var23[var24] = -1;
                }
                var24++;
            }
        }
        var2[1][2] = var23;
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
                if (var31 >> 1 >= var124) {
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
                if ((var34 << 1) <= var123) {
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
                if ((var37 >> 1) >= var122) {
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
                if (var121 >= var40 << 1) {
                    var38[var39] = -1;
                }
                var39++;
            }
        }
        var2[2][3] = var38;
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
        int var44 = 0;
        byte[] var45 = new byte[var3 * var4];
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if (var119 <= var46 << 1) {
                    var45[var44] = -1;
                }
                var44++;
            }
        }
        var2[3][1] = var45;
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
                if (var117 <= var52 << 1) {
                    var50[var51] = -1;
                }
                var51++;
            }
        }
        var2[3][3] = var50;
        byte[] var53 = new byte[var3 * var4];
        int var54 = 0;
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var116 = var3 - 1; var116 >= 0; var116--) {
                if ((var55 >> 1) <= var116) {
                    var53[var54] = -1;
                }
                var54++;
            }
        }
        var2[4][0] = var53;
        byte[] var56 = new byte[var3 * var4];
        int var57 = 0;
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var115 <= var58 << 1) {
                    var56[var57] = -1;
                }
                var57++;
            }
        }
        var2[4][1] = var56;
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if (var114 >= var61 >> 1) {
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
                if (var113 <= (var64 << 1)) {
                    var62[var63] = -1;
                }
                var63++;
            }
        }
        var2[4][3] = var62;
        byte[] var65 = new byte[var3 * var4];
        int var66 = 0;
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if ((var3 / 2) >= var112) {
                    var65[var66] = -1;
                }
                var66++;
            }
        }
        var2[5][0] = var65;
        byte[] var68 = new byte[var3 * var4];
        int var69 = 0;
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if ((var4 / 2) >= var70) {
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
                if (var110 >= (var3 / 2)) {
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
                if (var108 <= (var79 - (var4 / 2))) {
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
                if (var106 <= (var85 - (var4 / 2))) {
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
                if (var105 <= (var88 - var4 / 2)) {
                    var87[var86] = -1;
                }
                var86++;
            }
        }
        var2[6][3] = var87;
        int var89 = 0;
        byte[] var90 = new byte[var3 * var4];
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if ((var91 - (var4 / 2)) <= var104) {
                    var90[var89] = -1;
                }
                var89++;
            }
        }
        var2[7][0] = var90;
        int var92 = 0;
        byte[] var93 = new byte[var3 * var4];
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if ((var94 - (var4 / 2)) <= var103) {
                    var93[var92] = -1;
                }
                var92++;
            }
        }
        var2[7][1] = var93;
        int var95 = 0;
        byte[] var96 = new byte[var3 * var4];
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var97 - (var4 / 2) <= var102) {
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
                if (var101 >= (var100 - (var4 / 2))) {
                    var98[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var98;
        return var2;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(I)V", line = 1092)
    public class138(int arg0) {
        this.field1726 = arg0;
        this.field1725 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field1727 = new class288(var2);
    }
}
