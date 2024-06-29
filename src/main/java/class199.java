import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class199 {

    @OriginalMember(owner = "client!po", name = "l", descriptor = "[Llo;")
    private class443[] field2753;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    private int field2744;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "[I")
    public static int[] field2743 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!po", name = "k", descriptor = "Luc;")
    public static class51 field2752 = new class51(128);

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "J")
    private long field2745;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "Los;")
    public static class129 field2756;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "Llo;")
    private class443 field2746;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IJ)Llo;")
    public final class443 method1311(int arg0, long arg1) {
        this.field2745 = arg1;
        field2748++;
        class443 var4 = this.field2753[(int) (arg1 & (long) (this.field2744 - 1))];
        for (this.field2746 = var4.field6406; this.field2746 != var4; this.field2746 = this.field2746.field6406) {
            if (this.field2746.field6404 == arg1) {
                class443 var6 = this.field2746;
                this.field2746 = this.field2746.field6406;
                return var6;
            }
        }
        this.field2746 = null;
        int var5 = 11 % ((-arg0 - 3) / 59);
        return null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1312(String arg0, int arg1, int arg2) {
        field2742++;
        boolean var3 = false;
        if (arg2 != -1) {
            field2754 = -29;
        }
        for (int var4 = 0; var4 < class402.field5869; var4++) {
            class317 var5 = class176.field2382[class117.field1528[var4]];
            if (var5 != null && var5.field4650 != null && var5.field4650.equalsIgnoreCase(arg0)) {
                if (arg1 == 1) {
                    class447.field6442++;
                    class140.field1797.method1833(-20379, 138);
                    class140.field1797.method2253(class117.field1528[var4], arg2 - 106);
                    class140.field1797.method2227(0, ~arg2);
                } else if (arg1 == 4) {
                    class140.field1797.method1833(-20379, 77);
                    class186.field2544++;
                    class140.field1797.method2254(class117.field1528[var4], 1082506952);
                    class140.field1797.method2227(0, ~arg2);
                } else if (arg1 == 5) {
                    class140.field1797.method1833(-20379, 128);
                    class167.field2258++;
                    class140.field1797.method2225(class117.field1528[var4], arg2 ^ 0x4B);
                    class140.field1797.method2227(0, 0);
                } else if (arg1 == 6) {
                    class117.field1519++;
                    class140.field1797.method1833(-20379, 132);
                    class140.field1797.method2204(0, 8);
                    class140.field1797.method2250(false, class117.field1528[var4]);
                } else if (arg1 == 7) {
                    class234.field3259++;
                    class140.field1797.method1833(-20379, 213);
                    class140.field1797.method2253(class117.field1528[var4], arg2 ^ 0xFFFFFFB6);
                    class140.field1797.method2227(0, arg2 + 1);
                }
                var3 = true;
                break;
            }
        }
        if (!var3) {
            class295.method1996(class175.field2370 + arg0, (byte) -62);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II)V")
    public static final void method1313(int arg0, int arg1) {
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        field2751++;
        if (arg0 <= 85) {
            method1315(true);
        }
        class162.field2150 = arg1;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "([[B[[II[[BLda;ZLda;I[[B[[BILtj;I)V")
    public static final void method1314(byte[][] arg0, int[][] arg1, int arg2, byte[][] arg3, class193 arg4, boolean arg5, class193 arg6, int arg7, byte[][] arg8, byte[][] arg9, int arg10, class298 arg11, int arg12) {
        field2750++;
        for (int var13 = 0; var13 < arg2; var13++) {
            for (int var14 = 0; var14 < arg12; var14++) {
                if (class226.method1467(0) || class329.method2155(16, var14, arg10, var13, class63.field946)) {
                    byte var15 = arg3[var13][var14];
                    byte var16 = arg9[var13][var14];
                    int var17 = arg8[var13][var14] & 0xFF;
                    int var18 = arg0[var13][var14] & 0xFF;
                    class21 var19 = var17 == 0 ? null : class269.method1794(arg7 - 1700488967, var17 + -1);
                    class149 var20 = var18 == 0 ? null : class15.method115(var18 - 1, (byte) -98);
                    int var21 = 0;
                    int var22 = 0;
                    if (var15 != 0) {
                        var21 = var20 == null ? 0 : class50.field766[var15];
                        var22 = var19 == null ? 0 : class145.field1867[var15];
                    } else if (var19 != null) {
                        var22 = class145.field1867[var15];
                    } else if (var20 != null) {
                        var21 = class145.field1867[var15];
                    }
                    int var23 = var21 + var22;
                    int var24 = 0;
                    if (var23 != 0) {
                        int[] var25 = new int[var23];
                        int[] var26 = new int[var23];
                        int[] var27 = new int[var23];
                        int[] var28 = new int[var23];
                        boolean var29 = false;
                        if (var19 != null && (var19.field387 != -1 || var19.field390 != -1 || var19.field391 != -1)) {
                            int var30 = arg11.method479() ? var19.field391 : var19.field389;
                            if (!class423.field6169) {
                                var30 = -1;
                            }
                            for (int var31 = 0; var31 < var22; var31++) {
                                var27[var24] = var30;
                                var28[var24] = var19.field375;
                                if (var19.field387 == -1) {
                                    var25[var24] = -1;
                                } else {
                                    var25[var24] = var19.field387;
                                }
                                if (var19.field390 == -1) {
                                    var26[var24] = -1;
                                } else {
                                    var29 = true;
                                    var26[var24] = var19.field390;
                                }
                                var24++;
                            }
                            if (!arg5 && arg10 == 0) {
                                class317.method2082(var13, var14, var19.field372, var19.field379 * 8);
                            }
                        } else {
                            for (int var32 = 0; var32 < var22; var32++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        }
                        if (!var29) {
                            var26 = null;
                        }
                        if (var20 == null) {
                            for (int var33 = 0; var33 < var21; var33++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        } else {
                            int var34 = var20.field1894;
                            if (!class423.field6169) {
                                var34 = -1;
                            }
                            for (int var35 = 0; var35 < var21; var35++) {
                                var27[var24] = var34;
                                var28[var24] = var20.field1903;
                                var25[var24] = arg1[var13][var14];
                                if (var26 != null) {
                                    var26[var24] = -1;
                                }
                                var24++;
                            }
                        }
                        int var36 = class113.field1461.length;
                        int[] var37 = arg5 ? new int[var36] : null;
                        int[] var38 = new int[var36];
                        int[] var39 = new int[var36];
                        for (int var40 = 0; var40 < var36; var40++) {
                            int var48 = class113.field1461[var40];
                            int var49 = class40.field611[var40];
                            if (var16 == 0) {
                                var38[var40] = var48;
                                var39[var40] = var49;
                            } else if (var16 == 1) {
                                var38[var40] = var49;
                                var39[var40] = 128 - var48;
                            } else if (var16 == 2) {
                                var38[var40] = 128 - var48;
                                var39[var40] = 128 - var49;
                            } else if (var16 == 3) {
                                var38[var40] = 128 - var49;
                                var39[var40] = var48;
                            }
                            if (arg5 && class389.field5698[var15][var40]) {
                                int var52 = (var13 << 7) + var38[var40];
                                int var53 = (var14 << 7) + var39[var40];
                                var37[var40] = arg6.method725(var52, var53) - arg4.method725(var52, var53);
                            }
                        }
                        int var41 = arg4.method722(var13, var14);
                        int var42 = arg4.method722(var13 + 1, var14);
                        int var43 = arg4.method722(var13 + 1, var14 + 1);
                        int var44 = arg4.method722(var13, var14 + 1);
                        if (arg10 > 0) {
                            boolean var45 = true;
                            if (var18 == 0 && var15 != 0) {
                                var45 = false;
                            }
                            if (var17 > 0 && var19 != null && !var19.field373) {
                                var45 = false;
                            }
                            if (var45 && var41 == var42 && var41 == var43 && var41 == var44) {
                                class173.field2355[arg10][var13][var14] = (byte) class258.method1708(class173.field2355[arg10][var13][var14], 4);
                            }
                        }
                        int var46 = 0;
                        int var47 = 0;
                        if (arg5) {
                            var46 = class14.method102(var13, var14);
                            var47 = class179.method1177(var13, var14);
                        }
                        arg4.method729(var13, var14, var38, var37, var39, class50.field772[var15], class81.field1108[var15], class393.field5721[var15], var25, var26, var27, var28, var46, var47, false);
                        class267.method1787(arg10, var13, var14);
                    }
                }
            }
        }
        if (arg7 != 1700470791) {
            method1317(true, 52, true, 48, 113, 113, 100, -71);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V")
    public static void method1315(boolean arg0) {
        field2743 = null;
        field2756 = null;
        field2752 = null;
        if (!arg0) {
            method1312((String) null, 70, -53);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)Llo;")
    public final class443 method1316(int arg0) {
        field2747++;
        if (this.field2746 == null) {
            return null;
        }
        class443 var2 = this.field2753[(int) (this.field2745 & (long) (this.field2744 - 1))];
        while (this.field2746 != var2) {
            if (this.field2746.field6404 == this.field2745) {
                class443 var4 = this.field2746;
                this.field2746 = this.field2746.field6406;
                return var4;
            }
            this.field2746 = this.field2746.field6406;
        }
        this.field2746 = null;
        int var3 = -47 % ((24 - arg0) / 39);
        return null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ZIZIIIII)V")
    public static final void method1317(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2755++;
        if (!arg2 && class359.field5314 == arg5 && class62.field940 == arg4 && class63.field946 == arg3 || class226.method1467(0)) {
            return;
        }
        class63.field946 = arg3;
        class359.field5314 = arg5;
        class62.field940 = arg4;
        if (class226.method1467(0)) {
            class63.field946 = 0;
        }
        if (arg0) {
            class63.method558(28, true);
        } else {
            class63.method558(25, true);
        }
        class447.method2773(class165.field2240, true, (byte) -41, class41.field630);
        int var8 = class236.field3292;
        class236.field3292 = (class359.field5314 - (class351.field5217 >> 4)) * 8;
        int var9 = class90.field1223;
        class90.field1223 = (class62.field940 - (class143.field1815 >> 4)) * 8;
        class47.field709 = class200.method1324(class359.field5314 * 8, class62.field940 * 8);
        class162.field2130 = null;
        int var10 = class236.field3292 - var8;
        int var11 = class90.field1223 - var9;
        if (arg0) {
            class93.field1274 = 0;
            int var12 = class351.field5217 * 128 - 128;
            int var13 = class143.field1815 * 128 - 128;
            for (int var14 = 0; var14 < 32768; var14++) {
                class163 var15 = class388.field5670[var14];
                if (var15 != null) {
                    var15.field5930 -= var11 * 128;
                    var15.field5921 -= var10 * 128;
                    if (var15.field5921 >= 0 && var12 >= var15.field5921 && var15.field5930 >= 0 && var15.field5930 <= var13) {
                        boolean var16 = true;
                        for (int var17 = 0; var17 < 10; var17++) {
                            var15.field2190[var17] -= var10;
                            var15.field2189[var17] -= var11;
                            if (var15.field2190[var17] < 0 || var15.field2190[var17] >= class351.field5217 || var15.field2189[var17] < 0 || var15.field2189[var17] >= class143.field1815) {
                                var16 = false;
                            }
                        }
                        if (var16) {
                            class62.field943[class93.field1274++] = var14;
                        } else {
                            class388.field5670[var14].method1106((class189) null, (byte) -125);
                            class388.field5670[var14] = null;
                        }
                    } else {
                        class388.field5670[var14].method1106((class189) null, (byte) -125);
                        class388.field5670[var14] = null;
                    }
                }
            }
        } else {
            for (int var18 = 0; var18 < 32768; var18++) {
                class163 var23 = class388.field5670[var18];
                if (var23 != null) {
                    for (int var24 = 0; var24 < 10; var24++) {
                        var23.field2190[var24] -= var10;
                        var23.field2189[var24] -= var11;
                    }
                    var23.field5930 -= var11 * 128;
                    var23.field5921 -= var10 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class317 var21 = class176.field2382[var19];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field2190[var22] -= var10;
                    var21.field2189[var22] -= var11;
                }
                var21.field5921 -= var10 * 128;
                var21.field5930 -= var11 * 128;
            }
        }
        class268.field3973 = arg3;
        class383.field5609.method2076(arg6, -125, arg1, class268.field3973, false);
        class295.method2004(var10, var11, -109);
        if (arg7 <= 62) {
            method1315(false);
        }
        for (class316 var20 = (class316) class41.field625.method1575(0); var20 != null; var20 = (class316) class41.field625.method1573((byte) -128)) {
            var20.field4630 -= var11;
            var20.field4628 -= var10;
            if (var20.field4628 < 0 || var20.field4630 < 0 || class351.field5217 <= var20.field4628 || class143.field1815 <= var20.field4630) {
                var20.method2632(true);
            }
        }
        if (class47.field712 != 0) {
            class47.field712 -= var10;
            class142.field1805 -= var11;
        }
        class236.field3301 = 0;
        if (arg0) {
            class326.field4829 -= var10 * 128;
            class279.field4099 -= var11 * 128;
            class191.field2662 -= var10;
            class450.field6458 -= var10;
            class424.field6192 -= var11;
            class440.field6377 -= var11;
            if (Math.abs(var10) > class351.field5217 || Math.abs(var11) > class143.field1815) {
                class104.method795(false);
            }
        } else if (class212.field2884 == 4) {
            class7.field96 -= var11 * 128;
            class334.field4904 -= var10 * 128;
            class357.field5297 -= var10 * 128;
            class159.field2065 -= var11 * 128;
        } else {
            class212.field2884 = 1;
        }
        class403.method2571(-1);
        class176.field2383.method1574(-32166);
        class331.field4873.method1574(-32166);
        class354.field5254.method48(22754);
        class372.method2445(127);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Llo;IJ)V")
    public final void method1318(class443 arg0, int arg1, long arg2) {
        if (arg0.field6402 != null) {
            arg0.method2764((byte) 119);
        }
        int var5 = 5 % ((arg1 - 64) / 42);
        field2749++;
        class443 var6 = this.field2753[(int) ((long) (this.field2744 - 1) & arg2)];
        arg0.field6402 = var6.field6402;
        arg0.field6406 = var6;
        arg0.field6402.field6406 = arg0;
        arg0.field6404 = arg2;
        arg0.field6406.field6402 = arg0;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(I)V")
    public class199(int arg0) {
        this.field2753 = new class443[arg0];
        this.field2744 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class443 var3 = this.field2753[var2] = new class443();
            var3.field6402 = var3;
            var3.field6406 = var3;
        }
    }
}
