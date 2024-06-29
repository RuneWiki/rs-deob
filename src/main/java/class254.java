import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class254 {

    @OriginalMember(owner = "client!sr", name = "A", descriptor = "[I")
    private int[] field3690 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!sr", name = "w", descriptor = "[I")
    private int[] field3686 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "Z")
    public boolean field3671;

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "Lcb;")
    private class521 field3681;

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "Lqe;")
    private class468 field3682;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
    public int field3679;

    @OriginalMember(owner = "client!sr", name = "C", descriptor = "I")
    public int field3692;

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
    public int field3676;

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "[[[I")
    public int[][][] field3684;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "[[[B")
    public byte[][][] field3670;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "[[[B")
    private byte[][][] field3675;

    @OriginalMember(owner = "client!sr", name = "B", descriptor = "[[[B")
    private byte[][][] field3691;

    @OriginalMember(owner = "client!sr", name = "y", descriptor = "[[[B")
    private byte[][][] field3688;

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "[[[B")
    private byte[][][] field3685;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "Z")
    public static boolean field3665 = false;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!sr", name = "x", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!sr", name = "D", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "[[[B")
    public byte[][][] field3666;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II[[BI[[BILvd;Lhk;[ZI[[BIILha;)V", line = 6)
    private final void method1720(int arg0, int arg1, byte[][] arg2, int arg3, byte[][] arg4, int arg5, class39 arg6, class103 arg7, boolean[] arg8, int arg9, byte[][] arg10, int arg11, int arg12, class59 arg13) {
        field3674++;
        boolean[] var15 = arg6 != null && arg6.field946 ? class216.field3138[arg12] : class262.field3753[arg12];
        if (arg3 > 0) {
            if (arg0 > 0) {
                int var16 = arg10[arg0 - 1][arg3 - 1] & 0xFF;
                if (var16 > 0) {
                    class39 var17 = this.field3681.method3032(var16 - 1, false);
                    if (var17.field949 != -1 && var17.field946) {
                        byte var18 = arg2[arg0 - 1][arg3 - 1];
                        int var19 = arg4[arg0 - 1][arg3 - 1] * 2 + 4 & 0x7;
                        int var20 = class172.method1286(arg13, 127, var17);
                        if (class371.field5288[var18][var19]) {
                            class7.field54[0] = var17.field949;
                            class556.field7685[0] = var20;
                            class426.field6132[0] = var17.field961;
                            class667.field9103[0] = var17.field956;
                            class359.field5180[0] = var17.field950;
                            class27.field742[0] = 256;
                        }
                    }
                }
            }
            if ((arg11 - 1) > arg0) {
                int var21 = arg10[arg0 + 1][arg3 - 1] & 0xFF;
                if (var21 > 0) {
                    class39 var22 = this.field3681.method3032(var21 - 1, false);
                    if (var22.field949 != -1 && var22.field946) {
                        byte var23 = arg2[arg0 + 1][arg3 - 1];
                        int var24 = arg4[arg0 + 1][arg3 - 1] * 2 + 6 & 0x7;
                        int var25 = class172.method1286(arg13, 125, var22);
                        if (class371.field5288[var23][var24]) {
                            class7.field54[2] = var22.field949;
                            class556.field7685[2] = var25;
                            class426.field6132[2] = var22.field961;
                            class667.field9103[2] = var22.field956;
                            class359.field5180[2] = var22.field950;
                            class27.field742[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg3 < (arg1 + arg5)) {
            if (arg0 > 0) {
                int var26 = arg10[arg0 - 1][arg3 + 1] & 0xFF;
                if (var26 > 0) {
                    class39 var27 = this.field3681.method3032(var26 - 1, false);
                    if (var27.field949 != -1 && var27.field946) {
                        byte var28 = arg2[arg0 - 1][arg3 + 1];
                        int var29 = arg4[arg0 - 1][arg3 + 1] * 2 + 2 & 0x7;
                        int var30 = class172.method1286(arg13, arg5 ^ 0xFFFFFF83, var27);
                        if (class371.field5288[var28][var29]) {
                            class7.field54[6] = var27.field949;
                            class556.field7685[6] = var30;
                            class426.field6132[6] = var27.field961;
                            class667.field9103[6] = var27.field956;
                            class359.field5180[6] = var27.field950;
                            class27.field742[6] = 64;
                        }
                    }
                }
            }
            if (arg0 < arg11 - 1) {
                int var31 = arg10[arg0 + 1][arg3 + 1] & 0xFF;
                if (var31 > 0) {
                    class39 var32 = this.field3681.method3032(var31 - 1, false);
                    if (var32.field949 != -1 && var32.field946) {
                        byte var33 = arg2[arg0 + 1][arg3 + 1];
                        int var34 = -(-(arg4[arg0 + 1][arg3 + 1] * 2)) & 0x7;
                        int var35 = class172.method1286(arg13, arg5 + 127, var32);
                        if (class371.field5288[var33][var34]) {
                            class7.field54[4] = var32.field949;
                            class556.field7685[4] = var35;
                            class426.field6132[4] = var32.field961;
                            class667.field9103[4] = var32.field956;
                            class359.field5180[4] = var32.field950;
                            class27.field742[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg3 > 0) {
            int var36 = arg10[arg0][arg3 - 1] & 0xFF;
            if (var36 > 0) {
                class39 var37 = this.field3681.method3032(var36 - 1, false);
                if (var37.field949 != -1) {
                    byte var38 = arg2[arg0][arg3 - 1];
                    byte var39 = arg4[arg0][arg3 - 1];
                    if (var37.field946) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class172.method1286(arg13, 125, var37);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class371.field5288[var38][var41] && var37.field950 >= class359.field5180[var40]) {
                                class7.field54[var40] = var37.field949;
                                class556.field7685[var40] = var42;
                                class426.field6132[var40] = var37.field961;
                                class667.field9103[var40] = var37.field956;
                                if (class359.field5180[var40] == var37.field950) {
                                    class27.field742[var40] = class418.method2577(class27.field742[var40], 32);
                                } else {
                                    class27.field742[var40] = 32;
                                }
                                class359.field5180[var40] = var37.field950;
                            }
                            var41++;
                            var40--;
                        }
                        if (!var15[arg9 & 0x3]) {
                            arg8[0] = class216.field3138[var38][class263.method1762(var39 + 2, 3)];
                        }
                    } else if (!var15[arg9 & 0x3]) {
                        arg8[0] = class262.field3753[var38][class263.method1762(3, var39 + 2)];
                    }
                }
            }
        }
        if ((arg1 - 1) > arg3) {
            int var44 = arg10[arg0][arg3 + 1] & 0xFF;
            if (var44 > 0) {
                class39 var45 = this.field3681.method3032(var44 - 1, false);
                if (var45.field949 != -1) {
                    byte var46 = arg2[arg0][arg3 + 1];
                    byte var47 = arg4[arg0][arg3 + 1];
                    if (var45.field946) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class172.method1286(arg13, 124, var45);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class371.field5288[var46][var49] && class359.field5180[var48] <= var45.field950) {
                                class7.field54[var48] = var45.field949;
                                class556.field7685[var48] = var50;
                                class426.field6132[var48] = var45.field961;
                                class667.field9103[var48] = var45.field956;
                                if (class359.field5180[var48] == var45.field950) {
                                    class27.field742[var48] = class418.method2577(class27.field742[var48], 16);
                                } else {
                                    class27.field742[var48] = 16;
                                }
                                class359.field5180[var48] = var45.field950;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg9 + 2 & 0x3]) {
                            arg8[2] = class216.field3138[var46][class263.method1762(3, -(-var47))];
                        }
                    } else if (!var15[arg9 + 2 & 0x3]) {
                        arg8[2] = class262.field3753[var46][class263.method1762(3, var47)];
                    }
                }
            }
        }
        if (arg0 > 0) {
            int var52 = arg10[arg0 - 1][arg3] & 0xFF;
            if (var52 > 0) {
                class39 var53 = this.field3681.method3032(var52 - 1, false);
                if (var53.field949 != -1) {
                    byte var54 = arg2[arg0 - 1][arg3];
                    byte var55 = arg4[arg0 - 1][arg3];
                    if (var53.field946) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class172.method1286(arg13, 127, var53);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class371.field5288[var54][var57] && class359.field5180[var56] <= var53.field950) {
                                class7.field54[var56] = var53.field949;
                                class556.field7685[var56] = var58;
                                class426.field6132[var56] = var53.field961;
                                class667.field9103[var56] = var53.field956;
                                if (class359.field5180[var56] == var53.field950) {
                                    class27.field742[var56] = class418.method2577(class27.field742[var56], 8);
                                } else {
                                    class27.field742[var56] = 8;
                                }
                                class359.field5180[var56] = var53.field950;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg9 + 3 & 0x3]) {
                            arg8[3] = class216.field3138[var54][class263.method1762(3, var55 + 1)];
                        }
                    } else if (!var15[arg9 + 3 & 0x3]) {
                        arg8[3] = class262.field3753[var54][class263.method1762(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg0 < (arg11 - 1)) {
            int var60 = arg10[arg0 + 1][arg3] & 0xFF;
            if (var60 > 0) {
                class39 var61 = this.field3681.method3032(var60 - 1, false);
                if (var61.field949 != -1) {
                    byte var62 = arg2[arg0 + 1][arg3];
                    byte var63 = arg4[arg0 + 1][arg3];
                    if (var61.field946) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class172.method1286(arg13, 127, var61);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class371.field5288[var62][var65] && var61.field950 >= class359.field5180[var64]) {
                                class7.field54[var64] = var61.field949;
                                class556.field7685[var64] = var66;
                                class426.field6132[var64] = var61.field961;
                                class667.field9103[var64] = var61.field956;
                                if (class359.field5180[var64] == var61.field950) {
                                    class27.field742[var64] = class418.method2577(class27.field742[var64], 4);
                                } else {
                                    class27.field742[var64] = 4;
                                }
                                class359.field5180[var64] = var61.field950;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg9 + 1 & 0x3]) {
                            arg8[1] = class216.field3138[var62][class263.method1762(3, var63 + 3)];
                        }
                    } else if (!var15[arg9 + 1 & 0x3]) {
                        arg8[1] = class262.field3753[var62][class263.method1762(3, var63 + 3)];
                    }
                }
            }
        }
        if (arg6 == null) {
            return;
        }
        int var68 = class172.method1286(arg13, arg5 ^ 0xFFFFFF81, arg6);
        if (!arg6.field946) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg9 * 2) & 0x7;
            if (class371.field5288[arg12][var69] && arg6.field950 >= class359.field5180[var70]) {
                class7.field54[var70] = arg6.field949;
                class556.field7685[var70] = var68;
                class426.field6132[var70] = arg6.field961;
                class667.field9103[var70] = arg6.field956;
                if (class359.field5180[var70] == arg6.field950) {
                    class27.field742[var70] = class418.method2577(class27.field742[var70], 2);
                } else {
                    class27.field742[var70] = 2;
                }
                class359.field5180[var70] = arg6.field950;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ls;Ls;ILs;[[ILha;I)V", line = 473)
    private final void method1721(class281 arg0, class281 arg1, int arg2, class281 arg3, int[][] arg4, class59 arg5, int arg6) {
        field3664++;
        byte[][] var8 = this.field3688[arg6];
        if (arg2 != -26833) {
            this.field3676 = -107;
        }
        byte[][] var9 = this.field3691[arg6];
        byte[][] var10 = this.field3675[arg6];
        byte[][] var11 = this.field3685[arg6];
        for (int var12 = 0; var12 < this.field3679; var12++) {
            int var13 = var12 >= this.field3679 - 1 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field3676; var14++) {
                int var15 = (this.field3676 - 1) > var14 ? var14 + 1 : var14;
                if (class345.field4824 == -1 || class273.method1804(var14, false, var12, class345.field4824, arg6)) {
                    boolean var16 = false;
                    boolean var17 = false;
                    boolean[] var18 = new boolean[4];
                    int var19 = var8[var12][var14];
                    int var20 = var9[var12][var14];
                    int var21 = var11[var12][var14] & 0xFF;
                    int var22 = var10[var12][var14] & 0xFF;
                    int var23 = var10[var12][var15] & 0xFF;
                    int var24 = var10[var13][var15] & 0xFF;
                    int var25 = var10[var13][var14] & 0xFF;
                    if (var21 != 0 || var22 != 0) {
                        class39 var26 = var21 == 0 ? null : this.field3681.method3032(var21 - 1, false);
                        class103 var27 = var22 == 0 ? null : this.field3682.method2753(true, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class39 var28 = var26;
                        if (var26 != null) {
                            if (var26.field949 == -1 && var26.field955 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field946;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field3679 && var14 < this.field3676) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var33 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var35++;
                                var33++;
                            } else {
                                var33--;
                                var35--;
                            }
                            int var36 = var34 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var33++;
                                var32++;
                            } else {
                                var33--;
                                var32--;
                            }
                            if (var10[var12][var15] == var22) {
                                var32++;
                                var36++;
                            } else {
                                var36--;
                                var32--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var35++;
                            } else {
                                var36--;
                                var35--;
                            }
                            int var37 = var35 - var32;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var33 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg1.method1851((byte) -86, var14, var12) - arg1.method1851((byte) -86, var15, var13);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg1.method1851((byte) -86, var14, var13) - arg1.method1851((byte) -86, var15, var12);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 >= var38 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class359.field5180[var39] = -1;
                            class27.field742[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field946 ? class216.field3138[var19] : class262.field3753[var19];
                        this.method1720(var12, this.field3676, var8, var14, var9, -1, var26, var27, var18, var20, var11, this.field3679, var19, arg5);
                        boolean var41 = var26 != null && var26.field955 != var26.field949;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class359.field5180[var42] >= 0 && class7.field54[var42] != class556.field7685[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class392.method2466(var18[1], class263.method1762(class27.field742[2], class27.field742[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class392.method2466(var18[3], class263.method1762(class27.field742[0], class27.field742[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class392.method2466(var18[0], class263.method1762(class27.field742[0], class27.field742[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class392.method2466(var18[2], class263.method1762(class27.field742[4], class27.field742[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var18[0] = var18[3] = false;
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[1] = false;
                                var20 = 3;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var20 = 2;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[1] = var18[2] = false;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[2] = var18[3] = false;
                                var20 = 1;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int var45;
                        int[] var46;
                        int[] var47;
                        int[] var48;
                        int var49;
                        if (var43) {
                            var46 = class456.field6419[var19];
                            var47 = class523.field7256[var19];
                            var49 = var27 == null ? 0 : class88.field1571[var19];
                            var48 = class682.field9236[var19];
                            var45 = var26 == null ? 0 : class104.field1844[var19];
                        } else if (var17) {
                            var45 = var26 == null ? 0 : class606.field8322[var19];
                            var46 = class266.field3771[var19];
                            var44 = class62.field1237[var19];
                            var47 = class609.field8356[var19];
                            var48 = class7.field59[var19];
                            var49 = var27 == null ? 0 : class361.field5193[var19];
                        } else {
                            var49 = var27 == null ? 0 : class308.field4270[var19];
                            var45 = var26 == null ? 0 : class511.field7106[var19];
                            var47 = class685.field9280[var19];
                            var48 = class282.field3950[var19];
                            var46 = class721.field9800[var19];
                            var44 = class12.field180[var19];
                        }
                        int var50 = var45 + var49;
                        if (var50 <= 0) {
                            class681.method3821(arg6, var12, var14);
                        } else {
                            if (var18[0]) {
                                var50++;
                            }
                            if (var18[2]) {
                                var50++;
                            }
                            if (var18[1]) {
                                var50++;
                            }
                            if (var18[3]) {
                                var50++;
                            }
                            int var51 = 0;
                            int var52 = 0;
                            int var53 = var50 * 3;
                            int[] var54 = var41 ? new int[var53] : null;
                            int[] var55 = new int[var53];
                            int[] var56 = new int[var53];
                            int[] var57 = new int[var53];
                            int[] var58 = new int[var53];
                            int[] var59 = new int[var53];
                            int[] var60 = arg0 == null ? null : new int[var53];
                            int[] var61 = arg0 == null && arg3 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var63 = var26.field961;
                                var64 = var26.field956;
                                var62 = var26.field949;
                                int var65 = class172.method1286(arg5, arg2 ^ 0xFFFF9752, var26);
                                for (int var66 = 0; var66 < var45; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class362.field5201[0] = var46[var51];
                                        class362.field5201[1] = 1;
                                        class362.field5201[2] = var48[var51];
                                        class362.field5201[3] = 1;
                                        class362.field5201[4] = var47[var51];
                                        class362.field5201[5] = var48[var51];
                                        var68 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class362.field5201[0] = var46[var51];
                                        class362.field5201[1] = 5;
                                        class362.field5201[2] = var48[var51];
                                        class362.field5201[3] = 5;
                                        class362.field5201[4] = var47[var51];
                                        var68 = 6;
                                        class362.field5201[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class362.field5201[0] = var46[var51];
                                        class362.field5201[1] = 3;
                                        class362.field5201[2] = var48[var51];
                                        class362.field5201[3] = 3;
                                        class362.field5201[4] = var47[var51];
                                        var68 = 6;
                                        class362.field5201[5] = var48[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class362.field5201[0] = var46[var51];
                                        class362.field5201[1] = 7;
                                        class362.field5201[2] = var48[var51];
                                        class362.field5201[3] = 7;
                                        class362.field5201[4] = var47[var51];
                                        var68 = 6;
                                        class362.field5201[5] = var48[var51];
                                    } else {
                                        class362.field5201[0] = var46[var51];
                                        class362.field5201[1] = var47[var51];
                                        class362.field5201[2] = var48[var51];
                                        var68 = 3;
                                    }
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class362.field5201[var69];
                                        int var71 = var70 - (var20 * 2) & 0x7;
                                        int var72 = this.field3686[var70];
                                        int var73 = this.field3690[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var75 = 512 - var72;
                                            var74 = var73;
                                        } else if (var20 == 2) {
                                            var74 = 512 - var72;
                                            var75 = 512 - var73;
                                        } else if (var20 == 3) {
                                            var75 = var72;
                                            var74 = 512 - var73;
                                        } else {
                                            var75 = var73;
                                            var74 = var72;
                                        }
                                        var55[var52] = var74;
                                        var56[var52] = var75;
                                        if (var60 != null && class371.field5288[var19][var70]) {
                                            int var76 = (var12 << 9) + var74;
                                            int var77 = (var14 << 9) + var75;
                                            var60[var52] = arg0.method1853(var76, var77, (byte) 124) - arg1.method1853(var76, var77, (byte) -118);
                                        }
                                        if (var61 != null) {
                                            if (arg0 != null && !class371.field5288[var19][var70]) {
                                                int var78 = (var12 << 9) + var74;
                                                int var79 = (var14 << 9) + var75;
                                                var61[var52] = arg1.method1853(var78, var79, (byte) -4) - arg0.method1853(var78, var79, (byte) 73);
                                            } else if (arg3 != null && !class506.field7044[var19][var70]) {
                                                int var80 = (var12 << 9) + var74;
                                                int var81 = (var14 << 9) + var75;
                                                var61[var52] = arg3.method1853(var80, var81, (byte) -105) - arg1.method1853(var80, var81, (byte) -109);
                                            }
                                        }
                                        if (var70 < 8 && class359.field5180[var71] > var26.field950) {
                                            if (var54 != null) {
                                                var54[var52] = class556.field7685[var71];
                                            }
                                            var59[var52] = class667.field9103[var71];
                                            var58[var52] = class426.field6132[var71];
                                            var57[var52] = class7.field54[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field961;
                                            var59[var52] = var26.field956;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field3671 && arg6 == 0) {
                                    class666.method3741(var12, var14, var26.field945, var26.field944 * 8, var26.field960);
                                }
                                if (var19 != 12 && var26.field949 != -1 && var26.field952) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class104.field1844[var19];
                            } else if (var17) {
                                var51 += class606.field8322[var19];
                            } else {
                                var51 += class511.field7106[var19];
                            }
                            if (var27 != null) {
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                class103 var82 = this.field3682.method2753(true, var22 - 1);
                                class103 var83 = this.field3682.method2753(true, var23 - 1);
                                class103 var84 = this.field3682.method2753(true, var24 - 1);
                                class103 var85 = this.field3682.method2753(true, var25 - 1);
                                for (int var86 = 0; var86 < var49; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class362.field5201[0] = var46[var51];
                                        class362.field5201[1] = 1;
                                        class362.field5201[2] = var48[var51];
                                        class362.field5201[3] = 1;
                                        class362.field5201[4] = var47[var51];
                                        var88 = 6;
                                        class362.field5201[5] = var48[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class362.field5201[0] = var46[var51];
                                        class362.field5201[1] = 5;
                                        class362.field5201[2] = var48[var51];
                                        class362.field5201[3] = 5;
                                        class362.field5201[4] = var47[var51];
                                        var88 = 6;
                                        class362.field5201[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class362.field5201[0] = var46[var51];
                                        class362.field5201[1] = 3;
                                        class362.field5201[2] = var48[var51];
                                        class362.field5201[3] = 3;
                                        class362.field5201[4] = var47[var51];
                                        class362.field5201[5] = var48[var51];
                                        var88 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class362.field5201[0] = var46[var51];
                                        class362.field5201[1] = 7;
                                        class362.field5201[2] = var48[var51];
                                        class362.field5201[3] = 7;
                                        class362.field5201[4] = var47[var51];
                                        class362.field5201[5] = var48[var51];
                                        var88 = 6;
                                    } else {
                                        class362.field5201[0] = var46[var51];
                                        class362.field5201[1] = var47[var51];
                                        var88 = 3;
                                        class362.field5201[2] = var48[var51];
                                    }
                                    var51++;
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class362.field5201[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = this.field3686[var90];
                                        int var93 = this.field3690[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = var93;
                                            var95 = 512 - var92;
                                        } else if (var20 == 2) {
                                            var95 = 512 - var93;
                                            var94 = 512 - var92;
                                        } else if (var20 == 3) {
                                            var95 = var92;
                                            var94 = 512 - var93;
                                        } else {
                                            var95 = var93;
                                            var94 = var92;
                                        }
                                        var55[var52] = var94;
                                        var56[var52] = var95;
                                        if (var60 != null && class371.field5288[var19][var90]) {
                                            int var96 = (var12 << 9) + var94;
                                            int var97 = (var14 << 9) + var95;
                                            var60[var52] = arg0.method1853(var96, var97, (byte) -95) - arg1.method1853(var96, var97, (byte) 69);
                                        }
                                        if (var61 != null) {
                                            if (arg0 != null && !class371.field5288[var19][var90]) {
                                                int var98 = (var12 << 9) + var94;
                                                int var99 = (var14 << 9) + var95;
                                                var61[var52] = arg1.method1853(var98, var99, (byte) -102) - arg0.method1853(var98, var99, (byte) 106);
                                            } else if (arg3 != null && !class506.field7044[var19][var90]) {
                                                int var100 = (var12 << 9) + var94;
                                                int var101 = (var14 << 9) + var95;
                                                var61[var52] = arg3.method1853(var100, var101, (byte) 92) - arg1.method1853(var100, var101, (byte) 127);
                                            }
                                        }
                                        if (var90 < 8 && class359.field5180[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class556.field7685[var91];
                                            }
                                            var59[var52] = class667.field9103[var91];
                                            var58[var52] = class426.field6132[var91];
                                            var57[var52] = class7.field54[var91];
                                        } else {
                                            if (var17 && class371.field5288[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var94 == 0 && var95 == 0) {
                                                var57[var52] = arg4[var12][var14];
                                                var58[var52] = var82.field1826;
                                                var59[var52] = var82.field1831;
                                            } else if (var94 == 0 && var95 == 512) {
                                                var57[var52] = arg4[var12][var15];
                                                var58[var52] = var83.field1826;
                                                var59[var52] = var83.field1831;
                                            } else if (var94 == 512 && var95 == 512) {
                                                var57[var52] = arg4[var13][var15];
                                                var58[var52] = var84.field1826;
                                                var59[var52] = var84.field1831;
                                            } else if (var94 == 512 && var95 == 0) {
                                                var57[var52] = arg4[var13][var14];
                                                var58[var52] = var85.field1826;
                                                var59[var52] = var85.field1831;
                                            } else {
                                                if (var94 >= 256) {
                                                    if (var95 >= 256) {
                                                        var58[var52] = var84.field1826;
                                                        var59[var52] = var84.field1831;
                                                    } else {
                                                        var58[var52] = var85.field1826;
                                                        var59[var52] = var85.field1831;
                                                    }
                                                } else if (var95 < 256) {
                                                    var58[var52] = var82.field1826;
                                                    var59[var52] = var82.field1831;
                                                } else {
                                                    var58[var52] = var83.field1826;
                                                    var59[var52] = var83.field1831;
                                                }
                                                int var102 = class511.method2996(arg4[var12][var14], arg4[var13][var14], 1, var94 << 7 >> 9);
                                                int var103 = class511.method2996(arg4[var12][var15], arg4[var13][var15], 1, var94 << 7 >> 9);
                                                var57[var52] = class511.method2996(var102, var103, arg2 + 26834, var95 << 7 >> 9);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field1837) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg1.method1851((byte) -86, var14, var12);
                            int var105 = arg1.method1851((byte) -86, var14, var13);
                            int var106 = arg1.method1851((byte) -86, var15, var13);
                            int var107 = arg1.method1851((byte) -86, var15, var12);
                            boolean var108 = class334.method2118(var14, var12, true);
                            if (var108 && arg6 > 1 || !var108 && arg6 > 0) {
                                boolean var109 = true;
                                if (var27 != null && !var27.field1829) {
                                    var109 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var109 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field947) {
                                    var109 = false;
                                }
                                if (var109 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field3670[arg6][var12][var14] = (byte) class418.method2577(this.field3670[arg6][var12][var14], 4);
                                }
                            }
                            int var110 = 0;
                            int var111 = 0;
                            int var112 = 0;
                            if (this.field3671) {
                                var110 = class79.method726(var12, var14);
                                var111 = class424.method2597(var12, var14);
                                var112 = class538.method3096(var12, var14);
                            }
                            arg1.method1159(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var110, var111, var112, var16);
                            class681.method3821(arg6, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)Lsk;", line = 1345)
    public static final class623 method1722(int arg0, int arg1) {
        field3678++;
        class623[] var2 = class212.method1453(-126);
        if (arg0 >= -111) {
            return null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class623 var4 = var2[var3];
            if (var4.field8471 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIII)V", line = 1372)
    public final void method1723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 >= -80) {
            this.field3670 = null;
        }
        for (int var7 = arg2; var7 < (arg1 + arg2); var7++) {
            for (int var10 = arg0; var10 < (arg0 + arg4); var10++) {
                if (var10 >= 0 && var10 < this.field3679 && var7 >= 0 && this.field3676 > var7) {
                    this.field3684[arg5][var10][var7] = arg5 <= 0 ? 0 : this.field3684[arg5 - 1][var10][var7] - 960;
                }
            }
        }
        field3667++;
        if (arg0 > 0 && arg0 < this.field3679) {
            for (int var8 = arg2 + 1; var8 < (arg2 + arg1); var8++) {
                if (var8 >= 0 && var8 < this.field3676) {
                    this.field3684[arg5][arg0][var8] = this.field3684[arg5][arg0 - 1][var8];
                }
            }
        }
        if (arg2 > 0 && arg2 < this.field3676) {
            for (int var9 = arg0 + 1; var9 < (arg0 + arg4); var9++) {
                if (var9 >= 0 && var9 < this.field3679) {
                    this.field3684[arg5][var9][arg2] = this.field3684[arg5][var9][arg2 - 1];
                }
            }
        }
        if (arg0 < 0 || arg2 < 0 || this.field3679 <= arg0 || arg2 >= this.field3676) {
            return;
        }
        if (arg5 == 0) {
            if (arg0 <= 0 || this.field3684[arg5][arg0 - 1][arg2] == 0) {
                if (arg2 > 0 && this.field3684[arg5][arg0][arg2 - 1] != 0) {
                    this.field3684[arg5][arg0][arg2] = this.field3684[arg5][arg0][arg2 - 1];
                    return;
                }
                if (arg0 > 0 && arg2 > 0 && this.field3684[arg5][arg0 - 1][arg2 - 1] != 0) {
                    this.field3684[arg5][arg0][arg2] = this.field3684[arg5][arg0 - 1][arg2 - 1];
                    return;
                }
                return;
            }
            this.field3684[arg5][arg0][arg2] = this.field3684[arg5][arg0 - 1][arg2];
        } else if (arg0 <= 0 || this.field3684[arg5][arg0 - 1][arg2] == this.field3684[arg5 - 1][arg0 - 1][arg2]) {
            if (arg2 > 0 && this.field3684[arg5 - 1][arg0][arg2 - 1] != this.field3684[arg5][arg0][arg2 - 1]) {
                this.field3684[arg5][arg0][arg2] = this.field3684[arg5][arg0][arg2 - 1];
                return;
            }
            if (arg0 > 0 && arg2 > 0 && this.field3684[arg5 - 1][arg0 - 1][arg2 - 1] != this.field3684[arg5][arg0 - 1][arg2 - 1]) {
                this.field3684[arg5][arg0][arg2] = this.field3684[arg5][arg0 - 1][arg2 - 1];
                return;
            }
        } else {
            this.field3684[arg5][arg0][arg2] = this.field3684[arg5][arg0 - 1][arg2];
            return;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II[[I)V", line = 1471)
    public final void method1724(int arg0, int arg1, int[][] arg2) {
        field3683++;
        int[][] var4 = this.field3684[arg0];
        for (int var5 = arg1; var5 < (this.field3679 + 1); var5++) {
            for (int var6 = 0; var6 < (this.field3676 + 1); var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ls;BLs;Lha;)V", line = 1500)
    public final void method1725(class281 arg0, byte arg1, class281 arg2, class59 arg3) {
        field3693++;
        int[][] var5 = new int[this.field3679][this.field3676];
        if (arg1 > -122) {
            return;
        }
        if (class141.field2335 == null || class141.field2335.length != this.field3676) {
            class692.field9363 = new int[this.field3676];
            class525.field7271 = new int[this.field3676];
            class262.field3752 = new int[this.field3676];
            class141.field2335 = new int[this.field3676];
            class272.field3823 = new int[this.field3676];
        }
        for (int var6 = 0; var6 < this.field3692; var6++) {
            for (int var8 = 0; var8 < this.field3676; var8++) {
                class141.field2335[var8] = 0;
                class525.field7271[var8] = 0;
                class272.field3823[var8] = 0;
                class262.field3752[var8] = 0;
                class692.field9363[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field3679; var9++) {
                for (int var10 = 0; var10 < this.field3676; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field3679) {
                        int var20 = this.field3675[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class103 var21 = this.field3682.method2753(true, var20 - 1);
                            class141.field2335[var10] += var21.field1836;
                            class525.field7271[var10] += var21.field1827;
                            class272.field3823[var10] += var21.field1830;
                            class262.field3752[var10] += var21.field1838;
                            var10002 = class692.field9363[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field3675[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class103 var24 = this.field3682.method2753(true, var23 - 1);
                            class141.field2335[var10] -= var24.field1836;
                            class525.field7271[var10] -= var24.field1827;
                            class272.field3823[var10] -= var24.field1830;
                            class262.field3752[var10] -= var24.field1838;
                            var10002 = class692.field9363[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field3676; var16++) {
                        int var17 = var16 + 5;
                        if (this.field3676 > var17) {
                            var13 += class272.field3823[var17];
                            var12 += class525.field7271[var17];
                            var11 += class141.field2335[var17];
                            var15 += class692.field9363[var17];
                            var14 += class262.field3752[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var14 -= class262.field3752[var18];
                            var11 -= class141.field2335[var18];
                            var13 -= class272.field3823[var18];
                            var15 -= class692.field9363[var18];
                            var12 -= class525.field7271[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class34.method441(var13 / var15, (byte) 66, var12 / var15, var11 * 256 / var14);
                        }
                    }
                }
            }
            if (class82.field1486) {
                this.method1721(var6 == 0 ? arg0 : null, class683.field9250[var6], -26833, var6 == 0 ? arg2 : null, var5, arg3, var6);
            } else {
                this.method1728(arg3, var6 == 0 ? arg0 : null, var6, (byte) 127, var5, class683.field9250[var6], var6 == 0 ? arg2 : null);
            }
            this.field3675[var6] = null;
            this.field3685[var6] = null;
            this.field3688[var6] = null;
            this.field3691[var6] = null;
        }
        if (!this.field3671) {
            if (class307.field4248 != 0) {
                class533.method3070();
            }
            if (class463.field6506) {
                class651.method3681();
            }
        }
        for (int var7 = 0; var7 < this.field3692; var7++) {
            class683.field9250[var7].method1153();
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lcea;I[Lfe;IIIB)V", line = 1683)
    public final void method1726(class215 arg0, int arg1, class570[] arg2, int arg3, int arg4, int arg5, byte arg6) {
        field3669++;
        if (!this.field3671) {
            for (int var8 = 0; var8 < 4; var8++) {
                class570 var9 = arg2[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg1 + var10;
                        int var13 = arg5 + var11;
                        if (var12 >= 0 && this.field3679 > var12 && var13 >= 0 && var13 < this.field3676) {
                            var9.method3299((byte) 107, var13, var12);
                        }
                    }
                }
            }
        }
        int var14 = arg1 + arg4;
        int var15 = 65 % ((arg6 - 34) / 42);
        int var16 = arg3 + arg5;
        for (int var17 = 0; var17 < this.field3692; var17++) {
            for (int var18 = 0; var18 < 64; var18++) {
                for (int var19 = 0; var19 < 64; var19++) {
                    this.method1727(false, 0, arg5 + var19, 0, arg0, 0, 1115212770, arg1 + var18, var14 + var18, var16 + var19, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZIIILcea;IIIIII)V", line = 1760)
    private final void method1727(boolean arg0, int arg1, int arg2, int arg3, class215 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3687++;
        if (arg3 == 1) {
            arg1 = 1;
        } else if (arg3 == 2) {
            arg1 = 1;
            arg5 = 1;
        } else if (arg3 == 3) {
            arg5 = 1;
        }
        if (arg7 >= 0 && this.field3679 > arg7 && arg2 >= 0 && arg2 < this.field3676) {
            if (!this.field3671 && !arg0) {
                class607.field8331[arg10][arg7][arg2] = 0;
            }
            while (true) {
                int var12 = arg4.method1535(arg6 ^ 0x4278CB1D);
                if (var12 == 0) {
                    if (this.field3671) {
                        this.field3684[0][arg5 + arg7][arg1 + arg2] = 0;
                    } else if (arg10 == 0) {
                        this.field3684[0][arg5 + arg7][arg2 + arg1] = -class238.method1652(-113, arg8 + 932731, arg9 + 556238) * 8 << 2;
                    } else {
                        this.field3684[arg10][arg5 + arg7][arg1 + arg2] = this.field3684[arg10 - 1][arg5 + arg7][arg1 + arg2] - 960;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg4.method1535(255);
                    if (this.field3671) {
                        this.field3684[0][arg7 + arg5][arg1 + arg2] = var13 * 8 << 2;
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg10 == 0) {
                            this.field3684[0][arg7 + arg5][arg2 + arg1] = -var13 * 8 << 2;
                        } else {
                            this.field3684[arg10][arg5 + arg7][arg1 + arg2] = this.field3684[arg10 - 1][arg5 + arg7][arg2 + arg1] - (var13 * 8 << 2);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg0) {
                        arg4.method1535(255);
                    } else {
                        this.field3685[arg10][arg7][arg2] = arg4.method1536(arg6 - 1115212859);
                        this.field3688[arg10][arg7][arg2] = (byte) ((var12 - 2) / 4);
                        this.field3691[arg10][arg7][arg2] = (byte) class263.method1762(3, var12 + arg3 - 2);
                    }
                } else if (var12 <= 81) {
                    if (!this.field3671 && !arg0) {
                        class607.field8331[arg10][arg7][arg2] = (byte) (var12 - 49);
                    }
                } else if (!arg0) {
                    this.field3675[arg10][arg7][arg2] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg4.method1535(255);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg4.method1535(arg6 ^ 0x4278CB1D);
                    break;
                }
                if (var14 <= 49) {
                    arg4.method1535(255);
                }
            }
        }
        if (arg6 != 1115212770) {
            this.field3666 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lha;Ls;IB[[ILs;Ls;)V", line = 1884)
    private final void method1728(class59 arg0, class281 arg1, int arg2, byte arg3, int[][] arg4, class281 arg5, class281 arg6) {
        field3673++;
        for (int var8 = 0; var8 < this.field3679; var8++) {
            for (int var9 = 0; var9 < this.field3676; var9++) {
                if (class345.field4824 == -1 || class273.method1804(var9, false, var8, class345.field4824, arg2)) {
                    byte var10 = this.field3688[arg2][var8][var9];
                    byte var11 = this.field3691[arg2][var8][var9];
                    int var12 = this.field3685[arg2][var8][var9] & 0xFF;
                    int var13 = this.field3675[arg2][var8][var9] & 0xFF;
                    class39 var14 = var12 == 0 ? null : this.field3681.method3032(var12 - 1, false);
                    if (var10 == 0 && var14 == null) {
                        var10 = 12;
                    }
                    class103 var15 = var13 == 0 ? null : this.field3682.method2753(true, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class104.field1844[var10];
                        var16 = var15 == null ? 0 : class88.field1571[var10];
                    } else if (var14 != null) {
                        var17 = class104.field1844[var10];
                    } else if (var15 != null) {
                        var16 = class104.field1844[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int var20 = var14 == null ? -1 : var14.field961;
                        int var21 = var15 == null ? -1 : var15.field1826;
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        int[] var24 = new int[var18];
                        int[] var25 = new int[var18];
                        boolean var26 = false;
                        boolean var27 = false;
                        if (var14 != null && (var14.field949 != -1 || var14.field955 != -1 || var20 != -1)) {
                            for (int var28 = 0; var28 < var17; var28++) {
                                var24[var19] = var20;
                                var25[var19] = var14.field956;
                                if (var14.field949 == -1) {
                                    var22[var19] = -1;
                                } else {
                                    var22[var19] = var14.field949;
                                }
                                if (var14.field955 == -1) {
                                    var23[var19] = -1;
                                } else {
                                    var26 = true;
                                    var23[var19] = var14.field955;
                                }
                                var19++;
                            }
                            if (!this.field3671 && arg2 == 0) {
                                class666.method3741(var8, var9, var14.field945, var14.field944 * 8, var14.field960);
                            }
                        } else {
                            var27 = true;
                            for (int var29 = 0; var29 < var17; var29++) {
                                var22[var19] = -1;
                                var19++;
                            }
                        }
                        if (!var26) {
                            var23 = null;
                        }
                        if (var15 == null) {
                            if (var27) {
                                continue;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var22[var19] = -1;
                                var19++;
                            }
                        } else {
                            for (int var31 = 0; var31 < var16; var31++) {
                                var24[var19] = var21;
                                var25[var19] = var15.field1831;
                                var22[var19] = arg4[var8][var9];
                                if (var23 != null) {
                                    var23[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var32 = this.field3686.length;
                        int[] var33 = new int[var32];
                        int[] var34 = new int[var32];
                        int[] var35 = arg1 == null ? null : new int[var32];
                        int[] var36 = arg1 == null && arg6 == null ? null : new int[var32];
                        for (int var37 = 0; var37 < var32; var37++) {
                            int var47 = this.field3686[var37];
                            int var48 = this.field3690[var37];
                            if (var11 == 0) {
                                var33[var37] = var47;
                                var34[var37] = var48;
                            } else if (var11 == 1) {
                                var33[var37] = var48;
                                var34[var37] = 512 - var47;
                            } else if (var11 == 2) {
                                var33[var37] = 512 - var47;
                                var34[var37] = 512 - var48;
                            } else if (var11 == 3) {
                                var33[var37] = 512 - var48;
                                var34[var37] = var47;
                            }
                            if (var35 != null && class371.field5288[var10][var37]) {
                                int var51 = (var8 << 9) + var33[var37];
                                int var52 = (var9 << 9) + var34[var37];
                                var35[var37] = arg1.method1853(var51, var52, (byte) -101) - arg5.method1853(var51, var52, (byte) -12);
                            }
                            if (var36 != null) {
                                if (arg1 != null && !class371.field5288[var10][var37]) {
                                    int var53 = (var8 << 9) + var33[var37];
                                    int var54 = (var9 << 9) + var34[var37];
                                    var36[var37] = arg5.method1853(var53, var54, (byte) 87) - arg1.method1853(var53, var54, (byte) -90);
                                } else if (arg6 != null && !class506.field7044[var10][var37]) {
                                    int var55 = (var8 << 9) + var33[var37];
                                    int var56 = (var9 << 9) + var34[var37];
                                    var36[var37] = arg6.method1853(var55, var56, (byte) -128) - arg5.method1853(var55, var56, (byte) -1);
                                }
                            }
                        }
                        int var38 = arg5.method1851((byte) -86, var9, var8);
                        int var39 = arg5.method1851((byte) -86, var9, var8 + 1);
                        int var40 = arg5.method1851((byte) -86, var9 + 1, var8 - -1);
                        int var41 = arg5.method1851((byte) -86, var9 + 1, var8);
                        boolean var42 = class334.method2118(var9, var8, true);
                        if (var42 && arg2 > 1 || !var42 && arg2 > 0) {
                            boolean var43 = true;
                            if (var15 != null && !var15.field1829) {
                                var43 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var43 = false;
                            } else if (var12 > 0 && var14 != null && !var14.field947) {
                                var43 = false;
                            }
                            if (var43 && var38 == var39 && var38 == var40 && var38 == var41) {
                                this.field3670[arg2][var8][var9] = (byte) class418.method2577(this.field3670[arg2][var8][var9], 4);
                            }
                        }
                        int var44 = 0;
                        int var45 = 0;
                        int var46 = 0;
                        if (this.field3671) {
                            var44 = class79.method726(var8, var9);
                            var45 = class424.method2597(var8, var9);
                            var46 = class538.method3096(var8, var9);
                        }
                        arg5.method1161(var8, var9, var33, var35, var34, var36, class456.field6419[var10], class523.field7256[var10], class682.field9236[var10], var22, var23, var24, var25, var44, var45, var46, false);
                        class681.method3821(arg2, var8, var9);
                    }
                }
            }
        }
        if (arg3 < 115) {
            this.field3679 = 57;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIILcea;III[Lfe;II)V", line = 2210)
    public final void method1729(int arg0, int arg1, int arg2, class215 arg3, int arg4, int arg5, int arg6, class570[] arg7, int arg8, int arg9) {
        if (arg2 != -1) {
            return;
        }
        field3677++;
        int var11 = (arg6 & 0x7) * 8;
        int var12 = (arg4 & 0x7) * 8;
        if (!this.field3671) {
            class570 var13 = arg7[arg1];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg0 + class67.method672(var15 & 0x7, arg8, var14 & 0x7, (byte) 71);
                    int var17 = class116.method1023(var14 & 0x7, true, var15 & 0x7, arg8) + arg5;
                    if (var16 > 0 && var16 < this.field3679 - 1 && var17 > 0 && this.field3676 - 1 > var17) {
                        var13.method3299((byte) 124, var17, var16);
                    }
                }
            }
        }
        int var18 = (arg6 & 0xFFFFFFF8) << 3;
        int var19 = (arg4 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg8 == 1) {
            var21 = 1;
        } else if (arg8 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg8 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field3692; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg9 == var22 && var23 >= var11 && (var11 + 8) >= var23 && var24 >= var12 && var24 <= (var12 + 8)) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || var12 + 8 == var24) {
                            if (arg8 == 0) {
                                var26 = arg5 + var24 - var12;
                                var25 = var23 + arg0 - var11;
                            } else if (arg8 == 1) {
                                var26 = var11 + arg5 + 8 - var23;
                                var25 = var24 - (var12 - arg0);
                            } else if (arg8 == 2) {
                                var26 = var12 + arg5 + 8 - var24;
                                var25 = var11 + arg0 + 8 - var23;
                            } else {
                                var25 = var12 + 8 - (var24 - arg0);
                                var26 = arg5 - (var11 - var23);
                            }
                            this.method1727(true, 0, var26, 0, arg3, 0, 1115212770, var25, var18 + var23, var19 + var24, arg1);
                        } else {
                            var25 = class67.method672(var24 & 0x7, arg8, var23 & 0x7, (byte) 71) + arg0;
                            var26 = arg5 + class116.method1023(var23 & 0x7, true, var24 & 0x7, arg8);
                            this.method1727(false, var21, var26, arg8, arg3, var20, 1115212770, var25, var18 + var23, var19 + var24, arg1);
                        }
                        if (var23 == 63 || var24 == 63) {
                            byte var27 = 1;
                            if (var23 == 63 && var24 == 63) {
                                var27 = 3;
                            }
                            for (int var28 = 0; var28 < var27; var28++) {
                                int var29 = var23;
                                int var30 = var24;
                                if (var28 == 0) {
                                    var30 = var24 == 63 ? 64 : var24;
                                    var29 = var23 == 63 ? 64 : var23;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg8 == 0) {
                                    var31 = var30 + arg5 - var12;
                                    var32 = var29 + arg0 - var11;
                                } else if (arg8 == 1) {
                                    var31 = var11 + 8 - (var29 - arg5);
                                    var32 = arg0 + var30 - var12;
                                } else if (arg8 == 2) {
                                    var31 = arg5 + var12 + 8 - var30;
                                    var32 = var11 - (var29 - arg0 - 8);
                                } else {
                                    var32 = var12 + arg0 + 8 - var30;
                                    var31 = var29 + arg5 - var11;
                                }
                                if (var32 >= 0 && this.field3679 > var32 && var31 >= 0 && var31 < this.field3676) {
                                    this.field3684[arg1][var32][var31] = this.field3684[arg1][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method1727(false, 0, -1, 0, arg3, 0, 1115212770, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lha;[[[II[Lfe;)V", line = 2422)
    public final void method1730(class59 arg0, int[][][] arg1, int arg2, class570[] arg3) {
        field3680++;
        if (arg2 != 21407) {
            this.method1725(null, (byte) -116, null, null);
        }
        if (!this.field3671) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field3679; var6++) {
                    for (int var7 = 0; var7 < this.field3676; var7++) {
                        if ((class607.field8331[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class607.field8331[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg3[var8].method3305(var7, var6, (byte) -116);
                            }
                        }
                    }
                }
            }
        }
        for (int var9 = 0; var9 < this.field3692; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field3671) {
                if (class463.field6506) {
                    var10 |= 0x2;
                }
                if (class140.field2326) {
                    var11 |= 0x8;
                }
                if (class307.field4248 != 0) {
                    if (var9 == 0 | class639.field8781) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class463.field6506) {
                var11 |= 0x7;
            }
            if (!class439.field6256) {
                var11 |= 0x20;
            }
            int[][] var12 = arg1 == null || var9 >= arg1.length ? this.field3684[var9] : arg1[var9];
            class19.method148(var9, arg0.method262(this.field3679, this.field3676, this.field3684[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(IIIZLcb;Lqe;)V", line = 2603)
    public class254(int arg0, int arg1, int arg2, boolean arg3, class521 arg4, class468 arg5) {
        this.field3671 = arg3;
        this.field3681 = arg4;
        this.field3682 = arg5;
        this.field3679 = arg1;
        this.field3692 = arg0;
        this.field3676 = arg2;
        this.field3684 = new int[this.field3692][this.field3679 + 1][this.field3676 + 1];
        this.field3670 = new byte[this.field3692][this.field3679 + 1][this.field3676 + 1];
        this.field3675 = new byte[this.field3692][this.field3679][this.field3676];
        this.field3691 = new byte[this.field3692][this.field3679][this.field3676];
        this.field3688 = new byte[this.field3692][this.field3679][this.field3676];
        this.field3685 = new byte[this.field3692][this.field3679][this.field3676];
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V", line = 2529)
    public static final void method1731(int arg0) {
        int var1 = -110 / ((arg0 + 74) / 44);
        if (class153.field2496 > 1) {
            class693.field9368.method2065((byte) 74, class693.field9368.field4460, 4);
        } else {
            class693.field9368.method2065((byte) 74, class693.field9368.field4460, 2);
        }
        field3668++;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lat;I)Lat;", line = 2553)
    public static final class378 method1732(class378 arg0, int arg1) {
        if (arg1 != 3) {
            method1731(-21);
        }
        field3672++;
        if (arg0.field5510 != -1) {
            return class60.method633(1512932720, arg0.field5510);
        }
        int var2 = arg0.field5506 >>> 16;
        class666 var3 = new class666(class323.field4473);
        for (class432 var4 = (class432) var3.method3742((byte) 123); var4 != null; var4 = (class432) var3.method3744((byte) 117)) {
            if (var4.field6181 == var2) {
                return class60.method633(1512932720, (int) var4.field5204);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIII)V", line = 2584)
    public final void method1733(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 > 50) {
            for (int var6 = 0; var6 < this.field3692; var6++) {
                this.method1723(arg4, arg1, arg0, -124, arg2, var6);
            }
            field3689++;
        }
    }
}
