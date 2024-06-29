import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class84 extends class630 {

    @OriginalMember(owner = "client!fca", name = "L", descriptor = "I")
    public int field875 = 99;

    @OriginalMember(owner = "client!fca", name = "J", descriptor = "Ldh;")
    public static class320 field874 = new class320(105, 6);

    @OriginalMember(owner = "client!fca", name = "S", descriptor = "Ljt;")
    public static class104 field882 = new class104("", 18);

    @OriginalMember(owner = "client!fca", name = "W", descriptor = "[I")
    public static int[] field886 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!fca", name = "V", descriptor = "[[I")
    public static int[][] field885 = new int[6][];

    @OriginalMember(owner = "client!fca", name = "G", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!fca", name = "H", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!fca", name = "I", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!fca", name = "M", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!fca", name = "N", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!fca", name = "O", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!fca", name = "P", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!fca", name = "Q", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!fca", name = "R", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!fca", name = "T", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!fca", name = "U", descriptor = "Lqia;")
    public static class21 field884;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fca", name = "X", descriptor = "Ljava/lang/Class;")
    public static Class field887;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(ILwp;)I")
    public static final int method584(int arg0, class179 arg1) {
        ++field881;
        int var2 = arg1.method1102(arg0 + 253, arg0);
        int var3;
        if (var2 != 0) {
            if (var2 != 1) {
                if (var2 != 2) {
                    var3 = arg1.method1102(arg0 + 253, 11);
                } else {
                    var3 = arg1.method1102(arg0 + 253, 8);
                }
            } else {
                var3 = arg1.method1102(255, 5);
            }
        } else {
            var3 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(ILha;I[Lcaa;[BI)V")
    public final void method585(int arg0, class58 arg1, int arg2, class302[] arg3, byte[] arg4, int arg5) {
        ++field879;
        class244 var7 = new class244(arg4);
        if (arg2 <= -9) {
            int var8 = -1;
            while (true) {
                int var9 = var7.method1435(true);
                if (var9 == 0) {
                    return;
                }
                var8 += var9;
                int var10 = 0;
                while (true) {
                    int var11 = var7.method1463(3010);
                    if (var11 == 0) {
                        break;
                    }
                    var10 += var11 - 1;
                    int var12 = var10 & 63;
                    int var13 = 63 & var10 >> 6;
                    int var14 = var10 >> 12;
                    int var15 = var7.method1423(-41);
                    int var16 = var15 >> 2;
                    int var17 = var15 & 3;
                    int var18 = var13 - -arg0;
                    int var19 = arg5 + var12;
                    if (~var18 < -1 && var19 > 0 && var18 < super.field9048 + -1 && super.field9060 + -1 > var19) {
                        class302 var20 = null;
                        if (!super.field9052) {
                            int var21 = var14;
                            if (~(class100.field1043[1][var18][var19] & 2) == -3) {
                                var21 = var14 - 1;
                            }
                            if (var21 >= 0) {
                                var20 = arg3[var21];
                            }
                        }
                        this.method589(var14, 58, var20, var16, var17, var8, -1, var19, arg1, var18, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IILha;IIILig;[IIBI)V")
    public final void method586(int arg0, int arg1, class58 arg2, int arg3, int arg4, int arg5, class244 arg6, int[] arg7, int arg8, byte arg9, int arg10) {
        ++field877;
        if (!super.field9052) {
            boolean var12 = false;
            if (arg9 != -126) {
                this.method586(116, 94, (class58) null, -111, -64, -58, (class244) null, (int[]) null, 19, (byte) -19, -97);
            }
            if (arg7 != null) {
                arg7[0] = -1;
            }
            class71 var13 = null;
            int var14 = (7 & arg3) * 8;
            int var15 = (7 & arg0) * 8;
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (arg6.field2903 < arg6.field2912.length) {
                                int var20 = arg6.method1423(-42);
                                if (var20 != 0) {
                                    if (~var20 != -2) {
                                        if (~var20 != -3) {
                                            if (var20 != 128) {
                                                if (~var20 != -130) {
                                                    throw new IllegalStateException("");
                                                }
                                                if (super.field9034 == null) {
                                                    super.field9034 = new byte[4][][];
                                                }
                                                for (int var21 = 0; ~var21 > -5; ++var21) {
                                                    byte var22 = arg6.method1448((byte) -86);
                                                    if (~var22 == -1 && super.field9034[arg4] != null) {
                                                        if (arg10 >= var21) {
                                                            int var23 = arg5;
                                                            int var24 = arg5 + 7;
                                                            int var25 = arg1;
                                                            if (~var24 <= -1) {
                                                                if (~var24 <= ~super.field9048) {
                                                                    var24 = super.field9048;
                                                                }
                                                            } else {
                                                                var24 = 0;
                                                            }
                                                            if (~arg5 > -1) {
                                                                var23 = 0;
                                                            } else if (arg5 >= super.field9048) {
                                                                var23 = super.field9048;
                                                            }
                                                            int var26 = arg1 + 7;
                                                            if (~arg1 <= -1) {
                                                                if (super.field9060 <= arg1) {
                                                                    var25 = super.field9060;
                                                                }
                                                            } else {
                                                                var25 = 0;
                                                            }
                                                            if (var26 >= 0) {
                                                                if (~super.field9060 >= ~var26) {
                                                                    var26 = super.field9060;
                                                                }
                                                            } else {
                                                                var26 = 0;
                                                            }
                                                            while (var23 < var24) {
                                                                while (~var26 < ~var25) {
                                                                    super.field9034[arg4][var23][var25] = 0;
                                                                    ++var25;
                                                                }
                                                                ++var23;
                                                            }
                                                        }
                                                    } else if (var22 == 1) {
                                                        if (super.field9034[arg4] == null) {
                                                            super.field9034[arg4] = new byte[super.field9048 - -1][super.field9060 - -1];
                                                        }
                                                        for (int var27 = 0; var27 < 64; var27 += 4) {
                                                            for (int var28 = 0; var28 < 64; var28 += 4) {
                                                                byte var29 = arg6.method1448((byte) -92);
                                                                if (arg10 >= var21) {
                                                                    for (int var30 = var27; var30 < var27 + 4; ++var30) {
                                                                        for (int var31 = var28; var28 + 4 > var31; ++var31) {
                                                                            if (var14 <= var30 && ~var30 > ~(var14 - -8) && ~var31 <= ~var15 && var15 - -8 > var15) {
                                                                                int var32 = class325.method1936(var31 & 7, var30 & 7, -120, arg8) + arg5;
                                                                                int var33 = arg1 - -class9.method36(var30 & 7, arg8, 7 & var31, -59);
                                                                                if (var32 >= 0 && ~super.field9048 < ~var32 && ~var33 <= -1 && var33 < super.field9060) {
                                                                                    super.field9034[arg4][var32][var33] = var29;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (arg7 == null) {
                                                arg6.field2903 += 10;
                                            } else {
                                                arg7[0] = arg6.method1476(-86);
                                                arg7[1] = arg6.method1466((byte) 31);
                                                arg7[2] = arg6.method1466((byte) 31);
                                                arg7[3] = arg6.method1466((byte) 31);
                                                arg7[4] = arg6.method1476(-84);
                                            }
                                        } else {
                                            if (var13 == null) {
                                                var13 = new class71();
                                            }
                                            var13.method523((byte) 85, arg6);
                                        }
                                    } else {
                                        int var34 = arg6.method1423(-75);
                                        if (var34 > 0) {
                                            for (int var35 = 0; var35 < var34; ++var35) {
                                                class614 var36 = new class614(arg2, arg6, 2);
                                                if (var36.field8792 == 31) {
                                                    class742 var37 = class56.field565.method1968(arg6.method1476(108), (byte) -99);
                                                    var36.method3471(var37.field10371, var37.field10373, var37.field10366, var37.field10369, -74);
                                                }
                                                if (arg2.method350() > 0) {
                                                    class163 var38 = var36.field8785;
                                                    int var39 = var38.method1012((byte) 127) >> 9;
                                                    int var40 = var38.method1013(arg9 + 9179535) >> 9;
                                                    if (var36.field8793 == arg10 && var39 >= var14 && var39 < var14 + 8 && var15 <= var40 && var40 < var15 + 8) {
                                                        int var41 = (arg5 << 9) + class659.method3752((byte) -86, var38.method1013(9179409) & 4095, arg8, var38.method1012((byte) 127) & 4095);
                                                        int var42 = (arg1 << 9) - -class726.method4036(var38.method1012((byte) 127) & 4095, arg8, var38.method1013(9179409) & 4095, arg9 ^ -3971);
                                                        int var43 = var41 >> 9;
                                                        int var44 = var42 >> 9;
                                                        if (var43 >= 0 && ~var44 <= -1 && ~super.field9048 < ~var43 && super.field9060 > var44) {
                                                            var38.method801((byte) 118, var42, super.field9038[arg10][var43][var44] + -var38.method1006(31079), var41);
                                                            class646.method3676(var36);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var13 = new class71(arg6);
                                }
                            }
                            if (var13 != null) {
                                class468.method2834(arg1 >> 3, var13, 0, arg5 >> 3);
                            }
                            if (!var12 && super.field9034 != null && super.field9034[arg4] != null) {
                                int var16 = arg5 + 7;
                                int var17 = arg1 + 7;
                                for (int var18 = arg5; var16 > var18; ++var18) {
                                    for (int var19 = arg1; var17 > var19; ++var19) {
                                        super.field9034[arg4][var18][var19] = 0;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIB[BIIILha;I[Lcaa;I)V")
    public final void method587(int arg0, int arg1, byte arg2, byte[] arg3, int arg4, int arg5, int arg6, class58 arg7, int arg8, class302[] arg9, int arg10) {
        ++field873;
        class244 var12 = new class244(arg3);
        int var13 = -1;
        while (true) {
            int var14 = var12.method1435(true);
            if (~var14 == -1) {
                if (arg2 > -107) {
                    field882 = null;
                    return;
                }
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1463(3010);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = 63 & var15 >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method1423(-16);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (~arg0 == ~var19 && arg4 <= var18 && var18 < arg4 - -8 && ~var17 <= ~arg1 && arg1 + 8 > var17) {
                    class316 var23 = class445.field6442.method3972((byte) 104, var13);
                    int var24 = class683.method3868((byte) -36, var22, var23.field4020, var17 & 7, var18 & 7, arg8, var23.field4050) + arg6;
                    int var25 = arg5 - -class107.method741(var18 & 7, arg8, var23.field4020, 7, var23.field4050, var22, 7 & var17);
                    if (~var24 < -1 && ~var25 < -1 && ~(super.field9048 - 1) < ~var24 && ~var25 > ~(super.field9060 - 1)) {
                        class302 var26 = null;
                        if (!super.field9052) {
                            int var27 = arg10;
                            if ((class100.field1043[1][var24][var25] & 2) == 2) {
                                var27 = arg10 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg9[var27];
                            }
                        }
                        this.method589(arg10, 97, var26, var21, arg8 + var22 & 3, var13, -1, var25, arg7, var24, arg10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lig;[IIIBLha;)V")
    public final void method588(class244 arg0, int[] arg1, int arg2, int arg3, byte arg4, class58 arg5) {
        ++field876;
        if (!super.field9052) {
            boolean var7 = false;
            class71 var8 = null;
            if (arg1 != null) {
                arg1[0] = -1;
            }
            if (arg4 <= 72) {
                this.method594((class58) null, 110, -77, (class302) null, 90, -62, 118);
            }
            while (true) {
                while (true) {
                    while (true) {
                        while (~arg0.field2903 > ~arg0.field2912.length) {
                            int var18 = arg0.method1423(-119);
                            if (var18 != 0) {
                                if (~var18 != -2) {
                                    if (var18 == 2) {
                                        if (var8 == null) {
                                            var8 = new class71();
                                        }
                                        var8.method523((byte) 85, arg0);
                                    } else if (~var18 == -129) {
                                        if (arg1 != null) {
                                            arg1[0] = arg0.method1476(29);
                                            arg1[1] = arg0.method1466((byte) 31);
                                            arg1[2] = arg0.method1466((byte) 31);
                                            arg1[3] = arg0.method1466((byte) 31);
                                            arg1[4] = arg0.method1476(7);
                                        } else {
                                            arg0.field2903 += 10;
                                        }
                                    } else {
                                        if (var18 != 129) {
                                            throw new IllegalStateException("");
                                        }
                                        if (super.field9034 == null) {
                                            super.field9034 = new byte[4][][];
                                        }
                                        var7 = true;
                                        for (int var19 = 0; ~var19 > -5; ++var19) {
                                            byte var20 = arg0.method1448((byte) -83);
                                            if (var20 == 0 && super.field9034[var19] != null) {
                                                int var21 = arg2;
                                                int var22 = arg2 - -64;
                                                int var23 = arg3;
                                                if (arg2 < 0) {
                                                    var21 = 0;
                                                } else if (~super.field9048 >= ~arg2) {
                                                    var21 = super.field9048;
                                                }
                                                int var24 = arg3 + 64;
                                                if (~var22 > -1) {
                                                    var22 = 0;
                                                } else if (super.field9048 <= var22) {
                                                    var22 = super.field9048;
                                                }
                                                if (arg3 < 0) {
                                                    var23 = 0;
                                                } else if (~arg3 <= ~super.field9060) {
                                                    var23 = super.field9060;
                                                }
                                                if (var24 < 0) {
                                                    var24 = 0;
                                                } else if (~var24 <= ~super.field9060) {
                                                    var24 = super.field9060;
                                                }
                                                while (var21 < var22) {
                                                    while (~var24 < ~var23) {
                                                        super.field9034[var19][var21][var23] = 0;
                                                        ++var23;
                                                    }
                                                    ++var21;
                                                }
                                            } else if (var20 != 1) {
                                                if (~var20 == -3) {
                                                    if (super.field9034[var19] == null) {
                                                        super.field9034[var19] = new byte[super.field9048 + 1][super.field9060 + 1];
                                                    }
                                                    if (var19 > 0) {
                                                        int var25 = arg2;
                                                        int var26 = arg2 + 64;
                                                        int var27 = arg3;
                                                        if (~arg3 <= -1) {
                                                            if (arg3 >= super.field9060) {
                                                                var27 = super.field9060;
                                                            }
                                                        } else {
                                                            var27 = 0;
                                                        }
                                                        if (arg2 < 0) {
                                                            var25 = 0;
                                                        } else if (super.field9048 <= arg2) {
                                                            var25 = super.field9048;
                                                        }
                                                        if (~var26 > -1) {
                                                            var26 = 0;
                                                        } else if (~var26 <= ~super.field9048) {
                                                            var26 = super.field9048;
                                                        }
                                                        int var28 = arg3 + 64;
                                                        if (var28 < 0) {
                                                            var28 = 0;
                                                        } else if (~var28 <= ~super.field9060) {
                                                            var28 = super.field9060;
                                                        }
                                                        while (~var25 > ~var26) {
                                                            while (~var27 > ~var28) {
                                                                super.field9034[var19][var25][var27] = super.field9034[var19 + -1][var25][var27];
                                                                ++var27;
                                                            }
                                                            ++var25;
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (super.field9034[var19] == null) {
                                                    super.field9034[var19] = new byte[super.field9048 + 1][super.field9060 + 1];
                                                }
                                                for (int var29 = 0; ~var29 > -65; var29 += 4) {
                                                    for (int var30 = 0; var30 < 64; var30 += 4) {
                                                        byte var31 = arg0.method1448((byte) -84);
                                                        for (int var32 = var29 - -arg2; var32 < var29 + 4 + arg2; ++var32) {
                                                            for (int var33 = arg3 + var30; ~(var30 + 4 + arg3) < ~var33; ++var33) {
                                                                if (~var32 <= -1 && ~var32 > ~super.field9048 && ~var33 <= -1 && super.field9060 > var33) {
                                                                    super.field9034[var19][var32][var33] = var31;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    int var34 = arg0.method1423(-51);
                                    if (~var34 < -1) {
                                        for (int var35 = 0; var35 < var34; ++var35) {
                                            class614 var36 = new class614(arg5, arg0, 2);
                                            if (var36.field8792 == 31) {
                                                class742 var37 = class56.field565.method1968(arg0.method1476(-113), (byte) 87);
                                                var36.method3471(var37.field10371, var37.field10373, var37.field10366, var37.field10369, 95);
                                            }
                                            if (arg5.method350() > 0) {
                                                class163 var38 = var36.field8785;
                                                int var39 = var38.method1012((byte) 127) + (arg2 << 9);
                                                int var40 = var38.method1013(9179409) - -(arg3 << 9);
                                                int var41 = var39 >> 9;
                                                int var42 = var40 >> 9;
                                                if (var41 >= 0 && var42 >= 0 && var41 < super.field9048 && ~super.field9060 < ~var42) {
                                                    var38.method801((byte) 126, var40, super.field9038[var36.field8793][var41][var42] - var38.method1006(31079), var39);
                                                    class646.method3676(var36);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                var8 = new class71(arg0);
                            }
                        }
                        if (var8 != null) {
                            for (int var9 = 0; var9 < 8; ++var9) {
                                for (int var10 = 0; var10 < 8; ++var10) {
                                    int var11 = (arg2 >> 3) - -var9;
                                    int var12 = (arg3 >> 3) + var10;
                                    if (var11 >= 0 && super.field9048 >> 3 > var11 && ~var12 <= -1 && var12 < super.field9060 >> 3) {
                                        class468.method2834(var12, var8, 0, var11);
                                    }
                                }
                            }
                        }
                        if (!var7 && super.field9034 != null) {
                            for (int var13 = 0; ~var13 > -5; ++var13) {
                                if (super.field9034[var13] != null) {
                                    for (int var14 = 0; ~var14 > -17; ++var14) {
                                        for (int var15 = 0; ~var15 > -17; ++var15) {
                                            int var16 = (arg2 >> 2) + var14;
                                            int var17 = (arg3 >> 2) - -var15;
                                            if (~var16 <= -1 && ~var16 > -27 && ~var17 <= -1 && var17 < 26) {
                                                super.field9034[var13][var16][var17] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IILcaa;IIIIILha;II)V")
    public final void method589(int arg0, int arg1, class302 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8, int arg9, int arg10) {
        ++field871;
        if (~class654.field9334.field9858.method2982(-125) != -1 || class755.method4199(0, class316.field4035, arg0, arg9, arg7)) {
            if (~arg10 > ~this.field875) {
                this.field875 = arg10;
            }
            class316 var12 = class445.field6442.method3972((byte) 125, arg5);
            if (~class654.field9334.field9836.method466(36) != -1 || !var12.field3961) {
                int var13;
                int var14;
                if (arg4 != 1 && ~arg4 != -4) {
                    var13 = var12.field4050;
                    var14 = var12.field4020;
                } else {
                    var13 = var12.field4020;
                    var14 = var12.field4050;
                }
                int var15;
                int var16;
                if (~(arg9 - -var14) >= ~super.field9048) {
                    var15 = (var14 - -1 >> 1) + arg9;
                    var16 = (var14 >> 1) + arg9;
                } else {
                    var16 = arg9;
                    var15 = arg9 + 1;
                }
                int var17;
                int var18;
                if (super.field9060 < arg7 + var13) {
                    var17 = arg7 - -1;
                    var18 = arg7;
                } else {
                    var17 = (var13 + 1 >> 1) + arg7;
                    var18 = (var13 >> 1) + arg7;
                }
                class278 var19 = class504.field7120[arg0];
                int var20 = var19.method1671(var18, var16, (byte) -75) + (var19.method1671(var18, var15, (byte) -71) + var19.method1671(var17, var16, (byte) 122) - -var19.method1671(var17, var15, (byte) -83)) >> 2;
                int var21 = (arg9 << 9) + (var14 << 8);
                int var22 = (arg7 << 9) + (var13 << 8);
                boolean var23 = class161.field1802 && !super.field9052 && var12.field4032;
                if (var12.method1887(9232)) {
                    class416.method2543((class197) null, arg7, arg4, (class183) null, arg10, var12, (byte) -62, arg9);
                }
                boolean var24 = arg6 == -1 && ~var12.field3965 == 0 && var12.field4036 == null && var12.field4045 == null && !var12.field3992;
                if (!class287.field3528 || (!class332.method1987(arg3, 109) || ~var12.field3972 == -2) && (!class699.method3927(arg3, (byte) 97) || var12.field3972 != 0)) {
                    if (~arg3 == -23) {
                        if (class654.field9334.field9855.method2962(-125) != 0 || var12.field4001 != 0 || ~var12.field4046 == -2 || var12.field4052) {
                            class188 var25;
                            if (!var24) {
                                var25 = new class208(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, arg4, arg6);
                            } else {
                                class465 var26 = new class465(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, arg4, var23);
                                if (var26.method1239(true)) {
                                    var26.method1244(17513, arg8);
                                }
                                var25 = var26;
                            }
                            class520.method3052(arg10, arg9, arg7, var25);
                            if (~var12.field4046 == -2 && arg2 != null) {
                                arg2.method1813(arg7, 262144, arg9);
                            }
                        }
                    } else if (~arg3 != -11 && ~arg3 != -12) {
                        if (arg3 >= 12 && ~arg3 >= -18 || ~arg3 <= -19 && arg3 <= 21) {
                            class340 var27;
                            if (!var24) {
                                var27 = new class505(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, arg9, arg9 + var14 + -1, arg7, arg7 + var13 - 1, arg3, arg4, arg6);
                            } else {
                                class578 var28 = new class578(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, arg9, arg9 + -1 + var14, arg7, arg7 + var13 + -1, arg3, arg4, var23);
                                if (var28.method1239(true)) {
                                    var28.method1244(17513, arg8);
                                }
                                var27 = var28;
                            }
                            class264.method1594(var27, false);
                            if (class161.field1802 && !super.field9052 && ~arg3 <= -13 && arg3 <= 17 && arg3 != 13 && arg10 > 0 && var12.field3972 != 0) {
                                super.field9035[arg10][arg9][arg7] = (byte) class695.method3919(super.field9035[arg10][arg9][arg7], 4);
                            }
                            if (var12.field4046 != 0 && arg2 != null) {
                                arg2.method1806((byte) 119, var14, var12.field3964, arg9, var13, !var12.field4030, arg7);
                            }
                        } else if (~arg3 == -1) {
                            int var29 = var12.field3972;
                            if (class686.field9684 && var12.field3972 == -1) {
                                var29 = 1;
                            }
                            class492 var31;
                            if (var24) {
                                class706 var30 = new class706(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, arg3, arg4, var23);
                                if (var30.method1239(true)) {
                                    var30.method1244(17513, arg8);
                                }
                                var31 = var30;
                            } else {
                                var31 = new class240(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, arg3, arg4, arg6);
                            }
                            class498.method2967(arg10, arg9, arg7, var31, (class492) null);
                            if (~arg4 != -1) {
                                if (arg4 != 1) {
                                    if (~arg4 == -3) {
                                        if (class161.field1802 && var12.field3963) {
                                            var19.method1666(arg9 + 1, arg7, 50);
                                            var19.method1666(arg9 + 1, arg7 + 1, 50);
                                        }
                                        if (var29 == 1 && !super.field9052) {
                                            class34.method158(90, var12.field3988, arg9 + 1, -var12.field4003, 1, arg7, arg10);
                                        }
                                    } else if (~arg4 == -4) {
                                        if (class161.field1802 && var12.field3963) {
                                            var19.method1666(arg9, arg7, 50);
                                            var19.method1666(arg9 + 1, arg7, 50);
                                        }
                                        if (var29 == 1 && !super.field9052) {
                                            class34.method158(-94, var12.field3988, arg9, var12.field4003, 2, arg7, arg10);
                                        }
                                    }
                                } else {
                                    if (class161.field1802 && var12.field3963) {
                                        var19.method1666(arg9, arg7 - -1, 50);
                                        var19.method1666(arg9 - -1, arg7 - -1, 50);
                                    }
                                    if (var29 == 1 && !super.field9052) {
                                        class34.method158(113, var12.field3988, arg9, -var12.field4003, 2, arg7 - -1, arg10);
                                    }
                                }
                            } else {
                                if (class161.field1802 && var12.field3963) {
                                    var19.method1666(arg9, arg7, 50);
                                    var19.method1666(arg9, arg7 + 1, 50);
                                }
                                if (var29 == 1 && !super.field9052) {
                                    class34.method158(44, var12.field3988, arg9, var12.field4003, 1, arg7, arg10);
                                }
                            }
                            if (var12.field4046 != 0 && arg2 != null) {
                                arg2.method1811(arg3, var12.field3964, !var12.field4030, arg7, arg9, 1, arg4);
                            }
                            if (~var12.field3976 != -65) {
                                class392.method2412(arg10, arg9, arg7, var12.field3976);
                            }
                        } else if (~arg3 == -2) {
                            class492 var33;
                            if (var24) {
                                class706 var32 = new class706(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, arg3, arg4, var23);
                                var33 = var32;
                                if (var32.method1239(true)) {
                                    var32.method1244(17513, arg8);
                                }
                            } else {
                                var33 = new class240(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, arg3, arg4, arg6);
                            }
                            class498.method2967(arg10, arg9, arg7, var33, (class492) null);
                            if (var12.field3963 && class161.field1802) {
                                if (arg4 == 0) {
                                    var19.method1666(arg9, arg7 + 1, 50);
                                } else if (~arg4 != -2) {
                                    if (arg4 != 2) {
                                        if (~arg4 == -4) {
                                            var19.method1666(arg9, arg7, 50);
                                        }
                                    } else {
                                        var19.method1666(arg9 + 1, arg7, 50);
                                    }
                                } else {
                                    var19.method1666(arg9 + 1, arg7 + 1, 50);
                                }
                            }
                            if (~var12.field4046 != -1 && arg2 != null) {
                                arg2.method1811(arg3, var12.field3964, !var12.field4030, arg7, arg9, 1, arg4);
                            }
                        } else if (arg3 == 2) {
                            int var34 = arg4 - -1 & 3;
                            class492 var35;
                            class492 var36;
                            if (!var24) {
                                var35 = new class240(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, arg3, arg4 + 4, arg6);
                                var36 = new class240(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, arg3, var34, arg6);
                            } else {
                                class706 var37 = new class706(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, arg3, arg4 + 4, var23);
                                class706 var38 = new class706(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, arg3, var34, var23);
                                if (var37.method1239(true)) {
                                    var37.method1244(17513, arg8);
                                }
                                if (var38.method1239(true)) {
                                    var38.method1244(17513, arg8);
                                }
                                var35 = var37;
                                var36 = var38;
                            }
                            class498.method2967(arg10, arg9, arg7, var35, var36);
                            if ((var12.field3972 == 1 || class686.field9684 && ~var12.field3972 == 0) && !super.field9052) {
                                if (~arg4 == -1) {
                                    class34.method158(-126, var12.field3988, arg9, var12.field4003, 1, arg7, arg10);
                                    class34.method158(-86, var12.field3988, arg9, var12.field4003, 2, arg7 + 1, arg10);
                                } else if (~arg4 == -2) {
                                    class34.method158(-116, var12.field3988, arg9 - -1, var12.field4003, 1, arg7, arg10);
                                    class34.method158(-91, var12.field3988, arg9, var12.field4003, 2, arg7 - -1, arg10);
                                } else if (~arg4 != -3) {
                                    if (~arg4 == -4) {
                                        class34.method158(82, var12.field3988, arg9, var12.field4003, 1, arg7, arg10);
                                        class34.method158(-88, var12.field3988, arg9, var12.field4003, 2, arg7, arg10);
                                    }
                                } else {
                                    class34.method158(-83, var12.field3988, arg9 + 1, var12.field4003, 1, arg7, arg10);
                                    class34.method158(107, var12.field3988, arg9, var12.field4003, 2, arg7, arg10);
                                }
                            }
                            if (~var12.field4046 != -1 && arg2 != null) {
                                arg2.method1811(arg3, var12.field3964, !var12.field4030, arg7, arg9, 1, arg4);
                            }
                            if (var12.field3976 != 64) {
                                class392.method2412(arg10, arg9, arg7, var12.field3976);
                            }
                        } else if (arg3 == 3) {
                            class492 var40;
                            if (var24) {
                                class706 var39 = new class706(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, arg3, arg4, var23);
                                var40 = var39;
                                if (var39.method1239(true)) {
                                    var39.method1244(17513, arg8);
                                }
                            } else {
                                var40 = new class240(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, arg3, arg4, arg6);
                            }
                            class498.method2967(arg10, arg9, arg7, var40, (class492) null);
                            if (var12.field3963 && class161.field1802) {
                                if (~arg4 == -1) {
                                    var19.method1666(arg9, arg7 + 1, 50);
                                } else if (arg4 == 1) {
                                    var19.method1666(arg9 + 1, arg7 + 1, 50);
                                } else if (~arg4 == -3) {
                                    var19.method1666(arg9 + 1, arg7, 50);
                                } else if (arg4 == 3) {
                                    var19.method1666(arg9, arg7, 50);
                                }
                            }
                            if (var12.field4046 != 0 && arg2 != null) {
                                arg2.method1811(arg3, var12.field3964, !var12.field4030, arg7, arg9, 1, arg4);
                            }
                        } else if (~arg3 == -10) {
                            class340 var42;
                            if (var24) {
                                class578 var41 = new class578(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, arg9, arg9, arg7, arg7, arg3, arg4, var23);
                                var42 = var41;
                                if (var41.method1239(true)) {
                                    var41.method1244(17513, arg8);
                                }
                            } else {
                                var42 = new class505(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, arg9, arg9 - -var14 + -1, arg7, arg7 + -1 - -var13, arg3, arg4, arg6);
                            }
                            class264.method1594(var42, false);
                            if (~var12.field3972 == -2 && !super.field9052) {
                                byte var43;
                                if (~(1 & arg4) == -1) {
                                    var43 = 8;
                                } else {
                                    var43 = 16;
                                }
                                class34.method158(51, var12.field3988, arg9, 0, var43, arg7, arg10);
                            }
                            if (~var12.field4046 != -1 && arg2 != null) {
                                arg2.method1806((byte) 119, var14, var12.field3964, arg9, var13, !var12.field4030, arg7);
                            }
                            if (var12.field3976 != 64) {
                                class392.method2412(arg10, arg9, arg7, var12.field3976);
                            }
                        } else if (~arg3 == -5) {
                            class577 var45;
                            if (var24) {
                                class337 var44 = new class337(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, 0, 0, arg3, arg4);
                                if (var44.method1239(true)) {
                                    var44.method1244(17513, arg8);
                                }
                                var45 = var44;
                            } else {
                                var45 = new class599(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, 0, 0, arg3, arg4, arg6);
                            }
                            class44.method256(arg10, arg9, arg7, var45, (class577) null);
                        } else if (~arg3 == -6) {
                            int var46 = 65;
                            class281 var47 = (class281) class628.method3602(arg10, arg9, arg7);
                            if (var47 != null) {
                                var46 = class445.field6442.method3972((byte) 119, var47.method1241((byte) 99)).field3976 + 1;
                            }
                            class577 var48;
                            if (!var24) {
                                var48 = new class599(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, class732.field10259[arg4] * var46, class32.field360[arg4] * var46, arg3, arg4, arg6);
                            } else {
                                class337 var49 = new class337(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, class732.field10259[arg4] * var46, class32.field360[arg4] * var46, arg3, arg4);
                                if (var49.method1239(true)) {
                                    var49.method1244(17513, arg8);
                                }
                                var48 = var49;
                            }
                            class44.method256(arg10, arg9, arg7, var48, (class577) null);
                        } else if (arg3 == 6) {
                            int var50 = 33;
                            class281 var51 = (class281) class628.method3602(arg10, arg9, arg7);
                            if (var51 != null) {
                                var50 = 1 + class445.field6442.method3972((byte) 105, var51.method1241((byte) 99)).field3976 / 2;
                            }
                            class577 var52;
                            if (!var24) {
                                var52 = new class599(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, class5.field40[arg4] * var50, class648.field9260[arg4] * var50, arg3, arg4 + 4, arg6);
                            } else {
                                class337 var53 = new class337(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, class732.field10259[arg4] * var50, class32.field360[arg4] * var50, arg3, arg4 + 4);
                                var52 = var53;
                                if (var53.method1239(true)) {
                                    var53.method1244(17513, arg8);
                                }
                            }
                            class44.method256(arg10, arg9, arg7, var52, (class577) null);
                        } else {
                            int var54 = -91 / ((arg1 - -56) / 60);
                            if (arg3 == 7) {
                                int var55 = arg4 + 2 & 3;
                                class577 var57;
                                if (var24) {
                                    class337 var56 = new class337(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, 0, 0, arg3, var55 + 4);
                                    if (var56.method1239(true)) {
                                        var56.method1244(17513, arg8);
                                    }
                                    var57 = var56;
                                } else {
                                    var57 = new class599(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, 0, 0, arg3, var55 + 4, arg6);
                                }
                                class44.method256(arg10, arg9, arg7, var57, (class577) null);
                            } else if (arg3 == 8) {
                                int var58 = 3 & arg4 + 2;
                                int var59 = 33;
                                class281 var60 = (class281) class628.method3602(arg10, arg9, arg7);
                                if (var60 != null) {
                                    var59 = 1 + class445.field6442.method3972((byte) 118, var60.method1241((byte) 99)).field3976 / 2;
                                }
                                class577 var62;
                                class577 var64;
                                if (!var24) {
                                    class599 var61 = new class599(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, class5.field40[arg4] * var59, class648.field9260[arg4] * var59, arg3, arg4 + 4, arg6);
                                    var62 = var61;
                                    class599 var63 = new class599(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, 0, 0, arg3, var58 + 4, arg6);
                                    var64 = var63;
                                } else {
                                    class337 var65 = new class337(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, class5.field40[arg4] * var59, class648.field9260[arg4] * var59, arg3, arg4 + 4);
                                    class337 var66 = new class337(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, 0, 0, arg3, var58 + 4);
                                    if (var65.method1239(true)) {
                                        var65.method1244(17513, arg8);
                                    }
                                    var64 = var66;
                                    if (var66.method1239(true)) {
                                        var66.method1244(17513, arg8);
                                    }
                                    var62 = var65;
                                }
                                class44.method256(arg10, arg9, arg7, var62, var64);
                            }
                        }
                    } else {
                        class578 var67 = null;
                        int var69;
                        class340 var70;
                        if (var24) {
                            class578 var68 = new class578(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, arg9, arg9 + -1 + var14, arg7, arg7 + -1 + var13, arg3, arg4, var23);
                            var69 = var68.method3334((byte) -115);
                            var67 = var68;
                            var70 = var68;
                        } else {
                            var69 = 15;
                            var70 = new class505(arg8, var12, arg10, arg0, var21, var20, var22, super.field9052, arg9, arg9 + -1 + var14, arg7, var13 + -1 + arg7, arg3, arg4, arg6);
                        }
                        if (class264.method1594(var70, false)) {
                            if (var67 != null && var67.method1239(true)) {
                                var67.method1244(17513, arg8);
                            }
                            if (var12.field3963 && class161.field1802) {
                                if (var69 > 30) {
                                    var69 = 30;
                                }
                                for (int var71 = 0; var14 >= var71; ++var71) {
                                    for (int var72 = 0; var13 >= var72; ++var72) {
                                        var19.method1666(arg9 + var71, arg7 - -var72, var69);
                                    }
                                }
                            }
                        }
                        if (var12.field4046 != 0 && arg2 != null) {
                            arg2.method1806((byte) 119, var14, var12.field3964, arg9, var13, !var12.field4030, arg7);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(IIIII)Lwha;")
    private final class281 method590(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field872;
        class281 var6 = null;
        if (~arg0 == arg3) {
            var6 = (class281) class628.method3602(arg2, arg1, arg4);
        }
        if (~arg0 == -2) {
            var6 = (class281) class603.method3426(arg2, arg1, arg4);
        }
        if (~arg0 == -3) {
            var6 = (class281) class229.method1330(arg2, arg1, arg4, field887 != null ? field887 : (field887 = method595("wha")));
        }
        if (~arg0 == -4) {
            var6 = (class281) class199.method1201(arg2, arg1, arg4);
        }
        return var6;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)V")
    public static void method591(int arg0) {
        field886 = null;
        field874 = null;
        field884 = null;
        field885 = null;
        field882 = null;
        if (arg0 > -88) {
            field874 = null;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(ZLha;B)V")
    public final void method592(boolean arg0, class58 arg1, byte arg2) {
        ++field883;
        int var4 = 88 % ((-1 - arg2) / 33);
        class324.method1932();
        if (!arg0) {
            if (~super.field9051 < -2) {
                for (int var5 = 0; ~super.field9048 < ~var5; ++var5) {
                    for (int var6 = 0; ~super.field9060 < ~var6; ++var6) {
                        if (~(class100.field1043[1][var5][var6] & 2) == -3) {
                            class488.method2941(var5, var6);
                        }
                    }
                }
            }
            for (int var7 = 0; ~var7 > ~super.field9051; ++var7) {
                for (int var8 = 0; var8 <= super.field9060; ++var8) {
                    for (int var9 = 0; var9 <= super.field9048; ++var9) {
                        if ((4 & super.field9035[var7][var9][var8]) != 0) {
                            int var10 = var9;
                            int var11 = var9;
                            int var12 = var8;
                            int var13 = var8;
                            while (var12 > 0 && (super.field9035[var7][var9][var12 + -1] & 4) != 0 && -var12 + var13 < 10) {
                                --var12;
                            }
                            while (super.field9060 > var13 && (super.field9035[var7][var9][var13 + 1] & 4) != 0 && ~(-var12 + var13) > -11) {
                                ++var13;
                            }
                            label114: while (~var10 < -1 && ~(-var10 + var11) > -11) {
                                for (int var14 = var12; ~var13 <= ~var14; ++var14) {
                                    if (~(super.field9035[var7][var10 + -1][var14] & 4) == -1) {
                                        break label114;
                                    }
                                }
                                --var10;
                            }
                            label101: while (super.field9048 > var11 && ~(-var10 + var11) > -11) {
                                for (int var15 = var12; ~var15 >= ~var13; ++var15) {
                                    if (~(4 & super.field9035[var7][var11 + 1][var15]) == -1) {
                                        break label101;
                                    }
                                }
                                ++var11;
                            }
                            if (~((-var10 + var11 - -1) * (-var12 + var13 + 1)) <= -5) {
                                int var16 = super.field9038[var7][var10][var12];
                                class254.method1511(var16, var10 << 9, var7, -45, (var11 << 9) + 512, 4, var16, var12 << 9, (var13 << 9) + 512);
                                for (int var17 = var10; ~var11 <= ~var17; ++var17) {
                                    for (int var18 = var12; ~var18 >= ~var13; ++var18) {
                                        super.field9035[var7][var17][var18] = (byte) class327.method1956(super.field9035[var7][var17][var18], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class556.method3263(false);
        }
        super.field9035 = null;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field880;
        int var9 = -4 / ((arg0 - -31) / 55);
        if (class650.method3697(0, arg3)) {
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            int var15 = 0;
            if (class397.field5443) {
                var11 = class507.field7232;
                var13 = class630.field9064;
                var12 = class716.field10055;
                var15 = class240.field2859;
                var14 = class198.field2314;
                class240.field2859 = 1;
            }
            if (class286.field3496[arg3] != null) {
                class740.method4117(false, arg4, arg6, arg8, arg1 < 0, arg7, arg1, arg2, arg5, -1, class286.field3496[arg3]);
            } else {
                class740.method4117(false, arg4, arg6, arg8, ~arg1 > -1, arg7, arg1, arg2, arg5, -1, class643.field9209[arg3]);
            }
            if (class397.field5443) {
                if (~arg1 <= -1 && ~class240.field2859 == -3) {
                    class16.method75(class716.field10055, (byte) -126, class198.field2314, class507.field7232, class630.field9064);
                }
                class198.field2314 = var14;
                class716.field10055 = var12;
                class630.field9064 = var13;
                class507.field7232 = var11;
                class240.field2859 = var15;
            }
        } else if (arg1 != -1) {
            class272.field3360[arg1] = true;
        } else {
            for (int var10 = 0; var10 < 100; ++var10) {
                class272.field3360[var10] = true;
            }
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lha;IILcaa;III)V")
    public final void method594(class58 arg0, int arg1, int arg2, class302 arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 1) {
            method584(-75, (class179) null);
        }
        ++field878;
        class281 var8 = this.method590(arg2, arg4, arg1, arg6 ^ -2, arg5);
        if (var8 != null) {
            class316 var9 = class445.field6442.method3972((byte) 116, var8.method1241((byte) 99));
            int var10 = var8.method1236((byte) -78);
            int var11 = var8.method1243((byte) 117);
            if (var9.method1887(arg6 ^ 9233)) {
                class642.method3662(arg4, (byte) 61, arg5, var9, arg1);
            }
            if (var8.method1239(true)) {
                var8.method1238(arg0, (byte) -81);
            }
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (~arg2 != -3) {
                        if (arg2 == 3) {
                            class343.method2047(arg1, arg4, arg5);
                            if (var9.field4046 == 1) {
                                arg3.method1810(arg5, (byte) -87, arg4);
                                return;
                            }
                        }
                    } else {
                        class145.method902(arg1, arg4, arg5, field887 != null ? field887 : (field887 = method595("wha")));
                        if (var9.field4046 != 0 && ~(var9.field4020 + arg4) > ~super.field9048 && ~super.field9060 < ~(var9.field4020 + arg5) && super.field9048 > var9.field4050 + arg4 && ~(var9.field4050 + arg5) > ~super.field9060) {
                            arg3.method1820(arg6 + 31902, arg4, var9.field4020, !var9.field4030, var11, var9.field4050, var9.field3964, arg5);
                        }
                        if (~var10 != -10) {
                            return;
                        }
                        if ((var11 & 1) == 0) {
                            class551.method3231(arg6 + 8874, arg4, 8, arg5, arg1);
                            return;
                        }
                        class551.method3231(8875, arg4, 16, arg5, arg1);
                    }
                    return;
                } else {
                    class453.method2786(arg1, arg4, arg5);
                    return;
                }
            }
            class232.method1346(arg1, arg4, arg5);
            if (var9.field4046 != 0) {
                arg3.method1821(var9.field3964, arg4, arg5, !var9.field4030, var11, false, var10);
            }
            if (~var9.field3972 == -2) {
                if (~var11 != -1) {
                    if (var11 != 1) {
                        if (var11 == 2) {
                            class551.method3231(8875, arg4 + 1, 1, arg5, arg1);
                            return;
                        }
                        if (~var11 == -4) {
                            class551.method3231(8875, arg4, 2, arg5, arg1);
                            return;
                        }
                    } else {
                        class551.method3231(8875, arg4, 2, arg5 + 1, arg1);
                    }
                    return;
                }
                class551.method3231(8875, arg4, 1, arg5, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(IIIZ)V")
    public class84(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class35.field382, class147.field1641);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method595(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
