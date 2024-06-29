import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class138 {

    @OriginalMember(owner = "client!of", name = "d", descriptor = "[I")
    private int[] field2500;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "[B")
    private byte[] field2502;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "[I")
    private int[] field2503;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Ltg;")
    public static class184 field2504 = class135.method812("Mitglieder)2Welt", 3);

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field2501 = -1;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field2505 = 0;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field2510 = 0;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static final void method851(byte arg0) {
        if (arg0 < 80) {
            return;
        }
        field2507++;
        for (int var1 = -1; var1 < class26.field466; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class200.field3880[var1];
            }
            class67 var6 = class57.field1024[var5];
            if (var6 != null && var6.field628 > 0) {
                var6.field628--;
                if (var6.field628 == 0) {
                    var6.field611 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class38.field711; var2++) {
            int var3 = class97.field1782[var2];
            class158 var4 = class52.field948[var3];
            if (var4 != null && var4.field628 > 0) {
                var4.field628--;
                if (var4.field628 == 0) {
                    var4.field611 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIILgf;IIII)V")
    public static final void method852(int arg0, int arg1, int arg2, int arg3, class65 arg4, int arg5, int arg6, int arg7, int arg8) {
        class58 var9 = class14.method88(-118, arg3);
        field2498++;
        int var10;
        int var11;
        if (arg0 == 1 || arg0 == 3) {
            var11 = var9.field1084;
            var10 = var9.field1027;
        } else {
            var10 = var9.field1084;
            var11 = var9.field1027;
        }
        int var12;
        int var13;
        if (arg1 + var11 <= 104) {
            var12 = (var11 >> 1) + arg1;
            var13 = arg1 + (var11 + 1 >> 1);
        } else {
            var13 = arg1 + 1;
            var12 = arg1;
        }
        int var14;
        int var15;
        if (arg8 + var10 <= 104) {
            var14 = (var10 + 1 >> 1) + arg8;
            var15 = (var10 >> 1) + arg8;
        } else {
            var15 = arg8;
            var14 = arg8 + 1;
        }
        int[][] var16 = class179.field3418[arg7];
        int var17 = (arg1 << 7) + (var11 << 6);
        int var18 = var16[var12][var14] + var16[var13][var15] + var16[var13][var14] + var16[var12][var15] >> 2;
        long var19 = (long) (arg0 << 20 | arg8 << 7 | arg1 | arg5 << 14 | 0x40000000);
        if (var9.field1053 == 0) {
            var19 |= Long.MIN_VALUE;
        }
        if (var9.field1046 == 1) {
            var19 |= 0x400000L;
        }
        long var21 = var19 | (long) arg3 << 32;
        int var23 = (arg8 << 7) + (var10 << 6);
        if (arg5 == 22) {
            class52 var24;
            if (var9.field1075 == -1 && var9.field1083 == null) {
                var24 = var9.method322(-128, var18, 22, arg0, var23, var16, var17);
            } else {
                var24 = new class13(arg3, 22, arg0, arg7, arg1, arg8, var9.field1075, true, null);
            }
            class201.method1284(arg2, arg1, arg8, var18, var24, var21);
            if (var9.field1060 == 1) {
                arg4.method371(arg8, 114, arg1);
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class52 var50;
            if (var9.field1075 == -1 && var9.field1083 == null) {
                var50 = var9.method322(-125, var18, 10, arg0, var23, var16, var17);
            } else {
                var50 = new class13(arg3, 10, arg0, arg7, arg1, arg8, var9.field1075, true, null);
            }
            if (var50 != null) {
                class193.method1228(arg2, arg1, arg8, var18, var11, var10, var50, arg5 == 11 ? 256 : 0, var21);
            }
            if (var9.field1060 != 0) {
                arg4.method383(var9.field1047, arg1, arg8, var10, var11, 102);
            }
        } else {
            if (arg6 != -15835) {
                field2501 = 10;
            }
            if (arg5 >= 12) {
                class52 var25;
                if (var9.field1075 == -1 && var9.field1083 == null) {
                    var25 = var9.method322(-124, var18, arg5, arg0, var23, var16, var17);
                } else {
                    var25 = new class13(arg3, arg5, arg0, arg7, arg1, arg8, var9.field1075, true, null);
                }
                class193.method1228(arg2, arg1, arg8, var18, 1, 1, var25, 0, var21);
                if (var9.field1060 != 0) {
                    arg4.method383(var9.field1047, arg1, arg8, var10, var11, 94);
                }
            } else if (arg5 == 0) {
                class52 var26;
                if (var9.field1075 == -1 && var9.field1083 == null) {
                    var26 = var9.method322(arg6 + 15712, var18, 0, arg0, var23, var16, var17);
                } else {
                    var26 = new class13(arg3, 0, arg0, arg7, arg1, arg8, var9.field1075, true, null);
                }
                class100.method621(arg2, arg1, arg8, var18, var26, null, class76.field1399[arg0], 0, var21);
                if (var9.field1060 != 0) {
                    arg4.method373(arg8, arg0, var9.field1047, arg5, arg1, (byte) -105);
                }
            } else if (arg5 == 1) {
                class52 var27;
                if (var9.field1075 == -1 && var9.field1083 == null) {
                    var27 = var9.method322(-121, var18, 1, arg0, var23, var16, var17);
                } else {
                    var27 = new class13(arg3, 1, arg0, arg7, arg1, arg8, var9.field1075, true, null);
                }
                class100.method621(arg2, arg1, arg8, var18, var27, null, class133.field2415[arg0], 0, var21);
                if (var9.field1060 != 0) {
                    arg4.method373(arg8, arg0, var9.field1047, arg5, arg1, (byte) -114);
                }
            } else if (arg5 == 2) {
                int var28 = arg0 + 1 & 0x3;
                class52 var29;
                class52 var30;
                if (var9.field1075 == -1 && var9.field1083 == null) {
                    var29 = var9.method322(-122, var18, 2, arg0 + 4, var23, var16, var17);
                    var30 = var9.method322(-119, var18, 2, var28, var23, var16, var17);
                } else {
                    var29 = new class13(arg3, 2, arg0 + 4, arg7, arg1, arg8, var9.field1075, true, null);
                    var30 = new class13(arg3, 2, var28, arg7, arg1, arg8, var9.field1075, true, null);
                }
                class100.method621(arg2, arg1, arg8, var18, var29, var30, class76.field1399[arg0], class76.field1399[var28], var21);
                if (var9.field1060 != 0) {
                    arg4.method373(arg8, arg0, var9.field1047, arg5, arg1, (byte) -120);
                }
            } else if (arg5 == 3) {
                class52 var31;
                if (var9.field1075 == -1 && var9.field1083 == null) {
                    var31 = var9.method322(-122, var18, 3, arg0, var23, var16, var17);
                } else {
                    var31 = new class13(arg3, 3, arg0, arg7, arg1, arg8, var9.field1075, true, null);
                }
                class100.method621(arg2, arg1, arg8, var18, var31, null, class133.field2415[arg0], 0, var21);
                if (var9.field1060 != 0) {
                    arg4.method373(arg8, arg0, var9.field1047, arg5, arg1, (byte) -116);
                }
            } else if (arg5 == 9) {
                class52 var32;
                if (var9.field1075 == -1 && var9.field1083 == null) {
                    var32 = var9.method322(-125, var18, arg5, arg0, var23, var16, var17);
                } else {
                    var32 = new class13(arg3, arg5, arg0, arg7, arg1, arg8, var9.field1075, true, null);
                }
                class193.method1228(arg2, arg1, arg8, var18, 1, 1, var32, 0, var21);
                if (var9.field1060 != 0) {
                    arg4.method383(var9.field1047, arg1, arg8, var10, var11, 117);
                }
            } else if (arg5 == 4) {
                class52 var33;
                if (var9.field1075 == -1 && var9.field1083 == null) {
                    var33 = var9.method322(-125, var18, 4, arg0, var23, var16, var17);
                } else {
                    var33 = new class13(arg3, 4, arg0, arg7, arg1, arg8, var9.field1075, true, null);
                }
                class188.method1195(arg2, arg1, arg8, var18, var33, null, class76.field1399[arg0], 0, 0, 0, var21);
            } else if (arg5 == 5) {
                int var34 = 16;
                long var35 = class21.method131(arg2, arg1, arg8);
                if (var35 != 0L) {
                    var34 = class14.method88(78, (int) (var35 >>> 32) & Integer.MAX_VALUE).field1050;
                }
                class52 var37;
                if (var9.field1075 == -1 && var9.field1083 == null) {
                    var37 = var9.method322(arg6 ^ 0x3DA6, var18, 4, arg0, var23, var16, var17);
                } else {
                    var37 = new class13(arg3, 4, arg0, arg7, arg1, arg8, var9.field1075, true, null);
                }
                class188.method1195(arg2, arg1, arg8, var18, var37, null, class76.field1399[arg0], 0, class72.field1348[arg0] * var34, class79.field1433[arg0] * var34, var21);
            } else if (arg5 == 6) {
                int var38 = 8;
                long var39 = class21.method131(arg2, arg1, arg8);
                if (var39 != 0L) {
                    var38 = class14.method88(56, (int) (var39 >>> 32) & Integer.MAX_VALUE).field1050 / 2;
                }
                class52 var41;
                if (var9.field1075 == -1 && var9.field1083 == null) {
                    var41 = var9.method322(arg6 + 15714, var18, 4, arg0 + 4, var23, var16, var17);
                } else {
                    var41 = new class13(arg3, 4, arg0 + 4, arg7, arg1, arg8, var9.field1075, true, null);
                }
                class188.method1195(arg2, arg1, arg8, var18, var41, null, 256, arg0, class60.field1130[arg0] * var38, class73.field1369[arg0] * var38, var21);
            } else if (arg5 == 7) {
                int var42 = arg0 + 2 & 0x3;
                class52 var43;
                if (var9.field1075 == -1 && var9.field1083 == null) {
                    var43 = var9.method322(-127, var18, 4, var42 + 4, var23, var16, var17);
                } else {
                    var43 = new class13(arg3, 4, var42 + 4, arg7, arg1, arg8, var9.field1075, true, null);
                }
                class188.method1195(arg2, arg1, arg8, var18, var43, null, 256, var42, 0, 0, var21);
            } else if (arg5 == 8) {
                int var44 = 8;
                long var45 = class21.method131(arg2, arg1, arg8);
                int var47 = arg0 + 2 & 0x3;
                if (var45 != 0L) {
                    var44 = class14.method88(-100, Integer.MAX_VALUE & (int) (var45 >>> 32)).field1050 / 2;
                }
                class52 var48;
                class52 var49;
                if (var9.field1075 == -1 && var9.field1083 == null) {
                    var48 = var9.method322(arg6 ^ 0x3DAC, var18, 4, arg0 + 4, var23, var16, var17);
                    var49 = var9.method322(-126, var18, 4, var47 + 4, var23, var16, var17);
                } else {
                    var48 = new class13(arg3, 4, arg0 + 4, arg7, arg1, arg8, var9.field1075, true, null);
                    var49 = new class13(arg3, 4, var47 + 4, arg7, arg1, arg8, var9.field1075, true, null);
                }
                class188.method1195(arg2, arg1, arg8, var18, var48, var49, 256, arg0, class60.field1130[arg0] * var44, class73.field1369[arg0] * var44, var21);
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
    public static void method853(byte arg0) {
        field2504 = null;
        if (arg0 < 6) {
            field2506 = 111;
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V")
    public static final void method854(byte arg0) {
        field2509++;
        class37.field687++;
        if (arg0 >= 0) {
            method852(-66, -44, -120, 11, null, -51, -100, 61, 72);
        }
        class117.field2122.method106(31, -117);
        for (class7 var1 = (class7) class134.field2436.method57(-19654); var1 != null; var1 = (class7) class134.field2436.method49(1)) {
            if (var1.field130 == 0) {
                class157.method950(true, var1, false);
            }
        }
        if (class50.field925 != null) {
            class57.method305(-122, class50.field925);
            class50.field925 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "([B)V")
    public class138(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = arg0.length;
        this.field2500 = new int[8];
        this.field2502 = arg0;
        int var4 = 0;
        this.field2503 = new int[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field2503[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var2[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var2[var10] = var2[var10 - 1];
                            break;
                        }
                        var2[var10] = class123.method748(var11, var12);
                    }
                } else {
                    var9 = var2[var6 - 1];
                }
                var2[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field2500[var14] == 0) {
                            this.field2500[var14] = var4;
                        }
                        var14 = this.field2500[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field2500.length <= var14) {
                        int[] var18 = new int[this.field2500.length * 2];
                        for (int var19 = 0; var19 < this.field2500.length; var19++) {
                            var18[var19] = this.field2500[var19];
                        }
                        this.field2500 = var18;
                    }
                }
                this.field2500[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([BBII[BI)I")
    public final int method855(byte[] arg0, byte arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field2508++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg2 + arg5;
        if (arg1 < 99) {
            method851((byte) -91);
        }
        int var9 = arg3;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field2500[var7];
            }
            int var11;
            if ((var11 = this.field2500[var7]) < 0) {
                arg4[arg2++] = (byte) ~var11;
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field2500[var7];
            }
            int var12;
            if ((var12 = this.field2500[var7]) < 0) {
                arg4[arg2++] = (byte) ~var12;
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field2500[var7];
            }
            int var13;
            if ((var13 = this.field2500[var7]) < 0) {
                arg4[arg2++] = (byte) ~var13;
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field2500[var7];
            }
            int var14;
            if ((var14 = this.field2500[var7]) < 0) {
                arg4[arg2++] = (byte) ~var14;
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field2500[var7];
            }
            int var15;
            if ((var15 = this.field2500[var7]) < 0) {
                arg4[arg2++] = (byte) ~var15;
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field2500[var7];
            }
            int var16;
            if ((var16 = this.field2500[var7]) < 0) {
                arg4[arg2++] = (byte) ~var16;
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field2500[var7];
            }
            int var17;
            if ((var17 = this.field2500[var7]) < 0) {
                arg4[arg2++] = (byte) ~var17;
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field2500[var7];
            }
            int var18;
            if ((var18 = this.field2500[var7]) < 0) {
                arg4[arg2++] = (byte) ~var18;
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIIIILfb;IZJ)Z")
    public static final boolean method856(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class52 arg8, int arg9, boolean arg10, long arg11) {
        for (int var13 = arg1; var13 < arg1 + arg3; var13++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                if (var13 < 0 || var20 < 0 || var13 >= class8.field145 || var20 >= class159.field2853) {
                    return false;
                }
                class90 var21 = class190.field3704[arg0][var13][var20];
                if (var21 != null && var21.field1680 >= 5) {
                    return false;
                }
            }
        }
        class164 var14 = new class164();
        var14.field2934 = arg11;
        var14.field2941 = arg0;
        var14.field2935 = arg5;
        var14.field2946 = arg6;
        var14.field2942 = arg7;
        var14.field2951 = arg8;
        var14.field2959 = arg9;
        var14.field2954 = arg1;
        var14.field2945 = arg2;
        var14.field2949 = arg1 + arg3 - 1;
        var14.field2957 = arg2 + arg4 - 1;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                int var17 = 0;
                if (var15 > arg1) {
                    var17++;
                }
                if (var15 < arg1 + arg3 - 1) {
                    var17 += 4;
                }
                if (var16 > arg2) {
                    var17 += 8;
                }
                if (var16 < arg2 + arg4 - 1) {
                    var17 += 2;
                }
                for (int var18 = arg0; var18 >= 0; var18--) {
                    if (class190.field3704[var18][var15][var16] == null) {
                        class190.field3704[var18][var15][var16] = new class90(var18, var15, var16);
                    }
                }
                class90 var19 = class190.field3704[arg0][var15][var16];
                var19.field1686[var19.field1680] = var14;
                var19.field1692[var19.field1680] = var17;
                var19.field1682 |= var17;
                var19.field1680++;
            }
        }
        if (arg10) {
            class205.field3945[class10.field187++] = var14;
        }
        return true;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([BI[BIBI)I")
    public final int method857(byte[] arg0, int arg1, byte[] arg2, int arg3, byte arg4, int arg5) {
        int var7 = arg1 + arg3;
        int var8 = 0;
        int var9 = arg5 << 3;
        field2497++;
        if (arg4 != -92) {
            method852(7, -86, 38, 58, null, -44, 68, -11, -69);
        }
        while (var7 > arg3) {
            int var10 = arg2[arg3] & 0xFF;
            int var11 = this.field2503[var10];
            byte var12 = this.field2502[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = var13 + (var12 + var14 - 1 >> 3);
            int var16 = var8 & -var14 >> 31;
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var8 = class123.method748(var16, var11 >>> var17));
            if (var13 < var15) {
                var14 = var17 - 8;
                var13++;
                arg0[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var15) {
                    var14 -= 8;
                    var13++;
                    arg0[var13] = (byte) (var8 = var11 >>> var14);
                    if (var13 < var15) {
                        var13++;
                        var14 -= 8;
                        arg0[var13] = (byte) (var8 = var11 >>> var14);
                        if (var13 < var15) {
                            var13++;
                            var14 -= 8;
                            arg0[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var9 + 7 >> 3) - arg5;
    }
}
