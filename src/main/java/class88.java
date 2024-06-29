import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class88 extends class118 {

    @OriginalMember(owner = "client!vj", name = "Mb", descriptor = "Lli;")
    public static class185 field1722 = class245.method1649("mapscene", -81);

    @OriginalMember(owner = "client!vj", name = "Yb", descriptor = "[I")
    public static int[] field1734 = new int[5];

    @OriginalMember(owner = "client!vj", name = "Hb", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!vj", name = "Ib", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!vj", name = "Jb", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!vj", name = "Kb", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!vj", name = "Lb", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!vj", name = "Nb", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!vj", name = "Pb", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!vj", name = "Qb", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!vj", name = "Rb", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!vj", name = "Sb", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!vj", name = "Tb", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!vj", name = "Vb", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!vj", name = "Wb", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!vj", name = "Xb", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!vj", name = "Zb", descriptor = "I")
    private int field1735;

    @OriginalMember(owner = "client!vj", name = "ac", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!vj", name = "Ob", descriptor = "Laf;")
    private class151 field1724;

    @OriginalMember(owner = "client!vj", name = "Ub", descriptor = "Lclient;")
    public static client field1730;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III[B)V")
    public final void method572(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field1729;
        for (int var5 = arg2; arg0 > var5; ++var5) {
            arg3[arg1 + var5] = (byte) (super.field2115[super.field2155++] + -this.field1724.method1070(-1562076725));
        }
    }

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "(B)V")
    public final void method573(byte arg0) {
        this.field1735 = super.field2155 * 8;
        ++field1726;
        if (arg0 < 32) {
            field1730 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZII)Lwc;")
    public static final class85 method574(boolean arg0, int arg1, int arg2) {
        ++field1717;
        if (!arg0) {
            return null;
        } else {
            for (class85 var3 = (class85) class235.field4213.method1375(16259); var3 != null; var3 = (class85) class235.field4213.method1377(-19546)) {
                if (var3.field1685 && var3.method556(arg1, arg2, false)) {
                    return var3;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(BI)Z")
    public static final boolean method575(byte arg0, int arg1) {
        ++field1732;
        if (~arg1 <= -98 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && ~arg1 >= -91) {
            return true;
        } else if (~arg1 <= -49 && arg1 <= 57) {
            return true;
        } else {
            if (arg0 >= -18) {
                method580((byte) 81);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lhi;B)V")
    public static final void method576(class250 arg0, byte arg1) {
        int var2 = 64 / ((arg1 - -62) / 35);
        ++field1733;
        class250.field4465 = arg0;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I)V")
    public class88(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "(II)V")
    public final void method577(int arg0, int arg1) {
        ++field1731;
        super.field2115[super.field2155++] = (byte) (arg0 + this.field1724.method1070(-1562076725));
        if (arg1 != 0) {
            this.method573((byte) 10);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([II)V")
    public final void method578(int[] arg0, int arg1) {
        ++field1723;
        if (arg1 != 8) {
            this.method572(16, -47, -48, (byte[]) null);
        }
        this.field1724 = new class151(arg0);
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(IB)V")
    public static final void method579(int arg0, byte arg1) {
        class101 var2;
        if (class131.field2355 != null) {
            var2 = (class101) class131.field2355;
        } else {
            var2 = new class101(512, 512);
        }
        int[] var3 = var2.field1846;
        ++field1727;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var24 = (-(var6 * 512) + 52736) * 4 + 24628;
            for (int var25 = 1; var25 < 103; ++var25) {
                if ((24 & class239.field4262[arg0][var25][var6]) == 0) {
                    class28.method177(var3, var24, 512, arg0, var25, var6);
                }
                if (~arg0 > -4 && (class239.field4262[arg0 + 1][var25][var6] & 8) != 0) {
                    class28.method177(var3, var24, 512, arg0 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        var2.method706();
        int var7 = (int) (Math.random() * 20.0D) + 228 << 16;
        if (arg1 <= 76) {
            method586(false, 28, 34, 15);
        }
        int var8 = (int) (Math.random() * 20.0D) - (-238 + (10 - (238 + (int) (20.0D * Math.random()) + -10 << 16) - (-10 + (int) (20.0D * Math.random()) + 238 << 8)));
        for (int var9 = 1; ~var9 > -104; ++var9) {
            for (int var23 = 1; var23 < 103; ++var23) {
                if ((24 & class239.field4262[arg0][var23][var9]) == 0) {
                    class36.method227(var8, var23, arg0, var7, (byte) 11, var9);
                }
                if (~arg0 > -4 && ~(class239.field4262[arg0 - -1][var23][var9] & 8) != -1) {
                    class36.method227(var8, var23, arg0 + 1, var7, (byte) 11, var9);
                }
            }
        }
        class212.field3898 = 0;
        for (int var10 = 0; ~var10 > -105; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                long var12 = class32.method201(class265.field4703, var10, var11);
                if (var12 != 0L) {
                    class135 var14 = class184.method1294(Integer.MAX_VALUE & (int) (var12 >>> 32), -28916);
                    int var15 = var14.field2477;
                    if (var14.field2502 != null) {
                        for (int var16 = 0; ~var16 > ~var14.field2502.length; ++var16) {
                            if (~var14.field2502[var16] != 0) {
                                class135 var17 = class184.method1294(var14.field2502[var16], -28916);
                                if (var17.field2477 >= 0) {
                                    var15 = var17.field2477;
                                    break;
                                }
                            }
                        }
                    }
                    if (var15 >= 0) {
                        int var18 = var11;
                        int var19 = var10;
                        if (~var15 != -23 && var15 != 29 && ~var15 != -35 && var15 != 36 && ~var15 != -47 && ~var15 != -48 && ~var15 != -49) {
                            int[][] var20 = class165.field3090[class265.field4703].field757;
                            for (int var21 = 0; var21 < 10; ++var21) {
                                int var22 = (int) (4.0D * Math.random());
                                if (~var22 == -1 && ~var19 < -1 && ~var19 < ~(var10 - 3) && (var20[var19 + -1][var18] & 19661064) == 0) {
                                    --var19;
                                }
                                if (~var22 == -2 && var19 < 103 && ~var19 > ~(var10 + 3) && (var20[var19 + 1][var18] & 19661184) == 0) {
                                    ++var19;
                                }
                                if (var22 == 2 && var18 > 0 && ~var18 < ~(var11 - 3) && ~(19661058 & var20[var19][var18 + -1]) == -1) {
                                    --var18;
                                }
                                if (~var22 == -4 && var18 < 103 && ~var18 > ~(var11 + 3) && (19661088 & var20[var19][var18 + 1]) == 0) {
                                    ++var18;
                                }
                            }
                        }
                        class45.field713[class212.field3898] = var14.field2527;
                        class97.field1813[class212.field3898] = var19;
                        class45.field711[class212.field3898] = var18;
                        ++class212.field3898;
                    }
                }
            }
        }
        class131.field2355 = var2;
        class33.field540.method1710(false);
    }

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "(B)V")
    public static void method580(byte arg0) {
        field1722 = null;
        if (arg0 != 100) {
            method579(84, (byte) -40);
        }
        field1730 = null;
        field1734 = null;
    }

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "(II)I")
    public final int method581(int arg0, int arg1) {
        ++field1719;
        int var3 = this.field1735 >> 3;
        int var4 = 8 - (this.field1735 & arg1);
        int var5 = 0;
        this.field1735 += arg0;
        while (~arg0 < ~var4) {
            var5 += (class69.field1221[var4] & super.field2115[var3++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 != ~var4) {
            var6 = (super.field2115[var3] >> -arg0 + var4 & class69.field1221[arg0]) + var5;
        } else {
            var6 = (class69.field1221[var4] & super.field2115[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZZ)V")
    public static final void method582(boolean arg0, boolean arg1) {
        if (!arg0) {
            method580((byte) 117);
        }
        ++field1718;
        class256.field4560 = arg1;
        if (class256.field4560) {
            int var2 = class142.field2669.method827(255);
            int var3 = class142.field2669.method831((byte) -123);
            int var4 = class142.field2669.method832((byte) 125);
            int var5 = class142.field2669.method851(2096);
            class142.field2669.method573((byte) 33);
            for (int var6 = 0; ~var6 > -5; ++var6) {
                for (int var22 = 0; var22 < 13; ++var22) {
                    for (int var23 = 0; var23 < 13; ++var23) {
                        int var24 = class142.field2669.method581(1, 7);
                        if (~var24 == -2) {
                            class145.field2760[var6][var22][var23] = class142.field2669.method581(26, 7);
                        } else {
                            class145.field2760[var6][var22][var23] = -1;
                        }
                    }
                }
            }
            class142.field2669.method583(-10);
            int var7 = (-class142.field2669.field2155 + class217.field3976) / 16;
            class31.field510 = new int[var7][4];
            for (int var8 = 0; var8 < var7; ++var8) {
                for (int var21 = 0; var21 < 4; ++var21) {
                    class31.field510[var8][var21] = class142.field2669.method875((byte) 82);
                }
            }
            int var9 = class142.field2669.method872(16);
            class130.field2331 = null;
            class149.field2815 = new byte[var7][];
            class87.field1713 = new byte[var7][];
            class191.field3538 = new int[var7];
            class273.field4842 = new int[var7];
            class76.field1324 = new int[var7];
            class76.field1322 = new int[var7];
            class240.field4292 = null;
            class141.field2640 = new int[var7];
            int var10 = 0;
            for (int var11 = 0; ~var11 > -5; ++var11) {
                for (int var12 = 0; var12 < 13; ++var12) {
                    for (int var13 = 0; ~var13 > -14; ++var13) {
                        int var14 = class145.field2760[var11][var12][var13];
                        if (~var14 != 0) {
                            int var15 = 1023 & var14 >> 14;
                            int var16 = (16376 & var14) >> 3;
                            int var17 = (var15 / 8 << 8) - -(var16 / 8);
                            for (int var18 = 0; ~var10 < ~var18; ++var18) {
                                if (~class141.field2640[var18] == ~var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (~var17 != 0) {
                                class141.field2640[var10] = var17;
                                int var19 = (var17 & 65530) >> 8;
                                int var20 = 255 & var17;
                                class191.field3538[var10] = class24.field407.method1694(class87.method567(-11039, new class185[] { class206.field3786, class90.method591(var19, 0), class94.field1783, class90.method591(var20, 0) }), -2);
                                class273.field4842[var10] = class24.field407.method1694(class87.method567(-11039, new class185[] { class152.field2880, class90.method591(var19, 0), class94.field1783, class90.method591(var20, 0) }), -2);
                                class76.field1322[var10] = class24.field407.method1694(class87.method567(-11039, new class185[] { class18.field289, class90.method591(var19, 0), class94.field1783, class90.method591(var20, 0) }), -2);
                                class76.field1324[var10] = class24.field407.method1694(class87.method567(-11039, new class185[] { class24.field404, class90.method591(var19, 0), class94.field1783, class90.method591(var20, 0) }), -2);
                                ++var10;
                            }
                        }
                    }
                }
            }
            class6.method74(var4, var9, var2, var5, var3, 0, false);
        } else {
            int var25 = class142.field2669.method831((byte) -77);
            int var26 = class142.field2669.method851(2096);
            int var27 = (-class142.field2669.field2155 + class217.field3976) / 16;
            class31.field510 = new int[var27][4];
            for (int var28 = 0; ~var27 < ~var28; ++var28) {
                for (int var37 = 0; ~var37 > -5; ++var37) {
                    class31.field510[var28][var37] = class142.field2669.method875((byte) 64);
                }
            }
            int var29 = class142.field2669.method827(255);
            boolean var30 = false;
            int var31 = class142.field2669.method867(false);
            int var32 = class142.field2669.method831((byte) 59);
            class240.field4292 = null;
            class149.field2815 = new byte[var27][];
            class273.field4842 = new int[var27];
            if ((~(var32 / 8) == -49 || var32 / 8 == 49) && var25 / 8 == 48) {
                var30 = true;
            }
            class191.field3538 = new int[var27];
            class76.field1324 = new int[var27];
            if (var32 / 8 == 48 && var25 / 8 == 148) {
                var30 = true;
            }
            class130.field2331 = null;
            class141.field2640 = new int[var27];
            class76.field1322 = new int[var27];
            class87.field1713 = new byte[var27][];
            int var33 = 0;
            for (int var34 = (var32 - 6) / 8; ~((var32 + 6) / 8) <= ~var34; ++var34) {
                for (int var35 = (var25 + -6) / 8; (var25 + 6) / 8 >= var35; ++var35) {
                    int var36 = (var34 << 8) - -var35;
                    if (!var30 || var35 != 49 && ~var35 != -150 && var35 != 147 && ~var34 != -51 && (var34 != 49 || ~var35 != -48)) {
                        class141.field2640[var33] = var36;
                        class191.field3538[var33] = class24.field407.method1694(class87.method567(-11039, new class185[] { class206.field3786, class90.method591(var34, 0), class94.field1783, class90.method591(var35, 0) }), -2);
                        class273.field4842[var33] = class24.field407.method1694(class87.method567(-11039, new class185[] { class152.field2880, class90.method591(var34, 0), class94.field1783, class90.method591(var35, 0) }), -2);
                        class76.field1322[var33] = class24.field407.method1694(class87.method567(-11039, new class185[] { class18.field289, class90.method591(var34, 0), class94.field1783, class90.method591(var35, 0) }), -2);
                        class76.field1324[var33] = class24.field407.method1694(class87.method567(-11039, new class185[] { class24.field404, class90.method591(var34, 0), class94.field1783, class90.method591(var35, 0) }), -2);
                    } else {
                        class141.field2640[var33] = var36;
                        class191.field3538[var33] = -1;
                        class273.field4842[var33] = -1;
                        class76.field1322[var33] = -1;
                        class76.field1324[var33] = -1;
                    }
                    ++var33;
                }
            }
            class6.method74(var31, var32, var26, var29, var25, 0, false);
        }
    }

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "(I)V")
    public final void method583(int arg0) {
        super.field2155 = (this.field1735 + 7) / 8;
        if (arg0 == -10) {
            ++field1720;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(ZI)Lli;")
    public static final class185 method584(boolean arg0, int arg1) {
        ++field1736;
        if (~arg1 < -1 && arg1 <= 255) {
            class185 var2 = new class185();
            var2.field3411 = new byte[1];
            if (!arg0) {
                return null;
            } else {
                var2.field3437 = 1;
                var2.field3411[0] = (byte) arg1;
                return var2;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "(I)I")
    public final int method585(int arg0) {
        ++field1721;
        if (arg0 > -16) {
            field1734 = null;
        }
        return super.field2115[super.field2155++] - this.field1724.method1070(-1562076725) & 255;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZIII)V")
    public static final void method586(boolean arg0, int arg1, int arg2, int arg3) {
        class174 var4 = class249.method1671(4, arg2, (byte) 0);
        ++field1725;
        var4.method1233(0);
        var4.field3190 = arg1;
        if (!arg0) {
            method576((class250) null, (byte) -6);
        }
        var4.field3186 = arg3;
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(IB)I")
    public final int method587(int arg0, byte arg1) {
        ++field1728;
        if (arg1 != -118) {
            field1730 = null;
        }
        return arg0 * 8 + -this.field1735;
    }
}
