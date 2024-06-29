import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class253 {

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "[I")
    private int[] field3495 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "[I")
    private int[] field3496 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public int field3490;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Lik;")
    private class197 field3473;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "Z")
    public boolean field3479;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
    public int field3501;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "Lrg;")
    private class601 field3494;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public int field3481;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "[[[B")
    private byte[][][] field3498;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "[[[B")
    public byte[][][] field3497;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "[[[B")
    private byte[][][] field3478;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "[[[B")
    private byte[][][] field3480;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "[[[B")
    private byte[][][] field3483;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "[[[I")
    public int[][][] field3489;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Z")
    public static boolean field3477 = false;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "[I")
    public static int[] field3485 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "[[[B")
    public byte[][][] field3475;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Leh;II[Led;IIIIII)V")
    public final void method1535(class335 arg0, int arg1, int arg2, class661[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3476++;
        int var11 = (arg4 & arg5) * 8;
        int var12 = (arg9 & 0x7) * 8;
        if (!this.field3479) {
            class661 var13 = arg3[arg8];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class393.method2258(var14 & 0x7, arg2, var15 & 0x7, (byte) 11) + arg6;
                    int var17 = class529.method2953(var15 & 0x7, arg2, (byte) -40, var14 & 0x7) + arg7;
                    if (var16 > 0 && (this.field3481 - 1) > var16 && var17 > 0 && (this.field3501 - 1) > var17) {
                        var13.method3714(var17, (byte) 112, var16);
                    }
                }
            }
        }
        int var18 = arg5 & 0x1FFFFFF8 << 3;
        int var19 = arg9 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg2 == 1) {
            var21 = 1;
        } else if (arg2 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg2 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field3490; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg1 == var22 && var11 <= var23 && var11 + 8 >= var23 && var24 >= var12 && var24 <= (var12 + 8)) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || (var12 + 8) == var24) {
                            if (arg2 == 0) {
                                var25 = var23 + arg6 - var11;
                                var26 = arg7 - (var12 - var24);
                            } else if (arg2 == 1) {
                                var25 = arg6 + var24 - var12;
                                var26 = arg7 + 8 - (-var11 + var23);
                            } else if (arg2 == 2) {
                                var25 = arg6 + var11 + 8 - var23;
                                var26 = var12 + arg7 + 8 - var24;
                            } else {
                                var25 = arg6 + var12 + 8 - var24;
                                var26 = -var11 - (-var23 - arg7);
                            }
                            this.method1543(0, var25, var18 + var23, arg8, var19 + var24, 0, true, var26, 0, arg0, 1);
                        } else {
                            var25 = arg6 + class393.method2258(var23 & 0x7, arg2, var24 & 0x7, (byte) 64);
                            var26 = arg7 + class529.method2953(var24 & 0x7, arg2, (byte) -40, var23 & 0x7);
                            this.method1543(var21, var25, var18 + var23, arg8, var19 + var24, var20, false, var26, arg2, arg0, 1);
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
                                    var29 = var23 == 63 ? 64 : var23;
                                    var30 = var24 == 63 ? 64 : var24;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg2 == 0) {
                                    var31 = var29 - (var11 - arg6);
                                    var32 = -var12 - (-var30 - arg7);
                                } else if (arg2 == 1) {
                                    var31 = arg6 + var30 - var12;
                                    var32 = arg7 + var11 - (var29 - 8);
                                } else if (arg2 == 2) {
                                    var31 = var11 + arg6 + 8 - var29;
                                    var32 = var12 - (var30 - arg7 - 8);
                                } else {
                                    var32 = arg7 + var29 - var11;
                                    var31 = arg6 + 8 - (var30 - var12);
                                }
                                if (var31 >= 0 && var31 < this.field3481 && var32 >= 0 && var32 < this.field3501) {
                                    this.field3489[arg8][var31][var32] = this.field3489[arg8][var25 + var20][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method1543(0, -1, 0, 0, 0, 0, false, -1, 0, arg0, 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[[IZ)V")
    public final void method1536(int arg0, int[][] arg1, boolean arg2) {
        field3474++;
        int[][] var4 = this.field3489[arg0];
        int var5 = 0;
        if (arg2) {
            return;
        }
        while ((this.field3481 + 1) > var5) {
            for (int var6 = 0; var6 < (this.field3501 + 1); var6++) {
                var4[var5][var6] += arg1[var5][var6];
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)Lih;")
    public static final class656 method1537(int arg0, int arg1) {
        field3486++;
        class656 var2 = (class656) class3.field29.method3750((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class109.field1597.method2537(false, 0, arg1);
        if (arg0 != -31164) {
            field3492 = 6;
        }
        class656 var4 = new class656();
        if (var3 != null) {
            var4.method3591(new class335(var3), arg0 ^ 0x79E5);
        }
        var4.method3588((byte) 97);
        class3.field29.method3745(1, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIII)V")
    private final void method1538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var7 = arg3; var7 < arg1 + arg3; var7++) {
            for (int var10 = arg2; var10 < arg2 + arg0; var10++) {
                if (var10 >= 0 && this.field3481 > var10 && var7 >= 0 && this.field3501 > var7) {
                    this.field3489[arg4][var10][var7] = arg4 <= 0 ? 0 : this.field3489[arg4 - 1][var10][var7] - 960;
                }
            }
        }
        field3484++;
        if (arg2 > 0 && arg2 < this.field3481) {
            for (int var8 = arg3 + 1; var8 < arg1 + arg3; var8++) {
                if (var8 >= 0 && var8 < this.field3501) {
                    this.field3489[arg4][arg2][var8] = this.field3489[arg4][arg2 - 1][var8];
                }
            }
        }
        if (arg5 != 4) {
            this.method1547(-16, -11, null, 73, 34, null, 124);
        }
        if (arg3 > 0 && arg3 < this.field3501) {
            for (int var9 = arg2 + 1; var9 < (arg0 + arg2); var9++) {
                if (var9 >= 0 && this.field3481 > var9) {
                    this.field3489[arg4][var9][arg3] = this.field3489[arg4][var9][arg3 - 1];
                }
            }
        }
        if (arg2 < 0 || arg3 < 0 || this.field3481 <= arg2 || arg3 >= this.field3501) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 > 0 && this.field3489[arg4][arg2 - 1][arg3] != 0) {
                this.field3489[arg4][arg2][arg3] = this.field3489[arg4][arg2 - 1][arg3];
                return;
            }
            if (arg3 > 0 && this.field3489[arg4][arg2][arg3 - 1] != 0) {
                this.field3489[arg4][arg2][arg3] = this.field3489[arg4][arg2][arg3 - 1];
                return;
            }
            if (arg2 > 0 && arg3 > 0 && this.field3489[arg4][arg2 - 1][arg3 - 1] != 0) {
                this.field3489[arg4][arg2][arg3] = this.field3489[arg4][arg2 - 1][arg3 - 1];
                return;
            }
        } else if (arg2 <= 0 || this.field3489[arg4][arg2 - 1][arg3] == this.field3489[arg4 - 1][arg2 - 1][arg3]) {
            if (arg3 > 0 && this.field3489[arg4 - 1][arg2][arg3 - 1] != this.field3489[arg4][arg2][arg3 - 1]) {
                this.field3489[arg4][arg2][arg3] = this.field3489[arg4][arg2][arg3 - 1];
                return;
            }
            if (arg2 > 0 && arg3 > 0 && this.field3489[arg4][arg2 - 1][arg3 - 1] != this.field3489[arg4 - 1][arg2 - 1][arg3 - 1]) {
                this.field3489[arg4][arg2][arg3] = this.field3489[arg4][arg2 - 1][arg3 - 1];
                return;
            }
            return;
        } else {
            this.field3489[arg4][arg2][arg3] = this.field3489[arg4][arg2 - 1][arg3];
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static void method1539(int arg0) {
        if (arg0 != -3674) {
            method1541(null, false);
        }
        field3485 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILhr;IBIILoa;[[B[ZLkb;I[[B[[BI)V")
    private final void method1540(int arg0, class491 arg1, int arg2, byte arg3, int arg4, int arg5, class651 arg6, byte[][] arg7, boolean[] arg8, class647 arg9, int arg10, byte[][] arg11, byte[][] arg12, int arg13) {
        if (arg3 > -125) {
            return;
        }
        field3499++;
        boolean[] var15 = arg9 != null && arg9.field8674 ? class603.field8017[arg0] : class277.field3868[arg0];
        if (arg10 > 0) {
            if (arg2 > 0) {
                int var16 = arg11[arg2 - 1][arg10 - 1] & 0xFF;
                if (var16 > 0) {
                    class647 var17 = this.field3494.method3317(var16 - 1, false);
                    if (var17.field8675 != -1 && var17.field8674) {
                        byte var18 = arg12[arg2 - 1][arg10 - 1];
                        int var19 = arg7[arg2 - 1][arg10 - 1] * 2 + 4 & 0x7;
                        int var20 = class617.method3381(var17, -1, arg6);
                        if (class685.field9636[var18][var19]) {
                            class585.field7755[0] = var17.field8675;
                            class461.field6249[0] = var20;
                            class79.field1235[0] = arg6.method396() ? var17.field8677 : var17.field8673;
                            class340.field4700[0] = var17.field8666;
                            class90.field1366[0] = var17.field8676;
                            class19.field315[0] = 256;
                        }
                    }
                }
            }
            if ((arg4 - 1) > arg2) {
                int var21 = arg11[arg2 + 1][arg10 - 1] & 0xFF;
                if (var21 > 0) {
                    class647 var22 = this.field3494.method3317(var21 - 1, false);
                    if (var22.field8675 != -1 && var22.field8674) {
                        byte var23 = arg12[arg2 + 1][arg10 - 1];
                        int var24 = arg7[arg2 + 1][arg10 - 1] * 2 + 6 & 0x7;
                        int var25 = class617.method3381(var22, -1, arg6);
                        if (class685.field9636[var23][var24]) {
                            class585.field7755[2] = var22.field8675;
                            class461.field6249[2] = var25;
                            class79.field1235[2] = arg6.method396() ? var22.field8677 : var22.field8673;
                            class340.field4700[2] = var22.field8666;
                            class90.field1366[2] = var22.field8676;
                            class19.field315[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg10 < arg13 - 1) {
            if (arg2 > 0) {
                int var26 = arg11[arg2 - 1][arg10 + 1] & 0xFF;
                if (var26 > 0) {
                    class647 var27 = this.field3494.method3317(var26 - 1, false);
                    if (var27.field8675 != -1 && var27.field8674) {
                        byte var28 = arg12[arg2 - 1][arg10 + 1];
                        int var29 = arg7[arg2 - 1][arg10 + 1] * 2 + 2 & 0x7;
                        int var30 = class617.method3381(var27, -1, arg6);
                        if (class685.field9636[var28][var29]) {
                            class585.field7755[6] = var27.field8675;
                            class461.field6249[6] = var30;
                            class79.field1235[6] = arg6.method396() ? var27.field8677 : var27.field8673;
                            class340.field4700[6] = var27.field8666;
                            class90.field1366[6] = var27.field8676;
                            class19.field315[6] = 64;
                        }
                    }
                }
            }
            if (arg2 < arg4 - 1) {
                int var31 = arg11[arg2 + 1][arg10 + 1] & 0xFF;
                if (var31 > 0) {
                    class647 var32 = this.field3494.method3317(var31 - 1, false);
                    if (var32.field8675 != -1 && var32.field8674) {
                        byte var33 = arg12[arg2 + 1][arg10 + 1];
                        int var34 = arg7[arg2 + 1][arg10 + 1] * 2 & 0x7;
                        int var35 = class617.method3381(var32, -1, arg6);
                        if (class685.field9636[var33][var34]) {
                            class585.field7755[4] = var32.field8675;
                            class461.field6249[4] = var35;
                            class79.field1235[4] = arg6.method396() ? var32.field8677 : var32.field8673;
                            class340.field4700[4] = var32.field8666;
                            class90.field1366[4] = var32.field8676;
                            class19.field315[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg10 > 0) {
            int var36 = arg11[arg2][arg10 - 1] & 0xFF;
            if (var36 > 0) {
                class647 var37 = this.field3494.method3317(var36 - 1, false);
                if (var37.field8675 != -1) {
                    byte var38 = arg12[arg2][arg10 - 1];
                    byte var39 = arg7[arg2][arg10 - 1];
                    if (var37.field8674) {
                        int var40 = 2;
                        int var41 = (var39 * 2) + 4;
                        int var42 = class617.method3381(var37, -1, arg6);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class685.field9636[var38][var41] && var37.field8676 >= class90.field1366[var40]) {
                                class585.field7755[var40] = var37.field8675;
                                class461.field6249[var40] = var42;
                                class79.field1235[var40] = arg6.method396() ? var37.field8677 : var37.field8673;
                                class340.field4700[var40] = var37.field8666;
                                if (class90.field1366[var40] == var37.field8676) {
                                    class19.field315[var40] = class220.method1393(class19.field315[var40], 32);
                                } else {
                                    class19.field315[var40] = 32;
                                }
                                class90.field1366[var40] = var37.field8676;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg5 & 0x3]) {
                            arg8[0] = class603.field8017[var38][class571.method3139(3, var39 + 2)];
                        }
                    } else if (!var15[arg5 & 0x3]) {
                        arg8[0] = class277.field3868[var38][class571.method3139(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg10 < arg13 - 1) {
            int var44 = arg11[arg2][arg10 + 1] & 0xFF;
            if (var44 > 0) {
                class647 var45 = this.field3494.method3317(var44 - 1, false);
                if (var45.field8675 != -1) {
                    byte var46 = arg12[arg2][arg10 + 1];
                    byte var47 = arg7[arg2][arg10 + 1];
                    if (var45.field8674) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class617.method3381(var45, -1, arg6);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class685.field9636[var46][var49] && var45.field8676 >= class90.field1366[var48]) {
                                class585.field7755[var48] = var45.field8675;
                                class461.field6249[var48] = var50;
                                class79.field1235[var48] = arg6.method396() ? var45.field8677 : var45.field8673;
                                class340.field4700[var48] = var45.field8666;
                                if (class90.field1366[var48] == var45.field8676) {
                                    class19.field315[var48] = class220.method1393(class19.field315[var48], 16);
                                } else {
                                    class19.field315[var48] = 16;
                                }
                                class90.field1366[var48] = var45.field8676;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg5 + 2 & 0x3]) {
                            arg8[2] = class603.field8017[var46][class571.method3139(var47, 3)];
                        }
                    } else if (!var15[arg5 + 2 & 0x3]) {
                        arg8[2] = class277.field3868[var46][class571.method3139(-(-var47), 3)];
                    }
                }
            }
        }
        if (arg2 > 0) {
            int var52 = arg11[arg2 - 1][arg10] & 0xFF;
            if (var52 > 0) {
                class647 var53 = this.field3494.method3317(var52 - 1, false);
                if (var53.field8675 != -1) {
                    byte var54 = arg12[arg2 - 1][arg10];
                    byte var55 = arg7[arg2 - 1][arg10];
                    if (var53.field8674) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class617.method3381(var53, -1, arg6);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var56 &= 0x7;
                            var57 &= 0x7;
                            if (class685.field9636[var54][var57] && var53.field8676 >= class90.field1366[var56]) {
                                class585.field7755[var56] = var53.field8675;
                                class461.field6249[var56] = var58;
                                class79.field1235[var56] = arg6.method396() ? var53.field8677 : var53.field8673;
                                class340.field4700[var56] = var53.field8666;
                                if (class90.field1366[var56] == var53.field8676) {
                                    class19.field315[var56] = class220.method1393(class19.field315[var56], 8);
                                } else {
                                    class19.field315[var56] = 8;
                                }
                                class90.field1366[var56] = var53.field8676;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg5 + 3 & 0x3]) {
                            arg8[3] = class603.field8017[var54][class571.method3139(3, var55 + 1)];
                        }
                    } else if (!var15[arg5 + 3 & 0x3]) {
                        arg8[3] = class277.field3868[var54][class571.method3139(var55 + 1, 3)];
                    }
                }
            }
        }
        if ((arg4 - 1) > arg2) {
            int var60 = arg11[arg2 + 1][arg10] & 0xFF;
            if (var60 > 0) {
                class647 var61 = this.field3494.method3317(var60 - 1, false);
                if (var61.field8675 != -1) {
                    byte var62 = arg12[arg2 + 1][arg10];
                    byte var63 = arg7[arg2 + 1][arg10];
                    if (var61.field8674) {
                        int var64 = 4;
                        int var65 = (var63 * 2) + 6;
                        int var66 = class617.method3381(var61, -1, arg6);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class685.field9636[var62][var65] && class90.field1366[var64] <= var61.field8676) {
                                class585.field7755[var64] = var61.field8675;
                                class461.field6249[var64] = var66;
                                class79.field1235[var64] = arg6.method396() ? var61.field8677 : var61.field8673;
                                class340.field4700[var64] = var61.field8666;
                                if (class90.field1366[var64] == var61.field8676) {
                                    class19.field315[var64] = class220.method1393(class19.field315[var64], 4);
                                } else {
                                    class19.field315[var64] = 4;
                                }
                                class90.field1366[var64] = var61.field8676;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg5 + 1 & 0x3]) {
                            arg8[1] = class603.field8017[var62][class571.method3139(var63 + 3, 3)];
                        }
                    } else if (!var15[arg5 + 1 & 0x3]) {
                        arg8[1] = class277.field3868[var62][class571.method3139(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg9 == null) {
            return;
        }
        int var68 = class617.method3381(arg9, -1, arg6);
        if (!arg9.field8674) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg5 * 2) & 0x7;
            if (class685.field9636[arg0][var69] && arg9.field8676 >= class90.field1366[var70]) {
                class585.field7755[var70] = arg9.field8675;
                class461.field6249[var70] = var68;
                class79.field1235[var70] = arg6.method396() ? arg9.field8677 : arg9.field8673;
                class340.field4700[var70] = arg9.field8666;
                if (class90.field1366[var70] == arg9.field8676) {
                    class19.field315[var70] = class220.method1393(class19.field315[var70], 2);
                } else {
                    class19.field315[var70] = 2;
                }
                class90.field1366[var70] = arg9.field8676;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([SZ)[S")
    public static final short[] method1541(short[] arg0, boolean arg1) {
        field3502++;
        if (!arg1) {
            method1537(-16, 105);
        }
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class83.method688(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BIIII)V")
    public final void method1542(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = 0; var6 < this.field3490; var6++) {
            this.method1538(arg2, arg4, arg3, arg1, var6, 4);
        }
        int var7 = 64 / ((arg0 - 9) / 56);
        field3491++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIZIILeh;I)V")
    private final void method1543(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, class335 arg9, int arg10) {
        if (arg10 != 1) {
            return;
        }
        if (arg8 == 1) {
            arg0 = 1;
        } else if (arg8 == 2) {
            arg0 = 1;
            arg5 = 1;
        } else if (arg8 == 3) {
            arg5 = 1;
        }
        field3470++;
        if (arg1 < 0 || arg1 >= this.field3481 || arg7 < 0 || arg7 >= this.field3501) {
            while (true) {
                int var14 = arg9.method2034(255);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg9.method2034(arg10 ^ 0xFE);
                    return;
                }
                if (var14 <= 49) {
                    arg9.method2034(255);
                }
            }
        }
        if (!this.field3479 && !arg6) {
            class477.field6362[arg3][arg1][arg7] = 0;
        }
        while (true) {
            int var12 = arg9.method2034(255);
            if (var12 == 0) {
                if (this.field3479) {
                    this.field3489[0][arg1 + arg5][arg0 + arg7] = 0;
                    return;
                } else if (arg3 == 0) {
                    this.field3489[0][arg1 + arg5][arg0 + arg7] = -class513.method2851(-25, arg4 + 556238, 932731 - -arg2) * 8 << 2;
                    return;
                } else {
                    this.field3489[arg3][arg1 + arg5][arg0 + arg7] = this.field3489[arg3 - 1][arg1 + arg5][arg7 + arg0] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg9.method2034(arg10 + 254);
                if (!this.field3479) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg3 == 0) {
                        this.field3489[0][arg1 + arg5][arg0 + arg7] = -var13 * 8 << 2;
                        return;
                    }
                    this.field3489[arg3][arg1 + arg5][arg7 + arg0] = this.field3489[arg3 - 1][arg1 + arg5][arg0 + arg7] - (var13 * 8 << 2);
                    return;
                }
                this.field3489[0][arg1 + arg5][arg7 + arg0] = var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg6) {
                    arg9.method2034(arg10 + 254);
                } else {
                    this.field3483[arg3][arg1][arg7] = arg9.method2040(class217.method1381(arg10, -97));
                    this.field3478[arg3][arg1][arg7] = (byte) ((var12 - 2) / 4);
                    this.field3480[arg3][arg1][arg7] = (byte) class571.method3139(3, arg8 + var12 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field3479 && !arg6) {
                    class477.field6362[arg3][arg1][arg7] = (byte) (var12 - 49);
                }
            } else if (!arg6) {
                this.field3498[arg3][arg1][arg7] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([Led;I[[[ILoa;)V")
    public final void method1544(class661[] arg0, int arg1, int[][][] arg2, class651 arg3) {
        if (!this.field3479) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field3481; var6++) {
                    for (int var7 = 0; var7 < this.field3501; var7++) {
                        if ((class477.field6362[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class477.field6362[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg0[var8].method3713(var6, 2097152, var7);
                            }
                        }
                    }
                }
            }
        }
        field3471++;
        if (arg1 != -7784) {
            field3472 = 76;
        }
        for (int var9 = 0; var9 < this.field3490; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field3479) {
                if (class100.field1498) {
                    var10 |= 0x2;
                }
                if (class527.field7016) {
                    var11 |= 0x8;
                }
                if (class276.field3865 != 0) {
                    if (class328.field4521 | var9 == 0) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class100.field1498) {
                var11 |= 0x7;
            }
            if (!class481.field6413) {
                var11 |= 0x20;
            }
            int[][] var12 = arg2 == null || arg2.length <= var9 ? this.field3489[var9] : arg2[var9];
            class246.method1509(var9, arg3.method402(this.field3481, this.field3501, this.field3489[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZLd;Ld;Loa;)V")
    public final void method1545(boolean arg0, class139 arg1, class139 arg2, class651 arg3) {
        field3487++;
        int[][] var5 = new int[this.field3481][this.field3501];
        if (class110.field1610 == null || class110.field1610.length != this.field3501) {
            class110.field1610 = new int[this.field3501];
            class444.field6082 = new int[this.field3501];
            class124.field2080 = new int[this.field3501];
            class149.field2384 = new int[this.field3501];
            class175.field2685 = new int[this.field3501];
        }
        for (int var6 = 0; var6 < this.field3490; var6++) {
            for (int var8 = 0; var8 < this.field3501; var8++) {
                class110.field1610[var8] = 0;
                class444.field6082[var8] = 0;
                class175.field2685[var8] = 0;
                class124.field2080[var8] = 0;
                class149.field2384[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field3481; var9++) {
                for (int var10 = 0; var10 < this.field3501; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field3481 > var19) {
                        int var20 = this.field3498[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class491 var21 = this.field3473.method1277(arg0, var20 - 1);
                            class110.field1610[var10] += var21.field6621;
                            class444.field6082[var10] += var21.field6628;
                            class175.field2685[var10] += var21.field6625;
                            class124.field2080[var10] += var21.field6623;
                            var10002 = class149.field2384[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field3498[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class491 var24 = this.field3473.method1277(arg0, var23 - 1);
                            class110.field1610[var10] -= var24.field6621;
                            class444.field6082[var10] -= var24.field6628;
                            class175.field2685[var10] -= var24.field6625;
                            class124.field2080[var10] -= var24.field6623;
                            var10002 = class149.field2384[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field3501; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field3501) {
                            var13 += class175.field2685[var17];
                            var14 += class124.field2080[var17];
                            var12 += class444.field6082[var17];
                            var15 += class149.field2384[var17];
                            var11 += class110.field1610[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var15 -= class149.field2384[var18];
                            var14 -= class124.field2080[var18];
                            var12 -= class444.field6082[var18];
                            var13 -= class175.field2685[var18];
                            var11 -= class110.field1610[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class433.method2456((byte) -117, var12 / var15, var11 * 256 / var14, var13 / var15);
                        }
                    }
                }
            }
            if (class393.field5171) {
                this.method1548(var6 == 0 ? arg1 : null, var5, var6 == 0 ? arg2 : null, var6, arg3, class218.field3099[var6], 13957);
            } else {
                this.method1546(var6 == 0 ? arg2 : null, arg0, var5, var6, arg3, class218.field3099[var6], var6 == 0 ? arg1 : null);
            }
            this.field3498[var6] = null;
            this.field3483[var6] = null;
            this.field3478[var6] = null;
            this.field3480[var6] = null;
        }
        if (!this.field3479) {
            if (class276.field3865 != 0) {
                class479.method2677();
            }
            if (class100.field1498) {
                class350.method2088();
            }
        }
        if (!arg0) {
            for (int var7 = 0; var7 < this.field3490; var7++) {
                class218.field3099[var7].method207();
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ld;Z[[IILoa;Ld;Ld;)V")
    private final void method1546(class139 arg0, boolean arg1, int[][] arg2, int arg3, class651 arg4, class139 arg5, class139 arg6) {
        if (arg1) {
            this.field3479 = false;
        }
        for (int var8 = 0; var8 < this.field3481; var8++) {
            for (int var9 = 0; var9 < this.field3501; var9++) {
                if (class97.field1468 == -1 || class37.method291(class97.field1468, var9, var8, -1, arg3)) {
                    byte var10 = this.field3478[arg3][var8][var9];
                    byte var11 = this.field3480[arg3][var8][var9];
                    int var12 = this.field3483[arg3][var8][var9] & 0xFF;
                    int var13 = this.field3498[arg3][var8][var9] & 0xFF;
                    class647 var14 = var12 == 0 ? null : this.field3494.method3317(var12 - 1, false);
                    class491 var15 = var13 == 0 ? null : this.field3473.method1277(false, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class206.field2972[var10];
                        var16 = var15 == null ? 0 : class692.field9742[var10];
                    } else if (var14 != null) {
                        var17 = class206.field2972[var10];
                    } else if (var15 != null) {
                        var16 = class206.field2972[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field8675 == -1 && var14.field8665 == -1 && var14.field8677 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg4.method396() ? var14.field8677 : var14.field8673;
                            if (class584.field7748) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field8666;
                                if (var14.field8675 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field8675;
                                }
                                if (var14.field8665 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var24 = true;
                                    var21[var19] = var14.field8665;
                                }
                                var19++;
                            }
                            if (!this.field3479 && arg3 == 0) {
                                class172.method1170(var8, var9, var14.field8671, var14.field8669 * 8, var14.field8667);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var28 = 0; var28 < var16; var28++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var29 = var15.field6619;
                            if (class584.field7748) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var22[var19] = var29;
                                var23[var19] = var15.field6627;
                                var20[var19] = arg2[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field3495.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg0 == null ? null : new int[var31];
                        int[] var35 = arg0 == null && arg6 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field3495[var36];
                            int var46 = this.field3496[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 512 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 512 - var45;
                                var33[var36] = 512 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 512 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class685.field9636[var10][var36]) {
                                int var49 = (var8 << 9) + var45;
                                int var50 = (var9 << 9) + var45;
                                var34[var36] = arg0.method200(var49, var50) - arg5.method200(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg0 != null && !class685.field9636[var10][var36]) {
                                    int var51 = (var8 << 9) + var45;
                                    int var52 = (var9 << 9) + var45;
                                    var35[var36] = arg5.method200(var51, var52) - arg0.method200(var51, var52);
                                } else if (arg6 != null && !class53.field731[var10][var36]) {
                                    int var53 = (var8 << 9) + var45;
                                    int var54 = (var9 << 9) + var45;
                                    var35[var36] = arg6.method200(var53, var54) - arg5.method200(var53, var54);
                                }
                            }
                        }
                        int var37 = arg5.method195(var8, var9);
                        int var38 = arg5.method195(var8 + 1, var9);
                        int var39 = arg5.method195(var8 + 1, var9 + 1);
                        int var40 = arg5.method195(var8, var9 + 1);
                        if (arg3 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field8679) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field3497[arg3][var8][var9] = (byte) class220.method1393(this.field3497[arg3][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field3479) {
                            var42 = class454.method2590(var8, var9);
                            var43 = class709.method3905(var8, var9);
                            var44 = class404.method2322(var8, var9);
                        }
                        arg5.method204(var8, var9, var32, var34, var33, var35, class233.field3265[var10], class543.field7162[var10], class471.field6310[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class125.method967(arg3, var8, var9);
                    }
                }
            }
        }
        field3493++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILeh;II[Led;I)V")
    public final void method1547(int arg0, int arg1, class335 arg2, int arg3, int arg4, class661[] arg5, int arg6) {
        if (!this.field3479) {
            for (int var8 = 0; var8 < 4; var8++) {
                class661 var9 = arg5[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg4 + var10;
                        int var13 = arg0 + var11;
                        if (var12 >= 0 && this.field3481 > var12 && var13 >= 0 && this.field3501 > var13) {
                            var9.method3714(var13, (byte) 62, var12);
                        }
                    }
                }
            }
        }
        field3482++;
        int var14 = arg4 + arg6;
        int var15 = arg0 + arg3;
        for (int var16 = arg1; var16 < this.field3490; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method1543(0, arg4 + var17, var14 + var17, var16, var15 + var18, 0, false, arg0 + var18, 0, arg2, arg1 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(IIIZLrg;Lik;)V")
    public class253(int arg0, int arg1, int arg2, boolean arg3, class601 arg4, class197 arg5) {
        this.field3490 = arg0;
        this.field3473 = arg5;
        this.field3479 = arg3;
        this.field3501 = arg2;
        this.field3494 = arg4;
        this.field3481 = arg1;
        this.field3498 = new byte[this.field3490][this.field3481][this.field3501];
        this.field3497 = new byte[this.field3490][this.field3481 + 1][this.field3501 + 1];
        this.field3478 = new byte[this.field3490][this.field3481][this.field3501];
        this.field3480 = new byte[this.field3490][this.field3481][this.field3501];
        this.field3483 = new byte[this.field3490][this.field3481][this.field3501];
        this.field3489 = new int[this.field3490][this.field3481 + 1][this.field3501 + 1];
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ld;[[ILd;ILoa;Ld;I)V")
    private final void method1548(class139 arg0, int[][] arg1, class139 arg2, int arg3, class651 arg4, class139 arg5, int arg6) {
        field3488++;
        byte[][] var8 = this.field3478[arg3];
        byte[][] var9 = this.field3480[arg3];
        byte[][] var10 = this.field3498[arg3];
        byte[][] var11 = this.field3483[arg3];
        int var12 = 0;
        if (arg6 != 13957) {
            return;
        }
        while (var12 < this.field3481) {
            int var13 = this.field3481 - 1 <= var12 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field3501; var14++) {
                int var15 = this.field3501 - 1 > var14 ? var14 + 1 : var14;
                if (class97.field1468 == -1 || class37.method291(class97.field1468, var14, var12, -1, arg3)) {
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
                        class647 var26 = var21 == 0 ? null : this.field3494.method3317(var21 - 1, false);
                        class491 var27 = var22 == 0 ? null : this.field3473.method1277(false, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class647 var28 = var26;
                        if (var26 != null) {
                            if (var26.field8675 == -1 && var26.field8665 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field8674;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field3481 && this.field3501 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var33 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var34 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            byte var35 = 0;
                            int var36 = var35 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var34++;
                                var32++;
                            } else {
                                var32--;
                                var34--;
                            }
                            if (var10[var13][var14] == var22) {
                                var32++;
                                var33++;
                            } else {
                                var33--;
                                var32--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var33++;
                            } else {
                                var36--;
                                var33--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var34++;
                                var36++;
                            } else {
                                var34--;
                                var36--;
                            }
                            int var37 = var34 - var33;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var32 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg5.method195(var12, var14) - arg5.method195(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg5.method195(var13, var14) - arg5.method195(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 <= var37 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class90.field1366[var39] = -1;
                            class19.field315[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field8674 ? class603.field8017[var19] : class277.field3868[var19];
                        this.method1540(var19, var27, var12, (byte) -127, this.field3481, var20, arg4, var9, var18, var26, var14, var11, var8, this.field3501);
                        boolean var41 = var26 != null && var26.field8675 != var26.field8665;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class90.field1366[var42] >= 0 && class585.field7755[var42] != class461.field6249[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class150.method1071(var18[1], class571.method3139(class19.field315[2], class19.field315[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class150.method1071(var18[3], class571.method3139(class19.field315[0], class19.field315[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class150.method1071(var18[0], class571.method3139(class19.field315[0], class19.field315[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class150.method1071(var18[2], class571.method3139(class19.field315[4], class19.field315[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var18[0] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var20 = 3;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[1] = false;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var20 = 2;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[1] = var18[2] = false;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var20 = 1;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[2] = var18[3] = false;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int[] var46;
                        int var47;
                        int var48;
                        int[] var49;
                        if (var43) {
                            var47 = var27 == null ? 0 : class692.field9742[var19];
                            var45 = class471.field6310[var19];
                            var48 = var26 == null ? 0 : class206.field2972[var19];
                            var49 = class233.field3265[var19];
                            var46 = class543.field7162[var19];
                        } else if (var17) {
                            var45 = class232.field3244[var19];
                            var46 = class58.field840[var19];
                            var47 = var27 == null ? 0 : class408.field5507[var19];
                            var48 = var26 == null ? 0 : class540.field7117[var19];
                            var44 = class350.field4799[var19];
                            var49 = class456.field6200[var19];
                        } else {
                            var49 = class334.field4590[var19];
                            var44 = class508.field6778[var19];
                            var46 = class16.field257[var19];
                            var47 = var27 == null ? 0 : class345.field4723[var19];
                            var45 = class516.field6890[var19];
                            var48 = var26 == null ? 0 : class193.field2821[var19];
                        }
                        int var50 = var47 + var48;
                        if (var50 <= 0) {
                            class125.method967(arg3, var12, var14);
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
                            int[] var60 = arg2 == null ? null : new int[var53];
                            int[] var61 = arg2 == null && arg0 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field8675;
                                var63 = arg4.method396() ? var26.field8677 : var26.field8673;
                                var64 = var26.field8666;
                                int var65 = class617.method3381(var26, -1, arg4);
                                for (int var66 = 0; var66 < var48; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class138.field2229[0] = var49[var51];
                                        class138.field2229[1] = 1;
                                        class138.field2229[2] = var45[var51];
                                        class138.field2229[3] = 1;
                                        class138.field2229[4] = var46[var51];
                                        var68 = 6;
                                        class138.field2229[5] = var45[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class138.field2229[0] = var49[var51];
                                        class138.field2229[1] = 5;
                                        class138.field2229[2] = var45[var51];
                                        class138.field2229[3] = 5;
                                        class138.field2229[4] = var46[var51];
                                        class138.field2229[5] = var45[var51];
                                        var68 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class138.field2229[0] = var49[var51];
                                        class138.field2229[1] = 3;
                                        class138.field2229[2] = var45[var51];
                                        class138.field2229[3] = 3;
                                        class138.field2229[4] = var46[var51];
                                        var68 = 6;
                                        class138.field2229[5] = var45[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class138.field2229[0] = var49[var51];
                                        class138.field2229[1] = 7;
                                        class138.field2229[2] = var45[var51];
                                        class138.field2229[3] = 7;
                                        class138.field2229[4] = var46[var51];
                                        var68 = 6;
                                        class138.field2229[5] = var45[var51];
                                    } else {
                                        class138.field2229[0] = var49[var51];
                                        class138.field2229[1] = var46[var51];
                                        class138.field2229[2] = var45[var51];
                                        var68 = 3;
                                    }
                                    var51++;
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class138.field2229[var69];
                                        int var71 = var70 - (var20 * 2) & 0x7;
                                        int var72 = this.field3495[var70];
                                        int var73 = this.field3496[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = 512 - var72;
                                            var75 = var73;
                                        } else if (var20 == 2) {
                                            var74 = 512 - var73;
                                            var75 = 512 - var72;
                                        } else if (var20 == 3) {
                                            var75 = 512 - var73;
                                            var74 = var72;
                                        } else {
                                            var74 = var73;
                                            var75 = var72;
                                        }
                                        var55[var52] = var75;
                                        var56[var52] = var74;
                                        if (var60 != null && class685.field9636[var19][var70]) {
                                            int var76 = (var12 << 9) + var75;
                                            int var77 = (var14 << 9) + var74;
                                            var60[var52] = arg2.method200(var76, var77) - arg5.method200(var76, var77);
                                        }
                                        if (var61 != null) {
                                            if (arg2 != null && !class685.field9636[var19][var70]) {
                                                int var78 = (var12 << 9) + var75;
                                                int var79 = (var14 << 9) + var74;
                                                var61[var52] = arg5.method200(var78, var79) - arg2.method200(var78, var79);
                                            } else if (arg0 != null && !class53.field731[var19][var70]) {
                                                int var80 = (var12 << 9) + var75;
                                                int var81 = (var14 << 9) + var74;
                                                var61[var52] = arg0.method200(var80, var81) - arg5.method200(var80, var81);
                                            }
                                        }
                                        if (var70 < 8 && class90.field1366[var71] > var26.field8676) {
                                            if (var54 != null) {
                                                var54[var52] = class461.field6249[var71];
                                            }
                                            var59[var52] = class340.field4700[var71];
                                            var58[var52] = class79.field1235[var71];
                                            var57[var52] = class585.field7755[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg4.method396() ? var26.field8677 : var26.field8673;
                                            var59[var52] = var26.field8666;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field3479 && arg3 == 0) {
                                    class172.method1170(var12, var14, var26.field8671, var26.field8669 * 8, var26.field8667);
                                }
                                if (var19 != 12 && var26.field8675 != -1 && var26.field8678) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class206.field2972[var19];
                            } else if (var17) {
                                var51 += class540.field7117[var19];
                            } else {
                                var51 += class193.field2821[var19];
                            }
                            if (var27 != null) {
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                class491 var82 = this.field3473.method1277(false, var22 - 1);
                                class491 var83 = this.field3473.method1277(false, var23 - 1);
                                class491 var84 = this.field3473.method1277(false, var24 - 1);
                                class491 var85 = this.field3473.method1277(false, var25 - 1);
                                for (int var86 = 0; var86 < var47; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class138.field2229[0] = var49[var51];
                                        class138.field2229[1] = 1;
                                        class138.field2229[2] = var45[var51];
                                        class138.field2229[3] = 1;
                                        class138.field2229[4] = var46[var51];
                                        var88 = 6;
                                        class138.field2229[5] = var45[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class138.field2229[0] = var49[var51];
                                        class138.field2229[1] = 5;
                                        class138.field2229[2] = var45[var51];
                                        class138.field2229[3] = 5;
                                        class138.field2229[4] = var46[var51];
                                        class138.field2229[5] = var45[var51];
                                        var88 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class138.field2229[0] = var49[var51];
                                        class138.field2229[1] = 3;
                                        class138.field2229[2] = var45[var51];
                                        class138.field2229[3] = 3;
                                        class138.field2229[4] = var46[var51];
                                        class138.field2229[5] = var45[var51];
                                        var88 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class138.field2229[0] = var49[var51];
                                        class138.field2229[1] = 7;
                                        class138.field2229[2] = var45[var51];
                                        class138.field2229[3] = 7;
                                        class138.field2229[4] = var46[var51];
                                        class138.field2229[5] = var45[var51];
                                        var88 = 6;
                                    } else {
                                        class138.field2229[0] = var49[var51];
                                        class138.field2229[1] = var46[var51];
                                        class138.field2229[2] = var45[var51];
                                        var88 = 3;
                                    }
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class138.field2229[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = this.field3495[var90];
                                        int var93 = this.field3496[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = 512 - var92;
                                            var95 = var93;
                                        } else if (var20 == 2) {
                                            var95 = 512 - var92;
                                            var94 = 512 - var93;
                                        } else if (var20 == 3) {
                                            var94 = var92;
                                            var95 = 512 - var93;
                                        } else {
                                            var95 = var92;
                                            var94 = var93;
                                        }
                                        var55[var52] = var95;
                                        var56[var52] = var94;
                                        if (var60 != null && class685.field9636[var19][var90]) {
                                            int var96 = (var12 << 9) + var95;
                                            int var97 = (var14 << 9) + var94;
                                            var60[var52] = arg2.method200(var96, var97) - arg5.method200(var96, var97);
                                        }
                                        if (var61 != null) {
                                            if (arg2 != null && !class685.field9636[var19][var90]) {
                                                int var98 = (var12 << 9) + var95;
                                                int var99 = (var14 << 9) + var94;
                                                var61[var52] = arg5.method200(var98, var99) - arg2.method200(var98, var99);
                                            } else if (arg0 != null && !class53.field731[var19][var90]) {
                                                int var100 = (var12 << 9) + var95;
                                                int var101 = (var14 << 9) + var94;
                                                var61[var52] = arg0.method200(var100, var101) - arg5.method200(var100, var101);
                                            }
                                        }
                                        if (var90 < 8 && class90.field1366[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class461.field6249[var91];
                                            }
                                            var59[var52] = class340.field4700[var91];
                                            var58[var52] = class79.field1235[var91];
                                            var57[var52] = class585.field7755[var91];
                                        } else {
                                            if (var17 && class685.field9636[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var95 == 0 && var94 == 0) {
                                                var57[var52] = arg1[var12][var14];
                                                var58[var52] = var82.field6619;
                                                var59[var52] = var82.field6627;
                                            } else if (var95 == 0 && var94 == 512) {
                                                var57[var52] = arg1[var12][var15];
                                                var58[var52] = var83.field6619;
                                                var59[var52] = var83.field6627;
                                            } else if (var95 == 512 && var94 == 512) {
                                                var57[var52] = arg1[var13][var15];
                                                var58[var52] = var84.field6619;
                                                var59[var52] = var84.field6627;
                                            } else if (var95 == 512 && var94 == 0) {
                                                var57[var52] = arg1[var13][var14];
                                                var58[var52] = var85.field6619;
                                                var59[var52] = var85.field6627;
                                            } else {
                                                if (var95 < 256) {
                                                    if (var94 >= 256) {
                                                        var58[var52] = var83.field6619;
                                                        var59[var52] = var83.field6627;
                                                    } else {
                                                        var58[var52] = var82.field6619;
                                                        var59[var52] = var82.field6627;
                                                    }
                                                } else if (var94 < 256) {
                                                    var58[var52] = var85.field6619;
                                                    var59[var52] = var85.field6627;
                                                } else {
                                                    var58[var52] = var84.field6619;
                                                    var59[var52] = var84.field6627;
                                                }
                                                int var102 = class214.method1371(var95 << 7 >> 9, 99, arg1[var13][var14], arg1[var12][var14]);
                                                int var103 = class214.method1371(var95 << 7 >> 9, arg6 ^ 0x36F9, arg1[var13][var15], arg1[var12][var15]);
                                                var57[var52] = class214.method1371(var94 << 7 >> 9, 106, var103, var102);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field6616) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg5.method195(var12, var14);
                            int var105 = arg5.method195(var13, var14);
                            int var106 = arg5.method195(var13, var15);
                            int var107 = arg5.method195(var12, var15);
                            if (arg3 > 0) {
                                boolean var108 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var108 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field8679) {
                                    var108 = false;
                                }
                                if (var108 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field3497[arg3][var12][var14] = (byte) class220.method1393(this.field3497[arg3][var12][var14], 4);
                                }
                            }
                            int var109 = 0;
                            int var110 = 0;
                            int var111 = 0;
                            if (this.field3479) {
                                var109 = class454.method2590(var12, var14);
                                var110 = class709.method3905(var12, var14);
                                var111 = class404.method2322(var12, var14);
                            }
                            arg5.method194(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var109, var110, var111, var16);
                            class125.method967(arg3, var12, var14);
                        }
                    }
                }
            }
            var12++;
        }
    }
}
