import java.util.Calendar;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class7 {

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "Z")
    public boolean field80 = false;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field72 = 0;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public static int field81 = 0;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "Ljava/util/Calendar;")
    public static Calendar field73 = Calendar.getInstance();

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public static int field83 = 0;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public int field70;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public int field75;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BLjava/util/Random;I)I", line = 4)
    public static final int method39(byte arg0, Random arg1, int arg2) {
        field74++;
        if (arg0 != 57) {
            field81 = -119;
        }
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class122.method833(77, arg2)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg2);
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            return class58.method400(arg2, var4, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIIIILg;Lgh;IIIZ)Lg;", line = 35)
    public static final class295 method40(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class295 arg8, class222 arg9, int arg10, int arg11, int arg12, boolean arg13) {
        field78++;
        long var14 = ((long) arg3 << 48) + ((long) arg7 << 32) + (long) ((arg1 << 16) + (arg2 << 24) + arg5);
        class295 var16 = (class295) class299.field4634.method1294(var14, 123);
        if (var16 == null) {
            byte var17 = 3;
            byte var18;
            if (arg5 == 1) {
                var18 = 9;
            } else if (arg5 == 2) {
                var18 = 12;
            } else if (arg5 == 3) {
                var18 = 15;
            } else if (arg5 == 4) {
                var18 = 18;
            } else {
                var18 = 21;
            }
            class114 var19 = new class114(var17 * var18 + 1, var17 * var18 * 2 + -var18, 0);
            int var20 = var19.method790(0, 0, 0);
            int[] var21 = new int[] { 64, 96, 128 };
            int[][] var22 = new int[var17][var18];
            for (int var23 = 0; var23 < var17; var23++) {
                int var24 = var21[var23];
                int var25 = var21[var23];
                for (int var26 = 0; var26 < var18; var26++) {
                    int var27 = (var26 << 11) / var18;
                    int var28 = arg0 + (class12.field127[var27] * var25) >> 16;
                    int var29 = class12.field121[var27] * var24 + arg4 >> 16;
                    var22[var23][var26] = var19.method790(var29, 0, var28);
                }
            }
            for (int var30 = 0; var30 < var17; var30++) {
                int var31 = (var30 * 256 + 128) / var17;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg1 * var32 + arg2 * var31 >> 8);
                short var34 = (short) (((arg3 & 0x380) * var31 + (arg7 & 0x380) * var32 & 0x38000) + ((arg3 & 0xFC00) * var31 + (arg7 & 0xFC00) * var32 & 0xFC0000) + ((arg3 & 0x7F) * var31 + (arg7 & 0x7F) * var32 & 0x7F00) >> 8);
                for (int var35 = 0; var35 < var18; var35++) {
                    if (var30 == 0) {
                        var19.method786(var20, var22[0][(var35 + 1) % var18], var22[0][var35], (byte) 1, var34, var33);
                    } else {
                        var19.method786(var22[var30 - 1][var35], var22[var30 - 1][(var35 + 1) % var18], var22[var30][(var35 + 1) % var18], (byte) 1, var34, var33);
                        var19.method786(var22[var30 - 1][var35], var22[var30][(var35 + 1) % var18], var22[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var19.method769(64, 768, -50, -10, -50);
            class299.field4634.method1292(var14, -86, var16);
        }
        int var36 = arg5 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        if (arg6 != 21881) {
            return (class295) null;
        }
        int var39 = var36;
        int var40 = arg8.method957();
        int var41 = var36;
        int var42 = arg8.method980();
        int var43 = arg8.method966();
        if (arg13) {
            if (arg12 > 640 && arg12 < 1408) {
                var41 = var36 + 128;
            }
            if (arg12 > 1152 && arg12 < 1920) {
                var39 = var36 + 128;
            }
            if (arg12 > 1664 || arg12 < 384) {
                var38 -= 128;
            }
            if (arg12 > 128 && arg12 < 896) {
                var37 -= 128;
            }
        }
        if (var39 < var42) {
            var42 = var39;
        }
        if (var43 < var38) {
            var43 = var38;
        }
        if (var40 < var37) {
            var40 = var37;
        }
        int var44 = arg8.method967();
        if (var44 > var41) {
            var44 = var41;
        }
        class89 var45 = null;
        if (arg9 != null) {
            int var46 = arg9.field3529[arg11];
            var45 = class96.method658(var46 >> 16, (byte) 119);
            arg11 = var46 & 0xFFFF;
        }
        class295 var47;
        if (var45 == null) {
            var47 = var16.method981(true, true, true);
            var47.method964((var42 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method983((var40 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method981(!var45.method613((byte) -123, arg11), !var45.method614((byte) 37, arg11), true);
            var47.method964((var42 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method983((var40 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method1936(var45, arg11);
        }
        if (arg12 != 0) {
            var47.method960(arg12);
        }
        if (class333.field5166) {
            class340 var48 = (class340) var47;
            if (class39.method286(class77.field1154, (byte) 82, arg4 + var40, arg0 - -var43) != arg10 || arg10 != class39.method286(class77.field1154, (byte) 82, arg4 + var42, arg0 + var44)) {
                for (int var49 = 0; var49 < var48.field5279; var49++) {
                    var48.field5293[var49] += class39.method286(class77.field1154, (byte) 82, var48.field5298[var49] + arg4, var48.field5283[var49] + arg0) - arg10;
                }
                var48.field5270.field773 = false;
                var48.field5265.field4984 = false;
            }
        } else {
            class141 var50 = (class141) var47;
            if (arg10 != class39.method286(class77.field1154, (byte) 82, arg4 + var40, arg0 + var43) || arg10 != class39.method286(class77.field1154, (byte) 82, arg4 + var42, arg0 + var44)) {
                for (int var51 = 0; var51 < var50.field2185; var51++) {
                    var50.field2179[var51] += class39.method286(class77.field1154, (byte) 82, var50.field2196[var51] + arg4, var50.field2187[var51] + arg0) - arg10;
                }
                var50.field2198 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILgn;IB)V", line = 264)
    private final void method41(int arg0, class303 arg1, int arg2, byte arg3) {
        if (arg3 >= -59) {
            method42(-20, 103, 77, (byte) 35, 118, 8, -72, -88, 108, -57, 83);
        }
        field71++;
        if (arg2 == 1) {
            this.field75 = arg1.method1994(false);
        } else if (arg2 == 2) {
            this.field70 = arg1.method2059(255);
        } else if (arg2 == 3) {
            this.field80 = true;
        } else if (arg2 == 4) {
            this.field75 = -1;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIBIIIIIII)V", line = 294)
    public static final void method42(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg8 - arg6;
        field76++;
        if (arg8 < class204.field3088) {
            var11++;
        }
        int var12 = arg4 - arg7;
        if (class129.field2021 > arg4) {
            var12++;
        }
        if (arg3 != -66) {
            method40(-30, -83, -93, -56, 105, -48, 111, -74, (class295) null, (class222) null, 0, 23, -100, true);
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = arg5 + (arg2 * var13) >> 16;
            int var15 = (var13 + 1) * arg2 + arg5 >> 16;
            int var16 = var15 - var14;
            if (var16 > 0) {
                int var17 = arg6 + var13 >> 6;
                if (var17 >= 0 && (class165.field2548.length - 1) >= var17) {
                    int var18 = arg10 + var14;
                    int var19 = arg10 + var15;
                    byte[][] var20 = class338.field5234[var17];
                    byte[][] var21 = class94.field1445[var17];
                    int[][] var22 = class165.field2548[var17];
                    byte[][] var23 = class164.field2525[var17];
                    byte[][] var24 = class34.field435[var17];
                    byte[][] var25 = class76.field1145[var17];
                    for (int var26 = 0; var26 < var12; var26++) {
                        int var27 = arg9 + (arg1 * var26) >> 16;
                        int var28 = (var26 + 1) * arg1 + arg9 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg0 + var28;
                            int var31 = arg0 + var27;
                            int var32 = arg7 + var26 >> 6;
                            int var33 = arg7 + var26 & 0x3F;
                            int var34 = arg6 + var13 & 0x3F;
                            int var35 = (var33 << 6) + var34;
                            int var36;
                            if (var32 < 0 || var32 > var22.length - 1 || var22[var32] == null) {
                                if (class205.field3110.field3000 != -1) {
                                    var36 = class205.field3110.field3000;
                                } else if ((var13 + arg6 & 0x4) == (var26 + arg7 & 0x4)) {
                                    var36 = class157.field2461[class345.field5351 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var32 < 0 || var32 > (var22.length - 1)) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class57.method375(var18, var31, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var22[var32][var35];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var20[var32] == null ? 0 : class157.field2461[var20[var32][var35] & 0xFF];
                            int var38 = var23[var32] == null ? 0 : class157.field2461[var23[var32][var35] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class57.method375(var18, var31, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    byte var39 = var21[var32] == null ? 0 : var21[var32][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class57.method375(var18, var31, var16, var29, var37);
                                    } else {
                                        class242.method1648(true, var18, var31, var39 & 0x3, var36, -25383, var40 >> 2, var29, class57.field797, var37, var16);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var25[var32][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class57.method375(var18, var31, var16, var29, var38);
                                    }
                                    class242.method1648(var37 == 0, var18, var31, var41 & 0x3, 0, -25383, var42 >> 2, var29, class57.field797, var38, var16);
                                }
                            }
                            if (var24[var32] != null) {
                                int var43 = var24[var32][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var18;
                                    } else {
                                        var44 = var19 - 1;
                                    }
                                    int var45;
                                    if (var29 == 1) {
                                        var45 = var31;
                                    } else {
                                        var45 = var30 - 1;
                                    }
                                    int var46 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var46 = 13369344;
                                        var43 -= 4;
                                    }
                                    if (var43 == 1) {
                                        class57.method389(var18, var31, var29, var46);
                                    } else if (var43 == 2) {
                                        class57.method385(var18, var31, var16, var46);
                                    } else if (var43 == 3) {
                                        class57.method389(var44, var31, var29, var46);
                                    } else if (var43 == 4) {
                                        class57.method385(var18, var45, var16, var46);
                                    } else if (var43 == 9) {
                                        class57.method389(var18, var31, var29, 16777215);
                                        class57.method385(var18, var31, var16, var46);
                                    } else if (var43 == 10) {
                                        class57.method389(var44, var31, var29, 16777215);
                                        class57.method385(var18, var31, var16, var46);
                                    } else if (var43 == 11) {
                                        class57.method389(var44, var31, var29, 16777215);
                                        class57.method385(var18, var45, var16, var46);
                                    } else if (var43 == 12) {
                                        class57.method389(var18, var31, var29, 16777215);
                                        class57.method385(var18, var45, var16, var46);
                                    } else if (var43 == 17) {
                                        class57.method385(var18, var31, 1, var46);
                                    } else if (var43 == 18) {
                                        class57.method385(var44, var31, 1, var46);
                                    } else if (var43 == 19) {
                                        class57.method385(var44, var45, 1, var46);
                                    } else if (var43 == 20) {
                                        class57.method385(var18, var45, 1, var46);
                                    } else if (var43 == 25) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class57.method385(var18 + var48, -var48 + var45, 1, var46);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class57.method385(var18 + var47, var31 + var47, 1, var46);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg10 + var15;
                    int var50 = arg10 + var14;
                    for (int var51 = 0; var51 < var12; var51++) {
                        int var52;
                        if (class205.field3110.field3000 != -1) {
                            var52 = class205.field3110.field3000;
                        } else if ((arg6 + var13 & 0x4) == (arg7 + var51 & 0x4)) {
                            var52 = class157.field2461[class345.field5351 + 1];
                        } else {
                            var52 = 4936552;
                        }
                        if (var52 == 0) {
                            var52 = 1;
                        }
                        int var53 = (arg1 * var51 + arg9 >> 16) + arg0;
                        int var54 = (arg9 + ((var51 + 1) * arg1) >> 16) + arg0;
                        int var55 = var54 - var53;
                        class57.method375(var50, var53, var16, var55, var52);
                    }
                }
            }
        }
        for (int var56 = -2; var56 < var11 + 2; var56++) {
            int var57 = arg2 * var56 + arg5 >> 16;
            int var58 = (var56 + 1) * arg2 + arg5 >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                var10000 = arg10 + var58;
                int var61 = arg10 + var57;
                int var62 = arg6 + var56 >> 6;
                if (var62 >= 0 && class128.field1993.length - 1 >= var62) {
                    int[][] var63 = class128.field1993[var62];
                    for (int var64 = -2; var64 < (var12 + 2); var64++) {
                        int var65 = arg9 + (arg1 * var64) >> 16;
                        int var66 = (var64 + 1) * arg1 + arg9 >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            var10000 = arg0 + var66;
                            int var69 = arg0 + var65;
                            int var70 = arg7 + var64 >> 6;
                            if (var70 >= 0 && (var63.length - 1) >= var70) {
                                int var71 = (arg7 + var64 & 0x3F << 6) + (var56 + arg6 & 0x3F);
                                if (var63[var70] != null) {
                                    int var72 = var63[var70][var71];
                                    int var73 = var72 & 0x1FFF;
                                    if (var73 != 0) {
                                        int var74 = (var72 & 0x7DD4) >> 13;
                                        class7 var75 = class23.method172(98, var73 - 1);
                                        boolean var76 = ((var72 & 0x833B) >> 15) == 1;
                                        class20 var77 = var75.method44((byte) 102, var76, var74);
                                        if (var77 != null) {
                                            int var78 = var77.field1170 * var67 / 4;
                                            int var79 = var77.field1166 * var59 / 4;
                                            if (var75.field80) {
                                                int var80 = var72 >> 16 & 0xF;
                                                int var81 = var72 >> 20 & 0xF;
                                                if ((var74 & 0x1) == 1) {
                                                    int var82 = var80;
                                                    var80 = var81;
                                                    var81 = var82;
                                                }
                                                var79 = var59 * var80;
                                                var78 = var67 * var81;
                                            }
                                            if (var79 != 0 && var78 != 0) {
                                                if (var75.field70 == 0) {
                                                    var77.method153(var61, var69 + var67 - var78, var79, var78);
                                                } else {
                                                    var77.method152(var61, var67 + var69 - var78, var79, var78, var75.field70);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V", line = 722)
    public static void method43(byte arg0) {
        if (arg0 == 11) {
            field73 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BZI)Lbd;", line = 745)
    public final class20 method44(byte arg0, boolean arg1, int arg2) {
        class20 var4 = (class20) class47.field662.method1294((long) (this.field75 | arg2 << 16 | (arg1 ? 262144 : 0)), 115);
        field77++;
        if (var4 != null) {
            return var4;
        }
        if (arg0 <= 73) {
            this.field70 = -61;
        }
        class174.field2664.method2093(-72, this.field75);
        class20 var5 = class155.method1078(class174.field2664, 0, 0, this.field75);
        if (var5 != null) {
            var5.method160(class78.field1159, class197.field2961, class22.field282);
            var5.field1171 = var5.field1166;
            var5.field1175 = var5.field1170;
            if (arg1) {
                var5.method162();
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                var5.method156();
            }
            class47.field662.method1292((long) (arg2 << 16 | this.field75 | (arg1 ? 262144 : 0)), -115, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lgn;ZI)V", line = 786)
    public final void method45(class303 arg0, boolean arg1, int arg2) {
        while (true) {
            int var4 = arg0.method2043((byte) -126);
            if (var4 == 0) {
                if (arg1) {
                    method40(63, -65, 45, -86, 75, 60, 114, -61, (class295) null, (class222) null, 125, 84, -94, true);
                }
                field79++;
                return;
            }
            this.method41(arg2, arg0, var4, (byte) -115);
        }
    }
}
