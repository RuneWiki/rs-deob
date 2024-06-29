import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class150 {

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "[I")
    private int[] field1816;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "[B")
    private byte[] field1817;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "[I")
    private int[] field1820;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "Lec;")
    public static class40 field1812 = new class40("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field1823 = new String[200];

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method720(byte arg0, int arg1) {
        if (arg0 != 97) {
            field1822 = -41;
        }
        field1815++;
        if (class142.field1712 == 0) {
            class208.field2882.method966(111, arg1);
        } else {
            class269.field3862 = arg1;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 21)
    public static final void method721(byte arg0) {
        class77.field924.method1165((byte) 118);
        field1811++;
        if (arg0 != -1) {
            field1823 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([B[BBIII)I", line = 32)
    public final int method722(byte[] arg0, byte[] arg1, byte arg2, int arg3, int arg4, int arg5) {
        field1813++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg3 + arg5;
        int var8 = 0;
        int var9 = 78 / ((arg2 + 53) / 40);
        int var10 = arg4;
        while (true) {
            byte var11 = arg0[var10];
            if (var11 < 0) {
                var8 = this.field1820[var8];
            } else {
                var8++;
            }
            int var12;
            if ((var12 = this.field1820[var8]) < 0) {
                arg1[arg3++] = (byte) (~var12);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1820[var8];
            }
            int var13;
            if ((var13 = this.field1820[var8]) < 0) {
                arg1[arg3++] = (byte) (~var13);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1820[var8];
            }
            int var14;
            if ((var14 = this.field1820[var8]) < 0) {
                arg1[arg3++] = (byte) (~var14);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1820[var8];
            }
            int var15;
            if ((var15 = this.field1820[var8]) < 0) {
                arg1[arg3++] = (byte) (~var15);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1820[var8];
            }
            int var16;
            if ((var16 = this.field1820[var8]) < 0) {
                arg1[arg3++] = (byte) (~var16);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1820[var8];
            }
            int var17;
            if ((var17 = this.field1820[var8]) < 0) {
                arg1[arg3++] = (byte) (~var17);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1820[var8];
            }
            int var18;
            if ((var18 = this.field1820[var8]) < 0) {
                arg1[arg3++] = (byte) (~var18);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1820[var8];
            }
            int var19;
            if ((var19 = this.field1820[var8]) < 0) {
                arg1[arg3++] = (byte) (~var19);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            var10++;
        }
        return var10 + 1 - arg4;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 180)
    public static void method723(int arg0) {
        if (arg0 < 123) {
            method726((int[]) null, -105, (int[]) null, (class198) null, (int[]) null);
        }
        field1812 = null;
        field1823 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([B[BIIII)I", line = 192)
    public final int method724(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field1814++;
        int var7 = 0;
        int var8 = arg2 << 3;
        if (arg3 <= 96) {
            return 11;
        }
        int var9 = arg4 + arg5;
        while (arg5 < var9) {
            int var10 = arg0[arg5] & 0xFF;
            int var11 = this.field1816[var10];
            byte var12 = this.field1817[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = var13 + (var12 + var14 - 1 >> 3);
            var8 += var12;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var7 = class292.method1841(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg1[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg1[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg1[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg1[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var8 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)[[[B", line = 267)
    public static final byte[][][] method725(int arg0, int arg1) {
        field1824++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg1;
        int var4 = arg1;
        byte[] var5 = new byte[arg1 * arg1];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var133 = 0; var133 < var3; var133++) {
                if (var7 >= var133) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        var2[0][0] = var5;
        int var8 = 0;
        byte[] var9 = new byte[var3 * var4];
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var132 = 0; var132 < var4; var132++) {
                if (var132 <= var10) {
                    var9[var8] = -1;
                }
                var8++;
            }
        }
        var2[0][1] = var9;
        byte[] var11 = new byte[var3 * var4];
        int var12 = 0;
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var131 = 0; var131 < var3; var131++) {
                if (var131 >= var13) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        var2[0][2] = var11;
        int var14 = 0;
        byte[] var15 = new byte[var3 * var4];
        int var16 = -81 / ((arg0 + 44) / 63);
        for (int var17 = var4 - 1; var17 >= 0; var17--) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var130 >= var17) {
                    var15[var14] = -1;
                }
                var14++;
            }
        }
        var2[0][3] = var15;
        int var18 = 0;
        byte[] var19 = new byte[var3 * var4];
        for (int var20 = var4 - 1; var20 >= 0; var20--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var20 >> 1 >= var129) {
                    var19[var18] = -1;
                }
                var18++;
            }
        }
        var2[1][0] = var19;
        int var21 = 0;
        byte[] var22 = new byte[var3 * var4];
        for (int var23 = 0; var23 < var4; var23++) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var21 >= 0 && var21 < var22.length) {
                    if (var128 >= var23 << 1) {
                        var22[var21] = -1;
                    }
                    var21++;
                } else {
                    var21++;
                }
            }
        }
        var2[1][1] = var22;
        int var24 = 0;
        byte[] var25 = new byte[var3 * var4];
        for (int var26 = 0; var26 < var4; var26++) {
            for (int var127 = var3 - 1; var127 >= 0; var127--) {
                if (var127 <= (var26 >> 1)) {
                    var25[var24] = -1;
                }
                var24++;
            }
        }
        var2[1][2] = var25;
        byte[] var27 = new byte[var3 * var4];
        int var28 = 0;
        for (int var29 = var4 - 1; var29 >= 0; var29--) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var126 >= (var29 << 1)) {
                    var27[var28] = -1;
                }
                var28++;
            }
        }
        var2[1][3] = var27;
        int var30 = 0;
        byte[] var31 = new byte[var3 * var4];
        for (int var32 = var4 - 1; var32 >= 0; var32--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var125 <= var32 >> 1) {
                    var31[var30] = -1;
                }
                var30++;
            }
        }
        var2[2][0] = var31;
        byte[] var33 = new byte[var3 * var4];
        int var34 = 0;
        for (int var35 = var4 - 1; var35 >= 0; var35--) {
            for (int var124 = 0; var124 < var3; var124++) {
                if (var124 >= (var35 << 1)) {
                    var33[var34] = -1;
                }
                var34++;
            }
        }
        var2[2][1] = var33;
        byte[] var36 = new byte[var3 * var4];
        int var37 = 0;
        for (int var38 = 0; var38 < var4; var38++) {
            for (int var123 = 0; var123 < var3; var123++) {
                if ((var38 >> 1) >= var123) {
                    var36[var37] = -1;
                }
                var37++;
            }
        }
        var2[2][2] = var36;
        int var39 = 0;
        byte[] var40 = new byte[var3 * var4];
        for (int var41 = 0; var41 < var4; var41++) {
            for (int var122 = var3 - 1; var122 >= 0; var122--) {
                if (var122 >= var41 << 1) {
                    var40[var39] = -1;
                }
                var39++;
            }
        }
        var2[2][3] = var40;
        int var42 = 0;
        byte[] var43 = new byte[var3 * var4];
        for (int var44 = var4 - 1; var44 >= 0; var44--) {
            for (int var121 = 0; var121 < var3; var121++) {
                if (var121 >= var44 >> 1) {
                    var43[var42] = -1;
                }
                var42++;
            }
        }
        var2[3][0] = var43;
        int var45 = 0;
        byte[] var46 = new byte[var3 * var4];
        for (int var47 = 0; var47 < var4; var47++) {
            for (int var120 = 0; var120 < var3; var120++) {
                if ((var47 << 1) >= var120) {
                    var46[var45] = -1;
                }
                var45++;
            }
        }
        var2[3][1] = var46;
        int var48 = 0;
        byte[] var49 = new byte[var3 * var4];
        for (int var50 = 0; var50 < var4; var50++) {
            for (int var119 = var3 - 1; var119 >= 0; var119--) {
                if (var50 >> 1 <= var119) {
                    var49[var48] = -1;
                }
                var48++;
            }
        }
        var2[3][2] = var49;
        byte[] var51 = new byte[var3 * var4];
        int var52 = 0;
        for (int var53 = var4 - 1; var53 >= 0; var53--) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var53 << 1 >= var118) {
                    var51[var52] = -1;
                }
                var52++;
            }
        }
        var2[3][3] = var51;
        int var54 = 0;
        byte[] var55 = new byte[var3 * var4];
        for (int var56 = var4 - 1; var56 >= 0; var56--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if (var56 >> 1 <= var117) {
                    var55[var54] = -1;
                }
                var54++;
            }
        }
        var2[4][0] = var55;
        byte[] var57 = new byte[var3 * var4];
        int var58 = 0;
        for (int var59 = var4 - 1; var59 >= 0; var59--) {
            for (int var116 = 0; var116 < var3; var116++) {
                if (var59 << 1 >= var116) {
                    var57[var58] = -1;
                }
                var58++;
            }
        }
        var2[4][1] = var57;
        byte[] var60 = new byte[var3 * var4];
        int var61 = 0;
        for (int var62 = 0; var62 < var4; var62++) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var62 >> 1 <= var115) {
                    var60[var61] = -1;
                }
                var61++;
            }
        }
        var2[4][2] = var60;
        int var63 = 0;
        byte[] var64 = new byte[var3 * var4];
        for (int var65 = 0; var65 < var4; var65++) {
            for (int var114 = var3 - 1; var114 >= 0; var114--) {
                if ((var65 << 1) >= var114) {
                    var64[var63] = -1;
                }
                var63++;
            }
        }
        var2[4][3] = var64;
        byte[] var66 = new byte[var3 * var4];
        int var67 = 0;
        for (int var68 = 0; var68 < var4; var68++) {
            for (int var113 = 0; var113 < var3; var113++) {
                if (var113 <= var3 / 2) {
                    var66[var67] = -1;
                }
                var67++;
            }
        }
        var2[5][0] = var66;
        int var69 = 0;
        byte[] var70 = new byte[var3 * var4];
        for (int var71 = 0; var71 < var4; var71++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if (var71 <= var4 / 2) {
                    var70[var69] = -1;
                }
                var69++;
            }
        }
        var2[5][1] = var70;
        int var72 = 0;
        byte[] var73 = new byte[var3 * var4];
        for (int var74 = 0; var74 < var4; var74++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var3 / 2 <= var111) {
                    var73[var72] = -1;
                }
                var72++;
            }
        }
        var2[5][2] = var73;
        int var75 = 0;
        byte[] var76 = new byte[var3 * var4];
        for (int var77 = 0; var77 < var4; var77++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if ((var4 / 2) <= var77) {
                    var76[var75] = -1;
                }
                var75++;
            }
        }
        var2[5][3] = var76;
        int var78 = 0;
        byte[] var79 = new byte[var3 * var4];
        for (int var80 = 0; var80 < var4; var80++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var80 - (var4 / 2) >= var109) {
                    var79[var78] = -1;
                }
                var78++;
            }
        }
        var2[6][0] = var79;
        byte[] var81 = new byte[var3 * var4];
        int var82 = 0;
        for (int var83 = var4 - 1; var83 >= 0; var83--) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var83 - var4 / 2 >= var108) {
                    var81[var82] = -1;
                }
                var82++;
            }
        }
        var2[6][1] = var81;
        int var84 = 0;
        byte[] var85 = new byte[var3 * var4];
        for (int var86 = var4 - 1; var86 >= 0; var86--) {
            for (int var107 = var3 - 1; var107 >= 0; var107--) {
                if (var86 - (var4 / 2) >= var107) {
                    var85[var84] = -1;
                }
                var84++;
            }
        }
        var2[6][2] = var85;
        int var87 = 0;
        byte[] var88 = new byte[var3 * var4];
        for (int var89 = 0; var89 < var4; var89++) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if ((var89 - (var4 / 2)) >= var106) {
                    var88[var87] = -1;
                }
                var87++;
            }
        }
        var2[6][3] = var88;
        byte[] var90 = new byte[var3 * var4];
        int var91 = 0;
        for (int var92 = 0; var92 < var4; var92++) {
            for (int var105 = 0; var105 < var3; var105++) {
                if (var92 - (var4 / 2) <= var105) {
                    var90[var91] = -1;
                }
                var91++;
            }
        }
        var2[7][0] = var90;
        int var93 = 0;
        byte[] var94 = new byte[var3 * var4];
        for (int var95 = var4 - 1; var95 >= 0; var95--) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var104 >= var95 - (var4 / 2)) {
                    var94[var93] = -1;
                }
                var93++;
            }
        }
        var2[7][1] = var94;
        byte[] var96 = new byte[var3 * var4];
        int var97 = 0;
        for (int var98 = var4 - 1; var98 >= 0; var98--) {
            for (int var103 = var3 - 1; var103 >= 0; var103--) {
                if (var103 >= (var98 - (var4 / 2))) {
                    var96[var97] = -1;
                }
                var97++;
            }
        }
        var2[7][2] = var96;
        int var99 = 0;
        byte[] var100 = new byte[var3 * var4];
        for (int var101 = 0; var101 < var4; var101++) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if ((var101 - (var4 / 2)) <= var102) {
                    var100[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var100;
        return var2;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "([B)V", line = 1051)
    public class150(byte[] arg0) {
        int var2 = arg0.length;
        this.field1816 = new int[var2];
        this.field1817 = arg0;
        int[] var3 = new int[33];
        this.field1820 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1816[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class292.method1841(var12, var11);
                    }
                    var9 = var7 | var8;
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field1820[var14] == 0) {
                            this.field1820[var14] = var4;
                        }
                        var14 = this.field1820[var14];
                    }
                    if (this.field1820.length <= var14) {
                        int[] var17 = new int[this.field1820.length * 2];
                        for (int var18 = 0; var18 < this.field1820.length; var18++) {
                            var17[var18] = this.field1820[var18];
                        }
                        this.field1820 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field1820[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([II[ILcj;[I)V", line = 1179)
    public static final void method726(int[] arg0, int arg1, int[] arg2, class198 arg3, int[] arg4) {
        field1821++;
        if (arg1 < 96) {
            return;
        }
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg2[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg3.field2487.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field2487[var9] = null;
                    } else {
                        class207 var10 = class175.field2103.method1267(-97, var6);
                        int var11 = var10.field2848;
                        class178 var12 = arg3.field2487[var9];
                        if (var12 != null) {
                            if (var12.field2143 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field2487[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field2148 = var8;
                                    var12.field2145 = 0;
                                    var12.field2147 = 0;
                                    var12.field2146 = 0;
                                    var12.field2144 = 1;
                                    class126.method602(var10, class19.field258 == arg3, arg3.field1008, 0, arg3.field1005, false, arg3.field994);
                                } else if (var11 == 2) {
                                    var12.field2146 = 0;
                                }
                            } else if (var10.field2860 >= class175.field2103.method1267(-50, var12.field2143).field2860) {
                                var12 = arg3.field2487[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class178 var13 = arg3.field2487[var9] = new class178();
                            var13.field2145 = 0;
                            var13.field2147 = 0;
                            var13.field2144 = 1;
                            var13.field2148 = var8;
                            var13.field2146 = 0;
                            var13.field2143 = var6;
                            class126.method602(var10, class19.field258 == arg3, arg3.field1008, 0, arg3.field1005, false, arg3.field994);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lg;Lgl;ZLg;)V", line = 1276)
    public static final void method727(class470 arg0, class365 arg1, boolean arg2, class470 arg3) {
        class375.field5346 = arg3;
        class331.field4769 = arg1;
        class480.field6792 = arg0;
        if (!arg2) {
            method725(-84, 12);
        }
        field1818++;
        if (class480.field6792 != null) {
            class173.field2086 = class480.field6792.method2755(-123, 1);
        }
        if (class375.field5346 != null) {
            class190.field2603 = class375.field5346.method2755(-112, 1);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)I", line = 1299)
    public static final int method728(byte arg0) {
        field1819++;
        if (arg0 > -89) {
            method726((int[]) null, -106, (int[]) null, (class198) null, (int[]) null);
        }
        return 2;
    }
}
