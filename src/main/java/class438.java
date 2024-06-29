import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public abstract class class438 extends class693 {

    @OriginalMember(owner = "client!mha", name = "z", descriptor = "S")
    public short field6839;

    @OriginalMember(owner = "client!mha", name = "A", descriptor = "S")
    public short field6840;

    @OriginalMember(owner = "client!mha", name = "M", descriptor = "[Ljava/lang/String;")
    private static final String[] field6850 = new String[] { method3444(method3443("!E'V")), method3444(method3443("\"X*\u0014wg")), method3444(method3443("4\u001ee\u0014N")), method3444(method3443("\"X*\u0014\u000f&^\"N\rg")), method3444(method3443("\"X*\u0014vg")), method3444(method3443("\"X*\u0014gg")), method3444(method3443("\"X*\u0014cg")), method3444(method3443("\"X*\u0014qg")), method3444(method3443("\"X*\u0014`g")), method3444(method3443("\"X*\u0014dg")), method3444(method3443("\"X*\u0014fg")) };

    @OriginalMember(owner = "client!mha", name = "K", descriptor = "I")
    public static int field6842 = -1;

    @OriginalMember(owner = "client!mha", name = "D", descriptor = "I")
    public static int field6844 = 0;

    @OriginalMember(owner = "client!mha", name = "y", descriptor = "I")
    public static int field6845 = 0;

    @OriginalMember(owner = "client!mha", name = "E", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!mha", name = "B", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!mha", name = "C", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!mha", name = "L", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!mha", name = "H", descriptor = "I")
    public static int field6847;

    @OriginalMember(owner = "client!mha", name = "J", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!mha", name = "F", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!mha", name = "G", descriptor = "Lip;")
    public static class738 field6846;

    @OriginalMember(owner = "client!mha", name = "I", descriptor = "[B")
    public static byte[] field6843;

    @OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(IIIIIII)V")
    public class438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            super.field9985 = arg0;
            this.field6839 = (short) arg6;
            super.field9972 = arg1;
            super.field9983 = arg2;
            this.field6840 = (short) arg5;
            super.field9974 = (byte) arg4;
            super.field9975 = (byte) arg3;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field6850[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "(ILha;)Z")
    public final boolean method1738(int arg0, class63 arg1) {
        try {
            ++field6836;
            if (arg0 != 1) {
                this.method1737(41);
            }
            return class143.method1326(super.field9983 >> class165.field2688, super.field9985 >> class165.field2688, (byte) 102, super.field9974, this.method43(0));
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6850[4] + arg0 + ',' + (arg1 != null ? field6850[2] : field6850[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "(Z)V")
    public static void method3440(boolean arg0) {
        try {
            if (!arg0) {
                field6842 = 24;
            }
            field6843 = null;
            field6846 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6850[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "([Lih;Z)I")
    public final int method1739(class731[] arg0, boolean arg1) {
        try {
            ++field6847;
            if (arg1) {
                this.method1739((class731[]) null, false);
            }
            return this.method5034(!arg1, arg0, super.field9985 >> class165.field2688, super.field9983 >> class165.field2688);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6850[1] + (arg0 != null ? field6850[2] : field6850[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IB)[[[B")
    public static final byte[][][] method3441(int arg0, byte arg1) {
        try {
            ++field6837;
            byte[][][] var2 = new byte[8][4][];
            int var3 = arg0;
            int var4 = arg0;
            byte[] var5 = new byte[arg0 * arg0];
            int var6 = 0;
            for (int var7 = 0; ~var7 > ~var4; ++var7) {
                for (int var8 = 0; var3 > var8; ++var8) {
                    if (var7 >= var8) {
                        var5[var6] = -1;
                    }
                    ++var6;
                }
            }
            var2[0][0] = var5;
            int var9 = 0;
            byte[] var10 = new byte[var3 * var4];
            for (int var11 = var4 + -1; var11 >= 0; --var11) {
                for (int var12 = 0; var12 < var4; ++var12) {
                    if (~var11 <= ~var12) {
                        var10[var9] = -1;
                    }
                    ++var9;
                }
            }
            var2[0][1] = var10;
            int var13 = 0;
            byte[] var14 = new byte[var3 * var4];
            for (int var15 = 0; ~var15 > ~var4; ++var15) {
                for (int var16 = 0; var16 < var3; ++var16) {
                    if (var16 >= var15) {
                        var14[var13] = -1;
                    }
                    ++var13;
                }
            }
            var2[0][2] = var14;
            byte[] var17 = new byte[var3 * var4];
            int var18 = 0;
            for (int var19 = var4 - 1; var19 >= 0; --var19) {
                for (int var20 = 0; ~var20 > ~var3; ++var20) {
                    if (~var19 >= ~var20) {
                        var17[var18] = -1;
                    }
                    ++var18;
                }
            }
            var2[0][3] = var17;
            byte[] var21 = new byte[var3 * var4];
            int var22 = 0;
            for (int var23 = var4 + -1; var23 >= 0; --var23) {
                for (int var24 = 0; ~var24 > ~var3; ++var24) {
                    if (~var24 >= ~(var23 >> 1)) {
                        var21[var22] = -1;
                    }
                    ++var22;
                }
            }
            var2[1][0] = var21;
            byte[] var25 = new byte[var3 * var4];
            int var26 = 0;
            for (int var27 = 0; ~var4 < ~var27; ++var27) {
                for (int var28 = 0; var3 > var28; ++var28) {
                    if (var26 >= 0 && var26 < var25.length) {
                        if (var27 << 1 <= var28) {
                            var25[var26] = -1;
                        }
                        ++var26;
                    } else {
                        ++var26;
                    }
                }
            }
            var2[1][1] = var25;
            int var29 = 0;
            byte[] var30 = new byte[var3 * var4];
            for (int var31 = 0; ~var31 > ~var4; ++var31) {
                for (int var32 = var3 - 1; ~var32 <= -1; --var32) {
                    if (var32 <= var31 >> 1) {
                        var30[var29] = -1;
                    }
                    ++var29;
                }
            }
            var2[1][2] = var30;
            int var33 = 0;
            byte[] var34 = new byte[var3 * var4];
            for (int var35 = var4 + -1; ~var35 <= -1; --var35) {
                for (int var36 = var3 + -1; ~var36 <= -1; --var36) {
                    if (~(var35 << 1) >= ~var36) {
                        var34[var33] = -1;
                    }
                    ++var33;
                }
            }
            var2[1][3] = var34;
            int var37 = 0;
            byte[] var38 = new byte[var3 * var4];
            for (int var39 = var4 + -1; ~var39 <= -1; --var39) {
                for (int var40 = var3 - 1; var40 >= 0; --var40) {
                    if (var39 >> 1 >= var40) {
                        var38[var37] = -1;
                    }
                    ++var37;
                }
            }
            var2[2][0] = var38;
            byte[] var41 = new byte[var3 * var4];
            int var42 = 0;
            for (int var43 = var4 + -1; var43 >= 0; --var43) {
                for (int var44 = 0; ~var3 < ~var44; ++var44) {
                    if (var43 << 1 <= var44) {
                        var41[var42] = -1;
                    }
                    ++var42;
                }
            }
            var2[2][1] = var41;
            int var45 = 0;
            byte[] var46 = new byte[var3 * var4];
            for (int var47 = 0; var4 > var47; ++var47) {
                for (int var48 = 0; ~var3 < ~var48; ++var48) {
                    if (~var48 >= ~(var47 >> 1)) {
                        var46[var45] = -1;
                    }
                    ++var45;
                }
            }
            if (arg1 < 104) {
                return null;
            } else {
                var2[2][2] = var46;
                byte[] var49 = new byte[var3 * var4];
                int var50 = 0;
                for (int var51 = 0; var4 > var51; ++var51) {
                    for (int var52 = var3 - 1; ~var52 <= -1; --var52) {
                        if (var51 << 1 <= var52) {
                            var49[var50] = -1;
                        }
                        ++var50;
                    }
                }
                var2[2][3] = var49;
                int var53 = 0;
                byte[] var54 = new byte[var3 * var4];
                for (int var55 = var4 - 1; ~var55 <= -1; --var55) {
                    for (int var56 = 0; var3 > var56; ++var56) {
                        if (var56 >= var55 >> 1) {
                            var54[var53] = -1;
                        }
                        ++var53;
                    }
                }
                var2[3][0] = var54;
                byte[] var57 = new byte[var3 * var4];
                int var58 = 0;
                for (int var59 = 0; var59 < var4; ++var59) {
                    for (int var60 = 0; var3 > var60; ++var60) {
                        if (var60 <= var59 << 1) {
                            var57[var58] = -1;
                        }
                        ++var58;
                    }
                }
                var2[3][1] = var57;
                byte[] var61 = new byte[var3 * var4];
                int var62 = 0;
                for (int var63 = 0; ~var63 > ~var4; ++var63) {
                    for (int var64 = var3 + -1; var64 >= 0; --var64) {
                        if (~(var63 >> 1) >= ~var64) {
                            var61[var62] = -1;
                        }
                        ++var62;
                    }
                }
                var2[3][2] = var61;
                int var65 = 0;
                byte[] var66 = new byte[var3 * var4];
                for (int var67 = var4 - 1; var67 >= 0; --var67) {
                    for (int var68 = var3 + -1; ~var68 <= -1; --var68) {
                        if (~var68 >= ~(var67 << 1)) {
                            var66[var65] = -1;
                        }
                        ++var65;
                    }
                }
                var2[3][3] = var66;
                byte[] var69 = new byte[var3 * var4];
                int var70 = 0;
                for (int var71 = var4 + -1; var71 >= 0; --var71) {
                    for (int var72 = var3 + -1; var72 >= 0; --var72) {
                        if (~(var71 >> 1) >= ~var72) {
                            var69[var70] = -1;
                        }
                        ++var70;
                    }
                }
                var2[4][0] = var69;
                int var73 = 0;
                byte[] var74 = new byte[var3 * var4];
                for (int var75 = var4 + -1; var75 >= 0; --var75) {
                    for (int var76 = 0; ~var3 < ~var76; ++var76) {
                        if (var75 << 1 >= var76) {
                            var74[var73] = -1;
                        }
                        ++var73;
                    }
                }
                var2[4][1] = var74;
                int var77 = 0;
                byte[] var78 = new byte[var3 * var4];
                for (int var79 = 0; ~var4 < ~var79; ++var79) {
                    for (int var80 = 0; var3 > var80; ++var80) {
                        if (var79 >> 1 <= var80) {
                            var78[var77] = -1;
                        }
                        ++var77;
                    }
                }
                var2[4][2] = var78;
                byte[] var81 = new byte[var3 * var4];
                int var82 = 0;
                for (int var83 = 0; ~var83 > ~var4; ++var83) {
                    for (int var84 = var3 + -1; var84 >= 0; --var84) {
                        if (~(var83 << 1) <= ~var84) {
                            var81[var82] = -1;
                        }
                        ++var82;
                    }
                }
                var2[4][3] = var81;
                byte[] var85 = new byte[var3 * var4];
                int var86 = 0;
                for (int var87 = 0; var87 < var4; ++var87) {
                    for (int var88 = 0; var88 < var3; ++var88) {
                        if (var88 <= var3 / 2) {
                            var85[var86] = -1;
                        }
                        ++var86;
                    }
                }
                var2[5][0] = var85;
                int var89 = 0;
                byte[] var90 = new byte[var3 * var4];
                for (int var91 = 0; var4 > var91; ++var91) {
                    for (int var92 = 0; ~var3 < ~var92; ++var92) {
                        if (~(var4 / 2) <= ~var91) {
                            var90[var89] = -1;
                        }
                        ++var89;
                    }
                }
                var2[5][1] = var90;
                int var93 = 0;
                byte[] var94 = new byte[var3 * var4];
                for (int var95 = 0; var95 < var4; ++var95) {
                    for (int var96 = 0; var96 < var3; ++var96) {
                        if (~(var3 / 2) >= ~var96) {
                            var94[var93] = -1;
                        }
                        ++var93;
                    }
                }
                var2[5][2] = var94;
                byte[] var97 = new byte[var3 * var4];
                int var98 = 0;
                for (int var99 = 0; var4 > var99; ++var99) {
                    for (int var100 = 0; ~var3 < ~var100; ++var100) {
                        if (var99 >= var4 / 2) {
                            var97[var98] = -1;
                        }
                        ++var98;
                    }
                }
                var2[5][3] = var97;
                byte[] var101 = new byte[var3 * var4];
                int var102 = 0;
                for (int var103 = 0; ~var103 > ~var4; ++var103) {
                    for (int var104 = 0; ~var104 > ~var3; ++var104) {
                        if (var104 <= -(var4 / 2) + var103) {
                            var101[var102] = -1;
                        }
                        ++var102;
                    }
                }
                var2[6][0] = var101;
                int var105 = 0;
                byte[] var106 = new byte[var3 * var4];
                for (int var107 = var4 + -1; ~var107 <= -1; --var107) {
                    for (int var108 = 0; var3 > var108; ++var108) {
                        if (var108 <= -(var4 / 2) + var107) {
                            var106[var105] = -1;
                        }
                        ++var105;
                    }
                }
                var2[6][1] = var106;
                int var109 = 0;
                byte[] var110 = new byte[var3 * var4];
                for (int var111 = var4 - 1; ~var111 <= -1; --var111) {
                    for (int var112 = var3 + -1; ~var112 <= -1; --var112) {
                        if (~var112 >= ~(-(var4 / 2) + var111)) {
                            var110[var109] = -1;
                        }
                        ++var109;
                    }
                }
                var2[6][2] = var110;
                int var113 = 0;
                byte[] var114 = new byte[var3 * var4];
                for (int var115 = 0; var4 > var115; ++var115) {
                    for (int var116 = var3 + -1; var116 >= 0; --var116) {
                        if (~(-(var4 / 2) + var115) <= ~var116) {
                            var114[var113] = -1;
                        }
                        ++var113;
                    }
                }
                var2[6][3] = var114;
                byte[] var117 = new byte[var3 * var4];
                int var118 = 0;
                for (int var119 = 0; ~var119 > ~var4; ++var119) {
                    for (int var120 = 0; ~var120 > ~var3; ++var120) {
                        if (var119 - var4 / 2 <= var120) {
                            var117[var118] = -1;
                        }
                        ++var118;
                    }
                }
                var2[7][0] = var117;
                int var121 = 0;
                byte[] var122 = new byte[var3 * var4];
                for (int var123 = var4 + -1; ~var123 <= -1; --var123) {
                    for (int var124 = 0; var3 > var124; ++var124) {
                        if (-(var4 / 2) + var123 <= var124) {
                            var122[var121] = -1;
                        }
                        ++var121;
                    }
                }
                var2[7][1] = var122;
                int var125 = 0;
                byte[] var126 = new byte[var3 * var4];
                for (int var127 = var4 + -1; var127 >= 0; --var127) {
                    for (int var128 = var3 + -1; var128 >= 0; --var128) {
                        if (~(var127 - var4 / 2) >= ~var128) {
                            var126[var125] = -1;
                        }
                        ++var125;
                    }
                }
                var2[7][2] = var126;
                int var129 = 0;
                byte[] var130 = new byte[var3 * var4];
                for (int var131 = 0; ~var4 < ~var131; ++var131) {
                    for (int var132 = var3 + -1; var132 >= 0; --var132) {
                        if (var131 - var4 / 2 <= var132) {
                            var130[var129] = -1;
                        }
                        ++var129;
                    }
                }
                var2[7][3] = var130;
                return var2;
            }
        } catch (RuntimeException var134) {
            throw class590.method4333(var134, field6850[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "(I)Z")
    public final boolean method1737(int arg0) {
        try {
            if (arg0 >= -19) {
                this.method48(true, -128, (class63) null, 78, (class693) null, 57, -5);
            }
            ++field6838;
            return class441.field6890[(super.field9985 >> class165.field2688) - class54.field689 + class297.field4835][(super.field9983 >> class165.field2688) - class316.field5137 - -class297.field4835];
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6850[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "(B)V")
    public final void method50(byte arg0) {
        try {
            ++field6848;
            if (arg0 < -41) {
                throw new IllegalStateException();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6850[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "(III)Lgf;")
    public static final class290 method3442(int arg0, int arg1, int arg2) {
        if (class85.field1280[arg0][arg1][arg2] == null) {
            boolean var3 = class85.field1280[0][arg1][arg2] != null && class85.field1280[0][arg1][arg2].field4681 != null;
            if (var3 && arg0 >= class612.field8806 - 1) {
                return null;
            }
            class483.method3683(arg0, arg1, arg2);
        }
        return class85.field1280[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!mha", name = "e", descriptor = "(I)Z")
    public final boolean method53(int arg0) {
        try {
            if (arg0 != 47) {
                field6843 = null;
            }
            ++field6841;
            return false;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6850[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZILha;ILrda;II)V")
    public final void method48(boolean arg0, int arg1, class63 arg2, int arg3, class693 arg4, int arg5, int arg6) {
        try {
            if (arg5 > -10) {
                method3440(true);
            }
            ++field6849;
            throw new IllegalStateException();
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field6850[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6850[2] : field6850[0]) + ',' + arg3 + ',' + (arg4 != null ? field6850[2] : field6850[0]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!mha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3443(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 51);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3444(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 79;
                    break;
                case 1:
                    var10005 = 48;
                    break;
                case 2:
                    var10005 = 75;
                    break;
                case 3:
                    var10005 = 58;
                    break;
                default:
                    var10005 = 51;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
