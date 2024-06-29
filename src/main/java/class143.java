import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class143 extends class95 {

    @OriginalMember(owner = "client!d", name = "S", descriptor = "Lgl;")
    public static class194 field2518 = null;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "I")
    public static int field2522 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "Lsf;")
    public static class108 field2521 = class140.method973(255, "n");

    @OriginalMember(owner = "client!d", name = "N", descriptor = "Ljm;")
    public static class240 field2514 = new class240();

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "Lsf;")
    public static class108 field2528 = class140.method973(255, "hitmarks");

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "Z")
    public static boolean field2525 = true;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!d", name = "X", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "Lof;")
    private class242 field2509;

    @OriginalMember(owner = "client!d", name = "bb", descriptor = "Lik;")
    public static class262 field2527;

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "[Lt;")
    public static class257[] field2526;

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "[S")
    public static short[] field2524;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "[[[S")
    public static short[][][] field2517;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([Ljava/lang/Object;[JI)V", line = 9)
    public static final void method984(Object[] arg0, long[] arg1, int arg2) {
        field2519++;
        class329.method2257(arg0, 0, 57, arg1.length - 1, arg1);
        if (arg2 != 128) {
            field2514 = (class240) null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIILfb;II)V", line = 26)
    public static final void method985(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class60 arg6, int arg7, int arg8) {
        int var9 = arg7 & 0x3;
        field2523++;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg6.field899;
            var11 = arg6.field939;
        } else {
            var10 = arg6.field939;
            var11 = arg6.field899;
        }
        int var12;
        int var13;
        if (arg8 + var11 <= 104) {
            var12 = (var11 >> 1) + arg8;
            var13 = (var11 + 1 >> 1) + arg8;
        } else {
            var13 = arg8 + 1;
            var12 = arg8;
        }
        int var14;
        int var15;
        if (arg5 + var10 > 104) {
            var14 = arg5 + 1;
            var15 = arg5;
        } else {
            var14 = (var10 + 1 >> 1) + arg5;
            var15 = (var10 >> 1) + arg5;
        }
        int var16 = (arg5 << 7) + (var10 << 6);
        if (arg1 != 20) {
            field2528 = (class108) null;
        }
        int[][] var17 = class278.field4883[arg3];
        int var18 = var17[var15][var12] + var17[var15][var13] + var17[var14][var12] + var17[var14][var13] >> 2;
        int var19 = (arg8 << 7) + (var11 << 6);
        int var20 = 0;
        if (arg3 != 0) {
            int[][] var21 = class278.field4883[0];
            var20 = var18 - (var21[var14][var12] + var21[var15][var12] + var21[var14][var13] + var21[var15][var13] >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg3 < 3) {
            var22 = class278.field4883[arg3 + 1];
        }
        class155 var23 = arg6.method410(var22, arg7, false, (byte) -119, arg0, (class257) null, true, var19, var17, var18, var16);
        class238.method1651(var23.field2781, var16 - arg4, var20, var19 - arg2);
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V", line = 101)
    public static void method986(int arg0) {
        field2524 = null;
        field2517 = (short[][][]) null;
        if (arg0 < 87) {
            method986(-5);
        }
        field2514 = null;
        field2528 = null;
        field2521 = null;
        field2526 = null;
        field2527 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I[[IIZBIBLcl;I[[F[[FI[[FIBI)V", line = 120)
    public static final void method987(int arg0, int[][] arg1, int arg2, boolean arg3, byte arg4, int arg5, byte arg6, class133 arg7, int arg8, float[][] arg9, float[][] arg10, int arg11, float[][] arg12, int arg13, byte arg14, int arg15) {
        int var16 = (arg15 << 8) + 255;
        int var17 = (arg11 << 8) + 255;
        int var18 = (arg13 << 8) + 255;
        field2510++;
        int[] var19 = class14.field166[arg4];
        int var20 = (arg5 << 8) + 255;
        int[] var21 = new int[var19.length >> 1];
        int[] var22 = null;
        for (int var23 = 0; var23 < var21.length; var23++) {
            var21[var23] = class121.method846(arg12, arg1, -31999, (int[][]) null, arg6, false, var17, var19[var23 + var23], arg9, var18, arg10, arg0, var16, 0.0F, var19[var23 + var23 + 1], arg7, var20, arg8);
        }
        if (arg3) {
            if (arg4 == 1) {
                var22 = new int[6];
                int var25 = class121.method846(arg12, arg1, -31999, (int[][]) null, arg6, true, var17, 64, arg9, var18, arg10, arg0, var16, 0.0F, 128, arg7, var20, arg8);
                int var26 = class121.method846(arg12, arg1, -31999, (int[][]) null, arg6, true, var17, 128, arg9, var18, arg10, arg0, var16, 0.0F, 64, arg7, var20, arg8);
                var22[0] = var26;
                var22[4] = var21[0];
                var22[1] = var25;
                var22[2] = var21[2];
                var22[3] = var25;
                var22[5] = var21[2];
            } else if (arg4 == 2) {
                var22 = new int[6];
                int var27 = class121.method846(arg12, arg1, -31999, (int[][]) null, arg6, true, var17, 128, arg9, var18, arg10, arg0, var16, 0.0F, 128, arg7, var20, arg8);
                int var28 = class121.method846(arg12, arg1, arg14 ^ 0xFFFF8378, (int[][]) null, arg6, true, var17, 64, arg9, var18, arg10, arg0, var16, 0.0F, 0, arg7, var20, arg8);
                var22[0] = var21[0];
                var22[3] = var27;
                var22[2] = var27;
                var22[1] = var28;
                var22[5] = var21[0];
                var22[4] = var21[1];
            } else if (arg4 == 3) {
                var22 = new int[6];
                int var29 = class121.method846(arg12, arg1, -31999, (int[][]) null, arg6, true, var17, 0, arg9, var18, arg10, arg0, var16, 0.0F, 128, arg7, var20, arg8);
                int var30 = class121.method846(arg12, arg1, -31999, (int[][]) null, arg6, true, var17, 64, arg9, var18, arg10, arg0, var16, 0.0F, 0, arg7, var20, arg8);
                var22[4] = var30;
                var22[3] = var29;
                var22[1] = var21[1];
                var22[0] = var21[2];
                var22[2] = var29;
                var22[5] = var21[2];
            } else if (arg4 == 4) {
                var22 = new int[3];
                int var31 = class121.method846(arg12, arg1, -31999, (int[][]) null, arg6, true, var17, 0, arg9, var18, arg10, arg0, var16, 0.0F, 128, arg7, var20, arg8);
                var22[1] = var31;
                var22[0] = var21[3];
                var22[2] = var21[0];
            } else if (arg4 == 5) {
                int var43 = class121.method846(arg12, arg1, -31999, (int[][]) null, arg6, true, var17, 128, arg9, var18, arg10, arg0, var16, 0.0F, 128, arg7, var20, arg8);
                var22 = new int[] { var21[2], var43, var21[3] };
            } else if (arg4 == 6) {
                var22 = new int[6];
                int var41 = class121.method846(arg12, arg1, -31999, (int[][]) null, arg6, true, var17, 128, arg9, var18, arg10, arg0, var16, 0.0F, 0, arg7, var20, arg8);
                int var42 = class121.method846(arg12, arg1, -31999, (int[][]) null, arg6, true, var17, 128, arg9, var18, arg10, arg0, var16, 0.0F, 128, arg7, var20, arg8);
                var22[0] = var21[3];
                var22[1] = var41;
                var22[3] = var42;
                var22[2] = var42;
                var22[5] = var21[3];
                var22[4] = var21[0];
            } else if (arg4 == 7) {
                var22 = new int[6];
                int var39 = class121.method846(arg12, arg1, -31999, (int[][]) null, arg6, true, var17, 0, arg9, var18, arg10, arg0, var16, 0.0F, 128, arg7, var20, arg8);
                int var40 = class121.method846(arg12, arg1, -31999, (int[][]) null, arg6, true, var17, 128, arg9, var18, arg10, arg0, var16, 0.0F, 0, arg7, var20, arg8);
                var22[3] = var39;
                var22[2] = var39;
                var22[4] = var21[2];
                var22[0] = var21[1];
                var22[1] = var40;
                var22[5] = var21[1];
            } else if (arg4 == 8) {
                int var38 = class121.method846(arg12, arg1, arg14 - 32120, (int[][]) null, arg6, true, var17, 0, arg9, var18, arg10, arg0, var16, 0.0F, 0, arg7, var20, arg8);
                var22 = new int[] { var21[3], var38, var21[4] };
            } else if (arg4 == 9) {
                int var35 = class121.method846(arg12, arg1, -31999, (int[][]) null, arg6, true, var17, 128, arg9, var18, arg10, arg0, var16, 0.0F, 64, arg7, var20, arg8);
                var22 = new int[15];
                int var36 = class121.method846(arg12, arg1, -31999, (int[][]) null, arg6, true, var17, 96, arg9, var18, arg10, arg0, var16, 0.0F, 32, arg7, var20, arg8);
                int var37 = class121.method846(arg12, arg1, -31999, (int[][]) null, arg6, true, var17, 64, arg9, var18, arg10, arg0, var16, 0.0F, 0, arg7, var20, arg8);
                var22[9] = var36;
                var22[6] = var36;
                var22[0] = var36;
                var22[3] = var36;
                var22[12] = var36;
                var22[14] = var37;
                var22[2] = var21[4];
                var22[5] = var21[3];
                var22[10] = var21[2];
                var22[1] = var35;
                var22[8] = var21[2];
                var22[13] = var21[1];
                var22[11] = var21[1];
                var22[4] = var21[4];
                var22[7] = var21[3];
            } else if (arg4 == 10) {
                var22 = new int[9];
                int var32 = class121.method846(arg12, arg1, -31999, (int[][]) null, arg6, true, var17, 0, arg9, var18, arg10, arg0, var16, 0.0F, 128, arg7, var20, arg8);
                var22[7] = var32;
                var22[1] = var32;
                var22[0] = var21[2];
                var22[8] = var21[0];
                var22[2] = var21[3];
                var22[4] = var32;
                var22[6] = var21[4];
                var22[3] = var21[3];
                var22[5] = var21[4];
            } else if (arg4 == 11) {
                var22 = new int[12];
                int var33 = class121.method846(arg12, arg1, arg14 ^ 0xFFFF8378, (int[][]) null, arg6, true, var17, 0, arg9, var18, arg10, arg0, var16, 0.0F, 64, arg7, var20, arg8);
                int var34 = class121.method846(arg12, arg1, -31999, (int[][]) null, arg6, true, var17, 128, arg9, var18, arg10, arg0, var16, 0.0F, 64, arg7, var20, arg8);
                var22[0] = var21[3];
                var22[8] = var33;
                var22[7] = var34;
                var22[1] = var33;
                var22[11] = var34;
                var22[5] = var33;
                var22[10] = var21[1];
                var22[2] = var21[0];
                var22[6] = var21[2];
                var22[4] = var21[2];
                var22[9] = var21[2];
                var22[3] = var21[3];
            }
        }
        arg7.method914(arg2, arg8, arg0, var21, var22, false);
        if (arg14 != 121) {
            field2527 = (class262) null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lrm;II)V", line = 392)
    private final void method988(class249 arg0, int arg1, int arg2) {
        if (arg1 == 249) {
            int var4 = arg0.method1731(true);
            if (this.field2509 == null) {
                int var5 = class117.method832(var4, (byte) 94);
                this.field2509 = new class242(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1731(true) == 1;
                int var8 = arg0.method1749(false);
                class184 var9;
                if (var7) {
                    var9 = new class324(arg0.method1740(true));
                } else {
                    var9 = new class236(arg0.method1738(-1756395344));
                }
                this.field2509.method1681(1, var9, (long) var8);
            }
        }
        if (arg2 <= 15) {
            field2526 = (class257[]) null;
        }
        field2520++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILrm;)V", line = 440)
    public final void method989(int arg0, class249 arg1) {
        if (arg0 != -23734) {
            this.method988((class249) null, 86, -81);
        }
        field2511++;
        while (true) {
            int var3 = arg1.method1731(true);
            if (var3 == 0) {
                return;
            }
            this.method988(arg1, var3, arg0 ^ 0xFFFFA35A);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lsf;II)Lsf;", line = 460)
    public final class108 method990(class108 arg0, int arg1, int arg2) {
        field2516++;
        if (this.field2509 == null) {
            return arg0;
        }
        if (arg1 != 1023) {
            field2528 = (class108) null;
        }
        class324 var4 = (class324) this.field2509.method1676((long) arg2, (byte) -65);
        return var4 == null ? arg0 : var4.field5532;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BIILca;)V", line = 479)
    public static final void method991(byte arg0, int arg1, int arg2, class98 arg3) {
        field2512++;
        if (arg3.field1588 == 1) {
            class27.field416++;
            class62.method428(0, -124, arg3.field1704, class63.field1016, 0L, (short) 48, arg3.field1649);
        }
        if (arg3.field1588 == 2 && !class172.field3132) {
            class108 var4 = class176.method1244(arg3, (byte) -109);
            if (var4 != null) {
                class83.field1285++;
                class62.method428(-1, -112, var4, class117.method833(new class108[] { class308.field5349, arg3.field1718 }, false), 0L, (short) 3, arg3.field1649);
            }
        }
        if (arg3.field1588 == 3) {
            class151.field2736++;
            class62.method428(0, -115, class201.field3642, class63.field1016, 0L, (short) 11, arg3.field1649);
        }
        if (arg3.field1588 == 4) {
            class259.field4564++;
            class62.method428(0, -122, arg3.field1704, class63.field1016, 0L, (short) 36, arg3.field1649);
        }
        if (arg3.field1588 == 5) {
            class62.method428(0, -125, arg3.field1704, class63.field1016, 0L, (short) 6, arg3.field1649);
            class5.field61++;
        }
        if (arg3.field1588 == 6 && class175.field3197 == null) {
            class98.field1600++;
            class62.method428(-1, -113, arg3.field1704, class63.field1016, 0L, (short) 12, arg3.field1649);
        }
        if (arg3.field1677 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field1648; var6++) {
                for (int var7 = 0; var7 < arg3.field1733; var7++) {
                    int var8 = (arg3.field1652 + 32) * var7;
                    int var9 = (arg3.field1564 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg3.field1706[var5];
                        var8 += arg3.field1725[var5];
                    }
                    if (var8 <= arg2 && var9 <= arg1 && var8 + 32 > arg2 && arg1 < (var9 + 32)) {
                        class278.field4879 = arg3;
                        class46.field660 = var5;
                        if (arg3.field1575[var5] > 0) {
                            class145 var10 = class144.method994(true, arg3.field1575[var5] - 1);
                            if (class84.field1347 == 1 && class297.method2104(arg0 ^ 0xFFFF89F9, client.method1815(arg3))) {
                                if (class132.field2262 != arg3.field1649 || class14.field160 != var5) {
                                    class63.field1012++;
                                    class62.method428(var5, -126, class288.field5045, class117.method833(new class108[] { class331.field5662, class216.field3853, var10.field2610 }, false), (long) var10.field2586, (short) 42, arg3.field1649);
                                }
                            } else if (!class172.field3132 || !class297.method2104(30332, client.method1815(arg3))) {
                                class207.field3705++;
                                class108[] var11 = var10.field2552;
                                if (class324.field5527) {
                                    var11 = class26.method174(var11, (byte) 110);
                                }
                                if (class297.method2104(30332, client.method1815(arg3))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class75.field1158++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 59;
                                            } else {
                                                var13 = 20;
                                            }
                                            class62.method428(var5, arg0 ^ 0xB, var11[var12], class117.method833(new class108[] { class320.field5486, var10.field2610 }, false), (long) var10.field2586, var13, arg3.field1649);
                                        } else if (var12 == 4) {
                                            class62.method428(var5, -122, class242.field4220, class117.method833(new class108[] { class320.field5486, var10.field2610 }, false), (long) var10.field2586, (short) 20, arg3.field1649);
                                            class295.field5144++;
                                        }
                                    }
                                }
                                if (class27.method177(client.method1815(arg3), false)) {
                                    class62.method428(var5, -121, class288.field5045, class117.method833(new class108[] { class320.field5486, var10.field2610 }, false), (long) var10.field2586, (short) 39, arg3.field1649);
                                    class88.field1409++;
                                }
                                if (class297.method2104(30332, client.method1815(arg3)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 16;
                                            }
                                            class108.field1899++;
                                            if (var14 == 1) {
                                                var15 = 14;
                                            }
                                            if (var14 == 2) {
                                                var15 = 8;
                                            }
                                            class62.method428(var5, -125, var11[var14], class117.method833(new class108[] { class320.field5486, var10.field2610 }, false), (long) var10.field2586, var15, arg3.field1649);
                                        }
                                    }
                                }
                                class108[] var16 = arg3.field1634;
                                if (class324.field5527) {
                                    var16 = class26.method174(var16, (byte) 111);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class63.field1015++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 43;
                                            }
                                            if (var17 == 1) {
                                                var18 = 38;
                                            }
                                            if (var17 == 2) {
                                                var18 = 50;
                                            }
                                            if (var17 == 3) {
                                                var18 = 18;
                                            }
                                            if (var17 == 4) {
                                                var18 = 37;
                                            }
                                            class62.method428(var5, -115, var16[var17], class117.method833(new class108[] { class320.field5486, var10.field2610 }, false), (long) var10.field2586, var18, arg3.field1649);
                                        }
                                    }
                                }
                                class62.method428(var5, -121, class149.field2725, class117.method833(new class108[] { class320.field5486, var10.field2610 }, false), (long) var10.field2586, (short) 1006, arg3.field1649);
                            } else if ((class21.field324 & 0x10) == 16) {
                                class290.field5068++;
                                class62.method428(var5, arg0 ^ 0xE, class72.field1103, class117.method833(new class108[] { class131.field2248, class216.field3853, var10.field2610 }, false), (long) var10.field2586, (short) 35, arg3.field1649);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (arg3.field1640) {
            if (!class172.field3132) {
                for (int var19 = 9; var19 >= 5; var19--) {
                    class108 var20 = class104.method716(true, arg3, var19);
                    if (var20 != null) {
                        class62.method428(arg3.field1583, arg0 ^ 0xD, var20, arg3.field1669, (long) (var19 + 1), (short) 1001, arg3.field1649);
                        class183.field3358++;
                    }
                }
                class108 var21 = class176.method1244(arg3, (byte) -117);
                if (var21 != null) {
                    class62.method428(arg3.field1583, -118, var21, arg3.field1669, 0L, (short) 3, arg3.field1649);
                    class83.field1285++;
                }
                for (int var22 = 4; var22 >= 0; var22--) {
                    class108 var23 = class104.method716(true, arg3, var22);
                    if (var23 != null) {
                        class183.field3358++;
                        class62.method428(arg3.field1583, -113, var23, arg3.field1669, (long) (var22 + 1), (short) 34, arg3.field1649);
                    }
                }
                if (class307.method2150(110, client.method1815(arg3))) {
                    class98.field1600++;
                    class62.method428(arg3.field1583, -115, class62.field998, class63.field1016, 0L, (short) 12, arg3.field1649);
                }
            } else if (class286.method2050(188, client.method1815(arg3)) && (class21.field324 & 0x20) == 32) {
                class246.field4259++;
                class62.method428(arg3.field1583, arg0 ^ 0x0, class72.field1103, class117.method833(new class108[] { class131.field2248, class64.field1027, arg3.field1669 }, false), 0L, (short) 21, arg3.field1649);
            }
        }
        if (arg0 != -123) {
            field2528 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZI[BII[Loj;IIIII)V", line = 811)
    public static final void method992(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4, class328[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2513++;
        if (!arg0) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if ((arg1 + var11) > 0 && (arg1 + var11) < 103 && (arg9 + var12) > 0 && (arg9 + var12) < 103) {
                        arg5[arg3].field5605[arg1 + var11][arg9 + var12] = class162.method1118(arg5[arg3].field5605[arg1 + var11][arg9 + var12], -16777217);
                    }
                }
            }
        }
        byte var13;
        if (arg0) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        class249 var14 = new class249(arg2);
        for (int var15 = 0; var15 < var13; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg4 == var15 && arg6 <= var16 && var16 < (arg6 + 8) && arg8 <= var17 && (arg8 + 8) > var17) {
                        class195.method1392(arg0, (byte) 57, 0, arg3, arg9 + class324.method2225(arg7, var17 & 0x7, 0, var16 & 0x7), arg1 + class272.method1962(var17 & 0x7, arg7, 0, var16 & 0x7), arg7, 0, var14);
                    } else {
                        class195.method1392(arg0, (byte) -117, 0, 0, -1, -1, 0, 0, var14);
                    }
                }
            }
        }
        while (var14.field4338.length > var14.field4314) {
            int var18 = var14.method1731(true);
            if (var18 != 129) {
                var14.field4314--;
                break;
            }
            for (int var19 = 0; var19 < 4; var19++) {
                byte var20 = var14.method1721((byte) 103);
                if (var20 == 0) {
                    if (var19 <= arg4) {
                        int var28 = arg1;
                        int var29 = arg1 + 7;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 >= 104) {
                            var29 = 104;
                        }
                        if (arg1 < 0) {
                            var28 = 0;
                        } else if (arg1 >= 104) {
                            var28 = 104;
                        }
                        int var30 = arg9 + 7;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 >= 104) {
                            var30 = 104;
                        }
                        int var31 = arg9;
                        if (arg9 < 0) {
                            var31 = 0;
                        } else if (arg9 >= 104) {
                            var31 = 104;
                        }
                        while (var29 > var28) {
                            while (var30 > var31) {
                                class311.field5382[arg3][var28][var31] = 0;
                                var31++;
                            }
                            var28++;
                        }
                    }
                } else if (var20 == 1) {
                    for (int var21 = 0; var21 < 64; var21 += 4) {
                        for (int var22 = 0; var22 < 64; var22 += 4) {
                            byte var23 = var14.method1721((byte) 53);
                            if (arg4 >= var19) {
                                int var24 = var21;
                                while (var24 < var21 + 4) {
                                    int var25 = var22;
                                    while (var25 < var22 + 4) {
                                        if (arg6 <= var24 && (arg6 + 8) > var24 && var25 >= arg8 && arg8 < arg8 + 8) {
                                            int var26 = class272.method1962(var25 & 0x7, arg7, 0, var24 & 0x7) + arg1;
                                            int var27 = arg9 + class324.method2225(arg7, var25 & 0x7, 0, var24 & 0x7);
                                            if (var26 >= 0 && var26 < 104 && var27 >= 0 && var27 < 104) {
                                                class311.field5382[arg3][var26][var27] = var23;
                                            }
                                        }
                                        var22++;
                                    }
                                    var21++;
                                }
                            }
                        }
                    }
                } else if (var20 != 2) {
                }
            }
        }
        if (arg10 >= -56) {
            method986(70);
        }
        boolean var32 = false;
        if (class231.field4051 && !arg0) {
            class186 var33 = null;
            while (true) {
                while (var14.field4314 < var14.field4338.length) {
                    int var34 = var14.method1731(true);
                    if (var34 == 0) {
                        var33 = new class186(var14);
                    } else if (var34 == 1) {
                        int var35 = var14.method1731(true);
                        if (var35 > 0) {
                            for (int var36 = 0; var36 < var35; var36++) {
                                class46 var37 = new class46(var14);
                                int var38 = var37.field678 >> 7;
                                int var39 = var37.field674 >> 7;
                                if (var37.field671 == arg4 && arg6 <= var38 && arg6 + 8 > var38 && arg8 <= var39 && arg8 + 8 > var39) {
                                    int var40 = (arg1 << 7) + class249.method1714(arg7, var37.field678 & 0x3FF, var37.field674 & 0x3FF, (byte) -56);
                                    int var41 = (arg9 << 7) + class98.method674(var37.field674 & 0x3FF, var37.field678 & 0x3FF, arg7, -3);
                                    var37.field678 = var40;
                                    int var42 = var37.field678 >> 7;
                                    var37.field674 = var41;
                                    int var43 = var37.field674 >> 7;
                                    if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                                        var37.field683 = class278.field4883[var37.field671][var42][var43] - var37.field683;
                                        class267.method1929(var37);
                                    }
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var33 == null) {
                    var33 = new class186();
                }
                class123.field2094[arg1 >> 3][arg9 >> 3] = var33;
                break;
            }
        }
        if (var32) {
            return;
        }
        int var44 = arg9 + 7;
        int var45 = arg1 + 7;
        for (int var46 = arg1; var46 < var45; var46++) {
            for (int var47 = arg9; var47 < var44; var47++) {
                class311.field5382[arg3][var46][var47] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)I", line = 1130)
    public final int method993(int arg0, int arg1, int arg2) {
        field2515++;
        if (this.field2509 == null) {
            return arg1;
        }
        if (arg2 != 32) {
            method985(-102, 24, -49, 61, -83, -67, (class60) null, 93, 82);
        }
        class236 var4 = (class236) this.field2509.method1676((long) arg0, (byte) -97);
        return var4 == null ? arg1 : var4.field4144;
    }
}
