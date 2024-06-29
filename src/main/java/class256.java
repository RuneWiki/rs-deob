import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class256 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    private int field3753 = -1;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Lok;")
    private class266 field3754 = new class266();

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "Lbu;")
    public static class21 field3758 = new class21(133, 4);

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field3762 = 1337;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "[B")
    public static byte[] field3766 = new byte[2048];

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "Lpha;")
    public static class174 field3764 = new class174("", 12);

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "[C")
    public static char[] field3767 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "J")
    private long field3765;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "Lclient;")
    public static client field3768;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 8)
    public static void method1664(int arg0) {
        field3764 = null;
        field3767 = null;
        if (arg0 != 7) {
            field3758 = null;
        }
        field3766 = null;
        field3768 = null;
        field3758 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/net/Socket;II)Lgea;", line = 22)
    public static final class80 method1665(Socket arg0, int arg1, int arg2) throws IOException {
        int var3 = 44 % ((arg1 + 38) / 58);
        field3759++;
        return new class115(arg0, arg2);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)[[[B", line = 34)
    public static final byte[][][] method1666(int arg0, int arg1) {
        field3756++;
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
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var130 >= var13) {
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
        int var17 = arg1;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if ((var19 >> 1) >= var128) {
                    var18[var17] = -1;
                }
                var17++;
            }
        }
        var2[1][0] = var18;
        byte[] var20 = new byte[var3 * var4];
        int var21 = 0;
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var21 >= 0 && var20.length > var21) {
                    if (var127 >= (var22 << 1)) {
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
                if (var125 >= var28 << 1) {
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
                if (var124 <= var31 >> 1) {
                    var30[var29] = -1;
                }
                var29++;
            }
        }
        var2[2][0] = var30;
        byte[] var32 = new byte[var3 * var4];
        int var33 = 0;
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if ((var34 << 1) <= var123) {
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
        int var38 = 0;
        byte[] var39 = new byte[var3 * var4];
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if ((var40 << 1) <= var121) {
                    var39[var38] = -1;
                }
                var38++;
            }
        }
        var2[2][3] = var39;
        int var41 = 0;
        byte[] var42 = new byte[var3 * var4];
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var120 >= var43 >> 1) {
                    var42[var41] = -1;
                }
                var41++;
            }
        }
        var2[3][0] = var42;
        int var44 = 0;
        byte[] var45 = new byte[var3 * var4];
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if ((var46 << 1) >= var119) {
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
                if (var49 >> 1 <= var118) {
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
                if (var52 << 1 >= var117) {
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
                if (var115 <= (var58 << 1)) {
                    var56[var57] = -1;
                }
                var57++;
            }
        }
        var2[4][1] = var56;
        byte[] var59 = new byte[var3 * var4];
        int var60 = 0;
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if ((var61 >> 1) <= var114) {
                    var59[var60] = -1;
                }
                var60++;
            }
        }
        var2[4][2] = var59;
        int var62 = 0;
        byte[] var63 = new byte[var3 * var4];
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if (var113 <= (var64 << 1)) {
                    var63[var62] = -1;
                }
                var62++;
            }
        }
        var2[4][3] = var63;
        int var65 = 0;
        byte[] var66 = new byte[var3 * var4];
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if (var112 <= (var3 / 2)) {
                    var66[var65] = -1;
                }
                var65++;
            }
        }
        var2[5][0] = var66;
        int var68 = 0;
        byte[] var69 = new byte[var3 * var4];
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var4 / 2 >= var70) {
                    var69[var68] = -1;
                }
                var68++;
            }
        }
        var2[5][1] = var69;
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
        byte[] var74 = new byte[var3 * var4];
        int var75 = 0;
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var4 / 2 <= var76) {
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
                if (var108 <= var79 - (var4 / 2)) {
                    var77[var78] = -1;
                }
                var78++;
            }
        }
        var2[6][0] = var77;
        byte[] var80 = new byte[var3 * var4];
        int var81 = 0;
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if ((var82 - (var4 / 2)) >= var107) {
                    var80[var81] = -1;
                }
                var81++;
            }
        }
        var2[6][1] = var80;
        int var83 = 0;
        byte[] var84 = new byte[var3 * var4];
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var85 - (var4 / 2) >= var106) {
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
                if (var105 <= var88 - (var4 / 2)) {
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
                if ((var91 - var4 / 2) <= var104) {
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
                if ((var94 - (var4 / 2)) <= var103) {
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
                if (var102 >= (var97 - (var4 / 2))) {
                    var96[var95] = -1;
                }
                var95++;
            }
        }
        var2[7][2] = var96;
        int var98 = 0;
        byte[] var99 = new byte[var3 * var4];
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var100 - (var4 / 2) <= var101) {
                    var99[var98] = -1;
                }
                var98++;
            }
        }
        var2[7][3] = var99;
        return var2;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lso;B)V", line = 810)
    private final void method1667(class494 arg0, byte arg1) {
        this.field3765 = arg0.method3005(-42);
        field3755++;
        this.field3753 = arg0.method2976(-127);
        for (int var3 = arg0.method2964((byte) 39); var3 != 0; var3 = arg0.method2964((byte) 116)) {
            if (class418.field5731) {
                System.out.println("t:" + var3);
            }
            class316 var5;
            if (var3 == 3) {
                var5 = new class760();
            } else if (var3 == 1) {
                var5 = new class255();
            } else if (var3 == 4) {
                var5 = new class98();
            } else if (var3 == 6) {
                var5 = new class762();
            } else if (var3 == 5) {
                var5 = new class365();
            } else if (var3 == 2) {
                var5 = new class47();
            } else if (var3 == 7) {
                var5 = new class657();
            } else if (var3 == 8) {
                var5 = new class285();
            } else if (var3 == 9) {
                var5 = new class737();
            } else if (var3 == 10) {
                var5 = new class14();
            } else if (var3 == 11) {
                var5 = new class767();
            } else if (var3 == 12) {
                var5 = new class639();
            } else {
                throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
            }
            var5.method148(-1001, arg0);
            this.field3754.method1727(var5, (byte) 115);
        }
        int var4 = -18 % ((arg1 - 35) / 45);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII[BBI)Z", line = 888)
    public static final boolean method1668(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte arg5, int arg6) {
        field3761++;
        int var7 = arg0 % arg1;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg1 - var7;
        }
        int var9 = -((arg1 + arg3 - 1) / arg1);
        int var10 = -((arg0 + arg1 - 1) / arg1);
        int var11 = -27 / ((77 - arg5) / 47);
        for (int var12 = var9; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg4[arg6] == 0) {
                    return true;
                }
                arg6 += arg1;
            }
            int var14 = arg6 - var8;
            if (arg4[var14 - 1] == 0) {
                return true;
            }
            arg6 = arg2 + var14;
        }
        return false;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILbja;)I", line = 950)
    public static final int method1669(int arg0, class34 arg1) {
        field3757++;
        if (class34.field448 == arg1) {
            return 5120;
        } else if (class34.field455 == arg1) {
            return 5122;
        } else if (class34.field456 == arg1) {
            return 5124;
        } else if (class34.field457 == arg1) {
            return 5121;
        } else if (class34.field458 == arg1) {
            return 5123;
        } else if (class34.field459 == arg1) {
            return 5125;
        } else if (class34.field460 == arg1) {
            return 5131;
        } else if (class34.field461 == arg1) {
            return 5126;
        } else if (arg0 == 30926) {
            throw new IllegalArgumentException("");
        } else {
            return -80;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lmda;I)V", line = 995)
    public final void method1670(class276 arg0, int arg1) {
        field3760++;
        if (this.field3765 != arg0.field4023 || this.field3753 != arg0.field4012) {
            throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + class288.method1856(arg0.field4023, 37) + " updateNum:" + arg0.field4012 + " delta.owner:" + class288.method1856(this.field3765, 37) + " updateNum:" + this.field3753);
        }
        for (class316 var3 = (class316) this.field3754.method1731((byte) -121); var3 != null; var3 = (class316) this.field3754.method1724(~arg1)) {
            var3.method152((byte) 110, arg0);
        }
        arg0.field4012++;
        if (arg1 != -1) {
            this.method1670(null, -60);
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lso;)V", line = 1032)
    public class256(class494 arg0) {
        this.method1667(arg0, (byte) 101);
    }
}
