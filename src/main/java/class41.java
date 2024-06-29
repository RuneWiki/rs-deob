import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class41 {

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "[[[I")
    public static int[][][] field732 = new int[2][][];

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "[Ljf;")
    public static class229[] field733 = new class229[8];

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field738 = 0;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "[Ltb;")
    public static class222[] field737 = new class222[0];

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Z")
    public static boolean field735 = true;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Ljf;")
    public static class229 field739 = class212.method1457((byte) 125, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Ljf;")
    public static class229 field742 = class212.method1457((byte) 82, ":duelstake:");

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Ldn;")
    public static class231 field730;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "[[[I")
    public static int[][][] field743;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lgn;", line = 17)
    public static final class5 method350(int arg0, int arg1) {
        class5 var2 = (class5) class311.field5229.method643((long) arg1, 1649232044);
        field734++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class211.field3627.method1275(arg1, arg0, -5211);
        class5 var4 = new class5();
        if (var3 != null) {
            var4.method31(-1, new class14(var3));
        }
        class311.field5229.method640(var4, (long) arg1, 24179);
        return var4;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 37)
    public static void method351(int arg0) {
        field739 = null;
        field742 = null;
        field737 = null;
        field743 = (int[][][]) null;
        field730 = null;
        field733 = null;
        field732 = (int[][][]) null;
        if (arg0 != 28527) {
            field730 = (class231) null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIII)V", line = 59)
    public static final void method352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field731++;
        int var8 = 0;
        if (arg0 != -24061) {
            method354(-59, -27, 87);
        }
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg3 - arg6;
        int var12 = arg1 * arg1;
        int var13 = arg3 * arg3;
        int var14 = var11 * var11;
        int var15 = arg1 - arg6;
        int var16 = var15 * var15;
        int var17 = var12 << 1;
        int var18 = var16 << 1;
        int var19 = var13 << 1;
        int var20 = var14 << 1;
        int var21 = arg1 << 1;
        int var22 = var15 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var12 - (var21 - 1) * var19;
        int var25 = var16 - ((var22 - 1) * var20);
        int var26 = var16 << 2;
        int var27 = var14 << 2;
        int var28 = var12 << 2;
        int var29 = (1 - var22) * var14 + var18;
        int var30 = var17 * 3;
        int var31 = var13 << 2;
        int var32 = (var21 - 3) * var19;
        int var33 = var18 * 3;
        int var34 = var28;
        int var35 = var26;
        int var36 = (arg1 - 1) * var31;
        int var37 = (var22 - 3) * var20;
        int var38 = (var15 - 1) * var27;
        if (arg7 >= class56.field991 && arg7 <= class142.field2458) {
            int[] var39 = class173.field3021[arg7];
            int var40 = class129.method909(class149.field2578, 0, arg4 - arg3, class327.field5490);
            int var41 = class129.method909(class149.field2578, arg0 ^ 0xFFFFA203, arg3 + arg4, class327.field5490);
            int var42 = class129.method909(class149.field2578, 0, arg4 - var11, class327.field5490);
            int var43 = class129.method909(class149.field2578, 0, arg4 + var11, class327.field5490);
            class34.method306(var40, var39, (byte) 120, var42, arg2);
            class34.method306(var42, var39, (byte) 115, var43, arg5);
            class34.method306(var43, var39, (byte) 127, var41, arg2);
        }
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var34;
                    var34 += var28;
                    var8++;
                    var23 += var30;
                    var30 += var28;
                }
            }
            if (var24 < 0) {
                var23 += var30;
                var24 += var34;
                var34 += var28;
                var8++;
                var30 += var28;
            }
            boolean var44 = var15 >= var9;
            var9--;
            int var45 = arg7 - var9;
            var24 += -var32;
            var32 -= var31;
            var23 += -var36;
            var36 -= var31;
            int var46 = arg7 + var9;
            if (var44) {
                if (var29 < 0) {
                    while (var29 < 0) {
                        var25 += var35;
                        var29 += var33;
                        var10++;
                        var33 += var26;
                        var35 += var26;
                    }
                }
                if (var25 < 0) {
                    var29 += var33;
                    var25 += var35;
                    var35 += var26;
                    var33 += var26;
                    var10++;
                }
                var25 += -var37;
                var37 -= var27;
                var29 += -var38;
                var38 -= var27;
            }
            if (var46 >= class56.field991 && class142.field2458 >= var45) {
                int var47 = class129.method909(class149.field2578, arg0 ^ 0xFFFFA203, arg4 + var8, class327.field5490);
                int var48 = class129.method909(class149.field2578, arg0 ^ 0xFFFFA203, arg4 - var8, class327.field5490);
                if (var44) {
                    int var49 = class129.method909(class149.field2578, 0, arg4 + var10, class327.field5490);
                    int var50 = class129.method909(class149.field2578, 0, arg4 - var10, class327.field5490);
                    if (var45 >= class56.field991) {
                        int[] var51 = class173.field3021[var45];
                        class34.method306(var48, var51, (byte) 124, var50, arg2);
                        class34.method306(var50, var51, (byte) 116, var49, arg5);
                        class34.method306(var49, var51, (byte) 127, var47, arg2);
                    }
                    if (var46 <= class142.field2458) {
                        int[] var52 = class173.field3021[var46];
                        class34.method306(var48, var52, (byte) 116, var50, arg2);
                        class34.method306(var50, var52, (byte) 121, var49, arg5);
                        class34.method306(var49, var52, (byte) 119, var47, arg2);
                    }
                } else {
                    if (var45 >= class56.field991) {
                        class34.method306(var48, class173.field3021[var45], (byte) 125, var47, arg2);
                    }
                    if (var46 <= class142.field2458) {
                        class34.method306(var48, class173.field3021[var46], (byte) 116, var47, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLek;)Z", line = 299)
    public static final boolean method353(byte arg0, class185 arg1) {
        if (arg0 > -117) {
            method355(false, -113, 102, -113, (class244[]) null, 33, 46, (byte[]) null, (byte) -28, 23, -61);
        }
        field740++;
        return arg1.method1289(class179.field3097, -89);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V", line = 326)
    public static final void method354(int arg0, int arg1, int arg2) {
        field741++;
        class122 var3 = class323.method2175(arg0, arg1, -25873);
        var3.method862(-29044);
        var3.field2144 = arg2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZIII[Lqg;II[BBII)V", line = 338)
    public static final void method355(boolean arg0, int arg1, int arg2, int arg3, class244[] arg4, int arg5, int arg6, byte[] arg7, byte arg8, int arg9, int arg10) {
        if (!arg0) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if (arg10 + var11 > 0 && (arg10 + var11) < 103 && arg1 + var12 > 0 && arg1 + var12 < 103) {
                        arg4[arg3].field4331[arg10 + var11][arg1 + var12] = class305.method2086(arg4[arg3].field4331[arg10 + var11][arg1 + var12], -16777217);
                    }
                }
            }
        }
        field736++;
        if (arg8 != 32) {
            return;
        }
        byte var13;
        if (arg0) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        class14 var14 = new class14(arg7);
        for (int var15 = 0; var15 < var13; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg2 == var15 && arg5 <= var16 && arg5 + 8 > var16 && var17 >= arg9 && var17 < arg9 + 8) {
                        class294.method2039(0, arg6, -105, var14, arg1 + class224.method1546(var17 & 0x7, -3, arg6, var16 & 0x7), arg3, class71.method529((byte) 105, var17 & 0x7, var16 & 0x7, arg6) + arg10, 0, arg0);
                    } else {
                        class294.method2039(0, 0, -105, var14, -1, 0, -1, 0, arg0);
                    }
                }
            }
        }
        boolean var18 = false;
        while (var14.field174.length > var14.field195) {
            int var19 = var14.method93(false);
            if (var19 != 129) {
                var14.field195--;
                break;
            }
            for (int var20 = 0; var20 < 4; var20++) {
                byte var21 = var14.method98(true);
                if (var21 == 0) {
                    if (arg2 >= var20) {
                        int var22 = arg10 + 7;
                        int var23 = arg10;
                        int var24 = arg1;
                        if (var22 < 0) {
                            var22 = 0;
                        } else if (var22 >= 104) {
                            var22 = 104;
                        }
                        if (arg10 < 0) {
                            var23 = 0;
                        } else if (arg10 >= 104) {
                            var23 = 104;
                        }
                        int var25 = arg1 + 7;
                        if (arg1 < 0) {
                            var24 = 0;
                        } else if (arg1 >= 104) {
                            var24 = 104;
                        }
                        if (var25 < 0) {
                            var25 = 0;
                        } else if (var25 >= 104) {
                            var25 = 104;
                        }
                        while (var23 < var22) {
                            while (var25 > var24) {
                                class179.field3110[arg3][var23][var24] = 0;
                                var24++;
                            }
                            var23++;
                        }
                    }
                } else if (var21 == 1) {
                    for (int var26 = 0; var26 < 64; var26 += 4) {
                        for (int var27 = 0; var27 < 64; var27 += 4) {
                            byte var28 = var14.method98(true);
                            if (arg2 >= var20) {
                                int var29 = var26;
                                while (var29 < var26 + 4) {
                                    int var30 = var27;
                                    while (var30 < var27 + 4) {
                                        if (var29 >= arg5 && (arg5 + 8) > var29 && var30 >= arg9 && arg9 < (arg9 + 8)) {
                                            int var31 = arg10 + class71.method529((byte) 106, var30 & 0x7, var29 & 0x7, arg6);
                                            int var32 = class224.method1546(var30 & 0x7, -3, arg6, var29 & 0x7) + arg1;
                                            if (var31 >= 0 && var31 < 104 && var32 >= 0 && var32 < 104) {
                                                class179.field3110[arg3][var31][var32] = var28;
                                            }
                                        }
                                        var27++;
                                    }
                                    var26++;
                                }
                            }
                        }
                    }
                } else if (var21 != 2) {
                }
            }
        }
        if (class108.field1900 && !arg0) {
            class96 var33 = null;
            while (true) {
                while (var14.field174.length > var14.field195) {
                    int var34 = var14.method93(false);
                    if (var34 == 0) {
                        var33 = new class96(var14);
                    } else if (var34 == 1) {
                        int var35 = var14.method93(false);
                        if (var35 > 0) {
                            for (int var36 = 0; var36 < var35; var36++) {
                                class186 var37 = new class186(var14);
                                int var38 = var37.field3253 >> 7;
                                int var39 = var37.field3266 >> 7;
                                if (var37.field3264 == arg2 && arg5 <= var39 && arg5 + 8 > var39 && arg9 <= var38 && (arg9 + 8) > var38) {
                                    int var40 = class76.method549(var37.field3253 & 0x3FF, arg8 ^ 0xFFFFFFDF, var37.field3266 & 0x3FF, arg6) + (arg10 << 7);
                                    int var41 = class26.method236(arg6, var37.field3253 & 0x3FF, 1023, var37.field3266 & 0x3FF) + (arg1 << 7);
                                    var37.field3253 = var41;
                                    int var42 = var37.field3253 >> 7;
                                    var37.field3266 = var40;
                                    int var43 = var37.field3266 >> 7;
                                    if (var43 >= 0 && var42 >= 0 && var43 < 104 && var42 < 104) {
                                        var37.field3254 = class132.field2328[var37.field3264][var43][var42] - var37.field3254;
                                        class216.method1492(var37);
                                    }
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var33 == null) {
                    var33 = new class96();
                }
                class149.field2576[arg10 >> 3][arg1 >> 3] = var33;
                break;
            }
        }
        if (var18) {
            return;
        }
        int var44 = arg10 + 7;
        int var45 = arg1 + 7;
        for (int var46 = arg10; var46 < var44; var46++) {
            for (int var47 = arg1; var47 < var45; var47++) {
                class179.field3110[arg3][var46][var47] = 0;
            }
        }
    }
}
