import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class244 extends class91 {

    @OriginalMember(owner = "client!sd", name = "Bc", descriptor = "Ll;")
    public static class66 field3791 = new class66(64);

    @OriginalMember(owner = "client!sd", name = "Nc", descriptor = "Lrc;")
    public static class217 field3803 = new class217(5000);

    @OriginalMember(owner = "client!sd", name = "Sc", descriptor = "Ljava/lang/String;")
    public static String field3808 = "glow3:";

    @OriginalMember(owner = "client!sd", name = "zc", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!sd", name = "Ac", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!sd", name = "Cc", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!sd", name = "Dc", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!sd", name = "Ec", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!sd", name = "Fc", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!sd", name = "Gc", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!sd", name = "Ic", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!sd", name = "Jc", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!sd", name = "Kc", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!sd", name = "Lc", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!sd", name = "Oc", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!sd", name = "Pc", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!sd", name = "Qc", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!sd", name = "Rc", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!sd", name = "Uc", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!sd", name = "Mc", descriptor = "Lnn;")
    public class130 field3802;

    @OriginalMember(owner = "client!sd", name = "Hc", descriptor = "[[B")
    public static byte[][] field3797;

    @OriginalMember(owner = "client!sd", name = "Tc", descriptor = "[[I")
    public static int[][] field3809;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lrg;B)Lrg;", line = 5)
    public static final class342 method1837(class342 arg0, byte arg1) {
        field3794++;
        if (arg0.field5296 != -1) {
            return class355.method2497(0, arg0.field5296);
        }
        if (arg1 >= -89) {
            method1845((byte) -4);
        }
        int var2 = arg0.field5433 >>> 16;
        class89 var3 = new class89(class135.field2251);
        for (class36 var4 = (class36) var3.method804(false); var4 != null; var4 = (class36) var3.method802(20592)) {
            if (var4.field540 == var2) {
                return class355.method2497(0, (int) var4.field2734);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V", line = 35)
    public static final void method1838(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3798++;
        int var6 = class268.method1965(arg5, class284.field4385, class328.field5042, -74);
        if (arg1 != 6598) {
            field3803 = (class217) null;
        }
        int var7 = class268.method1965(arg2, class284.field4385, class328.field5042, -108);
        int var8 = class268.method1965(arg4, class128.field2130, class43.field693, arg1 - 6668);
        int var9 = class268.method1965(arg3, class128.field2130, class43.field693, -116);
        for (int var10 = var6; var10 <= var7; var10++) {
            class283.method2059(arg0, class133.field2235[var10], (byte) 115, var9, var8);
        }
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)I", line = 63)
    public final int method814(int arg0) {
        field3805++;
        if (arg0 != 0) {
            method1837((class342) null, (byte) 85);
        }
        if (this.field3802.field2149 != null) {
            class130 var2 = this.field3802.method1120((byte) -124);
            if (var2 != null && var2.field2151 != -1) {
                return var2.field2151;
            }
        }
        return this.field1379;
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)I", line = 88)
    public final int method812(int arg0) {
        field3807++;
        if (arg0 <= 27) {
            field3791 = (class66) null;
        }
        if (this.field3802.field2149 != null) {
            class130 var2 = this.field3802.method1120((byte) -125);
            if (var2 != null && var2.field2200 != -1) {
                return var2.field2200;
            }
        }
        return this.field3802.field2200;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 111)
    public static final String method1839(long arg0, int arg1) {
        field3793++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class19.field315[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    var9 = ' ';
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            if (arg1 <= 80) {
                return (String) null;
            } else {
                return var6.toString();
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIJILem;)V", line = 161)
    public final void method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class273 arg10) {
        field3792++;
        if (this.field3802 == null) {
            return;
        }
        class93 var13 = this.field1343 != -1 && this.field1302 == 0 ? class126.method1091((byte) 117, this.field1343) : null;
        class93 var14 = this.field1350 == -1 || this.field1350 == this.method813((byte) -79).field1663 && var13 != null ? null : class126.method1091((byte) 99, this.field1350);
        class52 var15 = this.field3802.method1126(var14, this.field1369, this.field1331, 105, this.field1299, this.field1310, var13, this.field1293, this.field1309, this.field1329);
        if (var15 == null) {
            return;
        }
        this.field1367 = var15.method21();
        class130 var16 = this.field3802;
        if (var16.field2149 != null) {
            var16 = var16.method1120((byte) -128);
        }
        if (class101.field1529 && var16.field2160) {
            class52 var17 = class149.method1243(var14 == null ? var13 : var14, this.field1325, this.field3802.field2166, this.field3802.field2192, false, this.field3802.field2162, var15, this.field3802.field2201, this.field1286, this.field1359, this.field1383, this.field3802.field2175, var14 == null ? this.field1329 : this.field1299, arg0);
            if (class240.field3737) {
                float var18 = class240.method1782();
                float var19 = class240.method1817();
                class240.method1791();
                class240.method1778(var18, var19 - 150.0F);
                var17.method27(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field1354);
                class240.method1803();
                class240.method1778(var18, var19);
            } else {
                var17.method27(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field1354);
            }
        }
        this.method827(37, var15);
        this.method824((byte) -120, var15, arg0);
        class52 var20 = null;
        if (this.field1297 != -1 && this.field1326 != -1) {
            class281 var21 = class292.method2110(this.field1297, (byte) 78);
            var20 = var21.method2050(this.field1326, this.field1355, (byte) -127, this.field1392);
            if (var20 != null) {
                var20.method515(0, -this.field1308, 0);
                if (var21.field4338) {
                    if (class331.field5090 != 0) {
                        var20.method509(class331.field5090);
                    }
                    if (class93.field1427 != 0) {
                        var20.method498(class93.field1427);
                    }
                    if (class46.field722 != 0) {
                        var20.method515(0, class46.field722, 0);
                    }
                }
            }
        }
        if (!class240.field3737) {
            if (var20 != null) {
                var15 = ((class124) var15).method1072(var20);
            }
            this.method825(var15, var20, 116);
            if (this.field3802.field2192 == 1) {
                var15.field800 = true;
            }
            var15.method27(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1354);
            return;
        }
        this.method825(var15, var20, 115);
        if (this.field3802.field2192 == 1) {
            var15.field800 = true;
        }
        var15.method27(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1354);
        if (var20 == null) {
            return;
        }
        if (this.field3802.field2192 == 1) {
            var20.field800 = true;
        }
        if (this.field1354 != null) {
            class56 var22 = (class56) var20;
            this.field1354.method2010(var22.field851, var22.field826, true, var22.field844, var22.field857, var22.field842);
        }
        var20.method27(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1354);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()I", line = 287)
    public final int method21() {
        field3804++;
        return this.field1367;
    }

    @OriginalMember(owner = "client!sd", name = "finalize", descriptor = "()V", line = 297)
    protected final void finalize() {
        field3810++;
        if (this.field1354 != null) {
            this.field1354.method2013();
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lnn;I)V", line = 311)
    public final void method1840(class130 arg0, int arg1) {
        this.field3802 = arg0;
        if (arg1 == 256) {
            if (this.field1354 != null) {
                this.field1354.method1993();
            }
            field3800++;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)I", line = 327)
    public final int method809(byte arg0) {
        field3790++;
        if (this.field3802.field2149 != null) {
            class130 var2 = this.field3802.method1120((byte) -125);
            if (var2 != null && var2.field2150 != -1) {
                return var2.field2150;
            }
        }
        if (this.field3802.field2150 == -1) {
            if (arg0 <= 121) {
                field3791 = (class66) null;
            }
            return super.method809((byte) 125);
        } else {
            return this.field3802.field2150;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([[F[[F[Ljn;[[FI[[I[[BI[[B[[BI[[B)V", line = 355)
    public static final void method1841(float[][] arg0, float[][] arg1, class186[] arg2, float[][] arg3, int arg4, int[][] arg5, byte[][] arg6, int arg7, byte[][] arg8, byte[][] arg9, int arg10, byte[][] arg11) {
        if (arg7 > -75) {
            return;
        }
        for (int var12 = 0; var12 < arg10; var12++) {
            class186 var13 = arg2[var12];
            if (var13.field2922 == arg4) {
                int var14 = 0;
                class336 var15 = new class336();
                int var16 = (var13.field2909 >> 7) - var13.field2914;
                int var17 = (var13.field2924 >> 7) - var13.field2914;
                if (var17 < 0) {
                    var14 -= var17;
                    var17 = 0;
                }
                int var18 = (var13.field2924 >> 7) + var13.field2914;
                if (var18 > 103) {
                    var18 = 103;
                }
                for (int var19 = var17; var19 <= var18; var19++) {
                    short var20 = var13.field2915[var14];
                    int var21 = (var20 >> 8) + var16;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg9[var23][var19] & 0xFF;
                        int var25 = arg8[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var24 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class192 var27 = class91.method810(var25 - 1, (byte) 109);
                            if (var27.field3019 == -1) {
                                continue;
                            }
                            if (arg11[var23][var19] != 0) {
                                int[] var28 = class263.field4091[arg11[var23][var19]];
                                var15.field5138 += ((var28.length >> 1) - 2) * 3;
                                var15.field5137 += var28.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class192 var29 = class91.method810(var25 - 1, (byte) 91);
                            if (var29.field3019 == -1) {
                                byte var54 = arg11[var23][var19];
                                if (var54 != 0) {
                                    int[] var55 = class205.field3166[var54];
                                    var15.field5138 += (var55.length >> 1) * 3 - 6;
                                    var15.field5137 += var55.length >> 1;
                                }
                                continue;
                            }
                            byte var30 = arg11[var23][var19];
                            if (var30 != 0) {
                                var26 = true;
                            }
                        }
                        class297 var31 = class203.method1520(arg4, var23, var19);
                        if (var31 != null) {
                            int var32 = (int) (var31.field4611 >> 14) & 0x3F;
                            if (var32 == 9) {
                                int[] var33 = null;
                                int var34 = (int) (var31.field4611 >> 20) & 0x3;
                                if ((var34 & 0x1) == 0) {
                                    boolean var35 = var21 <= (var23 - 1);
                                    if (!var35 && (var19 + 1) <= var18) {
                                        short var36 = var13.field2915[var14 + 1];
                                        int var37 = (var36 >> 8) + var16;
                                        int var38 = var37 + (var36 & 0xFF);
                                        var35 = var23 > var37 && var38 > var23;
                                    }
                                    boolean var39 = (var23 + 1) <= var22;
                                    if (!var39 && (var19 - 1) >= var17) {
                                        short var40 = var13.field2915[var14 - 1];
                                        int var41 = (var40 >> 8) + var16;
                                        int var42 = (var40 & 0xFF) + var41;
                                        var39 = var23 > var41 && var23 < var42;
                                    }
                                    if (var35 && var39) {
                                        var33 = class263.field4091[0];
                                    } else if (var35) {
                                        var33 = class263.field4091[1];
                                    } else if (var39) {
                                        var33 = class263.field4091[1];
                                    }
                                } else {
                                    boolean var43 = (var23 - 1) >= var21;
                                    boolean var44 = var22 >= (var23 + 1);
                                    if (!var43 && (var19 - 1) >= var17) {
                                        short var45 = var13.field2915[var14 - 1];
                                        int var46 = (var45 >> 8) + var16;
                                        int var47 = (var45 & 0xFF) + var46;
                                        var43 = var23 > var46 && var23 < var47;
                                    }
                                    if (!var44 && var19 + 1 <= var18) {
                                        short var48 = var13.field2915[var14 + 1];
                                        int var49 = (var48 >> 8) + var16;
                                        int var50 = (var48 & 0xFF) + var49;
                                        var44 = var23 > var49 && var50 > var23;
                                    }
                                    if (var43 && var44) {
                                        var33 = class263.field4091[0];
                                    } else if (var43) {
                                        var33 = class263.field4091[1];
                                    } else if (var44) {
                                        var33 = class263.field4091[1];
                                    }
                                }
                                if (var33 != null) {
                                    var15.field5138 += ((var33.length >> 1) - 2) * 3;
                                    var15.field5137 += var33.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var51 = class263.field4091[arg11[var23][var19]];
                            int[] var52 = class205.field3166[arg11[var23][var19]];
                            var15.field5138 += (var51.length >> 1) * 3 - 6;
                            var15.field5138 += ((var52.length >> 1) - 2) * 3;
                            var15.field5137 += var51.length >> 1;
                            var15.field5137 += var52.length >> 1;
                        } else {
                            int[] var53 = class263.field4091[0];
                            var15.field5138 += (var53.length >> 1) * 3 - 6;
                            var15.field5137 += var53.length >> 1;
                        }
                    }
                    var14++;
                }
                var15.method2359();
                int var56 = 0;
                if ((var13.field2924 >> 7) - var13.field2914 < 0) {
                    var56 -= (var13.field2924 >> 7) - var13.field2914;
                }
                for (int var57 = var17; var57 <= var18; var57++) {
                    short var58 = var13.field2915[var56];
                    int var59 = (var58 >> 8) + var16;
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        int var62 = arg9[var61][var57] & 0xFF;
                        int var63 = arg8[var61][var57] & 0xFF;
                        boolean var64 = false;
                        byte var65 = arg6[var61][var57];
                        if (var62 == 0) {
                            if (var63 == 0) {
                                continue;
                            }
                            class192 var68 = class91.method810(var63 - 1, (byte) 86);
                            if (var68.field3019 == -1) {
                                continue;
                            }
                            if (arg11[var61][var57] != 0) {
                                class87.method786(var13, var15, arg3, class263.field4091[arg11[var61][var57]], arg5, arg1, (byte) -105, arg6[var61][var57], var57, var61, arg0);
                                continue;
                            }
                        } else if (var63 != 0) {
                            class192 var66 = class91.method810(var63 - 1, (byte) 124);
                            if (var66.field3019 == -1) {
                                class87.method786(var13, var15, arg3, class205.field3166[arg11[var61][var57]], arg5, arg1, (byte) -110, arg6[var61][var57], var57, var61, arg0);
                                continue;
                            }
                            byte var67 = arg11[var61][var57];
                            if (var67 != 0) {
                                var64 = true;
                            }
                        }
                        class297 var69 = class203.method1520(arg4, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field4611 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int[] var71 = null;
                                int var72 = (int) (var69.field4611 >> 20) & 0x3;
                                if ((var72 & 0x1) == 0) {
                                    boolean var81 = (var61 - 1) >= var59;
                                    if (!var81 && var18 >= var57 + 1) {
                                        short var82 = var13.field2915[var56 + 1];
                                        int var83 = (var82 >> 8) + var16;
                                        int var84 = (var82 & 0xFF) + var83;
                                        var81 = var61 > var83 && var61 < var84;
                                    }
                                    boolean var85 = var60 >= (var61 + 1);
                                    if (!var85 && var57 - 1 >= var17) {
                                        short var86 = var13.field2915[var56 - 1];
                                        int var87 = (var86 >> 8) + var16;
                                        int var88 = (var86 & 0xFF) + var87;
                                        var85 = var87 < var61 && var61 < var88;
                                    }
                                    if (var81 && var85) {
                                        var71 = class263.field4091[0];
                                    } else if (var81) {
                                        var71 = class263.field4091[1];
                                        var65 = 1;
                                    } else if (var85) {
                                        var71 = class263.field4091[1];
                                        var65 = 3;
                                    }
                                } else {
                                    boolean var73 = (var61 - 1) >= var59;
                                    boolean var74 = var60 >= var61 + 1;
                                    if (!var73 && var17 <= var57 - 1) {
                                        short var75 = var13.field2915[var56 - 1];
                                        int var76 = var16 + (var75 >> 8);
                                        int var77 = (var75 & 0xFF) + var76;
                                        var73 = var61 > var76 && var61 < var77;
                                    }
                                    if (!var74 && var18 >= var57 + 1) {
                                        short var78 = var13.field2915[var56 + 1];
                                        int var79 = (var78 >> 8) + var16;
                                        int var80 = (var78 & 0xFF) + var79;
                                        var74 = var61 > var79 && var61 < var80;
                                    }
                                    if (var73 && var74) {
                                        var71 = class263.field4091[0];
                                    } else if (var73) {
                                        var65 = 0;
                                        var71 = class263.field4091[1];
                                    } else if (var74) {
                                        var71 = class263.field4091[1];
                                        var65 = 2;
                                    }
                                }
                                if (var71 != null) {
                                    class87.method786(var13, var15, arg3, var71, arg5, arg1, (byte) -81, var65, var57, var61, arg0);
                                }
                                continue;
                            }
                        }
                        if (var64) {
                            class87.method786(var13, var15, arg3, class205.field3166[arg11[var61][var57]], arg5, arg1, (byte) -114, arg6[var61][var57], var57, var61, arg0);
                            class87.method786(var13, var15, arg3, class263.field4091[arg11[var61][var57]], arg5, arg1, (byte) -98, arg6[var61][var57], var57, var61, arg0);
                        } else {
                            class87.method786(var13, var15, arg3, class263.field4091[0], arg5, arg1, (byte) 30, var65, var57, var61, arg0);
                        }
                    }
                    var56++;
                }
                if (var15.field5144 > 0 && var15.field5136 > 0) {
                    var15.method2360();
                    var13.field2925 = var15;
                }
            }
        }
        field3796++;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)Z", line = 879)
    public final boolean method811(int arg0) {
        if (arg0 == 256) {
            field3806++;
            return this.field3802 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lbn;", line = 899)
    public static final class9 method1842(Throwable arg0, String arg1) {
        field3799++;
        class9 var2;
        if ((arg0 instanceof class9)) {
            var2 = (class9) arg0;
            var2.field131 = var2.field131 + ' ' + arg1;
        } else {
            var2 = new class9(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V", line = 923)
    public final void method32(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3789++;
        if (this.field3802 == null) {
            return;
        }
        if (!this.field1345) {
            class93 var6 = this.field1343 != -1 && this.field1302 == 0 ? class126.method1091((byte) 62, this.field1343) : null;
            class93 var7 = this.field1350 == -1 || this.field1350 == this.method813((byte) 70).field1663 && var6 != null ? null : class126.method1091((byte) 122, this.field1350);
            class52 var8 = this.field3802.method1126(var7, this.field1369, this.field1331, 94, this.field1299, this.field1310, var6, this.field1293, this.field1309, this.field1329);
            if (var8 == null) {
                return;
            }
            this.method825(var8, (class52) null, 95);
        }
        if (this.field1354 != null) {
            this.field1354.method2014(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "(I)V", line = 956)
    public static void method1843(int arg0) {
        field3808 = null;
        field3797 = (byte[][]) null;
        field3791 = null;
        field3803 = null;
        field3809 = (int[][]) null;
        int var1 = -98 / ((76 - arg0) / 40);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)Lce;", line = 971)
    public static final class149 method1844(byte arg0, int arg1) {
        field3801++;
        class149 var2 = (class149) class283.field4368.method1386(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class363.field5748.method187(26, arg1, -1);
        if (arg0 > -31) {
            method1838(-34, -23, -105, 92, -43, 29);
        }
        class149 var4 = new class149();
        if (var3 != null) {
            var4.method1244(-71, new class25(var3));
        }
        class283.field4368.method1385(var4, (byte) -30, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)V", line = 995)
    public static final void method1845(byte arg0) {
        field3795++;
        int var1 = class10.field141;
        int var2 = class43.field700;
        int var3 = class310.field4785;
        byte var4 = 20;
        int var5 = class135.field2259 - 3;
        if (class18.field295 == null || class83.field1206 == null) {
            if (class303.field4725.method199(2209, class33.field501) && class303.field4725.method199(2209, class264.field4107)) {
                class18.field295 = class171.method1347(0, class33.field501, class303.field4725, -6138);
                class83.field1206 = class171.method1347(0, class264.field4107, class303.field4725, -6138);
                if (class240.field3737) {
                    if ((class18.field295 instanceof class54)) {
                        class18.field295 = new class200((class361) class18.field295);
                    } else {
                        class18.field295 = new class2((class361) class18.field295);
                    }
                    if (class83.field1206 instanceof class54) {
                        class83.field1206 = new class200((class361) class83.field1206);
                    } else {
                        class83.field1206 = new class2((class361) class83.field1206);
                    }
                }
            } else if (class240.field3737) {
                class213.method1594(var1, var3, var2, var4, class214.field3351, 256 - class129.field2136);
            } else {
                class60.method601(var1, var3, var2, var4, class214.field3351, 256 - class129.field2136);
            }
        }
        if (class18.field295 != null && class83.field1206 != null) {
            int var6 = (var2 - (class83.field1206.field3366 * 2)) / class18.field295.field3366;
            for (int var7 = 0; var7 < var6; var7++) {
                class18.field295.method17(class18.field295.field3366 * var7 + (var1 + class83.field1206.field3366), var3);
            }
            class83.field1206.method17(var1, var3);
            class83.field1206.method18(var1 + var2 - class83.field1206.field3366, var3);
        }
        int var8 = -54 / ((arg0 + 46) / 56);
        class64.field988.method1190(class222.field3450, var1 + 3, var3 + 14, class304.field4735, -1);
        if (class240.field3737) {
            class213.method1594(var1, var3 + var4, var2, var5 - var4, class214.field3351, 256 - class129.field2136);
        } else {
            class60.method601(var1, var3 + var4, var2, var5 - var4, class214.field3351, 256 - class129.field2136);
        }
        int var9 = class268.field4137;
        int var10 = class78.field1129;
        for (int var11 = 0; var11 < class66.field1006; var11++) {
            int var12 = (class66.field1006 - var11 - 1) * 15 + var3 + var4 + 13;
            if (var9 > var1 && (var1 + var2) > var9 && (var12 - 13) < var10 && var10 < var12 + 3) {
                if (class240.field3737) {
                    class213.method1594(var1, var12 - 12, var2, 15, class206.field3172, 256 - class283.field4384);
                } else {
                    class60.method601(var1, var12 - 12, var2, 15, class206.field3172, 256 - class283.field4384);
                }
            }
        }
        if ((class262.field4021 == null || class355.field5652 == null || class67.field1026 == null) && class303.field4725.method199(2209, class306.field4749) && class303.field4725.method199(2209, class170.field2692) && class303.field4725.method199(2209, class284.field4415)) {
            class262.field4021 = class171.method1347(0, class306.field4749, class303.field4725, -6138);
            class355.field5652 = class171.method1347(0, class170.field2692, class303.field4725, -6138);
            class67.field1026 = class171.method1347(0, class284.field4415, class303.field4725, -6138);
            if (class240.field3737) {
                if ((class262.field4021 instanceof class54)) {
                    class262.field4021 = new class200((class361) class262.field4021);
                } else {
                    class262.field4021 = new class2((class361) class262.field4021);
                }
                if (class355.field5652 instanceof class54) {
                    class355.field5652 = new class200((class361) class355.field5652);
                } else {
                    class355.field5652 = new class2((class361) class355.field5652);
                }
                if ((class67.field1026 instanceof class54)) {
                    class67.field1026 = new class200((class361) class67.field1026);
                } else {
                    class67.field1026 = new class2((class361) class67.field1026);
                }
            }
        }
        if (class262.field4021 != null && class355.field5652 != null && class67.field1026 != null) {
            int var13 = (var2 - (class67.field1026.field3366 * 2)) / class262.field4021.field3366;
            for (int var14 = 0; var14 < var13; var14++) {
                class262.field4021.method17(var1 + (class262.field4021.field3366 * var14) + class67.field1026.field3366, var3 + var5 + -class262.field4021.field3367);
            }
            int var15 = (var5 - var4 - class67.field1026.field3367) / class355.field5652.field3367;
            for (int var16 = 0; var16 < var15; var16++) {
                class355.field5652.method17(var1, class355.field5652.field3367 * var16 + var3 + var4);
                class355.field5652.method18(var1 + var2 - class355.field5652.field3366, class355.field5652.field3367 * var16 + var4 + var3);
            }
            class67.field1026.method17(var1, var3 + var5 - class67.field1026.field3367);
            class67.field1026.method18(var1 + var2 - class67.field1026.field3366, var3 + var5 + -class67.field1026.field3367);
        }
        for (int var17 = 0; var17 < class66.field1006; var17++) {
            int var18 = (class66.field1006 - var17 - 1) * 15 + var3 + var4 + 13;
            int var19 = class304.field4735;
            if (var1 < var9 && var9 < var1 + var2 && (var18 - 13) < var10 && (var18 + 3) > var10) {
                var19 = class348.field5533;
            }
            class64.field988.method1190(class78.method720(var17, false), var1 + 3, var18, var19, 0);
        }
        class100.method874(60, class43.field700, class10.field141, class310.field4785, class135.field2259);
    }
}
