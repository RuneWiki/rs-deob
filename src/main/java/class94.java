import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class94 {

    @OriginalMember(owner = "client!dba", name = "q", descriptor = "I")
    public int field1140 = -1;

    @OriginalMember(owner = "client!dba", name = "i", descriptor = "Z")
    public boolean field1132 = false;

    @OriginalMember(owner = "client!dba", name = "k", descriptor = "I")
    private int field1134 = 0;

    @OriginalMember(owner = "client!dba", name = "l", descriptor = "I")
    private int field1135 = 128;

    @OriginalMember(owner = "client!dba", name = "t", descriptor = "I")
    private int field1143 = 128;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "I")
    private int field1124 = 0;

    @OriginalMember(owner = "client!dba", name = "j", descriptor = "I")
    private int field1133 = -1;

    @OriginalMember(owner = "client!dba", name = "p", descriptor = "B")
    public byte field1139 = 0;

    @OriginalMember(owner = "client!dba", name = "z", descriptor = "I")
    private int field1149 = 0;

    @OriginalMember(owner = "client!dba", name = "r", descriptor = "Lkha;")
    public static class584 field1141 = new class584();

    @OriginalMember(owner = "client!dba", name = "y", descriptor = "Lhda;")
    public static class752 field1148 = null;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "I")
    private int field1130;

    @OriginalMember(owner = "client!dba", name = "h", descriptor = "I")
    public int field1131;

    @OriginalMember(owner = "client!dba", name = "m", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!dba", name = "o", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!dba", name = "s", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!dba", name = "u", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!dba", name = "v", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!dba", name = "x", descriptor = "Ljha;")
    public class696 field1147;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "[S")
    private short[] field1129;

    @OriginalMember(owner = "client!dba", name = "n", descriptor = "[S")
    private short[] field1137;

    @OriginalMember(owner = "client!dba", name = "w", descriptor = "[S")
    private short[] field1146;

    @OriginalMember(owner = "client!dba", name = "A", descriptor = "[S")
    private short[] field1150;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IZII)I", line = 3)
    public static final int method698(int arg0, boolean arg1, int arg2, int arg3) {
        field1125++;
        if (arg1) {
            return -61;
        }
        if (arg0 > 243) {
            arg3 >>= 0x4;
        } else if (arg0 > 217) {
            arg3 >>= 0x3;
        } else if (arg0 > 192) {
            arg3 >>= 0x2;
        } else if (arg0 > 179) {
            arg3 >>= 0x1;
        }
        return (arg3 >> 5 << 7) + ((arg2 >> 2 & 0x3F) << 10) + (arg0 >> 1);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(II)[[[B", line = 35)
    public static final byte[][][] method699(int arg0, int arg1) {
        field1128++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg1;
        int var4 = arg1;
        byte[] var5 = new byte[arg1 * arg1];
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
        byte[] var8 = new byte[var3 * var4];
        int var9 = 0;
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var131 = 0; var131 < var4; var131++) {
                if (var10 >= var131) {
                    var8[var9] = -1;
                }
                var9++;
            }
        }
        var2[0][1] = var8;
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
        byte[] var20 = new byte[var3 * var4];
        int var21 = 0;
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var21 >= 0 && var21 < var20.length) {
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
        int var23 = 0;
        byte[] var24 = new byte[var3 * var4];
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var126 <= var25 >> 1) {
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
                if (var28 << 1 <= var125) {
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
                if (var34 << 1 <= var123) {
                    var32[var33] = -1;
                }
                var33++;
            }
        }
        var2[2][1] = var32;
        int var35 = 0;
        byte[] var36 = new byte[var3 * var4];
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if ((var37 >> 1) >= var122) {
                    var36[var35] = -1;
                }
                var35++;
            }
        }
        var2[2][2] = var36;
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
                if (var120 >= var43 >> 1) {
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
                if ((var46 << 1) >= var119) {
                    var45[var44] = -1;
                }
                var44++;
            }
        }
        var2[3][1] = var45;
        int var47 = 0;
        byte[] var48 = new byte[var3 * var4];
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var118 >= var49 >> 1) {
                    var48[var47] = -1;
                }
                var47++;
            }
        }
        var2[3][2] = var48;
        int var50 = 0;
        byte[] var51 = new byte[var3 * var4];
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if ((var52 << 1) >= var117) {
                    var51[var50] = -1;
                }
                var50++;
            }
        }
        var2[3][3] = var51;
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
                if ((var58 << 1) >= var115) {
                    var57[var56] = -1;
                }
                var56++;
            }
        }
        var2[4][1] = var57;
        byte[] var59 = new byte[var3 * var4];
        int var60 = 0;
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if (var61 >> 1 <= var114) {
                    var59[var60] = -1;
                }
                var60++;
            }
        }
        var2[4][2] = var59;
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
                if (var3 / 2 >= var112) {
                    var65[var66] = -1;
                }
                var66++;
            }
        }
        var2[5][0] = var65;
        int var68 = 0;
        byte[] var69 = new byte[var3 * var4];
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if ((var4 / 2) >= var70) {
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
                if (var3 / 2 <= var110) {
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
                if (var76 >= (var4 / 2)) {
                    var74[var75] = -1;
                }
                var75++;
            }
        }
        var2[5][3] = var74;
        int var77 = 0;
        byte[] var78 = new byte[var3 * var4];
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var79 - (var4 / 2) >= var108) {
                    var78[var77] = -1;
                }
                var77++;
            }
        }
        var2[6][0] = var78;
        byte[] var80 = new byte[var3 * var4];
        int var81 = 0;
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if ((var82 - var4 / 2) >= var107) {
                    var80[var81] = -1;
                }
                var81++;
            }
        }
        var2[6][1] = var80;
        byte[] var83 = new byte[var3 * var4];
        int var84 = 0;
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var106 <= var85 - (var4 / 2)) {
                    var83[var84] = -1;
                }
                var84++;
            }
        }
        var2[6][2] = var83;
        byte[] var86 = new byte[var3 * var4];
        int var87 = 0;
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if (var88 - var4 / 2 >= var105) {
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
                if (var91 - var4 / 2 <= var104) {
                    var89[var90] = -1;
                }
                var90++;
            }
        }
        var2[7][0] = var89;
        int var92 = arg0;
        byte[] var93 = new byte[var3 * var4];
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if (var94 - (var4 / 2) <= var103) {
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
                if ((var97 - (var4 / 2)) <= var102) {
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
                if (var101 >= var100 - (var4 / 2)) {
                    var98[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var98;
        return var2;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILha;IILvga;BBI)Lka;", line = 812)
    public final class475 method700(int arg0, class59 arg1, int arg2, int arg3, class86 arg4, byte arg5, byte arg6, int arg7) {
        field1126++;
        if (arg6 > -19) {
            this.field1139 = -4;
        }
        return this.method701(arg1, 0, 0, arg0, false, arg2, (byte) -117, arg3, 0, arg4, null, arg5, null, arg7);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lha;IIIZIBIILvga;Ls;BLs;I)Lka;", line = 826)
    private final class475 method701(class59 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, byte arg6, int arg7, int arg8, class86 arg9, class282 arg10, byte arg11, class282 arg12, int arg13) {
        field1138++;
        int var15 = -122 / ((59 - arg6) / 60);
        int var16 = arg13;
        class456 var17 = this.field1140 == -1 || arg3 == -1 ? null : arg9.method663((byte) -90, this.field1140);
        boolean var18 = arg4 & this.field1139 != 0;
        if (var17 != null) {
            var16 = arg13 | var17.method2596((byte) -51, false, arg3, arg5);
        }
        if (var18) {
            var16 |= this.field1139 == 3 ? 7 : 2;
        }
        if (this.field1135 != 128) {
            var16 |= 0x2;
        }
        if (this.field1143 != 128 || this.field1134 != 0) {
            var16 |= 0x5;
        }
        class65 var19 = this.field1147.field9698;
        class475 var20;
        synchronized (this.field1147.field9698) {
            var20 = (class475) this.field1147.field9698.method552(4, (long) (this.field1131 |= arg0.field721 << 29));
        }
        if (var20 == null || arg0.method405(var20.method214(), var16) != 0) {
            if (var20 != null) {
                var16 = arg0.method410(var16, var20.method214());
            }
            int var21 = var16;
            if (this.field1129 != null) {
                var21 = var16 | 0x4000;
            }
            if (this.field1146 != null) {
                var21 |= 0x8000;
            }
            class538 var22 = class47.method333(0, this.field1147.field9695, -106, this.field1130);
            if (var22 == null) {
                return null;
            }
            if (var22.field7109 < 13) {
                var22.method2982((byte) 1, 2);
            }
            var20 = arg0.method401(var22, var21, this.field1147.field9700, this.field1149 + 64, this.field1124 - -850);
            if (this.field1129 != null) {
                for (int var23 = 0; var23 < this.field1129.length; var23++) {
                    var20.method206(this.field1129[var23], this.field1137[var23]);
                }
            }
            if (this.field1146 != null) {
                for (int var24 = 0; var24 < this.field1146.length; var24++) {
                    var20.method152(this.field1146[var24], this.field1150[var24]);
                }
            }
            var20.method190(var16);
            class65 var25 = this.field1147.field9698;
            synchronized (this.field1147.field9698) {
                this.field1147.field9698.method556((byte) 0, (long) (this.field1131 |= arg0.field721 << 29), var20);
            }
        }
        class475 var26 = var17 == null ? var20.method171(arg11, var16, true) : var17.method2598((byte) -107, arg7, arg3, 0, var20, var16, arg5, arg11);
        if (this.field1143 != 128 || this.field1135 != 128) {
            var26.method183(this.field1143, this.field1135, this.field1143);
        }
        if (this.field1134 != 0) {
            if (this.field1134 == 90) {
                var26.method146(4096);
            }
            if (this.field1134 == 180) {
                var26.method146(8192);
            }
            if (this.field1134 == 270) {
                var26.method146(12288);
            }
        }
        if (var18) {
            var26.method207(this.field1139, this.field1133, arg12, arg10, arg8, arg2, arg1);
        }
        var26.method190(arg13);
        return var26;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILs;ILvga;ILha;Ls;IIIIZZ)Lka;", line = 945)
    public final class475 method702(int arg0, class282 arg1, int arg2, class86 arg3, int arg4, class59 arg5, class282 arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11, boolean arg12) {
        if (arg12) {
            field1136++;
            return this.method701(arg5, arg0, arg10, arg4, arg11, arg7, (byte) 127, arg8, arg9, arg3, arg1, (byte) 2, arg6, arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIIIIIII)V", line = 977)
    public static final void method703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1144++;
        int var8 = class10.method99(class431.field5944, 86, class380.field5289, arg4);
        int var9 = class10.method99(class431.field5944, 90, class380.field5289, arg3);
        int var10 = class10.method99(class209.field3090, 110, class261.field3632, arg7);
        int var11 = class10.method99(class209.field3090, 121, class261.field3632, arg2);
        int var12 = class10.method99(class431.field5944, 55, class380.field5289, arg4 + arg5);
        int var13 = class10.method99(class431.field5944, 15, class380.field5289, arg3 - arg5);
        int var14 = var8;
        if (arg6 != -29036) {
            field1148 = null;
        }
        while (var12 > var14) {
            class717.method4012(arg1, -121, var10, class690.field9616[var14], var11);
            var14++;
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class717.method4012(arg1, -116, var10, class690.field9616[var15], var11);
        }
        int var16 = class10.method99(class209.field3090, 14, class261.field3632, arg5 + arg7);
        int var17 = class10.method99(class209.field3090, 113, class261.field3632, arg2 - arg5);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class690.field9616[var18];
            class717.method4012(arg1, arg6 + 28930, var10, var19, var16);
            class717.method4012(arg0, -74, var16, var19, var17);
            class717.method4012(arg1, -50, var17, var19, var11);
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V", line = 1030)
    public static void method704(int arg0) {
        field1141 = null;
        if (arg0 == 179) {
            field1148 = null;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILee;)V", line = 1054)
    public final void method705(int arg0, class677 arg1) {
        while (true) {
            int var3 = arg1.method3821((byte) -48);
            if (var3 == 0) {
                field1145++;
                if (arg0 < 17) {
                    this.field1132 = false;
                    return;
                }
                return;
            }
            this.method707((byte) 1, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lha;IIIILvga;I)Lka;", line = 1075)
    public final class475 method706(class59 arg0, int arg1, int arg2, int arg3, int arg4, class86 arg5, int arg6) {
        if (arg2 != 0) {
            this.method707((byte) -68, 21, null);
        }
        field1127++;
        return this.method701(arg0, 0, 0, arg4, false, arg6, (byte) -55, arg3, 0, arg5, null, (byte) 2, null, arg1);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(BILee;)V", line = 1095)
    private final void method707(byte arg0, int arg1, class677 arg2) {
        field1142++;
        if (arg1 == 1) {
            this.field1130 = arg2.method3807(-1);
        } else if (arg1 == 2) {
            this.field1140 = arg2.method3807(arg0 ^ 0xFFFFFFFE);
        } else if (arg1 == 4) {
            this.field1143 = arg2.method3807(-1);
        } else if (arg1 == 5) {
            this.field1135 = arg2.method3807(-1);
        } else if (arg1 == 6) {
            this.field1134 = arg2.method3807(-1);
        } else if (arg1 == 7) {
            this.field1149 = arg2.method3821((byte) 83);
        } else if (arg1 == 8) {
            this.field1124 = arg2.method3821((byte) 109);
        } else if (arg1 == 9) {
            this.field1139 = 3;
            this.field1133 = 8224;
        } else if (arg1 == 10) {
            this.field1132 = true;
        } else if (arg1 == 11) {
            this.field1139 = 1;
        } else if (arg1 == 12) {
            this.field1139 = 4;
        } else if (arg1 == 13) {
            this.field1139 = 5;
        } else if (arg1 == 14) {
            this.field1139 = 2;
            this.field1133 = arg2.method3821((byte) 108) * 256;
        } else if (arg1 == 15) {
            this.field1139 = 3;
            this.field1133 = arg2.method3807(-1);
        } else if (arg1 == 16) {
            this.field1139 = 3;
            this.field1133 = arg2.method3799(false);
        } else if (arg1 == 40) {
            int var4 = arg2.method3821((byte) 71);
            this.field1129 = new short[var4];
            this.field1137 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1129[var5] = (short) arg2.method3807(-1);
                this.field1137[var5] = (short) arg2.method3807(-1);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method3821((byte) -29);
            this.field1150 = new short[var6];
            this.field1146 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1146[var7] = (short) arg2.method3807(-1);
                this.field1150[var7] = (short) arg2.method3807(-1);
            }
        }
        if (arg0 != 1) {
            this.field1134 = -93;
        }
    }
}
