import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class111 extends class27 {

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field1996 = 0;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "Lkb;")
    public static class93 field2001 = class76.method390("VOLL", 0);

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "[[I")
    public static int[][] field2000 = new int[104][104];

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "Lkb;")
    public static class93 field1997 = class76.method390("Verbindung mit Update)2Server)3)3)3", 0);

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "I")
    public static int field2003 = 0;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "Lkb;")
    public static class93 field2007 = class76.method390("_", 0);

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "Lkb;")
    public static class93 field2004 = class76.method390("title_mute", 0);

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "[I")
    public static int[] field2011;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZJ)V")
    private static final void method598(boolean arg0, long arg1) {
        ++field2010;
        if (~arg1 != -1L) {
            for (int var3 = 0; ~class27.field424 < ~var3; ++var3) {
                if (class166.field3280[var3] == arg1) {
                    ++class137.field2651;
                    --class27.field424;
                    for (int var4 = var3; ~class27.field424 < ~var4; ++var4) {
                        class166.field3280[var4] = class166.field3280[var4 - -1];
                        class137.field2650[var4] = class137.field2650[var4 + 1];
                    }
                    class16.field287 = class203.field3928;
                    class151.field2908.method47(235, 8);
                    class151.field2908.method1064(arg1, -1);
                    break;
                }
            }
            if (arg0) {
                field2011 = null;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (arg0 > 106) {
            if (arg1 == 0) {
                super.field435 = ~arg2.method1054(128) == -2;
            }
            ++field2009;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)[[I")
    public final int[][] method19(int arg0, int arg1) {
        ++field2006;
        int var3 = -91 / ((42 - arg0) / 54);
        int[][] var4 = super.field436.method537(0, arg1);
        int[] var5 = var4[1];
        int[] var6 = var4[0];
        int[] var7 = var4[2];
        if (super.field436.field1771) {
            for (int var8 = 0; ~class159.field3209 < ~var8; ++var8) {
                this.method601(var8, (byte) -125, arg1);
                int[][] var9 = this.method152(class3.field45, 0, 111);
                var6[var8] = var9[0][class37.field600];
                var5[var8] = var9[1][class37.field600];
                var7[var8] = var9[2][class37.field600];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        int[] var3 = super.field447.method1238(arg1, arg0);
        ++field1998;
        if (super.field447.field3737) {
            for (int var4 = 0; ~class159.field3209 < ~var4; ++var4) {
                this.method601(var4, (byte) -66, arg0);
                int[] var5 = this.method145(0, (byte) 127, class3.field45);
                var3[var4] = var5[class37.field600];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILld;I)V")
    public static final void method599(int arg0, class104 arg1, int arg2) {
        ++field2005;
        Object[] var3 = arg1.field1924;
        int var4 = -46 / ((arg2 - -50) / 60);
        int var5 = (Integer) var3[0];
        class64 var6 = class47.method247(var5, true);
        if (var6 != null) {
            class53.field891 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = -1;
            int[] var10 = var6.field1015;
            int[] var11 = var6.field1033;
            byte var12 = -1;
            try {
                int var13 = 0;
                class96.field1779 = new class93[var6.field1030];
                class73.field1327 = new int[var6.field1021];
                int var14 = 0;
                for (int var15 = 1; ~var15 > ~var3.length; ++var15) {
                    if (var3[var15] instanceof Integer) {
                        int var16 = (Integer) var3[var15];
                        if (var16 == -2147483647) {
                            var16 = arg1.field1908;
                        }
                        if (~var16 == 2147483645) {
                            var16 = arg1.field1916;
                        }
                        if (var16 == -2147483645) {
                            var16 = arg1.field1919 != null ? arg1.field1919.field1058 : -1;
                        }
                        if (~var16 == 2147483643) {
                            var16 = arg1.field1909;
                        }
                        if (var16 == -2147483643) {
                            var16 = arg1.field1919 != null ? arg1.field1919.field1127 : -1;
                        }
                        if (var16 == -2147483642) {
                            var16 = arg1.field1906 != null ? arg1.field1906.field1058 : -1;
                        }
                        if (var16 == -2147483641) {
                            var16 = arg1.field1906 != null ? arg1.field1906.field1127 : -1;
                        }
                        if (var16 == -2147483640) {
                            var16 = arg1.field1910;
                        }
                        if (var16 == -2147483639) {
                            var16 = arg1.field1917;
                        }
                        class73.field1327[var13++] = var16;
                    } else if (var3[var15] instanceof class93) {
                        class93 var17 = (class93) var3[var15];
                        if (var17.method485((byte) -76, class4.field66)) {
                            var17 = arg1.field1920;
                        }
                        class96.field1779[var14++] = var17;
                    }
                }
                int var18 = 0;
                label2190: while (true) {
                    ++var18;
                    if (var18 > arg0) {
                        throw new RuntimeException("slow");
                    }
                    ++var9;
                    int var312 = var10[var9];
                    if (var312 < 100) {
                        if (var312 == 0) {
                            class204.field3946[var7++] = var11[var9];
                            continue;
                        }
                        if (var312 == 1) {
                            int var19 = var11[var9];
                            class204.field3946[var7++] = class47.field758[var19];
                            continue;
                        }
                        if (~var312 == -3) {
                            int var20 = var11[var9];
                            --var7;
                            class47.field758[var20] = class204.field3946[var7];
                            continue;
                        }
                        if (~var312 == -4) {
                            class133.field2541[var8++] = var6.field1034[var9];
                            continue;
                        }
                        if (var312 == 6) {
                            var9 += var11[var9];
                            continue;
                        }
                        if (var312 == 7) {
                            var7 -= 2;
                            if (~class204.field3946[var7 - -1] != ~class204.field3946[var7]) {
                                var9 += var11[var9];
                            }
                            continue;
                        }
                        if (~var312 == -9) {
                            var7 -= 2;
                            if (~class204.field3946[var7 + 1] == ~class204.field3946[var7]) {
                                var9 += var11[var9];
                            }
                            continue;
                        }
                        if (~var312 == -10) {
                            var7 -= 2;
                            if (~class204.field3946[var7 - -1] < ~class204.field3946[var7]) {
                                var9 += var11[var9];
                            }
                            continue;
                        }
                        if (~var312 == -11) {
                            var7 -= 2;
                            if (~class204.field3946[var7 + 1] > ~class204.field3946[var7]) {
                                var9 += var11[var9];
                            }
                            continue;
                        }
                        if (var312 == 21) {
                            if (~class53.field891 == -1) {
                                return;
                            }
                            class108 var21 = class123.field2279[--class53.field891];
                            var9 = var21.field1956;
                            class73.field1327 = var21.field1969;
                            var6 = var21.field1962;
                            class96.field1779 = var21.field1963;
                            var10 = var6.field1015;
                            var11 = var6.field1033;
                            continue;
                        }
                        if (~var312 == -26) {
                            int var22 = var11[var9];
                            class204.field3946[var7++] = class21.method129(var22, 21497);
                            continue;
                        }
                        if (var312 == 27) {
                            int var23 = var11[var9];
                            --var7;
                            class59.method309(class204.field3946[var7], var23, (byte) 54);
                            continue;
                        }
                        if (var312 == 31) {
                            var7 -= 2;
                            if (~class204.field3946[var7 + 1] <= ~class204.field3946[var7]) {
                                var9 += var11[var9];
                            }
                            continue;
                        }
                        if (var312 == 32) {
                            var7 -= 2;
                            if (class204.field3946[var7 - -1] <= class204.field3946[var7]) {
                                var9 += var11[var9];
                            }
                            continue;
                        }
                        if (var312 == 33) {
                            class204.field3946[var7++] = class73.field1327[var11[var9]];
                            continue;
                        }
                        int var10001;
                        if (~var312 == -35) {
                            var10001 = var11[var9];
                            --var7;
                            class73.field1327[var10001] = class204.field3946[var7];
                            continue;
                        }
                        if (~var312 == -36) {
                            class133.field2541[var8++] = class96.field1779[var11[var9]];
                            continue;
                        }
                        if (var312 == 36) {
                            var10001 = var11[var9];
                            --var8;
                            class96.field1779[var10001] = class133.field2541[var8];
                            continue;
                        }
                        if (~var312 == -38) {
                            int var24 = var11[var9];
                            var8 -= var24;
                            class93 var25 = class72.method379(var8, class133.field2541, var24, -59);
                            class133.field2541[var8++] = var25;
                            continue;
                        }
                        if (~var312 == -39) {
                            --var7;
                            continue;
                        }
                        if (~var312 == -40) {
                            --var8;
                            continue;
                        }
                        if (var312 == 40) {
                            int var26 = var11[var9];
                            class64 var27 = class47.method247(var26, true);
                            class93[] var28 = new class93[var27.field1030];
                            int[] var29 = new int[var27.field1021];
                            for (int var30 = 0; var30 < var27.field1009; ++var30) {
                                var29[var30] = class204.field3946[var7 + var30 + -var27.field1009];
                            }
                            for (int var31 = 0; var31 < var27.field1017; ++var31) {
                                var28[var31] = class133.field2541[-var27.field1017 + var8 + var31];
                            }
                            var8 -= var27.field1017;
                            var7 -= var27.field1009;
                            class108 var32 = new class108();
                            var32.field1956 = var9;
                            var32.field1963 = class96.field1779;
                            var32.field1962 = var6;
                            var32.field1969 = class73.field1327;
                            if (class53.field891 >= class123.field2279.length) {
                                throw new RuntimeException();
                            }
                            var9 = -1;
                            var6 = var27;
                            class123.field2279[class53.field891++] = var32;
                            var11 = var27.field1033;
                            class73.field1327 = var29;
                            var10 = var27.field1015;
                            class96.field1779 = var28;
                            continue;
                        }
                        if (~var312 == -43) {
                            class204.field3946[var7++] = class103.field1900[var11[var9]];
                            continue;
                        }
                        if (var312 == 43) {
                            var10001 = var11[var9];
                            --var7;
                            class103.field1900[var10001] = class204.field3946[var7];
                            continue;
                        }
                        if (var312 == 44) {
                            int var33 = var11[var9] >> 16;
                            int var34 = var11[var9] & 65535;
                            --var7;
                            int var35 = class204.field3946[var7];
                            if (var35 >= 0 && var35 <= 5000) {
                                class155.field3058[var33] = var35;
                                byte var36 = -1;
                                if (~var34 == -106) {
                                    var36 = 0;
                                }
                                int var37 = 0;
                                while (true) {
                                    if (~var35 >= ~var37) {
                                        continue label2190;
                                    }
                                    class135.field2616[var33][var37] = var36;
                                    ++var37;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (var312 == 45) {
                            int var38 = var11[var9];
                            --var7;
                            int var39 = class204.field3946[var7];
                            if (~var39 <= -1 && var39 < class155.field3058[var38]) {
                                class204.field3946[var7++] = class135.field2616[var38][var39];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (~var312 == -47) {
                            int var40 = var11[var9];
                            var7 -= 2;
                            int var41 = class204.field3946[var7];
                            if (~var41 <= -1 && ~class155.field3058[var40] < ~var41) {
                                class135.field2616[var40][var41] = class204.field3946[var7 + 1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (~var312 == -48) {
                            class93 var42 = class188.field3684[var11[var9]];
                            if (var42 == null) {
                                var42 = class46.field736;
                            }
                            class133.field2541[var8++] = var42;
                            continue;
                        }
                        if (~var312 == -49) {
                            var10001 = var11[var9];
                            --var8;
                            class188.field3684[var10001] = class133.field2541[var8];
                            continue;
                        }
                    }
                    boolean var43;
                    if (~var11[var9] != -2) {
                        var43 = false;
                    } else {
                        var43 = true;
                    }
                    if (~var312 > -1001) {
                        if (var312 == 100) {
                            var7 -= 3;
                            int var44 = class204.field3946[var7];
                            int var45 = class204.field3946[var7 + 1];
                            int var46 = class204.field3946[var7 - -2];
                            if (var45 == 0) {
                                throw new RuntimeException();
                            }
                            class65 var47 = class204.method1325(65535, var44);
                            if (var47.field1121 == null) {
                                var47.field1121 = new class65[var46 - -1];
                            }
                            if (var46 >= var47.field1121.length) {
                                class65[] var48 = new class65[var46 + 1];
                                for (int var49 = 0; var49 < var47.field1121.length; ++var49) {
                                    var48[var49] = var47.field1121[var49];
                                }
                                var47.field1121 = var48;
                            }
                            if (~var46 < -1 && var47.field1121[var46 + -1] == null) {
                                throw new RuntimeException("Gap at:" + (var46 + -1));
                            }
                            class65 var50 = new class65();
                            var50.field1143 = var50.field1058 = var47.field1058;
                            var50.field1076 = var45;
                            var50.field1152 = true;
                            var50.field1127 = var46;
                            var47.field1121[var46] = var50;
                            if (var43) {
                                class85.field1558 = var50;
                            } else {
                                class183.field3611 = var50;
                            }
                            class160.method1095(0, var47);
                            continue;
                        }
                        if (~var312 == -102) {
                            class65 var51 = var43 ? class85.field1558 : class183.field3611;
                            if (~var51.field1127 == 0) {
                                if (!var43) {
                                    throw new RuntimeException("Tried to cc_delete static active-component!");
                                }
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            class65 var52 = class204.method1325(65535, var51.field1058);
                            var52.field1121[var51.field1127] = null;
                            class160.method1095(0, var52);
                            continue;
                        }
                        if (var312 == 102) {
                            --var7;
                            class65 var53 = class204.method1325(65535, class204.field3946[var7]);
                            var53.field1121 = null;
                            class160.method1095(0, var53);
                            continue;
                        }
                        if (var312 == 200) {
                            var7 -= 2;
                            int var54 = class204.field3946[var7];
                            int var55 = class204.field3946[var7 + 1];
                            class65 var56 = class113.method621(var55, var54, -1);
                            if (var56 != null && var55 != -1) {
                                class204.field3946[var7++] = 1;
                                if (var43) {
                                    class85.field1558 = var56;
                                } else {
                                    class183.field3611 = var56;
                                }
                                continue;
                            }
                            class204.field3946[var7++] = 0;
                            continue;
                        }
                        if (var312 == 201) {
                            --var7;
                            int var57 = class204.field3946[var7];
                            class65 var58 = class204.method1325(65535, var57);
                            if (var58 == null) {
                                class204.field3946[var7++] = 0;
                            } else {
                                class204.field3946[var7++] = 1;
                                if (var43) {
                                    class85.field1558 = var58;
                                } else {
                                    class183.field3611 = var58;
                                }
                            }
                            continue;
                        }
                    } else if ((~var312 > -1001 || var312 >= 1100) && (~var312 > -2001 || ~var312 <= -2101)) {
                        if (var312 >= 1100 && var312 < 1200 || var312 >= 2100 && ~var312 > -2201) {
                            class65 var304;
                            if (~var312 <= -2001) {
                                var312 -= 1000;
                                --var7;
                                var304 = class204.method1325(65535, class204.field3946[var7]);
                            } else {
                                var304 = !var43 ? class183.field3611 : class85.field1558;
                            }
                            if (~var312 == -1101) {
                                var7 -= 2;
                                var304.field1122 = class204.field3946[var7];
                                if (~var304.field1122 < ~(-var304.field1044 + var304.field1153)) {
                                    var304.field1122 = -var304.field1044 + var304.field1153;
                                }
                                if (var304.field1122 < 0) {
                                    var304.field1122 = 0;
                                }
                                var304.field1162 = class204.field3946[var7 - -1];
                                if (~var304.field1162 < ~(-var304.field1052 + var304.field1103)) {
                                    var304.field1162 = -var304.field1052 + var304.field1103;
                                }
                                if (~var304.field1162 > -1) {
                                    var304.field1162 = 0;
                                }
                                class160.method1095(0, var304);
                                continue;
                            }
                            if (~var312 == -1102) {
                                --var7;
                                var304.field1167 = class204.field3946[var7];
                                class160.method1095(0, var304);
                                continue;
                            }
                            if (var312 == 1102) {
                                --var7;
                                var304.field1074 = class204.field3946[var7] == 1;
                                class160.method1095(0, var304);
                                continue;
                            }
                            if (~var312 == -1104) {
                                --var7;
                                var304.field1172 = class204.field3946[var7];
                                class160.method1095(0, var304);
                                continue;
                            }
                            if (~var312 == -1105) {
                                --var7;
                                var304.field1066 = class204.field3946[var7];
                                class160.method1095(0, var304);
                                continue;
                            }
                            if (~var312 == -1106) {
                                --var7;
                                var304.field1089 = class204.field3946[var7];
                                class160.method1095(0, var304);
                                continue;
                            }
                            if (var312 == 1106) {
                                --var7;
                                var304.field1138 = class204.field3946[var7];
                                class160.method1095(0, var304);
                                continue;
                            }
                            if (~var312 == -1108) {
                                --var7;
                                var304.field1067 = ~class204.field3946[var7] == -2;
                                class160.method1095(0, var304);
                                continue;
                            }
                            if (~var312 == -1109) {
                                var304.field1174 = 1;
                                --var7;
                                var304.field1037 = class204.field3946[var7];
                                class160.method1095(0, var304);
                                continue;
                            }
                            if (var312 == 1109) {
                                var7 -= 6;
                                var304.field1140 = class204.field3946[var7];
                                var304.field1054 = class204.field3946[var7 - -1];
                                var304.field1111 = class204.field3946[var7 + 2];
                                var304.field1157 = class204.field3946[var7 + 3];
                                var304.field1180 = class204.field3946[var7 + 4];
                                var304.field1082 = class204.field3946[var7 + 5];
                                class160.method1095(0, var304);
                                continue;
                            }
                            if (var312 == 1110) {
                                --var7;
                                int var305 = class204.field3946[var7];
                                if (~var304.field1173 != ~var305) {
                                    var304.field1173 = var305;
                                    var304.field1043 = 0;
                                    var304.field1151 = 0;
                                    class160.method1095(0, var304);
                                }
                                continue;
                            }
                            if (~var312 == -1112) {
                                --var7;
                                var304.field1156 = ~class204.field3946[var7] == -2;
                                class160.method1095(0, var304);
                                continue;
                            }
                            if (var312 == 1112) {
                                --var8;
                                class93 var306 = class133.field2541[var8];
                                if (!var306.method485((byte) 95, var304.field1131)) {
                                    var304.field1131 = var306;
                                    class160.method1095(0, var304);
                                }
                                continue;
                            }
                            if (var312 == 1113) {
                                --var7;
                                var304.field1051 = class204.field3946[var7];
                                class160.method1095(0, var304);
                                continue;
                            }
                            if (var312 == 1114) {
                                var7 -= 3;
                                var304.field1101 = class204.field3946[var7];
                                var304.field1142 = class204.field3946[var7 + 1];
                                var304.field1094 = class204.field3946[var7 + 2];
                                class160.method1095(0, var304);
                                continue;
                            }
                            if (~var312 == -1116) {
                                --var7;
                                var304.field1064 = class204.field3946[var7] == 1;
                                class160.method1095(0, var304);
                                continue;
                            }
                            if (~var312 == -1117) {
                                --var7;
                                var304.field1050 = class204.field3946[var7];
                                class160.method1095(0, var304);
                                continue;
                            }
                            if (~var312 == -1118) {
                                --var7;
                                var304.field1148 = class204.field3946[var7];
                                class160.method1095(0, var304);
                                continue;
                            }
                            if (var312 == 1118) {
                                --var7;
                                var304.field1092 = ~class204.field3946[var7] == -2;
                                class160.method1095(0, var304);
                                continue;
                            }
                            if (~var312 == -1120) {
                                --var7;
                                var304.field1062 = ~class204.field3946[var7] == -2;
                                class160.method1095(0, var304);
                                continue;
                            }
                            if (~var312 == -1121) {
                                var7 -= 2;
                                var304.field1153 = class204.field3946[var7];
                                var304.field1103 = class204.field3946[var7 - -1];
                                class160.method1095(0, var304);
                                continue;
                            }
                        } else if ((~var312 > -1201 || var312 >= 1300) && (~var312 > -2201 || var312 >= 2300)) {
                            if ((~var312 > -1301 || var312 >= 1400) && (~var312 > -2301 || var312 >= 2400)) {
                                if (~var312 <= -1401 && var312 < 1500 || ~var312 <= -2401 && var312 < 2500) {
                                    class65 var61;
                                    if (~var312 > -2001) {
                                        var61 = var43 ? class85.field1558 : class183.field3611;
                                    } else {
                                        --var7;
                                        var61 = class204.method1325(65535, class204.field3946[var7]);
                                        var312 -= 1000;
                                    }
                                    --var8;
                                    class93 var62 = class133.field2541[var8];
                                    int[] var63 = null;
                                    if (~var62.method510(79) < -1 && var62.method491((byte) -66, -1 + var62.method510(28)) == 89) {
                                        --var7;
                                        int var64 = class204.field3946[var7];
                                        if (var64 > 0) {
                                            var63 = new int[var64];
                                            while (var64-- > 0) {
                                                --var7;
                                                var63[var64] = class204.field3946[var7];
                                            }
                                        }
                                        var62 = var62.method497((byte) -85, var62.method510(73) + -1, 0);
                                    }
                                    Object[] var65 = new Object[1 + var62.method510(122)];
                                    for (int var66 = var65.length + -1; var66 >= 1; --var66) {
                                        if (~var62.method491((byte) -127, var66 + -1) != -116) {
                                            --var7;
                                            var65[var66] = new Integer(class204.field3946[var7]);
                                        } else {
                                            --var8;
                                            var65[var66] = class133.field2541[var8];
                                        }
                                    }
                                    --var7;
                                    int var67 = class204.field3946[var7];
                                    if (~var67 != 0) {
                                        var65[0] = new Integer(var67);
                                    } else {
                                        var65 = null;
                                    }
                                    if (~var312 == -1415) {
                                        var61.field1141 = var63;
                                        var61.field1063 = var65;
                                    }
                                    if (~var312 == -1424) {
                                        var61.field1123 = var65;
                                    }
                                    if (var312 == 1418) {
                                        var61.field1108 = var65;
                                    }
                                    if (var312 == 1425) {
                                        var61.field1068 = var65;
                                    }
                                    if (~var312 == -1417) {
                                        var61.field1158 = var65;
                                    }
                                    if (~var312 == -1422) {
                                        var61.field1075 = var65;
                                    }
                                    if (~var312 == -1407) {
                                        var61.field1150 = var65;
                                    }
                                    if (~var312 == -1425) {
                                        var61.field1069 = var65;
                                    }
                                    if (~var312 == -1420) {
                                        var61.field1112 = var65;
                                    }
                                    var61.field1159 = true;
                                    if (var312 == 1422) {
                                        var61.field1137 = var65;
                                    }
                                    if (var312 == 1403) {
                                        var61.field1160 = var65;
                                    }
                                    if (~var312 == -1409) {
                                        var61.field1048 = var65;
                                    }
                                    if (var312 == 1420) {
                                        var61.field1097 = var65;
                                    }
                                    if (var312 == 1409) {
                                        var61.field1079 = var65;
                                    }
                                    if (~var312 == -1412) {
                                        var61.field1087 = var65;
                                    }
                                    if (~var312 == -1418) {
                                        var61.field1155 = var65;
                                    }
                                    if (~var312 == -1405) {
                                        var61.field1163 = var65;
                                    }
                                    if (~var312 == -1416) {
                                        var61.field1072 = var65;
                                        var61.field1114 = var63;
                                    }
                                    if (var312 == 1405) {
                                        var61.field1179 = var65;
                                    }
                                    if (var312 == 1402) {
                                        var61.field1080 = var65;
                                    }
                                    if (var312 == 1410) {
                                        var61.field1118 = var65;
                                    }
                                    if (~var312 == -1413) {
                                        var61.field1115 = var65;
                                    }
                                    if (~var312 == -1408) {
                                        var61.field1099 = var63;
                                        var61.field1128 = var65;
                                    }
                                    if (var312 == 1401) {
                                        var61.field1168 = var65;
                                    }
                                    if (var312 == 1400) {
                                        var61.field1182 = var65;
                                    }
                                    continue;
                                }
                                if (~var312 > -1601) {
                                    class65 var68 = !var43 ? class183.field3611 : class85.field1558;
                                    if (var312 == 1500) {
                                        class204.field3946[var7++] = var68.field1113;
                                        continue;
                                    }
                                    if (var312 == 1501) {
                                        class204.field3946[var7++] = var68.field1090;
                                        continue;
                                    }
                                    if (var312 == 1502) {
                                        class204.field3946[var7++] = var68.field1044;
                                        continue;
                                    }
                                    if (~var312 == -1504) {
                                        class204.field3946[var7++] = var68.field1052;
                                        continue;
                                    }
                                    if (~var312 == -1505) {
                                        class204.field3946[var7++] = !var68.field1073 ? 0 : 1;
                                        continue;
                                    }
                                    if (~var312 == -1506) {
                                        class204.field3946[var7++] = var68.field1143;
                                        continue;
                                    }
                                } else if (~var312 <= -1701) {
                                    if (~var312 <= -1801) {
                                        if (~var312 <= -1901) {
                                            if (var312 < 2600) {
                                                --var7;
                                                class65 var69 = class204.method1325(65535, class204.field3946[var7]);
                                                if (~var312 == -2501) {
                                                    class204.field3946[var7++] = var69.field1113;
                                                    continue;
                                                }
                                                if (var312 == 2501) {
                                                    class204.field3946[var7++] = var69.field1090;
                                                    continue;
                                                }
                                                if (var312 == 2502) {
                                                    class204.field3946[var7++] = var69.field1044;
                                                    continue;
                                                }
                                                if (~var312 == -2504) {
                                                    class204.field3946[var7++] = var69.field1052;
                                                    continue;
                                                }
                                                if (var312 == 2504) {
                                                    class204.field3946[var7++] = var69.field1073 ? 1 : 0;
                                                    continue;
                                                }
                                                if (~var312 == -2506) {
                                                    class204.field3946[var7++] = var69.field1143;
                                                    continue;
                                                }
                                            } else if (~var312 <= -2701) {
                                                if (~var312 > -2801) {
                                                    if (var312 == 2700) {
                                                        --var7;
                                                        class65 var70 = class204.method1325(65535, class204.field3946[var7]);
                                                        class204.field3946[var7++] = var70.field1038;
                                                        continue;
                                                    }
                                                    if (var312 == 2701) {
                                                        --var7;
                                                        class65 var71 = class204.method1325(65535, class204.field3946[var7]);
                                                        if (~var71.field1038 == 0) {
                                                            class204.field3946[var7++] = 0;
                                                        } else {
                                                            class204.field3946[var7++] = var71.field1132;
                                                        }
                                                        continue;
                                                    }
                                                    if (var312 == 2702) {
                                                        --var7;
                                                        int var72 = class204.field3946[var7];
                                                        class78 var73 = (class78) class147.field2834.method616((long) var72, -1);
                                                        if (var73 != null) {
                                                            class204.field3946[var7++] = 1;
                                                        } else {
                                                            class204.field3946[var7++] = 0;
                                                        }
                                                        continue;
                                                    }
                                                    if (~var312 == -2704) {
                                                        --var7;
                                                        class65 var74 = class204.method1325(65535, class204.field3946[var7]);
                                                        if (var74.field1121 == null) {
                                                            class204.field3946[var7++] = 0;
                                                            continue;
                                                        }
                                                        int var75 = var74.field1121.length;
                                                        for (int var76 = 0; ~var76 > ~var74.field1121.length; ++var76) {
                                                            if (var74.field1121[var76] == null) {
                                                                var75 = var76;
                                                                break;
                                                            }
                                                        }
                                                        class204.field3946[var7++] = var75;
                                                        continue;
                                                    }
                                                    if (var312 == 2704 || ~var312 == -2706) {
                                                        var7 -= 2;
                                                        int var77 = class204.field3946[var7];
                                                        int var78 = class204.field3946[var7 + 1];
                                                        class78 var79 = (class78) class147.field2834.method616((long) var77, -1);
                                                        if (var79 != null && ~var79.field1406 == ~var78) {
                                                            class204.field3946[var7++] = 1;
                                                            continue;
                                                        }
                                                        class204.field3946[var7++] = 0;
                                                        continue;
                                                    }
                                                } else if (~var312 <= -2901) {
                                                    if (~var312 <= -3201) {
                                                        if (~var312 <= -3301) {
                                                            if (var312 < 3400) {
                                                                if (var312 == 3300) {
                                                                    class204.field3946[var7++] = class21.field338;
                                                                    continue;
                                                                }
                                                                if (var312 == 3301) {
                                                                    var7 -= 2;
                                                                    int var80 = class204.field3946[var7];
                                                                    int var81 = class204.field3946[var7 + 1];
                                                                    class204.field3946[var7++] = class32.method187(var81, (byte) -123, var80);
                                                                    continue;
                                                                }
                                                                if (var312 == 3302) {
                                                                    var7 -= 2;
                                                                    int var82 = class204.field3946[var7];
                                                                    int var83 = class204.field3946[var7 + 1];
                                                                    class204.field3946[var7++] = class197.method1262(var83, -99, var82);
                                                                    continue;
                                                                }
                                                                if (~var312 == -3304) {
                                                                    var7 -= 2;
                                                                    int var84 = class204.field3946[var7];
                                                                    int var85 = class204.field3946[var7 - -1];
                                                                    class204.field3946[var7++] = class70.method372(var84, (byte) -103, var85);
                                                                    continue;
                                                                }
                                                                if (~var312 == -3305) {
                                                                    --var7;
                                                                    int var86 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = class112.method610((byte) -2, var86).field3962;
                                                                    continue;
                                                                }
                                                                if (~var312 == -3306) {
                                                                    --var7;
                                                                    int var87 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = class180.field3575[var87];
                                                                    continue;
                                                                }
                                                                if (var312 == 3306) {
                                                                    --var7;
                                                                    int var88 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = class12.field193[var88];
                                                                    continue;
                                                                }
                                                                if (~var312 == -3308) {
                                                                    --var7;
                                                                    int var89 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = class184.field3628[var89];
                                                                    continue;
                                                                }
                                                                if (var312 == 3308) {
                                                                    int var90 = (class106.field1940.field2045 >> 7) + class68.field1242;
                                                                    int var91 = (class106.field1940.field2032 >> 7) + class49.field787;
                                                                    int var92 = class114.field2145;
                                                                    class204.field3946[var7++] = (var92 << 28) - -(var91 << 14) - -var90;
                                                                    continue;
                                                                }
                                                                if (var312 == 3309) {
                                                                    --var7;
                                                                    int var93 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = class91.method479(var93 >> 14, 16383);
                                                                    continue;
                                                                }
                                                                if (~var312 == -3311) {
                                                                    --var7;
                                                                    int var94 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = var94 >> 28;
                                                                    continue;
                                                                }
                                                                if (~var312 == -3312) {
                                                                    --var7;
                                                                    int var95 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = class91.method479(var95, 16383);
                                                                    continue;
                                                                }
                                                                if (~var312 == -3313) {
                                                                    class204.field3946[var7++] = class62.field988 ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (var312 == 3313) {
                                                                    var7 -= 2;
                                                                    int var96 = class204.field3946[var7] + 32768;
                                                                    int var97 = class204.field3946[var7 + 1];
                                                                    class204.field3946[var7++] = class32.method187(var97, (byte) -126, var96);
                                                                    continue;
                                                                }
                                                                if (~var312 == -3315) {
                                                                    var7 -= 2;
                                                                    int var98 = class204.field3946[var7 + 1];
                                                                    int var99 = class204.field3946[var7] + 32768;
                                                                    class204.field3946[var7++] = class197.method1262(var98, -67, var99);
                                                                    continue;
                                                                }
                                                                if (~var312 == -3316) {
                                                                    var7 -= 2;
                                                                    int var100 = class204.field3946[var7] - -32768;
                                                                    int var101 = class204.field3946[var7 + 1];
                                                                    class204.field3946[var7++] = class70.method372(var100, (byte) -52, var101);
                                                                    continue;
                                                                }
                                                                if (var312 == 3316) {
                                                                    if (class43.field707 >= 2) {
                                                                        class204.field3946[var7++] = class43.field707;
                                                                    } else {
                                                                        class204.field3946[var7++] = 0;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var312 == 3317) {
                                                                    class204.field3946[var7++] = class184.field3627;
                                                                    continue;
                                                                }
                                                                if (~var312 == -3319) {
                                                                    class204.field3946[var7++] = class204.field3947;
                                                                    continue;
                                                                }
                                                                if (var312 == 3321) {
                                                                    class204.field3946[var7++] = class16.field281;
                                                                    continue;
                                                                }
                                                                if (~var312 == -3323) {
                                                                    class204.field3946[var7++] = class28.field463;
                                                                    continue;
                                                                }
                                                                if (~var312 == -3324) {
                                                                    if (~class43.field707 == -2) {
                                                                        class204.field3946[var7++] = 1;
                                                                    } else {
                                                                        class204.field3946[var7++] = 0;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var312 == -3325) {
                                                                    if (~class122.field2275 <= -6 && class122.field2275 <= 9) {
                                                                        class204.field3946[var7++] = class122.field2275;
                                                                        continue;
                                                                    }
                                                                    class204.field3946[var7++] = 0;
                                                                    continue;
                                                                }
                                                                if (var312 == 3325) {
                                                                    if (~class116.field2170 < -1) {
                                                                        class204.field3946[var7++] = 1;
                                                                    } else {
                                                                        class204.field3946[var7++] = 0;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var312 == 3326) {
                                                                    class204.field3946[var7++] = class106.field1940.field533;
                                                                    continue;
                                                                }
                                                            } else if (var312 < 3500) {
                                                                if (var312 == 3400) {
                                                                    var7 -= 2;
                                                                    int var102 = class204.field3946[var7];
                                                                    int var103 = class204.field3946[var7 + 1];
                                                                    class127 var104 = class191.method1235(256, var102);
                                                                    for (int var105 = 0; ~var104.field2392 < ~var105; ++var105) {
                                                                        if (var104.field2384[var105] == var103) {
                                                                            class133.field2541[var8++] = var104.field2394[var105];
                                                                            var104 = null;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (var104 != null) {
                                                                        class133.field2541[var8++] = var104.field2400;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var312 == 3408) {
                                                                    var7 -= 4;
                                                                    int var106 = class204.field3946[var7];
                                                                    int var107 = class204.field3946[var7 + 2];
                                                                    int var108 = class204.field3946[var7 + 3];
                                                                    int var109 = class204.field3946[var7 + 1];
                                                                    class127 var110 = class191.method1235(256, var107);
                                                                    if (var110.field2387 == var106 && var110.field2382 == var109) {
                                                                        for (int var111 = 0; ~var110.field2392 < ~var111; ++var111) {
                                                                            if (~var110.field2384[var111] == ~var108) {
                                                                                if (~var109 != -116) {
                                                                                    class204.field3946[var7++] = var110.field2397[var111];
                                                                                } else {
                                                                                    class133.field2541[var8++] = var110.field2394[var111];
                                                                                }
                                                                                var110 = null;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (var110 != null) {
                                                                            if (~var109 == -116) {
                                                                                class133.field2541[var8++] = var110.field2400;
                                                                            } else {
                                                                                class204.field3946[var7++] = var110.field2391;
                                                                            }
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var109 != -116) {
                                                                        class204.field3946[var7++] = 0;
                                                                    } else {
                                                                        class133.field2541[var8++] = class46.field736;
                                                                    }
                                                                    continue;
                                                                }
                                                            } else if (~var312 > -3701) {
                                                                if (~var312 == -3601) {
                                                                    if (class37.field624 != 0) {
                                                                        if (~class37.field624 != -2) {
                                                                            class204.field3946[var7++] = class62.field991;
                                                                        } else {
                                                                            class204.field3946[var7++] = -1;
                                                                        }
                                                                    } else {
                                                                        class204.field3946[var7++] = -2;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var312 == 3601) {
                                                                    --var7;
                                                                    int var112 = class204.field3946[var7];
                                                                    if (~class37.field624 == -3 && class62.field991 > var112) {
                                                                        class133.field2541[var8++] = class179.field3549[var112];
                                                                        continue;
                                                                    }
                                                                    class133.field2541[var8++] = class55.field903;
                                                                    continue;
                                                                }
                                                                if (var312 == 3602) {
                                                                    --var7;
                                                                    int var113 = class204.field3946[var7];
                                                                    if (~class37.field624 == -3 && ~class62.field991 < ~var113) {
                                                                        class204.field3946[var7++] = class114.field2119[var113];
                                                                        continue;
                                                                    }
                                                                    class204.field3946[var7++] = 0;
                                                                    continue;
                                                                }
                                                                if (var312 == 3603) {
                                                                    --var7;
                                                                    int var114 = class204.field3946[var7];
                                                                    if (class37.field624 == 2 && class62.field991 > var114) {
                                                                        class204.field3946[var7++] = class205.field3973[var114];
                                                                        continue;
                                                                    }
                                                                    class204.field3946[var7++] = 0;
                                                                    continue;
                                                                }
                                                                if (~var312 == -3605) {
                                                                    --var7;
                                                                    int var115 = class204.field3946[var7];
                                                                    --var8;
                                                                    class93 var116 = class133.field2541[var8];
                                                                    class10.method53(true, var115, var116);
                                                                    continue;
                                                                }
                                                                if (~var312 == -3606) {
                                                                    --var8;
                                                                    class93 var117 = class133.field2541[var8];
                                                                    class30.method178(var117.method482(111), 92);
                                                                    continue;
                                                                }
                                                                if (~var312 == -3607) {
                                                                    --var8;
                                                                    class93 var118 = class133.field2541[var8];
                                                                    class157.method1026(var118.method482(82), -100);
                                                                    continue;
                                                                }
                                                                if (~var312 == -3608) {
                                                                    --var8;
                                                                    class93 var119 = class133.field2541[var8];
                                                                    class167.method1129((byte) 96, var119.method482(-69));
                                                                    continue;
                                                                }
                                                                if (var312 == 3608) {
                                                                    --var8;
                                                                    class93 var120 = class133.field2541[var8];
                                                                    method598(false, var120.method482(-123));
                                                                    continue;
                                                                }
                                                                if (~var312 == -3610) {
                                                                    --var8;
                                                                    class93 var121 = class133.field2541[var8];
                                                                    if (var121.method501(-98, class112.field2082) || var121.method501(-54, class53.field888)) {
                                                                        var121 = var121.method514(71, 7);
                                                                    }
                                                                    class204.field3946[var7++] = class44.method234(true, var121) ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (~var312 == -3612) {
                                                                    if (class194.field3762 == null) {
                                                                        class133.field2541[var8++] = class55.field903;
                                                                    } else {
                                                                        class133.field2541[var8++] = class194.field3762.method505((byte) -81);
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var312 == 3612) {
                                                                    if (class194.field3762 == null) {
                                                                        class204.field3946[var7++] = 0;
                                                                    } else {
                                                                        class204.field3946[var7++] = class103.field1896;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var312 == 3613) {
                                                                    --var7;
                                                                    int var122 = class204.field3946[var7];
                                                                    if (class194.field3762 != null && class103.field1896 > var122) {
                                                                        class133.field2541[var8++] = class98.field1838[var122].field2641.method505((byte) -89);
                                                                        continue;
                                                                    }
                                                                    class133.field2541[var8++] = class55.field903;
                                                                    continue;
                                                                }
                                                                if (var312 == 3614) {
                                                                    --var7;
                                                                    int var123 = class204.field3946[var7];
                                                                    if (class194.field3762 != null && ~var123 > ~class103.field1896) {
                                                                        class204.field3946[var7++] = class98.field1838[var123].field2632;
                                                                        continue;
                                                                    }
                                                                    class204.field3946[var7++] = 0;
                                                                    continue;
                                                                }
                                                                if (~var312 == -3616) {
                                                                    --var7;
                                                                    int var124 = class204.field3946[var7];
                                                                    if (class194.field3762 != null && var124 < class103.field1896) {
                                                                        class204.field3946[var7++] = class98.field1838[var124].field2634;
                                                                        continue;
                                                                    }
                                                                    class204.field3946[var7++] = 0;
                                                                    continue;
                                                                }
                                                                if (~var312 == -3617) {
                                                                    class204.field3946[var7++] = class181.field3582;
                                                                    continue;
                                                                }
                                                                if (~var312 == -3618) {
                                                                    --var8;
                                                                    class93 var125 = class133.field2541[var8];
                                                                    class133.method799(0, var125);
                                                                    continue;
                                                                }
                                                                if (var312 == 3618) {
                                                                    class204.field3946[var7++] = class136.field2640;
                                                                    continue;
                                                                }
                                                                if (var312 == 3619) {
                                                                    --var8;
                                                                    class93 var126 = class133.field2541[var8];
                                                                    class39.method211(85, var126.method482(73));
                                                                    continue;
                                                                }
                                                                if (~var312 == -3621) {
                                                                    class64.method328((byte) 125);
                                                                    continue;
                                                                }
                                                                if (~var312 == -3622) {
                                                                    if (~class37.field624 == -1) {
                                                                        class204.field3946[var7++] = -1;
                                                                    } else {
                                                                        class204.field3946[var7++] = class27.field424;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var312 == 3622) {
                                                                    --var7;
                                                                    int var127 = class204.field3946[var7];
                                                                    if (~class37.field624 != -1 && ~var127 > ~class27.field424) {
                                                                        class133.field2541[var8++] = class133.method797(37, class166.field3280[var127]).method505((byte) -89);
                                                                        continue;
                                                                    }
                                                                    class133.field2541[var8++] = class55.field903;
                                                                    continue;
                                                                }
                                                                if (var312 == 3623) {
                                                                    --var8;
                                                                    class93 var128 = class133.field2541[var8];
                                                                    if (var128.method501(-120, class112.field2082) || var128.method501(-109, class53.field888)) {
                                                                        var128 = var128.method514(65, 7);
                                                                    }
                                                                    class204.field3946[var7++] = class93.method493((byte) 27, var128) ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (var312 == 3624) {
                                                                    --var7;
                                                                    int var129 = class204.field3946[var7];
                                                                    if (class98.field1838 != null && ~class103.field1896 < ~var129 && class98.field1838[var129].field2641.method523(117, class106.field1940.field550)) {
                                                                        class204.field3946[var7++] = 1;
                                                                        continue;
                                                                    }
                                                                    class204.field3946[var7++] = 0;
                                                                    continue;
                                                                }
                                                                if (~var312 == -3626) {
                                                                    if (class24.field368 == null) {
                                                                        class133.field2541[var8++] = class55.field903;
                                                                    } else {
                                                                        class133.field2541[var8++] = class24.field368.method505((byte) -88);
                                                                    }
                                                                    continue;
                                                                }
                                                            } else if (var312 < 4000) {
                                                                if (~var312 == -3904) {
                                                                    --var7;
                                                                    int var130 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = class63.field999[var130].method312((byte) 51);
                                                                    continue;
                                                                }
                                                                if (var312 == 3904) {
                                                                    --var7;
                                                                    int var131 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = class63.field999[var131].field960;
                                                                    continue;
                                                                }
                                                                if (var312 == 3905) {
                                                                    --var7;
                                                                    int var132 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = class63.field999[var132].field954;
                                                                    continue;
                                                                }
                                                                if (~var312 == -3907) {
                                                                    --var7;
                                                                    int var133 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = class63.field999[var133].field951;
                                                                    continue;
                                                                }
                                                                if (var312 == 3907) {
                                                                    --var7;
                                                                    int var134 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = class63.field999[var134].field956;
                                                                    continue;
                                                                }
                                                                if (~var312 == -3909) {
                                                                    --var7;
                                                                    int var135 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = class63.field999[var135].field957;
                                                                    continue;
                                                                }
                                                                if (var312 == 3910) {
                                                                    --var7;
                                                                    int var136 = class204.field3946[var7];
                                                                    int var137 = class63.field999[var136].method313(16890);
                                                                    class204.field3946[var7++] = ~var137 == -1 ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (var312 == 3911) {
                                                                    --var7;
                                                                    int var138 = class204.field3946[var7];
                                                                    int var139 = class63.field999[var138].method313(16890);
                                                                    class204.field3946[var7++] = ~var139 == -3 ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (var312 == 3912) {
                                                                    --var7;
                                                                    int var140 = class204.field3946[var7];
                                                                    int var141 = class63.field999[var140].method313(16890);
                                                                    class204.field3946[var7++] = ~var141 != -6 ? 0 : 1;
                                                                    continue;
                                                                }
                                                                if (~var312 == -3914) {
                                                                    --var7;
                                                                    int var142 = class204.field3946[var7];
                                                                    int var143 = class63.field999[var142].method313(16890);
                                                                    class204.field3946[var7++] = ~var143 == -2 ? 1 : 0;
                                                                    continue;
                                                                }
                                                            } else if (~var312 > -4101) {
                                                                if (~var312 == -4001) {
                                                                    var7 -= 2;
                                                                    int var144 = class204.field3946[var7];
                                                                    int var145 = class204.field3946[var7 + 1];
                                                                    class204.field3946[var7++] = var144 - -var145;
                                                                    continue;
                                                                }
                                                                if (var312 == 4001) {
                                                                    var7 -= 2;
                                                                    int var146 = class204.field3946[var7];
                                                                    int var147 = class204.field3946[var7 + 1];
                                                                    class204.field3946[var7++] = -var147 + var146;
                                                                    continue;
                                                                }
                                                                if (~var312 == -4003) {
                                                                    var7 -= 2;
                                                                    int var148 = class204.field3946[var7 + 1];
                                                                    int var149 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = var148 * var149;
                                                                    continue;
                                                                }
                                                                if (~var312 == -4004) {
                                                                    var7 -= 2;
                                                                    int var150 = class204.field3946[var7];
                                                                    int var151 = class204.field3946[var7 + 1];
                                                                    class204.field3946[var7++] = var150 / var151;
                                                                    continue;
                                                                }
                                                                if (~var312 == -4005) {
                                                                    --var7;
                                                                    int var152 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = (int) ((double) var152 * Math.random());
                                                                    continue;
                                                                }
                                                                if (var312 == 4005) {
                                                                    --var7;
                                                                    int var153 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = (int) ((double) (var153 + 1) * Math.random());
                                                                    continue;
                                                                }
                                                                if (var312 == 4006) {
                                                                    var7 -= 5;
                                                                    int var154 = class204.field3946[var7];
                                                                    int var155 = class204.field3946[var7 + 1];
                                                                    int var156 = class204.field3946[var7 + 2];
                                                                    int var157 = class204.field3946[var7 + 3];
                                                                    int var158 = class204.field3946[var7 + 4];
                                                                    class204.field3946[var7++] = (-var154 + var155) * (-var156 + var158) / (-var156 + var157) + var154;
                                                                    continue;
                                                                }
                                                                if (var312 == 4007) {
                                                                    var7 -= 2;
                                                                    int var159 = class204.field3946[var7 + 1];
                                                                    int var160 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = var160 - -(var159 * var160 / 100);
                                                                    continue;
                                                                }
                                                                if (var312 == 4008) {
                                                                    var7 -= 2;
                                                                    int var161 = class204.field3946[var7];
                                                                    int var162 = class204.field3946[var7 + 1];
                                                                    class204.field3946[var7++] = class112.method607(1 << var162, var161);
                                                                    continue;
                                                                }
                                                                if (var312 == 4009) {
                                                                    var7 -= 2;
                                                                    int var163 = class204.field3946[var7];
                                                                    int var164 = class204.field3946[var7 - -1];
                                                                    class204.field3946[var7++] = class91.method479(var163, -1 - (1 << var164));
                                                                    continue;
                                                                }
                                                                if (var312 == 4010) {
                                                                    var7 -= 2;
                                                                    int var165 = class204.field3946[var7 + 1];
                                                                    int var166 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = class91.method479(var166, 1 << var165) == 0 ? 0 : 1;
                                                                    continue;
                                                                }
                                                                if (~var312 == -4012) {
                                                                    var7 -= 2;
                                                                    int var167 = class204.field3946[var7];
                                                                    int var168 = class204.field3946[var7 - -1];
                                                                    class204.field3946[var7++] = var167 % var168;
                                                                    continue;
                                                                }
                                                                if (~var312 == -4013) {
                                                                    var7 -= 2;
                                                                    int var169 = class204.field3946[var7 + 1];
                                                                    int var170 = class204.field3946[var7];
                                                                    if (~var170 == -1) {
                                                                        class204.field3946[var7++] = 0;
                                                                    } else {
                                                                        class204.field3946[var7++] = (int) Math.pow((double) var170, (double) var169);
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var312 == 4013) {
                                                                    var7 -= 2;
                                                                    int var171 = class204.field3946[var7 + 1];
                                                                    int var172 = class204.field3946[var7];
                                                                    if (var172 != 0) {
                                                                        if (var171 == 0) {
                                                                            class204.field3946[var7++] = Integer.MAX_VALUE;
                                                                        } else {
                                                                            class204.field3946[var7++] = (int) Math.pow((double) var172, 1.0D / (double) var171);
                                                                        }
                                                                    } else {
                                                                        class204.field3946[var7++] = 0;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var312 == 4014) {
                                                                    var7 -= 2;
                                                                    int var173 = class204.field3946[var7];
                                                                    int var174 = class204.field3946[var7 + 1];
                                                                    class204.field3946[var7++] = class91.method479(var173, var174);
                                                                    continue;
                                                                }
                                                                if (var312 == 4015) {
                                                                    var7 -= 2;
                                                                    int var175 = class204.field3946[var7];
                                                                    int var176 = class204.field3946[var7 + 1];
                                                                    class204.field3946[var7++] = class112.method607(var175, var176);
                                                                    continue;
                                                                }
                                                                if (var312 == 4016) {
                                                                    var7 -= 2;
                                                                    int var177 = class204.field3946[var7];
                                                                    int var178 = class204.field3946[var7 - -1];
                                                                    class204.field3946[var7++] = ~var178 >= ~var177 ? var178 : var177;
                                                                    continue;
                                                                }
                                                                if (~var312 == -4018) {
                                                                    var7 -= 2;
                                                                    int var179 = class204.field3946[var7];
                                                                    int var180 = class204.field3946[var7 - -1];
                                                                    class204.field3946[var7++] = ~var180 <= ~var179 ? var180 : var179;
                                                                    continue;
                                                                }
                                                                if (var312 == 4018) {
                                                                    var7 -= 3;
                                                                    long var181 = (long) class204.field3946[var7 + 1];
                                                                    long var183 = (long) class204.field3946[var7];
                                                                    long var185 = (long) class204.field3946[var7 + 2];
                                                                    class204.field3946[var7++] = (int) (var183 * var185 / var181);
                                                                    continue;
                                                                }
                                                            } else if (~var312 > -4201) {
                                                                if (~var312 == -4101) {
                                                                    --var7;
                                                                    int var187 = class204.field3946[var7];
                                                                    --var8;
                                                                    class93 var188 = class133.field2541[var8];
                                                                    class133.field2541[var8++] = class203.method1321(new class93[] { var188, class67.method357((byte) -102, var187) }, 111);
                                                                    continue;
                                                                }
                                                                if (var312 == 4101) {
                                                                    var8 -= 2;
                                                                    class93 var189 = class133.field2541[var8 + 1];
                                                                    class93 var190 = class133.field2541[var8];
                                                                    class133.field2541[var8++] = class203.method1321(new class93[] { var190, var189 }, -111);
                                                                    continue;
                                                                }
                                                                if (var312 == 4102) {
                                                                    --var8;
                                                                    class93 var191 = class133.field2541[var8];
                                                                    --var7;
                                                                    int var192 = class204.field3946[var7];
                                                                    class133.field2541[var8++] = class203.method1321(new class93[] { var191, class78.method397((byte) -85, var192, true) }, 90);
                                                                    continue;
                                                                }
                                                                if (~var312 == -4104) {
                                                                    --var8;
                                                                    class93 var193 = class133.field2541[var8];
                                                                    class133.field2541[var8++] = var193.method487(10110);
                                                                    continue;
                                                                }
                                                                if (~var312 == -4105) {
                                                                    --var7;
                                                                    int var194 = class204.field3946[var7];
                                                                    long var195 = ((long) var194 - -11745L) * 86400000L;
                                                                    class69.field1280.setTime(new Date(var195));
                                                                    int var197 = class69.field1280.get(5);
                                                                    int var198 = class69.field1280.get(2);
                                                                    int var199 = class69.field1280.get(1);
                                                                    class133.field2541[var8++] = class203.method1321(new class93[] { class67.method357((byte) -122, var197), class165.field3248, class205.field3975[var198], class165.field3248, class67.method357((byte) -127, var199) }, 94);
                                                                    continue;
                                                                }
                                                                if (var312 == 4105) {
                                                                    var8 -= 2;
                                                                    class93 var200 = class133.field2541[var8];
                                                                    class93 var201 = class133.field2541[var8 - -1];
                                                                    if (class106.field1940.field560 != null && class106.field1940.field560.field2767) {
                                                                        class133.field2541[var8++] = var201;
                                                                        continue;
                                                                    }
                                                                    class133.field2541[var8++] = var200;
                                                                    continue;
                                                                }
                                                                if (var312 == 4106) {
                                                                    --var7;
                                                                    int var202 = class204.field3946[var7];
                                                                    class133.field2541[var8++] = class67.method357((byte) -118, var202);
                                                                    continue;
                                                                }
                                                                if (var312 == 4107) {
                                                                    var8 -= 2;
                                                                    class204.field3946[var7++] = class133.field2541[var8].method507(class133.field2541[var8 + 1], 0);
                                                                    continue;
                                                                }
                                                                if (~var312 == -4109) {
                                                                    var7 -= 2;
                                                                    --var8;
                                                                    class93 var203 = class133.field2541[var8];
                                                                    int var204 = class204.field3946[var7 + 1];
                                                                    int var205 = class204.field3946[var7];
                                                                    byte[] var206 = class49.field789.method461(var204, (byte) 72, 0);
                                                                    class45 var207 = new class45(var206);
                                                                    class204.field3946[var7++] = var207.method1020(var203, var205);
                                                                    continue;
                                                                }
                                                                if (var312 == 4109) {
                                                                    --var8;
                                                                    class93 var208 = class133.field2541[var8];
                                                                    var7 -= 2;
                                                                    int var209 = class204.field3946[var7];
                                                                    int var210 = class204.field3946[var7 - -1];
                                                                    byte[] var211 = class49.field789.method461(var210, (byte) 76, 0);
                                                                    class45 var212 = new class45(var211);
                                                                    class204.field3946[var7++] = var212.method1003(var208, var209);
                                                                    continue;
                                                                }
                                                                if (var312 == 4110) {
                                                                    var8 -= 2;
                                                                    class93 var213 = class133.field2541[var8];
                                                                    class93 var214 = class133.field2541[var8 + 1];
                                                                    --var7;
                                                                    if (~class204.field3946[var7] != -2) {
                                                                        class133.field2541[var8++] = var214;
                                                                    } else {
                                                                        class133.field2541[var8++] = var213;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var312 == -4112) {
                                                                    --var8;
                                                                    class93 var215 = class133.field2541[var8];
                                                                    class133.field2541[var8++] = class156.method1007(var215);
                                                                    continue;
                                                                }
                                                                if (var312 == 4112) {
                                                                    --var7;
                                                                    int var216 = class204.field3946[var7];
                                                                    --var8;
                                                                    class93 var217 = class133.field2541[var8];
                                                                    class133.field2541[var8++] = var217.method492(var216, false);
                                                                    continue;
                                                                }
                                                                if (~var312 == -4114) {
                                                                    --var7;
                                                                    int var218 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = !class130.method762(32, var218) ? 0 : 1;
                                                                    continue;
                                                                }
                                                                if (var312 == 4114) {
                                                                    --var7;
                                                                    int var219 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = !class44.method236(false, var219) ? 0 : 1;
                                                                    continue;
                                                                }
                                                                if (var312 == 4115) {
                                                                    --var7;
                                                                    int var220 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = class110.method594(97, var220) ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (var312 == 4116) {
                                                                    --var7;
                                                                    int var221 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = class40.method216((byte) 115, var221) ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (~var312 == -4118) {
                                                                    --var8;
                                                                    class93 var222 = class133.field2541[var8];
                                                                    if (var222 != null) {
                                                                        class204.field3946[var7++] = var222.method510(24);
                                                                    } else {
                                                                        class204.field3946[var7++] = 0;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var312 == -4119) {
                                                                    var7 -= 2;
                                                                    --var8;
                                                                    class93 var223 = class133.field2541[var8];
                                                                    int var224 = class204.field3946[var7];
                                                                    int var225 = class204.field3946[var7 + 1];
                                                                    class133.field2541[var8++] = var223.method497((byte) -78, var225, var224);
                                                                    continue;
                                                                }
                                                                if (~var312 == -4120) {
                                                                    --var8;
                                                                    class93 var226 = class133.field2541[var8];
                                                                    boolean var227 = false;
                                                                    class93 var228 = class108.method593(-2, var226.method510(102));
                                                                    for (int var229 = 0; ~var229 > ~var226.method510(18); ++var229) {
                                                                        int var230 = var226.method491((byte) -121, var229);
                                                                        if (var230 == 60) {
                                                                            var227 = true;
                                                                        } else if (var230 != 62) {
                                                                            if (!var227) {
                                                                                var228.method495(var230, 126);
                                                                            }
                                                                        } else {
                                                                            var227 = false;
                                                                        }
                                                                    }
                                                                    var228.method524(32);
                                                                    class133.field2541[var8++] = var228;
                                                                    continue;
                                                                }
                                                                if (~var312 == -4121) {
                                                                    var7 -= 2;
                                                                    --var8;
                                                                    class93 var231 = class133.field2541[var8];
                                                                    int var232 = class204.field3946[var7];
                                                                    int var233 = class204.field3946[var7 - -1];
                                                                    class204.field3946[var7++] = var231.method502(var233, (byte) 105, var232);
                                                                    continue;
                                                                }
                                                                if (~var312 == -4122) {
                                                                    var8 -= 2;
                                                                    class93 var234 = class133.field2541[var8];
                                                                    --var7;
                                                                    int var235 = class204.field3946[var7];
                                                                    class93 var236 = class133.field2541[var8 + 1];
                                                                    class204.field3946[var7++] = var234.method517(1, var236, var235);
                                                                    continue;
                                                                }
                                                            } else if (var312 < 4300) {
                                                                if (~var312 == -4201) {
                                                                    --var7;
                                                                    int var237 = class204.field3946[var7];
                                                                    class133.field2541[var8++] = class166.method1126(105, var237).field3281;
                                                                    continue;
                                                                }
                                                                if (~var312 == -4202) {
                                                                    var7 -= 2;
                                                                    int var238 = class204.field3946[var7];
                                                                    int var239 = class204.field3946[var7 + 1];
                                                                    class166 var240 = class166.method1126(114, var238);
                                                                    if (~var239 <= -2 && var239 <= 5 && var240.field3306[var239 + -1] != null) {
                                                                        class133.field2541[var8++] = var240.field3306[var239 + -1];
                                                                        continue;
                                                                    }
                                                                    class133.field2541[var8++] = class55.field903;
                                                                    continue;
                                                                }
                                                                if (~var312 == -4203) {
                                                                    var7 -= 2;
                                                                    int var241 = class204.field3946[var7];
                                                                    int var242 = class204.field3946[var7 + 1];
                                                                    class166 var243 = class166.method1126(-111, var241);
                                                                    if (~var242 <= -2 && ~var242 >= -6 && var243.field3278[var242 + -1] != null) {
                                                                        class133.field2541[var8++] = var243.field3278[var242 - 1];
                                                                        continue;
                                                                    }
                                                                    class133.field2541[var8++] = class55.field903;
                                                                    continue;
                                                                }
                                                                if (var312 == 4203) {
                                                                    --var7;
                                                                    int var244 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = class166.method1126(91, var244).field3291;
                                                                    continue;
                                                                }
                                                                if (var312 == 4204) {
                                                                    --var7;
                                                                    int var245 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = ~class166.method1126(13, var245).field3288 != -2 ? 0 : 1;
                                                                    continue;
                                                                }
                                                                if (var312 == 4205) {
                                                                    --var7;
                                                                    int var246 = class204.field3946[var7];
                                                                    class166 var247 = class166.method1126(-81, var246);
                                                                    if (var247.field3302 == -1 && ~var247.field3301 <= -1) {
                                                                        class204.field3946[var7++] = var247.field3301;
                                                                        continue;
                                                                    }
                                                                    class204.field3946[var7++] = var246;
                                                                    continue;
                                                                }
                                                                if (var312 == 4206) {
                                                                    --var7;
                                                                    int var248 = class204.field3946[var7];
                                                                    class166 var249 = class166.method1126(114, var248);
                                                                    if (var249.field3302 >= 0 && var249.field3301 >= 0) {
                                                                        class204.field3946[var7++] = var249.field3301;
                                                                        continue;
                                                                    }
                                                                    class204.field3946[var7++] = var248;
                                                                    continue;
                                                                }
                                                                if (~var312 == -4208) {
                                                                    --var7;
                                                                    int var250 = class204.field3946[var7];
                                                                    class204.field3946[var7++] = class166.method1126(-56, var250).field3284 ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (var312 == 4210) {
                                                                    --var8;
                                                                    class93 var251 = class133.field2541[var8];
                                                                    --var7;
                                                                    int var252 = class204.field3946[var7];
                                                                    class181.method1182(var252 == 1, true, var251);
                                                                    class204.field3946[var7++] = class158.field3150;
                                                                    continue;
                                                                }
                                                                if (var312 == 4211) {
                                                                    if (class137.field2654 != null && class158.field3150 > class203.field3933) {
                                                                        class204.field3946[var7++] = class91.method479(class137.field2654[class203.field3933++], 65535);
                                                                        continue;
                                                                    }
                                                                    class204.field3946[var7++] = -1;
                                                                    continue;
                                                                }
                                                                if (var312 == 4212) {
                                                                    class203.field3933 = 0;
                                                                    continue;
                                                                }
                                                            } else if (~var312 > -5101) {
                                                                if (var312 == 5000) {
                                                                    class204.field3946[var7++] = class172.field3403;
                                                                    continue;
                                                                }
                                                                if (~var312 == -5002) {
                                                                    var7 -= 3;
                                                                    ++class69.field1271;
                                                                    class172.field3403 = class204.field3946[var7];
                                                                    class80.field1422 = class204.field3946[var7 + 1];
                                                                    class158.field3136 = class204.field3946[var7 + 2];
                                                                    class151.field2908.method47(66, 8);
                                                                    class151.field2908.method1069(class172.field3403, (byte) -26);
                                                                    class151.field2908.method1069(class80.field1422, (byte) -26);
                                                                    class151.field2908.method1069(class158.field3136, (byte) -26);
                                                                    continue;
                                                                }
                                                                if (var312 == 5002) {
                                                                    var7 -= 2;
                                                                    ++class13.field222;
                                                                    int var253 = class204.field3946[var7 - -1];
                                                                    --var8;
                                                                    class93 var254 = class133.field2541[var8];
                                                                    int var255 = class204.field3946[var7];
                                                                    class151.field2908.method47(41, 8);
                                                                    class151.field2908.method1064(var254.method482(123), -1);
                                                                    class151.field2908.method1069(var255 + -1, (byte) -26);
                                                                    class151.field2908.method1069(var253, (byte) -26);
                                                                    continue;
                                                                }
                                                                if (~var312 == -5004) {
                                                                    class93 var256 = null;
                                                                    --var7;
                                                                    int var257 = class204.field3946[var7];
                                                                    if (var257 < 100) {
                                                                        var256 = class161.field3223[var257];
                                                                    }
                                                                    if (var256 == null) {
                                                                        var256 = class55.field903;
                                                                    }
                                                                    class133.field2541[var8++] = var256;
                                                                    continue;
                                                                }
                                                                if (var312 == 5004) {
                                                                    int var258 = -1;
                                                                    --var7;
                                                                    int var259 = class204.field3946[var7];
                                                                    if (var259 < 100 && class161.field3223[var259] != null) {
                                                                        var258 = class82.field1519[var259];
                                                                    }
                                                                    class204.field3946[var7++] = var258;
                                                                    continue;
                                                                }
                                                                if (var312 == 5005) {
                                                                    class204.field3946[var7++] = class80.field1422;
                                                                    continue;
                                                                }
                                                                if (var312 == 5008) {
                                                                    --var8;
                                                                    class93 var260 = class133.field2541[var8];
                                                                    if (var260.method501(-75, class21.field333)) {
                                                                        class71.method377(-1, var260);
                                                                    } else {
                                                                        ++class144.field2816;
                                                                        class93 var261 = var260.method487(10110);
                                                                        byte var262 = 0;
                                                                        byte var263 = 0;
                                                                        if (var261.method501(-6, class102.field1886)) {
                                                                            var263 = 0;
                                                                            var260 = var260.method514(71, class102.field1886.method510(110));
                                                                        } else if (!var261.method501(-73, class80.field1435)) {
                                                                            if (!var261.method501(-18, class201.field3898)) {
                                                                                if (var261.method501(-126, class76.field1367)) {
                                                                                    var263 = 3;
                                                                                    var260 = var260.method514(75, class76.field1367.method510(117));
                                                                                } else if (var261.method501(-11, class177.field3519)) {
                                                                                    var263 = 4;
                                                                                    var260 = var260.method514(76, class177.field3519.method510(28));
                                                                                } else if (!var261.method501(-44, class178.field3533)) {
                                                                                    if (var261.method501(-6, class35.field572)) {
                                                                                        var260 = var260.method514(89, class35.field572.method510(98));
                                                                                        var263 = 6;
                                                                                    } else if (var261.method501(-128, class177.field3531)) {
                                                                                        var260 = var260.method514(126, class177.field3531.method510(114));
                                                                                        var263 = 7;
                                                                                    } else if (!var261.method501(-30, class135.field2627)) {
                                                                                        if (!var261.method501(-36, class114.field2122)) {
                                                                                            if (var261.method501(-49, class73.field1352)) {
                                                                                                var263 = 10;
                                                                                                var260 = var260.method514(74, class73.field1352.method510(81));
                                                                                            } else if (!var261.method501(-74, class141.field2766)) {
                                                                                                if (~class139.field2693 != -1) {
                                                                                                    if (!var261.method501(-112, class102.field1884)) {
                                                                                                        if (var261.method501(-109, class80.field1434)) {
                                                                                                            var260 = var260.method514(50, class80.field1434.method510(38));
                                                                                                            var263 = 1;
                                                                                                        } else if (!var261.method501(-116, class201.field3902)) {
                                                                                                            if (var261.method501(-100, class76.field1366)) {
                                                                                                                var263 = 3;
                                                                                                                var260 = var260.method514(82, class76.field1366.method510(109));
                                                                                                            } else if (!var261.method501(-74, class177.field3515)) {
                                                                                                                if (!var261.method501(-13, class178.field3536)) {
                                                                                                                    if (var261.method501(-89, class35.field569)) {
                                                                                                                        var260 = var260.method514(83, class35.field569.method510(125));
                                                                                                                        var263 = 6;
                                                                                                                    } else if (var261.method501(-76, class177.field3530)) {
                                                                                                                        var260 = var260.method514(68, class177.field3530.method510(69));
                                                                                                                        var263 = 7;
                                                                                                                    } else if (!var261.method501(-53, class135.field2621)) {
                                                                                                                        if (var261.method501(-46, class114.field2116)) {
                                                                                                                            var260 = var260.method514(83, class114.field2116.method510(109));
                                                                                                                            var263 = 9;
                                                                                                                        } else if (var261.method501(-122, class73.field1349)) {
                                                                                                                            var263 = 10;
                                                                                                                            var260 = var260.method514(100, class73.field1349.method510(40));
                                                                                                                        } else if (var261.method501(-46, class141.field2752)) {
                                                                                                                            var263 = 11;
                                                                                                                            var260 = var260.method514(66, class141.field2752.method510(76));
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var263 = 8;
                                                                                                                        var260 = var260.method514(98, class135.field2621.method510(29));
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    var263 = 5;
                                                                                                                    var260 = var260.method514(108, class178.field3536.method510(118));
                                                                                                                }
                                                                                                            } else {
                                                                                                                var260 = var260.method514(84, class177.field3515.method510(88));
                                                                                                                var263 = 4;
                                                                                                            }
                                                                                                        } else {
                                                                                                            var260 = var260.method514(77, class201.field3902.method510(36));
                                                                                                            var263 = 2;
                                                                                                        }
                                                                                                    } else {
                                                                                                        var260 = var260.method514(98, class102.field1884.method510(70));
                                                                                                        var263 = 0;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var260 = var260.method514(110, class141.field2766.method510(71));
                                                                                                var263 = 11;
                                                                                            }
                                                                                        } else {
                                                                                            var260 = var260.method514(62, class114.field2122.method510(82));
                                                                                            var263 = 9;
                                                                                        }
                                                                                    } else {
                                                                                        var263 = 8;
                                                                                        var260 = var260.method514(105, class135.field2627.method510(62));
                                                                                    }
                                                                                } else {
                                                                                    var260 = var260.method514(77, class178.field3533.method510(40));
                                                                                    var263 = 5;
                                                                                }
                                                                            } else {
                                                                                var260 = var260.method514(76, class201.field3898.method510(68));
                                                                                var263 = 2;
                                                                            }
                                                                        } else {
                                                                            var263 = 1;
                                                                            var260 = var260.method514(118, class80.field1435.method510(55));
                                                                        }
                                                                        class93 var264 = var260.method487(10110);
                                                                        if (var264.method501(-127, class137.field2648)) {
                                                                            var262 = 1;
                                                                            var260 = var260.method514(83, class137.field2648.method510(122));
                                                                        } else if (var264.method501(-83, class158.field3158)) {
                                                                            var262 = 2;
                                                                            var260 = var260.method514(114, class158.field3158.method510(59));
                                                                        } else if (!var264.method501(-53, class179.field3550)) {
                                                                            if (var264.method501(-34, class166.field3329)) {
                                                                                var262 = 4;
                                                                                var260 = var260.method514(83, class166.field3329.method510(127));
                                                                            } else if (!var264.method501(-63, class139.field2699)) {
                                                                                if (class139.field2693 != 0) {
                                                                                    if (!var264.method501(-66, class137.field2652)) {
                                                                                        if (!var264.method501(-84, class158.field3137)) {
                                                                                            if (!var264.method501(-7, class179.field3558)) {
                                                                                                if (var264.method501(-62, class166.field3317)) {
                                                                                                    var262 = 4;
                                                                                                    var260 = var260.method514(66, class166.field3317.method510(34));
                                                                                                } else if (var264.method501(-80, class139.field2702)) {
                                                                                                    var260 = var260.method514(116, class139.field2702.method510(39));
                                                                                                    var262 = 5;
                                                                                                }
                                                                                            } else {
                                                                                                var262 = 3;
                                                                                                var260 = var260.method514(76, class179.field3558.method510(30));
                                                                                            }
                                                                                        } else {
                                                                                            var260 = var260.method514(61, class158.field3137.method510(122));
                                                                                            var262 = 2;
                                                                                        }
                                                                                    } else {
                                                                                        var260 = var260.method514(83, class137.field2652.method510(53));
                                                                                        var262 = 1;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                var260 = var260.method514(127, class139.field2699.method510(106));
                                                                                var262 = 5;
                                                                            }
                                                                        } else {
                                                                            var262 = 3;
                                                                            var260 = var260.method514(82, class179.field3550.method510(81));
                                                                        }
                                                                        class151.field2908.method47(54, 8);
                                                                        class151.field2908.method1069(0, (byte) -26);
                                                                        int var265 = class151.field2908.field3153;
                                                                        class151.field2908.method1069(var263, (byte) -26);
                                                                        class151.field2908.method1069(var262, (byte) -26);
                                                                        class82.method420(var260, class151.field2908, (byte) -119);
                                                                        class151.field2908.method1085(-120, class151.field2908.field3153 - var265);
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var312 == -5010) {
                                                                    ++class203.field3918;
                                                                    var8 -= 2;
                                                                    class93 var266 = class133.field2541[var8 + 1];
                                                                    class93 var267 = class133.field2541[var8];
                                                                    class151.field2908.method47(184, 8);
                                                                    class151.field2908.method1069(0, (byte) -26);
                                                                    int var268 = class151.field2908.field3153;
                                                                    class151.field2908.method1064(var267.method482(-46), -1);
                                                                    class82.method420(var266, class151.field2908, (byte) -119);
                                                                    class151.field2908.method1085(-127, -var268 + class151.field2908.field3153);
                                                                    continue;
                                                                }
                                                                if (var312 == 5010) {
                                                                    class93 var269 = null;
                                                                    --var7;
                                                                    int var270 = class204.field3946[var7];
                                                                    if (var270 < 100) {
                                                                        var269 = class34.field561[var270];
                                                                    }
                                                                    if (var269 == null) {
                                                                        var269 = class55.field903;
                                                                    }
                                                                    class133.field2541[var8++] = var269;
                                                                    continue;
                                                                }
                                                                if (var312 == 5011) {
                                                                    --var7;
                                                                    int var271 = class204.field3946[var7];
                                                                    class93 var272 = null;
                                                                    if (~var271 > -101) {
                                                                        var272 = class206.field4031[var271];
                                                                    }
                                                                    if (var272 == null) {
                                                                        var272 = class55.field903;
                                                                    }
                                                                    class133.field2541[var8++] = var272;
                                                                    continue;
                                                                }
                                                                if (var312 == 5015) {
                                                                    class93 var273;
                                                                    if (class106.field1940 != null && class106.field1940.field550 != null) {
                                                                        var273 = class106.field1940.field550;
                                                                    } else {
                                                                        var273 = class148.field2862;
                                                                    }
                                                                    class133.field2541[var8++] = var273;
                                                                    continue;
                                                                }
                                                                if (~var312 == -5017) {
                                                                    class204.field3946[var7++] = class158.field3136;
                                                                    continue;
                                                                }
                                                                if (var312 == 5017) {
                                                                    class204.field3946[var7++] = class80.field1421;
                                                                    continue;
                                                                }
                                                            }
                                                        } else {
                                                            if (var312 == 3200) {
                                                                var7 -= 3;
                                                                class13.method73(class204.field3946[var7 + 1], 1, class204.field3946[var7 + 2], class204.field3946[var7]);
                                                                continue;
                                                            }
                                                            if (var312 == 3201) {
                                                                --var7;
                                                                class70.method371((byte) -38, class204.field3946[var7]);
                                                                continue;
                                                            }
                                                            if (~var312 == -3203) {
                                                                var7 -= 2;
                                                                class23.method136(class204.field3946[var7], class204.field3946[var7 + 1], 22607);
                                                                continue;
                                                            }
                                                        }
                                                    } else {
                                                        if (~var312 == -3101) {
                                                            --var8;
                                                            class93 var274 = class133.field2541[var8];
                                                            class189.method1223(0, class55.field903, 2249, var274);
                                                            continue;
                                                        }
                                                        if (var312 == 3101) {
                                                            var7 -= 2;
                                                            class184.method1193(class204.field3946[var7 - -1], -96, class204.field3946[var7], class106.field1940);
                                                            continue;
                                                        }
                                                        if (~var312 == -3104) {
                                                            class16.method95(0);
                                                            continue;
                                                        }
                                                        if (~var312 == -3105) {
                                                            --var8;
                                                            class93 var275 = class133.field2541[var8];
                                                            ++class207.field4052;
                                                            int var276 = 0;
                                                            if (var275.method490((byte) -120)) {
                                                                var276 = var275.method520((byte) 67);
                                                            }
                                                            class151.field2908.method47(254, 8);
                                                            class151.field2908.method1051(true, var276);
                                                            continue;
                                                        }
                                                        if (~var312 == -3106) {
                                                            ++class166.field3303;
                                                            --var8;
                                                            class93 var277 = class133.field2541[var8];
                                                            class151.field2908.method47(76, 8);
                                                            class151.field2908.method1064(var277.method482(-61), -1);
                                                            continue;
                                                        }
                                                        if (~var312 == -3107) {
                                                            ++class201.field3893;
                                                            --var8;
                                                            class93 var278 = class133.field2541[var8];
                                                            class151.field2908.method47(141, 8);
                                                            class151.field2908.method1069(var278.method510(37) + 1, (byte) -26);
                                                            class151.field2908.method1052((byte) 110, var278);
                                                            continue;
                                                        }
                                                        if (var312 == 3107) {
                                                            --var7;
                                                            int var279 = class204.field3946[var7];
                                                            --var8;
                                                            class93 var280 = class133.field2541[var8];
                                                            class19.method115(var279, -104, var280);
                                                            continue;
                                                        }
                                                        if (~var312 == -3109) {
                                                            var7 -= 3;
                                                            int var281 = class204.field3946[var7 - -1];
                                                            int var282 = class204.field3946[var7];
                                                            int var283 = class204.field3946[var7 + 2];
                                                            class65 var284 = class204.method1325(65535, var283);
                                                            class36.method197(var281, (byte) -69, var284, var282);
                                                            continue;
                                                        }
                                                        if (var312 == 3109) {
                                                            var7 -= 2;
                                                            int var285 = class204.field3946[var7];
                                                            class65 var286 = !var43 ? class183.field3611 : class85.field1558;
                                                            int var287 = class204.field3946[var7 - -1];
                                                            class36.method197(var287, (byte) 64, var286, var285);
                                                            continue;
                                                        }
                                                        if (~var312 == -3111) {
                                                            --var7;
                                                            int var288 = class204.field3946[var7];
                                                            ++class98.field1830;
                                                            class151.field2908.method47(225, 8);
                                                            class151.field2908.method1061(var288, 12184);
                                                            continue;
                                                        }
                                                    }
                                                } else {
                                                    --var7;
                                                    class65 var289 = class204.method1325(65535, class204.field3946[var7]);
                                                    if (~var312 == -2801) {
                                                        class204.field3946[var7++] = class158.method1084(75, class178.method1173(var289, 126));
                                                        continue;
                                                    }
                                                    if (var312 == 2801) {
                                                        --var7;
                                                        int var290 = class204.field3946[var7];
                                                        int var313 = var290 - 1;
                                                        if (var289.field1161 != null && var313 < var289.field1161.length && var289.field1161[var313] != null) {
                                                            class133.field2541[var8++] = var289.field1161[var313];
                                                            continue;
                                                        }
                                                        class133.field2541[var8++] = class55.field903;
                                                        continue;
                                                    }
                                                    if (var312 == 2802) {
                                                        if (var289.field1096 != null) {
                                                            class133.field2541[var8++] = var289.field1096;
                                                        } else {
                                                            class133.field2541[var8++] = class55.field903;
                                                        }
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                --var7;
                                                class65 var291 = class204.method1325(65535, class204.field3946[var7]);
                                                if (var312 == 2600) {
                                                    class204.field3946[var7++] = var291.field1122;
                                                    continue;
                                                }
                                                if (var312 == 2601) {
                                                    class204.field3946[var7++] = var291.field1162;
                                                    continue;
                                                }
                                                if (var312 == 2602) {
                                                    class133.field2541[var8++] = var291.field1131;
                                                    continue;
                                                }
                                                if (~var312 == -2604) {
                                                    class204.field3946[var7++] = var291.field1153;
                                                    continue;
                                                }
                                                if (var312 == 2604) {
                                                    class204.field3946[var7++] = var291.field1103;
                                                    continue;
                                                }
                                                if (var312 == 2605) {
                                                    class204.field3946[var7++] = var291.field1082;
                                                    continue;
                                                }
                                                if (~var312 == -2607) {
                                                    class204.field3946[var7++] = var291.field1111;
                                                    continue;
                                                }
                                                if (~var312 == -2608) {
                                                    class204.field3946[var7++] = var291.field1180;
                                                    continue;
                                                }
                                                if (~var312 == -2609) {
                                                    class204.field3946[var7++] = var291.field1157;
                                                    continue;
                                                }
                                                if (var312 == 2609) {
                                                    class204.field3946[var7++] = var291.field1172;
                                                    continue;
                                                }
                                            }
                                        } else {
                                            class65 var292 = var43 ? class85.field1558 : class183.field3611;
                                            if (~var312 == -1801) {
                                                class204.field3946[var7++] = class158.method1084(116, class178.method1173(var292, 127));
                                                continue;
                                            }
                                            if (var312 == 1801) {
                                                --var7;
                                                int var293 = class204.field3946[var7];
                                                int var314 = var293 - 1;
                                                if (var292.field1161 != null && ~var314 > ~var292.field1161.length && var292.field1161[var314] != null) {
                                                    class133.field2541[var8++] = var292.field1161[var314];
                                                    continue;
                                                }
                                                class133.field2541[var8++] = class55.field903;
                                                continue;
                                            }
                                            if (~var312 == -1803) {
                                                if (var292.field1096 == null) {
                                                    class133.field2541[var8++] = class55.field903;
                                                } else {
                                                    class133.field2541[var8++] = var292.field1096;
                                                }
                                                continue;
                                            }
                                        }
                                    } else {
                                        class65 var294 = !var43 ? class183.field3611 : class85.field1558;
                                        if (var312 == 1700) {
                                            class204.field3946[var7++] = var294.field1038;
                                            continue;
                                        }
                                        if (~var312 == -1702) {
                                            if (var294.field1038 == -1) {
                                                class204.field3946[var7++] = 0;
                                            } else {
                                                class204.field3946[var7++] = var294.field1132;
                                            }
                                            continue;
                                        }
                                        if (~var312 == -1703) {
                                            class204.field3946[var7++] = var294.field1127;
                                            continue;
                                        }
                                    }
                                } else {
                                    class65 var295 = var43 ? class85.field1558 : class183.field3611;
                                    if (var312 == 1600) {
                                        class204.field3946[var7++] = var295.field1122;
                                        continue;
                                    }
                                    if (~var312 == -1602) {
                                        class204.field3946[var7++] = var295.field1162;
                                        continue;
                                    }
                                    if (~var312 == -1603) {
                                        class133.field2541[var8++] = var295.field1131;
                                        continue;
                                    }
                                    if (var312 == 1603) {
                                        class204.field3946[var7++] = var295.field1153;
                                        continue;
                                    }
                                    if (~var312 == -1605) {
                                        class204.field3946[var7++] = var295.field1103;
                                        continue;
                                    }
                                    if (var312 == 1605) {
                                        class204.field3946[var7++] = var295.field1082;
                                        continue;
                                    }
                                    if (~var312 == -1607) {
                                        class204.field3946[var7++] = var295.field1111;
                                        continue;
                                    }
                                    if (~var312 == -1608) {
                                        class204.field3946[var7++] = var295.field1180;
                                        continue;
                                    }
                                    if (~var312 == -1609) {
                                        class204.field3946[var7++] = var295.field1157;
                                        continue;
                                    }
                                    if (~var312 == -1610) {
                                        class204.field3946[var7++] = var295.field1172;
                                        continue;
                                    }
                                }
                            } else {
                                class65 var296;
                                if (~var312 <= -2001) {
                                    var312 -= 1000;
                                    --var7;
                                    var296 = class204.method1325(65535, class204.field3946[var7]);
                                } else {
                                    var296 = !var43 ? class183.field3611 : class85.field1558;
                                }
                                if (~var312 == -1301) {
                                    --var7;
                                    int var297 = class204.field3946[var7] + -1;
                                    if (var297 >= 0 && var297 <= 9) {
                                        --var8;
                                        var296.method333(var297, false, class133.field2541[var8]);
                                        continue;
                                    }
                                    --var8;
                                    continue;
                                }
                                if (~var312 == -1302) {
                                    var7 -= 2;
                                    int var298 = class204.field3946[var7];
                                    int var299 = class204.field3946[var7 + 1];
                                    var296.field1085 = class113.method621(var299, var298, -1);
                                    continue;
                                }
                                if (var312 == 1302) {
                                    --var7;
                                    var296.field1181 = class204.field3946[var7] == 1;
                                    continue;
                                }
                                if (var312 == 1303) {
                                    --var7;
                                    var296.field1086 = class204.field3946[var7];
                                    continue;
                                }
                                if (~var312 == -1305) {
                                    --var7;
                                    var296.field1126 = class204.field3946[var7];
                                    continue;
                                }
                                if (var312 == 1305) {
                                    --var8;
                                    var296.field1096 = class133.field2541[var8];
                                    continue;
                                }
                                if (~var312 == -1307) {
                                    --var8;
                                    var296.field1177 = class133.field2541[var8];
                                    continue;
                                }
                                if (~var312 == -1308) {
                                    var296.field1161 = null;
                                    continue;
                                }
                            }
                        } else {
                            class65 var300;
                            if (var312 < 2000) {
                                var300 = var43 ? class85.field1558 : class183.field3611;
                            } else {
                                var312 -= 1000;
                                --var7;
                                var300 = class204.method1325(65535, class204.field3946[var7]);
                            }
                            class160.method1095(0, var300);
                            if (var312 == 1200) {
                                var7 -= 2;
                                int var301 = class204.field3946[var7];
                                int var302 = class204.field3946[var7 + 1];
                                var300.field1132 = var302;
                                var300.field1038 = var301;
                                class166 var303 = class166.method1126(-97, var301);
                                var300.field1180 = var303.field3276;
                                var300.field1054 = var303.field3273;
                                var300.field1140 = var303.field3316;
                                var300.field1082 = var303.field3267;
                                if (~var300.field1044 < -1) {
                                    var300.field1082 = var300.field1082 * 32 / var300.field1044;
                                }
                                var300.field1111 = var303.field3287;
                                var300.field1157 = var303.field3286;
                                continue;
                            }
                            if (var312 == 1201) {
                                var300.field1174 = 2;
                                --var7;
                                var300.field1037 = class204.field3946[var7];
                                continue;
                            }
                            if (~var312 == -1203) {
                                var300.field1174 = 3;
                                var300.field1037 = class106.field1940.field560.method883((byte) -95);
                                continue;
                            }
                            if (var312 == 1203) {
                                var300.field1174 = 6;
                                --var7;
                                var300.field1037 = class204.field3946[var7];
                                continue;
                            }
                            if (var312 == 1204) {
                                var300.field1174 = 5;
                                --var7;
                                var300.field1037 = class204.field3946[var7];
                                continue;
                            }
                        }
                    } else {
                        class65 var59;
                        if (var312 < 2000) {
                            var59 = var43 ? class85.field1558 : class183.field3611;
                        } else {
                            --var7;
                            var59 = class204.method1325(65535, class204.field3946[var7]);
                            var312 -= 1000;
                        }
                        if (var312 == 1000) {
                            var7 -= 2;
                            var59.field1113 = class204.field3946[var7];
                            var59.field1090 = class204.field3946[var7 - -1];
                            class160.method1095(0, var59);
                            continue;
                        }
                        if (~var312 == -1002) {
                            var7 -= 2;
                            var59.field1044 = class204.field3946[var7];
                            var59.field1052 = class204.field3946[var7 - -1];
                            class160.method1095(0, var59);
                            continue;
                        }
                        if (~var312 == -1004) {
                            --var7;
                            boolean var60 = ~class204.field3946[var7] == -2;
                            if (!var59.field1073 != !var60) {
                                var59.field1073 = var60;
                                class160.method1095(0, var59);
                            }
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            } catch (Exception var311) {
                if (var6.field1035 != null) {
                    class93 var308 = class108.method593(-2, 30);
                    var308.method516(class25.field377, -52).method516(var6.field1035, -50);
                    for (int var309 = class53.field891 + -1; var309 >= 0; --var309) {
                        var308.method516(class152.field2942, -102).method516(class123.field2279[var309].field1962.field1035, -111);
                    }
                    if (var12 == 40) {
                        int var310 = var11[var9];
                        var308.method516(class154.field3039, -67).method516(class67.method357((byte) -108, var310), -95);
                    }
                    if (class131.field2466 != 0) {
                        class189.method1223(0, class55.field903, 2249, class203.method1321(new class93[] { class98.field1833, var6.field1035 }, 0));
                    }
                    class141.method882(true, "CS2 - scr:" + var6.field718 + " op:" + var12 + new String(var308.method483(0)), var311);
                } else {
                    if (class131.field2466 != 0) {
                        class189.method1223(0, class55.field903, 2249, class170.field3376);
                    }
                    class141.method882(true, "CS2 - scr:" + var6.field718 + " op:" + var12, var311);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
    public static void method600(int arg0) {
        field2011 = null;
        field1997 = null;
        field2000 = null;
        field2007 = null;
        if (arg0 != 10) {
            method599(81, (class104) null, -19);
        }
        field2004 = null;
        field2001 = null;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class111() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(IBI)V")
    private final void method601(int arg0, byte arg1, int arg2) {
        ++field2008;
        int var4 = class142.field2781[arg2];
        int var5 = class97.field1808[arg0];
        float var6 = (float) Math.atan2((double) (var5 + -2048), (double) (var4 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class37.field600 = arg0;
            class3.field45 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class3.field45 = arg0;
            class37.field600 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class3.field45 = arg0;
            class37.field600 = -arg2 + class159.field3209;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class3.field45 = class159.field3205 - arg2;
            class37.field600 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class3.field45 = -arg2 + class159.field3205;
            class37.field600 = class159.field3209 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class3.field45 = -arg0 + class159.field3205;
            class37.field600 = -arg2 + class159.field3209;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class3.field45 = -arg0 + class159.field3205;
            class37.field600 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class3.field45 = arg2;
            class37.field600 = -arg0 + class159.field3209;
        }
        class3.field45 &= class190.field3715;
        class37.field600 &= class78.field1402;
        if (arg1 >= -13) {
            method602(20, (class80[]) null, (int[]) null, -17, (int[]) null, 114);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[Lig;[II[II)V")
    public static final void method602(int arg0, class80[] arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        if (arg3 > arg5) {
            int var6 = arg5 + -1;
            int var7 = arg3 - -1;
            int var8 = (arg3 + arg5) / 2;
            class80 var9 = arg1[var8];
            arg1[var8] = arg1[arg5];
            arg1[arg5] = var9;
            while (~var6 > ~var7) {
                boolean var10 = true;
                do {
                    --var7;
                    for (int var11 = 0; var11 < 4; ++var11) {
                        int var12;
                        int var13;
                        if (~arg4[var11] == -3) {
                            var12 = var9.field1429;
                            var13 = arg1[var7].field1429;
                        } else if (arg4[var11] != 1) {
                            if (arg4[var11] != 3) {
                                var12 = var9.field1420;
                                var13 = arg1[var7].field1420;
                            } else {
                                var13 = !arg1[var7].field1424 ? 0 : 1;
                                var12 = !var9.field1424 ? 0 : 1;
                            }
                        } else {
                            var13 = arg1[var7].field1430;
                            var12 = var9.field1430;
                            if (~var13 == 0 && arg2[var11] == 1) {
                                var13 = 2001;
                            }
                            if (var12 == -1 && ~arg2[var11] == -2) {
                                var12 = 2001;
                            }
                        }
                        if (~var12 != ~var13) {
                            if ((arg2[var11] != 1 || var12 >= var13) && (~arg2[var11] != -1 || var13 >= var12)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (~var11 == -4) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    ++var6;
                    for (int var15 = 0; var15 < 4; ++var15) {
                        int var16;
                        int var17;
                        if (~arg4[var15] != -3) {
                            if (arg4[var15] == 1) {
                                var16 = var9.field1430;
                                if (var16 == -1 && ~arg2[var15] == -2) {
                                    var16 = 2001;
                                }
                                var17 = arg1[var6].field1430;
                                if (var17 == -1 && ~arg2[var15] == -2) {
                                    var17 = 2001;
                                }
                            } else if (~arg4[var15] == -4) {
                                var16 = var9.field1424 ? 1 : 0;
                                var17 = !arg1[var6].field1424 ? 0 : 1;
                            } else {
                                var16 = var9.field1420;
                                var17 = arg1[var6].field1420;
                            }
                        } else {
                            var17 = arg1[var6].field1429;
                            var16 = var9.field1429;
                        }
                        if (~var16 != ~var17) {
                            if ((arg2[var15] != 1 || var16 <= var17) && (~arg2[var15] != -1 || var17 <= var16)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (~var15 == -4) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (~var7 < ~var6) {
                    class80 var18 = arg1[var6];
                    arg1[var6] = arg1[var7];
                    arg1[var7] = var18;
                }
            }
            method602(-31721, arg1, arg2, var7, arg4, arg5);
            method602(-31721, arg1, arg2, arg3, arg4, var7 + 1);
        }
        ++field2002;
        if (arg0 != -31721) {
            method600(66);
        }
    }
}
